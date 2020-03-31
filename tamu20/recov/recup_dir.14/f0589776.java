torBase

[MonitorBase]
CopyFiles=monitor.infs.copy
[monitor.infs.copy]
monitor.inf
monitor2.inf
monitor3.inf
monitor4.inf
monitor5.inf
monitor6.inf
monitor7.inf
monitor8.inf

[SysCfgClasses]
Monitor, %Unknown.DeviceDesc%,MONITOR,4,%MonitorClassName%   ; Default to "Unknown Monitor"


; Install class "Monitor"
;-------------------------------------------------
[ClassInstall]
AddReg=ClassAddReg
[ClassAddReg]
HKR,,,,%MonitorClassName%
HKR,,Installer,,"SetupX.Dll, Monitor_ClassInstaller"
HKR,,Icon,,"-1"

[ClassDelReg]


[ClassInstall32.NT]
AddReg=monitor_class_addreg
[monitor_class_addreg]
HKR,,,,%MonitorClassName%
HKR,,Installer32,,"Desk.Cpl,MonitorClassInstaller"
HKR,,Icon,,"-1"
HKR,,NoInstallClass,,"1"
HKR,,TroubleShooter-0,,"hcp://help/tshoot/tsdisp.htm"
HKR,,SilentInstall,,1

; Monitors to hide from pick list
;-------------------------------------------------
[ControlFlags]
ExcludeFromSelect=Monitor\Default_Monitor

;-------------------------------------------------
; Manufacturers

[Manufacturer]
%Generic%=Generic,NTamd64
%Acer%=Acer,NTamd64
%AOC%=AOC,NTamd64
%APPLEM%=APPLEM,NTamd64
%AST%=AST,NTamd64
%Belinea%=Belinea,NTamd64
%BRIDGE%=BRIDGE,NTamd64
%COMPAQ%=COMPAQ,NTamd64
%CTX%=CTX,NTamd64
%Daewoo%=Daewoo,NTamd64
%DEC%=DEC,NTamd64
%DELL%=DELL,NTamd64


;-------------------------------------------------
; Manufacturer Sections

[Generic.NTamd64]
%Unknown.DeviceDesc%=Unknown.Install,Monitor\Default_Monitor	; for auto-install
%Unknown.DeviceDesc%=Unknown.Install	; for pick list
%*PNP09FF.DeviceDesc%=VESADDC.Install,*PNP09FF

%Laptop640.DeviceDesc%=Laptop640.Install,Monitor\MS_0001
%Laptop800.DeviceDesc%=Laptop800.Install,Monitor\MS_0002
%Laptop1024.DeviceDesc%=Laptop1024.Install,Monitor\MS_0003
%Laptop1152.DeviceDesc%=Laptop1152.Install,Monitor\MS_0004
%Laptop1280.DeviceDesc%=Laptop1280.Install,Monitor\MS_0005
%Laptop1600.DeviceDesc%=Laptop1600.Install,Monitor\MS_0006

%TVGen.DeviceDesc%=640.Install,Monitor\PNP09FE
%TVGen.DeviceDesc%=640.Install,Monitor\*PNP09FE

%640.DeviceDesc%=640.Install,Monitor\MS_0640
%800.DeviceDesc%=800.Install,Monitor\MS_0800
%1024.DeviceDesc%=1024.Install,Monitor\MS_1024
%1280.DeviceDesc%=1280.Install,Monitor\MS_1280
%1600.DeviceDesc%=1600.Install,Monitor\MS_1600

[Acer.NTamd64]
%7155%=7155, Monitor\API0037
%ACER77S%=ACER77S.install, Monitor\API0398
%7111D%=7111D, Monitor\API440B
%7133D%=7133D, Monitor\API4421
%7134E%=7134e, Monitor\API4522
%7154E%=7154e, Monitor\API4536
%7156E%=7156e, Monitor\API4538
%7176IE%=7176ie, Monitor\API454C
%7178IE%=7178ie, Monitor\API454E
%7156I%=7156i, Monitor\API4938
%7176i%=7176i, Monitor\API494C
%7178i%=7178i, Monitor\API494E
%7198i%=7198i, Monitor\API4962
%7133DL%=7133DL, Monitor\API4C21
%7134TL%=7134TL, Monitor\API4C22
%7155L%=7155L, Monitor\API4C37
%7156L%=7156L, Monitor\API4C38
%7176N%=7176N, Monitor\API4E4C
%7133S%=7133s, Monitor\API5321
%7134S%=7134s, Monitor\API5322
%7154S%=7154s, Monitor\API5336
%7156S%=7156s, Monitor\API5338
%7176IS%=7176is, Monitor\API534C
%7134T%=7134T, Monitor\API5422
%api1455%=api1455.install, Monitor\API5514
%api1555%=api1555.install, Monitor\API5515
%api55s%=api55s.install, Monitor\API9802

[AOC.NTamd64]
%S566%=S566, Monitor\AOCA566
%S782%=S782, Monitor\AOCA782
%4VLR%=4VLR, Monitor\AOCD350
%D566%=D566, Monitor\AOCD566
%5Glr%=5Glr, Monitor\AOCE570
%7Dlr%=7Dlr, Monitor\AOCE750

[APPLEM.NTamd64]
%APPLE850%=APPLE850, MONITOR\APP0352

[AST.NTamd64]
%AST4V%=AST4V, Monitor\AST8001
%AST4I%=AST4I, Monitor\AST8002
%AST4N%=AST4N, Monitor\AST8003
%AST4L%=AST4L, Monitor\AST8004
%AST5L%=AST5L, Monitor\AST8005
%AST7L%=AST7L, Monitor\AST8006
%AST7H%=AST7H, Monitor\AST8007
%AST20H%=AST20H, Monitor\AST8008
%AST4Ls%=AST4Ls, Monitor\AST8009
%AST5V%=AST5V, Monitor\AST800A

[Belinea.NTamd64]
%105095%=105095, Monitor\MAX3539
%104065%=104065, Monitor\MAX4065
%105575%=105575, Monitor\MAX7555

[BRIDGE.NTamd64]
%BM-17C%=BM-17C.Install, Monitor\BRG00AB

