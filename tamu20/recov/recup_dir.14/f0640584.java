ddReg
CopyFiles   =   CoInstaller.CopyFiles_NTX86
AddReg      =   Eqninox.CoInstaller.AddReg_NTX86, SpxClassCoInstaller.AddReg_NTX86, DigiClassCoinstaller.AddReg_NTX86


[ClassInstall32.NTAMD64]
AddReg      =   MultiPortSerialClass.AddReg
CopyFiles   =   CoInstaller.CopyFiles_NTAMD64

[ClassInstall32.NTIA64]
AddReg      =   MultiPortSerialClass.AddReg
CopyFiles   =   CoInstaller.CopyFiles_NTIA64


[MultiPortSerialClass.AddReg]
HKR,,,,%MultiPortSerialClassName%
HKR,,Icon,,-26


; Register Equinox Co-DeviceInstaller
;------------------------------------
[Eqninox.CoInstaller.AddReg_NTX86]
HKLM,System\CurrentControlSet\Control\CoDeviceInstallers,{50906CB8-BA12-11D1-BF5D-0000F805F530},0x00010008, "eqnclass.dll,CoInstallClass"


; Register SpecialX Co-DeviceInstaller
;------------------------------------
[SpxClassCoInstaller.AddReg_NTX86]
HKLM,System\CurrentControlSet\Control\CoDeviceInstallers,{50906CB8-BA12-11D1-BF5D-0000F805F530},0x00010008,"spxcoins.dll,SpxClassCoInstaller"


[DigiClassCoinstaller.AddReg_NTX86]
HKLM,System\CurrentControlSet\Control\CoDeviceInstallers,{50906CB8-BA12-11D1-BF5D-0000F805F530},0x00010008,"dgsetup.dll,DigiMultiPortCoInstaller"
HKLM,System\CurrentControlSet\Control\CoDeviceInstallers,{50906CB8-BA12-11D1-BF5D-0000F805F530},0x00010008,"dgrpsetu.dll,DigiMultiPortCoInstaller"



[CoInstaller.CopyFiles_NTX86]
EqnClass.Dll
spxcoins.dll
dgsetup.dll
dgrpsetu.dll

[CoInstaller.CopyFiles_NTAMD64]

[CoInstaller.CopyFiles_NTIA64]


[DestinationDirs]
CoInstaller.CopyFiles_NTX86     =   11
CoInstaller.CopyFiles_NTAMD64   =   11
CoInstaller.CopyFiles_NTIA64    =   11
































; User readable strings
;----------------------------------------------------------
[Strings]
MS  = "Microsoft"
MultiPortSerialClassName = "Multi-port serial adapters"

