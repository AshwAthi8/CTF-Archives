;-----------------------------------------------
; ATI Display Information file : ATIIXPAG.INF
; Installation INF for the ATI display driver.
; Copyright(C) 1998-2004 ATI Technologies Inc.
; Windows XP x64 Edition Version 2003
; Base INF Last Updated 2004/11/12

[Version]
Signature="$Windows NT$"
Provider=%ATI%
ClassGUID={4D36E968-E325-11CE-BFC1-08002BE10318}
Class=Display
DriverVer=12/03/2004, 6.14.10.6508

LayoutFile=Layout.inf

[DestinationDirs]
DefaultDestDir      = 11
ati2mtag.Miniport   = 12  ; drivers
ati2mtag.Display    = 11  ; system32

[ControlFlags]
ExcludeFromSelect=*
;
; Driver information
;

[Manufacturer]
%ATI% = ATI.Mfg, NTamd64

[ATI.Mfg.NTamd64]
"ALL-IN-WONDER 9600 (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4150&SUBSYS_47721002
"ALL-IN-WONDER 9600 (Microsoft Corporation) " = ati2mtag_RV350, PCI\VEN_1002&DEV_4170&SUBSYS_47731002
"ALL-IN-WONDER 9700 (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E44&SUBSYS_2F721002
"ALL-IN-WONDER 9700 (Microsoft Corporation) " = ati2mtag_R300, PCI\VEN_1002&DEV_4E44&SUBSYS_4F721002
"ALL-IN-WONDER 9700 (Microsoft Corporation)  " = ati2mtag_R300, PCI\VEN_1002&DEV_4E64&SUBSYS_2F731002
"ALL-IN-WONDER 9700 (Microsoft Corporation)   " = ati2mtag_R300, PCI\VEN_1002&DEV_4E64&SUBSYS_4F731002
"ALL-IN-WONDER 9800 (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4148&SUBSYS_4F721002
"ALL-IN-WONDER 9800 (Microsoft Corporation) " = ati2mtag_R350, PCI\VEN_1002&DEV_4E48&SUBSYS_4F721002
"ALL-IN-WONDER 9800 (Microsoft Corporation)  " = ati2mtag_R350, PCI\VEN_1002&DEV_4E68&SUBSYS_4F731002
"ALL-IN-WONDER 9800 (Microsoft Corporation)   " = ati2mtag_R350, PCI\VEN_1002&DEV_4168&SUBSYS_4F731002
"ALL-IN-WONDER RADEON 9200 LE (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5961&SUBSYS_4F721002
"ALL-IN-WONDER RADEON 9200 LE (Microsoft Corporation) " = ati2mtag_RV280, PCI\VEN_1002&DEV_5941&SUBSYS_4F731002
"ATI MOBILITY RADEON 9600/9700 Series (Microsoft Corporation)" = ati2mtag_M10, PCI\VEN_1002&DEV_4E50&SUBSYS_00461025
"ATI MOBILITY RADEON 9600/9700 Series (Microsoft Corporation) " = ati2mtag_M10, PCI\VEN_1002&DEV_4E50&SUBSYS_00571025
"ATI FireGL D1100 (Microsoft Corporation)" = ati2mtag_RV370GL, PCI\VEN_1002&DEV_5B65
"ATI FireGL D1100 Secondary (Microsoft Corporation)" = ati2mtag_RV370GL, PCI\VEN_1002&DEV_5B75
"ATI FireGL T2 (Microsoft Corporation)" = ati2mtag_RV350GL, PCI\VEN_1002&DEV_4154
"ATI FireGL T2 SEC (Microsoft Corporation)" = ati2mtag_RV350GL, PCI\VEN_1002&DEV_4174
"ATI FireGL V3100 (Microsoft Corporation)" = ati2mtag_RV370GL, PCI\VEN_1002&DEV_5B64
"ATI FireGL V3100 Secondary (Microsoft Corporation)" = ati2mtag_RV370GL, PCI\VEN_1002&DEV_5B74
"ATI FireGL V3200 (Microsoft Corporation)" = ati2mtag_RV380GL, PCI\VEN_1002&DEV_3E54
"ATI FireGL V3200 Secondary (Microsoft Corporation)" = ati2mtag_RV380GL, PCI\VEN_1002&DEV_3E74
"ATI FireGL V5100  Secondary (Microsoft Corporation)" = ati2mtag_R423GL, PCI\VEN_1002&DEV_5571
"ATI FireGL V5100 (Microsoft Corporation)" = ati2mtag_R423GL, PCI\VEN_1002&DEV_5551
"ATI FireGL V7100 (Microsoft Corporation)" = ati2mtag_R423GL, PCI\VEN_1002&DEV_5550
"ATI FireGL V7100 Secondary (Microsoft Corporation)" = ati2mtag_R423GL, PCI\VEN_1002&DEV_5570
"ATI FireGL X1 (Microsoft Corporation)" = ati2mtag_R300GL, PCI\VEN_1002&DEV_4E47
"ATI FireGL X1 SEC (Microsoft Corporation)" = ati2mtag_R300GL, PCI\VEN_1002&DEV_4E67
"ATI FireGL X2 (Microsoft Corporation)" = ati2mtag_R350GL, PCI\VEN_1002&DEV_4E4B
"ATI FireGL X2 SEC (Microsoft Corporation)" = ati2mtag_R350GL, PCI\VEN_1002&DEV_4E6B
"ATI FireGL X3-256 (Microsoft Corporation)" = ati2mtag_R420GL, PCI\VEN_1002&DEV_4A4D
"ATI FireGL X3-256 Secondary (Microsoft Corporation)" = ati2mtag_R420GL, PCI\VEN_1002&DEV_4A6D
"ATI FireGL Z1 (Microsoft Corporation)" = ati2mtag_R300GL, PCI\VEN_1002&DEV_4147
"ATI FireGL Z1 SEC (Microsoft Corporation)" = ati2mtag_R300GL, PCI\VEN_1002&DEV_4167
"ATI RADEON 9550 (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4153
"ATI RADEON 9550 Secondary (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4173
"ATI RADEON 9600 Series (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4151
"ATI RADEON 9600 Series Secondary (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4171
"R480 Consumer 4P (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D4C
"R480 Consumer 4P Secondary (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D6C
"R480 PRO (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D4F
"R480 PRO Secondary (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D6F
"R480 SE (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D4E
"R480 SE Secondary (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D6E
"R480 XT Platinum Edition (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D4D
"R480 XT Platinum Edition Secondary (Microsoft Corporation)" = ati2mtag_R480, PCI\VEN_1002&DEV_5D6D
"RADEON 9000U Family (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5962
"RADEON 9000U SEC Family (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5942
"RADEON 9200 LE Family (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5961
"RADEON 9200 LE SEC Family (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5941
"RADEON 9200 SE Family (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5964
"RADEON 9200 SE SEC Family (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5D44
"RADEON 9250 (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5960
"RADEON 9250 Secondary  (Microsoft Corporation)" = ati2mtag_RV280, PCI\VEN_1002&DEV_5940
"RADEON 9500 Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4144
"RADEON 9500 Family (Microsoft Corporation) " = ati2mtag_R350, PCI\VEN_1002&DEV_4149
"RADEON 9500 PRO / 9700 Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E45
"RADEON 9500 PRO / 9700 SEC Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E65
"RADEON 9500 SEC Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4164
"RADEON 9500 SEC Family (Microsoft Corporation) " = ati2mtag_R350, PCI\VEN_1002&DEV_4169
"RADEON 9600 Family (Microsoft Corporation)" = ati2mtag_RV360, PCI\VEN_1002&DEV_4152
"RADEON 9600 PRO Family (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4150
"RADEON 9600 PRO SEC Family (Microsoft Corporation)" = ati2mtag_RV350, PCI\VEN_1002&DEV_4170
"RADEON 9600 SEC Family (Microsoft Corporation)" = ati2mtag_RV360, PCI\VEN_1002&DEV_4172
"RADEON 9600 TX Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E46
"RADEON 9600 TX SEC Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E66
"RADEON 9700 PRO Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E44
"RADEON 9700 PRO SEC Family (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4E64
"RADEON 9700/9500 SERIES (Microsoft Corporation)" = ati2mtag_R300, PCI\VEN_1002&DEV_4145
"RADEON 9700/9500 SERIES (Microsoft Corporation) " = ati2mtag_R300, PCI\VEN_1002&DEV_4146
"RADEON 9800 LE Family (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4E49
"RADEON 9800 LE SEC Family (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4E69
"RADEON 9800 PRO (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4E48
"RADEON 9800 PRO SEC (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4E68
"RADEON 9800 SE Family (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4148
"RADEON 9800 SE SEC Family (Microsoft Corporation)" = ati2mtag_R350, PCI\VEN_1002&DEV_4168
"RADEON 9800 XT (Microsoft Corporation)" = ati2mtag_R360, PCI\VEN_1002&DEV_4E4A
"RADEON 9800 XT SEC (Microsoft Corporation)" = ati2mtag_R360, PCI\VEN_1002&DEV_4E6A
"RADEON X300 Series (Microsoft Corporation)" = ati2mtag_RV370, PCI\VEN_1002&DEV_5B60
"RADEON X300 Series Secondary (Microsoft Corporation)" = ati2mtag_RV370, PCI\VEN_1002&DEV_5B70
"RADEON X600 Series (Microsoft Corporation)" = ati2mtag_RV380, PCI\VEN_1002&DEV_3E50
"RADEON X600 Series Secondary (Microsoft Corporation)" = ati2mtag_RV380, PCI\VEN_1002&DEV_3E70
"RADEON X700 (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E4D
"RADEON X700 PRO (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E4B
"RADEON X700 PRO Secondary (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E6B
"RADEON X700 SE (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E4C
"RADEON X700 SE Secondary (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E6C
"RADEON X700 Secondary (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E6D
"RADEON X700 XT (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E4A
"RADEON X700 XT Secondary (Microsoft Corporation)" = ati2mtag_RV410, PCI\VEN_1002&DEV_5E6A
"RADEON X800 (Microsoft Corporation)" = ati2mtag_R420, PCI\VEN_1002&DEV_4A4B
"RADEON X800 PRO (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_5549
"RADEON X800 PRO (Microsoft Corporation) " = ati2mtag_R420, PCI\VEN_1002&DEV_4A49
"RADEON X800 PRO Secondary (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_5569
"RADEON X800 PRO Secondary (Microsoft Corporation) " = ati2mtag_R420, PCI\VEN_1002&DEV_4A69
"RADEON X800 SE (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_554B
"RADEON X800 SE (Microsoft Corporation) " = ati2mtag_R420, PCI\VEN_1002&DEV_4A4A
"RADEON X800 SE Secondary (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_556B
"RADEON X800 SE Secondary (Microsoft Corporation) " = ati2mtag_R420, PCI\VEN_1002&DEV_4A6A
"RADEON X800 Secondary (Microsoft Corporation)" = ati2mtag_R420, PCI\VEN_1002&DEV_4A6B
"RADEON X800 Series (Microsoft Corporation)" = ati2mtag_R420, PCI\VEN_1002&DEV_4A48
"RADEON X800 Series (Microsoft Corporation) " = ati2mtag_R423, PCI\VEN_1002&DEV_5548
"RADEON X800 Series (Microsoft Corporation)  " = ati2mtag_R420, PCI\VEN_1002&DEV_4A4C
"RADEON X800 Series Secondary (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_5568
"RADEON X800 Series Secondary (Microsoft Corporation) " = ati2mtag_R420, PCI\VEN_1002&DEV_4A6C
"RADEON X800 Series Secondary (Microsoft Corporation)  " = ati2mtag_R420, PCI\VEN_1002&DEV_4A68
"RADEON X800 XT (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_5D57
"RADEON X800 XT (Microsoft Corporation) " = ati2mtag_R420, PCI\VEN_1002&DEV_4A50
"RADEON X800 XT Platinum Edition (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_554A
"RADEON X800 XT Platinum Edition Sec (Microsoft Corporation)" = ati2mtag_R423, PCI\VEN_1002&DEV_556A
"RADEON X800 XT Secondary (Microsoft Corporation)" = ati2mtag_R420, PCI\VEN_1002&DEV_4A70
"RADEON X800 XT Secondary (Microsoft Corporation) " = ati2mtag_R423, PCI\VEN_1002&DEV_5D77
;
; General installation section
;

