eRemove {7007ACC2-3202-11D1-AAD2-00805FC1270E} = s 'Direct Connection UI Class'
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

