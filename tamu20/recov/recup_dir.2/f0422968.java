; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature="$WINDOWS NT$"
Class=System
ClassGuid={4D36E97D-E325-11CE-BFC1-08002BE10318}
Provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect = *

[Manufacturer]
%AMI%=AMI,NTamd64
%ADAPTEC%=ADAPTEC,NTamd64
%ESGSHV%=ESGSHV,NTamd64
%MYLEX%=MYLEX,NTamd64
%DELL%=DELL,NTamd64
%IBM%=IBM,NTamd64
%CPQ%=CPQ,NTamd64
%MDI%=MDI,NTamd64
%SDR%=SDR,NTamd64
%TOSHIBA%=TOSHIBA,NTamd64
%HITACHI%=HITACHI,NTamd64
%HP%=HP,NTamd64
%FUJITSU%=FUJITSU,NTamd64
%INTEL%=INTEL,NTamd64
%ICP%=ICP,NTamd64
%HIGHPOINT%=HIGHPOINT,NTamd64
%NEC%=NEC,NTamd64
%SIEMENS_SYS%=SIEMENS_SYS,NTamd64
%QLOGIC%=QLOGIC,NTamd64

[QLOGIC.NTamd64]
%QLogicProcessor.DeviceDesc%                    = NODRV, SCSI\ProcessorQLogic__
%QLogicGEM318Processor.DeviceDesc%              = NODRV, SCSI\ProcessorSDR_____GEM318
%QLogicGEM359Processor.DeviceDesc%              = NODRV, SCSI\ProcessorQLogic__GEM359

[SIEMENS_SYS.NTamd64]
%ProcessorSDR_____GEM200.DeviceDesc%	        = NODRV, SCSI\ProcessorSDR_____GEM200
%ProcessorSDR_____.DeviceDesc%		        = NODRV, SCSI\ProcessorSDR_____
%ProcessorSNI_____.DeviceDesc% 		        = NODRV, SCSI\ProcessorSNI_____
%ProcessorSIEMENS_.DeviceDesc%		        = NODRV, SCSI\ProcessorSIEMENS_
%ProcessorSAG_____.DeviceDesc%		        = NODRV, SCSI\ProcessorSAG_____
%ProcessorFSC_____.DeviceDesc% 		        = NODRV, SCSI\ProcessorFSC_____
%ProcessorSIEMENS_AG.DeviceDesc%		= NODRV, SCSI\ProcessorSIEMENS_AG

[NEC.NTamd64]
%NECGEM312.DeviceDesc% = NODRV, SCSI\ProcessorNEC_____GEM312R2________
%NECGEM312.DeviceDesc% = NODRV, SCSI\ProcessorSDR_INC.GEM312_REV002___
%NECGEM359.DeviceDesc% = NODRV, SCSI\ProcessorNEC_____GEM359__________

[ADAPTEC.NTamd64]
%SCSI\ProcessorDELL____Management______.DeviceDesc% = NODRV, SCSI\ProcessorDELL____Management______
%SCSI\ProcessorHP______Management______.DeviceDesc% = NODRV, SCSI\ProcessorHP______Management______
%SCSI\ProcessorDpt_____Management______.DeviceDesc% = NODRV, SCSI\ProcessorDpt_____Management______
%SCSI\ProcessorDpt_____Management______.DeviceDesc% = NODRV, SCSI\ProcessorAdaptec_Management______

[ESGSHV.NTamd64]
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M1_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M2_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M3_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M4_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M5_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M6_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M7_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M8_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M12____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M13____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M14____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M15____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M16____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M17____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M18____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M19____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M20____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M21____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M22____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M23____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M24____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M25____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M26____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M27____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M28____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M29____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M30____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M31____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M32____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M33____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M34____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M35____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M36____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M37____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M38____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M39____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M40____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M41____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M42____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M43____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M44____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M45____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M46____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M47____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M48____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M49____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M50____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M10_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M11_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M12_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M13_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M14_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M15_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M16_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M17_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M18_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M19_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M20_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M21_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M22_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M23_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M24_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M25_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M26_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M27_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M28_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M29_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M30_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M31_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M32_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M33_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M34_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M35_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M36_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M37_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M38_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M39_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M40_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M41_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M42_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M43_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M44_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M45_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M46_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M47_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M48_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M49_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_M50_____
%ESGHSBP.DeviceDesc%                                = NODRV, SCSI\ProcessorESG-SHV_SCA_HSBP_1.0____

