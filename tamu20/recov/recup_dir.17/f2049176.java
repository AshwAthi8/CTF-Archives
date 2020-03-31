//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref2 href="hcp://system/css/Layout.css"    rel=STYLESHEET type=text/css>

</HEAD>

<BODY id=noloc0 tabindex=-1 class="sys-lhp-bgcolor" style="margin: 11px" scroll=no>

<TABLE border=0 cellPadding=0 cellSpacing=0 WIDTH=100% HEIGHT=100% style="table-layout: fixed">
<TR WIDTH=100%>
<TD HEIGHT=100%>
  <helpcenter:subsite id="idDisplay" expand="true" target="HelpCtrContents" onContextSelect="subsite_onContextSelect();" onSelect="subsite_onSelect( true );" onUnselect="subsite_onUnselect();"></helpcenter:subsite>
</TD>
</TR>

<TR id=idSeeAlso style="padding-top: 11px">
<TD>
  <helpcenter:subsite id="idDisplay2" root="_SYSTEM_/See_Also" target="HelpCtrContents" onContextSelect="subsite_onContextSelect();" onSelect="subsite_onSelect( false );" onUnselect="subsite_onUnselect();"></helpcenter:subsite>
</TD>
</TR>
</TABLE>

</BODY>

<SCRIPT>

var g_lastHeight      = 0;
var g_timeoutSIZE     = null;
var g_timeoutSELECT   = null;
var g_NavigationModel = pchealth.QR_DEFAULT;

subsite_CheckSize();

function subsite_onContextSelect()
{
    try
    {
        var node = event.srcElement.data;

        pchealth.UI_NavBar.content.parentWindow.DoCommonContextMenu( -1, "subsite", node );
    }
    catch(e)
    {
    }
}

function subsite_onSelect( flag )
{
    if(flag) idDisplay2.Unselect();
	else     idDisplay .Unselect();

	subsite_ShowContent( event.srcElement.data );
}

function subsite_onUnselect()
{
}

function subsite_ShowContent( node )
{
    try
    {
        if(node)
		{
        	var category = node.FullPath;
        	var url      = node.TopicURL

			// Only desktop versions display the list of links to the right.
			if(node.Entry && g_NavigationModel == pchealth.QR_DESKTOP)
			{
				var topics = pchealth.Database.LookupTopics( category, true );
				if(topics.Count || url == "")
				{
					url = "hcp://system/panels/Topics.htm?path=" + escape(category);

				    pchealth.HelpSession.SetTitle( url, node.Title );
				}
			}

        	if(url != "" && pchealth.HelpSession.IsNavigating() == false)
        	{
        		pchealth.UI_Contents.content.Navigate( url, null, null, null, null );
        	}
        }
    }
    catch(e)
    {
    }
}

////////////////////////////////////////////////////////////////////////////////

function subsite_ContextSwitch()
{
	var ctx = pchealth.HelpSession.CurrentContext;

	if(ctx.ContextName == "SUBSITE")
	{
		if(ctx.ContextInfo)
		{
			var r;
		    var strNode         = ctx.ContextInfo;
			var strNodeToSelect = "";
			var strURL          = "";

			r = strNode.match( /([^ ]*) (.*)/ );
			if(r)
			{
				strNode         = r[1];
				strNodeToSelect = r[2];

				r = strNodeToSelect.match( /([^ ]*) (.*)/ );
				if(r)
				{
					strNodeToSelect = r[1];
					strURL          = r[2];
				}
			}

			if(idDisplay.root != strNode)
			{
				g_NavigationModel = pchealth.UserSettings.IsDesktopVersion ? pchealth.QR_DESKTOP : pchealth.QR_SERVER;
			    try
				{
					var node = pchealth.Database.LookupNode( strNode ).Item(1);

					if(node.NavigationModel != pchealth.QR_DEFAULT) g_NavigationModel = node.NavigationModel;
				}
				catch(e)
				{
				}

				idDisplay.root = strNode;
			}

			idState.stateProperty( "root"    ) = null;
			idState.stateProperty( "dataser" ) = null;

			subsite_SelectDelayed( strNodeToSelect, strURL );
		}
	}
}

function subsite_PersistLoad()
{
	var root     = idState.stateProperty( "root"    );
	var dataSer  = idState.stateProperty( "dataser" );
	var navmodel = idState.stateProperty( "navmodel" );

	if(navmodel) g_NavigationModel = navmodel;

	if(dataSer)
	{
		idDisplay.Load( dataSer );
	}
	else if(root)
	{
		idDisplay.root = root;
	}

}

function subsite_PersistSave()
{
	idState.stateProperty( "navmodel" ) = g_NavigationModel;
}

function subsite_TravelDone()
{
	var dataSer;

	try
	{
		dataSer = idDisplay.Save();
	}
	catch(e)
	{
		dataSer = null;
	}

	idState.stateProperty( "root"     ) = idDisplay.root;
	idState.stateProperty( "dataser"  ) = dataSer;
}

function subsite_CheckSize()
{
	var fState;

    if(pchealth.UserSettings.IsDesktopVersion)
	{
		if(pchealth.UI_Context.height == 0)
		{
			subsite_CheckSizeDelayed( true );
			return; // Too early.
		}

		if(idSeeAlso.style.display == "")
		{
			g_lastHeight = idSeeAlso.scrollHeight;
		}

		fState = (g_lastHeight < pchealth.UI_Context.height * 0.5);
	}
	else
	{
		fState = false;
	}

	idSeeAlso.style.display = fState ? "" : "none";
}

function subsite_CheckSizeDelayed( fSet )
{
    if(g_timeoutSIZE != null)
	{
		window.clearTimeout( g_timeoutSIZE );

		g_timeoutSIZE = null;
	}

	if(fSet)
	{
		g_timeoutSIZE = window.setTimeout( subsite_CheckSize, 10 );
	}
}

function subsite_Select()
{
	if(g_strNodeToSelect)
	{
		idDisplay.Select( g_strNodeToSelect, g_strURL, false );
	}
}

function subsite_SelectDelayed( strNodeToSelect, strURL )
{
    if(g_timeoutSELECT != null)
	{
		window.clearTimeout( g_timeoutSELECT );

		g_timeoutSELECT = null;
	}

	if(strNodeToSelect)
	{
		g_strNodeToSelect = strNodeToSelect;
		g_strURL          = strURL;
		g_timeoutSELECT   = window.setTimeout( subsite_Select, 200 );
	}
}

function window::onunload()
{
	subsite_CheckSizeDelayed( false      );
	subsite_SelectDelayed   ( null, null );
}

function window::onresize()
{
	subsite_CheckSize();
}

</SCRIPT>

<helpcenter:events id=idEvents onContextSwitch="subsite_ContextSwitch();" onPersistLoad="subsite_PersistLoad();" onPersistSave="subsite_PersistSave();" onTravelDone="subsite_TravelDone();"
  onOptionsChanged="subsite_CheckSize()" onCssChanged="subsite_CheckSize()" />

<helpcenter:state id=idState identity="Subsite" />

</HTML>
