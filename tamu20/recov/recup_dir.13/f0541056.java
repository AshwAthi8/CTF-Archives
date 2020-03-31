="Ericsson DC23 PCMCIA Digital Cellular"
Modem3="Ericsson DC12 PCMCIA Digital Cellular"

[Ericsson.NTamd64]
%Modem1%=Modem1,PCMCIA\MODEM-CARD_DNT_3012-2A6A              
%Modem2%=Modem2,PCMCIA\ERICSSON-MODEM__DC23-24F7
%Modem3%=Modem3,PCMCIA\ERICSSON-MODEM__TYPE_4040010-34A5

[Modem1]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,MfgAddReg1,PCMCIA,Numerics,GSM,GSMAnalog

[Modem2]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,MfgAddreg2,PCMCIA,Numerics,GSM

[Modem3]
DriverVer=06/01/1999,5.00.0000.0
Addreg=All,MfgAddreg3,PCMCIA,Numerics,GSM

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,Init,1,,"AT<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Answer, 1,,"ATA<cr>"
HKR,Hangup, 1,,"ATH<cr>"

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03

[MfgAddReg1]
HKR,,Properties,1,00,00,00,00,B4,00,00,00,00,00,00,00,00,00,00,00,0F,00,00,00,39,02,00,00,00,C2,01,00,80,70,00,00
HKR,,PowerDelay,0x10001,2000
HKR,,ConfigDelay,0x10001,2000
HKR,Init,2,,"AT &F E0 V1 S0=0 &C1 &D2 \V1<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,Compression_Off,,"%%C0"
HKR,Settings,Compression_On,,"%%C1"
HKR,Settings,Blind_Off,,"X2"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_On,,""
HKR,Settings,ErrorControl_Cellular,,"\N6"
HKR,Settings,ErrorControl_Cellular_Forced,,"\N6"
HKR,Settings,FlowControl_Hard,,"\Q3"
HKR,Settings,FlowControl_Off,,"\Q0"
HKR,Settings,FlowControl_Soft,,"\Q1"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"DT"
HKR,Settings,DialSuffix,,""
HKR,Settings,SpeakerVolume_Low,,"L0"
HKR,Settings,SpeakerVolume_Med,,"L2"
HKR,Settings,SpeakerVolume_High,,"L3"
HKR,Settings,SpeakerMode_Off,,"M0"
HKR,Settings,SpeakerMode_Dial,,"M1"
HKR,Settings,SpeakerMode_On,,"M2"
HKR,Settings,SpeakerMode_Setup,,"M3"
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>FAX<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DATA<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAYED<cr><lf>",1,1D,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAYED NUMBER<cr><lf>",1,1D,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BLACKLISTED<cr><lf>",1,1B,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BLACKLISTED NUMBER<cr><lf>",1,1B,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+FCERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 300<cr><lf>",1,02,00,2C,01,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 600<cr><lf>",1,02,00,58,02,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800<cr><lf>",1,02,00,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 38400<cr><lf>",1,02,00,00,96,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57600<cr><lf>",1,02,00,00,E1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 115200<cr><lf>",1,02,00,00,C2,01,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400<cr><lf>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800<cr><lf>",1,02,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600<cr><lf>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 12000<cr><lf>",1,02,00,e0,2e,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400<cr><lf>",1,02,00,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800<cr><lf>",1,02,00,a0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200<cr><lf>",1,02,00,00,4b,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 12000/REL<cr><lf>",1,02,02,e0,2e,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/REL<cr><lf>",1,02,02,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800/REL<cr><lf>",1,02,02,a0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/REL<cr><lf>",1,02,02,00,4b,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/REL<cr><lf>",1,02,02,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/REL<cr><lf>",1,02,02,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/REL<cr><lf>",1,02,02,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/RLP<cr><lf>",1,02,0A,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/RLP<cr><lf>",1,02,0A,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/RLP<cr><lf>",1,02,0A,80,25,00,00,00,00,00,00

