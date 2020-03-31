xcludeFromSelect=HAYES_M1839
ExcludeFromSelect=SERENUM\HAYF0001
ExcludeFromSelect=HAYES_M1848
ExcludeFromSelect=SERENUM\HAY4703
ExcludeFromSelect=SERENUM\HAY4714
ExcludeFromSelect=ISAPNP\HAY4704
ExcludeFromSelect=ISAPNP\HAY4723

[M18.NTamd64]
%M1811PNP% = M1811, SERENUM\HAYF000
%M1831% = M1831, PCMCIA\HAYES-OPTIMA_288_+_FAX_FOR_PCMCIA_WITH_EZ-4FA5
%M1839% = M1811, HAYES_M1839
%M1848PNP% = M1811, SERENUM\HAYF0001
%M1848%  = M1811, HAYES_M1848
%Modem1% = Modem1, SERENUM\HAY4703
%Modem2% = Modem2, SERENUM\HAY4714
%Modem3% = Modem3, ISAPNP\HAY4704
%Modem4% = Modem4, ISAPNP\HAY4723

[M27.NTamd64]
%M2700% = M2700, PNPC031
%M2701% = M2701, PNPC032

[Modem1]
AddReg = All.56K, MfgAddReg, DataFax.AddReg, VerboseResultCodes.56,External

[Modem2]
AddReg = All.56K, MfgAddReg, DataFax.AddReg, VerboseResultCodes.56,External

[Modem3]
AddReg = All.56K, MfgAddReg, DataFax.AddReg, VerboseResultCodes.56,Internal

[Modem4]
AddReg = All.56K, MfgAddReg, DataFax.AddReg, VerboseResultCodes.56,Internal

[M2700]
AddReg=All, M2700Reg, 19200, SERIAL
DriverVer=03/09/2000

[M2701]
AddReg=All, M2700Reg, PARALLEL
DriverVer=03/09/2000

[M1811]
AddReg=All, Common, M1811Reg, EXTERNAL
DriverVer=03/09/2000

[M1831]
AddReg=All, Common, M1831Reg, PCMCIA
DriverVer=03/09/2000

[MfgAddReg]
HKR, Init, 1,, "AT<cr>" ; do an "AT" to get autobaud correct (start other init strings with 2)
HKR, Init, 2,, "AT &F E0 &C1 &D2 V1 S0=0\V1<cr>"
HKR,, FClass, 1, c3,00,00,00
HKR, Fax, CL1FCS,, "2"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Answer,    1,, "ATA<cr>"
HKR, Hangup,    1,, "ATH E1<cr>"
HKR,, Reset,, "AT&F<cr>"    
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"
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

[5674AddReg]
HKR, Init, 1,, "AT<cr>"                         
HKR, Init, 2,, "AT&F E0 V1 &C1 &D2 S95=47<cr>"  
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
HKR, Settings, ErrorControl_Off,, "&Q6"
HKR, Settings, ErrorControl_On,, "&Q5"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_Off,, "S46=136"
HKR, Settings, Compression_On,, "S46=138"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"

