         }
            ForceRemove 'Control'
            ForceRemove 'Programmable'
            ForceRemove 'ToolboxBitmap32' = s '%MODULE%, 1'
            'MiscStatus' = s '0'
            {
                '1' = s '131473'
            }
            'TypeLib' = s '{8C11EFA1-92C3-11D1-BC1E-00C04FA31489}'
            'Version' = s '2.0'
        }
    }
}
HKCR
{
    MsTscAx.MsTscAx.4 = s 'MsTscAx Class v4'
    {
        CLSID = s '{ace575fd-1fcf-4074-9401-ebab990fa9de}'
    }
    MsTscAx.MsTscAx = s 'MsTscAx Class v4'
    {
        CurVer = s 'MsTscAx.MsTscAx.4'
    }
    NoRemove CLSID
    {
        ForceRemove {ace575fd-1fcf-4074-9401-ebab990fa9de} = s 'Microsoft RDP Client Control'
        {
            ProgID = s 'MsTscAx.MsTscAx.4'
            VersionIndependentProgID = s 'MsTscAx.MsTscAx'
            ForceRemove 'Programmable'
            InprocServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Apartment'
            }
            ForceRemove 'Control'
            ForceRemove 'Programmable'
            ForceRemove 'ToolboxBitmap32' = s '%MODULE%, 1'
            'MiscStatus' = s '0'
            {
                '1' = s '131473'
            }
            'TypeLib' = s '{8C11EFA1-92C3-11D1-BC1E-00C04FA31489}'
            'Version' = s '2.0'
        }
    }
}
HKCR
{
    MsTscAx.MsTscAx.5 = s 'MsTscAx Class v5'
    {
        CLSID = s '{6AE29350-321B-42be-BBE5-12FB5270C0DE}'
    }
    MsTscAx.MsTscAx = s 'MsTscAx Class v5'
    {
        CurVer = s 'MsTscAx.MsTscAx.5'
    }
    NoRemove CLSID
    {
        ForceRemove {6AE29350-321B-42be-BBE5-12FB5270C0DE} = s 'Microsoft RDP Client Control'
        {
            ProgID = s 'MsTscAx.MsTscAx.5'
            VersionIndependentProgID = s 'MsTscAx.MsTscAx'
            ForceRemove 'Programmable'
            InprocServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Apartment'
            }
            ForceRemove 'Control'
            ForceRemove 'Programmable'
            ForceRemove 'ToolboxBitmap32' = s '%MODULE%, 1'
            'MiscStatus' = s '0'
            {
                '1' = s '131473'
            }
            'TypeLib' = s '{8C11EFA1-92C3-11D1-BC1E-00C04FA31489}'
            'Version' = s '2.0'
        }
    }
}
