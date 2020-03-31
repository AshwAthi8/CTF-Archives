
%Modem3PnP%=Modem3,SERENUM\TCM8821

[Stollmann.NTamd64]
%Modem4PnP%=Modem4,SERENUM\STO1003
%Modem6PnP%=Modem6,SERENUM\STO1002


[Tixi.NTamd64]
%Modem5PnP%=Modem5,SERENUM\TIX1001


[Tiptel.NTamd64]
%Modem7PnP%=Modem7,SERENUM\TIP0506
%Modem8PnP%= Modem8,SERENUM\TIP0505


[Octal.NTamd64]
%Modem9PnP%=Modem9,SERENUM\PCB1003



[Modem3]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,Modem3.AddReg,BTX

[Modem4]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,ISDN.128,BTX,Modem3.AddReg

[Modem6]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,ISDN.128,Modem5.AddReg,Modem3.AddReg,Port,V110

[Modem5]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,ISDN.128,Modem5.AddReg,Modem3.AddReg

[Modem7]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,ISDN.128,Modem5.AddReg,Modem3.AddReg,Port,V110

[Modem8]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,ISDN.128,Modem5.AddReg,Modem3.AddReg,V110

[Modem9]
DriverVer=06/01/1999,5.00.0000.0
AddReg=All,External,RESPONSES.ALL,Mfg.ISDN,ISDN,Responses.ISDN,Modem3.AddReg,BTX



[Modem3.AddReg]	
HKR,Responses,"<cr><lf><cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00

[Modem5.AddReg]	
HKR,Responses,"<cr><lf>0<cr><lf>",1,00,00,00,00,00,00,00,00,00,00

[Strings]
MSFT="Microsoft"
Stollmann="Stollmann"
Tiptel="Tiptel"
Octal="Octal"
MS="Microsoft"
3Com="3COM"
Tixi="Tixi.Com GmbH"

Modem3PnP="Sportster ISDN TA ext(Europe) PnP"
Modem4PnP="TA+PP2 PnP"
Modem5PnP="ISDN D2 PnP"
Modem6PnP="TA+DAA PnP"
Modem7PnP="506 PnP"
Modem8PnP="505 PnP"
Modem9PnP="PCBIT-TA PnP"


