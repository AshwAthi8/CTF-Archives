; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
signature="$Windows NT$"
Class=Keyboard
ClassGUID={4D36E96B-E325-11CE-BFC1-08002BE10318}
Provider=%MS%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ClassInstall32.NT]
AddReg=keyboard_class_addreg

[keyboard_class_addreg]
HKR,,,,%KeyboardClassName%
HKR,,Icon,,"-3"
HKR,,Installer32,,"SysSetup.Dll,KeyboardClassInstaller"
HKR,,NoInstallClass,,"1"
HKR,,TroubleShooter-0,,"hcp://help/tshoot/hdw_keyboard.htm"

[DestinationDirs]
DefaultDestDir = 12 ; DIRID_DRIVERS
101B_TYPE_LayerDriverFiles    = 11 ; DIRID_SYSTEM
101C_TYPE_LayerDriverFiles    = 11 ; DIRID_SYSTEM
103_TYPE_LayerDriverFiles     = 11 ; DIRID_SYSTEM
106_TYPE_LayerDriverFiles     = 11 ; DIRID_SYSTEM

[ControlFlags]
;
; Mark any install sections for drivers that also control the PS/2 mouse port,
; so that we can warn the user that they may also be affecting their mouse with
; a keyboard driver change.
;
SharedDriver=STANDARD_Inst,%STANDARD_Inst.SharedDriverMsg%
SharedDriver=101B_TYPE_Inst,%STANDARD_Inst.SharedDriverMsg%
SharedDriver=101C_TYPE_Inst,%STANDARD_Inst.SharedDriverMsg%
SharedDriver=103_TYPE_Inst,%STANDARD_Inst.SharedDriverMsg%
SharedDriver=106_TYPE_Inst,%STANDARD_Inst.SharedDriverMsg%

[Manufacturer]
%Std-Keyboards%=MS_KBD,NTamd64
%MICROSOFT%=MICROSOFT_KBD,NTamd64
%ALPS%=ALPS_KBD,NTamd64
%CHERRY%=CHERRY_KBD,NTamd64
%MITSUMI%=MITSUMI_KBD,NTamd64
%FUJITSU%=FUJITSU_KBD,NTamd64
%TOSHIBA%=TOSHIBA_KBD,NTamd64
%KEYTRONIC%=KEYTRONIC_KBD,NTamd64
%PHILIPS%=PHILIPS_KBD,NTamd64
%SILITEK%=SILITEK_KBD,NTamd64
%NMB%=NMB_KBD,NTamd64
%STSL%=STSL_KBD,NTamd64
%ACER%=ACER_KBD,NTamd64
%CHICONY%=CHICONY_KBD,NTamd64
%BTC%=BTC_KBD,NTamd64
%FOCUS%=FOCUS_KBD,NTamd64
%JINGMOLD%=JINGMOLD_KBD,NTamd64
%MAXISWITCH%=MAXISWITCH_KBD,NTamd64
%MONTEREY%=MONTEREY_KBD,NTamd64
%ORTEK%=ORTEK_KBD,NTamd64
%SAMSUNG%=SAMSUNG_KBD,NTamd64
%FORWARD%=FORWARD_KBD,NTamd64
%SUH%=SUH_KBD,NTamd64
%SEJIN%=SEJIN_KBD,NTamd64
%SUPERGATE%=SUPERGATE_KBD,NTamd64
%SOLIDYEAR%=SOLIDYEAR_KBD,NTamd64
%QTRONIX%=QTRONIX_KBD,NTamd64
%ATT%=ATT_KBD,NTamd64
%COMPAQ%=COMPAQ_KBD,NTamd64
%OLIVETTI%=OLIVETTI_KBD,NTamd64
%NEC%=NEC_KBD,NTamd64

[MS_KBD.NTamd64]
%*PNP0300.DeviceDesc%    = STANDARD_Inst,*PNP0300        ;PC/XT (83-Key)
%*PNP0301.DeviceDesc%    = STANDARD_Inst,*PNP0301        ;PC/AT (84-Key)
%*PNP0302.DeviceDesc%    = STANDARD_Inst,*PNP0302        ;PC/XT (84-Key)
%*PNP0303.DeviceDesc%    = STANDARD_Inst,*PNP0303        ;PC/AT Enh(101/102-Key)
%*PNP030b.DeviceDesc%    = STANDARD_Inst,*PNP030b,PS2_KEYBOARD   ;Default keyboard
%*PNP0320.DeviceDesc%    = 106_TYPE_Inst,*PNP0320        ;PC/AT Enh(106 Japanese key)
%*PNP0343.DeviceDesc%    = 101B_TYPE_Inst,*PNP0343       ;Enh 101b
%*PNP0344.DeviceDesc%    = 101C_TYPE_Inst,*PNP0344       ;Enh 101S
%*PNP0345.DeviceDesc%    = 103_TYPE_Inst,*PNP0345        ;Enh 103
%HID.KeyboardDevice%     = HID_Keyboard_Inst,,HID_DEVICE_SYSTEM_KEYBOARD ; Generic HID Keybaord

