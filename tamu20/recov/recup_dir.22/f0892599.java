
; WORDPAD.INF
;
; This is the Setup information file to install WordPad
; as an Optional Component.
;
; Copyright (c) Microsoft Corporation.  All rights reserved.
;

[version]
signature="$CHICAGO$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf

[DestinationDirs]
WordPadCopyFiles        = 16422,%ACCESSOR% ; DIRID_PROGRAM_FILES\Program Files\Windows NT\Accessories
WordPadCopyFiles_HELP   = 18    ; LDID_HELP
WordPadFilesOld         = 16422,%ACCESSOR% ; DIRID_PROGRAM_FILES\Program Files\Windows NT\Accessories
WriteCopyFiles          = 11    ;LDID_SYSTEM
WriteFilesOld           = 11    ;LDID_SYSTEM

[Optional Components]
MSWordPad

[MSWordPad]
OptionDesc  = %MSWORDPADOPT_DESC%
Tip         = %MSWORDPADOPT_TIP%
IconIndex   = 39  ;Windows Logo mini-icon for dialogs
Parent      = AccessTop
CopyFiles   = WordPadCopyFiles, WordPadCopyFiles_HELP, WriteCopyFiles
DelFiles    = WordPadFilesOld, WriteFilesOld
AddReg      = WordPadReg
ProfileItems = WordpadInstallItems, WordpadUninstallItems
Uninstall   = MSWordPadUninstall
Modes       = 0,1,2,3
SizeApproximation=2289664


[MSWordPadUninstall]
DelFiles       = WordPadCopyFiles, WordPadCopyFiles_HELP, WordPadFilesOld, WriteCopyFiles
UpdateInis     = WordPadInis.remove
ProfileItems   = WordpadUninstallItems,WordpadUninstallCommonItems
DelReg         = WordPadReg

[DefaultInstall]
AddReg      = WordPad.install.reg, WordPadReg

[WordPadCopyFiles]
wordpad.exe
mswrd6.wpc
mswrd8.wpc
write.wpc

