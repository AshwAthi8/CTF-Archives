nternetConnectionUi
    NoRemove CLSID
    {
        ForceRemove {7007ACC4-3202-11D1-AAD2-00805FC1270E} = s 'Internet Connection UI Class'
        {
            Delete ProgID
            Delete VersionIndependentProgID
            InProcServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Both'
            }
        }
    }
}

