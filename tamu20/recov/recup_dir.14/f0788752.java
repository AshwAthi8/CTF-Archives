amdiskBusDesc% = BusInstall, Ramdisk, DetectedInternal\Ramdisk, Detected\Ramdisk
%RamdiskVolumeDesc% = VolumeInstall, Ramdisk\RamVolume

[ControlFlags]
ExcludeFromSelect = Ramdisk\Volume

[BusInstall.NT]
CopyFiles = BusCopyfiles

[BusInstall.NT.Services]
AddService = Ramdisk, %SPSVCINST_ASSOCSERVICE%, BusServiceInst

[VolumeInstall.NT]
CopyFiles = VolumeCopyFiles

[VolumeInstall.NT.Services]
AddService = , %SPSVCINST_ASSOCSERVICE% ; null service installation

[BusServiceInst]
ServiceType   = %SERVICE_KERNEL_DRIVER%
StartType     = %SERVICE_DEMAND_START%
ErrorControl  = %SERVICE_ERROR_NORMAL%
DisplayName   = %RamdiskServiceDesc%
ServiceBinary = %12%\ramdisk.sys
AddReg        = BusAddReg

[BusAddReg]
HKR, "Debug", "DebugComponents",   %REG_DWORD%, 0x7FFFFFFF
HKR, "Debug", "DebugLevel",        %REG_DWORD%, 0x00000005

[Strings]
MS                 = "Microsoft"
ClassName          = "Ramdisk"
RamdiskBusDesc     = "Windows RAM Disk Controller"
RamdiskDiskDesc    = "Windows RAM Disk Device (disk)"
RamdiskVolumeDesc  = "Windows RAM Disk Device (volume)"
RamdiskServiceDesc = "Windows RAM Disk Driver"

;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_DEMAND_START   = 3
SERVICE_ERROR_NORMAL   = 1
REG_DWORD              = 0x00010001
