
    NoRemove CLSID
    {
        ForceRemove {4C6F940C-3CFE-11D2-9EE7-00C04F797396} = s 'SpTaskManager Class'
        {
            InprocServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Both'
            }
        }
    }
}
