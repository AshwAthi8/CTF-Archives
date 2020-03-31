e System PnP"
Modem7PnP="Deskline K56 Phone System PnP"
Modem9="COM1 Platinium Liberty V90"	
Modem10PnP="Deskline V90 56K PnP"
Modem11PnP="Com1 Performer 128 Pro PnP"


[ControlFlags]
ExcludeFromSelect=*

[ComOne.NTamd64]
%Modem6PnP%=Modem6,*MVX00F2 
%Modem7PnP%=Modem7,SERENUM\MVX00A1 
%Modem9%=Modem9,PCMCIA\COM1_SA-MC220_LIBERTY-941A
%Modem10PnP%=Modem10,SERENUM\MVX2000
%Modem11PnP%=Modem11,SERENUM\ANS00A0
%Modem1% = Modem1, PCMCIA\COM1_SA-MC220_CARD-C3AC
%Modem2% = Modem2, PCMCIA\COM1_SA-MC220_CARD-43F1

[Modem1]
AddReg = All, Modem1.AddReg, Responses, PCMCIA

[Modem2]
AddReg = All, Modem1.AddReg, Responses, Responses56K, PCMCIA

[Modem6]
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf
AddReg = All,MfgAddRegA,Modem6.AddReg,Internal,MDMGL010.ALL,MDMGL010.V90LONG,MDMGL010.V90SHORT,MDMGL010.V34LONG,MDMGL010.V34SHORT

[Modem7]
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf
AddReg = All,MfgAddRegA,Modem7.AddReg,External,MDMGL010.ALL,MDMGL010.V34LONG,MDMGL010.V90LONG,MDMGL010.V34SHORT,MDMGL010.V90SHORT

[Modem9]
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf
AddReg=All,MfgAddRegA,Modem9.AddReg,PCMCIA,MDMGL010.ALL,MDMGL010.V34LONG,MDMGL010.V90LONG,MDMGL010.V34SHORT,MDMGL010.V90SHORT

[Modem10]
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf
AddReg=All,MfgAddRegA,Modem10.AddReg,External,MDMGL010.ALL,MDMGL010.V34LONG,MDMGL010.V90LONG,MDMGL010.V34SHORT,MDMGL010.V90SHORT,Com1_Voice

[Modem11]
DriverVer=06/01/1999,5.00.0000.0
include=mdmgl010.inf
AddReg = All,MfgAddRegA,Modem11.AddReg,External,ISDNE.All,ISDNE.DSS1,ISDN.RESP,MDMGL010.ALL,MDMGL010.NUMERICS,MDMGL010.V34SHORT,MDMGL010.V90SHORT,MDMGL010.V34LONG,MDMGL010.V90LONG

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,Init,     1,,"AT<cr>"

