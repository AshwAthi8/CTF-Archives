; MONITOR3.INF
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
%FUNAI%=FUNAI,NTamd64
%Gateway%=Gateway,NTamd64
%GWY%=GWY,NTamd64
%Hansol%=Hansol,NTamd64
%HITACHI%=HITACHI,NTamd64
%HP%=HP,NTamd64
%HWP%=HWP,NTamd64
%Hyundai%=Hyundai,NTamd64


;-------------------------------------------------
; Manufacturer Sections

[FUNAI.NTamd64]
%FCM_17GD%=FCM_17GD, Monitor\FCM3313

[Gateway.NTamd64]
%VX900T%=VX900T.Install, Monitor\GWY00C0
%VX720A%=VX720A.Install, Monitor\GWY02DA
%EVF720%=EVF720.Install, Monitor\GWY031B
%EVF720%=EVF720.Install, Monitor\GWY031C
%VX920%=VX920.Install, Monitor\GWY0398
%VX920A%=VX920A.Install, Monitor\GWY03A2
%VX-700%=VX-700.Install, Monitor\GWY044D
%VX-1100%=VX-1100.Install, Monitor\GWY0454
%VX1120%=VX1120.Install, Monitor\GWY0460
%VX1120A%=VX1120A.Install, Monitor\GWY046A
%FPD1570%=FPD1570.Install, Monitor\GWY0622
%FPD1800%=FPD1800.Install, Monitor\GWY0708
%DL27%=DL27.Install, Monitor\GWY0A8D
%DL36%=DL36.Install, Monitor\GWY0E11
%EV500%=EV500.install, Monitor\GWY138A
%LE500GWY138F%=LE500GWY138F.Install, Monitor\GWY138F
%EV500B%=EV500B.Install, Monitor\GWY1390
%EV575%=EV575.Install, Monitor\GWY15C7
%EV700_1%=EV700_1.Install, Monitor\GWY1B5C
%EV700%=EV700.Install, Monitor\GWY1B62
%EV700B%=EV700B.Install, Monitor\GWY1B64
%EV910C%=EV910C.Install, Monitor\GWY232C
%GWY-EV700%=GWY-EV700.Install, Monitor\GWY7658
%EV700-H%=EV700-H.Install, Monitor\GWY7659
%GWY-EV900%=GWY-EV900.Install, Monitor\GWY8883
%VX900%=VX900.Install, Monitor\GWY9095

[GWY.NTamd64]
%LE500%=LE500.Install, Monitor\GWY1392

[Hansol.NTamd64]
%400F%=400F.Install, Monitor\HSL012C
%500F%=500F.Install, Monitor\HSL01F4
%Hansol400F%=Hansol400F.Install, Monitor\HSL0515
%Mazellan14px%=Mazellan14px.Install, Monitor\HSL0579
%Mazellan14ax%=Mazellan14ax.Install, Monitor\HSL057A
%Mazellan401A%=Mazellan401A.Install, Monitor\HSL057B
%Mazellan_400P%=Mazellan_400P.Install, Monitor\HSL057C
%Mazellan15ax%=Mazellan15ax.Install, Monitor\HSL05DD
%Mazellan500P%=Mazellan500P.Install, Monitor\HSL05DE
%Mazellan501P%=Mazellan501P.Install, Monitor\HSL05DF
%Mazellan_500A%=Mazellan_500A.Install, Monitor\HSL05E0
%Mazellan17px%=Mazellan17px.Install, Monitor\HSL06A5
%Mazellan17ax%=Mazellan17ax.Install, Monitor\HSL06A6
%Mazellan701A%=Mazellan701A.Install, Monitor\HSL06A7
%Mazellan701P%=Mazellan701P.Install, Monitor\HSL06A8
%710A%=710A.Install, Monitor\HSL06AA
%710P%=710P.Install, Monitor\HSL06AB
%705D%=705D.Install, Monitor\HSL06AC
%720A%=720A.Install, Monitor\HSL06AE
%720P%=720P.Install, Monitor\HSL06AF
%Mazellan900P%=Mazellan900P.Install, Monitor\HSL076D
%910A%=910A.Install, Monitor\HSL076E
%920eF%=920eF.Install, Monitor\HSL076F
%920D%=920D.Install, Monitor\HSL0770
%2100P%=2100P.Install, Monitor\HSL0835
%2100A%=2100A.Install, Monitor\HSL0836
%510A%=510A.Install, Monitor\HSL510A
%510F%=510F.Install, Monitor\HSL510F
%Mazellan17px%=Mazellan17px, Monitor\HSLA605

[HITACHI.NTamd64]
%GX17L%=GX17L, Monitor\HIT1717
%HM1764%=HM1764, Monitor\HIT1727
%HM1782%=HM1782, Monitor\HIT1827
%HM4721%=HM4721, Monitor\HIT2147
%HM4921%=HM4921, Monitor\HIT2149
%HM4020%=HM4020, Monitor\HIT4020
%HM4021%=HM4021, Monitor\HIT4021
%UX4721%=UX4721, Monitor\HIT4711
%GX20%=GX20, Monitor\HIT4810
%GX21%=GX21, Monitor\HIT4811
%HM4820%=HM4820, Monitor\HIT4820
%HM4821%=HM4821, Monitor\HIT4821
%GX20H%=GX20H, Monitor\HIT4830
%UX4921%=UX4921, Monitor\HIT4911
%HM6421%=HM6421, Monitor\HIT6421
%UX6821%=UX6821, Monitor\HIT6811
%HM6821%=HM6821, Monitor\HIT6821
%CH1786M%=CH1786M.Ins, Monitor\HTC0505
%CH1711M%=CH1711M.Ins, Monitor\HTC7E5D
%CH2111M%=CH2111M.Ins, Monitor\HTC7E61
%CH2112M%=CH2112M.Ins, Monitor\HTC7E62
%CM-1711M%=CM-1711M, Monitor\HTCAB6F
%CM-2112M%=CM-2112M, Monitor\HTCABC2
%CM-2111M%=CM-2111M, Monitor\HTCABC7
%CM-2110M%=CM-2110M, Monitor\HTCABCC
%CM802%=CM802, Monitor\HTCABE0
%CM801%=CM801, Monitor\HTCABE2
%CM800%=CM800, Monitor\HTCABE3
%CM803%=CM803, Monitor\HTCABEA
%CM701%=CM701, Monitor\HTCABF4
%CM751%=CM751, Monitor\HTCAC13
%CM752%=CM752.Install, Monitor\HTCAC15
%CM753%=CM753.Install, Monitor\HTCAC22
%CM811%=CM811.Install, Monitor\HTCAC46
%CM812%=CM812.Install, Monitor\HTCAC47
%CM813%=CM813.Install, Monitor\HTCAC48
%CM814%=CM814.Install, Monitor\HTCAC49
%CM500%=CM500, Monitor\HTCAFC8
%CM500E%=CM500E.Install, Monitor\HTCAFCE
%CM600%=CM600, Monitor\HTCAFD2
%CM611%=CM611, Monitor\HTCAFD7
%CM620%=CM620, Monitor\HTCAFDD
%CM630%=CM630, Monitor\HTCAFE2
%HTC-CM641%=HTC-CM641.Install, Monitor\HTCAFEC
%CM640ET%=CM640ET.Install, Monitor\HTCAFFA
%PC-DC1551SP%=PC-DC1551SP.Ins, Monitor\HTCB800
%PC-DC1570%=PC-DC1570.Ins, Monitor\HTCB801
%PC-DC1570SP%=PC-DC1570SP.Ins, Monitor\HTCB802
%PC-DC3610%=PC-DC3610.Ins, Monitor\HTCB803
%PC-DC1552%=PC-DC1552, Monitor\HTCB804
%PC-DC1571%=PC-DC1571, Monitor\HTCB805
%PC-DC3620%=PC-DC3620, Monitor\HTCB806
%PC-DC1590%=PC-DC1590, Monitor\HTCB808
%PC-DT3131%=PC-DT3131, Monitor\HTCB812

