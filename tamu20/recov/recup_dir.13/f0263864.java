ot4_CopyFiles = 10,System32\drivers
Dot4Scan_CopyFiles = 10,System32\drivers
Dot4Prt_CopyFiles = 10,System32\drivers
Dot4USB_CopyFiles = 10,System32\drivers

;====================================================

[ClassInstall32]
;
; Add the Dot4 class GUID to SYSTEM\CCS\Control\Class
;
AddReg = Dot4ClassAddReg

[Dot4ClassAddReg]
;
; Give the class a descriptive name and an icon
;
HKR,,,,%ClassName%
HKR,,Icon,,"-4"
HKR,,NoInstallClass,,1


;====================================================


[Manufacturer]
%HP%=HP_Models,NTamd64
%MSFT%=MS_Models,NTamd64

[MS_Models.NTamd64]
%DOT4USB.DeviceDesc% = DOT4USB_Inst,USB\Class_07&SubClass_01&Prot_03,GENERIC_USB_PRINTER


[HP_Models.NTamd64]
;
; This INF supports models with these PnP IDs
; (Enumerated by any enumerator (*))
;
%LJ_1200%       = LJ1200_Inst,LPTENUM\Hewlett-PackardHP_La847D
%LJ_1200_USB%   = LJ1200USB_Inst,USB\Vid_03f0&Pid_0317&Rev_0100,USB\Vid_03f0&Pid_0317
%LJ_1220%       = LJ1220_Inst,LPTENUM\Hewlett-PackardHP_LaE67C
%LJ_1220_USB%   = LJ1220USB_Inst,USB\Vid_03f0&Pid_0417&Rev_0100,USB\Vid_03f0&Pid_0417
%LJ_2200%       = LJ2200_Inst,LPTENUM\Hewlett-PackardHP_LaC27D
%LJ_2200_USB%   = LJ2200USB_Inst,USB\Vid_03f0&Pid_0217&Rev_0100,USB\Vid_03f0&Pid_0217

%LJ_3200%       = LJ3200_Inst,LPTENUM\Hewlett-PackardHP_La3E7C
%LJ_3200M%      = LJ3200_Inst,LPTENUM\Hewlett-PackardHP_LaD4FF
%LJ_3200_USB%   = LJ3200USB_Inst,USB\Vid_03f0&Pid_0117&Rev_0100,USB\Vid_03f0&Pid_0117

%OJ_1150%       = OJet1150_Inst,LPTENUM\HEWLETT-PACKARDOFFIC30A3
%OJ_1170%       = OJet1170_Inst,LPTENUM\HEWLETT-PACKARDOFFIC9D64
%OJ_R40%        = OJetR40_Inst,LPTENUM\HEWLETT-PACKARDOFFIC4ABC
%OJ_R40xi%      = OJetR40xi_Inst,LPTENUM\HEWLETT-PACKARDOFFIC010B
%OJ_R45%        = OJetR45_Inst,LPTENUM\HEWLETT-PACKARDOFFIC497C
%OJ_R60%        = OJetR60_Inst,LPTENUM\HEWLETT-PACKARDOFFIC2ABD
%OJ_R65%        = OJetR65_Inst,LPTENUM\HEWLETT-PACKARDOFFIC297D
%OJ_R80%        = OJetR80_Inst,LPTENUM\HEWLETT-PACKARDOFFIC4AB9
%OJ_R80xi%      = OJetR80xi_Inst,LPTENUM\HEWLETT-PACKARDOFFIC5108
%OJ_PSC%        = OJetPSC_Inst,LPTENUM\HEWLETT-PACKARDPSC_59784
%OJ_G55%        = OJetG55_Inst,LPTENUM\HEWLETT-PACKARDOFFICEB07
%OJ_G55_USB%    = OJetG55USB_Inst,USB\Vid_03f0&Pid_0011&Rev_0100,USB\Vid_03f0&Pid_0011
%OJ_G55xi%      = OJetG55xi_Inst,LPTENUM\HEWLETT-PACKARDOFFIC51A0
%OJ_G55xi_USB%  = OJetG55xiUSB_Inst,USB\Vid_03f0&Pid_0111&Rev_0100,USB\Vid_03f0&Pid_0111


