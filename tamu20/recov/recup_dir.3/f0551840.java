; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Supra

[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=Layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Supra% = Supra,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Supra.NTamd64]
%Supra40% = Modem40, PCMCIA\Diamond_Multimedia-Supra_PC_Card_56_R-200D
%Supra39% = Modem39, *SUP2120
%Supra39% = Modem39, *SUP2124
%Supra38% = Modem38, *SUP1581
%Supra36% = Modem36, *SUP1421
%Supra31PNP% = Modem31, SERENUM\SUP1331
%Supra27% = Modem27, *SUP1640                                   ; NEC Single Chip
%Supra27% = Modem27, SUPRV_SUPRA27
%Supra25% = Modem25, *SUP1580                                   ; Express 288i Multinational
%Supra23% = Modem23, *SUP1440
%Supra20% = Modem20, *SUP1420
%Supra18PNP% = Modem18, SERENUM\SUP1330   ;HSVO
%Supra7% = Modem7, *SUP2084
%Supra4% = Modem4, *SUP2171

[Modem20]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_Serwave, Modem20.AddReg, INTERNAL, ExtraCID

[Modem40]
AddReg=All, MfgAddReg, Supra_Voice_All3, Supra_Voice_Serwave2, Supra56K.Responses, Supra56.Settings, Modem39.AddReg, INTERNAL, ExtraCID

[Modem23]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_Serwave, Modem23.AddReg, INTERNAL, ExtraCID

[Modem25]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_All3, Supra_Voice_Serwave2, Modem25.AddReg, INTERNAL, ExtraCID

[Modem27]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_Serwave, Modem27.AddReg, INTERNAL, ExtraCID

[Modem4]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_All2, Supra_Voice_Serwave, Supra56K.Responses, Supra56.Settings, Modem4.AddReg, INTERNAL, ExtraCID

[Modem7]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_All2, Supra_Voice_Serwave, Supra56K.Responses, Supra56.Settings, Modem7.AddReg, INTERNAL, ExtraCID

[Modem31]
AddReg=All, MfgAddReg, Supra_Voice_All2, Supra_Voice_Serwave, Modem31.AddReg, EXTERNAL

[Modem18]
AddReg=All, MfgAddReg, Supra_Voice_All2, Supra_Voice_Serwave, Modem18.AddReg, EXTERNAL, ExtraCID

[Modem36]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_Serwave, Modem36.AddReg, INTERNAL, ExtraCID

[Modem38]
AddReg=All, MfgAddReg, Supra_Voice_All, Supra_Voice_All3, Supra_Voice_Serwave2, Modem38.AddReg, INTERNAL, ExtraCID

[Modem39]
AddReg=All, MfgAddReg, Supra_Voice_All3, Supra_Voice_Serwave2, Supra56K.Responses, Supra56.Settings, Modem39.AddReg, INTERNAL, ExtraCID

