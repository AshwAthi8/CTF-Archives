; LEGCYDRV.INF
; Copyright (c) Microsoft Corporation.  All rights reserved.

[version]
signature="$WINDOWS NT$"
Class=LegacyDriver
ClassGuid={8ECC055D-047F-11D1-A537-0000F8753ED1}
Provider=%MS%
DriverVer=10/01/2002,5.2.3790.1830

; Install class "Legacy Drivers"
;----------------------------------------------------------
[ClassInstall32.NT]
AddReg=LegacyDriverClass.NT.AddReg

[LegacyDriverClass.NT.AddReg]
HKR,,,,%LegacyDriverClassName%
HKR,,NoDisplayClass,,1
HKR,,SilentInstall,,1
HKR,,NoInstallClass,,1
HKR,,EnumPropPages32,,"SysSetup.Dll,LegacyDriverPropPageProvider"
HKR,,Icon,,"-19"

































; User readable strings
;----------------------------------------------------------
[Strings]
MS  = "Microsoft"
LegacyDriverClassName = "Non-Plug and Play Drivers"

