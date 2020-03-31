; NVIDIA Windows AMD64 Display INF file
; Copyright (c) NVIDIA Corporation. All rights reserved.

[Version]
Signature   = "$Windows NT$"
Provider    = %NVIDIA%
LayoutFile  = layout.inf
ClassGUID   = {4D36E968-E325-11CE-BFC1-08002BE10318}
Class       = Display
DriverVer   = 12/06/2004, 6.7.6.1

[DestinationDirs]
DefaultDestDir        = 11
nv4.Miniport          = 12
nv.Display            = 11
nv.oldrm              = 12
nv.delete.systemfiles = 11

[Manufacturer]
%NVIDIA% = NVIDIA.Mfg,NTamd64

[NVIDIA.Mfg.NTamd64]
%NVIDIA_NV17.DEV_0170.1% = nv4,                      PCI\VEN_10DE&DEV_0170
%NVIDIA_NV17.DEV_0171.1% = nv4,                      PCI\VEN_10DE&DEV_0171
%NVIDIA_NV17.DEV_0172.1% = nv4,                      PCI\VEN_10DE&DEV_0172
%NVIDIA_NV17.DEV_0173.1% = nv4,                      PCI\VEN_10DE&DEV_0173
%NVIDIA_NV17.DEV_0178.1% = nv4,                      PCI\VEN_10DE&DEV_0178
%NVIDIA_NV17.DEV_017A.1% = nv4,                      PCI\VEN_10DE&DEV_017A
%NVIDIA_NV18.DEV_0181.1% = nv4,                      PCI\VEN_10DE&DEV_0181
%NVIDIA_NV18.DEV_0182.1% = nv4,                      PCI\VEN_10DE&DEV_0182
%NVIDIA_NV18.DEV_0183.1% = nv4,                      PCI\VEN_10DE&DEV_0183
%NVIDIA_NV18.DEV_0185.1% = nv4,                      PCI\VEN_10DE&DEV_0185
%NVIDIA_NV18.DEV_0188.1% = nv4,                      PCI\VEN_10DE&DEV_0188
%NVIDIA_NV18.DEV_018A.1% = nv4,                      PCI\VEN_10DE&DEV_018A
%NVIDIA_NV18.DEV_018B.1% = nv4,                      PCI\VEN_10DE&DEV_018B
%NVIDIA_NV30.DEV_0301.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0301
%NVIDIA_NV30.DEV_0302.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0302
%NVIDIA_NV30.DEV_0308.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0308
%NVIDIA_NV30.DEV_0309.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0309
%NVIDIA_NV31.DEV_0311.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0311
%NVIDIA_NV31.DEV_0312.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0312
%NVIDIA_NV31.DEV_0314.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0314
%NVIDIA_NV34.DEV_0320.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0320
%NVIDIA_NV34.DEV_0321.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0321
%NVIDIA_NV34.DEV_0322.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0322
%NVIDIA_NV34.DEV_0323.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0323
%NVIDIA_NV34.DEV_0326.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0326
%NVIDIA_NV34.DEV_0327.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0327
%NVIDIA_NV34.DEV_032A.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_032A
%NVIDIA_NV34.DEV_032B.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_032B
%NVIDIA_NV35.DEV_0330.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0330
%NVIDIA_NV35.DEV_0331.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0331
%NVIDIA_NV35.DEV_0332.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0332
%NVIDIA_NV35.DEV_0333.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0333
%NVIDIA_NV35.DEV_0334.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0334
%NVIDIA_NV35.DEV_0338.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0338
%NVIDIA_NV35.DEV_033F.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_033F
%NVIDIA_NV36.DEV_0341.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0341
%NVIDIA_NV36.DEV_0342.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0342
%NVIDIA_NV36.DEV_0343.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0343
%NVIDIA_NV36.DEV_0344.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0344
%NVIDIA_NV40.DEV_0040.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0040
%NVIDIA_NV40.DEV_0041.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0041
%NVIDIA_NV40.DEV_0042.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0042
%NVIDIA_NV40.DEV_0045.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0045
%NVIDIA_NV40.DEV_004E.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_004E
%NVIDIA_NV41.DEV_00C1.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00C1
%NVIDIA_NV43.DEV_0140.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0140
%NVIDIA_NV43.DEV_0141.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_0141
%NVIDIA_BR02.DEV_00F1.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00F1
%NVIDIA_BR02.DEV_00F2.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00F2
%NVIDIA_BR02.DEV_00F8.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00F8
%NVIDIA_BR02.DEV_00F9.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00F9
%NVIDIA_BR02.DEV_00FA.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00FA
%NVIDIA_BR02.DEV_00FB.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00FB
%NVIDIA_BR02.DEV_00FC.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00FC
%NVIDIA_BR02.DEV_00FD.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00FD
%NVIDIA_BR02.DEV_00FE.1% = nv4_NV3x,                 PCI\VEN_10DE&DEV_00FE

