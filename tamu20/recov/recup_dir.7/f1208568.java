            'TypeLib' = s '{95CEDD63-2E34-4B84-9FB3-F86AF1D4BF7A}'
                }

                ForceRemove {4EC4272E-2E6F-4EEB-91D0-EBC4D58E8DEE} = s 'Wia Class'
                {
                        ProgID = s 'Wia.Script.1'
                        VersionIndependentProgID = s 'Wia.Script'
                        ForceRemove 'Programmable'
                        InprocServer32 = s '%MODULE%'
                        {
                                val ThreadingModel = s 'Apartment'
                        }
                        'TypeLib' = s '{95CEDD63-2E34-4B84-9FB3-F86AF1D4BF7A}'
                }

        }
}
