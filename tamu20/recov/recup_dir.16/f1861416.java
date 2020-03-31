E%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{2E73E231-6A73-429F-AC58-4592BCCD6AC5}'
		}
	}
}
HKCR
{
	LogonMgr.LogonNotificationListeners.1 = s 'LogonNotificationListeners Class'
	{
		CLSID = s '{6083DF56-2A09-4d05-B29B-F92888639D93}'
	}
	LogonMgr.LogonNotificationListeners = s 'LogonNotificationListeners Class'
	{
		CLSID = s '{6083DF56-2A09-4d05-B29B-F92888639D93}'
		CurVer = s 'LogonMgr.LogonNotificationListeners.1'
	}
	NoRemove CLSID
	{
		ForceRemove {6083DF56-2A09-4d05-B29B-F92888639D93} = s 'LogonNotificationListeners Class'
		{
			ProgID = s 'LogonMgr.LogonNotificationListeners.1'
			VersionIndependentProgID = s 'LogonMgr.LogonNotificationListeners'
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
	LogonMgr.FixOESMTP.1 = s 'FixOESMTP Class'
	{
		CLSID = s '{ee5eaa45-8dee-4154-bf0c-8632dddd4985}'
	}
	LogonMgr.FixOESMTP = s 'FixOESMTP Class'
	{
		CLSID = s '{ee5eaa45-8dee-4154-bf0c-8632dddd4985}'
		CurVer = s 'LogonMgr.FixOESMTP.1'
	}
	NoRemove CLSID
	{
		ForceRemove {ee5eaa45-8dee-4154-bf0c-8632dddd4985} = s 'FixOESMTP Class'
		{
			ProgID = s 'LogonMgr.FixOESMTP.1'
			VersionIndependentProgID = s 'LogonMgr.FixOESMTP'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{ee5eaa45-8dee-4154-bf0c-8632dddd4985}'
		}
	}
}
HKCR
{
	LogonMgr.LaunchIE.1 = s 'LaunchIE Class'
	{
		CLSID = s '{414b9bb8-75d8-4d2c-b544-8af1575cdd2e}'
	}
	LogonMgr.LaunchIE = s 'LaunchIE Class'
	{
		CLSID = s '{414b9bb8-75d8-4d2c-b544-8af1575cdd2e}'
		CurVer = s 'LogonMgr.LaunchIE.1'
	}
	NoRemove CLSID
	{
		ForceRemove {414b9bb8-75d8-4d2c-b544-8af1575cdd2e} = s 'LaunchIE Class'
		{
			ProgID = s 'LogonMgr.LaunchIE.1'
			VersionIndependentProgID = s 'LogonMgr.LaunchIE'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{414b9bb8-75d8-4d2c-b544-8af1575cdd2e}'
		}
	}
}
