;cyyport.inf
;Copyright (c) 2000-2001 Cyclades Corporation

[version]
Signature   = "$Windows NT$"
Class       = Ports
ClassGUID   = {4d36e978-e325-11ce-bfc1-08002be10318}
Provider    = %Cyclades%
LayoutFile  = layout.inf
DriverVer=10/01/2002,5.2.3790.1830


[DestinationDirs]
system_dir = 11     ; %windir%\system32
driver_dir = 12	    ; %windir%\system32\drivers

[Manufacturer]
%Cyclades%     = Cyclades,NTamd64

[Cyclades.NTamd64]
; DisplayName    Section     DeviceID
; -----------    -------     --------
%CyclomyPort1%  = y_inst.nt, Cyclom-Y\Port1
%CyclomyPort2%  = y_inst.nt, Cyclom-Y\Port2
%CyclomyPort3%  = y_inst.nt, Cyclom-Y\Port3
%CyclomyPort4%  = y_inst.nt, Cyclom-Y\Port4
%CyclomyPort5%  = y_inst.nt, Cyclom-Y\Port5
%CyclomyPort6%  = y_inst.nt, Cyclom-Y\Port6
%CyclomyPort7%  = y_inst.nt, Cyclom-Y\Port7
%CyclomyPort8%  = y_inst.nt, Cyclom-Y\Port8
%CyclomyPort9%  = y_inst.nt, Cyclom-Y\Port9
%CyclomyPort10% = y_inst.nt, Cyclom-Y\Port10
%CyclomyPort11% = y_inst.nt, Cyclom-Y\Port11
%CyclomyPort12% = y_inst.nt, Cyclom-Y\Port12
%CyclomyPort13% = y_inst.nt, Cyclom-Y\Port13
%CyclomyPort14% = y_inst.nt, Cyclom-Y\Port14
%CyclomyPort15% = y_inst.nt, Cyclom-Y\Port15
%CyclomyPort16% = y_inst.nt, Cyclom-Y\Port16
%CyclomyPort17% = y_inst.nt, Cyclom-Y\Port17
%CyclomyPort18% = y_inst.nt, Cyclom-Y\Port18
%CyclomyPort19% = y_inst.nt, Cyclom-Y\Port19
%CyclomyPort20% = y_inst.nt, Cyclom-Y\Port20
%CyclomyPort21% = y_inst.nt, Cyclom-Y\Port21
%CyclomyPort22% = y_inst.nt, Cyclom-Y\Port22
%CyclomyPort23% = y_inst.nt, Cyclom-Y\Port23
%CyclomyPort24% = y_inst.nt, Cyclom-Y\Port24
%CyclomyPort25% = y_inst.nt, Cyclom-Y\Port25
%CyclomyPort26% = y_inst.nt, Cyclom-Y\Port26
%CyclomyPort27% = y_inst.nt, Cyclom-Y\Port27
%CyclomyPort28% = y_inst.nt, Cyclom-Y\Port28
%CyclomyPort29% = y_inst.nt, Cyclom-Y\Port29
%CyclomyPort30% = y_inst.nt, Cyclom-Y\Port30
%CyclomyPort31% = y_inst.nt, Cyclom-Y\Port31
%CyclomyPort32% = y_inst.nt, Cyclom-Y\Port32

[ControlFlags]
ExcludeFromSelect = *

;-----------------------------------------------
; y_inst.nt section
;-----------------------------------------------

[y_inst.nt]
CopyFiles  = driver_dir
AddReg     = y_reg

[y_inst.nt.HW]
AddReg     = y_HW_reg

[y_inst.nt.Services]
AddService = cyyport, 0x00000002, y_service_inst, y_eventlog_inst

[y_inst.nt.CoInstallers]
CopyFiles  = system_dir
AddReg     = y_coinst_reg

;-----------------------------------------------

[y_reg]
HKR,,EnumPropPages32,,"MsPorts.dll,SerialPortPropPageProvider"
HKR,,EnumAdvancedDialog,,"CyyPorts.dll,CyyportAdvancedDialog"

[y_HW_reg]
HKR,,"UpperFilters",0x00010000,"serenum"

[y_service_inst]
DisplayName     = %Y_Service_DispName%
ServiceType     = 1 	;SERVICE_KERNEL_DRIVER
StartType       = 3 	;SERVICE_DEMAND_START
ErrorControl    = 1 	;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\cyyport.sys
LoadOrderGroup  = ExtendedBase

[y_eventlog_inst]
AddReg = y_eventlog_reg

[y_eventlog_reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\cyyport.sys"
HKR,, TypesSupported,  0x00010001, 7

[y_coinst_reg]
HKR,,CoInstallers32,0x00010000,"cyyports.dll,CyyportCoInstaller"

[driver_dir]
cyyport.sys

[system_dir]
cyyports.dll



;-----------------------------------------------
; Strings section
;-----------------------------------------------

[Strings]
Cyclades   = "Cyclades Corporation"

CyclomyPort1 =  "Cyclom-Y Port  1"
CyclomyPort2 =  "Cyclom-Y Port  2"
CyclomyPort3 =  "Cyclom-Y Port  3"
CyclomyPort4 =  "Cyclom-Y Port  4"
CyclomyPort5 =  "Cyclom-Y Port  5"
CyclomyPort6 =  "Cyclom-Y Port  6"
CyclomyPort7 =  "Cyclom-Y Port  7"
CyclomyPort8 =  "Cyclom-Y Port  8"
CyclomyPort9 =  "Cyclom-Y Port  9"
CyclomyPort10 = "Cyclom-Y Port 10"
CyclomyPort11 = "Cyclom-Y Port 11"
CyclomyPort12 = "Cyclom-Y Port 12"
CyclomyPort13 = "Cyclom-Y Port 13"
CyclomyPort14 = "Cyclom-Y Port 14"
CyclomyPort15 = "Cyclom-Y Port 15"
CyclomyPort16 = "Cyclom-Y Port 16"
CyclomyPort17 = "Cyclom-Y Port 17"
CyclomyPort18 = "Cyclom-Y Port 18"
CyclomyPort19 = "Cyclom-Y Port 19"
CyclomyPort20 = "Cyclom-Y Port 20"
CyclomyPort21 = "Cyclom-Y Port 21"
CyclomyPort22 = "Cyclom-Y Port 22"
CyclomyPort23 = "Cyclom-Y Port 23"
CyclomyPort24 = "Cyclom-Y Port 24"
CyclomyPort25 = "Cyclom-Y Port 25"
CyclomyPort26 = "Cyclom-Y Port 26"
CyclomyPort27 = "Cyclom-Y Port 27"
CyclomyPort28 = "Cyclom-Y Port 28"
CyclomyPort29 = "Cyclom-Y Port 29"
CyclomyPort30 = "Cyclom-Y Port 30"
CyclomyPort31 = "Cyclom-Y Port 31"
CyclomyPort32 = "Cyclom-Y Port 32"

Y_Service_DispName = "Cyclom-Y Port Driver"


