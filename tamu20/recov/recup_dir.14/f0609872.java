'
		CurVer = s 'AccDictionary.AccDictionary.1'
	}
	NoRemove CLSID
	{
		ForceRemove {6572EE16-5FE5-4331-BB6D-76A49C56E423} = s 'AccDictionary Class'
		{
			ProgID = s 'AccDictionary.AccDictionary.1'
			VersionIndependentProgID = s 'AccDictionary.AccDictionary'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{0EF20641-8773-4B65-955C-C12C206EB86C}'
		}
	}
}
