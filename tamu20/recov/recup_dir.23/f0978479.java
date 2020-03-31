; NETW64.INF 
; Copyright (c) 2004, Microsoft

[Version]
Signature   = "$Windows NT$"
Compatible  = 1
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %MSFT%
LayoutFile  = Layout.inf
DriverVer=10/01/2002,2.63.0.86

[Manufacturer]
%VIA%       = VIA, NTamd64

[ControlFlags]
ExcludeFromSelect = *

[VIA.NTamd64]
%VT3142.DeviceDesc% = VT3142.ndi,   PCI\VEN_1106&DEV_3142
%VT3142.DeviceDesc% = VT3142.ndi,   PCI\VEN_1106&DEV_3142&SUBSYS_66511106
%VT3142.DeviceDesc% = VT3142.ndi,   PCI\VEN_1106&DEV_3142&SUBSYS_66501106

;-------------------------------------------------------------------------------
; ndi for 3142
;-------------------------------------------------------------------------------
[VT3142.ndi.NT]
Characteristics = 0x84 ; NCF_PHYSICAL + NCF_HAS_UI
BusType         = 5
AddReg          = VT3142.reg, WET.reg, WET.reg.NT
CopyFiles       = WET.CopyFiles.NT

[VT3142.ndi.NT.Services]
AddService      = WETNDIS, 2, WET.Service, WET.EventLog

;-------------------------------------------------------------------------------
; VT3142 specific , AdapterCFID = 0x31421106 (HEX) = 826413318 (DEC)
;
[VT3142.reg]
HKR, Ndi,                                   DeviceID,             0, "PCI\VEN_1106&DEV_3142"
HKR, ,                                      AdapterCFID,          0, "826413318"
HKR, ,                                      AdapterType,          0, "5"
HKR, ,                                      MediaType,            0, "1"

HKR, ,                                      ReceiveBurstIndicate, 0,"64"
HKR, ,                                      ReceiveThreshold,     0, "0"
HKR, ,                                      TransmitThreshold,    0, "0"
HKR, ,                                      BurstLength,          0, "2"
HKR, ,                                      MapRegisters,         0, "32"

HKR, ,                                      TransmitBuffers,      0, "32"
HKR, Ndi\params\TransmitBuffers,            ParamDesc,            0, %TXBuffer%
HKR, Ndi\params\TransmitBuffers,            default,              0, "32"
HKR, Ndi\params\TransmitBuffers,            type,                 0, "int"
HKR, Ndi\params\TransmitBuffers,            Min,                  0, "16"
HKR, Ndi\params\TransmitBuffers,            Max,                  0, "64"
HKR, Ndi\params\TransmitBuffers,            Step,                 0, "1"
HKR, Ndi\params\TransmitBuffers,            Base,                 0, "10"
HKR, Ndi\params\TransmitBuffers,            flag,                 1, "20","00","00","00"

HKR, ,                                      ReceiveBuffers,       0, "64"
HKR, Ndi\params\ReceiveBuffers,             ParamDesc,            0, %RXBuffer%
HKR, Ndi\params\ReceiveBuffers,             default,              0, "64"
HKR, Ndi\params\ReceiveBuffers,             type,                 0, "int"
HKR, Ndi\params\ReceiveBuffers,             Min,                  0, "16"
HKR, Ndi\params\ReceiveBuffers,             Max,                  0, "128"
HKR, Ndi\params\ReceiveBuffers,             Step,                 0, "1"
HKR, Ndi\params\ReceiveBuffers,             Base,                 0, "10"
HKR, Ndi\params\ReceiveBuffers,             flag,                 1, "20","00","00","00"
;-------------------------------------------------------------------------------
; WET common driver parameters
;
[WET.reg]
; Connection Rate
HKR, ,                                      ConnectionRate,       0, "4"
HKR, Ndi\params\ConnectionRate,             ParamDesc,            0, %ConnectionRate%
HKR, Ndi\params\ConnectionRate,             default,              0, "4"
HKR, Ndi\params\ConnectionRate,             type,                 0, "enum"
HKR, Ndi\params\ConnectionRate\enum,        0,                    0, %1M%
HKR, Ndi\params\ConnectionRate\enum,        1,                    0, %2M%
HKR, Ndi\params\ConnectionRate\enum,        2,                    0, %5M%
HKR, Ndi\params\ConnectionRate\enum,        3,                    0, %11M%
HKR, Ndi\params\ConnectionRate\enum,        4,                    0, %autoR%
HKR, Ndi\params\ConnectionRate,             flag,                 1, "30","00","00","00"

; User defined Network Address
HKR, Ndi\params\NetworkAddress,             ParamDesc,            0, %NetAddress%
HKR, Ndi\params\NetworkAddress,             Default,              0, ""
HKR, Ndi\params\NetworkAddress,             type,                 0, "edit"
HKR, NDI\params\NetworkAddress,             LimitText,            0, "12"
HKR, NDI\params\NetworkAddress,             UpperCase,            0, "1"
HKR, NDI\params\NetworkAddress,             optional,             0, "1"
HKR, NDI\params\NetworkAddress,             Base,                 0, "16"
HKR, Ndi\params\NetworkAddress,             flag,                 1, "20","00","00","00"

