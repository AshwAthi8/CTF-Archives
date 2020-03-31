t = "<U>P</U>roperties"; 
		var L_PropertiesAccesskey_Text = "p"; 

		if (g_fSubscriptionsEnabled && (strUrl.substring(0,4) == "http") )
		{
			strOffline = "<input type=checkbox align=";
                        if(document.dir == "rtl")
                        {
                            strOffline +="right";
                        }
                        else
                        {
                            strOffline +="left";
                        }
                        strOffline +=" TABINDEX=5 ACCESSKEY=" + L_MakeAvailableOfflineAccesskey_Text + " id=chkOffline "
			if (fAvailableOffline != 0)
				strOffline += "CHECKED"
			strOffline += " onclick='ToggleOffline(this)' helpid=50486 helpfile='iexplore.hlp'><LABEL FOR=chkOffline TABINDEX=-1>" + L_MakeAvailableOffline_Text + "</LABEL>";
			strOffline += "<BR><BR><BUTTON id=btnProperties TABINDEX=6 style='visibility: "
			if (fAvailableOffline != 0)
				strOffline += "visible"
			else
				strOffline += "hidden"

			strOffline += "' class=button ACCESSKEY=" + L_PropertiesAccesskey_Text + " onclick='Properties()' helpid=50489 helpfile='iexplore.hlp'>" + L_Properties_Text + "</BUTTON><BR>";
		}

		var L_TimesVisited_Text = "times visited: "; 
		var L_LastVisited_Text = "last visited: "; 
		var L_LastVisitedNeedsLineBreak_Text = ""; 

		
		var strTemp = strName + "\n" + strUrl;
		var re = /'/g;
		strTemp = strTemp.replace(re, "´");


		textProperties.innerHTML = "<A TITLE='" + strTemp +"'><B>" + strNameShort + "</B><BR>" + strUrlShort +  "</A><BR>" + L_TimesVisited_Text + cVisits + "<BR>" + L_LastVisited_Text + L_LastVisitedNeedsLineBreak_Text + strDate + "<BR>" + strOffline;



	}
	else
	{
		textProperties.innerHTML = "<B>" + strNameShort + "</B><BR>" + L_FavoritesFolder_Text + "<BR><BR>" +
		                           "<B>" + L_ModifiedColon_Text + "</B><BR>" + strDate;
	}

	
	tdProperties.noWrap=true;
	textProperties.noWrap=true;
}

function EnableButtons()
{

	g_fSubscriptionsEnabled = nsc.SubscriptionsEnabled;




	var pszInitialDir = window.dialogArguments;

	if (pszInitialDir && (pszInitialDir.length > 0))
	{
		nsc.SetRoot(pszInitialDir);
	}

	tdNsc.blur();
	tdNewFolder.focus();
}

function ToggleOffline(chkOffline)
{

	if (chkOffline.checked)
	{
		
		if (!nsc.CreateSubscriptionForSelection())
			chkOffline.checked = false;
		else 
		{
			g_rgUrlsToSynch[g_strUrl] = true;
		}
	}
	else
	{
		if (!nsc.DeleteSubscriptionForSelection())
			chkOffline.checked = true;
		else 
			delete g_rgUrlsToSynch[g_strUrl];
	}
	btnProperties.style.visibility = (chkOffline.checked ? "visible" : "hidden");

}

function BuildSynchList()
{
    window.returnValue = "";

    for (strUrl in g_rgUrlsToSynch)
    {
        window.returnValue += strUrl + "\0";
    }

}

function Properties()
{
	nsc.InvokeContextMenuCommand("properties");
}

function OnResize()
{
	
	document.recalc(true);
}

function TdNscWidth()
{
	return Math.max(0, document.body.offsetWidth - tableButtons.offsetWidth - (tableMain.border * 3) - (2 * parseInt(tdNsc.style.borderWidth)) - 6); 
}

function TdPropertiesHeight()
{
	return Math.max(0, document.body.offsetHeight - (tableMain.border * 2) - tdProperties.offsetTop - tdDone.offsetHeight - 8);
}
</script>

</HEAD>


<body style="margin-left: 0; margin-right: 0; margin-top: 0; margin-bottom: 0; background: threedface; align: center" 
      scroll="no" onkeydown="BodyOnKeyPress(event.keyCode)" onkeypress="BodyOnKeyPress(event.keyCode)" onload="EnableButtons()" onunload="BuildSynchList()" onresize="OnResize()">



