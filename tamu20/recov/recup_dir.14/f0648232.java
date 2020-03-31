sinstall32, we placed
; the section in this existing inf.
;
;  IF THIS FILE IS REMOVED, THE CLASS INSTALLER WILL NO LONGER
;  BE CALLED BY THE SYSTEM.  if the file must be removed, the section needs
;  to be relocated and Setup notified of the change

[ClassInstall32.NT]
AddReg = NetClass.NT.AddReg

[NetClass.NT.AddReg]
HKR, , ,                0, %DisplayClassName%
HKR, , EnumPropPages32, 0, "NetCfgx.dll,NetPropPageProvider"
HKR, , Icon,            0, "-5"
HKR, , Installer32,     0, "NetCfgx.dll,NetClassInstaller"
;*******************************************************************************
;*******************************************************************************

[Strings]
Msft = "Microsoft"
DisplayClassName = "Network adapters"
