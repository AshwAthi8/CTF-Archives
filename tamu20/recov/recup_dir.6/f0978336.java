; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
Signature   = "$WINDOWS NT$"
Class       = Net
ClassGUID   = {4D36E972-E325-11CE-BFC1-08002BE10318}
Provider    = %MSFT%
LayoutFile  = layout.inf
DriverVer=10/01/2002,4.14.1.452


[Manufacturer]
%Nvidia%    = Nvidia, NTamd64

[ControlFlags]
ExcludeFromSelect = *

[Nvidia.NTamd64]
%NVENET.DeviceDesc%  =  NVENET1.NDI,   PCI\VEN_10DE&DEV_01C3
%NVENET.DeviceDesc%  =  NVENET2.NDI,   PCI\VEN_10DE&DEV_0066
%NVENET.DeviceDesc%  =  NVENET3.NDI,   PCI\VEN_10DE&DEV_00D6
%NVENET.DeviceDesc%  =  NVENET4.NDI,   PCI\VEN_10DE&DEV_00E6
%NVENET.DeviceDesc%  =  NVENET5.NDI,   PCI\VEN_10DE&DEV_0086

[NVENET1.NDI.NT]
Characteristics = 0x84                  ; NCF_PHYSICAL | NCF_HAS_UI
BusType         = 5                     ; PciBus
AddReg          = NVENET.reg, NVENET1.reg, SpeedSetting.reg
CopyFiles       = NVENET.CopyFiles

[NVENET1.ndi.NT.Services]
AddService = NVENET, 2, NVENET.Service, common.EventLog

[NVENET2.NDI.NT]
Characteristics = 0x84                  ; NCF_PHYSICAL | NCF_HAS_UI
BusType         = 5                     ; PciBus
AddReg          = NVENET.reg, NVENET2.reg, SpeedSetting.reg
CopyFiles       = NVENET.CopyFiles

[NVENET2.ndi.NT.Services]
AddService = NVENET, 2, NVENET.Service, common.EventLog

[NVENET3.NDI.NT]
Characteristics = 0x84                  ; NCF_PHYSICAL | NCF_HAS_UI
BusType         = 5                     ; PciBus
AddReg          = NVENET.reg, NVENET3.reg, SpeedSetting.reg
CopyFiles       = NVENET.CopyFiles

[NVENET3.ndi.NT.Services]
AddService = NVENET, 2, NVENET.Service, common.EventLog

[NVENET4.NDI.NT]
Characteristics = 0x84                  ; NCF_PHYSICAL | NCF_HAS_UI
BusType         = 5                     ; PciBus
AddReg          = NVENET.reg, NVENET4.reg, SpeedSetting.reg, ChecksumOffload.reg, SegOffload.reg, LowPowerStateLinkSpeed.reg
CopyFiles       = NVENET.CopyFiles

[NVENET4.ndi.NT.Services]
AddService = NVENET, 2, NVENET.Service, common.EventLog

[NVENET5.NDI.NT]
Characteristics = 0x84                  ; NCF_PHYSICAL | NCF_HAS_UI
BusType         = 5                     ; PciBus
AddReg          = NVENET.reg, NVENET5.reg, SpeedSetting.reg, ChecksumOffload.reg, SegOffload.reg, LowPowerStateLinkSpeed.reg
CopyFiles       = NVENET.CopyFiles

[NVENET5.ndi.NT.Services]
AddService = NVENET, 2, NVENET.Service, common.EventLog

[NVENET1.reg]
HKR,               , 		AdapterCFID,    0, "01C310DE"

[NVENET2.reg]
HKR,               ,            AdapterCFID,    0, "006610DE"

[NVENET3.reg]
HKR,               ,            AdapterCFID,    0, "00D610DE"

[NVENET4.reg]
HKR,               ,            AdapterCFID,    0, "00E610DE"

[NVENET5.reg]
HKR,               ,            AdapterCFID,    0, "008610DE"

[SpeedSetting.reg]
;
; Wake on Lan from Power Off
;
HKR, Ndi\params\OemSetting1,                 ParamDesc,  0, %WakeOnLANFromPowerOff%
HKR, Ndi\params\OemSetting1,                 default,    0, "1"
HKR, Ndi\params\OemSetting1,                 type,      0, "enum"
HKR, Ndi\params\OemSetting1\enum,            "0",       0, %Disable%
HKR, Ndi\params\OemSetting1\enum,            "1",       0, %Enable%

HKR, Ndi\params\ForceSpeedDpx,               ParamDesc,   0, %SpeedDuplexSettings%
HKR, Ndi\params\ForceSpeedDpx,               default,     0, "0"
HKR, Ndi\params\ForceSpeedDpx,               type,        0, "enum"
HKR, Ndi\params\ForceSpeedDpx\enum,          "0",         0, %Automatic%
HKR, Ndi\params\ForceSpeedDpx\enum,          "1",         0, %HD10MB%
HKR, Ndi\params\ForceSpeedDpx\enum,          "2",         0, %FD10MB%
HKR, Ndi\params\ForceSpeedDpx\enum,          "3",         0, %HD100MB%
HKR, Ndi\params\ForceSpeedDpx\enum,          "4",         0, %FD100MB%
HKR, Ndi\params\ForceSpeedDpx\enum,          "5",         0, %HD10MBA%
HKR, Ndi\params\ForceSpeedDpx\enum,          "6",         0, %FD10MBA%
HKR, Ndi\params\ForceSpeedDpx\enum,          "7",         0, %HD100MBA%
HKR, Ndi\params\ForceSpeedDpx\enum,          "8",         0, %FD100MBA%

