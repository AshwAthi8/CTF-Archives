// #version             value
// #level               value
// #type name1 value1
// {
//   MofFields
// }
// #type name2 value2
// {
//   MofFields
// }
//

//******************************************
// Kernel Events
//******************************************

68fdd900-4a3e-11d1-84f4-0000f80464e3 EventTrace
#type Header    0
{
    BufferSize,     ItemULong
    Version,        ItemULong
    BuildNumber,    ItemULong
    NumProc,        ItemULong
    EndTime,        ItemULongLong
    TimerResolution,ItemULong
    MaxFileSize,    ItemULong
    LogFileMode,    ItemULongX
    BuffersWritten, ItemULong
    StartBuffers,   ItemULong
    PointerSize,    ItemULong
    EventsLost,     ItemULong
    CPUSpeed,       ItemULong
    LoggerName,     ItemPtr
    LogFileName,    ItemPtr
    TimeZone,       ItemCharHidden[176]
    BootTime,       ItemULongLong
    PerfFrequency,  ItemULongLong
    StartTime,      ItemULongLong
    ReservedFlags,  ItemULongX
    BuffersLost,    ItemULong
}

3d6fa8d0-fe05-11d0-9dda-00c04fd7ba7c Process
#version        0
#type Start     1
#type End       2
#type DCStart   3
#type DCEnd     4
{
    ProcessId, ItemPtr
    ParentId, ItemPtr
    UserSID, ItemSid
    ImageFileName, ItemString
}
#version        1
#type Start     1
#type End       2
#type DCStart   3
#type DCEnd     4
{
    PageDirectoryBase, ItemPtr
    ProcessId, ItemULongX
    ParentId, ItemULongX
    SessionId, ItemULong
    ExitStatus, ItemULong
    UserSID, ItemSid
    ImageFileName, ItemString
}

3d6fa8d1-fe05-11d0-9dda-00c04fd7ba7c Thread
#version 0
#type Start 1
#type End   2
#type DCStart   3
#type DCEnd 4
{
    TThreadId, ItemULongX
    ProcessId, ItemULongX
}
#version 1
#type Start 1
#type DCStart   3
{
    ProcessId, ItemULongX
    TThreadId, ItemULongX
    StackBase, ItemPtr
    StackLimit, ItemPtr
    UserStackBase, ItemPtr
    UserStackLimit, ItemPtr
    StartAddr, ItemPtr
    Win32StartAddr, ItemPtr
    WaitMode, ItemChar
}
#version 1
#type End   2
#type DCEnd 4
{
    ProcessId, ItemULongX
    TThreadId, ItemULongX
}
#version 1
#type CSwitch    36
{
    NewThreadId, ItemULongX
    OldThreadId, ItemULongX
    NewThreadPriority, ItemCharShort
    OldThreadPriority, ItemCharShort
    NewThreadQuantum, ItemCharShort
    OldThreadQuantum, ItemCharShort
    OldThreadWaitReason, ItemCharShort
    OldThreadWaitMode, ItemCharShort
    OldThreadState, ItemCharShort
    OldThreadWaitIdealProcessor, ItemCharShort
    NewThreadWaitTime, ItemULongX
}

3d6fa8d4-fe05-11d0-9dda-00c04fd7ba7c DiskIo
#type Read  10
#type Write 11
{
    DiskNumber, ItemULong
    IrpFlags, ItemULongX
    TransferSize, ItemULong
    ResponseTime, ItemULong
    ByteOffset, ItemULongLong
    FileObject, ItemPtr
    HighResResponseTime, ItemULongLong
}

AE53722E-C863-11d2-8659-00C04FA321A1 Registry
#version 0
#type Create                10
#type Open                  11
#type Delete                12
#type Query                 13
#type SetValue              14
#type DeleteValue           15
#type QueryValue            16
#type EnumerateKey          17
#type EnumerateValueKey     18
#type QueryMultipleValue    19
#type SetInformation        20
#type Flush                 21
{
    Status,ItemPtr
    KeyHandle, ItemPtr
    ElapsedTime, ItemLongLong
    KeyName, ItemWString
}
#version 1
#type Create                10
#type Open                  11
#type Delete                12
#type Query                 13
#type SetValue              14
#type DeleteValue           15
#type QueryValue            16
#type EnumerateKey          17
#type EnumerateValueKey     18
#type QueryMultipleValue    19
#type SetInformation        20
#type Flush                 21
#type RunDown               22
{
    Status,ItemPtr
    KeyHandle, ItemPtr
    ElapsedTime, ItemLongLong
    Index, ItemULong
    KeyName, ItemWString
}

90cbdc39-4a3e-11d1-84f4-0000f80464e3 FileIo
#version 0
#type Name                 0
{
    FileObject, ItemPtr
    FileName, ItemWString
}
#version 1
#type Name                 0
#type FileCreate          32
{
    FileObject, ItemPtr
    FileName, ItemWString
}

9a280ac0-c8e0-11d1-84e2-00c04fb998a2 TcpIp
#version 0
#type Send   10
#type Recv   11
#type Connect    12
#type Disconnect 13
#type Retransmit 14
#type Accept     15
{
    daddr, ItemIPAddr
    saddr, ItemIPAddr
    dport, ItemPort
    sport, ItemPort
    size,  ItemULong
    PID,   ItemULong
}
#version 1
#type Send   10
#type Recv   11
#type Connect    12
#type Disconnect 13
#type Retransmit 14
#type Accept     15
#type Reconnect  16
{
    PID,   ItemULong
    size,  ItemULong
    daddr, ItemIPAddr
    saddr, ItemIPAddr
    dport, ItemPort
    sport, ItemPort
}

bf3a50c5-a9c9-4988-a005-2df0b7c80f80 UdpIp
#version 0
#type Send   10
#type Recv   11
{
    context, ItemPtr
    saddr, ItemIPAddr
    sport, ItemPort
    size,  ItemUShort
    daddr, ItemIPAddr
    dport, ItemPort
    dsize, ItemUShort
}
#version 1
#type Send   10
#type Recv   11
{
    PID,   ItemULong
    size,  ItemULong
    daddr, ItemIPAddr
    saddr, ItemIPAddr
    dport, ItemPort
    sport, ItemPort
}

2cb15d1d-5fc1-11d2-abe1-00a0c911f518 Image
#version 0
#type Load  10
{
    BaseAddress,   ItemPtr
    ModuleSize,    ItemULong
    ImageFileName, ItemWString
}
#version 1
#type Load 10
{
    ImageBase, ItemPtr
    ImageSize, ItemPtr
    ProcessId, ItemULong
    FileName, ItemWString
}

3d6fa8d3-fe05-11d0-9dda-00c04fd7ba7c PageFault
#type TransitionFault 10
#type DemandZeroFault 11
#type CopyOnWrite     12
#type GuardPageFault  13
#type HardPageFault   14
{
    Virtual Address, ItemPtr
    Program Counter, ItemPtr
}

01853a65-418f-4f36-aefc-dc0f1d2fd235 SystemConfig
#type CPU 10
{
    MHz, ItemULong
    NumberOfProcessors, ItemULong
    MemSize, ItemULong
    PageSize, ItemULong
    AllocationGranularity, ItemULong
    ComputerName, ItemWChar[256]
    DomainName, ItemWChar[132]
}
#type PhyDisk 11
{
    DiskNumber, ItemULong
    BytesPerSector, ItemULong
    SectorsPerTrack, ItemULong
    TracksPerCylinder, ItemULong
    Cylinders, ItemULongLong
    SCSIPort, ItemULong
    SCSIPath, ItemULong
    SCSITarget, ItemULong
    SCSILun, ItemULong
    Manufacturer, ItemWChar[256]
    PartitionCount, ItemULong
    WriteCacheEnabled, ItemBool
    BootDriveLetter, ItemWChar[3]
}
#type LogDisk 12
{
    StartOffset, ItemULongLong
    PartitionSize, ItemULongLong
    DiskNumber, ItemULong
    Size, ItemULong
    DriveType, ItemULong
    DriveLetterString, ItemWChar[4]
    Pad, ItemULong
    PartitionNumber, ItemULong
    SectorsPerCluster, ItemULong
    BytesPerSector, ItemULong
    NumberOfFreeClusters, ItemLongLong
    TotalNumberOfClusters, ItemLongLong
    FileSystem, ItemWChar[16]
    VolumeExt, ItemULong
}
#type NIC 13
{
    NICName, ItemWChar[256]
    Index, ItemULong
    PhysicalAddrLen, ItemULong
    PhysicalAddr, ItemWChar[8]
    Size, ItemULong
    IpAddress, ItemLong
    SubnetMask, ItemLong
    DhcpServer, ItemLong
    Gateway, ItemLong
    PrimaryWinsServer, ItemLong
    SecondaryWinsServer, ItemLong
    DnsServer1, ItemLong
    DnsServer2, ItemLong
    DnsServer3, ItemLong
    DnsServer4, ItemLong
    Data, ItemULong
}
#type Video 14
{
    MemorySize, ItemULong
    XResolution, ItemULong
    YResolution, ItemULong
    BitsPerPixel, ItemULong
    VRefresh, ItemULong
    ChipType, ItemWCHAR[256]
    DACType, ItemWCHAR[256]
    AdapterString, ItemWCHAR[256]
    BiosString, ItemWCHAR[256]
    DeviceId, ItemWCHAR[256]
    StateFlags, ItemULong
}
#type Services 15
{
    ServiceName, ItemWCHAR[34]
    DisplayName, ItemWCHAR[256]
    ProcessName, ItemWCHAR[34]
    ProcessId, ItemULong
}
#type Power 16
{
    S1, ItemBool
    S2, ItemBool
    S3, ItemBool
    S4, ItemBool
    S5, ItemBool
    Pad1, ItemChar
    Pad2, ItemChar
    Pad3, ItemChar
}