[COMPAQ.NTamd64]
%1024%=C1024, Monitor\CPQ0011
%1024%=C1024, Monitor\CPQ0012
%1024%=C1024, Monitor\CPQ0013
%1024%=C1024, Monitor\CPQ0014
%1024%=C1024, Monitor\CPQ0015
%1024%=C1024, Monitor\CPQ0016
%PR140%=PRB, Monitor\CPQ0017
%PR140%=PRB, Monitor\CPQ0018
%PR140%=PRB, Monitor\CPQ0019
%PR140%=PRB, Monitor\CPQ001A
%PR140%=PRB, Monitor\CPQ0020
%PR140%=PRB, Monitor\CPQ0021
%151FS%=151FS, Monitor\CPQ0022
%151FS%=151FS, Monitor\CPQ0023
%151FS%=151FS, Monitor\CPQ0024
%151FS%=151FS, Monitor\CPQ0025
%151FS%=151FS, Monitor\CPQ0026
%151FS%=151FS, Monitor\CPQ0027
%151FS%=151FS, Monitor\CPQ0028
%PR150%=PRB, Monitor\CPQ0029
%PR150%=PRB, Monitor\CPQ002A
%PR150%=PRB, Monitor\CPQ002B
%PR150%=PRB, Monitor\CPQ002C
%171FS%=171FS, Monitor\CPQ002D
%171FS%=171FS, Monitor\CPQ002E
%171FS%=171FS, Monitor\CPQ002F
%171FS%=171FS, Monitor\CPQ0030
%171FS%=171FS, Monitor\CPQ0031
%171FS%=171FS, Monitor\CPQ0032
%171FS%=171FS, Monitor\CPQ0033
%QV172%=QV200, Monitor\CPQ0040
%QV172%=QV200, Monitor\CPQ0041
%QV172%=QV200, Monitor\CPQ0042
%QV200%=QV200, Monitor\CPQ0043
%QV200%=QV200, Monitor\CPQ0044
%QV200%=QV200, Monitor\CPQ0045
%QV210%=QV200, Monitor\CPQ0046
%QV210%=QV200, Monitor\CPQ0047
%QV210%=QV200, Monitor\CPQ0048
%QV210%=QV200, Monitor\CPQ0049
%1024%=C1024, Monitor\CPQ0100
%1024%=C1024, Monitor\CPQ0146
%1024%=C1024, Monitor\CPQ0147
%151FS%=151FS, Monitor\CPQ0346
%151FS%=151FS, Monitor\CPQ0347
%151FS%=151FS, Monitor\CPQ0348
%151FS%=151FS, Monitor\CPQ0349
%151FS%=151FS, Monitor\CPQ034A
%151FS%=151FS, Monitor\CPQ034B
%171FS%=171FS, Monitor\CPQ0546
%171FS%=171FS, Monitor\CPQ0547
%171FS%=171FS, Monitor\CPQ0548
%171FS%=171FS, Monitor\CPQ0549
%PR140%=PRB, Monitor\CPQ0746
%PR140%=PRB, Monitor\CPQ0747
%PR140%=PRA, Monitor\CPQ0846
%PR140%=PRA, Monitor\CPQ0847
%PR140%=PRA, Monitor\CPQ0848
%PR140%=PRA, Monitor\CPQ0849
%PR140%=PRA, Monitor\CPQ084A
%PR140%=PRA, Monitor\CPQ084B
%PR140%=PRA, Monitor\CPQ084C
%PR140%=PRA, Monitor\CPQ084D
%PR150%=PRB, Monitor\CPQ0946
%PR150%=PRB, Monitor\CPQ0947
%PR150%=PRB, Monitor\CPQ0948
%PR150%=PRB, Monitor\CPQ0949
%PR150%=PRA, Monitor\CPQ0A46
%PR150%=PRA, Monitor\CPQ0A47
%PR150%=PRA, Monitor\CPQ0A48
%PR150%=PRA, Monitor\CPQ0A49
%PR150%=PRA, Monitor\CPQ0A4A
%PR150%=PRA, Monitor\CPQ0A4B
%PR150%=PRA, Monitor\CPQ0A4C
%PR150%=PRA, Monitor\CPQ0A4D
%140%=140, Monitor\CPQ0D46
%140%=140, Monitor\CPQ0D47
%140%=140, Monitor\CPQ0D48
%140%=140, Monitor\CPQ0D49
%140%=140, Monitor\CPQ0D4A
%140%=140, Monitor\CPQ0D4B
%140%=140, Monitor\CPQ0D4C
%140%=140, Monitor\CPQ0D4D
%150%=150, Monitor\CPQ0F46
%150%=150, Monitor\CPQ0F47
%150%=150, Monitor\CPQ0F48
%150%=150, Monitor\CPQ0F49
%150%=150, Monitor\CPQ0F4A
%150%=150, Monitor\CPQ0F4B
%150%=150, Monitor\CPQ0F4C
%150%=150, Monitor\CPQ0F4D
%CPQ-P70%=CPQ-P70.Install, Monitor\CPQ1320
%CPQ-P110%=CPQ-P110.Install, Monitor\CPQ1321
%CPQ-V50%=CPQ-V50.Install, Monitor\CPQ1322
%CPQ-P50%=CPQ-P50.Install, Monitor\CPQ1323
%CPQ-TFT500%=CPQ-TFT500.Install, Monitor\CPQ1324
%V900%=V900.Install, Monitor\CPQ1325
%CPQ-P1610%=CPQ-P1610.Install, Monitor\CPQ1327
%TFT8000%=TFT8000.Install, Monitor\CPQ1329
%CPQ-V40%=CPQ-V40.Install, Monitor\CPQ1334
%CPQ-V45%=CPQ-V45.Install, Monitor\CPQ1338
%S700%=S700.Install, Monitor\CPQ1349
%S900%=S900.Install, Monitor\CPQ1350
%CPQ-V70%=CPQ-V70.Install, Monitor\CPQ170A
%MV500%=MV500.Install, Monitor\CPQ3012
%MV700%=MV700.Install, Monitor\CPQ3013
%MV400%=MV400.Install, Monitor\CPQ3014
%MV540%=MV540.Install, Monitor\CPQ3035
%MV740%=MV740.Install, Monitor\CPQ3036
%CV535%=CV535.Install, Monitor\CPQ3037
%CV735%=CV735.Install, Monitor\CPQ3038
%MV940%=MV940.Install, Monitor\CPQ3050
%CV935%=CV935.Install, Monitor\CPQ3051
%FS740%=FS740.Install, Monitor\CPQ3053
%910T%=910T.Install, Monitor\CPQ3056
%710T%=710T.Install, Monitor\CPQ3057
%FP745A%=FP745A.Install, Monitor\CPQ3059
%MV940%=MV940.Install, Monitor\CPQ3061
%I540%=I540.Install, Monitor\CPQ3062
%I740%=I740.Install, Monitor\CPQ3063
%FS940%=FS940.Install, Monitor\CPQ3065

[CTX.NTamd64]
%CTX_0150%=CTX_0150.Install, Monitor\CTX0150
%1451%=1451, Monitor\CTX1451
%1551%=1551, Monitor\CTX1551
%1562%=1562, Monitor\CTX1562
%CTX1565%=CTX1565, Monitor\CTX1565
%1765%=1765, Monitor\CTX1765
%1785%=1785, Monitor\CTX1785
%2085%=2085, Monitor\CTX2085
%2185%=2185, Monitor\CTX2185
%CTX3621%=CTX3621.Install, Monitor\CTX3621

[Daewoo.NTamd64]
%CPC-8000%=CPC-8000, Monitor\CPC8000
%CMC-2000MW%=CMC-2000MW, Monitor\DWE0000
%CMC-2100MW%=CMC-2100MW, Monitor\DWE1000
%CMC-2102MW%=CMC-2102MW, Monitor\DWE102A
%CMC-1423B1%=CMC-1423B1, Monitor\DWE1423
%CMC-1427X1%=CMC-1427X1, Monitor\DWE1427
%CMC-1502B1W%=CMC-1502B1W, Monitor\DWE1502
%CMC-1505XW%=CMC-1505XW, Monitor\DWE1505
%CMC-1507X1%=CMC-1507X1, Monitor\DWE1507
%CMC-1703BW%=CMC-1703BW, Monitor\DWE1703
%CMC-1414BAW%=CMC-1414BAW, Monitor\DWE4143
%CMC-1420AVGW%=CMC-1420AVGW, Monitor\DWE420A
%CMC-1424SW%=CMC-1424SW, Monitor\DWE4241
%CMC-1424XW%=CMC-1424XW, Monitor\DWE4242
%CMC-1427XW%=CMC-1424XW, Monitor\DWE4272
%CMC-1428SW%=CMC-1424SW, Monitor\DWE4281
%CMC-1428XW%=CMC-1424XW, Monitor\DWE4282
%DWE-431X%=DWE-431X, Monitor\DWE4312
%CMC-1509BW%=CMC-1509BW, Monitor\DWE5093
%DWE-511X%=DWE-518X, Monitor\DWE5112
%CMC-1511BW%=CMC-1511BW, Monitor\DWE5113
%DWE-512B%=DWE-512B, Monitor\DWE5123
%DWE-518X%=DWE-518X, Monitor\DWE5182
%DWE-518B%=DWE-518B, Monitor\DWE5183
%519B%=519B.Install, Monitor\DWE5193
%CMC-1701MW%=CMC-1701MW, Monitor\DWE7010
%CMC-1701M2W%=CMC-1701M2W, Monitor\DWE701B
%CMC-1704C%=CMC-1704C, Monitor\DWE7044
%CMC-1705BW%=CMC-1511BW, Monitor\DWE7053
%CMC-1707BW%=CMC-1511BW, Monitor\DWE7073
%710BDae%=710BDae.Install, Monitor\DWE7103
%710C%=710C.Install, Monitor\DWE7104
%901D%=901D.Install, Monitor\DWE9015

[DEC.NTamd64]
%DEC_1082%=DEC_1082.Install, Monitor\DEC043A
%DEC_1145%=DEC_1145.Install, Monitor\DEC0479
%DEC_1146%=DEC_1146.Install, Monitor\DEC047A
%FR-PCXAV-VY%=FR-PCXAV-VY.Install, Monitor\DEC06D9
%FR-PCXAV-VZ%=FR-PCXAV-VZ.Install, Monitor\DEC06DA
%FR-PCXAV-WY%=FR-PCXAV-WY.Install, Monitor\DEC06F9
%FR-PCXAV-WZ%=FR-PCXAV-WZ, Monitor\DEC06FA
%FR-PCXAV-YY%=FR-PCXAV-YY.Install, Monitor\DEC0739
%FR-PCXAV-YZ%=FR-PCXAV-YZ, Monitor\DEC073A
%FR-PCXCV-C*%=FR-PCXCV-C*, Monitor\DEC770C
%FR-PCXCV-D*%=FR-PCXCV-D*, Monitor\DEC970C
%FR-PCXAV-TZ%=FR-PCXAV-TZ.Install, Monitor\DEC9A06
%FR-PCXBV-E*%=FR-PCXBV-E*, Monitor\DECBA08
%FR-PCXBV-F*%=FR-PCXBV-F*, Monitor\DECDA08

