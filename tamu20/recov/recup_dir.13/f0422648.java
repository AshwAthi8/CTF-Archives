p/tshoot/tsdrive.htm"
HKR,,Icon,,-9
HKR,,DeviceType,0x10001,4                       ; FILE_DEVICE_CONTROLLER
HKR,,DeviceCharacteristics,0x10001,0x100        ; Use same security checks on relative opens

[fdc_copyfiles]
fdc.sys

[DestinationDirs]
fdc_copyfiles=12

[Manufacturer]
%GenManufacturer%=fdc_device,NTamd64

[fdc_device.NTamd64]
%fdc_devdesc%=fdc_install,*PNP0700

[fdc_install.NT]
CopyFiles=fdc_copyfiles

[fdc_install.NT.Services]
AddService=fdc,2,fdc_ServiceInstallSection

[fdc_ServiceInstallSection]
DisplayName=%fdc_ServiceDesc%
ServiceType=1
StartType=3
ErrorControl=1
ServiceBinary = %12%\fdc.sys
































[Strings]
MSFT="Microsoft"
FdcClassName="Floppy disk controllers"
GenManufacturer="(Standard floppy disk controllers)"
fdc_devdesc="Standard floppy disk controller"
fdc_ServiceDesc="Floppy Disk Controller Driver"
