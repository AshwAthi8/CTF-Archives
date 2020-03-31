-------------------------------------------------------
[ClassInstall]
AddReg=PortsClass.AddReg

[PortsClass.AddReg]
HKR,,,,%PortsClassName%

[ClassInstall32.NT]
AddReg=PortsClass.NT.AddReg

[PortsClass.NT.AddReg]
HKR,,,,%PortsClassName%
HKR,,Icon,,"-23"
HKR,,Installer32,,"MsPorts.Dll,PortsClassInstaller"

[ControlFlags]
ExcludeFromSelect=PCMCIA\SOCKET_COMMUNICATIONS_INC-SOCKET_IO_PCMCIA_SERIAL_PORT_ADAPTER_REVISION_A-0484         ; Socket PCMCIA Serial Adapter
ExcludeFromSelect=PCMCIA\SOCKET_COMMUNICATIONS_INC-SOCKET_IO_PCMCIA_SERIAL_PORT_ADAPTER_REVISION_B-12F8         ; Socket PCMCIA Serial Adapter
ExcludeFromSelect=PCMCIA\Socket_Communications_Inc-Serial_Port_Adapter_Revision_B-5E3E
ExcludeFromSelect=MF\SOCKETDUAL_DEV0,MF\SOCKETDUAL_DEV1
ExcludeFromSelect=PCMCIA\SOCKET_COMMUNICATIONS_INC-PAGECARD_REVISION_A-FA29     ; Socket PCMCIA PageCard V3.0
ExcludeFromSelect=PCMCIA\SOCKET_COMMUNICATIONS_INC-SOCKET_GPS_PCMCIA_GLOBAL_POSITIONING_SYSTEM_REVISION_B-AF8A          ; Socket PCMCIA GPS Adapter
ExcludeFromSelect=PCMCIA\SOCKET_COMMUNICATIONS_INC-MOBILE_GPS_REVISION_C-66D0   ; Socket PCMCIA GPS Adapter
ExcludeFromSelect=PCMCIA\socket-serial_port_card_rev_2.3-e88f
ExcludeFromSelect=PCMCIA\DATA_BROADCASTING_CORP-SIGNALCARD_RECEIVER-4E9B                ; DBC SignalCard
ExcludeFromSelect=PCMCIA\ROCKWELL-NAVCARD-64B7          ; Rockwell NavCard
ExcludeFromSelect=PCMCIA\TRIMBLE_&_SOCKET_COMMUNICATIONS_INC-MOBILE_GPS_REVISION_B-6947
ExcludeFromSelect=PCMCIA\SMART_SERIAL_PORT-A0F6
ExcludeFromSelect=PCMCIA\Quatech_Inc-PCMCIA_RS-232_Serial_Port_Card-63EA
ExcludeFromSelect=PCI\VEN_131F&DEV_1000&SUBSYS_00000000&REV_02  ; SIIG CyberSerial PCI Card
ExcludeFromSelect=PCI\VEN_131F&DEV_2000&CC_0700                 ; SIIG CyberSerial PCI Card
ExcludeFromSelect=PCMCIA\ERICSSON-GC25-8C66                     ; Ericsson GC25
ExcludeFromSelect=PCMCIA\COMPAQ-SPEEDPAQ_GSM_RADIO_PC_CARD-6D6C ; Compaq GSM Radio Card

; Drivers
;----------------------------------------------------------
[Manufacturer]
%Std%=Std,NTamd64
%HP%=HP,NTamd64
%Socket%=Socket,NTamd64
%DBC%=DBC,NTamd64
%Rockwell%=Rockwell,NTamd64
%Trimble%=Trimble,NTamd64
%Smart%=Smart,NTamd64
%SIIG%=SIIG,NTamd64
%Ericsson%=Ericsson,NTamd64
%Compaq%=Compaq,NTamd64
%Quatech%=Quatech,NTamd64

[Std.NTamd64]
%*PNP0400.DeviceDesc% = LptPort, *PNP0400           ; Printer Port
%*PNP0401.DeviceDesc% = EcpPort, *PNP0401           ; ECP Printer Port
%*PNP0500.DeviceDesc% = ComPort, *PNP0500, *PNP0501 ; Communications Port
%*PNP0501.DeviceDesc% = ComPort, *PNP0501, *PNP0500 ; Communications Port
%*PNP0502.DeviceDesc% = MultiComPort, *PNP0502      ; Multi Communications Port

