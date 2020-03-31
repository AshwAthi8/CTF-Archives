Register the provider.
instance of __Win32Provider as $Provider
{
    Name    = "CmdTriggerConsumer";
    ClsId   = "{797ef3b3-127b-4283-8096-1e8084bf67a6}";
    HostingModel = "LocalSystemHost";
    ImpersonationLevel = 1;
    PerUserInitialization = TRUE;
};    

// register the provider as method provider
instance of __MethodProviderRegistration
{
    Provider = $Provider;
};

// register the provider as consumer provider
instance of __EventConsumerProviderRegistration
{
    Provider = $Provider;
    ConsumerClassNames = { "CmdTriggerConsumer" };
};

//define the provider class with the properties and the methods which it supports.
[ provider( "CmdTriggerConsumer" ) ]
class CmdTriggerConsumer : __EventConsumer
{
    // properties
    [ key ] uint32 TriggerID;
    [ read ] string TriggerName;
    [ read ] string Action;
    [ read ] string ScheduledTaskName;
    [ read, write ] string TriggerDesc;

     // methods    
    [ implemented, static ]
    uint32 CreateETrigger( [ IN ] string TriggerName,
                           [ IN ] string TriggerDesc,
                           [ IN ] string TriggerAction,
                           [ IN ] string TriggerQuery,
                           [ IN ] string RunAsUser,
                           [ IN ] string RunAsPwd );
    [implemented, static]
    uint32 DeleteETrigger( [ IN ] string TriggerName );

    [implemented, static]
    uint32 QueryETrigger( [ IN ]  string ScheduledTaskName,
                          [ OUT ] string RunAsUser );

    [ implemented, static ]
    uint32 CreateETriggerEx( [ IN ] string TriggerName,
                           [ IN ] string TriggerDesc,
                           [ IN ] string TriggerAction,
                           [ IN ] string TriggerQuery,
                           [ IN ] string RunAsUser,
                           [ IN ] string RunAsPwd );
    [implemented, static]
    uint32 DeleteETriggerEx( [ IN ] string TriggerName );

    [implemented, static]
    uint32 QueryETriggerEx( [ IN ]  string ScheduledTaskName,
                          [ OUT ] string RunAsUser );

};