[INTEL.NTamd64]
%SCSI\ProcessorIntel___Admin_Device____.DeviceDesc% = NODRV, SCSI\ProcessorIntel___Admin_Device____
%SCSI\ProcessorTekram__Admin_Device____.DeviceDesc% = NODRV, SCSI\ProcessorTekram__Admin_Device____

[ICP.NTamd64]
%SCSI\ProcessorIOCTL_-_Device__________.DeviceDesc% = NODRV, SCSI\ProcessorIOCTL_-_Device__________
%SCSI\ProcessorIntel___CLUSTER_TGT2.00_.DeviceDesc% = NODRV, SCSI\ProcessorIntel___CLUSTER_TGT2.00_
%SCSI\ProcessorICP_____CLUSTER_TGT2.00_.DeviceDesc% = NODRV, SCSI\ProcessorICP_____CLUSTER_TGT2.00_

[HIGHPOINT.NTamd64]
%SCSI\ProcessorHPT_____RCM_DEVICE______.DeviceDesc% = NODRV, SCSI\ProcessorHPT_____RCM_DEVICE______

[MYLEX.NTamd64]
%SCSI\ProcessorMYLEX___GAM_DEVICE______.DeviceDesc% = NODRV, SCSI\ProcessorMYLEX___GAM_DEVICE______
%SCSI\ProcessorMYLEX___.DeviceDesc%                 = NODRV, SCSI\ProcessorMYLEX___
%SCSI\ArrayMYLEX___.DeviceDesc%                     = NODRV, SCSI\ArrayMYLEX___

[AMI.NTamd64]
%NULL.DeviceDesc%                                   = NODRV, SCSI\Other__RAID___DummyDevice____
%Component.DeviceDesc%                              = NODRV, PCI\VEN_1077&DEV_1216&SUBSYS_8471101E
%Component.DeviceDesc%                              = NODRV, PCI\VEN_1077&DEV_1216&SUBSYS_8493101E
%AMI907Processor.DeviceDesc%                        = NODRV, SCSI\ProcessorAMI_____Series_907______

