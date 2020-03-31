; Netsis.inf
;
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature           = "$Windows NT$"
Class               = Net
ClassGUID           = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider            = %MSFT%
LayoutFile          = layout.inf
DriverVer=10/01/2002,2.0.1039.1172

[Manufacturer]
%SiS%               = SiS,  NTamd64
%IBM%               = IBM,  NTamd64
%SONY%              = SONY, NTamd64

[ControlFlags]
ExcludeFromSelect   = *

[SiS.NTamd64]
%GEN.DeviceDesc%    = sis900.ndi, PCI\VEN_1039&DEV_0900
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09001039
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_B15E0E11
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01121019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01651019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01661019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_05221019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_05281019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_05411019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_05601019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_05721019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09701019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09731019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09821019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09921019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09951019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09991019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_0A011019
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_000F1025
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_00171025
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_14551043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_15051043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_800B1043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_800C1043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_80321043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_80351043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_80E11043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_80E21043
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_09001054
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_70101071
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_71201071
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_71211071
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_73331071
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_75211071
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_5330107D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_5340107D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_5350107D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_0900107D 
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_630E1098
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_7101109F
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_11091170
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_32091170
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_06301297
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_101613BD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_101B13BD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_180413BD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_31001458
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_E0001458
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_10031462
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_208914A4
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_209714A4
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_213414A4
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_213614A4
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_213714A4
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_219314CD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_219414CD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_21B114CD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_21B714CD
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_110014FF
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_020114FF
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_090014FF
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_8807152D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_11031558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_11041558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_18001558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_20001558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_22001558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_22021558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_22041558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_51041558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_60001558
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_00741565
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_00811565
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_00901565
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_B500156D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50011584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50021584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50031584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50041584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50051584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50061584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_50071584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_60011584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_60021584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_60031584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_60041584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_60051584
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_000215C5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_011215C5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_316015D5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_636015D5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_716015D5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_816715D5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_838315D5
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_0800165D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_8810165D
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_A162270F
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_A172270F
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_A182270F
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_A372270F
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_A562270F
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_630E3411
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_0021A0A0
%sis900.DeviceDesc% = sis900.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_FFFF1039

[IBM.NTamd64]
%sisibm.DeviceDesc% = sisibm.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01B21014
%sisibm.DeviceDesc% = sisibm.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01BA1014
%sisibm.DeviceDesc% = sisibm.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01BB1014
%sisibm.DeviceDesc% = sisibm.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_01FB1014
%sisibm.DeviceDesc% = sisibm.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_02011014
%sisibm.DeviceDesc% = sisibm.ndi, PCI\VEN_1039&DEV_0900&SUBSYS_FFFF1014

[SONY.NTamd64]
%sissony.DeviceDesc%= sissony.ndi,PCI\VEN_1039&DEV_0900&SUBSYS_80D5104D
%sissony.DeviceDesc%= sissony.ndi,PCI\VEN_1039&DEV_0900&SUBSYS_FFFF104D

;------------------------------------------------------------------------
; SIS
;
[sis900.ndi]
Characteristics     = 0x84    ; NCF_PHYSICAL | NCF_HAS_UI
BusType             = 5       ; PCI
AddReg              = sis900.reg, nt5.reg
CopyFiles           = sisnic.CopyFiles

[sis900.ndi.Services]
AddService          = SISNIC, 2, sisnic.Service, common.EventLog

;------------------------------------------------------------------------
; IBM
;
[sisibm.ndi]
Characteristics     = 0x84    ; NCF_PHYSICAL | NCF_HAS_UI
BusType             = 5       ; PCI
AddReg              = sisibm.reg, nt5.reg
CopyFiles           = sisnic.CopyFiles

[sisibm.ndi.Services]
AddService          = SISNIC, 2, sisnic.Service, common.EventLog

;------------------------------------------------------------------------
; SONY
;
[sissony.ndi]
Characteristics     = 0x84    ; NCF_PHYSICAL | NCF_HAS_UI
BusType             = 5       ; PCI
AddReg              = sissony.reg, nt5.reg
CopyFiles           = sisnic.CopyFiles

[sissony.ndi.Services]
AddService          = SISNIC, 2, sisnic.Service, common.EventLog

;----------------------------------------------------------------------------
; Common driver parameters
;
[sis900.reg]
HKR, Ndi\params\NetworkAddress, ParamDesc, 0, %SiSNetworkAddress%
HKR, NDI\params\NetworkAddress, default,   0, ""
HKR, Ndi\params\NetworkAddress, optional,  0, "1"
HKR, NDI\params\NetworkAddress, type,      0, "edit"
HKR, NDI\params\NetworkAddress, LimitText, 0, "12"
HKR, NDI\params\NetworkAddress, UpperCase, 0, "1"

