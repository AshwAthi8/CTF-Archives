=========================================

[Manufacturer]
%MSFT%=D4P_Models,NTamd64

[D4P_Models.NTamd64]
;
; This INF supports models with these PnP IDs
; (Enumerated by any enumerator (*))
;
%D4Print%=Dot4Print_Inst,DOT4\PRINT


[Dot4Print_Inst.NT]
;
; Copy files for the W2K installation
;
CopyFiles=Dot4Print_CopyFiles


[Dot4Print_CopyFiles]
;
; For all this, just one file...
;
Dot4Prt.sys


[Dot4Print_Inst.NT.HW]
;
; Special configuration info
;
AddReg=Dot4Print_AddReg

[Dot4Print_AddReg]
;
; Add keys under Enum\enumeratorID\device-instance-id
;
;HKR,,"ReadService",,%ReadServiceName%
;HKR,,"WriteService",,%WriteServiceName%
HKR,,"ReadSocketId",0x00010001,0x0002
HKR,,"WriteSocketId",0x00010001,0x0002
HKR,,"ReadBufferSize",0x00010001,0x7FFF
HKR,,"WriteBufferSize",0x00010001,0x7FFF


[Dot4Print_Inst.NT.Services]
;
; Add the Dot4 driver as a service
;
AddService=Dot4Print,0x00000002,Dot4PrintService


[Dot4PrintService]
;
; Service configuration info
;
DisplayName     = %Dot4Print_Name%
ServiceType     = 1             ; Kernel driver
StartType       = 3             ; Manual start
ErrorControl    = 1             ; Error ignore
ServiceBinary   = %12%\Dot4Prt.sys

;====================================================

[ControlFlags]
ExcludeFromSelect = *

;====================================================

[DestinationDirs]
DefaultDestDir = 10,System32\drivers


































[Strings]
Dot4Print_Name="Print Class Driver for IEEE-1284.4"
MSFT="Microsoft"
Floppy_Description = "Disk"
Desc_Val="Description"
ClassName="IEEE 1284.4 compatible printers"
D4Print="IEEE 1284.4 compatible printer"



