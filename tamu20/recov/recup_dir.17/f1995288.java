
	}
}
HKCR
{
	SmartStart.SmartStart.1 = s 'SmartStart Class'
	{
		CLSID = s '{5D8D8F1A-8B89-11D1-ADDB-0000F87734F0}'
	}
	SmartStart.SmartStart = s 'SmartStart Class'
	{
		CurVer = s 'SmartStart.SmartStart.1'
	}
	NoRemove CLSID
	{
		ForceRemove {5D8D8F1A-8B89-11D1-ADDB-0000F87734F0} = s 'SmartStart Class'
		{
			ProgID = s 'SmartStart.SmartStart.1'
			VersionIndependentProgID = s 'SmartStart.SmartStart'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			ForceRemove 'Control'
			ForceRemove 'Programmable'
			ForceRemove 'ToolboxBitmap32' = s '%MODULE%, 1'
			'MiscStatus' = s '0'
			{
			    '1' = s '132497'
			}
			'TypeLib' = s '{1E7949FA-86F4-11D1-ADD8-0000F87734F0}'
			'Version' = s '1.0'
		}
	}
}
