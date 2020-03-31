
%AMDAC97_8111.DeviceDesc% = AMDAC97, PCI\VEN_1022&DEV_746D ; AMD-8111

[DestinationDirs]
AMDAC97.CopyList    = 10,system32\drivers

[AMDAC97]
AlsoInstall     = KS.Registration(ks.inf), WDMAUDIO.Registration(wdmaudio.inf)
CopyFiles       = AMDAC97.CopyList
AddReg          = AMDAC97.AddReg,AMDAC97_NAMES.AddReg,AMDAC97_OEM.AddReg
KnownRegEntries = AC97.KnownRegEntries

[AC97.KnownRegEntries]
IsWin98Gold = keep

[IsWin98Gold]
1 = HKLM,Software\Microsoft\Windows\CurrentVersion,VersionNumber,0,4.10.1998

[AMDAC97.CopyList]
AMDAC97.sys

[AMDAC97.Interfaces]
AddInterface = %KSCATEGORY_AUDIO%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface = %KSCATEGORY_RENDER%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface = %KSCATEGORY_CAPTURE%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface = %KSCATEGORY_AUDIO%,%KSNAME_Topology%,AMDAC97.Interface.Topology

[AMDAC97.Interface.Wave]
AddReg=AMDAC97.I.Wave.AddReg

[AMDAC97.I.Wave.AddReg]
HKR,,CLSID,,%Proxy.CLSID%
HKR,,FriendlyName,,%AMDAC97.Wave.szPname%

[AMDAC97.Interface.Topology]
AddReg=AMDAC97.I.Topo.AddReg

[AMDAC97.I.Topo.AddReg]
HKR,,CLSID,,%Proxy.CLSID%
HKR,,FriendlyName,,%AMDAC97.Topology.szPname%

[AMDAC97.AddReg]
HKR,,AssociatedFilters,,"wdmaud,swmidi,redbook"
HKR,,Driver,,AMDAC97.sys
HKR,,NTMPDriver,,"AMDAC97.sys,sbemul.sys"
HKR,Drivers,SubClasses,,"wave,midi,mixer"
HKR,Drivers\wave\wdmaud.drv,Driver,,wdmaud.drv
HKR,Drivers\midi\wdmaud.drv,Driver,,wdmaud.drv
HKR,Drivers\mixer\wdmaud.drv,Driver,,wdmaud.drv
HKR,Drivers\wave\wdmaud.drv,Description,,%AMDAC97.DeviceDesc%
HKR,Drivers\midi\wdmaud.drv, Description,,%AMDAC97.DeviceDesc%
HKR,Drivers\mixer\wdmaud.drv,Description,,%AMDAC97.DeviceDesc%

[AMDAC97.Services]
AddService = AMDAC97, 0x00000002, AMDAC97_Service_Inst

[AMDAC97_Service_Inst]
DisplayName   = %AMDAC97.SvcDesc%
ServiceType   = 1                  ; SERVICE_KERNEL_DRIVER
StartType     = 3                  ; SERVICE_DEMAND_START
ErrorControl  = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary = %10%\system32\drivers\AMDAC97.sys

[AMDAC97_NAMES.AddReg]
;+
; Nodes
;-