[ControlFlags]
ExcludeFromSelect = *

[nv4]
CopyFiles    = nv4.Miniport, nv.Display
DelFiles     = nv.oldrm, nv.delete.systemfiles

[nv4.SoftwareSettings]
AddReg = nv_SoftwareDeviceSettings
AddReg = Default16BPP_AddReg
DelReg = nv_ClearRegistrySwitches

[nv4.Services]
AddService = nv,    0x00000002, nv4_Generic_Service_Inst, nv4_EventLog_Inst
DelService = nvarch
DelService = nvgfx
DelService = nvsvc

[nv4.GeneralConfigData]
MaximumDeviceMemoryConfiguration = 80
MaximumNumberOfDevices           = 4

[nv4_NV3x]
CopyFiles    = nv4.Miniport, nv.Display
DelFiles     = nv.oldrm, nv.delete.systemfiles

[nv4_NV3x.SoftwareSettings]
AddReg = nv_SoftwareDeviceSettings
AddReg = Default16BPP_AddReg
DelReg = nv_ClearRegistrySwitches

[nv4_NV3x.Services]
AddService = nv,    0x00000002, nv4_Generic_Service_Inst, nv4_EventLog_Inst
DelService = nvarch
DelService = nvgfx
DelService = nvsvc

[nv4_NV3x.GeneralConfigData]
MaximumDeviceMemoryConfiguration = 128
MaximumNumberOfDevices           = 4

[nv4_Generic_Service_Inst]
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 0                  ; SERVICE_ERROR_IGNORE
LoadOrderGroup = Video
ServiceBinary  = %12%\nv4_mini.sys
AddReg         = nv4_Generic_Service_AddReg

[nv4_EventLog_Inst]
AddReg = nv4_EventLog_AddReg

[nv4_EventLog_AddReg]
HKR,, EventMessageFile, 0x00020000, "%SystemRoot%\System32\IoLogMsg.dll;%SystemRoot%\System32\drivers\nv4_mini.sys"
HKR,, TypesSupported,   0x00010001, 7

[nv4_Generic_Service_AddReg]
HKR, Video, Service, %REG_SZ%, nv

[nv.Display]
nv4_disp.dll

[nv4.Miniport]
nv4_mini.sys

[nv.oldrm]
nvarch.sys,,,1
nvgfx.sys,,,1

[nv.delete.systemfiles]
nv4oglnt.dll,,,1
nvopenglnt.dll,,,1
nvinstnt.dll,,,1
nvdmcpl.dll,,,1
nvdesk32.dll,,,1
nvqtwk.dll,,,1
dmcpl.exe,,,1
nviewimg.dll,,,1
nvnt4cpl.dll,,,1
nvcpl.dll,,,1