[DELL.NTamd64]
%SCSI\ProcessorDELL____6UW_BACKPLANE___.DeviceDesc% = NODRV, SCSI\ProcessorDELL____6UW_BACKPLANE___
%SCSI\ProcessorDELL____1x2_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x2_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x3_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x3_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x4_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x4_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x5_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x5_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x6_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x6_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x7_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x7_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x8_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x8_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x9_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x9_U2W_SCSI_BP_
%SCSI\ProcessorDELL____1x10_U2W_SCSI_BP.DeviceDesc% = NODRV, SCSI\ProcessorDELL____1x10_U2W_SCSI_BP
%SCSI\ProcessorDELL____2x1_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____2x1_U2W_SCSI_BP_
%SCSI\ProcessorDELL____2x2_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____2x2_U2W_SCSI_BP_
%SCSI\ProcessorDELL____2x3_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____2x3_U2W_SCSI_BP_
%SCSI\ProcessorDELL____2x4_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____2x4_U2W_SCSI_BP_
%SCSI\ProcessorDELL____2x5_U2W_SCSI_BP_.DeviceDesc% = NODRV, SCSI\ProcessorDELL____2x5_U2W_SCSI_BP_
%SCSI\ProcessorDELL____8_BAY_U2W_CU____.DeviceDesc% = NODRV, SCSI\ProcessorDELL____8_BAY_U2W_CU____
%SCSI\ProcessorDELL____12_BAY_U2W_CU___.DeviceDesc% = NODRV, SCSI\ProcessorDELL____12_BAY_U2W_CU___
%SCSI\ProcessorDELL____PV22XS__________.DeviceDesc% = NODRV, SCSI\ProcessorDELL____PV22XS__________
%SCSI\ProcessorPE/PV___1x2_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x2_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x3_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x3_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x4_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x4_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x5_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x5_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x6_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x6_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x7_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x7_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x8_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x8_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x9_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x9_SCSI_BP_____
%SCSI\ProcessorPE/PV___1x10_SCSI_BP____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___1x10_SCSI_BP____
%SCSI\ProcessorPE/PV___2x1_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___2x1_SCSI_BP_____
%SCSI\ProcessorPE/PV___2x2_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___2x2_SCSI_BP_____
%SCSI\ProcessorPE/PV___2x3_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___2x3_SCSI_BP_____
%SCSI\ProcessorPE/PV___2x4_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___2x4_SCSI_BP_____
%SCSI\ProcessorPE/PV___2x5_SCSI_BP_____.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___2x5_SCSI_BP_____
%SCSI\ProcessorPE/PV___8_BAY_CU________.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___8_BAY_CU________
%SCSI\ProcessorPE/PV___12_BAY_CU_______.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___12_BAY_CU_______
%SCSI\ProcessorPE/PV___PV22XS__________.DeviceDesc% = NODRV, SCSI\ProcessorPE/PV___PV22XS__________
%DELLProcessor%                                     = NODRV, SCSI\ProcessorDELL____PERC_2/DC_______
%DELLSCProcessor%                                   = NODRV, SCSI\ProcessorDELL____PERC_2/SC_______
%DELLDCProcessor%                                   = NODRV, SCSI\ProcessorDELL____PERC_3/DC_______
%DELLQCProcessor%                                   = NODRV, SCSI\ProcessorDELL____PERC_3/QC_______

[IBM.NTamd64]
%Processor.DeviceDesc%                              = NODRV, SCSI\ProcessorIBM_____
%Dummy.DeviceDesc%                                  = NODRV, SCSI\BridgeIBM_____DUMMY_DEVICE____
%Dummy.DeviceDesc%                                  = NODRV, SCSI\OtherIBM_____DUMMY_DEVICE____
%CORPGEM.DeviceDesc%                                = NODRV, SCSI\ProcessorIBM_CORPGEM312_V002_____
%IBMEXP500.DeviceDesc%                              = NODRV, SCSI\EnclosureIBM_____EXP500__________

[CPQ.NTamd64]
%SCSI\ArrayCOMPAQ__ARRAY_CONTROLLER.DeviceDesc%       = NODRV, SCSI\ArrayCOMPAQ__ARRAY_CONTROLLER
%SCSI\OtherCOMPAQ__SCSI_COMMUNICATE.DeviceDesc%       = NODRV, SCSI\OtherCOMPAQ__SCSI_COMMUNICATE
%SCSI\ProcessorCompaq__CD_Storage_Sys.DeviceDesc%     = NODRV, SCSI\ProcessorCompaq__CD_Storage_Sys._
%SCSI\ProcessorCOMPAQ__.DeviceDesc%                   = NODRV, SCSI\ProcessorCOMPAQ__
%SCSI\ArrayCOMPAQ__MSA1000_________.DeviceDesc%       = NODRV, SCSI\ArrayCOMPAQ__MSA1000_________

[MDI.NTamd64]
%SCSI\ProcessorMDI_____SE-EXTENDER.DeviceDesc%      = NODRV, SCSI\ProcessorMDI_____SE-EXTENDER_____

[SDR.NTamd64]
%GEM200.DeviceDesc%                                 = NODRV, SCSI\ProcessorSDR_____GEM200__________

[TOSHIBA.NTamd64]
%MAGNIA7010.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_DMC2.1___________A00
%MAGNIA5100.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_DMC2.1___________Q01
%MAGNIA5000.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_DMC2.0___________B01
%MAGNIA7000.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_DMC2.0___________C00
%MAGNIADMC21.DeviceDesc%                            = NODRV, SCSI\ProcessorTOSHIBA_DMC2.1__________
%MAGNIADMC20.DeviceDesc%                            = NODRV, SCSI\ProcessorTOSHIBA_DMC2.0__________

