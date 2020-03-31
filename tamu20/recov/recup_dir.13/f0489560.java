]
Addreg=HIDClassReg

[HIDClassReg]
HKR,,,,%HID.ClassName%
HKR,,Icon,,-24
HKR,,NoInstallClass,,1

[ClassInstall32]
Addreg=HIDClassReg

[Manufacturer]
; Keyboards
;
%MSMfg%=MICROSOFT_KBD,NTamd64
%ALPSMfg%=ALPS_KBD,NTamd64
%CherryMfg%=CHERRY_KBD,NTamd64
%FujitsuMfg%=FUJITSU_KBD,NTamd64
%KeytronicMfg%=KEYTRONIC_KBD,NTamd64
%PhilipsMfg%=PHILIPS_KBD,NTamd64
%SilitekMfg%=SILITEK_KBD,NTamd64
%NMBMfg%=NMB_KBD,NTamd64
%STSLMfg%=STSL_KBD,NTamd64
%AcerMfg%=ACER_KBD,NTamd64
%ChiconyMfg%=CHICONY_KBD,NTamd64
%BTCMfg%=BTC_KBD,NTamd64
%FOCUSMfg%=FOCUS_KBD,NTamd64
%JingMoldMfg%=JINGMOLD_KBD,NTamd64
%MaxiSwitchMfg%=MAXISWITCH_KBD,NTamd64
%MontereyMfg%=MONTEREY_KBD,NTamd64
%OrtekMfg%=ORTEK_KBD,NTamd64
%SamsungMfg%=SAMSUNG_KBD,NTamd64
%ForwardMfg%=FORWARD_KBD,NTamd64
%SUHMfg%=SUH_KBD,NTamd64
%SejinMfg%=SEJIN_KBD,NTamd64
%SUPERGATEMfg%=SUPERGATE_KBD,NTamd64
%SolidYearMfg%=SOLIDYEAR_KBD,NTamd64
%NECMfg%=NEC_KBD,NTamd64
%QtronixMfg%=QTRONIX_KBD,NTamd64

; Mice
;
%MSMfg%   =MSMice,NTamd64               ; Microsoft
%LogiMfg% =LogiMice,NTamd64             ; Logitech
%CypressMfg% =CypressMice,NTamd64       ; Cypress
%ELOMfg%  =ELOMice,NTamd64              ; ELO Touchsystems
%ChiconyMfg% =ChiconyMice,NTamd64       ; Chicony
%NMBMfg%  =NMBMice,NTamd64              ; NMB
%STSLMfg%  =STSLMice,NTamd64            ; STSL
%SUPERGATEMfg%  =SUPERGATEMice,NTamd64  ; SUPGERGATE
%BTCMfg%  =BTCMice,NTamd64
%FinePointMfg%=FinePoint,NTamd64
%FocusMfg%=FOCUSMice,NTamd64
%JingMoldMfg%=JINGMOLDMice,NTamd64
%MaxiSwitchMfg%=MAXISWITCHMice,NTamd64
%MontereyMfg%=MONTEREYMice,NTamd64
%OrtekMfg%=ORTEKMice,NTamd64
%KeytronicMfg%=KEYTRONICMice,NTamd64
%GeniusMfg%=GeniusMice,NTamd64
%ItacMfg% =ItacMice,NTamd64             ; Itac Systems
%SamsungMfg%=SamsungMice,NTamd64        ; Samsung
%ForwardMfg%=ForwardMice,NTamd64        ; Forward
%SUHMfg%=SUHMice,NTamd64                ; SUH DART
%PhilipsMfg%=PhilipsMice,NTamd64        ; Philips
%AnchorMfg%=AnchorMice,NTamd64          ; Anchor
%SolidYearMfg%=SOLIDYEARMice,NTamd64    ; Solid Year
%NECMfg%=NECMice,NTamd64                ; NEC
%FujitsuMfg%=FUJITSUMice,NTamd64        ; Fujitsu
%SejinMfg%=SEJINMice,NTamd64            ; Sejin
%DexinMfg%=DexinMice,NTamd64            ; Dexin
%AcerMfg%=AcerMice,NTamd64              ; Acer
%SilitekMfg%=SilitekMice,NTamd64        ; Silitek
%QtronixMfg%=QtronixMice,NTamd64        ; Qtronix

; Game controllers
;
%MSMfg%=MicrosoftGame,NTamd64
%LogiMfg%=LogitechGame,NTamd64
%ThrustmasterMfg%=ThrustmasterGame,NTamd64
%GeniusMfg%=GeniusGame,NTamd64
%GuillemotMfg%=GuillemotGame,NTamd64
%StdMfg%=Standard,NTamd64

;  HID audio control devices
;
%MSMfg%=MicrosoftHid,NTamd64           ; Microsoft
%AltecMfg%=AltecAudio,NTamd64          ; Altec
%PhilipsMfg%=PhilipsAudio,NTamd64      ; Philips
%LabtecMfg%=LabtecAudio,NTamd64        ; Labtec
%NECMfg%=NECAudio,NTamd64              ; NEC
%YamahaMfg%=YamahaAudio,NTamd64        ; Yamaha

; HID monitor control devices
;
%CTXMfg%=CTXMonitor,NTamd64
%LiteOnMfg%=LiteOnMonitor,NTamd64
%MitsubishiMfg%=MitsubishiMonitor,NTamd64
%EIZOMfg%=EIZOMonitor,NTamd64
%NokiaMfg%=NokiaMonitor,NTamd64

; HID UPS devices
;
%APCMfg%=APC_UPS,NTamd64
%MGEMfg%=MGE_UPS,NTamd64

; Keyboards

[MICROSOFT_KBD.NTamd64]
%USB\VID_045E&PID_000B.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_000B
%USB\VID_045E&PID_001D&MI_00.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_001D&MI_00
%USB\VID_045E&PID_002B&MI_00.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_002B&MI_00
%USB\VID_045E&PID_002D&MI_00.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_002D&MI_00
%USB\VID_045E&PID_0048&MI_00.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0048&MI_00
%USB\VID_045E&PID_005C&MI_00.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_005C&MI_00
%IRBUS\VID_045E&PID_006D.DeviceDesc%=HIDIR_Inst, IRBUS\VID_045E&PID_006D
%IRBUS\HID.DeviceDesc%=HIDIR_Inst,,IRBUS\HID_DEVICE

[ALPS_KBD.NTamd64]
%USB\VID_0433&PID_ABAB.DeviceDesc%=HID_Inst,, USB\VID_0433&PID_ABAB
%USB\VID_044e&PID_1104.DeviceDesc%=HID_Inst,, USB\VID_044e&PID_1104

[CHERRY_KBD.NTamd64]
%USB\VID_046A&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_046A&PID_0001

[KEYTRONIC_KBD.NTamd64]
%USB\VID_03F9&PID_0100.DeviceDesc%=HID_Inst,, USB\VID_03F9&PID_0100
%USB\VID_03F9&PID_0101.DeviceDesc%=HID_Inst,, USB\VID_03F9&PID_0101
%USB\VID_03F9&PID_0102&MI_00.DeviceDesc%=HID_Inst,, USB\VID_03F9&PID_0102&MI_00

[PHILIPS_KBD.NTamd64]
%USB\VID_0471&PID_0601&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0471&PID_0601&MI_00
%USB\VID_0471&PID_0401.DeviceDesc%=HID_Inst,, USB\VID_0471&PID_0401
%USB\VID_0471&PID_0402&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0471&PID_0402&MI_00