; Compaq devices
%*CPQA0D9.DeviceDesc% = ComPort, *CPQA0D9           ; Communications Port

[HP.NTamd64]            ; Hewlett Packard devices
%MF\EISA_HWP1C10_DEV0.DeviceDesc% = ComPort, MF\EISA_HWP1C10_DEV0


[Socket.NTamd64]
%Socket-0484.DeviceDesc%      = ComPort, "PCMCIA\SOCKET_COMMUNICATIONS_INC-SOCKET_IO_PCMCIA_SERIAL_PORT_ADAPTER_REVISION_A-0484"
%Socket-12F8.DeviceDesc%      = ComPort, "PCMCIA\SOCKET_COMMUNICATIONS_INC-SOCKET_IO_PCMCIA_SERIAL_PORT_ADAPTER_REVISION_B-12F8"
%Socket-5E3E.DeviceDesc%      = ComPort, "PCMCIA\Socket_Communications_Inc-Serial_Port_Adapter_Revision_B-5E3E"
%SocketDual.DeviceDesc%       = ComPort, MF\SOCKETDUAL_DEV0
%SocketDual.DeviceDesc%       = ComPort, MF\SOCKETDUAL_DEV1
%Socket-0104-0001.DeviceDesc% = ComPort, "PCMCIA\socket-serial_port_card_rev_2.3-e88f"
%Socket-FA29.DeviceDesc%      = NonPort, "PCMCIA\SOCKET_COMMUNICATIONS_INC-PAGECARD_REVISION_A-FA29"
%Socket-AF8A.DeviceDesc%      = NonPort, "PCMCIA\SOCKET_COMMUNICATIONS_INC-SOCKET_GPS_PCMCIA_GLOBAL_POSITIONING_SYSTEM_REVISION_B-AF8A"
%Socket-66D0.DeviceDesc%      = NonPort, "PCMCIA\SOCKET_COMMUNICATIONS_INC-MOBILE_GPS_REVISION_C-66D0"


[DBC.NTamd64]
%DBC-4E9B.DeviceDesc% = NonPort, "PCMCIA\DATA_BROADCASTING_CORP-SIGNALCARD_RECEIVER-4E9B"

[Rockwell.NTamd64]
%Rockwell-64B7.DeviceDesc% = NonPort, "PCMCIA\ROCKWELL-NAVCARD-64B7"

[Trimble.NTamd64]
%Trimble-6947.DeviceDesc% = NonPort, "PCMCIA\TRIMBLE_&_SOCKET_COMMUNICATIONS_INC-MOBILE_GPS_REVISION_B-6947"

[Smart.NTamd64]
%Smart-A0F6.DeviceDesc% = ComPort, "PCMCIA\SMART_SERIAL_PORT-A0F6"

[SIIG.NTamd64]
%SIIG-PCI_1_SERIAL.DeviceDesc% =  ComPort,  "PCI\VEN_131F&DEV_1000&SUBSYS_00000000&REV_02"
%SIIG-PCI_1_CYBERSERIAL.DeviceDesc% =  ComPort,  "PCI\VEN_131F&DEV_2000&CC_0700"


[Ericsson.NTamd64]
%*ERIC.DeviceDesc% = ComPort, PCMCIA\ERICSSON-GC25-8C66

[Compaq.NTamd64]
%*COMP.DeviceDesc% =  ComPort, PCMCIA\COMPAQ-SPEEDPAQ_GSM_RADIO_PC_CARD-6D6C

[Quatech.NTamd64]
%Quatech-63EA.DeviceDesc% = ComPort, PCMCIA\Quatech_Inc-PCMCIA_RS-232_Serial_Port_Card-63EA

; LPT sections
;----------------------------------------------------------
[LptPort]
AddReg=LptPort.AddReg
LogConfig=lsnn,lsan,lann,laan

