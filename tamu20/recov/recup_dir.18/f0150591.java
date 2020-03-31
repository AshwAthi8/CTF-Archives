;
; ACERSCAN.INF  -- Windows Still Image Setup File
;
; Copyright (c) Microsoft Corporation.  All rights reserved.
; Manufacturer: Microsoft Corp for Acer
[Version]
LayoutFile=Layout.inf
Signature="$CHICAGO$"
Class=Image
ClassGUID={6bdd1fc6-810f-11d0-bec7-08002be2092f}
Provider=%Msft%
DriverVer=10/01/2002,5.2.3790.1830

[ControlFlags]
ExcludeFromSelect=*

[DestinationDirs]
DefaultDestDir=11
WIA.ScanUsd=10,system32
WIA.FirmWare=10,usbbin

[Manufacturer]
%Mfg%=Models,NTamd64

[Models.NTamd64]
%FlatbedScaner5%=WIA.Scanner,USB\VID_04A5&PID_1A20
%FlatbedScaner5%=WIA.Scanner,USB\VID_04A5&PID_1A2A
%FlatbedScaner13%=WIA.Scanner,USB\VID_04A5&PID_2022
%FlatbedScaner13%=WIA.Scanner,USB\VID_04A5&PID_2060
%FlatbedScaner16%=WIA.Scanner,USB\VID_04A5&PID_2040
%FlatbedScaner19%=WIA.Scanner,USB\VID_04A5&PID_20C0
%FlatbedScaner20%=WIA.Scanner,USB\VID_04A5&PID_207E
%FlatbedScaner20%=WIA.Scanner,USB\VID_04A5&PID_20BE
%FlatbedScaner21%=WIA.Scanner,USB\VID_04A5&PID_20DE
%FlatbedScaner23%=WIA.Scanner,USB\VID_04A5&PID_20B0

[WIA.Scanner]
Include = sti.inf
Needs   = STI.USBSection

SubClass=StillImage
DeviceType=1
DeviceSubType=0x1
Capabilities=0x31
Events=WIA.Events
DeviceData=WIA.DeviceData
AddReg=WIA.AddReg
CopyFiles=WIA.ScanUsd,WIA.Firmware
ICMProfiles="sRGB Color Space Profile.icm"

[WIA.Events]
Button1_0=%Button1_0%,{7AD6EA4C-3AAB-11d3-86CB-08002BE4D8DC},*
Button1_1=%Button1_1%,{76B1B8A1-394D-11d3-86CB-08002BE4D8DC},*
Button2_0=%Button2_0%,{76B1B8A2-394D-11d3-86CB-08002BE4D8DC},*
Button2_1=%Button2_1%,{76B1B8B9-394D-11d3-86CB-08002BE4D8DC},*
Button3_0=%Button3_0%,{76B1B8BA-394D-11d3-86CB-08002BE4D8DC},*
Button3_1=%Button3_1%,{76B1B8BD-394D-11d3-86CB-08002BE4D8DC},*


[WIA.Scanner.Services]
Include =    sti.inf
Needs   = STI.USBSection.Services

[WIA.DeviceData]
Server=local
UI DLL=sti.dll
UI Class ID={4DB1AD10-3391-11D2-9A33-00C04FA36145}

[WIA.AddReg]
HKR,,HardwareConfig,1,1
HKR,,DevLoader,,*NTKERN
HKR,,NTMPDriver,,"usbscan.sys"
HKR,,USDClass,,"{5D922427-8843-11d1-B882-08002BE4EC98}"
HKCR,CLSID\{5D922427-8843-11d1-B882-08002BE4EC98},,,"Acer USB User MiniDriver"
HKCR,CLSID\{5D922427-8843-11d1-B882-08002BE4EC98}\InProcServer32,,,%10%\system32\AcerScaD.dll
HKCR,CLSID\{5D922427-8843-11d1-B882-08002BE4EC98}\InProcServer32,ThreadingModel,,"Both"

[WIA.ScanUsd]
AcerScaD.dll

[WIA.Firmware]
Model.ini
u96v121.bin
u34v110.bin
u64v119.bin
u126v041.bin
u190v041.bin
u192v073.bin
u222V065.bin
u176v040.bin


[Strings]
Msft="Microsoft"
Mfg="Acer Peripherals,Inc."

;FlatbedScaner5 ="Acer scanner 310U/620U"
;FlatbedScaner13="Acer 320U/340U/620U+/640U"
;FlatbedScaner16="Acer scanner 620UT+/640UT"
;FlatbedScaner19="Acer scanner 1240UT/5100U"
;FlatbedScaner20="Acer scanner 640BT/640BU"
;FlatbedScaner21="Acer scanner 4300U/3300U"
;FlatbedScaner23="Acer scanner 4300U/3300U"

FlatbedScaner5 ="FlatbedScanner_5"
FlatbedScaner13="FlatbedScanner_13"
FlatbedScaner16="FlatbedScanner_16"
FlatbedScaner19="FlatbedScanner_19"
FlatbedScaner20="FlatbedScanner_20"
FlatbedScaner21="FlatbedScanner_21"
FlatbedScaner23="FlatbedScanner_23"

Button1_0="Preview"
Button1_1="Scan to file"
Button2_0="OCR"
Button2_1="E-Mail"
Button3_0="Copy"
Button3_1="Fax"

