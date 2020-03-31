,"91"
HKR,,Installer32,,"SysSetup.Dll,TapeClassInstaller"
HKR,,TroubleShooter-0,,"hcp://help/tshoot/hdw_tape.htm"
HKR,,LegacyInfOption,,"TAPE"
HKR,,"WmiConfigClasses",0x00000000,"MSTapeSymbolicName,MSTapeDriveParam,MSTapeMediaCapacity,MSTapeDriveProblemEvent"
HKR,,DeviceType,0x10001,0x1F  ; FILE_DEVICE_TAPE
HKR,,DeviceCharacteristics,0x10001,0x00000101
HKR,,Security,,"D:P(A;;GAFA;;;SY)(A;;GAFA;;;BA)(A;;GAFA;;;BO)"

[TapeClassCoinstaller]
HKLM,System\CurrentControlSet\Control\CoDeviceInstallers,{6D807884-7D21-11CF-801C-08002BE10318},0x00010008,"WmiProp.dll,WmiPropCoInstaller"

[DestinationDirs]
DefaultDestDir = 12 ; DIRID_DRIVERS

[ControlFlags]
ExcludeFromSelect=*

[Manufacturer]
%StdMfg%=StdMfg,NTamd64
%Compaq%=Compaq,NTamd64
%Digital%=Digital,NTamd64
%Exabyte%=Exabyte,NTamd64
%Tandberg%=Tandberg,NTamd64
%HP%=HP,NTamd64
%Quantum%=Quantum,NTamd64
%Sony%=Sony,NTamd64
%Seagate%=Seagate,NTamd64
%LTO%=LTO,NTamd64
%Benchmark%=Benchmark,NTamd64

;********************************
;Standard tape drives device list
[StdMfg.NTamd64]
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialAIWA____GD-201__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialAIWA____GD-8000_________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_4322XX_27871-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_4326XX_03813-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_4586XX_28887-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_IBM4586NP_____!D
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialEXABYTE_EXB-4200________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialEXABYTE_EXB-4200C_______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______HP35470A________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______HP35480A________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______IBM35480A_______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______C1533A__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______C1553A__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______C1537A__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______C1557A__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______C5683A__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______C5713A__________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialIBM_____HP35480A________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialIOMEGA__DAT4000_________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWANGDAT_MODEL_1300______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWANGDAT_MODEL_3100______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWANGDAT_MODEL_3200______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWANGDAT_MODEL_3300DX____
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWANGDAT_MODEL_3400DX____
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-2000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-4000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-5000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-5200________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-7000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-9000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-10000_______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____SDT-11000_______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_00095-001
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_01931-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_02004-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_02635-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_02636-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_02801-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_02830-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_03195-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_03812-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_04106-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_04377-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_25588-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_25601-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_25602-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_25950-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_27807-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_27811-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_28219-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_28354-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_28388-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_28454-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_29987-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_02779-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_25501-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_25588-005
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_28849-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_27416-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_27871-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_04687-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_4326XX_27871-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWangDAT_Model_1300______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_IBM4326NP/RP__!D
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_IBM-STL496000N!D
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialHP______IBM35480A_____!C
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialIBM_____HP35480A______!C
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____TSL-7000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____TSL-9000________
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____TSL-10000_______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSONY____TSL-11000_______
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____02779-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____04106-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____04377-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____04687-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____25501-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialWANGTEK_6130-FS________T

%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____06240-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_06240-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_06241-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____06241-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____06408-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_06408-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_06409-XXX
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____9SP40-000
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_9SP40-000
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____9SP40-052
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_9SP40-052
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____9SP40-400
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_9SP40-400
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialSEAGATE_DAT____9SP40-452
%4mmdat.DeviceDesc%  = 4mmdat_Inst,  SCSI\SequentialARCHIVE_Python_9SP40-452

