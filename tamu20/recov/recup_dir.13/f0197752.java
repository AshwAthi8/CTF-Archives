2,5.2.3790.1830

[Manufacturer]
%Manufacturer%=Microsoft,NTamd64

[DestinationDirs]
DefaultDestDir=12

[ControlFlags]
ExcludeFromSelect=*

[DefaultInstall]
AddReg=CCDECODE.RunOnce.AddReg
;Reboot=1

[Microsoft.NTamd64]
%CCDECODE.DeviceDesc%=CCDECODE,SW\{562370a8-f8dd-11d2-bc64-00a0c95ec22e}

;
; This is the section that is called out in the Needs line of other infs.
;
[CCDECODE.Installation]
AddReg=CCDECODE.RunOnce.AddReg

;
; There should be a runonce line for each class that the object server will
; create.
;
[CCDECODE.RunOnce.AddReg]
HKLM,%RunOnce%,"CCDECODE0",,"rundll32.exe streamci,StreamingDeviceSetup %CCDECODE.DeviceId%,GLOBAL,%VBIcatID%,%17%\CCDECODE.inf,CCDECODE.Interface.Install"

[CCDECODE]
Include=ks.inf,ksfilter.inf
Needs=KS.Registration,MSTEE.Installation
AddReg=CCDECODE.AddReg
;Include the following line for post dx8 builds
CopyFiles=CCDECODE.CopyFiles

[CCDECODE.NT]
Include=ks.inf,ksfilter.inf
Needs=KS.Registration,MSTEE.Installation
AddReg=CCDECODE.NT.AddReg
;Include the following line for post dx8 builds
CopyFiles=CCDECODE.CopyFiles

[CCDECODE.AddReg]
HKR,,DevLoader,,*NTKERN
HKR,,NTMPDriver,,CCDECODE.sys
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[CCDECODE.NT.AddReg]
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[CCDECODE.CopyFiles]
CCDECODE.sys,,,COPYFLG_NO_VERSION_DIALOG

[CCDECODE.Interface.Install]
AddReg=CCDECODE.Interface.AddReg

[CCDECODE.Interface.AddReg]
HKR,,CLSID,,%Proxy.CLSID%
HKR,,FriendlyName,,%CCDECODE.FriendlyName%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,,,%WDMcodecs%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,FriendlyName,,%WDMcodecs%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,CLSID,,"%VBIcatID%"
HKLM,System\CurrentControlSet\Control\MediaCategories\%CCpinID%
HKLM,System\CurrentControlSet\Control\MediaCategories\%CCpinID%,Name,,%CCpinName%

[CCDECODE.NT.Services]
AddService=CCDECODE,0x00000002,CCDECODE.ServiceInstall

[CCDECODE.ServiceInstall]
DisplayName=%CCDECODE.DeviceDesc%
ServiceType=%SERVICE_KERNEL_DRIVER%
StartType=%SERVICE_DEMAND_START%
ErrorControl=%SERVICE_ERROR_NORMAL%
ServiceBinary=%12%\CCDECODE.sys
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
CCDECODE.DeviceId     = "{562370a8-f8dd-11d2-bc64-00a0c95ec22e}"
Proxy.CLSID           = "{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
VBIcatID              = "{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
AMcatID               = "{DA4E3DA0-D07D-11d0-BD50-00A0C911CE86}"
CCpinID               = "{1AAD8061-012D-11d2-B4B1-00A0D102CFBE}"
CCpinName             = "HWCC"

;----------------
; localizeable
;----------------
Msft="Microsoft"
Manufacturer="Microsoft"
CCDECODE.FriendlyName="CC Decoder"
CCDECODE.DeviceDesc="Closed Caption Decoder"
WDMcodecs="WDM Streaming VBI Codecs"
