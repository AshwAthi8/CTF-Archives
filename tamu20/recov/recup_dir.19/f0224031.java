;cyclom-y.inf
;Copyright (c) 2000-2001 Cyclades Corporation

[version]
Signature   = "$Windows NT$"
Class       = MultiportSerial
ClassGUID   = {50906cb8-ba12-11d1-bf5d-0000f805f530}
Provider    = %Cyclades%
LayoutFile  = layout.inf
DriverVer=10/01/2002,5.2.3790.1830


[DestinationDirs]
system_dir = 11     ; %windir%\system32
driver_dir = 12	    ; %windir%\system32\drivers
help_dir   = 18     ; %windir%\help

[Manufacturer]
%Cyclades%     = Cyclades,NTamd64

[Cyclades.NTamd64]
; DisplayName  Section     DeviceID
; -----------  -------     --------
%Y_PCI%   =  ypci_inst.nt, PCI\VEN_120E&DEV_0105&SUBSYS_0100120E&REV_01,PCI\VEN_120E&DEV_0105
%Y_PCI%   =  ypci_inst.nt, PCI\VEN_120E&DEV_0103&SUBSYS_0100120E&REV_01,PCI\VEN_120E&DEV_0103
%Y_PCI%   =  ypci_inst.nt, PCI\VEN_120E&DEV_0101&SUBSYS_0100120E&REV_01,PCI\VEN_120E&DEV_0101

[ControlFlags]
ExcludeFromSelect = *

;------------------------------------------------------------------------------
[ypci_inst.nt]
CopyFiles       = driver_dir
AddReg          = y_pp_reg
CopyInf         = cyyport.inf

[ypci_inst.nt.Services]
AddService = cyclom-y, 0x00000002, y_service_inst, y_eventlog_inst

[ypci_inst.nt.CoInstallers]
CopyFiles       = system_dir, help_dir
AddReg          = y_coinst_reg

;------------------------------------------------------------------------------
[y_service_inst]
DisplayName     = %Service_DispName%
ServiceType     = 1 	;SERVICE_KERNEL_DRIVER
StartType       = 3 	;SERVICE_DEMAND_START
ErrorControl    = 1 	;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\cyclom-y.sys
LoadOrderGroup  = ExtendedBase

[y_eventlog_inst]
AddReg = y_eventlog_reg

[y_eventlog_reg]
HKR,, EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\cyclom-y.sys"
HKR,, TypesSupported,  0x00010001, 7

;------------------------------------------------------------------------------
[y_coinst_reg]
HKR,,CoInstallers32,0x00010000,"cyycoins.dll,CyclomyCoInstaller"

;------------------------------------------------------------------------------
[y_pp_reg]
HKR,,EnumPropPages32,,"cyycoins.dll,CyclomyPropPageProvider"

[driver_dir]
cyclom-y.sys

[system_dir]
cyycoins.dll

[help_dir]
cyycoins.chm






[Strings]
Cyclades   = "Cyclades Corporation"

Y_PCI   = "Cyclom-Y"

Service_DispName = "Cyclom-Y Enumerator Driver"
