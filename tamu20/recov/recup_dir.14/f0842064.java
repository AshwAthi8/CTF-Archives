eSnapshot.DeviceDesc%=volume_snapshot_install,STORAGE\VolumeSnapshot

[volume_snapshot_install.NTamd64]
;
; Nothing to do (these devices are raw).  We just needed an INF
; match so these don't show up as "unknown" devices.
;

[volume_snapshot_install.NTamd64.Interfaces]
AddInterface={53F5630D-B6BF-11D0-94F2-00A0C91EFB8B}

[volume_snapshot_install.NTamd64.Services]
AddService = ,2, ; Run the device RAW
































[Strings]
MSFT="Microsoft"
VolumeSnapshotClassName="Storage volume shadow copies"
STORAGE\VolumeSnapshot.DeviceDesc="Generic volume shadow copy"
