odels.NTamd64]
%ISDN% = ISDN, USB\VID_07C8&PID_0202	;MN128-SOHO PAL

[ISDN.NT]
CopyFiles=FakeModemCopyFileSection
AddReg=All_ISDN,MfgAddAll_ISDN,EXTERNAL,ISDN.AddReg

[ISDN.NT.Services]
AddService=usbser, 0x00000000, LowerFilter_Service_Inst

[ISDN.NT.HW]
AddReg=LowerFilterAddReg

;USB
[LowerFilterAddReg]
HKR,,"LowerFilters",0x00010000,"usbser"

[LowerFilter_Service_Inst]
DisplayName=%USBFilterString%
ServiceType= 1
StartType  = 3
ErrorControl = 0
ServiceBinary = %12%\usbser.sys

[FakeModemCopyFileSection]
usbser.sys,,,0x20

[Strings]
Mfg   = "NTT-ME CORPORATION"
ISDN = "MN128-SOHO PAL (USB)"
USBFilterString="MN128-SOHO PAL (USB)"

[ISDN.AddReg]  ;MN128-SOHO PAL
HKR,, Properties, 1, 00,00,00,00, ff,00,00,00, ff,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 00,84,03,00, 00,f4,01,00

[All_ISDN]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"


HKR, ISDN\Init,1,,"AT<cr>"
HKR, ISDN\Init, 2,,"AT&F<cr>"
HKR, ISDN\Init, 3,,"ATV1X2&Q7E0&D2&C1S0=0<cr>"
HKR, ISDN\SwitchType, Switch_INS64,,"AT<cr>"
HKR, ISDN\NvSave, 1,, "AT<cr>"
HKR, Init,      1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1d, 00, 00,00,00,00, 00,00,00,00

[EXTERNAL]
HKR,, DeviceType, 1, 01

[MfgAddAll_ISDN]
HKR, Settings,  CallSetupFailTimer,,"S7=<#>"
HKR,, InactivityScale,1,0a,00,00,00
HKR, Settings, InactivityTimeout,,"\T<#>"
HKR, Init, 2,,"AT&F<cr>"
HKR, Init, 3,,"ATV1X2&Q7E0&D2&C1S0=0<cr>"
HKR, Monitor, 1,,"ATS0=0<cr>"
HKR, Monitor, 2,,"None"
HKR, Hangup, 1,,"ATH<cr>"
HKR, Answer, 1,,"ATA<cr>"
HKR,, Reset,,"ATZ<cr>"
HKR, Settings,  Prefix,,"AT"
HKR, Settings,  Terminator,,"<cr>"
HKR, Settings,  DialPrefix,,"D"
HKR, Settings,  DialSuffix,,""
HKR, Settings,  FlowControl_Off,,"\Q0"
HKR, Settings,  FlowControl_Hard,,"\Q3"
HKR, Settings,  FlowControl_Soft,,"\Q1"
HKR, Responses,"<cr><lf>CONNECT 9600<cr><lf>", 1,02,00, 80,25,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 19200<cr><lf>", 1,02,00, 00,4b,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 32000<cr><lf>", 1,02,00, 00,7d,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 38400<cr><lf>", 1,02,00, 00,96,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 56000<cr><lf>", 1,02,00, c0,da,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 64000<cr><lf>", 1,02,00, 00,fa,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 128000<cr><lf>", 1,02,00, 00,f4,01,00, 00,00,00,00

HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00   ;OK
HKR, Responses, "1<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00   ;CONNECT
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00   ;RING
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00   ;NO CARRIER
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00   ;ERROR
HKR, Responses, "5<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00   ;CONNECT at 1200
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00   ;NO DIALTONE
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00   ;BUSY
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00   ;NO ANSWER
HKR, Protocol\ISDN\HDLC_PPP_64K,1,,"AT&Q5$S12S146=1S172=0%%B12<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K,1,,"AT&Q5$S12S146=1S172=1%%B14<cr>"
HKR, Protocol\ISDN\AUTO_1CH,1,,"AT&Q7S146=1!C0%%B12<cr>"
HKR, Protocol\ISDN\AUTO_2CH,1,,"AT&Q7S146=1!C0S172=1%%B14<cr>"
