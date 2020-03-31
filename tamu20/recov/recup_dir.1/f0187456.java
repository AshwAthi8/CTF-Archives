;
; Brother Multi Function Device setup file
; Copyright 2001, Brorhter Industories Ltd. All Rights Reserved.
;

[Version]
Signature  = "$Windows NT$"
Class      = MultiFunction
ClassGUID  = {4d36e971-e325-11ce-bfc1-08002be10318}
Provider   = %BROTHER%
LayoutFile = layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%BROTHER% = BrotherMFC,NTamd64

[ControlFlags]
ExcludeFromSelect=*

[BrotherMFC.NTamd64]
;-------------------------------------------------------------------------------
;  LPT devices
;

%Brother_FAX5750% = BRFAX5750A.MFC, LPTENUM\BrotherFAX5750F0E8 ;; ARL
%Brother_FAX-8750P%= BRFAX8750.MFC, LPTENUM\BrotherFAX-8750P181C
%Brother_MFC-9650%= BRMF9650.MFC,LPTENUM\BrotherMFC-9650B86C
%Brother_MFC-8300%= BRMF8300.MFC,LPTENUM\BrotherMFC-8300D4FF
%Brother_MFC-8600%= BRMF8600.MFC,LPTENUM\BrotherMFC-8600D5EF
%Brother_MFC-8700%= BRMF8700.MFC,LPTENUM\BrotherMFC-870015BE
%Brother_MFC-8300J%= BRMF8300J.MFC, LPTENUM\BrotherMFC-8300JB715

%Brother_MFC-9600%= BRMF9600.MFC,LPTENUM\BrotherMFC-9600E86F
%Brother_MFC-9870%= BRMF9870.MFC,LPTENUM\BrotherMFC-98701B0C
%Brother_MFC-9850%= BRMF9850.MFC,LPTENUM\BrotherMFC-98507B0D

%Brother_MFC-9750%= BRMF9750.MFC,LPTENUM\BrotherMFC-9750783D
%Brother_DCP-1200%= BRDCP1200.MFC,LPTENUM\BrotherDCP-120082BB

%Brother_MFC-9600J%= BRMF9600J.MFC,LPTENUM\BrotherMFC-9600JDB29


;; BY4
%Brother_MFC-7300C%= BRMFC7300C.MFC,LPTENUM\BrotherMFC-7300CD080
%Brother_MFC-7400C%= BRMFC7400C.MFC,LPTENUM\BrotherMFC-7400CA481
%Brother_MFC-9200C%= BRMFC9200C.MFC,LPTENUM\BrotherMFC-9200CEDE8
%Brother_MFC-830%  = BRMFC830.MFC  ,LPTENUM\BrotherMFC-8303E01
%Brother_MFC-840%  = BRMFC840.MFC  ,LPTENUM\BrotherMFC-8400E03
%Brother_MFC-860%  = BRMFC860.MFC  ,LPTENUM\BrotherMFC-8606E02
%Brother_MFC-7400J%= BRMFC7400J.MFC,LPTENUM\BrotherMFC-7400JA241
%Brother_MFC-9200J%= BRMFC9200J.MFC,LPTENUM\BrotherMFC-9200JEB28

;;BY2
%Brother_MFC-7150C% = BRMFC7150C.MFC, LPTENUM\_Brother_MFC_7150CFEF0
%Brother_MFC-7160C% = BRMFC7160C.MFC, LPTENUM\_Brother_MFC_7160CFE02
%Brother_MFC-740%   = BRMFC740.MFC,  LPTENUM\_Brother_MFC-740EA4D
%Brother_MFC-9100C% = BRMFC9100C.MFC, LPTENUM\BrotherMFC-9100CA9E8
%Brother_MFC-760%   = BRMFC760.MFC,  LPTENUM\BrotherMFC-7606D30

;;BY1
%Brother_MFC-7000FC% = BRMFC7000FC.MFC, LPTENUM\_Brother_MFC_7000FC8980
%Brother_MFC-7200FC% = BRMFC7200FC.MFC, LPTENUM\_Brother_MFC_7200FC29F8
%Brother_MFC_Pro-700% = BRMFCP700.MFC, LPTENUM\_Brother_MFC_Pro-700AFDB

