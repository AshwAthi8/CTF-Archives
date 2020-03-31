
;
; IMAGE.INF  -- This file contains installation information for digital camera and 
;               other image devices.
;               
;               It is using the image class installer.
;               1394 Desktop Camera supports the sprcification 1.1 (VGA formats only) from 1394TA. 
;
;*** Created 10/2/95  (Creation Date)
;
; 11-9-2000 Add Orange Micro's 1394 Desktop Camera, which is based on TI's design;
;           Also remove the comptID for the 1394 desktop camera from Sony and TI's section.
; 11-18-2000 Add a Generic section for 1394 desktop camera that will load based on its compt id.
; 11-18-2000 Add (Pending) TI's TIYUV.dll to support decompression for Y444, Y411 and Y800.
;

[Version]
LayoutFile=Layout.inf
signature="$CHICAGO$"

Class=Image
ClassGUID={6bdd1fc6-810f-11d0-bec7-08002be2092f}
 
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
; All PnP devices should be excluded from manual AddDevice Applet list
ExcludeFromSelect=*

[Manufacturer]
%GenericMfg%=Generic,NTamd64
%OMMfg%=OM,NTamd64
%SonyMfg%=Sony,NTamd64
%TIMfg%=TI,NTamd64

[DestinationDirs]
DefaultDestDir=11               ; LDID_SYS

; Delete old Win95 and "Detroit" update drivers
DCam.DelDrivers=10,system

DCam.CopyDrivers=10,system32\drivers


;---------------------------------------------------------------
;                G E N E R I C 
;
;                      1 3 9 4 D C a m
;---------------------------------------------------------------
; Load based on compatible id instead of specific hardware id.
; This is intended to install new device of the same specifications.
[Generic.NTamd64]
%1394\Generic1394DCam.DeviceDesc%=Generic.1394DCam,1394\A02D&100   ; Spec 1.04
%1394\Generic1394DCam.DeviceDesc%=Generic.1394DCam,1394\A02D&101   ; Spec 1.2
%1394\Generic1394DCam.DeviceDesc%=Generic.1394DCam,1394\A02D&102   ; Spec 1.3

