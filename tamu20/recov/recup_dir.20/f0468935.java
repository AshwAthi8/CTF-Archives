
;==============================================================================================
; Internet Connection Wizard install script WinNT
;==============================================================================================

;#define REG_EXPAND_SZ     0x00020000

[Version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
SetupClass=Base
LayoutFile=layout.inf

; Anything not installed by the system by default
[DestinationDirs]
Base.AppDir.CopyFile   = 16422,%LMSIE4%\%ICW_DIR%
Base.AppDir.DelFiles   = 16422,%OLD_ICWDIR%
Base.AppDir.30DelFiles = 16422,%LMSIE4%\%ICW_DIR%
Base.AppIcon.DelIcon   = 10,%ICW_DESKTOP%
Base.SysDir.CopyFiles  = 11
Base.HelpDir.CopyFiles = 18

[DefaultInstall]
CopyFiles=Base.AppDir.CopyFile,Base.SysDir.CopyFiles,Base.HelpDir.CopyFiles
AddReg=Base.ICW.AddReg
DelReg=Base.ICW.DelReg
DelFiles=Base.AppIcon.DelIcon, Base.AppDir.DelFiles, Base.AppDir.30DelFiles
RegisterDlls=Base.RegSvr
ProfileItems=ICW2.StartMenu.DelIcon, ICW3.StartMenu.DelIcon.1, ICW3.StartMenu.DelIcon.2, ICW4.StartMenu.DelIcon, ICW5.StartMenu.DelIcon

;========================
;      ProfileItems
;========================
[ICW2.StartMenu.DelIcon]
Name = %ITEMDEL_ICW2%, 0x00000002
SubDir = %PGMDEL%

[ICW3.StartMenu.DelIcon.1]
Name = %ITEMDEL_ICW3%, 0x00000002
SubDir = %PGMDEL%

[ICW3.StartMenu.DelIcon.2]
Name = %ITEMDEL_ICW4%, 0x00000002
SubDir = %PGMDEL%

[ICW4.StartMenu.DelIcon]
Name = %ITEMDEL_ICW4%, 0x00000002
SubDir = %PGMDELIE4%

[ICW5.StartMenu.DelIcon]
Name = %PGMITEM_ICW%, 0x00000002
SubDir = %PGMGRP%

;================================================
;             Base Section
;================================================
[Base.AppDir.CopyFile]
icwconn1.exe,,,0x2020
icwconn2.exe,,,0x2020
inetwiz.exe,,,0x2020
isignup.exe,,,0x2020
icwtutor.exe,,,0x2020
icwhelp.dll,,,0x2020
icwconn.dll,,,0x2020
icwutil.dll,,,0x2020
icwres.dll,,,0x2020
icwrmind.exe,,,0x2020
trialoc.dll,,,0x2020
icwdl.dll,,,0x2020
icwx25a.dun,,,0x2000
icwx25b.dun,,,0x2000
icwx25c.dun,,,0x2000
icwip.dun,,,0x2000
phone.icw,,,0x2000
phone.ver,,,0x2000
state.icw,,,0x2000
msicw.isp,,,0x2000
msn.isp,,,0x2000
support.icw,,,0x2000

[Base.AppDir.CopyFile.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"

[Base.SysDir.CopyFiles]
icfgnt5.dll,,,32
inetcfg.dll,,,32
isign32.dll,,,32
icwdial.dll,,,32
icwphbk.dll,,,32

[Base.SysDir.CopyFiles.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"

[Base.HelpDir.CopyFiles]
connect.hlp
connect.cnt
icwdial.chm

[Base.HelpDir.CopyFiles.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"

;========================
;      Base DelFile
;========================
[Base.AppIcon.DelIcon]
Connec~1.lnk

[Base.AppDir.DelFiles]
icwconn1.exe
icwconn2.exe
inetwiz.exe
isignup.exe
icwdl.dll
icwx25a.dun
icwx25b.dun
icwx25c.dun
icwip.dun
phone.icw
state.icw
msicw.isp
msn.isp

[Base.AppDir.30DelFiles]
icwconn1.exe
icwconn2.exe
inetwiz.exe
isignup.exe
icwdl.dll
icwx25a.dun
icwx25b.dun
icwx25c.dun
icwip.dun
phone.icw
state.icw
msicw.isp
msn.isp
support.icw
cns.gif
nocns.gif
progress.gif
sidebar.gif
connwiz.htm
cwizfram.htm
cwizintr.htm

;========================
;      Base AddReg
;========================
[Base.ICW.AddReg]
; App Paths
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN1.EXE",,0,"""%16422%\%LMSIE4%\%ICW_DIR%\ICWCONN1.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN1.EXE","Path",0,"%16422%\%LMSIE4%\%ICW_DIR%;"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN2.EXE",,0,"""%16422%\%LMSIE4%\%ICW_DIR%\ICWCONN2.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN2.EXE","Path",0,"%16422%\%LMSIE4%\%ICW_DIR%;"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ISIGNUP.EXE",,0,"""%16422%\%LMSIE4%\%ICW_DIR%\ISIGNUP.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ISIGNUP.EXE","Path",0,"%16422%\%LMSIE4%\%ICW_DIR%;"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\INETWIZ.EXE",,0,"""%16422%\%LMSIE4%\%ICW_DIR%\INETWIZ.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\INETWIZ.EXE","Path",0,"%16422%\%LMSIE4%\%ICW_DIR%;"


; File associations
HKCR,".ins",,,"x-internet-signup"
HKCR,".ins","Content Type",,"application/x-internet-signup"
HKCR,".isp",,,"x-internet-signup"
HKCR,".isp","Content Type",,"application/x-internet-signup"

;MIME Database
HKCR,"MIME\Database\Content Type\application/x-internet-signup","Extension",,".ins"

; MIME execution options
HKCR,x-internet-signup,,0,"%INET_COMM_SETTINGS%"
HKCR,x-internet-signup,"FriendlyTypeName",,"@%16422%\%LMSIE4%\%ICW_DIR%\icwres.dll,-20003"
HKCR,x-internet-signup,EditFlags,1,00,00,00,00
HKCR,x-internet-signup\Shell,,0,""
HKCR,x-internet-signup\Shell\Open,EditFlags,1,01,00,00,00
HKCR,x-internet-signup\Shell\Open\command,,0x00020000,""%ProgramFiles%\%LMSIE4%\%ICW_DIR%\ISIGNUP.EXE" %%1"
HKCR,x-internet-signup\DefaultIcon,,0x00020000,"%ProgramFiles%\%LMSIE4%\%ICW_DIR%\ICWCONN1.EXE,0"

;NT Client Caps
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}","(Default)",,"Internet Connection Wizard"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}","ComponentID",,"ICW"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}","Locale",,"%LOCALE_ICW%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}","Version",,"%ActiveVersion%"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\ICW",,,""

;Software Version
HKLM,"%KEY_ICW%",Version,,"%Version%"
HKLM,"%KEY_ICW%",InstallationDirectory,0x00020000,"""%ProgramFiles%\%LMSIE4%\%ICW_DIR%"""
HKLM,"%KEY_ICW%","CanInstallISPKit5",,"yes"


; Release Product Values - NT5 (SAM is different)
HKLM,"Software\Microsoft\Internet Connection Wizard","Release Product",,"NT"
HKLM,"Software\Microsoft\Internet Connection Wizard","Release Product Version",,"5.0"
HKLM,"Software\Microsoft\Internet Connection Wizard","Default Product Code",,"NT5"

;========================
;      Base DelReg
;========================
[Base.ICW.DelReg]
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}","StubPath"

;========================
;      Base RegSvr
;========================
[Base.RegSvr]
16422,%LMSIE4%\%ICW_DIR%,trialoc.dll,1

;==============================================================================================
; Important - Be sure to place any localizable strings
; below the "Localization Border" Comment
;==============================================================================================


[Strings]
KEY_ICW                 = "SOFTWARE\Microsoft\Internet Connection Wizard"
Version                 = "5.00"
ActiveVersion           = "5,00,2918,1900"
KEY_RUNONCE             = "Software\Microsoft\Windows\CurrentVersion\Runonce"
OLD_ICWDIR              = "ICW-Internet Connection Wizard"
ICW_DIR                 = "Connection Wizard"
PGMGRP                  = "Accessories\Communications"
ICW_DESKTOP             = "Profiles\All Users\Desktop"
PGMITEM_ICW             = "Internet Connection Wizard"
ITEMDEL_GETON           = "Get on the Internet"
ITEMDEL_GETON3_DESKTOP  = "Connect to the Internet"
INET_COMM_SETTINGS      = "Internet Communication Settings"
LOCALE_ICW              = "*"
LMSIE4                  = "Internet Explorer"
PGMDEL                  = "Accessories\Internet Tools"
PGMDELIE4               = "Internet Explorer"
ITEMDEL_ICW2            = "Internet Setup Wizard"
ITEMDEL_ICW3            = "Get on the Internet"
ITEMDEL_ICW4            = "Connection Wizard"
ICWTOOLTIP              = "Sets up your computer to access the Internet"




[defaultinstall]
CopyFiles=wBase.AppDir.CopyFile,wBase.SysDir.CopyFiles
DelFiles=wBase.AppIcon.DelIcon,wBase.AppDir.DelFiles,wBase.AppDir.30DelFiles
RegisterDlls=wBase.RegSvr
AddReg=wBase.ICW.AddReg
DelReg=wBase.ICW.DelReg

[wBase.AppDir.30DelFiles]
icwconn1.exe
icwconn2.exe
inetwiz.exe
isignup.exe
icwdl.dll
icwx25a.dun
icwx25b.dun
icwx25c.dun
icwip.dun
phone.icw
state.icw
msicw.isp
msn.isp
support.icw
cns.gif
nocns.gif
progress.gif
sidebar.gif
connwiz.htm
cwizfram.htm
cwizintr.htm

[wBase.RegSvr]
16426,"Internet Explorer\Connection Wizard",trialoc.dll,1

[wBase.SysDir.CopyFiles]
icfgnt5.dll,wicfgnt5.dll,,32
inetcfg.dll,winetcfg.dll,,32
isign32.dll,wisign32.dll,,32
icwdial.dll,wicwdial.dll,,32
icwphbk.dll,wicwphbk.dll,,32

[wBase.ICW.AddReg]
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN1.EXE",,0x00004000,"""%16426%\Internet Explorer\Connection Wizard\ICWCONN1.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN1.EXE",Path,0x00004000,"%16426%\Internet Explorer\Connection Wizard;"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN2.EXE",,0x00004000,"""%16426%\Internet Explorer\Connection Wizard\ICWCONN2.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ICWCONN2.EXE",Path,0x00004000,"%16426%\Internet Explorer\Connection Wizard;"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ISIGNUP.EXE",,0x00004000,"""%16426%\Internet Explorer\Connection Wizard\ISIGNUP.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\ISIGNUP.EXE",Path,0x00004000,"%16426%\Internet Explorer\Connection Wizard;"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\INETWIZ.EXE",,0x00004000,"""%16426%\Internet Explorer\Connection Wizard\INETWIZ.EXE"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\INETWIZ.EXE",Path,0x00004000,"%16426%\Internet Explorer\Connection Wizard;"
HKCR,.ins,,0x00004000,x-internet-signup
HKCR,.ins,"Content Type",0x00004000,application/x-internet-signup
HKCR,.isp,,0x00004000,x-internet-signup
HKCR,.isp,"Content Type",0x00004000,application/x-internet-signup
HKCR,"MIME\Database\Content Type\application/x-internet-signup",Extension,0x00004000,.ins
HKCR,x-internet-signup,,0x00004000,"Internet Communication Settings"
HKCR,x-internet-signup,FriendlyTypeName,0x00004000,"@%16426%\Internet Explorer\Connection Wizard\icwres.dll,-20003"
HKCR,x-internet-signup,EditFlags,0x00004001,00,00,00,00
HKCR,"x-internet-signup\Shell",,0x00004000,
HKCR,"x-internet-signup\Shell\Open",EditFlags,0x00004001,01,00,00,00
HKCR,"x-internet-signup\Shell\Open\command",,0x00024000,"%%ProgramFiles%%\Internet Explorer\Connection Wizard\ISIGNUP.EXE %%1"
HKCR,"x-internet-signup\DefaultIcon",,0x00024000,"%%ProgramFiles%%\Internet Explorer\Connection Wizard\ICWCONN1.EXE,0"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}",(Default),0x00004000,"Internet Connection Wizard"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}",ComponentID,0x00004000,ICW
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}",Version,0x00004000,"5,00,2918,1900"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\ICW",,0x00004000,
HKLM,"SOFTWARE\Microsoft\Internet Connection Wizard",Version,0x00004000,5.00
HKLM,"SOFTWARE\Microsoft\Internet Connection Wizard",InstallationDirectory,0x00024000,"""%%ProgramFiles%%\Internet Explorer\Connection Wizard"""
HKLM,"SOFTWARE\Microsoft\Internet Connection Wizard",CanInstallISPKit5,0x00004000,yes
HKLM,"Software\Microsoft\Internet Connection Wizard","Release Product",0x00004000,NT
HKLM,"Software\Microsoft\Internet Connection Wizard","Release Product Version",0x00004000,5.0
HKLM,"Software\Microsoft\Internet Connection Wizard","Default Product Code",0x00004000,NT5

[wBase.ICW.DelReg]
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5A8D6EE0-3E18-11D0-821E-444553540000}",StubPath

[wBase.AppDir.DelFiles]
icwconn1.exe
icwconn2.exe
inetwiz.exe
isignup.exe
icwdl.dll
icwx25a.dun
icwx25b.dun
icwx25c.dun
icwip.dun
phone.icw
state.icw
msicw.isp
msn.isp

[wBase.AppIcon.DelIcon]
Connec~1.lnk

[wBase.AppDir.CopyFile]
icwconn1.exe,wicwconn1.exe,,0x2020
icwconn2.exe,wicwconn2.exe,,0x2020
inetwiz.exe,winetwiz.exe,,0x2020
isignup.exe,wisignup.exe,,0x2020
icwtutor.exe,wicwtutor.exe,,0x2020
icwhelp.dll,wicwhelp.dll,,0x2020
icwconn.dll,wicwconn.dll,,0x2020
icwutil.dll,wicwutil.dll,,0x2020
icwres.dll,wicwres.dll,,0x2020
icwrmind.exe,wicwrmind.exe,,0x2020
trialoc.dll,wtrialoc.dll,,0x2020
icwdl.dll,wicwdl.dll,,0x2020
icwx25a.dun,wicwx25a.dun,,0x2000
icwx25b.dun,wicwx25b.dun,,0x2000
icwx25c.dun,wicwx25c.dun,,0x2000
icwip.dun,wicwip.dun,,0x2000
phone.icw,wphone.icw,,0x2000
phone.ver,wphone.ver,,0x2000
state.icw,wstate.icw,,0x2000
msicw.isp,wmsicw.isp,,0x2000
msn.isp,wmsn.isp,,0x2000
support.icw,wsupport.icw,,0x2000

[DestinationDirs]
wBase.AppDir.30DelFiles=16426,Internet Explorer\Connection Wizard
wBase.SysDir.CopyFiles=16425
wBase.AppDir.DelFiles=16426,ICW-Internet Connection Wizard
wBase.AppIcon.DelIcon=10,Profiles\All Users\Desktop
wBase.AppDir.CopyFile=16426,Internet Explorer\Connection Wizard
