r = s 'QC.DLQListener.1'
	}
	NoRemove CLSID
	{
		ForceRemove {ecabafca-7f19-11d2-978e-0000f8757e2a} = s 'QC Dead Letter Queue Listener Class'
		{
			ProgID = s 'QC.DLQListener.1'
			VersionIndependentProgID = s 'QC.DLQListener'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}