[ati2mtag_RV100]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RV280]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R300]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R350]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R360]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RV350]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RV360]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RV370]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RV380]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RV410]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R420]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R423]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R480]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_M10]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R300GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display
;UpdateInis=DVCR.UpdateIni

[ati2mtag_R350GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display
;UpdateInis=DVCR.UpdateIni

[ati2mtag_RV350GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display
;UpdateInis=DVCR.UpdateIni

[ati2mtag_RV370GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display
;UpdateInis=DVCR.UpdateIni

[ati2mtag_RV380GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display
;UpdateInis=DVCR.UpdateIni

[ati2mtag_R420GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_R423GL]
CopyFiles=ati2mtag.Miniport, ati2mtag.Display

[ati2mtag_RemoveService]
ati2mtag
;
; File sections
;


[ati2mtag.Miniport]
ati2mtag.sys

[ati2mtag.Display]
ati2dvag.dll
ati2cqag.dll
ati3duag.dll
ativvaxx.dll

[ati2mtag.OpenGL]

[ati2mtag.Wow64OpenGL]

[ati2mtag.WsOpenGL]

[ati2mtag.WsWow64OpenGL]

;
; Service Installation
;

[ati2mtag_RV100.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV280.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R300.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R350.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R360.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV350.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV360.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV370.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV380.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV410.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R420.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R423.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R480.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_M10.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R300GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R350GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV350GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV370GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_RV380GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R420GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_R423GL.Services]
AddService = ati2mtag, 0x00000002, ati2mtag_Service_Inst, ati2mtag_EventLog_Inst

[ati2mtag_Service_Inst]
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 0                  ; SERVICE_ERROR_IGNORE
LoadOrderGroup = Video
ServiceBinary  = %12%\ati2mtag.sys

[ati2mtag_EventLog_Inst]

[ati2mtag_RV100.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV100_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_RV280.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV280_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R300.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R300_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R350.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R350_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R360.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R360_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_RV350.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV350_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_RV360.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV360_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_RV370.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV370_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_RV380.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV380_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_RV410.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV410_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R420.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R420_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R423.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R423_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R480.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R480_SoftwareDeviceSettings
AddReg = ati2mtag_Desktop_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_M10.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_M10_SoftwareDeviceSettings
AddReg = ati2mtag_Mobile_SoftwareDeviceSettings
AddReg = atioglxx_OpenGLSoftwareSettings
DelReg = ati2mtag_RemoveDeviceSettings

[ati2mtag_R300GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R300GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_R350GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R350GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_RV350GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV350GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_RV370GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV370GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_RV380GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_RV380GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_R420GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R420GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_R423GL.SoftwareSettings]
AddReg = ati2mtag_SoftwareDeviceSettings
AddReg = ati2mtag_R423GL_SoftwareDeviceSettings
AddReg = ati2mtag_FGL_SoftwareDeviceSettings
DelReg = ati2mtag_RemoveDeviceSettings
AddReg = ati2mtag_FGL_LargeDesktopSettings

[ati2mtag_RV100_SoftwareDeviceSettings]
HKR,, DisableLCD,                  %REG_DWORD%,    1
HKR,, DALRULE_SAVEPANLOCK,         %REG_DWORD%,    1
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableIDCT,                 %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, DisableDirectPath, %REG_DWORD%, 1
HKR,, DisableDirectDraw, %REG_DWORD%, 1
HKR,, DisableD3D, %REG_DWORD%, 1
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1

[ati2mtag_RV280_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, MemInitLatencyTimer,         %REG_DWORD%,    0x775771BF
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DisableDirectPath,  %REG_DWORD%,  1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,60,12,80,09,60,00,00,00,70,12,80,09,60,00,00,00,72,12,80,09,60,00,00,00,75,12,80,09,60,00,00,00,85,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, AntiAlias,                            %REG_SZ%,       1
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, GCORULE_R200TVPLLWA,                  %REG_DWORD%,    1
HKR,, TVR200Flag,                           %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1

[ati2mtag_R300_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRestrictedModesBCD1, %REG_BINARY%,06,40,04,80,00,00,01,60,06,40,04,80,00,00,02,00,08,00,06,00,00,00,01,60,08,00,06,00,00,00,02,00,10,24,07,68,00,00,01,50,10,24,07,68,00,00,01,60,10,24,07,68,00,00,02,00,12,80,10,24,00,00,01,60
HKR,, DALRestrictedModesBCD2, %REG_BINARY%,12,80,10,24,00,00,02,00,16,00,12,00,00,00,01,00,16,00,12,00,00,00,01,20,17,92,13,44,00,00,00,90,17,92,13,44,00,00,01,00,18,00,14,40,00,00,00,90,18,00,14,40,00,00,01,00,19,20,10,80,00,00,01,00
HKR,, DALRestrictedModesBCD3, %REG_BINARY%,19,20,10,80,00,00,01,20,19,20,12,00,00,00,00,85,19,20,14,40,00,00,00,85,19,20,14,40,00,00,01,00,20,48,15,36,00,00,00,66
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_R350_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_R360_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_RV350_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_RV360_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_RV370_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_RV380_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,07,20,00,00,00,60,19,20,10,80,00,00,00,30,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_RV410_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,07,68,00,00,00,00,12,80,09,60,00,00,00,00,16,00,12,00,00,00,00,70,17,92,13,44,00,00,00,00,18,00,14,40,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1

[ati2mtag_R420_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1

[ati2mtag_R423_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_R480_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_M10_SoftwareDeviceSettings]
HKR,, DALRULE_NOTVANDLCDONCRTC,             %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,                  %REG_BINARY%,   00,00,00,00,00,00,00,60
HKR,, WmAgpMaxIdleClk,			    %REG_DWORD%,    0x20
HKR,, DisableIDCT,                          %REG_DWORD%,    0
HKR,, DALR6 CRT_MaxModeInfo,                  %REG_BINARY%,00,00,00,00,40,06,00,00,B0,04,00,00,00,00,00,00,3C,00,00,00
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,08,00,04,80,00,00,00,60,10,24,04,80,00,00,00,60,10,24,06,00,00,00,00,60,12,80,06,00,00,00,00,60,12,80,07,68,00,00,00,60,14,00,10,50,00,00,00,60
HKR,, ExtEvent_UpdateAdapterInfoOnHK,      %REG_DWORD%,    1
HKR,, ExtEvent_EnablePolling,      %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    0
HKR,, DALRULE_ENABLEDALRESUMESUPPORT, %REG_DWORD%,   1
HKR,, DALRULE_MOBILEFEATURES,               %REG_DWORD%,    1
HKR,, ExtEvent_EnablePolling,      %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVGDOENABLE,        %REG_DWORD%,    1
HKR,, HDTVRULE_HDTVSIGNALFORMAT,   %REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DfpUsePixSlip,                  %REG_DWORD%,    1

[ati2mtag_R300GL_SoftwareDeviceSettings]
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_HIGHDISPRI,          %REG_DWORD%,    1
HKR,, GCOOPTION_MaxECPFreq, %REG_DWORD%,    25000
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALRULE_FORCEMISLABELEDEDIDTO11,    %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, DALOPTION_MinRes2BCD, %REG_BINARY%, 06,40,04,80,00,16,00,20
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DALOPTION_MaxResBCD,  %REG_BINARY%, 20,48,15,36,00,32,01,00
HKR,, DALOPTION_MaxRes2BCD, %REG_BINARY%, 38,40,24,00,00,32,01,00
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, DefaultSettings.Preferences,          %REG_DWORD%, 0x8000000c
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,16,00,10,00,00,00,00,60,16,00,10,00,00,00,00,75,16,00,10,00,00,00,00,85,16,00,10,00,00,00,01,00,16,00,10,24,00,00,00,60,16,00,10,24,00,00,00,75,16,00,10,24,00,00,00,85,16,00,10,24,00,00,01,00
HKR,, DALNonStandardModesBCD2, %REG_BINARY%,17,92,13,44,00,00,00,85,18,48,07,56,00,00,00,60,19,20,10,80,00,00,00,85,19,20,24,00,00,00,00,00,20,48,08,56,00,00,00,60,20,48,15,36,00,00,00,30
HKR,, DALRestrictedModesBCD1, %REG_BINARY%,00,00,00,00,00,00,00,43,00,00,00,00,00,00,00,47,00,00,00,00,00,00,00,56,00,00,00,00,00,00,00,66,00,00,00,00,00,00,00,70,00,00,00,00,00,00,00,72,00,00,00,00,00,00,00,90,18,00,14,40,00,00,00,00
HKR,, DALRestrictedModesBCD2, %REG_BINARY%,19,20,14,40,00,00,00,00

[ati2mtag_R350GL_SoftwareDeviceSettings]
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_HIGHDISPRI,          %REG_DWORD%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALRULE_FORCEMISLABELEDEDIDTO11,    %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, DALOPTION_MinRes2BCD, %REG_BINARY%, 06,40,04,80,00,16,00,20
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DALOPTION_MaxResBCD,  %REG_BINARY%, 20,48,15,36,00,32,01,00
HKR,, DALOPTION_MaxRes2BCD, %REG_BINARY%, 38,40,24,00,00,32,01,00
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, DALRULE_MODESUPPORTEDSIMPLECHECK,         %REG_DWORD%,    1
HKR,, DefaultSettings.Preferences,          %REG_DWORD%, 0x8000000c
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,16,00,10,00,00,00,00,60,16,00,10,00,00,00,00,75,16,00,10,00,00,00,00,85,16,00,10,00,00,00,01,00,16,00,10,24,00,00,00,60,16,00,10,24,00,00,00,75,16,00,10,24,00,00,00,85,16,00,10,24,00,00,01,00
HKR,, DALNonStandardModesBCD2, %REG_BINARY%,17,92,13,44,00,00,00,85,18,48,07,56,00,00,00,60,19,20,10,80,00,00,00,85,19,20,12,00,00,00,00,30,19,20,24,00,00,00,00,00,20,48,08,56,00,00,00,60,20,48,15,36,00,00,00,30
HKR,, DALRestrictedModesBCD1, %REG_BINARY%,00,00,00,00,00,00,00,43,00,00,00,00,00,00,00,47,00,00,00,00,00,00,00,56,00,00,00,00,00,00,00,66,00,00,00,00,00,00,00,70,00,00,00,00,00,00,00,72,00,00,00,00,00,00,00,90,18,00,14,40,00,00,00,00
HKR,, DALRestrictedModesBCD2, %REG_BINARY%,19,20,14,40,00,00,00,00

[ati2mtag_RV350GL_SoftwareDeviceSettings]
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_HIGHDISPRI,          %REG_DWORD%,    1
HKR,, DALRULE_FORCEMISLABELEDEDIDTO11,    %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DALOPTION_MaxResBCD,  %REG_BINARY%, 20,48,15,36,00,32,01,00
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, DALRULE_MODESUPPORTEDSIMPLECHECK,         %REG_DWORD%,    1
HKR,, DefaultSettings.Preferences,          %REG_DWORD%, 0x8000000c
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,16,00,10,00,00,00,00,60,16,00,10,00,00,00,00,75,16,00,10,00,00,00,00,85,16,00,10,00,00,00,01,00,16,00,10,24,00,00,00,60,16,00,10,24,00,00,00,75,16,00,10,24,00,00,00,85,16,00,10,24,00,00,01,00
HKR,, DALNonStandardModesBCD2, %REG_BINARY%,17,92,13,44,00,00,00,85,18,48,07,56,00,00,00,60,19,20,10,80,00,00,00,85,20,48,08,56,00,00,00,60
HKR,, DALRestrictedModesBCD1, %REG_BINARY%,00,00,00,00,00,00,00,43,00,00,00,00,00,00,00,47,00,00,00,00,00,00,00,56,00,00,00,00,00,00,00,66,00,00,00,00,00,00,00,70,00,00,00,00,00,00,00,72,00,00,00,00,00,00,00,90,18,00,14,40,00,00,00,00
HKR,, DALRestrictedModesBCD2, %REG_BINARY%,19,20,14,40,00,00,00,00

[ati2mtag_RV370GL_SoftwareDeviceSettings]
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_HIGHDISPRI,          %REG_DWORD%,    1
HKR,, DALRULE_FORCEMISLABELEDEDIDTO11,    %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DALOPTION_MaxResBCD,  %REG_BINARY%, 20,48,15,36,00,32,01,00
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, DALRULE_MODESUPPORTEDSIMPLECHECK,         %REG_DWORD%,    1
HKR,, DefaultSettings.Preferences,          %REG_DWORD%, 0x8000000c
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,16,00,10,00,00,00,00,60,16,00,10,00,00,00,00,75,16,00,10,00,00,00,00,85,16,00,10,00,00,00,01,00,16,00,10,24,00,00,00,60,16,00,10,24,00,00,00,75,16,00,10,24,00,00,00,85,16,00,10,24,00,00,01,00
HKR,, DALNonStandardModesBCD2, %REG_BINARY%,17,92,13,44,00,00,00,85,18,48,07,56,00,00,00,60,19,20,10,80,00,00,00,85,20,48,08,56,00,00,00,60
HKR,, DALRestrictedModesBCD1, %REG_BINARY%,00,00,00,00,00,00,00,43,00,00,00,00,00,00,00,47,00,00,00,00,00,00,00,56,00,00,00,00,00,00,00,66,00,00,00,00,00,00,00,70,00,00,00,00,00,00,00,72,00,00,00,00,00,00,00,90,18,00,14,40,00,00,00,00
HKR,, DALRestrictedModesBCD2, %REG_BINARY%,19,20,14,40,00,00,00,00

[ati2mtag_RV380GL_SoftwareDeviceSettings]
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_HIGHDISPRI,          %REG_DWORD%,    1
HKR,, DALRULE_FORCEMISLABELEDEDIDTO11,    %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1
HKR,, DALOPTION_MaxResBCD,  %REG_BINARY%, 20,48,15,36,00,32,01,00
HKR,, DisableDynamicEnableMode,    %REG_DWORD%,    1
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, DALRULE_MODESUPPORTEDSIMPLECHECK,         %REG_DWORD%,    1
HKR,, DefaultSettings.Preferences,          %REG_DWORD%, 0x8000000c
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,16,00,10,00,00,00,00,60,16,00,10,00,00,00,00,75,16,00,10,00,00,00,00,85,16,00,10,00,00,00,01,00,16,00,10,24,00,00,00,60,16,00,10,24,00,00,00,75,16,00,10,24,00,00,00,85,16,00,10,24,00,00,01,00
HKR,, DALNonStandardModesBCD2, %REG_BINARY%,17,92,13,44,00,00,00,85,18,48,07,56,00,00,00,60,19,20,10,80,00,00,00,85,20,48,08,56,00,00,00,60
HKR,, DALRestrictedModesBCD1, %REG_BINARY%,00,00,00,00,00,00,00,43,00,00,00,00,00,00,00,47,00,00,00,00,00,00,00,56,00,00,00,00,00,00,00,66,00,00,00,00,00,00,00,70,00,00,00,00,00,00,00,72,00,00,00,00,00,00,00,90,18,00,14,40,00,00,00,00
HKR,, DALRestrictedModesBCD2, %REG_BINARY%,19,20,14,40,00,00,00,00

[ati2mtag_R420GL_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1

[ati2mtag_R423GL_SoftwareDeviceSettings]
HKR,, DisableEnumAllChilds,        %REG_DWORD%,    1
HKR,, DisableDrvAlphaBlend,        %REG_DWORD%,    0
HKR,, GCOOPTION_DigitalCrtInfo,    %REG_BINARY%,   A3,38,61,C1,A3,38,61,B1
HKR,, GCORULE_FracFbDivSupport,      %REG_DWORD%, 0
HKR,, PrimaryTiling,                 %REG_SZ%,    1
HKR,, GCORULE_FlickerWA,             %REG_DWORD%, 1
HKR,, DALNonStandardModesBCD1, %REG_BINARY%,12,80,09,60,00,00,00,00,17,92,13,44,00,00,00,00,18,56,13,92,00,00,00,00
HKR,, DALRULE_NOFORCEBOOT,                  %REG_DWORD%,    1
HKR,, DisableFullAdapterInit,               %REG_DWORD%,    0
HKR,, DisableTV,                            	%REG_DWORD%,    1
HKR,, TVM6Flag,   %REG_DWORD%,    1
HKR,, DALOPTION_MinResBCD,  %REG_BINARY%, 06,40,04,80,00,16,00,60
HKR,, ExtEvent_OverDriveSupport,      %REG_DWORD%,    1
HKR,, DALRULE_ONEDISPLAYBOOTDEFAULT, %REG_DWORD%, 1

[ati2mtag_SoftwareDeviceSettings]
HKR,, DDC2Disabled,                         %REG_DWORD%,    0
HKR,, DisableBlockWrite,                    %REG_DWORD%,    1
HKR,, DisableDMACopy,                       %REG_DWORD%,    0
HKR,, InstalledDisplayDrivers,              %REG_MULTI_SZ%, ati2dvag
HKR,, MultiFunctionSupported,               %REG_DWORD%,    1
HKR,, TestEnv,                              %REG_DWORD%,    0
HKR,, TimingSelection,                      %REG_DWORD%,    0
HKR,, VgaCompatible,                        %REG_DWORD%,    0
HKR,,"Adaptive De-interlacing",             %REG_DWORD%,    1
HKR,,"VPE Adaptive De-interlacing",         %REG_DWORD%,    1
HKR,, GCOOPTION_DisableGPIOPowerSaveMode,   %REG_DWORD%,    1
HKR,"ATI WDM Configurations","PnP ID Version",%REG_SZ%,"34"
HKLM,"Software\ATI Technologies\CBT",ReleaseVersion,,"8.09.3-041203a-019761E-Microsoft"
HKR,, ReleaseVersion,,"8.09.3-041203a-019761E-Microsoft"
HKR,, BuildNumber,,"19761"
HKR,, drv,, "ati2dvag.dll"
HKR,, DALGameGammaScale,       %REG_DWORD%,   0x00646464
HKR,, DALRULE_GETVGAEXPANSIONATBOOT,        %REG_DWORD%,    0
HKLM, "Software\CLASSES\CLSID\{EBB5845F-CA80-11CF-BD3C-008029E89281}\InProcServer32",ThreadingModel,,"Both"
HKR,, DALRULE_DYNAMICFIXEDDISPLAYMODEREPORTING,      %REG_DWORD%,    1
HKR,, DALRULE_ALLOWMONITORRANGELIMITMODESCRT,      %REG_DWORD%,    1
HKR,, ExtEvent_EnableHotPlug,      %REG_DWORD%,    0
HKR,, DisableHotPlugDFP,	%REG_DWORD%,	1
HKR,, ExtEvent_EnableAlpsMouseOrientation,      %REG_DWORD%,    0
HKR,, ExtEvent_EnableMouseRotation,      %REG_DWORD%,    0
HKR,, DisableMMSnifferCode,               %REG_DWORD%,    0
HKR,, Catalyst_Version,,"04.3"
HKR,, DALRULE_BANDWIDTHMODEENUM, %REG_DWORD%, 1
HKR,, ExtEvent_LCDSetNativeModeOnResume,      %REG_DWORD%,    0
HKR,, DALRULE_ADAPTERBANDWIDTHMODEENUM,      %REG_DWORD%,    0
HKR,, TVEnableOverscan,      %REG_DWORD%,    1
HKR,, DALRULE_NOFORCEBOOT,       %REG_DWORD%,    1
HKR,, RotationSupportLevel,               %REG_DWORD%,    2
HKR,, NewRotation,               %REG_SZ%,    1
HKR,, DALRULE_ADDNATIVEMODESTOMODETABLE,    %REG_DWORD%,    1
HKR,, DALRULE_ALLOWMONITORRANGELIMITMODESCRT,      %REG_DWORD%,    1

[ati2mtag_Desktop_SoftwareDeviceSettings]

[ati2mtag_Mobile_SoftwareDeviceSettings]

[ati2mtag_FGL_SoftwareDeviceSettings]

[atioglxx_OpenGLSoftwareSettings]

[atioglgl_WsOpenGLSoftwareSettings]
HKR,, Capabilities, %REG_DWORD%, 0x00000000

[ati2mtag_FGL_LargeDesktopSettings]
HKR,, DALLargeDesktopModesBCD,        %REG_BINARY%, 12,80,04,80,00,00,00,60,06,40,09,60,00,00,00,60,16,00,06,00,00,00,00,60,08,00,12,00,00,00,00,60,20,48,07,68,00,00,00,60,10,24,15,36,00,00,00,60,23,04,08,64,00,00,00,60,11,52,17,28,00,00,00,60,25,60,10,24,00,00,00,60,12,80,20,48,00,00,00,60,32,00,12,00,00,00,00,60,16,00,24,00,00,08,00,60,16,00,24,00,00,16,00,60
HKR,, DALLargeDesktopModesBCD1,       %REG_BINARY%, 12,80,04,80,00,00,00,75,06,40,09,60,00,00,00,75,16,00,06,00,00,00,00,75,08,00,12,00,00,00,00,75,20,48,07,68,00,00,00,75,10,24,15,36,00,00,00,75,23,04,08,64,00,00,00,75,11,52,17,28,00,00,00,75,25,60,10,24,00,00,00,75,12,80,20,48,00,00,00,75,32,00,12,00,00,00,00,75,16,00,24,00,00,08,00,75,16,00,24,00,00,16,00,75
HKR,, DALLargeDesktopModesBCD2,       %REG_BINARY%, 12,80,04,80,00,00,00,85,06,40,09,60,00,00,00,85,16,00,06,00,00,00,00,85,08,00,12,00,00,00,00,85,20,48,07,68,00,00,00,85,10,24,15,36,00,00,00,85,23,04,08,64,00,00,00,85,11,52,17,28,00,00,00,85,25,60,10,24,00,00,00,85,12,80,20,48,00,00,00,85,32,00,12,00,00,00,00,85,16,00,24,00,00,08,00,85,16,00,24,00,00,16,00,85
HKR,, DALLargeDesktopModesBCD3,       %REG_BINARY%, 12,80,04,80,00,00,01,00,06,40,09,60,00,00,01,00,16,00,06,00,00,00,01,00,08,00,12,00,00,00,01,00,20,48,07,68,00,00,01,00,10,24,15,36,00,00,01,00,23,04,08,64,00,00,01,00,11,52,17,28,00,00,01,00,25,60,10,24,00,00,01,00,12,80,20,48,00,00,01,00,32,00,12,00,00,00,01,00,16,00,24,00,00,08,01,00,16,00,24,00,00,16,01,00
HKR,, DALLargeDesktopModesBCD4,        			%REG_BINARY%, 38,40,24,00,00,00,00,30,38,40,24,00,00,00,00,25,38,40,24,00,00,00,00,20

[ati2mtag_RemoveDeviceSettings]
HKR,, Adaptive De-interlacing
HKR,, AgpLevel
HKR,, AntiAlias
HKR,, DALCurrentObjectData
HKR,, DALLastConnected
HKR,, DALLastSelected
HKR,, DALLastTypes
HKR,, DALNonStandardModesBCD
HKR,, DALNonStandardModesBCD1
HKR,, DALNonStandardModesBCD2
HKR,, DALNonStandardModesBCD3
HKR,, DALNonStandardModesBCD4
HKR,, DALNonStandardModesBCD5
HKR,, DALObjectData
HKR,, DALObjectData0
HKR,, DALObjectData1
HKR,, DALR6 CRT_MaxModeInfo
HKR,, DALR6 CRT2_MaxModeInfo
HKR,, DALR6 DFP_MaxModeInfo
HKR,, DALR6 DFPx_MaxModeInfo
HKR,, DALR6 GCO_Index0
HKR,, DALRestrictedModesBCD
HKR,, DALRestrictedModesBCD1
HKR,, DALRestrictedModesBCD2
HKR,, DALRestrictedModesBCD3
HKR,, DALRestrictedModesBCD4
HKR,, DALRestrictedModesBCD5
HKR,, DALRULE_ADDNATIVEMODESTOMODETABLE
HKR,, DALRULE_CRTSUPPORTSALLMODES
HKR,, DALRULE_DISABLEBANDWIDTH
HKR,, DALRULE_DISPLAYSRESTRICTMODES
HKR,, DALRULE_NOCRTANDLCDONSAMECONTROLLER
HKR,, DALRULE_NOFORCEBOOT
HKR,, DALRULE_NOTVANDCRTONSAMECONTROLLER
HKR,, DALRULE_RESTRICTUNKNOWNMONITOR
HKR,, DALRULE_SAVEPANLOCK
HKR,, DALSelectObjectData0
HKR,, DALSelectObjectData1
HKR,, DDC2Disabled
HKR,, DefaultMode
HKR,, DFPRULE_HotplugSupported
HKR,, DisableAGP
HKR,, DisableAGPPM4
HKR,, DisableBlockWrite
HKR,, DisableD3D
HKR,, DisableDMA
HKR,, DisableDMACopy
HKR,, DisableDrvStretchBlt
HKR,, DisableEngine
HKR,, DisableEnumAllChilds
HKR,, DisableFullAdapterInit
HKR,, DisableHierarchicalZ
HKR,, DisableIDCT
HKR,, DisableLCD
HKR,, DisableMMLIB
HKR,, DisableOpenGLScrAccelerate
HKR,, DisablePllInit
HKR,, DisablePrimaryTiling
HKR,, DisableTCL
HKR,, DisableTiling
HKR,, DisableTimeStampWriteBack
HKR,, DisableUSWC
HKR,, DisableVPE
HKR,, EnableWaitUntilIdxTriList2
HKR,, GCORULE_HIGHDISPRI
HKR,, GCORULE_R200TVPLLWA
HKR,, LVB
HKR,, MaxAgpVb
HKR,, MaxAGPVB
HKR,, MaxLocalVb
HKR,, MaxLocalVB
HKR,, SubmitOnDraw
HKR,, TestEnv
HKR,, TimingSelection
HKR,, TVR200Flag
HKR,, VgaCompatible
HKR,, VPE Adaptive De-interlacing
HKR,, ATIPoll
HKR,, DALRULE_LARGEPANELSUPPORT
HKR,, DFPRULE_ResyncCRTCs
HKR,, GCORULE_SameDividersForIntAndExtTMDS
HKR,, DALOPTION_MinResBCD
HKR,, DALOPTION_MaxResBCD
HKR,, DALOPTION_MinRes2BCD
HKR,, DALOPTION_MaxRes2BCD
HKR,, GCORULE_ForceCoherentTMDSForHighMode
HKR,, DALRV100TMDSiReducedBlanking
HKR,, DALRV200TMDSiReducedBlanking
HKR,, DALR200TMDSiReducedBlanking
HKR,, DALRV250TMDSiReducedBlanking
HKR,, DALRV280TMDSiReducedBlanking
HKR,, DALRV350TMDSiReducedBlanking
HKR,, DALR300TMDSiReducedBlanking
HKR,, DALR350TMDSiReducedBlanking
HKR,, DALR360TMDSiReducedBlanking
HKR,, DALATI M6TMDSiReducedBlanking
HKR,, DALATI M7TMDSiReducedBlanking
HKR,, DALATI M9TMDSiReducedBlanking
HKR,, DALATI M9 PLUSTMDSiReducedBlanking
HKR,, DALM10TMDSiReducedBlanking
HKR,, DALRV380TMDSiReducedBlanking
HKR,, DALR420TMDSiReducedBlanking
HKR,, DALM18TMDSiReducedBlanking
HKR,, DALM24TMDSiReducedBlanking
HKR,, DALR300TMDSiCoherentMode
HKR,, DALR350TMDSiCoherentMode
HKR,, DALR360TMDSiCoherentMode
HKR,, DALRV280TMDSiCoherentMode
HKR,, DALRV350TMDSiCoherentMode
HKR,, DALATI M9 PLUSTMDSiCoherentMode
HKR,, DALM10TMDSiCoherentMode
HKR,, DALRV380TMDSiCoherentMode
HKR,, DALR420TMDSiCoherentMode
HKR,, DALM18TMDSiCoherentMode
HKR,, DALM24TMDSiCoherentMode
HKR,, DALRULE_MODESUPPORTEDSIMPLECHECK
HKR,, DALRULE_DISPLAYSRESTRICTMODESLARGEDESKTOP
HKR,, DAL2ndDisplayDefaultMode
HKR,, DisableDynamicEnableMode
HKR,, DisableRptrWriteBack
HKR,, GCORULE_MemoryClockGraduallyChange
HKR,, DALRULE_AUTOGENERATELARGEDESKTOPMODES
HKR,, UseCentredCVTiming
HKR,, DALRULE_POWERPLAYFORCEREFRESHSCREEN
HKR,, GI
HKR,, DefaultSettings.BitsPerPel
HKR,, DefaultSettings.XResolution
HKR,, DefaultSettings.YResolution
HKR,, DefaultSettings.VRefresh
HKR,, ExtEvent_EnableFjsuMouseOrientation
HKR,, ExtEvent_BroadcastDispChange
HKR,, ExtEvent_EnablePowerPlay
HKR,, ExtEvent_DriverMessageSupport
HKR,, ExtEvent_UpdateAdapterInfoOnHK
HKR,, ExtEvent_LCDSetMaxResOnDockChg
HKR,, HDTVRULE_HDTVGDOENABLE
HKR,, HDTVRULE_HDTVSIGNALFORMAT
HKR,, GCORULE_TMDSiCoherentMode
HKR,, GCOHOOK_TMDSiCoherentMode
HKR,, ExtEvent_RestoreLargeDesktopOnResume
HKR,, DALRULE_RESTRICTNONDDCCRTTO1024x768
HKR,, DALRULE_DISABLEOVERDRIVE
HKR,, DALOverdrive
HKR,, ExtEvent_OverDriveSupport
HKR,, DALRULE_GETDEFAULTTVFORMATATBOOT
HKR,, DALRULE_USEENABLEDATBOOTSCHEME
HKR,, DisableCursor
HKR,, GCOOPTION_RemoveOverscanBorder
HKR,, UseBT601CSC
HKR,, DALRULE_SETCRTANDDFPTYPESONPRIMARYCONTROLLER
HKR,, BootInLandscape
HKR,, BootInLandscapeDefaultModeBCD
HKR,, DALRULE_LCDENABLEDONPRIMARYCONTROLLER
HKR,, CVRULE_CENTRETIMINGDISABLED
HKR,, DAL2ndDrvMin1stMode
HKR,, GCORULE_CloneModeBWException
HKR,, CRTRULE_FORCECRTDAC1DETECTED
HKR,, CRTRULE_FORCECRTDAC2DETECTED
HKR,, CRTRULE_FORCECRTDACTYPESDETECTED
HKR,, DisableAGPSizeOverride
HKR,, DALRULE_NOTVANDDVIACTIVESIMULTANEOUSLY
HKR,, CVRULE_CUSTOMIZEDMODESENABLED
HKR,, GCORULE_TMDSReducedBlankingUseCVT
HKR,, LRTCEnable
HKR,, DFPOption_SingleLink
HKR,, DFPXOption_SingleLink
HKR,, R6LCD_ALLOWDISABLELOWREFRESHBYUSER
HKR,, TVDACSettings
HKR,, GCORULE_TMDSForceReducedBlanking
HKR,, DALRULE_CUSTOMODSUPPORT
HKR,, DXVA_ELEGANT
HKR,, ExtEvent_EnableChgCVResOnHotKey
HKR,, GCOOPTION_DefaultOvlBrightness
HKR,, GCOOPTION_DefaultOvlSaturation
HKR,, GCOOPTION_DefaultOvlContrast
HKR,, DAL_CRTRestrictedModesBCD
HKR,, DeltaAgpPoolSize
HKR,, InitialAgpPoolSize
HKR,, DALRULE_NOCRTANDTVACTIVESIMULTANEOUSLY

[ati2mtag_RV100.GeneralConfigData]
MaximumDeviceMemoryConfiguration=128

[ati2mtag_RV280.GeneralConfigData]
MaximumDeviceMemoryConfiguration=128

[ati2mtag_R300.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R350.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R360.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV350.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV360.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV370.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV380.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV410.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R420.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R423.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R480.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_M10.GeneralConfigData]
MaximumDeviceMemoryConfiguration=128

[ati2mtag_R300GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R350GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV350GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV370GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_RV380GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R420GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256

[ati2mtag_R423GL.GeneralConfigData]
MaximumDeviceMemoryConfiguration=256




[Strings]
;
; Non-Localizable Strings
;
REG_SZ         = 0x00000000
REG_MULTI_SZ   = 0x00010000
REG_EXPAND_SZ  = 0x00020000
REG_BINARY     = 0x00000001
REG_DWORD      = 0x00010001
SERVICEROOT    = System\CurrentControlSet\Services
;
; Localizable Strings
;
DiskId       = "ATI Technologies Inc. Installation DISK (VIDEO)"
GraphAdap    = "Graphics Adapter"
ATI          = "ATI Technologies Inc."
ATIR200="Chaplin (R200)" 
