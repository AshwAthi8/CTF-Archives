; NETRAST.INX -- RAS Transports
;
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature   = "$Windows NT$"
Class       = NetTrans
ClassGUID   = {4d36e975-e325-11ce-bfc1-08002be10318}
Provider    = %Msft%
LayoutFile  = layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect = MS_L2TP,MS_NdisWan,MS_PPTP,MS_Wanarp,MS_PPPOE

[Manufacturer]
%Msft% = Msft, NTamd64

[Msft.NTamd64]
%L2tp-DispName%             = Ndi-L2tpProtocol,     "MS_L2TP"
%NdisWan-DispName%          = Ndi-NdisWan,          "MS_NdisWan"
%Pptp-DispName%             = Ndi-PptpProtocol,     "MS_PPTP"
%Wanarp-DispName%           = Ndi-Wanarp,           "MS_Wanarp"
%Pppoe-DispName%            = Ndi-PppoeProtocol,    "MS_PPPOE"

[Ndi-L2tpProtocol]
Characteristics = 0x38    ; NCF_HIDDEN | NCF_NO_SERVICE | NCF_NOT_USER_REMOVABLE
AddReg          = Ndi-Reg-L2tp

[Ndi-NdisWan]
Characteristics = 0x28    ; NCF_HIDDEN | NCF_NOT_USER_REMOVABLE
AddReg          = Ndi-Reg-NdisWan, Reg-Install-NdisWan

[Ndi-PptpProtocol]
Characteristics = 0x38    ; NCF_HIDDEN | NCF_NO_SERVICE | NCF_NOT_USER_REMOVABLE
AddReg          = Ndi-Reg-Pptp

[Ndi-Wanarp]
Characteristics = 0x28    ; NCF_HIDDEN | NCF_NOT_USER_REMOVABLE
AddReg          = Ndi-Reg-Wanarp

[Ndi-PppoeProtocol]
Characteristics = 0x28    ; NCF_HIDDEN | NCF_NOT_USER_REMOVABLE
AddReg          = Ndi-Reg-Pppoe

[Ndi-Reg-L2tp]
HKR, Ndi,            ClsID,         0,          "{6e65cbc6-926d-11d0-8e27-00c04fc99dcf}"
HKR, Ndi,            HelpText,      0,          %L2tp-HelpText%
HKR, Ndi\Interfaces, UpperRange,    0,          "noupper"
HKR, Ndi\Interfaces, LowerRange,    0,          "nolower"

[Ndi-Reg-NdisWan]
HKR, Ndi,            ClsID,         0,          "{6e65cbc3-926d-11d0-8e27-00c04fc99dcf}"
HKR, Ndi,            Service,       0,          "NdisWan"
HKR, Ndi\Interfaces, UpperRange,    0,          "noupper"
HKR, Ndi\Interfaces, LowerRange,    0,          "ndisatm,ndiscowan,ndiswan,ndiswanasync"

[Ndi-Reg-Pptp]
HKR, Ndi,            ClsID,         0,          "{6e65cbc4-926d-11d0-8e27-00c04fc99dcf}"
HKR, Ndi,            HelpText,      0,          %Pptp-HelpText%
HKR, Ndi\Interfaces, UpperRange,    0,          "noupper"
HKR, Ndi\Interfaces, LowerRange,    0,          "nolower"

[Ndi-Reg-Wanarp]
HKR, Ndi,            Service,       0,          "Wanarp"
HKR, Ndi,            CoServices,    0x00010000, "Wanarp"
HKR, Ndi\Interfaces, UpperRange,    0,          "noupper"
HKR, Ndi\Interfaces, LowerRange,    0,          "nolower"

[Ndi-Reg-Pppoe]
HKR, Ndi,            ClsID,         0,          "{e949da38-c39d-4460-8ea7-a39152c56836}"
HKR, Ndi,            Service,       0,          "RasPppoe"
HKR, Ndi,            HelpText,      0,          %Pppoe-HelpText%
HKR, Ndi\Interfaces, UpperRange,    0,          "noupper"
HKR, Ndi\Interfaces, LowerRange,    0,          "ndis4,ndis5"

[Reg-Install-NdisWan]
HKLM, Software\Microsoft\Ras\CurrentVersion,, 0x10    ;FLG_ADDREG_KEYONLY
HKR, Parameters,     QoSPriorityThreshold, 0x10001, 0 ;REG_DWORD
HKR, Parameters,     QoSFragmentSize,0x10001,       0 ;REG_DWORD

[Ndi-NdisWan.Remove]
DelReg      = Reg-Remove-NdisWan

[Reg-Remove-NdisWan]
HKLM, Software\Microsoft\Ras

[Ndi-NdisWan.Services]
AddService = NdisTapi,      0, Svc-NdisTapi
AddService = NdisWan,       0, Svc-NdisWan,      Evt-Rasmsg

[Ndi-PppoeProtocol.Services]
AddService = RasPppoe,       0, Svc-PppoeProtocol

[Ndi-NdisWan.Remove.Services]
DelService = NdisWan
DelService = NdisTapi

[Ndi-PppoeProtocol.Remove.Services]
DelService = RasPppoe

[Svc-NdisTapi]
DisplayName     = %Svc-NdisTapi-DispName%
ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
StartType       = 3 ;SERVICE_DEMAND_START
ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\ndistapi.sys
AddReg          = Reg-NdisTapi
Description     = %Svc-NdisTapi-DispName%

[Reg-NdisTapi]
HKR, Parameters, AsyncEventQueueSize, 0x00010003, 0x300

[Svc-NdisWan]
DisplayName     = %Svc-NdisWan-DispName%
ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
StartType       = 3 ;SERVICE_DEMAND_START
ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\ndiswan.sys
AddReg          = Reg-NdisWan
Description     = %Svc-NdisWan-DispName%

[Reg-NdisWan]
HKR, Parameters,, 0x10  ;FLG_ADDREG_KEYONLY

[Svc-PppoeProtocol]
DisplayName     = %Svc-PppoeProtocol-DispName%
ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
StartType       = 3 ;SERVICE_DEMAND_START
ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\raspppoe.sys
Description     = %Svc-PppoeProtocol-DispName%

[Evt-Rasmsg]
AddReg = Evt-Rasmsg-AddReg

[Evt-Rasmsg-AddReg]
HKR,, EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\mprmsg.dll"
HKR,, TypesSupported,   0x00010001, 0x0000001f

[Evt-Netevent]
AddReg = Evt-Netevent-AddReg

[Evt-Netevent-AddReg]
HKR,, EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR,, TypesSupported,   0x00010001, 0x00000007


[Strings]
Msft = "Microsoft"

L2tp-DispName               = "Layer 2 Tunneling Protocol"
L2tp-HelpText               = "Allows you to securely connect to a private network using the Internet."
NdisWan-DispName            = "Remote Access NDIS WAN Driver"
Pptp-DispName               = "Point to Point Tunneling Protocol"
Pptp-HelpText               = "Allows you to securely connect to a private network using the Internet."
Wanarp-DispName             = "Remote Access IP ARP Driver"
Pppoe-DispName              = "Point to Point Protocol Over Ethernet"
Pppoe-HelpText              = "Provides the abilitiy to connect a host to a Remote Access Concentrator that supports RFC2516."

Svc-NdisTapi-DispName       = "Remote Access NDIS TAPI Driver"
Svc-NdisWan-DispName        = "Remote Access NDIS WAN Driver"
Svc-PppoeProtocol-DispName  = "Remote Access PPPOE Driver"