[DELL.NTamd64]
%Dell_14XE-U%=Dell_14XE-U, Monitor\DEL139A
%Dell_14XE-E%=Dell_14XE-E, Monitor\DEL139B
%Dell_14XE-J%=Dell_14XE-J, Monitor\DEL139C
%Dell_14XE-S%=Dell_14XE-S, Monitor\DEL139D
%D1569%=D1569.install, Monitor\DEL1569
%Dell_V17X-U%=Dell_V17X-U, Monitor\DEL2210
%Dell_V17X-E%=Dell_V17X-E, Monitor\DEL2211
%Dell_V17X-J%=Dell_V17X-J, Monitor\DEL2212
%Dell_V17X-S%=Dell_V17X-S, Monitor\DEL2213
%Dell_21TE-U%=Dell_21TE-U, Monitor\DEL2214
%Dell_21TE-E%=Dell_21TE-E, Monitor\DEL2215
%Dell_21TE-J%=Dell_21TE-J, Monitor\DEL2216
%Dell_21TE-S%=Dell_21TE-S, Monitor\DEL2217
%P791%=P791.Install, Monitor\DEL3000
%1701FP(digital)%=1701FP(digital).Install, Monitor\DEL3001
%1701FP(analog)%=1701FP(analog).Install, Monitor\DEL3002
%1503FP(digital)%=1503FP(digital).Install, Monitor\DEL3003
%1503FP(analog)%=1503FP(analog).Install, Monitor\DEL3004
%E770s%=E770s.Install, Monitor\DEL300A
%Dell_VS17X-U%=Dell_VS17X-U, Monitor\DEL3024
%Dell_VS17X-E%=Dell_VS17X-E, Monitor\DEL3025
%Dell_VS17X-J%=Dell_VS17X-J, Monitor\DEL3026
%Dell_VS17X-S%=Dell_VS17X-S, Monitor\DEL3027
%1700FP%=1700FP.Install, Monitor\DEL3092
%M570%=M570.Install, Monitor\DEL30CC
%M780%=M780.Install, Monitor\DEL3142
%D1428L%=D1428L, Monitor\DEL3276
%M781s%=M781s.Install, Monitor\DEL32B0
%D828L%=D828L, Monitor\DEL32FE
%828fi%=828fi.Install, Monitor\DEL3319
%V15X%=V15X, Monitor\DEL4273
%D825HT%=D825HT, Monitor\DEL5033
%D1025HTX%=D1025HTX, Monitor\DEL5062
%P1110%=P1110.Install, Monitor\DEL50AB
%P990%=P990.Install, Monitor\DEL50DD
%P780%=P780.Install, Monitor\DEL510F
%D825TM%=D825TM, Monitor\DEL512C
%D1025TM%=D1025TM, Monitor\DEL5155
%D1626HT%=D1626HT, Monitor\DEL515B
%P991%=P991.Install, Monitor\DEL5178
%D2026T%=D2026T, Monitor\DEL5314
%D1025HT%=D1025HT, Monitor\DEL5319
%P1690%=P1690.Install, Monitor\DEL5348
%800M%=800M.Install, Monitor\DEL5697
%D2128TCO%=D2128TCO, Monitor\DEL602F
%D1025HE%=D1025HE, Monitor\DEL6124
%P790%=P790.Install, Monitor\DEL62F5
%D825HR%=D825HR, Monitor\DEL62FF
%ES-17%=ES-17, Monitor\DEL635E
%M991%=M991.Install, Monitor\DEL7001
%E771p%=E771p.Install, Monitor\DEL7002
%D1226H%=D1226H, Monitor\DEL7077
%M990%=M990.Install, Monitor\DEL708A
%1501FP(Digital)%=1501FP(Digital).Install, Monitor\DEL7140
%1500FP%=1500FP.Install, Monitor\DEL715D
%M770%=M770.Install, Monitor\DEL71A5
%D1028L%=D1028L, Monitor\DEL730B
%E770p%=E770p.Install, Monitor\DEL7340
%1501FP(Analog)%=1501FP(Analog).Install, Monitor\DEL73A4
%M781p%=M781p.Install, Monitor\DEL73BD
%1400FP%=1400FP, Monitor\DEL8162
%M1110%=M1110.Install, Monitor\DEL93D5
%E551a%=E551a.Install, Monitor\DELA000
%E771a%=E771a.Install, Monitor\DELA001
%E550%=E550.Install, Monitor\DELA2F1
%E550mm/E550mmw%=E550mm/E550mmw.Install, Monitor\DELA355
%1401FP%=1401FP.Install, Monitor\DELC0EC
%E551c%=E551c.Install, Monitor\DELD000


;-------------------------------------------------
; Install sections

; -------------- Generic types
[Unknown.Install]
DelReg=DCR
AddReg=Unknown.AddReg

[VESADDC.Install]
DelReg=DCR
AddReg=VESADDC.AddReg, 1600, DPMS

[Laptop640.Install]
DelReg=DCR
AddReg=640VESA60, DPMS

[Laptop800.Install]
DelReg=DCR
AddReg=800VESA60, DPMS

[Laptop1024.Install]
DelReg=DCR
AddReg=1024VESA60, DPMS

[Laptop1152.Install]
DelReg=DCR
AddReg=1152VESA60, DPMS

[Laptop1280.Install]
DelReg=DCR
AddReg=1280VESA60, DPMS

[Laptop1600.Install]
DelReg=DCR
AddReg=1600VESA60, DPMS

[640.Install]
DelReg=DCR
AddReg=640

[800.Install]
DelReg=DCR
AddReg=800

[1024.Install]
DelReg=DCR
AddReg=1024

[1280.Install]
DelReg=DCR
AddReg=1280

[1600.Install]
DelReg=DCR
AddReg=1600

; -------------- Acer
[7155]
DelReg=DCR
AddReg=7155.AddReg, 1024, DPMS

[ACER77S.install]
DelReg=DCR
AddReg=ACER77S.AddReg, 1280, DPMS

[7111D]
DelReg=DCR
AddReg=7111D.AddReg, 1024, DPMS

[7133D]
DelReg=DCR
AddReg=7133D.AddReg, 1024, DPMS

[7134e]
DelReg=DCR
AddReg=7134e.AddReg, 1024, DPMS

[7154e]
DelReg=DCR
AddReg=7154e.AddReg, 1024, DPMS

[7156e]
DelReg=DCR
AddReg=7156e.AddReg, 1024, DPMS

[7176ie]
DelReg=DCR
AddReg=7176ie.AddReg, 1280, DPMS

[7178ie]
DelReg=DCR
AddReg=7178ie.AddReg, 1280, DPMS

[7156i]
DelReg=DCR
AddReg=7156i.AddReg, 1024, DPMS

[7176i]
DelReg=DCR
AddReg=7176i.AddReg, 1280, DPMS

[7178i]
DelReg=DCR
AddReg=7178i.AddReg, 1280, DPMS

[7198i]
DelReg=DCR
AddReg=7198i.AddReg, 1280, DPMS

[7133DL]
DelReg=DCR
AddReg=7133DL.AddReg, 1024, DPMS

[7134TL]
DelReg=DCR
AddReg=7134TL.AddReg, 1024, DPMS

[7155L]
DelReg=DCR
AddReg=7155L.AddReg, 1024, DPMS

[7156L]
DelReg=DCR
AddReg=7156L.AddReg, 1024, DPMS

[7176N]
DelReg=DCR
AddReg=7176N.AddReg, 1280, DPMS

[7133s]
DelReg=DCR
AddReg=7133s.AddReg, 1024, DPMS

[7134s]
DelReg=DCR
AddReg=7134s.AddReg, 1024, DPMS

[7154s]
DelReg=DCR
AddReg=7154s.AddReg, 1024, DPMS

[7156s]
DelReg=DCR
AddReg=7156s.AddReg, 1024, DPMS

[7176is]
DelReg=DCR
AddReg=7176is.AddReg, 1280, DPMS

[7134T]
DelReg=DCR
AddReg=7134T.AddReg, 1024, DPMS

[api1455.install]
DelReg=DCR
AddReg=api1455.AddReg, 1024, DPMS

[api1555.install]
DelReg=DCR
AddReg=api1555.AddReg, 1024, DPMS

[api55s.install]
DelReg=DCR
AddReg=api55s.AddReg, 1024, DPMS

; -------------- AOC
[S566]
DelReg=DCR
AddReg=S566.AddReg, 1280, DPMS

[S782]
DelReg=DCR
AddReg=S782.AddReg, 1600, DPMS

[4VLR]
DelReg=DCR
AddReg=4VLR.AddReg, 1024, DPMS

[D566]
DelReg=DCR
AddReg=D566.AddReg, 1280, DPMS

[5Glr]
DelReg=DCR
AddReg=5Glr.AddReg, 1280, DPMS

[7Dlr]
DelReg=DCR
AddReg=7Dlr.AddReg, 1280, DPMS

