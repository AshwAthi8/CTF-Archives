; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: SONY

[Version]
LayoutFile=Layout.inf
Signature="$WINDOWS NT$"
Class=Modem
Provider=%MSFT%
CLASSGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%SONY% = SONY,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[SONY.NTamd64]
%Modem2% = Modem2, SERENUM\TEX0007

[Modem2] ; SONY SMD560B/I 56000 External
AddReg = All, Modem2.AddReg,External

[Modem2.AddReg] ; SONY SMD560B/I 56000 External
HKR,, Properties, 1, 80,01,00,00, fe,00,00,00, ff,00,00,00, 00,00,00,00, 0f,00,00,00, 77,03,00,00, 00,c2,01,00, 00,fa,00,00

[External]
HKR,, DeviceType, 1, 01

[Strings]
MSFT = "Microsoft"
SONY = "SONY"
Modem2 = "SONY SMD560B_I 56000 External"

[All]
HKR,,ConfigDialog,,modemui.dll
HKR,,DevLoader,,*vcomm
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,InactivityScale,1,3c,00,00,00
HKR,,PortSubClass,1,02
HKR,,Reset,,"AT&F1<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,Hangup,1,,"ATH<cr>"
HKR,Init,1,,"AT<cr>"
HKR,Init,2,,"AT&F1E0Q0V1&C1&D2&S0S0=0<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,Compression_Off,,"&K0"
HKR,Settings,Compression_On,,"&K1"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,";"
HKR,Settings,ErrorControl_Forced,,"&M5"
HKR,Settings,ErrorControl_Off,,"&M0"
HKR,Settings,ErrorControl_On,,"&M4"
HKR,Settings,FlowControl_Hard,,"&H1&R2&I0"
HKR,Settings,FlowControl_Off,,"&H0&I0&R1"
HKR,Settings,FlowControl_Soft,,"&H2&I2&R1"
HKR,Settings,InactivityTimeout,,"S19=<#>"
HKR,Settings,Modulation_Bell,,"B1"
HKR,Settings,Modulation_CCITT,,"B0"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Pulse,,"P"
HKR,Settings,SpeakerMode_Dial,,"M1"
HKR,Settings,SpeakerMode_Off,,"M0"
HKR,Settings,SpeakerMode_On,,"M2"
HKR,Settings,SpeakerMode_Setup,,"M3"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,Tone,,"T"
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00 ; OK
HKR,Responses,"1<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00 ; RING
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00 ; NO CARRIER
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00 ; ERROR
HKR,Responses,"5<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00 ; NO DIALTONE
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00 ; BUSY
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00 ; NO ANSWER
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 61333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,95,EF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 61333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,95,EF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 61333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,95,EF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 61333/ARQ/x2/MNP<cr><lf",1,2,2,95,EF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 61333/ARQ/x2/LAPM<cr><lf>",1,2,2,95,EF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 61333/x2/NONE<cr><lf>",1,2,0,95,EF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 60000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,60,EA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 60000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,60,EA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 60000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,60,EA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 60000/ARQ/x2/MNP<cr><lf",1,2,2,60,EA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 60000/ARQ/x2/LAPM<cr><lf>",1,2,2,60,EA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 60000/x2/NONE<cr><lf>",1,2,0,60,EA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 58666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,2A,E5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 58666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,2A,E5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 58666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,2A,E5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 58666/ARQ/x2/MNP<cr><lf",1,2,2,2A,E5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 58666/ARQ/x2/LAPM<cr><lf>",1,2,2,2A,E5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 58666/x2/NONE<cr><lf>",1,2,0,2A,E5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,F5,DF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,F5,DF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,F5,DF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP<cr><lf",1,2,2,F5,DF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM<cr><lf>",1,2,2,F5,DF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/x2/NONE<cr><lf>",1,2,0,F5,DF,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP<cr><lf",1,2,2,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM<cr><lf>",1,2,2,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/x2/NONE<cr><lf>",1,2,0,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,8A,D5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,8A,D5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,8A,D5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP<cr><lf",1,2,2,8A,D5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM<cr><lf>",1,2,2,8A,D5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 54666/x2/NONE<cr><lf>",1,2,0,8A,D5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,55,D0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,55,D0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,55,D0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP<cr><lf",1,2,2,55,D0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM<cr><lf>",1,2,2,55,D0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 53333/x2/NONE<cr><lf>",1,2,0,55,D0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,20,CB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,20,CB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,20,CB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP<cr><lf",1,2,2,20,CB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM<cr><lf>",1,2,2,20,CB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 52000/x2/NONE<cr><lf>",1,2,0,20,CB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,EA,C5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,EA,C5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,EA,C5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP<cr><lf",1,2,2,EA,C5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM<cr><lf>",1,2,2,EA,C5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 50666/x2/NONE<cr><lf>",1,2,0,EA,C5,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,B5,C0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,B5,C0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,B5,C0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP<cr><lf",1,2,2,B5,C0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM<cr><lf>",1,2,2,B5,C0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 49333/x2/NONE<cr><lf>",1,2,0,B5,C0,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP<cr><lf",1,2,2,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM<cr><lf>",1,2,2,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000/x2/NONE<cr><lf>",1,2,0,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,4A,B6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,4A,B6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,4A,B6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP<cr><lf",1,2,2,4A,B6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM<cr><lf>",1,2,2,4A,B6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 46666/x2/NONE<cr><lf>",1,2,0,4A,B6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,15,B1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,15,B1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,15,B1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP<cr><lf",1,2,2,15,B1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM<cr><lf>",1,2,2,15,B1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 45333/x2/NONE<cr><lf>",1,2,0,15,B1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,E0,AB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,E0,AB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,E0,AB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP<cr><lf",1,2,2,E0,AB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM<cr><lf>",1,2,2,E0,AB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 44000/x2/NONE<cr><lf>",1,2,0,E0,AB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,AA,A6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,AA,A6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,AA,A6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP<cr><lf",1,2,2,AA,A6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM<cr><lf>",1,2,2,AA,A6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 42666/x2/NONE<cr><lf>",1,2,0,AA,A6,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,75,A1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,75,A1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,75,A1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP<cr><lf",1,2,2,75,A1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM<cr><lf>",1,2,2,75,A1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 41333/x2/NONE<cr><lf>",1,2,0,75,A1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 40000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,40,9C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 40000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,40,9C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 40000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,40,9C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 40000/ARQ/x2/MNP<cr><lf",1,2,2,40,9C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 40000/ARQ/x2/LAPM<cr><lf>",1,2,2,40,9C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 40000/x2/NONE<cr><lf>",1,2,0,40,9C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,D5,91,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,D5,91,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,D5,91,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP<cr><lf",1,2,2,D5,91,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM<cr><lf>",1,2,2,D5,91,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 37333/x2/NONE<cr><lf>",1,2,0,D5,91,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/x2/MNP<cr><lf",1,2,2,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/x2/LAPM<cr><lf>",1,2,2,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP<cr><lf",1,2,2,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/x2/NONE<cr><lf>",1,2,0,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33600/V34/NONE<cr><lf>",1,2,0,40,83,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,35,82,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,35,82,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,35,82,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/MNP<cr><lf",1,2,2,35,82,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33333/ARQ/x2/LAPM<cr><lf>",1,2,2,35,82,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 33333/x2/NONE<cr><lf>",1,2,0,35,82,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,00,7D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,00,7D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,00,7D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/MNP<cr><lf",1,2,2,00,7D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 32000/ARQ/x2/LAPM<cr><lf>",1,2,2,00,7D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 32000/x2/NONE<cr><lf>",1,2,0,00,7D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/x2/MNP<cr><lf",1,2,2,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/x2/LAPM<cr><lf>",1,2,2,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP<cr><lf",1,2,2,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/x2/NONE<cr><lf>",1,2,0,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 31200/V34/NONE<cr><lf>",1,2,0,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/x2/MNP<cr><lf",1,2,2,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/x2/LAPM<cr><lf>",1,2,2,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP<cr><lf",1,2,2,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM<cr><lf>",1,2,2,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP<cr><lf",1,2,2,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM<cr><lf>",1,2,2,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/x2/NONE<cr><lf>",1,2,0,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/VFC/NONE<cr><lf>",1,2,0,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800/V34/NONE<cr><lf>",1,2,0,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP<cr><lf",1,2,2,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM<cr><lf>",1,2,2,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP<cr><lf",1,2,2,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM<cr><lf>",1,2,2,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/VFC/NONE<cr><lf>",1,2,0,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400/V34/NONE<cr><lf>",1,2,0,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP<cr><lf",1,2,2,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM<cr><lf>",1,2,2,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP<cr><lf",1,2,2,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/VFC/NONE<cr><lf>",1,2,0,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 24000/V34/NONE<cr><lf>",1,2,0,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP<cr><lf",1,2,2,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM<cr><lf>",1,2,2,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP<cr><lf",1,2,2,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM<cr><lf>",1,2,2,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP<cr><lf",1,2,2,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM<cr><lf>",1,2,2,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/VFC/NONE<cr><lf>",1,2,0,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/V34/NONE<cr><lf>",1,2,0,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600/V32/NONE<cr><lf>",1,2,0,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP<cr><lf",1,2,2,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM<cr><lf>",1,2,2,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP<cr><lf",1,2,2,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM<cr><lf>",1,2,2,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP<cr><lf",1,2,2,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM<cr><lf>",1,2,2,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/VFC/NONE<cr><lf>",1,2,0,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/V34/NONE<cr><lf>",1,2,0,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/V32/NONE<cr><lf>",1,2,0,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP<cr><lf",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM<cr><lf>",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP<cr><lf",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM<cr><lf>",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP<cr><lf",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/MNP<cr><lf",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/LAPM<cr><lf>",1,2,2,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/VFC/NONE<cr><lf>",1,2,0,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/V34/NONE<cr><lf>",1,2,0,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/V32/NONE<cr><lf>",1,2,0,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/HST/NONE<cr><lf>",1,2,0,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP<cr><lf",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM<cr><lf>",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP<cr><lf",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM<cr><lf>",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP<cr><lf",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM<cr><lf>",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/MNP<cr><lf",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/LAPM<cr><lf>",1,2,2,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/VFC/NONE<cr><lf>",1,2,0,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/V34/NONE<cr><lf>",1,2,0,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/V32/NONE<cr><lf>",1,2,0,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/HST/NONE<cr><lf>",1,2,0,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP<cr><lf",1,2,2,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM<cr><lf>",1,2,2,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP<cr><lf",1,2,2,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM<cr><lf>",1,2,2,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/MNP<cr><lf",1,2,2,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/LAPM<cr><lf>",1,2,2,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/V34/NONE<cr><lf>",1,2,0,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/V32/NONE<cr><lf>",1,2,0,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/HST/NONE<cr><lf>",1,2,0,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP<cr><lf",1,2,2,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM<cr><lf>",1,2,2,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP<cr><lf",1,2,2,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM<cr><lf>",1,2,2,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/MNP<cr><lf",1,2,2,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/LAPM<cr><lf>",1,2,2,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/V34/NONE<cr><lf>",1,2,0,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/V32/NONE<cr><lf>",1,2,0,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200/HST/NONE<cr><lf>",1,2,0,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP<cr><lf",1,2,2,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP<cr><lf",1,2,2,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/MNP<cr><lf",1,2,2,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/LAPM<cr><lf>",1,2,2,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/V34/NONE<cr><lf>",1,2,0,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/V32/NONE<cr><lf>",1,2,0,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/HST/NONE<cr><lf>",1,2,0,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP<cr><lf",1,2,2,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM<cr><lf>",1,2,2,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/V34/NONE<cr><lf>",1,2,0,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/NONE<cr><lf>",1,2,0,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/MNP5<cr><lf>",1,2,3,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/MNP5<cr><lf>",1,2,3,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/NONE<cr><lf>",1,2,0,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,2,0,00,00,00,00,00,00,00,00

HKR,Responses,"<cr><lf>CONNECT 1200/ARQ<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V32/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V34/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V32/MNP<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 2400/ARQ<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V32/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V32/MNP<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 4800/ARQ<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 7200/ARQ<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 9600/ARQ<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 12000/ARQ<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V32/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V34/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/VFC/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 14400/ARQ<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 16800/ARQ<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 19200/ARQ<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 21600/ARQ<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 24000/ARQ<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 26400/ARQ<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0

HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0

