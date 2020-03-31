rovider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Manufacturer%=Microsoft,NTamd64

[DestinationDirs]
DefaultDestDir=12

[ControlFlags]
ExcludeFromSelect=*

[DefaultInstall]
AddReg=WSTCODEC.RunOnce.AddReg
;Reboot=1

[Microsoft.NTamd64]
%WSTCODEC.DeviceDesc%=WSTCODEC,SW\{70BC06E0-5666-11d3-A184-00105AEF9F33}

;
; This is the section that is called out in the Needs line of other infs.
;
[WSTCODEC.Installation]
AddReg=WSTCODEC.RunOnce.AddReg

;
; There should be a runonce line for each class that the object server will
; create.
;
[WSTCODEC.RunOnce.AddReg]
HKLM,%RunOnce%,"WSTCODEC0",,"rundll32.exe streamci,StreamingDeviceSetup %WSTCODEC.DeviceId%,GLOBAL,%VBIcatID%,%17%\WSTCODEC.inf,WSTCODEC.Interface.Install"

[WSTCODEC]
Include=ks.inf,ksfilter.inf
Needs=KS.Registration,MSTEE.Installation
AddReg=WSTCODEC.AddReg
;Include the following line for post dx8 builds
CopyFiles=WSTCODEC.CopyFiles

[WSTCODEC.NT]
Include=ks.inf,ksfilter.inf
Needs=KS.Registration,MSTEE.Installation
AddReg=WSTCODEC.NT.AddReg
;Include the following line for post dx8 builds
CopyFiles=WSTCODEC.CopyFiles

[WSTCODEC.AddReg]
HKR,,DevLoader,,*NTKERN
HKR,,NTMPDriver,,WSTCODEC.SYS
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[WSTCODEC.NT.AddReg]
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[WSTCODEC.CopyFiles]
WSTCODEC.SYS,,,COPYFLG_NO_VERSION_DIALOG

[WSTCODEC.Interface.Install]
AddReg=WSTCODEC.Interface.AddReg

[WSTCODEC.Interface.AddReg]
HKR,,CLSID,,%Proxy.CLSID%
HKR,,FriendlyName,,%WSTCODEC.FriendlyName%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,,,%WDMcodecs%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,FriendlyName,,%WDMcodecs%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,CLSID,,"%VBIcatID%"

[WSTCODEC.NT.Services]
AddService=WSTCODEC,0x00000002,WSTCODEC.ServiceInstall

[WSTCODEC.ServiceInstall]
DisplayName=%WSTCODEC.DeviceDesc%
ServiceType=%SERVICE_KERNEL_DRIVER%
StartType=%SERVICE_DEMAND_START%
ErrorControl=%SERVICE_ERROR_NORMAL%
ServiceBinary=%12%\WSTCODEC.SYS
LoadOrderGroup=Extended Base
































[Strings]
SERVICE_KERNEL_DRIVER=1
SERVICE_AUTO_START=2
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

RunOnce="SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"

;----------------
; non-localizeable
;----------------
WSTCODEC.DeviceId="{70BC06E0-5666-11d3-A184-00105AEF9F33}"
Proxy.CLSID="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"	; KsProxy.ax's ID, REQUIRED
VBIcatID="{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
AMcatID="{DA4E3DA0-D07D-11d0-BD50-00A0C911CE86}"

;----------------
; localizeable
;----------------

Msft=                  "Microsoft"
Manufacturer=          "Microsoft"
WSTCODEC.FriendlyName= "WST Codec"
WSTCODEC.DeviceDesc=   "World Standard Teletext Codec"
WDMcodecs=             "WDM Streaming VBI Codecs"