HKR, Ndi\params\NetworkAddress,               ParamDesc,  0, %NetworkAddress%
HKR, Ndi\params\NetworkAddress,               default,    0, " "
HKR, Ndi\params\NetworkAddress,               type,       0, "edit"
HKR, Ndi\params\NetworkAddress,               LimitText,  0, "12"
HKR, Ndi\params\NetworkAddress,               UpperCase,  0, "1"
HKR, Ndi\params\NetworkAddress,               optional,   0, "1"

HKR, Ndi\params\PollIntervalInus,             ParamDesc,  0, %OptimizeFor%
HKR, Ndi\params\PollIntervalInus,             default,    0, "425"
HKR, Ndi\params\PollIntervalInus,             type,       0, "enum"
HKR, Ndi\params\PollIntervalInus\enum,        0,          0, %Throughput%
HKR, Ndi\params\PollIntervalInus\enum,        425,        0, %CPU%

[ChecksumOffload.reg]
HKR, ,ChecksumOffloadBM,		      0,          %ChecksumOffloadBM%
HKR, Ndi\params\ChecksumOffload,              ParamDesc,  0, %ChecksumOffload% 
HKR, Ndi\params\ChecksumOffload,              default,    0, "1"
HKR, Ndi\params\ChecksumOffload,              type,       0, "enum"
HKR, Ndi\params\ChecksumOffload\enum,         "0",        0, %Disable%
HKR, Ndi\params\ChecksumOffload\enum,         "1",        0, %Enable%

[SegOffload.reg]
HKR, Ndi\params\SegOffload,                   ParamDesc,  0, %SegOffload% 
HKR, Ndi\params\SegOffload,                   default,    0, "1"
HKR, Ndi\params\SegOffload,                   type,       0, "enum"
HKR, Ndi\params\SegOffload\enum,              "0",        0, %Disable%
HKR, Ndi\params\SegOffload\enum,              "1",        0, %Enable%

[LowPowerStateLinkSpeed.reg]
HKR, Ndi\params\LowPowerStateLinkSpeed,       ParamDesc,  0, %LowPowerStateLinkSpeed% 
HKR, Ndi\params\LowPowerStateLinkSpeed,       default,    0, "1"
HKR, Ndi\params\LowPowerStateLinkSpeed,       type,       0, "enum"
HKR, Ndi\params\LowPowerStateLinkSpeed\enum,  "0",        0, %Disable%
HKR, Ndi\params\LowPowerStateLinkSpeed\enum,  "1",        0, %Enable%

[NVENET.reg]
HKR, Ndi,                       Service,        0, "NVENET"
HKR, Ndi\Interfaces,            LowerRange,     0, "ethernet"
HKR, Ndi\Interfaces,            UpperRange,     0, "ndis5"
HKR, NDIS,          LogDriverName,              0, "NVENET"
HKR, NDIS,          MajorNdisVersion,           1, 05
HKR, NDIS,          MinorNdisVersion,           1, 01

[NVENET.Service]
DisplayName     = %NVENET.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\NVENET.sys
LoadOrderGroup  = NDIS

[common.EventLog]
AddReg = common.AddEventLog.reg

[common.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x00010001, 7

[NVENET.CopyFiles]
NVENET.sys,,,2

[DestinationDirs]
NVENET.CopyFiles    = 12
DefaultDestDir      = 12

[Strings]
MSFT                            = "Microsoft"
Nvidia                   	= "Nvidia"

Enable                          = "Enable"
Disable                         = "Disable"
WakeOnLANFromPowerOff           = "WakeOnLAN From PowerOff"
Throughput                      = "Throughput"
CPU                             = "CPU"
NetworkAddress           	= "Network Address"
OptimizeFor			= "Optimize For"
SpeedDuplexSettings             = "Speed/duplex settings"
Automatic                	= "Full autonegotiation"
HD10MB				= "Force 10 Half Duplex"
FD10MB				= "Force 10 Full Duplex"
HD100MB				= "Force 100 Half Duplex"
FD100MB				= "Force 100 Full Duplex"
HD10MBA				= "Autonegotiate for 10HD"
FD10MBA				= "Autonegotiate for 10FD"
HD100MBA			= "Autonegotiate for 100HD"
FD100MBA			= "Autonegotiate for 100FD"
ChecksumOffload                 = "Checksum Offload"
ChecksumOffloadBM               = "7967"
SegOffload			= "Segmentation Offload"
MediaIF				= "Media Interface"
LowPowerStateLinkSpeed          = "Low Power State Link Speed"

NVENET.DeviceDesc        	= "NVIDIA nForce Networking Controller"
NVENET.Service.DispName  	= "NVIDIA nForce Networking Legacy Driver"
