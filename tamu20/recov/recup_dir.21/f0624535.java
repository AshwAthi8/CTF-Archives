;
; Copyright (c) Microsoft Corporation.  All rights reserved.
;
; MSTape.INF -- 
;
;     This file contains installation information for IEEE 1394 Tape Subunit devices.
;
; Changes log:
;
;     Created 12-4-2000; support D-VHS device
;     4-25-2001: Install NULL driver for selective Panasonic subunit not yet supported.
;

[Version]
LayoutFile=Layout.inf
signature="$CHICAGO$"
Class=Media
ClassGUID={4d36e96c-e325-11ce-bfc1-08002be10318}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
; All PnP devices should be excluded from manual AddDevice Applet list
ExcludeFromSelect=*

[Manufacturer]
%Generic%=Generic,NTamd64
%JVC%=JVC,NTamd64
%Panasonic%=Panasonic,NTamd64
%Sony%=Sony,NTamd64


[DestinationDirs]
DefaultDestDir=11               ; LDID_SYS
MSTAPE.DelDrivers=10,system
MSTAPE.CopyDrivers=10,system32\drivers

;---------------------------------------------------------------
;                Generic 
;
;                      AV/C Tape Subunit
;---------------------------------------------------------------
[Generic.NTamd64]
%AVC\Generic&TYP_4.DeviceDesc%=MSTape.Generic,AVC\TYP_4            ; AVC Compliant Tape subunit
%AVC\Generic&TYP_4.DeviceDesc%=MSTape.Generic,AVC\camcorder        ; Camcorder in camera mode

[MSTape.Generic]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     MSTape.AddRegW9x,MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
DelFiles=   MSTAPE.DelDrivers
CopyFiles=  MSTAPE.CopyDrivers


