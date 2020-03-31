;
; Copyright (c) Microsoft Corporation.  All rights reserved.
;
; MSDV.INF -- 
;
;     This file contains installation information for IEEE 1394 DV Camera and VCR devices.
;
; Changes:
;
;   Utilize 61883.sys (2nd level enumerator) and AVC.sys (3rd level enumerator)
;   Make WIA-enable so WIA can capture still from preview stream
;   11-18-2000 Add Philips (DV decoder emulated as DV Camcorder)
;   11-18-2000 Add a Generic section for new IHV (Hitachi, Samsung..etc)
;   02-26-2001 Add entries for device that supply vendor text
;   03-05-2001 Add Hitachi and Samsung vendor sections
;   04-09-2001 Add "&DV"
;   04-25-2001 Install NULL driver for selective Panasonic subunit not yet supported.
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
%Generic%=Generic,NTamd64
%Canon%=Canon,NTamd64
%Hitachi%=Hitachi,NTamd64
%JVC%=JVC,NTamd64
%Panasonic%=Panasonic,NTamd64
%Philips%=Philips,NTamd64
%Sharp%=Sharp,NTamd64
%Samsung%=Samsung,NTamd64
%Sony%=Sony,NTamd64


[DestinationDirs]
DefaultDestDir=11               ; LDID_SYS
DVCR.DelDrivers=10,system
DVCR.CopyDrivers=10,system32\drivers


;---------------------------------------------------------------
;                G e n e r i c
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Generic.NTamd64]
%AVC\Generic&TYP_4.DeviceDesc%=DVCR.Generic,AVC\TYP_4&DV            ; AVC Compliant DV Tape Recorder/Player
%AVC\Generic&CAMCORDER.DeviceDesc%=DVCR.Generic,AVC\CAMCORDER&DV    ; AVC Compliant DV Camcorder

[DVCR.Generic]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Generic.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"


