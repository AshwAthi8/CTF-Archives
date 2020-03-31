; MONITOR4.INF
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
%IBM%=IBM,NTamd64
%ICL%=ICL,NTamd64
%Iiyama%=Iiyama,NTamd64
%IODATA%=IODATA,NTamd64
%String0%=Korea_Data_Systems,NTamd64


;-------------------------------------------------
; Manufacturer Sections

[IBM.NTamd64]
%IBM_2116%=IBM_2116.Install, Monitor\IBM0844
%IBM_2128%=IBM_2128.Install, Monitor\IBM0850
%IBM_2235%=IBM_2235.Install, Monitor\IBM08BB
%IBM_2237%=IBM_2237.Install, Monitor\IBM08BD
%IBMLCDV%=IBMLCDV, Monitor\IBM0A2E
%IBMLCDVD%=IBMLCDV, Monitor\IBM0A41
%IBMLCDS%=IBMLCDS, Monitor\IBM0A4B
%IBMLCDSD%=IBMLCDS, Monitor\IBM0A50
%IBMLCDX%=IBMLCDX, Monitor\IBM0A55
%IBM_6540%=IBM_6540.Install, Monitor\IBM198C
%IBM_6541%=IBM_6541.Install, Monitor\IBM198D
%IBMG41%=IBMG41, Monitor\IBM198E
%IBMG50%=IBMG50, Monitor\IBM198F
%IBMG70%=IBMG70, Monitor\IBM1990
%IBMG200%=IBMG200, Monitor\IBM1991
%IBM6546%=IBM6546, Monitor\IBM1992
%IBM6547%=IBM6547, Monitor\IBM1993
%IBM_6549%=IBM_6549.Install, Monitor\IBM1995
%IBMP50%=IBMP50, Monitor\IBM1999
%IBMP70%=IBMP70, Monitor\IBM199A
%IBMP200%=IBMP200, Monitor\IBM199B
%IBM_6556%=IBM_6556.Install, Monitor\IBM199C
%IBM_6557%=IBM_6557.Install, Monitor\IBM199D
%IBM_6558%=IBM_6558.Install, Monitor\IBM199E
%IBM7095%=IBM7095, Monitor\IBM1BB7
%IBM7097%=IBM7097, Monitor\IBM1BB9
%IBM2112%=IBM2112, Monitor\IBM2112
%IBM2113%=IBM2113, Monitor\IBM2113
%IBM2114%=IBM2114, Monitor\IBM2114
%IBM2115%=IBM2115, Monitor\IBM2115
%IBM2117%=IBM2117, Monitor\IBM2117
%IBM2215%=IBM2215, Monitor\IBM2215
%IBM2122%=IBM2122.install, Monitor\IBM2221
%IBM2236%=IBM2236.install, Monitor\IBM2236
%IBM2238%=IBM2238, Monitor\IBM2238
%IBM2248%=IBM2248, Monitor\IBM2248
%IBM2264%=IBM2264, Monitor\IBM2264
%IBM2124%=IBM2124.install, Monitor\IBM2421
%IBM_9513%=IBM_9513.Install, Monitor\IBM2529
%IBM_9514%=IBM_9514.Install, Monitor\IBM252A
%IBM9525-0X1%=IBM9525-0X1, Monitor\IBM2535
%IBMLCDXD%=IBMLCDX, Monitor\IBM254A
%IBMLCDSX%=IBMLCDSX, Monitor\IBM254C
%IBMLCDEX%=IBMLCDEX, Monitor\IBM254D
%IBM2126%=IBM2126.Install, Monitor\IBM2621
%IBM9900%=IBM9900, Monitor\IBM26AC
%IBM2127%=IBM2127.Install, Monitor\IBM2721
%IBM9901%=IBM9901, Monitor\IBM27AD
%IBM2131%=IBM2131.install, Monitor\IBM3121
%IBM2132%=IBM2132.install, Monitor\IBM3221
%IBM6312%=IBM6312, Monitor\IBM6312
%IBM6314%=IBM6314, Monitor\IBM6314
%IBM6315%=IBM6315, Monitor\IBM6315
%IBM6317%=IBM6317, Monitor\IBM6317
%IBM6319%=IBM6319, Monitor\IBM6319
%IBM6321%=IBM6321, Monitor\IBM6321
%IBM6322%=IBM6322, Monitor\IBM6322
%IBM6324%=IBM6324, Monitor\IBM6324
%IBM6325%=IBM6324, Monitor\IBM6325
%IBM6327%=IBM6327, Monitor\IBM6327
%IBM7234%=IBM7234.Install, Monitor\IBM7234
%IBM7254%=IBM7254.Install, Monitor\IBM7254
%IBM8504%=IBM8504, Monitor\IBM8504
%IBM8511%=IBM8511, Monitor\IBM8511
%IBM8512%=IBM8512, Monitor\IBM8512
%IBM8513%=IBM8513, Monitor\IBM8513
%IBM8514%=IBM8514, Monitor\IBM8514
%IBM8515%=IBM8515, Monitor\IBM8515
%IBM8517%=IBM8517, Monitor\IBM8517
%IBM8518%=IBM8518, Monitor\IBM8518
%IBM9504%=IBM9504, Monitor\IBM9504
%IBM9515%=IBM9515, Monitor\IBM9515
%IBM9517%=IBM9517, Monitor\IBM9517
%IBM9518%=IBM9518, Monitor\IBM9518
%IBM9521%=IBM9521, Monitor\IBM9521
%IBM9524%=IBM9524, Monitor\IBM9524
%IBM9525%=IBM9525, Monitor\IBM9525
%IBM9527%=IBM9527, Monitor\IBM9527

[ICL.NTamd64]
%ICL-EP211v%=ICL-EP211v, Monitor\ICL0100
%ICL-EP171p%=ICL-EP171p, Monitor\ICL0200
%ICL-EP171v%=ICL-EP171v, Monitor\ICL0400
%ICL-EP151p%=ICL-EP151p, Monitor\ICL0700
%ICL-EP151pAB%=ICL-EP151pAB, Monitor\ICL0800
%ICL-EP151v%=ICL-EP151v, Monitor\ICL0A00
%ICL-EP141v%=ICL-EP141v, Monitor\ICL0B00
%ICL-EP141p%=ICL-EP141p, Monitor\ICL0D00
%ICL-EP152v%=ICL-EP152v, Monitor\ICL0F00
%ICL-EP142v%=ICL-EP142v, Monitor\ICL1400
%ICL-EPe153%=ICL-EPe153, Monitor\ICL1600
%ICL-EPx173%=ICL-EPx173, Monitor\ICL1900
%ICL-EPx173a%=ICL-EPx173a, Monitor\ICL1A00
%ICL-EPx152%=ICL-EPx152, Monitor\ICL1C00
%ICL-EPe173%=ICL-EPe173, Monitor\ICL1D00
%ICL-EPx153%=ICL-EPx153, Monitor\ICL2100
%ICL-EPe154%=ICL-EPe154, Monitor\ICL2200
%ICL-EPe174%=ICL-EPe174, Monitor\ICL2300
%ICL-EPx174%=ICL-EPx174, Monitor\ICL2400
%ICL-e175%=ICL-e175, Monitor\ICL2500
%ICL-e213%=ICL-e213, Monitor\ICL2700
%ICL-x191%=ICL-x191.Install, Monitor\ICL2800
%ICL-x154%=ICL-x154, Monitor\ICL2900
%ICL-e176%=ICL-e176, Monitor\ICL2A00