[M5674Reg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 00,FA,00,00
HKR,, DCB,        1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00,00,00,0A,00,0A,00,08,00,00,11,13,00,00,00

[M1811Reg] ; Hayes 28800 Optima
HKR, Init, 2,, "AT&FE0V0W1&C1&D2S95=47<cr>"
HKR,, Properties, 1, c0,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, f7,03,00,00, 00,c2,01,00, 80,70,00,00

[M2700Reg] ; Null-Modem
HKR, Init, 1,, "None"
HKR, Init, 2,, "NoResponse"
HKR, Monitor, 1,, "None"
HKR, Answer, 1,, "CLIENTSERVER"
HKR, Answer, 2,, "NoResponse"
HKR, Settings, DialPrefix,, "CLIENT"
HKR,, Properties, 1, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 30,00,00,00, 00,c2,01,00, 00,c2,01,00
HKR, Responses, "CLIENT",       1, 08, 00, 00, 00, 00, 00, 00,00,00,00 ; Server side - the client is requesting a connection
HKR, Responses, "<h00>CLIENT",  1, 08, 00, 00, 00, 00, 00, 00,00,00,00 ; Server side - the client is requesting a connection
HKR, Responses, "CLIENTSERVER", 1, 02, 00, 00, 00, 00, 00, 00,00,00,00 ; Client side - the server has acknowledged and the connection is completed

[M1831Reg] ; Hayes 28800 Optima PCMCIA - no CCITT/Bell or dial suffix
HKR, Init, 2,, "AT&FE0V0W1&C1&D2S95=47<cr>"
HKR,, Properties, 1, c0,01,00,00, ff,00,00,00, ff,00,00,00, 07,00,00,00, 0f,00,00,00, b7,03,00,00, 00,c2,01,00, 80,70,00,00
HKR, Settings, DialSuffix,, ""

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"

[All.56K]
HKR,,InactivityScale,1,3C,00,00,00
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00


[Common]
; Hayes standard init/monitor/answer mechanisms.  Override if different for a specific modem/manufacture
HKR, Init, 1,, "AT<cr>" ; do an "AT" to get autobaud correct (start other init strings with 2)
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Answer, 1,, "ATA<cr>"
HKR, Hangup, 1,, "ATH<cr>"
HKR,, Reset,, "ATZ<cr>"    ; slam in a reset before closing
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"
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
HKR, Settings, ErrorControl_Off,, "&Q6S36=3S48=128"
HKR, Settings, ErrorControl_On,, "&Q5S36=7S48=7"
HKR, Settings, ErrorControl_Forced,, "&Q5S36=4S48=7"
HKR, Settings, Compression_Off,, "S46=136"
HKR, Settings, Compression_On,, "S46=138"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"

; These are the Hayes responses.
; Differences for non-Hayes modems should be addressed in the specific modem/manufacturer sections
;                             | State
;                                 | Options (Compression, Error-Correction, Cellular)
;                                     | DCE Rate
;                                                  | DTE Rate
; Command Response and Call Progress Monitoring
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "0<cr>",  1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "1<cr>",  1, 02, 00, 2C,01,00,00, 00,00,00,00 ; CONNECT - Connection at 300 bps
HKR, Responses, "2<cr>",  1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",  1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",  1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "5<cr>",  1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200
HKR, Responses, "6<cr>",  1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",  1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",  1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00 ; CONNECT 2400
HKR, Responses, "11<cr>", 1, 02, 00, C0,12,00,00, 00,00,00,00 ; CONNECT 4800
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00 ; CONNECT 9600
HKR, Responses, "13<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00 ; CONNECT 14400
HKR, Responses, "14<cr>", 1, 02, 00, 00,4B,00,00, 00,00,00,00 ; CONNECT 19200
HKR, Responses, "15<cr>", 1, 02, 00, 80,70,00,00, 00,00,00,00 ; CONNECT 28800
HKR, Responses, "16<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; TIMEOUT
HKR, Responses, "17<cr>", 1, 02, 00, C0,DA,00,00, 00,00,00,00 ; CONNECT 56000
HKR, Responses, "18<cr>", 1, 02, 00, 00,E1,00,00, 00,00,00,00 ; CONNECT 57600
HKR, Responses, "19<cr>", 1, 02, 00, 00,FA,00,00, 00,00,00,00 ; CONNECT 64000
HKR, Responses, "20<cr>", 1, 02, 00, 58,02,00,00, 00,00,00,00 ; CONNECT 600/75
HKR, Responses, "21<cr>", 1, 02, 00, 58,02,00,00, 00,00,00,00 ; CONNECT 75/600
HKR, Responses, "22<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 1200/75
HKR, Responses, "23<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00 ; CONNECT 75/1200
HKR, Responses, "24<cr>", 1, 02, 00, 20,1C,00,00, 00,00,00,00 ; CONNECT 7200
HKR, Responses, "25<cr>", 1, 02, 00, E0,2E,00,00, 00,00,00,00 ; CONNECT 12000
HKR, Responses, "26<cr>", 1, 02, 00, A0,41,00,00, 00,00,00,00 ; CONNECT 16800
HKR, Responses, "27<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; CALL WAITING
HKR, Responses, "28<cr>", 1, 02, 00, 00,96,00,00, 00,00,00,00 ; CONNECT 38400
HKR, Responses, "29<cr>", 1, 02, 00, C0,5D,00,00, 00,00,00,00 ; CONNECT 24000
HKR, Responses, "30<cr>", 1, 02, 00, 40,83,00,00, 00,00,00,00 ; CONNECT 33600
HKR, Responses, "31<cr>", 1, 02, 00, 00,C2,01,00, 00,00,00,00 ; CONNECT 115200
HKR, Responses, "32<cr>", 1, 02, 00, 80,BB,00,00, 00,00,00,00 ; CONNECT 48000
HKR, Responses, "33<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; FAX - FAX call detected
HKR, Responses, "34<cr>", 1, 02, 00, 20,67,00,00, 00,00,00,00 ; CONNECT 26400
HKR, Responses, "35<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; DATA - Data call detected
HKR, Responses, "36<cr>", 1, 01, 00, 20,67,00,00, 00,00,00,00 ; CARRIER 26400
HKR, Responses, "37<cr>", 1, 01, 00, C0,5D,00,00, 00,00,00,00 ; CARRIER 24000
HKR, Responses, "38<cr>", 1, 01, 00, 60,54,00,00, 00,00,00,00 ; CARRIER 21600
HKR, Responses, "39<cr>", 1, 01, 00, 80,BB,00,00, 00,00,00,00 ; CARRIER 48000
HKR, Responses, "40<cr>", 1, 01, 00, 2C,01,00,00, 00,00,00,00 ; CARRIER 300
HKR, Responses, "41<cr>", 1, 01, 00, 58,02,00,00, 00,00,00,00 ; CARRIER 600
HKR, Responses, "42<cr>", 1, 01, 00, 58,02,00,00, 00,00,00,00 ; CARRIER 600/75
HKR, Responses, "43<cr>", 1, 01, 00, 58,02,00,00, 00,00,00,00 ; CARRIER 75/600
HKR, Responses, "44<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 1200/75
HKR, Responses, "45<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 75/1200
HKR, Responses, "46<cr>", 1, 01, 00, B0,04,00,00, 00,00,00,00 ; CARRIER 1200
HKR, Responses, "47<cr>", 1, 01, 00, 60,09,00,00, 00,00,00,00 ; CARRIER 2400
HKR, Responses, "48<cr>", 1, 01, 00, C0,12,00,00, 00,00,00,00 ; CARRIER 4800
HKR, Responses, "49<cr>", 1, 01, 00, 20,1C,00,00, 00,00,00,00 ; CARRIER 7200
HKR, Responses, "50<cr>", 1, 01, 00, 80,25,00,00, 00,00,00,00 ; CARRIER 9600
HKR, Responses, "51<cr>", 1, 01, 00, E0,2E,00,00, 00,00,00,00 ; CARRIER 12000
HKR, Responses, "52<cr>", 1, 01, 00, 40,38,00,00, 00,00,00,00 ; CARRIER 14400
HKR, Responses, "53<cr>", 1, 01, 00, A0,41,00,00, 00,00,00,00 ; CARRIER 16800
HKR, Responses, "54<cr>", 1, 01, 00, 00,4B,00,00, 00,00,00,00 ; CARRIER 19200
HKR, Responses, "55<cr>", 1, 01, 00, 80,70,00,00, 00,00,00,00 ; CARRIER 28800
HKR, Responses, "56<cr>", 1, 01, 00, 00,96,00,00, 00,00,00,00 ; CARRIER 38400
HKR, Responses, "57<cr>", 1, 01, 00, C0,DA,00,00, 00,00,00,00 ; CARRIER 56000
HKR, Responses, "58<cr>", 1, 01, 00, 00,E1,00,00, 00,00,00,00 ; CARRIER 57600
HKR, Responses, "59<cr>", 1, 01, 00, 00,FA,00,00, 00,00,00,00 ; CARRIER 64000
HKR, Responses, "60<cr>", 1, 02, 00, 60,54,00,00, 00,00,00,00 ; CONNECT 21600
HKR, Responses, "61<cr>", 1, 02, 00, 40,51,00,00, 00,00,00,00 ; CONNECT 20800
HKR, Responses, "62<cr>", 1, 02, 00, 80,A2,00,00, 00,00,00,00 ; CONNECT 41600
HKR, Responses, "63<cr>", 1, 02, 00, 00,C8,00,00, 00,00,00,00 ; CONNECT 51200
HKR, Responses, "64<cr>", 1, 02, 00, C0,F3,00,00, 00,00,00,00 ; CONNECT 62400
HKR, Responses, "65<cr>", 1, 02, 00, 00,84,03,00, 00,00,00,00 ; CONNECT 230400
HKR, Responses, "66<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00 ; COMPRESSION: CLASS 5
HKR, Responses, "67<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00 ; COMPRESSION: V.42BIS
HKR, Responses, "68<cr>", 1, 01, 01, 00,00,00,00, 00,00,00,00 ; COMPRESSION: ADC
HKR, Responses, "69<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; COMPRESSION: NONE
HKR, Responses, "70<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; PROTOCOL: NONE
HKR, Responses, "71<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ERROR-CONTROL/LAPB
HKR, Responses, "72<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ERROR-CONTROL/LAPB/HDX
HKR, Responses, "73<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ERROR-CONTROL/LAPB/AFT
HKR, Responses, "74<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: X.25/LAPB
HKR, Responses, "75<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: X.25/LAPB/HDX
HKR, Responses, "76<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: X.25/LAPB/AFT
HKR, Responses, "77<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: LAPM
HKR, Responses, "78<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: LAPM/HDX
HKR, Responses, "79<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: LAPM/AFT
HKR, Responses, "80<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ALT
HKR, Responses, "81<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: ISDN
HKR, Responses, "82<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: X.25
HKR, Responses, "83<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: V.120
HKR, Responses, "84<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: T-LINK
HKR, Responses, "85<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: DTMF
HKR, Responses, "86<cr>", 1, 01, 02, 00,00,00,00, 00,00,00,00 ; PROTOCOL: FAX
HKR, Responses, "87<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "88<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "89<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "90<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "91<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; AUTOSTREAM: LEVEL 1
HKR, Responses, "92<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; AUTOSTREAM: LEVEL 2
HKR, Responses, "93<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; AUTOSTREAM: LEVEL 3
HKR, Responses, "94<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; AUTOSTREAM: LEVEL 4
HKR, Responses, "95<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; AUTOSTREAM: LEVEL 5
HKR, Responses, "96<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "97<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "98<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "99<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "101<cr>",1, 02, 00, 00,2C,01,00, 00,00,00,00 ; CONNECT 76800
HKR, Responses, "102<cr>",1, 02, 00, 80,E7,01,00, 00,00,00,00 ; CONNECT 124800
HKR, Responses, "103<cr>",1, 02, 00, 00,58,02,00, 00,00,00,00 ; CONNECT 153600
HKR, Responses, "104<cr>",1, 02, 00, E0,79,00,00, 00,00,00,00 ; CONNECT 31200
HKR, Responses, "105<cr>",1, 01, 00, 00,C2,01,00, 00,00,00,00 ; CARRIER 115200
HKR, Responses, "111<cr>",1, 1d, 00, 00,00,00,00, 00,00,00,00 ; DELAYED
HKR, Responses, "112<cr>",1, 1c, 00, 00,00,00,00, 00,00,00,00 ; BLACKLISTED
HKR, Responses, "119<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: Express
HKR, Responses, "120<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: Bell103
HKR, Responses, "121<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: Bell212
HKR, Responses, "122<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.21
HKR, Responses, "123<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.22
HKR, Responses, "124<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.22bis
HKR, Responses, "125<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.23
HKR, Responses, "126<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.32
HKR, Responses, "127<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.32bis
HKR, Responses, "128<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.FC
HKR, Responses, "129<cr>",1, 01, 00, 00,00,00,00, 00,00,00,00 ; MODULATION: V.34

[VerboseResultCodes.56]
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
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00 ; CONNECT 2400 EC
HKR, Responses, "11<cr>", 1, 02, 00, C0,12,00,00, 00,00,00,00 ; CONNECT 4800 EC
HKR, Responses, "12<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00 ; CONNECT 9600 EC
HKR, Responses, "13<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00 ; CONNECT 14400 EC
HKR, Responses, "14<cr>", 1, 02, 00, 00,4B,00,00, 00,00,00,00 ; CONNECT 19200 EC
HKR, Responses, "18<cr>", 1, 02, 00, 00,E1,00,00, 00,00,00,00 ; CONNECT 57600 EC
HKR, Responses, "24<cr>", 1, 02, 00, 20,1C,00,00, 00,00,00,00 ; CONNECT 7200 EC
HKR, Responses, "25<cr>", 1, 02, 00, E0,2E,00,00, 00,00,00,00 ; CONNECT 12000 EC
HKR, Responses, "28<cr>", 1, 02, 00, 00,96,00,00, 00,00,00,00 ; CONNECT 38400 EC
HKR, Responses, "40<cr>", 1, 02, 00, 01,2c,00,00, 00,00,00,00 ; CONNECT 300 EC
HKR, Responses, "55<cr>", 1, 02, 00, 60,54,00,00, 00,00,00,00 ; CONNECT 21600 EC
HKR, Responses, "56<cr>", 1, 02, 00, C0,5D,00,00, 00,00,00,00 ; CONNECT 24000 EC
HKR, Responses, "57<cr>", 1, 02, 00, 20,67,00,00, 00,00,00,00 ; CONNECT 26400 EC
HKR, Responses, "58<cr>", 1, 02, 00, 80,70,00,00, 00,00,00,00 ; CONNECT 28800 EC
HKR, Responses, "59<cr>", 1, 02, 00, e0,79,00,00, 00,00,00,00 ; CONNECT 31200 EC
HKR, Responses, "60<cr>", 1, 02, 00, 40,83,00,00, 00,00,00,00 ; CONNECT 33600 EC
HKR, Responses, "70<cr>", 1, 02, 00, 00,7d,00,00, 00,00,00,00 ; CONNECT 32000 EC
HKR, Responses, "71<cr>", 1, 02, 00, d0,84,00,00, 00,00,00,00 ; CONNECT 34000 EC
HKR, Responses, "72<cr>", 1, 02, 00, a0,8c,00,00, 00,00,00,00 ; CONNECT 36000 EC
HKR, Responses, "73<cr>", 1, 02, 00, 70,94,00,00, 00,00,00,00 ; CONNECT 38000 EC
HKR, Responses, "74<cr>", 1, 02, 00, 40,9c,00,00, 00,00,00,00 ; CONNECT 40000 EC
HKR, Responses, "75<cr>", 1, 02, 00, 10,a4,00,00, 00,00,00,00 ; CONNECT 42000 EC
HKR, Responses, "76<cr>", 1, 02, 00, e0,ab,00,00, 00,00,00,00 ; CONNECT 44000 EC
HKR, Responses, "77<cr>", 1, 02, 00, b0,b3,00,00, 00,00,00,00 ; CONNECT 46000 EC
HKR, Responses, "78<cr>", 1, 02, 00, 80,bb,00,00, 00,00,00,00 ; CONNECT 48000 EC
HKR, Responses, "79<cr>", 1, 02, 00, 50,c3,00,00, 00,00,00,00 ; CONNECT 50000 EC
HKR, Responses, "80<cr>", 1, 02, 00, 20,cb,00,00, 00,00,00,00 ; CONNECT 52000 EC
HKR, Responses, "81<cr>", 1, 02, 00, f0,d2,00,00, 00,00,00,00 ; CONNECT 54000 EC
HKR, Responses, "82<cr>", 1, 02, 00, c0,da,00,00, 00,00,00,00 ; CONNECT 56000 EC 
HKR, Responses, "83<cr>", 1, 02, 00, 90,e2,00,00, 00,00,00,00 ; CONNECT 58000 EC
HKR, Responses, "84<cr>", 1, 02, 00, 60,ea,00,00, 00,00,00,00 ; CONNECT 60000 EC 
HKR, Responses, "86<cr>", 1, 02, 00, a0,41,00,00, 00,00,00,00 ; CONNECT 16800 EC
HKR, Responses, "87<cr>", 1, 02, 00, 00,C2,01,00, 00,00,00,00 ; CONNECT 115200 EC
HKR, Responses, "88<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; DELAYED     
HKR, Responses, "89<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; BLACKLISTED
HKR, Responses, "90<cr>", 1, 03, 00, 00,00,00,00, 00,00,00,00 ; BLACKLIST FULL
HKR, Responses, "100<cr>", 1, 02, 00, 95,72,00,00, 00,00,00,00 ; CONNECT 28000 EC
HKR, Responses, "101<cr>", 1, 02, 00, 95,72,00,00, 00,00,00,00 ; CONNECT 29333 EC
HKR, Responses, "102<cr>", 1, 02, 00, CA,77,00,00, 00,00,00,00 ; CONNECT 30666 EC
HKR, Responses, "103<cr>", 1, 02, 00, 35,82,00,00, 00,00,00,00 ; CONNECT 33333 EC
HKR, Responses, "104<cr>", 1, 02, 00, 6A,87,00,00, 00,00,00,00 ; CONNECT 34666 EC
HKR, Responses, "105<cr>", 1, 02, 00, D5,91,00,00, 00,00,00,00 ; CONNECT 37333 EC
HKR, Responses, "106<cr>", 1, 02, 00, 0A,97,00,00, 00,00,00,00 ; CONNECT 38666 EC
HKR, Responses, "107<cr>", 1, 02, 00, 75,A1,00,00, 00,00,00,00 ; CONNECT 41333 EC
HKR, Responses, "108<cr>", 1, 02, 00, AA,A6,00,00, 00,00,00,00 ; CONNECT 42666 EC
HKR, Responses, "109<cr>", 1, 02, 00, 15,B1,00,00, 00,00,00,00 ; CONNECT 45333 EC
HKR, Responses, "110<cr>", 1, 02, 00, 4A,B6,00,00, 00,00,00,00 ; CONNECT 46666 EC
HKR, Responses, "111<cr>", 1, 02, 00, B5,C0,00,00, 00,00,00,00 ; CONNECT 49333 EC
HKR, Responses, "112<cr>", 1, 02, 00, EA,C5,00,00, 00,00,00,00 ; CONNECT 50666 EC
HKR, Responses, "113<cr>", 1, 02, 00, 55,D0,00,00, 00,00,00,00 ; CONNECT 53333 EC
HKR, Responses, "114<cr>", 1, 02, 00, 8A,D5,00,00, 00,00,00,00 ; CONNECT 54666 EC

HKR, Responses, "<cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",  1, 07, 00, 00,00,00,00, 00,00,00,00
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
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",      1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 NoEC<cr><lf>",      1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 MNP4<cr><lf>",      1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 MNP5<cr><lf>",      1, 02, 03, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42<cr><lf>",       1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42bis<cr><lf>",    1, 02, 03, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42 DSVD<cr><lf>",       1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333 V42bis DSVD<cr><lf>",    1, 02, 03, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666<cr><lf>",      1, 02, 00, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 NoEC<cr><lf>",      1, 02, 00, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 MNP4<cr><lf>",      1, 02, 02, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 MNP5<cr><lf>",      1, 02, 03, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42<cr><lf>",       1, 02, 02, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42bis<cr><lf>",    1, 02, 03, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42 DSVD<cr><lf>",       1, 02, 02, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666 V42bis DSVD<cr><lf>",    1, 02, 03, CA,77,00,00, 00,00,00,00
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
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",      1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 NoEC<cr><lf>",      1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 MNP4<cr><lf>",      1, 02, 02, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 MNP5<cr><lf>",      1, 02, 03, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42<cr><lf>",       1, 02, 02, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42bis<cr><lf>",    1, 02, 03, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42 DSVD<cr><lf>",       1, 02, 02, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333 V42bis DSVD<cr><lf>",    1, 02, 03, 35,82,00,00, 00,00,00,00
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
HKR, Responses, "<cr><lf>CONNECT 34666<cr><lf>",      1, 02, 00, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 NoEC<cr><lf>",      1, 02, 00, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 MNP4<cr><lf>",      1, 02, 02, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 MNP5<cr><lf>",      1, 02, 03, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42<cr><lf>",       1, 02, 02, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42bis<cr><lf>",    1, 02, 03, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42 DSVD<cr><lf>",       1, 02, 02, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666 V42bis DSVD<cr><lf>",    1, 02, 03, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",      1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 NoEC<cr><lf>",      1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 MNP4<cr><lf>",      1, 02, 02, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 MNP5<cr><lf>",      1, 02, 03, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42<cr><lf>",       1, 02, 02, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42bis<cr><lf>",    1, 02, 03, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42 DSVD<cr><lf>",       1, 02, 02, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333 V42bis DSVD<cr><lf>",    1, 02, 03, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 NoEC<cr><lf>",      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP4<cr><lf>",      1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 MNP5<cr><lf>",      1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis<cr><lf>",    1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42 DSVD<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 V42bis DSVD<cr><lf>",    1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666<cr><lf>",      1, 02, 00, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 NoEC<cr><lf>",      1, 02, 00, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 MNP4<cr><lf>",      1, 02, 02, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 MNP5<cr><lf>",      1, 02, 03, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42<cr><lf>",       1, 02, 02, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42bis<cr><lf>",    1, 02, 03, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42 Cellular Protocol<cr><lf>",    1, 02, 0b, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42 DSVD<cr><lf>",       1, 02, 02, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666 V42bis DSVD<cr><lf>",    1, 02, 03, 0A,97,00,00, 00,00,00,00
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
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",      1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 NoEC<cr><lf>",      1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 MNP4<cr><lf>",      1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 MNP5<cr><lf>",      1, 02, 03, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42<cr><lf>",       1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42bis<cr><lf>",    1, 02, 03, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42 DSVD<cr><lf>",       1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333 V42bis DSVD<cr><lf>",    1, 02, 03, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>",      1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 NoEC<cr><lf>",      1, 02, 00, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP4<cr><lf>",      1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 MNP5<cr><lf>",      1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42<cr><lf>",       1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42bis<cr><lf>",    1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42 DSVD<cr><lf>",       1, 02, 02, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000 V42bis DSVD<cr><lf>",    1, 02, 03, 10,a4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666<cr><lf>",      1, 02, 00, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 NoEC<cr><lf>",      1, 02, 00, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 MNP4<cr><lf>",      1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 MNP5<cr><lf>",      1, 02, 03, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42<cr><lf>",       1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42bis<cr><lf>",    1, 02, 03, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42 DSVD<cr><lf>",       1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666 V42bis DSVD<cr><lf>",    1, 02, 03, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",      1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 NoEC<cr><lf>",      1, 02, 00, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP4<cr><lf>",      1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 MNP5<cr><lf>",      1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42<cr><lf>",       1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42bis<cr><lf>",    1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42 DSVD<cr><lf>",       1, 02, 02, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000 V42bis DSVD<cr><lf>",    1, 02, 03, e0,ab,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",      1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 NoEC<cr><lf>",      1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 MNP4<cr><lf>",      1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 MNP5<cr><lf>",      1, 02, 03, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42<cr><lf>",       1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42bis<cr><lf>",    1, 02, 03, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42 DSVD<cr><lf>",       1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333 V42bis DSVD<cr><lf>",    1, 02, 03, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>",      1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 NoEC<cr><lf>",      1, 02, 00, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP4<cr><lf>",      1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 MNP5<cr><lf>",      1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42<cr><lf>",       1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42bis<cr><lf>",    1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42 DSVD<cr><lf>",       1, 02, 02, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000 V42bis DSVD<cr><lf>",    1, 02, 03, b0,b3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666<cr><lf>",      1, 02, 00, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 NoEC<cr><lf>",      1, 02, 00, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 MNP4<cr><lf>",      1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 MNP5<cr><lf>",      1, 02, 03, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42<cr><lf>",       1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42bis<cr><lf>",    1, 02, 03, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42 DSVD<cr><lf>",       1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666 V42bis DSVD<cr><lf>",    1, 02, 03, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",      1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 NoEC<cr><lf>",      1, 02, 00, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP4<cr><lf>",      1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 MNP5<cr><lf>",      1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42<cr><lf>",       1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42bis<cr><lf>",    1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42 DSVD<cr><lf>",       1, 02, 02, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000 V42bis DSVD<cr><lf>",    1, 02, 03, 80,bb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",      1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 NoEC<cr><lf>",      1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 MNP4<cr><lf>",      1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 MNP5<cr><lf>",      1, 02, 03, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42<cr><lf>",       1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42bis<cr><lf>",    1, 02, 03, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42 DSVD<cr><lf>",       1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333 V42bis DSVD<cr><lf>",    1, 02, 03, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>",      1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 NoEC<cr><lf>",      1, 02, 00, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP4<cr><lf>",      1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 MNP5<cr><lf>",      1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42<cr><lf>",       1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42bis<cr><lf>",    1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42 DSVD<cr><lf>",       1, 02, 02, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000 V42bis DSVD<cr><lf>",    1, 02, 03, 50,c3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666<cr><lf>",      1, 02, 00, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 NoEC<cr><lf>",      1, 02, 00, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 MNP4<cr><lf>",      1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 MNP5<cr><lf>",      1, 02, 03, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42<cr><lf>",       1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42bis<cr><lf>",    1, 02, 03, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42 DSVD<cr><lf>",       1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666 V42bis DSVD<cr><lf>",    1, 02, 03, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",      1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 NoEC<cr><lf>",      1, 02, 00, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP4<cr><lf>",      1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 MNP5<cr><lf>",      1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42<cr><lf>",       1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42bis<cr><lf>",    1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42 DSVD<cr><lf>",       1, 02, 02, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000 V42bis DSVD<cr><lf>",    1, 02, 03, 20,cb,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",      1, 02, 00, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 NoEC<cr><lf>",      1, 02, 00, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 MNP4<cr><lf>",      1, 02, 02, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 MNP5<cr><lf>",      1, 02, 03, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42<cr><lf>",       1, 02, 02, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42bis<cr><lf>",    1, 02, 03, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42 DSVD<cr><lf>",       1, 02, 02, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333 V42bis DSVD<cr><lf>",    1, 02, 03, 55,d0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>",      1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 NoEC<cr><lf>",      1, 02, 00, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP4<cr><lf>",      1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 MNP5<cr><lf>",      1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42<cr><lf>",       1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42bis<cr><lf>",    1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42 DSVD<cr><lf>",       1, 02, 02, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000 V42bis DSVD<cr><lf>",    1, 02, 03, f0,d2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666<cr><lf>",      1, 02, 00, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 NoEC<cr><lf>",      1, 02, 00, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 MNP4<cr><lf>",      1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 MNP5<cr><lf>",      1, 02, 03, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42<cr><lf>",       1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42bis<cr><lf>",    1, 02, 03, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42 Cellular Protocol<cr><lf>",    1, 02, 0a, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42bis Cellular Protocol<cr><lf>",    1, 02, 0b, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42 DSVD<cr><lf>",       1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666 V42bis DSVD<cr><lf>",    1, 02, 03, 8A,D5,00,00, 00,00,00,00
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

[DataFax.AddReg]                                
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 00,FA,00,00
HKR,, DCB,        1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00,00,00,0A,00,0A,00,08,00,00,11,13,00,00,00

[EXTERNAL]
HKR,, DeviceType, 1, 01

[INTERNAL]
HKR,, DeviceType, 1, 02

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[19200]
HKR,, DCB, 1, 1C,00,00,00, 00,4B,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

; DeviceTypes
[SERIAL]
HKR,, DeviceType, 1, 00

[PARALLEL]
HKR,, DeviceType, 1, 04
HKR,,Override,,Paralink.vxd
HKR,, DCB, 1, 1C,00,00,00, 00,00,06,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

;;; DCB's - dwords and words are byte reversed
;;;                                                                           ByteSize (Number of bits/byte, 4-8)
;;;                                                                               Parity (0-4=None,Odd,Even,Mark,Space)
;;;                                                                                   StopBits (0,1,2 = 1, 1.5, 2)
;;;              |DCBLength   |BaudRate    |Bit Mask    |Rsvd  |XonLim|XofLim|   |   |   |Xon|Xof|Err|Eof|Evt
;;[9600]
;;HKR,, DCB, 1, 1C,00,00,00, 80,25,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00


[Strings]
MSFT = "Microsoft"

M18 = "Hayes"
M1811PNP = "Hayes 288 V.34 + FAX"
M1831 = "Hayes Optima 288 V.34 + FAX PCMCIA"
M1839 = "Hayes Optima 288 V.34 + FAX + Voice"
M1848PNP = "Hayes Optima 288 V.34 + FAX + Voice Plug & Play"
M1848 = "Hayes Optima 288 V.34 + FAX + Voice"
M27 = "(Standard Modem Types)"
M2700 = "Communications cable between two computers"
M2701 = "Parallel cable between two computers"
Modem1="Hayes Accura 56K Ext Fax Modem 4703US"
Modem2="Hayes Accura 336 Flash + Fax 4714US"
Modem3="Hayes Accura 56K Int Fax Modem 4704US"
Modem4="Hayes Accura 336 Flash Int + Fax 4723US"

