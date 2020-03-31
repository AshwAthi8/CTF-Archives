dem4,PCMCIA\AU-SYSTEM-POWERBIT_V.34_PCMCIA-CCC4

[Modem4]
DriverVer=06/01/1999,5.00.0000.0
include=MDMGL003.INF
AddReg=All,MfgAddReg,Modem4.AddReg,PCMCIA,MDMGL003.VERBOSE,MDMGL003.VERBOSE2,MDMGL003.VERBOSE3

[Modem4.AddReg]
HKR,,Properties,1,80,01,00,00,5a,00,00,00,ff,00,00,00,07,00,00,00,0f,00,00,00,ff,03,00,00,00,c2,01,00,80,70,00,00

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03

[MfgAddReg]
HKR,,InactivityScale,1,01,00,00,00
HKR,Init,     1,,"AT<cr>"
HKR,Init,     2,,"AT &F<cr>"
HKR,Init,     3,,"AT E0 V1 S95=47<cr>"
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
HKR,Settings,ErrorControl_On,,"\N3"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_Forced,,"\N2"
HKR,Settings,Compression_On,,"%%C3"
HKR,Settings,Compression_Off,,"%%C0"
HKR,Settings,Modulation_CCITT,,"B0"
HKR,Settings,Modulation_Bell,,"B1"
HKR,Settings,SpeedNegotiation_Off,,"N0"
HKR,Settings,SpeedNegotiation_On,,"N1"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,ErrorControl_Cellular,,"-K1)M1*H0"
HKR,Settings,ErrorControl_Cellular_Forced,,"-K0)M0"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"S30=<#>"
