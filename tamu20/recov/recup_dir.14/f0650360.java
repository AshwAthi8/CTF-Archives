.Install]
    Characteristics = 0
    AddReg          = Registry.MS_TCPIP6.Install

[Registry.MS_TCPIP6.Install]
; Class Information
    HKR, Ndi, HelpText,   0, %MS_TCPIP6.HelpText%
    HKR, Ndi, Service,    0, "Tcpip6"
    HKR, Ndi, CoServices, 0x10000, "Tcpip6", "6to4", "smb"
    HKR, Ndi, RequiredAll,0, "MS_SMB, *TUNMP"
    HKR, Ndi, ClsId      ,0, "{7b47881d-4d79-4369-adf5-d1293852d36b}"
;   The line above is for TCPIP v6 notify object implemented by the IPv6 FW (ICFv6)


; Interfaces
;
; An ndis5_ip6 UpperRange allows components (such as tunmp) to only bind IPv6.
;
    HKR, Ndi\Interfaces, UpperRange, 0, "tdi"
    HKR, Ndi\Interfaces, LowerRange, 0, "ndis5,ndis5_ip6"


;=====================================
; Microsoft IPv6 Interface and Service Install
;=====================================

; Service install
[MS_TCPIP6.Install.Services]
    AddService      = Tcpip6,    0, Install.AddService.TCPIP6,    NetEventLog
    AddService      = 6to4,      0, Svc-6to4

; Install Tcpip6 service
;
; The Tcpip6 driver can be loaded without the Tcpip (IPv4) driver,
; but we don't test that configuration.
; So we create a dependency on Tcpip.
[Install.AddService.TCPIP6]
    DisplayName     = %MS_TCPIP6.TCPIP6.ServiceDescription%
    ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
    StartType       = 1 ;SERVICE_SYSTEM_START
    ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
    ServiceBinary   = %12%\tcpip6.sys
    LoadOrderGroup  = PNP_TDI
    Dependencies    = Tcpip
    AddReg          = Registry.Service.TCPIP6.Secure,Registry.Service.TCPIP6,Registry.Service.TCPIP6.Winsock
    Description     = %MS_TCPIP6.TCPIP6.ServiceDescription%

[Svc-6to4]
    DisplayName     = %MS_TCPIP6.6to4.DisplayName%
    ServiceType     = 0x20 ;SERVICE_WIN32_SHARE_PROCESS
    StartType       = 2 ;SERVICE_AUTO_START
    ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
    ServiceBinary   = %11%\svchost.exe -k NetworkService
    StartName       = "NT AUTHORITY"\NetworkService
    Security        = "D:(A;;CCLCSWLOCRRC;;;AU)(A;;CCLCSWRPLOCRRC;;;PU)(A;;CCDCLCSWRPWPDTLOCRSDRCWDWO;;;BA)(A;;CCDCLCSWRPWPDTLOCRSDRCWDWO;;;SO)(A;;CCLCSWRPWPDTLOCRRC;;;SY)(A;;0x40;;;LS)(A;;0x40;;;NS)(A;;CCLCSWRPWPDTLOCRRC;;;NO)"

;
; The dependency on RpcSs is because this service may be set to auto-start
; and it runs in an instance of Svchost that needs to call
; CoInitailizeSecurity on behalf of the entire process.
; This call (made by svchost) will not succeed unless RpcSs is running.
;
; The dependency on WinMgmt is because the 6to4 service needs to query ICS
; configuration information, and the API for this information requires
; WinMgmt to be running.
;
    Dependencies    = RpcSS,tcpip6,winmgmt
    AddReg          = Registry.Service.6to4.AddReg,Registry.Service.6to4.AddReg.Secure
    Description     = %MS_TCPIP6.6to4.ServiceDescription%

; Install Winsock dependency
[MS_TCPIP6.Install.Winsock]
    AddSock     = Install.Tcpip6Winsock

