18}
    provider=%Msft%
    LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
    %Msft% = Msft, NTamd64

[Msft.NTamd64]
    %NETMON.DisplayName% = NETMON.PrimaryInstall, MS_NetMon

;****************************************************************************
; Network Monitor
;****************************************************************************

[NETMON.PrimaryInstall]
    Characteristics = 0x0
    AddReg          = Registry.NETMON.PrimaryInstall
    RegisterDlls    = NETMON.Register
; This should be invoked during installation to remove nmperf
    DelReg          = Registry.NETMON.DelNMPerf

[Registry.NETMON.PrimaryInstall]
    HKR,Ndi,HelpText,,"@netcfgx.dll,-50020"
    HKR,Ndi,Service,,"NM"

; Interfaces
    HKR,Ndi\Interfaces,UpperRange,,"noupper"
    HKR,Ndi\Interfaces,LowerRange,,"ndis5,ndiswanbh,ndisatm,ndis1394"
    HKR, Ndi, CoServices, 0x10000, "NM"

; Registry Entries
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000},,REG_MULTI_SZ,"NPPAgent"
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000},"AppID",REG_MULTI_SZ,"{D413C502-3FAA-11D0-B254-444553540000}"

    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000}\"LocalServer32",,REG_MULTI_SZ,"%11%\NPP\NPPAgent.exe"
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000}\"LocalServer32","ThreadingModel",REG_MULTI_SZ,"Apartment"
    HKLM,SOFTWARE\Classes\AppID\{D413C502-3FAA-11D0-B254-444553540000}

    HKLM,SOFTWARE\Classes\CLSID\{944AD531-B09D-11CE-B59C-00AA006CB37D},,REG_SZ,"PSFactoryBuffer"
    HKLM,SOFTWARE\Classes\CLSID\{944AD531-B09D-11CE-B59C-00AA006CB37D}\"InProcServer32",,REG_SZ,"%11%\PsNPPAgn.dll"
    HKLM,SOFTWARE\Classes\CLSID\{944AD531-B09D-11CE-B59C-00AA006CB37D}\"InProcServer32","ThreadingModel",REG_SZ,"Both"

;Interfaces
    HKCR,Interface\{944AD531-B09D-11CE-B59C-00AA006CB37D},,REG_SZ,"IRemoteStats"
    HKCR,Interface\{944AD531-B09D-11CE-B59C-00AA006CB37D}\"ProxyStubClsid32",,REG_SZ,"{944AD531-B09D-11CE-B59C-00AA006CB37D}"
    HKCR,Interface\{944AD531-B09D-11CE-B59C-00AA006CB37D}\"NumMethods",,REG_SZ,"16"

    HKCR,Interface\{944AD532-B09D-11CE-B59C-00AA006CB37D},,REG_SZ,"IRemoteFinder"
    HKCR,Interface\{944AD532-B09D-11CE-B59C-00AA006CB37D}\"ProxyStubClsid32",,REG_SZ,"{944AD531-B09D-11CE-B59C-00AA006CB37D}"
    HKCR,Interface\{944AD532-B09D-11CE-B59C-00AA006CB37D}\"NumMethods",,REG_SZ,"4"

    HKCR,Interface\{8947C648-3833-11D1-8682-00C04FBFE171},,REG_SZ,"IRemoteCallBack"
    HKCR,Interface\{8947C648-3833-11D1-8682-00C04FBFE171}\"ProxyStubClsid32",,REG_SZ,"{944AD531-B09D-11CE-B59C-00AA006CB37D}"
    HKCR,Interface\{8947C648-3833-11D1-8682-00C04FBFE171}\"NumMethods",,REG_SZ,"4"

    HKCR,Interface\{394540A0-6FCF-11D0-ACE0-0000F80114D3},,REG_SZ,"IRemoteDelaydC"
    HKCR,Interface\{394540A0-6FCF-11D0-ACE0-0000F80114D3}\"ProxyStubClsid32",,REG_SZ,"{944AD531-B09D-11CE-B59C-00AA006CB37D}"
    HKCR,Interface\{394540A0-6FCF-11D0-ACE0-0000F80114D3}\"NumMethods",,REG_SZ,"16"

    HKCR,Interface\{E99A04AB-AB95-11D0-BE96-00A0C94989DE},,REG_SZ,"IRemoteESP"
    HKCR,Interface\{E99A04AB-AB95-11D0-BE96-00A0C94989DE}\"ProxyStubClsid32",,REG_SZ,"{944AD531-B09D-11CE-B59C-00AA006CB37D}"
    HKCR,Interface\{E99A04AB-AB95-11D0-BE96-00A0C94989DE}\"NumMethods",,REG_SZ,"13"


    HKLM,SYSTEM\CurrentControlSet\Services\nm\Parameters

; For Safeboot to work - Safeboot test is broken, so we have the nm.sys thing
    HKLM,SYSTEM\CurrentControlSet\Control\Safeboot\Network\nm,,REG_SZ,"Service"
    HKLM,SYSTEM\CurrentControlSet\Control\Safeboot\Network\nm.sys,,REG_SZ,"Driver"

