
[Version]
SetupClass=Base
signature="$Windows NT$"
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830
[RenameFiles]
[Installed.Reg]
[DestinationDirs]
file.copy.sys       = 11
file.copy.sys.roll  = 11
file.del.sys        = 11
file.copy.help      = 18
file.del.old.help   = 18
file.del.help       = 18
file.del.inf        = 17
file.del.win.links  = 25
file.del.sys.roll   = 11
file.copy.exe       = 16422,%STR_MAILNEWS_DIR%
file.del.exe        = 16422,%STR_MAILNEWS_DIR%
file.copy.permanent = 16422,%STR_MAILNEWS_DIR%
file.copy.stationery= 16427,%STR_SHARED_DIR%\%STR_STATIONERY_DIR%
file.copy.common.perm = 16427,%STR_SYSTEM_DIR%
[User.Stub.50]
HKLM,"Software\Microsoft\Active Setup\Installed Components\%GUID_OE%",,,"%MS_OUTLOOK_5%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%GUID_OE%","IsInstalled",0x10001,01,00,00,00
HKLM,"Software\Microsoft\Active Setup\Installed Components\%GUID_OE%","Locale",,"%STR_LANG%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%GUID_OE%","ComponentID",,"MailNews"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%GUID_OE%","CloneUser",0x10001,01,00,00,00
HKLM,"Software\Microsoft\Active Setup\Installed Components\%GUID_OE%","StubPath",0x00020000,"""%ProgramFiles%\%STR_MAILNEWS_DIR%\setup50.exe"" %APP_OE% %CALLER% /user /install"
[DefaultInstall]
DelFiles=file.del.old.help, file.del.exe, file.del.inf, file.del.sys, file.del.win.links, file.del.sys.roll
CopyFiles=file.copy.permanent, file.copy.help,file.copy.permanent,file.copy.exe,file.copy.stationery,file.copy.sys,file.copy.sys.roll,file.copy.common.perm
AddReg=Common.Add.Reg,Common.Add.Reg.Loc,No.Uninstall.Add.Reg,RunOnce.Reg,User.Stub.50,Machine.Add.Reg,Machine.Add.Reg.Loc,RenameFiles,Installed.Reg
DelReg=Thor.Del.Reg,oe.del.oldclients
UpdateInis=mapi.ini
[User.Install]
DelReg=User.Del.Reg
AddReg=User.No.Uninstall.Add.Reg
ProfileItems=SM.Del.1,SM.Del.1.All,SM.Del.2,SM.Del.2.All,SM.Del.3,SM.Del.3.All,SM.Del.4,SM.Del.4.All,SM.Del.5,SM.Del.5.All,SM.Del.6,SM.Del.6.All,SM.Del.7,SM.Del.7.All,SM.Del.8,SM.Del.8.All,SM.Del.9,SM.Del.9.All,SM.Del.10,SM.Del.10.All,SM.Del.11,SM.Del.11.All,SM.Del.12,SM.Del.12.All,SM.Del.13,SM.Del.13.All,SM.Del.14,SM.Del.14.All,SM.Del.15,SM.Del.15.All,SM.Del.16,SM.Del.16.All
[file.del.inf]
msimn.inf
msimn.pnf
[file.del.exe]
_isetup.exe
msimnui.dll
msimn.txt
mnlicens.txt
msimnimp.dll
junkmail.lko
oejunk.dll
[New.User.Reg.Install]
AddReg=User.No.Uninstall.Add.Reg
[User.Del.Reg]
HKCU,"Software\Microsoft\Outlook Express\Mail\Composition"
HKCU,"Software\Microsoft\Outlook Express\News\Composition"
HKCU,"Software\Microsoft\MailIcon"
[mapi.ini]
win.ini,Mail,,"MAPI=1"
[file.del.sys]
thor.dll
imnacct.dll
msoemapi.dll
[file.del.win.links]
INTERN~1.{89
INTERN~2.{89
[file.del.old.help]
msimn.cnt
msimn.hlp
msimn.chm
msimn.gid
[file.copy.help]
msoe.hlp
msoe.chm
[file.copy.help.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"
[file.del.help]
msoe.gid
[file.del.sys.roll]
msoert.dll
[file.copy.permanent]
setup50.exe,,,5
oemig50.exe,,,4
oemiglib.dll,,,4
[file.copy.permanent.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"
[file.copy.sys]
[file.copy.sys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"
[file.copy.sys.roll]
inetcomm.dll,,,5
inetres.dll,,,5
[file.copy.sys.roll.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"
[file.copy.exe]
msoeres.dll,,,5
msoe.dll,,,5
oeimport.dll,,,4
msoe.txt
msimn.exe,,,5
[file.copy.exe.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"
[file.copy.common.perm]
directdb.dll,,,5
[file.copy.common.perm.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"
[file.copy.stationery]
"%STR_ALEABANR_GIF%",aleabanr.gif
"%STR_AMAIZRUL_GIF%",amaizrul.gif
"%STR_ANABNR2_GIF%",anabnr2.gif
"%STR_ASWRULE_GIF%",aswrule.gif
"%STR_BLANK_HTM%",blank.htm
"%STR_BLANKBKG_GIF%",blankbkg.gif
"%STR_BTZHSEPA_GIF%",btzhsepa.gif
"%STR_CITBANNA_GIF%",citbanna.gif
"%STR_CITRUSBKG_GIF%",citrbkg.gif
"%STR_CITRUSPUN_HTM%",citrpun.htm
"%STR_CLEARDAY_HTM%",clearday.htm
"%STR_CLRDAYBG_JPG%",clrdaybg.jpg
"%STR_FIERULD_GIF%",fieruld.gif
"%STR_FIESTA_HTM%",fiesta.htm
"%STR_FIESTABG_JPG%",fiestabg.jpg
"%STR_GLACIER_HTM%",glacier.htm
"%STR_GLACRBKG_JPG%",glacrbkg.jpg
"%STR_IVY_GIF%",ivy.gif
"%STR_IVY_HTM%",ivy.htm
"%STR_LEAVES_HTM%",leaves.htm
"%STR_LEAVESBG_JPG%",leavesbg.jpg
"%STR_MAIZE_HTM%",maize.htm
"%STR_MAIZEBKG_JPG%",maizebkg.jpg
"%STR_NATURE_HTM%",nature.htm
"%STR_NATUREBG_JPG%",naturebg.jpg
"%STR_NETBLITZ_HTM%",netblitz.htm
"%STR_NETBLZBG_GIF%",netblzbg.gif
"%STR_PIECHTBG_JPG%",piechtbg.jpg
"%STR_PIECHTS_HTM%",piechts.htm
"%STR_SUNBANNA_GIF%",sunbanna.gif
"%STR_SUNFBKG_JPG%",sunfbkg.jpg
"%STR_SUNFLOWR_HTM%",sunflowr.htm
"%STR_SWEETS_HTM%",sweets.htm
"%STR_SWEETSBG_GIF%",sweetsbg.gif
"%STR_TECH_GIF%",tech.gif
"%STR_TECH_HTM%",tech.htm
[file.copy.stationery.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"
[oe.del.oldclients]
HKLM,"%MAILCLIENT_KEY%\%ATHENA_KEY%"
HKLM,"%NEWSCLIENT_KEY%\%ATHENA_KEY%"
HKLM,"%MAILCLIENT_KEY%\%OUTLOOK_KEY%"
HKLM,"%NEWSCLIENT_KEY%\%OUTLOOK_KEY%"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\InternetMailNews"
[Thor.Del.Reg]
HKCR,"CLSID\%SETUP_MSGLIST_GUID%\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}"
HKCR,"CLSID\%SETUP_MIMEEDIT_GUID%\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}"
HKLM,"%DEFAULT_OE_KEY%","Revocation Checking"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",RequiresIESysFile
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",DisplayName
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",UninstallString
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",QuietUninstallString
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","hotsync.exe"
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","pilotcfg.exe"
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","ilpilot.exe"
HKLM,"Software\Microsoft\Outlook Express","Beta"
HKCR,CLSID\{233A9690-667E-11d1-9DFB-006097D50408}
HKCR,CLSID\{89292101-4755-11cf-9DC2-00AA006C2B84}
HKCR,CLSID\{89292102-4755-11cf-9DC2-00AA006C2B84}
HKCR,CLSID\{89292103-4755-11cf-9DC2-00AA006C2B84}
HKCR,CLSID\{8929210A-4755-11cf-9DC2-00AA006C2B84}
HKCR,CLSID\{8F0C5675-AEEF-11d0-84F0-00C04FD43F8F}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{89292101-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{89292102-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{89292103-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{8929210A-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Internet\NameSpace\{89292102-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Internet\NameSpace\{89292103-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\mycomputer\NameSpace\{89292102-4755-11cf-9DC2-00AA006C2B84}
HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\mycomputer\NameSpace\{89292103-4755-11cf-9DC2-00AA006C2B84}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{89292102-4755-11cf-9DC2-00AA006C2B84}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{89292103-4755-11cf-9DC2-00AA006C2B84}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{8929210A-4755-11cf-9DC2-00AA006C2B84}
HKLM,"%TIPS_KEY%"
HKLM,"%LINKS_KEY%"
[Common.Add.Reg]
HKLM,"SOFTWARE\Microsoft\Outlook Express","MediaVer",,"%VERSION_OE%"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress"
HKLM,"SOFTWARE\Microsoft\Outlook Express","Media",,"NT"
HKLM,"Software\Microsoft\Outlook Express","InstallRoot",0x00020000,"%ProgramFiles%\%STR_MAILNEWS_DIR%"
HKLM,"Software\Microsoft\Outlook Express\Inetcomm","DllPath",0x00020000,"%SystemRoot%\System32\inetcomm.dll"
[No.Uninstall.Add.Reg]
HKLM, "Software\Microsoft\Windows Messaging Subsystem","MAPI",,"1"
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","inetsw95.exe",2,""
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","choosusr.dll",2,""
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","msab32.dll",2,""
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","nwab32.dll",2,""
HKLM, "Software\Microsoft\Windows Messaging Subsystem\MSMapiApps","outstore.dll",2,"Microsoft Outlook"
HKLM,"Software\Microsoft\Shared Tools","SharedFilesDir",2,"%16427%\%STR_SHARED_DIR%\"
HKLM,"Software\Microsoft\Shared Tools\Stationery","Stationery Folder",0x00020002,"%ProgramFiles%\%STR_COMMON_DIR%\%STR_SHARED_DIR%\%STR_STATIONERY_DIR%"
HKLM,"Software\Microsoft\Shared Tools\Stationery","Backgrounds Folder",0x00020002,"%ProgramFiles%\%STR_COMMON_DIR%\%STR_SHARED_DIR%\%STR_STATIONERY_DIR%"
HKLM,"Software\Microsoft\Windows\CurrentVersion","ProgramFilesDir",0x00020002,"%ProgramFiles%"
HKLM,"Software\Microsoft\Windows\CurrentVersion","CommonFilesDir",0x00020002,"%ProgramFiles%\%STR_COMMON_DIR%"
[User.No.Uninstall.Add.Reg]
HKCU,AppEvents\EventLabels\MailBeep,,2,"%STR_NEW_MAIL_NOTIFY%"
HKCU,AppEvents\Schemes\Apps\.Default\MailBeep\.current,,2,"chimes.wav"
[Machine.Add.Reg]
HKLM,"%FORCEFUL_OE_KEY%","VerStamp",0x10001,03,00,00,00
HKLM,"%FORCEFUL_OE_KEY%\Mail","Welcome Message", 1,01,00,00,00
HKLM,"%FORCEFUL_OE_KEY%\Mail","Accounts Checked",1,00,00,00,00
HKLM,"%FORCEFUL_OE_KEY%\News","Accounts Checked",1,00,00,00,00
HKLM,"%FORCEFUL_OE_KEY%","SpellDontIgnoreDBCS",0x10001,01,00,00,00
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File0",0,"%STR_CLEARDAY_HTM%"
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File1",0,"%STR_NATURE_HTM%"
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File2",0,"%STR_MAIZE_HTM%"
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File3",0,"%STR_SUNFLOWR_HTM%"
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File4",0,"%STR_CITRUSPUN_HTM%"
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File5",0,"%STR_BLANK_HTM%"
HKLM,"%DEFAULT_OE_KEY%\Recent Stationery List","File6",0,"%STR_LEAVES_HTM%"
[RunOnce.Reg]
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","RunOnceEx",2,"rundll32.exe %11%\iernonce.dll,RunOnceExProcess"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup","OE5_2",0,"%11%\inetcomm.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup","OE5_1",0,"%16427%\%STR_SYSTEM_DIR%\directdb.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup","OE5_3",0,"%16422%\%STR_MAILNEWS_DIR%\oeimport.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup","OE5_4",0,"%16422%\%STR_MAILNEWS_DIR%\oemiglib.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup","OE5_5",0,"%16422%\%STR_MAILNEWS_DIR%\msoe.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup","OEWABOS_2",0,"""%16422%\%STR_MAILNEWS_DIR%\setup50.exe"" %APP_OE% %CALLER% /INSTALL"
[SM.Del.1]
Name = %STR_MAIL_OLD%, 0x00000003
SubDir = %STR_INET_DESC_OLD_GRP%
[SM.Del.1.All]
Name = %STR_MAIL_OLD%, 0x00000002
SubDir = %STR_INET_DESC_OLD_GRP%
[SM.Del.2]
Name = %STR_NEWS_OLD%, 0x00000003
SubDir = %STR_INET_DESC_OLD_GRP%
[SM.Del.2.All]
Name = %STR_NEWS_OLD%, 0x00000002
SubDir = %STR_INET_DESC_OLD_GRP%
[SM.Del.3]
Name = %STR_MN_README%, 0x00000003
SubDir = %STR_INET_DESC_OLD_GRP%
[SM.Del.3.All]
Name = %STR_MN_README%, 0x00000002
SubDir = %STR_INET_DESC_OLD_GRP%
[SM.Del.4]
Name = %STR_MESSAGES_V1%, 0x00000003
[SM.Del.4.All]
Name = %STR_MESSAGES_V1%, 0x00000002
[SM.Del.5]
Name = %STR_NEWS_V1%, 0x00000003
[SM.Del.5.All]
Name = %STR_NEWS_V1%, 0x00000002
[SM.Del.6]
Name = %STR_MESSAGES%, 0x00000003
[SM.Del.6.All]
Name = %STR_MESSAGES%, 0x00000002
[SM.Del.7]
Name = %STR_NEWS%, 0x00000003
[SM.Del.7.All]
Name = %STR_NEWS%, 0x00000002
[SM.Del.8]
Name = %MS_OUTLOOK%, 0x00000003
[SM.Del.8.All]
Name = %MS_OUTLOOK%, 0x00000002
[SM.Del.9]
Name = %STR_MAIL_OLD%, 0x00000003
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.9.All]
Name = %STR_MAIL_OLD%, 0x00000002
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.10]
Name = %STR_NEWS_OLD%, 0x00000003
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.10.All]
Name = %STR_NEWS_OLD%, 0x00000002
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.11]
Name = %STR_MESSAGES_V1%, 0x00000003
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.11.All]
Name = %STR_MESSAGES_V1%, 0x00000002
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.12]
Name = %STR_NEWS_V1%, 0x00000003
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.12.All]
Name = %STR_NEWS_V1%, 0x00000002
SubDir = ..\..\%STR_DESKTOP_DIR%
[SM.Del.13]
Name = %STR_MESSAGES%, 0x00000003
SubDir = %STR_INTERNET_SUITE_GRP%
[SM.Del.13.All]
Name = %STR_MESSAGES%, 0x00000002
SubDir = %STR_INTERNET_SUITE_GRP%
[SM.Del.14]
Name = %STR_NEWS%, 0x00000003
SubDir = %STR_INTERNET_SUITE_GRP%
[SM.Del.14.All]
Name = %STR_NEWS%, 0x00000002
SubDir = %STR_INTERNET_SUITE_GRP%
[SM.Del.15]
Name = %OUTLOOK%, 0x00000003
SubDir = %INTERNET_GRP%
[SM.Del.15.All]
Name = %OUTLOOK%, 0x00000002
SubDir = %INTERNET_GRP%
[SM.Del.16]
Name = %MS_OUTLOOK%, 0x00000003
SubDir = %INTERNET_GRP%
[SM.Del.16.All]
Name = %MS_OUTLOOK%, 0x00000002
SubDir = %INTERNET_GRP%


