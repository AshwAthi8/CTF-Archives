;cyzport.inf
;Copyright (c) 2000-2001 Cyclades Corporation

[version]
Signature   = "$Windows NT$"
Class       = Ports
ClassGUID   = {4d36e978-e325-11ce-bfc1-08002be10318}
Provider    = %Cyclades%
LayoutFile  = layout.inf
DriverVer=10/01/2002,5.2.3790.1830


[DestinationDirs]
system_dir = 11             ; %windir%\system32
driver_dir = 12	            ; %windir%\system32\drivers

[Manufacturer]
%Cyclades%     = Cyclades,NTamd64

[Cyclades.NTamd64]
; DisplayName       Section    DeviceID
; -----------       -------    --------
%CycladeszPort1%  = z_inst.nt, Cyclades-Z\Port1
%CycladeszPort2%  = z_inst.nt, Cyclades-Z\Port2
%CycladeszPort3%  = z_inst.nt, Cyclades-Z\Port3
%CycladeszPort4%  = z_inst.nt, Cyclades-Z\Port4
%CycladeszPort5%  = z_inst.nt, Cyclades-Z\Port5
%CycladeszPort6%  = z_inst.nt, Cyclades-Z\Port6
%CycladeszPort7%  = z_inst.nt, Cyclades-Z\Port7
%CycladeszPort8%  = z_inst.nt, Cyclades-Z\Port8
%CycladeszPort9%  = z_inst.nt, Cyclades-Z\Port9
%CycladeszPort10% = z_inst.nt, Cyclades-Z\Port10
%CycladeszPort11% = z_inst.nt, Cyclades-Z\Port11
%CycladeszPort12% = z_inst.nt, Cyclades-Z\Port12
%CycladeszPort13% = z_inst.nt, Cyclades-Z\Port13
%CycladeszPort14% = z_inst.nt, Cyclades-Z\Port14
%CycladeszPort15% = z_inst.nt, Cyclades-Z\Port15
%CycladeszPort16% = z_inst.nt, Cyclades-Z\Port16
%CycladeszPort17% = z_inst.nt, Cyclades-Z\Port17
%CycladeszPort18% = z_inst.nt, Cyclades-Z\Port18
%CycladeszPort19% = z_inst.nt, Cyclades-Z\Port19
%CycladeszPort20% = z_inst.nt, Cyclades-Z\Port20
%CycladeszPort21% = z_inst.nt, Cyclades-Z\Port21
%CycladeszPort22% = z_inst.nt, Cyclades-Z\Port22
%CycladeszPort23% = z_inst.nt, Cyclades-Z\Port23
%CycladeszPort24% = z_inst.nt, Cyclades-Z\Port24
%CycladeszPort25% = z_inst.nt, Cyclades-Z\Port25
%CycladeszPort26% = z_inst.nt, Cyclades-Z\Port26
%CycladeszPort27% = z_inst.nt, Cyclades-Z\Port27
%CycladeszPort28% = z_inst.nt, Cyclades-Z\Port28
%CycladeszPort29% = z_inst.nt, Cyclades-Z\Port29
%CycladeszPort30% = z_inst.nt, Cyclades-Z\Port30
%CycladeszPort31% = z_inst.nt, Cyclades-Z\Port31
%CycladeszPort32% = z_inst.nt, Cyclades-Z\Port32
%CycladeszPort33% = z_inst.nt, Cyclades-Z\Port33
%CycladeszPort34% = z_inst.nt, Cyclades-Z\Port34
%CycladeszPort35% = z_inst.nt, Cyclades-Z\Port35
%CycladeszPort36% = z_inst.nt, Cyclades-Z\Port36
%CycladeszPort37% = z_inst.nt, Cyclades-Z\Port37
%CycladeszPort38% = z_inst.nt, Cyclades-Z\Port38
%CycladeszPort39% = z_inst.nt, Cyclades-Z\Port39
%CycladeszPort40% = z_inst.nt, Cyclades-Z\Port40
%CycladeszPort41% = z_inst.nt, Cyclades-Z\Port41
%CycladeszPort42% = z_inst.nt, Cyclades-Z\Port42
%CycladeszPort43% = z_inst.nt, Cyclades-Z\Port43
%CycladeszPort44% = z_inst.nt, Cyclades-Z\Port44
%CycladeszPort45% = z_inst.nt, Cyclades-Z\Port45
%CycladeszPort46% = z_inst.nt, Cyclades-Z\Port46
%CycladeszPort47% = z_inst.nt, Cyclades-Z\Port47
%CycladeszPort48% = z_inst.nt, Cyclades-Z\Port48
%CycladeszPort49% = z_inst.nt, Cyclades-Z\Port49
%CycladeszPort50% = z_inst.nt, Cyclades-Z\Port50
%CycladeszPort51% = z_inst.nt, Cyclades-Z\Port51
%CycladeszPort52% = z_inst.nt, Cyclades-Z\Port52
%CycladeszPort53% = z_inst.nt, Cyclades-Z\Port53
%CycladeszPort54% = z_inst.nt, Cyclades-Z\Port54
%CycladeszPort55% = z_inst.nt, Cyclades-Z\Port55
%CycladeszPort56% = z_inst.nt, Cyclades-Z\Port56
%CycladeszPort57% = z_inst.nt, Cyclades-Z\Port57
%CycladeszPort58% = z_inst.nt, Cyclades-Z\Port58
%CycladeszPort59% = z_inst.nt, Cyclades-Z\Port59
%CycladeszPort60% = z_inst.nt, Cyclades-Z\Port60
%CycladeszPort61% = z_inst.nt, Cyclades-Z\Port61
%CycladeszPort62% = z_inst.nt, Cyclades-Z\Port62
%CycladeszPort63% = z_inst.nt, Cyclades-Z\Port63
%CycladeszPort64% = z_inst.nt, Cyclades-Z\Port64

