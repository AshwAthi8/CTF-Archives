; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer:   Askey and Cardinal modems
[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Askey% = Askey,NTamd64
%Cardinal% = Cardinal,NTamd64
%GVC% = GVC,NTamd64
%Viking% = Viking,NTamd64
%Radicom% = Radicom,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Askey.NTamd64]
%Askey1% = Askey4, SERENUM\AKY1014
%Askey2% = Askey2, *AKY00A1
%Askey3% = Askey3, *AKY1001
%Askey4PnP% = Askey4, SERENUM\AKY1007
%Askey5PnP% = Askey5, SERENUM\AKY1011
%Askey6% = Askey6, *AKY1005

[Cardinal.NTamd64]
%Modem23% = MVPV34IV, ISAPNP\CRD0031
%Modem22% = MVPV34I, ISAPNP\CRD0030
%Modem19% = MVPV34ISP, ISAPNP\CRD0011
%Modem18% = MVPV34PC, PCMCIA\Cardinal-Cardinal_336_PC_Card-86DC

[GVC.NTamd64]
%Modem55PNP%   = ROCK_55, *GVC0505  ;SF1156HV+/R19-P,SF1156HV/R19,SF1156HV/R19-DL
%Modem56PNP%   = ROCK_56, SERENUM\GVC0300
%Modem0103PnP% = ROCK57, SERENUM\GVC0103  ; VF1133V/R6

[Viking.NTamd64]
%Viking1% = Viking1, PCMCIA\VIKING-K56FLEX_PC_CARD-1288

[Radicom.NTamd64]
%Radicom1%  = Radicom1, *RRI1000

[MVPV34PC]
DriverVer=03/09/2000
AddReg=All, MfgAddReg, Modem3.AddReg, PCMCIA

[Askey2]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, Askey.AddReg, Askey.Resp, RockK56.Resp, Askey2.AddReg, INTERNAL, MDMGL004.ExtraCID

[Askey3]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, Askey.AddReg, Askey.Resp, Askey3.AddReg, INTERNAL, MDMGL004.ExtraCID

[Askey4]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, Askey.AddReg, Askey.Resp, RockK56.Resp, Askey4.AddReg, EXTERNAL, MDMGL004.ExtraCID

[Askey5]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, Askey.AddReg, Askey.Resp, Askey5.AddReg, EXTERNAL, MDMGL004.ExtraCID

[Askey6]
DriverVer=10/10/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, Askey.AddReg,Askey6.AddReg, AskeyAll,MDMGL004.V23response,MDMGL004.X2response,MDMGL004.V90response,INTERNAL

[ROCK_55]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, RockK56.Resp, GVC.Addreg, INTERNAL, MDMGL004.ExtraCID

[Viking1]
DriverVer=03/09/2000
AddReg=All, MfgAddReg, Askey.Resp, RockK56.Resp, Viking1.AddReg, PCMCIA

[ROCK_56]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, RockK56.Resp, GVC.Addreg, GVC.modem56, EXTERNAL, MDMGL004.ExtraCID

[ROCK57]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Rock.Voice, RockK56.Resp, Rock57.Resp, ROCK57.Addreg, EXTERNAL, MDMGL004.ExtraCID

[MVPV34IV]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Cardinal.AddReg, Modem2.AddReg, Rock.Voice, INTERNAL, MDMGL004.ExtraCID

[Radicom1]
DriverVer=03/09/2000
AddReg=All, MfgAddReg, RockK56.Resp, Radicom1.AddReg, INTERNAL

[MVPV34I]
DriverVer=03/09/2000
AddReg=All, MfgAddReg, Cardinal.AddReg, Modem2.AddReg, INTERNAL

[MVPV34ISP]
DriverVer=03/09/2000
include=mdmgl004.inf
AddReg=All, MfgAddReg, Cardinal.AddReg, Modem2.AddReg, Rock.Voice, INTERNAL, MDMGL004.ExtraCID

