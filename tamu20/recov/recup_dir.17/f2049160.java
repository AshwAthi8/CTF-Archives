//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref2 href="hcp://system/css/Layout.css"    rel=STYLESHEET type=text/css>

<XML id='xmlOptions'>
  <NODE NodeType="Frame1_Expand" Key="Top" Title="Options"  URL='hcp://system/blurbs/options.htm'>
    <NODE NodeType="Expando_Link" Key="OPT"        Title="Change Help and Support Center options" URL="hcp://system/panels/options.htm"                      Description="Change how you use and view Help and Support Center."/>
    <NODE NodeType="Expando_Link" Key="SRC"        Title="Set search options"                     URL="hcp://system/panels/advsearch.htm"                    Description="Set search options to find help and information from a variety of sources."/>
    <NODE NodeType="Expando_Link" Key="RemoteHelp" Title="Install and share Windows Help"         URL="hcp://system/panels/ShareHelp.htm" Level="NoPersonal" Description="Share your computer's Help or install and quickly switch to other Windows Help."/>
  </NODE>
</XML>

</HEAD>

<BODY id=noloc0 tabindex=-1 class="sys-lhp-bgcolor" style="margin: 11px" scroll=no>

<helpcenter:tree id="idDisplay" target="HelpCtrContents" onSelect="tree_onSelect();" ></helpcenter:tree>

</BODY>

<SCRIPT>

function tree_onSelect()
{
    try
	{
		var node = event.srcElement.data;
	
		if(node && node.URL != "")
		{
			if(pchealth.HelpSession.IsNavigating() == false)
			{
				if(node.Title)
				{
					pchealth.HelpSession.SetTitle( node.URL, node.Title );
				}
	
				pchealth.UI_Contents.content.Navigate( node.URL, null, null, null, null );
			}
		}
	}
    catch(e)
    {
    }
}

function options_ContextSwitch()
{
	var ctx = pchealth.HelpSession.CurrentContext;

	if(ctx.ContextName == "OPTIONS")
	{
        var oXML  = xmlOptions.cloneNode( true );
        var oRoot = oXML.documentElement;

		switch(pchealth.UserSettings.MachineSKU.SKU)
		{
		case "Personal_32":
	        {
	            var oNodes = oRoot.selectNodes( "//NODE[@Level=\"NoPersonal\"]" );
	            var oNode;

	            while(oNode = oNodes.nextNode)
				{
					if(oNode.parentNode)
					{
						oNode.parentNode.removeChild( oNode );
					}
				}
			}
			break;
        }

        idDisplay.Populate( oRoot );
	}
}

function options_PersistLoad()
{
	var dataSer = idState.stateProperty( "dataser" );

	if(dataSer)
	{
		idDisplay.Load( dataSer );
	}
}

function options_TravelDone()
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

	idState.stateProperty( "dataser" ) = dataSer;
}

</SCRIPT>

<helpcenter:events id=idEvents onContextSwitch="options_ContextSwitch();" onPersistLoad="options_PersistLoad();" onTravelDone="options_TravelDone();" />

<helpcenter:state id=idState identity="Options" />

</HTML>
