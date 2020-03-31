; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf


[DestinationDirs]
utopia.files          = 25,Media   ; LDID_SHARED\Media

[Optional Components]
media_utopia

[media_utopia]
OptionDesc      = %mediautodesc%
Tip             = %mediautotip%
Parent          = MultiM
CopyFiles       = utopia.files
Addreg=utopia.reg
IconIndex       = 61                    ;Speaker mini-icon for dialogs
Uninstall       = utopia_remove
Modes                   = 0,1,2,3

[utopia_remove]
DelFiles        = utopia.files
DelReg          = utopia.remove.DelReg

[ExtSound]
AddReg=Ext_addreg

[SoundUpdate]
AddReg=Sound_addreg

[Ext_addreg]
HKCU,"Control Panel\Sound","ExtendedSounds",0x00000002,"yes"

[Sound_addreg]
HKCU,"AppEvents",,0x00000012
HKCU,"AppEvents\EventLabels",,0x00000012
HKCU,"AppEvents\EventLabels\.Default","",0x00000000,"%DEFAULT_BEEP%"
HKCU,"AppEvents\EventLabels\AppGPFault","",0x00000000,"%PROGRAM_ERROR%"
HKCU,"AppEvents\EventLabels\Close","",0x00000000,"%CLOSE_PROGRAM%"
HKCU,"AppEvents\EventLabels\CriticalBatteryAlarm","",0x00000000,"%CRITICAL_BATTERY_ALARM%"
HKCU,"AppEvents\EventLabels\DeviceConnect","",0x00000000,"%DEVICE_CONNECT%"
HKCU,"AppEvents\EventLabels\DeviceDisconnect","",0x00000000,"%DEVICE_DISCONNECT%"
HKCU,"AppEvents\EventLabels\DeviceFail","",0x00000000,"%DEVICE_FAIL%"
HKCU,"AppEvents\EventLabels\EmptyRecycleBin","",0x00000000,"%EMPTY_RECYCLE_BIN%"
HKCU,"AppEvents\EventLabels\LowBatteryAlarm","",0x00000000,"%LOW_BATTERY_ALARM%"
HKCU,"AppEvents\EventLabels\Maximize","",0x00000000,"%MAXIMIZE%"
HKCU,"AppEvents\EventLabels\MenuCommand","",0x00000000,"%MENU_COMMAND%"
HKCU,"AppEvents\EventLabels\MenuPopup","",0x00000000,"%MENU_POPUP%"
HKCU,"AppEvents\EventLabels\Minimize","",0x00000000,"%MINIMIZE%"
HKCU,"AppEvents\EventLabels\MailBeep","",0x00000000,"%NEW_MAIL_NOTIFICATION%"
HKCU,"AppEvents\EventLabels\Navigating","",0x00000000,"%START_NAVIGATION%"
HKCU,"AppEvents\EventLabels\Open","",0x00000000,"%OPEN_PROGRAM%"
HKCU,"AppEvents\EventLabels\PrintComplete","",0x00000000,"%PRINT_COMPLETE%"
HKCU,"AppEvents\EventLabels\RestoreDown","",0x00000000,"%RESTORE_DOWN%"
HKCU,"AppEvents\EventLabels\RestoreUp","",0x00000000,"%RESTORE_UP%"
HKCU,"AppEvents\EventLabels\SystemAsterisk","",0x00000000,"%ASTERISK%"
HKCU,"AppEvents\EventLabels\SystemExclamation","",0x00000000,"%EXCLAMATION%"
HKCU,"AppEvents\EventLabels\SystemExit","",0x00000000,"%EXIT_WINDOWS_NT%"
HKCU,"AppEvents\EventLabels\SystemHand","",0x00000000,"%CRITICAL_STOP%"
HKCU,"AppEvents\EventLabels\SystemNotification","",0x00000000,"%SYSTEM_NOTIFY%"
HKCU,"AppEvents\EventLabels\SystemQuestion","",0x00000000,"%QUESTION%"
HKCU,"AppEvents\EventLabels\SystemStart","",0x00000000,"%START_WINDOWS_NT%"
HKCU,"AppEvents\EventLabels\WindowsLogoff","",0x00000000,"%WINDOWS_LOGOFF%"
HKCU,"AppEvents\EventLabels\WindowsLogon","",0x00000000,"%WINDOWS_LOGON%"
HKCU,"AppEvents\EventLabels\.Default","DispFileName",0x00000000,"@mmsys.cpl,-5824"
HKCU,"AppEvents\EventLabels\AppGPFault","DispFileName",0x00000000,"@mmsys.cpl,-5825"
HKCU,"AppEvents\EventLabels\Close","DispFileName",0x00000000,"@mmsys.cpl,-5826"
HKCU,"AppEvents\EventLabels\CriticalBatteryAlarm","DispFileName",0x00000000,"@mmsys.cpl,-5827"
HKCU,"AppEvents\EventLabels\DeviceConnect","DispFileName",0x00000000,"@mmsys.cpl,-5828"
HKCU,"AppEvents\EventLabels\DeviceDisconnect","DispFileName",0x00000000,"@mmsys.cpl,-5829"
HKCU,"AppEvents\EventLabels\DeviceFail","DispFileName",0x00000000,"@mmsys.cpl,-5830"
HKCU,"AppEvents\EventLabels\EmptyRecycleBin","DispFileName",0x00000000,"@mmsys.cpl,-5831"
HKCU,"AppEvents\EventLabels\LowBatteryAlarm","DispFileName",0x00000000,"@mmsys.cpl,-5832"
HKCU,"AppEvents\EventLabels\Maximize","DispFileName",0x00000000,"@mmsys.cpl,-5833"
HKCU,"AppEvents\EventLabels\MenuCommand","DispFileName",0x00000000,"@mmsys.cpl,-5834"
HKCU,"AppEvents\EventLabels\MenuPopup","DispFileName",0x00000000,"@mmsys.cpl,-5835"
HKCU,"AppEvents\EventLabels\Minimize","DispFileName",0x00000000,"@mmsys.cpl,-5836"
HKCU,"AppEvents\EventLabels\MailBeep","DispFileName",0x00000000,"@mmsys.cpl,-5837"
HKCU,"AppEvents\EventLabels\Navigating","DispFileName",0x00000000,"@mmsys.cpl,-5838"
HKCU,"AppEvents\EventLabels\Open","DispFileName",0x00000000,"@mmsys.cpl,-5839"
HKCU,"AppEvents\EventLabels\PrintComplete","DispFileName",0x00000000,"@mmsys.cpl,-5840"
HKCU,"AppEvents\EventLabels\RestoreDown","DispFileName",0x00000000,"@mmsys.cpl,-5841"
HKCU,"AppEvents\EventLabels\RestoreUp","DispFileName",0x00000000,"@mmsys.cpl,-5842"
HKCU,"AppEvents\EventLabels\SystemAsterisk","DispFileName",0x00000000,"@mmsys.cpl,-5843"
HKCU,"AppEvents\EventLabels\SystemExclamation","DispFileName",0x00000000,"@mmsys.cpl,-5845"
HKCU,"AppEvents\EventLabels\SystemExit","DispFileName",0x00000000,"@mmsys.cpl,-5846"
HKCU,"AppEvents\EventLabels\SystemHand","DispFileName",0x00000000,"@mmsys.cpl,-5847"
HKCU,"AppEvents\EventLabels\SystemNotification","DispFileName",0x00000000,"@mmsys.cpl,-5848"
HKCU,"AppEvents\EventLabels\SystemQuestion","DispFileName",0x00000000,"@mmsys.cpl,-5849"
HKCU,"AppEvents\EventLabels\SystemStart","DispFileName",0x00000000,"@mmsys.cpl,-5850"
HKCU,"AppEvents\EventLabels\WindowsLogoff","DispFileName",0x00000000,"@mmsys.cpl,-5852"
HKCU,"AppEvents\EventLabels\WindowsLogon","DispFileName",0x00000000,"@mmsys.cpl,-5853"
HKCU,"AppEvents\Schemes","",0x00000000,".Default"
HKCU,"AppEvents\Schemes\Apps",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default","",0x00000000,"Windows"
HKCU,"AppEvents\Schemes\Apps\.Default","DispFileName",0x00000000,"@mmsys.cpl,-5856"
HKCU,"AppEvents\Schemes\Apps\.Default\.Default",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Close",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\Close\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Close\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\CriticalBatteryAlarm",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\DeviceConnect",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\DeviceDisconnect",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\DeviceFail",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\LowBatteryAlarm",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\MailBeep",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Open",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\Open\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\Open\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\PrintComplete",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\PrintComplete\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\PrintComplete\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\SystemAsterisk",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExclamation",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExit",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemHand",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemNotification",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion\.Current","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion\.Default","",0x00020000,""
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart\.Current","",0x00020000,"%SystemRoot%\media\%WINDOWS_XP_STARTUP%"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart\.Default","",0x00020000,"%SystemRoot%\media\%WINDOWS_XP_STARTUP%"
HKCU,"AppEvents\Schemes\Apps\.Default\WindowsLogoff",,0x00000012
HKCU,"AppEvents\Schemes\Apps\.Default\WindowsLogon",,0x00000012
HKCU,"AppEvents\Schemes\Apps\Explorer","",0x00000002,"%WINDOWS_NT_EXPLORER%"
HKCU,"AppEvents\Schemes\Apps\Explorer","DispFileName",0x00000000,"@mmsys.cpl,-5854"
HKCU,"AppEvents\Schemes\Apps\Explorer\EmptyRecycleBin",,0x00000012
HKCU,"AppEvents\Schemes\Apps\Explorer\Navigating",,0x00000012
HKCU,"AppEvents\Schemes\Names",,0x00000012
HKCU,"AppEvents\Schemes\Names\.Default","",0x00000002,"%WINDOWS_DEFAULT%"
HKCU,"AppEvents\Schemes\Names\.None","",0x00000002,"%NO_SOUNDS%"