[FUJITSU_KBD.NTamd64]
%USB\VID_0430&PID_0002&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0430&PID_0002&MI_00
%USB\VID_04c5&PID_1020&MI_00.DeviceDesc%=HID_Inst,, USB\VID_04c5&PID_1020&MI_00
%USB\VID_04c5&PID_1020&MI_01.DeviceDesc%=HID_Inst,, USB\VID_04c5&PID_1020&MI_01
%USB\VID_04c5&PID_1018.DeviceDesc%=HID_Inst,, USB\VID_04c5&PID_1018

[SILITEK_KBD.NTamd64]
%USB\VID_047B&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_047B&PID_0001
%USB\VID_047B&PID_0002&MI_00.DeviceDesc%=HID_Inst,, USB\VID_047B&PID_0002&MI_00

[NMB_KBD.NTamd64]
; %USB\VID_0446&PID_6782.DeviceDesc%=HID_Inst,, USB\VID_0446&PID_6782
%USB\VID_0446&PID_6781&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0446&PID_6781&MI_00

[STSL_KBD.NTamd64]
%USB\VID_05FA&PID_3302.DeviceDesc%=HID_Inst,, USB\VID_05FA&PID_3302
%USB\VID_05FA&PID_3301&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05FA&PID_3301&MI_00
%USB\VID_05FA&PID_3303&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05FA&PID_3303&MI_00

[ACER_KBD.NTamd64]
%USB\VID_04A5&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_04A5&PID_0001
%USB\VID_04A5&PID_0002.DeviceDesc%=HID_Inst,, USB\VID_04A5&PID_0002
%USB\VID_04A5&PID_0003&MI_00.DeviceDesc%=HID_Inst,, USB\VID_04A5&PID_0003&MI_00

[CHICONY_KBD.NTamd64]
%USB\VID_04F2&PID_0002.DeviceDesc%=HID_Inst,, USB\VID_04F2&PID_0002
%USB\VID_04F2&PID_0001&MI_00.DeviceDesc%=HID_Inst,, USB\VID_04F2&PID_0001&MI_00

[BTC_KBD.NTamd64]
%USB\VID_046E&PID_0100.DeviceDesc%=HID_Inst,, USB\VID_046E&PID_0100
%USB\VID_046E&PID_6782&MI_00.DeviceDesc%=HID_Inst,, USB\VID_046E&PID_6782&MI_00

[FOCUS_KBD.NTamd64]
%USB\VID_05B2&PID_6200.DeviceDesc%=HID_Inst,, USB\VID_05B2&PID_6200
%USB\VID_05B2&PID_7200&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05B2&PID_7200&MI_00

[JINGMOLD_KBD.NTamd64]
%USB\VID_05AF&PID_9167.DeviceDesc%=HID_Inst,, USB\VID_05AF&PID_9167
%USB\VID_05AF&PID_9267&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05AF&PID_9267&MI_00

[MAXISWITCH_KBD.NTamd64]
%USB\VID_04C3&PID_1101.DeviceDesc%=HID_Inst,, USB\VID_04C3&PID_1101
%USB\VID_04C3&PID_1102&MI_00.DeviceDesc%=HID_Inst,, USB\VID_04C3&PID_1102&MI_00
%USB\VID_04C3&PID_2101.DeviceDesc%=HID_Inst,, USB\VID_04C3&PID_2101
%USB\VID_04C3&PID_2102&MI_00.DeviceDesc%=HID_Inst,, USB\VID_04C3&PID_2102&MI_00

[MONTEREY_KBD.NTamd64]
%USB\VID_0566&PID_2800.DeviceDesc%=HID_Inst,, USB\VID_0566&PID_2800
%USB\VID_0566&PID_2801&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0566&PID_2801&MI_00

[SAMSUNG_KBD.NTamd64]
%USB\VID_055D&PID_6780.DeviceDesc%=HID_Inst,, USB\VID_055D&PID_6780
%USB\VID_055D&PID_6781&MI_00.DeviceDesc%=HID_Inst,, USB\VID_055D&PID_6781&MI_00
%USB\VID_055D&PID_0001.DeviceDesc%=HID_Inst,,USB\VID_055D&PID_0001

[FORWARD_KBD.NTamd64]
%USB\VID_05BC&PID_0002.DeviceDesc%=HID_Inst,, USB\VID_05BC&PID_0002
%USB\VID_05BC&PID_0001&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05BC&PID_0001&MI_00

[SUH_KBD.NTamd64]
%USB\VID_0500&PID_0002.DeviceDesc%=HID_Inst,, USB\VID_0500&PID_0002
%USB\VID_0500&PID_0001&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0500&PID_0001&MI_00

[SEJIN_KBD.NTamd64]
%USB\VID_0510&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_0510&PID_0001
%USB\VID_0510&PID_1000&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0510&PID_1000&MI_00

[SUPERGATE_KBD.NTamd64]
%USB\VID_05D5&PID_6782&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05D5&PID_6782&MI_00

[ORTEK_KBD.NTamd64]
%USB\VID_05A4&PID_9722.DeviceDesc%=HID_Inst,, USB\VID_05A4&PID_9722
%USB\VID_05A4&PID_9720&MI_00.DeviceDesc%=HID_Inst,, USB\VID_05A4&PID_9720&MI_00

[SOLIDYEAR_KBD.NTamd64]
%USB\VID_060B&PID_2101&MI_00.DeviceDesc%=HID_Inst,, USB\VID_060B&PID_2101&MI_00

[NEC_KBD.NTamd64]
%USB\VID_0409&PID_0014&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0014&MI_00
%USB\VID_0409&PID_0011&MI_00.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0011&MI_00
%USB\VID_0409&PID_0019.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0019
%USB\VID_0409&PID_001A.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_001A
%USB\VID_0409&PID_0025.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0025
%USB\VID_0409&PID_0034.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0034
%USB\VID_0409&PID_0094.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0094
%USB\VID_0409&PID_0095.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0095

[QTRONIX_KBD.NTamd64]
%USB\VID_05C7&PID_2001.DeviceDesc%=HID_Inst,, USB\VID_05C7&PID_2001
%USB\VID_05C7&PID_6001.DeviceDesc%=HID_Inst,, USB\VID_05C7&PID_6001

; Mice

[MSMice.NTamd64]
%USB\VID_045E&PID_0009.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0009
%USB\VID_045E&PID_001E.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_001E
%USB\VID_045E&PID_0023.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0023
%USB\VID_045E&PID_0024.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0024
%USB\VID_045E&PID_0025.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0025
%USB\VID_045E&PID_0029.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0029
%USB\VID_045E&PID_0039.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0039
%USB\VID_045E&PID_0040.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0040
%USB\VID_045E&PID_0047.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0047
%USB\VID_045E&PID_0059.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0059

