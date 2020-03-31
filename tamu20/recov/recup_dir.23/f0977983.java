; NETEFE3E.INF
;
; Intel 8255x-based PCI Ethernet Adapters
; Copyright (c) 2004, Microsoft

[version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %Msft%
LayoutFile  = layout.inf
DriverVer=10/01/2002,8.0.16.0


[Manufacturer]
%Intel%     = Intel, NTamd64
%HPTX%      = HPTX, NTamd64
%IBM%       = IBM, NTamd64
%NEC%       = NEC, NTamd64
%Acer%      = Acer, NTamd64
%FujSie%    = FujSie, NTamd64
%Actiontec% = Actiontec, NTamd64
%Toshiba%   = Toshiba, NTamd64
%Fujitsu%   = Fujitsu, NTamd64
%Samsung%   = Samsung, NTamd64
%Dlink%     = Dlink, NTamd64
%Trigem%    = Trigem, NTamd64


[ControlFlags]
ExcludeFromSelect = *

[Intel.NTamd64]
; DisplayName                    Section         DeviceID
; -----------                    -------         --------
%PCIE100PLUS.DeviceDesc%         = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_000B8086
%PCIE100MAN.DeviceDesc%          = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_000C8086
%PCIE100AOL.DeviceDesc%          = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_000D8086
%PCIE100MANAOL.DeviceDesc%       = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_000E8086
%PCIE100SC0.DeviceDesc%          = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_000F8086
%PCIE100S.DeviceDesc%            = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00108086
%PCIE100S.DeviceDesc%            = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00118086
%PCIE100SADV.DeviceDesc%         = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00128086
%PCIE100SADV.DeviceDesc%         = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00138086
%PCIE100MANAOLGC.DeviceDesc%     = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00308086
%PCIE100SC0.DeviceDesc%          = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00318086
%PCIE100SC3.DeviceDesc%          = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_00408086
%PCIE100SC1.DeviceDesc%          = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_00418086
%PCIE100SC0.DeviceDesc%          = D102SCN.ndi,  PCI\VEN_8086&DEV_1229&SUBSYS_00428086
%PCIE100SERVERW.DeviceDesc%      = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_100C8086
%PCIE100SSVR.DeviceDesc%         = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10128086
%PCIE100SSVR.DeviceDesc%         = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10138086
%PCIE100DUAL.DeviceDesc%         = D101MDP.ndi,  PCI\VEN_8086&DEV_1229&SUBSYS_10178086
%PCIE100MANAOLGS.DeviceDesc%     = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_10308086
%PCIE100SSVRC3.DeviceDesc%       = D102SSC.ndi,  PCI\VEN_8086&DEV_1229&SUBSYS_10408086
%PCIE100SSVRC1.DeviceDesc%       = D102SSC.ndi,  PCI\VEN_8086&DEV_1229&SUBSYS_10418086
%PCIE100SSVRC0.DeviceDesc%       = D102SSCN.ndi, PCI\VEN_8086&DEV_1229&SUBSYS_10428086
%PCIE100SSVRC0.DeviceDesc%       = D102SSCN.ndi, PCI\VEN_8086&DEV_1229&SUBSYS_10518086
%PCIE100SSVRC0.DeviceDesc%       = D102SSCN.ndi, PCI\VEN_8086&DEV_1229&SUBSYS_10528086
%PCIE100DUAL.DeviceDesc%         = D101DP.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10F08086
%I559IFE.DeviceDesc%             = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_30008086 ; 82559 LOM
%I559IFEAOL.DeviceDesc%          = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_30018086 ; 82559 LOM w\Basic Alert on LAN*
%I559IFEAOL.DeviceDesc%          = D101Lion.ndi, PCI\VEN_8086&DEV_1229&SUBSYS_30018086&REV_09
%I559IFEAOLII.DeviceDesc%        = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_30028086 ; 82559 LOM w\Alert on LAN 2*
%PCIE100SxL.DeviceDesc%          = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_30068086
%PCIE100SxL.DeviceDesc%          = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_30078086
%PCIE100S0L.DeviceDesc%          = D102SCN.ndi,  PCI\VEN_8086&DEV_1229&SUBSYS_30088086
%PCIE100SxL.DeviceDesc%          = D102mC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_30108086
%PCIE100LAVON.DeviceDesc%        = Lavon.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00708086

%I559IFE.DeviceDesc%             = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_34008086

%PCIE100SC3.DeviceDesc%          = D102mC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_00508086
%PCIE100SSVRC3.DeviceDesc%       = D102mS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10508086
%PCIE100DUALS0.DeviceDesc%       = D102m0DP.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10148086
%PCIE100DUALSx.DeviceDesc%       = D102mSDP.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10158086
%PCIE100DUALSx.DeviceDesc%       = D102mSDP.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10168086

%PCIE100LAVON.DeviceDesc%        = Lavon.ndi,    PCI\VEN_8086&DEV_1229&REV_0F
%PCIE100LAVONMB.DeviceDesc%      = Lavonmb.ndi,  PCI\VEN_8086&DEV_1059&REV_0F
%PCIE100LAVONMB.DeviceDesc%      = Lavonmb.ndi,  PCI\VEN_8086&DEV_1059&REV_10

%PCIE100EMBLON.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_2449 ; ICH2 Generic
%PCIE100EMBEDDED.DeviceDesc%     = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30108086 ; ICH2
%PCIE100PLUSEMBEDDED.DeviceDesc% = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30118086 ; ICH2 Management
%PCIE100EMBLOM.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30138086 ; ICH2
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30148086
%PCIE100EMBMPC.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30168086
%PCIE100EMBMP.DeviceDesc%        = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30178086
%PCIE100EMBLON.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30188086

%PCIE100EMBEDDED.DeviceDesc%     = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30108086&REV_03
%PCIE100EMBLOM.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30138086&REV_03
%PCIE100EMBLON.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30188086&REV_01
%PCIE100EMBLON.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30188086&REV_03
%PCIE100EMBMP.DeviceDesc%        = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30178086&REV_01 ; ICH2 M
%PCIE100EMBMP.DeviceDesc%        = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30178086&REV_03
%PCIE100EMBMPC.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30168086&REV_01
%PCIE100EMBMPC.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_30168086&REV_03
%PCIE100PLUSEMBEDDED.DeviceDesc% = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30118086&REV_03
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30148086&REV_03

%PCIE100EMBEDDED.DeviceDesc%     = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30108086&REV_01 ; Intel(R) PRO/100E Adapter
%PCIE100EMBEDDED.DeviceDesc%     = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30108086&REV_01 ; Intel(R) PRO/100E Adapter
%PCIE100PLUSEMBEDDED.DeviceDesc% = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30118086&REV_01 ; Intel(R) PRO/100E+ Management Adapter
%PCIE100EMBLOM.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30138086&REV_01 ; Intel(R) PRO/100E Adapter
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_30148086&REV_01 ; Intel(R) PRO/100E+ Management Adapter

%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031
%PCIE100EMBLOM.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_1032
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_1033
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_1034
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110KMP.ndi,  PCI\VEN_8086&DEV_1038

; ICH4 - kinerreth (9)LOM/(A)CNR/(B)+LOM/(C)+CNR/(D)LOM mobile/(E)+ Mobile
; need to see if there are different parameters required in registry between them
%PCIE100EMBLOM.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_1039
%PCIE100EMBLOM.DeviceDesc%       = D110K.ndi,    PCI\VEN_8086&DEV_103A
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_103B
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_103C

;ICH5 - kinerreth (9)LOM/(A)CNR/(B)+LOM/(C)+CNR/(D)LOM mobile/(E)+ Mobile
%PCIE100EMBLOM.DeviceDesc%      = D110K.ndi,   PCI\VEN_8086&DEV_1050
%PCIE100EMBLOM.DeviceDesc%      = D110K.ndi,   PCI\VEN_8086&DEV_1051
%PCIE100PLUSEMBLOM.DeviceDesc%  = D110K.ndi,   PCI\VEN_8086&DEV_1052
%PCIE100PLUSEMBLOM.DeviceDesc%  = D110K.ndi,   PCI\VEN_8086&DEV_1053

;ICH6 - Kinnereth (4)LOM/(5)CNR/(6)+LOM/(7)+CNR/(8)LOM Mobile/(9)+ Mobile
%PCIE100EMBLOM.DeviceDesc%      = D110K.ndi,    PCI\VEN_8086&DEV_1064
%PCIE100EMBLOM.DeviceDesc%      = D110K.ndi,    PCI\VEN_8086&DEV_1065
%PCIE100PLUSEMBLOM.DeviceDesc%  = D110K.ndi,    PCI\VEN_8086&DEV_1066
%PCIE100PLUSEMBLOM.DeviceDesc%  = D110K.ndi,    PCI\VEN_8086&DEV_1067


; CICH support for embedded dual kinnereth
%PCIE100CICHEMBEDDED.DeviceDesc% = D110K.ndi, PCI\VEN_8086&DEV_2459
%PCIE100CICHEMBEDDED.DeviceDesc% = D110K.ndi, PCI\VEN_8086&DEV_245D


[IBM.NTamd64]
%IBMFE1.DeviceDesc%              = E100B.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_005C1014&REV_01
%IBMFE1.DeviceDesc%              = E100B.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_005C1014&REV_02
%IBMFE2.DeviceDesc%              = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_005C1014&REV_04
%IBMFE2.DeviceDesc%              = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_005C1014&REV_05
%IBMFE1.DeviceDesc%              = E100B.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_005C1014
%IBMFE9.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_01BC1014&REV_08
%IBMFE9.DeviceDesc%              = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_01BC1014&REV_09
%IBMFE9.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_01BC1014
%IBMFEA.DeviceDesc%              = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_01F11014
%IBMFEA.DeviceDesc%              = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_01F21014
%IBMFE2.DeviceDesc%              = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_105C1014&REV_04
%IBMFE2.DeviceDesc%              = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_105C1014&REV_05
%IBMFE2.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_105C1014&REV_08
%IBMFE2.DeviceDesc%              = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_105C1014
%IBMFE3.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_305C1014&REV_08
%IBMFE3.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_305C1014
%IBMFE4.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_405C1014&REV_08
%IBMFE4.DeviceDesc%              = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_405C1014
%IBMFE5.DeviceDesc%              = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_505C1014&REV_09
%IBMFE5.DeviceDesc%              = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_505C1014
%IBMFE6.DeviceDesc%              = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_605C1014&REV_09
%IBMFE6.DeviceDesc%              = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_605C1014
%IBMFE7.DeviceDesc%              = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_705C1014&REV_09
%IBMFE7.DeviceDesc%              = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_705C1014
%IBMFE8.DeviceDesc%              = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_805C1014&REV_09
%IBMFE8.DeviceDesc%              = D101SS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_805C1014
%PCIE100SxL.DeviceDesc%          = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_02071014
%PCIE100SxL.DeviceDesc%          = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_023F1014
%IBMFEB.DeviceDesc%              = D102mS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_02321014

%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_01CE1014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_01DC1014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_01EB1014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_01EC1014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02021014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02051014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02091014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02171014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02341014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02651014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_02671014
%IBMFEK.DeviceDesc%              = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_026A1014
%IBMFES.DeviceDesc%              = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_022D1014
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_02091014

[HPTX.NTamd64]
%HPTX1.DeviceDesc%               = E100B.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_10C0103C
%HPTX1.DeviceDesc%               = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_10C3103C
%HPTX1.DeviceDesc%               = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_10CA103C
%HPTX1.DeviceDesc%               = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_10CB103C
%HPTX1.DeviceDesc%               = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10E3103C
%HPTX1.DeviceDesc%               = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_10E4103C
%HPTX1.DeviceDesc%               = E100B.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_1200103C
%HPTX1.DeviceDesc%               = D102mS.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_1273103C
%HPTX1.DeviceDesc%               = D102SSCN.ndi, PCI\VEN_8086&DEV_1229&SUBSYS_1274103C

[NEC.NTamd64]
%9821XB06.DeviceDesc%            = E100B.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_80001033
%PKUGX06.DeviceDesc%             = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_80161033
%PKUGX06.DeviceDesc%             = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_801F1033
%PKUGX06.DeviceDesc%             = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_80261033
%NEC82559BASED.DeviceDesc%       = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_80631033
%NEC82559BASED.DeviceDesc%       = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_80C41033
; The following NEC devices defined by PCI\VEN_8086&DEV_1031
;       PCI\VEN_8086&DEV_1031&SUBSYS_81691033
;       PCI\VEN_8086&DEV_1031&SUBSYS_81831033
;       PCI\VEN_8086&DEV_1031&SUBSYS_818b1033
;       PCI\VEN_8086&DEV_1031&SUBSYS_818c1033

[Acer.NTamd64]
%PCIACER2.DeviceDesc%            = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_00091025
%PCIACER1.DeviceDesc%            = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_001A1025
%PCIACER1.DeviceDesc%            = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_04401468
%PCIACER1.DeviceDesc%            = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_04401468&REV_08 ; oem preinstall
%PCIACER3.DeviceDesc%            = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_001B1025


[FujSie.NTamd64]
%I558IFEWFMSI1.DeviceDesc%       = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_0019110A
%I559IFESI2.DeviceDesc%          = D101M.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_0037110A
%I559IFEAOLSI3.DeviceDesc%       = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_004B110A
%I558IFESI4.DeviceDesc%          = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_0031110A
%I558IFESI5.DeviceDesc%          = D101.ndi,     PCI\VEN_8086&DEV_1229&SUBSYS_6608110A
%I559IFEAOLSI6.DeviceDesc%       = D101S.ndi,    PCI\VEN_8086&DEV_1229&SUBSYS_6618110A

[Toshiba.NTamd64]
%PCIE100B.DeviceDesc%            = D102mCm.ndi,  PCI\VEN_8086&DEV_1229&SUBSYS_00011179 ; 82550 rev D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_00011179 ; ICH3
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_2449&SUBSYS_FF011179

[Fujitsu.NTamd64]
%PCIE100B.DeviceDesc%            = D102SC.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_111510CF
%PCIE100PLUSEMBLOM.DeviceDesc%   = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_118810CF
%PCIE100B.DeviceDesc%            = D101MG.ndi,   PCI\VEN_8086&DEV_1229&SUBSYS_107010CF

[Dlink.NTamd64]
%DL_EMBLOM.DeviceDesc%           = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_78011186

[Samsung.NTamd64]
%PCIE100EMBEDDED.DeviceDesc%     = D110K.ndi,    PCI\VEN_8086&DEV_2449&SUBSYS_2503144D

%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_5350107B
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_B009144D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_C000144D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_C001144D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_C002144D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_C003144D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_C006144D
%PCIE100EMBLOM.DeviceDesc%       = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_C007144D

[Trigem.NTamd64]
%PCIE100EMBLOM.DeviceDesc% = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_315D109F
%PCIE100EMBLOM.DeviceDesc% = D110KMP.ndi,  PCI\VEN_8086&DEV_1031&SUBSYS_3181109F

;---------------
; 82557 Rev 1, 2
;
[E100B.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[E100B.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;---------------
; 82558 Rev 4, 5
;
[D101.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;---------------
; 82558 Rev 4, 5 Dual Port
;
[D101DP.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101DP.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog



;------------
; 82559 Rev 8 Dual Port
;
[D101MDP.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg,LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101MDP.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;------------
; 82559 Rev 8
;
[D101M.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg,LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101M.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;------------
; 82559 Rev 8
;
[D101Lion.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101Lion.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--------------------
; 82559 Rev 8 Generic  
;
[D101MG.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg,  LargeSendOffload.reg, e100b.ndi.NT.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101MG.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;----------------------
;  82559 Rev 9 Security
;
[D101S.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = Security.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101S.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;-------------------
; 82550 Rev C Client
;
[D102SC.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg, Security.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102SC.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;------------
; 82550 Rev C
;
[D102SCN.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102SCN.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;---------------------
; 82550 Rev C Security Server
;
[D102SSC.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg, Security.reg, SecSerDef.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102SSC.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;------------
; 82550 Rev C Server
;
[D102SSCN.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102SSCN.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev D Server
;
[D102mS.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg, Security.reg, SecSerDef.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102mS.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev D Server Dual Port
;
[D102mSDP.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg, Security.reg, SecSerDef.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102mSDP.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev D Client
;
[D102mC.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg, Security.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102mC.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev D Client
;
[D102mCm.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg,  e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg, Security.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102mCm.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev D Server NoDes
;
[D102m0DP.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D102m0DP.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev F Lavon
;
[Lavon.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[Lavon.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--- 82550 Rev F Mobile
;
[Lavonmb.ndi.NTamd64]
Characteristics = 0x84
BusType         = 5
DelReg          = TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg,  e100b.ndi.NT.reg
AddReg          = CSumOffload.reg, LargeSendOffload.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[Lavonmb.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;----------------------
; D101S Rev 9 -- Server
;
[D101SS.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = SpeedDpx.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, 82557.reg, 82558.reg, e100b.ndi.NT.reg
AddReg          = Security.reg, SecSerDef.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D101SS.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;--------------
; D110 Ethernet
;
[D110K.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = Kinnerth.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg,Kinnereth.reg, LargeSendOffload.reg, e100b.ndi.NT.reg
AddReg          = DisableAutoPowerSave.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D110K.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;---------------------
; D110 Ethernet Mobile
;
[D110KMP.ndi.NTamd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
BusType         = 5    ; PCI
DelReg          = Kinnerth.DelReg, TaskOffload.DelReg
AddReg          = Speed100.reg, Kinnereth.reg,  LargeSendOffload.reg, e100b.ndi.NT.reg
AddReg          = DisableAutoPowerSave.reg
CopyFiles       = E100B_NT.ndis5.CopyFiles

[D110KMP.ndi.NTamd64.Services]
AddService = E100B, 2, e100b.Service, common.EventLog

;---------------------
; common base 10/100Mb
;
[Speed100.reg]
; Speed Duplex Mode
HKR, Ndi\params\SpeedDuplex,       ParamDesc,  0, %SpeedDuplex%
HKR, Ndi\params\SpeedDuplex,       default,    0, "0"
HKR, Ndi\params\SpeedDuplex,       type,       0, "enum"
HKR, Ndi\params\SpeedDuplex\enum,  "0",        0, %AutoDetect%
HKR, Ndi\params\SpeedDuplex\enum,  "1",        0, %10Mb-Half-Duplex%
HKR, Ndi\params\SpeedDuplex\enum,  "2",        0, %10Mb-Full-Duplex%
HKR, Ndi\params\SpeedDuplex\enum,  "3",        0, %100Mb-Half-Duplex%
HKR, Ndi\params\SpeedDuplex\enum,  "4",        0, %100Mb-Full-Duplex%


; Common 82557 NDI parameters
;
[82557.reg]
HKR,Ndi\Params\NumRfd,                ParamDesc,  0, %NumRfd%
HKR,Ndi\Params\NumRfd,                Type,       0, "int"
HKR,Ndi\Params\NumRfd,                Default,    0, "48"
HKR,Ndi\Params\NumRfd,                Min,        0, "8"
HKR,Ndi\Params\NumRfd,                Max,        0, "1024"
HKR,Ndi\Params\NumRfd,                Step,       0, "1"
HKR,Ndi\Params\NumRfd,                Base,       0, "10"

HKR,Ndi\Params\NumTcb,                ParamDesc,  0, %NumTcb%
HKR,Ndi\Params\NumTcb,                Type,       0, "int"
HKR,Ndi\Params\NumTcb,                Default,    0, "16"
HKR,Ndi\Params\NumTcb,                Min,        0, "8"
HKR,Ndi\Params\NumTcb,                Max,        0, "64"
HKR,Ndi\Params\NumTcb,                Step,       0, "1"
HKR,Ndi\Params\NumTcb,                Base,       0, "10"

HKR,Ndi\Params\NumCoalesce,           ParamDesc,  0, %NumCoalesce%
HKR,Ndi\Params\NumCoalesce,           Type,       0, "int"
HKR,Ndi\Params\NumCoalesce,           Default,    0, "8"
HKR,Ndi\Params\NumCoalesce,           Min,        0, "1"
HKR,Ndi\Params\NumCoalesce,           Max,        0, "32"
HKR,Ndi\Params\NumCoalesce,           Step,       0, "1"
HKR,Ndi\Params\NumCoalesce,           Base,       0, "10"

; Network Address
HKR, Ndi\params\NetworkAddress,        ParamDesc,  0, %NetworkAddress%
HKR, Ndi\params\NetworkAddress,        Default,    0, ""
HKR, Ndi\params\NetworkAddress,        type,       0, "edit"
HKR, NDI\params\NetworkAddress,        LimitText,  0, "12"
HKR, NDI\params\NetworkAddress,        UpperCase,  0, "1"
HKR, NDI\params\NetworkAddress,        optional,   0, "1"

; Hardwired defaults
HKR,,                                  Threshold,  0, "12"
HKR,,                                  PcNic,      0, "0"
HKR,,                                  Adaptive_IFS,0, "1"
HKR,,                                  UcodeSW,    0, "1"
HKR,,                                  Coalesce,   0, "0"
HKR,,                                  CPUSaver,   0, "1536"
HKR,,                                  MWIEnable,  0, "1"
HKR,,                                  MWIEnable,  0, "1"
HKR,,				       AutoPowerSaveModeEnabled, 0, "0"

;-----------------------------
; Disable Auto Power Save Mode
;
[DisableAutoPowerSave.reg]
HKR,,				       AutoPowerSaveModeEnabled, 0, "0"


;----------------
; 82558 specifics
;
[82558.reg]
; 802.1p/802.1q Packet Tagging
HKR,Ndi\Params\TaggingMode,         ParamDesc,  0, %TaggingMode%
HKR,Ndi\Params\TaggingMode,         Type,       0, "enum"
HKR,Ndi\Params\TaggingMode,         Default,    0, "0"
HKR,Ndi\Params\TaggingMode\Enum,    "1",        0, %Enabled%
HKR,Ndi\Params\TaggingMode\Enum,    "0",        0, %Disabled%

HKR,Ndi\Params\FlowControl,              ParamDesc,  0, %FlowControl%
HKR,Ndi\Params\FlowControl,              Type,       0, "enum"
HKR,Ndi\Params\FlowControl,              Default,    0, "0"
HKR,Ndi\Params\FlowControl\Enum,         "3",        0, %Both_On%
HKR,Ndi\Params\FlowControl\Enum,         "2",        0, %Respond%
HKR,Ndi\Params\FlowControl\Enum,         "1",        0, %Generate%
HKR,Ndi\Params\FlowControl\Enum,         "0",        0, %Off%

;----------
; Kinnereth
[Kinnereth.reg]
HKR,Ndi\Params\NumRfd,                ParamDesc,  0, %NumRfd%
HKR,Ndi\Params\NumRfd,                Type,       0, "int"
HKR,Ndi\Params\NumRfd,                Default,    0, "48"
HKR,Ndi\Params\NumRfd,                Min,        0, "8"
HKR,Ndi\Params\NumRfd,                Max,        0, "1024"
HKR,Ndi\Params\NumRfd,                Step,       0, "1"
HKR,Ndi\Params\NumRfd,                Base,       0, "10"

HKR,Ndi\Params\NumTcb,                ParamDesc,  0, %NumTcb%
HKR,Ndi\Params\NumTcb,                Type,       0, "int"
HKR,Ndi\Params\NumTcb,                Default,    0, "16"
HKR,Ndi\Params\NumTcb,                Min,        0, "8"
HKR,Ndi\Params\NumTcb,                Max,        0, "64"
HKR,Ndi\Params\NumTcb,                Step,       0, "1"
HKR,Ndi\Params\NumTcb,                Base,       0, "10"

HKR,Ndi\Params\NumCoalesce,           ParamDesc,  0, %NumCoalesce%
HKR,Ndi\Params\NumCoalesce,           Type,       0, "int"
HKR,Ndi\Params\NumCoalesce,           Default,    0, "8"
HKR,Ndi\Params\NumCoalesce,           Min,        0, "1"
HKR,Ndi\Params\NumCoalesce,           Max,        0, "32"
HKR,Ndi\Params\NumCoalesce,           Step,       0, "1"
HKR,Ndi\Params\NumCoalesce,           Base,       0, "10"

; Network Address
HKR, Ndi\params\NetworkAddress,        ParamDesc,  0, %NetworkAddress%
HKR, Ndi\params\NetworkAddress,        Default,    0, ""
HKR, Ndi\params\NetworkAddress,        type,       0, "edit"
HKR, NDI\params\NetworkAddress,        LimitText,  0, "12"
HKR, NDI\params\NetworkAddress,        UpperCase,  0, "1"
HKR, NDI\params\NetworkAddress,        optional,   0, "1"

HKR,,Coalesce,                                    0, "0"
HKR,,Threshold,                                   0, "12"
HKR,,UcodeSW,                                     0, "1"
HKR,,Adaptive_IFS,                                0, "1"
HKR,,TaggingMode,                                 0, "0"
HKR,,CPUSaver,                                    0, "0"
HKR,,PcNic,                                       0, "1"
HKR,,MWIEnable,                                   0, "0"
HKR,,BroadcastEnable,                             0, "1"
HKR,,EnableDynamicReducedPower,                   0, "1"
HKR,,DeviceVxDsPrefix,                            0, "e100b"
HKR,,HPQDisable,                                  0, "1"

[Kinnerth.DelReg]
HKR,Ndi\Params\AcpiWol
HKR,,AcpiWol

;--- Security
;
[Security.reg]
HKR,Ndi\Params\IPSecEnabled,     ParamDesc,  0, %Ipsecurity%
HKR,Ndi\Params\IPSecEnabled,     Type,       0, "enum"
HKR,Ndi\Params\IPSecEnabled,     Default,    0, "1"
HKR,Ndi\Params\IPSecEnabled\Enum,"0",        0, %Disabled%
HKR,Ndi\Params\IPSecEnabled\Enum,"1",        0, %Enabled%

HKR,Ndi\Params\MaxNumSecAssoc,  ParamDesc,  0, %SecurityAssociations%
HKR,Ndi\Params\MaxNumSecAssoc,  Type,       0, "int"
HKR,Ndi\Params\MaxNumSecAssoc,  Default,    0, "64"     ; Client
HKR,Ndi\Params\MaxNumSecAssoc,  Min,        0, "1"
HKR,Ndi\Params\MaxNumSecAssoc,  Max,        0, "5000"
HKR,Ndi\Params\MaxNumSecAssoc,  Step,       0, "1"
HKR,Ndi\Params\MaxNumSecAssoc,  Base,       0, "10"

HKR,,IPSecTunnelMode, 2, "1"

[SecSerDef.reg]
HKR,Ndi\Params\MaxNumSecAssoc,  Default,    0, "1000"   ; Server


;--- Checksum Offload
;
[CSumOffload.reg]
HKR,Ndi\Params\ChecksumEnabled,     ParamDesc,  0, %Checksum_str%
HKR,Ndi\Params\ChecksumEnabled,     Type,       0, "enum"
HKR,Ndi\Params\ChecksumEnabled,     Default,    0, "1"
HKR,Ndi\Params\ChecksumEnabled\Enum,"0",        0, %Disabled%
HKR,Ndi\Params\ChecksumEnabled\Enum,"1",        0, %Enabled%

;--- Large Send Offload
;
[LargeSendOffload.reg]
HKR,Ndi\Params\LargeSendEnabled,     ParamDesc,  0, %LargeSend_str%
HKR,Ndi\Params\LargeSendEnabled,     Type,       0, "enum"
HKR,Ndi\Params\LargeSendEnabled,     Default,    0, "1"
HKR,Ndi\Params\LargeSendEnabled\Enum,"0",        0, %Disabled%
HKR,Ndi\Params\LargeSendEnabled\Enum,"1",        0, %Enabled%

;---------------------------
; NT NDI object registration
;
[E100B.ndi.NT.reg]
HKR,Ndi\Interfaces, UpperRange, 0, "ndis5"
HKR,Ndi\Interfaces, LowerRange, 0, "ethernet"
HKR,Ndi,            Service,    0, "E100B"

HKR,,LogErrorMessages, 0, "1"

[E100B_NT.ndis5.CopyFiles]
eFE5b32e.sys,,,2

;-----------
; NT Service 32
;
[e100b.Service]
DisplayName     = %e100bnt.Service.DispName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\efe5b32e.sys
LoadOrderGroup  = NDIS

;---------------
; NT Common base
;
[common.EventLog]
AddReg = common.AddEventLog.reg

[common.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll;%%SystemRoot%%\system32\drivers\efe5b32e.sys"
HKR, , TypesSupported,   0x00010001, 7

;------------
; Copy files
;
[DestinationDirs]
E100B_NT.ndis5.CopyFiles      = 12

[SpeedDpx.DelReg]
HKR,Ndi\Params\Speed
HKR,Ndi\Params\ForceDpx
HKR,Ndi\Params\PacketTagging
HKR,,Speed
HKR,,ForceDpx
HKR,,PacketTagging

[TaskOffload.DelReg]
HKR,Ndi\Params\TaskOffload
HKR,,TaskOffload

;--------------------
; Localizable Strings
;
[Strings]
; Vendors
Msft                     = "Microsoft"
Intel                    = "Intel"
HPTX                     = "Hewlett Packard"
IBM                      = "IBM"
NEC                      = "NEC"
FUJSIE                   = "Fujitsu Siemens"
Acer                     = "Acer"
Actiontec                = "Actiontec"
Toshiba                  = "Toshiba"
Dlink                    = "D-Link"
Fujitsu                  = "Fujitsu"
Samsung                  = "Samsung"
Trigem                   = "Trigem"

; Parameters
AutoDetect               = "Auto Detect"
SpeedDuplex              = "Link Speed & Duplex"
10Mb-Half-Duplex         = "10Mbps/Half Duplex"
10Mb-Full-Duplex         = "10Mbps/Full Duplex"
100Mb-Half-Duplex        = "100Mbps/Half Duplex"
100Mb-Full-Duplex        = "100Mbps/Full Duplex"
NetworkAddress           = "Locally Administered Address"
NumRfd                   = "Receive Buffers"
NumTcb                   = "Transmit Control Blocks"
NumCoalesce              = "Coalesce Buffers"
TaggingMode              = "802.1p QoS Packet Tagging"
Enabled                  = "Enabled"
Disabled                 = "Disabled"
FlowControl              = "Flow Control Settings"
Both_On                  = "Respond and Generate"
Respond                  = "Respond"
Generate                 = "Generate"
On                       = "On"
Off                      = "Off"
Adaptive_Link_Response   = "Adaptive Link Response"

 
PhyPhoneSpeed            = "Phoneline Transmit Speed"
PhyPhonePower            = "Phoneline Power Level"
PhyGiladIfs              = "Inter Frame Spacing"

High                     = "High"
Low                      = "Low"
None                     = "None"
Ipsecurity               = "IP Security"
Checksum_str             = "Checksum"
LargeSend_str            = "Large Send"

SecurityAssociations     = "Security Associations"


; Device descriptions
PCIE100B.DeviceDesc       = "Intel 8255x-based PCI Ethernet Adapter (10/100)"
PCIE100PLUS.DeviceDesc    = "Intel(R) PRO/100+ PCI Adapter"
PCIE100MAN.DeviceDesc     = "Intel(R) PRO/100+ Management Adapter"
PCIE100SERVERW.DeviceDesc = "Intel(R) PRO/100+ Server Adapter (PILA8470B)"
PCIE100DUAL.DeviceDesc    = "Intel(R) PRO/100+ Dual Port Server Adapter"
PCIE100AOL.DeviceDesc     = "Intel(R) PRO/100+ Alert On LAN 2* Adapter"
PCIE100MANAOL.DeviceDesc  = "Intel(R) PRO/100+ Management Adapter with Alert On LAN*"
PCIE100MANAOLGC.DeviceDesc= "Intel(R) PRO/100+ Management Adapter with Alert On LAN* GC"
PCIE100MANAOLGS.DeviceDesc= "Intel(R) PRO/100+ Management Adapter with Alert On LAN* G Server"
I559IFE.DeviceDesc        = "Intel(R) 82559 Fast Ethernet LAN on Motherboard"
I559IFEAOL.DeviceDesc     = "Intel(R) 82559 Fast Ethernet LOM with Basic Alert on LAN*"
I559IFEAOLCPQ.DeviceDesc  = "Intel(R) 82559 Fast Ethernet LOM with Alert on LAN*"
I559IFEAOLII.DeviceDesc   = "Intel(R) 82559 Fast Ethernet LOM with Alert on LAN 2*"
PCIE100S.DeviceDesc       = "Intel(R) PRO/100 S Management Adapter"
PCIE100SADV.DeviceDesc    = "Intel(R) PRO/100 S Advanced Management Adapter"
PCIE100SSVR.DeviceDesc    = "Intel(R) PRO/100 S Server Adapter"
I559CLONPCI.DeviceDesc    = "Intel(R) PRO/100 S Mobile LAN on Motherboard"
PCIE100EMBEDDED.DeviceDesc     = "Intel(R) PRO/100 VE Desktop Adapter"
PCIE100PLUSEMBEDDED.DeviceDesc = "Intel(R) PRO/100 VM Desktop Adapter"
PCIE100EMBLOM.DeviceDesc     = "Intel(R) PRO/100 VE Network Connection"
PCIE100PLUSEMBLOM.DeviceDesc = "Intel(R) PRO/100 VM Network Connection"
PCIE100EMBMP.DeviceDesc      = "Intel(R) PRO/100 P Mobile Adapter"
PCIE100EMBMPC.DeviceDesc     = "Intel(R) PRO/100 P Mobile Combo Adapter"
PCIE100EMBLON.DeviceDesc     = "Intel(R) PRO/100 Network Connection"
PCIE100SC0.DeviceDesc       = "Intel(R) PRO/100 Desktop Adapter"
PCIE100SC1.DeviceDesc       = "Intel(R) PRO/100 S Desktop Adapter"
PCIE100SC3.DeviceDesc       = "Intel(R) PRO/100 S Desktop Adapter"
PCIE100SSVRC0.DeviceDesc    = "Intel(R) PRO/100 Server Adapter"
PCIE100SSVRC1.DeviceDesc    = "Intel(R) PRO/100 S Server Adapter"
PCIE100SSVRC3.DeviceDesc    = "Intel(R) PRO/100 S Server Adapter"
PCIE100DUALS0.DeviceDesc    = "Intel(R) PRO/100 Dual Port Server Adapter"
PCIE100DUALSx.DeviceDesc    = "Intel(R) PRO/100 S Dual Port Server Adapter"
PCIE100S0L.DeviceDesc      = "Intel(R) PRO/100 Network Connection"
PCIE100SxL.DeviceDesc      = "Intel(R) PRO/100 S Network Connection"
PCIE100LAVON.DeviceDesc    = "Intel(R) PRO/100 M Desktop Adapter"
PCIE100LAVONMB.DeviceDesc  = "Intel(R) PRO/100 M Mobile Network Connection"
PCIE100CICHEMBEDDED.DeviceDesc   = "Intel(R) 82562 based Fast Ethernet Connection"
IBMFE1.DeviceDesc         = "IBM 10/100 EtherJet PCI Adapter"
IBMFE2.DeviceDesc         = "IBM Netfinity 10/100 Ethernet Adapter"
IBMFE3.DeviceDesc         = "IBM 10/100 EtherJet PCI Management Adapter"
IBMFE4.DeviceDesc         = "IBM 10/100 EtherJet PCI Adapter with Alert on LAN"
IBMFE5.DeviceDesc         = "IBM 10/100 EtherJet Secure Management Adapter"
IBMFE6.DeviceDesc         = "IBM 10/100 EtherJet Secure Management Adapter"
IBMFE7.DeviceDesc         = "IBM Netfinity 10/100 Ethernet Security Adapter"
IBMFE8.DeviceDesc         = "IBM Netfinity 10/100 Ethernet Security Adapter"
IBMFE9.DeviceDesc         = "IBM 10/100 EtherJet Integrated LAN with Alert on LAN"
IBMFEA.DeviceDesc         = "IBM Netfinity 10/100 Ethernet Security Adapter 2"
IBMFEB.DeviceDesc         = "IBM 10/100 Dual Port Server Adapter"
IBMFEK.DeviceDesc         = "Intel(R) PRO/100 VE Desktop Connection"
IBMFES.DeviceDesc         = "IBM iSeries 2892 10/100 Ethernet Port"

HPTX1.DeviceDesc          = "HP NetServer 10/100TX PCI LAN Adapter"

NEC82559BASED.DeviceDesc  = "NEC 82559-based Fast Ethernet Adapter"
PKUGX06.DeviceDesc        = "NEC PK-UG-X006(PCI) or compatible Fast Ethernet Adapter"
9821XB06.DeviceDesc       = "NEC PC-9821X-B06(PCI) or compatible/Intel 82557-based Ethernet"

PCIACER1.DeviceDesc       = "ACER NIC-559A PRO/100+ with Alert On LAN 2*"
PCIACER2.DeviceDesc       = "ACER NIC-559A PRO/100+ with WOL"
PCIACER3.DeviceDesc       = "ACER T62L158 PRO/100+ with Alert On LAN 2*"

I558IFEWFMSI1.DeviceDesc  = "Fujitsu Siemens Computers 82558-based Onboard Ethernet with WoL"
I559IFESI2.DeviceDesc     = "Fujitsu Siemens Computers 82559-based Onboard Ethernet with WoL"
I559IFEAOLSI3.DeviceDesc  = "Fujitsu Siemens Computers 82559-based Onboard Ethernet with WoL and AoL"
I558IFESI4.DeviceDesc     = "Fujitsu Siemens Computers Server Onboard LAN with Intel 82558"
I558IFESI5.DeviceDesc     = "Fujitsu Siemens Computers Server Onboard LAN with Intel 82558"
I559IFEAOLSI6.DeviceDesc  = "Fujitsu Siemens Computers Server Onboard LAN with Intel 82559C"

SamsungICH2p.DeviceDesc      = "Samsung HomePNA 1M CNR"
DL_EMBLOM.DeviceDesc         = "Intel(R) PRO/100 VE Adapter"
Toshiba82559B.DeviceDesc     = "Intel 8255x-based Fast Ethernet"


e100bnt.Service.DispName = "Intel(R) PRO Adapter Driver"
