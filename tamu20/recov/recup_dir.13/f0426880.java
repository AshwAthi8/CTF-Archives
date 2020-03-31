ageProvider"
HKR,,SilentInstall,,1
HKR,,NoInstallClass,,1
HKR,,TroubleShooter-0,,"hcp://help/tshoot/tsdrive.htm"
HKR,,Icon,,102
HKR,,DeviceType,0x10001,7                       ; FILE_DEVICE_DISK
HKR,,DeviceCharacteristics,0x10001,0x100        ; Use same security checks on relative opens

[floppy_copyfiles]
flpydisk.sys

[DestinationDirs]
floppy_copyfiles=12
sfloppy_copyfiles=12

[Manufacturer]
%GenManufacturer%=floppy_device,NTamd64

[floppy_device.NTamd64]
%floppy_devdesc%=floppy_install,*PNP0701
%floppy_devdesc%=floppy_install,*PNP0702
%floppy_devdesc%=floppy_install,*PNP0703
%floppy_devdesc%=floppy_install,*PNP0704
%floppy_devdesc%=floppy_install,GenFloppyDisk
%sfloppy_devdesc%=sfloppy_install,GenSFloppy
%usbfloppy_devdesc%=sfloppy_install,USBSTOR\GenSFloppy
%sfloppy_devdesc%=sfloppy_install,SCSI\DiskMATSHITALS-120_COSM___04
%sfloppy_devdesc%=sfloppy_install,SCSI\DiskCOMPAQ__LS-120_VER5___AB
%sfloppy_devdesc%=sfloppy_install,SCSI\DiskCOMPAQ__LS-120_HIMA___01
%sfloppy_devdesc%=sfloppy_install,SCSI\DiskMATSHITALS-120_VER5___00
%sfloppy_devdesc%=sfloppy_install,SCSI\DiskMATSHITALS-120/240____00

[floppy_install.NT]
CopyFiles=floppy_copyfiles
ExcludeId=GenSFloppy,SCSI\DiskMATSHITALS-120_COSM___04,SCSI\DiskCOMPAQ__LS-120_VER5___AB
ExcludeId=SCSI\DiskCOMPAQ__LS-120_HIMA___01,SCSI\DiskMATSHITALS-120_VER5___00
ExcludeId=SCSI\DiskMATSHITALS-120/240____00

[floppy_install.NT.Services]
AddService=flpydisk,2,floppy_ServiceInstallSection

[floppy_ServiceInstallSection]
DisplayName=%floppy_ServiceDesc%
ServiceType=1
StartType=3
ErrorControl=1
ServiceBinary = %12%\flpydisk.sys


;;
;; super floppy
;;
[sfloppy_install.NT]
CopyFiles=sfloppy_copyfiles
ExcludeId=GenFloppyDisk,*PNP0701,*PNP0702,*PNP0703,*PNP0704

[sfloppy_copyfiles]
sfloppy.sys

[sfloppy_install.NT.Services]
AddService=sfloppy,2,sfloppy_ServiceInstallSection

[sfloppy_ServiceInstallSection]
DisplayName=%sfloppy_devdesc%
ServiceType=1
StartType=3
ErrorControl=1
ServiceBinary = %12%\sfloppy.sys
AddReg=sfloppy_autorun

[sfloppy_install.NT.HW]
AddReg=sfloppyEnable.RegHW

[sfloppyEnable.RegHW]
HKR,,SuperFloppy,%REG_DWORD%,0x00000001

[sfloppy_autorun]
;;
;; "AutoRun" is disabled by default for Super Floppy Drives.
;; To enable "AutoRun" set the registry entry to 1.
;;
HKR,,"AutoRun",%REG_DWORD%,0

































[Strings]
MSFT="Microsoft"
floppyClassName="Floppy disk drives"
GenManufacturer="(Standard floppy disk drives)"
floppy_devdesc="Floppy disk drive"
floppy_ServiceDesc="Floppy Disk Driver"
sfloppy_devdesc="High-Capacity Floppy Disk Drive"
usbfloppy_devdesc="USB FloppyDisk Drive"
REG_DWORD=0x00010001

