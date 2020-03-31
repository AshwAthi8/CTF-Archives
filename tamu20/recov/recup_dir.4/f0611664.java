; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
Signature="$WINDOWS NT$"
Class=hdc
ClassGuid={4D36E96A-E325-11CE-BFC1-08002BE10318}
Provider=%MS%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

;Class Install
[ClassInstall32.NT]
AddReg=HDC_Class

[HDC_Class]
HKR,,,,%HDCClassName%
HKR,,Icon,,"-9"
HKR,,Installer32,,"SysSetup.Dll,HdcClassInstaller"
HKR,,TroubleShooter-0,,"hcp://help/tshoot/tsdrive.htm"
HKR,,DeviceType,0x10001,4                       ; FILE_DEVICE_CONTROLLER
HKR,,DeviceCharacteristics,0x10001,0x100        ; Use same security checks on relative opens
HKR,,Security,,"D:P(A;;GAFA;;;SY)(A;;GAFA;;;BA)"

[storprop_copyfiles]
storprop.dll

[DestinationDirs]
DefaultDestDir = 12 ; DIRID_DRIVERS
storprop_copyfiles = 11

[ControlFlags]
ExcludeFromSelect=*
;ExcludeFromSelect=Primary_IDE_Channel
;ExcludeFromSelect=Secondary_IDE_Channel
;ExcludeFromSelect = PCMCIA\*PNP0600
;ExcludeFromSelect = PCMCIA\KME-KXLC005-A99E
;ExcludeFromSelect = PCMCIA\_-NinjaATA--3768
;ExcludeFromSelect = PCMCIA\FUJITSU-IDE-PC_CARD-DDF2
;ExcludeFromSelect = PCI\VEN_10B9&DEV_5215
;ExcludeFromSelect = PCI\VEN_10B9&DEV_5219
;ExcludeFromSelect = PCI\VEN_10B9&DEV_5229
;ExcludeFromSelect = PCI\VEN_1097&DEV_0038
;ExcludeFromSelect = PCI\VEN_1095&DEV_0640
;ExcludeFromSelect = PCI\VEN_1095&DEV_0646
;ExcludeFromSelect = PCI\VEN_1095&DEV_0646u2
;ExcludeFromSelect = PCI\VEN_1095&DEV_0648
;ExcludeFromSelect = PCI\VEN_1095&DEV_0649
;ExcludeFromSelect = PCI\VEN_0E11&DEV_AE33
;ExcludeFromSelect = PCI\VEN_8086&DEV_1222
;ExcludeFromSelect = PCI\VEN_8086&DEV_1230
;ExcludeFromSelect = PCI\VEN_8086&DEV_7010
;ExcludeFromSelect = PCI\VEN_8086&DEV_7111
;ExcludeFromSelect = PCI\VEN_8086&DEV_2411
;ExcludeFromSelect = PCI\VEN_8086&DEV_2421
;ExcludeFromSelect = PCI\VEN_8086&DEV_244A
;ExcludeFromSelect = PCI\VEN_8086&DEV_244B
;ExcludeFromSelect = PCI\VEN_8086&DEV_7199
;ExcludeFromSelect = PCI\VEN_8086&DEV_7601
;ExcludeFromSelect = PCI\VEN_1042&DEV_1000
;ExcludeFromSelect = PCI\VEN_1039&DEV_0601
;ExcludeFromSelect = PCI\VEN_1039&DEV_5513
;ExcludeFromSelect = PCI\VEN_10AD&DEV_0001
;ExcludeFromSelect = PCI\VEN_10AD&DEV_0150
;ExcludeFromSelect = PCI\VEN_105A&DEV_4D33
;ExcludeFromSelect = PCI\VEN_1106&DEV_0571
;ExcludeFromSelect = PCMCIA\LOOKMEET-CBIDE2______-6C0A
;ExcludeFromSelect = PCI\VEN_1179&DEV_0105
;ExcludeFromSelect = PCI\VEN_1055&DEV_9130

[Manufacturer]
%MS-Drivers%=MS_HDC,NTamd64
%IODATA%=IODATA_HDC,NTamd64
%ALI%=ALI_HDC,NTamd64
%APPIAN%=APPIAN_HDC,NTamd64
%CMD%=CMD_HDC,NTamd64
%COMPAQ%=COMPAQ_HDC,NTamd64
%INTEL%=INTEL_HDC,NTamd64
%PCTECH%=PCTECH_HDC,NTamd64
%SIS%=SIS_HDC,NTamd64
%SYMPHONY%=SYMPHONY_HDC,NTamd64
%VIA%=VIA_HDC,NTamd64
%IBM%=IBM_HDC,NTamd64
%LEXAR%=LEXAR_HDC,NTamd64
%SONY%=SONY_HDC,NTamd64
%SMSC%=SMSC_HDC,NTamd64
%MICRON%=MICRON_HDC,NTamd64
%TOSHIBA%=TOSHIBA_HDC,NTamd64
%SERVERWORKS%=SERVERWORKS_HDC,NTamd64
%AMD%=AMD_HDC,NTamd64
%NVIDIA%=NVIDIA_HDC,NTamd64

