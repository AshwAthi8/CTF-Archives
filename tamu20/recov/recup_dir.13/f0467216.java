 CLSID
	{
		ForceRemove {BC94D813-4D7F-11d2-A8C9-00AA00A71DCA} = s 'SdoService Class'
		{
			ProgID = s 'IAS.SdoService.1'
			VersionIndependentProgID = s 'IAS.SdoService'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Free'
			}
		}
	}
}