%MAGNIA3000.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_SMC2.0__________
%MAGNIA3010.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_SMC2.1__________

%MAGNIADMC.DeviceDesc%                              = NODRV, SCSI\ProcessorTOSHIBA_DMC_________________
%TOSHIBASMC.DeviceDesc%                             = NODRV, SCSI\ProcessorTOSHIBA_SMC_________________

[HITACHI.NTamd64]
%SMP0001.DeviceDesc%                                = NODRV, SCSI\ProcessorHITACHI_SMP_00001_______

[HP.NTamd64]
%HPD4902.DeviceDesc%                                = NODRV, SCSI\ProcessorHP______D4902A__________
%HPSAFETE.DeviceDesc%                               = NODRV, "SCSI\ProcessorHP______SAFTE;_U160/M_BP"
%HPSAFETE.DeviceDesc%                               = NODRV, "SCSI\ProcessorHP______SAF-TE;_U160_BP_"
%HPSAFTE.DeviceDesc%	                            = NODRV, SCSI\ProcessorSDR_____

[FUJITSU.NTamd64]
%FujitsuSafeTE.DeviceDesc%                          = NODRV, SCSI\ProcessorFUJITSU_SAF-TE_PROCESSOR


[NODRV]

[NODRV.Services]
;
; this is blank to just allow the install to succeed
;
AddService = , %SPSVCINST_ASSOCSERVICE%   ; null service install
































[strings]












QLOGIC                                              = "QLOGIC"
QLogicProcessor.DeviceDesc                          = "Qlogic processor device"
QLogicGEM318Processor.DeviceDesc                    = "Qlogic processor device GEM318"
QLogicGEM359Processor.DeviceDesc                    = "Qlogic processor device GEM359"

FUJITSU                                             = "FUJITSU"
FujitsuSafeTE.DeviceDesc                            = "Fujitsu SAF-TE Processor Device"

SIEMENS_SYS                                         = "Fujitsu Siemens Computers"
ProcessorSDR_____GEM200.DeviceDesc                  = "FSC SCSI Termination Module GEM200"
ProcessorSDR_____.DeviceDesc	                    = "FSC SCSI Termination Module"
ProcessorSNI_____.DeviceDesc	                    = "FSC SCSI Termination Module"
ProcessorSIEMENS_.DeviceDesc	                    = "FSC SCSI Termination Module"
ProcessorSAG_____.DeviceDesc 	                    = "FSC SCSI Termination Module"
ProcessorFSC_____.DeviceDesc	                    = "FSC SCSI Termination Module"
ProcessorSIEMENS_AG.DeviceDesc	                    = "FSC SCSI Termination Module"

NEC                                                 = "NEC"
NECGEM312.DeviceDesc                                = "NEC GEM SCSI Processor Device"
NECGEM359.DeviceDesc                                = "NEC GEM SCSI Processor Device"

ADAPTEC                                             = "Adaptec"
SCSI\ProcessorDELL____Management______.DeviceDesc   = "Dell PERC 2 Management Device"
SCSI\ProcessorHP______Management______.DeviceDesc   = "HP NetRAID4-M Management Device"
SCSI\ProcessorDpt_____Management______.DeviceDesc   = "DPT I2O Management Device"

ESGSHV                                              = "ESG-SHV"
ESGHSBP.DeviceDesc                                  = "SCA Hotswap Backplane"

HIGHPOINT                                           = "Highpoint"
SCSI\ProcessorHPT_____RCM_DEVICE______.DeviceDesc   = "Highpoint RCM Device"

MYLEX                                               = "Mylex"
SCSI\ProcessorMYLEX___GAM_DEVICE______.DeviceDesc   = "Mylex GAM Device"
SCSI\ProcessorMYLEX___.DeviceDesc                   = "Mylex Processor Device"
SCSI\ArrayMYLEX___.DeviceDesc                       = "Mylex Array Device"

AMI                                                 = "American Megatrends, Inc."
NULL.DeviceDesc                                     = "RAID Virtual Device"
Component.DeviceDesc                                = "RAID Controller Component Device"
AMI907Processor.DeviceDesc                          = "AMI Series 907 Processor Device"