[LogiMice.NTamd64]
%USB\VID_046D&PID_C000.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C000
%USB\VID_046D&PID_C001.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C001
%USB\VID_046D&PID_C002.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C002
%USB\VID_046D&PID_C003.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C003
%USB\VID_046D&PID_C004.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C004
%USB\VID_046D&PID_C005.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C005
%USB\VID_046D&PID_C00B.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C00B
%USB\VID_046D&PID_C00C.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C00C
%USB\VID_046D&PID_C00D.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C00D
%USB\VID_046D&PID_C00E.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C00E
%USB\VID_046D&PID_C030.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C030
%USB\VID_046D&PID_C031.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C031
%USB\VID_046D&PID_C032.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C032
%USB\VID_046D&PID_C033.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C033
%USB\VID_046D&PID_C401.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C401
%USB\VID_046D&PID_C402.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C402
%USB\VID_046D&PID_C403.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C403
%USB\VID_046D&PID_C501.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C501
%USB\VID_046D&PID_C502&MI_00.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C502&MI_00
%USB\VID_046D&PID_C502&MI_01.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C502&MI_01
%USB\VID_046D&PID_C503&MI_00.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C503&MI_00
%USB\VID_046D&PID_C503&MI_01.DeviceDesc%=HID_Inst, USB\VID_046D&PID_C503&MI_01

[CypressMice.NTamd64]
%USB\VID_04B4&PID_0001.DeviceDesc%=HID_SelSus_Inst,, USB\VID_04B4&PID_0001

[ELOMice.NTamd64]
%USB\VID_04E7&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_04E7&PID_0001

[ChiconyMice.NTamd64]
%USB\VID_04F2&PID_0001&MI_01.DeviceDesc%=HID_Inst,, USB\VID_04F2&PID_0001&MI_01

[NMBMice.NTamd64]
%USB\VID_0446&PID_6781&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0446&PID_6781&MI_01

[STSLMice.NTamd64]
%USB\VID_05FA&PID_3301&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05FA&PID_3301&MI_01
%USB\VID_05FA&PID_3303&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05FA&PID_3303&MI_01

[SUPERGATEMice.NTamd64]
%USB\VID_05d5&PID_6782&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05d5&PID_6782&MI_01

[KEYTRONICMice.NTamd64]
%USB\VID_03F9&PID_0102&MI_01.DeviceDesc%=HID_Inst,, USB\VID_03F9&PID_0102&MI_01

[GeniusMice.NTamd64]
%USB\VID_0458&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_0458&PID_0001
%USB\VID_0458&PID_0002.DeviceDesc%=HID_SelSus_Inst,, USB\VID_0458&PID_0002
%USB\VID_0458&PID_0003.DeviceDesc%=HID_Inst,, USB\VID_0458&PID_0003

[ItacMice.NTamd64]
%USB\VID_0431&PID_0100.DeviceDesc%=HID_SelSus_Inst,, USB\VID_0431&PID_0100

[SamsungMice.NTamd64]
%USB\VID_055D&PID_6781&MI_01.DeviceDesc%=HID_Inst,, USB\VID_055D&PID_6781&MI_01

[ForwardMice.NTamd64]
%USB\VID_05BC&PID_0001&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05BC&PID_0001&MI_01

[SUHMice.NTamd64]
%USB\VID_0500&PID_0001&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0500&PID_0001&MI_01

[BTCMice.NTamd64]
%USB\VID_046E&PID_6782&MI_01.DeviceDesc%=HID_Inst,, USB\VID_046E&PID_6782&MI_01

[FinePoint.NTamd64]
%USB\VID_0E8A&PID_0100.DeviceDesc%=HID_SelSus_Inst,, USB\VID_0E8A&PID_0100

[FOCUSMice.NTamd64]
%USB\VID_05B2&PID_7200&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05B2&PID_7200&MI_01

[JINGMOLDMice.NTamd64]
%USB\VID_05AF&PID_9267&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05AF&PID_9267&MI_01

[MAXISWITCHMice.NTamd64]
%USB\VID_04C3&PID_1102&MI_01.DeviceDesc%=HID_Inst,, USB\VID_04C3&PID_1102&MI_01
%USB\VID_04C3&PID_2102&MI_01.DeviceDesc%=HID_Inst,, USB\VID_04C3&PID_2102&MI_01

[MONTEREYMice.NTamd64]
%USB\VID_0566&PID_2801&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0566&PID_2801&MI_01

[ORTEKMice.NTamd64]
%USB\VID_05A4&PID_9720&MI_01.DeviceDesc%=HID_Inst,, USB\VID_05A4&PID_9720&MI_01

[PhilipsMice.NTamd64]
%USB\VID_0471&PID_0601&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0471&PID_0601&MI_01
%USB\VID_0471&PID_0402&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0471&PID_0402&MI_01

[AnchorMice.NTamd64]
%USB\VID_0605&PID_0001.DeviceDesc%=HID_Inst,, USB\VID_0605&PID_0001

[NECMice.NTamd64]
%USB\VID_0409&PID_0014&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0014&MI_01
%USB\VID_0409&PID_0011&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0409&PID_0011&MI_01

[SOLIDYEARMice.NTamd64]
%USB\VID_060B&PID_2101&MI_01.DeviceDesc%=HID_Inst,, USB\VID_060B&PID_2101&MI_01

[FUJITSUMice.NTamd64]
%USB\VID_0430&PID_0002&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0430&PID_0002&MI_01

[SEJINMice.NTamd64]
%USB\VID_0510&PID_E001.DeviceDesc%=HID_Inst,, USB\VID_0510&PID_E001
%USB\VID_0510&PID_1000&MI_01.DeviceDesc%=HID_Inst,, USB\VID_0510&PID_1000&MI_01

[DexinMice.NTamd64]
%USB\VID_05F2&PID_0010.DeviceDesc%=HID_Inst,, USB\VID_05F2&PID_0010

[AcerMice.NTamd64]
%USB\VID_04A5&PID_0003&MI_01.DeviceDesc%=HID_Inst,, USB\VID_04A5&PID_0003&MI_01

[SilitekMice.NTamd64]
%USB\VID_047B&PID_0002&MI_01.DeviceDesc%=HID_Inst,, USB\VID_047B&PID_0002&MI_01

[QtronixMice.NTamd64]
%USB\VID_05C7&PID_1001.DeviceDesc%=HID_SelSus_Inst,, USB\VID_05C7&PID_1001

; Game controllers

[LogitechGame.NTamd64]
%USB\VID_046D&PID_0200.DeviceDesc%=HID_Inst,, USB\VID_046d&PID_0200
%USB\VID_046D&PID_C201.DeviceDesc%=HID_Inst,, USB\VID_046D&PID_C201
%USB\VID_046D&PID_C202.DeviceDesc%=HID_Inst,, USB\VID_046D&PID_C202
%USB\VID_046D&PID_C207.DeviceDesc%=HID_Inst,, USB\VID_046D&PID_C207
%USB\VID_046D&PID_C208.DeviceDesc%=HID_Inst,, USB\VID_046D&PID_C208
%USB\VID_046D&PID_C209.DeviceDesc%=HID_Inst,, USB\VID_046D&PID_C209

[ThrustmasterGame.NTamd64]
%USB\VID_044F&PID_A0A0.DeviceDesc%=HID_Inst,,USB\VID_044F&PID_A0A0
%USB\VID_044F&PID_A0A1.DeviceDesc%=HID_Inst,,USB\VID_044F&PID_A0A1
%USB\VID_044F&PID_A201.DeviceDesc%=HID_Inst,,USB\VID_044F&PID_A201
%USB\VID_044F&PID_A01B.DeviceDesc%=HID_Inst,,USB\VID_044F&PID_A01B
%USB\VID_044F&PID_A003.DeviceDesc%=HID_Inst,,USB\VID_044F&PID_A003

[MicrosoftGame.NTamd64]
%USB\VID_045E&PID_0007.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0007
%USB\VID_045E&PID_0008.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0008
%USB\VID_045E&PID_000E.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_000E

