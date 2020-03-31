8BC3}"
HKCR,"CLSID\{45AC8C64-23E2-11D1-A696-00C04FD58BC3}"
HKCR,"CLSID\{45AC8C65-23E2-11D1-A696-00C04FD58BC3}"
HKCR,"MSInfo.Snapin.1"
HKCR,"MSInfo.Extension"
HKCR,"MSInfo.Extension.1"
HKCR,"MSInfo.Snapin"
HKCR,"MSInfo.Snapin.1"
HKCR,"MSInfo.About"
HKCR,"MSInfo.About.1"

HKLM,"SOFTWARE\Classes\CLSID\{45AC8C62-23E2-11D1-A696-00C04FD58BC3}"
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C63-23E2-11D1-A696-00C04FD58BC3}"
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C64-23E2-11D1-A696-00C04FD58BC3}"
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C65-23E2-11D1-A696-00C04FD58BC3}"
HKLM,"SOFTWARE\Classes\MSInfo.About"
HKLM,"SOFTWARE\Classes\MSInfo.About.1";
HKLM,"SOFTWARE\Classes\MSInfo.Application"
HKLM,"SOFTWARE\Classes\MSInfo.Application.1"
HKLM,"SOFTWARE\Classes\MSInfo.Extension"
HKLM,"SOFTWARE\Classes\MSInfo.Snapin";


HKLM,"SOFTWARE\Microsoft\MMC\NodeTypes\{45ac8c66-23e2-11d1-a696-00c04fd58bc3}"
HKLM,"SOFTWARE\Microsoft\MMC\SnapIns\{45ac8c63-23e2-11d1-a696-00c04fd58bc3}"
HKLM,"SOFTWARE\Microsoft\MMC\SnapIns\{45ac8c64-23e2-11d1-a696-00c04fd58bc3}"


[MSinfoRegistryItems]
HKCR,".nfo","",0x00000002,"MSInfo.Document"
HKCR,"MSInfo.Document","",0x00000002,"MSInfo File"
HKCR,"MSInfo.Document\DefaultIcon","",0x00000002,""%16427%\Microsoft Shared\MSInfo\MSInfo32.exe",0"
HKCR,"MSInfo.Document\Shell\Open\Command","",0x00000002,""%16427%\Microsoft Shared\MSInfo\MSInfo32.exe" "/msinfo_file %1""
HKCR,"MSInfo.Document\Shell\Print\Command","",0x00000002,"""%16427%\Microsoft Shared\MSInfo\MSInfo32.exe"" /p ""%1"""
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo","Path",0x00000002,"%16427%\Microsoft Shared\MSInfo\MSInfo32.exe" 
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo\Categories"
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo\Templates"
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo\Toolsets\MSInfo"
HKLM,"SOFTWARE\Classes\Applications\MSInfo32.exe","NoOpenWith",0x00000002,""
HKLM,"SOFTWARE\Classes\Applications\MSInfo32.exe","NoOpenWith",0x00000002,""
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\msinfo32.exe","",0x00000002,""%16427%\Microsoft Shared\MSInfo\MSInfo32.exe""
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\msinfo32.exe","Path",0x00000002,""%16427%\Microsoft Shared\MSInfo""


[DestinationDirs]
MSInfoCopyFiles   = 16427,%MSINFOPATHL%  ;DIRID_PROGRAM_FILES_COMMON    
MSInfoDelOldFiles = 16427,%MSINFOPATHL%  ;DIRID_PROGRAM_FILES_COMMON

[MSInfoDelOldFiles]
imgwalk.dll
msinf16h.exe
msinfo32.dll
msinfo32.msc

[MSInfoCopyFiles]
msinfo32.exe