DELL                                                = "Dell"
SCSI\ProcessorDELL____6UW_BACKPLANE___.DeviceDesc   = "DELL 6 UW Backplane"
SCSI\ProcessorDELL____1x2_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x2 Backplane"
SCSI\ProcessorDELL____1x3_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x3 Backplane"
SCSI\ProcessorDELL____1x4_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x4 Backplane"
SCSI\ProcessorDELL____1x5_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x5 Backplane"
SCSI\ProcessorDELL____1x6_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x6 Backplane"
SCSI\ProcessorDELL____1x7_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x7 Backplane"
SCSI\ProcessorDELL____1x8_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x8 Backplane"
SCSI\ProcessorDELL____1x9_U2W_SCSI_BP_.DeviceDesc   = "DELL 1x9 Backplane"
SCSI\ProcessorDELL____1x10_U2W_SCSI_BP.DeviceDesc   = "DELL 1x10 Backplane"
SCSI\ProcessorDELL____2x1_U2W_SCSI_BP_.DeviceDesc   = "DELL 2x1 Backplane"
SCSI\ProcessorDELL____2x2_U2W_SCSI_BP_.DeviceDesc   = "DELL 2x2 Backplane"
SCSI\ProcessorDELL____2x3_U2W_SCSI_BP_.DeviceDesc   = "DELL 2x3 Backplane"
SCSI\ProcessorDELL____2x4_U2W_SCSI_BP_.DeviceDesc   = "DELL 2x4 Backplane"
SCSI\ProcessorDELL____2x5_U2W_SCSI_BP_.DeviceDesc   = "DELL 2x5 Backplane"
SCSI\ProcessorDELL____8_BAY_U2W_CU____.DeviceDesc   = "DELL PV20xS Backplane"
SCSI\ProcessorDELL____12_BAY_U2W_CU___.DeviceDesc   = "DELL PV21xS Backplane"
SCSI\ProcessorDELL____PV22XS__________.DeviceDesc   = "DELL PV22XS Backplane"
SCSI\ProcessorPE/PV___1x2_SCSI_BP_____.DeviceDesc   = "PE 1x2 Backplane"
SCSI\ProcessorPE/PV___1x3_SCSI_BP_____.DeviceDesc   = "PE 1x3 Backplane"
SCSI\ProcessorPE/PV___1x4_SCSI_BP_____.DeviceDesc   = "PE 1x4 Backplane"
SCSI\ProcessorPE/PV___1x5_SCSI_BP_____.DeviceDesc   = "PE 1x5 Backplane"
SCSI\ProcessorPE/PV___1x6_SCSI_BP_____.DeviceDesc   = "PE 1x6 Backplane"
SCSI\ProcessorPE/PV___1x7_SCSI_BP_____.DeviceDesc   = "PE 1x7 Backplane"
SCSI\ProcessorPE/PV___1x8_SCSI_BP_____.DeviceDesc   = "PE 1x8 Backplane"
SCSI\ProcessorPE/PV___1x9_SCSI_BP_____.DeviceDesc   = "PE 1x9 Backplane"
SCSI\ProcessorPE/PV___1x10_SCSI_BP____.DeviceDesc   = "PE 1x10 Backplane"
SCSI\ProcessorPE/PV___2x1_SCSI_BP_____.DeviceDesc   = "PE 2x1 Backplane"
SCSI\ProcessorPE/PV___2x2_SCSI_BP_____.DeviceDesc   = "PE 2x2 Backplane"
SCSI\ProcessorPE/PV___2x3_SCSI_BP_____.DeviceDesc   = "PE 2x3 Backplane"
SCSI\ProcessorPE/PV___2x4_SCSI_BP_____.DeviceDesc   = "PE 2x4 Backplane"
SCSI\ProcessorPE/PV___2x5_SCSI_BP_____.DeviceDesc   = "PE 2x5 Backplane"
SCSI\ProcessorPE/PV___8_BAY_CU________.DeviceDesc   = "PV 8 Backplane"
SCSI\ProcessorPE/PV___12_BAY_CU_______.DeviceDesc   = "PV 12 Backplane"
SCSI\ProcessorPE/PV___PV22XS__________.DeviceDesc   = "PV 14 Backplane"
DellProcessor                                       = "DELL PERC 2/DC SCSI Processor Device"
DellSCProcessor                                     = "DELL PERC 2/SC SCSI Processor Device"
DellDCProcessor                                     = "DELL PERC 3/DC SCSI Processor Device"
DellQCProcessor                                     = "DELL PERC 3/QC SCSI Processor Device"