[ATT_KBD.NTamd64]
%*PNP030a.DeviceDesc%    = STANDARD_Inst,*PNP030a        ;AT&T 302

[COMPAQ_KBD.NTamd64]
%*CPQA0D7.DeviceDesc%    = STANDARD_Inst,*CPQA0D7        ;Compaq Enhanced Keyboard

[OLIVETTI_KBD.NTamd64]
%*PNP0304.DeviceDesc%    = STANDARD_Inst,*PNP0304        ;Olivetti (83-Key)
%*PNP0305.DeviceDesc%    = STANDARD_Inst,*PNP0305        ;Olivetti (102-Key)
%*PNP0306.DeviceDesc%    = STANDARD_Inst,*PNP0306        ;Olivetti (86-Key)
%*PNP0309.DeviceDesc%    = STANDARD_Inst,*PNP0309        ;Olivetti (101/102-Key)

[ALPS_KBD.NTamd64]
%HID\VID_0433&PID_ABAB.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0433&PID_ABAB
%HID\VID_044e&PID_1104.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_044e&PID_1104

[CHERRY_KBD.NTamd64]
%HID\VID_046A&PID_0001.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_046A&PID_0001

[MITSUMI_KBD.NTamd64]
%HID\VID_03ee&PID_5609&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_03ee&PID_5609&MI_00

[KEYTRONIC_KBD.NTamd64]
%HID\VID_03F9&PID_0100.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_03F9&PID_0100
%HID\VID_03F9&PID_0101.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_03F9&PID_0101
%HID\VID_03F9&PID_0102&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_03F9&PID_0102&MI_00

[PHILIPS_KBD.NTamd64]
%HID\VID_0471&PID_0601&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0471&PID_0601&MI_00
%HID\VID_0471&PID_0401.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0471&PID_0401
%HID\VID_0471&PID_0402&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0471&PID_0402&MI_00

[FUJITSU_KBD.NTamd64]
%HID\VID_0430&PID_0002&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0430&PID_0002&MI_00
%HID\VID_0430&PID_000A&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0430&PID_000A&MI_00
%HID\VID_0430&PID_000B.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0430&PID_000B
%HID\VID_0430&PID_0082.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0430&PID_0082
%HID\VID_0430&PID_0083&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0430&PID_0083&MI_00
%HID\VID_04c5&PID_1020&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_04c5&PID_1020&MI_00
%HID\VID_04c5&PID_1018&Col01.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_04c5&PID_1018&Col01
%HID\VID_04c5&PID_1022&MI_00&Col01.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_04c5&PID_1022&MI_00&Col01

[TOSHIBA_KBD.NTamd64]
%HID\VID_06D5&PID_4000.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_06D5&PID_4000

[SILITEK_KBD.NTamd64]
%HID\VID_047B&PID_0001.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_047B&PID_0001
%HID\VID_047B&PID_0002&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_047B&PID_0002&MI_00

[NMB_KBD.NTamd64]
; %HID\VID_0446&PID_6782.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0446&PID_6782
%HID\VID_0446&PID_6781&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0446&PID_6781&MI_00

[STSL_KBD.NTamd64]
%HID\VID_05FA&PID_3302.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05FA&PID_3302
%HID\VID_05FA&PID_3301&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05FA&PID_3301&MI_00
%HID\VID_05FA&PID_3303&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05FA&PID_3303&MI_00

[ACER_KBD.NTamd64]
%HID\VID_04A5&PID_0001.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04A5&PID_0001
%HID\VID_04A5&PID_0002.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04A5&PID_0002
%HID\VID_04A5&PID_0003&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04A5&PID_0003&MI_00

[CHICONY_KBD.NTamd64]
%HID\VID_04F2&PID_0002.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04F2&PID_0002
%HID\VID_04F2&PID_0001&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04F2&PID_0001&MI_00

[BTC_KBD.NTamd64]
%HID\VID_046E&PID_0100.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_046E&PID_0100
%HID\VID_046E&PID_6782&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_046E&PID_6782&MI_00

