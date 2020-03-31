; This is the INF file for modems supported using generic 
; command set information.  
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*PNPC100
ExcludeFromSelect=*PNPC101
ExcludeFromSelect=*PNPC102
ExcludeFromSelect=*PNPC103
ExcludeFromSelect=*PNPC104
ExcludeFromSelect=*PNPC105
ExcludeFromSelect=*PNPC106
ExcludeFromSelect=*PNPC107
ExcludeFromSelect=*PNPC108
ExcludeFromSelect=*PNPC109
ExcludeFromSelect=*PNPC10A
ExcludeFromSelect=*PNPC10B
ExcludeFromSelect=*PNPC10C
ExcludeFromSelect=*PNPC10D
ExcludeFromSelect=*PNPC10E
ExcludeFromSelect=*PNPC10F
ExcludeFromSelect=*PNPC200
ExcludeFromSelect=MDMGEN
ExcludeFromSelect=MDMUNK
ExcludeFromSelect=PCI\VEN_14F1&DEV_2443
ExcludeFromSelect=PCI\VEN_14F1&DEV_2046
ExcludeFromSelect=PCI\VEN_14F1&DEV_2043
ExcludeFromSelect=PCI\VEN_14F1&DEV_2044
ExcludeFromSelect=PCI\VEN_14F1&DEV_2045
ExcludeFromSelect=PCI\VEN_14F1&DEV_2143
ExcludeFromSelect=PCI\VEN_14F1&DEV_2013
ExcludeFromSelect=PCI\VEN_14F1&DEV_2014
ExcludeFromSelect=PCI\VEN_14F1&DEV_2015
ExcludeFromSelect=PCI\VEN_14F1&DEV_2016
ExcludeFromSelect=PCI\VEN_127A&DEV_2443
ExcludeFromSelect=PCI\VEN_127A&DEV_2046
ExcludeFromSelect=PCI\VEN_127A&DEV_2043
ExcludeFromSelect=PCI\VEN_127A&DEV_2044
ExcludeFromSelect=PCI\VEN_127A&DEV_2045
ExcludeFromSelect=PCI\VEN_127A&DEV_2143
ExcludeFromSelect=PCI\VEN_127A&DEV_2013
ExcludeFromSelect=PCI\VEN_127A&DEV_2014
ExcludeFromSelect=PCI\VEN_127A&DEV_2015
ExcludeFromSelect=PCI\VEN_127A&DEV_2016
ExcludeFromSelect=MF\FE560_DEV0

InteractiveInstall=*PNPC100
InteractiveInstall=*PNPC101
InteractiveInstall=*PNPC102
InteractiveInstall=*PNPC103
InteractiveInstall=*PNPC104
InteractiveInstall=*PNPC105
InteractiveInstall=*PNPC106
InteractiveInstall=*PNPC107
InteractiveInstall=*PNPC108
InteractiveInstall=*PNPC109
InteractiveInstall=*PNPC10A
InteractiveInstall=*PNPC10B
InteractiveInstall=*PNPC10C
InteractiveInstall=*PNPC10D
InteractiveInstall=*PNPC10E
InteractiveInstall=*PNPC10F
InteractiveInstall=*PNPC200
InteractiveInstall=MDMGEN
InteractiveInstall=MDMUNK

[Manufacturer]
%Generic%     = Generic,NTamd64
%Unsupported% = Unsupported,NTamd64

