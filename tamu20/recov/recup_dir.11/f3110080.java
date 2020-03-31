vice install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ACPI\PNP0200\4&1D401FB5&0".
#I121 Device install of "ACPI\PNP0200\4&1D401FB5&0" finished successfully.
[2020/03/01 19:00:40 264.1163 Driver Install]
#-019 Searching for hardware ID(s): acpi\pnp0100,*pnp0100
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "*PNP0100" in C:\WINDOWS\inf\machine.inf; Device: "System timer"; Driver: "System timer"; Provider: "Microsoft"; Mfg: "(Standard system devices)"; Section name: "NO_DRV_X".
#I023 Actual install section: [NO_DRV_X]. Rank: 0x00000001. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [NO_DRV_X] in "c:\windows\inf\machine.inf".
#I320 Class GUID of device remains: {4D36E97D-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "ACPI\PNP0100\4&1D401FB5&0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [NO_DRV_X.Interfaces] from "c:\windows\inf\machine.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "ACPI\PNP0100\4&1D401FB5&0".
#I121 Device install of "ACPI\PNP0100\4&1D401FB5&0" finished successfully.
[2020/03/01 19:00:40 264.1167 Driver Install]
#-019 Searching for hardware ID(s): ide\diskvbox_harddisk___________________________1.0_____,ide\vbox_harddisk___________________________1.0_____,ide\diskvbox_harddisk___________________________,vbox_harddisk___________________________1.0_____,gendisk
#-018 Searching for compatible ID(s): gendisk
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "GenDisk" in C:\WINDOWS\inf\disk.inf; Device: "Disk drive"; Driver: "Disk drive"; Provider: "Microsoft"; Mfg: "(Standard disk drives)"; Section name: "disk_install".
#I023 Actual install section: [disk_install.NT]. Rank: 0x00000004. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [disk_install] in "c:\windows\inf\disk.inf".
#I320 Class GUID of device remains: {4D36E967-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "IDE\DISKVBOX_HARDDISK___________________________1.0_____\42566239663432316635612D3831393639332061".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [disk_install.NT.Interfaces] from "c:\windows\inf\disk.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "IDE\DISKVBOX_HARDDISK___________________________1.0_____\42566239663432316635612D3831393639332061".
#W100 Query-removal during install of "IDE\DISKVBOX_HARDDISK___________________________1.0_____\42566239663432316635612D3831393639332061" was vetoed by "IDE\DiskVBOX_HARDDISK___________________________1.0_____\42566239663432316635612d3831393639332061" (veto type 6: PNP_VetoDevice).
#W104 Device "IDE\DISKVBOX_HARDDISK___________________________1.0_____\42566239663432316635612D3831393639332061" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "IDE\DISKVBOX_HARDDISK___________________________1.0_____\42566239663432316635612D3831393639332061" finished successfully.
[2020/03/01 19:00:40 264.1171 Driver Install]
#-019 Searching for hardware ID(s): ide\cdromvbox_cd-rom_____________________________1.0_____,ide\vbox_cd-rom_____________________________1.0_____,ide\cdromvbox_cd-rom_____________________________,vbox_cd-rom_____________________________1.0_____,gencdrom
#-018 Searching for compatible ID(s): gencdrom
#-199 Executing "C:\WINDOWS\system32\setup.exe" with