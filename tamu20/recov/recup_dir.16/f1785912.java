SI Class'
	{
		CLSID = s '{298942A3-C0FE-11D1-8D87-0060088F38C8}'
	}
	NoRemove CLSID
	{
		ForceRemove {298942A3-C0FE-11D1-8D87-0060088F38C8} = s 'GenerateMSI Class'
		{
			ProgID = s 'MSIGen.GenerateMSI.1'
			VersionIndependentProgID = s 'MSIGen.GenerateMSI'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'both'
			}
		}
	}
}
