; ATIeHome.inf
; Win98/Win2000 Drivers for ATI AIW, AIWPro, TV Wonder, and ViVo video capture and playback devices
; Copyright 2002, ATI Technologies Inc.

[Version]
signature="$CHICAGO$"
Class=MEDIA
ClassGUID={4d36e96c-e325-11ce-bfc1-08002be10318}
Provider=%atitech%
DriverVer=02/01/2005, 6.14.10.6300


;wow64

LayoutFile=Layout.inf

[DestinationDirs]
AtiBt829.CopyDrivers=12 
;;INFDEL;;AtiBt829.CopyCodec=11
ATIXBAR.CopyDrivers=12
WOW64.CopyDrivers=12
ATITUNEP.CopyDrivers=12
ATITVAUDIO.CopyDrivers=12
ATIXSAudio.CopyDrivers=12
MVDCodec.Device.CopyDrivers=12
;----------------
;  ATIRTAudio
;----------------
ativrvxx.CopyDrivers=12
;;INFDEL;;ativrvxx.CopyCodec=11
ativraxx.CopyDrivers=12
DAControl.CopyDriver=11
ativpdxx.CopyDrivers=12
ativttxx.CopyDrivers=12
;wow64
wDAControl.CopyDriver=16425
;----------------
;  ATIVMVXX
;----------------
MVDetection.CopyDriver=11
;wow64
wMVDetection.CopyDriver=16425
;----------------
;  DSP Minicode
;----------------
DSPminicode.CopyDriver=12


[Manufacturer]
%ATI%=ATI.Mfg, NTamd64

[ControlFlags]
ExcludeFromSelect=*

[ATI.Mfg.NTamd64]
;---------------------------------------------------------------
;                Supported PNP IDs:
;---------------------------------------------------------------
%AtiBt829.DeviceDesc%=AtiBt829.Device,DISPLAY\NTativbt32
%AtiBt829.DeviceDesc%=AtiBt829.Device,DISPLAY\NTativbt33
%AtiBt829.DeviceDesc%=AtiBt829.Device,DISPLAY\NTativbt34
%ATIXBAR.DeviceDesc%=ATIXBAR.Device,DISPLAY\NTativxb32
%ATIXBAR.DeviceDesc%=ATIXBAR.Device,DISPLAY\NTativxb33
%ATIXBAR.DeviceDesc%=ATIXBAR.Device,DISPLAY\NTativxb34
%ATITUNEP.DeviceDesc%=ATITUNEP.Device,DISPLAY\NTativtu32
%ATITUNEP.DeviceDesc%=ATITUNEP.Device,DISPLAY\NTativtu33
%ATITUNEP.DeviceDesc%=ATITUNEP.Device,DISPLAY\NTativtu34
%ATITVAUDIO.DeviceDesc%=ATITVAUDIO.Device,DISPLAY\NTativsn32
%ATITVAUDIO.DeviceDesc%=ATITVAUDIO.Device,DISPLAY\NTativsn33
%ATITVAUDIO.DeviceDesc%=ATITVAUDIO.Device,DISPLAY\NTativsn34
%MVDCodec.DeviceDesc%=MVDCodec.Device,DISPLAY\NTativmd32
%MVDCodec.DeviceDesc%=MVDCodec.Device,DISPLAY\NTativmd33
%MVDCodec.DeviceDesc%=MVDCodec.Device,DISPLAY\NTativmd34
%ATIXSAudio.DeviceDesc%=ATIXSAudio.Device,DISPLAY\NTativxs32
%ATIXSAudio.DeviceDesc%=ATIXSAudio.Device,DISPLAY\NTativxs33
%ATIXSAudio.DeviceDesc%=ATIXSAudio.Device,DISPLAY\NTativxs34
%ativrvxx.DeviceDesc%=ativrvxx.Device,DISPLAY\ntativrv32
%ativrvxx.DeviceDesc%=ativrvxx.Device,DISPLAY\ntativrv33
%ativrvxx.DeviceDesc%=ativrvxx.Device,DISPLAY\ntativrv34
%ativraxx.DeviceDesc%=ativraxx.Device,DISPLAY\ntativra32
%ativraxx.DeviceDesc%=ativraxx.Device,DISPLAY\ntativra33
%ativraxx.DeviceDesc%=ativraxx.Device,DISPLAY\ntativra34
%ativpdxx.DeviceDesc%=ativpdxx.Device,DISPLAY\ntativpd32
%ativpdxx.DeviceDesc%=ativpdxx.Device,DISPLAY\ntativpd33
%ativpdxx.DeviceDesc%=ativpdxx.Device,DISPLAY\ntativpd34
%ativttxx.DeviceDesc%=ativttxx.Device,DISPLAY\ntativtt32
%ativttxx.DeviceDesc%=ativttxx.Device,DISPLAY\ntativtt33
%ativttxx.DeviceDesc%=ativttxx.Device,DISPLAY\ntativtt34
;---------------------------------------------------------------

;---------------------------------------------------------------
;                DSP Minicode
;---------------------------------------------------------------

[DSPminicode.CopyDriver]
ativmc20.cod

[DSPminicode.Add.Reg]
HKLM,Software\ATI Technologies\WDMCapture,DSP_Binary,,ativmc20.cod


;---------------------------------------------------------------
;                AtiBt829
;---------------------------------------------------------------

