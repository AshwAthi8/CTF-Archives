;;;
;;; File System Filter Manager
;;;
;;;
;;; Copyright (c) 2000, Microsoft Corporation
;;;

[Version]
Signature="$Windows NT$"
SetupClass=BASE
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[DefaultInstall]
CopyFiles=FltMgr.DriverFiles
AddReg=FltMgr_addreg

[DefaultInstall.Services]
AddService=%FltMgrServiceName%,,FltMgr.Service

[DestinationDirs]
FltMgr.DriverFiles=12               ;%windir%\system32\drivers

;
; Services Section
;

[FltMgr.Service]
DisplayName      = %FltMgrServiceName%
Description      = %FltMgrServiceDesc%
ServiceBinary    = %12%\fltMgr.sys      ;%windir%\system32\drivers\fltMgr.sys
ServiceType      = 2                    ;SERVICE_FILE_SYSTEM_DRIVER
StartType        = 0                    ;SERVICE_BOOT_START
ErrorControl     = 1                    ;SERVICE_ERROR_NORMAL
LoadOrderGroup   = "FSFilter Infrastructure"

;
; Copy Files
;

[FltMgr.DriverFiles]
fltMgr.sys

[FltMgr_addreg]
HKLM,"SYSTEM\CurrentControlSet\Services\FltMgr\","AttachWhenLoaded",0x10001,1


[Strings]
FltMgrServiceName  = "FltMgr"
FltMgrServiceDesc  = "File System Filter Manager Driver"