<table id=tableMain cols=3 border=10 bordercolor=THREEDFACE>
    <TR id=mainrow>
        <TD valign=top id=infotext class=info>
            To create a new folder, click on the Create Folder button. To rename or delete an item, select the item and click Rename or Delete.
        </TD>
        <TD id=tdColSpacing width=0>
        </TD>
        <TD id=tdNscHolder rowspan=3 height=100%>
            <TABLE cols=1 width=100% height=100%>
                <TD id=tdNsc style="height:100%; border:2px inset WINDOW;">
                    <object id=nsc TABINDEX=10 title="Favorites list" accesskey="t"
                        style="background:window; HEIGHT=100%; WIDTH=100%" 
                        CLASSID='clsid:55136805-B2DE-11D1-B9F2-00A0C98BC547' 
                        onkeypress="BodyOnKeyPress(event.keyCode)" 
                        helpid=50490 
                        helpfile="iexplore.hlp">
                    </OBJECT>
                </TD>
            </TABLE>
        </TD>
    </TR>
    <TR id=rowButtons>
        <TD>
            <table id=tableButtons cols=2 width=200>
                <tr height=20>
                    <TD align=center width=50%>
                        <BUTTON id=tdNewFolder TABINDEX=1 style="width: 9em;" ACCESSKEY=c class=button onclick="nsc.NewFolder(); event.returnValue = false" helpid=50484 helpfile="iexplore.hlp">
                            <U>C</U>reate Folder
                        </BUTTON>
                    </TD>
                    <TD align=center width=50%>
                        <BUTTON id=tdRename    TABINDEX=2 style="width: 9em;" ACCESSKEY=r class=button onclick="nsc.InvokeContextMenuCommand('rename'); event.returnValue = false" helpid=50007 helpfile="iexplore.hlp">
                            <U>R</U>ename
                        </BUTTON>
                    </TD>
                </tr>
                <tr height=20>
                    <td width=50% align=center>
                        <BUTTON id=tdMoveTo    TABINDEX=3 style="width: 9em;" ACCESSKEY=m class=button onclick="nsc.MoveSelectionTo(); event.returnValue = false" helpid=50006 helpfile="iexplore.hlp">
                            <U>M</U>ove to Folder...
                        </BUTTON>
                    </td>
                    <td width=50% align=center>
                        <BUTTON id=tdDelete    TABINDEX=4 style="width: 9em;" ACCESSKEY=d class=button onclick="nsc.InvokeContextMenuCommand('delete'); event.returnValue = false" helpid=50008 helpfile="iexplore.hlp">
                            <U>D</U>elete
                        </BUTTON>
                    </td>
                </tr>
            </table>
        </TD>
    </TR>
    <TR id=rowProperties vAlign=top style="padding-left:1px; padding-right:0px">
        <TD id=tdProperties style="border-width:2px; margin-left:5px; margin-top:5px; margin-right:5px;" vAlign=top>
            <DIV id=textProperties class=info style="border-width:2px; border-style:groove; border-color:window; width:100%; height:expression(Math.max(0, tdProperties.offsetHeight - (2 * parseInt(tdProperties.style.borderWidth)))); overflow:hidden; nowrap:true; position:absolute;">
                Select a Favorite to view its properties or to make it available for offline viewing.
            </DIV>
        </TD>
    </TR>
    <TR id=rowCloseButton>
        <TD id= cellCloseButton colspan=3 align=right>
            <BUTTON id=tdDone TABINDEX=11 style="width: 9em;" ACCESSKEY=l class=button onclick="window.close();" helpid=50010 helpfile="iexplore.hlp">
                C<U>l</U>ose
            </BUTTON>
        </TD>
    </TR>
</table>


<SPAN id=spanMeasure style="visibility:hidden;" class=info></SPAN>

<script defer for=nsc event="FavoritesSelectionChange(cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline)">
	OnSelectionChange(cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline);
</script>

<script defer>

	tdNscHolder.style.setExpression("width", "TdNscWidth()");
	rowProperties.style.setExpression("height", "TdPropertiesHeight()"); 
</script>


</BODY>
</HTML>
