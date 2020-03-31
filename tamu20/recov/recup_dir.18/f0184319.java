
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
signature="$CHICAGO$"
Class=Media
ClassGUID={4d36e96c-e325-11ce-bfc1-08002be10318}
Provider=%Msft%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830


[DefaultInstall]
Include=ks.inf
Needs=KS.Registration
AddReg=BDA.PluginRegistration, BDA.CategoryRegistration, BDA.NodeRegistration, BDA.PinNameRegistration, BDA.FilterRegistration,BDA.DeviceInstallation, NdisIP.Installation
DelReg=CategoryUnRegistration
RegisterDlls=BDA.RegisterDlls
;
;   Include the following line for post dx8 builds
;
CopyFiles=BdaPlugIn.Files, BdaFilter.Files, BdaDriver.Files

[DefaultInstall.NT]
Include=ks.inf
Needs=KS.Registration
AddReg=BDA.PluginRegistration, BDA.CategoryRegistration, BDA.NodeRegistration, BDA.PinNameRegistration, BDA.FilterRegistration,BDA.DeviceInstallation, NdisIP.Installation.NT
DelReg=CategoryUnRegistration
RegisterDlls=BDA.RegisterDlls
;
;   Include the following line for post dx8 builds
;
CopyFiles=BdaPlugIn.Files, BdaFilter.Files, BdaDriver.Files


[DestinationDirs]
DefaultDestDir=11
BdaFilter.Files=11
BdaPlugIn.Files=11
AllDll.Files=11
BdaDriver.Files=10,system32\drivers
AllDriver.Files=10,system32\drivers


[BDA.Registration]
;
;   Registers Filters/Categories but does not install devices
;
AddReg=BDA.PluginRegistration, BDA.CategoryRegistration, BDA.NodeRegistration, BDA.PinNameRegistration, BDA.FilterRegistration
DelReg=CategoryUnRegistration


[BDA.Installation]
;
;   Registers Filters/Categories and installs devices on 9x systems.
;
AddReg=BDA.PluginRegistration, BDA.CategoryRegistration, BDA.NodeRegistration, BDA.PinNameRegistration, BDA.FilterRegistration,BDA.DeviceInstallation, NdisIP.Installation
DelReg=CategoryUnRegistration
RegisterDlls=BDA.RegisterDlls
;
;   Include the following line for post dx8 builds
;
CopyFiles=BdaPlugIn.Files, BdaFilter.Files, BdaDriver.Files


[BDA.Installation.NT]
;
;   Registers Filters/Categories and installs devices on NT systems.
;
AddReg=BDA.PluginRegistration, BDA.CategoryRegistration, BDA.NodeRegistration, BDA.PinNameRegistration, BDA.FilterRegistration,BDA.DeviceInstallation, NdisIP.Installation.NT
DelReg=CategoryUnRegistration
RegisterDlls=BDA.RegisterDlls
;
;   Include the following line for post dx8 builds
;
CopyFiles=BdaPlugIn.Files, BdaFilter.Files, BdaDriver.Files


[BdaCategoryUnRegistration]


[BDA.CategoryRegistration]

; BDA Tuners
;
HKCR,%ActiveMovieCategories%\%GUID.BdaTuner%
HKCR,%ActiveMovieCategories%\%GUID.BdaTuner%,,,%Category_BdaTuner%
HKCR,%ActiveMovieCategories%\%GUID.BdaTuner%,FriendlyName,,%Category_BdaTuner%
HKCR,%ActiveMovieCategories%\%GUID.BdaTuner%,CLSID,,%GUID.BdaTuner%

; BDA Receiver Components
;
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,,,%Category_BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,FriendlyName,,%Category_BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,CLSID,,%GUID.BdaComponent%
HKCR,%ActiveMovieCategories%\%GUID.BdaComponent%,Merit,1,00,00,60,00

; BDA Rendering Components
;
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%,,,%Category_BdaRenderer%
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%,FriendlyName,,%Category_BdaRenderer%
HKCR,%ActiveMovieCategories%\%GUID.BdaRenderer%,CLSID,,"%GUID.BdaRenderer%"


