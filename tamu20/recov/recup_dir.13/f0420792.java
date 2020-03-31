aytime            13/udp
qotd               17/tcp    quote                  #Quote of the day
qotd               17/udp    quote                  #Quote of the day
chargen            19/tcp    ttytst source          #Character generator
chargen            19/udp    ttytst source          #Character generator
ftp-data           20/tcp                           #FTP, data
ftp                21/tcp                           #FTP. control
ssh                22/tcp                           #SSH Remote Login Protocol
telnet             23/tcp
smtp               25/tcp    mail                   #Simple Mail Transfer Protocol
time               37/tcp    timserver
time               37/udp    timserver
rlp                39/udp    resource               #Resource Location Protocol
nameserver         42/tcp    name                   #Host Name Server
nameserver         42/udp    name                   #Host Name Server
nicname            43/tcp    whois
domain             53/tcp                           #Domain Name Server
domain             53/udp                           #Domain Name Server
bootps             67/udp    dhcps                  #Bootstrap Protocol Server
bootpc             68/udp    dhcpc                  #Bootstrap Protocol Client
tftp               69/udp                           #Trivial File Transfer
gopher             70/tcp
finger             79/tcp
http               80/tcp    www www-http           #World Wide Web
hosts2-ns          81/tcp                           #HOSTS2 Name Server
hosts2-ns          81/udp                           #HOSTS2 Name Server
kerberos           88/tcp    krb5 kerberos-sec      #Kerberos
kerberos           88/udp    krb5 kerberos-sec      #Kerberos
hostname          101/tcp    hostnames              #NIC Host Name Server
iso-tsap          102/tcp                           #ISO-TSAP Class 0
rtelnet           107/tcp                           #Remote Telnet Service
pop2              109/tcp    postoffice             #Post Office Protocol - Version 2
pop3              110/tcp                           #Post Office Protocol - Version 3
sunrpc            111/tcp    rpcbind portmap        #SUN Remote Procedure Call
sunrpc            111/udp    rpcbind portmap        #SUN Remote Procedure Call
auth              113/tcp    ident tap              #Identification Protocol
uucp-path         117/tcp
sqlserv           118/tcp                           #SQL Services
nntp              119/tcp    usenet                 #Network News Transfer Protocol
ntp               123/udp                           #Network Time Protocol
epmap             135/tcp    loc-srv                #DCE endpoint resolution
epmap             135/udp    loc-srv                #DCE endpoint resolution
netbios-ns        137/tcp    nbname                 #NETBIOS Name Service
netbios-ns        137/udp    nbname                 #NETBIOS Name Service
netbios-dgm       138/udp    nbdatagram             #NETBIOS Datagram Service
netbios-ssn       139/tcp    nbsession              #NETBIOS Session Service
imap              143/tcp    imap4                  #Internet Message Access Protocol
sql-net           150/tcp
sqlsrv            156/tcp
pcmail-srv        158/tcp                           #PCMail Server
snmp              161/udp                           #SNMP
snmptrap          162/udp    snmp-trap              #SNMP trap
print-srv         170/tcp                           #Network PostScript
bgp               179/tcp                           #Border Gateway Protocol
irc               194/tcp                           #Internet Relay Chat Protocol        
ipx               213/udp                           #IPX over IP
rtsps             322/tcp
rtsps             322/udp
mftp              349/tcp
mftp              349/udp
ldap              389/tcp                           #Lightweight Directory Access Protocol
https             443/tcp    MCom                   #HTTP over TLS/SSL
https             443/udp    MCom                   #HTTP over TLS/SSL
microsoft-ds      445/tcp
microsoft-ds      445/udp
kpasswd           464/tcp                           # Kerberos (v5)
kpasswd           464/udp                           # Kerberos (v5)
isakmp            500/udp    ike                    #Internet Key Exchange
crs               507/tcp                           #Content Replication System
crs               507/udp                           #Content Replication System
exec              512/tcp                           #Remote Process Execution
biff              512/udp    comsat
login             513/tcp                           #Remote Login
who               513/udp    whod
cmd               514/tcp    shell
syslog            514/udp
printer           515/tcp    spooler
talk              517/udp
ntalk             518/udp
efs               520/tcp                           #Extended File Name Server
router            520/udp    route routed
ulp               522/tcp    
ulp               522/udp    
timed             525/udp    timeserver
tempo             526/tcp    newdate
irc-serv          529/tcp
irc-serv          529/udp
courier           530/tcp    rpc
conference        531/tcp    chat
netnews           532/tcp    readnews
netwall           533/udp                           #For emergency broadcasts
uucp              540/tcp    uucpd
klogin            543/tcp                           #Kerberos login
kshell            544/tcp    krcmd                  #Kerberos remote shell
dhcpv6-client     546/tcp                           #DHCPv6 Client
dhcpv6-client     546/udp                           #DHCPv6 Client
dhcpv6-server     547/tcp                           #DHCPv6 Server
dhcpv6-server     547/udp                           #DHCPv6 Server
new-rwho          550/udp    new-who
remotefs          556/tcp    rfs rfs_server
rmonitor          560/udp    rmonitord
monitor           561/udp
nntps             563/tcp    snntp                  #NNTP over TLS/SSL
nntps             563/udp    snntp                  #NNTP over TLS/SSL
whoami            565/tcp
whoami            565/udp
http-rpc-epmap    593/tcp                           #HTTP RPC Ep Map
http-rpc-epmap    593/udp                           #HTTP RPC Ep Map
hmmp-ind          612/tcp                           #HMMP Indication
hmmp-ind          612/udp                           #HMMP Indication
hmmp-op           613/tcp                           #HMMP Operation
hmmp-op           613/udp                           #HMMP Operation
ldaps             636/tcp    sldap                  #LDAP over TLS/SSL
doom              666/tcp                           #Doom Id Software
doom              666/udp                           #Doom Id Software
msexch-routing    691/tcp                           #MS Exchange Routing
msexch-routing    691/udp                           #MS Exchange Routing
kerberos-adm      749/tcp                           #Kerberos administration
kerberos-adm      749/udp                           #Kerberos administration
kerberos-iv       750/udp                           #Kerberos version IV
ftps-data         989/tcp                           #FTP data, over TLS/SSL
ftps              990/tcp                           #FTP control, over TLS/SSL
telnets           992/tcp                           #Telnet protocol over TLS/SSL
imaps             993/tcp                           #IMAP4 protocol over TLS/SSL
ircs              994/tcp                           #IRC protocol over TLS/SSL
pop3s             995/tcp    spop3                  #pop3 protocol over TLS/SSL (was spop3)
pop3s             995/udp    spop3                  #pop3 protocol over TLS/SSL (was spop3)
kpop             1109/tcp                           #Kerberos POP
activesync       1034/tcp                           #ActiveSync Notifications
phone            1167/udp                           #Conference calling
opsmgr           1270/tcp                           #Microsoft Operations Manager
opsmgr           1270/udp                           #Microsoft Operations Manager
ms-sql-s         1433/tcp                           #Microsoft-SQL-Server 
ms-sql-s         1433/udp                           #Microsoft-SQL-Server 
ms-sql-m         1434/tcp                           #Microsoft-SQL-Monitor
ms-sql-m         1434/udp                           #Microsoft-SQL-Monitor                
ms-sna-server    1477/tcp
ms-sna-server    1477/udp
ms-sna-base      1478/tcp
ms-sna-base      1478/udp
wins             1512/tcp                           #Microsoft Windows Internet Name Service
wins             1512/udp                           #Microsoft Windows Internet Name Service
ingreslock       1524/tcp    ingres
stt              1607/tcp
stt              1607/udp
l2tp             1701/udp                           #Layer Two Tunneling Protocol
pptconference    1711/tcp
pptconference    1711/udp
pptp             1723/tcp                           #Point-to-point tunnelling protocol
msiccp           1731/tcp
msiccp           1731/udp
remote-winsock   1745/tcp
remote-winsock   1745/udp
ms-streaming     1755/tcp
ms-streaming     1755/udp
msmq             1801/tcp                           #Microsoft Message Queue
msmq             1801/udp                           #Microsoft Message Queue
radius           1812/udp                           #RADIUS authentication protocol
radacct          1813/udp                           #RADIUS accounting protocol
msnp             1863/tcp
msnp             1863/udp
ssdp             1900/tcp
ssdp             1900/udp
close-combat     1944/tcp
close-combat     1944/udp
nfsd             2049/udp    nfs                    #NFS server
knetd            2053/tcp                           #Kerberos de-multiplexor
mzap             2106/tcp                           #Multicast-Scope Zone Announcement Protocol
mzap             2106/udp                           #Multicast-Scope Zone Announcement Protocol
directplay       2234/tcp                           #DirectPlay
directplay       2234/udp                           #DirectPlay
ms-olap3         2382/tcp                           #Microsoft OLAP 3
ms-olap4         2383/tcp                           #Microsoft OLAP 4
ms-olap1         2393/tcp                           #Microsoft OLAP 1
ms-olap2         2394/tcp                           #Microsoft OLAP 2
ms-theater       2460/tcp
wlbs             2504/tcp                           #Microsoft Windows Load Balancing Server
wlbs             2504/udp                           #Microsoft Windows Load Balancing Server
ms-v-worlds      2525/tcp                           #Microsoft V-Worlds 
sms-rcinfo       2701/tcp                           #SMS RCINFO
sms-xfer         2702/tcp                           #SMS XFER
sms-chat         2703/tcp                           #SMS CHAT
sms-remctrl      2704/tcp                           #SMS REMCTRL
msolap-ptp2      2725/tcp                           #MSOLAP PTP2
icslap           2869/tcp
cifs             3020/tcp
xbox             3074/tcp                           #Microsoft Xbox game port
xbox             3074/udp                           #Microsoft Xbox game port
ms-rule-engine   3132/tcp                           #Microsoft Business Rule Engine Update Service
msft-gc          3268/tcp                           #Microsoft Global Catalog
msft-gc-ssl      3269/tcp                           #Microsoft Global Catalog with LDAP/SSL
ms-cluster-net   3343/tcp                           #Microsoft Cluster Net
ms-cluster-net   3343/udp                           #Microsoft Cluster Net
ms-wbt-server    3389/tcp                           #MS WBT Server
ms-la            3535/tcp                           #Microsoft Class Server
pnrp-port        3540/tcp                           #PNRP User Port
teredo           3544/tcp                           #Teredo Port
p2pgroup         3587/tcp                           #Peer to Peer Grouping
upnp-discovery   3702/tcp                           #UPNP v2 Discovery
dvcprov-port     3776/tcp                           #Device Provisioning Port
dvcprov-port     3776/udp                           #Device Provisioning Port
msfw-control     3847/tcp                           #Microsoft Firewall Control
msdts1           3882/tcp                           #DTS Service Port
sdp-portmapper   3935/tcp                           #SDP Port Mapper Protocol
sdp-portmapper   3935/udp                           #SDP Port Mapper Protocol
net-device       4350/tcp                           #Net Device
net-device       4350/udp                           #Net Device
ipsec-msft       4500/tcp                           #Microsoft IPsec NAT-T
ipsec-msft       4500/udp                           #Microsoft IPsec NAT-T
dccm             5679/tcp                           #Direct Cable Connect Manager
ms-licensing     5720/tcp                           #Microsoft Licensing
ms-licensing     5720/udp                           #Microsoft Licensing 
directplay8      6073/tcp                           #DirectPlay8
directplay8      6073/udp                           #DirectPlay8
man              9535/tcp                           #Remote Man Server
rasadv           9753/udp
imip-channels   11320/tcp                           #IMIP Channels Port
directplaysrvr  47624/tcp                           #Direct Play Server
directplaysrvr  47624/udp                           #Direct Play Server
