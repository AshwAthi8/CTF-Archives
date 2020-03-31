; 
; Brother MFC Modem port inf 
; Copyright (c) 2001 Brother Industries Ltd. 2000-2001
; 

[Version]
LayoutFile=layout.inf
Signature="$CHICAGO$"
Class=Ports
ClassGUID={4d36e978-e325-11ce-bfc1-08002be10318}
Provider=%Brother%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*

[Manufacturer]
%Brother%     = Brother,NTamd64

[Brother.NTamd64]
;
; LPT
;
;;ZL
%Brother_FAX-5750% = BRCOM, MF\BrotherFAX5750#1
%Brother_FAX-8750P% = BRCOM, MF\BrotherFAX-8750P#1
%Brother_MFC-8300% = BRCOM, MF\BrotherMFC-8300#1
%Brother_MFC-8300J% = BRCOM, MF\BrotherMFC-8300J#1
%Brother_MFC-8600% = BRCOM, MF\BrotherMFC-8600#1
%Brother_MFC-8700% = BRCOM, MF\BrotherMFC-8700#1
%Brother_MFC-9600% = BRCOM, MF\BrotherMFC-9600#1
%Brother_MFC-9600J% = BRCOM, MF\BrotherMFC-9600J#1
%Brother_MFC-9650% = BRCOM, MF\BrotherMFC-9650#1
%Brother_MFC-9870% = BRCOM, MF\BrotherMFC-9870#1
%Brother_MFC-9850% = BRCOM, MF\BrotherMFC-9850#1

;; BY4
%Brother_MFC-7300C% = BRCOM, MF\BrotherMFC-7300C#1
%Brother_MFC-7400C% = BRCOM, MF\BrotherMFC-7400C#1
%Brother_MFC-9200C% = BRCOM, MF\BrotherMFC-9200C#1
%Brother_MFC-830%   = BRCOM, MF\BrotherMFC-830#1
%Brother_MFC-840%   = BRCOM, MF\BrotherMFC-840#1
%Brother_MFC-860%   = BRCOM, MF\BrotherMFC-860#1
%Brother_MFC-7400J% = BRCOM, MF\BrotherMFC-7400J#1
%Brother_MFC-9200J% = BRCOM, MF\BrotherMFC-9200J#1

;BY2
%Brother_MFC-7150C% = BRCOM,MF\_Brother_MFC_7150C#1
%Brother_MFC-7160C% = BRCOM,MF\_Brother_MFC_7160C#1
%Brother_MFC-740%   = BRCOM,MF\_Brother_MFC-740#1
%Brother_MFC-9100C% = BRCOM,MF\BrotherMFC-9100C#1
%Brother_MFC-760%   = BRCOM,MF\BrotherMFC-760#1

;BY1
%Brother_MFC-7000FC%  = BRCOM,MF\_Brother_MFC_7000FC#1
%Brother_MFC-7200FC%  = BRCOM,MF\_Brother_MFC_7200FC#1
%Brother_MFC_Pro-700% = BRCOM,MF\_Brother_MFC_Pro-700#1

;YL3
%Brother_MFC-4600%   = BRCOM,MF\BrotherMFC-4600#1

;YL2
%Brother_MFC-9550%   = BRCOM,MF\_Brother_MFC_9550#1
%Brother_MFC-7750%   = BRCOM,MF\_Brother_MFC_7750#1
%Brother_MFC-6650MC% = BRCOM,MF\_Brother_MFC_6650MC#1
%Brother_MFC-4650%   = BRCOM,MF\_Brother_MFC_4650#1


