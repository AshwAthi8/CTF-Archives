              CLSID = s '{ecabafce-7f19-11d2-978e-0000f8757e2a}'
        }
        COMSVCS.TrkInfoObjUnmarshal = s 'Tracking Info Object Unmarshal Class'
        {
                CurVer = s 'COMSVCS.TrkInfoCollUnmarshal.1'
        }
        NoRemove CLSID
        {
                ForceRemove {ecabafce-7f19-11d2-978e-0000f8757e2a} = s 'Tracking Info Object Unmarshal Class'
                {
                        ProgID = s 'COMSVCS.TrkInfoObjUnmarshal.1'
                        VersionIndependentProgID = s 'COMSVCS.TrkInfoObjUnmarshal'
                        ForceRemove 'Programmable'
                        InprocServer32 = s '%MODULE%'
                        {
                                val ThreadingModel = s 'Both'
                        }
                }
        }
}