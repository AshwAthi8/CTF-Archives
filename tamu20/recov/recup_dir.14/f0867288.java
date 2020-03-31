
DefaultDestDir = 12
NTCopyFiles = 12
Win9xWDMFiles = 10,system32\drivers ; %windir%\SYSTEM32\DRIVERS

[NTCopyFiles]
wceusbsh.sys

[Win9xWDMFiles]
;wceusbsh.sys


;
; Class Install section
;
[ClassInstall]
Addreg=Interface_ClassReg

[ClassInstall32]
Addreg=Interface_ClassReg32

[Interface_ClassReg]
HKR,,,,%Interface.ClassName%
;HKR,,NoInstallClass,,1
HKR,,SilentInstall,,1
HKR,,Icon,,-20

[Interface_ClassReg32]
HKR,,,,%Interface.ClassName%
;HKR,,NoInstallClass,,1
HKR,,SilentInstall,,1
HKR,,Icon,,-20


;
;
;  <VENDOR SECTION>
;
;  1 of 3.
;  Add your manufacturer name here (and a string definition under [strings] below)
;
;  e.g.
;  %ACME%=ACME
;
[Manufacturer]
%Askey% = Askey,NTamd64
%BCOM% = BCOM,NTamd64
%Casio% = Casio,NTamd64
%Compaq% = Compaq,NTamd64
%Dell% = Dell,NTamd64
%HP% = HP,NTamd64
%Linkup% = Linkup,NTamd64
%MSFT% = MSFT,NTamd64
%Portatec% = Portatec,NTamd64
%Sagem% = Sagem,NTamd64
%Socket% = Socket,NTamd64
%Toshiba% = Toshiba,NTamd64
%HTC% = HTC,NTamd64
%NEC% = NEC,NTamd64
%Hitachi% = Hitachi,NTamd64
%FSC% = FSC,NTamd64
%Cyberbank% = Cyberbank,NTamd64
%Acer% = Acer,NTamd64
%ASUS% = ASUS,NTamd64
%Cesscom% = Cesscom,NTamd64
%Compal% = Compal,NTamd64
%E-TEN% = E-TEN,NTamd64
%Freedom Scientific% = Freedom Scientific,NTamd64
%FUJITSU% = FUJITSU,NTamd64
%Intermec% = Intermec,NTamd64
%JVC% = JVC,NTamd64
%Legend% = Legend,NTamd64
%LGE% = LGE,NTamd64
%MEI% = MEI,NTamd64
%Mitac% = Mitac,NTamd64
%MMT% = MMT,NTamd64
%MOTOROLA CGISS% = MOTOROLA CGISS,NTamd64
%Motorola iDEN% = Motorola iDEN,NTamd64
%Samsung% = Samsung,NTamd64
%Sierra Wireless% = Sierra Wireless,NTamd64
%Symbol% = Symbol,NTamd64
%Venture Corp% = Venture Corp,NTamd64
%ViewSonic% = ViewSonic,NTamd64
%HHP% = HHP,NTamd64
%Trimble% = Trimble,NTamd64
%Wistron% = Wistron,NTamd64
%Itronix% = Itronix,NTamd64
%Motorola% = Motorola,NTamd64
%Chi Mei% = Chi Mei,NTamd64


;
;  <VENDOR SECTION>
;
;  2 of 3.
;  Add your manufacturer section and device entry here.
;  Use the hardware PnP ID of your device.
;
;  e.g.
;  [ACME]
;  %USB\VID_xxxx&PID_yyyy.DeviceDesc% = Host_Inst, USB\VID_xxxx&PID_yyyy
;
[Askey.NTamd64]
%USB\Vid_1690&Pid_0601.DeviceDesc% = Host_Inst, USB\Vid_1690&Pid_0601

[BCOM.NTamd64]
%USB\Vid_0960&Pid_0065.DeviceDesc% = Host_Inst, USB\Vid_0960&Pid_0065
%USB\Vid_0960&Pid_0066.DeviceDesc% = Host_Inst, USB\Vid_0960&Pid_0066
%USB\Vid_0960&Pid_0067.DeviceDesc% = Host_Inst, USB\Vid_0960&Pid_0067

[Casio.NTamd64]
%USB\Vid_07CF&Pid_2001.DeviceDesc% = Host_Inst, USB\Vid_07CF&Pid_2001
%USB\Vid_07CF&Pid_2002.DeviceDesc% = Host_Inst, USB\Vid_07CF&Pid_2002
%USB\Vid_07CF&Pid_2003.DeviceDesc% = Host_Inst, USB\Vid_07CF&Pid_2003

[Compaq.NTamd64]
%USB\Vid_049F&Pid_0003.DeviceDesc% = Host_Inst, USB\Vid_049F&Pid_0003
%USB\Vid_049F&Pid_0032.DeviceDesc% = Host_Inst, USB\Vid_049F&Pid_0032

[Dell.NTamd64]
%USB\Vid_413C&Pid_4001.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4001
%USB\Vid_413C&Pid_4002.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4002
%USB\Vid_413C&Pid_4003.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4003
%USB\Vid_413C&Pid_4004.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4004
%USB\Vid_413C&Pid_4005.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4005
%USB\Vid_413C&Pid_4006.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4006
%USB\Vid_413C&Pid_4007.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4007
%USB\Vid_413C&Pid_4008.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4008
%USB\Vid_413C&Pid_4009.DeviceDesc% = Host_Inst, USB\Vid_413C&Pid_4009

[HP.NTamd64]
%USB\Vid_03F0&Pid_1016.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_1016
%USB\Vid_03F0&Pid_1116.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_1116
%USB\Vid_03F0&Pid_1216.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_1216
%USB\Vid_03F0&Pid_2016.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_2016
%USB\Vid_03F0&Pid_2116.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_2116
%USB\Vid_03F0&Pid_2216.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_2216
%USB\Vid_03F0&Pid_3016.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_3016
%USB\Vid_03F0&Pid_3116.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_3116
%USB\Vid_03F0&Pid_3216.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_3216
%USB\Vid_03F0&Pid_4016.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_4016
%USB\Vid_03F0&Pid_4116.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_4116
%USB\Vid_03F0&Pid_4216.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_4216
%USB\Vid_03F0&Pid_5016.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_5016
%USB\Vid_03F0&Pid_5116.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_5116
%USB\Vid_03F0&Pid_5216.DeviceDesc% = Host_Inst, USB\Vid_03F0&Pid_5216

[Linkup.NTamd64]
%USB\Vid_094B&Pid_0001.DeviceDesc% = Host_Inst, USB\Vid_094B&Pid_0001

