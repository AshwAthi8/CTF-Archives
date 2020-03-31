
			VersionIndependentProgID = s 'ADOMD.CubeDef'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	ForceRemove ADOMD.Dimension.1 = s 'Dimension Class'
	{
		CLSID = s '{228136D6-8BD3-11D0-B4EF-00A0C9138CA4}'
	}
	ForceRemove ADOMD.Dimension = s 'Dimension Class'
	{
		CurVer = s 'ADOMD.Dimension.1'
	}
	NoRemove CLSID
	{
		{228136D6-8BD3-11D0-B4EF-00A0C9138CA4} = s 'Dimension Class'
		{
			ProgID = s 'ADOMD.Dimension.1'
			VersionIndependentProgID = s 'ADOMD.Dimension'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	ForceRemove ADOMD.Hierarchy.1 = s 'Hierarchy Class'
	{
		CLSID = s '{228136DB-8BD3-11D0-B4EF-00A0C9138CA4}'
	}
	ForceRemove ADOMD.Hierarchy = s 'Hierarchy Class'
	{
		CurVer = s 'ADOMD.Hierarchy.1'
	}
	NoRemove CLSID
	{
		{228136DB-8BD3-11D0-B4EF-00A0C9138CA4} = s 'Hierarchy Class'
		{
			ProgID = s 'ADOMD.Hierarchy.1'
			VersionIndependentProgID = s 'ADOMD.Hierarchy'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	ForceRemove ADOMD.Property.1 = s 'Property Class'
	{
		CLSID = s '{22813740-8BD3-11D0-B4EF-00A0C9138CA4}'
	}
	ForceRemove ADOMD.Property = s 'Property Class'
	{
		CurVer = s 'ADOMD.Property.1'
	}
	NoRemove CLSID
	{
		{22813740-8BD3-11D0-B4EF-00A0C9138CA4} = s 'Property Class'
		{
			ProgID = s 'ADOMD.Property.1'
			VersionIndependentProgID = s 'ADOMD.Property'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	ForceRemove ADOMD.NewObject.1 = s 'NewObject Class'
	{
		CLSID = s '{2281374E-8BD3-11D0-B4EF-00A0C9138CA4}'
	}
	ForceRemove ADOMD.NewObject = s 'NewObject Class'
	{
		CurVer = s 'ADOMD.NewObject.1'
	}
	NoRemove CLSID
	{
		{2281374E-8BD3-11D0-B4EF-00A0C9138CA4} = s 'NewObject Class'
		{
			ProgID = s 'ADOMD.NewObject.1'
			VersionIndependentProgID = s 'ADOMD.NewObject'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
