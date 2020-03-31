dpointsTable = s 'EndpointsTable Class'
    {
        CurVer = s 'EndpointsTable.EndpointsTable.1'
    }
    NoRemove CLSID
    {
        ForceRemove {2F94D7B0-BF63-11D1-A6A2-00C04FB9988E} = s 'EndpointsTable Class'
        {
            ProgID = s 'EndpointsTable.EndpointsTable.1'
            VersionIndependentProgID = s 'EndpointsTable.EndpointsTable'
            ForceRemove 'Programmable'
            InprocServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Both'
            }
        }
    }
}
