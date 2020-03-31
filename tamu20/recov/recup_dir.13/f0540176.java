include=mdmgl010.inf
AddReg=All,MfgAddReg,Responses1,Modem4.AddReg,PCMCIA,MDMGL010.ALL

[Modem4.AddReg]
HKR,,Properties,1,00,00,00,00,ff,00,00,00,ff,00,00,00,07,00,00,00,0f,00,00,00,ff,03,00,00,00,c2,01,00,80,70,00,00
HKR,Responses,"16<cr>",1,02,00,00,4b,00,00,00,00,00,00
HKR,Responses,"63<cr>",1,02,00,20,67,00,00,00,00,00,00
HKR,Responses,"64<cr>",1,02,00,80,70,00,00,00,00,00,00
HKR,Responses,"16<cr>66<cr>",1,02,03,00,4b,00,00,00,00,00,00
HKR,Responses,"16<cr>67<cr>",1,02,03,00,4b,00,00,00,00,00,00
HKR,Responses,"16<cr>69<cr>",1,02,02,00,4b,00,00,00,00,00,00
HKR,Responses,"63<cr>66<cr>",1,02,03,20,67,00,00,00,00,00,00
HKR,Responses,"63<cr>67<cr>",1,02,03,20,67,00,00,00,00,00,00
HKR,Responses,"63<cr>69<cr>",1,02,02,20,67,00,00,00,00,00,00
HKR,Responses,"64<cr>66<cr>",1,02,03,80,70,00,00,00,00,00,00
HKR,Responses,"64<cr>67<cr>",1,02,03,80,70,00,00,00,00,00,00
HKR,Responses,"64<cr>69<cr>",1,02,02,80,70,00,00,00,00,00,00

