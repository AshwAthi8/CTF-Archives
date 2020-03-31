; MONITOR2.INF
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
%Delta%=Delta,NTamd64
%ECS%=ECS,NTamd64
%EIZONANAO%=EIZONANAO,NTamd64
%ELSA%=ELSA,NTamd64
%EPSON-J%=Epson,NTamd64
%Fujitsu%=Fujitsu,NTamd64


;-------------------------------------------------
; Manufacturer Sections

[Delta.NTamd64]
%Delta_DA0570%=Delta_DA0570.Install, Monitor\DPC0570
%Delta_DB0770%=Delta_DB0770.Install, Monitor\DPC0770
%DA995%=DA995.Install, Monitor\DPC0995
%Delta_DA1565%=Delta_DA1565.Install, Monitor\DPC1565
%Delta_DB1765%=Delta_DB1765.Install, Monitor\DPC1765
%DC770%=DC770.Install, Monitor\DPC1770
%DE570%=DE570.Install, Monitor\DPC4570

[ECS.NTamd64]
%M1401%=M1401, Monitor\ECS0001
%M1501%=M1501, Monitor\ECS0002
%M1502%=M1502, Monitor\ECS0003
%M1503%=M1503, Monitor\ECS0004
%M1700%=M1700, Monitor\ECS0005
%M1701%=M1701, Monitor\ECS0006
%M1702%=M1700, Monitor\ECS0007
%M2101%=M2101, Monitor\ECS0008
%M2102%=M2102, Monitor\ECS0009

[EIZONANAO.NTamd64]
%F351%=F351, Monitor\EIZ0200
%F553%=F553, Monitor\EIZ0201
%F563%=F563, Monitor\EIZ0202
%F764%=F764, Monitor\EIZ0203
%F784%=F784, Monitor\EIZ0204
%e6600%=6600, Monitor\EIZ0206
%e6500%=6500, Monitor\EIZ0300
%e9060S%=9060S, Monitor\EIZ0302
%e9065S%=9065S, Monitor\EIZ0303
%T563%=T563, Monitor\EIZ0305
%e9070S%=9070S, Monitor\EIZ0306
%e9080i%=9080i, Monitor\EIZ0307
%e9400i%=9400i, Monitor\EIZ0308
%e9500%=9500, Monitor\EIZ0309
%eF340iW%=F340iW, Monitor\EIZ030A
%F552%=F553, Monitor\EIZ030C
%eF560iW%=F560iW, Monitor\EIZ030D
%eF750i%=F750i, Monitor\EIZ030E
%eF760iW%=F760iW, Monitor\EIZ030F
%eF780iW%=F780iW, Monitor\EIZ0310
%eT560i%=T560i, Monitor\EIZ0311
%eT660i%=T660i, Monitor\EIZ0312
%T562%=T562, Monitor\EIZ0313
%T662%=T662, Monitor\EIZ0314
%eF550iW%=F550iW, Monitor\EIZ038C
%F35%=F35.Install, Monitor\EIZ1000
%T57S%=T57S.Install, Monitor\EIZ1001
%T67%=T67.Install, Monitor\EIZ1002
%T67S%=T67S.Install, Monitor\EIZ1003
%F56%=F56.Install, Monitor\EIZ1004
%T57%=T57.Install, Monitor\EIZ1005
%F77%=F77.Install, Monitor\EIZ1006
%F78%=F78.Install, Monitor\EIZ1007
%F55%=F55.Install, Monitor\EIZ1008
%L23%=L23.Install, Monitor\EIZ1009
%T77%=T77.Install, Monitor\EIZ1011
%L34%=L34.Install, Monitor\EIZ1012
%F67%=F67.Install, Monitor\EIZ1013
%T68%=T68.Install, Monitor\EIZ1014
%F55S%=F55S.Install, Monitor\EIZ1015
%F77S%=F77S.Install, Monitor\EIZ1018
%L66%=L66.Install, Monitor\EIZ1019
%F57%=F57.Install, Monitor\EIZ1020
%L360%=L360.Install, Monitor\EIZ1021
%T960_E%=T960.Install, Monitor\EIZ1022
%FXB5E%=FXB5.Install, Monitor\EIZ1400
%TXC7SE%=TXC7S.Install, Monitor\EIZ1401
%TXD7SE%=TXD7S.Install, Monitor\EIZ1403
%FXC6E%=FXC6.Install, Monitor\EIZ1404
%TXC7E%=TXC7.Install, Monitor\EIZ1405
%FXE7E%=FXE7.Install, Monitor\EIZ1406
%FXE8E%=FXE8.Install, Monitor\EIZ1407
%FXC5E%=FXC5.Install, Monitor\EIZ1408
%L23A%=L23.Install, Monitor\EIZ1409
%L34%=L34.Install, Monitor\EIZ1412
%FXD7%=FXD7.Install, Monitor\EIZ1413
%TXD7%=TXD7.Install, Monitor\EIZ1414
%FXC5S%=FXC5S.Install, Monitor\EIZ1415
%FXE7S%=FXE7S.Install, Monitor\EIZ1418
%L66B%=L66.Install, Monitor\EIZ1419
%FXC7%=FXC7.Install, Monitor\EIZ1420
%L360B%=L360.Install, Monitor\EIZ1421
%T960_U%=T960.Install, Monitor\EIZ1422
%T550%=T550.Install, Monitor\ENC1600
%P4260%=P4260.Install, Monitor\ENC1601
%F520%=F520.Install, Monitor\ENC1602
%F980%=F980.Install, Monitor\ENC1603
%F730%=F730.Install, Monitor\ENC1604
%T760%=T760.Install, Monitor\ENC1605
%L661%=L661.Install, Monitor\ENC1606
%L680%=L680.Install, Monitor\ENC1607
%L350%=L350.Install, Monitor\ENC1609
%T961%=T961.Install, Monitor\ENC1610
%L660%=L660.Install, Monitor\ENC1611
%F930%=F930.Install, Monitor\ENC1612
%T761%=T761.Install, Monitor\ENC1613
%T962%=T962.Install, Monitor\ENC1614
%T561%=T561.Install, Monitor\ENC1615
%L351%=L351.Install, Monitor\ENC1616
%L371D%=L371D.Install, Monitor\ENC1617
%L371%=L371.Install, Monitor\ENC1618
%L671D%=L671D.Install, Monitor\ENC1619
%L671%=L671.Install, Monitor\ENC1620
%L771%=L771.Install, Monitor\ENC1622
%L675D%=L675D.Install, Monitor\ENC1626
%L675%=L675.Install, Monitor\ENC1627
%T2-20%=T2-20, Monitor\NAN0000
%N88F%=N88F, Monitor\NAN0100
%N77F%=N77F, Monitor\NAN0101
%N6600%=N6600, Monitor\NAN0102
%F2-15%=F2-15, Monitor\NAN0400
%F2-17%=F2-17, Monitor\NAN0401
%F2-17EX%=F2-17EX, Monitor\NAN0402
%F2-21%=F2-21, Monitor\NAN0403
%FX2-21%=FX2-21, Monitor\NAN0404
%T2-17TS%=T2-17TS, Monitor\NAN0405
%n6600%=6600, Monitor\NAN0406
%n9060S%=9060S, Monitor\NAN0502
%n9065S%=9065S, Monitor\NAN0503
%9070U%=9070U, Monitor\NAN0506
%n9080i%=9080i, Monitor\NAN0507
%n9400i%=9400i, Monitor\NAN0508
%n9500%=9500, Monitor\NAN0509
%nF340iW%=F340iW, Monitor\NAN050A
%F550i%=F550i, Monitor\NAN050B
%nF550iW%=F550iW, Monitor\NAN050C
%nF560iW%=F560iW, Monitor\NAN050D
%nF750i%=F750i, Monitor\NAN050E
%nF760iW%=F760iW, Monitor\NAN050F
%nF780iW%=F780iW, Monitor\NAN0510
%nT560i%=T560i, Monitor\NAN0511
%nT660i%=T660i, Monitor\NAN0512
%T2-17%=T2-17, Monitor\NAN0513
%T2-20%=T2-20, Monitor\NAN0514
%6300%=6300, Monitor\NAN0580
%33F%=33F, Monitor\NAN0800
%88F%=88F, Monitor\NAN0802
%54T%=54T, Monitor\NAN0805
%52F%=52F, Monitor\NAN0882
%n6500%=6500, Monitor\NAN0900
%n9060S%=9060S, Monitor\NAN0902
%9070U%=9070U, Monitor\NAN0906
%n9080i%=9080i, Monitor\NAN0907
%F347%=F347, Monitor\NAN090A
%F550i%=F550i, Monitor\NAN090B
%F557%=F557, Monitor\NAN090C
%77F%=77F, Monitor\NAN090F
%F780iJ%=F780iJ, Monitor\NAN0910
%T560iJ%=T560iJ, Monitor\NAN0911
%T660iJ%=T660iJ, Monitor\NAN0912
%56T%=56T, Monitor\NAN0913
%68T%=68T, Monitor\NAN0914
%F347II%=F347II, Monitor\NAN098A
%55F%=55F, Monitor\NAN098C
%76F%=76F, Monitor\NAN098F
%T567%=T567, Monitor\NAN0991
%53T%=53T, Monitor\NAN0993
%56TS%=56TS, Monitor\NAN1002
%68TS%=68TS, Monitor\NAN1003
%E35F%=E35F, Monitor\NAN1200
%E57T%=E57T, Monitor\NAN1201
%E66T%=E66T, Monitor\NAN1202
%E65T%=E65T, Monitor\NAN1203
%E53F%=E53F, Monitor\NAN1204
%E55D%=E55D, Monitor\NAN1205
%E75F%=E75F, Monitor\NAN1206
%E78F%=E78F, Monitor\NAN1207
%E51F%=E51F, Monitor\NAN1208
%L23B%=L23B, Monitor\NAN1209
%E57Ts%=E57Ts, Monitor\NAN1210
%E76D%=E76D, Monitor\NAN1211
%E151L%=E151L.Install, Monitor\NAN1212
%E67F%=E67F.Install, Monitor\NAN1213
%E67T%=E67T.Install, Monitor\NAN1214
%E51FS%=E51FS.Install, Monitor\NAN1215
%E76F%=E76F.Install, Monitor\NAN1218
%L66A%=L66.Install, Monitor\NAN1219
%E54F%=E54F.Install, Monitor\NAN1220
%L360A%=L360.Install, Monitor\NAN1221
%T960_J%=T960.Install, Monitor\NAN1222