//******************************************
// Test Events
// d58c126f-b309-11d1-969e-0000f875a5bc
//******************************************
d58c126f-b309-11d1-969e-0000f875a5bc TraceKmp

//******************************************
// Test Events
// d58c126f-b309-11d1-969e-0000f875a5bc
//******************************************
ce5b1020-8ea9-11d0-a4ec-00a0c9062910 TraceDp
#type Start 1
#type End   2
{
    UserData, ItemULong
}
//******************************************
// Test Events
// 1bd67283-57cc-11d2-9a03-00c04f72c722
//******************************************
1bd67283-57cc-11d2-9a03-00c04f72c722 TranProv
#type Start 1
#type End   2
{
    UserData, ItemULong
}

//******************************************
// DS Events 
// 1c83b2fc-c04f-11d1-8afc-00c04fc21914
//******************************************

5b7eb15d-7441-11d2-b711-00c04fb998a2 DsKccGuid
#type Start 1
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Null1, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd000-daeb-11d1-be80-00c04fadfff5 DsDirSearch
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    Caller, ItemDSWString
    Choice, ItemDSWString
    ObjDN, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,  ItemULong
    ErrCode, ItemDSWString
    Filter,  ItemDSWString
    Index,   ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd001-daeb-11d1-be80-00c04fadfff5 DsDirAddEntry
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    Caller, ItemDSWString
    ObjDn, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd002-daeb-11d1-be80-00c04fadfff5 DsDirMod
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    Caller, ItemDSWString
    ObjDn, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemMLString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemMLString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd005-daeb-11d1-be80-00c04fadfff5 DsDirModDN
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Caller, ItemDSWString
    ObjDn, ItemDSWString
    NewParentDn, ItemDSWString
    NewName, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd003-daeb-11d1-be80-00c04fadfff5 DsDirDel
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    Caller, ItemDSWString
    ObjDn, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemMLString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemMLString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd004-daeb-11d1-be80-00c04fadfff5 DsDirCompare
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    Caller, ItemDSWString
    AssertType, ItemDSWString
    ObjDn, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd006-daeb-11d1-be80-00c04fadfff5 DsDirGtNcChg
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    UuidDest, ItemDSWString
    NcDn, ItemDSWString
    UsnVecFrom, ItemDSWString
    flags, ItemDSWString
    RetCrit, ItemDSWString
    ExtOp, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    NumObj, ItemDSWString
    NumBytes, ItemDSWString
    UsnVecTo, ItemDSWString
    ExtRet, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd007-daeb-11d1-be80-00c04fadfff5 DsDirReplSync
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    NcDn, ItemDSWString
    DsaOrUuid, ItemDSWString
    Options, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId, ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd008-daeb-11d1-be80-00c04fadfff5 DsDirFind
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Caller, ItemDSWString
    AttId, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

05acd009-daeb-11d1-be80-00c04fadfff5 DsLdapBind
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Null1, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa22-7f4b-11d2-b389-0000f87a46c8 DsKccTask
#type Start     1
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Null1, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa23-7f4b-11d2-b389-0000f87a46c8 DsDrsReplSync
#type Start     1
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ObjDN, ItemDSWString
    DraSrc, ItemDSWString
    UuidSrc, ItemDSWString
    Options, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa24-7f4b-11d2-b389-0000f87a46c8 DsDrsReplGtChg
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    UuidDest, ItemDSWString
    NcDn, ItemDSWString
    UsnFromHighObj, ItemDSWString
    UsnFromHighProp, ItemDSWString
    Flags, ItemDSWString
    MaxObj, ItemDSWString
    MaxBytes, ItemDSWString
    ExtOp, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    UsnToHighObj, ItemDSWString
    UsnToHighProp, ItemDSWString
    NumObj, ItemDSWString
    NumByte, ItemDSWString
    ExtRet, ItemDSWString
    ErrCode, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa25-7f4b-11d2-b389-0000f87a46c8 DsDrsUpdtRefs
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    NcDn, ItemDSWString
    DsaDest, ItemDSWString
    UuidDest, ItemDSWString
    Options, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa26-7f4b-11d2-b389-0000f87a46c8 DsDrsReplAdd
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    NcDn, ItemDSWString
    SrcDsaDn, ItemDSWString
    TransDn, ItemDSWString
    DsaSrc, ItemDSWString
    Options, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa27-7f4b-11d2-b389-0000f87a46c8 DsDrsReplMod
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    NcDn, ItemDSWString
    UuidSrc, ItemDSWString
    SrcDra, ItemDSWString
    RepFlags, ItemDSWString
    ModFields, ItemDSWString
    Options, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa28-7f4b-11d2-b389-0000f87a46c8 DsDrsReplDel
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    NcDn, ItemDSWString
    DsaSrc, ItemDSWString
    Options, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa29-7f4b-11d2-b389-0000f87a46c8 DsDrsVrfyNames
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    cNames, ItemDSWString
    Flags, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa2a-7f4b-11d2-b389-0000f87a46c8 DsDrsIntDmMv
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    SrcDsaDn, ItemDSWString
    SrcObjDn, ItemDSWString
    DstNameDn, ItemDSWString
    TargetNcDn, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa2b-7f4b-11d2-b389-0000f87a46c8 DsDrsAddEntry
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    cObj, ItemDSWString
    NameDn, ItemDSWString
    NextNameDn, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    cObjAdded, ItemDSWString
    ErrCode, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa2c-7f4b-11d2-b389-0000f87a46c8 DsDrsExecKcc
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    TaskId, ItemDSWString
    Flags, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa2d-7f4b-11d2-b389-0000f87a46c8 DsDrsGtReplInfo
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    InfoType, ItemDSWString
    ObjDn, ItemDSWString
    UuidSrc, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa2e-7f4b-11d2-b389-0000f87a46c8 DsDrsGtNT4ChgLg
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    flags, ItemDSWString
    maxLen, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    NtStatus, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa2f-7f4b-11d2-b389-0000f87a46c8 DsDrsCrackNames
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    cNames, ItemDSWString
    CodePage, ItemDSWString
    LocaleId, ItemDSWString
    FmtOffered, ItemDSWString
    FmtDesired, ItemDSWString
    Flags, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa30-7f4b-11d2-b389-0000f87a46c8 DsDrsWrtSPN
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Account, ItemDSWString
    Op, ItemDSWString
    cSpn, ItemDSWString
    Flags, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa31-7f4b-11d2-b389-0000f87a46c8 DsDrsDCInfo
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Domain, ItemDSWString
    InfoLevel, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

14f8aa32-7f4b-11d2-b389-0000f87a46c8 DsDrsGtMbrshps
#type Start     1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    cDsNames, ItemDSWString
    OpType, ItemDSWString
    LimitDomDn, ItemDSWString
    Flags, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End       2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    ErrCode, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

5b7eb154-7441-11d2-b711-00c04fb998a2 LdapAtqGuid
#type Start 1
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
}

b9d4702a-6a98-11d2-b710-00c04fb998a2 LdapRequest
#type Start 1
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Choice, ItemDSWString
    Null2, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}
#type End   2
{
    Signature, ItemCharSign
    Version, ItemCharShort
    Inserts, ItemCharShort
    messageId, ItemULong
    BindId,ItemULong
    Id, ItemDSWString
    ErrCode, ItemDSWString
    Null3, ItemDSWString
    Null4, ItemDSWString
    Null5, ItemDSWString
    Null6, ItemDSWString
    Null7, ItemDSWString
    Null8, ItemDSWString
}

//******************************************
// KDC Events 
// 24db8964-e6bc-11d1-916a-0000f8045b04
//******************************************

50af5304-e6bc-11d1-916a-0000f8045b04 GetASTicket
#type Start 1
{
    KdcOption, ItemULongX
}
#type End   2
{
    KerbErr, ItemULongX
    Client, ItemPWString
    Server, ItemPWString
    RequestRealm, ItemPWString
}

c11cf384-e6bd-11d1-916a-0000f8045b04 TGSRequest
#type Start 1
{
    KdcOption, ItemULongX
}
#type End   2
{
    KerbErr, ItemULongX
    Client, ItemPWString
    ServerAcct, ItemPWString
    ClientRealm, ItemPWString
}

a34d7f52-1dd0-434e-88a1-423e2a199946  KdcChangePass
#type Start 1
{
}
#type End   2
{
    KerbErr, ItemULongX
    ExtErr,  ItemULongX
    Klininfo, ItemULongX
    ClientRealm, ItemPWString
    AccountName, ItemPWString
}
        

//******************************************
// Kerberos.dll Events
// bba3add2-c229-4cdb-ae2b-57eb6966b0c4
//******************************************


8a3b8d86-db1e-47a9-9264-146e097b3c64  KerbLogonUser
#type Start 1
{
}
#type End 2
{
   Status,  ItemULongX
   LogonType, ItemPWString
   UserName, ItemPWString
   LogonDomain, ItemPWString
}

