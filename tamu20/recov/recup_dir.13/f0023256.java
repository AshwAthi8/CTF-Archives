lassName%
HKR,,Icon,,"2"
HKR,,Installer32,%REG_SZ%,"sdhcinst.dll,SdClassInstall"
HKR,,NoInstallClass,,1

[ClassCopyFiles]
sdhcinst.dll

;
;   List of manufacturers and devices
;
[Manufacturer]
%Generic%=Generic,NTamd64
%TED%=TED,NTamd64
%TI%=TI,NTamd64
%Toshiba%=Toshiba,NTamd64
%Ricoh%=Ricoh,NTamd64

[ControlFlags]
ExcludeFromSelect=PCI\cc_080500
ExcludeFromSelect=PCI\cc_080501
ExcludeFromSelect=PCI\VEN_1679&DEV_3000
ExcludeFromSelect=PCI\VEN_104c&DEV_ac9f
ExcludeFromSelect=PCI\VEN_1179&DEV_0805
ExcludeFromSelect=PCI\VEN_1180&DEV_0822&SUBSYS_C01A144D&REV_17

[Generic.NTamd64]
%PCI\CC_080500.DeviceDesc%=SDHost,PCI\CC_080500
%PCI\CC_080501.DeviceDesc%=SDHost,PCI\CC_080501

[TED.NTamd64]
%PCI\VEN_1679&DEV_3000.DeviceDesc%=SDHost, PCI\VEN_1679&DEV_3000

[TI.NTamd64]
%PCI\VEN_104c&DEV_ac9f.DeviceDesc%=SDHost, PCI\VEN_104c&DEV_ac9f

[Toshiba.NTamd64]
%PCI\VEN_1179&DEV_0805.DeviceDesc%=SDHost, PCI\VEN_1179&DEV_0805

[Ricoh.NTamd64]
%PCI\VEN_1180&DEV_0822&SUBSYS_C01A144D&REV_17%=SDHostRicoh, PCI\VEN_1180&DEV_0822&SUBSYS_C01A144D&REV_17

[sdbus_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_DEMAND_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\sdbus.sys
LoadOrderGroup = System Bus Extender
AddReg         = SDBUSServiceReg

[SDBUSLocationReg]
HKR,,UINumberDescFormat,,%SDBUSSlot%

[SDHostRicoh.HW.addreg]
HKR,,CardPresenceCheckDelay,0x00010001,500000

[SDBUSReg]
HKR,,Driver,,"sdbus.sys"

[SDBUSServiceReg]
HKR,Parameters,SdCmdFlags,1,    06,01, 09,19, 0A,19, 0D,11, \
                                10,01, 11,01, 12,01, 18,05, 19,05, \
                                19,01, 1A,01, 1B,01, 1C,01, \
                                20,05, 21,05, 26,05, \
                                2A,01, \
                                34,02, 35,02, \
                                37,01, 38,01, \
                                22,01, 23,05, 24,01, 25,01

HKR,Parameters,SdAppCmdFlags,1, 06,01, 0D,01, 16,01, 17,01, 33,01, \
                                12,01, 19,01, 1A,01, 26,01, 2B,01, \
                                2C,01, 2D,01, 2E,01, 2F,01, 30,01, 31,01

[CSCopyFiles]
sdbus.sys

[DestinationDirs]
ClassCopyFiles=11
CSCopyFiles=12

;
; Standard host controller
;
[SDHost]
CopyFiles=CSCopyFiles
AddReg=SDBUSReg

[SDHost.Services]
AddService = sdbus, 2, sdbus_Service_Inst

[SDHost.HW]
AddReg=SDBUSLocationReg

;
; Ricoh host controller R5C841
;
[SDHostRicoh]
CopyFiles=CSCopyFiles
AddReg=SDBUSReg

[SDHostRicoh.Services]
AddService = sdbus, 2, sdbus_Service_Inst

[SDHostRicoh.HW]
AddReg=SDBUSLocationReg
AddReg=SDHostRicoh.HW.addreg

[Strings]
SDClassName="Secure Digital host controllers"
;
;   Manufacturer name strings
;
Generic="SDA Standard Compliant SD Host Controller Vendor"
Msft="Microsoft"
TED="Tokyo Electron Device"
TI="Texas Instruments"
Toshiba="Toshiba"
Ricoh="Ricoh"

;
;   Device Decription strings
;
PCI\VEN_104c&DEV_ac9f.DeviceDesc="Texas Instruments Secure Digital host controller"
PCI\VEN_1679&DEV_3000.DeviceDesc="Tokyo Electron SD Standard host controller"
PCI\VEN_1179&DEV_0805.DeviceDesc="Toshiba Secure Digital host controller"

PCI\VEN_1180&DEV_0822&SUBSYS_C01A144D&REV_17="Ricoh Secure Digital host controller R5C841"

PCI\CC_080500.DeviceDesc="SDA Standard Compliant SD Host Controller"
PCI\CC_080501.DeviceDesc="SDA Standard Compliant SD Host Controller"

;
;
;
SDBUSSlot = "SD Host Slot %1!u!"

SERVICE_KERNEL_DRIVER = 1
SERVICE_BOOT_START    = 0
SERVICE_SYSTEM_START  = 1
SERVICE_DEMAND_START  = 3
SERVICE_ERROR_NORMAL  = 1
SERVICE_ERROR_IGNORE  = 0
REG_EXPAND_SZ         = 0x00020000
REG_DWORD             = 0x00010001
REG_SZ                = 0x00000000