[Iiyama.NTamd64]
%MF-8615F-8515E2-8515F%=MF-8615F-8515E2-8515F.Ins, Monitor\IVM0800
%s500m%=s500m.install, Monitor\IVM0815
%LP-1013%=LP-1013.Ins, Monitor\IVM13F0
%mf8515g%=mf8515g.Install, Monitor\IVM1501
%mf8617et%=mf8617e.Install, Monitor\IVM1700
%mf8617es%=mf8617e.Install, Monitor\IVM1701
%s701gt%=s701gt.Install, Monitor\IVM1702
%s702gt%=s702gt.Install, Monitor\IVM1703
%a701gt%=a701gt.Install, Monitor\IVM1711
%mt9017et%=mt9017et.Install, Monitor\IVM1730
%a702h%=a702h.Install, Monitor\IVM1740
%s703h%=s703h.Install, Monitor\IVM1742
%s704h%=s704h.Install, Monitor\IVM1744
%s705m%=s705m.Install, Monitor\IVM1748
%a705m%=a705m.Install, Monitor\IVM174A
%s700j%=s700j.Install, Monitor\IVM17A8
%s901gt%=s901gt.Install, Monitor\IVM1900
%a901h%=a901h.Install, Monitor\IVM1901
%s902j%=s902j.Install, Monitor\IVM1910
%a902m%=a902m.install, Monitor\IVM1918
%f901u%=f901u.install, Monitor\IVM1920
%a901u%=a901u.install, Monitor\IVM1928
%mf8221e%=mf8221e.Install, Monitor\IVM2100
%mf8721e%=mf8721e.Install, Monitor\IVM2101
%mt9221%=mt9221.Install, Monitor\IVM2102
%s101gt%=s101gt.Install, Monitor\IVM2110
%a101gt%=a101gt.Install, Monitor\IVM2118
%s102g%=s102g.Install, Monitor\IVM2120
%a102gt%=a102gt.Install, Monitor\IVM2128
%mf9021e%=mf9021e.Install, Monitor\IVM2130
%s103m%=s102g.Install, Monitor\IVM2138
%a201h%=a201h.Install, Monitor\IVM2140
%s104m%=s104m.Install, Monitor\IVM2148
%TXA3601GT%=TXA3601GT.Install, Monitor\IVM3601
%txa3602g%=txa3602g.Install, Monitor\IVM3602
%txa3611g%=txa3611g.Install, Monitor\IVM3604
%a612j%=a612j.Install, Monitor\IVM3606
%txa3811%=txa3811.Install, Monitor\IVM3801
%a3832h%=a3832h.Install, Monitor\IVM3808
%a812j%=a812j.Install, Monitor\IVM3810
%a833j%=a833j.Install, Monitor\IVM3818
%a3813m%=a3813m.Install, Monitor\IVM3820
%tsa3931h%=tsa3931h.Install, Monitor\IVM3900
%a3921u%=a3921u.Install, Monitor\IVM3908
%a4632h%=a463x.Install, Monitor\IVM4600
%a4633j%=a463x.Install, Monitor\IVM4610
%a4634j%=a463x.Install, Monitor\IVM4618
%a4635u%=a463x.Install, Monitor\IVM4620

[IODATA.NTamd64]
%LCD-A18H%=LCD-A18H.Install, Monitor\IOD0118
%LCD-A141H%=LCD-IODATA.Install, Monitor\IOD0214
%LCD-DV141H%=LCD-DV141H.Install, Monitor\IOD0314
%LCD-A15H%=LCD-A15H.Install, Monitor\IOD0415
%LCD-DV15H%=LCD-DV15H.Install, Monitor\IOD0515

[Korea_Data_Systems.NTamd64]
%VS-4%=VS-4.install, Monitor\KDS05AC
%VS-4D%=VS-4D.install, Monitor\KDS05AF
%VS-5%=VS-5.install, Monitor\KDS05E6
%VS-55%=VS-55.install, Monitor\KDS05F5
%VS-7%=VS-7.install, Monitor\KDS06C2
%VS-9%=VS-9.install, Monitor\KDS06D6
%VS-19%=VS-19.install, Monitor\KDS07D0
%VS-21%=VS-21.install, Monitor\KDS0834
%AV-5T%=AV-5T.install, Monitor\KDS1540
%VS-5e%=VS-5e.install, Monitor\KDS1542
%AV-7T%=AV-7T.install, Monitor\KDS1740
%VS-7e%=VS-7e.install, Monitor\KDS1742
%VS7I%=VS7I.Install, Monitor\KDS1745
%AV7TF%=AV7TF.Install, Monitor\KDS1746
%VS8I%=VS8I.Install, Monitor\KDS1760
%AV-9T%=AV-9T.install, Monitor\KDS1780
%VS-9e%=VS-9e.install, Monitor\KDS1781
%AV9TF%=AV9TF.Install, Monitor\KDS1783
%VS-195%=VS-195.install, Monitor\KDS1980
%VS-19SN%=VS-19SN.install, Monitor\KDS1981
%AV-195T%=AV-195T.install, Monitor\KDS1982
%VS195E%=VS195E.Install, Monitor\KDS1983
%VS190I%=VS190I.Install, Monitor\KDS1985
%VS195I%=VS195I.Install, Monitor\KDS1986
%AV195TF%=AV195TF.Install, Monitor\KDS19A0
%VS-21e%=VS-21e.install, Monitor\KDS21C0
%AV21TF%=AV21TF.Install, Monitor\KDS21C1


;-------------------------------------------------
; Install sections

; -------------- IBM
[IBM_2116.Install]
DelReg=DCR
AddReg=IBM_2116.AddReg, 1024, DPMS

[IBM_2128.Install]
DelReg=DCR
AddReg=IBM_2128.AddReg, 1280, DPMS

[IBM_2235.Install]
DelReg=DCR
AddReg=IBM_2235.AddReg, 1024, DPMS

[IBM_2237.Install]
DelReg=DCR
AddReg=IBM_2237.AddReg, 1280, DPMS

[IBMLCDV]
DelReg=DCR
AddReg=IBMLCDV.AddReg, 640, DPMS

[IBMLCDS]
DelReg=DCR
AddReg=IBMLCDS.AddReg, 800, DPMS

[IBMLCDX]
DelReg=DCR
AddReg=IBMLCDX.AddReg, 1024, DPMS

[IBM_6540.Install]
DelReg=DCR
AddReg=IBM_6540.AddReg, 1024, DPMS