%OJ_G85%                = OJetG85_Inst,LPTENUM\HEWLETT-PACKARDOFFIC7B03
%OJ_G85_USB%    = OJetG85USB_Inst,USB\Vid_03f0&Pid_0211&Rev_0100,USB\Vid_03f0&Pid_0211
%OJ_G85xi%              = OJetG85xi_Inst,LPTENUM\HEWLETT-PACKARDOFFICFDA2
%OJ_G85xi_USB%  = OJetG85xiUSB_Inst,USB\Vid_03f0&Pid_0311&Rev_0100,USB\Vid_03f0&Pid_0311
%OJ_G95%                = OJetG95_Inst,LPTENUM\HEWLETT-PACKARDOFFICEB02
%OJ_G95_USB%    = OJetG95USB_Inst,USB\Vid_03f0&Pid_0411&Rev_0100,USB\Vid_03f0&Pid_0411

%OJ_K60%                = OJetK60_Inst,LPTENUM\HEWLETT-PACKARDOFFIC4AD5
%OJ_K60xi%              = OJetK60xi_Inst,LPTENUM\HEWLETT-PACKARDOFFIC493D
%OJ_K80%                = OJetK80_Inst,LPTENUM\HEWLETT-PACKARDOFFIC2AD1
%OJ_K80xi%              = OJetK80xi_Inst,LPTENUM\HEWLETT-PACKARDOFFICA13F

%OJ_K60_USB%    = OJetK60USB_Inst,USB\Vid_03f0&Pid_0511&Rev_0100,USB\Vid_0xf0&Pid_0511
%OJ_K60xi_USB%  = OJetK60xiUSB_Inst,USB\Vid_03f0&Pid_0611&Rev_0100,USB\Vid_0xf0&Pid_0611
%OJ_K80_USB%    = OJetK80USB_Inst,USB\Vid_03f0&Pid_0711&Rev_0100,USB\Vid_0xf0&Pid_0711
%OJ_K80xi_USB%  = OJetK80xiUSB_Inst,USB\Vid_03f0&Pid_0811&Rev_0100,USB\Vid_0xf0&Pid_0811

%OJ_V30_USB%    = OJetV30USB_Inst,USB\Vid_03f0&Pid_1311&Rev_0100,USB\Vid_0xf0&Pid_1311
%OJ_V40_USB%    = OJetV40USB_Inst,USB\Vid_03f0&Pid_0f11&Rev_0100,USB\Vid_0xf0&Pid_0f11
%OJ_V40xi_USB%  = OJetV40xiUSB_Inst,USB\Vid_03f0&Pid_1011&Rev_0100,USB\Vid_0xf0&Pid_1011
%OJ_V45_USB%    = OJetV45USB_Inst,USB\Vid_03f0&Pid_1911&Rev_0100,USB\Vid_0xf0&Pid_1911

%OJ_720_USB%    = OJet720USB_Inst,USB\Vid_03f0&Pid_1811&Rev_0100,USB\Vid_0xf0&Pid_1811
%OJ_750_USB%    = OJet750USB_Inst,USB\Vid_03f0&Pid_1411&Rev_0100,USB\Vid_0xf0&Pid_1411
%OJ_750xi_USB%  = OJet750xiUSB_Inst,USB\Vid_03f0&Pid_1511&Rev_0100,USB\Vid_0xf0&Pid_1511
%OJ_920_USB%    = OJet920USB_Inst,USB\Vid_03f0&Pid_1f11&Rev_0100,USB\Vid_0xf0&Pid_1f11
%OJ_950_USB%    = OJet950USB_Inst,USB\Vid_03f0&Pid_1e11&Rev_0100,USB\Vid_0xf0&Pid_1e11
;
; Copy files for the W2K installation
;

[DOT4USB_Inst.NT]
CopyFiles=DOT4USB_CopyFiles

[DOT4USB_Inst.NT.HW]
AddReg=DOT4USB_AddReg


[DOT4USB_INST.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[LJ1200_Inst.NT]
AddReg=LJ1200_AddReg
CopyFiles=Dot4_CopyFiles

[LJ1200USB_Inst.NT]
AddReg=LJ1200USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[LJ1220_Inst.NT]
AddReg=LJ1220_AddReg
CopyFiles=Dot4_CopyFiles

[LJ1220USB_Inst.NT]
AddReg=LJ1220USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[LJ2200_Inst.NT]
AddReg=LJ2200_AddReg
CopyFiles=Dot4_CopyFiles

[LJ2200USB_Inst.NT]
AddReg=LJ2200USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[LJ3200_Inst.NT]
AddReg=LJ3200_AddReg
CopyFiles=Dot4_CopyFiles

[LJ3200USB_Inst.NT]
AddReg=LJ3200USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet1150_Inst.NT]
AddReg=OJet1150_AddReg
CopyFiles=Dot4_CopyFiles

