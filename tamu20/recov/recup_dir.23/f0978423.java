; NETRTSNT.INF
;
; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %Msft%
LayoutFile  = layout.inf
DriverVer=10/01/2002,5.398.613.2003

[Manufacturer]
%Realtek%   = Realtek, NTamd64
%ATI%       = ATI, NTamd64
%D-Link%    = D-Link, NTamd64  
%SURECOM%   = SURECOM, NTamd64   
%ACCTON%    = ACCTON, NTamd64
%COMPAQ%    = COMPAQ, NTamd64
%SMC%       = SMC, NTamd64
%ACER%      = ACER, NTamd64
%OVISLINK%  = OVISLINK, NTamd64
%RUBYTECH%  = RUBYTECH, NTamd64
%KATRON%    = KATRON, NTamd64
%MELCO%     = MELCO, NTamd64
%EDIMAX%    = EDIMAX, NTamd64
%KYE%       = KYE, NTamd64
%IODATA%    = IODATA, NTamd64
%V_ATK%     = V_ATK, NTamd64
%HP%        = HP, NTamd64

[ControlFlags]
ExcludeFromSelect     = *

[Realtek.NTamd64]
%Generic.DeviceDesc%  = RTL8139.ndi, PCI\VEN_10EC&DEV_8139
%Generic.DeviceDesc%  = RTL8139.ndi, PCI\VEN_1186&DEV_1300
%Generic.DeviceDesc%  = RTL8139.ndi, PCI\VEN_1113&DEV_1211
%Generic.DeviceDesc%  = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_0020103C
%Realtek.DeviceDesc%  = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_813910EC
%Realtek.DeviceDesc%  = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_81391436

[ATI.NTamd64]
%AT2500.DeviceDesc%   = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_25001259

[D-Link.NTamd64]  
%DLKRTS_A.DeviceDesc% = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_13001186
%DLKRTS_B.DeviceDesc% = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_13011186

[SURECOM.NTamd64]
%EP320X.DeviceDesc%   = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_032010BD

[ACCTON.NTamd64]  
%EN1207D.DeviceDesc%  =	RTL8139.ndi, PCI\VEN_1113&DEV_1211&SUBSYS_92111113

[SMC.NTamd64]
%EN1207DM.DeviceDesc% = RTL8139.ndi, PCI\VEN_1113&DEV_1211&SUBSYS_12111113

[ACER.NTamd64]  
%ALN330.DeviceDesc%  =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_89251025
%ALN325.DeviceDesc%  =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_89211025

[COMPAQ.NTamd64]
%COMPAQ.DeviceDesc%  = RTL8139.ndi, PCI\VEN_021b&DEV_8139
%COMPAQ.DeviceDesc%  = RTL8139.ndi, PCI\VEN_021b&DEV_8138
%COMPAQ.DeviceDesc%  = RTL8139.ndi, PCI\VEN_021b&DEV_8139&SUBSYS_020014cb
%COMPAQ.DeviceDesc%  = RTL8139.ndi, PCI\VEN_021b&DEV_8138&SUBSYS_020014cb

[OVISLINK.NTamd64]
%LFE8139A.DeviceDesc% =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_139A149C

[RUBYTECH.NTamd64]
%FE1439.DeviceDesc%   =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_1439146C

[KATRON.NTamd64]
%KF2302.DeviceDesc%   =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_71008E2E
%KF2303.DeviceDesc%   =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_72008E2E

[MELCO.NTamd64]
%MELCO.DeviceDesc%    = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_03101154

[EDIMAX.NTamd64]  
%EN9130TX.DeviceDesc% =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_91301432

[KYE.NTamd64]
%GF100TX3.DeviceDesc% =	RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_60021489

[IODATA.NTamd64]
%et100pcir.DeviceDesc%= RTL8139.ndi, PCI\VEN_1113&DEV_1211&SUBSYS_805010fc

[V_ATK.NTamd64]
%LA100Z1.DeviceDesc%  = RTL8139.ndi, PCI\VEN_10EC&DEV_8139&SUBSYS_A1081259

