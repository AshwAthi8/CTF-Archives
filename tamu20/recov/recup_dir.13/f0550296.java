erties, 1, 00,00,00,00, 3a,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 33,01,00,00, 00,c2,01,00, 00,fa,00,00
HKR,, FClass, 1, 0f,00,00,00

[Strings]
MSFT="Microsoft"
Mfg = "NTT DoCoMo"
Modem1 = "Mobile Card P-in"

[All]
HKR,,FriendlyDriver,,unimodem.vxd
HKR,,DevLoader,,*vcomm
HKR,,PortSubClass,1,02
HKR,,ConfigDialog,,modemui.dll
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR, Init, 1,, "AT<cr>"
HKR, Responses, "<cr><lf>OK<cr><lf>",		 1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",	 1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr>",				 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",				 1, 01, 00, 00,00,00,00, 00,00,00,00

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[MfgAddReg]
HKR,, InactivityScale, 1, 3c,00,00,00
HKR, Init, 2,, "AT&F<cr>"
HKR, Init, 3,, "ATE0&E0\V3<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Hangup, 1,, "ATH0<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR,, Reset,, "ATZ0<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, DialSuffix,,
HKR, Settings, FlowControl_Off,, "&K3"
HKR, Settings, FlowControl_Hard,, "&K3"
HKR, Settings, FlowControl_Soft,, "&K4"
HKR, Settings, ErrorControl_On,, "\N3"
HKR, Settings, ErrorControl_Off,, "\N0"
HKR, Settings, Compression_On,, "%%C2"
HKR, Settings, Compression_Off,, "%%C0"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"
HKR, Settings, CallSetupFailTimer,, "S7=<#>"
HKR, Fax, Class1DTESpeed,, "AUTO"
HKR, Fax, Class1FlowHW,, "&K3"
HKR, Fax, Class1FlowSW,, "&K4"
HKR, Fax, Class2FlowHW,, "&K3"
HKR, Fax, Class2FlowSW,, "&K4"
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",				1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400<cr><lf>",				1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/NONE<cr><lf>",	      		1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 2400/V42bis<cr><lf>",    		1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800<cr><lf>",				1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/NONE<cr><lf>",	      		1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 4800/V42bis<cr><lf>",    		1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600<cr><lf>",				1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/NONE<cr><lf>",	      		1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 9600/V42bis<cr><lf>",    		1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200<cr><lf>",			1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/NONE<cr><lf>",     		1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 19200/V42bis<cr><lf>",   		1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800<cr><lf>",			1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/NONE<cr><lf>",			1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28800/V42bis<cr><lf>",			1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",			1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/NONE<cr><lf>",			1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/V42bis<cr><lf>",   		1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400<cr><lf>",			1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/NONE<cr><lf>",      		1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38400/V42bis<cr><lf>",   		1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600<cr><lf>",			1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/NONE<cr><lf>",      		1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 57600/V42bis<cr><lf>",   		1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000<cr><lf>",			1, 02, 00, 00,fa,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/NONE<cr><lf>",    		1, 02, 02, 00,fa,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 64000/V42bis<cr><lf>", 		1, 02, 03, 00,fa,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200<cr><lf>",			1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/NONE<cr><lf>",     		1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 115200/V42bis<cr><lf>",  		1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400<cr><lf>",			1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/NONE<cr><lf>",     		1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 230400/V42bis<cr><lf>",  		1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",					1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",	  			1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>",	  			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",		  			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",	  			1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>HAND SET IN USE<cr><lf>", 			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",	  			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OUT OF SERVICE<cr><lf>", 			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PS NO RESPONSE<cr><lf>", 			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RESTRICTION<cr><lf>",	  			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>PACKET SERVICE IN USE<cr><lf>", 		1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOT CORRECT CHARACTER LENGTH:7<cr><lf>", 	1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOT CORRECT PARITY BIT:NONE<cr><lf>", 		1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOT CORRECT STOP BIT:1<cr><lf>", 		1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NOT CORRECT DATA COMPRESSION:NONE<cr><lf>", 	1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1<cr>",			1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "1 10<cr>",			1, 02, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "1 10 67<cr>",			1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "1 10 69<cr>",			1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "1 11<cr>",			1, 02, 00, c0,12,00,00, 00,00,00,00
HKR, Responses, "1 11 67<cr>",			1, 02, 03, c0,12,00,00, 00,00,00,00
HKR, Responses, "1 11 69<cr>",			1, 02, 02, c0,12,00,00, 00,00,00,00
HKR, Responses, "1 12<cr>",			1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 12 67<cr>",			1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 12 69<cr>",			1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 16<cr>",			1, 02, 00, 00,4b,00,00, 00,00,00,00
HKR, Responses, "1 16 67<cr>",			1, 02, 03, 00,4b,00,00, 00,00,00,00
HKR, Responses, "1 16 69<cr>",			1, 02, 02, 00,4b,00,00, 00,00,00,00
HKR, Responses, "1 17<cr>",			1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "1 17 67<cr>",			1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "1 17 69<cr>",			1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "1 18<cr>",			1, 02, 00, 00,e1,00,00, 00,00,00,00
HKR, Responses, "1 18 67<cr>",			1, 02, 03, 00,e1,00,00, 00,00,00,00
HKR, Responses, "1 18 69<cr>",			1, 02, 02, 00,e1,00,00, 00,00,00,00
HKR, Responses, "1 19<cr>",			1, 02, 00, 00,c2,01,00, 00,00,00,00
HKR, Responses, "1 19 67<cr>",			1, 02, 03, 00,c2,01,00, 00,00,00,00
HKR, Responses, "1 19 69<cr>",			1, 02, 02, 00,c2,01,00, 00,00,00,00
HKR, Responses, "1 20<cr>",			1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "1 20 67<cr>",			1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "1 20 69<cr>",			1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "1 121<cr>",			1, 02, 00, 00,7d,00,00, 00,00,00,00
HKR, Responses, "1 121 67<cr>",			1, 02, 03, 00,7d,00,00, 00,00,00,00
HKR, Responses, "1 121 69<cr>",			1, 02, 02, 00,7d,00,00, 00,00,00,00
HKR, Responses, "1 122<cr>",			1, 02, 00, 00,fa,00,00, 00,00,00,00
HKR, Responses, "1 122 67<cr>",			1, 02, 03, 00,fa,00,00, 00,00,00,00
HKR, Responses, "1 122 69<cr>",			1, 02, 02, 00,fa,00,00, 00,00,00,00
HKR, Responses, "1 123<cr>",			1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 123 67<cr>",			1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 123 69<cr>",			1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "1 124<cr>",			1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "1 124 67<cr>",			1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "1 124 69<cr>",			1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "0<cr>",			1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "2<cr>",			1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "3<cr>",			1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "4<cr>",			1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "6<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "7<cr>",			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "8<cr>",			1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "D<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "F<cr>",			1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "67<cr>",			1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "69<cr>",			1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "104<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "106<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "107<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "123<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "124<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "125<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "126<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "127<cr>",			1, 05, 00, 00,00,00,00, 00,00,00,00