52e82f1a-7cd4-47ed-b5e5-fde7bf64cea6 KerbInitSecurityContext
#type Start 1
{
}
#type End   2
{
    Status,     ItemULongX
    CredSource, ItemPWString
    DomainName, ItemPWString 
    UserName,   ItemPWString
    Target,     ItemPWString
    ExtError,   ItemULongX
    klininfo,   ItemULongX    
}
94acefe3-9e56-49e3-9895-7240a231c371 KerbAcceptSecurityContext
#type Start 1
{
}
#type End   2
{
    Status,     ItemULongX
    CredSource, ItemPWString
    DomainName, ItemPWString 
    UserName,   ItemPWString
    Target,     ItemPWString
}

94c79108-b23b-4418-9b7f-e6d75a3a0ab2 KerbSetPassword
#type Start 1
{
}
#type End   2
{
    Status,       ItemULongX
    AccountName,  ItemPWString
    AccountRealm, ItemPWString
    ClientName,   ItemPWString
    ClientRealm,  ItemPWString
    KdcAddress,   ItemPWString 
}

c55e606b-334a-488b-b907-384abaa97b04 KerbChangePassword
#type Start 1
{
}
#type End   2
{
    Status,       ItemULongX
    AccountName,  ItemPWString
    DomainName,   ItemPWString
}


//******************************************
// SAM Events 
// 8e598056-8993-11d2-819e-0000f875a064
//******************************************

39511dbe-899b-11d2-819e-0000f875a064 SamUserCreate
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}

#type End   2

abb14b68-899b-11d2-819e-0000f875a064 SamCompCreate
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

c8eb5e5c-899c-11d2-819e-0000f875a064 SamGrpCreate
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

f9d2ba6a-899c-11d2-819e-0000f875a064 SamAddMemGrp
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

250959aa-899d-11d2-819e-0000f875a064 SamDelMemGrp
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

45fc997e-899d-11d2-819e-0000f875a064 SamPwdChng
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

62bef71e-899d-11d2-819e-0000f875a064 SamUserPwdSet
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

880217b8-899d-11d2-819e-0000f875a064 SamCompPwdSet
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

1f228de8-8a6c-11d2-819e-0000f875a064 SamPwdPushPdc
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

a41d90bc-899d-11d2-819e-0000f875a064 SamIdByName
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

25059476-899f-11d2-819e-0000f875a064 SamNameById
#type Start 1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2
//*********************************************
// *** Active Directory Service Provider: SAM
//     W2K SP Specials
//*********************************************

8c89045c-3f5d-4289-939a-fb854000cb6b SamConnect
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

dbc0ceab-cff3-4c0f-85f2-0c2107142f36 SamCloseHandle
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End   2

74e10cbb-202e-4a97-871d-8547972b5141 SamSetSecurityObj
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

