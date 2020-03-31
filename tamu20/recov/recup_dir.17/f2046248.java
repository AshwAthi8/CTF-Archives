//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref2 href="hcp://system/css/Layout.css"    rel=STYLESHEET type=text/css>

<XML id='xmlChannels'>
  <NODE NodeType='Frame1_Expand' Key='Top' Title='Support' URL='hcp://system/blurbs/isupport.htm'>
    <NODE NodeType='Expando_Link' Key='Channels' Title='' Description='' URL=''/>
    <!-- BETA only
      <NODE NodeType='Spacer' Key='Spacer1'/>
      <NODE NodeType='Expando_Link' Key='Bug' Title='Report a Bug' URL='hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/bugrep.htm'/>
	-->
  </NODE>
</XML>

<XML id='xmlTools'>
  <NODE NodeType='Frame2' Key='Top' Title='See Also'>
    <NODE NodeType='Expando_Link' Key='Tools_About'      Title='About Support'                URL='hcp://system/blurbs/about_support.htm'    Description='Read information about the Support page.'/>
    <NODE NodeType='Expando_Link' Key='Tools_MyComputer' Title='My Computer Information'      URL='hcp://system/sysinfo/sysinfomain.htm'     Description='Check what programs and hardware are installed on this computer, or the amount of memory available, or review diagnostic information about the health of your computer.'/>
    <NODE NodeType='Expando_Link' Key='Tools_SysInfo'    Title='Advanced System Information'  URL='hcp://system/sysinfo/sysInfoLaunch.htm'   Description='Link to system information that you or a support professional might need to troubleshoot a problem or assess your computer&apos;s health.'/>
    <NODE NodeType='Expando_Link' Key='Tools_MSconfig'   Title='System Configuration Utility' URL='hcp://system/sysinfo/sysConfigLaunch.htm' Description='Automate the routine troubleshooting steps that Microsoft support professionals use when diagnosing system configuration issues (Msconfig.exe).'/>
  </NODE>
</XML>

</HEAD>

<BODY id=noloc0 tabindex=-1 class="sys-lhp-bgcolor" style="margin: 11px" scroll=no>

<TABLE border=0 cellPadding=0 cellSpacing=0 WIDTH=100% HEIGHT=100% style="table-layout: fixed">
<TR WIDTH=100%>
<TD HEIGHT=100%>
  <helpcenter:tree id="idDisplay" target="HelpCtrContents" onSelect="tree_onSelect( true );"></helpcenter:tree>
</TD>
</TR>

<TR id=idSeeAlso style="padding-top: 11px">
<TD>
  <helpcenter:tree id="idDisplay2" target="HelpCtrContents" onSelect="tree_onSelect( false );"></helpcenter:tree>
</TD>
</TR>

</TABLE>

</BODY>

<SCRIPT>

var skip_MicrosoftAssistedSupport = "PSS Online Assisted Support"; // Need to put special instructions here
var skip_MicrosoftWhistlerBeta    = "Microsoft Whistler Beta";

// Find out if the "Microsoft Assisted Support" Channel is required or not by reading the registry key
var REG_MICROSOFT_CHANNEL_KEY   = "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpCtr\\SAF\\Channels\\Microsoft\\Display";

// Find out if this is a retail or an OEM build
var REG_OEM_BUILD	= "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\ProductId";


var g_lastHeight = 0;
var g_timeout    = null;

channels_CheckSize();

function tree_onSelect( flag )
{
    if(flag) idDisplay2.Unselect();
	else     idDisplay .Unselect();

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

function channels_ContextSwitch()
{
    var ctx = pchealth.HelpSession.CurrentContext;

    if(ctx.ContextName == "CHANNELS")
    {
        var oXML        = xmlChannels.cloneNode( true );
        var oRoot       = oXML.documentElement;
        var oTemplate   = oRoot.selectSingleNode( "//NODE[@Key=\"Channels\"]" );
        var fPSSEnabled = true;

        var objChannels     // A collection of channels

        var strVendorName;  // String variable that holds the vendor name
        var strProductID;   // String variable that holds the product ID
        var strURL;         // String variable that holds the URL
        var strKey;         // String variable that contains the key - is a concatenation of "Channels" & strVendorName & strProductID

        try
        {
            var strRegVal = pchealth.RegRead( REG_OEM_BUILD );
            if(strRegVal.match( /-OEM-/i ))
            {
                fPSSEnabled = false;
            }
        }
        catch (e)
        {
        }
        
        try
        {
            var dwRegVal = pchealth.RegRead( REG_MICROSOFT_CHANNEL_KEY );
            if(dwRegVal == 1)
            {
                fPSSEnabled = true;
            }
        }
        catch (e)
        {
        }

        // Enumerate thro the channels and generate the XML dynamically


        objChannels =  pchealth.Channels;
        objChannels.MoveFirst();
        while(objChannels.EOF == false)
        {
            var strVendorName  = objChannels.VendorName;
            var strVendorID    = objChannels.VendorID;
            var strProductID   = objChannels.ProductID;
            var strKey         = "Channels\\" + strVendorID + "\\" + strProductID;
            var fSkip          = false;


            // If ProductID is "Microsoft Assisted Support" then store the information so that it can be displayed as the last channel
            if(strProductID == skip_MicrosoftAssistedSupport && fPSSEnabled == false) fSkip = true;
            if(strProductID == skip_MicrosoftWhistlerBeta                           ) fSkip = true;

            if(fSkip == false)
            {
                var oNode = oTemplate.cloneNode( true );

                oNode.attributes.getNamedItem( "Key"         ).nodeValue = strKey;
                oNode.attributes.getNamedItem( "Title"       ).nodeValue = objChannels.ProductName;
                oNode.attributes.getNamedItem( "URL"         ).nodeValue = objChannels.SupportUrl;
                oNode.attributes.getNamedItem( "Description" ).nodeValue = objChannels.ProductDescription;

                oTemplate.parentNode.insertBefore( oNode, oTemplate );
            }

            objChannels.MoveNext();
        }

        oTemplate.parentNode.removeChild( oTemplate );

        idDisplay .Populate( oRoot                    );
        idDisplay2.Populate( xmlTools.documentElement );
    }
}

function channels_PersistLoad()
{
    var dataSer = idState.stateProperty( "dataser" );

    if(dataSer)
    {
        idDisplay.Load( dataSer );
    }
}

function channels_TravelDone()
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

function channels_CheckSize()
{
	var fState;

	if(pchealth.UI_Context.height == 0)
	{
		channels_CheckSizeDelayed( true );
		return; // Too early.
	}
	
	if(idSeeAlso.style.display == "")
	{
		g_lastHeight = idSeeAlso.scrollHeight;
	}
	
	fState = (g_lastHeight < pchealth.UI_Context.height * 0.5);

	idSeeAlso.style.display = fState ? "" : "none";
}

function channels_CheckSizeDelayed( fSet )
{
    if(g_timeout != null)
	{
		window.clearTimeout( g_timeout );

		g_timeout = null;
	}

	if(fSet)
	{
		g_timeout = window.setTimeout( channels_CheckSize, 10 );
	}
}

function window::onunload()
{
	channels_CheckSizeDelayed( false );
}

function window::onresize()
{
	channels_CheckSize();
}

</SCRIPT>

<helpcenter:events id=idEvents onContextSwitch="channels_ContextSwitch();" onPersistLoad="channels_PersistLoad();" onTravelDone="channels_TravelDone();"
  onOptionsChanged="channels_CheckSize()" onCssChanged="channels_CheckSize()" />

<helpcenter:state id=idState identity="Channels" />

</HTML>
