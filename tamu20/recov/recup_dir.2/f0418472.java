; Enum1394.INF -- 1394 IP Device Enumerator  for Windows NT 
; 
;
; Copyright (c) Microsoft Corporation.  All rights reserved.


[Version]
signature="$Windows NT$"
Class=Enum1394
ClassGuid={C459DF55-DB08-11d1-B009-00A0C9081FF6}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830


; =================== Class Sections ===========================
[ClassInstall32]
Addreg=Enum1394ClassReg


[Enum1394ClassReg]
HKR,,,,%Enum1394ClassName%
HKR,,SilentInstall,,1
HKR,,NoInstallClass,,"1"
HKR,,NoDisplayClass,,1
HKR,,Icon,,-21

; =================== Table of content =========================

[Manufacturer]
%MicrosoftMfg%=Microsoft,NTx86,NTia64,NTamd64

; =================== Microsoft ========================

[Microsoft.NTx86]
%1394\5E&1.DeviceDesc%=ENUM1394,1394\5E&1
%1394\MICROSOFT&1394_PC%=ENUM1394,1394\MICROSOFT&1394_PC

[Microsoft.NTia64]
%1394\5E&1.DeviceDesc%=ENUM1394,1394\5E&1
%1394\MICROSOFT&1394_PC%=ENUM1394,1394\MICROSOFT&1394_PC

[Microsoft.NTamd64]
%1394\5E&1.DeviceDesc%=ENUM1394,1394\5E&1
%1394\MICROSOFT&1394_PC%=ENUM1394,1394\MICROSOFT&1394_PC

;================== Win 9x Specific section ====================
[ENUM1394]
AddReg=ENUM1394.AddReg


[ENUM1394.AddReg]
HKR,,DevLoader,,*ntkern
HKR,,NTMPDriver,,enum1394.sys


;================ XP specific section===========================
[ENUM1394.NT]
AddReg=Enum1394.NT.AddReg
;no DDInstall as drivers are copied in 1394.inf


[Enum1394.NT.AddReg]
;empty

[ENUM1394.NT.Services]
AddService=ENUM1394,2,ENUM1394_ServiceInstall,enum1394.EventLog

[ENUM1394_ServiceInstall]
DisplayName=%1394\031887&040892.DeviceDesc%
ServiceType=1
StartType=3
ErrorControl=1
ServiceBinary=%12%\enum1394.sys

[enum1394.EventLog]
AddReg = EventLog.AddReg

[EventLog.AddReg]
HKR,,EventMessageFile,0x00020000,"%%SystemRoot%%\System32\netevent.dll"
HKR,,TypesSupported,0x00010001,7

[Strings]
Msft="Microsoft"
Enum1394ClassName="IEEE 1394 IP Network Enumerator"
MicrosoftMfg="Microsoft"
1394\MICROSOFT&1394_PC="1394 Host"
1394\5E&1.DeviceDesc = "IEEE 1394 IP Network Device"
1394\031887&040892.DeviceDesc = "IEEE 1394 IP Network Enumerator"
