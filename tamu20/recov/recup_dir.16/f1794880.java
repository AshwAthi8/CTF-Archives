
	{
		CurVer = s 'Mts.MtsGrp.1'
	}
	NoRemove CLSID
	{
		ForceRemove {4B2E958D-0393-11D1-B1AB-00AA00BA3258} = s 'MtsGrp Class'
		{
			ProgID = s 'Mts.MtsGrp.1'
			VersionIndependentProgID = s 'Mts.MtsGrp'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Free'
			}
		}
	}
}