[Modem1.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 00,00,00,00, 0F,00,00,00, B7,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR, Init,                    2,, "AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR, Monitor,                 1,, "ATS0=0<cr>"
HKR,,InactivityScale,              1, 0a,00,00,00
HKR, Monitor,                 2,, "None"
HKR,,Reset,                   , "ATZ<cr>"
HKR, Answer,                  1,, "ATA<cr>"
HKR, Hangup,                  1,, "ATH<cr>"
HKR, Settings, Blind_Off,          , "X4"
HKR, Settings, Blind_On,      , "X3"
HKR, Settings, CallSetupFailTimer, , "S7=<#>"
HKR, Settings, Compression_Off,         , "%%C"
HKR, Settings, Compression_On,          , "%%C3"
HKR, Settings, DialPrefix,         , "D"
HKR, Settings, DialSuffix,         , ";"
HKR, Settings, ErrorControl_Off,   , "\N"
HKR, Settings, ErrorControl_On,         , "\N3"
HKR, Settings, ErrorControl_Forced,     , "\N2"
HKR, Settings, FlowControl_Off,         , "&K"
HKR, Settings, FlowControl_Hard,   , "&K3"
HKR, Settings, FlowControl_Soft,   , "&K4"
HKR, Settings, InactivityTimeout,  , "S30=<#>"
HKR, Settings, Modulation_CCITT,   , "B"
HKR, Settings, Modulation_Bell,         , "B1"
HKR, Settings, Modulation_CCITT_V23,    , "+MS=3"
HKR, Settings, Prefix,             , "AT"
HKR, Settings, Pulse,              , "P"
HKR, Settings, SpeakerVolume_Low,  , "L1"
HKR, Settings, SpeakerVolume_Med,  , "L2"
HKR, Settings, SpeakerVolume_High, , "L3"
HKR, Settings, SpeakerMode_Off,         , "M0"
HKR, Settings, SpeakerMode_Dial,   , "M1"
HKR, Settings, SpeakerMode_On,          , "M2"
HKR, Settings, SpeakerMode_Setup,  , "M3"
HKR, Settings, SpeedNegotiation_Off,    , "N0"
HKR, Settings, SpeedNegotiation_On,     , "N1"
HKR, Settings, Terminator,         , "<cr>"
HKR, Settings, Tone,               , "T"

[Modem11.AddReg]
HKR,,Properties,1,80,01,00,00,ff,00,00,00,ff,00,00,00,07,00,00,00,0f,00,00,00,f7,03,00,00,00,e1,00,00,40,38,00,00
HKR,Settings,SpeedNegotiation_Off,,"N0"
HKR,Settings,SpeedNegotiation_On,,"N1"
HKR,,InactivityScale,1,01,00,00,00
HKR,Init,     2,,"AT+PSTN<cr>"
HKR,Init,     3,,"AT E0 V1 S95=45 S0=0 <cr>"
HKR,Init,     4,,"AT &C1 &D2 <cr>"
HKR,Settings,Modulation_CCITT,,"+MS=11,1,300,33600"
HKR,Settings,Modulation_Bell,,"+MS=69,0,1200,1200"
HKR,Settings,Modulation_CCITT_V23,,"+MS=3,0,1200,1200"

[Modem10.AddReg]
HKR,,Properties,1,80,01,00,00,FF,00,00,00,FF,00,00,00,00,00,00,00,0F,00,00,00,B7,07,00,00,00,C2,01,00,C0,DA,00,00
HKR,Init,                   1,,"AT<cr>"
HKR,Init,                   2,,"AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR,,Reset,                  ,"ATZ<cr>"
HKR,,InactivityScale,             1,0a,00,00,00
HKR,Settings,SpeedNegotiation_Off,   ,"N0"
HKR,Settings,SpeedNegotiation_On,    ,"N1"
HKR,Settings,Compression_Off,        ,"%%C"
HKR,Settings,Modulation_CCITT_V23,   ,"+MS=3"
HKR,Settings,FlowControl_Off,        ,"&K"
HKR,Settings,ErrorControl_Off,  ,"\N"
HKR,Settings,SpeakerVolume_Low, ,"L1"
HKR,Settings,SpeakerVolume_Med, ,"L2"
HKR,Settings,SpeakerVolume_High,,"L3"
HKR,,VoiceProfile,1,25,12,19,02
HKR,Settings,DialSuffix,,";"

[Modem9.AddReg]
HKR,,Properties,1,80,01,00,00,FF,00,00,00,FF,00,00,00,00,00,00,00,0F,00,00,00,B7,07,00,00,00,C2,01,00,C0,DA,00,00
HKR,Init,1,,"AT<cr>"
HKR,Init,2,,"AT&FE0V1&C1&D2S95=45S0=0<cr>"
HKR,Settings,Modulation_CCITT_V23,   ,"+MS=3"
HKR,,Reset,                  ,"ATZ<cr>"
HKR,,InactivityScale,             1,0a,00,00,00
HKR,Settings,Compression_Off,   ,"%%C"
HKR,Settings,ErrorControl_Off,  ,"\N"
HKR,Settings,FlowControl_Off,   ,"&K"
HKR,Settings,Modulation_CCITT,  ,"B"
HKR,Settings,SpeedNegotiation_Off,,"N0"
HKR,Settings,SpeedNegotiation_On, ,"N1"

[Modem7.AddReg]
HKR,,Properties,1,80,01,00,00,00,00,00,00,00,00,00,00,07,00,00,00,0F,00,00,00,77,07,00,00,00,C2,01,00,C0,DA,00,00
HKR,Init,2,,"AT&FE0V1&C1&D2S95=47W2S0=0<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,,InactivityScale,1,0a,00,00,00
HKR,,Reset,,"ATZ<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,Hangup,1,,"ATH<cr>"
HKR,Settings,Modulation_CCITT_V23,,"+MS=3,0,1200,1200"

[Modem6.AddReg]
HKR,,Properties,1,80,01,00,00,00,00,00,00,00,00,00,00,07,00,00,00,0F,00,00,00,77,07,00,00,00,C2,01,00,C0,DA,00,00
HKR,Init,2,,"AT&FE0V1&C1&D2S95=47W2S0=0<cr>"
HKR,Monitor,1,,"ATS0=0<cr>"
HKR,Monitor,2,,"None"
HKR,,InactivityScale,1,0a,00,00,00
HKR,,Reset,,"ATZ<cr>"
HKR,Answer,1,,"ATA<cr>"
HKR,Hangup,1,,"ATH<cr>"
HKR,Settings,Modulation_CCITT_V23,,"+MS=3,0,1200,1200"

[EXTERNAL]
HKR,,DeviceType,1,01
[INTERNAL]
HKR,,DeviceType,1,02
[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03
[MfgAddRegA]
HKR,Init,     2,,"AT &F <cr>"
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
HKR,Settings,Modulation_CCITT_V23,,"B2"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X4"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"S30=<#>"
[MfgAddRegB]
HKR,,InactivityScale,1,01,00,00,00
HKR,Init,     2,,"AT &F <cr>"
HKR,Init,     3,,"AT E0 V1 X5 S0=0 <cr>"
HKR,Init,     4,,"AT &C1 &D2 <cr>"
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
HKR,Settings,FlowControl_Off,,"\Q0"
HKR,Settings,FlowControl_Hard,,"\Q3"
HKR,Settings,FlowControl_Soft,,"\Q1"
HKR,Settings,ErrorControl_On,,"\N7"
HKR,Settings,ErrorControl_Off,,"\N0"
HKR,Settings,ErrorControl_Forced,,"\N6"
HKR,Settings,Compression_On,,"%%C1"
HKR,Settings,Compression_Off,,"%%C0"
HKR,Settings,Modulation_CCITT,,"B0"
HKR,Settings,Modulation_Bell,,"B1"
HKR,Settings,Pulse,,"P"
HKR,Settings,Tone,,"T"
HKR,Settings,Blind_Off,,"X5"
HKR,Settings,Blind_On,,"X3"
HKR,Settings,CallSetupFailTimer,,"S7=<#>"
HKR,Settings,InactivityTimeout,,"\T<#>"
[Com1_Voice]    
HKR,,VoiceBaudRate,   1, 00,C2,01,00
HKR,WaveDriver, BaudRate       ,1, 00,C2,01,00
HKR,WaveDriver, XformID        ,1,01,00
HKR,WaveDriver, XformModule    ,,"umdmxfrm.dll"
HKR,WaveDriver, WaveHardwareID ,,"HALFDUPLEX"
HKR,,Enumerator,,serwave.vxd
HKR,,VoiceMixerMid,        1,16,00
HKR,,VoiceMixerPid,        1,15,00
HKR,,VoiceMixerLineID,     1,00,00,04,00
HKR,StartPlay,              1,,"at#vtx<cr>"
HKR,StopPlay,               1,,"None"
HKR,StopPlay,               2,,"NoResponse"
HKR,StartRecord,            1,,"at#vrx<cr>"
HKR,StopRecord,             1,,"None"
HKR,StopRecord,             2,,"NoResponse"
HKR,,TerminateRecord,,     "<h10><cr>"
HKR,,TerminatePlay,,       "<h10><h03>"
HKR,,AbortPlay,,           "<h10><h18>"
HKR,LineSetPlayFormat,      1,,"at#cls=8<cr>"
HKR,LineSetPlayFormat,      2,,"at#vbs=4<cr>"
HKR,LineSetPlayFormat,      3,,"at#vss=2<cr>"
HKR,LineSetPlayFormat,      4,,"at#vls=0<cr>"
HKR,LineSetPlayFormat,      5,,"at#vbt=2<cr>"
HKR,LineSetPlayFormat,      6,,"at#vra=0<cr>"
HKR,LineSetPlayFormat,      7,,"at#vrn=0<cr>"
HKR,LineSetPlayFormat,      8,,"at#vsp=20<cr>"
HKR,LineSetPlayFormat,      9,,"at#vsd=1<cr>"
HKR,LineSetPlayFormat,      10,,"at#vsr=7200<cr>"
HKR,LineSetRecordFormat,    1,,"at#cls=8<cr>"
HKR,LineSetRecordFormat,    2,,"at#vls=0<cr>"
HKR,LineSetRecordFormat,    3,,"at#vbs=4<cr>"
HKR,LineSetRecordFormat,    4,,"at#vss=2<cr>"
HKR,LineSetRecordFormat,    5,,"at#vsd=0<cr>"
HKR,LineSetRecordFormat,    6,,"at#vsr=7200<cr>"
HKR,VoiceToDataAnswer,         1,,"at#cls=0<cr>"
HKR,VoiceToDataAnswer,         2,,"ata<cr>"
HKR,VoiceAnswer,              1,,"at#cls=8<cr>"
HKR,VoiceAnswer,              2,,"at#vls=0<cr>"
HKR,VoiceAnswer,              3,,"at#vbt=1<cr>"
HKR,VoiceAnswer,              4,,"at#vsr=7200<cr>"
HKR,VoiceAnswer,              5,,"at#vbs=4<cr>"
HKR,VoiceAnswer,              6,,"at#vss=2<cr>"
HKR,VoiceAnswer,              7,,"ats30=60<cr>"
HKR,VoiceAnswer,              8,,"ata<cr>"
HKR,VoiceDialNumberSetup,     1,,"at#cls=8<cr>"
HKR,VoiceDialNumberSetup,     2,,"at#vls=0<cr>"
HKR,VoiceDialNumberSetup,     3,,"at#vrn=0<cr>"
HKR,VoiceDialNumberSetup,     4,,"at#vbt=1<cr>"
HKR,VoiceDialNumberSetup,     5,,"at#vsr=7200<cr>"
HKR,VoiceDialNumberSetup,     6,,"at#vbs=4<cr>"
HKR,VoiceDialNumberSetup,     7,,"ats30=60<cr>"
HKR,GenerateDigit,            1,,"at#vts=<Digit><cr>"
HKR,EnableCallerID,        1,,"at#cid=1<cr>"
HKR,,CallerIDPrivate,,     P
HKR,,CallerIDOutSide,,     O
HKR,,VariableTerminator,,  <cr><lf>
HKR,,ForwardDelay,                                  1,88,13
HKR,,HandsetCloseDelay,                             1,1e,00,00,00
HKR,Responses,"<cr><lf>VCON<cr><lf>",         1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>DATE = ",                   1,93,00,00,00,00,00,00,00,00,00
HKR,Responses,"TIME = ",                           1,94,00,00,00,00,00,00,00,00,00
HKR,Responses,"NMBR = ",                           1,95,00,00,00,00,00,00,00,00,00
HKR,Responses,"NAME = ",                           1,96,00,00,00,00,00,00,00,00,00
HKR,Responses,"MESG = ",                           1,97,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING1<cr><lf>",       1,18,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING2<cr><lf>",       1,19,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING3<cr><lf>",       1,1a,00,00,00,00,00,00,00,00,00
HKR,,SpeakerPhoneSpecs,         1,0A,00,00,00, 0f,00,00,00, 03,00,00,00, 00,00,00,00
HKR,SpeakerPhoneEnable,         1,,"at#vls=6<cr>"
HKR,SpeakerPhoneEnable,         2,,"at#cls=8<cr>"
HKR,SpeakerPhoneEnable,         3,,"at#spk=1,5,2<cr>"
HKR,SpeakerPhoneDisable,        1,,"at#spk=0,16,,<cr>"
HKR,SpeakerPhoneDisable,        2,,"at#vls=0<cr>"
HKR,SpeakerPhoneMute,           1,,"at#vls=6<cr>"
HKR,SpeakerPhoneMute,           2,,"at#spk=0,,,<cr>"
HKR,SpeakerPhoneUnMute,         1,,"at#vls=6<cr>"
HKR,SpeakerPhoneUnMute,         2,,"at#spk=1,,,<cr>"
HKR,SpeakerPhoneSetVolumeGain,1,,"at#vls=6<cr>"
HKR,SpeakerPhoneSetVolumeGain,2,,"at#spk=,<Vol>,<Gain><cr>"
[ISDNE.All]
HKR,ISDN\Init,1,,                        "AT+ISDN<cr>"
HKR,ISDN\NvSave,1,,                       "AT&W0<cr>"
HKR,Protocol\ISDN\AUTO_1CH,1,,            "AT+ISDN<cr>"
HKR,Protocol\ISDN\AUTO_1CH,2,,            "AT&J1x1<cr>"
HKR,Protocol\ISDN\AUTO_2CH,1,,            "AT+ISDN<cr>"
HKR,Protocol\ISDN\AUTO_2CH,2,,            "AT&J1x1<cr>"
HKR,Protocol\ISDN\HDLC_PPP_56K,1,,        "AT+ISDN<cr>"
HKR,Protocol\ISDN\HDLC_PPP_56K,2,,        "ATB40&J0&E1X1<cr>"
HKR,Protocol\ISDN\HDLC_PPP_64K,1,,        "AT+ISDN<cr>"
HKR,Protocol\ISDN\HDLC_PPP_64K,2,,        "ATB40&J0&E0X1<cr>"
HKR,Protocol\ISDN\HDLC_PPP_112K,1,,       "AT+ISDN<cr>"
HKR,Protocol\ISDN\HDLC_PPP_112K,2,,       "ATB40&J1&E1X1<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K,1,,       "AT+ISDN<cr>"
HKR,Protocol\ISDN\HDLC_PPP_128K,2,,       "ATB40&J1&E0X1<cr>"
HKR,Protocol\ISDN\V120_56K ,1,,           "AT+ISDN<cr>"
HKR,Protocol\ISDN\V120_56K ,2,,           "ATB20&J0&E1X1<cr>"
HKR,Protocol\ISDN\V120_64K,1,,            "AT+ISDN<cr>"
HKR,Protocol\ISDN\V120_64K,2,,            "ATB20&J0&E0X1<cr>"
HKR,Protocol\ISDN\V120_112,1,,            "AT+ISDN<cr>"
HKR,Protocol\ISDN\V120_112,2,,            "ATB20&J1&E1X1<cr>"
HKR,Protocol\ISDN\V120_128K,1,,           "AT+ISDN<cr>"
HKR,Protocol\ISDN\V120_128K,2,,           "ATB20&J1&E0X1<cr>"
HKR,Protocol\ISDN\X75_64K,1,,             "AT+ISDN<cr>"
HKR,Protocol\ISDN\X75_64K,2,,             "ATB0&J0&E0X1<cr>"
HKR,Protocol\ISDN\X75_128K,1,,            "AT+ISDN<cr>"
HKR,Protocol\ISDN\X75_128K,2,,            "ATB0&J1&E0X1<cr>"
HKR,Protocol\ISDN\ANALOG_V34,1,,          "AT+PSTN<cr>"
[ISDN.RESP]       
HKR,Responses,"<cr><lf>CONNECT 115200/PPP 64000<cr><lf>",  1,02,00,00,FA,00,00,00,00,00,00 ; 64                        
HKR,Responses,"<cr><lf>CONNECT 115200/PPP 56000<cr><lf>",  1,02,00,C0,DA,00,00,00,00,00,00 ;56                       
HKR,Responses,"<cr><lf>CONNECT 115200/PPPM 112000<cr><lf>",  1,02,00,80,B5,01,00,00,00,00,00                          
HKR,Responses,"<cr><lf>CONNECT 115200/PPPM 128000<cr><lf>",  1,02,00,00,F4,01,00,00,00,00,00                                                    
HKR,Responses,"<cr><lf>CONNECT 115200/V120 64000<cr><lf>",  1,02,00,00,FA,00,00,00,00,00,00                         
HKR,Responses,"<cr><lf>CONNECT 115200/V120 56000<cr><lf>",  1,02,00,C0,DA,00,00,00,00,00,00                                                  
HKR,Responses,"<cr><lf>CONNECT 115200/V120M 112000<cr><lf>",  1,02,00,80,B5,01,00,00,00,00,00                           
HKR,Responses,"<cr><lf>CONNECT 115200/V120M 128000<cr><lf>",  1,02,00,00,F4,01,00,00,00,00,00                                                      
HKR,Responses,"<cr><lf>CONNECT 115200/X75M 112000<cr><lf>",  1,02,00,80,B5,01,00,00,00,00,00                           
HKR,Responses,"<cr><lf>CONNECT 115200/X75M 128000<cr><lf>",  1,02,00,00,F4,01,00,00,00,00,00                           
HKR,Responses,"<cr><lf>CONNECT 115200/X75 64000<cr><lf>",  1,02,00,00,FA,00,00,00,00,00,00                           
HKR,Responses,"<cr><lf>CONNECT 115200/X75 56000<cr><lf>",  1,02,00,C0,DA,00,00,00,00,00,00
[ISDNE.DSS1]
HKR,ISDN\SwitchType,SWITCH_DSS1,,       "AT+ISDN<cr>"
HKR,ISDN\SetMSN,1 ,,                    "AT%%%MSN7=%s<cr>"  
HKR,ISDN\SetMSN,2 ,,                    "AT%%%MSN5=%s<cr>"  
HKR,,Properties,1,00,00,00,00,ff,00,00,00,ff,00,00,00,07,00,00,00,07,00,00,00,73,05,00,00,00,08,07,00,00,f4,01,00
HKR,,DCB,       1,1c,00,00,00,00,c2,01,00,15,20,00,00,00,00,0a,00,0a,00,08,00,00,11,13,00,00,00

[Responses]
HKR, Responses, "0<cr>",           1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr>",           1, 02, 00, 00,00,00,00, 00,00,00,00 ; CONNECT
HKR, Responses, "2<cr>",           1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",           1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",           1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr>",           1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr>",           1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",           1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",           1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER

HKR, Responses, "<cr><lf>OK<cr><lf>",              1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",           1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",                 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",           1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",          1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",                 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",            1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",              1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",             1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>DATA<cr><lf>",            1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>VOICE<cr><lf>",           1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>+FCON<cr><lf>",           1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "<cr><lf>+F4<cr><lf>",             1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX Error

HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>",    1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>",    1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",    1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",    1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",    1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",    1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",   1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",   1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",   1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",   1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",   1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",   1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",   1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",   1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",   1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",   1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",   1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",   1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",  1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>",  1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>",  1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>",          1, 03, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 300<cr><lf>",          1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75<cr><lf>",      1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200<cr><lf>",      1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>",    1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>",    1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>",    1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>",    1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>",    1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00


HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42BIS<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>",    1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>",  1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>",      1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>",   1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: RLP<cr><lf>",  1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>",        1, 03, 00, 00,00,00,00, 00,00,00,00

[Responses56K]
HKR, K56mode,                 1,,"AT+MS=56,1,32000,56000<cr>"
HKR, V90mode,                 1,,"AT+MS=12,1,28000,56000<cr>"

HKR, Responses, "<cr><lf>CONNECT 28000<cr><lf>",   1, 02, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",   1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30667<cr><lf>",   1, 02, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",   1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34667<cr><lf>",   1, 02, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",   1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38667<cr><lf>",   1, 02, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",   1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42667<cr><lf>",   1, 02, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",   1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46667<cr><lf>",   1, 02, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",   1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50667<cr><lf>",   1, 02, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",   1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54667<cr><lf>",   1, 02, 00, 8B,D5,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",   1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>",   1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",   1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>",   1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",   1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>",   1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",   1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>",   1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",   1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>",   1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",   1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>",   1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",   1, 02, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 28000<cr><lf>",   1, 01, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 29333<cr><lf>",   1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 30667<cr><lf>",   1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33333<cr><lf>",   1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34667<cr><lf>",   1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 37333<cr><lf>",   1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38667<cr><lf>",   1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 41333<cr><lf>",   1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42667<cr><lf>",   1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 45333<cr><lf>",   1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46667<cr><lf>",   1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 49333<cr><lf>",   1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50667<cr><lf>",   1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 53333<cr><lf>",   1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54667<cr><lf>",   1, 01, 00, 8B,D5,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>",   1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>",   1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf>",   1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>",   1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>",   1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>",   1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>",   1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>",   1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>",   1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>",   1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>",   1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>",   1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>",   1, 01, 00, C0,DA,00,00, 00,00,00,00
