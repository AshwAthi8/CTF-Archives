; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer:   Compaq
[Version]
Signature="$WINDOWS NT$"
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Class=Modem
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Compaq% = Compaq,NTamd64
%IBM% = IBM,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[Compaq.NTamd64]
%Spq288% = Spq288, PCMCIA\COMPAQ-SPEEDPAQ_288_TELEPHONY_MODEM-4A74
%Spq288g% = Spq288g, PCMCIA\COMPAQ-GLOBAL_28.8_TELEPHONY_MODEM-35E6

[IBM.NTamd64]
%IBM1% = IBM1, PCMCIA\IBM-56K_PC_Card_Modem-992E

[IBM1]
include=mdmgl004.inf
AddReg=All, MfgCompaq, IBM.Voice, IBM.Resp, IBM1.AddReg, PCMCIA, MDMGL004.ExtraCID
DriverVer=03/09/2000

[Spq288]
include=MDMGL003.INF
AddReg=All, MfgCompaq, PCMCIA, VerboseResultCodes, CELLULAR, Spq288.AddReg, MDMGL003.VERBOSE4
DriverVer=03/09/2000

[Spq288g]
include=MDMGL003.INF
AddReg=All, MfgCompaq, PCMCIA, VerboseResultCodes, CELLULAR_Global, Spq288g.AddReg, MDMGL003.VERBOSE4
DriverVer=03/09/2000

