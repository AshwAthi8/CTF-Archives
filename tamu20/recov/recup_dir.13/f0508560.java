9 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "SBP2" {d48179be-ec20-11d1-b6b8-00c04fa372a7}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.94]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "SmartCardReader" {50DD5230-BA8A-11D1-BF5D-0000F805F530}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.96]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "Security Accelerator" {268C95A1-EDFE-11d3-95C3-0010DC4050A5}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.98]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "Image" {6bdd1fc6-810f-11d0-bec7-08002be2092f}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.101]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "TapeDrive" {6D807884-7D21-11CF-801C-08002BE10318}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.103]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "USB" {36FC9E60-C465-11CF-8056-444553540000}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.105]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "MEDIA" {4d36e96c-e325-11ce-bfc1-08002be10318}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.108]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "Volume" {71A27CDD-812A-11D0-BEC7-08002BE2092F}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.110]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "VolumeSnapshot" {533C5B84-EC70-11d2-9505-00C04F79DEAF}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:20 264.112]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I140 Installing device class: "WCEUSBS" {25dbce51-6c8f-4a72-8a6d-b54c2b4fc835}.
#I141 Class install completed with no errors.
[2020/03/01 19:00:28 264.898]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I393 Modified INF cache "C:\WINDOWS\inf\INFCACHE.1".
[2020/03/01 19:00:29 264.1017 Driver Install]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#W059 Selecting best compatible driver failed. Error 0xe0000228: There are no compatible drivers for this device.
#W157 Default installer failed. Error 0xe0000228: There are no compatible drivers for this device.
#I060 Set selected driver.
#-166 Device install function: DIF_INSTALLDEVICE.
#I125 Installing NULL driver for "ROOT\LEGACY_KSECDD\0000".
#W100 Query-removal during install of "ROOT\LEGACY_KSECDD\0000" was vetoed by "Root\LEGACY_KSECDD\0000" (veto type 1: PNP_VetoLegacyDevice).
#W104 Device "ROOT\LEGACY_KSECDD\0000" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "ROOT\LEGACY_KSECDD\0000" finished successfully.
[2020/03/01 19:00:29 264.1019 Driver Install]
#-019 Searching for hardware ID(s): root\update
#-199 Exe; Installation inf for IRBUS Driver
;

[Version]
Signature="$WINDOWS NT$"
Class=USB
ClassGUID={36FC9E60-C465-11CF-8056-444553540000}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%Microsoft%=MicrosoftHw,NTx86

[MicrosoftHw.NTx86]
%USB\VID_045E&PID_006D.DeviceDesc%=IrBus, USB\VID_045E&PID_006D

[ControlFlags]
ExcludeFromSelect=USB\VID_045E&PID_006D

[DestinationDirs]
DefaultDestDir = 12

[IrBus.NT]
CopyFiles=IrBus.NT.Copy

[IrBus.NT.Copy]
IrBus.sys

[IrBus.NT.HW]
AddReg=IrBus.NT.AddReg.HW

[IrBus.NT.AddReg.HW]
HKR,,"Security",,"D:P(A;;GA;;;SY)(A;;GA;;;LS)"

[IrBus.NT.Services]
AddService = IrBus,0x00000002,IrBus.AddService

[IrBus.AddService]
DisplayName    = %IrBus.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\IrBus.sys
LoadOrderGroup = PNP Filter



































[Strings]
Microsoft="Microsoft"
USB\VID_045E&PID_006D.DeviceDesc="eHome Infrared Receiver"
FTD2XX.SvcDesc="Future Technology Devices International device driver"
IrBus.SvcDesc="Infrared bus filter driver for eHome remote controls"

