	CLSID = s '{D2D139E3-B6CA-11d1-9F31-00C04FC29D52}'
	}
	ForceRemove JRO.Replica = s 'Replica Class'
	{
		CLSID = s '{D2D139E3-B6CA-11d1-9F31-00C04FC29D52}'
		CurVer = s 'JRO.Replica.2.6'
	}
	NoRemove CLSID
	{
		{D2D139E3-B6CA-11d1-9F31-00C04FC29D52} = s 'Replica Class'
		{
			ProgID = s 'JRO.Replica.2.6'
			VersionIndependentProgID = s 'JRO.Replica'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
