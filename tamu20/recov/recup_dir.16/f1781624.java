CLSID = s '{2A005C11-A5DE-11CF-9E66-00AA00A3F464}'
	}
	MTxSpm.SharedPropertyGroupManager = s 'PropGroupManagerObject Class'
	{
		CurVer = s 'MTxSpm.SharedPropertyGroupManager.1'
	}
	NoRemove CLSID
	{
		ForceRemove {2A005C11-A5DE-11CF-9E66-00AA00A3F464} = s 'PropGroupManagerObject Class'
		{
			ProgID = s 'MTxSpm.SharedPropertyGroupManager.1'
			VersionIndependentProgID = s 'MTxSpm.SharedPropertyGroupManager'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