[HP.NTamd64]
%HP1207.devicedesc%   = RTL8139.ndi, PCI\VEN_1113&DEV_1211&SUBSYS_1207103C
%HP1207.devicedesc%   = RTL8139.ndi, PCI\VEN_1113&DEV_1211&SUBSYS_9207103C    
%HP1207.devicedesc%   = RTL8139.ndi, PCI\VEN_1113&DEV_1211&SUBSYS_A207103C                 

;-------------------------------------------------------------------------------
; RTL8139 Common
;

[RTL8139.ndi.NTX86]
AddReg          = RTL8139.speed.reg, RTL8139.reg
Characteristics = 0x84
BusType         = 5
CopyFiles       = RTL8139.CopyFiles.NTX86

[RTL8139.ndi.NTX86.Services]
AddService = rtl8139, 2, rtsnt_NTX86.Service, RTL8139.EventLog

[RTL8139.ndi.NTAMD64]
AddReg          = RTL8139.speed.reg, RTL8139.reg
Characteristics = 0x84
BusType         = 5
CopyFiles       = RTL8139.CopyFiles.NTAMD64

[RTL8139.ndi.NTAMD64.Services]
AddService = rtl8139, 2, rtsnt_NTAMD64.Service, RTL8139.EventLog

[RTL8139.CopyFiles.NTX86]
RTL8139.sys,,,2

[RTL8139.CopyFiles.NTAMD64]
RTL39A64.sys,,,2


;-------------------------------------------------------------------------------
; RTL8139 Parameters
; 
[RTL8139.speed.reg]
HKR, Ndi\params\DuplexMode,        ParamDesc,  0, %DuplexMode% 
HKR, Ndi\params\DuplexMode,        type,       0, "enum"
HKR, Ndi\params\DuplexMode,        default,    0, "1"
HKR, Ndi\params\DuplexMode\enum,   1,          0, %dmAutoMode% 
HKR, Ndi\params\DuplexMode\enum,   2,          0, %dm10HalfMode% 
HKR, Ndi\params\DuplexMode\enum,   3,          0, %dm10FullMode% 
HKR, Ndi\params\DuplexMode\enum,   4,          0, %dm100HalfMode%
HKR, Ndi\params\DuplexMode\enum,   5,          0, %dm100FullMode%

HKR, NDI\params\networkaddress,    ParamDesc,  0, %networkaddress%
HKR, NDI\params\networkaddress,    type,       0, "edit"
HKR, NDI\params\networkaddress,    LimitText,  0, "12"
HKR, NDI\params\networkaddress,    UpperCase,  0, "1"
HKR, NDI\params\networkaddress,    default,    0, " "
HKR, NDI\params\networkaddress,    optional,   0, "1"

HKR,Ndi\params\RxBufLen,           ParamDesc,  0, %ReceiveBufferSize%
HKR,Ndi\params\RxBufLen,           type,       0, "enum"
HKR,Ndi\params\RxBufLen,           default,    0, "3"
HKR,Ndi\params\RxBufLen\enum,      "0",        0, "8K bytes"
HKR,Ndi\params\RxBufLen\enum,      "1",        0, "16K bytes"
HKR,Ndi\params\RxBufLen\enum,      "2",        0, "32K bytes"
HKR,Ndi\params\RxBufLen\enum,      "3",        0, "64K bytes"

HKR,,WakeUpFrame,,"0"
HKR,,PME,,"1"
HKR,,EnableLDPS,,"0"

;-------------------------------------------------------------------------------
; RTL8139 Common
; 
[RTL8139.reg]
HKR, Ndi\Interfaces,            UpperRange, 0, "ndis5"
HKR, Ndi\Interfaces,            LowerRange, 0, "ethernet"
HKR, Ndi,                       Service,    0, "RTL8139"

[rtsnt_NTX86.Service]
DisplayName     = %RTL8139.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\RTL8139.SYS
LoadOrderGroup  = NDIS

[rtsnt_NTAMD64.Service]
DisplayName     = %RTL8139.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\RTL39A64.SYS
LoadOrderGroup  = NDIS