[AtiBt829.Device]
Include  =  ks.inf, kscaptur.inf
Needs    =  KS.Registration,KSCAPTUR.Registration
AddReg   =  AtiBt829.AddReg,MVDetection.Add.Reg,MVProtection.Add.Reg,MVDetectProperty.Add.Reg,Categories,TopologyNodes,PlugIns,Filters,DSPminicode.Add.Reg
;;INFDEL;;UpdateInis= AtiBt829.UpdateIni
CopyFiles=  AtiBt829.CopyDrivers, MVDetection.CopyDriver,DSPminicode.CopyDriver
;, AtiBt829.CopyCodec
DelFiles =  AtiBt829.DelDrivers
;KnownFiles= AtiBt829.KnownFiles

[AtiBt829.Device.NT]
Include  =  ks.inf, kscaptur.inf
Needs    =  KS.Registration,KSCAPTUR.Registration.NT
AddReg   =  AtiBt829.AddReg,MVDetection.Add.Reg,MVProtection.Add.Reg,MVDetectProperty.Add.Reg,Categories,TopologyNodes,PlugIns,Filters,DSPminicode.Add.Reg
;;INFDEL;;UpdateInis= AtiBt829.UpdateIni
CopyFiles=  AtiBt829.CopyDrivers, MVDetection.CopyDriver,DSPminicode.CopyDriver
;, AtiBt829.CopyCodec
DelFiles =  AtiBt829.DelDrivers

[AtiBt829.CopyDrivers]
atinbtxx.sys

;;INFDEL;;;[AtiBt829.CopyCodec]
;;INFDEL;;;msyuv.dll

;;INFDEL;;;[AtiBt829.UpdateIni]
;;INFDEL;;;system.ini, drivers32,,"VIDC.UYVY=msyuv.dll"

;[AtiBt829.KnownFiles]
;atinbtxx.sys=safe

[AtiBt829.DelDrivers]