[IBM_6541.Install]
DelReg=DCR
AddReg=IBM_6541.AddReg, 1024, DPMS

[IBMG41]
DelReg=DCR
AddReg=IBMG41.AddReg, 1024, DPMS

[IBMG50]
DelReg=DCR
AddReg=IBMG50.AddReg, 1024, DPMS

[IBMG70]
DelReg=DCR
AddReg=IBMG70.AddReg, 1280, DPMS

[IBMG200]
DelReg=DCR
AddReg=IBMG200.AddReg, 1280, DPMS

[IBM6546]
DelReg=DCR
AddReg=IBM6546.AddReg, 1024, DPMS

[IBM6547]
DelReg=DCR
AddReg=IBM6547.AddReg, 1280, DPMS

[IBM_6549.Install]
DelReg=DCR
AddReg=IBM_6549.AddReg, 1600, DPMS

[IBMP50]
DelReg=DCR
AddReg=IBMP50.AddReg, 1024, DPMS

[IBMP70]
DelReg=DCR
AddReg=IBMP70.AddReg, 1280, DPMS

[IBMP200]
DelReg=DCR
AddReg=IBMP200.AddReg, 1600, DPMS

[IBM_6556.Install]
DelReg=DCR
AddReg=IBM_6556.AddReg, 1280, DPMS

[IBM_6557.Install]
DelReg=DCR
AddReg=IBM_6557.AddReg, 1600, DPMS

[IBM_6558.Install]
DelReg=DCR
AddReg=IBM_6558.AddReg, 1600, DPMS

[IBM7095]
DelReg=DCR
AddReg=IBM7095.AddReg, 1280, DPMS

[IBM7097]
DelReg=DCR
AddReg=IBM7097.AddReg, 1280, DPMS

[IBM2112]
DelReg=DCR
AddReg=IBM2112.AddReg, 1024

[IBM2113]
DelReg=DCR
AddReg=IBM2113.AddReg, 1024

[IBM2114]
DelReg=DCR
AddReg=IBM2114.AddReg, 1280, DPMS

[IBM2115]
DelReg=DCR
AddReg=IBM2115.AddReg, 1280, DPMS

[IBM2117]
DelReg=DCR
AddReg=IBM2117.AddReg, 1280, DPMS

[IBM2215]
DelReg=DCR
AddReg=IBM2215.AddReg, 1280, DPMS

[IBM2122.install]
DelReg=DCR
AddReg=IBM2122.AddReg, 1024, DPMS

[IBM2236.install]
DelReg=DCR
AddReg=IBM2236.AddReg, 1280, DPMS

[IBM2238]
DelReg=DCR
AddReg=IBM2238.AddReg, 1024, DPMS

[IBM2248]
DelReg=DCR
AddReg=IBM2248.AddReg, 1024, DPMS

[IBM2264]
DelReg=DCR
AddReg=IBM2264.AddReg, 1280, DPMS

[IBM2124.install]
DelReg=DCR
AddReg=IBM2124.AddReg, 1024, DPMS

[IBM_9513.Install]
DelReg=DCR
AddReg=IBM_9513.AddReg, 1024, DPMS

[IBM_9514.Install]
DelReg=DCR
AddReg=IBM_9514.AddReg, 1024, DPMS

[IBM9525-0X1]
DelReg=DCR
AddReg=IBM9525-0X1.AddReg, 1024, DPMS

[IBMLCDSX]
DelReg=DCR
AddReg=IBMLCDSX.AddReg, 1280, DPMS

[IBMLCDEX]
DelReg=DCR
AddReg=IBMLCDEX.AddReg, 1400, DPMS

[IBM2126.Install]
DelReg=DCR
AddReg=IBM2126.AddReg, 1280, DPMS

[IBM9900]
DelReg=DCR
AddReg=IBM9900.AddReg, 1024, DPMS

[IBM2127.Install]
DelReg=DCR
AddReg=IBM2127.AddReg, 1280, DPMS

[IBM9901]
DelReg=DCR
AddReg=IBM9901.AddReg, 1024, DPMS

[IBM2131.install]
DelReg=DCR
AddReg=IBM2131.AddReg, 1280, DPMS

[IBM2132.install]
DelReg=DCR
AddReg=IBM2132.AddReg, 1280, DPMS

[IBM6312]
DelReg=DCR
AddReg=IBM6312.AddReg, 1024

[IBM6314]
DelReg=DCR
AddReg=IBM6314.AddReg, 1024

[IBM6315]
DelReg=DCR
AddReg=IBM6315.AddReg, 1024, DPMS

[IBM6317]
DelReg=DCR
AddReg=IBM6317.AddReg, 1280

[IBM6319]
DelReg=DCR
AddReg=IBM6319.AddReg, 1024

[IBM6321]
DelReg=DCR
AddReg=IBM6321.AddReg, 1024

[IBM6322]
DelReg=DCR
AddReg=IBM6322.AddReg, 1024, DPMS

[IBM6324]
DelReg=DCR
AddReg=IBM6324.AddReg, 1024, DPMS

[IBM6327]
DelReg=DCR
AddReg=IBM6327.AddReg, 1280, DPMS

[IBM7234.Install]
DelReg=DCR
AddReg=IBM7234.AddReg, 1024, DPMS

[IBM7254.Install]
DelReg=DCR
AddReg=IBM7254.AddReg, 1024, DPMS

[IBM8504]
DelReg=DCR
AddReg=IBM8504.AddReg, 640

[IBM8511]
DelReg=DCR
AddReg=IBM8511.AddReg, 640

[IBM8512]
DelReg=DCR
AddReg=IBM8512.AddReg, 640

[IBM8513]
DelReg=DCR
AddReg=IBM8513.AddReg, 640

[IBM8514]
DelReg=DCR
AddReg=IBM8514.AddReg, 1024

[IBM8515]
DelReg=DCR
AddReg=IBM8515.AddReg, 1024

[IBM8517]
DelReg=DCR
AddReg=IBM8517.AddReg, 1024

[IBM8518]
DelReg=DCR
AddReg=IBM8518.AddReg, 640

[IBM9504]
DelReg=DCR
AddReg=IBM9504.AddReg, 1600B

[IBM9515]
DelReg=DCR
AddReg=IBM9515.AddReg, 1024

[IBM9517]
DelReg=DCR
AddReg=IBM9517.AddReg, 1360

[IBM9518]
DelReg=DCR
AddReg=IBM9518.AddReg, 640

[IBM9521]
DelReg=DCR
AddReg=IBM9521.AddReg, 1600, DPMS

[IBM9524]
DelReg=DCR
AddReg=IBM9524.AddReg, 1024, DPMS

[IBM9525]
DelReg=DCR
AddReg=IBM9525.AddReg, 1024, DPMS

[IBM9527]
DelReg=DCR
AddReg=IBM9527.AddReg, 1360, DPMS

; -------------- ICL
[ICL-EP211v]
DelReg=DCR
AddReg=ICL-EP211v.AddReg, 1600, DPMS