[MSInfoCopyFiles.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"

[MSInfoInstallItems]
Name       = %MSInfo32_DESC%
CmdLine    = 16427,%MSINFOPATHL%,msinfo32.exe
SubDir     = %SystemTools_GROUP%
WorkingDir = 16427,%MSINFOPATHL%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22575"
DisplayResource="%SystemRoot%\system32\shell32.dll",22063

[MSInfoRegSvr]



[Strings]
MSInfo32_DESC     = "System Information"
MSInfo32_INFOTIP  = "Displays current system information."
SystemTools_GROUP = "Accessories\System Tools"
MSINFOPATHL       = "Microsoft Shared\MSInfo"




[defaultinstall]
CopyFiles=wMSInfoCopyFiles
DelFiles=wMSInfoDelOldFiles
AddReg=wMSinfoRegistryItems
DelReg=wDelMSinfoRegistryItems

[wMSinfoRegistryItems]
HKCR,.nfo,,0x00004002,MSInfo.Document
HKCR,MSInfo.Document,,0x00004002,"MSInfo File"
HKCR,"MSInfo.Document\DefaultIcon",,0x00004002,"%16428%\Microsoft Shared\MSInfo\MSInfo32.exe,0"
HKCR,"MSInfo.Document\Shell\Open\Command",,0x00004002,"%16428%\Microsoft Shared\MSInfo\MSInfo32.exe /msinfo_file %%1"
HKCR,"MSInfo.Document\Shell\Print\Command",,0x00004002,"""%16428%\Microsoft Shared\MSInfo\MSInfo32.exe"" /p ""%%1"""
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo",Path,0x00004002,"%16428%\Microsoft Shared\MSInfo\MSInfo32.exe"
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo\Categories",,0x00004000
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo\Templates",,0x00004000
HKLM,"SOFTWARE\Microsoft\Shared Tools\MSInfo\Toolsets\MSInfo",,0x00004000
HKLM,"SOFTWARE\Classes\Applications\MSInfo32.exe",NoOpenWith,0x00004002,
HKLM,"SOFTWARE\Classes\Applications\MSInfo32.exe",NoOpenWith,0x00004002,
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\msinfo32.exe",,0x00004002,"%16428%\Microsoft Shared\MSInfo\MSInfo32.exe"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\msinfo32.exe",Path,0x00004002,"%16428%\Microsoft Shared\MSInfo"

[wMSInfoCopyFiles]
msinfo32.exe,wmsinfo32.exe

[wMSInfoDelOldFiles]
imgwalk.dll
msinf16h.exe
msinfo32.dll
msinfo32.msc

[wDelMSinfoRegistryItems]
HKCR,MSInfo.Application,,0x00004000
HKCR,MSInfo.Application.1,,0x00004000
HKCR,"CLSID\{45AC8C62-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKCR,"CLSID\{45AC8C63-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKCR,"CLSID\{45AC8C64-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKCR,"CLSID\{45AC8C65-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKCR,MSInfo.Snapin.1,,0x00004000
HKCR,MSInfo.Extension,,0x00004000
HKCR,MSInfo.Extension.1,,0x00004000
HKCR,MSInfo.Snapin,,0x00004000
HKCR,MSInfo.Snapin.1,,0x00004000
HKCR,MSInfo.About,,0x00004000
HKCR,MSInfo.About.1,,0x00004000
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C62-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C63-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C64-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKLM,"SOFTWARE\Classes\CLSID\{45AC8C65-23E2-11D1-A696-00C04FD58BC3}",,0x00004000
HKLM,"SOFTWARE\Classes\MSInfo.About",,0x00004000
HKLM,"SOFTWARE\Classes\MSInfo.About.1",,0x00004000
HKLM,"SOFTWARE\Classes\MSInfo.Application",,0x00004000
HKLM,"SOFTWARE\Classes\MSInfo.Application.1",,0x00004000
HKLM,"SOFTWARE\Classes\MSInfo.Extension",,0x00004000
HKLM,"SOFTWARE\Classes\MSInfo.Snapin",,0x00004000
HKLM,"SOFTWARE\Microsoft\MMC\NodeTypes\{45ac8c66-23e2-11d1-a696-00c04fd58bc3}",,0x00004000
HKLM,"SOFTWARE\Microsoft\MMC\SnapIns\{45ac8c63-23e2-11d1-a696-00c04fd58bc3}",,0x00004000
HKLM,"SOFTWARE\Microsoft\MMC\SnapIns\{45ac8c64-23e2-11d1-a696-00c04fd58bc3}",,0x00004000

[DestinationDirs]
wMSInfoCopyFiles=16428,Microsoft Shared\MSInfo
wMSInfoDelOldFiles=16428,Microsoft Shared\MSInfo
