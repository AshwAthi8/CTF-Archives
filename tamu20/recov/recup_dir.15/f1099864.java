            CurVer = s 'CompatUI.SelectFile.1'
        }
        NoRemove CLSID
        {
                ForceRemove {66CBC149-A49F-48F9-B17A-6A3EA9B42A87} = s 'SelectFile Class'
                {
                        ProgID = s 'CompatUI.SelectFile.1'
                        VersionIndependentProgID = s 'CompatUI.SelectFile'
                        ForceRemove 'Programmable'
                        InprocServer32 = s '%MODULE%'
                        {
                                val ThreadingModel = s 'Apartment'
                        }
                        ForceRemove 'Control'
                        ForceRemove 'ToolboxBitmap32' = s '%MODULE%, 105'
                        'MiscStatus' = s '4096'
                        {
                            '1' = s '131473'
                        }
                        'TypeLib' = s '{233A5627-7755-4B36-AA00-656B8846F501}'
                        'Version' = s '1.0'
                }
        }
}
