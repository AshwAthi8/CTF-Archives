-9E90DED7EC91} = s 'SpFileStream Class'
		{
			ProgID = s 'SAPI.SpFileStream.1'
			VersionIndependentProgID = s 'SAPI.SpFileStream'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}
HKCR
{
	SAPI.SpMemoryStream.1 = s 'SpMemoryStream Class'
	{
		CLSID = s '{5FB7EF7D-DFF4-468a-B6B7-2FCBD188F994}'
	}
	SAPI.SpMemoryStream = s 'SpMemoryStream Class'
	{
		CLSID = s '{5FB7EF7D-DFF4-468a-B6B7-2FCBD188F994}'
		CurVer = s 'SAPI.SpMemoryStream.1'
	}
	NoRemove CLSID
	{
		ForceRemove {5FB7EF7D-DFF4-468a-B6B7-2FCBD188F994} = s 'SpMemoryStream Class'
		{
			ProgID = s 'SAPI.SpMemoryStream.1'
			VersionIndependentProgID = s 'SAPI.SpMemoryStream'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}
HKCR
{
	SAPI.SpInProcRecoContext.1 = s 'SpInProcRecoContext Class'
	{
		CLSID = s '{73AD6842-ACE0-45E8-A4DD-8795881A2C2A}'
	}
	SAPI.SpInProcRecoContext = s 'SpInProcRecoContext Class'
	{
		CLSID = s '{73AD6842-ACE0-45E8-A4DD-8795881A2C2A}'
		CurVer = s 'SAPI.SpInProcRecoContext.1'
	}
	NoRemove CLSID
	{
		ForceRemove {73AD6842-ACE0-45E8-A4DD-8795881A2C2A} = s 'SpInProcRecoContext Class'
		{
			ProgID = s 'SAPI.SpInProcRecoContext.1'
			VersionIndependentProgID = s 'SAPI.SpInProcRecoContext'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
			'TypeLib' = s '{C866CA3A-32F7-11D2-9602-00C04F8EE628}'
		}
	}
}
MSFT