;--- Utopia Sound Scheme Install Sections ------------
[utopia.files]
%UTOPIA_RECYCLE%.WAV     ,utopiare.wav
%UTOPIA_DEFAULT%.WAV     ,utopiade.wav
%UTOPIA_WINDOWSSTART%.WAV,utopiawi.wav
%UTOPIA_WINDOWSEXIT%.WAV ,utopia~1.wav
%UTOPIA_CRITICALSTOP%.WAV,utopiacr.wav
%UTOPIA_QUESTION%.WAV    ,utopiaqu.wav
%UTOPIA_EXCLAMATION%.WAV ,utopiaex.wav
%UTOPIA_ASTERISK%.WAV    ,utopiaas.wav
%UTOPIA_OPEN%.WAV        ,utopiaop.wav
%UTOPIA_CLOSE%.WAV       ,utopiacl.wav
%UTOPIA_MAXIMIZE%.WAV    ,utopiama.wav
%UTOPIA_MINIMIZE%.WAV    ,utopiami.wav
%UTOPIA_RESTOREDOWN%.WAV ,utopia~3.wav
%UTOPIA_RESTOREUP%.WAV   ,utopia~4.wav
%UTOPIA_ERROR%.WAV       ,utopiaer.wav
%UTOPIA_MENUCOMMAND%.WAV ,utopiame.wav
%UTOPIA_MENUPOPUP%.WAV   ,utopia~2.wav

