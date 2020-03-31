TS_files_uninstall

; 0x10  = SPSVCINST_NOCLOBBER_STARTTYPE
; 0x200 = SPSVCINST_STOPSERVICE
[DefaultInstall.Services]
DelService = BITS,0x200
AddService = BITS,0x10,BITS_service_entry

[DefaultUninstall.Services]
DelService = BITS

; Copy everything to the system32 directory
[DestinationDirs]
BITS_files_install   = 11
BITS_files_uninstall = 11
wBITS_files_uninstall=16425
wBITS_files_install=16425

;no skip and no version check
[BITS_files_install]
qmgr.dll,,6
qmgrprxy.dll,,6
bitsprx2.dll,,6
bitsprx3.dll,,6

;set security descriptor on the installed files
[BITS_files_install.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"

[BITS_files_uninstall]
qmgr.dll
qmgrprxy.dll
bitsprx2.dll
bitsprx3.dll

[BITS_regsvr_dlls]
11,,qmgrprxy.dll,1
11,,bitsprx2.dll,1
11,,bitsprx3.dll,1
16425,,qmgrprxy.dll,1
16425,,bitsprx2.dll,1
16425,,bitsprx3.dll,1

[wBITS_files_install]
qmgrprxy.dll,wqmgrprxy.dll,6
bitsprx2.dll,wbitsprx2.dll,6
bitsprx3.dll,wbitsprx3.dll,6

[wBITS_files_install.Security]
"D:P(A;;GRGX;;;BU)(A;;GA;;;BA)(A;;GA;;;SY)(A;;GRGX;;;WD)"

[BITS_regkeys_install]
; 0x10001 maps to FLG_ADDREG_TYPE_DWORD
; 0x10008 maps to ( FLG_ADDREG_TYPE_MULTI_SZ | FLG_ADDREG_APPEND )
; 0x20000 maps to FLG_ADDREG_TYPE_EXPAND_SZ

; Service keys
HKLM,"SYSTEM\CurrentControlSet\Services\BITS\Parameters","ServiceDll",0x00020000,"%11%\qmgr.dll"
HKLM,"Software\Microsoft\Windows NT\CurrentVersion\SvcHost","netsvcs",0x00010008,"BITS"

HKLM,"SYSTEM\CurrentControlSet\Services\BITS\","FailureActions",   0x00000001,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x03,0x00,0x00,0x00,0x68,0xE3,0x0C,0x00,0x01,0x00,0x00,0x00,0x60,0xEA,0x00,0x00,0x01,0x00,0x00,0x00,0x60,0xEA,0x00,0x00,0x01,0x00,0x00,0x00,0x60,0xEA,0x00,0x00
HKLM,"SYSTEM\CurrentControlSet\Services\BITS\","ObjectName",0x00000000,"LocalSystem"

;;
;;             CLSID keys:
;;

;
; BITS 2.0 class
;
HKCR,"CLSID\{6d18ad12-bde3-4393-b311-099c346e6df9}",,0x00000000,%BITS_CLASS_2_0_NAME%
HKCR,"CLSID\{6d18ad12-bde3-4393-b311-099c346e6df9}","AppID",0x00000000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
;
; BITS 1.5 class
;
HKCR,"CLSID\{F087771F-D74F-4C1A-BB8A-E16ACA9124EA}",,0x00000000,%BITS_CLASS_1_5_NAME%
HKCR,"CLSID\{F087771F-D74F-4C1A-BB8A-E16ACA9124EA}","AppID",0x00000000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
;
; BITS 1.0 class
;
HKCR,"CLSID\{4991d34b-80a1-4291-83b6-3328366b9097}",,0x00000000,%BITS_CLASS_1_0_NAME%
HKCR,"CLSID\{4991d34b-80a1-4291-83b6-3328366b9097}","AppID",0x00000000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
;
; old QMGR class
;
HKCR,"CLSID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}",,0x00000000,%LEGACY_BITS_CLASS_NAME%
HKCR,"CLSID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}","AppID",0x00000000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"

;;
;;          Register the 32bit CLSID keys just in case someone is looking
;; 

;
; BITS 2.0 class
;
HKCR,"CLSID\{6d18ad12-bde3-4393-b311-099c346e6df9}",,0x00004000,%BITS_CLASS_2_0_NAME%
HKCR,"CLSID\{6d18ad12-bde3-4393-b311-099c346e6df9}","AppID",0x00004000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
;
; BITS 1.5 class
;
HKCR,"CLSID\{F087771F-D74F-4C1A-BB8A-E16ACA9124EA}",,0x0004000,%BITS_CLASS_1_5_NAME%
HKCR,"CLSID\{F087771F-D74F-4C1A-BB8A-E16ACA9124EA}","AppID",0x00004000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
;
; BITS 1.0 class
;
HKCR,"CLSID\{4991d34b-80a1-4291-83b6-3328366b9097}",,0x00004000,%BITS_CLASS_1_0_NAME%
HKCR,"CLSID\{4991d34b-80a1-4291-83b6-3328366b9097}","AppID",0x00004000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
;
; old QMGR class
;
HKCR,"CLSID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}",,0x00004000,%LEGACY_BITS_CLASS_NAME%
HKCR,"CLSID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}","AppID",0x00004000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"

;; Event logging keys
;;
;; 0x7 = EVENTLOG_ERROR_TYPE | EVENTLOG_WARNING_TYPE | EVENTLOG_INFORMATION_TYPE
;;
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\System\BITS","TypesSupported", 0x00010001, 0x7
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\System\BITS","CategoryCount", 0x00010001, 1
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\System\BITS","CategoryMessageFile",0x00000000,"%11%\xpob2res.dll"
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\System\BITS","EventMessageFile",0x00000000,"%11%\xpob2res.dll"

; AppID keys
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}",,0x00000000,%BITS_DISPLAY_NAME%
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}","LocalService",0x00000000,"BITS"
HKCR,"AppID\BITS","AppID",0x00000000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
; Give allow permissions to Administrators,INTERACTIVE,SERVICE,and SYSTEM
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}","LaunchPermission",0x00000003, \
 01,00,04,80,70,00,00,00,\
 8c,00,00,00,00,00,00,00,\
 14,00,00,00,02,00,5c,00,\
 04,00,00,00,00,00,18,00,\
 01,00,00,00,01,02,00,00,\
 00,00,00,05,20,00,00,00,\
 20,02,00,00,00,00,14,00,\
 01,00,00,00,01,01,00,00,\
 00,00,00,05,04,00,00,00,\
 00,00,14,00,01,00,00,00,\
 01,01,00,00,00,00,00,05,\
 06,00,00,00,00,00,14,00,\
 01,00,00,00,01,01,00,00,\
 00,00,00,05,12,00,00,00,\
 01,05,00,00,00,00,00,05,\
 15,00,00,00,a0,5f,84,1f,\
 5e,2e,6b,49,ce,12,03,03,\
 f4,01,00,00,01,05,00,00,\
 00,00,00,05,15,00,00,00,\
 a0,5f,84,1f,5e,2e,6b,49,\
 ce,12,03,03,f4,01,00,00

