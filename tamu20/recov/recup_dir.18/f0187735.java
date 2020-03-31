; Microsoft Windows Bluetooth Driver INF
; Copyright (c) 2002 Microsoft Corporation

[Version]
LayoutFile=layout.inf
Signature="$Windows NT$"
Class=Bluetooth
Provider=%MS%
CLASSGUID={e0cbf06c-cd8b-4647-bb8a-263b43f0f974}
DriverVer=03/24/2005,5.2.3790.1830

[DestinationDirs]
DefaultDestDir = 11                    ;LDID_SYS
BthPort.NT.CopyFiles = 12              ;DIRID_DRIVERS
BluetoothClass.NT.CopyFiles=11         ;LDID_SYS
BthUsb.NT.Copy = 12                    ;DIRID_DRIVERS
BthEnum.NT.Copy = 12                   ;DIRID_DRIVERS
Serial.NT.Copy = 12                    ;DIRID_DRIVERS
Fsquirt.NT.CopyFiles = 11              ;LDID_SYS
Bthprops.NT.CopyFiles = 11             ;LDID_SYS

[ClassInstall32.NT]
AddReg=BluetoothClass.NT.AddReg
CopyFiles=BluetoothClass.NT.CopyFiles

[BluetoothClass.NT.AddReg]
HKR,,,,%BluetoothClassName%
HKR,,NoInstallClass,,1
HKR,,Installer32,,"bthci.dll,BluetoothClassInstaller"
HKR,,Icon,,"201"

[BluetoothClass.NT.CopyFiles]
bthci.dll
bthserv.dll

[ControlFlags]
ExcludeFromSelect="BTH\MS_BTHBRB"

[Manufacturer]
%Microsoft%=Microsoft, NTamd64
ALPS=ALPS, NTamd64
Belkin=Belkin, NTamd64
Brain Boxes=BrainBoxes, NTamd64
Broadcom=Broadcom, NTamd64
Cambridge Silicon Radio Ltd.=Cambridge, NTamd64
Dell=Dell, NTamd64
FIC=FIC, NTamd64
GVC=GVC, NTamd64
HP=HP, NTamd64
IBM=IBM, NTamd64
MicrosoftHW=MicrosoftHW, NTamd64
Motion Computing=MotionComputing, NTamd64
Silicon Wave=SiliconWave, NTamd64
Sony=Sony, NTamd64
TDK=TDK, NTamd64
TOSHIBA=Toshiba, NTamd64
Wistron NeWeb=Wistron, NTamd64
Zeevo=Zeevo, NTamd64

;------------- Device section - Start -----------------------

[ALPS.NTamd64]
ALPS Integrated Bluetooth Device=                BthUsb, USB\Vid_044e&Pid_3005
Alps Bluetooth USB Adapter=                      BthUsb, USB\Vid_044e&Pid_3006

[Belkin.NTamd64]
Belkin Bluetooth Adapter=                        BthUsb, USB\Vid_050d&Pid_0081
Belkin Bluetooth Adapter=                        BthUsb, USB\Vid_050d&Pid_0084

[BrainBoxes.NTamd64]
Brain Boxes USB Bluetooth Adapter BL-554=        BthUsb, USB\Vid_05d1&Pid_0003

[Broadcom.NTamd64]
Blutonium BCM2035 Bluetooth 2.4 GHz Single Chip Transceiver= BthUsb, USB\VID_0A5C&PID_200A
BCM2033 Bluetooth 2.4 GHz Single Chip Transceiver= BthUsb, USB\VID_0A5C&PID_200F

[Cambridge.NTamd64]
Generic Bluetooth Radio=                         BthUsb, USB\Vid_0a12&Pid_0001
CSR Nanosira=                                    BthUsb, USB\Vid_0a12&Pid_0003
CSR Nanosira WHQL Reference Radio=               BthUsb, USB\Vid_0a12&Pid_0004
CSR Nanosira-Multimedia=                         BthUsb, USB\Vid_0a12&Pid_0005
CSR Nanosira-Multimedia WHQL Reference Radio=    BthUsb, USB\Vid_0a12&Pid_0006

