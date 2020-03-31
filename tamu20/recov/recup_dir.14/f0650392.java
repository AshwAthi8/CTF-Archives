ted in this inf file
; Rather than introduce a new inf file for the classinstall32, we placed
; the section in this existing inf.
;
;  IF THIS FILE IS REMOVED, THE CLASS INSTALLER WILL NO LONGER
;  BE CALLED BY THE SYSTEM.  if the file must be removed, the section needs
;  to be relocated and Setup notified of the change
[ClassInstall32.NT]
AddReg    = IrDAClass.NT.AddReg
CopyFiles = IrEnum.CopyFiles, IrClass.CopyFiles

[ClassInstall32.NT.Services]
AddService=IRENUM,,IrEnumServiceInstall


[IrDAClass.NT.AddReg]
HKR, , ,                0, %DisplayClassName%
HKR, , EnumPropPages32, 0, "NetCfgx.dll,NetPropPageProvider"
HKR, , Icon,            0, "1401"
HKR, , Installer32,     0, "NetCfgx.dll,NetClassInstaller"
HKR, , UpperFilters,    0x00010000 , "IRENUM"

[IrClass.CopyFiles]
irclass.dll

[IrEnum.CopyFiles]
irenum.sys

[IrEnumServiceInstall]
DisplayName     = %IrEnum.DisplayName%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\irenum.sys


[Manufacturer]
%Microsoft%=MS_Devices,NTamd64
%ACTiSYS%=ACTiSYS_Devices,NTamd64
%AMP%=AMP_Devices,NTamd64
%ESI%=ESI_Devices,NTamd64
%IBM%=IBM_Devices,NTamd64
%Parallax%=Parallax_Devices,NTamd64
%Tekram%=Tekram_Devices,NTamd64
%Puma%=Puma_Devices,NTamd64
%VLSI%=VLSI_Devices,NTamd64
%Temic%=Temic_Devices,NTamd64
%Girbil%=Girbil_Devices,NTamd64

[ControlFlags]
ExcludeFromSelect=*PNP0510,*PNP0511,*IBM0002,*IBM0034,*IBM0020