[ICL-EP171p]
DelReg=DCR
AddReg=ICL-EP171p.AddReg, 1280, DPMS

[ICL-EP171v]
DelReg=DCR
AddReg=ICL-EP171v.AddReg, 1280, DPMS

[ICL-EP151p]
DelReg=DCR
AddReg=ICL-EP151p.AddReg, 1280, DPMS

[ICL-EP151pAB]
DelReg=DCR
AddReg=ICL-EP151pAB.AddReg, 1280, DPMS

[ICL-EP151v]
DelReg=DCR
AddReg=ICL-EP151v.AddReg, 1280, DPMS

[ICL-EP141v]
DelReg=DCR
AddReg=ICL-EP141v.AddReg, 1024, DPMS

[ICL-EP141p]
DelReg=DCR
AddReg=ICL-EP141p.AddReg, 1024, DPMS

[ICL-EP152v]
DelReg=DCR
AddReg=ICL-EP152v.AddReg, 1280, DPMS

[ICL-EP142v]
DelReg=DCR
AddReg=ICL-EP142v.AddReg, 1024, DPMS

[ICL-EPe153]
DelReg=DCR
AddReg=ICL-EPe153.AddReg, 1280, DPMS

[ICL-EPx173]
DelReg=DCR
AddReg=ICL-EPx173.AddReg, 1280, DPMS

[ICL-EPx173a]
DelReg=DCR
AddReg=ICL-EPx173a.AddReg, 1280, DPMS

[ICL-EPx152]
DelReg=DCR
AddReg=ICL-EPx152.AddReg, 1024, DPMS

[ICL-EPe173]
DelReg=DCR
AddReg=ICL-EPe173.AddReg, 1280, DPMS

[ICL-EPx153]
DelReg=DCR
AddReg=ICL-EPx153.AddReg, 1280, DPMS

[ICL-EPe154]
DelReg=DCR
AddReg=ICL-EPe154.AddReg, 1024, DPMS

[ICL-EPe174]
DelReg=DCR
AddReg=ICL-EPe174.AddReg, 1280, DPMS

[ICL-EPx174]
DelReg=DCR
AddReg=ICL-EPx174.AddReg, 1600, DPMS

[ICL-e175]
DelReg=DCR
AddReg=ICL-e175.AddReg, 1280, DPMS

[ICL-e213]
DelReg=DCR
AddReg=ICL-e213.AddReg, 1600, DPMS

[ICL-x191.Install]
DelReg=DCR
AddReg=ICL-x191.AddReg, 1600, DPMS

[ICL-x154]
DelReg=DCR
AddReg=ICL-x154.AddReg, 1280, DPMS

[ICL-e176]
DelReg=DCR
AddReg=ICL-e176.AddReg, 1280, DPMS

; -------------- Iiyama
[MF-8615F-8515E2-8515F.Ins]
DelReg=DCR
AddReg=MF-8615F-8515E2-8515F.reg, 1280, DPMS

[s500m.install]
DelReg=DCR
AddReg=s500m.AddReg, 1280, DPMS

[LP-1013.Ins]
DelReg=DCR
AddReg=LP-1013.reg, 1024, DPMS

[mf8515g.Install]
DelReg=DCR
AddReg=mf8515g.AddReg, 1280, DPMS

[mf8617e.Install]
DelReg=DCR
AddReg=mf8617e.AddReg, 1600, DPMS

[s701gt.Install]
DelReg=DCR
AddReg=s701gt.AddReg, 1600, DPMS

[s702gt.Install]
DelReg=DCR
AddReg=s702gt.AddReg, 1600, DPMS

[a701gt.Install]
DelReg=DCR
AddReg=a701gt.AddReg, 1600, DPMS

[mt9017et.Install]
DelReg=DCR
AddReg=mt9017et.AddReg, 1600, DPMS

[a702h.Install]
DelReg=DCR
AddReg=a702h.AddReg, 1600, DPMS

[s703h.Install]
DelReg=DCR
AddReg=s703h.AddReg, 1600, DPMS

[s704h.Install]
DelReg=DCR
AddReg=s704h.AddReg, 1600, DPMS

[s705m.Install]
DelReg=DCR
AddReg=s705m.AddReg, 1600, DPMS

[a705m.Install]
DelReg=DCR
AddReg=a705m.AddReg, 1600, DPMS

[s700j.Install]
DelReg=DCR
AddReg=s700j.AddReg, 1280, DPMS

[s901gt.Install]
DelReg=DCR
AddReg=s901gt.AddReg, 1600, DPMS

[a901h.Install]
DelReg=DCR
AddReg=a901h.AddReg, 1920, DPMS

[s902j.Install]
DelReg=DCR
AddReg=s902j.AddReg, 1920, DPMS

[a902m.install]
DelReg=DCR
AddReg=a902m.AddReg, 1920, DPMS

[f901u.install]
DelReg=DCR
AddReg=f901u.AddReg, 1920, DPMS

[a901u.install]
DelReg=DCR
AddReg=a901u.AddReg, 1920, DPMS

[mf8221e.Install]
DelReg=DCR
AddReg=mf8221e.AddReg, 1600, DPMS

[mf8721e.Install]
DelReg=DCR
AddReg=mf8721e.AddReg, 1600, DPMS

[mt9221.Install]
DelReg=DCR
AddReg=mt9221.AddReg, 1600, DPMS

[s101gt.Install]
DelReg=DCR
AddReg=s101gt.AddReg, 1600, DPMS

[a101gt.Install]
DelReg=DCR
AddReg=a101gt.AddReg, 1600, DPMS

[s102g.Install]
DelReg=DCR
AddReg=s102g.AddReg, 1600, DPMS

[a102gt.Install]
DelReg=DCR
AddReg=a102gt.AddReg, 1600, DPMS

[mf9021e.Install]
DelReg=DCR
AddReg=mf9021e.AddReg, 1600, DPMS

[a201h.Install]
DelReg=DCR
AddReg=a201h.AddReg, 2048, DPMS

[s104m.Install]
DelReg=DCR
AddReg=s104m.AddReg, 1600, DPMS

[TXA3601GT.Install]
DelReg=DCR
AddReg=TXA3601GT.AddReg, 1024, DPMS

[txa3602g.Install]
DelReg=DCR
AddReg=txa3602g.AddReg, 1024, DPMS

[txa3611g.Install]
DelReg=DCR
AddReg=txa3611g.AddReg, 1024, DPMS

[a612j.Install]
DelReg=DCR
AddReg=a612j.AddReg, 1024, DPMS

[txa3811.Install]
DelReg=DCR
AddReg=txa3811.AddReg, 1024, DPMS

[a3832h.Install]
DelReg=DCR
AddReg=a3832h.AddReg, 1024, DPMS

[a812j.Install]
DelReg=DCR
AddReg=a812j.AddReg, 1024, DPMS

[a833j.Install]
DelReg=DCR
AddReg=a833j.AddReg, 1024, DPMS

[a3813m.Install]
DelReg=DCR
AddReg=a3813m.AddReg, 1024, DPMS

