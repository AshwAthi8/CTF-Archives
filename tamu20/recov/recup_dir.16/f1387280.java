E9-4072-98BE-6CCAEB79DC6F} = s 'SmartRenderEngine Class'
		{
			ProgID = s 'qedit.SmartRenderEngine.1'
			VersionIndependentProgID = s 'qedit.SmartRenderEngine'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
