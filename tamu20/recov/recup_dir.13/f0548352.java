 MF\MHZXJ144_DEV0

[MhzMdm4]
AddReg=All, MhzMoeAddReg, ModemMoe4.Addreg, PCMCIA
DriverVer=03/09/2000

[MhzMdm4a]
AddReg=All, MhzMoeAddReg, ModemMoe4a.Addreg, PCMCIA
DriverVer=03/09/2000

[MhzMdm4b]
AddReg=All, MhzMoeAddReg, ModemMoe4b.Addreg, PCMCIA

[MhzMdm2]
AddReg=All, MhzMoeAddReg, ModemMoe.Addreg, PCMCIA
DriverVer=03/09/2000

[ModemMoe4.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, 5A,00,00,00, 00,00,00,00, 0F,00,00,00, 37,03,00,00, 00,C2,01,00, 40,83,00,00

[ModemMoe4a.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, 5A,00,00,00, 00,00,00,00, 0F,00,00,00, 37,03,00,00, 00,C2,01,00, 80,70,00,00

[ModemMoe4b.AddReg]
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, 5A,00,00,00, 00,00,00,00, 0F,00,00,00, f7,03,00,00, 00,C2,01,00, 40,38,00,00
HKR, Init, 3,, "AT E0 V1 W1 B1<cr>"
HKR, Init, 4,, "AT &C1 &D2 S95=47<cr>"
HKR, Settings, ErrorControl_Forced,, "\N2"
HKR, Settings, Compression_On,, "%%C3"
HKR, Settings, Compression_Off,, "%%C0"

[ModemMoe.AddReg]
HKR,, Properties, 1, C0,01,00,00, FF,00,00,00, 5A,00,00,00, 00,00,00,00, 0F,00,00,00, 37,03,00,00, 00,C2,01,00, 40,83,00,00

[Strings]
MSFT="Microsoft"
Mfg = "3Com"
Mhz5="Megahertz CCXJEM3336 Card Modem Interface"
Mhz6="Megahertz CC-XJEM3336 PC Card Modem"
Mhz7="Megahertz CC-XJEM3288 PC Card Modem"
Mhz8="Megahertz CC-XJEM1144 PC Card Modem"

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"

[MhzMoeAddReg]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT &F0<cr>"
HKR, Init, 3,, "AT E0 V1 W2 B1<cr>"
HKR, Init, 4,, "AT &C1 &D2 \V1 S0=0<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH0<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ0<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ";"
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
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, ErrorControl_Forced,, "\N4"
HKR, Settings, Compression_On,, "%%C1""H3"
HKR, Settings, Compression_Off,, "%%C0""H0"
HKR, Settings, Modulation_CCITT,, "B0"
HKR, Settings, Modulation_Bell,, "B1"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,, "N1"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Settings, InactivityTimeout,, "S30=<#>"

HKR, Responses, "<cr>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT<cr><lf>",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",       1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "2<cr>",       1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",       1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",       1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "6<cr>",       1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",       1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",       1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR, Responses, "<cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIAL TONE<cr><lf>",1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>FAX<cr><lf>",         1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DATA<cr><lf>",        1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>VOICE<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RINGING<cr><lf>",     1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",     1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>+FCERROR<cr><lf>",    1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:CLASS5<cr><lf>",    1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: CLASS5<cr><lf>",   1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: CLASS 5<cr><lf>",  1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:MNP5<cr><lf>",      1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: MNP5<cr><lf>",     1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42BIS<cr><lf>",  1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: V.42 BIS<cr><lf>", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:V.42bis<cr><lf>",   1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: ADC<cr><lf>",      1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION:NONE<cr><lf>",      1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>COMPRESSION: NONE<cr><lf>",     1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:NONE<cr><lf>",          1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: NONE<cr><lf>",         1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAPM<cr><lf>",         1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M<cr><lf>",        1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: LAP-M-EC<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT<cr><lf>",          1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-EC<cr><lf>",       1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: ALT-CELLULAR<cr><lf>", 1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP<cr><lf>",          1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:MNP 2, 4<cr><lf>",      1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL:MNP 3, 4<cr><lf>",      1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP 2, 4<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP 3, 4<cr><lf>",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP2<cr><lf>",         1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP3<cr><lf>",         1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP4<cr><lf>",         1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP 2<cr><lf>",        1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP 3<cr><lf>",        1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PROTOCOL: MNP 4<cr><lf>",        1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",                 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/NONE<cr><lf>",            1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/ARQ<cr><lf>",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/REL<cr><lf>",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/MNP<cr><lf>",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/LAP-M<cr><lf>",           1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/V42BIS<cr><lf>",          1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT/V42b<cr><lf>",            1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300<cr><lf>",             1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/NONE<cr><lf>",        1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/ARQ<cr><lf>",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/REL<cr><lf>",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/MNP<cr><lf>",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/LAP-M<cr><lf>",       1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/V42BIS<cr><lf>",      1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 300/V42b<cr><lf>",        1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600<cr><lf>",             1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/NONE<cr><lf>",        1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/ARQ<cr><lf>",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/REL<cr><lf>",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/MNP<cr><lf>",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/LAP-M<cr><lf>",       1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/V42BIS<cr><lf>",      1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 600/V42b<cr><lf>",        1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600<cr><lf>",            1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/NONE<cr><lf>",       1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/ARQ<cr><lf>",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/REL<cr><lf>",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/MNP<cr><lf>",        1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/LAP-M<cr><lf>",      1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/V42BIS<cr><lf>",     1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 0600/V42b<cr><lf>",       1, 02, 03, 58,02,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200<cr><lf>",            1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/NONE<cr><lf>",       1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/ARQ<cr><lf>",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/REL<cr><lf>",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/MNP<cr><lf>",        1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/LAP-M<cr><lf>",      1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/V42BIS<cr><lf>",     1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/V42b<cr><lf>",       1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75<cr><lf>",         1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/NONE<cr><lf>",    1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/ARQ<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/REL<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/MNP<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/LAP-M<cr><lf>",   1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/V42BIS<cr><lf>",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200/75/V42b<cr><lf>",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX<cr><lf>",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/NONE<cr><lf>",1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/V42BIS<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 1200TX/75RX/V42b<cr><lf>",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200<cr><lf>",         1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/NONE<cr><lf>",    1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/ARQ<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/REL<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/MNP<cr><lf>",     1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/LAP-M<cr><lf>",   1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/V42BIS<cr><lf>",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75/1200/V42b<cr><lf>",    1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX<cr><lf>",     1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/NONE<cr><lf>",1, 02, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/ARQ<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/REL<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/MNP<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/LAP-M<cr><lf>", 1, 02, 02, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/V42BIS<cr><lf>",1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 75TX/1200RX/V42b<cr><lf>",  1, 02, 03, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",            1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/NONE<cr><lf>",       1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/ARQ<cr><lf>",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/REL<cr><lf>",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/MNP<cr><lf>",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/LAP-M<cr><lf>",      1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V42BIS<cr><lf>",     1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V42b<cr><lf>",       1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",            1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/NONE<cr><lf>",       1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/ARQ<cr><lf>",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/REL<cr><lf>",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/MNP<cr><lf>",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/LAP-M<cr><lf>",      1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V42BIS<cr><lf>",     1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V42b<cr><lf>",       1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200<cr><lf>",            1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/NONE<cr><lf>",       1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/ARQ<cr><lf>",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/REL<cr><lf>",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/MNP<cr><lf>",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/LAP-M<cr><lf>",      1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V42BIS<cr><lf>",     1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 7200/V42b<cr><lf>",       1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",            1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/NONE<cr><lf>",       1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/ARQ<cr><lf>",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/REL<cr><lf>",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/MNP<cr><lf>",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/LAP-M<cr><lf>",      1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V42BIS<cr><lf>",     1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V42b<cr><lf>",       1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000<cr><lf>",           1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/NONE<cr><lf>",      1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/ARQ<cr><lf>",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/REL<cr><lf>",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/MNP<cr><lf>",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/LAP-M<cr><lf>",     1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V42BIS<cr><lf>",    1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 12000/V42b<cr><lf>",      1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400<cr><lf>",           1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/NONE<cr><lf>",      1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ<cr><lf>",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/REL<cr><lf>",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/MNP<cr><lf>",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/LAP-M<cr><lf>",     1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V42BIS<cr><lf>",    1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/V42b<cr><lf>",      1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800<cr><lf>",           1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/NONE<cr><lf>",      1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/ARQ<cr><lf>",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/REL<cr><lf>",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/MNP<cr><lf>",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/LAP-M<cr><lf>",     1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V42BIS<cr><lf>",    1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 16800/V42b<cr><lf>",      1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",           1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/NONE<cr><lf>",      1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/ARQ<cr><lf>",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/REL<cr><lf>",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/MNP<cr><lf>",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/LAP-M<cr><lf>",     1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V42BIS<cr><lf>",    1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V42b<cr><lf>",      1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600<cr><lf>",           1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/NONE<cr><lf>",      1, 02, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/ARQ<cr><lf>",       1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/REL<cr><lf>",       1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/MNP<cr><lf>",       1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/LAP-M<cr><lf>",     1, 02, 02, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V42BIS<cr><lf>",    1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 21600/V42b<cr><lf>",      1, 02, 03, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000<cr><lf>",           1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/NONE<cr><lf>",      1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/ARQ<cr><lf>",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/REL<cr><lf>",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/MNP<cr><lf>",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/LAP-M<cr><lf>",     1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V42BIS<cr><lf>",    1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 24000/V42b<cr><lf>",      1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400<cr><lf>",           1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/NONE<cr><lf>",      1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/ARQ<cr><lf>",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/REL<cr><lf>",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/MNP<cr><lf>",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/LAP-M<cr><lf>",     1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V42BIS<cr><lf>",    1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 26400/V42b<cr><lf>",      1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",           1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/NONE<cr><lf>",      1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/ARQ<cr><lf>",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/REL<cr><lf>",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/MNP<cr><lf>",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/LAP-M<cr><lf>",     1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V42BIS<cr><lf>",    1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V42b<cr><lf>",      1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200<cr><lf>",           1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/NONE<cr><lf>",      1, 02, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ<cr><lf>",       1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/REL<cr><lf>",       1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/MNP<cr><lf>",       1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/LAP-M<cr><lf>",     1, 02, 02, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V42BIS<cr><lf>",    1, 02, 03, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/V42b<cr><lf>",      1, 02, 03, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600<cr><lf>",           1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/NONE<cr><lf>",      1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ<cr><lf>",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/REL<cr><lf>",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/MNP<cr><lf>",       1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/LAP-M<cr><lf>",     1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V42BIS<cr><lf>",    1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/V42b<cr><lf>",      1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/NONE<cr><lf>",      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/ARQ<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/REL<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/MNP<cr><lf>",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/LAP-M<cr><lf>",     1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/V42BIS<cr><lf>",    1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/V42b<cr><lf>",      1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",           1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/NONE<cr><lf>",      1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/ARQ<cr><lf>",       1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/REL<cr><lf>",       1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/MNP<cr><lf>",       1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/LAP-M<cr><lf>",     1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/V42BIS<cr><lf>",    1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/V42b<cr><lf>",      1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",          1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/NONE<cr><lf>",     1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/ARQ<cr><lf>",      1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/REL<cr><lf>",      1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/MNP<cr><lf>",      1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/LAP-M<cr><lf>",    1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/V42BIS<cr><lf>",   1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/V42b<cr><lf>",     1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400<cr><lf>",          1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/NONE<cr><lf>",     1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/ARQ<cr><lf>",      1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/REL<cr><lf>",      1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/MNP<cr><lf>",      1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/LAP-M<cr><lf>",    1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/V42BIS<cr><lf>",   1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/V42b<cr><lf>",     1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 300<cr><lf>",     1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200<cr><lf>",    1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 1200/75<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 75/1200<cr><lf>", 1, 01, 00, B0,04,00,00, 00,00,00,00
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
HKR, Responses, "<cr><lf>CARRIER 31200 V.34<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600 V.34<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 2400/VFC<cr><lf>",    1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 4800/VFC<cr><lf>",    1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 7200/VFC<cr><lf>",    1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 9600/VFC<cr><lf>",    1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 12000/VFC<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 14400/VFC<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 16800/VFC<cr><lf>",1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 19200/VFC<cr><lf>",1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 21600/VFC<cr><lf>",1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 24000/VFC<cr><lf>",1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 26400/VFC<cr><lf>",1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28800/VFC<cr><lf>",1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 31200/VFC<cr><lf>",1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33600/VFC<cr><lf>",1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 300<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 1200<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 2400<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 4800<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 7200<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 9600<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 12000<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 14400<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 16800<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 19200<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 21600<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 24000<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 26400<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 28800<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 31200<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 2400 Receive: 33600<cr><lf>",   1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 300<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 1200<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 2400<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 4800<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 7200<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 9600<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 12000<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 14400<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 16800<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 19200<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 21600<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 24000<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 26400<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 28800<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 31200<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 4800 Receive: 33600<cr><lf>",   1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 300<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 1200<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 2400<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 4800<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 7200<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 9600<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 12000<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 14400<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 16800<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 19200<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 21600<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 24000<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 26400<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 28800<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 31200<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 7200 Receive: 33600<cr><lf>",   1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 300<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 1200<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 2400<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 4800<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 7200<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 9600<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 12000<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 14400<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 16800<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 19200<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 21600<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 24000<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 26400<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 28800<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 31200<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 9600 Receive: 33600<cr><lf>",   1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 300<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 1200<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 2400<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 4800<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 7200<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 9600<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 12000<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 14400<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 16800<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 19200<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 21600<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 24000<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 26400<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 28800<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 31200<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 12000 Receive: 33600<cr><lf>",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 300<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 1200<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 2400<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 4800<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 7200<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 9600<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 12000<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 14400<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 16800<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 19200<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 21600<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 24000<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 26400<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 28800<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 31200<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 14400 Receive: 33600<cr><lf>",   1, 01, 00, 40,38,00,00, 00,00,00,00

HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 300<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 1200<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 2400<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 4800<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 7200<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 9600<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 12000<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 14400<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 16800<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 19200<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 21600<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 24000<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 26400<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 28800<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 31200<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 16800 Receive: 33600<cr><lf>",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 300<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 1200<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 2400<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 4800<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 7200<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 9600<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 12000<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 14400<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 16800<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 19200<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 21600<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 24000<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 26400<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 28800<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 31200<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 19200 Receive: 33600<cr><lf>",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 300<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 1200<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 2400<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 4800<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 7200<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 9600<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 12000<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 14400<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 16800<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 19200<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 21600<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 24000<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 26400<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 28800<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 31200<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 21600 Receive: 33600<cr><lf>",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 300<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 1200<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 2400<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 4800<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 7200<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 9600<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 12000<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 14400<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 16800<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 19200<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 21600<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 24000<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 26400<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 28800<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 31200<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 24000 Receive: 33600<cr><lf>",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 300<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 1200<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 2400<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 4800<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 7200<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 9600<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 12000<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 14400<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 16800<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 19200<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 21600<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 24000<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 26400<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 28800<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 31200<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 26400 Receive: 33600<cr><lf>",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 300<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 1200<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 2400<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 4800<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 7200<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 9600<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 12000<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 14400<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 16800<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 19200<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 21600<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 24000<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 26400<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 28800<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 31200<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 28800 Receive: 33600<cr><lf>",   1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 300<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 1200<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 2400<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 4800<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 7200<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 9600<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 12000<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 14400<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 16800<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 19200<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 21600<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 24000<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 26400<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 28800<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 31200<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 31200 Receive: 33600<cr><lf>",   1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 300<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 1200<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 2400<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 4800<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 7200<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 9600<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 12000<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 14400<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 16800<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 19200<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 21600<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 24000<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 26400<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 28800<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 31200<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER  Transmit: 33600 Receive: 33600<cr><lf>",   1, 01, 00, 40,83,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,,DeviceType,1,03


