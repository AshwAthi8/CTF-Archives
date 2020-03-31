 '{CFADAC85-E12C-11D1-B34C-00C04F990D54}'
	}
	NoRemove CLSID
	{
		ForceRemove {CFADAC85-E12C-11D1-B34C-00C04F990D54} = s 'ComClientExport Class'
		{
			ProgID = s 'ClientExp.ComClientExport.1'
			VersionIndependentProgID = s 'ClientExp.ComClientExport'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'both'
			}
		}
	}
}
