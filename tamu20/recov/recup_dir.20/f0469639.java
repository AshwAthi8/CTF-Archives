

[Version]
Signature="$Windows NT$"
LayoutFile=layout.inf
SetupClass=BASE

[BaseWinOptions]
InstallDRM

[InstallDRM]














DelReg=wDelReg.Uninst

AddReg=wDelayReg.OCX

[wDelayReg.OCX]

HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","OE_WMPDRM_Install_1",0x00004000, "%16425%\regsvr32 /s """%16425%\drmstor.dll""""
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","OE_WMPDRM_Install_2",0x00004000, "%16425%\regsvr32 /s """%16425%\drmclien.dll""""
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","OE_WMPDRM_Install_4",0x00004000, "%16425%\regsvr32 /s """%16425%\drmv2clt.dll""""
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","OE_WMPDRM_Install_5",0x00004000, "%16425%\regsvr32 /s """%16425%\blackbox.dll""""
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","OE_WMPDRM_Install_6",0x00004000, "%16425%\regsvr32 /s """%16425%\msnetobj.dll""""
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","OE_WMPDRM_Install_7",0x00004000, "%16425%\drmupgds.exe"































[wDelReg.Uninst]
HKCR, "Software\Microsoft\Multimedia\Components\Installed\DRM_DRM\Uninstall"

[DestinationDirs]
DRMCopy.System=11
DRMCopy.OS=11
DRMCopy.INF=17


DRMCopy.Core =16422,%MP2_FOLDER%








































[DRMCopy.INF]
drm.inf

[DRMCopy.Plugin]
npwmsdrm.dll,,,97
npdrmv2.dll,,,97
npdrmv2.zip,,,97

[DRMCopy.Core] 
npwmsdrm.dll,,,97
npdrmv2.dll,,,97
npdrmv2.zip,,,97

[DRMCopy.System] 
drmclien.dll,,,97
drmstor.dll,,,97
drmv2clt.dll,,,97
blackbox.dll,,,97

msnetobj.dll,,,97

[DRMCopy.OS] 








[Strings]
KEY_WMP = "SOFTWARE\Microsoft\MediaPlayer"
;;;;;;;--------------------------------------------
;-- Only localize strings below this line
;;;;;;--------------------------------------------
LANGUAGE="EN"

MP2_FOLDER = "Windows Media Player"
PROGRAMFILES = "Program Files"

