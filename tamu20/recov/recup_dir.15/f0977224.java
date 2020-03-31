URPOSE, OR ANY OTHER WARRANTY.  Intel disclaims all liability,
; including liability for infringement of any proprietary rights, relating to
; use of the code. No license, express or implied, by estoppel or otherwise,
; to any intellectual property rights is granted herein.
;
;=============================================================================

; Installation inf for the Intel Corporation graphics adapter.

[Version]
Signature="$WINDOWS NT$"
Provider=%Intel%
ClassGUID={4D36E968-E325-11CE-BFC1-08002BE10318}
Class=Display
LayoutFile=layout.inf
DriverVer=11/16/2004,6.14.10.3953

[DestinationDirs]
DefaultDestDir   = 11
ialm.Miniport  = 12  ; drivers
ialm.Display   = 11  ; system32

[Manufacturer]
%Intel%   = Intel.Mfg, NTamd64

[Intel.Mfg.NTamd64]
%iGDGD0% = iGDG0, PCI\VEN_8086&DEV_2582
%iGDGD1% = iGDG1, PCI\VEN_8086&DEV_2782

[ControlFlags]
ExcludeFromSelect = *

[iGDG0]
CopyFiles=ialm.Miniport, ialm.Display

[iGDG1]
CopyFiles=ialm.Miniport, ialm.Display

[ialm.Miniport]
ialmnt5.sys

[ialm.Display]
ialmrnt5.dll
ialmdnt5.dll
ialmdev5.dll
ialmdd5.dll

[iGDG0.Services]
AddService = ialm, 0x00000002, ialm_Service_Inst, ialm_EventLog_Inst

[iGDG1.Services]
AddService = ialm, 0x00000002, ialm_Service_Inst, ialm_EventLog_Inst

[ialm_Service_Inst]
ServiceType    = 1               ; SERVICE_KERNEL_DRIVER
StartType      = 3               ; SERVICE_DEMAND_START
ErrorControl   = 0               ; SERVICE_ERROR_IGNORE
LoadOrderGroup = Video
ServiceBinary  = %12%\ialmnt5.sys
AddReg         = ialm_Service_AddReg

[ialm_EventLog_Inst]
AddReg = ialm_EventLog_AddReg

[ialm_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%SystemRoot%"\System32\IoLogMsg.dll;%SystemRoot%"\System32\drivers\ialmnt5.sys"
HKR,,TypesSupported,0x00010001,7

[ialm_Service_AddReg]
HKR, Video, Service, %REG_SZ%, ialm

[iGDG0.SoftwareSettings]
AddReg = iGDG_SoftwareDeviceSettings
AddReg = Rotation_AddSwSettings
DelReg = Rotation_DelSwSettings

[iGDG1.SoftwareSettings]
AddReg = iGDG_SoftwareDeviceSettings
AddReg = Rotation_AddSwSettings
DelReg = Rotation_DelSwSettings

[Rotation_AddSwSettings]
HKR,, Display1_RotationCaps,%REG_DWORD%, 7  ; Portrait, Inverted LandScape, Inverted Portrait
HKR,, Display2_RotationCaps,%REG_DWORD%, 7  ; Portrait, Inverted LandScape, Inverted Portrait
HKR,, Display1_RotationPolicy,%REG_DWORD%, 0  ; default policy
HKR,, Display2_RotationPolicy,%REG_DWORD%, 0  ; default policy
HKR,, Display1_RotationConfig,%REG_DWORD%, 0  ; default configuration
HKR,, Display2_RotationConfig,%REG_DWORD%, 0  ; default configuration
HKR,, Display1_EnableRotation,%REG_DWORD%, 0  ; disable rotation for in-box driver

[Rotation_DelSwSettings]
HKR,Display1_RotationCaps
HKR,Display2_RotationCaps
HKR,Display1_RotationPolicy
HKR,Display2_RotationPolicy

[iGDG_SoftwareDeviceSettings]
HKR,,CapabilityOverride, %REG_DWORD%, 0x8
HKR,, InstalledDisplayDrivers,     %REG_MULTI_SZ%, ialmrnt5
HKR,, VgaCompatible,                 %REG_DWORD%,    0
;Enable Multifunction support
HKR,,MultifunctionSupported, %REG_DWORD%, 1
HKR,,NativeResolution, %REG_DWORD%, 1
HKR,,NativeBPP, %REG_DWORD%, 1
HKR,,ConfigID, %REG_DWORD%, 0

[iGDG0.GeneralConfigData]
MaximumNumberOfDevices = 2
MaximumDeviceMemoryConfiguration = 256

[iGDG1.GeneralConfigData]
MaximumNumberOfDevices = 2
MaximumDeviceMemoryConfiguration = 256

[Strings]
; Non-Localizable Strings
REG_SZ         = 0x00000000
REG_MULTI_SZ   = 0x00010000
REG_DWORD      = 0x00010001
SERVICEROOT    = "System\CurrentControlSet\Services"

; Localizable Strings
DiskId          = "Intel(R) Graphics Media Accelerator Driver"
Intel           = "Intel Corporation"
iGDGD0          = "Intel(R) 82915G/GV/910GL Express Chipset Family"
iGDGD1          = "Intel(R) 82915G/GV/910GL Express Chipset Family"