; -------------- APPLEM
[APPLE850]
DelReg=DCR
AddReg=APPLE850.AddReg, 1600, DPMS

; -------------- AST
[AST4V]
DelReg=DCR
AddReg=AST4V.AddReg, 640

[AST4I]
DelReg=DCR
AddReg=AST4I.AddReg, 1024

[AST4N]
DelReg=DCR
AddReg=AST4N.AddReg, 1024, DPMS

[AST4L]
DelReg=DCR
AddReg=AST4L.AddReg, 1024, DPMS

[AST5L]
DelReg=DCR
AddReg=AST5L.AddReg, 1280, DPMS

[AST7L]
DelReg=DCR
AddReg=AST7L.AddReg, 1280, DPMS

[AST7H]
DelReg=DCR
AddReg=AST7H.AddReg, 1280, DPMS

[AST20H]
DelReg=DCR
AddReg=AST20H.AddReg, 1280, DPMS

[AST4Ls]
DelReg=DCR
AddReg=AST4Ls.AddReg

[AST5V]
DelReg=DCR
AddReg=AST5V.AddReg, 1024, DPMS

; -------------- Belinea
[105095]
DelReg=DCR
AddReg=105095.AddReg, 1280, DPMS

[104065]
DelReg=DCR
AddReg=104065.AddReg, 1024, DPMS

[105575]
DelReg=DCR
AddReg=105575.AddReg, 1280, DPMS

; -------------- BRIDGE
[BM-17C.Install]
DelReg=DCR
AddReg=BM-17C.AddReg, 1280, DPMS

; -------------- COMPAQ
[C1024]
DelReg=DCR
AddReg=1024.AddReg, 1024, DPMS

[PRB]
DelReg=DCR
AddReg=PRB.AddReg, 1024, DPMS

[151FS]
DelReg=DCR
AddReg=151FS.AddReg, 1024, DPMS

[171FS]
DelReg=DCR
AddReg=171FS.AddReg, 1024, DPMS

[QV200]
DelReg=DCR
AddReg=QV200.AddReg, 1280, DPMS

[PRA]
DelReg=DCR
AddReg=PRA.AddReg, 1024, DPMS

[140]
DelReg=DCR
AddReg=140.AddReg, 1024, DPMS

[150]
DelReg=DCR
AddReg=150.AddReg, 1024, DPMS

[CPQ-P70.Install]
DelReg=DCR
AddReg=CPQ-P70.AddReg, 1600, DPMS

[CPQ-P110.Install]
DelReg=DCR
AddReg=CPQ-P110.AddReg, 1800, DPMS

[CPQ-V50.Install]
DelReg=DCR
AddReg=CPQ-V50.AddReg, 1024, DPMS

[CPQ-P50.Install]
DelReg=DCR
AddReg=CPQ-P50.AddReg, 1280, DPMS

[CPQ-TFT500.Install]
DelReg=DCR
AddReg=CPQ-TFT500.AddReg, 1024, DPMS

[V900.Install]
DelReg=DCR
AddReg=V900.AddReg, 1600, DPMS

[CPQ-P1610.Install]
DelReg=DCR
AddReg=CPQ-P1610.AddReg, 1920, DPMS

[TFT8000.Install]
DelReg=DCR
AddReg=TFT8000.AddReg, 1280, DPMS

[CPQ-V40.Install]
DelReg=DCR
AddReg=CPQ-V40.AddReg, 1024, DPMS

[CPQ-V45.Install]
DelReg=DCR
AddReg=CPQ-V45.AddReg, 1024, DPMS

[S700.Install]
DelReg=DCR
AddReg=S700.AddReg, 1280, DPMS

[S900.Install]
DelReg=DCR
AddReg=S900.AddReg, 1600, DPMS

[CPQ-V70.Install]
DelReg=DCR
AddReg=CPQ-V70.AddReg, 1280, DPMS

[MV500.Install]
DelReg=DCR
AddReg=MV500.AddReg, 1024, DPMS

[MV700.Install]
DelReg=DCR
AddReg=MV700.AddReg, 1280, DPMS

[MV400.Install]
DelReg=DCR
AddReg=MV400.AddReg, 1024, DPMS

[MV540.Install]
DelReg=DCR
AddReg=MV540.AddReg, 1024, DPMS

[MV740.Install]
DelReg=DCR
AddReg=MV740.AddReg, 1280, DPMS

[CV535.Install]
DelReg=DCR
AddReg=CV535.AddReg, 1024, DPMS

[CV735.Install]
DelReg=DCR
AddReg=CV735.AddReg, 1280, DPMS

[MV940.Install]
DelReg=DCR
AddReg=MV940.AddReg, 1600, DPMS

[CV935.Install]
DelReg=DCR
AddReg=CV935.AddReg, 1600, DPMS

[FS740.Install]
DelReg=DCR
AddReg=FS740.AddReg, 1280, DPMS

[910T.Install]
DelReg=DCR
AddReg=910T.AddReg, 1600, DPMS

[710T.Install]
DelReg=DCR
AddReg=710T.AddReg, 1600, DPMS

[FP745A.Install]
DelReg=DCR
AddReg=FP745A.AddReg, 1024, DPMS

[I540.Install]
DelReg=DCR
AddReg=I540.AddReg, 1024, DPMS

[I740.Install]
DelReg=DCR
AddReg=I740.AddReg, 1280, DPMS

[FS940.Install]
DelReg=DCR
AddReg=FS940.AddReg, 1600, DPMS

; -------------- CTX
[CTX_0150.Install]
DelReg=DCR
AddReg=CTX_0150.AddReg, 1280, DPMS

[1451]
DelReg=DCR
AddReg=1451.AddReg, 1024, DPMS

[1551]
DelReg=DCR
AddReg=1551.AddReg, 1024, DPMS

[1562]
DelReg=DCR
AddReg=1562.AddReg, 1024, DPMS

[CTX1565]
DelReg=DCR
AddReg=CTX1565.AddReg, 1280, DPMS

[1765]
DelReg=DCR
AddReg=1765.AddReg, 1280, DPMS

[1785]
DelReg=DCR
AddReg=1785.AddReg, 1600, DPMS

[2085]
DelReg=DCR
AddReg=2085.AddReg, 1600, DPMS

[2185]
DelReg=DCR
AddReg=2185.AddReg, 1600, DPMS

[CTX3621.Install]
DelReg=DCR
AddReg=CTX3621.AddReg, 1280, DPMS

; -------------- Daewoo
[CPC-8000]
DelReg=DCR
AddReg=CPC-8000.AddReg, 1024, DPMS

[CMC-2000MW]
DelReg=DCR
AddReg=CMC-2000MW.AddReg, 1280, DPMS

[CMC-2100MW]
DelReg=DCR
AddReg=CMC-2100MW.AddReg, 1280

[CMC-2102MW]
DelReg=DCR
AddReg=CMC-2102MW.AddReg, 1280

[CMC-1423B1]
DelReg=DCR
AddReg=CMC-1423B1.AddReg, 1280, DPMS

[CMC-1427X1]
DelReg=DCR
AddReg=CMC-1427X1.AddReg, 1024, DPMS

[CMC-1502B1W]
DelReg=DCR
AddReg=CMC-1502B1W.AddReg, 1280, DPMS

[CMC-1505XW]
DelReg=DCR
AddReg=CMC-1505XW.AddReg, 1024, DPMS

[CMC-1507X1]
DelReg=DCR
AddReg=CMC-1507X1.AddReg, 1024, DPMS

[CMC-1703BW]
DelReg=DCR
AddReg=CMC-1703BW.AddReg, 1280, DPMS

[CMC-1414BAW]
DelReg=DCR
AddReg=CMC-1414BAW.AddReg, 1024

[CMC-1420AVGW]
DelReg=DCR
AddReg=CMC-1420AVGW.AddReg, 1024, DPMS

[CMC-1424SW]
DelReg=DCR
AddReg=CMC-1424XW.AddReg, 1024, DPMS

[CMC-1424XW]
DelReg=DCR
AddReg=CMC-1424SW.AddReg, 800, DPMS

[DWE-431X]
DelReg=DCR
AddReg=DWE-431X.AddReg, 1024, DPMS

[CMC-1509BW]
DelReg=DCR
AddReg=CMC-1509BW.AddReg, 1280, DPMS

[DWE-518X]
DelReg=DCR
AddReg=DWE-518X.AddReg, 1024, DPMS

[CMC-1511BW]
DelReg=DCR
AddReg=CMC-1511BW.AddReg, 1280, DPMS

[DWE-512B]
DelReg=DCR
AddReg=DWE-512B.AddReg, 1280, DPMS

[DWE-518B]
DelReg=DCR
AddReg=DWE-518B.AddReg, 1280, DPMS

