%Modem02%=Modem03, *OZO9100

[BestData.NTamd64]
%ModemBD1%=ModemBD1, *BDP3336
%ModemBD2%=ModemBD2, *BDP0156

[Modem01]
AddReg=All, Modem01Reg, EXTERNAL, All.Verbose
DriverVer=03/09/2000

[Modem02]
AddReg = Modem02.AddReg, INTERNAL, All.Verbose, Modem02.Voice, DR, CID
DriverVer=03/26/2001

[Modem03]
AddReg = Modem03.AddReg,INTERNAL,Responses.2919,DR,Voice.2919_1,Voice.2919_2,MicroVoice

[ModemBD1]
AddReg=All, Modem01Reg, INTERNAL, All.Verbose
DriverVer=03/09/2000

[ModemBD2]
AddReg= ModemB2Reg, INTERNAL, All.Terse, BD256.Verbose
DriverVer=03/09/2000

[Modem01Reg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,07,00,00, 00,C2,01,00, 40,83,00,00
HKR, Init, 2,, "AT &F E0 V1 &D2 &C1 W1 S0=0 S95=47<cr>"
HKR,, Reset,, "AT&F<cr>"
HKR, Settings, SpeakerVolume_Low,, "L0"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, ErrorControl_Cellular,, "\N3-K1*H1)M1-Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N2-K1*H1)M1-Q0"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, Compression_Off,, "%%C0"
HKR,, InactivityScale, 1, 0a,00,00,00
HKR, Settings, Modulation_CCITT_V23,, "+MS=3"

[Modem02.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,c2,01,00, 60,EA,00,00
HKR,, VoiceProfile,    1,21,A1,00,02
HKR, Init,      1,, "AT<cr>"
HKR, Init,      2,, "AT &F E0 &C1 &D2 V1 S0=0\V1<cr>"

HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"

HKR, Answer,    1,, "ATA<cr>"
HKR, Hangup,    1,, "ATH E1<cr>"

HKR,, Reset,, "AT&F<cr>"
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"

HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, SpeakerVolume_Low,, "L0"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N1"
HKR, Settings, ErrorControl_Forced,, "\N4"
HKR, Settings, ErrorControl_Cellular,, "&F5 S39=22 \N3"
HKR, Settings, ErrorControl_Cellular_Forced,, "&F5 S39=22 \N4"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Compression_On,, "%%C1"
HKR, Settings, Modulation_CCITT,, "B0B15"
HKR, Settings, Modulation_Bell,, "B1B16"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR,, InactivityScale,1, 3c,00,00,00
HKR, Settings, InactivityTimeOut,, "S30=<#>"

[Modem03.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, FF,07,00,00, 00,C2,01,00, C0,DA,00,00
HKR, Init,   2,, "AT&FE0V1&C1&D2S95=45S0=0<cr>"

HKR,, InactivityScale,                                          1, 0a,00,00,00
HKR, Init,                                                      2,,"AT &F E0 V1 &D2 &C1 W1 S0=0 S95=47<cr>"
HKR, Monitor,                                                   1,,"ATS0=0<cr>"
HKR, Monitor,                                                   2,,"None"
HKR, Hangup,                                                    1,,"ATH<cr>"
HKR, Answer,                                                    1,,"ATA<cr>"
HKR,, Reset,,                                                   "AT&F<cr>"
HKR, Settings, Prefix,,                                         "AT"
HKR, Settings, Terminator,,                                     "<cr>"
HKR, Settings, DialPrefix,,                                     "D"
HKR, Settings, DialSuffix,,                                     ";"
HKR, Settings, SpeakerVolume_Low,,                              "L0"
HKR, Settings, SpeakerVolume_Med,,                              "L2"
HKR, Settings, SpeakerVolume_High,,                             "L3"
HKR, Settings, SpeakerMode_Off,,                                "M0"
HKR, Settings, SpeakerMode_Dial,,                               "M1"
HKR, Settings, SpeakerMode_On,,                                 "M2"
HKR, Settings, SpeakerMode_Setup,,                              "M3"
HKR, Settings, FlowControl_Off,,                                "&K0"
HKR, Settings, FlowControl_Hard,,                               "&K3"
HKR, Settings, FlowControl_Soft,,                               "&K4"
HKR, Settings, ErrorControl_On,,                                "\N3"
HKR, Settings, ErrorControl_Off,,                               "\N0"
HKR, Settings, ErrorControl_Forced,,                            "\N2"
HKR, Settings, ErrorControl_Cellular,,                          "\N3-K1*H1)M1-Q0-SEC=1"
HKR, Settings, ErrorControl_Cellular_Forced,,                   "\N2-K1*H1)M1-Q0-SEC=1"
HKR, Settings, Compression_On,,                                 "%%C3"
HKR, Settings, Compression_Off,,                                "%%C0"
HKR, Settings, Modulation_CCITT,,                               "B0"
HKR, Settings, Modulation_Bell,,                                "B1"
HKR, Settings, Modulation_CCITT_V23,,                           "+MS=3"
HKR, Settings, SpeedNegotiation_Off,,                           "N0"
HKR, Settings, SpeedNegotiation_On,,                            "N1"
HKR, Settings, Pulse,,                                          "P"
HKR, Settings, Tone,,                                           "T"
HKR, Settings, Blind_Off,,                                      "X4"
HKR, Settings, Blind_On,,                                       "X3"
HKR, Settings, CallSetupFailTimer,,                             "S7=<#>"
HKR, Settings, InactivityTimeout,,                              "S30=<#>"
HKR,,FriendlyDriver,,                                           Unimodem.vxd
HKR,,DevLoader,,                                                *vcomm
HKR,,PortSubClass,                                              1,02
HKR,,Enumerator,,                                               serwave.vxd
HKR,,ConfigDialog,,                                             modemui.dll
HKR,,EnumPropPages,,                                            "modemui.dll,EnumPropPages"
HKR, Init,                                                      1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>",                           1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",                        1, 03, 00, 00,00,00,00, 00,00,00,00

[ModemB2Reg]
HKR,, Properties, 1, 80,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 60,ea,00,00
HKR,,ConfigDialog,,modemui.dll
HKR,,DevLoader,,*vcomm
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,,FriendlyDriver,,Unimodem.VXD
HKR,, InactivityScale, 1, 0a,00,00,00
HKR,,PortSubClass,1,02
HKR,, Reset,, "ATZ<cr>"
HKR, Answer,    1,, "ATA<cr>"
HKR, Hangup,    1,, "ATH<cr>"
HKR, Init,      1,, "AT<cr>"
HKR, Init,      2,, "AT&FE0V1&C1&D2S95=47S0=0<cr>"
HKR, Monitor,   1,, "ATS0=0<cr>"
HKR, Monitor,   2,, "None"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, Compression_Off,, "%%C"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, ErrorControl_Off,, "\N"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, ErrorControl_Cellular,, "\N3-K1*H1)M1-Q0"
HKR, Settings, ErrorControl_Cellular_Forced,,"\N2-K1*H1)M1-Q0"
HKR, Settings, FlowControl_Off,, "&K"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR, Settings, Modulation_CCITT,, "B"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Pulse,, "P"
HKR, Settings, SpeakerVolume_Low,, "L1"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, Tone,, "T"
HKR, SVDmode,    1,,"AT-SMS=0<cr>"
HKR, AudioSpanCntrl,   1,,"AT-SMC=1<cr>"
HKR, AudioSpanModulation,   1,,"AT-SQS= 2<cr>"
HKR, K56mode,    1,,"AT+MS=56,1,32000,56000<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",       1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",       1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "2<cr>",       1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",       1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>",       1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",       1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",       1, 07, 00, 00,00,00,00, 00,00,00,00

[Strings]
MSFT = "Microsoft"
Mfg = "Zoom"
Modem01="Zoom V.34 33.6 Model 2836 PnP"	;//WHQL
Modem02="Zoom Internal 56K LT Voice Faxmodem"
Modem03="Zoom Internal 56K Voice FaxModem"
BestData  = "Best Data"
ModemBD1="Smart One 336F Modem PnP"
modemBD2  = "Smart One 56F"

[EXTERNAL]
HKR,, DeviceType, 1, 01

[INTERNAL]
HKR,, DeviceType, 1, 02

[ALL]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Init, 2,, "AT&FE0V0Q0W1&C1&D2S95=47S0=0<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Answer, 1,, "ATA<cr>"
HKR, Hangup, 1,, "ATH<cr>"
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR, Settings, SpeakerVolume_Low,, "L1"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_Off,, "&Q6S36=3S48=128\N0"
HKR, Settings, ErrorControl_On,, "&Q5S36=7S48=7\N3"
HKR, Settings, ErrorControl_Forced,, "&Q5S36=4S48=7\N2"
HKR, Settings, Compression_Off,, "S46=136%%C0"
HKR, Settings, Compression_On,, "S46=138%%C3"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Responses, "<cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",       1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",       1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "2<cr>",       1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",       1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>",       1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",       1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",       1, 07, 00, 00,00,00,00, 00,00,00,00

[All.Terse]
HKR, Responses, "5<cr>",  1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "9<cr>",  1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "11<cr>", 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "13<cr>", 1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "14<cr>", 1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "15<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "16<cr>", 1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "17<cr>", 1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "18<cr>", 1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "19<cr>", 1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "22<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "23<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "24<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "32<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "33<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "35<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "40<cr>", 1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "44<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "45<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "46<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "47<cr>", 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "48<cr>", 1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "49<cr>", 1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "50<cr>", 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "51<cr>", 1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "52<cr>", 1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "53<cr>", 1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "54<cr>", 1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "55<cr>", 1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "56<cr>", 1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "57<cr>", 1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "58<cr>", 1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "59<cr>", 1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "61<cr>", 1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "62<cr>", 1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "63<cr>", 1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "64<cr>", 1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "66<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "67<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "69<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "70<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "76<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "77<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "80<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "81<cr>", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "+F4<cr>",1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "150<cr>", 1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "151<cr>", 1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "152<cr>", 1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "153<cr>", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "154<cr>", 1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "155<cr>", 1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "156<cr>", 1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "157<cr>", 1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "158<cr>", 1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "159<cr>", 1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "160<cr>", 1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "161<cr>", 1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "162<cr>", 1, 01, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "163<cr>", 1, 01, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "164<cr>", 1, 01, 00, 60,EA,00,00, 00,00,00,00
HKR, Responses, "165<cr>", 1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "166<cr>", 1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "167<cr>", 1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "168<cr>", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "169<cr>", 1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "170<cr>", 1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "171<cr>", 1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "172<cr>", 1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "173<cr>", 1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "174<cr>", 1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "175<cr>", 1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "176<cr>", 1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "177<cr>", 1, 02, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "178<cr>", 1, 02, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "179<cr>", 1, 02, 00, 60,EA,00,00, 00,00,00,00

[All.Verbose]
HKR, Responses, "<cr>",   1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",   1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",  1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK - Command executed
HKR, Responses, "1<cr>",  1, 02, 00, 00,00,00,00, 00,00,00,00 ; CONNECT - Connection
HKR, Responses, "2<cr>",  1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING - Ring signal indicated
HKR, Responses, "3<cr>",  1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",  1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR - Invalid command
HKR, Responses, "5<cr>",  1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr>",  1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE - No dial tone detected
HKR, Responses, "7<cr>",  1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY - Engaged (busy) signal
HKR, Responses, "8<cr>",  1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "<cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>",        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>VOICE<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>",     1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",     1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>",    1, 03, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT<cr><lf>",                 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300<cr><lf>",        1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 NoEC<cr><lf>",        1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 MNP4<cr><lf>",        1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 MNP5<cr><lf>",        1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 V42<cr><lf>",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300 V42bis<cr><lf>",      1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600<cr><lf>",        1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 NoEC<cr><lf>",        1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 MNP4<cr><lf>",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 MNP5<cr><lf>",        1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 V42<cr><lf>",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600 V42bis<cr><lf>",      1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>",       1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 NoEC<cr><lf>",       1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 MNP4<cr><lf>",       1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 MNP5<cr><lf>",       1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42<cr><lf>",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42bis<cr><lf>",     1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42 Cellular Protocol<cr><lf>",     1, 02, 0a, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200 V42bis Cellular Protocol<cr><lf>",     1, 02, 0b, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>",         1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 NoEC<cr><lf>",         1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 MNP4<cr><lf>",    1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 MNP5<cr><lf>",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 V42<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75 V42bis<cr><lf>",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX NoEC<cr><lf>",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX MNP4<cr><lf>",1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX MNP5<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX V42<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX V42bis<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>",    1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 NoEC<cr><lf>",    1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 MNP4<cr><lf>",    1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 MNP5<cr><lf>",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 V42<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200 V42bis<cr><lf>",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX NoEC<cr><lf>",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX MNP4<cr><lf>",1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX MNP5<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX V42<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX V42bis<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",       1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 NoEC<cr><lf>",       1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 MNP4<cr><lf>",       1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 MNP5<cr><lf>",       1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42<cr><lf>",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42bis<cr><lf>",     1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42 Cellular Protocol<cr><lf>",     1, 02, 0a, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 V42bis Cellular Protocol<cr><lf>",     1, 02, 0b, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",       1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 NoEC<cr><lf>",       1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 MNP4<cr><lf>",       1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 MNP5<cr><lf>",       1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42<cr><lf>",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42bis<cr><lf>",     1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42 Cellular Protocol<cr><lf>",     1, 02, 0a, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42bis Cellular Protocol<cr><lf>",     1, 02, 0b, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42 DSVD<cr><lf>",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 V42bis DSVD<cr><lf>",     1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",       1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 NoEC<cr><lf>",       1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 MNP4<cr><lf>",       1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 MNP5<cr><lf>",       1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42<cr><lf>",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42bis<cr><lf>",     1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42 Cellular Protocol<cr><lf>",     1, 02, 0a, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42bis Cellular Protocol<cr><lf>",     1, 02, 0b, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42 DSVD<cr><lf>",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200 V42bis DSVD<cr><lf>",     1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",       1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 NoEC<cr><lf>",       1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 MNP4<cr><lf>",       1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 MNP5<cr><lf>",       1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42<cr><lf>",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42bis<cr><lf>",     1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42 Cellular Protocol<cr><lf>",     1, 02, 0a, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42bis Cellular Protocol<cr><lf>",     1, 02, 0b, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42 DSVD<cr><lf>",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 V42bis DSVD<cr><lf>",     1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",      1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 NoEC<cr><lf>",      1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 MNP4<cr><lf>",      1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 MNP5<cr><lf>",      1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42<cr><lf>",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42bis<cr><lf>",    1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42 DSVD<cr><lf>",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000 V42bis DSVD<cr><lf>",    1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",      1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 NoEC<cr><lf>",      1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 MNP4<cr><lf>",      1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 MNP5<cr><lf>",      1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42<cr><lf>",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42bis<cr><lf>",    1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42 DSVD<cr><lf>",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400 V42bis DSVD<cr><lf>",    1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",      1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 NoEC<cr><lf>",      1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 MNP4<cr><lf>",      1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 MNP5<cr><lf>",      1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42<cr><lf>",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42bis<cr><lf>",    1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42 DSVD<cr><lf>",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800 V42bis DSVD<cr><lf>",    1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",      1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 NoEC<cr><lf>",      1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 MNP4<cr><lf>",      1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 MNP5<cr><lf>",      1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42<cr><lf>",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42bis<cr><lf>",    1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42 DSVD<cr><lf>",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 V42bis DSVD<cr><lf>",    1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",      1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 NoEC<cr><lf>",      1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 MNP4<cr><lf>",      1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 MNP5<cr><lf>",      1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42<cr><lf>",       1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42bis<cr><lf>",    1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42 DSVD<cr><lf>",       1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600 V42bis DSVD<cr><lf>",    1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",      1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 NoEC<cr><lf>",      1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 MNP4<cr><lf>",      1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 MNP5<cr><lf>",      1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42<cr><lf>",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42bis<cr><lf>",    1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42 DSVD<cr><lf>",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000 V42bis DSVD<cr><lf>",    1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",      1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 NoEC<cr><lf>",      1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 MNP4<cr><lf>",      1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 MNP5<cr><lf>",      1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42<cr><lf>",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42bis<cr><lf>",    1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42 DSVD<cr><lf>",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400 V42bis DSVD<cr><lf>",    1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",      1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 NoEC<cr><lf>",      1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 MNP4<cr><lf>",      1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 MNP5<cr><lf>",      1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42<cr><lf>",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42bis<cr><lf>",    1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42 DSVD<cr><lf>",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800 V42bis DSVD<cr><lf>",    1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",      1, 02, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 NoEC<cr><lf>",      1, 02, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 MNP4<cr><lf>",      1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 MNP5<cr><lf>",      1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42<cr><lf>",       1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42bis<cr><lf>",    1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42 DSVD<cr><lf>",       1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200 V42bis DSVD<cr><lf>",    1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",      1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 NoEC<cr><lf>",      1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 MNP4<cr><lf>",      1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 MNP5<cr><lf>",      1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42<cr><lf>",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42bis<cr><lf>",    1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42 DSVD<cr><lf>",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600 V42bis DSVD<cr><lf>",    1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 NoEC<cr><lf>",      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP4<cr><lf>",      1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP5<cr><lf>",      1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis<cr><lf>",    1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42 DSVD<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis DSVD<cr><lf>",    1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",      1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 NoEC<cr><lf>",      1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP4<cr><lf>",      1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 MNP5<cr><lf>",      1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42<cr><lf>",       1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42bis<cr><lf>",    1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42 DSVD<cr><lf>",       1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 V42bis DSVD<cr><lf>",    1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",      1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 NoEC<cr><lf>",      1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP4<cr><lf>",      1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 MNP5<cr><lf>",      1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42<cr><lf>",       1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42bis<cr><lf>",    1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42 DSVD<cr><lf>",       1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 V42bis DSVD<cr><lf>",    1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",      1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 NoEC<cr><lf>",      1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 MNP4<cr><lf>",      1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 MNP5<cr><lf>",      1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42<cr><lf>",       1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42bis<cr><lf>",    1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42 DSVD<cr><lf>",       1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 V42bis DSVD<cr><lf>",    1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>",      1, 02, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 NoEC<cr><lf>",      1, 02, 00, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 MNP4<cr><lf>",      1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 MNP5<cr><lf>",      1, 02, 03, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42<cr><lf>",       1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42bis<cr><lf>",    1, 02, 03, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42 DSVD<cr><lf>",       1, 02, 02, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000 V42bis DSVD<cr><lf>",    1, 02, 03, d0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",      1, 02, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 NoEC<cr><lf>",      1, 02, 00, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 MNP4<cr><lf>",      1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 MNP5<cr><lf>",      1, 02, 03, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42<cr><lf>",       1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42bis<cr><lf>",    1, 02, 03, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42 DSVD<cr><lf>",       1, 02, 02, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000 V42bis DSVD<cr><lf>",    1, 02, 03, a0,8c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>",      1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 NoEC<cr><lf>",      1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 MNP4<cr><lf>",      1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 MNP5<cr><lf>",      1, 02, 03, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42<cr><lf>",       1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42bis<cr><lf>",    1, 02, 03, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42 DSVD<cr><lf>",       1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000 V42bis DSVD<cr><lf>",    1, 02, 03, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",      1, 02, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 NoEC<cr><lf>",      1, 02, 00, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 MNP4<cr><lf>",      1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 MNP5<cr><lf>",      1, 02, 03, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42<cr><lf>",       1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42bis<cr><lf>",    1, 02, 03, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42 DSVD<cr><lf>",       1, 02, 02, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000 V42bis DSVD<cr><lf>",    1, 02, 03, 40,9c,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>",      1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 NoEC<cr><lf>",      1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP4<cr><lf>",      1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP5<cr><lf>",      1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42<cr><lf>",       1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42bis<cr><lf>",    1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42 DSVD<cr><lf>",       1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42bis DSVD<cr><lf>",    1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",      1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 NoEC<cr><lf>",      1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP4<cr><lf>",      1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP5<cr><lf>",      1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42<cr><lf>",       1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42bis<cr><lf>",    1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42 DSVD<cr><lf>",       1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42bis DSVD<cr><lf>",    1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>",      1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 NoEC<cr><lf>",      1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP4<cr><lf>",      1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP5<cr><lf>",      1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42<cr><lf>",       1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42bis<cr><lf>",    1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42 DSVD<cr><lf>",       1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42bis DSVD<cr><lf>",    1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",      1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 NoEC<cr><lf>",      1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP4<cr><lf>",      1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP5<cr><lf>",      1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42<cr><lf>",       1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42bis<cr><lf>",    1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42 DSVD<cr><lf>",       1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42bis DSVD<cr><lf>",    1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>",      1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 NoEC<cr><lf>",      1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP4<cr><lf>",      1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP5<cr><lf>",      1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42<cr><lf>",       1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42bis<cr><lf>",    1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42 DSVD<cr><lf>",       1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42bis DSVD<cr><lf>",    1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",      1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 NoEC<cr><lf>",      1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP4<cr><lf>",      1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP5<cr><lf>",      1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42<cr><lf>",       1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42bis<cr><lf>",    1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42 DSVD<cr><lf>",       1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42bis DSVD<cr><lf>",    1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>",      1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 NoEC<cr><lf>",      1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP4<cr><lf>",      1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP5<cr><lf>",      1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42<cr><lf>",       1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42bis<cr><lf>",    1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42 DSVD<cr><lf>",       1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42bis DSVD<cr><lf>",    1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",      1, 02, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 NoEC<cr><lf>",      1, 02, 00, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 MNP4<cr><lf>",      1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 MNP5<cr><lf>",      1, 02, 03, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42<cr><lf>",       1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42bis<cr><lf>",    1, 02, 03, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42 DSVD<cr><lf>",       1, 02, 02, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000 V42bis DSVD<cr><lf>",    1, 02, 03, c0,da,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000<cr><lf>",      1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 NoEC<cr><lf>",      1, 02, 00, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 MNP4<cr><lf>",      1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 MNP5<cr><lf>",      1, 02, 03, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42<cr><lf>",       1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42bis<cr><lf>",    1, 02, 03, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42 DSVD<cr><lf>",       1, 02, 02, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 58000 V42bis DSVD<cr><lf>",    1, 02, 03, 90,e2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>",      1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 NoEC<cr><lf>",      1, 02, 00, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 MNP4<cr><lf>",      1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 MNP5<cr><lf>",      1, 02, 03, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42<cr><lf>",       1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42bis<cr><lf>",    1, 02, 03, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42 DSVD<cr><lf>",       1, 02, 02, 60,ea,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 60000 V42bis DSVD<cr><lf>",    1, 02, 03, 60,ea,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 29333 <cr><lf>",      1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 NoEC<cr><lf>",      1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 MNP4<cr><lf>",      1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 MNP5<cr><lf>",      1, 02, 03, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42<cr><lf>",       1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42bis<cr><lf>",    1, 02, 03, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42 DSVD<cr><lf>",       1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42bis DSVD<cr><lf>",    1, 02, 03, 95,72,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 30666 <cr><lf>",      1, 02, 00, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 NoEC<cr><lf>",      1, 02, 00, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 MNP4<cr><lf>",      1, 02, 02, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 MNP5<cr><lf>",      1, 02, 03, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42<cr><lf>",       1, 02, 02, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42bis<cr><lf>",    1, 02, 03, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42 DSVD<cr><lf>",       1, 02, 02, CA,77,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42bis DSVD<cr><lf>",    1, 02, 03, CA,77,00,00,  00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 33333 <cr><lf>",      1, 02, 00, 35,82,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 NoEC<cr><lf>",      1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 MNP4<cr><lf>",      1, 02, 02, 35,82,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 MNP5<cr><lf>",      1, 02, 03, 35,82,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42<cr><lf>",       1, 02, 02, 35,82,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42bis<cr><lf>",    1, 02, 03, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42 DSVD<cr><lf>",       1, 02, 02, 35,82,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42bis DSVD<cr><lf>",    1, 02, 03, 35,82,00,00,  00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 34666 <cr><lf>",      1, 02, 00, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 NoEC<cr><lf>",      1, 02, 00, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 MNP4<cr><lf>",      1, 02, 02, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 MNP5<cr><lf>",      1, 02, 03, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42<cr><lf>",       1, 02, 02, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42bis<cr><lf>",    1, 02, 03, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42 DSVD<cr><lf>",       1, 02, 02, 6A,87,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42bis DSVD<cr><lf>",    1, 02, 03, 6A,87,00,00,  00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 37333 <cr><lf>",      1, 02, 00, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 NoEC<cr><lf>",      1, 02, 00, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 MNP4<cr><lf>",      1, 02, 02, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 MNP5<cr><lf>",      1, 02, 03, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42<cr><lf>",       1, 02, 02, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42bis<cr><lf>",    1, 02, 03, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42 DSVD<cr><lf>",       1, 02, 02, D5,91,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42bis DSVD<cr><lf>",    1, 02, 03, D5,91,00,00,  00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 38666 <cr><lf>",      1, 02, 00, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 NoEC<cr><lf>",      1, 02, 00, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 MNP4<cr><lf>",      1, 02, 02, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 MNP5<cr><lf>",      1, 02, 03, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42<cr><lf>",       1, 02, 02, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42bis<cr><lf>",    1, 02, 03, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42 DSVD<cr><lf>",       1, 02, 02, 0A,97,00,00,  00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42bis DSVD<cr><lf>",    1, 02, 03, 0A,97,00,00,  00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 41333 <cr><lf>",      1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 NoEC<cr><lf>",      1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 MNP4<cr><lf>",      1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 MNP5<cr><lf>",      1, 02, 03, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42<cr><lf>",       1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42bis<cr><lf>",    1, 02, 03, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42 DSVD<cr><lf>",       1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42bis DSVD<cr><lf>",    1, 02, 03, 75,A1,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 42666 <cr><lf>",      1, 02, 00, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 NoEC<cr><lf>",      1, 02, 00, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 MNP4<cr><lf>",      1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 MNP5<cr><lf>",      1, 02, 03, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42<cr><lf>",       1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42bis<cr><lf>",    1, 02, 03, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42 DSVD<cr><lf>",       1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42bis DSVD<cr><lf>",    1, 02, 03, AA,A6,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 45333 <cr><lf>",      1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 NoEC<cr><lf>",      1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 MNP4<cr><lf>",      1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 MNP5<cr><lf>",      1, 02, 03, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42<cr><lf>",       1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42bis<cr><lf>",    1, 02, 03, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42 DSVD<cr><lf>",       1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42bis DSVD<cr><lf>",    1, 02, 03, 15,B1,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 46666 <cr><lf>",      1, 02, 00, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 NoEC<cr><lf>",      1, 02, 00, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 MNP4<cr><lf>",      1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 MNP5<cr><lf>",      1, 02, 03, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42<cr><lf>",       1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42bis<cr><lf>",    1, 02, 03, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42 DSVD<cr><lf>",       1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42bis DSVD<cr><lf>",    1, 02, 03, 4A,B6,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",      1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 NoEC<cr><lf>",      1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 MNP4<cr><lf>",      1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 MNP5<cr><lf>",      1, 02, 03, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42<cr><lf>",       1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42bis<cr><lf>",    1, 02, 03, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42 DSVD<cr><lf>",       1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42bis DSVD<cr><lf>",    1, 02, 03, B5,C0,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 50666 <cr><lf>",      1, 02, 00, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 NoEC<cr><lf>",      1, 02, 00, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 MNP4<cr><lf>",      1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 MNP5<cr><lf>",      1, 02, 03, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42<cr><lf>",       1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42bis<cr><lf>",    1, 02, 03, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42 DSVD<cr><lf>",       1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42bis DSVD<cr><lf>",    1, 02, 03, EA,C5,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 53333 <cr><lf>",      1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 NoEC<cr><lf>",      1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 MNP4<cr><lf>",      1, 02, 02, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 MNP5<cr><lf>",      1, 02, 03, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42<cr><lf>",       1, 02, 02, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42bis<cr><lf>",    1, 02, 03, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42 DSVD<cr><lf>",       1, 02, 02, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42bis DSVD<cr><lf>",    1, 02, 03, 55,D0,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CONNECT 54666 <cr><lf>",      1, 02, 00, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 NoEC<cr><lf>",      1, 02, 00, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 MNP4<cr><lf>",      1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 MNP5<cr><lf>",      1, 02, 03, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42<cr><lf>",       1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42bis<cr><lf>",    1, 02, 03, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42 DSVD<cr><lf>",       1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42bis DSVD<cr><lf>",    1, 02, 03, 8A,D5,00,00, 00,00,00,00

HKR, Responses, "CONNECT 30667", 				1, 02, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34667", 				1, 02, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38667", 				1, 02, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42667", 	                        1, 02, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46667", 	                        1, 02, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50667", 	                        1, 02, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54667", 	                        1, 02, 00, 8B,D5,00,00, 00,00,00,00

HKR, Responses, "CARRIER 30667", 	                        1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34667", 	                        1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38667", 	                        1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42667", 	                        1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46667", 	                        1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50667", 	                        1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54667", 	                        1, 01, 00, 8B,D5,00,00, 00,00,00,00

[BD256.Verbose]
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>", 1, 02, 00, 58,02,00,00, 00,00,00,00 ; CONNECT 600
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>", 1, 02, 00, 60,09,00,00, 00,00,00,00 ; CONNECT 2400
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>", 1, 02, 00, C0,12,00,00, 00,00,00,00 ; CONNECT 4800
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>", 1, 02, 00, 80,25,00,00, 00,00,00,00 ; CONNECT 9600
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>", 1, 02, 00, 20,1C,00,00, 00,00,00,00 ; CONNECT 7200
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>", 1, 02, 00, E0,2E,00,00, 00,00,00,00 ; CONNECT 12000
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>", 1, 02, 00, 40,38,00,00, 00,00,00,00 ; CONNECT 14400
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>", 1, 02, 00, 00,4B,00,00, 00,00,00,00 ; CONNECT 19200
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>", 1, 02, 00, 00,7D,00,00, 00,00,00,00 ; CONNECT 32000 
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>", 1, 02, 00, D0,84,00,00, 00,00,00,00 ; CONNECT 34000 
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf> ", 1, 02, 00, A0,8C,00,00, 00,00,00,00 ; CONNECT 36000 
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>", 1, 02, 00, 70,94,00,00, 00,00,00,00 ; CONNECT 38000 
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>", 1, 02, 00, 40,9C,00,00, 00,00,00,00 ; CONNECT 40000 
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>", 1, 02, 00, 10,A4,00,00, 00,00,00,00 ; CONNECT 42000 
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>", 1, 02, 00, E0,AB,00,00, 00,00,00,00 ; CONNECT 44000 
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>", 1, 02, 00, B0,B3,00,00, 00,00,00,00 ; CONNECT 46000 
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>", 1, 02, 00, 80,BB,00,00, 00,00,00,00 ; CONNECT 48000 
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>", 1, 02, 00, 50,C3,00,00, 00,00,00,00 ; CONNECT 50000 
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>", 1, 02, 00, 20,CB,00,00, 00,00,00,00 ; CONNECT 52000 
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>", 1, 02, 00, F0,D2,00,00, 00,00,00,00 ; CONNECT 54000 
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>", 1, 02, 00, C0,DA,00,00, 00,00,00,00 ; CONNECT 56000 
HKR, Responses, "<cr><lf>CONNECT 58000<cr><lf>", 1, 02, 00, 90,E2,00,00, 00,00,00,00 ; CONNECT 58000 
HKR, Responses, "<cr><lf>CONNECT 60000<cr><lf>", 1, 02, 00, 60,EA,00,00, 00,00,00,00 ; CONNECT 60000 
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 1, 02, 00, 00,96,00,00, 00,00,00,00 ; CONNECT 38400
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>", 1, 02, 00, 00,E1,00,00, 00,00,00,00 ; CONNECT 57600
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>", 1, 02, 00, 00,C2,01,00, 00,00,00,00 ; CONNECT 115200
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200/75RX
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 75/1200RX 
HKR, Responses, "<cr><lf>DELAYED", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; DELAYED - Blacklisting Action ERROR
HKR, Responses, "<cr><lf>BLACKLISTED", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; BLACLISTED - Blacklisting Action ERROR
HKR, Responses, "<cr><lf>CARRIER 300<cr><lf>", 1, 01, 00, 2C,01,00,00, 00,00,00,00 ; CARRIER 300 - Carrier detected at 300 bps
HKR, Responses, "<cr><lf>CARRIER 1200/75<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 1200/75
HKR, Responses, "<cr><lf>CARRIER 75/1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 75/1200
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 1200
HKR, Responses, "<cr><lf>CARRIER 2400<cr><lf>", 1, 01, 00, 60,09,00,00, 00,00,00,00 ; CARRIER 2400
HKR, Responses, "<cr><lf>CARRIER 4800<cr><lf>", 1, 01, 00, C0,12,00,00, 00,00,00,00 ; CARRIER 4800
HKR, Responses, "<cr><lf>CARRIER 7200<cr><lf>", 1, 01, 00, 20,1C,00,00, 00,00,00,00 ; CARRIER 7200
HKR, Responses, "<cr><lf>CARRIER 9600<cr><lf>", 1, 01, 00, 80,25,00,00, 00,00,00,00 ; CARRIER 9600
HKR, Responses, "<cr><lf>CARRIER 12000<cr><lf>", 1, 01, 00, E0,2E,00,00, 00,00,00,00 ; CARRIER 12000
HKR, Responses, "<cr><lf>CARRIER 14400<cr><lf>", 1, 01, 00, 40,38,00,00, 00,00,00,00 ; CARRIER 14400
HKR, Responses, "<cr><lf>CARRIER 16800<cr><lf>", 1, 01, 00, A0,41,00,00, 00,00,00,00 ; CARRIER 16800
HKR, Responses, "<cr><lf>CARRIER 19200<cr><lf>", 1, 01, 00, 00,4B,00,00, 00,00,00,00 ; CARRIER 19200
HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>", 1, 01, 00, 00,7D,00,00, 00,00,00,00 ; CARRIER 32000 
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>", 1, 01, 00, D0,84,00,00, 00,00,00,00 ; CARRIER 34000 
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf> ", 1, 01, 00, A0,8C,00,00, 00,00,00,00 ; CARRIER 36000 
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>", 1, 01, 00, 70,94,00,00, 00,00,00,00 ; CARRIER 38000 
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>", 1, 01, 00, 40,9C,00,00, 00,00,00,00 ; CARRIER 40000 
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>", 1, 01, 00, 10,A4,00,00, 00,00,00,00 ; CARRIER 42000 
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>", 1, 01, 00, E0,AB,00,00, 00,00,00,00 ; CARRIER 44000 
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>", 1, 01, 00, B0,B3,00,00, 00,00,00,00 ; CARRIER 46000 
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>", 1, 01, 00, 80,BB,00,00, 00,00,00,00 ; CARRIER 48000 
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>", 1, 01, 00, 50,C3,00,00, 00,00,00,00 ; CARRIER 50000 
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>", 1, 01, 00, 20,CB,00,00, 00,00,00,00 ; CARRIER 52000 
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>", 1, 01, 00, F0,D2,00,00, 00,00,00,00 ; CARRIER 54000 
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>", 1, 01, 00, C0,DA,00,00, 00,00,00,00 ; CARRIER 56000 
HKR, Responses, "<cr><lf>CARRIER 58000<cr><lf>", 1, 01, 00, 90,E2,00,00, 00,00,00,00 ; CARRIER 58000 
HKR, Responses, "<cr><lf>CARRIER 60000<cr><lf>", 1, 01, 00, 60,EA,00,00, 00,00,00,00 ; CARRIER 60000 
HKR, Responses, "<cr><lf>CARRIER 21600<cr><lf>", 1, 01, 00, 60,54,00,00, 00,00,00,00 ; CARRIER 21600
HKR, Responses, "<cr><lf>CARRIER 24000<cr><lf>", 1, 01, 00, C0,5D,00,00, 00,00,00,00 ; CARRIER 24000
HKR, Responses, "<cr><lf>CARRIER 26400<cr><lf>", 1, 01, 00, 20,67,00,00, 00,00,00,00 ; CARRIER 26400
HKR, Responses, "<cr><lf>CARRIER 28800<cr><lf>", 1, 01, 00, 80,70,00,00, 00,00,00,00 ; CARRIER 28800
HKR, Responses, "<cr><lf>CARRIER 31200<cr><lf>", 1, 01, 00, E0,79,00,00, 00,00,00,00 ; CARRIER 31200
HKR, Responses, "<cr><lf>CARRIER 33600<cr><lf>", 1, 01, 00, 40,83,00,00, 00,00,00,00 ; CARRIER 33600
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>", 1, 02, 00, A0,41,00,00, 00,00,00,00 ; CONNECT 16800
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>", 1, 02, 00, 60,54,00,00, 00,00,00,00 ; CONNECT 21600
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>", 1, 02, 00, C0,5D,00,00, 00,00,00,00 ; CONNECT 24000
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>", 1, 02, 00, 20,67,00,00, 00,00,00,00 ; CONNECT 26400
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>", 1, 02, 00, 80,70,00,00, 00,00,00,00 ; CONNECT 28800
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>", 1, 02, 00, E0,79,00,00, 00,00,00,00 ; CONNECT 31200
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>", 1, 02, 00, 40,83,00,00, 00,00,00,00 ; CONNECT 33600
HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00 ; COMPRESSION: CLASS 5
HKR, Responses, "<cr><lf>COMPRESSION: V.42bis<cr><lf>", 1, 01, 01, 00,00,00,00, 00,00,00,00 ; COMPRESSION: V.42BIS
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; COMPRESSION: NONE
HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; PROTOCOL: NONE
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: LAPM - V.42
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ALT - Alternative protocol
HKR, Responses, "<cr><lf>PROTOCOL:  ALT - CELLULAR <cr><lf>", 1, 01, 0a, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ALT-CELLULAR
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX Error - Action ERROR

[Modem02.Voice]
HKR,,Enumerator,,serwave.vxd
HKR,, ForwardDelay,             1, 88,13
HKR,  GenerateDigit,            1,, "at+vtd=10<cr>"
HKR,  GenerateDigit,            2,, "at+vts=<Digit><cr>"
HKR,  VoiceToDataAnswer,        1,, "at+fclass=0<cr>"
HKR,  VoiceToDataAnswer,        2,, "ata<cr>"
HKR,  VoiceAnswer,              1,, "at+fclass=8<cr>"
HKR,  VoiceAnswer,              2,, "ata<cr>"
HKR,  VoiceDialNumberSetup,     1,, "at+fclass=8<cr>"
HKR,  VoiceDialNumberSetup,     2,, "at+vls=0<cr>"
HKR,  VoiceDialNumberSetup,     3,, "at+vrn=10<cr>"
HKR,  VoiceDialNumberSetup,     4,, "at+vra=0<cr>"
HKR,, VariableTerminator,,      "<cr><lf>"
HKR,,  AbortPlay,,              "<h10><h03>"
HKR,  StartPlay,                1,, "at+fclass=8<cr>"
HKR,  StartPlay,                2,, "at+vsd=128,0<cr>"
HKR,  StartPlay,                3,, "at+vtx<cr>"
HKR,,  TerminatePlay,,          "<h10><h03>"
HKR,  StopPlay,                 1,, "None"
HKR,  StopPlay,                 2,, "NoResponse"
HKR,  StartRecord,              1,, "at+fclass=8<cr>"
HKR,  StartRecord,              2,, "at+vsd=128,50<cr>"
HKR,  StartRecord,              3,, "at+vrx<cr>"
HKR,,  TerminateRecord,,        "<h10><h21>"
HKR,  StopRecord,               1,, "None"
HKR,  StopRecord,               2,, "NoResponse"
HKR,  LineSetPlayFormat,        1,, "at+fclass=8<cr>"
HKR,  LineSetPlayFormat,        2,, "at+vsm=132<cr>"
HKR,  LineSetRecordFormat,      1,, "at+fclass=8<cr>"
HKR,  LineSetRecordFormat,      2,, "at+vsm=132<cr>"
HKR, WaveDriver, XformModule,  , "umdmxfrm.dll"
HKR, WaveDriver, XformID,     1, 04, 00
HKR, WaveDriver, BaudRate,    1, 00, c2, 01, 00
HKR, WaveDriver, WaveDevices, 1, 01, 00
HKR, WaveDriver, WaveHardwareID, , "LINEARPCMVoiceModemWave"

[CID]
HKR, EnableCallerID, 1,, "at+vcid=1<cr>"
HKR,, CallerIDPrivate,,         "P"
HKR,, CallerIDOutside,,         "O"
HKR,  Responses, "<cr><lf>DATE=", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "TIME=",         1, 94, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "NMBR=",         1, 95, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "NAME=",         1, 96, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "MESG=",         1, 97, 00, 00,00,00,00, 00,00,00,00

[DR]
HKR, EnableDistinctiveRing, 1,, "at+vdr=1,10<cr>"
HKR,  Responses, "DRON=",         1, 91, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "DROF=",         1, 92, 00, 00,00,00,00, 00,00,00,00
HKR,  Responses, "RING<cr><lf>",  1, 08, 00, 00,00,00,00, 00,00,00,00

[Voice.All]
HKR,,FriendlyDriver,,                                           Unimodem.vxd
HKR,,DevLoader,,                                                *vcomm
HKR,,PortSubClass,                                              1,02
HKR,,Enumerator,,                                               serwave.vxd
HKR,,ConfigDialog,,                                             modemui.dll
HKR,,EnumPropPages,,                                            "modemui.dll,EnumPropPages"
HKR, Init,                                                      1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>",                           1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",                        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR,, Enumerator,,                                              serwave.vxd
HKR,, VoiceProfile,                                             1,A1,23,19,02
HKR,, VoiceMixerMid,                                            1,16,00
HKR,, VoiceMixerPid,                                            1,15,00
HKR,, VoiceMixerLineID,                                         1,00,00,04,00
HKR, StartPlay,                                                 1,, "at#vtx<cr>"
HKR, StopPlay,                                                  1,, "None"
HKR, StopPlay,                                                  2,, "NoResponse"
HKR, StartRecord,                                               1,, "at#vrx<cr>"
HKR, StopRecord,                                                1,, "None"
HKR, StopRecord,                                                2,, "NoResponse"
HKR,, TerminateRecord,,                                         "<h10><cr>"
HKR,, TerminatePlay,,                                           "<h10><h03>"
HKR,, AbortPlay,,                                               "<h10><h18>"
HKR, LineSetPlayFormat,                                         1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,                                       1,, "None"
HKR, LineSetRecordFormat,                                       2,, "NoResponse"
HKR, VoiceToDataAnswer,                                         1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer,                                         2,,"ata<cr>"
HKR, VoiceAnswer,                                               1,, "at#cls=8<cr>"
HKR, VoiceAnswer,                                               2,, "at#vls=0<cr>"
HKR, VoiceAnswer,                                               3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,                                               4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,                                               5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                                               6,, "ats30=60<cr>"
HKR, VoiceAnswer,                                               7,, "ata<cr>"
HKR, VoiceDialNumberSetup,                                      1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,                                      2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,                                      3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,                                      4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,                                      5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,                                      6,, "at#vbs=4<cr>"
HKR, VoiceDialNumberSetup,                                      7,, "ats30=60<cr>"
HKR, GenerateDigit,                                             1,, "at#vts=<Digit><cr>"
HKR,, VariableTerminator,,                                      <cr><lf>
HKR,, ForwardDelay,                                             1,88,13
HKR, Responses, "<cr><lf>VCON<cr><lf>",                         1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ",                              1, 93, 00, 00,00,00,00, 00,00,00,00

[Responses.2919]
; RESPONSES VERBOSE
HKR, Responses, "<cr>",                                         1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",                                         1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>",                           1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",                         1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",                   1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",                        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",                  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",                         1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",                    1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",                      1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>",                  1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",                          1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>",                         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>VOICE<cr><lf>",                        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>",                     1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "OK",                                           1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RING",                                         1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO CARRIER",                                   1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "ERROR",                                        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO DIALTONE",                                  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BUSY",                                         1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO ANSWER",                                    1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DELAYED",                                      1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BLACKLISTED",                                  1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "FAX",                                          1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DATA",                                         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "VOICE",                                        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RINGING",                                      1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "+FCERROR",                                     1, 03, 00, 00,00,00,00, 00,00,00,00

; RESPONSES NUMERIC
HKR, Responses, "0<cr>",                                        1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "2<cr>",                                        1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",                                        1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",                                        1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "6<cr>",                                        1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",                                        1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",                                        1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "24<cr>",                                       1, 03, 00, 00,00,00,00, 00,00,00,00 ; DELAYED
HKR, Responses, "32<cr>",                                       1, 03, 00, 00,00,00,00, 00,00,00,00 ; BLACKLISTED
HKR, Responses, "33<cr>",                                       1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX
HKR, Responses, "35<cr>",                                       1, 03, 00, 00,00,00,00, 00,00,00,00 ; DATA
HKR, Responses, "+F4",                                          1, 03, 00, 00,00,00,00, 00,00,00,00 ; +FCERROR

; CONNECT RESPONSES VERBOSE
HKR, Responses, "CONNECT",                                      1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/ARQ",                                  1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300",                                  1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/ARQ",                              1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600",                                 1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/ARQ",                             1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200",                                 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/ARQ",                             1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX",                          1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/ARQ",                      1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX",                          1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/ARQ",                      1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400",                                 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/ARQ",                             1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800",                                 1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/ARQ",                             1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200",                                 1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/ARQ",                             1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600",                                 1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/ARQ",                             1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000",                                1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/ARQ",                            1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400",                                1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/ARQ",                            1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800",                                1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/ARQ",                            1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200",                                1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/ARQ",                            1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600",                                1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/ARQ",                            1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000",                                1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/ARQ",                            1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400",                                1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/ARQ",                            1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800",                                1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/ARQ",                            1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200",                                1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/ARQ",                            1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000",                                1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000/ARQ",                            1, 02, 02, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600",                                1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/ARQ",                            1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000",                                1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000/ARQ",                            1, 02, 02, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000",                                1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000/ARQ",                            1, 02, 02, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000",                                1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000/ARQ",                            1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400",                                1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/ARQ",                            1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000",                                1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000/ARQ",                            1, 02, 02, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000",                                1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000/ARQ",                            1, 02, 02, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000",                                1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000/ARQ",                            1, 02, 02, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000",                                1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000/ARQ",                            1, 02, 02, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000",                                1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000/ARQ",                            1, 02, 02, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000",                                1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000/ARQ",                            1, 02, 02, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000",                                1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000/ARQ",                            1, 02, 02, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000",                                1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000/ARQ",                            1, 02, 02, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000",                                1, 02, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000/ARQ",                            1, 02, 02, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600",                                1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/ARQ",                            1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200",                               1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/ARQ",                           1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 230400",                               1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/ARQ",                           1, 02, 02, 00,84,03,00, 00,00,00,00

; CARRIER RESPONSES VERBOSE
HKR, Responses, "CARRIER 300",                                  1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 300/VFC",                              1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200",                                 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/VFC",                             1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75",                              1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75/VFC",                          1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200",                              1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200/VFC",                          1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400",                                 1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400/VFC",                             1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800",                                 1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800/VFC",                             1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200",                                 1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200/VFC",                             1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600",                                 1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600/VFC",                             1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000",                                1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000/VFC",                            1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400",                                1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400/VFC",                            1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800",                                1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800/VFC",                            1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200",                                1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200/VFC",                            1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600",                                1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600/VFC",                            1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000",                                1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000/VFC",                            1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400",                                1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400/VFC",                            1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800",                                1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800/VFC",                            1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CARRIER 31200",                                1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CARRIER 31200/VFC",                            1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CARRIER 32000",                                1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 32000/VFC",                            1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33600",                                1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33600/VFC",                            1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000",                                1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000/VFC",                            1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000",                                1, 01, 00, 8C,A0,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000/VFC",                            1, 01, 00, 8C,A0,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000",                                1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000/VFC",                            1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000",                                1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000/VFC",                            1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000",                                1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000/VFC",                            1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000",                                1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000/VFC",                            1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000",                                1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000/VFC",                            1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000",                                1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000/VFC",                            1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000",                                1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000/VFC",                            1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000",                                1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000/VFC",                            1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000",                                1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000/VFC",                            1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000",                                1, 01, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000/VFC",                            1, 01, 00, C0,DA,00,00, 00,00,00,00

; COMPRESSION RESPONSES VERBOSE
HKR, Responses, "COMPRESSION: CLASS 5",                         1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 bis",                        1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42bis",                         1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42BIS",                         1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 BIS",                        1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: NONE",                            1, 01, 00, 00,00,00,00, 00,00,00,00

; PROTOCOL RESPONSES VERBOSE
HKR, Responses, "PROTOCOL: NONE",                               1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAPM",                               1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M",                              1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT",                                1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-CELLULAR",                       1, 01, 0A, 00,00,00,00, 00,00,00,00

HKR, K56mode,    						1,,"AT+MS=56,1,32000,56000<cr>"
HKR, V90mode,							1,,"AT+MS=12,1,28000,56000<cr>"

HKR, Responses, "CONNECT 28000", 				1, 02, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 29333", 				1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "CONNECT 30667", 				1, 02, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33333", 				1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34667", 				1, 02, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "CONNECT 37333", 				1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38667", 				1, 02, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "CONNECT 41333", 				1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42667", 	                        1, 02, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "CONNECT 45333", 	                        1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46667", 	                        1, 02, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "CONNECT 49333", 	                        1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50667", 	                        1, 02, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "CONNECT 53333", 	                        1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54667", 	                        1, 02, 00, 8B,D5,00,00, 00,00,00,00

HKR, Responses, "CONNECT 32000", 	                        1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000", 	                        1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000", 	                        1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000", 	                        1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000", 	                        1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000", 	                        1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000", 	                        1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000", 	                        1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000", 	                        1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000", 	                        1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000", 	                        1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000", 	                        1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000", 	                        1, 02, 00, C0,DA,00,00, 00,00,00,00

HKR, Responses, "CARRIER 28000", 	                        1, 01, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 29333", 	                        1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "CARRIER 30667", 	                        1, 01, 00, CB,77,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33333", 	                        1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34667", 	                        1, 01, 00, 6B,87,00,00, 00,00,00,00
HKR, Responses, "CARRIER 37333", 	                        1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38667", 	                        1, 01, 00, 0B,97,00,00, 00,00,00,00
HKR, Responses, "CARRIER 41333", 	                        1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42667", 	                        1, 01, 00, AB,A6,00,00, 00,00,00,00
HKR, Responses, "CARRIER 45333", 	                        1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46667", 	                        1, 01, 00, 4B,B6,00,00, 00,00,00,00
HKR, Responses, "CARRIER 49333", 	                        1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50667", 	                        1, 01, 00, EB,C5,00,00, 00,00,00,00
HKR, Responses, "CARRIER 53333", 	                        1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54667", 	                        1, 01, 00, 8B,D5,00,00, 00,00,00,00

HKR, Responses, "CARRIER 32000", 	                        1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000", 	                        1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000", 	                        1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000", 	                        1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000", 	                        1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000", 	                        1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000", 	                        1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000", 	                        1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000", 	                        1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000", 	                        1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000", 	                        1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000", 	                        1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000", 	                        1, 01, 00, C0,DA,00,00, 00,00,00,00

[Voice.2919_1]
HKR,, Enumerator,,                                              serwave.vxd
;HKR,, VoiceProfile,                                             1,25,23,19,00
HKR,, VoiceMixerMid,                                            1,16,00
HKR,, VoiceMixerPid,                                            1,15,00
HKR,, VoiceMixerLineID,                                         1,00,00,04,00
HKR, StartPlay,                                                 1,, "at#vtx<cr>"
HKR, StopPlay,                                                  1,, "None"
HKR, StopPlay,                                                  2,, "NoResponse"
HKR, StartRecord,                                               1,, "at#vrx<cr>"
HKR, StopRecord,                                                1,, "None"
HKR, StopRecord,                                                2,, "NoResponse"
HKR,, TerminateRecord,,                                         "<h10><cr>"
HKR,, TerminatePlay,,                                           "<h10><h03>"
HKR,, AbortPlay,,                                               "<h10><h18>"
HKR, LineSetPlayFormat,                                         1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,                                       1,, "None"
HKR, LineSetRecordFormat,                                       2,, "NoResponse"
HKR, VoiceToDataAnswer,                                         1,,"at#cls=0<cr>"
HKR, VoiceToDataAnswer,                                         2,,"ata<cr>"
HKR, VoiceAnswer,                                               1,, "at#cls=8<cr>"
HKR, VoiceAnswer,                                               2,, "at#vls=0<cr>"
HKR, VoiceAnswer,                                               3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,                                               4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,                                               5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                                               6,, "ats30=60<cr>"
HKR, VoiceAnswer,                                               7,, "ata<cr>"
HKR, VoiceDialNumberSetup,                                      1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,                                      2,, "at#vls=0<cr>"
HKR, VoiceDialNumberSetup,                                      3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,                                      4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,                                      5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,                                      6,, "at#vbs=4<cr>"
HKR, VoiceDialNumberSetup,                                      7,, "ats30=60<cr>"
HKR, GenerateDigit,                                             1,, "at#vts=<Digit><cr>"
HKR,, VariableTerminator,,                                      <cr><lf>
HKR,, ForwardDelay,                                             1,88,13
HKR, Responses, "<cr><lf>VCON<cr><lf>",                         1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ",                              1, 93, 00, 00,00,00,00, 00,00,00,00

[Voice.2919_2]
HKR,, VoiceProfile,             1,25,23,19,02
HKR, WaveDriver, XformModule,  , "umdmxfrm.dll"
HKR, WaveDriver, XformID,     1, 01, 00
HKR, WaveDriver, BaudRate,    1, 00, c2, 01, 00
HKR, WaveDriver, WaveHardwareID, , "RockWellADPCMVoiceModemWave"

[MicroVoice]
HKR,, VoiceProfile,                                             1,A1,23,19,02