[FOCUS_KBD.NTamd64]
%HID\VID_05B2&PID_6200.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05B2&PID_6200
%HID\VID_05B2&PID_7200&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05B2&PID_7200&MI_00

[JINGMOLD_KBD.NTamd64]
%HID\VID_05AF&PID_9167.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05AF&PID_9167
%HID\VID_05AF&PID_9267&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05AF&PID_9267&MI_00

[MAXISWITCH_KBD.NTamd64]
%HID\VID_04C3&PID_1101.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04C3&PID_1101
%HID\VID_04C3&PID_1102&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04C3&PID_1102&MI_00
%HID\VID_04C3&PID_2101.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04C3&PID_2101
%HID\VID_04C3&PID_2102&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_04C3&PID_2102&MI_00

[MONTEREY_KBD.NTamd64]
%HID\VID_0566&PID_2800.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0566&PID_2800
%HID\VID_0566&PID_2801&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0566&PID_2801&MI_00

[SAMSUNG_KBD.NTamd64]
%HID\VID_055D&PID_6780.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_055D&PID_6780
%HID\VID_055D&PID_6781&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_055D&PID_6781&MI_00
%HID\VID_055D&PID_0001.DeviceDesc%=HID_Keyboard_Inst,,HID\VID_055D&PID_0001

[FORWARD_KBD.NTamd64]
%HID\VID_05BC&PID_0002.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05BC&PID_0002
%HID\VID_05BC&PID_0001&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05BC&PID_0001&MI_00

[SUH_KBD.NTamd64]
%HID\VID_0500&PID_0002.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0500&PID_0002
%HID\VID_0500&PID_0001&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0500&PID_0001&MI_00

[SEJIN_KBD.NTamd64]
%HID\VID_0510&PID_0001.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0510&PID_0001
%HID\VID_0510&PID_1000&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_0510&PID_1000&MI_00

[SUPERGATE_KBD.NTamd64]
%HID\VID_05D5&PID_6782&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05D5&PID_6782&MI_00

[ORTEK_KBD.NTamd64]
%HID\VID_05A4&PID_9722.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05A4&PID_9722
%HID\VID_05A4&PID_9720&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05A4&PID_9720&MI_00

[SOLIDYEAR_KBD.NTamd64]
%HID\VID_060B&PID_2101&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_060B&PID_2101&MI_00
%HID\VID_060B&PID_5903.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_060B&PID_5903
%HID\VID_060B&PID_6003&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_060B&PID_6003&MI_00
%HID\VID_060B&PID_1006&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_060B&PID_1006&MI_00

[QTRONIX_KBD.NTamd64]
%HID\VID_05C7&PID_2001.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05C7&PID_2001
%HID\VID_05C7&PID_6001.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_05C7&PID_6001

[MICROSOFT_KBD.NTamd64]
%HID\VID_045E&PID_000B.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_045E&PID_000B
%HID\VID_045E&PID_001D&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_045E&PID_001D&MI_00
%HID\VID_045E&PID_002B&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_045E&PID_002B&MI_00
%HID\VID_045E&PID_002D&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_045E&PID_002D&MI_00
%HID\VID_045E&PID_0048&MI_00.DeviceDesc%=HID_Keyboard_Inst,, HID\VID_045E&PID_0048&MI_00
%HID\VID_045E&PID_005C&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_045E&PID_005C&MI_00

[NEC_KBD.NTamd64]
%HID\VID_0409&PID_0014&MI_00.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_0014&MI_00
%HID\VID_0409&PID_0019.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_0019
%HID\VID_0409&PID_0025.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_0025
%HID\VID_0409&PID_0034&COL01.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_0034&COL01
%HID\VID_0409&PID_0094&COL01.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_0094&COL01
%HID\VID_0409&PID_0095.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_0095
%HID\VID_0409&PID_003F&MI_00&Col01.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_003F&MI_00&Col01
%HID\VID_0409&PID_004F&MI_00&Col01.DeviceDesc%=HID_106_Keyboard_Inst,, HID\VID_0409&PID_004F&MI_00&Col01

;=====================================================================
[STANDARD_Inst]         ; All keyboard IDs (except unknown) map to the same driver
CopyFiles  = STANDARD_CopyFiles
DelReg     = STANDARD_DelReg
AddReg      = STANDARD_AddReg

[STANDARD_DelReg]
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardType
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardSubtype
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardIdentifier
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver JPN"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver KOR"


