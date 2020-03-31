s = 0x28

[GPC.ndi.Services]
AddService = Gpc, 2, GPC.AddService

[GPC.AddService]
DisplayName    = %GPC_Desc%
ServiceType    = 1 ;SERVICE_KERNEL_DRIVER
StartType      = 3 ;SERVICE_DEMAND_START
ErrorControl   = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\msgpc.sys
LoadOrderGroup = PNP_TDI
Description    = %GPC_Desc%

[GPC.ndi.Remove.Services]
DelService = Gpc

[GPC.ndi.AddReg]
HKR, "Ndi",            "Service",    , "Gpc"
HKR, "Ndi\Interfaces", "UpperRange", , "noupper"
HKR, "Ndi\Interfaces", "LowerRange", , "nolower"

[GPC.ndi.Winsock]
AddSock           = Install.QoSWinsock

[Install.QoSWinsock]
TransportService  = Gpc
HelperDllName     = "%SystemRoot%\System32\wshqos.dll"
MaxSockAddrLength = 0x10
MinSockAddrLength = 0x10

[GPC.ndi.Remove.Winsock]
DelSock           = Remove.QoSWinsock

[Remove.QoSWinsock]
TransportService  = Gpc

[Strings]
Msft = "Microsoft"

GPC_Desc = "Generic Packet Classifier"

