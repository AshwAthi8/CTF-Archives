; MONITOR6.INF
;
; This is a Setup information file for monitors
; supported in the Windows 2000 product.
;
; Copyright (c) Microsoft Corporation.  All rights reserved.

[VERSION]
Signature="$CHICAGO$"
Class=Monitor
ClassGUID={4d36e96e-e325-11ce-bfc1-08002be10318}
Provider=%MS%
DriverVer=10/01/2002,5.2.3790.1830


;-------------------------------------------------
; Manufacturers

[Manufacturer]
%Nihon-ADI%=Nihon-ADI,NTamd64
%Nokia%=Nokia,NTamd64
%Oki-J%=Oki,NTamd64
%PackardBell%=PackardBell,NTamd64
%Panasonic%=Panasonic,NTamd64
%Philips%=Philips,NTamd64


;-------------------------------------------------
; Manufacturer Sections

[Nihon-ADI.NTamd64]
%MicroScan17X%=MicroScan17X.Ins, Monitor\ADI0140
%MicroScan4V%=MicroScan4V.Ins, Monitor\ADI0940
%MicroScan5V%=MicroScan5V.Ins, Monitor\ADI0D40
%MicroScan17%=MicroScan17.Ins, Monitor\ADI1150
%MicroScan6G%=MicroScan6G.Ins, Monitor\ADI1240
%DuoMultimediaPack%=DuoMultimediaPack.Ins, Monitor\ADI1330
%MicroScan5G-GD%=MicroScan5G-GD.Ins, Monitor\ADI1430

[Nokia.NTamd64]
%NOKIA_449Xa%=NOKIA_449Xa, Monitor\NOK0081
%NOKIA_449XaPlus%=NOKIA_449XaPlus, Monitor\NOK0082
%NOKIA_449Xi%=NOKIA_449Xi, Monitor\NOK0089
%NOKIA_449XiPlus%=NOKIA_449XiPlus, Monitor\NOK008A
%NOKIA_449M%=NOKIA_449M, Monitor\NOK008D
%NOKIA_449X%=NOKIA_449X, Monitor\NOK0098
%NOKIA_447Xa%=NOKIA_447Xa, Monitor\NOK00A1
%NOKIA_447KC%=NOKIA_447KC, Monitor\NOK00A3
%NOKIA_447Xi%=NOKIA_447Xi, Monitor\NOK00A9
%NOKIA_447XiPlus%=NOKIA_447XIPLUS.Install, Monitor\NOK00AA
%NOKIA_447KA%=NOKIA_447KA, Monitor\NOK00AB
%NOKIA_447M%=NOKIA_447M, Monitor\NOK00AD
%NOKIA_447W%=NOKIA_447W, Monitor\NOK00B7
%NOKIA_447X%=NOKIA_447X, Monitor\NOK00B8
%NOKIA_447DTC%=NOKIA_447DTC.Install, Monitor\NOK00B9
%NOKIA_447Za%=NOKIA_447Za, Monitor\NOK00BA
%NOKIA_447Xav%=NOKIA_447Xav, Monitor\NOK00BB
%NOKIA_447K%=NOKIA_447K, Monitor\NOK00BC
%NOKIA_445Xav%=NOKIA_445Xav, Monitor\NOK00C1
%NOKIA_445Xi%=NOKIA_445Xi, Monitor\NOK00C9
%NOKIA_445XIPLUS%=NOKIA_445XIPLUS.Install, Monitor\NOK00CA
%NOKIA_445R%=NOKIA_445R, Monitor\NOK00D2
%NOKIA_445X%=NOKIA_445X, Monitor\NOK00D8
%NOKIA_446Xpro%=NOKIA_446Xpro, Monitor\NOK0150
%NOKIA_446XS%=NOKIA_446XS.Install, Monitor\NOK0153
%NOKIA_447Xavc%=NOKIA_447Xavc, Monitor\NOK01A0
%NOKIA_447Xpro%=NOKIA_447Xpro, Monitor\NOK01B0
%NOKIA_447XS%=NOKIA_447XS.Install, Monitor\NOK01B3
%NOKIA_445Xavc%=NOKIA_445Xavc, Monitor\NOK01C0
%NOKIA_445Xpro%=NOKIA_445Xpro, Monitor\NOK01D0
%NOKIA_300Xa%=NOKIA_300Xa, Monitor\NOK1300
%NOKIA_500XA%=NOKIA_500XA.Install, Monitor\NOK1500

[Oki.NTamd64]
%OkiGD2070%=OkiGD2070.Ins, Monitor\OKI0001
%GD2011%=GD2011.Install, Monitor\OKI07DB
%OkiGD2021A%=OkiGD2021A.Ins, Monitor\OKI07E5
%GD2022%=GD2022.Install, Monitor\OKI07E6
%OkiGD2051%=OkiGD2051.Ins, Monitor\OKI0803
%GD2061%=GD2061.Install, Monitor\OKI080D
%GD2071%=GD2071.Install, Monitor\OKI0817

[PackardBell.NTamd64]
%PB1024S%=PB1024S, Monitor\PBN4234
%PBN4483%=PBN4483, Monitor\PBN4483
%PB2024S%=PB2024S, Monitor\PBN5234
%PBN5483%=PBN5483, Monitor\PBN5483
%PBN7483%=PBN7483, Monitor\PBN7483

[Panasonic.NTamd64]
%Monitor\MEI0C3C.DeviceDesc%=PANA17_69_160, Monitor\MEI0C3C
%JPH1734-MON%=JPH1734-MON.Ins, Monitor\MEI0C4A
%DMD_MonitorW06%=PANA17_95_180, Monitor\MEI0C81
%SL70i%=SL70i.Install, Monitor\MEI0C96
%PL70i%=PL70i.Install, Monitor\MEI0C9B
%Monitor\MEI1006.DeviceDesc%=PANA17_86_160_1, Monitor\MEI1006
%DMD_MonitorW01%=PANA17_86_160, Monitor\MEI1007
%SL90%=SL90.Install, Monitor\MEI120D
%TX-D2151W%=TX-D2151W, Monitor\MEI1604
%TX-D2151NM%=TX-D2151NM, Monitor\MEI1610
%Monitor\MEI1637.DeviceDesc%=PANA21_95_160, Monitor\MEI1637
%DMD_MonitorW09%=PANA21_95_180, Monitor\MEI1649
%DMD_MonitorW13%=PANA14L_61_77, Monitor\MEI1E02
%LC50S%=LC50S.Install, Monitor\MEI1E07
%TAMACO_MonitorM04%=PANA15_67_120, Monitor\MEI2622
%TAMACO_MonitorW01%=PANA15_69_180, Monitor\MEI2632
%TAMACO_MonitorW03%=PANA15_61_120, Monitor\MEI2637
%TX-D1734-J%=TX-D1734-J.Ins, Monitor\MEI3132
%TX-D1733F-J%=TX-D1733F-J.Ins, Monitor\MEI3144
%TX-D1734F-J%=TX-D1734F-J.Ins, Monitor\MEI3171
%TX-D7P53-J%=TX-D7P53-J.Ins, Monitor\MEI4102
%TX-D2151-J%=TX-D2151-J.Ins, Monitor\MEI5650
%TX-D2162-J%=TX-D2162-J.Ins, Monitor\MEI5679
%TX-D2171-J%=TX-D2171-J.Ins, Monitor\MEI5694
%TX-D4L31-J%=TX-D4L31-J.Ins, Monitor\MEI7681
%CF-L10TBJP%=CF-L10TBJP.Ins, Monitor\MEIFE00
%CF-L10SBJP%=CF-L10SBJP.Ins, Monitor\MEIFE01
%CF-L10TAJP2%=CF-L10TAJP2.Ins, Monitor\MEIFE02
%CF-L10TCJP2%=CF-L10TCJP2.Ins, Monitor\MEIFE03
%CF-L10TPJP%=CF-L10TPJP.Ins, Monitor\MEIFE05
%CF-L15TCJM%=CF-L15TCJM.Ins, Monitor\MEIFE0D
%CF-L15TMJM%=CF-L15TMJM.Ins, Monitor\MEIFE12
%CF-L15TRJM%=CF-L15TRJM.Ins, Monitor\MEIFE13