[MSFT.NTamd64]
%USB\Vid_045E&Pid_00CE.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_00CE
%USB\Vid_045E&Pid_0400.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0400
%USB\Vid_045E&Pid_0401.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0401
%USB\Vid_045E&Pid_0402.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0402
%USB\Vid_045E&Pid_0403.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0403
%USB\Vid_045E&Pid_0404.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0404
%USB\Vid_045E&Pid_0405.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0405
%USB\Vid_045E&Pid_0406.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0406
%USB\Vid_045E&Pid_0407.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0407
%USB\Vid_045E&Pid_0408.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0408
%USB\Vid_045E&Pid_0409.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0409
%USB\Vid_045E&Pid_040A.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_040A
%USB\Vid_045E&Pid_040B.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_040B
%USB\Vid_045E&Pid_040C.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_040C
%USB\Vid_045E&Pid_040D.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_040D
%USB\Vid_045E&Pid_040E.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_040E
%USB\Vid_045E&Pid_040F.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_040F
%USB\Vid_045E&Pid_0410.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0410
%USB\Vid_045E&Pid_0411.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0411
%USB\Vid_045E&Pid_0412.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0412
%USB\Vid_045E&Pid_0413.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0413
%USB\Vid_045E&Pid_0414.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0414
%USB\Vid_045E&Pid_0415.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0415
%USB\Vid_045E&Pid_0416.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0416
%USB\Vid_045E&Pid_0417.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0417
%USB\Vid_045E&Pid_0432.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0432
%USB\Vid_045E&Pid_0433.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0433
%USB\Vid_045E&Pid_0434.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0434
%USB\Vid_045E&Pid_0435.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0435
%USB\Vid_045E&Pid_0436.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0436
%USB\Vid_045E&Pid_0437.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0437
%USB\Vid_045E&Pid_0438.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0438
%USB\Vid_045E&Pid_0439.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0439
%USB\Vid_045E&Pid_043A.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_043A
%USB\Vid_045E&Pid_043B.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_043B
%USB\Vid_045E&Pid_043C.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_043C
%USB\Vid_045E&Pid_043D.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_043D
%USB\Vid_045E&Pid_043E.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_043E
%USB\Vid_045E&Pid_043F.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_043F
%USB\Vid_045E&Pid_0440.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0440
%USB\Vid_045E&Pid_0441.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0441
%USB\Vid_045E&Pid_0442.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0442
%USB\Vid_045E&Pid_0443.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0443
%USB\Vid_045E&Pid_0444.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0444
%USB\Vid_045E&Pid_0445.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0445
%USB\Vid_045E&Pid_0446.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0446
%USB\Vid_045E&Pid_0447.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0447
%USB\Vid_045E&Pid_0448.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0448
%USB\Vid_045E&Pid_0449.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0449
%USB\Vid_045E&Pid_044A.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_044A
%USB\Vid_045E&Pid_044B.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_044B
%USB\Vid_045E&Pid_044C.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_044C
%USB\Vid_045E&Pid_044D.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_044D
%USB\Vid_045E&Pid_044E.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_044E
%USB\Vid_045E&Pid_044F.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_044F
%USB\Vid_045E&Pid_0450.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0450
%USB\Vid_045E&Pid_0451.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0451
%USB\Vid_045E&Pid_0452.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0452
%USB\Vid_045E&Pid_0453.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0453
%USB\Vid_045E&Pid_0454.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0454
%USB\Vid_045E&Pid_0455.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0455
%USB\Vid_045E&Pid_0456.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0456
%USB\Vid_045E&Pid_0457.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0457
%USB\Vid_045E&Pid_0458.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0458
%USB\Vid_045E&Pid_0459.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0459
%USB\Vid_045E&Pid_045A.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_045A
%USB\Vid_045E&Pid_045B.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_045B
%USB\Vid_045E&Pid_045C.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_045C
%USB\Vid_045E&Pid_045D.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_045D
%USB\Vid_045E&Pid_045E.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_045E
%USB\Vid_045E&Pid_045F.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_045F
%USB\Vid_045E&Pid_0460.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0460
%USB\Vid_045E&Pid_0461.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0461
%USB\Vid_045E&Pid_0462.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0462
%USB\Vid_045E&Pid_0463.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0463
%USB\Vid_045E&Pid_0464.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0464
%USB\Vid_045E&Pid_0465.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0465
%USB\Vid_045E&Pid_0466.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0466
%USB\Vid_045E&Pid_0467.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0467
%USB\Vid_045E&Pid_0468.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0468
%USB\Vid_045E&Pid_0469.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0469
%USB\Vid_045E&Pid_046A.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_046A
%USB\Vid_045E&Pid_046B.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_046B
%USB\Vid_045E&Pid_046C.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_046C
%USB\Vid_045E&Pid_046D.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_046D
%USB\Vid_045E&Pid_046E.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_046E
%USB\Vid_045E&Pid_046F.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_046F
%USB\Vid_045E&Pid_0470.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0470
%USB\Vid_045E&Pid_0471.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0471
%USB\Vid_045E&Pid_0472.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0472
%USB\Vid_045E&Pid_0473.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0473
%USB\Vid_045E&Pid_0474.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0474
%USB\Vid_045E&Pid_0475.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0475
%USB\Vid_045E&Pid_0476.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0476
%USB\Vid_045E&Pid_0477.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0477
%USB\Vid_045E&Pid_0478.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0478
%USB\Vid_045E&Pid_0479.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_0479
%USB\Vid_045E&Pid_047A.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_047A
%USB\Vid_045E&Pid_047B.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_047B
%USB\Vid_045E&Pid_04C8.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04C8
%USB\Vid_045E&Pid_04C9.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04C9
%USB\Vid_045E&Pid_04CA.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04CA
%USB\Vid_045E&Pid_04CB.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04CB
%USB\Vid_045E&Pid_04CC.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04CC
%USB\Vid_045E&Pid_04CD.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04CD
%USB\Vid_045E&Pid_04CE.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04CE
%USB\Vid_045E&Pid_04D7.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04D7
%USB\Vid_045E&Pid_04D8.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04D8
%USB\Vid_045E&Pid_04D9.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04D9
%USB\Vid_045E&Pid_04DA.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04DA
%USB\Vid_045E&Pid_04DB.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04DB
%USB\Vid_045E&Pid_04DC.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04DC
%USB\Vid_045E&Pid_04DD.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04DD
%USB\Vid_045E&Pid_04DE.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04DE
%USB\Vid_045E&Pid_04DF.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04DF
%USB\Vid_045E&Pid_04E0.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E0
%USB\Vid_045E&Pid_04E1.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E1
%USB\Vid_045E&Pid_04E2.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E2
%USB\Vid_045E&Pid_04E3.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E3
%USB\Vid_045E&Pid_04E4.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E4
%USB\Vid_045E&Pid_04E5.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E5
%USB\Vid_045E&Pid_04E6.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E6
%USB\Vid_045E&Pid_04E7.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E7
%USB\Vid_045E&Pid_04E8.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E8
%USB\Vid_045E&Pid_04E9.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04E9
%USB\Vid_045E&Pid_04EA.DeviceDesc% = Host_Inst, USB\Vid_045E&Pid_04EA

[Portatec.NTamd64]
%USB\Vid_0961&Pid_0010.DeviceDesc% = Host_Inst, USB\Vid_0961&Pid_0010

[Socket.NTamd64]
%USB\Vid_0104&Pid_00BE.DeviceDesc% = Host_Inst, USB\Vid_0104&Pid_00BE

[Sagem.NTamd64]
%USB\Vid_5E04&Pid_CE00.DeviceDesc% = Host_Inst, USB\Vid_5E04&Pid_CE00

[Toshiba.NTamd64]
%USB\Vid_0930&Pid_0700.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_0700
%USB\Vid_0930&Pid_0705.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_0705
%USB\Vid_0930&Pid_0707.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_0707
%USB\Vid_0930&Pid_0708.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_0708
%USB\Vid_0930&Pid_0706.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_0706
%USB\Vid_0930&Pid_0709.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_0709
%USB\Vid_0930&Pid_070A.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_070A
%USB\Vid_0930&Pid_070B.DeviceDesc% = Host_Inst, USB\Vid_0930&Pid_070B

