0-948F91510A85}'
	}
	SAPI.SpDSAudioOut = s 'SpDSAudioOut Class'
	{
		CLSID = s '{731C35DE-E39A-40E4-B110-948F91510A85}'
		CurVer = s 'SAPI.SpDSAudioOut.1'
	}
	NoRemove CLSID
	{
		ForceRemove {731C35DE-E39A-40E4-B110-948F91510A85} = s 'SpDSAudioOut Class'
		{
			ProgID = s 'SAPI.SpDSAudioOut.1'
			VersionIndependentProgID = s 'SAPI.SpDSAudioOut'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{264FC6E5-26BE-428a-9185-1FB6DAD1928C}'
		}
	}
}
HKCR
{
    SAPI.SpDSAudioEnum.1 = s 'SpDSAudioEnum Class'
    {
        CLSID = s '{AB1890A1-E91F-11D2-BB91-00C04F8EE6C0}'
    }
    SAPI.SpDSAudioEnum = s 'SpDSAudioEnum Class'
    {
        CLSID = s '{AB1890A1-E91F-11D2-BB91-00C04F8EE6C0}'
        CurVer = s 'SAPI.SpDSAudioEnum.1'
    }
    NoRemove CLSID
    {
        ForceRemove {AB1890A1-E91F-11D2-BB91-00C04F8EE6C0} = s 'SpDSAudioEnum Class'
        {
            ProgID = s 'SAPI.SpDSAudioEnum.1'
            VersionIndependentProgID = s 'SAPI.SpDSAudioEnum'
            InprocServer32 = s '%MODULE%'
            {
                val ThreadingModel = s 'Both'
            }
            'TypeLib' = s '{264FC6E5-26BE-428a-9185-1FB6DAD1928C}'
        }
    }
}

HKLM
{
    NoRemove SOFTWARE
    {
        NoRemove Microsoft
        {
            NoRemove Speech
            {
                NoRemove AudioInput
                {
                    NoRemove TokenEnums
                    {
                        NoRemove DSoundAudioIn
                        {
                            val 'CLSID' = s '{AB1890A1-E91F-11D2-BB91-00C04F8EE6C0}'
                        }
                    }
                }
                NoRemove AudioOutput
                {
                    NoRemove TokenEnums
                    {
                        NoRemove DSoundAudioOut
                        {
                            val 'CLSID' = s '{AB1890A1-E91F-11D2-BB91-00C04F8EE6C0}'
                        }
                    }
                }
            }
        }
    }
}
