%SCSIClassName%
HKR,,Installer32,,"SysSetup.Dll,ScsiClassInstaller"
HKR,,Icon,,"-10"
HKR,,LegacyInfOption,,"SCSI"
HKR,,DeviceType,0x10001,4                       ; FILE_DEVICE_CONTROLLER
HKR,,DeviceCharacteristics,0x10001,0x100        ; Use same security checks on relative opens
HKR,,Security,,"D:P(A;;GAFA;;;SY)(A;;GAFA;;;BA)"

[DestinationDirs]
DefaultDestDir = 12 ; DIRID_DRIVERS

[ControlFlags]
ExcludeFromSelect = *

[Manufacturer]

;;
;; All architectures
;;

%ADP%=ADAPTEC,NTamd64
%COMPAQ%=COMPAQ,NTamd64
%DELL%=DELL,NTamd64
%EMULEX%=EMULEX,NTamd64
%HP%=HP,NTamd64
%LSI%=LSI,NTamd64
%QLOGIC%=QLOGIC,NTamd64
%I2O%=I2O,NTamd64
%TEKRAM%=TEKRAM,NTamd64
%AMI%=AMI,NTamd64
%IBM%=IBM,NTamd64
%AGILENT%=AGILENT,NTamd64

;;
;; Non-IA64 only (currently x86 and AMD64)
;;


%GENERIC%=GENERIC,NTamd64
%INTEL%=INTEL,NTamd64
%PROMISE%=PROMISE,NTamd64



;;
;; I386 only
;;
































































































;********************************
;Adaptec Manufacturer device list

[ADAPTEC.NTamd64]
;
; Adaptec Controllers
;


%PCI\VEN_9005&DEV_00CF.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_00CF
%PCI\VEN_9005&DEV_00C0.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_00C0
%PCI\VEN_9005&DEV_008F.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_008F
%PCI\VEN_9005&DEV_0080.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0080
%PCI\VEN_9005&DEV_0081.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0081
%PCI\VEN_9005&DEV_8010.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8010
%PCI\VEN_9005&DEV_8011.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8011
%PCI\VEN_9005&DEV_8012.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8012
%PCI\VEN_9005&DEV_801D.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_801D
%PCI\VEN_9005&DEV_801E.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_801E
%PCI\VEN_9005&DEV_801F.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_801F
%PCI\VEN_9005&DEV_800F.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_800F
%PCI\VEN_9005&DEV_800F&SUBSYS_005F9005.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_800F&SUBSYS_005F9005
%PCI\VEN_9005&DEV_8000&SUBSYS_00609005.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8000&SUBSYS_00609005
%PCI\VEN_9005&DEV_8014&SUBSYS_00449005.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8014&SUBSYS_00449005
%PCI\VEN_9005&DEV_8015&SUBSYS_00409005.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8015&SUBSYS_00409005
%PCI\VEN_9005&DEV_8016&SUBSYS_00409005.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8016&SUBSYS_00409005
%PCI\VEN_9005&DEV_8017&SUBSYS_00449005.DeviceDesc% = adpu320_Inst, PCI\VEN_9005&DEV_8017&SUBSYS_00449005
%PCI\VEN_9005&DEV_0050.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0050
%PCI\VEN_9005&DEV_0051.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0051
%PCI\VEN_9005&DEV_0010.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0010
%PCI\VEN_9004&DEV_8178.DeviceDesc% = aic78xx_Inst, PCI\VEN_9004&DEV_8178
%PCI\VEN_9004&DEV_8478.DeviceDesc% = aic78xx_Inst, PCI\VEN_9004&DEV_8478
%PCI\VEN_9004&DEV_8578.DeviceDesc% = aic78xx_Inst, PCI\VEN_9004&DEV_8578
%PCI\VEN_9005&DEV_00C0&SUBSYS_F6209005.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_00C0&SUBSYS_F6209005
%PCI\VEN_9005&DEV_00C0&SUBSYS_F6200E11.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_00C0&SUBSYS_F6200E11
%PCI\VEN_9005&DEV_0080&SUBSYS_E2A09005.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0080&SUBSYS_E2A09005
%PCI\VEN_9005&DEV_0080&SUBSYS_E2A00E11.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0080&SUBSYS_E2A00E11
%PCI\VEN_9005&DEV_0080&SUBSYS_62A09005.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0080&SUBSYS_62A09005
%PCI\VEN_9005&DEV_0080&SUBSYS_E2209005.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0080&SUBSYS_E2209005
%PCI\VEN_9005&DEV_0081&SUBSYS_62A19005.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0081&SUBSYS_62A19005
%PCI\VEN_9005&DEV_0082&SUBSYS_02109005.DeviceDesc% = adpu160m_Inst, PCI\VEN_9005&DEV_0082&SUBSYS_02109005
%PCI\VEN_9005&DEV_0050&SUBSYS_F5009005.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0050&SUBSYS_F5009005
%PCI\VEN_9005&DEV_0051&SUBSYS_B5009005.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0051&SUBSYS_B5009005
%PCI\VEN_9005&DEV_0010&SUBSYS_A1009005.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0010&SUBSYS_A1009005
%PCI\VEN_9005&DEV_0010&SUBSYS_A1809005.DeviceDesc% = aic78u2_Inst, PCI\VEN_9005&DEV_0010&SUBSYS_A1809005
%PCI\VEN_1044&DEV_A501&SUBSYS_C0471044.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A501&SUBSYS_C0471044
%PCI\VEN_1044&DEV_A501&SUBSYS_C03C1044.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A501&SUBSYS_C03C1044
%PCI\VEN_1044&DEV_A501&SUBSYS_C05A1044.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A501&SUBSYS_C05A1044
%PCI\VEN_1044&DEV_A501&SUBSYS_C0661044.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A501&SUBSYS_C0661044
%PCI\VEN_1044&DEV_A501&SUBSYS_C0641044.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A501&SUBSYS_C0641044
%PCI\VEN_1044&DEV_A501&SUBSYS_C0651044.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A501&SUBSYS_C0651044
%2010S.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A511&SUBSYS_C0351044
%2015S.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A511&SUBSYS_C0341044
%2000S.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A511&SUBSYS_C0331044
%2005S.DeviceDesc% = dpti2o_Inst, PCI\VEN_1044&DEV_A511&SUBSYS_C0321044

%adptVulcan.DeviceDesc%     = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_02859005
%adptVulcan.DeviceDesc%     = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_02879005
%adptCrusader.DeviceDesc%   = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_02869005	
%adptSkyhawk.DeviceDesc%    = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_028A9005				
%adptSkyhawkSata.DeviceDesc% = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_028E9005
%adptTerminator.DeviceDesc% = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_028B9005
%adptTerminatorSata.DeviceDesc% = arc_Inst,     PCI\VEN_9005&DEV_0285&SUBSYS_028F9005
%adptJaguar.DeviceDesc%     = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_02909005
%adptCorsair8.DeviceDesc%   = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_02929005
%adptCorsair16.DeviceDesc%  = arc_Inst, PCI\VEN_9005&DEV_0285&SUBSYS_02939005









































