acteristics = 0x80 ; NCF_HAS_UI

[ATMUNI.ndi.reg]
HKR, Ndi,ClsID,,"{674D3E3D-A1A8-11d0-A886-00C04FC99C9C}"
HKR,Ndi,Service,,"Atmuni"
HKR,"Ndi","CoServices",%FLG_ADDREG_TYPE_MULTI_SZ%,"Atmuni"
HKR,Ndi\Interfaces,UpperRange,,"noupper"
HKR,Ndi\Interfaces,LowerRange,,"ndisatm"
HKR,Ndi,HelpText,,"@netcfgx.dll,-50006"

[ATMUNI.ndi.Services]
AddService=Atmuni, 0, ATMUNI.AddService, NetEventLog

[Atmuni.AddService]
DisplayName     = %ATMUNI.DeviceDesc%
ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
StartType       = 2 ;SERVICE_AUTO_START
ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\atmuni.sys
LoadOrderGroup  = NDIS
Description     = %ATMUNI.DeviceDesc%

[NetEventLog]
AddReg = NetEventLog.AddReg

[NetEventLog.AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\netevent.dll"
HKR,,TypesSupported,0x00010001,7

[ATMUNI.ndi.Remove.Services]
DelService = Atmuni


;****************************************************************************
; Localizable Strings
;****************************************************************************
[strings]
V_MS="Microsoft"
V_CLASSNAME="Network Protocol"
ATMUNI.DeviceDesc="ATM Call Manager"

; AddReg flags
FLG_ADDREG_TYPE_EXPAND_SZ   = 0x00020000
FLG_ADDREG_TYPE_MULTI_SZ    = 0x00010000
FLG_ADDREG_TYPE_DWORD       = 0x00010001
FLG_ADDREG_KEYONLY          = 0x00000010