[GeniusGame.NTamd64]
%USB\VID_0458&PID_1001.DeviceDesc%=HID_Inst,, USB\VID_0458&PID_1001
%USB\VID_0458&PID_1002.DeviceDesc%=HID_Inst,, USB\VID_0458&PID_1002

[GuillemotGame.NTamd64]
%USB\VID_06F8&PID_0002.DeviceDesc%=HID_Inst,, USB\VID_06F8&PID_0002

[Standard.NTamd64]
;
; Generic support (aka adding a friendly name only) for raw HID collections.
; No service added, no functionality added, just a name so that the
; device manager shows up nice a pretty like.
;
%HID_DEVICE_SYSTEM_GAME%=HID_Raw_Inst,, HID_DEVICE_SYSTEM_GAME
%HID_DEVICE%=HID_Raw_Inst,, HID_DEVICE

;
; Generic HID Interface (HidUsb as service)
;
%HID.DeviceDesc% = HID_Inst,,GENERIC_HID_DEVICE,USB\Class_03&SubClass_01,USB\Class_03

;
;  HID audio control devices
;
[MicrosoftHid.NTamd64]
%USB\VID_045E&PID_0014&MI_02.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0014&MI_02
%USB\VID_045E&PID_001D&MI_01.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_001D&MI_01
%USB\VID_045E&PID_002B&MI_01.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_002B&MI_01
%USB\VID_045E&PID_002D&MI_01.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_002D&MI_01
%USB\VID_045E&PID_0048&MI_01.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_0048&MI_01
%USB\VID_045E&PID_005C&MI_01.DeviceDesc%=HID_Inst,, USB\VID_045E&PID_005C&MI_01

[AltecAudio.NTamd64]
%USB\VID_04D2&PID_FF47&MI_02.DeviceDesc%=HID_Inst,,USB\VID_04D2&PID_FF47&MI_02
%USB\VID_04D2&PID_FF49&MI_02.DeviceDesc%=HID_Inst,,USB\VID_04D2&PID_FF49&MI_02
%USB\VID_04D2&PID_0070&MI_02.DeviceDesc%=HID_Inst,,USB\VID_04D2&PID_0070&MI_02

[PhilipsAudio.NTamd64]
%USB\VID_0471&PID_0101&MI_02.DeviceDesc%=HID_Inst,,USB\VID_0471&PID_0101&MI_02

[LabtecAudio.NTamd64]
%USB\VID_0672&PID_1041&MI_02.DeviceDesc%=HID_Inst,,USB\VID_0672&PID_1041&MI_02

[NECAudio.NTamd64]
%USB\VID_0409&PID_0203&MI_03.DeviceDesc%=HID_Inst,,USB\VID_0409&PID_0203&MI_03

[YamahaAudio.NTamd64]
%USB\VID_0499&PID_3001&MI_02.DeviceDesc%=HID_Inst,,USB\VID_0499&PID_3001&MI_02

;
; HID monitor control devices
;
[CTXMonitor.NTamd64]
%USB\VID_0698&PID_1786.DeviceDesc%=HID_Inst,,USB\VID_0698&PID_1786

[LiteOnMonitor.NTamd64]
%USB\VID_04CA&PID_1766.DeviceDesc%=HID_Inst,,USB\VID_04CA&PID_1766

[MitsubishiMonitor.NTamd64]
%USB\VID_0452&PID_0021.DeviceDesc%=HID_Inst,,USB\VID_0452&PID_0021

[NokiaMonitor.NTamd64]
%USB\VID_04A6&PID_0181.DeviceDesc%=HID_Inst,,USB\VID_04A6&PID_0181

;
; HID UPS devices
;
[APC_UPS.NTamd64]
%USB\VID_051D&PID_0000.DeviceDesc%=HID_Inst,,USB\VID_051D&PID_0000
%USB\VID_051D&PID_0001.DeviceDesc%=HID_Inst,,USB\VID_051D&PID_0001
%USB\VID_051D&PID_0002.DeviceDesc%=HID_Inst,,USB\VID_051D&PID_0002
%USB\VID_051D&PID_0003.DeviceDesc%=HID_Inst,,USB\VID_051D&PID_0003

[MGE_UPS.NTamd64]
%USB\VID_0463&PID_0001.DeviceDesc%=HID_Inst,,USB\VID_0463&PID_0001
%USB\VID_0463&PID_FFFF.DeviceDesc%=HID_Inst,,USB\VID_0463&PID_FFFF


;=====================================================================
[HID_SelSus_Inst.NT]
Needs = HID_Inst.NT

[HID_SelSus_Inst.NT.HW]
AddReg = HID_SelSus_Inst.AddReg.NT.HW

[HID_SelSus_Inst.AddReg.NT.HW]
HKR,,"SelectiveSuspendEnabled",0x00000001,0x1

[HID_SelSus_Inst.NT.Services]
AddService = HidUsb,%SPSVCINST_ASSOCSERVICE%,HID_Service_Inst

[HID_Inst.NT]
Copyfiles = HID_Inst.CopyFiles.NT, HID_Inst.CopyFilesDLL.NT

[HID_Inst.NT.HW]
DelReg = HID_Inst.DelReg.NT.HW

[HID_Inst.DelReg.NT.HW]
; remove the selective suspend enable flag in case it is present from a previous install
HKR,,"SelectiveSuspendEnabled"

[HID_Inst.CopyFiles.NT]
hidusb.sys
hidclass.sys
hidparse.sys

[HID_INST.CopyFilesDLL.NT]
hid.dll

[HID_Inst.NT.Services]
AddService = HidUsb,%SPSVCINST_ASSOCSERVICE%,HID_Service_Inst

[HIDIR_Inst.NT]
Copyfiles = HIDIR_Inst.CopyFiles.NT, HID_Inst.CopyFilesDLL.NT

[HIDIR_Inst.NT.HW]
Addreg=HIDIR_Inst.Addreg.NT.HW, HIDIR_Inst_DeviceID.Addreg.NT.HW

[HIDIR_Inst_DeviceID.Addreg.NT.HW]
HKR,,"VendorID",0x00010001,0x045e
HKR,,"ProductID",0x00010001,0x006d

