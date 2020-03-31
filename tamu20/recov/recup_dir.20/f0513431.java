
[Version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
layoutfile=LAYOUT.INF

















[StartMenu.ObjectsToDelete]
1,%intro%,%main%,0
1,%pifedit%,%main%,0
1,%control%,%main%,0
1,%winfile%,%main%,0
1,%cmd%,%main%,0
1,%setup%,%main%,0
1,%readme%,%main%,0
1,%ntbooks%,%main%,0
1,%cmdref%,%main%,0
1,%printman%,%main%,0
1,%clipbrd%,%main%,0
1,%terminal%,%accessories%,0
1,%mplayer%,%accessories%,0
1,%sndrec32%,%accessories%,0
1,%sndvol32%,%accessories%,0
1,%sndvol32old%,%accessories_multimedia%,0
1,%sndvol32old%,%accessories_multimedia%,1
1,%cdplayerold%,%accessories_multimedia%,0
1,%cdplayerold%,%accessories_multimedia%,1
1,%cdplayer%,%accessories%,0
1,%pbrush%,%accessories%,0
1,%printman%,%accessories%,0
1,%sync_manager%,%accessories%,0
1,%write%,%accessories%,0
1,%du_networking%,%accessories%,0
1,%network_and_dialup%,%accessories_communications%,1
1,%sol%,%prexp_accessories_games%,0
1,%winmine%,%prexp_accessories_games%,0
1,%freecell%,%prexp_accessories_games%,0
1,%pinball%,%prexp_accessories_games%,0
1,%hearts%,%prexp_accessories_games%,0
1,%spider%,%prexp_accessories_games%,0
1,%sol%,%prexp_accessories_games%,1
1,%winmine%,%prexp_accessories_games%,1
1,%freecell%,%prexp_accessories_games%,1
1,%pinball%,%prexp_accessories_games%,1
1,%hearts%,%prexp_accessories_games%,1
1,%spider%,%prexp_accessories_games%,1
1,%ihearts%,%prexp_accessories_games%,0
1,%ispades%,%prexp_accessories_games%,0
1,%ibackgammon%,%prexp_accessories_games%,0
1,%icheckers%,%prexp_accessories_games%,0
1,%ireversi%,%prexp_accessories_games%,0
1,%ihearts%,%prexp_accessories_games%,1
1,%ispades%,%prexp_accessories_games%,1
1,%ibackgammon%,%prexp_accessories_games%,1
1,%icheckers%,%prexp_accessories_games%,1
1,%ireversi%,%prexp_accessories_games%,1
1,%dcomcnfg%,%admintools%,1
1,%ntbooks%,,0
1,%dvdplay%,%accessories_entertainment%,1
1,%musrmgr%,%admintools%,0
1,%musrmgr%,%admintools%,1
1,%explorer%,"",0
1,%ciadmin%,%admintools%,1
1,%CHAREDIT%,%accessories%,0
1,%ntbackup%,%accessories%,0
1,%maint_wiz%,%systemtools%,1
1,%compatwizard%,%systemtools%,1
1,%compatwizard%,%accessories%,1
0,%accessories_multimedia%,"",0
0,%accessories_multimedia%,"",1
1,%cmd%,"",0
1,%tlntadmn%,%admintools%,1
1,%oldnetcon%,%accessories_communications%,1
1,%dialer%,%accessories_communications%,1





1,%windisk%,%admintools%,0
1,%perfmon%,%admintools%,0
1,%ntbackup%,%admintools%,0
1,%eventvwr%,%admintools%,0
1,%winmsd%,%admintools%,0
1,%rasadmin%,%admintools%,0







1,%windisk%,%admintools%,1
1,%perfmon%,%admintools%,1
1,%eventvwr%,%admintools%,1
1,%winmsd%,%admintools%,1
1,%rasadmin%,%admintools%,1
1,%eventvwr%,%nt4admintools%,1
1,%windisk%,%nt4admintools%,1
1,%ntbackup%,%nt4admintools%,1
1,%perfmon%,%nt4admintools%,1
1,%winmsd%,%nt4admintools%,1
1,%rasadmin%,%nt4admintools%,1
0,%nt4admintools%,"",0
1,%devmgmt%,%admintools%,1
1,%diskmgmt%,%admintools%,1
1,%svcmgmt%,%admintools%,1
1,%fsmgmt%,%admintools%,1
1,%ntbackup%,%admintools%,1
1,%ntwksvcmgmt%,%admintools%,1
1,%scheduled_tasks%,%admintools%,1
1,%charmap%,%accessories%,1
0,%prexp_accessories_games%,"",0
0,%prexp_accessories_games%,"",1
















[StartMenuItems]
%remote_assistance% = rcimlby.exe,"%%SYSTEMROOT%%\system32\rcimlby.exe -LaunchRA","%%SYSTEMROOT%%\system32\rcimlby.exe",,"@%systemroot%\system32\rcbdyctl.dll,-151","%systemroot%\system32\rcbdyctl.dll",152



















[StartMenuGroups]
Accessories = %accessories%,0,"%SystemRoot%\system32\shell32.dll",21761
Accessibility = %accessibility%,0,"%SystemRoot%\system32\shell32.dll",21760
Startup = %startup%,0,"%SystemRoot%\system32\shell32.dll",21787
StartupCommon = %startup%,1,"%SystemRoot%\system32\shell32.dll",21787
AdminTools = %admintools%,1,"%SystemRoot%\system32\shell32.dll",21762
Entertainment = %accessories_entertainment%,0,"%SystemRoot%\system32\shell32.dll",21772
StartMenuCommon = %startmenucommon%,0
SystemTools = %systemtools%,1,"%SystemRoot%\system32\shell32.dll",21788
Communications = %communications%,1,"%SystemRoot%\system32\shell32.dll",21768




































[AdminTools]
%compmgmt% = compmgmt.msc,"compmgmt.msc /s",mycomput.dll,2,"@%SystemRoot%\system32\shell32.dll,-22535","%SystemRoot%\system32\shell32.dll",22023
%neweventvwr% = eventvwr.msc,"eventvwr.msc /s",els.dll,0,"@%SystemRoot%\system32\shell32.dll,-22541","%SystemRoot%\system32\shell32.dll",22029
%sysmon% = perfmon.msc,"perfmon.msc /s",sysmon.ocx,0,"@%SystemRoot%\system32\shell32.dll,-22567","%SystemRoot%\system32\shell32.dll",22055
%datasrcodbc% = odbcad32.exe,odbcad32.exe,odbcad32.exe,0,"@%SystemRoot%\system32\shell32.dll,-22537","%SystemRoot%\system32\shell32.dll",22025
%locsecpol% = secpol.msc,"secpol.msc /s",wsecedit.dll,0,"@%SystemRoot%\system32\shell32.dll,-22552","%SystemRoot%\system32\shell32.dll",22040
%services% = services.msc,"services.msc /s",filemgmt.dll,0,"@%SystemRoot%\system32\shell32.dll,-22571","%SystemRoot%\system32\shell32.dll",22059


[Accessories]
%cmd% = cmd.exe,cmd.exe,cmd.exe,0,"@%SystemRoot%\system32\shell32.dll,-22534","%SystemRoot%\system32\shell32.dll",22022
%notepad% = notepad.exe,notepad.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22563","%SystemRoot%\system32\shell32.dll",22051
%synchronize% = mobsync.exe,mobsync.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22574","%SystemRoot%\system32\shell32.dll",22062
%windowstour% = tourstart.exe,tourstart.exe,,0,"@%SystemRoot%\system32\tourstart.exe,-2","%SystemRoot%\system32\tourstart.exe",1
%compatwizard% = ,"hcp://system/compatctr/compatmode.htm",compatUI.dll,0, "@%systemRoot%\system32\compatUI.dll,-117", "%SystemRoot%\system32\compatUI.dll", 115

[Entertainment]

[StartMenuCommon]
%windowsupdate% = wupdmgr.exe,wupdmgr.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22580"
%windowscatalog% = ,"http://go.microsoft.com/fwlink/?LinkId=374",moricons.dll,107,"@%SystemRoot%\system32\shell32.dll,-22587","%SystemRoot%\system32\shell32.dll",22075
%oobe_desc% = oobe\msoobe.exe,"%%SYSTEMROOT%%\system32\oobe\msoobe.exe /A",,0,"@%SystemRoot%\system32\oobe\msoobe.exe,-2001","%SystemRoot%\system32\oobe\msoobe.exe",2000
%configureprograms% = appwiz.cpl,"control.exe appwiz.cpl,,3",appwiz.cpl,-1504,"@%SystemRoot%\system32\appwiz.cpl,-131","%SystemRoot%\system32\appwiz.cpl",130

[Communications]
%FlashConfigWiz% = NetSetup.cpl,"rundll32 shell32.dll,Control_RunDLL NetSetup.cpl,@0,WNSW","%SystemRoot%\system32\xpsp2res.dll",-2026,"@%SystemRoot%\system32\xpsp2res.dll,-16202","%SystemRoot%\System32\xpsp2res.dll",16201


[SystemTools]
%ntbackup% = ntbackup.exe,ntbackup.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22530","%SystemRoot%\system32\shell32.dll",22018
%oobe_desc% = oobe\msoobe.exe,"%%SYSTEMROOT%%\system32\oobe\msoobe.exe /A",,0,"@%SystemRoot%\system32\oobe\msoobe.exe,-2001","%SystemRoot%\system32\oobe\msoobe.exe",2000
%migwiz_desc% = usmt\migwiz.exe,"%%SYSTEMROOT%%\system32\usmt\migwiz.exe",,0,"@%SystemRoot%\system32\usmt\migwiz.exe,-203","%SystemRoot%\system32\usmt\migwiz.exe",202

%seccenter% = wscui.cpl,"%SystemRoot%\system32\wscui.cpl","%SystemRoot%\system32\xpsp2res.dll",-6105,"@%SystemRoot%\system32\xpsp2res.dll,-6104","%SystemRoot%\System32\xpsp2res.dll",6103


[DEL_OOBE_ACTIVATE]
ProfileItems = OOBE_ACTIVATE

[OOBE_ACTIVATE]
Name=%oobe_desc%,0x0000002
SubDir=%startmenucommon%

[DEL_ACTIVATE]
ProfileItems = OOBE_ACTIVATE, OOBE_ACTIVATE2

[OOBE_ACTIVATE2]
Name=%oobe_desc%,0x0000002
SubDir=%systemtools%

[RESTORE_OOBE_ACTIVATE]
ProfileItems = RESTORE_OOBE_ACTIVATE_STARTMENU, RESTORE_OOBE_ACTIVATE_SYSTEMTOOLS

[RESTORE_OOBE_ACTIVATE_STARTMENU]
Name = %oobe_desc%
CmdLine = 11,,"%%SYSTEMROOT%%\system32\oobe\msoobe.exe /A"
SubDir = %startmenucommon%
InfoTip = "@%SystemRoot%\system32\oobe\msoobe.exe,-2001"
DisplayResource="%SystemRoot%\system32\oobe\msoobe.exe",2000


[RESTORE_OOBE_ACTIVATE_SYSTEMTOOLS]
Name = %oobe_desc%
CmdLine = 11,,"%%SYSTEMROOT%%\system32\oobe\msoobe.exe /A"
SubDir=%systemtools%
InfoTip = "@%SystemRoot%\system32\oobe\msoobe.exe,-2001"
DisplayResource="%SystemRoot%\system32\oobe\msoobe.exe",2000



[ProductCatalogsToInstall]
NT5INF.CAT, 1   
NT5.CAT



NTPRINT.CAT
NT5IIS.CAT

IMS.CAT




IASNT4.CAT
WOW64.CAT
WOWLANG.CAT
MSTSWEB.CAT 
OEMBIOS.CAT












[ProductCatalogsToUninstall]
ICH2USB.CAT
IEEXCEP.CAT     
OEEXCEP.CAT     
OE5EXCEP.CAT    
QFE.CAT
QFEB3.CAT
QFERC2.CAT
QFERC3.CAT
SP0.CAT
SP1.CAT
SP2.CAT
SP3.CAT
SP4.CAT
SP5.CAT
SP6.CAT
SP7.CAT
SP8.CAT
SP9.CAT
SP10.CAT
NT5PRTX.CAT
IE501SP.CAT



IDXWU.CAT
IDXDU.CAT



DX4.08.00.0400.10brz.CAT
DX4.08.00.0400.10chs.CAT
DX4.08.00.0400.10cht.CAT
DX4.08.00.0400.10cze.CAT
DX4.08.00.0400.10dut.CAT
DX4.08.00.0400.10eng.CAT
DX4.08.00.0400.10frn.CAT
DX4.08.00.0400.10ger.CAT
DX4.08.00.0400.10itn.CAT
DX4.08.00.0400.10jpn.CAT
DX4.08.00.0400.10kor.CAT
DX4.08.00.0400.10pol.CAT
DX4.08.00.0400.10rus.CAT
DX4.08.00.0400.10spa.CAT
DX4.08.00.0400.10swe.CAT
DX4.08.00.0400.10.CAT
DX4.08.00.0400.10D.CAT
DX4.08.00.0400.10engD.CAT
BDA4.08.00.0400.10.CAT
BDA4.08.00.0400.10D.CAT



DX4.08.00.0400.14brz.CAT
DX4.08.00.0400.14chs.CAT
DX4.08.00.0400.14cht.CAT
DX4.08.00.0400.14cze.CAT
DX4.08.00.0400.14dut.CAT
DX4.08.00.0400.14eng.CAT
DX4.08.00.0400.14frn.CAT
DX4.08.00.0400.14ger.CAT
DX4.08.00.0400.14itn.CAT
DX4.08.00.0400.14jpn.CAT
DX4.08.00.0400.14kor.CAT
DX4.08.00.0400.14pol.CAT
DX4.08.00.0400.14rus.CAT
DX4.08.00.0400.14spa.CAT
DX4.08.00.0400.14swe.CAT
DX4.08.00.0400.14.CAT
DX4.08.00.0400.14D.CAT
DX4.08.00.0400.14engD.CAT
BDA4.08.00.0400.14.CAT
BDA4.08.00.0400.14D.CAT



DXNT.CAT
DXBDA.CAT
DXXP.CAT


Q323172.CAT
Q326874.CAT
Q326877.CAT
Q326878.CAT
Q326881.CAT
Q326883.CAT
Q326885.CAT
Q326887.CAT
Q326948.CAT
Q326975.CAT
Q327184.CAT
Q327186.CAT
Q327188.CAT
Q327189.CAT
Q327190.CAT
Q327192.CAT
Q327301.CAT
Q327307.CAT
Q327308.CAT
Q327661.CAT
Q327783.CAT
Q327879.CAT
Q327880.CAT
Q328017.CAT


Q834511.CAT
Q841793.CAT
Q823353.CAT
Q820369.CAT
Q830921.CAT
Q837009.CAT
Q842546.CAT
Q321530.CAT
Q322929.CAT
Q327303.CAT
Q328389.CAT
Q328676.CAT
Q330994.CAT
Q331488.CAT
Q331923.CAT
Q811337.CAT
Q811865.CAT
Q813502.CAT
Q813848.CAT
Q814128.CAT
Q814456.CAT
Q817438.CAT
Q819540.CAT
Q820223.CAT
Q828133.CAT
Q843555.CAT
Q832227.CAT


DRM.CAT
SETUP_WM.CAT
WMDM.CAT
WMFSDK.CAT
WMP.CAT
OLDDRM.CAT
OLDSETUP_WM.CAT
OLDWMDM.CAT
OLDWMEXPACK.CAT
OLDWMFSDK.CAT
OLDWMP.CAT


322968_Win2k.CAT
322968_WinNTx.cat
324914_WinXPx.CAT
810016_WinNTx.CAT
810215_WinNTx.CAT
811046_WinXPx.CAT
812338_WinNTx.CAT
814047_Win2k.cat
814523_WinNTx.cat
815701_WinNTx.CAT
819592_WinNTx.cat
KB328514_Win2K.cat
KB328514_Win2Kx.cat
KB328514_WinXP.cat
KB328514_WinXPx.cat
KB330019_Win2K.CAT
KB330019_WinXPx.CAT
KB817518_Win2K.CAT
KB817518_Win2Kx.CAT
KB817518_WinXP.CAT
KB817518_WinXPx.CAT
KB818587.CAT
KB821415.CAT
KB822956.CAT
KB828422.CAT
KB832414_Win2K.CAT
KB832414_WinXPx.CAT
KB832483.CAT
KB834836_Win2K.cat
KB834836_Win2Kx.cat
KB834836_WinXP.cat
KB834836_WinXPx.cat
KB834905_Win2K.cat
KB834905_Win2Kx.cat
KB834905_WinXP.cat
KB834905_WinXPx.cat
KB835677_Win2K.cat
KB835677_Win2Kx.cat
KB835677_WinXP.cat
KB835677_WinXPx.cat
KB836799_Win2K.CAT
KB836799_Win2Kx.CAT
KB836799_WinXP.CAT
KB836799_WinXPx.CAT
KB836830_Win2K.cat
KB836830_Win2Kx.cat
KB836830_WinXP.cat
KB836830_WinXPx.cat
KB837311_Win2K.cat
KB837311_WinXP.cat
KB838405_Win2k.cat
KB838405_Win2kx.cat
KB838405_WinXP.cat
KB838405_WinXPx.cat
Kb838768.cat
KB838976_Win2K.cat
KB838976_Win2kx.cat
KB838976_WinXP.cat
KB838976_WinXPx.cat
Q1000002_WinNTx.cat
Q252475_WinNTx.cat
Q273791_Win2k.cat
Q274265_WinNTx.cat
Q277033_Win2k.cat
Q281646_Win2k.cat
Q283106_Win2k.cat
Q290907_Win2k.cat
Q291014_Win2k.cat
Q291545_Win2k.cat
Q292604_WinNTx.cat
Q295433_Win2k.cat
Q296771_Win2k.cat
q301199_win2k.cat
Q301497_Win2k.cat
Q301679_Win2k.CAT
Q304329_Win2k.CAT
Q305983_Win2k.cat
Q306803_Win2k.cat
Q308037_Win2k.cat
Q308262_Win2k.cat
Q311836_Win2k.cat
Q311836_WinXP.cat
Q312085_Win2k.cat
Q312085_WinNTx.cat
Q312495_Win2k.cat
Q312575_Win2k.cat
Q312575_WinNTx.cat
Q312994_Win2k.cat
Q313888_WinXP.cat
Q317059_Win2k.cat
Q317802_Win2k.cat
Q318820_Win2k.cat
Q319243_Win2k.cat
q319982_winntx.cat
Q319982-25_WinNTx.cat
Q319982-26_WinNTx.cat
Q320498_WinNTx.cat
Q320679_WinNTx.cat
Q320696_Win2k.CAT
Q320696_WinNTx.cat
Q320698_Win2k.CAT
Q320700_Win2k.CAT
Q321415_WinNTx.cat
Q321858_WinNTx.cat
Q321989_Win2k.CAT
Q321989_WinNTx.cat
Q322144_WinXP.cat
Q322149_WinNTx.cat
q322330_Win2k.CAT
Q322330_WinNTx.cat
Q322968_Win2k.cat
Q322968_Win2Kx.cat
Q322968_WinNTx.CAT
Q322968_WinXPx.cat
Q323055_WinXPx.cat
Q323263_WinNTx.cat
Q323264_WinNTx.cat
Q323266_WinNTx.cat
Q323696_WinXP.cat
Q324914_WinXPx.cat
Q325292_WinXPx.cat
Q325292_WinXPxold.cat
Q327142_WinXPx.cat
Q327749_WinNTx.cat
Q327964_WinNTx.cat
Q328514_Win2k.CAT
Q328514_Win2kx.CAT
q328514_winntx.cat
Q328514_WinXP.CAT
Q328514_WinXPx.CAT
Q328796_WinNTx.cat
q328797_winntx.cat
Q328797_WinXPx.cat
q329414_winntx.cat
Q329414-25_WinNTx.cat
Q329414-26_WinNTx.cat
Q329416_WinNTx.cat
Q329791_WinNTx.cat
Q330019_WinXPx.cat
Q330094_WinNTx.cat
Q331806_WinNTx.cat
Q331806_WinXPx.cat
q812554_winntx.cat
q815491_winxpx.CAT
Q815701_Win2Kx.cat
Q815701_WinXPx.cat
Q816441_WinNTx.cat
Q816442_WinNTx.cat
Q816516_WinNTx.cat
Q816550_WinNTx.cat
Q816550_WinXPx.cat
Q816649_WinXPx.cat
Q817518_WinNTx.cat
Q818493_Win2Kx.cat
Q818493_WinNTx.cat
Q818493_WinXPx.cat
Q818510_WinXPx.cat
Q818539_WinXPx.cat
Q819592_WinNTx.cat
Q821178_WinXPx.CAT
Q823109_WinNTx.cat
Q823317_Win2Kx.cat
Q823317_WinNTx.cat
Q823317_WinXPx.cat
Q823718_252_Win2K.cat
Q823718_252_Win2Kx.cat
Q823718_252_WinXP.cat
Q823718_252_WinXPx.cat
Q823718_253_Win2K.cat
Q823718_253_Win2Kx.cat
Q823718_253_WinXP.cat
Q823718_253_WinXPx.cat
Q823718_262_Win2K.cat
Q823718_262_Win2Kx.cat
Q823718_262_WinXP.cat
Q823718_262_WinXPx.cat
Q823718_270_Win2K.cat
Q823718_270_Win2Kx.cat
Q823718_270_WinXP.cat
Q823718_270_WinXPx.cat
Q823718_271_Win2K.cat
Q823718_271_Win2Kx.cat
Q823718_271_WinXP.cat
Q823718_271_WinXPx.cat
Q823718_MDAC_WinNTx.cat
Q823718_MDAC25SP2_WinNTx.cat
Q823718_MDAC25SP3_WinNTx.cat
Q823718_MDAC26SP2_WinNTx.cat
Q823718_MDAC27_WinNTx.cat
Q823718_MDAC27_WinXPx.cat
Q823718_MDAC27SP1_WinNTx.cat
Q823718_MDAC27SP1_WinXPx.cat
Q823718-252_WinNT.cat
Q823718-252_WinNTx.cat
Q823718-253_WinNT.cat
Q823718-253_WinNTx.cat
Q823718-262_WinNT.cat
Q823718-262_WinNTx.cat
Q823718-270_WinNT.cat
Q823718-270_WinNTs.cat
Q823718-270_WinNTx.cat
Q823718-270_WinXPx.cat
Q823718-271_WinNT.cat
Q823718-271_WinNTs.cat
Q823718-271_WinNTx.cat
Q823718-271_WinXPx.cat
Q824902_WinNTx.cat
Q824902_WinXPx.cat
Q825044_WinNTx.cat
Q825044_WinXPx.cat
Q826231_Win2K.CAT
Q826231_WinXPx.CAT
Q826770_Win2K.cat
Q826770_WinXPx.cat
Q826776_WinNTx.cat
Q826776_WinXPx.cat
Q827097_WinNTx.cat
Q827097_WinXPx.cat
Q827166_WinXPx.CAT
Q827257_WinXPx.CAT
Q827509_WinNTx.cat
Q827509_WinXPx.cat
Q830497_Win2Kx.cat
Q830497_WinXPx.cat
Q831110_Win2K.cat
Q831110_WinXP.cat
Q831715_Win2K.cat
Q831715_WinXP.cat
Q831801_Win2K.cat
Q831801_WinXP.cat
Q831832_Win2Kx.cat
Q831832_WinXPx.cat
Q832414_Win2K.CAT
Q832414_WinXPx.CAT
Q832483_252_Win2K.cat
Q832483_252_Win2Kx.cat
Q832483_252_WinXP.cat
Q832483_252_WinXPx.cat
Q832483_253_Win2K.cat
Q832483_253_Win2Kx.cat
Q832483_253_WinXP.cat
Q832483_253_WinXPx.cat
Q832483_262_Win2K.cat
Q832483_262_Win2Kx.cat
Q832483_262_WinXP.cat
Q832483_262_WinXPx.cat
Q832483_270_Win2K.cat
Q832483_270_Win2Kx.cat
Q832483_270_WinXP.cat
Q832483_270_WinXPx.cat
Q832483_271_Win2K.cat
Q832483_271_Win2Kx.cat
Q832483_271_WinXP.cat
Q832483_271_WinXPx.cat
Q832483_280_Win2K.cat
Q832483_280_WinXP.cat
Q832921_Win2Kx.cat
Q832921_WinXPx.cat
Q833368_Win2Kx.cat
Q833368_WinXPx.cat
Q834396_Win2K.CAT
Q834396_WinXPx.CAT


kb835221w2k.cat
kb835221srv2k3.cat
kb888111w2k.cat
kb888111srv2k3.cat


,WindowsUpdateCatalog       
,SPLevel                    


[OsComponentPackagesToRemove]
{89820200-ECBD-11cf-8B85-00AA005B4383}=0x00060000   
{44BBA840-CC51-11CF-AAFA-00AA00B6015C}=0x00060000   
{0E7420B5-D964-400C-8AC0-60537B2D0832}=0x00020052   
{97F5A9DB-8CA2-496b-9847-9C1DF6D93701}=0x00020052   
{12F1D3F6-5371-4962-8B9E-41AC0668F2C1}=0x00020052   
{5DC6714D-359A-4BBE-A62E-38E86902C81A}=0x00020052   
{1D099D24-8FDF-46DD-9EA3-31D6E9A73E9F}=0x00020052   
{A2F3B5A7-2D39-4A4E-96E6-BFADEBCBB27B}=0x00020052   
{B15C73EE-0AD0-41C2-BC15-D0A623F0078C}=0x00020052   
{BA63DE4B-CAD8-49C5-A3F2-E976BEB019C8}=0x00020052   
{E9A84D17-E5C1-4890-A557-4460207F6AAF}=0x00020052   
{F1CAE27D-85D3-4642-B9E9-48D7F9F56C82}=0x00020052   
{C53A407B-397A-4EEC-812F-E951673CDE7F}=0x00020052   
{CEB436C4-6F1A-11D2-BA10-00A0C9CCA9A1}=0x00050014   
{CEB43705-6F1A-11D2-BA10-00A0C9CCA9A1}=0x00050014   
{4F645220-306D-11D2-995D-00C04F98BBC9}=0x00050006   
{8621B4C0-C35B-4f46-89EB-529E75F501EA}=0x00010003   
{2E742517-5D48-4DBD-BF93-48FDCF36E634}=0x00020000   
{DCB666AB-5541-44CA-9F7E-B516DF807CAF}=0x00050001   
{BA840A40-FE9C-49A6-B5DA-18EEEF49B9A7}=0x00050000   
{B3C1B200-8F14-4c49-96D3-67425AD59914}=0x00090000   
{44BBA855-CC51-11CF-AAFA-00AA00B6015C}=0x00040009   
{AA936DF4-2B08-4B1F-B071-72192E287704}=0x00040009   
{89FDAB62-6F46-4c7e-A559-E00B9A0BACB6}=0x00090000   




[DeviceInfsToInstall]
1394.inf
61883.inf
avc.inf
battery.inf
bth.inf
biomtric.inf
cdrom.inf
cpu.inf
enum1394.inf
flash.inf
disk.inf
display.inf
dot4.inf
dot4prt.inf
fdc.inf
flpydisk.inf
genprint.inf
hal.inf
input.inf
keyboard.inf
legcydrv.inf
machine.inf
mchgr.inf
mdmsetup.inf
mf.inf
monitor.inf
mshdc.inf
msmouse.inf
msports.inf
multiprt.inf
netclass.inf
netirsir.inf
ntprint.inf
pcmcia.inf
pnpscsi.inf
sbp2.inf
smartcrd.inf
sslaccel.inf
sti.inf
tape.inf
usb.inf
wdmaudio.inf
volume.inf
volsnap.inf
wceusbsh.inf





[DeviceInfsToInstallIfExists]








[DetectionOrder]
{4D36E968-E325-11CE-BFC1-08002BE10318}      
{4D36E972-E325-11CE-BFC1-08002BE10318}      











[NonBatchedDetection]
{4D36E96D-E325-11CE-BFC1-08002BE10318}      

[InstalledDevicesToSkip]


[Files.Install.CleanInstall]
CopyFiles=Files.System, \
          Files.System.CopyAlways, \
          Files.NoWin31.System32ToSysroot, \
          Files.NoWin31.System32ToSystem

[Files.Install.CleanInstall.Win31]
CopyFiles=Files.System, \
          Files.System.CopyAlways


[Files.Install.Upgrade]
CopyFiles=Files.System.CopyAlways, \
          Files.NoWin31.System32ToSysroot, \
          Files.NoWin31.System32ToSystem

[Files.Install.Upgrade.Win31]
CopyFiles=Files.System.CopyAlways


[DestinationDirs]
Files.System = 11
Files.System.CopyAlways = 11
Files.NoWin31.System32ToSysroot = 10
Files.NoWin31.System32ToSystem = 50
Dialer.DelFiles = 16422 ,%Dialer_DIR%

[Files.NoWin31.System32ToSysroot]
NOTEPAD.EXE

[Files.NoWin31.System32ToSystem]




[Files.System]




[Files.System.CopyAlways]




[Files.MarkReadOnly]
perfmon.msc




[RegistryInfs]





[Infs.Always]
wsh.inf,DefaultInstall
ie.inf,DefaultInstall
secdrv.inf,DefaultInstall
cdac15ba.inf,DefaultInstall
cdad10ba.inf,DefaultInstall
mdac.inf,DefaultInstall
icwnt5.inf,DefaultInstall
mstask.inf,DefaultInstall.NT
msoe50.inf,DefaultInstall
wab50.inf,DefaultInstall
tshoot.inf,DefaultInstall
dfrg.inf,DefaultInstall
msinfo32.inf,DefaultInstall
axant5.inf,DefaultInstall

mplayer2.inf,InstallWMP64

sr.inf,DefaultInstall
fltmgr.inf,DefaultInstall
icminst.inf,DefaultInstall
apcompat.inf,DefaultInstall
shell.inf,DefaultInstall
shl_img.inf,DefaultInstall
netupnph.inf,DefaultInstall
devxprop.inf,DefaultInstall
syssetup.inf,SpecialInstall
pchealth.inf,DefaultInstall
oobe.inf,DefaultInstall
sapi5.inf,DefaultInstall
moviemk.inf,DefaultInstall
qmgr.inf,DefaultInstall
au.inf,DefaultInstall

drm.inf,InstallDRM
wmdm.inf,InstallWMDM
wmfsdk.inf,InstallWMFSDK
wmp.inf,InstallWMP7
wpd.inf,InstallWPD
mymusic.inf,InstallWMPlaylist
skins.inf,InstallSkins

syssetup.inf,WMPFeature
swflash.inf,DefaultInstall
is_wow64.inf,DefaultInstall
vgx.inf,DefaultInstall
srchasst.inf,DefaultInstall
netfw.inf,DefaultInstall
bthpan.inf,DefaultInstall

[ServicesToRename]
OLE = RpcSs

[RegistrationPhase1]
RegisterDlls=EarlyOleControlDlls

[RegistrationPhase2]
RegisterDlls=OleControlDlls

[RegistrationCrypto]
RegisterDlls=CryptoDlls

[CryptoDlls]
11,,rsaenh.dll,1
11,,dssenh.dll,1
11,,initpki.dll,1,600


[EarlyOleControlDlls]
11,,atl.dll,1
11,,txflog.dll,1
11,,netcfgx.dll,1
11,,netman.dll,1
11,,netshell.dll,1
11,,odbcconf.dll,1
11,,msiexec.exe,,,"/regserver /q"
11,,Lodctr.exe,,,"/c:perfd009.dat /h:perfi009.dat /l:009"
11,,msctf.dll,1


[OleControlDlls]








11,,ole32.dll,1
11,,dxdiagn.dll,1
11,,mfc42.dll,1
11,,mfc42u.dll,1
11,,oleaut32.dll,1
11,,oleacc.dll,1
11,,comcat.dll,1
11,,sxs.dll,2
11,,w32time.dll,1
11,setup,fxsocm.dll,1
11,,shell32.dll,3
11,,comctl32.dll,2
11,,autodisc.dll,1

11,,shmedia.dll,1

11,,themeui.dll,3
11,,wininet.dll,2
11,,hlink.dll,1
11,,browseui.dll,3
11,,shdocvw.dll,3,600
11,,msaatext.dll,1
11,,mshtml.dll,3
11,,mshtmled.dll,1
11,,msrating.dll,1
11,,mstime.dll,1
11,,sendmail.dll,1
11,,urlmon.dll,3
11,,inetcpl.cpl,2
11,,licmgr10.dll,1
11,,inseng.dll,1
11,,asctrls.ocx,1
11,,actxprxy.dll,1
11,,plugin.ocx,1
11,,hhctrl.ocx,1
11,,itircl.dll,1
11,,itss.dll,1
11,,shgina.dll,3
11,,occache.dll,3
11,,webcheck.dll,1
11,,mlang.dll,1
11,,imgutil.dll,1
11,,pngfilt.dll,1
11,,appwiz.cpl,3
11,,shimgvw.dll,1
11,,shsvcs.dll,3
11,,netplwiz.dll,1
11,,hnetwiz.dll,1
11,,imapi.exe,,,"/regserver"
16425,,instnm.exe,,,"%17%\msnetmtg.inf"
11,,zipfldr.dll,1
11,,nusrmgr.cpl,3
11,,cdfview.dll,1
11,,extmgr.dll,1
11,,cryptdlg.dll,1
11,,twext.dll,1
11,,webvw.dll,1,120
11,,msieftp.dll,1
11,,docprop2.dll,1
11,,iepeers.dll,1
11,,corpol.dll,1
11,,digest.dll,2
11,,iesetup.dll,2
11,,msident.dll,1
11,,msxs64.dll,1
11,,msxml3.dll,1
11,,shmgrate.exe,,,"OCInstallFixup"
11,,jscript.dll,1
11,,vbscript.dll,1
11,,scrrun.dll,1
11,,dispex.dll,1
11,,scrobj.dll,1
11,,dsquery.dll,1
11,,dsuiext.dll,1
11,,dsprop.dll,1
11,,hotplug.dll,1
11,,mmcndmgr.dll,1
11,,dmocx.dll,1
11,,gpedit.dll,1
11,,wmiscmgr.dll,1
11,,gptext.dll,1
11,,appmgr.dll,1
11,,fde.dll,1
11,,els.dll,1
11,,filemgmt.dll,1
11,,mycomput.dll,1
11,,devmgr.dll,1
11,,wshcon.dll,1
11,,wshext.dll,1
11,,wshom.ocx,1
11,,tdc.ocx,1
11,,devenum.dll,1
11,,quartz.dll,1
11,,qdvd.dll,1
11,,qdv.dll,1
11,,qcap.dll,1
11,,amstream.dll,1
11,,qedit.dll,1
11,,qasf.dll,1




11,,mpg2splt.ax,1
11,,encapi.dll,1



11,,wmpshell.dll,1


25,%SRCHASST%,srchui.dll,2
11,,g711codc.ax,1
11,,tapi3.dll,1
11,,termmgr.dll,1
11,,rend.dll,1
11,,sdpblb.dll,1
11,wbem,wbemperf.dll,1
11,,dgnet.dll,1
11,,hnetcfg.dll,1,1800
11,,mydocs.dll,1
11,,cscui.dll,1
11,,oleprn.dll,1
11,,bidispl.dll,1

11,,diactfrm.dll,1
11,,dinput8.dll,1
11,,danim.dll,1
11,,datime.dll,1
11,,ddrawex.dll,1
11,,daxctle.ocx,1
11,,lmrt.dll,1
11,,dskquota.dll,1
11,,dskquoui.dll,1
11,,rpcrt4.dll,1
11,,polstore.dll,1
10,msagent64,agentctl.dll,1
10,msagent64,agentdp2.dll,1
10,msagent64,agentdpv.dll,1
10,msagent64,agentmpx.dll,1
10,msagent64,mslwvtts.dll,1
10,msagent64,agtintl.dll,1
10,msagent64,agentsr.dll,1
10,msagent64,agentpsh.dll,1
10,srchasst\x86,srchui.dll,2
11,,dfrgsnap.dll,1
11,,dfrgui.dll,1
11,,dfrgifps.dll,1
11,,dfrgifc.exe,,,"/RegServer"
11,,snmpsnap.dll,1
11,,localsec.dll,1
11,,wavemsp.dll,1
11,,wsecedit.dll,1
11,,cic.dll,1
11,,sysmon.ocx,1
11,,certcli.dll,1
10,PCHealth\HelpCtr\Binaries,HelpSvc.exe,,300,"/install2 /svchost netsvcs /regserver /RAInstall"
10,PCHealth\HelpCtr\Binaries,HelpHost.exe,,,"/regserver"
10,PCHealth\HelpCtr\Binaries,HelpCtr.exe,,,"/regserver"
10,PCHealth\HelpCtr\Binaries,brpinfo.dll,1
11,,rcImLby.exe,,,"-regserver"
10,PCHealth\HelpCtr\Binaries,msinfo.dll,1
10,PCHealth\UploadLB\Binaries,UploadM.exe,,,"/svchost netsvcs /regserver"
11,,tlntsvr.exe,,,"/Service"
11,,compatui.dll,1
11,,dsdmo.dll,1
11,,dsdmoprp.dll,1
11,,certmgr.dll,1
11,,regwizc.dll,1
11,,smlogcfg.dll,1
11,,ipsmsnap.dll,1
11,,mdhcp.dll,1
11,,wlanmon.dll,1
11,,wlsnp.dll,1
11,,scriptpw.dll,1
11,,regsvr32.exe,,,"/s %11%\cmdlib.wsc"
11,,scrptutl.dll,1
11,wbem,CmdEvTgProv.dll,1
11,,iassvcs.dll,1
11,,iasacct.dll,1
11,,iasads.dll,1
11,,iashlpr.dll,1
11,,iasnap.dll,1
11,,iaspolcy.dll,1
11,,iasrad.dll,1
11,,iassam.dll,1
11,,iassdo.dll,1
11,,dfsshlex.dll,1
11,,seclogon.dll,1
11,,sclgntfy.dll,1

18,,tshoot.dll,1
18,,sniffpol.dll,1
18,,sstub.dll,1
11,,gpkcsp.dll,1
11,,sccbase.dll,1
11,,slbcsp.dll,1
11,,slbiop.dll,1
11,,scredir.dll,1
11,,rastls.dll,1
11,,raschap.dll,1
11,,rcbdyctl.dll,1
11,,cdosys.dll,1
11,,dataclen.dll,1
11,,dxtrans.dll,1
11,,dxtmsft.dll,1
11,,objsel.dll,1
11,,confmsp.dll,1
11,,h323msp.dll,1
11,,fdeploy.dll,1
11,,stobject.dll,1
11,,scripto.dll,1
11,,inetcfg.dll,1
11,,tlntsvrp.dll,1

11,,netsetup.cpl,3

11,,fontext.dll,1
11,,activeds.dll,1
11,,ieaksie.dll,1
11,,iedkcs32.dll,1
11,,vbisurf.ax,1
11,,msvidctl.dll,1


11,,userenv.dll,3,1200
11,,scecli.dll,1,900
11,,msisip.dll,1
16427,%MShared%\MSInfo,ieinfo5.ocx,1,300
11,,wiaservc.dll,1
11,,sti.dll,1
11,,wiascr.dll,1
11,,wiadefui.dll,1
11,,wiashext.dll,1
11,,camocx.dll,1
11,,wiavusd.dll,1
11,,wiasf.ax ,1
11,,wiavideo.dll,1
11,,photowiz.dll,1
11,,licdll.dll,1
11,,mmcshext.dll,1
11,,cabview.dll,1
11,,vssvc.exe,,,"/Register"
11,,eventcls.dll,2,600
11,,swprv.dll,2,600
11,,vss_ps.dll,1
11,wbem,vdswmi.dll,1
11,wbem,vsswmi.dll,1
11,,credui.dll,1
11,,ntvdm64.dll,2
11,,azroles.dll,1
11,,azroleui.dll,1
11,,rsfsaps.dll,1
11,,rsnotify.exe,,,"/regserver"
11,,ntmsevt.dll,1
11,,ntmsmgr.dll,1
11,,ntmssvc.dll,1
11,,rsmps.dll,1
11,,rsmmllsv.exe,,,"/RegServer"
11,,rsmsink.exe,,,"/RegServer"
11,,rsmui.exe,,,"/RegServer"
11,,msctfp.dll,1
11,,msutb.dll,1
11,,msimtf.dll,1
16425,,msctf.dll,1
10,ime,mscandui.dll,1
10,ime,sptip.dll,1
10,ime,softkbd.dll,1
10,ime (x86),mscandui.dll,1
10,ime (x86),sptip.dll,1
10,ime (x86),softkbd.dll,1


11,,dpnet.dll,1
11,,dpnhpast.dll,1
11,,dpnhupnp.dll,1
11,,dpvoice.dll,1
11,,dpvvox.dll,1
11,,dpvacm.dll,1

11,,rundll32.exe,,,"modemui.dll,CountryRunOnce"

11,"wbem",mofcomp.exe,,,"%systemroot%\system32\wbem\wscenter.mof"

11,,pdh.dll,2

11,,smbinst.exe,,,"%systemroot%\inf\machine.inf"









[SpecialInstall]
AddReg = IAS.AddReg
DelFiles = Dialer.DelFiles


[Dialer.DelFiles]
dialer.exe



[IAS.AddReg]
HKCR,"Wow6432Node\CLSID\{6BC09692-0CE6-11D1-BAAE-00C04FC2E20D}\InprocServer32","",0x00020000,"%SystemRoot%\SysWOW64\iasrecst.dll"
HKCR,"Wow6432Node\CLSID\{6BC09693-0CE6-11D1-BAAE-00C04FC2E20D}\InprocServer32","",0x00020000,"%SystemRoot%\SysWOW64\iasrecst.dll"
HKCR,"Wow6432Node\CLSID\{6BC096C4-0CE6-11D1-BAAE-00C04FC2E20D}\InprocServer32","",0x00020000,"%SystemRoot%\SysWOW64\iasrecst.dll"

[WMPFeature]
AddReg = WMPFeature.AddReg

[WMPFeature.AddReg]

HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Setup\WindowsFeatures","Windows Media Player",0x00010001,1




[AssemblyDirectories]
asms
\i386\asms
\i386\wasms


[Accessibility]
%magnifier% = magnify.exe,magnify.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22553","%SystemRoot%\system32\shell32.dll",22041
%reader%    = narrator.exe,narrator.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22560","%SystemRoot%\system32\shell32.dll",22048
%screenkeyboard% = osk.exe,osk.exe,,0,"@%SystemRoot%\system32\shell32.dll,-22564","%SystemRoot%\system32\shell32.dll",22052
%utilman% = utilman.exe,"utilman.exe /start",,0,"@%SystemRoot%\system32\shell32.dll,-22577","%SystemRoot%\system32\shell32.dll",22065
[Infs.Always]
[OleControlDlls]
[Strings]



main = "Main"
games = "Games"
accessories = "Accessories"
accessories_entertainment = "Accessories\Entertainment"
accessories_communications = "Accessories\Communications"
prexp_accessories_games = "Accessories\Games"
accessories_multimedia = "Accessories\Multimedia"
accessibility = "Accessories\Accessibility"
systemtools = "Accessories\System Tools"
communications = "Accessories\Communications"
startup = "Startup"
admintools = "Administrative Tools"
nt4admintools = "NT 4.0 Administrative Tools"
startmenucommon = "::0x0016::"



old_srv_config = "Administrative Tools Home Page"
srv_config = "Configure Your Server"
srv_manage = "Manage Your Server"
srvwiz_infotip = "Sets up and configures Windows services for your network."
windowsupdate = "Windows Update"
windowscatalog = "Windows Catalog"
configureprograms = "Set Program Access and Defaults"
windowstour = "Tour Windows XP"
synchronize = "Synchronize"
sync_manager = "Synchronization Manager"
winfile = "File Manager"
control = "Control Panel"
printman = "Print Manager"
clipbrd = "ClipBook Viewer"
dialer = "Phone Dialer"
cmd = "Command Prompt"
explorer = "Windows NT Explorer"
setup = "Windows NT Setup"
pifedit = "PIF Editor"
intro = "Introducing Windows NT"
readme = "Read Me"
ntbooks = "Books Online"
cmdref = "Windows NT Help"
windisk = "Disk Administrator"
perfmon = "Performance Monitor"
ntbackup = "Backup"
compatwizard = "Program Compatibility Wizard"
migwiz_desc = "Files and Settings Transfer Wizard"
eventvwr = "Event Viewer"
dcomcnfg = "DCOM Configuration"
winmsd = "Windows NT Diagnostics"
musrmgr = "User Manager"
pbrush = "Paintbrush"
paint = "Paint"
winchat = "Chat"
terminal = "Terminal"
charedit = "Private Character Editor"
notepad = "Notepad"
cardfile = "Cardfile"
calc = "Calculator"
clock = "Clock"
charmap = "Character Map"
mplayer = "Media Player"
sndrec32 = "Sound Recorder"
sndvol32 = "Volume Control"
sndvol32old = "Volume Control"
cdplayer = "CD Player"
cdplayerold = "CD Player"
write = "Write"
packgr32 = "Object Packager"
hyperterm = "HyperTerminal"
sol = "Solitaire"
winmine = "Minesweeper"
freecell = "Freecell"
hearts = "Hearts"
spider = "Spider Solitaire"
pinball = "Pinball"
magnifier   = "Magnifier"
ihearts = "Internet Hearts"
ispades = "Internet Spades"
ibackgammon = "Internet Backgammon"
icheckers = "Internet Checkers"
ireversi = "Internet Reversi"
reader      = "Narrator"
screenkeyboard = "On-Screen Keyboard"
utilman = "Utility Manager"
certmgr = "Certificate Manager"
rasadmin = "Remote Access Admin"
du_networking = "Dial-Up Networking"
network_and_dialup = "Network and Dial-up Connections"
admin_wiz = "Administrative Wizards"
compmgmt = "Computer Management"
fsmgmt = "File Service Management"
neweventvwr = "Event Viewer"
devmgmt = "Device Management"
svcmgmt = "System Service Management"
sysmon = "Performance"
diskmgmt = "Disk Management"
ciadmin = "Index Server Management"
mediasvc = "Removable Storage Management"
datasrcodbc = "Data Sources (ODBC)"
datasrcodbcx86 = "Data Sources (ODBC) (x86)"
scheduled_tasks = "Scheduled Tasks"
maint_wiz = "Maintenance Wizard"
locsecpol = "Local Security Policy"
services = "Services"
tlntadmn = "Telnet Server Administration"
oobe_desc   = "Activate Windows"
oldnetcon = "Network and Dial-up Connections"
remote_assistance = "Remote Assistance"
seccenter = "Security Center"
FlashConfigWiz = "Wireless Network Setup Wizard"
oobe_infotip = "Activate Windows with Microsoft"
charedit_infotip = "Use Character Editor to modify how a character is shown on the screen."
cmd_infotip = "Performs text-based (command-line) functions."
compmgmt_infotip = "Manages disks and provides access to other tools to manage local and remote computers."
magnifier_infotip = "Enlarges selected text and other on-screen items for easier viewing."
neweventvwr_infotip = "Displays monitoring and troubleshooting messages from Windows and other programs."
notepad_infotip = "Creates and edits text files using basic text formatting."
ntbackup_infotip = "Archives data to protect it from accidental loss."
reader_infotip = "Reads on-screen text, dialog boxes, menus, and buttons aloud if speakers or a sound output device is installed."
remote_assistance_infotip = "Lets you invite a friend to connect to your computer and help you with problems."
screenkeyboard_infotip = "Displays a keyboard that is controlled by a mouse or switch input device."
synchronize_infotip = "Updates the network copy of materials that were edited offline, such as documents, calendars, and e-mail messages."
utilman_infotip = "Starts and configures accessibility tools from one window."
windowsupdate_infotip = "Updates your system with new Windows features, device drivers, and system updates available from Microsoft."
sysmon_infotip = "Displays graphs of system performance and configures data logs and alerts."
datasrcodbc_infotip = "Adds, removes, and configures Open Database Connectivity (ODBC) data sources and drivers."
licmanager_infotip = "Manages client access licensing for a server product."
dfsmgr_infotip = "Creates and manages distributed file systems that connect shared folders from different computers."
locsecpol_infotip = "Views and modifies local security policy, such as user rights and audit policies."
services_infotip = "Starts and stops services."
tlntadmn_infotip = "View and modify telnet server settings and connections."
compatwizard_infotip = "Get older programs to work on Windows XP"
ProgramF    = "Program Files"
SharedTools = "Common Files\Microsoft Shared"
MShared     = "Microsoft Shared"
MSIE4       = "Internet Explorer"
MP2         = "Windows Media Player"
DisplayName = "Vector Graphics Rendering (VML)"
SRCHASST    = "srchasst"
Dialer_DIR  = "Windows NT"


[OleControlDlls] 
16425,,ntvdm64.dll,2
16425,,upnp.dll,1
16425,,upnphost.dll,1
16425,,upnpcont.exe,,,"/regserver"
16425,,dxdiagn.dll,1
































16425,,ole32.dll,1
16425,,dxdiagn.dll,1
16425,,mfc42.dll,1
16425,,mfc42u.dll,1
16425,,oleaut32.dll,1
16425,,oleacc.dll,1
16425,,comcat.dll,1
16425,,sxs.dll,2
16425,,msvbvm60.dll,1
16425,,shell32.dll,3
16425,,comctl32.dll,2
16425,,autodisc.dll,1
16425,,shmedia.dll,1
16425,,themeui.dll,3
16425,,wininet.dll,2
16425,,hlink.dll,1
16425,,browseui.dll,3
16425,,browsewm.dll,1
16425,,shdocvw.dll,3,600
16425,,msaatext.dll,1
16425,,mshtml.dll,3
16425,,mshtmled.dll,1
16425,,csseqchk.dll,1
16425,,msrating.dll,1
16425,,mstime.dll,1
16425,,sendmail.dll,1
16425,,urlmon.dll,3
16425,,inetcpl.cpl,2
16425,,licmgr10.dll,1
16425,,inseng.dll,1
16425,,asctrls.ocx,1
16425,,actxprxy.dll,1
16425,,plugin.ocx,1
16425,,hhctrl.ocx,1
16425,,itircl.dll,1
16425,,itss.dll,1
16425,,shgina.dll,3
16425,,occache.dll,3
16425,,webcheck.dll,1
16425,,mlang.dll,1
16425,,imgutil.dll,1
16425,,pngfilt.dll,1
16425,,appwiz.cpl,3
16425,,shimgvw.dll,1
16425,,shsvcs.dll,3
16425,,netplwiz.dll,1
16425,,zipfldr.dll,1
16425,,msxml.dll,1
16425,,nusrmgr.cpl,3
16425,,cdfview.dll,1
16425,,extmgr.dll,1
16425,,cryptdlg.dll,1
16425,,twext.dll,1
16425,,webvw.dll,1,120
16425,,msieftp.dll,1
16425,,docprop2.dll,1
16425,,iepeers.dll,1
16425,,corpol.dll,1
16425,,digest.dll,2
16425,,iesetup.dll,2
16425,,msident.dll,1
16425,,msjet40.dll,1
16425,,msjtes40.dll,1
16425,,msorcl32.dll,1
16425,,msrd3x40.dll,1
16425,,msjetoledb40.dll,1
16425,,msexch40.dll,1
16425,,msexcl40.dll,1
16425,,msltus40.dll,1
16425,,mspbde40.dll,1
16425,,msrclr40.dll,1
16425,,msrd2x40.dll,1
16425,,mstext40.dll,1
16425,,msxbde40.dll,1
16425,,msxml2.dll,1
16425,,msxml3.dll,1
16425,,shmgrate.exe,,,OCInstallFixup
16425,,jscript.dll,1
16425,,vbscript.dll,1
16425,,scrrun.dll,1
16425,,dispex.dll,1
16425,,scrobj.dll,1
16425,,msscript.ocx,1
16425,,dsquery.dll,1
16425,,dsuiext.dll,1
16425,,dsprop.dll,1
16425,,mmcndmgr.dll,1
16425,,dmocx.dll,1
16425,,gpedit.dll,1
16425,,wmiscmgr.dll,1
16425,,gptext.dll,1
16425,,appmgr.dll,1
16425,,fde.dll,1
16425,,els.dll,1
16425,,filemgmt.dll,1
16425,,mycomput.dll,1
16425,,wshcon.dll,1
16425,,wshext.dll,1
16425,,wshom.ocx,1
16425,,tdc.ocx,1
16425,,msr2c.dll,1
16425,,devenum.dll,1
16425,,quartz.dll,1
16425,,qdvd.dll,1
16425,,qdv.dll,1
16425,,qcap.dll,1
16425,,amstream.dll,1
16425,,qedit.dll,1
16425,,qasf.dll,1
16425,,drmstor.dll,1
16425,,drmclien.dll,1
16425,,drmv2clt.dll,1
16425,,blackbox.dll,1
16425,,msnetobj.dll,1
16425,,dxmasf.dll,1
16425,,ir41_32.ax,1
16425,,ir50_32.dll,1
16425,,acelpdec.ax,1
16425,,l3codecx.ax,1
16425,,l3codeca.acm,1
16425,,mpg4ds32.ax,1
16425,,msadds32.ax,1
16425,,mpg2splt.ax,1
16425,,encapi.dll,1
16426,Movie Maker,wmm2ae.dll,1
16426,Movie Maker,wmm2ext.dll,1
16426,Movie Maker,wmm2filt.dll,1
16426,Movie Maker,wmm2fxa.dll,1
16426,Movie Maker,wmm2fxb.dll,1
16425,,wmpshell.dll,1
16425,,g711codc.ax,1
16425,,tapi3.dll,1
16425,,termmgr.dll,1
16425,,rend.dll,1
16425,,sdpblb.dll,1
16425,,rtcshare.exe,,,/regserver
16425,wbem,wbemperf.dll,1
16425,,dgnet.dll,1
16425,,hnetcfg.dll,1,1800
16425,,mydocs.dll,1
16425,,cscui.dll,1
16425,,oleprn.dll,1
16425,,bidispl.dll,1
16425,,diactfrm.dll,1
16425,,dinput8.dll,1
16425,,danim.dll,1
16425,,datime.dll,1
16425,,ddrawex.dll,1
16425,,daxctle.ocx,1
16425,,proctexe.ocx,1
16425,,lmrt.dll,1
16425,,dskquota.dll,1
16425,,dskquoui.dll,1
16425,,rpcrt4.dll,1
16425,,polstore.dll,1
10,msagent,agentctl.dll,1
10,msagent,agentdp2.dll,1
10,msagent,agentdpv.dll,1
10,msagent,agentmpx.dll,1
10,msagent,mslwvtts.dll,1
10,msagent,agtintl.dll,1
10,msagent,agentsr.dll,1
10,msagent,agentpsh.dll,1
16425,,snmpsnap.dll,1
16425,,localsec.dll,1
16425,,wavemsp.dll,1
16425,,wsecedit.dll,1
16425,,cic.dll,1
16425,,sysmon.ocx,1
16425,,certcli.dll,1
16425,,compatui.dll,1
16425,,dmband.dll,1
16425,,dmcompos.dll,1
16425,,dmime.dll,1
16425,,dmloader.dll,1
16425,,dmstyle.dll,1
16425,,dmsynth.dll,1
16425,,dmusic.dll,1
16425,,dmscript.dll,1
16425,,dswave.dll,1
16425,,dsdmo.dll,1
16425,,dsdmoprp.dll,1
16425,,certmgr.dll,1
16425,,regwizc.dll,1
16425,,smlogcfg.dll,1
16425,,ipsmsnap.dll,1
16425,,mdhcp.dll,1
16425,,wlanmon.dll,1
16425,,wlsnp.dll,1
16425,,scriptpw.dll,1
16425,,regsvr32.exe,,,/s %16425%\cmdlib.wsc
16425,,scrptutl.dll,1
16425,,iassvcs.dll,1
16425,,iasacct.dll,1
16425,,iasads.dll,1
16425,,iashlpr.dll,1
16425,,iasnap.dll,1
16425,,iaspolcy.dll,1
16425,,iasrad.dll,1
16425,,iassam.dll,1
16425,,iassdo.dll,1
16425,,iasrecst.dll,1,90
16425,,dfsshlex.dll,1
16425,,seclogon.dll,1
16425,,sclgntfy.dll,1
16425,,gpkcsp.dll,1
16425,,sccbase.dll,1
16425,,slbcsp.dll,1
16425,,slbiop.dll,1
16425,,scredir.dll,1
16425,,rastls.dll,1
16425,,raschap.dll,1
16425,,cdosys.dll,1
16425,,dataclen.dll,1
16425,,dxtrans.dll,1
16425,,dxtmsft.dll,1
16425,,objsel.dll,1
16425,,confmsp.dll,1
16425,,h323msp.dll,1
16425,,fdeploy.dll,1
16425,,stobject.dll,1
16425,,scripto.dll,1
16425,,inetcfg.dll,1
16425,,fontext.dll,1
16425,,activeds.dll,1
16425,,ieaksie.dll,1
16425,,iedkcs32.dll,1
16425,,dx7vb.dll,1
16425,,dx8vb.dll,1
16425,,vbisurf.ax,1
16425,,wstdecod.dll,1
16425,,msvidctl.dll,1
16425,,sbe.dll,1
16425,,encdec.dll,1
16425,,mswebdvd.dll,1
16425,,userenv.dll,3,1200
16425,,scecli.dll,1,900
16425,,msisip.dll,1
16425,,wiaservc.dll,1
16425,,sti.dll,1
16425,,wiascr.dll,1
16425,,wiadefui.dll,1
16425,,wiashext.dll,1
16425,,camocx.dll,1
16425,,wiavusd.dll,1
16425,,wiasf.ax,1
16425,,wiavideo.dll,1
16425,,photowiz.dll,1
16425,,mmcshext.dll,1
16425,,cabview.dll,1
16425,,vss_ps.dll,1
16425,,credui.dll,1
16425,,azroles.dll,1
16425,,azroleui.dll,1
16425,,msctfp.dll,1
16425,,msutb.dll,1
16425,,msimtf.dll,1
10,ime,mscandui.dll,1
10,ime,sptip.dll,1
10,ime,softkbd.dll,1
16425,,DVDUpgrd.exe,,180,/setup
16425,,dpnet.dll,1
16425,,dpnhpast.dll,1
16425,,dpnhupnp.dll,1
16425,,dpvoice.dll,1
16425,,dpvvox.dll,1
16425,,dpvacm.dll,1
16425,,dplayx.dll,1
16425,,rundll32.exe,,,modemui.dll,CountryRunOnce
16425,,pdh.dll,2


[EarlyOleControlDlls] 
































16425,,atl.dll,1
16425,,txflog.dll,1
16425,,netcfgx.dll,1
16425,,netman.dll,1
16425,,netshell.dll,1
16425,,odbcconf.dll,1
16425,,msiexec.exe,,,/regserver /q
16425,,msctf.dll,1


[CryptoDlls] 

































16425,,rsaenh.dll,1
16425,,dssenh.dll,1
16425,,initpki.dll,1,600




[files.install.cleaninstall]
CopyFiles=wFiles.System,wFiles.System.CopyAlways

[files.install.cleaninstall.win31]
CopyFiles=wFiles.System,wFiles.System.CopyAlways

[files.install.upgrade]
CopyFiles=wFiles.System.CopyAlways

[files.install.upgrade.win31]
CopyFiles=wFiles.System.CopyAlways

[specialinstall]
DelFiles=wDialer.DelFiles

[wFiles.System]
AUTOEXEC.TMP,wAUTOEXEC.NT
CONFIG.TMP,wCONFIG.NT

[wFiles.System.CopyAlways]
[wDialer.DelFiles]
dialer.exe

[DestinationDirs]
wFiles.System=16425
wFiles.System.CopyAlways=16425
wDialer.DelFiles=16426,Windows NT