HKR, Ndi\params\MediaType,      ParamDesc, 0, %SiSMediaType%
HKR, Ndi\params\MediaType,      default,   0, "000"
HKR, Ndi\params\MediaType,      type,      0, "enum"
HKR, Ndi\params\MediaType\enum, "000",     0, %SiSMediaAuto%
HKR, Ndi\params\MediaType\enum, "008",     0, %SiSMedia10BaseTHalf%
HKR, Ndi\params\MediaType\enum, "010",     0, %SiSMedia10BaseTFull%
HKR, Ndi\params\MediaType\enum, "020",     0, %SiSMedia100BaseTXHalf%
HKR, Ndi\params\MediaType\enum, "040",     0, %SiSMedia100BaseTxFull%

[sisibm.reg]
HKR, Ndi\params\NetworkAddress, ParamDesc, 0, %SiSNetworkAddress%
HKR, NDI\params\NetworkAddress, default,   0, ""
HKR, Ndi\params\NetworkAddress, optional,  0, "1"
HKR, NDI\params\NetworkAddress, type,      0, "edit"
HKR, NDI\params\NetworkAddress, LimitText, 0, "12"
HKR, NDI\params\NetworkAddress, UpperCase, 0, "1"

HKR, Ndi\params\MediaType,      ParamDesc, 0, %SiSMediaType%
HKR, Ndi\params\MediaType,      default,   0, "000"
HKR, Ndi\params\MediaType,      type,      0, "enum"
HKR, Ndi\params\MediaType\enum, "000",     0, %SiSMediaAuto%
HKR, Ndi\params\MediaType\enum, "008",     0, %SiSMedia10BaseTHalf%
HKR, Ndi\params\MediaType\enum, "010",     0, %SiSMedia10BaseTFull%
HKR, Ndi\params\MediaType\enum, "020",     0, %SiSMedia100BaseTXHalf%
HKR, Ndi\params\MediaType\enum, "040",     0, %SiSMedia100BaseTxFull%

[sissony.reg]
HKR, Ndi\params\NetworkAddress, ParamDesc, 0, %SiSNetworkAddress%
HKR, NDI\params\NetworkAddress, default,   0, ""
HKR, Ndi\params\NetworkAddress, optional,  0, "1"
HKR, NDI\params\NetworkAddress, type,      0, "edit"
HKR, NDI\params\NetworkAddress, LimitText, 0, "12"
HKR, NDI\params\NetworkAddress, UpperCase, 0, "1"

HKR, Ndi\params\MediaType,      ParamDesc, 0, %SiSMediaType%
HKR, Ndi\params\MediaType,      default,   0, "000"
HKR, Ndi\params\MediaType,      type,      0, "enum"
HKR, Ndi\params\MediaType\enum, "000",     0, %SiSMediaAuto%
HKR, Ndi\params\MediaType\enum, "008",     0, %SiSMedia10BaseTHalf%
HKR, Ndi\params\MediaType\enum, "010",     0, %SiSMedia10BaseTFull%
HKR, Ndi\params\MediaType\enum, "020",     0, %SiSMedia100BaseTXHalf%
HKR, Ndi\params\MediaType\enum, "040",     0, %SiSMedia100BaseTxFull%

;-----------------------------------------------------------------------------
; Ndi object registration
;
;NT specific
[nt5.reg]
HKR, Ndi,                               Service,            0, "SISNIC"
HKR, Ndi\Interfaces,                    UpperRange,         0, "ndis5"
HKR, Ndi\Interfaces,                    LowerRange,         0, "ethernet"

;----------------------------------------------------------------------------
; Services Sections for NT
;
[sisnic.Service]
DisplayName         = %sisnic.Service.DispName%
ServiceType         = 1 ;%SERVICE_KERNEL_DRIVER%
StartType           = 3 ;%SERVICE_DEMAND_START%
ErrorControl        = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary       = %12%\sisnic.sys
LoadOrderGroup      = NDIS

[common.EventLog]
AddReg              = common.AddEventLog.reg

[common.AddEventLog.reg]
HKR,,EventMessageFile,   0x00020000, = "%%SystemRoot%%\System32\netevent.dll"
HKR,,TypesSupported,     0x00010001, = 7

[DestinationDirs]
DefaultDestDir      = 12
sisnic.CopyFiles    = 12

[sisnic.CopyFiles]
sisnic.sys

[Strings]
SiS                           = "SiS"
MSFT                          = "Microsoft"
IBM                           = "IBM"
SONY                          = "SONY"

SiSMediaAuto                  = "Auto_Config"
SiSMedia10BaseTHalf           = "10BaseT"
SiSMedia10BaseTFull           = "10BaseT Full_Duplex"
SiSMedia100BaseTXHalf         = "100BaseTX"
SiSMedia100BaseTxFull         = "100BaseTX Full_Duplex"
SiSMediaType                  = "MediaType"
SiSNetworkAddress             = "NetworkAddress"

GEN.DeviceDesc                = "SiS 900-Based PCI Fast Ethernet Adapter"
sis900.DeviceDesc             = "SiS 900 PCI Fast Ethernet Adapter"
sisibm.DeviceDesc             = "Integrated 10/100 Ethernet Controller"
sissony.DeviceDesc            = "SiS 900 PCI Fast Ethernet Adapter"

sisnic.Service.DispName       = "SiS PCI Fast Ethernet Adapter Driver"