[519B.Install]
DelReg=DCR
AddReg=519B.AddReg, 1280, DPMS

[CMC-1701MW]
DelReg=DCR
AddReg=CMC-1701MW.AddReg, 1280

[CMC-1701M2W]
DelReg=DCR
AddReg=CMC-1701M2W.AddReg, 1280, DPMS

[CMC-1704C]
DelReg=DCR
AddReg=CMC-1704C.AddReg, 1600, DPMS

[710BDae.Install]
DelReg=DCR
AddReg=710BDae.AddReg, 1280, DPMS

[710C.Install]
DelReg=DCR
AddReg=710C.AddReg, 1280, DPMS

[901D.Install]
DelReg=DCR
AddReg=901D.AddReg, 1600, DPMS

; -------------- DEC
[DEC_1082.Install]
DelReg=DCR
AddReg=DEC_1082.AddReg, 1920, DPMS

[DEC_1145.Install]
DelReg=DCR
AddReg=DEC_1145.AddReg, 1600, DPMS

[DEC_1146.Install]
DelReg=DCR
AddReg=DEC_1146.AddReg, 1600, DPMS

[FR-PCXAV-VY.Install]
DelReg=DCR
AddReg=FR-PCXAV-VY.AddReg, 1600, DPMS

[FR-PCXAV-VZ.Install]
DelReg=DCR
AddReg=FR-PCXAV-VZ.AddReg, 1600, DPMS

[FR-PCXAV-WY.Install]
DelReg=DCR
AddReg=FR-PCXAV-WY.AddReg, 1600, DPMS

[FR-PCXAV-WZ]
DelReg=DCR
AddReg=FR-PCXAV-WZ.AddReg, 1600, DPMS

[FR-PCXAV-YY.Install]
DelReg=DCR
AddReg=FR-PCXAV-YY.AddReg, 1280, DPMS

[FR-PCXAV-YZ]
DelReg=DCR
AddReg=FR-PCXAV-YZ.AddReg, 1280, DPMS

[FR-PCXCV-C*]
DelReg=DCR
AddReg=FR-PCXCV-C*.AddReg, 1024, DPMS

[FR-PCXCV-D*]
DelReg=DCR
AddReg=FR-PCXCV-D*.AddReg, 1024, DPMS

[FR-PCXAV-TZ.Install]
DelReg=DCR
AddReg=FR-PCXAV-TZ.AddReg, 1600, DPMS

[FR-PCXBV-E*]
DelReg=DCR
AddReg=FR-PCXBV-E*.AddReg, 1280, DPMS

[FR-PCXBV-F*]
DelReg=DCR
AddReg=FR-PCXBV-F*.AddReg, 1280, DPMS

; -------------- DELL
[Dell_14XE-U]
DelReg=DCR
AddReg=Dell_14XE-U.AddReg, 1280, DPMS

[Dell_14XE-E]
DelReg=DCR
AddReg=Dell_14XE-E.AddReg, 1280, DPMS

[Dell_14XE-J]
DelReg=DCR
AddReg=Dell_14XE-J.AddReg, 1280, DPMS

[Dell_14XE-S]
DelReg=DCR
AddReg=Dell_14XE-S.AddReg, 1280, DPMS

[D1569.install]
DelReg=DCR
AddReg=D1569.AddReg, 1280, DPMS

[Dell_V17X-U]
DelReg=DCR
AddReg=Dell_V17X-U.AddReg, 1600, DPMS

[Dell_V17X-E]
DelReg=DCR
AddReg=Dell_V17X-E.AddReg, 1600, DPMS

[Dell_V17X-J]
DelReg=DCR
AddReg=Dell_V17X-J.AddReg, 1600, DPMS

[Dell_V17X-S]
DelReg=DCR
AddReg=Dell_V17X-S.AddReg, 1600, DPMS

[Dell_21TE-U]
DelReg=DCR
AddReg=Dell_21TE-U.AddReg, 1600, DPMS

[Dell_21TE-E]
DelReg=DCR
AddReg=Dell_21TE-E.AddReg, 1600, DPMS

[Dell_21TE-J]
DelReg=DCR
AddReg=Dell_21TE-J.AddReg, 1600, DPMS

[Dell_21TE-S]
DelReg=DCR
AddReg=Dell_21TE-S.AddReg, 1600, DPMS

[P791.Install]
DelReg=DCR
AddReg=P791.AddReg, 1600, DPMS

[1701FP(digital).Install]
DelReg=DCR
AddReg=1701FP(digital).AddReg, 1280, DPMS

[1701FP(analog).Install]
DelReg=DCR
AddReg=1701FP(analog).AddReg, 1280, DPMS

[1503FP(digital).Install]
DelReg=DCR
AddReg=1503FP(digital).AddReg, 1024, DPMS

[1503FP(analog).Install]
DelReg=DCR
AddReg=1503FP(analog).AddReg, 1024, DPMS

[E770s.Install]
DelReg=DCR
AddReg=E770s.AddReg, 1280, DPMS

[Dell_VS17X-U]
DelReg=DCR
AddReg=Dell_VS17X-U.AddReg, 1280, DPMS

[Dell_VS17X-E]
DelReg=DCR
AddReg=Dell_VS17X-E.AddReg, 1280, DPMS

[Dell_VS17X-J]
DelReg=DCR
AddReg=Dell_VS17X-J.AddReg, 1280, DPMS

[Dell_VS17X-S]
DelReg=DCR
AddReg=Dell_VS17X-S.AddReg, 1280, DPMS

[1700FP.Install]
DelReg=DCR
AddReg=1700FP.AddReg, 1280, DPMS

[M570.Install]
DelReg=DCR
AddReg=M570.AddReg, 1280, DPMS

[M780.Install]
DelReg=DCR
AddReg=M780.AddReg, 1280, DPMS

[D1428L]
DelReg=DCR
AddReg=D1428L.AddReg, 800, DPMS

[M781s.Install]
DelReg=DCR
AddReg=M781s.AddReg, 1600, DPMS

[D828L]
DelReg=DCR
AddReg=D828L.AddReg, 1024, DPMS

[828fi.Install]
DelReg=DCR
AddReg=828fi.AddReg, 1280, DPMS

[V15X]
DelReg=DCR
AddReg=V15X.AddReg, 1280, DPMS

[D825HT]
DelReg=DCR
AddReg=D825HT.AddReg, 1280, DPMS

[D1025HTX]
DelReg=DCR
AddReg=D1025HTX.AddReg, 1280, DPMS

[P1110.Install]
DelReg=DCR
AddReg=P1110.AddReg, 1800, DPMS

[P990.Install]
DelReg=DCR
AddReg=P990.AddReg, 1600, DPMS

[P780.Install]
DelReg=DCR
AddReg=P780.AddReg, 1600, DPMS

[D825TM]
DelReg=DCR
AddReg=D825TM.AddReg, 1280, DPMS

[D1025TM]
DelReg=DCR
AddReg=D1025TM.AddReg, 1600, DPMS

[D1626HT]
DelReg=DCR
AddReg=D1626HT.AddReg, 1600, DPMS

[P991.Install]
DelReg=DCR
AddReg=P991.AddReg, 1600, DPMS

[D2026T]
DelReg=DCR
AddReg=D2026T.AddReg, 1600, DPMS

[D1025HT]
DelReg=DCR
AddReg=D1025HT.AddReg, 1600, DPMS

[P1690.Install]
DelReg=DCR
AddReg=P1690.AddReg, 1920, DPMS

[800M.Install]
DelReg=DCR
AddReg=800M.AddReg, 1280, DPMS

[D2128TCO]
DelReg=DCR
AddReg=D2128TCO.AddReg, 1600, DPMS

[D1025HE]
DelReg=DCR
AddReg=D1025HE.AddReg, 1600, DPMS

[P790.Install]
DelReg=DCR
AddReg=P790.AddReg, 1600, DPMS

[D825HR]
DelReg=DCR
AddReg=D825HR.AddReg, 1280, DPMS

[ES-17]
DelReg=DCR
AddReg=ES-17.AddReg, 1600, DPMS

[M991.Install]
DelReg=DCR
AddReg=M991.AddReg, 1600, DPMS

[E771p.Install]
DelReg=DCR
AddReg=E771p.AddReg, 1280, DPMS

[D1226H]
DelReg=DCR
AddReg=D1226H.AddReg, 1600, DPMS

[M990.Install]
DelReg=DCR
AddReg=M990.AddReg, 1600, DPMS

[1501FP(Digital).Install]
DelReg=DCR
AddReg=1501FP(Digital).AddReg, 1024, DPMS

[1500FP.Install]
DelReg=DCR
AddReg=1500FP.AddReg, 1024, DPMS

[M770.Install]
DelReg=DCR
AddReg=M770.AddReg, 1280, DPMS

