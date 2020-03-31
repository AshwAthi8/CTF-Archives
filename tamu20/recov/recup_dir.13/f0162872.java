**********************************
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

