; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature="$WINDOWS NT$"
Class=MTD
ClassGuid={4D36E970-E325-11CE-BFC1-08002BE10318}
Provider=%MS%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ClassInstall32.NT]
AddReg=MTD_Class_Addreg

[MTD_Class_Addreg]
HKR,,,,%MTDClassName%
HKR,,Icon,,"-11"
HKR,,DeviceType,0x10001,4                       ; FILE_DEVICE_CONTROLLER
HKR,,DeviceCharacteristics,0x10001,0x100        ; Use same security checks on relative opens
HKR,,Security,,"D:P(A;;GAFA;;;SY)(A;;GAFA;;;BA)"

[DestinationDirs]
DefaultDestDir=12 ;DIRID_DRIVERS

[ControlFlags]
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-C4FD
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-09D6
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-2845
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-26CD
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-A2E4
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-B76D
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-ECFE
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-1176
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-329E
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-ADD5
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-75FA
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-61F3
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-85C3
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-10C8
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-A421
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-3971
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-D0C9
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-45C2
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-6DD4
ExcludeFromSelect = PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-F29F


[Manufacturer]

[M-Systems.NTamd64]
%DiskOnChip.DeviceDesc%=msystems_diskOnChip_Install,FlashMedia\ControllerMSystemsDiskOnChip2000__1.00
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-C4FD
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-09D6
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-2845
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-26CD
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-A2E4
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-B76D
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-ECFE
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-1176
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-329E
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-ADD5
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-75FA
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-61F3
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-85C3
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-10C8
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-A421
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-3971
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-D0C9
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-45C2
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-6DD4
%MSystemsPCMCIAFlashDisk.DeviceDesc%=msystems_flashdisk_Install,PCMCIA\M-Systems-M-SYS_Flash_Memory_Card-F29F

[msystems_diskOnChip_Install]
CopyFiles=@tffsport.sys
LogConfig = diskOnChipLogConfig

[msystems_diskOnChip_Install.Services]
AddService=tffsport, %SPSVCINST_ASSOCSERVICE%, tffsport_Service_Inst, tffsport_EventLog_Inst

[tffsport_Service_Inst]
DisplayName    = %DiskOnChip.DeviceDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\tffsport.sys
LoadOrderGroup = SCSI Miniport

[diskOnChipLogConfig]
ConfigPriority=HARDRECONFIG
MemConfig=2000@C8000-F0000%FE000

[tffsport_EventLog_Inst]
AddReg = tffsport_EventLog_AddReg

[tffsport_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll"
HKR,,TypesSupported,%REG_DWORD%,7


;;
;; M-Systems PCMCIA Flash Disk
;;
[msystems_flashdisk_Install.NT]
CopyFiles=@tffsport.sys

[msystems_flashdisk_Install.NT.Services]
AddService=tffsport, %SPSVCINST_ASSOCSERVICE%, msystems_flashdisk_service_Install, tffsport_EventLog_Inst

[msystems_flashdisk_Install.NT.LogConfigOverride]
LogConfig = msystems_flashdisk_logconfig

[msystems_flashdisk_logconfig]
MemConfig=2000@C8000-F0000%FE000
PcCardConfig=0(W)

[msystems_flashdisk_service_Install]
DisplayName    = %MSystemsPCMCIAFlashDisk.DeviceDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\tffsport.sys
LoadOrderGroup = SCSI Miniport


































[Strings]


MTDClassName            = "PCMCIA and Flash memory devices"



















MS                      = "Microsoft"
M-Systems               = "M-Systems Flash Disk Pioneers"
DiskOnChip.DeviceDesc   = "M-Systems DiskOnChip 2000"
MSystemsPCMCIAFlashDisk.DeviceDesc = "M-Systems PCMCIA Flash Card"

;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_BOOT_START     = 0
SERVICE_ERROR_NORMAL   = 1
REG_EXPAND_SZ          = 0x00020000
REG_DWORD              = 0x00010001
REG_MULTI_SZ           = 0x00010000

