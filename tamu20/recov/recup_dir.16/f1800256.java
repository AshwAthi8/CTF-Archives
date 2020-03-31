titionNotify = s 'CPartitionNotify Class'
	{
		CurVer = s 'COMSNAP.CPartitionNotify.1'
	}

	NoRemove CLSID
	{
		ForceRemove {a00e1768-4a9b-4d97-afc6-99d329f605f2} = s 'CPartitionNotify Class'
		{
			ProgID = s 'COMSNAP.CPartitionNotify.1'
			VersionIndependentProgID = s 'COMSNAP.CPartitionNotify'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