[utopia.files.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)"


[utopia.reg]
HKCU,AppEvents\Schemes\Names\Utopia0,,0x00020000,"%V_UTOPIA%"
HKCU,AppEvents\Schemes\Apps\Explorer,,0x00020000,"%V_EXPLORER%"
HKCU,AppEvents\Schemes\Apps\Explorer\EmptyRecycleBin\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_RECYCLE%.wav"
HKCU,%KEY_DEFSCH%\.Default\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_DEFAULT%.wav"
HKCU,%KEY_DEFSCH%\SystemStart\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_WINDOWSSTART%.wav"
HKCU,%KEY_DEFSCH%\SystemExit\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_WINDOWSEXIT%.wav"
HKCU,%KEY_DEFSCH%\SystemHand\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_CRITICALSTOP%.wav"
HKCU,%KEY_DEFSCH%\SystemQuestion\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_QUESTION%.wav"
HKCU,%KEY_DEFSCH%\SystemExclamation\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_EXCLAMATION%.wav"
HKCU,%KEY_DEFSCH%\SystemAsterisk\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_ASTERISK%.wav"
HKCU,%KEY_DEFSCH%\Open\Utopia0,,0x00020000,
HKCU,%KEY_DEFSCH%\Close\Utopia0,,0x00020000,
HKCU,%KEY_DEFSCH%\Maximize\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_MAXIMIZE%.wav"
HKCU,%KEY_DEFSCH%\Minimize\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_MINIMIZE%.wav"
HKCU,%KEY_DEFSCH%\RestoreDown\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_RESTOREDOWN%.wav"
HKCU,%KEY_DEFSCH%\RestoreUp\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_RESTOREUP%.wav"
HKCU,%KEY_DEFSCH%\AppGPFault\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_ERROR%.wav"
HKCU,%KEY_DEFSCH%\MenuCommand\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_MENUCOMMAND%.wav"
HKCU,%KEY_DEFSCH%\MenuPopup\Utopia0,,0x00020000,"%SystemRoot%\media\%UTOPIA_MENUPOPUP%.wav"

