#pragma once
[version]
signature="$CHICAGO$"
LayoutFile=layout.inf
SetupClass=BASE
[DefaultInstall]
CopyFiles     =  NetMtg.Install.App,NetMtg.Install.App.NT,NetMtg.Install.Sys,NetMtg.Install.Sys.NT,NetMtg.Install.Shared,NetMtg.Install.Help
DelFiles      =  NetMtg.CleanPrev.App,NetMtg.CleanPrev.Sys,NetMtg.CleanPrev.Help
AddReg        =  NetMtg.Install.Reg,NetMtg.Install.Reg.PerUser,NetMtg.Install.ActiveSetup.NT,NetMtg.Install.Reg.NT
DelReg        =  NetMtg.CleanPrev.Reg,NetMtg.CleanPrev.Reg.PerUser
ProfileItems  =  NetMtg.Profile.Remove1,NetMtg.Profile.Remove2
UpdateInis    =  NetMtg.Install.Inis
RegisterDlls  =  NetMtg.Register.Srvrs
[NetMtg.Install.PerUser.NT]
AddReg            = NetMtg.Install.Reg.PerUser
DelReg            = NetMtg.CleanPrev.Reg.PerUser
[NetMtg.Remove]
AddReg         = NetMtg.Remove.ActiveSetup.NT
DelFiles       = NetMtg.Remove.Sys,NetMtg.Remove.Sys.NT,NetMtg.Remove.App,NetMtg.Remove.App.NT,NetMtg.Remove.Help
DelReg         = NetMtg.Remove.Reg,NetMtg.Remove.Reg.PerUser
UpdateInis     = NetMtg.Remove.Inis
[NetMtg.Remove.PerUser.NT]
DelReg            = NetMtg.Remove.Reg.PerUser
[DestinationDirs]
NetMtg.Install.App        = 16422,%NetMtgDir%
NetMtg.Install.App.NT     = 16422,%NetMtgDir%
NetMtg.Install.Shared     = 11    ; LDID_SYS
NetMtg.Install.Sys        = 11    ; LDID_SYS
NetMtg.Install.Sys.NT     = 11    ; LDID_SYS
NetMtg.Install.Help       = 18    ; Help directory
NetMtg.Install.Inf        = 17    ; LDID_INF
NetMtg.CleanPrev.App      = 16422,%NetMtgDir%
NetMtg.CleanPrev.Sys      = 11    ; LDID_SYS
NetMtg.CleanPrev.Help     = 18    ; Help directory
NetMtg.Remove.App         = 16422,%NetMtgDir%
NetMtg.Remove.App.NT      = 16422,%NetMtgDir%
NetMtg.Remove.Sys         = 11    ; LDID_SYS
NetMtg.Remove.Sys.NT      = 11    ; LDID_SYS
NetMtg.Remove.Help        = 18    ; Help directory
[NetMtg.Register.Srvrs]
11,,mnmsrvc.exe,,,"-install"
16422,%NetMtgDir%,conf.exe
11,,ils.dll,1
16422,%NetMtgDir%,confmrsl.dll,1
11,,msconf.dll,1
16422,%NetMtgDir%,rrcm.dll,1
[NetMtg.Remove.Cmds]
rundll32.exe ""%11%\nmmkcert.dll"",NmMakeCertCleanup
%11%\mnmsrvc -remove
"""%16422%\%NetMtgDir%\conf.exe""" -unregserver
%11%\regsvr32.exe /s /u """%16422%\%NetMtgDir%\confmrsl.dll"""
%11%\regsvr32.exe /s /u %11%\msconf.dll
%11%\regsvr32.exe /s /u """%16422%\%NetMtgDir%\rrcm.dll"""
[NetMtg.Remove.Dirs]
%16422%/%NetMtgDir%/%RecFileDir%
%16422%/%NetMtgDir%/%SpeedDialDir%
%16422%/%NetMtgDir%
[NetMtg.Profile.Remove1]
Name="%PGMITEM_NETMTG%",2
[NetMtg.Profile.Remove2]
Name="%PGMITEM_NETMTG_OLD%",2
[NetMtg.Install.Shared]
isrdbg32.dll,,,32
ils.dll,,,32
[NetMtg.Install.Help]
conf.hlp
conf.cnt
conf.chm
nmchat.chm
nmwhiteb.chm
[NetMtg.Remove.Help]
conf.hlp,,,1
conf.cnt,,,1
conf.chm,,,1
conf.gid,,,1
nmchat.chm,,,1
nmwhiteb.chm,,,1
[NetMtg.Install.Sys]
msconf.dll
msg723.acm
mnmsrvc.exe
nmmkcert.dll
msh263.drv
msh261.drv
[NetMtg.Install.Sys.NT]
mnmdd.dll
nmevtmsg.dll
[NetMtg.Remove.Sys]
msconf.dll,,,1
msg723.acm,,,1
mnmsrvc.exe,,,1
nmmkcert.dll,,,1
msh263.drv,,,1
msh261.drv,,,1
[NetMtg.Remove.Sys.NT]
mnmdd.dll
nmevtmsg.dll,,,1
[NetMtg.CleanPrev.Sys]
ConfLnk.dll,,,1
imsconf.dll,,,1
nac.dll,,,1
rrcm.dll,,,1
msiprt.dll,,,1
Confcp.dll,,,1
ulclient.dll,,,1
ulsvc.exe,,,1
ft32.exe,,,1
xmsconf.ocx,,,1
nmpgmgrp.exe
[NetMtg.Install.App]
cb32.exe
conf.exe
nmoldwb.dll
nmft.dll
nmwb.dll
wb32.exe
nmchat.dll
netmeet.htm
TestSnd.wav
Blip.wav
MST120.DLL
MST123.DLL
nmcom.dll
confmrsl.dll
nac.dll
h323cc.dll
rrcm.dll
callcont.dll
[NetMtg.Install.App.NT]
nmasnt.dll
nmas.dll
dcap32.dll
[NetMtg.Remove.App]
cb32.exe,,,1
conf.exe,,,1
nmoldwb.dll,,,1
nmft.dll,,,1
nmwb.dll,,,1
wb32.exe,,,1
nmchat.dll,,,1
netmeet.htm,,,1
support.txt,,,1
license.txt,,,1
RingIn.wav,,,1
TestSnd.wav,,,1
Blip.wav,,,1
callLog.dat,,,1
MST120.DLL,,,1
MST123.DLL,,,1
nmcom.dll,,,1
confmrsl.dll,,,1
nac.dll,,,1
h323cc.dll,,,1
rrcm.dll,,,1
callcont.dll,,,1
[NetMtg.Remove.App.NT]
nmas.dll,,,1
nmasnt.dll,,,1
dcap32.dll,,,1
[NetMtg.CleanPrev.App]
soedber.dll,,,1
Type.wav,,,1
mnmccl_.dll,,,1
mnmhlp_.dll,,,1
mnmclpm_.dll,,,1
mnmcpi_.dll,,,1
mnmgdc_.dll,,,1
mnmtdd_.dll,,,1
mnmtph16.dll,,,1
mnmtph32.dll,,,1
mnmcmg_.dll,,,1
mnmmg_.dll,,,1
obscure.bmp,,,1
netmtgrm.exe,,,1
msconfft.exe,,,1
msmcstcp.dll,,,1
ossapi.dll,,,1
ossmem.dll,,,1
soedper.dll,,,1
ft32.exe,,,1
mnmal_.dll,,,1
mnmalp.exe,,,1
mnmclp_.dll,,,1
mnmdump_.dll,,,1
mnmft_.dll,,,1
mnmmsg_.dll,,,1
mnmnet.exe,,,1
mnmnet_.dll,,,1
mnmom.exe,,,1
mnmom_.dll,,,1
mnmshco.exe,,,1
mnmshco_.dll,,,1
mnmtapm_.dll,,,1
mnmthk16.dll,,,1
mnmtrc32.dll,,,1
mnmut_.dll,,,1
mnmvdd.386,,,1
mnmwb_.dll,,,1
mnmtddm_.dll,,,1
mnmtddn_.dll,,,1
mnmtdds_.dll,,,1
mnmtrc_.dll,,,1
mcatipx.dll,,,1
gccnc.dll,,,1
mcsnc.dll,,,1
NULLMDM.DLL,,,1
mcatpstn.dll,,,1
nmoss.dll,,,1
mnmcrsp_.dll,,,1
msgccmcs.dll,,,1
mcs32.dll,,,1
gcc32.dll,,,1
gki.dll,,,1
h245.dll,,,1
h245ws.dll,,,1
ulsulp.dll,,,1
msica.dll,,,1
msicares.dll,,,1
wbres.dll,,,1
cbres.dll,,,1
nmres.dll,,,1
netmeet.txt,,,1
mnmcpi32.dll,,,1
mnmhook_.dll,,,1
mnmas16.dll,,,1
nmexchex.dll,,,1
msconfft.dll,,,1
nmmkcert.dll,,,1
nmmigrat.dll,,,1
mnmdd.dll,,,1
mnmdd.inf,,,1
mnmdd.sys,,,1
license.txt
[NetMtg.CleanPrev.Help]
msica.hlp
msica.cnt
[NetMtg.Install.Reg]
HKLM,%KEY_CONFERENCING%,"InstallationDirectory",,"%16422%\%NetMtgDir%"
HKLM,%KEY_CONFERENCING%,"NodeControllerName",,"conf.exe"
HKLM,"SOFTWARE\Clients\Internet Call",,0x1000,"Microsoft NetMeeting"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting",,0x1000,"%PRODUCT_NAME%"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto",,0x1000,"URL: CallTo Protocol"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto","EditFlags",0x1001,02,00,00,00
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto","URL Protocol",,""
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto\DefaultIcon",,0x1000,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\shell\open\command",,0x1000,"""%16422%\%NetMtgDir%\conf.exe"""
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto\shell\open\command",,0x21000,"rundll32.exe %SystemRoot%\SysWOW64\msconf.dll,CallToProtocolHandler %%l"
HKLM,"SOFTWARE\Clients\Internet Call",,,"Microsoft NetMeeting"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting",,,"%PRODUCT_NAME%"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto",,,"URL: CallTo Protocol"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto","EditFlags",1,02,00,00,00
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto","URL Protocol",,""
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto\DefaultIcon",,,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\shell\open\command",,,"""%16422%\%NetMtgDir%\conf.exe"""
HKLM,"SOFTWARE\Clients\Internet Call\Microsoft NetMeeting\Protocols\callto\shell\open\command",,,"rundll32.exe msconf.dll,CallToProtocolHandler %%l"
HKCR,"Callto",,0x1000,"URL: CallTo Protocol"
HKCR,"Callto","EditFlags",0x1001,02,00,00,00
HKCR,"Callto","URL Protocol",0x1000,""
HKCR,"Callto\DefaultIcon",,0x1000,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKCR,"Callto\shell\open\command",,0x21000,"rundll32.exe %SystemRoot%\SysWOW64\msconf.dll,CallToProtocolHandler %%l"
HKCR,"callto",,,"URL: CallTo Protocol"
HKCR,"callto","EditFlags",1,02,00,00,00
HKCR,"callto","URL Protocol",,""
HKCR,"callto\DefaultIcon",,,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKCR,"callto\shell\open\command",,,"rundll32.exe msconf.dll,CallToProtocolHandler %%l"
HKCR,CLSID\{085C06A0-3CAA-11d0-A00E-00A024A85A2C},,,%QoS%
HKCR,CLSID\{085C06A0-3CAA-11d0-A00E-00A024A85A2C}\InProcServer32,,,"""%16422%\%NetMtgDir%\nac.dll"""
HKCR,CLSID\{085C06A0-3CAA-11d0-A00E-00A024A85A2C}\InProcServer32,"ThreadingModel",,"Apartment"
HKCR,CLSID\{068B0800-718C-11d0-8B1A-00A0C91BC90E},,,%NMMANAGER_OBJECT3%
HKCR,CLSID\{068B0800-718C-11d0-8B1A-00A0C91BC90E}\InProcServer32,,,"""%16422%\%NetMtgDir%\nmcom.dll"""
HKCR,CLSID\{068B0800-718C-11d0-8B1A-00A0C91BC90E}\InProcServer32,"ThreadingModel",,"Apartment"
HKCR,CLSID\{8ED14CC0-7A1F-11d0-92F6-00A0C922E6B2},,,%INSTALL_CODECS%
HKCR,CLSID\{8ED14CC0-7A1F-11d0-92F6-00A0C922E6B2}\InProcServer32,,,"""%16422%\%NetMtgDir%\nac.dll"""
HKCR,CLSID\{8ED14CC0-7A1F-11d0-92F6-00A0C922E6B2}\InProcServer32,"ThreadingModel",,"Apartment"
HKLM,"%KEY_CONFERENCING%\CaptureDevices\QuickCam video capture driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\QuickCam video capture driver","dwNumColors",1,03,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\QuickCam video capture driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\QuickCam video capture driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\QuickCam video capture driver","bmi4bitColors",1,00,00,00,00,ff,ff,\
ff,00,ee,ee,ee,00,dd,dd,dd,00,cc,cc,cc,00,bb,bb,bb,00,aa,aa,aa,00,99,99,99,00,88,88,88,00,77,77,77,00,66,66,66,00,55,55,55,00,\
44,44,44,00,33,33,33,00,22,22,22,00,11,11,11,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix Quickcam(Grayscale)","dwImageSize",1,00,01,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix Quickcam(Grayscale)","dwNumColors",1,03,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix Quickcam(Grayscale)","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix Quickcam(Grayscale)","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix Quickcam(Grayscale)","bmi4bitColors",1,00,00,00,00,ff,ff,\
ff,00,ee,ee,ee,00,dd,dd,dd,00,cc,cc,cc,00,bb,bb,bb,00,aa,aa,aa,00,99,99,99,00,88,88,88,00,77,77,77,00,66,66,66,00,55,55,55,00,\
44,44,44,00,33,33,33,00,22,22,22,00,11,11,11,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam video capture driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam video capture driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam video capture driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam video capture driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam driver for Windows NT","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam driver for Windows NT","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam driver for Windows NT","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Color QuickCam driver for Windows NT","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum by Winnov","dwImageSize",1,40,04,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum by Winnov","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum by Winnov","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum by Winnov","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Capture driver for V732X","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Capture driver for V732X","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Capture driver for V732X","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Capture driver for V732X","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\isvrpro.drv","dwImageSize",1,00,81,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\isvrpro.drv","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\isvrpro.drv","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\isvrpro.drv","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video shell driver","dwImageSize",1,00,81,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video shell driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video shell driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video shell driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video driver","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\video driver","dwDialogs",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\spigot.dll","dwImageSize",1,04,81,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\spigot.dll","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\spigot.dll","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\spigot.dll","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Win/TV Video Capture Driver","dwImageSize",1,04,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Win/TV Video Capture Driver","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Win/TV Video Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Win/TV Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster SE100","dwImageSize",1,44,85,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster SE100","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster SE100","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster SE100","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Orchid Vidiola Capture Driver","dwImageSize",1,04,81,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Orchid Vidiola Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Orchid Vidiola Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Orchid Vidiola Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\EyeWay95 Capture Driver","dwImageSize",1,44,85,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\EyeWay95 Capture Driver","dwNumColors",1,0C,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\EyeWay95 Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\EyeWay95 Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miro AVI CapCodec driver","dwImageSize",1,40,85,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miro AVI CapCodec driver","dwNumColors",1,0C,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miro AVI CapCodec driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miro AVI CapCodec driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree Bt848 Capture Driver","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree Bt848 Capture Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree Bt848 Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree Bt848 Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum Video Capture","dwImageSize",1,40,04,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum Video Capture","dwNumColors",1,0C,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum Video Capture","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Videum Video Capture","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ConferenceCard video Device Driver","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ConferenceCard video Device Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ConferenceCard video Device Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ConferenceCard video Device Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Nogatech Ltd., Video Capture Driver","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Nogatech Ltd., Video Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Nogatech Ltd., Video Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Nogatech Ltd., Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Multimedia Video Driver","dwImageSize",1,40,05,c0,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Multimedia Video Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Multimedia Video Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Multimedia Video Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\FullVideo Supreme Driver","dwImageSize",1,40,05,40,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\FullVideo Supreme Driver","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\FullVideo Supreme Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\FullVideo Supreme Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\S3 Video Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\S3 Video Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\S3 Video Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\S3 Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Video Capture","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Toshiba Video Capture Card driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Toshiba Video Capture Card driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Toshiba Video Capture Card driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Toshiba Video Capture Card driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 100 Video Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 100 Video Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 100 Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-100 Video Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-100 Video Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-100 Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web","dwImageSize",1,40,05,40,06
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web","dwNumColors",1,3c,01,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web (0801)","dwImageSize",1,40,05,40,06
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web (0801)","dwNumColors",1,3c,01,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web (0801)","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Web (0801)","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Express","dwImageSize",1,40,05,40,06
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Express","dwNumColors",1,3c,01,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Express","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam Express","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 100 Video Capture Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-100 Video Capture Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Digital Vision ComputersEyes/NB","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Digital Vision ComputersEyes/NB","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Digital Vision ComputersEyes/NB","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Digital Vision ComputersEyes/NB","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/1024 Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\////FAST Multimedia AG. MJPG Capture Driver","dwImageSize",1,40,05,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\////FAST Multimedia AG. MJPG Capture Driver","dwNumColors",1,0c,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\////FAST Multimedia AG. MJPG Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\////FAST Multimedia AG. MJPG Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO DC30/DC10 capture driver","dwImageSize",1,00,01,40,80
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO DC30/DC10 capture driver","dwNumColors",1,0c,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO DC30/DC10 capture driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO DC30/DC10 capture driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TVTap VidCap Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TVTap VidCap Driver","dwNumColors",1,0c,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TVTap VidCap Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TVTap VidCap Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Bt848 NT Video Capture Driver","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Bt848 NT Video Capture Driver","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Bt848 NT Video Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Hauppauge Bt848 NT Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO Capture Driver","dwImageSize",1,00,01,40,80
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO Capture Driver","dwNumColors",1,0c,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\miroVIDEO Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickCam VC USB","dwImageSize",1,00,05,40,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickCam VC USB","dwNumColors",1,0c,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickCam VC USB","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickCam VC USB","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\USB Video Camera for Intel Proshare technology","dwImageSize",1,00,05,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\USB Video Camera for Intel Proshare technology","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\USB Video Camera for Intel Proshare technology","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\USB Video Camera for Intel Proshare technology","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it Digital Video PC Camera","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it Digital Video PC Camera","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it Digital Video PC Camera","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it Digital Video PC Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\IBM PC Camera","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\IBM PC Camera","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\IBM PC Camera","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\IBM PC Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it PC Camera","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it PC Camera","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it PC Camera","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\C-it PC Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech USB Video Camera","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech USB Video Camera","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech USB Video Camera","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech USB Video Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ViCAM AVI Capture Driver","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ViCAM AVI Capture Driver","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ViCAM AVI Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ViCAM AVI Capture Driver","dwDialogs",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Buster Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Buster Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Buster Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Buster Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-1000 Video Capture/Encoder","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-1000 Video Capture/Encoder","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-1000 Video Capture/Encoder","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey-1000 Video Capture/Encoder","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 1000 Video Capture Driver","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 1000 Video Capture Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 1000 Video Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Osprey 1000 Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Capture Driver for NT","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Capture Driver for NT","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Capture Driver for NT","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ComputerEyes/PCI Capture Driver for NT","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickClip USB","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickClip USB","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickClip USB","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Connectix QuickClip USB","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\16 bit dll of the TOSHIBA NoteBook Built-In Conferencing System","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\16 bit dll of the TOSHIBA NoteBook Built-In Conferencing System","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\16 bit dll of the TOSHIBA NoteBook Built-In Conferencing System","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\16 bit dll of the TOSHIBA NoteBook Built-In Conferencing System","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Sony 1394 CCM-DS250 Desktop Camera","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Sony 1394 CCM-DS250 Desktop Camera","dwNumColors",1,00,01,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Sony 1394 CCM-DS250 Desktop Camera","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Sony 1394 CCM-DS250 Desktop Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ISVR III Capture Driver","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ISVR III Capture Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ISVR III Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ISVR III Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC323 Digital Video Camera","dwImageSize",1,00,05,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC323 Digital Video Camera","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC323 Digital Video Camera","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC323 Digital Video Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC325 Digital Video Camera","dwImageSize",1,00,05,00,82
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC325 Digital Video Camera","dwNumColors",1,28,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC325 Digital Video Camera","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC325 Digital Video Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TOPCAM Digital CCD Camera Driver","dwImageSize",1,00,05,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TOPCAM Digital CCD Camera Driver","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TOPCAM Digital CCD Camera Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\TOPCAM Digital CCD Camera Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Video Basic Capture Driver","dwImageSize",1,00,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Video Basic Capture Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Video Basic Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\ATI Video Basic Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Pcam for Wintronix","dwImageSize",1,00,05,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Pcam for Wintronix","dwNumColors",1,04,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Pcam for Wintronix","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Pcam for Wintronix","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Creative Video Blaster WebCam II USB","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Creative Video Blaster WebCam II USB","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Creative Video Blaster WebCam II USB","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Creative Video Blaster WebCam II USB","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster WebCam Go Plus (WDM)","dwImageSize",1,00,00,40,80
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster WebCam Go Plus (WDM)","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster WebCam Go Plus (WDM)","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Video Blaster WebCam Go Plus (WDM)","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips CIF Digital Camera; Video","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips CIF Digital Camera; Video","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips CIF Digital Camera; Video","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips CIF Digital Camera; Video","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips ToUcam Pro Camera; Video","dwImageSize",1,00,00,40,80
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips ToUcam Pro Camera; Video","dwNumColors",1,60,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips ToUcam Pro Camera; Video","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Philips ToUcam Pro Camera; Video","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC 300 Digital Video Camera","dwImageSize",1,00,05,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC 300 Digital Video Camera","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC 300 Digital Video Camera","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Kodak DVC 300 Digital Video Camera","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Matrox VidCap Driver","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Matrox VidCap Driver","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Matrox VidCap Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Matrox VidCap Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree PCI Video Capture Driver","dwImageSize",1,40,01,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree PCI Video Capture Driver","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree PCI Video Capture Driver","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\MSVIDEO: Brooktree PCI Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Mpact Mediaware Video Capture Driver","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Mpact Mediaware Video Capture Driver","dwNumColors",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Mpact Mediaware Video Capture Driver","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Mpact Mediaware Video Capture Driver","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\LifeView FlyVideo Slim","dwImageSize",1,40,04,40,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\LifeView FlyVideo Slim","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\LifeView FlyVideo Slim","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\LifeView FlyVideo Slim","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam VC USB","dwImageSize",1,40,04,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam VC USB","dwNumColors",1,08,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam VC USB","dwStreamingMode",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Logitech QuickCam VC USB","dwDialogs",1,02,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Intel USB Video Camera III","dwImageSize",1,00,05,00,02
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Intel USB Video Camera III","dwNumColors",1,20,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Intel USB Video Camera III","dwStreamingMode",1,00,00,00,00
HKLM,"%KEY_CONFERENCING%\CaptureDevices\Intel USB Video Camera III","dwDialogs",1,02,00,00,00
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\CONF.EXE",,,"%16422%\%NetMtgDir%\conf.exe"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\CONF.EXE","Path",,"%16422%\%NetMtgDir%;"
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6},,0x1000,%ConfLnk%
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6}\InProcServer32,,0x21000,"1330\msconf.dll"
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6}\InProcServer32,"ThreadingModel",0x1000,"Apartment"
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6},,,%ConfLnk%
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6}\InProcServer32,,,"msconf.dll"
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6}\InProcServer32,"ThreadingModel",,"Apartment"
HKCR,.cnf,,0x1000,"ConferenceLink"
HKCR,ConferenceLink,,0x1000,%ConfLnk%
HKCR,ConferenceLink,"FriendlyTypeName",0x1000,"@%16422%\%NetMtgDir%\conf.exe,-12346"
HKCR,ConferenceLink,"EditFlags",0x1001,02,00,01,00
HKCR,ConferenceLink,"IsShortcut",0x1000,""
HKCR,ConferenceLink,"NeverShowExt",0x1000,""
HKCR,.cnf,,,"ConferenceLink"
HKCR,ConferenceLink,,,%ConfLnk%
HKCR,ConferenceLink,"FriendlyTypeName",,"@%16422%\%NetMtgDir%\conf.exe,-12346"
HKCR,ConferenceLink,"EditFlags",1,02,00,01,00
HKCR,ConferenceLink,"IsShortcut",,""
HKCR,ConferenceLink,"NeverShowExt",,""
HKCR,ConferenceLink\ClsID,,0x1000,"{30E7F2A0-EC4C-11ce-8865-00805F742EF6}"
HKCR,ConferenceLink\DefaultIcon,,0x21000,"%SystemRoot%\SysWOW64\msconf.dll,-103"
HKCR,ConferenceLink\shell\open\command,,0x21000,"rundll32.exe %SystemRoot%\SysWOW64\msconf.dll,OpenConfLink %%l"
HKCR,ConferenceLink\ClsID,,,"{30E7F2A0-EC4C-11ce-8865-00805F742EF6}"
HKCR,ConferenceLink\DefaultIcon,,,"msconf.dll,-103"
HKCR,ConferenceLink\shell\open\command,,,"rundll32.exe msconf.dll,OpenConfLink %%l"
HKCR,".uls",,,"ulsfile"
HKCR,".uls","Content Type",,"text/iuls"
HKCR,"ulsfile",,,"%MSIPTYPE%"
HKCR,"MIME\Database\Content Type\text/iuls","Extension",,".uls"
HKCR,".323",,,"h323file"
HKCR,".323","Content Type",,"text/h323"
HKCR,"h323file",,,"%H323TYPE%"
HKCR,"h323file","FriendlyTypeName",,"@%16422%\%NetMtgDir%\conf.exe,-12345"
HKCR,"MIME\Database\Content Type\text/h323","Extension",,".323"
HKCR,".iii",,2,"iiifile"
HKCR,".iii","Content Type",2,"application/x-iphone"
HKCR,"iiifile",,2,"%IPHONETYPE%"
HKCR,"iiifile","FriendlyTypeName",,"@%16422%\%NetMtgDir%\conf.exe,-12347"
HKCR,"MIME\Database\Content Type\application/x-iphone","Extension",2,".iii"
HKCR,"ulsfile\DefaultIcon",,,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKCR,"h323file\DefaultIcon",,,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKCR,"iiifile\DefaultIcon",,2,"""%16422%\%NetMtgDir%\conf.exe"",1"
HKCR,"ulsfile\shell\open\command",,,"""rundll32.exe"" msconf.dll,NewMediaPhone %%l"
HKCR,"h323file\shell\open\command",,,"""rundll32.exe"" msconf.dll,NewMediaPhone %%l"
HKCR,"iiifile\shell\open\command",,2,"""rundll32.exe"" msconf.dll,NewMediaPhone %%l"
HKLM,"%KEY_CONFERENCING%\RRCM","NumSessions",1,1e,00,00,00
HKLM,"%KEY_CONFERENCING%\RRCM","NumFreeSSRC",1,10,00,00,00
HKLM,"%KEY_CONFERENCING%\RRCM","NumRTCPPostedBfr",1,01,00,00,00
HKLM,"%KEY_CONFERENCING%\RRCM","RTCPrcvBfrSize",1,00,10,00,00
HKCR,"Whiteboard",,,"%MSWBTYPE%"
HKCR,".WHT",,,"Whiteboard"
HKCR,"Whiteboard\DefaultIcon",,,"""%16422%\%NetMtgDir%\nmoldwb.dll"",-1"
HKCR,"Whiteboard\shell\open\command",,,"""%16422%\%NetMtgDir%\wb32.exe"" ""%%1"""
HKCR,"T126_Whiteboard",,,"%MST126WBTYPE%"
HKCR,"T126_Whiteboard","FriendlyTypeName",,"@%16422%\%NetMtgDir%\nmwb.dll,-1234"
HKCR,".NMW",,,"T126_Whiteboard"
HKCR,".NMW","Content Type",,"application/nmwb"
HKCR,"T126_Whiteboard\DefaultIcon",,,"""%16422%\%NetMtgDir%\nmwb.dll"",-1"
HKCR,"T126_Whiteboard\shell\open\command",,,"""%16422%\%NetMtgDir%\wb32.exe"" - ""%%1"""
[NetMtg.Install.ActiveSetup.NT]
HKLM,%KEY_ACTIVE_SETUP_NT%,,,%PRODUCT_NAME_AND_VER%
HKLM,%KEY_ACTIVE_SETUP_NT%,"ComponentID",,"NetMeeting"
HKLM,%KEY_ACTIVE_SETUP_NT%,"IsInstalled",1,01,00,00,00
HKLM,%KEY_ACTIVE_SETUP_NT%,"Version",,"%VERSIONSTR%"
HKLM,%KEY_ACTIVE_SETUP_NT%,"Locale",,"%LOCALE_ID%"
HKLM,%KEY_ACTIVE_SETUP_NT%,"StubPath",,"rundll32.exe advpack.dll,LaunchINFSection %17%\msnetmtg.inf,NetMtg.Install.PerUser.NT"
HKLM,%KEY_UNINSTALL%,"RequiresIESysFile",,"4.71"
[NetMtg.Remove.ActiveSetup.NT]
HKLM,%KEY_ACTIVE_SETUP_NT%,"IsInstalled",1,00,00,00,00
HKLM,%KEY_ACTIVE_SETUP_NT%,"StubPath",,"rundll32.exe advpack.dll,LaunchINFSection %17%\msnetmtg.inf,NetMtg.Remove.PerUser.NT"
[NetMtg.Install.Reg.PerUser]
HKCU,AppEvents\Schemes\Apps\Conf,,,"%PRODUCT_NAME%"
HKCU,AppEvents\Schemes\Apps\Conf\%ReceiveCall%\.Current,,,"%10%\Media\RingIn.wav"
HKCU,AppEvents\Schemes\Apps\Conf\%ReceiveJoin%\.Current,,,"%10%\Media\RingIn.wav"
HKCU,AppEvents\Schemes\Apps\Conf\%PersonJoins%\.Current,,,"%16422%\%NetMtgDir%\Blip.wav"
HKCU,AppEvents\Schemes\Apps\Conf\%PersonLeaves%\.Current,,,"%16422%\%NetMtgDir%\Blip.wav"
HKCU,"Software\Netscape\Netscape Navigator\Viewers","text/iuls",,"""rundll32.exe"" msconf.dll,NewMediaPhone %%l"
HKCU,"Software\Netscape\Netscape Navigator\Viewers","text/h323",,"""rundll32.exe"" msconf.dll,NewMediaPhone %%l"
HKCU,"Software\Netscape\Netscape Navigator\Viewers","application/x-iphone",2,"""rundll32.exe"" msconf.dll,NewMediaPhone %%l"
[NetMtg.Install.Reg.NT]
HKLM,"System\CurrentControlSet\Services\mnmdd","Start",65537,1,0,0,0
HKCU,%KEY_ACTIVE_SETUP_NT%,"Locale",,"%LOCALE_ID%"
HKCU,%KEY_ACTIVE_SETUP_NT%,"Version",,"%VERSIONSTR%"
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\Application",,,"mnmsrvc"
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\Application\mnmsrvc","EventMessageFile",,"%SystemRoot%\System32\nmevtmsg.dll"
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\Application\mnmsrvc","TypeSupported",1,07,00,00,00
[NetMtg.CleanPrev.Reg]
HKLM,Software\Microsoft\Windows\CurrentVersion\Run,"Microsoft NetMeeting"
HKLM,%KEY_CONFERENCING%,"Run Always"
HKCR,CLSID\{068B0701-718C-11d0-8B1A-00A0C91BC90E}
HKLM,"SOFTWARE\Microsoft\Internet Audio\ACMH323Encodings"
HKLM,"SOFTWARE\Microsoft\Internet Audio\VCMEncodings"
HKLM,"%KEY_CONFERENCING%\CaptureDevices"
HKLM,"%KEY_CONFERENCING%\CaptureDefaultFormats"
HKLM, "%KEY_CONFERENCING%\Remote Control"
HKLM,%KEY_UNINSTALL%
HKLM,"%KEY_GUID%\{7BA58780-90C0-11CF-87BD-00AA003FEE93}"
HKLM,"%KEY_GUID%\{340F3A60-7067-11D0-A041-444553540000}"
HKLM,%KEY_TRANSPORTS%
HKLM,"%KEY_CONFERENCING%\Data Control"
HKLM,"%KEY_DCG%"
HKLM,%KEY_MCAT%
HKCR,CLSID\{53D22820-D7E8-11CF-AD0A-0080C7137C82}
HKCR,TypeLib\{53D22821-D7E8-11CF-AD0A-0080C7137C82}
HKCR,CLSID\{068B0901-718C-11D0-8B1A-00A0C91BC90E}
HKCR,CLSID\{19FF8A00-9447-11cf-8796-444553540000}
HKLM,Software\Microsoft\Exchange\Client\Extensions,"NetMeeting Extensions"
HKLM,"%KEY_RDS%"
[NetMtg.CleanPrev.Reg.PerUser]
HKCU,"%KEY_CONFERENCING%\MRU"
HKCU,"%KEY_CONFERENCING%\UI\Directory"
HKCU,"%KEY_CONFERENCING%\File Transfer"
HKCU,%KEY_CONFERENCING%,"RunWizard"
HKCU,%KEY_CONFERENCING%,"WizardNoUI"
HKCU,"SOFTWARE\Microsoft\Internet Audio"
HKCU,Software\Microsoft\Windows\CurrentVersion\Run,"Microsoft NetMeeting"
HKCU,%KEY_CONFERENCING%,"Run Always"
HKCU,"%KEY_CONFERENCING%\Video Control\Remote","ImageQuality"
[NetMtg.Remove.Reg]
HKLM,%KEY_CONFERENCING%
HKLM,%KEY_POLICIES%
HKCR,CLSID\{085C06A0-3CAA-11d0-A00E-00A024A85A2C}
HKCR,CLSID\{8ED14CC0-7A1F-11d0-92F6-00A0C922E6B2}
HKCR,CLSID\{068B0800-718C-11d0-8B1A-00A0C91BC90E}
HKCR,CLSID\{30E7F2A0-EC4C-11ce-8865-00805F742EF6}
HKLM,"SOFTWARE\Microsoft\Internet Audio"
HKCR,"Internet Audio"
HKCR,".uls"
HKCR,"ulsfile"
HKCR,"MIME\Database\Content Type\text/iuls"
HKCR,".323"
HKCR,"h323file"
HKCR,"MIME\Database\Content Type\text/h323"
HKLM,%KEY_UNINSTALL%
HKCR,"Whiteboard"
HKCR,".WHT"
HKCR,"T126_Whiteboard"
HKCR,".NMW"
HKCR,"Chat"
HKCR,".cnf"
HKCR,"ConferenceLink"
HKCR,"callto"
HKLM,Software\Microsoft\Windows\CurrentVersion\Run,"Microsoft NetMeeting"
HKLM,"Software\Microsoft\Windows\CurrentVersion\App Paths\CONF.EXE"
HKLM,Software\Microsoft\Windows\CurrentVersion\RunServices,"Run Service"
HKLM,Software\Microsoft\Windows\CurrentVersion\RunServices,"Fpx"
HKLM,"%KEY_CONFERENCING%\CaptureDevices"
HKLM,"%KEY_CONFERENCING%\CaptureDefaultFormats"
[NetMtg.Remove.Reg.PerUser]
HKCU,%KEY_CONFERENCING%
HKCU,%KEY_POLICIES%
HKCU,"SOFTWARE\Microsoft\User Location Service"
HKCU,"AppEvents\Schemes\Apps\Internet Audio"
HKCU,"Software\Netscape\Netscape Navigator\Viewers","text/iuls"
HKCU,"Software\Netscape\Netscape Navigator\Viewers","text/h323"
HKCU,AppEvents\Schemes\Apps\Conf
HKCU,Software\Microsoft\Windows\CurrentVersion\Run,"Microsoft NetMeeting"
[NetMtg.Remove.Reg.NT]
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\Application\mnmsrvc"
[NetMtg.Remove.AddReg.NT]
[NetMtg.Install.Inis]
system.ini, drivers32,,"msacm.msg723=msg723.acm"
system.ini, drivers32,,"msacm.msg711=msg711.acm"
system.ini, drivers32,,"vidc.M263=msh263.drv"
system.ini, drivers32,,"vidc.M261=msh261.drv"
system.ini, drivers32,,"vidc.I420=msh263.drv"
[NetMtg.Remove.Inis]
system.ini, drivers32,"msacm.msg723=msg723.acm"
system.ini, drivers32,"vidc.M263=msh263.drv"
system.ini, drivers32,"vidc.M261=msh261.drv"
[Strings]
KEY_CONFERENCING = "SOFTWARE\Microsoft\Conferencing"
KEY_POLICIES     = "SOFTWARE\Policies\Microsoft\Conferencing"
KEY_TRANSPORTS   = "SOFTWARE\Microsoft\Conferencing\Transports"
KEY_GUID         = "SOFTWARE\Microsoft\Conferencing\Applications"
KEY_MCAT         = "SOFTWARE\Microsoft\Conferencing\MCAT"
KEY_DCG          = "SOFTWARE\Microsoft\Conferencing\DCG"
KEY_OPTIONAL     = "SOFTWARE\Microsoft\Windows\CurrentVersion\Setup\OptionalComponents"
KEY_RDS          = "SOFTWARE\Microsoft\Conferencing\Mcpt"
NMMANAGER_OBJECT3 = "Microsoft NetMeeting Manager Object 3"
QOS              = "Microsoft NetMeeting Quality of Service"
INSTALL_CODECS   = "Microsoft NetMeeting Installable Codecs"
KEY_ACTIVE_SETUP_W95 = "SOFTWARE\Microsoft\Active Setup\Installed Components\{44BBA842-CC51-11CF-AAFA-00AA00B6015C}"
KEY_ACTIVE_SETUP_NT  = "SOFTWARE\Microsoft\Active Setup\Installed Components\{44BBA842-CC51-11CF-AAFA-00AA00B6015B}"
KEY_UNINSTALL    = "SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\NetMeeting"
KEY_RUNONCE       = "SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"
VERSIONSTR       = "4,4,0,4000"
NETMTGDIR      = "NetMeeting"
PRODUCT_NAME            = "NetMeeting"
PRODUCT_NAME_AND_VER    = "NetMeeting 3.01"
MSIPTYPE         = "Internet Location Service"
H323TYPE         = "H.323 Internet Telephony"
IPHONETYPE       = "Intel IPhone Compatible"
MSWBTYPE         = "Microsoft NetMeeting Old Whiteboard Document"
MST126WBTYPE     = "Microsoft Netmeeting T126 Compatible Whiteboard Document"
DISK1            = "NetMeeting Files"
PGMGRP_NETMTG    = ""
PGMGRP_IESUITE   = "Internet Explorer"
PGMGRP_COMMUNICATIONS = "Accessories\Communications"
PGMGRP_TOOLS = "Accessories\Internet Tools"
PGMITEM_NETMTG   = "NetMeeting"
PGMITEM_NETMTG_OLD = "Microsoft NetMeeting"
PGMITEM_README   = "Microsoft NetMeeting Release Notes"
ReceiveCall      = "Receive Call"
ReceiveJoin      = "Receive Request to Join"
PersonJoins      = "Person Joins"
PersonLeaves     = "Person Leaves"
ConfLnk          = "SpeedDial"
NETMTG_INFO_TIP = "Establishes communication with others over the internet or an intranet using voice, video, application sharing, and data conferencing"
LOCALE_ID = "EN"
INSTALLPROMPT           = "This will install NetMeeting. Do you wish to continue?";    
FINISHMESSAGE           = "NetMeeting has been installed successfully.";
FILEDESC                = "NetMeeting Installation Program";
