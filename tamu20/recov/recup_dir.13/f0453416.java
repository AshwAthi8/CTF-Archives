ntrolSet\Control\ApmLegalHal"

[DestinationDirs]
DefaultDestDir = 11

[Manufacturer]
%GENDEV_MFG%=GENDEV_SYS,NTamd64

[GENDEV_SYS.NTamd64]
%ACPI_AMD64_UP.DeviceDesc%   = ACPI_AMD64_UP_HAL, ACPIAPIC_UP
%ACPI_AMD64_MP.DeviceDesc%   = ACPI_AMD64_MP_HAL, ACPIAPIC_MP


;****************************************************
; Standard AMD64 HAL.  Although there is only one HAL, we have two install
; sections so that we can move from the UP kernel to the MP kernel when
; processors are added to the machine.

[ACPI_AMD64_UP_HAL]
CopyFiles = ACPI_AMD64_HAL.CopyFiles
CopyFiles = AMD64_UP.CopyFiles
AddReg = rp_tags_addreg
Reboot

[ACPI_AMD64_MP_HAL]
CopyFiles = ACPI_AMD64_HAL.CopyFiles
CopyFiles = AMD64_MP.CopyFiles
AddReg = rp_tags_addreg
Reboot

[AMD64_UP.CopyFiles]
ntoskrnl.exe,,,0x3000

[AMD64_MP.CopyFiles]
ntoskrnl.exe, ntkrnlmp.exe,,0x3000

[ACPI_AMD64_HAL.CopyFiles]
hal.dll,,,0x3000

































































































[Strings]









ComputerClassName = "Computer"
MSFT              = "Microsoft"

;*******************************************
;device descriptions

GENDEV_MFG = "(Standard computers)"


ACPI_AMD64_UP.DeviceDesc     = "ACPI Uniprocessor x64-based PC"
ACPI_AMD64_MP.DeviceDesc     = "ACPI Multiprocessor x64-based PC"


REG_EXPAND_SZ                = 0x00020000
REG_DWORD                    = 0x00010001

