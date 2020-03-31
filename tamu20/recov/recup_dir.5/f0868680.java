NoRemove CLSID
	{
		ForceRemove {9B2719DD-B696-11D0-A489-00C04FD91AC0} = s 'SdpConferenceBlob Class'
		{
			ProgID = s 'SdpConferenceBlob.SdpConferenceBlob.1'
			VersionIndependentProgID = s 'SdpConferenceBlob.SdpConferenceBlob'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
