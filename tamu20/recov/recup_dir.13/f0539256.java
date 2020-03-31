ddReg, PCMCIA

[Modem1.AddReg]
HKR,, Properties, 1, 00,00,00,00, 3a,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 30,01,00,00, 00,c2,01,00, 00,fa,00,00

[Strings]
MSFT        = "Microsoft"
Mfg         = "Panasonic"
Modem1      = "Compact DATA PHS"

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>",		 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",	 1, 03, 00, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[MfgAddReg]
HKR, Init, 2,, "AT&F<cr>"
HKR, Init, 3,, "ATE0\V3&E0<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH0<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ0<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,,
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, FlowControl_Off,, "&K3"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",				1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",				1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/NONE<cr><lf>",      		1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",				1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/NONE<cr><lf>",    		1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",			1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/NONE<cr><lf>",     		1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",			1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/NONE<cr><lf>",		 	1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>", 			1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/NONE<cr><lf>",      		1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",			1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/NONE<cr><lf>",      		1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000<cr><lf>",			1, 02, 00, 00,fa,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/NONE<cr><lf>",    		1, 02, 02, 00,fa,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",			1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/NONE<cr><lf>",     		1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",					1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",	  			1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",	  			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",		  			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",	  			1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",	  			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OUT OF SERVICE<cr><lf>", 			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PS NO RESPONSE<cr><lf>", 			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RESTRICTION<cr><lf>", 				1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",			1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1 10<cr>",			1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "1 10 69<cr>",			1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "1 11<cr>",			1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "1 11 69<cr>",			1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "1 16<cr>",			1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "1 16 69<cr>",			1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "1 17<cr>",			1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "1 17 69<cr>",			1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "1 18<cr>",			1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "1 18 69<cr>",			1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "1 19<cr>",			1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "1 19 69<cr>",			1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "1 121<cr>",			1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "1 121 69<cr>",			1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "1 122<cr>",			1, 02, 00, 00,fa,00,00, 00,00,00,00
HKR, Responses, "1 122 69<cr>",			1, 02, 02, 00,fa,00,00, 00,00,00,00
HKR, Responses, "0<cr>",			1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>",			1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",			1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",			1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",			1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "F<cr>",			1, 06, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "69<cr>",			1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "104<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "106<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "107<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
