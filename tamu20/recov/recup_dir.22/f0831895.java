; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
signature="$CHICAGO$"
Class=Image
ClassGUID={6bdd1fc6-810f-11d0-bec7-08002be2092f}
Provider=%Msft%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*

[DestinationDirs]
USBVideo.CopyList=10,system32\drivers

[Manufacturer]
%Msft%=Microsoft,NTamd64

[Microsoft.NTamd64]
%USBVideo.DeviceDesc%=USBVideo,USB\CLASS_0E

[USBVideo.NT]
Include=ks.inf, kscaptur.inf, dshowext.inf
Needs=KS.Registration, KSCAPTUR.Registration.NT, DSHOWEXT.Registration
CopyFiles=USBVideo.CopyList
AddReg=USBVideo.AddReg, TopologyNodeRegistration, DVCR.Plugins
PreferDeviceInfo=1
; WIA
SubClass=StillImage
DeviceType=3
DeviceSubType=0x1
Capabilities=0x00000031
DeviceData=USBVideo.DeviceData
ICMProfiles="sRGB Color Space Profile.icm"

[USBVideo.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,usbvideo.sys
; WIA
HKR,,HardwareConfig,1,1
HKR,,USDClass,,"{0527d1d0-88c2-11d2-82c7-00c04f8ec183}"

[TopologyNodeRegistration]
HKLM,%MediaCategories%\%GUID.VideoStreaming%,Name,,%Node.VideoStreaming%
HKLM,%MediaCategories%\%GUID.VideoStreaming%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoInputTerminal%,Name,,%Node.VideoInputTerminal%
HKLM,%MediaCategories%\%GUID.VideoInputTerminal%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoOutputTerminal%,Name,,%Node.VideoOutputTerminal%
HKLM,%MediaCategories%\%GUID.VideoOutputTerminal%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoSelector%,Name,,%Node.VideoSelector%
HKLM,%MediaCategories%\%GUID.VideoSelector%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoProcessing%,Name,,%Node.VideoProcessing%
HKLM,%MediaCategories%\%GUID.VideoProcessing%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoCameraTerminal%,Name,,%Node.VideoCameraTerminal%
HKLM,%MediaCategories%\%GUID.VideoCameraTerminal%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoInputMTT%,Name,,%Node.VideoInputMTT%
HKLM,%MediaCategories%\%GUID.VideoInputMTT%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%GUID.VideoOutputMTT%,Name,,%Node.VideoOutputMTT%
HKLM,%MediaCategories%\%GUID.VideoOutputMTT%,Display,1,00,00,00,00


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

;IExtTransport
HKCR,CLSID\{D8BD090D-3F39-45FD-B29A-7FC62C2E59C3},,,%PlugIn_IExtTransport%
HKCR,CLSID\{D8BD090D-3F39-45FD-B29A-7FC62C2E59C3}\InprocServer32,,,vidcap.ax
HKCR,CLSID\{D8BD090D-3F39-45FD-B29A-7FC62C2E59C3}\InprocServer32,ThreadingModel,,Both
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814},,,%PlugIn_IExtTransport%
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814},IID,1,72,97,BF,F3,3A,82,21,49,A0,B6,9F,D3,52,75,2F,4B
HKLM,System\CurrentControlSet\Control\NodeInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814},CLSID,1,0D,09,BD,D8,39,3F,FD,45,B2,9A,7F,C6,2C,2E,59,C3


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


