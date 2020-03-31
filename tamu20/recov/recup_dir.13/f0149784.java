g]
HKR,,,,%61883ClassName%
HKR,,Icon,,-21
HKR,,NoInstallClass,,1
HKR,,Security,,"D:P(A;;GA;;;SY)(A;;GA;;;BA)"  ; ACL allowing System and Admin

[ControlFlags]
; All PnP devices should be excluded from manual AddDevice Applet list
ExcludeFromSelect=*

; =================== Table of content =========================

[Manufacturer]
%MicrosoftMfg%=Microsoft,NTamd64

; =================== Microsoft ========================

[Microsoft.NTamd64]
%61883Class.DeviceDesc%=61883_Unit,1394\A02D&10000
%61883Class.DeviceDesc%=61883_Unit,1394\A02D&10001
%61883Class.DeviceDesc%=V61883_Unit,V1394\A02D&10000
%61883Class.DeviceDesc%=V61883_Unit,V1394\A02D&10001

; dynamically loaded 61883

[61883_Unit]
AddReg=61883_Unit.AddReg
CopyFiles=61883_Unit.CopyFiles

[61883_Unit.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,61883.sys

[61883_Unit.NT]
CopyFiles=61883_Unit.CopyFiles

[61883_Unit.CopyFiles]
61883.sys

[61883_Unit.NT.Services]
AddService = 61883, 2, 61883_Unit.ServiceInstall

[61883_Unit.ServiceInstall]
DisplayName = %61883_Unit.ServiceDesc%
ServiceType   = 1
StartType     = 3
ErrorControl  = 1
ServiceBinary = %12%\61883.sys

; statically loaded 61883

[V61883_Unit]
AddReg=61883_Unit.AddReg,V61883_Unit.DevDesc
CopyFiles=61883_Unit.CopyFiles

[V61883_Unit.NT]
AddReg=V61883_Unit.DevDesc
CopyFiles=61883_Unit.CopyFiles

[V61883_Unit.NT.Services]
AddService = 61883, 2, 61883_Unit.ServiceInstall

[V61883_Unit.ServiceInstall]
DisplayName = %61883_Unit.ServiceDesc%
ServiceType   = 1
StartType     = 3
ErrorControl  = 1
ServiceBinary = %12%\61883.sys

[V61883_Unit.DevDesc]
HKR,VDL,VendorId,0x10001,0x50F2
HKR,VDL,ModelId,0x10001,0x0
HKR,VDL,SwVersion,0x10001,0x10001
HKR,VDL,szVendorId,,"Microsoft"
HKR,VDL,szModelId,,"61883 Device"

































[Strings]

;-----------------
; Localizable
;-----------------

Msft="Microsoft"
61883ClassName="61883 Device Class"

MicrosoftMfg="Microsoft"
61883Class.DeviceDesc="61883 Class Bus Device"
61883_Unit.ServiceDesc="61883 Unit Device"