[Machine.Add.Reg.Loc]










































[Common.Add.Reg.Loc]

























[Strings]
STR_COMMON_DIR          = "Common Files"
STR_DESKTOP_DIR         = "Desktop"
STR_MAILNEWS_DIR        = "Outlook Express"
STR_PROGRAMF_DIR        = "Program Files"
STR_SERVICES_DIR        = "Services"
STR_SHARED_DIR          = "Microsoft Shared"
STR_STATIONERY_DIR      = "Stationery"
STR_STATIONERY_SHORT_DIR= "Statio~1"
STR_SYSTEM_DIR          = "System"
STR_INET_DESC_OLD_GRP   = "Internet"
STR_INTERNET_SUITE_GRP  = "Internet Explorer Suite"
STR_LANG                = "EN"
STR_MAIL_OLD            = "Mail"
STR_MAILMESSAGE_V1      = "Internet Mail Message"
STR_MESSAGES            = "Outlook Express Mail"
STR_MESSAGES_V1         = "Internet Mail"
STR_MN_README           = "Read Me (Mail and News)"
STR_NEWS                = "Outlook Express News"
STR_NEWS_OLD            = "News"
STR_NEWS_V1             = "Internet News"
STR_NEWSMESSAGE_V1      = "Internet News Message"
STR_NEW_MAIL_NOTIFY     = "New Mail Notification"
STR_OE_TIP              = "Easy to use Internet e-mail and newsgroup reader."
STR_OE_SM_TIP           = "Sends and receives e-mail and newsgroup messages."
STR_ALEABANR_GIF        = "aleabanr.gif"
STR_AMAIZRUL_GIF        = "amaizrul.gif"
STR_ANABNR2_GIF         = "anabnr2.gif"
STR_ASWRULE_GIF         = "aswrule.gif"
STR_BLANK_HTM           = "Blank.htm"
STR_BLANKBKG_GIF        = "Blank Bkgrd.gif"
STR_BTZHSEPA_GIF        = "Btzhsepa.gif"
STR_CITBANNA_GIF        = "citbannA.gif"
STR_CITRUSBKG_GIF       = "Citrus Punch Bkgrd.gif"
STR_CITRUSPUN_HTM       = "Citrus Punch.htm"
STR_CLEARDAY_HTM        = "Clear Day.htm"
STR_CLRDAYBG_JPG        = "Clear Day Bkgrd.jpg"
STR_FIERULD_GIF         = "fieruled.gif"
STR_FIESTA_HTM          = "Fiesta.htm"
STR_FIESTABG_JPG        = "Fiesta Bkgrd.jpg"
STR_GLACIER_HTM         = "Glacier.htm"
STR_GLACRBKG_JPG        = "Glacier Bkgrd.jpg"
STR_IVY_GIF             = "Ivy.gif"
STR_IVY_HTM             = "Ivy.htm"
STR_LEAVES_HTM          = "Leaves.htm"
STR_LEAVESBG_JPG        = "Leaves Bkgrd.jpg"
STR_MAIZE_HTM           = "Maize.htm"
STR_MAIZEBKG_JPG        = "Maize Bkgrd.jpg"
STR_NATURE_HTM          = "Nature.htm"
STR_NATUREBG_JPG        = "Nature Bkgrd.jpg"
STR_NETBLITZ_HTM        = "Network Blitz.htm"
STR_NETBLZBG_GIF        = "Network Blitz Bkgrd.gif"
STR_PIECHTBG_JPG        = "Pie Charts Bkgrd.jpg"
STR_PIECHTS_HTM         = "Pie Charts.htm"
STR_SUNBANNA_GIF        = "sunbannA.gif"
STR_SUNFBKG_JPG         = "Sunflower Bkgrd.jpg"
STR_SUNFLOWR_HTM        = "Sunflower.htm"
STR_SWEETS_HTM          = "Sweets.htm"
STR_SWEETSBG_GIF        = "Sweets Bkgrd.gif"
STR_TECH_GIF            = "tech.gif"
STR_TECH_HTM            = "Technical.htm"
APP_OE                  = "/APP:OE"
ATHENA_KEY              = "Internet Mail and News"
BLANK                   = ""
CALLER                  = "/CALLER:WINNT"
COMPONENT_OE            = "OutlookExpress"
DEFAULT_OE_KEY          = "Software\Microsoft\Outlook Express\5.0\Default Settings"
FORCEFUL_OE_KEY         = "Software\Microsoft\Outlook Express\5.0\Required Settings"
GUID_OE                 = "{44BBA840-CC51-11CF-AAFA-00AA00B6015C}"
SETUP_MSGLIST_GUID      = "{233A9692-667E-11d1-9DFB-006097D50408}"
SETUP_MIMEEDIT_GUID     = "{1C82EAD9-508E-11D1-8DCF-00C04FB951F9}"
INFFILE_OE              = "msoe50.inf"
INTERNET_GRP            = "Internet Explorer"
LINKS_KEY               = "Software\Microsoft\Outlook Express\Tip Links"
MAILCLIENT_KEY          = "Software\Clients\Mail"
MS_OUTLOOK              = "Microsoft Outlook Express"
MS_OUTLOOK_5            = "Microsoft Outlook Express 6"
NEWSCLIENT_KEY          = "Software\Clients\News"
OUTLOOK                 = "Outlook Express"
OUTLOOK_KEY             = "Outlook Express"
TIPS_KEY                = "Software\Microsoft\Outlook Express\Tip Strings"
VERSION_OE              = "6,0,3790,1830"




