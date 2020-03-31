=1394ClassReg     

[ClassInstall]
Addreg=1394ClassReg             

[1394ClassReg]
HKR,,,0,%1394ClassName%
HKR,,Icon,,-21
HKR,,Security,,"D:P(A;;GA;;;SY)(A;;GA;;;BA)"  ; ACL allowing System and Admin

[ControlFlags]
; All PnP devices should be excluded from manual AddDevice Applet list
ExcludeFromSelect=*

; =================== Table of content =========================
[DestinationDirs]
DefaultDestDir=12                               
1394_CopyFiles=12
OHCI_CopyFiles=12
ndis1394_CopyFiles=12

[Manufacturer]
%NECMfg%=NEC,NTamd64
%TIOHCIMfg%=TIOHCI,NTamd64
%NSCMfg%=NSC,NTamd64
%SONYMfg%=SONY,NTamd64
%GENERICMfg%=GENERIC,NTamd64
%VIAMfg%=VIA,NTamd64
%FUJITSUMfg%=FUJITSU,NTamd64
%AGEREMfg%=AGERE,NTamd64
%RICOHMfg%=RICOH,NTamd64


; =================== OHCI CONTROLLERS ========================

[GENERIC.NTamd64]
%PCI\CC_0C0010.DeviceDesc%=GENERIC_Install,PCI\CC_0C0010