HKCU,AppEvents\Schemes\NewSchemes\Utopia,,0x00020000,

[utopia.remove.DelReg]
HKCU,AppEvents\Schemes\Names\Utopia0
HKCU,AppEvents\Schemes\Apps\Explorer\EmptyRecycleBin\Utopia0
HKCU,%KEY_DEFSCH%\.Default\Utopia0
HKCU,%KEY_DEFSCH%\SystemStart\Utopia0
HKCU,%KEY_DEFSCH%\SystemExit\Utopia0
HKCU,%KEY_DEFSCH%\SystemHand\Utopia0
HKCU,%KEY_DEFSCH%\SystemQuestion\Utopia0
HKCU,%KEY_DEFSCH%\SystemExclamation\Utopia0
HKCU,%KEY_DEFSCH%\SystemAsterisk\Utopia0
HKCU,%KEY_DEFSCH%\Open\Utopia0
HKCU,%KEY_DEFSCH%\Close\Utopia0
HKCU,%KEY_DEFSCH%\Maximize\Utopia0
HKCU,%KEY_DEFSCH%\Minimize\Utopia0
HKCU,%KEY_DEFSCH%\RestoreDown\Utopia0
HKCU,%KEY_DEFSCH%\RestoreUp\Utopia0
HKCU,%KEY_DEFSCH%\AppGPFault\Utopia0
HKCU,%KEY_DEFSCH%\MenuCommand\Utopia0
HKCU,%KEY_DEFSCH%\MenuPopup\Utopia0
;--------------------------------------------------