[Modem20.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 80,70,00,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"

[Modem40.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 04,00,00,00, 0F,00,00,00, B7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR,, PowerDelay,  0x10001, 1500
HKR,, ConfigDelay, 0x10001, 1500

[Modem39.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR,, VoiceProfile,    1,A1,93,19,02
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000", 1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT", 1, 01, 02, 00,00,00,00, 00,00,00,00

[Modem23.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 80,70,00,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"

[Modem25.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,C2,01,00, 80,70,00,00

[Modem27.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"

[Modem4.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR,, VoiceProfile, 1, 25,92,19,02  ; disable cid
HKR, EnableCallerID, 1,, "ATE0<cr>"  ; caller ID disabled since voiceprofile doesnt disable it
HKR,, SpeakerPhoneSpecs,       1, 00,00,00,00,  0f,00,00,00,  01,00,00,00,  00,00,00,00

[Modem7.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 60,EA,00,00
HKR,, VoiceProfile,    1,25,82,19,02
HKR,, SpeakerPhoneSpecs,       1, 08,00,00,00,  0f,00,00,00,  01,00,00,00,  00,00,00,00

[Modem31.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,84,03,00, 40,83,00,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, VoiceProfile,    1,23,02,09,02
HKR, Settings, ErrorControl_Cellular,, "\N3 &Q5 -K1 *H1 -C1 -Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N4 &Q5 -K1 *H1 -C1 -Q0"


[Modem18.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,84,03,00, 80,70,00,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, VoiceProfile,    1,23,03,08,02

[Modem36.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"

[Modem38.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 40,83,00,00

[Strings]
MSFT="Microsoft"
Supra = "Diamond"
Supra40 = "Supra 56k PC Card Modem"
Supra39 = "SupraExpress 56i Voice"
Supra38 = "SupraExpress 336i Multinational"
Supra36 = "Supra 336i SP"
Supra31PNP = "SupraSonic 336V+ Plug & Play"
Supra27 = "Supra 336i SVD"
Supra25 = "SupraExpress 288i Multinational"
Supra23 = "Supra 288i SP"
Supra20 = "SupraExpress 288i SP"
Supra18PNP = "SupraSonic 288V+ Plug & Play"
Supra7 = "SupraExpress 56i Sp"  ;//WHQL
Supra4 = "SupraExpress 56i Sp Intl" ;//WHQL

[All]
HKR,,FriendlyDriver,,Unimodem.VXD
HKR,,DevLoader,,*VCOMM
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK - Command executed
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR - Invalid command, checksum, error in command line or command line too long
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00

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
HKR, Settings, ErrorControl_Cellular,, "\X0 \N3 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\X0 \N4 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, Compression_Off,, "%%C"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, Modulation_CCITT,, "B"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, Modulation_CCITT_V23,, "+MS=11,1,75,1200"
HKR, Settings, SpeedNegotiation_Off,, "N"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"

HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "+FCERROR", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BUSY", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000", 1, 01, 00, E0,2E,00,00, 00,00,00,00
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
HKR, Responses, "CARRIER 33600", 1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800", 1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200", 1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: CLASS 5", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: NONE", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42BIS", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 1200", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/ARQ", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000", 1,  02,  00,  E0,2E,00,00,  00,00,00,00
HKR, Responses, "CONNECT 12000/ARQ", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/ARQ", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800", 1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/ARQ", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200", 1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/ARQ", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/ARQ", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400", 1, 01, 00, 40,38,00,00, 00,00,00,00
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
HKR, Responses, "CONNECT 31200", 1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/ARQ", 1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/ARQ", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800", 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/ARQ", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600", 1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/ARQ", 1, 02, 02, 58,02,00,00, 00,00,00,00
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
HKR, Responses, "PROTOCOL: ALT", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: NONE", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RING", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RINGING", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "VOICE", 1, 03, 00, 00,00,00,00, 00,00,00,00

[ExtraCID]  
HKR,, CallerIDOutSide,,O
HKR,, CallerIDPrivate,,P
HKR,, VariableTerminator,,<cr><lf>
HKR,Responses,"<cr><lf>DATE = ",1,93,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>MESG = ",1,97,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NAME = ",1,96,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NMBR = ",1,95,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>TIME = ",1,94,00,00,00,00,00,00,00,00,00
HKR,Responses,"DATE = ",1,93,00,00,00,00,00,00,00,00,00
HKR,Responses,"MESG = ",1,97,00,00,00,00,00,00,00,00,00
HKR,Responses,"NAME = ",1,96,00,00,00,00,00,00,00,00,00
HKR,Responses,"NMBR = ",1,95,00,00,00,00,00,00,00,00,00
HKR,Responses,"TIME = ",1,94,00,00,00,00,00,00,00,00,00

[Supra_Voice_All]   ; Supra baseline voice settings
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
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, ForwardDelay,            1,88,13
HKR, CloseHandset,                   1,, "at#cls=0<cr>"
HKR, CloseHandset,                   2,, "ath<cr>"
HKR,, CallerIDPrivate,,P
HKR,, CallerIDOutSide,,O
HKR,, VariableTerminator,,<cr><lf>
HKR, GenerateDigit,               1,, "at#vts=<Digit><cr>"
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>",        1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>",        1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>",        1, 1a, 00, 00,00,00,00, 00,00,00,00

[INTERNAL]
HKR,, DeviceType, 1, 02

[Supra56K.Responses]
HKR, Responses, "CONNECT 32000", 1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000", 1, 02, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000", 1, 02, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000", 1, 02, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000", 1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000", 1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000", 1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000", 1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000", 1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000", 1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000", 1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000", 1, 02, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "CONNECT 58000", 1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 60000", 1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "CARRIER 32000", 1, 01, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000", 1, 01, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000", 1, 01, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000", 1, 01, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000", 1, 01, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000", 1, 01, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000", 1, 01, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000", 1, 01, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000", 1, 01, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000", 1, 01, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000", 1, 01, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000", 1, 01, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "CARRIER 58000", 1, 01, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 60000", 1, 01, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000/ARQ", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000/ARQ", 1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000/ARQ", 1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000/ARQ", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000/ARQ", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000/ARQ", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000/ARQ", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000/ARQ", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000/ARQ", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000/ARQ", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000/ARQ", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000/ARQ", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000/ARQ", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "CONNECT 58000/ARQ", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 60000/ARQ", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400/VFC", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800/VFC", 1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200/VFC", 1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600/VFC", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000/VFC", 1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400/VFC", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800/VFC", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: CLASS 5", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42BIS", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000", 1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00

[Supra56.Settings]
HKR, Init, 2,, "AT &F2 &D2 &C1 E0 V1 Q0 S95=47 S0=0<cr>"
HKR, Settings, Modulation_CCITT_V23,, "+MS=11,1,75,1200"
HKR, Settings, ErrorControl_Cellular,, "\X0 \N3 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\X0 \N4 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, VoiceAnswer,                  1,, "at#cls=8<cr>"
HKR, VoiceAnswer,                  2,, "at#vls=0<cr>"
HKR, VoiceAnswer,                  3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,                  4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,                  5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                  6,, "at#vsb=1<cr>"
HKR, VoiceAnswer,                  7,, "at#vss=2<cr>"
HKR, VoiceAnswer,                  8,, "ata<cr>"

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[Supra_Voice_All3]   ; Supra/Rockwell baseline voice settings, doesn't include speakerphone, handset, caller id, distingtive ring
HKR,,Enumerator,,serwave.vxd
HKR,, ForwardDelay,            1,88,13
HKR,, VariableTerminator,,<cr><lf>
HKR, GenerateDigit,               1,, "at#vts=<Digit><cr>"
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00

[Supra_Voice_All2]   ; Supra/Rockwell baseline voice settings, doesn't include Speakerphone
HKR,,Enumerator,,serwave.vxd
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, ForwardDelay,            1,88,13
HKR, CloseHandset,                   1,, "at#cls=0<cr>"
HKR,, CallerIDPrivate,,P
HKR,, CallerIDOutSide,,O
HKR,, VariableTerminator,,<cr><lf>
HKR, GenerateDigit,               1,, "at#vts=<Digit><cr>"
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>",        1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>",        1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>",        1, 1a, 00, 00,00,00,00, 00,00,00,00

[EXTERNAL]
HKR,, DeviceType, 1, 01

[Supra_Voice_Serwave]   ; Rockwell serial wave settings
HKR,, VoiceProfile,         1, 27,03,08,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,, HandsetCloseDelay,         1, 1e,00,00,00
HKR, StartPlay,               1,, "at#vtx<cr>"
HKR, StopPlay,                1,, "None"
HKR, StopPlay,                2,, "NoResponse"
HKR, StartRecord,             1,, "at#vrx<cr>"
HKR, StopRecord,              1,, "None"
HKR, StopRecord,              2,, "NoResponse"
HKR,, TerminateRecord,,      "!"
HKR,, TerminatePlay,,        "<h10><h03>"
HKR,, AbortPlay,,            "<h10><h18>"
HKR, LineSetPlayFormat,       1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     1,, "None"
HKR, LineSetRecordFormat,     2,, "NoResponse"
HKR, HandsetSetRecordFormat,   1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat,   2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat,     1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat,     2,,"at#vbs=4<cr>"
HKR, OpenHandset,               1,, "at#cls=8<cr>"
HKR, OpenHandset,               2,, "at#vls=1<cr>"
HKR, VoiceToDataAnswer,         1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,         2,, "ata<cr>"
HKR, VoiceAnswer,               1,, "at#cls=8<cr>"
HKR, VoiceAnswer,               2,, "at#vls=0<cr>"
HKR, VoiceAnswer,               3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,               4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,               5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,               6,, "ata<cr>"
HKR, VoiceDialNumberSetup,               1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,               2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,               3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,               4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,               5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,               6,, "at#vbs=4<cr>"

[Supra_Voice_Serwave2]   ; Rockwell serial wave settings
HKR,, VoiceProfile,           1,23,03,08,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,, HandsetCloseDelay,         1, 1e,00,00,00
HKR, StartPlay,               1,, "at#vtx<cr>"
HKR, StopPlay,                1,, "None"
HKR, StopPlay,                2,, "NoResponse"
HKR, StartRecord,             1,, "at#vrx<cr>"
HKR, StopRecord,              1,, "None"
HKR, StopRecord,              2,, "NoResponse"
HKR,, TerminateRecord,,      "!"
HKR,, TerminatePlay,,        "<h10><h03>"
HKR,, AbortPlay,,            "<h10><h18>"
HKR, LineSetPlayFormat,       1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     1,, "None"
HKR, LineSetRecordFormat,     2,, "NoResponse"
HKR, HandsetSetRecordFormat,   1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat,   2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat,     1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat,     2,,"at#vbs=4<cr>"
HKR, OpenHandset,               1,, "at#cls=8<cr>"
HKR, OpenHandset,               2,, "at#vls=1<cr>"
HKR, VoiceToDataAnswer,         1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,         2,, "ata<cr>"
HKR, VoiceAnswer,               1,, "at#cls=8<cr>"
HKR, VoiceAnswer,               2,, "at#vls=0<cr>"
HKR, VoiceAnswer,               3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,               4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,               5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,               6,, "ata<cr>"
HKR, VoiceDialNumberSetup,               1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,               2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,               3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,               4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,               5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,               6,, "at#vbs=4<cr>"


