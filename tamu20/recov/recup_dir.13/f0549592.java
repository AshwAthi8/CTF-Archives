Modem2%=Modem2,PCMCIA\Nokia_Mobile_Phones-DTP-2-D431        ; Nokia Cellular Data Card
%Modem3%=Modem3,PCMCIA\Nokia_Mobile_Phones-DTP-8_VER_II-4389	; Nokia PCS Data Card ver II

[Modem1]
DriverVer=06/01/1999,5.00.0000.0 
AddReg=All, MfgAddReg, Modem1.AddReg, PCMCIA, GSM 

[Modem2]
DriverVer=06/01/1999,5.00.0000.0 
AddReg=All, MfgAddReg, Modem2.AddReg, PCMCIA

[Modem3] 
DriverVer=06/01/1999,5.00.0000.0
AddReg=All, MfgAddReg, Modem1.AddReg, PCMCIA 

[Modem1.AddReg] 
HKR,, Properties, 1, 00,00,00,00, FF,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 00,C2,01,00, 80,25,00,00
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"

[Modem2.AddReg] 
HKR,, Properties, 1, 00,00,00,00, FF,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 80,25,00,00, 80,25,00,00
HKR, Settings, FlowControl_Off,, "S34=0"
HKR, Settings, FlowControl_Hard,, "S34=2"
HKR, Settings, FlowControl_Soft,, "S34=1"

[Strings]
Mfg = "Nokia"
MSFT="Microsoft"
Modem1="Nokia Cellular Data Card ver II"
Modem2="Nokia Cellular Data Card"
Modem3="Nokia PCS Data Card ver II"

[PCMCIA]
HKR,, DeviceType, 1, 03 
HKR,, PortDriver,, serial.vxd
HKR,, Contention,, *vcd
HKR,, PowerDelay,  0x10001, 1500
HKR,, ConfigDelay, 0x10001, 1500

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00

[MfgAddReg]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT&FV0E0&D2&S0&C1S0=0<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ""
HKR, Settings, SpeedNegotiation_Off,, ""
HKR, Settings, SpeedNegotiation_On,, "S35=7"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Responses, "0<cr>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "5<cr>", 1, 02, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "7<cr>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>", 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "11<cr>", 1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "13<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "14<cr>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "16<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "17<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>FAX<cr><lf>",1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>DATA<cr><lf>",1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>+FCON<cr><lf>",1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>+FCERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>+F4<cr><lf>",  1,03,00,00,00,00,00,00,00,00,00 
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",  1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 300<cr><lf>",1,02,00,2C,01,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 600<cr><lf>",1,02,00,58,02,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 0600<cr><lf>",1,02,00,58,02,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 75TX/1200RX<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200TX/75RX<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/75<cr><lf>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 2400<cr><lf>",1,02,00,60,09,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 4800<cr><lf>",1,02,00,C0,12,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 7200<cr><lf>",1,02,00,20,1C,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 9600<cr><lf>",1,02,00,80,25,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 12000<cr><lf>",1,02,00,E0,2E,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 14400<cr><lf>",1,02,00,40,38,00,00,00,00,00,00

[GSM]
HKR, Protocol\GSM\V110_9DOT6K, 1,,           "AT+CBST=71<cr>"
HKR, Protocol\GSM\ANALOG_RLP, 1,,            "AT+CBST=7<cr>"
