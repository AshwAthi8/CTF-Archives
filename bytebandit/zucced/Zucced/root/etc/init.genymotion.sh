#!/system/bin/sh

unset LD_PRELOAD

die() {
    echo $@ >&2
    exit 1
}

# API level: https://source.android.com/setup/build-numbers#platform-code-names-versions-api-levels-and-ndk-releases
ANDROID_4_1=16
ANDROID_4_2=17
ANDROID_4_3=18
ANDROID_4_4=19
ANDROID_5_0=21
ANDROID_5_1=22
ANDROID_6_0=23
ANDROID_7_0=24
ANDROID_7_1=25
ANDROID_8_0=26
ANDROID_8_1=27
ANDROID_9_0=28
ANDROID_MAX_VERSION=9999

CURRENT_ANDROID=$(getprop ro.build.version.sdk)

CURRENT_PRODUCT=$(getprop ro.build.product undefined)
is_genymotion_cloud_product() {
    [ "$CURRENT_PRODUCT" == "cloud" ]
}

is_genymotion_desktop_product() {
    [ "$CURRENT_PRODUCT" == "vbox86p" -o "$CURRENT_PRODUCT" == "vbox86t" -o "$CURRENT_PRODUCT" == "vbox86tp" ]
}


##
# init vfb kernel module with default gralloc.
# first argument is resolution (ex:1024x600-32) and second one is dpi (ex: 640)
##
init_vfb() {
    setprop ro.hardware.gralloc default
    # Enforce swiftshader if opengl property is not set
    _egl=$(getprop persist.god.egl)
    if [ -z "$_egl" ]; then
        setprop persist.god.egl swiftshader
    fi
    insmod /system/lib/vfb.ko mode_option=$1 dpi=$2 videomemorysize=67108864 vfb_enable=1
}

##
# Init specific network rules for cloud device
# first argument is resolution (ex:1024x600-32) and second one is dpi (ex: 640)
##
init_cloud_display() {
    _graph_mode=$1
    _dpi=$2
    _force_vfb=$(getprop ro.debug.force_vfb)
    if [ "$_force_vfb" == "1" ];
    then
        init_vfb $_graph_mode $_dpi
    else
        #Try to detect nvidia card first
        insmod /system/lib/ttm.ko
        insmod /system/lib/nouveau.ko config="NvMSI=0"
        case "$(cat /proc/fb | head -1)" in
            0*inteldrmfb|0*radeondrmfb|0*nouveaufb|0*svgadrmfb)
                for i in $(grep -i nvkm  /proc/interrupts | awk -F: '{print $1}'); do echo "0002" > /proc/irq/$i/smp_affinity; done
                setprop ro.hardware.gralloc drm
                ;;
            "")
                init_vfb $_graph_mode $_dpi
                ;;
        esac
    fi
    setprop ro.kernel.qemu 1
    setprop ro.kernel.qemu.gles 1
}

##
# Init specific cloud networking using main IP address as argument
##
init_desktop_networking () {
    android_range $ANDROID_4_1 $ANDROID_5_1 && /system/bin/netcfg eth0 up
    android_range $ANDROID_6_0 $ANDROID_MAX_VERSION && /system/bin/ip link set up eth0
    CARRIER=$(cat /sys/class/net/eth0/carrier)
    echo -n "Waiting for eth0 link." > /dev/tty0
    while [ $CARRIER -ne 1 ]
    do
        echo -n "." > /dev/tty0
        sleep 1
        CARRIER=$(cat /sys/class/net/eth0/carrier)
    done
    echo "." > /dev/tty0

    android_range $ANDROID_4_1 $ANDROID_5_1 && /system/bin/netcfg eth0 dhcp
    android_range $ANDROID_6_0 $ANDROID_MAX_VERSION && /system/bin/dhcptool eth0

    IPMGMT=$(ip -o -4 addr list eth0 | awk '{print $4}' | cut -d/ -f1)
    external_property set androvm_ip_management $IPMGMT
    echo "IP Management : $IPMGMT" > /dev/tty0
}

