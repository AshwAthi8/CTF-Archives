;
; Copyright (c) 2002 Microsoft Corporation
;
; Module Name:
;
;    bthpan.inx
;
; Abstract:
;
;     The INX file for the Bluetooth PAN driver
;

[Version]
LayoutFile       = layout.inf
Provider         = %MfgName%
Signature        = "$Windows NT$"
Class            = Net
ClassGuid        = {4d36e972-e325-11ce-bfc1-08002be10318}
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%MfgName%        = Msft,NTamd64

[Msft.NTamd64]
%BthPan.DisplayName% = BthPan.Install, BTH\MS_BTHPAN

[DestinationDirs]
DefaultDestDir     = %WINDOWS_DIR%
BthPan.CopyFiles   = %DRIVERS_DIR%

[BthPan.Install]
Characteristics  = %NCF_VIRTUAL%
CopyFiles        = BthPan.CopyFiles
AddReg           = BthPan.AddReg

[BthPan.CopyFiles]
bthpan.sys,,,%COPYFLG_WARN_IF_SKIP%

[ControlFlags]
ExcludeFromSelect = *

[BthPan.Install.Services]
AddService = BthPan, %SPSVCINST_ASSOCSERVICE%, BthPan.AddService

[BthPan.AddService]
DisplayName    = %BthPan.DisplayName%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\bthpan.sys
LoadOrderGroup = NDIS
Description    = %BthPan.DisplayName%

[BthPan.AddReg]
; Clsss Information
HKR, Ndi,             HelpText,     0,  %BthPan.HelpText%
HKR, Ndi,             Service,      0,  "BthPan"

; Interfaces
HKR, Ndi\Interfaces,  UpperRange,   0,  "ndis5, ndis5_ip6"
HKR, Ndi\Interfaces,  LowerRange,   0,  "nolower"

; Static configuration parameters
HKR, , ServiceId,   0x00010001,  %Bthpan.DefaultServiceId%
HKR, , ServiceLang, 0x00010001,  %Bthpan.DefaultServiceLang%
HKR, , ServiceName, 0x00000000,  %Bthpan.DefaultServiceName%
HKR, , ServiceDesc, 0x00000000,  %Bthpan.DefaultServiceDesc%

[strings]
; Non-localizable
WINDOWS_DIR            = 10 ; %windir%
DRIVERS_DIR            = 12 ; %windir%\system32\drivers
SYSTEM32_DIR           = 11 ; %windir%\system32
SERVICE_KERNEL_DRIVER  = 1
SERVICE_DEMAND_START   = 3
SERVICE_ERROR_NORMAL   = 1
SPSVCINST_ASSOCSERVICE = 0x00000002
COPYFLG_WARN_IF_SKIP   = 0x00000001
COPYFLG_NOSKIP         = 0x00000002
NCF_VIRTUAL            = 0x1

; Localizable
MfgName                = "Microsoft"
BTH.DiskName	       = "Bluetooth"
BthPan.DisplayName     = "Bluetooth Device (Personal Area Network)"
BthPan.HelpText        = "Bluetooth PAN HelpText"

; Configurable
BthPan.DefaultServiceId   = 0x3
BthPan.DefaultServiceLang = 0x656e
Bthpan.DefaultServiceName = "Personal Ad-hoc User Service"
Bthpan.DefaultServiceDesc = "Personal Ad-hoc User Service"
