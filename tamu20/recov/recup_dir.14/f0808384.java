'SysmonLogManager.Component.1'
	}
	NoRemove CLSID
	{
		ForceRemove {7478EF62-8C46-11d1-8D99-00A0C913CAD4} = s 'Component Class'
		{
			ProgID = s 'SysmonLogManager.Component.1'
			VersionIndependentProgID = s 'SysmonLogManager.Component'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
HKCR
{
	SysmonLogManager.Snapin Extension.1 = s 'ComponentData Class'
	{
		CLSID = s '{7478EF65-8C46-11d1-8D99-00A0C913CAD4}'
	}
	SysmonLogManager.Snapin Extension = s 'ComponentData Class'
	{
		CurVer = s 'SysmonLogManager.Snapin Extension.1'
	}
	NoRemove CLSID
	{
		ForceRemove {7478EF65-8C46-11d1-8D99-00A0C913CAD4} = s 'ComponentData Class'
		{
			ProgID = s 'SysmonLogManager.Snapin Extension.1'
			VersionIndependentProgID = s 'SysmonLogManager.Snapin Extension'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