[EcpPort]
AddReg=EcpPort.AddReg
LogConfig=lsnn,lsan,lsaa,lann,laaa


[LptPort.AddReg]
HKR,,PortSubClass,1,00
HKR,,ECPDevice,1,00

[EcpPort.AddReg]
HKR,,PortSubClass,1,00
HKR,,ECPDevice,1,01


[LptPort.NT.AddReg]
HKR,,EnumPropPages32,,"MsPorts.dll,ParallelPortPropPageProvider"

[LptPort.NT]
CopyFiles=LptPort.NT.Copy
AddReg=LptPort.AddReg,LptPort.NT.AddReg
LogConfig=lsnn,lsan,lann,laan

[EcpPort.NT]
CopyFiles=LptPort.NT.Copy
AddReg=EcpPort.AddReg,LptPort.NT.AddReg
LogConfig=lsnn,lsan,lsaa,lann,laaa

[LptPort.NT.Copy]
parport.sys

;-------------- Service installation
[LptPort.NT.Services]
AddService = Parport, 0x00000002, Parport_Service_Inst, Parport_EventLog_Inst ; Port Driver (function driver for this device)

[EcpPort.NT.Services]
AddService = Parport, 0x00000002, Parport_Service_Inst, Parport_EventLog_Inst ; Port Driver (function driver for this device)

; -------------- Parallel Port Driver install sections
[Parport_Service_Inst]
DisplayName    = %Parport.SVCDESC%
ServiceType    = 1                ; SERVICE_KERNEL_DRIVER
StartType      = 3                ; SERVICE_DEMAND_START
ErrorControl   = 1                ; SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\parport.sys
LoadOrderGroup = Parallel arbitrator

[Parport_EventLog_Inst]
AddReg = Parport_EventLog_AddReg

