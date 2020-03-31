; This file installs the Supra Dual 56K modem
; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature  = "$Windows NT$"
Provider   = %MSFT%
Class      = MultiFunction
ClassGUID  = {4d36e971-e325-11ce-bfc1-08002be10318}
DriverVer=10/01/2002,5.2.3790.1830
LayoutFile=layout.inf

[ControlFlags]
ExcludeFromSelect=*SUP2440 

[Manufacturer]
%M_Supra% = Supra,NTamd64

[Supra.NTamd64]
%Supra1% = Sup2231GoCard.mf, *SUP2440 

[Sup2231GoCard.mf.NT]
Include = mf.inf
Needs = MFINSTALL.mf

[Sup2231GoCard.mf.NT.HW]
AddReg=Sup2231.mf.RegHW

[Sup2231.mf.RegHW]   
HKR, Child0000, HardwareID,  ,  MF\Shotgun_DEV0  ;modem1
HKR,Child0000,ResourceMap,1,00,02
HKR, Child0001, HardwareID,  ,  MF\Shotgun_DEV1  ;modem2
HKR,Child0001,ResourceMap,1,01,02

[Sup2231GoCard.mf.NT.Services]
Include = mf.inf
Needs = MFINSTALL.mf.Services

[Sup2231GoCard.mf.NT.LogConfigOverride]
LogConfig = Sup223x.mf.Override0, Sup223x.mf.Override1, Sup223x.mf.Override2, Sup223x.mf.Override3

[Sup223x.mf.Override0]
ConfigPriority = NORMAL
IOConfig       = 2F8-2FF                  ; Com2
IOConfig       = 20@100-FFFF%FFE0         ; NIC I/O
IRQConfig      = 3,4,5,7,9,10,11,12,15          ; IRQ    
MemConfig      = 1000@0-FFFFFFFF%FFFFF000 ; Memory Descriptor
PCCardConfig   = 59(W)                    ; ConfigIndex

[Sup223x.mf.Override1]
ConfigPriority = NORMAL
IOConfig       = 3E8-3EF                  ; Com3
IOConfig       = 20@100-FFFF%FFE0         ; NIC I/O
IRQConfig      = 3,4,5,7,9,10,11,12,15          ; IRQ    
MemConfig      = 1000@0-FFFFFFFF%FFFFF000 ; Memory Descriptor
PCCardConfig   = 69(W)                    ; ConfigIndex

[Sup223x.mf.Override2]
ConfigPriority = NORMAL
IOConfig       = 2E8-2EF                  ; Com4
IOConfig       = 20@100-FFFF%FFE0         ; NIC I/O
IRQConfig      = 3,4,5,7,9,10,11,12,15          ; IRQ    
MemConfig      = 1000@0-FFFFFFFF%FFFFF000 ; Memory Descriptor
PCCardConfig   = 79(W)                    ; ConfigIndex

[Sup223x.mf.Override3]
ConfigPriority = NORMAL
IOConfig       = 3F8-3FF                  ; Com1
IOConfig       = 20@100-FFFF%FFE0         ; NIC I/O
IRQConfig      = 3,4,5,7,9,10,11,12,15          ; IRQ
MemConfig      = 1000@0-FFFFFFFF%FFFFF000 ; Memory Descriptor
PCCardConfig   = 49(W)                    ; ConfigIndex

[Strings]
MSFT = "Microsoft"
M_Supra = "Diamond"
Supra1 = "Supra Dual 56K modem"
