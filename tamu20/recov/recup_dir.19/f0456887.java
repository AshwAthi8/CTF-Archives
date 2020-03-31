; Microsoft Windows Bluetooth HID Inf
; Copyright (c) 2002 Microsoft Corporation


[Version]
Signature="$WINDOWS NT$"
Class=HIDClass
ClassGuid={745a17a0-74d3-11d0-b6fe-00a0c90f57da}
Provider=%MSFT%
DriverVer=03/24/2005,5.2.3790.1830

[SourceDisksNames.x86]
1 = %Bth.Diskname%,\win51ip.b2,,\i386

[SourceDisksNames.amd64]
1 = %Bth.Diskname%,\win51ip.b2,,\amd64

[SourceDisksFiles]
hidbth.sys = 1

[ControlFlags]
ExcludeFromSelect = *

[DestinationDirs]
DefaultDestDir = 12
HID_Inst.CopyFilesDLL.NT = 11
SPI_Files_DLL = 11

[Manufacturer]
; HID
;
%MSMfg%=MicrosoftHid,NTamd64

;
;  HID
;
[MicrosoftHid.NTamd64]
%BTHENUM\{00001124-0000-1000-8000-00805f9b34fb}.DeviceDesc%=HIDBTH_Inst,,BTHENUM\{00001124-0000-1000-8000-00805f9b34fb}

[HIDBTH_Inst.NT]
Include=input.inf
Needs=HID_Inst.NT
Copyfiles = HIDBTH_Inst.CopyFiles.NT, HID_Inst.CopyFilesDLL.NT

[HIDBTH_Inst.CopyFiles.NT]
hidbth.sys

[HIDBTH_Inst.NT.Services]
AddService = HidBth,%SPSVCINST_ASSOCSERVICE%,HIDBTH_Service_Inst, HIDBTH_EventLog_Inst

[HIDBTH_Service_Inst]
DisplayName    = %HIDBTH.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_IGNORE%
ServiceBinary  = %12%\hidbth.sys
LoadOrderGroup = extended base

[HIDBTH_EventLog_Inst]
AddReg=HIDBTH_EventLog_Inst.AddReg

[HIDBTH_EventLog_Inst.AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\Drivers\hidbth.sys"
HKR,,TypesSupported,0x00010001,7

[strings]
;
; Non-localizable
;
SPSVCINST_ASSOCSERVICE= 0x00000002
SERVICE_KERNEL_DRIVER = 1
SERVICE_BOOT_START    = 0
SERVICE_SYSTEM_START  = 1
SERVICE_AUTO_START    = 2
SERVICE_DEMAND_START  = 3
SERVICE_ERROR_NORMAL  = 1
SERVICE_ERROR_IGNORE  = 0
;
; Localizable
;
BTH.DiskName          = "Bluetooth"
MSFT                  = "Microsoft"
HIDBTH.SvcDesc        = "Microsoft Bluetooth HID Miniport"
MSMfg           = "Microsoft"
BTHENUM\{00001124-0000-1000-8000-00805f9b34fb}.DeviceDesc= "Bluetooth HID Device"