;;YL3
;; Prt & Scn
%Brother_MFC-9060%     = BRMFC9060.MFC , LPTENUM\BrotherMFC-9060498C
;; Prt, Scn & Mdm
%Brother_MFC-4600%     = BRMFC4600.MFC , LPTENUM\BrotherMFC-460087EC

;;YL2
;; Prt, Scn & Mdm
%Brother_MFC-4650%     = BRMFC4650.MFC  , LPTENUM\_Brother_MFC_465034A5
%Brother_MFC-6650MC%   = BRMFC6650MC.MFC, LPTENUM\_Brother_MFC_6650MCC40F
%Brother_MFC-7750%     = BRMFC7750.MFC  , LPTENUM\_Brother_MFC_7750B0F4
%Brother_MFC-9550%     = BRMFC9550.MFC  , LPTENUM\_Brother_MFC_95509857
;; Prt, Scn
%Brother_MFC-6650J%    = BRMFC6650J.MFC , LPTENUM\_Brother_MFC_6650J4C0C

;;YL1e/YL1
;; Prt, Scn & Mdm
%Brother_MFC-7650MC%   = BRMFC7650MC.MFC, LPTENUM\_Brother_MFC_765070A5

; MFC-P2500/HL_P2500 LPT
%Brother_HL-P2500%   = BRHP2500.MFC, LPTENUM\BrotherHL-P2500_seriE4C4
%Brother_MFC-P2500%  = BRMP2500.MFC, LPTENUM\BrotherMFC-P2500_serD66B


;-------------------------------------------------------------------------------
;  USB devices (Only for Modem)
;
;ZL

%Brother_MFC8600/9650_Series% = BrUsbMdm8600, USB\VID_04F9&PID_0100&MI_02
%Brother_MFC9600/9870_Series% = BrUsbMdm9600, USB\VID_04F9&PID_0101&MI_02
%Brother_MFC-8300J_USB%=BrUsbMdm8300J, USB\VID_04F9&PID_0104&MI_02
%Brother_MFC-9600J_USB%=BrUsbMdm9600J, USB\VID_04F9&PID_0105&MI_02

;BY4
%Brother_MFC-7300C_USB% =BrUsbMdm7300C, USB\VID_04F9&PID_0106&MI_02
%Brother_MFC-7400C_USB% =BrUsbMdm7400C, USB\VID_04F9&PID_0107&MI_02
%Brother_MFC-9200C_USB% =BrUsbMdm9200C, USB\VID_04F9&PID_0108&MI_02
%Brother_MFC-830_USB%   =BrUsbMdm830  , USB\VID_04F9&PID_0109&MI_02
%Brother_MFC-840_USB%   =BrUsbMdm840  , USB\VID_04F9&PID_010A&MI_02
%Brother_MFC-860_USB%   =BrUsbMdm860  , USB\VID_04F9&PID_010B&MI_02
%Brother_MFC-7400J_USB% =BrUsbMdm7400J, USB\VID_04F9&PID_010C&MI_02
%Brother_MFC-9200J_USB% =BrUsbMdm9200J, USB\VID_04F9&PID_010D&MI_02


;-------------------------------------------------------------------------------
; LPT
;-------------------------------------------------------------------------------

;-------------------------------------------------------------------------------
; BRMF9650.MFC
;
[BRMF9650.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF9650.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF9650.MFC.HW]
AddReg=BRMF9650.MFC.RegHW,LowerFilterAddReg.HW

