;
; StreamIP.INF  -- This file contains installation information for
;                 the StreamIP BDA codec
;
;

[Version]
signature="$CHICAGO$"
LayoutFile=Layout.inf
Class=Media
ClassGUID={4d36e96c-e325-11ce-bfc1-08002be10318}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
;
;   Don't let this device be selected from "Add New Hardware" wizard.
;
ExcludeFromSelect=*

[Manufacturer]
%MsftMfg%=Microsoft,NTamd64

[DestinationDirs]
StreamIP.Device.CopyDll=10,system32
DefaultDestDir=12

;---------------------------------------------------------------
;              M I C R O S O F T
;
;                  C O D E C
;---------------------------------------------------------------

[Microsoft.NTamd64]
;
; This is the standard PnP Section for the device.  It is called as a result
; of SWEnum enumerating this SW PnP device.
;
%BDAcodec.DeviceDesc% = StreamIP.Device,SW\{D84D449B-62FB-4ebb-B969-5183ED3DFB51}

[DefaultInstall]
AddReg=StreamIP.Install
Reboot  = 1

[DefaultInstall.NT]
AddReg=StreamIP.Install

[StreamIP.Install]
;   This run once causes SWEnum to enumerate the MPE device.
;   NOTE!  This is the only way to install the device as an SWEnum device.
;
HKLM,%RunOnce%,"STREAMIP0",,"rundll32.exe streamci,StreamingDeviceSetup %StreamIP.DeviceId%,GLOBAL,%GUID.BdaRenderer%,%17%\streamip.inf,BDAcodec"


[StreamIP.Device]
Include=bda.inf
Needs=BDA.Registration,NdisIP.Installation
AddReg=StreamIP.Device.AddReg
RegisterDlls=StreamIP.RegisterDlls
;
;   Include the following line for post dx8 builds
;
CopyFiles=  StreamIP.Device.CopyDrivers, StreamIP.Device.CopyDll

[StreamIP.Device.NT]
Include=bda.inf
Needs=BDA.Registration,NdisIP.Installation.NT
AddReg=StreamIP.Device.AddReg.NT
RegisterDlls=StreamIP.RegisterDlls
;
;   Include the following line for post dx8 builds
;
CopyFiles=  StreamIP.Device.CopyDrivers, StreamIP.Device.CopyDll


[StreamIP.Device.AddReg]
;
;   This section adds the driver service on 9x and adds device params
;
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,StreamIP.sys
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[StreamIP.Device.AddReg.NT]
;
;   This section adds device params on NT
;
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[StreamIP.Device.CopyDrivers]
StreamIP.sys,,,COPYFLG_NO_VERSION_DIALOG

[StreamIP.Device.CopyDll]
ipsink.ax,,,COPYFLG_NO_VERSION_DIALOG

[StreamIP.RegisterDlls]
11,,IPSink.ax,1


[StreamIP.Device.Interfaces]
;   This line would be used ONLY if the device is not installed as an
;   SWEnum device
;
;AddInterface=%GUID.BdaRenderer%,"GLOBAL",BDAcodec,

;   This line adds the IPSink Plug-in's interface on the device
;
AddInterface=%GUID.IPSinkPlugin%,"GLOBAL",IPSinkPlugin,


[StreamIP.Device.NT.Interfaces]
;   This line would be used ONLY if the device is not installed as an
;   SWEnum device
;
;AddInterface=%GUID.BdaRenderer%,"GLOBAL",BDAcodec,

;   This line adds the IPSink Plug-in's interface on the device
;
AddInterface=%GUID.IPSinkPlugin%,"GLOBAL",IPSinkPlugin,


[BDAcodec]
AddReg=BDAcodec.AddReg, BDA.CategoryRegistration

[BDAcodec.AddReg]
HKR,,CLSID,,%CLSID%
HKR,,FriendlyName,,%BDAcodec.FriendlyName%


[BDA.CategoryRegistration]

; BDA Rendering Components
;
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%,,,%Category_BdaRenderer%
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%,FriendlyName,,%Category_BdaRenderer%
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%,CLSID,,"%GUID.BdaRenderer%"


[IPSinkPlugin]
AddReg=IPSinkPlugin.AddReg

[IPSinkPlugin.AddReg]
HKCR,CLSID\%GUID.IPSinkPlugin%,,,%PlugIn_IPSink%
HKCR,CLSID\%GUID.IPSinkPlugin%\InprocServer32,,,ipsink.ax
HKCR,CLSID\%GUID.IPSinkPlugin%\InprocServer32,ThreadingModel,,Both
HKLM,System\CurrentControlSet\Control\MediaInterfaces\%GUID.IPSinkPlugin%,,,%PlugIn_IPSink%
HKLM,System\CurrentControlSet\Control\MediaInterfaces\%GUID.IPSinkPlugin%,IID,1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00


[StreamIP.Device.NT.Services]
;
;   This section is required to add the driver service on NT
;
AddService = streamip ,0x00000002,StreamIP.ServiceInstall

[StreamIP.ServiceInstall]
DisplayName   = %BDAcodec.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\StreamIP.sys
LoadOrderGroup=Extended Base

































;---------------------------------------------------------------
;                S t r i n g s
;---------------------------------------------------------------

[Strings]

;----------------
; Non-Localizable
;----------------

SERVICE_KERNEL_DRIVER = 1
SERVICE_AUTO_START    = 2
SERVICE_DEMAND_START  = 3
SERVICE_ERROR_NORMAL  = 1

RunOnce="SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"
ActiveMovieCategories="CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance"
Plugin_IPSink="WDM Streaming IPSink Property Set Handler"
GUID.IPSinkPlugin="{3F4DC8E2-4050-11d3-8F4B-00C04F7971E2}"
CLSID=    "{17CCA71B-ECD7-11D0-B908-00A0C9223196}"  ; KsProxy.ax's ID, REQUIRED
BDAcatID= "{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}"
AMcatID=  "{DA4E3DA0-D07D-11d0-BD50-00A0C911CE86}"
IPV4PinID="{3fdffa70-ac9a-11d2-8f17-00c04f7971e2}"
StreamIP.DeviceId="{D84D449B-62FB-4ebb-B969-5183ED3DFB51}"
GUID.BdaRenderer= "{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}"
Category_BdaRenderer=  "BDA Rendering Filters"


;----------------
; Localizable
;----------------

Msft=                  "Microsoft"
MsftMfg=               "Microsoft"
IPV4PinName=           "IPv4"
BDAcodec.DeviceDesc=   "BDA IPSink"
BDAcodec.FriendlyName= "BDA IP Sink"

