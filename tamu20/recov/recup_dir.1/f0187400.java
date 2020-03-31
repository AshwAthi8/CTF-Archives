; 
; Brmfcmdm.INF  -- Brother MFC Modem driver setup file
; Copyright (c) 2000-2001 brother industries,LTD.
; 

[Version]
Signature="$CHICAGO$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%Brother%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*

[Manufacturer]
%Brother%     = Brother,NTamd64

[Brother.NTamd64]
 ;ZL USB
%Brother_MFC8600_9650_Series_Fax_Only% = MDMBIL144, MF\Vid_04f9&Pid_0100&MI_02#0
%Brother_MFC9600_9870_Series_Fax_Only% = MDMBIL144, MF\Vid_04f9&Pid_0101&MI_02#0
%Brother_MFC-8300J_Fax_Only% = MDMBIL144, MF\Vid_04f9&Pid_0104&MI_02#0
%Brother_MFC-9600J_Fax_Only% = MDMBIL144, MF\Vid_04f9&Pid_0105&MI_02#0
;ZL LPT
%Brother_FAX5750_Fax_Only% = MDMBIL144CL2, MF\BrotherFAX5750#0
%Brother_FAX-8750P_Fax_Only% = MDMBIL144CL2, MF\BrotherFAX-8750P#0
%Brother_FAX-9650_Fax_Only% = MDMBIL144, MF\BrotherMFC-9650#0
%Brother_MFC-8300_Fax_Only% = MDMBIL144, MF\BrotherMFC-8300#0
%Brother_MFC-8300J_Fax_Only% = MDMBIL144, MF\BrotherMFC-8300J#0
%Brother_MFC-8600_Fax_Only% = MDMBIL144, MF\BrotherMFC-8600#0
%Brother_MFC-8700_Fax_Only% = MDMBIL144, MF\BrotherMFC-8700#0
%Brother_MFC-9600_Fax_Only% = MDMBIL144, MF\BrotherMFC-9600#0
%Brother_MFC-9600J_Fax_Only% = MDMBIL144, MF\BrotherMFC-9600J#0
%Brother_MFC-9870_Fax_Only% = MDMBIL144, MF\BrotherMFC-9870#0
%Brother_MFC-9850_Fax_Only% = MDMBIL144, MF\BrotherMFC-9850#0


;BY4 USB
%Brother_MFC-7300C_Fax_Only% = MDMBIL144CL2, MF\Vid_04f9&Pid_0106&MI_02#0
%Brother_MFC-7400C_Fax_Only% = MDMBIL144CL2, MF\Vid_04f9&Pid_0107&MI_02#0
%Brother_MFC-9200C_Fax_Only% = MDMBIL144CL2, MF\Vid_04f9&Pid_0108&MI_02#0
%Brother_MFC-830_Fax_Only%   = MDMBIL144CL2, MF\Vid_04f9&Pid_0109&MI_02#0
%Brother_MFC-840_Fax_Only%   = MDMBIL144CL2, MF\Vid_04f9&Pid_010A&MI_02#0
%Brother_MFC-860_Fax_Only%   = MDMBIL144CL2, MF\Vid_04f9&Pid_010B&MI_02#0
%Brother_MFC-7400J_Fax_Only% = MDMBIL144CL2, MF\Vid_04f9&Pid_010C&MI_02#0
%Brother_MFC-9200J_Fax_Only% = MDMBIL144CL2, MF\Vid_04f9&Pid_010D&MI_02#0

;BY4 LPT
%Brother_MFC-7300C_Fax_Only% = MDMBIL144CL2, MF\BrotherMFC-7300C#0
%Brother_MFC-7400C_Fax_Only% = MDMBIL144CL2, MF\BrotherMFC-7400C#0
%Brother_MFC-9200C_Fax_Only% = MDMBIL144CL2, MF\BrotherMFC-9200C#0
%Brother_MFC-830_Fax_Only%   = MDMBIL144CL2, MF\BrotherMFC-830#0
%Brother_MFC-840_Fax_Only%   = MDMBIL144CL2, MF\BrotherMFC-840#0
%Brother_MFC-860_Fax_Only%   = MDMBIL144CL2, MF\BrotherMFC-860#0
%Brother_MFC-7400J_Fax_Only% = MDMBIL144CL2, MF\BrotherMFC-7400J#0
%Brother_MFC-9200J_Fax_Only% = MDMBIL144CL2, MF\BrotherMFC-9200J#0

