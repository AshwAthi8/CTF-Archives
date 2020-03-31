
;; The inf file for User Mode HID services.

[Version]
Signature="$CHICAGO$"
Class=HIDClass
ClassGuid={745a17a0-74d3-11d0-b6fe-00a0c90f57da}
provider=%MSFT%
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Manufacturer]
%MfgName%=Microsoft,NTamd64
%Microsoft.Mfg%=Microsoft.Section,NTamd64
%Altec.Mfg%=Altec.Section,NTamd64
%Fujitsu.Mfg%=Fujitsu.Section,NTamd64
%Philips.Mfg%=Philips.Section,NTamd64
%LabTec.Mfg%=LabTec.Section,NTamd64
%NEC.Mfg%=NEC.Section,NTamd64
%Yamaha.Mfg%=Yamaha.Section,NTamd64

;===============================================================

[Microsoft.NTamd64]
%HID_DEVICE_SYSTEM_CONSUMER%=HIDSystemConsumer,,HID_DEVICE_UP:000C_U:0001

[Microsoft.Section.NTamd64]
%HID\VID_045E&PID_0014&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_0014&MI_02
%HID\VID_045E&PID_001D&MI_01&COL01.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_001D&MI_01&COL01
%HID\VID_045E&PID_002B&MI_01&COL01.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_002B&MI_01&COL01
%HID\VID_045E&PID_002D&MI_01&COL01.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_002D&MI_01&COL01
%HID\VID_045E&PID_0048&MI_01&COL01.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_0048&MI_01&COL01
%HID\VID_045E&PID_005C&MI_01&COL01.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_005C&MI_01&COL01
%HID\VID_045E&PID_006D&COL02.DeviceDesc%=HIDSystemConsumer,,HID\VID_045E&PID_006D&COL02

[Altec.Section.NTamd64]
%HID\VID_04D2&PID_FF47&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_04D2&PID_FF47&MI_02
%HID\VID_04D2&PID_FF49&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_04D2&PID_FF49&MI_02
%HID\VID_04D2&PID_0070&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_04D2&PID_0070&MI_02

[Fujitsu.Section.NTamd64]
%HID\VID_04c5&PID_1020&MI_01&Col01.DeviceDesc%=HIDSystemConsumer,,HID\VID_04c5&PID_1020&MI_01&Col01
%HID\VID_04c5&PID_1018&Col02.DeviceDesc%=HIDSystemConsumer,,HID\VID_04c5&PID_1018&Col02

[Philips.Section.NTamd64]
%HID\VID_0471&PID_0101&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_0471&PID_0101&MI_02

[LabTec.Section.NTamd64]
%HID\VID_0672&PID_1041&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_0672&PID_1041&MI_02

[NEC.Section.NTamd64]
%HID\VID_0409&PID_0203&MI_03.DeviceDesc%=HIDSystemConsumer,,HID\VID_0409&PID_0203&MI_03
%HID\VID_0409&PID_0094&Col02.DeviceDesc%=HIDSystemConsumer,,HID\VID_0409&PID_0094&Col02

[Yamaha.Section.NTamd64]
%HID\VID_0499&PID_3001&MI_02.DeviceDesc%=HIDSystemConsumer,,HID\VID_0499&PID_3001&MI_02

;===============================================================

[DestinationDirs]
DefaultDestDir = 10,system32


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;  Install section for HID Consumer Control devices  ;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
[HIDSystemConsumer]
CopyFiles=HidServ.Copy
DelFiles=HidServ.Delete
AddReg=HidServ.AddReg

[HidServ.Copy]
hidserv.dll,,,0x00000040

[HidServ.Delete]
hidserv.exe,,,1

[HidServ.AddReg]
HKLM,%RunOnce%,HidServ,,"rundll32.exe hidserv.dll,InstallHidserv"

[ControlFlags]
ExcludeFromSelect = *
































[Strings]
;Non-localized strings
MSFT="Microsoft"
MfgName="Microsoft"
Microsoft.Mfg="Microsoft"
Altec.Mfg="Altec Lansing"
Fujitsu.Mfg="Fujitsu"
Philips.Mfg="Philips"
LabTec.Mfg="Labtec"
NEC.Mfg="NEC"
Yamaha.Mfg="Yamaha"

RunOnce = "SOFTWARE\Microsoft\Windows\CurrentVersion\RunOnce"

;Localized strings

HID\VID_045E&PID_0014&MI_02.DeviceDesc="Microsoft Digital Sound System 80 HID Audio Controls"
HID\VID_045E&PID_001D&MI_01&COL01.DeviceDesc="Microsoft Natural Keyboard Pro Consumer Controls"
HID\VID_045E&PID_002B&MI_01&COL01.DeviceDesc="Microsoft Internet Keyboard Pro Consumer Controls"
HID\VID_045E&PID_002D&MI_01&COL01.DeviceDesc="Microsoft Internet Keyboard Consumer Controls"
HID\VID_045E&PID_0048&MI_01&COL01.DeviceDesc="Microsoft Office Keyboard Consumer Controls"
HID\VID_045E&PID_005C&MI_01&COL01.DeviceDesc="Microsoft Office Keyboard Consumer Controls (106/109)"
HID\VID_045E&PID_006D&COL02.DeviceDesc="Microsoft eHome Remote Consumer Controls"
HID\VID_04D2&PID_FF47&MI_02.DeviceDesc="Altec Lansing HID Audio Controls"
HID\VID_04D2&PID_FF49&MI_02.DeviceDesc="Altec Lansing HID Audio Controls"
HID\VID_04D2&PID_0070&MI_02.DeviceDesc="Altec Lansing HID Audio Controls"
HID\VID_0672&PID_1041&MI_02.DeviceDesc="Labtec HID Audio Controls"
HID\VID_04c5&PID_1020&MI_01&Col01.DeviceDesc="Fujitsu Keyboard Consumer Controls"
HID\VID_04c5&PID_1018&Col02.DeviceDesc="Fujitsu Keyboard Consumer Controls"
HID\VID_0471&PID_0101&MI_02.DeviceDesc="Philips HID Audio Controls"
HID\VID_0409&PID_0203&MI_03.DeviceDesc="NEC HID Audio Controls"
HID\VID_0409&PID_0094&Col02.DeviceDesc="NEC HID One Touch Start Buttons"
HID\VID_0499&PID_3001&MI_02.DeviceDesc="Yamaha HID Audio Controls"

HID_DEVICE_SYSTEM_CONSUMER="HID-compliant consumer control device"