[BDA.NodeRegistration]
; HKLM,%MediaCategories%\%GUID.Bridge%,Name,,%Node.Bridge%
; HKLM,%MediaCategories%\%GUID.Bridge%,Display,1,00,00,00,00


[BDA.PinNameRegistration]
HKLM,%MediaCategories%\%PinID.GUID.AtscTS%,Name,,%Pin.Name.AtscTS%
HKLM,%MediaCategories%\%PinID.GUID.AtscTS%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%PinID.GUID.IPV4%,Name,,%Pin.Name.IPV4%
HKLM,%MediaCategories%\%PinID.GUID.IPV4%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%PinID.GUID.MPE%,Name,,%Pin.Name.MPE%
HKLM,%MediaCategories%\%PinID.GUID.MPE%,Display,1,00,00,00,00
HKLM,%MediaCategories%\%PinID.GUID.NABTS%,Name,,%Pin.Name.NABTS%
HKLM,%MediaCategories%\%PinID.GUID.NABTS%,Display,1,00,00,00,00


[BDA.DeviceInstallation]

HKLM,%RunOnce%,"MPE0",,"rundll32.exe streamci,StreamingDeviceSetup %MPE.DeviceId%,GLOBAL,%GUID.BdaComponent%,%17%\mpe.inf,BDAcodec"
HKLM,%RunOnce%,"STREAMIP0",,"rundll32.exe streamci,StreamingDeviceSetup %StreamIP.DeviceId%,GLOBAL,%GUID.BdaRenderer%,%17%\streamip.inf,BDAcodec"
HKLM,%RunOnce%,"SLIP0",,"rundll32.exe streamci,StreamingDeviceSetup %Slip.DeviceId%,GLOBAL,%GUID.BdaComponent%,%17%\slip.inf,VBIcodec"
HKLM,%RunOnce%,"CCDECODE0",,"rundll32.exe streamci,StreamingDeviceSetup %CCDecode.DeviceId%,GLOBAL,%VBIcatID%,%17%\CCDECODE.inf,CCDECODE.Interface.Install"
HKLM,%RunOnce%,"NABTSFEC0",,"rundll32.exe streamci,StreamingDeviceSetup %NabtsFEC.DeviceID%,GLOBAL,%VBIcatID%,%17%\NABTSFEC.inf,NABTSFEC.Interface.Install"
HKLM,%RunOnce%,"WSTCODEC0",,"rundll32.exe streamci,StreamingDeviceSetup %WSTCodec.DeviceId%,GLOBAL,%VBIcatID%,%17%\WSTCODEC.inf,WSTCODEC.Interface.Install"


[NdisIP.Installation]

HKLM,Enum\Root\NDISIP\0000,HardwareID,,"NDISIP"


[NdisIP.Installation.NT]

HKLM,%RunOnce%,"NDISIP0",,"rundll32.exe streamci,StreamingDeviceSetup %NdisIP.DeviceId%,NDISIP,%NdisIP.GUID.BDANetInterface%,%17%\ndisip.inf,NdisIP.Reg"


[BDA.FilterRegistration]
HKLM,%PsisDecd.Reg%,"VendorID",1,31,11,00,00
HKLM,%PsisDecd.Reg%,"AdapterID",1,46,71,00,00
HKLM,%PsisDecd.Reg%,"ChannelNumber",1,0a,00,00,00
HKLM,%PsisDecd.Reg%,"MaxChannelNumber",1,44,00,00,00
HKLM,%PsisDecd.Reg%,"AtscNetwork",1,01,00,00,00
HKLM,%PsisDecd.Reg%,"EnableAtsc_PSIP",1,01,00,00,00
HKLM,%PsisDecd.Reg%,"DvbNetwork",1,00,00,00,00
HKLM,%PsisDecd.Reg%,"EnableDVB_SI",1,00,00,00,00
HKLM,%PsisDecd.Reg%,"EnableNetwkProvider",1,01,00,00,00
HKLM,%PsisDecd.Reg%,"GraphFile",,"\\psistest.grf"