[STANDARD_AddReg]
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver JPN",%REG_SZ%,"kbd101.dll"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver KOR",%REG_SZ%,"kbd101a.dll"
HKR,,LocationInformationOverride,,%LocationOverride%

[STANDARD_Inst.KeepValues]
i8042prt=OverrideKeyboardType,OverrideKeyboardSubtype,OverrideKeyboardIdentifier,"LayerDriver JPN","LayerDriver KOR"

[STANDARD_Inst.MigrateToDevnode]
i8402prt=KeyboardDataQueueSize,PollStatusIterations

[STANDARD_Inst.Services]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver

[STANDARD_Inst.HW]
AddReg = STANDARD_AddReg.HW

[STANDARD_AddReg.HW]
HKR,,"KeyboardDataQueueSize",0x00010003,100
;HKR,,"PowerCapabilities",,0x00010003,0
HKR,,"PollStatusIterations",0x00010003,1

; global to i8042prt.sys (affects both keyboard and mouse)
HKLM,"SYSTEM\CurrentControlSet\Services\i8042prt\Parameters","PollingIterations",0x00010003,12000
HKLM,"SYSTEM\CurrentControlSet\Services\i8042prt\Parameters","PollingIterationsMaximum",0x00010003,12000
HKLM,"SYSTEM\CurrentControlSet\Services\i8042prt\Parameters","ResendIterations",0x00010003,3

[STANDARD_CopyFiles]
i8042prt.sys
kbdclass.sys

; ==============================================
; Korean 101 Keyboard, Type 2
; ==============================================
[101B_TYPE_Inst]
CopyFiles  = 101B_TYPE_LayerDriverFiles, STANDARD_CopyFiles
AddReg     = 101B_TYPE_AddReg

[101B_TYPE_AddReg]
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardType,%REG_DWORD%,0x8
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardSubtype,%REG_DWORD%,0x4
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardIdentifier,%REG_SZ%,"PCAT_101BKEY"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver KOR",%REG_SZ%,"kbd101b.dll"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver JPN",%REG_SZ%,"kbd101.dll"
HKR,,LocationInformationOverride,,%LocationOverride%

[101B_TYPE_Inst.HW]
AddReg = STANDARD_AddReg.HW

[101B_TYPE_LayerDriverFiles]
kbdkor.dll
kbd101b.dll

[101B_TYPE_Inst.Services]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver

; ==============================================
; Korean 101 Keyboard, Type 3 (PS/2)
; ==============================================
[101C_TYPE_Inst]
CopyFiles  = 101C_TYPE_LayerDriverFiles, STANDARD_CopyFiles
AddReg     = 101C_TYPE_AddReg

[101C_TYPE_AddReg]
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardType,%REG_DWORD%,0x8
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardSubtype,%REG_DWORD%,0x5
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardIdentifier,%REG_SZ%,"PCAT_101CKEY"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver KOR",%REG_SZ%,"kbd101c.dll"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver JPN",%REG_SZ%,"kbd101.dll"
HKR,,LocationInformationOverride,,%LocationOverride%

[101C_TYPE_Inst.HW]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver

[101C_TYPE_LayerDriverFiles]
kbdkor.dll
kbd101c.dll

[101C_TYPE_Inst.Services]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver

; ==============================================
; Korean 103/106 Keyboard (PS/2)
; ==============================================
[103_TYPE_Inst]
CopyFiles  = 103_TYPE_LayerDriverFiles, STANDARD_CopyFiles
AddReg     = 103_TYPE_AddReg

[103_TYPE_AddReg]
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardType,%REG_DWORD%,0x8
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardSubtype,%REG_DWORD%,0x6
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardIdentifier,%REG_SZ%,"PCAT_103KEY"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver KOR",%REG_SZ%,"kbd103.dll"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver JPN",%REG_SZ%,"kbd101.dll"
HKR,,LocationInformationOverride,,%LocationOverride%

[103_TYPE_Inst.HW]
AddReg = STANDARD_AddReg.HW

[103_TYPE_LayerDriverFiles]
kbdkor.dll
kbd103.dll

[103_TYPE_Inst.Services]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver

; ==============================================
; Japanese 106/109 Keyboard (PS/2)
; ==============================================
[106_TYPE_Inst]
CopyFiles  = 106_TYPE_LayerDriverFiles, STANDARD_CopyFiles
AddReg     = 106_TYPE_AddReg