; Register the 32BIT AppID keys in case someone is looking

HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}",,0x00004000,%BITS_DISPLAY_NAME%
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}","LocalService",0x00004000,"BITS"
HKCR,"AppID\BITS","AppID",0x00004000,"{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
; Give allow permissions to Administrators,INTERACTIVE,SERVICE,and SYSTEM
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}","LaunchPermission",0x00004003, \
 01,00,04,80,70,00,00,00,\
 8c,00,00,00,00,00,00,00,\
 14,00,00,00,02,00,5c,00,\
 04,00,00,00,00,00,18,00,\
 01,00,00,00,01,02,00,00,\
 00,00,00,05,20,00,00,00,\
 20,02,00,00,00,00,14,00,\
 01,00,00,00,01,01,00,00,\
 00,00,00,05,04,00,00,00,\
 00,00,14,00,01,00,00,00,\
 01,01,00,00,00,00,00,05,\
 06,00,00,00,00,00,14,00,\
 01,00,00,00,01,01,00,00,\
 00,00,00,05,12,00,00,00,\
 01,05,00,00,00,00,00,05,\
 15,00,00,00,a0,5f,84,1f,\
 5e,2e,6b,49,ce,12,03,03,\
 f4,01,00,00,01,05,00,00,\
 00,00,00,05,15,00,00,00,\
 a0,5f,84,1f,5e,2e,6b,49,\
 ce,12,03,03,f4,01,00,00

[BITS_delkeys_install]
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\SvcHost\Drizzlegroup"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\SvcHost","Drizzlegroup"
HKCR,"AppID\Drizzle"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\SvcHost\BITSgroup","AuthenticationCapabilities"

[BITS_regkeys_uninstall]
;
; uninstall isn't really supported
;
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\SvcHost\BITSgroup"
HKLM,"SOFTWARE\Microsoft\Windows NT\CurrentVersion\SvcHost","BITSgroup"
HKLM,"SYSTEM\CurrentControlSet\Services\EventLog\System\BITS"
HKCR,"CLSID\{6d18ad12-bde3-4393-b311-099c346e6df9}"
HKCR,"CLSID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
HKCR,"CLSID\{F087771F-D74F-4C1A-BB8A-E16ACA9124EA}"
HKCR,"CLSID\{4991d34b-80a1-4291-83b6-3328366b9097}"
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}"
HKCR,"AppID\BITS"
HKCR,"CLSID\{6d18ad12-bde3-4393-b311-099c346e6df9}",,0x00004000
HKCR,"CLSID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}",,0x00004000
HKCR,"CLSID\{F087771F-D74F-4C1A-BB8A-E16ACA9124EA}",,0x00004000
HKCR,"CLSID\{4991d34b-80a1-4291-83b6-3328366b9097}",,0x00004000
HKCR,"AppID\{69AD4AEE-51BE-439b-A92C-86AE490E8B30}",,0x00004000
HKCR,"AppID\BITS",,0x00004000

[BITS_service_entry]
DisplayName="%BITS_DISPLAY_NAME%"
Description="%BITS_DESCRIPTION%"
ServiceType=32
StartType=3
ErrorControl=1
ServiceBinary="%11%\svchost.exe -k netsvcs"
Dependencies="RpcSs","EventSystem"


[Strings]
BITS_DISPLAY_NAME = "Background Intelligent Transfer Service"
BITS_DESCRIPTION  = "Transfers data between clients and servers in the background. If BITS is disabled, features such as Windows Update will not work correctly."
BITS_CLASS_1_0_NAME   = "Background Intelligent Transfer Control Class 1.0"
BITS_CLASS_1_5_NAME   = "Background Intelligent Transfer Control Class 1.5"
BITS_CLASS_2_0_NAME   = "Background Intelligent Transfer Control Class 2.0"
LEGACY_BITS_CLASS_NAME = "Legacy Background Intelligent Transfer Control Class"