[HTC.NTamd64]
%USB\Vid_0BB4&Pid_00CE.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_00CE
%USB\Vid_0BB4&Pid_0A01.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A01
%USB\Vid_0BB4&Pid_0A02.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A02
%USB\Vid_0BB4&Pid_0A03.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A03
%USB\Vid_0BB4&Pid_0A04.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A04
%USB\Vid_0BB4&Pid_0A05.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A05
%USB\Vid_0BB4&Pid_0A06.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A06
%USB\Vid_0BB4&Pid_0A07.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A07
%USB\Vid_0BB4&Pid_0A08.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A08
%USB\Vid_0BB4&Pid_0A09.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A09
%USB\Vid_0BB4&Pid_0A0A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A0A
%USB\Vid_0BB4&Pid_0A0B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A0B
%USB\Vid_0BB4&Pid_0A0C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A0C
%USB\Vid_0BB4&Pid_0A0D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A0D
%USB\Vid_0BB4&Pid_0A0E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A0E
%USB\Vid_0BB4&Pid_0A0F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A0F
%USB\Vid_0BB4&Pid_0A10.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A10
%USB\Vid_0BB4&Pid_0A11.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A11
%USB\Vid_0BB4&Pid_0A12.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A12
%USB\Vid_0BB4&Pid_0A13.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A13
%USB\Vid_0BB4&Pid_0A14.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A14
%USB\Vid_0BB4&Pid_0A15.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A15
%USB\Vid_0BB4&Pid_0A16.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A16
%USB\Vid_0BB4&Pid_0A17.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A17
%USB\Vid_0BB4&Pid_0A18.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A18
%USB\Vid_0BB4&Pid_0A19.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A19
%USB\Vid_0BB4&Pid_0A1A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A1A
%USB\Vid_0BB4&Pid_0A1B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A1B
%USB\Vid_0BB4&Pid_0A1C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A1C
%USB\Vid_0BB4&Pid_0A1D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A1D
%USB\Vid_0BB4&Pid_0A1E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A1E
%USB\Vid_0BB4&Pid_0A1F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A1F
%USB\Vid_0BB4&Pid_0A20.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A20
%USB\Vid_0BB4&Pid_0A21.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A21
%USB\Vid_0BB4&Pid_0A22.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A22
%USB\Vid_0BB4&Pid_0A23.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A23
%USB\Vid_0BB4&Pid_0A24.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A24
%USB\Vid_0BB4&Pid_0A25.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A25
%USB\Vid_0BB4&Pid_0A26.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A26
%USB\Vid_0BB4&Pid_0A27.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A27
%USB\Vid_0BB4&Pid_0A28.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A28
%USB\Vid_0BB4&Pid_0A29.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A29
%USB\Vid_0BB4&Pid_0A2A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A2A
%USB\Vid_0BB4&Pid_0A2B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A2B
%USB\Vid_0BB4&Pid_0A2C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A2C
%USB\Vid_0BB4&Pid_0A2D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A2D
%USB\Vid_0BB4&Pid_0A2E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A2E
%USB\Vid_0BB4&Pid_0A2F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A2F
%USB\Vid_0BB4&Pid_0A30.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A30
%USB\Vid_0BB4&Pid_0A31.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A31
%USB\Vid_0BB4&Pid_0A32.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A32
%USB\Vid_0BB4&Pid_0A33.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A33
%USB\Vid_0BB4&Pid_0A34.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A34
%USB\Vid_0BB4&Pid_0A35.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A35
%USB\Vid_0BB4&Pid_0A36.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A36
%USB\Vid_0BB4&Pid_0A37.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A37
%USB\Vid_0BB4&Pid_0A38.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A38
%USB\Vid_0BB4&Pid_0A39.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A39
%USB\Vid_0BB4&Pid_0A3A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A3A
%USB\Vid_0BB4&Pid_0A3B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A3B
%USB\Vid_0BB4&Pid_0A3C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A3C
%USB\Vid_0BB4&Pid_0A3D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A3D
%USB\Vid_0BB4&Pid_0A3E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A3E
%USB\Vid_0BB4&Pid_0A3F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A3F
%USB\Vid_0BB4&Pid_0A40.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A40
%USB\Vid_0BB4&Pid_0A41.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A41
%USB\Vid_0BB4&Pid_0A42.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A42
%USB\Vid_0BB4&Pid_0A43.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A43
%USB\Vid_0BB4&Pid_0A44.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A44
%USB\Vid_0BB4&Pid_0A45.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A45
%USB\Vid_0BB4&Pid_0A46.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A46
%USB\Vid_0BB4&Pid_0A47.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A47
%USB\Vid_0BB4&Pid_0A48.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A48
%USB\Vid_0BB4&Pid_0A49.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A49
%USB\Vid_0BB4&Pid_0A4A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A4A
%USB\Vid_0BB4&Pid_0A4B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A4B
%USB\Vid_0BB4&Pid_0A4C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A4C
%USB\Vid_0BB4&Pid_0A4D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A4D
%USB\Vid_0BB4&Pid_0A4E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A4E
%USB\Vid_0BB4&Pid_0A4F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A4F
%USB\Vid_0BB4&Pid_0A50.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A50
%USB\Vid_0BB4&Pid_0A51.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A51
%USB\Vid_0BB4&Pid_0A52.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A52
%USB\Vid_0BB4&Pid_0A53.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A53
%USB\Vid_0BB4&Pid_0A54.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A54
%USB\Vid_0BB4&Pid_0A55.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A55
%USB\Vid_0BB4&Pid_0A56.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A56
%USB\Vid_0BB4&Pid_0A57.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A57
%USB\Vid_0BB4&Pid_0A58.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A58
%USB\Vid_0BB4&Pid_0A59.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A59
%USB\Vid_0BB4&Pid_0A5A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A5A
%USB\Vid_0BB4&Pid_0A5B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A5B
%USB\Vid_0BB4&Pid_0A5C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A5C
%USB\Vid_0BB4&Pid_0A5D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A5D
%USB\Vid_0BB4&Pid_0A5E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A5E
%USB\Vid_0BB4&Pid_0A5F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A5F
%USB\Vid_0BB4&Pid_0A60.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A60
%USB\Vid_0BB4&Pid_0A61.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A61
%USB\Vid_0BB4&Pid_0A62.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A62
%USB\Vid_0BB4&Pid_0A63.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A63
%USB\Vid_0BB4&Pid_0A64.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A64
%USB\Vid_0BB4&Pid_0A65.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A65
%USB\Vid_0BB4&Pid_0A66.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A66
%USB\Vid_0BB4&Pid_0A67.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A67
%USB\Vid_0BB4&Pid_0A68.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A68
%USB\Vid_0BB4&Pid_0A69.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A69
%USB\Vid_0BB4&Pid_0A6A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A6A
%USB\Vid_0BB4&Pid_0A6B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A6B
%USB\Vid_0BB4&Pid_0A6C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A6C
%USB\Vid_0BB4&Pid_0A6D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A6D
%USB\Vid_0BB4&Pid_0A6E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A6E
%USB\Vid_0BB4&Pid_0A6F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A6F
%USB\Vid_0BB4&Pid_0A70.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A70
%USB\Vid_0BB4&Pid_0A71.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A71
%USB\Vid_0BB4&Pid_0A72.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A72
%USB\Vid_0BB4&Pid_0A73.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A73
%USB\Vid_0BB4&Pid_0A74.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A74
%USB\Vid_0BB4&Pid_0A75.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A75
%USB\Vid_0BB4&Pid_0A76.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A76
%USB\Vid_0BB4&Pid_0A77.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A77
%USB\Vid_0BB4&Pid_0A78.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A78
%USB\Vid_0BB4&Pid_0A79.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A79
%USB\Vid_0BB4&Pid_0A7A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A7A
%USB\Vid_0BB4&Pid_0A7B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A7B
%USB\Vid_0BB4&Pid_0A7C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A7C
%USB\Vid_0BB4&Pid_0A7D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A7D
%USB\Vid_0BB4&Pid_0A7E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A7E
%USB\Vid_0BB4&Pid_0A7F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A7F
%USB\Vid_0BB4&Pid_0A80.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A80
%USB\Vid_0BB4&Pid_0A81.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A81
%USB\Vid_0BB4&Pid_0A82.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A82
%USB\Vid_0BB4&Pid_0A83.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A83
%USB\Vid_0BB4&Pid_0A84.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A84
%USB\Vid_0BB4&Pid_0A85.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A85
%USB\Vid_0BB4&Pid_0A86.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A86
%USB\Vid_0BB4&Pid_0A87.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A87
%USB\Vid_0BB4&Pid_0A88.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A88
%USB\Vid_0BB4&Pid_0A89.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A89
%USB\Vid_0BB4&Pid_0A8A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A8A
%USB\Vid_0BB4&Pid_0A8B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A8B
%USB\Vid_0BB4&Pid_0A8C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A8C
%USB\Vid_0BB4&Pid_0A8D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A8D
%USB\Vid_0BB4&Pid_0A8E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A8E
%USB\Vid_0BB4&Pid_0A8F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A8F
%USB\Vid_0BB4&Pid_0A90.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A90
%USB\Vid_0BB4&Pid_0A91.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A91
%USB\Vid_0BB4&Pid_0A92.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A92
%USB\Vid_0BB4&Pid_0A93.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A93
%USB\Vid_0BB4&Pid_0A94.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A94
%USB\Vid_0BB4&Pid_0A95.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A95
%USB\Vid_0BB4&Pid_0A96.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A96
%USB\Vid_0BB4&Pid_0A97.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A97
%USB\Vid_0BB4&Pid_0A98.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A98
%USB\Vid_0BB4&Pid_0A99.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A99
%USB\Vid_0BB4&Pid_0A9A.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A9A
%USB\Vid_0BB4&Pid_0A9B.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A9B
%USB\Vid_0BB4&Pid_0A9C.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A9C
%USB\Vid_0BB4&Pid_0A9D.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A9D
%USB\Vid_0BB4&Pid_0A9E.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A9E
%USB\Vid_0BB4&Pid_0A9F.DeviceDesc% = Host_Inst, USB\Vid_0BB4&Pid_0A9F

