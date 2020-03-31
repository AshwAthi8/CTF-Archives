7e2a}'
	}
	EventPublisher.EventPublisher = s 'EventPublisher Class'
	{
		CurVer = s 'EventPublisher.EventPublisher.1'
	}
	NoRemove CLSID
	{
		ForceRemove {ecabafbc-7f19-11d2-978e-0000f8757e2a} = s 'EventPublisher Class'
		{
			ProgID = s 'EventPublisher.EventPublisher.1'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Free'
			}
		}
	}
}
HKCR
{
	Mts.MtsGrp.1 = s 'MtsGrp Class'
	{
		CLSID = s '{4B2E958D-0393-11D1-B1AB-00AA00BA3258}'
	}
	Mts.MtsGrp = s 'MtsGrp Class'
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