init_cloud_networking() {
    # Beginning of the Cloud networking sequence is the same as desktop
    init_desktop_networking

    # create virtual wifi interface wlan0 on eth0
    ip link add link eth0 wlan0 type ipvlan
    # add NAT redirection
    iptables -w -t nat -A POSTROUTING -j SNAT -o wlan0 --to $IPMGMT
    if [ $? -ne 0 ]; then
        echo "Failed to insert NAT rule" > /dev/tty0
    fi
    # Create a port redirection for HTTPS server than listen on port 8443
    iptables -w -t nat -A PREROUTING -i eth0 -p tcp --dport 443 -j REDIRECT --to-port 6443
    if [ $? -ne 0 ]; then
        echo "Failed to insert PORT redirect rule" > /dev/tty0
    fi
}

# Starting from 8.0, networking init is different
init_cloud_networking_8() {
    NAMESPACE="genymotion"

    # Create "genymotion" network namespace
    # Handle <9.0 versions here: wifi namespace is handle differently
    if [ -e /vendor/bin/createns ]; then
        rm -rf /data/vendor/var/run/netns/${NAMESPACE}*
        /vendor/bin/createns ${NAMESPACE}
    else
        rm -rf /var/run/netns/${NAMESPACE}
        ip netns add ${NAMESPACE}
    fi

    # Rename default eth0 to eth1
    ip link set eth0 name eth1 > /dev/tty0

    # Move eth1 to "genymotion" namespace
    ip link set eth1 netns ${NAMESPACE} > /dev/tty0

    # Create a virtual interface between main and genymotion namespace
    # On main namespace, all our code expects the interface to be called eth0
    ip link add eth0 type veth peer name eth0-peer > /dev/tty0

    # Move eth0-peer to "genymotion" namespace
    ip link set eth0-peer netns ${NAMESPACE} > /dev/tty0
 
    # Prepare eth0 interface
    ip link set up eth0 > /dev/tty0
    ip addr add 192.168.230.2/30 dev eth0 > /dev/tty0
    ip route add default via 192.168.230.1 > /dev/tty0

    # Prepare eth0-peer interface
    execns ${NAMESPACE} ip link set up eth0-peer > /dev/tty0
    execns ${NAMESPACE} ip addr add 192.168.230.1/30 dev eth0-peer > /dev/tty0

    # Set up eth1 and launch dhcp tool to get an IP from the Cloud
    execns ${NAMESPACE} /system/bin/ip link set up eth1 > /dev/tty0

    # Wait for carrier
    CARRIER=$(execns genymotion cat /sys/class/net/eth1/carrier)
    echo -n "Waiting for eth1 link." > /dev/tty0
    while [ $CARRIER -ne 1 ]
    do
        echo -n "." > /dev/tty0
        sleep 1
        CARRIER=$(execns genymotion cat /sys/class/net/eth1/carrier)
    done
    echo "." > /dev/tty0

    execns ${NAMESPACE} dhcptool eth1 > /dev/tty0

    # Wifi configuration
    iw phy phy1 set netns name ${NAMESPACE} > /dev/tty0
    execns ${NAMESPACE} ip addr add 192.168.232.1/24 dev wlan1 > /dev/tty0

    # NAT eth0-peer and wlan1 traffic to eth0 in "genymotion" namespace
    execns ${NAMESPACE} sysctl -wq net.ipv4.ip_forward=1 > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A POSTROUTING -s 192.168.230.0/30 -o eth1 -j MASQUERADE > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A POSTROUTING -s 192.168.232.0/30 -o eth1 -j MASQUERADE > /dev/tty0

    # DNAT port used by Genymotion code to eth0 interface
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 -p tcp --dport   22 -j DNAT --to-destination 192.168.230.2 > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 -p tcp --dport   80 -j DNAT --to-destination 192.168.230.2 > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 -p tcp --dport  443 -j DNAT --to-destination 192.168.230.2:6443 > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 -p tcp --dport 6443 -j DNAT --to-destination 192.168.230.2 > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 -p tcp --dport 5555 -j DNAT --to-destination 192.168.230.2 > /dev/tty0
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 --dport 51000-51100 -j DNAT --to-destination 192.168.230.2 > /dev/tty0

    # DNAT the others ports to the Wifi interface
    execns ${NAMESPACE} iptables -w -W 50000 -t nat -A PREROUTING -i eth1 -j DNAT --to-destination 192.168.232.2 > /dev/tty0

    IPMGMT=$(execns genymotion ip -o -4 addr list eth1 | awk '{print $4}' | cut -d/ -f1)
    echo "IP Management : $IPMGMT" > /dev/tty0
}

external_property() {
    is_genymotion_cloud_product || /system/bin/androVM-prop $@
}

