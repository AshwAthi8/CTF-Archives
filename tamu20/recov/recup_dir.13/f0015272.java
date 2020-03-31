_Install.NT]
CopyFiles=@sffdisk.sys
CopyFiles=@sffp_sd.sys

[sdstorage_Install.NT.Services]
AddService=sffdisk, 2, sffdisk_service_Install
AddService=sffp_sd,, sffp_sd_service_Install

[sdstorage_Install.NT.HW]
AddReg=SdStorageHwReg

[SdStorageHwReg]
HKR,,"LowerFilters",0x00010000,"sffp_sd"

HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\PerHwIdStorage\SD#class_storage",,0x00000012
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\PerHwIdStorage\SD#class_storage","Icons",0x00010000,"%%SystemRoot%%\system32\sdhcinst.dll,-2"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\PerHwIdStorage\SD#class_storage","Label",,"%DESC_SDSTORAGE%"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\PerHwIdStorage\SD#class_storage","NoSoftEject",0x00010001,0x00000001

[sffp_sd_ServiceReg]
HKR,Parameters,SdCmdFlags,1,    09,01, 0A,01, 0D,01, \
                                22,01, 23,01, 24,01, 25,01, 32,01, 39,01

HKR,Parameters,SdAppCmdFlags,1, 0D,01, \
                                12,01, 19,01, 1A,01, 26,01, 2B,01, \
                                2C,01, 2D,01, 2E,01, 2F,01, 30,01, 31,01, \
                                33,01

;
; SD protocol driver service install section
;

[sffp_sd_service_Install]
DisplayName    = %sffp_sd_ServiceDesc%
ServiceType    = 1
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\sffp_sd.sys
AddReg         = sffp_sd_ServiceReg

;
; SffDisk Class Driver service install section
;

[sffdisk_service_Install]
DisplayName    = %sffdisk_ServiceDesc%
ServiceType    = 1
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\sffdisk.sys


[Strings]
MS                      = "Microsoft"
sffdisk_ServiceDesc     = "SFF Storage Class Driver"
sffp_srm_ServiceDesc    = "SFF Storage Protocol Driver for PcCard SRAM"
sffp_sd_ServiceDesc     = "SFF Storage Protocol Driver for SDBus"
Generic                 = "Generic"

GenericPcCardSram.DeviceDesc = "Pcmcia SRAM Storage Card"
GenericSDMemoryCard.DeviceDesc = "SD Storage Card"
DESC_SDSTORAGE = "Secure Digital storage device"