[MS_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%*PNP0510.DevDesc%    = PNP,      	*PNP0510
%*PNP0511.DevDesc%    = PNP,      	*PNP0511
%NullModem.DevDesc%   = NullModem,      SIRNull

[IBM_Devices.NTamd64]
%*IBM0002.DeviceDesc% = PNP,		*IBM0002
%*IBM0034.DeviceDesc% = PNP,	 	*IBM0034


[ACTiSYS_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%ACTiSYS_200L.DevDesc%= ACTiSYS_200L,   SIRAct200
%ACTiSYS_220L.DevDesc%= ACTiSYS_220L,   SIRAct220
%ACTiSYS_220LPlus.DevDesc%=ACTiSYS_220LPlus,SIRAct220Plus

[AMP_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%AMP.DevDesc%         = AMP,    	SIRAmp


[ESI_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%ESI_9680.DevDesc%    = ESI_9680,    	SIRESI9680

[Parallax_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%Parallax.DevDesc%    = Parallax,    	SIRParallax

[Tekram_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%Tekram.DevDesc%      = Tekram,    	SIRTekram

[Puma_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%Puma.DevDesc%        = Puma,    	SIRPuma


[Temic_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%Temic.DevDesc%       = Temic,    	SIRTemic

[Girbil_Devices.NTamd64]
; DisplayName           Section       	DeviceID
; -----------           -------       	--------
%Girbil.DevDesc%       = Girbil,    	SIRGirbil


[PNP.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Generic.reg, Serial.reg
PromptForPort         = 0        ; This is handled by IRCLASS.DLL
LowerFilters          = SERIAL   ; This is handled by IRCLASS.DLL
BusType               = 14
Characteristics       = 0x4  ; NCF_PHYSICAL
SyssetupPnPFlags=1

[PNP.NT.HW]
AddReg=SkipSerialPortAddReg

[SkipSerialPortAddReg]
HKR,"Device Parameters","SerialSkipExternalNaming",0x00010001, 1

[PNP.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[PNP.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[NullModem.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Generic.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[NullModem.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[NullModem.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[ACTiSYS_200L.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, ACTiSYS_200L.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[ACTiSYS_200L.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[ACTiSYS_200L.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[ACTiSYS_220L.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, ACTiSYS_220L.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[ACTiSYS_220L.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[ACTiSYS_220L.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[ACTiSYS_220LPlus.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, ACTiSYS_220LPlus.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[ACTiSYS_220LPlus.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[ACTiSYS_220LPlus.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[AMP.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, AMP.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL


[AMP.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[AMP.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg


[ESI_9680.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, ESI_9680.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[ESI_9680.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[ESI_9680.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[Parallax.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Parallax.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[Parallax.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[Parallax.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[Tekram.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Tekram.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[Tekram.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[Tekram.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[Puma.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Tekram.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[Puma.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[Puma.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[Temic.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Temic.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[Temic.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[Temic.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg

[Girbil.NT]
CopyFiles=IrSir.CopyFiles
DelReg                = DelAdvancedTab.reg
AddReg                = IRSIR.reg, Girbil.reg, Port.reg
PromptForPort         = 1        ; This is handled by IRCLASS.DLL
BusType               = 1
Characteristics       = 0x4  ; NCF_PHYSICAL

[Girbil.NT.Services]
AddService= irsir, 2, IRSIR.AddService, common.EventLog

[Girbil.NT.CoInstallers]
AddReg                = IRSIR.CoInstallers.reg


[Serial.reg]
HKR,  ,               SerialBased,0,    "0"

[IRSIR.reg]
HKR,  Ndi,            HelpText,   	0,    	%IRSIR.Help%
HKR,  Ndi,            Service,    	0,    	"IRSIR"
HKR,  Ndi\Interfaces, UpperRange, 	0,    	"ndisirda"
HKR,  Ndi\Interfaces, LowerRange, 	0,    	"nolower"
HKR,  Ndi,            RequiredAll,   	0,    	"MS_IrDA"
HKR,  ,               EnumPropPages32,	,	"IRCLASS.dll,IrSIRPortPropPageProvider"

[NO_DRV.reg]
HKR,  Ndi\Interfaces, UpperRange, 	0,    	"noupper"
HKR,  Ndi\Interfaces, LowerRange, 	0,    	"nolower"



[Port.reg]
HKR,  ,               SerialBased,0,    "1"

[Generic.reg]
HKR,,InfraredTransceiverType,0,"0"

[ACTiSYS_200L.reg]
HKR,,InfraredTransceiverType,0,"1"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[ACTiSYS_220L.reg]
HKR,,InfraredTransceiverType,0,"2"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[ACTiSYS_220LPlus.reg]
HKR,,InfraredTransceiverType,0,"3"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[AMP.reg]
HKR,,InfraredTransceiverType,0,"4"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"


[ESI_9680.reg]
HKR,,InfraredTransceiverType,0,"5"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[Parallax.reg]
HKR,,InfraredTransceiverType,0,"6"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[Tekram.reg]
HKR,,InfraredTransceiverType,0,"7"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[Temic.reg]
HKR,,InfraredTransceiverType,0,"8"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[Girbil.reg]
HKR,,InfraredTransceiverType,0,"9"
HKR,,MaxConnectList,0x00010000,"115200"
HKR,,MaxConnectList,0x00010008,"57600"
HKR,,MaxConnectList,0x00010008,"38400"
HKR,,MaxConnectList,0x00010008,"19200"
HKR,,MaxConnectList,0x00010008,"9600"

[DelAdvancedTab.reg]
HKR,Ndi\params

[IRSIR.CoInstallers.reg]
HKR,,CoInstallers32,0x00010000,"IRCLASS.dll,IrSIRClassCoInstaller"

[IRSIR.AddService]
DisplayName     = %IRSIR.DevDesc%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_DEMAND_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\irsir.sys
LoadOrderGroup  = NDIS

[IrSir.CopyFiles]
irsir.sys


[common.EventLog]
AddReg = common.AddEventLog.reg

[common.AddEventLog.reg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll"
HKR, , TypesSupported,   0x00010001, 7

[Strings]
Microsoft           = "(Standard Infrared Port)"
ACTiSYS		    = "ACTiSYS"
AMP		    = "AMP"
ESI                 = "Extended Systems"
HP                  = "Hewlett Packard"
IBM                 = "IBM"
Parallax            = "Parallax"
Tekram              = "Tekram"
Puma                = "Puma Technologies"
Temic               = "Vishay Telefunken"
Girbil              = "Greenwich Instruments Ltd"

IRSIR.DevDesc       = "Microsoft Serial Infrared Driver"
DisplayClassName    = "Infrared devices"

Generic.DevDesc	    = "Built-in Infrared Device"
*PNP0510.DevDesc    = "Built-in Infrared Device"
*PNP0511.DevDesc    = "Built-in Infrared Device"
*IBM0002.DeviceDesc = "IBM Thinkpad Infrared Device"
*IBM0034.DeviceDesc = "IBM Thinkpad Infrared Device"
*IBM0020.DeviceDesc = "Infrared connector on the King ISA Plug and Play PCMCIA Controller"
HWPDEAD.DeviceDesc  = "HP Infrared Communication Port"
ACTiSYS_200L.DevDesc= "ACTiSYS IR-200L Serial Infrared Device"
ACTiSYS_220L.DevDesc= "ACTiSYS IR-220L Serial Infrared Device"
ACTiSYS_220LPlus.DevDesc= "ACTiSYS IR-220L+ Serial Infrared Device"
AMP.DevDesc         = "AMP PHASIR Serial Infrared Device"
ESI_9680.DevDesc    = "ESI-9680 JetEye Serial Infrared Device"
Parallax.DevDesc    = "Parallax PRA9500A Serial Infrared Device"
Tekram.DevDesc      = "Tekram IRMate-210 Serial Infrared Device"
Puma.DevDesc        = "Puma Serial Infrared Device"
Temic.DevDesc       = "Vishay Telefunken TOIM3232 Serial Infrared Device"
Girbil.DevDesc       = "Greenwich Instruments GIrBIL Serial Infrared Device"
NullModem.DevDesc   = "Serial Cable using IrDA Protocol"
VLSI                = "VLSI"
VLSI.DevDesc        = "VLSI VL82C147 PCI IrDA Controller"
IrEnum.DisplayName = "IR Enumerator Service"

IRSIR.Help          = "An IrDA serial infrared device is a built-in COM port or external transceiver which transmits infrared pulses. This NDIS miniport driver installs as a network adapter and binds to the Fast IR protocol."
InfraredTransceiver = "Infrared Transceiver"
SerialPort          = "Serial Port"

;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_BOOT_START     = 0
SERVICE_DEMAND_START   = 3
SERVICE_ERROR_NORMAL   = 1
SERVICE_ERROR_CRITICAL = 3
REG_EXPAND_SZ          = 0x00020000
REG_DWORD              = 0x00010001
