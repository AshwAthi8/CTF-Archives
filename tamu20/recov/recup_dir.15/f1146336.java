prp.DirectSoundFXI3DL2ReverbPage.1'
	}
	NoRemove CLSID
	{
		ForceRemove {D3952B77-2D22-4B72-8DF4-BA267A9C12D0} = s 'DirectSoundFXI3DL2ReverbPage Class'
		{
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