[MS_HDC.NTamd64]
%pcmcia.DeviceDesc%              = pcmcia_atapi_Inst, PCMCIA\*PNP0600           ; PCMCIA IDE/ATAPI Controller
%pcmcia.DeviceDesc%              = pcmcia_atapi_Inst,       PCMCIA\EXP___-PnPIDE-B0B3
%panasonicIdePccard.DeviceDesc%  = pcmcia_atapi_Inst, PCMCIA\KME-KXLC005-A99E   ; Panasonic PCMCIA IDE Controller
%ninjaIdePccard.DeviceDesc%      = pcmcia_atapi_Inst, PCMCIA\_-NinjaATA--3768   ; Ninja PCMCIA IDE Controller
%FujitsuIdePccard.DeviceDesc%    = atapi_fujitsu_Inst, PCMCIA\FUJITSU-IDE-PC_CARD-DDF2  ; Fujitsu PCMCIA IDE Controller
%*PNP0600.PriDeviceDesc% = atapi_Inst_primary, Primary_IDE_Channel              ; Primary Channel
%*PNP0600.SecDeviceDesc% = atapi_Inst_secondary, Secondary_IDE_Channel          ; Secondary Channel
%*PNP0600.DeviceDesc%    = atapi_Inst, *PNP0600                                 ; Generic_ESDI_Hard_Disk_Controller   (BAD_IDE)
%*PNP0600.DeviceDesc%    = atapi_Inst, *AZT0502                                 ; Aztech IDE Controller
%PCI\CC_0101.DeviceDesc% = pciide_Inst,,PCI\CC_0101                             ; Device ID for generic Dual PCI IDE  (UNKNOWN_PCI_IDE)

[IODATA_HDC.NTamd64]
%PCMCIA\LOOKMEET-CBIDE2______-6C0A.DeviceDesc% = pcmcia_atapi_Inst, PCMCIA\LOOKMEET-CBIDE2______-6C0A 

[ALI_HDC.NTamd64]
%PCI\VEN_10B9&DEV_5215.DeviceDesc%=pciide_Inst, PCI\VEN_10B9&DEV_5215                  ; ALi
%PCI\VEN_10B9&DEV_5219.DeviceDesc%=pciide_noAtapiDma_Inst, PCI\VEN_10B9&DEV_5219       ; ALi
%PCI\VEN_10B9&DEV_5229.DeviceDesc%=aliide_Inst, PCI\VEN_10B9&DEV_5229                  ; ALi

[APPIAN_HDC.NTamd64]
%PCI\VEN_1097&DEV_0038.DeviceDesc%=pciide_Inst, PCI\VEN_1097&DEV_0038       ; (UNKNOWN_PCI_IDE)

[CMD_HDC.NTamd64]
%PCI\VEN_1095&DEV_0640.DeviceDesc%=pciide_Inst, PCI\VEN_1095&DEV_0640       ; (UNKNOWN_PCI_IDE)
%PCI\VEN_1095&DEV_0646.DeviceDesc%=pciide_Inst, PCI\VEN_1095&DEV_0646       ; (UNKNOWN_PCI_IDE)
%PCI\VEN_1095&DEV_0646U2.DeviceDesc%=cmdide_Inst, PCI\VEN_1095&DEV_0646&REV_05
%PCI\VEN_1095&DEV_0646U2.DeviceDesc%=cmdide_Inst, PCI\VEN_1095&DEV_0646&REV_07
%PCI\VEN_1095&DEV_0648.DeviceDesc%=cmdide_Inst, PCI\VEN_1095&DEV_0648
%PCI\VEN_1095&DEV_0649.DeviceDesc%=cmdide_Inst, PCI\VEN_1095&DEV_0649

[COMPAQ_HDC.NTamd64]
%PCI\VEN_0E11&DEV_AE33.DeviceDesc%=pciide_Inst, PCI\VEN_0E11&DEV_AE33       ; (UNKNOWN_PCI_IDE)

