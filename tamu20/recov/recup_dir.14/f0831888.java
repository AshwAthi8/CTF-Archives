===============
[USBPRINT_Inst.NT]
; remove copyfiles.dll for now Copyfiles = USBPRINT_Inst.CopyFiles.NT, USBPRINT_Inst.CopyFilesDLL.NT

Copyfiles = USBPRINT_Inst.CopyFiles.NT, USBPRINT_Inst.CopyFilesDLL.NT

[USBPRINT_Inst.CopyFiles.NT]
usbprint.sys

[USBPRINT_INST.CopyFilesDLL.NT]

[USBPRINT_Inst.NT.Services]
AddService = usbprint,0x00000002,USBPRINT_Service_Inst
;=====================================================================

[USBPRINT_Service_Inst]
DisplayName    = %USBPRINT.SvcDesc%
ServiceType    = 1 ;KERNEL_DRIVER
StartType      = 3 ;DEMAND START
ErrorControl   = 1 ;RROR_NORMAL
ServiceBinary  = %12%\usbprint.sys
LoadOrderGroup = extended base



;SPSVCINST_TAGTOFRONT  = 0x00000001
;SPSVCINST_ASSOCSERVICE= 0x00000002
;SERVICE_KERNEL_DRIVER = 1
;SERVICE_BOOT_START    = 0
;SERVICE_SYSTEM_START  = 1
;SERVICE_AUTO_START    = 2
;SERVICE_DEMAND_START  = 3
;SERVICE_ERROR_NORMAL  = 1
;SERVICE_ERROR_IGNORE  = 0
































[strings]
MSFT                  = "Microsoft"
USBPRINT.DeviceDesc   = "USB Printing Support"
USBPRINT.SvcDesc      = "Microsoft USB PRINTER Class"
