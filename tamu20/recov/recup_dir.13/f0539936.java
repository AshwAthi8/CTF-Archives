4607

[Manufacturer]
%Mfg% = Models,NTamd64

[Models.NTamd64]
%Modem6% = Modem6, PCMCIA\NTT_DOCOMO-MOBILE_DP_CARD_2896P1-F09E		; DoCoMo DP Card 2896P1
%Modem5% = Modem5, PCMCIA\NTT_DOCOMO-MOBILE_D_CARD_96P1-6EB3	; DoCoMo D Card 96P1
%Modem2% = Modem2, PCMCIA\NTT_DOCOMO-PCMCIA_DATA/FAX_ADAPTER_9600_MARK2-4607		; DoCoMo Card 9600 Mark2


[Modem6]	;DoCoMo DP Card 2896P1
AddReg=All, MfgAddReg, Modem6.AddReg, Mark2, Proto, ProtoAddReg, PCMCIA

[Modem5]	;DoCoMo D Card 96P1
AddReg=All, MfgAddReg, Modem5.AddReg, Mark2, Proto, ProtoAddReg, PCMCIA

[Modem2]	; DoCoMo Card 9600 Mark2
AddReg=All, MfgAddReg, Modem2.AddReg, Mark2, Proto, PCMCIA


[Modem6.AddReg]	; DoCoMo DP Card 2896P1
HKR,, Properties, 1, 00,00,00,00, ff,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 7f,02,00,00, 00,c2,01,00, 80,70,00,00

[Modem5.AddReg]	; DoCoMo D Card 96P1
HKR,, Properties, 1, 00,00,00,00, FF,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 7f,02,00,00, 00,C2,01,00, 40,38,00,00

[Modem2.AddReg]	; DoCoMo Card 9600 Mark2
HKR,, Properties, 1, 00,00,00,00, ff,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 7f,02,00,00, 00,96,00,00, 40,38,00,00
HKR,, ConfigDelay,1, DC,05,00,00


; User visible strings

[Strings]
V_MS="Microsoft"
Mfg = "NTT DoCoMo"
Modem6="DoCoMo DP Card 2896P1"
Modem5="DoCoMo D Card 96P1"
Modem2="DoCoMo Card 9600 Mark2"

; --------------------------------------------------------------
; Common Registry Sections

; The [All] section is installed for all modems.

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init,	1,, "AT<cr>"
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>HAND SET IN USE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOT READY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "D<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "F<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",        1, 01, 00, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType, 1, 03

[ProtoAddReg]
HKR, Init,	2,, "AT &F <cr>"
HKR, Init,	3,, "AT E0V1\V4&D2&C1S0=0 <cr>"

[MfgAddReg]
HKR, Init,	2,, "AT &F <cr>"
HKR, Init,	3,, "AT E0V0\V1&D2&C1S0=0 <cr>"
HKR, Monitor,	1,, "ATS0=0<cr>"
HKR, Monitor,	2,, "None"
HKR, Hangup,	1,, "ATH<cr>"
HKR, Answer,	1,, "ATA<cr>"
HKR,, Reset,, "AT&F<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ""
HKR, Settings, FlowControl_Off,, "\Q0"
HKR, Settings, FlowControl_Hard,, "\Q3"
HKR, Settings, FlowControl_Soft,, "\Q1"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, ErrorControl_Cellular,, "\N3\X0"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"

[Proto]
HKR, Responses, "<cr><lf>CONNECT 300<cr><lf>", 1, 02, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 1, 02, 00, 00,00,00,00, b0,04,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>", 1, 02, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>", 1, 02, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>", 1, 02, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>", 1, 02, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>", 1, 02, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 1, 02, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>", 1, 02, 00, 00,00,00,00, 00,e1,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>", 1, 02, 00, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/LAPM<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/LAPM<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/LAPM<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/LAPM<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/LAPM<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/LAPM<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/LAPM<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL4<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL5<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL10<cr><lf>", 1, 02, 0a, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL4<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL5<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL10<cr><lf>", 1, 02, 0a, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL4<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL5<cr><lf>", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL10<cr><lf>", 1, 02, 0a, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL4<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL5<cr><lf>", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL10<cr><lf>", 1, 02, 0a, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL4<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL5<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL10<cr><lf>", 1, 02, 0a, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL4<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL5<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL10<cr><lf>", 1, 02, 0a, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL4<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL5<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL10<cr><lf>", 1, 02, 0a, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/V.42bis<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V.42bis<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V.42bis<cr><lf>", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V.42bis<cr><lf>", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V.42bis<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V.42bis<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V.42bis<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, b0,04,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, e0,2e,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CONNECT 20800/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 00,e1,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/PACKET<cr><lf>", 1, 02, 00, 00,00,00,00, 00,c2,01,00

