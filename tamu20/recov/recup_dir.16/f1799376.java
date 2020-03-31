30-00c04fb9473f} = s 'STClient Class'
		{
			ProgID = s 'STClient.STClient.1'
			VersionIndependentProgID = s 'STClient.STClient'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
