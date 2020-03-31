; Copyright (c) Microsoft Corporation.  All rights reserved.

[Version]
Signature   = "$Windows NT$"
Class       = Net
ClassGUID   = {4d36e972-e325-11ce-bfc1-08002be10318}
Provider    = %MSFT%
LayoutFile  = layout.inf
DriverVer=10/01/2002,1.8.9.0

[Manufacturer]
%S2IO% = S2IO, NTamd64

[ControlFlags]
ExcludeFromSelect = *

[S2IO.NTamd64]
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5600A
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5600B
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5640C
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5600D
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5640D
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5600E
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D5600F
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56010
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56011
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56012
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56013
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56014
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56015
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56016
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56017
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56410
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56411
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56412
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56413
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56414
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56415
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56416
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56417
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C10
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C11
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C12
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C13
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C14
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C15
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C16
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5731_SUBSYS_17D56C17
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5600A
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5600B
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5640C
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5600D
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5640D
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5600E
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D5600F
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56010
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56011
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56012
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56013
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56014
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56015
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56016
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56017
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56410
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56411
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56412
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56413
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56414
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56415
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56416
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56417
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C10
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C11
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C12
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C13
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C14
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C15
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C16
%XENA%  = XENAWIN.ndi,   PCI\VEN_17D5&DEV_5831_SUBSYS_17D56C17


;*******************************************************************************
[XENAWIN.ndi.NTAmd64]
Characteristics = 0x84 ; NCF_HAS_UI | NCF_PHYSICAL
AddReg          = Amd64AddReg, XENA.Params, ParamsNt
CopyFiles       = CopyFile.AmdSys64
BusType         = 5

[XENAWIN.ndi.NTAmd64.Services]
AddService      = XENAND, 2, XENAWIN.Amd64AddService, Amd64EventLog

[XENAWIN.Amd64AddService]
DisplayName     = %XENA%
ServiceType     = 1
StartType       = 3
ErrorControl    = 1
ServiceBinary   = %12%\xenamd64.sys
LoadOrderGroup  = NDIS


;*******************************************************************************
[Amd64AddReg]
HKR, Ndi,            Service,    0, "XENAND"
HKR, Ndi\Interfaces, UpperRange, 0, "ndis5"
HKR, Ndi\Interfaces, LowerRange, 0, "ethernet"

[Amd64EventLog]
AddReg = Amd64AddEventLogReg

[Amd64AddEventLogReg]
HKR, , EventMessageFile, 0x00020000, "%%SystemRoot%%\System32\netevent.dll;%%SystemRoot%%\System32\drivers\xenamd64.sys"
HKR, , TypesSupported  , 0x00010001, 7


;*******************************************************************************
[XENA.Params]
HKR, , MaxTxDs,                                         0, "128"

HKR, , tx_urange_a,                                     0, "5"
HKR, , tx_ufc_a,                                        0, "500"
HKR, , tx_urange_b,                                     0, "15"
HKR, , tx_ufc_b,                                        0, "500"
HKR, , tx_urange_c,                                     0, "35"
HKR, , tx_ufc_c,                                        0, "500"
HKR, , tx_ufc_d,                                        0, "500" 
HKR, , tx_utilz_periodic,                               0, "0"
HKR, , tx_timer_val,                                    0, "0" 
HKR, , tx_ac_disable,                                   0, "0"
HKR, , tx_intr_type_per_list,                           0, "0"
HKR, , tx_intr_type_per_utilz,                          0, "1"

HKR, , rx_urange_a,                                     0, "5"
HKR, , rx_ufc_a,                                        0, "1"
HKR, , rx_urange_b,                                     0, "15"
HKR, , rx_ufc_b,                                        0, "4"
HKR, , rx_urange_c,                                     0, "35" 
HKR, , rx_ufc_c,                                        0, "8"
HKR, , rx_ufc_d,                                        0, "16" 
HKR, , rx_utilz_periodic,                               0, "0"


