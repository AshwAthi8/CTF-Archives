 '{3F151A12-0CE7-11D1-81F9-00C04FC99D4C}'
	}
	dsTView.dsTView = s 'dsTView Class'
	{
		CurVer = s 'dsTView.dsTView.1'
	}
	NoRemove CLSID
	{
		ForceRemove {3F151A12-0CE7-11D1-81F9-00C04FC99D4C} = s 'dsTView Class'
		{
			ProgID = s 'dsTView.dsTView.1'
			VersionIndependentProgID = s 'dsTView.dsTView'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'MiscStatus' = s '0'
			{
			    '1' = s '131473'
			}
			'TypeLib' = s '{3F151A04-0CE7-11D1-81F9-00C04FC99D4C}'
			'Version' = s '1.0'
		}
	}
}