[nv_SoftwareDeviceSettings]
HKR,, InstalledDisplayDrivers,     %REG_MULTI_SZ%, nv4_disp
HKR,, VgaCompatible,               %REG_DWORD%,    0
HKR,, NV_R&T,                      %REG_MULTI_SZ%, "R&T0000=*,*,*,*,*,IBM251F.VSC2F0C.VSC3411.VSC3E19,HDLK"
HKR,, NV_R&T,                      %REG_SZ_APPEND%,"R&T0001=1920,1080,*,30,*,CRTX,OEM,7425,2200,48,56,562,2,5,++I"
HKR,, "DefaultSettings.XResolution",%REG_DWORD%,800
HKR,, "DefaultSettings.YResolution",%REG_DWORD%,600
HKR,, CapabilityOverride,          %REG_DWORD%,    8
HKR,, NV_Modes, %REG_MULTI_SZ%,  "{*}S 720x480 720x576=1;320x200 320x240 400x300 480x360 512x384 640x400=F;SHV 1920x1080x32 1920x1200x32 1920x1440 2048x1536=1F;640x480 800x600 848x480 960x600 1024x768x8,16 1088x612x8,16=1FFF;1600x1024x32 1600x1200x32 1920x1080x8,16 1920x1200x8,16=3F;1280x720x32 1280x768x32 1280x800x32 1280x960x32 1280x1024x32 1360x768x32 1600x900x8,16=3FF;1600x900x32 1600x1024x8,16 1600x1200x8,16=7F;"
HKR,, NV_Modes, %REG_SZ_APPEND%, "1152x864x32 1280x720x8,16 1280x768x8,16 1280x800x8,16 1280x960x8,16 1280x1024x8,16 1360x768x8,16=7FF;1920x1080=C01E;1024x768x32 1088x612x32 1152x864x8,16=FFF;{49-4E,CE,14B-14E,170-1F0,308-30A,32A-32F,338-33F,34E,34F}SH 960x1200=803D;{49-4E,CE,14B-14E,170-1F0,338,33F}SHV 800x600 1024x768 1280x1024 1600x1200 1920x1154 1920x1200=8032;"

[Default16BPP_AddReg]
HKR,, "DefaultSettings.BitsPerPel",%REG_DWORD%,16

[Default32BPP_AddReg]
HKR,, "DefaultSettings.BitsPerPel",%REG_DWORD%,32