[DVCR.Generic.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Generic.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Generic.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Generic.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Generic.Interface


[DVCR.Generic.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Generic.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Generic.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Generic.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Generic.Interface


[DVCR.Generic.Interface]
AddReg=DVCR.Generic.Intf.AddReg

[DVCR.Generic.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Generic.Capture%

[DVCR.Generic.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


;---------------------------------------------------------------
;                C a n o n
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Canon.NTamd64]
%AVC\VEN_85&TYP_4.DeviceDesc%=DVCR.Canon,AVC\VEN_85&MOD_0&TYP_4&DV          ; Canon DV Tape Recorder/Player
%AVC\VEN_85&TYP_4.DeviceDesc%=DVCR.Canon,AVC\Canon&TYP_4&DV                 ; Canon DV Tape Recorder/Player with vendor text

%AVC\VEN_85&CAMCORDER.DeviceDesc%=DVCR.Canon,AVC\VEN_85&MOD_0&CAMCORDER&DV  ; Canon DV Camcorder
%AVC\VEN_85&CAMCORDER.DeviceDesc%=DVCR.Canon,AVC\Canon&CAMCORDER&DV         ; Canon DV Camcorder with Vendor text

[DVCR.Canon]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Canon.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Canon.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Canon.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Canon.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Canon.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Canon.Interface

[DVCR.Canon.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Canon.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Canon.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Canon.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Canon.Interface

[DVCR.Canon.Interface]
AddReg=DVCR.Canon.Intf.AddReg

[DVCR.Canon.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Canon.Capture%

[DVCR.Canon.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall

;---------------------------------------------------------------
;                H i t a c h i
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Hitachi.NTamd64]
%AVC\VEN_87&TYP_4.DeviceDesc%=DVCR.Hitachi,AVC\VEN_87&MOD_0&TYP_4&DV            ; Hitachi DV Tape Recorder/Player
%AVC\VEN_87&TYP_4.DeviceDesc%=DVCR.Hitachi,AVC\Hitachi&TYP_4&DV                 ; Hitachi DV Tape Recorder/Player with vendor text

%AVC\VEN_87&CAMCORDER.DeviceDesc%=DVCR.Hitachi,AVC\VEN_87&MOD_0&CAMCORDER&DV    ; Hitachi DV Camcorder
%AVC\VEN_87&CAMCORDER.DeviceDesc%=DVCR.Hitachi,AVC\Hitachi&CAMCORDER&DV         ; Hitachi DV Camcorder with Vendor text

[DVCR.Hitachi]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

; WIA
SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Hitachi.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Hitachi.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Hitachi.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Hitachi.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Hitachi.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Hitachi.Interface

[DVCR.Hitachi.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Hitachi.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Hitachi.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Hitachi.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Hitachi.Interface

[DVCR.Hitachi.Interface]
AddReg=DVCR.Hitachi.Intf.AddReg

[DVCR.Hitachi.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Hitachi.Capture%

[DVCR.Hitachi.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall

;---------------------------------------------------------------
;                J V C
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[JVC.NTamd64]
%AVC\VEN_8088&TYP_4.DeviceDesc%=DVCR.JVC,AVC\VEN_8088&MOD_0&TYP_4&DV            ; JVC DV Tape Recorder/Player
%AVC\VEN_8088&TYP_4.DeviceDesc%=DVCR.JVC,AVC\VICTOR&TYP_4&DV                    ; JVC DV Tape Recorder/Player with vendor text

%AVC\VEN_8088&CAMCORDER.DeviceDesc%=DVCR.JVC,AVC\VEN_8088&MOD_0&CAMCORDER&DV    ; JVC DV Camcorder
%AVC\VEN_8088&CAMCORDER.DeviceDesc%=DVCR.JVC,AVC\VICTOR&CAMCORDER&DV            ; JVC DV Camcorder with vendor text

[DVCR.JVC]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.JVC.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.JVC.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.JVC.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.JVC.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.JVC.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.JVC.Interface

[DVCR.JVC.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.JVC.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.JVC.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.JVC.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.JVC.Interface

[DVCR.JVC.Interface]
AddReg=DVCR.JVC.Intf.AddReg

[DVCR.JVC.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.JVC.Capture%

[DVCR.JVC.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


;---------------------------------------------------------------
;                P a n a s o n i c (M E I)
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Panasonic.NTamd64]
%AVC\VEN_8045.DeviceDesc%=DVCR.MEI,AVC\VEN_8045&MOD_0                           ; Panasonic AV Device; Failed AVC Subunit Cmd

%AVC\VEN_8045&TYP_4.DeviceDesc%=DVCR.MEI,AVC\VEN_8045&MOD_0&TYP_4&DV            ; Panasonic DV Tape Recorder/Player
%AVC\VEN_8045&TYP_4.DeviceDesc%=DVCR.MEI,AVC\Panasonic&TYP_4&DV                 ; Panasonic DV Tape Recorder/Player with vendor text

%AVC\VEN_8045&CAMCORDER.DeviceDesc%=DVCR.MEI,AVC\VEN_8045&MOD_0&CAMCORDER&DV    ; Panasonic DV Camcorder
%AVC\VEN_8045&CAMCORDER.DeviceDesc%=DVCR.MEI,AVC\Panasonic&CAMCORDER&DV         ; Panasonic DV Camcorder with vendor text

; Vendor unique (0x1c) subunit to load as a null device
%AVC\Panasonic&MOD_0&TYP_1c.DeviceDesc%=NODRV,AVC\Panasonic&MOD_0&TYP_1c
%AVC\VEN_8045&MOD_0&TYP_1c.DeviceDesc%=NODRV,AVC\VEN_8045&MOD_0&TYP_1c
; DV with Tuner (0x5) subunit to load as a null device
%AVC\Panasonic&MOD_0&TYP_5.DeviceDesc%=NODRV,AVC\Panasonic&MOD_0&TYP_5  
%AVC\VEN_8045&MOD_0&TYP_5.DeviceDesc%=NODRV,AVC\VEN_8045&MOD_0&TYP_5

[DVCR.MEI]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.MEI.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.MEI.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.MEI.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.MEI.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.MEI.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.MEI.Interface

[DVCR.MEI.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.MEI.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.MEI.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.MEI.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.MEI.Interface

[DVCR.MEI.Interface]
AddReg=DVCR.MEI.Intf.AddReg

[DVCR.MEI.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.MEI.Capture%

[DVCR.MEI.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


[NODRV]

[NODRV.Services]
;
; this is blank to just allow the install to succeed
;
AddService = , 0x00000002   ; null service install

;---------------------------------------------------------------
;                P h i l i p s  (006037 (hex) is PHILIPS SEMICONDUCTORS)
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Philips.NTamd64]
%AVC\Philips&DV_convertor____&CAMCORDER.DeviceDesc%=DVCR.Philips,AVC\Philips&DV_convertor____&CAMCORDER ; Philips DV converter or Camcorder 
%AVC\Philips&DV_convertor____&CAMCORDER.DeviceDesc%=DVCR.Philips,AVC\VEN_6037&MOD_0&CAMCORDER&DV        ; Philips DV converter or Camcorder
%AVC\Philips&CAMCORDER.DeviceDesc%=DVCR.Philips,AVC\Philips&CAMCORDER&DV                                ; Philips DV Camcorder

[DVCR.Philips]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Philips.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Philips.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Philips.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Philips.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Philips.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Philips.Interface

[DVCR.Philips.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Philips.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Philips.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Philips.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Philips.Interface

[DVCR.Philips.Interface]
AddReg=DVCR.Philips.Intf.AddReg

[DVCR.Philips.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Philips.Capture%

[DVCR.Philips.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


;---------------------------------------------------------------
;                S a m s u n g 
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Samsung.NTamd64]
%AVC\VEN_F0&TYP_4.DeviceDesc%=DVCR.Samsung,AVC\VEN_F0&MOD_0&TYP_4&DV            ; Samsung DV Tape Recorder/Player
%AVC\VEN_F0&TYP_4.DeviceDesc%=DVCR.Samsung,AVC\Samsung&TYP_4&DV                 ; Samsung DV Tape Recorder/Player with vendor text

%AVC\VEN_F0&CAMCORDER.DeviceDesc%=DVCR.Samsung,AVC\VEN_F0&MOD_0&CAMCORDER&DV    ; Samsung DV Camcorder
%AVC\VEN_F0&CAMCORDER.DeviceDesc%=DVCR.Samsung,AVC\Samsung&CAMCORDER&DV         ; Samsung DV Camcorder with Vendor text

[DVCR.Samsung]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Samsung.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Samsung.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Samsung.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Samsung.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Samsung.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Samsung.Interface

[DVCR.Samsung.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Samsung.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Samsung.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Samsung.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Samsung.Interface

[DVCR.Samsung.Interface]
AddReg=DVCR.Samsung.Intf.AddReg

[DVCR.Samsung.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Samsung.Capture%

[DVCR.Samsung.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


;---------------------------------------------------------------
;                S h a r p
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Sharp.NTamd64]
%AVC\VEN_8001F.DeviceDesc%=DVCR.Sharp,AVC\VEN_8001F&MOD_0                           ; Sharp AV Device; Failed AVC Subunit Cmd

%AVC\VEN_8001F&CAMCORDER.DeviceDesc%=DVCR.Sharp,AVC\VEN_8001F&MOD_0&CAMCORDER&DV    ; Sharp DV Camcorder
%AVC\VEN_8001F&CAMCORDER.DeviceDesc%=DVCR.Sharp,AVC\Sharp&CAMCORDER&DV              ; Sharp DV Camcorder with vendor text

[DVCR.Sharp]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Sharp.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Sharp.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Sharp.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Sharp.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Sharp.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Sharp.Interface

[DVCR.Sharp.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Sharp.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Sharp.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Sharp.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Sharp.Interface

[DVCR.Sharp.Interface]
AddReg=DVCR.Sharp.Intf.AddReg

[DVCR.Sharp.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Sharp.Capture%

[DVCR.Sharp.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


;---------------------------------------------------------------
;                S o n y
;
;                      1 3 9 4 D V C R
;---------------------------------------------------------------
[Sony.NTamd64]
%AVC\VEN_80046.DeviceDesc%=DVCR.Sony,AVC\VEN_80046&MOD_0                        ; Sony AV Device; Failed AVC Subunit Cmd
%AVC\VEN_80046.DeviceDesc%=DVCR.Sony,AVC\Sony&MOD_0                             ; Sony AV Device; Failed AVC Subunit Cmd

%AVC\VEN_80046&TYP_4.DeviceDesc%=DVCR.Sony,AVC\VEN_80046&MOD_0&TYP_4&DV         ; Sony DV Tape Recorder/Player
%AVC\VEN_80046&TYP_4.DeviceDesc%=DVCR.Sony,AVC\Sony&TYP_4&DV                    ; Sony DV Tape Recorder/Player with vendor text

%AVC\VEN_80046&CAMCORDER.DeviceDesc%=DVCR.Sony,AVC\VEN_80046&MOD_0&CAMCORDER&DV ; Sony DV camcorder
%AVC\VEN_80046&CAMCORDER.DeviceDesc%=DVCR.Sony,AVC\Sony&CAMCORDER&DV            ; Sony DV camcorder with vendor text
%AVC\VEN_80046&CAMCORDER.DeviceDesc%=DVCR.Sony,AVC\VEN_80146&MOD_0&CAMCORDER&DV ; For Sony's device that use 80146 as its Company_id

[DVCR.Sony]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     DVCR.AddReg.Win9x,DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
DelFiles=   DVCR.DelDrivers
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Sony.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     DVCR.AddReg,DVCR.PinNames,DVCR.PlugIns,DVCR.WIA.AddReg
CopyFiles=  DVCR.CopyDrivers

SubClass=     StillImage
DeviceType=   3
DeviceSubType=0x1
Capabilities= 0x00000031
DeviceData=   DVCR.DeviceData
ICMProfiles=  "sRGB Color Space Profile.icm"

[DVCR.Sony.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Sony.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Sony.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Sony.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Sony.Interface

[DVCR.Sony.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     DVCR.Sony.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   DVCR.Sony.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    DVCR.Sony.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,DVCR.Sony.Interface

[DVCR.Sony.Interface]
AddReg=DVCR.Sony.Intf.AddReg

[DVCR.Sony.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%DVCR.Capture%
HKR,,Description,, %DVCR.Sony.Capture%

[DVCR.Sony.NT.Services]
AddService = MSDV,0x00000002,DVCR.ServiceInstall


;---------------------------------------------------------------
;                C o m m o n     S e c t i o n
;---------------------------------------------------------------
[DVCR.AddReg.WIN9x]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,msdv.sys

[DVCR.AddReg]
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[DVCR.WIA.AddReg]
HKR,,HardwareConfig,1,1
HKR,,USDClass,,"{0527d1d0-88c2-11d2-82c7-00c04f8ec183}"

[DVCR.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={5d8ef5a3-ac13-11d2-a093-00c04f72dc3c}


[DVCR.PinNames]
HKLM,%MediaCategories%\%GUID.DVVidOutput%,Name,,%Pin.DVVidOutput%
HKLM,%MediaCategories%\%GUID.DVVidOutput%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.DVAVOutput%,Name,,%Pin.DVAVOutput%
HKLM,%MediaCategories%\%GUID.DVAVOutput%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.DVAVInput%,Name,,%Pin.DVAVInput%
HKLM,%MediaCategories%\%GUID.DVAVInput%,Display,1,00,00,00,00


[DVCR.PlugIns]
;IAMExtDevice            
HKCR,CLSID\{B5730A90-1A2C-11cf-8C23-00AA006B6814},,,%PlugIn_IAMExtDevice%
HKCR,CLSID\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{B5730A90-1A2C-11cf-8C23-00AA006B6814},,,%PlugIn_IAMExtDevice%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{B5730A90-1A2C-11cf-8C23-00AA006B6814},IID,1,90,0A,73,B5,2C,1A,cf,11,8C,23,00,AA,00,6B,68,14


;IAMExtTransport            
HKCR,CLSID\{A03CD5F0-3045-11cf-8C44-00AA006B6814},,,%PlugIn_IAMExtTransport%
HKCR,CLSID\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814},,,%PlugIn_IAMExtTransport%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814},IID,1,F0,D5,3C,A0,45,30,cf,11,8C,44,00,AA,00,6B,68,14


;IAMTimecodeReader            
HKCR,CLSID\{9B496CE1-811B-11cf-8C77-00AA006B6814},,,%PlugIn_IAMTimecodeReader%
HKCR,CLSID\{9B496CE1-811B-11cf-8C77-00AA006B6814}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{9B496CE1-811B-11cf-8C77-00AA006B6814}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{9B496CE1-811B-11cf-8C77-00AA006B6814},,,%PlugIn_IAMTimecodeReader%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{9B496CE1-811B-11cf-8C77-00AA006B6814},IID,1,E1,6C,49,9B,1B,81,cf,11,8C,77,00,AA,00,6B,68,14

;
; Property Pages
;

; DVcrControl Property Page
HKCR,CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b},,,%PropPage_DVcrControl%
HKCR,CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32,ThreadingModel,,Both
;
; Associate the property set with the above property page
;
; IAMExtDevice, IAMExttransport and IAMTimecodeReader interfaces
; all use the same property pages.
;
HKLM,System\CurrentControlSet\Control\MediaSets\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b},,,%PropPage_DVcrControl%
HKLM,System\CurrentControlSet\Control\MediaSets\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b},,,%PropPage_DVcrControl%
HKLM,System\CurrentControlSet\Control\MediaSets\{9B496CE1-811B-11cf-8C77-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b},,,%PropPage_DVcrControl%



[DVCR.DelDrivers]
ks.sys,,,1
stream.sys,,,1
msdv.sys,,,1

[DVCR.CopyDrivers]
msdv.sys
stream.sys

[DVCR.ServiceInstall]
; same service section
DisplayName   = %DVCR.Capture%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\msdv.sys



































[Strings]

;----------------
; Non-Localizable
;----------------

; note: only register value is case sensitive, key is not.
ProxyVCap.CLSID="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
MediaCategories="System\CurrentControlSet\Control\MediaCategories"
GUID.DVVidOutput="{5b21c540-7aee-11d1-883b-006097f05c70}"
GUID.DVAVOutput="{5b21c541-7aee-11d1-883b-006097f05c70}"
GUID.DVAVInput="{5b21c543-7aee-11d1-883b-006097f05c70}"

KSCATEGORY_VIDEO=     "{6994AD05-93EF-11D0-A3CC-00A0C9223196}"
KSCATEGORY_CAPTURE=   "{65E8773D-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_RENDER=    "{65E8773E-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_RENDER_EXT="{cc7bfb41-f175-11d1-a392-00e0291f3959}"
Pin.DVVidOutput="DV Vid Out"
Pin.DVAVOutput="DV A/V Out"
Pin.DVAVInput="DV A/V In"

SERVICE_KERNEL_DRIVER=1
; PnP should use demand start
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

;
; Filter friendly name
;
; Do not localize:
DVCR.Capture="Microsoft DV Camera and VCR"   ; FriendlyNames is generic, but the Description is device specific.


;----------------
; Localizable
;----------------

Msft="Microsoft"
Generic="Generic"
Canon="Canon"
Hitachi="Hitachi"
JVC="JVC"
Panasonic="Panasonic"
Philips="Philips"
Samsung="Samsung"
Sharp="Sharp"
Sony="Sony"


; Localize the following text:
DVCR.Generic.Capture="AVC Compliant DV Device"
DVCR.Canon.Capture="Canon DV Device"
DVCR.Hitachi.Capture="Hitachi DV Device"
DVCR.MEI.Capture="Panasonic DV Device"
DVCR.JVC.Capture="JVC DV Device"
DVCR.Philips.Capture="Philips DV Device"
DVCR.Samsung.Capture="Samsung DV Device"
DVCR.Sharp.Capture="Sharp DV Device"
DVCR.Sony.Capture="Sony DV Device"

;
; Device description
;

; AVC\Generic.DeviceDesc="AVC Compliant AV Device"
AVC\Generic&TYP_4.DeviceDesc="AVC Compliant DV Tape Recorder/Player"
AVC\Generic&CAMCORDER.DeviceDesc="AVC Compliant DV Camcorder"

AVC\VEN_85.DeviceDesc="Canon AV Device"
AVC\VEN_85&TYP_4.DeviceDesc="Canon DV Tape Recorder/Player"
AVC\VEN_85&CAMCORDER.DeviceDesc="Canon DV Camcorder"

AVC\VEN_87.DeviceDesc="Hitachi AV Device"
AVC\VEN_87&TYP_4.DeviceDesc="Hitachi DV Tape Recorder/Player"
AVC\VEN_87&CAMCORDER.DeviceDesc="Hitachi DV Camcorder"

AVC\VEN_8088.DeviceDesc="JVC AV Device"
AVC\VEN_8088&TYP_4.DeviceDesc="JVC DV Tape Recorder/Player"
AVC\VEN_8088&CAMCORDER.DeviceDesc="JVC DV Camcorder"

AVC\VEN_8045.DeviceDesc="Panasonic AV Device"
AVC\VEN_8045&TYP_4.DeviceDesc="Panasonic DV Tape Recorder/Player"
AVC\VEN_8045&CAMCORDER.DeviceDesc="Panasonic DV Camcorder"
; Subunits that load NULL driver
AVC\Panasonic&MOD_0&TYP_1c.DeviceDesc="Panasonic Vendor Unique Subunit"
AVC\VEN_8045&MOD_0&TYP_1c.DeviceDesc="Panasonic Vendor Unique Subunit"
AVC\Panasonic&MOD_0&TYP_5.DeviceDesc="Panasonic Vendor Unique Subunit"
AVC\VEN_8045&MOD_0&TYP_5.DeviceDesc="Panasonic Vendor Unique Subunit"

AVC\Philips&DV_convertor____&CAMCORDER.DeviceDesc="Philips DV Converter or Camcorder"
AVC\Philips&CAMCORDER.DeviceDesc="Philips Camcorder"

AVC\VEN_F0.DeviceDesc="Samsung AV Device"
AVC\VEN_F0&TYP_4.DeviceDesc="Samsung DV Tape Recorder/Player"
AVC\VEN_F0&CAMCORDER.DeviceDesc="Samsung DV Camcorder"

AVC\VEN_8001F.DeviceDesc="Sharp AV Device"
AVC\VEN_8001F&CAMCORDER.DeviceDesc="Sharp DV Camcorder"

AVC\VEN_80046.DeviceDesc="Sony AV Device"
AVC\VEN_80046&TYP_4.DeviceDesc="Sony DV Tape Recorder/Player"
AVC\VEN_80046&CAMCORDER.DeviceDesc="Sony DV Camcorder"

;
; PlugIns descrioption
;
PlugIn_IAMExtDevice="WDM Streaming IAMExtDevice Interface Handler"
PlugIn_IAMExtTransport="WDM Streaming IAMExtTransport Interface Handler"
PlugIn_IAMTimecodeReader="WDM Streaming IAMTimecodeReader Interface Handler"
PropPage_DVcrControl="DVcrControl Property Page"





[dvcr.generic]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.generic.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.generic.interface]
AddReg=wDVCR.Generic.Intf.AddReg

[dvcr.canon]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.canon.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.canon.interface]
AddReg=wDVCR.Canon.Intf.AddReg

[dvcr.hitachi]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.hitachi.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.hitachi.interface]
AddReg=wDVCR.Hitachi.Intf.AddReg

[dvcr.jvc]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.jvc.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.jvc.interface]
AddReg=wDVCR.JVC.Intf.AddReg

[dvcr.mei]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.mei.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.mei.interface]
AddReg=wDVCR.MEI.Intf.AddReg

[dvcr.philips]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.philips.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.philips.interface]
AddReg=wDVCR.Philips.Intf.AddReg

[dvcr.samsung]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.samsung.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.samsung.interface]
AddReg=wDVCR.Samsung.Intf.AddReg

[dvcr.sharp]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.sharp.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.sharp.interface]
AddReg=wDVCR.Sharp.Intf.AddReg

[dvcr.sony]
CopyFiles=wDVCR.CopyDrivers
DelFiles=wDVCR.DelDrivers
AddReg=wDVCR.AddReg.Win9x,wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.sony.nt]
CopyFiles=wDVCR.CopyDrivers
AddReg=wDVCR.AddReg,wDVCR.PinNames,wDVCR.PlugIns,wDVCR.WIA.AddReg

[dvcr.sony.interface]
AddReg=wDVCR.Sony.Intf.AddReg

[wDVCR.DelDrivers]

[wDVCR.Sony.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Sony DV Device"

[wDVCR.AddReg]
HKR,,OkToHibernate,0x00004003,01
HKR,,DontSuspendIfStreamsAreRunning,0x00004003,01

[wDVCR.Canon.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Canon DV Device"

[wDVCR.AddReg.Win9x]
HKR,,DevLoader,0x00004000,*ntkern
HKR,,NTMPDriver,0x00004000,msdv.sys

[wDVCR.Sharp.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Sharp DV Device"

[wDVCR.CopyDrivers]

[wDVCR.PlugIns]
HKCR,"CLSID\{B5730A90-1A2C-11cf-8C23-00AA006B6814}",,0x00004000,"WDM Streaming IAMExtDevice Interface Handler"
HKCR,"CLSID\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{B5730A90-1A2C-11cf-8C23-00AA006B6814}",,0x00004000,"WDM Streaming IAMExtDevice Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{B5730A90-1A2C-11cf-8C23-00AA006B6814}",IID,0x00004001,90,0A,73,B5,2C,1A,cf,11,8C,23,00,AA,00,6B,68,14
HKCR,"CLSID\{A03CD5F0-3045-11cf-8C44-00AA006B6814}",,0x00004000,"WDM Streaming IAMExtTransport Interface Handler"
HKCR,"CLSID\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814}",,0x00004000,"WDM Streaming IAMExtTransport Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814}",IID,0x00004001,F0,D5,3C,A0,45,30,cf,11,8C,44,00,AA,00,6B,68,14
HKCR,"CLSID\{9B496CE1-811B-11cf-8C77-00AA006B6814}",,0x00004000,"WDM Streaming IAMTimecodeReader Interface Handler"
HKCR,"CLSID\{9B496CE1-811B-11cf-8C77-00AA006B6814}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{9B496CE1-811B-11cf-8C77-00AA006B6814}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{9B496CE1-811B-11cf-8C77-00AA006B6814}",,0x00004000,"WDM Streaming IAMTimecodeReader Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{9B496CE1-811B-11cf-8C77-00AA006B6814}",IID,0x00004001,E1,6C,49,9B,1B,81,cf,11,8C,77,00,AA,00,6B,68,14
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"
HKLM,"System\CurrentControlSet\Control\MediaSets\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"
HKLM,"System\CurrentControlSet\Control\MediaSets\{9B496CE1-811B-11cf-8C77-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"

[wDVCR.Hitachi.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Hitachi DV Device"

[wDVCR.Generic.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"AVC Compliant DV Device"

[wDVCR.PinNames]
HKLM,"System\CurrentControlSet\Control\MediaCategories\{5b21c540-7aee-11d1-883b-006097f05c70}",Name,0x00004000,"DV Vid Out"
HKLM,"System\CurrentControlSet\Control\MediaCategories\{5b21c540-7aee-11d1-883b-006097f05c70}",Display,0x00004001,00,00,00,00
HKLM,"System\CurrentControlSet\Control\MediaCategories\{5b21c541-7aee-11d1-883b-006097f05c70}",Name,0x00004000,"DV A/V Out"
HKLM,"System\CurrentControlSet\Control\MediaCategories\{5b21c541-7aee-11d1-883b-006097f05c70}",Display,0x00004001,00,00,00,00
HKLM,"System\CurrentControlSet\Control\MediaCategories\{5b21c543-7aee-11d1-883b-006097f05c70}",Name,0x00004000,"DV A/V In"
HKLM,"System\CurrentControlSet\Control\MediaCategories\{5b21c543-7aee-11d1-883b-006097f05c70}",Display,0x00004001,00,00,00,00

[wDVCR.Philips.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Philips DV Device"

[wDVCR.Samsung.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Samsung DV Device"

[wDVCR.MEI.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"Panasonic DV Device"

[wDVCR.JVC.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft DV Camera and VCR"
HKR,,Description,0x00004000,"JVC DV Device"

[wDVCR.WIA.AddReg]
HKR,,HardwareConfig,0x00004001,1
HKR,,USDClass,0x00004000,{0527d1d0-88c2-11d2-82c7-00c04f8ec183}

[DestinationDirs]
wDVCR.DelDrivers=10,system
wDVCR.CopyDrivers=10,system32\drivers