[BDA.RegisterDlls]
11,,BdaPlgin.ax,1
11,,MsDvbNp.ax,1
11,,Mpeg2Data.ax,1
11,,PsisRndr.ax,1
11,,PsisDecd.dll,1

[BDA.PluginRegistration]

; BDA Device Control Handler
;
HKCR,CLSID\%GUID.BdaDeviceControl%,,,%PlugIn_BdaDevice%
HKCR,CLSID\%GUID.BdaDeviceControl%\InprocServer32,,,BdaPlgin.ax
HKCR,CLSID\%GUID.BdaDeviceControl%\InprocServer32,ThreadingModel,,Both
HKLM,%MediaInterfaces%\%GUID.BdaDeviceControl%,,,%PlugIn_BdaDevice%
HKLM,%MediaInterfaces%\%GUID.BdaDeviceControl%,IID,1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00

; BDA Pin Control Handler
;
HKCR,CLSID\%GUID.BdaPinControl%,,,%PlugIn_BdaDevice%
HKCR,CLSID\%GUID.BdaPinControl%\InprocServer32,,,BdaPlgin.ax
HKCR,CLSID\%GUID.BdaPinControl%\InprocServer32,ThreadingModel,,Both
HKLM,%MediaInterfaces%\%GUID.BdaPinControl%,,,%PlugIn_BdaDevice%
HKLM,%MediaInterfaces%\%GUID.BdaPinControl%,IID,1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00

; BDA Conditional Access Handler
;
HKCR,CLSID\%GUID.BdaCAControl%,,,%PlugIn_BdaDevice%
HKCR,CLSID\%GUID.BdaCAControl%\InprocServer32,,,CaPlgin.ax
HKCR,CLSID\%GUID.BdaCAControl%\InprocServer32,ThreadingModel,,Both
HKLM,%MediaInterfaces%\%GUID.BdaCAControl%,,,%PlugIn_BdaCA%
HKLM,%MediaInterfaces%\%GUID.BdaCAControl%,IID,1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00

[BdaDriver.Files]
BdaSup.sys,,,COPYFLG_NO_VERSION_DIALOG

[BdaFilter.Files]
MSDvbNP.ax,,,COPYFLG_NO_VERSION_DIALOG
PsisRndr.ax,,,COPYFLG_NO_VERSION_DIALOG
PsisDecd.dll,,,COPYFLG_NO_VERSION_DIALOG

[BdaPlugIn.Files]
BdaPlgIn.ax,,,COPYFLG_NO_VERSION_DIALOG

;
;  Bda.TXT is appended here
;

































[Strings]

; non-localizeable

;   Registry Paths
;
RunOnce="SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"
ActiveMovieCategories="CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance"
MediaCategories="SYSTEM\CurrentControlSet\Control\MediaCategories"
MediaInterfaces="SYSTEM\CurrentControlSet\Control\MediaInterfaces"
PsisDecd.Reg="SOFTWARE\Intel\PSIS\PSIS_DECODER"

;   Category and Interface GUIDs
;   Note that some category GUIDs are defined in ks.inf
;
VBIcatID="{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F}"
GUID.BdaTuner="{71985F48-1CA1-11d3-9CC8-00C04F7971E0}"
GUID.BdaComponent="{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}"
GUID.BdaRenderer= "{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}"
GUID.BdaDeviceControl="{FD0A5AF3-B41D-11d2-9C95-00C04F7971E0}"
GUID.BdaPinControl="{0DED49D5-A8B7-4d5d-97A1-12B0C195874D}"
GUID.BdaCAControl="{B0693766-5278-4ec6-B9E1-3CE40560EF5A}"
GUID.IPSinkPlugin="{3F4DC8E2-4050-11d3-8F4B-00C04F7971E2}"
NdisIP.GUID.BDANetInterface = "{9aa4a2cc-81e0-4cfd-802f-0f74526d2bd3}"

