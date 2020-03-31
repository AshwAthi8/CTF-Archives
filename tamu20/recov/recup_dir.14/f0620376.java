HKCR
{
	ForceRemove .lwv = s 'LWVFile'
	ForceRemove LWVFile = s 'Microsoft Linguistically Enhanced Sound File'
	{
		DefaultIcon = s '%MODULE%,-133'
	}
	NoRemove CLSID
	{
		ForceRemove {D45FD31C-5C6E-11D1-9EC1-00C04FD7081F} = s 'MSLwvTTS 2.0 Engine Class'
		{
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}

		NoRemove {95A893C3-543A-11D0-AC45-00C04FD97575} = s 'MSLwvTTS Engine Class'
		{
			TreatAs = s '{D45FD31C-5C6E-11D1-9EC1-00C04FD7081F}'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