%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialCONNER__CTMS__3200______
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialCONNER__CTT8000-S_______
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialEXABYTE_EXB-2501________
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialEXABYTE_EXB-2502________
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialTANDBERG_TDC_3500_______
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialTANDBERG_TDC_3700_______
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialSeagate_STT8000N________
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialSeagate_STT20000N_______
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialTECMAR__TRAVAN_NS20_____
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialTECMAR__TRAVAN_NS8______
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialTANDBERG_NS20_Pro_20_GB_
%miniqic.DeviceDesc% = miniqic_Inst, SCSI\SequentialTANDBERG_NS8_Pro_4/8GB__

%qic157.DeviceDesc%  = qic157_Inst,  IDE\Sequential\CONNER__CTT8000-A_______
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialCONNER__CTT8000-A_______
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialCONNER_CTT8000-A________________________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\Sequential\CONNER__CTMA__4000______
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialCONNER__CTMA__4000______
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialCONNER_CTMA__4000_______________________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\Sequential\SEAGATE_STT8000-A_______
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialSEAGATE_STT8000-A_______________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialSeagate_STT8000A________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\Sequential\Seagate_STT8000A________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialSeagate_STT8000A________________________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\Sequential\Seagate_STT20000A_______
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialSeagate_STT20000A_______
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialSeagate_STT20000A_______________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialSeagate_STT20000A______________________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialTECMAR_TRAVAN_NS20______________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialTECMAR__TRAVAN_NS20_____
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialHP_COLORADO_8GB_________________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialHP______COLORADO_8GB____
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialAIWA_TD-A8000___________________________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialHP_COLORADO_14GB________________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialHP______COLORADO_14GB___
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialHP_COLORADO_5GB_________________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialHP______COLORADO_5GB____
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialHP_COLORADO_20GB________________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialHP______COLORADO_20GB___
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialTANDBERG__TR4_4/8GB_____________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialAIWA____TD-20001________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialAIWA____TD-8000_________
%qic157.DeviceDesc%  = qic157_Inst,  SBP2\Imation_Corp.___&Travan_FW_20GB_Tape_Drive___&CmdSetId104d8
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialSeagate_STT1401A________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialSeagate_STT1301A________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialSeagate_STT3401A________________________
%qic157.DeviceDesc%  = qic157_Inst,  IDE\SequentialECRIX_VXA-1a____________________________
%qic157.DeviceDesc%  = qic157_Inst,  SCSI\SequentialECRIX___VXA-1___________

[4mmdat_Inst]
CopyFiles = @4mmdat.sys

[4mmdat_Inst.HW]
AddReg=4mmdat_addreg