;
; Aic 78xx
;

[aic78xx_Inst]
CopyFiles = @aic78xx.sys

[aic78xx_Inst.Services]
AddService = aic78xx, %SPSVCINST_ASSOCSERVICE%, aic78xx_Service_Inst, Miniport_EventLog_Inst

[aic78xx_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\aic78xx.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi

;
; aic78u2
;

[aic78u2_Inst]
CopyFiles = @aic78u2.sys

[aic78u2_Inst.Services]
AddService = aic78u2, %SPSVCINST_ASSOCSERVICE%, aic78u2_Service_Inst, Miniport_EventLog_Inst

[aic78u2_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\aic78u2.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi

;
; adpu160m
;

[adpu160m_Inst]
CopyFiles = @adpu160m.sys

[adpu160m_Inst.Services]
AddService = adpu160m, %SPSVCINST_ASSOCSERVICE%, adpu160m_Service_Inst, Miniport_EventLog_Inst

[adpu160m_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\adpu160m.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi

;
; adpu320
;

[adpu320_Inst]
CopyFiles = @adpu320.sys

[adpu320_Inst.Services]
AddService = adpu320, %SPSVCINST_ASSOCSERVICE%, adpu320_Service_Inst, Miniport_EventLog_Inst

[adpu320_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\adpu320.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi
AddReg         = adpu320_Registry_Update

[adpu320_Registry_Update]
HKR,"Parameters\Device","NumberOfRequests",0x00010001,255
HKR,"Parameters\Device","MaximumSGList",0x00010001,65
HKR,"Parameters\Device","DriverParameter",0x00000000,"/MAXTAGS=64"


;
; arc
;

[arc_Inst]
CopyFiles = @arc.sys

[arc_Inst.Services]
AddService = arc, %SPSVCINST_ASSOCSERVICE%, arc_Service_Inst, Miniport_EventLog_Inst

[arc_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\arc.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_raid
AddReg         = arc_param_numrequests

[arc_param_numrequests]
HKR, "Parameters\Device", "NumberOfRequests", 0x00010001, 254


;
; dpti2o
;

[dpti2o_Inst]
CopyFiles = @dpti2o.sys

[dpti2o_Inst.Services]
AddService = dpti2o, %SPSVCINST_ASSOCSERVICE%, dpti2o_Service_Inst, Miniport_EventLog_Inst

[dpti2o_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\dpti2o.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_raid
AddReg         = dpti2o_param_numrequests

[dpti2o_param_numrequests]
HKR,"Parameters\Device","NumberOfRequests",0x00010001,0x40


;****************************
;AMI Manufacturer device list
[AMI.NTamd64]

%megaraid.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_03A2113C
%mraid428.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_9010
%mraid434.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_9060
%mraid438.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0438101E
%mraid466.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0466101E
%mraid467.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0467101E
%mraid490.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0490101E


%mraid471.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0471101E
%mraid471.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_0471101E
%mraid493.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0493101E
%mraid493.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_0493101E
%mraid475.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_0475101E
%mraid475.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_0475101E

%mraid518.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_05181000
%mraid520.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_05201000
%mraid520a.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_A5201000
%mraid530.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_0407&SUBSYS_05301000
%mraid531.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_0407&SUBSYS_05311000
%mraid532.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_0407&SUBSYS_05321000

;MegaRAID SATA-150
%mraid523-4.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_45231000
%mraid523-6.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_05231000

[Mraid35x_Inst]
CopyFiles = @mraid35x.sys

[Mraid35x_Inst.Services]
AddService = mraid35x, %SPSVCINST_ASSOCSERVICE%, mraid35x_Service_Inst, Miniport_EventLog_Inst

[Mraid35x_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\mraid35x.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_raid
AddReg         = Mraid35x_device_settings

[Mraid35x_device_settings]
HKR, "Parameters\Device", "NumberOfRequests", 0x00010001, 0x00000080

;****************************
;DELL Manufacturer device list
[DELL.NTamd64]



%Dell471.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_04711028
%Dell471.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_04711028
%Dell475.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_04751028
%Dell493.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_04931028
%Dell493.DeviceDesc% = Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_04931028
%DellDiscovery.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1028&DEV_000E&SUBSYS_01231028
%Dell520.DeviceDesc%       = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_05201028
%Dell518.DeviceDesc%       = Mraid35x_Inst, PCI\VEN_1000&DEV_1960&SUBSYS_05181028
%DellPerc4esi.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1028&DEV_0013&SUBSYS_016C1028
%DellPerc4edi.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1028&DEV_0013&SUBSYS_016D1028
%DellPerc4edi.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1028&DEV_0013&SUBSYS_016E1028
%DellPerc4edi.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1028&DEV_0013&SUBSYS_016F1028
%DellPerc4edi.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1028&DEV_0013&SUBSYS_01701028
%DellPerc4edc.DeviceDesc% = Mraid35x_Inst, PCI\VEN_1000&DEV_0408&SUBSYS_00021028


%Dell.DeviceDesc%    = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_11111028
%Dell.DeviceDesc%    = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_11121111
%Dell.DeviceDesc%    = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_11111111
%Dell467.DeviceDesc% = Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_04671028


























































































;****************************
;HP Manufacturer device list
[HP.NTamd64]

%netraid3si.DeviceDesc% =   Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_10C6103C
%NetRaid.DeviceDesc% =      Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_10C7103C
%NetRaid.DeviceDesc% =      Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_10CC103C
%netraid1si.DeviceDesc% =   Mraid35x_Inst, PCI\VEN_8086&DEV_1960&SUBSYS_10CD103C

%netraid1M.DeviceDesc% =    Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_60E7103C
%netraid2M.DeviceDesc% =    Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_60E8103C
%NetRaid.DeviceDesc%   =    Mraid35x_Inst, PCI\VEN_101E&DEV_1960&SUBSYS_60E3103C



























;*******************************
;Compaq Manufacturer device list
[COMPAQ.NTamd64]















































;
; this is a compaq device - yes it should be here.
;

%PCI\VEN_1000&DEV_0012&SUBSYS_001b0e11.DeviceDesc% = sym_hi_Inst, PCI\VEN_1000&DEV_0012&SUBSYS_001b0e11
%PCI\VEN_1000&DEV_000b&SUBSYS_60040e11.DeviceDesc% = sym_hi_Inst, PCI\VEN_1000&DEV_000b&SUBSYS_60040e11

%*CPQFD17.DeviceDesc%=NO_DEV,,*CPQFD17






























































































;;***********************************************
;; ICP Vortex device list

[INTEL.NTamd64]

;;
;; IIRSP (Vortex)
;;

%*PCI\VEN_1119&DEV_0300.DeviceDesc% = iirsp_Inst, PCI\VEN_1119&DEV_0300
%*PCI\VEN_8086&DEV_0600.DeviceDesc% = iirsp_Inst, PCI\VEN_8086&DEV_0600


[iirsp_Inst]
CopyFiles=@iirsp.sys

[iirsp_Inst.Services]
AddService = iirsp, 0x00000002, iirsp_Service_Inst, Miniport_EventLog_Inst

[iirsp_Service_Inst]
ServiceType     = %SERVICE_KERNEL_DRIVER%
StartType       = %SERVICE_BOOT_START%
ErrorControl    = %SERVICE_ERROR_NORMAL%
ServiceBinary   = %12%\iirsp.sys
LoadOrderGroup  = SCSI Miniport
AddReg          = pnpsafe_pci_addreg
;AddReg         = bus_type_raid


















































































































;*******************************
;QLogic Manufacturer device list
[QLOGIC.NTamd64]






















































































































































































;****************************
;IBM Manufacturer device list
[IBM.NTamd64]



















































































































































;****************************
;PROMISE Manufacturer device list
[PROMISE.NTamd64]
;;
;; Ultra
;;
%PCI\VEN_105A&DEV_4D68&CC_0180.DeviceDesc%=ultra_Inst, PCI\VEN_105A&DEV_4D68&CC_0180
%PCI\VEN_105A&DEV_4D30&CC_0180.DeviceDesc%=ultra_Inst, PCI\VEN_105A&DEV_4D30&CC_0180
%PCI\VEN_105A&DEV_0D30&CC_0180.DeviceDesc%=ultra_Inst, PCI\VEN_105A&DEV_0D30&CC_0180
%PCI\VEN_105A&DEV_4D38&CC_0180.DeviceDesc%=ultra_Inst, PCI\VEN_105A&DEV_4D38&CC_0180
%PCI\VEN_105A&DEV_4D33.DeviceDesc%=ultra_Inst, PCI\VEN_105A&DEV_4D33
%PCI\VEN_105A&DEV_4D69.DeviceDesc%=ultra_Inst, PCI\VEN_105A&DEV_4D69

[ultra_Inst]
CopyFiles = @ultra.sys

[ultra_Inst.Services]
AddService = ultra, %SPSVCINST_ASSOCSERVICE%, ultra_Service_Inst, Miniport_EventLog_Inst

[ultra_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\ultra.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_ide



;**************************************
;TEKRAM Manufacture device list
[TEKRAM.NTamd64]

%PCI\VEN_1000&DEV_0020&SUBSYS_10201DE1.DeviceDesc% = sym_u3_Inst, PCI\VEN_1000&DEV_0020&SUBSYS_10201DE1
%PCI\VEN_1000&DEV_0021&SUBSYS_10201DE1.DeviceDesc% = sym_u3_Inst, PCI\VEN_1000&DEV_0021&SUBSYS_10201DE1
%PCI\VEN_1000&DEV_0020&SUBSYS_10101DE1.DeviceDesc% = sym_u3_Inst, PCI\VEN_1000&DEV_0020&SUBSYS_10101DE1
%PCI\VEN_1000&DEV_0021&SUBSYS_10101DE1.DeviceDesc% = sym_u3_Inst, PCI\VEN_1000&DEV_0021&SUBSYS_10101DE1

;**************************************
;LSI Manufacturer device list
[LSI.NTamd64]

%PCI\VEN_1000&DEV_000C.DeviceDesc% = symc8xx_Inst, PCI\VEN_1000&DEV_000C
%PCI\VEN_1000&DEV_000F.DeviceDesc% = symc8xx_Inst, PCI\VEN_1000&DEV_000F

%PCI\VEN_1000&DEV_000A.DeviceDesc% = sym_hi_Inst, PCI\VEN_1000&DEV_000A
%PCI\VEN_1000&DEV_000B.DeviceDesc% = sym_hi_Inst, PCI\VEN_1000&DEV_000B
%PCI\VEN_1000&DEV_0012.DeviceDesc% = sym_hi_Inst, PCI\VEN_1000&DEV_0012

%PCI\VEN_1000&DEV_0020.DeviceDesc% = sym_u3_Inst, PCI\VEN_1000&DEV_0020
%PCI\VEN_1000&DEV_0021.DeviceDesc% = sym_u3_Inst, PCI\VEN_1000&DEV_0021



















%PCI\VEN_1000&DEV_0030.DeviceDesc% = symmpis_Inst, PCI\VEN_1000&DEV_0030


















[symc8xx_Inst]
CopyFiles = @symc8xx.sys

[symc8xx_Inst.Services]
AddService = symc8xx, %SPSVCINST_ASSOCSERVICE%, symc8xx_Service_Inst, Miniport_EventLog_Inst

[symc8xx_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\symc8xx.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi

[sym_hi_Inst]
CopyFiles = @sym_hi.sys

[sym_hi_Inst.Services]
AddService = sym_hi, %SPSVCINST_ASSOCSERVICE%, sym_hi_Service_Inst, Miniport_EventLog_Inst

[sym_hi_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\sym_hi.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi

[sym_u3_Inst]
CopyFiles = @sym_u3.sys

[sym_u3_Inst.Services]
AddService = sym_u3, %SPSVCINST_ASSOCSERVICE%, sym_u3_Service_Inst, Miniport_EventLog_Inst

[sym_u3_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\sym_u3.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg
AddReg         = bus_type_scsi










[symmpis_Inst]
CopyFiles = @symmpi.sys
AddReg = symmpis_addreg

[symmpis_Inst.Services]
AddService = symmpi, %SPSVCINST_ASSOCSERVICE%, symmpi_Service_Inst, Miniport_EventLog_Inst

[symmpi_Service_Inst]
ServiceType    = %SERVICE_KERNEL_DRIVER%
StartType      = %SERVICE_BOOT_START%
ErrorControl   = %SERVICE_ERROR_NORMAL%
ServiceBinary  = %12%\symmpi.sys
LoadOrderGroup = SCSI Miniport
AddReg         = pnpsafe_pci_addreg

[symmpis_addreg]
HKLM, "SYSTEM\CurrentControlSet\Services\symmpi\Parameters", "BusType", 0x00010001, 0x00000001

[symmpif_addreg]
HKLM, "SYSTEM\CurrentControlSet\Services\symmpi\Parameters", "BusType", 0x00010001, 0x00000006

;*************************************************************
;The installation section for scsi like devices which shouldn't
;actually get installed with anything.  These have no service
;associated with them - usually they're some sort of support
;chip which was unfortunately exposed on a bridged or MF
;adapter

[NO_DEV]
AddReg = NO_DEV_REG

[NO_DEV_REG]
HKR,,InfInstallSection,0,"NO_DEV"

[NO_DEV.Services]
AddService = , %SPSVCINST_ASSOCSERVICE%     ; null service install


;*********************************
;Generic scsi adpater - compatible ID match on GEN_SCSIADAPTER
;as a method of making all non-pnp miniports have their adapters
;show up as scsi adapters in devmgr.  Scsiport adds this id to
;legacy detected adapters.

[GENERIC.NTamd64]
%genericHBA.DeviceDesc%  = NO_DRV,,GEN_SCSIADAPTER

[NO_DRV]
AddReg = NO_DRV_REG

[NO_DRV_REG]
HKR,,InfInstallSection,0,"NO_DRV"

;
; The empty service entry is to fool the class installer - without a service
; entry this install section would be rejected as being part of a win9x inf.
; With a service entry we might disable the device which we were trying to 
; expose.
;

[NO_DRV.Services]
NoDriver=1


[create_initiator_lu]
HKR,"Parameters\Device","CreateInitiatorLU",0x00010001,1

;*************************************************************
;These addreg sections should be used when installing services to indicate
;which interface types are safe for PNP and which aren't.  INTERFACE_TYPE
;is defined in NTDDK.H

[pnpsafe_pci_addreg]
HKR, "Parameters\PnpInterface", "5", 0x00010001, 0x00000001

[pnpsafe_isa_addreg]
HKR, "Parameters\PnpInterface", "1", 0x00010001, 0x00000001

[pnpsafe_eisa_addreg]
HKR, "Parameters\PnpInterface", "2", 0x00010001, 0x00000001

[pnpsafe_mca_addreg]
HKR, "Parameters\PnpInterface", "3", 0x00010001, 0x00000001

[pnpsafe_pcmcia_addreg]
; isa with no legacy detection
HKR, "Parameters\PnpInterface", "1", 0x00010001, 0x00000011

[pcmcia_interface_type]
HKR, "ScsiPort", "LegacyInterfaceType", 0x00010001, 0x00000008

[cardbus_interface_type]
HKR, "ScsiPort", "LegacyInterfaceType", 0x00010001, 0x00000005

;*************************************************************
;These addreg sections should be used for non-SCSI miniports
;to indicate what STORAGE_BUS_TYPE they actually do support.

[bus_type_scsi]
HKR, "Parameters", "BusType", 0x00010001, 0x00000001

[bus_type_ide]
HKR, "Parameters", "BusType", 0x00010001, 0x00000003

[bus_type_fibre]
HKR, "Parameters", "BusType", 0x00010001, 0x00000006

[bus_type_raid]
HKR, "Parameters", "BusType", 0x00010001, 0x00000008

;*************************************************************
;The EventLog entries are the same for all SCSI miniports.
[Miniport_EventLog_Inst]
AddReg = Miniport_EventLog_AddReg

[Miniport_EventLog_AddReg]
HKR,,EventMessageFile,%REG_EXPAND_SZ%,"%%SystemRoot%%\System32\IoLogMsg.dll"
HKR,,TypesSupported,%REG_DWORD%,7


































[Strings]












Msft = "Microsoft"
SCSIClassName="SCSI and RAID controllers"

GENERIC = "Unknown Manufacturer"
genericHBA.DeviceDesc = "SCSI/RAID Host Controller"

I2O = "Intelligent I/O Controller"
PCI\VEN_8086&DEV_9621&SUBSYS_00018086.DeviceDesc = "Intel I2O Controller"
PCI\VEN_8086&DEV_9622&SUBSYS_00018086.DeviceDesc = "Tekram I2O Controller"
PCI\VEN_8086&DEV_9641&SUBSYS_00018086.DeviceDesc = "Intel I2O Controller"
PCI\VEN_8086&DEV_96A1&SUBSYS_00018086.DeviceDesc = "Intel I2O Controller"
PCI\VEN_8086&DEV_3092&SUBSYS_00018086.DeviceDesc = "Intel I2O Controller"

ADP = "Adaptec"
PCI\VEN_9005&DEV_00CF.DeviceDesc =                 "Adaptec AIC-7899 Ultra160 PCI SCSI Card"
PCI\VEN_9005&DEV_008F.DeviceDesc =                 "Adaptec AIC-7892 Ultra160 PCI SCSI Card"
PCI\VEN_9005&DEV_00C0.DeviceDesc =                 "Adaptec SCSI Card 39160 - Ultra160 SCSI (Generic)"
PCI\VEN_9005&DEV_0080.DeviceDesc =                 "Adaptec SCSI Card 29160 - Ultra160 SCSI (Generic)"
PCI\VEN_9005&DEV_0081.DeviceDesc =                 "Adaptec SCSI Card 19160 - Ultra160 SCSI (Generic)"
PCI\VEN_9005&DEV_00C0&SUBSYS_F6209005.DeviceDesc = "Adaptec SCSI Card 39160 - Ultra160 SCSI"
PCI\VEN_9005&DEV_00C0&SUBSYS_F6200E11.DeviceDesc = "Compaq 64-bit/66MHz Dual Channel Wide Ultra3 SCSI Adapter"
PCI\VEN_9005&DEV_0080&SUBSYS_E2A09005.DeviceDesc = "Adaptec SCSI Card 29160 - Ultra160 SCSI"
PCI\VEN_9005&DEV_0080&SUBSYS_E2A00E11.DeviceDesc = "Compaq 64-bit/66MHz Wide Ultra3 SCSI Adapter"
PCI\VEN_9005&DEV_0080&SUBSYS_62A09005.DeviceDesc = "Adaptec SCSI Card 29160N - Ultra160 SCSI"
PCI\VEN_9005&DEV_0080&SUBSYS_E2209005.DeviceDesc = "Adaptec SCSI Card 29160LP - Ultra160 SCSI"
PCI\VEN_9005&DEV_0081&SUBSYS_62A19005.DeviceDesc = "Adaptec SCSI Card 19160 - Ultra160 SCSI"
PCI\VEN_9005&DEV_005F.DeviceDesc =                 "Adaptec AIC-7896/AIC-7897 - Ultra2 SCSI"
PCI\VEN_9005&DEV_001F.DeviceDesc =                 "Adaptec AIC-7890/AIC-7891 - Ultra2 SCSI"
PCI\VEN_9005&DEV_0010.DeviceDesc =                 "Adaptec AHA-2940U2/U2W - Ultra2 SCSI"
PCI\VEN_9005&DEV_0050.DeviceDesc =                 "Adaptec AHA-3950 - Ultra2 SCSI"
PCI\VEN_9005&DEV_0051.DeviceDesc =                 "Adaptec AHA-3950 - Ultra2 SCSI"
PCI\VEN_9005&DEV_0050&SUBSYS_F5009005.DeviceDesc = "Adaptec AHA-3950U2B - Ultra2 SCSI"
PCI\VEN_9005&DEV_0051&SUBSYS_B5009005.DeviceDesc = "Adaptec AHA-3950U2D - Ultra2 SCSI"
PCI\VEN_9005&DEV_0010&SUBSYS_A1009005.DeviceDesc = "Adaptec AHA-2940U2B - Ultra2 SCSI"
PCI\VEN_9005&DEV_0010&SUBSYS_21809005.DeviceDesc = "Adaptec AHA-2940U2 - Ultra2 SCSI"
PCI\VEN_9005&DEV_0010&SUBSYS_A1809005.DeviceDesc = "Adaptec AHA-2940U2W - Ultra2 SCSI"
PCI\VEN_9005&DEV_0010&SUBSYS_E1009005.DeviceDesc = "Adaptec AHA-2950U2B - Ultra2 SCSI"
PCI\VEN_9005&DEV_0011&SUBSYS_01819005.DeviceDesc = "Adaptec AHA-2930U2 - Ultra2 SCSI"
PCI\VEN_9004&DEV_7895&SUBSYS_78959004.DeviceDesc = "Adaptec AIC-7895 Dual Ultra SCSI "
PCI\VEN_9004&DEV_7895&SUBSYS_78919004.DeviceDesc = "Adaptec AHA-2940U/UW Dual Ultra SCSI Controller"
PCI\VEN_9004&DEV_7895&SUBSYS_78929004.DeviceDesc = "Adaptec AHA-3940AU/AUW/AUWD/UWD Dual SCSI Controller"
PCI\VEN_9004&DEV_7895&SUBSYS_78949004.DeviceDesc = "Adaptec AHA-3944AUWD Dual HVD UltraSCSI Controller"
PCI\VEN_9004&DEV_8078&SUBSYS_78809004.DeviceDesc = "Adaptec AIC-7880 PCI Ultra SCSI"
PCI\VEN_9004&DEV_8178&SUBSYS_78819004.DeviceDesc = "Adaptec AHA-2940UW PCI SCSI Controller"
PCI\VEN_9004&DEV_8778&SUBSYS_78879004.DeviceDesc = "Adaptec AHA-2940UW Pro PCI SCSI Controller"
PCI\VEN_9004&DEV_3860&SUBSYS_38699004.DeviceDesc = "Adaptec AHA-2930CU PCI SCSI Controller"
PCI\VEN_9005&DEV_0082&SUBSYS_02109005.DeviceDesc = "Adaptec 2915/2930LP PCI SCSI Controller"
PCI\VEN_9004&DEV_8078.DeviceDesc = "Adaptec AIC-7880 PCI Ultra SCSI"
PCI\VEN_9004&DEV_8178.DeviceDesc = "Adaptec AHA-2940U/2940UW/2940D PCI SCSI Controller"
PCI\VEN_9004&DEV_8278.DeviceDesc = "Adaptec AHA-3940U/3940UW/3940UWD PCI SCSI Controller"
PCI\VEN_9004&DEV_8478.DeviceDesc = "Adaptec AHA-2944UW PCI SCSI Controller"
PCI\VEN_9004&DEV_8578.DeviceDesc = "Adaptec AHA-3944UW PCI SCSI Controller"
PCI\VEN_9004&DEV_8678.DeviceDesc = "Adaptec AHA-4944UW PCI SCSI Controller"
PCI\VEN_9004&DEV_3B78.DeviceDesc = "Adaptec AHA-4944UW PCI SCSI Controller"
PCI\VEN_9004&DEV_EC78.DeviceDesc = "Adaptec AHA-4944UW PCI SCSI Controller"
PCI\VEN_9004&DEV_7078.DeviceDesc = "Adaptec AIC-7870 PCI SCSI Controller"
PCI\VEN_9004&DEV_7178.DeviceDesc = "Adaptec AHA-2940/2940W PCI SCSI Controller"
PCI\VEN_9004&DEV_7278.DeviceDesc = "Adaptec AHA-3940/3940W PCI SCSI Controller"
PCI\VEN_9004&DEV_7478.DeviceDesc = "Adaptec AHA-2944/2944W PCI SCSI Controller"
PCI\VEN_9004&DEV_7578.DeviceDesc = "Adaptec AHA-3944W PCI SCSI Controller"
PCI\VEN_9004&DEV_7678.DeviceDesc = "Adaptec AIC-7870 PCI SCSI Controller"
PCI\VEN_9004&DEV_7778.DeviceDesc = "Adaptec AIC-7870 PCI SCSI Controller"
PCI\VEN_9004&DEV_6075.DeviceDesc = "Adaptec APA-1480 CardBus SCSI Controller"
PCI\VEN_9004&DEV_6778.DeviceDesc = "Adaptec AIC-786X PCI SCSI Controller"
PCI\VEN_9004&DEV_6678.DeviceDesc = "Adaptec AIC-786X PCI SCSI Controller"
PCI\VEN_9004&DEV_6578.DeviceDesc = "Adaptec AIC-786X PCI SCSI Controller"
PCI\VEN_9004&DEV_6478.DeviceDesc = "Adaptec AIC-786X PCI SCSI Controller"
PCI\VEN_9004&DEV_6278.DeviceDesc = "Adaptec AIC-786X PCI SCSI Controller"
PCI\VEN_9004&DEV_6178.DeviceDesc = "Adaptec AHA-2940AU PCI SCSI Controller"
PCI\VEN_9004&DEV_6078.DeviceDesc = "Adaptec AIC-786X PCI SCSI Controller"
PCI\VEN_9004&DEV_7860.DeviceDesc = "Adaptec AIC-7860 PCI SCSI Controller"
PCI\VEN_9004&DEV_5078.DeviceDesc = "Adaptec AIC-7850 PCI SCSI Controller"
PCI\VEN_9004&DEV_5075.DeviceDesc = "Adaptec AIC-7550 PCI SCSI Controller"
PCI\VEN_1044&DEV_A501&SUBSYS_C0471044.DeviceDesc = "Adaptec 3000S Ultra160 SCSI RAID Controller"
PCI\VEN_1044&DEV_A501&SUBSYS_C03C1044.DeviceDesc = "Adaptec 2000S Ultra160 SCSI RAID Controller"
PCI\VEN_1044&DEV_A501&SUBSYS_C05A1044.DeviceDesc = "Adaptec 2400A UDMA Four Channel RAID Controller"
PCI\VEN_1044&DEV_A501&SUBSYS_C0661044.DeviceDesc = "Adaptec 2110S Ultra3"
PCI\VEN_1044&DEV_A501&SUBSYS_C0641044.DeviceDesc = "Adaptec 3210S Ultra3 Dual Channel"
PCI\VEN_1044&DEV_A501&SUBSYS_C0651044.DeviceDesc = "Adaptec 3410S Ultra3 Four Channel"
2010S.DeviceDesc = "Adaptec 2010S Ultra320"
2015S.DeviceDesc = "Adaptec 2015S Ultra320"
2000S.DeviceDesc = "Adaptec 2000S Ultra3"
2005S.DeviceDesc = "Adaptec 2005S Ultra3" 
PCI\VEN_9005&DEV_8010.DeviceDesc = "Adaptec 39320-based Ultra320 SCSI"
PCI\VEN_9005&DEV_8011.DeviceDesc = "Adaptec 39320-based Ultra320 SCSI"
PCI\VEN_9005&DEV_8012.DeviceDesc = "Adaptec 29320-based Ultra320 SCSI"
PCI\VEN_9005&DEV_801D.DeviceDesc = "Adaptec AIC-7902B - Ultra320 SCSI"
PCI\VEN_9005&DEV_801E.DeviceDesc = "Adaptec AIC-7901-based Ultra320 SCSI"
PCI\VEN_9005&DEV_801F.DeviceDesc = "Adaptec AIC-7902-based Ultra320 SCSI"
PCI\VEN_9005&DEV_800F.DeviceDesc = "Adaptec AIC-7901 - Ultra320 SCSI"
PCI\VEN_9005&DEV_800F&SUBSYS_005F9005.DeviceDesc = "Adaptec AIC-7901 - Ultra320 SCSI"
PCI\VEN_9005&DEV_8000&SUBSYS_00609005.DeviceDesc = "Adaptec SCSI Card 29320A - Ultra320 SCSI"
PCI\VEN_9005&DEV_8014&SUBSYS_00449005.DeviceDesc = "Adaptec SCSI Card 29320LP - Ultra320 SCSI"
PCI\VEN_9005&DEV_8015&SUBSYS_00409005.DeviceDesc = "Adaptec SCSI Card 39320 - Ultra320 SCSI"
PCI\VEN_9005&DEV_8016&SUBSYS_00409005.DeviceDesc = "Adaptec SCSI Card 39320A - Ultra320 SCSI"
PCI\VEN_9005&DEV_8017&SUBSYS_00449005.DeviceDesc = "Adaptec SCSI Card 29320ALP - Ultra320 SCSI"
adptVulcan.DeviceDesc     = "Adaptec SCSI RAID 2200S Controller"
adptCrusader.DeviceDesc   = "Adaptec SCSI RAID 2120S Controller"
adptSkyhawk.DeviceDesc    = "Adaptec SCSI RAID 2020S Controller"
adptSkyhawkSata.DeviceDesc = "Adaptec SATA RAID 2020SA Controller"
adptTerminator.DeviceDesc = "Adaptec SCSI RAID 2025S Controller"
adptTerminatorSata.DeviceDesc = "Adaptec SATA RAID 2025SA Controller"
adptJaguar.DeviceDesc     = "Adaptec SATA RAID 2410SA Controller"
adptCorsair8.DeviceDesc   = "Adaptec SATA RAID 2810SA Controller"
adptCorsair16.DeviceDesc  = "Adaptec SATA RAID 21610SA Controller"
adptLancer.DeviceDesc     = "Adaptec SCSI RAID 2230S Controller"

AGILENT = "Agilent"
PCI\VEN_103C&DEV_1028&SUBSYS_000715BC.DeviceDesc = "Agilent HHBA-510x PCI Fibre Channel Controller"

AMI = "American Megatrends Inc."
megaraid.DeviceDesc = "AMI MegaRAID RAID Controller RAID Controller"
mraid428.DeviceDesc = "AMI MegaRAID Enterprise 1200 RAID Controller"
mraid434.DeviceDesc = "AMI MegaRAID Enterprise 1300 RAID Controller"
mraid438.DeviceDesc = "AMI MegaRAID Enterprise 1400 RAID Controller"
mraid466.DeviceDesc = "AMI MegaRAID Express 200 RAID Controller"
mraid467.DeviceDesc = "AMI MegaRAID Enterprise 1500 RAID Controller"
mraid490.DeviceDesc = "AMI MegaRAID Express 300 RAID Controller"
mraid471.DeviceDesc = "AMI MegaRAID Enterprise 1600 RAID Controller"
mraid475.DeviceDesc = "AMI MegaRAID Express 500 RAID Controller"
mraid493.DeviceDesc = "AMI MegaRAID Elite 1600 RAID Controller"

mraid520a.DeviceDesc = "LSI Logic Megaraid SCSI 320-0"
mraid520.DeviceDesc = "LSI Logic Megaraid SCSI 320-1"
mraid518.DeviceDesc = "LSI Logic Megaraid SCSI 320-2"
mraid530.DeviceDesc = "LSI Logic Megaraid SCSI 320-0X"
mraid532.DeviceDesc = "LSI Logic Megaraid SCSI 320-2X"
mraid531.DeviceDesc = "LSI Logic Megaraid SCSI 320-4X"

mraid523-4.DeviceDesc = "LSI Logic Megaraid SATA 150-4"
mraid523-6.DeviceDesc = "LSI Logic Megaraid SATA 150-6"

DELL = "Dell"
Dell467.DeviceDesc  = "Dell PERC 2/DC RAID Controller"
Dell.DeviceDesc     = "Dell PERC 2/SC RAID Controller"
DellPerc2.DeviceDesc    = "Dell PERC 2 RAID Controller"
DellPerc2si.DeviceDesc  = "Dell PERC 2/Si RAID Controller"
DellPerc3di.DeviceDesc  = "Dell PERC 3/Di RAID Controller"
DellPerc3si.DeviceDesc  = "Dell PERC 3/Si RAID Controller"
DellPerc3gat.DeviceDesc = "Dell PERC 3 RAID (SCSI chip)"
Dell471.DeviceDesc  = "Dell PERC 3/QC RAID Controller" 
Dell475.DeviceDesc = "Dell PERC 3/SC RAID Controller Driver"
Dell493.DeviceDesc  = "Dell PERC 3/DC RAID Controller"
DellDiscovery.DeviceDesc = "Dell SCSI 320-2 PERC 4/Di"
Dell520.DeviceDesc = "Dell SCSI 320-1 PERC 4/SC"
Dell518.DeviceDesc = "Dell SCSI 320-2 PERC 4/DC"
Dell511.DeviceDesc  = "DELL CERC ATA 100/4ch RAID Controller" 
DellPerc4esi.DeviceDesc = "Dell PERC 4e/Si RAID Controller"
DellPerc4edi.DeviceDesc = "Dell PERC 4e/Di RAID Controller"
DellPerc4edc.DeviceDesc = "Dell PERC 4e/DC RAID Controller"

HP = "HP"
netraid3si.DeviceDesc = "HP NetRAID-3Si"
NetRaid.DeviceDesc    = "Integrated HP NetRAID"
netraid1si.DeviceDesc = "HP NetRAID-1Si"
hpn.DeviceDesc        = "Hewlett Packard NetRAID-4M RAID Controller"
netraid1M.DeviceDesc  = "HP NetRAID-1M RAID Controller"
netraid2M.DeviceDesc  = "HP NetRAID-2M RAID Controller"

COMPAQ = "Compaq"
cpqarray.DeviceDesc = "Compaq Drive Array"
cpqarry2.DeviceDesc = "Compaq Smart Array Controller"
cpqfcalm.DeviceDesc = "Compaq Fibre-Channel Host Controller"
*CPQFD17.DeviceDesc = "Compaq SCSI Tape Adapter"
PCI\VEN_1000&DEV_0012&SUBSYS_001b0e11.DeviceDesc = "Compaq Integrated Wide Ultra2 SCSI Adapter"
PCI\VEN_1000&DEV_000b&SUBSYS_60040e11.DeviceDesc = "Compaq 64-Bit Ultra2 SCSI Controller"
smart_5300.DeviceDesc    = "Smart Array 5300 Controller"
smart_5312.DeviceDesc    = "Smart Array 5312 Controller"
smart_532.DeviceDesc     = "Smart Array 532 Controller"
smart_integrated_5i.DeviceDesc = "Smart Array 5i"
smart_integrated_6i.DeviceDesc = "Smart Array 6i"
smart_641.DeviceDesc     = "Smart Array 641 Controller"
smart_642.DeviceDesc     = "Smart Array 642 Controller"
smart_6400.DeviceDesc    = "Smart Array 6400 Controller"
smart_6400_EM.DeviceDesc = "Smart Array 6400 U320 EM Controller"
smart_6422.DeviceDesc    = "Smart Array 6422 Controller"
smart_generic.DeviceDesc = "Smart Array Controller"
PCI\VEN_0E11&DEV_A0FC&SUBSYS_A0FC0E11.DeviceDesc = "Compaq StorageWorks 64-Bit/66-MHz Fibre Channel Host Bus Adapter"

TEKRAM = "Tekram"
PCI\VEN_1000&DEV_0020&SUBSYS_10201DE1.DeviceDesc = "DC-390U3W: PCI Ultra 160 SCSI Host Adapter"
PCI\VEN_1000&DEV_0021&SUBSYS_10201DE1.DeviceDesc = "DC-390U3W: PCI Ultra 160 SCSI Host Adapter"
PCI\VEN_1000&DEV_0020&SUBSYS_10101DE1.DeviceDesc = "DC-390U3D : PCI Dual Ultra 160 SCSI Host Adapter"
PCI\VEN_1000&DEV_0021&SUBSYS_10101DE1.DeviceDesc = "DC-390U3D : PCI Dual Ultra 160 SCSI Host Adapter"

DIAMOND = "Diamond"
fireport.DeviceDesc = "Diamond Multimedia Systems SCSI Host Adapter"

EMULEX = "Emulex"
lp6000.DeviceDesc  = "Emulex LP6000 Fibre Channel Host Adapter"
lp7000.DeviceDesc  = "Emulex LP7000 Fibre Channel Host Adapter"
lp8000.DeviceDesc  = "Emulex LP8000 Fibre Channel Host Adapter"
lp9000.DeviceDesc  = "Emulex LP9000 Fibre Channel Host Adapter"
lp9802.DeviceDesc  = "Emulex LP9802 Fibre Channel Host Adapter"
lp10000.DeviceDesc = "Emulex LP10000 Fibre Channel Host Adapter"
lp850.DeviceDesc   = "Emulex LP850 Fibre Channel Host Adapter"
lp950.DeviceDesc   = "Emulex LP950 Fibre Channel Host Adapter"
lp982.DeviceDesc   = "Emulex LP982 Fibre Channel Host Adapter"
lp1050.DeviceDesc  = "Emulex LP1050 Fibre Channel Host Adapter"
lp101.DeviceDesc   = "Emulex LP101 Fibre Channel Host Adapter"


MYLEX = "Mylex"
dac960P.DeviceDesc =  "Mylex DAC960P Disk Array Controller"
dac960PD.DeviceDesc = "Mylex DAC960PD Disk Array Controller"
dac960PX.DeviceDesc = "Mylex DAC960 Series Disk Array Controller"
dac1164P.DeviceDesc = "Mylex DAC1164P Disk Array Controller"
dac960BA55.DeviceDesc = "Mylex eXtremeRAID Support Device"
dac2w2kAcceleRAID160 = "Mylex AcceleRAID 160 Controller"
dac2w2kAcceleRAID170 = "Mylex AcceleRAID 170 Controller"
dac2w2kAcceleRAID352 = "Mylex AcceleRAID 352 Controller"
dac2w2keXtremeRAID2000 = "Mylex eXtremeRAID 2000 Controller"
dac2w2keXtremeRAID3000 = "Mylex eXtremeRAID 3000 Controller"


QLOGIC = "QLogic"
ql10wnt.DeviceDesc = "QLogic PCI SCSI Host Adapter"
ql1240.DeviceDesc =  "QLogic PCI SCSI Host Adapter"
ql2100.DeviceDesc =  "QLogic QLA2000/QLA2100 PCI Fibre Channel Adapter"
ql2200.DeviceDesc =  "QLogic QLA2200 PCI Fibre Channel Adapter"
ql2300.DeviceDesc =  "QLogic QLA23xx PCI Fibre Channel Adapter"
ql2340.DeviceDesc =  "QLogic QLA2340 PCI Fibre Channel Adapter; ISP2312 Device"
ql2342.DeviceDesc =  "QLogic QLA2342 PCI Fibre Channel Adapter; ISP2312 Device"
ql2344.DeviceDesc =  "QLogic QLA2344 PCI Fibre Channel Adapter; ISP2312 Device"
ql1080.DeviceDesc =  "QLogic PCI-QLA1080 64 bit PCI LVD SCSI HBA"
ql1280.DeviceDesc =  "QLogic PCI-QLA1280 64 bit PCI LVD SCSI HBA"
ql12160.DeviceDesc = "QLogic QLA12160 64 bit PCI DUAL 160M SCSI HBA"

IBM="IBM Corporation"
PCI\VEN_1014&DEV_002E&SUBSYS_022E1014.DeviceDesc = "IBM ServeRAID 4H Controller"
PCI\VEN_1014&DEV_002E&SUBSYS_002E1014.DeviceDesc = "IBM ServeRAID 3H/3L Controller"
PCI\VEN_1014&DEV_002E&SUBSYS_00000000&REV_04.DeviceDesc = "IBM ServeRAID II Controller"
PCI\VEN_1014&DEV_002E&SUBSYS_00000000&REV_03.DeviceDesc = "IBM ServeRAID integrated on PC 330 Server"
PCI\VEN_1014&DEV_002E&SUBSYS_00000000&REV_02.DeviceDesc = "IBM PC ServeRAID Controller"
SERVERAID4M.DeviceDesc = "IBM ServeRAID 4M Controller"
SERVERAID4L.DeviceDesc = "IBM ServeRAID 4L Controller"
SERVERAID4Mx.DeviceDesc = "IBM ServeRAID 4Mx Controller"
SERVERAID4Lx.DeviceDesc = "IBM ServeRAID 4Lx Controller"
SERVERAID5i.DeviceDesc = "IBM ServeRAID 5i Controller"
SERVERAID6i.DeviceDesc = "IBM ServeRAID 6i Controller"
SERVERAID6M.DeviceDesc = "IBM ServeRAID 6M Controller"
SERVERAID7k.DeviceDesc = "IBM ServeRAID 7k Controller"

CD20X.DeviceDesc="IBM Portable PCMCIA CD-ROM Drive"
PCMCIA\PCMCIA-IDE_CARD-3220.DeviceDesc="IBM Portable Drive Bay 2000 (PCMCIA)"
PCI\VEN_13E6&DEV_3603&SUBSYS_00461014.DeviceDesc="IBM Portable Drive Bay 2000 (CardBus)"
PCMCIA\PCMCIA-PnPIDE-4522.DeviceDesc="PCMCIA CD-ROM/DVD-ROM (Model F)"
PCMCIA\PCMCIA-PnPIDE-7B72.DeviceDesc="CardBus/F CD-ROM/DVD-ROM (PCMCIA)"
PCMCIA\PCMCIA-PnPIDE-7762.DeviceDesc="PCMCIA HARDDISK"
PCMCIA\PCMCIA-IDE_DOCK-EEEA.DeviceDesc="PCMCIA IDE DOCK"
PCI\VEN_13E6&DEV_3603&SUBSYS_004613E6.DeviceDesc="CardBus/F CD-ROM/DVD-ROM (CardBus)"
PCI\VEN_13E6&DEV_3603&SUBSYS_004913E6.DeviceDesc="CardBus/I CD-ROM/CD-RW (CardBus)"
PCI\VEN_13E6&DEV_3603&SUBSYS_00460900.DeviceDesc="CardBus IDE DOCK"
PCI\VEN_13E6&DEV_3603.DeviceDesc="CardBus IDE Card"


PROMISE="PROMISE"
PCI\VEN_105A&DEV_4D68&CC_0180.DeviceDesc="Promise Technology Inc. Ultra IDE Controller"
PCI\VEN_105A&DEV_4D30&CC_0180.DeviceDesc="Promise Technology Inc. Ultra IDE Controller"
PCI\VEN_105A&DEV_0D30&CC_0180.DeviceDesc="Promise Technology Inc. Ultra IDE Controller"
PCI\VEN_105A&DEV_4D38&CC_0180.DeviceDesc="Promise Technology Inc. Ultra IDE Controller"
PCI\VEN_105A&DEV_4D33.DeviceDesc="Promise Technology Inc. Ultra IDE Controller"
PCI\VEN_105A&DEV_4D69.DeviceDesc="Promise Technology Inc. Ultra IDE Controller"



HIGHPOINT="HIGHPOINT"
PCI\VEN_1103&DEV_0005.DeviceDesc = "HPT372A UDMA/ATA133 RAID Controller"
PCI\VEN_1103&DEV_0004&REV_03.DeviceDesc = "HPT370 UDMA/ATA100 RAID Controller"
PCI\VEN_1103&DEV_0004&REV_04.DeviceDesc = "HPT370A UDMA/ATA100 RAID Controller"
PCI\VEN_1103&DEV_0004&REV_05.DeviceDesc = "HPT372 UDMA/ATA133 RAID Controller"


LSI = "LSI Logic Inc."
PCI\VEN_1000&DEV_0001.DeviceDesc = "LSI Logic 53C810 Device"
PCI\VEN_1000&DEV_0002.DeviceDesc = "LSI Logic 820 PCI SCSI Host Adapter"
PCI\VEN_1000&DEV_0003.DeviceDesc = "LSI Logic 53C825/53C825A Device"
PCI\VEN_1000&DEV_0004.DeviceDesc = "LSI Logic 53C815 Device"
PCI\VEN_1000&DEV_0005.DeviceDesc = "LSI Logic 53C810A Device"
PCI\VEN_1000&DEV_0006.DeviceDesc = "LSI Logic 8600SP Adapter; 53C860 Device"
PCI\VEN_1000&DEV_000C.DeviceDesc = "LSI Logic 8951U/8952U Adapter; 53C895"
PCI\VEN_1000&DEV_000D.DeviceDesc = "LSI Logic 53C885 Device"
PCI\VEN_1000&DEV_000F.DeviceDesc = "LSI Logic 53C875/53C876 Device"
PCI\VEN_1000&DEV_000A.DeviceDesc = "LSI Logic 53C1510 Device"
PCI\VEN_1000&DEV_000B.DeviceDesc = "LSI Logic 53C896 Device"
PCI\VEN_1000&DEV_0012.DeviceDesc = "LSI Logic 8953U PCI SCSI Adapter; 53C895A Device"
PCI\VEN_1000&DEV_0020.DeviceDesc = "LSI Logic 53C1010-33 Device"
PCI\VEN_1000&DEV_0021.DeviceDesc = "LSI Logic 53C1010-66 Device"
PCI\VEN_1000&DEV_0030.DeviceDesc = "LSI Logic PCI-X Ultra320 SCSI Host Adapter"
LSIFC909.DeviceDesc = "LSI Logic 40909 PCI FC Adapter; LSIFC909 Device"
LSIFC929.DeviceDesc = "LSI Logic 44929 PCI FC Adapter; LSIFC929 Device"
LSIFC919.DeviceDesc = "LSI Logic 40919 PCI FC Adapter; LSIFC919 Device"
LSI7402XP-LC.DeviceDesc = "LSI Logic LSI7402XP-LC FC Quad channel PCI-X Adapter"
LSI7202XP-LC.DeviceDesc = "LSI Logic LSI7202XP-LC FC Dual channel PCI-X Adapter"
LSI7102XP-LC.DeviceDesc = "LSI Logic LSI7102XP-LC FC Single channel PCI-X Adapter"


INTEL="ICP Vortex"
*PCI\VEN_1119&DEV_0300.DeviceDesc = "ICP RAID Controller"
*PCI\VEN_8086&DEV_0600.DeviceDesc = "RAID Controller"


SPSVCINST_ASSOCSERVICE = 0x00000002
SERVICE_KERNEL_DRIVER  = 1
SERVICE_BOOT_START     = 0
SERVICE_ERROR_NORMAL   = 1
REG_EXPAND_SZ          = 0x00020000
REG_DWORD              = 0x00010001
