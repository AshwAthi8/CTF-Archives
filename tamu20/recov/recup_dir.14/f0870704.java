ID = s 'Wiaacmgr.EventPrompt'
                        LocalServer32 = s '%MODULE%'
                        val AppID = s '{E32549C4-C2B8-4BCC-90D7-0FC3511092BB}'
                        'TypeLib' = s '{80D45A3E-3CD8-4FF4-9E99-43A2109049D6}'
                }
        }
}

HKCR
{
        Wiaacmgr.StiEventHandler.1 = s 'StiEventHandler Class'
        {
                CLSID = s '{8144B6F5-20A8-444a-B8EE-19DF0BB84BDB}'
        }
        Wiaacmgr.StiEventHandler = s 'StiEventHandler Class'
        {
                CLSID = s '{8144B6F5-20A8-444a-B8EE-19DF0BB84BDB}'
                CurVer = s 'Wiaacmgr.StiEventHandler.1'
        }
        NoRemove CLSID
        {
                ForceRemove {8144B6F5-20A8-444a-B8EE-19DF0BB84BDB} = s 'StiEventHandler Class'
                {
                        ProgID = s 'Wiaacmgr.StiEventHandler.1'
                        VersionIndependentProgID = s 'Wiaacmgr.StiEventHandler'
                        LocalServer32 = s '%MODULE%'
                        val AppID = s '{E32549C4-C2B8-4BCC-90D7-0FC3511092BB}'
                        'TypeLib' = s '{80D45A3E-3CD8-4FF4-9E99-43A2109049D6}'
                }
        }
}