[HIDIR_Inst.Addreg.NT.HW]
HKR,,"ReportLength",0x00010001,0x3           
HKR,,"ReportDescriptor",0x00000001,\
    \ ; MS Vendor controls
        0x06, 0xbc, 0xff,   \ ; Usage Page (Vendor 0xffbc),
        0x09, 0x88,         \ ; Usage (88),
        0xa1, 0x01,         \ ; Collection (Application),
        0x85, 0x01,         \ ;  Report Id (1)
        0x19, 0x01,         \ ;  Usage Minimum (0x01),
        0x29, 0xff,         \ ;  Usage Maximum (0xff),
        0x15, 0x01,         \ ;  Logical Minimum (1),
        0x25, 0xff,         \ ;  Logical Maximum(0xff),
        0x95, 0x01,         \ ;  Report Count (1),
        0x75, 0x08,         \ ;  Report Size (8),
        0x81, 0x00,         \ ;  Input (Data, Array), 
        0xC0,               \ ; End Collection
    \ ; Consumer Controls
        0x05,   0x0c,       \ ; Usage Page (Consumer Controls),
        0x09,   0x01,       \ ; Usage (Consumer Control),
        0xA1,   0x01,       \ ; Collection (Application),
        0x85,   0x02,       \ ;  Report Id (2)
        0x19,   0x00,       \ ;  Usage Minimum (0),
        0x2a,   0x3c, 0x02, \ ;  Usage Maximum (23c)  
        0x15,   0x00,       \ ;  Logical Minimum (0),
        0x26,   0x3c, 0x02, \ ;  Logical Maximum (23c)  
        0x95,   0x01,       \ ;  Report Count (1),
        0x75,   0x10,       \ ;  Report Size (16),
        0x81,   0x00,       \ ;  Input (Data, Array), 
        0xC0,               \ ; End Collection 
    \ ; Standby button
        0x05, 0x01,         \ ; Usage Page (Generic Desktop),
        0x09, 0x80,         \ ; Usage (System Control),
        0xa1, 0x01,         \ ; Collection (Application),
        0x85, 0x03,         \ ;  Report Id (3)
        0x19, 0x81,         \ ;  Usage Minimum (0x81),
        0x29, 0x83,         \ ;  Usage Maximum (0x83),
        0x25, 0x01,         \ ;  Logical Maximum(1),
        0x75, 0x01,         \ ;  Report Size (1),
        0x95, 0x03,         \ ;  Report Count (3),
        0x81, 0x02,         \ ;  Input
        0x95, 0x05,         \ ;  Report Count (5),
        0x81, 0x01,         \ ;  Input (Constant),
        0xc0,               \ ; End Collection
    \ ; Keyboard
        0x05,   0x01,       \ ; Usage Page (Generic Desktop),
        0x09,   0x06,       \ ; Usage (Keyboard),
        0xA1,   0x01,       \ ; Collection (Application),
        0x85,   0x04,       \ ;  Report Id (4)
        0x05,   0x07,       \ ;  usage page key codes
        0x19,   0xe0,       \ ;  usage min left control
        0x29,   0xe7,       \ ;  usage max keyboard right gui
        0x75,   0x01,       \ ;  report size 1
        0x95,   0x08,       \ ;  report count 8
        0x81,   0x02,       \ ;  input (Variable)
        0x19,   0x00,       \ ;  usage min 0
        0x29,   0x91,       \ ;  usage max 91
        0x26,   0xff, 0x00, \ ;  logical max 0xff
        0x75,   0x08,       \ ;  report size 8
        0x95,   0x01,       \ ;  report count 1
        0x81,   0x00,       \ ;  Input (Data, Array),
        0xc0                  ; End Collection
HKR,,"ReportMappingTable",0x00000001,\
     0x0a,0x18,0x00,0x00, 0x04,0x08,0x00,  \ ; Windows key when !eHome
     \
     0x01,0x04,0x0F,0x80, 0x04,0x00,0x1e,  \ ; 1
     0x02,0x04,0x0F,0x80, 0x04,0x00,0x1f,  \ ; 2
     0x03,0x04,0x0F,0x80, 0x04,0x00,0x20,  \ ; 3
     0x04,0x04,0x0F,0x80, 0x04,0x00,0x21,  \ ; 4
     0x05,0x04,0x0F,0x80, 0x04,0x00,0x22,  \ ; 5
     0x06,0x04,0x0F,0x80, 0x04,0x00,0x23,  \ ; 6
     0x07,0x04,0x0F,0x80, 0x04,0x00,0x24,  \ ; 7
     0x08,0x04,0x0F,0x80, 0x04,0x00,0x25,  \ ; 8
     0x09,0x04,0x0F,0x80, 0x04,0x00,0x26,  \ ; 9
     0x00,0x04,0x0F,0x80, 0x04,0x00,0x27,  \ ; 0
     0x0B,0x04,0x0F,0x80, 0x04,0x00,0x28,  \ ; return
     0x0A,0x04,0x0F,0x80, 0x04,0x00,0x29,  \ ; escape
    \
     0x4E,0x04,0x0F,0x80, 0x02,0x08,0x02,  \ ; AC Print
     0x0F,0x04,0x0F,0x80, 0x02,0x09,0x02,  \ ; AC Properties (Details)
     0x23,0x04,0x0F,0x80, 0x02,0x24,0x02,  \ ; AC Back
    \
     0x1F,0x04,0x0F,0x80, 0x04,0x00,0x51,  \ ; down arrow
     0x1E,0x04,0x0F,0x80, 0x04,0x00,0x52,  \ ; up arrow
     0x21,0x04,0x0F,0x80, 0x04,0x00,0x4f,  \ ; right arrow
     0x20,0x04,0x0F,0x80, 0x04,0x00,0x50,  \ ; left arrow
     0x22,0x04,0x0F,0x80, 0x04,0x00,0x28,  \ ; return
    \
     0x16,0x04,0x0F,0x80, 0x02,0xb0,0x00,  \ ; AC Media play
     0x18,0x04,0x0F,0x80, 0x02,0xb1,0x00,  \ ; AC Media pause
     0x17,0x04,0x0F,0x80, 0x02,0xb2,0x00,  \ ; AC Media record
     0x14,0x04,0x0F,0x80, 0x02,0xb3,0x00,  \ ; AC FF
     0x15,0x04,0x0F,0x80, 0x02,0xb4,0x00,  \ ; AC RW
     0x1A,0x04,0x0F,0x80, 0x02,0xb5,0x00,  \ ; AC Media next track
     0x1B,0x04,0x0F,0x80, 0x02,0xb6,0x00,  \ ; AC Media previous track
     0x19,0x04,0x0F,0x80, 0x02,0xb7,0x00,  \ ; AC Media Stop
    \
     0x10,0x04,0x0F,0x80, 0x02,0xe9,0x00,  \ ; AC volume up
     0x11,0x04,0x0F,0x80, 0x02,0xea,0x00,  \ ; AC volume down
     0x0E,0x04,0x0F,0x80, 0x02,0xe2,0x00,  \ ; AC volume mute
    \
     0x26,0x04,0x0F,0x80, 0x02,0x8d,0x00,  \ ; AC select program guide
     0x12,0x04,0x0F,0x80, 0x02,0x9c,0x00,  \ ; AC channel up
     0x13,0x04,0x0F,0x80, 0x02,0x9d,0x00,  \ ; AC channel down
    \
     0x0C,0x04,0x0F,0x80, 0x03,0x82,0x00     ; Suspend
   
[HIDIR_Inst.CopyFiles.NT]
hidir.sys
hidclass.sys
hidparse.sys

[HIDIR_Inst.NT.Services]
AddService = HidIr,%SPSVCINST_ASSOCSERVICE%,HIDIR_Service_Inst

[HIDIR_Service_Inst]
DisplayName    = %HIDIR.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_IGNORE%
ServiceBinary  = %12%\hidir.sys
LoadOrderGroup = extended base



;=====================================================================
[HID_Raw_Inst.NT]

;
; Do nothing for Raw Devices.
;
;=====================================================================

[HID_Service_Inst]
DisplayName    = %HID.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_IGNORE%
ServiceBinary  = %12%\hidusb.sys
LoadOrderGroup = extended base

[HID_Dummy_Service_Inst]
DisplayName    = %DUMMY.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_AUTO_START%
ErrorControl   = %SERVICE_ERROR_IGNORE%
ServiceBinary  = %12%\dummyfdo.sys
LoadOrderGroup = extended base



































