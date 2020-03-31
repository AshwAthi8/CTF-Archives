Modem1.AddReg, PCMCIA
DriverVer=08/21/2000,1.0.0.0

[Modem1.AddReg]
HKR,, Properties, 1, 00,00,00,00, ff,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 33,01,00,00, 00,c2,01,00, 00,fa,00,00

[Strings]
MSFT="Microsoft"
Mfg = "NTT DoCoMo"
Modem1  ="Mobile Card Duo"

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>",		  1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",	  1, 03, 00, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[MfgAddReg]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT&F<cr>"
HKR, Init, 3,, "AT\V3&E0<cr>"
HKR, Init, 4,, "ATE0#SB1<cr>"
HKR, Init, 5,, "AT&D2&C1S0=0<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH0<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ0<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,, ""
HKR, Settings, FlowControl_Off,, "&K"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, Compression_On,, "%%C2"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"

HKR, Responses, "<cr><lf>CONNECT<cr><lf>",	  1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/NONE<cr><lf>",	  1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V.42bis<cr><lf>",	  1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/NONE<cr><lf>",  1, 02, 02, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/V.42bis<cr><lf>",  1, 02, 03, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/NONE<cr><lf>",  1, 02, 02, 00,FA,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/V.42bis<cr><lf>",  1, 02, 03, 00,FA,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",		  1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",	  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OUT OF SERVICE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",      1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>HAND SET IN USE<cr><lf>",      1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RESTRICTION<cr><lf>",    1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PS NO RESPONSE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",		  1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",	  1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",    1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",	 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",	 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>",	 1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",	 1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",	 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>",	 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",	 1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",	 1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "D<cr>",	 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "F<cr>",	 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "67<cr>",	 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "69<cr>",	 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "104<cr>",	 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "106<cr>",	 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "107<cr>",	 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "121<cr>",	 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "122<cr>",	 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "123<cr>",	 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1 121 69<cr>",	 1, 02, 02, 00,7D,00,00, 00,00,00,00
HKR, Responses, "1 121 67<cr>",	 1, 02, 03, 00,7D,00,00, 00,00,00,00
HKR, Responses, "1 122 69<cr>",	 1, 02, 02, 00,FA,00,00, 00,00,00,00
HKR, Responses, "1 122 67<cr>",	 1, 02, 03, 00,FA,00,00, 00,00,00,00
HKR, Responses, "1 123 69<cr>",	 1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 123 67<cr>",	 1, 02, 03, 80,25,00,00, 00,00,00,00