[BRMF9650.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9650#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9650#1
HKR,Child0002,HardwareID,,MF\BRMFC9650LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9650LPT_PRT0

[BRMF9650.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMF8300.MFC
;
[BRMF8300.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF8300.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF8300.MFC.HW]
AddReg=BRMF8300.MFC.RegHW,LowerFilterAddReg.HW

[BRMF8300.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-8300#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-8300#1
HKR,Child0002,HardwareID,,MF\BRMFC8300LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC8300LPT_PRT0

[BRMF8300.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMF8300J.MFC
;
[BRMF8300J.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF8300J.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF8300J.MFC.HW]
AddReg=BRMF8300J.MFC.RegHW,LowerFilterAddReg.HW

[BRMF8300J.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-8300J#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-8300J#1
HKR,Child0002,HardwareID,,MF\BRMFC8300JLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC8300JLPT_PRT0

[BRMF8300J.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRFAX5750A.MFC
;
[BRFAX5750A.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRFAX5750A.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRFAX5750A.MFC.HW]
AddReg=BRFAX5750A.MFC.RegHW,LowerFilterAddReg.HW

[BRFAX5750A.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherFAX5750#0
HKR,Child0001,HardwareID,,MF\BrotherFAX5750#1
HKR,Child0002,HardwareID,,MF\BRFAX5750ALPT_SCN0
HKR,Child0003,HardwareID,,MF\BRFAX5750ALPT_PRT0

[BRFAX5750A.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRFAX8750.MFC
;
[BRFAX8750.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRFAX8750.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRFAX8750.MFC.HW]
AddReg=BRFAX8750.MFC.RegHW,LowerFilterAddReg.HW

[BRFAX8750.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherFAX-8750P#0
HKR,Child0001,HardwareID,,MF\BrotherFAX-8750P#1
HKR,Child0002,HardwareID,,MF\BRFAX8750PLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRFAX8750PLPT_PRT0

[BRFAX8750.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMF8600.MFC
;
[BRMF8600.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF8600.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF8600.MFC.HW]
AddReg=BRMF8600.MFC.RegHW,LowerFilterAddReg.HW

[BRMF8600.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-8600#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-8600#1
HKR,Child0002,HardwareID,,MF\BRMFC8600LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC8600LPT_PRT0

[BRMF8600.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMF8700.MFC
;
[BRMF8700.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF8700.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF8700.MFC.HW]
AddReg=BRMF8700.MFC.RegHW,LowerFilterAddReg.HW

[BRMF8700.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-8700#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-8700#1
HKR,Child0002,HardwareID,,MF\BRMFC8700LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC8700LPT_PRT0

[BRMF8700.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMF9600J.MFC
;
[BRMF9600J.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF9600J.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF9600J.MFC.HW]
AddReg=BRMF9600J.MFC.RegHW,LowerFilterAddReg.HW

[BRMF9600J.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9600J#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9600J#1
HKR,Child0002,HardwareID,,MF\BRMFC9600JLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9600JLPT_PRT0

[BRMF9600J.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMF9600.MFC
;
[BRMF9600.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF9600.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF9600.MFC.HW]
AddReg=BRMF9600.MFC.RegHW,LowerFilterAddReg.HW

[BRMF9600.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9600#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9600#1
HKR,Child0002,HardwareID,,MF\BRMFC9600LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9600LPT_PRT0

[BRMF9600.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMF9870.MFC
;
[BRMF9870.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF9870.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF9870.MFC.HW]
AddReg=BRMF9870.MFC.RegHW,LowerFilterAddReg.HW

[BRMF9870.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9870#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9870#1
HKR,Child0002,HardwareID,,MF\BRMFC9870LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9870LPT_PRT0

[BRMF9870.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMF9850.MFC
;
[BRMF9850.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF9850.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF9850.MFC.HW]
AddReg=BRMF9850.MFC.RegHW,LowerFilterAddReg.HW

[BRMF9850.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9850#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9850#1
HKR,Child0002,HardwareID,,MF\BRMFC9850LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9850LPT_PRT0

[BRMF9850.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMF9750.MFC
;
[BRMF9750.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMF9750.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMF9750.MFC.HW]
AddReg=BRMF9750.MFC.RegHW,LowerFilterAddReg.HW

[BRMF9750.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRMFC9750LPT_SCN0
HKR,Child0001,HardwareID,,MF\BRMFC9750LPT_PRT0

[BRMF9750.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRDCP1200.MFC
;
[BRDCP1200.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRDCP1200.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRDCP1200.MFC.HW]
AddReg=BRDCP1200.MFC.RegHW,LowerFilterAddReg.HW

[BRDCP1200.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRDCP1200LPT_SCN0
HKR,Child0001,HardwareID,,MF\BRDCP1200LPT_PRT0

[BRDCP1200.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRHP2500.MFC
;
[BRHP2500.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRHP2500.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRHP2500.MFC.HW]
AddReg=BRHP2500.MFC.RegHW,LowerFilterAddReg.HW

[BRHP2500.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRHP2500LPT_SCN0
HKR,Child0001,HardwareID,,MF\BRHP2500LPT_PRT0

[BRHP2500.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMP2500.MFC
;
[BRMP2500.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMP2500.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMP2500.MFC.HW]
AddReg=BRMP2500.MFC.RegHW,LowerFilterAddReg.HW

[BRMP2500.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRMP2500LPT_SCN0
HKR,Child0001,HardwareID,,MF\BRMP2500LPT_PRT0

[BRMP2500.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg



;--BY4
;-------------------------------------------------------------------------------
; BRMFC7300C.MFC
;
[BRMFC7300C.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC7300C.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7300C.MFC.HW]
AddReg=BRMFC7300C.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7300C.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-7300C#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-7300C#1
HKR,Child0002,HardwareID,,MF\BRMFC7300CLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7300CLPT_PRT0

[BRMFC7300C.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMFC7400C.MFC
;
[BRMFC7400C.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC7400C.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7400C.MFC.HW]
AddReg=BRMFC7400C.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7400C.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-7400C#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-7400C#1
HKR,Child0002,HardwareID,,MF\BRMFC7400CLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7400CLPT_PRT0

[BRMFC7400C.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC9200C.MFC
;
[BRMFC9200C.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC9200C.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC9200C.MFC.HW]
AddReg=BRMFC9200C.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC9200C.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9200C#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9200C#1
HKR,Child0002,HardwareID,,MF\BRMFC9200CLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9200CLPT_PRT0

[BRMFC9200C.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC830.MFC
;
[BRMFC830.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC830.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC830.MFC.HW]
AddReg=BRMFC830.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC830.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-830#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-830#1
HKR,Child0002,HardwareID,,MF\BRMFC830LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC830LPT_PRT0

[BRMFC830.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC840.MFC
;
[BRMFC840.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC840.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC840.MFC.HW]
AddReg=BRMFC840.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC840.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-840#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-840#1
HKR,Child0002,HardwareID,,MF\BRMFC840LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC840LPT_PRT0

[BRMFC840.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC860.MFC
;
[BRMFC860.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC860.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC860.MFC.HW]
AddReg=BRMFC860.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC860.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-860#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-860#1
HKR,Child0002,HardwareID,,MF\BRMFC860LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC860LPT_PRT0

[BRMFC860.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC7400J.MFC
;
[BRMFC7400J.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC7400J.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7400J.MFC.HW]
AddReg=BRMFC7400J.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7400J.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-7400J#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-7400J#1
HKR,Child0002,HardwareID,,MF\BRMFC7400JLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7400JLPT_PRT0

[BRMFC7400J.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC9200J.MFC
;
[BRMFC9200J.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC9200J.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC9200J.MFC.HW]
AddReg=BRMFC9200J.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC9200J.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9200J#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9200J#1
HKR,Child0002,HardwareID,,MF\BRMFC9200JLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9200JLPT_PRT0

[BRMFC9200J.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

; BY2
;
;-------------------------------------------------------------------------------
; BRMFC7150C.MFC
;
[BRMFC7150C.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.BY.Addreg

[BRMFC7150C.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7150C.MFC.HW]
AddReg=BRMFC7150C.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7150C.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_7150C#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_7150C#1
HKR,Child0002,HardwareID,,MF\BRMFC7150CLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7150CLPT_PRT0

[BRMFC7150C.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC7160C.MFC
;
[BRMFC7160C.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.BY.Addreg

[BRMFC7160C.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7160C.MFC.HW]
AddReg=BRMFC7160C.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7160C.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_7160C#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_7160C#1
HKR,Child0002,HardwareID,,MF\BRMFC7160CLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7160CLPT_PRT0

[BRMFC7160C.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC740.MFC
;
[BRMFC740.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.BY.Addreg

[BRMFC740.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC740.MFC.HW]
AddReg=BRMFC740.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC740.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC-740#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC-740#1
HKR,Child0002,HardwareID,,MF\BRMFC740LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC740LPT_PRT0

[BRMFC740.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC9100C.MFC
;
[BRMFC9100C.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.BY.Addreg

[BRMFC9100C.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC9100C.MFC.HW]
AddReg=BRMFC9100C.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC9100C.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-9100C#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-9100C#1
HKR,Child0002,HardwareID,,MF\BRMFC9100CLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9100CLPT_PRT0

[BRMFC9100C.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC760.MFC
;
[BRMFC760.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.BY.Addreg

[BRMFC760.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC760.MFC.HW]
AddReg=BRMFC760.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC760.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-760#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-760#1
HKR,Child0002,HardwareID,,MF\BRMFC760LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC760LPT_PRT0

[BRMFC760.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; YL2
;-------------------------------------------------------------------------------
; BRMFC7750.MFC
;
[BRMFC7750.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.Addreg

[BRMFC7750.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7750.MFC.HW]
AddReg=BRMFC7750.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7750.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_7750#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_7750#1
HKR,Child0002,HardwareID,,MF\BRMFC7750LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7750LPT_PRT0

[BRMFC7750.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

; BRMFC6650MC.MFC
;
[BRMFC6650MC.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.Addreg

[BRMFC6650MC.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC6650MC.MFC.HW]
AddReg=BRMFC6650MC.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC6650MC.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_6650MC#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_6650MC#1
HKR,Child0002,HardwareID,,MF\BRMFC6650MCLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC6650MCLPT_PRT0

[BRMFC6650MC.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

; BRMFC4650.MFC
;
[BRMFC4650.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.Addreg

[BRMFC4650.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC4650.MFC.HW]
AddReg=BRMFC4650.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC4650.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_4650#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_4650#1
HKR,Child0002,HardwareID,,MF\BRMFC4650LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC4650LPT_PRT0

[BRMFC4650.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

; BRMFC9550.MFC
;
[BRMFC9550.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC9550.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC9550.MFC.HW]
AddReg=BRMFC9550.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC9550.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_9550#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_9550#1
HKR,Child0002,HardwareID,,MF\BRMFC9550LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC9550LPT_PRT0

[BRMFC9550.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


; BRMFC7650MC.MFC
;
[BRMFC7650MC.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg,BrmfcInitializeCommand.Addreg

[BRMFC7650MC.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7650MC.MFC.HW]
AddReg=BRMFC7650MC.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7650MC.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRMFC7650MCLPT_SCN0
HKR,Child0001,HardwareID,,MF\BRMFC7650MCLPT_PRT0

[BRMFC7650MC.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


; BY1
;
;-------------------------------------------------------------------------------
; BRMFC7000FC.MFC
;
[BRMFC7000FC.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC7000FC.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7000FC.MFC.HW]
AddReg=BRMFC7000FC.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7000FC.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_7000FC#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_7000FC#1
HKR,Child0002,HardwareID,,MF\BRMFC7000FCLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7000FCLPT_PRT0

[BRMFC7000FC.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFC7200FC.MFC
;
[BRMFC7200FC.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC7200FC.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC7200FC.MFC.HW]
AddReg=BRMFC7200FC.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC7200FC.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_7200FC#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_7200FC#1
HKR,Child0002,HardwareID,,MF\BRMFC7200FCLPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC7200FCLPT_PRT0

[BRMFC7200FC.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; BRMFCP700.MFC
;
[BRMFCP700.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFCP700.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFCP700.MFC.HW]
AddReg=BRMFCP700.MFC.RegHW,LowerFilterAddReg.HW

[BRMFCP700.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\_Brother_MFC_Pro-700#0
HKR,Child0001,HardwareID,,MF\_Brother_MFC_Pro-700#1
HKR,Child0002,HardwareID,,MF\BRMFCP700LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFCP700LPT_PRT0

[BRMFCP700.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; YL3
;-------------------------------------------------------------------------------


;-------------------------------------------------------------------------------
; BRMFC9060.MFC
;
[BRMFC9060.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC9060.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC9060.MFC.HW]
AddReg=BRMFC9060.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC9060.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRMFC9060LPT_SCN0
HKR,Child0001,HardwareID,,MF\BRMFC9060LPT_PRT0

[BRMFC9060.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; BRMFC4600.MFC
;
[BRMFC4600.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC4600.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC4600.MFC.HW]
AddReg=BRMFC4600.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC4600.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BrotherMFC-4600#0
HKR,Child0001,HardwareID,,MF\BrotherMFC-4600#1
HKR,Child0002,HardwareID,,MF\BRMFC4600LPT_SCN0
HKR,Child0003,HardwareID,,MF\BRMFC4600LPT_PRT0

[BRMFC4600.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;-------------------------------------------------------------------------------
; YL2 Japan
;-------------------------------------------------------------------------------
;-------------------------------------------------------------------------------
; BRMFC6650J.MFC
;
[BRMFC6650J.MFC]
CopyFiles=BrMfcDrv.CopyFiles, MfcRM.CopyFiles, Brbidi.CopyFiles
AddReg=BrmfrsmgLPTPort.Addreg,BrmfrsmgGeneral.Addreg

[BRMFC6650J.MFC.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BRMFC6650J.MFC.HW]
AddReg=BRMFC6650J.MFC.RegHW,LowerFilterAddReg.HW

[BRMFC6650J.MFC.RegHW]	
HKR,Child0000,HardwareID,,MF\BRMFC6650JLPT_SCN0
HKR,Child0001,HardwareID,,MF\BRMFC6650JLPT_PRT0

[BRMFC6650J.MFC.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; USB 
;-------------------------------------------------------------------------------

;--MFC 8600/9650 series-----------------------------------------------------------------------------
;
;
[BrUsbMdm8600]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm8600.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm8600.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm8600.HW]
AddReg=BrUsbMdm8600.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm8600.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm8600.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0100&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0100&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0100_USBMDMP

[BrUsbMdm8600.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-8300J-----------------------------------------------------------------------------
;
;
[BrUsbMdm8300J]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm8300J.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm8300J.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm8300J.HW]
AddReg=BrUsbMdm8300J.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm8300J.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm8300J.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0104&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0104&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0104_USBMDMP

[BrUsbMdm8300J.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC 9600/9870 series-----------------------------------------------------------------------------
;
;
[BrUsbMdm9600]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm9600.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm9600.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm9600.HW]
AddReg=BrUsbMdm9600.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm9600.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm9600.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0101&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0101&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0101_USBMDMP

[BrUsbMdm9600.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-9600J-----------------------------------------------------------------------------
;
;
[BrUsbMdm9600J]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm9600J.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm9600J.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm9600J.HW]
AddReg=BrUsbMdm9600J.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm9600J.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm9600J.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0105&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0105&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0105_USBMDMP

[BrUsbMdm9600J.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;BY4
;--MFC-7400C-----------------------------------------------------------------------------
;
;
[BrUsbMdm7300C]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm7300C.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm7300C.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm7300C.HW]
AddReg=BrUsbMdm7300C.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm7300C.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm7300C.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0106&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0106&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0106_USBMDMP

[BrUsbMdm7300C.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-7400C-----------------------------------------------------------------------------
;
;
[BrUsbMdm7400C]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm7400C.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm7400C.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm7400C.HW]
AddReg=BrUsbMdm7400C.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm7400C.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm7400C.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0107&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0107&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0107_USBMDMP

[BrUsbMdm7400C.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-9200C-----------------------------------------------------------------------------
;
;
[BrUsbMdm9200C]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm9200C.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm9200C.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm9200C.HW]
AddReg=BrUsbMdm9200C.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm9200C.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm9200C.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0108&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0108&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0108_USBMDMP

[BrUsbMdm9200C.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;--MFC-830-----------------------------------------------------------------------------
;
;
[BrUsbMdm830]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm830.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm830.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm830.HW]
AddReg=BrUsbMdm830.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm830.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm830.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_0109&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_0109&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_0109_USBMDMP

[BrUsbMdm830.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-840-----------------------------------------------------------------------------
;
;
[BrUsbMdm840]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm840.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm840.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm840.HW]
AddReg=BrUsbMdm840.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm840.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm840.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_010A&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_010A&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_010A_USBMDMP

[BrUsbMdm840.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-860-----------------------------------------------------------------------------
;
;
[BrUsbMdm860]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm860.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm860.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm860.HW]
AddReg=BrUsbMdm860.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm860.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm860.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_010B&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_010B&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_010B_USBMDMP

[BrUsbMdm860.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-7400J-----------------------------------------------------------------------------
;
;
[BrUsbMdm7400J]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm7400J.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm7400J.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm7400J.HW]
AddReg=BrUsbMdm7400J.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm7400J.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm7400J.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_010C&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_010C&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_010C_USBMDMP

[BrUsbMdm7400J.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;--MFC-9200J-----------------------------------------------------------------------------
;
;
[BrUsbMdm9200J]
CopyFiles=BrSerWdm.CopyFiles,BrUsbMdm.CopyFiles
AddReg=BrUsbMdm9200J.AddReg,BrmfrsmgGeneral.Addreg

[BrUsbMdm9200J.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,BrUsbMdm.sys

[BrUsbMdm9200J.HW]
AddReg=BrUsbMdm9200J.AddReg.HW,LowerFilterAddReg.HW

[BrUsbMdm9200J.Services]
Include = mf.inf
AddService = mf, 2, mf_Service_Inst
AddService = brfilt,  , BrFilt.AddService

[BrUsbMdm9200J.AddReg.HW]
HKR,Child0000,HardwareID,,MF\Vid_04f9&Pid_010D&MI_02#0
HKR,Child0001,HardwareID,,MF\Vid_04f9&Pid_010D&MI_02#1
HKR,Child0002,HardwareID,,MF\BROTHER_VID_04F9&PID_010D_USBMDMP

[BrUsbMdm9200J.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg


;-------------------------------------------------------------------------------
; Resource Manager Access symbolic link
;
[BrmfrsmgLPTPort.Addreg]
HKLM,"SOFTWARE\Brother\BrMfBidi\Lptparam", BrPar1, , "\\.\BRLPTW1"
HKLM,"SOFTWARE\Brother\BrMfBidi\Lptparam", BrPar2, , "\\.\BRLPTW2"
HKLM,"SOFTWARE\Brother\BrMfBidi\Lptparam", BrPar3, , "\\.\BRLPTW3"

[BrmfrsmgGeneral.Addreg]
HKLM,"SOFTWARE\Brother\BrMfBidi\Rsmparam", ResumeSuspendWait, 0x00010001, 0x00001388
HKLM,"SOFTWARE\Brother\BrMfBidi\Rsmparam", EnumLptEnable,     0x00010001, 0x00000001
HKLM,"SOFTWARE\Brother\BrMfBidi\Rsmparam", RegisterModemDeviceInterface,     0x00010001, 0x00000000
HKLM,"SOFTWARE\Brother\BrMfBidi\Rsmparam", CoInstMsgSerEnableOrgMainRestart, 0x00010001, 0x00000001

[BrmfcInitializeCommand.Addreg]
HKLM,"SOFTWARE\Brother\BrCoinst", InitializeATCommand, , "AT+BRPSW76=00"

[BrmfcInitializeCommand.BY.Addreg]
HKLM,"SOFTWARE\Brother\BrCoinst", InitializeATCommand, , "AT+BRPSW76=18"

;-------------------------------------------------------------------------------
; Lower Filter Driver 
;
[LowerFilterAddReg.HW]

HKR,,LowerFilters, 0x00010000, "brfilt"

;----------------------------------------
; CoInstaller
;
[BrCoInstaller.CopyFiles]
brcoinst.dll

[BrCoInstaller_AddReg]
HKR,,CoInstallers32,0x00010000,"brcoinst.dll,BrmfcMFCoInstaller"

;-------------------------------------------------------------------------------
; Brother specific Service 
;
[BrFilt.AddService]
DisplayName    = %BrUsbFil.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %10%\System32\Drivers\Brfilt.sys

;-------------------------------------------------------------------------------
; Copy files
;

[BrMfcDrv.CopyFiles]
BrParwdm.sys
BrSerWdm.sys
BrFilt.sys

[MfcRM.CopyFiles]
BrBidiIf.dll
BrmfBidi.dll
BrmfLpt.dll
BrmfRsmg.exe
BrmfUSB.dll
BrSerIf.dll
BrEvIF.dll
BrScnRsm.dll
RSMGRSTR.dll


[Brbidi.CopyFiles]
BrmfBidi.ini

[BrSerWdm.CopyFiles]
BrSerWdm.sys

[BrUsbMdm.CopyFiles]
BrUsbMdm.sys
BrFilt.sys

[BrCoInstaller.CopyFiles]
brcoinst.dll

;-------------------------------------------------------------------------------
; DestinationDirs
;
[DestinationDirs]
BrMfcDrv.CopyFiles   = 10,System32\Drivers
Brbidi.CopyFiles    = 10
BrSerWdm.CopyFiles = 10,System32\Drivers
BrUsbMdm.CopyFiles = 10,System32\Drivers
DefaultDestDir=11


;-------------------------------------------------------------------------------
; Localizable Strings
;
[Strings]
BROTHER          = "Brother"
series           = "Series"
MFClassName      = "Brother Multifunction Device"

BrUsbMdm.SvcDesc = "Brother MFC USB Modem driver"
BrSerWdm.SvcDesc="Brother Serial driver"
BrParWdm.SvcDesc="Brother WDM Parallel Driver"
BrUsbFil.SvcDesc = "Brother MFC Filter Driver"


;; Model Name
Brother_FAX5750 = "Brother FAX5750"
Brother_FAX-8750P= "Brother FAX-8750P"
Brother_MFC-9650= "Brother MFC-9650"
Brother_MFC-8300= "Brother MFC-8300"
Brother_MFC-8600= "Brother MFC-8600"
Brother_MFC-8700= "Brother MFC-8700"
Brother_MFC-8300J= "Brother MFC-8300J"
Brother_MFC-9600= "Brother MFC-9600"
Brother_MFC-9870= "Brother MFC-9870"
Brother_MFC-9850= "Brother MFC-9850"
Brother_MFC-9750= "Brother MFC-9750"
Brother_DCP-1200= "Brother DCP-1200"
Brother_MFC-9600J= "Brother MFC-9600J"
Brother_MFC-7300C= "Brother MFC-7300C"
Brother_MFC-7400C= "Brother MFC-7400C"
Brother_MFC-9200C= "Brother MFC-9200C"
Brother_MFC-830  = "Brother MFC-830"
Brother_MFC-840  = "Brother MFC-840"
Brother_MFC-860  = "Brother MFC-860"
Brother_MFC-7400J= "Brother MFC-7400J"
Brother_MFC-9200J= "Brother MFC-9200J"
Brother_MFC-7150C = "Brother MFC-7150C"
Brother_MFC-7160C = "Brother MFC-7160C"
Brother_MFC-740   = "Brother MFC-740"
Brother_MFC-9100C = "Brother MFC-9100C"
Brother_MFC-760   = "Brother MFC-760"
Brother_MFC-7000FC = "Brother MFC-7000FC"
Brother_MFC-7200FC = "Brother MFC-7200FC"
Brother_MFC_Pro-700 = "Brother MFC Pro-700"
Brother_MFC-9060     = "Brother MFC-9060"
Brother_MFC-4600     = "Brother MFC-4600"
Brother_MFC-4650     = "Brother MFC-4650"
Brother_MFC-6650MC   = "Brother MFC-6650MC"
Brother_MFC-7750     = "Brother MFC-7750"
Brother_MFC-9550     = "Brother MFC-9550"
Brother_MFC-6650J    = "Brother MFC-6650J"
Brother_HL-P2500   = "Brother HL-P2500"
Brother_MFC-P2500  = "Brother MFC-P2500"
Brother_MFC8600/9650_Series= "Brother MFC8600/9650 Series"
Brother_MFC9600/9870_Series= "Brother MFC9600/9870 Series"
Brother_MFC-7650MC   = "Brother MFC-7650MC"

Brother_MFC-8300J_USB = "Brother MFC-8300J USB"
Brother_MFC-9600J_USB = "Brother MFC-9600J USB"
Brother_MFC-7300C_USB = "Brother MFC-7300C USB"
Brother_MFC-7400C_USB = "Brother MFC-7400C USB"
Brother_MFC-9200C_USB = "Brother MFC-9200C USB"
Brother_MFC-830_USB   = "Brother MFC-830 USB"
Brother_MFC-840_USB   = "Brother MFC-840 USB"
Brother_MFC-860_USB   = "Brother MFC-860 USB"
Brother_MFC-7400J_USB = "Brother MFC-7400J USB"
Brother_MFC-9200J_USB = "Brother MFC-9200J USB"
