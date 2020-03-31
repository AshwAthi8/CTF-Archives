
  
  
  
  
  
  
  
  
  
  
  








    
    
    
  


;
;   IE4 INF
;

[Version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
SetupClass=Base
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[DestinationDirs]
; Anything not installed by the system by default
Base.AppDir.CopyFile    = 16422,%MSIE4%
Base.AppDir.DelFiles    = 16422,%MSIE4%
Base.SysDir.DelFiles    = 11
Base.WinDir.DelFiles    = 25
MSIE3patch              = 17
TextConverter.CopyFile  = 16427,Microsoft Shared\TextConv
Branding.CopyFile       = 16422,%MSIE4%\SIGNUP
Triedit.CopyFile        = 16427,Microsoft Shared\Triedit
MSInfo.CopyFile         = 16427,Microsoft Shared\MSInfo

[DefaultInstall]
CopyFiles = Base.AppDir.CopyFile, TextConverter.CopyFile, Branding.CopyFile, Triedit.CopyFile, MSInfo.CopyFile
ProfileItems = DeleteOldStartMenuLinks, CreateStartMenuLinks
AddReg    = Base.IE.AddReg, Base.Sweeper.AddReg, Sweeper.AddReg, Shell.BrowserReg, TextConverter.AddReg
DelReg    = Base.DelReg
UpdateInis= Base.StartMenu.UpdateIni
DelFiles  = Base.SysDir.DelFiles, Base.AppDir.DelFiles, Base.WinDir.DelFiles, MSIE3patch
RegisterDlls = Base.RegSvr

[MarketplaceLinkInstall]
ProfileItems=CreateMarketplaceLink

[CreateMarketplaceLink]
Name       = "Windows Marketplace",8,6
URL        = "http://go.microsoft.com/fwlink/?LinkId=30857&clcid=0x409"
SubDir     = "Links"
IconPath   = 11,,moricons.dll
IconIndex  = 107

;================================================
;             Base Section
;================================================

[CreateStartMenuLinks]
Name       = %HOMENETWORK_DESC%
CmdLine    = 11,,"rundll32.exe hnetwiz.dll,HomeNetWizardRunDll"
SubDir     = %Communications_GROUP%
WorkingDir = 10
InfoTip    = "@%systemroot%\system32\hnetwiz.dll,-3086"
DisplayResource="%systemroot%\system32\hnetwiz.dll",3085
IconPath   = 11,,hnetwiz.dll
IconIndex  = 0

[DeleteOldStartMenuLinks]
Name       = %OLDHOMENETWORK_DESC%,0x00000002
SubDir     = %Communications_GROUP%

[Base.AppDir.CopyFile]
IEXPLORE.EXE,,,32
HMMAPI.DLL,,,32

[Base.AppDir.CopyFile.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[TextConverter.CopyFile]

[TextConverter.CopyFile.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[Branding.CopyFile]
INSTALL.INS

[Branding.CopyFile.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[Triedit.CopyFile]

[Triedit.CopyFile.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[MSInfo.CopyFile]
IEINFO5.OCX
IEFILES5.INF
;IEINFO5.MOF

[MSInfo.CopyFile.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


;========================
;      Base DelFile
;========================

[Base.SysDir.DelFiles]
secbasic.dll
urlcache.dll
vbs.dll
js.dll
htmlctl.ocx
shdisp.dll
hlinkprx.dll
shdocvw.bad

[Base.AppDir.DelFiles]
mailnews.txt
README.TXT
BROWSEUI.DLL
IECONT.DLL
IECONTLC.DLL

[Base.WinDir.DelFiles]
ie4regun
ie4bak.dat
ie4bak.ini
ie4unin.log
ie4 error log.txt
ie4 setup log.txt
ie4 setup log.bak
active setup log.txt
active setup log.bak
ie4 uninstall log.txt
bind list log.txt
runonceex log.txt
soft boot log.txt

[MSIE3patch]
ie3fix.inf

;========================
;      Base AddReg
;========================

[Base.IE.AddReg]
; clobber the following for WinXP (IE6 36136)
HKCU,"Software\Microsoft\Internet Explorer\Main","Disable Script Debugger",,"yes"
; disable repair mode for OS installs
HKLM,"Software\Microsoft\Active Setup","DisableRepair",0x00010001,1

;   ActiveSetup Microsoft Internet Explorer v4.0 Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",,,"%ASETUP_BASE_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}","ComponentID",,"BASEIE40_NTAmd64"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}","Locale",,"%ASETUP_LOCALE%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}","StubPath",0x00020000,"%SystemRoot%\system32\ie4uinit.exe"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}","Version",,"6,0,3790,1830"

HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IE40"

;   ActiveSetup Microsoft Internet Explorer v4.0 Shell Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_IESHELL%",,,"%ASETUP_SHELL_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_IESHELL%","ComponentID",,"IE4Shell_NT"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_IESHELL%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_IESHELL%","Locale",,"%ASETUP_LOCALE%"
; This is temporary while we test the new ie-free method for installing the shell during GUI mode setup - ToddB
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_IESHELL%","StubPath",0x00020000,"regsvr32.exe /s /n /i:U shell32.dll"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_IESHELL%","Version",,"6,0,3790,1830"

HKLM,"Software\Microsoft\Active Setup\Install Check","IE40",,"6.0.3790.1830"

;   Outlook Express / WAB Registration -- only write version keys, their INFs write the rest
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}","Version",,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{7790769C-0471-11d2-AF11-00C04FA35D02}","Version",,"6,0,3790,1830"

;   Advanced Authoring Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_ADVAUTH%",,,"%ASETUP_ADVAUTH_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_ADVAUTH%","ComponentID",,"AdvAuth"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_ADVAUTH%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_ADVAUTH%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_ADVAUTH%","Version",,"6,0,3790,1830"

;   DirectAnimation for Java Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DAJAVA%",,,"%ASETUP_DAJAVA_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DAJAVA%","ComponentID",,"DAJava"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DAJAVA%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DAJAVA%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DAJAVA%","Version",,"6,00,01,0223"

;   DirectDrawEx Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DDRAWEX%",,,"%ASETUP_DDRAWEX_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DDRAWEX%","ComponentID",,"DirectDrawEx"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DDRAWEX%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DDRAWEX%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_DDRAWEX%","Version",,"4,71,1113,0"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\DirectDrawEx"

;   Extra Pack Registration - because of msieftp.dll
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_EXTRAPK%",,,"%ASETUP_EXTRAPK_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_EXTRAPK%","ComponentID",,"ExtraPack"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_EXTRAPK%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_EXTRAPK%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_EXTRAPK%","Version",,"6,0,3790,1830"

;   FontCore Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_FONTCORE%",,,"%ASETUP_FONTCORE_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_FONTCORE%","ComponentID",,"Fontcore"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_FONTCORE%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_FONTCORE%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_FONTCORE%","Version",,"1,00,0000,6"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\Fontcore"

;   GenSetup Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_GSETUP%",,,"%ASETUP_GSETUP_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_GSETUP%","ComponentID",,"GenSetup"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_GSETUP%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_GSETUP%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_GSETUP%","Version",,"5,0,0,1"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IE5BAKEX"

;   Help Content Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HELPCONT%",,,"%ASETUP_HELPCONT_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HELPCONT%","ComponentID",,"HelpCont"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HELPCONT%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HELPCONT%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HELPCONT%","Version",,"6,0,3790,1830"

;   HTML Help Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HTMLHELP%",,,"%ASETUP_HTMLHELP_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HTMLHELP%","ComponentID",,"HTMLHelp"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HTMLHELP%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HTMLHELP%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_HTMLHELP%","Version",,"4,74,9006,0"

;   MSN Site Authentication Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSNAUTH%",,,"%ASETUP_MSNAUTH_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSNAUTH%","ComponentID",,"MSN_Auth"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSNAUTH%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSNAUTH%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSNAUTH%","Version",,"4,9,9,2"

;   MSTask Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSTASK%",,,"%ASETUP_MSTASK_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSTASK%","ComponentID",,"MSTASK"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSTASK%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSTASK%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_MSTASK%","Version",,"4,71,1968,1"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\SchedulingAgent"

;   Offline Browsing Pack Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_OFFLINE%",,,"%ASETUP_OFFLINE_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_OFFLINE%","ComponentID",,"MobilePk"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_OFFLINE%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_OFFLINE%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_OFFLINE%","Version",,"6,0,3790,1830"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\MobileOptionPack"

;   TriData Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIDATA%",,,"%ASETUP_TRIDATA_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIDATA%","ComponentID",,"Tridata"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIDATA%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIDATA%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIDATA%","Version",,"5,5000,3130,0"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IEData"
; the following key is defined at top of page -- DO NOT REMOVE!
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IE4Data"

;   TriDataJava Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIJAVA%",,,"%ASETUP_TRIJAVA_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIJAVA%","ComponentID",,"TridataJava"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIJAVA%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIJAVA%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_TRIJAVA%","Version",,"4,7,0,0320"

;   USP10 Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_USP10%",,,"%ASETUP_USP10_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_USP10%","ComponentID",,"USP10"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_USP10%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_USP10%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_USP10%","Version",,"1,397,2406,1"

;   VBScript Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_VBSCRIPT%",,,"%ASETUP_VBSCRIPT_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_VBSCRIPT%","ComponentID",,"MSVBScript"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_VBSCRIPT%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_VBSCRIPT%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_VBSCRIPT%","Version",,"5,6,0,5901"

;   Branding Registration
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_BRANDING%",,,"%ASETUP_BRANDING_DESC%"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_BRANDING%","ComponentID",,"BRANDING.CAB"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_BRANDING%","StubPath",,"RunDLL32 IEDKCS32.DLL,BrandIE4 SIGNUP"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_BRANDING%","Version",,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_BRANDING%","Locale",,"*"
HKLM,"Software\Microsoft\Active Setup\Installed Components\%CLSID_BRANDING%","IsInstalled",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce",BrandClearStubs,,"RUNDLL32 IEDKCS32.DLL,BrandCleanInstallStubs MICROS"

;   IEXPLORE.EXE Interface Registration
HKCR,"InternetExplorer.Application",,,"Internet Explorer"
HKCR,"InternetExplorer.Application\CLSID",,,"%CLSID_IE_App%"
HKCR,"InternetExplorer.Application\CurVer",,,"InternetExplorer.Application.1"
HKCR,"InternetExplorer.Application.1",,,"Internet Explorer (Ver 1.0)"
HKCR,"InternetExplorer.Application.1\CLSID",,,"%CLSID_IE_App%"
HKCR,"CLSID\%CLSID_IE_App%",,,"Internet Explorer(Ver 1.0)"
HKCR,"CLSID\%CLSID_IE_App%\LocalServer32",,0x00020000,"""%programfiles%\%LMSIE4%\iexplore.exe"""
HKCR,"CLSID\%CLSID_IE_App%\ProgID",,,"InternetExplorer.Application.1"
HKCR,"CLSID\%CLSID_IE_App%\VersionIndependentProgID",,,"InternetExplorer.Application"
HKCR,"CLSID\%CLSID_IE_App%\TypeLib",,,"%CLSID_IE_TypeLib%"
HKCR,"CLSID\%CLSID_IE_App%\Programmable",,,""

;   DeskTop Icon Mappings
HKCR,"CLSID\%CLSID_DesktopIcon%\DefaultIcon",,0x00020000,"""%programfiles%\%LMSIE4%\iexplore.exe"",-32528"
HKCR,"CLSID\%CLSID_DesktopIcon%\InProcServer32",,0x00020000,"%SystemRoot%\system32\url.dll"
HKCR,"CLSID\%CLSID_DesktopIcon%\InProcServer32","ThreadingModel",,"Apartment"
HKCR,"CLSID\%CLSID_DesktopIcon%\ShellEx\PropertySheetHandlers\%CLSID_DesktopIcon%",,,""
HKCR,"CLSID\%CLSID_DesktopIcon%\ShellFolder",,,""
HKCR,"CLSID\%CLSID_DesktopIcon%\ShellFolder","Attributes",1,72,00,00,00

;   Internet Explorer Version
HKLM,"SOFTWARE\Microsoft\Internet Explorer","Build",,"63790.1830"
HKLM,"SOFTWARE\Microsoft\Internet Explorer","Version",,"6.0.3790.1830"
HKLM,"SOFTWARE\Microsoft\Internet Explorer","W2kVersion",,"6.0.3790.1830"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings","MinorVersion",,";SP1;"

;   Create EscRanges key if doesn't exist. See iesacls.inf
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Internet Settings\ZoneMap\EscRanges"

;   App Paths.  3rd Party Programs should look here to find iexplore.exe
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\IEXPLORE.EXE",,0,"%16422%\%LMSIE4%\iexplore.exe"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\IEXPLORE.EXE","Path",0,"%16422%\%LMSIE4%;"

; These following 4 entries should be nuked and clients like ieuinit.inx, ICW should stop looking here
; and look at the App Paths above -- have opened a bug on it.
HKLM,"Software\Microsoft\IE4\Setup","Path",0x00020000,"%programfiles%\%LMSIE4%"
HKLM,"Software\Microsoft\IE Setup\Setup","Path",0x00020000,"%programfiles%\%LMSIE4%"
HKLM,"Software\Microsoft\IE4\Setup","Apps.hlpDate",0,"1998.02.01"
HKLM,"Software\Microsoft\IE Setup\Setup","Apps.hlpDate",0,"1998.02.01"

;   Register with the New Start Menu as an internet browser and ask to be the default (if there isn't one already)
HKLM,"Software\Clients\StartMenuInternet\IEXPLORE.EXE","LocalizedString",,"@%16426%\%LMSIE4%\iexplore.exe,-702"
HKLM,"Software\Clients\StartMenuInternet\IEXPLORE.EXE\DefaultIcon",,,"%16426%\%LMSIE4%\iexplore.exe,0"
HKLM,"Software\Clients\StartMenuInternet\IEXPLORE.EXE\shell\open\command",,,"""%16426%\%LMSIE4%\iexplore.exe"""

;   Used during remove
HKLM,"Software\Microsoft\Internet Explorer"
HKCU,"Software\Microsoft\Internet Explorer"

;   News Shortcuts
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\NewShortcutHandlers","%CLSID_NewsShortcut%",2,""




[Base.Sweeper.AddReg]
;   Plug-in OCX Registration
HKLM,"Software\Microsoft\Internet Explorer\Plugins",,2,
HKLM,"Software\Microsoft\Internet Explorer\Plugins\Extension",,2,
HKLM,"Software\Microsoft\Internet Explorer\Plugins\MIME",,2,
HKLM,"Software\Microsoft\Internet Explorer\Plugins\PluginsPageFriendlyName",,2,"%ACTIVEX_GALLERY%"
HKLM,"Software\Microsoft\Internet Explorer\Plugins\PluginsPage",,2,"%PLUGIN_PAGE%"

;   RunOnce Commands
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","IE - 02",,"fixmapi.exe"
; For NT, the regsvr calls are dealt with in syssetup.inx under the OleControlDlls section hdr.

;   URL.DLL Registry Entries

HKCR,"CLSID\%CLSID_URL_DLL%",,2,"MIME and Internet Property Sheet Hook"
HKCR,"CLSID\%CLSID_URL_DLL%\InProcServer32",,0x00020000,"%SystemRoot%\system32\url.dll"
HKCR,"CLSID\%CLSID_URL_DLL%\InProcServer32","ThreadingModel",2,"Apartment"

;   URLMON.DLL Registry Entries

HKCR,"CLSID\%CLSID_URLMON%",,2,"UrlMon ProxyStub Factory"
HKCR,"CLSID\%CLSID_URLMON%\InprocServer32",,0x00020000,"%SystemRoot%\system32\urlmon.dll"
HKCR,"CLSID\%CLSID_IPersistMoniker%",,2,"IPersistMoniker"
HKCR,"CLSID\%CLSID_IPersistMoniker%\ProxyStubClsid32",,2,"%CLSID_URLMON%"

;   Object Store Registry Entries
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings","CodeBaseSearchPath",2,"CODEBASE;<http://activex.microsoft.com/objects/ocget.dll>;<http://codecs.microsoft.com/isapi/ocget.dll>"

;   Marquee.ocx Registry Entries
HKLM,"Software\Classes\CLSID\{1a4da620-6217-11cf-be62-0080c72edd2d}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,2,
HKLM,"Software\Classes\CLSID\{1a4da620-6217-11cf-be62-0080c72edd2d}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}",,2,

;   These values will be used when the user clicks on the "Use Default" button.
HKLM,"Software\Microsoft\Internet Explorer\Main","Default_Page_URL",,"%START_PAGE%"
HKLM,"Software\Microsoft\Internet Explorer\Main","Default_Search_URL",,"%SEARCH_PAGE_URL%"
HKLM,"Software\Microsoft\Internet Explorer\Main","Search Page",,"%SEARCH_PAGE_URL%"

;   History Interface
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\History","",2,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History","DaysToKeep",3,14,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History","CacheLimit",3,00,02,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History","Directory",0x00020000,"%SystemRoot%\%HISTORY_DIR%"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History","CachePrefix",2,"Visited: "

;   Cache Settings
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache","FreshnessInterval",3,80,f4,03,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache","CleanupFactor",3,19,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache","CleanupTime",3,00,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache","Persistent",3,01,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache","CleanupInterval",3,80,51,01,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache","DebugFlag",3,ff,ff,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths","Paths",3,04,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths","Directory",0x00020002,"%SystemRoot%\%CACHE_DIR%"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths","Size",3,24,01,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path1","CacheLimit",3,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path1","CachePath",0x00020000,"%SystemRoot%\%CACHE_DIR%\cache1"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path2","CacheLimit",3,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path2","CachePath",0x00020000,"%SystemRoot%\%CACHE_DIR%\cache2"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path3","CacheLimit",3,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path3","CachePath",0x00020000,"%SystemRoot%\%CACHE_DIR%\cache3"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path4","CacheLimit",3,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path4","CachePath",0x00020000,"%SystemRoot%\%CACHE_DIR%\cache4"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\Cookies","Directory",0x00020000,"%USERPROFILE%\Cookies"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\Cookies","CachePrefix",2,"Cookie:"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\Cookies","CacheLimit",3,00,04,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents","0",0,"image/gif"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents","1",0,"image/x-xbitmap"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents","2",0,"image/jpeg"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents","3",0,"image/pjpeg"
HKLM,"Software\Microsoft\Internet Explorer\Document Caching","Number",3,04,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Image Caching","Number",3,04,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main","Enable_Disk_Cache",2,"yes"
HKLM,"Software\Microsoft\Internet Explorer\Main","Cache_Percent_of_Disk",3,0A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main","Delete_Temp_Files_On_Exit",2,"yes"

;   Miscellaneous IE Settings
HKLM,"Software\Microsoft\Internet Explorer\Main","Local Page",0x00020000,"%SystemRoot%\system32\blank.htm"
HKLM,"Software\Microsoft\Internet Explorer\Main","Anchor_Visitation_Horizon",3,01,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main","Use_Async_DNS",2,"yes"
HKLM,"Software\Microsoft\Internet Explorer\Main","Placeholder_Width",3,1A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main","Placeholder_Height",3,1A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Styles","Count_Style_Sheets",3,05,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\PrintAppletsOnFEWin95",,""
HKLM,"Software\Microsoft\Internet Explorer\Application Compatibility","HelpCtr.exe",0x00010001,1,0,0,0
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Last Update\IEXPLOREV4","CurrentVerTimestamp",0,"Sun, 21 April 1996 01:00:00 GMT"
HKLM,"Software\Microsoft\Windows\CurrentVersion","WallPaperDir",0x00020002,"%SystemRoot%\Web\%LWallpaper%"
HKLM, "SOFTWARE\Microsoft\Internet Explorer\Download"
HKLM, "SOFTWARE\Microsoft\Internet Explorer\Media"

;   URL Mappings
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\DefaultPrefix",,2,"http://"
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes","ftp",2,"ftp://"
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes","gopher",2,"gopher://"
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes","home",2,"http://"
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes","mosaic",2,"http://"
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes","www",2,"http://"

;   MSNSSPC/WinSSPI Reg Entries
HKLM,"Software\Microsoft\Internet Explorer\Security\MSN","Flags",1,0A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Security\NTLM","Flags",1,08,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Security\DPA","Flags",1,1A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Security\Negotiate","Flags",1,18,00,00,00

;   MIME and FILE Mappings
HKCR,"exefile","EditFlags",3,D8,07,00,00

; Auto Config stuff (jsproxy.dll)
HKCR,"AutoProxyTypes"
HKCR,"AutoProxyTypes\Application/x-internet-signup","Default",1,00,00,00,00
HKCR,"AutoProxyTypes\Application/x-internet-signup","DllFile",0x00020000,"%SystemRoot%\system32\iedkcs32.dll"
HKCR,"AutoProxyTypes\Application/x-internet-signup","FileExtensions",,".ins"
HKCR,"AutoProxyTypes\Application/x-ns-proxy-autoconfig","Default",1,01,00,00,00
HKCR,"AutoProxyTypes\Application/x-ns-proxy-autoconfig","DllFile",0x00020000,"%SystemRoot%\system32\jsproxy.dll"
HKCR,"AutoProxyTypes\Application/x-ns-proxy-autoconfig","FileExtensions",,".pac;.jvs;.js"
HKCR,"AutoProxyTypes\application/x-ns-proxy-autoconfig","Flags",1,01,00,00,00

;   MS Download (*.exe, *.dll)
HKCR,".exe","Content Type",2,"application/x-msdownload"
HKCR,".dll","Content Type",2,"application/x-msdownload"

;   TIFF Files (*.tif, *.tiff)
HKCR,".tiff","Content Type",2,"image/tiff"
HKCR,".tif","Content Type",2,"image/tiff"
HKCR,"MIME\Database\Content Type\image/tiff","Extension",2,".tiff"

; PictureIt Files
HKCR,"MIME\Database\Content Type\application/x-mix-transfer","Extension",2,".nix"
HKCR,"MIME\Database\Content Type\application/x-mix-transfer","CLSID",2,"{10000000-0000-0000-0000-000000000001}"

;   Other Formats (Compressed, UNIX formats)
HKCR,".tar","Content Type",,"application/x-tar"
HKCR,"MIME\Database\Content Type\application/x-tar","Extension",,".tar"
HKCR,".tgz","Content Type",,"application/x-compressed"
HKCR,"MIME\Database\Content Type\application/x-compressed","Extension",,".tgz"
HKCR,".man","Content Type",,"application/x-troff-man"
HKCR,"MIME\Database\Content Type\application/x-troff-man","Extension",,".man"
HKCR,".latex","Content Type",,"application/x-latex"
HKCR,"MIME\Database\Content Type\application/x-latex","Extension",,".latex"
HKCR,".ps","Content Type",,"application/postscript"
HKCR,".eps","Content Type",,"application/postscript"
HKCR,".ai","Content Type",,"application/postscript"
HKCR,"MIME\Database\Content Type\application/postscript","Extension",,".ps"
HKCR,".sit","Content Type",,"application/x-stuffit"
HKCR,"MIME\Database\Content Type\application/x-stuffit","Extension",,".sit"
HKCR,".hqx","Content Type",,"application/mac-binhex40"
HKCR,"MIME\Database\Content Type\application/mac-binhex40","Extension",,".hqx"
HKCR,".fif","Content Type",,"application/fractals"
HKCR,"MIME\Database\Content Type\application/fractals","Extension",,".fif"
HKCR,".zip","Content Type",,"application/x-zip-compressed"
HKCR,"MIME\Database\Content Type\application/x-zip-compressed","Extension",,".zip"
HKCR,".gz","Content Type",,"application/x-gzip"
HKCR,"MIME\Database\Content Type\application/x-gzip","Extension",,".gz"
HKCR,".z","Content Type",,"application/x-compress"
HKCR,"MIME\Database\Content Type\application/x-compress","Extension",,".z"

; AVI File
HKLM,"Software\Classes\CLSID\{00022602-0000-0000-C000-000000000046}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}","",2,""
HKLM,"Software\Classes\CLSID\{00022602-0000-0000-C000-000000000046}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}","",2,""

; MIDI File
HKLM,"Software\Classes\CLSID\{00022603-0000-0000-C000-000000000046}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}","",2,""
HKLM,"Software\Classes\CLSID\{00022603-0000-0000-C000-000000000046}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}","",2,""

; WAV File
HKLM,"Software\Classes\CLSID\{00020C01-0000-0000-C000-000000000046}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}","",2,""
HKLM,"Software\Classes\CLSID\{00020C01-0000-0000-C000-000000000046}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}","",2,""

; CLSIDs for Embed Formats.
HKLM,"Software\Microsoft\Internet Explorer\EmbedExtnToClsidMappings\.dcr",,2,"clsid:166B1BCA-3F9C-11CF-8075-444553540000"
HKLM,"Software\Microsoft\Internet Explorer\EmbedExtnToClsidMappings\.dir",,2,"clsid:166B1BCA-3F9C-11CF-8075-444553540000"

; ActiveX kill bits
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{00022601-0000-0000-C000-000000000046}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{00022602-0000-0000-C000-000000000046}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{00022603-0000-0000-C000-000000000046}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{0003000E-0000-0000-C000-000000000046}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{1141B704-053E-11D0-9DF0-00C04FD7BF41}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{183C259A-0480-11d1-87EA-00C04FC29D46}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{1fb464c8-09bb-4017-a2f5-eb742f04392f}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{29c13b62-b9f7-4cd3-8cef-0a58a1a99441}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{791fa017-2de3-492e-acc5-53c67a2b94d0}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361143-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361146-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361149-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{8136114B-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{8136114D-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{8136114F-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361152-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361155-FAF9-11D3-B0D3-00C04F612FF1}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{886E7BF0-C867-11CF-B1AE-00AA00A3F2C3}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{9088E688-063A-4806-A3DB-6522712FC061}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{931a8c29-3ea9-494d-91e7-22e9a9247687}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{99B42120-6EC7-11CF-A6C7-00AA00A47DD2}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{E87A6788-1D0F-4444-8898-1D25829B6755}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{69DEAF94-AF66-11D3-BEC0-00105AA9B6AE}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{D32C3BAD-5213-49BD-A7D5-E6DE6C0D8249}", "Compatibility Flags",0x00010001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{4B106874-DD36-11D0-8B44-00A024DD9EFF}", "Compatibility Flags",0x00010001,0x400
 
[Sweeper.AddReg]
;       International CodePages
HKLM,"Software\Microsoft\Windows NT\CurrentVersion\Winlogon","shell",,"Explorer.exe"

[Shell.BrowserReg]
;misc additions
HKLM,"System\CurrentControlSet\Services\inetaccs",,2,""
HKLM,"System\CurrentControlSet\Services\inetaccs\Parameters",,2,""

[TextConverter.AddReg]
;Wordpad settings

; Do not remove the following section. It is not called during base OS install,
; but the section is called directly from external sources post install. (W98 & 1)

[Channel]
0409=chlen_us.inf,chlen_us.cab

;========================
;   Base DelReg
;========================

[Base.DelReg]
; delete the old Explorer icon
HKLM,"Software\Microsoft\Windows\CurrentVersion\explorer\Desktop\NameSpace\{FBF23B42-E3F0-101B-8488-00AA003E56F8}"
HKLM,"Software\Microsoft\Windows\CurrentVersion\explorer\Desktop\NameSpace\FBF23B42-E3F0-101B-8488-00AA003E56F8"
HKCR,Shell.Browser
HKCR,Shell.Browser.1
HKCR,"news\shell\open\ddeexec"
; Nuke the old hlinkprx.dll Entries
HKCR,"CLSID\%CLSID_HLinkPSFactory%"
HKCR,"Interface\%CLSID_HLinkPSFactory%"
HKCR,"Interface\%CLSID_IBindStatusCallback%"
HKCR,"Interface\%CLSID_IHlinkSite%"
HKCR,"Interface\%CLSID_IHlink%"
HKCR,"Interface\%CLSID_IHlinkSource%"
HKCR,"Interface\%CLSID_IHlinkFrame%"
HKCR,"Interface\%CLSID_IEnumHLINKITEM%"
HKCR,"Interface\%CLSID_IHlinkBrowseContext%"
HKCR,"Interface\%CLSID_IHlinkHistory%"
HKCR,"Interface\%CLSID_IPersistMoniker%"
HKCR,"Interface\%CLSID_IFile%"

; tshoot.ocx
HKCR,"CLSID\{4B106874-DD36-11D0-8B44-00A024DD9EFF}"

HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache1"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache2"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache3"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache4"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path5"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path6"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path7"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path8"

HKLM,"System\CurrentControlSet\control\SecurityProviders\Schannel\CertificationAuthorities\internetMCI Mall"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\Desktop\DockingWindows\Microsoft.Ticker"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\Desktop\DockingWindows\Microsoft.DesktopChannel"
HKLM,"Software\Microsoft\Internet Explorer\Main","Default Channels"
HKLM,"Software\Microsoft\Internet Explorer\Main","Additional Channels"
HKLM,"Software\Microsoft\Internet Explorer\SecurityProtocols","Basic"
HKLM,"Software\Microsoft\Internet Explorer\Styles"
HKLM,"Software\Microsoft\Active Setup\JITInfo\5"
HKLM,"Software\Microsoft\Internet Explorer\Help_Menu_URLs","3"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}","QFEVersion"
HKLM,"Software\Microsoft\Internet Explorer\MediaTypeClass\{00000000-0000-0000-0000-000000000000}","audio/wav"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE3 SecurityLnkUpdate"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\InternetExplorer"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE40"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE40RemovBak"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE4Shell"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IEDW"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings","User Agent"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Run","UserDataUninstall"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Run","BrowserWebCheck"
;powertoys "find on the internet"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\FindExtensions\{97E2C371-FDDD-11CF-807F-02608C8D98DF}"
HKCR,"CLSID\{97E2C371-FDDD-11CF-807F-02608C8D98DF}"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\User Agent\Post Platform","DigExt"

; channels cleanup
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chl99","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-us","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlja-jp","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlcs-cz","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlda-dk","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlde-at","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlde-ch","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlde-de","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlel-gr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-au","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-bb","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-bz","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-ca","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-gy","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-ie","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-jm","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-me","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-nz","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-ph","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-sr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-tt","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-uk","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-za","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-ar","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-cl","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-co","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-cr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-do","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-es","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-gt","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-hn","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-mx","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-ni","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-pa","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-pe","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-pr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-sv","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-uy","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-ve","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfi-fi","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfr-be","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfr-ch","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfr-fr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlhi-in","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlhr-hr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlhu-hu","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlin-id","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlit-it","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlko-kr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlml-my","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlnl-be","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlnl-nl","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlno-no","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlpl-pl","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlpt-br","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlpt-pt","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlru-ru","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlsl-si","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlsv-se","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlth-th","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chltr-tr","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-cn","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-hk","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-sg","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-tw","StubPath"
HKLM,"Software\Microsoft\Active Setup\Installed Components\ChlOEM","StubPath"
; IECONT cleanup IE6 33035
HKLM,"SOFTWARE\Microsoft\Internet Explorer\Extensions\{9239E4EC-C9A6-11D2-A844-00C04F68D538}"
HKCR,"CLSID\{864B4D50-3B9A-11D2-B8DB-00C04FA3471C}"

;========================
;      Base UpdateIni
;========================

[Base.StartMenu.UpdateIni]
setup.ini, progman.groups,,"IE_INTERNET=%MSIEXPLORE_PROGGROUP%"
setup.ini, IE_INTERNET,,""%MSINETWIZ_DESC%"",,,
setup.ini, progman.groups,,"X_GROUP="
setup.ini, X_GROUP,,""%MSIEXPLORE_DESC%""
setup.ini, X_GROUP,,""Windows Explorer""
setup.ini, progman.groups,,"IECOMPAT=%MSIEXPLORE_DESC%"
setup.ini, IECOMPAT,,""%MSIEXPLORE_COMPAT%""

[Base.RegSvr]
16422,%MSIE4%,hmmapi.dll,1

[Triedit.RegSvr]

;
; NOTE: We don't register this file here since it needs
;       to be registered after all of the wbem stuff
;       since it requires the mof compiler. Instead, it
;       gets registered by syssetup.inx
;
[MSInfo.RegSvr]
16427,Microsoft Shared\MSInfo,ieinfo5.ocx,1


;Windows NT 5.0 Internet Explorer Strings
[Strings]
;Localizable
ASETUP_LOCALE              = "en"
ASETUP_BASE_DESC           = "Internet Explorer 6"
ASETUP_SHELL_DESC          = "Windows Desktop Update"
ASETUP_ADVAUTH_DESC        = "Advanced Authoring"
ASETUP_AOLSUPP_DESC        = "AOL Support Files"
ASETUP_DAJAVA_DESC         = "DirectAnimation Java Classes"
ASETUP_DDRAWEX_DESC        = "DirectDrawEx"
ASETUP_EXTRAPK_DESC        = "Browsing Enhancements"
ASETUP_FONTCORE_DESC       = "Internet Explorer Core Fonts"
ASETUP_GSETUP_DESC         = "Internet Explorer Setup Tools"
ASETUP_HELPCONT_DESC       = "Internet Explorer Help"
ASETUP_HTMLHELP_DESC       = "HTML Help"
ASETUP_MSNAUTH_DESC        = "MSN Site Access"
ASETUP_MSTASK_DESC         = "Task Scheduler"
ASETUP_OFFLINE_DESC        = "Offline Browsing Pack"
ASETUP_TRIDATA_DESC        = "Dynamic HTML Data Binding"
ASETUP_TRIJAVA_DESC        = "Dynamic HTML Data Binding for Java"
ASETUP_USP10_DESC          = "Uniscribe"
ASETUP_VBSCRIPT_DESC       = "Visual Basic Scripting Support"
ASETUP_WEBFLDRS_DESC       = "Web Folders"
ASETUP_DIRECTX_DESC        = "DirectX"
ASETUP_IEJAVA_DESC         = "IEJAVA"
ASETUP_BRANDING_DESC       = "Browser Customizations"
ASETUP_IEACCESS_DESC       = "Internet Explorer Access"
TextCnv_Imp_Name           = "HTML Document"
TextCnv_Imp_Ext            = "htm html htx otm"
TextCnv_Exp_Name           = "HTML Document"
TextCnv_Exp_Ext            = "htm html htx"
ProgramF                   = "Program Files"
MSIE4                      = "Internet Explorer"
SharedTools                = "Common Files\Microsoft Shared"
TextConverter              = "Common Files\Microsoft Shared\TextConv"
Cursors                    = "Cursors"
Wallpaper                  = "Wallpaper"
Accessories                = "Accessories"
LProgramF                  = "Program Files"
LMSIE4                     = "Internet Explorer"
LWallpaper                 = "Wallpaper"
Communications_GROUP       = "Accessories\Communications"
OLDHOMENETWORK_DESC        = "Home Networking Wizard"
HOMENETWORK_DESC           = "Network Setup Wizard"
;Localizable
CACHE_DIR                  = "Temporary Internet Files"
; ClassIDs
CLSID_IE_App               = "{0002DF01-0000-0000-C000-000000000046}"
CLSID_IE_TypeLib           = "{EAB22AC0-30C1-11CF-A7EB-0000C05BAE0B}"
CLSID_URLMON               = "{79eac9f1-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IPersistMoniker      = "{79eac9c9-baf9-11ce-8c82-00aa004ba90b}"
CLSID_HLinkPSFactory       = "{79eac9c0-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IBindStatusCallback  = "{79eac9c1-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IHlinkSite           = "{79eac9c2-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IHlink               = "{79eac9c3-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IHlinkSource         = "{79eac9c4-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IHlinkFrame          = "{79eac9c5-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IEnumHLINKITEM       = "{79eac9c6-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IHlinkBrowseContext  = "{79eac9c7-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IHlinkHistory        = "{79eac9c8-baf9-11ce-8c82-00aa004ba90b}"
CLSID_IFile                = "{79eac9ca-baf9-11ce-8c82-00aa004ba90b}"
CLSID_DesktopIcon          = "{FBF23B42-E3F0-101B-8488-00AA003E56F8}"
CLSID_NewsShortcut         = "{FBF23B40-E3F0-101B-8488-00AA003E56F8}"
CLSID_URL_DLL              = "{FBF23B41-E3F0-101B-8488-00AA003E56F8}"
CLSID_IESHELL              = "{89820200-ECBD-11cf-8B85-00AA005B4340}"
CLSID_ADVAUTH              = "{4278c270-a269-11d1-b5bf-0000f8051515}"
CLSID_AOLSUPP              = "{47f67d00-9e55-11d1-baef-00c04fc2d130}"
CLSID_DAJAVA               = "{4f216970-c90c-11d1-b5c7-0000f8051515}"
CLSID_DDRAWEX              = "{44BBA855-CC51-11CF-AAFA-00AA00B6015F}"
CLSID_EXTRAPK              = "{630b1da0-b465-11d1-9948-00c04f98bbc9}"
CLSID_FONTCORE             = "{C9E9A340-D1F1-11D0-821E-444553540600}"
CLSID_GSETUP               = "{5fd399c0-a70a-11d1-9948-00c04f98bbc9}"
CLSID_HELPCONT             = "{45ea75a0-a269-11d1-b5bf-0000f8051515}"
CLSID_HTMLHELP             = "{de5aed00-a4bf-11d1-9948-00c04f98bbc9}"
CLSID_MSNAUTH              = "{6fab99d0-bab8-11d1-994a-00c04f98bbc9}"
CLSID_MSTASK               = "{CC2A9BA0-3BDD-11D0-821E-444553540000}"
CLSID_OFFLINE              = "{3af36230-a269-11d1-b5bf-0000f8051515}"
CLSID_TRIDATA              = "{9381D8F2-0288-11D0-9501-00AA00B911A5}"
CLSID_TRIJAVA              = "{36f8ec70-c29a-11d1-b5c7-0000f8051515}"
CLSID_USP10                = "{3bf42070-b3b1-11d1-b5c5-0000f8051515}"
CLSID_VBSCRIPT             = "{4f645220-306d-11d2-995d-00c04f98bbc9}"
CLSID_WEBFLDRS             = "{73fa19d0-2d75-11d2-995d-00c04f98bbc9}"
CLSID_DIRECTX              = "{44BBA855-CC51-11CF-AAFA-00AA00B6015D}"
CLSID_IEJAVA               = "{08B0E5C0-4FCB-11CF-AAA5-00401C608555}"
CLSID_BRANDING             = ">{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS"
CLSID_IEHARDENADMIN        = "{A509B1A7-37EF-4b3f-8CFC-4F3A74704073}"
CLSID_IEHARDENUSER         = "{A509B1A8-37EF-4b3f-8CFC-4F3A74704073}"
CLSID_IEHARDENADMIN_WOW64  = "{D7D4180C-5713-48CE-A93C-426B8E2B683B}"
; OEM Customizable
START_PAGE                 = "http://www.microsoft.com/isapi/redir.dll?prd=ie&pver=6&ar=msnhome"
PLUGIN_PAGE                = "http://activex.microsoft.com/controls/find.asp?ext=%s&mime=%s"
SEARCH_PAGE_URL            = "http://www.microsoft.com/isapi/redir.dll?prd=ie&ar=iesearch"
; Start Menu IE Strings
MSIEXPLORE_PROGGROUP         = "Internet"
MSIEXPLORE_DESC              = "Internet Explorer"
MSIEXPLORE_COMPAT            = "Previous Internet Explorer Ver. 4"
MSINETWIZ_DESC               = "Internet Setup Wizard"
; Directory Names
HISTORY_DIR                = "History"
; Active X Gallery
ACTIVEX_GALLERY            = "Microsoft ActiveX Gallery"
; Desktop Icon Name
THENET                     = "Internet Explorer"
; File Type Association Dialog
CERT_DESC                  = "Internet Security Certificate"
WORD_TYPES                 = "Word 6.0/95 for Windows & Macintosh"




[defaultinstall]
CopyFiles=wBase.AppDir.CopyFile,wTextConverter.CopyFile,wBranding.CopyFile,wTriedit.CopyFile,wMSInfo.CopyFile
DelFiles=wBase.SysDir.DelFiles,wBase.AppDir.DelFiles
RegisterDlls=wBase.RegSvr,wTriedit.RegSvr
AddReg=wBase.IE.AddReg,wBase.Sweeper.AddReg,wSweeper.AddReg,wShell.BrowserReg,wTextConverter.AddReg
DelReg=wBase.DelReg

[wMSInfo.CopyFile]
IEINFO5.OCX,wIEINFO5.OCX
IEFILES5.INF,wIEFILES5.INF

[wTextConverter.AddReg]
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Export\HTML",Extensions,0x00004002,"htm html htx"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Export\HTML",Name,0x00004002,"HTML Document"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Export\HTML",Path,0x00004000,"%16428%\Microsoft Shared\TextConv\html32.cnv"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\HTML",Extensions,0x00004002,"htm html htx otm"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\HTML",Name,0x00004002,"HTML Document"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\HTML",Path,0x00004000,"%16428%\Microsoft Shared\TextConv\html32.cnv"
HKLM,"Software\Microsoft\Shared Tools\HTML\Clients",Name,0x00004002,"HTML Document"
HKLM,"Software\Microsoft\Shared Tools Location",TEXTCONV,0x00004002,"%16428%\Microsoft Shared\TextConv"
HKLM,"Software\Microsoft\Shared Tools\HTML\Clients","%16426%\Internet Explorer\iexplore.exe",0x00004002,
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord6.wpc",Extensions,0x00004002,doc
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord6.wpc",Name,0x00004002,"Word 6.0/95 for Windows & Macintosh"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord6.wpc",Path,0x00004000,"%16428%\Microsoft Shared\TextConv\mswrd632.wpc"
HKLM,"Software\Microsoft\Shared Tools\MSWord6.wpc\Clients","%16426%\Windows NT\Accessories\wordpad.exe",0x00004002,
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord8",Extensions,0x00004002,doc
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord8",Name,0x00004002,"Word 97"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord8",Path,0x00004000,"%16428%\Microsoft Shared\TextConv\mswrd832.cnv"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWord8\NoDialogs",,0x00004000
HKLM,"Software\Microsoft\Shared Tools\MSWord8\Clients","%16426%\Windows NT\Accessories\wordpad.exe",0x00004002,
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWinWrite.wpc",Extensions,0x00004002,wri
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWinWrite.wpc",Name,0x00004002,"Windows Write"
HKLM,"Software\Microsoft\Shared Tools\Text Converters\Import\MSWinWrite.wpc",Path,0x00004000,"%16428%\Microsoft Shared\TextConv\write32.wpc"
HKLM,"Software\Microsoft\Shared Tools\MSWinWrite.wpc\Clients","%16426%\Windows NT\Accessories\wordpad.exe",0x00004002,

[wBase.DelReg]
HKLM,"Software\Microsoft\Windows\CurrentVersion\explorer\Desktop\NameSpace\{FBF23B42-E3F0-101B-8488-00AA003E56F8}",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\explorer\Desktop\NameSpace\FBF23B42-E3F0-101B-8488-00AA003E56F8",,0x00004000
HKCR,Shell.Browser,,0x00004000
HKCR,Shell.Browser.1,,0x00004000
HKCR,"news\shell\open\ddeexec",,0x00004000
HKCR,"CLSID\{79eac9c0-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c0-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c1-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c2-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c3-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c4-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c5-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c6-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c7-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c8-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9c9-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"Interface\{79eac9ca-baf9-11ce-8c82-00aa004ba90b}",,0x00004000
HKCR,"CLSID\{4B106874-DD36-11D0-8B44-00A024DD9EFF}",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache1",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache2",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache3",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\cache4",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path5",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path6",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path7",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path8",,0x00004000
HKLM,"System\CurrentControlSet\control\SecurityProviders\Schannel\CertificationAuthorities\internetMCI Mall",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\Desktop\DockingWindows\Microsoft.Ticker",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\Desktop\DockingWindows\Microsoft.DesktopChannel",,0x00004000
HKLM,"Software\Microsoft\Internet Explorer\Main","Default Channels"
HKLM,"Software\Microsoft\Internet Explorer\Main","Additional Channels"
HKLM,"Software\Microsoft\Internet Explorer\SecurityProtocols",Basic
HKLM,"Software\Microsoft\Internet Explorer\Styles",,0x00004000
HKLM,"Software\Microsoft\Active Setup\JITInfo\5",,0x00004000
HKLM,"Software\Microsoft\Internet Explorer\Help_Menu_URLs",3
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",QFEVersion
HKLM,"Software\Microsoft\Internet Explorer\MediaTypeClass\{00000000-0000-0000-0000-000000000000}",audio/wav
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE3 SecurityLnkUpdate",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\InternetExplorer",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE40",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE40RemovBak",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IE4Shell",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Uninstall\IEDW",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings","User Agent"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Run",UserDataUninstall
HKLM,"Software\Microsoft\Windows\CurrentVersion\Run",BrowserWebCheck
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\FindExtensions\{97E2C371-FDDD-11CF-807F-02608C8D98DF}",,0x00004000
HKCR,"CLSID\{97E2C371-FDDD-11CF-807F-02608C8D98DF}",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\User Agent\Post Platform",DigExt
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chl99",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-us",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlja-jp",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlcs-cz",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlda-dk",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlde-at",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlde-ch",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlde-de",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlel-gr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-au",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-bb",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-bz",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-ca",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-gy",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-ie",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-jm",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-me",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-nz",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-ph",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-sr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-tt",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-uk",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlen-za",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-ar",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-cl",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-co",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-cr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-do",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-es",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-gt",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-hn",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-mx",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-ni",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-pa",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-pe",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-pr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-sv",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-uy",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chles-ve",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfi-fi",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfr-be",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfr-ch",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlfr-fr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlhi-in",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlhr-hr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlhu-hu",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlin-id",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlit-it",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlko-kr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlml-my",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlnl-be",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlnl-nl",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlno-no",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlpl-pl",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlpt-br",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlpt-pt",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlru-ru",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlsl-si",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlsv-se",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlth-th",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chltr-tr",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-cn",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-hk",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-sg",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\Chlzh-tw",StubPath
HKLM,"Software\Microsoft\Active Setup\Installed Components\ChlOEM",StubPath
HKLM,"SOFTWARE\Microsoft\Internet Explorer\Extensions\{9239E4EC-C9A6-11D2-A844-00C04F68D538}",,0x00004000
HKCR,"CLSID\{864B4D50-3B9A-11D2-B8DB-00C04FA3471C}",,0x00004000

[wBase.RegSvr]
16426,"Internet Explorer",hmmapi.dll,1

[wTriedit.CopyFile]
DHTMLED.OCX,wDHTMLED.OCX
TRIEDIT.DLL,wTRIEDIT.DLL

[wShell.BrowserReg]
HKLM,"System\CurrentControlSet\Services\inetaccs",,0x00004002,
HKLM,"System\CurrentControlSet\Services\inetaccs\Parameters",,0x00004002,

[wBranding.CopyFile]
INSTALL.INS,wINSTALL.INS

[wBase.IE.AddReg]
HKCU,"Software\Microsoft\Internet Explorer\Main","Disable Script Debugger",0x00004000,yes
HKLM,"Software\Microsoft\Active Setup",DisableRepair,0x00014001,1
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",,0x00004000,"Internet Explorer 6"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",ComponentID,0x00004000,BASEIE40_NTAmd64
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",Locale,0x00004000,en
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",StubPath,0x00024000,"%%SystemRoot%%\system32\ie4uinit.exe"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}",Version,0x00004000,"6,0,3790,1830"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IE40",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}",,0x00004000,"Windows Desktop Update"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}",ComponentID,0x00004000,IE4Shell_NT
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}",Locale,0x00004000,en
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}",StubPath,0x00024000,"regsvr32.exe /s /n /i:U shell32.dll"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Install Check",IE40,0x00004000,6.0.3790.1830
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA840-CC51-11CF-AAFA-00AA00B6015C}",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{7790769C-0471-11d2-AF11-00C04FA35D02}",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4278c270-a269-11d1-b5bf-0000f8051515}",,0x00004000,"Advanced Authoring"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4278c270-a269-11d1-b5bf-0000f8051515}",ComponentID,0x00004000,AdvAuth
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4278c270-a269-11d1-b5bf-0000f8051515}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4278c270-a269-11d1-b5bf-0000f8051515}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4278c270-a269-11d1-b5bf-0000f8051515}",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f216970-c90c-11d1-b5c7-0000f8051515}",,0x00004000,"DirectAnimation Java Classes"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f216970-c90c-11d1-b5c7-0000f8051515}",ComponentID,0x00004000,DAJava
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f216970-c90c-11d1-b5c7-0000f8051515}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f216970-c90c-11d1-b5c7-0000f8051515}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f216970-c90c-11d1-b5c7-0000f8051515}",Version,0x00004000,"6,00,01,0223"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA855-CC51-11CF-AAFA-00AA00B6015F}",,0x00004000,DirectDrawEx
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA855-CC51-11CF-AAFA-00AA00B6015F}",ComponentID,0x00004000,DirectDrawEx
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA855-CC51-11CF-AAFA-00AA00B6015F}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA855-CC51-11CF-AAFA-00AA00B6015F}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{44BBA855-CC51-11CF-AAFA-00AA00B6015F}",Version,0x00004000,"4,71,1113,0"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\DirectDrawEx",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{630b1da0-b465-11d1-9948-00c04f98bbc9}",,0x00004000,"Browsing Enhancements"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{630b1da0-b465-11d1-9948-00c04f98bbc9}",ComponentID,0x00004000,ExtraPack
HKLM,"Software\Microsoft\Active Setup\Installed Components\{630b1da0-b465-11d1-9948-00c04f98bbc9}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{630b1da0-b465-11d1-9948-00c04f98bbc9}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{630b1da0-b465-11d1-9948-00c04f98bbc9}",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{C9E9A340-D1F1-11D0-821E-444553540600}",,0x00004000,"Internet Explorer Core Fonts"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{C9E9A340-D1F1-11D0-821E-444553540600}",ComponentID,0x00004000,Fontcore
HKLM,"Software\Microsoft\Active Setup\Installed Components\{C9E9A340-D1F1-11D0-821E-444553540600}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{C9E9A340-D1F1-11D0-821E-444553540600}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{C9E9A340-D1F1-11D0-821E-444553540600}",Version,0x00004000,"1,00,0000,6"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\Fontcore",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5fd399c0-a70a-11d1-9948-00c04f98bbc9}",,0x00004000,"Internet Explorer Setup Tools"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5fd399c0-a70a-11d1-9948-00c04f98bbc9}",ComponentID,0x00004000,GenSetup
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5fd399c0-a70a-11d1-9948-00c04f98bbc9}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5fd399c0-a70a-11d1-9948-00c04f98bbc9}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{5fd399c0-a70a-11d1-9948-00c04f98bbc9}",Version,0x00004000,"5,0,0,1"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IE5BAKEX",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{45ea75a0-a269-11d1-b5bf-0000f8051515}",,0x00004000,"Internet Explorer Help"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{45ea75a0-a269-11d1-b5bf-0000f8051515}",ComponentID,0x00004000,HelpCont
HKLM,"Software\Microsoft\Active Setup\Installed Components\{45ea75a0-a269-11d1-b5bf-0000f8051515}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{45ea75a0-a269-11d1-b5bf-0000f8051515}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{45ea75a0-a269-11d1-b5bf-0000f8051515}",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{de5aed00-a4bf-11d1-9948-00c04f98bbc9}",,0x00004000,"HTML Help"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{de5aed00-a4bf-11d1-9948-00c04f98bbc9}",ComponentID,0x00004000,HTMLHelp
HKLM,"Software\Microsoft\Active Setup\Installed Components\{de5aed00-a4bf-11d1-9948-00c04f98bbc9}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{de5aed00-a4bf-11d1-9948-00c04f98bbc9}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{de5aed00-a4bf-11d1-9948-00c04f98bbc9}",Version,0x00004000,"4,74,9006,0"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{6fab99d0-bab8-11d1-994a-00c04f98bbc9}",,0x00004000,"MSN Site Access"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{6fab99d0-bab8-11d1-994a-00c04f98bbc9}",ComponentID,0x00004000,MSN_Auth
HKLM,"Software\Microsoft\Active Setup\Installed Components\{6fab99d0-bab8-11d1-994a-00c04f98bbc9}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{6fab99d0-bab8-11d1-994a-00c04f98bbc9}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{6fab99d0-bab8-11d1-994a-00c04f98bbc9}",Version,0x00004000,"4,9,9,2"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{CC2A9BA0-3BDD-11D0-821E-444553540000}",,0x00004000,"Task Scheduler"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{CC2A9BA0-3BDD-11D0-821E-444553540000}",ComponentID,0x00004000,MSTASK
HKLM,"Software\Microsoft\Active Setup\Installed Components\{CC2A9BA0-3BDD-11D0-821E-444553540000}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{CC2A9BA0-3BDD-11D0-821E-444553540000}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{CC2A9BA0-3BDD-11D0-821E-444553540000}",Version,0x00004000,"4,71,1968,1"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\SchedulingAgent",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3af36230-a269-11d1-b5bf-0000f8051515}",,0x00004000,"Offline Browsing Pack"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3af36230-a269-11d1-b5bf-0000f8051515}",ComponentID,0x00004000,MobilePk
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3af36230-a269-11d1-b5bf-0000f8051515}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3af36230-a269-11d1-b5bf-0000f8051515}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3af36230-a269-11d1-b5bf-0000f8051515}",Version,0x00004000,"6,0,3790,1830"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\MobileOptionPack",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{9381D8F2-0288-11D0-9501-00AA00B911A5}",,0x00004000,"Dynamic HTML Data Binding"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{9381D8F2-0288-11D0-9501-00AA00B911A5}",ComponentID,0x00004000,Tridata
HKLM,"Software\Microsoft\Active Setup\Installed Components\{9381D8F2-0288-11D0-9501-00AA00B911A5}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{9381D8F2-0288-11D0-9501-00AA00B911A5}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{9381D8F2-0288-11D0-9501-00AA00B911A5}",Version,0x00004000,"5,5000,3130,0"
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IEData",,0x00004000
HKLM,"SoftWare\Microsoft\Windows\CurrentVersion\Uninstall\IE4Data",,0x00004000
HKLM,"Software\Microsoft\Active Setup\Installed Components\{36f8ec70-c29a-11d1-b5c7-0000f8051515}",,0x00004000,"Dynamic HTML Data Binding for Java"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{36f8ec70-c29a-11d1-b5c7-0000f8051515}",ComponentID,0x00004000,TridataJava
HKLM,"Software\Microsoft\Active Setup\Installed Components\{36f8ec70-c29a-11d1-b5c7-0000f8051515}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{36f8ec70-c29a-11d1-b5c7-0000f8051515}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{36f8ec70-c29a-11d1-b5c7-0000f8051515}",Version,0x00004000,"4,7,0,0320"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3bf42070-b3b1-11d1-b5c5-0000f8051515}",,0x00004000,Uniscribe
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3bf42070-b3b1-11d1-b5c5-0000f8051515}",ComponentID,0x00004000,USP10
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3bf42070-b3b1-11d1-b5c5-0000f8051515}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3bf42070-b3b1-11d1-b5c5-0000f8051515}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{3bf42070-b3b1-11d1-b5c5-0000f8051515}",Version,0x00004000,"1,397,2406,1"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f645220-306d-11d2-995d-00c04f98bbc9}",,0x00004000,"Visual Basic Scripting Support"
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f645220-306d-11d2-995d-00c04f98bbc9}",ComponentID,0x00004000,MSVBScript
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f645220-306d-11d2-995d-00c04f98bbc9}",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f645220-306d-11d2-995d-00c04f98bbc9}",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\{4f645220-306d-11d2-995d-00c04f98bbc9}",Version,0x00004000,"5,6,0,5901"
HKLM,"Software\Microsoft\Active Setup\Installed Components\>{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS",,0x00004000,"Browser Customizations"
HKLM,"Software\Microsoft\Active Setup\Installed Components\>{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS",ComponentID,0x00004000,BRANDING.CAB
HKLM,"Software\Microsoft\Active Setup\Installed Components\>{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS",StubPath,0x00004000,"RunDLL32 IEDKCS32.DLL,BrandIE4 SIGNUP"
HKLM,"Software\Microsoft\Active Setup\Installed Components\>{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS",Version,0x00004000,"6,0,3790,1830"
HKLM,"Software\Microsoft\Active Setup\Installed Components\>{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS",Locale,0x00004000,*
HKLM,"Software\Microsoft\Active Setup\Installed Components\>{60B49E34-C7CC-11D0-8953-00A0C90347FF}MICROS",IsInstalled,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce",BrandClearStubs,0x00004000,"RUNDLL32 IEDKCS32.DLL,BrandCleanInstallStubs MICROS"
HKCR,InternetExplorer.Application,,0x00004000,"Internet Explorer"
HKCR,"InternetExplorer.Application\CLSID",,0x00004000,{0002DF01-0000-0000-C000-000000000046}
HKCR,"InternetExplorer.Application\CurVer",,0x00004000,InternetExplorer.Application.1
HKCR,InternetExplorer.Application.1,,0x00004000,"Internet Explorer (Ver 1.0)"
HKCR,"InternetExplorer.Application.1\CLSID",,0x00004000,{0002DF01-0000-0000-C000-000000000046}
HKCR,"CLSID\{0002DF01-0000-0000-C000-000000000046}",,0x00004000,"Internet Explorer(Ver 1.0)"
HKCR,"CLSID\{0002DF01-0000-0000-C000-000000000046}\LocalServer32",,0x00024000,"""%%programfiles%%\Internet Explorer\iexplore.exe"""
HKCR,"CLSID\{0002DF01-0000-0000-C000-000000000046}\ProgID",,0x00004000,InternetExplorer.Application.1
HKCR,"CLSID\{0002DF01-0000-0000-C000-000000000046}\VersionIndependentProgID",,0x00004000,InternetExplorer.Application
HKCR,"CLSID\{0002DF01-0000-0000-C000-000000000046}\TypeLib",,0x00004000,{EAB22AC0-30C1-11CF-A7EB-0000C05BAE0B}
HKCR,"CLSID\{0002DF01-0000-0000-C000-000000000046}\Programmable",,0x00004000,
HKCR,"CLSID\{FBF23B42-E3F0-101B-8488-00AA003E56F8}\DefaultIcon",,0x00024000,"""%%programfiles%%\Internet Explorer\iexplore.exe"",-32528"
HKCR,"CLSID\{FBF23B42-E3F0-101B-8488-00AA003E56F8}\InProcServer32",,0x00024000,"%%SystemRoot%%\system32\url.dll"
HKCR,"CLSID\{FBF23B42-E3F0-101B-8488-00AA003E56F8}\InProcServer32",ThreadingModel,0x00004000,Apartment
HKCR,"CLSID\{FBF23B42-E3F0-101B-8488-00AA003E56F8}\ShellEx\PropertySheetHandlers\{FBF23B42-E3F0-101B-8488-00AA003E56F8}",,0x00004000,
HKCR,"CLSID\{FBF23B42-E3F0-101B-8488-00AA003E56F8}\ShellFolder",,0x00004000,
HKCR,"CLSID\{FBF23B42-E3F0-101B-8488-00AA003E56F8}\ShellFolder",Attributes,0x00004001,72,00,00,00
HKLM,"SOFTWARE\Microsoft\Internet Explorer",Build,0x00004000,63790.1830
HKLM,"SOFTWARE\Microsoft\Internet Explorer",Version,0x00004000,6.0.3790.1830
HKLM,"SOFTWARE\Microsoft\Internet Explorer",W2kVersion,0x00004000,6.0.3790.1830
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings",MinorVersion,0x00004000,";SP1;"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Internet Settings\ZoneMap\EscRanges",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\IEXPLORE.EXE",,0x00004000,"%16426%\Internet Explorer\iexplore.exe"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\IEXPLORE.EXE",Path,0x00004000,"%16426%\Internet Explorer;"
HKLM,"Software\Microsoft\IE4\Setup",Path,0x00024000,"%%programfiles%%\Internet Explorer"
HKLM,"Software\Microsoft\IE Setup\Setup",Path,0x00024000,"%%programfiles%%\Internet Explorer"
HKLM,"Software\Microsoft\IE4\Setup",Apps.hlpDate,0x00004000,1998.02.01
HKLM,"Software\Microsoft\IE Setup\Setup",Apps.hlpDate,0x00004000,1998.02.01
HKLM,"Software\Clients\StartMenuInternet\IEXPLORE.EXE",LocalizedString,0x00004000,"@%16426%\Internet Explorer\iexplore.exe,-702"
HKLM,"Software\Clients\StartMenuInternet\IEXPLORE.EXE\DefaultIcon",,0x00004000,"%16426%\Internet Explorer\iexplore.exe,0"
HKLM,"Software\Clients\StartMenuInternet\IEXPLORE.EXE\shell\open\command",,0x00004000,"""%16426%\Internet Explorer\iexplore.exe"""
HKLM,"Software\Microsoft\Internet Explorer",,0x00004000
HKCU,"Software\Microsoft\Internet Explorer",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\Explorer\NewShortcutHandlers",{FBF23B40-E3F0-101B-8488-00AA003E56F8},0x00004002,

[wTextConverter.CopyFile]
html32.cnv,whtml32.cnv,,32
msconv97.dll,wmsconv97.dll,,32
mswrd632.wpc,wmswrd632.wpc,,32
mswrd832.cnv,wmswrd832.cnv,,32
write32.wpc,wwrite32.wpc,,32

[wBase.Sweeper.AddReg]
HKLM,"Software\Microsoft\Internet Explorer\Plugins",,0x00004002,
HKLM,"Software\Microsoft\Internet Explorer\Plugins\Extension",,0x00004002,
HKLM,"Software\Microsoft\Internet Explorer\Plugins\MIME",,0x00004002,
HKLM,"Software\Microsoft\Internet Explorer\Plugins\PluginsPageFriendlyName",,0x00004002,"Microsoft ActiveX Gallery"
HKLM,"Software\Microsoft\Internet Explorer\Plugins\PluginsPage",,0x00004002,"http://activex.microsoft.com/controls/find.asp?ext=%%s&mime=%%s"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","IE - 00",0x00004000,"rundll32.exe msnsspc.dll,SspcCreateSspiReg"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","IE - 01",0x00004000,"rundll32.exe msapsspc.dll,SspcCreateSspiReg"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RunOnce","IE - 02",0x00004000,fixmapi.exe
HKCR,"CLSID\{FBF23B41-E3F0-101B-8488-00AA003E56F8}",,0x00004002,"MIME and Internet Property Sheet Hook"
HKCR,"CLSID\{FBF23B41-E3F0-101B-8488-00AA003E56F8}\InProcServer32",,0x00024000,"%%SystemRoot%%\system32\url.dll"
HKCR,"CLSID\{FBF23B41-E3F0-101B-8488-00AA003E56F8}\InProcServer32",ThreadingModel,0x00004002,Apartment
HKCR,"CLSID\{79eac9f1-baf9-11ce-8c82-00aa004ba90b}",,0x00004002,"UrlMon ProxyStub Factory"
HKCR,"CLSID\{79eac9f1-baf9-11ce-8c82-00aa004ba90b}\InprocServer32",,0x00024000,"%%SystemRoot%%\system32\urlmon.dll"
HKCR,"CLSID\{79eac9c9-baf9-11ce-8c82-00aa004ba90b}",,0x00004002,IPersistMoniker
HKCR,"CLSID\{79eac9c9-baf9-11ce-8c82-00aa004ba90b}\ProxyStubClsid32",,0x00004002,{79eac9f1-baf9-11ce-8c82-00aa004ba90b}
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings",CodeBaseSearchPath,0x00004002,"CODEBASE;<http://activex.microsoft.com/objects/ocget.dll>;<http://codecs.microsoft.com/isapi/ocget.dll>"
HKLM,"Software\Classes\CLSID\{1a4da620-6217-11cf-be62-0080c72edd2d}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Classes\CLSID\{1a4da620-6217-11cf-be62-0080c72edd2d}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Microsoft\Internet Explorer\Main",Default_Page_URL,0x00004000,http://www.microsoft.com/isapi/redir.dll?prd=ie&pver=6&ar=msnhome
HKLM,"Software\Microsoft\Internet Explorer\Main",Default_Search_URL,0x00004000,http://www.microsoft.com/isapi/redir.dll?prd=ie&ar=iesearch
HKLM,"Software\Microsoft\Internet Explorer\Main","Search Page",0x00004000,http://www.microsoft.com/isapi/redir.dll?prd=ie&ar=iesearch
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\History",,0x00004002,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History",DaysToKeep,0x00004003,14,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History",CacheLimit,0x00004003,00,02,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History",Directory,0x00024000,"%%SystemRoot%%\History"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Url History",CachePrefix,0x00004002,"Visited: "
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache",FreshnessInterval,0x00004003,80,f4,03,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache",CleanupFactor,0x00004003,19,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache",CleanupTime,0x00004003,00,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache",Persistent,0x00004003,01,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache",CleanupInterval,0x00004003,80,51,01,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache",DebugFlag,0x00004003,ff,ff,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths",Paths,0x00004003,04,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths",Directory,0x00024002,"%%SystemRoot%%\Temporary Internet Files"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths",Size,0x00004003,24,01,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path1",CacheLimit,0x00004003,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path1",CachePath,0x00024000,"%%SystemRoot%%\Temporary Internet Files\cache1"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path2",CacheLimit,0x00004003,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path2",CachePath,0x00024000,"%%SystemRoot%%\Temporary Internet Files\cache2"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path3",CacheLimit,0x00004003,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path3",CachePath,0x00024000,"%%SystemRoot%%\Temporary Internet Files\cache3"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path4",CacheLimit,0x00004003,00,20,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Paths\path4",CachePath,0x00024000,"%%SystemRoot%%\Temporary Internet Files\cache4"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\Cookies",Directory,0x00024000,"%%USERPROFILE%%\Cookies"
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\Cookies",CachePrefix,0x00004002,Cookie:
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache\Special Paths\Cookies",CacheLimit,0x00004003,00,04,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents",0,0x00004000,image/gif
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents",1,0x00004000,image/x-xbitmap
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents",2,0x00004000,image/jpeg
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Accepted Documents",3,0x00004000,image/pjpeg
HKLM,"Software\Microsoft\Internet Explorer\Document Caching",Number,0x00004003,04,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Image Caching",Number,0x00004003,04,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main",Enable_Disk_Cache,0x00004002,yes
HKLM,"Software\Microsoft\Internet Explorer\Main",Cache_Percent_of_Disk,0x00004003,0A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main",Delete_Temp_Files_On_Exit,0x00004002,yes
HKLM,"Software\Microsoft\Internet Explorer\Main","Local Page",0x00024000,"%%SystemRoot%%\system32\blank.htm"
HKLM,"Software\Microsoft\Internet Explorer\Main",Anchor_Visitation_Horizon,0x00004003,01,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main",Use_Async_DNS,0x00004002,yes
HKLM,"Software\Microsoft\Internet Explorer\Main",Placeholder_Width,0x00004003,1A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Main",Placeholder_Height,0x00004003,1A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Styles",Count_Style_Sheets,0x00004003,05,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\PrintAppletsOnFEWin95",,0x00004000
HKLM,"Software\Microsoft\Internet Explorer\Application Compatibility",HelpCtr.exe,0x00014001,1,0,0,0
HKLM,"Software\Microsoft\Windows\CurrentVersion\Internet Settings\Last Update\IEXPLOREV4",CurrentVerTimestamp,0x00004000,"Sun, 21 April 1996 01:00:00 GMT"
HKLM,"Software\Microsoft\Windows\CurrentVersion",WallPaperDir,0x00024002,"%%SystemRoot%%\Web\Wallpaper"
HKLM,"SOFTWARE\Microsoft\Internet Explorer\Download",,0x00004000
HKLM,"SOFTWARE\Microsoft\Internet Explorer\Media",,0x00004000
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\DefaultPrefix",,0x00004002,http://
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes",ftp,0x00004002,ftp://
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes",gopher,0x00004002,gopher://
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes",home,0x00004002,http://
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes",mosaic,0x00004002,http://
HKLM,"Software\Microsoft\Windows\CurrentVersion\URL\Prefixes",www,0x00004002,http://
HKLM,"Software\Microsoft\Internet Explorer\Security\MSN",Flags,0x00004001,0A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Security\NTLM",Flags,0x00004001,08,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Security\DPA",Flags,0x00004001,1A,00,00,00
HKLM,"Software\Microsoft\Internet Explorer\Security\Negotiate",Flags,0x00004001,18,00,00,00
HKCR,exefile,EditFlags,0x00004003,D8,07,00,00
HKCR,AutoProxyTypes,,0x00004000
HKCR,"AutoProxyTypes\Application/x-internet-signup",Default,0x00004001,00,00,00,00
HKCR,"AutoProxyTypes\Application/x-internet-signup",DllFile,0x00024000,"%%SystemRoot%%\system32\iedkcs32.dll"
HKCR,"AutoProxyTypes\Application/x-internet-signup",FileExtensions,0x00004000,.ins
HKCR,"AutoProxyTypes\Application/x-ns-proxy-autoconfig",Default,0x00004001,01,00,00,00
HKCR,"AutoProxyTypes\Application/x-ns-proxy-autoconfig",DllFile,0x00024000,"%%SystemRoot%%\system32\jsproxy.dll"
HKCR,"AutoProxyTypes\Application/x-ns-proxy-autoconfig",FileExtensions,0x00004000,".pac;.jvs;.js"
HKCR,"AutoProxyTypes\application/x-ns-proxy-autoconfig",Flags,0x00004001,01,00,00,00
HKCR,.exe,"Content Type",0x00004002,application/x-msdownload
HKCR,.dll,"Content Type",0x00004002,application/x-msdownload
HKCR,.tiff,"Content Type",0x00004002,image/tiff
HKCR,.tif,"Content Type",0x00004002,image/tiff
HKCR,"MIME\Database\Content Type\image/tiff",Extension,0x00004002,.tiff
HKCR,"MIME\Database\Content Type\application/x-mix-transfer",Extension,0x00004002,.nix
HKCR,"MIME\Database\Content Type\application/x-mix-transfer",CLSID,0x00004002,{10000000-0000-0000-0000-000000000001}
HKCR,.tar,"Content Type",0x00004000,application/x-tar
HKCR,"MIME\Database\Content Type\application/x-tar",Extension,0x00004000,.tar
HKCR,.tgz,"Content Type",0x00004000,application/x-compressed
HKCR,"MIME\Database\Content Type\application/x-compressed",Extension,0x00004000,.tgz
HKCR,.man,"Content Type",0x00004000,application/x-troff-man
HKCR,"MIME\Database\Content Type\application/x-troff-man",Extension,0x00004000,.man
HKCR,.latex,"Content Type",0x00004000,application/x-latex
HKCR,"MIME\Database\Content Type\application/x-latex",Extension,0x00004000,.latex
HKCR,.ps,"Content Type",0x00004000,application/postscript
HKCR,.eps,"Content Type",0x00004000,application/postscript
HKCR,.ai,"Content Type",0x00004000,application/postscript
HKCR,"MIME\Database\Content Type\application/postscript",Extension,0x00004000,.ps
HKCR,.sit,"Content Type",0x00004000,application/x-stuffit
HKCR,"MIME\Database\Content Type\application/x-stuffit",Extension,0x00004000,.sit
HKCR,.hqx,"Content Type",0x00004000,application/mac-binhex40
HKCR,"MIME\Database\Content Type\application/mac-binhex40",Extension,0x00004000,.hqx
HKCR,.fif,"Content Type",0x00004000,application/fractals
HKCR,"MIME\Database\Content Type\application/fractals",Extension,0x00004000,.fif
HKCR,.zip,"Content Type",0x00004000,application/x-zip-compressed
HKCR,"MIME\Database\Content Type\application/x-zip-compressed",Extension,0x00004000,.zip
HKCR,.gz,"Content Type",0x00004000,application/x-gzip
HKCR,"MIME\Database\Content Type\application/x-gzip",Extension,0x00004000,.gz
HKCR,.z,"Content Type",0x00004000,application/x-compress
HKCR,"MIME\Database\Content Type\application/x-compress",Extension,0x00004000,.z
HKLM,"Software\Classes\CLSID\{00022602-0000-0000-C000-000000000046}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Classes\CLSID\{00022602-0000-0000-C000-000000000046}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Classes\CLSID\{00022603-0000-0000-C000-000000000046}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Classes\CLSID\{00022603-0000-0000-C000-000000000046}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Classes\CLSID\{00020C01-0000-0000-C000-000000000046}\Implemented Categories\{7DD95801-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Classes\CLSID\{00020C01-0000-0000-C000-000000000046}\Implemented Categories\{7DD95802-9882-11CF-9FA9-00AA006C42C4}",,0x00004002,
HKLM,"Software\Microsoft\Internet Explorer\EmbedExtnToClsidMappings\.dcr",,0x00004002,clsid:166B1BCA-3F9C-11CF-8075-444553540000
HKLM,"Software\Microsoft\Internet Explorer\EmbedExtnToClsidMappings\.dir",,0x00004002,clsid:166B1BCA-3F9C-11CF-8075-444553540000
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{00022601-0000-0000-C000-000000000046}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{00022602-0000-0000-C000-000000000046}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{00022603-0000-0000-C000-000000000046}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{0003000E-0000-0000-C000-000000000046}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{1141B704-053E-11D0-9DF0-00C04FD7BF41}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{183C259A-0480-11d1-87EA-00C04FC29D46}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{1fb464c8-09bb-4017-a2f5-eb742f04392f}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{29c13b62-b9f7-4cd3-8cef-0a58a1a99441}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{791fa017-2de3-492e-acc5-53c67a2b94d0}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361143-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361146-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361149-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{8136114B-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{8136114D-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{8136114F-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361152-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{81361155-FAF9-11D3-B0D3-00C04F612FF1}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{886E7BF0-C867-11CF-B1AE-00AA00A3F2C3}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{9088E688-063A-4806-A3DB-6522712FC061}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{931a8c29-3ea9-494d-91e7-22e9a9247687}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{99B42120-6EC7-11CF-A6C7-00AA00A47DD2}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{E87A6788-1D0F-4444-8898-1D25829B6755}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{69DEAF94-AF66-11D3-BEC0-00105AA9B6AE}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{D32C3BAD-5213-49BD-A7D5-E6DE6C0D8249}","Compatibility Flags",0x00014001,0x400
HKLM,"Software\Microsoft\Internet Explorer\ActiveX Compatibility\{4B106874-DD36-11D0-8B44-00A024DD9EFF}","Compatibility Flags",0x00014001,0x400

[wSweeper.AddReg]
HKLM,"Software\Microsoft\Windows NT\CurrentVersion\Winlogon",shell,0x00004000,Explorer.exe

[wTriedit.RegSvr]
16428,"Microsoft Shared\Triedit",dhtmled.ocx,1
16428,"Microsoft Shared\Triedit",triedit.dll,1

[wBase.AppDir.DelFiles]
mailnews.txt
README.TXT
BROWSEUI.DLL
IECONT.DLL
IECONTLC.DLL

[wBase.AppDir.CopyFile]
IEXPLORE.EXE,wIEXPLORE.EXE,,32
iedw.exe,wiedw.exe,,32
HMMAPI.DLL,wHMMAPI.DLL,,32

[wBase.SysDir.DelFiles]
secbasic.dll
urlcache.dll
vbs.dll
js.dll
htmlctl.ocx
shdisp.dll
hlinkprx.dll
shdocvw.bad

[DestinationDirs]
wMSInfo.CopyFile=16428,Microsoft Shared\MSInfo
wTriedit.CopyFile=16428,Microsoft Shared\Triedit
wBranding.CopyFile=16426,Internet Explorer\SIGNUP
wTextConverter.CopyFile=16428,Microsoft Shared\TextConv
wBase.AppDir.DelFiles=16426,Internet Explorer
wBase.AppDir.CopyFile=16426,Internet Explorer
wBase.SysDir.DelFiles=16425