[D1028L]
DelReg=DCR
AddReg=D1028L.AddReg, 1280, DPMS

[E770p.Install]
DelReg=DCR
AddReg=E770p.AddReg, 1280, DPMS

[1501FP(Analog).Install]
DelReg=DCR
AddReg=1501FP(Analog).AddReg, 1024, DPMS

[M781p.Install]
DelReg=DCR
AddReg=M781p.AddReg, 1600, DPMS

[1400FP]
DelReg=DCR
AddReg=1400FP.AddReg, 1024, DPMS

[M1110.Install]
DelReg=DCR
AddReg=M1110.AddReg, 1600, DPMS

[E551a.Install]
DelReg=DCR
AddReg=E551a.AddReg, 1024, DPMS

[E771a.Install]
DelReg=DCR
AddReg=E771a.AddReg, 1280, DPMS

[E550.Install]
DelReg=DCR
AddReg=E550.AddReg, 1024, DPMS

[E550mm/E550mmw.Install]
DelReg=DCR
AddReg=E550mm/E550mmw.AddReg, 1024, DPMS

[1401FP.Install]
DelReg=DCR
AddReg=1401FP.AddReg, 1024, DPMS

[E551c.Install]
DelReg=DCR
AddReg=E551c.AddReg, 1024, DPMS


;-------------------------------------------------
; Common AddReg sections

[DCR]
HKR,MODES
HKR,,MaxResolution
HKR,,DPMS
HKR,,ICMProfile

[1024]
HKR,,MaxResolution,,"1024,768"

[1280]
HKR,,MaxResolution,,"1280,1024"

[1600]
HKR,,MaxResolution,,"1600,1200"

[1800]
HKR,,MaxResolution,,"1800,1440"

[1920]
HKR,,MaxResolution,,"1920,1200"

[640]
HKR,,MaxResolution,,"640,480"

[800]
HKR,,MaxResolution,,"800,600"

[DPMS]
HKR,,DPMS,,1


;-------------------------------------------------
; Model AddReg sections

; -------------- Generic types
[Unknown.AddReg]
HKR,"MODES\640,480"

[VESADDC.AddReg]
HKR,"MODES\1600,1200"