[nv_ClearRegistrySwitches]
HKR,, NVREGSWITCHES
HKR,, NV4_Modes
HKR,, NV5_Modes
HKR,, NV0A_Modes
HKR,, NVVANTA_Modes
HKR,, NV5M64_Modes
HKR,, NV5ULTRA_Modes
HKR,, NV10_Modes
HKR,, NV10DDR_Modes
HKR,, NV10GL_Modes
HKR,, NV11_Modes
HKR,, NV11DDR_Modes
HKR,, NV11GL_Modes
HKR,, CRUSH11_Modes
HKR,, NV15_Modes
HKR,, NV15DDR_Modes
HKR,, NV15BR_Modes
HKR,, NV15GL_Modes
HKR,, NV17_Modes
HKR,, NV17GL_Modes
HKR,, NV18_Modes
HKR,, NV18GL_Modes
HKR,, NV1F_Modes
HKR,, NV20_Modes
HKR,, NV20_1_Modes
HKR,, NV20_2_Modes
HKR,, NV20_3_Modes
HKR,, NV25_Modes
HKR,, NV25GL_Modes
HKR,, NV28_Modes
HKR,, NV28GL_Modes
HKR,, NV30_Modes
HKR,, NV30GL_Modes
HKR,, NV4_Modes_Delta
HKR,, NV5_Modes_Delta
HKR,, NV0A_Modes_Delta
HKR,, NVVANTA_Modes_Delta
HKR,, NV5M64_Modes_Delta
HKR,, NV5ULTRA_Modes_Delta
HKR,, NV10_Modes_Delta
HKR,, NV10DDR_Modes_Delta
HKR,, NV10GL_Modes_Delta
HKR,, NV11_Modes_Delta
HKR,, NV11DDR_Modes_Delta
HKR,, NV11M_Modes_Delta
HKR,, NV11GL_Modes_Delta
HKR,, CRUSH11_Modes_Delta
HKR,, NV15_Modes_Delta
HKR,, NV15DDR_Modes_Delta
HKR,, NV15BR_Modes_Delta
HKR,, NV15GL_Modes_Delta
HKR,, NV20_Modes_Delta
HKR,, NV20_1_Modes_Delta
HKR,, NV20_2_Modes_Delta
HKR,, NV20_3_Modes_Delta
HKR,, NV17_Modes_Delta
HKR,, NV17GL_Modes_Delta
HKR,, NV18_Modes_Delta
HKR,, NV18GL_Modes_Delta
HKR,, NV1F_Modes_Delta
HKR,, NV25_Modes_Delta
HKR,, NV25GL_Modes_Delta
HKR,, NV28_Modes_Delta
HKR,, NV28GL_Modes_Delta
HKR,, NV30_Modes_Delta
HKR,, NV30GL_Modes_Delta
HKR,, DCBOverride0
HKR,, DCBOverride1
HKR,, NV_Modes
HKR,, UseCompressedModeFormat
HKR,, FlatPanelMode
HKR,, DMTOVERRIDE
HKR,, DisableExtRefresh
HKR,, Max16x12
HKR,, Disable19x12x32at60
HKR,, Disable16x12x32ge70
HKR,, Disable19x10x32ge70
HKR,, DellSwitch1
HKR,, OglStencil
HKR,, OGL_EnableFSAA
HKR,, OGL_DefaultSwapInterval
HKR,, OGL_TexMemorySpaceEnables
HKR,, OGL_TexStagingBufferSize
HKR,, OGL_TexStagingBufferMultSize
HKR,, OGL_DLStagingBufferSizeWords
HKR,, OGL_DlMemorySpaceEnables
HKR,, "4x42.exe:OGL_TexClampBehavior"
HKR,, "_4x42.exe:OGL_TexClampBehavior"
HKR,, "_alice.exe:OGL_TexClampBehavior"
HKR,, "_codmp.exe:OGL_TexClampBehavior"
HKR,, "_codsp.exe:OGL_TexClampBehavior"
HKR,, "_diablo ii.exe:OGL_TexClampBehavior"
HKR,, "_et.exe:OGL_TexClampBehavior"
HKR,, "_idmain.exe:OGL_TexClampBehavior"
HKR,, "_jamp.exe:OGL_TexClampBehavior"
HKR,, "_jasp.exe:OGL_TexClampBehavior"
HKR,, "_jk2mp.exe:OGL_TexClampBehavior"
HKR,, "_jk2sp.exe:OGL_TexClampBehavior"
HKR,, "_moh_breakthrough.exe:OGL_ExtensionStringVersion"
HKR,, "_moh_breakthrough.exe:OGL_TexClampBehavior"
HKR,, "_moh_breakthrough_demo.exe:OGL_ExtensionStringVersion"
HKR,, "_moh_breakthrough_demo.exe:OGL_TexClampBehavior"
HKR,, "_moh_spearhead.exe:OGL_ExtensionStringVersion"
HKR,, "_moh_spearhead.exe:OGL_TexClampBehavior"
HKR,, "_moh_spearhead_demo.exe:OGL_ExtensionStringVersion"
HKR,, "_moh_spearhead_demo.exe:OGL_TexClampBehavior"
HKR,, "_mohaa.exe:OGL_ExtensionStringVersion"
HKR,, "_mohaa.exe:OGL_TexClampBehavior"
HKR,, "_oni.exe:OGL_ExtensionStringNVArch"
HKR,, "_quake3.exe:OGL_TexClampBehavior"
HKR,, "_sof2.exe:OGL_TexClampBehavior"
HKR,, "_sof2mp.exe:OGL_TexClampBehavior"
HKR,, "_vcvisual:OGL_ExtensionStringVersion"
HKR,, "_wolfmp.exe:OGL_TexClampBehavior"
HKR,, "_wolfsp.exe:OGL_TexClampBehavior"
HKR,, "_x29.exe:OGL_ExtensionStringVersion"
HKR,, "alice.exe:OGL_TexClampBehavior"
HKR,, "codmp.exe:OGL_TexClampBehavior"
HKR,, "codsp.exe:OGL_TexClampBehavior"
HKR,, "diablo ii.exe:OGL_TexClampBehavior"
HKR,, "et.exe:OGL_TexClampBehavior"
HKR,, "idmain.exe:OGL_TexClampBehavior"
HKR,, "jamp.exe:OGL_TexClampBehavior"
HKR,, "jasp.exe:OGL_TexClampBehavior"
HKR,, "jk2mp.exe:OGL_TexClampBehavior"
HKR,, "jk2sp.exe:OGL_TexClampBehavior"
HKR,, "moh_breakthrough.exe:OGL_ExtensionStringVersion"
HKR,, "moh_breakthrough.exe:OGL_TexClampBehavior"
HKR,, "moh_breakthrough_demo.exe:OGL_ExtensionStringVersion"
HKR,, "moh_breakthrough_demo.exe:OGL_TexClampBehavior"
HKR,, "moh_spearhead.exe:OGL_ExtensionStringVersion"
HKR,, "moh_spearhead.exe:OGL_TexClampBehavior"
HKR,, "moh_spearhead_demo.exe:OGL_ExtensionStringVersion"
HKR,, "moh_spearhead_demo.exe:OGL_TexClampBehavior"
HKR,, "mohaa.exe:OGL_ExtensionStringVersion"
HKR,, "mohaa.exe:OGL_TexClampBehavior"
HKR,, "oni.exe:OGL_ExtensionStringNVArch"
HKR,, "quake3.exe:OGL_TexClampBehavior"
HKR,, "sof2.exe:OGL_TexClampBehavior"
HKR,, "sof2mp.exe:OGL_TexClampBehavior"
HKR,, "wolfmp.exe:OGL_TexClampBehavior"
HKR,, "wolfsp.exe:OGL_TexClampBehavior"
HKR,, "x29.exe:OGL_ExtensionStringVersion"
HKR,, TwinViewInfo
HKR,, PrevTwinViewInfo
HKR,, SaveSettings
HKR,, NvCplConfiguration
HKR,, EnableWin2KDualview
HKR,, NV_R&T
HKR,, EdgeBlendingData
HKR,, NT4MultiDevEnable
HKR,, D3D_60461791
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\OpenGLDrivers",RIVATNT
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\NVIDIA"
HKLM,"Software\NVIDIA Corporation\RIVA TNT\OpenGL"
HKLM,"SYSTEM\CurrentControlSet\Hardware Profiles\Current\System\CurrentControlSet\SERVICES\NV4\DEVICE0"
HKLM,"SYSTEM\CurrentControlSet\Hardware Profiles\Current\System\CurrentControlSet\SERVICES\NV"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Controls Folder\Display\shellex\PropertySheetHandlers\NVIDIA NT4 Multimon CPL"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Controls Folder\Device\shellex\PropertySheetHandlers\NVIDIA CPL Extension"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{6D0E6651-1CD8-11d6-92C4-0003479E4848}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{FFB699E0-306A-11d3-8BD1-00104B6F7516}
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Run",NvCplDaemon
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Run",Nwiz
HKR,, DisableVersionCheck
HKR,, DrvOptions
HKCU,"Software\NVIDIA Corporation\Global\Display"
HKLM,"Software\NVIDIA Corporation\Global\Display"
HKCU,"Software\NVIDIA Corporation\Global\NVTweak"
HKLM,"Software\NVIDIA Corporation\Global\NVTweak"
HKCU,"Software\NVIDIA Corporation\Global\NVSvc"
HKLM,"Software\NVIDIA Corporation\Global\NVSvc"
HKCU,Software\Microsoft\Windows\CurrentVersion\Run,NvMediaCenter
HKCU,"Software\NVIDIA Corporation\Global\OpenGL"
HKLM,"Software\NVIDIA Corporation\Global\OpenGL"
HKR,, NvCplDisplayTvLocaleVisited
HKR,, NvCplEnableHardwarePage
HKR,, NvCplTwinViewInDualView
HKR,, NvCplTvLocaleAutoDetect
HKR,, NvCplEnablenForcePage

