en.1'
    }
    NoRemove CLSID
    {
        ForceRemove {EF411752-3736-4CB4-9C8C-8EF4CCB58EFE} = s 'SpObjectToken Class'
        {
            ProgID = s 'SAPI.SpObjectToken.1'
            VersionIndependentProgID = s 'SAPI.SpObjectToken'
            InprocServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Both'
            }
            'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
        }
    }
}
