HKCR
{
	NoRemove CLSID
	{
		ForceRemove {97103AE5-6248-4E04-97B5-36663159967C} = s 'Windows Media Player WMEncTunerPropPage Class'
		{
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