[Dell.NTamd64]
Dell TrueMobile Bluetooth Module=                BthUsb, USB\VID_413C&PID_8000
Dell Wireless 350 Bluetooth Module=              BthUsb, USB\VID_413C&PID_8103

[FIC.NTamd64]
FIC Bluetooth Wireless Adapter=                  BthUsb, USB\Vid_05b1&Pid_1389

[GVC.NTamd64]
GVC Bluetooth Wireless Adapter=                  BthUsb, USB\Vid_0525&Pid_a220

[HP.NTamd64]
"HP USB BT Transceiver [1.2]"=                   BthUsb, USB\Vid_03F0&Pid_0C24

[IBM.NTamd64]
Bluetooth UltraPort Module from IBM=             BthUsb, USB\Vid_04BF&Pid_0317
IBM Integrated Bluetooth=                        BthUsb, USB\Vid_04BF&Pid_0318
IBM Integrated Bluetooth II=                     BthUsb, USB\Vid_1668&Pid_0441
IBM Integrated Bluetooth III=                    BthUsb, USB\Vid_1668&Pid_2441

[MicrosoftHW.NTamd64]
Microsoft Wireless Transceiver for Bluetooth=    BthUsb, USB\Vid_045e&Pid_007e
Microsoft Wireless Transceiver for Bluetooth 2.0= BthUsb, USB\Vid_045e&Pid_009c

[Microsoft.NTamd64]
%BTH\MS_BTHBRB.DeviceDesc%=                      BthEnum, BTH\MS_BTHBRB

[MotionComputing.NTamd64]
Motion Computing USB Bluetooth Device=           BthUsb, USB\Vid_10ab&Pid_1002

[SiliconWave.NTamd64]
Silicon Wave Bluetooth Wireless Adapter=         BthUsb, USB\Vid_0c10&Pid_0000&Rev_1350
Silicon Wave Bluetooth Wireless Adapter=         BthUsb, USB\Vid_0c10&Pid_0000
USB Bluetooth Wireless Adapter=                  BthUsb, USB\Vid_1310&Pid_0001

[Sony.NTamd64]
USB Bluetooth Device=                            BthUsb, USB\Vid_044E&Pid_3002
USB Bluetooth Device=                            BthUsb, USB\Vid_044E&Pid_3003
Sony Bluetooth USB Adapter=                      BthUsb, USB\Vid_044E&Pid_3004
USB Bluetooth Device=                            BthUsb, USB\Vid_044E&Pid_3007

[TDK.NTamd64]
TDK Bluetooth USB Adapter=                       BthUsb, USB\Vid_04BF&Pid_0319
TDK Bluetooth USB Adaptor=                       BthUsb, USB\VID_04BF&PID_0320

[Toshiba.NTamd64]
TOSHIBA Integrated Bluetooth=                    BthUsb, USB\Vid_0930&Pid_0502&Rev_1350
TOSHIBA Integrated Bluetooth 2=                  BthUsb, USB\Vid_0930&Pid_0505
TOSHIBA Integrated Bluetooth 3=                  BthUsb, USB\VID_0930&PID_0506
TOSHIBA Bluetooth Adapter=                       BthUsb, USB\Vid_0930&Pid_0507

[Zeevo.NTamd64]
Zeevo Bluetooth Solution=                        BthUsb, USB\Vid_0b7a&Pid_07d0&Rev_0126
Zeevo Bluetooth Solution=                        BthUsb, USB\Vid_0b7a&Pid_07d0&Rev_0133

;------------- Device section - End -----------------------

;----------------------------------------------------------------------------
; USB Bluetooth radios
;----------------------------------------------------------------------------

