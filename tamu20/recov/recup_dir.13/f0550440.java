 ALM 3239

[ActionTec.NTamd64]
%Modem3% = Modem3, PCMCIA\ActionTec-DataLink_FM560LK-E9C8

[Askey.NTamd64]
%Modem4% = Modem4, *AKY1009

[Motorola.NTamd64]
%Motorola1% = Motorola1,*MOT4560

[Motorola1]
INCLUDE=MDMGL004.INF
AddReg=All, MfgAddReg, Motorola1.AddReg, EXTERNAL, Common.Resp,ASKEY.RESP,Atec.Resp,Common2.Resp, Moto.Resp, Moto.Voice,MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem2]
include=MDMGL003.INF
AddReg=All, MfgAddReg, Modem2.AddReg, EXTERNAL, Common.Resp, MDMGL003.VERBOSE4
DriverVer=03/09/2000

[Modem3]
AddReg=All, MfgAddReg, Modem3.AddReg, Common.Resp, Common2.Resp, Atec.Resp, PCMCIA
DriverVer=03/09/2000

[Modem4]
AddReg=All, MfgAddReg, Modem4.AddReg, Internal, Common2.Resp, Askey.Resp
DriverVer=03/09/2000

[Motorola1.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, 00,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F E0 \J1 &D2&C1S0=0<cr>"
HKR, Hangup,    1,, "ATH E1<cr>"
HKR, Settings, InactivityTimeout,, "S90=<#>"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N1"
HKR, Settings, ErrorControl_Forced,, "\N4"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Compression_On,, "%%C1"
HKR, Settings, Modulation_CCITT,, "B0B15"
HKR, Settings, Modulation_Bell,, "B1B16"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, ErrorControl_Cellular,, ""
HKR, Settings, Modulation_CCITT_V23,, "B2"
HKR,, FClass, 1, c3,00,00,00
HKR, Fax, CL1FCS,, "2"

[Modem2.AddReg]
HKR,, Properties, 1, 80,01,00,00, 3c,00,00,00, 3c,00,00,00, 07,00,00,00, 0f,00,00,00, 77,01,00,00, 00,c2,01,00, 80,70,00,00

[Modem3.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR, Init, 2,, "AT &F E0 V1 &D2 &C1 W2 \V1 S0=0<cr>"
HKR, Hangup, 1,, "ATH E1<cr>"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N1"
HKR, Settings, ErrorControl_Forced,, "\N4"
HKR, Settings, Compression_On,, "%%C1"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, InactivityTimeout,, "S30=<#>"

[Modem4.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, C0,DA,00,00
HKR, Hangup,    1,, "ATH E1<cr>"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N1"
HKR, Settings, ErrorControl_Forced,, "\N4"
HKR, Settings, ErrorControl_Cellular,, "&F5 S39=22 \N3"
HKR, Settings, ErrorControl_Cellular_Forced,, "&F5 S39=22 \N4"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Compression_On,, "%%C1"
HKR, Settings, Modulation_CCITT,, "B0B15"
HKR, Settings, Modulation_Bell,, "B1B16"
HKR, Settings, SpeedNegotiation_Off,, "N0\J1"
HKR, Settings, SpeedNegotiation_On,, "N1\J1"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, InactivityTimeOut,, "S30=<#>"

[Strings]
MSFT="Microsoft"
Racal  = "Racal"
Modem2 = "Racal ALM 3239 28.8 Bps Modem"

ActionTec = "ActionTec"
Modem3 = "ActionTec DataLink 56K PCMCIA Fax Modem"   ; //WHQL

Askey = "Askey"
Modem4  = "1456VQH 56K MODEM" ; //WHQL

Motorola = "Motorola"
Motorola1 = "Motorola M1200 Modem"

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00

[MfgAddReg]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT &F E0 V1 &D2 &C1 S0=0 \V1<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "AT&F<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, SpeakerVolume_Low,, "L0"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, FlowControl_Off,, "\Q0"
HKR, Settings, FlowControl_Hard,, "\Q1"
HKR, Settings, FlowControl_Soft,, "\Q3"
HKR, Settings, ErrorControl_On,, "\N3\P2"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\N1\P2"
HKR, Settings, Compression_On,, "\M0"
HKR, Settings, Compression_Off,, "\M1"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "\T<#>"

[EXTERNAL]
HKR,, DeviceType, 1, 01

[Common.Resp]
HKR, Responses, "RINGING", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-MNP", 1, 02, 02, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-MNP 5", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-LAPM", 1, 02, 02, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-LAPM V.42 BIS", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-MNP", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-MNP 5", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-LAPM", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-LAPM V.42 BIS", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-MNP", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-MNP 5", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-LAPM", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-LAPM V.42 BIS", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-MNP", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-MNP 5", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-LAPM", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-LAPM V.42 BIS", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-MNP", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-MNP 5", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-LAPM", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-LAPM V.42 BIS", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-MNP", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-MNP 5", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-LAPM", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-LAPM V.42 BIS", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-MNP", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-MNP 5", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-LAPM", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-LAPM V.42 BIS", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-MNP", 1, 02, 02, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-MNP 5", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-LAPM", 1, 02, 02, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-LAPM V.42 BIS", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-MNP", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-MNP 5", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-LAPM", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-LAPM V.42 BIS", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 300/VFC", 1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/VFC", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75/VFC", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200/VFC", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400/VFC", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800/VFC", 1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200/VFC", 1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600/VFC", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000/VFC", 1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400/VFC", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800/VFC", 1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200/VFC", 1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600/VFC", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000/VFC", 1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400/VFC", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800/VFC", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: CLASS5", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: MNP5", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V42BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: ADC", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP2", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP3", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP4", 1, 01, 02, 00,00,00,00, 00,00,00,00

[ASKEY.RESP]
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1D, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1C, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 300 V42 DSVD<cr><lf>", 1, 02, 02, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 V42bis DSVD<cr><lf>", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 V42 DSVD<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 V42bis DSVD<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX V42 DSVD<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX V42bis DSVD<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 V42 DSVD<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 V42bis DSVD<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42 DSVD<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42bis DSVD<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX V42 DSVD<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX V42bis DSVD<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 V42 DSVD<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 V42bis DSVD<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42 DSVD<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42bis DSVD<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42 DSVD<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42bis DSVD<cr><lf>", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42 DSVD<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42bis DSVD<cr><lf>", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42 DSVD<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42bis DSVD<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42 DSVD<cr><lf>", 1, 02, 02, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42bis DSVD<cr><lf>", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42 DSVD<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42bis DSVD<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42 DSVD<cr><lf>", 1, 02, 02, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42bis DSVD<cr><lf>", 1, 02, 03, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42 DSVD<cr><lf>", 1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42bis DSVD<cr><lf>", 1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42 DSVD<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42bis DSVD<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42 DSVD<cr><lf>", 1, 02, 02, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42bis DSVD<cr><lf>", 1, 02, 03, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42 DSVD<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42bis DSVD<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42 DSVD<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42bis DSVD<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42 DSVD<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42bis DSVD<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42 DSVD<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42bis DSVD<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42 DSVD<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis DSVD<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42 DSVD<cr><lf>", 1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42bis DSVD<cr><lf>", 1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42 DSVD<cr><lf>", 1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42bis DSVD<cr><lf>", 1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>", 1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42 DSVD<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42bis DSVD<cr><lf>", 1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>", 1, 02, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42 DSVD<cr><lf>", 1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42bis DSVD<cr><lf>", 1, 02, 03, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>", 1, 02, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42 DSVD<cr><lf>", 1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42bis DSVD<cr><lf>", 1, 02, 03, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42 DSVD<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42bis DSVD<cr><lf>", 1, 02, 03, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>", 1, 02, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42 DSVD<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42bis DSVD<cr><lf>", 1, 02, 03, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>", 1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42 DSVD<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42bis DSVD<cr><lf>", 1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>", 1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42 DSVD<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42bis DSVD<cr><lf>", 1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>", 1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42 DSVD<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42bis DSVD<cr><lf>", 1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>", 1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42 DSVD<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42bis DSVD<cr><lf>", 1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>", 1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42 DSVD<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42bis DSVD<cr><lf>", 1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>", 1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42 DSVD<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42bis DSVD<cr><lf>", 1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>", 1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42 DSVD<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42bis DSVD<cr><lf>", 1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>", 1, 02, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42 DSVD<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42bis DSVD<cr><lf>", 1, 02, 03, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000<cr><lf>", 1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42 DSVD<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42bis DSVD<cr><lf>", 1, 02, 03, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>", 1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42 DSVD<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42bis DSVD<cr><lf>", 1, 02, 03, 60,ea,00,00, 00,00,00,00

[ATEC.RESP]
HKR, Responses, "<cr><lf>VOICE<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 MNP5<cr><lf>", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 MNP5<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 MNP5<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 MNP5<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX MNP5<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 MNP5<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX MNP5<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 MNP5<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 MNP5<cr><lf>", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 MNP5<cr><lf>", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 MNP5<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 MNP5<cr><lf>", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 MNP5<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 MNP5<cr><lf>", 1, 02, 03, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 MNP5<cr><lf>", 1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 MNP5<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 MNP5<cr><lf>", 1, 02, 03, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 MNP5<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 MNP5<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 MNP5<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 MNP5<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP5<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP5<cr><lf>", 1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP5<cr><lf>", 1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 MNP5<cr><lf>", 1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 MNP5<cr><lf>", 1, 02, 03, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 MNP5<cr><lf>", 1, 02, 03, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 MNP5<cr><lf>", 1, 02, 03, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 MNP5<cr><lf>", 1, 02, 03, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP5<cr><lf>", 1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP5<cr><lf>", 1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP5<cr><lf>", 1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP5<cr><lf>", 1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP5<cr><lf>", 1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP5<cr><lf>", 1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP5<cr><lf>", 1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 MNP5<cr><lf>", 1, 02, 03, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 MNP5<cr><lf>", 1, 02, 03, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 MNP5<cr><lf>", 1, 02, 03, 60,ea,00,00, 00,00,00,00

[Common2.Resp]
HKR, Responses, "<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "5<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300<cr><lf>", 1, 02, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 NoEC<cr><lf>", 1, 02, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 MNP4<cr><lf>", 1, 02, 02, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 V42<cr><lf>", 1, 02, 02, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 V42bis<cr><lf>", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 NoEC<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 MNP4<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 V42<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 V42bis<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 NoEC<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 MNP4<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42bis<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 NoEC<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 MNP4<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 V42<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 V42bis<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX NoEC<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX MNP4<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX V42<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX V42bis<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 NoEC<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 MNP4<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 V42<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 V42bis<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX NoEC<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX MNP4<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX V42<cr><lf>", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX V42bis<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 NoEC<cr><lf>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 MNP4<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42bis<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>", 1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 NoEC<cr><lf>", 1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 MNP4<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42bis<cr><lf>", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>", 1, 02, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 NoEC<cr><lf>", 1, 02, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 MNP4<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42bis<cr><lf>", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 NoEC<cr><lf>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 MNP4<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42bis<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>", 1, 02, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 NoEC<cr><lf>", 1, 02, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 MNP4<cr><lf>", 1, 02, 02, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42<cr><lf>", 1, 02, 02, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42bis<cr><lf>", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 NoEC<cr><lf>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 MNP4<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42bis<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>", 1, 02, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 NoEC<cr><lf>", 1, 02, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 MNP4<cr><lf>", 1, 02, 02, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42<cr><lf>", 1, 02, 02, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42bis<cr><lf>", 1, 02, 03, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>", 1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 NoEC<cr><lf>", 1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 MNP4<cr><lf>", 1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42<cr><lf>", 1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42bis<cr><lf>", 1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 NoEC<cr><lf>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 MNP4<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42bis<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>", 1, 02, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 NoEC<cr><lf>", 1, 02, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 MNP4<cr><lf>", 1, 02, 02, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42<cr><lf>", 1, 02, 02, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42bis<cr><lf>", 1, 02, 03, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 NoEC<cr><lf>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 MNP4<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42bis<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 NoEC<cr><lf>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 MNP4<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42bis<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>", 1, 02, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 NoEC<cr><lf>", 1, 02, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 MNP4<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42bis<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 NoEC<cr><lf>", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 MNP4<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42bis<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 NoEC<cr><lf>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP4<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>", 1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 NoEC<cr><lf>", 1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP4<cr><lf>", 1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42<cr><lf>", 1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42bis<cr><lf>", 1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>", 1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 NoEC<cr><lf>", 1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP4<cr><lf>", 1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42<cr><lf>", 1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42bis<cr><lf>", 1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 NoEC<cr><lf>", 1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 MNP4<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42bis<cr><lf>", 1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 NoEC<cr><lf>", 1, 02, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 MNP4<cr><lf>", 1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42<cr><lf>", 1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42bis<cr><lf>", 1, 02, 03, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 NoEC<cr><lf>", 1, 02, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 MNP4<cr><lf>", 1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42<cr><lf>", 1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42bis<cr><lf>", 1, 02, 03, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 NoEC<cr><lf>", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 MNP4<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42bis<cr><lf>", 1, 02, 03, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 NoEC<cr><lf>", 1, 02, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 MNP4<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42bis<cr><lf>", 1, 02, 03, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 NoEC<cr><lf>", 1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP4<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42bis<cr><lf>", 1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 NoEC<cr><lf>", 1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP4<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42bis<cr><lf>", 1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 NoEC<cr><lf>", 1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP4<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42bis<cr><lf>", 1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 NoEC<cr><lf>", 1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP4<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42bis<cr><lf>", 1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 NoEC<cr><lf>", 1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP4<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42bis<cr><lf>", 1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 NoEC<cr><lf>", 1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP4<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42bis<cr><lf>", 1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 NoEC<cr><lf>", 1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP4<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42bis<cr><lf>", 1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 NoEC<cr><lf>", 1, 02, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 MNP4<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42bis<cr><lf>", 1, 02, 03, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 NoEC<cr><lf>", 1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 MNP4<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42bis<cr><lf>", 1, 02, 03, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 NoEC<cr><lf>", 1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 MNP4<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42bis<cr><lf>", 1, 02, 03, 60,ea,00,00, 00,00,00,00

[Moto.Resp]
HKR, Responses, "10<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "11<cr>", 1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "13<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "14<cr>", 1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "40<cr>", 1, 02, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 EC<cr><lf>", 1, 02, 0a, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 MNP2<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 MNP3<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 EC<cr><lf>", 1, 02, 0a, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 MNP2<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 MNP3<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 EC<cr><lf>", 1, 02, 0a, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 MNP2<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 MNP3<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 EC<cr><lf>", 1, 02, 0a, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP2<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP3<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 EC<cr><lf>", 1, 02, 0a, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP2<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP3<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 EC<cr><lf>", 1, 02, 0a, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP2<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP3<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 EC<cr><lf>", 1, 02, 0a, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP2<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP3<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 EC<cr><lf>", 1, 02, 0a, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP2<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP3<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 EC<cr><lf>", 1, 02, 0a, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP2<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP3<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 EC<cr><lf>", 1, 02, 0a, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP2<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP3<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 EC<cr><lf>", 1, 02, 0a, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 MNP2<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 MNP3<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 EC<cr><lf>", 1, 02, 0a, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 MNP2<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 MNP3<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 EC<cr><lf>", 1, 02, 0a, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 MNP2<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 MNP3<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 NoEC<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 EC<cr><lf>", 1, 02, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP2<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP3<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP4<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP5<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42 DSVD<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis DSVD<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 NoEC<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 EC<cr><lf>", 1, 02, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP2<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP3<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP4<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP5<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42bis<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42 DSVD<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42bis DSVD<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 NoEC<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 EC<cr><lf>", 1, 02, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP2<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP3<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP4<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP5<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42bis<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42 DSVD<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42bis DSVD<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType, 1, 03

[INTERNAL]
HKR,, DeviceType, 1, 02

[Moto.Voice]
HKR,, VoiceProfile,             1, 25,a1,00,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 04, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,,Enumerator,,serwave.vxd
HKR,, ForwardDelay,             1, 88,13
HKR,, SpeakerPhoneSpecs,        1, ff,00,00,00,  01,00,00,00,  ff,00,00,00,  00,00,00,00
HKR,  SpeakerPhoneEnable,       1,, "at<cr>"
HKR,  SpeakerPhoneDisable,      1,, "at+fclass=8<cr>"
HKR,  SpeakerPhoneDisable,      2,, "at+vls=1<cr>"
HKR,  SpeakerPhoneUnMute,       1,, "at+vls=7<cr>"
HKR,  SpeakerPhoneMute,         1,, "at+vls=5<cr>"
HKR,  SpeakerPhoneSetVolumeGain,  1,, "at+vgt=<Vol><cr>"
HKR, EnableCallerID, 1,, "at+vcid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at+vdr=1,10<cr>"
HKR,  GenerateDigit,            1,, "at+vtd=10<cr>"
HKR,  GenerateDigit,            2,, "at+vts=<Digit><cr>"
HKR,  VoiceToDataAnswer,        1,, "at+fclass=0<cr>"
HKR,  VoiceToDataAnswer,        2,, "ata<cr>"
HKR,  VoiceAnswer,              1,, "at+fclass=8<cr>"
HKR,  VoiceAnswer,              2,, "ata<cr>"
HKR,  VoiceDialNumberSetup,     1,, "at+fclass=8<cr>"
HKR,  VoiceDialNumberSetup,     2,, "at+vls=0<cr>"
HKR,  VoiceDialNumberSetup,     3,, "at+vrn=5<cr>"
HKR,  VoiceDialNumberSetup,     4,, "at+vra=0<cr>"
HKR,, CallerIDPrivate,,         "P"
HKR,, CallerIDOutside,,         "O"
HKR,, VariableTerminator,,      "<cr><lf>"
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "<cr><lf>DATE=", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "TIME=",         1, 94, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "NMBR=",         1, 95, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "NAME=",         1, 96, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "MESG=",         1, 97, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "DRON=",         1, 91, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "DROF=",         1, 92, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "RING<cr><lf>",  1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00

HKR,  LineSetPlayFormat,        1,, "at+vsm=132<cr>"
HKR,  LineSetRecordFormat,      1,, "at+vsm=132<cr>"
HKR,  StartPlay,                1,, "at+fclass=8<cr>"
HKR,  StartPlay,                2,, "at+vsd=128,0<cr>"
HKR,  StartPlay,                3,, "at+vtx<cr>"
HKR,,  TerminatePlay,,          "<h10><h03>at<cr>"
HKR,,  AbortPlay,,              "<h10><h03>at<cr>"
HKR,  StopPlay,                 1,, "None"
HKR,  StopPlay,                 2,, "NoResponse"
HKR,  StartRecord,              1,, "at+fclass=8<cr>"
HKR,  StartRecord,              2,, "at+vsd=128,50<cr>"
HKR,  StartRecord,              3,, "at+vrx<cr>"
HKR,,  TerminateRecord,,        "<h10><h21>at<cr>"
HKR,  StopRecord,               1,, "None"
HKR,  StopRecord,               2,, "NoResponse"


