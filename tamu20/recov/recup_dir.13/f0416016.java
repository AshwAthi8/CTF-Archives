eCall Class'
		{
			ProgID = s 'RequestMakeCall.RequestMakeCall.1'
			VersionIndependentProgID = s 'RequestMakeCall.RequestMakeCall'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