;   SWEnum Device GUIDs
;
MPE.DeviceId="{8E60217D-A2EE-47f8-B0C5-0F44C55F66DC}"
Slip.DeviceID="{03884CB6-E89A-4deb-B69E-8DC621686E6A}"
StreamIP.DeviceId="{D84D449B-62FB-4ebb-B969-5183ED3DFB51}"
NdisIP.DeviceID="{48926476-2cae-4ded-a86e-73ddebed6779}"
CCDecode.DeviceId="{562370a8-f8dd-11d2-bc64-00a0c95ec22e}"
NabtsFEC.DeviceID="{07DAD662-22F1-11d1-A9F4-00C04FBBDE8F}"
WSTCodec.DeviceId="{70BC06E0-5666-11d3-A184-00105AEF9F33}"

;   Pin and Filter Name GUIDs
;   Note that some pin and filter name GUIDs are defined in ks.inf
;
PinID.GUID.IPV4="{3fdffa70-ac9a-11d2-8f17-00c04f7971e2}"
PinID.GUID.MPE="{C1B06D73-1DBB-11d3-8F46-00C04F7971E2}"
PinID.GUID.NABTS="{FB6C4286-0353-11d1-905F-0000C0CC16BA}"
PinID.GUID.AtscTS="{78216A81-CFA8-493e-9711-36A61C08BD9D}"

;   Category Names
;   Note that some categorys are defined in ks.inf
;
Category_BdaTuner="BDA Source Filters"
Category_BdaComponent="BDA Receiver Components"
Category_BdaRenderer="BDA Rendering Filters"
PlugIn_BdaDevice="BDA Device Control Plug-in"
PlugIn_BdaCA="BDA Conditional Access Plug-in"

;   Pin and Filter Names
;   Note that some pin and filter names are defined in ks.inf
;
Pin.Name.AtscTS="MPEG2 Transport"
Pin.Name.IPV4="IPv4"
Pin.Name.MPE="MPE"
Pin.Name.NABTS="NABTS"


; localizeable

Msft="Microsoft"
MsftMfg="Microsoft"





[defaultinstall]
CopyFiles=wBdaPlugIn.Files,wBdaFilter.Files,wBdaDriver.Files
RegisterDlls=wBDA.RegisterDlls
AddReg=wBDA.PluginRegistration,wBDA.CategoryRegistration,wBDA.NodeRegistration,wBDA.PinNameRegistration,wBDA.FilterRegistration,wBDA.DeviceInstallation,wNdisIP.Installation
DelReg=wCategoryUnRegistration

[defaultinstall.nt]
CopyFiles=wBdaPlugIn.Files,wBdaFilter.Files,wBdaDriver.Files
RegisterDlls=wBDA.RegisterDlls
AddReg=wBDA.PluginRegistration,wBDA.CategoryRegistration,wBDA.NodeRegistration,wBDA.PinNameRegistration,wBDA.FilterRegistration,wBDA.DeviceInstallation,wNdisIP.Installation.NT
DelReg=wCategoryUnRegistration

[bda.registration]
AddReg=wBDA.PluginRegistration,wBDA.CategoryRegistration,wBDA.NodeRegistration,wBDA.PinNameRegistration,wBDA.FilterRegistration
DelReg=wCategoryUnRegistration

[bda.installation]
CopyFiles=wBdaPlugIn.Files,wBdaFilter.Files,wBdaDriver.Files
RegisterDlls=wBDA.RegisterDlls
AddReg=wBDA.PluginRegistration,wBDA.CategoryRegistration,wBDA.NodeRegistration,wBDA.PinNameRegistration,wBDA.FilterRegistration,wBDA.DeviceInstallation,wNdisIP.Installation
DelReg=wCategoryUnRegistration

[bda.installation.nt]
CopyFiles=wBdaPlugIn.Files,wBdaFilter.Files,wBdaDriver.Files
RegisterDlls=wBDA.RegisterDlls
AddReg=wBDA.PluginRegistration,wBDA.CategoryRegistration,wBDA.NodeRegistration,wBDA.PinNameRegistration,wBDA.FilterRegistration,wBDA.DeviceInstallation,wNdisIP.Installation.NT
DelReg=wCategoryUnRegistration

