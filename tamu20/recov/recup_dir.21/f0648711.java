;
; NETLEPVC.INX
;
; ATM EPVC Transport
;
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature = "$Windows NT$"
Class = NetTrans
ClassGUID = {4D36E975-E325-11CE-BFC1-08002BE10318}
Provider = %Msft%
LayoutFile = layout.inf
DriverVer=10/01/2002,obj\amd64\netepvcp.

[Manufacturer]
%Msft% = MSFT,NTx86,NTia64,NTamd64

[MSFT.NTx86]
%ATMEPVCP_Desc% = ATMEPVCP.ndi, MS_ATMEPVCP

[MSFT.NTia64]
%ATMEPVCP_Desc% = ATMEPVCP.ndi, MS_ATMEPVCP

[MSFT.NTamd64]
%ATMEPVCP_Desc% = ATMEPVCP.ndi, MS_ATMEPVCP

[ATMEPVCP.ndi]
AddReg = ATMEPVCP.ndi.AddReg
Characteristics = 0x00 ;
                                                                                                   

;-----------------------------------------------------------------------
;  Install parameters
;

[ATMEPVCP.ndi.AddReg]
HKR, Ndi,            ClsID,         0, "{60416955-d060-4c2a-b5ee-de663ce25716}";
HKR, Ndi,            ComponentDll, , atmpvcno.dll
HKR, Ndi,            HelpText,      0,          "%ATMEPVCP_HELP%"
HKR, Ndi,            Service,       0,          "ATMEPVCP"
HKR, Ndi,            CoServices,    0x10000,    "ATMEPVCP"
HKR, Ndi\Interfaces, UpperRange,    0,          "noupper"
HKR, Ndi\Interfaces, LowerRange,    0,          "ndisatm"

HKLM,"System\CurrentControlSet\Services\EventLog\System\ATMEPVCP",EventMessageFile, 0x20000, "%%SystemRoot%%\System32\netevent.dll"
HKLM,"System\CurrentControlSet\Services\EventLog\System\ATMEPVCP",TypesSupported,   0x10001, 7

[ATMEPVCP.ndi.Services]
AddService = ATMEPVCP, 0, ATMEPVCP.AddService, ATMEPVCP.AddEventLog

[ATMEPVCP.AddService]
DisplayName     = %ATMEPVCP_Desc%
ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
StartType       = 3 ;SERVICE_DEMAND_START
ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\atmepvc.sys
LoadOrderGroup  = PNP_TDI
Description     = %ATMEPVCP_Desc%

[ATMEPVCP.AddEventLog]
AddReg = ATMEPVCP.AddEventLog.AddReg

[ATMEPVCP.AddEventLog.AddReg]
HKR, , EventMessageFile, 0x20000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x10001, 7

[ATMEPVCP.ndi.Remove.Services]
DelService = ATMEPVCP

[Strings]
Msft = "Microsoft"

ATMEPVCP_Desc = "Microsoft Ethernet PVC - RFC2684"
ATMEPVCP_HELP = "Microsoft Ethernet PVC - RFC2684"

