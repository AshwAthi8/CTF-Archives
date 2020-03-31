; This is the Setup information file to install optional components
; Copyright (c) Microsoft Corporation.  All rights reserved.


[version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf


[DestinationDirs]
ChatCopyFilesSys                = 11    ;LDID_SYSTEM
ChatCopyFilesHelp               = 18    ;LDID_HELP
HypertrmCopyFilesProg   = 16422,%Hypertrm_DIR% ; DIRID_PROGRAM_FILES
HypertrmCopyFilesSys    = 11
HypertrmCopyFilesHelp   = 18    ;LDID_HELP
HypertrmCopyFilesConfig = 53,%HypertrmProfile_DIR%
HypertrmDelFilesProg     = 16422,%Hypertrm_DIR% ; DIRID_PROGRAM_FILES


[Optional Components]
CommApps        ;Top level option
Chat
Hypertrm

[CommApps]
OptionDesc              = %CommApps_DESC%
Tip                     = %CommApps_TIP%
IconIndex               = 7 ;Telephone mini-icon for dialogs
Parent                  = AccessUtil

[Chat]
OptionDesc              = %Chat_DESC%
Tip                     = %Chat_TIP%
IconIndex               = 16 ;Net Client mini-icon for dialogs
Parent                  = CommApps
CopyFiles               = ChatCopyFilesSys, ChatCopyFilesHelp
ProfileItems            = ChatUninstallItems, ChatUninstallCommonItems
Uninstall               = ChatUninstall
Modes                   = 0,1,2,3
SizeApproximation=274432

[ChatUninstall]
DelFiles                = ChatCopyFilesSys, ChatCopyFilesHelp
ProfileItems            = ChatUninstallItems, ChatUninstallCommonItems


[ChatInstallItems]
Name       = %Chat_DESC%
CmdLine    = 11,, winchat.exe
SubDir     = %Access_GROUP%
WorkingDir = 11
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22583"
DisplayResource="%SystemRoot%\system32\shell32.dll",22071

[ChatUninstallItems]
Name       = %Chat_DESC%,0x00000003
Subdir     = %Access_GROUPOLD%

[ChatUninstallCommonItems]
Name       = %Chat_DESC%,0x00000002
Subdir     = %Access_GROUP%

[Hypertrm]
OptionDesc              = %Hypertrm_DESC%
Tip                     = %Hypertrm_TIP%
IconIndex               = 35 ;Phone mini-icon for dialogs
Parent                  = CommApps
CopyFiles               = HypertrmCopyFilesProg, HypertrmCopyFilesSys, HypertrmCopyFilesHelp
DelFiles                = HypertrmDelFilesProg,HypertrmCopyFilesConfig
AddReg                  = HypertrmAddReg
ProfileItems            = HypertrmUninstallItems, HypertrmUninstallItemsGroup, HypertrmInstallItems, CommunicationInstallItems
Uninstall               = HypertrmUninstall
Modes                   = 0,1,2,3
SizeApproximation=655360


[HypertrmUninstall]
DelFiles                = HypertrmCopyFilesProg, HypertrmCopyFilesSys, HypertrmCopyFilesHelp, HypertrmCopyFilesConfig
DelReg                  = HypertrmDelReg
ProfileItems            = HypertrmUninstallItems, HypertrmUninstallCommonItems


[HypertrmInstallItems]
Name       = %Hypertrm_DESC%
CmdLine    = 16422, %Hypertrm_DIR%, hypertrm.exe
SubDir     = %Access_GROUP%
WorkingDir = ,%Hypertrm_DIR%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22543"
DisplayResource="%SystemRoot%\system32\shell32.dll",22031

[HypertrmUninstallItems]
Name       = %Hypertrm_DESC%,0x00000003
Subdir     = %Hypertrm_GROUPOLD%

[HypertrmUninstallItemsGroup]
Name       = %Hypertrm_GROUPOLD%,0x00000007

[HypertrmUninstallCommonItems]
Name       = %Hypertrm_DESC%,0x00000002
Subdir     = %Access_GROUP%

[ChatCopyFilesSys]
winchat.exe

[ChatCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[ChatCopyFilesHelp]


[ChatCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[HypertrmCopyFilesProg]
hypertrm.exe
htrn_jis.dll

[HypertrmCopyFilesProg.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[HypertrmCopyFilesSys]
hticons.dll
hypertrm.dll

[HypertrmCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[HypertrmCopyFilesHelp]


[HypertrmCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[HypertrmDelFilesProg]
hypertrm.dll


[HypertrmAddReg]
HKLM,"%KEY_APP_PATH%\hypertrm.exe",,,"""%16422%\%Hypertrm_DIR%\hypertrm.exe"""
HKCR,.ht,,,htfile
HKCR,htfile,,,"%HypTrm_File%"
HKCR,htfile\DefaultIcon,,,%%1
HKCR,htfile\shell\open\command,,,"""%16422%\%Hypertrm_DIR%\HYPERTRM.EXE"" %%1"
HKCR,htfile\shellex\PropertySheetHandlers,,,TermPage
HKCR,htfile\shellex\PropertySheetHandlers\TermPage,,,{1B53F360-9A1B-1069-930C-00AA0030EBC8}
HKCR,htfile\shellex\IconHandler,,,{88895560-9AA2-1069-930E-00AA0030EBC8}
HKCR,CLSID\{1B53F360-9A1B-1069-930C-00AA0030EBC8},,,"HyperTerminal Connection Page Ext"
HKCR,CLSID\{1B53F360-9A1B-1069-930C-00AA0030EBC8}\InProcServer32,,,"%11%\hypertrm.dll"
HKCR,CLSID\{1B53F360-9A1B-1069-930C-00AA0030EBC8}\InProcServer32,ThreadingModel,,"Apartment"
HKCR,CLSID\{88895560-9AA2-1069-930E-00AA0030EBC8},,,"HyperTerminal Icon Ext"
HKCR,CLSID\{88895560-9AA2-1069-930E-00AA0030EBC8}\InProcServer32,,,"%11%\hticons.dll"
HKCR,CLSID\{88895560-9AA2-1069-930E-00AA0030EBC8}\InProcServer32,ThreadingModel,,"Apartment"


[HypertrmDelReg]
HKLM,"%KEY_APP_PATH%\hypertrm.exe"


[CommunicationInstallItems]
Name       = %Access_GROUP%,0x00000004
DisplayResource="%SystemRoot%\system32\shell32.dll",21768

[HypertrmCopyFilesConfig]
AT&T Mail.ht,           att.ht,,    16
CompuServe.ht,          cis.ht,,    16
HyperTerminal BBS.ht,   hilgbbs.ht,,16
MCI Mail.ht,            mci.ht,,    16
Microsoft BBS.ht,       msbbs.ht,,  16
[Strings]
KEY_OPTIONAL        = "SOFTWARE\Microsoft\Windows\CurrentVersion\Setup\OptionalComponents"
KEY_APP_PATH        = "SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths"
Access_GROUPOLD     = "Accessories"
Access_GROUP        = "Accessories\Communications"
CommApps_DESC       = "Communications"
CommApps_TIP        = "Includes accessories to help you connect to other computers and online services."
Chat_DESC           = "Chat"
Chat_TIP            = "Allows you to converse with other Windows users over a network."
Chat_Infotip        = "Use Chat to communicate interactively with someone on another computer."
Hypertrm_DESC       = "HyperTerminal"
Hypertrm_TIP        = "Enables you to connect to other computers and online services (requires a modem)."
Hypertrm_Infotip    = "Connects to other computers, Internet telnet sites, bulletin board systems, online services, and host computers using either a modem or a null-modem cable."
Hypertrm_DIR        = "Windows NT"
Hypertrm_GROUPOLD   = "Accessories\Hyperterminal"
HypTrm_File         = "HyperTerminal File"




[chat]
CopyFiles=wChatCopyFilesSys

[chatuninstall]
DelFiles=wChatCopyFilesSys

[wChatCopyFilesSys]
winchat.exe,wwinchat.exe

[DestinationDirs]
wChatCopyFilesSys=16425
