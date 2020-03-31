

[Modem1]
include=mdmgl004.inf
AddReg=All, MfgAddReg, RockVoice_ACFSP, Practical.Generic, Modem1.AddReg, Verbose.Responses, INTERNAL, MDMGL004.ExtraCID
DriverVer=03/09/2000

[modem52]
AddReg=All, MfgAddReg, Practical.Generic, Modem52.AddReg, Verbose.Responses, INTERNAL
DriverVer=03/09/2000

[Modem52.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, FF,00,00,00, 07,00,00,00, 0F,00,00,00, F7,03,00,00, 00,C2,01,00, 00,FA,00,00
HKR,, InactivityScale, 1, 01,00,00,00
HKR, Settings, SpeakerVolume_Low,, "L1"

[Strings]
MSFT="Microsoft"
Practical = "Practical Peripherals"
Modem52="Practical Peripherals PM K56 Flex HC PnP"     ;//WHQL
Modem1="Practical Peripherals PM336 INT Voice PnP"     ;//WHQL

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"

[MfgAddReg]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT &F<cr>"
HKR, Init, 3,, "AT E0 V0 &D2 &C1 V0 \V1 S0=0<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "AT&F<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ""
HKR, Settings, SpeakerVolume_Low,, "L0"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, FlowControl_Off,, "\Q0"
HKR, Settings, FlowControl_Hard,, "\Q1"
HKR, Settings, FlowControl_Soft,, "\Q3"
HKR, Settings, ErrorControl_On,, "\E1\P2\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\E1\P2\N2"
HKR, Settings, Compression_On,, "\M0"
HKR, Settings, Compression_Off,, "\M1\C4"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "\T<#>"

HKR, Responses, "<cr><lf>OK<cr><lf>",    1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",  1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",  1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "2<cr>",  1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",  1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "5<cr>",  1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "6<cr>",  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",  1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",  1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "9<cr>",  1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "10<cr>", 1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "11<cr>", 1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "12<cr>", 1, 02, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "13<cr>", 1, 02, 00, E0,2e,00,00, 00,00,00,00
HKR, Responses, "14<cr>", 1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "15<cr>", 1, 02, 00, C0,12,00,00, 00,00,00,00 ; connect 4800
HKR, Responses, "18<cr>", 1, 02, 00, 80,25,00,00, 00,00,00,00 ; CONNECT 9600
HKR, Responses, "21<cr>", 1, 02, 00, A0,41,00,00, 00,00,00,00 ; CONNECT 16800 - Connection at 16800 bps
HKR, Responses, "22<cr>", 1, 02, 00, 00,4B,00,00, 00,00,00,00 ; CONNECT 19200 - Connection at 19200 bps
HKR, Responses, "72<cr>", 1, 01, 00, 00,00,00,00, 00,00,00,00 ; dialing
;P3428
HKR, Responses, "73<cr>", 1, 02, 00, 60,54,00,00, 00,00,00,00 ; CONNECT 21600 - Connection at 19200 bps
HKR, Responses, "74<cr>", 1, 02, 00, C0,5d,00,00, 00,00,00,00 ; CONNECT 24000 - Connection at 19200 bps
HKR, Responses, "75<cr>", 1, 02, 00, 20,67,00,00, 00,00,00,00 ; CONNECT 26400 - Connection at 19200 bps
HKR, Responses, "76<cr>", 1, 02, 00, 80,70,00,00, 00,00,00,00 ; CONNECT 28800 - Connection at 19200 bps
HKR, Responses, "90<cr>", 1, 02, 00, e0,79,00,00, 00,00,00,00 ; CONNECT 31200 - Connection at 19200 bps
HKR, Responses, "91<cr>", 1, 02, 00, 40,83,00,00, 00,00,00,00 ; CONNECT 33600 - Connection at 19200 bps
; buffered mode and DTE/carrier responses
HKR, Responses, "28<cr>", 1, 01, 00, 00,4b,00,00, 00,00,00,00  ; 19.2
HKR, Responses, "29<cr>", 1, 01, 00, 00,25,00,00, 00,00,00,00  ; 9600
HKR, Responses, "30<cr>", 1, 01, 00, 00,12,00,00, 00,00,00,00  ; 4800
HKR, Responses, "31<cr>", 1, 01, 00, 00,09,00,00, 00,00,00,00  ; 2400
HKR, Responses, "32<cr>", 1, 01, 00, 00,04,00,00, 00,00,00,00  ; 1200
HKR, Responses, "33<cr>", 1, 01, 00, 00,02,00,00, 00,00,00,00  ; 600
HKR, Responses, "34<cr>", 1, 01, 00, 00,01,00,00, 00,00,00,00  ; 300
HKR, Responses, "53<cr>", 1, 01, 00, 00,96,00,00, 00,00,00,00  ; 38.4
HKR, Responses, "64<cr>", 1, 01, 00, 00,E1,00,00, 00,00,00,00  ; 57.6
HKR, Responses, "77<cr>", 1, 01, 00, 00,C2,01,00, 00,00,00,00  ; 115.2
;P3428
HKR, Responses, "82<cr>", 1, 01, 00, 00,84,03,00, 00,00,00,00  ; 230.4
; MNP mode and DTE/carrier response
HKR, Responses, "36<cr>", 1, 01, 02, 00,4b,00,00, 00,00,00,00  ; 19.2
HKR, Responses, "37<cr>", 1, 01, 02, 00,25,00,00, 00,00,00,00  ; 9600
HKR, Responses, "38<cr>", 1, 01, 02, 00,12,00,00, 00,00,00,00  ; 4800
HKR, Responses, "39<cr>", 1, 01, 02, 00,09,00,00, 00,00,00,00  ; 2400
HKR, Responses, "40<cr>", 1, 01, 02, 00,04,00,00, 00,00,00,00  ; 1200
HKR, Responses, "41<cr>", 1, 01, 02, 00,02,00,00, 00,00,00,00  ; 600
HKR, Responses, "42<cr>", 1, 01, 02, 00,01,00,00, 00,00,00,00  ; 300
HKR, Responses, "54<cr>", 1, 01, 02, 00,96,00,00, 00,00,00,00  ; 38.4
HKR, Responses, "65<cr>", 1, 01, 02, 00,E1,00,00, 00,00,00,00  ; 57.6
HKR, Responses, "78<cr>", 1, 01, 02, 00,C2,01,00, 00,00,00,00  ; 115.2
;P3428
HKR, Responses, "83<cr>", 1, 01, 02, 00,84,03,00, 00,00,00,00  ; 230.4
; V42 mode and DTE/carrier response
HKR, Responses, "44<cr>", 1, 01, 02, 00,4b,00,00, 00,00,00,00  ; 19.2
HKR, Responses, "45<cr>", 1, 01, 02, 00,25,00,00, 00,00,00,00  ; 9600
HKR, Responses, "46<cr>", 1, 01, 02, 00,12,00,00, 00,00,00,00  ; 4800
HKR, Responses, "47<cr>", 1, 01, 02, 00,09,00,00, 00,00,00,00  ; 2400
HKR, Responses, "48<cr>", 1, 01, 02, 00,04,00,00, 00,00,00,00  ; 1200
HKR, Responses, "49<cr>", 1, 01, 02, 00,02,00,00, 00,00,00,00  ; 600
HKR, Responses, "50<cr>", 1, 01, 02, 00,01,00,00, 00,00,00,00  ; 300
HKR, Responses, "52<cr>", 1, 01, 02, 00,96,00,00, 00,00,00,00  ; 38.4
HKR, Responses, "66<cr>", 1, 01, 02, 00,E1,00,00, 00,00,00,00  ; 57.6
HKR, Responses, "79<cr>", 1, 01, 02, 00,C2,01,00, 00,00,00,00  ; 115.2
;P3428
HKR, Responses, "84<cr>", 1, 01, 02, 00,84,03,00, 00,00,00,00  ; 230.4
; V42bis mode and DTE/carrier response
HKR, Responses, "55<cr>", 1, 01, 03, 00,96,00,00, 00,00,00,00  ; 38.4
HKR, Responses, "56<cr>", 1, 01, 03, 00,4b,00,00, 00,00,00,00  ; 19.2
HKR, Responses, "57<cr>", 1, 01, 03, 00,25,00,00, 00,00,00,00  ; 9600
HKR, Responses, "58<cr>", 1, 01, 03, 00,12,00,00, 00,00,00,00  ; 4800
HKR, Responses, "59<cr>", 1, 01, 03, 00,09,00,00, 00,00,00,00  ; 2400
HKR, Responses, "60<cr>", 1, 01, 03, 00,04,00,00, 00,00,00,00  ; 1200
HKR, Responses, "61<cr>", 1, 01, 03, 00,02,00,00, 00,00,00,00  ; 600
HKR, Responses, "62<cr>", 1, 01, 03, 00,01,00,00, 00,00,00,00  ; 300
HKR, Responses, "67<cr>", 1, 01, 03, 00,E1,00,00, 00,00,00,00  ; 57.6
HKR, Responses, "80<cr>", 1, 01, 03, 00,C2,01,00, 00,00,00,00  ; 115.2
;P3428
HKR, Responses, "85<cr>", 1, 01, 03, 00,84,03,00, 00,00,00,00  ; 230.4

[EXTERNAL]
HKR,, DeviceType, 1, 01

[Practical.Generic]
HKR,, DCB,        1, 1C,00,00,00, 00,C2,01,00, 15,20,00,00,00,00,0A,00,0A,00,08,00,00,11,13,00,00,00
HKR, Init, 2,, "AT&F E0 V1 &C1 &D2<cr>"
HKR, Init, 3,, "AT S95=47 S0=0<cr>"
HKR, Settings, InactivityTimeout,, "S30=<#>"
HKR, Settings, FlowControl_Off,, "&K0"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_Off,, "&Q6"
HKR, Settings, ErrorControl_On,, "&Q5"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_Off,, "S46=136"
HKR, Settings, Compression_On,, "S46=138"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, DialSuffix,, ";"

[Verbose.Responses]
HKR, Responses, "<cr>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "OK",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RING",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO CARRIER",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "ERROR",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO DIALTONE", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO DIAL TONE",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BUSY",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO ANSWER",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "FAX",         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DATA",        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "VOICE",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RINGING",     1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DELAYED",     1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BLACKLISTED", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "+FCERROR",    1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/ARQ",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/REL",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/MNP",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/LAP-M",           1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/V42BIS",          1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/V42b",            1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300",             1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/ARQ",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-MNP",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-MNP 5",         1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-LAPM",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-LAPM V.42 BIS",         1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/MNP",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/LAP-M",       1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/V42BIS",      1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/V42b",        1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600",             1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/ARQ",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-MNP",           1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-MNP 5",         1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-LAPM",          1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL-LAPM V.42 BIS", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/MNP",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/LAP-M",       1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/V42BIS",      1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/V42b",        1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600",            1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/ARQ",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/REL",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/MNP",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/LAP-M",      1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/V42BIS",     1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 0600/V42b",       1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200",            1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/ARQ",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-MNP",           1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-MNP 5",         1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-LAPM",          1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-LAPM V.42 BIS", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/MNP",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/LAP-M",      1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/V42BIS",     1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/V42b",       1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75",         1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75/ARQ",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75/REL",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75/MNP",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75/LAP-M",   1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75/V42BIS",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/75/V42b",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/ARQ", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/REL", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/MNP", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/LAP-M", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/V42BIS",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX/V42b",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200",         1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200/ARQ",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200/REL",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200/MNP",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200/LAP-M",   1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200/V42BIS",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75/1200/V42b",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/ARQ", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/REL", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/MNP", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/LAP-M", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/V42BIS",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX/V42b",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400",            1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/ARQ",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-MNP",           1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-MNP 5",         1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-LAPM",          1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-LAPM V.42 BIS", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/MNP",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/LAP-M",      1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/V42BIS",     1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/V42b",       1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800",            1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/ARQ",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-MNP",           1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-MNP 5",         1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-LAPM",          1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-LAPM V.42 BIS", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/MNP",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/LAP-M",      1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/V42BIS",     1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/V42b",       1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200",            1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/ARQ",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-MNP",           1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-MNP 5",         1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-LAPM",          1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-LAPM V.42 BIS", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/MNP",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/LAP-M",      1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/V42BIS",     1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/V42b",       1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600",            1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/ARQ",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-MNP",           1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-MNP 5",         1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-LAPM",          1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-LAPM V.42 BIS", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/MNP",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/LAP-M",      1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/V42BIS",     1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/V42b",       1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000",           1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/ARQ",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-MNP",           1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-MNP 5",         1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-LAPM",          1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-LAPM V.42 BIS", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/MNP",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/LAP-M",     1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/V42BIS",    1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/V42b",      1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400",           1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/ARQ",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-MNP",           1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-MNP 5",         1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-LAPM",          1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-LAPM V.42 BIS", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/MNP",      1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/LAP-M",    1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/V42BIS",   1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/V42b",     1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800",          1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/ARQ",      1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/REL",      1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/MNP",      1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/LAP-M",    1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/V42BIS",   1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/V42b",     1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200",          1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/ARQ",      1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/REL",      1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/MNP",      1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/LAP-M",    1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/V42BIS",   1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/V42b",     1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600",          1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/ARQ",      1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/REL",      1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/MNP",      1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/LAP-M",    1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/V42BIS",   1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/V42b",     1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000",          1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/ARQ",      1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/REL",      1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/MNP",      1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/LAP-M",    1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/V42BIS",   1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/V42b",     1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400",          1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/ARQ",      1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/REL",      1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/MNP",      1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/LAP-M",    1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/V42BIS",   1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/V42b",     1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800",          1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/ARQ",      1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/REL",      1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/MNP",      1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/LAP-M",    1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/V42BIS",   1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/V42b",     1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400",          1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/ARQ",      1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/REL",      1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/MNP",      1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/LAP-M",    1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/V42BIS",   1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/V42b",     1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600",          1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/ARQ",      1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/REL",      1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/MNP",      1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/LAP-M",    1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/V42BIS",   1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/V42b",     1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200",         1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/ARQ",     1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/REL",     1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/MNP",     1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/LAP-M",   1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/V42BIS",  1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/V42b",    1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200",        1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/ARQ",    1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/REL",    1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/MNP",    1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/LAP-M",  1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/V42BIS", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/V42b",   1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CARRIER 300",     1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200",    1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400",    1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800",    1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200",    1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600",    1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000",   1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800",   1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200",   1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000",   1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CARRIER 300/VFC",     1, 01, 00, 2c,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/VFC",    1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75/VFC", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200/VFC", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400/VFC",    1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800/VFC",    1, 01, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200/VFC",    1, 01, 00, 20,1c,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600/VFC",    1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000/VFC",   1, 01, 00, e0,2e,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400/VFC",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800/VFC",   1, 01, 00, a0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200/VFC",   1, 01, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600/VFC",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000/VFC",   1, 01, 00, c0,5d,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400/VFC",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800/VFC",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: CLASS5",   1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: MNP5",     1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V42BIS",   1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42BIS",  1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: ADC",      1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: NONE",     1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: NONE",  1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAPM",  1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT",   1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP",   1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP2",  1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP3",  1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP4",  1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/V42",     1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/V42",    1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/V42",    1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/V42",    1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/V42",    1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/V42",    1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/V42",   1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/V42",   1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/V42",   1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/V42",   1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/V42",   1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/V42",   1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/V42",   1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/V42",   1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/V42",   1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/V42",   1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/V42",  1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL COMP",     1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL COMP",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL COMP",    1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL COMP",    1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL COMP",    1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL COMP",    1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL COMP",   1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL COMP",   1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/REL COMP",   1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/REL COMP",   1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/REL COMP",   1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/REL COMP",   1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/REL COMP",   1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/REL COMP",   1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/REL COMP",   1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/REL COMP",   1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/NOR",     1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/NOR",    1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/NOR",    1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/NOR",    1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/NOR",    1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/NOR",    1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/NOR",   1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/NOR",   1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/NOR",   1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/NOR",   1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/NOR",   1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/NOR",   1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/NOR",   1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/NOR",   1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/NOR",   1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/NOR",   1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL-V.42",     1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200/REL-V.42",    1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/REL-V.42",    1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL-V.42",    1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL-V.42",    1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL-V.42",    1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL-V.42",   1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL-V.42",   1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/REL-V.42",   1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/REL-V.42",   1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600/REL-V.42",   1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/REL-V.42",   1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/REL-V.42",   1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/REL-V.42",   1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/REL-V.42",   1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/REL-V.42",   1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/REL-V.42",  1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 31200",           1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/ARQ",       1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/REL",       1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/MNP",       1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/LAP-M",     1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/V42BIS",    1, 02, 03, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/V42b",      1, 02, 03, E0,79,00,00, 00,00,00,00
HKR, Responses, "CARRIER 31200",           1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CARRIER 31200/VFC",       1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200/V42",   1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200 REL",   1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 31200 REL/MNP5",  1, 02, 03, E0,79,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600",           1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/ARQ",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/REL",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/MNP",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/LAP-M",     1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/V42BIS",    1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/V42b",      1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33600",           1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33600/VFC",       1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600/V42",   1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600 REL",   1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "CONNECT 33600 REL/MNP5",  1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "+FCON", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "+F4", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000", 1, 02, 00, 00,7D,00,00, 00,00,00,00 ; CONNECT 32000
HKR, Responses, "CONNECT 34000", 1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000 ", 1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000", 1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000", 1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000", 1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000", 1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000", 1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000", 1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000", 1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000", 1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000", 1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000", 1, 02, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 58000", 1, 02, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 60000", 1, 02, 00, 60,EA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 32000/ARQ", 1, 02, 02, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 34000/ARQ", 1, 02, 02, D0,84,00,00, 00,00,00,00
HKR, Responses, "CONNECT 36000/ARQ ", 1, 02, 02, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38000/ARQ", 1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "CONNECT 40000/ARQ", 1, 02, 02, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 42000/ARQ", 1, 02, 02, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CONNECT 44000/ARQ", 1, 02, 02, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 46000/ARQ", 1, 02, 02, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 48000/ARQ", 1, 02, 02, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 50000/ARQ", 1, 02, 02, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CONNECT 52000/ARQ", 1, 02, 02, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CONNECT 54000/ARQ", 1, 02, 02, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 56000/ARQ", 1, 02, 02, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CONNECT 58000/ARQ", 1, 02, 02, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CONNECT 60000/ARQ", 1, 02, 02, 60,EA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 32000", 1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000", 1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000 ", 1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000", 1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000", 1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000", 1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000", 1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000", 1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000", 1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000", 1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000", 1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000", 1, 01, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 58000", 1, 01, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 60000", 1, 01, 00, 60,EA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 32000/VFC", 1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 34000/VFC", 1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "CARRIER 36000/VFC ", 1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 38000/VFC", 1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "CARRIER 40000/VFC", 1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 42000/VFC", 1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "CARRIER 44000/VFC", 1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 46000/VFC", 1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 48000/VFC", 1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 50000/VFC", 1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "CARRIER 52000/VFC", 1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "CARRIER 54000/VFC", 1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 56000/VFC", 1, 01, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "CARRIER 58000/VFC", 1, 01, 00, 90,E2,00,00, 00,00,00,00
HKR, Responses, "CARRIER 60000/VFC", 1, 01, 00, 60,EA,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:  ALT - CELLULAR ", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT EC", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200 EC", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 EC", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 EC", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 EC", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 EC", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 EC", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 EC", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 EC", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 EC", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 EC/V42", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 EC/V42", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 EC/V42", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 EC/V42", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 EC/V42", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 EC/V42", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 EC/V42", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 EC/V42", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 EC/V42BIS", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 EC/V42BIS", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 EC/V42BIS", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 EC/V42BIS", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 EC/V42BIS", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 EC/V42BIS", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 EC/V42BIS", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT REL", 1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300 REL", 1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600 REL", 1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200 REL", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 REL", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 REL", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 REL", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 REL", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 REL", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 REL", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 REL", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 REL", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600 REL", 1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000 REL", 1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400 REL", 1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800 REL", 1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400 REL", 1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600 REL", 1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200 REL", 1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX REL", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX REL", 1, 02, 02, b0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200 REL/V42", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 REL/V42", 1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 REL/V42", 1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 REL/V42", 1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 REL/V42", 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 REL/V42", 1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 REL/V42", 1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 REL/V42", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 REL/V42", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200 REL/V42BIS", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 REL/V42BIS", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 REL/V42BIS", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 REL/V42BIS", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 REL/V42BIS", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 REL/V42BIS", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 REL/V42BIS", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 REL/V42BIS", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 REL/V42BIS", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/REL-LAPM", 1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/REL-LAPM", 1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/REL-LAPM V.42 BIS", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/REL-LAPM V.42 BIS", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200TX/75RX V.23", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75TX/1200RX V.23", 1, 01, 00, b0,04,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: CLASS 5", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION:CLASS 5", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION:V.42BIS", 1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION:NONE", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-CELLULAR", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:ALT-CELLULAR", 1, 01, 0a, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-FAX", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:ALT-FAX", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-+FCERROR", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:ALT-+FCERROR", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-DATA", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:ALT-DATA", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: V42BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:V42BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: V.42BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:V.42BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:NONE", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:LAPM", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:LAP-M", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:ALT", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:MNP", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:MNP2", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:MNP3", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:MNP4", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/ARQ", 1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT REL/MNP5", 1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300 REL/MNP5", 1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600 REL/MNP5", 1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 1200 REL/MNP5", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400 REL/MNP5", 1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800 REL/MNP5", 1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200 REL/MNP5", 1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600 REL/MNP5", 1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000 REL/MNP5", 1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400 REL/MNP5", 1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800 REL/MNP5", 1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200 REL/MNP5", 1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600 REL/MNP5", 1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000 REL/MNP5", 1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400 REL/MNP5", 1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800 REL/MNP5", 1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400 REL/MNP5", 1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600 REL/MNP5", 1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200 REL/MNP5", 1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 1200TX/75RX REL/MNP5", 1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "CONNECT 75TX/1200RX REL/MNP5", 1, 02, 03, B0,04,00,00, 00,00,00,00

[INTERNAL]
HKR,, DeviceType, 1, 02

[RockVoice_ACFSP]
HKR,, Enumerator,,                      serwave.vxd
HKR,, VoiceProfile,                     1,25,02,08,02
HKR, WaveDriver,  BaudRate       ,1, 00, c2, 01, 00
HKR, WaveDriver,  XformID        ,1, 01, 00
HKR, WaveDriver,  XformModule    ,, "umdmxfrm.dll"
HKR, WaveDriver,  WaveHardwareID ,, "RockwellADPCMVoiceModemWave"
HKR,, VoiceBaudRate,    1, 00,c2,01,00
HKR,,SpeakerPhoneSpecs,                 1, 00,00,00,00,  0f,00,00,00,  03,00,00,00,  00,00,00,00
HKR, SpeakerPhoneEnable,                1,, "at#vls=6<cr>"
HKR, SpeakerPhoneDisable,               1,, "at#vls=0<cr>"
HKR, SpeakerPhoneMute,                  1,, "at#spk=0,<Vol>,<Gain><cr>"
HKR, SpeakerPhoneUnMute,                1,, "at#spk=1,<Vol>,<Gain><cr>"
HKR, SpeakerPhoneSetVolumeGain,         1,, "at#spk=,<Vol>,<Gain><cr>"
HKR,, HandsetCloseDelay,         1, 1e,00,00,00
HKR, EnableCallerID,                    1,, "at#cid=1<cr>"
HKR, EnableDistinctiveRing,             1,, "at-SDR=7<cr>"
HKR, StartPlay,                         1,, "at#vtx<cr>"
HKR, StopPlay,                          1,, "None"
HKR, StopPlay,                          2,, "NoResponse"
HKR, StartRecord,                       1,, "at#vrx<cr>"
HKR, StopRecord,                        1,, "None"
HKR, StopRecord,                        2,, "NoResponse"
HKR,, TerminateRecord,,                 "!"
HKR,, TerminatePlay,,                   "<h10><h03>"
HKR,, AbortPlay,,                       "<h10><h18>"
HKR, LineSetPlayFormat,                 1,, "at#vls=0<cr>"
HKR, LineSetRecordFormat,               1,, "None"
HKR, LineSetRecordFormat,               2,, "NoResponse"
HKR, HandsetSetRecordFormat,            1,,"at#vsr=7200<cr>"
HKR, HandsetSetRecordFormat,            2,,"at#vbs=4<cr>"
HKR, HandsetSetPlayFormat,              1,,"at#vsr=7200<cr>"
HKR, HandsetSetPlayFormat,              2,,"at#vbs=4<cr>"
HKR, OpenHandset,                       1,, "at#cls=8<cr>"
HKR, OpenHandset,                       2,, "at#vls=1<cr>"
HKR, CloseHandset,                      1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,                 1,, "at#cls=0<cr>"
HKR, VoiceToDataAnswer,                 2,, "ata<cr>"
HKR, VoiceAnswer,                       1,, "at#cls=8<cr>"
HKR, VoiceAnswer,                       2,, "at#vls=0<cr>"
HKR, VoiceAnswer,                       3,, "at#vbt=1<cr>"
HKR, VoiceAnswer,                       4,, "at#vsr=7200<cr>"
HKR, VoiceAnswer,                       5,, "at#vbs=4<cr>"
HKR, VoiceAnswer,                       6,, "ata<cr>"
HKR, VoiceDialNumberSetup,              1,, "at#cls=8<cr>"
HKR, VoiceDialNumberSetup,              2,, "at#vls=4<cr>"
HKR, VoiceDialNumberSetup,              3,, "at#vrn=0<cr>"
HKR, VoiceDialNumberSetup,              4,, "at#vbt=1<cr>"
HKR, VoiceDialNumberSetup,              5,, "at#vsr=7200<cr>"
HKR, VoiceDialNumberSetup,              6,, "at#vbs=4<cr>"
HKR,  GenerateDigit,                    1,, "at#vts=<Digit><cr>"
HKR,, CallerIDPrivate,,                 P
HKR,, CallerIDOutSide,,                 O
HKR,, VariableTerminator,,              <cr><lf>
HKR, Responses, "<cr><lf>VCON<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATE = ", 1, 93, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "TIME = ", 1, 94, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NMBR = ", 1, 95, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NAME = ", 1, 96, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "MESG = ", 1, 97, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING1<cr><lf>",        1, 18, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING2<cr><lf>",        1, 19, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING3<cr><lf>",        1, 1a, 00, 00,00,00,00, 00,00,00,00


