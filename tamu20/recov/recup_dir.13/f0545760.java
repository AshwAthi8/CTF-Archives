,EnumPropPages,,	"modemui.dll,EnumPropPages"

[MDMGL009.RS]
HKR,,DevLoader,,	*vcomm
HKR,,ConfigDialog,,	modemui.dll
HKR,,EnumPropPages,,	"modemui.dll,EnumPropPages"
HKR,,Contention,, 	""
HKR, User,Blacklist,,	""

[MDMGL009.ALL]
HKR, USR,"InBuild",,	"5.1"
HKR,,FriendlyDriver,,	unimodem.vxd
HKR,,PortSubClass,1,	02
HKR,,InactivityScale,1,	3c,00,00,00
HKR,,Reset,,		"ATZ<cr>"
HKR, Answer,1,,		"ATA<cr>"
HKR, Hangup,1,,		"ATH<cr>"
HKR, Init,1,,		"AT<cr>"
HKR, Init,2,,		"AT&F&D2V1Q0E0S0=0&C1<cr>"
HKR, Monitor,1,,	"ATS0=0<cr>"
HKR, Monitor,2,,	"None"
HKR, Settings, Prefix,,		"AT"
HKR, Settings, Blind_Off,,	"X4"
HKR, Settings, Blind_On,,	"X3"
HKR, Settings, CallSetupFailTimer,,"S7=<#>"
HKR, Settings, DialPrefix,,	"D"
HKR, Settings, DialSuffix,,	";"
HKR, Settings, InactivityTimeout,,"S19=<#>"
HKR, Settings, Modulation_Bell,,"B1"
HKR, Settings, Modulation_CCITT,,"B0"
HKR, Settings, SpeakerMode_Dial,,"M1"
HKR, Settings, SpeakerMode_Off,,"M0"
HKR, Settings, SpeakerMode_On,,	"M2"
HKR, Settings, SpeakerMode_Setup,,"M3"
HKR, Settings, Terminator,,	"<cr>"
HKR, Settings, Pulse,,		"P"
HKR, Settings, Tone,,		"T"
HKR, Settings, SpeakerVolume_High,,	"L3"
HKR, Settings, SpeakerVolume_Med,,	"L2"
HKR, Settings, SpeakerVolume_Low,,	"L0"
HKR, Responses, "0<cr>",			1,00,00,00,00,00,00,00,00,00,00
HKR, Responses, "1<cr>",			1,02,00,00,00,00,00,00,00,00,00
HKR, Responses, "2<cr>",			1,08,00,00,00,00,00,00,00,00,00
HKR, Responses, "3<cr>",			1,04,00,00,00,00,00,00,00,00,00
HKR, Responses, "4<cr>",			1,03,00,00,00,00,00,00,00,00,00
HKR, Responses, "5<cr>",			1,02,00,b0,04,00,00,00,00,00,00
HKR, Responses, "6<cr>",			1,05,00,00,00,00,00,00,00,00,00
HKR, Responses, "7<cr>",			1,06,00,00,00,00,00,00,00,00,00
HKR, Responses, "8<cr>",			1,07,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",	1,03,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",	1,04,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>",	1,05,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",	1,05,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",		1,06,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",	1,07,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>",		1,00,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",		1,08,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",	1,02,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/ARQ<cr><lf>",	1,02,02,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ<cr><lf>",1,02,02,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",	1,1D,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>",	1,1C,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>",		1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "OK<cr><lf>",		1,00,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>DIAG ",        1, 9e, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DIAG ",                1, 9e, 00, 00,00,00,00, 00,00,00,00

[MDMGL009.SPKR_RANGE]
HKR, Settings, SpeakerVolume_High,,	"L2"
HKR, Settings, SpeakerVolume_Med,,	"L1"

[MDMGL009.SP_HS]
HKR, Init,3,,"AT&A3X4&B1<cr>"
HKR, Settings, ErrorControl_Forced,,	"&M5"
HKR, Settings, ErrorControl_Off,,	"&M0"
HKR, Settings, ErrorControl_On,,	"&M4"
HKR, Settings, Compression_Off,,	"&K0"
HKR, Settings, Compression_On,,		"&K1"
HKR, Settings, FlowControl_Hard,,	"&H1&R2&I0"
HKR, Settings, FlowControl_Off,,	"&H0&I0&R1"
HKR, Settings, FlowControl_Soft,,	"&H2&I2&R1"

[MDMGL009.CR_HS]
HKR, Init,3,,"AT&A3X4&B1S14.0=0<cr>"
HKR, Settings, ErrorControl_Forced,,	"&M5"
HKR, Settings, ErrorControl_Off,,	"&M0"
HKR, Settings, ErrorControl_On,,	"&M4"
HKR, Settings, Compression_Off,,	"&K0"
HKR, Settings, Compression_On,,		"&K1"
HKR, Settings, FlowControl_Hard,,	"&H1&R2&I0"
HKR, Settings, FlowControl_Off,,	"&H0&I0&R1"
HKR, Settings, FlowControl_Soft,,	"&H2&I2&R1"
HKR, Responses, "<cr><lf>VOICE<cr><lf>",			1,03,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>",			1,01,00,00,00,00,00,00,00,00,00

[MDMGL009.HS_V250]
HKR, Init,3,,"AT+ILRR=1;+MR=1;+ER=1;+DR=1<cr>"
HKR, Settings, ErrorControl_Forced,,	"+ES=3,2,4;"
HKR, Settings, ErrorControl_Off,,	"+ES=1,0,1;"
HKR, Settings, ErrorControl_On,,	"+ES=3,0,2;"
HKR, Settings, Compression_Off,,	"+DS=0;"
HKR, Settings, Compression_On,,		"+DS=3,0;"
HKR, Settings, FlowControl_Hard,,	"+IFC=2,2;"
HKR, Settings, FlowControl_Off,,	"+IFC=0,0;"
HKR, Settings, FlowControl_Soft,,	"+IFC=1,1;"
HKR, Responses, "<cr><lf>+MCR: V21<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V22<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V22B<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V23C<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V32<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V32B<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V34<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V90<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+ER: NONE<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+ER: LAPM<cr><lf>",	1,01,02,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+ER: ALT<cr><lf>",	1,01,02,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+DR: NONE<cr><lf>",	1,01,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+DR: V42B<cr><lf>",	1,01,01,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+DR: V42B RD<cr><lf>",	1,01,01,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+DR: V42B TD<cr><lf>",	1,01,01,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+ILRR: 300<cr><lf>",	1,01,00,00,00,00,00,2C,01,00,00
HKR, Responses, "<cr><lf>+ILRR: 600<cr><lf>",	1,01,00,00,00,00,00,58,02,00,00
HKR, Responses, "<cr><lf>+ILRR: 1200<cr><lf>",	1,01,00,00,00,00,00,B0,04,00,00
HKR, Responses, "<cr><lf>+ILRR: 2400<cr><lf>",	1,01,00,00,00,00,00,60,09,00,00
HKR, Responses, "<cr><lf>+ILRR: 4800<cr><lf>",	1,01,00,00,00,00,00,C0,12,00,00
HKR, Responses, "<cr><lf>+ILRR: 9600<cr><lf>",	1,01,00,00,00,00,00,80,25,00,00
HKR, Responses, "<cr><lf>+ILRR: 19200<cr><lf>",	1,01,00,00,00,00,00,00,4B,00,00
HKR, Responses, "<cr><lf>+ILRR: 38400<cr><lf>",	1,01,00,00,00,00,00,00,96,00,00
HKR, Responses, "<cr><lf>+ILRR: 57600<cr><lf>",	1,01,00,00,00,00,00,00,E1,00,00
HKR, Responses, "<cr><lf>+ILRR: 115200<cr><lf>",1,01,00,00,00,00,00,00,C2,01,00
HKR, Responses, "<cr><lf>+MRR: 75<cr><lf>",	1,01,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 300<cr><lf>",	1,01,00,2C,01,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 600<cr><lf>",	1,01,00,58,02,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 1200<cr><lf>",	1,01,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 2400<cr><lf>",	1,01,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 4800<cr><lf>",	1,01,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 7200<cr><lf>",	1,01,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 9600<cr><lf>",	1,01,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 12000<cr><lf>",	1,01,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 14400<cr><lf>",	1,01,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 16800<cr><lf>",	1,01,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 19200<cr><lf>",	1,01,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 21600<cr><lf>",	1,01,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 24000<cr><lf>",	1,01,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 26400<cr><lf>",	1,01,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 28800<cr><lf>",	1,01,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 31200<cr><lf>",	1,01,00,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 33600<cr><lf>",	1,01,00,40,83,00,00,00,00,00,00

