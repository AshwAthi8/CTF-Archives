; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Supra Corporation
[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Mfg% = Models,NTamd64
%Fujitsu% = Fujitsu,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Models.NTamd64]
%Modem47PnP% = Modem47, SERENUM\SUP2051
%Modem46% = Modem44C, *SUP2125
%Modem45% = Modem44C, *SUP2071
%Modem44% = Modem44, *SUP2080
%Modem44% = Modem44, *SUP1480
%Modem44C% = Modem44C, *SUP2040  ; //compat ID, modem44 modem45, 56K no voice
%Modem43C% = Modem43, *SUP1321  ; //compat ID, modem 43: 33.6 max dce, voice
%Modem43G% = Modem43G, *SUP1311   ; //compat ID, modem 43: 33.6 max dce, voice
%Modem43% = Modem43, *SUP1620
%Modem42PNP% = Modem42, SERENUM\SUP1520
%Modem41C% = Modem41C, *SUP1251 		; //compat ID for modem 41, 42: 33.6 max dce, no voice
%Modem41PNP% = Modem41, SERENUM\SUP2090
%Modem41PNP% = Modem41, SERENUM\SUP2091
%Modem40%= Modem40, ISAPNP\SUP1381                      ;Annie with voice 33.6
%Modem39PNP%= Modem39, SERENUM\SUP1201
%Modem35PNP%= Modem35, SERENUM\SUP1261
%Modem30PNP%= Modem30, SERENUM\SUP1251
%Modem29PNP%= Modem29, SERENUM\SUP1211
%Modem28%= Modem28, ISAPNP\SUP1321
%Modem26PNP%= Modem26, SERENUM\SUP1550
%Modem24%= Modem24, ISAPNP\SUP1560                              ;Annie with Voice for Japan
%Modem22PNP%= Modem22, SERENUM\SUP1280
%Modem21%= Modem21, ISAPNP\SUP1400                              ;Express 288i PnP WorldWide
%Modem16%= Modem16, ISAPNP\SUP1310  ;XP288i PnP
%Modem16a%= Modem16, *SUP1320

[Fujitsu.NTamd64]
%Modem44J% = Modem44J, ISAPNP\fuj020a
%Modem44J2% = Modem44J2, ISAPNP\FUJ020b ; data fax voice speakerphone

[Modem43G]
AddReg=All, MfgAddReg, Modem43G.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem21]
AddReg=All, MfgAddReg, Modem21.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem44J2]
include=mdmgl004.inf
AddReg=All, MfgAddReg, Supra_CallerID, Supra_Voice_All, Supra_Voice_Serwave, Modem44J2.AddReg, INTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem22]
AddReg=All, MfgAddReg, Modem22.AddReg, EXTERNAL
DriverVer=03/09/2000

[Modem40]
AddReg=All, MfgAddReg, Modem40.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem41]
AddReg=All, MfgAddReg, Modem41.AddReg, EXTERNAL
DriverVer=03/09/2000

[Modem24]
AddReg=All, MfgAddReg, Modem24.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem42]
include=mdmgl004.inf
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_Serwave, Supra_Distctive_Ring, Supra_CallerID, Modem42.AddReg, EXTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem43]
include=mdmgl004.inf
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_Serwave, Supra_Distctive_Ring, Supra_CallerID, Modem43.AddReg, INTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem26]
AddReg=All, MfgAddReg, Modem26.AddReg, EXTERNAL
DriverVer=03/09/2000

[Modem44]
include=mdmgl004.inf
AddReg=All, MfgAddReg, Supra_CallerID, Supra_Distctive_Ring, Supra_Voice_All2, Supra_Voice_Serwave3, Modem44.AddReg, INTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem28]
AddReg=All, MfgAddReg, Modem28.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem29]
AddReg=All, MfgAddReg, Modem29.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem44C]
AddReg=All, MfgAddReg, Modem44C.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem47]
include=mdmgl004.inf
AddReg=All, MfgAddReg, Supra_CallerID, Supra_Distctive_Ring, Supra_Voice_All2, Supra_Voice_Serwave3, Modem47.AddReg, EXTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem44J]
include=mdmgl004.inf
AddReg=All, MfgAddReg, Supra_CallerID, Supra_Voice_All, Supra_Voice_Serwave, Modem44J.AddReg, INTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Modem30]
AddReg=All, MfgAddReg, Modem30.AddReg, EXTERNAL
DriverVer=03/09/2000

[Modem16]
AddReg=All, MfgAddReg, Modem16.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem35]
AddReg=All, MfgAddReg, Modem35.AddReg, INTERNAL
DriverVer=03/09/2000

[Modem41C]
AddReg=All, MfgAddReg, Modem41C.AddReg, EXTERNAL
DriverVer=03/09/2000