[defaultinstall]
CopyFiles=wfile.copy.permanent,wfile.copy.permanent,wfile.copy.exe,wfile.copy.stationery,wfile.copy.sys,wfile.copy.sys.roll,wfile.copy.common.perm
DelFiles=wfile.del.exe,wfile.del.sys,wfile.del.sys.roll
AddReg=wCommon.Add.Reg,wCommon.Add.Reg.Loc,wNo.Uninstall.Add.Reg,wRunOnce.Reg,wUser.Stub.50,wMachine.Add.Reg,wMachine.Add.Reg.Loc,wRenameFiles,wInstalled.Reg
DelReg=wThor.Del.Reg,woe.del.oldclients

[user.install]
AddReg=wUser.No.Uninstall.Add.Reg
DelReg=wUser.Del.Reg

[new.user.reg.install]
AddReg=wUser.No.Uninstall.Add.Reg

[wfile.copy.stationery]
aleabanr.gif,waleabanr.gif
amaizrul.gif,wamaizrul.gif
anabnr2.gif,wanabnr2.gif
aswrule.gif,waswrule.gif
Blank.htm,wblank.htm
"Blank Bkgrd.gif",wblankbkg.gif
Btzhsepa.gif,wbtzhsepa.gif
citbannA.gif,wcitbanna.gif
"Citrus Punch Bkgrd.gif",wcitrbkg.gif
"Citrus Punch.htm",wcitrpun.htm
"Clear Day.htm",wclearday.htm
"Clear Day Bkgrd.jpg",wclrdaybg.jpg
fieruled.gif,wfieruld.gif
Fiesta.htm,wfiesta.htm
"Fiesta Bkgrd.jpg",wfiestabg.jpg
Glacier.htm,wglacier.htm
"Glacier Bkgrd.jpg",wglacrbkg.jpg
Ivy.gif,wivy.gif
Ivy.htm,wivy.htm
Leaves.htm,wleaves.htm
"Leaves Bkgrd.jpg",wleavesbg.jpg
Maize.htm,wmaize.htm
"Maize Bkgrd.jpg",wmaizebkg.jpg
Nature.htm,wnature.htm
"Nature Bkgrd.jpg",wnaturebg.jpg
"Network Blitz.htm",wnetblitz.htm
"Network Blitz Bkgrd.gif",wnetblzbg.gif
"Pie Charts Bkgrd.jpg",wpiechtbg.jpg
"Pie Charts.htm",wpiechts.htm
sunbannA.gif,wsunbanna.gif
"Sunflower Bkgrd.jpg",wsunfbkg.jpg
Sunflower.htm,wsunflowr.htm
Sweets.htm,wsweets.htm
"Sweets Bkgrd.gif",wsweetsbg.gif
tech.gif,wtech.gif
Technical.htm,wtech.htm

