6EC-406A-9C61-20E891BC37F7} = s 'RASettingProperty Class'
		{
			ProgID = s 'RACplDlg.RASettingProperty.1'
			VersionIndependentProgID = s 'RACplDlg.RASettingProperty'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{5190C4AF-AB0F-4235-B12F-D5A8FA3F854B}'
		}
	}
}
HKCR
{
	RACplDlg.RARegSetting.1 = s 'RARegSetting Class'
	{
		CLSID = s '{70FF37C0-F39A-4B26-AE5E-638EF296D490}'
	}
	RACplDlg.RARegSetting = s 'RARegSetting Class'
	{
		CLSID = s '{70FF37C0-F39A-4B26-AE5E-638EF296D490}'
		CurVer = s 'RACplDlg.RARegSetting.1'
	}
	NoRemove CLSID
	{
		ForceRemove {70FF37C0-F39A-4B26-AE5E-638EF296D490} = s 'RARegSetting Class'
		{
			ProgID = s 'RACplDlg.RARegSetting.1'
			VersionIndependentProgID = s 'RACplDlg.RARegSetting'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{5190C4AF-AB0F-4235-B12F-D5A8FA3F854B}'
		}
	}
}
HKCR
{
	RACplDlg.RAEventLog.1 = s 'RAEventLog Class'
	{
		CLSID = s '{4fadcfea-0971-4575-a368-a2de9d2ed07d}'
	}
	RACplDlg.RAEventLog = s 'RAEventLog Class'
	{
		CLSID = s '{4fadcfea-0971-4575-a368-a2de9d2ed07d}'
		CurVer = s 'RACplDlg.RAEventLog.1'
	}
	NoRemove CLSID
	{
		ForceRemove {4fadcfea-0971-4575-a368-a2de9d2ed07d} = s 'RAEventLog Class'
		{
			ProgID = s 'RACplDlg.RAEventLog.1'
			VersionIndependentProgID = s 'RACplDlg.RAEventLog'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{5190C4AF-AB0F-4235-B12F-D5A8FA3F854B}'
		}
	}
}
MSFT