        {
                        val classid = s 'clsid:6B28F900-8D64-4B80-9963-CC52DDD1FBB4'
                        val visible = s 'false'
                        val tabstop = s 'false'
                        val width = s '1'
                        val height = s '1'
                    }
                }
            }
        }
    }
}
HKEY_LOCAL_MACHINE
{
    NoRemove SOFTWARE
    {
        NoRemove Microsoft
        {
            NoRemove MediaPlayer
            {
				NoRemove UIPlugins
				{
					ForceRemove {93075F62-16B3-43EC-A53B-FFAD0E01D5E7}
					{
						val Capabilities = d '3'
						val FriendlyName = s 'res://wmploc.dll/RT_STRING/#209'
					}
				}
            }
        }
    }
}