[ELSA.NTamd64]
%ECOMO17%=ECOMO17.Install, Monitor\ELS4160

[Epson.NTamd64]
%CRV-1700%=CRV-1700, Monitor\CCP4637
%CRV-1700S%=CRV-1700S, Monitor\EHJ3137
%CRV-1780D%=CRV-1780D, Monitor\EHJ3138
%CRV-2100D%=CRV-2100D, Monitor\EHJ3231
%ELP-3500%=ELP-3500, Monitor\SECA000
%ELP-5000%=ELP-5000, Monitor\SECA001
%ELP-7000%=ELP-7000, Monitor\SECA100

[Fujitsu.NTamd64]
%FUJITSU_1554%=FUJITSU_1554.Install, Monitor\FPA0612
%FUJITSU1568%=FUJITSU1568.Install, Monitor\FPA2D30
%FUJITSU1769%=FUJITSU1769.Install, Monitor\FPA2DF9
%FUJ-x150f%=FUJ-x150f.Install, Monitor\FUJ0119
%FMVDP997%=FMVDP997.Install, Monitor\FUJ0210
%FMVDP9710%=FMVDP9710.Install, Monitor\FUJ2110
%VL1700SS%=VL1700SS.Install, Monitor\FUJ2111
%FUJ-x176%=FUJ-x176.Install, Monitor\FUJ2118
%FUJ-x177%=FUJ-x177.Install, Monitor\FUJ2218
%FUJ-x177a%=FUJ-x177a.Install, Monitor\FUJ2318
%FMVDP9714%=FMVDP9714.Install, Monitor\FUJ2610
%FUJ-e155%=FUJ-e155.Install, Monitor\FUJ3118
%FMVDP849%=FMVDP849.Install, Monitor\FUJ3210
%VL1530SW%=VL1530SW.Install, Monitor\FUJ3711
%VL1540S%=VL1540S.Install, Monitor\FUJ3811
%VL1550S%=VL1550S.Install, Monitor\FUJ3911
%VLP150%=VLP150.Install, Monitor\FUJ3A11
%FMV-DP975%=FMV-DP975.Ins, Monitor\FUJ4201
%FMV-DPS972%=FMV-DPS972.Ins, Monitor\FUJ4301
%FMV-DP976%=FMV-976.Ins, Monitor\FUJ4401
%FMV-DPA971%=FMV-DPA971.Ins, Monitor\FUJ4501
%FMVDP977%=FMVDP977.Install, Monitor\FUJ4601
%FMVDP978%=FMVDP978.Install, Monitor\FUJ4701
%FMVDP98X1%=FMVDP98X1.Install, Monitor\FUJ5110
%FMV-DP844%=FMV-DP844.Ins, Monitor\FUJ5201
%FMV-DPS842%=FMV-DPS842.Ins, Monitor\FUJ5301
%FMV-DPS843%=FMV-DPS843.Ins, Monitor\FUJ5401
%FMVDP845%=FMVDP845.Install, Monitor\FUJ5501
%FMVDP846%=FMVDP846.Install, Monitor\FUJ5601
%FMVDP97X4%=FMVDP97X4.Install, Monitor\FUJ6110
%FMVDP97X5%=FMVDP97X5.Install, Monitor\FUJ6210
%FMVDP97X9%=FMVDP97X9.Install, Monitor\FUJ6410
%FMVDP97W3%=FMVDP97W3.Install, Monitor\FUJ6510
%FMVDP84X2%=FMVDP84X2.Install, Monitor\FUJ7110
%V17WDX1G%=V17WDX1G.Install, Monitor\FUJ7111
%FMVDP84X3%=FMVDP84X3.Install, Monitor\FUJ7210
%FMVDP848%=FMVDP848.Install, Monitor\FUJ7410
%FMVDP84X7%=FMVDP84X7.Install, Monitor\FUJ7610
%FMVDP84X8%=FMVDP84X8.Install, Monitor\FUJ7710
%VL15TX1%=VL15TX1.Install, Monitor\FUJ8111
%VL-1400TS%=VL-1400TS.Ins, Monitor\FUJ8301
%VL2100T%=VL2100T.Install, Monitor\FUJ8401
%VL1400SS%=VL1400SS.Install, Monitor\FUJ8501
%VL15DX4G%=VL15DX4G.Install, Monitor\FUJ8911
%VL15DX5G%=VL15DX5G.Install, Monitor\FUJ8A11
%VL14TX1%=VL14TX1.Install, Monitor\FUJ9111
%FMV-DP993%=FMV-DP993.Ins, Monitor\FUJ9201
%FMVDP994%=FMVDP994.Install, Monitor\FUJ9301
%FMV-DP97Y1%=FMV-DP97Y1.Ins, Monitor\FUJA201
%FMV-DP97Y2%=FMV-DP97Y2.Ins, Monitor\FUJA301
%FMVDP97Y3%=FMVDP97Y3.Install, Monitor\FUJA401
%FMVDP97Y4%=FMVDP97Y4.Install, Monitor\FUJA501
%FMVDP97Y5%=FMVDP97Y5.Install, Monitor\FUJA601
%FMVDP97Y6%=FMVDP97Y6.Install, Monitor\FUJA701
%FMVDP97X1%=FMVDP97X1.Install, Monitor\FUJA801
%FMVDP97X2%=FMVDP97X2.Install, Monitor\FUJA901
%FMVDP97X3%=FMVDP97X3.Install, Monitor\FUJAA01
%FMV-DP84Y1%=FMV-DP84Y1.Ins, Monitor\FUJB201
%FMV-DP84Y2%=FMV-DP84Y2.Ins, Monitor\FUJB301
%FMV-DP84Y3%=FMV-DP84Y3.Ins, Monitor\FUJB401
%FMVDP84Y4%=FMVDP84Y4.Install, Monitor\FUJB601
%FMVDP84Y5%=FMVDP84Y5.Install, Monitor\FUJB701
%FMVDP84X1%=FMVDP84X1.Install, Monitor\FUJB801


;-------------------------------------------------
; Install sections

; -------------- Delta
[Delta_DA0570.Install]
DelReg=DCR
AddReg=Delta_DA0570.AddReg, 1280, DPMS

[Delta_DB0770.Install]
DelReg=DCR
AddReg=Delta_DB0770.AddReg, 1280, DPMS