[tsa3931h.Install]
DelReg=DCR
AddReg=tsa3931h.AddReg, 1280, DPMS

[a3921u.Install]
DelReg=DCR
AddReg=a3921u.AddReg, 1280, DPMS

[a463x.Install]
DelReg=DCR
AddReg=a463x.AddReg, 1280, DPMS

; -------------- IODATA
[LCD-A18H.Install]
DelReg=DCR
AddReg=LCD-A18H.AddReg, 1280, DPMS

[LCD-IODATA.Install]
DelReg=DCR
AddReg=LCD-IODATA.AddReg, 1024, DPMS

[LCD-DV141H.Install]
DelReg=DCR
AddReg=LCD-DV141H.AddReg, 1024, DPMS

[LCD-A15H.Install]
DelReg=DCR
AddReg=LCD-A15H.AddReg, 1024, DPMS

[LCD-DV15H.Install]
DelReg=DCR
AddReg=LCD-DV15H.AddReg, 1024, DPMS

; -------------- Korea_Data_Systems
[VS-4.install]
DelReg=DCR
AddReg=VS-4.AddReg, 1024, DPMS

[VS-4D.install]
DelReg=DCR
AddReg=VS-4D.AddReg, 1024, DPMS

[VS-5.install]
DelReg=DCR
AddReg=VS-5.AddReg, 1280, DPMS

[VS-55.install]
DelReg=DCR
AddReg=VS-55.AddReg, 1024, DPMS

[VS-7.install]
DelReg=DCR
AddReg=VS-7.AddReg, 1280, DPMS

[VS-9.install]
DelReg=DCR
AddReg=VS-9.AddReg, 1600, DPMS

[VS-19.install]
DelReg=DCR
AddReg=VS-19.AddReg, 1600, DPMS

[VS-21.install]
DelReg=DCR
AddReg=VS-21.AddReg, 1600, DPMS

[AV-5T.install]
DelReg=DCR
AddReg=AV-5T.AddReg, 1280, DPMS

[VS-5e.install]
DelReg=DCR
AddReg=VS-5e.AddReg, 1280, DPMS

[AV-7T.install]
DelReg=DCR
AddReg=AV-7T.AddReg, 1280, DPMS

[VS-7e.install]
DelReg=DCR
AddReg=VS-7e.AddReg, 1280, DPMS

[VS7I.Install]
DelReg=DCR
AddReg=VS7I.AddReg, 1280, DPMS

[AV7TF.Install]
DelReg=DCR
AddReg=AV7TF.AddReg, 1280, DPMS

[VS8I.Install]
DelReg=DCR
AddReg=VS8I.AddReg, 1600, DPMS

[AV-9T.install]
DelReg=DCR
AddReg=AV-9T.AddReg, 1600, DPMS

[VS-9e.install]
DelReg=DCR
AddReg=VS-9e.AddReg, 1600, DPMS

[AV9TF.Install]
DelReg=DCR
AddReg=AV9TF.AddReg, 1600, DPMS

[VS-195.install]
DelReg=DCR
AddReg=VS-195.AddReg, 1600, DPMS

[VS-19SN.install]
DelReg=DCR
AddReg=VS-19SN.AddReg, 1600, DPMS

[AV-195T.install]
DelReg=DCR
AddReg=AV-195T.AddReg, 1600, DPMS

[VS195E.Install]
DelReg=DCR
AddReg=VS195E.AddReg, 1600, DPMS

[VS190I.Install]
DelReg=DCR
AddReg=VS190I.AddReg, 1600, DPMS

[VS195I.Install]
DelReg=DCR
AddReg=VS195I.AddReg, 1600, DPMS

[AV195TF.Install]
DelReg=DCR
AddReg=AV195TF.AddReg, 1920B, DPMS

[VS-21e.install]
DelReg=DCR
AddReg=VS-21e.AddReg, 1600, DPMS

[AV21TF.Install]
DelReg=DCR
AddReg=AV21TF.AddReg, 2048, DPMS


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

[1360]
HKR,,MaxResolution,,"1360,1024"

[1400]
HKR,,MaxResolution,,"1400,1050"

[1600]
HKR,,MaxResolution,,"1600,1200"

[1600B]
HKR,,MaxResolution,,"1600,1280"

[1920]
HKR,,MaxResolution,,"1920,1200"

[1920B]
HKR,,MaxResolution,,"1920,1440"

[2048]
HKR,,MaxResolution,,"2048,1536"

[640]
HKR,,MaxResolution,,"640,480"

[800]
HKR,,MaxResolution,,"800,600"

[DPMS]
HKR,,DPMS,,1


;-------------------------------------------------
; Model AddReg sections