[GENERIC_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles  

[GENERIC_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[GENERIC_Install.NT.Services]
AddService=ohci1394, 2, GENERIC_ServiceInstallSection

[GENERIC_ServiceInstallSection]
DisplayName=%PCI\CC_0C0010.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== NEC ========================

[NEC.NTamd64]
%PCI\VEN_1033&DEV_0063.DeviceDesc%=NEC_Install,PCI\VEN_1033&DEV_0063
%PCI\VEN_1033&CC_0C0010.DeviceDesc%=NEC_Install,PCI\VEN_1033&CC_0C0010

[NEC_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles 

[NEC_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[NEC_Install.NT.Services]
AddService=ohci1394, 2, NEC_ServiceInstallSection

[NEC_ServiceInstallSection]
DisplayName=%PCI\VEN_1033&DEV_0063.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== VIA ========================

[VIA.NTamd64]
%PCI\VEN_1106&DEV_3044.DeviceDesc%=VIA_Install,PCI\VEN_1106&DEV_3044
%PCI\VEN_1106&CC_0C0010.DeviceDesc%=VIA_Install,PCI\VEN_1106&CC_0C0010

[VIA_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles

[VIA_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[VIA_Install.NT.Services]
AddService=ohci1394, 2, VIA_ServiceInstallSection

[VIA_ServiceInstallSection]
DisplayName=%PCI\VEN_1106&DEV_3044.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys


; =================== National Semi ========================

[NSC.NTamd64]
%PCI\VEN_100B&DEV_000F.DeviceDesc%=NSC_Install,PCI\VEN_100B&DEV_000F
%PCI\VEN_100B&CC_0C0010.DeviceDesc%=NSC_Install,PCI\VEN_100B&CC_0C0010

[NSC_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles


[NSC_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[NSC_Install.NT.Services]
AddService=ohci1394, 2, NSC_ServiceInstallSection

[NSC_ServiceInstallSection]
DisplayName=%PCI\VEN_100B&DEV_000F.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== TI OHCI ========================
[TIOHCI.NTamd64]
%PCI\VEN_104C&DEV_8009.DeviceDesc%=TIOHCI_Install,PCI\VEN_104C&DEV_8009
%PCI\VEN_104C&DEV_8019.DeviceDesc%=TIOHCI_Install,PCI\VEN_104C&DEV_8019
%PCI\VEN_104C&CC_0C0010.DeviceDesc%=TIOHCI_Install,PCI\VEN_104C&CC_0C0010
%PCI\VEN_104C&DEV_8009&SUBSYS_8032104D.DeviceDesc%=TIOHCI_Install,PCI\VEN_104C&DEV_8009&SUBSYS_8032104D

[TIOHCI_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles

[TIOHCI_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg


[TIOHCI_Install.NT.Services]
AddService=ohci1394, 2, TIOHCI_ServiceInstallSection

[TIOHCI_ServiceInstallSection]
DisplayName=%PCI\VEN_104C&DEV_8009.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== SONY ========================

[SONY.NTamd64]
%PCI\VEN_104D&DEV_8039.DeviceDesc%=SONY_Install,PCI\VEN_104D&DEV_8039
%PCI\VEN_104D&DEV_8039&REV_03.DeviceDesc%=SONY_Install2,PCI\VEN_104D&DEV_8039&REV_03

[SONY_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles

[SONY_Install2]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles

[SONY_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[SONY_Install2.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[SONY_Install.NT.HW]
AddReg=SONY_WA_AddReg

[SONY_WA_AddReg]
HKR,,"DiagnosticMode",0x00010003,2


[SONY_Install.NT.Services]
AddService=ohci1394, 2, SONY_ServiceInstallSection

[SONY_Install2.NT.Services]
AddService=ohci1394, 2, SONY_ServiceInstallSection

[SONY_ServiceInstallSection]
DisplayName=%PCI\VEN_104D&DEV_8039.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== FUJITSU ========================

[FUJITSU.NTamd64]
%PCI\VEN_10CF&CC_0C0010.DeviceDesc%=FUJITSU_Install,PCI\VEN_10CF&CC_0C0010

[FUJITSU_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles 

[FUJITSU_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[FUJITSU_Install.NT.Services]
AddService=ohci1394, 2, FUJITSU_ServiceInstallSection

[FUJITSU_ServiceInstallSection]
DisplayName=%PCI\VEN_10CF&CC_0C0010.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== AGERE ========================

[AGERE.NTamd64]
%PCI\VEN_11C1&CC_0C0010.DeviceDesc%=AGERE_Install,PCI\VEN_11C1&CC_0C0010

[AGERE_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles 

[AGERE_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[AGERE_Install.NT.Services]
AddService=ohci1394, 2, AGERE_ServiceInstallSection

[AGERE_ServiceInstallSection]
DisplayName=%PCI\VEN_11C1&CC_0C0010.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== RICOH ========================

[RICOH.NTamd64]
%PCI\VEN_1180&CC_0C0010.DeviceDesc%=RICOH_Install,PCI\VEN_1180&CC_0C0010

[RICOH_Install]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles 

[RICOH_Install.NT]
CopyFiles=OHCI_CopyFiles, 1394_CopyFiles, ndis1394_CopyFiles
AddReg=Nic1394AddReg

[RICOH_Install.NT.Services]
AddService=ohci1394, 2, RICOH_ServiceInstallSection

[RICOH_ServiceInstallSection]
DisplayName=%PCI\VEN_1180&CC_0C0010.DeviceDesc%
ServiceType    = 1
StartType      = 0
ErrorControl   = 1
ServiceBinary  = %12%\ohci1394.sys

; =================== Generic ==================================

[Nic1394AddReg]
HKR,"Virtual Device List"\NIC1394\"LOCAL HOST EUI64",,,

[1394_CopyFiles]
1394bus.sys

[OHCI_CopyFiles]
ohci1394.sys

[ndis1394_CopyFiles]
enum1394.sys
nic1394.sys
arp1394.sys



[ControlFlags]

































[Strings]
MSFT="Microsoft"
1394ClassName="IEEE 1394 Bus host controllers"

NECMfg="NEC"
PCI\VEN_1033&DEV_0063.DeviceDesc="NEC FireWarden OHCI Compliant IEEE 1394 Host Controller"
PCI\VEN_1033&CC_0C0010.DeviceDesc="NEC OHCI Compliant IEEE 1394 Host Controller"

TIOHCIMfg="Texas Instruments"
PCI\VEN_104C&DEV_8009.DeviceDesc="Texas Instruments OHCI Compliant IEEE 1394 Host Controller"
PCI\VEN_104C&DEV_8019.DeviceDesc="Texas Instruments OHCI Compliant IEEE 1394 Host Controller"
PCI\VEN_104C&CC_0C0010.DeviceDesc="Texas Instruments OHCI Compliant IEEE 1394 Host Controller"

NSCMfg="National Semiconductor"
PCI\VEN_100B&DEV_000F.DeviceDesc="National Semiconductor OHCI Compliant IEEE 1394 Host Controller"
PCI\VEN_100B&CC_0C0010.DeviceDesc="National Semiconductor OHCI Compliant IEEE 1394 Host Controller"

SONYMfg="Sony Corporation"
PCI\VEN_104D&DEV_8039&REV_03.DeviceDesc="Sony CXD3222B OHCI i.LINK(IEEE 1394) PCI Host Controller"
PCI\VEN_104D&DEV_8039.DeviceDesc="Sony CXD3222 OHCI i.LINK(IEEE 1394) PCI Host Controller"
PCI\VEN_104C&DEV_8009&SUBSYS_8032104d.DeviceDesc="Sony 8032 OHCI i.LINK(IEEE 1394) PCI Host Controller"

VIAMfg="VIA"
PCI\VEN_1106&DEV_3044.DeviceDesc="VIA OHCI Compliant IEEE 1394 Host Controller"
PCI\VEN_1106&CC_0C0010.DeviceDesc="VIA OHCI Compliant IEEE 1394 Host Controller"

FUJITSUMfg="FUJITSU"
PCI\VEN_10CF&CC_0C0010.DeviceDesc="FUJITSU OHCI Compliant IEEE 1394 Host Controller"

AGEREMfg="AGERE"
PCI\VEN_11C1&CC_0C0010.DeviceDesc="AGERE OHCI Compliant IEEE 1394 Host Controller"

RICOHMfg="RICOH"
PCI\VEN_1180&CC_0C0010.DeviceDesc="RICOH OHCI Compliant IEEE 1394 Host Controller"


GENERICMfg="IEEE 1394 OHCI Compliant Host Controller Vendor"
PCI\CC_0C0010.DeviceDesc="OHCI Compliant IEEE 1394 Host Controller"