[WordPadCopyFiles.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[WordPadCopyFiles_HELP]
wordpad.chm
wordpad.hlp

[WordPadCopyFiles_HELP.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[WordPadFilesOld]
mfc40u.dll
msvcrt40.dll

[WriteCopyFiles]
;copy stub program that launches wordpad.exe (for compat. reasons):
write.exe

[WriteCopyFiles.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[WriteFilesOld]
write.cnt
write.hlp

[WordpadInstallItems]
Name       = %WORDPAD_LINK%
CmdLine    = 16422, %ACCESSOR%, wordpad.exe
SubDir     = %APPS_DESC%
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22581"
DisplayResource="%SystemRoot%\system32\shell32.dll",22069

[WordpadUninstallItems]
Name       = %WORDPAD_LINK%,0x00000003
Subdir     = %APPS_DESC%

[WordpadUninstallCommonItems]
Name       = %WORDPAD_LINK%,0x00000002
Subdir     = %APPS_DESC%

[WordPadReg]
; Next line is in shell.inx to avoid overwriting key when making null file entry
;HKCR,.doc,,2,Wordpad.Document.1
HKCR,.doc\OpenWithList\WordPad.exe,,,
HKCR,Wordpad.Document.1,,,%WORDPAD_DOC%
HKCR,Wordpad.Document.1,FriendlyTypeName,0x00020000,"@""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",-209"
HKCR,Wordpad.Document.1\Insertable,,,""
HKCR,Wordpad.Document.1\Protocol,,,
HKCR,Wordpad.Document.1\Protocol\StdFileEditing,,,
HKCR,Wordpad.Document.1\Protocol\StdFileEditing\Server,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"""
HKCR,Wordpad.Document.1\Protocol\StdFileEditing\Verb,,,
HKCR,Wordpad.Document.1\Protocol\StdFileEditing\Verb\0,,,"%EDIT%"
HKCR,Wordpad.Document.1\DefaultIcon,,0x0020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",1"
HKCR,Wordpad.Document.1\shell\open\command,,0x00020002,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,Wordpad.Document.1\shell\print\command,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" /p ""%%1"""
HKCR,Wordpad.Document.1\shell\printto\command,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,Wordpad.Document.1\CLSID,,,{73FDDC80-AEA9-101A-98A7-00AA00374959}

;
; Add "rtffile" section
;
HKCR,.rtf\OpenWithList\WordPad.exe,,,
HKCR,rtffile,,,%RTF_DOC%
HKCR,rtffile,FriendlyTypeName,0x00020000,"@""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",-190"
HKCR,rtffile\DefaultIcon,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",1"
; Note: Must use fully qualified path or Goldmine 4.0 pukes
HKCR,rtffile\shell\open\command,,,"""%24%\%PROGRAMF%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,rtffile\shell\print\command,,,"""%24%\%PROGRAMF%\%ACCESSOR%\WORDPAD.EXE"" /p ""%%1"""
HKCR,rtffile\shell\printto\command,,,"""%24%\%PROGRAMF%\%ACCESSOR%\WORDPAD.EXE"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,rtffile\CLSID,,,{73FDDC80-AEA9-101A-98A7-00AA00374959}

HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\DefaultIcon,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",0"

;
; update 3.x write stuff to use wordpad as server
;
HKCR,.wri\OpenWithList\WordPad.exe,,,
HKCR,.wri,,,wrifile
HKCR,wrifile,FriendlyTypeName,0x00020000,"@""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",-208"
HKCR,wrifile,,,%WRITE_DOC%
HKCR,wrifile\DefaultIcon,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",2"
HKCR,wrifile\CLSID,,,{73FDDC80-AEA9-101A-98A7-00AA00374959}
; Note: Must use fully qualified path or Goldmine 4.0 pukes
HKCR,wrifile\shell\open\command,,,"""%24%\%PROGRAMF%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,wrifile\shell\print\command,,,"""%24%\%PROGRAMF%\%ACCESSOR%\WORDPAD.EXE"" /p ""%%1"""
HKCR,wrifile\shell\printto\command,,,"""%24%\%PROGRAMF%\%ACCESSOR%\WORDPAD.EXE"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""

HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959},,,%WORDPAD_DOC%




HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\DefaultIcon,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",1"
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\LocalServer32,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"""
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\DefaultIcon,,0x00024000,"""%ProgramFiles(x86)%\%ACCESSOR%\WORDPAD.EXE"",1"
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\LocalServer32,,0x00024000,"""%ProgramFiles(x86)%\%ACCESSOR%\WORDPAD.EXE"""

HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\ProgId,,,WordPad.Document.1
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\MiscStatus,,,0
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\AuxUserType\3,,,"%WORDPAD_LINK%"
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\AuxUserType\2,,,"%WORDPAD_DOC%"
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\Insertable,,,
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\verb\1,,,"%OPEN%,0,2"
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\verb\0,,,"%EDIT%,0,2"
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\InprocHandler32,,,ole32.dll
HKCR,CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\DataFormats\PriorityCacheFormats,"Rich Text Format",,""

HKCR,Applications\wordpad.exe,FriendlyAppName,2,"@shell32.dll,-22069"
HKCR,Applications\wordpad.exe\shell\open\command,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,"*\OpenWithList\WordPad.exe",,,
HKCR,"SystemFileAssociations\text\OpenWithList\WordPad.exe",,,

HKCR,SystemFileAssociations\.doc\shell\open\command,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,SystemFileAssociations\.doc\DefaultIcon,,0x0020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",1"

HKCR,SystemFileAssociations\.rtf\shell\open\command,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,SystemFileAssociations\.rtf\DefaultIcon,,0x0020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",1"

HKCR,SystemFileAssociations\.wri\shell\open\command,,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"" ""%%1"""
HKCR,SystemFileAssociations\.wri\DefaultIcon,,0x0020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"",1"


; set up the per-app path
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\WORDPAD.EXE",,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"""
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\WRITE.EXE",,0x00020000,"""%ProgramFiles%\%ACCESSOR%\WORDPAD.EXE"""

































[Strings]
MSWORDPADOPT_DESC = "WordPad"
MSWORDPADOPT_TIP  = "Editor for creating short memos and documents"

APPS_DESC         = "Accessories"
WORDPAD_LINK      = "WordPad"
Wordpad_Infotip   = "Creates and edits text documents with complex formatting."
WORDPAD_DOC       = "WordPad Document"
RTF_DOC           = "Rich Text Document"
WRITE_DOC         = "Write Document"
EDIT              = "&Edit"
OPEN              = "&Open"

ACCESSOR          = "Windows NT\Accessories"
PROGRAMF	  = "Program Files"




[mswordpad]
CopyFiles=wWordPadCopyFiles,wWriteCopyFiles
DelFiles=wWordPadFilesOld,wWriteFilesOld
AddReg=wWordPadReg

[mswordpaduninstall]
DelFiles=wWordPadCopyFiles,wWordPadFilesOld,wWriteCopyFiles
DelReg=wWordPadReg

[defaultinstall]
AddReg=wWordPad.install.reg,wWordPadReg

[wWriteCopyFiles]
write.exe,wwrite.exe

[wWordPadReg]
HKCR,".doc\OpenWithList\WordPad.exe",,0x00004000,
HKCR,Wordpad.Document.1,,0x00004000,"WordPad Document"
HKCR,Wordpad.Document.1,FriendlyTypeName,0x00024000,"@""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",-209"
HKCR,"Wordpad.Document.1\Insertable",,0x00004000,
HKCR,"Wordpad.Document.1\Protocol",,0x00004000,
HKCR,"Wordpad.Document.1\Protocol\StdFileEditing",,0x00004000,
HKCR,"Wordpad.Document.1\Protocol\StdFileEditing\Server",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"""
HKCR,"Wordpad.Document.1\Protocol\StdFileEditing\Verb",,0x00004000,
HKCR,"Wordpad.Document.1\Protocol\StdFileEditing\Verb\0",,0x00004000,&Edit
HKCR,"Wordpad.Document.1\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",1"
HKCR,"Wordpad.Document.1\shell\open\command",,0x00024002,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"Wordpad.Document.1\shell\print\command",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" /p ""%%1"""
HKCR,"Wordpad.Document.1\shell\printto\command",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,"Wordpad.Document.1\CLSID",,0x00004000,{73FDDC80-AEA9-101A-98A7-00AA00374959}
HKCR,".rtf\OpenWithList\WordPad.exe",,0x00004000,
HKCR,rtffile,,0x00004000,"Rich Text Document"
HKCR,rtffile,FriendlyTypeName,0x00024000,"@""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",-190"
HKCR,"rtffile\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",1"
HKCR,"rtffile\shell\open\command",,0x00004000,"""%16426%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"rtffile\shell\print\command",,0x00004000,"""%16426%\Windows NT\Accessories\WORDPAD.EXE"" /p ""%%1"""
HKCR,"rtffile\shell\printto\command",,0x00004000,"""%16426%\Windows NT\Accessories\WORDPAD.EXE"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,"rtffile\CLSID",,0x00004000,{73FDDC80-AEA9-101A-98A7-00AA00374959}
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",0"
HKCR,".wri\OpenWithList\WordPad.exe",,0x00004000,
HKCR,.wri,,0x00004000,wrifile
HKCR,wrifile,FriendlyTypeName,0x00024000,"@""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",-208"
HKCR,wrifile,,0x00004000,"Write Document"
HKCR,"wrifile\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",2"
HKCR,"wrifile\CLSID",,0x00004000,{73FDDC80-AEA9-101A-98A7-00AA00374959}
HKCR,"wrifile\shell\open\command",,0x00004000,"""%16426%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"wrifile\shell\print\command",,0x00004000,"""%16426%\Windows NT\Accessories\WORDPAD.EXE"" /p ""%%1"""
HKCR,"wrifile\shell\printto\command",,0x00004000,"""%16426%\Windows NT\Accessories\WORDPAD.EXE"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}",,0x00004000,"WordPad Document"
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\ProgId",,0x00004000,WordPad.Document.1
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\MiscStatus",,0x00004000,0
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\AuxUserType\3",,0x00004000,WordPad
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\AuxUserType\2",,0x00004000,"WordPad Document"
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\Insertable",,0x00004000,
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\verb\1",,0x00004000,"&Open,0,2"
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\verb\0",,0x00004000,"&Edit,0,2"
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\InprocHandler32",,0x00004000,ole32.dll
HKCR,"CLSID\{73FDDC80-AEA9-101A-98A7-00AA00374959}\DataFormats\PriorityCacheFormats","Rich Text Format",0x00004000,
HKCR,"Applications\wordpad.exe",FriendlyAppName,0x00004002,"@shell32.dll,-22069"
HKCR,"Applications\wordpad.exe\shell\open\command",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"*\OpenWithList\WordPad.exe",,0x00004000,
HKCR,"SystemFileAssociations\text\OpenWithList\WordPad.exe",,0x00004000,
HKCR,"SystemFileAssociations\.doc\shell\open\command",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"SystemFileAssociations\.doc\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",1"
HKCR,"SystemFileAssociations\.rtf\shell\open\command",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"SystemFileAssociations\.rtf\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",1"
HKCR,"SystemFileAssociations\.wri\shell\open\command",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"" ""%%1"""
HKCR,"SystemFileAssociations\.wri\DefaultIcon",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"",1"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\WORDPAD.EXE",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"""
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\WRITE.EXE",,0x00024000,"""%%ProgramFiles%%\Windows NT\Accessories\WORDPAD.EXE"""

[wWordPadFilesOld]
mfc40u.dll
msvcrt40.dll

[wWordPadCopyFiles]
wordpad.exe,wwordpad.exe
mswrd6.wpc,wmswrd6.wpc
mswrd8.wpc,wmswrd8.wpc
write.wpc,wwrite.wpc

[wWriteFilesOld]
write.cnt
write.hlp

[wWordPad.install.reg]
[DestinationDirs]
wWriteCopyFiles=16425
wWordPadFilesOld=16426,Windows NT\Accessories
wWordPadCopyFiles=16426,Windows NT\Accessories
wWriteFilesOld=16425
