 'UPnPService Class'
	{
		CLSID = s '{C624BA95-FBCB-4409-8C03-8CCEEC533EF1}'
	}
	UPnP.UPnPService = s 'UPnPService Class'
	{
		CLSID = s '{C624BA95-FBCB-4409-8C03-8CCEEC533EF1}'
		CurVer = s 'UPnP.UPnPService.1'
	}
	NoRemove CLSID
	{
		ForceRemove {C624BA95-FBCB-4409-8C03-8CCEEC533EF1} = s 'UPnPService Class'
		{
			ProgID = s 'UPnP.UPnPService.1'
			VersionIndependentProgID = s 'UPnP.UPnPService'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{DB3442A7-A2E9-4A59-9CB5-F5C1A5D901E5}'
		}
	}
}