HKLM,%MediaCategories%\%AMDAC97GUID.PhoneVolume%,Name,,%AMDAC97Node.PhoneVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.PhoneVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.PhoneMute%,Name,,%AMDAC97Node.PhoneMute%
HKLM,%MediaCategories%\%AMDAC97GUID.PhoneMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.LineInMute%,Name,,%AMDAC97Node.LineInMute%
HKLM,%MediaCategories%\%AMDAC97GUID.LineInMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.MainMix%,Name,,%AMDAC97Node.MainMix%
HKLM,%MediaCategories%\%AMDAC97GUID.MainMix%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.3DBypass%,Name,,%AMDAC97Node.3DBypass%
HKLM,%MediaCategories%\%AMDAC97GUID.3DBypass%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.3DEnable%,Name,,%AMDAC97Node.3DEnable%
HKLM,%MediaCategories%\%AMDAC97GUID.3DEnable%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.BeepMix%,Name,,%AMDAC97Node.BeepMix%
HKLM,%MediaCategories%\%AMDAC97GUID.BeepMix%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.HPVolume%,Name,,%AMDAC97Node.HPVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.HPVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.HPMute%,Name,,%AMDAC97Node.HPMute%
HKLM,%MediaCategories%\%AMDAC97GUID.HPMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.MonoOutSelect%,Name,,%AMDAC97Node.MonoOutSelect%
HKLM,%MediaCategories%\%AMDAC97GUID.MonoOutSelect%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.WaveInSelect%,Name,,%AMDAC97Node.WaveInSelect%
HKLM,%MediaCategories%\%AMDAC97GUID.WaveInSelect%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.MasterInVolume%,Name,,%AMDAC97Node.MasterInVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.MasterInVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.MasterInMute%,Name,,%AMDAC97Node.MasterInMute%
HKLM,%MediaCategories%\%AMDAC97GUID.MasterInMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.MicInVolume%,Name,,%AMDAC97Node.MicInVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.MicInVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.MicInMute%,Name,,%AMDAC97Node.MicInMute%
HKLM,%MediaCategories%\%AMDAC97GUID.MicInMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.SimulStereo%,Name,,%AMDAC97Node.SimulStereo%
HKLM,%MediaCategories%\%AMDAC97GUID.SimulStereo%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.SurroundVolume%,Name,,%AMDAC97Node.SurroundVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.SurroundVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.SurroundMute%,Name,,%AMDAC97Node.SurroundMute%
HKLM,%MediaCategories%\%AMDAC97GUID.SurroundMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.CenterVolume%,Name,,%AMDAC97Node.CenterVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.CenterVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.CenterMute%,Name,,%AMDAC97Node.CenterMute%
HKLM,%MediaCategories%\%AMDAC97GUID.CenterMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.LFEVolume%,Name,,%AMDAC97Node.LFEVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.LFEVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.LFEMute%,Name,,%AMDAC97Node.LFEMute%
HKLM,%MediaCategories%\%AMDAC97GUID.LFEMute%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.FrontVolume%,Name,,%AMDAC97Node.FrontVolume%
HKLM,%MediaCategories%\%AMDAC97GUID.FrontVolume%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.FrontMute%,Name,,%AMDAC97Node.FrontMute%
HKLM,%MediaCategories%\%AMDAC97GUID.FrontMute%,Display,1,00,00,00,00

;+
; Pins
;-

HKLM,%MediaCategories%\%AMDAC97GUID.Surround%,Name,,%AMDAC97Pin.Surround%
HKLM,%MediaCategories%\%AMDAC97GUID.Surround%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.Center%,Name,,%AMDAC97Pin.Center%
HKLM,%MediaCategories%\%AMDAC97GUID.Center%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.LFE%,Name,,%AMDAC97Pin.LFE%
HKLM,%MediaCategories%\%AMDAC97GUID.LFE%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%AMDAC97GUID.Front%,Name,,%AMDAC97Pin.Front%
HKLM,%MediaCategories%\%AMDAC97GUID.Front%,Display,1,00,00,00,00

[AMDAC97_OEM.AddReg]
;+
; Default register value at driver startup
; Uncomment some one of the lines if you want to overwrite the default setting
; The value in these outcommented lines is the driver default. You can change
; the register values (and uncomment the line) to overwrite the driver default.
; low byte comes first, values are hexadecimal.
;-

;HKR,Settings,MasterVolume,1,0,0    ;0dB
;HKR,Settings,HeadphoneVolume,1,0,0 ;0dB
;HKR,Settings,MonooutVolume,1,0,0   ;0dB
;HKR,Settings,ToneControls,1,F,F    ;bypass
;HKR,Settings,BeepVolume,1,0,0      ;0dB
;HKR,Settings,PhoneVolume,1,8,80    ;muted
;HKR,Settings,MicVolume,1,8,80      ;muted
;HKR,Settings,LineInVolume,1,8,8    ;0dB
;HKR,Settings,CDVolume,1,8,8        ;0dB
;HKR,Settings,VideoVolume,1,8,8     ;0dB
;HKR,Settings,AUXVolume,1,8,8       ;0dB
;HKR,Settings,WaveOutVolume,1,8,8   ;0dB. This register is never touched by the system.
;HKR,Settings,RecordSelect,1,4,4    ;select LiniIn
;HKR,Settings,RecordGain,1,0,0      ;0dB
;HKR,Settings,RecordGainMic,1,0,0   ;0dB
;HKR,Settings,GeneralPurpose,1,0,0  ;pre 3D, 3D off, loudness off, mono=mix, mic1
;HKR,Settings,3DControl,1,0,0       ;0%
;HKR,Settings,PowerDown,1,0,0       ;no power down
;HKR,Settings,ExtAudioCtrl,1,01,40  ;VRA, DACs on, MicIn off
;HKR,Settings,CenterLFEVolume,1,0,0 ;0dB
;HKR,Settings,SurroundVolume,1,0,0  ;0dB