##
# android_range $ANDROID_5_0 $ANDROID_7_0
# return true if the current android version is ANDROID_5_0, ANDROID_6_0 or ANDROID_7_0
##
android_range() {
    lower=$1
    higher=$2

    [[ $CURRENT_ANDROID -ge $lower ]] && [[ $CURRENT_ANDROID -le $higher ]]
}

##
# android_range $ANDROID_4_1 $ANDROID_7_0 "foo" $ANDROID_7_1 $ANDROID_8_0 "bar"
# return "foo" for version 4.1 to 7.0 and "bar" for version 7.1 and 8.0
##
android_range_var() {
    while [[ $# -gt 0 ]]
    do
        lower=$1; shift
        higher=$1; shift
        var=$1; shift
        if android_range $lower $higher; then
            echo $var
            return
        fi
    done
    die "android version not found"
}

mount_sdcard() {
    vbox_sdcard_drive="/dev/block/sdc"
    prop_vbox_sdcard_drive=$(external_property get vbox_sdcard_drive)

    mountpoint=$(android_range_var ANDROID_4_1 ANDROID_4_1 "/mnt/sdcard" \
                                   ANDROID_4_2 ANDROID_4_3 "/mnt/shell/emulated")

    if [ -n "$prop_vbox_sdcard_drive" ]; then
        vbox_sdcard_drive="$prop_vbox_sdcard_drive"
        setprop androVM.vbox_sdcard_drive "$prop_vbox_sdcard_drive"
    fi

    if [ -b $vbox_sdcard_drive ]; then
        echo "Trying to mount $vbox_sdcard_drive" > /dev/tty0
        mount -t vfat -o fmask=0000,dmask=0000 $vbox_sdcard_drive $mountpoint
        if [ $? -ne 0 ]; then
            echo "Unable to mount $vbox_sdcard_drive, try to create FAT" > /dev/tty0
            newfs_msdos $vbox_sdcard_drive
            mount -t vfat -o fmask=0000,dmask=0000 $vbox_sdcard_drive $mountpoint
            if [ $? -ne 0 ]; then
                echo "Unable to create FAT" > /dev/tty0
            fi
        fi
    else
        echo "NO SDCARD" > /dev/tty0
    fi
}

armabi_legacy() {
    abi2_set=$(getprop ro.product.cpu.abi2)
    if [ ! $abi2_set ]; then
        if [ -f /system/lib/libhoudini.so ]; then
            setprop ro.product.cpu.abi2 armeabi-v7a
        fi
    fi
    if [ -f /system/lib/libhoudini.so ]; then
        setprop dalvik.vm.houdini on
    fi
}

armabi() {
    _abilist=x86
    is_genymotion_cloud_product && _abilist=x86_64,x86

    # ARM applications
    if [ -f /system/lib/libhoudini.so ]; then
        # Allow installation of ARM apps
        setprop ro.product.cpu.abi2 armeabi-v7a
        setprop ro.product.cpu.abilist $_abilist,armeabi-v7a,armeabi
        setprop ro.product.cpu.abilist32 x86,armeabi-v7a,armeabi
        # Enable native bridge for ARM apps
        setprop ro.dalvik.vm.isa.arm x86
        setprop ro.dalvik.vm.native.bridge libhoudini.so
    else
        setprop ro.dalvik.vm.native.bridge 0
        setprop ro.product.cpu.abilist $_abilist
        setprop ro.product.cpu.abilist32 x86
    fi

    # ARM executables
    if [ -f /system/bin/houdini ]; then
        # Enable execution of ARM executables
        setprop ro.enable.native.bridge.exec 1
        mount -t binfmt_misc binfmt_misc /proc/sys/fs/binfmt_misc
        cp /system/etc/binfmt_misc/arm_exe /proc/sys/fs/binfmt_misc/register
        cp /system/etc/binfmt_misc/arm_dyn /proc/sys/fs/binfmt_misc/register
    fi
}

load_kernel_modules() {
    insmod /system/lib/cfbcopyarea.ko
    insmod /system/lib/cfbfillrect.ko
    insmod /system/lib/cfbimgblt.ko
    insmod /system/lib/uvesafb.ko mode_option=$vbox_graph_mode scroll=redraw
}

vbox_graph_mode="800x600-16"
is_genymotion_cloud_product && vbox_graph_mode="600x1024-32"
vbox_dpi="160"

# Disable cursor blinking - Thanks android-x86 :-)
echo -e '\033[?17;0;0c' > /dev/tty0

prop_hardware_opengl=$(external_property get hardware_opengl)

# Init Cloud networking
is_genymotion_desktop_product && init_desktop_networking
is_genymotion_cloud_product && android_range $ANDROID_4_1 $ANDROID_7_1 && init_cloud_networking
is_genymotion_cloud_product && android_range $ANDROID_8_0 $ANDROID_MAX_VERSION && init_cloud_networking_8

# Load parameters from virtualbox guest properties

prop_vbox_graph_mode=$(external_property get vbox_graph_mode)
is_genymotion_cloud_product && prop_vbox_graph_mode=$(getprop persist.graph_mode)
if [ -n "$prop_vbox_graph_mode" ]; then
    vbox_graph_mode="$prop_vbox_graph_mode"
    setprop androVM.vbox_graph_mode "$prop_vbox_graph_mode"
else
    is_genymotion_cloud_product && setprop persist.graph_mode "$vbox_graph_mode"
fi

prop_vbox_dpi=$(external_property get vbox_dpi)
is_genymotion_cloud_product && prop_vbox_dpi=$(getprop persist.dpi)
if [ -n "$prop_vbox_dpi" ]; then
    vbox_dpi="$prop_vbox_dpi"
    setprop androVM.vbox_dpi "$prop_vbox_dpi"
fi

prop_vkeyboard_mode=$(external_property get vkeyboard_mode)
if [ -n "$prop_vkeyboard_mode" ]; then
    vkeyboard_mode="$prop_vkeyboard_mode"
    setprop genymotion.keyboard_mode "$prop_vkeyboard_mode"
fi

prop_force_navbar=$(external_property get genymotion_force_navbar)
if [ -n "$prop_force_navbar" -a "$prop_force_navbar" == "1" ]; then
    # No hw buttons => add virtual navbar
    setprop qemu.hw.mainkeys 0
fi

prop_su_bypass=$(external_property get su_bypass)
if [ $prop_su_bypass ]; then
    setprop genyd.su.bypass 1
fi

prop_player_version=$(external_property get genymotion_player_version)
if [ -n "$prop_player_version" ]; then
    setprop ro.genymotion.player.version "$prop_player_version"
fi

prop_device_version=$(getprop ro.genymotion.device.version)
if [ -n "$prop_device_version" ]; then
    external_property set genymotion_device_version $prop_device_version
fi

# Setting Device Id system properties from VirtualBox properties
prop_device_id=$(external_property get genymotion_device_id)
if [ $? -ne 0 ]; then
    # Default value if unset
    setprop genymotion.device.id "00000000000000"
else
    # Set user defined value. "[none]" keyword means empty value
    setprop genymotion.device.id "$prop_device_id"
fi

if is_genymotion_cloud_product; then
    init_cloud_display $vbox_graph_mode $vbox_dpi
else
    android_range $ANDROID_4_1 $ANDROID_4_4 && load_kernel_modules
fi

setprop ro.sf.lcd_density $vbox_dpi
# this one is used by new goldfish-opengl libs and CTS
setprop qemu.sf.lcd_density $vbox_dpi

gles_prop=$(android_range_var $ANDROID_4_1 $ANDROID_4_4 "androVM.gles" \
                              $ANDROID_5_0 $ANDROID_MAX_VERSION "ro.kernel.qemu")

glesrenderer_prop=$(android_range_var $ANDROID_4_1 $ANDROID_4_4 "androVM.gles.renderer" \
                                      $ANDROID_5_0 $ANDROID_MAX_VERSION "ro.kernel.qemu.gles")


if [ $prop_hardware_opengl ]; then
    if [ $IPMGMT ]; then
        setprop $gles_prop 1
        prop_hardware_opengl_disable_render=$(external_property get hardware_opengl_disable_render)
        if [ -z "$prop_hardware_opengl_disable_render" -o "$prop_hardware_opengl_disable_render" != "1" ]; then
            setprop $glesrenderer_prop 1
            android_range $ANDROID_7_0 $ANDROID_MAX_VERSION && setprop qemu.gles 1
        fi
    else
        echo "eth0 is not configured correctly - HARDWARE OPENGL IS DISABLED !!!"  > /dev/tty0
        sleep 10
    fi
fi

android_range $ANDROID_4_1 $ANDROID_4_3 && mount_sdcard

android_range $ANDROID_4_1 $ANDROID_4_4 && armabi_legacy
android_range $ANDROID_5_0 $ANDROID_MAX_VERSION && armabi

# Set Wifi MAC address
if is_genymotion_cloud_product; then
    setprop wifi.interface.mac $(cat /sys/class/net/wlan0/address)
else
    setprop wifi.interface.mac $(cat /sys/class/net/eth1/address)
fi

# Update system versions
android_version=$(getprop ro.build.version.release)
genymotion_version=$(getprop ro.genymotion.version)
external_property set android_version "$android_version"
external_property set genymotion_version "$genymotion_version"

# Add platform guestproperty and Android property
genymotion_platform=$(external_property get genymotion_platform)
if [ -z "$genymotion_platform" ]; then
    genymotion_product_name=$(getprop ro.product.name.geny-def)
    if [ "$genymotion_product_name" == "vbox86tp" ]; then
        genymotion_platform="tp"
    elif [ "$genymotion_product_name" == "vbox86t" ]; then
        genymotion_platform="t"
    elif [ "$genymotion_product_name" == "vbox86p" ]; then
        genymotion_platform="p"
    else
        genymotion_platform="unknown"
    fi
    external_property set genymotion_platform "$genymotion_platform"
fi
setprop ro.genymotion.platform "$genymotion_platform"

# Set ro.build.characteristics at boot
if [ $genymotion_platform == "p" ]; then
    characteristics=$(android_range_var $ANDROID_4_1 $ANDROID_5_1 "default" \
                                        $ANDROID_6_0 $ANDROID_MAX_VERSION "nosdcard")
else
    characteristics=$(android_range_var $ANDROID_4_1 $ANDROID_5_1 "tablet" \
                                        $ANDROID_6_0 $ANDROID_MAX_VERSION "tablet nosdcard")
fi
setprop ro.build.characteristics "$characteristics"

# We want to allow user to override values of android ro.* properties (read-only)
# So we first check the value of a guest_property for this property
# If it set, we use it as the android property
# If not, we use the default value, that we mirrored before in a shadow_property
set_prop_from_guest_property() {
    local android_property="$1"
    local shadow_property="$2"
    local guest_property="$3"
    local value=$(external_property get $guest_property)
    if [[ -z "$value" ]] && [[ -n "$shadow_property" ]] ; then
        value=$(getprop $shadow_property)
        external_property set $guest_property "$value"
    fi
    setprop $android_property "$value"
}

set_prop_from_guest_property "ro.product.name" "ro.product.name.geny-def" "product_name"
set_prop_from_guest_property "ro.product.manufacturer" "ro.manufacturer.geny-def" "product_manufacturer"
set_prop_from_guest_property "ro.product.device" "ro.product.device.geny-def" "product_device"
set_prop_from_guest_property "ro.product.board" "ro.product.board.geny-def" "product_board"
set_prop_from_guest_property "ro.product.brand" "ro.product.brand.geny-def" "product_brand"
set_prop_from_guest_property "ro.build.display.id" "ro.build.display.id.geny-def" "build_display_id"
set_prop_from_guest_property "ro.serialno" "" "serialno"
set_prop_from_guest_property "ro.build.type" "ro.build.type.geny-def" "build_type"
set_prop_from_guest_property "ro.build.fingerprint" "ro.build.fingerprint.geny-def" "build_fingerprint"
set_prop_from_guest_property "ro.build.tags" "ro.build.tags.geny-def" "build_tags"

# Set ro.product.model
# ro.product.model is different from the other ro.product.* properties
# The value of ro.product.model is based on, by priority :
# - The vm property product_model, used to override the product model (done by the user)
# - The vm property genymotion_vm_name, which is set by the Genymotion Player before the first boot
# - The value ro.genymotion.product.model we stored in /system/build.prop,
#   that shadows the value of ro.product.model set during the build
product_model=$(external_property get product_model)
if [ -z "$product_model" ]; then
    product_model=$(external_property get genymotion_vm_name)
    if [ -z "$product_model" ]; then
        product_model=$(getprop ro.product.model.geny-def)
    fi
    external_property set product_model "$product_model"
fi
setprop ro.product.model "$product_model"

# Camera
prop_camera=$(external_property get genymotion_camera)
if [ -n "$prop_camera" ]; then
    setprop ro.genymotion.cameras "$prop_camera"
fi

# We are done
setprop androVM.inited 1