INTEL                                               = "Intel"
SCSI\ProcessorIntel___Admin_Device____.DeviceDesc   = "I2O Management Device"
SCSI\ProcessorTekram__Admin_Device____.DeviceDesc   = "I2O Management Device"

ICP                                                 = "ICP Vortex" 
SCSI\ProcessorIOCTL_-_Device__________.DeviceDesc   = "Intel Controller Management Device"
SCSI\ProcessorIntel___CLUSTER_TGT2.00_.DeviceDesc   = "Intel Cluster Controller Management Device"
SCSI\ProcessorICP_____CLUSTER_TGT2.00_.DeviceDesc   = "Cluster Controller Management Device 2"

IBM                                                 = "IBM"
Dummy.DeviceDesc                                    = "IBM Dummy Device"
CORPGEM.DeviceDesc                                  = "GEM 312 SCSI Device"
IBMEXP500.DeviceDesc                                = "IBM EXP500 SCSI Enclosure Device"

CPQ                                                 = "Compaq"
SCSI\ArrayCOMPAQ__ARRAY_CONTROLLER.DeviceDesc       = "Compaq Fibre Channel Drive Array"
SCSI\OtherCOMPAQ__SCSI_COMMUNICATE.DeviceDesc       = "HP Virtual LUN"
SCSI\ProcessorCompaq__CD_Storage_Sys.DeviceDesc     = "Compaq CD Storage System SCSI Bus Extender"
SCSI\ProcessorCOMPAQ__.DeviceDesc                   = "HP StorageWorks/ProLiant Storage Subsystem"
SCSI\ArrayCOMPAQ__MSA1000_________.DeviceDesc       = "HP MSA1000"

MDI                                                 = "MDI"
SCSI\ProcessorMDI_____SE-EXTENDER.DeviceDesc        = "MDI SCSI Bus Extender"

SDR                                                 = "SDR"
GEM200.DeviceDesc                                   = "GEM 200 SCSI Device"

TOSHIBA                                             = "Toshiba"
MAGNIA7010.DeviceDesc                               = "DMC 7010 Processor Device"
MAGNIA5100.DeviceDesc                               = "DMC 5100 Processor Device"
MAGNIA5000.DeviceDesc                               = "DMC 5000 Processor Device"
MAGNIA7000.DeviceDesc                               = "DMC 7000 Processor Device"
MAGNIADMC21.DeviceDesc                              = "DMC 2.1 Processor Device"
MAGNIADMC20.DeviceDesc                              = "DMC 2.0 Processor Device"
MAGNIA3000.DeviceDesc                               = "SMC 3000 Processor Device"
MAGNIA3010.DeviceDesc                               = "SMC 3010 Processor Device"
MAGNIADMC.DeviceDesc                                = "DMC Processor Device"
TOSHIBASMC.DeviceDesc                               = "SMC SCSI Processor Device"

HITACHI                                             = "Hitachi"
SMP0001.DeviceDesc                                  = "SMP Processor Device"

HP                                                  = "HP"
HPD4902.DeviceDesc                                  = "HP D4902 SCSI Processor Device"
HPSAFETE.DeviceDesc                                 = "HP SAFETE SCSI Processor Device"
HPSAFTE.DeviceDesc	                            = "HP SAF-TE SCSI Processor Device"

MSFT                                                = "Microsoft"
Processor.DeviceDesc                                = "SCSI Processor Device"

;*******************************************
;Handy macro substitutions (non-localizable)
SPSVCINST_ASSOCSERVICE = 0x00000002