;+
; Configuration
; You can disable some of the input lines by outcommenting some of the lines
; below. This could be necessary if you have a AC97 codec on board that for
; example supports Video input, but you don't have the Video input accessable
; for the user (no plug in).
;-

;HKR,Settings,DisablePCBeep,1,1
;HKR,Settings,DisablePhone,1,1
HKR,Settings,DisableMic2,1,1
HKR,Settings,DisableVideo,1,1
HKR,Settings,DisableAUX,1,1
HKR,Settings,DisableHeadphone,1,1
HKR,Settings,DisableMonoOut,1,1
HKR,Settings,DisableMicIn,1,1
;HKR,Settings,DisableMic,1,1            ;disables all MIC lines, including MIC record.
;HKR,Settings,DisableLineIn,1,1
;HKR,Settings,DisableCD,1,1
;HKR,Settings,DisableSurround,1,1
HKR,Settings,DisableCenterLFE,1,1       ;This is not supported in Win98SE, Win2k, Millennium
;HKR,Settings,ChannelConfig,1,3,0,0,0   ;ChannelConfig set to stereo speakers.

;+
; --- Windows 2000 and XP Specific Sections ---
;-

[AMDAC97.NTX86]
Include=ks.inf,wdmaudio.inf
Needs=KS.Registration,WDMAUDIO.Registration
CopyFiles=AMDAC97.CopyList
AddReg=AMDAC97.AddReg,AMDAC97_NAMES.AddReg,AMDAC97_OEM.AddReg

[AMDAC97.NTX86.Interfaces]
AddInterface=%KSCATEGORY_AUDIO%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface=%KSCATEGORY_RENDER%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface=%KSCATEGORY_CAPTURE%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface=%KSCATEGORY_AUDIO%,%KSNAME_Topology%,AMDAC97.Interface.Topology

[AMDAC97.NTX86.Services]
AddService = AMDAC97, 0x00000002, AMDAC97_Service_Inst

[AMDAC97.NTAMD64]
Include=ks.inf,wdmaudio.inf
Needs=KS.Registration,WDMAUDIO.Registration
CopyFiles=AMDAC97.CopyList
AddReg=AMDAC97.AddReg,AMDAC97_NAMES.AddReg,AMDAC97_OEM.AddReg

[AMDAC97.NTAMD64.Interfaces]
AddInterface=%KSCATEGORY_AUDIO%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface=%KSCATEGORY_RENDER%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface=%KSCATEGORY_CAPTURE%,%KSNAME_Wave%,AMDAC97.Interface.Wave
AddInterface=%KSCATEGORY_AUDIO%,%KSNAME_Topology%,AMDAC97.Interface.Topology

[AMDAC97.NTAMD64.Services]
AddService = AMDAC97, 0x00000002, AMDAC97_Service_Inst




[Strings]
ProviderName                = "AMD"
MfgName                     = "AMD"
DiskDescription             = "AMD AC'97 Audio Controller Driver"
AMDAC97_8111.DeviceDesc     = "AMD-8111 AC'97 Audio Controller Driver"
AMDAC97.DeviceDesc          = "AMD AC'97 Audio Controller Driver"
AMDAC97.Wave.szPname        = "AMD AC'97 Sound"
AMDAC97.Topology.szPname    = "AMD AC'97 Mixer"
MediaCategories             = "SYSTEM\CurrentControlSet\Control\MediaCategories"
Proxy.CLSID                 = "{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
KSCATEGORY_AUDIO            = "{6994AD04-93EF-11D0-A3CC-00A0C9223196}"
KSCATEGORY_RENDER           = "{65E8773E-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_CAPTURE          = "{65E8773D-8F56-11D0-A3B9-00A0C9223196}"
KSNAME_Wave                 = "Wave"
KSNAME_Topology             = "Topology"
AMDAC97.SvcDesc             = "AMD AC'97 Audio Driver (WDM)"

;+
; Node GUIDs (non-localizeable)
;-