;
; USB
;
;ZL
%Brother_MFC8600/9650_Series% = BRCOM, MF\Vid_04f9&Pid_0100&MI_02#1
%Brother_MFC9600/9870_Series% = BRCOM, MF\Vid_04f9&Pid_0101&MI_02#1
%Brother_MFC-8300J% = BRCOM, MF\Vid_04f9&Pid_0104&MI_02#1
%Brother_MFC-9600J% = BRCOM, MF\Vid_04f9&Pid_0105&MI_02#1
;BY4
%Brother_MFC-7300C% = BRCOM, MF\Vid_04f9&Pid_0106&MI_02#1
%Brother_MFC-7400C% = BRCOM, MF\Vid_04f9&Pid_0107&MI_02#1
%Brother_MFC-9200C% = BRCOM, MF\Vid_04f9&Pid_0108&MI_02#1
%Brother_MFC-830%   = BRCOM, MF\Vid_04f9&Pid_0109&MI_02#1
%Brother_MFC-840%   = BRCOM, MF\Vid_04f9&Pid_010A&MI_02#1
%Brother_MFC-860%   = BRCOM, MF\Vid_04f9&Pid_010B&MI_02#1
%Brother_MFC-7400J% = BRCOM, MF\Vid_04f9&Pid_010C&MI_02#1
%Brother_MFC-9200J% = BRCOM, MF\Vid_04f9&Pid_010D&MI_02#1

[BRCOM]
CopyFiles=BRCOM.CopyFiles
AddReg=BRCOM_Reg

[BRCOM_Reg]
HKR,,PortSubClassOther,1,01

[BRCOM.CoInstallers]
CopyFiles=BrCoInstaller.CopyFiles
AddReg=BrCoInstaller_AddReg

;----------------------------------------
; CoInstaller
;
[BrCoInstaller.CopyFiles]
brcoinst.dll

[BrCoInstaller_AddReg]
HKR,,CoInstallers32,0x00010000,"brcoinst.dll,BrmfPortCoInstaller"


[BRCOM.Services]
Addservice = BrSerWdm, 0x00000002, BrSerWdm.AddService

[BrSerWdm.AddService]
DisplayName    = %BrSerWdm.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %10%\System32\Drivers\BrSerWdm.sys

[DestinationDirs]
BRCOM.CopyFiles = 10,System32\Drivers
BrCoInstaller.CopyFiles = 11 ; System Dir( system32 on NT )
DefaultDestDir = 11

[BRCOM.CopyFiles]
BrSerWdm.sys


[Strings]
Brother = "Brother"
8series  = "Series"
BrSerWdm.SvcDesc="Brother Serial driver"

;; Model Name
Brother_FAX-5750 = "Brother FAX5750"
Brother_FAX-8750P = "Brother FAX-8750P"
Brother_MFC-8300 = "Brother MFC-8300"
Brother_MFC-8300J = "Brother MFC-8300J"
Brother_MFC-8600 = "Brother MFC-8600"
Brother_MFC-8700 = "Brother MFC-8700"
Brother_MFC-9600 = "Brother MFC-9600"
Brother_MFC-9600J = "Brother MFC-9600J"
Brother_MFC-9650 = "Brother MFC-9650"
Brother_MFC-9870 = "Brother MFC-9870"
Brother_MFC-9850 = "Brother MFC-9850"
Brother_MFC-7300C = "Brother MFC-7300C"
Brother_MFC-7400C = "Brother MFC-7400C"
Brother_MFC-9200C = "Brother MFC-9200C"
Brother_MFC-830 = "Brother MFC-830"
Brother_MFC-840 = "Brother MFC-840"
Brother_MFC-860 = "Brother MFC-860"
Brother_MFC-7400J = "Brother MFC-7400J"
Brother_MFC-9200J = "Brother MFC-9200J"
Brother_MFC-7150C = "Brother MFC-7150C"
Brother_MFC-7160C = "Brother MFC-7160C"
Brother_MFC-740 = "Brother MFC-740"
Brother_MFC-9100C = "Brother MFC-9100C"
Brother_MFC-760 = "Brother MFC-760"
Brother_MFC-7000FC = "Brother MFC-7000FC"
Brother_MFC-7200FC = "Brother MFC-7200FC"
Brother_MFC_Pro-700 = "Brother MFC Pro-700"
Brother_MFC-4600 = "Brother MFC-4600"
Brother_MFC-9550 = "Brother MFC-9550"
Brother_MFC-7750 = "Brother MFC-7750"
Brother_MFC-6650MC = "Brother MFC-6650MC"
Brother_MFC-4650 = "Brother MFC-4650"
Brother_MFC8600/9650_Series = "Brother MFC8600/9650 Series"
Brother_MFC9600/9870_Series = "Brother MFC9600/9870 Series"