[IBM1.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, 77,03,00,00, 00,C2,01,00, 00,E1,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00, 00,00,0A,00, 0A,00,08,00, 00,11,13,00, 00,00
HKR, Init, 2,, "AT&FE0V1&A3&B1&D2&S0&C1S0=0<cr>"
HKR, Settings, DialSuffix,, ""
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
HKR, Settings, Modulation_Bell,, "B1S27=36S32=28"
HKR, Settings, InactivityTimeout,, "S19=<#>"

[Spq288.AddReg]
HKR,  Init, 1,, "AT &F<cr>"
HKR,  Init, 2,, "AT &F E0 V1 W1 X4 S95=47 &C1 &D2<cr>"
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, 5A,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 80,70,00,00
HKR, Settings, Compression_On,, "%%C1 S101=35"
HKR, Settings, Compression_Off,, "%%C0 S101=0"

[Spq288g.AddReg]
HKR,  Init, 1,, "AT &F<cr>"
HKR,  Init, 2,, "AT &F E0 V1 W1 X4 S95=47 &C1 &D2<cr>"
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, 5A,00,00,00, 07,00,00,00, 0F,00,00,00, FF,03,00,00, 00,C2,01,00, 80,70,00,00
HKR, Settings, Compression_On,, "%%C1 S101=35"
HKR, Settings, Compression_Off,, "%%C0 S101=0"

[Strings]
MSFT="Microsoft"
Compaq="Compaq"
Spq288="Compaq SpeedPaq 288 Telephony Modem (PCMCIA)"
Spq288g="Compaq Global 28.8 Telephony Modem (PCMCIA)"

IBM = "IBM Corporation"
IBM1="IBM 56K PC Card Modem"   ; //WHQL

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"

[MfgCompaq]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 1,, "AT<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ<cr>"
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
HKR, Settings, FlowControl_Hard,, "\Q3"
HKR, Settings, FlowControl_Soft,, "\Q1"
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
HKR, Settings, InactivityTimeout,, "S30=<#>"

[IBM.Resp]
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00 ; OK
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00 ; RING
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00 ; NO CARRIER
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00 ; ERROR
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00 ; NO DIALTONE
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00 ; BUSY
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00 ; NO ANSWER
HKR,Responses,"<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP<cr><lf>",1,2,2,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM<cr><lf>",1,2,2,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/x2/NONE<cr><lf>",1,2,0,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/x2/NONE<cr><lf>",1,2,0,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP<cr><lf>",1,2,2,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM<cr><lf>",1,2,2,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/x2/NONE<cr><lf>",1,2,0,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP<cr><lf>",1,2,2,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM<cr><lf>",1,2,2,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/x2/NONE<cr><lf>",1,2,0,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP<cr><lf>",1,2,2,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM<cr><lf>",1,2,2,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/x2/NONE<cr><lf>",1,2,0,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP<cr><lf>",1,2,2,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM<cr><lf>",1,2,2,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/x2/NONE<cr><lf>",1,2,0,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP<cr><lf>",1,2,2,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM<cr><lf>",1,2,2,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/x2/NONE<cr><lf>",1,2,0,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP<cr><lf>",1,2,2,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM<cr><lf>",1,2,2,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/x2/NONE<cr><lf>",1,2,0,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP<cr><lf>",1,2,2,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM<cr><lf>",1,2,2,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/x2/NONE<cr><lf>",1,2,0,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP<cr><lf>",1,2,2,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM<cr><lf>",1,2,2,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/x2/NONE<cr><lf>",1,2,0,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP<cr><lf>",1,2,2,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM<cr><lf>",1,2,2,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/x2/NONE<cr><lf>",1,2,0,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP<cr><lf>",1,2,2,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM<cr><lf>",1,2,2,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/x2/NONE<cr><lf>",1,2,0,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP<cr><lf>",1,2,2,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM<cr><lf>",1,2,2,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/x2/NONE<cr><lf>",1,2,0,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP<cr><lf>",1,2,2,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM<cr><lf>",1,2,2,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/x2/NONE<cr><lf>",1,2,0,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/V34/NONE<cr><lf>",1,2,0,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/MNP<cr><lf>",1,2,2,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/LAPM<cr><lf>",1,2,2,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33333/x2/NONE<cr><lf>",1,2,0,35,82,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/MNP/V42BIS<cr><lf>",1,2,3,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/MNP<cr><lf>",1,2,2,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/LAPM<cr><lf>",1,2,2,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 32000/x2/NONE<cr><lf>",1,2,0,00,7D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/V34/NONE<cr><lf>",1,2,0,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/VFC/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/V34/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/VFC/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/V34/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/VFC/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/V34/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/VFC/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/V34/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/VFC/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/V34/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/VFC/N0NE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/V34/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/VFC/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/V34/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/V32/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/ETC/V32/MNP/V42BIS<cr><lf>",1,2,B,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/ETC/V32/MNP/MNP5<cr><lf>",1,2,B,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/ETC/V32/LAPM/V42BIS<cr><lf>",1,2,B,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/ETC/V32/LAPM/MNP5<cr><lf>",1,2,B,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/ETC/V32/MNP<cr><lf>",1,2,A,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/ETC/V32/LAPM<cr><lf>",1,2,A,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V34/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V32/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/ETC/V32/MNP/V42BIS<cr><lf>",1,2,B,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/ETC/V32/MNP/MNP5<cr><lf>",1,2,B,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/ETC/V32/LAPM/V42BIS<cr><lf>",1,2,B,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/ETC/V32/LAPM/MNP5<cr><lf>",1,2,B,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/ETC/V32/MNP<cr><lf>",1,2,A,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/ETC/V32/LAPM<cr><lf>",1,2,A,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/V34/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/V32/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/ETC/V32/MNP/V42BIS<cr><lf>",1,2,B,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/ETC/V32/MNP/MNP5<cr><lf>",1,2,B,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/ETC/V32/LAPM/V42BIS<cr><lf>",1,2,B,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/ETC/V32/LAPM/MNP5<cr><lf>",1,2,B,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/ETC/V32/MNP<cr><lf>",1,2,A,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/ETC/V32/LAPM<cr><lf>",1,2,A,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/V34/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/V32/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/ETC/V32/MNP/V42BIS<cr><lf>",1,2,B,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/ETC/V32/MNP/MNP5<cr><lf>",1,2,B,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/ETC/V32/LAPM/V42BIS<cr><lf>",1,2,B,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/ETC/V32/LAPM/MNP5<cr><lf>",1,2,B,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/ETC/V32/MNP<cr><lf>",1,2,A,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/ETC/V32/LAPM<cr><lf>",1,2,A,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/V34/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/V32/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/ETC/V32/MNP/V42BIS<cr><lf>",1,2,B,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/ETC/V32/MNP/MNP5<cr><lf>",1,2,B,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/ETC/V32/LAPM/V42BIS<cr><lf>",1,2,B,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/ETC/V32/LAPM/MNP5<cr><lf>",1,2,B,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/ETC/V32/MNP<cr><lf>",1,2,A,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/ETC/V32/LAPM<cr><lf>",1,2,A,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/V34/NONE<cr><lf>",1,2,0,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/MNP/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/NONE<cr><lf>",1,2,0,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/MNP5<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/MNP5<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/NONE<cr><lf>",1,2,0,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,2,0,00,00,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 62666<cr><lf>",1,2,0,CA,F4,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 64000<cr><lf>",1,2,0,00,FA,00,00,00,00,00,00

[PCMCIA]
HKR,, PortDriver,, Serial.vxd
HKR,, Contention,, *vcd
HKR,, DeviceType, 1, 03

[VerboseResultCodes]
HKR, Responses, "RINGING", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300 V42bis", 1, 02, 03, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600 V42bis", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200 V42bis", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75 V42bis", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX V42bis", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200 V42bis", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX V42bis", 1, 02, 03, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 V42bis", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 V42bis", 1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 V42bis", 1, 02, 03, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 V42bis", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 V42bis", 1, 02, 03, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 V42bis", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 V42bis", 1, 02, 03, a0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 V42bis", 1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600 V42bis", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000 V42bis", 1, 02, 03, c0,5d,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400 V42bis", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800 V42bis", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400 V42bis", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600 V42bis", 1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200 V42bis", 1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200 V42bis", 1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 230400", 1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/ARQ", 1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/REL", 1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/MNP", 1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/LAP-M", 1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/V42BIS", 1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400 V42bis", 1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/V42b", 1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "COMPRESSION: MNP5", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: ADC", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: X.25/LAPB", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: X.25/LAPB/HDX", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: X.25/LAPB/AFT", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-CELLULAR", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP2", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP3", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP4", 1, 01, 02, 00,00,00,00, 00,00,00,00

[CELLULAR]
HKR, Settings, ErrorControl_Cellular,, "\N3 $M1 -K2 )M1"  ;Motorola default
HKR, Settings, ErrorControl_Cellular_Forced,, "\N4 $M1 W1"

[CELLULAR_Global] ;Does not support cellular phones, but supports the protocols
HKR, Settings, ErrorControl_Cellular,, "\N3 -K2 )M1"
HKR, Settings, ErrorControl_Cellular_Forced,, "\N4 W1"

[IBM.Voice]
HKR,,Enumerator,,serwave.vxd
HKR,, VoiceProfile,    1,21,10,08,02
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR, WaveDriver,  BaudRate ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID ,1, 04, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR, WaveDriver , WaveDevices,  1, 01, 00		;no handset
HKR, EnableCallerID, 1,, "at#cid=1<cr>"
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
HKR, LineSetPlayFormat,       2,, "at#vsr=8000<cr>"
HKR, LineSetPlayFormat,       3,, "at#vbs=4<cr>"
HKR, LineSetRecordFormat,     1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,     2,, "at#vsr=8000<cr>"
HKR, LineSetRecordFormat,     3,, "at#vbs=4<cr>"

HKR, VoiceToDataAnswer,         1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,         2,, "ata<cr>"
HKR, VoiceAnswer,               1,, "at#cls=8<cr>"
HKR, VoiceAnswer,               2,, "at#vls=0<cr>"
HKR, VoiceAnswer,               3,, "atx3<cr>"
HKR, VoiceAnswer,               4,, "ats30=60<cr>"
HKR, VoiceAnswer,               5,, "ata<cr>"
HKR, VoiceDialNumberSetup,               1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,               2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,               3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,               4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,               5,, "ats30=60<cr>"
HKR, GenerateDigit,               1,, "at#vts=<Digit><cr>"
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


