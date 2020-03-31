, consider
//        combining this mof with the mof the defines the class
//        that this provider provides.
//
//===================================================================

#pragma autorecover
#pragma classflags("forceupdate")

#pragma namespace ("\\\\.\\Root\\Default")


//*************************************************************
//***   Registers Framework Provider                        ***
//*************************************************************
instance of __Win32Provider as $P
{
    Name = "SystemRestoreProv";
    ClsId = "{a47401f6-a8a6-40ea-9c29-b8f6026c98b8}";
    ImpersonationLevel=1;
    HostingModel="NetworkServiceHost";
};

instance of __InstanceProviderRegistration
{
    Provider = $P;
    SupportsGet = TRUE;
    SupportsPut = TRUE;
    SupportsDelete = FALSE;
    SupportsEnumeration = TRUE;
    QuerySupportLevels = NULL;
};

instance of __MethodProviderRegistration
{
    Provider = $P;
};


[Dynamic, Provider ("SystemRestoreProv")] 
class SystemRestore
{
    [read, write]
    String Description;

    [read, write]
    uint32 RestorePointType;

    [read, write]
    uint32 EventType;

    [read, write, key]
    uint32 SequenceNumber;

    [read, write]
    String CreationTime;
    
    [Implemented, static, Description(
    "The CreateRestorePoint method creates a restore point."
    "It returns a COM error code.")]
    uint32 CreateRestorePoint([In] String Description, [In] uint32 RestorePointType, [In] uint32 EventType );

    [Implemented, static, Description(
    "The Enable method enables SR on a drive."
    "It returns a COM error code.")]
    uint32 Enable([In] String Drive, [In] Boolean WaitTillEnabled);

    [Implemented, static, Description(
    "The Disable method disables SR on a drive."
    "It returns a COM error code.")]
    uint32 Disable([In] String Drive);

    [Implemented, static, Description(
    "The Restore method restores the system to a specified restore point."
    "It returns a COM error code.")]
    uint32 Restore([In] uint32 SequenceNumber);

    [Implemented, static, Description(
    "Returns the status (0=fail, 1=success, 2=interrupted) of the last restore.")]
    uint32 GetLastRestoreStatus();
    
};


[DYNPROPS]
class SystemRestoreConfig {

    [KEY]  STRING  MyKey;
    uint32 RPSessionInterval;
    uint32 RPGlobalInterval;  
    uint32 RPLifeInterval;
    uint32 DiskPercent;
};

[DYNPROPS]
instance of SystemRestoreConfig
{
  MyKey = "SR";

  [PropertyContext("local|hkey_local_Machine\\software\\microsoft\\windows nt\\currentversion\\systemrestore|RPSessionInterval"), Dynamic, Provider("RegPropProv")]  RPSessionInterval;
  [PropertyContext("local|hkey_local_Machine\\software\\microsoft\\windows nt\\currentversion\\systemrestore|RPGlobalInterval"), Dynamic, Provider("RegPropProv")]  RPGlobalInterval;
  [PropertyContext("local|hkey_local_Machine\\software\\microsoft\\windows nt\\currentversion\\systemrestore|RPLifeInterval"), Dynamic, Provider("RegPropProv")]  RPLifeInterval;
  [PropertyContext("local|hkey_local_Machine\\software\\microsoft\\windows nt\\currentversion\\systemrestore\\cfg|DiskPercent"), Dynamic, Provider("RegPropProv")]  DiskPercent;
};