[HP.NTamd64]
%P1282A%=P1282A.Install, Monitor\HWP0502
%P1283A%=P1283A, Monitor\HWP0503
%P1284A%=P1284A, Monitor\HWP0504
%P1350B%=P1350B, Monitor\HWP0546
%P1499A%=P1499A, Monitor\HWP05DB
%D2800A%=D2800A, Monitor\HWP0AF0
%D2806A%=D2806A, Monitor\HWP0AF6
%D2815A%=D2815A, Monitor\HWP0AFF
%D2826%=D2826.Install, Monitor\HWP0B0A
%D2828%=D2828, Monitor\HWP0B0C
%HPD2832A%=HPD2832A.install, Monitor\HWP0B10
%HWP-D2835%=HWP-D2835.Install, Monitor\HWP0B13
%D2838%=D2838.Install, Monitor\HWP0B16
%HWP-D2840%=HWP-D2840.Install, Monitor\HWP0B18
%D2842A%=D2842A.Install, Monitor\HWP0B1A
%HWP-D2845%=HWP-D2845.Install, Monitor\HWP0B1D
%D2847%=D2847, Monitor\HWP0B1F
%D3857A%=D3857A, Monitor\HWP0F11
%D3858A%=D3858A, Monitor\HWP0F12
%fx50%=fx50.Install, Monitor\HWP0F3D
%hp_p3902a%=hp_p3902a.Install, Monitor\HWP0F3E
%D5061%=D5061, Monitor\HWP13C5
%L1510%=L1510.Install, Monitor\HWP13C6
%D5065%=D5065, Monitor\HWP13C9
%L1810%=L1810.Install, Monitor\HWP13CD
%GEN15%=GEN15.Install, Monitor\HWP148A
%GEN17%=GEN17.Install, Monitor\HWP148B
%p720%=p720.Install, Monitor\HWP22BC
%D8894%=D8894, Monitor\HWP22BE
%D8895%=D8895, Monitor\HWP22BF
%D8896%=D8896, Monitor\HWP22C0
%D8897%=D8897, Monitor\HWP22C1
%D8898%=D8898, Monitor\HWP22C2
%D8900%=D8900, Monitor\HWP22C4
%D8901%=D8901, Monitor\HWP22C5
%D8902%=D8902, Monitor\HWP22C6
%D8903%=D8903, Monitor\HWP22C7
%HPD8904%=HPD8904.Install, Monitor\HWP22C8
%D8906A%=D8906A.Install, Monitor\HWP22CA
%D8910%=D8910, Monitor\HWP22CE
%D8911%=D8911, Monitor\HWP22CF
%D8915%=D8915, Monitor\HWP22D3
%hp54%=hp54.Install, Monitor\HWPC322

[HWP.NTamd64]
%HP8904%=HP8904.Install, Monitor\HWP22C8
%HP8905%=HP8905.Install, Monitor\HWP22C9

[Hyundai.NTamd64]
%HL-2882%=HL-2882, Monitor\HEI0B42
%HL-4838E%=HL-4838E.Install, Monitor\HEI12E6
%HL-4848F%=HL-4848F, Monitor\HEI12F0
%HL-4850B%=HL-4850B.Install, Monitor\HEI12F2
%HL-4854B%=HL-4854B.Install, Monitor\HEI12F6
%HL-4860E%=HL-4860E.Install, Monitor\HEI12FC
%HL-5848F%=HL-5848F, Monitor\HEI16D8
%HL-5864%=HL-5864, Monitor\HEI16E8
%HL-5870A%=HL-5870A, Monitor\HEI16EE
%HN-7448M%=HN-7448M.Install, Monitor\HEI1D18
%HL-7682A%=HL-7682A, Monitor\HEI1E02
%HL-7864F%=HL-7864F, Monitor\HEI1EB8
%HL-7870A%=HL-7870A, Monitor\HEI1EBE
%HL-7948M%=HL-7948M.Install, Monitor\HEI1F0C
%HL-2885B%=HL-2885B.Install, Monitor\HEI288B
%HT-2896B%=HT-2896B.Install, Monitor\HEI289B
%HL-4848%=HL-4848.Install, Monitor\HEI4848
%HL-5848%=HL-5848.Install, Monitor\HEI5848
%HL-5854B%=HL-5854B.Install, Monitor\HEI585B
%HL-5864E%=HL-5864E, Monitor\HEI5864
%HL-5870B%=HL-5870B.Install, Monitor\HEI58B0
%HL-5870BM%=HL-5870BM.Install, Monitor\HEI58B1
%HT-7682B%=HT-7682B.Install, Monitor\HEI768B
%HT-7695B%=HT-7695B.Install, Monitor\HEI769B
%HL-7770A%=HL-7770A.Install, Monitor\HEI777A
%HL-7770RD%=HL-7770RD.Install, Monitor\HEI777D
%HL-7870B%=HL-7870B.Install, Monitor\HEI787B
%HL-7870AM%=HL-7870AM.Install, Monitor\HEI78A0
%HL-7870S%=HL-7870S.Install, Monitor\HEI78B0
%HL-7864%=HL-7864, Monitor\HEIB81E


;-------------------------------------------------
; Install sections

; -------------- FUNAI
[FCM_17GD]
DelReg=DCR
AddReg=FCM_17GD.AddReg, 1280, DPMS

; -------------- Gateway
[VX900T.Install]
DelReg=DCR
AddReg=VX900T.AddReg, 1600, DPMS

[VX720A.Install]
DelReg=DCR
AddReg=VX720A.AddReg, 1600, DPMS

[EVF720.Install]
DelReg=DCR
AddReg=EVF720.AddReg, 1600, DPMS

[VX920.Install]
DelReg=DCR
AddReg=VX920.AddReg, 1600, DPMS

[VX920A.Install]
DelReg=DCR
AddReg=VX920A.AddReg, 1920B, DPMS

[VX-700.Install]
DelReg=DCR
AddReg=VX-700.AddReg, 1600, DPMS

[VX-1100.Install]
DelReg=DCR
AddReg=VX-1100.AddReg, 1600, DPMS

