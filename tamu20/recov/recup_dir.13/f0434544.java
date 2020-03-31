ltDestDir = 12

[Manufacturer]
%PRINT%=PnpPrint,NTamd64

[PnpPrint.NTamd64]
%PRINT.DeviceDesc% = PRINT_Inst,GenPrinter

;=====================================================================
[PRINT_Inst.NT]

Copyfiles = PRINT_Inst.CopyFiles.NT

[PRINT_Inst.CopyFiles.NT]
scsiprnt.sys

[PRINT_Inst.NT.Services]
AddService = scsiprnt,0x00000002,PRINT_Service_Inst

[PRINT_Service_Inst]
DisplayName    = %PRINT.SvcDesc%
ServiceType    = 1 ;KERNEL_DRIVER
StartType      = 3 ;DEMAND START
ErrorControl   = 1 ;RROR_NORMAL
ServiceBinary  = %12%\scsiprnt.sys
































[strings]
PRINT		   = "Printer Vendor"	
PnpPrint           = "Printer Manufacturer"
PRINT.DeviceDesc   = "Generic Printer"
PRINT.SvcDesc      = "Microsoft SCSI/1394 Generic Printer Class"
ppClassName        = "IEEE 1394 and SCSI printers"
MSFT		   = "Microsoft"
