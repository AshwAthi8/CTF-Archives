; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Microsoft
; Globally Shared Modem Settings

[Version]
Signature="$WINDOWS NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Strings]
MSFT = "Microsoft"

[MDMGL002.VERBOSE]  ; USR 33.6K, padded, verbose
HKR, Responses, "<cr>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",       1, 00, 00, 00,00,00,00, 00,00,00,00 ; OK
HKR, Responses, "2<cr>",       1, 08, 00, 00,00,00,00, 00,00,00,00 ; RING
HKR, Responses, "3<cr>",       1, 04, 00, 00,00,00,00, 00,00,00,00 ; NO CARRIER
HKR, Responses, "4<cr>",       1, 03, 00, 00,00,00,00, 00,00,00,00 ; ERROR
HKR, Responses, "6<cr>",       1, 05, 00, 00,00,00,00, 00,00,00,00 ; NO DIALTONE
HKR, Responses, "7<cr>",       1, 06, 00, 00,00,00,00, 00,00,00,00 ; BUSY
HKR, Responses, "8<cr>",       1, 07, 00, 00,00,00,00, 00,00,00,00 ; NO ANSWER
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>ERROR<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>OK<cr><lf>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT<cr><lf>",1,02,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V32/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V34/LAPM<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/MNP5<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/MNP5<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/MNP/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/NONE<cr><lf>",1,2,0,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V32/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/NONE<cr><lf>",1,2,0,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/V34/NONE<cr><lf>",1,2,0,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/LAPM/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/MNP/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/HST/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/V32/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/V34/NONE<cr><lf>",1,2,0,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/LAPM/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/MNP/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/HST/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/V32/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/V34/NONE<cr><lf>",1,2,0,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/LAPM/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/MNP/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/HST/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/V32/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/V34/NONE<cr><lf>",1,2,0,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/HST/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V32/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/V34/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/VFC/NONE<cr><lf>",1,2,0,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/HST/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/V32/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/V34/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/VFC/NONE<cr><lf>",1,2,0,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/HST/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/V32/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/V34/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/VFC/NONE<cr><lf>",1,2,0,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/V32/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/V34/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/VFC/NONE<cr><lf>",1,2,0,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/V32/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/V34/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/VFC/NONE<cr><lf>",1,2,0,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/V34/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/VFC/NONE<cr><lf>",1,2,0,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/V34/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/VFC/NONE<cr><lf>",1,2,0,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/HST/HST/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/NONE<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/VFC/MNP/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/V34/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/VFC/NONE<cr><lf>",1,2,0,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/LAPM<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>",1,2,B,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>",1,2,B,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>",1,2,B,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>",1,2,B,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14000/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>",1,2,B,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>",1,2,B,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>",1,2,B,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>",1,2,B,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>",1,2,B,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>",1,2,B,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14000/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>",1,2,B,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>",1,2,B,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/HST/HST/CELLULAR<cr><lf>",1,2,A,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/HST/HST/CELLULAR<cr><lf>",1,2,A,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/HST/HST/CELLULAR<cr><lf>",1,2,A,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/HST/HST/CELLULAR<cr><lf>",1,2,A,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14000/ARQ/HST/HST/CELLULAR<cr><lf>",1,2,A,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/HST/HST/CELLULAR<cr><lf>",1,2,A,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V32/MNP<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V32/MNP<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V32/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V32/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V32/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V32/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V32/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V32/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V32/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V32/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V32/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/MNP/MNP5<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/MNP/MNP5<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/MNP/MNP5<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/MNP/MNP5<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/MNP/MNP5<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/MNP/MNP5<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/MNP/MNP5<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/MNP/MNP5<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/MNP/MNP5<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/MNP/MNP5<cr><lf>",1,2,3,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/MNP/MNP5<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/V34/MNP<cr><lf>",1,2,2,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/V34/MNP<cr><lf>",1,2,2,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/V34/MNP<cr><lf>",1,2,2,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/V34/MNP<cr><lf>",1,2,2,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/V34/MNP<cr><lf>",1,2,2,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/V34/MNP<cr><lf>",1,2,2,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/V34/MNP<cr><lf>",1,2,2,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/V34/MNP<cr><lf>",1,2,2,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/V34/MNP<cr><lf>",1,2,2,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/V34/MNP<cr><lf>",1,2,2,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/V34/MNP<cr><lf>",1,2,2,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/V34/MNP<cr><lf>",1,2,2,20,67,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 28800/ARQ/V34/MNP<cr><lf>",1,2,2,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/V34/NONE<cr><lf>",1,2,0,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/LAPM<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/MNP/MNP5<cr><lf>",1,2,3,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 31200/ARQ/V34/MNP<cr><lf>",1,2,2,E0,79,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/NONE<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/NONE<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP/V42BIS<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/V34/NONE<cr><lf>",1,2,0,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/LAPM<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/MNP/MNP5<cr><lf>",1,2,3,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 33600/ARQ/V34/MNP<cr><lf>",1,2,2,40,83,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000<cr><lf>",1,2,0,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/DIGITAL<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/DIGITAL<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/DIGITAL/V120<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 64000<cr><lf>",1,2,0,00,FA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 64000/DIGITAL<cr><lf>",1,2,2,00,FA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 64000/ARQ/DIGITAL<cr><lf>",1,2,2,00,FA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 64000/ARQ/DIGITAL/V120<cr><lf>",1,2,2,00,FA,00,0,0,0,0,0

HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V32/LAPM/V42BIS<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V32/LAPM/V42BIS<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V32/MNP<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V32/MNP<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/HST/HST/V42BIS<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/LAPM/MNP5<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/V32/LAPM<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/LAPM/NONE<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/LAPM<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/LAPM/V42BIS<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/MNP/MNP5<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/MNP/NONE<cr><lf>", 1, 02, 02, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/ARQ/VFC/MNP/V42BIS<cr><lf>", 1, 02, 03, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 31200/VFC/NONE<cr><lf>", 1, 02, 00, e0,79,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/HST/HST/V42BIS<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/LAPM/MNP5<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/V32/LAPM<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/LAPM/NONE<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/LAPM<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/LAPM/V42BIS<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/MNP/MNP5<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/MNP/NONE<cr><lf>", 1, 02, 02, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/ARQ/VFC/MNP/V42BIS<cr><lf>", 1, 02, 03, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33600/VFC/NONE<cr><lf>", 1, 02, 00, 40,83,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/HST/HST/CELLULAR/V42BIS<cr><lf>", 1, 02, 0b, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/HST/HST/CELLULAR/MNP5<cr><lf>", 1, 02, 0b, 40,38,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 14400/ARQ/HST/HST/CELLULAR<cr><lf>", 1, 02, 0a, 40,38,00,00, 00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 1200/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,B0,04,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 2400/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,60,09,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 4800/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,C0,12,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 7200/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,20,1C,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 9600/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,80,25,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 12000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,E0,2E,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 14400/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,40,38,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 16800/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,A0,41,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 19200/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,00,4B,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 21600/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,60,54,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 24000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,C0,5D,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 26400/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,80,70,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/V42BIS<cr><lf>", 1,2,3,D5,91,00,00, 00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3, C0,DA,00,0,   0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 64000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,00,FA,00,0,0,0,0,0