[VX1120.Install]
DelReg=DCR
AddReg=VX1120.AddReg, 2048, DPMS

[VX1120A.Install]
DelReg=DCR
AddReg=VX1120A.AddReg, 2048, DPMS

[FPD1570.Install]
DelReg=DCR
AddReg=FPD1570.AddReg, 1280, DPMS

[FPD1800.Install]
DelReg=DCR
AddReg=FPD1800.AddReg, 1280, DPMS

[DL27.Install]
DelReg=DCR
AddReg=DL27.AddReg, 800, DPMS

[DL36.Install]
DelReg=DCR
AddReg=DL36.AddReg, 800, DPMS

[EV500.install]
DelReg=DCR
AddReg=EV500.AddReg, 1280, DPMS

[LE500GWY138F.Install]
DelReg=DCR
AddReg=LE500GWY138F.AddReg, 1280, DPMS

[EV500B.Install]
DelReg=DCR
AddReg=EV500B.AddReg, 1280, DPMS

[EV575.Install]
DelReg=DCR
AddReg=EV575.AddReg, 1280, DPMS

[EV700_1.Install]
DelReg=DCR
AddReg=EV700_1.AddReg, 1280, DPMS

[EV700.Install]
DelReg=DCR
AddReg=EV700.AddReg, 1280, DPMS

[EV700B.Install]
DelReg=DCR
AddReg=EV700B.AddReg, 1280, DPMS

[EV910C.Install]
DelReg=DCR
AddReg=EV910C.AddReg, 1600, DPMS

[GWY-EV700.Install]
DelReg=DCR
AddReg=GWY-EV700.AddReg, 1280, DPMS

[EV700-H.Install]
DelReg=DCR
AddReg=EV700-H.AddReg, 1280, DPMS

[GWY-EV900.Install]
DelReg=DCR
AddReg=GWY-EV900.AddReg, 1600, DPMS

[VX900.Install]
DelReg=DCR
AddReg=VX900.AddReg, 1600, DPMS

; -------------- GWY
[LE500.Install]
DelReg=DCR
AddReg=LE500.AddReg, 1024, DPMS

; -------------- Hansol
[400F.Install]
DelReg=DCR
AddReg=400F.AddReg, 1024, DPMS

[500F.Install]
DelReg=DCR
AddReg=500F.AddReg, 1024, DPMS

[Hansol400F.Install]
DelReg=DCR
AddReg=Hansol400F.AddReg, 1024, DPMS

[Mazellan14px.Install]
DelReg=DCR
AddReg=Mazellan14px.Add, 1024, DPMS

[Mazellan14ax.Install]
DelReg=DCR
AddReg=Mazellan14ax.Add, 1024, DPMS

[Mazellan401A.Install]
DelReg=DCR
AddReg=Mazellan401A.Add, 1024, DPMS

[Mazellan_400P.Install]
DelReg=DCR
AddReg=Mazellan_400P.Add, 1024, DPMS

[Mazellan15ax.Install]
DelReg=DCR
AddReg=Mazellan15ax.Add, 1024, DPMS

[Mazellan500P.Install]
DelReg=DCR
AddReg=Mazellan500P.Add, 1280, DPMS

[Mazellan501P.Install]
DelReg=DCR
AddReg=Mazellan501P.Add, 1280, DPMS

[Mazellan_500A.Install]
DelReg=DCR
AddReg=Mazellan_500A.Add, 1024, DPMS

[Mazellan17px.Install]
DelReg=DCR
AddReg=Mazellan17px.Add, 1600, DPMS

[Mazellan17ax.Install]
DelReg=DCR
AddReg=Mazellan17ax.Add, 1280, DPMS

[Mazellan701A.Install]
DelReg=DCR
AddReg=Mazellan701A.Add, 1280, DPMS

[Mazellan701P.Install]
DelReg=DCR
AddReg=Mazellan701P.Add, 1600, DPMS

[710A.Install]
DelReg=DCR
AddReg=710A.Add, 1280, DPMS

[710P.Install]
DelReg=DCR
AddReg=710P.Add, 1600, DPMS

[705D.Install]
DelReg=DCR
AddReg=705D.Add, 1280, DPMS

[720A.Install]
DelReg=DCR
AddReg=720A.Add, 1280, DPMS

[720P.Install]
DelReg=DCR
AddReg=720P.Add, 1600, DPMS

[Mazellan900P.Install]
DelReg=DCR
AddReg=Mazellan900P.Add, 1600, DPMS

[910A.Install]
DelReg=DCR
AddReg=910A.Add, 1280, DPMS

[920eF.Install]
DelReg=DCR
AddReg=920eF.Add, 1600, DPMS

[920D.Install]
DelReg=DCR
AddReg=920D.Add, 1600, DPMS

[2100P.Install]
DelReg=DCR
AddReg=2100P.Add, 1600, DPMS

[2100A.Install]
DelReg=DCR
AddReg=2100A.AddReg, 1600, DPMS

[510A.Install]
DelReg=DCR
AddReg=510A.AddReg, 1024, DPMS

[510F.Install]
DelReg=DCR
AddReg=510F.AddReg, 1024, DPMS

[Mazellan17px]
DelReg=DCR
AddReg=Mazellan17px.AddReg, 1600, DPMS

; -------------- HITACHI
[GX17L]
DelReg=DCR
AddReg=GX17L.AddReg, 1280, DPMS

[HM1764]
DelReg=DCR
AddReg=HM1764.AddReg, 1280, DPMS

[HM1782]
DelReg=DCR
AddReg=HM1782.AddReg, 1280, DPMS

[HM4721]
DelReg=DCR
AddReg=HM4721.AddReg, 1600B, DPMS

[HM4921]
DelReg=DCR
AddReg=HM4921.AddReg, 1600B, DPMS

[HM4020]
DelReg=DCR
AddReg=HM4020.AddReg, 1600B, DPMS

[HM4021]
DelReg=DCR
AddReg=HM4021.AddReg, 1600B, DPMS

[UX4721]
DelReg=DCR
AddReg=UX4721.AddReg, 1600B, DPMS

[GX20]
DelReg=DCR
AddReg=GX20.AddReg, 1600B, DPMS

[GX21]
DelReg=DCR
AddReg=GX21.AddReg, 1600B, DPMS

[HM4820]
DelReg=DCR
AddReg=HM4820.AddReg, 1600B, DPMS

[HM4821]
DelReg=DCR
AddReg=HM4821.AddReg, 1600B, DPMS

[GX20H]
DelReg=DCR
AddReg=GX20H.AddReg, 1600B, DPMS

[UX4921]
DelReg=DCR
AddReg=UX4921.AddReg, 1600B, DPMS

[HM6421]
DelReg=DCR
AddReg=HM6421.AddReg, 1600B

[UX6821]
DelReg=DCR
AddReg=UX6821.AddReg, 1600B, DPMS

[HM6821]
DelReg=DCR
AddReg=HM6821.AddReg, 1600B, DPMS

