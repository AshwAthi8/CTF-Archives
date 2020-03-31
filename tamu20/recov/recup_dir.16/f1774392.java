1D1-8F00-00C04FC2C17B} = s 'ComponentDataImpl Class'
		{
			ProgID = s 'COMSNAP.ComponentDataImpl.1'
			VersionIndependentProgID = s 'COMSNAP.ComponentDataImpl'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}

HKLM 
{
	NoRemove Software
	{
		NoRemove Microsoft
		{
			NoRemove MMC
			{
				NoRemove Snapins
				{
					{C9BC92DF-5B9A-11D1-8F00-00C04FC2C17B} = s 'Component Services Snapin' 
					{
						val NameString = s '%SNAPINNAME%'
						val About = s '{D7FCB63B-5C55-11D1-8F00-00C04FC2C17B}'
						val NameStringIndirect = s '@comres.dll,-659'
						NodeTypes
						{
							{0442836C-C770-11d1-87F4-00C04FC2C17B} = s 'Static Node'
							{
							}

							{0442836D-C770-11d1-87F4-00C04FC2C17B} = s 'Computer Node'
							{
							}

							{0442836E-C770-11d1-87F4-00C04FC2C17B} = s 'Component Node'
							{
							}

							{0442836F-C770-11d1-87F4-00C04FC2C17B} = s 'Generic Node'
							{
							}
						}
						StandAlone
					}
				}
				NoRemove NodeTypes
				{
					{0442836C-C770-11d1-87F4-00C04FC2C17B} = s 'Component Services Static Node'
					{
					}

					{0442836D-C770-11d1-87F4-00C04FC2C17B} = s 'Component Services Computer Node'
					{
					}
					
					{0442836E-C770-11d1-87F4-00C04FC2C17B} = s 'Component Services Component Node'
					{
					}
					
					{0442836F-C770-11d1-87F4-00C04FC2C17B} = s 'Component Services Generic Node'
					{
					}
				}
			}
		}
	}
}