[RTL8139.EventLog]
Addreg = RTL8139.AddEventLog.reg

[RTL8139.AddEventLog.reg]
HKR,    ,   EventMessageFile,   0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR,    ,   TypesSupported,     0x00010001, 7

[DestinationDirs]
DefaultDestDir    = 12
RTL8139.CopyFiles = 12

[Strings]
Msft                      = "Microsoft"
Realtek                   = "Realtek"
ATI                       = "Allied Telesyn"
COMPAQ                    = "Compaq"
D-Link                    = "D-Link"  
SURECOM                   = "SURECOM"
ACCTON	                  = "ACCTON"
MELCO                     = "MELCO"
SMC	                  = "SMC"
HP                        = "Hewlett Packard"
ACER                      = "ACER"
OVISLINK                  = "OVISLINK"
RUBYTECH                  = "RUBYTECH"
KATRON                    = "KATRON"
EDIMAX			  = "EDIMAX"
KYE                       = "Genius"
IODATA                    = "I-O DATA DEVICE,INC."
V_ATK                     = "Allied Telesis"

DuplexMode                = "Link Speed/Duplex Mode"
Enable			  = "Enable"
Disable			  = "Disable"
;dmDefault                = "Default"
dmAutoMode                = "Auto Mode"
dm10HalfMode              = "10 Half Mode"
dm10FullMode              = "10 Full Mode"
dm100HalfMode             = "100 Half Mode"
dm100FullMode             = "100 Full Mode"
NetworkAddress            = "Network Address"
ReceiveBufferSize         = "Receive Buffer Size"

Generic.DeviceDesc        = "Realtek RTL8139 Family PCI Fast Ethernet NIC"
Realtek.DeviceDesc        = "Realtek RTL8139 Family PCI Fast Ethernet NIC"
AT2500.DeviceDesc         = "ATI AT-2500TX PCI Fast Ethernet Adapter"
COMPAQ.DeviceDesc         = "Compaq 10/100 Ethernet PC Card"
DLKRTS_A.DeviceDesc       = "D-Link DFE-538TX 10/100 Adapter"
DLKRTS_B.DeviceDesc       = "D-Link DFE-530TX+ PCI Adapter"
EP320X.DeviceDesc         = "SURECOM EP-320X-R 100/10/M PCI Adapter"
EN1207D.DeviceDesc        = "Accton EN1207D-TX PCI Fast Ethernet Adapter"
EN1207DM.DeviceDesc	  = "SMC EZ Card 10/100 PCI (SMC1211TX)"
ALN325.DeviceDesc	  = "AcerLAN ALN-325 10/100M Ethernet Adapter"
ALN330.DeviceDesc         = "Acer ALN-330 10/100 PCI Fast Ethernet Adapter"
LFE8139A.DeviceDesc       = "OvisLink LFE-8139ATX Fast Ethernet Adapter"
FE1439.DeviceDesc         = "RubyTech/Danpex FE-1439TX PCI 10/100 Ethernet Adapter"
KF2302.DeviceDesc         = "KTI KF-230TX/2 10/100 Base-TX Fast Ethernet Adapter"
KF2303.DeviceDesc         = "KTI KF-230TX/3 10/100 Base-TX Fast Ethernet Adapter"
EN9130TX.DeviceDesc       = "Edimax EN-9130TX(A/L) PCI Fast Ethernet Adapter"
GF100TX3.DeviceDesc       = "Genius LAN GF100TXRIII Fast Ethernet Adapter"
et100pcir.DeviceDesc      = "I-O DATA ET100-PCI-R Fast Ethernet Adapter"
LA100Z1.DeviceDesc        = "Allied Telesis LA100-PCI-T Z1 LAN Adapter"
Melco.DeviceDesc          = "MELCO LCI3-TXI Fast Ethernet Adapter"
HP1207.devicedesc         = "HP EN1207D-TX PCI 10/100 Fast Ethernet Adapter"

RTL8139.Service.DispName  = "Realtek RTL8139(A/B/C)-based PCI Fast Ethernet Adapter NT Driver"