[CH1786M.Ins]
DelReg=DCR
AddReg=CH1786M.reg, 1280, DPMS

[CH1711M.Ins]
DelReg=DCR
AddReg=CH1711M.reg, 1280, DPMS

[CH2111M.Ins]
DelReg=DCR
AddReg=CH2111M.reg, DPMS, 1600B

[CH2112M.Ins]
DelReg=DCR
AddReg=CH2112M.reg, DPMS, 1600B

[CM-1711M]
DelReg=DCR
AddReg=CM-1711M.AddReg, 1280, DPMS

[CM-2112M]
DelReg=DCR
AddReg=CM-2112M.AddReg, 1600, DPMS

[CM-2111M]
DelReg=DCR
AddReg=CM-2111M.AddReg, 1600, DPMS

[CM-2110M]
DelReg=DCR
AddReg=CM-2110M.AddReg, 1280, DPMS

[CM802]
DelReg=DCR
AddReg=CM802.AddReg, 1600, DPMS

[CM801]
DelReg=DCR
AddReg=CM801.AddReg, 1600, DPMS

[CM800]
DelReg=DCR
AddReg=CM800.AddReg, 1600, DPMS

[CM803]
DelReg=DCR
AddReg=CM803.AddReg, 1600, DPMS

[CM701]
DelReg=DCR
AddReg=CM701.AddReg, 1280, DPMS

[CM751]
DelReg=DCR
AddReg=CM751.AddReg, 1600, DPMS

[CM752.Install]
DelReg=DCR
AddReg=CM752.AddReg, 1600B, DPMS

[CM753.Install]
DelReg=DCR
AddReg=CM753.AddReg, 1600B, DPMS

[CM811.Install]
DelReg=DCR
AddReg=CM811.AddReg, 1600B, DPMS

[CM812.Install]
DelReg=DCR
AddReg=CM812.AddReg, 1600B, DPMS

[CM813.Install]
DelReg=DCR
AddReg=CM813.AddReg, 1856, DPMS

[CM814.Install]
DelReg=DCR
AddReg=CM814.AddReg, 1856, DPMS

[CM500]
DelReg=DCR
AddReg=CM500.AddReg, 1280, DPMS

[CM500E.Install]
DelReg=DCR
AddReg=CM500E.AddReg, 1280, DPMS

[CM600]
DelReg=DCR
AddReg=CM600.AddReg, 1280, DPMS

[CM611]
DelReg=DCR
AddReg=CM611.AddReg, 1280, DPMS

[CM620]
DelReg=DCR
AddReg=CM620.AddReg, 1280, DPMS

[CM630]
DelReg=DCR
AddReg=CM630.AddReg, 1280, DPMS

[HTC-CM641.Install]
DelReg=DCR
AddReg=HTC-CM641.AddReg, 1600, DPMS

[CM640ET.Install]
DelReg=DCR
AddReg=CM640ET.AddReg, 1280, DPMS

[PC-DC1551SP.Ins]
DelReg=DCR
AddReg=PC-DC1551SP.reg, 1024, DPMS

[PC-DC1570.Ins]
DelReg=DCR
AddReg=PC-DC1570.reg, 1024, DPMS

[PC-DC1570SP.Ins]
DelReg=DCR
AddReg=PC-DC1570SP.reg, 1280, DPMS

[PC-DC3610.Ins]
DelReg=DCR
AddReg=PC-DC3610.reg, 1600, DPMS

[PC-DC1552]
DelReg=DCR
AddReg=PC-DC1552.AddReg, 1024, DPMS

[PC-DC1571]
DelReg=DCR
AddReg=PC-DC1571.AddReg, 1280, DPMS

[PC-DC3620]
DelReg=DCR
AddReg=PC-DC3620.AddReg, 1600, DPMS

[PC-DC1590]
DelReg=DCR
AddReg=PC-DC1590.AddReg, 1600, DPMS

[PC-DT3131]
DelReg=DCR
AddReg=PC-DT3131.AddReg, 1024, DPMS

; -------------- HP
[P1282A.Install]
DelReg=DCR
AddReg=P1282A.AddReg, 1024, DPMS

[P1283A]
DelReg=DCR
AddReg=P1283A.AddReg, 1280, DPMS

[P1284A]
DelReg=DCR
AddReg=P1284A.AddReg, 1600, DPMS

[P1350B]
DelReg=DCR
AddReg=P1350B.AddReg, 1600, DPMS

[P1499A]
DelReg=DCR
AddReg=P1499A.AddReg, 1280, DPMS

[D2800A]
DelReg=DCR
AddReg=D2800A.AddReg, 1600, DPMS

[D2806A]
DelReg=DCR
AddReg=D2806A.AddReg, 1280, DPMS

[D2815A]
DelReg=DCR
AddReg=D2815A.AddReg, 1024, DPMS

[D2826.Install]
DelReg=DCR
AddReg=D2826.AddReg, 1024, DPMS

[D2828]
DelReg=DCR
AddReg=D2828.AddReg, 1024, DPMS

[HPD2832A.install]
DelReg=DCR
AddReg=HPD2832A.AddReg, 1280, DPMS

[HWP-D2835.Install]
DelReg=DCR
AddReg=HWP-D2835.AddReg, 1280, DPMS

[D2838.Install]
DelReg=DCR
AddReg=D2838.AddReg, 1280, DPMS

[HWP-D2840.Install]
DelReg=DCR
AddReg=HWP-D2840.AddReg, 1600, DPMS

[D2842A.Install]
DelReg=DCR
AddReg=D2842A.AddReg, 1600, DPMS

[HWP-D2845.Install]
DelReg=DCR
AddReg=HWP-D2845.AddReg, 1600, DPMS

[D2847]
DelReg=DCR
AddReg=D2847.AddReg, 1800, DPMS

[D3857A]
DelReg=DCR
AddReg=D3857A.AddReg, 1024, DPMS

[D3858A]
DelReg=DCR
AddReg=D3858A.AddReg, 1024, DPMS

[fx50.Install]
DelReg=DCR
AddReg=fx50.AddReg, 1024, DPMS

[hp_p3902a.Install]
DelReg=DCR
AddReg=hp_p3902a.AddReg, 1280, DPMS

[D5061]
DelReg=DCR
AddReg=D5061.AddReg, 1024, DPMS

[L1510.Install]
DelReg=DCR
AddReg=L1510.AddReg, 1024, DPMS

[D5065]
DelReg=DCR
AddReg=D5065.AddReg, 1280, DPMS

[L1810.Install]
DelReg=DCR
AddReg=L1810.AddReg, 1280, DPMS

[GEN15.Install]
DelReg=DCR
AddReg=GEN15.AddReg, 1024, DPMS

[GEN17.Install]
DelReg=DCR
AddReg=GEN17.AddReg, 1280, DPMS

[p720.Install]
DelReg=DCR
AddReg=p720.AddReg, 1600, DPMS

[D8894]
DelReg=DCR
AddReg=D8894.AddReg, 1024, DPMS

