
;*******************************************************************************
; SSLACCEL.INF -- Main INF for Security Accelerator device class
; Copyright (c) Microsoft Corporation.  All rights reserved.
;*******************************************************************************

[Version]
Signature="$Windows NT$"
Class=Security Accelerator
ClassGuid={268C95A1-EDFE-11d3-95C3-0010DC4050A5}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

;*******************************************************************************
;  Security Accelerator Class Install Section
;*******************************************************************************

[ClassInstall32]
AddReg=sa_class_addreg

[sa_class_addreg]
HKR,,,,%SECURITYACCELERATORCLASSNAME%
HKR,,Icon,,"-5"
HKR,,NoInstallClass,,1

;*******************************************************************************
;  String Definitions
;*******************************************************************************

[Strings]
Msft = "Microsoft"
SECURITYACCELERATORCLASSNAME="Security Accelerators"

