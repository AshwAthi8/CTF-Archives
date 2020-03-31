	}
	NoRemove CLSID
	{
		ForceRemove {5858107D-11EA-47B1-9694-3F29F7680FB8} = s 'DirectSoundFXDistortionPage Class'
		{
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
