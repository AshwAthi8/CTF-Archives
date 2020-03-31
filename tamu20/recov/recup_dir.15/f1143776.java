0000102: The required line was not found in the INF.
[2020/03/01 19:06:13 264.1531 Driver Install]
#-019 Searching for hardware ID(s): ms_l2tpminiport
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "MS_L2tpMiniport" in C:\WINDOWS\INF\netrasa.inf; Device: "WAN Miniport (L2TP)"; Driver: "WAN Miniport (L2TP)"; Provider: "Microsoft"; Mfg: "Microsoft"; Section name: "Ndi-Mp-L2tp".
#I023 Actual install section: [Ndi-Mp-L2tp]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#I063 Selected driver installs from section [Ndi-Mp-L2tp] in "c:\windows\inf\netrasa.inf".
#I320 Class GUID of device remains: {4D36E972-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [Ndi-Mp-L2tp.Interfaces] from "c:\windows\inf\netrasa.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ROOT\MS_L2TPMINIPORT\0000".
#I121 Device install of "ROOT\MS_L2TPMINIPORT\0000" finished successfully.
[2020/03/01 19:06:13 264.1538 Driver Install]
#-019 Searching for hardware ID(s): ms_pptp
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "MS_PPTP" in C:\WINDOWS\INF\netrast.inf; Device: "Point to Point Tunneling Protocol"; Driver: "Point to Point Tunneling Protocol"; Provider: "Microsoft"; Mfg: "Microsoft"; Section name: "Ndi-PptpProtocol".
#I023 Actual install section: [Ndi-PptpProtocol]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#I063 Selected driver installs from section [Ndi-PptpProtocol] in "c:\windows\inf\netrast.inf".
#I320 Class GUID of device remains: {4D36E975-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
[2020/03/01 19:06:13 264.1540]
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#W082 Could not locate a non-empty service section [Ndi-PptpProtocol.Services] in "c:\windows\inf\netrast.inf". Error 0xe0000102: The required line was not found in the INF.
[2020/03/01 19:06:13 264.1544 Driver Install]
#-019 Searching for hardware ID(s): ms_pptpminiport
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "MS_PptpMiniport" in C:\WINDOWS\INF\netrasa.inf; Device: "WAN Miniport (PPTP)"; Driver: "WAN Miniport (PPTP)"; Provider: "Microsoft"; Mfg: "Microsoft"; Section name: "Ndi-Mp-Pptp".
#I023 Actual install section: [Ndi-Mp-Pptp]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#I063 Selected driver installs from section [Ndi-Mp-Pptp] in "c:\windows\inf\netrasa.inf".
#I320 Class GUID of device remains: {4D36E972-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [Ndi-Mp-Pptp.Interfaces] from "c:\windows\inf\netrasa.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ROOT\MS_PPTPMINIPORT\0000".
#I121 Device install of "ROOT\MS_PPTPMINIPORT\0000" finished successfully.
[2020/03/01 19:06:14 264.1551 Driver Install]
#-019 Searching for hardware ID(s): ms_pppoe
#-199 Executing "C:\WINDOWS\system32\setup.000228: There are no compatible drivers for this device.
#W157 Default installer failed. Error 0xe0000228: There are no compatible drivers for this device.
#I060 Set selected driver.
#-166 Device install function: DIF_INSTALLDEVICE.
#I125 Installing NULL driver for "ROOT\LEGACY_VOLSNAP\0000".
#W100 Query-removal during install of "ROOT\LEGACY_VOLSNAP\0000" was vetoed by "Root\LEGACY_VOLSNAP\0000" (veto type 1: PNP_VetoLegacyDevice).
#W104 Device "ROOT\LEGACY_VOLSNAP\0000" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "ROOT\LEGACY_VOLSNAP\0000" finished successfully.
[2020/03/01 19:00:29 264.1031 Driver Install]
#-019 Searching for hardware ID(s): root\swenum
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "ROOT\SWENUM" in C:\WINDOWS\inf\machine.inf; Device: "Plug and Play Software Device Enumerator"; Driver: "Plug and Play Software Device Enumerator"; Provider: "Microsoft"; Mfg: "(Standard system devices)"; Section name: "SWENUM".
#I023 Actual install section: [SWENUM]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [SWENUM] in "c:\windows\inf\machine.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ROOT\SYSTEM\0000".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [SWENUM.Interfaces] from "c:\windows\inf\machine.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ROOT\SYSTEM\0000".
#I121 Device install of "ROOT\SYSTEM\0000" finished successfully.
[2020/03/01 19:00:29 264.1035 Driver Install]
#-019 Searching for hardware ID(s): root\dmio
#-018 Searching for compatible ID(s): detectedinternal\dmio,detected\dmio
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "Root\DMIO" in C:\WINDOWS\inf\machine.inf; Device: "Logical Disk Manager"; Driver: "Logical Disk Manager"; Provider: "Microsoft"; Mfg: "(Standard system devices)"; Section name: "DMIO_DRV".
#I023 Actual install section: [DMIO_DRV]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [DMIO_DRV] in "c:\windows\inf\machine.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ROOT\DMIO\0000".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [DMIO_DRV.Interfaces] from "c:\windows\inf\machine.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ROOT\DMIO\0000".
#W100 Query-removal during install of "ROOT\DMIO\0000" was vetoed by "Root\dmio\0000" (veto type 6: PNP_VetoDevice).
#W104 Device "ROOT\DMIO\0000" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "ROOT\DMIO\0000" finished successfully.
[2020/03/01 19:00:29 264.1039 Driver Install]
#-019 Searching for hardware ID(s): root\ftdisk
#-018 Searching for compatible ID(s): detectedinternal\ftdisk,detected\ftdisk
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "Root\FTDISK" in C:\WINDOWS\inf\machine.inf; Device: "Volume Manager"; Driver: "Volume Manager"; Provider: "Microsoft"; Mfg: "(Standard system devices)"; Section name: "FTDISK_DRV".
#I023 Actual install section: [FTDISK_DRV]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [FTDISK_DRV] in "c:\windows\inf\machine.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ROOT\FTDISK\0000".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [FTDISK_DRV.Interfaces] from "c:\windows\inf\machine.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ROOT\FTDISK\0000".
#W102 Device "ROOT\FTDISK\0000" required reboot: "Reboot" in section: [FTDISK_DRV].
#I121 Device install of "ROOT\FTDISK\0000" finished successfully.
[2020/03/01 19:00:29 264.1043 Driver Install]
#-019 Searching for hardware ID(s): acpiapic_up
#-018 Searching for compatible ID(s): detectedinternal\acpi_hal,detected\acpi_hal
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "ACPIAPIC_UP" in C:\WINDOWS\inf\hal.inf; Device: "ACPI Uniprocessor x64-based PC"; Driver: "ACPI Uniprocessor x64-based PC"; Provider: "Microsoft"; Mfg: "(Standard computers)"; Section name: "ACPI_AMD64_UP_HAL".
#I023 Actual install section: [ACPI_AMD64_UP_HAL]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [ACPI_AMD64_UP_HAL] in "c:\windows\inf\hal.inf".
#I320 Class GUID of device remains: {4D36E966-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ROOT\ACPI_HAL\0000".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [ACPI_AMD64_UP_HAL.Interfaces] from "c:\windows\inf\hal.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ROOT\ACPI_HAL\0000".
#W102 Device "ROOT\ACPI_HAL\0000" required reboot: "Reboot" in section: [ACPI_AMD64_UP_HAL].
#I121 Device install of "ROOT\ACPI_HAL\0000" finished successfully.
[2020/03/01 19:00:29 264.1047 Driver Install]
#-019 Searching for hardware ID(s): acpi_hal\pnp0c08,*pnp0c08
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "*pnp0c08" in C:\WINDOWS\inf\acpi.inf; Device: "Microsoft ACPI-Compliant System"; Driver: "Microsoft ACPI-Compliant System"; Provider: "Microsoft"; Mfg: "Microsoft"; Section name: "ACPI_Inst".
#I023 Actual install section: [ACPI_Inst.NT]. Rank: 0x00000001. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [ACPI_Inst] in "c:\windows\inf\acpi.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ACPI_HAL\PNP0C08\0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [ACPI_Inst.NT.Interfaces] from "c:\windows\inf\acpi.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ACPI_HAL\PNP0C08\0".
#W102 Device "ACPI_HAL\PNP0C08\0" required reboot: "Reboot" in section: [ACPI_Inst.NT].
#I121 Device install of "ACPI_HAL\PNP0C08\0" finished successfully.
[2020/03/01 19:00:29 264.1051 Driver Install]
#-019 Searching for hardware ID(s): storage\volume
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "STORAGE\Volume" in C:\WINDOWS\inf\volume.inf; Device: "Generic volume"; Driver: "Generic volume"; Provider: "Microsoft"; Mfg: "Microsoft"; Section name: "volume_install".
#I023 Actual install section: [volume_install.NTAMD64]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [volume_install] in "c:\windows\inf\volume.inf".
#I320 Class GUID of device remains: {71A27CDD-812A-11D0-BEC7-08002BE2092F}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "STORAGE\VOLUME\1&30A96598&0&SIGNATUREA8C0A8BOFFSET7E00LENGTHBFB48200".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [volume_install.NTAMD64.Interfaces] from "c:\windows\inf\volume.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "STORAGE\VOLUME\1&30A96598&0&SIGNATUREA8C0A8BOFFSET7E00LENGTHBFB48200".
#W100 Query-removal during install of "STORAGE\VOLUME\1&30A96598&0&SIGNATUREA8C0A8BOFFSET7E00LENGTHBFB48200" was vetoed by "STORAGE\Volume\1&30a96598&0&SignatureA8C0A8BOffset7E00LengthBFB48200" (veto type 6: PNP_VetoDevice).
#W104 Device "STORAGE\VOLUME\1&30A96598&0&SIGNATUREA8C0A8BOFFSET7E00LENGTHBFB48200" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "STORAGE\VOLUME\1&30A96598&0&SIGNATUREA8C0A8BOFFSET7E00LENGTHBFB48200" finished successfully.
[2020/03/01 19:00:29 264.1055 Driver Install]
#-019 Searching for hardware ID(s): acpi\genuineintel_-_em64t_family_6_model_142,*genuineintel_-_em64t_family_6_model_142,acpi\genuineintel_-_em64t_family_6,*genuineintel_-_em64t_family_6,acpi\genuineintel_-_em64t,*genuineintel_-_em64t
#-018 Searching for compatible ID(s): acpi\processor
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "ACPI\Processor" in C:\WINDOWS\inf\cpu.inf; Device: "Processor"; Driver: "Processor"; Provider: "Microsoft"; Mfg: "(Standard processor types)"; Section name: "Processor_Inst".
#I023 Actual install section: [Processor_Inst.NT]. Rank: 0x00002000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#I022 Found "ACPI\GenuineIntel_-_EM64T" in C:\WINDOWS\inf\cpu.inf; Device: "Intel Processor"; Driver: "Intel Processor"; Provider: "Microsoft"; Mfg: "Intel"; Section name: "IntelPPM_Inst".
#I023 Actual install section: [IntelPPM_Inst.NT]. Rank: 0x00000004. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [IntelPPM_Inst] in "c:\windows\inf\cpu.inf".
#I320 Class GUID of device remains: {50127DC3-0F36-415E-A6CC-4CB3BE910B65}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ACPI\GENUINEINTEL_-_EM64T_FAMILY_6_MODEL_142\_0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [IntelPPM_Inst.NT.Interfaces] from "c:\windows\inf\cpu.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ACPI\GENUINEINTEL_-_EM64T_FAMILY_6_MODEL_142\_0".
#I121 Device install of "ACPI\GENUINEINTEL_-_EM64T_FAMILY_6_MODEL_142\_0" finished successfully.
[2020/03/01 19:00:29 264.1059 Driver Install]
#-019 Searching for hardware ID(s): acpi\pnp0a03,*pnp0a03
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "*PNP0A03" in C:\WINDOWS\inf\machine.inf; Device: "PCI bus"; Driver: "PCI bus"; Provider: "Microsoft"; Mfg: "(Standard system devices)"; Section name: "PCI_DRV_ROOT".
#I023 Actual install section: [PCI_DRV_ROOT]. Rank: 0x00000001. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [PCI_DRV_ROOT] in "c:\windows\inf\machine.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#MZ