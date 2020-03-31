; Copyright (c) 2003, Microsoft

[version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %Msft%
LayoutFile  = layout.inf
DriverVer=10/01/2002,8.1.8.0

[Manufacturer]
%Intel%     = Intel, NTamd64
%IBM%       = IBM, NTamd64

[ControlFlags]
ExcludeFromSelect = *


[Intel.NTamd64]
; DisplayName                Section         DeviceID
; -----------                -------         --------

%E1008.DeviceDesc%              = E1008Copper.ndi, PCI\VEN_8086&DEV_1008&SUBSYS_11078086 ; XT Adapter
%E1008.DeviceDesc%              = E1008Copper.ndi, PCI\VEN_8086&DEV_1008&SUBSYS_21078086 ; XT Adapter
%E1008d.DeviceDesc%             = E1008Copper.ndi, PCI\VEN_8086&DEV_1008&SUBSYS_21108086 ; XT Adapter
%E1008GENERICCopper.DeviceDesc% = E1008.ndi,       PCI\VEN_8086&DEV_1008 ; 82544 XT Adapter

%E1009.DeviceDesc%              = E1009Fiber.ndi,  PCI\VEN_8086&DEV_1009&SUBSYS_11098086 ; XF Adapter
%E1009.DeviceDesc%              = E1009Fiber.ndi,  PCI\VEN_8086&DEV_1009&SUBSYS_21098086 ; XF Adapter
%E1009GENERICFiber.DeviceDesc%  = E1009.ndi,       PCI\VEN_8086&DEV_1009 ; 82544 EI Adapter

%E100C.DeviceDesc%              = E100CCopper.ndi, PCI\VEN_8086&DEV_100C&SUBSYS_11128086 ; T Desktop Adapter
%E100C.DeviceDesc%              = E100CCopper.ndi, PCI\VEN_8086&DEV_100C&SUBSYS_21128086 ; T Desktop Adapter
%E100CGENERICCopper.DeviceDesc% = E100C.ndi,       PCI\VEN_8086&DEV_100C ; 82544 T Desktop Adapter

%E100D.DeviceDesc%              = E1008Copper.ndi, PCI\VEN_8086&DEV_100D&SUBSYS_110D8086 ; 82544GC based network connection
%E100DGENERICCopper.DeviceDesc% = E1008.ndi,       PCI\VEN_8086&DEV_100D ; 82544GC based network connection


%E100E.DeviceDesc%              = E100ECopper.ndi, PCI\VEN_8086&DEV_100E&SUBSYS_001E8086 ; MT Adapter
%E100E.DeviceDesc%              = E100ECopper.ndi, PCI\VEN_8086&DEV_100E&SUBSYS_002E8086 ; MT Adapter
%E100EGENERICCopper.DeviceDesc% = E100E.ndi,       PCI\VEN_8086&DEV_100E ; 82540 MT Adapter

%E100F.DeviceDesc%              = E100FCopper.ndi,  PCI\VEN_8086&DEV_100F&SUBSYS_10018086 ; MT Server Adapter
%E100FLOM.DeviceDesc%           = E100FCopper.ndi,  PCI\VEN_8086&DEV_100F&SUBSYS_10008086 ; MT Server Adapter
%E100FGENERICCopper.DeviceDesc% = E100F.ndi,        PCI\VEN_8086&DEV_100F ; 82545EM connection

%E1010.DeviceDesc%              = E1010Copper.ndi,  PCI\VEN_8086&DEV_1010&SUBSYS_10118086 ; MT Dual Port Server Adapter
%E1010LOM.DeviceDesc%           = E1010Copper.ndi,  PCI\VEN_8086&DEV_1010&SUBSYS_101A8086 ; MT Dual Port Network Connection
%E1010GENERICCopper.DeviceDesc% = E1010.ndi,        PCI\VEN_8086&DEV_1010 ; 82546EB connection

%E1011.DeviceDesc%              = E1011Fiber.ndi,   PCI\VEN_8086&DEV_1011&SUBSYS_10028086 ; MF Server Adapter
%E1011LX.DeviceDesc%            = E1011Fiber.ndi,   PCI\VEN_8086&DEV_1011&SUBSYS_10038086 ; MF Server Adapter (LX)
%E1011GENERICFiber.DeviceDesc%  = E1011.ndi,        PCI\VEN_8086&DEV_1011 ; 82545EM Fiber connection



%E1012.DeviceDesc%              = E1012Fiber.ndi,   PCI\VEN_8086&DEV_1012&SUBSYS_10128086 ; MF Dual Port Server Adapter
%E1012GENERICFiber.DeviceDesc%  = E1012.ndi,        PCI\VEN_8086&DEV_1012 ; 82546EB connection

%E1013NC.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1013&SUBSYS_10138086
%E1013NC.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1013&SUBSYS_00138086
%E1013DA.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1013&SUBSYS_11138086
%E1013NA.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1013&SUBSYS_12138086
%E1013.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1013

%E1015.DeviceDesc%             = E100E.ndi,  PCI\VEN_8086&DEV_1015

%E1016.DeviceDesc%             = E100E.ndi,  PCI\VEN_8086&DEV_1016

%E1017.DeviceDesc%             = E100E.ndi,  PCI\VEN_8086&DEV_1017

%E1018MC.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1018&SUBSYS_10188086
%E1018MC.DeviceDesc%		= E1013.ndi,  PCI\VEN_8086&DEV_1018

%E1019DC.DeviceDesc%           = E1019.ndi,  PCI\VEN_8086&DEV_1019&SUBSYS_10198086
%E1019NC.DeviceDesc%           = E1019.ndi,  PCI\VEN_8086&DEV_1019

;quad
%E101D.DeviceDesc%             = E101DCopper.ndi,   PCI\VEN_8086&DEV_101D&SUBSYS_10008086
%E101D.DeviceDesc%             = E101DCopper.ndi,   PCI\VEN_8086&DEV_101D

%E101E.DeviceDesc%             = E101E.ndi,  PCI\VEN_8086&DEV_101E

%E1026SC.DeviceDesc%           = E1026.ndi,         PCI\VEN_8086&DEV_1026
%E1026SC.DeviceDesc%           = E1026.ndi,         PCI\VEN_8086&DEV_1026&SUBSYS_10268086
%E1026SC.DeviceDesc%           = E1026.ndi,         PCI\VEN_8086&DEV_1026&SUBSYS_10008086
%E1026SA.DeviceDesc%           = E1026.ndi,         PCI\VEN_8086&DEV_1026&SUBSYS_10018086
%E1026SA.DeviceDesc%           = E1026.ndi,         PCI\VEN_8086&DEV_1026&SUBSYS_10028086
%E1027SA.DeviceDesc%           = E1027.ndi,         PCI\VEN_8086&DEV_1027
%E1027SA.DeviceDesc%           = E1027.ndi,         PCI\VEN_8086&DEV_1027&SUBSYS_10278086
%E1027SA.DeviceDesc%           = E1027.ndi,         PCI\VEN_8086&DEV_1027&SUBSYS_10018086
%E1027SALX.DeviceDesc%         = E1027.ndi,         PCI\VEN_8086&DEV_1027&SUBSYS_10028086
%E1027SALX.DeviceDesc%         = E1027.ndi,         PCI\VEN_8086&DEV_1027&SUBSYS_10038086
%E1028SC.DeviceDesc%           = E1028.ndi,         PCI\VEN_8086&DEV_1028
%E1028SC.DeviceDesc%           = E1028.ndi,         PCI\VEN_8086&DEV_1028&SUBSYS_10288086





%E1075NC.DeviceDesc%           = E1075.ndi,         PCI\VEN_8086&DEV_1075&SUBSYS_00758086
%E1075NC.DeviceDesc%           = E1075.ndi,         PCI\VEN_8086&DEV_1075&SUBSYS_10758086
%E1075NC.DeviceDesc%           = E1075.ndi,         PCI\VEN_8086&DEV_1075&SUBSYS_02AE8086
%E1075NC.DeviceDesc%           = E1075.ndi,         PCI\VEN_8086&DEV_1075

%E1076NC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1076&SUBSYS_10768086
%E1076NC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1076&SUBSYS_00768086
%E1076DA.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1076&SUBSYS_11768086
%E1076NA.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1076&SUBSYS_12768086
%E1076NC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1076&SUBSYS_02AD8086
%E1076NC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1076
%E1077MC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1077&SUBSYS_10778086
%E1077MC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1077&SUBSYS_00778086
%E1077MC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1077&SUBSYS_00011179
%E1077MC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1077&SUBSYS_055B1014
%E1077MC.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_1077

%E1079SA.DeviceDesc%           = E1079.ndi,         PCI\VEN_8086&DEV_1079&SUBSYS_117A8086
%E1079SA.DeviceDesc%           = E1079.ndi,         PCI\VEN_8086&DEV_1079&SUBSYS_11798086
%E1079SA.DeviceDesc%           = E1079.ndi,         PCI\VEN_8086&DEV_1079&SUBSYS_12A6103C
%E1079NC.DeviceDesc%           = E1079.ndi,         PCI\VEN_8086&DEV_1079&SUBSYS_10798086
%E1079NC.DeviceDesc%           = E1079.ndi,         PCI\VEN_8086&DEV_1079&SUBSYS_00798086
%E1079NC.DeviceDesc%           = E1079.ndi,         PCI\VEN_8086&DEV_1079
%E107ASA.DeviceDesc%           = E107A.ndi,         PCI\VEN_8086&DEV_107A&SUBSYS_107A8086
%E107ASA.DeviceDesc%           = E107A.ndi,         PCI\VEN_8086&DEV_107A&SUBSYS_127A8086
%E107ASA.DeviceDesc%           = E107A.ndi,         PCI\VEN_8086&DEV_107A&SUBSYS_12A8103c
%E107ANC.DeviceDesc%           = E107A.ndi,         PCI\VEN_8086&DEV_107A
%E107BSC.DeviceDesc%           = E107B.ndi,         PCI\VEN_8086&DEV_107B&SUBSYS_117B8086
%E107BSC.DeviceDesc%           = E107B.ndi,         PCI\VEN_8086&DEV_107B&SUBSYS_107B8086
%E107BSC.DeviceDesc%           = E107B.ndi,         PCI\VEN_8086&DEV_107B&SUBSYS_007B8086
%E107BSC.DeviceDesc%           = E107B.ndi,         PCI\VEN_8086&DEV_107B

%E107CDA.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_107C&SUBSYS_13768086
%E107CDA.DeviceDesc%           = E1076.ndi,         PCI\VEN_8086&DEV_107C&SUBSYS_14768086


[IBM.NTamd64]
%E1008IBM.DeviceDesc%      = E1008Copper.ndi, PCI\VEN_8086&DEV_1008&SUBSYS_02691014 ; XT Adapter
%E1009IBM.DeviceDesc%      = E1009Fiber.ndi,  PCI\VEN_8086&DEV_1009&SUBSYS_02681014 ; XF Adapter

%E100EIBM.DeviceDesc%      = E100ECopper.ndi, PCI\VEN_8086&DEV_100E&SUBSYS_02651014 ; MT Adapter
%E100EIBM.DeviceDesc%      = E100ECopper.ndi, PCI\VEN_8086&DEV_100E&SUBSYS_02671014 ; MT Adapter
%E100EIBM.DeviceDesc%      = E100ECopper.ndi, PCI\VEN_8086&DEV_100E&SUBSYS_026A1014 ; MT Adapter

%E1016IBM.DeviceDesc%      = E100E.ndi, PCI\VEN_8086&DEV_1016&SUBSYS_052C1014

;-------------------------------------------------------------------------------
; Intel PRO\1000 XT Server Adapter (Generic)
;
[E1008.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg, TcpSeg.reg, 82544EI.reg
CopyFiles       = e1000.CopyFiles

[E1008.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 XT Server Adapter
;
[E1008Copper.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg, TcpSeg.reg, 82544EI.reg
CopyFiles       = e1000.CopyFiles

[E1008Copper.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 XT Server Adapter (SC-Fiber) [Generic]
;
[E1009.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, TcpSeg.reg, 82544EI.reg
CopyFiles       = e1000.CopyFiles

[E1009.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 XT Server Adapter (SC-Fiber)
;
[E1009Fiber.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg, TcpSeg.reg, 82544EI.reg
CopyFiles       = e1000.CopyFiles

[E1009Fiber.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 MT Desktop Adapter (Generic)
;
[E100E.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, TcpSeg.reg, 82544EI.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E100E.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 MT Desktop Adapter
;
[E100ECopper.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg, TcpSeg.reg, 82544EI.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E100ECopper.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 T Desktop Adapter (Generic)
;
[E100C.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg, TcpSeg.reg, 82544EI.reg
CopyFiles       = e1000.CopyFiles

[E100C.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 T Desktop Adapter
;
[E100CCopper.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg, TcpSeg.reg, 82544EI.reg
CopyFiles       = e1000.CopyFiles

[E100CCopper.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MT Server Adapter (Generic)
;
[E100F.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E100F.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MT Server Adapter
;
[E100FCopper.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E100FCopper.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MF Server Adapter (Generic)
;
[E1011.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1011.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MF Server Adapter
;
[E1011Fiber.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1011Fiber.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MT Dual Port Server Adapter (Generic)
;
[E1010.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1010.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MT Dual Port Server Adapter
;
[E1010Copper.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1010Copper.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MF Dual Port Server Adapter (Generic)
;
[E1012.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1012.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO/1000 MF Dual Port Server Adapter
;
[E1012Fiber.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = 82544EI.reg, TcpSeg.reg, 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1012Fiber.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel PRO\1000 MT Mobile Connection
;
[E101E.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg 
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg  
CopyFiles       = e1000.CopyFiles

[E101E.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog


;-------------------------------------------------------------------------------
; Intel PRO\1000 MT Network Connection and Adapter 
;
[E1013.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg 
AddReg 		= TnT.reg
CopyFiles       = e1000.CopyFiles

[E1013.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog


;-------------------------------------------------------------------------------
; Intel PRO/1000 MT Quad Port Server Adapter
;
[E101DCopper.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E101DCopper.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog


;-------------------------------------------------------------------------------
; Intel PRO\1000 CT Mobile Connection
;
[E1019.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI

AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
AddReg 		= TnT.reg
CopyFiles       = e1000.CopyFiles

[E1019.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel(R) PRO/1000 MT Server Connection
;
[E1026.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1026.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog


;-------------------------------------------------------------------------------
; Intel(R) PRO/1000 MF Server Adapter
;
[E1027.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg,
CopyFiles       = e1000.CopyFiles

[E1027.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel(R) PRO/1000 MB Server Connection
;
[E1028.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1028.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog


;-------------------------------------------------------------------------------
; Intel PRO/1000 CT Network Connection
;
[E1075.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
AddReg 		= TnT.reg
CopyFiles       = e1000.CopyFiles

[E1075.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog


;-------------------------------------------------------------------------------
; Intel PRO\1000 MT Network Connection and Adapter 
;
[E1076.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
AddReg 		= TnT.reg
CopyFiles       = e1000.CopyFiles

[E1076.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel(R) PRO/1000 MT Dual Port Network Connection
;
[E1079.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Copper.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E1079.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel(R) PRO/1000 MF Dual Port Network Connection
;
[E107A.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E107A.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-------------------------------------------------------------------------------
; Intel(R) PRO/1000 MB Dual Port Server Connection
;
[E107B.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
AddReg          = Kodiak.reg, Kodiak2.reg, Advanced.reg
AddReg          = NDIS_5_1.reg, 82544EI.reg, TcpSeg.reg
AddReg          = 82540EM.reg
CopyFiles       = e1000.CopyFiles

[E107B.ndi.NTamd64.Services]
AddService = E1000, 2, e1000_NTX64.Service, common.EventLog

;-----------------------------------------------------------------------------
; Registry Settings (decimal)
;
[Kodiak.reg]

HKR, Ndi\Interfaces,                           UpperRange,         0, "ndis5"
HKR, Ndi\Interfaces,                           LowerRange,         0, "ethernet"
HKR, Ndi,                                      Service,            0, "E1000"

; FlowControl
HKR, Ndi\Params\FlowControl,                   ParamDesc,          0, %FlowControl%
HKR, PROSetNdi\NdiExt\Params\FlowControl,      MiniHelp,           0, %FlowControlMiniHelp%
HKR, Ndi\Params\FlowControl,                   default,            0, "3"
HKR, Ndi\Params\FlowControl\Enum,              "0",                0, %FlowControl_None%
HKR, Ndi\Params\FlowControl\Enum,              "1",                0, %FlowControl_RxOnly%
HKR, Ndi\Params\FlowControl\Enum,              "2",                0, %FlowControl_TxOnly%
HKR, Ndi\Params\FlowControl\Enum,              "3",                0, %FlowControl_Full%
HKR, Ndi\Params\FlowControl\Enum,              "255",              0, %FlowControl_Hardware%
HKR, Ndi\Params\FlowControl,                   type,               0, "enum"

; NumTxDescriptors
HKR, Ndi\params\NumTxDescriptors,              ParamDesc,          0, %NumTxDescriptors%
HKR, PROSetNdi\NdiExt\params\NumTxDescriptors, MiniHelp,           0, %NumTxDescriptorsMiniHelp%
HKR, Ndi\params\NumTxDescriptors,              default,            0, "256"
HKR, Ndi\params\NumTxDescriptors,              min,                0, "80"
HKR, Ndi\params\NumTxDescriptors,              max,                0, "768"
HKR, Ndi\params\NumTxDescriptors,              step,               0, "8"
HKR, Ndi\params\NumTxDescriptors,              Base,               0, "10"
HKR, Ndi\params\NumTxDescriptors,              type,               0, "int"

; NumRxDescriptors
HKR, Ndi\params\NumRxDescriptors,              ParamDesc,          0, %NumRxDescriptors%
HKR, PROSetNdi\NdiExt\params\NumRxDescriptors, MiniHelp,           0, %NumRxDescriptorsMiniHelp%
HKR, Ndi\params\NumRxDescriptors,              default,            0, "160"
HKR, Ndi\params\NumRxDescriptors,              min,                0, "80"
HKR, Ndi\params\NumRxDescriptors,              max,                0, "768"
HKR, Ndi\params\NumRxDescriptors,              step,               0, "8"
HKR, Ndi\params\NumRxDescriptors,              Base,               0, "10"
HKR, Ndi\params\NumRxDescriptors,              type,               0, "int"

; NumCoalesceBuffers
HKR, Ndi\params\NumCoalesceBuffers,            ParamDesc,          0, %NumCoalesceBuffers%
HKR, PROSetNdi\NdiExt\params\NumCoalesceBuffers,MiniHelp,          0, %NumCoalesceBuffersMiniHelp%
HKR, Ndi\params\NumCoalesceBuffers,            default,            0, "128"
HKR, Ndi\params\NumCoalesceBuffers,            min,                0, "16"
HKR, Ndi\params\NumCoalesceBuffers,            max,                0, "768"
HKR, Ndi\params\NumCoalesceBuffers,            step,               0, "1"
HKR, Ndi\params\NumCoalesceBuffers,            Base,               0, "10"
HKR, Ndi\params\NumCoalesceBuffers,            type,               0, "int"

; ReportTxEarly
HKR, Ndi\Params\ReportTxEarly,                 ParamDesc,          0, %ReportTxEarly%
HKR, PROSetNdi\NdiExt\Params\ReportTxEarly,    MiniHelp,           0, %ReportTxEarlyMiniHelp%
HKR, Ndi\Params\ReportTxEarly,                 default,            0, "0"
HKR, Ndi\Params\ReportTxEarly\Enum,            "0",                0, %Off%
HKR, Ndi\Params\ReportTxEarly\Enum,            "1",                0, %On%
HKR, Ndi\Params\ReportTxEarly,                 type,               0, "enum"

; ChecksumTxTcp
HKR, Ndi\Params\ChecksumTxTcp,                 ParamDesc,          0, %ChecksumTxTcp%
HKR, PROSetNdi\NdiExt\Params\ChecksumTxTcp,    MiniHelp,           0, %ChecksumTxTcpMiniHelp%
HKR, Ndi\Params\ChecksumTxTcp,                 default,            0, "1"
HKR, Ndi\Params\ChecksumTxTcp\Enum,            "0",                0, %Off%
HKR, Ndi\Params\ChecksumTxTcp\Enum,            "1",                0, %On%
HKR, Ndi\Params\ChecksumTxTcp,                 type,               0, "enum"

; ChecksumRxTcp
HKR, Ndi\Params\ChecksumRxTcp,                 ParamDesc,          0, %ChecksumRxTcp%
HKR, PROSetNdi\NdiExt\Params\ChecksumRxTcp,    MiniHelp,           0, %ChecksumRxTcpMiniHelp%
HKR, Ndi\Params\ChecksumRxTcp,                 default,            0, "1"
HKR, Ndi\Params\ChecksumRxTcp\Enum,            "0",                0, %Off%
HKR, Ndi\Params\ChecksumRxTcp\Enum,            "1",                0, %On%
HKR, Ndi\Params\ChecksumRxTcp,                 type,               0, "enum"

; Network Address
HKR, Ndi\params\NetworkAddress,                ParamDesc,          0, %LAA%
HKR, PROSetNdi\NdiExt\params\NetworkAddress,   MiniHelp,           0, %LAAMiniHelp%
HKR, Ndi\params\NetworkAddress,                Default,            0, ""
HKR, Ndi\params\NetworkAddress,                type,               0, "edit"
HKR, NDI\params\NetworkAddress,                LimitText,          0, "12"
HKR, NDI\params\NetworkAddress,                UpperCase,          0, "1"
HKR, NDI\params\NetworkAddress,                optional,           0, "1"

; Hardwired defaults
HKR,,                                          PciScanMethod,      0, "3"
HKR,,                                          TxIntDelay,         0, "28"
HKR,,                                          MWIEnable,          0, "1"
HKR,,                                          CustomMessages,     0, "0"
HKR,,                                          DmaFairness,        0, "0"
HKR,,                                          MulticastFilterType,0, "0"
HKR,,                                          VlanFiltering,      0, "1"
HKR,,                                          QtagSwControlled,   0, "1"
HKR,,                                          TransmitMode,       0, "0"


[Kodiak2.reg]
; CheckSumTxIp
HKR, Ndi\Params\CheckSumTxIp,                  ParamDesc,          0, %CheckSumTxIp%
HKR, PROSetNdi\NdiExt\Params\CheckSumTxIp,     MiniHelp,           0, %CheckSumTxIpMiniHelp%
HKR, Ndi\Params\CheckSumTxIp,                  default,            0, "1"
HKR, Ndi\Params\CheckSumTxIp\Enum,             "0",                0, %Off%
HKR, Ndi\Params\CheckSumTxIp\Enum,             "1",                0, %On%
HKR, Ndi\Params\CheckSumTxIp,                  type,               0, "enum"

; NumTxDescriptors
HKR, Ndi\params\NumTxDescriptors,              max,                0, "256"

; NumRxDescriptors
HKR, Ndi\params\NumRxDescriptors,              max,                0, "256"

; ReportTxEarly
HKR, Ndi\Params\ReportTxEarly,                 default,            0, "1"

; ChecksumRxTcp
HKR, Ndi\Params\ChecksumRxTcp,                 default,            0, "1"

; Hardwired defaults
HKR,,                                          QtagSwControlled,   0, "0"

;[Checksumoff.reg]
;HKR, Ndi\Params\ChecksumRxTcp,                 default,            0, "0"
;HKR, Ndi\Params\CheckSumRxIp,                  default,            0, "0"
;HKR, Ndi\Params\ChecksumTxTcp,                 default,            0, "0"
;HKR, Ndi\Params\CheckSumTxIp,                  default,            0, "0"


[TcpSeg.reg]
; TcpSegmentation
HKR, Ndi\Params\TcpSegmentation,               ParamDesc,          0, %TcpSegmentation%
HKR, PROSetNdi\NdiExt\Params\TcpSegmentation,  MiniHelp,           0, %TcpSegmentationMiniHelp%
HKR, Ndi\Params\TcpSegmentation,               default,            0, "1"
HKR, Ndi\Params\TcpSegmentation\Enum,          "0",                0, %Off%
HKR, Ndi\Params\TcpSegmentation\Enum,          "1",                0, %On%
HKR, Ndi\Params\TcpSegmentation,               type,               0, "enum"

[82540EM.reg]
;  Interrupt Throttle Rate
HKR,,                                          ITR,                0, "950"

[82544EI.reg]
; NumTxDescriptors
HKR, Ndi\params\NumTxDescriptors,              max,                0, "4096"

; NumRxDescriptors
HKR, Ndi\params\NumRxDescriptors,              max,                0, "4096"
HKR, Ndi\params\NumRxDescriptors,              default,            0, "256"

; CheckSumRxIp
HKR, Ndi\Params\CheckSumRxIp,                  ParamDesc,          0, %CheckSumRxIp%
HKR, PROSetNdi\NdiExt\Params\CheckSumRxIp,     MiniHelp,           0, %CheckSumRxIpMiniHelp%
HKR, Ndi\Params\CheckSumRxIp,                  default,            0, "1"
HKR, Ndi\Params\CheckSumRxIp\Enum,             "0",                0, %Off%
HKR, Ndi\Params\CheckSumRxIp\Enum,             "1",                0, %On%
HKR, Ndi\Params\CheckSumRxIp,                  type,               0, "enum"

[Copper.reg]
; AutoNegAdvertised
HKR, PROSetNdi\Params\AutoNegAdvertised,       ParamDesc,          0, %AutoNegAdvertised%
HKR, PROSetNdi\Params\AutoNegAdvertised,       MiniHelp,           0, %AutoNegAdvertisedMiniHelp%
HKR, PROSetNdi\Params\AutoNegAdvertised,       default,            0, "47"
HKR, PROSetNdi\Params\AutoNegAdvertised\Enum,  "1",                0, %Advertise_10_Half%
HKR, PROSetNdi\Params\AutoNegAdvertised\Enum,  "2",                0, %Advertise_10_Full%
HKR, PROSetNdi\Params\AutoNegAdvertised\Enum,  "4",                0, %Advertise_100_Half%
HKR, PROSetNdi\Params\AutoNegAdvertised\Enum,  "8",                0, %Advertise_100_Full%
HKR, PROSetNdi\Params\AutoNegAdvertised\Enum,  "32",               0, %Advertise_1000_Full%
HKR, PROSetNdi\Params\AutoNegAdvertised\Enum,  "47",               0, %AutoNegAdvSpdDefault%
HKR, PROSetNdi\Params\AutoNegAdvertised,       type,               0, "bitfield"
HKR, PROSetNdi\Params\AutoNegAdvertised,       ExposeLevel,        0, "3"
HKR,,                                                      AutoNegAdvertised,  2, "47"

; SpeedDuplex
HKR, Ndi\Params\SpeedDuplex,                   ParamDesc,          0, %SpeedDuplex%
HKR, Ndi\Params\SpeedDuplex,                   default,            0, "0"
HKR, Ndi\Params\SpeedDuplex,                   type,               0, "enum"
HKR, Ndi\Params\SpeedDuplex\Enum,              "0",                0, %AutoDetect%
HKR, Ndi\Params\SpeedDuplex\Enum,              "1",                0, %10Mb-Half-Duplex%
HKR, Ndi\Params\SpeedDuplex\Enum,              "2",                0, %10Mb-Full-Duplex%
HKR, Ndi\Params\SpeedDuplex\Enum,              "3",                0, %100Mb-Half-Duplex%
HKR, Ndi\Params\SpeedDuplex\Enum,              "4",                0, %100Mb-Full-Duplex%
HKR, PROSetNdi\NdiExt\Params\SpeedDuplex,      ExposeLevel,        0, "3"
HKR, PROSetNdi\NdiExt\Params\SpeedDuplex,      MiniHelp,           0, %SpeedDuplexMiniHelp%

;----------------------------------------------------------------------------
; Packet specifics
;
[Advanced.reg]
; 802.1p/802.1Q Tagging
HKR, Ndi\Params\TaggingMode,                   ParamDesc,          0, %TaggingMode%
HKR, PROSetNdi\Params\TaggingMode,             MiniHelp,           0, %TaggingModeMiniHelp%
HKR, Ndi\Params\TaggingMode,                   default,            0, "0"
HKR, Ndi\Params\TaggingMode\Enum,              "0",                0, %Off%
HKR, Ndi\Params\TaggingMode\Enum,              "1",                0, %On%
HKR, Ndi\Params\TaggingMode,                   type,               0, "enum"

HKR, PROSetNdi\Params\MaxFrameSize,            ParamDesc,          0, %JumboFrames%
HKR, PROSetNdi\Params\MaxFrameSize,            MiniHelp,           0, %JumboFramesMiniHelp%
HKR, PROSetNdi\Params\MaxFrameSize,            default,            0, "1514"
HKR, PROSetNdi\Params\MaxFrameSize\Enum,       "1514",             0, %Disabled%
HKR, PROSetNdi\Params\MaxFrameSize\Enum,       "4088",             0, %Bytes4088%
HKR, PROSetNdi\Params\MaxFrameSize\Enum,       "9014",             0, %Bytes9014%
HKR, PROSetNdi\Params\MaxFrameSize\Enum,       "16128",            0, %Bytes16128%
HKR, PROSetNdi\Params\MaxFrameSize,            type,               0, "enum"
HKR,,                                          MaxFrameSize,       2, "1514"

[NDIS_5_1.reg]
HKR, Ndi\Params\ChecksumRxTcp,                 default,            0, "1"
HKR, PROSetNdi\NdiExt\Params\ChecksumRxTcp,    MiniHelp,           0, %ChecksumRxTcpMiniHelp%


[TnT.reg]
HKR,,                          AdaptiveIFS,               0,"0"
HKR,Ndi\Params\AdaptiveIFS,    default,                   0,"0"


[e1000.CopyFiles]
e1G5132e.sys,,,2

[e1000_NTX64.Service]
DisplayName     = %e1000.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\e1G5132e.sys
LoadOrderGroup  = NDIS

;-----------------------------------------------------------------------------
; Common base for all drivers for Eventlog
;
[common.EventLog]
AddReg = common.AddEventLog.reg

[common.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll;%%SystemRoot%%\System32\drivers\e1G5132e.sys"
HKR, , TypesSupported,   0x00010001, 7


;-----------------------------------------------------------------------------
; DestinationDirs
;
[DestinationDirs]
e1000.CopyFiles = 12	

;-----------------------------------------------------------------------------
; Localizable Strings
;
[Strings]
Msft                     = "Microsoft"
Intel                    = "Intel"
IBM                      = "IBM"

Advertise_10_Half        = "Advertise 10 Half"
Advertise_10_Full        = "Advertise 10 Full"
Advertise_100_Half       = "Advertise 100 Half"
Advertise_100_Full       = "Advertise 100 Full"
Advertise_1000_Full      = "Advertise 1000 Full"
AutoNegAdvSpdDefault     = "Advertise Speed Default"
AutoNegAdvertised        = "Negotiable Speeds and Duplexes"

CheckSumTxIp             = "Offload Transmit IP Checksum"
ChecksumTxTcp            = "Offload Transmit TCP Checksum"
CheckSumRxIp             = "Offload Receive IP Checksum"
ChecksumRxTcp            = "Offload Receive TCP Checksum"
TcpSegmentation          = "Offload TCP Segmentation"

FlowControl              = "Flow Control"
FlowControl_None         = "Off"
FlowControl_RxOnly       = "Respond"
FlowControl_TxOnly       = "Generate"
FlowControl_Full         = "Both On"
FlowControl_Hardware     = "Hardware Default"

JumboFrames              = "Jumbo Frames"
LAA                      = "Locally Administered Address"
NumTxDescriptors         = "Number of Transmit Descriptors"
NumRxDescriptors         = "Number of Receive Buffers"
NumCoalesceBuffers       = "Number of Coalesce Buffers"
ReportTxEarly            = "Fast Transmit Completion"

100Mb-Full-Duplex        = "100Mbps/Full Duplex"
100Mb-Half-Duplex        = "100Mbps/Half Duplex"
10Mb-Full-Duplex         = "10Mbps/Full Duplex"
10Mb-Half-Duplex         = "10Mbps/Half Duplex"
AutoDetect               = "Auto Detect"
SpeedDuplex              = "Link Speed & Duplex"

TaggingMode              = "QoS Packet Tagging"

On                       = "On"
Off                      = "Off"
True                     = "True"
False                    = "False"
Disabled                 = "Disabled"
Bytes2048                = "2048 Bytes"
Bytes4088                = "4088 Bytes"
Bytes16128               = "16128 Bytes"
Bytes9014                = "9014 Bytes (Alteon)"

; Minihelp
FlowControlMiniHelp        = "IEEE 802.3x flow control. Helps to prevent packets from being dropped and can improve overall network performance."
SpeedDuplexMiniHelp        = "When Auto-Negotiation is disabled what speed and duplex the adapter will run at.  Note gigabit speeds are not forcible."
LargeMemoryEnabledMiniHelp = "Support direct access to more than 4 Gigabytes of system memory."
AutoNegAdvertisedMiniHelp  = "This can be used to restrict the speeds and duplexes advertised to a link partner during autonegotiation."
CheckSumTxIpMiniHelp       = "Allows the adapter to compute the IP checksum of outgoing packets.  This improves IP transmit performance."
CheckSumTxTcpMiniHelp      = "Allows the adapter to compute the TCP or UDP checksum of outgoing packets.  This improves TCP and UDP transmit performance."
CheckSumRxIpMiniHelp       = "Allows the adapter to compute the IP checksum of incoming packets.  This improves IP transmit performance."
CheckSumRxTcpMiniHelp      = "Allows the adapter to verify the TCP or UDP checksum of incoming packets. This improves TCP and UDP receive performance."
TcpSegmentationMiniHelp    = "Allows the adapter to offload the task of segmenting TCP messages and improves CPU utilization."
NumCoalesceBuffersMiniHelp = "Number of buffers available for transmit acceleration."
NumRxDescriptorsMiniHelp   = "The number of receive buffers and descriptors that the driver allocates for received packets."
NumTxDescriptorsMiniHelp   = "The number of hardware resources in memory used to send packets."
JumboFramesMiniHelp        = "Enables sending larger Ethernet packets on Gigabit networks. See Help for more information."
ReportTxEarlyMiniHelp      = "This will free the transmit resources as soon as the DMA is complete."
TaggingModeMiniHelp        = "Send and receive IEEE Tagged frames (802.3ac/802.1p/802.1Q)."
LAAMiniHelp                = "Allows you to change the adapter's MAC address."


E1008.DeviceDesc              = "Intel(R) PRO/1000 XT Server Adapter"
E1008d.DeviceDesc             = "Intel(R) PRO/1000 XT Desktop Adapter"
E1008GENERICCopper.DeviceDesc = "Intel(R) PRO/1000 XT Network Connection"
E1009.DeviceDesc              = "Intel(R) PRO/1000 XF Server Adapter"
E1009GENERICFiber.DeviceDesc  = "Intel(R) PRO/1000 XF Network Connection"
E100C.DeviceDesc              = "Intel(R) PRO/1000 T Desktop Adapter"
E100CGENERICCopper.DeviceDesc = "Intel(R) PRO/1000 T Network Connection"
E100D.DeviceDesc              = "Intel (R) 82544GC Based Network Connection"
E100DGENERICCopper.DeviceDesc = "Intel(R) PRO/1000 XT Network Connection"
E100E.DeviceDesc              = "Intel(R) PRO/1000 MT Desktop Adapter"
E100EGENERICCopper.DeviceDesc = "Intel(R) PRO/1000 MT Network Connection"
E100F.DeviceDesc              = "Intel(R) PRO/1000 MT Server Adapter"
E100FLOM.DeviceDesc           = "Intel(R) PRO/1000 MT Network Connection"
E100FGENERICCopper.DeviceDesc = "Intel(R) PRO/1000 MT Network Connection"
E1010.DeviceDesc              = "Intel(R) PRO/1000 MT Dual Port Server Adapter"
E1010LOM.DeviceDesc           = "Intel(R) PRO/1000 MT Dual Port Network Connection"
E1010GENERICCopper.DeviceDesc = "Intel(R) PRO/1000 MT Dual Port Network Connection"
E1011.DeviceDesc              = "Intel(R) PRO/1000 MF Server Adapter"
E1011LX.DeviceDesc            = "Intel(R) PRO/1000 MF Server Adapter (LX)"
E1011GENERICFiber.DeviceDesc  = "Intel(R) PRO/1000 MF Server Adapter"
E1012.DeviceDesc              = "Intel(R) PRO/1000 MF Dual Port Server Adapter"
E1012GENERICFiber.DeviceDesc  = "Intel(R) PRO/1000 MF Dual Port Network Connection"
E1013NC.DeviceDesc         = "Intel(R) PRO/1000 MT Network Connection"
E1013NA.DeviceDesc         = "Intel(R) PRO/1000 MT Network Adapter"
E1013DA.DeviceDesc         = "Intel(R) PRO/1000 MT Desktop Adapter"
E1013.DeviceDesc           = "Intel(R) PRO/1000 MT Network Connection"
E1015.DeviceDesc           = "Intel(R) PRO/1000 MT Mobile Connection"
E1016.DeviceDesc           = "Intel(R) PRO/1000 MT Mobile Connection"
E1017.DeviceDesc           = "Intel(R) PRO/1000 MT Desktop Connection"
E101D.DeviceDesc           ="Intel(R) PRO/1000 MT Quad Port Server Adapter"
E101E.DeviceDesc           = "Intel(R) PRO/1000 MT Mobile Connection" 
E1018MC.DeviceDesc         = "Intel(R) PRO/1000 MT Mobile Connection"
E1019NC.DeviceDesc         = "Intel(R) PRO/1000 CT Network Connection"
E1019DC.DeviceDesc         = "Intel(R) PRO/1000 CT Desktop Connection"
E1026SC.DeviceDesc	   ="Intel(R) PRO/1000 MT Server Connection"
E1026SA.DeviceDesc         ="Intel(R) PRO/1000 MT Server Adapter"
E1027SA.DeviceDesc	   ="Intel(R) PRO/1000 MF Server Adapter"
E1027SALX.DeviceDesc	   ="Intel(R) PRO/1000 MF Server Adapter(LX)"
E1028SC.DeviceDesc	   ="Intel(R) PRO/1000 MB Server Connection"
E1075NC.DeviceDesc         ="Intel(R) PRO/1000 CT Network Connection"
E1076NC.DeviceDesc         ="Intel(R) PRO/1000 MT Network Connection"
E1076DA.DeviceDesc         ="Intel(R) PRO/1000 MT Desktop Adapter"
E1076NA.DeviceDesc         ="Intel(R) PRO/1000 MT Network Adapter"
E1077MC.DeviceDesc         ="Intel(R) PRO/1000 MT Mobile Connection"
E1078NC.DeviceDesc         ="Intel(R) PRO/1000 MT Network Connection"
E1079NC.DeviceDesc         ="Intel(R) PRO/1000 MT Dual Port Network Connection"
E1079SA.DeviceDesc         ="Intel(R) PRO/1000 MT Dual Port Server Adapter"
E107ASA.DeviceDesc         ="Intel(R) PRO/1000 MF Dual Port Server Adapter"
E107ANC.DeviceDesc         ="Intel(R) PRO/1000 MF Dual Port Network Connection"
E107BSC.DeviceDesc         ="Intel(R) PRO/1000 MB Dual Port Server Connection"
E107CDA.DeviceDesc         = "Intel(R) PRO/1000 GT Desktop Adapter"
IBMGE.DeviceDesc         = "IBM Netfinity Gigabit Ethernet SX Adapter"
E1001IBM.DeviceDesc      = "IBM Gigabit Ethernet SX Server Adapter"
E1004IBM.DeviceDesc      = "IBM Gigabit Ethernet Server Adapter"
E1008IBM.DeviceDesc      = "IBM iSeries 1000/100/10 Ethernet Adapter"
E1009IBM.DeviceDesc      = "IBM iSeries Gigabit Ethernet Adapter"
E100EIBM.DeviceDesc      = "Intel(R) PRO/1000 MT Network Connection"
E1016IBM.DeviceDesc        = "Intel(R) PRO/1000 MT Mobile Connection"

E1000.Service.DispName   = "Intel(R) PRO/1000 Device Driver"