[Philips.NTamd64]
%0001%=0001.Install, Monitor\PHL0001
%0004%=0004.Install, Monitor\PHL0004
%0005%=0005.Install, Monitor\PHL0005
%0045%=0045.Install, Monitor\PHL0045
%PHL-0107%=PHL-0107.Install, Monitor\PHL0107
%PH_CM0200_15C%=PH_CM0200_15C, Monitor\PHL0200
%PH_CM0201%=PH_CM0201, Monitor\PHL0201
%PH_CM0500%=PH_CM0500, Monitor\PHL0500
%PH_CM0700_20T%=PH_CM0700_20T, Monitor\PHL0700
%PH_CM0800_14B%=PH_CM0800_14B, Monitor\PHL0800
%0801%=0801.Install, Monitor\PHL0801
%0802%=0802.Install, Monitor\PHL0802
%1021%=1021.Install, Monitor\PHL1021
%PHL-104B%=PHL-104B.Install, Monitor\PHL104B
%104E%=104E.Install, Monitor\PHL104E
%PHL-105A%=PHL-105A.Install, Monitor\PHL105A
%105B%=105B.Install, Monitor\PHL105B
%PHL-105C%=PHL-105C.Install, Monitor\PHL105C
%105E%=105E.Install, Monitor\PHL105E
%107B%=107B.Install, Monitor\PHL107B
%PHL-107C%=PHL-107C.Install, Monitor\PHL107C
%107E%=107E.Install, Monitor\PHL107E
%PHL-1107%=PHL-1107.Install, Monitor\PHL1107
%PHL-1109%=PHL-1109.Install, Monitor\PHL1109
%1121%=1121.Install, Monitor\PHL1121
%114B%=114B.Install, Monitor\PHL114B
%115B%=115B.Install, Monitor\PHL115B
%115C%=115C.Install, Monitor\PHL115C
%PH_CM1200%=PH_CM1200, Monitor\PHL1200
%1207%=1207.Install, Monitor\PHL1207
%1209%=1209.Install, Monitor\PHL1209
%140C%=140C.Install, Monitor\PHL140C
%1500%=1500.Install, Monitor\PHL1500
%150A%=150A.Install, Monitor\PHL150A
%150B%=150B.Install, Monitor\PHL150B
%1510%=1510.Install, Monitor\PHL1510
%PH_CM1800%=PH_CM1800, Monitor\PHL1800
%1810%=1810.Install, Monitor\PHL1810
%PH_CM0200_14B%=PH_CM0200_14B, Monitor\PHL2000
%200B%=200B.Install, Monitor\PHL200B
%PHL-200D%=PHL-200D.Install, Monitor\PHL200D
%PHL-201A%=PHL-201A.Install, Monitor\PHL201A
%PHL-201B%=PHL-201B.Install, Monitor\PHL201B
%207A%=207A.Install, Monitor\PHL207A
%221A%=221A.Install, Monitor\PHL221A
%PH_17TCM26%=PH_17TCM26, Monitor\PHL2600
%PH_17BCM28%=PH_17BCM28, Monitor\PHL2800
%PHL-3109%=PHL-3109.Install, Monitor\PHL3109
%PH_17ACM38%=PH_17ACM38, Monitor\PHL3800
%PHL-4109%=PHL-4109.Install, Monitor\PHL4109
%PHL-4500%=PHL-4500.Install, Monitor\PHL4500
%454C%=454C.Install, Monitor\PHL454C
%5109%=5109.Install, Monitor\PHL5109
%554E%=554E.Install, Monitor\PHL554E
%PH_CM5600%=PH_CM5600, Monitor\PHL5600
%560C%=560C.Install, Monitor\PHL560C
%5705%=5705.Install, Monitor\PHL5705
%5706%=5706.Install, Monitor\PHL5706
%5707%=5707.Install, Monitor\PHL5707
%570B%=570B.Install, Monitor\PHL570B
%29PX8031%=29PX8031, Monitor\PHL5F1F
%PHL-107B%=PHL-107B.Install, Monitor\PHL6800
%PH_CM0700_21B%=PH_CM0700_21B, Monitor\PHL700B
%770C%=770C.Install, Monitor\PHL770C
%770D%=770D.Install, Monitor\PHL770D
%770E%=770E.Install, Monitor\PHL770E
%770F%=770F.Install, Monitor\PHL770F
%792B%=792B.Install, Monitor\PHL792B
%796A%=796A.Install, Monitor\PHL796A
%PH_CM0800_14A%=PH_CM0800_14A, Monitor\PHL8000
%907A%=907A.Install, Monitor\PHL907A
%992C%=992C.Install, Monitor\PHL992C
%996B%=996B.Install, Monitor\PHL996B
%PHL-105B%=PHL-105B.Install, Monitor\PHLA15B
%PHL-A17B%=PHL-A17B.Install, Monitor\PHLA17B
%PHL-A17C%=PHL-A17C.Install, Monitor\PHLA17C
%PD5029S%=PD5029S, Monitor\PHLA513
%PHL-B14B%=PHL-B14B.Install, Monitor\PHLB14B
%B15B%=B15B.Install, Monitor\PHLB15B
%PHL-B15C%=PHL-B15C.Install, Monitor\PHLB15C
%B17B%=B17B.Install, Monitor\PHLB17B
%B17C%=B17C.Install, Monitor\PHLB17C
%B17D%=B17D.Install, Monitor\PHLB17D
%B17E%=B17E.Install, Monitor\PHLB17E
%B17F%=B17F.Install, Monitor\PHLB17F
%B19A%=B19A.Install, Monitor\PHLB19A
%E001%=E001.Install, Monitor\PHLE001
%E002%=E002.Install, Monitor\PHLE002
%E003%=E003.Install, Monitor\PHLE003
%E004%=E004.Install, Monitor\PHLE004
%E005%=E005.Install, Monitor\PHLE005
%E007%=E007.Install, Monitor\PHLE007
%E008%=E008.Install, Monitor\PHLE008


;-------------------------------------------------
; Install sections

; -------------- Nihon-ADI
[MicroScan17X.Ins]
DelReg=DCR
AddReg=MicroScan17X.reg, 1280, DPMS

[MicroScan4V.Ins]
DelReg=DCR
AddReg=MicroScan4V.reg, 1280, DPMS

[MicroScan5V.Ins]
DelReg=DCR
AddReg=MicroScan5V.reg, 1280, DPMS

[MicroScan17.Ins]
DelReg=DCR
AddReg=MicroScan17.reg, 1600, DPMS

[MicroScan6G.Ins]
DelReg=DCR
AddReg=MicroScan6G.reg, 1600, DPMS

[DuoMultimediaPack.Ins]
DelReg=DCR
AddReg=DuoMultimediaPack.reg, 1280, DPMS

[MicroScan5G-GD.Ins]
DelReg=DCR
AddReg=MicroScan5G-GD.reg, 1600, DPMS

; -------------- Nokia
[NOKIA_449Xa]
DelReg=DCR
AddReg=NOKIA_449Xa.AddReg, 1024, DPMS

[NOKIA_449XaPlus]
DelReg=DCR
AddReg=NOKIA_449XaPlus.AddReg, 1152B, DPMS

[NOKIA_449Xi]
DelReg=DCR
AddReg=NOKIA_449Xi.AddReg, 1024, DPMS

[NOKIA_449XiPlus]
DelReg=DCR
AddReg=NOKIA_449XiPlus.AddReg, 1152B, DPMS

[NOKIA_449M]
DelReg=DCR
AddReg=NOKIA_449M.AddReg, 1024, DPMS

[NOKIA_449X]
DelReg=DCR
AddReg=NOKIA_449X.AddReg, 1024, DPMS

[NOKIA_447Xa]
DelReg=DCR
AddReg=NOKIA_447Xa.AddReg, 1280, DPMS

