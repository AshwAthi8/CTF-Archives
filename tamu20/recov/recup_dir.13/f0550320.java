lltron,NTamd64

[PNB.NTamd64]
%PNB2%=Modem2,PCMCIA\P.N.B-288_DATA_FAX_MODEM-88E9

[Compaq.NTamd64]
%Compaq2% = Modem2,PCMCIA\COMPAQ_COMPUTER-COMPAQ_288_DATA_FAX_MODEM__SERIES_571-C6AC

[MagicRAM.NTamd64]
%MagicRAM2% = Modem2,PCMCIA\MAGIC_RAM-288_DATA_FAX_MODEM-E4D1

[Newlink.NTamd64]
%Newlink2% = Modem2,PCMCIA\NEWLINK-288_DATA_FAX_MODEM-E494

[Alltron.NTamd64]
%Alltron2% = Modem2,PCMCIA\ALLTRON-288_DATA_FAX_MODEM-37A4

[Modem2]  
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf	
AddReg=All,MfgAddReg,Modem2.AddReg,PCMCIA,MDMGL010.V34LONG,MDMGL010.NUMERICS,MDMGL010.V34SHORT,MDMGL010.ALL,MDMGL010.V90SHORT,MDMGL010.V90LONG 

[Modem2.AddReg] 
HKR,,Properties,1,c0,01,00,00,ff,00,00,00,ff,00,00,00,07,00,00,00,0f,00,00,00,ff,03,00,00,00,c2,01,00,80,70,00,00

[Strings]
MSFT="Microsoft"

PNBMR="P.N.B"
PNB2="P.N.B PCMCIA Rio V.34"

CompaqMR="Compaq"
Compaq2="Compaq 288 Data+Fax Modem Series 571"

MagicRAMMR="Magic RAM"
MagicRAM2="Magic RAM 288 International Data Fax Modem"

NewlinkMR="Newlink"
Newlink2="Newlink TOP 34"

AlltronMR="Alltron"
Alltron2="Alltron AL-SW28800 Modem"

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,Init,1,,"AT<cr>"

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03

[MfgAddReg]
HKR,,InactivityScale,1,0a,00,00,00
HKR,Init,2,,"AT &F<cr>"
HKR,Init,3,,"AT E0<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,1,,"ATH<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,Prefix,,"AT"
HKR, Settings, DialSuffix,, ""
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"D"
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
HKR,Settings,ErrorControl_On,,"&Q5"
HKR,Settings,ErrorControl_Off,,"&Q6"
HKR,Settings,ErrorControl_Forced,,"\N4"
HKR,Settings,ErrorControl_Cellular,,"-K1)M1"
HKR,Settings,ErrorControl_Cellular_Forced,,"-K1)M1"
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
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"S30=<#>"

