RTCFrame.1'
	}
	NoRemove CLSID
	{
		ForceRemove {6791163E-FE42-4293-B062-C60C27B6E21B} = s 'RTCFrame Class'
		{
			ProgID = s 'RTCClient.RTCFrame.1'
			VersionIndependentProgID = s 'RTCClient.RTCFrame'
			ForceRemove 'Programmable'
			val AppID = s '{DDB27AD4-99E2-4BE0-9337-9DB6EABB3848}'
			'TypeLib' = s '{C9E1C357-CD07-4E79-9048-6C724B224F3B}'
		}
	}
}
