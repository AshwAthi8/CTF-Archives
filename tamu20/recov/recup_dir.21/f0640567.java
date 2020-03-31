
; This is the Setup information file to install optional components
; Copyright (c) Microsoft Corporation.  All rights reserved.


[version]
signature="$CHICAGO$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf


[DestinationDirs]
MPlayCopyFilesSys           = 11        ;LDID_SYSTEM
MPlayCopyFilesHelp          = 18        ;LDID_HELP
RecCopyFilesSys             = 11        ;LDID_SYSTEM
VolCopyFilesSys             = 11        ;LDID_SYSTEM
VolCopyFilesHelp            = 18        ;LDID_HELP

[Optional Components]
MultiM  ;Top level option

MPlay

Rec
Vol

[MultiM]
OptionDesc              = %MultiM_DESC%
Tip                     = %MultiM_TIP%
IconIndex               = 27 ;Speaker mini-icon for dialogs
Parent                  = AccessUtil


[MPlay]
OptionDesc              = %MPlay_DESC%
Tip                     = %MPlay_TIP%
IconIndex               = 53 ;Speaker mini-icon for dialogs
Parent                  = MultiM
CopyFiles               = MPLayCopyFilesSys, MPlayCopyFilesHelp
ProfileItems            = MPlayUninstallItems, MPlayUninstallItemsCommon
Uninstall               = MPlayUninstall
Modes                   = 0,1,2,3
SizeApproximation=192512


[MPlayUninstall]
DelFiles                = MPlayCopyFilesSys, MPlayCopyFilesHelp
ProfileItems            = MPlayUninstallItems, MPlayUninstallItemsCommon

[MPlayInstallItems]
Name       = %MPlay_DESC%
CmdLine    = 11,,mplay32.exe
WorkingDir = 11
Subdir     = %Multimed_GROUP%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22584"
DisplayResource="%SystemRoot%\system32\shell32.dll",22072

[MPlayUninstallItems]
Name       = %MPlay_DESC%,0x00000003
Subdir     = %Multimed_GROUPOLD%

[MPlayUninstallItemsCommon]
Name       = %MPlay_DESC%,0x00000002
Subdir     = %Multimed_GROUP%


[Rec]
OptionDesc              = %Rec_DESC%
Tip                     = %Rec_TIP%
IconIndex               = 8  ;Speaker mini-icon for dialogs
Parent                  = MultiM
CopyFiles               = RecCopyFilesSys
ProfileItems            = RecUninstallItems, RecInstallItems
Uninstall               = RecUninstall
Modes                   = 0,1,2,3
SizeApproximation=204800


[RecUninstall]
DelFiles                = RecCopyFilesSys
ProfileItems            = RecUninstallItems, RecUninstallItemsCommon

[RecInstallItems]
Name       = %Rec_DESC%
CmdLine    = 11,,sndrec32.exe
WorkingDir = 11
Subdir     = %Multimed_GROUP%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22573"
DisplayResource="%SystemRoot%\system32\shell32.dll",22061

[RecUninstallItems]
Name       = %Rec_DESC%,0x00000003
Subdir     = %Multimed_GROUPOLD%

[RecUninstallItemsCommon]
Name       = %Rec_DESC%,0x00000002
Subdir     = %Multimed_GROUP%


[Vol]
OptionDesc              = %Vol_DESC%
Tip                     = %Vol_TIP%
IconIndex               = 57 ;Speaker mini-icon for dialogs
Parent                  = MultiM
CopyFiles               = VolCopyFilesSys, VolCopyFilesHelp
ProfileItems            = VolUninstallItems, VolInstallItems
Uninstall               = VolUninstall
Modes                   = 0,1,2,3
SizeApproximation=225280


[VolUninstall]
DelFiles                = VolCopyFilesSys, VolCopyFilesHelp
ProfileItems            = VolUninstallItems, VolUninstallItemsCommon


[VolInstallItems]
Name       = %Vol_DESC%
CmdLine    = 11,,sndvol32.exe
WorkingDir = 11
Subdir     = %Multimed_GROUP%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22578"
DisplayResource="%SystemRoot%\system32\shell32.dll",22066

[VolUninstallItems]
Name       = %Vol_DESC%,0x00000003
Subdir     = %Multimed_GROUPOLD%

[VolUninstallItemsCommon]
Name       = %Vol_DESC%,0x00000002
Subdir     = %Multimed_GROUP%


[MPlayCopyFilesSys]
mplay32.exe

[MPlayCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[MPlayCopyFilesHelp]


[MPlayCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[RecCopyFilesSys]
sndrec32.exe

[RecCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[VolCopyFilesSys]
sndvol32.exe

[VolCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[VolCopyFilesHelp]
sndvol32.chm
sndvol32.hlp

[VolCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"

[Strings]
KEY_OPTIONAL        = "SOFTWARE\Microsoft\Windows\CurrentVersion\Setup\OptionalComponents"
Multimed_GROUPOLD   = "Accessories\Multimedia"
Multimed_GROUP      = "Accessories\Entertainment"
MultiM_DESC         = "Multimedia"
MultiM_TIP          = "Includes programs for playing sound, animation, or video on computers with CD-ROM drives or sound cards."
CDPlayer_DESC       = "CD Player"
CDPlayer_TIP        = "Utility to play music CDs with your computer"
CDPlayer_Infotip    = "Plays audio compact discs (CDs)."
CDPlayer_CDA        = "CD Audio Track"
AUDIOCD             = "AudioCD"
Play_Command        = "&Play"
MPlay_DESC          = "Media Player"
MPlay_TIP           = "Utility to play audio and video clips"
MPlay_Infotip       = "Use Media Player to play, edit, link, and embed a variety of multimedia files including video, audio, and animation files."
Rec_DESC            = "Sound Recorder"
Rec_TIP             = "Utility to record and play sounds with a sound card"
Rec_Infotip         = "Records sounds if a microphone and sound card are installed."
Vol_DESC            = "Volume Control"
Vol_TIP             = "Utility to adjust the volume from a sound card"
Vol_Infotip         = "Controls the volume level of recorded and play-back sounds."