;BY2
%Brother_MFC-7150C_Fax_Only% = MDMBIL144CL2,MF\_Brother_MFC_7150C#0
%Brother_MFC-7160C_Fax_Only% = MDMBIL144CL2,MF\_Brother_MFC_7160C#0
%Brother_MFC-740_Fax_Only%   = MDMBIL144CL2,MF\_Brother_MFC-740#0
%Brother_MFC-9100C_Fax_Only% = MDMBIL144CL2,MF\BrotherMFC-9100C#0
%Brother_MFC-760_Fax_Only%   = MDMBIL144CL2,MF\BrotherMFC-760#0

;BY1
%Brother_MFC-7000FC_Fax_Only%  = MDMBIL144CL2,MF\_Brother_MFC_7000FC#0
%Brother_MFC-7200FC_Fax_Only%  = MDMBIL144CL2,MF\_Brother_MFC_7200FC#0
%Brother_MFC_Pro-700_Fax_Only% = MDMBIL144CL2,MF\_Brother_MFC_Pro-700#0

;YL3
%Brother_MFC-4600_Fax_Only%   = MDMBIL144CL2,MF\BrotherMFC-4600#0

;YL2
%Brother_MFC-9550_Fax_Only%   = MDMBIL144CL2,MF\_Brother_MFC_9550#0
%Brother_MFC-7750_Fax_Only%   = MDMBIL144CL2,MF\_Brother_MFC_7750#0
%Brother_MFC-6650MC_Fax_Only% = MDMBIL144CL2,MF\_Brother_MFC_6650MC#0
%Brother_MFC-4650_Fax_Only%   = MDMBIL144CL2,MF\_Brother_MFC_4650#0



;
; 
;
[MDMBIL144]
AddReg=All, BrotherAddReg, MDMBIL144Reg, EXTERNAL

[MDMBIL144Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,e1,00,00, 40,38,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,4B,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMBIL144.HW]
AddReg=LowerFilterAddReg.HW

[MDMBIL144.Services]
Addservice = BrSerWdm, 0x00000000, BrSerWdm.AddService