[Modem3.AddReg]
HKR,, Properties, 1, c0,01,00,00, ff,00,00,00, ff,00,00,00, 06,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F &C1 V1 E0 &D2 S95=47 S0=0<cr>"
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, SpeakerVolume_Low,, "L1"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR,, FClass, 1, 0f,00,00,00

[Askey2.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR,,VoiceProfile,   1,27,22,09,02

[Askey3.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, F7,07,00,00, 00,c2,01,00, 40,83,00,00
HKR, Settings, DialSuffix,, ""
HKR,,VoiceProfile,   1,27,22,19,02
HKR,, SpeakerPhoneSpecs,       1, 04,00,00,00,  0F,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      3,, "at#spk=1,10,2<cr>"
HKR, SpeakerPhoneDisable,    1,, "at#spk=0,15,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  1,, "at#spk=,<Vol>,<Gain><cr>"

[Askey4.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,07,00,00, 00,C2,01,00, 60,EA,00,00
HKR,,VoiceProfile,   1,27,22,09,02

[Askey5.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, F7,07,00,00, 00,c2,01,00, 40,83,00,00
HKR, Settings, DialSuffix,, ""
HKR,,VoiceProfile,   1,27,22,09,02
HKR,, SpeakerPhoneSpecs,       1, 04,00,00,00,  0F,00,00,00,  01,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      3,, "at#spk=1,10,2<cr>"
HKR, SpeakerPhoneDisable,    1,, "at#spk=0,15,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  1,, "at#spk=,<Vol>,<Gain><cr>"

[Askey6.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,07,00,00, 00,C2,01,00, 00,FA,00,00
HKR,, VoiceProfile,1,27,0C,19,00

[GVC.Addreg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,c2,01,00, C0,DA,00,00
HKR,, InactivityScale, 1, 0a,00,00,00
HKR,, Reset,, "ATZ<cr>"
HKR, Init,      2,, "AT&FE0V1&C1&D2S95=47S0=0<cr>"
HKR, Settings, Compression_On,		, "%%C3"
HKR, Settings, ErrorControl_Forced,	, "\N2"
HKR, Settings, InactivityTimeout,	, "S30=<#>"
HKR, Settings, SpeakerVolume_Low,	, "L1"
HKR,, VoiceProfile,    			1,27,22,19,02
HKR, CloseHandset,                   1,, "at#vls=0<cr>"
HKR, CloseHandset,                   2,, "at#cls=0<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, ForwardDelay,   1,88,13
HKR,, SpeakerPhoneSpecs,       1, 0A,00,00,00,  0f,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneEnable,      2,, "at#cls=8<cr>"
HKR, SpeakerPhoneEnable,      3,, "at#spk=1,10,2<cr>"
HKR, SpeakerPhoneDisable,    1,, "at#spk=0,16,,<cr>"
HKR, SpeakerPhoneDisable,    2,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,        1,, "at#vls=6<cr>"
HKR, SpeakerPhoneMute,        2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneUnMute,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneUnMute,      2,, "at#spk=1,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  1,, "at#vls=6<cr>"
HKR, SpeakerPhoneSetVolumeGain,  2,, "at#spk=,<Vol>,<Gain><cr>"

[Viking1.AddReg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 60,EA,00,00
HKR, Init,	2,, "AT&FE0V1&C1&D2S95=47S0=0<cr>"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR, Settings, SpeakerVolume_Low,, "L1"
HKR,, InactivityScale, 1, 0a,00,00,00
HKR,, Reset,, "ATZ<cr>"
HKR, Responses, "<cr><lf>PROTOCOL: ALT - CELLULAR<cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:ALT-CELLULAR<cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00

[GVC.modem56]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,c2,01,00, 40,83,00,00

[ROCK57.Addreg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, 5a,00,00,00, 07,00,00,00, 0f,00,00,00, 77,03,00,00, 00,c2,01,00, 40,83,00,00
HKR,, VoiceProfile, 1, 23,03,08,02
HKR, Init,      2,, "AT&FE0&D2&C1S0=0<cr>"
HKR, Settings, FlowControl_Off,, "\Q0"
HKR, Settings, FlowControl_Hard,, "\Q3"
HKR, Settings, FlowControl_Soft,, "\Q1"
HKR, Settings, ErrorControl_On,, "\N6"
HKR, Settings, ErrorControl_Forced,, "\N5"
HKR, Settings, SpeedNegotiation_Off,, "B2"
HKR, Settings, SpeedNegotiation_On,, "B2"
HKR, Settings, InactivityTimeout,, "\T<#>"

;;[Modem1.AddReg]
;;HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, 5a,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 80,70,00,00

[Modem2.AddReg]
HKR,, Properties, 1, c0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,c2,01,00, 40,83,00,00

[Radicom1.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, C0,DA,00,00
HKR,,InactivityScale, 1, 0a,00,00,00
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR,,Reset,, "ATZ<cr>"
HKR, Init, 2,, "AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, SpeakerVolume_Low,, "L1"

[Strings]
MSFT     = "Microsoft"

Askey     = "Askey"
Askey1 = "V1456VQE 56K MODEM"
Askey2    = "V1456VQH-R 56K MODEM"      ;//WHQL
Askey3    = "V1433VQH-33.6K MODEM"      ;//WHQL
Askey4PnP = "V1456VQE-R 56K MODEM PnP"  ;//WHQL
Askey5PNP = "V1433VQE-33.6K Modem PnP"  ;//WHQL
Askey6    = "56K PnP VOICE DATA FAX Modem"

Cardinal  ="Cardinal"
Modem23="Cardinal-336 Int Voice PnP"  		;//WHQL
Modem22="Cardinal-336 Internal PnP"     	;//WHQL
Modem19="Cardinal-336 Int SpeakerPhone PnP" 	;//WHQL
Modem18="Cardinal-336 PC Card"                  ;//WHQL

GVC = "GVC"
Modem55PNP  = "GVC K56 Voice Speakerphone Modem" ;//WHQL
Modem56PNP  = "GVC 33.6K External, Voice, Speakerphone Modem PnP"
Modem0103PnP="GVC 33.6K Data Fax Voice VF1133V-R6 Modem PnP"

Viking = "Viking Components, Inc."
Viking1 = "Viking K56Flex PC-Card Modem" ;//WHQL

Radicom	= "Radicom"
Radicom1 = "K56Flex Data Fax Modem PnP" ;//WHQL

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"

[MfgAddReg]
HKR, Init, 2,, "AT &F E0 V1 &D2 &C1 W2 \V1 S0=0<cr>"
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Settings, InactivityTimeout,, "\T<#>"
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
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\N4"
HKR, Settings, Compression_On,, "%%C1"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"

HKR, Responses, "1<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "5<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "9<cr>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "11<cr>", 1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCON<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+F4<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>", 1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>", 1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>", 1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>", 1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 300<cr><lf>", 1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>", 1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>", 1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>", 1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>", 1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42bis<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/ARQ<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/REL-V.42<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/V42<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/NOR<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL COMP<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL-V.42<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/V42<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/NOR<cr><lf>", 1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL COMP<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL-V.42<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V42<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>", 1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/NOR<cr><lf>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL COMP<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-V.42<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V42<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/NOR<cr><lf>", 1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/REL COMP<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/REL-V.42<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V42<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>", 1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/NOR<cr><lf>", 1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/REL COMP<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/REL-V.42<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V42<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>", 1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/NOR<cr><lf>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/REL COMP<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/REL-V.42<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V42<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/NOR<cr><lf>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL COMP<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL-V.42<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V42<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/NOR<cr><lf>", 1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/REL COMP<cr><lf>", 1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/REL-V.42<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V42<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>", 1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/NOR<cr><lf>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/REL COMP<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/REL-V.42<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V42<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/NOR<cr><lf>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/REL COMP<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/REL-V.42<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V42<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/NOR<cr><lf>", 1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL COMP<cr><lf>", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL-V.42<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/V42<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ<cr><lf>", 1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>", 1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/ARQ<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/NOR<cr><lf>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/REL COMP<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/REL-V.42<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/V42<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/NOR<cr><lf>", 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL COMP<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-V.42<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V42<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>", 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/ARQ<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/NOR<cr><lf>", 1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/REL COMP<cr><lf>", 1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/REL-V.42<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/V42<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>", 1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/NOR<cr><lf>", 1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL COMP<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-V.42<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V42<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>", 1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/NOR<cr><lf>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL COMP<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-V.42<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V42<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>", 1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-CELLULAR<cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75/VFC<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/VFC<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000/VFC<cr><lf>", 1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400/VFC<cr><lf>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800/VFC<cr><lf>", 1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200/VFC<cr><lf>", 1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600/VFC<cr><lf>", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400/VFC<cr><lf>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000/VFC<cr><lf>", 1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400/VFC<cr><lf>", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800/VFC<cr><lf>", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 300/VFC<cr><lf>", 1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 4800/VFC<cr><lf>", 1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200/VFC<cr><lf>", 1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200/VFC<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600/VFC<cr><lf>", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: ADC<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: CLASS5<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: MNP5<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42 BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V42BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/ARQ<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/LAP-M<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/MNP<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/REL<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/V42b<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/V42BIS<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200<cr><lf>", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200/ARQ<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200/LAP-M<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200/MNP<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200/REL<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200/V42b<cr><lf>", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115,200/V42BIS<cr><lf>", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/LAP-M<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/MNP<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/REL<cr><lf>", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/V42b<cr><lf>", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/V42BIS<cr><lf>", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/V42b<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/V42BIS<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL-LAPM<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL-MNP 5<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL-MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/V42b<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/V42BIS<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/LAP-M<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/MNP<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL-LAPM<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL-MNP 5<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL-MNP<cr><lf>", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V42b<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V42BIS<cr><lf>", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/V42b<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/V42BIS<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/LAP-M<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/MNP<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-LAPM<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-MNP 5<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL-MNP<cr><lf>", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V42b<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V42BIS<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/LAP-M<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/MNP<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/REL<cr><lf>", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V42b<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V42BIS<cr><lf>", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/LAP-M<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/MNP<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/REL<cr><lf>", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V42b<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V42BIS<cr><lf>", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/LAP-M<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/MNP<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/REL<cr><lf>", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V42b<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V42BIS<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/LAP-M<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/MNP<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL-LAPM<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL-MNP 5<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL-MNP<cr><lf>", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V42b<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V42BIS<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/LAP-M<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/MNP<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/REL<cr><lf>", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V42b<cr><lf>", 1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V42BIS<cr><lf>", 1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/LAP-M<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/MNP<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/REL<cr><lf>", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V42b<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V42BIS<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/LAP-M<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/MNP<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/REL<cr><lf>", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V42b<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V42BIS<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300<cr><lf>", 1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/ARQ<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/LAP-M<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/MNP<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL-LAPM<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL-MNP 5<cr><lf>", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL-MNP<cr><lf>", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/V42b<cr><lf>", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/V42BIS<cr><lf>", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/LAP-M<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/MNP<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/REL<cr><lf>", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/V42b<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/V42BIS<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/LAP-M<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/MNP<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-LAPM<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-MNP 5<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL-MNP<cr><lf>", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V42b<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V42BIS<cr><lf>", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/LAP-M<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/MNP<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/REL<cr><lf>", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/V42b<cr><lf>", 1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/V42BIS<cr><lf>", 1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/ARQ<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/LAP-M<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/MNP<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/REL<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/REL-LAPM<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/REL-MNP 5<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/REL-MNP<cr><lf>", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/V42b<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/V42BIS<cr><lf>", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/LAP-M<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/MNP<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-LAPM<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-MNP 5<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL-MNP<cr><lf>", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V42b<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V42BIS<cr><lf>", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/V42b<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/V42BIS<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/V42b<cr><lf>", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/V42BIS<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/LAP-M<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/MNP<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-LAPM V.42 BIS<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-LAPM<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-MNP 5<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL-MNP<cr><lf>", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V42b<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V42BIS<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/ARQ<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/LAP-M<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/MNP<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/REL<cr><lf>", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/V42b<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/V42BIS<cr><lf>", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAPM<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP2<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP3<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP4<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>VOICE<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[Askey.AddReg]
HKR,, InactivityScale, 1, 0a,00,00,00
HKR,, Reset,, "ATZ<cr>"
HKR, Init,      2,, "AT&FE0V1&C1&D2S95=47S0=0<cr>"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR, Settings, Modulation_CCITT_V23,, "+MS=3"
HKR, Settings, SpeakerVolume_Low,, "L1"
HKR, StopPlay,                1,, "at<cr>"
HKR, StopPlay,                2,, "at<cr>"
HKR, StopRecord,              1,, "at<cr>"
HKR, StopRecord,              2,, "at<cr>"
HKR, CloseHandset,                   1,, "at#vls=0<cr>"
HKR, CloseHandset,                   2,, "at#cls=0<cr>"
HKR, EnableDistinctiveRing, 1,, "at-sdr=7<cr>"
HKR,, SpeakerPhoneSpecs,       1, 08,00,00,00,  0f,00,00,00,  01,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneEnable,      2,, "at#cls=8<cr>"
HKR, SpeakerPhoneEnable,      3,, "at#spk=1,8,1<cr>"
HKR, SpeakerPhoneDisable,    1,, "at#spk=0,16,,<cr>"
HKR, SpeakerPhoneDisable,    2,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,        1,, "at#vls=6<cr>"
HKR, SpeakerPhoneMute,        2,, "at#spk=0,,,<cr>"
HKR, SpeakerPhoneUnMute,      1,, "at#vls=6<cr>"
HKR, SpeakerPhoneUnMute,      2,, "at#spk=1,,,<cr>"
HKR, SpeakerPhoneSetVolumeGain,  1,, "at#vls=6<cr>"
HKR, SpeakerPhoneSetVolumeGain,  2,, "at#spk=,<Vol>,<Gain><cr>"

[Askey.Resp]
HKR, Responses, "<cr><lf>CONNECT 0300<cr><lf>", 1, 02, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0300/ARQ<cr><lf>", 1, 02, 02, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ<cr><lf>", 1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000/ARQ<cr><lf>", 1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ<cr><lf>", 1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000/ARQ<cr><lf>", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ<cr><lf>", 1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000/ARQ<cr><lf>", 1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ<cr><lf>", 1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000/ARQ<cr><lf>", 1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ<cr><lf>", 1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000/ARQ<cr><lf>", 1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ<cr><lf>", 1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000/ARQ<cr><lf>", 1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ<cr><lf>", 1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000/ARQ<cr><lf>", 1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000/ARQ<cr><lf>", 1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 600<cr><lf>", 1, 01, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 0300<cr><lf>", 1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 0600<cr><lf>", 1, 01, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200TX/75RX<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75TX/1200RX<cr><lf>", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38400<cr><lf>", 1, 01, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 57600<cr><lf>", 1, 01, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 115200<cr><lf>", 1, 01, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200/VFC<cr><lf>", 1, 01, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600/VFC<cr><lf>", 1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38400/VFC<cr><lf>", 1, 01, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 57600/VFC<cr><lf>", 1, 01, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 115200/VFC<cr><lf>", 1, 01, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 32000/VFC<cr><lf>", 1, 01, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000/VFC<cr><lf>", 1, 01, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000/VFC<cr><lf>", 1, 01, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000/VFC<cr><lf>", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000/VFC<cr><lf>", 1, 01, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000/VFC<cr><lf>", 1, 01, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000/VFC<cr><lf>", 1, 01, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000/VFC<cr><lf>", 1, 01, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000/VFC<cr><lf>", 1, 01, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000/VFC<cr><lf>", 1, 01, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000/VFC<cr><lf>", 1, 01, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000/VFC<cr><lf>", 1, 01, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000/VFC<cr><lf>", 1, 01, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 58000/VFC<cr><lf>", 1, 01, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 60000/VFC<cr><lf>", 1, 01, 00, 60,ea,00,00, 00,00,00,00

[RockK56.Resp]
HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42BIS<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
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
HKR, Responses, "<cr><lf>CARRIER 58000<cr><lf>", 1, 01, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 60000<cr><lf>", 1, 01, 00, 60,ea,00,00, 00,00,00,00

[INTERNAL]
HKR,, DeviceType, 1, 02

[EXTERNAL]
HKR,, DeviceType, 1, 01

[Rock57.Resp]
HKR, Responses, "5<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf><cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/MNP<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/MNP<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/MNP COMPRESSED<cr><lf>", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/MNP COMPRESSED<cr><lf>", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/MNP COMPRESSED<cr><lf>", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/MNP COMPRESSED<cr><lf>", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/MNP COMPRESSED<cr><lf>", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/MNP COMPRESSED<cr><lf>", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/MNP COMPRESSED<cr><lf>", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/MNP COMPRESSED<cr><lf>", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/MNP COMPRESSED<cr><lf>", 1, 02, 03, a0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/MNP COMPRESSED<cr><lf>", 1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/MNP COMPRESSED<cr><lf>", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/MNP COMPRESSED<cr><lf>", 1, 02, 03, c0,5d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/MNP COMPRESSED<cr><lf>", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/MNP COMPRESSED<cr><lf>", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/MNP COMPRESSED<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/MNP COMPRESSED<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/MNP COMPRESSED<cr><lf>", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/MNP COMPRESSED<cr><lf>", 1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/MNP COMPRESSED<cr><lf>", 1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V42<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V42<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V42BIS<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V42BIS<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00

[Cardinal.AddReg]
HKR, Init, 2,, "AT &F &C1 V1 E0 &D2 W2 S95=47 S0=0<cr>"
HKR,,InactivityScale, 1, 0a,00,00,00
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, DialSuffix,,  ""
HKR, Settings, ErrorControl_On,, "\N4"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR,, FClass, 1, 8F,00,00,00

[Rock.Voice] ; Rockwell, disabled: spkph, mic/spkr jacks, dist ring, enabled: handset and cid
HKR,,Enumerator,,serwave.vxd
HKR,, VoiceProfile,    1,23,82,08,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
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
HKR,, ForwardDelay,            1,88,13
HKR, CloseHandset,                   1,, "at#cls=0<cr>"
HKR, VoiceAnswer,               1,, "at#cls=8<cr>"
HKR, VoiceAnswer,               2,, "at#vls=0<cr>"
HKR, VoiceAnswer,               3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,               4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,               5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,               6,, "ata<cr>"
HKR, VoiceToDataAnswer,         1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,         2,, "ata<cr>"
HKR, VoiceDialNumberSetup,      1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,      2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,      3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,      4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,      5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,      6,, "at#vbs=4<cr>"
HKR, GenerateDigit,             1,, "at#vts=<Digit><cr>"
HKR,, CallerIDPrivate,,P
HKR,, CallerIDOutSide,,O
HKR,, VariableTerminator,,<cr><lf>
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>",        1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>",        1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>",        1, 1a, 00, 00,00,00,00, 00,00,00,00

[AskeyAll]
HKR,, ConfigDialog,,modemui.dll
HKR,, DevLoader,,*vcomm
HKR,, EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,, FriendlyDriver,,unimodem.vxd
HKR,, PortSubClass,1,02
HKR,, InactivityScale,1,0a,00,00,00
HKR,, Reset,,"AT&F1<cr>"
HKR,, CompatibilityFlags, 1, 01, 00, 00, 00
HKR, Answer,1,,"ATA<cr>"
HKR, Hangup,1,,"ATH<cr>"
HKR, Init,1,,"AT#CLS=0<cr>"
HKR, Init,2,,"AT&F1E0Q0V1&C1&D2S0=0<cr>"

HKR, Monitor,1,,"ATS0=0<cr>"
HKR, Monitor,2,,"None"

HKR, Settings,Blind_Off,,"X4"
HKR, Settings,Blind_On,,"X3"
HKR, Settings,CallSetupFailTimer,,"S7=<#>"
HKR, Settings,Compression_Off,,"&K0"
HKR, Settings,Compression_On,,"&K1"
HKR, Settings,DialPrefix,,"D"
HKR, Settings,DialSuffix,,";"
HKR, Settings,ErrorControl_Forced,,"&M5"
HKR, Settings,ErrorControl_Off,,"&M0"
HKR, Settings,ErrorControl_On,,"&M4"
HKR, Settings,FlowControl_Hard,,"&H1&R2&I0"
HKR, Settings,FlowControl_Off,,"&H0&I0&R1"
HKR, Settings,FlowControl_Soft,,"&H2&I2&R1"
HKR, Settings,InactivityTimeout,,"S19=<#>"
HKR, Settings,Modulation_Bell,,"B1"
HKR, Settings,Modulation_CCITT,,"B0"
HKR, Settings,Modulation_CCITT_V23,,"B0S32=28S27=16&M0&N2"
HKR, Settings,Prefix,,"AT"
HKR, Settings,Pulse,,"P"
HKR, Settings,SpeakerMode_Dial,,"M1"
HKR, Settings,SpeakerMode_Off,,"M0"
HKR, Settings,SpeakerMode_On,,"M2"
HKR, Settings,SpeakerMode_Setup,,"M3"
HKR, Settings,SpeakerVolume_High,,"L3"
HKR, Settings,SpeakerVolume_Low,,"L0"
HKR, Settings,SpeakerVolume_Med,,"L2"
HKR, Settings,Terminator,,"<cr>"
HKR, Settings,Tone,,"T"

HKR, Responses,"0<cr><lf>",1,00,00,00,00,00,00,00,00,00,00 ; OK
HKR, Responses,"1<cr><lf>",1,02,00,00,00,00,00,00,00,00,00 ; CONNECT
HKR, Responses,"2<cr><lf>",1,08,00,00,00,00,00,00,00,00,00 ; RING
HKR, Responses,"3<cr><lf>",1,04,00,00,00,00,00,00,00,00,00 ; NO CARRIER
HKR, Responses,"4<cr><lf>",1,03,00,00,00,00,00,00,00,00,00 ; ERROR
HKR, Responses,"5<cr><lf>",1,02,00,00,00,00,00,00,00,00,00 ; CONNECT 1200
HKR, Responses,"6<cr><lf>",1,05,00,00,00,00,00,00,00,00,00 ; NO DIALTONE
HKR, Responses,"7<cr><lf>",1,06,00,00,00,00,00,00,00,00,00 ; BUSY
HKR, Responses,"8<cr><lf>",1,07,00,00,00,00,00,00,00,00,00 ; NO ANSWER

;HKR, Responses,"<cr>",1,01,00,00,00,00,00,00,00,00,00
;HKR, Responses,"<lf>",1,01,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR, Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00

HKR,Responses,"<cr><lf>CONNECT 1200/NONE<cr><lf>",1,2,0,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/MNP5<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 2400/NONE<cr><lf>",1,2,0,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/MNP<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 4800/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/V32/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/V34/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 7200/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/V32/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/V34/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 9600/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/V32/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/V34/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 12000/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V32/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V34/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 14400/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/V32/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/V34/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 16800/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/V32/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/V34/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 19200/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/V32/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/V34/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 21600/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/V32/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/V34/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 24000/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/V32/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/V34/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 26400/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/V32/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/V34/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 28800/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/V32/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/V34/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 31200/NONE<cr><lf>",1,2,0,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/V32/NONE<cr><lf>",1,2,0,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/V34/NONE<cr><lf>",1,2,0,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/LAPM<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/MNP<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V32/LAPM<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V32/MNP<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 33600/NONE<cr><lf>",1,2,0,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/V32/NONE<cr><lf>",1,2,0,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/V34/NONE<cr><lf>",1,2,0,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/LAPM<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/MNP<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V32/LAPM<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V32/MNP<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