676347f3-fd20-4e7d-90b1-77e35f84af9a SamQuerySecurityObj
#type Start    1
{
    Sam, ItemWString
        Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

f8012701-7e99-49c5-b832-1db8bc4a610d SamShutdownSamSrv
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

a11e5d6b-353d-4bf6-97a8-ede4cba45524 SamLookupDomInSamSrv
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
7c65ceb0-75ba-46b9-884e-67e038c5b003 SamEnumDomInSamSrv
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

6e1f2449-f1f3-4634-b51f-46e2c6625892 SamOpenDomain
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
{
    Sam, ItemWString
    L1, ItemULong
    Sid, ItemWString
    IP, ItemWString
    L2, ItemULong
}
#type End      2
{
    Sam, ItemWString
    L1, ItemULong
    Sid, ItemWString
    IP, ItemWString
    L2, ItemULong
}

89399c21-4aaf-408e-ba39-ab831a1298d5 SamQueryInfoDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
45309ef4-c59e-425e-b95b-19f1c5a3c55a SamSetInfoDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


5d11e02f-0c36-4180-ad07-89062c9df9ec SamEnumGrpsInDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2



07ffaa1d-34f6-49cd-b541-2f0d7dff15c4 SamEnumUsersInDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

5e612efd-c05e-4f76-bced-f5607aa3d46e SamCreateAliasInDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
f1fea491-bfa6-436c-a178-a70d03b4fb1a SamEnumAliasesInDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


1cf5fd19-1ac1-4324-84f7-970a634a91ee SamGetAliasMem
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
{
    Sam, ItemWString
    L1, ItemULong
    Sid, ItemWString
    IP, ItemWString
        L2, ItemULong
}
#type End      2
{
    Sam, ItemWString
    L1, ItemULong
    Sid, ItemWString
    IP, ItemWString
    L2, ItemULong
}
b41d7bdf-4249-4651-ac0f-1879be0d5c0c SamOpenGrp
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

632fcc78-6057-48f9-8d5f-4bb0f73d3cd1 SamQueryInfoGrp
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

26106246-4473-4295-841b-4a51c6afc3db SamSetInfoGrp
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


5f7c4ba5-d6a4-4625-900e-48fa7811e06a SamDeleteGrp
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
5954bc51-c5ec-4aaa-831c-6f2c1b2515b6 SamGetMemInGrp
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

0254ba6d-7ff0-4bfe-a3f9-8fd8da667641 SamSetMemAttrsOfGrp
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

ba41c883-592f-4ab9-b2a9-c6263b011fe7 SamOpenAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

419f025a-bf06-4673-af66-d230bec2af02 SamQueryInfoAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
e712d39d-a3a6-4224-a1bd-4717b24e4e8c SamSetInfoAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

fbfe2540-452b-41bb-9219-dfb6fd1a129b SamDeleteAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

3a2e63d1-5dc4-4168-85ea-3e331f88ce83 SamAddMemToAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


6ba1639c-afc4-454e-b3e0-5e8f7fc39af9 SamRemoveMemFromAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
5cec3d52-6eeb-474d-b468-58362888f1b0 SamGetMemInAlias
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

b8d2bc4a-1525-4386-bb1c-6bb2e24eb001 SamOpenUser
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

c2a0e094-a178-4372-b4fe-a33e48c3585c SamDeleteUser
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

e1cb227a-6d55-4282-a5f7-6fa4a5922c0b SamQueryInfoUser
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
bc80e27f-6b74-4da9-abfc-2e4e82b81000 SamSetInfoUser
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


19b30cde-3e41-4cff-83c8-3df2779f840c SamChangePwdComputer
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


0e3913c5-9760-4ced-b133-004a64e8d53c SamGetGrpsForUser
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2


eb225178-f5f0-42b7-895b-db89276f647a SamQueryDisplayInfo
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2
aceb7864-9a14-4c73-8ed0-94ec53f6651c SamGetDisplayEnumIdx
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

4ff7a7db-43ca-470a-8b64-3003e2d22042 SamGetUserDomPwdInfo
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

8919f267-a053-4669-aa69-2da0d4a20d92 SamRemoveMemFromForeignDom
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

ff0c6ce2-9528-4a91-b9c7-bcf834b6f79a SamGetDomPwdInfo
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

2e991575-c2ed-42a7-97ff-a0d6571f1862 SamSetBootKeyInfo
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

33be4128-d02e-4b6f-949e-ab77cc8164b1 SamGetBootKeyInfo
#type Start    1
{
    Sam, ItemWString
    Version, ItemULong
    Sid, ItemWString
    Client, ItemWString
}
#type End      2

//******************************************
// LSA Events
// cc85922f-db41-11d2-9244-006008269001 MSLSATrace
//******************************************

cc85922e-db41-11d2-9244-006008269001 QuerySecret
#type Start 1
#type End   2

2306fe3b-dbf6-11d2-9244-006008269001 Close
#type Start 1
#type End   2

2306fe3a-dbf6-11d2-9244-006008269001 OpenPolicy
#type Start 1
#type End   2

2306fe39-dbf6-11d2-9244-006008269001 QueryInfoPolicy
#type Start 1
#type End   2

2306fe38-dbf6-11d2-9244-006008269001 SetInfoPolicy
#type Start 1
#type End   2

2306fe37-dbf6-11d2-9244-006008269001 EnumTrustedDoms
#type Start 1
#type End   2

2306fe36-dbf6-11d2-9244-006008269001 LookupNames
#type Start 1
#type End   2

2306fe35-dbf6-11d2-9244-006008269001 LookupSids
#type Start 1
#type End   2

2306fe34-dbf6-11d2-9244-006008269001 OpenTrustedDomain
#type Start 1
#type End   2

2306fe33-dbf6-11d2-9244-006008269001 QryInfoTrustDom
#type Start 1
#type End   2

2306fe32-dbf6-11d2-9244-006008269001 SetInfoTrustedDom
#type Start 1
#type End   2

2306fe31-dbf6-11d2-9244-006008269001 QueryInfoPolicy2
#type Start 1
#type End   2

2306fe30-dbf6-11d2-9244-006008269001 SetInfoPolicy2
#type Start 1
#type End   2

2306fe2f-dbf6-11d2-9244-006008269001 QryTrstDomByNam
#type Start 1
#type End   2

2306fe2e-dbf6-11d2-9244-006008269001 SetTrstedDomInfoByNam
#type Start 1
#type End   2

2306fe2d-dbf6-11d2-9244-006008269001 EnumTrstedDomEx
#type Start 1
#type End   2

2306fe2c-dbf6-11d2-9244-006008269001 CreateTrustedDomEx
#type Start 1
#type End   2

2306fe2b-dbf6-11d2-9244-006008269001 QueryDomainInfoPolicy
#type Start 1
#type End   2

2306fe2a-dbf6-11d2-9244-006008269001 SetDomainInfoPolicy
#type Start 1
#type End   2

2306fe29-dbf6-11d2-9244-006008269001 OpTrustedDomByName
#type Start 1
#type End   2

393da8c0-dbed-11d2-895b-00c04f79ab69  NlServerAuth
#type Start 1
{
        Client, ItemWString
        Account, ItemWString
        ChannelType, ItemULongX
        NegotiatedFlags, ItemULongX
}
#type End   2
{
        Client, ItemWString
        Account, ItemWString
        ChannelType, ItemULongX
        NegotiatedFlags, ItemULongX
        Status, ItemULongX
}

63dbb180-dbed-11d2-895b-00c04f79ab69 NlSecChanlSetup
#type Start 1
#type End   2

//*****************************************************************************
// SRV events
//*****************************************************************************
e09074ae-0a98-4805-9a41-a8940af97086 SrvSmb
#type CreateDirectory          0
#type DeleteDirectory          1
#type Open                     2
#type Create                   3
#type Close                    4
#type Flush                    5
#type Delete                   6
#type Rename                   7
#type QueryInformation         8
#type SetInformation           9
#type Read                    10
#type Write                   11
#type LockByteRange           12
#type UnlockByteRange         13
#type CreateTemporary         14
#type CheckDirectory          15
#type ProcessExit             16
#type Seek                    17
#type LockAndRead             18
#type SetInformation2         19
#type QueryInformation2       20
#type LockingAndX             21
#type Transaction             22
#type TransactionSecondary    23
#type Ioctl                   24
#type IoctlSecondary          25
#type Move                    26
#type Echo                    27
#type OpenAndX                28
#type ReadAndX                29
#type WriteAndX               30
#type FindClose2              31
#type FindNotifyClose         32
#type TreeConnect             33
#type TreeDisconnect          34
#type Negotiate               35
#type SessionSetupAndX        36
#type LogoffAndX              37
#type TreeConnectAndX         38
#type QueryInformationDisk    39
#type Search                  40
#type NtTransaction           41
#type NtTransactionSecondary  42
#type NtCreateAndX            43
#type NtCancel                44
#type OpenPrintFile           45
#type ClosePrintFile          46
#type GetPrintQueue           47
#type ReadRaw                 48
#type WriteRaw                49
#type ReadMpx                 50
#type WriteMpx                51
#type WriteMpxSecondary       52
#type Open2                   53
#type FindFirst2              54
#type FindNext2               55
#type QueryFsInformation      56
#type SetFsInformation        57
#type QueryPathInformation    58
#type SetPathInformation      59
#type QueryFileInformation    60
#type SetFileInformation      61
#type Fsctl                   62
#type Ioctl2                  63
#type FindNotify              64
#type CreateDirectory2        65
#type GetDfsReferrals         66
#type ReportDfsInconsistency  67
#type CreateWirhSdOrEa        68
#type NtIoctl                 69
#type SetSecurityDescriptor   70
#type NtNotifyChange          71
#type NtRename                72
#type QuerySecurityDescriptor 73
#type QueryQuota              74
#type SetQuota                75
{
    StartTime,  ItemULongLong
    ElapseKCPU, ItemCPUTime
    ElapseUCPU, ItemCPUTime
    ClientAddr, ItemIpAddr
    FileObject, ItemULongX
    FileName,   ItemPWString
}

//*****************************************************************************
// DFS events
//*****************************************************************************
e3f1c64a-1a24-494b-8d47-ac37ad623342 DFS
#type TranslatePathStart 50
#type TranslatePathEnd   52
{
    rtnStatus,      ItemULongX
    SubDirectory,   ItemPWString
    ParentPathName, ItemPWString
    DfsPathName,    ItemPWString
}

#type GetReferralsStart  55
#type GetReferralsEnd    59
{
    rtnStatus,      ItemULongX
    DfsPathName,    ItemPWString
}

#type FindShareStart     76
#type FindShareEnd       79
{
    rtnStatus,      ItemULongX
    ShareName,      ItemPWString
}
//*****************************************************************************
// NSPI events: Uses DS Control Guid.
//*****************************************************************************

D01B04CF-240E-11d3-ACBE-00C04F68A51D NspiUpdateStat
#type Start 1
#type End   2

4D63B05C-2502-11d3-ACC1-00C04F68A51D NspiCompareDNTs
#type Start 1
#type End   2

61569D69-2502-11d3-ACC1-00C04F68A51D NspiQueryRows
#type Start 1
#type End   2

6F370D3C-2502-11d3-ACC1-00C04F68A51D NspiSeekEntries
#type Start 1
#type End   2

6F370D3D-2502-11d3-ACC1-00C04F68A51D NspiGetMatches
#type Start 1
#type End   2

6F370D3E-2502-11d3-ACC1-00C04F68A51D NspiResolveNames
#type Start 1
#type End   2

7842189A-2502-11d3-ACC1-00C04F68A51D NspiDNToEph
#type Start 1
#type End   2

7842189B-2502-11d3-ACC1-00C04F68A51D NspiGetHierInfo
#type Start 1
#type End   2

7842189C-2502-11d3-ACC1-00C04F68A51D NspiResrtRestrct
#type Start 1
#type End   2

80AD666A-2502-11d3-ACC1-00C04F68A51D NspiBind
#type Start 1
#type End   2

873BDDEA-2502-11d3-ACC1-00C04F68A51D NspiGtNamFromIDs
#type Start 1
#type End   2

873BDDEB-2502-11d3-ACC1-00C04F68A51D NspiGtIDsFromNam
#type Start 1
#type End   2

8D8C5846-2502-11d3-ACC1-00C04F68A51D NspiGetPropList
#type Start 1
#type End   2

8D8C5847-2502-11d3-ACC1-00C04F68A51D NspiQueryCol
#type Start 1
#type End   2

8D8C5848-2502-11d3-ACC1-00C04F68A51D NspiGetProps
#type Start 1
#type End   2

96EF9AA6-2502-11d3-ACC1-00C04F68A51D NspiGetTemplInfo
#type Start 1
#type End   2

96EF9AA7-2502-11d3-ACC1-00C04F68A51D NspiModProps
#type Start 1
#type End   2

380D48A4-2506-11d3-ACC1-00C04F68A51D NspiModLinkAtt
#type Start 1
#type End   2

380D48A5-2506-11d3-ACC1-00C04F68A51D NspiDeleteEntries
#type Start 1
#type End   2

E357DC53-B6FC-48e0-8189-C9D2AB2A8F16 DsTaskQueueExecuteGuid
#type Start 1
#type End   2


//******************************************
// SPOOLER Events
// Control guid is 94a984ef-f525-4bf1-be3c-ef374056a592
//******************************************

127eb555-3b06-46ea-a08b-5dc2c3c57cfd PrintJob
#type SpoolJob     1
#type PrintJob     7
#type TrackThread  8
#type EndTrackThread  10
#type PauseJob 12
#type ResumeJob 13
{
        JobId, ItemULong
}
#type DeleteJob    2
{
    JobId, ItemULong
    JobSize, ItemULong
    DataType, ItemULong
    Pages, ItemULong
    PagesPerSide, ItemULong
    FilesOpened, ItemShort
}

1d32b239-92a6-485a-96d2-dc3659fb803e RenderedJob
#type JobRendered  11
{
    JobId, ItemULong
    GdiJobSize, ItemULong
    ICMMethod, ItemULong
    Color, ItemShort        
    XRes, ItemShort        
    YRes, ItemShort        
    Quality, ItemShort        
    Copies, ItemShort        
    TTOption, ItemShort        
}

//******************************************
// NTLM Events
// C92CF544-91B3-4dc0-8E11-C580339A0BF8  NtlmControl
//******************************************

94D4C9EB-0D01-41ae-99E8-15B26B593A83 NtlmServerAccept
#type Start 1
{
    StageHint, ItemULong
    InContext, ItemPtr

}
#type End 2
{
    StageHint, ItemULong
    InContext, ItemPtr
    OutContext, ItemPtr
    Status, ItemULong
}
#type Info 0
{
    StageHint, ItemULong
    InContext, ItemPtr
    OutContext, ItemPtr
    Flags, ItemULong
    UserName, ItemPWString
    DomainName, ItemPWString
    Workstation, ItemPWString
}

6DF28B22-73BE-45cc-BA80-8B332B35A21D NtlmClientInitialize
#type Start 1
{
    StageHint, ItemULong
    InContext, ItemPtr

}
#type End 2
{
    StageHint, ItemULong
    InContext, ItemPtr
    OutContext, ItemPtr
    Status, ItemULong
}

19196B33-A302-4c12-9D5A-EAC149E93C46 NtlmLogonUser
#type Start 1
{
}
#type End 2
{
    Status, ItemULong
    LogonType, ItemULong
    UserName, ItemPWString
    DomainName, ItemPWString
}

34D84181-C28A-41d8-BB9E-995190DF83DF NtlmValidateUser
#type Start 1
{
}
#type End 2
{
    Success, ItemULong
    LogonServer, ItemPWString
    LogonDomain, ItemPWString
    UserName, ItemPWString
    Workstation, ItemPWString
}

//******************************************
// Com+ Services Events
//******************************************

67F49F8C-01B8-4354-BFFB-7A93E7211C3E ObjPoolCreateObject
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    ObjectsCreated, ItemULong
    ObjectID, ItemULongLong
}

