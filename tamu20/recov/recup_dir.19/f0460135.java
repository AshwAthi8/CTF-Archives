;
; HPSCAN.INF  -- Windows Still Image Setup File
;
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Microsoft Corp for Hewlett Packard
[Version]
LayoutFile=Layout.inf
Signature="$CHICAGO$"
Class=Image
ClassGUID={6bdd1fc6-810f-11d0-bec7-08002be2092f}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*

[DestinationDirs]
DefaultDestDir=11                                ; LDID_SYS
Scsi.Scanner.DelWinFiles=10                      ; LDID_WIN
Scsi.Scanner.DelIOSFiles=12
Scsi.Scanner.DelStartFiles=10,"Start Menu\Programs\HP Scanning Software"

[Manufacturer]
%Mfg%=Models,NTamd64

[Models.NTamd64]
%USB\Vid_03f0&Pid_0101.DeviceDesc%          = 0101.Scanner,USB\Vid_03f0&Pid_0101
%USB\Vid_03f0&Pid_0201.DeviceDesc%          = 0201.Scanner,USB\Vid_03f0&Pid_0201
%USB\Vid_03f0&Pid_0401.DeviceDesc%          = 0401.Scanner,USB\Vid_03f0&Pid_0401
%USB\Vid_03f0&Pid_0601.DeviceDesc%          = 0601.Scanner,USB\Vid_03f0&Pid_0601

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

[0101.Scanner]
Include= sti.inf
Needs= STI.USBSection
SubClass=StillImage
DeviceType=1
Capabilities=0x31
Events=0101.Events
DeviceData=0101.DeviceData
AddReg=Scanner.AddReg,Usb.Scanner.AddReg
CopyFiles=SCL.Scanner.CopyFiles,Scanner.CopyFiles
UpdateInis=Scanner.CleanIni
DelReg=Scanner.DelReg
DelFiles=Scanner.DelSysFiles,Usb.Scanner.DelSysFiles
DeviceSubType=0x0105
OldVendorSetup="hpsjinst.dll,SetupHPDS"
ICMProfiles="sRGB Color Space Profile.icm"

[0101.DeviceData]
TwainDS="WIA-Hewlett-Packard ScanJet 4100C"
Model=C6290A
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}
MicroDriver="hpsjmcro.dll"

[0101.Events]
ScanButton=%SCANButton%,{A6C5A715-8C6E-11d2-977A-0000F87A926F},*
CopyButton=%CopyButton%,{B38E1061-65AB-11d1-A43B-080009EEBDF6},*

[0101.Scanner.Services]
Include=    sti.inf
Needs= STI.USBSection.Services

[0101.Scanner.coinstallers]
AddReg=Scanner.Coinstaller.AddReg

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

[0201.Scanner]
Include=    sti.inf
Needs= STI.USBSection
SubClass=StillImage
DeviceType=1
Capabilities=0x31
Events=0201.Events
DeviceData=0201.DeviceData
AddReg=Scanner.AddReg,Usb.Scanner.AddReg
CopyFiles=SCL.Scanner.CopyFiles,Scanner.CopyFiles
UpdateInis=Scanner.CleanIni
DelReg=Scanner.DelReg
DelFiles=Scanner.DelSysFiles,Usb.Scanner.DelSysFiles
DeviceSubType=0x0109
ICMProfiles="sRGB Color Space Profile.icm"

[0201.DeviceData]
TwainDS="WIA-Hewlett-Packard ScanJet 6200C"
Model=C6270A
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}
MicroDriver="hpsjmcro.dll"
Resolutions="75, 100, 150, 200, 300, 600, 1200"

[0201.Events]
ScanButton=%SCANButton%,{A6C5A715-8C6E-11d2-977A-0000F87A926F},*

[0201.Scanner.Services]
Include=    sti.inf
Needs= STI.USBSection.Services

[0201.Scanner.coinstallers]
AddReg=Scanner.Coinstaller.AddReg

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


[0401.Scanner]
Include=    sti.inf
Needs= STI.USBSection
SubClass=StillImage
DeviceType=1
Capabilities=0x31
Events=0401.Events
DeviceData=0401.DeviceData
AddReg=Scanner.AddReg,Usb.Scanner.AddReg
CopyFiles=SCL.Scanner.CopyFiles,Scanner.CopyFiles
UpdateInis=Scanner.CleanIni
DelReg=Scanner.DelReg
DelFiles=Scanner.DelSysFiles,Usb.Scanner.DelSysFiles
DeviceSubType=0x0109
OldVendorSetup="hpsjinst.dll,SetupHPDS"
ICMProfiles="sRGB Color Space Profile.icm"

[0401.DeviceData]
TwainDS="WIA-Hewlett-Packard ScanJet 5200C"
Model=C7190A
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}
MicroDriver="hpsjmcro.dll"

[0401.Events]
ScanButton=%SCANButton%,{A6C5A715-8C6E-11d2-977A-0000F87A926F},*

[0401.Scanner.Services]
Include=    sti.inf
Needs= STI.USBSection.Services

[0401.Scanner.coinstallers]
AddReg=Scanner.Coinstaller.AddReg

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