[OJet1170_Inst.NT]
AddReg=OJet1170_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR40_Inst.NT]
AddReg=OJetR40_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR40xi_Inst.NT]
AddReg=OJetR40xi_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR45_Inst.NT]
AddReg=OJetR45_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR60_Inst.NT]
AddReg=OJetR60_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR65_Inst.NT]
AddReg=OJetR65_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR80_Inst.NT]
AddReg=OJetR80_AddReg
CopyFiles=Dot4_CopyFiles

[OJetR80xi_Inst.NT]
AddReg=OJetR80xi_AddReg
CopyFiles=Dot4_CopyFiles

[OJetPSC_Inst.NT]
AddReg=OJetPSC_AddReg
CopyFiles=Dot4_CopyFiles

[OJetG55_Inst.NT]
AddReg=OJetG55_AddReg
CopyFiles=Dot4_CopyFiles

[OJetG55USB_Inst.NT]
AddReg=OJetG55USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetG55xi_Inst.NT]
AddReg=OJetG55xi_AddReg
CopyFiles=Dot4_CopyFiles

[OJetG55xiUSB_Inst.NT]
AddReg=OJetG55xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles


[OJetG85_Inst.NT]
AddReg=OJetG85_AddReg
CopyFiles=Dot4_CopyFiles

[OJetG85USB_Inst.NT]
AddReg=OJetG85USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetG85xi_Inst.NT]
AddReg=OJetG85xi_AddReg
CopyFiles=Dot4_CopyFiles

[OJetG85xiUSB_Inst.NT]
AddReg=OJetG85xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetG95_Inst.NT]
AddReg=OJetG95_AddReg
CopyFiles=Dot4_CopyFiles

[OJetG95USB_Inst.NT]
AddReg=OJetG95USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetK60_Inst.NT]
AddReg=OJetK60_AddReg
CopyFiles=Dot4_CopyFiles

[OJetK60USB_Inst.NT]
AddReg=OJetK60USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetK60xi_Inst.NT]
AddReg=OJetK60xi_AddReg
CopyFiles=Dot4_CopyFiles

[OJetK60xiUSB_Inst.NT]
AddReg=OJetK60xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetK80_Inst.NT]
AddReg=OJetK80_AddReg
CopyFiles=Dot4_CopyFiles

[OJetK80USB_Inst.NT]
AddReg=OJetK80USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetK80xi_Inst.NT]
AddReg=OJetK80xi_AddReg
CopyFiles=Dot4_CopyFiles

[OJetK80xiUSB_Inst.NT]
AddReg=OJetK80xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetV30USB_Inst.NT]
AddReg=OJetV30USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetV40USB_Inst.NT]
AddReg=OJetV40USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetV40xiUSB_Inst.NT]
AddReg=OJetV40xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetV45USB_Inst.NT]
AddReg=OJetV45USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetV60USB_Inst.NT]
AddReg=OJetV60USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJetV60xiUSB_Inst.NT]
AddReg=OJetV60xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet720USB_Inst.NT]
AddReg=OJet720USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet750USB_Inst.NT]
AddReg=OJet750USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet750xiUSB_Inst.NT]
AddReg=OJet750xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet780USB_Inst.NT]
AddReg=OJet780USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet780xiUSB_Inst.NT]
AddReg=OJet780xiUSB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet920USB_Inst.NT]
AddReg=OJet920USB_AddReg
CopyFiles=DOT4USB_CopyFiles

[OJet950USB_Inst.NT]
AddReg=OJet950USB_AddReg
CopyFiles=DOT4USB_CopyFiles

;; Three sections to allow need and includes code in OEM infs.
; Copy Base DOT4 driver
[Dot4_OEM]
CopyFiles=Dot4_CopyFiles

; Copy Base DOT4 Scanner driver
[Dot4Scan_OEM]
CopyFiles=Dot4Scan_CopyFiles

; Copy Base DOT4 Print driver
[Dot4Prt_OEM]
CopyFiles=Dot4Prt_CopyFiles

;
; For all this, just one file...
;
[Dot4_CopyFiles]
Dot4.sys

[Dot4USB_CopyFiles]
Dot4usb.sys
Dot4.sys


[Dot4Scan_CopyFiles]
Dot4Scan.sys

[Dot4Prt_CopyFiles]
Dot4Prt.sys

;
; Special configuration info for W2K
;

[LJ1200_Inst.NT.HW]
AddReg=LJ1200_AddReg

[LJ1200USB_Inst.NT.HW]
AddReg=LJ1200USB_AddReg

[LJ1220_Inst.NT.HW]
AddReg=LJ1220_AddReg

[LJ1220USB_Inst.NT.HW]
AddReg=LJ1220USB_AddReg

