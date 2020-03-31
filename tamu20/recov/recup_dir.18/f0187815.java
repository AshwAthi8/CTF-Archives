; Microsoft Windows Bluetooth HCRP (Print) Driver Inf
; Copyright (c) 2002 Microsoft Corporation

[Version]
Signature="$WINDOWS NT$"
Class=Bluetooth
CLASSGUID={e0cbf06c-cd8b-4647-bb8a-263b43f0f974}
Provider=%MSFT%
DriverVer=03/24/2005,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect = *

[DestinationDirs]
DefaultDestDir = 12


[Manufacturer]
%MSFT%=Microsoft,NTamd64

[Microsoft.NTamd64]
%BTHPRINT.DeviceDesc% = BTHPRINT_Inst,BTHENUM\{00001126-0000-1000-8000-00805f9b34fb}

;=====================================================================
[BTHPRINT_Inst.NT]
; remove copyfiles.dll for now Copyfiles = BTHPRINT_Inst.CopyFiles.NT, BTHPRINT_Inst.CopyFilesDLL.NT

Copyfiles = BTHPRINT_Inst.CopyFiles.NT, BTHPRINT_Inst.CopyFilesDLL.NT
[BTHPRINT_Inst.NT.HW]
AddReg=BTHPRINT.NT.HW.AddReg


[BTHPRINT_Inst.CopyFiles.NT]
BTHPRINT.SYS

[BTHPRINT_INST.CopyFilesDLL.NT]

[BTHPRINT_Inst.NT.Services]
AddService = BTHprint,0x00000002,BTHPRINT_Service_Inst
;=====================================================================

[BTHPRINT.NT.HW.AddReg]
HKR,,"PortDesc",0x00010000,%BTHPRINT.PortDesc%


[BTHPRINT_Service_Inst]
DisplayName    = %BTHPRINT.SvcDesc%
ServiceType    = 1 ;KERNEL_DRIVER
StartType      = 3 ;DEMAND START
ErrorControl   = 1 ;RROR_NORMAL
ServiceBinary  = %12%\bthprint.sys
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

[SourceDisksNames.x86]
1 = %Bth.Diskname%,\win51ip.b2,,\i386

[SourceDisksNames.amd64]
1 = %Bth.Diskname%,\win51ip.b2,,\amd64

[SourceDisksFiles]
bthprint.sys=1




[strings]
BTH.DiskName	      = "Bluetooth"
MSFT                  = "Microsoft"
BTHPRINT.DeviceDesc   = "Bluetooth Printing Support"
BTHPRINT.SvcDesc      = "Microsoft Bluetooth Printer Class"
BTHPRINT.PortDesc     = "Virtual printer port for Bluetooth"
