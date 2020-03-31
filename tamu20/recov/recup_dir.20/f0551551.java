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
%USR% = USR,NTamd64
%DIAMOND% = DIAMOND,NTamd64
%Rockwell% = Rockwell,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Models.NTamd64]
%Modem14PNP%= Modem14, SERENUM\SUP1250
%Modem6PNP% = Modem6, ISAPNP\SUP1290
%Modem5PNP% = Modem5, SERENUM\SUP1200               ; 288 model, true V.34

[USR.NTamd64]
%XJ1336% = Modem16, PCMCIA\U.S._ROBOTICS-XJ/CC1336-CEAD

[DIAMOND.NTamd64]
%Modem17%=Modem17, *SUP2480
%Modem18PNP%=Modem18, Serenum\SUP2420
%Modem21%=Modem21, *Sup2730
%Modem19%=Modem19, *SUP2490
%Modem20% = Modem20, MF\Shotgun_DEV0
%Modem20% = Modem20, MF\Shotgun_DEV1

[Rockwell.NTamd64]
%ModemName%  = Rockwell1, *RSS0262

[Modem20]
DriverVer=03/09/2000
AddReg=All, Modem20.AddReg, INTERNAL, 56K.RESP, CID, Shotgun.Resp

[Modem5]
DriverVer=03/09/2000
AddReg=All, Modem5.AddReg, EXTERNAL, SupraNumeric

[Modem6]
DriverVer=03/09/2000
AddReg=All, Modem5.AddReg, INTERNAL, SupraNumeric

[Rockwell1]
DriverVer=03/09/2000
AddReg=All, 56K.Common, Rockwell1.AddReg, INTERNAL, 56K.RESP, Shotgun.Resp, RockReference.Voice

[Modem14]
DriverVer=03/09/2000
AddReg=All, Modem14.AddReg, EXTERNAL, SupraNumeric

[Modem16]
DriverVer=03/09/2000
include=MDMGL001.INF,mdmgl001.inf
AddReg=All, Modem16.AddReg, PCMCIA, MDMGL001.VERBOSE,MDMGL001.3ComTerseResp

[Modem17]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, 56K.Voice, 56K.Common, 56K.Speakerphone, Modem17.AddReg, INTERNAL, 56K.RESP, MDMGL004.ExtraCID

[Modem18]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, 56K.Voice, 56K.Common, Modem18.AddReg, EXTERNAL, 56K.RESP, MDMGL004.ExtraCID

[Modem19]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, 56K.Voice, 56K.Common, Modem19.AddReg, INTERNAL, 56K.RESP, MDMGL004.ExtraCID

[Modem21]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, 56K.Voice, 56K.Common, Modem21.AddReg, External, Modem21.Resp, MDMGL004.ExtraCID