[BthUsb.NT]
AddReg=BthPort.NT.Setup.AddReg,BthPort.NT.AddReg
CopyFiles=BthUsb.NT.Copy, BthPort.NT.CopyFiles, Fsquirt.NT.CopyFiles, Bthprops.NT.CopyFiles
ProfileItems=Fsquirt.NT.ProfileItems

[BthUsb.NT.Copy]
BTHUSB.SYS

[BthUsb.NT.HW]
AddReg=BthPort.NT.HW.AddReg

[BthUsb.NT.Services]
Addservice = BTHUSB, 0x00000002, BthUsb_Service_Inst, BthUsb_EventLog_Inst
Addservice = BTHPORT, , BthPort_Service_Inst, BthPort_EventLog_Inst

[BthUsb_Service_Inst]
DisplayName    = %BTHUSB.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_AUTO_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %10%\System32\Drivers\BTHUSB.sys
LoadOrderGroup = PNP Filter

[BthUsb_EventLog_Inst]
AddReg=BthUsb_EventLog_Inst.AddReg

[BthUsb_EventLog_Inst.AddReg]
HKR,,EventMessageFile,0x00020002,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\Drivers\Bthport.sys;%%SystemRoot%%\System32\Drivers\BthUsb.sys"
HKR,,TypesSupported,0x00010003,7

;----------------------------------------------------------------------------
; BthEnum support sections
;----------------------------------------------------------------------------
[BthEnum.NT]
CopyFiles=BthEnum.NT.Copy

[BthEnum.NT.Copy]
bthenum.sys

[BthEnum.NT.Services]
AddService = BthEnum, 0x00000002, BthEnum_Service_Inst

[BthEnum_Service_Inst]
;-----------------------------------------------------
DisplayName     = %BthEnum.SVCDESC%
ServiceType     = 1                       ; SERVICE_KERNEL_DRIVER
StartType       = 3                       ; SERVICE_DEMAND_START
ErrorControl    = 1                       ; SERVICE_ERROR_NORMAL
ServiceBinary   = %12%\BthEnum.sys

;----------------------------------------------------------------------------
; BthPort support sections
;----------------------------------------------------------------------------

[BthPort.NT.AddReg]
; permanent child drivers
HKLM,%Bthport.Parameters%\PnpId,"RFCOMM",,"MS_RFCOMM"
HKLM,%Bthport.Parameters%\PnpId,"BTHBRB",,"MS_BTHBRB"
HKLM,%Bthport.Parameters%\PnpId,"BTHPAN",,"MS_BTHPAN"
HKLM,%Bthport.Parameters%\PerDevices,,,

; HID
HKLM,%Bthport.Parameters%\SupportedServices,"{00001124-0000-1000-8000-00805f9b34fb}",0x00010003,1
; HCRP
HKLM,%Bthport.Parameters%\SupportedServices,"{00001126-0000-1000-8000-00805f9b34fb}",0x00010003,1
; DUN
HKLM,%Bthport.Parameters%\SupportedServices,"{00001103-0000-1000-8000-00805f9b34fb}",0x00010003,1
; SPP
; SPP is enabled by bthport

; Local Services
; SPP default settings are done by bthport

HKLM,SOFTWARE\Microsoft\Windows\CurrentVersion\Run,"BluetoothAuthenticationAgent",0,"rundll32.exe bthprops.cpl,,BluetoothAuthenticationAgent"

[BthPort.NT.Setup.AddReg]
HKLM,%Bthport.Parameters%,,0x00000010
HKLM,%Bthport.Parameters%\Devices,,0x00000010
HKLM,%Bthport.Parameters%\Services,,0x00000010

[BthPort.NT.Setup.AddReg.Security]
; add the ability for power users and LocalService to modify the key and subkeys
"D:AR(A;CI;GRGW;;;PU)(A;CI;GRGW;;;LS)"

[BthPort.NT.CopyFiles]
bthport.sys

[BthPort.NT.HW.AddReg]
HKR,,%ScansBeforeOutOfRange%,0x00010003,8