[NOKIA_447KC]
DelReg=DCR
AddReg=NOKIA_447KC.AddReg, 1280, DPMS

[NOKIA_447Xi]
DelReg=DCR
AddReg=NOKIA_447Xi.AddReg, 1280, DPMS

[NOKIA_447XIPLUS.Install]
DelReg=DCR
AddReg=NOKIA_447XIPLUS.AddReg, 1280, DPMS

[NOKIA_447KA]
DelReg=DCR
AddReg=NOKIA_447KA.AddReg, 1280, DPMS

[NOKIA_447M]
DelReg=DCR
AddReg=NOKIA_447M.AddReg, 1280, DPMS

[NOKIA_447W]
DelReg=DCR
AddReg=NOKIA_447W.AddReg, 1280, DPMS

[NOKIA_447X]
DelReg=DCR
AddReg=NOKIA_447X.AddReg, 1280, DPMS

[NOKIA_447DTC.Install]
DelReg=DCR
AddReg=NOKIA_447DTC.AddReg, 1280, DPMS

[NOKIA_447Za]
DelReg=DCR
AddReg=NOKIA_447Za.AddReg, 1280, DPMS

[NOKIA_447Xav]
DelReg=DCR
AddReg=NOKIA_447Xav.AddReg, 1280, DPMS

[NOKIA_447K]
DelReg=DCR
AddReg=NOKIA_447K.AddReg, 1280, DPMS

[NOKIA_445Xav]
DelReg=DCR
AddReg=NOKIA_445Xav.AddReg, 1600, DPMS

[NOKIA_445Xi]
DelReg=DCR
AddReg=NOKIA_445Xi.AddReg, 1600, DPMS

[NOKIA_445XIPLUS.Install]
DelReg=DCR
AddReg=NOKIA_445XIPLUS.AddReg, 1600, DPMS

[NOKIA_445R]
DelReg=DCR
AddReg=NOKIA_445R.AddReg, 1600, DPMS

[NOKIA_445X]
DelReg=DCR
AddReg=NOKIA_445X.AddReg, 1600

[NOKIA_446Xpro]
DelReg=DCR
AddReg=NOKIA_446Xpro.AddReg, 1600, DPMS

[NOKIA_446XS.Install]
DelReg=DCR
AddReg=NOKIA_446XS.AddReg, 1600, DPMS

[NOKIA_447Xavc]
DelReg=DCR
AddReg=NOKIA_447Xavc.AddReg, 1280, DPMS

[NOKIA_447Xpro]
DelReg=DCR
AddReg=NOKIA_447Xpro.AddReg, 1600, DPMS

[NOKIA_447XS.Install]
DelReg=DCR
AddReg=NOKIA_447XS.AddReg, 1280, DPMS

[NOKIA_445Xavc]
DelReg=DCR
AddReg=NOKIA_445Xavc.AddReg, 1600, DPMS

[NOKIA_445Xpro]
DelReg=DCR
AddReg=NOKIA_445Xpro.AddReg, 1800, DPMS

[NOKIA_300Xa]
DelReg=DCR
AddReg=NOKIA_300Xa.AddReg, 1024, DPMS

[NOKIA_500XA.Install]
DelReg=DCR
AddReg=NOKIA_500XA.AddReg, 1024, DPMS

; -------------- Oki
[OkiGD2070.Ins]
DelReg=DCR
AddReg=OkiGD2070.reg, 1280, DPMS

[GD2011.Install]
DelReg=DCR
AddReg=GD2011.AddReg, 1600, DPMS

[OkiGD2021A.Ins]
DelReg=DCR
AddReg=OkiGD2021A.reg, 1280, DPMS

[GD2022.Install]
DelReg=DCR
AddReg=GD2022.AddReg, 1280, DPMS

[OkiGD2051.Ins]
DelReg=DCR
AddReg=OkiGD2051.reg, 1024, DPMS

[GD2061.Install]
DelReg=DCR
AddReg=GD2061.AddReg, 1024, DPMS

[GD2071.Install]
DelReg=DCR
AddReg=GD2071.AddReg, 1280, DPMS

; -------------- PackardBell
[PB1024S]
DelReg=DCR
AddReg=PB1024S.AddReg, 1024, DPMS

[PBN4483]
DelReg=DCR
AddReg=PBN4483.AddReg, 1024, DPMS

[PB2024S]
DelReg=DCR
AddReg=PB2024S.AddReg, 1024, DPMS

[PBN5483]
DelReg=DCR
AddReg=PBN5483.AddReg, 1280, DPMS

[PBN7483]
DelReg=DCR
AddReg=PBN7483.AddReg, 1280, DPMS

; -------------- Panasonic
[PANA17_69_160]
DelReg=DCR
AddReg=PANA17_69_160.AddReg, 1280, DPMS

[JPH1734-MON.Ins]
DelReg=DCR
AddReg=JPH1734-MON.reg, 1280, DPMS

[PANA17_95_180]
DelReg=DCR
AddReg=PANA17_95_180.AddReg, 1600, DPMS

[SL70i.Install]
DelReg=DCR
AddReg=SL70i.AddReg, 1280, DPMS

[PL70i.Install]
DelReg=DCR
AddReg=PL70i.AddReg, 1600, DPMS

[PANA17_86_160_1]
DelReg=DCR
AddReg=PANA17_86_160_1.AddReg, 1280, DPMS

[PANA17_86_160]
DelReg=DCR
AddReg=PANA17_86_160.AddReg, 1600, DPMS

[SL90.Install]
DelReg=DCR
AddReg=SL90.AddReg, 1600, DPMS

[TX-D2151W]
DelReg=DCR
AddReg=TX-D2151W.Add, 1600, DPMS

[TX-D2151NM]
DelReg=DCR
AddReg=TX-D2151NM.Add, 1600, DPMS

[PANA21_95_160]
DelReg=DCR
AddReg=PANA21_95_160.AddReg, 1600, DPMS

[PANA21_95_180]
DelReg=DCR
AddReg=PANA21_95_180.AddReg, 1600, DPMS

[PANA14L_61_77]
DelReg=DCR
AddReg=PANA14L_61_77.AddReg, 1024, DPMS

[LC50S.Install]
DelReg=DCR
AddReg=LC50S.AddReg, 1024, DPMS

[PANA15_67_120]
DelReg=DCR
AddReg=PANA15_67_120.AddReg, 1280, DPMS

[PANA15_69_180]
DelReg=DCR
AddReg=PANA15_69_180.AddReg, 1280, DPMS

[PANA15_61_120]
DelReg=DCR
AddReg=PANA15_61_120.AddReg, 1024, DPMS

[TX-D1734-J.Ins]
DelReg=DCR
AddReg=TX-D1734-J.reg, 1280, DPMS

[TX-D1733F-J.Ins]
DelReg=DCR
AddReg=TX-D1733F-J.reg, 1280, DPMS

[TX-D1734F-J.Ins]
DelReg=DCR
AddReg=TX-D1734F-J.reg, 1280, DPMS

[TX-D7P53-J.Ins]
DelReg=DCR
AddReg=TX-D7P53-J.reg, 1280, DPMS

[TX-D2151-J.Ins]
DelReg=DCR
AddReg=TX-D2151-J.reg, 1600, DPMS

[TX-D2162-J.Ins]
DelReg=DCR
AddReg=TX-D2162-J.reg, 1600, DPMS

[TX-D2171-J.Ins]
DelReg=DCR
AddReg=TX-D2171-J.reg, 1600, DPMS

[TX-D4L31-J.Ins]
DelReg=DCR
AddReg=TX-D4L31-J.reg, 1024, DPMS

[CF-L10TBJP.Ins]
DelReg=DCR
AddReg=CF-L10TBJP.reg, DPMS, 832

[CF-L10SBJP.Ins]
DelReg=DCR
AddReg=CF-L10SBJP.reg, DPMS, 832

[CF-L10TAJP2.Ins]
DelReg=DCR
AddReg=CF-L10TAJP2.reg, 640, DPMS

[CF-L10TCJP2.Ins]
DelReg=DCR
AddReg=CF-L10TCJP2.reg, 1024, DPMS