; this register the ndisnpp.dll
[NETMON.Register]
11,npp, ndisnpp.dll, 1

; This should remove nmperf when upgrading
[Registry.NETMON.DelNMPerf]
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Close",,"NmClosePerformanceData"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Collect",,"NmCollectPerformanceData"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Library",,"nmperf.dll"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Open",,"NmOpenPerformanceData"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance

;****************************************************************************
; Netmon Interface and Protocol Install
;****************************************************************************

[DestinationDirs]
    NETMON.Files.sys = 11
    NETMON.Files.drv = 12
    NETMON.Files.NPP = 11,NPP            ;System32\NPP

[NETMON.PrimaryInstall.Services]
    AddService      = NM, 0x10, PrimaryInstall.AddService.NM

; Install NM service

[PrimaryInstall.AddService.NM]
    DisplayName     = %NM.ServiceDescription%
    ServiceType     = 1  ;SERVICE_KERNEL_DRIVER
    StartType       = 3  ;SERVICE_DEMAND_START
    ErrorControl    = 1  ;SERVICE_ERROR_NORMAL
    ServiceBinary   = %12%\NMnt.sys

;****************************************************************************
; Netmon Interface and Service Remove
;****************************************************************************
	
[NETMON.PrimaryInstall.Remove]
    DelReg          = Registry.NETMON.Delete

[NETMON.PrimaryInstall.Remove.Services]
    DelService  = NM

[Registry.NETMON.Delete]
    HKCR,AppID\{D413C502-3FAA-11D0-B254-444553540000},LaunchPermission
    HKCR,AppID\{D413C502-3FAA-11D0-B254-444553540000},RunAs
    HKLM,SOFTWARE\Classes\CLSID\{425882B0-B0BF-11CE-B59F-00AA006CB37D},InProcServer32
    HKLM,SOFTWARE\Classes\CLSID\{425882B0-B0BF-11CE-B59F-00AA006CB37D},
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000},AppID
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000},LocalServer32
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000},ThreadingModel
    HKLM,SOFTWARE\Classes\CLSID\{D413C502-3FAA-11D0-B254-444553540000},
    HKLM,SOFTWARE\Classes\CLSID\{944AD531-B09D-11CE-B59C-00AA006CB37D},InProcServer32
    HKLM,SOFTWARE\Classes\CLSID\{944AD531-B09D-11CE-B59C-00AA006CB37D},ThreadingModel
    HKLM,SOFTWARE\Classes\CLSID\{944AD531-B09D-11CE-B59C-00AA006CB37D},
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Close","NmClosePerformanceData"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Collect","NmCollectPerformanceData"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Library","nmperf.dll"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance,"Open","NmOpenPerformanceData"
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Performance
    HKLM,SYSTEM\CurrentControlSet\Services\nm\Parameters
    HKLM,SOFTWARE\Classes\CLSID\{425882B0-B0BF-11CE-B59F-00AA006CB37D}


; Netmon files to be installed or removed

[NETMON.Files.sys]
    PsNPPAgn.dll,,,2
    NPPTools.dll,,,2

; Remove mention of nmperf files
;    nmperf.dll,,,2
;    nmctrs.h,,,2
;    nmctrs.ini,,,2

[NETMON.Files.drv]
    nmnt.sys,,,2

[NETMON.Files.NPP]
    ndisnpp.dll,,,2
    NPPAgent.exe,,,2

;****************************************************************************

;****************************************************************************

[Strings]

;global strings
Msft  = "Microsoft"

;Netmon strings
NM.ServiceDescription   = "Network Monitor Driver"
NETMON.DisplayName = "Network Monitor Driver"

;****************************************************************************
; ServiceType values
;****************************************************************************

SERVICE_KERNEL_DRIVER       = 0x00000001
SERVICE_FILE_SYSTEM_DRIVER  = 0x00000002
SERVICE_ADAPTER             = 0x00000004
SERVICE_RECOGNIZER_DRIVER   = 0x00000008
SERVICE_WIN32_OWN_PROCESS   = 0x00000010
SERVICE_WIN32_SHARE_PROCESS = 0x00000020
SERVICE_INTERACTIVE_PROCESS = 0x00000100
SERVICE_INTERACTIVE_SHARE_PROCESS = 0x00000120

; StartType values
SERVICE_BOOT_START          = 0x00000000
SERVICE_SYSTEM_START        = 0x00000001
SERVICE_AUTO_START          = 0x00000002
SERVICE_DEMAND_START        = 0x00000003
SERVICE_DISABLED            = 0x00000004

; ErrorControl values
SERVICE_ERROR_IGNORE        = 0x00000000
SERVICE_ERROR_NORMAL        = 0x00000001
SERVICE_ERROR_SEVERE        = 0x00000002
SERVICE_ERROR_CRITICAL      = 0x00000003

; Registry types
REG_MULTI_SZ                = 0x10000
REG_EXPAND_SZ               = 0x20000
REG_DWORD                   = 0x10001
