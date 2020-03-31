nstall,,1
HKR,,NoInstallClass,,1
HKR,,TroubleShooter-0,,"hcp://help/tshoot/tsdrive.htm"
HKR,,Icon,,"-53"
HKR,,DeviceType,0x10001,7                       ; FILE_DEVICE_DISK
HKR,,DeviceCharacteristics,0x10001,0x100        ; Use same security checks on relative opens

;;
;; The AutoRunAlwaysDisable key is only for use when the hardware cannot
;; accepts  TEST_UNIT_READY  commands.  Disabling 'AutoRun' or including
;; devices in this list will prevent removable media services from being
;; able to properly handle these devices.
;;

[autorun_addreg]
HKLM,"System\CurrentControlSet\Services\disk","AutoRunAlwaysDisable", 0x00010008, "Brother RemovableDisk(U)"

[disk_copyfiles]
disk.sys
crcdisk.sys

[storprop_copyfiles]
storprop.dll

[DestinationDirs]
disk_copyfiles=12
storprop_copyfiles=11

[Manufacturer]
%GenManufacturer%=disk_device,NTamd64
%Compaq%=compaq,NTamd64
%Mylex%=mylex,NTamd64

[disk_device.NTamd64]
%disk_devdesc% = disk_install, GenDisk
%opticaldisk_devdesc% = disk_install, GenOptical
%disk_devdesc% = disk_install, USBSTOR\DiskSony____MSC-U01_________
%disk_devdesc% = disk_install, USBSTOR\DiskSony____MSC-U01N________
%disk_devdesc% = media_unlockable_disk_install, IDE\DiskIOMEGA_ZIP_100__________________________
%disk_devdesc% = media_unlockable_disk_install, SCSI\DiskIOMEGA__ZIP_100_________
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\FUJITSU&DynaMO-FE_OPTICAL_DRIVE&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\&SYM13FW500-DISK_DRIVE&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\&WDxxxA001RTL-Disk_Drive&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\MAC_TECHNOLOGIESINC.&MAC_THIN_FIREWIRE_DRIVE&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\VST_TECHNOLOGIESINC.&VST_THIN_FIREWIRE_DRIVE&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\Sony&PCVA-HD04&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\LSI_Logic&SYM13FW500-DISK_DRIVE&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\MELCO_INC&1394MEL-HD_DRIVE_&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\MELCO_INC&1394MEL-HD_DRIVE&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\MELCO_INC&1394MEL-MO_DRIVE_&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\LOGITEC&LMO-PFU&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\LOGITEC&LMO-AF&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\OXFW900_&LHD-SF__&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\LOGITEC&LHD-PFU&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\LOGITEC&LHD_AF&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\I-O_DATA_DEVICE_INC.&1394_Converter__&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\API-903-95__&1394_Storage_+_Repeater_&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_orderly_removal_disk_install, SBP2\Sony&PCVA-HD08A&CmdSetId104d8&GenDisk
%disk_devdesc% = expect_surprise_removal_disk_install, LEXARUSB\GenDisk
%disk_devdesc% = expect_surprise_removal_disk_install, SCSI\DiskToshiba_SD_Mem_Driver___

[compaq.NTamd64]
%compaq_array.DeviceDesc% = disk_install, SCSI\DiskCompaq__Disk_Array______

[mylex.NTamd64]
%mylex_array.DeviceDesc% = disk_install, SCSI\DiskMYLEX___

[media_unlockable_disk_install.NT]
CopyFiles=disk_copyfiles

[media_unlockable_disk_install.NT.Services]
AddService=disk,2,disk_ServiceInstallSection

[media_unlockable_disk_install.NT.HW]
AddReg=media_unlockable_disk_install_HW.AddReg

[media_unlockable_disk_install_HW.AddReg]
HKR,"Classpnp","HackMask",0x00010001,0x1 ; Device cannot lock media

[expect_orderly_removal_disk_install.NT]
CopyFiles=disk_copyfiles

[expect_orderly_removal_disk_install.NT.Services]
AddService=disk,2,disk_ServiceInstallSection

[expect_orderly_removal_disk_install.NT.HW]
AddReg=expect_orderly_removal_disk_install_HW.AddReg

[expect_orderly_removal_disk_install_HW.AddReg]
HKR,,"RemovalPolicy",0x00010001,0x2    ; ExpectOrderlyRemoval

[expect_surprise_removal_disk_install.NT]
CopyFiles=disk_copyfiles

[expect_surprise_removal_disk_install.NT.Services]
AddService=disk,2,disk_ServiceInstallSection

[expect_surprise_removal_disk_install.NT.HW]
AddReg=expect_surprise_removal_disk_install_HW.AddReg

[expect_surprise_removal_disk_install_HW.AddReg]
HKR,,"RemovalPolicy",0x00010001,0x3    ; ExpectSurpriseRemoval

[disk_install.NT]
CopyFiles=disk_copyfiles
ExcludeId=GenSFloppy,SCSI\DiskMATSHITALS-120_COSM___04,SCSI\DiskCOMPAQ__LS-120_VER5___AB
ExcludeId=SCSI\DiskCOMPAQ__LS-120_HIMA___01,SCSI\DiskMATSHITALS-120_VER5___00
ExcludeId=SCSI\DiskMATSHITALS-120/240____00
DiskCiPrivateData=4

[disk_install.NT.Services]
AddService=disk,2,disk_ServiceInstallSection
AddService=crcdisk,,crcfilt_Service_InstallSection, 

[disk_ServiceInstallSection]
DisplayName=%disk_ServiceDesc%
ServiceType=1
StartType=0
ErrorControl=1
ServiceBinary = %12%\disk.sys
AddReg=autorun_addreg

[crcfilt_Service_InstallSection]
DisplayName= %CrcFilt.SvcDesc%
ServiceType=1
StartType=0
ErrorControl=1
ServiceBinary = %12%\crcdisk.sys
LoadOrderGroup=Pnp Filter	
































[Strings]
MSFT="Microsoft"
DiskClassName="Disk drives"
GenManufacturer="(Standard disk drives)"
Compaq="Compaq"
Mylex="Mylex"

disk_devdesc="Disk drive"
opticaldisk_devdesc="Optical disk drive"

disk_ServiceDesc="Disk Driver"
CrcFilt.SvcDesc="CRC Disk Filter Driver"
compaq_array.DeviceDesc = "Compaq SCSI Drive Array"
mylex_array.DeviceDesc = "Mylex RAID Disk Device"