[AtiBt829.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinbtxx.sys
HKR,,I2cAddress,,0x8a
HKR,,MUX0,,Composite
HKR,,MUX1,,Tuner
HKR,,MUX2,,SVideo
HKR,,DataWidth,,8
HKR,,EmbeddedControl,,true

[AtiBt829.Device.NT.Services]
AddService = AtiBt829,0x00000002,AtiBt829.ServiceInstall

[AtiBt829.ServiceInstall]
DisplayName   = %AtiBt829.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinbtxx.sys

[AtiBt829.Device.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",BTVideoCapture,
AddInterface=%KSCATEGORY_VIDEO%,"GLOBAL",BTVideoCapture,
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",BTVideoCrossbar,

[AtiBt829.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",BTVideoCapture,
AddInterface=%KSCATEGORY_VIDEO%,"GLOBAL",BTVideoCapture,
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",BTVideoCrossbar,

[BTVideoCapture]
AddReg=BTVideoCapture.AddReg

[BTVideoCrossbar]
AddReg=BTVideoXBar.AddReg

[BTVideoCapture.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%AtiBt829.Capture%
HKR,,PageOutWhenUnopened,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[BTVideoXBar.AddReg]
HKR,,CLSID,,{71F96460-78F3-11d0-A18C-00A0C9118956}
HKR,,FriendlyName,,%AtiBt829.Crossbar%

;---------------------------------------------------------------
;                ATIXBAR
;---------------------------------------------------------------

[ATIXBAR.Device]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATIXBAR.AddReg,DSPminicode.Add.Reg
CopyFiles=  ATIXBAR.CopyDrivers,DSPminicode.CopyDriver,WOW64.CopyDrivers
;KnownFiles= ATIXBAR.KnownFiles

[ATIXBAR.Device.NT]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATIXBAR.AddReg,DSPminicode.Add.Reg
CopyFiles=  ATIXBAR.CopyDrivers,DSPminicode.CopyDriver
;KnownFiles= ATIXBAR.KnownFiles

[ATIXBAR.CopyDrivers]
atinxbxx.sys


[WOW64.CopyDrivers]
ativdaww.ax
ativmvww.ax
ativtmww.dll


[ATIXBAR.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinxbxx.sys
HKR,,PageOutWhenUnopened,3,01

;[ATIXBAR.KnownFiles]
;atinxbxx.sys=safe

[ATIXBAR.Device.Interfaces]
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",Crossbar,

[ATIXBAR.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",Crossbar,

[Crossbar]
AddReg=Crossbar.AddReg

[Crossbar.AddReg]
HKR,,CLSID,,{71F96460-78F3-11d0-A18C-00A0C9118956}
HKR,,FriendlyName,,%ATIXBAR.Crossbar%

[ATIXBAR.Device.NT.Services]
AddService = ATIXBAR,0x00000002,ATIXBAR.ServiceInstall

[ATIXBAR.ServiceInstall]
DisplayName   = %ATIXBAR.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinxbxx.sys

;---------------------------------------------------------------
;                ATITUNEP
;---------------------------------------------------------------

[ATITUNEP.Device]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATITUNEP.AddReg
CopyFiles=  ATITUNEP.CopyDrivers
;KnownFiles= ATITUNEP.KnownFiles

[ATITUNEP.Device.NT]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATITUNEP.AddReg
CopyFiles=  ATITUNEP.CopyDrivers
;KnownFiles= ATITUNEP.KnownFiles

[ATITUNEP.CopyDrivers]
atineuxx.sys

;[ATITUNEP.KnownFiles]
;atineuxx.sys=safe

[ATITUNEP.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atineuxx.sys
HKR,,PageOutWhenUnopened,3,01

[ATITUNEP.Device.Interfaces]
AddInterface=%KSCATEGORY_TVTUNER%,"GLOBAL",TvTuner,

[ATITUNEP.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_TVTUNER%,"GLOBAL",TvTuner,

[TvTuner]
AddReg=TvTuner.AddReg

[TvTuner.AddReg]
HKR,,CLSID,,{266EEE40-6C63-11cf-8A03-00AA006ECB65}
HKR,,FriendlyName,,%ATITUNEP.TUNER%

[ATITUNEP.Device.NT.Services]
AddService = ATITUNEP,0x00000002,ATITUNEP.ServiceInstall

[ATITUNEP.ServiceInstall]
DisplayName   = %ATITUNEP.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atineuxx.sys

;---------------------------------------------------------------
;                ATITVAUDIO
;---------------------------------------------------------------

[ATITVAUDIO.Device]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATITVAUDIO.addreg
CopyFiles=  ATITVAUDIO.CopyDrivers
DelFiles =  ATITVAUDIO.DelDrivers

[ATITVAUDIO.Device.NT]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATITVAUDIO.addreg
CopyFiles=  ATITVAUDIO.CopyDrivers
DelFiles =  ATITVAUDIO.DelDrivers

[ATITVAUDIO.CopyDrivers]
atinsnxx.sys

;[ATITVAUDIO.KnownFiles]
;atinsnxx.sys=safe

[ATITVAUDIO.DelDrivers]

[ATITVAUDIO.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinsnxx.sys
HKR,,PageOutWhenUnopened,3,01

[ATITVAUDIO.Device.Interfaces]
; KXPROXY INSTEAD OF KXBAR
;AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",TVSND,
AddInterface=%KSCATEGORY_TVAUDIO%,"GLOBAL",TVSND,

[ATITVAUDIO.Device.NT.Interfaces]
; KXPROXY INSTEAD OF KXBAR
;AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",TVSND,
AddInterface=%KSCATEGORY_TVAUDIO%,"GLOBAL",TVSND,

[TVSND]
AddReg=TVSND.AddReg

[TVSND.AddReg]
HKR,,CLSID,,{71F96462-78F3-11d0-A18C-00A0C9118956}
HKR,,FriendlyName,,%ATITVAUDIO.TVSND%

[ATITVAUDIO.Device.NT.Services]
AddService = ATITVAUDIO,0x00000002,ATITVAUDIO.ServiceInstall

[ATITVAUDIO.ServiceInstall]
DisplayName   = %ATITVAUDIO.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinsnxx.sys


;---------------------------------------------------------------
;                ATIXSAudio
;---------------------------------------------------------------

[ATIXSAudio.Device]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATIXSAudio.addreg,DSPminicode.Add.Reg
CopyFiles=  ATIXSAudio.CopyDrivers,DSPminicode.CopyDriver
DelFiles =  ATIXSAudio.DelDrivers


[ATIXSAudio.Device.NT]
Include  =  ks.inf
Needs    =  KS.Registration
AddReg   =  ATIXSAudio.addreg,DSPminicode.Add.Reg
CopyFiles=  ATIXSAudio.CopyDrivers,DSPminicode.CopyDriver
DelFiles =  ATIXSAudio.DelDrivers

[ATIXSAudio.CopyDrivers]
atinesxx.sys

;[ATIXSAudio.KnownFiles]
;atinesxx.sys=safe

[ATIXSAudio.DelDrivers]

[ATIXSAudio.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinesxx.sys
HKR,,PageOutWhenUnopened,3,01

[ATIXSAudio.Device.Interfaces]
AddInterface=%KSCATEGORY_TVAUDIO%,"GLOBAL",XSTVAudio,
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",XSCrossbar,

[ATIXSAudio.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_TVAUDIO%,"GLOBAL",XSTVAudio,
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",XSCrossbar,

[XSTVAudio]
AddReg=XSTVAudio.AddReg

[XSTVAudio.AddReg]
HKR,,CLSID,,{71F96462-78F3-11d0-A18C-00A0C9118956}
HKR,,FriendlyName,,%ATIXSAudio.Audio%

[XSCrossbar]
AddReg=XSCrossbar.AddReg

[XSCrossbar.AddReg]
HKR,,CLSID,,{71F96460-78F3-11d0-A18C-00A0C9118956}
HKR,,FriendlyName,,%ATIXSAudio.Crossbar%

[ATIXSAudio.Device.NT.Services]
AddService = ATIXSAudio,0x00000002,ATIXSAudio.ServiceInstall

[ATIXSAudio.ServiceInstall]
DisplayName   = %ATIXSAudio.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinesxx.sys


;---------------------------------------------------------------
;                ATIMVCODEC
;---------------------------------------------------------------
[MVDCodec.Device]
AddReg=     MVDCodec.Device.AddReg
CopyFiles=  MVDCodec.Device.CopyDrivers

[MVDCodec.Device.NT]
AddReg=     MVDCodec.Device.NT.AddReg
CopyFiles=  MVDCodec.Device.CopyDrivers

[MVDCodec.Device.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,ativmdxx.sys
HKR,,DebugLevel,3,0

[MVDCodec.Device.NT.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinmdxx.sys
HKR,,DebugLevel,3,0

[MVDCodec.Device.CopyDrivers]
atinmdxx.sys


[MVDCodec.Device.Interfaces]
AddInterface=%KSCATEGORY_VBICODEC%,"GLOBAL",VBICodec,

[MVDCodec.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_VBICODEC%,"GLOBAL",VBICodec,

[VBICodec]
AddReg=VBICodec.AddReg

[VBICodec.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%MVDCodec.VBICodec%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,,,%WDMCodecs%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,FriendlyName,,%WDMCodecs%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,CLSID,,%KSCATEGORY_VBICODEC%

[MVDCodec.Device.Services]
AddService = MVDCODEC,0x00000002,MVDCodec.ServiceInstall

[MVDCodec.Device.NT.Services]
AddService = MVDCODEC,0x00000002,MVDCodec.ServiceInstall

[MVDCodec.ServiceInstall]
DisplayName   = %MVDCodec.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinmdxx.sys

;---------------------------------------------------------------
;                ATIRTVideo
;---------------------------------------------------------------
[ativrvxx.Device]
Include = ks.inf, kscaptur.inf
Needs	= KS.Registration,KSCAPTUR.Registration
AddReg  = ativrvxx.AddReg,MVDetection.Add.Reg,MVProtection.Add.Reg,MVDetectProperty.Add.Reg,PCDetection.Add.Reg,PCProtection.Add.Reg,PCDetectProperty.Add.Reg,Categories,TopologyNodes,PlugIns,Filters,DSPminicode.Add.Reg,VideoCapture.Nodes
;wow64
AddReg	= wMVDetection.Add.Reg,wMVProtection.Add.Reg,wMVDetectProperty.Add.Reg,wPCDetection.Add.Reg,wPCProtection.Add.Reg,wPCDetectProperty.Add.Reg

;;INFDEL;;UpdateInis= ativrvxx.UpdateIni
CopyFiles=  ativrvxx.CopyDrivers, MVDetection.CopyDriver,wMVDetection.CopyDriver,DSPminicode.CopyDriver
DelFiles =  ativrvxx.DelDrivers
;KnownFiles= ativrvxx.KnownFiles

[ativrvxx.Device.NT]
Include = ks.inf, kscaptur.inf
Needs	= KS.Registration,KSCAPTUR.Registration.NT
AddReg	= ativrvxx.AddReg,MVDetection.Add.Reg,MVProtection.Add.Reg,MVDetectProperty.Add.Reg,PCDetection.Add.Reg,PCProtection.Add.Reg,PCDetectProperty.Add.Reg,Categories,TopologyNodes,PlugIns,Filters,DSPminicode.Add.Reg,VideoCapture.Nodes
;wow64
AddReg	= wMVDetection.Add.Reg,wMVProtection.Add.Reg,wMVDetectProperty.Add.Reg,wPCDetection.Add.Reg,wPCProtection.Add.Reg,wPCDetectProperty.Add.Reg

;;INFDEL;;UpdateInis= ativrvxx.UpdateIni
CopyFiles=  ativrvxx.CopyDrivers, MVDetection.CopyDriver,wMVDetection.CopyDriver,DSPminicode.CopyDriver
DelFiles =  ativrvxx.DelDrivers


[ativrvxx.CopyDrivers]
atinevxx.sys

;;INFDEL;;[ativrvxx.CopyCodec]
;;INFDEL;;;msyuv.dll

;;INFDEL;;[ativrvxx.UpdateIni]
;;INFDEL;;;system.ini, drivers32,,"VIDC.UYVY=msyuv.dll"

;[ativrvxx.KnownFiles]
;atinevxx.sys=safe

[ativrvxx.DelDrivers]

[ativrvxx.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinevxx.sys
HKR,,MUX0,,Composite
HKR,,MUX1,,Tuner
HKR,,MUX2,,SVideo
HKR,,DataWidth,,8
HKR,,DebugLevel,3,0
HKR,,EmbeddedControl,,true
;HKR,,OutputEnablePolarity,,1
;HKR,,DefaultDecoderWidth,,720

[ativrvxx.Device.NT.Services]
AddService = atinevxx,0x00000002,ativrvxx.ServiceInstall

[ativrvxx.ServiceInstall]
DisplayName   = %ativrvxx.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinevxx.sys


[ativrvxx.Device.NT.Interfaces] 
AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",VideoCapture,
AddInterface=%KSCATEGORY_CROSSBAR%,"GLOBAL",VideoCrossbar,
AddInterface=%KSCATEGORY_AUDIO_ATI%,"GLOBAL",VideoAtiAudio,

[VideoCapture]
AddReg=VideoCapture.AddReg

[VideoCrossbar]
AddReg=VideoXBar.AddReg

[VideoAtiAudio]
AddReg=VideoAtiAudio.AddReg

[VideoAtiAudio.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%Ativrvxx.Friendly%
HKR,,PageOutWhenUnopened,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[VideoCapture.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%ativrvxx.Capture%
HKR,,PageOutWhenUnopened,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[VideoXBar.AddReg]
HKR,,CLSID,,{71F96460-78F3-11d0-A18C-00A0C9118956}
HKR,,FriendlyName,,%ativrvxx.Crossbar%

[VideoCapture.Nodes]
HKLM,%MediaCategories%\%GUID.AUDIO_IN%,Name,,%Node.AudioIn%


;---------------------------------------------------------------
;                ATIRTAudio
;---------------------------------------------------------------
[ativraxx.Device]
Include	= ks.inf
Needs	= KS.Registration
AddReg	= ativraxx.AddReg, DAControl.AddReg, wDAControl.AddReg, Ativraxx.Nodes,DSPminicode.Add.Reg
CopyFiles=  ativraxx.CopyDrivers,DAControl.CopyDriver,wDAControl.CopyDriver,DSPminicode.CopyDriver
DelFiles =  ativraxx.DelDrivers

[ativraxx.Device.NT]
Include	= ks.inf, wdmaudio.inf
Needs	= KS.Registration, WDMAUDIO.Registration
AddReg	= ativraxx.AddReg, DAControl.AddReg, wDAControl.AddReg, Ativraxx.Nodes,DSPminicode.Add.Reg
CopyFiles=  ativraxx.CopyDrivers,DAControl.CopyDriver,wDAControl.CopyDriver,DSPminicode.CopyDriver
DelFiles =  ativraxx.DelDrivers

[ativraxx.CopyDrivers]
atinraxx.sys

;[ativraxx.KnownFiles]
;atinraxx.sys=safe

[ativraxx.DelDrivers]

[ativraxx.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinraxx.sys
HKR,,PageOutWhenUnopened,3,01
HKR,,DebugLevel,3,0
HKR,Provider,TurboMode,3,0

[ativraxx.Device.NT.Services]
AddService = ativraxx,0x00000002,ativraxx.ServiceInstall

[ativraxx.ServiceInstall]
DisplayName   = %ativraxx.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinraxx.sys

[ativraxx.Device.NT.Interfaces] 
AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",CategoryCapture,
AddInterface=%KSCATEGORY_RENDER%,"GLOBAL",CategoryRender,
AddInterface=%KSCATEGORY_AUDIO%,"GLOBAL",CategoryAudio,

[ativraxx.Device.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,"GLOBAL",CategoryCapture,
AddInterface=%KSCATEGORY_RENDER%,"GLOBAL",CategoryRender,
AddInterface=%KSCATEGORY_AUDIO%,"GLOBAL",CategoryAudio,

[CategoryCapture]
AddReg=AudioCapture.AddReg

[CategoryRender]
AddReg=AudioRender.AddReg

[CategoryAudio]
AddReg=AudioAudio.AddReg

[AudioCapture.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%Ativrvxx.Friendly%
HKR,,PageOutWhenUnopened,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[AudioRender.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%Ativrvxx.Friendly%
HKR,,PageOutWhenUnopened,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[AudioAudio.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%Ativrvxx.Friendly%
HKR,,PageOutWhenUnopened,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[Ativraxx.Nodes]
HKLM,%MediaCategories%\%GUID.SpdifPin%,Name,,%Node.SpdifPin%
HKLM,%MediaCategories%\%GUID.SpdifPin%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.PcmInPin%,Name,,%Node.PcmInPin%
HKLM,%MediaCategories%\%GUID.PcmInPin%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.PcmOutPin%,Name,,%Node.PcmOutPin%
HKLM,%MediaCategories%\%GUID.PcmOutPin%,Display,1,00,00,00,00


;---------------------------------------------------------------
;                ATIRTAudio's ATIVDAXX
;---------------------------------------------------------------
[DAControl.CopyDriver]
ativdaxx.ax

;wow64
[wDAControl.CopyDriver]
ativdaww.ax

[DAControl.AddReg]
HKCR,CLSID\{979F5041-248F-11d3-9EB2-006097A78F9D},,,%PlugIn_DAControl%
HKCR,CLSID\{979F5041-248F-11d3-9EB2-006097A78F9D}\InprocServer32,,,ativdaxx.ax
HKCR,CLSID\{979F5041-248F-11d3-9EB2-006097A78F9D}\InprocServer32,ThreadingModel,,Both

;wow64
[wDAControl.AddReg]
HKCR,CLSID\{979F5041-248F-11d3-9EB2-006097A78F9D},,0x00004000,%PlugIn_DAControl%
HKCR,CLSID\{979F5041-248F-11d3-9EB2-006097A78F9D}\InprocServer32,,0x00004000,ativdaww.ax
HKCR,CLSID\{979F5041-248F-11d3-9EB2-006097A78F9D}\InprocServer32,ThreadingModel,0x00004000,Both

;
; This IID is aggregated for the filter given the CLSID of the property set KSPROPSETID_Audio_ATI
;
;HKLM,System\CurrentControlSet\Control\MediaInterfaces\{979F5041-248F-11d3-9EB2-006097A78F9D},,,%PlugIn_DAControl%
;HKLM,System\CurrentControlSet\Control\MediaInterfaces\{979F5041-248F-11d3-9EB2-006097A78F9D},IID,1,41,50,9F,97,8F,24,D3,11,9E,B2,00,60,97,A7,8F,9D


;---------------------------------------------------------------
;                NTATIVPDXX's SETCTIONS:
;---------------------------------------------------------------
[ativpdxx.Device]
AddReg=ativpdxx.Device.AddReg
CopyFiles=ativpdxx.CopyDrivers
DelFiles =ativpdxx.DelDrivers

[ativpdxx.Device.NT]
AddReg=ativpdxx.Device.NT.AddReg
CopyFiles=ativpdxx.CopyDrivers
DelFiles =ativpdxx.DelDrivers

[ativpdxx.CopyDrivers]
atinpdxx.sys

[ativpdxx.DelDrivers]

[ativpdxx.Device.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,ativpdxx.sys
HKR,,DebugLevel,3,0

[ativpdxx.Device.NT.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,atinpdxx.sys
HKR,,DebugLevel,3,0

[ativpdxx.Device.Interfaces]
AddInterface=%KSCATEGORY_VBICODEC%,"GLOBAL",PCDCodec,

[ativpdxx.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_VBICODEC%,"GLOBAL",PCDCodec,


[PCDCodec]
AddReg=PCDCodec.AddReg

[PCDCodec.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%PCDCodec.FriendlyName%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,,,%WDMCodecs%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,FriendlyName,,%WDMCodecs%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,CLSID,,%KSCATEGORY_VBICODEC%

[ativpdxx.Device.Services]
AddService = PCDCODEC,0x00000002,PCDCodec.ServiceInstall

[ativpdxx.Device.NT.Services]
AddService = PCDCODEC,0x00000002,PCDCodec.NT.ServiceInstall


[PCDCodec.ServiceInstall]
DisplayName   = %ativpdxx.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\ativpdxx.sys

[PCDCodec.NT.ServiceInstall]
DisplayName   = %ativpdxx.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\atinpdxx.sys

[PCDetection.Add.Reg]
HKCR,CLSID\{DBE88301-B6F4-11d3-836B-0050DA0F748C},,,%PlugIn_PCDetection%
HKCR,CLSID\{DBE88301-B6F4-11d3-836B-0050DA0F748C}\InprocServer32,,,ativmvxx.ax
HKCR,CLSID\{DBE88301-B6F4-11d3-836B-0050DA0F748C}\InprocServer32,ThreadingModel,,Both

;wow64
[wPCDetection.Add.Reg]
HKCR,CLSID\{DBE88301-B6F4-11d3-836B-0050DA0F748C},,0x00004000,%PlugIn_PCDetection%
HKCR,CLSID\{DBE88301-B6F4-11d3-836B-0050DA0F748C}\InprocServer32,,0x00004000,ativmvww.ax
HKCR,CLSID\{DBE88301-B6F4-11d3-836B-0050DA0F748C}\InprocServer32,ThreadingModel,0x00004000,Both

;
; This IID is aggregated for the filter given the CLSID of the property set PROPSETID_VIDCAP_PARENTALCONTROL_DETECTION
;
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{DBE88301-B6F4-11d3-836B-0050DA0F748C},,,%PlugIn_PCDetection%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{DBE88301-B6F4-11d3-836B-0050DA0F748C},IID,1,01,83,E8,DB,F4,B6,d3,11,83,6B,00,50,DA,0F,74,8C

[PCProtection.Add.Reg];
HKCR,CLSID\{641CE061-BED2-11d3-BABD-006097326F79},,,%PlugIn_PCProtection%
HKCR,CLSID\{641CE061-BED2-11d3-BABD-006097326F79}\InprocServer32,,,ativmvxx.ax
HKCR,CLSID\{641CE061-BED2-11d3-BABD-006097326F79}\InprocServer32,ThreadingModel,,Both

;wow64
[wPCProtection.Add.Reg];
HKCR,CLSID\{641CE061-BED2-11d3-BABD-006097326F79},,0x00004000,%PlugIn_PCProtection%
HKCR,CLSID\{641CE061-BED2-11d3-BABD-006097326F79}\InprocServer32,,0x00004000,ativmvww.ax
HKCR,CLSID\{641CE061-BED2-11d3-BABD-006097326F79}\InprocServer32,ThreadingModel,0x00004000,Both

; This IID is aggregated for the filter given the CLSID of the property set PROPSETID_VIDCAP_PARENTALCONTROL_PROTECTION
;
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{641CE061-BED2-11d3-BABD-006097326F79},,,%PlugIn_PCProtection%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{641CE061-BED2-11d3-BABD-006097326F79},IID,1,61,E0,1C,64,D2,BE,d3,11,BA,BD,00,60,97,32,6F,79

[PCDetectProperty.Add.Reg];
HKCR,CLSID\{4F33C001-C383-11d3-BABD-006097326F79},,,%PlugIn_PCDetectionPropertyPage%
HKCR,CLSID\{4F33C001-C383-11d3-BABD-006097326F79}\InprocServer32,,,ativmvxx.ax
HKCR,CLSID\{4F33C001-C383-11d3-BABD-006097326F79}\InprocServer32,ThreadingModel,,Both

;wow64
[wPCDetectProperty.Add.Reg];
HKCR,CLSID\{4F33C001-C383-11d3-BABD-006097326F79},,0x00004000,%PlugIn_PCDetectionPropertyPage%
HKCR,CLSID\{4F33C001-C383-11d3-BABD-006097326F79}\InprocServer32,,0x00004000,ativmvww.ax
HKCR,CLSID\{4F33C001-C383-11d3-BABD-006097326F79}\InprocServer32,ThreadingModel,0x00004000,Both

; This IID is aggregated for the PropertySet given the CLSID of the property set PROPSETID_VIDCAP_PARENTALCONTROL_DETECTION
;
HKLM,System\CurrentControlSet\Control\MediaSets\{DBE88301-B6F4-11d3-836B-0050DA0F748C}\PropertyPages\{4F33C001-C383-11d3-BABD-006097326F79},,,%PlugIn_PCDetectionPropertyPage%


;---------------------------------------------------------------
;                NTATIVTTXX's SETCTIONS:
;---------------------------------------------------------------
[ativttxx.Device]
AddReg=ativttxx.Device.AddReg
CopyFiles=ativttxx.CopyDrivers
DelFiles =ativttxx.DelDrivers

[ativttxx.Device.NT]
AddReg=ativttxx.Device.NT.AddReg
CopyFiles=ativttxx.CopyDrivers
DelFiles =ativttxx.DelDrivers

[ativttxx.CopyDrivers]
atinttxx.sys

[ativttxx.DelDrivers]

[ativttxx.Device.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,ATIVTTXX.sys
HKR,,DebugLevel,0,0


[ativttxx.Device.NT.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,Atinttxx.sys
HKR,,DebugLevel,0,0


[ativttxx.Device.Interfaces]
AddInterface=%KSCATEGORY_VBICODEC%,"GLOBAL",TTCodec,

[ativttxx.Device.NT.Interfaces]
AddInterface=%KSCATEGORY_VBICODEC%,"GLOBAL",TTCodec,


[TTCodec]
AddReg=TTCodec.AddReg

[TTCodec.AddReg]
HKR,,CLSID,,%CLSID_Proxy%
HKR,,FriendlyName,,%TTDec.FriendlyName%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,,,%WDMCodecs%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,FriendlyName,,%WDMCodecs%
HKLM,Software\CLASSES\CLSID\%CLSID_AMCat%\Instance\%KSCATEGORY_VBICODEC%,CLSID,,%KSCATEGORY_VBICODEC%

[ativttxx.Device.Services]
AddService = TTDec,0x00000002,TTDec.ServiceInstall

[ativttxx.Device.NT.Services]
AddService = TTDec,0x00000002,TTDec.NT.ServiceInstall


[TTDec.ServiceInstall]
DisplayName   = %ativttxx.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\ATIVTTXX.sys

[TTDec.NT.ServiceInstall]
DisplayName   = %ativttxx.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\ATINTTXX.sys


;---------------------------------------------------------------
;                ATINTVMV's SETCTIONS:
;---------------------------------------------------------------
[MVDetection.CopyDriver]
ativmvxx.ax
ativtmxx.dll

;wow64
[wMVDetection.CopyDriver]
ativmvww.ax
ativtmww.dll

[MVDetection.Add.Reg]
HKCR,CLSID\{02AB0740-C008-11d2-8AFF-00609729B914},,,%PlugIn_MVDetection%
HKCR,CLSID\{02AB0740-C008-11d2-8AFF-00609729B914}\InprocServer32,,,ativmvxx.ax
HKCR,CLSID\{02AB0740-C008-11d2-8AFF-00609729B914}\InprocServer32,ThreadingModel,,Both

;wow64
[wMVDetection.Add.Reg]
HKCR,CLSID\{02AB0740-C008-11d2-8AFF-00609729B914},,0x00004000,%PlugIn_MVDetection%
HKCR,CLSID\{02AB0740-C008-11d2-8AFF-00609729B914}\InprocServer32,,0x00004000,ativmvww.ax
HKCR,CLSID\{02AB0740-C008-11d2-8AFF-00609729B914}\InprocServer32,ThreadingModel,0x00004000,Both

;
; This IID is aggregated for the filter given the CLSID of the property set PROPSETID_VIDCAP_MACROVISION_DETECTION
;
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{02AB0740-C008-11d2-8AFF-00609729B914},,,%PlugIn_MVDetection%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{02AB0740-C008-11d2-8AFF-00609729B914},IID,1,40,07,AB,02,08,C0,d2,11,8A,FF,00,60,97,29,B9,14

[MVProtection.Add.Reg];
HKCR,CLSID\{DDD28680-CBD5-11d2-8AFF-00609729B914},,,%PlugIn_MVProtection%
HKCR,CLSID\{DDD28680-CBD5-11d2-8AFF-00609729B914}\InprocServer32,,,ativmvxx.ax
HKCR,CLSID\{DDD28680-CBD5-11d2-8AFF-00609729B914}\InprocServer32,ThreadingModel,,Both

;wow64
[wMVProtection.Add.Reg];
HKCR,CLSID\{DDD28680-CBD5-11d2-8AFF-00609729B914},,0x00004000,%PlugIn_MVProtection%
HKCR,CLSID\{DDD28680-CBD5-11d2-8AFF-00609729B914}\InprocServer32,,0x00004000,ativmvww.ax
HKCR,CLSID\{DDD28680-CBD5-11d2-8AFF-00609729B914}\InprocServer32,ThreadingModel,0x00004000,Both

; This IID is aggregated for the filter given the CLSID of the property set PROPSETID_VIDCAP_MACROVISION_PROTECTION
;
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{DDD28680-CBD5-11d2-8AFF-00609729B914},,,%PlugIn_MVProtection%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{DDD28680-CBD5-11d2-8AFF-00609729B914},IID,1,80,86,D2,DD,D5,CB,d2,11,8A,FF,00,60,97,29,B9,14

[MVDetectProperty.Add.Reg];
HKCR,CLSID\{42D65080-3A07-11d3-93F2-00609729B914},,,%PlugIn_MVDetectionPropertyPage%
HKCR,CLSID\{42D65080-3A07-11d3-93F2-00609729B914}\InprocServer32,,,ativmvxx.ax
HKCR,CLSID\{42D65080-3A07-11d3-93F2-00609729B914}\InprocServer32,ThreadingModel,,Both

;wow64
[wMVDetectProperty.Add.Reg];
HKCR,CLSID\{42D65080-3A07-11d3-93F2-00609729B914},,0x00004000,%PlugIn_MVDetectionPropertyPage%
HKCR,CLSID\{42D65080-3A07-11d3-93F2-00609729B914}\InprocServer32,,0x00004000,ativmvww.ax
HKCR,CLSID\{42D65080-3A07-11d3-93F2-00609729B914}\InprocServer32,ThreadingModel,0x00004000,Both

; This IID is aggregated for the PropertySet given the CLSID of the property set PROPSETID_VIDCAP_MACROVISION_DETECTION
;
HKLM,System\CurrentControlSet\Control\MediaSets\{02AB0740-C008-11d2-8AFF-00609729B914}\PropertyPages\{42D65080-3A07-11d3-93F2-00609729B914},,,%PlugIn_MVDetectionPropertyPage%


[Strings]

;----------------
; Non-Localizable
;----------------

SERVICE_KERNEL_DRIVER=1
SERVICE_AUTO_START=2
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

;----------------
; Localizable
;----------------

ATI="ATI"
AtiTech="ATI Technologies Inc."

; Driver names under Device Manager
AtiBt829.DeviceDesc=	"ATI WDM Bt829 Video (Microsoft Corporation)"
AtiBt829Pro.DeviceDesc=	"ATI WDM Bt829Pro Video (Microsoft Corporation)"
ativrvxx.DeviceDesc=	"ATI WDM Rage Theater Video (Microsoft Corporation)"
ativraxx.DeviceDesc=	"ATI WDM Rage Theater Audio (Microsoft Corporation)"
ATIXBAR.DeviceDesc=	"ATI WDM Audio Video Crossbar (Microsoft Corporation)"
ATIXSAudio.DeviceDesc=	"ATI WDM TV Audio Crossbar (Microsoft Corporation)"
ATITUNEP.DeviceDesc=	"ATI WDM TV Tuner (Microsoft Corporation)"
ATITVAUDIO.DeviceDesc=	"ATI WDM TV Audio (Microsoft Corporation)"
MVDCodec.DeviceDesc =	"ATI WDM Specialized MVD Codec (Microsoft Corporation)"
ativpdxx.DeviceDesc=	"ATI WDM Specialized PCD Codec (Microsoft Corporation)"
ativttxx.DeviceDesc=	"ATI WDM Teletext Decoder (Microsoft Corporation)"

; Class IDs
CLSID_Proxy="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
CLSID_AMCat="{DA4E3DA0-D07D-11d0-BD50-00A0C911CE86}"

; Categories
KSCATEGORY_CAPTURE=	"{65E8773D-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_RENDER=	"{65E8773E-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_AUDIO=	"{6994AD04-93EF-11D0-A3CC-00A0C9223196}"
KSCATEGORY_VIDEO=	"{6994AD05-93EF-11D0-A3CC-00A0C9223196}"
KSCATEGORY_TVTUNER=	"{a799a800-a46d-11d0-a18c-00a02401dcd4}"
KSCATEGORY_CROSSBAR=	"{a799a801-a46d-11d0-a18c-00a02401dcd4}"
KSCATEGORY_TVAUDIO=	"{a799a802-a46d-11d0-a18c-00a02401dcd4}"
KSCATEGORY_VBICODEC=	"{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
KSCATEGORY_AUDIO_ATI=	"{33D9A762-90C8-11D0-BD43-00A0C911CE86}"

; Misc
WDMCodecs= "WDM Streaming VBI Codecs"

;----------------
;  ATITUNEP
;----------------
ATITUNEP.Tuner=		"ATI TV Tuner"

;----------------
;  ATIXBAR
;----------------
ATIXBAR.Crossbar=	"ATI AV Crossbar"

;----------------
;  ATIXSAudio
;----------------
ATIXSAudio.Audio=	"ATI TV Audio"
ATIXSAudio.Crossbar="ATI TV Audio Crossbar"

;----------------
;  ATITVAUDIO
;----------------
ATITVAUDIO.TVSND=	"ATI TV Audio"

;----------------
;  MVDCodec
;----------------
MVDCodec.VBICodec = "ATI Specialized MVD Codec"

;----------------
;  AtiBt829
;----------------
AtiBt829.Capture=	"ATI Bt829 Capture"
AtiBt829.Crossbar=	"ATI Bt829 Crossbar"

;----------------
;  ATIVRVXX
;----------------
ativrvxx.Capture=	"ATI Rage Theater Video Capture"
GUID.AUDIO_IN =         "{04394D28-52A7-4c46-AED0-65D62CC64DA6}"
Node.AudioIn  =         "Audio In"
ativrvxx.Crossbar=	"ATI Rage Theater Video Crossbar"

;----------------
;  ATIRTAudio
;----------------
Ativrvxx.Friendly=	"ATI Rage Theater Audio"
GUID.SpdifPin=		"{ECDA4882-9501-11d2-BD1E-00105A196FB7}"
GUID.PcmInPin=		"{ECDA4881-9501-11d2-BD1E-00105A196FB7}"
GUID.PcmOutPin=		"{ECDA4880-9501-11d2-BD1E-00105A196FB7}"
Node.SpdifPin=		"S/PDIF"
Node.PcmInPin=		"PCM Render"
Node.PcmOutPin=		"PCM Capture"
MediaCategories=	"SYSTEM\CurrentControlSet\Control\MediaCategories"

;----------------
;  ATIVDAXX
;----------------
PlugIn_DAControl=	"ATI Digital Audio Property Set Interface Handler"


;----------------
;  ATIVPDXX
;----------------
PCDCodec.FriendlyName = "ATI Specialized PCD WDM VBI Codec"
PlugIn_PCDetection="WDM Analogue Video Streaming Parental Control Detection Property Set Interface Handler"
PlugIn_PCProtection="WDM Analogue Video Streaming Parental Control Protection Property Set Interface Handler"
PlugIn_PCDetectionPropertyPage="Parental Control Detection Property Page"

;----------------
;  ATIVTTXX
;----------------
TTDec.FriendlyName = "ATI WDM Teletext Decoder"

;----------------
;  ATINVMXX
;----------------
PlugIn_MVDetection ="WDM Analogue Video Streaming Macrovision Detection Property Set Interface Handler"
PlugIn_MVProtection="WDM Analogue Video Streaming Macrovision Protection Property Set Interface Handler"
PlugIn_MVDetectionPropertyPage="Macrovision Detection Property Page"