[NEC.NTamd64]
%USB\Vid_0409&Pid_00D5.DeviceDesc% = Host_Inst, USB\Vid_0409&Pid_00D5
%USB\Vid_0409&Pid_00D6.DeviceDesc% = Host_Inst, USB\Vid_0409&Pid_00D6
%USB\Vid_0409&Pid_00D7.DeviceDesc% = Host_Inst, USB\Vid_0409&Pid_00D7
%USB\Vid_0409&Pid_8024.DeviceDesc% = Host_Inst, USB\Vid_0409&Pid_8024
%USB\Vid_0409&Pid_8025.DeviceDesc% = Host_Inst, USB\Vid_0409&Pid_8025

[Hitachi.NTamd64]
%USB\Vid_04A4&Pid_0014.DeviceDesc% = Host_Inst, USB\Vid_04A4&Pid_0014

[FSC.NTamd64]
%USB\Vid_0BF8&Pid_1001.DeviceDesc% = Host_Inst, USB\Vid_0BF8&Pid_1001

[Cyberbank.NTamd64]
%USB\Vid_0F98&Pid_0201.DeviceDesc% = Host_Inst, USB\Vid_0F98&Pid_0201

[Acer.NTamd64]
%USB\Vid_0502&Pid_16E1.DeviceDesc% = Host_Inst, USB\Vid_0502&Pid_16E1
%USB\Vid_0502&Pid_16E3.DeviceDesc% = Host_Inst, USB\Vid_0502&Pid_16E3
%USB\Vid_0502&Pid_16E2.DeviceDesc% = Host_Inst, USB\Vid_0502&Pid_16E2
%USB\Vid_0502&Pid_1631.DeviceDesc% = Host_Inst, USB\Vid_0502&Pid_1631
%USB\Vid_0502&Pid_1632.DeviceDesc% = Host_Inst, USB\Vid_0502&Pid_1632

[ASUS.NTamd64]
%USB\Vid_0B05&Pid_9202.DeviceDesc% = Host_Inst, USB\Vid_0B05&Pid_9202
%USB\Vid_0B05&Pid_420F.DeviceDesc% = Host_Inst, USB\Vid_0B05&Pid_420F
%USB\Vid_0B05&Pid_4200.DeviceDesc% = Host_Inst, USB\Vid_0B05&Pid_4200
%USB\Vid_0B05&Pid_4201.DeviceDesc% = Host_Inst, USB\Vid_0B05&Pid_4201
%USB\Vid_0B05&Pid_4202.DeviceDesc% = Host_Inst, USB\Vid_0B05&Pid_4202
%USB\Vid_0B05&Pid_9200.DeviceDesc% = Host_Inst, USB\Vid_0B05&Pid_9200

[Cesscom.NTamd64]
%USB\Vid_0C8E&Pid_6000.DeviceDesc% = Host_Inst, USB\Vid_0C8E&Pid_6000

[Compal.NTamd64]
%USB\Vid_04AD&Pid_0301.DeviceDesc% = Host_Inst, USB\Vid_04AD&Pid_0301
%USB\Vid_04AD&Pid_0302.DeviceDesc% = Host_Inst, USB\Vid_04AD&Pid_0302
%USB\Vid_04AD&Pid_0303.DeviceDesc% = Host_Inst, USB\Vid_04AD&Pid_0303

[E-TEN.NTamd64]
%USB\Vid_1066&Pid_0300.DeviceDesc% = Host_Inst, USB\Vid_1066&Pid_0300
%USB\Vid_1066&Pid_0500.DeviceDesc% = Host_Inst, USB\Vid_1066&Pid_0500
%USB\Vid_1066&Pid_0600.DeviceDesc% = Host_Inst, USB\Vid_1066&Pid_0600
%USB\Vid_1066&Pid_0700.DeviceDesc% = Host_Inst, USB\Vid_1066&Pid_0700
%USB\Vid_1066&Pid_00CE.DeviceDesc% = Host_Inst, USB\Vid_1066&Pid_00CE

[Freedom Scientific.NTamd64]
%USB\Vid_0F4E&Pid_0200.DeviceDesc% = Host_Inst, USB\Vid_0F4E&Pid_0200

[FUJITSU.NTamd64]
%USB\Vid_04C5&Pid_1058.DeviceDesc% = Host_Inst, USB\Vid_04C5&Pid_1058
%USB\Vid_04C5&Pid_1079.DeviceDesc% = Host_Inst, USB\Vid_04C5&Pid_1079

[Intermec.NTamd64]
%USB\Vid_067E&Pid_1001.DeviceDesc% = Host_Inst, USB\Vid_067E&Pid_1001

[JVC.NTamd64]
%USB\Vid_04F1&Pid_3011.DeviceDesc% = Host_Inst, USB\Vid_04F1&Pid_3011
%USB\Vid_04F1&Pid_3012.DeviceDesc% = Host_Inst, USB\Vid_04F1&Pid_3012

[Legend.NTamd64]
%USB\Vid_3708&Pid_20CE.DeviceDesc% = Host_Inst, USB\Vid_3708&Pid_20CE
%USB\Vid_3708&Pid_21CE.DeviceDesc% = Host_Inst, USB\Vid_3708&Pid_21CE

[LGE.NTamd64]
%USB\Vid_043E&Pid_9C01.DeviceDesc% = Host_Inst, USB\Vid_043E&Pid_9C01

[MEI.NTamd64]
%USB\Vid_04DA&Pid_2500.DeviceDesc% = Host_Inst, USB\Vid_04DA&Pid_2500