[CF-L10TPJP.Ins]
DelReg=DCR
AddReg=CF-L10TPJP.reg, 640, DPMS

[CF-L15TCJM.Ins]
DelReg=DCR
AddReg=CF-L15TCJM.reg, 1024, DPMS

[CF-L15TMJM.Ins]
DelReg=DCR
AddReg=CF-L15TMJM.reg, 1024, DPMS

[CF-L15TRJM.Ins]
DelReg=DCR
AddReg=CF-L15TRJM.reg, 1024, DPMS

; -------------- Philips
[0001.Install]
DelReg=DCR
AddReg=0001.AddReg, 960, DPMS

[0004.Install]
DelReg=DCR
AddReg=0004.AddReg, 1280, DPMS

[0005.Install]
DelReg=DCR
AddReg=0005.AddReg, 1920B, DPMS

[0045.Install]
DelReg=DCR
AddReg=0045.AddReg, 1024, DPMS

[PHL-0107.Install]
DelReg=DCR
AddReg=PHL-0107.AddReg, 1600, DPMS

[PH_CM0200_15C]
DelReg=DCR
AddReg=PH_CM0200_15C.Add, 1024, DPMS

[PH_CM0201]
DelReg=DCR
AddReg=PH_CM0201.Addreg, 1600, DPMS

[PH_CM0500]
DelReg=DCR
AddReg=PH_CM0500.Add, 1280, DPMS

[PH_CM0700_20T]
DelReg=DCR
AddReg=PH_CM0700_20T.Add, 1280, DPMS

[PH_CM0800_14B]
DelReg=DCR
AddReg=PH_CM0800_14B.Add, 1024, DPMS

[0801.Install]
DelReg=DCR
AddReg=0801.AddReg, 1280, DPMS

[0802.Install]
DelReg=DCR
AddReg=0802.AddReg, 1024, DPMS

[1021.Install]
DelReg=DCR
AddReg=1021.AddReg, 1800B

[PHL-104B.Install]
DelReg=DCR
AddReg=PHL-104B.AddReg, 1024, DPMS

[104E.Install]
DelReg=DCR
AddReg=104E.AddReg, 1024, DPMS

[PHL-105A.Install]
DelReg=DCR
AddReg=PHL-105A.AddReg, 1280, DPMS

[105B.Install]
DelReg=DCR
AddReg=105B.AddReg, 1280, DPMS

[PHL-105C.Install]
DelReg=DCR
AddReg=PHL-105C.AddReg, 1024, DPMS

[105E.Install]
DelReg=DCR
AddReg=105E.AddReg, 1024, DPMS

[107B.Install]
DelReg=DCR
AddReg=107B.AddReg, 1280, DPMS

[PHL-107C.Install]
DelReg=DCR
AddReg=PHL-107C.AddReg, 1280, DPMS

[107E.Install]
DelReg=DCR
AddReg=107E.AddReg, 1280, DPMS

[PHL-1107.Install]
DelReg=DCR
AddReg=PHL-1107.AddReg, 1600, DPMS

[PHL-1109.Install]
DelReg=DCR
AddReg=PHL-1109.AddReg, 1600, DPMS

[1121.Install]
DelReg=DCR
AddReg=1121.AddReg, 1800

[114B.Install]
DelReg=DCR
AddReg=114B.AddReg, 1024, DPMS

[115B.Install]
DelReg=DCR
AddReg=115B.AddReg, 1280, DPMS

[115C.Install]
DelReg=DCR
AddReg=115C.AddReg, 1024, DPMS

[PH_CM1200]
DelReg=DCR
AddReg=PH_CM1200.Add, 1280, DPMS

[1207.Install]
DelReg=DCR
AddReg=1207.AddReg, 1600, DPMS

[1209.Install]
DelReg=DCR
AddReg=1209.AddReg, 1600, DPMS

[140C.Install]
DelReg=DCR
AddReg=140C.AddReg, 1024, DPMS

[1500.Install]
DelReg=DCR
AddReg=1500.AddReg, 1024, DPMS

[150A.Install]
DelReg=DCR
AddReg=150A.AddReg, 1024, DPMS

[150B.Install]
DelReg=DCR
AddReg=150B.AddReg, 1024, DPMS

[1510.Install]
DelReg=DCR
AddReg=1510.AddReg, 1024, DPMS

[PH_CM1800]
DelReg=DCR
AddReg=PH_CM1800.Add, 1280, DPMS

[1810.Install]
DelReg=DCR
AddReg=1810.AddReg, 1280, DPMS

[PH_CM0200_14B]
DelReg=DCR
AddReg=PH_CM0200_14B.Add, 1024, DPMS

[200B.Install]
DelReg=DCR
AddReg=200B.AddReg, 1600, DPMS

[PHL-200D.Install]
DelReg=DCR
AddReg=PHL-200D.AddReg, 1600, DPMS

[PHL-201A.Install]
DelReg=DCR
AddReg=PHL-201A.AddReg, 1600, DPMS

[PHL-201B.Install]
DelReg=DCR
AddReg=PHL-201B.AddReg, 1600, DPMS

[207A.Install]
DelReg=DCR
AddReg=207A.AddReg, 1920B, DPMS, 1920B

[221A.Install]
DelReg=DCR
AddReg=221A.AddReg, 2048, DPMS, 2048

[PH_17TCM26]
DelReg=DCR
AddReg=PH_17TCM26.Add, 1280, DPMS

[PH_17BCM28]
DelReg=DCR
AddReg=PH_17BCM28.Add, 1280, DPMS

[PHL-3109.Install]
DelReg=DCR
AddReg=PHL-3109.AddReg, 1600, DPMS

[PH_17ACM38]
DelReg=DCR
AddReg=PH_17ACM38.Add, 1600B, DPMS

[PHL-4109.Install]
DelReg=DCR
AddReg=PHL-4109.AddReg, 1600, DPMS

[PHL-4500.Install]
DelReg=DCR
AddReg=PHL-4500.AddReg, 1024, DPMS

[454C.Install]
DelReg=DCR
AddReg=454C.AddReg, 1024, DPMS

[5109.Install]
DelReg=DCR
AddReg=5109.AddReg, 1280, DPMS

[554E.Install]
DelReg=DCR
AddReg=554E.AddReg, 1024, DPMS

[PH_CM5600]
DelReg=DCR
AddReg=PH_CM5600.Add, 1280, DPMS

[560C.Install]
DelReg=DCR
AddReg=560C.AddReg, DPMS, 1280C

[5705.Install]
DelReg=DCR
AddReg=5705.AddReg, 1280, DPMS

[5706.Install]
DelReg=DCR
AddReg=5706.AddReg, 1280, DPMS

[5707.Install]
DelReg=DCR
AddReg=5707.AddReg, 1280, DPMS

[570B.Install]
DelReg=DCR
AddReg=570B.AddReg, 1280, DPMS

[29PX8031]
DelReg=DCR
AddReg=29PX8031.AddReg, 800, DPMS

[PHL-107B.Install]
DelReg=DCR
AddReg=PHL-107B.AddReg, 1280, DPMS

[PH_CM0700_21B]
DelReg=DCR
AddReg=PH_CM0700_21B.Add, 1600, DPMS

[770C.Install]
DelReg=DCR
AddReg=770C.AddReg, 1280, DPMS

[770D.Install]
DelReg=DCR
AddReg=770D.AddReg, 1280, DPMS

[770E.Install]
DelReg=DCR
AddReg=770E.AddReg, 1280, DPMS

[770F.Install]
DelReg=DCR
AddReg=770F.AddReg, 1280, DPMS

[792B.Install]
DelReg=DCR
AddReg=792B.AddReg, DPMS, 1920B

[796A.Install]
DelReg=DCR
AddReg=796A.AddReg, DPMS, 1920B

[PH_CM0800_14A]
DelReg=DCR
AddReg=PH_CM0800_14A.Add, 1024, DPMS

[907A.Install]
DelReg=DCR
AddReg=907A.AddReg, DPMS, 1920B

