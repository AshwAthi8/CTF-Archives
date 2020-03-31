; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved. \\MS-IRL\\
; Manufacturer:   US Robotics (France)

[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*	

[Manufacturer]
%Mfg% = Models,NTamd64

[Models.NTamd64]
%Modem6%=Modem5,PCMCIA\USRobotics-336_DAtA_Fax_Modem-4CAA 

[Modem5]   
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf
AddReg=All,MfgAddReg,Modem5.AddReg,PCMCIA,MDMGL010.V34LONG,MDMGL010.NUMERICS,MDMGL010.V34SHORT,MDMGL010.ALL,MDMGL010.V90SHORT,MDMGL010.V90LONG 

[Modem5.AddReg] 
HKR,,Properties,1,80,01,00,00,FF,00,00,00,FF,00,00,00,07,00,00,00,0F,00,00,00,FF,07,00,00,00,C2,01,00,40,83,00,00
HKR,,InactivityScale,1,0a,00,00,00
HKR,Init,1,,"AT &F<cr>"
HKR,Init,2,,"AT E0 %%E1 &D2 V1 &C1 S0=0 W2 S95=47<cr>"
HKR,Init,3,,"AT<cr>"
HKR,Settings,Modulation_CCITT_V23,,"+MS=3"
HKR,Settings,DialSuffix,,""
HKR,Settings,ErrorControl_On,,"&Q5"
HKR,Settings,ErrorControl_Off,,"&Q6"
HKR,Settings,ErrorControl_Forced,,"\N4"
HKR,Settings,Compression_On,,"%%C3"

[Strings]
MSFT="Microsoft"
Mfg = "U.S. Robotics Corporation"
Modem6="Worldport PCMCIA V.34+ CE"

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"

[EXTERNAL]
HKR,,DeviceType,1,01

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03

[MfgAddReg]
HKR,,InactivityScale,1,01,00,00,00
HKR,Init,     1,,"ATE0Q0V1S0=0<cr>"
HKR,Init,     2,,"AT &F <cr>"
HKR,Init,     3,,"AT E0 V1 <cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,   1,,"ATH<cr>"
HKR,Answer,   1,,"ATA<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,";"
HKR,Settings,SpeakerVolume_Low,,"L0"
HKR,Settings,SpeakerVolume_Med,,"L2"
HKR,Settings,SpeakerVolume_High,,"L3"
HKR,Settings,SpeakerMode_Off,,"M0"
HKR,Settings,SpeakerMode_Dial,,"M1"
HKR,Settings,SpeakerMode_On,,"M2"
HKR,Settings,SpeakerMode_Setup,,"M3"
HKR,Settings,FlowControl_Off,,"&K0"
HKR,Settings,FlowControl_Hard,,"&K3"
HKR,Settings,FlowControl_Soft,,"&K4"
HKR,Settings,ErrorControl_On,,"S48=7"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_Forced,,"\N4"
HKR,Settings,Compression_On,,"%%C1S46=138"
HKR,Settings,Compression_Off,,"%%C0"
HKR,Settings,Modulation_CCITT,,"B0"
HKR,Settings,Modulation_Bell,,"B1"
HKR,Settings,Modulation_CCITT_V23,,"S34=8"
HKR,Settings,ErrorControl_Cellular,,"-K1)M1"
HKR,Settings,ErrorControl_Cellular_Forced,,"-K1)M1"
HKR,Settings,SpeedNegotiation_Off,,"N0"
HKR,Settings,SpeedNegotiation_On,,"N1"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"S30=<#>"