[Install.Tcpip6Winsock]
    TransportService    = Tcpip6
    HelperDllName       = "%SystemRoot%\System32\wship6.dll"
    MaxSockAddrLength   = 0x1c
    MinSockAddrLength   = 0x1c

[Registry.Service.TCPIP6]
    HKR, , "TextModeFlags", 0x10001, 0x0001
    HKLM,System\CurrentControlSet\Services\NetBT\Parameters,UseNewSmb,0x10001,1

[Registry.Service.TCPIP6.Secure]
    HKR,Parameters,,0x10 ;FLG_ADDREG_KEYONLY

[Registry.Service.TCPIP6.Secure.Security]
"D:P(A;CI;GR;;;AU)(A;CI;GA;;;BA)(A;CI;GA;;;SY)(A;CI;GR;;;NS)(A;CI;GR;;;LS)(A;CI;CCDCLCSWRPSDRC;;;NO)"

[Registry.Service.TCPIP6.Winsock]
    HKR,Parameters\Winsock,"UseDelayedAcceptance",0x10001,0x0000

[Registry.Service.TCPIP6.Winsock.Security]
"D:P(A;CI;GR;;;AU)(A;CI;GA;;;BA)(A;CI;GA;;;SY)"

[Registry.Service.TCPIP6.DelReg]
    HKLM,System\CurrentControlSet\Services\NetBT\Parameters,UseNewSmb

[Registry.Service.6to4.AddReg]
    HKR, Parameters, ServiceDll, 0x00020000, "%%SystemRoot%%\System32\6to4svc.dll"

[Registry.Service.6to4.DelReg]
    HKR, Parameters, ServiceDll

[Registry.Service.6to4.AddReg.Secure]
    HKR,Config,,0x10 ;FLG_ADDREG_KEYONLY
    HKR,Interfaces,,0x10 ;FLG_ADDREG_KEYONLY
    HKLM,System\CurrentControlSet\Services\PortProxy,,0x10 ;FLG_ADDREG_KEYONLY

[Registry.Service.6to4.AddReg.Secure.Security]
"D:P(A;CI;GR;;;AU)(A;CI;GA;;;BA)(A;CI;GA;;;SY)(A;CI;GR;;;NS)(A;CI;GR;;;LS)(A;CI;CCSWRPRC;;;NO)"

;====================================
; TCP/IP6 Interface and Service Remove
;====================================

[MS_TCPIP6.Install.Remove]
    DelReg = Registry.Service.6to4.DelReg
    DelReg = Registry.Service.TCPIP6.DelReg
;nothing

[MS_TCPIP6.Install.Remove.Services]
    DelService = Tcpip6
    DelService = 6to4

[MS_TCPIP6.Install.Remove.Winsock]
    DelSock = Remove.Tcpip6Winsock

[Remove.Tcpip6Winsock]
    TransportService=Tcpip6

;****************************************************************************
; [Event Log] sections.
;****************************************************************************
[NetEventLog]
AddReg = NetEventLog.AddReg

[NetEventLog.AddReg]
    HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\netevent.dll"
    HKR,,TypesSupported,0x00010001,7

[Strings]
Msft = "Microsoft"

MS_TCPIP6.DisplayName = "Microsoft TCP/IP version 6"
MS_TCPIP6.HelpText    = "TCP/IP version 6. The next-generation version of the internet protocol that provides communication across diverse interconnected networks."
MS_TCPIP6.TCPIP6.ServiceDescription   = "Microsoft IPv6 Protocol Driver"
MS_TCPIP6.6to4.DisplayName = "IPv6 Helper Service"
MS_TCPIP6.6to4.ServiceDescription = "Provides DDNS name registration and automatic IPv6 connectivity over an IPv4 network.  If this service is stopped, other computers may not be able to reach it by name and the machine will only have IPv6 connectivity if it is connected to a native IPv6 network.  If this service is disabled, any other services that explicitly depend on this service will fail to start."
