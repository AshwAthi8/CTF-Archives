; tdiBth.inf -- RFCOMM transport
;
; Copyright 2002, Microsoft Corporation

[version]
;-----------------------------------------------------
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %MfgName%
DriverVer=03/24/2005,5.2.3790.1830

[Manufacturer]
;-----------------------------------------------------
%MfgName% = Msft,NTamd64

[Msft.NTamd64]
;-----------------------------------------------------
%RFCOMM.DisplayName% = RFCOMM.Install, BTH\MS_RFCOMM


[DestinationDirs]
;-----------------------------------------------------
DefaultDestDir   = 10  ; %windir%
RFCOMM.Files     = 12  ; %windir%\system32\drivers
RFCOMM.WSH.Files = 11  ; %windir%\system32

;*****************************************************
;=====================================================

;=====================================================
[RFCOMM.Install]
;-----------------------------------------------------
Characteristics = 0x0009 ; NCF_VIRTUAL | NCF_HIDDEN
include=netirda.inf
CopyFiles       = RFCOMM.Files, RFCOMM.WSH.Files, Irda.CopyFiles.Apps
AddReg          = RFCOMM.Reg

[RFCOMM.Install.HW]
AddReg=BthEnum.Reg

[RFCOMM.Files]
;-----------------------------------------------------
rfcomm.sys
BthEnum.sys

[RFCOMM.WSH.Files]
;-----------------------------------------------------
wshBth.dll

[RFCOMM.Reg]
;-----------------------------------------------------
HKR, Ndi,            HelpText,   0, %RFCOMM.HelpText%
HKR, Ndi,            Service,    0, "RFCOMM"
HKR, Ndi\Interfaces, UpperRange, 0, "noupper"
HKR, Ndi\Interfaces, LowerRange, 0, "nolower"

[BthEnum.Reg]
HKR,,"UpperFilters",0x00010000,"BthEnum"

;=====================================================
[SourceDisksNames.x86]
1 = %Bth.Diskname%,\win51ip.b2,,\i386

[SourceDisksNames.amd64]
1 = %Bth.Diskname%,\win51ip.b2,,\amd64

[SourceDisksFiles]
rfcomm.sys = 1
BthEnum.sys = 1
wshBth.dll =1

;=====================================================
[RFCOMM.Install.Services]
;-----------------------------------------------------
AddService = RFCOMM, 0x00000002, RFCOMM.AddService
AddService = BthEnum,,BthEnum.AddService

[RFCOMM.AddService]
;-----------------------------------------------------
DisplayName     = %RFCOMM.DisplayName%
ServiceType     = %SERVICE_KERNEL_DRIVER%
StartType       = %SERVICE_DEMAND_START%
ErrorControl    = %SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\rfcomm.sys
LoadOrderGroup  = "PNP_TDI"
Description     = %RFCOMM.DisplayName%

[BthEnum.AddService]
;-----------------------------------------------------
DisplayName     = %BthEnum.DisplayName%
ServiceType     = %SERVICE_KERNEL_DRIVER%
StartType       = %SERVICE_DEMAND_START%
ErrorControl    = %SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\BthEnum.sys


;=====================================================
[RFCOMM.Install.Winsock]
;-----------------------------------------------------
AddSock = RFCOMM.AddWinsockHelper

[RFCOMM.AddWinsockHelper]
;-----------------------------------------------------
TransportService  = RFCOMM
HelperDllName     = "%SystemRoot%\System32\wshBth.dll"
MaxSockAddrLength = 0x32
MinSockAddrLength = 0x1C
LibraryPath       = "%SystemRoot%\system32\wshbth.dll"
DisplayString     = "%MS_BTNSP.ProviderDesc%
SupportedNameSpace= 16
Version           = 0
ProviderId        = "{06AA63E0-7D60-41ff-AFB2-3EE6D2D9392D}"

[RFCOMM.Install.Remove.Winsock]
;-----------------------------------------------------
DelSock = RFCOMM.DelWinsockHelper

[RFCOMM.DelWinsockHelper]
;-----------------------------------------------------
TransportService = RFCOMM
;=====================================================

;*****************************************************



;=====================================================
[Strings]
;
; Non-Localizable
;
SERVICE_AUTO_START      = 2
SERVICE_DEMAND_START    = 3
SERVICE_KERNEL_DRIVER   = 1
SERVICE_ERROR_NORMAL    = 1
;=====================================================
;
; Localizable
;
;-----------------------------------------------------
MfgName                 = "Microsoft"
BTH.DiskName		= "Bluetooth"
BTH.DisplayName         = "Bluetooth"
RFCOMM.DisplayName      = "Bluetooth Device (RFCOMM Protocol TDI)"
RFCOMM.HelpText         = "Bluetooth RFCOMM HelpText"
MS_BTNSP.ProviderDesc   = "Bluetooth Namespace"
BthEnum.DisplayName     = "Bluetooth Enumerator Service"
;=====================================================