[Strings]
; Non-Localizable Strings
REG_SZ         = 0x00000000
REG_MULTI_SZ   = 0x00010000
REG_EXPAND_SZ  = 0x00020000
REG_BINARY     = 0x00000001
REG_DWORD      = 0x00010001
REG_SZ_APPEND  = 0x00010008

; Localizable Strings
NVIDIA                 = "NVIDIA"
NVIDIA_NV17.DEV_0170.1 = "NVIDIA GeForce4 MX 460 (Microsoft Corporation)"
NVIDIA_NV17.DEV_0171.1 = "NVIDIA GeForce4 MX 440 (Microsoft Corporation)"
NVIDIA_NV17.DEV_0172.1 = "NVIDIA GeForce4 MX 420 (Microsoft Corporation)"
NVIDIA_NV17.DEV_0173.1 = "NVIDIA GeForce4 MX 440-SE (Microsoft Corporation)"
NVIDIA_NV17.DEV_0178.1 = "NVIDIA Quadro4 550 XGL (Microsoft Corporation)"
NVIDIA_NV17.DEV_017A.1 = "NVIDIA Quadro NVS (Microsoft Corporation)"
NVIDIA_NV18.DEV_0181.1 = "NVIDIA GeForce4 MX 440 with AGP8X (Microsoft Corporation)"
NVIDIA_NV18.DEV_0182.1 = "NVIDIA GeForce4 MX 440SE with AGP8X (Microsoft Corporation)"
NVIDIA_NV18.DEV_0183.1 = "NVIDIA GeForce4 MX 420 with AGP8X (Microsoft Corporation)"
NVIDIA_NV18.DEV_0185.1 = "NVIDIA GeForce4 MX 4000 (Microsoft Corporation)"
NVIDIA_NV18.DEV_0188.1 = "NVIDIA Quadro4 580 XGL (Microsoft Corporation)"
NVIDIA_NV18.DEV_018A.1 = "NVIDIA Quadro NVS with AGP8X (Microsoft Corporation)"
NVIDIA_NV18.DEV_018B.1 = "NVIDIA Quadro4 380 XGL (Microsoft Corporation)"
NVIDIA_NV30.DEV_0301.1 = "NVIDIA GeForce FX 5800 Ultra (Microsoft Corporation)"
NVIDIA_NV30.DEV_0302.1 = "NVIDIA GeForce FX 5800 (Microsoft Corporation)"
NVIDIA_NV30.DEV_0308.1 = "NVIDIA Quadro FX 2000 (Microsoft Corporation)"
NVIDIA_NV30.DEV_0309.1 = "NVIDIA Quadro FX 1000 (Microsoft Corporation)"
NVIDIA_NV31.DEV_0311.1 = "NVIDIA GeForce FX 5600 Ultra (Microsoft Corporation)"
NVIDIA_NV31.DEV_0312.1 = "NVIDIA GeForce FX 5600 (Microsoft Corporation)"
NVIDIA_NV31.DEV_0314.1 = "NVIDIA GeForce FX 5600XT (Microsoft Corporation)"
NVIDIA_NV34.DEV_0320.1 = "NVIDIA GeForce FX 5200 (Microsoft Corporation)"
NVIDIA_NV34.DEV_0321.1 = "NVIDIA GeForce FX 5200 Ultra (Microsoft Corporation)"
NVIDIA_NV34.DEV_0322.1 = "NVIDIA GeForce FX 5200 (Microsoft Corporation)"
NVIDIA_NV34.DEV_0323.1 = "NVIDIA GeForce FX 5200LE (Microsoft Corporation)"
NVIDIA_NV34.DEV_0326.1 = "NVIDIA GeForce FX 5500 (Microsoft Corporation)"
NVIDIA_NV34.DEV_0327.1 = "NVIDIA GeForce FX 5100 (Microsoft Corporation)"
NVIDIA_NV34.DEV_032A.1 = "NVIDIA Quadro NVS 280 (Microsoft Corporation)"
NVIDIA_NV34.DEV_032B.1 = "NVIDIA Quadro FX 500/FX 600 (Microsoft Corporation)"
NVIDIA_NV35.DEV_0330.1 = "NVIDIA GeForce FX 5900 Ultra (Microsoft Corporation)"
NVIDIA_NV35.DEV_0331.1 = "NVIDIA GeForce FX 5900 (Microsoft Corporation)"
NVIDIA_NV35.DEV_0332.1 = "NVIDIA GeForce FX 5900XT (Microsoft Corporation)"
NVIDIA_NV35.DEV_0333.1 = "NVIDIA GeForce FX 5950 Ultra (Microsoft Corporation)"
NVIDIA_NV35.DEV_0334.1 = "NVIDIA GeForce FX 5900ZT (Microsoft Corporation)"
NVIDIA_NV35.DEV_0338.1 = "NVIDIA Quadro FX 3000 (Microsoft Corporation)"
NVIDIA_NV35.DEV_033F.1 = "NVIDIA Quadro FX 700 (Microsoft Corporation)"
NVIDIA_NV36.DEV_0341.1 = "NVIDIA GeForce FX 5700 Ultra (Microsoft Corporation)"
NVIDIA_NV36.DEV_0342.1 = "NVIDIA GeForce FX 5700 (Microsoft Corporation)"
NVIDIA_NV36.DEV_0343.1 = "NVIDIA GeForce FX 5700LE (Microsoft Corporation)"
NVIDIA_NV36.DEV_0344.1 = "NVIDIA GeForce FX 5700VE (Microsoft Corporation)"
NVIDIA_NV40.DEV_0040.1 = "NVIDIA GeForce 6800 Ultra (Microsoft Corporation)"
NVIDIA_NV40.DEV_0041.1 = "NVIDIA GeForce 6800 (Microsoft Corporation)"
NVIDIA_NV40.DEV_0042.1 = "NVIDIA GeForce 6800 LE (Microsoft Corporation)"
NVIDIA_NV40.DEV_0045.1 = "NVIDIA GeForce 6800 GT (Microsoft Corporation)"
NVIDIA_NV40.DEV_004E.1 = "NVIDIA Quadro FX 4000 (Microsoft Corporation)"
NVIDIA_NV41.DEV_00C1.1 = "NVIDIA GeForce 6800 (Microsoft Corporation)"
NVIDIA_NV43.DEV_0140.1 = "NVIDIA GeForce 6600 GT (Microsoft Corporation)"
NVIDIA_NV43.DEV_0141.1 = "NVIDIA GeForce 6600 (Microsoft Corporation)"
NVIDIA_BR02.DEV_00F1.1 = "NVIDIA GeForce 6600 GT (Microsoft Corporation)"
NVIDIA_BR02.DEV_00F2.1 = "NVIDIA GeForce 6600 (Microsoft Corporation)"
NVIDIA_BR02.DEV_00F8.1 = "NVIDIA Quadro FX 3400 (Microsoft Corporation)"
NVIDIA_BR02.DEV_00F9.1 = "NVIDIA GeForce 6800 Series GPU (Microsoft Corporation)"
NVIDIA_BR02.DEV_00FA.1 = "NVIDIA GeForce PCX 5750 (Microsoft Corporation)"
NVIDIA_BR02.DEV_00FB.1 = "NVIDIA GeForce PCX 5900 (Microsoft Corporation)"
NVIDIA_BR02.DEV_00FC.1 = "NVIDIA GeForce PCX 5300 (Microsoft Corporation)"
NVIDIA_BR02.DEV_00FD.1 = "NVIDIA Quadro PCI-E Series (Microsoft Corporation)"
NVIDIA_BR02.DEV_00FE.1 = "NVIDIA Quadro FX 1300 (Microsoft Corporation)"