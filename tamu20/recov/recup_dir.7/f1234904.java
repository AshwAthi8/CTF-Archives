I058 Selected best compatible driver.
#-124 Doing copy-only install of "ACPI\PNP0A03\0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [PCI_DRV_ROOT.Interfaces] from "c:\windows\inf\machine.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ACPI\PNP0A03\0".
#I121 Device install of "ACPI\PNP0A03\0" finished successfully.
[2020/03/01 19:00:29 264.1063 Driver Install]
#-019 Searching for hardware ID(s): acpi\fixedbutton,*fixedbutton
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "ACPI\FixedButton" in C:\WINDOWS\inf\machine.inf; Device: "ACPI Fixed Feature Button"; Driver: "ACPI Fixed Feature Button"; Provider: "Microsoft"; Mfg: "(Standard system devices)"; Section name: "NO_DRV".
#I023 Actual install section: [NO_DRV]. Rank: 0x00000000. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [NO_DRV] in "c:\windows\inf\machine.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ACPI\FIXEDBUTTON\2&DABA3FF&0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [NO_DRV.Interfaces] from "c:\windows\inf\machine.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ACPI\FIXEDBUTTON\2&DABA3FF&0".
#W100 Query-removal during install of "ACPI\FIXEDBUTTON\2&DABA3FF&0" was vetoed by "ACPI\FixedButton\2&daba3ff&0" (veto type 6: PNP_VetoDevice).
#W104 Device "ACPI\FIXEDBUTTON\2&DABA3FF&0" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "ACPI\FIXEDBUTTON\2&DABA3FF&0" finished successfully.
[2020/03/01 19:00:29 264.1067 Driver Install]
#-019 Searching for hardware ID(s): pci\ven_80ee&dev_cafe&subsys_00000000&rev_00,pci\ven_80ee&dev_cafe&subsys_00000000,pci\ven_80ee&dev_cafe&rev_00,pci\ven_80ee&dev_cafe,pci\ven_80ee&dev_cafe&cc_088000,pci\ven_80ee&dev_cafe&cc_0880
#-018 Searching for compatible ID(s): pci\ven_80ee&cc_088000,pci\ven_80ee&cc_0880,pci\ven_80ee,pci\cc_088000,pci\cc_0880
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#W059 Selecting best compatible driver failed. Error 0xe0000228: There are no compatible drivers for this device.
#W157 Default installer failed. Error 0xe0000228: There are no compatible drivers for this device.
#I060 Set selected driver.
#-166 Device install function: DIF_INSTALLDEVICE.
#I125 Installing NULL driver for "PCI\VEN_80EE&DEV_CAFE&SUBSYS_00000000&REV_00\3&267A616A&0&20".
#E122 Device install failed. Error 0xe0000219: The installation failed because a function driver was not specified for this device instance.
#E157 Default installer failed. Error 0xe0000219: The installation failed because a function driver was not specified for this device instance.
#-166 Device install function: DIF_INSTALLDEVICE.
#I125 Installing NULL driver for "PCI\VEN_80EE&DEV_CAFE&SUBSYS_00000000&REV_00\3&267A616A&0&20".
#I121 Device install of "PCI\VEN_80EE&DEV_CAFE&SUBSYS_00000000&REV_00\3&267A616A&0&20" finished successfully.
[2020/03/01 19:00:29 264.1069 Driver Install]
#-019 Searching for hardware ID(s): pci\ven_80ee&dev_beef&subsys_00000000&rev_00,pci\ven_80ee&dev_beef&subsys_00000000,pci\ven_80ee&dev_beef&rev_00,pci\ven_80ee&dev_beef,pci\ven_80ee&dev_beef&cc_030000,pci\ven_80ee&dev_beef&cc_0300
#-018 Searching for compatible ID(s): pci\ven_80ee&cc_030000,pci\ven_80ee&cc_0300,pci\ven_80ee,pci\cc_030000,pci\cc_0300
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022