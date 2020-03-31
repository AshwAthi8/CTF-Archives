0,system32\drivers

[Manufacturer]
%Mfg%=Models,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Models.NTamd64]

; X6 (91/99)
%USB\VID_05DA&PID_0099.DeviceDesc%=X6_USB.Scanner,USB\VID_05DA&PID_0099
%USB\VID_05DA&PID_0091.DeviceDesc%=X6_USB.Scanner,USB\VID_05DA&PID_0091

; X12USL (B0)
%USB\VID_05DA&PID_20B0.DeviceDesc%=X12USL_USB.Scanner,USB\VID_05DA&PID_20B0
%USB\VID_05DA&PID_20EE.DeviceDesc%=X12USL_USB.Scanner,USB\VID_05DA&PID_20EE

; SM3600 (B3)
%USB\VID_05DA&PID_40B3.DeviceDesc%=SM3600.Scanner,USB\VID_05DA&PID_40B3

;---------------------------------------------------
[X12USL_USB.Scanner]
SubClass=StillImage
DeviceType=1
DeviceSubType=0x1
Capabilities=0x30
DeviceData=X12USL_USB.DeviceData
AddReg=USB.AddReg
CopyFiles=X12USL_USB.CopyFiles,USD.CopyFiles,USB.CopySys32Files
DelFiles=DfltDS.UninstallFiles
ICMProfiles="sRGB Color Space Profile.icm"

[X12USL_USB.Scanner.Services]
AddService = usbscan, 0x00000002, USB.Scanner.AddService

[X12USL_USB.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[X12USL_USB.CopyFiles]
SMB0w.dll

;---------------------------------------------------
[X6_USB.Scanner]
SubClass=StillImage
DeviceType=1
DeviceSubType=0x1
Capabilities=0x30
DeviceData=X6_USB.DeviceData
AddReg=USB.AddReg
CopyFiles=X6_USB.CopyFiles,USD.CopyFiles,USB.CopySys32Files
DelFiles=DfltDS.UninstallFiles
ICMProfiles="sRGB Color Space Profile.icm"

[X6_USB.Scanner.Services]
AddService = usbscan, 0x00000002, USB.Scanner.AddService

[X6_USB.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[X6_USB.CopyFiles]
sm91w.dll

;---------------------------------------------------

[SM3600.Scanner]
SubClass=StillImage
DeviceType=1
DeviceSubType=0x1
Capabilities=0x30
DeviceData=SM3600.DeviceData
AddReg=USB.AddReg
CopyFiles=SM3600.CopyFiles,USD.CopyFiles,USB.CopySys32Files
DelFiles=DfltDS.UninstallFiles
;DelReg=USB.DelReg

[SM3600.Scanner.Services]
AddService = usbscan, 0x00000002, USB.Scanner.AddService

[SM3600.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[SM3600.CopyFiles]
SMB3w.dll

;---------------------------------------------------

[X6_USB.Scanner]
SubClass=StillImage
DeviceType=1
DeviceSubType=0x1
Capabilities=0x30
DeviceData=X6_USB.DeviceData
AddReg=USB.AddReg
CopyFiles=X6_USB.CopyFiles,USD.CopyFiles,USB.CopySys32Files
DelFiles=DfltDS.UninstallFiles
ICMProfiles="sRGB Color Space Profile.icm"

[X6_USB.Scanner.Services]
AddService = usbscan, 0x00000002, USB.Scanner.AddService

[X6_USB.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[X6_USB.CopyFiles]
sm91w.dll

;---------------------------------------------------
[USB.Scanner.AddService]
DisplayName    = %usbscan.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\usbscan.sys
LoadOrderGroup = Base

[USB.AddReg]
;HKR,,HardwareConfig,1,1

HKR,,DevLoader,,*NTKERN
HKR,,NTMPDriver,,"usbscan.sys"

HKR,,USDClass,,"{66CFF0C0-A94B-11d1-808C-0000E816F968}"
HKCR,CLSID\{66CFF0C0-A94B-11d1-808C-0000E816F968},,,"Microtek STI USD Driver"
HKCR,CLSID\{66CFF0C0-A94B-11d1-808C-0000E816F968}\InProcServer32,,,%11%\wiamsmud.dll
HKCR,CLSID\{66CFF0C0-A94B-11d1-808C-0000E816F968}\InProcServer32,ThreadingModel,,Both

[USD.CopyFiles]
wiamsmud.dll

[USB.CopySys32Files]
USBSCAN.SYS

[DfltDS.UninstallFiles]
LTWAIN.DS

































;---------------------------------------------------
[Strings]
Msft="Microsoft"
Mfg="Microtek"

usbscan.SvcDesc= "USB Scanner Driver"

WScan.DeviceDesc="WIA My Scanner  Device"
GoButton="Go Button"
WScan.SvcDesc="WIA My Scanner Driver"
USB\VID_05DA&PID_0099.DeviceDesc="ScanMaker X6u"
USB\VID_05DA&PID_0091.DeviceDesc="ScanMaker X6u"
USB\VID_05DA&PID_0094.DeviceDesc="SlimScan C3u"
USB\VID_05DA&PID_00A0.DeviceDesc="SlimScan C3u"
USB\VID_05DA&PID_20B0.DeviceDesc="ScanMaker X12USL"
USB\VID_05DA&PID_20EE.DeviceDesc="ScanMaker X12USL"
USB\VID_05DA&PID_40B3.DeviceDesc="ScanMaker 3600"


