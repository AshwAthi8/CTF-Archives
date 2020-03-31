#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [atapi_Inst_primary] in "c:\windows\inf\mshdc.inf".
#I320 Class GUID of device remains: {4D36E96A-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "PCIIDE\IDECHANNEL\4&2F42C713&0&0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [atapi_Inst_primary.Interfaces] from "c:\windows\inf\mshdc.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "PCIIDE\IDECHANNEL\4&2F42C713&0&0".
#W100 Query-removal during install of "PCIIDE\IDECHANNEL\4&2F42C713&0&0" was vetoed by "IDE\DiskVBOX_HARDDISK___________________________1.0_____\42566239663432316635612d3831393639332061" (veto type 6: PNP_VetoDevice).
#W104 Device "PCIIDE\IDECHANNEL\4&2F42C713&0&0" required reboot: Query remove failed (install) CfgMgr32 returned: 0x17: CR_REMOVE_VETOED.
#I121 Device install of "PCIIDE\IDECHANNEL\4&2F42C713&0&0" finished successfully.
[2020/03/01 19:00:34 264.1135 Driver Install]
#-019 Searching for hardware ID(s): usb\root_hub&vid106b&pid003f&rev0000,usb\root_hub&vid106b&pid003f,usb\root_hub
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "USB\ROOT_HUB" in C:\WINDOWS\inf\usbport.inf; Device: "USB Root Hub"; Driver: "USB Root Hub"; Provider: "Microsoft"; Mfg: "(Standard USB Host Controller)"; Section name: "ROOTHUB.Dev".
#I023 Actual install section: [ROOTHUB.Dev.NT]. Rank: 0x00000002. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [ROOTHUB.Dev] in "c:\windows\inf\usbport.inf".
#I320 Class GUID of device remains: {36FC9E60-C465-11CF-8056-444553540000}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "USB\ROOT_HUB\4&24D6EB65&0".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [ROOTHUB.Dev.NT.Interfaces] from "c:\windows\inf\usbport.inf".
#I054 Interfaces installed.
#-166 Device install function: DIF_INSTALLDEVICE.
#I123 Doing full install of "USB\ROOT_HUB\4&24D6EB65&0".
#I121 Device install of "USB\ROOT_HUB\4&24D6EB65&0" finished successfully.
[2020/03/01 19:00:34 264.1139 Driver Install]
#-019 Searching for hardware ID(s): intel-piix4,secondary_ide_channel,*pnp0600
#-018 Searching for compatible ID(s): *pnp0600
#-199 Executing "C:\WINDOWS\system32\setup.exe" with command line: setup -newsetup
#I022 Found "Secondary_IDE_Channel" in C:\WINDOWS\inf\mshdc.inf; Device: "Secondary IDE Channel"; Driver: "Secondary IDE Channel"; Provider: "Microsoft"; Mfg: "(Standard IDE ATA/ATAPI controllers)"; Section name: "atapi_Inst_secondary".
#I023 Actual install section: [atapi_Inst_secondary]. Rank: 0x00000001. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#I022 Found "*PNP0600" in C:\WINDOWS\inf\mshdc.inf; Device: "Standard IDE/ESDI Hard Disk Controller"; Driver: "Standard IDE/ESDI Hard Disk Controller"; Provider: "Microsoft"; Mfg: "(Standard IDE ATA/ATAPI controllers)"; Section name: "atapi_Inst".
#I023 Actual install section: [atapi_Inst]. Rank: 0x00000002. Driver date: 10/01/2002. Version: 5.2.3790.1830.
#-166 Device install function: DIF_SELECTBESTCOMPATDRV.
#I063 Selected driver installs from section [atapi_Inst_secondary] in "c:\windows\inf\mshdc.inf".
#I320 Class GUID of device remains: {4D36E96A-E325-11CE-BFC1-08002BE10318}.
#I060 Set selected driver.
#I058 Selected best compatible driver.
#-124 Doing copy-only install of "PCIIDE\IDECHANNEL\4&2F42C713&0&1".
#-166 Device install function: DIF_REGISTER_COINSTALLERS.
#I056 Coinstallers registered.
#-166 Device install function: DIF_INSTALLINTERFACES.
#-011 Installing section [atapi_Inst_sec