[LJ2200_Inst.NT.HW]
AddReg=LJ2200_AddReg

[LJ2200USB_Inst.NT.HW]
AddReg=LJ2200USB_AddReg

[LJ3200_Inst.NT.HW]
AddReg=LJ3200_AddReg

[LJ3200USB_Inst.NT.HW]
AddReg=LJ3200USB_AddReg

[OJet1150_Inst.NT.HW]
AddReg=OJet1150_AddReg

[OJet1170_Inst.NT.HW]
AddReg=OJet1170_AddReg

[OJetR40_Inst.NT.HW]
AddReg=OJetR40_AddReg

[OJetR40xi_Inst.NT.HW]
AddReg=OJetR40xi_AddReg

[OJetR45_Inst.NT.HW]
AddReg=OJetR45_AddReg

[OJetR60_Inst.NT.HW]
AddReg=OJetR60_AddReg

[OJetR65_Inst.NT.HW]
AddReg=OJetR65_AddReg

[OJetR80_Inst.NT.HW]
AddReg=OJetR80_AddReg

[OJetR80xi_Inst.NT.HW]
AddReg=OJetR80xi_AddReg


[OJetPSC_Inst.NT.HW]
AddReg=OJetPSC_AddReg

[OJetG55_Inst.NT.HW]
AddReg=OJetG55_AddReg

[OJetG55USB_Inst.NT.HW]
AddReg=OJetG55USB_AddReg

[OJetG55xi_Inst.NT.HW]
AddReg=OJetG55xi_AddReg

[OJetG55xiUSB_Inst.NT.HW]
AddReg=OJetG55xiUSB_AddReg

[OJetG85_Inst.NT.HW]
AddReg=OJetG85_AddReg

[OJetG85USB_Inst.NT.HW]
AddReg=OJetG85USB_AddReg

[OJetG85xi_Inst.NT.HW]
AddReg=OJetG85xi_AddReg

[OJetG85xiUSB_Inst.NT.HW]
AddReg=OJetG85xiUSB_AddReg

[OJetG95_Inst.NT.HW]
AddReg=OJetG95_AddReg

[OJetG95USB_Inst.NT.HW]
AddReg=OJetG95USB_AddReg

[OJetK60_Inst.NT.HW]
AddReg=OJetK60_AddReg

[OJetK60USB_Inst.NT.HW]
AddReg=OJetK60USB_AddReg

[OJetK60xi_Inst.NT.HW]
AddReg=OJetK60xi_AddReg

[OJetK60xiUSB_Inst.NT.HW]
AddReg=OJetK60xiUSB_AddReg


[OJetK80_Inst.NT.HW]
AddReg=OJetK80_AddReg

[OJetK80USB_Inst.NT.HW]
AddReg=OJetK80USB_AddReg

[OJetK80xi_Inst.NT.HW]
AddReg=OJetK80xi_AddReg

[OJetK80xiUSB_Inst.NT.HW]
AddReg=OJetK80xiUSB_AddReg

[OJetV30USB_Inst.NT.HW]
AddReg=OJetV30USB_AddReg

[OJetV40USB_Inst.NT.HW]
AddReg=OJetV40USB_AddReg

[OJetV40xiUSB_Inst.NT.HW]
AddReg=OJetV40xiUSB_AddReg

[OJetV45USB_Inst.NT.HW]
AddReg=OJetV45USB_AddReg

[OJetV60USB_Inst.NT.HW]
AddReg=OJetV60USB_AddReg

[OJetV60xiUSB_Inst.NT.HW]
AddReg=OJetV60xiUSB_AddReg

[OJet720USB_Inst.NT.HW]
AddReg=OJet720USB_AddReg

[OJet750USB_Inst.NT.HW]
AddReg=OJet750USB_AddReg

[OJet750xiUSB_Inst.NT.HW]
AddReg=OJet750xiUSB_AddReg

[OJet780USB_Inst.NT.HW]
AddReg=OJet780USB_AddReg

[OJet780xiUSB_Inst.NT.HW]
AddReg=OJet780xiUSB_AddReg

[OJet920USB_Inst.NT.HW]
AddReg=OJet920USB_AddReg

[OJet950USB_Inst.NT.HW]
AddReg=OJet950USB_AddReg
;
; Add keys under Enum\enumeratorID\device-instance-id
; These keys name all the "functions" a Dot4 device
; supports. A Friendly-name for the function lives in
; this key.
;

[DOT4USB_AddReg]
HKR,,"LowerFilters",0x00010000,"dot4usb"
HKR,%Printer_Func%,"Description",,%GENERIC_DOT4_PRINT%