; Preamble Type
HKR, ,                                      PreambleType,         0, "1"
HKR, Ndi\params\PreambleType,               ParamDesc,            0, %PreambleType%
HKR, Ndi\params\PreambleType,               default,              0, "1"
HKR, Ndi\params\PreambleType,               type,                 0, "enum"
HKR, Ndi\params\PreambleType\enum,          0,                    0, %Long%
HKR, Ndi\params\PreambleType\enum,          1,                    0, %Short%

;RTSThreshold
HKR, ,                                      RTSThreshold,         0, "2347"
HKR, Ndi\params\RTSThreshold,               ParamDesc,            0, %RTSThreshold%
HKR, Ndi\params\RTSThreshold,               default,              0, "2347"
HKR, Ndi\params\RTSThreshold,               type,                 0, "int"
HKR, Ndi\params\RTSThreshold,               Min,                  0, "256"
HKR, Ndi\params\RTSThreshold,               Max,                  0, "2347"
HKR, Ndi\params\RTSThreshold,               Step,                 0, "1"
HKR, Ndi\params\RTSThreshold,               Base,                 0, "10"
HKR, Ndi\params\RTSThreshold,               flag,                 1, "30","00","00","00"

;FragThreshold
HKR, ,                                      FragThreshold,        0, "2346"
HKR, Ndi\params\FragThreshold,              ParamDesc,            0, %FragThreshold%
HKR, Ndi\params\FragThreshold,              default,              0, "2346"
HKR, Ndi\params\FragThreshold,              type,                 0, "int"
HKR, Ndi\params\FragThreshold,              Min,                  0, "256"
HKR, Ndi\params\FragThreshold,              Max,                  0, "2346"
HKR, Ndi\params\FragThreshold,              Step,                 0, "1"
HKR, Ndi\params\FragThreshold,              Base,                 0, "10"
HKR, Ndi\params\FragThreshold,              flag,                 1, "30","00","00","00"

;BeaconInterval
HKR, ,                                      BeaconInterval,       0, "100"
HKR, Ndi\params\BeaconInterval,             ParamDesc,            0, %BeaconInterval%
HKR, Ndi\params\BeaconInterval,             default,              0, "100"
HKR, Ndi\params\BeaconInterval,             type,                 0, "int"
HKR, Ndi\params\BeaconInterval,             Min,                  0, "1"
HKR, Ndi\params\BeaconInterval,             Max,                  0, "1000"
HKR, Ndi\params\BeaconInterval,             Step,                 0, "1"
HKR, Ndi\params\BeaconInterval,             Base,                 0, "10"
HKR, Ndi\params\BeaconInterval,             flag,                 1, "30","00","00","00"

[WET.reg.NT]
HKR, Ndi\Interfaces,                        LowerRange,           0, "ethernet"
HKR, Ndi\Interfaces,                        UpperRange,           0, "ndis5"
HKR, Ndi,                                   Service,              0, "WETNDIS"
; ScatterGather DMA Capability
HKR, ,                                      ScatterGather,        0, "1"

;-------------------------------------------------------------------------------
; Installation for NT
;

[WET.CopyFiles.NT]
WETN5B64.sys,,,2

[WET.Service]
DisplayName     = %WET.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\WETN5B64.sys
LoadOrderGroup  = NDIS

[WET.EventLog]
AddReg = WET.AddEventLog.reg

[WET.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x00010001, 7

;-------------------------------------------------------------------------------
; DestinationDirs
;
[DestinationDirs]
DefaultDestDir          = 11
WET.CopyFiles.NT        = 12


;-------------------------------------------------------------------------------
; Localizable Strings
;
[Strings]
MSFT                 = "Microsoft Corporation"
VIA                  = "VIA Networking Technologies, Inc."
ConnectionRate       = "Connection Rate"
autoR                = "Auto-Rate"
11M                  = "11Mbps"
5M                   = "5.5Mbps"
2M                   = "2Mbps"
1M                   = "1Mbps"
PreambleType         = "Preamble Type"
Long                 = "Long"
Short                = "Short"
Disabled             = "Disabled"
Enabled              = "Enabled"
TXBuffer             = "Transmit Buffers"
RXBuffer             = "Receive Buffers"
NetAddress           = "Network Address"
FragThreshold        = "Fragment Threshold"
RTSThreshold         = "RTS Threshold"
BeaconInterval       = "Adhoc Beacon Interval"
HwDefault            = "Hardware Default"
VT3142.DeviceDesc    = "VIA Networking Solomon-B Wireless LAN Adapter"
WET.Service.DispName = "VIA Networking Solomon-B Wireless LAN Adapter Server2003 AMD64 Driver"
