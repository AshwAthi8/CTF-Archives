; USBCCID.INF
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature="$Windows NT$"
Class=SmartCardReader
ClassGuid={50DD5230-BA8A-11D1-BF5D-0000F805F530}
Provider=%Msft%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

; ================= Class section =====================

[ClassInstall32]
Addreg=SmartCardReaderClassReg

[ClassInstall]
Addreg=SmartCardReaderClassReg

[SmartCardReaderClassReg]
HKR,,,0,%ClassName%
HKR,,Icon,,-25
HKR,,NoInstallClass,,1
HKR,,Installer32,,"winscard.dll,ClassInstall32"

[Manufacturer]
%CCID%=CCID,NTamd64

; ============ Add reg for all readers ===============

[Reader.Install.AddReg]
HKLM, Software\Microsoft\Cryptography\Calais\Readers,,,
HKLM, System\CurrentControlSet\Services\SCardSvr,Start,0x00010001,2

; **************************
; USB CCID Compliant Readers
; **************************
[CCID.NTamd64]
%USBCCID.DeviceDesc% = USBCCID.Install,,USB\Class_0B&SubClass_00,USB\Class_0B

[USBCCID.Install.NT]
AddReg          = Reader.Install.AddReg
CopyFiles       = USBCCID.Install.CopyFiles

[USBCCID.Install.NT.HW]
AddReg          = USBCCID.Install.AddReg.HW

[USBCCID.Install.AddReg.HW]
HKR,,"VendorName",,"Generic"
HKR,,"IfdType",,"USB Smartcard"

[USBCCID.Install.CopyFiles]
usbccid.sys,,,2

[USBCCID.Install.NT.Services]
AddService = USBCCID, 2, USBCCID.Service

[USBCCID.Service]
DisplayName     = %USBCCID.DeviceDesc%
ServiceType     = 1 ;%SERVICE_KERNEL_DRIVER%
StartType       = 3 ;%SERVICE_AUTO_START%
ErrorControl    = 1 ;%SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\usbccid.sys

[DestinationDirs]
USBCCID.Install.CopyFiles = 12
































[Strings]
Msft                    = "Microsoft"
CCID                    = "USB CCID Compliant"
USBCCID.DeviceDesc      = "USB Smart Card reader"
ClassName               = "Smart card readers"