[D8895]
DelReg=DCR
AddReg=D8895.AddReg, 1024, DPMS

[D8896]
DelReg=DCR
AddReg=D8896.AddReg, 1024, DPMS

[D8897]
DelReg=DCR
AddReg=D8897.AddReg, 1024, DPMS

[D8898]
DelReg=DCR
AddReg=D8898.AddReg, 1280, DPMS

[D8900]
DelReg=DCR
AddReg=D8900.AddReg, 1600, DPMS

[D8901]
DelReg=DCR
AddReg=D8901.AddReg, 1280, DPMS

[D8902]
DelReg=DCR
AddReg=D8902.AddReg, 1280, DPMS

[D8903]
DelReg=DCR
AddReg=D8903.AddReg, 1280, DPMS

[HPD8904.Install]
DelReg=DCR
AddReg=HPD8904.AddReg, 1280, DPMS

[D8906A.Install]
DelReg=DCR
AddReg=D8906A.AddReg, 1280, DPMS

[D8910]
DelReg=DCR
AddReg=D8910.AddReg, 1600, DPMS

[D8911]
DelReg=DCR
AddReg=D8911.AddReg, 1600, DPMS

[D8915]
DelReg=DCR
AddReg=D8915.AddReg, 1800, DPMS

[hp54.Install]
DelReg=DCR
AddReg=hp54.AddReg, 1024, DPMS

; -------------- HWP
[HP8904.Install]
DelReg=DCR
AddReg=HP8904.AddReg, 1280, DPMS

[HP8905.Install]
DelReg=DCR
AddReg=HP8905.AddReg, 1280, DPMS

; -------------- Hyundai
[HL-2882]
DelReg=DCR
AddReg=HL-2882.AddReg, 1600, DPMS

[HL-4838E.Install]
DelReg=DCR
AddReg=HL-4838E.AddReg, 1024, DPMS, 1024, DPMS

[HL-4848F]
DelReg=DCR
AddReg=HL-4848F.AddReg, 1024, DPMS

[HL-4850B.Install]
DelReg=DCR
AddReg=HL-4850B.AddReg, 1024, DPMS, 1024, DPMS

[HL-4854B.Install]
DelReg=DCR
AddReg=HL-4854B.AddReg, 1024, DPMS, 1024, DPMS

[HL-4860E.Install]
DelReg=DCR
AddReg=HL-4860E.AddReg, 1024, DPMS, 1024, DPMS

[HL-5848F]
DelReg=DCR
AddReg=HL-5848F.AddReg, 1024, DPMS

[HL-5864]
DelReg=DCR
AddReg=HL-5864.AddReg, 1280, DPMS

[HL-5870A]
DelReg=DCR
AddReg=HL-5870A.AddReg, 1280, DPMS

[HN-7448M.Install]
DelReg=DCR
AddReg=HN-7448M.AddReg, 1024, DPMS, 1024, DPMS

[HL-7682A]
DelReg=DCR
AddReg=HL-7682A.AddReg, 1600, DPMS

[HL-7864F]
DelReg=DCR
AddReg=HL-7864F.AddReg, 1280, DPMS

[HL-7870A]
DelReg=DCR
AddReg=HL-7870A.AddReg, 1280, DPMS

[HL-7948M.Install]
DelReg=DCR
AddReg=HL-7948M.AddReg, 1024, DPMS, 1024, DPMS

[HL-2885B.Install]
DelReg=DCR
AddReg=HL-2885B.AddReg, 1600, DPMS, 1600, DPMS

[HT-2896B.Install]
DelReg=DCR
AddReg=HT-2896B.AddReg, 1600, DPMS, 1600, DPMS

[HL-4848.Install]
DelReg=DCR
AddReg=HL-4848.AddReg, 1024, DPMS, 1024, DPMS

[HL-5848.Install]
DelReg=DCR
AddReg=HL-5848.AddReg, 1024, DPMS, 1024, DPMS

[HL-5854B.Install]
DelReg=DCR
AddReg=HL-5854B.AddReg, 1024, DPMS, 1024, DPMS

[HL-5864E]
DelReg=DCR
AddReg=HL-5864E.AddReg, 1280, DPMS

[HL-5870B.Install]
DelReg=DCR
AddReg=HL-5870B.AddReg, 1280, DPMS, 1280, DPMS

[HL-5870BM.Install]
DelReg=DCR
AddReg=HL-5870BM.AddReg, 1280, DPMS, 1280, DPMS

[HT-7682B.Install]
DelReg=DCR
AddReg=HT-7682B.AddReg, 1600, DPMS, 1600, DPMS

[HT-7695B.Install]
DelReg=DCR
AddReg=HT-7695B.AddReg, 1600, DPMS

[HL-7770A.Install]
DelReg=DCR
AddReg=HL-7770A.AddReg, 1280, DPMS

[HL-7770RD.Install]
DelReg=DCR
AddReg=HL-7770RD.AddReg, 1280, DPMS

[HL-7870B.Install]
DelReg=DCR
AddReg=HL-7870B.AddReg, 1280, DPMS, 1280, DPMS

[HL-7870AM.Install]
DelReg=DCR
AddReg=HL-7870AM.AddReg, 1280, DPMS, 1280, DPMS

[HL-7870S.Install]
DelReg=DCR
AddReg=HL-7870S.AddReg, 1280, DPMS, 1280, DPMS

[HL-7864]
DelReg=DCR
AddReg=HL-7864.AddReg, 1280, DPMS


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

[1600B]
HKR,,MaxResolution,,"1600,1280"

[1800]
HKR,,MaxResolution,,"1800,1440"

[1856]
HKR,,MaxResolution,,"1856,1392"

[1920B]
HKR,,MaxResolution,,"1920,1440"

[2048]
HKR,,MaxResolution,,"2048,1536"

[800]
HKR,,MaxResolution,,"800,600"

[DPMS]
HKR,,DPMS,,1


;-------------------------------------------------
; Model AddReg sections