[DA995.Install]
DelReg=DCR
AddReg=DA995.AddReg, 1600, DPMS

[Delta_DA1565.Install]
DelReg=DCR
AddReg=Delta_DA1565.AddReg, 1280, DPMS

[Delta_DB1765.Install]
DelReg=DCR
AddReg=Delta_DB1765.AddReg, 1280, DPMS

[DC770.Install]
DelReg=DCR
AddReg=DC770.AddReg, 1280, DPMS

[DE570.Install]
DelReg=DCR
AddReg=DE570.AddReg, 1280, DPMS

; -------------- ECS
[M1401]
DelReg=DCR
AddReg=M1401.AddReg, 1024, DPMS

[M1501]
DelReg=DCR
AddReg=M1501.AddReg, 1280, DPMS

[M1502]
DelReg=DCR
AddReg=M1502.AddReg, 1280, DPMS

[M1503]
DelReg=DCR
AddReg=M1503.AddReg, 1280, DPMS

[M1700]
DelReg=DCR
AddReg=M1700.AddReg, 1280, DPMS

[M1701]
DelReg=DCR
AddReg=M1701.AddReg, 1280, DPMS

[M2101]
DelReg=DCR
AddReg=M2101.AddReg, 1600, DPMS

[M2102]
DelReg=DCR
AddReg=M2102.AddReg, 1600, DPMS

; -------------- EIZONANAO
[F351]
DelReg=DCR
AddReg=F351.Add, 1152, DPMS

[F553]
DelReg=DCR
AddReg=F553.Add, 1152, DPMS

[F563]
DelReg=DCR
AddReg=F563.Add, 1280, DPMS

[F764]
DelReg=DCR
AddReg=F764.Add, 1600, DPMS

[F784]
DelReg=DCR
AddReg=F784.Add, 1600, DPMS

[6600]
DelReg=DCR
AddReg=6600.Add, 1600

[6500]
DelReg=DCR
AddReg=6500.Add, 1600

[9060S]
DelReg=DCR
AddReg=9060S.Add, 800

[9065S]
DelReg=DCR
AddReg=9065S.Add, 800

[T563]
DelReg=DCR
AddReg=T563.Add, 1280, DPMS

[9070S]
DelReg=DCR
AddReg=9070S.Add, 1024

[9080i]
DelReg=DCR
AddReg=9080i.Add, 1024

[9400i]
DelReg=DCR
AddReg=9400i.Add, 1280

[9500]
DelReg=DCR
AddReg=9500.Add, 1280

[F340iW]
DelReg=DCR
AddReg=F340iW.Add, 1024, DPMS

[F560iW]
DelReg=DCR
AddReg=F560iW.Add, 1280, DPMS

[F750i]
DelReg=DCR
AddReg=F750i.Add, 1280

[F760iW]
DelReg=DCR
AddReg=F760iW.Add, 1280, DPMS

[F780iW]
DelReg=DCR
AddReg=F780iW.Add, 1600, DPMS

[T560i]
DelReg=DCR
AddReg=T560i.Add, 1280, DPMS

[T660i]
DelReg=DCR
AddReg=T660i.Add, 1280

[T562]
DelReg=DCR
AddReg=T562.Add, 1280, DPMS

[T662]
DelReg=DCR
AddReg=T662.Add, 1280, DPMS

[F550iW]
DelReg=DCR
AddReg=F550iW.Add, 1280, DPMS

[F35.Install]
DelReg=DCR
AddReg=F35.AddReg, 1280, DPMS

[T57S.Install]
DelReg=DCR
AddReg=T57S.AddReg, 1920, DPMS

[T67.Install]
DelReg=DCR
AddReg=T67.AddReg, 2048, DPMS

[T67S.Install]
DelReg=DCR
AddReg=T67S.AddReg, 2048, DPMS

[F56.Install]
DelReg=DCR
AddReg=F56.AddReg, 1920, DPMS

[T57.Install]
DelReg=DCR
AddReg=T57.AddReg, 1920, DPMS

[F77.Install]
DelReg=DCR
AddReg=F77.AddReg, 2048, DPMS

[F78.Install]
DelReg=DCR
AddReg=F78.AddReg, 2048, DPMS

[F55.Install]
DelReg=DCR
AddReg=F55.AddReg, 1280, DPMS

[L23.Install]
DelReg=DCR
AddReg=L23.AddReg, 1024, DPMS

[T77.Install]
DelReg=DCR
AddReg=T77.AddReg, 2048, DPMS

[L34.Install]
DelReg=DCR
AddReg=L34.AddReg, 1024, DPMS

[F67.Install]
DelReg=DCR
AddReg=F67.AddReg, 2048, DPMS

[T68.Install]
DelReg=DCR
AddReg=T68.AddReg, 2048, DPMS

[F55S.Install]
DelReg=DCR
AddReg=F55S.AddReg, 1600, DPMS

[F77S.Install]
DelReg=DCR
AddReg=F77S.AddReg, 2048, DPMS

[L66.Install]
DelReg=DCR
AddReg=L66.AddReg, 1280, DPMS

[F57.Install]
DelReg=DCR
AddReg=F57.AddReg, 1600, DPMS

[L360.Install]
DelReg=DCR
AddReg=L360.AddReg, 1024, DPMS

[T960.Install]
DelReg=DCR
AddReg=T960.AddReg, 2048, DPMS

[FXB5.Install]
DelReg=DCR
AddReg=FXB5.AddReg, 1280, DPMS

[TXC7S.Install]
DelReg=DCR
AddReg=TXC7S.AddReg, 1920, DPMS

[TXD7S.Install]
DelReg=DCR
AddReg=TXD7S.AddReg, 2048, DPMS

[FXC6.Install]
DelReg=DCR
AddReg=FXC6.AddReg, 1920, DPMS

[TXC7.Install]
DelReg=DCR
AddReg=TXC7.AddReg, 1920, DPMS

[FXE7.Install]
DelReg=DCR
AddReg=FXE7.AddReg, 2048, DPMS

[FXE8.Install]
DelReg=DCR
AddReg=FXE8.AddReg, 2048, DPMS

[FXC5.Install]
DelReg=DCR
AddReg=FXC5.AddReg, 1280, DPMS

[FXD7.Install]
DelReg=DCR
AddReg=FXD7.AddReg, 2048, DPMS

[TXD7.Install]
DelReg=DCR
AddReg=TXD7.AddReg, 2048, DPMS

[FXC5S.Install]
DelReg=DCR
AddReg=FXC5S.AddReg, 1600, DPMS

[FXE7S.Install]
DelReg=DCR
AddReg=FXE7S.AddReg, 2048, DPMS

[FXC7.Install]
DelReg=DCR
AddReg=FXC7.AddReg, 1600, DPMS

[T550.Install]
DelReg=DCR
AddReg=T550.AddReg, 1600, DPMS

[P4260.Install]
DelReg=DCR
AddReg=P4260.AddReg, 1024, DPMS

[F520.Install]
DelReg=DCR
AddReg=F520.AddReg, 1600, DPMS

[F980.Install]
DelReg=DCR
AddReg=F980.AddReg, 2048, DPMS

[F730.Install]
DelReg=DCR
AddReg=F730.AddReg, 2048, DPMS

[T760.Install]
DelReg=DCR
AddReg=T760.AddReg, 2048, DPMS

[L661.Install]
DelReg=DCR
AddReg=L661.AddReg, 1280, DPMS

[L680.Install]
DelReg=DCR
AddReg=L680.AddReg, 1280, DPMS

[L350.Install]
DelReg=DCR
AddReg=L350.AddReg, 1024, DPMS

[T961.Install]
DelReg=DCR
AddReg=T961.AddReg, 2048, DPMS

[L660.Install]
DelReg=DCR
AddReg=L660.AddReg, 1280, DPMS

[F930.Install]
DelReg=DCR
AddReg=F930.AddReg, 2048, DPMS

[T761.Install]
DelReg=DCR
AddReg=T761.AddReg, 2048, DPMS

[T962.Install]
DelReg=DCR
AddReg=T962.AddReg, 2048, DPMS

[T561.Install]
DelReg=DCR
AddReg=T561.AddReg, 1600, DPMS

[L351.Install]
DelReg=DCR
AddReg=L351.AddReg, 1024, DPMS

[L371D.Install]
DelReg=DCR
AddReg=L371D.AddReg, 1024, DPMS

[L371.Install]
DelReg=DCR
AddReg=L371.AddReg, 1024, DPMS