[INTEL_HDC.NTamd64]
%PCI\VEN_8086&DEV_1222.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_1222     ; Device ID for Intel PIIX  (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_1230.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_1230     ; Device ID for Intel PIIX  (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_7010.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_7010     ; Device ID for Intel PIIX3 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_7111.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_7111     ; Device ID for Intel PIIX4 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_2411.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_2411     ; Device ID for Intel ICH   (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_2421.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_2421     ; Device ID for Intel ICH-0 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_244A.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_244A     ; Device ID for Intel ICH-2 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_244B.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_244B     ; Device ID for Intel ICH-2 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_248A.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_248A     ; Device ID for Intel ICH-3 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_248B.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_248B     ; Device ID for Intel ICH-3 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_24C1.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_24C1     ; Device ID for Intel ICH-4 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_24CA.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_24CA     ; Device ID for Intel ICH-4 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_24CB.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_24CB     ; Device ID for Intel ICH-4 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_24D1.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_24D1     ; Device ID for Intel ICH-5 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_24DB.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_24DB     ; Device ID for Intel ICH-5 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_25A2.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_25A2          ; Device ID for Intel ICH-5 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_25A3.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_25A3          ; Device ID for Intel ICH-5 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_2651.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_2651&CC_0101  ; Device ID for Intel ICH-6 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_2652.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_2652&CC_0101  ; Device ID for Intel ICH-6 (DUAL_GOOD_IDE)   
%PCI\VEN_8086&DEV_2653.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_2653&CC_0101  ; Device ID for Intel ICH-6 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_266F.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_266F          ; Device ID for Intel ICH-6 (DUAL_GOOD_IDE)
%PCI\VEN_8086&DEV_7199.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_7199     ; Device ID for Intel 7199  (SINGLE)
%PCI\VEN_8086&DEV_7601.DeviceDesc%=intelide_Inst, PCI\VEN_8086&DEV_7601     ; Device ID for Intel 7601  (IA64)

[AMD_HDC.NTamd64]
%PCI\VEN_1022&DEV_7409.DeviceDesc%=amdide_Inst, PCI\VEN_1022&DEV_7409                 ; AMD
%PCI\VEN_1022&DEV_7411.DeviceDesc%=amdide_Inst, PCI\VEN_1022&DEV_7411                 ; AMD
%PCI\VEN_1022&DEV_7441.DeviceDesc%=amdide_Inst, PCI\VEN_1022&DEV_7441                 ; AMD
%PCI\VEN_1022&DEV_7469.DeviceDesc%=amdide_Inst, PCI\VEN_1022&DEV_7469                 ; AMD

[PCTECH_HDC.NTamd64]
%PCI\VEN_1042&DEV_1000.DeviceDesc%=pciide_Inst, PCI\VEN_1042&DEV_1000       ; (UNKNOWN_PCI_IDE)

[SIS_HDC.NTamd64]
%PCI\VEN_1039&DEV_0601.DeviceDesc%=pciide_Inst, PCI\VEN_1039&DEV_0601       ; (UNKNOWN_PCI_IDE)
%PCI\VEN_1039&DEV_5513.DeviceDesc%=pciide_Inst, PCI\VEN_1039&DEV_5513       ; (UNKNOWN_PCI_IDE)

[SYMPHONY_HDC.NTamd64]
%PCI\VEN_10AD&DEV_0001.DeviceDesc%=pciide_Inst, PCI\VEN_10AD&DEV_0001       ; (UNKNOWN_PCI_IDE)
%PCI\VEN_10AD&DEV_0150.DeviceDesc%=pciide_Inst, PCI\VEN_10AD&DEV_0150       ; (UNKNOWN_PCI_IDE)

[VIA_HDC.NTamd64]
%PCI\VEN_1106&DEV_0571.DeviceDesc%=viaide_Inst, PCI\VEN_1106&DEV_0571       ; VIA

[IBM_HDC.NTamd64]
%PCMCIA\IBM-MICRODRIVE-7F50.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\IBM-MICRODRIVE-7F50 ; IBM Micro Drive
%PCMCIA\IBM-MICRODRIVE-AA55.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\IBM-MICRODRIVE-AA55 ; IBM Micro Drive

[SERVERWORKS_HDC.NTamd64]
%PCI\VEN_1166&DEV_0211.DeviceDesc%=serverworks_Inst, PCI\VEN_1166&DEV_0211       ; (UNKNOWN_PCI_IDE)
%PCI\VEN_1166&DEV_0212&SUBSYS_02121166.DeviceDesc%=serverworks_Inst, PCI\VEN_1166&DEV_0212&SUBSYS_02121166       ; (UNKNOWN_PCI_IDE)

[LEXAR_HDC.NTamd64]
%LEXAR.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\CL_ATA_FLASH_CARD_LEXAR__-HURRIC_-172F
%LEXAR.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\CL_ATA_FLASH_CARD_LEXAR__-TIDALWV-0E97
%LEXAR.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\____CL_ATA_FLASH_CARD_LEXAR__-HURRIC_-DC37
%LEXAR.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\CL_ATA_FLASH_CARD_LEXAR__-TORNADO-29EC
%LEXAR.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\CL_ATA_FLASH_CARD_LEXAR__-TIDALWV-FD21
%LEXAR.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\LEXARMEDIA_ATA_FLASH_CARD-HUR_HP_-0623

[SONY_HDC.NTamd64]
%PCMCIA\SONY-MEMORYSTICK.DeviceDesc%=pcmcia_atapi_Inst,PCMCIA\SONY-MEMORYSTICK(__4M)-E637
%PCMCIA\SONY-MEMORYSTICK.DeviceDesc%=pcmcia_atapi_Inst,PCMCIA\SONY-MEMORYSTICK(__8M)-9EB3
%PCMCIA\SONY-MEMORYSTICK.DeviceDesc%=pcmcia_atapi_Inst,PCMCIA\SONY-MEMORYSTICK(_16M)-D04D
%PCMCIA\SONY-MEMORYSTICK.DeviceDesc%=pcmcia_atapi_Inst,PCMCIA\SONY-MEMORYSTICK(_32M)-1766
%PCMCIA\SONY-MEMORYSTICK.DeviceDesc%=pcmcia_atapi_Inst,PCMCIA\SONY-MEMORYSTICK(_64M)-8C2C

[SMSC_HDC.NTamd64]
%PCI\VEN_1055&DEV_9130.DeviceDesc%=pciide_inst, PCI\VEN_1055&DEV_9130 ;Standard Microsystems Corp.

[MICRON_HDC.NTamd64]
%PCMCIA\MICRON-MTCF.DeviceDesc%=pcmcia_atapi_Inst, PCMCIA\MICRON-MTCF____-392D

[TOSHIBA_HDC.NTamd64]
%PCI\VEN_1179&DEV_0105.DeviceDesc%=toside_Inst, PCI\VEN_1179&DEV_0105  ;Toshiba 

[NVIDIA_HDC.NTamd64]
%PCI\VEN_10DE&DEV_00E3.DeviceDesc%=pciide_Inst, PCI\VEN_10DE&DEV_00E3 ; NVIDIA
%PCI\VEN_10DE&DEV_00E5.DeviceDesc%=pciide_Inst, PCI\VEN_10DE&DEV_00E5 ; NVIDIA
%PCI\VEN_10DE&DEV_00EE.DeviceDesc%=pciide_Inst, PCI\VEN_10DE&DEV_00EE ; NVIDIA

;****************************************************
; Generic IDE/ATAPI Channel (BAD_IDE)
[atapi_Inst]
CopyFiles = @atapi.sys,storprop_copyfiles
LogConfig = esdilc1, esdilc2, esdilc3, esdilc4
AddReg = atapi_property_provider_AddReg
DelReg = atapi_DelReg

[pcmcia_atapi_Inst]
CopyFiles = @atapi.sys,storprop_copyfiles
LogConfig = esdilc1, esdilc2, esdilc3, esdilc4
AddReg = atapi_property_provider_AddReg, pcmcia_atapi_AddReg
DelReg = atapi_DelReg

[atapi_Inst_primary]
CopyFiles = @atapi.sys,storprop_copyfiles
AddReg = atapi_property_provider_AddReg
DelReg = atapi_DelReg

[atapi_Inst_secondary]
CopyFiles = @atapi.sys,storprop_copyfiles
AddReg = atapi_property_provider_AddReg
DelReg = atapi_DelReg

[atapi_property_provider_AddReg]
HKR,,EnumPropPages32,,"storprop.dll,IdePropPageProvider"

[pcmcia_atapi_AddReg]
HKR,,PcmciaIdeHasSlaveDevice,%REG_DWORD%,0

[atapi_DelReg]
HKR,,MasterDeviceTimingModeAllowed
HKR,,SlaveDeviceTimingModeAllowed
HKR,,MasterDeviceTimingModeAllowed2
HKR,,SlaveDeviceTimingModeAllowed2

[atapi_Inst.Services]
AddService = atapi, %SPSVCINST_ASSOCSERVICE%, atapi_Service_Inst, atapi_EventLog_Inst

[pcmcia_atapi_Inst.Services]
AddService = atapi, %SPSVCINST_ASSOCSERVICE%, atapi_Service_Inst, atapi_EventLog_Inst

[atapi_Inst_primary.Services]
AddService = atapi, %SPSVCINST_ASSOCSERVICE%, atapi_Service_Inst, atapi_EventLog_Inst

[atapi_Inst_secondary.Services]
AddService = atapi, %SPSVCINST_ASSOCSERVICE%, atapi_Service_Inst, atapi_EventLog_Inst

[atapi_Service_Inst]
DisplayName    = %*PNP0600.DeviceDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\atapi.sys
LoadOrderGroup = SCSI Miniport
AddReg         = atapi_parameters_AddReg

[atapi_EventLog_Inst]
AddReg = atapi_EventLog_AddReg

[atapi_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll"
HKR,,TypesSupported,%REG_DWORD%,7

[atapi_parameters_AddReg]
HKR, Parameters, GhostSlave, %REG_MULTI_SZ%, \
    "SunDisk "
HKR, Parameters, UseCheckPowerForFlush, %REG_MULTI_SZ%, \
    "SAMSUNG WNR-31601A (1600MB)             ", \
    "SAMSUNG WNR-31601A (1.6GB)              ", \
    "IBM-DTCA-24090                          TC6OAA2A", \
    "IBM-DTCA-24090                          TC6IAA2A", \
    "IBM-DPLA-25120                          PL8OAA2A", \
    "IBM-DPLA-25120                          PL8IAA2A", \
    "IBM-DPLA-25120                          PL8IAA4A", \
    "IBM-DTCA-23240                          TC5OAA2A", \
    "IBM-DTCA-23240                          TC5IAA2A", \
    "IBM-DPLA-24480                          PL7OAA2A", \
    "IBM-DPLA-24480                          PL7IAA2A"
HKR, Parameters, NoFlushDevice, %REG_MULTI_SZ%, \
    "QUANTUM_LPS525A                         ", \
    "SCR-730                                 "
HKR, Parameters, DefaultPioAtapiDevice, %REG_MULTI_SZ%, \
    "TORiSAN DVD-ROM DRD-N216",\
    "IDE-CD R/RW 2x2x24"
HKR, Parameters, PioOnlyDevice, %REG_MULTI_SZ%, \
    "    Conner Peripherals 425MB - CFS425A  ", \
    "MATSHITA CR-581                         ", \
    "FX600S                                  ", \
    "CD-44E                                  ", \
    "QUANTUM TRB850A                         ", \
    "QUANTUM MARVERICK 540A                  ", \
    " MAXTOR MXT-540  AT                     ", \
    "Maxtor 71260 AT                         ", \
    "Maxtor 7850 AV                          ", \
    "Maxtor 7540 AV                          ", \
    "Maxtor 7213 AT                          ", \
    "Maxtor 7345                             ", \
    "Maxtor 7245 AT                          ", \
    "Maxtor 7245                             ", \
    "Maxtor 7211AU                           ", \
    "Maxtor 7171 AT                          ", \
    "CD-316E                                 ", \
    "SAMSUNG_SCR-2430", \
    "CR-2801TE"
HKR, Parameters, NonRemovableMedia, %REG_MULTI_SZ%, \
    "Kingston Technology DataPak 340         ", \
    "SunDisk SDP5A-10                        ", \
    "SunDisk SDCFB-10                        ", \
    "SunDisk SDP3B-20                        ", \
    "SunDisk SDP3B-175                       ", \
    "SunDisk SDP5-2.5                        ", \
    "Calluna Technology CT260MC              ", \
    "BN-S004AC-S 1.00",                         \
    "Calluna Technology CT520RM",               \
    "Hitachi CV 5.1.1",                         \
    "      ATA_FLASH ",                         \
    "Mitsubishi ATA Card ",                     \
    "LEXAR ATA_FLASH",                          \
    "Micron MTCF004A",                          \
    "Micron MTCF008A",                          \
    "SunDisk SDP3B-110",                        \
    "SunDisk SDCFB-4",                          \
    "BN-CAB-T",                                 \
    "MEMORYSTICK",                               \
    "MEMORYSTICK   8M  8K"
HKR, Parameters, NoPowerDownDevice, %REG_MULTI_SZ%,   \
    "RD-DRC001-M                             ", \
    "CS-R37 0                                "
HKR, Parameters, AutoEjectZipDevice, %REG_MULTI_SZ%,    \
    "IOMEGA  ZIP 100       ATAPI             23.D    ", \
    "IOMEGA  ZIP 100       ATAPI             21.D    ", \
    "IOMEGA  ZIP 100       ATAPI             20.D    ", \
    "IOMEGA  ZIP 100       ATAPI             91.D    ", \
    "IOMEGA  ZIP 100                         B.29    ", \
    "IOMEGA  ZIP 100                         B.22    "
HKR, Parameters, NeedIdentDevice, %REG_MULTI_SZ%,    \
    "QUANTUM FIREBALL"

[esdilc1]
ConfigPriority=HARDWIRED
IOConfig=1f0-1f7(3ff::)
IOConfig=3f6-3f6(3ff::)
IRQConfig=14

[esdilc2]
ConfigPriority=HARDWIRED
IOConfig=170-177(3ff::)
IOConfig=376-376(3ff::)
IRQConfig=15

[esdilc3]
ConfigPriority=HARDWIRED
IOConfig=1e8-1ef(3ff::)
IOConfig=3ee-3ee(3ff::)
IRQConfig=11

[esdilc4]
ConfigPriority=HARDWIRED
IOConfig=168-16f(3ff::)
IOConfig=36e-36e(3ff::)
IRQConfig=10

[atapi_Inst.PosDup]
*PNP0600

[*pnp0600.det]               ;ESDI Controller
LogConfig = esdilc1, esdilc2, esdilc3, esdilc4
AddReg = HDC_HW_REG

[HDC_HW_REG]
HKR,,NoSetupUI,,1

;****************************************************
; Fujitsu PCMCIA Controller
[atapi_fujitsu_Inst]
CopyFiles = @atapi.sys,storprop_copyfiles
AddReg = atapi_property_provider_AddReg, pcmcia_atapi_AddReg
DelReg = atapi_DelReg

[atapi_fujitsu_Inst.Services]
AddService = atapi, %SPSVCINST_ASSOCSERVICE%, atapi_Service_Inst, atapi_EventLog_Inst

[atapi_fujitsu_Inst.LogConfigOverride]
LogConfig = fujitsu.LogConfig0

[fujitsu.LogConfig0]
ConfigPriority=NORMAL
IOConfig=10@100-400%fff0
IRQConfig=14,15,5,7,9,11,12,3
PcCardConfig=1:0:0(W)

;****************************************************
; Generic PCI IDE Controller (UNKNOWN_PCI_IDE)
[pciide_Inst]
CopyFiles = @pciide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys

[pciide_Inst.Services]
AddService = pciide, %SPSVCINST_ASSOCSERVICE%, pciide_Service_Inst

[pciide_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\pciide.sys
LoadOrderGroup = System Bus Extender

[pciide_Inst.PosDup]            
*PNP0600


;****************************************************
; PCI IDE Controller without ATAPI DMA support
[pciide_noAtapiDma_Inst]
CopyFiles = @pciide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys
AddReg=NoDmaForAtapiDevice_AddReg

[pciide_noAtapiDma_Inst.Services]
AddService = pciide, %SPSVCINST_ASSOCSERVICE%, pciide_Service_Inst

[pciide_noAtapiDma_Inst.PosDup]                        
*PNP0600


;**********************************************************
; Intel PCI IDE Controller (DUAL_GOOD_IDE)
[intelide_Inst]
CopyFiles = @intelide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys
AddReg = intelChannelEnableCheck_AddReg

[intelide_Inst.Services]
AddService = intelide, %SPSVCINST_ASSOCSERVICE%, intelide_Service_Inst

[intelide_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\intelide.sys
LoadOrderGroup = System Bus Extender

[intelChannelEnableCheck_AddReg]
HKR,,MasterOnMask,%REG_DWORD%,0x00000080
HKR,,MasterOnConfigOffset,%REG_DWORD%,0x00000041
HKR,,SlaveOnMask,%REG_DWORD%,0x00000080
HKR,,SlaveOnConfigOffset,%REG_DWORD%,0x00000043

[intelide_Inst.PosDup]
*PNP0600

;**********************************************************
; SERVER WORKS PCI IDE Controller 
[serverworks_Inst]
CopyFiles = @pciide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys
;;AddReg = serverworksChannelEnableCheck_AddReg

[serverworks_Inst.Services]
AddService = pciide, %SPSVCINST_ASSOCSERVICE%, serverworks_Service_Inst

[serverworks_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\pciide.sys
LoadOrderGroup = System Bus Extender

[serverworksChannelEnableCheck_AddReg]
HKR,,MasterOnMask,%REG_DWORD%,0x00000001
HKR,,MasterOnConfigOffset,%REG_DWORD%,0x00000040
HKR,,SlaveOnMask,%REG_DWORD%,0x00000002
HKR,,SlaveOnConfigOffset,%REG_DWORD%,0x00000040

[serverworks_Inst.PosDup]
*PNP0600

;********************************************************
; Toshiba PCI IDE Controller
[toside_inst]
CopyFiles = @toside.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys

[toside_inst.Services]
AddService = toside, %SPSVCINST_ASSOCSERVICE%, toside_Service_Inst

[toside_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\toside.sys
LoadOrderGroup = System Bus Extender

;********************************************************
; CMD PCI IDE CONTROLLER
[cmdide_inst]
CopyFiles = @cmdide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys

[cmdide_Inst.Services]
AddService = cmdide, %SPSVCINST_ASSOCSERVICE%, cmdide_Service_Inst

[cmdide_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\cmdide.sys
LoadOrderGroup = System Bus Extender

;********************************************************
; VIA PCI IDE CONTROLLER
[viaide_inst]
CopyFiles = @viaide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys
AddReg = viaide_AddReg

[viaide_Inst.Services]
AddService = viaide, %SPSVCINST_ASSOCSERVICE%, viaide_Service_Inst

[viaide_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\viaide.sys
LoadOrderGroup = System Bus Extender

[viaide_AddReg]
HKR,, TransferModeTiming, %REG_MULTI_SZ%, \
                "18", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "0", \
                "15"

;****************************************************
; ALI IDE Controller 
[aliide_Inst]
CopyFiles = @aliide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys


[aliide_Inst.Services]
AddService = aliide, %SPSVCINST_ASSOCSERVICE%, aliide_Service_Inst

[aliide_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\aliide.sys
LoadOrderGroup = System Bus Extender

[aliide_Inst.PosDup]            
*PNP0600

;****************************************************
; AMD IDE Controller 
[amdide_Inst]
CopyFiles = @amdide.sys
CopyFiles = @pciidex.sys
CopyFiles = @atapi.sys

[amdide_Inst.Services]
AddService = amdide, 0x00000002, amdide_Service_Inst

[amdide_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\amdide.sys
LoadOrderGroup = System Bus Extender

;********************************************************
; Extra Registry Entries

[NoDmaForAtapiDevice_AddReg]
HKR,,DeviceControlFlags,%REG_DWORD%,0x00000001          ; PCIIDEX_DCF_NO_ATAPI_DMA

[SyncAccess.RegHW]
HKR,,SyncAccess,%REG_DWORD%,0x00000001


[ControlFlags]
CopyFilesOnly=PCI\CC_0101,PCI\VEN_10B9&DEV_5215,PCI\VEN_1097&DEV_0038,PCI\VEN_8086&DEV_1222
CopyFilesOnly=PCI\VEN_8086&DEV_1230,PCI\VEN_8086&DEV_7010,PCI\VEN_8086&DEV_7111,PCI\VEN_1042&DEV_1000
CopyFilesOnly=PCI\VEN_10AD&DEV_0001,PCI\VEN_1095&DEV_0640,PCI\VEN_1095&DEV_0646,PCI\VEN_10B9&DEV_5219
CopyFilesOnly=PCI\VEN_1039&DEV_0601,PCI\VEN_1039&DEV_5513,PCI\VEN_0E11&DEV_AE33,PCI\VEN_10AD&DEV_0150
CopyFilesOnly=PCI\VEN_10B9&DEV_5229


































[Strings]


*PNP0600.DeviceDesc     = "Standard IDE/ESDI Hard Disk Controller"















HDCClassName            = "IDE ATA/ATAPI controllers"
MS                      = "Microsoft"
MS-Drivers              = "(Standard IDE ATA/ATAPI controllers)"
*PNP0600.PriDeviceDesc  = "Primary IDE Channel"
*PNP0600.SecDeviceDesc  = "Secondary IDE Channel"
PCI\CC_0101.DeviceDesc  = "Standard Dual Channel PCI IDE Controller"
IODATA = "I-O DATA DEVICE,INC."
PCMCIA\LOOKMEET-CBIDE2______-6C0A.DeviceDesc = "CBIDE2-LM DuoATA Card (16Bit Mode)"
ALI="ULi Electronics Inc."
PCI\VEN_10B9&DEV_5215.DeviceDesc="ULi PCI IDE Controller"
PCI\VEN_10B9&DEV_5219.DeviceDesc="ULi M5219 PCI Bus Master IDE Controller"
PCI\VEN_10B9&DEV_5229.DeviceDesc="ULi M5229 PCI Bus Master IDE Controller"
APPIAN="Appian Technology"
PCI\VEN_1097&DEV_0038.DeviceDesc="Appian PCI IDE Controller"
CMD="CMD Technology"
PCI\VEN_1095&DEV_0640.DeviceDesc="CMD PCI-0640 PCI to IDE Controller"
PCI\VEN_1095&DEV_0643.DeviceDesc="CMD PCI-0643 PCI to IDE Controller"
PCI\VEN_1095&DEV_0646.DeviceDesc="CMD PCI-0646 Bus Master PCI to IDE Controller"
PCI\VEN_1095&DEV_0646U2.DeviceDesc="CMD PCI-0646U2 Ultra DMA IDE Controller"
PCI\VEN_1095&DEV_0648.DeviceDesc="CMD PCI-0648 Ultra DMA IDE Controller"
PCI\VEN_1095&DEV_0649.DeviceDesc="CMD PCI-0649 Ultra DMA IDE Controller"
COMPAQ="Compaq"
PCI\VEN_0E11&DEV_AE33.DeviceDesc="Compaq PCI IDE Controller"
SERVERWORKS="ServerWorks"
PCI\VEN_1166&DEV_0211.DeviceDesc="OSB4 IDE Controller"
PCI\VEN_1166&DEV_0212&SUBSYS_02121166.DeviceDesc="CSB5 IDE Controller"
INTEL="Intel"
PCI\VEN_8086&DEV_1222.DeviceDesc="Intel(R) 82092AA PCI IDE Controller"
PCI\VEN_8086&DEV_1230.DeviceDesc="Intel(R) 82371FB PCI Bus Master IDE Controller"
PCI\VEN_8086&DEV_7010.DeviceDesc="Intel(R) 82371SB PCI Bus Master IDE Controller"
PCI\VEN_8086&DEV_7111.DeviceDesc="Intel(R) 82371AB/EB PCI Bus Master IDE Controller"
PCI\VEN_8086&DEV_2411.DeviceDesc="Intel(R) 82801AA Bus Master IDE Controller"
PCI\VEN_8086&DEV_2421.DeviceDesc="Intel(R) 82801AB Bus Master IDE Controller"
PCI\VEN_8086&DEV_7199.DeviceDesc="Intel(R) 82440MX Bus Master IDE Controller"
PCI\VEN_8086&DEV_244A.DeviceDesc="Intel(R) 82801BAM Ultra ATA Storage Controller - 244A"
PCI\VEN_8086&DEV_244B.DeviceDesc="Intel(R) 82801BA Ultra ATA Storage Controller - 244B"
PCI\VEN_8086&DEV_248A.DeviceDesc="Intel(R) 82801CAM Ultra ATA Storage Controller-248A"
PCI\VEN_8086&DEV_248B.DeviceDesc="Intel(R) 82801CA Ultra ATA Storage Controller-248B"
PCI\VEN_8086&DEV_24C1.DeviceDesc="Intel(R) 82801DBM Ultra ATA Storage Controller - 24C1"
PCI\VEN_8086&DEV_24CA.DeviceDesc="Intel(R) 82801DBM Ultra ATA Storage Controller - 24CA"
PCI\VEN_8086&DEV_24CB.DeviceDesc="Intel(R) 82801DB Ultra ATA Storage Controller-24CB"
PCI\VEN_8086&DEV_24D1.DeviceDesc="Intel(R) 82801EB Ultra ATA Storage Controllers - 24D1"
PCI\VEN_8086&DEV_24DB.DeviceDesc="Intel(R) 82801EB Ultra ATA Storage Controllers - 24DB"
PCI\VEN_8086&DEV_25A2.DeviceDesc="Intel(R) 6300ESB Ultra ATA Storage Controller - 25A2"
PCI\VEN_8086&DEV_25A3.DeviceDesc="Intel(R) 6300ESB Ultra ATA Storage/SATA Controller - 25A3" 
PCI\VEN_8086&DEV_2651.DeviceDesc="Intel(R) 82801FB Ultra ATA Storage Controllers - 2651"
PCI\VEN_8086&DEV_2652.DeviceDesc="Intel(R) 82801FB Ultra ATA Storage Controllers - 2652"
PCI\VEN_8086&DEV_2653.DeviceDesc="Intel(R) 82801FBM Ultra ATA Storage Controllers - 2653"
PCI\VEN_8086&DEV_266F.DeviceDesc="Intel(R) 82801FB/FBM Ultra ATA Storage Controllers - 266F"
PCI\VEN_8086&DEV_7601.DeviceDesc="Intel(R) IA64 Bus Master IDE Controller"

AMD="Advanced Micro Devices"
PCI\VEN_1022&DEV_7409.DeviceDesc="AMD-756 PCI Bus Master IDE Controller"
PCI\VEN_1022&DEV_7411.DeviceDesc="AMD-766 PCI Bus Master IDE Controller"
PCI\VEN_1022&DEV_7441.DeviceDesc="AMD-768 PCI Bus Master IDE Controller"
PCI\VEN_1022&DEV_7469.DeviceDesc="AMD-8111 PCI Bus Master IDE Controller"

PCTECH="PC Technology"
PCI\VEN_1042&DEV_1000.DeviceDesc="PC Tech PCI IDE Single or Dual Port Controller"
SIS="Silicon Integrated System"
PCI\VEN_1039&DEV_0601.DeviceDesc="SiS PCI IDE Controller"
PCI\VEN_1039&DEV_5513.DeviceDesc="SiS PCI IDE Controller"
SYMPHONY="Symphony Labs"
PCI\VEN_10AD&DEV_0001.DeviceDesc="Symphony PCI IDE Controller"
PCI\VEN_10AD&DEV_0150.DeviceDesc="Symphony PCI IDE Controller"
VIA="VIA Technologies, Inc."
PCI\VEN_1106&DEV_0571.DeviceDesc="VIA Bus Master IDE Controller"
IBM="IBM"
PCMCIA\IBM-MICRODRIVE-7F50.DeviceDesc="IBM Microdrive"
PCMCIA\IBM-MICRODRIVE-AA55.DeviceDesc="IBM Microdrive"
SONY="SONY"
PCMCIA\SONY-MEMORYSTICK.DeviceDesc="Sony Memory Stick" 
LEXAR="Lexar Microsystems"
LEXAR.DeviceDesc="Lexar Media Digital Film Card"
SMSC="Standard Microsystems Corp"
PCI\VEN_1055&DEV_9130.DeviceDesc="SMSC SLC90E66 PCI Bus Master IDE Controller"
MICRON="Micron"
PCMCIA\Micron-MTCF.DeviceDesc="Micron ATA Flash Card"
TOSHIBA="TOSHIBA"
PCI\VEN_1179&DEV_0105.DeviceDesc = "Toshiba PCI-0105 IDE Controller"
NVIDIA="NVIDIA"
PCI\VEN_10DE&DEV_00E3.DeviceDesc="NVIDIA nForce3 250 Serial ATA Controller"
PCI\VEN_10DE&DEV_00E5.DeviceDesc="NVIDIA nForce3 250 Parallel ATA Controller"
PCI\VEN_10DE&DEV_00EE.DeviceDesc="NVIDIA nForce3 250 Serial ATA Controller"

pcmcia.DeviceDesc               = "PCMCIA IDE/ATAPI Controller"
SanDisk.DeviceDesc              = "SanDisk/SunDisk PCMCIA Flash Card"
FujitsuIdePccard.DeviceDesc     = "Fujitsu IDE PC-Card"
panasonicIdePccard.DeviceDesc   = "Panasonic ATAPI CD-ROM Interface Card"
ninjaIdePccard.DeviceDesc        = "ATAPI CD-ROM Interface Card"


;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_BOOT_START     = 0
SERVICE_ERROR_NORMAL   = 1
REG_EXPAND_SZ          = 0x00020000
REG_DWORD              = 0x00010001
REG_MULTI_SZ           = 0x00010000