C5A3005A-F643-4f09-B146-A47B9165E522 ObjPoolDestroyObject
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    ObjectsCreated, ItemULong
    ObjectID, ItemULongLong
}

F1A43E1E-150B-4a8a-8DFF-5E9504819A83 ObjPoolPutObject
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    Reason, ItemLong
    AvailableObjects, ItemULong
    ObjectID, ItemULongLong
}

D3B13BA9-E13C-42a5-AB9D-A765EABD8DD7 ObjPoolGetObject
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectGuid, ItemGUID
    AvailableObjects, ItemULong
    ObjectID, ItemULongLong
}

6251827A-9115-41ca-A3B7-2073CD25EB87 ObjPoolRecycleToTx
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectGuid, ItemGUID
    TransactionGuid, ItemGUID
    ObjectID, ItemULongLong
}

3ED9E879-E0CB-432a-B29E-3440BE825B5C ObjPoolGetFromTx
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectGuid, ItemGUID
    TransactionGuid, ItemGUID
    ObjectID, ItemULongLong
}

880F56F9-5B21-4d36-8C8E-95FF4283006F ObjPoolCreateDecision
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    ThreadsWaiting, ItemULong
    AvailableObjects, ItemULong
    CreatedObjects, ItemULong
    Minimum, ItemULong
    Maximum, ItemULong
}

664E7E9A-458C-4b84-BF3A-C9877D929D00 ObjPoolTimeout
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    ActivityGuid, ItemGUID
    Timeout, ItemULong
}

E68E1870-CB15-4d2d-986E-E9E6D1B2E656 ObjPoolCreatePool
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    Minimum, ItemULong
    Maximum, ItemULong
    Timeout, ItemULong
}

B896121F-0C4F-47e1-AD15-C7B0AA4491C4 AppActivation
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

E90FF16B-2AC0-40b0-9F84-CB742C468CB2 AppShutdown
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

1114B062-2702-4b52-92D2-2EB11ABA646E AppForceShutdown
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

DA6C4250-BC95-45f0-AB49-CC4D605ECF41 ThreadStart
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TThreadID, ItemULongLong
    SystemThread, ItemULong
    ThreadCount, ItemULong
}

1DAE16A8-E038-46bc-B27A-8609E643099B ThreadTerminate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TThreadID, ItemULongLong
    SystemThread, ItemULong
    ThreadCount, ItemULong
}

6818FD0A-C7F3-406f-91F4-7600978CC3C9 ThreadBindToApt
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TThreadID, ItemULongLong
    AptID, ItemULongLong
    ActivitiesCount, ItemULong
    LowCount, ItemULong
}

440EA498-EB7E-4b70-A1E3-9A91861CD6C3 ThreadUnbind
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TThreadID, ItemULongLong
    AptID, ItemULongLong
    ActivitiesCount, ItemULong
}

E9EBBACC-7A92-40f3-80AF-783535CBD118 ThreadAssignApt
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    AptID, ItemULongLong
}

72502A15-B665-4f5b-A319-E395CCA92393 ThreadUnassignApt
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AptID, ItemULongLong
}

1E9E83C5-C5C8-4a2d-AB63-8469C296764B CreateInstance
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    CLSID, ItemGUID
    TSID, ItemGUID
    ContextID, ItemULongLong
    ObjectID, ItemULongLong
}

3A446C03-769E-4dca-8F59-8F5FA7761FAB DestroyInstance
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
}

3F2E0CEB-6C34-4ae2-9475-A01B086E8C60 TransactionStart
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
    TSID, ItemGUID
    Root, ItemBool
}

DA92FF99-95C0-43d5-9A7D-6C23C15E2FE7 TransactionPrepare
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
    VoteYes, ItemBool
}

BE2B8AA1-1FEF-4ded-907D-CDCE5849008E TransactionAbort
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
}

C67F7946-4630-4c77-B4F6-88C6ABE65F12 TransactionCommit
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
}

BAC5C1AE-009D-4e09-9A0A-FD88BB31A1E8 MethodCall
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    CLSID, ItemGUID
    IID, ItemGUID
    MethodIndex, ItemULong
}

F0B30BEC-DB18-478c-9221-EAA208CBB5AE MethodReturn
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    CLSID, ItemGUID
    IID, ItemGUID
    MethodIndex, ItemULong
    HResult, ItemLong
}

91D068A5-0B98-48f1-A0CF-AB8626CA5147 MethodException
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    CLSID, ItemGUID
    IID, ItemGUID
    MethodIndex, ItemULong
}

8FE5F194-CF29-4eff-A5AA-A54AD7F4F131 DisableCommit
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
}

37276016-0EBD-432a-8333-D84821AB3863 EnableCommit
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
}

AB095D80-3E83-4597-8007-00803D50DF86 SetComplete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
}

9A39AA4F-63DB-42ec-A59E-DD116F57A247 SetAbort
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
}

A6D75196-3DDC-4f35-9AB9-3CB121F28BAE Deactivate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
    ObjectID, ItemULongLong
}

B0CE0D5B-05EC-4380-B225-2EEDA3903042 Activate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
    ObjectID, ItemULongLong
}

7649AF3C-3E56-47b7-9596-876FADD36B5D ResourceCreate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    ResourceID, ItemULongLong
    ResType, ItemWChar[64]
    Enlisted, ItemBool
}

5BA81729-A69D-473e-B656-56C9C393A862 ResourceAllocate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    ResourceID, ItemULongLong
    ResType, ItemWChar[64]
    Enlisted, ItemBool
    NumRated, ItemULong
    Rating, ItemULong
}

4F0B170E-9065-4d5a-AD2C-7BFC0DAA0C93 ResourceRecycle
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    ResourceID, ItemULongLong
    ResType, ItemWChar[64]
}

58CDFE25-2DC0-485b-981C-7A0B39B96FAB ResourceDestroy
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    ResourceID, ItemULongLong
    HResult, ItemLong
    ResType, ItemWChar[64]
}

F96DE808-C2D7-43b3-8593-6BC1E772DB9B ResourceTrack
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    ResourceID, ItemULongLong
    ResType, ItemWChar[64]
    Enlisted, ItemBool
}

CD6D18FC-31F0-4304-A5DF-BA2A15840266 Authenticate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectID, ItemULongLong
    IID, ItemGUID
    MethodIndex, ItemULong
    CurrentUserImpersonationInproc, ItemBool
    LengthOrigUserSID, ItemULong
    LengthCrtUserSID, ItemULong
    SIDsBuffer, ItemVariant
}

03148C79-11DC-4b43-ACA3-65B11682CFF4 AuthenticateFail
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectID, ItemULongLong
    IID, ItemGUID
    MethodIndex, ItemULong
    CurrentUserImpersonationInproc, ItemBool
    LengthOrigUserSID, ItemULong
    LengthCrtUserSID, ItemULong
    SIDsBuffer, ItemVariant
}

9B3359DC-2B4C-46b4-A03A-7339AF71B765 ObjectConstruct
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    ObjectID, ItemULongLong
    ConstructString, ItemWChar[64]
}

C49B4FA9-20DF-4f48-82B2-C448DEF02DFC UserEvent
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Buffer, ItemVariant
}

90B8FED5-7EEF-4107-B791-8CF15B2117F3 ActivityCreate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
}

EDC039B9-84E7-4f69-937B-A08942719651 ActivityDestroy
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
}

43B68014-2B7E-47ae-AFC2-E54184CFF71F ActivityEnter
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Current, ItemGUID
    Entered, ItemGUID
    SystemThread, ItemULong
}

E7D21C91-3CBE-4340-B605-0EBB0FE32E2F ActivityTimeout
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Current, ItemGUID
    Entered, ItemGUID
    SystemThread, ItemULong
    Timeout, ItemULong
}

F2013085-1572-490b-93BE-BE3AB406955C ActivityReenter
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Current, ItemGUID
    SystemThread, ItemULong
    CallDepth, ItemULong
}

C589CFD4-D3AC-4cdd-B157-22C53234A63A ActivityLeave
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Current, ItemGUID
    Left, ItemGUID
}

53F94E5B-7F22-4d2b-A1CC-510BEF6FA833 ActivityLeaveSame
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Current, ItemGUID
    CallDepth, ItemULong
}

7172CA53-633A-4f56-A947-07567258849E IISRequestInfo
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    ClientIP, ItemWChar[16]
    ServerIP, ItemWChar[16]
    URL, ItemWChar[128]
}

4F0960DD-568B-4391-9F72-134C5670E7C8 QCRecord
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    Queue, ItemWChar[60]
    MsgID, ItemGUID
    Workflow, ItemGUID
    MSMQhresult, ItemLong
}

71925AE2-8133-425d-BF0D-21662BAFF1FC QCQueueOpen
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Queue, ItemWChar[60]
    QueueID, ItemULongULong
    MSMQhresult, ItemLong
}

