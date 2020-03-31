#!/system/bin/sh

# We need a dhcp server for our wifi network, but not a dns resolver. It will uses the
# servers configured on eth1.
/system/bin/dnsmasq --keep-in-foreground --no-poll --no-resolv --port=0 --except-interface=eth1 --dhcp-range=192.168.232.2,192.168.239.254,255.255.248.0 --dhcp-option=3,192.168.232.1 --dhcp-option=6,`getprop net.eth1.dns1`,`getprop net.eth1.dns2`