AMDAC97GUID.PhoneVolume     = "{3098B7CC-FE10-4210-A598-10955433A5D7}"
AMDAC97GUID.PhoneMute       = "{D2AEAD23-A669-4542-B66F-C8FD1119614E}"
AMDAC97GUID.LineInMute      = "{48353FAF-C70C-43c3-8D13-4F9C7632CF7A}"
AMDAC97GUID.MainMix         = "{3D3B7559-09E4-44a2-9DC1-9F14D7DC2628}"
AMDAC97GUID.3DBypass        = "{79AB7298-1E60-43e8-B600-5DFC90AB538E}"
AMDAC97GUID.3DEnable        = "{4224594A-50F3-4245-87E3-65CFABD437C4}"
AMDAC97GUID.BeepMix         = "{FE063D72-9022-4d9e-B0ED-89EE97981BDA}"
AMDAC97GUID.HPVolume        = "{9DAD8A5F-C2DA-41b0-A54B-D355A3C16A29}"
AMDAC97GUID.HPMute          = "{CA6C3319-CB87-4862-8B98-5325A8440E5E}"
AMDAC97GUID.MonoOutSelect   = "{3162F940-CC7D-454e-9DAA-A9D8BB5E74A0}"
AMDAC97GUID.WaveInSelect    = "{5C4D3FB6-4CBA-4508-98F5-D5C8116FF3D5}"
AMDAC97GUID.MasterInVolume  = "{4A6F0FD3-F8D8-4472-AFA5-82D4F63058B6}"
AMDAC97GUID.MasterInMute    = "{E5307BFA-A923-4093-82CD-33DFED3AD880}"
AMDAC97GUID.MicInVolume     = "{4ABF1F98-C2CD-4a61-8B9F-06752A0C47CC}"
AMDAC97GUID.MicInMute       = "{08B69DF1-112E-45e3-8856-5C301CF67C3B}"
AMDAC97GUID.SimulStereo     = "{D2FC79EF-DD8D-4d83-B241-D2FF8F365255}"
AMDAC97GUID.SurroundVolume  = "{72DEADD0-9DAA-4d68-A706-B09F426D0D2C}"
AMDAC97GUID.SurroundMute    = "{BDA77593-AFCD-4eb5-8583-9976FD4054DA}"
AMDAC97GUID.CenterVolume    = "{FD673E4A-053C-4245-A650-78A53E18661A}"
AMDAC97GUID.CenterMute      = "{45E7740E-6998-4551-A5B3-1044A708EC2D}"
AMDAC97GUID.LFEVolume       = "{01FAF787-D3AF-410d-B948-98174100B9E2}"
AMDAC97GUID.LFEMute         = "{5F7E9EC9-B16C-4869-B6A4-2F491857F67B}"
AMDAC97GUID.FrontVolume     = "{B3E91915-F4E3-4bf7-A0CC-1A274AA0C88D}"
AMDAC97GUID.FrontMute       = "{2844E3A3-9465-4fee-A20D-1B4612273204}"

;+
; Pin GUIDs
;-

AMDAC97GUID.Surround        = "{527A9B43-5BE8-4aa7-A3A0-2860D1558B31}"
AMDAC97GUID.Center          = "{522593F0-1CF5-476c-B834-D80054A84C16}"
AMDAC97GUID.LFE             = "{5BF3D10F-2E6F-480f-800B-0C9FE9CFED79}"
AMDAC97GUID.Front           = "{2F284B68-A3BD-42ec-823A-522BAEE92079}"

;+
; Node Names
;-

AMDAC97Node.PhoneVolume     = "Phone Volume"
AMDAC97Node.PhoneMute       = "Phone Mute"
AMDAC97Node.LineInMute      = "Line In Mute"
AMDAC97Node.MainMix         = "Main Mix"
AMDAC97Node.3DBypass        = "3D Bypass"
AMDAC97Node.3DEnable        = "3D Enable"
AMDAC97Node.BeepMix         = "Beep Mix"
AMDAC97Node.HPVolume        = "Headphone Volume"
AMDAC97Node.HPMute          = "Headphone Mute"
AMDAC97Node.MonoOutSelect   = "Mono Out Select"
AMDAC97Node.WaveInSelect    = "Wave In Select"
AMDAC97Node.MasterInVolume  = "Wave In Volume"
AMDAC97Node.MasterInMute    = "Wave In Mute"
AMDAC97Node.MicInVolume     = "Mic In Volume"
AMDAC97Node.MicInMute       = "Mic In Mute"
AMDAC97Node.SimulStereo     = "Simulated Stereo"
AMDAC97Node.SurroundVolume  = "Rear Speaker Volume"
AMDAC97Node.SurroundMute    = "Rear Speaker Mute"
AMDAC97Node.CenterVolume    = "Center Volume"
AMDAC97Node.CenterMute      = "Center Mute"
AMDAC97Node.LFEVolume       = "Subwoofer Volume"
AMDAC97Node.LFEMute         = "Subwoofer Mute"
AMDAC97Node.FrontVolume     = "Front Volume"
AMDAC97Node.FrontMute       = "Front Mute"

;+
; Pin Names
;-

AMDAC97Pin.Surround         = "Rear Speaker"
AMDAC97Pin.Center           = "Center"
AMDAC97Pin.LFE              = "Subwoofer"
AMDAC97Pin.Front            = "Front Speaker"

