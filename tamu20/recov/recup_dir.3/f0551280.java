; Windows Modem Setup File
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Microsoft
; Provides modem device class setup in NT registry

[Version]
Signature="$WINDOWS NT$"
Class=Modem
ClassGUID={4D36E96D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ClassInstall32.NT]   
AddReg=Modem_Class

[Modem_Class]  
HKCU,"Control Panel\International",DefaultBlindDialFlag,1,00
HKR,,,,%MODEM%
HKR,, Installer32,,"mdminst.dll,ClassInstall32"
HKR,,Icon,,"0"
HKR,,TroubleShooter-0,,"hcp://help/tshoot/tsmodem.htm"
HKR,,Default Service,,"Modem"

[Manufacturer]
%Mfg% = Models,NTamd64
[Strings]
MSFT = "Microsoft"
Modem = "Modems"