; -------------- IBM
[IBM_2116.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[IBM_2128.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[IBM_2235.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[IBM_2237.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[IBMLCDV.AddReg]
HKR,"MODES\640,480",Mode1,,"60.0,60.0,-,-"

[IBMLCDS.AddReg]
HKR,"MODES\800,600",Mode1,,"60.0,60,+,+"

[IBMLCDX.AddReg]
HKR,"MODES\1024,768",Mode1,,"60.0,60,+,+"

[IBM_6540.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-50.0,55.0-100.0,+,+"

[IBM_6541.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,55.0-100.0,+,+"

[IBMG41.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-58.5,50.0-95.0,+,+"

[IBMG50.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-58.5,50.0-95.0,+,+"

[IBMG70.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-64.0,50.0-105.0,+,+"

[IBMG200.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-82.0,50.0-120.0,+,+"

[IBM6546.AddReg]
HKR,"MODES\1024,768",Mode1,,"30-69,50-160,-,-"

[IBM6547.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30-69,50-160,-,-"

[IBM_6549.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[IBMP50.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[IBMP70.AddReg]
HKR,"MODES\1280,1024",Mode1,,"29.0-82.0,50.0-120.0,+,+"

[IBMP200.AddReg]
HKR,"MODES\1600,1200",Mode1,,"29.0-90.0,50.0-120.0,+,+"

[IBM_6556.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-150.0,+,+"

[IBM_6557.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-94.0,50.0-160.0,+,+"

[IBM_6558.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-160.0,+,+"

[IBM7095.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[IBM7097.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[IBM2112.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-38.0,50.0-80.0,+,+"

[IBM2113.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-38.0,50.0-80.0,+,+"

[IBM2114.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-62.0,50.0-120.0,+,+"

[IBM2115.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-62.0,50.0-120.0,+,+"

[IBM2117.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-65.0,50.0-120.0,+,+"

[IBM2215.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-64.0,50.0-120.0,+,+"

[IBM2122.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[IBM2236.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[IBM2238.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-38.0,50.0-80.0,+,+"

[IBM2248.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-48.0,50.0-100.0,+,+"

[IBM2264.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-64.0,50.0-120.0,+,+"

[IBM2124.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[IBM_9513.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-61.0,56.0-75.0,+,+"

[IBM_9514.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-65.0,55.0-75.0,+,+"

[IBM9525-0X1.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-110.0,+,+"

[IBMLCDSX.AddReg]
HKR,"MODES\1280,1024",Mode1,,"60.0,60,+,+"

[IBMLCDEX.AddReg]
HKR,"MODES\1400,1050",Mode1,,"60.0,60,+,+"

[IBM2126.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-110.0,+,+"

[IBM9900.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[IBM2127.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-72.0,50.0-120.0,+,+"

[IBM9901.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-120.0,+,+"

[IBM2131.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[IBM2132.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-72.0,50.0-120.0,+,+"

[IBM6312.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-50.0,47.0-100.0,+,+"

[IBM6314.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-60.0,50.0-120.0,+,+"

[IBM6315.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-48.5,50.0-90.0,+,+"

[IBM6317.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-110.0,+,+"

[IBM6319.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-60.0,50.0-120.0,+,+"

[IBM6321.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-38.0,56.0-72.0,+,+"

[IBM6322.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-48.5,50.0-90.0,+,+"

[IBM6324.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-110.0,+,+"

[IBM6327.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-130.0,+,+"

[IBM7234.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,+"

[IBM7254.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-110.0,+,+"

[IBM8504.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,60.0-70.0,-,-"

[IBM8511.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,50.0-70.0,-,-"

[IBM8512.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,60.0-70.0,-,-"

[IBM8513.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,60.0-70.0,+,+"

[IBM8514.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5,60.0-70.0,+,+"

[IBM8515.AddReg]
HKR,"MODES\1024,768",Mode1,,"35.5,60.0-87.0,+,+"

[IBM8517.AddReg]
HKR,"MODES\1024,768",Mode1,,"35.5,60.0-87.0,+,+"

[IBM8518.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,60.0-70.0,-,-"

[IBM9504.AddReg]
HKR,"MODES\1600,1280",Mode1,,"101.66,77.1,+,+"

[IBM9515.AddReg]
HKR,"MODES\1024,768",Mode1,,"61.1,50.0-90.0,+,+"

[IBM9517.AddReg]
HKR,"MODES\1360,1024",Mode1,,"59,50.0-90.0,+,+"

[IBM9518.AddReg]
HKR,"MODES\640,480",Mode1,,"39.4,50.0-90.0,+,+"

[IBM9521.AddReg]
HKR,"MODES\1152,864",Mode1,,"30.0-82.0,50.0-110.0,+,+"
HKR,"MODES\1280,1024",Mode1,,"30.0-68.0,50.0-110.0,+,+"
HKR,"MODES\1600,1200",Mode1,,"30.0-68.0,50.0-110.0,+,+"

[IBM9524.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-110.0,+,+"

[IBM9525.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-64.0,50.0-110.0,+,+"

[IBM9527.AddReg]
HKR,"MODES\1360,1024",Mode1,,"30.0-82.0,50.0-110.0,+,+"

; -------------- ICL
[ICL-EP211v.AddReg]
HKR,"MODES\1600,1200",Mode1,,"24.0-82.0,50.0-120.0,+,+"

[ICL-EP171p.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-82.0,50.0-110.0,+,+"

[ICL-EP171v.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[ICL-EP151p.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,48.0-100.0,+,+"

[ICL-EP151pAB.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,48.0-100.0,+,+"

[ICL-EP151v.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[ICL-EP141v.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,58.0-72.0,+,+"
HKR,"MODES\800,600",Mode1,,"35.2,56,-,-"
HKR,"MODES\1024,768",Mode1,,"35.5,87,+,+"
HKR,"MODES\800,600",Mode4,,"37.9,58.0-75.0,+,+"

[ICL-EP141p.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,50.0-90.0,+,+"
HKR,"MODES\1024,768",Mode1,,"34.2-36.2,50.0-90.0,+,+"
HKR,"MODES\800,600",Mode1,,"36.8-38.8,50.0-90.0,+,+"
HKR,"MODES\1024,768",Mode4,,"47.0-49.0,50.0-90.0,+,+"

[ICL-EP152v.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-64.0,50.0-100.0,+,+"

[ICL-EP142v.AddReg]
HKR,"MODES\640,480",Mode1,,"31.5,58.0-72.0,+,+"
HKR,"MODES\800,600",Mode1,,"35.2,56,-,-"
HKR,"MODES\1024,768",Mode1,,"35.5,87,+,+"
HKR,"MODES\800,600",Mode4,,"37.9,58.0-75.0,+,+"

[ICL-EPe153.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-66.0,50.0-100.0,+,+"

[ICL-EPx173.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-85.0,48.0-100.0,+,+"

[ICL-EPx173a.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-85.0,48.0-100.0,+,+"

[ICL-EPx152.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-65.0,50.0-100.0,-,-"

[ICL-EPe173.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-65.0,50.0-120.0,+,+"

[ICL-EPx153.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[ICL-EPe154.AddReg]
HKR,"MODES\1024,768",Mode1,,"30.0-54.0,50.0-100.0,+,+"

[ICL-EPe174.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-160.0,+,+"

[ICL-EPx174.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-92.0,50.0-150.0,+,+"

[ICL-e175.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-85.0,50.0-120.0,+,+"

[ICL-e213.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-107.0,50.0-150.0,+,+"

[ICL-x191.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-96.0,50.0-160.0,+,+"

[ICL-x154.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[ICL-e176.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

; -------------- Iiyama
[MF-8615F-8515E2-8515F.reg]
HKR,"MODES\1280,1024",Mode1,,"24.0-66.0,50.0-120.0,+,+"

[s500m.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-69.0,50.0-120.0,+,+"

[LP-1013.reg]
HKR,"MODES\1024,768",Mode1,,"31.5-60.3,55-75,+,+"

[mf8515g.AddReg]
HKR,"MODES\1280,1024",Mode1,,"27-69,50-160,+,+"

[mf8617e.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27-86,50-160,+,+"

[s701gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[s702gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[a701gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[mt9017et.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27-92,50-160,+,+"

[a702h.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[s703h.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[s704h.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[s705m.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-180.0,+,+"

[a705m.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-86.0,50.0-180.0,+,+"

[s700j.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[s901gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-102.0,50.0-160.0,+,+"

[a901h.AddReg]
HKR,"MODES\1920,1440",Mode1,,"27.0-115.0,50.0-160.0,+,+"

[s902j.AddReg]
HKR,"MODES\1920,1440",Mode1,,"27.0-115.0,50.0-160.0,+,+"

[a902m.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-115.0,50.0-180.0,+,+"

[f901u.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-96.0,50.0-180.0,+,+"

[a901u.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-96.0,50.0-180.0,+,+"

[mf8221e.AddReg]
HKR,"MODES\1600,1200",Mode1,,"24-94,50-160,+,+"

[mf8721e.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-110.0,50.0-160.0,+,+"

[mt9221.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-110.0,50.0-160.0,+,+"

[s101gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[a101gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-96.0,50.0-160.0,+,+"

[s102g.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-110.0,50.0-160.0,+,+"

[a102gt.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-110.0,50.0-160.0,+,+"

[mf9021e.AddReg]
HKR,"MODES\1600,1200",Mode1,,"24-94,50-160,+,+"

[a201h.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-130.0,50.0-160.0,+,+"

[s104m.AddReg]
HKR,"MODES\1600,1200",Mode1,,"27.0-110.0,50.0-160.0,+,+"

[TXA3601GT.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.5-60.0,56.0-75.0,+,+"

[txa3602g.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-60.0,56.0-75.0,+,+"

[txa3611g.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-60.0,56.0-75.0,+,+"

[a612j.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-60.0,56.0-75.0,+,+"

[txa3811.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-60.0,56.0-75.0,+,+"

[a3832h.AddReg]
HKR,"MODES\1024,768",Mode6,,"24.8-68.7,56.0-85.0,+,+"

[a812j.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-60.0,56.0-75.0,+,+"

[a833j.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-60.0,56.0-75.0,+,+"

[a3813m.AddReg]
HKR,"MODES\1024,768",Mode1,,"24.8-61.0,55.0-76.0,+,+"

[tsa3931h.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.8-80.0,56.0-85.0,+,+"

[a3921u.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.8-80.0,56.0-85.0,+,+"

[a463x.AddReg]
HKR,"MODES\1280,1024",Mode1,,"24.8-80.0,56.0-85.0,+,+"

; -------------- IODATA
[LCD-A18H.AddReg]
HKR,"MODES\1280,1024",Mode1,,"31.0-80.0,55.0-75.4,+,+"

[LCD-IODATA.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-75.0,+,+"

[LCD-DV141H.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-75.0,+,+"

[LCD-A15H.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-75.0,+,+"

[LCD-DV15H.AddReg]
HKR,"MODES\1024,768",Mode1,,"31.0-60.0,55.0-75.0,+,+"

; -------------- Korea_Data_Systems
[VS-4.AddReg]
HKR,"MODES\1024,768",Mode1,,"28.0-50.0,40.0-120.0,+,+"

[VS-4D.AddReg]
HKR,"MODES\1024,768",Mode1,,"28.0-55.0,40.0-120.0,+,+"

[VS-5.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[VS-55.AddReg]
HKR,"MODES\1024,768",Mode1,,"28.0-55.0,40.0-120.0,+,+"

[VS-7.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[VS-9.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-95.0,50.0-120.0,+,+"

[VS-19.AddReg]
HKR,"MODES\1600,1200",Mode1,,"31.0-95.0,50.0-120.0,+,+"

[VS-21.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-117.0,50.0-160.0,+,+"

[AV-5T.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[VS-5e.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[AV-7T.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-120.0,+,+"

[VS-7e.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-150.0,+,+"

[VS7I.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-71.0,50.0-160.0,+,+"

[AV7TF.AddReg]
HKR,"MODES\1280,1024",Mode1,,"30.0-70.0,50.0-160.0,+,+"

[VS8I.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-85.0,50.0-160.0,+,+"

[AV-9T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[VS-9e.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[AV9TF.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-98.0,50.0-160.0,+,+"

[VS-195.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-120.0,+,+"

[VS-19SN.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-120.0,+,+"

[AV-195T.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-95.0,50.0-160.0,+,+"

[VS195E.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-98.0,50.0-160.0,+,+"

[VS190I.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-98.0,50.0-160.0,+,+"

[VS195I.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-98.0,50.0-160.0,+,+"

[AV195TF.AddReg]
HKR,"MODES\1920,1440",Mode1,,"30.0-111.0,50.0-160.0,+,+"

[VS-21e.AddReg]
HKR,"MODES\1600,1200",Mode1,,"30.0-117.0,50.0-160.0,+,+"

[AV21TF.AddReg]
HKR,"MODES\2048,1536",Mode1,,"30.0-130.0,50.0-160.0,+,+"


;-------------------------------------------------
; User visible strings

[Strings]
MS="Microsoft"

IBM="IBM"
ICL="Fujitsu ICL"
Iiyama="Iiyama"
IODATA="I-O DATA DEVICE,INC."
String0="Korea Data Systems"

IBM_2116="IBM 2116 MM55 Multimedia"
IBM_2128="IBM 2128 MM75 Multimedia"
IBM_2235="IBM 2235 C50 "
IBM_2237="IBM 2237 C71 "
IBMLCDV="IBM ThinkPad 640x480 TFT LCD panel"
IBMLCDVD="IBM ThinkPad 640x480 DSTN/HPA LCD panel"
IBMLCDS="IBM ThinkPad 800x600 TFT LCD panel"
IBMLCDSD="IBM ThinkPad 800x600 DSTN/HPA LCD panel"
IBMLCDX="IBM ThinkPad 1024x768 TFT LCD panel"
IBM_6540="IBM 6540 G42 "
IBM_6541="IBM 6541 G51 "
IBMG41="IBM G41"
IBMG50="IBM G50"
IBMG70="IBM G70"
IBMG200="IBM G200"
IBM6546="IBM 6546"
IBM6547="IBM 6547"
IBM_6549="IBM 6549 G94 "
IBMP50="IBM P50"
IBMP70="IBM P70"
IBMP200="IBM P200"
IBM_6556="IBM 6556 P72 "
IBM_6557="IBM 6557 P92 "
IBM_6558="IBM 6558 P202 "
IBM7095="IBM 7095"
IBM7097="IBM 7097"
IBM2112="IBM 2112"
IBM2113="IBM 2113"
IBM2114="IBM 2114"
IBM2115="IBM 2115"
IBM2117="IBM 2117"
IBM2215="IBM 2215"
IBM2122="IBM 2122"
IBM2236="IBM 2236"
IBM2238="IBM 2238"
IBM2248="IBM 2248"
IBM2264="IBM 2264"
IBM2124="IBM 2124"
IBM_9513="IBM 9513 T55A TFT Monitor "
IBM_9514="IBM 9514-B TFT Panel "
IBM9525-0X1="IBM 9525-0X1"
IBMLCDXD="IBM ThinkPad 1024x768 DSTN/HPA LCD panel"
IBMLCDSX="IBM ThinkPad 1280x1024 TFT LCD panel"
IBMLCDEX="IBM ThinkPad 1400x1050 LCD panel"
IBM2126="IBM 2126"
IBM9900="IBM Aptiva 9900"
IBM2127="IBM 2127"
IBM9901="IBM Aptiva 9901"
IBM2131="IBM 2131"
IBM2132="IBM 2132"
IBM6312="IBM 6312"
IBM6314="IBM 6314"
IBM6315="IBM 6315"
IBM6317="IBM 6317"
IBM6319="IBM 6319"
IBM6321="IBM 6321"
IBM6322="IBM 6322"
IBM6324="IBM 6324"
IBM6325="IBM 6325"
IBM6327="IBM 6327"
IBM7234="IBM 2122-xxL"
IBM7254="IBM 2124-xxL"
IBM8504="IBM 8504"
IBM8511="IBM 8511"
IBM8512="IBM 8512"
IBM8513="IBM 8513"
IBM8514="IBM 8514"
IBM8515="IBM 8515"
IBM8517="IBM 8517"
IBM8518="IBM 8518"
IBM9504="IBM 9504"
IBM9515="IBM 9515"
IBM9517="IBM 9517"
IBM9518="IBM 9518"
IBM9521="IBM 9521"
IBM9524="IBM 9524"
IBM9525="IBM 9525"
IBM9527="IBM 9527"

ICL-EP211v="Fujitsu ICL ErgoPro 211v"
ICL-EP171p="Fujitsu ICL ErgoPro 171p"
ICL-EP171v="Fujitsu ICL ErgoPro 171v"
ICL-EP151p="Fujitsu ICL ErgoPro 151p"
ICL-EP151pAB="Fujitsu ICL ErgoPro 151p AutoBrite"
ICL-EP151v="Fujitsu ICL ErgoPro 151v"
ICL-EP141v="Fujitsu ICL ErgoPro 141v"
ICL-EP141p="Fujitsu ICL ErgoPro 141p"
ICL-EP152v="Fujitsu ICL ErgoPro 152v"
ICL-EP142v="Fujitsu ICL ErgoPro 142v"
ICL-EPe153="Fujitsu ICL ErgoPro e153"
ICL-EPx173="Fujitsu ICL ErgoPro x173"
ICL-EPx173a="Fujitsu ICL ErgoPro x173a"
ICL-EPx152="Fujitsu ICL ErgoPro x152"
ICL-EPe173="Fujitsu ICL ErgoPro e173"
ICL-EPx153="Fujitsu ErgoPro x153"
ICL-EPe154="Fujitsu ErgoPro e154"
ICL-EPe174="Fujitsu ErgoPro e174"
ICL-EPx174="Fujitsu ErgoPro x174"
ICL-e175="FUJITSU e175"
ICL-e213="FUJITSU e213"
ICL-x191="Fujitsu x191"
ICL-x154="Fujitsu x154"
ICL-e176="Fujitsu e176"

MF-8615F-8515E2-8515F="MF-8615F,8515EII,8515F"
s500m="Iiyama S500M1"
LP-1013="LP-1013"
mf8515g="Iiyama MF-8515G VisionMaster"
mf8617et="Iiyama MF-8617E/T VisionMaster"
mf8617es="Iiyama MF-8617ES VisionMaster"
s701gt="Iiyama S701GT VisionMaster 400"
s702gt="Iiyama S702GT VisionMaster 400"
a701gt="Iiyama A701GT VisionMasterPro 400"
mt9017et="Iiyama MT-9017E/T VisionMasterPro"
a702h="Iiyama A702HT VisionMaster Pro 410"
s703h="Iiyama S703HT VisionMaster 403"
s704h="Iiyama S704HT VisionMaster 404"
s705m="Iiyama S705MT VisionMaster 405"
a705m="Iiyama A705MT VisionMaster Pro 411 /i70A"
s700j="Iiyama S700JT1"
s901gt="Iiyama S901GT VisionMaster 450"
a901h="Iiyama A901HT VisionMaster Pro 450"
s902j="Iiyama S902JT VisionMaster Pro 451"
a902m="Iiyama A902MT VisionMaster Pro 451"
f901u="Iiyama MF901U VisionMaster 452"
a901u="Iiyama MA901U VisionMaster Pro 452"
mf8221e="Iiyama MF-8221E/T VisionMaster"
mf8721e="Iiyama MF-8721E VisionMaster"
mt9221="Iiyama MT-9221 VisionMasterPro"
s101gt="Iiyama S101GT VisionMaster 501"
a101gt="Iiyama A101GT VisionMasterPro 501"
s102g="Iiyama S102GT VisionMaster 502"
a102gt="Iiyama A102GT VisionMasterPro 502"
mf9021e="Iiyama MT-9021E/T VisionMasterPro"
s103m="Iiyama S103MT VisionMaster 503"
a201h="Iiyama A201HT VisionMaster Pro 510"
s104m="Iiyama S104MT VisionMaster 504"
TXA3601GT="Iiyama TXA3601GT"
txa3602g="Iiyama TXA3602GT Prolite36"
txa3611g="Iiyama TXA3611/3621HT Prolite36"
a612j="Iiyama TXA3612JT Prolite36c"
txa3811="Iiyama TXA3811/3821HT Prolite38"
a3832h="Iiyama TXA3832HT Prolite38c"
a812j="Iiyama TXA3812JT/3822JT Prolite38e/38f"
a833j="Iiyama TXA3833JT Prolite38g"
a3813m="Iiyama TXA3813/3823MT"
tsa3931h="Iiyama TSA3931HT Prolite39"
a3921u="Iiyama AS3921U"
a4632h="Iiyama TSA4632HT Prolite46"
a4633j="Iiyama TSA4633JT Prolite46b"
a4634j="Iiyama TSA4634JT"
a4635u="Iiyama AS4635U "

LCD-A18H="I-O DATA LCD-A18H"
LCD-A141H="I-O DATA LCD-A141H"
LCD-DV141H="I-O DATA LCD-DV141H"
LCD-A15H="I-O DATA LCD-A15H"
LCD-DV15H="I-O DATA LCD-DV15H"

VS-4="Korea Data Systems Visual Sensation VS-4(KD-1452)"
VS-4D="Korea Data Systems Visual Sensation VS-4D"
VS-5="Korea Data Systems Visual Sensation VS-5/VS-51/VSx-5"
VS-55="Korea Data Systems Visual Sensation VS-55"
VS-7="Korea Data Systems Visual Sensation VS-7/VSx-7"
VS-9="Korea Data Systems Visual Sensation VS-9"
VS-19="Korea Data Systems Visual Sensation VS-19"
VS-21="Korea Data Systems Visual Sensation VS-21"
AV-5T="Korea Data Systems Avitron AV-5T"
VS-5e="Korea Data Systems Visual Sensations VS-5e"
AV-7T="Korea Data Systems Avitron AV-7T"
VS-7e="Korea Data Systems Visual Sensations VS-7e"
VS7I="Korea Data Systems Visual Sensations VS-7i"
AV7TF="Avitron AV-7TF"
VS8I="Korea Data Systems Visual Sensations VS-8i"
AV-9T="Korea Data Systems Avitron AV-9T"
VS-9e="Korea Data Systems Visual Sensations VS-9e"
AV9TF="Korea Data Systems Avitron AV-9TF"
VS-195="Korea Data Systems Visual Sensation VS-195"
VS-19SN="Korea Data Systems Visual Sensation VS-19SN"
AV-195T="Korea Data Systems Avitron AV-195T"
VS195E="Korea Data Systems Visual Sensations VS-195e"
VS190I="KDS Visual Sensations VS-190i"
VS195I="KDS Visual Sensations VS-195i"
AV195TF="Korea Data Systems Avitron AV-195TF"
VS-21e="Korea Data Systems Visual Sensations VS-21e"
AV21TF="Korea Data Systems Avitron AV-21TF"

