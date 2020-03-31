 Tasks ;LDID_WIN
WOW64_AUCopyFiles=16425     ;syswow64 directory

[DefaultInstall]
DelFiles	= AUDelSysFiles, AUDelRootFiles, AUDelInfFiles, CUNDelSysFiles, CUNDelInfFiles, CUNDelTaskFile
DelReg		= DelAUKeys, DelCUNKeys, DelOtherKeys
AddReg          = AddRegKillBit
 AddReg   = AddRegControlPanelCategory
CopyFiles	= AUCopyFilesSys, AUCopyAdmFiles
RegisterDLLs	= AU_dlls
CopyFiles=WOW64_AUCopyFiles

[AUCopyFilesSys]
wuapi.dll
wuauclt.exe
wuaucpl.cpl
wups.dll
wups2.dll
wuaueng.dll
wuauserv.dll
wucltui.dll
wuweb.dll

[WOW64_AUCopyFiles]
wuapi.dll,wwuapi.dll
wuweb.dll,wwuweb.dll
wups.dll,wwups.dll
wups2.dll,wwups2.dll
wuaueng.dll,wwuaueng.dll
wuaucpl.cpl,wwuaucpl.cpl

[AUCopyAdmFiles]
wuau.adm

[AU_dlls]
11,,wuapi.dll, 1
11,,wups.dll, 1
11,,wups2.dll, 1
11,,wuaueng.dll, 1
11,,wucltui.dll, 1
11,,wuweb.dll, 1
16425,,wuapi.dll,1
16425,,wuweb.dll,1
16425,,wups.dll,1
16425,,wups2.dll,1

[AUDelSysFiles]
auhook.dll
wuaupd98.dll
wuaucpl.cpl.disabled
wuv3is.dll
wupdinfo.dll
iuctl.dll

[AUDelRootFiles]
wuauclt.exe
wuaures.dll
wuauboot.exe

[AUDelInfFiles]
noau.inf

[CUNDelSysFiles]
wucrtupd.exe
wuloader.exe
wuslflib.dll

[CUNDelInfFiles]
wucrtupd.inf
wucrtupd.pnf

[CUNDelTaskFile]
%WUCUN_TS_JOBFILE%

[DelAUKeys]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\WindowsUpdate\HiddenItems"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\WindowsUpdate\Auto Update","SelfUpdateTime"
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{92D1915F-BAF9-4928-BB8E-967AEEC13527}"
;wuv3is
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{CEBC955E-58AF-11D2-A30A-00A0C903492B}"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\ControlPanel\Flags","wuaucpl.cpl"
HKLM,"SOFTWARE\Classes\CLSID\{BCBCD383-3E06-11D3-91A9-00C04F68105C}"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\ShellServiceObjectDelayLoad","AUHook"
;wuauboot
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{2FD2FACA-4071-11d3-8CD1-00C04F8ED9EB}"
;wuauclt
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{48B5862A-4071-11d3-8CD1-00C04F8ED9EB}"
;wuaucpl
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{11566B38-955B-4549-930F-7B7482668782}"
;auhook
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{BCBCD383-3E06-11D3-91A9-00C04F68105C}"
;wuaures
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{DF893A39-485B-457F-8366-965C316A143E}"
;wuaupd
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{0B9C698E-3029-11D3-91A5-00C04F68105C}"
HKLM,"SOFTWARE\CLASSES\CLSID\{0B9C698E-3029-11D3-91A5-00C04F68105C}"
HKLM,"SOFTWARE\CLASSES\CLSID\{C3CCEDF8-2412-11D3-919B-00C04F68105C}"
HKLM,"SOFTWARE\CLASSES\TypeLib\{BFF80E2A-3028-11D3-91A5-00C04F68105C}"
HKLM,"SOFTWARE\CLASSES\Wuaupd.WUProgressiveDL"
HKLM,"SOFTWARE\CLASSES\Wuaupd.WUProgressiveDL.1"
HKLM,"SOFTWARE\CLASSES\Wuaupd.WUQueueManager"
HKLM,"SOFTWARE\CLASSES\Wuaupd.WUQueueManager.1"

[DelCUNKeys]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Run","CriticalUpdate"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\Microsoft Windows Critical Update Notification"
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{73a41784-3241-11d2-aa16-00c04fb16f9e}"
HKLM,"Software\Microsoft\Windows\CurrentVersion\WindowsUpdate\Critical Update"
HKLM,"SOFTWARE\Microsoft\Active Setup\Installed Components\{7FD58812-D1B2-11d2-94A5-00C04F797DF4}"