[Strings]
;Non-Localizable strings:
KEY_OPTIONAL   = "SOFTWARE\Microsoft\Windows\CurrentVersion\Setup\OptionalComponents"
KEY_DEFSCH     = "AppEvents\Schemes\Apps\.Default"
KEY_APPS       = "AppEvents\Schemes\Apps"
KEY_MEDIA      = "SYSTEM\CurrentControlSet\Control\MediaResources"
WINDOWS_XP_BALLOON="Windows XP Balloon.wav"
WINDOWS_XP_BATTERY_CRITICAL="Windows XP Battery Critical.wav"
WINDOWS_XP_BATTERY_LOW="Windows XP Battery Low.wav"
WINDOWS_XP_CRITICAL_STOP="Windows XP Critical Stop.wav"
WINDOWS_XP_DEFAULT="Windows XP Default.wav"
WINDOWS_XP_DING="Windows XP Ding.wav"
WINDOWS_XP_ERROR="Windows XP Error.wav"
WINDOWS_XP_EXCLAMATION="Windows XP Exclamation.wav"
WINDOWS_XP_HARDWARE_FAIL="Windows XP Hardware Fail.wav"
WINDOWS_XP_HARDWARE_INSERT="Windows XP Hardware Insert.wav"
WINDOWS_XP_HARDWARE_REMOVE="Windows XP Hardware Remove.wav"
WINDOWS_XP_LOGOFF="Windows XP Logoff Sound.wav"
WINDOWS_XP_LOGON="Windows XP Logon Sound.wav"
WINDOWS_XP_MENU="Windows XP Menu Command.wav"
WINDOWS_XP_MINIMIZE="Windows XP Minimize.wav"
WINDOWS_XP_NOTIFY="Windows XP Notify.wav"
WINDOWS_XP_PRINT="Windows XP Print complete.wav"
WINDOWS_XP_RECYCLE="Windows XP Recycle.wav"
WINDOWS_XP_RESTORE="Windows XP Restore.wav"
WINDOWS_XP_RINGIN="Windows XP Ringin.wav"
WINDOWS_XP_RINGOUT="Windows XP Ringout.wav"
WINDOWS_XP_SHUTDOWN="Windows XP Shutdown.wav"
WINDOWS_XP_START="Windows XP Start.wav"
WINDOWS_XP_STARTUP="Windows XP Startup.wav"
;Localizable strings:
mediaclipdesc="Sample Sounds"
mediacliptip="Sample sounds for playback on your machine"
mediautodesc="Utopia Sound Scheme"
mediautotip="Utopia Sound Scheme files"
V_EXPLORER="Windows Explorer"
V_UTOPIA = "Utopia Sound Scheme"
UTOPIA_RECYCLE = "Utopia Recycle"
UTOPIA_DEFAULT = "Utopia Default"
UTOPIA_WINDOWSSTART = "Utopia Windows Start"
UTOPIA_WINDOWSEXIT = "Utopia Windows Exit"
UTOPIA_CRITICALSTOP = "Utopia Critical Stop"
UTOPIA_QUESTION = "Utopia Question"
UTOPIA_EXCLAMATION = "Utopia Exclamation"
UTOPIA_ASTERISK = "Utopia Asterisk"
UTOPIA_OPEN = "Utopia Open"
UTOPIA_CLOSE = "Utopia Close"
UTOPIA_MAXIMIZE = "Utopia Maximize"
UTOPIA_MINIMIZE = "Utopia Minimize"
UTOPIA_RESTOREDOWN = "Utopia Restore Down"
UTOPIA_RESTOREUP = "Utopia Restore Up"
UTOPIA_ERROR = "Utopia Error"
UTOPIA_MENUCOMMAND = "Utopia Menu Command"
UTOPIA_MENUPOPUP = "Utopia Menu Popup"
MMEDIA_DESC     = "Accessories\Multimedia"
ASTERISK="Asterisk"
CLOSE_PROGRAM="Close program"
CRITICAL_BATTERY_ALARM="Critical Battery Alarm"
CRITICAL_STOP="Critical Stop"
DEFAULT_BEEP="Default Beep"
DEVICE_CONNECT="Device Connect"
DEVICE_DISCONNECT="Device Disconnect"
DEVICE_FAIL="Device Failed to Connect"
EMPTY_RECYCLE_BIN="Empty Recycle Bin"
EXCLAMATION="Exclamation"
EXIT_WINDOWS_NT="Exit Windows"
LOW_BATTERY_ALARM="Low Battery Alarm"
MAXIMIZE="Maximize"
MENU_COMMAND="Menu command"
MENU_POPUP="Menu popup"
MINIMIZE="Minimize"
NEW_MAIL_NOTIFICATION="New Mail Notification"
NO_SOUNDS="No Sounds"
OPEN_PROGRAM="Open program"
PRINT_COMPLETE="Print Complete"
PROGRAM_ERROR="Program error"
QUESTION="Question"
RESTORE_DOWN="Restore Down"
RESTORE_UP="Restore Up"
START_NAVIGATION="Start Navigation"
START_WINDOWS_NT="Start Windows"
SYSTEM_NOTIFY="System Notification"
WINDOWS_DEFAULT="Windows Default"
WINDOWS_LOGOFF="Windows Logoff"
WINDOWS_LOGON="Windows Logon"
WINDOWS_NT_DEFAULT="Windows 2000 Default"
WINDOWS_NT_EXPLORER="Windows Explorer"