[VGA.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,50.0-70.0,-,-"

[640VESA60]
HKR,"MODES\640,480",Mode1,,"60.0,50.0,-,-"
HKR,,PreferredMode,,"640,480,60"

[800VESA60]
HKR,"MODES\640,480",Mode1,,"60.0,50.0,-,-"
HKR,"MODES\800,600",Mode1,,"60.0,60.0,+,+"
HKR,,PreferredMode,,"800,600,60"

[1024VESA60]
HKR,"MODES\640,480",Mode1,,"60.0,50.0,-,-"
HKR,"MODES\1024,768",Mode1,,"60.0,60.0,+,+"
HKR,,PreferredMode,,"1024,768,60"

[1152VESA60]
HKR,"MODES\640,480",Mode1,,"60.0,50.0,-,-"
HKR,"MODES\1152,864",Mode1,,"60.0,60.0,+,+"
HKR,,PreferredMode,,"1152,864,60"

[1280VESA60]
HKR,"MODES\640,480",Mode1,,"60.0,50.0,-,-"
HKR,"MODES\1280,1024",Mode1,,"48.0,65.0,+,+"
HKR,,PreferredMode,,"1280,1024,60"

[1600VESA60]
HKR,"MODES\640,480",Mode1,,"60.0,60.0,-,-"
HKR,"MODES\1600,1200",Mode1,,"48.0,75.0,+,+"
HKR,,PreferredMode,,"1600,1200,60"

; -------------- Acer
[7155.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[ACER77S.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-72.0,50.0-120.0,+,+"

[7111D.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-40.0,55.0-90.0,+,+"

[7133D.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-40.0,55.0-90.0,+,+"

[7134e.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-90.0,+,+"

[7154e.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-90.0,+,+"

[7156e.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7176ie.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7178ie.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-90.0,55.0-90.0,+,+"

[7156i.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7176i.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7178i.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-90.0,55.0-90.0,+,+"

[7198i.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-90.0,55.0-90.0,+,+"

[7133DL.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-40.0,55.0-90.0,+,+"

[7134TL.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-50.0,55.0-90.0,+,+"

[7155L.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7156L.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7176N.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7133s.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-40.0,55.0-90.0,+,+"

[7134s.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-90.0,+,+"

[7154s.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-90.0,+,+"

[7156s.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7176is.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,55.0-90.0,+,+"

[7134T.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-50.0,55.0-90.0,+,+"

[api1455.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,+"

[api1555.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-54.0,50.0-110.0,+,+"

[api55s.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

; -------------- AOC
[S566.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-100.0,+,+"

[S782.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-82.0,50.0-110.0,+,+"

[4VLR.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-100.0,+,+"

[D566.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-100.0,+,+"

[5Glr.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-120.0,+,+"

[7Dlr.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-68.0,50.0-120.0,+,+"

; -------------- APPLEM
[APPLE850.AddReg]
HKR,"MODES\1600,1200", Mode1,,"30.0-94.0,48.0-120.0,+,+"

; -------------- AST
[AST4V.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,60.0-70.0,-,-"

[AST4I.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-38.0,50.0-90.0,+,+"

[AST4N.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-90.0,+,+"

[AST4L.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-90.0,+,+"

[AST5L.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-90.0,+,+"

[AST7L.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-90.0,+,+"

[AST7H.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,50.0-90.0,+,+"

[AST20H.AddReg]
HKR,"MODES\1280,1024",Mode1,,"29.0-82.0,50.0-150.0,+,+"

[AST4Ls.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-90.0,+,+"

[AST5V.AddReg]
HKR,"MODES\1024,768",Mode2,,"30.0-50.0,50.0-120.0,+,+"

; -------------- Belinea
[105095.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,55.0-90.0,+,+"

[104065.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-120.0,+,+"

[105575.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

; -------------- BRIDGE
[BM-17C.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

; -------------- COMPAQ
[1024.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-57.0,50.0-90.0,+,+"

[PRB.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-62,48-90,+,+"

[151FS.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-57.0,50.0-90.0,+,+"

[171FS.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-57.0,50.0-90.0,+,+"

[QV200.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.5-82.0,50.0-90.0,+,+"

[PRA.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-49,48-80,+,+"

[140.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-49,48-80,+,+"

[150.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-49,48-80,+,+"

[CPQ-P70.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-92.0,48.0-150.0,+,+"

[CPQ-P110.AddReg]
HKR,"MODES\1800,1440",Mode1,,"30.0-107.0,48.0-160.0,+,+"

[CPQ-V50.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-60.0,50-125.0,+,+"

[CPQ-P50.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50-125.0,+,+"

[CPQ-TFT500.AddReg]
HKR,"MODES\1024,768",Mode1,,"32.0-60.0,57.0-85.0,+,+"

[V900.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,48.0-160.0,+,+"

[CPQ-P1610.AddReg]
HKR,"MODES\1920,1200",Mode1,,"30.0-96.0,48.0-160.0,+,+"

[TFT8000.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-80.0,58.0-85.0,+,+"

[CPQ-V40.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-48.0,50.0-100.0,-,-"

[CPQ-V45.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-48,50-100,-,-"

[S700.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[S900.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[CPQ-V70.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50-125.0,+,+"

[MV500.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-54,50-90,+,+"

[MV700.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-100,+,+"

[MV400.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-50,50-90,+,+"

[MV540.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-54,50-120,+,+"

[MV740.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-160,+,+"

[CV535.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-54,50-120,+,+"

[CV735.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-120,+,+"

[MV940.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-85,50-120,+,+"

[CV935.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-85,50-120,+,+"

[FS740.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-120,+,+"

[910T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-110,50-160,+,+"

[710T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-86,50-160,+,+"

[FP745A.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-60,56-75,+,+"

[I540.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-54,50-120,+,+"

[I740.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-120,+,+"

[FS940.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-92,50-120,+,+"

; -------------- CTX
[CTX_0150.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-130.0,+,+"

[1451.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,45.0-90.0,+,+"

[1551.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,45.0-90.0,+,+"

[1562.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-62.0,45.0-90.0,+,+"

[CTX1565.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,45.0-90.0,+,+"

[1765.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,45.0-110.0,+,+"

[1785.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,45.0-110.0,+,+"

[2085.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,45.0-110.0,+,+"

[2185.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,45.0-110.0,+,+"

[CTX3621.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

; -------------- Daewoo
[CPC-8000.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,60.0,-,-"

[CMC-2000MW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,50.0-90.0,+,-"

[CMC-2100MW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,50.0-90.0,+,-"
HKR,,DPMS,,0

[CMC-2102MW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,50.0-90.0,+,-"
HKR,,DPMS,,0

[CMC-1423B1.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-120.0,+,-"

[CMC-1427X1.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-48.0,50.0-100.0,+,-"
HKR,"MODES\640,480",Mode1,,"30.0-48.0,50.0-75.0,+,-"

[CMC-1502B1W.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-120.0,+,-"

[CMC-1505XW.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-100.0,+,-"

[CMC-1507X1.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-48.0,50.0-100.0,+,-"
HKR,"MODES\640,480",Mode1,,"30.0-48.0,50.0-75.0,+,-"

[CMC-1703BW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-120.0,+,-"

[CMC-1414BAW.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-90.0,+,-"
HKR,,DPMS,,0

[CMC-1420AVGW.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-48.0,50.0-90.0,+,-"

[CMC-1424XW.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-100.0,+,-"

[CMC-1424SW.AddReg]
HKR,"MODES\800,600",Mode1,,"30.0-38.0,50.0-100.0,+,-"

[DWE-431X.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[CMC-1509BW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,-"

[DWE-518X.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,-"

[CMC-1511BW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,-"

[DWE-512B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,-"

[DWE-518B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,-"

[519B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[CMC-1701MW.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-78.0,50.0-90.0,+,-"
HKR,,DPMS,,0

[CMC-1701M2W.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,50.0-90.0,+,-"

[CMC-1704C.AddReg]
HKR,"MODES\1600,1200",Mode1,,"24.0-86.0,50.0-150.0,+,-"

[710BDae.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[710C.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,+"

[901D.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

; -------------- DEC
[DEC_1082.AddReg]
HKR,"MODES\1920,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[DEC_1145.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,48.0-160.0,+,+"

[DEC_1146.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,48.0-160.0,+,+"

[FR-PCXAV-VY.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-130.0,+,+"

[FR-PCXAV-VZ.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-130.0,+,+"

[FR-PCXAV-WY.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-152.0,+,+"

[FR-PCXAV-WZ.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-152.0,+,+"

[FR-PCXAV-YY.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,48.0-150.0,+,+"

[FR-PCXAV-YZ.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,48.0-150.0,+,+"

[FR-PCXCV-C*.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-90.0,+,+"

[FR-PCXCV-D*.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-90.0,+,+"

[FR-PCXAV-TZ.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[FR-PCXBV-E*.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-110.0,+,+"

[FR-PCXBV-F*.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

; -------------- DELL
[Dell_14XE-U.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-62.0,50.0-120.0,+,+"

[Dell_14XE-E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-62.0,50.0-120.0,+,+"

[Dell_14XE-J.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-62.0,50.0-120.0,+,+"

[Dell_14XE-S.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-62.0,50.0-120.0,+,+"

[D1569.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-110.0,+,+"

[Dell_V17X-U.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-130.0,+,+"

[Dell_V17X-E.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-130.0,+,+"

[Dell_V17X-J.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-130.0,+,+"

[Dell_V17X-S.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-130.0,+,+"

[Dell_21TE-U.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-93.0,50.0-152.0,+,+"

[Dell_21TE-E.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-93.0,50.0-152.0,+,+"

[Dell_21TE-J.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-93.0,50.0-152.0,+,+"

[Dell_21TE-S.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-93.0,50.0-152.0,+,+"

[P791.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[1701FP(digital).AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-80.0,56.0-76.0,+,+"

[1701FP(analog).AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-80.0,56.0-76.0,+,+"

[1503FP(digital).AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,60.0-75.0,+,+"

[1503FP(analog).AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,60.0-75.0,+,+"

[E770s.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[Dell_VS17X-U.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[Dell_VS17X-E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[Dell_VS17X-J.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[Dell_VS17X-S.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[1700FP.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-80.0,56.0-76.0,+,+"

[M570.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[M780.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-160.0,+,+"

[D1428L.AddReg]
HKR,"MODES\800,600",Mode1,,"31.0-48.0,43.0-75.0,+,+"

[M781s.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-160.0,+,+"

[D828L.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-54.0,50.0-120.0,+,+"

[828fi.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[V15X.AddReg]
HKR,"MODES\800,600",Mode1,,"37.0-55.0,55.0-90.0,+,+"
HKR,"MODES\1024,768",Mode1,,"47.0-64.0,55.0-90.0,+,+"
HKR,"MODES\1280,1024",Mode1,,"57.0-64.0,55.0-90.0,+,+"

[D825HT.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[D1025HTX.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[P1110.AddReg]
HKR,"MODES\1800,1440",Mode1,,"30.0-121.0,48.0-160.0,+,-"

[P990.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,48.0-120.0,+,+"

[P780.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,48.0-120.0,+,+"

[D825TM.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-150.0,+,+"

[D1025TM.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-85.0,50.0-160.0,+,+"

[D1626HT.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-107.0,50.0-160.0,+,+"

[P991.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,48.0-120.0,+,+"

[D2026T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-96.0,50.0-100.0,+,+"

[D1025HT.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-85.0,50.0-100.0,+,+"

[P1690.AddReg]
HKR,"MODES\1920,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[800M.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[D2128TCO.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-102.0,50.0-150.0,+,+"

[D1025HE.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-92.0,50.0-120.0,+,+"

[P790.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-92.0,50.0-150.0,+,+"

[D825HR.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[ES-17.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-85.0,50.0-100.0,+,+"

[M991.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[E771p.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[D1226H.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[M990.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[1501FP(Digital).AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,56.0-75.0,+,+"

[1500FP.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,+"

[M770.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,48.0-120.0,+,+"

[D1028L.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[E770p.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[1501FP(Analog).AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,56.0-75.0,+,+"

[M781p.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-160.0,+,+"

[1400FP.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-86.0,+,+"

[M1110.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-160.0,+,+"

[E551a.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[E771a.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[E550.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[E550mm/E550mmw.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[1401FP.AddReg]
HKR,"MODES\1024,768",Mode1,,"60.0-60.0,31.0-48.0,+,+"

[E551c.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"


;-------------------------------------------------
; User visible strings
[Strings]
MonitorClassName="Monitors"
MS="Microsoft"

Generic="(Standard monitor types)"
Unknown.DeviceDesc="Default Monitor"

*PNP09FF.DeviceDesc = "Plug and Play Monitor"

Laptop640.DeviceDesc = "Digital Flat Panel (640x480)"
Laptop800.DeviceDesc = "Digital Flat Panel (800x600)"
Laptop1024.DeviceDesc ="Digital Flat Panel (1024x768)"
Laptop1152.DeviceDesc ="Digital Flat Panel (1152x864)"
Laptop1280.DeviceDesc ="Digital Flat Panel (1280x1024)"
Laptop1600.DeviceDesc ="Digital Flat Panel (1600x1200)"

TVGen.DeviceDesc ="Generic Television"

640.DeviceDesc  = "Standard VGA 640x480"
800.DeviceDesc  = "Super VGA 800x600"
1024.DeviceDesc = "Super VGA 1024x768"
1280.DeviceDesc = "Super VGA 1280x1024"
1600.DeviceDesc = "Super VGA 1600x1200"

Acer="Acer"
AOC="AOC International (U.S.A.), Ltd."
APPLEM="Apple Computer, Inc."
AST="AST"
BELINEA="Maxdata Computer GmbH"
BRIDGE="Bridge Information Co.,Ltd"
Compaq="COMPAQ"
CTX="CTX - Chuntex Electronic"
Daewoo="Daewoo"
DEC="Digital Equipment Corp."
Dell="Dell Computer Corp."

7155="AcerView 55"
Acer77S="Aspire 77s"
7111D="AcerView 11D"
7133D="AcerView 33D"
7134e="AcerView 7134e"
7154e="AcerView 7154e"
7156e="AcerView 7156e"
7176ie="AcerView 7176ie"
7178ie="AcerView 7178ie"
7156i="AcerView 7156i"
7176i="AcerView 76i"
7178i="AcerView 78i"
7198i="AcerView 98i"
7133DL="AcerView 33DL"
7134TL="AcerView 34TL"
7155L="AcerView 55L"
7156L="AcerView 56L"
7176N="AcerView 76N"
7133s="AcerView 7133s"
7134s="AcerView 7134s"
7154s="AcerView 7154s"
7156s="AcerView 7156s"
7176is="AcerView 7176is"
7134T="AcerView 34T"
Api1455="Acer 1455"
Api1555="Acer 1555"
Api55s="Aspire 55s"

S566="AOC SPECTRUM 5Nlr"
S782="AOC SPECTRUM 7Nlr"
4VLR="AOC SPECTRUM 4V,4VA,4Vlr & 4VlrA, 4Vn, 4VnA"
D566="AOC SPECTRUM 5Vlr & 5VlrA"
5Glr="AOC SPECTRUM 5Glr"
7Dlr="AOC SPECTRUM 7DlrA"

APPLE850="AppleVision 850/850AV"

AST4V="ASTVision 4V"
AST4I="ASTVision 4I"
AST4N="ASTVision 4N"
AST4L="ASTVision 4L"
AST5L="ASTVision 5L"
AST7L="ASTVision 7L"
AST7H="ASTVision 7H"
AST20H="ASTVision 20H"
AST4Ls="AST Sabre"
AST5V="ASTVision 5V"

105095="Belinea 10 50 95"
104065="Belinea 10 40 65"
105575="Belinea 10 55 75"

BM-17C="Bridge BM17C"

QV172="COMPAQ QVision 172"
QV200="COMPAQ QVision 200"
QV210="COMPAQ QVision 210"
1024="COMPAQ 1024"
151FS="COMPAQ 151FS"
171FS="COMPAQ 171FS"
PR140="COMPAQ Presario 140"
PR150="COMPAQ Presario 150"
140="COMPAQ 140"
150="COMPAQ 150"
CPQ-P70="COMPAQ P70 Color Monitor"
CPQ-P110="COMPAQ P110 Color Monitor"
CPQ-V50="COMPAQ V50 Color Monitor"
CPQ-P50="COMPAQ P50 Color Monitor"
CPQ-TFT500="COMPAQ TFT500 Flat Panel Monitor"
V900="COMPAQ V900 Color Monitor"
CPQ-P1610="COMPAQ P1610 Color Monitor"
TFT8000="COMPAQ TFT8000 Flat Panel Monitor"
CPQ-V40="COMPAQ V40 Color Monitor"
CPQ-V45="COMPAQ V45 Color Monitor"
S700="COMPAQ S700 Color Monitor"
S900="COMPAQ S900 Color Monitor"
CPQ-V70="COMPAQ V70 Color Monitor"
MV500="COMPAQ Presario MV500 Color Monitor"
MV700="COMPAQ Presario MV700 Color Monitor"
MV400="COMPAQ Presario MV400 Color Monitor"
MV540="COMPAQ MV540 Color Monitor"
MV740="COMPAQ MV740 Color Monitor"
CV535="COMPAQ CV535 Color Monitor"
CV735="COMPAQ CV735 Color Monitor"
CV935="COMPAQ CV935 Color Monitor"
FS740="COMPAQ FS740 Color Monitor"
910T="COMPAQ 910T Color Monitor"
710T="COMPAQ 710T Color Monitor"
FP745A="COMPAQ FP745A Analog Flat Panel Monitor"
MV940="COMPAQ MV940 Color Monitor"
I540="COMPAQ I540 Color Monitor"
I740="COMPAQ I740 Color Monitor"
FS940="COMPAQ FS940 Color Monitor"

CTX_0150="CTX 1569"
1451="CTX 1451"
1551="CTX 1551"
1562="CTX 1562"
CTX1565="CTX 1565"
1765="CTX 1765"
1785="CTX 1785"
2085="CTX 2085"
2185="CTX 2185"
CTX3621="CTX VL700"

CPC-8000="Daewoo CPC-8000"
CMC-2000MW="Daewoo CMC-2000MW"
CMC-2100MW="Daewoo CMC-2100MW"
CMC-2102MW="Daewoo CMC-2102MW"
CMC-1423B1="Daewoo CMC-1423B1"
CMC-1427X1="Daewoo CMC-1427X1"
CMC-1502B1W="Daewoo CMC-1502B1W"
CMC-1505XW="Daewoo CMC-1505XW"
CMC-1507X1="Daewoo CMC-1507X1"
CMC-1703BW="Daewoo CMC-1703BW"
CMC-1414BAW="Daewoo CMC-1414BAW"
CMC-1420AVGW="Daewoo CMC-1420AVGW"
CMC-1424SW="Daewoo CMC-1424SW"
CMC-1424XW="Daewoo CMC-1424XW"
CMC-1427XW="Daewoo CMC-1427XW"
CMC-1428SW="Daewoo CMC-1428SW"
CMC-1428XW="Daewoo CMC-1428XW"
DWE-431X="Daewoo 431X"
CMC-1509BW="Daewoo CMC-1509BW"
DWE-511X="Daewoo 511X"
CMC-1511BW="Daewoo CMC-1511BW"
DWE-512B="Daewoo 512B"
DWE-518X="Daewoo 518X"
DWE-518B="Daewoo 518B"
519B="Daewoo 519B"
CMC-1701MW="Daewoo CMC-1701MW"
CMC-1701M2W="Daewoo CMC-1701M2W"
CMC-1704C="Daewoo CMC-1704C"
CMC-1705BW="Daewoo CMC-1705BW"
CMC-1707BW="Daewoo CMC-1707BW"
710BDae="Daewoo 710B"
710C="Daewoo 710C"
901D="Daewoo 901D"

DEC_1082="Digital 24 in. Color (FR-PCXAV-AZ)"
DEC_1145="Digital 19 in. Color (FR-PCXAV-CY)"
DEC_1146="Digital 19 in. Color (FR-PCXAV-CZ)"
FR-PCXAV-VY="FR-PCXAV-VY"
FR-PCXAV-VZ="FR-PCXAV-VZ"
FR-PCXAV-WY="FR-PCXAV-WY"
FR-PCXAV-WZ="Digital 21 in. Color (FR-PCXAV-WZ)"
FR-PCXAV-YY="FR-PCXAV-YY"
FR-PCXAV-YZ="Digital 17 in. Color (FR-PCXAV-YZ)"
FR-PCXCV-C*="Digital 14 in. Color Monitor (FR-PCXCV-C*)"
FR-PCXCV-D*="Digital 15 in. Color Monitor (FR-PCXCV-D*)"
FR-PCXAV-TZ="Digital 19 in. Color (FR-PCXAV-TZ)"
FR-PCXBV-E*="Digital 15 in. Color Monitor (FR-PCXBV-E*)"
FR-PCXBV-F*="Digital 17 in. Color Monitor (FR-PCXBV-F*)"

Dell_14XE-U="Dell Ultrascan 14XE"
Dell_14XE-E="Dell Ultrascan 14XE"
Dell_14XE-J="Dell Ultrascan 14XE"
Dell_14XE-S="Dell Ultrascan 14XE"
D1569="Dell 1569"
Dell_V17X-U="Dell Ultrascan V17X"
Dell_V17X-E="Dell Ultrascan V17X"
Dell_V17X-J="Dell Ultrascan V17X"
Dell_V17X-S="Dell Ultrascan V17X"
Dell_21TE-U="Dell Ultrascan 21TE"
Dell_21TE-E="Dell Ultrascan 21TE"
Dell_21TE-J="Dell Ultrascan 21TE"
Dell_21TE-S="Dell Ultrascan 21TE"
P791="Dell P791"
1701FP(digital)="Dell 1701FP (digital)"
1701FP(analog)="Dell 1701FP (analog)"
1503FP(digital)="Dell 1503FP (digital)"
1503FP(analog)="Dell 1503FP (analog)"
E770s="Dell E770s"
Dell_VS17X-U="Dell VS17X"
Dell_VS17X-E="Dell VS17X"
Dell_VS17X-J="Dell VS17X"
Dell_VS17X-S="Dell VS17X"
1700FP="Dell 1700FP"
M570="Dell M570"
M780="Dell M780"
D1428L="Dell D1428L"
M781s="Dell M781s"
D828L="Dell D828L"
828fi="Dell 828fi"
V15X="Dell V15X"
D825HT="Dell D825HT"
D1025HTX="Dell D1025HTX"
P1110="Dell P1110"
P990="Dell P990"
P780="Dell P780"
D825TM="Dell D825TM"
D1025TM="Dell D1025TM"
D1626HT="Dell D1626HT"
P991="Dell P991"
D2026T="Dell D2026T"
D1025HT="Dell 1726T-HS/D1025HT"
P1690="Dell P1690"
800M="Dell 800M"
D2128TCO="Dell D2128-TCO"
D1025HE="Dell D1025HE"
P790="Dell P790"
D825HR="Dell D825HR"
ES-17="Dell ES-17"
M991="Dell M991"
E771p="Dell E771p"
D1226H="Dell D1226H"
M990="Dell M990"
1501FP(Digital)="Dell 1501FP(Digital)"
1500FP="Dell 1500FP"
M770="Dell M770"
D1028L="Dell D1028L"
E770p="Dell E770p"
1501FP(Analog)="Dell 1501FP(Analog)"
M781p="Dell M781p/M781mm"
1400FP="Dell TFT 1400FP"
M1110="Dell M1110"
E551a="Dell E551a"
E771a="Dell E771a"
E550="Dell E550"
E550mm/E550mmw="Dell E550mm/E550mmw"
1401FP="Dell 1401FP"
E551c="Dell E551c"