;List of COD mask/value pairs. This info is used to enable the 'stored link key' feature for
;the specified devices. The feature is enabled if the expression (COD & mask) == value is true.
;Each value is 4 bytes and written in big-endian format to make the user input easier.
;For example: mask 0x00001F43 with value 0x00000540 matches Bluetooth keyboard devices.
HKR,,%StoreLinkKeyCodMasks%, 0x00000001, 00,00,1F,43, 00,00,05,40, 00,00,1F,83, 00,00,05,80

[BthPort_Service_Inst]
DisplayName    = %BTHPORT.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_AUTO_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %10%\System32\Drivers\BTHport.sys
LoadOrderGroup = PNP Filter
AddReg=BthPort_Service_Inst.AddReg

[BthPort_Service_Inst.AddReg]
HKR,"Parameters\Restrictions\COD Major 05 Minor 10","DontAddIncomingSPPInWizard", 0x00010001, 1
HKR,"Parameters\Restrictions\COD Major 05 Minor 20","DontAddIncomingSPPInWizard", 0x00010001, 1
HKR,"Parameters\Restrictions\COD Major 05 Minor 30","DontAddIncomingSPPInWizard", 0x00010001, 1
HKR,"Parameters\Restrictions\COD Major 06 Minor 20","DontAddIncomingSPPInWizard", 0x00010001, 1

[BthPort_EventLog_Inst]
AddReg=BthPort_EventLog_Inst.AddReg

[BthPort_EventLog_Inst.AddReg]
HKR,,EventMessageFile,0x00020002,"%%SystemRoot%%\System32\IoLogMsg.dll;%%SystemRoot%%\System32\Drivers\Bthport.sys"
HKR,,TypesSupported,0x00010003,7

[Fsquirt.NT.CopyFiles]
fsquirt.exe

[Fsquirt.NT.ProfileItems]
Name = %FSQUIRT_DESC%
CmdLine = 11,, fsquirt.exe
SubDir = %COMMUNICATIONS_GROUP%
WorkingDir = 11
IconIndex = 0
InfoTip = "@%11%\xpsp2res.dll,-2305"
DisplayResource = "%11%\xpsp2res.dll",2303

[Bthprops.NT.CopyFiles]
bthprops.cpl

[Strings]
;
; Not localizable
;
ScansBeforeOutOfRange="Scans Before Out of Range"
PeriodicInquiryEnabled="Periodic Inquiry Enabled"
PeriodicInquiryPeriod="Inquiry Period"
PeriodicInquiryMinSilence="Minimum Silence Period"
PeriodicInquiryMaxSilence="Maximum Silence Period"
Unsupported_HCI_Commands="Unsupported HCI commands"
StartDelay="StartDelay"
AclWriteDelay="AclWriteDelay"
StoreLinkKeyCodMasks="Store Link Key COD Masks"
Bthport.Parameters="SYSTEM\CurrentControlSet\Services\BTHPORT\Parameters"
;
;Localizable
;
BluetoothClassName="Bluetooth Radios"
BTHPORT.SvcDesc="Bluetooth Port Driver"
BthEnum.SVCDESC="Bluetooth Request Block Driver"
Bthser.SVCDESC="Bluetooth Radio Serial Driver"
BTHUSB.SvcDesc="Bluetooth Radio USB Driver"
BthBCSP.SVCDESC="BCSP Transport Protocol Driver"
Serial.SVCDESC   = "Serial port driver"
FSQUIRT_DESC="Bluetooth File Transfer Wizard"
COMMUNICATIONS_GROUP="Accessories\Communications"
Bth.Diskname="Bluetooth"
MS="Microsoft"
Microsoft="Microsoft"
; ------------- Device Strings - start -------------------------
; Microsoft
BTH\MS_BTHBRB.DeviceDesc="Microsoft Bluetooth Enumerator"
; ------------- Device Strings - end  --------------------------
