0004"
                } 
    ]
    uint32 Flags;
};


[Dynamic,
 Description("MSMQ: XACT_General"),
 guid("{8fda2bbd-347e-493c-b7d1-6b6fed88ce04}"),
 locale("MS\\0x409")]
class MSMQ_XACT:EventTrace
{
    [Description ("Enable Flags"),
        ValueDescriptions{
                "error flag",
                "warning flag",
                "info flag" },
        Values{
                "error",
                "warning",
                "info"}, 
        ValueMap{
                "0x00000001",
                "0x00000002",
                "0x00000004"
                } 
    ]
    uint32 Flags;
};


[Dynamic,
 Description("MSMQ: XACT_Send"),
 guid("{485c37b0-9a15-4a2e-82e0-8e8c3a7b8234}"),
 locale("MS\\0x409")]
class MSMQ_XACT_SEND:EventTrace
{
    [Description ("Enable Flags"),
        ValueDescriptions{
                "error flag",
                "warning flag",
                "info flag" },
        Values{
                "error",
                "warning",
                "info"}, 
        ValueMap{
                "0x00000001",
                "0x00000002",
                "0x00000004"
                } 
    ]
    uint32 Flags;
};


[Dynamic,
 Description("MSMQ: XACT_Receive"),
 guid("{7c916009-cf80-408b-9d91-9c2960118be9}"),
 locale("MS\\0x409")]
class MSMQ_XACT_RCV:EventTrace
{
    [Description ("Enable Flags"),
        ValueDescriptions{
                "error flag",
                "warning flag",
                "info flag" },
        Values{
                "error",
                "warning",
                "info"}, 
        ValueMap{
                "0x00000001",
                "0x00000002",
                "0x00000004"
                } 
    ]
    uint32 Flags;
};


[Dynamic,
 Description("MSMQ: XACT_Log"),
 guid("{1ac9b316-5b4e-4bbd-a2c9-1e70967a6fe1}"),
 locale("MS\\0x409")]
class MSMQ_XACT_LOG:EventTrace
{
    [Description ("Enable Flags"),
        ValueDescriptions{
                "error flag",
                "warning flag",
                "info flag" },
        Values{
                "error",
                "warning",
                "info"}, 
        ValueMap{
                "0x00000001",
                "0x00000002",
                "0x00000004"
                } 
    ]
    uint32 Flags;
};


[Dynamic,
 Description("MSMQ: Log"),
 guid("{a13ec7bb-d592-4b93-80da-c783f9708bd4}"),
 locale("MS\\0x409")]
class MSMQ_LOG:EventTrace
{
    [Description ("Enable Flags"),
        ValueDescriptions{
                "error flag",
                "warning flag",
                "info flag" },
        Values{
                "error",
                "warning",
                "info"}, 
        ValueMap{
                "0x00000001",
                "0x00000002",
                "0x00000004"
                } 
    ]
    uint32 Flags;
};


[Dynamic,
 Description("MSMQ: Profiling"),
 guid("{71625F6D-559A-49c6-BA21-0AEB260DB97B}"),
 locale("MS\\0x409")]
class MSMQ_PROFILING:EventTrace
{
    [Description ("Enable Flags"),
        ValueDescriptions{
                "error flag",
                "warning flag",
                "info flag" },
        Values{
                "error",
                "warning",
                "info"}, 
        ValueMap{
                "0x00000001",
                "0x00000002",
                "0x00000004"
                } 
    ]
    uint32 Flags;
};