[MSTape.Generic.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
CopyFiles=  MSTAPE.CopyDrivers


[MSTape.Generic.HW]
AddReg=MSTAPE_AddFilter_W9x
[MSTape.Generic.NT.HW]
AddReg=MSTAPE_AddFilter_NT

[MSTape.Generic.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTape.Generic.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTape.Generic.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTape.Generic.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTape.Generic.Interface

[MSTape.Generic.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTape.Generic.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTape.Generic.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTape.Generic.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTape.Generic.Interface

[MSTape.Generic.Interface]
AddReg=MSTape.Generic.Intf.AddReg

[MSTape.Generic.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%MSTAPE.Capture%
HKR,,Description,, %MSTape.Capture%
HKR,,DeviceClassGUID,, %TapeDeviceGUID%


[MSTape.Generic.NT.Services]
AddService = MSTAPE,0x00000002,MSTAPE_ServiceInstall  ; 0x00000002 to indicate functional driver
AddService = AVCSTRM,,AVCSTRM_ServiceInstall

;---------------------------------------------------------------
;                J V C
;
;                      AV/C Tape Subunit
;---------------------------------------------------------------

[JVC.NTamd64]
%AVC\VEN_VICTOR&TYP_4.DeviceDesc%=MSTAPE.JVC,AVC\VICTOR&TYP_4                          ; JVC Tape Device


[MSTAPE.JVC]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     MSTAPE.AddRegW9x,MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
DelFiles=   MSTAPE.DelDrivers
CopyFiles=  MSTAPE.CopyDrivers


[MSTAPE.JVC.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
CopyFiles=  MSTAPE.CopyDrivers



[MSTAPE.JVC.HW]
AddReg=MSTAPE_AddFilter_W9x
[MSTAPE.JVC.NT.HW]
AddReg=MSTAPE_AddFilter_NT



[MSTAPE.JVC.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTAPE.JVC.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTAPE.JVC.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTAPE.JVC.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTAPE.JVC.Interface

[MSTAPE.JVC.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTAPE.JVC.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTAPE.JVC.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTAPE.JVC.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTAPE.JVC.Interface

[MSTAPE.JVC.Interface]
AddReg=MSTAPE.JVC.Intf.AddReg

[MSTAPE.JVC.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%MSTAPE.Capture%
HKR,,Description,, %MSTAPE.JVC.Capture%
HKR,,DeviceClassGUID,, %TapeDeviceGUID%


[MSTAPE.JVC.NT.Services]
AddService = MSTAPE,0x00000002,MSTAPE_ServiceInstall  ; 0x00000002 to indicate functional driver
AddService = AVCSTRM,,AVCSTRM_ServiceInstall


;---------------------------------------------------------------
;                P a n a s o n i c (M E I)
;
;                      AV/C Tape Subunit
;---------------------------------------------------------------

[Panasonic.NTamd64]
%AVC\VEN_E05C&MOD_0&TYP_4&ID_0.DeviceDesc%=MSTAPE.MEI,AVC\VEN_E05C&MOD_0&TYP_4&ID_0           ; Support HD but has no buildin MPEG2 en/decoder
%AVC\Panasonic&TYP_4.DeviceDesc%=MSTAPE.MEI,AVC\Panasonic&TYP_4                               ; All Panasonic Tape subunit
; NULL device (AV/C tuner)
%AVC\VEN_E05C&MOD_0&TYP_5&ID_0.DeviceDesc%=NODRV,AVC\VEN_E05C&MOD_0&TYP_5&ID_0                ; No driver for AV/C Tuner so load NULL driver
%AVC\Panasonic&TYP_5.DeviceDesc%=NODRV,AVC\Panasonic&TYP_5                                    ; All Panasonic Tuner subunit to load NULL driver
; NULL device (AV/C Bulletin board)
%AVC\VEN_E05C&MOD_0&TYP_A&ID_0.DeviceDesc%=NODRV,AVC\VEN_E05C&MOD_0&TYP_A&ID_0                ; No driver for AV/C Bulletin board so load NULL driver
%AVC\Panasonic&TYP_A.DeviceDesc%=NODRV,AVC\Panasonic&TYP_A                                    ; All Panasonic Bulletin board subunit to load NULL driver


[MSTAPE.MEI]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     MSTAPE.AddRegW9x,MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
DelFiles=   MSTAPE.DelDrivers
CopyFiles=  MSTAPE.CopyDrivers

[MSTAPE.MEI.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
CopyFiles=  MSTAPE.CopyDrivers



[MSTAPE.MEI.HW]
AddReg=MSTAPE_AddFilter_W9x
[MSTAPE.MEI.NT.HW]
AddReg=MSTAPE_AddFilter_NT



[MSTAPE.MEI.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTAPE.MEI.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTAPE.MEI.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTAPE.MEI.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTAPE.MEI.Interface

[MSTAPE.MEI.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTAPE.MEI.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTAPE.MEI.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTAPE.MEI.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTAPE.MEI.Interface

[MSTAPE.MEI.Interface]
AddReg=MSTAPE.MEI.Intf.AddReg

[MSTAPE.MEI.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%MSTAPE.Capture%
HKR,,Description,, %MSTAPE.MEI.Capture%
HKR,,DeviceClassGUID,, %TapeDeviceGUID%


[MSTAPE.MEI.NT.Services]
AddService = MSTAPE,0x00000002,MSTAPE_ServiceInstall  ; 0x00000002 to indicate functional driver
AddService = AVCSTRM,,AVCSTRM_ServiceInstall

[NODRV]

[NODRV.Services]
;
; this is blank to just allow the install to succeed
;
AddService = , 0x00000002   ; null service install

;---------------------------------------------------------------
;                S o n y
;
;                      AV/C Tape Subunit
;---------------------------------------------------------------

[Sony.NTamd64]
%AVC\VEN_80046&MOD_0&TYP_4.DeviceDesc%=MSTAPE.Sony,AVC\Sony&MOD_0&TYP_4
%AVC\Sony&DCR-MVDVCR&CAMCORDER.DeviceDesc%=MSTAPE.Sony,AVC\Sony&DCR-MVDVCR&CAMCORDER  


[MSTAPE.Sony]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration
AddReg=     MSTAPE.AddRegW9x,MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
DelFiles=   MSTAPE.DelDrivers
CopyFiles=  MSTAPE.CopyDrivers


[MSTAPE.Sony.NT]
Include=    ks.inf, kscaptur.inf
Needs=      KS.Registration,KSCAPTUR.Registration.NT
AddReg=     MSTAPE.AddReg,MSTAPE.PinNames,MSTAPE.PlugIns
CopyFiles=  MSTAPE.CopyDrivers



[MSTAPE.Sony.HW]
AddReg=MSTAPE_AddFilter_W9x
[MSTAPE.Sony.NT.HW]
AddReg=MSTAPE_AddFilter_NT



[MSTAPE.Sony.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTAPE.Sony.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTAPE.Sony.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTAPE.Sony.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTAPE.Sony.Interface

[MSTAPE.Sony.NT.Interfaces]
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,     MSTAPE.Sony.Interface
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,   MSTAPE.Sony.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,    MSTAPE.Sony.Interface
AddInterface=%KSCATEGORY_RENDER_EXT%,GLOBAL,MSTAPE.Sony.Interface

[MSTAPE.Sony.Interface]
AddReg=MSTAPE.Sony.Intf.AddReg

[MSTAPE.Sony.Intf.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%MSTAPE.Capture%
HKR,,Description,, %MSTAPE.Sony.Capture%
HKR,,DeviceClassGUID,, %TapeDeviceGUID%



[MSTAPE.Sony.NT.Services]
AddService = MSTAPE,0x00000002,MSTAPE_ServiceInstall  ; 0x00000002 to indicate functional driver
AddService = AVCSTRM,,AVCSTRM_ServiceInstall


;---------------------------------------------------------------
;                C o m m o n     S e c t i o n s
;---------------------------------------------------------------

[MSTAPE.AddRegW9x]
; Win9X use NTKERN but Win2000 use the .Service sectrion to load driver
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,MsTape.sys

[MSTAPE.AddReg]
HKR,,OkToHibernate,3,01
HKR,,HardwareConfig,1,1
HKR,,USDClass,,"{0527d1d0-88c2-11d2-82c7-00c04f8ec183}"



[MSTAPE.PinNames]
; MPEG2TS pin name
HKLM,%MediaCategories%\%GUID.MPEG2TSOutput%,Name,,%Pin.MPEG2TSOutput%
HKLM,%MediaCategories%\%GUID.MPEG2TSOutput%,Display,1,00,00,00,00

HKLM,%MediaCategories%\%GUID.MPEG2TSInput%,Name,,%Pin.MPEG2TSInput%
HKLM,%MediaCategories%\%GUID.MPEG2TSInput%,Display,1,00,00,00,00


[MSTAPE.PlugIns]
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



[MSTAPE.DelDrivers]
ks.sys,,,1
stream.sys,,,1
mstape.sys,,,1

[MSTAPE.CopyDrivers]
mstape.sys
stream.sys
avcstrm.sys

[MSTAPE_AddFilter_W9x]
HKR,,"LowerFilters",0x00010000,"avcstrm.sys"  ; Win9X use this "avcstrm.sys" as the driver name ?
[MSTAPE_AddFilter_NT]
HKR,,"LowerFilters",0x00010000,"AVCSTRM"      ; NT use this "AVCSTRM" as Service name


[MSTAPE_ServiceInstall]
; same service section
DisplayName   = %MSTAPE.Capture%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\mstape.sys
Dependencies  = AVCSTRM                       ; loaded before MsTape does!


[AVCSTRM_ServiceInstall]
; same service section for the lower filter driver
DisplayName   = %AVCSTRM.FILTER%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\avcstrm.sys
LoadOrderGroup = Pnp Filter





[Strings]

;----------------
; Non-Localizable
;----------------

; note: only register value is case sensitive, key is not.
ProxyVCap.CLSID="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
MediaCategories="System\CurrentControlSet\Control\MediaCategories"
GUID.MPEG2TSOutput="{2CFF7B83-96F1-47e3-98EC-57BD8A997215}"
GUID.MPEG2TSInput= "{CF4C59A3-ACE3-444b-8C37-0B22661A4A29}"

KSCATEGORY_VIDEO=     "{6994AD05-93EF-11D0-A3CC-00A0C9223196}"
KSCATEGORY_CAPTURE=   "{65E8773D-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_RENDER=    "{65E8773E-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_RENDER_EXT="{cc7bfb41-f175-11d1-a392-00e0291f3959}"

Pin.MPEG2TSOutput="MPEG2TS Out"
Pin.MPEG2TSInput="MPEG2TS In"

SERVICE_KERNEL_DRIVER=1
; PnP should use demand start
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

; Do not localize
MSTAPE.Capture="Microsoft AV/C Tape Subunit Device"   ; FriendlyNames is generic, but the Description is device specific.
AVCSTRM.FILTER="AVC Streaming Filter Driver" 
TapeDeviceGUID="{8C0F6AF2-0EDB-44c1-8AEB-59040BD830ED}"
;DEFINE_GUID(<<name>>, 
;0x8c0f6af2, 0xedb, 0x44c1, 0x8a, 0xeb, 0x59, 0x4, 0xb, 0xd8, 0x30, 0xed);


;----------------
; Localizable
;----------------

Generic="Generic"
Msft="Microsoft"
JVC="JVC"
Panasonic="Panasonic"
Sony="Sony"

;
; Description should be localized.
;

MSTAPE.MEI.Capture="Panasonic AV/C Tape Device"
MSTAPE.JVC.Capture="JVC AV/C Tape Device"
MSTAPE.Sony.Capture="Sony AV/C Tape Device"


;
; Device name should be localized.
;

AVC\Generic&TYP_4.DeviceDesc="AV/C Tape Device"                         ; Generic Tape subunit


AVC\VEN_VICTOR&TYP_4.DeviceDesc="JVC Tape Device"                                ; All JVC/Victor tape subunit

AVC\VEN_E05C&MOD_0&TYP_4&ID_0.DeviceDesc="Panasonic Tape Device"                 ; PV-HD1000
AVC\Panasonic&TYP_4.DeviceDesc="Panasonic Tape Device"                           ; All Panasonic tape subunit

AVC\VEN_E05C&MOD_0&TYP_5&ID_0.DeviceDesc="Panasonic Vendor Unique Subunit"       ; Tuner
AVC\Panasonic&TYP_5.DeviceDesc="Panasonic Vendor Unique Subunit"                 ; Tuner


AVC\VEN_E05C&MOD_0&TYP_A&ID_0.DeviceDesc="Panasonic Vendor Unique Subunit"       ; Bulletin Board
AVC\Panasonic&TYP_A.DeviceDesc="Panasonic Vendor Unique Subunit"                 ; Bulletin Board

AVC\VEN_80046&MOD_0&TYP_4.DeviceDesc="Sony D-VHS Device"                         ; SLD-DC1
AVC\Sony&DCR-MVDVCR&CAMCORDER.DeviceDesc="Sony MVDVCR Device"                    ; Sony MVDVCR Device

;
; PlugIns descrioption
;
PlugIn_IAMExtDevice="WDM Streaming IAMExtDevice Interface Handler"
PlugIn_IAMExtTransport="WDM Streaming IAMExtTransport Interface Handler"
PlugIn_IAMTimecodeReader="WDM Streaming IAMTimecodeReader Interface Handler"
PropPage_DVcrControl="Tape Subunit Device Control Property Page"




[mstape.generic]
CopyFiles=wMSTAPE.CopyDrivers
DelFiles=wMSTAPE.DelDrivers
AddReg=wMSTape.AddRegW9x,wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.generic.nt]
CopyFiles=wMSTAPE.CopyDrivers
AddReg=wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.generic.hw]
AddReg=wMSTAPE_AddFilter_W9x

[mstape.generic.nt.hw]
AddReg=wMSTAPE_AddFilter_NT

[mstape.generic.interface]
AddReg=wMSTape.Generic.Intf.AddReg

[mstape.jvc]
CopyFiles=wMSTAPE.CopyDrivers
DelFiles=wMSTAPE.DelDrivers
AddReg=wMSTAPE.AddRegW9x,wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.jvc.nt]
CopyFiles=wMSTAPE.CopyDrivers
AddReg=wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.jvc.hw]
AddReg=wMSTAPE_AddFilter_W9x

[mstape.jvc.nt.hw]
AddReg=wMSTAPE_AddFilter_NT

[mstape.jvc.interface]
AddReg=wMSTAPE.JVC.Intf.AddReg

[mstape.mei]
CopyFiles=wMSTAPE.CopyDrivers
DelFiles=wMSTAPE.DelDrivers
AddReg=wMSTAPE.AddRegW9x,wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.mei.nt]
CopyFiles=wMSTAPE.CopyDrivers
AddReg=wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.mei.hw]
AddReg=wMSTAPE_AddFilter_W9x

[mstape.mei.nt.hw]
AddReg=wMSTAPE_AddFilter_NT

[mstape.mei.interface]
AddReg=wMSTAPE.MEI.Intf.AddReg

[mstape.sony]
CopyFiles=wMSTAPE.CopyDrivers
DelFiles=wMSTAPE.DelDrivers
AddReg=wMSTAPE.AddRegW9x,wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.sony.nt]
CopyFiles=wMSTAPE.CopyDrivers
AddReg=wMSTAPE.AddReg,wMSTAPE.PinNames,wMSTAPE.PlugIns

[mstape.sony.hw]
AddReg=wMSTAPE_AddFilter_W9x

[mstape.sony.nt.hw]
AddReg=wMSTAPE_AddFilter_NT

[mstape.sony.interface]
AddReg=wMSTAPE.Sony.Intf.AddReg

[wMSTape.Generic.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft AV/C Tape Subunit Device"
HKR,,Description,0x00004000,"Microsoft AV/C Tape Subunit Device"
HKR,,DeviceClassGUID,0x00004000,{8C0F6AF2-0EDB-44c1-8AEB-59040BD830ED}

[wMSTAPE.PinNames]
HKLM,"System\CurrentControlSet\Control\MediaCategories\{2CFF7B83-96F1-47e3-98EC-57BD8A997215}",Name,0x00004000,"MPEG2TS Out"
HKLM,"System\CurrentControlSet\Control\MediaCategories\{2CFF7B83-96F1-47e3-98EC-57BD8A997215}",Display,0x00004001,00,00,00,00
HKLM,"System\CurrentControlSet\Control\MediaCategories\{CF4C59A3-ACE3-444b-8C37-0B22661A4A29}",Name,0x00004000,"MPEG2TS In"
HKLM,"System\CurrentControlSet\Control\MediaCategories\{CF4C59A3-ACE3-444b-8C37-0B22661A4A29}",Display,0x00004001,00,00,00,00

[wMSTAPE_AddFilter_W9x]
HKR,,LowerFilters,0x00014000,avcstrm.sys

[wMSTape.AddRegW9x]
HKR,,DevLoader,0x00004000,*ntkern
HKR,,NTMPDriver,0x00004000,MsTape.sys

[wMSTAPE.MEI.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft AV/C Tape Subunit Device"
HKR,,Description,0x00004000,"Panasonic AV/C Tape Device"
HKR,,DeviceClassGUID,0x00004000,{8C0F6AF2-0EDB-44c1-8AEB-59040BD830ED}

[wMSTAPE.JVC.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft AV/C Tape Subunit Device"
HKR,,Description,0x00004000,"JVC AV/C Tape Device"
HKR,,DeviceClassGUID,0x00004000,{8C0F6AF2-0EDB-44c1-8AEB-59040BD830ED}

[wMSTAPE.DelDrivers]

[wMSTAPE.Sony.Intf.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"Microsoft AV/C Tape Subunit Device"
HKR,,Description,0x00004000,"Sony AV/C Tape Device"
HKR,,DeviceClassGUID,0x00004000,{8C0F6AF2-0EDB-44c1-8AEB-59040BD830ED}

[wMSTAPE.AddReg]
HKR,,OkToHibernate,0x00004003,01
HKR,,HardwareConfig,0x00004001,1
HKR,,USDClass,0x00004000,{0527d1d0-88c2-11d2-82c7-00c04f8ec183}

[wMSTAPE.CopyDrivers]

[wMSTAPE.PlugIns]
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
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"Tape Subunit Device Control Property Page"
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"Tape Subunit Device Control Property Page"
HKLM,"System\CurrentControlSet\Control\MediaSets\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"Tape Subunit Device Control Property Page"
HKLM,"System\CurrentControlSet\Control\MediaSets\{9B496CE1-811B-11cf-8C77-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"Tape Subunit Device Control Property Page"

[wMSTAPE_AddFilter_NT]
HKR,,LowerFilters,0x00014000,AVCSTRM

[DestinationDirs]
wMSTAPE.DelDrivers=10,system
wMSTAPE.CopyDrivers=10,system32\drivers