; -------------- FUNAI
[FCM_17GD.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

; -------------- Gateway
[VX900T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,48.0-120.0+,+"

[VX720A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[EVF720.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[VX920.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-140.0,+,+"

[VX920A.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-110.0,50.0-160.0,+,+"

[VX-700.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-130.0,+,+"

[VX-1100.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-108.0,50.0-152.0,+,+"

[VX1120.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-121.0,50.0-160.0,+,+"

[VX1120A.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-130.0,50.0-160.0,+,+"

[FPD1570.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-80.0,56.0-85.0,+,+"

[FPD1800.AddReg]
HKR,"MODES\1280,1024",Mode1,,"63.9,60.0,+,+"

[DL27.AddReg]
HKR,"MODES\800,600",Mode1,,"24.0-40.0,50.0-90.0,+,+"

[DL36.AddReg]
HKR,"MODES\800,600",Mode1,,"24.0-40.0,50.0-90.0,+,+"

[EV500.AddReg]
HKR,"MODES\1280,1024",MODE1,,"30.0-70.0,50.0-110.0,+,+"

[LE500GWY138F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[EV500B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[EV575.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[EV700_1.AddReg]
HKR,"MODES\1280,1024",MODE1,,"30.0-70.0,50.0-120.0,+,+"

[EV700.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[EV700B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[EV910C.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[GWY-EV700.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[EV700-H.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[GWY-EV900.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[VX900.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

; -------------- GWY
[LE500.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-120.0,+,+"

; -------------- Hansol
[400F.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,55.0-77.0,+,+"

[500F.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,55.0-77.0,+,+"

[Hansol400F.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,55.0-77.0,+,+"

[Mazellan14px.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[Mazellan14ax.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-120.0,-,-"

[Mazellan401A.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,50.0-120.0,-,-"

[Mazellan_400P.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-55.0,47.0-120.0,-,-"

[Mazellan15ax.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[Mazellan500P.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,-,-"

[Mazellan501P.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[Mazellan_500A.Add]
HKR,"MODES\1024,768",Mode1,,"30.0-58.0,47.0-120.0,-,-"

[Mazellan17px.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[Mazellan17ax.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,-,-"

[Mazellan701A.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[Mazellan701P.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,47.0-150.0,+,+"

[710A.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-72.0,47.0-160.0,+,+"

[710P.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,47.0-160.0,+,+"

[705D.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-75.0,47.0-160.0,+,+"

[720A.Add]
HKR,"MODES\1280,1024",Mode1,,"30.0-72.0,47.0-160.0,+,+"

[720P.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,47.0-160.0,+,+"

[Mazellan900P.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,47.0-150.0,+,+"

[910A.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,47.0-160.0,+,+"

[920eF.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-110.0,50.0-160.0,+,+"

[920D.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[2100P.Add]
HKR,"MODES\1600,1200",Mode1,,"30.0-115.0,50.0-200.0,+,+"

[2100A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-160.0,+,+"

[510A.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-58.0,50.0-120.0,-,-"

[510F.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,55.0-77.0,+,+"

[Mazellan17px.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-120.0,+,+"

; -------------- HITACHI
[GX17L.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[HM1764.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[HM1782.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,50.0-100.0,+,+"

[HM4721.AddReg]
HKR,"MODES\1600,1280",Mode1,,"30.0-95.0,50.0-152.0,+,+"

[HM4921.AddReg]
HKR,"MODES\1600,1280",Mode1,,"30.0-107.0,50.0-152.0,+,+"

[HM4020.AddReg]
HKR,"MODES\1600,1280",Mode1,,"60.0-85.0,60.0-120.0,+,+"

[HM4021.AddReg]
HKR,"MODES\1600,1280",Mode1,,"60.0-85.0,60.0-120.0,+,+"

[UX4721.AddReg]
HKR,"MODES\1600,1280",Mode1,,"30.0-95.0,50.0-152.0,+,+"

[GX20.AddReg]
HKR,"MODES\1600,1280",Mode1,,"28.0-90.0,50.0-152.0,+,+"

[GX21.AddReg]
HKR,"MODES\1600,1280",Mode1,,"28.0-90.0,50.0-152.0,+,+"

[HM4820.AddReg]
HKR,"MODES\1600,1280",Mode1,,"28.0-90.0,50.0-152.0,+,+"

[HM4821.AddReg]
HKR,"MODES\1600,1280",Mode1,,"28.0-90.0,50.0-152.0,+,+"

[GX20H.AddReg]
HKR,"MODES\1600,1280",Mode1,,"28.0-90.0,50.0-152.0,+,+"

[UX4921.AddReg]
HKR,"MODES\1600,1280",Mode1,,"30.0-107.0,50.0-152.0,+,+"

[HM6421.AddReg]
HKR,"MODES\1600,1280",Mode1,,"100.0-102.0,72.0-77.0,+,+"

[UX6821.AddReg]
HKR,"MODES\1600,1280",Mode1,,"30.0-107.0,50.0-152.0,+,+"

[HM6821.AddReg]
HKR,"MODES\1600,1280",Mode1,,"30.0-107.0,50.0-152.0,+,+"

[CH1786M.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-100,+,+"

[CH1711M.reg]
HKR,"MODES\1280,1024",Mode1,,"24.8-82.0,50.0-120.0,+,+"

[CH2111M.reg]
HKR,"MODES\1600,1280",Mode1,,"31.0-95.0,50.0-160.0,+,+"

[CH2112M.reg]
HKR,"MODES\1600,1280",Mode1,,"31.0-107.0,50.0-160.0,+,+"

[CM-1711M.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.8-82.0,55.0-120.0,+,+"

[CM-2112M.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-107.0,50.0-160.0,+,+"

[CM-2111M.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-95.0,50.0-160.0,+,+"

[CM-2110M.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-85.0,50.0-160.0,+,+"

[CM802.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-100.0,50.0-160.0,+,+"

[CM801.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-96.0,50.0-160.0,+,+"

[CM800.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-89.0,50.0-160.0,+,+"

[CM803.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-115.0,50.0-160.0,+,+"

[CM701.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-96.0,50.0-160.0,+,+"

[CM751.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-94.0,50.0-160.0,+,+"

[CM752.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-101.0,50.0-160.0,+,+"

[CM753.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-107.0,50.0-160.0,+,+"

[CM811.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-96.0,50.0-160.0,+,+"

[CM812.AddReg]
HKR,"MODES\1600,1280",Mode1,,"31.0-107.0,50.0-160.0,+,+"

[CM813.AddReg]
HKR,"MODES\1856,1392",Mode1,,"31.0-115.0,50.0-160.0,+,+"

[CM814.AddReg]
HKR,"MODES\1856,1392",Mode1,,"31.0-125.0,50.0-160.0,+,+"

[CM500.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-100.0,+,+"

[CM500E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-100.0,+,+"

[CM600.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,47.0-104.0,+,+"

[CM611.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-92.0,50.0-120.0,+,+"

[CM620.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-69.0,47.0-130.0,+,+"

[CM630.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-86.0,47.0-130.0,+,+"

[HTC-CM641.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-95.0,50.0-130.0,+,+"

[CM640ET.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-69.0,50.0-130.0,+,+"

[PC-DC1551SP.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[PC-DC1570.reg]
HKR,"MODES\1024,768",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[PC-DC1570SP.reg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[PC-DC3610.reg]
HKR,"MODES\1600,1200",Mode1,,"31.0-95.0,50.0-160.0,+,+"

[PC-DC1552.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-69.0,50.0-100.0,+,+"

[PC-DC1571.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-130.0,+,+"

[PC-DC3620.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-160.0,+,+"

[PC-DC1590.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-96.0,47.0-160.0,+,+"

[PC-DT3131.AddReg]
HKR,"MODES\640,400",Mode1,,"24.8,56.0,+,+"
HKR,"MODES\640,350",Mode2,,"31.5,70.0,+,+"
HKR,"MODES\640,400",Mode3,,"31.5,70.0,+,+"
HKR,"MODES\640,480",Mode4,,"31.5,60.0,+,+"
HKR,"MODES\640,480",Mode5,,"35.0,67.0,+,+"
HKR,"MODES\640,480",Mode6,,"37.8,72.0,+,+"
HKR,"MODES\800,600",Mode7,,"35.1,56.0,+,+"
HKR,"MODES\800,600",Mode8,,"37.8,60.0,+,+"
HKR,"MODES\800,600",Mode9,,"48.0,72.0,+,+"
HKR,"MODES\800,600",Mode10,,"46.8,75.0,+,+"
HKR,"MODES\1024,768",Mode11,,"48.2,60.0,+,+"
HKR,"MODES\1024,768",Mode12,,"48.3,60.0,+,+"
HKR,"MODES\1024,768",Mode13,,"56.4,70.0,+,+"
HKR,"MODES\1024,768",Mode14,,"60.0,75.0,+,+"
HKR,"MODES\1024,768",Mode15,,"60.2,75.0,+,+"

; -------------- HP
[P1282A.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-54,47-100,+,+"

[P1283A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[P1284A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-150.0,+,+"

[P1350B.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[P1499A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[D2800A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-82,50-160,+,+"

[D2806A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-64,50-100,+,+"

[D2815A.AddReg]
HKR,"MODES\1024,768",Mode1,,"31-48.4,50-100,+,+"

[D2826.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-54.0,50.0-120.0,+,+"

[D2828.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[HPD2832A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[HWP-D2835.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[D2838.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,+"

[HWP-D2840.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-92.0,50.0-150.0,+,+"

[D2842A.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[HWP-D2845.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.5-95.0,50.0-160.0,+,+"

[D2847.AddReg]
HKR,"MODES\1800,1440",Mode1,,"29.0-121.0,50.0-180.0,+,+"

[D3857A.AddReg]
HKR,"MODES\640,480",Mode1,,"31.0-48.4,60.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"31.0-48.4,56.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"31.0-48.4,40.0-60.0,+,+"

[D3858A.AddReg]
HKR,"MODES\640,480",Mode1,,"31.0-48.4,60.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"31.0-48.4,56.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"31.0-48.4,40.0-60.0,+,+"

[fx50.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5-60.0,56.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"31.5-60.0,56.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"31.5-60.0,56.0-75.0,+,+"

[hp_p3902a.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-120,+,+"

[D5061.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-69.0,56.0-85.0,+,+"

[L1510.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5-60.0,56.0-75.0,+,+"
HKR,"MODES\800,600",Mode1,,"31.5-60.0,56.0-75.0,+,+"
HKR,"MODES\1024,768",Mode1,,"31.5-60.0,56.0-75.0,+,+"

[D5065.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-80.0,56.0-85.0,+,+"

[L1810.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-80.0,56.0-85.0,+,+"

[GEN15.AddReg]
HKR,"MODES\1024,768",Mode1,,"28-57,50-100,+,+"

[GEN17.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-120,+,+"

[p720.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-85,50-160,+,+"

[D8894.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-90.0,-,-"

[D8895.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-90.0,-,-"

[D8896.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,-,-"

[D8897.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,-,-"

[D8898.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,-,-"

[D8900.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-86.0,50.0-160.0,+,+"

[D8901.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[D8902.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-72.0,50.0-120.0,+,+"

[D8903.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[HPD8904.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-70.0,50.0-120.0,+,+"

[D8906A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-86.0,50.0-160.0,+,+"

[D8910.AddReg]
HKR,"MODES\1600,1200",Mode1,,"29.0-107.0,50.0-150.0,+,+"

[D8911.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[D8915.AddReg]
HKR,"MODES\1800,1440",Mode1,,"30.0-121.0,48.0-160.0,+,+"

[hp54.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-55,50-120,+,+"

; -------------- HWP
[HP8904.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-130.0,+,+"

[HP8905.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-130.0,+,+"

; -------------- Hyundai
[HL-2882.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-82,45-100,-,-"

[HL-4838E.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-38,50-90,-,-"

[HL-4848F.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-48,50-120,-,-"

[HL-4850B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-50,50-130,-,-"

[HL-4854B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-50,50-130,-,-"

[HL-4860E.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-60,50-120,-,-"

[HL-5848F.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-48,50-120,-,-"

[HL-5864.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-64,50-90,-,-"

[HL-5870A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[HN-7448M.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-48,50-120,-,-"

[HL-7682A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-82,45-100,-,-"

[HL-7864F.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-64,50-100,-,-"

[HL-7870A.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[HL-7948M.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-48,50-120,-,-"

[HL-2885B.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-85,50-150,+,+"

[HT-2896B.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-96,50-150,+,+"

[HL-4848.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-50,50-90,-,-"

[HL-5848.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-48,50-90,-,-"

[HL-5854B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-50,50-130,-,-"

[HL-5864E.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-120.0,+,+"

[HL-5870B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-150,+,+"

[HL-5870BM.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-150,+,+"

[HT-7682B.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30-82,50-120,+,+"

[HT-7695B.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-95.0,50.0-150.0,+,+"

[HL-7770A.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[HL-7770RD.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[HL-7870B.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-150,+,+"

[HL-7870AM.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-150,+,+"

[HL-7870S.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-70,50-150,+,+"

[HL-7864.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-90.0,+,+"


;-------------------------------------------------
; User visible strings

[Strings]
MS="Microsoft"

FUNAI="Funai Electric Company of Taiwan"
Gateway="Gateway"
GWY="GATEWAY 2000"
Hansol="Hansol Electronics"
HITACHI="Hitachi"
HP="Hewlett Packard"
HWP="HP Computer Corporation"
HYUNDAI="Hyundai Electronics Industries Co., Ltd."

FCM_17GD="Funai 17GD"

VX900T="Gateway VX900T"
VX720A="Gateway VX720"
EVF720="Gateway EVF720"
VX920="Gateway VX920"
VX920A="Gateway VX920"
VX-700="Gateway VX700"
VX-1100="Gateway VX1100"
VX1120="Gateway VX1120"
VX1120A="Gateway VX1120"
FPD1570="Gateway FPD1570"
FPD1800="Gateway FPD1800"
DL27="Gateway Destination DL27"
DL36="Gateway Destination DL36"
EV500="Gateway EV500"
LE500GWY138F="LE500"
EV500B="Gateway EV500B"
EV575="Gateway EV575"
EV700_1="Gateway EV700"
EV700="EV700"
EV700B="Gateway EV700B"
EV910C="Gateway EV910C"
GWY-EV700="Gateway EV700"
EV700-H="Gateway EV700-H"
GWY-EV900="Gateway EV900"
VX900="Gateway VX900"

LE500="LE500"

400F="Hansol 400F"
500F="Hansol 500F"
Hansol400F="Hansol  400F"
Mazellan14px="Hansol Mazellan14px"
Mazellan14ax="Hansol Mazellan14ax"
Mazellan401A="Hansol Mazellan401A"
Mazellan_400P="Hansol Mazellan_400P"
Mazellan15ax="Hansol Mazellan15ax"
Mazellan500P="Hansol Mazellan500P"
Mazellan501P="Hansol Mazellan501P"
Mazellan_500A="Hansol Mazellan_500A"
Mazellan17ax="Hansol Mazellan17ax"
Mazellan701A="Hansol Mazellan701A"
Mazellan701P="Hansol Mazellan701P"
710A="Hansol 710E/710A/710Aplus"
710P="Hansol 710P/710D"
705D="Hansol 705D"
720A="Hansol 720A"
720P="Hansol 720P"
Mazellan900P="Hansol Mazellan900P"
910A="Hansol 910A"
920eF="Hansol 920eF"
920D="Hansol 920D"
2100P="Hansol 2100P"
2100A="Hansol 2100A"
510A="Hansol 510A"
510F="Hansol 510F"
Mazellan17px="Hansol Mazellan17px"

GX17L="Hitachi Accuvue GX17L"
HM1764="Hitachi HM1764"
HM1782="Hitachi HM1782"
HM4721="Hitachi HM4721"
HM4921="Hitachi HM4921"
HM4020="Hitachi HM4020"
HM4021="Hitachi HM4021"
UX4721="Hitachi Accuvue UX4721"
GX20="Hitachi Accuvue GX20"
GX21="Hitachi Accuvue GX21"
HM4820="Hitachi HM4820"
HM4821="Hitachi HM4821"
GX20H="Hitachi Accuvue GX20H"
UX4921="Hitachi Accuvue UX4921"
HM6421="Hitachi HM6421"
UX6821="Hitachi Accuvue UX6821"
HM6821="Hitachi HM6821"
CH1786M="Hitachi CH1786M"
CH1711M="Hitachi CH1711M"
CH2111M="Hitachi CH2111M"
CH2112M="Hitachi CH2112M"
CM-1711M="Hitachi CM-1711M"
CM-2112M="Hitachi CM-2112M"
CM-2111M="Hitachi CM-2111M"
CM-2110M="Hitachi CM-2110M"
CM802="Hitachi CM802"
CM801="Hitachi CM801"
CM800="Hitachi CM800"
CM803="Hitachi CM803"
CM701="Hitachi CM701"
CM751="Hitachi CM751"
CM752="Hitachi CM752"
CM753="Hitachi CM753"
CM811="Hitachi CM811"
CM812="Hitachi CM812"
CM813="Hitachi CM813"
CM814="Hitachi CM814"
CM500="Hitachi CM500"
CM500E="Hitachi CM500E"
CM600="Hitachi CM600"
CM611="Hitachi CM611"
CM620="Hitachi CM620"
CM630="Hitachi CM630"
HTC-CM641="Hitachi CM641"
CM640ET="CM640ET/CM640U"
PC-DC1551SP="Hitachi PC-DC1551SP"
PC-DC1570="Hitachi PC-DC1570"
PC-DC1570SP="Hitachi PC-DC1570SP"
PC-DC3610="Hitachi PC-DC3610"
PC-DC1552="Hitachi PC-DC1552"
PC-DC1571="Hitachi PC-DC1571"
PC-DC3620="Hitachi PC-DC3620"
PC-DC1590="Hitachi PC-DC1590"
PC-DT3131="Hitachi PC-DT3131"

P1282A="hp pavilion mx50"
P1283A="hp pavilion mx70"
P1284A="hp pavilion mx90"
P1350B="hp pavilion v90"
P1499A="hp pavilion mx75"
D2800A="HP D2800A Ultra VGA 1600 21-inch Display"
D2806A="HP D2806A Ergo Ultra VGA 15-inch Display"
D2815A="HP D1815A 1024 Low Emissions 14-inch Display"
D2826="HP D2826 15-inch Display"
D2828="HP D2828 HP 52 15-inch Monitor"
HPD2832A="HP D2832A"
HWP-D2835="HP D2835 Ultra VGA 1280 17-inch Display"
D2838="HP D2838 M700 17-inch Display"
HWP-D2840="HP D2840 Ergo 1280 17-inch Display"
D2842A="HP D2842A"
HWP-D2845="HP D2845 Ergo 1600 21-inch Display"
D2847="HP D2847 P1110 21-inch Monitor"
D3857A="HP D3857A Multi Media 15-inch Display"
D3858A="HP D3858A Multi Media 14-inch Display"
fx50="hp pavilion fx50"
hp_p3902a="hp pavilion v70s"
D5061="HP D5061 L1500 15-inch LCD Monitor"
L1510="HP L1510"
D5065="HP D5065 L1800 18.1-inch LCD Monitor"
L1810="HP L1810"
GEN15="hp pavilion v50"
GEN17="hp pavilion v70"
p720="HP D8907 p720"
D8894="HP D8894 HP 55 15-inch Monitor"
D8895="HP D8895 HP 55 15-inch Monitor"
D8896="HP D8896 HP 55 15-inch Monitor"
D8897="HP D8897 HP 55 15-inch Monitor"
D8898="HP D8898 HP 55 TCO95 15-inch Monitor"
D8900="HP D8900 HP 75 17-inch Monitor"
D8901="HP D8901 HP 71 17-inch Monitor"
D8902="HP D8902 HP 71 17-inch Monitor"
D8903="HP D8903 HP 71 17-inch Monitor"
HPD8904="HP D8904 Display"
D8906A="HP D8906A"
D8910="HP D8910 HP P910 19-inch Monitor"
D8911="HP D8911 HP 91 19-inch Monitor"
D8915="HP D8915 HP P1120 21-inch Monitor"
hp54="HP D8899 hp54"

HP8904="HP D8904"
HP8905="HP D8905"

HL-2882="Hyundai Deluxscan 21"
HL-4838E="Hyundai HL-4838E"
HL-4848F="Hyundai Deluxscan 14S"
HL-4850B="Hyundai HL-4850B"
HL-4854B="Hyundai HL-4854B"
HL-4860E="Hyundai HL-4860E"
HL-5848F="Hyundai Deluxscan 15B"
HL-5864="Hyundai Deluxscan 15G"
HL-5870A="Hyundai DeluxScan 15G+"
HN-7448M="Hyundai HN-7448M"
HL-7682A="Hyundai Deluxscan 17 Pro"
HL-7864F="Hyundai Deluxscan 17B"
HL-7870A="Hyundai DeluxScan 17B+"
HL-7948M="Hyundai HL-7948M"
HL-2885B="Hyundai HL-2885B"
HT-2896B="Hyundai HT-2896B"
HL-4848="Hyundai HL-4848"
HL-5848="Hyundai HL-5848"
HL-5854B="Hyundai HL-5854B"
HL-5864E="Hyundai DeluxScan 15 Pro"
HL-5870B="Hyundai HL-5870B"
HL-5870BM="Hyundai HL-5870BM"
HT-7682B="Hyundai HT-7682B"
HT-7695B="HT-7695B"
HL-7770A="HL-7770A"
HL-7770RD="HL-7770RD"
HL-7870B="Hyundai HL-7870B"
HL-7870AM="Hyundai HL-7870AM"
HL-7870S="Hyundai HL-7870S"
HL-7864="Hyundai DeluxScan 17"

