yTemplateManager Class'
	{
		CLSID = s '{E6CB9CC0-2290-4588-A2E8-2C8CF0F90130}'
		CurVer = s 'SchemaManager.PolicyTemplateManager.1'
	}
	NoRemove CLSID
	{
		ForceRemove {E6CB9CC0-2290-4588-A2E8-2C8CF0F90130} = s 'PolicyTemplateManager Class'
		{
			ProgID = s 'SchemaManager.PolicyTemplateManager.1'
			VersionIndependentProgID = s 'SchemaManager.PolicyTemplateManager'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{1856AD2E-6F53-4EA2-B76D-B6D7FA07C391}'
		}
	}
}
