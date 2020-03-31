

[Modem4]
include=mdmgl010.inf  
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,ISDN.Modem,ISDN,External,Responses.ISDN,Modem4.AddReg,MDMGL010.V34SHORT,MDMGL010.ALL

[Modem4.AddReg]
HKR,,Properties,1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,30,00,00,00,00,c2,01,00,00,F4,01,00

[Strings]
MSFT="Microsoft"
Moto="Motorola"
BT="British Telecom"

Modem14PNP="BT Ignition ISDN PnP"

Modem13PNP="Motorola BitSURFR PRO ISDN Euro PnP"

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,Init,1,,"AT<cr>"
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00, 00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00, 00,00,00,00

[EXTERNAL]
HKR,,DeviceType,1,01

[MfgAddReg]
HKR,,InactivityScale,1,01,00,00,00
HKR,Init,2,,"AT &F V0 E0<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,1,,"ATH<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,,Reset,,"ATZ<cr>"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,""
HKR,Settings,SpeakerVolume_Low,,"L0"
HKR,Settings,SpeakerVolume_Med,,"L2"
HKR,Settings,SpeakerVolume_High,,"L3"
HKR,Settings,SpeakerMode_Off,,"M0"
HKR,Settings,SpeakerMode_Dial,,"M1"
HKR,Settings,SpeakerMode_On,,"M2"
HKR,Settings,SpeakerMode_Setup,,"M3"
HKR,Settings,FlowControl_Off,,"*FL0"
HKR,Settings,FlowControl_Hard,,"*FL3"
HKR,Settings,FlowControl_Soft,,"*FL1"
HKR,Settings,ErrorControl_On,,"*SM3"
HKR,Settings,ErrorControl_Off,,"*SM1"
HKR,Settings,ErrorControl_Forced,,"*SM2"
HKR,Settings,Compression_On,,"*DC1"
HKR,Settings,Compression_Off,,"*DC0"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,, "T"
HKR,Settings,Blind_Off,, "X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"S30=<#>"
HKR,Responses,"10<cr>",1,02,00,00,00,00,00,60,09,00,00
HKR,Responses,"11<cr>",1,02,00,00,00,00,00,c0,12,00,00
HKR,Responses,"12<cr>",1,02,00,00,00,00,00,80,25,00,00
HKR,Responses,"13<cr>",1,02,00,00,00,00,00,58,02,00,00
HKR,Responses,"14<cr>",1,02,00,00,00,00,00,00,4b,00,00
HKR,Responses,"15<cr>",1,02,00,00,00,00,00,20,1c,00,00
HKR,Responses,"16<cr>",1,02,00,00,00,00,00,e0,2e,00,00
HKR,Responses,"17<cr>",1,02,00,00,00,00,00,40,38,00,00
HKR,Responses,"18<cr>",1,02,00,00,00,00,00,a0,41,00,00
HKR,Responses,"19<cr>",1,02,00,00,00,00,00,60,54,00,00
HKR,Responses,"20<cr>",1,02,00,00,00,00,00,c0,5d,00,00
HKR,Responses,"21<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"22<cr>",1,02,00,00,00,00,00,00,96,00,00
HKR,Responses,"23<cr>",1,02,00,00,00,00,00,00,e1,00,00
HKR,Responses,"24<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"25<cr>",1,02,03,00,00,00,00,b0,04,00,00
HKR,Responses,"26<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"27<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"28<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"29<cr>",1,02,00,00,00,00,00,00,c2,01,00
HKR,Responses,"30<cr>",1,02,03,00,00,00,00,60,09,00,00
HKR,Responses,"31<cr>",1,02,03,00,00,00,00,c0,12,00,00
HKR,Responses,"32<cr>",1,02,03,00,00,00,00,80,25,00,00
HKR,Responses,"33<cr>",1,02,03,00,00,00,00,58,02,00,00
HKR,Responses,"34<cr>",1,02,03,00,00,00,00,00,4b,00,00
HKR,Responses,"35<cr>",1,02,03,00,00,00,00,20,1c,00,00
HKR,Responses,"36<cr>",1,02,03,00,00,00,00,e0,2e,00,00
HKR,Responses,"37<cr>",1,02,03,00,00,00,00,40,38,00,00
HKR,Responses,"38<cr>",1,02,03,00,00,00,00,a0,41,00,00
HKR,Responses,"39<cr>",1,02,03,00,00,00,00,60,54,00,00
HKR,Responses,"40<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"41<cr>",1,02,03,00,00,00,00,c0,5d,00,00
HKR,Responses,"42<cr>",1,02,03,00,00,00,00,00,96,00,00
HKR,Responses,"50<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"51<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"52<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"53<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"54<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"55<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"56<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"57<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"58<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"59<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"60<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"61<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"62<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"63<cr>",1,02,00,00,00,00,00,20,67,00,00
HKR,Responses,"64<cr>",1,02,00,00,00,00,00,80,70,00,00
HKR,Responses,"65<cr>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"76<cr>",1,02,03,00,00,00,00,00,e1,00,00
HKR,Responses,"77<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"78<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"79<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"80<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"81<cr>",1,02,03,00,00,00,00,00,c2,01,00
HKR,Responses,"82<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"83<cr>",1,02,03,00,00,00,00,00,00,00,00
HKR,Responses,"84<cr>",1,02,03,00,00,00,00,20,67,00,00
HKR,Responses,"85<cr>",1,02,03,00,00,00,00,80,70,00,00
HKR,Responses,"86<cr>",1,02,03,00,00,00,00,00,00,00,00
[Responses.ISDN]
HKR,Responses,"<cr><lf>CONNECT 56000<cr><lf>",1,02,00,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57600<cr><lf>",1,02,00,00,E1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 64000<cr><lf>",1,02,00,00,FA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 112000<cr><lf>",1,02,00,80,B5,01,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 128000<cr><lf>",1,02,00,00,F4,01,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200<cr><lf>",1,02,00,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 12000<cr><lf>",1,02,00,E0,2E,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 230400<cr><lf>",1,02,00,00,84,03,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 38400<cr><lf>",1,02,00,00,96,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800<cr><lf>",1,02,00,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 48000<cr><lf>",1,02,00,80,BB,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 56000<cr><lf>",1,02,00,C0,DA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 64000<cr><lf>",1,02,00,00,FA,00,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL:PPPC<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL:ISDN<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL:V.120<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL:V.110<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CHANNEL B1<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CHANNEL B2<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>SESSION ID: 1<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
[ISDN]
HKR,ISDN\Init,1,,"ATE0Q0V1W0X2&C1&D2<cr>"
HKR,ISDN\NvSave,1,,"AT>W*&W<cr>"
HKR,ISDN\NvSave,2,,"AT>Z<cr>"
HKR,ISDN\SwitchType,SWITCH_DSS1,,"AT<cr>"  
HKR,ISDN\SetMSN,1,,"AT!N1=%s<cr>"
HKR,ISDN\SetMSN,2,,"AT*1!N1=%s<cr>"
HKR,Protocol\ISDN\HDLC_PPP_56K,1,,"AT%A2=95@B0=1%A4=1<cr>"
HKR,Protocol\ISDN\HDLC_PPP_64K,1,,"AT%A2=95@B0=1%A4=0<cr>"
HKR,Protocol\ISDN\HDLC_PPP_112K,1,,"AT%A2=95@B0=2%A4=1<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K,1,,"AT%A2=95@B0=2%A4=0<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K_PAP,1,,"AT%A2=95@B0=2%A4=0@M2=P<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K_CHAP,1,,"AT%A2=95@B0=2%A4=0@M2=C<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K_MSCHAP,1,,"AT%A2=95@B0=2%A4=0@M2=M<cr>"
HKR,Protocol\ISDN\V120_56K,1 ,,"AT%A2=2@B0=1%A4=1<cr>"
HKR,Protocol\ISDN\V120_64K,1,,"AT%A2=2@B0=1%A4=0<cr>"
HKR,Protocol\ISDN\V110_19DOT2K,1,,"AT%A2=99@B0=1%A4=1<cr>"
HKR,Protocol\ISDN\V110_38DOT4K,1,,"AT%A2=99@B0=1%A4=0<cr>"
[ISDN.Modem] 
HKR,Settings,FlowControl_Off,,"\Q0"
HKR,Settings,FlowControl_Hard,,"\Q3"
HKR,Settings,FlowControl_Soft,,"\Q1"
HKR,Init,2,,"AT&FE0V1W0&C1&D2S0=0<cr>"
HKR,Init,3,,"AT<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,1,,"ATH<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,,Reset,,"AT&F<cr>"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,""
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
[MfgAddRegUDS]
HKR,,InactivityScale,1,3C,00,00,00
HKR,Init,2,,"AT &F <cr>"
HKR,Init,3,,"ATY0L3&C1&D2&S1&R\Q3\V1S39=32S95=47V1E0 <cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,Hangup,1,,"ATH<cr>"
HKR,Answer,1,,"ATA<cr>"
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
HKR,Settings,FlowControl_Off,,"\Q0"
HKR,Settings,FlowControl_Hard,,"\Q3\Q6"
HKR,Settings,FlowControl_Soft,,"\Q1\Q5"
HKR,Settings,ErrorControl_On,,"\N7"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_Forced,,"\N6"
HKR,Settings,Compression_On,,"%%C1"
HKR,Settings,Compression_Off,,"%%C0"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"\T<#>"
HKR,Responses,"1<cr>",1,02,00,2c,01,00,00,00,00,00,00
HKR,Responses,"5<cr>",1,02,00,b0,04,00,00,00,00,00,00
HKR,Responses,"10<cr>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"11<cr>",1,02,00,c0,12,00,00,00,00,00,00
HKR,Responses,"12<cr>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"13<cr>",1,02,00,40,38,00,00,00,00,00,00
HKR,Responses,"14<cr>",1,02,00,00,4b,00,00,00,00,00,00
HKR,Responses,"15<cr>",1,02,00,80,70,00,00,00,00,00,00
HKR,Responses,"18<cr>",1,02,00,00,e1,00,00,00,00,00,00
HKR,Responses,"22<cr>",1,02,00,b0,04,00,00,00,00,00,00
HKR,Responses,"23<cr>",1,02,00,b0,04,00,00,00,00,00,00
HKR,Responses,"24<cr>",1,02,00,20,1c,00,00,00,00,00,00
HKR,Responses,"25<cr>",1,02,00,e0,2e,00,00,00,00,00,00
HKR,Responses,"26<cr>",1,02,00,a0,41,00,00,00,00,00,00
HKR,Responses,"28<cr>",1,02,00,00,96,00,00,00,00,00,00
HKR,Responses,"29<cr>",1,02,00,c0,5d,00,00,00,00,00,00
HKR,Responses,"31<cr>",1,02,00,00,c2,01,00,00,00,00,00
HKR,Responses,"33<cr>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"34<cr>",1,02,00,20,67,00,00,00,00,00,00
HKR,Responses,"35<cr>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"60<cr>",1,02,00,60,54,00,00,00,00,00,00
HKR,Responses,"65<cr>",1,02,00,00,84,03,00,00,00,00,00
HKR,Responses,"36<cr>",1,01,00,20,67,00,00,00,00,00,00
HKR,Responses,"37<cr>",1,01,00,c0,5d,00,00,00,00,00,00
HKR,Responses,"38<cr>",1,01,00,60,54,00,00,00,00,00,00
HKR,Responses,"40<cr>",1,01,00,2c,01,00,00,00,00,00,00
HKR,Responses,"44<cr>",1,01,00,b0,04,00,00,00,00,00,00
HKR,Responses,"45<cr>",1,01,00,b0,04,00,00,00,00,00,00
HKR,Responses,"46<cr>",1,01,00,b0,04,00,00,00,00,00,00
HKR,Responses,"47<cr>",1,01,00,60,09,00,00,00,00,00,00
HKR,Responses,"48<cr>",1,01,00,c0,12,00,00,00,00,00,00
HKR,Responses,"49<cr>",1,01,00,20,1c,00,00,00,00,00,00
HKR,Responses,"50<cr>",1,01,00,80,25,00,00,00,00,00,00
HKR,Responses,"51<cr>",1,01,00,e0,2e,00,00,00,00,00,00
HKR,Responses,"52<cr>",1,01,00,40,38,00,00,00,00,00,00
HKR,Responses,"53<cr>",1,01,00,a0,41,00,00,00,00,00,00
HKR,Responses,"54<cr>",1,01,00,00,4b,00,00,00,00,00,00
HKR,Responses,"55<cr>",1,01,00,80,70,00,00,00,00,00,00
HKR,Responses,"66<cr>",1,01,01,00,00,00,00,00,00,00,00
HKR,Responses,"67<cr>",1,01,01,00,00,00,00,00,00,00,00
HKR,Responses,"68<cr>",1,01,01,00,00,00,00,00,00,00,00
HKR,Responses,"69<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"70<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"71<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"72<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"73<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"74<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"75<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"76<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"77<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"78<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"79<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"80<cr>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"91<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"92<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"93<cr>",1,01,00,00,00,00,00,00,00,00,00