[992C.Install]
DelReg=DCR
AddReg=992C.AddReg, DPMS, 1920B

[996B.Install]
DelReg=DCR
AddReg=996B.AddReg, DPMS, 1920B

[PHL-105B.Install]
DelReg=DCR
AddReg=PHL-105B.AddReg, 1280, DPMS

[PHL-A17B.Install]
DelReg=DCR
AddReg=PHL-A17B.AddReg, 1280, DPMS

[PHL-A17C.Install]
DelReg=DCR
AddReg=PHL-A17C.AddReg, 1280, DPMS

[PD5029S]
DelReg=DCR
AddReg=PD5029S.AddReg, 800, DPMS

[PHL-B14B.Install]
DelReg=DCR
AddReg=PHL-B14B.AddReg, 1024, DPMS

[B15B.Install]
DelReg=DCR
AddReg=B15B.AddReg, 1280, DPMS

[PHL-B15C.Install]
DelReg=DCR
AddReg=PHL-B15C.AddReg, 1024, DPMS

[B17B.Install]
DelReg=DCR
AddReg=B17B.AddReg, 1280, DPMS

[B17C.Install]
DelReg=DCR
AddReg=B17C.AddReg, 1280, DPMS

[B17D.Install]
DelReg=DCR
AddReg=B17D.AddReg, 1280, DPMS

[B17E.Install]
DelReg=DCR
AddReg=B17E.AddReg, 1280, DPMS

[B17F.Install]
DelReg=DCR
AddReg=B17F.AddReg, 1280, DPMS

[B19A.Install]
DelReg=DCR
AddReg=B19A.AddReg, 1600, DPMS

[E001.Install]
DelReg=DCR
AddReg=E001.AddReg, 1280, DPMS

[E002.Install]
DelReg=DCR
AddReg=E002.AddReg, 1920B, DPMS

[E003.Install]
DelReg=DCR
AddReg=E003.AddReg, 1920B, DPMS

[E004.Install]
DelReg=DCR
AddReg=E004.AddReg, 1280, DPMS

[E005.Install]
DelReg=DCR
AddReg=E005.AddReg, 1280, DPMS

[E007.Install]
DelReg=DCR
AddReg=E007.AddReg, 1920B, DPMS

[E008.Install]
DelReg=DCR
AddReg=E008.AddReg, 1920B, DPMS


;-------------------------------------------------
; Common AddReg sections

[DCR]
HKR,MODES
HKR,,MaxResolution
HKR,,DPMS
HKR,,ICMProfile

[1024]
HKR,,MaxResolution,,"1024,768"

[1152B]
HKR,,MaxResolution,,"1152,870"

[1280]
HKR,,MaxResolution,,"1280,1024"

[1280C]
HKR,,MaxResolution,,"1280,960"

[1600]
HKR,,MaxResolution,,"1600,1200"

[1600B]
HKR,,MaxResolution,,"1600,1280"

[1800]
HKR,,MaxResolution,,"1800,1440"

[1800B]
HKR,,MaxResolution,,"1800,1350"

[1920B]
HKR,,MaxResolution,,"1920,1440"

[2048]
HKR,,MaxResolution,,"2048,1536"

[640]
HKR,,MaxResolution,,"640,480"

[800]
HKR,,MaxResolution,,"800,600"

[832]
HKR,,MaxResolution,,"832,624"

[960]
HKR,,MaxResolution,,"1280,960"

[DPMS]
HKR,,DPMS,,1


;-------------------------------------------------
; Model AddReg sections

; -------------- Nihon-ADI
[MicroScan17X.reg]
HKR,"MODES\1280,1024",Mode1,,"30-64,50-100,+,+"

[MicroScan4V.reg]
HKR,"MODES\1280,1024",Mode1,,"30-64,50-120,+,+"

[MicroScan5V.reg]
HKR,"MODES\1280,1024",Mode1,,"30-64,50-120,+,+"

[MicroScan17.reg]
HKR,"MODES\1600,1200",Mode1,,"30-87.5,50-100,+,+"

[MicroScan6G.reg]
HKR,"MODES\1600,1200",Mode1,,"30-95,50-160,+,+"

[DuoMultimediaPack.reg]
HKR,"MODES\1280,1024",Mode1,,"30-69,50-120,+,+"

[MicroScan5G-GD.reg]
HKR,"MODES\1600,1200",Mode1,,"30-95,50-160,+,+"