[Generic.1394DCam]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DCam.AddReg.WIN9x,DCam.AddReg,Generic.1394DCam.AddReg,DCam.WIA.AddReg
DelFiles=   DCam.DelDrivers
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[Generic.1394DCam.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DCam.AddReg,Generic.1394DCam.AddReg,DCam.WIA.AddReg
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[Generic.1394DCam.AddReg]
; Due to lack of decoder, we can only enable some video modes.
HKR,Settings,VModeInq0,0x00010001,0x00000050          ; 0101 0000; UYVY(320x240,640x480)
; No knowing the device, this section is commented out purposly.
;HKR,Settings,Brightness,0x00010001,12
;HKR,Settings,BrightnessDef,0x00010001,12
;HKR,Settings,Hue,0x00010001,128
;HKR,Settings,HueDef,0x00010001,128
;HKR,Settings,Saturation,0x00010001,25
;HKR,Settings,SaturationDef,0x00010001,25
;HKR,Settings,Sharpness,0x00010001,15
;HKR,Settings,SharpnessDef,0x00010001,15
;HKR,Settings,WhiteBalance,0x00010001,0x010000a0
;HKR,Settings,WhiteBalanceDef,0x00010001,0x010000a0
;HKR,Settings,Zoom,0x00010001,640
;HKR,Settings,ZoomDef,0x00010001,640
;HKR,Settings,Focus,0x00010001,1600
;HKR,Settings,FocusDef,0x00010001,1600

[Generic.1394DCam.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,Generic.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,Generic.1394DCam.Interface

[Generic.1394DCam.NT.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,Generic.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,Generic.1394DCam.Interface

[Generic.1394DCam.Interface]
AddReg=Generic.1394DCam.Intf.AddReg

[Generic.1394DCam.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%1394DCam.FriendlyName%     ; 1394 Desktop Camera "Class" FrendilyName
HKR,,Description,,%1394\Generic1394DCam.DeviceDesc%

[Generic.1394DCam.NT.Services]
AddService = sonydcam,0x00000002,Generic.1394DCam.ServiceInstall

[Generic.1394DCam.ServiceInstall]
DisplayName   = %1394\Generic1394DCam.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\sonydcam.sys

;---------------------------------------------------------------
;                O r a n g e   M i c r o 
;
;                      1 3 9 4 D C a m
;---------------------------------------------------------------
[OM.NTamd64]
%1394\ORANGE_MICRO&IBOT.DeviceDesc%=OM.1394DCam,1394\ORANGE_MICRO&IBOT  ; OEM from TI's reference design

[OM.1394DCam]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DCam.AddReg.WIN9x,DCam.AddReg,OM.1394DCam.AddReg,DCam.WIA.AddReg
DelFiles=   DCam.DelDrivers
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[OM.1394DCam.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DCam.AddReg,OM.1394DCam.AddReg,DCam.WIA.AddReg
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

; Same as TI's; but it can get customized.
[OM.1394DCam.AddReg]   
; Due to lack of decoder, we can only enable some video modes.
HKR,Settings,VModeInq0,0x00010001,0x00000050          ; 0101 0000; UYVY(320x240,640x480)

; Based on Status and Control Register for Feature; only Auto and Value are used.
; The default value must be within the Feature's range; else it will be set to midrange.
HKR,Settings,Brightness,0x00010001,0x01000078         ;Auto:1; Value:120
HKR,Settings,BrightnessDef,0x00010001,0x01000078      ;DefValue:120

HKR,Settings,Hue,0x00010001,0x00000005                ;Auto:0; Value:5
HKR,Settings,HueDef,0x00010001,0x00000005             ;DefValue:5

HKR,Settings,Saturation,0x00010001,0x0000007d         ;Auto:0; Value:125
HKR,Settings,SaturationDef,0x00010001,0x0000007d      ;DefValue:125

HKR,Settings,Sharpness,0x00010001,0x00000050          ;Auto:0; Value:80 
HKR,Settings,SharpnessDef,0x00010001,0x00000050       ;DefValue:80

HKR,Settings,WhiteBalance,0x00010001,0x01000070       ;Auto:1; Value:112
HKR,Settings,WhiteBalanceDef,0x00010001,0x00000070    ;DefValue:112

HKR,Settings,Zoom,0x00010001,0x00000004               ;Auto:0; Value:4
HKR,Settings,ZoomDef,0x00010001,0x00000004            ;DefValue:4

HKR,Settings,Focus,0x00010001,0x00000050              ;Auto:0; Value:80
HKR,Settings,FocusDef,0x00010001,0x00000050           ;DefValue:80


[OM.1394DCam.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,OM.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,OM.1394DCam.Interface

[OM.1394DCam.NT.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,OM.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,OM.1394DCam.Interface

[OM.1394DCam.Interface]
AddReg=OM.1394DCam.Intf.AddReg

[OM.1394DCam.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%1394DCam.FriendlyName%             ; 1394 Desktop Camera "Class" FrendilyName
HKR,,Description,,%1394\ORANGE_MICRO&IBOT.DeviceDesc%

[OM.1394DCam.NT.Services]
AddService = sonydcam,0x00000002,OM.1394DCam.ServiceInstall

[OM.1394DCam.ServiceInstall]
DisplayName   = %1394\ORANGE_MICRO&IBOT.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\sonydcam.sys

;---------------------------------------------------------------
;                S O N Y . 
;
;                      1 3 9 4 D C a m
;---------------------------------------------------------------
[Sony.NTamd64]
%1394\SONY&CCM-DS250.DeviceDesc%=Sony.1394DCam,1394\SONY&CCM-DS250_1.08  ; compliant
%1394\SONY&CCM-DS250.DeviceDesc%=Sony.1394DCam,1394\SONY&CCM-DS250_1.07  ; non-compliant

[Sony.1394DCam]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DCam.AddReg.WIN9x,DCam.AddReg,Sony.1394DCam.AddReg,DCam.WIA.AddReg
DelFiles=   DCam.DelDrivers
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[Sony.1394DCam.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DCam.AddReg,Sony.1394DCam.AddReg,DCam.WIA.AddReg
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[Sony.1394DCam.AddReg]
; Due to lack of decoder, we can only enable some video modes.
HKR,Settings,VModeInq0,0x00010001,0x00000050          ; 0101 0000; UYVY(320x240,640x480)

HKR,Settings,Brightness,0x00010001,0x0000000c         ;Auto:0; Value:12
HKR,Settings,BrightnessDef,0x00010001,0x0000000c      ;DefValue:12

HKR,Settings,Hue,0x00010001,128,0x00000080            ;Auto:0; Value:128     
HKR,Settings,HueDef,0x00010001,0x00000080             ;DefValue:128

HKR,Settings,Saturation,0x00010001,0x00000019         ;Auto:1; Value:25
HKR,Settings,SaturationDef,0x00010001,0x00000019      ;DefValue:25

HKR,Settings,Sharpness,0x00010001,0x0000000f          ;Auto:0; Value:15
HKR,Settings,SharpnessDef,0x00010001,0x0000000f       ;DefValue:15

HKR,Settings,WhiteBalance,0x00010001,0x010000a0       ;Auto:1; Value:160
HKR,Settings,WhiteBalanceDef,0x00010001,0x010000a0    ;DefValue:160

HKR,Settings,Zoom,0x00010001,0x00000280               ;Auto:0; Value:640
HKR,Settings,ZoomDef,0x00010001,0x00000280            ;DefValue:640                

HKR,Settings,Focus,0x00010001,0x00000640              ;Auto:0; Value:1600
HKR,Settings,FocusDef,0x00010001,0x00000640           ;DefValue:1600

[Sony.1394DCam.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,Sony.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,Sony.1394DCam.Interface

[Sony.1394DCam.NT.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,Sony.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,Sony.1394DCam.Interface

[Sony.1394DCam.Interface]
AddReg=Sony.1394DCam.Intf.AddReg

[Sony.1394DCam.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%1394DCam.FriendlyName%       ; 1394 Desktop Camera "Class" FrendilyName
HKR,,Description,,%1394\SONY&CCM-DS250.DeviceDesc%

[Sony.1394DCam.NT.Services]
AddService = sonydcam,0x00000002,Sony.1394DCam.ServiceInstall

[Sony.1394DCam.ServiceInstall]
DisplayName   = %1394\SONY&CCM-DS250.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\sonydcam.sys

;---------------------------------------------------------------
;                T I . 
;
;                      1 3 9 4 D C a m
;---------------------------------------------------------------
[TI.NTamd64]
%1394\TI&MC680-DCC.DeviceDesc%=TI.1394DCam,1394\TI&MC680-DCC_V0.9

[TI.1394DCam]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DCam.AddReg.WIN9x,DCam.AddReg,TI.1394DCam.AddReg,DCam.WIA.AddReg
DelFiles=   DCam.DelDrivers
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[TI.1394DCam.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DCam.AddReg,TI.1394DCam.AddReg,DCam.WIA.AddReg
CopyFiles=  DCam.CopyDrivers
; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DCam.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[TI.1394DCam.AddReg]
; Due to lack of decoder, we can only enable some video modes.
HKR,Settings,VModeInq0,0x00010001,0x00000050          ;(BigEndien) 0101 0000; UYVY(320x240,640x480)

HKR,Settings,Brightness,0x00010001,0x01000078         ;Auto:1; Value:120
HKR,Settings,BrightnessDef,0x00010001,0x01000078      ;DefValue:120

HKR,Settings,Hue,0x00010001,0x00000005                ;Auto:0; Value:5
HKR,Settings,HueDef,0x00010001,0x00000005             ;DefValue:5

HKR,Settings,Saturation,0x00010001,0x0000007d         ;Auto:0; Value:125
HKR,Settings,SaturationDef,0x00010001,0x0000007d      ;DefValue:125

HKR,Settings,Sharpness,0x00010001,0x00000050          ;Auto:0; Value:80
HKR,Settings,SharpnessDef,0x00010001,0x00000050       ;DefValue:80

HKR,Settings,WhiteBalance,0x00010001,0x01000070       ;Auto:1; Value:112
HKR,Settings,WhiteBalanceDef,0x00010001,0x00000070    ;DefValue:112

HKR,Settings,Zoom,0x00010001,0x00000004               ;Auto:0; Value:4
HKR,Settings,ZoomDef,0x00010001,0x00000004            ;DefValue:4

HKR,Settings,Focus,0x00010001,0x00000050              ;Auto:0; Value:80
HKR,Settings,FocusDef,0x00010001,0x00000050           ;DefValue:80

[TI.1394DCam.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,TI.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,TI.1394DCam.Interface

[TI.1394DCam.NT.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,TI.1394DCam.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,TI.1394DCam.Interface

[TI.1394DCam.Interface]
AddReg=TI.1394DCam.Intf.AddReg

[TI.1394DCam.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%1394DCam.FriendlyName%         ; 1394 Desktop Camera "Class" FrendilyName
HKR,,Description,,%1394\TI&MC680-DCC.DeviceDesc%

[TI.1394DCam.NT.Services]
AddService = sonydcam,0x00000002,TI.1394DCam.ServiceInstall

[TI.1394DCam.ServiceInstall]
DisplayName   = %1394\TI&MC680-DCC.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\sonydcam.sys



;---------------------------------------------------------------
;                      C o m m o n
;---------------------------------------------------------------
[DCam.AddReg.WIN9x]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,sonydcam.sys

[DCam.AddReg]
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[DCam.WIA.AddReg]
HKR,,HardwareConfig,1,1
HKR,,USDClass,,"{0527d1d0-88c2-11d2-82c7-00c04f8ec183}"

[DCam.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={5d8ef5a3-ac13-11d2-a093-00c04f72dc3c}

[DCam.DelDrivers]
ks.sys,,,1
stream.sys,,,1
sonydcam.sys,,,1

[DCam.CopyDrivers]
stream.sys
sonydcam.sys

[DCam.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={5d8ef5a3-ac13-11d2-a093-00c04f72dc3c}
































[Strings]

;----------------
; Non-Localizable
;----------------

; note: only register value is case sensitive, key is not.
ProxyVCap.CLSID="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
KSCATEGORY_CAPTURE="{65E8773D-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_VIDEO="{6994AD05-93EF-11D0-A3CC-00A0C9223196}"
SERVICE_KERNEL_DRIVER=1
; PnP should use demand start
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

; Do not localize FriendlyName; ISV may depend on this.
1394DCam.FriendlyName="1394 Desktop Video Camera"

;----------------
; Localizable
;----------------

Msft="Microsoft"


; Localize description
GenericMfg="Generic"
1394\Generic1394DCam.DeviceDesc="Generic 1394 Desktop Camera"

OMMfg="OrangeMicro"
1394\ORANGE_MICRO&IBOT.DeviceDesc="Orange Micro iBot Desktop Camera"

SonyMfg="Sony"
1394\SONY&CCM-DS250.DeviceDesc="Sony 1394 CCM-DS250 Desktop Camera"

TIMfg="TI"
1394\TI&MC680-DCC.DeviceDesc="TI 1394 MC680-DCC Desktop Camera"