[MfgAddReg2]
HKR,,Properties,1,00,00,00,00,FF,00,00,00,FF,00,00,00,00,00,00,00,00,00,00,00,37,00,00,00,00,C2,01,00,80,25,00,00
HKR,,DCB,1,1C,00,00,00,00,C2,01,00,15,20,00,00,00,00,0a,00,0a,00,08,00,00,11,13,00,00,00
HKR,,InactivityScale,1,0A,00,00,00
HKR,Init,2,,"AT &F<cr>"
HKR,Init,3,,"AT &D2&C1<cr>"
HKR,Init,4,,"AT E0<cr>"
HKR,Init,5,,"AT V1 S7=50 S0=0<cr>"
HKR,Init,6,,"AT +ER=3 +DR=3 <cr>"
HKR,Init,7,,"AT +MR=3 <cr>"
HKR,Init,8,,"AT +CBST=7,0,0<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,Blind_Off,,"X=4"
HKR,Settings,Blind_On,,"X=2"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,Compression_Off,,"+DS=0,,,;"
HKR,Settings,Compression_On,,"+DS=3,0,,;"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,";"
HKR,Settings,ErrorControl_Forced,,"+ES=3,2,4;"
HKR,Settings,ErrorControl_Off,,   "+ES=1,0,1;"
HKR,Settings,ErrorControl_On,,    "+ES=3,0,2;"
HKR,Settings,FlowControl_Hard,,"+IFC=2,2;"
HKR,Settings,FlowControl_Off,, "+IFC=0,0;"
HKR,Settings,FlowControl_Soft,,"+IFC=1,1;"
HKR,Settings,InactivityTimeout,,"*IACT=<#>,<#>,0;"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Pulse,,"P"
HKR,Settings,SpeakerMode_Off,,"M0"
HKR,Settings,SpeakerMode_Dial,,"M1"
HKR,Settings,SpeakerMode_On,,"M2"
HKR,Settings,SpeakerMode_Setup,,"M3"
HKR,Settings,SpeakerVolume_High,,"L=3"
HKR,Settings,SpeakerVolume_Low,,"L=0"
HKR,Settings,SpeakerVolume_Med,,"L=1"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,Tone,,"T"
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>OK<cr><lf>"         ,1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>"       ,1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>" ,1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>"      ,1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>"       ,1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>"  ,1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>FAX<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DATA<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAYED<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAYED NUMBER<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BLACKLISTED<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BLACKLISTED NUMBER<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+FCERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+ER: NONE<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+ER: LAPM<cr><lf>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+ER: ALT<cr><lf>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+DR: NONE<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+DR: V42B<cr><lf>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+DR: V42B RD<cr><lf>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+DR: V42B TD<cr><lf>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+DR: MNP5<cr><lf>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+ILRR: 300<cr><lf>",1,01,00,00,00,00,00,2C,01,00,00
HKR,Responses,"<cr><lf>+ILRR: 1200<cr><lf>",1,01,00,00,00,00,00,B0,04,00,00
HKR,Responses,"<cr><lf>+ILRR: 2400<cr><lf>",1,01,00,00,00,00,00,60,09,00,00
HKR,Responses,"<cr><lf>+ILRR: 4800<cr><lf>",1,01,00,00,00,00,00,C0,12,00,00
HKR,Responses,"<cr><lf>+ILRR: 9600<cr><lf>",1,01,00,00,00,00,00,80,25,00,00
HKR,Responses,"<cr><lf>+ILRR: 19200<cr><lf>",1,01,00,00,00,00,00,00,4B,00,00
HKR,Responses,"<cr><lf>+ILRR: 38400<cr><lf>",1,01,00,00,00,00,00,00,96,00,00
HKR,Responses,"<cr><lf>+ILRR: 57600<cr><lf>",1,01,00,00,00,00,00,00,E1,00,00
HKR,Responses,"<cr><lf>+ILRR: 115200<cr><lf>",1,01,00,00,00,00,00,00,C2,01,00
HKR,Responses,"<cr><lf>+MCR: V32<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V22B<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V22<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V21<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V32T<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V32B<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: B212<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V23C<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: V23S<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MCR: VB103<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 300<cr><lf>",1,01,00,2c,01,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 1200<cr><lf>",1,01,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 2400<cr><lf>",1,01,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 4800<cr><lf>",1,01,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 7200<cr><lf>",1,01,00,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 9600<cr><lf>",1,01,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 12000<cr><lf>",1,01,00,E0,2E,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 14400<cr><lf>",1,01,00,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 16800<cr><lf>",1,01,00,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 19200<cr><lf>",1,01,00,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 21600<cr><lf>",1,01,00,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 24000<cr><lf>",1,01,00,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 26400<cr><lf>",1,01,00,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 28800<cr><lf>",1,01,00,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 31200<cr><lf>",1,01,00,E0,79,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+MRR: 33600<cr><lf>",1,01,00,40,83,00,00,00,00,00,00

[MfgAddReg3]
HKR,,Properties,1,00,00,00,00,FF,00,00,00,5A,00,00,00,00,00,00,00,00,00,00,00,37,00,00,00,00,4B,00,00,80,25,00,00
HKR,,InactivityScale,1,3C,00,00,00
HKR,Init,2,,"AT &F E0 V1 X3 S0=0 &C1 &D2 \V1<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,Compression_Off,,"%%C0"
HKR,Settings,Compression_On,,"%%C1"
HKR,Settings,ErrorControl_Forced,,"\N2"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_On,,"\N3"
HKR,Settings,FlowControl_Hard,,"\Q3"
HKR,Settings,FlowControl_Off,,"\Q0"
HKR,Settings,FlowControl_Soft,,"\Q1"
HKR,Settings,InactivityTimeout,,"\T<#>"
HKR,Settings,Tone,,"T"
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
HKR,Responses,"<cr><lf>CONNECT 2400<cr><lf>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800<cr><lf>",1,02,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600<cr><lf>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400/REL<cr><lf>",1,02,02,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/REL<cr><lf>",1,02,02,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/REL<cr><lf>",1,02,02,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>" ,1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>FAX<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DATA<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAYED<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAYED NUMBER<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BLACKLISTED<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BLACKLISTED NUMBER<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>+FCERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00

[Numerics]
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00 
HKR,Responses,"1<cr>",1,02,00,00,00,00,00,00,00,00,00 
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00 
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00 
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"5<cr>",1,02,00,b0,04,00,00,00,00,00,00
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00

[GSM]
HKR,Protocol\GSM\V110_9DOT6K,1,,"AT+CBST=71,,1<cr>"
HKR,Protocol\GSM\ANALOG_RLP,1,,"AT+CBST=7,,1<cr>"
HKR,Protocol\GSM\ANALOG_NRLP,1,,"AT+CBST=7,,0<cr>"

[GSMAnalog]
HKR,Protocol\ISDN\ANALOG_V34,1,, "AT<cr>"