[L671D.Install]
DelReg=DCR
AddReg=L671D.AddReg, 1280, DPMS

[L671.Install]
DelReg=DCR
AddReg=L671.AddReg, 1280, DPMS

[L771.Install]
DelReg=DCR
AddReg=L771.AddReg, 1600, DPMS

[L675D.Install]
DelReg=DCR
AddReg=L675D.AddReg, 1280, DPMS

[L675.Install]
DelReg=DCR
AddReg=L675.AddReg, 1280, DPMS

[T2-20]
DelReg=DCR
AddReg=T2-20.Add, 1280, DPMS

[N88F]
DelReg=DCR
AddReg=N88F.AddReg, 2048, DPMS

[N77F]
DelReg=DCR
AddReg=N77F.AddReg, 1280, DPMS

[N6600]
DelReg=DCR
AddReg=N6600.AddReg, 2048

[F2-15]
DelReg=DCR
AddReg=F2-15.Add, 1152, DPMS

[F2-17]
DelReg=DCR
AddReg=F2-17.Add, 1152, DPMS

[F2-17EX]
DelReg=DCR
AddReg=F2-17EX.Add, 1280, DPMS

[F2-21]
DelReg=DCR
AddReg=F2-21.Add, 1600, DPMS

[FX2-21]
DelReg=DCR
AddReg=FX2-21.Add, 1600, DPMS

[T2-17TS]
DelReg=DCR
AddReg=T2-17TS.Add, 1280, DPMS

[9070U]
DelReg=DCR
AddReg=9070U.Add, 1024

[F550i]
DelReg=DCR
AddReg=F550i.Add, 1280, DPMS

[T2-17]
DelReg=DCR
AddReg=T2-17.Add, 1280, DPMS

[6300]
DelReg=DCR
AddReg=6300.Add, 1600

[33F]
DelReg=DCR
AddReg=33F.Add, 1152, DPMS

[88F]
DelReg=DCR
AddReg=88F.Add, 1600, DPMS

[54T]
DelReg=DCR
AddReg=54T.Add, 1280, DPMS

[52F]
DelReg=DCR
AddReg=52F.Add, 1280, DPMS

[F347]
DelReg=DCR
AddReg=F347.Add, 1024, DPMS

[F557]
DelReg=DCR
AddReg=F557.Add, 1024, DPMS

[77F]
DelReg=DCR
AddReg=77F.Add, 1600, DPMS

[F780iJ]
DelReg=DCR
AddReg=F780iJ.Add, 1600, DPMS

[T560iJ]
DelReg=DCR
AddReg=T560iJ.Add

[T660iJ]
DelReg=DCR
AddReg=T660iJ.Add, 1280, DPMS

[56T]
DelReg=DCR
AddReg=56T.Add, 1280, DPMS

[68T]
DelReg=DCR
AddReg=68T.Add, 1280, DPMS

[F347II]
DelReg=DCR
AddReg=F347II.Add, 1024, DPMS

[55F]
DelReg=DCR
AddReg=55F.Add, 1024, DPMS

[76F]
DelReg=DCR
AddReg=76F.Add, 1280, DPMS

[T567]
DelReg=DCR
AddReg=T567.Add, 1280, DPMS

[53T]
DelReg=DCR
AddReg=53T.Add, 1280, DPMS

[56TS]
DelReg=DCR
AddReg=56TS.AddReg, 1280, DPMS

[68TS]
DelReg=DCR
AddReg=68TS.AddReg, 1280, DPMS

[E35F]
DelReg=DCR
AddReg=E35F.AddReg, 1280, DPMS

[E57T]
DelReg=DCR
AddReg=E57T.AddReg, 1600, DPMS

[E66T]
DelReg=DCR
AddReg=E66T.AddReg, 2048, DPMS

[E65T]
DelReg=DCR
AddReg=E65T.AddReg, 2048, DPMS

[E53F]
DelReg=DCR
AddReg=E53F.AddReg, 1600, DPMS

[E55D]
DelReg=DCR
AddReg=E55D.AddReg, 1600, DPMS

[E75F]
DelReg=DCR
AddReg=E75F.AddReg, 2048, DPMS

[E78F]
DelReg=DCR
AddReg=E78F.AddReg, 2048, DPMS

[E51F]
DelReg=DCR
AddReg=E51F.AddReg, 1280, DPMS

[L23B]
DelReg=DCR
AddReg=L23B.AddReg, 1024, DPMS

[E57Ts]
DelReg=DCR
AddReg=E57Ts.AddReg, 2048, DPMS

[E76D]
DelReg=DCR
AddReg=E76D.AddReg, 2048, DPMS

[E151L.Install]
DelReg=DCR
AddReg=E151L.AddReg, 1024, DPMS

[E67F.Install]
DelReg=DCR
AddReg=E67F.AddReg, 2048, DPMS

[E67T.Install]
DelReg=DCR
AddReg=E67T.AddReg, 2048, DPMS

[E51FS.Install]
DelReg=DCR
AddReg=E51FS.AddReg, 1600, DPMS

[E76F.Install]
DelReg=DCR
AddReg=E76F.AddReg, 2048, DPMS

[E54F.Install]
DelReg=DCR
AddReg=E54F.AddReg, 1600, DPMS

; -------------- ELSA
[ECOMO17.Install]
DelReg=DCR
AddReg=ECOMO17.AddReg, 1600, DPMS

; -------------- Epson
[CRV-1700]
DelReg=DCR
AddReg=CRV-1700.AddReg, 1280, DPMS

[CRV-1700S]
DelReg=DCR
AddReg=CRV-1700S.AddReg, 1280, DPMS

[CRV-1780D]
DelReg=DCR
AddReg=CRV-1780D.AddReg, 1280, DPMS

[CRV-2100D]
DelReg=DCR
AddReg=CRV-2100D.AddReg, 1600, DPMS

[ELP-3500]
DelReg=DCR
AddReg=ELP-3500.AddReg, 800

[ELP-5000]
DelReg=DCR
AddReg=ELP-5000.AddReg, 1024

[ELP-7000]
DelReg=DCR
AddReg=ELP-7000.AddReg, 1280

; -------------- Fujitsu
[FUJITSU_1554.Install]
DelReg=DCR
AddReg=FUJITSU_1554.AddReg, 1024, DPMS

[FUJITSU1568.Install]
DelReg=DCR
AddReg=FUJITSU1568.AddReg, 1280, DPMS

[FUJITSU1769.Install]
DelReg=DCR
AddReg=FUJITSU1769.AddReg, 1280, DPMS

[FUJ-x150f.Install]
DelReg=DCR
AddReg=FUJ-x150f.AddReg, 1024, DPMS

[FMVDP997.Install]
DelReg=DCR
AddReg=FMVDP997.AddReg, 1600, DPMS

[FMVDP9710.Install]
DelReg=DCR
AddReg=FMVDP9710.AddReg, 1280, DPMS

[VL1700SS.Install]
DelReg=DCR
AddReg=VL1700SS.AddReg, 1280, DPMS

[FUJ-x176.Install]
DelReg=DCR
AddReg=FUJ-x176.AddReg, 1600, DPMS

[FUJ-x177.Install]
DelReg=DCR
AddReg=FUJ-x177.AddReg, 1600, DPMS

[FUJ-x177a.Install]
DelReg=DCR
AddReg=FUJ-x177a.AddReg, 1600, DPMS

[FMVDP9714.Install]
DelReg=DCR
AddReg=FMVDP9714.AddReg, 1280, DPMS

[FUJ-e155.Install]
DelReg=DCR
AddReg=FUJ-e155.AddReg, 1024, DPMS

[FMVDP849.Install]
DelReg=DCR
AddReg=FMVDP849.AddReg, 1024, DPMS

[VL1530SW.Install]
DelReg=DCR
AddReg=VL1530SW.AddReg, 1024, DPMS

[VL1540S.Install]
DelReg=DCR
AddReg=VL1540S.AddReg, 1024, DPMS

[VL1550S.Install]
DelReg=DCR
AddReg=VL1550S.AddReg, 1024, DPMS

[VLP150.Install]
DelReg=DCR
AddReg=VLP150.AddReg, 1024, DPMS

[FMV-DP975.Ins]
DelReg=DCR
AddReg=FMV-DP975.reg, 1280, DPMS

[FMV-DPS972.Ins]
DelReg=DCR
AddReg=FMV-DPS972.reg, 1280, DPMS

