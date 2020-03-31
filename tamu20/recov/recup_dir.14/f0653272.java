4]
%RAWWAN.DeviceDesc%=   RAWWAN.ndi, MS_RAWWAN

[ControlFlags]
ExcludeFromSelect = MS_RAWWAN

[RAWWAN.ndi]
AddReg=RAWWAN.ndi.reg
Characteristics = 0x28 ; NCF_HIDDEN | NCF_NOT_USER_REMOVABLE
CopyFiles=RAWWAN.CopyFiles

[RAWWAN.ndi.reg]
HKR, Ndi, HelpText,,%RAWWAN_HELP%
HKR, Ndi, Service,,"Rawwan"
HKR,"Ndi","CoServices",%FLG_ADDREG_TYPE_MULTI_SZ%,"Rawwan"
HKR,Ndi\Interfaces,UpperRange,,"noupper"
HKR,Ndi\Interfaces,LowerRange,,"ndisatm"

[RAWWAN.ndi.Winsock]
AddSock = Install.RwanWinsock

[Install.RwanWinsock]
TransportService = RawWan
HelperDllName = "%%SystemRoot%%\System32\wshatm.dll"
MaxSockAddrLength = 0x4c
MinSockAddrLength = 0x4c

[RAWWAN.CopyFiles]
;rawwan.sys

[RAWWAN.ndi.Services]
AddService=Rawwan, 0, RAWWAN.AddService, NetEventLog

[RAWWAN.AddService]
    DisplayName     = %RAWWAN.DeviceDesc%
    ServiceType     = 1 ;SERVICE_KERNEL_DRIVER
    StartType       = 2 ;SERVICE_AUTO_START
    ErrorControl    = 1 ;SERVICE_ERROR_NORMAL
    ServiceBinary   = %12%\rawwan.sys
    LoadOrderGroup  = NDIS
    AddReg          = Registry.Service.Rawwan
    Description     = %RAWWAN.DeviceDesc%

[NetEventLog]
AddReg = NetEventLog.AddReg

[NetEventLog.AddReg]
    HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\netevent.dll"
    HKR,,TypesSupported,0x00010001,7

[Registry.Service.Rawwan]
    HKR, Parameters\Winsock, "UseDelayedAcceptance",%FLG_ADDREG_TYPE_DWORD%,0x0001

[RAWWAN.ndi.Remove.Services]
    DelService  = Rawwan

[RAWWAN.ndi.Remove.Winsock]
DelSock = Remove.RwanWinsock

[Remove.RwanWinsock]
TransportService = RawWan

;****************************************************************************
; Localizable Strings
;****************************************************************************
[strings]
V_MS="Microsoft"
V_CLASSNAME="Network Protocol"
RAWWAN.DeviceDesc="RAW WAN Driver"
RAWWAN_HELP="The RAW WAN driver provides TDI access to connection oriented network media."

; AddReg flags
FLG_ADDREG_TYPE_EXPAND_SZ   = 0x00020000
FLG_ADDREG_TYPE_MULTI_SZ    = 0x00010000
FLG_ADDREG_TYPE_DWORD       = 0x00010001
FLG_ADDREG_KEYONLY          = 0x00000010
