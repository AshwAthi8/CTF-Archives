            uint8 updateUIMd5Hash[];
                        string pathToEnableOnAccessUI;
                        string enableOnAccessUIParameters;
                        uint8 enableOnAccessUIMd5Hash[];
                        string companyName;
                        string versionNumber;
};

class FirewallProduct
{
        [key, Not_Null] string instanceGuid;
        [Not_Null]      string displayName;
        [Not_Null]      boolean enabled;
                        string pathToEnableUI;
                        string enableUIParameters;
                        uint8 enableUIMd5Hash[];
                        string companyName;
                        string versionNumber;
};