71955D87-4448-4e7b-BA4E-7873C11AABA3 QCReceive
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    QueueID, ItemULongULong
    MsgID, ItemGUID
    Workflow, ItemGUID
    MSMQhresult, ItemLong
}

A00DC142-ED4F-49b1-8DAD-0241C08DFE1B QCReceiveFail
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    QueueID, ItemULongULong
    MSMQhresult, ItemLong
}

2C0D5D35-ED91-4c05-B7D2-0C833EAC7CF5 QCMoveToRetry
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    MsgID, ItemGUID
    Workflow, ItemGUID
    RetryIndex, ItemULong
}

C03BB7FF-6A7A-4019-B290-F4D07A873187 QCMoveToDead
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    MsgID, ItemGUID
    Workflow, ItemGUID
}

648D7C88-D207-4f90-8DE9-DA3159F25FF8 QCPlayback
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    MsgID, ItemGUID
    Workflow, ItemGUID
    MSMQhresult, ItemLong
}

4DFA5983-B413-45b3-AD0D-6493E903A645 ExceptionUser
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    Code, ItemULong
    Address, ItemULongULong
    StackTrace, ItemWChar[512]
}

57709B60-0EF0-4ea6-B415-CDDA1CDD35A9 CRMRecoveryStart
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

C45B18D3-FD16-4120-B396-58E9D64D59AB CRMRecoveryDone
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

C93490AC-B23F-408f-9C17-809B0EB86631 CRMCheckpoint
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

AB8FC323-CBB2-40b7-AFD3-558054E55848 CRMBegin
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
    ActivityGuid, ItemGUID
    TransactionGuid, ItemGUID
    ProgIdCompensator, ItemWChar[64]
    Description, ItemWChar[64]
}

3F50C4A1-D7F2-4e4e-BE35-BE31447D6316 CRMPrepare
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

6461B223-574D-42bc-A5B5-C42BC0A1BB1E CRMCommit
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

AA814AA8-2FF1-4e23-8279-3D024C817327 CRMAbort
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

E37629F4-3358-44e4-89C6-C0B7EB82A4B1 CRMInDoubt
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

B7BB1AE1-D8D5-469a-BF49-EF1AC3E73A9A CRMDone
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

7968E4E4-1E00-4e37-9BE4-8553FB661E16 CRMRelease
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

04876E17-C180-47e3-B855-5E0A1255EFA5 CRMAnalyze
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
    RecordType, ItemULong
    RecordSize, ItemULong
}

A1ECBE0E-FA1F-47d3-91DD-99AB5B92D3A1 CRMWrite
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
    Variants, ItemBool
    RecordSize, ItemULong
}

EE5D2FF2-811C-4fb1-9861-D44EA6E1E6A7 CRMForget
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

D7428814-30D3-4b7a-8C34-898722FCFA3A CRMForce
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
}

12DF1221-2D16-41de-B31F-0E03BBEFD448 CRMDeliver
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ClerkCLSID, ItemGUID
    Variants, ItemBool
    RecordSize, ItemULong
}

39AEDB9B-D2CE-4ffe-A0EC-F95DB80BAD27 AdmAppInstall
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    InstalledAppID, ItemGUID
    MSIPath, ItemWChar[256]
    DestinationPath, ItemWChar[256]
    UserName, ItemWChar[256]
    WithUsers, ItemBool
    WithSecurity, ItemBool
    Queued, ItemBool
    HResult, ItemLong
}

B36E4627-D28D-485f-A35C-29E08C4F4753 AdmAppCreate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    CreatedAppID, ItemGUID
    AppName, ItemWChar[512]
    HResult, ItemLong
}

45046ADC-3B2E-4e79-9208-6992EB00C4A5 AdmAppDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    DeletedAppID, ItemGUID
    HResult, ItemLong
}

0A750C63-CD91-4ee6-8091-867B86924E09 AdmAppUpdate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    UpdatedAppID, ItemGUID
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

4EF3D7D1-2A21-4a81-89E1-98B2A5DF4C55 AdmAppPaused
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    PausedAppID, ItemGUID
    Paused, ItemBool
    HResult, ItemLong
}

D77C881C-18E1-4165-9D9C-CA02DD4B7A0E AdmCompInstall
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    CompAppID, ItemGUID
    DLLPath, ItemWChar[256]
    TLBPath, ItemWChar[256]
    PSDLLPath, ItemWChar[256]
    CLSID, ItemGUID
    HResult, ItemLong
}

4DC56F75-D3AE-4e63-9CE0-3142CF4E4080 AdmCompImport
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    CompAppID, ItemGUID
    CLSID, ItemGUID
    ProgID, ItemWChar[64]
    HResult, ItemLong
}

7CF60AC4-6C26-495b-934E-47CCAE111BCF AdmCompDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    CompAppID, ItemGUID
    CLSID, ItemGUID
    HResult, ItemLong
}

7CD5BF83-CE9C-4a9d-936E-C8A751CAAB4F AdmCompUpdate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    CompAppID, ItemGUID
    CLSID, ItemGUID
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

C08BE4A9-79F4-46d4-949F-FBB73311EC13 AdmItfUpdate
#version        0
#type Event     0
{
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ItfAppID, ItemGUID
    CLSID, ItemGUID
    IID, ItemGUID
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

B2CD5095-BCE0-42b5-B550-59E5E1146F54 AdmMetUpdate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    MetAppID, ItemGUID
    CLSID, ItemGUID
    IID, ItemGUID
    MethodIndex, ItemULong
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

910BB3FA-E353-4953-A97F-A72E2574922C AdmRoleAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
}
8A28125E-D216-4d30-88A5-80B442F80216 AdmRoleDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

9B2A3DAD-2AA7-4beb-9EEE-5E7162B2E8EA AdmUserAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
    UserSID, ItemVariant
}

6EBEA049-5AD9-4b2a-AD28-F0375726AA23 AdmUserDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
    UserSID, ItemVariant
}

B6AB05B2-084A-4cfc-9E57-5C95E3A0889F AdmCompRoleAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    CLSID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

7B42E65E-1CAC-418b-B21C-43256A29B008 AdmCompRoleDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    CLSID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

7040B74F-A240-4251-8218-443F1270B971 AdmItfRoleAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    CLSID, ItemGUID
    IID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

94F8892C-520A-4816-895A-F62A2EA99B7F AdmItfRoleDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    CLSID, ItemGUID
    IID, ItemGUID
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

79677BFD-1AC0-455f-B2C1-A8983DA78AA2 AdmMetRoleAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    CLSID, ItemGUID
    IID, ItemGUID
    MethodIndex, ItemULong
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

F5FB4B1F-11FA-44c1-88BD-750F4CC2C8EC AdmMetRoleDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    RoleAppID, ItemGUID
    CLSID, ItemGUID
    IID, ItemGUID
    MethodIndex, ItemULong
    RoleName, ItemWChar[256]
    HResult, ItemLong
}

780B22BD-5244-4302-86BE-D57962CFD79A AdmMachineAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    MachineName, ItemWChar[512]
    HResult, ItemLong
}

09D87E55-022D-4851-8219-54ED25C4A5C6 AdmMachineDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    MachineName, ItemWChar[512]
    HResult, ItemLong
}

415FF65E-117D-488b-9A81-C6923E3ED8BE AdmMachineUpdate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    MachineName, ItemWChar[512]
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

A8BA53C5-3399-447d-B64F-09D50A9DFEAD AdmPermSubscriberAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    SubscrAppID, ItemGUID
    SubscriptionID, ItemGUID
    ECclsid, ItemGUID
    IID, ItemGUID
    MethodName, ItemWChar[256]
    Enabled, ItemBool
    SubscriberCLSID, ItemGUID
    HResult, ItemLong
}

DE05C3C4-ACEE-4fd7-B2C9-9A0764419E9B AdmPermSubscriberDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    SubscrAppID, ItemGUID
    SubscriptionID, ItemGUID
    HResult, ItemLong
}

5E47D7F3-6A36-4221-8033-5DF1B66B2A3B AdmPermSubscriberUpdate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    SubscrAppID, ItemGUID
    SubscriptionID, ItemGUID
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

C40DFD24-7B49-48eb-A21F-DB3235D1B4F6 AdmTransSubscriberAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    SubscriptionID, ItemGUID
    ECclsid, ItemGUID
    IID, ItemGUID
    MethodName, ItemWChar[256]
    Enabled, ItemBool
    HResult, ItemLong
}

1E49DDB6-C883-4cb3-9BC4-1332EDDBAE78 AdmTransSubscriberDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    SubscriptionID, ItemGUID
    HResult, ItemLong
}

3E6E2249-A249-4f54-A0D7-A97FB6162EFB AdmTransSubscriberUpdate
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    SubscriptionID, ItemGUID
    PropertyName, ItemWChar[64]
    NewValue, ItemWChar[1024]
    HResult, ItemLong
}

51B057F9-ACB8-4c8d-BE40-E9ED750EF034 AdmPartitionAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AddPartitionID, ItemGUID
    PartitionName, ItemWChar[512]
    HResult, ItemLong
}

8566E9C5-F387-4ecf-AA8D-D065B691732C AdmPartitionDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    DelPartitionID, ItemGUID
    HResult, ItemLong
}

12E58202-E6CD-4e17-B366-5AC3F37C00A8 AdmPartitionSetAdd
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AddPartitionSetID, ItemGUID
    PartitionSetName, ItemWChar[512]
    HResult, ItemLong
}

