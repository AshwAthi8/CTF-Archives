
; MCHGR.INF -- This file contains descriptions of supported Medium Changers

; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
signature="$Windows NT$"
Class=MediumChanger
ClassGUID={CE5939AE-EBDE-11d0-B181-0000F8753EC4}
Provider=%Msft%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

; Class Install
[ClassInstall32.NT]
Addreg=MediumChangerClassAddReg
AddReg=MchgrCoInstallerAddReg
CopyFiles=MchgrCoInstallerCopyFiles

[MediumChangerClassAddReg]
HKR,,,,%ChangerClassName%
HKR,,Icon,,"-29"
HKR,,NoInstallClass,,1
HKR,,DeviceType,0x10001,0x30  ; FILE_DEVICE_CHANGER
HKR,,Security,,"D:P(A;;GAFA;;;SY)(A;;GAFA;;;BA)(A;;GAFA;;;BO)"

[DestinationDirs]
DefaultDestDir = 12 ; DIRID_DRIVERS
MchgrCoInstallerCopyFiles = 11 ; DIRID_SYSTEM

[ControlFlags]
ExcludeFromSelect=*

[MchgrCoInstallerAddReg]
HKLM,System\CurrentControlSet\Control\CoDeviceInstallers,{CE5939AE-EBDE-11d0-B181-0000F8753EC4},0x00010008,"mchgrcoi.dll,MchgrClassCoInstaller"

[MchgrCoInstallerCopyFiles]
mchgrcoi.dll

[Manufacturer]

%StdDDS%=StdDDS,NTamd64
%Compaq%=Compaq,NTamd64
%DEC%=DEC,NTamd64
%ADIC%=ADIC,NTamd64
%Pioneer%=Pioneer,NTamd64
%Sony%=Sony,NTamd64
%Seagate%=Seagate,NTamd64
%PowerFile%=PowerFile,NTamd64
%Elms%=Elms,NTamd64
%NSM%=NSM,NTamd64
%Benchmark%=Benchmark,NTamd64
%GenChanger%=GenChanger,NTamd64


















;**************************************************************
;Standard DDS medium changers device list
[StdDDS.NTamd64]
%DDSMC.ADIC_800E.DeviceDesc% = DDSMC_Inst, SCSI\ChangerADIC____800E____________

%DDSMC.TSL-7000_.DeviceDesc% = DDSMC_Inst, SCSI\ChangerSONY____TSL-7000________
%DDSMC.TSL-9000_.DeviceDesc% = DDSMC_Inst, SCSI\ChangerSONY____TSL-9000________
%DDSMC.TSL-10000.DeviceDesc% = DDSMC_Inst, SCSI\ChangerSONY____TSL-10000_______
%DDSMC.TSL-11000.DeviceDesc% = DDSMC_Inst, SCSI\ChangerSONY____TSL-11000_______

%DDSMC.HP_C1553A.DeviceDesc% = DDSMC_Inst, SCSI\ChangerHP______C1553A__________
%DDSMC.HP_C1557A.DeviceDesc% = DDSMC_Inst, SCSI\ChangerHP______C1557A__________
%DDSMC.HP_C5713A.DeviceDesc% = DDSMC_Inst, SCSI\ChangerHP______C5713A__________

[DDSMC_Inst]
CopyFiles = @ddsmc.sys

[DDSMC_Inst.Services]
AddService = ddsmc, %SPSVCINST_ASSOCSERVICE%, DDSMC_Service_Inst, DDSMC_EventLog_Inst