[MDMGL009.INT]
HKR,,DeviceType, 1,02

[MDMGL009.EXT]
HKR,,DeviceType, 1,01

[MDMGL009.USB]
HKR,,DeviceType, 1,01
HKR,,PortDriver,,wdmmdmld.vxd
HKR,,Contention,,""

[MDMGL009.PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[MDMGL009.MiniPCI]
HKR,,DeviceType, 1, 03
HKR,,DevLoader,0,*ntkern
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,,PortSubClass,1,02
HKR,,PortDriver,,wdmmdmld.vxd

[MDMGL009.ISDN_NVSAVE]	;Shared commands for all ISDN TA's and Courier-I
HKR, ISDN\Init, 1,,			"AT&F1E0Q0V1<cr>"
HKR, ISDN\NvSave,1,,			"AT&W<cr>"
HKR, ISDN\NvSave,2,,			"ATZ!<cr>"

[MDMGL009.ISDNTA_U]
HKR, ISDN\SwitchType, SWITCH_ATT1,,	"AT*W=4<cr>"
HKR, ISDN\SwitchType, SWITCH_DMS100,,	"AT*W=1<cr>"
HKR, ISDN\SwitchType, SWITCH_NI1,,   	"AT*W=2<cr>"
HKR, ISDN\SwitchType, SWITCH_NI2,,   	"AT*W=3<cr>"
HKR, ISDN\DirectoryNo,1,,		"AT*P2=%s<cr>"
HKR, ISDN\DirectoryNo,2,,		"AT*P1=%s<cr>"
HKR, ISDN\SetSpid, 1,,			"AT*S2=%s<cr>"
HKR, ISDN\SetSpid, 2,,			"AT*S1=%s<cr>"

;added and modified from latest driver
HKR, Protocol\ISDN\V120_56K,1,, 	"AT*VI=1*VO=1S67=2<cr>"
HKR, Protocol\ISDN\V120_64K,1,, 	"AT*VI=1*VO=1S67=0<cr>"
HKR, Protocol\ISDN\AUTO_2CH, 1,, 	"AT*PPP=0S67=0<cr>"
HKR, Protocol\ISDN\HDLC_PPP_56K, 1,, 	"AT*VI=5*VO=5*PPP=1S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K, 1,, 	"AT*VI=5*VO=5*PPP=1S67=0<cr>"
HKR, Protocol\ISDN\HDLC_PPP_112K, 1,, 	"AT*VI=5*VO=5*PPP=3S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K, 1,, 	"AT*VI=5*VO=5*PPP=3S67=0<cr>"
HKR, Protocol\ISDN\HDLC_PPP_DOV, 1,,	"AT*VI=5*VO=5*PPP=3S67=0S69=36<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K_CHAP, 1,, 	"AT*VI=5*VO=5*PPP=3S67=0*AU=1<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K_MSCHAP, 1,, 	"AT*VI=5*VO=5*PPP=3S67=0*AU=1<cr>"

[MDMGL009.ISDNTA_ST]
HKR, ISDN\SwitchType, SWITCH_DSS1,,	"AT*W=0<cr>"
HKR, ISDN\SetMSN,1,,			"AT*P2=%s<cr>"
HKR, ISDN\SetMSN,2,,			"AT*P1=%s<cr>"

;added and modified from latest driver
HKR, Protocol\ISDN\V120_56K,1,, 	"AT*VI=1*VO=1S67=2<cr>"
HKR, Protocol\ISDN\V120_64K,1,, 	"AT*VI=1*VO=1S67=0<cr>"
HKR, Protocol\ISDN\AUTO_2CH, 1,, 	"AT*PPP=0S67=0<cr>"
HKR, Protocol\ISDN\HDLC_PPP_56K, 1,, 	"AT*VI=5*VO=5*PPP=1S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K, 1,, 	"AT*VI=5*VO=5*PPP=1S67=0<cr>"
HKR, Protocol\ISDN\HDLC_PPP_112K, 1,, 	"AT*VI=5*VO=5*PPP=3S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K, 1,, 	"AT*VI=5*VO=5*PPP=3S67=0<cr>"
HKR, Protocol\ISDN\HDLC_PPP_DOV, 1,,	"AT*VI=5*VO=5*PPP=3S67=0S69=36<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K_CHAP, 1,, 	"AT*VI=5*VO=5*PPP=3S67=0*AU=1<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K_MSCHAP, 1,, 	"AT*VI=5*VO=5*PPP=3S67=0*AU=1<cr>"
HKR, Protocol\ISDN\X75_64K,1,,          "AT*VI=6*VO=6<cr>"

[MDMGL009.ISDNCI_ST]
HKR,ISDN\SwitchType,SWITCH_DSS1,, 	"AT*W=4<cr>	;DSS1
;HKR, ISDN\SwitchType, SWITCH_ETSI,,        "AT*W=4<cr>"   ;ETSI NET3
HKR, ISDN\SetMSN,1,,  "AT*P2=%s<cr>"  ;data dn first, 
HKR, ISDN\SetMSN,2,,  "AT*P1=%s<cr>"

HKR, Protocol\ISDN\AUTO_64K,1,,             "AT*V2=0<cr>"
HKR, Protocol\ISDN\ANALOG_V34, 1,,          "AT*V2=3<cr>"
HKR, Protocol\ISDN\HDLC_PPP_56K, 1,,        "AT*V2=5*P=1S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K, 1,,        "AT*V2=5*P=1S67=6<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K_Turbo, 1,,  "AT*V2=5*P=2S67=6<cr>"
HKR, Protocol\ISDN\HDLC_PPP_112K, 1,,       "AT*V2=5*P=3*D0=1S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K, 1,,       "AT*V2=5*P=3"*D0=1<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K_DBA, 1,,   "AT*V2=5*P=3"*D0=0<cr>"

HKR, Protocol\ISDN\V120_56K, 1 ,,           "AT*V2=1S67=2<cr>"
HKR, Protocol\ISDN\V120_64K, 1,,            "AT*V2=1S67=6<cr>"
HKR, Protocol\ISDN\V120_112, 1,,            "AT*V2=1<cr>"
HKR, Protocol\ISDN\V120_128K, 1,,           "AT*V2=1<cr>"
HKR, Protocol\ISDN\X75_64K, 1,,             "AT*V2=6S82=1<cr>"
HKR, Protocol\ISDN\V110_19DOT2K, 1,,        "AT*V2=2S80.3=0<cr>"
HKR, Protocol\ISDN\V110_38DOT4K, 1,,        "AT*V2=2S80.3=1<cr>"
HKR, Protocol\ISDN\V110_57DOT6K,1,,         "AT*V2=2<cr>" ; Japan

[MDMGL009.ISDNCI_U]
HKR, ISDN\SwitchType, SWITCH_ATT1,,        "AT*W=0<cr>"   ;AT&T 5ESS Customm
HKR, ISDN\SwitchType, SWITCH_DMS100,,      "AT*W=1<cr>"   ;Northern Telecom DMS-100
HKR, ISDN\SwitchType, SWITCH_NI1,,         "AT*W=2<cr>"   ;National ISDN 1
HKR, ISDN\SwitchType, SWITCH_NI2,,         "AT*W=3<cr>"   ;National ISDN 2

HKR, ISDN\DirectoryNo,1,,  "AT*P2=%s<cr>"  ;data dn first
HKR, ISDN\DirectoryNo,2,,  "AT*P1=%s<cr>"
HKR, ISDN\SetSpid, 1,,     "AT*S2=%s<cr>"
HKR, ISDN\SetSpid, 2,,     "AT*S1=%s<cr>"

HKR, Protocol\ISDN\AUTO_64K,1,,             "AT*V2=0<cr>"
HKR, Protocol\ISDN\ANALOG_V34, 1,,          "AT*V2=3<cr>"
HKR, Protocol\ISDN\HDLC_PPP_56K, 1,,        "AT*V2=5*P=1S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K, 1,,        "AT*V2=5*P=1S67=6<cr>"
HKR, Protocol\ISDN\HDLC_PPP_64K_Turbo, 1,,  "AT*V2=5*P=2S67=6<cr>"
HKR, Protocol\ISDN\HDLC_PPP_112K, 1,,       "AT*V2=5*P=3*D0=1S67=2<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K, 1,,       "AT*V2=5*P=3"*D0=1<cr>"
HKR, Protocol\ISDN\HDLC_PPP_128K_DBA, 1,,   "AT*V2=5*P=3"*D0=0<cr>"

HKR, Protocol\ISDN\V120_56K, 1 ,,           "AT*V2=1S67=2<cr>"
HKR, Protocol\ISDN\V120_64K, 1,,            "AT*V2=1S67=6<cr>"
HKR, Protocol\ISDN\V120_112, 1,,            "AT*V2=1<cr>"
HKR, Protocol\ISDN\V120_128K, 1,,           "AT*V2=1<cr>"
HKR, Protocol\ISDN\X75_64K, 1,,             "AT*V2=6S82=1<cr>"
HKR, Protocol\ISDN\V110_19DOT2K, 1,,        "AT*V2=2S80.3=0<cr>"
HKR, Protocol\ISDN\V110_38DOT4K, 1,,        "AT*V2=2S80.3=1<cr>"
HKR, Protocol\ISDN\V110_57DOT6K,1,,         "AT*V2=2<cr>" ; Japan

[MDMGL009.MINIMAL]
HKR, Init ,4,,"AT&A0<cr>"
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",1,02,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000<cr><lf>",1,02,00,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",1,02,00,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666<cr><lf>",1,02,00,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",1,02,00,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",1,02,00,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",1,02,00,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",1,02,00,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666<cr><lf>",1,02,00,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",1,02,00,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666<cr><lf>",1,02,00,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",1,02,00,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",1,02,00,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",1,02,00,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666<cr><lf>",1,02,00,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",1,02,00,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",1,02,00,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666<cr><lf>",1,02,00,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",1,02,00,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",1,02,00,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666<cr><lf>",1,02,00,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",1,02,00,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",1,02,00,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666<cr><lf>",1,02,00,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333<cr><lf>",1,02,00,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666<cr><lf>",1,02,00,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>",1,02,00,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000<cr><lf>",1,02,00,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 112000<cr><lf>",1,02,00,80,B5,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 128000<cr><lf>",1,02,00,00,F4,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 144000<cr><lf>",1,02,00,80,32,02,00,00,00,00,00

[MDMGL009.V23_SP]
HKR, Settings, Modulation_CCITT_V23,,"&N2S27=16"
HKR, Responses, "<cr><lf>CONNECT 75/1200/NONE<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/NONE<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00

[MDMGL009.V23_CR]
HKR, Settings, Modulation_CCITT_V23,,"&N2S34=8"
HKR, Responses, "<cr><lf>CONNECT 75/1200/NONE<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/NONE<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00

[MDMGL009.V23_V250]
HKR, Settings, Modulation_CCITT_V23,,"+MS=V23C;"
HKR, Responses, "<cr><lf>CONNECT 75/1200/NONE<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/NONE<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>",	1,02,00,B0,04,00,00,00,00,00,00

[MDMGL009.HST]
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/HST<cr><lf>",			1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/HST/HST<cr><lf>",		1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/HST<cr><lf>",			1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/HST/HST<cr><lf>",		1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/HST<cr><lf>",			1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/HST/HST<cr><lf>",		1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/HST<cr><lf>",			1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/HST/HST<cr><lf>",		1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/HST<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/HST/HST<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/HST<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/HST/HST<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/HST<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/HST/HST<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/HST/HST/V42BIS<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00

[MDMGL009.LS]
HKR, Responses, "<cr><lf>CONNECT 1200/NONE<cr><lf>",			1,02,00,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ/LAPM<cr><lf>",		1,02,02,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ/LAPM/V42BIS<cr><lf>",		1,02,03,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ/MNP<cr><lf>",			1,02,02,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ/MNP/MNP5<cr><lf>",		1,02,03,B0,04,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/NONE<cr><lf>",			1,02,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/LAPM<cr><lf>",		1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/LAPM/V42BIS<cr><lf>",		1,02,03,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/MNP<cr><lf>",			1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/MNP/MNP5<cr><lf>",		1,02,03,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V32/NONE<cr><lf>",		1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V32<cr><lf>",			1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V32<cr><lf>",			1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V32/LAPM<cr><lf>",		1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V32/MNP<cr><lf>",		1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V32/NONE<cr><lf>",		1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V32<cr><lf>",			1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V32<cr><lf>",			1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V32/LAPM<cr><lf>",		1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V32/MNP<cr><lf>",		1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V32/NONE<cr><lf>",		1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V32<cr><lf>",			1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V32<cr><lf>",			1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V32/LAPM<cr><lf>",		1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V32/MNP<cr><lf>",		1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V32/NONE<cr><lf>",		1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V32<cr><lf>",			1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V32<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V32/LAPM<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V32/MNP<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V32/NONE<cr><lf>",		1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V32<cr><lf>",			1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V32<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V32/LAPM<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V32/MNP<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V32/NONE<cr><lf>",		1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V32<cr><lf>",			1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V32<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V32/LAPM<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V32/MNP<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V32/NONE<cr><lf>",		1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V32<cr><lf>",			1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V32<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V32/LAPM<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V32/MNP<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V32/NONE<cr><lf>",		1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V32<cr><lf>",			1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V32<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V32/LAPM<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V32/LAPM/V42BIS<cr><lf>",	1,02,03,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V32/MNP<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V32/MNP/MNP5<cr><lf>",	1,02,03,60,54,00,00,00,00,00,00

[MDMGL009.VFC]
HKR, Responses, "<cr><lf>CONNECT 14400/VFC/NONE<cr><lf>",		1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/VFC<cr><lf>",			1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/VFC<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/VFC/LAPM<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/VFC/MNP<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/VFC/NONE<cr><lf>",		1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/VFC<cr><lf>",			1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/VFC<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/VFC/LAPM<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/VFC/MNP<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/VFC/NONE<cr><lf>",		1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/VFC<cr><lf>",			1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/VFC<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/VFC/LAPM<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/VFC/MNP<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/VFC/NONE<cr><lf>",		1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/VFC<cr><lf>",			1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/VFC<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/VFC/LAPM<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/VFC/MNP<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/VFC/NONE<cr><lf>",		1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/VFC<cr><lf>",			1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/VFC<cr><lf>",		1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/VFC/LAPM<cr><lf>",		1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/VFC/MNP<cr><lf>",		1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/VFC/NONE<cr><lf>",		1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/VFC<cr><lf>",			1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/VFC<cr><lf>",		1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/VFC/LAPM<cr><lf>",		1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/VFC/MNP<cr><lf>",		1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/VFC/NONE<cr><lf>",		1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/VFC<cr><lf>",			1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/VFC<cr><lf>",		1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/VFC/LAPM<cr><lf>",		1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/V42BIS<cr><lf>",	1,02,03,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/VFC/MNP<cr><lf>",		1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/VFC/MNP/MNP5<cr><lf>",	1,02,03,80,70,00,00,00,00,00,00

[MDMGL009.V34]
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",				1,02,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V34/NONE<cr><lf>",		1,02,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V34<cr><lf>",			1,02,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ<cr><lf>",			1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/V34<cr><lf>",			1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/V34/LAPM<cr><lf>",		1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/V34/MNP<cr><lf>",		1,02,02,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",				1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V34/NONE<cr><lf>",		1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V34<cr><lf>",			1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ<cr><lf>",			1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V34<cr><lf>",			1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V34/LAPM<cr><lf>",		1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V34/MNP<cr><lf>",		1,02,02,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",				1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V34/NONE<cr><lf>",		1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V34<cr><lf>",			1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ<cr><lf>",			1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V34<cr><lf>",			1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V34/LAPM<cr><lf>",		1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V34/MNP<cr><lf>",		1,02,02,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",				1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V34/NONE<cr><lf>",		1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V34<cr><lf>",			1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ<cr><lf>",			1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V34<cr><lf>",			1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V34/LAPM<cr><lf>",		1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V34/MNP<cr><lf>",		1,02,02,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",			1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V34/NONE<cr><lf>",		1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V34<cr><lf>",			1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ<cr><lf>",			1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V34<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V34/LAPM<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V34/MNP<cr><lf>",		1,02,02,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",			1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V34/NONE<cr><lf>",		1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V34<cr><lf>",			1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ<cr><lf>",			1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V34<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V34/LAPM<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V34/MNP<cr><lf>",		1,02,02,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",			1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V34/NONE<cr><lf>",		1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V34<cr><lf>",			1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ<cr><lf>",			1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V34<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V34/LAPM<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V34/MNP<cr><lf>",		1,02,02,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",			1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V34/NONE<cr><lf>",		1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V34<cr><lf>",			1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ<cr><lf>",			1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34/LAPM<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34/MNP<cr><lf>",		1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",			1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V34/NONE<cr><lf>",		1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V34<cr><lf>",			1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ<cr><lf>",			1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34/LAPM<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34/MNP<cr><lf>",		1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",			1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V34/NONE<cr><lf>",		1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V34<cr><lf>",			1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ<cr><lf>",			1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34<cr><lf>",		1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34/LAPM<cr><lf>",		1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34/MNP<cr><lf>",		1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",			1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V34/NONE<cr><lf>",		1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V34<cr><lf>",			1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ<cr><lf>",			1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34<cr><lf>",		1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34/LAPM<cr><lf>",		1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34/MNP<cr><lf>",		1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",			1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V34/NONE<cr><lf>",		1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V34<cr><lf>",			1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ<cr><lf>",			1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34<cr><lf>",		1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34/LAPM<cr><lf>",		1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34/MNP<cr><lf>",		1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",			1,02,00,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V34/NONE<cr><lf>",		1,02,00,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V34<cr><lf>",			1,02,00,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ<cr><lf>",			1,02,02,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34<cr><lf>",		1,02,02,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34/LAPM<cr><lf>",		1,02,02,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34/MNP<cr><lf>",		1,02,02,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",			1,02,00,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V34/NONE<cr><lf>",		1,02,00,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V34<cr><lf>",			1,02,00,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ<cr><lf>",			1,02,02,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34<cr><lf>",		1,02,02,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34/LAPM<cr><lf>",		1,02,02,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34/LAPM/V42BIS<cr><lf>",	1,02,03,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34/MNP<cr><lf>",		1,02,02,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34/MNP/MNP5<cr><lf>",	1,02,03,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V34/V80<cr><lf>",			1,02,00,60,09,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V34/V80<cr><lf>",			1,02,00,C0,12,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V34/V80<cr><lf>",			1,02,00,20,1C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V34/V80<cr><lf>",			1,02,00,80,25,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V34/V80<cr><lf>",		1,02,00,E0,2E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V34/V80<cr><lf>",		1,02,00,40,38,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V34/V80<cr><lf>",		1,02,00,A0,41,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V34/V80<cr><lf>",		1,02,00,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V34/V80<cr><lf>",		1,02,00,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V34/V80<cr><lf>",		1,02,00,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V34/V80<cr><lf>",		1,02,00,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V34/V80<cr><lf>",		1,02,00,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V34/V80<cr><lf>",		1,02,00,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V34/V80<cr><lf>",		1,02,00,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,00,4B,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,60,54,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,C0,5D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,20,67,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,80,70,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,E0,79,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34/LAPM/SVD<cr><lf>",	1,02,02,40,83,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V34/LAPM/SVD/V42BIS<cr><lf>",1,02,03,40,83,00,00,00,00,00,00

[MDMGL009.56K]
HKR, Responses, "<cr><lf>CONNECT 28000<cr><lf>",                     1,02,00,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/V90/NONE<cr><lf>",            1,02,00,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/V90<cr><lf>",                 1,02,00,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/x2/NONE<cr><lf>",             1,02,00,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/x2<cr><lf>",                  1,02,00,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ<cr><lf>",                 1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/V90/MNP<cr><lf>",         1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/V90/LAPM<cr><lf>",        1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/V90<cr><lf>",             1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/x2/MNP<cr><lf>",          1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/x2/LAPM<cr><lf>",         1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ/x2<cr><lf>",              1,02,02,60,6D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",                     1,02,00,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/V90/NONE<cr><lf>",            1,02,00,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/V90<cr><lf>",                 1,02,00,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/x2/NONE<cr><lf>",             1,02,00,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/x2<cr><lf>",                  1,02,00,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ<cr><lf>",                 1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/V90/MNP<cr><lf>",         1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/V90/LAPM<cr><lf>",        1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/V90<cr><lf>",             1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/x2/MNP<cr><lf>",          1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/x2/LAPM<cr><lf>",         1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ/x2<cr><lf>",              1,02,02,95,72,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666<cr><lf>",                     1,02,00,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/V90/NONE<cr><lf>",            1,02,00,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/V90<cr><lf>",                 1,02,00,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/x2/NONE<cr><lf>",             1,02,00,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/x2<cr><lf>",                  1,02,00,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ<cr><lf>",                 1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/V90/MNP<cr><lf>",         1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/V90/LAPM<cr><lf>",        1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/V90<cr><lf>",             1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/x2/MNP<cr><lf>",          1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/x2/LAPM<cr><lf>",         1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ/x2<cr><lf>",              1,02,02,CA,77,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",                     1,02,00,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/V90/NONE<cr><lf>",            1,02,00,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/V90<cr><lf>",                 1,02,00,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/x2/NONE<cr><lf>",             1,02,00,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/x2<cr><lf>",                  1,02,00,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ<cr><lf>",                 1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/V90/MNP<cr><lf>",         1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/V90/LAPM<cr><lf>",        1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/V90<cr><lf>",             1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/x2/MNP<cr><lf>",          1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/x2/LAPM<cr><lf>",         1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ/x2<cr><lf>",              1,02,02,00,7D,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",                     1,02,00,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/V90/NONE<cr><lf>",            1,02,00,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/V90<cr><lf>",                 1,02,00,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/x2/NONE<cr><lf>",             1,02,00,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/x2<cr><lf>",                  1,02,00,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ<cr><lf>",                 1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/V90/MNP<cr><lf>",         1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/V90/LAPM<cr><lf>",        1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/V90<cr><lf>",             1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/x2/MNP<cr><lf>",          1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/x2/LAPM<cr><lf>",         1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ/x2<cr><lf>",              1,02,02,35,82,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666<cr><lf>",                     1,02,00,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/V90/NONE<cr><lf>",            1,02,00,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/V90<cr><lf>",                 1,02,00,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/x2/NONE<cr><lf>",             1,02,00,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/x2<cr><lf>",                  1,02,00,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ<cr><lf>",                 1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/V90/MNP<cr><lf>",         1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/V90/LAPM<cr><lf>",        1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/V90<cr><lf>",             1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/x2/MNP<cr><lf>",          1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/x2/LAPM<cr><lf>",         1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ/x2<cr><lf>",              1,02,02,6A,87,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",                     1,02,00,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/V90/NONE<cr><lf>",            1,02,00,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/V90<cr><lf>",                 1,02,00,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/x2/NONE<cr><lf>",             1,02,00,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/x2<cr><lf>",                  1,02,00,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ<cr><lf>",                 1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/V90/MNP<cr><lf>",         1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/V90/LAPM<cr><lf>",        1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/V90<cr><lf>",             1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/x2/MNP<cr><lf>",          1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/x2/LAPM<cr><lf>",         1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ/x2<cr><lf>",              1,02,02,A0,8C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",                     1,02,00,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/V90/NONE<cr><lf>",            1,02,00,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/V90<cr><lf>",                 1,02,00,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/x2/NONE<cr><lf>",             1,02,00,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/x2<cr><lf>",                  1,02,00,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ<cr><lf>",                 1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/V90/MNP<cr><lf>",         1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/V90/LAPM<cr><lf>",        1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/V90<cr><lf>",             1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/x2/MNP<cr><lf>",          1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/x2/LAPM<cr><lf>",         1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ/x2<cr><lf>",              1,02,02,D5,91,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666<cr><lf>",                     1,02,00,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/V90/NONE<cr><lf>",            1,02,00,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/V90<cr><lf>",                 1,02,00,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/x2/NONE<cr><lf>",             1,02,00,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/x2<cr><lf>",                  1,02,00,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ<cr><lf>",                 1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/V90/MNP<cr><lf>",         1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/V90/LAPM<cr><lf>",        1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/V90<cr><lf>",             1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/x2/MNP<cr><lf>",          1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/x2/LAPM<cr><lf>",         1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ/x2<cr><lf>",              1,02,02,0A,97,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",                     1,02,00,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/V90/NONE<cr><lf>",            1,02,00,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/V90<cr><lf>",                 1,02,00,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/x2/NONE<cr><lf>",             1,02,00,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/x2<cr><lf>",                  1,02,00,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ<cr><lf>",                 1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/V90/MNP<cr><lf>",         1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/V90/LAPM<cr><lf>",        1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/V90<cr><lf>",             1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/x2/MNP<cr><lf>",          1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/x2/LAPM<cr><lf>",         1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ/x2<cr><lf>",              1,02,02,40,9C,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",                     1,02,00,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/V90/NONE<cr><lf>",            1,02,00,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/V90<cr><lf>",                 1,02,00,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/x2/NONE<cr><lf>",             1,02,00,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/x2<cr><lf>",                  1,02,00,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ<cr><lf>",                 1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/V90/MNP<cr><lf>",         1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/V90/LAPM<cr><lf>",        1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/V90<cr><lf>",             1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/x2/MNP<cr><lf>",          1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/x2/LAPM<cr><lf>",         1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ/x2<cr><lf>",              1,02,02,75,A1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666<cr><lf>",                     1,02,00,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/V90/NONE<cr><lf>",            1,02,00,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/V90<cr><lf>",                 1,02,00,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/x2/NONE<cr><lf>",             1,02,00,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/x2<cr><lf>",                  1,02,00,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ<cr><lf>",                 1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/V90/MNP<cr><lf>",         1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/V90/LAPM<cr><lf>",        1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/V90<cr><lf>",             1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/x2/MNP<cr><lf>",          1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/x2/LAPM<cr><lf>",         1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ/x2<cr><lf>",              1,02,02,AA,A6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",                     1,02,00,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/V90/NONE<cr><lf>",            1,02,00,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/V90<cr><lf>",                 1,02,00,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/x2/NONE<cr><lf>",             1,02,00,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/x2<cr><lf>",                  1,02,00,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ<cr><lf>",                 1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/V90/MNP<cr><lf>",         1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/V90/LAPM<cr><lf>",        1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/V90<cr><lf>",             1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/x2/MNP<cr><lf>",          1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/x2/LAPM<cr><lf>",         1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ/x2<cr><lf>",              1,02,02,E0,AB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",                     1,02,00,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/V90/NONE<cr><lf>",            1,02,00,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/V90<cr><lf>",                 1,02,00,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/x2/NONE<cr><lf>",             1,02,00,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/x2<cr><lf>",                  1,02,00,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ<cr><lf>",                 1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/V90/MNP<cr><lf>",         1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/V90/LAPM<cr><lf>",        1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/V90<cr><lf>",             1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/x2/MNP<cr><lf>",          1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/x2/LAPM<cr><lf>",         1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ/x2<cr><lf>",              1,02,02,15,B1,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666<cr><lf>",                     1,02,00,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/V90/NONE<cr><lf>",            1,02,00,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/V90<cr><lf>",                 1,02,00,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/x2/NONE<cr><lf>",             1,02,00,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/x2<cr><lf>",                  1,02,00,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ<cr><lf>",                 1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/V90/MNP<cr><lf>",         1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/V90/LAPM<cr><lf>",        1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/V90<cr><lf>",             1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/x2/MNP<cr><lf>",          1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/x2/LAPM<cr><lf>",         1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ/x2<cr><lf>",              1,02,02,4A,B6,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",                     1,02,00,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/V90/NONE<cr><lf>",            1,02,00,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/V90<cr><lf>",                 1,02,00,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/x2/NONE<cr><lf>",             1,02,00,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/x2<cr><lf>",                  1,02,00,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ<cr><lf>",                 1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/V90/MNP<cr><lf>",         1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/V90/LAPM<cr><lf>",        1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/V90<cr><lf>",             1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/x2/MNP<cr><lf>",          1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/x2/LAPM<cr><lf>",         1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ/x2<cr><lf>",              1,02,02,80,BB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",                     1,02,00,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/V90/NONE<cr><lf>",            1,02,00,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/V90<cr><lf>",                 1,02,00,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/x2/NONE<cr><lf>",             1,02,00,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/x2<cr><lf>",                  1,02,00,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ<cr><lf>",                 1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/V90/MNP<cr><lf>",         1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/V90/LAPM<cr><lf>",        1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/V90<cr><lf>",             1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/x2/MNP<cr><lf>",          1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/x2/LAPM<cr><lf>",         1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ/x2<cr><lf>",              1,02,02,B5,C0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666<cr><lf>",                     1,02,00,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/V90/NONE<cr><lf>",            1,02,00,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/V90<cr><lf>",                 1,02,00,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/x2/NONE<cr><lf>",             1,02,00,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/x2<cr><lf>",                  1,02,00,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ<cr><lf>",                 1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/V90/MNP<cr><lf>",         1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/V90/LAPM<cr><lf>",        1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/V90<cr><lf>",             1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/x2/MNP<cr><lf>",          1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/x2/LAPM<cr><lf>",         1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ/x2<cr><lf>",              1,02,02,EA,C5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",                     1,02,00,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/V90/NONE<cr><lf>",            1,02,00,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/V90<cr><lf>",                 1,02,00,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/x2/NONE<cr><lf>",             1,02,00,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/x2<cr><lf>",                  1,02,00,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ<cr><lf>",                 1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/V90/MNP<cr><lf>",         1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/V90/LAPM<cr><lf>",        1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/V90<cr><lf>",             1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/x2/MNP<cr><lf>",          1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/x2/LAPM<cr><lf>",         1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ/x2<cr><lf>",              1,02,02,20,CB,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",                     1,02,00,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/V90/NONE<cr><lf>",            1,02,00,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/V90<cr><lf>",                 1,02,00,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/x2/NONE<cr><lf>",             1,02,00,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/x2<cr><lf>",                  1,02,00,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ<cr><lf>",                 1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/V90/MNP<cr><lf>",         1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/V90/LAPM<cr><lf>",        1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/V90<cr><lf>",             1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/x2/MNP<cr><lf>",          1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/x2/LAPM<cr><lf>",         1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ/x2<cr><lf>",              1,02,02,55,D0,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666<cr><lf>",                     1,02,00,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/V90/NONE<cr><lf>",            1,02,00,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/V90<cr><lf>",                 1,02,00,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/x2/NONE<cr><lf>",             1,02,00,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/x2<cr><lf>",                  1,02,00,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ<cr><lf>",                 1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/V90/MNP<cr><lf>",         1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/V90/LAPM<cr><lf>",        1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/V90<cr><lf>",             1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/x2/MNP<cr><lf>",          1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/x2/LAPM<cr><lf>",         1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ/x2<cr><lf>",              1,02,02,8A,D5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",                     1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/V90/NONE<cr><lf>",            1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/V90<cr><lf>",                 1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/x2/NONE<cr><lf>",             1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/x2<cr><lf>",                  1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ<cr><lf>",                 1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/V90/MNP<cr><lf>",         1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/V90/LAPM<cr><lf>",        1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/V90<cr><lf>",             1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/x2/MNP<cr><lf>",          1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/x2/LAPM<cr><lf>",         1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/x2<cr><lf>",              1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333<cr><lf>",                     1,02,00,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/V90/NONE<cr><lf>",            1,02,00,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/V90<cr><lf>",                 1,02,00,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/x2/NONE<cr><lf>",             1,02,00,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/x2<cr><lf>",                  1,02,00,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ<cr><lf>",                 1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/V90/MNP<cr><lf>",         1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/V90/LAPM<cr><lf>",        1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/V90<cr><lf>",             1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/x2/MNP<cr><lf>",          1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/x2/LAPM<cr><lf>",         1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333/ARQ/x2<cr><lf>",              1,02,02,F5,DF,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666<cr><lf>",                     1,02,00,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/V90/NONE<cr><lf>",            1,02,00,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/V90<cr><lf>",                 1,02,00,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/x2/NONE<cr><lf>",             1,02,00,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/x2<cr><lf>",                  1,02,00,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ<cr><lf>",                 1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/V90/MNP<cr><lf>",         1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/V90/LAPM<cr><lf>",        1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/V90<cr><lf>",             1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/x2/MNP<cr><lf>",          1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/x2/LAPM<cr><lf>",         1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666/ARQ/x2<cr><lf>",              1,02,02,2A,E5,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>",                     1,02,00,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/V90/NONE<cr><lf>",            1,02,00,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/V90<cr><lf>",                 1,02,00,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/x2/NONE<cr><lf>",             1,02,00,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/x2<cr><lf>",                  1,02,00,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ<cr><lf>",                 1,02,02,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/V90/MNP/MNP5<cr><lf>",    1,02,03,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/V90/LAPM/V42BIS<cr><lf>", 1,02,03,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/V90/MNP<cr><lf>",         1,02,02,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/V90/LAPM<cr><lf>",        1,02,02,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/V90<cr><lf>",             1,02,02,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/x2/MNP/MNP5<cr><lf>",     1,02,03,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/x2/LAPM/V42BIS<cr><lf>",  1,02,03,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/x2/MNP<cr><lf>",          1,02,02,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/x2/LAPM<cr><lf>",         1,02,02,60,EA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ/x2<cr><lf>",              1,02,02,60,EA,00,00,00,00,00,00

[MDMGL009.V1X0]
HKR, Responses, "<cr><lf>CONNECT 9600/AODI<cr><lf>",			1,02,00,80,3E,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",			1,02,00,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/DIGITAL<cr><lf>",		1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/DIGITAL<cr><lf>",		1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/DIGITAL/V120<cr><lf>",	1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/DIGITAL/V110<cr><lf>",		1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/DIGITAL/X75<cr><lf>",		1,02,02,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ/DIGITAL/V120/V42BIS<cr><lf>",1,02,03,C0,DA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000<cr><lf>",			1,02,00,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/DIGITAL<cr><lf>",		1,02,02,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/ARQ/DIGITAL<cr><lf>",		1,02,02,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/ARQ/DIGITAL/V120<cr><lf>",	1,02,02,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/DIGITAL/V110<cr><lf>",		1,02,02,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/DIGITAL/X75<cr><lf>",		1,02,02,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/ARQ/DIGITAL/V120/V42BIS<cr><lf>",1,02,03,00,FA,00,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 112000<cr><lf>",			1,02,00,80,B5,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 128000<cr><lf>",			1,02,00,00,F4,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 128000/ARQ/DIGITAL<cr><lf>",		1,02,00,00,F4,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 128000/ASYNC<cr><lf>",			1,02,00,00,F4,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 128000/ASYNC_ADVANCED<cr><lf>",	1,02,00,00,F4,01,00,00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 144000<cr><lf>",			1,02,00,80,32,02,00,00,00,00,00

[MDMGL009.SP_FAX]
HKR, Fax,EnableV17Recv,,	"1"
HKR, Fax,EnableV17Send,,	"1"
HKR, Fax,HighestSendSpeed,,	"14400"
HKR, Fax,ResetCommand,,         "AT&FS0=0E0V1Q0"
HKR, Fax,SetupCommand,,		"ATB0X4&D2&C1&H2&I2&R1&A3&M4&B1"
HKR, Fax,FaxClass,,		"1"
HKR, Fax,FixModemClass,,	"1"
HKR, Fax,HardwareFlowControl,,	"0"
HKR, Fax,SerialSpeedInit,,	"57600"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,1,,	"AT+FCLASS=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,2,,	"ATB0&M4&K1S7=60S19=0"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,3,,	"AT+FAA=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,4,,	"ATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxDetect,,	"FAX"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxConnect,,"CONNECT"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataDetect,,"DATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataConnect,,"CONNECT"

[MDMGL009.SP_FAX0]
HKR, Fax,EnableV17Recv,,	"1"
HKR, Fax,EnableV17Send,,	"1"
HKR, Fax,HighestSendSpeed,,	"14400"
HKR, Fax,ResetCommand,,		"AT&FS0=0E0V1Q0"
HKR, Fax,SetupCommand,,		"AT&F&B1&D2V1Q0E0S0=0&C1&H1&R2&I0X4&A3S7=255"
HKR, Fax,FaxClass,,		"1"
HKR, Fax,FixModemClass,,	"1"
HKR, Fax,HardwareFlowControl,,	"0"
HKR, Fax,SerialSpeedInit,,	"57600"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,1,,	"AT+FCLASS=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,2,,	"ATB0&M4&K1S7=60S19=0"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,3,,	"AT+FAA=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,4,,	"ATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxDetect,,	"FAX"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxConnect,,"CONNECT"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataDetect,,"DATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataConnect,,"CONNECT"

[MDMGL009.CR_FAX]
HKR, Fax,EnableV17Send,,	"1"
HKR, Fax,EnableV17Recv,,	"1"
HKR, Fax,HighestSendSpeed,,	"14400"
HKR, Fax,ResetCommand,,		"AT&FS0=0E0V1Q0"
HKR, Fax,SetupCommand,,		"ATB0X4&D2&C1&H1&R2&I0&A3&M4&B1S7=255"
HKR, Fax,FaxClass,,		"1"
HKR, Fax,FixModemClass,,	"1"
HKR, Fax,HardwareFlowControl,,	"1"
HKR, Fax,SerialSpeedInit,,	"57600"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,1,,	"AT+FCLASS=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,2,,	"AT+FAA=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,3,,	"ATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxDetect,,	"FAX"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxConnect,,"CONNECT"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataDetect,,"DATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataConnect,,"CONNECT"
HKR, Fax\Class1\AdaptiveAnswer,HostCommandDataDetect,,	"ATO"

[MDMGL009.FAX_V250]
HKR, Fax,EnableV17Recv,,	"1"
HKR, Fax,EnableV17Send,,	"1"
HKR, Fax,HighestSendSpeed,,	"14400"
HKR, Fax,ResetCommand,,		"AT&F&A0&D2&C1&B1V1Q0E0X4S0=0S7=255"
HKR, Fax,SetupCommand,,		"AT+IFC=2,2"
HKR, Fax,FaxClass,,		"1"
HKR, Fax,FixModemClass,,	"1"
HKR, Fax,HardwareFlowControl,,	"1"
HKR, Fax,SerialSpeedInit,,	"57600"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,1,,	"AT+FCLASS=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,2,,	"ATB0S7=60S19=0"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,3,,	"AT+ES=3,0,2;+DS=3,0"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,4,,	"AT+FAA=1"
HKR, Fax\Class1\AdaptiveAnswer\AnswerCommand,5,,	"ATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxDetect,,	"FAX"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseFaxConnect,,"CONNECT"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataDetect,,"DATA"
HKR, Fax\Class1\AdaptiveAnswer,ModemResponseDataConnect,,"CONNECT"

[MDMGL009.CID]
HKR,,CallerIDOutSide,,			"O"
HKR,,CallerIDPrivate,,			"P"
HKR,,VariableTerminator,,		"<cr><lf>"
HKR, EnableCallerID,1,,			"AT#CID=1<cr>"
HKR, Responses, "<cr><lf>DATE = ",	1,93,00,00,00,00,00,00,00,00,00
HKR, Responses, "TIME = ",		1,94,00,00,00,00,00,00,00,00,00
HKR, Responses, "NAME = ",		1,96,00,00,00,00,00,00,00,00,00
HKR, Responses, "NMBR = ",		1,95,00,00,00,00,00,00,00,00,00
HKR, Responses, "MESG = ",		1,97,00,00,00,00,00,00,00,00,00

[MDMGL009.CID_V250]
HKR,,CallerIDOutSide,,			"O"
HKR,,CallerIDPrivate,,			"P"
HKR,,VariableTerminator,,		"<cr><lf>"
HKR, EnableCallerID,1,,			"AT+VCID=1<cr>"
HKR, Responses, "<cr><lf>DATE = ",	1,93,00,00,00,00,00,00,00,00,00
HKR, Responses, "TIME = ",		1,94,00,00,00,00,00,00,00,00,00
HKR, Responses, "NAME = ",		1,96,00,00,00,00,00,00,00,00,00
HKR, Responses, "NMBR = ",		1,95,00,00,00,00,00,00,00,00,00
HKR, Responses, "MESG = ",		1,97,00,00,00,00,00,00,00,00,00

[MDMGL009.DRING_SP]
HKR, EnableDistinctiveRing,1,,"ATS41=1<cr>"
HKR, Responses, "<cr><lf>RING A<cr><lf>",1,18,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>RING B<cr><lf>",1,19,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>RING C<cr><lf>",1,1a,00,00,00,00,00,00,00,00,00

[MDMGL009.DRING_CR]
HKR, EnableDistinctiveRing,1,,"ATS70=7<cr>"
HKR, Responses, "<cr><lf>RING A<cr><lf>",1,18,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>RING B<cr><lf>",1,19,00,00,00,00,00,00,00,00,00
HKR, Responses, "<cr><lf>RING C<cr><lf>",1,1a,00,00,00,00,00,00,00,00,00

[MDMGL009.VOICE]
HKR, Responses, "<cr><lf>VCON<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,,VoiceManufacturerID,	1,01,00
HKR,,VoiceProductIDWaveIn,	1,80,00
HKR,,VoiceProductIDWaveOut,	1,81,00
HKR,,VoiceBaudRate,		1,00,c2,01,00
HKR, WaveDriver,BaudRate,	1,00,c2,01,00
HKR, WaveDriver,XformID,	1,04,00
HKR, WaveDriver,XformModule,,	"umdmxfrm.dll"
HKR, WaveDriver,WaveHardwareID,,"3COMModemWaveDevice"
HKR,,Enumerator,,		serwave.vxd
HKR,,AbortPlay,,		"<h10><h03>"
HKR,,TerminatePlay,,		"<h10><h03>"
HKR,,TerminateRecord,,		"<h10>"
HKR, LineSetPlayFormat,1,,	"AT#VSR=8000<cr>"
HKR, LineSetPlayFormat,2,,	"AT#VBS=4<cr>"
HKR, LineSetPlayFormat,3,,	"AT#VLS=0<cr>"
HKR, LineSetRecordFormat,1,,	"AT#VSR=8000<cr>"
HKR, LineSetRecordFormat,2,,	"AT#VBS=4<cr>"
HKR, LineSetRecordFormat,3,,	"AT#VLS=4<cr>"
HKR, GenerateDigit,1,,		"AT#VTS=<Digit><cr>"
HKR, StartPlay,1,,		"AT#VSM=130,8000<cr>"
HKR, StartPlay,2,,		"AT#VTX<cr>"
HKR, StartRecord,1,,		"AT#VSM=130,8000<cr>"
HKR, StartRecord,2,,		"AT#VRX<cr>"
HKR, StopPlay,1,,		"AT#BDR=0<cr>"
HKR, StopRecord,1,,		"AT#BDR=0<cr>"
HKR, VoiceDialNumberSetup,1,,	"AT#CLS=0<cr>"
HKR, VoiceDialNumberSetup,2,,	"AT#CLS=8<cr>"
HKR, VoiceDialNumberSetup,3,,	"AT#VLS=6A<cr>"
HKR, VoiceDialNumberSetup,4,,	"AT#VRN=0<cr>"
HKR, VoiceDialNumberSetup,5,,	"AT#VBT=1<cr>"
HKR, VoiceToDataAnswer,1,,	"AT#CLS=0<cr>"
HKR, VoiceToDataAnswer,2,,	"ATA<cr>"
HKR, VoiceAnswer,1,,		"AT#CLS=0<cr>"
HKR, VoiceAnswer,2,,		"AT#CLS=8<cr>"
HKR, VoiceAnswer,3,,		"AT#VLS=4<cr>"
HKR, VoiceAnswer,4,,		"AT#VBT=1<cr>"
HKR, VoiceAnswer,5,,		"ATA<cr>"
HKR, OpenHandset,1,,		"AT#CLS=8<cr>"
HKR, OpenHandset,2,,		"AT#VLS=1<cr>"
HKR, CloseHandset,1,,		"AT#CLS=0<cr>"
HKR, HandsetSetPlayFormat,1,,	"AT#VSR=8000<cr>"
HKR, HandsetSetPlayFormat,2,,	"AT#VBS=4<cr>"
HKR, HandsetSetPlayFormat,3,,	"AT#VLS=1<cr>"
HKR, HandsetSetRecordFormat,1,,	"AT#VSR=8000<cr>"
HKR, HandsetSetRecordFormat,2,,	"AT#VBS=4<cr>"
HKR, HandsetSetRecordFormat,3,,	"AT#VLS=1<cr>"
HKR,,SpeakerPhoneSpecs,1,	FF,00,00,00,00,00,00,00,FF,00,00,00,00,00,00,00
HKR, SpeakerPhoneDisable,1,,	"AT#VLS=0<cr>"
HKR, SpeakerPhoneEnable,1,,	"AT#VLS=6A<cr>"
HKR, SpeakerPhoneSetVolumeGain,1,,"AT#VGR=<Vol>#VGT=<Gain><cr>"
HKR, SpeakerPhoneMute,1,,"AT#VLS=4<cr>"
HKR, SpeakerPhoneUnMute,1,,"AT#VLS=6A<cr>"

[MDMGL009.V253_IMA]
HKR,,Enumerator,,		serwave.vxd
HKR, Responses, "<cr><lf>VCON<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,,VoiceManufacturerID,	1,01,00
HKR,,VoiceProductIDWaveIn,	1,80,00
HKR,,VoiceProductIDWaveOut,	1,81,00
HKR,,VoiceBaudRate,		1,00,c2,01,00
HKR, WaveDriver,BaudRate,	1,00,c2,01,00
HKR, WaveDriver,XformID,	1,04,00
HKR, WaveDriver,XformModule,,	"umdmxfrm.dll"
HKR, WaveDriver,WaveHardwareID,,"3COMModemWaveDevice"
HKR, VoiceAnswer,1,,		"AT+FCLASS=8<cr>"
HKR, VoiceAnswer,2,,		"AT+VLS=1<cr>"
HKR, VoiceAnswer,3,,		"ATA<cr>"
HKR, VoiceToDataAnswer,1,,	"AT+FCLASS=0<cr>"
HKR, VoiceToDataAnswer,2,,	"ATA<cr>"
HKR, VoiceDialNumberSetup,1,,	"AT+FCLASS=8<cr>"
HKR, VoiceDialNumberSetup,2,,	"AT+VSP=1<cr>"
HKR, VoiceDialNumberSetup,3,,	"AT+VRN=0<cr>"
HKR, GenerateDigit,1,,		"AT+VTS=<Digit><cr>"
HKR, StartPlay,1,,		"AT+VSM=130,8000,0,0<cr>"
HKR, StartPlay,2,,		"AT+VTX<cr>"
HKR,,AbortPlay,,		"<h10><h03>"
HKR,,TerminatePlay,,		"<h10><h03>"
HKR, StopPlay,1,,		"AT+IPR=0"
HKR, StartRecord,1,,		"AT+VSM=130,8000,0,0<cr>"
HKR, StartRecord,2,,		"AT+VRX<cr>"
HKR,,TerminateRecord,,		"<h10><h21>"
HKR, StopRecord,1,,		"AT+IPR=0"
HKR, LineSetPlayFormat,1,,	"AT+VSM=130,8000,0,0<cr>"
HKR, LineSetPlayFormat,2,,	"AT+VLS=1<cr>"
HKR, LineSetRecordFormat,1,,	"AT+VSM=130,8000,0,0<cr>"
HKR, LineSetRecordFormat,2,,	"AT+VLS=1<cr>"
HKR, OpenHandset,1,,		"AT+FCLASS=8<cr>"
HKR, OpenHandset,2,,		"AT+VLS=2<cr>"
HKR, CloseHandset,1,,		"AT+FCLASS=0<cr>"
HKR, HandsetSetPlayFormat,1,,	"AT+VSM=130,8000,0,0<cr>"
HKR, HandsetSetPlayFormat,2,,	"AT+VLS=2<cr>"
HKR, HandsetSetRecordFormat,1,,	"AT+VSM=130,8000,0,0<cr>"
HKR, HandsetSetRecordFormat,2,,	"AT+VLS=2<cr>"
HKR, SpeakerPhoneEnable,1,,	"AT+VLS=7<cr>"
HKR, SpeakerPhoneEnable,2,,	"AT+VSP=1<cr>"
HKR, SpeakerPhoneDisable,1,,	"AT+VSP=0<cr>"
HKR, SpeakerPhoneMute,1,,	"AT+VGM=0<cr>"
HKR, SpeakerPhoneUnMute,1,,	"AT+VGM=<Gain><cr>"
HKR, SpeakerPhoneSetVolumeGain,1,,"AT+VGR=<Vol>;+VGT=<Gain><cr>"
HKR,,SpeakerPhoneSpecs,1,	FF,00,00,00,00,00,00,00,FF,00,00,00,00,00,00,00

[MDMGL009.V253_G711]
HKR,,Enumerator,,serwave.vxd
HKR, Responses, 		"<cr><lf>VCON<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,,VoiceProfile,		1,25,0C,19,02
HKR,,VoiceManufacturerID,	1,01,00
HKR,,VoiceProductIDWaveIn,	1,80,00
HKR,,VoiceProductIDWaveOut,	1,81,00
HKR,,VoiceBaudRate,		1,00,c2,01,00
HKR, WaveDriver,BaudRate,	1,00,c2,01,00
HKR, WaveDriver,XformID,	1,0A,00
HKR, WaveDriver,XformModule,,	"umdmxfrm.dll"
HKR, WaveDriver,WaveHardwareID,,"3COMModemWaveDevice"
HKR, VoiceAnswer,1,,		"AT+FCLASS=8<cr>"
HKR, VoiceAnswer,2,,		"AT+VLS=1<cr>"
HKR, VoiceAnswer,3,,		"ATA<cr>"
HKR, VoiceToDataAnswer,1,,	"AT+FCLASS=0<cr>"
HKR, VoiceToDataAnswer,2,,	"ATA<cr>"
HKR, VoiceDialNumberSetup,1,,	"AT+FCLASS=8<cr>"
HKR, VoiceDialNumberSetup,2,,	"AT+VSP=1<cr>"
HKR, VoiceDialNumberSetup,3,,	"AT+VRN=0<cr>"
HKR, GenerateDigit,1,,		"AT+VTS=<Digit><cr>"
HKR, StartPlay,1,,		"AT+VSM=4,8000,0,0<cr>"
HKR, StartPlay,2,,		"AT+VTX<cr>"
HKR,,AbortPlay,,		"<h10><h03>"
HKR,,TerminatePlay,,		"<h10><h03>"
HKR, StopPlay,1,,		"AT+IPR=0"
HKR, StartRecord,1,,		"AT+VSM=4,8000,0,0<cr>"
HKR, StartRecord,2,,		"AT+VRX<cr>"
HKR,,TerminateRecord,,		"<h10><h21>"
HKR, StopRecord,1,,		"AT+IPR=0"
HKR, LineSetPlayFormat,1,,	"AT+VSM=4,8000,0,0<cr>"
HKR, LineSetPlayFormat,2,,	"AT+VLS=1<cr>"
HKR, LineSetRecordFormat,1,,	"AT+VSM=4,8000,0,0<cr>"
HKR, LineSetRecordFormat,2,,	"AT+VLS=1<cr>"
HKR, OpenHandset,1,,		"AT+FCLASS=8<cr>"
HKR, OpenHandset,2,,		"AT+VLS=2<cr>"
HKR, CloseHandset,1,,		"AT+FCLASS=0<cr>"
HKR, HandsetSetPlayFormat,1,,	"AT+VSM=4,8000,0,0<cr>"
HKR, HandsetSetPlayFormat,2,,	"AT+VLS=2<cr>"
HKR, HandsetSetRecordFormat,1,,	"AT+VSM=4,8000,0,0<cr>"
HKR, HandsetSetRecordFormat,2,,	"AT+VLS=2<cr>"
HKR, SpeakerPhoneEnable,1,,	"AT+VLS=7<cr>"
HKR, SpeakerPhoneEnable,2,,	"AT+VSP=1<cr>"
HKR, SpeakerPhoneDisable,1,,	"AT+VSP=0<cr>"
HKR, SpeakerPhoneMute,1,,	"AT+VGM=0<cr>"
HKR, SpeakerPhoneUnMute,1,,	"AT+VGM=<Gain><cr>"
HKR, SpeakerPhoneSetVolumeGain,1,,"AT+VGR=<Vol>;+VGT=<Gain><cr>"
HKR,,SpeakerPhoneSpecs,1,	FF,00,00,00,00,00,00,00,FF,00,00,00,00,00,00,00

; Feature Key for use with mdmgl009 Properties
; 23	= 230K DTE
; 56	= 56K DCE
; SP	= Speaker Volume controls
; C	= Cellular
; OV	= V.23 Override
; UD	= Unimodem Diagnostics (#UD)
; B	= Bong Tone ($)

[MDMGL009.PR_2356SPCOVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 7F,0F,00,00, 00,84,03,00, 60,EA,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_2356SPOVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,84,03,00, 60,EA,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_2356OVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,84,03,00, 60,EA,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_23SPOVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,84,03,00, 40,83,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_23OVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,84,03,00, 40,83,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_2356SPCOV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 7F,07,00,00, 00,84,03,00, 60,EA,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_2356SPOV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,84,03,00, 60,EA,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_2356OV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,07,00,00, 00,84,03,00, 60,EA,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_23SPOV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,84,03,00, 40,83,00,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_23OV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,07,00,00, 00,84,03,00, 40,83,00,00

[MDMGL009.PR_56SPCOVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 7F,0F,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56COVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 7F,0F,00,00, 00,C2,01,00, 60,EA,00,00


[MDMGL009.PR_56SPOVUD]
;HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,C2,01,00, 60,EA,00,00
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, 60,EA,00,00


[MDMGL009.PR_56OVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56UD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56SPBN]
HKR,,Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56SPCOV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 7F,07,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56COV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 7F,07,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56SPOV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56SPOVUD2]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56OV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_56]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, 60,EA,00,00

[MDMGL009.PR_SP]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, 40,83,00,00

[MDMGL009.PR_SPOV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, 40,83,00,00

[MDMGL009.PR_COV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 7F,07,00,00, 00,C2,01,00, 40,83,00,00

[MDMGL009.PR_C]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 7F,03,00,00, 00,C2,01,00, 40,83,00,00

[MDMGL009.PR_OV]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, 40,83,00,00

[MDMGL009.PR_OVUD]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,0F,00,00, 00,C2,01,00, 40,83,00,00

[MDMGL009.PR_]
HKR,,Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, 40,83,00,00

; specialized sections for ISDN TA and Courier I-modem
[MDMGL009.PR_ISDNCI]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,84,03,00, 00,F4,01,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMGL009.PR_ISDNTA]
HKR,,Properties, 1, 00,00,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 00,84,03,00, 80,32,02,00
HKR,,DCB, 	  1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00


; Feature Key for use with mdmgl009 VoiceProfile
; T	= TAD
; S	= Speakerphone
; H	= Handset Audio
; M	= Speakerphone Mute
; R	= Restore Speakerphone after rec/play
; O	= Modem Overrides Handset

[MDMGL009.V_TSHMRO]
HKR,,VoiceProfile, 1, 27,0C,39,02
HKR, WaveDriver, Wavedevices, 1, 02,00

[MDMGL009.V_TSHMR]
HKR,,VoiceProfile, 1, 27,0C,19,02
HKR, WaveDriver, Wavedevices, 1, 02,00

[MDMGL009.V_TSHR]
HKR,,VoiceProfile, 1, 27,0C,59,02
HKR, WaveDriver, Wavedevices, 1, 02,00

[MDMGL009.V_TSHMO]
HKR,,VoiceProfile, 1, 27,00,39,02
HKR, WaveDriver, Wavedevices, 1, 02,00

[MDMGL009.V_TSHM]
HKR,,VoiceProfile, 1, 27,00,19,02
HKR, WaveDriver, Wavedevices, 1, 02,00

[MDMGL009.V_TSH]
HKR,,VoiceProfile, 1, 27,00,59,02
HKR, WaveDriver, Wavedevices, 1, 02,00

[MDMGL009.V_TSMRO]
HKR,,VoiceProfile, 1, 25,0C,39,02
HKR, WaveDriver, Wavedevices, 1, 01,00

[MDMGL009.V_TSMR]
HKR,,VoiceProfile, 1, 25,0C,19,02
HKR, WaveDriver, Wavedevices, 1, 01,00

[MDMGL009.V_TSMO]
HKR,,VoiceProfile, 1, 25,00,39,02
HKR, WaveDriver, Wavedevices, 1, 01,00

[MDMGL009.V_TSM]
HKR,,VoiceProfile, 1, 25,00,19,02
HKR, WaveDriver, Wavedevices, 1, 01,00

[MDMGL009.V_TSR]
HKR,,VoiceProfile, 1, 25,0C,59,02
HKR, WaveDriver, Wavedevices, 1,01,00

[MDMGL009.V_TH]
HKR,,VoiceProfile, 1, 23,00,19,02
HKR, WaveDriver, Wavedevices, 1, 01,00

[MDMGL009.V_T]
HKR,,VoiceProfile, 1, 21,00,19,02
HKR, WaveDriver, Wavedevices, 1, 01,00

[MDMGL009.V_NVOICE]
HKR,,VoiceProfile, 1, 00,00,06,00

[MDMGL009.V_NVOICE2]
HKR,,VoiceProfile,    1,00,00,66,00