[wBdaPlugIn.Files]
BdaPlgIn.ax,wBdaPlgIn.ax,,COPYFLG_NO_VERSION_DIALOG

[wBDA.NodeRegistration]
[wBDA.RegisterDlls]
16425,,BdaPlgin.ax,1
16425,,MsDvbNp.ax,1
16425,,Mpeg2Data.ax,1
16425,,PsisRndr.ax,1
16425,,PsisDecd.dll,1

[wBDA.DeviceInstallation]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",MPE0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {8E60217D-A2EE-47f8-B0C5-0F44C55F66DC},GLOBAL,{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0},%10%\INF\mpe.inf,BDAcodec"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",STREAMIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {D84D449B-62FB-4ebb-B969-5183ED3DFB51},GLOBAL,{71985F4A-1CA1-11d3-9CC8-00C04F7971E0},%10%\INF\streamip.inf,BDAcodec"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",SLIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {03884CB6-E89A-4deb-B69E-8DC621686E6A},GLOBAL,{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0},%10%\INF\slip.inf,VBIcodec"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",CCDECODE0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {562370a8-f8dd-11d2-bc64-00a0c95ec22e},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\CCDECODE.inf,CCDECODE.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",NABTSFEC0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {07DAD662-22F1-11d1-A9F4-00C04FBBDE8F},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\NABTSFEC.inf,NABTSFEC.Interface.Install"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",WSTCODEC0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {70BC06E0-5666-11d3-A184-00105AEF9F33},GLOBAL,{07DAD660-22F1-11d1-A9F4-00C04FBBDE8F},%10%\INF\WSTCODEC.inf,WSTCODEC.Interface.Install"

[wNdisIP.Installation.NT]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce",NDISIP0,0x00004000,"rundll32.exe streamci,StreamingDeviceSetup {48926476-2cae-4ded-a86e-73ddebed6779},NDISIP,{9aa4a2cc-81e0-4cfd-802f-0f74526d2bd3},%10%\INF\ndisip.inf,NdisIP.Reg"

[wBDA.FilterRegistration]
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",VendorID,0x00004001,31,11,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",AdapterID,0x00004001,46,71,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",ChannelNumber,0x00004001,0a,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",MaxChannelNumber,0x00004001,44,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",AtscNetwork,0x00004001,01,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",EnableAtsc_PSIP,0x00004001,01,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",DvbNetwork,0x00004001,00,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",EnableDVB_SI,0x00004001,00,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",EnableNetwkProvider,0x00004001,01,00,00,00
HKLM,"SOFTWARE\Intel\PSIS\PSIS_DECODER",GraphFile,0x00004000,"\\psistest.grf"

[wBDA.PluginRegistration]
HKCR,"CLSID\{FD0A5AF3-B41D-11d2-9C95-00C04F7971E0}",,0x00004000,"BDA Device Control Plug-in"
HKCR,"CLSID\{FD0A5AF3-B41D-11d2-9C95-00C04F7971E0}\InprocServer32",,0x00004000,BdaPlgin.ax
HKCR,"CLSID\{FD0A5AF3-B41D-11d2-9C95-00C04F7971E0}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"SYSTEM\CurrentControlSet\Control\MediaInterfaces\{FD0A5AF3-B41D-11d2-9C95-00C04F7971E0}",,0x00004000,"BDA Device Control Plug-in"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaInterfaces\{FD0A5AF3-B41D-11d2-9C95-00C04F7971E0}",IID,0x00004001,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00
HKCR,"CLSID\{0DED49D5-A8B7-4d5d-97A1-12B0C195874D}",,0x00004000,"BDA Device Control Plug-in"
HKCR,"CLSID\{0DED49D5-A8B7-4d5d-97A1-12B0C195874D}\InprocServer32",,0x00004000,BdaPlgin.ax
HKCR,"CLSID\{0DED49D5-A8B7-4d5d-97A1-12B0C195874D}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"SYSTEM\CurrentControlSet\Control\MediaInterfaces\{0DED49D5-A8B7-4d5d-97A1-12B0C195874D}",,0x00004000,"BDA Device Control Plug-in"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaInterfaces\{0DED49D5-A8B7-4d5d-97A1-12B0C195874D}",IID,0x00004001,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00
HKCR,"CLSID\{B0693766-5278-4ec6-B9E1-3CE40560EF5A}",,0x00004000,"BDA Device Control Plug-in"
HKCR,"CLSID\{B0693766-5278-4ec6-B9E1-3CE40560EF5A}\InprocServer32",,0x00004000,CaPlgin.ax
HKCR,"CLSID\{B0693766-5278-4ec6-B9E1-3CE40560EF5A}\InprocServer32",ThreadingModel,0x00004000,Both
HKLM,"SYSTEM\CurrentControlSet\Control\MediaInterfaces\{B0693766-5278-4ec6-B9E1-3CE40560EF5A}",,0x00004000,"BDA Conditional Access Plug-in"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaInterfaces\{B0693766-5278-4ec6-B9E1-3CE40560EF5A}",IID,0x00004001,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00