[DelOtherKeys]
; Service Startup Key
HKLM,"Software\Microsoft\Windows\CurrentVersion\WindowsUpdate\Setup\ServiceStartup"
; old IUpdate 
HKLM,"SOFTWARE\CLASSES\Interface\{C350CAC8-7BEB-494A-A846-FE42C392E054}"
;wuv3is
HKLM,"SOFTWARE\CLASSES\CLSID\{CEBC955E-58AF-11D2-A30A-00A0C903492B}"
HKLM,"SOFTWARE\CLASSES\TypeLib\{CEBC954F-58AF-11D2-A30A-00A0C903492B}"
HKLM,"SOFTWARE\CLASSES\CV3.CV3"
HKLM,"SOFTWARE\CLASSES\CV3.CV3.1"
HKLM,"SOFTWARE\CLASSES\Interface\{CEBC955D-58AF-11D2-A30A-00A0C903492B}"
;wupdinfo
HKLM,"SOFTWARE\CLASSES\CLSID\{A3863C2E-86EB-11D1-A9DB-00C04FB16F9E}"
HKLM,"SOFTWARE\CLASSES\TypeLib\{A3863C1C-86EB-11D1-A9DB-00C04FB16F9E}"
HKLM,"SOFTWARE\CLASSES\CWUpdInfo.CWUpdInfo.1"
HKLM,"SOFTWARE\CLASSES\CWUpdInfo.CWUpdInfo"
HKLM,"SOFTWARE\CLASSES\Interface\{A3863C2D-86EB-11D1-A9DB-00C04FB16F9E}"
;iuctl.dll
HKLM,"SOFTWARE\Classes\IUCtl.Update"
HKLM,"SOFTWARE\Classes\IUCtl.Update.1"
HKLM,"SOFTWARE\Classes\IuCtl.Detection"
HKLM,"SOFTWARE\Classes\IuCtl.Detection.1"
HKLM,"SOFTWARE\Classes\IuCtl.ProgressListener"
HKLM,"SOFTWARE\Classes\IuCtl.ProgressListener.1"
HKLM,"SOFTWARE\Classes\IUCtl.UpdateCompleteListener"
HKLM,"SOFTWARE\Classes\IUCtl.UpdateCompleteListener.1"
HKLM,"SOFTWARE\Classes\CLSID\{9F1C11AA-197B-4942-BA54-47A8489BB47F}"
HKLM,"SOFTWARE\Classes\CLSID\{B5AF6951-FFBD-4E7B-A126-8F28F86E5D2E}"
HKLM,"SOFTWARE\Classes\CLSID\{3E873CB7-D5F5-43EF-AC4A-1F97D3118265}"
HKLM,"SOFTWARE\Classes\CLSID\{C65CF02D-749C-46F0-B2BF-3E65875A5C70}"
HKLM,"SOFTWARE\Classes\Interface\{CD19302B-FF55-4274-BA18-D98F21FCD672}"
HKLM,"SOFTWARE\Classes\Interface\{4F5E50AF-A2C0-40EF-AC9A-469D9462EA76}"
HKLM,"SOFTWARE\Classes\Interface\{8E2EF6DC-0AB8-4FE0-9049-3BEA4506BF8D}"
HKLM,"SOFTWARE\Classes\TypeLib\{306C2111-D294-4DD1-9C47-41036F58EBB3}"
HKLM,"SYSTEM\CurrentControlSet\Control\Nls\MUILanguages\RCV2\iuctl.dll"

[AddRegKillBit]
;AddRegKillBit WUV3IS
HKLM,"SOFTWARE\Microsoft\Internet Explorer\ActiveX Compatibility\{CEBC955E-58AF-11D2-A30A-00A0C903492B}","Compatibility Flags",0x00010001,0x00000400

 [AddRegControlPanelCategory]
 HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Control Panel\Extended Properties\{305CA226-D286-468e-B848-2B2E8E697B74} 2","%SystemRoot%\System32\wuaucpl.cpl",0x00010001,"10"


[Strings]
;Non-Localizable
;Localizable
;needs to be localized exactly as the task scheduler job created by CUN
WUCUN_TS_JOBFILE = "windows critical update notification.job"
