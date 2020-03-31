rvice_Inst, mf_EventLog_Inst

[mf_Service_Inst]
ServiceType    = 1      ; SERVICE_KERNEL_DRIVER
StartType      = 3      ; SERVICE_DEMAND_START
ErrorControl   = 1      ; SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\mf.sys

[mf_EventLog_Inst]
AddReg = mf_EventLog_AddReg

[mf_EventLog_AddReg]
;REG_EXPAND_SZ = 0x00020000
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll"
;REG_DWORD=0x00010001
HKR,,TypesSupported,0x00010001,7

[mf.CopyFiles]
mf.sys

[DestinationDirs]
mf.CopyFiles = 12   ; MF.SYS


;
; Translatable strings
;
[Strings]
MS="Microsoft"
;
; Manufacturer names
;
MF="Generic multifunction card"
; Adapter names
;
MFCARD="Generic Multifunction PC-Card"
MFClassName="Multifunction adapters"
