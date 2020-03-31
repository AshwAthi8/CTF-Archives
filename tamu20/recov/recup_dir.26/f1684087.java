
	}
}
HKCR
{
	SAPI.SpNotifyTranslator.1 = s 'SpNotifyTranslator Class'
	{
		CLSID = s '{E2AE5372-5D40-11D2-960E-00C04F8EE628}'
	}
	SAPI.SpNotifyTranslator = s 'SpNotifyTranslator Class'
	{
		CLSID = s '{E2AE5372-5D40-11D2-960E-00C04F8EE628}'
		CurVer = s 'SAPI.SpNotifyTranslator.1'
	}
	NoRemove CLSID
	{
		ForceRemove {E2AE5372-5D40-11D2-960E-00C04F8EE628} = s 'SpNotifyTranslator Class'
		{
			ProgID = s 'SAPI.SpNotifyTranslator.1'
			VersionIndependentProgID = s 'SAPI.SpNotifyTranslator'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}
HKCR
{
	SAPI.SpSharedRecoContext.1 = s 'SpSharedRecoContext Class'
	{
		CLSID = s '{47206204-5ECA-11D2-960F-00C04F8EE628}'
	}
	SAPI.SpSharedRecoContext = s 'SpSharedRecoContext Class'
	{
		CLSID = s '{47206204-5ECA-11D2-960F-00C04F8EE628}'
		CurVer = s 'SAPI.SpSharedRecoContext.1'
	}
	NoRemove CLSID
	{
		ForceRemove {47206204-5ECA-11D2-960F-00C04F8EE628} = s 'SpSharedRecoContext Class'
		{
			ProgID = s 'SAPI.SpSharedRecoContext.1'
			VersionIndependentProgID = s 'SAPI.SpSharedRecoContext'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}
HKCR
{
	SAPI.SpInprocRecognizer.1 = s 'SpInprocRecognizer Class'
	{
		CLSID = s '{41B89B6B-9399-11D2-9623-00C04F8EE628}'
	}
	SAPI.SpInprocRecognizer = s 'SpInprocRecognizer Class'
	{
		CLSID = s '{41B89B6B-9399-11D2-9623-00C04F8EE628}'
		CurVer = s 'SAPI.SpInprocRecognizer.1'
	}
	NoRemove CLSID
	{
		ForceRemove {41B89B6B-9399-11D2-9623-00C04F8EE628} = s 'SpInprocRecognizer Class'
		{
			ProgID = s 'Sapi.SpInprocRecognizer.1'
			VersionIndependentProgID = s 'Sapi.SpInprocRecognizer'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}

	SAPI.SpSharedRecognizer.1 = s 'SpSharedRecognizer Class'
	{
		CLSID = s '{3BEE4890-4FE9-4A37-8C1E-5E7E12791C1F}'
	}
	SAPI.SpSharedRecognizer = s 'SpSharedRecognizer Class'
	{
		CLSID = s '{3BEE4890-4FE9-4A37-8C1E-5E7E12791C1F}'
		CurVer = s 'SAPI.SpSharedRecognizer.1'
	}
	NoRemove CLSID
	{
		ForceRemove {3BEE4890-4FE9-4A37-8C1E-5E7E12791C1F} = s 'SpSharedRecognizer Class'
		{
			ProgID = s 'Sapi.SpSharedRecognizer.1'
			VersionIndependentProgID = s 'Sapi.SpSharedRecognizer'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}
