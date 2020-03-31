tupPnPFlags = 1

[GenericSerial.NT.HW]
AddReg=GenericSerial.NT.HW.AddReg

[GenericSerial.NT.Copy]
serenum.sys

[GenericSerial.NT.AddReg]
HKR,,PortSubClass,1,01
HKR,,EnumPropPages32,,"MsPorts.dll,SerialPortPropPageProvider"
; Uncomment the following line if you want to override the advanced dialog for
; your device.  See msports.h for protoype of OverrideAdvancedFunction
; HKR,,EnumAdvancedDialog,,"yourdll.dll,OverrideAdvancedFunction"

;[GenericSerial.NT.HW.AddReg]
;HKR,,"UpperFilters",0x00010000,"serenum"

[GenericSerial.NT.Services]
AddService= BTHMODEM, 2, BTHMODEM.AddService
;AddService = Serenum,,Serenum_Service_Inst


[BTHMODEM.Copy]
bthmodem.sys

[BTHMODEM.AddService]
DisplayName     = %BthSerial.DisplayName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\bthmodem.sys

;[GenericSerial.NT.HW]
;AddReg=LowerFilterAddReg

;[LowerFilterAddReg]
;HKR,,"LowerFilters",0x00010000,bthmodem

[DestinationDirs]
BTHMODEM.Copy = 12
;GenericSerial.NT.Copy = 12

[SourceDisksNames.x86]
1 = %Bth.Diskname%,\win51ip.b2,,\i386

[SourceDisksNames.amd64]
1 = %Bth.Diskname%,\win51ip.b2,,\amd64

[SourceDisksFiles]
bthmodem.sys=1
;serenum.sys=1

[Strings]
Bth.Diskname         = "Bluetooth"
MSFT                 = "Microsoft"
BthSerial.DisplayName = "Bluetooth Serial Communications Driver"
Standard_serial       = "Standard Serial over Bluetooth link"