[MDMBIL144.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;
; For Class 2 Only Model
;
[MDMBIL144CL2]
AddReg=All, BrotherAddReg, MDMBIL144CL2Reg, EXTERNAL, Class2Only_AddReg

[MDMBIL144CL2Reg]
HKR,, Properties, 1, 80,01,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 00,00,00,00, 10,01,00,00, 00,e1,00,00, 40,38,00,00
HKR,, DCB, 1, 1C,00,00,00, 00,4B,00,00, 15,20,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[MDMBIL144CL2.HW]
AddReg=LowerFilterAddReg.HW

[MDMBIL144CL2.Services]
Addservice = BrSerWdm, 0x00000000, BrSerWdm.AddService

[MDMBIL144CL2.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;----------------------------------------
; CoInstaller
;
[BrCoInstaller.CopyFiles]
brcoinst.dll

[BrCoInstaller_AddReg]
HKR,,CoInstallers32,0x00010000,"brcoinst.dll,BrmfcMDMCoInstaller"


;-------------------------------------------------------------------------------
; Lower Filter Driver 
;
[LowerFilterAddReg.HW]
HKR,,LowerFilters, 0x00010000, "BrSerWdm"

;--------------------------------------------------
; Add Service
;

[BrSerWdm.AddService]
DisplayName    = %BrSerWdm.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %10%\System32\Drivers\BrSerWdm.sys

[DestinationDirs]
BrCoInstaller.CopyFiles=11
DefaultDestDir = 11

[All]
HKR,,FriendlyDriver,,Unimodem.vxd
HKR,,DevLoader,,*VCOMM
HKR,,ConfigDialog,,modemui.dll
HKR,,PortSubClass,1,02
HKR,,EnumPropPages,,"modemui.dll,EnumPropPages"
HKR,,AdvancedSettings,,""

[EXTERNAL]
HKR,, DeviceType, 1, 01

[Class2Only_AddReg]
HKR, Fax, FixModemClass, ,"2"

[BrotherAddReg]
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
HKR, Settings, DialSuffix,, ";"

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




[Strings]
Brother = "Brother"
BrSerWdm.SvcDesc="Brother WDM Serial driver"
FaxOnly= " Fax Only"
series  = "Series"

;; Model Name
Brother_MFC8600_9650_Series_Fax_Only = "Brother MFC8600 9650 Series Fax Only"
Brother_MFC9600_9870_Series_Fax_Only = "Brother MFC9600 9870 Series Fax Only"
Brother_FAX5750_Fax_Only = "Brother FAX5750 Fax Only"
Brother_MFC-8300J_Fax_Only = "Brother MFC-8300J Fax Only"
Brother_MFC-9600J_Fax_Only = "Brother MFC-9600J Fax Only"
Brother_FAX-8750P_Fax_Only = "Brother FAX-8750P Fax Only"
Brother_FAX-9650_Fax_Only = "Brother FAX-9650 Fax Only"
Brother_MFC-8300_Fax_Only = "Brother MFC-8300 Fax Only"
Brother_MFC-8600_Fax_Only = "Brother MFC-8600 Fax Only"
Brother_MFC-8700_Fax_Only = "Brother MFC-8700 Fax Only"
Brother_MFC-9600_Fax_Only = "Brother MFC-9600 Fax Only"
Brother_MFC-9870_Fax_Only = "Brother MFC-9870 Fax Only"
Brother_MFC-9850_Fax_Only = "Brother MFC-9850 Fax Only"
Brother_MFC-7300C_Fax_Only = "Brother MFC-7300C Fax Only"
Brother_MFC-7400C_Fax_Only = "Brother MFC-7400C Fax Only"
Brother_MFC-9200C_Fax_Only = "Brother MFC-9200C Fax Only"
Brother_MFC-830_Fax_Only = "Brother MFC-830 Fax Only"
Brother_MFC-840_Fax_Only = "Brother MFC-840 Fax Only"
Brother_MFC-860_Fax_Only = "Brother MFC-860 Fax Only"
Brother_MFC-7400J_Fax_Only = "Brother MFC-7400J Fax Only"
Brother_MFC-9200J_Fax_Only = "Brother MFC-9200J Fax Only"
Brother_MFC-7150C_Fax_Only = "Brother MFC-7150C Fax Only"
Brother_MFC-7160C_Fax_Only = "Brother MFC-7160C Fax Only"
Brother_MFC-740_Fax_Only = "Brother MFC-740 Fax Only"
Brother_MFC-9100C_Fax_Only = "Brother MFC-9100C Fax Only"
Brother_MFC-760_Fax_Only = "Brother MFC-760 Fax Only"
Brother_MFC-7000FC_Fax_Only = "Brother MFC-7000FC Fax Only"
Brother_MFC-7200FC_Fax_Only = "Brother MFC-7200FC Fax Only"
Brother_MFC_Pro-700_Fax_Only = "Brother MFC Pro-700 Fax Only"
Brother_MFC-4600_Fax_Only = "Brother MFC-4600 Fax Only"
Brother_MFC-9550_Fax_Only = "Brother MFC-9550 Fax Only"
Brother_MFC-7750_Fax_Only = "Brother MFC-7750 Fax Only"
Brother_MFC-6650MC_Fax_Only = "Brother MFC-6650MC Fax Only"
Brother_MFC-4650_Fax_Only = "Brother MFC-4650 Fax Only"