[ControlFlags]
ExcludeFromSelect = *

;-----------------------------------------------
; z_inst.nt section
;-----------------------------------------------

[z_inst.nt]
CopyFiles  = driver_dir
AddReg     = z_reg

[z_inst.nt.HW]
AddReg     = z_HW_reg

[z_inst.nt.Services]
AddService = cyzport, 0x00000002, z_service_inst, z_eventlog_inst

[z_inst.nt.CoInstallers]
CopyFiles  = system_dir
AddReg     = z_coinst_reg

;-----------------------------------------------

[z_reg]
HKR,,EnumPropPages32,,"MsPorts.dll,SerialPortPropPageProvider"
HKR,,EnumAdvancedDialog,,"CyzPorts.dll,CyzportAdvancedDialog"

[z_HW_reg]
HKR,,"UpperFilters",0x00010000,"serenum"

[z_service_inst]
DisplayName     = %Service_DispName%
ServiceType     = 1 	;SERVICE_KERNEL_DRIVER
StartType       = 3 	;SERVICE_DEMAND_START
ErrorControl    = 1 	;SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\cyzport.sys
LoadOrderGroup  = ExtendedBase

[z_eventlog_inst]
AddReg = z_eventlog_reg

[z_eventlog_reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\cyzport.sys"
HKR,, TypesSupported,  0x00010001, 7

[z_coinst_reg]
HKR,,CoInstallers32,0x00010000,"cyzports.dll,CyzportCoInstaller"

[driver_dir]
cyzport.sys

[system_dir]
cyzports.dll


;-----------------------------------------------
; Strings section
;-----------------------------------------------

[Strings]
Cyclades   = "Cyclades Corporation"

CycladeszPort1 =  "Cyclades-Z Port  1"
CycladeszPort2 =  "Cyclades-Z Port  2"
CycladeszPort3 =  "Cyclades-Z Port  3"
CycladeszPort4 =  "Cyclades-Z Port  4"
CycladeszPort5 =  "Cyclades-Z Port  5"
CycladeszPort6 =  "Cyclades-Z Port  6"
CycladeszPort7 =  "Cyclades-Z Port  7"
CycladeszPort8 =  "Cyclades-Z Port  8"
CycladeszPort9 =  "Cyclades-Z Port  9"
CycladeszPort10 = "Cyclades-Z Port 10"
CycladeszPort11 = "Cyclades-Z Port 11"
CycladeszPort12 = "Cyclades-Z Port 12"
CycladeszPort13 = "Cyclades-Z Port 13"
CycladeszPort14 = "Cyclades-Z Port 14"
CycladeszPort15 = "Cyclades-Z Port 15"
CycladeszPort16 = "Cyclades-Z Port 16"
CycladeszPort17 = "Cyclades-Z Port 17"
CycladeszPort18 = "Cyclades-Z Port 18"
CycladeszPort19 = "Cyclades-Z Port 19"
CycladeszPort20 = "Cyclades-Z Port 20"
CycladeszPort21 = "Cyclades-Z Port 21"
CycladeszPort22 = "Cyclades-Z Port 22"
CycladeszPort23 = "Cyclades-Z Port 23"
CycladeszPort24 = "Cyclades-Z Port 24"
CycladeszPort25 = "Cyclades-Z Port 25"
CycladeszPort26 = "Cyclades-Z Port 26"
CycladeszPort27 = "Cyclades-Z Port 27"
CycladeszPort28 = "Cyclades-Z Port 28"
CycladeszPort29 = "Cyclades-Z Port 29"
CycladeszPort30 = "Cyclades-Z Port 30"
CycladeszPort31 = "Cyclades-Z Port 31"
CycladeszPort32 = "Cyclades-Z Port 32"
CycladeszPort33 = "Cyclades-Z Port 33"
CycladeszPort34 = "Cyclades-Z Port 34"
CycladeszPort35 = "Cyclades-Z Port 35"
CycladeszPort36 = "Cyclades-Z Port 36"
CycladeszPort37 = "Cyclades-Z Port 37"
CycladeszPort38 = "Cyclades-Z Port 38"
CycladeszPort39 = "Cyclades-Z Port 39"
CycladeszPort40 = "Cyclades-Z Port 40"
CycladeszPort41 = "Cyclades-Z Port 41"
CycladeszPort42 = "Cyclades-Z Port 42"
CycladeszPort43 = "Cyclades-Z Port 43"
CycladeszPort44 = "Cyclades-Z Port 44"
CycladeszPort45 = "Cyclades-Z Port 45"
CycladeszPort46 = "Cyclades-Z Port 46"
CycladeszPort47 = "Cyclades-Z Port 47"
CycladeszPort48 = "Cyclades-Z Port 48"
CycladeszPort49 = "Cyclades-Z Port 49"
CycladeszPort50 = "Cyclades-Z Port 50"
CycladeszPort51 = "Cyclades-Z Port 51"
CycladeszPort52 = "Cyclades-Z Port 52"
CycladeszPort53 = "Cyclades-Z Port 53"
CycladeszPort54 = "Cyclades-Z Port 54"
CycladeszPort55 = "Cyclades-Z Port 55"
CycladeszPort56 = "Cyclades-Z Port 56"
CycladeszPort57 = "Cyclades-Z Port 57"
CycladeszPort58 = "Cyclades-Z Port 58"
CycladeszPort59 = "Cyclades-Z Port 59"
CycladeszPort60 = "Cyclades-Z Port 60"
CycladeszPort61 = "Cyclades-Z Port 61"
CycladeszPort62 = "Cyclades-Z Port 62"
CycladeszPort63 = "Cyclades-Z Port 63"
CycladeszPort64 = "Cyclades-Z Port 64"

Service_DispName = "Cyclades-Z Port Driver"