[wBDA.PinNameRegistration]
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{78216A81-CFA8-493e-9711-36A61C08BD9D}",Name,0x00004000,"MPEG2 Transport"
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{78216A81-CFA8-493e-9711-36A61C08BD9D}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{3fdffa70-ac9a-11d2-8f17-00c04f7971e2}",Name,0x00004000,IPv4
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{3fdffa70-ac9a-11d2-8f17-00c04f7971e2}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{C1B06D73-1DBB-11d3-8F46-00C04F7971E2}",Name,0x00004000,MPE
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{C1B06D73-1DBB-11d3-8F46-00C04F7971E2}",Display,0x00004001,00,00,00,00
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4286-0353-11d1-905F-0000C0CC16BA}",Name,0x00004000,NABTS
HKLM,"SYSTEM\CurrentControlSet\Control\MediaCategories\{FB6C4286-0353-11d1-905F-0000C0CC16BA}",Display,0x00004001,00,00,00,00

[wCategoryUnRegistration]
[wNdisIP.Installation]
HKLM,"Enum\Root\NDISIP\0000",HardwareID,0x00004000,NDISIP

[wBDA.CategoryRegistration]
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F48-1CA1-11d3-9CC8-00C04F7971E0}",,0x00004000
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F48-1CA1-11d3-9CC8-00C04F7971E0}",,0x00004000,"BDA Source Filters"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F48-1CA1-11d3-9CC8-00C04F7971E0}",FriendlyName,0x00004000,"BDA Source Filters"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F48-1CA1-11d3-9CC8-00C04F7971E0}",CLSID,0x00004000,{71985F48-1CA1-11d3-9CC8-00C04F7971E0}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}",,0x00004000
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}",,0x00004000,"BDA Receiver Components"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}",FriendlyName,0x00004000,"BDA Receiver Components"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}",CLSID,0x00004000,{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{FD0A5AF4-B41D-11d2-9C95-00C04F7971E0}",Merit,0x00004001,00,00,60,00
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}",,0x00004000
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}",,0x00004000,"BDA Rendering Filters"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}",FriendlyName,0x00004000,"BDA Rendering Filters"
HKCR,"CLSID\{da4e3da0-d07d-11d0-bd50-00a0c911ce86}\Instance\{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}",CLSID,0x00004000,{71985F4A-1CA1-11d3-9CC8-00C04F7971E0}

[wBdaFilter.Files]
MSDvbNP.ax,wMSDvbNP.ax,,COPYFLG_NO_VERSION_DIALOG
PsisRndr.ax,wPsisRndr.ax,,COPYFLG_NO_VERSION_DIALOG
PsisDecd.dll,wPsisDecd.dll,,COPYFLG_NO_VERSION_DIALOG

[wBdaDriver.Files]

[DestinationDirs]
wBdaPlugIn.Files=16425
wBdaFilter.Files=16425
wBdaDriver.Files=10,system32\drivers
