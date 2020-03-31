			ProgID = s 'SccCOM.SCardManage.1'
			VersionIndependentProgID = s 'SccCOM.SCardManage'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	SccCOM.SCardAuth.1 = s 'SCardAuth Class'
	{
		CLSID = s '{A80F1102-D1F8-11d0-B5C5-00A024297ED9}'
	}
	SccCOM.SCardAuth = s 'SCardAuth Class'
	{
		CurVer = s 'SccCOM.SCardAuth.1'
	}
	NoRemove CLSID
	{
		ForceRemove {A80F1102-D1F8-11d0-B5C5-00A024297ED9} = s 'SCardAuth Class'
		{
			ProgID = s 'SccCOM.SCardAuth.1'
			VersionIndependentProgID = s 'SccCOM.SCardAuth'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	SccCOM.SCardVerify.1 = s 'SCardVerify Class'
	{
		CLSID = s '{A80F1104-D1F8-11d0-B5C5-00A024297ED9}'
	}
	SccCOM.SCardVerify = s 'SCardVerify Class'
	{
		CurVer = s 'SccCOM.SCardVerify.1'
	}
	NoRemove CLSID
	{
		ForceRemove {A80F1104-D1F8-11d0-B5C5-00A024297ED9} = s 'SCardVerify Class'
		{
			ProgID = s 'SccCOM.SCardVerify.1'
			VersionIndependentProgID = s 'SccCOM.SCardVerify'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
HKCR
{
	SccCOM.SCardFileAccess.1 = s 'SCardFileAccess Class'
	{
		CLSID = s '{A80F1103-D1F8-11d0-B5C5-00A024297ED9}'
	}
	SccCOM.SCardFileAccess = s 'SCardFileAccess Class'
	{
		CurVer = s 'SccCOM.SCardFileAccess.1'
	}
	NoRemove CLSID
	{
		ForceRemove {A80F1103-D1F8-11d0-B5C5-00A024297ED9} = s 'SCardFileAccess Class'
		{
			ProgID = s 'SccCOM.SCardFileAccess.1'
			VersionIndependentProgID = s 'SccCOM.SCardFileAccess'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Both'
			}
		}
	}
}
MSFT