[Mitac.NTamd64]
%USB\Vid_3340&Pid_0B1C.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_0B1C
%USB\Vid_3340&Pid_0E3A.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_0E3A
%USB\Vid_3340&Pid_0F3A.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_0F3A
%USB\Vid_3340&Pid_0F1C.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_0F1C
%USB\Vid_3340&Pid_1326.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_1326
%USB\Vid_3340&Pid_3326.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_3326
%USB\Vid_3340&Pid_0326.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_0326
%USB\Vid_3340&Pid_0426.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_0426
%USB\Vid_3340&Pid_011C.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_011C
%USB\Vid_3340&Pid_053A.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_053A
%USB\Vid_3340&Pid_043A.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_043A
%USB\Vid_3340&Pid_071C.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_071C
%USB\Vid_3340&Pid_051C.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_051C
%USB\Vid_3340&Pid_2326.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_2326
%USB\Vid_3340&Pid_191C.DeviceDesc% = Host_Inst, USB\Vid_3340&Pid_191C

[MMT.NTamd64]
%USB\Vid_4113&Pid_0210.DeviceDesc% = Host_Inst, USB\Vid_4113&Pid_0210
%USB\Vid_4113&Pid_0211.DeviceDesc% = Host_Inst, USB\Vid_4113&Pid_0211
%USB\Vid_4113&Pid_0400.DeviceDesc% = Host_Inst, USB\Vid_4113&Pid_0400
%USB\Vid_4113&Pid_0410.DeviceDesc% = Host_Inst, USB\Vid_4113&Pid_0410

[MOTOROLA CGISS.NTamd64]
%USB\Vid_0CAD&Pid_9001.DeviceDesc% = Host_Inst, USB\Vid_0CAD&Pid_9001

[Motorola iDEN.NTamd64]
%USB\Vid_0C44&Pid_03A2.DeviceDesc% = Host_Inst, USB\Vid_0C44&Pid_03A2

[Samsung.NTamd64]
%USB\Vid_04E8&Pid_6611.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6611
%USB\Vid_04E8&Pid_6613.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6613
%USB\Vid_04E8&Pid_6615.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6615
%USB\Vid_04E8&Pid_6617.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6617
%USB\Vid_04E8&Pid_6619.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6619
%USB\Vid_04E8&Pid_661B.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_661B
%USB\Vid_04E8&Pid_5F00.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_5F00
%USB\Vid_04E8&Pid_5F01.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_5F01
%USB\Vid_04E8&Pid_5F02.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_5F02
%USB\Vid_04E8&Pid_5F03.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_5F03
%USB\Vid_04E8&Pid_5F04.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_5F04
%USB\Vid_04E8&Pid_662E.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_662E
%USB\Vid_04E8&Pid_6630.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6630
%USB\Vid_04E8&Pid_6632.DeviceDesc% = Host_Inst, USB\Vid_04E8&Pid_6632

[Sierra Wireless.NTamd64]
%USB\Vid_4505&Pid_0010.DeviceDesc% = Host_Inst, USB\Vid_4505&Pid_0010

[Symbol.NTamd64]
%USB\Vid_05E0&Pid_2000.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2000
%USB\Vid_05E0&Pid_2001.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2001
%USB\Vid_05E0&Pid_2002.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2002
%USB\Vid_05E0&Pid_2003.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2003
%USB\Vid_05E0&Pid_2004.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2004
%USB\Vid_05E0&Pid_2005.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2005
%USB\Vid_05E0&Pid_2006.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2006
%USB\Vid_05E0&Pid_2007.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2007
%USB\Vid_05E0&Pid_2008.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2008
%USB\Vid_05E0&Pid_2009.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_2009
%USB\Vid_05E0&Pid_200A.DeviceDesc% = Host_Inst, USB\Vid_05E0&Pid_200A

[Venture Corp.NTamd64]
%USB\Vid_1182&Pid_1388.DeviceDesc% = Host_Inst, USB\Vid_1182&Pid_1388

[ViewSonic.NTamd64]
%USB\Vid_0543&Pid_0ED9.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_0ED9
%USB\Vid_0543&Pid_1527.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_1527
%USB\Vid_0543&Pid_1529.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_1529
%USB\Vid_0543&Pid_152B.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_152B
%USB\Vid_0543&Pid_152E.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_152E
%USB\Vid_0543&Pid_1921.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_1921
%USB\Vid_0543&Pid_1922.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_1922
%USB\Vid_0543&Pid_1923.DeviceDesc% = Host_Inst, USB\Vid_0543&Pid_1923

[HHP.NTamd64]
%USB\Vid_0536&Pid_01A0.DeviceDesc% = Host_Inst, USB\Vid_0536&Pid_01A0

[Trimble.NTamd64]
%USB\Vid_099E&Pid_0052.DeviceDesc% = Host_Inst, USB\Vid_099E&Pid_0052
%USB\Vid_099E&Pid_4000.DeviceDesc% = Host_Inst, USB\Vid_099E&Pid_4000

[Wistron.NTamd64]
%USB\Vid_0FB8&Pid_3001.DeviceDesc% = Host_Inst, USB\Vid_0FB8&Pid_3001
%USB\Vid_0FB8&Pid_3002.DeviceDesc% = Host_Inst, USB\Vid_0FB8&Pid_3002
%USB\Vid_0FB8&Pid_3003.DeviceDesc% = Host_Inst, USB\Vid_0FB8&Pid_3003
%USB\Vid_0FB8&Pid_4001.DeviceDesc% = Host_Inst, USB\Vid_0FB8&Pid_4001

[Itronix.NTamd64]
%USB\Vid_11D9&Pid_1003.DeviceDesc% = Host_Inst, USB\Vid_11D9&Pid_1003
%USB\Vid_11D9&Pid_1002.DeviceDesc% = Host_Inst, USB\Vid_11D9&Pid_1002

[Motorola.NTamd64]
%USB\Vid_22B8&Pid_4204.DeviceDesc% = Host_Inst, USB\Vid_22B8&Pid_4204
%USB\Vid_22B8&Pid_4214.DeviceDesc% = Host_Inst, USB\Vid_22B8&Pid_4214
%USB\Vid_22B8&Pid_4224.DeviceDesc% = Host_Inst, USB\Vid_22B8&Pid_4224
%USB\Vid_22B8&Pid_4234.DeviceDesc% = Host_Inst, USB\Vid_22B8&Pid_4234
%USB\Vid_22B8&Pid_4244.DeviceDesc% = Host_Inst, USB\Vid_22B8&Pid_4244

[Chi Mei.NTamd64]
%USB\Vid_1231&Pid_CE01.DeviceDesc% = Host_Inst, USB\Vid_1231&Pid_CE01
%USB\Vid_1231&Pid_CE02.DeviceDesc% = Host_Inst, USB\Vid_1231&Pid_CE02

;
; Win 9x DDInstall section
;
[Host_Inst]
Copyfiles = Win9xWDMFiles
AddReg = Host_Win9x_AddReg
DriverVer=09/01/2003, 3.7.1.3244

[Host_Win9x_AddReg]
HKR,,DevLoader,0,*NTKERN
HKR,,NTMPDriver,,"wceusbsh.sys"


;
; Windows 2000 and XP DDInstall section
;
[Host_Inst.NT]
CopyFiles=NTCopyFiles
DriverVer=09/01/2003, 3.7.1.3244

[Host_Inst.NT.Services]
AddService = wceusbsh,0x00000002,Host_Service_Inst, Host_EventLog_Inst

