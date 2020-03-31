; Copyright (c) 2004, Microsoft

[version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %MSFT%
LayoutFile  = layout.inf
DriverVer=10/01/2002,5.1.2600.155

[Manufacturer]
%ULIR% = ULICOM, NTamd64

[ControlFlags]
ExcludeFromSelect = *

[ULICOM.NTamd64]
%ULI5261.DeviceDesc%   = ULI5261.ndi,    PCI\VEN_10B9&DEV_5261
%ULI5261.DeviceDesc%   = ULI5261.ndi,    PCI\VEN_10B9&DEV_5261&SUBSYS_526110B9

[ULI5261.ndi.NT]
Characteristics = 0x84
BusType         = 5
AddReg          = ULI9PCI.reg, ULI5261.con.reg, 5261.pci.reg
CopyFIles       = ULI9PCI.CopyFiles

[ULI5261.ndi.NT.Services]
AddService = ULi5261, 2, ULI5261.Service, common.EventLog

[ULI5261.con.reg]
;Common
;ConnectionType
HKR, Ndi\params\ConnectionType,      ParamDesc,        0,"Connection Type"
HKR, Ndi\params\ConnectionType,      default,          0,"0"
HKR, Ndi\params\ConnectionType,      type,             0,"enum"
HKR, Ndi\params\ConnectionType\enum, 0,                0,"AutoSense"
HKR, Ndi\params\ConnectionType\enum, 2,                0,"100Mbps"
HKR, Ndi\params\ConnectionType\enum, 4,                0,"100Mbps Full_Duplex"
HKR, Ndi\params\ConnectionType\enum, 1,                0,"10Mbps"
HKR, Ndi\params\ConnectionType\enum, 3,                0,"10Mbps Full_Duplex"

;ACPI Enable/Disable
HKR,Ndi\params\ACPIEnable,           ParamDesc,         ,"PME"
HKR,Ndi\params\ACPIEnable,           default,           ,"0"
HKR,Ndi\params\ACPIEnable,           type,              ,"enum"
HKR,Ndi\params\ACPIEnable\enum,      0,                 ,"Disabled"
HKR,Ndi\params\ACPIEnable\enum,      1,                 ,"Link Change" 
HKR,Ndi\params\ACPIEnable\enum,      2,                 ,"Magic Packet"
HKR,Ndi\params\ACPIEnable\enum,      3,                 ,"Pattern Match"
HKR,Ndi\params\ACPIEnable\enum,      4,                 ,"ALL"


[5261.pci.reg]
HKR, ,                               AdapterType        , 0, "5"
HKR, ,                               BusType            , 0, "5"
HKR, ,                               StoreAndForward    , 0, "1"
HKR, ,                               TransmitThreshold  , 0, "200"
HKR, ,                               ACPIEnable         , 0, "4"

[ULI9PCI.reg]
HKR, Ndi,                            Service,          0, "ULi5261"
HKR, Ndi\Interfaces,                 UpperRange,       0, "ndis5"
HKR, Ndi\Interfaces,                 LowerRange,       0, "ethernet"
HKR, ,                               AdapterPCIID,     0, "526110B9"
HKR, Ndi,                            DeviceID,         0, "PCI\VEN_10B9&DEV_5261"

[ULI5261.Service]
DisplayName     = %ULI9PCI.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\ULi5261.SYS
LoadOrderGroup  = NDIS

[common.EventLog]
AddReg = common.AddEventLog.reg

[common.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x00010001, 7

[ULI9PCI.CopyFiles]
ULi5261.SYS,,,2

[DestinationDirs]
DefaultDestDir        =         12
ULI9PCI.CopyFiles     =         12

[Strings]
MSFT                     = "Microsoft Corporation"
ULIR                     = "ULi Electronics Inc."
ULI5261.DeviceDesc	 = "ULi PCI Fast Ethernet Controller"
ULI9PCI.Service.DispName = "ULi Based Ethernet NT Driver"

