mat = s 'SpAudioFormat Class'
	{
		CLSID = s '{9EF96870-E160-4792-820D-48CF0649E4EC}'
		CurVer = s 'SAPI.SpAudioFormat.1'
	}
	NoRemove CLSID
	{
		ForceRemove {9EF96870-E160-4792-820D-48CF0649E4EC} = s 'SpAudioFormat Class'
		{
			ProgID = s 'SAPI.SpAudioFormat.1'
			VersionIndependentProgID = s 'SAPI.SpAudioFormat'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}