[Generic.NTamd64]
%Gen%    = Gen,    MDMGEN
%GenUNK%    = Gen, MDMUNK   ; unknown or unidentified standard modem, hidden from picklist, NT5
%Gen3%   = Gen3,   MDMGEN3
%Gen12%  = Gen12,  MDMGEN12
%Gen24%  = Gen24,  MDMGEN24
%Gen96%  = Gen96,  MDMGEN96
%Gen144% = Gen144, MDMGEN144
%Gen192% = Gen192, MDMGEN192
%Gen288% = Gen288, MDMGEN288
%Gen336% = Gen336, MDMGEN336
%Gen556% = Gen556F, Moto1_Gen
%PNPC100% = PNPC100, *PNPC100
%PNPC101% = PNPC101, *PNPC101
%PNPC102% = PNPC102, *PNPC102
%PNPC103% = PNPC103, *PNPC103
%PNPC104% = PNPC104, *PNPC104
%PNPC105% = PNPC105, *PNPC105
%PNPC106% = PNPC106, *PNPC106
%PNPC107% = PNPC107, *PNPC107
%PNPC108% = PNPC108, *PNPC108
%PNPC109% = PNPC109, *PNPC109
%PNPC10A% = PNPC10A, *PNPC10A
%PNPC10B% = PNPC10B, *PNPC10B
%PNPC10C% = PNPC10C, *PNPC10C
%PNPC10D% = PNPC10D, *PNPC10D
%PNPC10E% = PNPC10E, *PNPC10E
%PNPC10F% = PNPC10F, *PNPC10F
%PNPC200% = PNPC200, *PNPC200
;Linksys modem
%PNPC200% = PNPC200, MF\FE560_DEV0
%PNPC200% = PNPC200, MF\PCMLM56_DEV0

[Unsupported.NTamd64]
%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2443
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2046
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2043
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2044
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2045
%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2143
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2013
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2014
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2015
;%Unsupported1% = Gen24I, PCI\VEN_14F1&DEV_2016
%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2443
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2046
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2043
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2044
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2045
%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2143
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2013
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2014
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2015
;%Unsupported1% = Gen24I, PCI\VEN_127A&DEV_2016

[Gen24I]
AddReg=PCMCIA_GEN,GenReg,INTERNAL

[Gen24I.Services]
AddService = , %SPSVCINST_ASSOCSERVICE%                 ; null service install

[Gen]
AddReg=All, GenericAddReg, GenReg, EXTERNAL

[Gen3]
AddReg=All, GenericAddReg, Gen3Reg, EXTERNAL

[Gen12]
AddReg=All, GenericAddReg, Gen12Reg, EXTERNAL

[Gen24]
AddReg=All, GenericAddReg, Gen24Reg, EXTERNAL

[Gen96]
AddReg=All, GenericAddReg, Gen96Reg, EXTERNAL

[Gen144]
AddReg=All, GenericAddReg, Gen144Reg, EXTERNAL

[Gen192]
AddReg=All, GenericAddReg, Gen192Reg, EXTERNAL

[Gen288]
AddReg=All, GenericAddReg, Gen288Reg, EXTERNAL

[Gen336]
AddReg=All, GenericAddReg, Gen336Reg, EXTERNAL

[Gen556f]
Include=mdmgl006.inf
AddReg=All, GenFAddReg, MDMGL006.Common, MDMGL006.56KResponses, EXTERNAL

[PNPC100]
AddReg=All, GenericAddReg, Gen96Reg, EXTERNAL

[PNPC101]
AddReg=All, GenericAddReg, Gen144Reg, EXTERNAL

[PNPC102]
AddReg=All, GenericAddReg, Gen288Reg, EXTERNAL

[PNPC103]
AddReg=All, GenericAddReg, GenAnyReg, EXTERNAL

[PNPC104]
AddReg=All, GenericAddReg, EnhancedAddReg, Enh96Reg, EXTERNAL

[PNPC105]
AddReg=All, GenericAddReg, EnhancedAddReg, Enh144Reg, EXTERNAL

[PNPC106]
AddReg=All, GenericAddReg, EnhancedAddReg, Enh288Reg, EXTERNAL

[PNPC107]
AddReg=All, GenericAddReg, EnhancedAddReg, EnhAnyReg, EXTERNAL

[PNPC108]
AddReg=All, GenericAddReg, Gen96Reg, INTERNAL

[PNPC109]
AddReg=All, GenericAddReg, Gen144Reg, INTERNAL

[PNPC10A]
AddReg=All, GenericAddReg, Gen288Reg, INTERNAL

[PNPC10B]
AddReg=All, GenericAddReg, GenAnyReg, INTERNAL

