
	}
	Mmedia.AsyncPProt.1 = s 'AsyncPProt Class'
	{
		CLSID = s '{3DA2AA3B-3D96-11D2-9BD2-204C4F4F5020}'
	}
	Mmedia.AsyncPProt = s 'AsyncPProt Class'
	{
		CLSID = s '{3DA2AA3B-3D96-11D2-9BD2-204C4F4F5020}'
		CurVer = s 'Mmedia.AsyncPProt.1'
	}
	NoRemove CLSID
	{
		ForceRemove {3DA2AA3B-3D96-11D2-9BD2-204C4F4F5020} = s 'AsyncPProt Class'
		{
			ProgID = s 'Mmedia.AsyncPProt.1'
			VersionIndependentProgID = s 'Mmedia.AsyncPProt'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{22D6F304-B0F6-11D0-94AB-0080C74C7E95}'
		}
	}
}
