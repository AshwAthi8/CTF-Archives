000-C724B378BAD9}'
	}
	LogonMgr.SicilyAuthenticator = s 'SicilyAuthenticator Class'
	{
		CLSID = s '{9DD8309D-1798-4836-8000-C724B378BAD9}'
		CurVer = s 'LogonMgr.SicilyAuthenticator.1'
	}
	NoRemove CLSID
	{
		ForceRemove {9DD8309D-1798-4836-8000-C724B378BAD9} = s 'SicilyAuthenticator Class'
		{
			ProgID = s 'LogonMgr.SicilyAuthenticator.1'
			VersionIndependentProgID = s 'LogonMgr.SicilyAuthenticator'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{2E73E231-6A73-429F-AC58-4592BCCD6AC5}'
		}
	}
}
HKCR
{
	LogonMgr.PassportAuthenticator.1 = s 'PassportAuthenticator Class'
	{
		CLSID = s '{2201FC00-15E0-11d4-B052-00409575855B}'
	}
	LogonMgr.PassportAuthenticator = s 'PassportAuthenticator Class'
	{
		CLSID = s '{2201FC00-15E0-11d4-B052-00409575855B}'
		CurVer = s 'LogonMgr.PassportAuthenticator.1'
	}
	NoRemove CLSID
	{
		ForceRemove {2201FC00-15E0-11d4-B052-00409575855B} = s 'PassportAuthenticator Class'
		{
			ProgID = s 'LogonMgr.PassportAuthenticator.1'
			VersionIndependentProgID = s 'LogonMgr.PassportAuthenticator'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{2E73E231-6A73-429F-AC58-4592BCCD6AC5}'
		}
	}
}
HKCR
{
	LogonMgr.FilteringAuthenticator.1 = s 'FilteringAuthenticator Class'
	{
		CLSID = s '{3296BAC7-F333-437b-A81A-65CA1D0135DF}'
	}
	LogonMgr.FilteringAuthenticator = s 'FilteringAuthenticator Class'
	{
		CLSID = s '{3296BAC7-F333-437b-A81A-65CA1D0135DF}'
		CurVer = s 'LogonMgr.FilteringAuthenticator.1'
	}
	NoRemove CLSID
	{
		ForceRemove {3296BAC7-F333-437b-A81A-65CA1D0135DF} = s 'FilteringAuthenticator Class'
		{
			ProgID = s 'LogonMgr.FilteringAuthenticator.1'
			VersionIndependentProgID = s 'LogonMgr.FilteringAuthenticator'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{2E73E231-6A73-429F-AC58-4592BCCD6AC5}'
		}
	}
}
HKCR
{
	LogonMgr.MessengerLogon.1 = s 'MessengerLogon Class'
	{
		CLSID = s '{567D349E-F453-48c9-AB44-A4CE3AE84DF2}'
	}
	LogonMgr.MessengerLogon = s 'MessengerLogon Class'
	{
		CLSID = s '{567D349E-F453-48c9-AB44-A4CE3AE84DF2}'
		CurVer = s 'LogonMgr.MessengerLogon.1'
	}
	NoRemove CLSID
	{
		ForceRemove {567D349E-F453-48c9-AB44-A4CE3AE84DF2} = s 'MessengerLogon Class'
		{
			ProgID = s 'LogonMgr.MessengerLogon.1'
			VersionIndependentProgID = s 'LogonMgr.MessengerLogon'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{567D349E-F453-48c9-AB44-A4CE3AE84DF2}'
		}
	}
}