[MDMGL002.XircV90]
HKR, Responses, "<cr><lf>DELAYED<cr><lf>",	1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLISTED<cr><lf>",	1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BLACKLIST FULL<cr><lf>", 1, 1c, 00, 00,00,00,00, 00,00,00,00
;V.90
HKR, Responses, "<cr><lf>CONNECT 28000<cr><lf>",	1, 02, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333<cr><lf>",	1, 02, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666<cr><lf>",	1, 02, 00, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000<cr><lf>",	1, 02, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333<cr><lf>",	1, 02, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000<cr><lf>",	1, 02, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666<cr><lf>",	1, 02, 00, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000<cr><lf>",	1, 02, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333<cr><lf>",	1, 02, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000<cr><lf>",	1, 02, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666<cr><lf>",	1, 02, 00, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000<cr><lf>",	1, 02, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333<cr><lf>",	1, 02, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000<cr><lf>",	1, 02, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666<cr><lf>",	1, 02, 00, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000<cr><lf>",	1, 02, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333<cr><lf>",	1, 02, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000<cr><lf>",	1, 02, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666<cr><lf>",	1, 02, 00, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000<cr><lf>",	1, 02, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333<cr><lf>",	1, 02, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000<cr><lf>",	1, 02, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666<cr><lf>",	1, 02, 00, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000<cr><lf>",	1, 02, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333<cr><lf>",	1, 02, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000<cr><lf>",	1, 02, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666<cr><lf>",	1, 02, 00, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000<cr><lf>",	1, 02, 00, C0,DA,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 28000/ARQ<cr><lf>",	1, 02, 02, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 29333/ARQ<cr><lf>",	1, 02, 02, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 30666/ARQ<cr><lf>",	1, 02, 02, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 32000/ARQ<cr><lf>",	1, 02, 02, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 33333/ARQ<cr><lf>",	1, 02, 02, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34000/ARQ<cr><lf>",	1, 02, 02, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 34666/ARQ<cr><lf>",	1, 02, 02, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 36000/ARQ<cr><lf>",	1, 02, 02, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 37333/ARQ<cr><lf>",	1, 02, 02, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38000/ARQ<cr><lf>",	1, 02, 02, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 38666/ARQ<cr><lf>",	1, 02, 02, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 40000/ARQ<cr><lf>",	1, 02, 02, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 41333/ARQ<cr><lf>",	1, 02, 02, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42000/ARQ<cr><lf>",	1, 02, 02, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 42666/ARQ<cr><lf>",	1, 02, 02, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 44000/ARQ<cr><lf>",	1, 02, 02, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 45333/ARQ<cr><lf>",	1, 02, 02, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46000/ARQ<cr><lf>",	1, 02, 02, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 46666/ARQ<cr><lf>",	1, 02, 02, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 48000/ARQ<cr><lf>",	1, 02, 02, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 49333/ARQ<cr><lf>",	1, 02, 02, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50000/ARQ<cr><lf>",	1, 02, 02, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 50666/ARQ<cr><lf>",	1, 02, 02, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 52000/ARQ<cr><lf>",	1, 02, 02, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 53333/ARQ<cr><lf>",	1, 02, 02, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54000/ARQ<cr><lf>",	1, 02, 02, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 54666/ARQ<cr><lf>",	1, 02, 02, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT 56000/ARQ<cr><lf>",	1, 02, 02, C0,DA,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 28000<cr><lf>",	1, 01, 00, 60,6D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 29333<cr><lf>",	1, 01, 00, 95,72,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 30666<cr><lf>",	1, 01, 00, CA,77,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 32000<cr><lf>",	1, 01, 00, 00,7D,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 33333<cr><lf>",	1, 01, 00, 35,82,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34000<cr><lf>",	1, 01, 00, D0,84,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 34666<cr><lf>",	1, 01, 00, 6A,87,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 36000<cr><lf>",	1, 01, 00, A0,8C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 37333<cr><lf>",	1, 01, 00, D5,91,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38000<cr><lf>",	1, 01, 00, 70,94,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 38666<cr><lf>",	1, 01, 00, 0A,97,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 40000<cr><lf>",	1, 01, 00, 40,9C,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 41333<cr><lf>",	1, 01, 00, 75,A1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42000<cr><lf>",	1, 01, 00, 10,A4,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 42666<cr><lf>",	1, 01, 00, AA,A6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 44000<cr><lf>",	1, 01, 00, E0,AB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 45333<cr><lf>",	1, 01, 00, 15,B1,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46000<cr><lf>",	1, 01, 00, B0,B3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 46666<cr><lf>",	1, 01, 00, 4A,B6,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 48000<cr><lf>",	1, 01, 00, 80,BB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 49333<cr><lf>",	1, 01, 00, B5,C0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50000<cr><lf>",	1, 01, 00, 50,C3,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 50666<cr><lf>",	1, 01, 00, EA,C5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 52000<cr><lf>",	1, 01, 00, 20,CB,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 53333<cr><lf>",	1, 01, 00, 55,D0,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54000<cr><lf>",	1, 01, 00, F0,D2,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 54666<cr><lf>",	1, 01, 00, 8A,D5,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CARRIER 56000<cr><lf>",	1, 01, 00, C0,DA,00,00, 00,00,00,00
