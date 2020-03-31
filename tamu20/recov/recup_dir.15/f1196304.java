27-2BBDC30CD0E1}'
	}
	HNetCfg.NATUPnP = s 'NATUPnP Class'
	{
		CLSID = s '{AE1E00AA-3FD5-403C-8A27-2BBDC30CD0E1}'
		CurVer = s 'HNetCfg.NATUPnP.1'
	}
	NoRemove CLSID
	{
		ForceRemove {AE1E00AA-3FD5-403C-8A27-2BBDC30CD0E1} = s 'Home Networking NAT Traversal via UPnP Configuration Manager'
		{
			ProgID = s 'HNetCfg.NATUPnP.1'
			VersionIndependentProgID = s 'HNetCfg.NATUPnP'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{1C565858-F302-471E-B409-F180AA4ABEC6}'
		}
	}
}