[Parport_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\parport.sys"
HKR,,TypesSupported,0x00010001,7





; The following sections are LPT and ECP port logical
; resource configurations. Section name format means:
; Char 1 = l (LPT port)
; Char 2 = I/O config:    s (std), a (any)
; Char 3 = IRQ config: #,          a (any), n (none)
; Char 4 = DMA config:             a (any), n (none)

[lsnn]
ConfigPriority=HARDRECONFIG
IOConfig=3bc-3be(3ff::),378-37a(3ff::),278-27a(3ff::)

[lsan]
ConfigPriority=HARDRECONFIG
IOConfig=3bc-3be(3ff::),378-37a(3ff::),278-27a(3ff::)
IRQConfig=3,4,5,6,7,8,9,10,11,12,13,14,15

[lann]
ConfigPriority=HARDRECONFIG
IOConfig=8@100-3ff%fff8(3ff::)

[laan]
ConfigPriority=HARDRECONFIG
IOConfig=8@100-3ff%fff8(3ff::)
IRQConfig=3,4,5,6,7,8,9,10,11,12,13,14,15

[lsaa]
ConfigPriority=HARDRECONFIG
IOConfig=3bc-3be(3ff::),378-37a(3ff::),278-27a(3ff::)
IRQConfig=3,4,5,6,7,8,9,10,11,12,13,14,15
DMAConfig=1,2,3,5,6,7

[laaa]
ConfigPriority=HARDRECONFIG
IOConfig=8@100-3ff%fff8(3ff::)
IRQConfig=3,4,5,6,7,8,9,10,11,12,13,14,15
DMAConfig=1,2,3,5,6,7

; End LPT and ECP LogConfig sections

[*pnp0400.det]
AddReg=Ports.AddReg

[Ports.AddReg]
HKR,,NoSetupUI,,1

[*pnp0401.det]
AddReg=Ports.AddReg

[LptPort.PosDup]
*PNP0401

[EcpPort.PosDup]
*PNP0400


; COM sections
;----------------------------------------------------------
[ComPort]
CopyFiles=ComPort.Copy
AddReg=ComPort.AddReg, ComPort.W95.AddReg
LogConfig=c14,c1a,c23,c2a,c34,c3a,c43,c4a,caa

[ComPort.Copy]
serial.vxd
serialui.dll

[ComPort.AddReg]
HKR,,PortSubClass,1,01

[ComPort.W95.AddReg]
HKR,,DevLoader,,*vcomm
HKR,,Enumerator,,serenum.vxd
HKR,,PortDriver,,serial.vxd
HKR,,Contention,,*vcd
HKR,,ConfigDialog,,serialui.dll
HKR,,DCB,3,1C,00,00,00, 80,25,00,00, 11,33,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00
HKR,,EnumPropPages,,"serialui.dll,EnumPropPages"

[ComPort.NT]
CopyFiles=ComPort.NT.Copy
AddReg=ComPort.AddReg, ComPort.NT.AddReg
LogConfig=c14,c1a,c23,c2a,c34,c3a,c43,c4a,caa
SyssetupPnPFlags = 1

[ComPort.NT.HW]
AddReg=ComPort.NT.HW.AddReg

[ComPort.NT.Copy]
serial.sys
serenum.sys

[ComPort.NT.AddReg]
HKR,,EnumPropPages32,,"MsPorts.dll,SerialPortPropPageProvider"
; Uncomment the following line if you want to override the advanced dialog for
; your device.  See msports.h for protoype of OverrideAdvancedFunction
; HKR,,EnumAdvancedDialog,,"yourdll.dll,OverrideAdvancedFunction"

[ComPort.NT.HW.AddReg]
HKR,,"UpperFilters",0x00010000,"serenum"

; MultiPort COM Sections;
; -------------------------------------------------------

[MultiComPort.NT]
CopyFiles=ComPort.NT.Copy
AddReg=ComPort.AddReg, ComPort.NT.AddReg
LogConfig=cm1,cm2,cm3,cm4,dg1,dga,cma
SyssetupPnPFlags = 1

[MultiComPort.NT.HW]
; Add multiport and normal port into the hardware devnode
AddReg=MultiComPort.NT.HW.AddReg,ComPort.NT.HW.AddReg

[MultiComPort.NT.HW.AddReg]
; Add multiport specific info to the hardware devnode
HKR,,MultiportDevice,0x00010001,1

; The serial enumerator by itself, so that other INFs can install serenum w/out serial.sys
; -------------------------------------------------------

[SerialEnumerator.NT]
CopyFiles=SerialEnumerator.NT.Copy

[SerialEnumerator.NT.Copy]
serenum.sys

;-------------- Service installation
; Port Driver (function driver for this device)
[ComPort.NT.Services]
AddService = Serial, 0x00000002, Serial_Service_Inst, Serial_EventLog_Inst
AddService = Serenum,,Serenum_Service_Inst

[MultiComPort.NT.Services]
AddService = Serial, 0x00000002, Serial_Service_Inst, Serial_EventLog_Inst
AddService = Serenum,,Serenum_Service_Inst

[SerialEnumerator.NT.Services]
AddService = Serenum,,Serenum_Service_Inst

; -------------- Serial Port Driver install sections
[Serial_Service_Inst]
DisplayName    = %Serial.SVCDESC%
ServiceType    = 1               ; SERVICE_KERNEL_DRIVER
StartType      = 1               ; SERVICE_SYSTEM_START (this driver may do detection)
ErrorControl   = 0               ; SERVICE_ERROR_IGNORE
ServiceBinary  = %12%\serial.sys
LoadOrderGroup = Extended base

; -------------- Serenum Driver install section
[Serenum_Service_Inst]
DisplayName    = %Serenum.SVCDESC%
ServiceType    = 1               ; SERVICE_KERNEL_DRIVER
StartType      = 3               ; SERVICE_DEMAND_START
ErrorControl   = 1               ; SERVICE_ERROR_NORMAL
ServiceBinary  = %12%\serenum.sys
LoadOrderGroup = PNP Filter

[Serial_EventLog_Inst]
AddReg = Serial_EventLog_AddReg

[Serial_EventLog_AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\drivers\serial.sys"
HKR,,TypesSupported,0x00010001,7

[*pnp0500.det]
AddReg=Ports.AddReg,DevMap.AddReg

; The following sections are COM port resource configs.
; Section name format means:
; Char 1 = c (COM port)
; Char 2 = I/O config: 1 (3f8), 2 (2f8), 3 (3e8), 4 (2e8), a (any)
; Char 3 = IRQ config: #, a (any)

[c14]                   ; COM1,IRQ4
ConfigPriority=HARDRECONFIG
IOConfig=3f8-3ff(3ff::)
IRQConfig=S:4

[c1a]                   ; COM1, any IRQ
ConfigPriority=HARDRECONFIG
IOConfig=3f8-3ff(3ff::)
IRQConfig=S:3,4,5,7,9,10,11,12,14,15

[c23]                   ; COM2, IRQ3
ConfigPriority=HARDRECONFIG
IOConfig=2f8-2ff(3ff::)
IRQConfig=S:3

[c2a]                   ; COM2, any IRQ
ConfigPriority=HARDRECONFIG
IOConfig=2f8-2ff(3ff::)
IRQConfig=S:3,4,5,7,9,10,11,12,14,15

[c34]                   ; COM3, IRQ4
ConfigPriority=HARDRECONFIG
IOConfig=3e8-3ef(3ff::)
IRQConfig=S:4

[c3a]                   ; COM3, any IRQ
ConfigPriority=HARDRECONFIG
IOConfig=3e8-3ef(3ff::)
IRQConfig=S:3,4,5,7,9,10,11,12,14,15

[c43]                   ; COM4, IRQ3
ConfigPriority=HARDRECONFIG
IOConfig=2e8-2ef(3ff::)
IRQConfig=S:3,5

[c4a]                   ; COM4, any IRQ
ConfigPriority=HARDRECONFIG
IOConfig=2e8-2ef(3ff::)
IRQConfig=S:3,4,5,7,9,10,11,12,14,15

[caa]                   ; Any base, any IRQ
ConfigPriority=HARDRECONFIG
IOConfig=8@100-ffff%fff8(3ff::)
IRQConfig=S:3,4,5,7,9,10,11,12,14,15

; The following are multiport configs for DigiBoard (dgxx)
; and Comtrol (cmxx) multiport boards
; Section name format means:
; Char 1,2 = manufacturer abbreviation
; Char 3   = config number, a = no idea, use base setting

[cm1]
ConfigPriority=HARDRECONFIG
IOConfig=7@240-27E%3F8(3FF::)
IOConfig=247-247(3FF::)
IRQConfig=S:2,3,4,5,7,10,11

[cm2]
ConfigPriority=HARDRECONFIG
IOConfig=7@280-2BE%3F8(3FF::)
IOConfig=287-287(3FF::)
IRQConfig=S:2,3,4,5,7,10,11

[cm3]
ConfigPriority=HARDRECONFIG
IOConfig=7@500-5BE%FF8(3FF::)
IOConfig=507-507(FFF::)
IRQConfig=S:2,3,4,5,7,10,11

[cm4]
ConfigPriority=HARDRECONFIG
IOConfig=7@580-5BE%FF8(3FF::)
IOConfig=587-587(3FF::)
IRQConfig=S:2,3,4,5,7,10,11

[cma]
ConfigPriority=HARDRECONFIG
IOConfig=7@100-3FF%3F8(3FF::)
IOConfig=1@100-3FF(3FF::)
IRQConfig=S:2,3,4,5,7,10,11

[dg1]
ConfigPriority=HARDRECONFIG
IOConfig=7@100-17E%3F8(3FF::)
IOConfig=140-140(3FF::)
IRQConfig=S:3,4,5,6,7,9,10,11,12,14,15

[dga]
ConfigPriority=HARDRECONFIG
IOConfig=7@100-3FF%3F8(3FF::)
IOConfig=1@100-3FF(3FF::)
IRQConfig=S:3,4,5,6,7,9,10,11,12,14,15

; End COM port LogConfig sections



[ComPort.PosDup]
*PNP0500,*PNP0501,*PNP0502

[ComPort.NT.PosDup]
*PNP0500,*PNP0501,*PNP0502,*PNP0510,*PNP0511,*SMCF010,*NSC6001

[DevMap.AddReg]
HKLM,hardware\devicemap\serialcomm,COM1,,COM1
HKLM,hardware\devicemap\serialcomm,COM2,,COM2


; "NoDrv" section: We do not yet support these port devices.
;----------------------------------------------------------
[NoDrv]

; "Non-port" sections: PCMCIA cards that look like COM
; ports, but aren't (excluding modems).
;----------------------------------------------------------
[NonPort]
CopyFiles=NonPort.Copy
AddReg=NonPort.AddReg

[NonPort.Copy]
serial.vxd

[NonPort.AddReg]
HKR,,PortSubClass,1,01
HKR,,DevLoader,,*vcomm
HKR,,PortDriver,,serial.vxd
HKR,,Contention,,*vcd
HKR,,DCB,3,1C,00,00,00, 80,25,00,00, 11,33,00,00, 00,00, 0a,00, 0a,00, 08, 00, 00, 11, 13, 00, 00, 00

[NonPort.NT]
;
; Unclear whether these devices are presently supported under NT.  For now, leave a blank
; install section so we won't run the Win9x stuff.  The fact that no function driver will be installed
; for this devnode will cause the installation to fail, which is what we want to have happen for now.
;

[Det.DevINFs]
*pnp8215=netxir.inf     ;Xircom PE3
*pnpa01e=scsi.inf       ;Trantor T338
*pnpa01f=scsi.inf       ;Trantor T348
*pnpa02f=scsi.inf       ;Trantor T358


; User readable strings
;----------------------------------------------------------
[Strings]
Lava="Lava Computer MFG Inc."
Lava-PCI_1_PARALLEL.DeviceDesc ="Lava Parallel PCI Card"
Quatech-F060.DeviceDesc = "Quatech Q-Lynx Parallel Adapter"
MS  = "Microsoft"
Std = "(Standard port types)"
PortsClassName = "Ports (COM & LPT)"
*PNP0400.DeviceDesc = "Printer Port"
*PNP0401.DeviceDesc = "ECP Printer Port"
*PNP0500.DeviceDesc = "Communications Port"
*PNP0501.DeviceDesc = "Communications Port"
*PNP0502.DeviceDesc = "Multiport Communications Port"
; Compaq devices
*CPQA0D9.DeviceDesc = "Communications Port"
HP = "Hewlett Packard"
MF\EISA_HWP1C10_DEV0.DeviceDesc="HP Communications Port"
IBM="IBM"
Socket="Socket Communications"
Socket-0484.DeviceDesc="Socket PCMCIA Serial Adapter"
Socket-12F8.DeviceDesc="Socket PCMCIA Serial Adapter"
Socket-5E3E.DeviceDesc="Socket PCMCIA Serial Adapter"
SocketDual.DeviceDesc="Socket PCMCIA Serial Device"
Socket-FA29.DeviceDesc="Socket PCMCIA PageCard V3.0"
Socket-AF8A.DeviceDesc="Socket PCMCIA GPS Adapter (Rev. B)"
Socket-66D0.DeviceDesc="Socket PCMCIA GPS Adapter (Rev. C)"
Socket-0104-0001.DeviceDesc="Socket PCMCIA Serial Adapter"
DBC="DBC"
DBC-4E9B.DeviceDesc="DBC SignalCard"
Rockwell="Rockwell"
Rockwell-64B7.DeviceDesc="Rockwell NavCard"
Trimble="Trimble"
Trimble-6947.DeviceDesc="Trimble PCMCIA GPS Adapter (Rev. B)"
Smart="SMART Modular Technologies"
Smart-A0F6.DeviceDesc="SMART Serial Port"
SIIG="SIIG"
SIIG-PCI_1_SERIAL.DeviceDesc ="SIIG CyberSerial Card"
SIIG-PCI_1_CYBERSERIAL.DeviceDesc ="SIIG CyberSerial Card"
Parport.SVCDESC  = "Parallel port driver"
Serial.SVCDESC   = "Serial port driver"
Serenum.SVCDESC = "Serenum Filter Driver"
Compaq = "Compaq GSM Radio Card"
Ericsson= "Ericsson GC25"
*ERIC.DeviceDesc = "Ericsson GC25"
*COMP.DeviceDesc = "Compaq GSM Radio Card"
Quatech = "Quatech"
Quatech-63EA.DeviceDesc = "Quatech Q-Lynx Serial Adapter"
