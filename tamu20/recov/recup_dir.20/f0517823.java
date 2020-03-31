
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
signature="$CHICAGO$"
Class=MEDIA
ClassGUID={4d36e96c-e325-11ce-bfc1-08002be10318}
Provider=%Msft%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[DestinationDirs]
DefaultDestDir=11
VfWWDM32.DelFile=10 ; delete windows\vfwwdm32.dll on Windows upgrade
ColorspaceCodecs.CopyCodec=11

[KSCAPTUR.Registration]
AddReg=VfWWDM,Categories,TopologyNodes,PlugIns,Filters,BdaDevice.RunOnce.AddReg
DelFiles=VfWWDM32.DelFile
CopyFiles=Filters.Files,VfWWDM.Files,VfWWDM32.Files,ColorspaceCodecs.CopyCodec
UpdateInis=VfWWDM.UpdateInis,ColorspaceCodecs.UpdateIni

[KSCAPTUR.Registration.NT]
AddReg=VfWWDM.NT,Categories,TopologyNodes,PlugIns,Filters,VfWWDM.AddReg.NT,BdaDevice.RunOnce.AddReg.NT
CopyFiles=Filters.Files,VfWWDM32.Files,ColorspaceCodecs.CopyCodec
UpdateInis=ColorspaceCodecs.UpdateIni

[ColorspaceCodecs.UpdateIni]
system.ini,drivers32,,"VIDC.IYUV=iyuv_32.dll"
system.ini,drivers32,,"VIDC.UYVY=msyuv.dll"
system.ini,drivers32,,"VIDC.YUY2=msyuv.dll"
system.ini,drivers32,,"VIDC.YVU9=tsbyuv.dll"
system.ini,drivers32,,"VIDC.YVYU=msyuv.dll"

[ColorspaceCodecs.CopyCodec]
iyuv_32.dll
msyuv.dll
tsbyuv.dll

[VfWWDM]
HKLM,%MediaResourcesMSVideo%\MSVideo.VFWWDM,"Description",,"Microsoft WDM Image Capture"
HKLM,%MediaResourcesMSVideo%\MSVideo.VFWWDM,"FriendlyName",,"Microsoft WDM Image Capture"
HKLM,%MediaResourcesMSVideo%\MSVideo.VFWWDM,"Driver",,"vfwwdm.drv"

[VfWWDM.NT]
HKLM,%MediaResourcesMSVideo%\MSVideo.VFWWDM,"Description",,"Microsoft WDM Image Capture (Win32)"
HKLM,%MediaResourcesMSVideo%\MSVideo.VFWWDM,"FriendlyName",,"Microsoft WDM Image Capture (Win32)"
HKLM,%MediaResourcesMSVideo%\MSVideo.VFWWDM,"Driver",,"vfwwdm32.dll"

[VfWWDM.AddReg.NT]
HKLM,%MMDriverDesc%,vfwwdm32.dll,,%VfWWDMDriverDesc%
HKLM,%MMDrivers%,MSVideo8,,VfWWDM32.dll

[VfWWDM.UpdateInis]
system.ini,drivers,,"MSVideo.VfWWDM=vfwwdm.drv"

[VfWWDM32.DelFile]
; Delete vfwwdm32.dll out of \windows directory for Windows upgrade system; NT is not affected.
vfwwdm32.dll 

[VfWWDM.Files]
; Memphis's 16bit VfWWDM video capture driver and interface with VfW appl.
; in windows\system directory
vfwwdm.drv

[VfWWDM32.Files]
; Memphis's 32bit helper DLL, serving vfwwdm.drv, it interfaces with WDM driver.
; NT's 32bit VfWWDM video capture driver (interface to appl & driver)
vfwwdm32.dll


[Filters]
HKCR,CLSID\{266EEE40-6C63-11cf-8A03-00AA006ECB65},,,%Filter_TVTuner%
HKCR,CLSID\{266EEE40-6C63-11cf-8A03-00AA006ECB65}\InprocServer32,,,kstvtune.ax
HKCR,CLSID\{266EEE40-6C63-11cf-8A03-00AA006ECB65}\InprocServer32,ThreadingModel,,Both
HKCR,CLSID\{266EEE41-6C63-11cf-8A03-00AA006ECB65},,,%PropPage_TVTuner%
HKCR,CLSID\{266EEE41-6C63-11cf-8A03-00AA006ECB65}\InprocServer32,,,kstvtune.ax
HKCR,CLSID\{266EEE41-6C63-11cf-8A03-00AA006ECB65}\InprocServer32,ThreadingModel,,Both