[FMV-976.Ins]
DelReg=DCR
AddReg=FMV-976.reg, 1280, DPMS

[FMV-DPA971.Ins]
DelReg=DCR
AddReg=FMV-DPA971.reg, 1280, DPMS

[FMVDP977.Install]
DelReg=DCR
AddReg=FMVDP977.AddReg, 1280, DPMS

[FMVDP978.Install]
DelReg=DCR
AddReg=FMVDP978.AddReg, 1280, DPMS

[FMVDP98X1.Install]
DelReg=DCR
AddReg=FMVDP98X1.AddReg, 1600, DPMS

[FMV-DP844.Ins]
DelReg=DCR
AddReg=FMV-DP844.reg, 1024, DPMS

[FMV-DPS842.Ins]
DelReg=DCR
AddReg=FMV-DPS842.reg, 1024, DPMS

[FMV-DPS843.Ins]
DelReg=DCR
AddReg=FMV-DPS843.reg, 1024, DPMS

[FMVDP845.Install]
DelReg=DCR
AddReg=FMVDP845.AddReg, 1024, DPMS

[FMVDP846.Install]
DelReg=DCR
AddReg=FMVDP846.AddReg, 1024, DPMS

[FMVDP97X4.Install]
DelReg=DCR
AddReg=FMVDP97X4.AddReg, 1280, DPMS

[FMVDP97X5.Install]
DelReg=DCR
AddReg=FMVDP97X5.AddReg, 1280, DPMS

[FMVDP97X9.Install]
DelReg=DCR
AddReg=FMVDP97X9.AddReg, 1280, DPMS

[FMVDP97W3.Install]
DelReg=DCR
AddReg=FMVDP97W3.AddReg, 1280, DPMS

[FMVDP84X2.Install]
DelReg=DCR
AddReg=FMVDP84X2.AddReg, 1024, DPMS

[V17WDX1G.Install]
DelReg=DCR
AddReg=V17WDX1G.AddReg, 1280B, DPMS

[FMVDP84X3.Install]
DelReg=DCR
AddReg=FMVDP84X3.AddReg, 1024, DPMS

[FMVDP848.Install]
DelReg=DCR
AddReg=FMVDP848.AddReg, 1024, DPMS

[FMVDP84X7.Install]
DelReg=DCR
AddReg=FMVDP84X7.AddReg, 1024, DPMS

[FMVDP84X8.Install]
DelReg=DCR
AddReg=FMVDP84X8.AddReg, 1024, DPMS

[VL15TX1.Install]
DelReg=DCR
AddReg=VL15TX1.AddReg, 1024, DPMS

[VL-1400TS.Ins]
DelReg=DCR
AddReg=VL-1400TS.reg, 1024, DPMS

[VL2100T.Install]
DelReg=DCR
AddReg=VL2100T.AddReg, 1280, DPMS

[VL1400SS.Install]
DelReg=DCR
AddReg=VL1400SS.AddReg, 1024, DPMS

[VL15DX4G.Install]
DelReg=DCR
AddReg=VL15DX4G.AddReg, 1024, DPMS

[VL15DX5G.Install]
DelReg=DCR
AddReg=VL15DX5G.AddReg, 1024, DPMS

[VL14TX1.Install]
DelReg=DCR
AddReg=VL14TX1.AddReg, 1024, DPMS

[FMV-DP993.Ins]
DelReg=DCR
AddReg=FMV-DP993.reg, 1600, DPMS

[FMVDP994.Install]
DelReg=DCR
AddReg=FMVDP994.AddReg, 1600, DPMS

[FMV-DP97Y1.Ins]
DelReg=DCR
AddReg=FMV-DP97Y1.reg, 1280, DPMS

[FMV-DP97Y2.Ins]
DelReg=DCR
AddReg=FMV-DP97Y2.reg, 1280, DPMS

[FMVDP97Y3.Install]
DelReg=DCR
AddReg=FMVDP97Y3.AddReg, 1280, DPMS

[FMVDP97Y4.Install]
DelReg=DCR
AddReg=FMVDP97Y4.AddReg, 1280, DPMS

[FMVDP97Y5.Install]
DelReg=DCR
AddReg=FMVDP97Y5.AddReg, 1280, DPMS

[FMVDP97Y6.Install]
DelReg=DCR
AddReg=FMVDP97Y6.AddReg, 1280, DPMS

[FMVDP97X1.Install]
DelReg=DCR
AddReg=FMVDP97X1.AddReg, 1280, DPMS

[FMVDP97X2.Install]
DelReg=DCR
AddReg=FMVDP97X2.AddReg, 1280, DPMS

[FMVDP97X3.Install]
DelReg=DCR
AddReg=FMVDP97X3.AddReg, 1280, DPMS

[FMV-DP84Y1.Ins]
DelReg=DCR
AddReg=FMV-DP84Y1.reg, 1024, DPMS

[FMV-DP84Y2.Ins]
DelReg=DCR
AddReg=FMV-DP84Y2.reg, 1024, DPMS

[FMV-DP84Y3.Ins]
DelReg=DCR
AddReg=FMV-DP84Y3.reg, 1024, DPMS

[FMVDP84Y4.Install]
DelReg=DCR
AddReg=FMVDP84Y4.AddReg, 1024, DPMS

[FMVDP84Y5.Install]
DelReg=DCR
AddReg=FMVDP84Y5.AddReg, 1024, DPMS

[FMVDP84X1.Install]
DelReg=DCR
AddReg=FMVDP84X1.AddReg, 1024, DPMS


;-------------------------------------------------
; Common AddReg sections

[DCR]
HKR,MODES
HKR,,MaxResolution
HKR,,DPMS
HKR,,ICMProfile

[1024]
HKR,,MaxResolution,,"1024,768"

[1152]
HKR,,MaxResolution,,"1152,864"

[1280]
HKR,,MaxResolution,,"1280,1024"

[1280B]
HKR,,MaxResolution,,"1280,768"

[1600]
HKR,,MaxResolution,,"1600,1200"

[1920]
HKR,,MaxResolution,,"1920,1200"

[2048]
HKR,,MaxResolution,,"2048,1536"

[800]
HKR,,MaxResolution,,"800,600"

[DPMS]
HKR,,DPMS,,1


;-------------------------------------------------
; Model AddReg sections

