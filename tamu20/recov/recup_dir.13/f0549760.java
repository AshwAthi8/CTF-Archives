A,ISDN1.AddReg

[Strings]
MSFT  = "Microsoft"
Mfg   = "NTT-ME CORPORATION"
ISDN1   = "MN128 TA Card PC1"

[ISDN1.AddReg]  ;MN128 TA Card PC1
HKR,, Properties, 1, 00,00,00,00, 32,00,00,00, ff,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 00,c2,01,00, 00,f4,01,00

[All_ISDN]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
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
HKR, Responses, "0<cr>",  		1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr>",  		1, 02, 00, 00,00,00,00, 00,00,00,00 ; CONNECT
HKR, Responses, "2<cr>",  		1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",  		1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",  		1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr>",  		1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr>",  		1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",  		1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",  		1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType, 1, 03
HKR,,PowerDelay,1, DC,05,00,00

[MfgAddAll_ISDN]
HKR, Settings,  CallSetupFailTimer,,"S7=<#>"
HKR,, InactivityScale,1,0a,00,00,00
HKR, Settings, InactivityTimeout,,"\T<#>"
HKR, Init, 2,,"AT&FE0X1<cr>"
HKR, Init, 3,,"ATQ0V1&C1&D2&E0&S0!A0S0=0<cr>"
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
HKR, Protocol\ISDN\HDLC_PPP_56K,1,,"AT&Q5$S10S146=1S172=0%%B10<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K,1,,"AT&Q5$S12S146=1S172=0%%B12<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K,1,,"AT&Q5$S12S146=1S172=1S0=3!G51%%B14<cr>"
HKR, Protocol\ISDN\V110_9DOT6K,1,,"AT&Q0$S5%%B5<cr>"
HKR, Protocol\ISDN\V110_19DOT2K,1,,"AT&Q0$S7%%B7<cr>"
HKR, Protocol\ISDN\V110_38DOT4K,1,,"AT&Q0$S8%%B8<cr>"
HKR, Protocol\ISDN\AUTO_1CH,1,,"AT&Q7S146=1!C0%%B12<cr>"
HKR, Protocol\ISDN\AUTO_2CH,1,,"AT&Q7S146=1!C0S172=1S0=3!G51%%B14<cr>"