[4mmdat_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[4mmdat_Inst.Services]
AddService = 4mmdat, %SPSVCINST_ASSOCSERVICE%, 4mmdat_Service_Inst, 4mmdat_EventLog_Inst

[4mmdat_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\4mmdat.sys

[4mmdat_EventLog_Inst]
AddReg = 4mmdat_EventLog_AddReg

[4mmdat_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\4mmdat.sys"
HKR,,TypesSupported,%REG_DWORD%,7

[miniqic_Inst]
CopyFiles = @miniqic.sys

[miniqic_Inst.HW]
AddReg=miniqic_addreg

[miniqic_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[miniqic_Inst.Services]
AddService = miniqic, %SPSVCINST_ASSOCSERVICE%, miniqic_Service_Inst, miniqic_EventLog_Inst

[miniqic_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\miniqic.sys

[miniqic_EventLog_Inst]
AddReg = miniqic_EventLog_AddReg

[miniqic_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\miniqic.sys"
HKR,,TypesSupported,%REG_DWORD%,7

[qic157_Inst]
CopyFiles = @qic157.sys

[qic157_Inst.HW]
AddReg=qic157_addreg

[qic157_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[qic157_Inst.Services]
AddService = qic157, %SPSVCINST_ASSOCSERVICE%, qic157_Service_Inst, qic157_EventLog_Inst

[qic157_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\qic157.sys

[qic157_EventLog_Inst]
AddReg = qic157_EventLog_AddReg

[qic157_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\qic157.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;********************************
;Compaq-manufacturer device list
[Compaq.NTamd64]
%CPQTLZ9_4mmdat.DeviceDesc%   = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ9_____(C)_DEC
%CPQTLZ9_4mmdat.DeviceDesc%   = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ9____________
%CPQTLZ09_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ09___________
%CPQTLZ09_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ09_____(C)DEC
%CPQTLZ10_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ10____(C)_DEC
%CPQSDT7k_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialCOMPAQ__SDT-7000________
%CPQSDT9k_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialCOMPAQ__SDT-9000________
%CPQSDT1k_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialCOMPAQ__SDT-10000_______
%CPQTSL9k_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialCOMPAQ__TSL-9000________
%CPQTSL10k_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialCOMPAQ__TSL-10000_______

%CPQ_TZ88_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ88____________
%CPQ_TZ88_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ88_____(C)_DEC
%CPQ_TZ89_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ89____________
%CPQ_TZ89_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ89_____(C)_DEC
%CPQDLT24_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialCOMPAQ__DLT4000_________
%CPQDLT48_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialCOMPAQ__DLT8000_________
%CPQDLT48_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialCOMPAQ__DLT1____________
%CPQDLTSP_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialCOMPAQ__SuperDLT1_______
%CPQDLTVS_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialCOMPAQ__DLT_VS_40/80____
%CPQDLTS3_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialCOMPAQ__SDLT320_________

%CPQTZS20_sonyait.DeviceDesc% = cpq_sonyait_Inst, SCSI\SequentialDEC_____TZS20___________
%CPQTZS20_sonyait.DeviceDesc% = cpq_sonyait_Inst, SCSI\SequentialDEC_____TZS20_____(C)DEC
%CPQSDX300_sonyait.DeviceDesc%   = cpq_sonyait_Inst, SCSI\SequentialCOMPAQ__SDX-300C________
%CPQSDX400_sonyait.DeviceDesc%   = cpq_sonyait_Inst, SCSI\SequentialCOMPAQ__SDX-400C________
%CPQSDX500_sonyait.DeviceDesc%   = cpq_sonyait_Inst, SCSI\SequentialCOMPAQ__SDX-500C________
%CPQSDX420_sonyait.DeviceDesc%   = cpq_sonyait_Inst, IDE\SequentialCOMPAQ_SDX-420C_________________________
%CPQSDX700_sonyait.DeviceDesc%   = cpq_sonyait_Inst, SCSI\SequentialCOMPAQ__SDX-700C________

%CPQTZK11_tandqic.DeviceDesc% = cpq_tandqic_Inst, SCSI\SequentialDEC_____TZK11___________
%CPQTZK11_tandqic.DeviceDesc% = cpq_tandqic_Inst, SCSI\SequentialDEC_____TZK11____(C)_DEC

;********************************
;Digital-manufacturer device list
[Digital.NTamd64]
%DECTHZ02_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____THZ02___________
%DECTZ86_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ86____________
%DECTZ86_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ86_____(C)_DEC
%DECTZ87_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ87____________
%DECTZ87_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ87_____(C)_DEC
%DEC2000_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT2000_________
%DEC2000_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT2000_CPQ_LDRV
%DEC2000_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT2000_15/30_GB
%DEC2xxx_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT2500_________
%DEC2xxx_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT2700_________
%DEC4xxx_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT4500_________
%DEC4xxx_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____DLT4700_________
%DECTZ885_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ885____(C)_DEC
%DECTZ877_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ877____(C)_DEC
%DECTZ887_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ887____(C)_DEC
%DECTZ875_dlttape.DeviceDesc% = cpq_dlttape_Inst, SCSI\SequentialDEC_____TZ875____(C)_DEC

%DECTLZ1_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ1_____(C)_DEC
%DECTLZ6_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ6____________
%DECTLZ06_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ06___________
%DECTLZ06_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ06_____(C)DEC
%DECTLZ7_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ7____________
%DECTLZ7_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ7______(C)DEC
%DECTLZ07_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ07___________
%DECTLZ07_4mmdat.DeviceDesc%  = cpq_4mmdat_Inst,  SCSI\SequentialDEC_____TLZ07_____(C)DEC

%DECTZK20_miniqic.DeviceDesc% = cpq_miniqic_Inst, SCSI\SequentialDEC_____TZK20____(C)_DEC

%DECTZK10_tandqic.DeviceDesc% = cpq_tandqic_Inst, SCSI\SequentialDEC_____TZK10___________
%DECTZK12_tandqic.DeviceDesc% = cpq_tandqic_Inst, SCSI\SequentialDEC_____TZK12___________

[cpq_4mmdat_Inst]
UseInfDeviceDesc=1
Needs=4mmdat_Inst

[cpq_4mmdat_Inst.Services]
Needs=4mmdat_Inst.Services

[cpq_dlttape_Inst]
UseInfDeviceDesc=1
Needs=dlttape_Inst

[cpq_dlttape_Inst.Services]
Needs=dlttape_Inst.Services

[cpq_sonyait_Inst]
UseInfDeviceDesc=1
Needs=sonyait_Inst

[cpq_sonyait_Inst.Services]
Needs=sonyait_Inst.Services

[cpq_tandqic_Inst]
UseInfDeviceDesc=1
Needs=tandqic_Inst

[cpq_tandqic_Inst.Services]
Needs=tandqic_Inst.Services

[cpq_miniqic_Inst]
UseInfDeviceDesc=1
Needs=miniqic_Inst

[cpq_miniqic_Inst.Services]
Needs=miniqic_Inst.Services

;********************************
;Quantum-manufacturer device list
[Quantum.NTamd64]
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialCIPHER__T860____________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialCIPHER__TZ86____________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialCIPHER__L860____________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialCIPHER__DLT2000_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT2000_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT2500_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT2700_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT4000_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT4500_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT4700_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT7000_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT8000_________
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_DLT7000_CPQ_LDRV
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQuantum_DLT4000_CPQ_DRV_
%quantum_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialQUANTUM_SuperDLT1_______

[dlttape_Inst]
CopyFiles = @dlttape.sys

[dlttape_Inst.HW]
AddReg=dlttape_addreg

[dlttape_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[dlttape_Inst.Services]
AddService = dlttape, %SPSVCINST_ASSOCSERVICE%, dlttape_Service_Inst, dlttape_EventLog_Inst

[dlttape_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\dlttape.sys

[dlttape_EventLog_Inst]
AddReg = dlttape_EventLog_AddReg

[dlttape_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\dlttape.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;********************************
;LTO device list
[LTO.NTamd64]
%ltotape.DeviceDesc% = ltotape_Inst, SCSI\SequentialSEAGATE_ULTRIUM06242-XXX
%ltotape.DeviceDesc% = ltotape_Inst, SCSI\SequentialHP______Ultrium_1-SCSI__
%ltotape.DeviceDesc% = ltotape_Inst, SCSI\SequentialIBM_____ULTRIUM-TD1_____

[ltotape_Inst]
CopyFiles = @ltotape.sys

[ltotape_Inst.HW]
AddReg=ltotape_addreg

[ltotape_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[ltotape_Inst.Services]
AddService = ltotape, %SPSVCINST_ASSOCSERVICE%, ltotape_Service_Inst, ltotape_EventLog_Inst

[ltotape_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\ltotape.sys

[ltotape_EventLog_Inst]
AddReg = ltotape_EventLog_AddReg

[ltotape_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\ltotape.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;********************************
;Benchmark device list
[Benchmark.NTamd64]
%BNCHMARK.DeviceDesc% = dlttape_Inst, SCSI\SequentialBNCHMARKDLT1____________
%BNCHMARK.DeviceDesc% = dlttape_Inst, SCSI\SequentialBNCHMARKVS640___________

;********************************
;Exabyte-manufacturer device list
[Exabyte.NTamd64]
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-8500________
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB8500C________
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-8505________
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_IBM-8505________
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-8205________
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-82058VQANXR1
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-82058VQANXR0
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB8500C8CQANXR0
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE EXB8500C8CQANXR4
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-8500-85Qanx0
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-85058HE-0000
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-85058HE-0000
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-85058SQANXR1
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-85058SQANXRP
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-85058SQANXR0
%exabyte2.DeviceDesc% = exabyte2_Inst, SCSI\SequentialEXABYTE_EXB-8505SMBANSH2

%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-89008E000112
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-89008E000116
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-89008E000120
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-8900MH000202
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-8900MH000112
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-89008E000204
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_EXB-8900________
%mammoth.DeviceDesc%  = mammoth_Inst,  SCSI\SequentialEXABYTE_Mammoth2________

[exabyte2_Inst]
CopyFiles = @exabyte2.sys

[exabyte2_Inst.HW]
AddReg=exabyte2_addreg

[exabyte2_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[exabyte2_Inst.Services]
AddService = exabyte2, %SPSVCINST_ASSOCSERVICE%, exabyte2_Service_Inst, exabyte2_EventLog_Inst

[exabyte2_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\exabyte2.sys

[exabyte2_EventLog_Inst]
AddReg = exabyte2_EventLog_AddReg

[exabyte2_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\exabyte2.sys"
HKR,,TypesSupported,%REG_DWORD%,7

[mammoth_Inst]
CopyFiles = @mammoth.sys

[mammoth_Inst.HW]
AddReg=mammoth_addreg

[mammoth_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[mammoth_Inst.Services]
AddService = mammoth, %SPSVCINST_ASSOCSERVICE%, mammoth_Service_Inst, mammoth_EventLog_Inst

[mammoth_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\mammoth.sys

[mammoth_EventLog_Inst]
AddReg = mammoth_EventLog_AddReg

[mammoth_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\mammoth.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;********************************
;Seagate-manufacturer device list
[Seagate.NTamd64]
%seagate_sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSEAGATE_AIT-LDR_________
%seagate_sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSEAGATE_AIT_____________

;*********************************
;Tandberg-manufacturer device list
[Tandberg.NTamd64]
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERGMLR1____________
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERGMLR3____________
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERG_SLR5_4/8GB_____
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERG_SLR5_4GB_______
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERGSLR100__________
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERGSLR7____________
%tandqic.DeviceDesc% = tandqic_Inst, SCSI\SequentialTANDBERGSLR60___________

%tandberg_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialTANDBERGDLT4000_________
%tandberg_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialTANDBERGDLT7000_________
%tandberg_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialTANDBERGDLT8000_________
%tandberg_dlttape.DeviceDesc% = dlttape_Inst, SCSI\SequentialTANDBERGSuperDLT1_______

[tandqic_Inst]
CopyFiles = @tandqic.sys

[tandqic_Inst.HW]
AddReg=tandqic_addreg

[tandqic_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[tandqic_Inst.Services]
AddService = tandqic, %SPSVCINST_ASSOCSERVICE%, tandqic_Service_Inst, tandqic_EventLog_Inst

[tandqic_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\tandqic.sys

[tandqic_EventLog_Inst]
AddReg = tandqic_EventLog_AddReg

[tandqic_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\tandqic.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;********************************
;Hewlett Packard-manufacturer device list
[HP.NTamd64]
%hpt4qic.DeviceDesc% = hpt4qic_Inst, SCSI\SequentialHP______T4000___________
%hpt4qic.DeviceDesc% = hpt4qic_Inst, SCSI\SequentialHP______T4000s__________
%hpt4qic.DeviceDesc% = hpt4qic_Inst, SCSI\SequentialHP______T20_____________

[hpt4qic_Inst]
CopyFiles = @hpt4qic.sys

[hpt4qic_Inst.HW]
AddReg=hpt4qic_addreg

[hpt4qic_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[hpt4qic_Inst.Services]
AddService = hpt4qic, %SPSVCINST_ASSOCSERVICE%, hpt4qic_Service_Inst, hpt4qic_EventLog_Inst

[hpt4qic_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\hpt4qic.sys

[hpt4qic_EventLog_Inst]
AddReg = hpt4qic_EventLog_AddReg

[hpt4qic_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\hpt4qic.sys"
HKR,,TypesSupported,%REG_DWORD%,7

;********************************
;Sony manufacturer device list
[Sony.NTamd64]
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____SDX-300_________
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____SDX-300C________
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____SDX-400C________
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____SDX-500_________
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____SDX-500C________
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____SDX-700C________
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____TSL-A300C_______
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____TSL-A400C_______
%sonyait.DeviceDesc% = sonyait_Inst, SCSI\SequentialSONY____TSL-A500C_______

[sonyait_Inst]
CopyFiles = @sonyait.sys

[sonyait_Inst.HW]
AddReg=sonyait_addreg

[sonyait_addreg]
HKR,,"SrbTimeoutDelta",0x00010001,300

[sonyait_Inst.Services]
AddService = sonyait, %SPSVCINST_ASSOCSERVICE%, sonyait_Service_Inst, sonyait_EventLog_Inst

[sonyait_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\sonyait.sys

[sonyait_EventLog_Inst]
AddReg = sonyait_EventLog_AddReg

[sonyait_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\sonyait.sys"
HKR,,TypesSupported,%REG_DWORD%,7


































[Strings]
Msft="Microsoft"
TapeClassName="Tape drives"

StdMfg="(Standard tape drives)"
HP="Hewlett Packard"

4mmdat.DeviceDesc="4 millimeter DAT drive"
miniqic.DeviceDesc="SCSI mini cartridge drive"
quantum_dlttape.DeviceDesc="Quantum DLT tape drive"
exabyte2.DeviceDesc="Exabyte 8500 series (SCSI-2) tape drive"
mammoth.DeviceDesc="Exabyte Mammoth tape drive"
tandqic.DeviceDesc="Tandberg tape drive"
cms.DeviceDesc="HP/CMS QIC 40/80/Tr-1/Tr-3 tape drive"
qic157.DeviceDesc="IDE (QIC-157) tape drive"
hpt4qic.DeviceDesc="Hewlett Packard Colorado T4000 tape drive"
sonyait.DeviceDesc="Sony SDX (AIT) tape drive"
seagate_sonyait.DeviceDesc="Seagate AIT tape drive"
dec_dlttape.DeviceDesc    ="Digital TZ86, TZ87, or DLT tape drive"
tandberg_dlttape.DeviceDesc ="Tandberg DLT tape drive"
ltotape.DeviceDesc ="LTO Tape drive"

DECTZ86_dlttape.DeviceDesc="DEC TZ86 DLT Tape Drive"
DECTZ87_dlttape.DeviceDesc="DEC TZ87 DLT Tape Drive"
DEC2000_dlttape.DeviceDesc="DEC DLT 2000 Tape Drive"
DEC2xxx_dlttape.DeviceDesc="DEC DLT 2xxx Mini Library Drive"
DEC4xxx_dlttape.DeviceDesc="DEC DLT 4xxx Mini Library Drive"
DECTHZ02_dlttape.DeviceDesc="DEC THZ02 DLT Tape Drive"
DECTZ885_dlttape.DeviceDesc="DEC TZ885 Loader Tape Drive"
DECTZ877_dlttape.DeviceDesc="DEC TZ877 Loader Tape Drive"
DECTZ887_dlttape.DeviceDesc="DEC TZ887 Loader Tape Drive"
DECTZ875_dlttape.DeviceDesc="DEC TZ875 Loader Tape Drive"

DECTLZ1_4mmdat.DeviceDesc="DEC TLZ1 Tape Drive (4mm DAT)"
DECTLZ6_4mmdat.DeviceDesc="DEC TLZ6 Tape Drive (4mm DAT)"
DECTLZ06_4mmdat.DeviceDesc="DEC TLZ06 Tape Drive (4mm DAT)"
DECTLZ7_4mmdat.DeviceDesc="DEC TLZ7 Tape Drive (4mm DAT)"
DECTLZ07_4mmdat.DeviceDesc="DEC TLZ07 Tape Drive (4mm DAT)"

DECTZK10_tandqic.DeviceDesc="DEC TZK10 Tape Drive"
DECTZK12_tandqic.DeviceDesc="DEC TZK12 Tape Drive"

DECTZK20_miniqic.DeviceDesc="DEC TZK20 Tape Drive (SCSI Mini Cartridge)"

CPQDLT24_dlttape.DeviceDesc="Compaq 20/40 GB DLT Tape Drive"
CPQ_TZ88_dlttape.DeviceDesc="Compaq 20/40 GB DLT Tape drive (DEC TZ88)"
CPQ_TZ89_dlttape.DeviceDesc="Compaq 35/70 GB DLT Tape drive (DEC TZ89)"
CPQDLT48_dlttape.DeviceDesc="Compaq 40/80 GB DLT Tape Drive"
CPQDLTSP_dlttape.DeviceDesc="Compaq 100/200 GB SDLT Tape Drive"
CPQDLTVS_dlttape.DeviceDesc="Compaq DLT VS Tape Drive"
CPQDLTS3_dlttape.DeviceDesc="Compaq SDLT320 (160/320 GB) Drive"

CPQSDT7k_4mmdat.DeviceDesc="Compaq DDS2 4/8 GB DAT Drive"
CPQTLZ09_4mmdat.DeviceDesc="Compaq DDS2 4/8 GB DAT Drive (DEC TLZ09)"
CPQTLZ9_4mmdat.DeviceDesc="Compaq DDS2 4/8 GB DAT Drive (DEC TLZ9)"
CPQSDT9k_4mmdat.DeviceDesc="Compaq DDS3 12/24 GB DAT Drive"
CPQTSL9k_4mmdat.DeviceDesc="Compaq DDS3 12/24 GB Autoloader (Drive)"
CPQTSL10k_4mmdat.DeviceDesc="Compaq DDS4 20/40 GB Autoloader (Drive)"
CPQTLZ10_4mmdat.DeviceDesc="Compaq DDS3 12/24 GB DAT Drive (DEC TLZ10)"
CPQSDT1k_4mmdat.DeviceDesc="Compaq DDS4 20/40 GB DAT Drive"

CPQTZS20_sonyait.DeviceDesc="Compaq AIT 25 GB Drive (DEC TZS20)"

CPQSDX300_sonyait.DeviceDesc ="Compaq AIT 35 GB drive"
CPQSDX400_sonyait.DeviceDesc ="Compaq AIT 35 GB LVD drive"
CPQSDX500_sonyait.DeviceDesc ="Compaq AIT 50 GB drive"
CPQSDX420_sonyait.DeviceDesc ="Compaq AIT 35 GB IDE drive"
CPQSDX700_sonyait.DeviceDesc ="Compaq AIT 100 GB drive"

CPQTZK11_tandqic.DeviceDesc="Compaq 2/4 GB SLR Drive (DEC TZK11)"

BNCHMARK.DeviceDesc="Benchmark DLT1 Tape Drive"

;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_DEMAND_START   = 3
SERVICE_ERROR_NORMAL   = 1
REG_EXPAND_SZ          = 0x00020000
REG_DWORD              = 0x00010001
