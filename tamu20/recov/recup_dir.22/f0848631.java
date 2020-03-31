
; WAVE.INF -- This file contains descriptions of all the non-WDM
;             audio drivers supported in Windows NT[Version]

[Version]
Signature="$WINDOWS NT$"
ClassGuid={4D36E96C-E325-11CE-BFC1-08002BE10318}
Class=MEDIA
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
;;%CTLMfgName%=Creative, NT$ARCH$
%StdMfg%=StdMfg, NTamd64
%CompaqMfg%=Compaq, NTamd64
%IBMMfg%=IBM, NTamd64

[DestinationDirs]
audstub.CopyFiles   = 12

[Creative.NTamd64]

%*PNPB000.Disabled%=NO_DRV,*PNPB000
%*PNPB001.Disabled%=NO_DRV,*PNPB001
%*PNPB002.Disabled%=NO_DRV,*PNPB002


[NO_DRV]


[StdMfg.NTamd64]
%MS_MMMCI% = MS_MMMCI, MS_MMMCI
%MS_MMVID% = MS_MMVID, MS_MMVID
%MS_MMACM% = MS_MMACM, MS_MMACM
%MS_MMVCD% = MS_MMVCD, MS_MMVCD
%MS_MMDRV% = MS_MMDRV, MS_MMDRV

[MS_MMMCI]
CopyFiles=audstub.CopyFiles
[MS_MMMCI.Services]
AddService=audstub,2,audstub_Service_Inst

[MS_MMVID]
CopyFiles=audstub.CopyFiles
[MS_MMVID.Services]
AddService=audstub,2,audstub_Service_Inst

[MS_MMACM]
CopyFiles=audstub.CopyFiles
[MS_MMACM.Services]
AddService=audstub,2,audstub_Service_Inst

[MS_MMVCD]
CopyFiles=audstub.CopyFiles
[MS_MMVCD.Services]
AddService=audstub,2,audstub_Service_Inst

[MS_MMDRV]
CopyFiles=audstub.CopyFiles
[MS_MMDRV.Services]
AddService=audstub,2,audstub_Service_Inst

[audstub.CopyFiles]
audstub.sys

[audstub_Service_Inst]
DisplayName  = %AudStub%
ServiceType  = 1
StartType    = 3
ErrorControl = 1
ServiceBinary = %12%\audstub.sys

;; Media devices which have no driver
[ControlFlags]
;; *EXCLUDE is a made up ID to prevent rank 1 drivers from showing in list.
ExcludeFromSelect = *EXCLUDE

ExcludeFromSelect=*CPQA0D2
ExcludeFromSelect=*CPQA0D4
ExcludeFromSelect=*CPQA0D6
ExcludeFromSelect=*CPQA0E1
ExcludeFromSelect=*CPQA0E2
ExcludeFromSelect=*CPQA0E4
ExcludeFromSelect=*IBM36E0
ExcludeFromSelect=*IBM36F2
ExcludeFromSelect=*IBM36F1

[Compaq.NTamd64]
%*CPQA0D2.DeviceDesc%=NO_DRV,*EXCLUDE,*CPQA0D2
%*CPQA0D4.DeviceDesc%=NO_DRV,*EXCLUDE,*CPQA0D4
%*CPQA0D6.DeviceDesc%=NO_DRV,*EXCLUDE,*CPQA0D6
%*CPQA0E1.DeviceDesc%=NO_DRV,*EXCLUDE,*CPQA0E1
%*CPQA0E2.DeviceDesc%=NO_DRV,*EXCLUDE,*CPQA0E2
%*CPQA0E4.DeviceDesc%=NO_DRV,*EXCLUDE,*CPQA0E4

[IBM.NTamd64]
%*IBM36E0.DeviceDesc%=NO_DRV,*EXCLUDE,*IBM36E0
%*IBM36F2.DeviceDesc%=NO_DRV,*EXCLUDE,*IBM36F2
%*IBM36F1.DeviceDesc%=NO_DRV,*EXCLUDE,*IBM36F1

[NO_DRV]

[NO_DRV.Services]
AddService = , %SPSVCINST_ASSOCSERVICE%

;
; Localizable text.
;
[Strings]
MSFT = "Microsoft"

CTLMfgName = "Creative Technology Ltd."

*PNPB000.Disabled="Sound Blaster 1.x or compatible (Disabled)"
*PNPB001.Disabled="Sound Blaster 2.0 or compatible (Disabled)"
*PNPB002.Disabled="Sound Blaster Pro or compatible (Disabled)"


SBPro.DeviceDesc   ="Sound Blaster 1.X/2.0/Pro"
OPL3.DeviceDesc    ="OPL2/OPL3 FM Synthesis"

StdMfg   = "(Standard system devices)"
MS_MMMCI = "Media Control Devices"
MS_MMVID = "Video Codecs"
MS_MMACM = "Audio Codecs"
MS_MMVCD = "Legacy Video Capture Devices"
MS_MMDRV = "Legacy Audio Drivers"
AudStub  = "Audio Stub Driver"

CompaqMfg="Compaq"
*CPQA0D2.DeviceDesc="Compaq Modem Audio"
*CPQA0D4.DeviceDesc="Compaq Modem Audio"
*CPQA0D6.DeviceDesc="Compaq Presario Bezel Volume Control"
*CPQA0E1.DeviceDesc="Compaq TV Tuner"
*CPQA0E2.DeviceDesc="Compaq TV Tuner"
*CPQA0E4.DeviceDesc="Compaq Modem Audio"

IBMMfg="IBM"
*IBM36E0.DeviceDesc="Mwave DSP Processor"
*IBM36F2.DeviceDesc="Mwave SoundBlaster Compatibility"
*IBM36F1.DeviceDesc="Mwave Midi Synthesizer"

SPSVCINST_ASSOCSERVICE = 0x00000002