; -------------- Nokia
[NOKIA_449Xa.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[NOKIA_449XaPlus.AddReg]
HKR,"MODES\1152,870",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[NOKIA_449Xi.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[NOKIA_449XiPlus.AddReg]
HKR,"MODES\1152,870",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[NOKIA_449M.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[NOKIA_449X.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[NOKIA_447Xa.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_447KC.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_447Xi.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_447XIPLUS.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-150.0,+,+"

[NOKIA_447KA.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_447M.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-110.0,+,+"

[NOKIA_447W.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-100.0,+,+"

[NOKIA_447X.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,50.0-110.0,+,+"

[NOKIA_447DTC.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-92.0,50.0-150.0,+,+"

[NOKIA_447Za.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-72.0,50.0-120.0,+,+"

[NOKIA_447Xav.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_447K.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_445Xav.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-102.0,50.0-120.0,+,+"

[NOKIA_445Xi.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-102.0,50.0-120,+,+"

[NOKIA_445XIPLUS.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-110.0,50.0-150.0,+,+"

[NOKIA_445R.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-102.0,50.0-120.0,+,+"

[NOKIA_445X.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-102.0,50.0-120.0,+,+"
HKR,,DPMS,,0

[NOKIA_446Xpro.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-150.0,+,+"

[NOKIA_446XS.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-150.0,+,+"

[NOKIA_447Xavc.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-91.0,50.0-150.0,+,+"

[NOKIA_447Xpro.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-150.0,+,+"

[NOKIA_447XS.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-150.0,+,+"

[NOKIA_445Xavc.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-102.0,50.0-120.0,+,+"

[NOKIA_445Xpro.AddReg]
HKR,"MODES\1800,1440",Mode1,,"30.0-115.0,50.0-150.0,+,+"

[NOKIA_300Xa.AddReg]
HKR,"MODES\640,480",Mode1,,"31.50-67.00,37.86-72.81,-,-"
HKR,"MODES\800,600",Mode1,,"35.16-56.25,48.08-72.19,+,+"
HKR,"MODES\1024,768",Mode1,,"48.36-60.00,56.48-75.00,-,-"

[NOKIA_500XA.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.4-60.0,56.2-75.0,-,-"

; -------------- Oki
[OkiGD2070.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[GD2011.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-96.0,50.0-160.0,+,+"

[OkiGD2021A.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-92.0,50.0-120.0,+,+"

[GD2022.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[OkiGD2051.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-110.0,+,+"

[GD2061.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[GD2071.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

; -------------- PackardBell
[PB1024S.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-90.0,-,-"

[PBN4483.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,55.0-75.0,-,-"

[PB2024S.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-90.0,+,+"

[PBN5483.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-90.0,+,+"

[PBN7483.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-90.0,+,+"

; -------------- Panasonic
[PANA17_69_160.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-69,50-160"

[JPH1734-MON.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50-160,+,+"

[PANA17_95_180.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-180.0,+,+"

[SL70i.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-180.0,+,+"

[PL70i.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-97.0,50.0-180.0,+,+"

[PANA17_86_160_1.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-86,50-160"

[PANA17_86_160.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-160.0,+,+"

[SL90.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-180.0,+,+"

[TX-D2151W.Add]
HKR,"MODES\1600,1200",Mode1,,"30-82,50-160,+,+"

[TX-D2151NM.Add]
HKR,"MODES\1600,1200",Mode1,,"30-82,50-160,+,+"

[PANA21_95_160.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-95,50-160"

[PANA21_95_180.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-180.0,+,+"

[PANA14L_61_77.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.0-61.0,50.0-77.0,+,+"

[LC50S.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,50.0-77.0,+,+"

[PANA15_67_120.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-67.0,50.0-120.0,+,+"

[PANA15_69_180.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-180.0,+,+"

[PANA15_61_120.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,50.0-120.0,+,+"

[TX-D1734-J.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[TX-D1733F-J.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[TX-D1734F-J.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[TX-D7P53-J.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,+"

[TX-D2151-J.reg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-160.0,+,+"

[TX-D2162-J.reg]
HKR,"MODES\1600,1200",Mode1,,"30.0-97.0,50.0-160.0,+,+"

[TX-D2171-J.reg]
HKR,"MODES\1600,1200",Mode1,,"30.0-115.0,50.0-160.0,+,+"

[TX-D4L31-J.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,50.0-77.0,+,+"

[CF-L10TBJP.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,-,-"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,-,+"
HKR,"MODES\640,350",Mode3,,"31.5,70.1,+,-"
HKR,"MODES\640,480",Mode4,,"37.9,72.8,-,-"
HKR,"MODES\640,400",Mode5,,"37.9,84.3,-,+"
HKR,"MODES\640,350",Mode6,,"37.9,84.3,+,-"
HKR,"MODES\640,400",Mode7,,"26.4,59.9,-,-"
HKR,"MODES\640,400",Mode8,,"24.4,55.4,-,-"
HKR,"MODES\640,400",Mode9,,"24.8,56.4,-,-"
HKR,"MODES\640,480",Mode10,,"35.0,66.7,+,+"
HKR,"MODES\800,600",Mode11,,"48.1,72.2,+,+"
HKR,"MODES\800,600",Mode12,,"37.9,60.3,+,+"
HKR,"MODES\800,600",Mode13,,"35.2,56.3,+,+"
HKR,"MODES\832,624",Mode14,,"49.7,74.6,+,+"

[CF-L10SBJP.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,-,-"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,-,+"
HKR,"MODES\640,350",Mode3,,"31.5,70.1,+,-"
HKR,"MODES\640,480",Mode4,,"37.9,72.8,-,-"
HKR,"MODES\640,400",Mode5,,"37.9,84.3,-,+"
HKR,"MODES\640,350",Mode6,,"37.9,84.3,+,-"
HKR,"MODES\640,400",Mode7,,"26.4,59.9,-,-"
HKR,"MODES\640,400",Mode8,,"24.4,55.4,-,-"
HKR,"MODES\640,400",Mode9,,"24.8,56.4,-,-"
HKR,"MODES\640,480",Mode10,,"35.0,66.7,+,+"
HKR,"MODES\800,600",Mode11,,"48.1,72.2,+,+"
HKR,"MODES\800,600",Mode12,,"37.9,60.3,+,+"
HKR,"MODES\800,600",Mode13,,"35.2,56.3,+,+"
HKR,"MODES\832,624",Mode14,,"49.7,74.6,+,+"

[CF-L10TAJP2.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,-,-"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,-,+"
HKR,"MODES\640,350",Mode3,,"31.5,70.1,+,-"
HKR,"MODES\640,480",Mode4,,"37.9,72.8,-,-"
HKR,"MODES\640,400",Mode5,,"37.9,84.3,-,+"
HKR,"MODES\640,350",Mode6,,"37.9,84.3,+,-"
HKR,"MODES\640,400",Mode7,,"26.4,59.9,-,-"
HKR,"MODES\640,400",Mode8,,"24.4,55.4,-,-"
HKR,"MODES\640,400",Mode9,,"24.8,56.4,-,-"
HKR,"MODES\640,480",Mode10,,"35.0,66.7,+,+"

[CF-L10TCJP2.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,-,-"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,-,+"
HKR,"MODES\640,350",Mode3,,"31.5,70.1,+,-"
HKR,"MODES\640,480",Mode4,,"37.9,72.8,-,-"
HKR,"MODES\640,400",Mode5,,"26.4,54.9,-,-"
HKR,"MODES\640,400",Mode6,,"24.4,55.4,-,-"
HKR,"MODES\640,400",Mode7,,"24.8,56.4,-,-"
HKR,"MODES\640,480",Mode8,,"35.0,66.7,+,+"
HKR,"MODES\800,600",Mode9,,"48.1,72.2,+,+"
HKR,"MODES\800,600",Mode10,,"37.9,60.3,+,+"
HKR,"MODES\800,600",Mode11,,"35.2,56.3,+,+"
HKR,"MODES\832,624",Mode12,,"49.7,74.6,+,+"
HKR,"MODES\1024,768",Mode13,,"56.5,70.1,+,+"
HKR,"MODES\1024,768",Mode14,,"48.4,60.0,+,+"
HKR,"MODES\1024,768",Mode15,,"60.2,75.0,+,+"

[CF-L10TPJP.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,-,-"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,-,+"
HKR,"MODES\640,350",Mode3,,"31.5,70.1,+,-"
HKR,"MODES\640,480",Mode4,,"37.9,72.8,-,-"
HKR,"MODES\640,400",Mode5,,"37.9,84.3,-,+"
HKR,"MODES\640,350",Mode6,,"37.9,84.3,+,-"
HKR,"MODES\640,400",Mode7,,"26.4,59.9,-,-"
HKR,"MODES\640,400",Mode8,,"24.4,55.4,-,-"
HKR,"MODES\640,400",Mode9,,"24.8,56.4,-,-"
HKR,"MODES\640,480",Mode10,,"35.0,66.7,+,+"

[CF-L15TCJM.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,+,+"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,+,+"
HKR,"MODES\640,480",Mode3,,"37.9,72.8,+,+"
HKR,"MODES\640,400",Mode4,,"37.9,84.3,+,+"
HKR,"MODES\640,400",Mode5,,"26.4,59.9,+,+"
HKR,"MODES\640,400",Mode6,,"24.9,56.4,+,+"
HKR,"MODES\640,480",Mode7,,"35.0,66.7,+,+"
HKR,"MODES\800,600",Mode8,,"46.9,75.0,+,+"
HKR,"MODES\800,600",Mode9,,"48.1,72.2,+,+"
HKR,"MODES\800,600",Mode10,,"37.9,60.3,+,+"
HKR,"MODES\800,600",Mode11,,"35.2,56.3,+,+"
HKR,"MODES\832,624",Mode12,,"49.7,74.6,+,+"
HKR,"MODES\1024,768",Mode13,,"56.5,70.1,+,+"
HKR,"MODES\1024,768",Mode14,,"48.4,60.0,+,+"
HKR,"MODES\1024,768",Mode15,,"60.2,75.0,+,+"

[CF-L15TMJM.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,+,+"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,+,+"
HKR,"MODES\640,480",Mode3,,"37.9,72.8,+,+"
HKR,"MODES\640,400",Mode4,,"37.9,84.3,+,+"
HKR,"MODES\640,400",Mode5,,"26.4,59.9,+,+"
HKR,"MODES\640,400",Mode6,,"24.9,56.4,+,+"
HKR,"MODES\640,480",Mode7,,"35.0,66.7,+,+"
HKR,"MODES\800,600",Mode8,,"46.9,75.0,+,+"
HKR,"MODES\800,600",Mode9,,"48.1,72.2,+,+"
HKR,"MODES\800,600",Mode10,,"37.9,60.3,+,+"
HKR,"MODES\800,600",Mode11,,"35.2,56.3,+,+"
HKR,"MODES\832,624",Mode12,,"49.7,74.6,+,+"
HKR,"MODES\1024,768",Mode13,,"56.5,70.1,+,+"
HKR,"MODES\1024,768",Mode14,,"48.4,60.0,+,+"
HKR,"MODES\1024,768",Mode15,,"60.2,75.0,+,+"

[CF-L15TRJM.reg]
HKR,"MODES\640,480",Mode1,,"31.5,59.9,+,+"
HKR,"MODES\640,400",Mode2,,"31.5,70.1,+,+"
HKR,"MODES\640,480",Mode3,,"37.9,72.8,+,+"
HKR,"MODES\640,400",Mode4,,"37.9,84.3,+,+"
HKR,"MODES\640,400",Mode5,,"26.4,59.9,+,+"
HKR,"MODES\640,400",Mode6,,"24.9,56.4,+,+"
HKR,"MODES\640,480",Mode7,,"35.0,66.7,+,+"
HKR,"MODES\800,600",Mode8,,"46.9,75.0,+,+"
HKR,"MODES\800,600",Mode9,,"48.1,72.2,+,+"
HKR,"MODES\800,600",Mode10,,"37.9,60.3,+,+"
HKR,"MODES\800,600",Mode11,,"35.2,56.3,+,+"
HKR,"MODES\832,624",Mode12,,"49.7,74.6,+,+"
HKR,"MODES\1024,768",Mode13,,"56.5,70.1,+,+"
HKR,"MODES\1024,768",Mode14,,"48.4,60.0,+,+"
HKR,"MODES\1024,768",Mode15,,"60.2,75.0,+,+"

; -------------- Philips
[0001.AddReg]
HKR,"MODES\1280,960",Mode1,,"30.0-63.0,50.0-120.0,+,-"

[0004.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[0005.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-111.0,50.0-160.0,+,-"

[0045.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-60.0,56.0-75.0,+,-"

[PHL-0107.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-160.0,+,-"

[PH_CM0200_15C.Add]
HKR,"MODES\1024,768",Mode1,,"31-48,50-100,+,-"

[PH_CM0201.Addreg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50-170,+,+"

[PH_CM0500.Add]
HKR,"MODES\1280,1024",Mode1,,"31-64,50-120,+,-"

[PH_CM0700_20T.Add]
HKR,"MODES\1280,1024",Mode1,,"30-90,50-160,+,-"

[PH_CM0800_14B.Add]
HKR,"MODES\1024,768",Mode1,,"30-58,50-100,+,-"

[0801.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,56.0-76.0,+,-"

[0802.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,-"

[1021.AddReg]
HKR,"MODES\1800,1350",Mode1,,"30.0-107.0,50.0-160.0,+,-"

[PHL-104B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,-"

[104E.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[PHL-105A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,-"

[105B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-110.0,+,-"

[PHL-105C.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,-"

[105E.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[107B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-130.0,+,-"

[PHL-107C.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-130.0,+,-"

[107E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-130.0,+,-"

[PHL-1107.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,-"

[PHL-1109.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,-"

[1121.AddReg]
HKR,"MODES\1800,1440",Mode1,,"30.0-115.0,50.0-160.0,+,-"

[114B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,-"

[115B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-110.0,+,-"

[115C.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,-"

[PH_CM1200.Add]
HKR,"MODES\1280,1024",Mode1,,"31-66,50-110,+,-"

[1207.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,-"

[1209.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-160.0,+,-"

[140C.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,-"

[1500.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,-"

[150A.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,-"

[150B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,-"

[1510.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,-"

[PH_CM1800.Add]
HKR,"MODES\1280,1024",Mode1,,"31-66,50-110,+,-"

[1810.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,56.0-76.0,+,-"

[PH_CM0200_14B.Add]
HKR,"MODES\1024,768",Mode1,,"31-48,50-100,+,-"

[200B.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-120.0,+,-"

[PHL-200D.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-90.0,50.0-160.0,+,-"

[PHL-201A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.5-107.0,50.0-170.0,+,-"

[PHL-201B.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-94.0,48.0-160.0,+,-"

[207A.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-107.0,50.0-160.0,+,-"

[221A.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-121.0,50.0-160.0,+,-"

[PH_17TCM26.Add]
HKR,"MODES\1280,1024",Mode1,,"30-66,50-100,+,-"

[PH_17BCM28.Add]
HKR,"MODES\1280,1024",Mode1,,"30-66,50-130,+,-"

[PHL-3109.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,-"

[PH_17ACM38.Add]
HKR,"MODES\1600,1280",Mode1,,"30-82,50-160,-,-"

[PHL-4109.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,-"

[PHL-4500.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-60.0,56.0-75.0,+,-"

[454C.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[5109.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,-"

[554E.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[PH_CM5600.Add]
HKR,"MODES\1280,1024",Mode1,,"31-82,50-120,+,-"

[560C.AddReg]
HKR,"MODES\1280,960",Mode1,,"30.0-60.0,50.0-120.0,+,-"

[5705.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[5706.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[5707.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[570B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[29PX8031.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5-35.2,50.0-70.0,+,+"
HKR,"MODES\800,600",Mode1,,"31.5-35.2,50.0-56.0,+,+"

[PHL-107B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-130.0,+,-"

[PH_CM0700_21B.Add]
HKR,"MODES\1600,1200",Mode1,,"30-94,50-160,+,-"

[770C.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[770D.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[770E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[770F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[792B.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-92.0,50.0-160.0,+,-"

[796A.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-96.0,50.0-160.0,+,-"

[PH_CM0800_14A.Add]
HKR,"MODES\1024,768",Mode1,,"30-58,50-100,+,-"

[907A.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-110.0,50.0-160.0,+,-"

[992C.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-92.0,50.0-160.0,+,-"

[996B.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-96.0,50.0-160.0,+,-"

[PHL-105B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-110.0,+,-"

[PHL-A17B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-130.0,+,-"

[PHL-A17C.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,-"

[PD5029S.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5-35.2,50.0-70.0,+,+"
HKR,"MODES\800,600",Mode1,,"31.5-35.2,50.0-56.0,+,+"

[PHL-B14B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[B15B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,-"

[PHL-B15C.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-60.0,50.0-120.0,+,-"

[B17B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,-"

[B17C.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[B17D.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,-"

[B17E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,-"

[B17F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,-"

[B19A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,-"

[E001.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-71.0,50.0-160.0,+,-"

[E002.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-92.0,50.0-160.0,+,-"

[E003.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-92.0,50.0-160.0,+,-"

[E004.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-71.0,50.0-160.0,+,-"

[E005.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-71.0,50.0-160.0,+,-"

[E007.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-96.0,50.0-160.0,+,-"

[E008.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-92.0,50.0-160.0,+,-"


;-------------------------------------------------
; User visible strings


[Strings]
MS="Microsoft"

Nihon-ADI="ADI"
Nokia="NOKIA"
Oki-J="OKI"
PackardBell="Packard Bell"
Panasonic="Panasonic"
Philips="Philips Consumer Electronics Co."

MicroScan17X="Micro Scan 17X"
MicroScan4V="Micro Scan 4V"
MicroScan5V="Micro Scan 5V"
MicroScan17="Micro Scan 17"
MicroScan6G="Micro Scan 6G(21inch)"
DuoMultimediaPack="Duo Multimedia Pack"
MicroScan5G-GD="Micro Scan 5G/5GD(17inch)"

Nokia_449Xa="NOKIA 449Xa"
Nokia_449XaPlus="NOKIA 449XaPlus"
Nokia_449Xi="NOKIA 449Xi"
Nokia_449XiPlus="NOKIA 449XiPlus"
Nokia_449M="NOKIA 449M"
Nokia_449X="NOKIA 449X"
Nokia_447Xa="NOKIA 447Xa"
Nokia_447KC="NOKIA 447KC"
Nokia_447Xi="NOKIA 447Xi"
Nokia_447XIPLUS="Nokia 447XiPlus"
Nokia_447KA="NOKIA 447KA"
Nokia_447M="NOKIA 447M"
Nokia_447W="NOKIA 447W"
Nokia_447X="NOKIA 447X"
Nokia_447DTC="Nokia 447DTC"
Nokia_447Za="NOKIA 447Za"
Nokia_447Xav="NOKIA 447Xav"
Nokia_447K="NOKIA 447K"
Nokia_445Xav="NOKIA 445Xav"
Nokia_445Xi="NOKIA 445Xi"
Nokia_445XIPLUS="Nokia 445XiPlus"
Nokia_445R="NOKIA 445R"
Nokia_445X="NOKIA 445X"
Nokia_446Xpro="NOKIA 446Xpro"
Nokia_446XS="Nokia 446XS"
Nokia_447Xavc="NOKIA 447Xavc"
Nokia_447Xpro="NOKIA 447Xpro"
Nokia_447XS="Nokia 447XS"
Nokia_445Xavc="NOKIA 445Xavc"
Nokia_445Xpro="NOKIA 445Xpro"
Nokia_300Xa="NOKIA 300Xa"
Nokia_500XA="Nokia 500Xa"

OkiGD2070="Oki GD2070"
GD2011="Oki GD2011"
OkiGD2021A="Oki GD2021A"
GD2022="Oki GD2022"
OkiGD2051="Oki GD2051"
GD2061="Oki GD2061"
GD2071="Oki GD2071"

PB1024S="Packard Bell 1024S"
PBN4483="Packard Bell PnP 4480"
PB2024S="Packard Bell PnP 2024S"
PBN5483="Packard Bell PnP 5480"
PBN7483="Packard Bell PnP 7480"

Monitor\MEI0C3C.DeviceDesc="Panasonic TX-D1734-J"
JPH1734-MON="JPH1734-MON"
DMD_MonitorW06="Panasonic P70"
SL70i="Panasonic SL70i(TX-D7S36)"
PL70i="Panasonic PL70i(TX-D7S55)"
Monitor\MEI1006.DeviceDesc="Panasonic TX-D17P53-J"
DMD_MonitorW01="Panasonic PF70"
SL90="Panasonic SL90 (TX-D9S54)"
TX-D2151W="Panasonic TX-D2151W-ES"
TX-D2151NM="Panasonic TX-D2151NM"
Monitor\MEI1637.DeviceDesc="Panasonic TX-D2162-J"
DMD_MonitorW09="Panasonic S110"
DMD_MonitorW13="Panasonic LC40"
LC50S="Panasonic LC50S (TX-D5L31F)"
TAMACO_MonitorM04="Panasonic S15"
TAMACO_MonitorW01="Panasonic P50"
TAMACO_MonitorW03="Panasonic E50"
TX-D1734-J="Panasonic TX-D1734-J"
TX-D1733F-J="Panasonic TX-D1733F-J"
TX-D1734F-J="Panasonic TX-D1734F-J"
TX-D7P53-J="Panasonic TX-D7P53-J"
TX-D2151-J="Panasonic TX-D2151-J"
TX-D2162-J="Panasonic TX-D2162-J"
TX-D2171-J="Panasonic TX-D2171-J"
TX-D4L31-J="Panasonic TX-D4L31-J"
CF-L10TBJP="Panasonic CF-L10TBJP"
CF-L10SBJP="Panasonic CF-L10SBJP"
CF-L10TAJP2="Panasonic CF-L10TAJP2"
CF-L10TCJP2="Panasonic CF-L10TCJP2"
CF-L10TPJP="Panasonic CF-L10TPJP"
CF-L15TCJM="Panasonic CF-L10TCJM"
CF-L15TMJM="Panasonic CF-L10TMJM"
CF-L15TRJM="Panasonic CF-L10TRJM"

0001="Philips 105S (105S2)"
0004="Philips 107E (107E2)"
0005="Philips Brilliance 109P (109P2)"
0045="Philips Brilliance 4500AX (14.5 LCD MONITOR)"
PHL-0107="PHILIPS BRILLIANCE 107(17inch/CM8800)"
PH_CM0200_15C="Philips CM0200 (15C)"
PH_CM0201="Philips Brilliance 201CS"
PH_CM0500="Philips CM0500 (20C)"
PH_CM0700_20T="Philips CM0700 (20T)"
PH_CM0800_14B="Philips CM0800 (15B)"
0801="Philips 170B (17inch MONITOR)"
0802="Philips 150X (15inch LCD MONITOR)"
1021="Philips Brilliance 201B (PRODUCT ID 21B58...)"
PHL-104B="PHILIPS 104B(14inch/CM1300)"
104E="Philips 104E"
PHL-105A="PHILIPS BRILLIANCE 105(15inch/CM2200)"
105B="Philips 105B (15inch/CM1200)"
PHL-105C="PHILIPS 105S(15inch/CM1300)"
105E="Philips 105E"
107B="Philips 107B (17inch/CM6800)"
PHL-107C="PHILIPS 107S(17inch/CM6800)"
107E="Philips 107E"
PHL-1107="PHILIPS BRILLIANCE 107(PRODUCT ID 17A58...)"
PHL-1109="PHILIPS BRILLIANCE 109(PRODUCT ID 19A58...)"
1121="Philips Brilliance 201P (PRODUCT ID 21A58...)"
114B="Magnavox MB4010 (14inch/CM1300)"
115B="Magnavox MB5314 (15inch/CM1200)"
115C="Magnavox MB5011 (15inch/CM1300)"
PH_CM1200="Philips CM1200 (15A)"
1207="Philips Brilliance 107MP (17inch/CM5800)"
1209="Philips Brilliance 109MP (19inch/CM5800)"
140C="Philips 140S"
1500="Philips 150B (15.0 LCD MONITOR)"
150A="Philips Brilliance 150P"
150B="Philips 150B"
1510="Philips Brilliance 151AX (15.1 LCD MONITOR)"
PH_CM1800="Philips CM1800 (15A)"
1810="Philips Brilliance 181AS (18.1 LCD MONITOR)"
PH_CM0200_14B="Philips CM0200 (14B)"
200B="Philips 200B (20inch/CM5600)"
PHL-200D="PHILIPS 200T(20inch/CM0700)"
PHL-201A="PHILIPS BRILLIANCE 201(21inch/CM1700)"
PHL-201B="PHILIPS 201B(21inch/CM0770)"
207A="Philips 201B (201B1)"
221A="Philips Brilliance 201P (201P1)"
PH_17TCM26="Philips 17TCM26"
PH_17BCM28="Philips 17BCM28"
PHL-3109="PHILIPS Magnavox 109S"
PH_17ACM38="Philips 17ACM38"
PHL-4109="PHILIPS 109S"
PHL-4500="PHILIPS BRILLIANCE AX4500(14.5 LCD MONITOR)"
454C="Philips 104S (104S1)"
5109="Philips 109S/86"
554E="Philips 105E (105E1)"
PH_CM5600="Philips CM5600 (20B)"
560C="Philips 105S (105S1)"
5705="Philips 105G (105B1)"
5706="Philips 105A (105B1)"
5707="Philips 105MG (105B1)"
570B="Philips 105B (105B1)"
29PX8031="Philips 29PX8031 Monitor/TV"
PHL-107B="PHILIPS 107B(17inch/CM6800)"
PH_CM0700_21B="Philips CM0700 (21B)"
770C="Philips 107S (107S1)"
770D="Philips 107X (107X1)"
770E="Philips 107E (107E1)"
770F="Philips 107G (107G1)"
792B="Philips 107B (107B1)"
796A="Philips Brilliance 107P (107P1)"
PH_CM0800_14A="Philips CM0800 (14A)"
907A="Philips Brilliance 109P (109P1)"
992C="Philips 109S (109S1)"
996B="Philips 109B (109B1)"
PHL-105B="PHILIPS 105B(15inch/CM1200)"
PHL-A17B="Philips Magnavox MB7000(17inch/CM6800)"
PHL-A17C="PHILIPS 107S(17inch/CM1300)"
PD5029S="Philips PD5029S Monitor/TV"
PHL-B14B="PHILIPS 104B(14inch/CM2300)"
B15B="Philips 105MB (15inch/CM2300)"
PHL-B15C="PHILIPS 105S(15inch/CM2300)"
B17B="Philips 107MB (17inch/CM2300)"
B17C="Philips 107S (17inch/CM2300)"
B17D="Philips 107B (CM2400)"
B17E="Philips 107S (CM2400)"
B17F="Philips 107E (17inch/CM2600)"
B19A="Philips 109B (CM2500)"
E001="Philips 105B (105B2)"
E002="Philips Brilliance 107P (107P2)"
E003="Philips 107B (107B2)"
E004="Philips 107T (107T2)"
E005="Philips 107S (107S2)"
E007="Philips 109B (109B2)"
E008="Philips 109S (109S2)"

