          uint32  Status;
                        uint32  ErrorCode;
};

//******************** password, lockout, kerberos, and other policies *****************

class RSOP_SecuritySettingNumeric : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  KeyName = NULL;
                        uint32  Setting;
};

class RSOP_SecuritySettingBoolean : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  KeyName = NULL;
                        boolean Setting;
};

class RSOP_SecuritySettingString : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  KeyName = NULL;
                        string  Setting;
};


//******************** RSOP_AuditPolicy ************************************

class RSOP_AuditPolicy : RSOP_SecuritySettings
{
        [key]           uint32  precedence = 0;
        [key]           string  Category = NULL;
        [NotNull]       boolean Success;
        [NotNull]       boolean Failure;
};

//******************** Esc_EventLog ***************************************

class RSOP_SecurityEventLogSettingNumeric : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  KeyName = NULL;
     [key]              string  Type = NULL;
                        uint32  Setting;
};

class RSOP_SecurityEventLogSettingBoolean : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  KeyName = NULL;
     [key]              string  Type = NULL;
                        boolean Setting;
};

//******************** rsop_RegistryValue ***************************************

class RSOP_RegistryValue : RSOP_SecuritySettings
{
        [key]           uint32  precedence = 0;
        [key]           string  Path = NULL;
        [ValueMap {"1","2","3","4","7"}, Values {"REG_SZ", "REG_EXPAND_SZ", "REG_BINARY", "REG_DWORD", "REG_MULTI_SZ"}, NotNull]
                        uint32      Type;
        [NotNull]       string  Data;
};

//******************** RSOP_UserPrivilegeRight **********************************

class RSOP_UserPrivilegeRight : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  UserRight;
                        string  AccountList[];
};

//******************** RSOP_RestrictedGroup **********************************

class RSOP_RestrictedGroup : RSOP_SecuritySettings
{
     [key]              uint32  precedence = 0;
     [key]              string  GroupName = NULL;
                        string  Members[];
};

//******************** RSOP_SystemService *************************************

class RSOP_SystemService : RSOP_SecuritySettings
{
        [key]           uint32  precedence = 0;
        [key]           string  Service = NULL;
        [ValueMap {"2", "3", "4"}, Values {"Automatic", "Manual", "Disabled"}]
                        uint32  StartupMode;
                        string  SDDLString;
};

//******************** RSOP_Object *************************************

class RSOP_File : RSOP_SecuritySettings
{
        [key]           uint32  precedence = 0;
        [key]           string  Path = NULL;
                        string  OriginalPath;
        [Values {"Inherit", "Ignore", "Overwrite"}]
                        uint32  Mode;
                        string  SDDLString;
};

class RSOP_RegistryKey : RSOP_SecuritySettings
{
        [key]           uint32  precedence = 0;
        [key]           string  Path;
        [Values {"Inherit", "Ignore", "Overwrite"}]
                        uint32  Mode;
                        string  SDDLString;
};