HKCR,CLSID\{71F96460-78F3-11d0-A18C-00A0C9118956},,,%Filter_XBar%
HKCR,CLSID\{71F96460-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,ksxbar.ax
HKCR,CLSID\{71F96460-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
HKCR,CLSID\{71F96461-78F3-11d0-A18C-00A0C9118956},,,%PropPage_XBar%
HKCR,CLSID\{71F96461-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,ksxbar.ax
HKCR,CLSID\{71F96461-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both

HKCR,CLSID\{71F96462-78F3-11d0-A18C-00A0C9118956},,,%Filter_TVAudio%
HKCR,CLSID\{71F96462-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,ksxbar.ax
HKCR,CLSID\{71F96462-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
HKCR,CLSID\{71F96463-78F3-11d0-A18C-00A0C9118956},,,%PropPage_TVAudio%
HKCR,CLSID\{71F96463-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,ksxbar.ax
HKCR,CLSID\{71F96463-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both

[Filters.Files]
kstvtune.ax
ksxbar.ax
kswdmcap.ax
vidcap.ax


[Categories]
HKCR,%ActiveMovieCategories%\%GUID.TvTuner%,CLSID,,%GUID.TvTuner%
HKCR,%ActiveMovieCategories%\%GUID.TvTuner%,FriendlyName,,%Category_TvTunerDevices%
HKCR,%ActiveMovieCategories%\%GUID.TvAudioFilter%,CLSID,,%GUID.TvAudioFilter%
HKCR,%ActiveMovieCategories%\%GUID.TvAudioFilter%,FriendlyName,,%Category_TvAudioDevices%
HKCR,%ActiveMovieCategories%\%GUID.Crossbar%,CLSID,,%GUID.Crossbar%
HKCR,%ActiveMovieCategories%\%GUID.Crossbar%,FriendlyName,,%Category_CrossbarDevices%
HKCR,%ActiveMovieCategories%\%GUID.Encoder%,CLSID,,%GUID.Encoder%
HKCR,%ActiveMovieCategories%\%GUID.Encoder%,FriendlyName,,%Category_Encoder%
HKCR,%ActiveMovieCategories%\%GUID.Multiplexer%,CLSID,,%GUID.Multiplexer%
HKCR,%ActiveMovieCategories%\%GUID.Multiplexer%,FriendlyName,,%Category_Multiplexer%


[TopologyNodes]
HKLM,%MediaCategories%\%GUID.CapturePin%,Name,,%Node.CapturePin%
HKLM,%MediaCategories%\%GUID.CapturePin%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.Preview%,Name,,%Node.Preview%
HKLM,%MediaCategories%\%GUID.Preview%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.AnalogVideoIn%,Name,,%Node.AnalogVideoIn%
HKLM,%MediaCategories%\%GUID.AnalogVideoIn%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VBI%,Name,,%Node.VBI%
HKLM,%MediaCategories%\%GUID.VBI%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VP%,Name,,%Node.VP%
HKLM,%MediaCategories%\%GUID.VP%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.NABTS%,Name,,%Node.NABTS%
HKLM,%MediaCategories%\%GUID.NABTS%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.EDS%,Name,,%Node.EDS%
HKLM,%MediaCategories%\%GUID.EDS%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.Teletext%,Name,,%Node.Teletext%
HKLM,%MediaCategories%\%GUID.Teletext%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.CC%,Name,,%Node.CC%
HKLM,%MediaCategories%\%GUID.CC%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.Still%,Name,,%Node.Still%
HKLM,%MediaCategories%\%GUID.Still%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.Timecode%,Name,,%Node.Timecode%
HKLM,%MediaCategories%\%GUID.Timecode%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VPVBI%,Name,,%Node.VPVBI%
HKLM,%MediaCategories%\%GUID.VPVBI%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.Encoder%,Name,%Node.Encoder%
HKLM,%MediaCategories%\%GUID.Multiplexer%,Display,1,00,00,00,00

[PlugIns]
;
; Data Type Handlers
;

; WDM Streaming VideoInfoHeader Data Type Handler (Specifier, Format)
HKCR,CLSID\{05589f80-c356-11ce-bf01-00aa0055595a},,,%PlugIn_VideoInfoHeaderHandler%
HKCR,CLSID\{05589f80-c356-11ce-bf01-00aa0055595a}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{05589f80-c356-11ce-bf01-00aa0055595a}\InprocServer32,ThreadingModel,,Both

; WDM Streaming VideoInfoHeader2 Data Type Handler (Specifier, Format)
HKCR,CLSID\{f72a76A0-eb0a-11d0-ace4-0000c0cc16ba},,,%PlugIn_VideoInfoHeader2Handler%
HKCR,CLSID\{f72a76A0-eb0a-11d0-ace4-0000c0cc16ba}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{f72a76A0-eb0a-11d0-ace4-0000c0cc16ba}\InprocServer32,ThreadingModel,,Both

; WDM Streaming AnalogVideo Data Type Handler (Specifier, Format)
HKCR,CLSID\{0482DDE0-7817-11cf-8A03-00AA006ECB65},,,%PlugIn_AnalogVideoHandler%
HKCR,CLSID\{0482DDE0-7817-11cf-8A03-00AA006ECB65}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{0482DDE0-7817-11cf-8A03-00AA006ECB65}\InprocServer32,ThreadingModel,,Both

; WDM Streaming VBIInfoHeader Data Type Handler (Specifier, Format)
HKCR,CLSID\{F72A76E0-EB0A-11d0-ACE4-0000C0CC16BA},,,%PlugIn_VBIHandler%
HKCR,CLSID\{F72A76E0-EB0A-11d0-ACE4-0000C0CC16BA}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{F72A76E0-EB0A-11d0-ACE4-0000C0CC16BA}\InprocServer32,ThreadingModel,,Both


;
; Interfaces
;

; IAMVideoProcAmp
HKCR,CLSID\{C6E13360-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMVideoProcAmp%
HKCR,CLSID\{C6E13360-30AC-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{C6E13360-30AC-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMVideoProcAmp%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956},IID,1,60,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56

;IAMCameraControl
HKCR,CLSID\{C6E13370-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMCameraControl%
HKCR,CLSID\{C6E13370-30AC-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{C6E13370-30AC-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMCameraControl%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956},IID,1,70,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56

;IAMAnalogVideoDecoder
HKCR,CLSID\{C6E13350-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMAnalogVideoDecoder%
HKCR,CLSID\{C6E13350-30AC-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{C6E13350-30AC-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13350-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMAnalogVideoDecoder%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13350-30AC-11d0-A18C-00A0C9118956},IID,1,50,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56

;IAMVideoCompression
HKCR,CLSID\{C6E13343-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMVideoCompression%
HKCR,CLSID\{C6E13343-30AC-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{C6E13343-30AC-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13343-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMVideoCompression%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13343-30AC-11d0-A18C-00A0C9118956},IID,1,43,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56

;IAMDroppedFrames
HKCR,CLSID\{C6E13344-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMDroppedFrames%
HKCR,CLSID\{C6E13344-30AC-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{C6E13344-30AC-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13344-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IAMDroppedFrames%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{C6E13344-30AC-11d0-A18C-00A0C9118956},IID,1,44,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56

;IAMVideoControl
HKCR,CLSID\{6A2E0670-28E4-11d0-A18C-00A0C9118956},,,%PlugIn_IAMVideoControl%
HKCR,CLSID\{6A2E0670-28E4-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{6A2E0670-28E4-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; This IID is aggregated for the filter given the CLSID of the property set
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{6A2E0670-28E4-11d0-A18C-00A0C9118956},,,%PlugIn_IAMVideoControl%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{6A2E0670-28E4-11d0-A18C-00A0C9118956},IID,1,70,06,2E,6A,E4,28,d0,11,A1,8C,00,A0,C9,11,89,56

;IVideoEncoder
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{B43C4EEC-8C32-4791-9102-508ADA5EE8E7},,,%PlugIn_IVideoEncoder%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{B43C4EEC-8C32-4791-9102-508ADA5EE8E7},IID,1,3B,7C,99,02,1B,8E,0E,46,92,70,54,5E,0D,E9,56,3E

HKLM,System\CurrentControlSet\Control\MediaInterfaces\{7ff0997a-1999-4286-a73c-622b8814e7eb},,,%PlugIn_IVideoEncoder%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{7ff0997a-1999-4286-a73c-622b8814e7eb},IID,1,c7,b4,1d,90,ce,31,a2,41,85,dc,8f,a0,bf,41,b8,da

HKLM,System\CurrentControlSet\Control\MediaInterfaces\{b05dabd9-56e5-4fdc-afa4-8a47e91f1c9c},,,%PlugIn_IVideoEncoder%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{b05dabd9-56e5-4fdc-afa4-8a47e91f1c9c},IID,1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00

; IKsTopologyInfo
HKCR,CLSID\{720D4AC0-7533-11D0-A5D6-28DB04C10000},,,%PlugIn_IKsTopologyInfo%
HKCR,CLSID\{720D4AC0-7533-11D0-A5D6-28DB04C10000}\InprocServer32,,,vidcap.ax
HKCR,CLSID\{720D4AC0-7533-11D0-A5D6-28DB04C10000}\InprocServer32,ThreadingModel,,Both
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{720D4AC0-7533-11D0-A5D6-28DB04C10000},,,%PlugIn_IKsTopologyInfo%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\{720D4AC0-7533-11D0-A5D6-28DB04C10000},IID,1,C0,4A,0D,72,33,75,D0,11,A5,D6,28,DB,04,C1,00,00

; ICameraControl
HKCR,CLSID\{A0227FFC-3AA7-4dc3-9FD7-125745C9EAF6},,,%PlugIn_ICameraControl%
HKCR,CLSID\{A0227FFC-3AA7-4dc3-9FD7-125745C9EAF6}\InprocServer32,,,vidcap.ax
HKCR,CLSID\{A0227FFC-3AA7-4dc3-9FD7-125745C9EAF6}\InprocServer32,ThreadingModel,,Both
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_ICameraControl%
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956},IID,1,5D,78,A1,2B,1B,4D,EF,44,85,E8,C7,F1,D3,F2,01,84
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956},CLSID,1,FC,7F,22,A0,A7,3A,c3,4d,9F,D7,12,57,45,C9,EA,F6

; IVideoProcAmp
HKCR,CLSID\{291EE2A7-BFA5-4e9e-A358-C93655556A6C},,,%PlugIn_IVideoProcAmp%
HKCR,CLSID\{291EE2A7-BFA5-4e9e-A358-C93655556A6C}\InprocServer32,,,vidcap.ax
HKCR,CLSID\{291EE2A7-BFA5-4e9e-A358-C93655556A6C}\InprocServer32,ThreadingModel,,Both
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956},,,%PlugIn_IVideoProcAmp%
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956},IID,1,0E,56,50,40,A7,42,3a,41,85,C2,09,26,9A,2D,0F,44
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956},CLSID,1,A7,E2,1E,29,A5,BF,9e,4E,A3,58,C9,36,55,55,6A,6C

; ISelector
HKCR,CLSID\{7751F46E-39B2-4b50-A7E3-23EF598ECD85},,,%PlugIn_ISelector%
HKCR,CLSID\{7751F46E-39B2-4b50-A7E3-23EF598ECD85}\InprocServer32,,,vidcap.ax
HKCR,CLSID\{7751F46E-39B2-4b50-A7E3-23EF598ECD85}\InprocServer32,ThreadingModel,,Both
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{1ABDAECA-68B6-4F83-9371-B413907C7B9F},,,%PlugIn_ISelector%
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{1ABDAECA-68B6-4F83-9371-B413907C7B9F},IID,1,CA,AE,BD,1A,B6,68,83,4F,93,71,B4,13,90,7C,7B,9F
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{1ABDAECA-68B6-4F83-9371-B413907C7B9F},CLSID,1,6E,F4,51,77,B2,39,50,4B,A7,E3,23,EF,59,8E,CD,85

; Property Object
HKCR,CLSID\{ECE71064-011D-45b7-AEF2-3B626985E937},,,%PlugIn_PropertyObject%
HKCR,CLSID\{ECE71064-011D-45b7-AEF2-3B626985E937}\InprocServer32,,,vidcap.ax
HKCR,CLSID\{ECE71064-011D-45b7-AEF2-3B626985E937}\InprocServer32,ThreadingModel,,Both

;
; Property Pages
;

; VideoProcAmp Property Page
HKCR,CLSID\{71F96464-78F3-11d0-A18C-00A0C9118956},,,%PropPage_VideoProcAmp%
HKCR,CLSID\{71F96464-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{71F96464-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; Associate the property set with the above property page
HKLM,System\CurrentControlSet\Control\MediaSets\{C6E13360-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96464-78F3-11d0-A18C-00A0C9118956},,,%PropPage_VideoProcAmp%

; CameraControl Property Page
HKCR,CLSID\{71F96465-78F3-11d0-A18C-00A0C9118956},,,%PropPage_CameraControl%
HKCR,CLSID\{71F96465-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{71F96465-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; Associate the property set with the above property page
HKLM,System\CurrentControlSet\Control\MediaSets\{C6E13370-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96465-78F3-11d0-A18C-00A0C9118956},,,%PropPage_CameraControl%

; VideoDecoder Property Page
HKCR,CLSID\{71F96466-78F3-11d0-A18C-00A0C9118956},,,%PropPage_VideoDecoder%
HKCR,CLSID\{71F96466-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{71F96466-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; Associate the property set with the above property page
HKLM,System\CurrentControlSet\Control\MediaSets\{C6E13350-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96466-78F3-11d0-A18C-00A0C9118956},,,%PropPage_VideoDecoder%

; VideoStreamConfig Property Page
HKCR,CLSID\{71F96467-78F3-11d0-A18C-00A0C9118956},,,%PropPage_VideoStreamConfig%
HKCR,CLSID\{71F96467-78F3-11d0-A18C-00A0C9118956}\InprocServer32,,,kswdmcap.ax
HKCR,CLSID\{71F96467-78F3-11d0-A18C-00A0C9118956}\InprocServer32,ThreadingModel,,Both
; Associate the property set with the above property page
HKLM,System\CurrentControlSet\Control\MediaSets\{C6E13340-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96467-78F3-11d0-A18C-00A0C9118956},,,%PropPage_VideoStreamConfig%

HKLM,System\CurrentControlSet\Control\MediaCategories\%GUID.CapturePin%\PropertyPages\{71F96467-78F3-11d0-A18C-00A0C9118956},,,
HKLM,System\CurrentControlSet\Control\MediaCategories\%GUID.Preview%\PropertyPages\{71F96467-78F3-11d0-A18C-00A0C9118956},,,

[BdaDevice.RunOnce.AddReg]

; Install closed-captioning codec
HKLM,%RunOnce%,"CCDECODE0",,"rundll32.exe streamci,StreamingDeviceSetup %CC.DeviceId%,GLOBAL,%CC.VBIcatID%,%17%\CCDECODE.inf,CCDECODE.Interface.Install"
; Install NABTS codec
HKLM,%RunOnce%,"nabtsfec0",,"rundll32.exe streamci,StreamingDeviceSetup %NABTS.DeviceId%,GLOBAL,%NABTS.VBIcatID%,%17%\nabtsfec.inf,NABTSFEC.Interface.Install"
; Install WST codec
HKLM,%RunOnce%,"WSTCODEC0",,"rundll32.exe streamci,StreamingDeviceSetup %WSTCodec.DeviceId%,GLOBAL,%WSTCodec.VBIcatID%,%17%\WSTCODEC.inf,WSTCODEC.Interface.Install"
; Install Slip filter
HKLM,%RunOnce%,"SLIP0",,"rundll32.exe streamci,StreamingDeviceSetup %Slip.DeviceId%,GLOBAL,%GUID.BdaComponent%,%17%\slip.inf,VBIcodec"
; Install IPSink filter
HKLM,%RunOnce%,"STREAMIP0",,"rundll32.exe streamci,StreamingDeviceSetup %StreamIP.DeviceId%,GLOBAL,%GUID.BdaRenderer%,%17%\streamip.inf,BDAcodec"
; Install NdisIP miniport
HKLM,Enum\Root\NDISIP\0000,HardwareID,,"NDISIP"


[BdaDevice.RunOnce.AddReg.NT]

; Install closed-captioning codec
HKLM,%RunOnce%,"CCDECODE0",,"rundll32.exe streamci,StreamingDeviceSetup %CC.DeviceId%,GLOBAL,%CC.VBIcatID%,%17%\CCDECODE.inf,CCDECODE.Interface.Install"
; Install NABTS codec
HKLM,%RunOnce%,"nabtsfec0",,"rundll32.exe streamci,StreamingDeviceSetup %NABTS.DeviceId%,GLOBAL,%NABTS.VBIcatID%,%17%\nabtsfec.inf,NABTSFEC.Interface.Install"
; Install WST codec
HKLM,%RunOnce%,"WSTCODEC0",,"rundll32.exe streamci,StreamingDeviceSetup %WSTCodec.DeviceId%,GLOBAL,%WSTCodec.VBIcatID%,%17%\WSTCODEC.inf,WSTCODEC.Interface.Install"
; Install Slip filter
HKLM,%RunOnce%,"SLIP0",,"rundll32.exe streamci,StreamingDeviceSetup %Slip.DeviceId%,GLOBAL,%GUID.BdaComponent%,%17%\slip.inf,VBIcodec"
; Install IPSink filter
HKLM,%RunOnce%,"STREAMIP0",,"rundll32.exe streamci,StreamingDeviceSetup %StreamIP.DeviceId%,GLOBAL,%GUID.BdaRenderer%,%17%\streamip.inf,BDAcodec"
; Install NdisIP miniport
HKLM,%RunOnce%,"NDISIP0",,"rundll32.exe streamci,StreamingDeviceSetup %NdisIP.DeviceId%,NDISIP,%NdisIP.GUID.BDANetInterface%,%17%\ndisip.inf,NdisIP.Reg"

































[Strings]
Msft="Microsoft"
; non-localizeable
ActiveMovieCategories="CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance"
GUID.TvTuner="{A799A800-A46D-11d0-A18C-00A02401DCD4}"
GUID.Crossbar="{A799A801-A46D-11d0-A18C-00A02401DCD4}"
GUID.TvAudioFilter="{A799A802-A46D-11d0-A18C-00A02401DCD4}"
GUID.CapturePin="{FB6C4281-0353-11d1-905F-0000C0CC16BA}"
GUID.Preview="{FB6C4282-0353-11d1-905F-0000C0CC16BA}"
GUID.AnalogVideoIn="{FB6C4283-0353-11d1-905F-0000C0CC16BA}"
GUID.VBI="{FB6C4284-0353-11d1-905F-0000C0CC16BA}"
GUID.VP="{FB6C4285-0353-11d1-905F-0000C0CC16BA}"
GUID.NABTS="{FB6C4286-0353-11d1-905F-0000C0CC16BA}"
GUID.EDS="{FB6C4287-0353-11d1-905F-0000C0CC16BA}"
GUID.Teletext="{FB6C4288-0353-11d1-905F-0000C0CC16BA}"
GUID.CC="{FB6C4289-0353-11d1-905F-0000C0CC16BA}"
GUID.Still="{FB6C428a-0353-11d1-905F-0000C0CC16BA}"
GUID.Timecode="{FB6C428b-0353-11d1-905F-0000C0CC16BA}"
GUID.VPVBI="{FB6C428c-0353-11d1-905F-0000C0CC16BA}"
GUID.Encoder="{19689BF6-C384-48FD-AD51-90E58C79F70B}"
GUID.Multiplexer="{7A5DE1D3-01A1-452C-B481-4FA2B96271E8}"
MediaCategories="SYSTEM\CurrentControlSet\Control\MediaCategories"
MediaResourcesMSVideo="SYSTEM\CurrentControlSet\Control\MediaResources\msvideo"
MMDriverDesc="Software\Microsoft\Windows NT\CurrentVersion\drivers.desc"
MMDrivers="Software\Microsoft\Windows NT\CurrentVersion\Drivers32"
VfWWDMDriverDesc="WDM Video For Windows Capture Driver (Win32)"
RunOnce="SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"
CC.DeviceId="{562370a8-f8dd-11d2-bc64-00a0c95ec22e}"
CC.VBIcatID="{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
NABTS.DeviceID="{07DAD662-22F1-11d1-A9F4-00C04FBBDE8F}"
NABTS.VBIcatID="{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
WSTCodec.DeviceID="{70BC06E0-5666-11d3-A184-00105AEF9F33}"
WSTCodec.VBIcatID="{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
SLIP.DeviceId="{03884CB6-E89A-4deb-B69E-8DC621686E6A}"
GUID.BdaComponent="{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}"
StreamIP.DeviceId="{D84D449B-62FB-4ebb-B969-5183ED3DFB51}"
GUID.BdaRenderer="{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}"
NdisIP.DeviceID="{48926476-2cae-4ded-a86e-73ddebed6779}"
NdisIP.GUID.BDANetInterface="{9aa4a2cc-81e0-4cfd-802f-0f74526d2bd3}"

; localizeable
Category_CrossbarDevices="WDM Streaming Crossbar Devices"
Category_TvTunerDevices="WDM Streaming TV Tuner Devices"
Category_TvAudioDevices="WDM Streaming TV Audio Devices"
Category_Encoder="WDM Streaming Encoder Devices"
Category_Multiplexer="WDM Streaming Multiplexer Devices"
Filter_Crossbar="WDM Analog Crossbar"
Filter_TVAudio="WDM TV Audio"
Filter_TVTuner="WDM TV Tuner"
Node.Crossbar="Crossbar"
Node.Preview="Preview"
Node.CapturePin="Capture"
Node.AnalogVideoIn="Analog Video In"
Node.VBI="VBI"
Node.VP="VP"
Node.NABTS="NABTS"
Node.EDS="EDS"
Node.Teletext="Teletext"
Node.CC="CC"
Node.Still="Still"
Node.Timecode="Timecode"
Node.VPVBI="VPVBI"
Node.Encoder="Encoder"
Node.Multiplexer="Multiplexer"
PropPage_XBar="Analog Crossbar Property Page"
PropPage_TVAudio="TV Audio Property Page"
PropPage_TVTuner="TV Tuner Property Page"
PropPage_VideoProcAmp="VideoProcAmp Property Page"
PropPage_CameraControl="CameraControl Property Page"
PropPage_VideoDecoder="VideoDecoder Property Page"
PropPage_VideoStreamConfig="VideoStreamConfig Property Page"
PlugIn_VideoInfoHeaderHandler="WDM Streaming Capture VideoInfoHeader Data Type Handler"
PlugIn_VideoInfoHeader2Handler="WDM Streaming Capture VideoInfoHeader2 Data Type Handler"
PlugIn_AnalogVideoHandler="WDM Streaming Capture AnalogVideo Data Type Handler"
PlugIn_VBIHandler="WDM Streaming Capture VBI Data Type Handler"
PlugIn_IAMVideoProcAmp="WDM Streaming IAMVideoProcAmp Interface Handler"
PlugIn_IAMCameraControl="WDM Streaming IAMCameraControl Interface Handler"
PlugIn_IAMAnalogVideoDecoder="WDM Streaming IAMAnalogVideoDecoder Interface Handler"
PlugIn_IAMVideoCompression="WDM Streaming IAMVideoCompression Interface Handler"
PlugIn_IAMDroppedFrames="WDM Streaming IAMDroppedFrames Interface Handler"
PlugIn_IAMVideoControl="WDM Streaming IAMVideoControl Interface Handler"
PlugIn_IVideoEncoder="WDM Streaming IVideoEncoder Interface Handler"
Plugin_IKsTopologyInfo="WDM Streaming IKsTopologyInfo Interface Handler"
Plugin_ICameraControl="WDM Streaming ICameraControl Interface Handler"
Plugin_IVideoProcAmp="WDM Streaming IVideoProcAmp Interface Handler"
Plugin_ISelector="WDM Streaming ISelector Interface Handler"
Plugin_PropertyObject="Node Interface Aggregation Handler"





[kscaptur.registration]
CopyFiles=wFilters.Files,wVfWWDM.Files,wVfWWDM32.Files,wColorspaceCodecs.CopyCodec
DelFiles=wVfWWDM32.DelFile
AddReg=wVfWWDM,wCategories,wTopologyNodes,wPlugIns,wFilters,wBdaDevice.RunOnce.AddReg

[kscaptur.registration.nt]
CopyFiles=wFilters.Files,wVfWWDM32.Files,wColorspaceCodecs.CopyCodec
AddReg=wVfWWDM.NT,wCategories,wTopologyNodes,wPlugIns,wFilters,wVfWWDM.AddReg.NT,wBdaDevice.RunOnce.AddReg.NT

[wVfWWDM32.DelFile]
vfwwdm32.dll

[wCategories]
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{A799A800-A46D-11d0-A18C-00A02401DCD4}",CLSID,0x00004000,{A799A800-A46D-11d0-A18C-00A02401DCD4}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{A799A800-A46D-11d0-A18C-00A02401DCD4}",FriendlyName,0x00004000,"WDM Streaming TV Tuner Devices"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{A799A802-A46D-11d0-A18C-00A02401DCD4}",CLSID,0x00004000,{A799A802-A46D-11d0-A18C-00A02401DCD4}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{A799A802-A46D-11d0-A18C-00A02401DCD4}",FriendlyName,0x00004000,"WDM Streaming TV Audio Devices"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{A799A801-A46D-11d0-A18C-00A02401DCD4}",CLSID,0x00004000,{A799A801-A46D-11d0-A18C-00A02401DCD4}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{A799A801-A46D-11d0-A18C-00A02401DCD4}",FriendlyName,0x00004000,"WDM Streaming Crossbar Devices"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{19689BF6-C384-48FD-AD51-90E58C79F70B}",CLSID,0x00004000,{19689BF6-C384-48FD-AD51-90E58C79F70B}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{19689BF6-C384-48FD-AD51-90E58C79F70B}",FriendlyName,0x00004000,"WDM Streaming Encoder Devices"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{7A5DE1D3-01A1-452C-B481-4FA2B96271E8}",CLSID,0x00004000,{7A5DE1D3-01A1-452C-B481-4FA2B96271E8}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{7A5DE1D3-01A1-452C-B481-4FA2B96271E8}",FriendlyName,0x00004000,"WDM Streaming Multiplexer Devices"

[wVfWWDM.AddReg.NT]
HKLM,"Software\Microsoft\Windows NT\CurrentVersion\drivers.desc",vfwwdm32.dll,0x00004000,"WDM Video For Windows Capture Driver (Win32)"
HKLM,"Software\Microsoft\Windows NT\CurrentVersion\Drivers32",MSVideo8,0x00004000,VfWWDM32.dll

[wBdaDevice.RunOnce.AddReg.NT]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",CCDECODE0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {562370a8-f8dd-11d2-bc64-00a0c95ec22e},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\CCDECODE.inf,CCDECODE.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",nabtsfec0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {07DAD662-22F1-11d1-A9F4-00C04FBBDE8F},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\nabtsfec.inf,NABTSFEC.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",WSTCODEC0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {70BC06E0-5666-11d3-A184-00105AEF9F33},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\WSTCODEC.inf,WSTCODEC.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",SLIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {03884CB6-E89A-4deb-B69E-8DC621686E6A},GLOBAL,{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0},%10%\INF\slip.inf,VBIcodec"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",STREAMIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {D84D449B-62FB-4ebb-B969-5183ED3DFB51},GLOBAL,{71985F4A-1CA1-11d3-9CC8-00C04F7971E0},%10%\INF\streamip.inf,BDAcodec"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",NDISIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {48926476-2cae-4ded-a86e-73ddebed6779},NDISIP,{9aa4a2cc-81e0-4cfd-802f-0f74526d2bd3},%10%\INF\ndisip.inf,NdisIP.Reg"

[wColorspaceCodecs.CopyCodec]

[wVfWWDM]
HKLM,"SYSTEM\CurrentControlSet\Control\MediaResources\msvideo\MSVideo.VFWWDM",Description,0x00004000,"Microsoft WDM Image Capture"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaResources\msvideo\MSVideo.VFWWDM",FriendlyName,0x00004000,"Microsoft WDM Image Capture"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaResources\msvideo\MSVideo.VFWWDM",Driver,0x00004000,vfwwdm.drv

[wVfWWDM.Files]

[wFilters]
HKCR,"CLSID\{266EEE40-6C63-11cf-8A03-00AA006ECB65}",,0x00004000,"WDM TV Tuner"
HKCR,"CLSID\{266EEE40-6C63-11cf-8A03-00AA006ECB65}\InprocServer32",,0x00004000,kstvtune.ax
HKCR,"CLSID\{266EEE40-6C63-11cf-8A03-00AA006ECB65}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{266EEE41-6C63-11cf-8A03-00AA006ECB65}",,0x00004000,"TV Tuner Property Page"
HKCR,"CLSID\{266EEE41-6C63-11cf-8A03-00AA006ECB65}\InprocServer32",,0x00004000,kstvtune.ax
HKCR,"CLSID\{266EEE41-6C63-11cf-8A03-00AA006ECB65}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{71F96460-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"%%Filter_XBar%%"
HKCR,"CLSID\{71F96460-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,ksxbar.ax
HKCR,"CLSID\{71F96460-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{71F96461-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"Analog Crossbar Property Page"
HKCR,"CLSID\{71F96461-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,ksxbar.ax
HKCR,"CLSID\{71F96461-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{71F96462-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"WDM TV Audio"
HKCR,"CLSID\{71F96462-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,ksxbar.ax
HKCR,"CLSID\{71F96462-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{71F96463-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"TV Audio Property Page"
HKCR,"CLSID\{71F96463-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,ksxbar.ax
HKCR,"CLSID\{71F96463-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both

[wPlugIns]
HKCR,"CLSID\{05589f80-c356-11ce-bf01-00aa0055595a}",,0x00004000,"WDM Streaming Capture VideoInfoHeader Data Type Handler"
HKCR,"CLSID\{05589f80-c356-11ce-bf01-00aa0055595a}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{05589f80-c356-11ce-bf01-00aa0055595a}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{f72a76A0-eb0a-11d0-ace4-0000c0cc16ba}",,0x00004000,"WDM Streaming Capture VideoInfoHeader2 Data Type Handler"
HKCR,"CLSID\{f72a76A0-eb0a-11d0-ace4-0000c0cc16ba}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{f72a76A0-eb0a-11d0-ace4-0000c0cc16ba}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{0482DDE0-7817-11cf-8A03-00AA006ECB65}",,0x00004000,"WDM Streaming Capture AnalogVideo Data Type Handler"
HKCR,"CLSID\{0482DDE0-7817-11cf-8A03-00AA006ECB65}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{0482DDE0-7817-11cf-8A03-00AA006ECB65}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{F72A76E0-EB0A-11d0-ACE4-0000C0CC16BA}",,0x00004000,"WDM Streaming Capture VBI Data Type Handler"
HKCR,"CLSID\{F72A76E0-EB0A-11d0-ACE4-0000C0CC16BA}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{F72A76E0-EB0A-11d0-ACE4-0000C0CC16BA}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{C6E13360-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMVideoProcAmp Interface Handler"
HKCR,"CLSID\{C6E13360-30AC-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{C6E13360-30AC-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMVideoProcAmp Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,60,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56
HKCR,"CLSID\{C6E13370-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMCameraControl Interface Handler"
HKCR,"CLSID\{C6E13370-30AC-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{C6E13370-30AC-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMCameraControl Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,70,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56
HKCR,"CLSID\{C6E13350-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMAnalogVideoDecoder Interface Handler"
HKCR,"CLSID\{C6E13350-30AC-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{C6E13350-30AC-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13350-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMAnalogVideoDecoder Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13350-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,50,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56
HKCR,"CLSID\{C6E13343-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMVideoCompression Interface Handler"
HKCR,"CLSID\{C6E13343-30AC-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{C6E13343-30AC-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13343-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMVideoCompression Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13343-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,43,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56
HKCR,"CLSID\{C6E13344-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMDroppedFrames Interface Handler"
HKCR,"CLSID\{C6E13344-30AC-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{C6E13344-30AC-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13344-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMDroppedFrames Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{C6E13344-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,44,33,E1,C6,AC,30,d0,11,A1,8C,00,A0,C9,11,89,56
HKCR,"CLSID\{6A2E0670-28E4-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMVideoControl Interface Handler"
HKCR,"CLSID\{6A2E0670-28E4-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{6A2E0670-28E4-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{6A2E0670-28E4-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IAMVideoControl Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{6A2E0670-28E4-11d0-A18C-00A0C9118956}",IID,0x00004001,70,06,2E,6A,E4,28,d0,11,A1,8C,00,A0,C9,11,89,56
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{B43C4EEC-8C32-4791-9102-508ADA5EE8E7}",,0x00004000,"WDM Streaming IVideoEncoder Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{B43C4EEC-8C32-4791-9102-508ADA5EE8E7}",IID,0x00004001,3B,7C,99,02,1B,8E,0E,46,92,70,54,5E,0D,E9,56,3E
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{7ff0997a-1999-4286-a73c-622b8814e7eb}",,0x00004000,"WDM Streaming IVideoEncoder Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{7ff0997a-1999-4286-a73c-622b8814e7eb}",IID,0x00004001,c7,b4,1d,90,ce,31,a2,41,85,dc,8f,a0,bf,41,b8,da
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{b05dabd9-56e5-4fdc-afa4-8a47e91f1c9c}",,0x00004000,"WDM Streaming IVideoEncoder Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{b05dabd9-56e5-4fdc-afa4-8a47e91f1c9c}",IID,0x00004001,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00
HKCR,"CLSID\{720D4AC0-7533-11D0-A5D6-28DB04C10000}",,0x00004000,"WDM Streaming IKsTopologyInfo Interface Handler"
HKCR,"CLSID\{720D4AC0-7533-11D0-A5D6-28DB04C10000}\InprocServer32",,0x00004000,vidcap.ax
HKCR,"CLSID\{720D4AC0-7533-11D0-A5D6-28DB04C10000}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{720D4AC0-7533-11D0-A5D6-28DB04C10000}",,0x00004000,"WDM Streaming IKsTopologyInfo Interface Handler"
HKLM,"System\CurrentControlSet\Control\MediaInterfaces\{720D4AC0-7533-11D0-A5D6-28DB04C10000}",IID,0x00004001,C0,4A,0D,72,33,75,D0,11,A5,D6,28,DB,04,C1,00,00
HKCR,"CLSID\{A0227FFC-3AA7-4dc3-9FD7-125745C9EAF6}",,0x00004000,"WDM Streaming ICameraControl Interface Handler"
HKCR,"CLSID\{A0227FFC-3AA7-4dc3-9FD7-125745C9EAF6}\InprocServer32",,0x00004000,vidcap.ax
HKCR,"CLSID\{A0227FFC-3AA7-4dc3-9FD7-125745C9EAF6}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming ICameraControl Interface Handler"
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,5D,78,A1,2B,1B,4D,EF,44,85,E8,C7,F1,D3,F2,01,84
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{C6E13370-30AC-11d0-A18C-00A0C9118956}",CLSID,0x00004001,FC,7F,22,A0,A7,3A,c3,4d,9F,D7,12,57,45,C9,EA,F6
HKCR,"CLSID\{291EE2A7-BFA5-4e9e-A358-C93655556A6C}",,0x00004000,"WDM Streaming IVideoProcAmp Interface Handler"
HKCR,"CLSID\{291EE2A7-BFA5-4e9e-A358-C93655556A6C}\InprocServer32",,0x00004000,vidcap.ax
HKCR,"CLSID\{291EE2A7-BFA5-4e9e-A358-C93655556A6C}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956}",,0x00004000,"WDM Streaming IVideoProcAmp Interface Handler"
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956}",IID,0x00004001,0E,56,50,40,A7,42,3a,41,85,C2,09,26,9A,2D,0F,44
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{C6E13360-30AC-11d0-A18C-00A0C9118956}",CLSID,0x00004001,A7,E2,1E,29,A5,BF,9e,4E,A3,58,C9,36,55,55,6A,6C
HKCR,"CLSID\{7751F46E-39B2-4b50-A7E3-23EF598ECD85}",,0x00004000,"WDM Streaming ISelector Interface Handler"
HKCR,"CLSID\{7751F46E-39B2-4b50-A7E3-23EF598ECD85}\InprocServer32",,0x00004000,vidcap.ax
HKCR,"CLSID\{7751F46E-39B2-4b50-A7E3-23EF598ECD85}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{1ABDAECA-68B6-4F83-9371-B413907C7B9F}",,0x00004000,"WDM Streaming ISelector Interface Handler"
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{1ABDAECA-68B6-4F83-9371-B413907C7B9F}",IID,0x00004001,CA,AE,BD,1A,B6,68,83,4F,93,71,B4,13,90,7C,7B,9F
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{1ABDAECA-68B6-4F83-9371-B413907C7B9F}",CLSID,0x00004001,6E,F4,51,77,B2,39,50,4B,A7,E3,23,EF,59,8E,CD,85
HKCR,"CLSID\{ECE71064-011D-45b7-AEF2-3B626985E937}",,0x00004000,"Node Interface Aggregation Handler"
HKCR,"CLSID\{ECE71064-011D-45b7-AEF2-3B626985E937}\InprocServer32",,0x00004000,vidcap.ax
HKCR,"CLSID\{ECE71064-011D-45b7-AEF2-3B626985E937}\InprocServer32",ThreadingModel,0x00004000,Both
HKCR,"CLSID\{71F96464-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"VideoProcAmp Property Page"
HKCR,"CLSID\{71F96464-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{71F96464-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{C6E13360-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96464-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"VideoProcAmp Property Page"
HKCR,"CLSID\{71F96465-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"CameraControl Property Page"
HKCR,"CLSID\{71F96465-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{71F96465-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{C6E13370-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96465-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"CameraControl Property Page"
HKCR,"CLSID\{71F96466-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"VideoDecoder Property Page"
HKCR,"CLSID\{71F96466-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{71F96466-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{C6E13350-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96466-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"VideoDecoder Property Page"
HKCR,"CLSID\{71F96467-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"VideoStreamConfig Property Page"
HKCR,"CLSID\{71F96467-78F3-11d0-A18C-00A0C9118956}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{71F96467-78F3-11d0-A18C-00A0C9118956}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{C6E13340-30AC-11d0-A18C-00A0C9118956}\PropertyPages\{71F96467-78F3-11d0-A18C-00A0C9118956}",,0x00004000,"VideoStreamConfig Property Page"
HKLM,"System\CurrentControlSet\Control\MediaCategories\{FB6C4281-0353-11d1-905F-0000C0CC16BA}\PropertyPages\{71F96467-78F3-11d0-A18C-00A0C9118956}",,0x00004000,
HKLM,"System\CurrentControlSet\Control\MediaCategories\{FB6C4282-0353-11d1-905F-0000C0CC16BA}\PropertyPages\{71F96467-78F3-11d0-A18C-00A0C9118956}",,0x00004000,

[wFilters.Files]
kstvtune.ax,wkstvtune.ax
ksxbar.ax,wksxbar.ax
kswdmcap.ax,wkswdmcap.ax
vidcap.ax,wvidcap.ax

[wVfWWDM32.Files]
vfwwdm32.dll,wvfwwdm32.dll

[wBdaDevice.RunOnce.AddReg]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",CCDECODE0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {562370a8-f8dd-11d2-bc64-00a0c95ec22e},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\CCDECODE.inf,CCDECODE.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",nabtsfec0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {07DAD662-22F1-11d1-A9F4-00C04FBBDE8F},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\nabtsfec.inf,NABTSFEC.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",WSTCODEC0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {70BC06E0-5666-11d3-A184-00105AEF9F33},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\WSTCODEC.inf,WSTCODEC.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",SLIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {03884CB6-E89A-4deb-B69E-8DC621686E6A},GLOBAL,{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0},%10%\INF\slip.inf,VBIcodec"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",STREAMIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {D84D449B-62FB-4ebb-B969-5183ED3DFB51},GLOBAL,{71985F4A-1CA1-11d3-9CC8-00C04F7971E0},%10%\INF\streamip.inf,BDAcodec"
HKLM,"Enum\Root\NDISIP\0000",HardwareID,0x00004000,NDISIP

[wTopologyNodes]
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4281-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,Capture
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4281-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4282-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,Preview
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4282-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4283-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,"Analog Video In"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4283-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4284-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,VBI
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4284-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4285-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,VP
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4285-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4286-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,NABTS
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4286-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4287-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,EDS
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4287-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4288-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,Teletext
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4288-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4289-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,CC
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4289-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C428a-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,Still
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C428a-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C428b-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,Timecode
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C428b-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C428c-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,VPVBI
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C428c-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{19689BF6-C384-48FD-AD51-90E58C79F70B}",Name,0x00004000
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{7A5DE1D3-01A1-452C-B481-4FA2B96271E8}",Display,0x00004001,00,00,00,00

[wVfWWDM.NT]
HKLM,"SYSTEM\CurrentControlSet\Control\MediaResources\msvideo\MSVideo.VFWWDM",Description,0x00004000,"Microsoft WDM Image Capture (Win32)"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaResources\msvideo\MSVideo.VFWWDM",FriendlyName,0x00004000,"Microsoft WDM Image Capture (Win32)"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaResources\msvideo\MSVideo.VFWWDM",Driver,0x00004000,vfwwdm32.dll

[DestinationDirs]
wVfWWDM32.DelFile=10
wColorspaceCodecs.CopyCodec=16425
wVfWWDM.Files=16425
wFilters.Files=16425
wVfWWDM32.Files=16425