D55F48FD-17C6-4b12-AFD7-DEFC834CC488 AdmPartitionSetDelete
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    DelPartitionSetID, ItemGUID
    HResult, ItemLong
}

DC28009B-DA4E-4efa-9F95-205B21469A13 AppActivation2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
    InstanceID, ItemGUID
}

AE10D5F2-31B7-4a27-9B57-7A81E4BCDF4D AppShutdown2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

4B78B80C-494E-45e6-B7A6-BAFE5D7D9FF1 AppForceShutdown2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
}

AB4DF7DB-DB12-4139-8898-BD66C7D776DA AppPaused2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
    Paused, ItemBool
}

7D4287E8-23B2-41f5-B7FC-817634218A9E AppRecycle2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    AppID, ItemGUID
    InstanceID, ItemGUID
    Reason, ItemLong
}

E34AA4CB-32C4-4b62-8C05-B4762B217E68 TransactionStart2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
    TSID, ItemGUID
    Root, ItemBool
    IsolationLevel, ItemLong
}

F509A56C-5CFF-421f-8AA2-08A94323755C TransactionPrepare2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
    VoteYes, ItemBool
}

C9715D69-6CA8-4da7-9A28-A8E4FDEA5099 TransactionAbort2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
}

ABB8DCE4-6EAE-4f41-BF53-B70BDA428567 TransactionCommit2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    TransactionGuid, ItemGUID
}

25D668F5-15A1-4741-B72F-104C25FCB662 ObjPoolPutObject2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    Reason, ItemLong
    AvailableObjects, ItemULong
    ObjectID, ItemULongLong
}

E971B116-854E-420b-926E-AF6088AA07D8 ObjPoolGetObject2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectGuid, ItemGUID
    AvailableObjects, ItemULong
    ObjectID, ItemULongLong
    ForPartitionID, ItemGUID
}

5BF0E5EE-493F-4808-978D-C8001CAEA1A3 ObjPoolRecycleToTx2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectGuid, ItemGUID
    TransactionGuid, ItemGUID
    ObjectID, ItemULongLong
}

D7454176-0346-40b8-91FE-5923C67CBA42 ObjPoolGetFromTx2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    ObjectGuid, ItemGUID
    TransactionGuid, ItemGUID
    ObjectID, ItemULongLong
    ForPartitionID, ItemGUID
}

8FB0E7B4-97ED-410d-B988-16922032A368 ObjectConstruct2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectGuid, ItemGUID
    ObjectID, ItemULongLong
    ConstructString, ItemWChar[64]
    ForPartitionID, ItemGUID
}

085121E8-A3F7-4fa9-A9C4-07BC2B2C696F CreateInstance2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ActivityGuid, ItemGUID
    CLSID, ItemGUID
    TSID, ItemGUID
    ContextID, ItemULongLong
    ObjectID, ItemULongLong
    ForPartitionID, ItemGUID
}

773BA00D-0EFD-4a57-A309-86D3B4BEB114 DestroyInstance2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ContextID, ItemULongLong
}

CE0A98AB-6001-4552-A58E-B88313308A74 MethodCall2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    CLSID, ItemGUID
    IID, ItemGUID
    SystemThread, ItemULong
    MethodIndex, ItemULong
}

BCD15EFB-C30C-4a51-957F-1D89E984763A MethodReturn2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    CLSID, ItemGUID
    IID, ItemGUID
    SystemThread, ItemULong
    MethodIndex, ItemULong
    HResult, ItemLong
}

2A56A5E4-962C-4a78-BEFB-CFCD965F7B34 MethodException2
#version        0
#type Event     0
{
    ProcessId, ItemULong
    ApplicationID, ItemGUID
    PartitionID, ItemGUID
    AppInstanceID, ItemGUID
    ComputerName, ItemWChar[256]
    ObjectID, ItemULongLong
    CLSID, ItemGUID
    IID, ItemGUID
    SystemThread, ItemULong
    MethodIndex, ItemULong
}

//******************************************
// PERFLIB, LoadPerf, and PDH events
// 51af3adb-28b1-4ba5-b59a-3aeec16deb3c
// 275a79bb-9980-42ba-bafe-a92ded1192cf
// 51af3adf-28b1-4ba5-b59a-3aeec16deb3c
//******************************************
51af3adb-28b1-4ba5-b59a-3aeec16deb3c PERFLIB
{
    FileLine,   ItemULong,
    RtnStatus,  ItemULongX,
    OptArgs,    ItemOptArgs
}

275a79bb-9980-42ba-bafe-a92ded1192cf LoadPerf
{
    FileLine,   ItemULong,
    RtnStatus,  ItemULongX,
    OptArgs,    ItemOptArgs
}

51af3adf-28b1-4ba5-b59a-3aeec16deb3c PDH-Debug
{
    FileLine,   ItemULong,
    RtnStatus,  ItemULongX,
    OptArgs,    ItemOptArgs
}

//******************************************
// Exchange Events
// 2EACCEDF-8648-453e-9250-27F0069F71D2
//******************************************

31F5A811-6EA0-4321-93D9-CDB9A70D50A1 RPC
#version 0
#type None  0
#type Release   1
#type OpenFolder    2
#type OpenMessage   3
#type GetHierarchyTable 4
#type GetContentsTable  5
#type CreateMessage 6
#type GetPropsSpecific  7
#type GetPropsAll   8
#type GetPropList   9
#type SetProps  10
#type DeleteProps   11
#type SaveChangesMessage    12
#type NukeRecipients    13
#type FlushRecipients   14
#type ReadRecipients    15
#type ReloadCachedInfo  16
#type SetReadFlag   17
#type SetColumns    18
#type SortTable 19
#type Restrict  20
#type QueryRows 21
#type GetStatus 22
#type QueryPosition 23
#type SeekRow   24
#type SeekRowBookmark   25
#type SeekRowApprox 26
#type CreateBookmark    27
#type CreateFolder  28
#type DeleteFolder  29
#type DeleteMessages    30
#type GetMessageStatus  31
#type SetMessageStatus  32
#type GetAttachmentTable    33
#type OpenAttach    34
#type CreateAttach  35
#type DeleteAttach  36
#type SaveChangesAttach 37
#type SetReceiveFolder  38
#type GetReceiveFolder  39
#type SpoolerRules  40
#type RegisterNotification  41
#type Notify    42
#type OpenStream    43
#type ReadStream    44
#type WriteStream   45
#type SeekStream    46
#type SetSizeStream 47
#type SetSearchCriteria 48
#type GetSearchCriteria 49
#type SubmitMessage 50
#type MoveCopyMessages  51
#type AbortSubmit   52
#type MoveFolder    53
#type CopyFolder    54
#type QueryColumnsAll   55
#type Abort 56
#type CopyTo    57
#type CopyToStream  58
#type CloneStream   59
#type RegisterTableNotification 60
#type DeregisterTableNotification   61
#type GetACLTable   62
#type GetRulesTable 63
#type ModifyACL 64
#type ModifyRules   65
#type GetOwningMDBs 66
#type LtidFromId    67
#type IdFromLtid    68
#type FGhosted  69
#type OpenMessageProp   70
#type SetSpooler    71
#type SpoolerLockMsg    72
#type AddressTypes  73
#type TransportSend 74
#type FXSrcCopyMessages 75
#type FXSrcCopyFolder   76
#type FXSrcCopyTo   77
#type FXSrcGetBuffer    78
#type FindRow   79
#type Progress  80
#type XportNewMail  81
#type ValidAttachs  82
#type FXDstCopyConfig   83
#type FXDstPutBuffer    84
#type GetNamesFromIDs   85
#type GetIDsFromNames   86
#type UpdateDAMs    87
#type EmptyFolder   88
#type ExpandRow 89
#type CollapseRow   90
#type LockRegionStream  91
#type UnlockRegionStream    92
#type CommitStream  93
#type GetStreamSize 94
#type QryNamedProps 95
#type GetPerUserLtids   96
#type GetPerUserGuid    97
#type FlushPerUser  98
#type GetPerUser    99
#type SetPerUser    100
#type CacheCcnRead  101
#type SetReadFlags  102
#type CopyProps 103
#type GetReceiveFolderTable 104
#type FXSrcCopyProps    105
#type FXDstCopyProps    106
#type GetCollapseState  107
#type SetCollapseState  108
#type SetXport  109
#type Pending   110
#type OptionsData   111
#type IncrCfg   112
#type IncrState 113
#type ImportMsgChange   114
#type ImportHierChange  115
#type ImportDelete  116
#type UpldStStrmBegin   117
#type UpldStStrmContinue    118
#type UpldStStrmEnd 119
#type ImportMsgMove 120
#type SetPropsNoReplicate   121
#type DeletePropsNoReplicate    122
#type GetStoreState 123
#type GetRights 124
#type GetAllPerUserLtids    125
#type OpenCollect   126
#type GetLrepIds    127
#type ImportReads   128
#type ResetTable    129
#type FXGetIncrState    130
#type OpenAdvisor   131
#type RegICSNotifs  132
#type OpenCStream   133
#type TellVersion   134
#type OpenFolderByName  135
#type SetICSNotifGUID   136
#type FreeBookmark  137
#type DeleteFolderByName    138
#type ConfigNntpNewsfeed    139
#type CheckMsgIds   140
#type BeginNntpArticle  141
#type WriteNntpArticle  142
#type SaveNntpArticle   143
#type WriteCommitStream 144
#type HardDeleteMessages    145
#type HardEmptyFolder   146
#type SetLocalRepMidsetDeleted  147
#type End 200
#type BookmarkReturned  251
#type FidReturned   252
#type HsotReturned  253
#type Logon 254
#type BufferTooSmall    255

