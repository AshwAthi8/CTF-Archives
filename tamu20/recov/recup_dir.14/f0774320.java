; LDID_SYS\COLOR

; Table of Contents
[Manufacturer]
%Generic.Mfg%=Generic,NTamd64
;%MfgFlashPoint%=ModelsFlashPoint
;%MfgSony%=ModelsSony
;%MfgKodak%=ModelsKodak

[Generic.NTamd64]
%GenericPTP.DeviceDesc%=PTP, USB\Class_06&SubClass_01&Prot_01

[ModelsKodak]
%USB\VID_040A&PID_0140.Device%=DC15740, USB\VID_040A&PID_0140
%USB\VID_040A&PID_0200.Device%=DC15740, USB\VID_040A&PID_0200
%USB\VID_040A&PID_0121.Device%=DC15740, USB\VID_040A&PID_0121
%KodakDC4800%=DC15740, USB\VID_040A&PID_0160

[ModelsSony]
;%SonyCamera%=PTP, USB\VID_054C&PID_004E

[ModelsFlashPoint]

;;
;; PTP compatible cameras
;;

[PTP]
Include=sti.inf
Needs=STI.PTPUSBSection

AddReg=PTP.AddReg
DeviceData=PTP.DeviceData
SubClass=StillImage
DeviceType=2
Capabilities=0x35
UninstallSection=
Events=PTP.Events
ICMProfiles="sRGB Color Space Profile.icm"

[PTP.Services]
Include=sti.inf
Needs=STI.USBSection.Services

[PTP.coinstallers]
AddReg=PTP.Coinstaller.AddReg

[PTP.DeviceData]
Model=PTP
QueryDeviceForName=1,1
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[PTP.Events]
Connected=%DCConnected%,{A28BBADE-64B6-11d2-A231-00C04FA31809},*
Disconnected=%DCDisconnected%,{143E4E83-6497-11d2-A231-00C04FA31809},*

[PTP.AddReg]


[DC15740]
Include=sti.inf
Needs=STI.PTPUSBSection

CopyFiles=Kodak.Color
AddReg=DC15740.AddReg
DeviceData=DC15740.DeviceData
SubClass=StillImage
DeviceType=2
Capabilities=0x35
UninstallSection=
Events=DC15740.Events
ICMProfiles=kodak_dc.icm

[DC15740.Services]
Include=sti.inf
Needs=STI.USBSection.Services

[DC15740.coinstallers]
AddReg=PTP.Coinstaller.AddReg

[DC15740.DeviceData]
Model=DCPTP
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[DC15740.Events]
Connected=%DCConnected%,{A28BBADE-64B6-11d2-A231-00C04FA31809},*
Disconnected=%DCDisconnected%,{143E4E83-6497-11d2-A231-00C04FA31809},*

[DC15740.AddReg]

;
; Generic
;
[Kodak.Color]
kodak_dc.icm

[PTP.Coinstaller.AddReg]
HKR,,CoInstallers32,0x00010000,"sti_ci.dll,PTPCoinstallerEntry"

































[Strings]













;non-localizable
MfgKodak="Eastman Kodak Company"
Msft="Microsoft"
Mfg="Microsoft"


USB\VID_040A&PID_0131.Device="Kodak DC5000 Digital Camera"
USB\VID_040A&PID_0121.Device="Kodak Digital Camera"
USB\VID_040A&PID_0140.Device="Kodak DC4800 Zoom Digital Camera"
USB\VID_040A&PID_0200.Device="Kodak Digital Camera"
KodakDC4800="Kodak DC4800 Zoom Digital Camera"
KodakDC5000="Kodak DC5000 Zoom Digital Camera"
SonyPrototype="Sony Digital Camera"
SonyCamera="Sony Digital Camera"
GenericPTP.DeviceDesc="Digital Still Camera"


;; TWAIN DS names
;;

TwainDS_5000="WIA-Kodak DC5000 Digital Camera"
TwainDS_PTPP="WIA-Kodak Digital Camera"
TwainDS_4800="WIA-Kodak DC4800 Zoom Digital Camera"
TwainDS_DC  ="WIA-Kodak Digital Camera"

;;
;; Localizable strings
;;
DC15740Disconnected="Kodak PTP camera disconnected"
DC15740Connected="Kodak PTP camera connected"

DCConnected="Digital camera connected"
DCDisconnected= "Digital camera  disconnected"

Generic.Mfg="(Standard PTP-compliant digital cameras)"
MfgName="Eastman Kodak Company"
MfgSony="Sony"
MfgFlashPoint="Eastman Kodak Company"
PowerOn="Powered on"
