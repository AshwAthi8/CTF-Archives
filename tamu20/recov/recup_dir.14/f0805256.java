n,,-21
HKR,,NoInstallClass,,1
HKR,,Security,,"D:P(A;;GAFA;;;SY)(A;;GAFA;;;BA)"  ; ACL allowing System and Admin

[ControlFlags]
; All PnP devices should be excluded from manual AddDevice Applet list
ExcludeFromSelect=*

; =================== Table of content =========================
[DestinationDirs]
SBP2_CopyFiles=12

[Manufacturer]
%GenManufacturer%=sbp2_device,NTamd64

[sbp2_copyfiles]
sbp2port.sys


[sbp2_device.NTamd64]
%1394\609E&10483.DeviceDesc%=sbp2_install, 1394\609E&10483

[sbp2_install]
CopyFiles=sbp2_copyfiles


[sbp2_install.Services]
AddService = sbp2port,2,sbp2_ServiceInstallSection,sbp2_InstallEventLogSection

[sbp2_ServiceInstallSection]
DisplayName=%sbp2_ServiceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\sbp2port.sys


[ControlFlags]

[sbp2_InstallEventLogSection]
AddReg = sbp2_EventLog_addreg

[sbp2_EventLog_addreg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\sbp2port.sys"
HKR,,TypesSupported,0x00010001,7

































[Strings]

MSFT="Microsoft"
Sbp2ClassName="SBP2 IEEE 1394 Devices"
sbp2_ServiceDesc="SBP-2 Transport/Protocol Bus Driver"

GenManufacturer="IEEE 1394 SBP-2 Device Vendor"
1394\609E&10483.DeviceDesc="SBP2 Compliant IEEE 1394 device"