[LJ1200_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_1200_Print%
HKLM,%LJ_1200_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%LJ_1200_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%LJ_1200_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[LJ1200USB_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_1200_Print%
HKR,,"LowerFilters",0x00010000,"dot4usb"

[LJ1220_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_1220_Print%
HKLM,%LJ_1220_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%LJ_1220_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%LJ_1220_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[LJ1220USB_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_1220_Print%
HKR,,"LowerFilters",0x00010000,"dot4usb"

[LJ2200_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_2200_Print%
HKLM,%LJ_2200_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%LJ_2200_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%LJ_2200_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[LJ2200USB_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_2200_Print%
HKR,,"LowerFilters",0x00010000,"dot4usb"

[LJ3200_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_3200_Print%
HKLM,%LJ_3200_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%LJ_3200_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%LJ_3200_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[LJ3200USB_AddReg]
HKR,%Printer_Func%,"Description",,%LJ_3200_Print%
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet1150_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_1150%
HKR,%Scanner_Func%,"Description",,%OJ_1150_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_1150_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_1150_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_1150_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJet1170_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_1170%
HKR,%Scanner_Func%,"Description",,%OJ_1170_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_1170_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_1170_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_1170_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR40_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R40_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R40_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R40_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R40_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R40_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR40xi_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R40xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R40xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R40xi_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R40xi_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R40xi_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR45_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R45_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R45_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R45_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R45_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R45_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR60_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R60_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R60_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R60_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R60_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R60_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR65_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R65_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R65_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R65_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R65_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R65_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR80_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R80_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R80_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R80_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R80_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R80_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetR80xi_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_R80xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_R80xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_R80xi_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_R80xi_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_R80xi_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetPSC_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_PSC_Print%
HKR,%Scanner_Func%,"Description",,%OJ_PSC_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_PSC_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_PSC_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_PSC_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetG55_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G55_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G55_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_G55_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_G55_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_G55_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetG55USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G55_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G55_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetG55xi_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G55xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G55xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_G55xi_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_G55xi_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_G55xi_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetG55xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G55xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G55xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetG85_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G85_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G85_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_G85_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_G85_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_G85_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetG85USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G85_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G85_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetG85xi_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G85xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G85xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_G85xi_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_G85xi_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_G85xi_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetG85xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G85xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G85xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetG95_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G95_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G95_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_G95_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_G95_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_G95_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetG95USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_G95_Print%
HKR,%Scanner_Func%,"Description",,%OJ_G95_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetK60_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K60_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K60_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_K60_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_K60_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_K60_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetK60USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K60_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K60_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetK60xi_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K60xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K60xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_K60xi_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_K60xi_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_K60xi_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetK60xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K60xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K60xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetK80_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K80_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K80_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_K80_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_K80_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_K80_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetK80USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K80_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K80_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetK80xi_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K80xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K80xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKLM,%OJ_K80xi_DOT3%,%ParFwdSkip%,0x00010001,0x60
HKLM,%OJ_K80xi_DOT3%,%ParRevSkip%,0x00010001,0x778
HKLM,%OJ_K80xi_DOT3%,%ParResetChannel%,0x00010001, 0x4e

[OJetK80xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_K80xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_K80xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetV30USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_V30_Print%
HKR,%Scanner_Func%,"Description",,%OJ_V30_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetV40USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_V40_Print%
HKR,%Scanner_Func%,"Description",,%OJ_V40_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetV40xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_V40xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_V40xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetV45USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_V45_Print%
HKR,%Scanner_Func%,"Description",,%OJ_V45_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetV60USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_V60_Print%
HKR,%Scanner_Func%,"Description",,%OJ_V60_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJetV60xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_V60xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_V60xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet720USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_720_Print%
HKR,%Scanner_Func%,"Description",,%OJ_720_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet750USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_750_Print%
HKR,%Scanner_Func%,"Description",,%OJ_750_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet750xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_750xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_750xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet780USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_780_Print%
HKR,%Scanner_Func%,"Description",,%OJ_780_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet780xiUSB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_780xi_Print%
HKR,%Scanner_Func%,"Description",,%OJ_780xi_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet920USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_920_Print%
HKR,%Scanner_Func%,"Description",,%OJ_920_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

[OJet950USB_AddReg]
HKR,%Printer_Func%,"Description",,%OJ_950_Print%
HKR,%Scanner_Func%,"Description",,%OJ_950_Scan%
HKR,%Policy%,%CreditOnZeroLength%,0x00010001,0x1
HKR,%Policy%,%PiggyBackCredit%,0x00010001,0x1
HKR,,"LowerFilters",0x00010000,"dot4usb"

;
; Add the Dot4 driver as a service in W2K
;

[LJ1200_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[LJ1200USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[LJ1220_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[LJ1220USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[LJ2200_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[LJ2200USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[LJ3200_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[LJ3200USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJet1150_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJet1170_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR40_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR40xi_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR45_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR60_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR65_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR80_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetR80xi_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetPSC_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetG55_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetG55USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetG55xi_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetG55xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetG85_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetG85USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetG85xi_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetG85xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetG95_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetG95USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetK60_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetK60USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetK60xi_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetK60xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetK80_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetK80USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetK80xi_Inst.NT.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[OJetK80xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetV30USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetV40USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetV40xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetV45USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJetV60USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst


[OJetV60xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJet720USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJet750USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJet750xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJet780USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst


[OJet780xiUSB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst


[OJet920USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

[OJet950USB_Inst.NT.Services]
AddService = dot4,0x00000002,DOT4_Inst
AddService = dot4usb,,DOT4USB_Service_Inst

;
; Service configuration info
;
[Dot4_Inst]
DisplayName     = %Dot4_Name%
ServiceType     = 1             ; Kernel driver
StartType       = 3             ; Manual start
ErrorControl    = 1             ; Error ignore
ServiceBinary   = %12%\Dot4.sys

[DOT4USB_Service_Inst]
DisplayName    = %DOT4USB_NAME% "Dot4USB Filter"
ServiceType    = 1 ;KERNEL_DRIVER
StartType      = 3 ;DEMAND START
ErrorControl   = 0 ;ERROR_IGNORE
ServiceBinary  = %12%\dot4usb.sys
LoadOrderGroup = extended base

;====================================================

;;
;; Exported services sections for use in manufacturer specific INF files
;;

[DOT4.GlobalSection]
Addreg=
CopyFiles=DOT4.CopySys32Files
AddService = dot4, 0x00000002, DOT4.AddService

[DOT4.Services]
AddService=Dot4,0x00000002,Dot4_Inst

[DOT4.CopySys32Files ]
dot4.sys

[DOT4.AddService]
;
; Service configuration info
;
DisplayName     = %Dot4_Name%
ServiceType     = 1             ; Kernel driver
StartType       = 3             ; Manual start
ErrorControl    = 1             ; Error ignore
ServiceBinary   = %12%\Dot4.sys
;LoadOrderGroup = Base
































;====================================================
[Strings]
ntcd                = "Windows XP CD-ROM"
MSFT                = "Microsoft"
Dot4_Name           = "MS IEEE-1284.4 Driver"
DOT4USB_NAME        = "Dot4USB Filter"
ClassName           = "IEEE 1284.4 devices"
HP                  = "HP"
Floppy_Description  = "Disk"
Printer_Func        = "Functions\PRINT"
Scanner_Func        = "Functions\SCAN"
ParFwdSkip          = "ParFwdSkip"
ParRevSkip          = "ParRevSkip"
ParResetChannel     = "ParRC"
Policy              = "Policy"
CreditOnZeroLength  = "CreditOnZeroLength"
PiggyBackCredit     = "PiggyBackCredit"

;
; Parallel Device model specific strings
;
LJ_1200             = "HP LaserJet 1200"
LJ_1200_USB         = "HP LaserJet 1200 USB"
LJ_1200_DOT3        = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDLaserJet_1200"
LJ_1200_Print       = "HP LaserJet 1200 Printer"

LJ_1220             = "HP LaserJet 1220"
LJ_1220_USB         = "HP LaserJet 1220 USB"
LJ_1220_DOT3        = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDLaserJet_1220"
LJ_1220_Print       = "HP LaserJet 1220 Printer"

LJ_2200             = "HP LaserJet 2200"
LJ_2200_USB         = "HP LaserJet 2200 USB"
LJ_2200_DOT3        = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDLaserJet_2200"
LJ_2200_Print       = "HP LaserJet 2200 Printer"

LJ_3200             = "HP LaserJet 3200"
LJ_3200_USB         = "HP LaserJet 3200 USB"
LJ_3200_DOT3        = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDLaserJet_3200"
LJ_3200_Print       = "HP LaserJet 3200 Printer"
LJ_3200M            = "HP LaserJet 3200M"

OJ_1150             = "HP OfficeJet 1150C Printer"
OJ_1150_DOT3        = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_PRO_1150C"
OJ_1150_Scan        = "HP OfficeJet 1150C Scanner"
OJ_1170             = "HP OfficeJet 1170C Printer"
OJ_1170_DOT3        = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_PRO_1170C_SERIES"
OJ_1170_Scan        = "HP OfficeJet 1170C Scanner"
OJ_R40              = "HP OfficeJet R40"
OJ_R40_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R40"
OJ_R40_Print        = "HP OfficeJet R40 Printer"
OJ_R40_Scan         = "HP OfficeJet R40 Scanner"
OJ_R40xi            = "HP OfficeJet R40xi"
OJ_R40xi_DOT3       = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R40xi"
OJ_R40xi_Print      = "HP OfficeJet R40xi Printer"
OJ_R40xi_Scan       = "HP OfficeJet R40xi Scanner"
OJ_R45              = "HP OfficeJet R45"
OJ_R45_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R45"
OJ_R45_Print        = "HP OfficeJet R45 Printer"
OJ_R45_Scan         = "HP OfficeJet R45 Scanner"
OJ_R60              = "HP OfficeJet R60"
OJ_R60_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R60"
OJ_R60_Print        = "HP OfficeJet R60 Printer"
OJ_R60_Scan         = "HP OfficeJet R60 Scanner"
OJ_R65              = "HP OfficeJet R65"
OJ_R65_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R65"
OJ_R65_Print        = "HP OfficeJet R65 Printer"
OJ_R65_Scan         = "HP OfficeJet R65 Scanner"
OJ_R80              = "HP OfficeJet R80"
OJ_R80_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R80"
OJ_R80_Print        = "HP OfficeJet R80 Printer"
OJ_R80_Scan         = "HP OfficeJet R80 Scanner"
OJ_R80xi            = "HP OfficeJet R80xi"
OJ_R80xi_DOT3       = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_R80xi"
OJ_R80xi_Print      = "HP OfficeJet R80xi Printer"
OJ_R80xi_Scan       = "HP OfficeJet R80xi Scanner"
OJ_PSC              = "HP PSC 500"
OJ_PSC_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDPSC_500"
OJ_PSC_Print        = "HP PSC 500 Printer"
OJ_PSC_Scan         = "HP PSC 500 Scanner"
OJ_G55              = "HP OfficeJet G55"
OJ_G55_USB          = "HP OfficeJet G55 USB"
OJ_G55_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_G55"
OJ_G55_Print        = "HP OfficeJet G55 Printer"
OJ_G55_Scan         = "HP OfficeJet G55 Scanner"
OJ_G55xi            = "HP OfficeJet G55xi"
OJ_G55xi_USB        = "HP OfficeJet G55xi USB"
OJ_G55xi_DOT3       = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_G55xi"
OJ_G55xi_Print      = "HP OfficeJet G55xi Printer"
OJ_G55xi_Scan       = "HP OfficeJet G55xi Scanner"
OJ_G85              = "HP OfficeJet G85"
OJ_G85_USB          = "HP OfficeJet G85 USB"
OJ_G85_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_G85"
OJ_G85_Print        = "HP OfficeJet G85 Printer"
OJ_G85_Scan         = "HP OfficeJet G85 Scanner"
OJ_G85xi            = "HP OfficeJet G85xi"
OJ_G85xi_USB        = "HP OfficeJet G85xi USB"
OJ_G85xi_DOT3       = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_G85xi"
OJ_G85xi_Print      = "HP OfficeJet G85xi Printer"
OJ_G85xi_Scan       = "HP OfficeJet G85xi Scanner"
OJ_G95              = "HP OfficeJet G95"
OJ_G95_USB          = "HP OfficeJet G95 USB"
OJ_G95_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_G95"
OJ_G95_Print        = "HP OfficeJet G95 Printer"
OJ_G95_Scan         = "HP OfficeJet G95 Scanner"

OJ_K60              = "HP OfficeJet K60"
OJ_K60_USB          = "HP OfficeJet K60 USB"
OJ_K60_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET__K60"
OJ_K60_Print        = "HP OfficeJet K60 Printer"
OJ_K60_Scan         = "HP OfficeJet K60 Scanner"

OJ_K60xi                    = "HP OfficeJet K60xi"
OJ_K60xi_USB        = "HP OfficeJet K60xi USB"
OJ_K60xi_DOT3       = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET__K60xi"
OJ_K60xi_Print      = "HP OfficeJet K60xi Printer"
OJ_K60xi_Scan       = "HP OfficeJet K60xi Scanner"

OJ_K80              = "HP OfficeJet K80"
OJ_K80_USB          = "HP OfficeJet K80 USB"
OJ_K80_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET__K80"
OJ_K80_Print        = "HP OfficeJet K80 Printer"
OJ_K80_Scan         = "HP OfficeJet K80 Scanner"

OJ_K80xi                    = "HP OfficeJet K80xi"
OJ_K80xi_USB        = "HP OfficeJet K80xi USB"
OJ_K80xi_DOT3       = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET__K80xi"
OJ_K80xi_Print      = "HP OfficeJet K80xi Printer"
OJ_K80xi_Scan       = "HP OfficeJet K80xi Scanner"

OJ_V30                          = "HP OfficeJet V30"
OJ_V30_USB          = "HP OfficeJet V30 USB"
OJ_V30_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_V30"
OJ_V30_Print        = "HP OfficeJet V30 Printer"
OJ_V30_Scan         = "HP OfficeJet V30 Scanner"

OJ_V40              = "HP OfficeJet V40"
OJ_V40_USB          = "HP OfficeJet V40 USB"
OJ_V40_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_V40"
OJ_V40_Print        = "HP OfficeJet V40 Printer"
OJ_V40_Scan         = "HP OfficeJet V40 Scanner"

OJ_V40xi                    = "HP OfficeJet V40xi"
OJ_V40xi_USB          = "HP OfficeJet V40xi USB"
OJ_V40xi_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_V40xi"
OJ_V40xi_Print        = "HP OfficeJet V40xi Printer"
OJ_V40xi_Scan         = "HP OfficeJet V40xi Scanner"

OJ_V45                          = "HP OfficeJet V45"
OJ_V45_USB          = "HP OfficeJet V45 USB"
OJ_V45_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_V45"
OJ_V45_Print        = "HP OfficeJet V45 Printer"
OJ_V45_Scan         = "HP OfficeJet V45 Scanner"

OJ_V60              = "HP OfficeJet V60"
OJ_V60_USB          = "HP OfficeJet V60 USB"
OJ_V60_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_V60"
OJ_V60_Print        = "HP OfficeJet V60 Printer"
OJ_V60_Scan         = "HP OfficeJet V60 Scanner"

OJ_V60xi                    = "HP OfficeJet V60xi"
OJ_V60xi_USB          = "HP OfficeJet V60xi USB"
OJ_V60xi_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDOFFICEJET_V60xi"
OJ_V60xi_Print        = "HP OfficeJet V60xi Printer"
OJ_V60xi_Scan         = "HP OfficeJet V60xi Scanner"

OJ_720                          = "HP PSC 720"
OJ_720_USB          = "HP PSC 720 USB"
OJ_720_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDPSC_720"
OJ_720_Print        = "HP PSC 720 Printer"
OJ_720_Scan         = "HP PSC 720 Scanner"

OJ_750              = "HP PSC 750"
OJ_750_USB          = "HP PSC 750 USB"
OJ_750_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDPSC_750"
OJ_750_Print        = "HP PSC 750 Printer"
OJ_750_Scan         = "HP PSC 750 Scanner"

OJ_750xi                    = "HP PSC 750xi"
OJ_750xi_USB          = "HP PSC 750xi USB"
OJ_750xi_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDPSC_750xi"
OJ_750xi_Print        = "HP PSC 750xi Printer"
OJ_750xi_Scan         = "HP PSC 750xi Scanner"

OJ_780              = "HP PSC 780"
OJ_780_USB          = "HP PSC 780 USB"
OJ_780_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDPSC_780"
OJ_780_Print        = "HP PSC 780 Printer"
OJ_780_Scan         = "HP PSC 780 Scanner"

OJ_780xi                    = "HP PSC 780xi"
OJ_780xi_USB          = "HP PSC 780xi USB"
OJ_780xi_DOT3         = "System\CurrentControlSet\Control\Dot3\HEWLETT-PACKARDPSC_780xi"
OJ_780xi_Print        = "HP PSC 780xi Printer"
OJ_780xi_Scan         = "HP PSC 780xi Scanner"

OJ_920              = "HP PSC 920"
OJ_920_USB          = "HP PSC 920 USB"
OJ_920_Print        = "HP PSC 920 Printer"
OJ_920_Scan         = "HP PSC 920 Scanner"

OJ_950              = "HP PSC 950"
OJ_950_USB          = "HP PSC 950 USB"
OJ_950_Print        = "HP PSC 950 Printer"
OJ_950_Scan         = "HP PSC 950 Scanner"
;
; USB Device model specific strings
;
DOT4USB.DeviceDesc   = "DOT4 USB Printing Support"
GENERIC_DOT4_PRINT   = "Generic IEEE 1284.4 printing support"
