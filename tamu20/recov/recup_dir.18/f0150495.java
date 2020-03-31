; This is the Setup information file to install optional components
; Copyright (c) Microsoft Corporation.  All rights reserved.


[version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf


[DestinationDirs]
CalcCopyFilesSys                = 11    ;LDID_SYSTEM
CalcCopyFilesHelp               = 18    ;LDID_HELP
CharMapCopyFilesSys             = 11    ;LDID_SYSTEM
CharMapCopyFilesHelp            = 18    ;LDID_HELP
ClipBookCopyFilesSys            = 11    ;LDID_SYSTEM
DeskpaperCopyFilesSys           = 10    ;LDID_WIN
DeskpaperOldCopyFilesSys        = 10    ;LDID_WIN
MousePointCopyFilesSys          = 10,%Cursors%
MousePointDelOldFiles           = 11    ;LDID_SYSTEM
PaintCopyFilesSys               = 11    ;LDID_SYSTEM
PaintCopyFilesHelp              = 18    ;LDID_HELP
SSOpenGLCopyFilesSys            = 11    ;LDID_SYSTEM
SSStandardCopyFilesSys          = 11    ;LDID_SYSTEM
TemplatesCopyFiles              = 53,%Templates_Dir% ; LDID_USERPROFILE\Templates


[Optional Components]
AccessTop       ;Top level option
Calc
CharMap
Clipbook
Deskpaper       ; Desktop wallpaper
MousePoint      ; Mouse pointers
Paint
Templates       ; Document Templates
AccessUtil      ; Accessories and Utilities


[AccessUtil]
OptionDesc      = %AccessUtil_DESC%
Tip             = %AccessUtil_TIP%
IconIndex       = 26
Modes           = 0,1,2,3


[AccessTop]
OptionDesc              = %AccessTop_DESC%
Tip                     = %AccessTop_TIP%
IconIndex               = 26 ;Windows mini-icon for dialogs
Parent                  = AccessUtil


[Calc]
OptionDesc              = %Calc_DESC%
Tip                     = %Calc_TIP%
IconIndex               = 30 ;Windows mini-icon for dialogs
Parent                  = AccessTop
CopyFiles               = CalcCopyFilesSys, CalcCopyFilesHelp
ProfileItems            = CalcUninstallItems, CalcInstallItems
Uninstall               = CalcUninstall
Modes                   = 0,1,2,3
SizeApproximation=434176

[CalcUninstall]
DelFiles                = CalcCopyFilesSys, CalcCopyFilesHelp
;UpdateInis             = CalcUninstallInis
ProfileItems            = CalcUninstallItems, CalcUninstallCommonItems

[CalcInstallItems]
Name       = %Calc_DESC%
CmdLine    = 11,, calc.exe
SubDir     = %Access_GROUP%
WorkingDir = 11
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22531"
DisplayResource="%SystemRoot%\system32\shell32.dll",22019

[CalcUninstallItems]
Name       = %Calc_DESC%,0x00000003
Subdir     = %Access_GROUP%

[CalcUninstallCommonItems]
Name       = %Calc_DESC%,0x00000002
Subdir     = %Access_GROUP%


[CharMap]
OptionDesc              = %CharMap_DESC%
Tip                     = %CharMap_TIP%
IconIndex               = 44 ;Keyboard mini-icon for dialogs
Parent                  = AccessTop
CopyFiles               = CharMapCopyFilesSys, CharMapCopyFilesHelp
ProfileItems            = CharMapUninstallItems, CharMapInstallItems
Uninstall               = CharMapUninstall
Modes                   = 0,1,2,3
SizeApproximation=3280896

[CharMapUninstall]
DelFiles                = CharMapCopyFilesSys, CharMapCopyFilesHelp
ProfileItems            = CharMapUninstallItems, CharMapUninstallCommonItems

[CharMapInstallItems]
Name       = %CharMap_DESC%
CmdLine    = 11,, charmap.exe
SubDir     = %SystemTools_GROUP%
WorkingDir = 11
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22533"
DisplayResource="%SystemRoot%\system32\shell32.dll",22021

[CharMapUninstallItems]
Name       = %CharMap_DESC%,0x00000003
Subdir     = %Access_GROUP%

[CharMapUninstallCommonItems]
Name       = %CharMap_DESC%,0x00000002
Subdir     = %SystemTools_GROUP%

[ClipBook]
OptionDesc              = %ClipBook_DESC%
Tip                     = %ClipBook_TIP%
IconIndex               = 40 ;clipboard mini-icon for dialogs
Parent                  = AccessTop
CopyFiles               = ClipBookCopyFilesSys
ProfileItems            = ClipBookUninstallItems, ClipBookUninstallCommonItems
AddReg                  = ClipBook.AddReg
Uninstall               = ClipBookUninstall
Modes                   = 0,1,2,3
SizeApproximation=376832

[ClipBookUninstall]
DelFiles                = ClipBookCopyFilesSys
ProfileItems            = ClipBookUninstallItems, ClipBookUninstallCommonItems

[ClipBookInstallItems]
Name       = %ClipBook_DESC%
CmdLine    = 11,, clipbrd.exe
SubDir     = %Access_GROUP%
WorkingDir = 11
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22586"
DisplayResource="%SystemRoot%\system32\shell32.dll",22074

[ClipBookUninstallItems]
Name       = %ClipBook_DESC%,0x00000003
Subdir     = %Access_GROUP%

[ClipBookUninstallCommonItems]
Name       = %ClipBook_DESC%,0x00000002
Subdir     = %Access_GROUP%

[Deskpaper]
OptionDesc              = %Deskpaper_DESC%
Tip                     = %Deskpaper_TIP%
IconIndex               = 43 ;Windows mini-icon for dialogs
Parent                  = AccessTop
DelFiles                = DeskpaperOldCopyFilesSys
CopyFiles               = DeskpaperCopyFilesSys
Uninstall               = DeskpaperUninstall
Modes                   = 0,1,2,3
SizeApproximation=2478080


[DeskpaperUninstall]
DelFiles                = DeskpaperOldCopyFilesSys,DeskpaperCopyFilesSys

[MousePoint]
OptionDesc              = %MousePoint_DESC%
Tip                     = %MousePoint_TIP%
IconIndex               = 45 ;Windows mini-icon for dialogs
Parent                  = AccessTop
CopyFiles               = MousePointCopyFilesSys
AddReg                  = MousePointSchemes
Uninstall               = MousePointUninstall
Modes                   = 0,1,2,3
SizeApproximation=16220160


[MousePointUninstall]
DelFiles                = MousePointCopyFilesSys,MousePointDelOldFiles
DelReg                  = MousePointSchemes


[Paint]
OptionDesc              = %Paint_DESC%
Tip                     = %Paint_TIP%
IconIndex               = 37 ;Windows mini-icon for dialogs
Parent                  = AccessTop
CopyFiles               = PaintCopyFilesSys, PaintCopyFilesHelp
AddReg                  = PaintAddReg
ProfileItems            = PaintUninstallItems, PaintInstallItems
Uninstall               = PaintUninstall
Modes                   = 0,1,2,3
SizeApproximation=868352


[PaintUninstall]
DelFiles                = PaintCopyFilesSys, PaintCopyFilesHelp
DelReg                  = PaintAddReg
ProfileItems            = PaintUninstallItems, PaintUninstallCommonItems

[PaintInstallItems]
Name       = %Paint_DESC%
CmdLine    = 11,, mspaint.exe
SubDir     = %Access_GROUP%
WorkingDir = 11
InfoTip    = "@%SystemRoot%\system32\shell32.dll,-22566"
DisplayResource="%SystemRoot%\system32\shell32.dll",22054

[PaintUninstallItems]
Name       = %Paint_DESC%,0x00000003
Subdir     = %Access_GROUP%

[PaintUninstallCommonItems]
Name       = %Paint_DESC%,0x00000002
Subdir     = %Access_GROUP%

[Templates]
CopyFiles       = TemplatesCopyFiles
AddReg          = Templates.AddReg
DelReg          = Templates.DelReg
OptionDesc      = %Templates_DESC%
Tip             = %Templates_TIP%
Parent          = AccessTop
IconIndex       = 32  ;Windows Logo mini-icon for dialogs
Uninstall       = TemplatesUninstall
Modes           = 0,1,2,3
SizeApproximation=69632


[TemplatesUninstall]
DelFiles        = TemplatesCopyFiles
DelReg          = Templates.AddReg


[CalcCopyFilesSys]
calc.exe

[CalcCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[CalcCopyFilesHelp]
calc.chm
calc.hlp

[CalcCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[CharMapCopyFilesSys]
charmap.exe
bopomofo.uce
gb2312.uce
getuname.dll
ideograf.uce
kanji_1.uce
kanji_2.uce
korean.uce
shiftjis.uce
subrange.uce

[CharMapCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[CharMapCopyFilesHelp]
charmap.chm
charmap.hlp

[CharMapCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[ClipBookCopyFilesSys]
clipbrd.exe

[ClipBookCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[DeskpaperOldCopyFilesSys]
256color.bmp
arcade.bmp
arches.bmp
argyle.bmp
ball.bmp
cars.bmp
castle.bmp
chitz.bmp
egypt.bmp
honey.bmp
leaves.bmp
marble.bmp
redbrick.bmp
rivets.bmp
squares.bmp
tartan.bmp
thatch.bmp
winlogo.bmp
zigzag.bmp


[DeskpaperCopyFilesSys]
%Blulac16%,             blulac16.bmp
%Bubbles%,              bubbles.bmp
%Coffeebn%,             coffeebn.bmp
%Feather%,              feather.bmp
%Gonefish%,             gonefish.bmp
%Grnstone%,             grnstone.bmp
%Prairie%,              prairie.bmp
%Rhody%,                rhody.bmp
%Rvrsumid%,             rvrsumid.bmp
%Santafe%,              santafe.bmp
%Zapotec%,              zapotec.bmp

[DeskpaperCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[MousePointDelOldFiles]
;
; This is used to remove these files from system32 directory
; when the component is uninstalled. We don't do this on
; install or upgrade because 3.51 users could then wind up
; with dangling registry references.
;
appstar2.ani
appstar3.ani
appstart.ani
banana.ani
barber.ani
coin.ani
counter.ani
dinosau2.ani
dinosaur.ani
drum.ani
fillitup.ani
hand.ani
handapst.ani
handnesw.ani
handno.ani
handns.ani
handnwse.ani
handwait.ani
handwe.ani
horse.ani
hourgla2.ani
hourgla3.ani
hourglas.ani
metronom.ani
piano.ani
rainbow.ani
raindrop.ani
sizenesw.ani
sizens.ani
sizenwse.ani
sizewe.ani
stopwtch.ani
vanisher.ani
wagtail.ani
3dgarro.cur
3dgmove.cur
3dgnesw.cur
3dgno.cur
3dgns.cur
3dgnwse.cur
3dgwe.cur
3dsmove.cur
3dsns.cur
3dsnwse.cur
3dwarro.cur
3dwmove.cur
3dwnesw.cur
3dwno.cur
3dwns.cur
3dwnwse.cur
3dwwe.cur
cross.cur
harrow.cur
hcross.cur
hibeam.cur
hmove.cur
hnesw.cur
hnodrop.cur
hns.cur
hnwse.cur
hwe.cur
lappstrt.cur
larrow.cur
lcross.cur
libeam.cur
lmove.cur
lnesw.cur
lnodrop.cur
lns.cur
lnwse.cur
lwait.cur
lwe.cur

[MousePointCopyFilesSys]
appstar2.ani
appstar3.ani
appstart.ani
banana.ani
barber.ani
coin.ani
counter.ani
dinosau2.ani
dinosaur.ani
drum.ani
fillitup.ani
hand.ani
handapst.ani
handnesw.ani
handno.ani
handns.ani
handnwse.ani
handwait.ani
handwe.ani
horse.ani
hourgla2.ani
hourgla3.ani
hourglas.ani
metronom.ani
piano.ani
rainbow.ani
raindrop.ani
sizenesw.ani
sizens.ani
sizenwse.ani
sizewe.ani
stopwtch.ani
vanisher.ani
wagtail.ani
3dgarro.cur
3dgmove.cur
3dgnesw.cur
3dgno.cur
3dgns.cur
3dgnwse.cur
3dgwe.cur
3dsmove.cur
3dsns.cur
3dsnwse.cur
3dwarro.cur
3dwmove.cur
3dwnesw.cur
3dwno.cur
3dwns.cur
3dwnwse.cur
3dwwe.cur
cross.cur
harrow.cur
hcross.cur
hibeam.cur
hmove.cur
hnesw.cur
hnodrop.cur
hns.cur
hnwse.cur
hwe.cur
lappstrt.cur
larrow.cur
lcross.cur
libeam.cur
lmove.cur
lnesw.cur
lnodrop.cur
lns.cur
lnwse.cur
lwait.cur
lwe.cur

[MousePointCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[ClipBook.AddReg]
HKCR,"clpfile","",0x00000002,"%CLIPBOARD_CLIP%"
HKCR,"clpfile\DefaultIcon","",0x00020002,"%systemroot%\system32\clipbrd.exe,1"
HKCR,"clpfile\shell",,0x00000012
HKCR,"clpfile\shell\open",,0x00000012
HKCR,"clpfile\shell\open\command","",0x00000002,"clipbrd.exe %1"


[MousePointSchemes]
HKLM,%MP_REG_SCHEMES%,%WindowsDefault%,,""",,,,,,,,,,,,,"""
HKLM,%MP_REG_SCHEMES%,%WindowsAnimated%,,"""%10%\%Cursors%\rainbow.ani,,%10%\%Cursors%\appstart.ani,%10%\%Cursors%\hourglas.ani,%10%\%Cursors%\cross.cur,,,,%10%\%Cursors%\sizens.ani,%10%\%Cursors%\sizewe.ani,%10%\%Cursors%\sizenwse.ani,%10%\%Cursors%\sizenesw.ani,,"""
HKLM,%MP_REG_SCHEMES%,%3DWhite%,,"""%10%\%Cursors%\3dwarro.cur,,%10%\%Cursors%\appstar3.ani,%10%\%Cursors%\hourgla3.ani,%10%\%Cursors%\cross.cur,,,%10%\%Cursors%\3dwno.cur,%10%\%Cursors%\3dwns.cur,%10%\%Cursors%\3dwwe.cur,%10%\%Cursors%\3dwnwse.cur,%10%\%Cursors%\3dwnesw.cur,%10%\%Cursors%\3dwmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%Hands1%,,"""%10%\%Cursors%\harrow.cur,,%10%\%Cursors%\handapst.ani,%10%\%Cursors%\hand.ani,%10%\%Cursors%\hcross.cur,%10%\%Cursors%\hibeam.cur,,%10%\%Cursors%\hnodrop.cur,%10%\%Cursors%\hns.cur,%10%\%Cursors%\hwe.cur,%10%\%Cursors%\hnwse.cur,%10%\%Cursors%\hnesw.cur,%10%\%Cursors%\hmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%Hands2%,,"""%10%\%Cursors%\harrow.cur,,%10%\%Cursors%\handapst.ani,%10%\%Cursors%\handwait.ani,%10%\%Cursors%\hcross.cur,%10%\%Cursors%\hibeam.cur,,%10%\%Cursors%\handno.ani,%10%\%Cursors%\handns.ani,%10%\%Cursors%\handwe.ani,%10%\%Cursors%\handnwse.ani,%10%\%Cursors%\handnesw.ani,%10%\%Cursors%\hmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%Dinosaur%,,"""%10%\%Cursors%\3dgarro.cur,,%10%\%Cursors%\dinosaur.ani,%10%\%Cursors%\dinosau2.ani,%10%\%Cursors%\cross.cur,,,%10%\%Cursors%\banana.ani,%10%\%Cursors%\3dsns.cur,%10%\%Cursors%\3dgwe.cur,%10%\%Cursors%\3dsnwse.cur,%10%\%Cursors%\3dgnesw.cur,%10%\%Cursors%\3dsmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%OldFashioned%,,"""%10%\%Cursors%\harrow.cur,,%10%\%Cursors%\horse.ani,%10%\%Cursors%\barber.ani,%10%\%Cursors%\hcross.cur,%10%\%Cursors%\hibeam.cur,,%10%\%Cursors%\coin.ani,%10%\%Cursors%\3dgns.cur,%10%\%Cursors%\3dgwe.cur,%10%\%Cursors%\3dgnwse.cur,%10%\%Cursors%\3dgnesw.cur,%10%\%Cursors%\3dgmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%Conductor%,,"""%10%\%Cursors%\harrow.cur,,%10%\%Cursors%\drum.ani,%10%\%Cursors%\metronom.ani,%10%\%Cursors%\hcross.cur,%10%\%Cursors%\hibeam.cur,,%10%\%Cursors%\piano.ani,%10%\%Cursors%\hns.cur,%10%\%Cursors%\hwe.cur,%10%\%Cursors%\hnwse.cur,%10%\%Cursors%\hnesw.cur,%10%\%Cursors%\hmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%Magnified%,,"""%10%\%Cursors%\larrow.cur,,%10%\%Cursors%\lappstrt.cur,%10%\%Cursors%\lwait.cur,%10%\%Cursors%\lcross.cur,%10%\%Cursors%\libeam.cur,,%10%\%Cursors%\lnodrop.cur,%10%\%Cursors%\lns.cur,%10%\%Cursors%\lwe.cur,%10%\%Cursors%\lnwse.cur,%10%\%Cursors%\lnesw.cur,%10%\%Cursors%\lmove.cur,"""
HKLM,%MP_REG_SCHEMES%,%Variations%,,"""%10%\%Cursors%\fillitup.ani,,%10%\%Cursors%\raindrop.ani,%10%\%Cursors%\counter.ani,%10%\%Cursors%\cross.cur,,,%10%\%Cursors%\wagtail.ani,%10%\%Cursors%\sizens.ani,%10%\%Cursors%\sizewe.ani,%10%\%Cursors%\sizenwse.ani,%10%\%Cursors%\sizenesw.ani,"""
HKLM,%MP_REG_SCHEMES%,%3DBronze%,,"""%10%\%Cursors%\3dgarro.cur,,%10%\%Cursors%\appstar2.ani,%10%\%Cursors%\hourgla2.ani,%10%\%Cursors%\cross.cur,,,%10%\%Cursors%\3dgno.cur,%10%\%Cursors%\3dgns.cur,%10%\%Cursors%\3dgwe.cur,%10%\%Cursors%\3dgnwse.cur,%10%\%Cursors%\3dgnesw.cur,%10%\%Cursors%\3dgmove.cur,"""


[PaintCopyFilesSys]
mspaint.exe

[PaintCopyFilesSys.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"


[PaintCopyFilesHelp]
mspaint.chm
mspaint.hlp

[PaintCopyFilesHelp.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[PaintAddReg]
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652},,2,%BitmapImage%
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\AuxUserType\2,,2,%BitmapImage%
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\AuxUserType\3,,2,"Paint"
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\DataFormats\PriorityCacheFormats,"#8",2,""
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\DefaultIcon,,0x00020002,"%systemroot%\system32\mspaint.exe,1"
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\InprocHandler32,,2,ole32.dll
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\Insertable,,2,
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\LocalServer32,,0x00020002,"%systemroot%\system32\mspaint.exe"
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\MiscStatus,,2,"32"
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\ProgID,,2,Paint.Picture
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\Verb\0,,2,"%HotKey_Edit%,0,2"
HKCR,CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\Verb\1,,2,"%HotKey_Open%,0,2"

HKCR,CLSID\{0003000A-0000-0000-C000-000000000046},,2,%BitmapImage%
HKCR,CLSID\{0003000A-0000-0000-C000-000000000046}\TreatAs,,2,{D3E34B21-9D75-101A-8C3D-00AA001A1652}
HKCR,CLSID\{0003000A-0000-0000-C000-000000000046}\Ole1Class,,2,PBrush
HKCR,CLSID\{0003000A-0000-0000-C000-000000000046}\ProgID,,2,PBrush

HKCR,Paint.Picture,,2,%BitmapImage%
HKCR,Paint.Picture\FriendlyTypeName,,0x00020002,"@%systemroot%\system32\mspaint.exe,-59419"
HKCR,Paint.Picture\CLSID,,2,{D3E34B21-9D75-101A-8C3D-00AA001A1652}
HKCR,Paint.Picture\DefaultIcon,,0x00020002,"%systemroot%\system32\mspaint.exe,1"
HKCR,Paint.Picture\Insertable,,2,
HKCR,Paint.Picture\protocol\StdFileEditing\server,,0x00020002,"%systemroot%\system32\mspaint.exe"
HKCR,Paint.Picture\protocol\StdFileEditing\verb\0,,2,%HotKey_Edit%
HKCR,Paint.Picture\shell\edit\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" ""%%1"""
HKCR,Paint.Picture\shell\print\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" /p ""%%1"""
HKCR,Paint.Picture\shell\printto\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""

HKCR,PBrush,,2,%PaintbrushPicture%
HKCR,PBrush\FriendlyTypeName,,0x00020002,"@%systemroot%\system32\mspaint.exe,-59418"
HKCR,PBrush\CLSID,,2,{0003000a-0000-0000-C000-000000000046}
HKCR,PBrush\protocol\StdFileEditing\server,,0x00020002,"%systemroot%\system32\mspaint.exe"
HKCR,PBrush\protocol\StdFileEditing\verb\0,,2,%HotKey_Edit%
HKCR,PBrush\shell\edit\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" ""%%1"""
HKCR,PBrush\shell\print\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" /p ""%%1"""
HKCR,PBrush\shell\printto\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""

;HKCR,Applications\mspaint.exe,FriendlyAppName,0x00020002,"@%systemroot%\system32\mspaint.exe,-xxx"
HKCR,Applications\mspaint.exe\shell\edit\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" ""%%1"""
;this are the extensions supported by gdi+
HKCR,Applications\mspaint.exe\SupportedTypes,.bmp,,
HKCR,Applications\mspaint.exe\SupportedTypes,.dib,,
HKCR,Applications\mspaint.exe\SupportedTypes,.rle,,
HKCR,Applications\mspaint.exe\SupportedTypes,.jpg,,
HKCR,Applications\mspaint.exe\SupportedTypes,.jpeg,,
HKCR,Applications\mspaint.exe\SupportedTypes,.jpe,,
HKCR,Applications\mspaint.exe\SupportedTypes,.jfif,,
HKCR,Applications\mspaint.exe\SupportedTypes,.gif,,
HKCR,Applications\mspaint.exe\SupportedTypes,.emf,,
HKCR,Applications\mspaint.exe\SupportedTypes,.wmf,,
HKCR,Applications\mspaint.exe\SupportedTypes,.tif,,
HKCR,Applications\mspaint.exe\SupportedTypes,.tiff,,
HKCR,Applications\mspaint.exe\SupportedTypes,.png,,
HKCR,Applications\mspaint.exe\SupportedTypes,.ico,,

HKCR,"*\OpenWithList\MSPaint.exe",,,
HKCR,"SystemFileAssociations\image\OpenWithList\MSPaint.exe",,,
HKCR,SystemFileAssociations\image\shell\edit\command,,0x00020002,"""%systemroot%\system32\mspaint.exe"" ""%%1"""

HKCR,.bmp,,2,Paint.Picture
HKCR,.bmp\ShellNew,NullFile,2,""
HKCR,.bmp\OpenWithList\MSPaint.exe,,,

[TemplatesCopyFiles]
amipro.sam
excel.xls
excel4.xls
lotus.wk4
powerpnt.ppt
presenta.shw
quattro.wb2
sndrec.wav
winword.doc
winword2.doc
wordpfct.wpd
wordpfct.wpg


[Templates.AddReg]
HKCR,".doc\Word.Document.6\ShellNew",FileName,,"winword.doc"
HKCR,".doc\WordDocument\ShellNew",FileName,,"winword2.doc"
HKCR,".doc\WordPad.Document.1\ShellNew",NullFile,,""
HKCR,".ppt\PowerPoint.Show.4\ShellNew",FileName,,"powerpnt.ppt"
HKCR,".sam\AmiProDocument\ShellNew",FileName,,"amipro.sam"
HKCR,".shw\Presentations31.Show\ShellNew",FileName,,"presenta.shw"
HKCR,".wav\ShellNew",FileName,,"sndrec.wav"
HKCR,".wb2\QuattroPro.Notebook.6\ShellNew",FileName,,"quattro.wb2"
HKCR,".wb2\QuattroPro.Graph.6\ShellNew",FileName,,"quattro.wb2"
HKCR,".wk4\123Worksheet\ShellNew",FileName,,"lotus.wk4"
HKCR,".wpd\WPWin6.1File\ShellNew",FileName,,"wordpfct.wpd"
HKCR,".wpg\TextArt.Document\ShellNew",FileName,,"wordpfct.wpg"
HKCR,".wpg\WPDraw30.Drawing\ShellNew",FileName,,"wordpfct.wpg"
HKCR,".wpg\WPDraw30.Chart\ShellNew",FileName,,"wordpfct.wpg"
HKCR,".xls\Excel.Sheet.5\ShellNew",FileName,,"excel.xls"
HKCR,".xls\ExcelWorksheet\ShellNew",FileName,,"excel4.xls"

; Set the Hidden attribute on the ShellNew Folder:
; R=1; H=2; S=4; HS=6; SHR=7
HKLM,%KEY_RENAME%\Win,,,%25%
HKLM,%KEY_RENAME%\Win,ShellNew,,"ShellNew,2"


[Templates.DelReg]
; delete the old entries
HKCR,.doc\ShellNew,NullFile
HKCR,.xls\ShellNew,NullFile
HKCR,.doc\ShellNew,FileName
HKCR,.ppt\ShellNew,FileName
HKCR,.pre\ShellNew,FileName
HKCR,.sam\ShellNew,FileName
HKCR,.wk4\ShellNew,FileName
HKCR,.xls\ShellNew,FileName
HKCR,.shw\ShellNew,FileName
HKCR,.wav\ShellNew,NullFile
HKCR,.wb2\ShellNew,FileName
HKCR,.wpd\ShellNew,FileName
HKCR,.wpg\ShellNew,FileName
HKCR,.wpf\ShellNew,FileName
HKCR,.wpw\ShellNew,FileName
HKCR,.evy\ShellNew,FileName
HKCR,".wk4\1-2-3 Worksheet\ShellNew",FileName
HKCR,".sam\AmiPro Document\ShellNew",FileName
HKCR,".pre\Freelance Presentation\ShellNew",FileName

[Strings]
KEY_OPTIONAL = "SOFTWARE\Microsoft\Windows\CurrentVersion\Setup\OptionalComponents"
KEY_RENAME   = "Software\Microsoft\Windows\CurrentVersion\RenameFiles"
KEY_CURRENT  = "Software\Microsoft\Windows\CurrentVersion"
Access_GROUP = "Accessories"
AccessTop_DESC = "Accessories"
SystemTools_GROUP = "Accessories\System Tools"
AccessTop_TIP  = "Includes Windows accessories and enhancements for your computer."
AccessUtil_Desc = "Accessories and Utilities"
AccessUtil_TIP = "Includes Windows Accessories and Utilities for your computer."
Calc_DESC       = "Calculator"
Calc_TIP        = "Enables you to perform calculations."
Calc_Infotip    = "Performs basic arithmetic tasks with an on-screen calculator."
CharMap_DESC    = "Character Map"
CharMap_TIP     = "Enables you to insert symbols and characters into documents."
CharMap_Infotip = "Selects special characters and copies them to your document."
ClipBook_DESC       = "Clipboard Viewer"
ClipBook_TIP        = "Enables you to view or store information in a clipbook."
ClipBook_Infotip    = "Use Clipboard Viewer to view, save, and share text that you have cut and/or copied from documents."
CLIPBOARD_CLIP      = "Clipboard Clip"
Deskpaper_DESC = "Desktop Wallpaper"
Deskpaper_TIP  = "Includes background images and pictures for your Windows desktop."
Blueday         = "Blue Monday.bmp"
Blulac16        = "Blue Lace 16.bmp"
Blumon16        = "Blue Monday 16.bmp"
Bubbles         = "Soap Bubbles.bmp"
Coffee16        = "Coffee Bean 16.bmp"
Coffeebn        = "Coffee Bean.bmp"
Feather         = "FeatherTexture.bmp"
Fidlhead        = "Fiddle Head.bmp"
Furry16         = "Furry Dog 16.bmp"
Furrydog        = "Furry Dog.bmp"
Geometrx        = "Geometrix.bmp"
Gonefish        = "Gone Fishing.bmp"
Grnstone        = "Greenstone.bmp"
Hazy16          = "Hazy Autumn 16.bmp"
Hikingbt        = "Hiking Boot.bmp"
Leaves16        = "Leaf Fossils 16.bmp"
Lether16        = "Leather 16.bmp"
Mpltrail        = "Maple Trails.bmp"
Pglyph16        = "Petroglyph 16.bmp"
Pool            = "Swimming Pool.bmp"
Prairie         = "Prairie Wind.bmp"
Rhody           = "Rhododendron.bmp"
Rvrsumid        = "River Sumida.bmp"
Santafe         = "Santa Fe Stucco.bmp"
Seaside         = "Seaside.bmp"
Seside16        = "Seaside 16.bmp"
Snakeskn        = "Snakeskin.bmp"
Solstice        = "Solstice.bmp"
Upstrm16        = "Upstream 16.bmp"
Zapotec         = "Zapotec.bmp"
Zaptec16        = "Zapotec 16.bmp"
MousePoint_DESC = "Mouse Pointers"
MousePoint_TIP  = "A variety of easy-to-see pointer sizes for your mouse."
MP_REG_SCHEMES  = "Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes"
Cursors         = "Cursors"
WindowsDefault  = "Windows Default"
WindowsAnimated = "Windows Animated"
3DWhite         = "3D-White"
Hands1          = "Hands 1"
Hands2          = "Hands 2"
Dinosaur        = "Dinosaur"
OldFashioned    = "Old Fashioned"
Conductor       = "Conductor"
Magnified       = "Magnified"
Variations      = "Variations"
3DBronze        = "3D-Bronze"
Paint_DESC          = "Paint"
Paint_TIP           = "Enables you to create, modify, or view pictures."
Paint_Infotip       = "Creates and edits drawings, and displays and edits scanned photos."
PaintbrushPicture   = "Paintbrush Picture"
Edit                = "Edit"
BitmapImage         = "Bitmap Image"
HotKey_Edit         = "&Edit"
HotKey_Open         = "&Open"
QuickView_DESC = "Quick View"
QuickView_TIP  = "Enables you to preview a document without opening it."
ScreenSave_DESC= "Screen Savers"
ScreenSave_TIP = "Display moving images when your computer is idle to prevent damage to your screen."
SSOpenGL_DESC  = "OpenGL Screen Savers"
SSOpenGL_TIP   = "3 dimensional screen savers."
SSStandard_DESC= "Standard Screen Savers"
SSStandard_TIP = "Basic screen savers."
Templates_DESC = "Document Templates"
Templates_TIP  = "Allows you to easily create new documents for your most common programs."
Templates_Dir  = "Templates"




[calc]
CopyFiles=wCalcCopyFilesSys

[calcuninstall]
DelFiles=wCalcCopyFilesSys

[charmap]
CopyFiles=wCharMapCopyFilesSys

[charmapuninstall]
DelFiles=wCharMapCopyFilesSys

[clipbook]
CopyFiles=wClipBookCopyFilesSys
AddReg=wClipBook.AddReg

[clipbookuninstall]
DelFiles=wClipBookCopyFilesSys

[deskpaper]
CopyFiles=wDeskpaperCopyFilesSys
DelFiles=wDeskpaperOldCopyFilesSys

[deskpaperuninstall]
DelFiles=wDeskpaperOldCopyFilesSys,wDeskpaperCopyFilesSys

[mousepoint]
CopyFiles=wMousePointCopyFilesSys
AddReg=wMousePointSchemes

[mousepointuninstall]
DelFiles=wMousePointCopyFilesSys,wMousePointDelOldFiles
DelReg=wMousePointSchemes

[paint]
CopyFiles=wPaintCopyFilesSys
AddReg=wPaintAddReg

[paintuninstall]
DelFiles=wPaintCopyFilesSys
DelReg=wPaintAddReg

[templates]
AddReg=wTemplates.AddReg
DelReg=wTemplates.DelReg

[templatesuninstall]
DelReg=wTemplates.AddReg

[wCharMapCopyFilesSys]
charmap.exe,wcharmap.exe
bopomofo.uce,wbopomofo.uce
gb2312.uce,wgb2312.uce
getuname.dll,wgetuname.dll
ideograf.uce,wideograf.uce
kanji_1.uce,wkanji_1.uce
kanji_2.uce,wkanji_2.uce
korean.uce,wkorean.uce
shiftjis.uce,wshiftjis.uce
subrange.uce,wsubrange.uce

[wDeskpaperOldCopyFilesSys]
256color.bmp
arcade.bmp
arches.bmp
argyle.bmp
ball.bmp
cars.bmp
castle.bmp
chitz.bmp
egypt.bmp
honey.bmp
leaves.bmp
marble.bmp
redbrick.bmp
rivets.bmp
squares.bmp
tartan.bmp
thatch.bmp
winlogo.bmp
zigzag.bmp

[wTemplates.AddReg]
HKCR,".doc\Word.Document.6\ShellNew",FileName,0x00004000,winword.doc
HKCR,".doc\WordDocument\ShellNew",FileName,0x00004000,winword2.doc
HKCR,".doc\WordPad.Document.1\ShellNew",NullFile,0x00004000,
HKCR,".ppt\PowerPoint.Show.4\ShellNew",FileName,0x00004000,powerpnt.ppt
HKCR,".sam\AmiProDocument\ShellNew",FileName,0x00004000,amipro.sam
HKCR,".shw\Presentations31.Show\ShellNew",FileName,0x00004000,presenta.shw
HKCR,".wav\ShellNew",FileName,0x00004000,sndrec.wav
HKCR,".wb2\QuattroPro.Notebook.6\ShellNew",FileName,0x00004000,quattro.wb2
HKCR,".wb2\QuattroPro.Graph.6\ShellNew",FileName,0x00004000,quattro.wb2
HKCR,".wk4\123Worksheet\ShellNew",FileName,0x00004000,lotus.wk4
HKCR,".wpd\WPWin6.1File\ShellNew",FileName,0x00004000,wordpfct.wpd
HKCR,".wpg\TextArt.Document\ShellNew",FileName,0x00004000,wordpfct.wpg
HKCR,".wpg\WPDraw30.Drawing\ShellNew",FileName,0x00004000,wordpfct.wpg
HKCR,".wpg\WPDraw30.Chart\ShellNew",FileName,0x00004000,wordpfct.wpg
HKCR,".xls\Excel.Sheet.5\ShellNew",FileName,0x00004000,excel.xls
HKCR,".xls\ExcelWorksheet\ShellNew",FileName,0x00004000,excel4.xls
HKLM,"Software\Microsoft\Windows\CurrentVersion\RenameFiles\Win",,0x00004000,"%10%"
HKLM,"Software\Microsoft\Windows\CurrentVersion\RenameFiles\Win",ShellNew,0x00004000,"ShellNew,2"

[wTemplates.DelReg]
HKCR,".doc\ShellNew",NullFile
HKCR,".xls\ShellNew",NullFile
HKCR,".doc\ShellNew",FileName
HKCR,".ppt\ShellNew",FileName
HKCR,".pre\ShellNew",FileName
HKCR,".sam\ShellNew",FileName
HKCR,".wk4\ShellNew",FileName
HKCR,".xls\ShellNew",FileName
HKCR,".shw\ShellNew",FileName
HKCR,".wav\ShellNew",NullFile
HKCR,".wb2\ShellNew",FileName
HKCR,".wpd\ShellNew",FileName
HKCR,".wpg\ShellNew",FileName
HKCR,".wpf\ShellNew",FileName
HKCR,".wpw\ShellNew",FileName
HKCR,".evy\ShellNew",FileName
HKCR,".wk4\1-2-3 Worksheet\ShellNew",FileName
HKCR,".sam\AmiPro Document\ShellNew",FileName
HKCR,".pre\Freelance Presentation\ShellNew",FileName

[wPaintAddReg]
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}",,0x00004002,"Bitmap Image"
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\AuxUserType\2",,0x00004002,"Bitmap Image"
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\AuxUserType\3",,0x00004002,Paint
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\DataFormats\PriorityCacheFormats",#8,0x00004002,
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\DefaultIcon",,0x00024002,"%%systemroot%%\system32\mspaint.exe,1"
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\InprocHandler32",,0x00004002,ole32.dll
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\Insertable",,0x00004002,
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\LocalServer32",,0x00024002,"%%systemroot%%\system32\mspaint.exe"
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\MiscStatus",,0x00004002,32
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\ProgID",,0x00004002,Paint.Picture
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\Verb\0",,0x00004002,"&Edit,0,2"
HKCR,"CLSID\{D3E34B21-9D75-101A-8C3D-00AA001A1652}\Verb\1",,0x00004002,"&Open,0,2"
HKCR,"CLSID\{0003000A-0000-0000-C000-000000000046}",,0x00004002,"Bitmap Image"
HKCR,"CLSID\{0003000A-0000-0000-C000-000000000046}\TreatAs",,0x00004002,{D3E34B21-9D75-101A-8C3D-00AA001A1652}
HKCR,"CLSID\{0003000A-0000-0000-C000-000000000046}\Ole1Class",,0x00004002,PBrush
HKCR,"CLSID\{0003000A-0000-0000-C000-000000000046}\ProgID",,0x00004002,PBrush
HKCR,Paint.Picture,,0x00004002,"Bitmap Image"
HKCR,"Paint.Picture\FriendlyTypeName",,0x00024002,"@%%systemroot%%\system32\mspaint.exe,-59419"
HKCR,"Paint.Picture\CLSID",,0x00004002,{D3E34B21-9D75-101A-8C3D-00AA001A1652}
HKCR,"Paint.Picture\DefaultIcon",,0x00024002,"%%systemroot%%\system32\mspaint.exe,1"
HKCR,"Paint.Picture\Insertable",,0x00004002,
HKCR,"Paint.Picture\protocol\StdFileEditing\server",,0x00024002,"%%systemroot%%\system32\mspaint.exe"
HKCR,"Paint.Picture\protocol\StdFileEditing\verb\0",,0x00004002,&Edit
HKCR,"Paint.Picture\shell\edit\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" ""%%1"""
HKCR,"Paint.Picture\shell\print\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" /p ""%%1"""
HKCR,"Paint.Picture\shell\printto\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,PBrush,,0x00004002,"Paintbrush Picture"
HKCR,"PBrush\FriendlyTypeName",,0x00024002,"@%%systemroot%%\system32\mspaint.exe,-59418"
HKCR,"PBrush\CLSID",,0x00004002,{0003000a-0000-0000-C000-000000000046}
HKCR,"PBrush\protocol\StdFileEditing\server",,0x00024002,"%%systemroot%%\system32\mspaint.exe"
HKCR,"PBrush\protocol\StdFileEditing\verb\0",,0x00004002,&Edit
HKCR,"PBrush\shell\edit\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" ""%%1"""
HKCR,"PBrush\shell\print\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" /p ""%%1"""
HKCR,"PBrush\shell\printto\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" /pt ""%%1"" ""%%2"" ""%%3"" ""%%4"""
HKCR,"Applications\mspaint.exe\shell\edit\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" ""%%1"""
HKCR,"Applications\mspaint.exe\SupportedTypes",.bmp,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.dib,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.rle,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.jpg,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.jpeg,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.jpe,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.jfif,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.gif,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.emf,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.wmf,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.tif,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.tiff,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.png,0x00004000,
HKCR,"Applications\mspaint.exe\SupportedTypes",.ico,0x00004000,
HKCR,"*\OpenWithList\MSPaint.exe",,0x00004000,
HKCR,"SystemFileAssociations\image\OpenWithList\MSPaint.exe",,0x00004000,
HKCR,"SystemFileAssociations\image\shell\edit\command",,0x00024002,"""%%systemroot%%\system32\mspaint.exe"" ""%%1"""
HKCR,.bmp,,0x00004002,Paint.Picture
HKCR,".bmp\ShellNew",NullFile,0x00004002,
HKCR,".bmp\OpenWithList\MSPaint.exe",,0x00004000,

[wClipBookCopyFilesSys]
clipbrd.exe,wclipbrd.exe

[wCalcCopyFilesSys]
calc.exe,wcalc.exe

[wMousePointDelOldFiles]
appstar2.ani
appstar3.ani
appstart.ani
banana.ani
barber.ani
coin.ani
counter.ani
dinosau2.ani
dinosaur.ani
drum.ani
fillitup.ani
hand.ani
handapst.ani
handnesw.ani
handno.ani
handns.ani
handnwse.ani
handwait.ani
handwe.ani
horse.ani
hourgla2.ani
hourgla3.ani
hourglas.ani
metronom.ani
piano.ani
rainbow.ani
raindrop.ani
sizenesw.ani
sizens.ani
sizenwse.ani
sizewe.ani
stopwtch.ani
vanisher.ani
wagtail.ani
3dgarro.cur
3dgmove.cur
3dgnesw.cur
3dgno.cur
3dgns.cur
3dgnwse.cur
3dgwe.cur
3dsmove.cur
3dsns.cur
3dsnwse.cur
3dwarro.cur
3dwmove.cur
3dwnesw.cur
3dwno.cur
3dwns.cur
3dwnwse.cur
3dwwe.cur
cross.cur
harrow.cur
hcross.cur
hibeam.cur
hmove.cur
hnesw.cur
hnodrop.cur
hns.cur
hnwse.cur
hwe.cur
lappstrt.cur
larrow.cur
lcross.cur
libeam.cur
lmove.cur
lnesw.cur
lnodrop.cur
lns.cur
lnwse.cur
lwait.cur
lwe.cur

[wDeskpaperCopyFilesSys]
"Blue Lace 16.bmp",wblulac16.bmp
"Soap Bubbles.bmp",wbubbles.bmp
"Coffee Bean.bmp",wcoffeebn.bmp
FeatherTexture.bmp,wfeather.bmp
"Gone Fishing.bmp",wgonefish.bmp
Greenstone.bmp,wgrnstone.bmp
"Prairie Wind.bmp",wprairie.bmp
Rhododendron.bmp,wrhody.bmp
"River Sumida.bmp",wrvrsumid.bmp
"Santa Fe Stucco.bmp",wsantafe.bmp
Zapotec.bmp,wzapotec.bmp

[wMousePointSchemes]
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes","Windows Default",0x00004000,""",,,,,,,,,,,,,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes","Windows Animated",0x00004000,"""%10%\Cursors\rainbow.ani,,%10%\Cursors\appstart.ani,%10%\Cursors\hourglas.ani,%10%\Cursors\cross.cur,,,,%10%\Cursors\sizens.ani,%10%\Cursors\sizewe.ani,%10%\Cursors\sizenwse.ani,%10%\Cursors\sizenesw.ani,,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes",3D-White,0x00004000,"""%10%\Cursors\3dwarro.cur,,%10%\Cursors\appstar3.ani,%10%\Cursors\hourgla3.ani,%10%\Cursors\cross.cur,,,%10%\Cursors\3dwno.cur,%10%\Cursors\3dwns.cur,%10%\Cursors\3dwwe.cur,%10%\Cursors\3dwnwse.cur,%10%\Cursors\3dwnesw.cur,%10%\Cursors\3dwmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes","Hands 1",0x00004000,"""%10%\Cursors\harrow.cur,,%10%\Cursors\handapst.ani,%10%\Cursors\hand.ani,%10%\Cursors\hcross.cur,%10%\Cursors\hibeam.cur,,%10%\Cursors\hnodrop.cur,%10%\Cursors\hns.cur,%10%\Cursors\hwe.cur,%10%\Cursors\hnwse.cur,%10%\Cursors\hnesw.cur,%10%\Cursors\hmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes","Hands 2",0x00004000,"""%10%\Cursors\harrow.cur,,%10%\Cursors\handapst.ani,%10%\Cursors\handwait.ani,%10%\Cursors\hcross.cur,%10%\Cursors\hibeam.cur,,%10%\Cursors\handno.ani,%10%\Cursors\handns.ani,%10%\Cursors\handwe.ani,%10%\Cursors\handnwse.ani,%10%\Cursors\handnesw.ani,%10%\Cursors\hmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes",Dinosaur,0x00004000,"""%10%\Cursors\3dgarro.cur,,%10%\Cursors\dinosaur.ani,%10%\Cursors\dinosau2.ani,%10%\Cursors\cross.cur,,,%10%\Cursors\banana.ani,%10%\Cursors\3dsns.cur,%10%\Cursors\3dgwe.cur,%10%\Cursors\3dsnwse.cur,%10%\Cursors\3dgnesw.cur,%10%\Cursors\3dsmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes","Old Fashioned",0x00004000,"""%10%\Cursors\harrow.cur,,%10%\Cursors\horse.ani,%10%\Cursors\barber.ani,%10%\Cursors\hcross.cur,%10%\Cursors\hibeam.cur,,%10%\Cursors\coin.ani,%10%\Cursors\3dgns.cur,%10%\Cursors\3dgwe.cur,%10%\Cursors\3dgnwse.cur,%10%\Cursors\3dgnesw.cur,%10%\Cursors\3dgmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes",Conductor,0x00004000,"""%10%\Cursors\harrow.cur,,%10%\Cursors\drum.ani,%10%\Cursors\metronom.ani,%10%\Cursors\hcross.cur,%10%\Cursors\hibeam.cur,,%10%\Cursors\piano.ani,%10%\Cursors\hns.cur,%10%\Cursors\hwe.cur,%10%\Cursors\hnwse.cur,%10%\Cursors\hnesw.cur,%10%\Cursors\hmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes",Magnified,0x00004000,"""%10%\Cursors\larrow.cur,,%10%\Cursors\lappstrt.cur,%10%\Cursors\lwait.cur,%10%\Cursors\lcross.cur,%10%\Cursors\libeam.cur,,%10%\Cursors\lnodrop.cur,%10%\Cursors\lns.cur,%10%\Cursors\lwe.cur,%10%\Cursors\lnwse.cur,%10%\Cursors\lnesw.cur,%10%\Cursors\lmove.cur,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes",Variations,0x00004000,"""%10%\Cursors\fillitup.ani,,%10%\Cursors\raindrop.ani,%10%\Cursors\counter.ani,%10%\Cursors\cross.cur,,,%10%\Cursors\wagtail.ani,%10%\Cursors\sizens.ani,%10%\Cursors\sizewe.ani,%10%\Cursors\sizenwse.ani,%10%\Cursors\sizenesw.ani,"""
HKLM,"Software\Microsoft\Windows\CurrentVersion\Control Panel\Cursors\Schemes",3D-Bronze,0x00004000,"""%10%\Cursors\3dgarro.cur,,%10%\Cursors\appstar2.ani,%10%\Cursors\hourgla2.ani,%10%\Cursors\cross.cur,,,%10%\Cursors\3dgno.cur,%10%\Cursors\3dgns.cur,%10%\Cursors\3dgwe.cur,%10%\Cursors\3dgnwse.cur,%10%\Cursors\3dgnesw.cur,%10%\Cursors\3dgmove.cur,"""

[wPaintCopyFilesSys]
mspaint.exe,wmspaint.exe

[wMousePointCopyFilesSys]
appstar2.ani,wappstar2.ani
appstar3.ani,wappstar3.ani
appstart.ani,wappstart.ani
banana.ani,wbanana.ani
barber.ani,wbarber.ani
coin.ani,wcoin.ani
counter.ani,wcounter.ani
dinosau2.ani,wdinosau2.ani
dinosaur.ani,wdinosaur.ani
drum.ani,wdrum.ani
fillitup.ani,wfillitup.ani
hand.ani,whand.ani
handapst.ani,whandapst.ani
handnesw.ani,whandnesw.ani
handno.ani,whandno.ani
handns.ani,whandns.ani
handnwse.ani,whandnwse.ani
handwait.ani,whandwait.ani
handwe.ani,whandwe.ani
horse.ani,whorse.ani
hourgla2.ani,whourgla2.ani
hourgla3.ani,whourgla3.ani
hourglas.ani,whourglas.ani
metronom.ani,wmetronom.ani
piano.ani,wpiano.ani
rainbow.ani,wrainbow.ani
raindrop.ani,wraindrop.ani
sizenesw.ani,wsizenesw.ani
sizens.ani,wsizens.ani
sizenwse.ani,wsizenwse.ani
sizewe.ani,wsizewe.ani
stopwtch.ani,wstopwtch.ani
vanisher.ani,wvanisher.ani
wagtail.ani,wwagtail.ani
3dgarro.cur,w3dgarro.cur
3dgmove.cur,w3dgmove.cur
3dgnesw.cur,w3dgnesw.cur
3dgno.cur,w3dgno.cur
3dgns.cur,w3dgns.cur
3dgnwse.cur,w3dgnwse.cur
3dgwe.cur,w3dgwe.cur
3dsmove.cur,w3dsmove.cur
3dsns.cur,w3dsns.cur
3dsnwse.cur,w3dsnwse.cur
3dwarro.cur,w3dwarro.cur
3dwmove.cur,w3dwmove.cur
3dwnesw.cur,w3dwnesw.cur
3dwno.cur,w3dwno.cur
3dwns.cur,w3dwns.cur
3dwnwse.cur,w3dwnwse.cur
3dwwe.cur,w3dwwe.cur
cross.cur,wcross.cur
harrow.cur,wharrow.cur
hcross.cur,whcross.cur
hibeam.cur,whibeam.cur
hmove.cur,whmove.cur
hnesw.cur,whnesw.cur
hnodrop.cur,whnodrop.cur
hns.cur,whns.cur
hnwse.cur,whnwse.cur
hwe.cur,whwe.cur
lappstrt.cur,wlappstrt.cur
larrow.cur,wlarrow.cur
lcross.cur,wlcross.cur
libeam.cur,wlibeam.cur
lmove.cur,wlmove.cur
lnesw.cur,wlnesw.cur
lnodrop.cur,wlnodrop.cur
lns.cur,wlns.cur
lnwse.cur,wlnwse.cur
lwait.cur,wlwait.cur
lwe.cur,wlwe.cur

[wClipBook.AddReg]
HKCR,clpfile,,0x00004002,"Clipboard Clip"
HKCR,"clpfile\DefaultIcon",,0x00024002,"%%systemroot%%\system32\clipbrd.exe,1"
HKCR,"clpfile\shell",,0x00004012
HKCR,"clpfile\shell\open",,0x00004012
HKCR,"clpfile\shell\open\command",,0x00004002,"clipbrd.exe %%1"

[DestinationDirs]
wCharMapCopyFilesSys=16425
wDeskpaperOldCopyFilesSys=10
wClipBookCopyFilesSys=16425
wCalcCopyFilesSys=16425
wMousePointDelOldFiles=16425
wDeskpaperCopyFilesSys=10
wPaintCopyFilesSys=16425
wMousePointCopyFilesSys=10,Cursors