; 1562 is 1 msec @ 100MHz PCIX speed
HKR, , rx_timer_val,                                    0, "1562" 
HKR, , rx_ac_disable,                                   0, "0"

HKR, , max_split_trans,                                 0, "0"

HKR, , stats_refresh_time,                              0, "4"

HKR, , sched_intr_timer_val,                            0, "2000"

HKR, , lso_size,                                        0, "32768"
HKR, , lso_opts_enable,                                 0, "0"

HKR, , indicate_max_pkts,                               0, "8"

HKR, , shared_splits,                                   0, "0"
HKR, , rd2rd_dly,                                       0, "0"
HKR, , enable_tx_req_timeout,                           0, "0"
HKR, , tx_req_timeout,                                  0, "0"

; VLAN support
HKR, , Ieee8021Q,                                       0, "0"

HKR, , pcc_enable,                                      0, "255" 

HKR, , tx_lrange_a,                                     0, "0"
HKR, , tx_lrange_b,                                     0, "5"
HKR, , tx_lrange_c,                                     0, "15"
HKR, , tx_lrange_d,                                     0, "35"
HKR, , tx_urange_d,                                     0, "100" 

HKR, , rx_lrange_a,                                     0, "0"
HKR, , rx_lrange_b,                                     0, "5"
HKR, , rx_lrange_c,                                     0, "15" 
HKR, , rx_lrange_d,                                     0, "35" 
HKR, , rx_urange_d,                                     0, "100"

HKR, , TxFIFONum,                                       0, "1"
HKR, , TxFIFOLen_0,                                     0, "8192"
HKR, , TxFIFOLen_1,                                     0, "0"
HKR, , TxFIFOLen_2,                                     0, "0"
HKR, , TxFIFOLen_3,                                     0, "0"
HKR, , TxFIFOLen_4,                                     0, "0"
HKR, , TxFIFOLen_5,                                     0, "0"
HKR, , TxFIFOLen_6,                                     0, "0"
HKR, , TxFIFOLen_7,                                     0, "0"

HKR, , RxRingNum,                                       0, "1"
HKR, , RxRingLen_0,                                     0, "6350"
HKR, , RxRingLen_1,                                     0, "0"
HKR, , RxRingLen_2,                                     0, "0"
HKR, , RxRingLen_3,                                     0, "0"
HKR, , RxRingLen_4,                                     0, "0"
HKR, , RxRingLen_5,                                     0, "0"
HKR, , RxRingLen_6,                                     0, "0"
HKR, , RxRingLen_7,                                     0, "0"

[ParamsNt]

; MTU
HKR, Ndi\params\MTU,                            ParamDesc,      0, %MTU% 
HKR, Ndi\params\MTU,                            default,        0, "1500"
HKR, Ndi\params\MTU,                            min,            0, "1500"
HKR, Ndi\params\MTU,                            max,            0, "9600"
HKR, Ndi\params\MTU,                            step,           0, "1"
HKR, Ndi\params\MTU,                            Base,           0, "10"
HKR, Ndi\params\MTU,                            type,           0, "int"

;TxFlow
HKR, Ndi\Params\TxFlow,                         ParamDesc,      , %TxFlow%
HKR, Ndi\Params\TxFlow,                         default,        , "0"
HKR, Ndi\Params\TxFlow,                         type,           , "enum"
HKR, Ndi\Params\TxFlow\enum,                    0,              , "Disable"
HKR, Ndi\Params\TxFlow\enum,                    1,              , "Enable"

;RxFlow
HKR, Ndi\Params\RxFlow,                         ParamDesc,      , %RxFlow%
HKR, Ndi\Params\RxFlow,                         default,        , "0"
HKR, Ndi\Params\RxFlow,                         type,           , "enum"
HKR, Ndi\Params\RxFlow\enum,                    0,              , "Disable"
HKR, Ndi\Params\RxFlow\enum,                    1,              , "Enable"