[Modem20.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 00,E1,00,00
HKR, Init, 2,, "AT &F2 &D2 &C1 E0 V1 Q0 W2 S0=0<cr>"
HKR, Settings, ErrorControl_Forced,, "&Q5\N2"
HKR, Settings, ErrorControl_Cellular,, "\X0 \N3 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\X0 \N4 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, Modulation_CCITT_V23,, "+MS=11,1,75,1200"

[Modem5.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, 00,00,00,00, 07,00,00,00, 0f,00,00,00, ff,03,00,00, 00,c2,01,00, 80,70,00,00
HKR, Settings, Compression_On,, "%%C3"

[Rockwell1.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,, VoiceProfile, 1, 25,22,09,02  ; handset disabled

[Modem14.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, 00,00,00,00, 07,00,00,00, 0f,00,00,00, ff,03,00,00, 00,c2,01,00, 80,70,00,00
HKR, Settings, Compression_On,, "%%C3"

[Modem16.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, 40,83,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00
HKR, Settings, DialSuffix,, ""
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT&FE0V1&A3&B1&D2&S0&C1S0=0<cr>"
HKR, Settings, SpeakerVolume_Low,, "L3"
HKR, Settings, SpeakerVolume_Med,, "L3"
HKR, Settings, FlowControl_Off,, "&H0&I0&R1"
HKR, Settings, FlowControl_Hard,, "&H1&R2&I0"
HKR, Settings, FlowControl_Soft,, "&H2&I2&R1"
HKR, Settings, ErrorControl_On,, "&M4"
HKR, Settings, ErrorControl_Off,, "&M0"
HKR, Settings, ErrorControl_Forced,, "&M5"
HKR, Settings, Compression_On,, "&K1"
HKR, Settings, Compression_Off,, "&K0"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S19=<#>"

[Modem17.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00

[Modem18.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,,VoiceProfile,    	1,21,A2,19,02
HKR,Wavedriver,WaveDevices, 1, 02, 00

[Modem19.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,,VoiceProfile,    	1,21,22,19,02
HKR,Wavedriver,WaveDevices, 1, 01, 00

[Modem21.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,  Init,          1,, "ATZ<cr>"
HKR,  Init,          2,, "AT&FE0V1S0=0&C1&D2+MR=2;+DR=1;+ER=1<cr>"
HKR,,InactivityScale, 			1, 0a,00,00,00
HKR,,PortSubClass,			1,02
HKR,  Monitor,       1,, "ATS0=0<cr>"
HKR,  Monitor,       2,, "None"
HKR,  Hangup,        1,, "ATH<cr>"
HKR,  Answer,        1,, "ATA<cr>"
HKR,, Reset,	     , "ATZ<cr>"
HKR, Settings, Blind_Off,		, "X4;"
HKR, Settings, Blind_On,		, "X3;"
HKR, Settings, CallSetupFailTimer,	, "S7=<#>;"
HKR, Settings, Compression_Off,		, "+DS=0;"
HKR, Settings, Compression_On,		, "+DS=3;"
HKR, Settings, DialPrefix,		, "D"
HKR, Settings, DialSuffix,		, ";"
HKR, Settings, ErrorControl_Off,	, "+ES=1,0,1;"
HKR, Settings, ErrorControl_On,		, "+ES=3,0,2;"
HKR, Settings, ErrorControl_Forced,	, "+ES=3,2,4;"
HKR, Settings, FlowControl_Off,		, "+IFC=0,0;"
HKR, Settings, FlowControl_Hard,	, "+IFC=2,2;"
HKR, Settings, FlowControl_Soft,	, "+IFC=1,1;"
HKR, Settings, InactivityTimeout,	, "S30=<#>;"
HKR, Settings, Modulation_CCITT,	, "B"
HKR, Settings, Modulation_Bell,		, "B1"
HKR, Settings, Modulation_CCITT_V23,	, "+MS=V23C,0;"
HKR, Settings, Prefix,			, "AT"
HKR, Settings, Pulse,			, "P"
HKR, Settings, SpeakerVolume_Low,	, "L1"
HKR, Settings, SpeakerVolume_Med,	, "L2"
HKR, Settings, SpeakerVolume_High,	, "L3"
HKR, Settings, SpeakerMode_Off,		, "M0"
HKR, Settings, SpeakerMode_Dial,	, "M1"
HKR, Settings, SpeakerMode_On,		, "M2"
HKR, Settings, SpeakerMode_Setup,	, "M3"
HKR, Settings, Terminator,		, "<cr>"
HKR, Settings, Tone,			, "T"

HKR, K56mode,    			1,,"AT+MS=K56,1,28000,33600,31200,56000<cr>"
HKR, V90mode,    			1,,"AT+MS=V90,1,28000,33600,31200,56000<cr>"

[Strings]
MSFT="Microsoft"
Rockwell = "Conexant"
ModemName  	= "Conexant Compatible Internal V90,K56Flex,Voice,Speakerphone"

Mfg = "Diamond"
Modem14PNP="SupraExpress 288 Plug & Play"
Modem6PNP ="SupraFAXModem 288i Plug & Play"
Modem5PNP ="SupraFAXModem 288 Plug & Play"
Modem1GEN ="SupraFAXModem V.32bis"

USR = "Megahertz Corp."
XJ1336="Megahertz CC-XJ1336 Fax-Modem"  ;//WHQL

Diamond  = "Diamond"
Modem17="SupraExpress 56i Sp V.90" ;//WHQL
Modem18PNP="Diamond SupraExpress 56e - PC V.90 PnP" ;//WHQL
Modem19=   "Diamond SupraExpress 56i Voice V.90"  ;//WHQL
Modem20=   "SupraSonic II V.90i"  ;//WHQL
Modem21= "Diamond SupraExpress 56e model SUP2730"

[All]
HKR,, InactivityScale, 1, 0a,00,00,00
HKR,,FriendlyDriver,,Unimodem.VXD
HKR,,DevLoader,,*VCOMM
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Init, 2,, "AT&F2EVQ0W1&C1&D2S95=47S0=0<cr>"
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
HKR, Settings, ErrorControl_Forced,, "&Q5\N4"
HKR, Settings, ErrorControl_Cellular,, "\N3 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N4 &Q5 -K1 *H1 )M1 -C1 -Q0"
HKR, Settings, Compression_Off,, "%%C"
HKR, Settings, Compression_On,, "%%C1"
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

HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>",        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>VOICE<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>",     1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",     1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>",    1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",  1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",  1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "2<cr>",  1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",  1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "5<cr>",  1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "6<cr>",  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",  1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",  1, 07, 00, 00,00,00,00, 00,00,00,00

[INTERNAL]
HKR,, DeviceType, 1, 02

[56K.RESP]
HKR, K56mode,    			1,,"AT+MS=56,1,32000,56000<cr>"
HKR, V90mode,				1,,"AT+MS=12,1,28000,56000<cr>"
HKR, Responses, "<cr><lf>CONNECT 28000<cr><lf>", 	1, 02, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>", 	1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30667<cr><lf>", 	1, 02, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>", 	1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34667<cr><lf>", 	1, 02, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>", 	1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38667<cr><lf>", 	1, 02, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>", 	1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42667<cr><lf>", 	1, 02, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>", 	1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46667<cr><lf>", 	1, 02, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>", 	1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50667<cr><lf>", 	1, 02, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>", 	1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54667<cr><lf>", 	1, 02, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>", 	1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>", 	1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>", 	1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>", 	1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>", 	1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>", 	1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>", 	1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>", 	1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>", 	1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>", 	1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>", 	1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>", 	1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>", 	1, 02, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28000<cr><lf>", 	1, 01, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 29333<cr><lf>", 	1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 30667<cr><lf>", 	1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33333<cr><lf>", 	1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34667<cr><lf>", 	1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 37333<cr><lf>", 	1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38667<cr><lf>", 	1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 41333<cr><lf>", 	1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42667<cr><lf>", 	1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 45333<cr><lf>", 	1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46667<cr><lf>", 	1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 49333<cr><lf>", 	1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50667<cr><lf>", 	1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 53333<cr><lf>", 	1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54667<cr><lf>", 	1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>", 	1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>", 	1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf>", 	1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>", 	1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>", 	1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>", 	1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>", 	1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>", 	1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>", 	1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>", 	1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>", 	1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>", 	1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>", 	1, 01, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>", 			1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 		1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        		1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  		1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 		1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        		1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   		1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",     		1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",    		1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>DATA<cr><lf>",   		1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>VOICE<cr><lf>",  		1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>+FCON<cr><lf>",  		1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "0<cr><lf>",  	   	       		1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr><lf>",  	       	       		1, 02, 00, 00,00,00,00, 00,00,00,00 ; CONNECT
HKR, Responses, "2<cr><lf>",  	       	       		1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr><lf>",  	       	       		1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr><lf>",  	       	       		1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr><lf>",  	       	       		1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr><lf>",  	       		       	1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr><lf>",  		       	       	1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr><lf>",  		       	       	1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "0<cr>",  1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",  1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "2<cr>",  1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",  1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "5<cr>",  1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "6<cr>",  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",  1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",  1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+F4<cr><lf>", 		     	1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX Error
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>", 	1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 	1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>", 	1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>", 	1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>", 	1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>", 	1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>", 	1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>", 	1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>", 	1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>", 	1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>", 	1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>", 	1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>", 	1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>", 	1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>", 	1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>", 	1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 	1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>", 	1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>", 	1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>",	1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>",	1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1D, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1C, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 300<cr><lf>", 		1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75<cr><lf>", 	1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200<cr><lf>", 	1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>", 	1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>", 	1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>", 	1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>", 	1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>", 	1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>", 	1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>", 	1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>", 	1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>", 	1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>", 	1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>", 	1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>", 	1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>", 	1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>", 	1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>", 	1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>",	1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42BIS<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>", 	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>", 	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>", 	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>", 	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 		1, 03, 00, 00,00,00,00, 00,00,00,00

[CID]
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR,, CallerIDPrivate,,P
HKR,, CallerIDOutSide,,O
HKR,, VariableTerminator,,<cr><lf>
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00

[Shotgun.Resp]
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400<cr><lf>", 1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000<cr><lf>", 1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>", 1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57333<cr><lf>", 1, 02, 00, f5,df,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58666<cr><lf>", 1, 02, 00, 2a,e5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 61333<cr><lf>", 1, 02, 00, 95,ef,00,00, 00,00,00,00

[EXTERNAL]
HKR,, DeviceType, 1, 01

[SupraNumeric]
HKR, Responses, "9<cr>",  1, 02, 00, 58,02,00,00, 00,00,00,00 ; CONNECT 600 - Connection at 600 bps
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00 ; CONNECT 2400 - Connection at 2400 bps
HKR, Responses, "11<cr>", 1, 02, 00, C0,12,00,00, 00,00,00,00 ; CONNECT 4800 - Connection at 4800 bps
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00 ; CONNECT 9600 - Connection at 9600 bps
HKR, Responses, "13<cr>", 1, 02, 00, 20,1C,00,00, 00,00,00,00 ; CONNECT 7200 - Connection at 7200 bps
HKR, Responses, "14<cr>", 1, 02, 00, 00,4B,00,00, 00,00,00,00 ; CONNECT 19200 - Connection at 19200 bps
HKR, Responses, "15<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00 ; CONNECT 14400 - Connection at 14400 bps
HKR, Responses, "16<cr>", 1, 02, 00, 00,4B,00,00, 00,00,00,00 ; CONNECT 19200 - Connection at 19200 bps
HKR, Responses, "17<cr>", 1, 02, 00, 00,96,00,00, 00,00,00,00 ; CONNECT 38400 - Connection at 38400 bps
HKR, Responses, "18<cr>", 1, 02, 00, 00,E1,00,00, 00,00,00,00 ; CONNECT 57600 - Connection at 57600 bps
HKR, Responses, "19<cr>", 1, 02, 00, 00,C2,01,00, 00,00,00,00 ; CONNECT 115200 - Connection at 115200 bps
HKR, Responses, "22<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200/75 - Connection at 1200/75 bps
HKR, Responses, "23<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 75/1200 - Connection at 75/1200 bps
HKR, Responses, "33<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX - FAX connection
HKR, Responses, "40<cr>", 1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "44<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "45<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "46<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "47<cr>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "48<cr>", 1, 01, 00, C0,12,00,00, 00,00,00,00 ; CARRIER 4800 - Carrier detected at 4800 bps
HKR, Responses, "49<cr>", 1, 01, 00, 20,1C,00,00, 00,00,00,00 ; CARRIER 7200 - Carrier detected at 7200 bps
HKR, Responses, "50<cr>", 1, 01, 00, 80,25,00,00, 00,00,00,00 ; CARRIER 9600 - Carrier detected at 9600 bps
HKR, Responses, "51<cr>", 1, 01, 00, E0,2E,00,00, 00,00,00,00 ; CARRIER 12000 - Carrier detected at 12000 bps
HKR, Responses, "52<cr>", 1, 01, 00, 40,38,00,00, 00,00,00,00 ; CARRIER 14400 - Carrier detected at 14400 bps
HKR, Responses, "53<cr>", 1, 01, 00, A0,41,00,00, 00,00,00,00 ; CARRIER 16800 - Carrier detected at 16800 bps
HKR, Responses, "54<cr>", 1, 01, 00, 00,4B,00,00, 00,00,00,00 ; CARRIER 19200 - Carrier detected at 19200 bps
HKR, Responses, "55<cr>", 1, 01, 00, 60,54,00,00, 00,00,00,00 ; CARRIER 21600 - Carrier detected at 21600 bps
HKR, Responses, "56<cr>", 1, 01, 00, C0,5D,00,00, 00,00,00,00 ; CARRIER 24000 - Carrier detected at 24000 bps
HKR, Responses, "57<cr>", 1, 01, 00, 20,67,00,00, 00,00,00,00 ; CARRIER 26400 - Carrier detected at 26400 bps
HKR, Responses, "58<cr>", 1, 01, 00, 80,70,00,00, 00,00,00,00 ; CARRIER 28800 - Carrier detected at 28800 bps
HKR, Responses, "59<cr>", 1, 02, 00, A0,41,00,00, 00,00,00,00 ; CONNECT 16800 - Connection at 16800 bps
HKR, Responses, "61<cr>", 1, 02, 00, 60,54,00,00, 00,00,00,00 ; CONNECT 21600 - Connection at 21600 bps
HKR, Responses, "62<cr>", 1, 02, 00, C0,5D,00,00, 00,00,00,00 ; CONNECT 24000 - Connection at 24000 bps
HKR, Responses, "63<cr>", 1, 02, 00, 20,67,00,00, 00,00,00,00 ; CONNECT 26400 - Connection at 26400 bps
HKR, Responses, "64<cr>", 1, 02, 00, 80,70,00,00, 00,00,00,00 ; CONNECT 28800 - Connection at 28800 bps
HKR, Responses, "66<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "67<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "69<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "70<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "76<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "77<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "80<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "81<cr>", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "95<cr>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "96<cr>", 1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "97<cr>", 1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "98<cr>", 1, 01, 00, 60,54,00,00, 00,00,00,00 ; CARRIER 21600 - Carrier detected at 21600 bps
HKR, Responses, "99<cr>", 1, 01, 00, C0,5D,00,00, 00,00,00,00 ; CARRIER 24000 - Carrier detected at 24000 bps
HKR, Responses, "100<cr>", 1, 01, 00, 20,67,00,00, 00,00,00,00 ; CARRIER 26400 - Carrier detected at 26400 bps
HKR, Responses, "101<cr>", 1, 01, 00, 80,70,00,00, 00,00,00,00 ; CARRIER 28800 - Carrier detected at 28800 bps

[56KV9.Resp]
HKR, Responses, "<cr><lf>OK<cr><lf>",1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>LINE IN USE<cr><lf>",1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>DATA<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>VOICE<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>+FCON<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr>",   		1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",   		1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr>",1, 02, 00, 00,00,00,00, 00,00,00,00 ; CONNECT
HKR, Responses, "2<cr>",1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr>",1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr>",1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "<cr><lf>+F4<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX Error

HKR, Responses, "<cr><lf>DELAYED<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00

;DTE rate Rx
HKR, Responses, "<cr><lf>CONNECT 0300<cr><lf>",1, 02, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>",1, 02, 00, 00,00,00,00, 58,02,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>",1, 02, 00, 00,00,00,00, B0,04,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",1, 02, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",1, 02, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",1, 02, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",1, 02, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",1, 02, 00, 00,00,00,00, 40,38,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",1, 02, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",1, 02, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",1, 02, 00, 00,00,00,00, 00,e1,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",1,02, 00, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CONNECT 230400<cr><lf>",1,02, 00, 00,00,00,00, 00,84,03,00

;DCE rate Rx
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>",1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>",1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30667<cr><lf>",1, 02, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",1, 02,  00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>",1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34667<cr><lf>",1, 02, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>",1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38667<cr><lf>",1, 02, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42667<cr><lf>",1, 02, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>",1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>",1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46667<cr><lf>",1, 02, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>",1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50667<cr><lf>",1, 02, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>",1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54667<cr><lf>",1, 02, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",1, 02, 00, C0,DA,00,00, 00,00,00,00

;DTE rate Rx
HKR, Responses, "<cr><lf>CARRIER 0300<cr><lf>",1, 01, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "<cr><lf>CARRIER 0600<cr><lf>",1, 01, 00, 00,00,00,00, 58,02,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>",1, 01, 00, 00,00,00,00, B0,04,00,00
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>",1, 01, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>",1, 01, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>",1, 01, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>",1, 01, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>",1, 01, 00, 00,00,00,00, 40,38,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 38400<cr><lf>",1, 01, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CARRIER 57600<cr><lf>",1, 01, 00, 00,00,00,00, 00,e1,00,00
HKR, Responses, "<cr><lf>CARRIER 115200<cr><lf>",1,01, 00, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CARRIER 230400<cr><lf>",1,01, 00, 00,00,00,00, 00,84,03,00

;DCE rate Rx
HKR, Responses, "<cr><lf>CARRIER 75TX/1200RX<cr><lf>",1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200TX/75RX<cr><lf>",1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>",1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 16800,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 21600,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 24000,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 26400,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 28800,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 31200,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 33600,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>+MRR: 75<cr><lf>",1, 01, 00, 4b,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 300<cr><lf>",1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 600<cr><lf>",1, 01, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 1200<cr><lf>",1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 1200/75<cr><lf>",1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 75/1200<cr><lf>",1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 2400<cr><lf>",1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 4800<cr><lf>",1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 7200<cr><lf>",1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 9600<cr><lf>",1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 12000<cr><lf>",1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 14400<cr><lf>",1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 16800<cr><lf>",1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 19200<cr><lf>",1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 24000<cr><lf>",1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 28000<cr><lf>",1, 01, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>+DR: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+DR: ALT<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+DR: V42B<cr><lf>",	1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+ER: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+ER: ALT<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+ER: LAPM<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00

; Modulation in effect
HKR, Responses, "<cr><lf>+MCR: V90<cr><lf>", 	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: K56<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V34<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V32B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V32<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V22B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V22<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V23C<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V21<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: B212<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: B103<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 	1, 03, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: ALT<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V42BIS<cr><lf>",	1, 01, 01, 00,00,00,00, 00,00,00,00

; Modulation in effect
HKR, Responses, "<cr><lf>MODULATION: V90<cr><lf>", 	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: K56<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V34<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V32B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V32<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V22B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V22<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V23C<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V21<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: B212<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: B103<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00

[56K.Common]
HKR, Init,      			2,, "AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR, Settings, Compression_On,		, "%%C3"
HKR, Settings, ErrorControl_Off,	, "\N"
HKR, Settings, ErrorControl_On,		, "\N3"
HKR, Settings, ErrorControl_Forced,	, "\N2"
HKR, Settings, Modulation_CCITT_V23,	, "+MS=3"
HKR, Settings, SpeakerVolume_Low,	, "L1"

[RockReference.Voice]
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR, WaveDriver,  WaveDevices, 1, 01, 00  ; temp disable dual devices

HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,,Enumerator,			,serwave.vxd
HKR, EnableCallerID, 			1,, "at#cid=1<cr>"
HKR, StartPlay,               		1,, "at#vtx<cr>"
HKR, StopPlay,                		1,, "AT<cr>"	;20-Oct-97 DTMF Fix
HKR, StartRecord,             		1,, "at#vrx<cr>"
HKR, StopRecord,              		1,, "AT<cr>"	;20-Oct-97 DTMF Fix
HKR,,TerminateRecord,			, "!"
HKR,,TerminatePlay,			, "<h10><h03>"
HKR,,AbortPlay,				, "<h10><h18>"
HKR, LineSetPlayFormat,       		1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     		1,, "None"
HKR, LineSetRecordFormat,     		2,, "NoResponse"
HKR, VoiceToDataAnswer,          	1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer,          	2,,"ata<cr>"
HKR, VoiceAnswer,               	1,, "at#cls=8<cr>"
HKR, VoiceAnswer,               	2,, "at#vls=0<cr>"
HKR, VoiceAnswer,               	3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,               	4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,               	5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,               	6,, "ata<cr>"
HKR, VoiceDialNumberSetup,      	1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,      	2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,      	3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,      	4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,      	5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,      	6,, "at#vbs=4<cr>"
HKR, GenerateDigit,             	1,, "at#vts=<Digit><cr>"
HKR,,CallerIDPrivate,			,P
HKR,,CallerIDOutSide,			,O
HKR,,VariableTerminator,		,<cr><lf>
HKR, EnableDistinctiveRing, 		1,, "at-sdr=7<cr>"
HKR,,ForwardDelay,   			1,88,13
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>", 1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>", 1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>", 1, 1a, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
;------- registry entry additions associated with Aux Phone operation ------
HKR,,HandsetCloseDelay,     		1,1e,00,00,00
HKR, HandsetSetRecordFormat,   		1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat,   		2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat,     		1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat,     		2,,"at#vbs=4<cr>"
HKR, OpenHandset,               	1,, "at#cls=8<cr>"
HKR, OpenHandset,               	2,, "at#vls=1<cr>"
HKR, CloseHandset,                   	1,, "at#vls=0<cr>"
HKR, CloseHandset,                   	2,, "at#cls=0<cr>"
;------- registry entry additions associated with speakerphone operation ----
HKR,,SpeakerPhoneSpecs,       		1, 0A,00,00,00,  0f,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      		1,, "at#vls=6<cr>"
HKR, SpeakerPhoneEnable,      		2,, "at#cls=8<cr>"
HKR, SpeakerPhoneEnable,      		3,, "at#spk=1,10,2<cr>"
HKR, SpeakerPhoneDisable,    		1,, "at#spk=0,16,,<cr>"
HKR, SpeakerPhoneDisable,    		2,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,        		1,, "at#vls=6<cr>"
HKR, SpeakerPhoneMute,        		2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneUnMute,      		1,, "at#vls=6<cr>"
HKR, SpeakerPhoneUnMute,      		2,, "at#spk=1,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  	1,, "at#vls=6<cr>"
HKR, SpeakerPhoneSetVolumeGain,  	2,, "at#spk=,<Vol>,<Gain><cr>"

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[56K.Speakerphone]
HKR,,SpeakerPhoneSpecs,       		1, 0A,00,00,00,  0f,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      		1,, "at#cls=8<cr>"
HKR, SpeakerPhoneEnable,      		2,, "at#vls=0<cr>"
HKR, SpeakerPhoneEnable,      		3,, "at#vls=6<cr>"
HKR, SpeakerPhoneEnable,      		4,, "at#spk=1,10,2<cr>"
HKR, SpeakerPhoneDisable,    		1,, "at#spk=0,16,,<cr>"
HKR, SpeakerPhoneDisable,    		2,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,        		1,, "at#vls=6<cr>"
HKR, SpeakerPhoneMute,        		2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneUnMute,      		1,, "at#vls=6<cr>"
HKR, SpeakerPhoneUnMute,      		2,, "at#spk=1,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  	1,, "at#vls=6<cr>"
HKR, SpeakerPhoneSetVolumeGain,  	2,, "at#spk=,<Vol>,<Gain><cr>"

[56K.Voice]
HKR,,VoiceProfile,    	1,25,22,19,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,,Enumerator,			,serwave.vxd
HKR, EnableCallerID, 			1,, "at#cid=1<cr>"
HKR, StartPlay,               		1,, "at#vtx<cr>"
HKR, StopPlay,                		1,, "none"
HKR, StopPlay,                		2,, "NoResponse"
HKR, StartRecord,             		1,, "at#vrx<cr>"
HKR, StopRecord,              		1,, "none"
HKR, StopRecord,              		2,, "NoResponse"
HKR,,TerminateRecord,			, "<h10>E<cr>AT<cr>"
HKR,,TerminatePlay,			, "<h10><h03>AT<cr>"
HKR,,AbortPlay,				, "<h10><h18>AT<cr>"
HKR, LineSetPlayFormat,       		1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     		1,, "None"
HKR, LineSetRecordFormat,     		2,, "NoResponse"
HKR, VoiceToDataAnswer,          	1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer,          	2,,"ata<cr>"
HKR, VoiceAnswer,               	1,, "at#cls=8<cr>"
HKR, VoiceAnswer,               	2,, "at#vls=0<cr>"
HKR, VoiceAnswer,               	3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,               	4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,               	5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                  	6,, "at#vss=2<cr>"
HKR, VoiceAnswer,               	7,, "ats30=60<cr>"
HKR, VoiceAnswer,               	8,, "ata<cr>"
HKR, VoiceDialNumberSetup,      	1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,      	2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,      	3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,      	4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,      	5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,      	6,, "at#vbs=4<cr>"
HKR, VoiceDialNumberSetup,      	7,, "ats30=60<cr>"
HKR, GenerateDigit,             	1,, "at#vts=<Digit><cr>"
HKR,,CallerIDPrivate,			,P
HKR,,CallerIDOutSide,			,O
HKR,,VariableTerminator,		,<cr><lf>
HKR, EnableDistinctiveRing, 		1,, "at-sdr=7<cr>"
HKR,,ForwardDelay,   			1,88,13
HKR, Responses, "<cr><lf>VCON<cr><lf>", 		1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE=", 		      	1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>TIME=", 		      	1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NMBR=", 	      		1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NAME=", 		      	1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MESG=", 		      	1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>",        	1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>",        	1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>",        	1, 1a, 00, 00,00,00,00, 00,00,00,00

[Modem21.resp]
HKR, Responses, "<cr><lf>OK<cr><lf>",1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>LINE IN USE<cr><lf>",1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>DATA<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>VOICE<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>+FCON<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr>",   		1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",   		1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr>",1, 02, 00, 00,00,00,00, 00,00,00,00 ; CONNECT
HKR, Responses, "2<cr>",1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr>",1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr>",1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "<cr><lf>+F4<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX Error

HKR, Responses, "<cr><lf>DELAYED<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>",1, 03, 00, 00,00,00,00, 00,00,00,00

;DTE rate Rx
HKR, Responses, "<cr><lf>CONNECT 0300<cr><lf>",1, 02, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>",1, 02, 00, 00,00,00,00, 58,02,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>",1, 02, 00, 00,00,00,00, B0,04,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",1, 02, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",1, 02, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",1, 02, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",1, 02, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",1, 02, 00, 00,00,00,00, 40,38,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",1, 02, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",1, 02, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",1, 02, 00, 00,00,00,00, 00,e1,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",1,02, 00, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CONNECT 230400<cr><lf>",1,02, 00, 00,00,00,00, 00,84,03,00

;DCE rate Rx
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>",1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>",1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30667<cr><lf>",1, 02, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",1, 02,  00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>",1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34667<cr><lf>",1, 02, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>",1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38667<cr><lf>",1, 02, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42667<cr><lf>",1, 02, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>",1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>",1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46667<cr><lf>",1, 02, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>",1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50667<cr><lf>",1, 02, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>",1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54667<cr><lf>",1, 02, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",1, 02, 00, C0,DA,00,00, 00,00,00,00

;DTE rate Rx
HKR, Responses, "<cr><lf>CARRIER 0300<cr><lf>",1, 01, 00, 00,00,00,00, 2c,01,00,00
HKR, Responses, "<cr><lf>CARRIER 0600<cr><lf>",1, 01, 00, 00,00,00,00, 58,02,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>",1, 01, 00, 00,00,00,00, B0,04,00,00
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>",1, 01, 00, 00,00,00,00, 60,09,00,00
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>",1, 01, 00, 00,00,00,00, c0,12,00,00
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>",1, 01, 00, 00,00,00,00, 20,1c,00,00
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>",1, 01, 00, 00,00,00,00, 80,25,00,00
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>",1, 01, 00, 00,00,00,00, 40,38,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 38400<cr><lf>",1, 01, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CARRIER 57600<cr><lf>",1, 01, 00, 00,00,00,00, 00,e1,00,00
HKR, Responses, "<cr><lf>CARRIER 115200<cr><lf>",1,01, 00, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CARRIER 230400<cr><lf>",1,01, 00, 00,00,00,00, 00,84,03,00

;DCE rate Rx
HKR, Responses, "<cr><lf>CARRIER 75TX/1200RX<cr><lf>",1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200TX/75RX<cr><lf>",1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>",1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 16800,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 21600,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 24000,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 26400,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 28800,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 31200,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 33600,16800<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,19200<cr><lf>",1, 01, 00, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,24000<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,30667<cr><lf>",1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600,56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>+MRR: 75<cr><lf>",1, 01, 00, 4b,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 300<cr><lf>",1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 600<cr><lf>",1, 01, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 1200<cr><lf>",1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 1200/75<cr><lf>",1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 75/1200<cr><lf>",1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 2400<cr><lf>",1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 4800<cr><lf>",1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 7200<cr><lf>",1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 9600<cr><lf>",1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 12000<cr><lf>",1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 14400<cr><lf>",1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 16800<cr><lf>",1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 19200<cr><lf>",1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 21600<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 24000<cr><lf>",1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 26400<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 28000<cr><lf>",1, 01, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 28800<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 29333<cr><lf>",1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 31200<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 32000<cr><lf>",1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 33333<cr><lf>",1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 33600<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 34000<cr><lf>",1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 34667<cr><lf>",1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 36000<cr><lf>",1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 37333<cr><lf>",1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 38000<cr><lf>",1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 38667<cr><lf>",1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 40000<cr><lf>",1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 41333<cr><lf>",1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 42000<cr><lf>",1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 42667<cr><lf>",1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 44000<cr><lf>",1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 45333<cr><lf>",1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 46000<cr><lf>",1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 46667<cr><lf>",1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 48000<cr><lf>",1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 49333<cr><lf>",1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 50000<cr><lf>",1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 50667<cr><lf>",1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 52000<cr><lf>",1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 53333<cr><lf>",1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 54000<cr><lf>",1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 54667<cr><lf>",1, 01, 00, 8B,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MRR: 56000<cr><lf>",1, 01, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>+DR: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+DR: ALT<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+DR: V42B<cr><lf>",	1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+ER: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+ER: ALT<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+ER: LAPM<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00

; Modulation in effect
HKR, Responses, "<cr><lf>+MCR: V90<cr><lf>", 	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: K56<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V34<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V32B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V32<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V22B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V22<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V23C<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: V21<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: B212<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+MCR: B103<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 	1, 03, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>",	1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: ALT<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V42BIS<cr><lf>",	1, 01, 01, 00,00,00,00, 00,00,00,00

; Modulation in effect
HKR, Responses, "<cr><lf>MODULATION: V90<cr><lf>", 	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: K56<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V34<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V32B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V32<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V22B<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V22<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V23C<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: V21<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: B212<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>MODULATION: B103<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00