; -------------- Delta
[Delta_DA0570.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-100,+,+"

[Delta_DB0770.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-100,+,+"

[DA995.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-180.0,+,+"

[Delta_DA1565.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-65,50-100,+,+"

[Delta_DB1765.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-65,50-100,+,+"

[DC770.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[DE570.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

; -------------- ECS
[M1401.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-100.0,+,+"

[M1501.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.0-64.0,50.0-100.0,+,+"

[M1502.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.0-64.0,50.0-100.0,+,+"

[M1503.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.0-64.0,50.0-100.0,+,+"

[M1700.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.0-64.0,50.0-100.0,+,+"

[M1701.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.0-82.0,50.0-100.0,+,+"

[M2101.AddReg]
HKR,"MODES\1600,1280",Mode1,,"24.0-90.0,50.0-100.0,+,+"

[M2102.AddReg]
HKR,"MODES\1600,1280",Mode1,,"24.0-90.0,50.0-100.0,+,+"

; -------------- EIZONANAO
[F351.Add]
HKR,"MODES\1152,864",Mode1,,"24.5-69.0,55.0-120.0,+,+"

[F553.Add]
HKR,"MODES\1152,864",Mode1,,"24.5-69.0,55.0-120.0,+,+"

[F563.Add]
HKR,"MODES\1280,1024",Mode1,,"24.5-86.0,55.0-160.0,+,+"

[F764.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-90.0,55.0-160.0,+,+"

[F784.Add]
HKR,"MODES\1600,1200",Mode1,,"31.5-102.0,55.0-160.0,+,+"

[6600.Add]
HKR,"MODES\640,480",Mode1,,"31.5,55.0-75.0,+,+"
HKR,"MODES\1600,1200",Mode1,,"56.0-110.0,70.0-90.0,+,+"

[6500.Add]
HKR,"MODES\640,480",Mode1,,"31.5,55.0-90.0,+,+"
HKR,"MODES\1600,1200",Mode1,,"56.0-80.0,55.0-90.0,+,+"

[9060S.Add]
HKR,"MODES\800,600",Mode1,,"15.5-38.5,50.0-90.0,+,+"

[9065S.Add]
HKR,"MODES\800,600",Mode1,,"30.0-50.0,50.0-90.0,+,+"

[T563.Add]
HKR,"MODES\1280,1024",Mode1,,"24.5-86.0,55.0-160.0,+,+"

[9070S.Add]
HKR,"MODES\1024,768",Mode1,,"20.0-50.0,50.0-90.0,+,+"

[9080i.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,55.0-90.0,+,+"

[9400i.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,55.0-90.0,+,+"

[9500.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,55.0-90.0,+,+"

[F340iW.Add]
HKR,"MODES\1024,768",Mode1,,"27.0-61.5,55.0-90.0,+,+"

[F560iW.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-90.0,+,+"

[F750i.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-80.0,55.0-90.0,+,+"

[F760iW.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,55.0-90.0,+,+"

[F780iW.Add]
HKR,"MODES\1600,1200",Mode1,,"45.0-100.0,55.0-120.0,+,+"

[T560i.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-90.0,+,+"

[T660i.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,55.0-90.0,+,+"

[T562.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-90.0,+,+"

[T662.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[F550iW.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,55.0-90.0,+,+"

[F35.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-70.0,50.0-120.0,+,+"

[T57S.AddReg]
HKR,"MODES\1920,1080",Mode1,,"30.0-92.0,50.0-160.0,+,+"

[T67.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[T67S.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[F56.AddReg]
HKR,"MODES\1920,1080",Mode1,,"27.0-86.0,50.0-160.0,+,+"

[T57.AddReg]
HKR,"MODES\1920,1080",Mode1,,"27.0-92.0,50.0-160.0,+,+"

[F77.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[F78.AddReg]
HKR,"MODES\2048,1536",Mode1,,"31.5-110.0,50.0-160.0,+,+"

[F55.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-70.0,50.0-120.0,+,+"

[L23.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.0-50.0,50.0-60.0,+,+"

[T77.AddReg]
HKR,"MODES\2048,1536",Mode1,,"27.0-70.0,50.0-120.0,+,+"

[L34.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.0-61.0,50.0-85.0,+,+"

[F67.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[T68.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[F55S.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-120.0,+,+"

[F77S.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-110.0,50.0-160.0,+,+"

[L66.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-80.0,50.0-75.0,+,+"

[F57.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[L360.AddReg]
HKR,"MODES\640,480",Mode1,,"27.0-61.0,55.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"27.0-61.0,55.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"27.0-61.0,55.0-75.0,+,+"

[T960.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-115.0,50.0-160.0,+,+"

[FXB5.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-70.0,50.0-120.0,+,+"

[TXC7S.AddReg]
HKR,"MODES\1920,1080",Mode1,,"30.0-92.0,50.0-160.0,+,+"

[TXD7S.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[FXC6.AddReg]
HKR,"MODES\1920,1080",Mode1,,"27.0-86.0,50.0-160.0,+,+"

[TXC7.AddReg]
HKR,"MODES\1920,1080",Mode1,,"27.0-92.0,50.0-160.0,+,+"

[FXE7.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[FXE8.AddReg]
HKR,"MODES\2048,1536",Mode1,,"31.5-110.0,50.0-160.0,+,+"

[FXC5.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-70.0,50.0-120.0,+,+"

[FXD7.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[TXD7.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[FXC5S.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-120.0,+,+"

[FXE7S.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-110.0,50.0-160.0,+,+"

[FXC7.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[T550.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-160.0,+,+"

[P4260.AddReg]
HKR,"MODES\640,480",Mode1,,"24.0-61.0,55.0-75.0,+,+"
HKR,"MODES\856,480",Mode1,,"24.0-61.0,55.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"24.0-61.0,55.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"24.0-61.0,50.0-75.0,+,+"

[F520.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[F980.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-137.0,50.0-160.0,+,+"

[F730.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-115.0,50.0-160.0,+,+"

[T760.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[L661.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-80.0,50.0-75.0,+,+"

[L680.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-80.0,50.0-75.0,+,+"

[L350.AddReg]
HKR,"MODES\640,480",Mode1,,"27.0-61.0,55.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"27.0-61.0,55.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"27.0-61.0,50.0-75.0,+,+"

[T961.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-115.0,50.0-160.0,+,+"

[L660.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-80.0,50.0-75.0,+,+"

[F930.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-130.0,50.0-160.0,+,+"

[T761.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-115.0,50.0-160.0,+,+"

[T962.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-130.0,50.0-160.0,+,+"

[T561.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[L351.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,59.0-61.0,+,+"

[L371D.AddReg]
HKR,"MODES\1024,768",Mode1,,"27.0-65.0,59.0-61.0,+,+"

[L371.AddReg]
HKR,"MODES\1024,768",Mode1,,"27.0-61.0,50.0-75.0,+,+"

[L671D.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-65.0,59.0-61.0,+,+"

[L671.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-80.0,50.0-75.0,+,+"

[L771.AddReg]
HKR,"MODES\640,480",Mode1,,"27.0-81.0,50.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"27.0-81.0,50.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"27.0-81.0,50.0-75.0,+,+"
HKR,"MODES\1280,1024",Mode1,,"27.0-81.0,50.0-75.0,+,+"
HKR,"MODES\1600,1200",Mode1,,"27.0-76.0,59.0-61.0,+,+"

[L675D.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-65.0,59.0-61.0,+,+"

[L675.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27.0-80.0,50.0-75.0,+,+"

[T2-20.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[N88F.AddReg]
HKR,"MODES\2048,1536",Mode1,,"31.5-102.0,55.0-160.0,+,+"

[N77F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.5-90.0,55.0-160.0,+,+"

[N6600.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,60.0,+,+"
HKR,"MODES\2048,1536",Mode1,,"56.0-110.0,70.0-90.0,+,+"

[F2-15.Add]
HKR,"MODES\1152,864",Mode1,,"24.5-69.0,55.0-120.0,+,+"

[F2-17.Add]
HKR,"MODES\1152,864",Mode1,,"24.5-69.0,55.0-120.0,+,+"

[F2-17EX.Add]
HKR,"MODES\1280,1024",Mode1,,"24.5-86.0,55.0-160.0,+,+"

[F2-21.Add]
HKR,"MODES\1600,1200",Mode1,,"24.5-90.0,55.0-160.0,+,+"

[FX2-21.Add]
HKR,"MODES\1600,1200",Mode1,,"31.5-102.0,55.0-160.0,+,+"

[T2-17TS.Add]
HKR,"MODES\1280,1024",Mode1,,"24.5-86.0,55.0-160.0,+,+"

[9070U.Add]
HKR,"MODES\1024,768",Mode1,,"20.0-50.0,50.0-90.0,+,+"

[F550i.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,55.0-90.0,+,+"

[T2-17.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[6300.Add]
HKR,"MODES\640,480",Mode1,,"31.5,55.0-90.0,+,+"
HKR,"MODES\1600,1200",Mode1,,"56.0-80.0,55.0-90.0,+,+"

[33F.Add]
HKR,"MODES\1152,864",Mode1,,"24.5-69.0,55.0-120.0,+,+"

[88F.Add]
HKR,"MODES\1600,1200",Mode1,,"31.5-102.0,55.0-160.0,+,+"

[54T.Add]
HKR,"MODES\1280,1024",Mode1,,"24.5-86.0,55.0-160.0,+,+"

[52F.Add]
HKR,"MODES\1280,1024",Mode1,,"24.5-70.0,55.0-120.0,+,+"

[F347.Add]
HKR,"MODES\1024,768",Mode1,,"24.5-61.5,55.0-90.0,+,+"

[F557.Add]
HKR,"MODES\1024,768",Mode1,,"24.5-65.0,55.0-90.0,+,+"

[77F.Add]
HKR,"MODES\1600,1200",Mode1,,"24.5-90.0,55.0-160.0,+,+"

[F780iJ.Add]
HKR,"MODES\1600,1200",Mode1,,"45.0-100.0,55.0-120.0,+,+"

[T560iJ.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-90.0,+,+"

[T660iJ.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-90.0,+,+"

[56T.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[68T.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[F347II.Add]
HKR,"MODES\1024,768",Mode1,,"24.5-61.5,55.0-90.0,+,+"

[55F.Add]
HKR,"MODES\1024,768",Mode1,,"24.5-65.0,55.0-90.0,+,+"

[76F.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,55.0-90.0,+,+"

[T567.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-90.0,+,+"

[53T.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[56TS.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,55.0-160.0,+,+"

[68TS.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,55.0-160.0,+,+"

[E35F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.5-70.0,50.0-120.0,+,+"

[E57T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-92.0,50.0-160.0,+,+"

[E66T.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[E65T.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[E53F.AddReg]
HKR,"MODES\1600,1200",Mode1,,"24.5-86.0,50.0-160.0,+,+"

[E55D.AddReg]
HKR,"MODES\1600,1200",Mode1,,"24.5-92.0,50.0-160.0,+,+"

[E75F.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[E78F.AddReg]
HKR,"MODES\2048,1536",Mode1,,"31.5-110.0,50.0-160.0,+,+"

[E51F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.5-70.0,50.0-120.0,+,+"

[L23B.AddReg]
HKR,"MODES\640,480",Mode1,,"24.0-50.0,55.0-85.0,+,+"
HKR,"MODES\800,600",Mode1,,"24.0-50.0,55.0-85.0,+,+"
HKR,"MODES\1024,768",Mode1,,"24.0-50.0,55.0-60.0,+,+"

[E57Ts.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-92.0,50.0-160.0,+,+"

[E76D.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[E151L.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.0-61.0,50.0-85.0,+,+"

[E67F.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[E67T.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[E51FS.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-120.0,+,+"

[E76F.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-110.0,50.0-160.0,+,+"

[E54F.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

; -------------- ELSA
[ECOMO17.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-130.0,+,+"

; -------------- Epson
[CRV-1700.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[CRV-1700S.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[CRV-1780D.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,55.0-120.0,+,+"

[CRV-2100D.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-160.0,+,+"

[ELP-3500.AddReg]
HKR,"MODES\800,600",Mode1,,"15.0-53.0,50.0-75.0,+,+"

[ELP-5000.AddReg]
HKR,"MODES\800,600",Mode1,,"15.0-60.0,50.0-85.0,+,+"
HKR,"MODES\1024,768",Mode2,,"15.0-60.0,50.0-75.0,+,+"

[ELP-7000.AddReg]
HKR,"MODES\1024,768",Mode1,,"15.0-81.0,50.0-85.0,+,+"
HKR,"MODES\1280,1024",Mode2,,"15.0-81.0,50.0-75.0,+,+"

; -------------- Fujitsu
[FUJITSU_1554.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-54,50-120,+,+"

[FUJITSU1568.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-69,50-120,+,+"

[FUJITSU1769.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-69,50-120,+,+"

[FUJ-x150f.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,56.0-75.0,+,+"

[FMVDP997.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-121.0,48.0-160.0,+,+"

[FMVDP9710.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[VL1700SS.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.3-80.4,55.9-85.5,+,+"

[FUJ-x176.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-100.0,50.0-200.0,+,+"

[FUJ-x177.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-92.0,50.0-150.0,+,+"

[FUJ-x177a.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-92.0,50.0-150.0,+,+"

[FMVDP9714.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-150.0,+,+"

[FUJ-e155.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-100.0,+,+"

[FMVDP849.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[VL1530SW.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.3-60.4,55.9-75.5,+,+"

[VL1540S.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.3-60.4,55.9-75.5,+,+"

[VL1550S.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.3-60.4,55.9-75.5,+,+"

[VLP150.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.3-60.4,55.9-75.5,+,+"

[FMV-DP975.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[FMV-DPS972.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-68.0,50.0-120.0,-,-"

[FMV-976.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[FMV-DPA971.reg]
HKR,"MODES\1280,1024",Mode1,,"31.0-65.0,50.0-150.0,+,+"

[FMVDP977.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-150.0,+,+"

[FMVDP978.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[FMVDP98X1.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-180.0,+,+"

[FMV-DP844.reg]
HKR,"MODES\1024,768",Mode1,,"24.0-64.0,50.0-100.0,+,+"

[FMV-DPS842.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[FMV-DPS843.reg]
HKR,"MODES\1024,768",Mode1,,"24.0-65.0,50.0-100.0,+,+"

[FMVDP845.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-100.0,+,+"

[FMVDP846.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-100.0,+,+"

[FMVDP97X4.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-92.0,50.0-120.0,+,+"

[FMVDP97X5.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-92.0,50.0-150.0,+,+"

[FMVDP97X9.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-150.0,+,+"

[FMVDP97W3.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-150.0,+,+"

[FMVDP84X2.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-100.0,+,+"

[V17WDX1G.AddReg]
HKR,"MODES\1280,768",Mode1,,"31.3-48.7,59.6-70.5,+,+"

[FMVDP84X3.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[FMVDP848.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[FMVDP84X7.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[FMVDP84X8.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[VL15TX1.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-48.4,56.0-75.0,+,+"

[VL-1400TS.reg]
HKR,"MODES\1024,768",Mode1,,"31.5-56.5,50.0-75.0,-,-"

[VL2100T.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.5-80.0,59.9-75.0,+,+"

[VL1400SS.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-57.0,56.0-75.0,+,+"

[VL15DX4G.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.3-48.7,59.6-70.5,+,+"

[VL15DX5G.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.3-48.7,59.6-70.5,+,+"

[VL14TX1.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-48.4,56.0-75.0,+,+"

[FMV-DP993.reg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-120.0,-,-"

[FMVDP994.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[FMV-DP97Y1.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-110.0,-,-"

[FMV-DP97Y2.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-110.0,-,-"

[FMVDP97Y3.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[FMVDP97Y4.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-64.0,50.0-150.0,+,+"

[FMVDP97Y5.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-110.0,+,+"

[FMVDP97Y6.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[FMVDP97X1.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[FMVDP97X2.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-92.0,50.0-120.0,+,+"

[FMVDP97X3.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[FMV-DP84Y1.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[FMV-DP84Y2.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-90.0,+,+"

[FMV-DP84Y3.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[FMVDP84Y4.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-100.0,+,+"

[FMVDP84Y5.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-100.0,+,+"

[FMVDP84X1.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-100.0,+,+"


;-------------------------------------------------
; User visible strings

[Strings]
MS="Microsoft"

Delta="Delta Electronics, Inc."
ECS="ELITEGROUP Computer Systems"
EIZONANAO="EIZO NANAO"
ELSA="Elsa AG"
EPSON-J="EPSON"
Fujitsu="FUJITSU"

Delta_DA0570="Delta DA-570"
Delta_DB0770="Delta DB-770"
DA995="Delta DA-995"
Delta_DA1565="Delta DA-1565"
Delta_DB1765="Delta DB-1765"
DC770="Delta DC-770"
DE570="Delta DE-570"

M1401="ECS VERTOS 1401"
M1501="ECS VERTOS 1501"
M1502="ECS VERTOS 1502"
M1503="ECS VERTOS 1503"
M1700="ECS VERTOS 1700"
M1701="ECS VERTOS 1701"
M1702="ECS VERTOS 1702"
M2101="ECS VERTOS 2101"
M2102="ECS VERTOS 2102"

F351="EIZO FlexScan F351"
F553="EIZO FlexScan F553"
F563="EIZO FlexScan F563"
F764="EIZO FlexScan F764"
F784="EIZO FlexScan F784"
e6600="EIZO FlexScan 6600"
e6500="EIZO FlexScan 6500"
e9060S="EIZO 9060S"
e9065S="EIZO 9065S"
T563="EIZO FlexScan T563"
e9070S="EIZO 9070S"
e9080i="EIZO 9080i"
e9400i="EIZO 9400i"
e9500="EIZO 9500"
eF340iW="EIZO FlexScan F340iW"
F552="EIZO FlexScan F552"
eF560iW="EIZO FlexScan F560iW"
eF750i="EIZO FlexScan F750i"
eF760iW="EIZO FlexScan F760iW"
eF780iW="EIZO FlexScan F780iW"
eT560i="EIZO FlexScan T560i"
eT660i="EIZO FlexScan T660i"
T562="EIZO FlexScan T562"
T662="EIZO FlexScan T662"
eF550iW="EIZO FlexScan F550iW"
F35="EIZO F35"
T57S="EIZO T57S"
T67="EIZO T67"
T67S="EIZO T67S"
F56="EIZO F56"
T57="EIZO T57"
F77="EIZO F77"
F78="EIZO F78"
F55="EIZO F55"
L23="EIZO L23"
T77="EIZO T77"
F67="EIZO F67"
T68="EIZO T68"
F55S="EIZO F55S"
F77S="EIZO FlexScan F77S"
L66="EIZO L66"
F57="EIZO FlexScan F57"
L360="EIZO L360"
T960_E="EIZO T960"
FXB5E="EIZO FX-B5"
TXC7SE="EIZO TX-C7S"
TXD7SE="EIZO TX-D7S"
FXC6E="EIZO FX-C6"
TXC7E="EIZO TX-C7"
FXE7E="EIZO FX-E7"
FXE8E="EIZO FX-E8"
FXC5E="EIZO FX-C5"
L23A="EIZO L23"
L34="EIZO FlexScan L34"
FXD7="EIZO FX-D7"
TXD7="EIZO TX-D7"
FXC5S="EIZO FX-C5S"
FXE7S="EIZO NANAO FlexScan FX-E7S"
L66B="EIZO L66"
FXC7="EIZO NANAO FlexScan FX-C7"
L360B="EIZO L360"
T960_U="EIZO T960"
T550="T550"
P4260="P4260"
F520="F520"
F980="F980"
F730="F730"
T760="T760"
L661="L661"
L680="L680"
L350="L350"
T961="T961"
L660="L660"
F930="F930"
T761="T761"
T962="T962"
T561="T561"
L351="L351"
L371D="L371"
L371="L371"
L671D="L671"
L671="L671"
L771="L771"
L675D="L675"
L675="L675"
N88F="EIZO FlexScan 88F"
N77F="EIZO FlexScan 77F"
F2-15="NANAO USA F2-15"
F2-17="NANAO USA F2-17"
F2-17EX="NANAO USA F2-17EX"
F2-21="NANAO USA F2-21"
FX2-21="NANAO USA FX2-21"
T2-17TS="NANAO USA FlexScan T2-17TS"
n6600="NANAO FlexScan 6600"
n9065S="NANAO 9065S"
n9400i="NANAO 9400i"
n9500="NANAO 9500"
nF340iW="NANAO FlexScan F340iW"
nF550iW="NANAO FlexScan F550iW"
nF560iW="NANAO FlexScan F560iW"
nF750i="NANAO FlexScan F750i"
nF760iW="NANAO FlexScan F760iW"
nF780iW="NANAO FlexScan F780iW"
nT560i="NANAO FlexScan T560i"
nT660i="NANAO FlexScan T660i"
T2-17="NANAO USA FlexScan T2-17"
T2-20="NANAO USA FlexScan T2-20"
6300="NANAO USA FlexScan 6300"
33F="NANAO FlexScan 33F"
88F="NANAO FlexScan 88F"
54T="NANAO FlexScan 54T"
52F="NANAO FlexScan 52F"
n6500="NANAO FlexScan 6500"
n9060S="NANAO 9060S"
9070U="NANAO 9070U"
n9080i="NANAO 9080i"
F347="NANAO FlexScan F347"
F550i="NANAO FlexScan F550i"
F557="NANAO FlexScan F557"
77F="NANAO FlexScan 77F"
F780iJ="NANAO FlexScan F780iJ"
T560iJ="NANAO FlexScan T560iJ"
T660iJ="NANAO FlexScan T660iJ"
56T="NANAO FlexScan 56T"
68T="NANAO FlexScan 68T"
F347II="NANAO FlexScan F347II"
55F="NANAO FlexScan 55F"
76F="NANAO FlexScan 76F"
T567="NANAO FlexScan T567"
53T="NANAO FlexScan 53T"
56TS="NANAO FlexScan 56TS"
68TS="NANAO FlexScan 68TS"
E35F="EIZO FlexScan E35F"
E57T="EIZO FlexScan E57T"
E66T="EIZO FlexScan E66T"
E65T="EIZO FlexScan E65T"
E53F="EIZO FlexScan E53F"
E55D="EIZO FlexScan E55D"
E75F="EIZO FlexScan E75F"
E78F="EIZO FlexScan E78F"
E51F="EIZO FlexScan E51F"
L23B="EIZO FlexScan E141L"
E57Ts="EIZO FlexScan E57Ts"
E76D="EIZO FlexScan E76D"
E151L="EIZO FlexScan E151L"
E67F="EIZO E67F"
E67T="EIZO E67T"
E51FS="EIZO E51FS"
E76F="EIZO FlexScan E76F"
L66A="EIZO L66"
E54F="EIZO FlexScan E54F"
L360A="EIZO L360"
T960_J="EIZO T960"

ECOMO17="Elsa Ecomo Office"

CRV-1700="EPSON CRV-1700"
CRV-1700S="EPSON CRV-1700S"
CRV-1780D="EPSON CRV-1780D"
CRV-2100D="EPSON CRV-2100D"
ELP-3500="EPSON ELP-3500"
ELP-5000="EPSON ELP-5000"
ELP-7000="EPSON ELP-7000"

FUJITSU_1554="Fujitsu 1554G+"
FUJITSU1568="Fujitsu 1568G1"
FUJITSU1769="Fujitsu 1769G"
FUJ-x150f="Fujitsu x150f"
FMVDP997="Fujitsu FMV-DP997,FMVWDP214"
FMVDP9710="Fujitsu FMV-DP9710,9710A"
VL1700SS="Fujitsu VL-1700SS"
FUJ-x176="Fujitsu x176"
FUJ-x177="Fujitsu x177"
FUJ-x177a="Fujitsu x177a"
FMVDP9714="FMVDP9714"
FUJ-e155="Fujitsu e155"
FMVDP849="FMV-DP849"
VL1530SW="Fujitsu VL-1530SW"
VL1540S="Fujitsu VL-1540S"
VL1550S="Fujitsu VL-1550S"
VLP150="Fujitsu VL-P150"
FMV-DP975="Fujitsu FMV-DP975"
FMV-DPS972="Fujitsu FMV-DPS972"
FMV-DP976="Fujitsu FMV-DP976"
FMV-DPA971="Fujitsu FMV-DPA971"
FMVDP977="Fujitsu FMV-DP977"
FMVDP978="Fujitsu FMV-DP978"
FMVDP98X1="Fujitsu FMV-DP98X1"
FMV-DP844="Fujitsu FMV-DP844"
FMV-DPS842="Fujitsu FMV-DPS842"
FMV-DPS843="Fujitsu FMV-DPS843"
FMVDP845="Fujitsu FMV-DP845"
FMVDP846="Fujitsu FMV-DP846"
FMVDP97X4="Fujitsu FMV-DP97X4"
FMVDP97X5="Fujitsu FMVDP97X5(G)/FMVDP97X6"
FMVDP97X9="Fujitsu FMVDP97X9(G),W2G,9713"
FMVDP97W3="FMVDP97W3G"
FMVDP84X2="Fujitsu FMV-DP84X2"
V17WDX1G="Fujitsu VL-17WDX1G"
FMVDP84X3="Fujitsu FMV-DP84X3(G)"
FMVDP848="Fujitsu FMVDP84X5G,X6G,848"
FMVDP84X7="FMVDP84X7G"
FMVDP84X8="FMVDP84X8G"
VL15TX1="Fujitsu VL-15TX1(G)"
VL-1400TS="Fujitsu VL-1400TS"
VL2100T="Fujitsu VL-2100T"
VL1400SS="Fujitsu VL-1400SS"
VL15DX4G="Fujitsu VL-15DX4G"
VL15DX5G="Fujitsu VL-15DX5G"
VL14TX1="Fujitsu VL-14TX1"
FMV-DP993="Fujitsu FMV-DP993"
FMVDP994="Fujitsu FMV-DP994"
FMV-DP97Y1="Fujitsu FMV-DP97Y1"
FMV-DP97Y2="Fujitsu FMV-DP97Y2"
FMVDP97Y3="Fujitsu FMV-DP97Y3"
FMVDP97Y4="Fujitsu FMV-DP97Y4"
FMVDP97Y5="Fujitsu FMV-DP97Y5"
FMVDP97Y6="Fujitsu FMV-DP97Y6"
FMVDP97X1="Fujitsu FMV-DP97X1"
FMVDP97X2="Fujitsu FMV-DP97X2"
FMVDP97X3="Fujitsu FMV-DP97X3"
FMV-DP84Y1="Fujitsu FMV-DP84Y1"
FMV-DP84Y2="Fujitsu FMV-DP84Y2"
FMV-DP84Y3="Fujitsu FMV-DP84Y3"
FMVDP84Y4="Fujitsu FMV-DP84Y4"
FMVDP84Y5="Fujitsu FMV-DP84Y5"
FMVDP84X1="Fujitsu FMV-DP84X1"

