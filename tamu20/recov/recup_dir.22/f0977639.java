; Copyright (c) 2005, Microsoft
;
; Broadcom Gig INF for 64-bit Amd platform (Net server 2003).


[Version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %Msft%
LayoutFile  = Layout.inf
DriverVer=10/01/2002,7.98.0.0


[Manufacturer]
%BRCM% = Broadcom, NTamd64


[ControlFlags]
ExcludeFromSelect = *

[Broadcom.NTamd64]
%OEM1_DEV5% = OEM1_DEV5.XpInst,      PCI\VEN_14e4&DEV_165D&SUBSYS_865d1028
%OEM1_DEV5% = OEM1_DEV5.XpInst,      PCI\VEN_14e4&DEV_165D&SUBSYS_20031028
%OEM1_DEV6% = OEM1_DEV6.XpInst,      PCI\VEN_14e4&DEV_1653&SUBSYS_86531028
%BCM5701%   = BCM5701.XpInst,        PCI\VEN_14e4&DEV_1645
%BCM5702%   = BCM5702.XpInst,        PCI\VEN_14e4&DEV_1646
%BCM5702%   = BCM5702.XpInst,        PCI\VEN_14e4&DEV_16a6
%BCM5702%   = BCM5702.XpInst,        PCI\VEN_14e4&DEV_16C6
%BCM5702FE% = BCM5702FE.XpInst,      PCI\VEN_14e4&DEV_164d
%BCM5703%   = BCM5703.XpInst,        PCI\VEN_14e4&DEV_16a7
%BCM5703%   = BCM5703.XpInst,        PCI\VEN_14e4&DEV_1647
%BCM5703%   = BCM5703.XpInst,        PCI\VEN_14e4&DEV_16C7
%BCM5704%   = BCM5704.XpInst,        PCI\VEN_14e4&DEV_1648
%BCM5705%   = BCM5705.XpInst,        PCI\VEN_14e4&DEV_1653
%BCM5705M%  = BCM5705M.XpInst,       PCI\VEN_14e4&DEV_165D
%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654
%BCM5705M%  = BCM5705MA2.XpInst,     PCI\VEN_14e4&DEV_165E
%BCM5901%   = BCM5901.XpInst,        PCI\VEN_14e4&DEV_170D

%BCM5901%   = BCM5901.XpInst,        PCI\VEN_14e4&DEV_170E
%BCM5782%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1696
%BCM5788%   = BCM5788.XpInst,          PCI\VEN_14e4&DEV_169c
%BCM5705F%  = BCM5705F.XpInst,       PCI\VEN_14e4&DEV_166e

%BCM5705M%  = BCM5705MA2.XpInst,     PCI\VEN_14e4&DEV_165E&SUBSYS_05721014
%BCM5705M%  = BCM5705MA2.XpInst,     PCI\VEN_14e4&DEV_165E&SUBSYS_0727152d
%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654&SUBSYS_02D81014
%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654&SUBSYS_02D91014
%BCM5705M%  = BCM5705MA2F2.XpInst,   PCI\VEN_14e4&DEV_165E&SUBSYS_127910cf
%BCM5705M%  = BCM5705MA2F2.XpInst,   PCI\VEN_14e4&DEV_1654&SUBSYS_12f810cf

%BCM5705M%  = BCM5705MA2F2.XpInst,   PCI\VEN_14e4&DEV_1654&SUBSYS_82581033
%BCM5705M%  = BCM5705MA2F2.XpInst,   PCI\VEN_14e4&DEV_1654&SUBSYS_825c1033
%BCM5701FA% = BCM5701FA.XpInst,      PCI\VEN_14e4&DEV_1645&SUBSYS_000714e4
%BCM5703S%  = BCM5703S.XpInst,       PCI\VEN_14e4&DEV_16a7&SUBSYS_000a14e4
%BCM5703S%  = BCM5703S.XpInst,       PCI\VEN_14e4&DEV_1647&SUBSYS_000a14e4
%BCM5703S%  = BCM5703S.XpInst,       PCI\VEN_14e4&DEV_16C7&SUBSYS_000a14e4
%BCM5703S%  = BCM5703SW.XPInst,      PCI\VEN_14e4&DEV_16A7&SUBSYS_02811014
%BCM5704S%  = BCM5704S.XpInst,       PCI\VEN_14e4&DEV_16A8
%BCM5704SW% = BCM5704SW.XpInst,      PCI\VEN_14e4&DEV_16A8&SUBSYS_029c1014
%BCM5704SW% = BCM5704SW.XpInst,      PCI\VEN_14e4&DEV_16A8&SUBSYS_02a81014
%BCM5704SW% = BCM5704SW.XpInst,      PCI\VEN_14e4&DEV_16A8&SUBSYS_02e81014
%BCM5704SW% = BCM5704SW.XpInst,      PCI\VEN_14e4&DEV_16A8&SUBSYS_02e91014

%3C996SX%   = 3C996SX.XpInst,        PCI\VEN_14e4&DEV_1645&SUBSYS_100410B7
%3C996BT%   = 3C996BT.XpInst,        PCI\VEN_14e4&DEV_1645&SUBSYS_100610B7
%3C1000T%   = 3C1000T.XpInst,        PCI\VEN_14e4&DEV_1645&SUBSYS_100710B7
%3C940BR01% = 3C940BR01.XpInst,      PCI\VEN_14e4&DEV_1645&SUBSYS_100810B7
%3C998T%    = 3C998T.XpInst,         PCI\VEN_14e4&DEV_1648&SUBSYS_200010B7
%3C998SX%   = 3C998SX.XpInst,        PCI\VEN_14e4&DEV_16A8&SUBSYS_200110B7
%3C999T%    = 3C999T.XpInst,         PCI\VEN_14e4&DEV_1648&SUBSYS_300010B7
%3C1000BT%  = 3C1000BT.XpInst,       PCI\VEN_14e4&DEV_16A6&SUBSYS_110010B7
%3C1000BT%  = 3C1000BT.XpInst,       PCI\VEN_14e4&DEV_16C6&SUBSYS_110010B7

%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654&SUBSYS_02b51014
%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654&SUBSYS_02b61014
%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654&SUBSYS_02D81014
%BCM5705%   = BCM5705A2.XpInst,      PCI\VEN_14e4&DEV_1654&SUBSYS_02D91014

%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_105D1734
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1659&SUBSYS_10611734
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_267610f1


%OEM1_DEV4% = OEM1_DEV4.XpInst,      PCI\VEN_14e4&DEV_16A6&SUBSYS_81261028
%OEM1_DEV4% = OEM1_DEV4.XpInst,      PCI\VEN_14e4&DEV_165e&SUBSYS_01711028
%OEM1_DEV4% = OEM1_DEV4.XpInst,      PCI\VEN_14e4&DEV_165e&SUBSYS_015a1028
%OEM1_DEV4% = OEM1_DEV4.XpInst,      PCI\VEN_14e4&DEV_165e&SUBSYS_017c1028

%BCM5750A1DDT%   = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_01751028
%BCM5750A1DDT%   = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_01761028
%BCM5750A1DDT%   = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_01771028
%BCM5750A1DDT%   = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_01781028
%BCM5750A1DDT%   = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_01791028

%BCM5750A1DSF%     = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_01801028
%BCM5750A1DSSF%   = BCM5750A1DE.XpInst,   PCI\VEN_14e4&DEV_1659&SUBSYS_01851028

%BCM5705M%  = BCM5705MA2.XpInst,     PCI\VEN_14e4&DEV_165E&SUBSYS_05721014
%BCM5750A1% = BCM5750A1.XpInst,       PCI\VEN_14e4&DEV_1659&SUBSYS_02c61014

%BCM5901%   = BCM5901.XpInst,        PCI\VEN_14e4&DEV_170D&SUBSYS_05451014
%BCM5901%   = BCM5901.XpInst,        PCI\VEN_14e4&DEV_170E&SUBSYS_05451014

%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_3001103c
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_3005103c
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_3006103c
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_3007103c
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_3008103c
%BCM5750A1%   = BCM5750A1.XpInst,   PCI\VEN_14e4&DEV_1677&SUBSYS_12f2103c


;*******************************************************************************
; 64-bit Windows XP Install sections.
;*******************************************************************************

[BCM5701.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5701.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5701.Xp64AddService, Xp64EventLog

[BCM5701.Xp64AddService]
DisplayName    = %BCM5701%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5702.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5702.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5702.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5702.Xp64AddService, Xp64EventLog

[BCM5702.Xp64AddService]
DisplayName    = %BCM5702%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5702FE.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5702.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5702FE.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5702FE.Xp64AddService, Xp64EventLog

[BCM5702FE.Xp64AddService]
DisplayName    = %BCM5702FE%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5703.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5703.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5703.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5703.Xp64AddService, Xp64EventLog

[BCM5703.Xp64AddService]
DisplayName    = %BCM5703%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5704.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.WolS
AddReg          = Xp64AddReg, BCM5704.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOLNS, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5704.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5704.Xp64AddService, Xp64EventLog

[BCM5704.Xp64AddService]
DisplayName    = %BCM5704%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[BCM5705.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5705.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5705.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5705.Xp64AddService, Xp64EventLog

[BCM5705.Xp64AddService]
DisplayName    = %BCM5705%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5705MA2F2.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo, DelReg.WireSpeed
AddReg          = Xp64AddReg, BCM5705MA2.Params, ParamsNt, ParamsNT8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd, ParamsLogOptions
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5705MA2F2.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5705MA2F2.Xp64AddService, Xp64EventLog

[BCM5705MA2F2.Xp64AddService]
DisplayName    = %BCM5705M%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5705M.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5705M.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5705M.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5705M.Xp64AddService, Xp64EventLog

[BCM5705M.Xp64AddService]
DisplayName    = %BCM5705M%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[BCM5705A2.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo, DelReg.WireSpeed
AddReg          = Xp64AddReg, BCM5705A2.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5705A2.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5705A2.Xp64AddService, Xp64EventLog

[BCM5705A2.Xp64AddService]
DisplayName    = %BCM5705%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[BCM5705F.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo, DelReg.WireSpeed
AddReg          = Xp64AddReg, BCM5705F.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5705F.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5705F.Xp64AddService, Xp64EventLog

[BCM5705F.Xp64AddService]
DisplayName    = %BCM5705F%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[BCM5705MA2.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo, DelReg.WireSpeed
AddReg          = Xp64AddReg, BCM5705MA2.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5705MA2.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5705MA2.Xp64AddService, Xp64EventLog

[BCM5705MA2.Xp64AddService]
DisplayName    = %BCM5705M%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[BCM5901.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5901.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5901.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5901.Xp64AddService, Xp64EventLog

[BCM5901.Xp64AddService]
DisplayName    = %BCM5901%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5788.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5788.Params, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOL 
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5788.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5788.Xp64AddService, Xp64EventLog

[BCM5788.Xp64AddService]
DisplayName    = %BCM5788%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5701FA.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.RequestedMediaType, DelReg.Wol
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5701FA.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5701FA.Xp64AddService, Xp64EventLog

[BCM5701FA.Xp64AddService]
DisplayName    = %BCM5701FA%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5703S.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.RequestedMediaType, DelReg.Wol
AddReg          = Xp64AddReg, BCM5703.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5703S.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5703S.Xp64AddService, Xp64EventLog

[BCM5703S.Xp64AddService]
DisplayName    = %BCM5703S%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[BCM5703SW.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.RequestedMediaType, DelReg.Wol
AddReg          = Xp64AddReg, BCM5703.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsLgSnd, ParamsWOLTbi
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5703SW.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5703S.Xp64AddService, Xp64EventLog


[BCM5704S.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.RequestedMediaType, DelReg.Wol
AddReg          = Xp64AddReg, BCM5704.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5704S.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5704S.Xp64AddService, Xp64EventLog

[BCM5704S.Xp64AddService]
DisplayName    = %BCM5704S%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5704SW.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.RequestedMediaType, DelReg.Wol, DelReg.WireSpeed
AddReg          = Xp64AddReg, BCM5704.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsWOLTbi
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5704SW.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5704SW.Xp64AddService, Xp64EventLog

[BCM5704SW.Xp64AddService]
DisplayName    = %BCM5704SW%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[3C996SX.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.RequestedMediaType, DelReg.Wol
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsLgSnd
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C996SX.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C996SX.Xp64AddService, Xp64EventLog

[3C996SX.Xp64AddService]
DisplayName    = %3C996SX%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[3C996BT.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C996BT.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C996BT.Xp64AddService, Xp64EventLog

[3C996BT.Xp64AddService]
DisplayName    = %3C996BT%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[3C1000T.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C1000T.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C1000T.Xp64AddService, Xp64EventLog

[3C1000T.Xp64AddService]
DisplayName    = %3C1000T%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[3C940BR01.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C940BR01.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C940BR01.Xp64AddService, Xp64EventLog

[3C940BR01.Xp64AddService]
DisplayName    = %3C940BR01%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[3C998T.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNT8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C998T.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C998T.Xp64AddService, Xp64EventLog

[3C998T.Xp64AddService]
DisplayName    = %3C998T%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[3C998SX.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNT8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C998SX.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C998SX.Xp64AddService, Xp64EventLog

[3C998SX.Xp64AddService]
DisplayName    = %3C998SX%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[3C999T.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5701.Params, ParamsNt, ParamsNT8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C999T.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C999T.Xp64AddService, Xp64EventLog

[3C999T.Xp64AddService]
DisplayName    = %3C999T%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS

[3C1000BT.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5702.Params, ParamsNt, ParamsNt8021p, ParamsNtW9x, ParamsJumbo, ParamsC, ParamsWOL, ParamsLgSnd, ParamsWireSpeed
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[3C1000BT.XpInst.NTamd64.Services]
AddService = b57nd, 2, 3C1000BT.Xp64AddService, Xp64EventLog

[3C1000BT.Xp64AddService]
DisplayName    = %3C1000BT%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[OEM1_DEV4.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Xp64AddReg, BCM5702.Params, ParamsNt8021p, ParamsNtW9xDE,  ParamsC, ParamsWOLNS, DE.Params
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[OEM1_DEV4.XpInst.NTamd64.Services]
AddService = b57nd, 2, OEM1_DEV4.Xp64AddService, Xp64EventLog

[OEM1_DEV4.Xp64AddService]
DisplayName    = %OEM1_DEV4%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5750A1DE.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5750.Params, ParamsNT8021p, ParamsNtW9xDE, ParamsC, ParamsWOLNS, DE.Params
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5750A1DE.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5750A1DE.Xp64AddService, Xp64EventLog

[BCM5750A1DE.Xp64AddService]
DisplayName    = %BCM5750A1DDT%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS



[OEM1_DEV5.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5705M.Params, ParamsNt, ParamsNt8021p, ParamsNtW9xDE, ParamsC, ParamsWOLNS, DE.Params
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[OEM1_DEV5.XpInst.NTamd64.Services]
AddService = b57nd, 2, OEM1_DEV5.Xp64AddService, Xp64EventLog

[OEM1_DEV5.Xp64AddService]
DisplayName    = %BCM5705M%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[OEM1_DEV6.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5705M.Params, ParamsNt, ParamsNt8021p, ParamsNtW9xDE, ParamsC, ParamsWOLNS, DE.Params
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[OEM1_DEV6.XpInst.NTamd64.Services]
AddService = b57nd, 2, OEM1_DEV6.Xp64AddService, Xp64EventLog

[OEM1_DEV6.Xp64AddService]
DisplayName    = %BCM5705M%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS


[BCM5750A1.XpInst.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
DelReg          = DelReg.Jumbo
AddReg          = Xp64AddReg, BCM5750.Params, ParamsNt8021p, ParamsNtW9x, ParamsC, ParamsWOLShastaFull
CopyFiles       = CopyFile.XpSys64
BusType         = 5

[BCM5750A1.XpInst.NTamd64.Services]
AddService = b57nd, 2, BCM5750A1.Xp64AddService, Xp64EventLog

[BCM5750A1.Xp64AddService]
DisplayName    = %BCM5750A1%
ServiceType    = 1 
StartType      = 3
ErrorControl   = 1
ServiceBinary  = %12%\b57amd64.sys
LoadOrderGroup = NDIS



;*******************************************************************************
; 64-bit Windows Xp common sections.
;*******************************************************************************

[Xp64AddReg]
HKR, Ndi,            Service,    0, "b57nd"
HKR, Ndi\Interfaces, UpperRange, 0, "ndis5"
HKR, Ndi\Interfaces, LowerRange, 0, "ethernet"

[Xp64EventLog]
AddReg = Xp64AddEventLogReg

[Xp64AddEventLogReg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll;%%SystemRoot%%\System32\drivers\b57amd64.sys"
HKR, , TypesSupported  , 0x00010001, 7



;*******************************************************************************
; Registry parameters.
;*******************************************************************************

[BCM5701.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"


[BCM5702.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"


[BCM5703.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5704.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5705.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5705M.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5705A2.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5705F.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5705MA2.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"

[BCM5788.Params]
HKR, ,                                    TxPacketDescCnt,          0, "200"
HKR, ,                                    RxStdDescCnt,             0, "200"
HKR, ,                                    RxCoalescingTicks,        0, "10"
HKR, ,                                    TxCoalescingTicks,        0, "30"
HKR, ,                                    RxMaxCoalescedFrames,     0, "5"
HKR, ,                                    TxMaxCoalescedFrames,     0, "200"

[BCM5901.Params]
HKR, ,                                    TxPacketDescCnt,           0, "200"
HKR, ,                                    RxStdDescCnt,              0, "200"
HKR, ,                                    RxCoalescingTicks,         0, "10"
HKR, ,                                    TxCoalescingTicks,         0, "30"
HKR, ,                                    RxMaxCoalescedFrames,      0, "5"
HKR, ,                                    TxMaxCoalescedFrames,      0, "200"


[BCM5750.Params]
HKR, , TxPacketDescCnt,          0, "200"
HKR, , RxStdDescCnt,             0, "200"
HKR, , RxCoalescingTicks,        0, "10"
HKR, , TxCoalescingTicks,        0, "30"
HKR, , RxMaxCoalescedFrames,     0, "5"
HKR, , TxMaxCoalescedFrames,     0, "200"


[DE.Params]
HKR, , TaskOffloadCap,           0, "21"
HKR, , RxMtu,                    0, "1500"
HKR, , WolSpeed,                  0, "0"
HKR, , WireSpeed,                0, "1"


[ParamsNt]
HKR, Ndi\Params\TaskOffloadCap,           ParamDesc,                  , %TaskOffload%
HKR, Ndi\Params\TaskOffloadCap,           default,                    , "63"
HKR, Ndi\Params\TaskOffloadCap,           type,                       , "enum"
HKR, Ndi\Params\TaskOffloadCap\enum,      0,                          , %TaskOffload_None%
HKR, Ndi\Params\TaskOffloadCap\enum,      42,                         , %TaskOffload_Rx_Chksum%
HKR, Ndi\Params\TaskOffloadCap\enum,      21,                         , %TaskOffload_Tx_Chksum%
HKR, Ndi\Params\TaskOffloadCap\enum,      63,                         , %TaskOffload_Rx_Tx_Chksum%

[ParamsNt8021p]
HKR, Ndi\Params\Enable8021p,              ParamDesc,                  , %QOS_8021p%
HKR, Ndi\Params\Enable8021p,              default,                    , "0"
HKR, Ndi\Params\Enable8021p,              type,                       , "enum"
HKR, Ndi\Params\Enable8021p\enum,         0,                          , %QOS_8021p_Disable%
HKR, Ndi\Params\Enable8021p\enum,         1,                          , %QOS_8021p_Enable%


[ParamsNtW9x]
HKR, Ndi\Params\FlowControlCap,           ParamDesc,                  , %FlowControl%
HKR, Ndi\Params\FlowControlCap,           default,                    , "2147483648"
HKR, Ndi\Params\FlowControlCap,           type,                       , "enum"
HKR, Ndi\Params\FlowControlCap\enum,      0,                          , %FlowControl_Disable%
HKR, Ndi\Params\FlowControlCap\enum,      1,                          , %FlowControl_Rx_Pause%
HKR, Ndi\Params\FlowControlCap\enum,      2,                          , %FlowControl_Tx_Pause%
HKR, Ndi\Params\FlowControlCap\enum,      3,                          , %FlowControl_Rx_Tx_Pause%
HKR, Ndi\Params\FlowControlCap\enum,      2147483648,                 , %FlowControl_Auto%

HKR, Ndi\params\NetworkAddress,           ParamDesc,                 0, %NetworkAddress%
HKR, Ndi\params\NetworkAddress,           Default,                   0, ""
HKR, Ndi\params\NetworkAddress,           type,                      0, "edit"
HKR, NDI\params\NetworkAddress,           LimitText,                 0, "12"
HKR, NDI\params\NetworkAddress,           UpperCase,                 0, "1"
HKR, NDI\params\NetworkAddress,           optional,                  0, "1"

[ParamsNtW9xDE]
HKR, Ndi\Params\FlowControlCap,           ParamDesc,                  , %FlowControl%
HKR, Ndi\Params\FlowControlCap,           default,                    , "2147483648"
HKR, Ndi\Params\FlowControlCap,           type,                       , "enum"
HKR, Ndi\Params\FlowControlCap\enum,      0,                          , %FlowControl_Disable%
HKR, Ndi\Params\FlowControlCap\enum,      1,                          , %FlowControl_Rx_Pause%
HKR, Ndi\Params\FlowControlCap\enum,      2,                          , %FlowControl_Tx_Pause%
HKR, Ndi\Params\FlowControlCap\enum,      3,                          , %FlowControl_Rx_Tx_Pause%
HKR, Ndi\Params\FlowControlCap\enum,      2147483648,                 , %FlowControl_Auto%


[ParamsJumbo]
HKR, Ndi\Params\RxMtu,                    ParamDesc,                 , %JumboMtu%
HKR, Ndi\Params\RxMtu,                    default,                   , "1500"
HKR, Ndi\Params\RxMtu,                    type,                      , "dword"
HKR, Ndi\Params\RxMtu,                    min,                       , "1500"
HKR, Ndi\Params\RxMtu,                    max,                       , "9000"
HKR, Ndi\Params\RxMtu,                    step,                      , "500"
HKR, Ndi\Params\RxMtu,                    base,                      , "10"

[ParamsWireSpeed]
HKR, Ndi\Params\WireSpeed,                ParamDesc,                 , %WireSpeed%
HKR, Ndi\Params\WireSpeed,                default,                   , "1"
HKR, Ndi\Params\WireSpeed,                type,                      , "enum"
HKR, Ndi\Params\WireSpeed\enum,           0,                         , %WireSpeed_Disable%
HKR, Ndi\Params\WireSpeed\enum,           1,                         , %WireSpeed_Enable%

[ParamsLogOptions]
HKR, Ndi\Params\LogLevelInfo,             ParamDesc,                 , %LogLevelInfo%
HKR, Ndi\Params\LogLevelInfo,             default,                   , "0"
HKR, Ndi\Params\LogLevelInfo,             type,                      , "enum"
HKR, Ndi\Params\LogLevelInfo\enum,        0,                         , %LogLevelInfo_Disable%
HKR, Ndi\Params\LogLevelInfo\enum,        1,                         , %LogLevelInfo_Enable%
HKR, Ndi\Params\LogLevelWarn,             ParamDesc,                 , %LogLevelWarn%
HKR, Ndi\Params\LogLevelWarn,             default,                   , "0"
HKR, Ndi\Params\LogLevelWarn,             type,                      , "enum"
HKR, Ndi\Params\LogLevelWarn\enum,        0,                         , %LogLevelWarn_Disable%
HKR, Ndi\Params\LogLevelWarn\enum,        1,                         , %LogLevelWarn_Enable%

[ParamsWireSpeed]
HKR, Ndi\Params\WireSpeed,                ParamDesc,                 , %WireSpeed%
HKR, Ndi\Params\WireSpeed,                default,                   , "1"
HKR, Ndi\Params\WireSpeed,                type,                      , "enum"
HKR, Ndi\Params\WireSpeed\enum,           0,                         , %WireSpeed_Disable%
HKR, Ndi\Params\WireSpeed\enum,           1,                         , %WireSpeed_Enable%

[ParamsC]
HKR, Ndi\Params\RequestedMediaType,       ParamDesc,                 , %Speed_Duplex%
HKR, Ndi\Params\RequestedMediaType,       default,                   , "0"
HKR, Ndi\Params\RequestedMediaType,       type,                      , "enum"
HKR, Ndi\Params\RequestedMediaType\enum,  0,                         , %Speed_Duplex_Auto%
HKR, Ndi\Params\RequestedMediaType\enum,  3,                         , %Speed_Duplex_10Mb_Hd%
HKR, Ndi\Params\RequestedMediaType\enum,  4,                         , %Speed_Duplex_10Mb_Fd%
HKR, Ndi\Params\RequestedMediaType\enum,  5,                         , %Speed_Duplex_100Mb_Hd%
HKR, Ndi\Params\RequestedMediaType\enum,  6,                         , %Speed_Duplex_100Mb_Fd%

[ParamsWOL]
HKR, Ndi\Params\WakeUpModeCap,            ParamDesc,                 , %WakeUpMode%
HKR, Ndi\Params\WakeUpModeCap,            default,                   , "3"
HKR, Ndi\Params\WakeUpModeCap,            type,                      , "enum"
HKR, Ndi\Params\WakeUpModeCap\enum,       0,                         , %WakeUpMode_None%
HKR, Ndi\Params\WakeUpModeCap\enum,       1,                         , %WakeUpMode_Magic%
HKR, Ndi\Params\WakeUpModeCap\enum,       2,                         , %WakeUpMode_Pattern%
HKR, Ndi\Params\WakeUpModeCap\enum,       3,                         , %WakeUpMode_Both%

HKR, Ndi\Params\WolSpeed,                 ParamDesc,                 , %WolSpeed%
HKR, Ndi\Params\WolSpeed,                 default,                   , "0"
HKR, Ndi\Params\WolSpeed,                 type,                      , "enum"
HKR, Ndi\Params\WolSpeed\enum,            0,                         , %WolSpeed_Auto%
HKR, Ndi\Params\WolSpeed\enum,            1,                         , %WolSpeed_10mb%
HKR, Ndi\Params\WolSpeed\enum,            2,                         , %WolSpeed_100mb%


[ParamsWOLShastaFull]
HKR, Ndi\Params\WakeUpModeCap,       ParamDesc, , %WakeUpMode%
HKR, Ndi\Params\WakeUpModeCap,       default,   , "3"
HKR, Ndi\Params\WakeUpModeCap,       type,      , "enum"
HKR, Ndi\Params\WakeUpModeCap\enum,  0,         , %WakeUpMode_None%
HKR, Ndi\Params\WakeUpModeCap\enum,  1,         , %WakeUpMode_Magic%
HKR, Ndi\Params\WakeUpModeCap\enum,  2,         , %WakeUpMode_Pattern%
HKR, Ndi\Params\WakeUpModeCap\enum,  3,         , %WakeUpMode_Both%

HKR, Ndi\Params\WolSpeed,       ParamDesc, , %WolSpeed%
HKR, Ndi\Params\WolSpeed,       default,   , "0"
HKR, Ndi\Params\WolSpeed,       type,      , "enum"
HKR, Ndi\Params\WolSpeed\enum,  0,         , %WolSpeed_Auto%
HKR, Ndi\Params\WolSpeed\enum,  1,         , %WolSpeed_10mb%
HKR, Ndi\Params\WolSpeed\enum,  2,         , %WolSpeed_100mb%
;HKR, Ndi\Params\WolSpeed\enum,  3,         , %WolSpeed_1000mb%


[ParamsWOLTbi]
HKR, Ndi\Params\WakeUpModeCap,            ParamDesc,                 , %WakeUpMode%
HKR, Ndi\Params\WakeUpModeCap,            default,                   , "1"
HKR, Ndi\Params\WakeUpModeCap,            type,                      , "enum"
HKR, Ndi\Params\WakeUpModeCap\enum,       0,                         , %WakeUpMode_None%
HKR, Ndi\Params\WakeUpModeCap\enum,       1,                         , %WakeUpMode_Magic%
HKR, ,                                    TbiWol,                   0, "1"

[ParamsLgSnd]
HKR, Ndi\Params\LargeSendOffload,         ParamDesc,                 , %TaskOffload_LargeSend%
HKR, Ndi\Params\LargeSendOffload,         default,                   , "1"
HKR, Ndi\Params\LargeSendOffload,         type,                      , "enum"
HKR, Ndi\Params\LargeSendOffload\enum,    0,                         , %TaskOffload_LargeSend_Disable%
HKR, Ndi\Params\LargeSendOffload\enum,    1,                         , %TaskOffload_LargeSend_Enable%

[ParamsWOLNS]
HKR, Ndi\Params\WakeUpModeCap,            ParamDesc,                 , %WakeUpMode%
HKR, Ndi\Params\WakeUpModeCap,            default,                   , "3"
HKR, Ndi\Params\WakeUpModeCap,            type,                      , "enum"
HKR, Ndi\Params\WakeUpModeCap\enum,       0,                         , %WakeUpMode_None%
HKR, Ndi\Params\WakeUpModeCap\enum,       1,                         , %WakeUpMode_Magic%
HKR, Ndi\Params\WakeUpModeCap\enum,       2,                         , %WakeUpMode_Pattern%
HKR, Ndi\Params\WakeUpModeCap\enum,       3,                         , %WakeUpMode_Both%


;*******************************************************************************
; Keys to remove.
;*******************************************************************************

[DelReg.RequestedMediaType]
HKR, Ndi\Params\RequestedMediaType

[DelReg.Wol]
HKR, Ndi\Params\WakeUpModeCap
HKR, Ndi\Params\WolSpeed

[DelReg.WolS]
HKR, Ndi\Params\WolSpeed

[DelReg.Jumbo]
HKR, Ndi\Params\RxMtu

[DelReg.WireSpeed]
HKR, Ndi\Params\WireSpeed

;*******************************************************************************
; Destination directories
;*******************************************************************************

[DestinationDirs]
DefaultDestDir   = 12
CopyFile.XpSys64 = 12

[CopyFile.XpSys64]
b57amd64.sys,,,1


;*******************************************************************************
; Localizable strings
;*******************************************************************************

[Strings]
BRCM                          = "Broadcom"
Msft                          = "Microsoft"

BCM5700                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5701                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5702                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5702FE                     = "Broadcom NetXtreme Fast Ethernet"
BCM5703                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5704                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5705                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5705M                      = "Broadcom NetXtreme Gigabit Ethernet"
BCM5705F                      = "Broadcom 570x 10/100 Integrated Controller"
BCM5750                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5750A1                     = "Broadcom NetXtreme Gigabit Ethernet"
BCM5750A1F                    = "Broadcom NetXtreme Fast Ethernet"
BCM5750A1STSP                 = "Embedded Broadcom NetXtreme 5721 PCI-E Gigabit NIC"
BCM5750B0                     = "Broadcom NetXtreme Gigabit Ethernet"
BCM5750B0F                    = "Broadcom NetXtreme Fast Ethernet"
BCM5901                       = "Broadcom NetXtreme Fast Ethernet"
BCM5782                       = "Broadcom NetXtreme Gigabit Ethernet"
BCM5788                       = "Broadcom NetLink (TM) Gigabit Ethernet"
BCM5789                       = "Broadcom NetLink (TM) Gigabit Ethernet"
BCM5700FB                     = "Broadcom NetXtreme Gigabit Fiber"
BCM5700FA                     = "Broadcom NetXtreme Gigabit Fiber"
BCM5701FA                     = "Broadcom NetXtreme Gigabit Fiber"
BCM5703S                      = "Broadcom NetXtreme Gigabit Fiber"
BCM5703SW                     = "Broadcom NetXtreme Gigabit Ethernet"
BCM5704S                      = "Broadcom NetXtreme Gigabit Fiber"
BCM5704SW                     = "Broadcom NetXtreme Gigabit Ethernet"

BCM5750A1DSF      = "Broadcom NetXtreme 5751 Gigabit Controller"
BCM5750A1DSSF    = "Broadcom NetXtreme 5721 Gigabit Controller"
BCM5750A1DDT      = "Broadcom NetXtreme 57xx Gigabit Controller"
BCM5750A1DMOBILE =  "Broadcom NetXtreme 57xx Gigabit Controller"
BCM5750A1DE          = "Broadcom NetXtreme 57xx Gigabit Controller"

3C996T                        = "3Com 3C996 10/100/1000 Server NIC"
3C996SX                       = "3Com 3C996 Gigabit Fiber-SX Server NIC"
3C996BT                       = "3Com 3C996B Gigabit Server NIC"
3C1000T                       = "3Com 3C1000 Gigabit NIC"
3C940BR01                     = "3Com 3C940 Gigabit LOM"
3C998T                        = "3Com Dual Port 10/100/1000 PCI-X Server NIC"
3C998SX                       = "3Com Dual Port 1000-SX PCI-X Server NIC"
3C999T                        = "3Com Quad Port 10/100/1000 PCI-X Server NIC"
3C1000BT                      = "3Com 10/100/1000 PCI"

OEM1_DEV1                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM1_DEV2                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM1_DEV3                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM1_DEV4                     = "Broadcom 570x Gigabit Integrated Controller"
OEM1_DEV5                     = "Broadcom 570x Gigabit Integrated Controller"
OEM1_DEV6                     = "Broadcom NetXtreme Gigabit Ethernet"

OEM2_DEV1                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM2_DEV2                     = "Broadcom NetXtreme Fast Ethernet"
OEM2_DEV3                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM2_DEV4                     = "Broadcom NetXtreme Fast Ethernet"

OEM3_DEV1                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM3_DEV2                     = "Broadcom NetXtreme Gigabit Ethernet"
OEM3_DEV3                     = "Broadcom NetXtreme Gigabit Ethernet"


JumboMtu                      = "Jumbo Mtu"

FlowControl                   = "Flow Control"
FlowControl_Disable           = "Disable"
FlowControl_Rx_Pause          = "Rx PAUSE"
FlowControl_Tx_Pause          = "Tx PAUSE"
FlowControl_Rx_Tx_Pause       = "Rx/Tx PAUSE"
FlowControl_Auto              = "Auto"

Speed_Duplex                  = "Speed & Duplex"
Speed_Duplex_Auto             = "Auto"
Speed_Duplex_10Mb_Hd          = "10 Mb Half"
Speed_Duplex_10Mb_Fd          = "10 Mb Full"
Speed_Duplex_100Mb_Hd         = "100 Mb Half"
Speed_Duplex_100Mb_Fd         = "100 Mb Full"
Speed_Duplex_1000Mb_Fd        = "1000 Mb Full"


QOS_8021p                     = "802.1p QOS"
QOS_8021p_Disable             = "Disable"
QOS_8021p_Enable              = "Enable"

WireSpeed                     = "Ethernet@WireSpeed"
WireSpeed_Disable             = "Disable"
WireSpeed_Enable              = "Enable"

WakeOnLink                    = "Wake On Link"
WakeOnLink_Disable            = "Disable"
WakeOnLink_Enable             = "Enable"
TaskOffload                   = "Checksum Offload"
TaskOffload_None              = "None"
TaskOffload_Rx_Chksum         = "Rx TCP/IP Checksum"
TaskOffload_Tx_Chksum         = "Tx TCP/IP Checksum"
TaskOffload_Rx_Tx_Chksum      = "Tx/Rx TCP/IP Checksum"

TaskOffload_LargeSend         = "Large Send Offload"
TaskOffload_LargeSend_Disable = "Disable"
TaskOffload_LargeSend_Enable  = "Enable"

WakeUpMode                    = "Wake Up Capabilities"
WakeUpMode_None               = "None"
WakeUpMode_Magic              = "Magic Packet"
WakeUpMode_Pattern            = "Wake Up Frame"
WakeUpMode_Both               = "Both"

WolSpeed                      = "WOL Speed"
WolSpeed_Auto                 = "Auto"
WolSpeed_10mb                 = "10 Mb"
WolSpeed_100mb                = "100 Mb"
WolSpeed_1000mb               = "1000 Mb"

NetworkAddress                = "Locally Administered Address"

LogLevelInfo                  = "Log Information Messages"
LogLevelWarn                  = "Log Warning Messages"
LogLevelInfo_Disable          =  "Disable"
LogLevelInfo_Enable           =  "Enable"
LogLevelWarn_Disable          =  "Disable"
LogLevelWarn_Enable           =  "Enable"