;jumbo_enable
;HKR, Ndi\Params\jumbo_enable,                  ParamDesc,      , %jumbo_enable%
;HKR, Ndi\Params\jumbo_enable,                  default,        , "0"
;HKR, Ndi\Params\jumbo_enable,                  type,           , "enum"
;HKR, Ndi\Params\jumbo_enable\enum,             0,              , "Disable"
;HKR, Ndi\Params\jumbo_enable\enum,             1,              , "Enable"
 
;cksum_offload_enable 
HKR, Ndi\Params\cksum_offload_enable,           ParamDesc,      , %cksum_offload_enable%
HKR, Ndi\Params\cksum_offload_enable,           default,        , "1"
HKR, Ndi\Params\cksum_offload_enable,           type,           , "enum"
HKR, Ndi\Params\cksum_offload_enable\enum,      0,              , "Disable"
HKR, Ndi\Params\cksum_offload_enable\enum,      1,              , "Enable"

;LSOOffload
HKR, Ndi\Params\lso_enable,                     ParamDesc,      , %lso_enable%
HKR, Ndi\Params\lso_enable,                     default,        , "1"
HKR, Ndi\Params\lso_enable,                     type,           , "enum"
HKR, Ndi\Params\lso_enable\enum,                0,              , "Disable"
HKR, Ndi\Params\lso_enable\enum,                1,              , "Enable"

;Ieee8021p - QoS
HKR, Ndi\Params\Ieee8021p,                      ParamDesc,      , %Ieee8021p%
HKR, Ndi\Params\Ieee8021p,                      default,        , "0"
HKR, Ndi\Params\Ieee8021p,                      type,           , "enum"
HKR, Ndi\Params\Ieee8021p\enum,                 0,              , "Disable"
HKR, Ndi\Params\Ieee8021p\enum,                 1,              , "Enable"

; Latency Timer
HKR, Ndi\Params\latency_timer,                  ParamDesc,      0, %latency_timer%
HKR, ndi\params\latency_timer,                  default,        0, "255"
HKR, Ndi\params\latency_timer,                  min,            0, "8"
HKR, Ndi\params\latency_timer,                  max,            0, "255"
HKR, Ndi\params\latency_timer,                  step,           0, "1"
HKR, Ndi\params\latency_timer,                  Base,           0, "10"
HKR, ndi\params\latency_timer,                  type,           0, "int"


; Max Memory Read Byte Count
HKR, Ndi\Params\max_read_byte_cnt,              ParamDesc,      0, %max_read_byte_cnt%
HKR, Ndi\params\max_read_byte_cnt,              default,        0, "1"
HKR, Ndi\params\max_read_byte_cnt,              min,            0, "0"
HKR, Ndi\params\max_read_byte_cnt,              max,            0, "3"
HKR, Ndi\params\max_read_byte_cnt,              step,           0, "1"
HKR, Ndi\params\max_read_byte_cnt,              Base,           0, "10"
HKR, ndi\params\max_read_byte_cnt,              type,           0, "int"

;*******************************************************************************
[DestinationDirs]
DefaultDestDir          = 12
CopyFile.AmdSys64       = 12

[CopyFile.AmdSys64]
xenamd64.sys,,,2


;*******************************************************************************
[Strings]
MSFT                    = "Microsoft Corporation"
S2IO                    = "S2io Inc."
XENA                    = "Xframe 10GbE PCI-X Server/Storage Adapter"

MTU                     = "Ethernet payload size"
TxFlow                  = "Tx Flow Control"
RxFlow                  = "Rx Flow Control"
jumbo_enable            = "Jumbo frame support"
Ieee8021p               = "IEEE 802.1p (QoS) support"
lso_enable              = "TCP Large send offload"
cksum_offload_enable    = "Checksum offload"

latency_timer           = "Latency Timer"
max_read_byte_cnt       = "Maximum Read Byte Count"
