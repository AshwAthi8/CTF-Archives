	CLSID = s '{C0BC4B4A-A406-4EFC-932F-B8546B8100CC}'
		CurVer = s 'UPnP.UPnPServices.1'
	}
	NoRemove CLSID
	{
		ForceRemove {C0BC4B4A-A406-4EFC-932F-B8546B8100CC} = s 'UPnPServices Class'
		{
			ProgID = s 'UPnP.UPnPServices.1'
			VersionIndependentProgID = s 'UPnP.UPnPServices'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{DB3442A7-A2E9-4A59-9CB5-F5C1A5D901E5}'
		}
	}
}
