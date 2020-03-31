D_DRIVERS

[Manufacturer]
%MSFT%=MSFT,NTamd64

[MSFT.NTamd64]
%STORAGE\Volume.DeviceDesc%=volume_install,STORAGE\Volume

[volume_copyfiles]
volsnap.sys

[volume_install.NTamd64]
CopyFiles=volume_copyfiles

[volume_install.NTamd64.Services]
AddService=volsnap,2,volume_ServiceInstallSection

[volume_ServiceInstallSection]
DisplayName=%VolumeClassName%
ServiceType=1
StartType=0
ErrorControl=1
ServiceBinary = %12%\volsnap.sys

[volume_install.NTamd64.Interfaces]
AddInterface={53F5630D-B6BF-11D0-94F2-00A0C91EFB8B}
































[Strings]
MSFT="Microsoft"
VolumeClassName="Storage volumes"
STORAGE\Volume.DeviceDesc="Generic volume"