[USBVideo.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={5d8ef5a3-ac13-11d2-a093-00c04f72dc3c}

[USBVideo.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,USBVideo.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,USBVideo.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,USBVideo.Interface

[USBVideo.NT.Interfaces]
AddInterface=%KSCATEGORY_CAPTURE%,GLOBAL,USBVideo.Interface
AddInterface=%KSCATEGORY_RENDER%,GLOBAL,USBVideo.Interface
AddInterface=%KSCATEGORY_VIDEO%,GLOBAL,USBVideo.Interface

[USBVideo.Interface]
AddReg=USBVideo.Interface.AddReg
         
[USBVideo.Interface.AddReg]
HKR,,CLSID,,%ProxyVCap.CLSID%
HKR,,FriendlyName,,%USBVideo.DeviceDesc%
HKR,,RTCFlags,0x00010001,0x00000010

[USBVideo.NT.Services]
AddService = usbvideo,0x00000002,USBVideo.ServiceInstall

[USBVideo.ServiceInstall]
DisplayName   = %USBVideo.SvcDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %10%\System32\Drivers\usbvideo.sys


[USBVideo.CopyList]
usbvideo.sys

































[Strings]

;-----------------
; Non-Localizable
;-----------------
ProxyVCap.CLSID="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
KSCATEGORY_RENDER="{65E8773E-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_CAPTURE="{65E8773D-8F56-11D0-A3B9-00A0C9223196}"
KSCATEGORY_VIDEO="{6994AD05-93EF-11D0-A3CC-00A0C9223196}"
SERVICE_KERNEL_DRIVER=1
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

MediaCategories="SYSTEM\CurrentControlSet\Control\MediaCategories"
GUID.VideoStreaming="{DFF229E1-F70F-11D0-B917-00A0C9223196}"
GUID.VideoInputTerminal="{DFF229E2-F70F-11D0-B917-00A0C9223196}"
GUID.VideoOutputTerminal="{DFF229E3-F70F-11D0-B917-00A0C9223196}"
GUID.VideoSelector="{DFF229E4-F70F-11D0-B917-00A0C9223196}"
GUID.VideoProcessing="{DFF229E5-F70F-11D0-B917-00A0C9223196}"
GUID.VideoCameraTerminal="{DFF229E6-F70F-11D0-B917-00A0C9223196}"
GUID.VideoInputMTT="{DFF229E7-F70F-11D0-B917-00A0C9223196}"
GUID.VideoOutputMTT="{DFF229E8-F70F-11D0-B917-00A0C9223196}"

;------------
;Localizeable
;------------
Msft="Microsoft"
USBVideo.DeviceDesc="USB Video Device"
USBVideoStreaming.DeviceDesc="USB Video Device (VS Interface)"
USBVideo.SvcDesc="USB Video Device (WDM)"

Node.VideoStreaming="Video Streaming"
Node.VideoInputTerminal="Video Input Terminal"
Node.VideoOutputTerminal="Video Output Terminal"
Node.VideoSelector="Video Selector"
Node.VideoProcessing="Video Processing"
Node.VideoCameraTerminal="Video Camera Terminal"
Node.VideoInputMTT="Video Input Media Transport Terminal"
Node.VideoOutputMTT="Video Output Media Transport Terminal"


;
; PlugIns Descriptions
;
PlugIn_IAMExtDevice="WDM Streaming IAMExtDevice Interface Handler"
PlugIn_IAMExtTransport="WDM Streaming IAMExtTransport Interface Handler"
PlugIn_IAMTimecodeReader="WDM Streaming IAMTimecodeReader Interface Handler"
Plugin_IExtTransport="WDM Streaming IExtTransport Interface Handler"
PropPage_DVcrControl="DVcrControl Property Page"
Plugin_IKsTopologyInfo="WDM Streaming IKsTopologyInfo Interface Handler"
Plugin_ICameraControl="WDM Streaming ICameraControl Interface Handler"
Plugin_IVideoProcAmp="WDM Streaming IVideoProcAmp Interface Handler"
Plugin_ISelector="WDM Streaming ISelector Interface Handler"
Plugin_PropertyObject="Node Interface Aggregation Handler"






[usbvideo.nt]
CopyFiles=wUSBVideo.CopyList
AddReg=wUSBVideo.AddReg,wTopologyNodeRegistration,wDVCR.Plugins

[usbvideo.interface]
AddReg=wUSBVideo.Interface.AddReg

[wTopologyNodeRegistration]
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E1-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Streaming"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E1-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E2-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Input Terminal"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E2-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E3-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Output Terminal"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E3-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E4-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Selector"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E4-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E5-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Processing"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E5-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E6-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Camera Terminal"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E6-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E7-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Input Media Transport Terminal"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E7-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E8-F70F-11D0-B917-00A0C9223196}",Name,0x00004000,"Video Output Media Transport Terminal"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{DFF229E8-F70F-11D0-B917-00A0C9223196}",Display,0x00004001,00,00,00,00

[wDVCR.Plugins]
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
HKCR,"CLSID\{D8BD090D-3F39-45FD-B29A-7FC62C2E59C3}",,0x00004000,"WDM Streaming IExtTransport Interface Handler"
HKCR,"CLSID\{D8BD090D-3F39-45FD-B29A-7FC62C2E59C3}\InprocServer32",,0x00004000,vidcap.ax
HKCR,"CLSID\{D8BD090D-3F39-45FD-B29A-7FC62C2E59C3}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814}",,0x00004000,"WDM Streaming IExtTransport Interface Handler"
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814}",IID,0x00004001,72,97,BF,F3,3A,82,21,49,A0,B6,9F,D3,52,75,2F,4B
HKLM,"System\CurrentControlSet\Control\NodeInterfaces\{A03CD5F0-3045-11cf-8C44-00AA006B6814}",CLSID,0x00004001,0D,09,BD,D8,39,3F,FD,45,B2,9A,7F,C6,2C,2E,59,C3
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
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32",,0x00004000,kswdmcap.ax
HKCR,"CLSID\{81e9dd62-78d5-11d2-b47e-006097b3391b}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"System\CurrentControlSet\Control\MediaSets\{B5730A90-1A2C-11cf-8C23-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"
HKLM,"System\CurrentControlSet\Control\MediaSets\{A03CD5F0-3045-11cf-8C44-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"
HKLM,"System\CurrentControlSet\Control\MediaSets\{9B496CE1-811B-11cf-8C77-00AA006B6814}\PropertyPages\{81e9dd62-78d5-11d2-b47e-006097b3391b}",,0x00004000,"DVcrControl Property Page"

[wUSBVideo.CopyList]

[wUSBVideo.Interface.AddReg]
HKR,,CLSID,0x00004000,{17CCA71B-ECD7-11D0-B908-00A0C9223196}
HKR,,FriendlyName,0x00004000,"USB Video Device"
HKR,,RTCFlags,0x00014001,0x00000010

[wUSBVideo.AddReg]
HKR,,DevLoader,0x00004000,*ntkern
HKR,,NTMPDriver,0x00004000,usbvideo.sys
HKR,,HardwareConfig,0x00004001,1
HKR,,USDClass,0x00004000,{0527d1d0-88c2-11d2-82c7-00c04f8ec183}

[DestinationDirs]
wUSBVideo.CopyList=10,system32\drivers
