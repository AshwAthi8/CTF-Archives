 Found "PCI\CC_0300" in C:\WINDOWS\inf\display.inf; Device: "Standard VGA Graphics Adapter"; Driver: "Standard VGA Graphics Adapter"; Provider: "Microsoft"; Mfg: "(Standard display types)"; Section name: "vga".
#I023 Actual install section: [vga]. Rank: 0x00002004. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [vga] in "c:\windows\inf\display.inf".
#I320 Class GUID of device remains: {4D36E968-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "PCI\VEN_80EE&DEV_BEEF&SUBSYS_00000000&REV_00\3&267A616A&0&10".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [vga.Interfaces] from "c:\windows\inf\display.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "PCI\VEN_80EE&DEV_BEEF&SUBSYS_00000000&REV_00\3&267A616A&0&10".
#I121 Device install of "PCI\VEN_80EE&DEV_BEEF&SUBSYS_00000000&REV_00\3&267A616A&0&10" finished successfully.
[2020/03/01 19:00:29 264.1075 Driver Install]
#-019 Searching for hardware ID(s): pci\ven_8086&dev_7111&subsys_00000000&rev_01,pci\ven_8086&dev_7111&subsys_00000000,pci\ven_8086&dev_7111&rev_01,pci\ven_8086&dev_7111,pci\ven_8086&dev_7111&cc_01018a,pci\ven_8086&dev_7111&cc_0101
#-018 Searching for compatible ID(s): pci\ven_8086&cc_01018a,pci\ven_8086&cc_0101,pci\ven_8086,pci\cc_01018a,pci\cc_0101
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "PCI\CC_0101" in C:\WINDOWS\inf\mshdc.inf; Device: "Standard Dual Channel PCI IDE Controller"; Driver: "Standard Dual Channel PCI IDE Controller"; Provider: "Microsoft"; Mfg: "(Standard IDE ATA/ATAPI controllers)"; Section name: "pciide_Inst".
#I023 Actual install section: [pciide_Inst]. Rank: 0x00003004. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#I022 Found "PCI\VEN_8086&DEV_7111" in C:\WINDOWS\inf\mshdc.inf; Device: "Intel(R) 82371AB/EB PCI Bus Master IDE Controller"; Driver: "Intel(R) 82371AB/EB PCI Bus Master IDE Controller"; Provider: "Microsoft"; Mfg: "Intel"; Section name: "intelide_Inst".
#I023 Actual install section: [intelide_Inst]. Rank: 0x00000003. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [intelide_Inst] in "c:\windows\inf\mshdc.inf".
#I320 Class GUID of device remains: {4D36E96A-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "PCI\VEN_8086&DEV_7111&SUBSYS_00000000&REV_01\3&267A616A&0&09".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [intelide_Inst.Interfaces] from "c:\windows\inf\mshdc.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "PCI\VEN_8086&DEV_7111&SUBSYS_00000000&REV_01\3&267A616A&0&09".
#W100 Query-removal during install of "PCI\VEN_8086&DEV_7111&SUBSYS_00000000&REV_01\3&267A616A&0&09" was vetoed by "IDE\DiskVBOX_HARDDISK___________________________1.0_____\42566239663432316635612d3831393639332061" (veto type 6: PNP_VetoDevice).
#W104 Device "PCI\VEN_8086&DEV_7111&SUBSYS_00000000&REV_01\3&267A616A&0&09" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "PCI\VEN_8086&DEV_7111&SUBSYS_00000000&REV_01\3&267A616A&0&09" finished successfully.
[2020/03/01 19:00:30 264.1079 Driver Install]
#-019 Searching for hardware ID(s): pci\ven_8086&dev_7000&subsys_00000000&rev_00,pci\ven_8086&dev_7000&subsys_00000000,pci\ven_8086&dev_7000&rev_00,pci\ven_8086&dev_7000,pci\ven_8086&dev_7000&cc_060100,pci\ven_8086&dev_7000&cc_0601
#-018 Searching for compatible ID(s): pci\ven_8086&cc_0601