[0601.Scanner]
Include=    sti.inf
Needs= STI.USBSection
SubClass=StillImage
DeviceType=1
Capabilities=0x31
Events=0601.Events
DeviceData=0601.DeviceData
AddReg=Scanner.AddReg,Usb.Scanner.AddReg
CopyFiles=SCL.Scanner.CopyFiles,Scanner.CopyFiles
UpdateInis=Scanner.CleanIni
DelReg=Scanner.DelReg
DelFiles=Scanner.DelSysFiles,Usb.Scanner.DelSysFiles
DeviceSubType=0x0109
OldVendorSetup="hpsjinst.dll,SetupHPDS"
ICMProfiles="sRGB Color Space Profile.icm"

[0601.DeviceData]
TwainDS="WIA-Hewlett-Packard ScanJet 6300C"
Model=C7670A
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}
MicroDriver="hpsjmcro.dll"
Resolutions="75, 100, 150, 200, 300, 600, 1200"

[0601.Events]
ScanButton=%SCANButton%,{A6C5A715-8C6E-11d2-977A-0000F87A926F},*
CopyButton=%COPYButton%,{B38E1061-65AB-11d1-A43B-080009EEBDF6},*
EmailButton=%EMAILButton%,{8EFDF2C0-7260-11D2-A7C5-080009C09424},*
FaxButton=%FAXButton%,{8EFDF2C1-7260-11D2-A7C5-080009C09424},*
DOCButton=%DOCButton%,{8EFDF2C2-7260-11D2-A7C5-080009C09424},*

[0601.Scanner.Services]
Include=    sti.inf
Needs= STI.USBSection.Services

[0601.Scanner.coinstallers]
AddReg=Scanner.Coinstaller.AddReg


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

[Scanner.AddReg]
HKR,,HardwareConfig,1,2
HKR,,DevLoader,,*NTKERN
HKR,,USDClass,,"{BB6CF8E2-1511-40bd-91BA-80D43C53064E}"
HKCR,CLSID\{BB6CF8E2-1511-40bd-91BA-80D43C53064E},,,"Hewlett Packard USD"
HKCR,CLSID\{BB6CF8E2-1511-40bd-91BA-80D43C53064E}\InProcServer32,,,%11%\wiafbdrv.dll
HKCR,CLSID\{BB6CF8E2-1511-40bd-91BA-80D43C53064E}\InProcServer32,ThreadingModel,,"Both"

[Usb.Scanner.AddReg]
HKR,,NTMPDriver,,"usbscan.sys"

[SCL.Scanner.CopyFiles]
hpsjmcro.dll,,,32

[Scanner.CopyFiles]
wiafbdrv.dll,,,32

[Scanner.DelSysFiles]

[Usb.Scanner.DelSysFiles]

[Scanner.DelReg]


[Scanner.Coinstaller.AddReg]
; Not needed for post Win2k inbox drivers
;HKR,,CoInstallers32,0x00010000,"hpsjinst.dll,HPScannerCoInstaller"

































[Strings]







Msft="Microsoft"
Mfg="Hewlett-Packard"

SCSI\HP______C5110A__________3.DeviceDesc = "Hewlett-Packard ScanJet 5p"
SCSI\HP______C2520A__________3.DeviceDesc = "Hewlett-Packard ScanJet 6100C or 4c/3c"
SCSI\HP______C1130A__________3.DeviceDesc = "Hewlett-Packard ScanJet 4p"
SCSI\HP______C2570A__________3.DeviceDesc = "Hewlett-Packard ScanJet 3p"
SCSI\HP______C2500A__________3.DeviceDesc = "Hewlett-Packard ScanJet IIcx"
SCSI\HP______C1790A__________3.DeviceDesc = "Hewlett-Packard ScanJet IIp"
SCSI\HP______C1750A__________3.DeviceDesc = "Hewlett-Packard ScanJet IIc"
SCSI\HP______C5190A__________3.DeviceDesc = "Hewlett-Packard ScanJet 5100C"
SCSI\HP______C6270A__________3.DeviceDesc = "Hewlett-Packard ScanJet 6200C"
SCSI\HP______C7670A__________3.DeviceDesc = "Hewlett-Packard ScanJet 6300C"
SCSI\HP______C7190A__________3.DeviceDesc = "Hewlett-Packard ScanJet 5200C"
USB\Vid_03f0&Pid_0101.DeviceDesc          = "Hewlett-Packard ScanJet 4100C"
USB\Vid_03f0&Pid_0201.DeviceDesc          = "Hewlett-Packard ScanJet 6200C"
USB\Vid_03f0&Pid_0401.DeviceDesc          = "Hewlett-Packard ScanJet 5200C"
USB\Vid_03f0&Pid_0601.DeviceDesc          = "Hewlett-Packard ScanJet 6300C"
USB\Vid_03f0&Pid_0701.DeviceDesc          = "Hewlett-Packard ScanJet 5300C/5370C"
USB\Vid_03f0&Pid_0105.DeviceDesc          = "Hewlett-Packard ScanJet 4200C"
USB\Vid_03f0&Pid_0205.DeviceDesc          = "Hewlett-Packard ScanJet 3300C"
USB\Vid_03f0&Pid_0305.DeviceDesc          = "Hewlett-Packard ScanJet 4300C"
USB\Vid_03f0&Pid_0405.DeviceDesc          = "Hewlett-Packard ScanJet 3400C"
USB\Vid_03f0&Pid_0505.DeviceDesc          = "Hewlett-Packard ScanJet 2100C"

SCANButton="Scan Button Press"
COPYButton="Copy Button Press"
EMAILButton="E-Mail Button Press"
FAXButton="Fax Button Press"
DOCButton="Document Management Press"