[wfile.copy.common.perm]
directdb.dll,wdirectdb.dll,,5

[wUser.Stub.50]
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",,0x00004000,"Microsoft Outlook Express 6"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",IsInstalled,0x00014001,01,00,00,00
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",Locale,0x00004000,EN
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",ComponentID,0x00004000,MailNews
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",CloneUser,0x00014001,01,00,00,00
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",StubPath,0x00024000,"""%%ProgramFiles%%\Outlook Express\setup50.exe"" /APP:OE /CALLER:WINNT /user /install"

[wRunOnce.Reg]
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce",RunOnceEx,0x00004002,"rundll32.exe %16425%\iernonce.dll,RunOnceExProcess"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup",OE5_2,0x00004000,"%16425%\inetcomm.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup",OE5_1,0x00004000,"%16428%\System\directdb.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup",OE5_3,0x00004000,"%16426%\Outlook Express\oeimport.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup",OE5_4,0x00004000,"%16426%\Outlook Express\oemiglib.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup",OE5_5,0x00004000,"%16426%\Outlook Express\msoe.dll|DllRegisterServer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnceEx\OEWAB OS Setup",OEWABOS_2,0x00004000,"""%16426%\Outlook Express\setup50.exe"" /APP:OE /CALLER:WINNT /INSTALL"

[wfile.del.exe]
_isetup.exe
msimnui.dll
msimn.txt
mnlicens.txt
msimnimp.dll
junkmail.lko
oejunk.dll

[wfile.del.sys.roll]
msoert.dll

[wRenameFiles]
[wThor.Del.Reg]
HKCR,"CLSID\{233A9692-667E-11d1-9DFB-006097D50408}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,0x00004000
HKCR,"CLSID\{1C82EAD9-508E-11D1-8DCF-00C04FB951F9}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,0x00004000
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings","Revocation Checking"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",RequiresIESysFile
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",DisplayName
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",UninstallString
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",QuietUninstallString
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",hotsync.exe
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",pilotcfg.exe
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",ilpilot.exe
HKLM,"Software\Microsoft\Outlook Express",Beta
HKCR,"CLSID\{233A9690-667E-11d1-9DFB-006097D50408}",,0x00004000
HKCR,"CLSID\{89292101-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKCR,"CLSID\{89292102-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKCR,"CLSID\{89292103-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKCR,"CLSID\{8929210A-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKCR,"CLSID\{8F0C5675-AEEF-11d0-84F0-00C04FD43F8F}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{89292101-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{89292102-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{89292103-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Desktop\NameSpace\{8929210A-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Internet\NameSpace\{89292102-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Internet\NameSpace\{89292103-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\mycomputer\NameSpace\{89292102-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\mycomputer\NameSpace\{89292103-4755-11cf-9DC2-00AA006C2B84}",,0x00004000
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{89292102-4755-11cf-9DC2-00AA006C2B84}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{89292103-4755-11cf-9DC2-00AA006C2B84}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{8929210A-4755-11cf-9DC2-00AA006C2B84}
HKLM,"Software\Microsoft\Outlook Express\Tip Strings",,0x00004000
HKLM,"Software\Microsoft\Outlook Express\Tip Links",,0x00004000

[wUser.Del.Reg]
HKCU,"Software\Microsoft\Outlook Express\Mail\Composition",,0x00004000
HKCU,"Software\Microsoft\Outlook Express\News\Composition",,0x00004000
HKCU,"Software\Microsoft\MailIcon",,0x00004000

[wfile.del.sys]
thor.dll
imnacct.dll
msoemapi.dll

[woe.del.oldclients]
HKLM,"Software\Clients\Mail\Internet Mail and News",,0x00004000
HKLM,"Software\Clients\News\Internet Mail and News",,0x00004000
HKLM,"Software\Clients\Mail\Outlook Express",,0x00004000
HKLM,"Software\Clients\News\Outlook Express",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\InternetMailNews",,0x00004000

[wCommon.Add.Reg.Loc]
[wfile.copy.exe]
csapi3t1.dll,wcsapi3t1.dll,,4
msoeres.dll,wmsoeres.dll,,5
msoe.dll,wmsoe.dll,,5
oeimport.dll,woeimport.dll,,4
msoe.txt,wmsoe.txt
msimn.exe,wmsimn.exe,,5

[wfile.copy.sys.roll]
inetcomm.dll,winetcomm.dll,,5
inetres.dll,winetres.dll,,5

[wMachine.Add.Reg.Loc]
[wfile.copy.sys]
[wInstalled.Reg]
[wCommon.Add.Reg]
HKLM,"SOFTWARE\Microsoft\Outlook Express",MediaVer,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\OutlookExpress",,0x00004000
HKLM,"SOFTWARE\Microsoft\Outlook Express",Media,0x00004000,NT
HKLM,"Software\Microsoft\Outlook Express",InstallRoot,0x00024000,"%%ProgramFiles%%\Outlook Express"
HKLM,"Software\Microsoft\Outlook Express\Inetcomm",DllPath,0x00024000,"%%SystemRoot%%\System32\inetcomm.dll"

[wfile.copy.permanent]
setup50.exe,wsetup50.exe,,5
oemig50.exe,woemig50.exe,,4
oemiglib.dll,woemiglib.dll,,4

[wMachine.Add.Reg]
HKLM,"Software\Microsoft\Outlook Express\5.0\Required Settings",VerStamp,0x00014001,03,00,00,00
HKLM,"Software\Microsoft\Outlook Express\5.0\Required Settings\Mail","Welcome Message",0x00004001,01,00,00,00
HKLM,"Software\Microsoft\Outlook Express\5.0\Required Settings\Mail","Accounts Checked",0x00004001,00,00,00,00
HKLM,"Software\Microsoft\Outlook Express\5.0\Required Settings\News","Accounts Checked",0x00004001,00,00,00,00
HKLM,"Software\Microsoft\Outlook Express\5.0\Required Settings",SpellDontIgnoreDBCS,0x00014001,01,00,00,00
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File0,0x00004000,"Clear Day.htm"
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File1,0x00004000,Nature.htm
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File2,0x00004000,Maize.htm
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File3,0x00004000,Sunflower.htm
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File4,0x00004000,"Citrus Punch.htm"
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File5,0x00004000,Blank.htm
HKLM,"Software\Microsoft\Outlook Express\5.0\Default Settings\Recent Stationery List",File6,0x00004000,Leaves.htm

[wUser.No.Uninstall.Add.Reg]
HKCU,"AppEvents\EventLabels\MailBeep",,0x00004002,"New Mail Notification"
HKCU,"AppEvents\Schemes\Apps\.Default\MailBeep\.current",,0x00004002,chimes.wav

[wNo.Uninstall.Add.Reg]
HKLM,"Software\Microsoft\Windows Messaging Subsystem",MAPI,0x00004000,1
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",inetsw95.exe,0x00004002,
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",choosusr.dll,0x00004002,
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",msab32.dll,0x00004002,
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",nwab32.dll,0x00004002,
HKLM,"Software\Microsoft\Windows Messaging Subsystem\MSMapiApps",outstore.dll,0x00004002,"Microsoft Outlook"
HKLM,"Software\Microsoft\Shared Tools",SharedFilesDir,0x00004002,"%16428%\Microsoft Shared\"
HKLM,"Software\Microsoft\Shared Tools\Stationery","Stationery Folder",0x00024002,"%%ProgramFiles%%\Common Files\Microsoft Shared\Stationery"
HKLM,"Software\Microsoft\Shared Tools\Stationery","Backgrounds Folder",0x00024002,"%%ProgramFiles%%\Common Files\Microsoft Shared\Stationery"
HKLM,"Software\Microsoft\Windows\CurrentVersion",ProgramFilesDir,0x00024002,"%%ProgramFiles%%"
HKLM,"Software\Microsoft\Windows\CurrentVersion",CommonFilesDir,0x00024002,"%%ProgramFiles%%\Common Files"

[DestinationDirs]
wfile.copy.stationery=16428,Microsoft Shared\Stationery
wfile.copy.common.perm=16428,System
wfile.del.exe=16426,Outlook Express
wfile.del.sys.roll=16425
wfile.del.sys=16425
wfile.copy.exe=16426,Outlook Express
wfile.copy.sys.roll=16425
wfile.copy.sys=16425
wfile.copy.permanent=16426,Outlook Express
