; NETGEA64.INF 
; Copyright (c) 2003, Microsoft

[Version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %MSFT%
LayoutFile  = Layout.inf
DriverVer=10/01/2002,1.31.0.89

[Manufacturer]
%VNT%       = VNT, NTamd64

[ControlFlags]
ExcludeFromSelect = *

[VNT.NTamd64]
%VT3119.DeviceDesc%   = VT3119.ndi, PCI\VEN_1106&DEV_3119&SUBSYS_01101106
%VT3119.DeviceDesc%   = VT3119.ndi, PCI\VEN_1106&DEV_3119

;-------------------------------------------------------------------------------
; ndi for 3119
;-------------------------------------------------------------------------------
[VT3119.ndi.NTAMD64]
Characteristics = 0x84 ; NCF_PHYSICAL + NCF_HAS_UI
BusType         = 5
DelReg          = GET.delreg
AddReg          = VT3119.reg, GET.reg, FlowCtrl.reg, GET.reg.NT, Tagging.reg, VLAN.reg, RxCksmOfld.reg.NT, TxTaskOfld.reg.NT, Jumbo.reg
CopyFiles       = GET.CopyFiles.NTAMD64

[VT3119.ndi.NTAMD64.Services]
AddService      = GETNDIS, 2, GET_NTAMD64.Service, GET.EventLog

;-------------------------------------------------------------------------------
; VT3119 specific , AdapterCFID = 0x31191106 (HEX) = 823726342 (DEC)
;
[VT3119.reg]
HKR, Ndi,                                   DeviceID,             0, "PCI\VEN_1106&DEV_3119"
HKR, ,                                      AdapterCFID,          0, "823726342"
HKR, ,                                      AdapterType,          0, "5"
HKR, ,                                      MediaType,            0, "1"

HKR, ,                                      ReceiveBurstIndicate, 0, "64"
HKR, ,                                      ReceiveThreshold,     0, "0"
HKR, ,                                      BurstLength,          0, "7"
HKR, ,                                      MapRegisters,         0, "128"
HKR, ,                                      TxSupThr,             0, "31"
HKR, ,                                      RxSupThr,             0, "31"
HKR, ,                                      TCPLSSeg,             0, "8"
HKR, ,                                      SyncTIC,              0, "1"
HKR, ,                                      MRDPL,                0, "0"

HKR, ,                                      TqeTmr,               0, "89"
HKR, ,                                      RqeTmr,               0, "20"
HKR, ,                                      TxCntWak,             0, "8"

HKR, ,                                      TransmitBuffers,      0, "256"
HKR, Ndi\params\TransmitBuffers,            ParamDesc,            0, %TXBuffer%
HKR, Ndi\params\TransmitBuffers,            default,              0, "256"
HKR, Ndi\params\TransmitBuffers,            type,                 0, "int"
HKR, Ndi\params\TransmitBuffers,            Min,                  0, "64"
HKR, Ndi\params\TransmitBuffers,            Max,                  0, "384"
HKR, Ndi\params\TransmitBuffers,            Step,                 0, "1"
HKR, Ndi\params\TransmitBuffers,            Base,                 0, "10"

HKR, ,                                      ReceiveBuffers,       0, "128"
HKR, Ndi\params\ReceiveBuffers,             ParamDesc,            0, %RXBuffer%
HKR, Ndi\params\ReceiveBuffers,             default,              0, "128"
HKR, Ndi\params\ReceiveBuffers,             type,                 0, "int"
HKR, Ndi\params\ReceiveBuffers,             Min,                  0, "64"
HKR, Ndi\params\ReceiveBuffers,             Max,                  0, "256"
HKR, Ndi\params\ReceiveBuffers,             Step,                 0, "4"
HKR, Ndi\params\ReceiveBuffers,             Base,                 0, "10"

; Nway Forced Mode
HKR, ,                                      NwayForce,            0, "1"

; Power Management Capability
HKR, ,                                      PMC,                  0, "0"

;-------------------------------------------------------------------------------
; GET common driver parameters
;
[GET.reg]

; Connection Type
HKR, ,                                      ConnectionType,       0, "0"
HKR, Ndi\params\ConnectionType,             ParamDesc,            0, %ConnectionType%
HKR, Ndi\params\ConnectionType,             default,              0, "0"
HKR, Ndi\params\ConnectionType,             type,                 0, "enum"
HKR, Ndi\params\ConnectionType\enum,        0,                    0, %autoN%
HKR, Ndi\params\ConnectionType\enum,        1,                    0, %100HD%
HKR, Ndi\params\ConnectionType\enum,        2,                    0, %100FD%
HKR, Ndi\params\ConnectionType\enum,        3,                    0, %10HD%
HKR, Ndi\params\ConnectionType\enum,        4,                    0, %10FD%

; User defined Network Address
HKR, ,                                      NetworkAddress,       0, ""
HKR, Ndi\params\NetworkAddress,             ParamDesc,            0, %NetAddress%
HKR, Ndi\params\NetworkAddress,             Default,              0, ""
HKR, Ndi\params\NetworkAddress,             type,                 0, "edit"
HKR, NDI\params\NetworkAddress,             LimitText,            0, "12"
HKR, NDI\params\NetworkAddress,             UpperCase,            0, "1"
HKR, NDI\params\NetworkAddress,             optional,             0, "1"
HKR, NDI\params\NetworkAddress,             Base,                 0, "16"

; Validate Rx SNAP/802.3 packet length
HKR, ,                                      ValidatePacketLen,    0, "0"

[FlowCtrl.reg]
; Flow control capability advertisement
HKR, ,                                      FlowCtrl,             0, "0"
HKR, Ndi\params\FlowCtrl,                   ParamDesc,            0, %FlowCtl%
HKR, Ndi\params\FlowCtrl,                   default,              0, "0"
HKR, Ndi\params\FlowCtrl,                   type,                 0, "enum"
HKR, Ndi\params\FlowCtrl\enum,              0,                    0, %HwDefault%
HKR, Ndi\params\FlowCtrl\enum,              1,                    0, %EnableTx%
HKR, Ndi\params\FlowCtrl\enum,              2,                    0, %EnableRx%
HKR, Ndi\params\FlowCtrl\enum,              3,                    0, %EnableTxRx%
HKR, Ndi\params\FlowCtrl\enum,              4,                    0, %Disabled%

[Tagging.reg]
; number of Tx queue allocation
HKR, ,                                      TxQueueNum,           0, "4"
; 802.1p/802.1q Packet Tagging
HKR, ,                                      8021pqtag,            0, "0"
HKR,Ndi\Params\8021pqtag,                   ParamDesc,            0, %8021pq%
HKR,Ndi\Params\8021pqtag,                   Default,              0, "0"
HKR,Ndi\Params\8021pqtag,                   type,                 0, "enum"
HKR,Ndi\Params\8021pqtag\enum,              "0",                  0, %Disabled%
HKR,Ndi\Params\8021pqtag\enum,              "1",                  0, %Enabled%

[VLAN.reg]
; static single VLAN ID setting
HKR, ,                                      VLANID,               0, "0"
HKR, Ndi\params\VLANID,                     ParamDesc,            0, %VLANID%
HKR, Ndi\params\VLANID,                     default,              0, "0"
HKR, Ndi\params\VLANID,                     type,                 0, "int"
HKR, Ndi\params\VLANID,                     Min,                  0, "0"
HKR, Ndi\params\VLANID,                     Max,                  0, "4094"
HKR, Ndi\params\VLANID,                     Step,                 0, "1"
HKR, Ndi\params\VLANID,                     Base,                 0, "10"

[GET.reg.NT]
; Windows 2000/XP
HKR, Ndi\Interfaces,                        LowerRange,           0, "ethernet"
HKR, Ndi\Interfaces,                        UpperRange,           0, "ndis5"
HKR, Ndi,                                   Service,              0, "GETNDIS"

; Adaptive Interrupt Capability -> Optimized for performance by Interrupt
HKR, ,                                      AI,                   0, "1"
HKR, Ndi\params\AI,                         ParamDesc,            0, %AI%
HKR, Ndi\params\AI,                         default,              0, "1"
HKR, Ndi\params\AI,                         type,                 0, "enum"
HKR, Ndi\params\AI\enum,                    0,                    0, %Disabled%
HKR, Ndi\params\AI\enum,                    1,                    0, %Enabled%

[RxCksmOfld.reg.NT]
HKR, ,                                      RxCksmOfld,           0, "1"
HKR, Ndi\params\RxCksmOfld,                 ParamDesc,            0, %RxCksmOfld%
HKR, Ndi\params\RxCksmOfld,                 default,              0, "1"
HKR, Ndi\params\RxCksmOfld,                 type,                 0, "enum"
HKR, Ndi\params\RxCksmOfld\enum,            0,                    0, %Disabled%
HKR, Ndi\params\RxCksmOfld\enum,            1,                    0, %Enabled%

[TxTaskOfld.reg.NT]
HKR, ,                                      TxTaskOfld,           0, "2"
HKR, Ndi\params\TxTaskOfld,                 ParamDesc,            0, %TxTaskOfld%
HKR, Ndi\params\TxTaskOfld,                 default,              0, "2"
HKR, Ndi\params\TxTaskOfld,                 type,                 0, "enum"
HKR, Ndi\params\TxTaskOfld\enum,            0,                    0, %Disabled%
HKR, Ndi\params\TxTaskOfld\enum,            1,                    0, %TxTaskOfldCksm%
HKR, Ndi\params\TxTaskOfld\enum,            2,                    0, %TxTaskOfldTcpLS%

[Jumbo.reg]
HKR, ,                                      Jumbo,                0, "0"
HKR, Ndi\params\Jumbo,                      ParamDesc,            0, %Jumbo%
HKR, Ndi\params\Jumbo,                      default,              0, "0"
HKR, Ndi\params\Jumbo,                      type,                 0, "enum"
HKR, Ndi\params\Jumbo\enum,                 0,                    0, %Disabled%
HKR, Ndi\params\Jumbo\enum,                 1,                    0, %Enabled%

;-------------------------------------------------------------------------------
; Installation for NT
;

[GET.CopyFiles.NTAMD64]
get5a64.sys,,,2

[GET_NTAMD64.Service]
DisplayName     = %GET.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\get5a64.sys
LoadOrderGroup  = NDIS

[GET.EventLog]
AddReg = GET.AddEventLog.reg

[GET.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x00010001, 7

;-------------------------------------------------------------------------------
; DestinationDirs
;
[DestinationDirs]
DefaultDestDir          = 11
GET.CopyFiles.NTAMD64   = 12

;-------------------------------------------------------------------------------
; Uninstall/DelFiles/DelReg
;
[GET.delreg]
HKR,Ndi\Params

;-------------------------------------------------------------------------------
; Localizable Strings
;
[Strings]
MSFT                = "Microsoft"
VNT                 = "VIA Networking Technologies, Inc."
ConnectionType      = "Connection Type"
autoN               = "Auto-Negotiation"
100HD               = "100BaseTx Half Duplex"
100FD               = "100BaseTx Full Duplex"
10HD                = "10BaseT   Half Duplex"
10FD                = "10BaseT   Full Duplex"
Disabled            = "Disabled"
Enabled             = "Enabled"
TXBuffer            = "Transmit Buffers"
RXBuffer            = "Receive Buffers"
NetAddress          = "Network Address"
FlowCtl             = "Flow Control"
HwDefault           = "Hardware Default (Auto)"
EnableTx            = "Enable Tx"
EnableRx            = "Enable Rx"
EnableTxRx          = "Enable Tx/Rx"
8021pq              = "802.1p/Q Tagging"
VLANID              = "VLAN ID"
RxCksmOfld          = "Rx Checksum Offload"
TxTaskOfld          = "Tx Task Offload"
TxTaskOfldCksm      = "Checksum Offload"
TxTaskOfldTcpLS     = "Checksum and TCP Large Send Offload"
AI                  = "High Performance Interrupt"
Jumbo               = "Jumbo Frames Support"

VT3119.DeviceDesc    = "VIA Networking Velocity Family Giga-bit Ethernet Adapter"
GET.Service.DispName = "VIA Networking Velocity Family Giga-bit Ethernet Adapter Driver"