[106_TYPE_AddReg]
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardType,%REG_DWORD%,0x7
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardSubtype,%REG_DWORD%,0x2
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,OverrideKeyboardIdentifier,%REG_SZ%,"PCAT_106KEY"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver JPN",%REG_SZ%,"kbd106.dll"
HKLM,SYSTEM\CurrentControlSet\Services\i8042prt\Parameters,"LayerDriver KOR",%REG_SZ%,"kbd101a.dll"
HKR,,LocationInformationOverride,,%LocationOverride%

[106_TYPE_Inst.HW]
AddReg = STANDARD_AddReg.HW

[106_TYPE_Inst.Services]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver

[106_TYPE_LayerDriverFiles]
kbdjpn.dll
kbd106.dll

[106_TYPE_Inst.Services]
AddService = i8042prt, 0x00000002, i8042prt_Service_Inst, i8042prt_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver


[i8042prt_Service_Inst]
DisplayName    = %i8042prt.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_SYSTEM_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\i8042prt.sys
LoadOrderGroup = Keyboard Port

[i8042prt_EventLog_Inst]
AddReg = i8042prt_EventLog_AddReg

[i8042prt_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\i8042prt.sys"
HKR,,TypesSupported,0x00010001,7

[kbdclass_Service_Inst]
DisplayName    = %kbdclass.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_SYSTEM_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\kbdclass.sys
LoadOrderGroup = Keyboard Class

[kbdclass_EventLog_Inst]
AddReg = kbdclass_EventLog_AddReg

[kbdclass_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\kbdclass.sys"
HKR,,TypesSupported,0x00010001,7

; ==============================================
; Japanese 106/109 Keyboard (USB)
; ==============================================
[HID_106_Keyboard_Inst.NT]
Copyfiles = HID_Keyboard_Inst.CopyFiles.NT
Copyfiles = 106_TYPE_LayerDriverFiles
AddReg = HID_106_Keyboard_Inst.AddReg

[HID_106_Keyboard_Inst.AddReg]

[HID_106_Keyboard_Inst.NT.HW]
AddReg = HID_106_Keyboard_Inst.AddReg.NT.HW
AddReg = HID_Keyboard_Inst.AddReg.NT

[HID_106_Keyboard_Inst.AddReg.NT.HW]
HKR,,"KeyboardTypeOverride",0x00010001,7
HKR,,"KeyboardSubtypeOverride",0x00010001,2

[HID_106_Keyboard_Inst.NT.Services]
AddService = kbdhid,%SPSVCINST_ASSOCSERVICE%,KbdHid_Service_Inst,KbdHid_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver


[LegacyXlate.DevId]
;
; This section is used during startup by the Windows NT Plug&Play Manager to
; simulate enumeration of the keyboard based on information retrieved from
; ARC firmware/NTDETECT.
;
XT_83KEY        = *PNP0300
PCAT_86KEY      = *PNP0301
PCXT_84KEY      = *PNP0302
XT_84KEY        = *PNP0302
101-KEY         = *PNP0303
OLI_83KEY       = *PNP0304
ATT_301         = *PNP0304
OLI_102KEY      = *PNP0305
OLI_86KEY       = *PNP0306
OLI_A101_102KEY = *PNP0309
ATT_302         = *PNP030a
PCAT_ENHANCED   = *PNP030b

;
; This section is used during fresh install/upgrade to determine what Win95-style
; INF install section to associate with the currently installed keyboard driver.
;
[LegacyXlate.Driver]
i8042prt = STANDARD_Inst

;=====================================================================

[HID_Keyboard_Inst.NT]
Copyfiles = HID_Keyboard_Inst.CopyFiles.NT

[HID_Keyboard_Inst.NT.HW]
AddReg = HID_Keyboard_Inst.AddReg.NT

[HID_Keyboard_Inst.AddReg.NT]
;HKR,,"LowerFilters",0x00010000,"valueadd"

[HID_Keyboard_Inst.CopyFiles.NT]
kbdhid.sys
kbdclass.sys

[HID_Keyboard_Inst.NT.Services]
AddService = kbdhid,%SPSVCINST_ASSOCSERVICE%,KbdHid_Service_Inst,KbdHid_EventLog_Inst ; Port Driver
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver
; AddService = valueadd,,ValueAdd_Service_Inst

[KbdHid_Service_Inst]
DisplayName    = %KBDHID.SvcDesc%
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_SYSTEM_START%
ErrorControl   = %SERVICE_ERROR_IGNORE%
ServiceBinary  = %12%\kbdhid.sys
LoadOrderGroup = Keyboard Port
AddReg = KbdHid_Service_Inst_AddReg

[KbdHid_Service_Inst_AddReg]
HKR,"Parameters","WorkNicely",0x00010001,0

[KbdHid_EventLog_Inst]
AddReg = KbdHid_EventLog_AddReg

[KbdHid_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\kbdhid.sys"
HKR,,TypesSupported,0x00010001,7

; [ValueAdd_Service_Inst]
; DisplayName    = %VALUEADD.SvcDesc%
; ServiceType    = %SERVICE_KERNEL_DRIVER%
; StartType      = %SERVICE_SYSTEM_START%
; ErrorControl   = %SERVICE_ERROR_IGNORE%
; ServiceBinary  = %12%\value.sys
; LoadOrderGroup = Keyboard Port
; AddReg = ValueAdd_Service_Inst_AddReg

; [ValueAdd_Service_Inst_AddReg]
; HKR,"Parameters","WorkNicely",0x00010001,0

; Included by OEM / 3rd party INFs to install kbdclass
[KbdClass.Services]
AddService = kbdclass,, kbdclass_Service_Inst, kbdclass_EventLog_Inst            ; Class Driver























[NEC_KBD.NTamd64]
%HID\VID_0409&PID_0011&MI_00.DeviceDesc%=HID_Keyboard_Inst, HID\VID_0409&PID_0011&MI_00
%HID\VID_0409&PID_001A.DeviceDesc%=HID_Keyboard_Inst, HID\VID_0409&PID_001A







































































































































































































































































































[Strings]

*PNP0303.DeviceDesc     = "Standard 101/102-Key or Microsoft Natural PS/2 Keyboard"
i8042prt.SvcDesc        = "i8042 Keyboard and PS/2 Mouse Port Driver"



























LocationOverride        = "plugged into keyboard port"
KeyboardClassName       = "Keyboards"

; Manufacturers
ATT                     = "AT&T"
COMPAQ                  = "Compaq"
OLIVETTI                = "Olivetti"
MS                      = "Microsoft"
MICROSOFT               = "Microsoft"
Std-Keyboards           = "(Standard keyboards)"
ALPS                    = "ALPS"
FUJITSU                 = "Fujitsu"
TOSHIBA                 = "Toshiba"
KEYTRONIC               = "Key Tronic"
PHILIPS                 = "Philips"
CHERRY                  = "Cherry GmbH"
MITSUMI                 = "Mitsumi"
SILITEK                 = "Silitek"
NMB                     = "NMB"
STSL                    = "STSL"
ACER                    = "Acer"
BTC                     = "BTC"
FOCUS                   = "Focus"
JINGMOLD                = "Jing Mold"
MAXISWITCH              = "Maxi Switch, Inc."
MONTEREY                = "Monterey"
ORTEK                   = "Ortek"
CHICONY                 = "Chicony"
FORWARD                 = "Forward"
SAMSUNG                 = "Samsung"
SEJIN                   = "Sejin"
SUPERGATE               = "SUPERGATE"
SUH                     = "SUH"
SOLIDYEAR               = "Solid Year"
NEC                     = "NEC"
QTRONIX                 = "Qtronix"

; Standard Device IDs
*PNP0300.DeviceDesc     = "PC/XT PS/2 Keyboard (83-Key)"
*PNP0301.DeviceDesc     = "PC/AT PS/2 Keyboard (84-Key)"
*PNP0302.DeviceDesc     = "PC/XT PS/2 Keyboard (84-Key)"
*PNP0304.DeviceDesc     = "Olivetti PS/2 Keyboard (83-Key) or AT&T 301 Keyboard"
*PNP0305.DeviceDesc     = "Olivetti PS/2 Keyboard (102-Key)"
*PNP0306.DeviceDesc     = "Olivetti PS/2 Keyboard (86-Key)"
*PNP0309.DeviceDesc     = "Olivetti PS/2 Keyboard (A101/102-Key)"
*PNP030a.DeviceDesc     = "AT&T 302 PS/2 Keyboard"
*PNP030b.DeviceDesc     = "PC/AT Enhanced PS/2 Keyboard (101/102-Key)" ; default
*PNP0320.DeviceDesc     = "Japanese PS/2 Keyboard (106/109 Key)"
*PNP0343.DeviceDesc     = "Korean PC/AT 101-Key Compatible Keyboard/MS Natural Keyboard (Type 2)"
*PNP0344.DeviceDesc     = "Korean PC/AT 101-Key Compatible Keyboard/MS Natural Keyboard (Type 3)"
*PNP0345.DeviceDesc     = "Korean PS/2 Keyboard (103/106 Key)"
*CPQA0D7.DeviceDesc     = "Compaq Enhanced PS/2 Keyboard"

kbdclass.SvcDesc        = "Keyboard Class Driver"
KBDHID.SvcDesc          = "Keyboard HID Driver"

STANDARD_Inst.SharedDriverMsg = "PS/2 mouse port"

; HID device IDs

HID.KeyboardDevice    = "HID Keyboard Device"
HID\VID_0433&PID_ABAB.DeviceDesc = "ALPS USB Keyboard"
HID\VID_044e&PID_1104.DeviceDesc = "ALPS Japanese USB Keyboard"
HID\VID_03F9&PID_0100.DeviceDesc = "Key Tronic USB Keyboard"
HID\VID_0471&PID_0401.DeviceDesc = "Philips Semiconductors CICT USB Keyboard"
HID\VID_0471&PID_0402&MI_00.DeviceDesc = "Philips Semiconductors CICT USB Keyboard"
HID\VID_0471&PID_0601&MI_00.DeviceDesc = "Philips USB Wireless Keyboard"
HID\VID_046A&PID_0001.DeviceDesc = "Cherry GmbH USB Keyboard"
HID\VID_03ee&PID_5609&MI_00.DeviceDesc = "Mitsumi Japanese USB Keyboard"
HID\VID_047B&PID_0001.DeviceDesc = "Silitek USB Keyboard"
HID\VID_047B&PID_0002&MI_00.DeviceDesc = "Silitek USB Keyboard"
HID\VID_04A5&PID_0001.DeviceDesc = "API Generic USB K/B"
HID\VID_04A5&PID_0002.DeviceDesc = "API Ergo USB K/B"
HID\VID_04A5&PID_0003&MI_00.DeviceDesc = "API Generic USB K/B"
HID\VID_03F9&PID_0101.DeviceDesc = "Key Tronic USB Keyboard"
HID\VID_03F9&PID_0102&MI_00.DeviceDesc = "Key Tronic USB Keyboard"
HID\VID_0446&PID_6782.DeviceDesc = "NMB USB Keyboard"
HID\VID_0446&PID_6781&MI_00.DeviceDesc = "NMB USB Keyboard with PS/2 Mouse Port"
HID\VID_05FA&PID_3302.DeviceDesc = "STSL USB Keyboard"
HID\VID_05FA&PID_3301&MI_00.DeviceDesc = "STSL USB Keyboard with PS/2 Mouse Port"
HID\VID_05FA&PID_3303&MI_00.DeviceDesc = "STSL USB Keyboard with PS/2 Mouse Port"
HID\VID_04F2&PID_0002.DeviceDesc = "Chicony USB Keyboard"
HID\VID_04F2&PID_0001&MI_00.DeviceDesc = "Chicony USB Keyboard"
HID\VID_046E&PID_0100.DeviceDesc = "BTC USB Keyboard"
HID\VID_046E&PID_6782&MI_00.DeviceDesc = "BTC USB Keyboard"
HID\VID_05B2&PID_6200.DeviceDesc = "Focus USB Keyboard"
HID\VID_05B2&PID_7200&MI_00.DeviceDesc = "Focus USB Keyboard"
HID\VID_05AF&PID_9167.DeviceDesc = "KB 9151B - 678"
HID\VID_05AF&PID_9267&MI_00.DeviceDesc = "KB 9251B - 678"
HID\VID_04C3&PID_1101.DeviceDesc = "Maxi Switch, Inc. #1101"
HID\VID_04C3&PID_1102&MI_00.DeviceDesc = "Maxi Switch, Inc. #1102"
HID\VID_04C3&PID_2101.DeviceDesc = "Maxi Switch, Inc. #2101"
HID\VID_04C3&PID_2102&MI_00.DeviceDesc = "Maxi Switch, Inc. #2102"
HID\VID_0566&PID_2800.DeviceDesc = "MIC USB K/B"
HID\VID_0566&PID_2801&MI_00.DeviceDesc = "MIC USB K/B M"
HID\VID_05A4&PID_9722.DeviceDesc = "ORTEK Keyboard"
HID\VID_05A4&PID_9720&MI_00.DeviceDesc = "ORTEK Keyboard"
HID\VID_0430&PID_0002&MI_00.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_0430&PID_000A&MI_00.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_0430&PID_000B.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_0430&PID_0082.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_0430&PID_0083&MI_00.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_04c5&PID_1020&MI_00.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_04c5&PID_1018&Col01.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_04c5&PID_1022&MI_00&Col01.DeviceDesc="Fujitsu 109 Japanese USB Keyboard"
HID\VID_06D5&PID_4000.DeviceDesc = "Toshiba USB 109 Japanese keyboard"
HID\VID_055D&PID_6780.DeviceDesc = "Samsung USB Keyboard V1"
HID\VID_055D&PID_6781&MI_00.DeviceDesc = "Samsung USB Keyboard V2"
HID\VID_055D&PID_0001.DeviceDesc="Samsung USB Keyboard"
HID\VID_05BC&PID_0002.DeviceDesc = "Forward USB K/B"
HID\VID_05BC&PID_0001&MI_00.DeviceDesc = "Forward USB K/B with PS/2 Mouse"
HID\VID_0500&PID_0002.DeviceDesc = "SUH DART-2 USB Keyboard"
HID\VID_0500&PID_0001&MI_00.DeviceDesc = "SUH DART USB Keyboard"
HID\VID_0510&PID_0001.DeviceDesc = "Sejin USB Keyboard"
HID\VID_0510&PID_1000&MI_00.DeviceDesc="Sejin USB Keyboard with PS/2 Mouse Port"
HID\VID_05D5&PID_6782&MI_00.DeviceDesc = "SUPERGATE USB Keyboard with PS/2 Mouse Port"
HID\VID_045E&PID_000B.DeviceDesc = "Microsoft USB Natural Keyboard"
HID\VID_045E&PID_001D&MI_00.DeviceDesc = "Microsoft USB Natural Keyboard Pro"
HID\VID_045E&PID_002B&MI_00.DeviceDesc = "Microsoft USB Internet Keyboard Pro"
HID\VID_045E&PID_002D&MI_00.DeviceDesc = "Microsoft USB Internet Keyboard"
HID\VID_045E&PID_0048&MI_00.DeviceDesc = "Microsoft USB Office Keyboard"
HID\VID_045E&PID_005C&MI_00.DeviceDesc = "Microsoft USB Office Keyboard (106/109)"
HID\VID_060B&PID_2101&MI_00.DeviceDesc = "Japanese USB Keyboard with PS/2 Mouse Port"
HID\VID_060B&PID_5903.DeviceDesc="Japanese USB Keyboard - 595U"
HID\VID_060B&PID_6003&MI_00.DeviceDesc="Japanese USB Keyboard - 600HM"
HID\VID_060B&PID_1006&MI_00.DeviceDesc="Japanese USB Keyboard - 260U"
HID\VID_0409&PID_0014&MI_00.DeviceDesc="NEC 109 Japanese USB Keyboard"
HID\VID_0409&PID_0011&MI_00.DeviceDesc="NEC PC98 Series Layout USB Keyboard"
HID\VID_0409&PID_0019.DeviceDesc="NEC 109 Japanese USB Keyboard with Bus-Powered Hub"
HID\VID_0409&PID_001A.DeviceDesc="NEC PC98 Series Layout USB Keyboard with Bus-Powered Hub"
HID\VID_0409&PID_0025.DeviceDesc="NEC USB Mini Keyboard with Bus-Powered Hub"
HID\VID_0409&PID_0034&COL01.DeviceDesc="NEC 109 Japanese USB Keyboard with One-touch start buttons"
HID\VID_0409&PID_0094&COL01.DeviceDesc="NEC 109 USB Small Keyboard with One-touch start buttons"
HID\VID_0409&PID_0095.DeviceDesc="NEC 109 USB Small Keyboard with Bus-Powered Hub"
HID\VID_0409&PID_003F&MI_00&Col01.DeviceDesc="NEC Wireless USB Keyboard with One-touch start buttons"
HID\VID_0409&PID_004F&MI_00&Col01.DeviceDesc="NEC Wireless USB Keyboard with One-touch start buttons"
HID\VID_05C7&PID_2001.DeviceDesc = "Qtronix USB Keyboard"
HID\VID_05C7&PID_6001.DeviceDesc = "Qtronix USB Ten-Keypad"

; Standard defs

SPSVCINST_TAGTOFRONT  = 0x00000001
SPSVCINST_ASSOCSERVICE= 0x00000002
SERVICE_KERNEL_DRIVER = 1
SERVICE_BOOT_START    = 0
SERVICE_SYSTEM_START  = 1
SERVICE_DEMAND_START  = 3
SERVICE_AUTO_START    = 2
SERVICE_ERROR_NORMAL  = 1
SERVICE_ERROR_IGNORE  = 0
REG_EXPAND_SZ         = 0x00020000
REG_DWORD             = 0x00010001
REG_SZ                = 0x00000000

