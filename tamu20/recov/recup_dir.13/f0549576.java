FT  = "Microsoft"
Mfg   = "nissei"
ISDN1 = "nissei 128DE-PNA"

[ISDN1.AddReg]  ;nissei 128DE-PNA
HKR,, Properties, 1, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 00,c2,01,00, 00,f4,01,00
HKR,, DCB, 1, 1C,00,00,00, 00,c2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[All_ISDN]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, ISDN\SwitchType, SWITCH_INS64,, "AT<cr>"
HKR, ISDN\NvSave, 1,, "AT<cr>"
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

[EXTERNAL]
HKR,, DeviceType, 1, 01

[MfgAddAll_ISDN]
HKR, Init, 2,,"AT&F<cr>"
HKR, Init, 3,,"ATE0S0=0V1&D2&C1<cr>"
HKR, Monitor, 1,,"ATS0=0<cr>"
HKR, Monitor, 2,,"None"
HKR, Hangup, 1,,"ATH<cr>"
HKR, Answer, 1,,"ATA<cr>"
HKR,, Reset,,"ATZ<cr>"
HKR, Settings,  Prefix,,"AT"
HKR, Settings,  Terminator,,"<cr>"
HKR, Settings,  DialPrefix,,"D"
HKR, Settings,  DialSuffix,,""
HKR, Settings,  FlowControl_Off,,"&K0"
HKR, Settings,  FlowControl_Hard,,"&K3"
HKR, Settings,  FlowControl_Soft,,"&K4"
HKR, Responses,"<cr><lf>CONNECT 9600<cr><lf>", 1,02,00, 80,25,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 19200<cr><lf>", 1,02,00, 00,4b,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 32000<cr><lf>", 1,02,00, 00,7d,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 38400<cr><lf>", 1,02,00, 00,96,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 57600<cr><lf>", 1,02,00, 00,e1,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 64000<cr><lf>", 1,02,00, 00,fa,00,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 115200<cr><lf>", 1,02,00, 00,c2,01,00, 00,00,00,00
HKR, Responses,"<cr><lf>CONNECT 230400<cr><lf>", 1,02,00, 00,84,03,00, 00,00,00,00
HKR, Protocol\ISDN\HDLC_PPP_64K,1,,"AT&Q1<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K,1,,"AT&Q2<cr>"
HKR, Protocol\ISDN\V110_9DOT6K,1,,"AT&Q0$S1<cr>"
HKR, Protocol\ISDN\V110_19DOT2K,1,,"AT&Q0$S2<cr>"
HKR, Protocol\ISDN\V110_38DOT4K,1,,"AT&Q0$S3<cr>"
HKR, Protocol\ISDN\V110_57DOT6K,1,,"AT&Q0$S4<cr>"
HKR, Protocol\ISDN\PIAFS_OUTGOING,1,,"AT&Q3<cr>"
HKR, Protocol\ISDN\PIAFS_INCOMING,1,,"AT&Q3<cr>"
HKR, Protocol\ISDN\AUTO_1CH,1,,"AT&Q1<cr>"
HKR, Protocol\ISDN\AUTO_2CH,1,,"AT&Q2<cr>"
