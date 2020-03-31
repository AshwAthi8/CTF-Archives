;
; SLIP.INF  -- This file contains installation information for
;                 the SLIP VBI codec
;
;*** Created 09/24/97  (Creation Date)
;

[Version]
signature="$CHICAGO$"
LayoutFile=Layout.inf
Class=Media
ClassGUID={4d36e96c-e325-11ce-bfc1-08002be10318}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*

[Manufacturer]
%MsftMfg%=Microsoft,NTamd64

[DestinationDirs]
DefaultDestDir=12

;---------------------------------------------------------------
;              M I C R O S O F T
;
;                  C O D E C
;---------------------------------------------------------------

[DefaultInstall]
AddReg=SLIP.Install

[SLIP.Install]
HKLM,%RunOnce%,"SLIP0",,"rundll32.exe streamci,StreamingDeviceSetup %SLIP.DeviceId%,GLOBAL,%GUID.BdaComponent%,%17%\SLIP.inf,VBIcodec"

[Microsoft.NTamd64]
%SLIP.DeviceDesc%=SLIP,SW\{03884CB6-E89A-4deb-B69E-8DC621686E6A}

[SLIP]
Include=    bda.inf
Needs=      BDA.Registration
AddReg=     SLIP.AddReg
;Include the following line for post dx8 builds
CopyFiles=  SLIP.CopyDrivers

[SLIP.NT]
Include=    bda.inf
Needs=      BDA.Registration
AddReg=     SLIP.AddReg.NT
;Include the following line for post dx8 builds
CopyFiles=  SLIP.CopyDrivers

[SLIP.AddReg]
HKR,,DevLoader,,*NTKERN
HKR,,NTMPDriver,,SLIP.sys
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[SLIP.AddReg.NT]
HKR,,DriverUsesSWEnumToLoad,3,01
HKR,,OkToHibernate,3,01
HKR,,DontSuspendIfStreamsAreRunning,3,01

[SLIP.CopyDrivers]
SLIP.sys,,,COPYFLG_NO_VERSION_DIALOG

[VBIcodec]
AddReg=VBIcodec.AddReg, BDA.CategoryRegistration

[VBIcodec.AddReg]
HKR,,CLSID,,%Proxy.CLSID%
HKR,,FriendlyName,,%SLIP.FriendlyName%
HKR,,Merit,1,00,00,60,00


[BDA.CategoryRegistration]

; BDA Receiver Components
;
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,,,%Category_BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,FriendlyName,,%Category_BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,CLSID,,%GUID.BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,Merit,1,00,00,60,00

[SLIP.NT.Services]
AddService = SLIP,0x00000002,SLIP.ServiceInstall

[SLIP.ServiceInstall]
DisplayName   = %SLIP.DeviceDesc%
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
ServiceBinary = %12%\SLIP.sys
LoadOrderGroup= Extended Base
































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
Proxy.CLSID="{17CCA71B-ECD7-11D0-B908-00A0C9223196}"  ; KsProxy.ax's ID, REQUIRED
GUID.BdaComponent="{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}"
Category_BdaComponent= "BDA Receiver Component"
AMcatID="{DA4E3DA0-D07D-11d0-BD50-00A0C911CE86}"
SLIP.DeviceId="{03884CB6-E89A-4deb-B69E-8DC621686E6A}"


;----------------
; Localizable
;----------------

Msft=                  "Microsoft"
MsftMfg=               "Microsoft"
SLIP.DeviceDesc=       "BDA Slip De-Framer"
SLIP.FriendlyName=     "BDA Slip De-Framer"