[strings]
MSFT                  = "Microsoft"
HID.DeviceDesc        = "USB Human Interface Device"
HID.DefaultDevice     = "HID default device"
HID.ClassName         = "Human Interface Devices"
HID.SvcDesc           = "Microsoft HID Class Driver"
DUMMY.SvcDesc         = "Microsoft Dummy FDO Driver"
KBDHID.SvcDesc        = "Keyboard HID Driver"
KBDCLASS.SvcDesc      = "Keyboard Class Driver"
MOUHID.SvcDesc        = "Mouse HID Driver"
MOUCLASS.SvcDesc      = "Mouse Class Driver"
HIDIR.SvcDesc         = "Microsoft Infrared HID Driver"

KeyboardClassName       = "Keyboard"

AcerMfg         = "Acer"
AltecMfg        = "Altec Lansing"
ALPSMfg         = "ALPS"
AnchorMfg       = "Anchor"
APCMfg          = "American Power Conversion"
BTCMfg          = "BTC"
CherryMfg       = "Cherry GmbH"
ChiconyMfg      = "Chicony"
CTXMfg          = "CTX"
EIZOMfg         = "EIZO"
CypressMfg      = "Cypress"
DexinMfg        = "Dexin"
ELOMfg          = "ELO TouchSystems"
FinePointMfg    = "FinePoint Innovations, Inc."
FocusMfg        = "Focus"
ForwardMfg      = "Forward"
FujitsuMfg      = "Fujitsu"
GeniusMfg       = "Genius"
GuillemotMfg    = "Guillemot"
ItacMfg         = "ITAC Systems"
JingMoldMfg     = "Jing Mold"
KeyTronicMfg    = "Key Tronic"
LabtecMfg       = "Labtec"
LiteOnMfg       = "Lite On"
LogiMfg         = "Logitech"
MaxiSwitchMfg   = "Maxi Switch, Inc."
MGEMfg          = "MGE"
MSMfg           = "Microsoft"
MontereyMfg     = "Monterey"
MitsubishiMfg   = "Mitsubishi"
NECMfg          = "NEC"
NMBMfg          = "NMB"
NokiaMfg        = "Nokia"
OrtekMfg        = "Ortek"
PhilipsMfg      = "Philips"
QtronixMfg      = "Qtronix"
SamsungMfg      = "Samsung"
SejinMfg        = "Sejin"
SilitekMfg      = "Silitek"
SolidYearMfg    = "Solid Year"
StdMfg          = "(Standard system devices)"
STSLMfg         = "STSL"
SUHMfg          = "SUH DART"
SUPERGATEMfg    = "SUPERGATE"
ThrustmasterMfg = "Thrustmaster"
YamahaMfg       = "Yamaha"

USB\VID_0433&PID_ABAB.DeviceDesc = "ALPS USB Keyboard"
USB\VID_044e&PID_1104.DeviceDesc = "ALPS Japanese USB Keyboard"
USB\VID_03F9&PID_0100.DeviceDesc = "Key Tronic USB Keyboard"
USB\VID_0471&PID_0401.DeviceDesc = "Philips Semiconductors CICT USB Keyboard"
USB\VID_0471&PID_0402&MI_00.DeviceDesc = "Philips Semiconductors CICT USB Keyboard"
USB\VID_0471&PID_0601&MI_00.DeviceDesc = "Philips USB Wireless Keyboard"
USB\VID_046A&PID_0001.DeviceDesc = "Cherry GmbH USB Keyboard"
USB\VID_047B&PID_0001.DeviceDesc = "Silitek USB Keyboard"
USB\VID_047B&PID_0002&MI_00.DeviceDesc = "Silitek USB Keyboard"
USB\VID_04A5&PID_0001.DeviceDesc = "API Generic USB K/B"
USB\VID_04A5&PID_0002.DeviceDesc = "API Ergo USB K/B"
USB\VID_04A5&PID_0003&MI_00.DeviceDesc = "API Generic USB K/B"
USB\VID_03F9&PID_0101.DeviceDesc = "Key Tronic USB Keyboard"
USB\VID_03F9&PID_0102&MI_00.DeviceDesc = "Key Tronic USB Keyboard"
USB\VID_0446&PID_6782.DeviceDesc = "NMB USB Keyboard"
USB\VID_0446&PID_6781&MI_00.DeviceDesc = "NMB USB Keyboard with PS/2 Mouse Port"
USB\VID_05FA&PID_3302.DeviceDesc = "STSL USB Keyboard"
USB\VID_05FA&PID_3301&MI_00.DeviceDesc = "STSL USB Keyboard with PS/2 Mouse Port"
USB\VID_05FA&PID_3303&MI_00.DeviceDesc = "STSL USB Keyboard with PS/2 Mouse Port"
USB\VID_04F2&PID_0002.DeviceDesc = "Chicony USB Keyboard"
USB\VID_04F2&PID_0001&MI_00.DeviceDesc = "Chicony USB Keyboard"
USB\VID_046E&PID_0100.DeviceDesc = "BTC USB Keyboard"
USB\VID_046E&PID_6782&MI_00.DeviceDesc = "BTC USB Keyboard"
USB\VID_05B2&PID_6200.DeviceDesc = "Focus USB Keyboard"
USB\VID_05B2&PID_7200&MI_00.DeviceDesc = "Focus USB Keyboard"
USB\VID_05AF&PID_9167.DeviceDesc = "KB 9151B - 678"
USB\VID_05AF&PID_9267&MI_00.DeviceDesc = "KB 9251B - 678"
USB\VID_04C3&PID_1101.DeviceDesc = "Maxi Switch, Inc. #1101"
USB\VID_04C3&PID_1102&MI_00.DeviceDesc = "Maxi Switch, Inc. #1102"
USB\VID_04C3&PID_2101.DeviceDesc = "Maxi Switch, Inc. #2101"
USB\VID_04C3&PID_2102&MI_00.DeviceDesc = "Maxi Switch, Inc. #2102"
USB\VID_0566&PID_2800.DeviceDesc = "MIC USB K/B"
USB\VID_0566&PID_2801&MI_00.DeviceDesc = "MIC USB K/B M"
USB\VID_05A4&PID_9722.DeviceDesc = "ORTEK Keyboard"
USB\VID_05A4&PID_9720&MI_00.DeviceDesc = "ORTEK Keyboard"
USB\VID_0430&PID_0002&MI_00.DeviceDesc="Fujitsu USB Composite Keyboard"
USB\VID_04c5&PID_1020&MI_00.DeviceDesc="Fujitsu Japanese USB Composite Keyboard"
USB\VID_04c5&PID_1020&MI_01.DeviceDesc="Fujitsu USB Hot Buttons"
USB\VID_04c5&PID_1018.DeviceDesc="Fujitsu Japanese USB Keyboard Hot Buttons"
USB\VID_055D&PID_6780.DeviceDesc = "Samsung USB Keyboard V1"
USB\VID_055D&PID_6781&MI_00.DeviceDesc = "Samsung USB Keyboard V2"
USB\VID_055D&PID_0001.DeviceDesc="Samsung USB Keyboard"
USB\VID_05BC&PID_0002.DeviceDesc = "Forward USB K/B"
USB\VID_05BC&PID_0001&MI_00.DeviceDesc = "Forward USB K/B with PS/2 Mouse"
USB\VID_0500&PID_0002.DeviceDesc = "SUH DART-2 USB Keyboard"
USB\VID_0500&PID_0001&MI_00.DeviceDesc = "SUH DART USB Keyboard"
USB\VID_0510&PID_0001.DeviceDesc = "Sejin USB Keyboard"
USB\VID_0510&PID_1000&MI_00.DeviceDesc="Sejin USB Keyboard with PS/2 Mouse Port"
USB\VID_05D5&PID_6782&MI_00.DeviceDesc = "SUPERGATE USB Keyboard with PS/2 Mouse Port"
USB\VID_045E&PID_000B.DeviceDesc = "Microsoft USB Natural Keyboard"
USB\VID_045E&PID_001D&MI_00.DeviceDesc = "Microsoft Natural Keyboard Pro"
USB\VID_045E&PID_002B&MI_00.DeviceDesc = "Microsoft Internet Keyboard Pro"
USB\VID_045E&PID_002D&MI_00.DeviceDesc = "Microsoft Internet Keyboard"
USB\VID_045E&PID_0048&MI_00.DeviceDesc = "Microsoft USB Office Keyboard"
USB\VID_045E&PID_005C&MI_00.DeviceDesc = "Microsoft USB Office Keyboard (106/109)"
USB\VID_060B&PID_2101&MI_00.DeviceDesc = "Solid Year USB Keyboard with PS/2 Mouse Port"
USB\VID_0409&PID_0014&MI_00.DeviceDesc="NEC 109 Japanese USB Keyboard"
USB\VID_0409&PID_0011&MI_00.DeviceDesc="NEC PC98 Series Layout USB Keyboard"
USB\VID_0409&PID_0019.DeviceDesc="NEC 109 Japanese USB Keyboard with Bus-Powered Hub"
USB\VID_0409&PID_001A.DeviceDesc="NEC PC98 Series Layout USB Keyboard with Bus-Powered Hub"
USB\VID_0409&PID_0025.DeviceDesc="NEC USB Mini Keyboard with Bus-Powered Hub"
USB\VID_0409&PID_0034.DeviceDesc="NEC 109 Japanese USB Keyboard with One-touch start buttons"
USB\VID_0409&PID_0094.DeviceDesc="NEC Japanese USB Keyboard with One-touch start buttons"
USB\VID_0409&PID_0095.DeviceDesc="NEC Japanese USB Keyboard"
USB\VID_05C7&PID_2001.DeviceDesc = "Qtronix USB Keyboard"
USB\VID_05C7&PID_6001.DeviceDesc = "Qtronix USB Ten-Keypad"

