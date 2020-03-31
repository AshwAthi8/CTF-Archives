; Copyright (c) Microsoft Corporation.  All rights reserved.
;
; Pinball
;
; 1/11/96 Davepl Created
; 2/11/96 Stevowen Modified

[version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf

;Destination Directories for CopyFiles Sections

[DestinationDirs]
BaseCopyProgramFiles            = 16422,%INSTALL_DIR% ;DIRID_PROGRAM_FILES
PinballDeleteFiles              = 16422,%INSTALL_DIR% ;DIRID_PROGRAM_FILES
PinballCopyFilesHelp            = 18 ;LDID_HELP

[BaseWinOptions]
BaseSection

[Optional Components]
Pinball

[Pinball]
OptionDesc              = %PINBALL_Desc%
Tip                     = %PINBALL_TIP%
IconIndex               = 64            ;Windows mini-icon for dialogs
Parent                  = Games
CopyFiles               = BaseCopyProgramFiles, PinballCopyFilesHelp
AddReg                  = Pinball.AddReg
DelFiles                = PinballDeleteFiles
ProfileItems            = PinballUninstallItems,PinballInstallItems
Uninstall               = PINBALL.Remove
Modes                   = 0,1,2,3
SizeApproximation=17960960


[PINBALL.Remove]
DelReg                  = PINBALL.DelPath
DelFiles                = BaseCopyProgramFiles, PinballCopyFilesHelp, PinballDeleteFiles
ProfileItems            = PinballUninstallItems, PinballUninstallCommonItems


[PinballInstallItems]
Name       = %Pinball_DESC%
CmdLine    = 16422,%INSTALL_DIR%,pinball.exe
SubDir     = %GAMES_DESC%
WorkingDir = 16422, %INSTALL_DIR%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22569"
DisplayResource="%SystemRoot%\system32\shell32.dll",22057

[PinballUninstallItems]
Name       = %Pinball_DESC%,0x00000003
Subdir     = %GAMES_DESC%

[PinballUninstallCommonItems]
Name       = %Pinball_DESC%,0x00000002
Subdir     = %GAMES_DESC%


[Pinball.AddReg]
HKLM,"%KEY_APP_PATH%\pinball.exe",,,"%16422%\%INSTALL_DIR%\pinball.exe"
HKLM,"%KEY_APP_PATH%\pinball.exe",Path,,"%16422%\%INSTALL_DIR%"

[PINBALL.DelPath]
HKLM,"%KEY_APP_PATH%\pinball.exe"

[BaseCopyProgramFiles]
FONT.DAT
PINBALL.DAT
PINBALL.EXE
PINBALL.MID
PINBALL2.MID
SOUND1.WAV
SOUND104.WAV
SOUND105.WAV
SOUND108.WAV
SOUND111.WAV
SOUND112.WAV
SOUND12.WAV
SOUND13.WAV
SOUND131.WAV
SOUND136.WAV
SOUND14.WAV
SOUND16.WAV
SOUND17.WAV
SOUND18.WAV
SOUND181.WAV
SOUND19.WAV
SOUND20.WAV
SOUND21.WAV
SOUND22.WAV
SOUND24.WAV
SOUND240.WAV
SOUND243.WAV
SOUND25.WAV
SOUND26.WAV
SOUND27.WAV
SOUND28.WAV
SOUND29.WAV
SOUND3.WAV
SOUND30.WAV
SOUND34.WAV
SOUND35.WAV
SOUND36.WAV
SOUND38.WAV
SOUND39.WAV
SOUND4.WAV
SOUND42.WAV
SOUND43.WAV
SOUND45.WAV
SOUND49.WAV
SOUND49D.WAV
SOUND5.WAV
SOUND50.WAV
SOUND528.WAV
SOUND53.WAV
SOUND54.WAV
SOUND55.WAV
SOUND560.WAV
SOUND563.WAV
SOUND57.WAV
SOUND58.WAV
SOUND6.WAV
SOUND65.WAV
SOUND68.WAV
SOUND7.WAV
SOUND713.WAV
SOUND735.WAV
SOUND8.WAV
SOUND827.WAV
SOUND9.WAV
SOUND999.WAV
table.bmp
wavemix.inf

[BaseCopyProgramFiles.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[PinballDeleteFiles]
pinball.cnt
pinball.hlp


[PinballCopyFilesHelp]
pinball.chm
pinball.hlp

[PinballCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"

































[Strings]
KEY_APP_PATH    = "SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths"
GAMES_DESC      = "Games"
PINBALL_Desc    = "Pinball"
PINBALL_TIP     = "3-D arcade pinball game."
Pinball_Infotip = "Begins a game of 3-D Pinball."
INSTALL_DIR     = "Windows NT\Pinball"





[pinball]
CopyFiles=wBaseCopyProgramFiles
DelFiles=wPinballDeleteFiles
AddReg=wPinball.AddReg

[pinball.remove]
DelFiles=wBaseCopyProgramFiles,wPinballDeleteFiles
DelReg=wPINBALL.DelPath

[wBaseCopyProgramFiles]
FONT.DAT,wFONT.DAT
PINBALL.DAT,wPINBALL.DAT
PINBALL.EXE,wPINBALL.EXE
PINBALL.MID,wPINBALL.MID
PINBALL2.MID,wPINBALL2.MID
SOUND1.WAV,wSOUND1.WAV
SOUND104.WAV,wSOUND104.WAV
SOUND105.WAV,wSOUND105.WAV
SOUND108.WAV,wSOUND108.WAV
SOUND111.WAV,wSOUND111.WAV
SOUND112.WAV,wSOUND112.WAV
SOUND12.WAV,wSOUND12.WAV
SOUND13.WAV,wSOUND13.WAV
SOUND131.WAV,wSOUND131.WAV
SOUND136.WAV,wSOUND136.WAV
SOUND14.WAV,wSOUND14.WAV
SOUND16.WAV,wSOUND16.WAV
SOUND17.WAV,wSOUND17.WAV
SOUND18.WAV,wSOUND18.WAV
SOUND181.WAV,wSOUND181.WAV
SOUND19.WAV,wSOUND19.WAV
SOUND20.WAV,wSOUND20.WAV
SOUND21.WAV,wSOUND21.WAV
SOUND22.WAV,wSOUND22.WAV
SOUND24.WAV,wSOUND24.WAV
SOUND240.WAV,wSOUND240.WAV
SOUND243.WAV,wSOUND243.WAV
SOUND25.WAV,wSOUND25.WAV
SOUND26.WAV,wSOUND26.WAV
SOUND27.WAV,wSOUND27.WAV
SOUND28.WAV,wSOUND28.WAV
SOUND29.WAV,wSOUND29.WAV
SOUND3.WAV,wSOUND3.WAV
SOUND30.WAV,wSOUND30.WAV
SOUND34.WAV,wSOUND34.WAV
SOUND35.WAV,wSOUND35.WAV
SOUND36.WAV,wSOUND36.WAV
SOUND38.WAV,wSOUND38.WAV
SOUND39.WAV,wSOUND39.WAV
SOUND4.WAV,wSOUND4.WAV
SOUND42.WAV,wSOUND42.WAV
SOUND43.WAV,wSOUND43.WAV
SOUND45.WAV,wSOUND45.WAV
SOUND49.WAV,wSOUND49.WAV
SOUND49D.WAV,wSOUND49D.WAV
SOUND5.WAV,wSOUND5.WAV
SOUND50.WAV,wSOUND50.WAV
SOUND528.WAV,wSOUND528.WAV
SOUND53.WAV,wSOUND53.WAV
SOUND54.WAV,wSOUND54.WAV
SOUND55.WAV,wSOUND55.WAV
SOUND560.WAV,wSOUND560.WAV
SOUND563.WAV,wSOUND563.WAV
SOUND57.WAV,wSOUND57.WAV
SOUND58.WAV,wSOUND58.WAV
SOUND6.WAV,wSOUND6.WAV
SOUND65.WAV,wSOUND65.WAV
SOUND68.WAV,wSOUND68.WAV
SOUND7.WAV,wSOUND7.WAV
SOUND713.WAV,wSOUND713.WAV
SOUND735.WAV,wSOUND735.WAV
SOUND8.WAV,wSOUND8.WAV
SOUND827.WAV,wSOUND827.WAV
SOUND9.WAV,wSOUND9.WAV
SOUND999.WAV,wSOUND999.WAV
table.bmp,wtable.bmp
wavemix.inf,wwavemix.inf

[wPinballDeleteFiles]
pinball.cnt
pinball.hlp

[wPinball.AddReg]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\pinball.exe",,0x00004000,"%16426%\Windows NT\Pinball\pinball.exe"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\pinball.exe",Path,0x00004000,"%16426%\Windows NT\Pinball"

[wPINBALL.DelPath]
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\pinball.exe",,0x00004000

[DestinationDirs]
wBaseCopyProgramFiles=16426,Windows NT\Pinball
wPinballDeleteFiles=16426,Windows NT\Pinball
