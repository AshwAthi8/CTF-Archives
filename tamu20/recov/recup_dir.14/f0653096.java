ics = 0x410 ; NCF_FILTER | NCF_NO_SERVICE
RegisterDlls = PSched.ndi.Register

[PSched.ndi.Remove]
UnregisterDlls = PSched.ndi.Unregister

[PSched.ndi.Services]
AddService = PSched, , PSched.AddService, PSched.AddEventLog

[PSched.AddService]
DisplayName    = %PSched_Desc%
ServiceType    = 1 ;SERVICE_KERNEL_DRIVER
StartType      = 3 ;SERVICE_DEMAND_START
ErrorControl   = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\psched.sys
LoadOrderGroup = PNP_TDI
Dependencies   = Gpc
Description    = %PSched_Desc%

[PSched.AddEventLog]
AddReg = PSched.AddEventLog.AddReg

[PSched.AddEventLog.AddReg]
HKR, , EventMessageFile, 0x20000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x10001, 7

[PSched.ndi.AddReg]
HKR, Ndi,            HelpText,            , "@netcfgx.dll,-50015"
HKR, Ndi,            FilterClass,         , scheduler
HKR, Ndi,            FilterDeviceInfId,   , ms_pschedmp
HKR, Ndi,            Service,             , PSched
HKR, Ndi,            RequiredAll, 0       ,"ms_gpc"
HKR, Ndi\Interfaces, UpperRange,          , noupper
HKR, Ndi\Interfaces, LowerRange,          , nolower
HKR, Ndi\Interfaces, LowerExclude,        , "ndisatm, ndiscowan, ndiswan, ndiswanasync, ndiswanipx, ndiswannbf"
HKR, Ndi\Interfaces, FilterMediaTypes,    , "ethernet, tokenring, fddi, wan"

[Registry.Service.PSched]
; Perfmon
HKLM, "System\CurrentControlSet\Services\PSched\Performance", "Library", , "pschdprf.dll"
HKLM, "System\CurrentControlSet\Services\PSched\Performance", "Open",    , "OpenPschedPerformanceData"
HKLM, "System\CurrentControlSet\Services\PSched\Performance", "Close",   , "ClosePschedPerformanceData"
HKLM, "System\CurrentControlSet\Services\PSched\Performance", "Collect", , "CollectPschedPerformanceData"

[PSched.ndi.Register]
11,, lodctr.exe, 1,,"pschdprf.ini"

[PSched.ndi.Unregister]
11,, unlodctr.exe, 1,,"PSched"


[Strings]
Msft = "Microsoft"

PSched_Desc = "QoS Packet Scheduler"

