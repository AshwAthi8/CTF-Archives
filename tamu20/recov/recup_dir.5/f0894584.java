; Installation inf for devices supporting Media Transfer Protocol (MTP)
;
; Copyright (c) Microsoft Corporation.
;

[Version]
Signature="$WINDOWS NT$"
Class=WPD
ClassGUID={EEC5AD98-8080-425f-922A-DABF3DE3F69A}
Provider=%Msft%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ClassInstall32.NT]
AddReg=WPDClassReg

[DestinationDirs]
MTP.Files.Kernel = 12
MTP.Files.Core = 11

[Manufacturer]
%MfgName%=Generic,NTamd64
%MfgNameVendorModels%=VendorModels,NTamd64

[Generic.NTamd64]
;
;Device is identified by Microsoft OS descriptor
;If your device does not support it, use specific VID & PID for identification
;
%GenericMTP.DeviceDesc%=MTP, USB\MS_COMP_MTP

[VendorModels.NTamd64]

;Creative PMC
%GenericMTP.DeviceDesc%=MTP, USB\VID_041E&PID_4123

;Samsung PMC
%GenericMTP.DeviceDesc%=MTP, USB\VID_04E8&PID_5A0F

;Intel Bandon PMC
%GenericMTP.DeviceDesc%=MTP, USB\VID_045E&PID_00C9

;iRiver PMC
%GenericMTP.DeviceDesc%=MTP, USB\VID_1006&PID_4002
%GenericMTP.DeviceDesc%=MTP, USB\VID_1006&PID_4003

;;******************************************************************************
;; The following are to be used in vendor specific "Includes" and "Needs" sections.
;; Specifically, the INF should contain:
;;
;; [DDInstall]
;; Include = wpdmtp.inf
;; Needs   = WPD.MTP.CopyFiles
;; 
;; [DDInstall.hw]
;; Include = wpdmtp.inf
;; Needs   = WPD.MTP.Registration
;;
;; [DDInstall.Services]
;; Include = wpdmtp.inf
;; Needs   = WPD.MTP.Services
;;
;;******************************************************************************

[WPD.MTP.CopyFiles]
CopyFiles = MTP.Files.Kernel, MTP.Files.Core
RegisterDlls = MTP.RegisterComServers

[WPD.MTP.Registration]
AddReg    = MTP.WmdmRegistration, MTP.DriverCustomization, WDF.Registration, MTP.AutoPlayRegistration
CopyFiles = 

[WPD.MTP.Services]
AddService = WpdUsb, 0x2, MTP.WpdUsb.AddService




[MTP.NT]
CopyFiles = MTP.Files.Kernel, MTP.Files.Core
RegisterDlls = MTP.RegisterComServers

[MTP.NT.hw]
AddReg    = MTP.WmdmRegistration, MTP.DriverCustomization, WDF.Registration, MTP.AutoPlayRegistration
CopyFiles = 

[MTP.Files.Kernel]
WpdUsb.sys

[MTP.Files.Core]
WpdMtpDr.dll
WpdMtp.dll
WpdMtpUS.dll
WpdConns.dll
WpdTrace.dll

;Wpdsp.dll is in layout.inx with copy always attribute

[MTP.NT.Services]
AddService=WpdUsb, 0x2, MTP.WpdUsb.AddService

[MTP.RegisterComServers]
11,,wpdconns.dll,1
11,,wpdmtpus.dll,1
11,,wpdmtp.dll,1

;Wpdsp.dll is registered in wpd.inf

[MTP.WmdmRegistration]
HKR,,"UseExtendedWmdm",0x10001,1
HKR,,"WMDMSPCLSID",,"{77F7F122-20B0-4117-A2FB-059D1FC88256}"
HKR,,"ShowInShell",0x10001,1

; This lists the interfaces which WpdUsb.sys will register on device start
HKR,,"Interfaces",0x00010000,"{6ac27878-a6fa-4155-ba85-f98f491d4f33}","{f33fdc04-d1ac-4e8e-9a30-19bbd4b108ae}","{14480d3f-7a47-4a75-aaef-b14f56397153}"

[MTP.DriverCustomization]
HKR,"MTP","IgnoreOpCodes",,""