[Strings]
Mfg = "Digicom"
MSFT ="Microsoft"
Modem4="Digicom CCM 44 F"

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,Init,1,,"AT<cr>"
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
[EXTERNAL]
HKR,,DeviceType,1,01
[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03
[MfgAddReg]
HKR,,InactivityScale,1,3c,00,00,00
HKR,Init,2,,"AT&FF0E0Q0V0S0=0<cr>"
HKR,Init,3,,"AT&D2&C1<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,1,,"ATH<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,";"
HKR,Settings,SpeakerVolume_Low,,"L1"
HKR,Settings,SpeakerVolume_Med,,"L2"
HKR,Settings,SpeakerVolume_High,,"L3"
HKR,Settings,SpeakerMode_Off,,"M0"
HKR,Settings,SpeakerMode_Dial,,"M1"
HKR,Settings,SpeakerMode_On,,"M2"
HKR,Settings,SpeakerMode_Setup,,"M3"
HKR,Settings,FlowControl_Off,,"&K0"
HKR,Settings,FlowControl_Hard,,"&K3"
HKR,Settings,FlowControl_Soft,,"&K4"
HKR,Settings,ErrorControl_Cellular,,"\N3-K1"
HKR,Settings,ErrorControl_Cellular_Forced,,"\N2-K1"
HKR,Settings,ErrorControl_On,,"\N3"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_Forced,,"\N4"
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
[Responses1]
HKR,Responses,"<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"10<cr>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"11<cr>",1,02,00,c0,12,00,00,00,00,00,00
HKR,Responses,"12<cr>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"13<cr>",1,02,00,20,1c,00,00,00,00,00,00
HKR,Responses,"14<cr>",1,02,00,e0,2e,00,00,00,00,00,00
HKR,Responses,"15<cr>",1,02,00,40,38,00,00,00,00,00,00
HKR,Responses,"5<cr>66<cr>",1,02,03,b0,04,00,00,00,00,00,00
HKR,Responses,"5<cr>67<cr>",1,02,03,b0,04,00,00,00,00,00,00
HKR,Responses,"5<cr>69<cr>",1,02,02,b0,04,00,00,00,00,00,00
HKR,Responses,"10<cr>66<cr>",1,02,03,60,09,00,00,00,00,00,00
HKR,Responses,"10<cr>67<cr>",1,02,03,60,09,00,00,00,00,00,00
HKR,Responses,"10<cr>69<cr>",1,02,02,60,09,00,00,00,00,00,00
HKR,Responses,"11<cr>66<cr>",1,02,03,c0,12,00,00,00,00,00,00
HKR,Responses,"11<cr>67<cr>",1,02,03,c0,12,00,00,00,00,00,00
HKR,Responses,"11<cr>69<cr>",1,02,02,c0,12,00,00,00,00,00,00
HKR,Responses,"12<cr>66<cr>",1,02,03,80,25,00,00,00,00,00,00
HKR,Responses,"12<cr>67<cr>",1,02,03,80,25,00,00,00,00,00,00
HKR,Responses,"12<cr>69<cr>",1,02,02,80,25,00,00,00,00,00,00
HKR,Responses,"13<cr>66<cr>",1,02,03,20,1c,00,00,00,00,00,00
HKR,Responses,"13<cr>67<cr>",1,02,03,20,1c,00,00,00,00,00,00
HKR,Responses,"13<cr>69<cr>",1,02,02,20,1c,00,00,00,00,00,00
HKR,Responses,"14<cr>66<cr>",1,02,03,e0,2e,00,00,00,00,00,00
HKR,Responses,"14<cr>67<cr>",1,02,03,e0,2e,00,00,00,00,00,00
HKR,Responses,"14<cr>69<cr>",1,02,02,e0,2e,00,00,00,00,00,00
HKR,Responses,"15<cr>66<cr>",1,02,03,40,38,00,00,00,00,00,00
HKR,Responses,"15<cr>67<cr>",1,02,03,40,38,00,00,00,00,00,00
HKR,Responses,"15<cr>69<cr>",1,02,02,40,38,00,00,00,00,00,00
[ISDN]
HKR,ISDN\Init,1,,"ATE0Q0V1W0X2&C1&D2<cr>"
HKR,ISDN\NvSave,1,,"AT&W<cr>"
HKR,ISDN\NvSave,2,,"ATZ<cr>"
HKR,ISDN\SwitchType,SWITCH_DSS1,, "AT<cr>"  
HKR,ISDN\SetMSN,1  ,,"AT*M1!N1=""%s""<cr>"
HKR,Protocol\ISDN\HDLC_PPP_64K,1,,"AT%A2=5<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K,1,,"AT%A2=6<cr>"
HKR,Protocol\ISDN\V120_64K,1,,"AT%A2=2<cr>"
HKR,Protocol\ISDN\V110_19DOT2K,1,,"AT%A2=1S37=27N0<cr>"
HKR,Protocol\ISDN\V110_38DOT4K,1,,"AT%A2=1S37=50N0<cr>"
[ISDN.GEN]
HKR,Settings,FlowControl_Off,,"&K0"
HKR,Settings,FlowControl_Hard,,"&K3"
HKR,Settings,FlowControl_Soft,,"&K4"
HKR,Settings,SpeedNegotiation_Off,,"N0"
HKR,Settings,SpeedNegotiation_On,,"N1"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"S30=<#>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,""
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,1,,"ATH<cr>"
HKR,Answer,1,,"ATA<cr>"
[Responses.ISDN]
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00 
HKR,Responses,"1<cr>",1,02,00,00,00,00,00,00,00,00,00 
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00 
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00 
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"5<cr>",1,02,00,00,00,00,00,00,00,00,00 
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00 
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00 
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",   1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",  1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>", 1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>",   1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 600<cr><lf>", 1,02,00,58,02,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400<cr><lf>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800<cr><lf>",1,02,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600<cr><lf>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400<cr><lf>",1,02,00,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200<cr><lf>",1,02,00,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000<cr><lf>",1,02,00,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57600<cr><lf>",1,02,00,00,E1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 64000<cr><lf>",1,02,00,00,FA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 112000<cr><lf>",1,02,00,80,B5,01,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 128000<cr><lf>",1,02,00,00,F4,01,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 115200<cr><lf>",1,02,00,00,C2,01,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200<cr><lf>",1,02,00,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 12000<cr><lf>",1,02,00,E0,2E,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 230400<cr><lf>",1,02,00,00,84,03,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 38400<cr><lf>",1,02,00,00,96,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800<cr><lf>",1,02,00,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000<cr><lf>",1,02,00,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 115200<cr><lf>",1,02,00,00,00,00,00,00,C2,01,00
HKR,Responses,"<cr><lf>CARRIER 56000<cr><lf>",1,02,00,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 64000<cr><lf>",1,02,00,00,FA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 128000/MLPPP<cr><lf>",1,02,00,00,F4,01,00,00,C2,01,00
HKR,Responses,"<cr><lf>CONNECT 64000/V120<cr><lf>",1,02,00,00,FA,00,00,00,C2,01,00
HKR,Responses,"<cr><lf>CONNECT 64000/V120<cr><lf>",1,02,00,00,FA,00,00,00,C2,01,00
HKR,Responses,"<cr><lf>CONNECT 64000/PPP<cr><lf>",1,02,00,00,FA,00,00,00,C2,01,00
HKR,Responses,"<cr><lf>CONNECT 2400/V110<cr><lf>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800/V110<cr><lf>",1,02,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600/V110<cr><lf>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400/V110<cr><lf>",1,02,00,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200/V110<cr><lf>",1,02,00,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 38400/V110<cr><lf>",1,02,00,00,96,00,00,00,C2,01,00
