; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Rockwell 
; Supports Rockwell Voice modems
[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Rockwell% = Rockwell,NTamd64
%Connectware% = Connectware,NTamd64
%Boca% = Boca,NTamd64
%Psion% = Psion,NTamd64
%Apache% = Apache,NTamd64
%BestData% = BestData,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Rockwell.NTamd64]
%Modem18% = Modem18, PCMCIA\RIPICAB-RC288ACL-0755
%Modem24% = ROCK_08, *RSS0160
%Modem28% = Modem28, *GVC0304
%Modem29% = Modem28, *GVC1601
%Rockwell1%  = Rockwell1, *ANX2101

[Connectware.NTamd64]
%Modem19% = Modem19, PCMCIA\CONNECTWARE-PhoneWorks_28.8_To_Go!-339D

[Boca.NTamd64]
%Modem1% = BOCA_00, *BRI9400
%Modem2% = BOCA_00, *BRIB400

[Apache.NTamd64]
%Apache1% = Apache1, *DNG0010

[BestData.NTamd64]
%modem5%   = modem5, *BDP2336
%modem5%   = modem5, rockv_modem5, unimodem81c731cb

[Apache1]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rockwell_VOICE, Apache1.AddReg, 56K.Resp, INTERNAL, MDMGL004.ExtraCID

[BOCA_00]
DriverVer=03/09/2000
AddReg=All, MfgAddReg, BOCA_00.Addreg, INTERNAL, 56K.Resp

[Modem28]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, ROCKWELL_VOICE, Rock.Numeric.Resp, Modem28.AddReg, INTERNAL, MDMGL004.ExtraCID

[Modem5]
include=mdmgl004.inf
AddReg=All, MfgAddReg, ExtraCRLFResponses, Modem5.AddReg, INTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Rockwell1]
DriverVer=03/09/2000
AddReg=All, MfgAddReg, Rockwell1.AddReg, 56K.Resp, INTERNAL

[ROCK_08]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, ROCKWELL_VOICE, Rockwell_voice2, Modem2.AddReg, INTERNAL, MDMGL004.ExtraCID

[Modem18]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, ROCKWELL_VOICE, Modem18.AddReg, PCMCIA, MDMGL004.ExtraCID

[Modem19]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, ROCKWELL_VOICE, Modem19.AddReg, PCMCIA, MDMGL004.ExtraCID

