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