BBED5A34-6447-47c3-864A-6ED959545973 TaskQ
#version 0
#type Start     1
#type End       2
#type Dequeue   7

AC0D888F-D1B2-45c1-8CC9-2269FDD0DAA5 EIF
#version 0
#type Start     1
{
    HSOT, ItemULong
    UserName, ItemWString
    Function, ItemString
}
#type End       2
{
    Error Code, ItemULongX
}
#type LogonStart    10
{
    Guid 1, ItemULongLongX
    Guid 2, ItemULongLongX
}
#type LogonEnd      11
{
    HSOT, ItemULong
    UserName, ItemWString
    Error Code, ItemULongX
}
#type DoConnect     12
{
    Guid1, ItemULongX
    Guid2, ItemULongX
    Guid3, ItemULongX
    Guid4, ItemULongX
}
#type OpenFdrStart  14
{
    HSOT, ItemULong
    UserName, ItemWString
    Function, ItemString
}
#type OpenFdrEnd    15
{
    Error Code, ItemULongX
    HSOT, ItemULong
}
#type OpenURL       16
{
    HSOT, ItemULong
    UserName, ItemWString
    Function, ItemString
    URL, ItemWString
}


//******************************************
// PDH counter logfile events
// 933f3bb3-943e-490d-9ced-3cbb14c14479
//******************************************
933f3bb3-943e-490d-9ced-3cbb14c14479 PDH
#type Header    32
#type DataBlock 34
#type Catalog   35
#type Perflib   36
{
    LogFileGuid, ItemGUID
    BlockID,     ItemULong
    BlockCount,  ItemULong
}

//******************************************
// BROWSER Events
// Control guid is 5576F62E-4142-45a8-9516-262A510C13F0
//******************************************

2B992163-736F-4a68-9153-95BC5F34D884 Browse
#type UserInputReturn    10
#type UserInputBack      11
#type UserInputLButtonUp 12
#type UserInputPageDown  13
#type UserInputPageUp    14
#type StartFrame         16
{
}
#type LoadedParsed     18
#type LayoutExec       19
#type LayoutBackground 20
#type Paint            21
#type Address          22
{
    Url,  ItemWString
}

//******************************************
// Heap Events
// Control guid is 222962ab-6180-4b88-a825-346b75f2a24a
//******************************************


222962ab-6180-4b88-a825-346b75f2a24a Heap
#type Create 32
{ 
  HeapHandle,ItemPtr
  Flags,ItemULong
}
#type Alloc 33 
{
  HeapHandle,ItemPtr
  Size, ItemSizeT
  Address, ItemPtr
  Source, ItemULong
}
#type ReAlloc 34
{
  HeapHandle, ItemPtr
  NewAddress, ItemPtr
  OldAddress, ItemPtr
  NewSize, ItemSizeT
  OldSize, ItemSizeT
  Source, ItemULong
}
#type Destroy 35
{
    HeapHandle,ItemPtr
}
#type Free 36
{
  HeapHandle, ItemPtr
  Address, ItemPtr
  Source, ItemULong
}
#type Expand 37
{
  HeapHandle, ItemPtr
  CommittedSize, ItemSizeT
  Address, ItemPtr
  FreeSpace, ItemSizeT
  CommittedSpace, ItemSizeT
  ReservedSpace, ItemSizeT
  NoOfUCRs, ItemULong
}
#type SnapShot 38
{
  HeapHandle, ItemPtr
  Flags, ItemULong
  FreeSpace, ItemSizeT
  CommittedSpace, ItemSizeT
  ReservedSpace, ItemSizeT
}
#type Contract 42
{
  HeapHandle, ItemPtr
  DeCommitSize, ItemSizeT
  DeCommitAddress, ItemPtr
  FreeSpace, ItemSizeT
  CommittedSpace, ItemSizeT
  ReservedSpace, ItemSizeT
  NoOfUCRs, ItemULong
}
#type Lock 43
{ 
  HeapHandle,ItemPtr
}
#type Unlock 44
{
  HeapHandle,ItemPtr
}
#type Validate 45
{ 
  HeapHandle,ItemPtr
}
#type Walk 46
{ 
  HeapHandle,ItemPtr
}

//******************************************
// Critical Section Events
// Control guid is 3AC66736-CC59-4cff-8115-8DF50E39816B
//******************************************


3AC66736-CC59-4cff-8115-8DF50E39816B CriticalSection
#type Collision 34
{
  LockCount,ItemULong	
  SpinCount,ItemPtr	
  OwningThread,ItemPtr
  Address,ItemPtr	
}

#type Initialize 35
{
  SpinCount,ItemPtr	
  Address,ItemPtr	
}

//******************************************
// IIS Universal Listener Events
// Control guid is dd5ef90a-6398-47a4-ad34-4dcecdef795f
//******************************************

3c419e3d-1d18-415b-a91a-9b558938de4b  HttpRequest
#type Start 1
{
  RequestObj,    ItemPtr
  AddressType,   ItemTDIAddr
  RemoteAddress, ItemUnknown  
}

#type Parse 10
{
  RequestObj, ItemPtr
  HttpVerb,   ItemULong
  Url,        ItemWString
}

#type Deliver 11
{
  RequestObj,  ItemPtr
  RequestId,   ItemULongLong
  SiteId,      ItemULong
  AppPoolName, ItemWString
  Url,         ItemWString
}
#type End           2
#type RecvResp     12
#type RecvBody     13
#type CacheAndSend 15
#type FastResp     16
#type FastSend     17
#type ZeroSend     18
#type SendError    19
{
  RequestId, ItemULongLong
  HttpStatus, ItemUShort
}
#type CachedEnd    14
{
  RequestObj, ItemPtr
  SiteId, ItemULong
  BytesSent, ItemULong
}

//******************************************
// IIS6 W3Core.dll Events
// Control guid is 3a2a4e84-4c21-4981-ae10-3fda0d9b0f83
//******************************************

d42cf7ef-de92-473e-8b6c-621ea663113a   W3Server
#type Start  1
{
  RequestId, ItemULongLong
  BytesRecd, ItemULong
}

#type End          2
#type SendBody    16
#type SendResp    17
#type SendEntity  18
#type SendFilter  19
#type ErrSend     20
#type ErrSendEnt  21
#type ErrSendCtx  22
#type ErrVecSend  23
#type VectorSend  24
{
  RequestId, ItemULongLong
  BytesSent, ItemULong
}

#type FileReq 10
{
  RequestId, ItemULongLong
  FileName, ItemWString
}

#type CGIReq    11
#type ISAPIReq  12
{
  RequestId, ItemULongLong
}

#type OOPReq    13
{
  RequestId, ItemULongLong
  ProcessId, ItemULong
  TotalReq,  ItemULong
  CurrentReq, ItemULong
}

00237f0d-73eb-4bcf-a232-126693595847  W3Filter
#type Start  1
{
  RequestId, ItemULongLong
  FilterName, ItemWString
}

#type End    2
{
  RequestId, ItemULongLong
}

e2e55403-0d2e-4609-a470-be0da04013c0  W3Cgi
#type Start 1
#type End 2
{
  RequestId, ItemULongLong
}

//******************************************
// IIS6 W3Isapi.dll Events
// Control guid is a1c2040e-8840-4c31-ba11-9871031a19ea
//******************************************

2e94e6c7-eda0-4b73-9010-2529edce1c27  W3Isapi
#type Start 1
{
  RequestId, ItemULongLong
  connID,    ItemPtr
  fOop,      ItemULong
}

#type End       2
#type SendHdr   10
#type SendHdrEx 11
#type VectorSend 12
#type ErrorSend  13
#type SsfSend    14
#type SsdError   15
{
  RequestId, ItemULongLong
  connID,    ItemPtr
}

//******************************************
// IIS6 strmfil.dll Events
// Control guid is 1fbecc45-c060-4e7c-8a0e-0dbd6116181b
//******************************************
0ecf983b-7115-4b77-a543-95d138ee4400  StrmFilt
#type Start 1
#type End   2
{
}

d353dc2d-3e55-4b88-a4ac-183c368362a3  SslHandShake
#type Start 1
#type End   2
{
}

//******************************************
// Active Server Pages (ASP) Events
// Control guid is 06b94d9a-b15e-456e-a4ef-37c984a2cb4b
//******************************************

1fc299fa-3fc4-4c37-910d-de5b911d0270  AspReq
#type Start 1
#type End   2
{
  ConnID, ItemPtr
}

//******************************************
// ASP.NET Events
// Control guid is aff081fe-0247-4275-9c4e-021f3dc1da35
//******************************************

06a01367-79d3-4594-8eb3-c721603c4679  AspNetReq
#type Start 1
#type End   2
{
  ConnID, ItemPtr
}

//******************************************
// Custom ISAPI extension Events
//******************************************

71bda656-663c-4eae-977a-a749f1fa0fcd  CustomIsapiExt
#type Start 1
#type End   2
{
  ConnID, ItemPtr
}