[Apache1.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,,VoiceProfile,    	1,27,22,09,02
HKR,,Reset,				, "ATZ<cr>"
HKR, Init,      			2,, "AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR, Settings, Modulation_CCITT_V23,	, "+MS=3"
HKR, OpenHandset,               	2,, "at#vls=1<cr>"
HKR, CloseHandset,                   	1,, "at#vls=0<cr>"
HKR, CloseHandset,                   	2,, "at#cls=0<cr>"
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
HKR,WaveDriver, WaveDevices, 1, 02, 00

[BOCA_00.Addreg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,c2,01,00, C0,DA,00,00
HKR,, Reset,, "ATZ<cr>"
HKR, Init,      2,, "AT&FE0V1&C1&D2S0=0S95=47<cr>"
HKR, Settings, Modulation_CCITT_V23,, "+MS=3"
HKR, Settings, SpeedNegotiation_On,, "+MS=,1,,,,"
HKR, K56mode , 1,,"AT+MS=56,1,32000,56000<cr>"

[Modem28.AddReg]	; V.34,Dir Conn
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, 77,03,00,00, 00,c2,01,00, 40,83,00,00
HKR, Init,      2,, "AT&FE0V0&C1&D2S95=47S0=0<cr>"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, ErrorControl_Cellular,, "\N3-K1*H1)M1-Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N2-K1*H1)M1-Q0"
HKR,, Reset,, "ATZ<cr>"
HKR,, VoiceProfile,   1,23,22,19,02
HKR, OpenHandset,               1,, "at#cls=8<cr>"
HKR, OpenHandset,               2,, "at#vls=1<cr>"
HKR, CloseHandset,                   1,, "at#vls=0<cr>"
HKR, CloseHandset,                   2,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,          1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer,          2,,"ata<cr>"
HKR,, HandsetCloseDelay,   1,1e,00,00,00

[Modem5.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F E0 V1 &D2 &C1 W1 S0=0 S95=45<cr>"
HKR,, Reset,, "ATZ<cr>"
HKR, Responses, "<cr><lf>CONNECT 115,200/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CONNECT 115200/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,c2,01,00
HKR, Responses, "<cr><lf>CONNECT 1200 EC<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX REL/MNP5<cr><lf>", 1, 03, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,4b,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,96,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX REL/MNP5<cr><lf>", 1, 03, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOTUSED<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-+FCERROR<cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-FAX<cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00

[Rockwell1.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,,Reset,, "ATZ<cr>"
HKR, Init, 2,, "AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR, Settings, Modulation_CCITT_V23,    , "+MS=3"
HKR, Responses, "<cr><lf>+FCON<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00

[Modem2.AddReg]	; V.34,Dir Conn
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 07,00,00,00, ff,03,00,00, 00,c2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F E0 V1 &C1 &D2 S95=47 S0=0<cr>"
HKR, Settings, ErrorControl_Cellular,, "\N3-K1*H1)M1-Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N2-K1*H1)M1-Q0"
HKR,, Reset,, "ATZ<cr>"
HKR,, VoiceProfile,  1,27,22,19,02

[Modem18.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 80,70,00,00
HKR, VoiceToDataAnswer, 1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer, 2,,"ata<cr>"

[Modem19.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 80,70,00,00
HKR,, VoiceProfile, 1, 25,02,48,02
HKR,WaveDriver, WaveDevices, 1, 01, 00
HKR, VoiceToDataAnswer, 1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer, 2,,"ata<cr>"

[Strings]
MSFT = "Microsoft"
BestData  = "Best Data"
Rockwell = "Conexant"
Connectware = "Connectware"
Apache = "Apache Micro Peripherals"
Boca = "Boca Research"
Modem2 = "Boca 56K Internal Fax Data Plug & Play"
Modem5 = "Best Data Smart One 336SP Modem PnP"
Modem24 = "Conexant V.34 Voice, Speakerphone PnP"	;//WHQL
Modem28 = "Conexant 33.6 PnP" ;//WHQL
Modem29 = "Conexant V.34 PnP Modem"
Rockwell1 = "Conexant Compatible Internal, K56Flex" ;//WHQL
Modem18 = "Conexant 288 PCMCIA Data+Fax+Voice"
Modem19 = "PhoneWorks 28.8 To Go!"
Modem1 = "Boca 56K Internal Fax Data Plug & Play"       ;//WHQL
Apache1 ="Apache NetExpress 56K Voice Modem PnP" ;//WHQL

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,,PortSubClass,1,02
HKR, Init,      1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00

[MfgAddReg]
HKR, Init, 2,, "AT &F E0 V1 &D2 &C1 W2 S95=47<cr>"
HKR,, InactivityScale, 1, 0a,00,00,00
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup,    1,, "ATH<cr>"
HKR, Answer,    1,, "ATA<cr>"
HKR,, Reset,, "AT&F<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, SpeakerVolume_Low,, "L1"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Modulation_CCITT,, "B0 "
HKR, Settings, Modulation_Bell,, "B1 "
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"

HKR, Responses, "+FCON", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+F4<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX Error - Action ERROR
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED", 1, 1c, 00, 00,00,00,00, 00,00,00,00 ; BLACLISTED - Blacklisting Action ERROR
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75/VFC<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 1200/75
HKR, Responses, "<cr><lf>CARRIER 1200/VFC<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000/VFC<cr><lf>", 1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>", 1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200TX/75RX V.23<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400/VFC<cr><lf>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800/VFC<cr><lf>", 1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>", 1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200/VFC<cr><lf>", 1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>", 1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600/VFC<cr><lf>", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400/VFC<cr><lf>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000/VFC<cr><lf>", 1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>", 1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400/VFC<cr><lf>", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800/VFC<cr><lf>", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 300/VFC<cr><lf>", 1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 300<cr><lf>", 1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>", 1, 01, 00, E0,79,00,00, 00,00,00,00 ; CARRIER 31200
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>", 1, 01, 00, 40,83,00,00, 00,00,00,00 ; CARRIER 33600
HKR, Responses, "<cr><lf>CARRIER 4800/VFC<cr><lf>", 1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>", 1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200/VFC<cr><lf>", 1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>", 1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200/VFC<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 75/1200
HKR, Responses, "<cr><lf>CARRIER 75TX/1200RX V.23<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600/VFC<cr><lf>", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42BIS<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:CLASS 5<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:V.42BIS<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/ARQ<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00 ; CONNECT 600
HKR, Responses, "<cr><lf>CONNECT 115,200/ARQ<cr><lf>",1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 REL/MNP5<cr><lf>", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 REL<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/ARQ<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00 ; CONNECT 115200
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 EC<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 REL/MNP5<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 REL/V42<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 REL/V42BIS<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 EC/V42<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 EC/V42BIS<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 EC<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 REL/MNP5<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 REL/V42<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 REL/V42BIS<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 REL<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00 ; CONNECT 12000
HKR, Responses, "<cr><lf>CONNECT 12000/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL-LAPM<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>", 1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX REL/MNP5<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 EC/V42<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 EC/V42BIS<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 EC<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 REL/MNP5<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 REL/V42<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 REL/V42BIS<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 REL<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-LAPM<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 EC/V42<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 EC/V42BIS<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 EC<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 REL/MNP5<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 REL/V42<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 REL/V42BIS<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 REL<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/REL-LAPM<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>", 1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 EC/V42<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 EC/V42BIZ<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 EC<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 REL/MNP5<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 REL/V42<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 REL/V42BIS<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 REL<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ<cr><lf>", 1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/REL-LAPM<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>", 1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 REL/MNP5<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 REL<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,84,03,00
HKR, Responses, "<cr><lf>CONNECT 2400 EC/V42<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 EC/V42BIS<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 EC<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 REL/MNP5<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 REL/V42<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 REL/V42BIS<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 REL<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 REL/MNP5<cr><lf>", 1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 REL<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>", 1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 REL/MNP5<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 REL<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 REL/MNP5<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 REL<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 REL/MNP5<cr><lf>", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 REL<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300<cr><lf>", 1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ<cr><lf>", 1, 02, 02, E0,79,00,00, 00,00,00,00 ; CONNECT 31200
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>", 1, 02, 00, E0,79,00,00, 00,00,00,00 ; CONNECT 31200
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00 ; CONNECT 33600
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>", 1, 02, 00, 40,83,00,00, 00,00,00,00 ; CONNECT 33600
HKR, Responses, "<cr><lf>CONNECT 38400 REL/MNP5<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 REL<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/ARQ<cr><lf>", 1, 02, 02, 00,96,00,0, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 EC/V42<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 EC/V42BIS<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 EC<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 REL/MNP5<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 REL/V42<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 REL/V42BIS<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 REL<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ<cr><lf>", 1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-LAPM<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>", 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 REL/MNP5<cr><lf>", 1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 REL<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,E1,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>", 1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 REL/MNP5<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 REL<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 EC/V42<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 EC/V42BIS<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 EC<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 REL/MNP5<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 REL/V42<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 REL/V42BIS<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 REL<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ<cr><lf>", 1, 02, 02, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-LAPM<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>", 1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX REL/MNP5<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 EC/V42<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 EC/V42BIS<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 EC<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 REL/MNP5<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 REL/V42<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 REL/V42BIS<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 REL<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-LAPM<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT EC<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT REL/MNP5<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT REL<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED", 1, 1d, 00, 00,00,00,00, 00,00,00,00 ; DELAYED - Blacklisting Action ERROR
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOTUSED<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT - CELLULAR<cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ALT-CELLULAR
HKR, Responses, "<cr><lf>PROTOCOL: ALT-+FCERROR<cr><lf>",1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-CELLULAR<cr><lf>",1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-DATA<cr><lf>", 1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-FAX<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAPM<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP2<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP3<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP4<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: V.42BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: V42BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:ALT-+FCERROR<cr><lf>", 1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:ALT<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:ALT-CELLULAR<cr><lf>", 1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:ALT-DATA<cr><lf>", 1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:ALT-FAX<cr><lf>", 1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:LAPM<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:LAP-M<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:MNP<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:MNP2<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:MNP3<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:MNP4<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:V.42BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:V42BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>VOICE<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "11<cr>", 1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "13<cr>", 1, 02, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "14<cr>", 1, 02, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "15<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00 ; connect at 14400
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "69<cr>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "70<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00 ; Protocol:None
HKR, Responses, "77<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; Protocol:LAPM
HKR, Responses, "78<cr>", 1, 01, 03, 00,00,00,00, 00,00,00,00 ; Connect V42BIS
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "80<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; Prorocol:ALT
HKR, Responses, "81<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "DATA", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "FAX", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "VOICE", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR

[56K.Resp]
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>", 1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>", 1, 02, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>", 1, 02, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>", 1, 02, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>", 1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>", 1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>", 1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>", 1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>", 1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>", 1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>", 1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>", 1, 02, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000<cr><lf>", 1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>", 1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400<cr><lf>", 1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000/ARQ<cr><lf>", 1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ<cr><lf>", 1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000/ARQ<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/ARQ<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000/ARQ<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000/ARQ<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000/ARQ<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000/ARQ<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/ARQ<cr><lf>", 1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000/ARQ<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/ARQ<cr><lf>", 1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>", 1, 01, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>", 1, 01, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf>", 1, 01, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>", 1, 01, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>", 1, 01, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>", 1, 01, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>", 1, 01, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>", 1, 01, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>", 1, 01, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>", 1, 01, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>", 1, 01, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>", 1, 01, 00, c0,da,00,00, 00,00,00,00

[INTERNAL]
HKR,, DeviceType, 1, 02

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[Rock.Numeric.Resp]
HKR, Responses, "9<cr>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "16<cr>", 1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "17<cr>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "18<cr>", 1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "19<cr>", 1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "22<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "23<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "24<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "32<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "40<cr>", 1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "44<cr>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "45<cr>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "46<cr>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "47<cr>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "48<cr>", 1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "49<cr>", 1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "50<cr>", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "51<cr>", 1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "52<cr>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "53<cr>", 1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "54<cr>", 1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "55<cr>", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "56<cr>", 1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "57<cr>", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "58<cr>", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "78<cr>", 1, 01, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "79<cr>", 1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "59<cr>", 1, 02, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "61<cr>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "62<cr>", 1, 02, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "63<cr>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "64<cr>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "91<cr>", 1, 02, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "84<cr>", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "66<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "67<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "69<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "70<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "81<cr>", 1, 01, 0a, 00,00,00,00, 00,00,00,00

[ExtraCRLFResponses]
HKR, Responses, "<cr><lf><cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf><cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf><cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf><cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf><cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf><cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00

[Rockwell_voice2]     ;voice modem,speakerphone
HKR, CloseHandset, 2,, "at#cls=0<cr>"
HKR, SpeakerPhoneDisable, 2,, "at#vls=0<cr>"
HKR, SpeakerPhoneEnable, 2,, "at#cls=8<cr>"
HKR, SpeakerPhoneEnable, 3,, "at#spk=1,10,2<cr>"
HKR, SpeakerPhoneMute, 2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain, 2,, "at#spk=,<Vol>,<Gain><cr>"
HKR, SpeakerPhoneUnMute, 2,, "at#spk=1,,,<cr>"
HKR, VoiceToDataAnswer, 1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer, 2,,"ata<cr>"

[ROCKWELL_VOICE]
HKR,,Enumerator,,serwave.vxd
HKR,, VoiceProfile, 1, 27,02,48,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR, OpenHandset, 1,, "at#cls=8<cr>"
HKR, OpenHandset, 2,, "at#vls=2<cr>"
HKR, VoiceAnswer, 1,, "at#cls=8<cr>"
HKR, VoiceAnswer, 2,, "at#vls=0<cr>"
HKR, VoiceAnswer, 3,, "at#vbt=1<cr>"
HKR, VoiceAnswer, 4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer, 5,, "at#vbs=4<cr>"
HKR, VoiceAnswer, 6,, "ata<cr>"
HKR, VoiceDialNumberSetup, 1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup, 2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup, 3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup, 4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup, 5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup, 6,, "at#vbs=4<cr>"
HKR, GenerateDigit, 1,, "at#vts=<Digit><cr>"
HKR,, CallerIDPrivate,, P
HKR,, CallerIDOutSide,, O
HKR,, VariableTerminator,,<cr><lf>
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, SpeakerPhoneSpecs, 1, 00,00,00,00, 0f,00,00,00, 03,00,00,00, 00,00,00,00
HKR, SpeakerPhoneEnable, 1,, "at#vls=5<cr>"
HKR, SpeakerPhoneDisable, 1,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute, 1,, "at<cr>"
HKR, SpeakerPhoneUnMute, 1,, "at<cr>"
HKR, SpeakerPhoneSetVolumeGain, 1,, "at<cr>"
HKR,, HandsetCloseDelay, 1, 05,00,00,00
HKR,, ForwardDelay, 1,88,13
HKR, CloseHandset, 1,, "at#cls=0<cr>"
HKR, StartPlay, 1,, "at#vtx<cr>"
HKR, StopPlay, 1,, "None"
HKR, StopPlay, 2,, "NoResponse"
HKR, StartRecord, 1,, "at#vrx<cr>"
HKR, StopRecord, 1,, "None"
HKR, StopRecord, 2,, "NoResponse"
HKR,, TerminateRecord,, "!"
HKR,, TerminatePlay,, "<h10><h03>"
HKR,, AbortPlay,, "<h10><h18>"
HKR, LineSetPlayFormat, 1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat, 1,, "None"
HKR, LineSetRecordFormat, 2,, "NoResponse"
HKR, HandsetSetRecordFormat, 1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat, 2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat, 1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat, 2,,"at#vbs=4<cr>"
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>", 1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>", 1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>", 1, 1a, 00, 00,00,00,00, 00,00,00,00