IRBUS\VID_045E&PID_006D.DeviceDesc = "Microsoft eHome Infrared Transceiver"
IRBUS\HID.DeviceDesc= "Infrared HID Device"

USB\VID_045E&PID_0009.DeviceDesc="Microsoft USB IntelliMouse"
USB\VID_045E&PID_001E.DeviceDesc="Microsoft USB IntelliMouse Explorer"
USB\VID_045E&PID_0023.DeviceDesc="Microsoft USB Trackball Optical"
USB\VID_045E&PID_0024.DeviceDesc="Microsoft USB Trackball Explorer"
USB\VID_045E&PID_0025.DeviceDesc="Microsoft USB IntelliMouse with IntelliEye"
USB\VID_045E&PID_0029.DeviceDesc="Microsoft USB IntelliMouse Web"
USB\VID_045E&PID_0039.DeviceDesc="Microsoft USB IntelliMouse Optical"
USB\VID_045E&PID_0040.DeviceDesc="Microsoft USB Wheel Mouse Optical"
USB\VID_045E&PID_0047.DeviceDesc="Microsoft USB IntelliMouse Explorer 3.0"
USB\VID_045E&PID_0059.DeviceDesc="Microsoft USB Wireless IntelliMouse Explorer"
USB\VID_046D&PID_C000.DeviceDesc="Logitech USB First/Pilot Mouse"
USB\VID_046D&PID_C001.DeviceDesc="Logitech USB First/Pilot Mouse+"
USB\VID_046D&PID_C002.DeviceDesc="Logitech USB MouseMan Wheel"
USB\VID_046D&PID_C003.DeviceDesc="Logitech USB MouseMan"
USB\VID_046D&PID_C004.DeviceDesc="Logitech USB WingMan Gaming Mouse"
USB\VID_046D&PID_C005.DeviceDesc="Logitech USB WingMan Gaming Wheel Mouse"
USB\VID_046D&PID_C00B.DeviceDesc="Logitech USB MouseMan Wheel+"
USB\VID_046D&PID_C00C.DeviceDesc="Logitech USB WheelMouse"
USB\VID_046D&PID_C00D.DeviceDesc="Logitech USB MouseMan Wheel+"
USB\VID_046D&PID_C00E.DeviceDesc="Logitech USB Wheel Mouse"
USB\VID_046D&PID_C030.DeviceDesc="Logitech USB iFeel Mouse"
USB\VID_046D&PID_C031.DeviceDesc="Logitech USB iFeel Mouse+"
USB\VID_046D&PID_C032.DeviceDesc="Logitech USB iFeel MouseMan"
USB\VID_046D&PID_C033.DeviceDesc="Logitech USB iFeel MouseMan+"
USB\VID_046D&PID_C401.DeviceDesc="Logitech USB TrackMan Marble Wheel"
USB\VID_046D&PID_C402.DeviceDesc="Logitech USB Marble Mouse"
USB\VID_046D&PID_C403.DeviceDesc="Logitech USB Turbo TrackMan Marble FX"
USB\VID_046D&PID_C404.DeviceDesc="Logitech USB TrackMan Wheel"
USB\VID_046D&PID_C501.DeviceDesc="Logitech USB Cordless Mouse"
USB\VID_046D&PID_C502&MI_00.DeviceDesc="Logitech USB Cordless Keyboard"
USB\VID_046D&PID_C502&MI_01.DeviceDesc="Logitech USB Cordless Mouse & iTouch Keys"
USB\VID_046D&PID_C503&MI_00.DeviceDesc="Logitech USB Cordless Keyboard"
USB\VID_046D&PID_C503&MI_01.DeviceDesc="Logitech USB Cordless iTouch Keys"
USB\VID_04B4&PID_0001.DeviceDesc="Cypress USB Mouse"
USB\VID_04E7&PID_0001.DeviceDesc="ELO TouchSystems USB Touchscreen"
USB\VID_0458&PID_0001.DeviceDesc="Genius USB Mouse"
USB\VID_0458&PID_0002.DeviceDesc="Genius USB Net Mouse Pro"
USB\VID_0458&PID_0003.DeviceDesc="Genius USB Wheel Mouse"
USB\VID_0446&PID_6781&MI_01.DeviceDesc="NMB USB Keyboard Mouse"
USB\VID_05FA&PID_3301&MI_01.DeviceDesc="STSL USB Keyboard Mouse"
USB\VID_05FA&PID_3303&MI_01.DeviceDesc="STSL USB Keyboard Mouse"
USB\VID_05d5&PID_6782&MI_01.DeviceDesc="SUPERGATE USB Keyboard Mouse"
USB\VID_04F2&PID_0001&MI_01.DeviceDesc="Chicony USB Keyboard Mouse"
USB\VID_03F9&PID_0102&MI_01.DeviceDesc="Key Tronic USB Keyboard Mouse"
USB\VID_046E&PID_6782&MI_01.DeviceDesc="BTC USB Keyboard Mouse"
USB\VID_05B2&PID_7200&MI_01.DeviceDesc="Focus USB Keyboard Mouse"
USB\VID_05AF&PID_9267&MI_01.DeviceDesc="KB 9251B - 678 Mouse"
USB\VID_04C3&PID_1102&MI_01.DeviceDesc="Maxi Switch, Inc. #1102 Mouse"
USB\VID_04C3&PID_2102&MI_01.DeviceDesc="Maxi Switch, Inc. #2102 Mouse"
USB\VID_0566&PID_2801&MI_01.DeviceDesc="MIC USB K/B Mouse"
USB\VID_05A4&PID_9720&MI_01.DeviceDesc="Ortek USB Keyboard Mouse"
USB\VID_0431&PID_0100.DeviceDesc="Evolution USB Mouse-Trak by ITAC"
USB\VID_055D&PID_6781&MI_01.DeviceDesc="Samsung USB Keyboard Mouse"
USB\VID_05BC&PID_0001&MI_01.DeviceDesc="Forward USB K/B Mouse"
USB\VID_0500&PID_0001&MI_01.DeviceDesc="SUH DART USB Keyboard Mouse"
USB\VID_0471&PID_0601&MI_01.DeviceDesc="Philips USB Wireless Keyboard Mouse"
USB\VID_0471&PID_0402&MI_01.DeviceDesc="PS/2 Mouse on Philips Semiconductors CICT USB Keyboard"
USB\VID_0605&PID_0001.DeviceDesc="Anchor USB Mouse"
USB\VID_0409&PID_0014&MI_01.DeviceDesc="NEC 109 Japanese USB Keyboard Mouse"
USB\VID_0409&PID_0011&MI_01.DeviceDesc="NEC PC98 Series Layout USB Keyboard Mouse"
USB\VID_060B&PID_2101&MI_01.DeviceDesc="Solid Year USB Keyboard Mouse"
USB\VID_0430&PID_0002&MI_01.DeviceDesc="Fujitsu USB Composite Keyboard Mouse"
USB\VID_0510&PID_E001.DeviceDesc="Sejin USB Mouse"
USB\VID_0510&PID_1000&MI_01.DeviceDesc="Sejin USB Keyboard Mouse"
USB\VID_05F2&PID_0010.DeviceDesc="Dexin USB AQ Mouse"
USB\VID_04A5&PID_0003&MI_01.DeviceDesc= "API Generic USB K/B Mouse"
USB\VID_047B&PID_0002&MI_01.DeviceDesc="Silitek USB Keyboard Mouse"
USB\VID_05C7&PID_1001.DeviceDesc="Qtronix USB Mouse"
USB\VID_0E8A&PID_0100.DeviceDesc="FinePoint USB Digitizer"

