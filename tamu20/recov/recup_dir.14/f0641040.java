2,5.2.3790.1830

[Manufacturer]
%Manufacturer%=Microsoft,NTamd64

[DestinationDirs]
DefaultDestDir=12

[ControlFlags]
ExcludeFromSelect=*

[DefaultInstall]
AddReg=NABTSFEC.RunOnce.AddReg
;Reboot=1

[Microsoft.NTamd64]
%NABTSFEC.DeviceDesc%=NABTSFEC,SW\{07DAD662-22F1-11d1-A9F4-00C04FBBDE8F}

;
; This is the section that is called out in the Needs line of other infs.
;
[NABTSFEC.Installation]
AddReg=NABTSFEC.RunOnce.AddReg

;
; There should be a runonce line for each class that the object server will
; create.
;
[NABTSFEC.RunOnce.AddReg]
HKLM,%RunOnce%,"NABTSFEC0",,"rundll32.exe streamci,StreamingDeviceSetup %NABTSFEC.DeviceId%,GLOBAL,%VBIcatID%,%17%\NABTSFEC.inf,NABTSFEC.Interface.Install"

[NABTSFEC]
Include=ks.inf,ksfilter.inf
Needs=KS.Registration,MSTEE.Installation
AddReg=NABTSFEC.AddReg
;Include the following line for post dx8 builds
CopyFiles=NABTSFEC.CopyDrivers

[NABTSFEC.NT]
Include=ks.inf,ksfilter.inf
Needs=KS.Registration,MSTEE.Installation
AddReg=NABTSFEC.NT.AddReg
;Include the following line for post dx8 builds
CopyFiles=NABTSFEC.CopyDrivers

[NABTSFEC.AddReg]
HKR,,DevLoader,,*NTKERN
HKR,,NTMPDriver,,NABTSFEC.sys
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[NABTSFEC.NT.AddReg]
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[NABTSFEC.CopyDrivers]
NABTSFEC.sys,,,COPYFLG_NO_VERSION_DIALOG

[NABTSFEC.Interface.Install]
AddReg=NABTSFEC.Interface.AddReg

[NABTSFEC.Interface.AddReg]
HKR,,CLSID,,%Proxy.CLSID%
HKR,,FriendlyName,,%NABTSFEC.FriendlyName%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,,,%WDMcodecs%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,FriendlyName,,%WDMcodecs%
HKLM,Software\CLASSES\CLSID\%AMcatID%\Instance\%VBIcatID%,CLSID,,"%VBIcatID%"
HKLM,System\CurrentControlSet\Control\MediaCategories\%NABpinID%
HKLM,System\CurrentControlSet\Control\MediaCategories\%NABpinID%,Name,,%NABpinName%

[NABTSFEC.NT.Services]
AddService=NABTSFEC,0x00000002,NABTSFEC.ServiceInstall

[NABTSFEC.ServiceInstall]
DisplayName=%NABTSFEC.DeviceDesc%
ServiceType=%SERVICE_KERNEL_DRIVER%
StartType=%SERVICE_DEMAND_START%
ErrorControl=%SERVICE_ERROR_NORMAL%
ServiceBinary=%12%\NABTSFEC.sys
LoadOrderGroup=Extended Base
































;---------------------------------------------------------------
;                S t r i n g s
;---------------------------------------------------------------

[Strings]

;----------------
; Non-Localizable
;----------------
SERVICE_KERNEL_DRIVER=1
SERVICE_AUTO_START=2
SERVICE_DEMAND_START=3
SERVICE_ERROR_NORMAL=1

RunOnce="SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"

; WARNING!  If you change either of the GUIDs below, you must also
;           change kscaptur.txt
NABTSFEC.DeviceId     = "{07DAD662-22F1-11d1-A9F4-00C04FBBDE8F}"
VBIcatID              = "{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"

Proxy.CLSID           = "{17CCA71B-ECD7-11D0-B908-00A0C9223196}"
AMcatID               = "{DA4E3DA0-D07D-11d0-BD50-00A0C911CE86}"
NABpinID              = "{29703660-498A-11d2-B4B1-00A0D102CFBE}"
NABpinName            = "HWNABTS"


;----------------
; Localizable
;----------------
Msft=          		"Microsoft"
Manufacturer=  		"Microsoft"
NABTSFEC.DeviceDesc=    "NABTS/FEC VBI Codec"
NABTSFEC.FriendlyName=  "NABTS/FEC VBI Codec"
WDMcodecs=     		"WDM Streaming VBI Codecs"
