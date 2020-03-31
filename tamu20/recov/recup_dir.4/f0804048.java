;----------------------------------------------------------------------------
; Watchdog Timer Device
;----------------------------------------------------------------------------
;

[Version]
Signature="$WINDOWS NT$"
Class=System
ClassGuid={4D36E97D-E325-11CE-BFC1-08002BE10318}
Provider=%MICROSOFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[DestinationDirs]
WdDeviceCopyFiles=10,system32\drivers

[Manufacturer]
%MICROSOFT%=Microsoft,NTamd64

[Microsoft.NTamd64]
%WdDeviceDesc%=WdDevice,*PNP0C18

[WdDevice]
CopyFiles=WdDeviceCopyFiles

[WdDeviceCopyFiles]
wd.sys

[WdDevice.Services]
AddService=Wd,%SPSVCINST_ASSOCSERVICE%,WdDeviceService

[WdDeviceService]
ServiceType=%SERVICE_KERNEL_DRIVER%
StartType=%SERVICE_BOOT_START%
ErrorControl=%SERVICE_ERROR_NORMAL%
DisplayName=%WdServiceDisplayName%
ServiceBinary=%12%\wd.sys

[Strings]

SPSVCINST_ASSOCSERVICE                   = 0x00000002
REG_MULTI_SZ                             = 0x00010000

SERVICE_BOOT_START                       = 0
SERVICE_ERROR_NORMAL                     = 1
SERVICE_KERNEL_DRIVER                    = 1
SERVICE_SYSTEM_START                     = 1

MICROSOFT                                = "Microsoft"

WdDeviceDesc                             = "Microsoft Watchdog Timer"
WdServiceDisplayName                     = "Microsoft Watchdog Timer Driver"