[DDSMC_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\ddsmc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[DDSMC_EventLog_Inst]
AddReg = DDSMC_EventLog_AddReg

[DDSMC_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\ddsmc.sys"
HKR,,TypesSupported,%REG_DWORD%,7


;**************************************************************
;Compaq manufacturer device list
[Compaq.NTamd64]
%CPQ.TSL9000_.DeviceDesc% = DDSMC_Inst, SCSI\ChangerCOMPAQ__TSL-9000________
%CPQ.TSL10000.DeviceDesc% = DDSMC_Inst, SCSI\ChangerCOMPAQ__TSL-10000_______
%CPQ.TLZ9____.DeviceDesc% = DDSMC_Inst, SCSI\ChangerDEC_____TLZ9_____(C)_DEC

%CPQ.LIB81AIT.DeviceDesc% = PowerFile_Inst, SCSI\ChangerCOMPAQ__LIB-81__________













;**************************************************************
;DEC manufacturer device list
[DEC.NTamd64]
%DEC.TLZ1_.DeviceDesc% = DDSMC_Inst, SCSI\ChangerDEC_____TLZ1_____(C)_DEC







;**************************************************************
;ADIC manufacturer device list
[ADIC.NTamd64]
%ADICVLS.4mm.DeviceDesc% = ADICVLS_Inst, SCSI\ChangerADIC____VLS_4mm_________
%ADICVLS.SDX.DeviceDesc% = ADICVLS_Inst, SCSI\ChangerADIC____VLS_SDX_________









%ADICVLS.DAT.DeviceDesc% = ADICVLS_Inst, SCSI\ChangerADIC____DAT_AutoChanger_

[ADICVLS_Inst]
CopyFiles = @adicvls.sys

[ADICVLS_Inst.Services]
AddService = adicvls, %SPSVCINST_ASSOCSERVICE%, ADICVLS_Service_Inst, ADICVLS_EventLog_Inst

[ADICVLS_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\adicvls.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[ADICVLS_EventLog_Inst]
AddReg = ADICVLS_EventLog_AddReg

[ADICVLS_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\adicvls.sys"
HKR,,TypesSupported,%REG_DWORD%,7

























;**************************************************************
;Pioneer manufacturer device list
[Pioneer.NTamd64]
%PioneerMC.DeviceDesc% = PioneerMC_Inst, SCSI\ChangerPIONEER_CHANGR_DRM-1004X

[PioneerMC_Inst]
CopyFiles = @pnrmc.sys

[PioneerMC_Inst.Services]
AddService = pnrmc, %SPSVCINST_ASSOCSERVICE%, PioneerMC_Service_Inst, PioneerMC_EventLog_Inst

[PioneerMC_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\pnrmc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[PioneerMC_EventLog_Inst]
AddReg = PioneerMC_EventLog_AddReg

[PioneerMC_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\pnrmc.sys"
HKR,,TypesSupported,%REG_DWORD%,7


;**************************************************************
;Sony manufacturer device list
[Sony.NTamd64]
%SonyMC.CDL1100.DeviceDesc% = SonyMC_Inst, SCSI\ChangerSONY____CDL1100_________
%SonyMC.CDL2100.DeviceDesc% = SonyMC_Inst, SCSI\ChangerSONY____CDL2100_________
%SonyMC.CDL2200.DeviceDesc% = SonyMC_Inst, SCSI\ChangerSONY____CDL2200_________
%SonyMC.CDL5000.DeviceDesc% = SonyMC_Inst, SCSI\ChangerSONY____CDL5000_________

%Sony.TSL-A300C.DeviceDesc% = SonyAitMC_Inst, SCSI\ChangerSONY____TSL-A300C_______
%Sony.TSL-A400C.DeviceDesc% = SonyAitMC_Inst, SCSI\ChangerSONY____TSL-A400C_______
%Sony.TSL-A500C.DeviceDesc% = SonyAitMC_Inst, SCSI\ChangerSONY____TSL-A500C_______

[SonyMC_Inst]
CopyFiles = @sonymc.sys

[SonyMC_Inst.Services]
AddService = sonymc, %SPSVCINST_ASSOCSERVICE%, SonyMC_Service_Inst, SonyMC_EventLog_Inst

[SonyMC_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\sonymc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[SonyMC_EventLog_Inst]
AddReg = SonyMC_EventLog_AddReg

[SonyMC_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\sonymc.sys"
HKR,,TypesSupported,%REG_DWORD%,7

[SonyAitMC_Inst]
CopyFiles = @snyaitmc.sys

[SonyAitMC_Inst.Services]
AddService = snyaitmc, %SPSVCINST_ASSOCSERVICE%, SonyAitMC_Service_Inst, SonyAitMC_EventLog_Inst

[SonyAitMC_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\snyaitmc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[SonyAitMC_EventLog_Inst]
AddReg = SonyAitMC_EventLog_AddReg

[SonyAitMC_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\snyaitmc.sys"
HKR,,TypesSupported,%REG_DWORD%,7


;**************************************************************
;Seagate manufacturer device list
[Seagate.NTamd64]
%Seagate.28849____.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_28849-XXX
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_02636-XXX
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_29987-XXX
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_04377-XXX
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_06241-XXX
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_06409-XXX
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_9SP40-400
%Seagate.Python___.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_Python_9SP40-452

%Seagate.DAT_04377.DeviceDesc% = Seagate_Inst, SCSI\ChangerSEAGATE_DAT____04377-XXX
%Seagate.DAT_06241.DeviceDesc% = Seagate_Inst, SCSI\ChangerSEAGATE_DAT____06241-XXX
%Seagate.DAT_9SP40.DeviceDesc% = Seagate_Inst, SCSI\ChangerSEAGATE_DAT____9SP40-400
%Seagate.DAT_9SP40.DeviceDesc% = Seagate_Inst, SCSI\ChangerSEAGATE_DAT____9SP40-452

%Seagate.VIPER_2000.DeviceDesc% = Seagate_Inst, SCSI\ChangerSEAGATE_VIPER_2000______

%Seagate.IBM4586NP.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_IBM4586NP_____!D
%Seagate.IBM496000.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_IBM-STL496000N!D

%Seagate.4586_____.DeviceDesc% = Seagate_Inst, SCSI\ChangerARCHIVE_4586XX_28887-XXX

%Seagate.AIT-LDR__.DeviceDesc% = SonyAitMC_Inst, SCSI\ChangerSEAGATE_AIT-LDR_________

[Seagate_Inst]
CopyFiles = @seaddsmc.sys

[Seagate_Inst.Services]
AddService = seaddsmc, %SPSVCINST_ASSOCSERVICE%, Seagate_Service_Inst, Seagate_EventLog_Inst

[Seagate_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\seaddsmc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[Seagate_EventLog_Inst]
AddReg = Seagate_EventLog_AddReg

[Seagate_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\seaddsmc.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;**************************************************************
;PowerFile manufacturer device list
[PowerFile.NTamd64]
%PowerFile.DeviceDesc% = PowerFile_Inst,SBP2\STARMATIX_INC.&STARMATIX-DISK_CHANGER&CMDSETID104D8
%PowerFile.DeviceDesc% = PowerFile_Inst,SBP2\GENCHANGER
%PowerFile.DeviceDesc% = PowerFile_Inst,SBP2\50F2&0
%PowerFile.DeviceDesc% = PowerFile_Inst,SBP2\031887&040892

[PowerFile_Inst]
CopyFiles = @powerfil.sys

[PowerFile_Inst.Services]
AddService = powerfil, %SPSVCINST_ASSOCSERVICE%, PowerFile_Service_Inst, PowerFile_EventLog_Inst

[PowerFile_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
LoadOrderGroup = Pointer Port
ServiceBinary  = %12%\powerfil.sys

[PowerFile_EventLog_Inst]
AddReg = PowerFile_EventLog_AddReg

[PowerFile_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\powerfil.sys"
HKR,,TypesSupported,%REG_DWORD%,7


;**************************************************************
;ELMS manufacturer device list
[Elms.NTamd64]
%ELMSMC.DVL__.DeviceDesc% = ELMSMC_Inst, SCSI\ChangerElms____DVL_____________
%ELMSMC.ID100.DeviceDesc% = ELMSMC_Inst, SCSI\ChangerCYGNET__ID100___________

[ELMSMC_Inst]
CopyFiles = @elmsmc.sys

[ELMSMC_Inst.Services]
AddService = elmsmc, %SPSVCINST_ASSOCSERVICE%, ELMSMC_Service_Inst, ELMSMC_EventLog_Inst

[ELMSMC_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\elmsmc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[ELMSMC_EventLog_Inst]
AddReg = ELMSMC_EventLog_AddReg

[ELMSMC_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\elmsmc.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;**************************************************************
;NSM manufacturer device list
[NSM.NTamd64]
%NSMMC.DeviceDesc% = NSMMC_Inst, SCSI\ChangerNSM_____Mercury-40S_____

[NSMMC_Inst]
CopyFiles = @nsmmc.sys

[NSMMC_Inst.Services]
AddService = nsmmc, %SPSVCINST_ASSOCSERVICE%, NSMMC_Service_Inst, NSMMC_EventLog_Inst

[NSMMC_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\nsmmc.sys
LoadOrderGroup = SCSI Class
Dependencies   = +SCSI Miniport

[NSMMC_EventLog_Inst]
AddReg = NSMMC_EventLog_AddReg

[NSMMC_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\nsmmc.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;**************************************************************
;Benchmark manufacturer device list
[Benchmark.NTamd64]
%Benchmark.DeviceDesc% = PowerFile_Inst, SCSI\ChangerBNCHMARKVS640___________


;**************************************************************
;GenChanger
[GenChanger.NTamd64]
%GenChanger.DeviceDesc% = GenChanger_Inst, SCSI\Changer

[GenChanger_Inst]

[GenChanger_Inst.Services]
AddService =  ,%SPSVCINST_ASSOCSERVICE%,
























































































































































































































































































































































































































































;**************************************************************
;These addreg sections should be used when installins services to indicate
;which interface types are safe for PNP and which aren't.  INTERFACE_TYPE
;is defined in NTDDK.H

[pnpsafe_pci_addreg]
HKR, "Parameters\PnpInterface", "5", 0x00010001, 0x00000001

































[Strings]
Msft = "Microsoft"
ChangerClassName = "Medium Changers"



StdDDS="StdDDS"
DDSMC.ADIC_800E.DeviceDesc = "ADIC 800E Autoloader"

DDSMC.TSL-7000_.DeviceDesc = "Sony TSL-7000 DDS Autoloader"
DDSMC.TSL-9000_.DeviceDesc = "Sony TSL-9000 DDS Autoloader"
DDSMC.TSL-10000.DeviceDesc = "Sony TSL-10000 DDS Autoloader"
DDSMC.TSL-11000.DeviceDesc = "Sony TSL-11000 DDS Autoloader"

DDSMC.HP_C1553A.DeviceDesc = "HP SureStore Tape 12000 Autoloader"
DDSMC.HP_C1557A.DeviceDesc = "HP SureStore DAT24x6 Autoloader"
DDSMC.HP_C5713A.DeviceDesc = "HP SureStore DAT40x6 Autoloader"



Compaq="Compaq"
CPQ.TSL9000_.DeviceDesc = "Compaq DDS3 12/24 GB 8 Cassette Autoloader"
CPQ.TSL10000.DeviceDesc = "Compaq DDS4 20/40 GB DAT Autoloader"
CPQ.TLZ9____.DeviceDesc = "Compaq DDS2 4/8 GB Autoloader (DEC TLZ9)"

CPQ.LIB81AIT.DeviceDesc = "Compaq StorageWorks 35GB AIT Autoloader"








DEC="DEC"
DEC.TLZ1_.DeviceDesc = "Digital TLZ1 Autoloader"








ADICVLS.4mm.DeviceDesc = "ADIC VLS 4mm Library"
ADICVLS.SDX.DeviceDesc = "ADIC VLS SDX Library"





ADICVLS.DAT.DeviceDesc = "ADIC DAT AutoChanger"


Pioneer="Pioneer"
PioneerMC.DeviceDesc = "Pioneer DRM-1004 Library"


Sony="Sony"
SonyMC.CDL1100.DeviceDesc = "Sony CDL1100 Desktop Library"
SonyMC.CDL2100.DeviceDesc = "Sony CDL2100 Library"
SonyMC.CDL2200.DeviceDesc = "Sony CDL2200 Library"
SonyMC.CDL5000.DeviceDesc = "Sony CDL5000 Library"

Sony.TSL-A300C.DeviceDesc = "Sony TSL-A300C Autoloader"
Sony.TSL-A400C.DeviceDesc = "Sony TSL-A400C Autoloader"
Sony.TSL-A500C.DeviceDesc = "Sony TSL-A500C Autoloader"


Seagate="Seagate"
Seagate.28849____.DeviceDesc = "Seagate 4586 Autoloader"
Seagate.Python___.DeviceDesc = "Seagate Archive Python Autoloader"

Seagate.DAT_04377.DeviceDesc = "Seagate Scorpion 96"
Seagate.DAT_06241.DeviceDesc = "Seagate Scorpion 240"
Seagate.DAT_9SP40.DeviceDesc = "Seagate Scorpion 240"

Seagate.VIPER_2000.DeviceDesc = "Seagate Viper 2000 Autoloader"

Seagate.IBM4586NP.DeviceDesc = "IBM Archive 4586NP Autoloader"
Seagate.IBM496000.DeviceDesc = "IBM Archive Autoloader"

Seagate.4586_____.DeviceDesc = "Compaq DDS2 4/16 GB DAT Autoloader"

Seagate.AIT-LDR__.DeviceDesc = "Seagate Sidewinder 200 Autoloader"


PowerFile="PowerFile"
PowerFile.DeviceDesc = "PowerFile C200"


Elms="Elms"
ELMSMC.DVL__.DeviceDesc = "Elms DVL CD Library"
ELMSMC.ID100.DeviceDesc = "Cygnet id 100 Library"


NSM="NSM"
NSMMC.DeviceDesc = "NSM Mercury 40 Jukebox"


Benchmark="Benchmark"
Benchmark.DeviceDesc = "Benchmark VS640 DLT Autoloader"


ADIC="ADIC"
ADICSC.Sca100.DeviceDesc = "ADIC Scalar 100 Library"
ADICSC.Sc1000.DeviceDesc = "ADIC Scalar 1000 Library"
ADICSC.Scalar.DeviceDesc = "ADIC Scalar Tape Library"
ADICSC.FStor_.DeviceDesc = "ADIC FastStor DLT Autoloader"
DELL.PV120T__.DeviceDesc = "DELL PowerVault 120T Autoloader"
DELL.PV136T__.DeviceDesc = "DELL PowerVault 136T Autoloader"


DELL="DELL"
DELL.PV122T__.DeviceDesc = "DELL PowerVault 122T Autoloader"


GenChanger="GenChanger"
GenChanger.DeviceDesc = "Unknown Medium Changer"
































































































































;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_DEMAND_START   = 3
SERVICE_ERROR_NORMAL   = 1
REG_EXPAND_SZ          = 0x00020000
REG_DWORD              = 0x00010001