[media_utopia]
AddReg=wutopia.reg

[utopia_remove]
DelReg=wutopia.remove.DelReg

[extsound]
AddReg=wExt_addreg

[soundupdate]
AddReg=wSound_addreg

[wutopia.reg]
HKCU,"AppEvents\Schemes\Names\Utopia0",,0x00024000,"Utopia Sound Scheme"
HKCU,"AppEvents\Schemes\Apps\Explorer",,0x00024000,"Windows Explorer"
HKCU,"AppEvents\Schemes\Apps\Explorer\EmptyRecycleBin\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Recycle.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\.Default\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Default.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Windows Start.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExit\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Windows Exit.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemHand\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Critical Stop.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Question.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExclamation\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Exclamation.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemAsterisk\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Asterisk.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\Open\Utopia0",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Close\Utopia0",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Maximize.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Minimize.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Restore Down.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Restore Up.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Error.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Menu Command.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup\Utopia0",,0x00024000,"%%SystemRoot%%\media\Utopia Menu Popup.wav"
HKCU,"AppEvents\Schemes\NewSchemes\Utopia",,0x00024000,

[wExt_addreg]
HKCU,"Control Panel\Sound",ExtendedSounds,0x00004002,yes

[wSound_addreg]
HKCU,AppEvents,,0x00004012
HKCU,"AppEvents\EventLabels",,0x00004012
HKCU,"AppEvents\EventLabels\.Default",,0x00004000,"Default Beep"
HKCU,"AppEvents\EventLabels\AppGPFault",,0x00004000,"Program error"
HKCU,"AppEvents\EventLabels\Close",,0x00004000,"Close program"
HKCU,"AppEvents\EventLabels\CriticalBatteryAlarm",,0x00004000,"Critical Battery Alarm"
HKCU,"AppEvents\EventLabels\DeviceConnect",,0x00004000,"Device Connect"
HKCU,"AppEvents\EventLabels\DeviceDisconnect",,0x00004000,"Device Disconnect"
HKCU,"AppEvents\EventLabels\DeviceFail",,0x00004000,"Device Failed to Connect"
HKCU,"AppEvents\EventLabels\EmptyRecycleBin",,0x00004000,"Empty Recycle Bin"
HKCU,"AppEvents\EventLabels\LowBatteryAlarm",,0x00004000,"Low Battery Alarm"
HKCU,"AppEvents\EventLabels\Maximize",,0x00004000,Maximize
HKCU,"AppEvents\EventLabels\MenuCommand",,0x00004000,"Menu command"
HKCU,"AppEvents\EventLabels\MenuPopup",,0x00004000,"Menu popup"
HKCU,"AppEvents\EventLabels\Minimize",,0x00004000,Minimize
HKCU,"AppEvents\EventLabels\MailBeep",,0x00004000,"New Mail Notification"
HKCU,"AppEvents\EventLabels\Navigating",,0x00004000,"Start Navigation"
HKCU,"AppEvents\EventLabels\Open",,0x00004000,"Open program"
HKCU,"AppEvents\EventLabels\PrintComplete",,0x00004000,"Print Complete"
HKCU,"AppEvents\EventLabels\RestoreDown",,0x00004000,"Restore Down"
HKCU,"AppEvents\EventLabels\RestoreUp",,0x00004000,"Restore Up"
HKCU,"AppEvents\EventLabels\SystemAsterisk",,0x00004000,Asterisk
HKCU,"AppEvents\EventLabels\SystemExclamation",,0x00004000,Exclamation
HKCU,"AppEvents\EventLabels\SystemExit",,0x00004000,"Exit Windows"
HKCU,"AppEvents\EventLabels\SystemHand",,0x00004000,"Critical Stop"
HKCU,"AppEvents\EventLabels\SystemNotification",,0x00004000,"System Notification"
HKCU,"AppEvents\EventLabels\SystemQuestion",,0x00004000,Question
HKCU,"AppEvents\EventLabels\SystemStart",,0x00004000,"Start Windows"
HKCU,"AppEvents\EventLabels\WindowsLogoff",,0x00004000,"Windows Logoff"
HKCU,"AppEvents\EventLabels\WindowsLogon",,0x00004000,"Windows Logon"
HKCU,"AppEvents\EventLabels\.Default",DispFileName,0x00004000,"@mmsys.cpl,-5824"
HKCU,"AppEvents\EventLabels\AppGPFault",DispFileName,0x00004000,"@mmsys.cpl,-5825"
HKCU,"AppEvents\EventLabels\Close",DispFileName,0x00004000,"@mmsys.cpl,-5826"
HKCU,"AppEvents\EventLabels\CriticalBatteryAlarm",DispFileName,0x00004000,"@mmsys.cpl,-5827"
HKCU,"AppEvents\EventLabels\DeviceConnect",DispFileName,0x00004000,"@mmsys.cpl,-5828"
HKCU,"AppEvents\EventLabels\DeviceDisconnect",DispFileName,0x00004000,"@mmsys.cpl,-5829"
HKCU,"AppEvents\EventLabels\DeviceFail",DispFileName,0x00004000,"@mmsys.cpl,-5830"
HKCU,"AppEvents\EventLabels\EmptyRecycleBin",DispFileName,0x00004000,"@mmsys.cpl,-5831"
HKCU,"AppEvents\EventLabels\LowBatteryAlarm",DispFileName,0x00004000,"@mmsys.cpl,-5832"
HKCU,"AppEvents\EventLabels\Maximize",DispFileName,0x00004000,"@mmsys.cpl,-5833"
HKCU,"AppEvents\EventLabels\MenuCommand",DispFileName,0x00004000,"@mmsys.cpl,-5834"
HKCU,"AppEvents\EventLabels\MenuPopup",DispFileName,0x00004000,"@mmsys.cpl,-5835"
HKCU,"AppEvents\EventLabels\Minimize",DispFileName,0x00004000,"@mmsys.cpl,-5836"
HKCU,"AppEvents\EventLabels\MailBeep",DispFileName,0x00004000,"@mmsys.cpl,-5837"
HKCU,"AppEvents\EventLabels\Navigating",DispFileName,0x00004000,"@mmsys.cpl,-5838"
HKCU,"AppEvents\EventLabels\Open",DispFileName,0x00004000,"@mmsys.cpl,-5839"
HKCU,"AppEvents\EventLabels\PrintComplete",DispFileName,0x00004000,"@mmsys.cpl,-5840"
HKCU,"AppEvents\EventLabels\RestoreDown",DispFileName,0x00004000,"@mmsys.cpl,-5841"
HKCU,"AppEvents\EventLabels\RestoreUp",DispFileName,0x00004000,"@mmsys.cpl,-5842"
HKCU,"AppEvents\EventLabels\SystemAsterisk",DispFileName,0x00004000,"@mmsys.cpl,-5843"
HKCU,"AppEvents\EventLabels\SystemExclamation",DispFileName,0x00004000,"@mmsys.cpl,-5845"
HKCU,"AppEvents\EventLabels\SystemExit",DispFileName,0x00004000,"@mmsys.cpl,-5846"
HKCU,"AppEvents\EventLabels\SystemHand",DispFileName,0x00004000,"@mmsys.cpl,-5847"
HKCU,"AppEvents\EventLabels\SystemNotification",DispFileName,0x00004000,"@mmsys.cpl,-5848"
HKCU,"AppEvents\EventLabels\SystemQuestion",DispFileName,0x00004000,"@mmsys.cpl,-5849"
HKCU,"AppEvents\EventLabels\SystemStart",DispFileName,0x00004000,"@mmsys.cpl,-5850"
HKCU,"AppEvents\EventLabels\WindowsLogoff",DispFileName,0x00004000,"@mmsys.cpl,-5852"
HKCU,"AppEvents\EventLabels\WindowsLogon",DispFileName,0x00004000,"@mmsys.cpl,-5853"
HKCU,"AppEvents\Schemes",,0x00004000,.Default
HKCU,"AppEvents\Schemes\Apps",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default",,0x00004000,Windows
HKCU,"AppEvents\Schemes\Apps\.Default",DispFileName,0x00004000,"@mmsys.cpl,-5856"
HKCU,"AppEvents\Schemes\Apps\.Default\.Default",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Close",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\Close\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Close\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\CriticalBatteryAlarm",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\DeviceConnect",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\DeviceDisconnect",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\DeviceFail",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\LowBatteryAlarm",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\MailBeep",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Open",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\Open\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\Open\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\PrintComplete",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\PrintComplete\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\PrintComplete\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\SystemAsterisk",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExclamation",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExit",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemHand",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemNotification",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion\.Current",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion\.Default",,0x00024000,
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart\.Current",,0x00024000,"%%SystemRoot%%\media\Windows XP Startup.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart\.Default",,0x00024000,"%%SystemRoot%%\media\Windows XP Startup.wav"
HKCU,"AppEvents\Schemes\Apps\.Default\WindowsLogoff",,0x00004012
HKCU,"AppEvents\Schemes\Apps\.Default\WindowsLogon",,0x00004012
HKCU,"AppEvents\Schemes\Apps\Explorer",,0x00004002,"Windows Explorer"
HKCU,"AppEvents\Schemes\Apps\Explorer",DispFileName,0x00004000,"@mmsys.cpl,-5854"
HKCU,"AppEvents\Schemes\Apps\Explorer\EmptyRecycleBin",,0x00004012
HKCU,"AppEvents\Schemes\Apps\Explorer\Navigating",,0x00004012
HKCU,"AppEvents\Schemes\Names",,0x00004012
HKCU,"AppEvents\Schemes\Names\.Default",,0x00004002,"Windows Default"
HKCU,"AppEvents\Schemes\Names\.None",,0x00004002,"No Sounds"

[wutopia.remove.DelReg]
HKCU,"AppEvents\Schemes\Names\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\Explorer\EmptyRecycleBin\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\.Default\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\SystemStart\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExit\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\SystemHand\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\SystemQuestion\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\SystemExclamation\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\SystemAsterisk\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\Open\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\Close\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\Maximize\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\Minimize\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreDown\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\RestoreUp\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\AppGPFault\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\MenuCommand\Utopia0",,0x00004000
HKCU,"AppEvents\Schemes\Apps\.Default\MenuPopup\Utopia0",,0x00004000