[Host_Service_Inst]
DisplayName   = %Host_Inst.SVCDESC%
ServiceType   = 1  ; SERVICE_KERNEL_DRIVER
StartType     = 3  ; SERVICE_DEMAND_START
ErrorControl  = 0  ; SERVICE_ERROR_IGNORE
ServiceBinary = %12%\wceusbsh.sys
LoadOrderGroup = Extended base

[Host_EventLog_Inst]
AddReg = Host_EventLog_AddReg

[Host_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\wceusbsh.sys"
HKR,,TypesSupported,0x00010001,7



[Strings]
;----------------------
REG_DWORD = 0x00010001
MICROSOFT = "Microsoft"

Host_Inst.SVCDESC   = "Windows CE USB Serial Host Driver"
Interface.ClassName = "Windows CE USB Devices"


MediaDescription	= "Windows CE ActiveSync Media"

;
;  <VENDOR SECTION>
;
; 3 of 3.
; Define your strings here
;
;  e.g.
;  ACME = "ACME"
;  USB\VID_xxxx&PID_yyyy.DeviceDesc = "ACME USB Sync"
;
Askey = "Askey"
USB\Vid_1690&Pid_0601.DeviceDesc = "Askey USB Sync"

BCOM = "BCOM"
USB\Vid_0960&Pid_0065.DeviceDesc = "BCOM USB Sync 0065"
USB\Vid_0960&Pid_0066.DeviceDesc = "BCOM USB Sync 0066"
USB\Vid_0960&Pid_0067.DeviceDesc = "BCOM USB Sync 0067"

Casio  = "CASIO"
USB\Vid_07CF&Pid_2001.DeviceDesc = "CASIO USB Sync 2001"
USB\Vid_07CF&Pid_2002.DeviceDesc = "CASIO USB Sync 2002"
USB\Vid_07CF&Pid_2003.DeviceDesc = "CASIO USB Sync 2003"

Compaq = "Compaq Computer Corporation"
USB\Vid_049F&Pid_0003.DeviceDesc = "Compaq iPAQ USB Sync"
USB\Vid_049F&Pid_0032.DeviceDesc = "Compaq iPAQ USB Sync"

Dell = "Dell"
USB\Vid_413C&Pid_4001.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4002.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4003.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4004.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4005.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4006.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4007.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4008.DeviceDesc = "Dell Axim USB Sync"
USB\Vid_413C&Pid_4009.DeviceDesc = "Dell Axim USB Sync"

HP = "HP"
USB\Vid_03F0&Pid_1016.DeviceDesc = "HP USB Sync"
USB\Vid_03F0&Pid_1116.DeviceDesc = "HP USB Sync 1611"
USB\Vid_03F0&Pid_1216.DeviceDesc = "HP USB Sync 1612"
USB\Vid_03F0&Pid_2016.DeviceDesc = "HP USB Sync 1620"
USB\Vid_03F0&Pid_2116.DeviceDesc = "HP USB Sync 1621"
USB\Vid_03F0&Pid_2216.DeviceDesc = "HP USB Sync 1622"
USB\Vid_03F0&Pid_3016.DeviceDesc = "HP USB Sync 1630"
USB\Vid_03F0&Pid_3116.DeviceDesc = "HP USB Sync 1631"
USB\Vid_03F0&Pid_3216.DeviceDesc = "HP USB Sync 1632"
USB\Vid_03F0&Pid_4016.DeviceDesc = "HP USB Sync 1640"
USB\Vid_03F0&Pid_4116.DeviceDesc = "HP USB Sync 1641"
USB\Vid_03F0&Pid_4216.DeviceDesc = "HP USB Sync 1642"
USB\Vid_03F0&Pid_5016.DeviceDesc = "HP USB Sync 1650"
USB\Vid_03F0&Pid_5116.DeviceDesc = "HP USB Sync 1651"
USB\Vid_03F0&Pid_5216.DeviceDesc = "HP USB Sync 1652"

Linkup = "Linkup Systems"
USB\Vid_094B&Pid_0001.DeviceDesc = "Linkup Systems USB Sync"

MSFT = "Microsoft"
USB\Vid_045E&Pid_00CE.DeviceDesc = "Microsoft USB Sync"
USB\Vid_045E&Pid_0400.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0401.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0402.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0403.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0404.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0405.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0406.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0407.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0408.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0409.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_040A.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_040B.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_040C.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_040D.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_040E.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_040F.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0410.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0411.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0412.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0413.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0414.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0415.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0416.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0417.DeviceDesc = "Windows Powered Pocket PC 2002"
USB\Vid_045E&Pid_0432.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0433.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0434.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0435.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0436.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0437.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0438.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0439.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_043A.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_043B.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_043C.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_043D.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_043E.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_043F.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0440.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0441.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0442.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0443.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0444.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0445.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0446.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0447.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0448.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0449.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_044A.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_044B.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_044C.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_044D.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_044E.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_044F.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0450.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0451.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0452.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0453.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0454.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0455.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0456.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0457.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0458.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0459.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_045A.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_045B.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_045C.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_045D.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_045E.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_045F.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0460.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0461.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0462.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0463.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0464.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0465.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0466.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0467.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0468.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0469.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_046A.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_046B.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_046C.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_046D.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_046E.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_046F.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0470.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0471.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0472.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0473.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0474.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0475.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0476.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0477.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0478.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_0479.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_047A.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_047B.DeviceDesc = "Windows Powered Pocket PC 2003"
USB\Vid_045E&Pid_04C8.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04C9.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04CA.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04CB.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04CC.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04CD.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04CE.DeviceDesc = "Windows Powered Smartphone 2002"
USB\Vid_045E&Pid_04D7.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04D8.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04D9.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04DA.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04DB.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04DC.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04DD.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04DE.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04DF.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E0.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E1.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E2.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E3.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E4.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E5.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E6.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E7.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E8.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04E9.DeviceDesc = "Windows Powered Smartphone 2003"
USB\Vid_045E&Pid_04EA.DeviceDesc = "Windows Powered Smartphone 2003"


Portatec = "Portatec"
USB\Vid_0961&Pid_0010.DeviceDesc = "Portatec USB Sync"

Sagem = "SAGEM"
USB\Vid_5E04&Pid_CE00.DeviceDesc = "SAGEM Wireless Assistant"

Socket = "Socket Communications"
USB\Vid_0104&Pid_00BE.DeviceDesc = "Socket USB Sync"

Toshiba = "Toshiba"
USB\Vid_0930&Pid_0700.DeviceDesc = "TOSHIBA USB Sync 0700"
USB\Vid_0930&Pid_0705.DeviceDesc = "TOSHIBA Pocket PC e310"
USB\Vid_0930&Pid_0707.DeviceDesc = "TOSHIBA Pocket PC e330 Series"
USB\Vid_0930&Pid_0708.DeviceDesc = "TOSHIBA Pocket PC e350 Series"
USB\Vid_0930&Pid_0706.DeviceDesc = "TOSHIBA Pocket PC e740"
USB\Vid_0930&Pid_0709.DeviceDesc = "TOSHIBA Pocket PC e750 Series"
USB\Vid_0930&Pid_070A.DeviceDesc = "TOSHIBA Pocket PC e400 Series"
USB\Vid_0930&Pid_070B.DeviceDesc = "TOSHIBA Pocket PC e800 Series"

HTC = "HTC"
USB\Vid_0BB4&Pid_00CE.DeviceDesc = "HTC USB Sync"
USB\Vid_0BB4&Pid_0A01.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A02.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A03.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A04.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A05.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A06.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A07.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A08.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A09.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A0A.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A0B.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A0C.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A0D.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A0E.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A0F.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A10.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A11.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A12.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A13.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A14.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A15.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A16.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A17.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A18.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A19.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A1A.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A1B.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A1C.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A1D.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A1E.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A1F.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A20.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A21.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A22.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A23.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A24.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A25.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A26.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A27.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A28.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A29.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A2A.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A2B.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A2C.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A2D.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A2E.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A2F.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A30.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A31.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A32.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A33.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A34.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A35.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A36.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A37.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A38.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A39.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A3A.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A3B.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A3C.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A3D.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A3E.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A3F.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A40.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A41.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A42.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A43.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A44.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A45.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A46.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A47.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A48.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A49.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A4A.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A4B.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A4C.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A4D.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A4E.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A4F.DeviceDesc = "PocketPC USB Sync"
USB\Vid_0BB4&Pid_0A50.DeviceDesc = "HTC SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A51.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A52.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A53.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A54.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A55.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A56.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A57.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A58.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A59.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A5A.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A5B.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A5C.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A5D.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A5E.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A5F.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A60.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A61.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A62.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A63.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A64.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A65.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A66.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A67.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A68.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A69.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A6A.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A6B.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A6C.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A6D.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A6E.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A6F.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A70.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A71.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A72.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A73.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A74.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A75.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A76.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A77.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A78.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A79.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A7A.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A7B.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A7C.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A7D.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A7E.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A7F.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A80.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A81.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A82.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A83.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A84.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A85.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A86.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A87.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A88.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A89.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A8A.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A8B.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A8C.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A8D.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A8E.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A8F.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A90.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A91.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A92.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A93.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A94.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A95.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A96.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A97.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A98.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A99.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A9A.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A9B.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A9C.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A9D.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A9E.DeviceDesc = "SmartPhone USB Sync"
USB\Vid_0BB4&Pid_0A9F.DeviceDesc = "SmartPhone USB Sync"

NEC = "NEC"
USB\Vid_0409&Pid_00D5.DeviceDesc = "NEC USB Sync"
USB\Vid_0409&Pid_00D6.DeviceDesc = "NEC USB Sync"
USB\Vid_0409&Pid_00D7.DeviceDesc = "NEC USB Sync"
USB\Vid_0409&Pid_8024.DeviceDesc = "NEC USB Sync"
USB\Vid_0409&Pid_8025.DeviceDesc = "NEC USB Sync"

Hitachi = "Hitachi"
USB\Vid_04A4&Pid_0014.DeviceDesc = "Hitachi USB Sync"

FSC = "Fujitsu Siemens Computers"
USB\Vid_0BF8&Pid_1001.DeviceDesc = "Fujitsu Siemens Computers USB Sync"

Cyberbank = "Cyberbank"
USB\Vid_0F98&Pid_0201.DeviceDesc = "Cyberbank USB Sync"

Acer = "Acer"
USB\Vid_0502&Pid_16E1.DeviceDesc = "Acer n10 Handheld USB Sync"
USB\Vid_0502&Pid_16E3.DeviceDesc = "Acer n30 Handheld USB Sync"
USB\Vid_0502&Pid_16E2.DeviceDesc = "Acer n20 Handheld USB Sync"
USB\Vid_0502&Pid_1631.DeviceDesc = "c10 Series"
USB\Vid_0502&Pid_1632.DeviceDesc = "c20 Series"

ASUS = "ASUS"
USB\Vid_0B05&Pid_9202.DeviceDesc = "ASUS USB Sync"
USB\Vid_0B05&Pid_420F.DeviceDesc = "ASUS USB Sync"
USB\Vid_0B05&Pid_4200.DeviceDesc = "ASUS USB Sync"
USB\Vid_0B05&Pid_4201.DeviceDesc = "ASUS USB Sync"
USB\Vid_0B05&Pid_4202.DeviceDesc = "ASUS USB Sync"
USB\Vid_0B05&Pid_9200.DeviceDesc = "ASUS USB Sync"

Cesscom = "Cesscom"
USB\Vid_0C8E&Pid_6000.DeviceDesc = "Cesscom Luxian Series"

Compal = "Compal"
USB\Vid_04AD&Pid_0301.DeviceDesc = "USB Sync 0301"
USB\Vid_04AD&Pid_0302.DeviceDesc = "USB Sync 0302"
USB\Vid_04AD&Pid_0303.DeviceDesc = "USB Sync 0303"

E-TEN = "E-TEN"
USB\Vid_1066&Pid_0300.DeviceDesc = "E-TEN P3XX Pocket PC"
USB\Vid_1066&Pid_0500.DeviceDesc = "E-TEN P5XX Pocket PC"
USB\Vid_1066&Pid_0600.DeviceDesc = "E-TEN P6XX Pocket PC"
USB\Vid_1066&Pid_0700.DeviceDesc = "E-TEN P7XX Pocket PC"
USB\Vid_1066&Pid_00CE.DeviceDesc = "E-TEN USB Sync"

Freedom Scientific = "Freedom Scientific"
USB\Vid_0F4E&Pid_0200.DeviceDesc = "Freedom Scientific USB Sync"

FUJITSU = "FUJITSU"
USB\Vid_04C5&Pid_1058.DeviceDesc = "FUJITSU USB Sync"
USB\Vid_04C5&Pid_1079.DeviceDesc = "FUJITSU USB Sync"

Intermec = "Intermec"
USB\Vid_067E&Pid_1001.DeviceDesc = "Intermec Mobile Computer"

JVC = "JVC"
USB\Vid_04f1&Pid_3011.DeviceDesc = "JVC USB Sync"
USB\Vid_04F1&Pid_3012.DeviceDesc = "JVC USB Sync"

Legend = "Legend"
USB\Vid_3708&Pid_20CE.DeviceDesc = "Legend USB Sync"
USB\Vid_3708&Pid_21CE.DeviceDesc = "Lenovo USB Sync"

LGE = "LGE"
USB\Vid_043E&Pid_9C01.DeviceDesc = "LGE USB Sync"

MEI = "MEI"
USB\Vid_04DA&Pid_2500.DeviceDesc = "Panasonic USB Sync"

Mitac = "Mitac"
USB\Vid_3340&Pid_0B1C.DeviceDesc = "Generic PPC StrongARM"
USB\Vid_3340&Pid_0E3A.DeviceDesc = "Generic PPC USB Sync"
USB\Vid_3340&Pid_0F3A.DeviceDesc = "Generic SmartPhone USB Sync"
USB\Vid_3340&Pid_0F1C.DeviceDesc = "Itautec USB Sync"
USB\Vid_3340&Pid_1326.DeviceDesc = "Itautec USB Sync"
USB\Vid_3340&Pid_3326.DeviceDesc = "MEDION Winodws Moble USB Sync"
USB\Vid_3340&Pid_0326.DeviceDesc = "Mio DigiWalker 338"
USB\Vid_3340&Pid_0426.DeviceDesc = "Mio DigiWalker 338"
USB\Vid_3340&Pid_011C.DeviceDesc = "Mio DigiWalker PPC StrongARM"
USB\Vid_3340&Pid_053A.DeviceDesc = "Mio DigiWalker SmartPhone USB Sync"
USB\Vid_3340&Pid_043A.DeviceDesc = "Mio DigiWalker USB Sync"
USB\Vid_3340&Pid_071C.DeviceDesc = "MiTAC USB Sync"
USB\Vid_3340&Pid_051C.DeviceDesc = "MiTAC USB Sync 528"
USB\Vid_3340&Pid_2326.DeviceDesc = "Vobis USB Sync"
USB\Vid_3340&Pid_191C.DeviceDesc = "YAKUMO USB Sync"

MMT = "MMT"
USB\Vid_4113&Pid_0210.DeviceDesc = "Mobile Media Technology USB Sync"
USB\Vid_4113&Pid_0211.DeviceDesc = "Mobile Media Technology USB Sync"
USB\Vid_4113&Pid_0400.DeviceDesc = "Mobile Media Technology USB Sync"
USB\Vid_4113&Pid_0410.DeviceDesc = "Mobile Media Technology USB Sync"

MOTOROLA CGISS = "MOTOROLA CGISS"
USB\Vid_0CAD&Pid_9001.DeviceDesc = "Motorola PowerPad Pocket PC Device"

Motorola iDEN = "Motorola iDEN"
USB\Vid_0C44&Pid_03A2.DeviceDesc = "Motorola iDEN Smartphone"

Samsung = "Samsung"
USB\Vid_04E8&Pid_6611.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_6613.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_6615.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_6617.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_6619.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_661B.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_5F00.DeviceDesc = "Samsung NEXiO USB Sync"
USB\Vid_04E8&Pid_5F01.DeviceDesc = "Samsung NEXiO USB Sync"
USB\Vid_04E8&Pid_5F02.DeviceDesc = "Samsung NEXiO USB Sync"
USB\Vid_04E8&Pid_5F03.DeviceDesc = "Samsung NEXiO USB Sync"
USB\Vid_04E8&Pid_5F04.DeviceDesc = "Samsung NEXiO USB Sync"
USB\Vid_04E8&Pid_662E.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_6630.DeviceDesc = "Samsung MITs USB Sync"
USB\Vid_04E8&Pid_6632.DeviceDesc = "Samsung MITs USB Sync"

Sierra Wireless = "Sierra Wireless"
USB\Vid_4505&Pid_0010.DeviceDesc = "Smartphone"

Symbol = "Symbol"
USB\Vid_05E0&Pid_2000.DeviceDesc = "Symbol USB Sync"
USB\Vid_05E0&Pid_2001.DeviceDesc = "Symbol USB Sync 0x2001"
USB\Vid_05E0&Pid_2002.DeviceDesc = "Symbol USB Sync 0x2002"
USB\Vid_05E0&Pid_2003.DeviceDesc = "Symbol USB Sync 0x2003"
USB\Vid_05E0&Pid_2004.DeviceDesc = "Symbol USB Sync 0x2004"
USB\Vid_05E0&Pid_2005.DeviceDesc = "Symbol USB Sync 0x2005"
USB\Vid_05E0&Pid_2006.DeviceDesc = "Symbol USB Sync 0x2006"
USB\Vid_05E0&Pid_2007.DeviceDesc = "Symbol USB Sync 0x2007"
USB\Vid_05E0&Pid_2008.DeviceDesc = "Symbol USB Sync 0x2008"
USB\Vid_05E0&Pid_2009.DeviceDesc = "Symbol USB Sync 0x2009"
USB\Vid_05E0&Pid_200A.DeviceDesc = "Symbol USB Sync 0x200A"

Venture Corp = "Venture Corp"
USB\Vid_1182&Pid_1388.DeviceDesc = "VES USB Sync"

ViewSonic = "ViewSonic"
USB\Vid_0543&Pid_0ED9.DeviceDesc = "ViewSonic Color Pocket PC V35"
USB\Vid_0543&Pid_1527.DeviceDesc = "ViewSonic Color Pocket PC V36"
USB\Vid_0543&Pid_1529.DeviceDesc = "ViewSonic Color Pocket PC V37"
USB\Vid_0543&Pid_152B.DeviceDesc = "ViewSonic Color Pocket PC V38"
USB\Vid_0543&Pid_152E.DeviceDesc = "ViewSonic Pocket PC"
USB\Vid_0543&Pid_1921.DeviceDesc = "ViewSonic Communicator Pocket PC"
USB\Vid_0543&Pid_1922.DeviceDesc = "ViewSonic Smartphone"
USB\Vid_0543&Pid_1923.DeviceDesc = "ViewSonic Pocket PC V30"

HHP = "HHP"
USB\Vid_0536&Pid_01A0.DeviceDesc = "HHP PDT"

Trimble = "Trimble Navigation Limited"
USB\Vid_099E&Pid_0052.DeviceDesc = "Trimble GeoExplorer"
USB\Vid_099E&Pid_4000.DeviceDesc = "TDS Data Collector"

Wistron = "Wistron"
USB\Vid_0FB8&Pid_3001.DeviceDesc = "Wistron USB Sync"
USB\Vid_0FB8&Pid_3002.DeviceDesc = "Wistron USB Sync"
USB\Vid_0FB8&Pid_3003.DeviceDesc = "Wistron USB Sync"
USB\Vid_0FB8&Pid_4001.DeviceDesc = "Wistron USB Sync"

Itronix = "ITRONIX"
USB\Vid_11D9&Pid_1003.DeviceDesc = "Rugged Pocket PC 2003"
USB\Vid_11D9&Pid_1002.DeviceDesc = "Rugged Pocket PC 2003"

Motorola = "Motorola"
USB\Vid_22B8&Pid_4204.DeviceDesc = "Motorola MPx200 Smartphone"
USB\Vid_22B8&Pid_4214.DeviceDesc = "Motorola MPc GSM"
USB\Vid_22B8&Pid_4224.DeviceDesc = "Motorola MPx220 Smartphone"
USB\Vid_22B8&Pid_4234.DeviceDesc = "Motorola MPc CDMA"
USB\Vid_22B8&Pid_4244.DeviceDesc = "Motorola MPx100 Smartphone"

Chi Mei = "CMCS"
USB\Vid_1231&Pid_CE01.DeviceDesc = "USB Sync 03"
USB\Vid_1231&Pid_CE02.DeviceDesc = "USB Sync 03"

[Strings]
;----------------------
REG_DWORD = 0x00010001
MICROSOFT = "Microsoft"

Host_Inst.SVCDESC   = "Windows CE USB Serial Host Driver"
Interface.ClassName = "Windows CE USB Devices"


;
;  <VENDOR SECTION>
;
; 3 of 3.
; Define your strings here
;
;  e.g.
;  ACME = "ACME"
;  USB\VID_xxxx&PID_yyyy.DeviceDesc = "ACME USB Sync"
;
Askey = "Askey"
USB\Vid_1690&Pid_0601.DeviceDesc = "Askey USB Sync"

BCOM = "BCOM"
USB\Vid_0960&Pid_0065.DeviceDesc = "BCOM USB Sync 0065"
USB\Vid_0960&Pid_0066.DeviceDesc = "BCOM USB Sync 0066"
USB\Vid_0960&Pid_0067.DeviceDesc = "BCOM USB Sync 0067"

Casio  = "CASIO"
USB\Vid_07CF&Pid_2001.DeviceDesc = "CASIO USB Sync 2001"
USB\Vid_07CF&Pid_2002.DeviceDesc = "CASIO USB Sync 2002"

Compaq = "Compaq Computer Corporation"
USB\Vid_049F&Pid_0003.DeviceDesc = "Compaq Aero USB Sync"

HP = "HP"
USB\Vid_03F0&Pid_1016.DeviceDesc = "HP USB Sync"

Linkup = "Linkup Systems"
USB\Vid_094B&Pid_0001.DeviceDesc = "Linkup Systems USB Sync"

MSFT = "Microsoft"
USB\Vid_045E&Pid_00CE.DeviceDesc = "Microsoft USB Sync"

Portatec = "Portatec"
USB\Vid_0961&Pid_0010.DeviceDesc = "Portatec USB Sync"

Socket = "Socket Communications"
USB\Vid_0104&Pid_00BE.DeviceDesc = "Socket USB Sync"
