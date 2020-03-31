0}
					{
						NoRemove Extensions
						{
							NoRemove NameSpace
							{
								val {74E5637A-B98C-11D1-9B9B-00E02C064C39} =
								s 'Local MSMQ Administration'
							}
						}
						NoRemove 'Dynamic Extensions'
						{
							val {74E5637A-B98C-11D1-9B9B-00E02C064C39} =
							s 'MSMQ Admin'
						}
					}

					NoRemove {9a0dc343-c100-11d1-bbc5-0080c76670c0}
					{
						NoRemove Extensions
						{
							NoRemove NameSpace
							{
								val {74E5637A-B98C-11D1-9B9B-00E02C064C39} =
								s 'MSMQ Admin'
							}
						}
					}

					NoRemove {9a0dc344-c100-11d1-bbc5-0080c76670c0}
					{
						NoRemove Extensions
						{
							NoRemove NameSpace
							{
								val {74E5637A-B98C-11D1-9B9B-00E02C064C39} =
								s 'MSMQ Admin'
							}
						}
					}

												
				}
			}
		}
	}
   	NoRemove System
    {
        NoRemove CurrentControlSet
        {
            NoRemove Control
            {
                NoRemove 'Server Applications'
                {
				    val {74E5637A-B98C-11D1-9B9B-00E02C064C39} =
				    s 'Local MSMQ Administration'
                }
            }
        }
    }
}
HKCR
{
	MSMQSnapin.Snapin.1 = s 'MSMQSnapin Class'
	{
		CLSID = s '{74E5637A-B98C-11D1-9B9B-00E02C064C39}'
	}
	MSMQSnapin.Snapin = s 'MSMQSnapin Class'
	{
		CLSID = s '{74E5637A-B98C-11D1-9B9B-00E02C064C39}'
		CurVer = s 'MSMQSnapin.Snapin.1'
	}
	NoRemove CLSID
	{
		ForceRemove {74E5637A-B98C-11D1-9B9B-00E02C064C39} = s 'MSMQSnapin Class'
		{
			ProgID = s 'MSMQSnapin.Snapin.1'
			VersionIndependentProgID = s 'MSMQSnapin.Snapin'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			'TypeLib' = s '{74E5636D-B98C-11D1-9B9B-00E02C064C39}'
		}
	}
}
HKCR
{
	MSMQSnap.QueueExt.1 = s 'MSMQ Queue Extension Class'
	{
		CLSID = s '{E62F8206-B71C-11D1-808D-00A024C48131}'
	}
	MSMQSnap.QueueExt = s 'MSMQ .QueueExt Class'
	{
		CLSID = s '{E62F8206-B71C-11D1-808D-00A024C48131}'
	}
	NoRemove CLSID
	{
		ForceRemove {E62F8206-B71C-11D1-808D-00A024C48131} = s 'MSMQ Queue Extension Class'
		{
			ProgID = s 'MSMQSnap.QueueExt.1'
			VersionIndependentProgID = s 'MSMQSnap.QueueExt'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'both'
			}
		}
		NoRemove {8A23E65E-31C2-11d0-891C-00A024AB2DBB}
		{
			NoRemove Forms
			{
				ForceRemove {E62F8206-B71C-11D1-808D-00A024C48131}
				{
					val CLSID = s '{E62F8206-B71C-11D1-808D-00A024C48131}'
				}
			}
		}
	}
}