[Mark2]
HKR, Responses, "1111<cr>", 1, 02, 00, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1121<cr>", 1, 02, 00, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1131<cr>", 1, 02, 00, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1141<cr>", 1, 02, 00, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1151<cr>", 1, 02, 00, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1161<cr>", 1, 02, 00, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1171<cr>", 1, 02, 00, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1191<cr>", 1, 02, 00, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "11B1<cr>", 1, 02, 00, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1211<cr>", 1, 02, 02, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1221<cr>", 1, 02, 02, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1231<cr>", 1, 02, 02, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1241<cr>", 1, 02, 02, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1251<cr>", 1, 02, 02, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1261<cr>", 1, 02, 02, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1271<cr>", 1, 02, 02, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1291<cr>", 1, 02, 02, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "12B1<cr>", 1, 02, 02, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1311<cr>", 1, 02, 03, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1321<cr>", 1, 02, 03, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1331<cr>", 1, 02, 03, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1341<cr>", 1, 02, 03, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1351<cr>", 1, 02, 03, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1361<cr>", 1, 02, 03, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1371<cr>", 1, 02, 03, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1391<cr>", 1, 02, 03, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "13B1<cr>", 1, 02, 03, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1411<cr>", 1, 02, 03, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1421<cr>", 1, 02, 03, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1431<cr>", 1, 02, 03, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1441<cr>", 1, 02, 03, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1451<cr>", 1, 02, 03, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1461<cr>", 1, 02, 03, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1471<cr>", 1, 02, 03, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1491<cr>", 1, 02, 03, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "14B1<cr>", 1, 02, 03, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1511<cr>", 1, 02, 0a, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1521<cr>", 1, 02, 0a, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1531<cr>", 1, 02, 0a, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1541<cr>", 1, 02, 0a, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1551<cr>", 1, 02, 0a, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1561<cr>", 1, 02, 0a, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1571<cr>", 1, 02, 0a, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1591<cr>", 1, 02, 0a, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "15B1<cr>", 1, 02, 0a, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1611<cr>", 1, 02, 0b, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1621<cr>", 1, 02, 0b, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1631<cr>", 1, 02, 0b, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1641<cr>", 1, 02, 0b, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1651<cr>", 1, 02, 0b, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1661<cr>", 1, 02, 0b, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1671<cr>", 1, 02, 0b, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1691<cr>", 1, 02, 0b, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "16B1<cr>", 1, 02, 0b, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1711<cr>", 1, 02, 0b, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1721<cr>", 1, 02, 0b, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1731<cr>", 1, 02, 0b, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1741<cr>", 1, 02, 0b, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1751<cr>", 1, 02, 0b, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1761<cr>", 1, 02, 0b, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1771<cr>", 1, 02, 0b, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1791<cr>", 1, 02, 0b, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "17B1<cr>", 1, 02, 0b, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1811<cr>", 1, 02, 02, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1821<cr>", 1, 02, 02, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1831<cr>", 1, 02, 02, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1841<cr>", 1, 02, 02, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1851<cr>", 1, 02, 02, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1861<cr>", 1, 02, 02, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1871<cr>", 1, 02, 02, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1891<cr>", 1, 02, 02, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "18B1<cr>", 1, 02, 02, 2c,01,00,00, 00,96,00,00
HKR, Responses, "1911<cr>", 1, 02, 03, 2c,01,00,00, 2c,01,00,00
HKR, Responses, "1921<cr>", 1, 02, 03, 2c,01,00,00, b0,04,00,00
HKR, Responses, "1931<cr>", 1, 02, 03, 2c,01,00,00, 60,09,00,00
HKR, Responses, "1941<cr>", 1, 02, 03, 2c,01,00,00, c0,12,00,00
HKR, Responses, "1951<cr>", 1, 02, 03, 2c,01,00,00, 20,1c,00,00
HKR, Responses, "1961<cr>", 1, 02, 03, 2c,01,00,00, 80,25,00,00
HKR, Responses, "1971<cr>", 1, 02, 03, 2c,01,00,00, e0,2e,00,00
HKR, Responses, "1991<cr>", 1, 02, 03, 2c,01,00,00, 00,4b,00,00
HKR, Responses, "19B1<cr>", 1, 02, 03, 2c,01,00,00, 00,96,00,00
HKR, Responses, "2111<cr>", 1, 02, 00, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2121<cr>", 1, 02, 00, b0,04,00,00, b0,04,00,00
HKR, Responses, "2131<cr>", 1, 02, 00, b0,04,00,00, 60,09,00,00
HKR, Responses, "2141<cr>", 1, 02, 00, b0,04,00,00, c0,12,00,00
HKR, Responses, "2151<cr>", 1, 02, 00, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2161<cr>", 1, 02, 00, b0,04,00,00, 80,25,00,00
HKR, Responses, "2171<cr>", 1, 02, 00, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2191<cr>", 1, 02, 00, b0,04,00,00, 00,4b,00,00
HKR, Responses, "21B1<cr>", 1, 02, 00, b0,04,00,00, 00,96,00,00
HKR, Responses, "2211<cr>", 1, 02, 02, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2221<cr>", 1, 02, 02, b0,04,00,00, b0,04,00,00
HKR, Responses, "2231<cr>", 1, 02, 02, b0,04,00,00, 60,09,00,00
HKR, Responses, "2241<cr>", 1, 02, 02, b0,04,00,00, c0,12,00,00
HKR, Responses, "2251<cr>", 1, 02, 02, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2261<cr>", 1, 02, 02, b0,04,00,00, 80,25,00,00
HKR, Responses, "2271<cr>", 1, 02, 02, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2291<cr>", 1, 02, 02, b0,04,00,00, 00,4b,00,00
HKR, Responses, "22B1<cr>", 1, 02, 02, b0,04,00,00, 00,96,00,00
HKR, Responses, "2311<cr>", 1, 02, 03, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2321<cr>", 1, 02, 03, b0,04,00,00, b0,04,00,00
HKR, Responses, "2331<cr>", 1, 02, 03, b0,04,00,00, 60,09,00,00
HKR, Responses, "2341<cr>", 1, 02, 03, b0,04,00,00, c0,12,00,00
HKR, Responses, "2351<cr>", 1, 02, 03, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2361<cr>", 1, 02, 03, b0,04,00,00, 80,25,00,00
HKR, Responses, "2371<cr>", 1, 02, 03, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2391<cr>", 1, 02, 03, b0,04,00,00, 00,4b,00,00
HKR, Responses, "23B1<cr>", 1, 02, 03, b0,04,00,00, 00,96,00,00
HKR, Responses, "2411<cr>", 1, 02, 03, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2421<cr>", 1, 02, 03, b0,04,00,00, b0,04,00,00
HKR, Responses, "2431<cr>", 1, 02, 03, b0,04,00,00, 60,09,00,00
HKR, Responses, "2441<cr>", 1, 02, 03, b0,04,00,00, c0,12,00,00
HKR, Responses, "2451<cr>", 1, 02, 03, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2461<cr>", 1, 02, 03, b0,04,00,00, 80,25,00,00
HKR, Responses, "2471<cr>", 1, 02, 03, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2491<cr>", 1, 02, 03, b0,04,00,00, 00,4b,00,00
HKR, Responses, "24B1<cr>", 1, 02, 03, b0,04,00,00, 00,96,00,00
HKR, Responses, "2511<cr>", 1, 02, 0a, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2521<cr>", 1, 02, 0a, b0,04,00,00, b0,04,00,00
HKR, Responses, "2531<cr>", 1, 02, 0a, b0,04,00,00, 60,09,00,00
HKR, Responses, "2541<cr>", 1, 02, 0a, b0,04,00,00, c0,12,00,00
HKR, Responses, "2551<cr>", 1, 02, 0a, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2561<cr>", 1, 02, 0a, b0,04,00,00, 80,25,00,00
HKR, Responses, "2571<cr>", 1, 02, 0a, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2591<cr>", 1, 02, 0a, b0,04,00,00, 00,4b,00,00
HKR, Responses, "25B1<cr>", 1, 02, 0a, b0,04,00,00, 00,96,00,00
HKR, Responses, "2611<cr>", 1, 02, 0b, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2621<cr>", 1, 02, 0b, b0,04,00,00, b0,04,00,00
HKR, Responses, "2631<cr>", 1, 02, 0b, b0,04,00,00, 60,09,00,00
HKR, Responses, "2641<cr>", 1, 02, 0b, b0,04,00,00, c0,12,00,00
HKR, Responses, "2651<cr>", 1, 02, 0b, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2661<cr>", 1, 02, 0b, b0,04,00,00, 80,25,00,00
HKR, Responses, "2671<cr>", 1, 02, 0b, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2691<cr>", 1, 02, 0b, b0,04,00,00, 00,4b,00,00
HKR, Responses, "26B1<cr>", 1, 02, 0b, b0,04,00,00, 00,96,00,00
HKR, Responses, "2711<cr>", 1, 02, 0b, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2721<cr>", 1, 02, 0b, b0,04,00,00, b0,04,00,00
HKR, Responses, "2731<cr>", 1, 02, 0b, b0,04,00,00, 60,09,00,00
HKR, Responses, "2741<cr>", 1, 02, 0b, b0,04,00,00, c0,12,00,00
HKR, Responses, "2751<cr>", 1, 02, 0b, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2761<cr>", 1, 02, 0b, b0,04,00,00, 80,25,00,00
HKR, Responses, "2771<cr>", 1, 02, 0b, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2791<cr>", 1, 02, 0b, b0,04,00,00, 00,4b,00,00
HKR, Responses, "27B1<cr>", 1, 02, 0b, b0,04,00,00, 00,96,00,00
HKR, Responses, "2811<cr>", 1, 02, 02, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2821<cr>", 1, 02, 02, b0,04,00,00, b0,04,00,00
HKR, Responses, "2831<cr>", 1, 02, 02, b0,04,00,00, 60,09,00,00
HKR, Responses, "2841<cr>", 1, 02, 02, b0,04,00,00, c0,12,00,00
HKR, Responses, "2851<cr>", 1, 02, 02, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2861<cr>", 1, 02, 02, b0,04,00,00, 80,25,00,00
HKR, Responses, "2871<cr>", 1, 02, 02, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2891<cr>", 1, 02, 02, b0,04,00,00, 00,4b,00,00
HKR, Responses, "28B1<cr>", 1, 02, 02, b0,04,00,00, 00,96,00,00
HKR, Responses, "2911<cr>", 1, 02, 03, b0,04,00,00, 2c,01,00,00
HKR, Responses, "2921<cr>", 1, 02, 03, b0,04,00,00, b0,04,00,00
HKR, Responses, "2931<cr>", 1, 02, 03, b0,04,00,00, 60,09,00,00
HKR, Responses, "2941<cr>", 1, 02, 03, b0,04,00,00, c0,12,00,00
HKR, Responses, "2951<cr>", 1, 02, 03, b0,04,00,00, 20,1c,00,00
HKR, Responses, "2961<cr>", 1, 02, 03, b0,04,00,00, 80,25,00,00
HKR, Responses, "2971<cr>", 1, 02, 03, b0,04,00,00, e0,2e,00,00
HKR, Responses, "2991<cr>", 1, 02, 03, b0,04,00,00, 00,4b,00,00
HKR, Responses, "29B1<cr>", 1, 02, 03, b0,04,00,00, 00,96,00,00
HKR, Responses, "3111<cr>", 1, 02, 00, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3121<cr>", 1, 02, 00, 60,09,00,00, b0,04,00,00
HKR, Responses, "3131<cr>", 1, 02, 00, 60,09,00,00, 60,09,00,00
HKR, Responses, "3141<cr>", 1, 02, 00, 60,09,00,00, c0,12,00,00
HKR, Responses, "3151<cr>", 1, 02, 00, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3161<cr>", 1, 02, 00, 60,09,00,00, 80,25,00,00
HKR, Responses, "3171<cr>", 1, 02, 00, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3191<cr>", 1, 02, 00, 60,09,00,00, 00,4b,00,00
HKR, Responses, "31B1<cr>", 1, 02, 00, 60,09,00,00, 00,96,00,00
HKR, Responses, "3211<cr>", 1, 02, 02, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3221<cr>", 1, 02, 02, 60,09,00,00, b0,04,00,00
HKR, Responses, "3231<cr>", 1, 02, 02, 60,09,00,00, 60,09,00,00
HKR, Responses, "3241<cr>", 1, 02, 02, 60,09,00,00, c0,12,00,00
HKR, Responses, "3251<cr>", 1, 02, 02, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3261<cr>", 1, 02, 02, 60,09,00,00, 80,25,00,00
HKR, Responses, "3271<cr>", 1, 02, 02, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3291<cr>", 1, 02, 02, 60,09,00,00, 00,4b,00,00
HKR, Responses, "32B1<cr>", 1, 02, 02, 60,09,00,00, 00,96,00,00
HKR, Responses, "3311<cr>", 1, 02, 03, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3321<cr>", 1, 02, 03, 60,09,00,00, b0,04,00,00
HKR, Responses, "3331<cr>", 1, 02, 03, 60,09,00,00, 60,09,00,00
HKR, Responses, "3341<cr>", 1, 02, 03, 60,09,00,00, c0,12,00,00
HKR, Responses, "3351<cr>", 1, 02, 03, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3361<cr>", 1, 02, 03, 60,09,00,00, 80,25,00,00
HKR, Responses, "3371<cr>", 1, 02, 03, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3391<cr>", 1, 02, 03, 60,09,00,00, 00,4b,00,00
HKR, Responses, "33B1<cr>", 1, 02, 03, 60,09,00,00, 00,96,00,00
HKR, Responses, "3411<cr>", 1, 02, 03, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3421<cr>", 1, 02, 03, 60,09,00,00, b0,04,00,00
HKR, Responses, "3431<cr>", 1, 02, 03, 60,09,00,00, 60,09,00,00
HKR, Responses, "3441<cr>", 1, 02, 03, 60,09,00,00, c0,12,00,00
HKR, Responses, "3451<cr>", 1, 02, 03, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3461<cr>", 1, 02, 03, 60,09,00,00, 80,25,00,00
HKR, Responses, "3471<cr>", 1, 02, 03, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3491<cr>", 1, 02, 03, 60,09,00,00, 00,4b,00,00
HKR, Responses, "34B1<cr>", 1, 02, 03, 60,09,00,00, 00,96,00,00
HKR, Responses, "3511<cr>", 1, 02, 0a, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3521<cr>", 1, 02, 0a, 60,09,00,00, b0,04,00,00
HKR, Responses, "3531<cr>", 1, 02, 0a, 60,09,00,00, 60,09,00,00
HKR, Responses, "3541<cr>", 1, 02, 0a, 60,09,00,00, c0,12,00,00
HKR, Responses, "3551<cr>", 1, 02, 0a, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3561<cr>", 1, 02, 0a, 60,09,00,00, 80,25,00,00
HKR, Responses, "3571<cr>", 1, 02, 0a, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3591<cr>", 1, 02, 0a, 60,09,00,00, 00,4b,00,00
HKR, Responses, "35B1<cr>", 1, 02, 0a, 60,09,00,00, 00,96,00,00
HKR, Responses, "3611<cr>", 1, 02, 0b, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3621<cr>", 1, 02, 0b, 60,09,00,00, b0,04,00,00
HKR, Responses, "3631<cr>", 1, 02, 0b, 60,09,00,00, 60,09,00,00
HKR, Responses, "3641<cr>", 1, 02, 0b, 60,09,00,00, c0,12,00,00
HKR, Responses, "3651<cr>", 1, 02, 0b, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3661<cr>", 1, 02, 0b, 60,09,00,00, 80,25,00,00
HKR, Responses, "3671<cr>", 1, 02, 0b, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3691<cr>", 1, 02, 0b, 60,09,00,00, 00,4b,00,00
HKR, Responses, "36B1<cr>", 1, 02, 0b, 60,09,00,00, 00,96,00,00
HKR, Responses, "3711<cr>", 1, 02, 0b, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3721<cr>", 1, 02, 0b, 60,09,00,00, b0,04,00,00
HKR, Responses, "3731<cr>", 1, 02, 0b, 60,09,00,00, 60,09,00,00
HKR, Responses, "3741<cr>", 1, 02, 0b, 60,09,00,00, c0,12,00,00
HKR, Responses, "3751<cr>", 1, 02, 0b, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3761<cr>", 1, 02, 0b, 60,09,00,00, 80,25,00,00
HKR, Responses, "3771<cr>", 1, 02, 0b, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3791<cr>", 1, 02, 0b, 60,09,00,00, 00,4b,00,00
HKR, Responses, "37B1<cr>", 1, 02, 0b, 60,09,00,00, 00,96,00,00
HKR, Responses, "3811<cr>", 1, 02, 02, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3821<cr>", 1, 02, 02, 60,09,00,00, b0,04,00,00
HKR, Responses, "3831<cr>", 1, 02, 02, 60,09,00,00, 60,09,00,00
HKR, Responses, "3841<cr>", 1, 02, 02, 60,09,00,00, c0,12,00,00
HKR, Responses, "3851<cr>", 1, 02, 02, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3861<cr>", 1, 02, 02, 60,09,00,00, 80,25,00,00
HKR, Responses, "3871<cr>", 1, 02, 02, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3891<cr>", 1, 02, 02, 60,09,00,00, 00,4b,00,00
HKR, Responses, "38B1<cr>", 1, 02, 02, 60,09,00,00, 00,96,00,00
HKR, Responses, "3911<cr>", 1, 02, 03, 60,09,00,00, 2c,01,00,00
HKR, Responses, "3921<cr>", 1, 02, 03, 60,09,00,00, b0,04,00,00
HKR, Responses, "3931<cr>", 1, 02, 03, 60,09,00,00, 60,09,00,00
HKR, Responses, "3941<cr>", 1, 02, 03, 60,09,00,00, c0,12,00,00
HKR, Responses, "3951<cr>", 1, 02, 03, 60,09,00,00, 20,1c,00,00
HKR, Responses, "3961<cr>", 1, 02, 03, 60,09,00,00, 80,25,00,00
HKR, Responses, "3971<cr>", 1, 02, 03, 60,09,00,00, e0,2e,00,00
HKR, Responses, "3991<cr>", 1, 02, 03, 60,09,00,00, 00,4b,00,00
HKR, Responses, "39B1<cr>", 1, 02, 03, 60,09,00,00, 00,96,00,00
HKR, Responses, "4111<cr>", 1, 02, 00, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4121<cr>", 1, 02, 00, c0,12,00,00, b0,04,00,00
HKR, Responses, "4131<cr>", 1, 02, 00, c0,12,00,00, 60,09,00,00
HKR, Responses, "4141<cr>", 1, 02, 00, c0,12,00,00, c0,12,00,00
HKR, Responses, "4151<cr>", 1, 02, 00, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4161<cr>", 1, 02, 00, c0,12,00,00, 80,25,00,00
HKR, Responses, "4171<cr>", 1, 02, 00, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4191<cr>", 1, 02, 00, c0,12,00,00, 00,4b,00,00
HKR, Responses, "41B1<cr>", 1, 02, 00, c0,12,00,00, 00,96,00,00
HKR, Responses, "4211<cr>", 1, 02, 02, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4221<cr>", 1, 02, 02, c0,12,00,00, b0,04,00,00
HKR, Responses, "4231<cr>", 1, 02, 02, c0,12,00,00, 60,09,00,00
HKR, Responses, "4241<cr>", 1, 02, 02, c0,12,00,00, c0,12,00,00
HKR, Responses, "4251<cr>", 1, 02, 02, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4261<cr>", 1, 02, 02, c0,12,00,00, 80,25,00,00
HKR, Responses, "4271<cr>", 1, 02, 02, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4291<cr>", 1, 02, 02, c0,12,00,00, 00,4b,00,00
HKR, Responses, "42B1<cr>", 1, 02, 02, c0,12,00,00, 00,96,00,00
HKR, Responses, "4311<cr>", 1, 02, 03, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4321<cr>", 1, 02, 03, c0,12,00,00, b0,04,00,00
HKR, Responses, "4331<cr>", 1, 02, 03, c0,12,00,00, 60,09,00,00
HKR, Responses, "4341<cr>", 1, 02, 03, c0,12,00,00, c0,12,00,00
HKR, Responses, "4351<cr>", 1, 02, 03, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4361<cr>", 1, 02, 03, c0,12,00,00, 80,25,00,00
HKR, Responses, "4371<cr>", 1, 02, 03, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4391<cr>", 1, 02, 03, c0,12,00,00, 00,4b,00,00
HKR, Responses, "43B1<cr>", 1, 02, 03, c0,12,00,00, 00,96,00,00
HKR, Responses, "4411<cr>", 1, 02, 03, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4421<cr>", 1, 02, 03, c0,12,00,00, b0,04,00,00
HKR, Responses, "4431<cr>", 1, 02, 03, c0,12,00,00, 60,09,00,00
HKR, Responses, "4441<cr>", 1, 02, 03, c0,12,00,00, c0,12,00,00
HKR, Responses, "4451<cr>", 1, 02, 03, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4461<cr>", 1, 02, 03, c0,12,00,00, 80,25,00,00
HKR, Responses, "4471<cr>", 1, 02, 03, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4491<cr>", 1, 02, 03, c0,12,00,00, 00,4b,00,00
HKR, Responses, "44B1<cr>", 1, 02, 03, c0,12,00,00, 00,96,00,00
HKR, Responses, "4511<cr>", 1, 02, 0a, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4521<cr>", 1, 02, 0a, c0,12,00,00, b0,04,00,00
HKR, Responses, "4531<cr>", 1, 02, 0a, c0,12,00,00, 60,09,00,00
HKR, Responses, "4541<cr>", 1, 02, 0a, c0,12,00,00, c0,12,00,00
HKR, Responses, "4551<cr>", 1, 02, 0a, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4561<cr>", 1, 02, 0a, c0,12,00,00, 80,25,00,00
HKR, Responses, "4571<cr>", 1, 02, 0a, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4591<cr>", 1, 02, 0a, c0,12,00,00, 00,4b,00,00
HKR, Responses, "45B1<cr>", 1, 02, 0a, c0,12,00,00, 00,96,00,00
HKR, Responses, "4611<cr>", 1, 02, 0b, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4621<cr>", 1, 02, 0b, c0,12,00,00, b0,04,00,00
HKR, Responses, "4631<cr>", 1, 02, 0b, c0,12,00,00, 60,09,00,00
HKR, Responses, "4641<cr>", 1, 02, 0b, c0,12,00,00, c0,12,00,00
HKR, Responses, "4651<cr>", 1, 02, 0b, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4661<cr>", 1, 02, 0b, c0,12,00,00, 80,25,00,00
HKR, Responses, "4671<cr>", 1, 02, 0b, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4691<cr>", 1, 02, 0b, c0,12,00,00, 00,4b,00,00
HKR, Responses, "46B1<cr>", 1, 02, 0b, c0,12,00,00, 00,96,00,00
HKR, Responses, "4711<cr>", 1, 02, 0b, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4721<cr>", 1, 02, 0b, c0,12,00,00, b0,04,00,00
HKR, Responses, "4731<cr>", 1, 02, 0b, c0,12,00,00, 60,09,00,00
HKR, Responses, "4741<cr>", 1, 02, 0b, c0,12,00,00, c0,12,00,00
HKR, Responses, "4751<cr>", 1, 02, 0b, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4761<cr>", 1, 02, 0b, c0,12,00,00, 80,25,00,00
HKR, Responses, "4771<cr>", 1, 02, 0b, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4791<cr>", 1, 02, 0b, c0,12,00,00, 00,4b,00,00
HKR, Responses, "47B1<cr>", 1, 02, 0b, c0,12,00,00, 00,96,00,00
HKR, Responses, "4811<cr>", 1, 02, 02, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4821<cr>", 1, 02, 02, c0,12,00,00, b0,04,00,00
HKR, Responses, "4831<cr>", 1, 02, 02, c0,12,00,00, 60,09,00,00
HKR, Responses, "4841<cr>", 1, 02, 02, c0,12,00,00, c0,12,00,00
HKR, Responses, "4851<cr>", 1, 02, 02, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4861<cr>", 1, 02, 02, c0,12,00,00, 80,25,00,00
HKR, Responses, "4871<cr>", 1, 02, 02, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4891<cr>", 1, 02, 02, c0,12,00,00, 00,4b,00,00
HKR, Responses, "48B1<cr>", 1, 02, 02, c0,12,00,00, 00,96,00,00
HKR, Responses, "4911<cr>", 1, 02, 03, c0,12,00,00, 2c,01,00,00
HKR, Responses, "4921<cr>", 1, 02, 03, c0,12,00,00, b0,04,00,00
HKR, Responses, "4931<cr>", 1, 02, 03, c0,12,00,00, 60,09,00,00
HKR, Responses, "4941<cr>", 1, 02, 03, c0,12,00,00, c0,12,00,00
HKR, Responses, "4951<cr>", 1, 02, 03, c0,12,00,00, 20,1c,00,00
HKR, Responses, "4961<cr>", 1, 02, 03, c0,12,00,00, 80,25,00,00
HKR, Responses, "4971<cr>", 1, 02, 03, c0,12,00,00, e0,2e,00,00
HKR, Responses, "4991<cr>", 1, 02, 03, c0,12,00,00, 00,4b,00,00
HKR, Responses, "49B1<cr>", 1, 02, 03, c0,12,00,00, 00,96,00,00
HKR, Responses, "5111<cr>", 1, 02, 00, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5121<cr>", 1, 02, 00, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5131<cr>", 1, 02, 00, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5141<cr>", 1, 02, 00, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5151<cr>", 1, 02, 00, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5161<cr>", 1, 02, 00, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5171<cr>", 1, 02, 00, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5191<cr>", 1, 02, 00, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "51B1<cr>", 1, 02, 00, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5211<cr>", 1, 02, 02, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5221<cr>", 1, 02, 02, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5231<cr>", 1, 02, 02, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5241<cr>", 1, 02, 02, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5251<cr>", 1, 02, 02, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5261<cr>", 1, 02, 02, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5271<cr>", 1, 02, 02, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5291<cr>", 1, 02, 02, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "52B1<cr>", 1, 02, 02, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5311<cr>", 1, 02, 03, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5321<cr>", 1, 02, 03, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5331<cr>", 1, 02, 03, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5341<cr>", 1, 02, 03, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5351<cr>", 1, 02, 03, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5361<cr>", 1, 02, 03, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5371<cr>", 1, 02, 03, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5391<cr>", 1, 02, 03, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "53B1<cr>", 1, 02, 03, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5411<cr>", 1, 02, 03, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5421<cr>", 1, 02, 03, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5431<cr>", 1, 02, 03, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5441<cr>", 1, 02, 03, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5451<cr>", 1, 02, 03, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5461<cr>", 1, 02, 03, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5471<cr>", 1, 02, 03, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5491<cr>", 1, 02, 03, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "54B1<cr>", 1, 02, 03, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5511<cr>", 1, 02, 0a, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5521<cr>", 1, 02, 0a, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5531<cr>", 1, 02, 0a, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5541<cr>", 1, 02, 0a, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5551<cr>", 1, 02, 0a, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5561<cr>", 1, 02, 0a, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5571<cr>", 1, 02, 0a, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5591<cr>", 1, 02, 0a, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "55B1<cr>", 1, 02, 0a, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5611<cr>", 1, 02, 0b, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5621<cr>", 1, 02, 0b, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5631<cr>", 1, 02, 0b, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5641<cr>", 1, 02, 0b, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5651<cr>", 1, 02, 0b, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5661<cr>", 1, 02, 0b, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5671<cr>", 1, 02, 0b, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5691<cr>", 1, 02, 0b, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "56B1<cr>", 1, 02, 0b, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5711<cr>", 1, 02, 0b, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5721<cr>", 1, 02, 0b, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5731<cr>", 1, 02, 0b, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5741<cr>", 1, 02, 0b, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5751<cr>", 1, 02, 0b, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5761<cr>", 1, 02, 0b, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5771<cr>", 1, 02, 0b, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5791<cr>", 1, 02, 0b, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "57B1<cr>", 1, 02, 0b, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5811<cr>", 1, 02, 02, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5821<cr>", 1, 02, 02, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5831<cr>", 1, 02, 02, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5841<cr>", 1, 02, 02, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5851<cr>", 1, 02, 02, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5861<cr>", 1, 02, 02, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5871<cr>", 1, 02, 02, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5891<cr>", 1, 02, 02, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "58B1<cr>", 1, 02, 02, 20,1c,00,00, 00,96,00,00
HKR, Responses, "5911<cr>", 1, 02, 03, 20,1c,00,00, 2c,01,00,00
HKR, Responses, "5921<cr>", 1, 02, 03, 20,1c,00,00, b0,04,00,00
HKR, Responses, "5931<cr>", 1, 02, 03, 20,1c,00,00, 60,09,00,00
HKR, Responses, "5941<cr>", 1, 02, 03, 20,1c,00,00, c0,12,00,00
HKR, Responses, "5951<cr>", 1, 02, 03, 20,1c,00,00, 20,1c,00,00
HKR, Responses, "5961<cr>", 1, 02, 03, 20,1c,00,00, 80,25,00,00
HKR, Responses, "5971<cr>", 1, 02, 03, 20,1c,00,00, e0,2e,00,00
HKR, Responses, "5991<cr>", 1, 02, 03, 20,1c,00,00, 00,4b,00,00
HKR, Responses, "59B1<cr>", 1, 02, 03, 20,1c,00,00, 00,96,00,00
HKR, Responses, "6111<cr>", 1, 02, 00, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6121<cr>", 1, 02, 00, 80,25,00,00, b0,04,00,00
HKR, Responses, "6131<cr>", 1, 02, 00, 80,25,00,00, 60,09,00,00
HKR, Responses, "6141<cr>", 1, 02, 00, 80,25,00,00, c0,12,00,00
HKR, Responses, "6151<cr>", 1, 02, 00, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6161<cr>", 1, 02, 00, 80,25,00,00, 80,25,00,00
HKR, Responses, "6171<cr>", 1, 02, 00, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6191<cr>", 1, 02, 00, 80,25,00,00, 00,4b,00,00
HKR, Responses, "61B1<cr>", 1, 02, 00, 80,25,00,00, 00,96,00,00
HKR, Responses, "6211<cr>", 1, 02, 02, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6221<cr>", 1, 02, 02, 80,25,00,00, b0,04,00,00
HKR, Responses, "6231<cr>", 1, 02, 02, 80,25,00,00, 60,09,00,00
HKR, Responses, "6241<cr>", 1, 02, 02, 80,25,00,00, c0,12,00,00
HKR, Responses, "6251<cr>", 1, 02, 02, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6261<cr>", 1, 02, 02, 80,25,00,00, 80,25,00,00
HKR, Responses, "6271<cr>", 1, 02, 02, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6291<cr>", 1, 02, 02, 80,25,00,00, 00,4b,00,00
HKR, Responses, "62B1<cr>", 1, 02, 02, 80,25,00,00, 00,96,00,00
HKR, Responses, "6311<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6321<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "6331<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "6341<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "6351<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6361<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "6371<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6391<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "63B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "6411<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6421<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "6431<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "6441<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "6451<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6461<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "6471<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6491<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "64B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "6511<cr>", 1, 02, 0a, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6521<cr>", 1, 02, 0a, 80,25,00,00, b0,04,00,00
HKR, Responses, "6531<cr>", 1, 02, 0a, 80,25,00,00, 60,09,00,00
HKR, Responses, "6541<cr>", 1, 02, 0a, 80,25,00,00, c0,12,00,00
HKR, Responses, "6551<cr>", 1, 02, 0a, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6561<cr>", 1, 02, 0a, 80,25,00,00, 80,25,00,00
HKR, Responses, "6571<cr>", 1, 02, 0a, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6591<cr>", 1, 02, 0a, 80,25,00,00, 00,4b,00,00
HKR, Responses, "65B1<cr>", 1, 02, 0a, 80,25,00,00, 00,96,00,00
HKR, Responses, "6611<cr>", 1, 02, 0b, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6621<cr>", 1, 02, 0b, 80,25,00,00, b0,04,00,00
HKR, Responses, "6631<cr>", 1, 02, 0b, 80,25,00,00, 60,09,00,00
HKR, Responses, "6641<cr>", 1, 02, 0b, 80,25,00,00, c0,12,00,00
HKR, Responses, "6651<cr>", 1, 02, 0b, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6661<cr>", 1, 02, 0b, 80,25,00,00, 80,25,00,00
HKR, Responses, "6671<cr>", 1, 02, 0b, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6691<cr>", 1, 02, 0b, 80,25,00,00, 00,4b,00,00
HKR, Responses, "66B1<cr>", 1, 02, 0b, 80,25,00,00, 00,96,00,00
HKR, Responses, "6711<cr>", 1, 02, 0b, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6721<cr>", 1, 02, 0b, 80,25,00,00, b0,04,00,00
HKR, Responses, "6731<cr>", 1, 02, 0b, 80,25,00,00, 60,09,00,00
HKR, Responses, "6741<cr>", 1, 02, 0b, 80,25,00,00, c0,12,00,00
HKR, Responses, "6751<cr>", 1, 02, 0b, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6761<cr>", 1, 02, 0b, 80,25,00,00, 80,25,00,00
HKR, Responses, "6771<cr>", 1, 02, 0b, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6791<cr>", 1, 02, 0b, 80,25,00,00, 00,4b,00,00
HKR, Responses, "67B1<cr>", 1, 02, 0b, 80,25,00,00, 00,96,00,00
HKR, Responses, "6811<cr>", 1, 02, 02, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6821<cr>", 1, 02, 02, 80,25,00,00, b0,04,00,00
HKR, Responses, "6831<cr>", 1, 02, 02, 80,25,00,00, 60,09,00,00
HKR, Responses, "6841<cr>", 1, 02, 02, 80,25,00,00, c0,12,00,00
HKR, Responses, "6851<cr>", 1, 02, 02, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6861<cr>", 1, 02, 02, 80,25,00,00, 80,25,00,00
HKR, Responses, "6871<cr>", 1, 02, 02, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6891<cr>", 1, 02, 02, 80,25,00,00, 00,4b,00,00
HKR, Responses, "68B1<cr>", 1, 02, 02, 80,25,00,00, 00,96,00,00
HKR, Responses, "6911<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "6921<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "6931<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "6941<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "6951<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "6961<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "6971<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "6991<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "69B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "7111<cr>", 1, 02, 00, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7121<cr>", 1, 02, 00, 80,25,00,00, b0,04,00,00
HKR, Responses, "7131<cr>", 1, 02, 00, 80,25,00,00, 60,09,00,00
HKR, Responses, "7141<cr>", 1, 02, 00, 80,25,00,00, c0,12,00,00
HKR, Responses, "7151<cr>", 1, 02, 00, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7161<cr>", 1, 02, 00, 80,25,00,00, 80,25,00,00
HKR, Responses, "7171<cr>", 1, 02, 00, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7191<cr>", 1, 02, 00, 80,25,00,00, 00,4b,00,00
HKR, Responses, "71B1<cr>", 1, 02, 00, 80,25,00,00, 00,96,00,00
HKR, Responses, "7211<cr>", 1, 02, 02, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7221<cr>", 1, 02, 02, 80,25,00,00, b0,04,00,00
HKR, Responses, "7231<cr>", 1, 02, 02, 80,25,00,00, 60,09,00,00
HKR, Responses, "7241<cr>", 1, 02, 02, 80,25,00,00, c0,12,00,00
HKR, Responses, "7251<cr>", 1, 02, 02, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7261<cr>", 1, 02, 02, 80,25,00,00, 80,25,00,00
HKR, Responses, "7271<cr>", 1, 02, 02, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7291<cr>", 1, 02, 02, 80,25,00,00, 00,4b,00,00
HKR, Responses, "72B1<cr>", 1, 02, 02, 80,25,00,00, 00,96,00,00
HKR, Responses, "7311<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7321<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "7331<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "7341<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "7351<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7361<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "7371<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7391<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "73B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "7411<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7421<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "7431<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "7441<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "7451<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7461<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "7471<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7491<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "74B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "7511<cr>", 1, 02, 0a, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7521<cr>", 1, 02, 0a, 80,25,00,00, b0,04,00,00
HKR, Responses, "7531<cr>", 1, 02, 0a, 80,25,00,00, 60,09,00,00
HKR, Responses, "7541<cr>", 1, 02, 0a, 80,25,00,00, c0,12,00,00
HKR, Responses, "7551<cr>", 1, 02, 0a, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7561<cr>", 1, 02, 0a, 80,25,00,00, 80,25,00,00
HKR, Responses, "7571<cr>", 1, 02, 0a, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7591<cr>", 1, 02, 0a, 80,25,00,00, 00,4b,00,00
HKR, Responses, "75B1<cr>", 1, 02, 0a, 80,25,00,00, 00,96,00,00
HKR, Responses, "7611<cr>", 1, 02, 0b, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7621<cr>", 1, 02, 0b, 80,25,00,00, b0,04,00,00
HKR, Responses, "7631<cr>", 1, 02, 0b, 80,25,00,00, 60,09,00,00
HKR, Responses, "7641<cr>", 1, 02, 0b, 80,25,00,00, c0,12,00,00
HKR, Responses, "7651<cr>", 1, 02, 0b, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7661<cr>", 1, 02, 0b, 80,25,00,00, 80,25,00,00
HKR, Responses, "7671<cr>", 1, 02, 0b, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7691<cr>", 1, 02, 0b, 80,25,00,00, 00,4b,00,00
HKR, Responses, "76B1<cr>", 1, 02, 0b, 80,25,00,00, 00,96,00,00
HKR, Responses, "7711<cr>", 1, 02, 0b, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7721<cr>", 1, 02, 0b, 80,25,00,00, b0,04,00,00
HKR, Responses, "7731<cr>", 1, 02, 0b, 80,25,00,00, 60,09,00,00
HKR, Responses, "7741<cr>", 1, 02, 0b, 80,25,00,00, c0,12,00,00
HKR, Responses, "7751<cr>", 1, 02, 0b, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7761<cr>", 1, 02, 0b, 80,25,00,00, 80,25,00,00
HKR, Responses, "7771<cr>", 1, 02, 0b, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7791<cr>", 1, 02, 0b, 80,25,00,00, 00,4b,00,00
HKR, Responses, "77B1<cr>", 1, 02, 0b, 80,25,00,00, 00,96,00,00
HKR, Responses, "7811<cr>", 1, 02, 02, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7821<cr>", 1, 02, 02, 80,25,00,00, b0,04,00,00
HKR, Responses, "7831<cr>", 1, 02, 02, 80,25,00,00, 60,09,00,00
HKR, Responses, "7841<cr>", 1, 02, 02, 80,25,00,00, c0,12,00,00
HKR, Responses, "7851<cr>", 1, 02, 02, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7861<cr>", 1, 02, 02, 80,25,00,00, 80,25,00,00
HKR, Responses, "7871<cr>", 1, 02, 02, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7891<cr>", 1, 02, 02, 80,25,00,00, 00,4b,00,00
HKR, Responses, "78B1<cr>", 1, 02, 02, 80,25,00,00, 00,96,00,00
HKR, Responses, "7911<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "7921<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "7931<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "7941<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "7951<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "7961<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "7971<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "7991<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "79B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "8111<cr>", 1, 02, 00, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8121<cr>", 1, 02, 00, 80,25,00,00, b0,04,00,00
HKR, Responses, "8131<cr>", 1, 02, 00, 80,25,00,00, 60,09,00,00
HKR, Responses, "8141<cr>", 1, 02, 00, 80,25,00,00, c0,12,00,00
HKR, Responses, "8151<cr>", 1, 02, 00, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8161<cr>", 1, 02, 00, 80,25,00,00, 80,25,00,00
HKR, Responses, "8171<cr>", 1, 02, 00, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8191<cr>", 1, 02, 00, 80,25,00,00, 00,4b,00,00
HKR, Responses, "81B1<cr>", 1, 02, 00, 80,25,00,00, 00,96,00,00
HKR, Responses, "8211<cr>", 1, 02, 02, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8221<cr>", 1, 02, 02, 80,25,00,00, b0,04,00,00
HKR, Responses, "8231<cr>", 1, 02, 02, 80,25,00,00, 60,09,00,00
HKR, Responses, "8241<cr>", 1, 02, 02, 80,25,00,00, c0,12,00,00
HKR, Responses, "8251<cr>", 1, 02, 02, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8261<cr>", 1, 02, 02, 80,25,00,00, 80,25,00,00
HKR, Responses, "8271<cr>", 1, 02, 02, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8291<cr>", 1, 02, 02, 80,25,00,00, 00,4b,00,00
HKR, Responses, "82B1<cr>", 1, 02, 02, 80,25,00,00, 00,96,00,00
HKR, Responses, "8311<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8321<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "8331<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "8341<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "8351<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8361<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "8371<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8391<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "83B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "8411<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8421<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "8431<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "8441<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "8451<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8461<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "8471<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8491<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "84B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "8511<cr>", 1, 02, 0a, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8521<cr>", 1, 02, 0a, 80,25,00,00, b0,04,00,00
HKR, Responses, "8531<cr>", 1, 02, 0a, 80,25,00,00, 60,09,00,00
HKR, Responses, "8541<cr>", 1, 02, 0a, 80,25,00,00, c0,12,00,00
HKR, Responses, "8551<cr>", 1, 02, 0a, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8561<cr>", 1, 02, 0a, 80,25,00,00, 80,25,00,00
HKR, Responses, "8571<cr>", 1, 02, 0a, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8591<cr>", 1, 02, 0a, 80,25,00,00, 00,4b,00,00
HKR, Responses, "85B1<cr>", 1, 02, 0a, 80,25,00,00, 00,96,00,00
HKR, Responses, "8611<cr>", 1, 02, 0b, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8621<cr>", 1, 02, 0b, 80,25,00,00, b0,04,00,00
HKR, Responses, "8631<cr>", 1, 02, 0b, 80,25,00,00, 60,09,00,00
HKR, Responses, "8641<cr>", 1, 02, 0b, 80,25,00,00, c0,12,00,00
HKR, Responses, "8651<cr>", 1, 02, 0b, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8661<cr>", 1, 02, 0b, 80,25,00,00, 80,25,00,00
HKR, Responses, "8671<cr>", 1, 02, 0b, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8691<cr>", 1, 02, 0b, 80,25,00,00, 00,4b,00,00
HKR, Responses, "86B1<cr>", 1, 02, 0b, 80,25,00,00, 00,96,00,00
HKR, Responses, "8711<cr>", 1, 02, 0b, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8721<cr>", 1, 02, 0b, 80,25,00,00, b0,04,00,00
HKR, Responses, "8731<cr>", 1, 02, 0b, 80,25,00,00, 60,09,00,00
HKR, Responses, "8741<cr>", 1, 02, 0b, 80,25,00,00, c0,12,00,00
HKR, Responses, "8751<cr>", 1, 02, 0b, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8761<cr>", 1, 02, 0b, 80,25,00,00, 80,25,00,00
HKR, Responses, "8771<cr>", 1, 02, 0b, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8791<cr>", 1, 02, 0b, 80,25,00,00, 00,4b,00,00
HKR, Responses, "87B1<cr>", 1, 02, 0b, 80,25,00,00, 00,96,00,00
HKR, Responses, "8811<cr>", 1, 02, 02, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8821<cr>", 1, 02, 02, 80,25,00,00, b0,04,00,00
HKR, Responses, "8831<cr>", 1, 02, 02, 80,25,00,00, 60,09,00,00
HKR, Responses, "8841<cr>", 1, 02, 02, 80,25,00,00, c0,12,00,00
HKR, Responses, "8851<cr>", 1, 02, 02, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8861<cr>", 1, 02, 02, 80,25,00,00, 80,25,00,00
HKR, Responses, "8871<cr>", 1, 02, 02, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8891<cr>", 1, 02, 02, 80,25,00,00, 00,4b,00,00
HKR, Responses, "88B1<cr>", 1, 02, 02, 80,25,00,00, 00,96,00,00
HKR, Responses, "8911<cr>", 1, 02, 03, 80,25,00,00, 2c,01,00,00
HKR, Responses, "8921<cr>", 1, 02, 03, 80,25,00,00, b0,04,00,00
HKR, Responses, "8931<cr>", 1, 02, 03, 80,25,00,00, 60,09,00,00
HKR, Responses, "8941<cr>", 1, 02, 03, 80,25,00,00, c0,12,00,00
HKR, Responses, "8951<cr>", 1, 02, 03, 80,25,00,00, 20,1c,00,00
HKR, Responses, "8961<cr>", 1, 02, 03, 80,25,00,00, 80,25,00,00
HKR, Responses, "8971<cr>", 1, 02, 03, 80,25,00,00, e0,2e,00,00
HKR, Responses, "8991<cr>", 1, 02, 03, 80,25,00,00, 00,4b,00,00
HKR, Responses, "89B1<cr>", 1, 02, 03, 80,25,00,00, 00,96,00,00
HKR, Responses, "0011<cr>", 1, 02, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "0021<cr>", 1, 02, 00, 00,00,00,00, b0,04,00,00
HKR, Responses, "0031<cr>", 1, 02, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "0041<cr>", 1, 02, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "0051<cr>", 1, 02, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "0061<cr>", 1, 02, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "0071<cr>", 1, 02, 00, 00,00,00,00, e0,2e,00,00
HKR, Responses, "0091<cr>", 1, 02, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "00B1<cr>", 1, 02, 00, 00,00,00,00, 00,96,00,00
