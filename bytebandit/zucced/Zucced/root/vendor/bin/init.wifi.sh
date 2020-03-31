#!/system/bin/sh

# Do all the setup required for WiFi.
# The kernel driver mac80211_hwsim has already created two virtual wifi devices
# us. These devices are connected so that everything that's sent on one device
# is recieved on the other and vice versa. This allows us to create a fake
# WiFi network with an access point running inside the guest. Here is the setup
# for that and the basics of how it works.
#
# Create a namespace named router and move eth1 to it. Create a virtual ethernet
# pair of devices and move both one virtual ethernet interface and one virtual
# wifi interface into the router namespace. Then set up NAT networking for those
# interfaces so that traffic flowing through them reach eth1 and eventually the
# host and the internet. The main network namespace will now only see the other
# ends of those pipes and send traffic on them depending on if WiFi or radio is
# used.  Finally run hostapd in the network namespace to create an access point
# for the guest to connect to and dnsmasq to serve as a DHCP server for the WiFi
# connection.
#
#          main namespace                     router namespace
#       -------       ----------   |    ---------------
#       | ril |<----->| radio0 |<--+--->| radio0-peer |<-+
#       -------       ----------   |    ---------------  |
#                                  |        ^            |
#                                  |        |            |
#                                  |        v            v
#                                  |  *************   -------    --------
#                                  |  * ipv6proxy *   | br0 |<-->| eth1 |<--+
#                                  |  *************   -------    --------   |
#                                  |         ^           ^                  |
#                                  |         |           |                  |
#                                  |         v           |                  |
# ------------------   ---------   |        ---------    |                  |
# | wpa_supplicant |<->| wlan0 |<--+------->| wlan1 |<---+                  |
# ------------------   ---------   |        ---------                       |
#                                  |         ^                              |
#                                  |         |                              v
#                                  |         v                          --------
#                                  |    ***********                     | host |
#                                  |    * hostapd *                     --------
#                                  |    ***********                    DHCP server
#

NAMESPACE="router"
rm -rf /var/run/netns/${NAMESPACE}
rm -rf /var/run/wifi.pid

# Create the namespace
/system/bin/ip netns add ${NAMESPACE}
/system/bin/ip link set eth1 netns ${NAMESPACE}
/system/bin/ip link add radio0 type veth peer name radio0-peer
/system/bin/ip link set radio0-peer netns ${NAMESPACE}

# MAC address provided by Vbox is on eth1, we should apply it to wlan0
# eth1 will take an arbitrary mac address (anyway eth1 is never used directly to send packets)
# Since setting the MAC address configured on eth1 is resilient to reboot,
# we use a persist. prop to not loose it with a reboot command.

MAC_PROPERTY="persist.geny.wlan0.mac"
ETH1_FAKE_MAC="02:00:00:44:55:66"

WLAN_MAC=$(cat /sys/class/net/eth1/address)

# Make sure that if eth1 MAC address is the fake one, we get the one we saved previously
if [ ${WLAN_MAC} == ${ETH1_FAKE_MAC} ]; then
    WLAN_MAC=$(getprop ${MAC_PROPERTY})
else
    setprop ${MAC_PROPERTY} ${WLAN_MAC}
fi
/system/bin/ip link set dev wlan0 address ${WLAN_MAC}
/system/bin/ip link set dev eth1 address ${ETH1_FAKE_MAC}

# Enable privacy addresses for radio0, this is done by the framework for wlan0
sysctl -wq net.ipv6.conf.radio0.use_tempaddr=2
/system/bin/ip addr add 192.168.200.2/24 broadcast 192.168.200.255 dev radio0
/vendor/bin/execns ${NAMESPACE} /system/bin/ip addr add 192.168.200.1/24 dev radio0-peer
/vendor/bin/execns ${NAMESPACE} sysctl -wq net.ipv6.conf.all.forwarding=1
/vendor/bin/execns ${NAMESPACE} /system/bin/ip link set radio0-peer up

# Create iptables entries. -w will cause an indefinite wait for the exclusive
# lock. Without this flag iptables can sporadically fail if something else is
# modifying the iptables at the same time. -W indicates the number of micro-
# seconds between each retry. The default is one second which seems like a long
# time. Keep this short so we don't slow down startup too much.
/vendor/bin/execns ${NAMESPACE} /system/bin/iptables -w -W 50000 -t nat -A POSTROUTING -s 192.168.200.0/24 -o eth1 -j MASQUERADE

# Enable eth1 interface
/vendor/bin/execns ${NAMESPACE} /system/bin/ip link set eth1 up

# Enable wlan1 interface 
/system/bin/iw phy phy1 set netns name ${NAMESPACE}
/vendor/bin/execns ${NAMESPACE} /system/bin/ip link set wlan1 up

# Start the IPv6 proxy that will enable use of IPv6 in the main namespace
setprop ctl.start ipv6proxy
execns ${NAMESPACE} sysctl -wq net.ipv4.ip_forward=1

# Start hostapd, the access point software
setprop ctl.start emu_hostapd
/system/bin/ip link set radio0 up

# Create the bridge on the namespace
/vendor/bin/execns ${NAMESPACE} ip link add name br0 type bridge 
/vendor/bin/execns ${NAMESPACE} ip link set br0 up
/vendor/bin/execns ${NAMESPACE} ip link set eth1 master br0
/vendor/bin/execns ${NAMESPACE} ip link set wlan1 master br0