[PNPC10C]
AddReg=All, GenericAddReg, EnhancedAddReg, Enh96Reg, INTERNAL

[PNPC10D]
AddReg=All, GenericAddReg, EnhancedAddReg, Enh144Reg, INTERNAL

[PNPC10E]
AddReg=All, GenericAddReg, EnhancedAddReg, Enh288Reg, INTERNAL

[PNPC10F]
AddReg=All, GenericAddReg, EnhancedAddReg, EnhAnyReg, INTERNAL

[PNPC200]
; Generic PCMCIA, specified as compat id for unknown pcmcia modems.
; PCMCIA_GEN overrides GenReg behavior of assuming speeds >= 38400
; are DTE speeds, which doesn't work with Megahertz xj4288, cc4288 
; pcmcia modems, which return connect 23400. GenReg doesn't specify 
; DCB, so there is no uppper bound on post speed and 
; in practice 115K is used
AddReg=All, GenericAddReg, GenReg, PCMCIA, PCMCIA_GEN

[GenReg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,c2,01,00, 00,c2,01,00

[Gen3Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 2c,01,00,00, 2c,01,00,00
HKR,, DCB, 1, 1C,00,00,00, 2C,01,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen12Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, b0,04,00,00, b0,04,00,00
HKR,, DCB, 1, 1C,00,00,00, B0,04,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen24Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 80,25,00,00, 60,09,00,00
HKR,, DCB, 1, 1C,00,00,00, 60,09,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen96Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,96,00,00, 80,25,00,00
HKR,, DCB, 1, 1C,00,00,00, 80,25,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen144Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,e1,00,00, 40,38,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,4B,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen192Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,c2,01,00, 00,4b,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,4B,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen288Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,c2,01,00, 80,70,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,96,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Gen336Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,C2,01,00, 40,83,00,00

[Gen556Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 5A,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,C2,01,00, 00,E1,00,00
HKR,, DCB, 1, 1C,00,00,00, C0,DA,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[GenFAddReg]
; properties & settings for combined Rockwell/Lucent 56K generic modem support Used to be in mdmmoto1
HKR,, Properties, 1, 80,01,00,00, FF,00,00,00, 00,00,00,00, 07,00,00,00, 0F,00,00,00, B0,03,00,00, 00,C2,01,00, C0,DA,00,00
HKR, Init,      2,, "AT &F E0 &C1 &D2 V1 S0=0<cr>"
HKR, Settings, SpeedNegotiation_Off,, "N0"
HKR, Settings, SpeedNegotiation_On,	, "N1"

[GenAnyReg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,c2,01,00, 00,c2,01,00
HKR,, DCB, 1, 1C,00,00,00, 80,25,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Enh96Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 07,00,00,00, 0f,00,00,00, 10,03,00,00, 00,96,00,00, 80,25,00,00
HKR,, DCB, 1, 1C,00,00,00, 80,25,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Enh144Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 07,00,00,00, 0f,00,00,00, 10,03,00,00, 00,e1,00,00, 40,38,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,4B,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[Enh288Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 07,00,00,00, 0f,00,00,00, 10,03,00,00, 00,c2,01,00, 80,70,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,96,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[EnhAnyReg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 07,00,00,00, 0f,00,00,00, 10,03,00,00, 00,c2,01,00, 00,c2,01,00
HKR,, DCB, 1, 1C,00,00,00, 80,25,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"

[GenFAddReg]
HKR,,ConfigDialog,,modemui.dll
HKR,,DevLoader,,*vcomm
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,,FriendlyDriver,,Unimodem.VXD
HKR,, InactivityScale, 1, 0a,00,00,00
HKR,,PortSubClass,1,02
HKR,, Reset,, "AT&F<cr>"
HKR, Answer, 1,, "ATA<cr>"
HKR, Hangup, 1,, "ATH<cr>"
HKR, Init, 1,, "AT<cr>"
HKR, Init, 2,, "AT&FE0V1&C1&D2S95=47S0=0<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
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
HKR, Settings, SpeakerVolume_Low,, "L0"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, Tone,, "T"

[EXTERNAL]
HKR,, DeviceType, 1, 01

[INTERNAL]
HKR,, DeviceType, 1, 02

[PCMCIA]
HKR,,PortDriver,,Serial.vxd
HKR,,Contention,,*vcd
HKR,, DeviceType, 1, 03

[EnhancedAddReg]
HKR, Settings, DialSuffix,, ";"
HKR, Settings, Blind_Off,, "X4"
HKR, Settings, Blind_On,, "X3"
HKR, Settings, SpeakerVolume_Low,, "L0"
HKR, Settings, SpeakerVolume_Med,, "L2"
HKR, Settings, SpeakerVolume_High,, "L3"
HKR, Settings, SpeakerMode_Off,, "M0"
HKR, Settings, SpeakerMode_Dial,, "M1"
HKR, Settings, SpeakerMode_On,, "M2"
HKR, Settings, SpeakerMode_Setup,, "M3"

[GenericAddReg]
HKR, Init, 1,, "AT<cr>"
HKR, Init, 2,, "ATE0V1<cr>"
HKR, Monitor, 1,, "ATS0=0<cr>"
HKR, Monitor, 2,, "None"
HKR, Answer, 1,, "ATA<cr>"
HKR, Hangup, 1,, "ATH<cr>"
HKR,, Reset,, "ATZ<cr>"
HKR, Settings, Prefix,, "AT"
HKR, Settings, Terminator,, "<cr>"
HKR, Settings, DialPrefix,, "D"
HKR, Settings, Pulse,, "P"
HKR, Settings, Tone,, "T"

HKR, Settings, FlowControl_Off,,  ""
HKR, Settings, FlowControl_Hard,, ""
HKR, Settings, FlowControl_Soft,, ""

; DTE/DCE speeds will not be exact for generic modems because we will
; treat CONNECT ### as a DCE speed when some modems will report it as DTE.
HKR, Responses, "<cr>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<lf>",        1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>OK<cr><lf>",          1, 00, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>RING<cr><lf>",        1, 08, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO CARRIER<cr><lf>",  1, 04, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>ERROR<cr><lf>",       1, 03, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO DIALTONE<cr><lf>", 1, 05, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>BUSY<cr><lf>",        1, 06, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>NO ANSWER<cr><lf>",   1, 07, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "<cr><lf>CONNECT<cr><lf>",     1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "0<cr>",       1, 00, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "2<cr>",       1, 08, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "3<cr>",       1, 04, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "4<cr>",       1, 03, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "6<cr>",       1, 05, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "7<cr>",       1, 06, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "8<cr>",       1, 07, 00, 00,00,00,00, 00,00,00,00 
HKR, Responses, "OK",          1, 00, 00, 00,00,00,00, 00,00,00,00
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
HKR, Responses, "RINGING",     1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DIALING",     1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "RRING",       1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "DELAYED",     1, 1d, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "BLACKLISTED", 1, 1c, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "+FCERROR",    1, 03, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "CONNECT",                 1, 02, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/ARQ",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/REL",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/MNP",             1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/LAP-M",           1, 02, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/V42BIS",          1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT/V42b",            1, 02, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300",             1, 02, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/ARQ",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/REL",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/MNP",         1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/LAP-M",       1, 02, 02, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/V42BIS",      1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 300/V42b",        1, 02, 03, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600",             1, 02, 00, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/ARQ",         1, 02, 02, 58,02,00,00, 00,00,00,00
HKR, Responses, "CONNECT 600/REL",         1, 02, 02, 58,02,00,00, 00,00,00,00
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
HKR, Responses, "CONNECT 2400/MNP",        1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/LAP-M",      1, 02, 02, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/V42BIS",     1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 2400/V42b",       1, 02, 03, 60,09,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800",            1, 02, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/ARQ",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/REL",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/MNP",        1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/LAP-M",      1, 02, 02, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/V42BIS",     1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 4800/V42b",       1, 02, 03, C0,12,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200",            1, 02, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/ARQ",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/REL",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/MNP",        1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/LAP-M",      1, 02, 02, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/V42BIS",     1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 7200/V42b",       1, 02, 03, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600",            1, 02, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/ARQ",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/REL",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/MNP",        1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/LAP-M",      1, 02, 02, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/V42BIS",     1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 9600/V42b",       1, 02, 03, 80,25,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000",           1, 02, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/ARQ",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/REL",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/MNP",       1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/LAP-M",     1, 02, 02, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/V42BIS",    1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 12000/V42b",      1, 02, 03, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400",           1, 02, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/ARQ",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/REL",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/MNP",       1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/LAP-M",     1, 02, 02, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/V42BIS",    1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 14400/V42b",      1, 02, 03, 40,38,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800",           1, 02, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/ARQ",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/REL",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/MNP",       1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/LAP-M",     1, 02, 02, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/V42BIS",    1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 16800/V42b",      1, 02, 03, A0,41,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200",           1, 02, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/ARQ",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/REL",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/MNP",       1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/LAP-M",     1, 02, 02, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/V42BIS",    1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 19200/V42b",      1, 02, 03, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CONNECT 21600",           1, 02, 00, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 21600/ARQ",       1, 02, 02, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 21600/REL",       1, 02, 02, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 21600/MNP",       1, 02, 02, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 21600/LAP-M",     1, 02, 02, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 21600/V42BIS",    1, 02, 03, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 21600/V42b",      1, 02, 03, 60,54,00,00, 00,00,00,00 
HKR, Responses, "CONNECT 24000",           1, 02, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/ARQ",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/REL",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/MNP",       1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/LAP-M",     1, 02, 02, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/V42BIS",    1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 24000/V42b",      1, 02, 03, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400",           1, 02, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/ARQ",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/REL",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/MNP",       1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/LAP-M",     1, 02, 02, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/V42BIS",    1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 26400/V42b",      1, 02, 03, 20,67,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800",           1, 02, 00, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/ARQ",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/REL",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/MNP",       1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/LAP-M",     1, 02, 02, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/V42BIS",    1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 28800/V42b",      1, 02, 03, 80,70,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400",           1, 02, 00, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 38400/ARQ",       1, 02, 02, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 38400/REL",       1, 02, 02, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 38400/MNP",       1, 02, 02, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 38400/LAP-M",     1, 02, 02, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 38400/V42BIS",    1, 02, 03, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 38400/V42b",      1, 02, 03, 00,00,00,00, 00,96,00,00
HKR, Responses, "CONNECT 57600",           1, 02, 00, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 57600/ARQ",       1, 02, 02, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 57600/REL",       1, 02, 02, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 57600/MNP",       1, 02, 02, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 57600/LAP-M",     1, 02, 02, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 57600/V42BIS",    1, 02, 03, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 57600/V42b",      1, 02, 03, 00,00,00,00, 00,E1,00,00
HKR, Responses, "CONNECT 115200",          1, 02, 00, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115200/ARQ",      1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115200/REL",      1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115200/MNP",      1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115200/LAP-M",    1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115200/V42BIS",   1, 02, 03, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115200/V42b",     1, 02, 03, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200",         1, 02, 00, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200/ARQ",     1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200/REL",     1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200/MNP",     1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200/LAP-M",   1, 02, 02, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200/V42BIS",  1, 02, 03, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 115,200/V42b",    1, 02, 03, 00,00,00,00, 00,C2,01,00
HKR, Responses, "CONNECT 230400",          1, 02, 00, 00,00,00,00, 00,84,03,00
HKR, Responses, "CONNECT 230400/ARQ",      1, 02, 02, 00,00,00,00, 00,84,03,00
HKR, Responses, "CONNECT 230400/REL",      1, 02, 02, 00,00,00,00, 00,84,03,00
HKR, Responses, "CONNECT 230400/MNP",      1, 02, 02, 00,00,00,00, 00,84,03,00
HKR, Responses, "CONNECT 230400/LAP-M",    1, 02, 02, 00,00,00,00, 00,84,03,00
HKR, Responses, "CONNECT 230400/V42BIS",   1, 02, 03, 00,00,00,00, 00,84,03,00
HKR, Responses, "CONNECT 230400/V42b",     1, 02, 03, 00,00,00,00, 00,84,03,00

HKR, Responses, "CARRIER 300",     1, 01, 00, 2C,01,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200",    1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 1200/75", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 75/1200", 1, 01, 00, B0,04,00,00, 00,00,00,00
HKR, Responses, "CARRIER 2400",    1, 01, 00, 60,09,00,00, 00,00,00,00
HKR, Responses, "CARRIER 4800",    1, 01, 00, C0,12,00,00, 00,00,00,00
HKR, Responses, "CARRIER 7200",    1, 01, 00, 20,1C,00,00, 00,00,00,00
HKR, Responses, "CARRIER 9600",    1, 01, 00, 80,25,00,00, 00,00,00,00
HKR, Responses, "CARRIER 12000",   1, 01, 00, E0,2E,00,00, 00,00,00,00
HKR, Responses, "CARRIER 14400",   1, 01, 00, 40,38,00,00, 00,00,00,00
HKR, Responses, "CARRIER 16800",   1, 01, 00, A0,41,00,00, 00,00,00,00
HKR, Responses, "CARRIER 19200",   1, 01, 00, 00,4B,00,00, 00,00,00,00
HKR, Responses, "CARRIER 21600",   1, 01, 00, 60,54,00,00, 00,00,00,00
HKR, Responses, "CARRIER 24000",   1, 01, 00, C0,5D,00,00, 00,00,00,00
HKR, Responses, "CARRIER 26400",   1, 01, 00, 20,67,00,00, 00,00,00,00
HKR, Responses, "CARRIER 28800",   1, 01, 00, 80,70,00,00, 00,00,00,00

HKR, Responses, "COMPRESSION: CLASS 5",  1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: MNP5",     1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42BIS",  1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 BIS", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42bis",  1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: V.42 bis", 1, 01, 03, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: ADC",      1, 01, 01, 00,00,00,00, 00,00,00,00
HKR, Responses, "COMPRESSION: NONE",     1, 01, 00, 00,00,00,00, 00,00,00,00

HKR, Responses, "PROTOCOL: NONE",                   1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ERROR-CONTROL/LAPB",     1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ERROR-CONTROL/LAPB/HDX", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ERROR-CONTROL/LAPB/AFT", 1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: X.25/LAPB",              1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: X.25/LAPB/HDX",          1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: X.25/LAPB/AFT",          1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAPM",                   1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M",                  1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAPM/HDX",               1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M/HDX",              1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAPM/AFT",               1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: LAP-M/AFT",              1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT",                    1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: ALT-CELLULAR",           1, 01, 0A, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP",                    1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP2",                   1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP3",                   1, 01, 02, 00,00,00,00, 00,00,00,00
HKR, Responses, "PROTOCOL: MNP4",                   1, 01, 02, 00,00,00,00, 00,00,00,00

HKR, Responses, "AUTOSTREAM: LEVEL 1", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "AUTOSTREAM: LEVEL 2", 1, 01, 00, 00,00,00,00, 00,00,00,00
HKR, Responses, "AUTOSTREAM: LEVEL 3", 1, 01, 00, 00,00,00,00, 00,00,00,00

; 33.6 responses
HKR,Responses,"CARRIER 31200 V.23",1,01,00,E0,79,00,0,0,0,0,0	
HKR,Responses,"CARRIER 31200",1,01,00,E0,79,00,0,0,0,0,0	
HKR,Responses,"CARRIER 31200/VFC", 1,01,00,E0,79,00,0,0,0,0,0	
HKR,Responses,"CARRIER 33600 V.23",1,01,00,40,83,00,0,0,0,0,0	
HKR,Responses,"CARRIER 33600",1,01,00,40,83,00,0,0,0,0,0	
HKR,Responses,"CARRIER 33600/VFC", 1,01,00,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 EC", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 EC/V42", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 EC/V42BIS", 1,02,03,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 REL", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 REL/MNP5", 1,02,03,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 REL/V42", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200 REL/V42BIS", 1,02,03,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200", 1,02,00,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/ARQ", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/LAP-M", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/MNP", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/REL", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/REL-LAPM V.42 BIS", 1,02,03,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/REL-LAPM", 1,02,02,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/V42B", 1,02,03,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/V42BIS", 1,02,03,E0,79,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 EC", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 EC/V42", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 EC/V42BIS", 1,02,03,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 REL", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 REL/MNP5", 1,02,03,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 REL/V42", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600 REL/V42BIS", 1,02,03,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600", 1,02,00,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/ARQ", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/LAP-M", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/MNP", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/REL", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/REL-LAPM V.42 BIS", 1,02,03,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/REL-LAPM", 1,02,02,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/V42B", 1,02,03,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 33600/V42BIS", 1,02,03,40,83,00,0,0,0,0,0	
HKR,Responses,"CONNECT 31200/REL-MNP",1,02,02,E0,79,00,0,0,0,0,0
HKR,Responses,"CONNECT 33600/REL-MNP",1,02,02,40,83,00,0,0,0,0,0

;56K Responses
HKR,Responses,"0<cr>",1,00,00,00,00,00,00,00,00,00,00
HKR,Responses,"1<cr>",1,02,00,2C,01,00,00,00,00,00,00
HKR,Responses,"2<cr>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"3<cr>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"4<cr>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"5<cr>",1,02,00,B0,04,00,00,00,00,00,00
HKR,Responses,"6<cr>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"7<cr>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"8<cr>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>BUSY<cr><lf>",1,06,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO ANSWER<cr><lf>",1,07,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO CARRIER<cr><lf>",1,04,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIAL TONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>NO DIALTONE<cr><lf>",1,05,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RING<cr><lf>",1,08,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>RINGING<cr><lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>VOICE<cr><lf>",1,03,00,00,00,00,00,00,00,00,00
HKR,Responses,"<lf>",1,01,00,00,00,00,00,00,00,00,00
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/MNP<cr><lf>",1,2,2,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/ARQ/x2/LAPM<cr><lf>",1,2,2,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 57333/x2/NONE<cr><lf>",1,2,0,F5,DF,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/MNP<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/ARQ/x2/LAPM<cr><lf>",1,2,2,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 56000/x2/NONE<cr><lf>",1,2,0,C0,DA,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/MNP<cr><lf>",1,2,2,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/ARQ/x2/LAPM<cr><lf>",1,2,2,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 54666/x2/NONE<cr><lf>",1,2,0,8A,D5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/MNP<cr><lf>",1,2,2,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/ARQ/x2/LAPM<cr><lf>",1,2,2,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 53333/x2/NONE<cr><lf>",1,2,0,55,D0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/MNP<cr><lf>",1,2,2,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/ARQ/x2/LAPM<cr><lf>",1,2,2,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 52000/x2/NONE<cr><lf>",1,2,0,20,CB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/MNP<cr><lf>",1,2,2,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/ARQ/x2/LAPM<cr><lf>",1,2,2,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 50666/x2/NONE<cr><lf>",1,2,0,EA,C5,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/MNP<cr><lf>",1,2,2,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/ARQ/x2/LAPM<cr><lf>",1,2,2,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 49333/x2/NONE<cr><lf>",1,2,0,B5,C0,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/MNP<cr><lf>",1,2,2,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/ARQ/x2/LAPM<cr><lf>",1,2,2,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 48000/x2/NONE<cr><lf>",1,2,0,80,BB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/MNP<cr><lf>",1,2,2,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/ARQ/x2/LAPM<cr><lf>",1,2,2,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 46666/x2/NONE<cr><lf>",1,2,0,4A,B6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/MNP<cr><lf>",1,2,2,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/ARQ/x2/LAPM<cr><lf>",1,2,2,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 45333/x2/NONE<cr><lf>",1,2,0,15,B1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/MNP<cr><lf>",1,2,2,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/ARQ/x2/LAPM<cr><lf>",1,2,2,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 44000/x2/NONE<cr><lf>",1,2,0,E0,AB,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/MNP<cr><lf>",1,2,2,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/ARQ/x2/LAPM<cr><lf>",1,2,2,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 42666/x2/NONE<cr><lf>",1,2,0,AA,A6,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/MNP<cr><lf>",1,2,2,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/ARQ/x2/LAPM<cr><lf>",1,2,2,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 41333/x2/NONE<cr><lf>",1,2,0,75,A1,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP/MNP5<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/V42BIS<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM/MNP5<cr><lf>",1,2,3,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/MNP<cr><lf>",1,2,2,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/ARQ/x2/LAPM<cr><lf>",1,2,2,D5,91,00,0,0,0,0,0
HKR,Responses,"<cr><lf>CONNECT 37333/x2/NONE<cr><lf>",1,2,0,D5,91,00,0,0,0,0,0


[PCMCIA_GEN]  ; custom override responses, generic pcmcia modems
HKR, Responses, "CONNECT 38400",           1, 02, 00, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/ARQ",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/REL",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/MNP",       1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/LAP-M",     1, 02, 02, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/V42BIS",    1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 38400/V42b",      1, 02, 03, 00,96,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600",           1, 02, 00, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/ARQ",       1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/REL",       1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/MNP",       1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/LAP-M",     1, 02, 02, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/V42BIS",    1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 57600/V42b",      1, 02, 03, 00,E1,00,00, 00,00,00,00
HKR, Responses, "CONNECT 115200",          1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/ARQ",      1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/REL",      1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/MNP",      1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/LAP-M",    1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/V42BIS",   1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115200/V42b",     1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200",         1, 02, 00, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/ARQ",     1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/REL",     1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/MNP",     1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/LAP-M",   1, 02, 02, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/V42BIS",  1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 115,200/V42b",    1, 02, 03, 00,C2,01,00, 00,00,00,00
HKR, Responses, "CONNECT 230400",          1, 02, 00, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/ARQ",      1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/REL",      1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/MNP",      1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/LAP-M",    1, 02, 02, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/V42BIS",   1, 02, 03, 00,84,03,00, 00,00,00,00
HKR, Responses, "CONNECT 230400/V42b",     1, 02, 03, 00,84,03,00, 00,00,00,00


[Strings]

MSFT = "Microsoft"

Generic = "(Standard Modem Types)"
Gen    = "Standard Modem"
GenUNK = "Unknown Modem"
Gen3   = "Standard   300 bps Modem"
Gen12  = "Standard  1200 bps Modem"
Gen24  = "Standard  2400 bps Modem"
Gen96  = "Standard  9600 bps Modem"
Gen144 = "Standard 14400 bps Modem"
Gen192 = "Standard 19200 bps Modem"
Gen288 = "Standard 28800 bps Modem"
Gen336 = "Standard 33600 bps Modem"
Gen556 = "Standard 56000 bps Modem"
PNPC100 = "Standard 9600 bps Modem"
PNPC101 = "Standard 14400 bps Modem"
PNPC102 = "Standard 28800 bps Modem"
PNPC103 = "Standard Modem"
PNPC104 = "Standard 9600 bps Modem"
PNPC105 = "Standard 14400 bps Modem"
PNPC106 = "Standard 28800 bps Modem"
PNPC107 = "Standard Modem"
PNPC108 = "Standard 9600 bps Modem"
PNPC109 = "Standard 14400 bps Modem"
PNPC10A = "Standard 28800 bps Modem"
PNPC10B = "Standard Modem"
PNPC10C = "Standard 9600 bps Modem"
PNPC10D = "Standard 14400 bps Modem"
PNPC10E = "Standard 28800 bps Modem"
PNPC10F = "Standard Modem"
PNPC200 = "Standard PCMCIA Card Modem"


unsupported  = "Microsoft"
Unsupported1 = "Unsupported SoftK56 Data Fax PCI Modem"
SPSVCINST_ASSOCSERVICE = 0x00000002

