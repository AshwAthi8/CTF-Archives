Ver = s 'RightsManager.MSRightsManager.1'
	}
	NoRemove CLSID
	{
		ForceRemove {2D3F78D4-824C-4F9A-A4BA-2073D9280E6A} = s 'MSRightsManager Class'
		{
			ProgID = s 'RightsManager.MSRightsManager.1'
			VersionIndependentProgID = s 'RightsManager.MSRightsManager'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{C5DBB75E-0320-4E7B-B779-986D133B0112}'
		}
	}
}