[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,Init,1,,"AT<cr>"
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00

[EXTERNAL]
HKR,,DeviceType,1,01

[MfgAddReg]
HKR,,InactivityScale,1,3c,00,00,00
HKR,Init,2,,"AT &F <cr>"
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
HKR,Settings,FlowControl_Off,,"&K0"
HKR,Settings,FlowControl_Hard,,"&K3"
HKR,Settings,FlowControl_Soft,,"&K4"
HKR,Settings,ErrorControl_On,,"\N3-J1"
HKR,Settings,ErrorControl_Off,,"\N0-J0"
HKR,Settings,ErrorControl_Forced,,"\N4-J1"
HKR,Settings,Compression_On,,"%%C1""H3"
HKR,Settings,Compression_Off,,"%%C0""H0"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"\T<#>"
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00 ; OK
HKR,Responses,"9<cr>",1,01,00,00,00,00,00,00,00,00,00 ; OK
HKR,Responses,"1<cr>",1,02,00,00,00,00,00,00,00,00,00 ; CONNECT
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00 ; ERROR
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00 ; NO CARRIER
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00 ; NO DIALTONE
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00 ; BUSY
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00 ; NO ANSWER
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00 ; RING
HKR,Responses,"<cr><lf>RING<cr><lf>", 1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>", 1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>", 1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>FAX<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DATA<cr><lf>", 1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DELAY<cr><lf>", 1,1D,00,00,00,00,00,00,00,00,00	
HKR,Responses,"<cr><lf>BLACKLISTED<cr><lf>",1,1C,00,00,00,00,00,00,00,00,00	
HKR,Responses,"<cr><lf>CARRIER 300<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 300 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 1200/75<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 75/1200<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 1200<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 1200 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 2400<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 2400 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 4800<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 4800 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 7200<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 7200 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 9600<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 9600 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 14400<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 14400 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 16800<cr><lf>",1,01,00,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 16800 V.34<cr><lf>",1,01,00,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 19200<cr><lf>",1,01,00,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 19200 V.34<cr><lf>",1,01,00,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 21600<cr><lf>",1,01,00,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 21600 V.34<cr><lf>",1,01,00,60,54,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 24000<cr><lf>",1,01,00,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 24000 V.34<cr><lf>",1,01,00,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 26400<cr><lf>",1,01,00,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 26400 V.34<cr><lf>",1,01,00,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 28800<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CARRIER 28800 V.34<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 300<cr><lf>",1,02,00,2C,01,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 600<cr><lf>",1,02,00,58,02,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200<cr><lf>",  1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/75<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 75/1200<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400<cr><lf>",  1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800<cr><lf>",  1,02,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200<cr><lf>",  1,02,00,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600<cr><lf>",  1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 12000<cr><lf>", 1,02,00,E0,2E,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400<cr><lf>", 1,02,00,40,38,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 16800<cr><lf>", 1,02,00,A0,41,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 19200<cr><lf>", 1,02,00,00,4B,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 21600<cr><lf>", 1,02,00,60,54,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>CONNECT 24000<cr><lf>", 1,02,00,C0,5D,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 26400<cr><lf>", 1,02,00,20,67,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 28800<cr><lf>", 1,02,00,80,70,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 38400<cr><lf>", 1,02,00,00,96,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57600<cr><lf>", 1,02,00,00,E1,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 115200<cr><lf>",1,02,00,00,C2,01,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL: NONE<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL: LAP-M<cr><lf>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>PROTOCOL: MNP 3,4<cr><lf>",1,01,02,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>COMPRESSION: NONE<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>COMPRESSION: V.42BIS<cr><lf>",1,01,03,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>COMPRESSION: CLASS 5<cr><lf>",1,01,03,00,00,00,00,00,00,00,00
[Responses.ALL]
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00 ; OK
HKR,Responses,"9<cr>",1,01,00,00,00,00,00,00,00,00,00 ; OK
HKR,Responses,"1<cr>",1,02,00,00,00,00,00,00,00,00,00 ; CONNECT
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00 ; ERROR
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00 ; NO CARRIER
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00 ; NO DIALTONE
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00 ; BUSY
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00 ; NO ANSWER
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00 ; RING
HKR,Responses,"<cr><lf>RINGING<cr><lf>",  1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",  1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>", 1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>", 1,08,00,00,00,00,00,00,00,00,00

[Mfg.ISDN]
HKR,,Properties,1,00,00,00,00,FF,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,30,01,00,00,00,C2,01,00,00,F4,01,00
HKR,,DCB, 1,1c,00,00,00,00,c2,01,00,15,20,00,00,00,00,0a,00,0a,00,08,00,00,11,13,00,00,00
HKR,,InactivityScale,1,0a,00,00,00
HKR,,Reset,,"ATZ<cr>"
HKR,Init,1,,"AT&FE0V1W<cr>"
HKR,Init,2,,"ATV1&D2&C1S0=0<cr>"
HKR,Monitor, 1,,"ATS0=0<cr>"
HKR,Monitor, 2,,"None"
HKR,Hangup,  1,,"ATH<cr>"
HKR,Answer,  1,,"ATA<cr>"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,DialPrefix,,"D"
HKR,Settings,DialSuffix,,""
HKR,Settings,ErrorControl_Off,, ""
HKR,Settings,FlowControl_Hard,, "&k3"
HKR,Settings,FlowControl_Off,,  "&k0"
HKR,Settings,FlowControl_Soft,, "&k4"
HKR,Settings,InactivityTimeout,,"S50=<#>"
HKR,Settings,Prefix,,"AT"
HKR,Settings,Pulse,,"P"
HKR,Settings,Terminator,,"<cr>"
HKR,Settings,Tone,, "T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"

[Responses.ISDN]
HKR,Responses,"<cr><lf>CONNECT 64000<cr><lf>",1,02,02,00,fa,00,00,00,00,00,00

[ISDN]
HKR,ISDN\SwitchType,SWITCH_DSS1,,"AT**ISDN=0<cr>"
HKR,ISDN\SetMSN,1,,"AT**MSN=%s<cr>"
HKR,ISDN\NvSave,1,,"AT&W<cr>" 
HKR,ISDN\NvSave,2,,"AT<cr>"
HKR,Protocol\ISDN\V120_64K,1,,"ATB13<cr>"
HKR,Protocol\ISDN\X75_64K ,1,,"ATB10<cr>"
HKR,Protocol\ISDN\HDLC_PPP_64K,1,,"ATB3<cr>"

[ISDN.128]
HKR,Protocol\ISDN\HDLC_PPP_128K,1,, "ATB31<cr>"

[BTX]
HKR,Protocol\ISDN\X75_BTX,1,,"ATB23<cr>"

[Port]
HKR,ISDN\SetMSN,2,,"AT**AB/1.AMSN1=%s<cr>"

[V110]
HKR,Protocol\ISDN\V110_2DOT4K,1,,"ATB0N2<cr>"
HKR,Protocol\ISDN\V110_4DOT8K,1,,"ATB0N3<cr>"
HKR,Protocol\ISDN\V110_9DOT6K,1,,"ATB0N4<cr>"
HKR,Protocol\ISDN\V110_19DOT2K,1,,"ATB0N5<cr>"