[Modem39]
AddReg=All, MfgAddReg, Modem39.AddReg, EXTERNAL
DriverVer=03/09/2000

[Modem43G.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F2 E0 V1 &C1 &D2 Q0 S95=47 S0=0<cr>"

[Modem21.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, ff,03,00,00, 00,c2,01,00, 80,70,00,00

[Modem44J2.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR, Init, 2,, "AT &F &C1 &D2  E0 V1 Q0 S95=47 S0=0<cr>"
HKR,, VoiceProfile,     1,27,02,19,02

[Modem22.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, ff,03,00,00, 00,c2,01,00, 80,70,00,00

[Modem40.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00

[Modem41.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR, Init, 2,, "AT &F2 &C1 &D2 E0 V1 Q0 S95=47 S0=0<cr>"

[Modem24.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, ff,03,00,00, 00,c2,01,00, 80,70,00,00

[Modem42.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00
HKR,, VoiceProfile,     1,25,02,19,02
HKR, Init, 2,, "AT &F2 &C1 &D2 E0 V1 Q0 W1 S95=47 S0=0<cr>"

[Modem43.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00
HKR,, VoiceProfile,     1,25,02,19,02
HKR, Init, 2,, "AT &F2 &C1 &D2 E0 V1 Q0 W1 S95=47 S0=0<cr>"

[Modem26.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 80,70,00,00

[Modem44.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR,, VoiceProfile,    1,25,82,19,02
HKR, Init, 2,, "AT &F2 &C1 &D2  E0 V1 Q0 S95=47 S0=0<cr>"

[Modem28.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 40,83,00,00

[Modem29.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 40,83,00,00

[Modem44C.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR, Init, 2,, "AT &F2 &C1 &D2  E0 V1 Q0 S95=47 S0=0<cr>"

[Modem47.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR,, VoiceProfile,    1,25,82,19,02
HKR, Init, 2,, "AT &F2 &C1 &D2  E0 V1 Q0 S95=47 S0=0<cr>"

[Modem44J.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, C0,DA,00,00
HKR,, VoiceProfile,    1,A7,12,19,02
HKR, Init,      2,, "AT&FE0V1&C1&D2S95=47S0=0<cr>"
HKR, Init,      3,, "AT%%F4<cr>"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, FlowControl_Off,, "\Q0"
HKR, Settings, FlowControl_Hard,, "\Q3"
HKR, Settings, FlowControl_Soft,, "\Q1"

[Modem30.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 40,83,00,00

[Modem16.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, ff,03,00,00, 00,c2,01,00, 80,70,00,00

[Modem35.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 40,83,00,00

[Modem41C.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F2 &C1 &D2 E0 V1 Q0 W1 S95=47 S0=0<cr>"

[Modem39.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 40,83,00,00

[Strings]
MSFT="Microsoft"
Mfg = "Diamond"
Modem47PNP = "SupraExpress 56e Sp PnP"
Modem46 = "SupraExpress 56i PC Modem PnP"
Modem45 = "SupraExpress 56i Modem PnP"  ;//WHQL
Modem44 = "SupraExpress 56i Sp Modem PnP"  ;//WHQL
Modem44C = "56K Data Fax Modem PnP"  ;//whql  -  compat
Modem43 = "SupraExpress 336i Sp ASVD Modem PnP" ;//whql
Modem43C = "33.6 Speakerphone ASVD Modem PnP" ;//whql  -  compat
Modem43G = "Supra 33.6 Modem PnP" ;//whql  -  compat
Modem42PNP = "SupraExpress 336e Sp ASVD Modem PnP" ;//whql
Modem41C = "56K Data Fax Modem PnP"  ;//whql  -  compat
Modem41PNP = "SupraExpress 56e Modem PnP"  ;//whql
Modem40="SupraExpress 336i PnP Voice"
Modem39PNP="SupraFAXModem 288(336) Plug & Play"
Modem35PNP="Supra 336i JP Plug & Play"
Modem30PNP="SupraExpress 336 Plug & Play"
Modem29PNP="SupraFAXModem 288i (336) Plug & Play"
Modem28="SupraExpress 336i PnP"
Modem26PNP="SupraExpress 288 Plug & Play Japan"
Modem24="SupraExpress 288i PnP Japan"
Modem22PNP="SupraFAXModem 288 German Plug & Play"
Modem21="SupraExpress 288i Multi-National"
Modem16="SupraExpress 288i PnP"
Modem16a="SupraExpress FaxModem 288i PnP"

Fujitsu = "Fujitsu"
Modem44J = "Fujitsu 56K Data Fax Modem PnP (FMV-FX53Z1)"
Modem44J2 = "Fujitsu 56K Data Fax Voice Modem PnP (FMV-FX531)"

[All]
HKR,,FriendlyDriver,,Unimodem.VXD
HKR,,DevLoader,,*VCOMM
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"

[MfgAddReg]
HKR,, InactivityScale, 1, 0a,00,00,00
HKR, Init, 2,, "AT &F2 E0 V1 Q0 W1 S95=47 S0=0<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, SpeakerVolume_Low,, "L"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, FlowControl_Off,, "&K"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_Off,, "&Q6\N"
HKR, Settings, ErrorControl_On,, "&Q5\N3"
HKR, Settings, ErrorControl_Forced,, "&Q5\N2"
HKR, Settings, ErrorControl_Cellular,, "\N3 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N4 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, Compression_Off,, "%%C"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, Modulation_CCITT,, "B"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, SpeedNegotiation_Off,, "N"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"

HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",       1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",       1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "2<cr>",       1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",       1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>",       1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",       1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",       1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "+FCERROR", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BUSY", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000", 1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400/VFC", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800", 1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800/VFC", 1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200", 1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200/VFC", 1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600/VFC", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000", 1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000/VFC", 1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400/VFC", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800/VFC", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CARRIER 300", 1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 31200", 1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CARRIER 32000", 1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33600", 1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000", 1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000", 1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000", 1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000", 1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000", 1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000", 1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800", 1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000", 1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000", 1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000", 1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000", 1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000", 1, 01, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 58000", 1, 01, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 60000", 1, 01, 00, 60,EA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200", 1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 600", 1, 01, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CARRIER 0600", 1, 01, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38400", 1, 01, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CARRIER 57600", 1, 01, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CARRIER 115200", 1, 01, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CARRIER 115,200", 1, 01, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CARRIER 230400", 1, 01, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "COMPRESSION: CLASS 5", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: NONE", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/ARQ", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/ARQ", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 1200", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/ARQ", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000", 1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/ARQ", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/ARQ", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800", 1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/ARQ", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200", 1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/ARQ", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/ARQ", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 230400", 1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 2400", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/ARQ", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000", 1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/ARQ", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/ARQ", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/ARQ", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/ARQ", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300", 1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200", 1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/ARQ", 1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000", 1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000/ARQ", 1, 02, 02, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/ARQ", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000", 1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000/ARQ", 1, 02, 02, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000", 1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000/ARQ", 1, 02, 02, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000/ARQ", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/ARQ", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000", 1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000/ARQ", 1, 02, 02, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000", 1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000/ARQ", 1, 02, 02, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000", 1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000/ARQ", 1, 02, 02, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000", 1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000/ARQ", 1, 02, 02, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800", 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/ARQ", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000", 1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000/ARQ", 1, 02, 02, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000", 1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000/ARQ", 1, 02, 02, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000", 1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000/ARQ", 1, 02, 02, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000", 1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000/ARQ", 1, 02, 02, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000", 1, 02, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000/ARQ", 1, 02, 02, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600", 1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/ARQ", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 58000", 1, 02, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 58000/ARQ", 1, 02, 02, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/ARQ", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 60000", 1, 02, 00, 60,EA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 60000/ARQ", 1, 02, 02, 60,EA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200", 1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/ARQ", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/ARQ", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/ARQ", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "DATA", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "ERROR", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "FAX", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO ANSWER", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO CARRIER", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO DIALTONE", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "OK", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT - CELLULAR", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: NONE", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RING", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RINGING", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "VOICE", 1, 03, 00, 00,00,00,00, 00,00,00,00

[INTERNAL]
HKR,, DeviceType, 1, 02

[Supra_CallerID]
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR,, CallerIDPrivate,,P
HKR,, CallerIDOutSide,,O
HKR,, VariableTerminator,,<cr><lf>
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00

[Supra_Voice_All]   ; Supra baseline voice settings, includes VoiceView init plus everything
HKR,,Enumerator,,serwave.vxd
HKR,, SpeakerPhoneSpecs,       1, 00,00,00,00,  0f,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneDisable,     1,, "at#vls=6<cr>"
HKR, SpeakerPhoneDisable,     2,, "at#spk=0,15,,<cr>"
HKR, SpeakerPhoneDisable,     3,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,        1,, "at#vls=6<cr>"
HKR, SpeakerPhoneMute,        2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneUnMute,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneUnMute,      2,, "at#spk=1,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  1,, "at#vls=6<cr>"
HKR, SpeakerPhoneSetVolumeGain,  2,, "at#spk=,<Vol>,<Gain><cr>"
HKR, LineSetPlayFormat,       1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     1,, "None"
HKR, LineSetRecordFormat,     2,, "NoResponse"
HKR, HandsetSetRecordFormat,   1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat,   2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat,     1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat,     2,,"at#vbs=4<cr>"
HKR, OpenHandset,               1,, "at#cls=8<cr>"
HKR, OpenHandset,               2,, "at#vls=1<cr>"
HKR,, ForwardDelay,            1,88,13
HKR, CloseHandset,                   1,, "at#cls=0<cr>"
HKR,, VariableTerminator,,<cr><lf>
HKR, GenerateDigit,               1,, "at#vts=<Digit><cr>"

[EXTERNAL]
HKR,, DeviceType, 1, 01

[Supra_Distctive_Ring]
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR, Responses, "<cr><lf>RING1<cr><lf>",        1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>",        1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>",        1, 1a, 00, 00,00,00,00, 00,00,00,00

[Supra_Voice_All2]   ; Supra SpeakerPhone settings (No handset)
HKR,,Enumerator,,serwave.vxd
HKR,, SpeakerPhoneSpecs,       1, 00,00,00,00,  0f,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneDisable,     1,, "at#vls=6<cr>"
HKR, SpeakerPhoneDisable,     2,, "at#spk=0,15,,<cr>"
HKR, SpeakerPhoneDisable,     3,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,        1,, "at#vls=6<cr>"
HKR, SpeakerPhoneMute,        2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneUnMute,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneUnMute,      2,, "at#spk=1,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  1,, "at#vls=6<cr>"
HKR, SpeakerPhoneSetVolumeGain,  2,, "at#spk=,<Vol>,<Gain><cr>"
HKR, LineSetPlayFormat,       1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     1,, "None"
HKR, LineSetRecordFormat,     2,, "NoResponse"
HKR,, ForwardDelay,                     1,88,13
HKR,, VariableTerminator,,<cr><lf>
HKR, GenerateDigit,                     1,, "at#vts=<Digit><cr>"

[Supra_Voice_Serwave]   ; Supra TAD, handset and default VoiceProfile
HKR,,Enumerator,,serwave.vxd
HKR,, VoiceProfile,                1,27,82,09,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,, HandsetCloseDelay,           1, 1e,00,00,00
HKR, StartPlay,                    1,, "at#vtx<cr>"
HKR, StopPlay,                     1,, "None"
HKR, StopPlay,                     2,, "NoResponse"
HKR, StartRecord,                  1,, "at#vrx<cr>"
HKR, StopRecord,                   1,, "None"
HKR, StopRecord,                   2,, "NoResponse"
HKR,, TerminateRecord,,      "!"
HKR,, TerminatePlay,,        "<h10><h03>"
HKR,, AbortPlay,,            "<h10><h18>"
HKR, LineSetPlayFormat,            1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,          1,, "None"
HKR, LineSetRecordFormat,          2,, "NoResponse"
HKR, HandsetSetRecordFormat,       1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat,       2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat,         1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat,         2,,"at#vbs=4<cr>"
HKR, OpenHandset,                  1,, "at#cls=8<cr>"
HKR, OpenHandset,                  2,, "at#vls=1<cr>"
HKR, VoiceToDataAnswer,            1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,            2,, "ata<cr>"
HKR, VoiceAnswer,                  1,, "at#cls=8<cr>"
HKR, VoiceAnswer,                  2,, "at#vls=0<cr>"
HKR, VoiceAnswer,                  3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,                  4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,                  5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                  6,, "at#vss=2<cr>"
HKR, VoiceAnswer,                  7,, "ata<cr>"
HKR, VoiceDialNumberSetup,         1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,         2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,         3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,         4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,         5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,         6,, "at#vbs=4<cr>"
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00

[Supra_Voice_Serwave3]   ; Supra TAD (No handset)
HKR,,Enumerator,,serwave.vxd
HKR,, VoiceProfile,                1,21,82,09,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR, StartPlay,                    1,, "at#vtx<cr>"
HKR, StopPlay,                     1,, "None"
HKR, StopPlay,                     2,, "NoResponse"
HKR, StartRecord,                  1,, "at#vrx<cr>"
HKR, StopRecord,                   1,, "None"
HKR, StopRecord,                   2,, "NoResponse"
HKR,, TerminateRecord,,      "!"
HKR,, TerminatePlay,,        "<h10><h03>"
HKR,, AbortPlay,,            "<h10><h18>"
HKR, LineSetPlayFormat,            1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,          1,, "None"
HKR, LineSetRecordFormat,          2,, "NoResponse"
HKR,, ForwardDelay,                1,88,13
HKR, VoiceToDataAnswer,            1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,            2,, "ata<cr>"
HKR, VoiceAnswer,                  1,, "at#cls=8<cr>"
HKR, VoiceAnswer,                  2,, "at#vls=0<cr>"
HKR, VoiceAnswer,                  3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,                  4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,                  5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                  6,, "ata<cr>"
HKR, VoiceDialNumberSetup,               1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,               2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,               3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,               4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,               5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,               6,, "at#vbs=4<cr>"
HKR, GenerateDigit,               1,, "at#vts=<Digit><cr>"
HKR,, VariableTerminator,,<cr><lf>
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00