;; Enable driver side object handle caching when writing to the device.
HKR,"MTP","CacheOnWrite",0x10001,1

;; Threshold for number of objects in a given folder afterwhich the driver
;; will query for object properties only upon application request (as 
;; opposed to querying for objects and their properties at enumeration 
;; time)
HKR,"MTP","EnumThreshold",0x10001,200

;; Threshold for number of objects in a given folder afterwhich the driver
;; will query for object property groups during enumeration 
;; time)
HKR,"MTP","PropertyGroupThreshold",0x10001,10

;; Report Storage Serial Number support in MTP driver
HKR,"MTP","ReportStorageSerialNumber",0x10001,1


[MTP.AutoPlayRegistration]
; Per interface setting enabling Autoplay
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\AutoplayHandlers\DeviceClasses\{14480d3f-7a47-4a75-aaef-b14f56397153}","DeviceGroup",,"PortableAudioPlayer"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\AutoplayHandlers\DeviceClasses\{14480d3f-7a47-4a75-aaef-b14f56397153}","Label",,%Autoplay.Label%
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\AutoplayHandlers\DeviceClasses\{14480d3f-7a47-4a75-aaef-b14f56397153}","DeviceHandlers",,"MTPMediaPlayerHandler"
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\AutoplayHandlers\DeviceClasses\{14480d3f-7a47-4a75-aaef-b14f56397153}","Icons",0x00010000,"%%SystemRoot%%\system32\shell32.dll,-299"
;   DeviceHandler
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\AutoplayHandlers\DeviceHandlers\MTPMediaPlayerHandler\EventHandlers\DeviceArrival","MTPMediaPlayerArrival",,""
;   EventHandlers.  Creating an empty key will give "Take no action" option if no handlers are registered.
HKLM,"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\AutoplayHandlers\EventHandlers\MTPMediaPlayerArrival\",,0x00000012

[WPDClassReg]
HKR,,,,%WpdClassName%
HKR,,Installer32,,"wpd_ci.dll,WpdClassInstaller"
HKR,,Icon,,"100"

;
;User mode WDF Registration
;
[WDF.Registration]
HKR,"WDFU","DriverList",0x00010008,"WpdMtpDr"
HKR,"WDFU","Isolated",0x10001,1
HKR,"WDFU","DeviceInterfaces",0x00010000,"{f33fdc04-d1ac-4e8e-9a30-19bbd4b108ae}","{14480d3f-7a47-4a75-aaef-b14f56397153}"

; WDF host process
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF\Services"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF\Services\WpdMtpDr","ImagePath",0x00020000,"WpdMtpDr.dll"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF\Services\WpdMtpDr","WdfHostProcessGUID",0x00000000,"{63432f85-815a-4a44-be78-cbdf484acd93}"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF\Services\{63432f85-815a-4a44-be78-cbdf484acd93}","WdfHostProcessImagePath",0x00020000,"%11%\uWDF.exe"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF\Services\{63432f85-815a-4a44-be78-cbdf484acd93}","WdfHostProcessExitTimeout",0x00010001,10
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\WDF\Services\{63432f85-815a-4a44-be78-cbdf484acd93}","WdfHostProcessStartTimeout",0x00010001,10

[WDF.Registration.security]
"D:P(A;OICI;GA;;;SY)(A;OICI;GA;;;BA)(A;OICI;GR;;;LS)"

;
; WpdUsb Kernel mode driver
;
[MTP.WpdUsb.AddService]
DisplayName    = %WpdUsb.SvcDesc%
ServiceType    = 1                  ; SERVICE_KERNEL_DRIVER
StartType      = 3                  ; SERVICE_DEMAND_START
ErrorControl   = 1                  ; SERVICE_ERROR_NORMAL
ServiceBinary  = %10%\System32\Drivers\wpdusb.sys
LoadOrderGroup = Base
































[Strings]













Msft="Microsoft"
WpdClassName="Windows Portable Devices"
WpdUsb.SvcDesc="WpdUsb"
GenericMTP.DeviceDesc="MTP Device"
MfgName="(Standard MTP-compliant devices)"
MfgNameVendorModels="(Standard MTP-Compliant Device)"
Autoplay.Label= "MTP Media Player"

