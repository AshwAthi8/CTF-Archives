 = s '{ecabafc4-7f19-11d2-978e-0000f8757e2a}'
		CurVer = s 'QC.ListenerHelper.1'
	}
	NoRemove CLSID
	{
		ForceRemove {ecabafc4-7f19-11d2-978e-0000f8757e2a} = s 'QCListener Helper Class'
		{
			ProgID = s 'QC.ListenerHelper.1'
			VersionIndependentProgID = s 'QC.ListenerHelper'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
