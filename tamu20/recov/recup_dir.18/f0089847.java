ete Network.SharedAccessConnectionUi.1
    Delete Network.SharedAccessConnectionUi
    NoRemove CLSID
    {
        ForceRemove {7007ACD5-3202-11D1-AAD2-00805FC1270E} = s 'Shared Access Connection UI Class'
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

