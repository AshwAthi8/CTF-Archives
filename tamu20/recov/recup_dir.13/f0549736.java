O_DATAFAX_CARD-6EC9
%Modem5%   = Modem5, PCMCIA\NTT_PERSONAL-PALDIO_DATAFAX_CARD-517E
%Modem4%   = Modem4, PCMCIA\NTT_PERSONAL-PALDIO_DATAFAX_CARD-7066

[Modem6]
AddReg=All, MfgAddReg1, Modem6.AddReg, PCMCIA

[Modem5]
AddReg=All, MfgAddReg1, Modem5.AddReg, PCMCIA

[Modem4]
AddReg=All, MfgAddReg1, Modem4.AddReg, PCMCIA

[Modem6.AddReg]
HKR,, Properties, 1, 00,00,00,00, 3b,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 31,01,00,00, 00,c2,01,00, 00,7d,00,00
HKR,,ConfigDelay,1, b8,0b,00,00

[Modem5.AddReg]
HKR,, Properties, 1, 00,00,00,00, 3b,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 31,01,00,00, 00,c2,01,00, 00,7d,00,00

[Modem4.AddReg]
HKR,, Properties, 1, 00,00,00,00, 3a,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 31,01,00,00, 00,c2,01,00, 00,7d,00,00

[Strings]
MSFT="Microsoft"
Mfg = "NTT DoCoMo"
Modem6  ="32K Paldio DataFax Card DC-2N"
Modem5  ="32K Paldio DataFax Card DC-2P"
Modem4  ="32K Paldio DataFax Card DC-2S"

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>", 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>", 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>", 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>", 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>", 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>", 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "01<cr>",			  1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "00<cr>",			  1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "02<cr>",			  1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "03<cr>",			  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "04<cr>",			  1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "06<cr>",			  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "07<cr>",			  1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "08<cr>",			  1, 07, 00, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[MfgAddReg1]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT&F<cr>"
HKR, Init, 3,, "AT\Z1<cr>"
HKR, Init, 4,, "ATE0Q0V1&D2&C1&S0\Z1#PQ0S0=0<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH0<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ0<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ""
HKR, Settings, FlowControl_Off,,"&K3"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, Compression_On,, "%%C2#PC1"
HKR, Settings, Compression_Off,, "%%C0#PC0"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Responses, "<cr><lf>CONNECT PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",	      1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",	      1, 02, 01, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",					      1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",	      1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",    1, 02, 01, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",					      1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",	      1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",    1, 02, 01, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",					      1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",	      1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",    1, 02, 01, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",				      1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",      1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",   1, 02, 01, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",				      1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",      1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",   1, 02, 01, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",				      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",      1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",   1, 02, 01, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",				      1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",      1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",   1, 02, 01, 00,E1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",				      1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 PROTOCOL:PIAFS COMPRESSION:NONE<cr><lf>",     1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200 PROTOCOL:PIAFS COMPRESSION:V.42bis<cr><lf>",  1, 02, 01, 00,C2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>OUT OF SERVICE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOT READY<cr><lf>",	  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RESTRICTION<cr><lf>",	  1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PS NO RESPONSE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT PROTOCOL:PIAFS COMPRESSION:NONE / ",	      1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT PROTOCOL:PIAFS COMPRESSION:V.42bis / ",	      1, 02, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200 ",	1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400 ",	1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800 ",	1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200 ",	1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600 ",	1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000 ",	1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400 ",	1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800 ",	1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200 ",	1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600 ",	1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000 ",	1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400 ",	1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800 ",	1, 01, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CARRIER 31200 ",	1, 01, 00, E0,79,00,00, 00,00,00,00
HKR, Responses, "CARRIER 33600 ",	1, 01, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:NONE<cr><lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:MNP4<cr><lf>",	1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL:LAPM<cr><lf>",	1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr>",	1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",	1, 01, 00, 00,00,00,00, 00,00,00,00
