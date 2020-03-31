ayer.controls.Next()'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2124'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2125'
                    }

                    ForceRemove PrevButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'enabled' = s 'wmpenabled:player.controls.previous'
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1805'
                        val 'onclick'= s 'player.controls.Previous()'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2126'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2127'
                    }

                    ForceRemove ImageButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'cursor'= s 'hand'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2140'
                    }

                    ForceRemove ReturnButton
                    {
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1813'
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'onclick' = s 'view.returnToMediaCenter();'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2128'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2129'
                    }

                    ForceRemove MuteButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1807'
                        val 'downToolTip' = s 'res://wmploc.dll/RT_STRING/#1808'
                        val 'sticky' = s 'true'
                        val 'down' = s 'wmpprop:player.settings.mute'
                        val 'onClick' = s 'player.settings.mute=down;'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2130'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2131'
                    }

                    ForceRemove MinimizeButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1811'
                        val 'onclick' = s 'view.minimize();'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2132'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2133'
                    }

                    ForceRemove CloseButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1812'
                        val 'onclick' = s 'view.close();'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2134'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2135'
                    }

                    ForceRemove ShuffleButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1814'
                        val 'downToolTip' = s 'res://wmploc.dll/RT_STRING/#1815'
                        val 'sticky' = s 'true'
                        val 'down' = s 'jscript:player.settings.GetMode("shuffle");'
                        val 'onClick' = s 'player.settings.setMode("shuffle", down);'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2136'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2137'
                    }

                    ForceRemove RepeatButton
                    {
                        val 'classid' = s 'clsid:87291B51-0C8E-11D3-BB2A-00A0C93CA73A'
                        val 'upToolTip' = s 'res://wmploc.dll/RT_STRING/#1816'
                        val 'downToolTip' = s 'res://wmploc.dll/RT_STRING/#1817'
                        val 'sticky' = s 'true'
                        val 'down' = s 'jscript:player.settings.GetMode("loop");'
                        val 'onClick' = s 'player.settings.setMode("loop", down);'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2138'
                        val 'accKeyboardShortcut' = s 'res://wmploc.dll/RT_STRING/#2139'
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
                NoRemove Objects
                {
                    ForceRemove Playlist
                    {
                        Column

                        val classid = s 'clsid:5F9CFD93-8CAD-11d3-9A7E-00C04F8EFB70'
                    }

                    ForceRemove ItemsPlaylist
                    {
                        Column

                        val classid = s 'clsid:5F9CFD93-8CAD-11d3-9A7E-00C04F8EFB70'
                        val backgroundcolor = s 'black'
                        val foregroundcolor = s 'white'
                        val columnsVisible = s 'false'
                        val columns = s 'name=Name;Duration=Time'
                        val dropDownVisible = s 'false'
                    }

                    ForceRemove DropDownPlaylist
                    {
                        Column

                        val classid = s 'clsid:5F9CFD93-8CAD-11d3-9A7E-00C04F8EFB70'
                        val playlistItemsVisible = s 'false'
                    }
                }
            }
        }
    }
}
HKLM
{
    NoRemove Software
    {
        NoRemove Microsoft
        {
            NoRemove MediaPlayer
            {
                NoRemove Objects
                {
                    ForceRemove Text
                    {
                        val 'classid' = s 'clsid:DDDA102E-0E17-11D3-A2E2-00C04F79F88E'
                        val 'tabStop' = s 'false'
                    }

                    ForceRemove StatusText
                    {
                        val 'classid' = s 'clsid:DDDA102E-0E17-11D3-A2E2-00C04F79F88E'
                        val 'tabStop' = s 'true'
                        val 'value' = s 'wmpprop:player.status'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2102'
                    }

                    ForceRemove CurrentPositionText
                    {
                        val 'classid' = s 'clsid:DDDA102E-0E17-11D3-A2E2-00C04F79F88E'
                        val 'tabStop' = s 'true'
                        val 'justification' = s 'right'
                        val 'value' = s 'wmpprop:player.controls.currentPositionString'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2103'
                    }

                    ForceRemove DurationText
                    {
                        val 'classid' = s 'clsid:DDDA102E-0E17-11D3-A2E2-00C04F79F88E'
                        val 'tabStop' = s 'true'
                        val 'justification' = s 'right'
                        val 'value' = s 'wmpprop:player.currentMedia.DurationString'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2104'
                    }

                    ForceRemove TrackNameText
                    {
                        val 'classid' = s 'clsid:DDDA102E-0E17-11D3-A2E2-00C04F79F88E'
                        val 'tabStop' = s 'true'
                        val 'value' = s 'wmpprop:player.currentmedia.name'
                        val 'accName' = s 'res://wmploc.dll/RT_STRING/#2105'
                    }
                }
            }
        }
   }
}
