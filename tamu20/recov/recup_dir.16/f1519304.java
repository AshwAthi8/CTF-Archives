ore.RTCClient = s 'RTCClient Class'
	{
		CLSID = s '{7a42ea29-a2b7-40c4-b091-f6f024aa89be}'
	}
	NoRemove CLSID
	{
		ForceRemove {7a42ea29-a2b7-40c4-b091-f6f024aa89be} = s 'RTCClient Class'
		{
			ProgID = s 'RTCCore.RTCClient.1'
			VersionIndependentProgID = s 'RTCCore.RTCClient'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
		}
	}
}