USB\VID_045E&PID_0007.DeviceDesc="SideWinder Game Pad USB version 1.0"
USB\VID_045E&PID_0008.DeviceDesc="Microsoft SideWinder Precision Pro (USB)"
USB\VID_045E&PID_000E.DeviceDesc="Microsoft SideWinder Freestyle Pro (USB)"
USB\VID_046D&PID_0200.DeviceDesc="Logitech USB WingMan Extreme Joystick"
USB\VID_046D&PID_C201.DeviceDesc="Logitech USB WingMan Extreme Joystick  with Throttle"
USB\VID_046D&PID_C202.DeviceDesc="Logitech WingMan Formula (Yellow)(USB)"
USB\VID_046D&PID_C207.DeviceDesc="Logitech WingMan Extreme Digital 3D (USB)"
USB\VID_046D&PID_C208.DeviceDesc="Logitech WingMan Gamepad Extreme (USB)"
USB\VID_046D&PID_C209.DeviceDesc="Logitech WingMan Gamepad (USB)"
USB\VID_044F&PID_A0A0.DeviceDesc="Thrustmaster Top Gun USB Joystick"
USB\VID_044F&PID_A0A1.DeviceDesc="ThrustMaster Top Gun USB Joystick (rev2)"
USB\VID_044F&PID_A201.DeviceDesc="NEC PK-GP201 PlayStick"
USB\VID_044F&PID_A01B.DeviceDesc="NEC PK-GP301 Driving Wheel"
USB\VID_044F&PID_A003.DeviceDesc="ThrustMaster Rage 3D USB Game Pad"
USB\VID_0458&PID_1001.DeviceDesc="Genius USB Joystick"
USB\VID_0458&PID_1002.DeviceDesc="Genius USB Game Pad"
USB\VID_06F8&PID_0002.DeviceDesc="Guillemot Jet Leader USB Joystick"
HID_DEVICE_SYSTEM_GAME="HID-compliant game controller"
HID_DEVICE="HID-compliant device"

SPSVCINST_TAGTOFRONT  = 0x00000001
SPSVCINST_ASSOCSERVICE= 0x00000002
SERVICE_KERNEL_DRIVER = 1
SERVICE_BOOT_START    = 0
SERVICE_SYSTEM_START  = 1
SERVICE_AUTO_START    = 2
SERVICE_DEMAND_START  = 3
SERVICE_ERROR_NORMAL  = 1
SERVICE_ERROR_IGNORE  = 0
REG_EXPAND_SZ         = 0x00020000
REG_DWORD             = 0x00010001
REG_SZ                = 0x00000000

USB\VID_045E&PID_0014&MI_02.DeviceDesc="Microsoft Digital Sound System 80 HID Audio Controls"
USB\VID_045E&PID_001D&MI_01.DeviceDesc="Microsoft Natural Keyboard Pro Hot Keys"
USB\VID_045E&PID_002B&MI_01.DeviceDesc="Microsoft Internet Keyboard Pro Hot Keys"
USB\VID_045E&PID_002D&MI_01.DeviceDesc="Microsoft Internet Keyboard Hot Keys"
USB\VID_045E&PID_0048&MI_01.DeviceDesc="Microsoft USB Office Keyboard Hot Keys"
USB\VID_045E&PID_005C&MI_01.DeviceDesc="Microsoft USB Office Keyboard Hot Keys (106/109)"
USB\VID_04D2&PID_FF47&MI_02.DeviceDesc="Altec Lansing HID Audio Controls"
USB\VID_04D2&PID_FF49&MI_02.DeviceDesc="Altec Lansing HID Audio Controls"
USB\VID_04D2&PID_0070&MI_02.DeviceDesc="Altec Lansing HID Audio Controls"
USB\VID_0672&PID_1041&MI_02.DeviceDesc="Labtec HID Audio Controls"
USB\VID_0471&PID_0101&MI_02.DeviceDesc="Philips HID Audio Controls"
USB\VID_0409&PID_0203&MI_03.DeviceDesc="NEC HID Audio Controls"
USB\VID_0499&PID_3001&MI_02.DeviceDesc="Yamaha HID Audio Controls"

USB\VID_0698&PID_1786.DeviceDesc="CTX HID Monitor Controls"
USB\VID_04CA&PID_1766.DeviceDesc="Lite On HID Monitor Controls"
USB\VID_0452&PID_0021.DeviceDesc="Mitsubishi HID Monitor Controls"
USB\VID_056D&PID_0002.DeviceDesc="EIZO HID Monitor Controls"
USB\VID_04A6&PID_0181.DeviceDesc="Nokia HID Monitor Controls"

USB\VID_051D&PID_0000.DeviceDesc="American Power Conversion USB UPS"
USB\VID_051D&PID_0001.DeviceDesc="American Power Conversion USB UPS"
USB\VID_051D&PID_0002.DeviceDesc="American Power Conversion USB UPS"
USB\VID_051D&PID_0003.DeviceDesc="American Power Conversion USB UPS"
USB\VID_0463&PID_0001.DeviceDesc="MGE USB UPS"
USB\VID_0463&PID_FFFF.DeviceDesc="MGE USB UPS"


