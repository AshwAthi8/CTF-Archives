//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>

<STYLE>

.Search-Logo
{
	margin-left  : 11px;
	margin-right : 11px;
}

.Search-Input
{
    border 		 : 1px solid black;
	height 		 : 24px;
	margin-right : 0px;
	margin-bottom: 4px;
}

.Search-Button
{
    cursor           : hand;
    behavior 		 : url(#default#pch_bitmap);

	width            : 24px;
	height           : 24px;

	background-color : transparent;
    border   		 : 0px;
    padding  		 : 0px;
	margin-bottom    : 4px;
}

.Logo
{
    margin-left : 22px;
    width       : 24px;
    height      : 24px;
}

.LogoSKU
{
	margin-left  : 6px;
	margin-right : 11px;
}

</STYLE>

</HEAD>

<BODY SCROLL=NO class="sys-header-bgcolor" oncontextmenu="return check_cm();" onselectstart="return check_cm();">

<OBJECT tabIndex=-1 ID=idTB CLASSID="CLSID:FC7D9E08-3F9E-11d3-93C0-00C04F72DAF7" WIDTH=100%>
    <PARAM id=NoLoc1 name="Definition" value="NavBar.xml">
</OBJECT>

<DIV id=noloc NOWRAP style="width: 100%; height: 3em; position: relative">

<TABLE border=0 cellpadding=0 cellspacing=0 WIDTH=100% HEIGHT=100% class="sys-font-body">
<TR>
  <TD style="padding-top: 10px" valign=middle id=idSearchLogoCell>
    <SPAN class="sys-font-heading3 sys-header-color" tabIndex=-1><DIV NOWRAP id=idSearchLogo class="Search-Logo">Search</DIV></SPAN>
  </TD>
  <TD style="padding-top: 10px" valign=bottom id=noloc1>
    <INPUT tabIndex=10 id=idSrcInput accesskey="S" maxLength=256 class="Search-Input" onkeypress="onKeyPress_SearchInput();" title="Type or paste your search term(s)." class="sys-font-body">&nbsp;
	<BUTTON tabIndex=11 id=idSrcButton class="Search-Button" onclick="onClick_Search();" title="Start searching."
	    SRCNORMAL="hcp://system/images/24x24/arrow_green_normal.bmp"
	 SRCMOUSEOVER="hcp://system/images/24x24/arrow_green_mouseover.bmp"
	 SRCMOUSEDOWN="hcp://system/images/24x24/arrow_green_mousedown.bmp">
	 </BUTTON>
  </TD>
  
  <TD VALIGN=middle ALIGN=right WIDTH=100%>
    <TABLE border=0 cellpadding=0 cellspacing=0 WIDTH=100% HEIGHT=100%>
    <TR>
	  <TD ROWSPAN=1 VALIGN=middle ALIGN=right WIDTH=100% id=noloc2>
		   <helpcenter:bitmap id=noloc3 tabIndex=-1 class="Logo" AutoRTL="true" SRCNORMAL="hcp://system/images/32x32/logo.bmp"></helpcenter:bitmap>
	  </TD>
	  <TD VALIGN=middle>
	        <DIV id=idAppLogo class="sys-header-color-logo" NOWRAP style="overflow: hidden">
			   <DIV id=idAppLogo2 class="LogoSKU sys-font-heading1" NOWRAP>Help and Support Center</DIV>
	 	    </DIV>
	  </TD>
	</TR>
	</TABLE>
  </TD>
</TR>
<TR>
  <TD id=noloc4>
    &nbsp;
  </TD>
  <TD id=locSearchAdv HEIGHT=24px valign=top>
    <DIV NOWRAP id=idSrcAdv><A class="sys-link-header" href="none" onclick="onClick_AdvSearch();">Set search options</A></DIV>
  </TD>
  <TD id=locAppLogo valign=top ALIGN=right>
    <DIV id=idAppLogo class="LogoSKU sys-header-color-logo" NOWRAP style="overflow: hidden">
    	<DIV id=idAppLogo3 NOWRAP></DIV>
 	</DIV>
  </TD>
</TR>
</TABLE>

</DIV>

<DIV id=noloc5 style="overflow: hidden; width: 100%; height: 3px" class="sys-header-gradient-H"></DIV>

</BODY>

<SCRIPT ID=Script1_noloc SRC="hcp://system/scripts/Common.js"></SCRIPT>

<SCRIPT>

/////////////////////////////////////////////////////////////////////////////

//
// localizable variables/filenames
//
var L_QueryTooLong_Message  = "Your search text is too long. Type a shorter phrase, or just a few keywords.";
var L_MissingSearch_Message = "You should enter at least one keyword.";

var L_Back_Message       = "&Back";
var L_Forward_Message    = "&Forward";

var L_SelectAll_Message  = "&Select All";

var L_Print_Message      = "&Print";
var L_PrintMulti_Message = "&Print...";
var L_Refresh_Message    = "&Refresh";

var L_Properties_Message = "Proper&ties";

var L_AddFavorites_Message  = "&Add To Favorites";
var L_FavoriteAdded_Message = "This page has been added to your Help and Support Favorites list.";
var L_FavoriteDupe_Message  = "You already have a Favorite link to this topic.";

////////////////////

var g_options = pchealth.UserSettings.Options;

var g_FirstRun = true;

////////////////////////////////////////////////////////////////////////////////
// Search Engine Wrapper Variable Save State
var g_aSearchVar = new Array();
var g_semgr      = null;

var ID_PSSONLINEWRAPPER = "D23D0028-A543-4767-B4AA-1581D8E1CDB2";
var ID_FTS              = "9A22481C-1795-46f3-8CCA-7D78E9E54112";
var ID_KEYWORD          = "9488F2E9-47AF-46da-AE4A-86372DEBD56C";

g_aSearchVar["HCPrevQuery"] = "";

// *************************************************
// Server DCR : Add option to select default wrapper
// Begin
var REGKEY_WRAPPER_DISPLAY      = "HKCU\\SOFTWARE\\Microsoft\\PCHealth\\HelpSvc\\WrapperDisplay";
function GetDefaultWrapper()
{
	var idWrapperDisplay = "";

	try
	{
		var idWrapperDisplay = pchealth.RegRead( REGKEY_WRAPPER_DISPLAY );
	}
	catch (e)
	{
		idWrapperDisplay = "";
	}

	return idWrapperDisplay;
}

function SetDefaultWrapper(idWrapper)
{
	if (idWrapper == "")
		return;

	try
	{
		pchealth.RegWrite( REGKEY_WRAPPER_DISPLAY, idWrapper );
	}
	catch(e)
	{
		;
	}

	return;
}
// End
// Server DCR : Add option to select default wrapper
// *************************************************

function GetSearchEngineConfig()
{
	var sku = pchealth.UserSettings.CurrentSKU;

	return "HKCU\\SOFTWARE\\Microsoft\\PCHealth\\HelpCtr\\UserSettings\\SearchParam\\" + sku.SKU + "\\" + sku.Language + "\\";
}

function GetSearchEngineManager()
{
	// Check if SKU has changed or g_semgr is null
	if(g_semgr == null)
	{
		g_semgr	= pchealth.CreateObject_SearchEngineMgr();
	}
	else
	{
		try { g_semgr.AbortQuery(); } catch(e) {}
	}

	return g_semgr;
}

function SetWrapperVar(strIndex, Value)
{
    g_bSaved = true;
    g_aSearchVar[strIndex] = Value;
}

function GetWrapperVar(strIndex)
{
    return g_aSearchVar[strIndex];
}

function FindWrapper( strID )
{
	try
	{
		// Find the  wrapper
		for(var oEnumEngine = new Enumerator( GetSearchEngineManager().EnumEngine() ); !oEnumEngine.atEnd(); oEnumEngine.moveNext())
		{
			var oWrapper = oEnumEngine.item();

			if(oWrapper.ID == strID)
			{
				return oWrapper;
			}
		}
    }
	catch(e)
	{
	}

	return null;
}

////////////////////////////////////////////////////////////////////////////////

function CancelEvent()
{
    event.cancelBubble = true;
    event.returnValue  = false;
}

/////////////////////////////////////////////////////////////////////////////

function ProcessToolbarCommands( tb, id, extra )
{
    if(CanProceed())
    {
	    switch(id)
		{
		case "BACK":
	        if(pchealth.HelpSession.IsValid( -1 ))
			{
				pchealth.HelpSession.Back( 1 );
			}
			break;

		case "FORWARD":
			if(pchealth.HelpSession.IsValid( 1 ))
			{
				pchealth.HelpSession.Forward( 1 );
			}
			break;

		case "PRINT":
			try
			{
				pchealth.Print( null, true );
			}
			catch(e)
			{
			}
			break;

		case "HOME":
			pchealth.HelpSession.ChangeContext( "homepage" );
			break;

		case "INDEX":
			pchealth.HelpSession.ChangeContext( "index" );
			break;

		case "FAVORITES":
			pchealth.HelpSession.ChangeContext( "favorites" );
			break;

		case "HISTORY":
			pchealth.HelpSession.ChangeContext( "history" );
			break;

		case "OPTIONS":
			pchealth.HelpSession.ChangeContext( "options" );
			break;

		case "SUPPORT":
			pchealth.HelpSession.ChangeContext( "channels" );
			break;

		case "SEARCH":
			{
				var query = idSrcInput.value;

				if(query.length > 256)
				{
					pchealth.MessageBox( L_QueryTooLong_Message, "OK" );
					idSrcInput.focus();
				}
				else if(query == "")
				{
					pchealth.MessageBox( L_MissingSearch_Message, "OK" );
					idSrcInput.focus();
				}
				else
				{
					pchealth.HelpSession.ChangeContext( "search", query );
				}
			}
			break;

		case "LAYOUT_SMALL": onClick_ChangeView( "contentonly" ); break;
		case "LAYOUT_LARGE": onClick_ChangeView( "normal"      ); break;

		case "ADDFAVORITE":
			{
				var fav = pchealth.UserSettings.Favorites;
				var url = extra ? extra : pchealth.HelpSession.CurrentContext.URL;

				if(fnFavorites_IsValid( url ))
				{
					if(fav.IsDuplicate( url ))
					{
						pchealth.MessageBox( L_FavoriteDupe_Message, "OK" );
					}
					else
					{
						fav.Add( url );

						pchealth.MessageBox( L_FavoriteAdded_Message, "OK" );
					}
				}
			}
			break;
		}
	}
}

////////////////////////////////////////////////////////////////////////////////

function onKeyPress_SearchInput()
{
    if(event.keyCode == 13) onClick_Search();
}

function onClick_Search()
{
    CancelEvent();

	ProcessToolbarCommands( idTB, "SEARCH" );
}


function onClick_AdvSearch()
{
    CancelEvent();

    if(CanProceed())
    {
        pchealth.HelpSession.ChangeContext( "search", "", "hcp://system/panels/advsearch.htm" );
    }
}

////////////////////////////////////////////////////////////////////////////////

var oState = new Object();
oState.fMiniView = false;
oState.fInit     = false;

function onClick_ChangeView( option )
{
    var navbar = pchealth.UI_NavBar;
    var win;
    var posX;
    var posY;
    var dimW;
    var dimH;
	var place;

    //
    // If the application is shutting down, "external" is no longer available, so quit.
    //
    try
    {
        win = navbar.content.parentWindow.external.window;
    }
    catch(e)
    {
        return;
    }

    if(!win.places.currentPlace) return; // Not initialized

    if(win.places.currentPlace.name == "ContentOnly")
    {
        if(option && option == "contentonly") return; // Already content only view.

        if(oState.fInit == false)
		{
		   // We didn't shrink, so restore some default shape...
           oState.left      = win.x;
           oState.top       = win.y;
           oState.width     = win.width;
           oState.height    = win.height + 80;
           oState.maximized = win.maximized;
           oState.place     = "FullWindow";
		   oState.fMiniView = true;
           oState.fInit     = true;
	   }

        if(oState.fMiniView == false) return; // We didn't shrink...

        posX  = oState.left;
        posY  = oState.top;
        dimW  = oState.width;
        dimH  = oState.height;
        fMax  = oState.maximized;
        place = oState.place;

        oState.fMiniView = false;
    }
    else
    {
        if(option && option == "normal") return; // Already normal view.

		if(oState.fMiniView == true) return; // We did already shrink...


	    var contents   = pchealth.UI_Contents;   if(contents.visible == false) contents = pchealth.UI_HHWindow;
	    var mininavbar = pchealth.UI_MiniNavBar;


        var extraW = win.width  - navbar.width;
        var extraH = win.height - navbar.height - mininavbar.height - contents.height;

        oState.left      = win.x;
        oState.top       = win.y;
        oState.width     = win.width;
        oState.height    = win.height;
        oState.maximized = win.maximized;
        oState.place     = window.external.places.currentPlace.name;
        oState.fMiniView = true;
        oState.fInit     = true;

        if(document.documentElement.dir == "rtl")
		{
			posX = oState.left /*- contents.x*/;
		}
		else
		{
            posX = oState.left + contents.x;
		}

        posY  = oState.top  + mininavbar.y;
        dimW  =               contents.width                      + extraW;
        dimH  =               contents.height + mininavbar.height + extraH;
        fMax  = false;
        place = "ContentOnly";
    }

    window.external.panels.lockLayout();

    window.external.places.transitionTo( place );

    win.maximized = fMax;
    win.setWindowDimensions( posX, posY, dimW, dimH );

    window.external.panels.unlockLayout();

    SetButtonsState();
}

////////////////////////////////////////////////////////////////////////////////

function fnFavorites_IsValid( url )
{
    if(!url) return false;

    if(url.match( /^hcp:\/\/system/i   )) return false;
    if(url.match( /^hcp:\/\/services/i )) return true;

    if(url.match( /^http:/i            )) return true;
    if(url.match( /^https:/i           )) return true;
    if(url.match( /^hcp:/i             )) return true;
    if(url.match( /^its:/i             )) return true;
    if(url.match( /^ms-its:/i          )) return true;
    if(url.match( /^mk:@MSITStore:/i   )) return true;

    return false;
}

function fnPrint_IsValid( url )
{
    if(!url) return false;

    if(fnFavorites_IsValid( url ) == false)
	{
	    if(url.match( /^hcp:\/\/system\/panels/i  )) return false;
	    if(url.match( /^hcp:\/\/system\/scripts/i )) return false;
	    if(url.match( /^hcp:\/\/system\/errors/i  )) return false;
	    if(url.match( /^hcp:\/\/system\/css/i     )) return false;
	}

	return true;
}

function PopupPrintDialog( mode, data )
{
    var state = new Object();

    state.Mode    = mode;
    state.Data    = data;

    state.fEmpty  = true;
    state.Single  = null;
    state.Topics  = null;
    state.Nodes   = null;
    state.num     = 0;
    state.seen    = [];
    state.isValid = fnPrint_IsValid;

    return window.showModalDialog( "hcp://system/dialogs/print.dlg", state, "dialogWidth: 40em; dialogHeight: 17em; help:no; resizable:no; status:no" );
}

function DoCommonContextMenu( id, mode, data )
{
    var cm                 = pchealth.CreateObject_ContextMenu();
    var pageToProcessPrint = null;
    var pageToProcessFav   = null;

	if(id == 4) return "DELEGATE"; // CONTEXT_MENU_TEXTSELECT

    cm.AddItem     ( L_Back_Message   , "BACK"   , pchealth.HelpSession.IsValid( -1 ) ? MF_ENABLED : MF_GRAYED );
    cm.AddItem     ( L_Forward_Message, "FORWARD", pchealth.HelpSession.IsValid(  1 ) ? MF_ENABLED : MF_GRAYED );
    cm.AddSeparator(                                                                                           );

	if(id != -1)
	{
		cm.AddItem     ( L_SelectAll_Message, "SELECTALL", MF_ENABLED );
		cm.AddSeparator(                                              );
	}

    if(mode == "subsite" && data.Entry == "") // It's actually a single topic.
    {
        mode = "normal";
        data = data.TopicURL;
    }

    if(mode == "normal")
	{
	     if(!data) data = pchealth.HelpSession.CurrentContext.URL;

		 if(data && fnPrint_IsValid( data ))
		 {
			 pageToProcessPrint = data;
		 }

		 if(data && fnFavorites_IsValid( data ))
		 {
			 pageToProcessFav = data;
		 }
    }

    if(mode == "subsite")
    {
        cm.AddItem( L_PrintMulti_Message, "PRINT", data ? MF_ENABLED : MF_GRAYED );
    }
    else
    {
        cm.AddItem( L_Print_Message, "PRINT", pageToProcessPrint ? MF_ENABLED : MF_GRAYED );
    }
    cm.AddItem( L_Refresh_Message, "REFRESH", pageToProcessFav ? MF_ENABLED : MF_GRAYED );

    cm.AddSeparator(                                                                                  );
    cm.AddItem     ( L_AddFavorites_Message, "ADDFAVORITE", pageToProcessFav ? MF_ENABLED : MF_GRAYED );

	if(id != -1)
	{
		cm.AddSeparator(                                                );
		cm.AddItem     ( L_Properties_Message, "PROPERTIES", MF_ENABLED );
	}

    var res = cm.Display();
    switch(res)
    {
    case "BACK":
        window.setTimeout( "pchealth.HelpSession.Back( 1 );", 10 );
        break;

    case "FORWARD":
        window.setTimeout( "pchealth.HelpSession.Forward( 1 );", 10 );
        break;

    case "PRINT":
        if(mode == "subsite")
        {
            PopupPrintDialog( "subsite", data );
        }

        if(mode == "normal")
        {
		    ProcessToolbarCommands( idTB, "PRINT" );
        }
        break;

    case "ADDFAVORITE":
        if(pageToProcessFav)
        {
            ProcessToolbarCommands( idTB, "ADDFAVORITE", pageToProcessFav );
        }
        break;

	default:
	    return res;
    }

	return "";
}

function isinput( src )
{
	if(src)
	{
		switch(src.tagName.toUpperCase())
		{
		case "INPUT"   :
		case "SELECT"  :
		case "TEXTAREA":
			return true;
		}
	}

   return false;
}

function check_cm()
{
	if(isinput( event.srcElement )) return true;

	event.cancelBubble = true;
	event.returnValue  = false;

	return false;
}

function GlobalContextMenu( id, src, x, y )
{
    if(isinput( src )) return "DELEGATE";

    return DoCommonContextMenu( id, "normal", src.tagName == "A" ? src.href : null );
}

////////////////////////////////////////

function navbar_BeforeNavigate()
{
    // Only redirect if NOT an history navigation.
    if(pchealth.HelpSession.IsNavigating()) return;

    var data      = event.srcElement.data;
    var url       = data.URL;
    var fRedirect = false;

    //
    // Old compatibility stuff.
    //
    if(data.URL == "hcp://system/channels.htm")
    {
        data.Cancel = true;

        pchealth.HelpSession.ChangeContext( "Channels", "" );
        return;
    }
}

function CanProceed()
{
    if(pchealth.HelpSession.IsNavigating()) return false;

    return true;
}

function navbar_UpdateButtons()
{
    SetButtonsState();
}

function SetButtonsState()
{
	idTB.SetState( "BACK"   , pchealth.HelpSession.IsValid( -1 ) );
	idTB.SetState( "FORWARD", pchealth.HelpSession.IsValid(  1 ) );
}

function BuildPage()
{
	navbar_OptionsChanged();

	UpdateEdition();
}

function UpdateEdition()
{
	idAppLogo3.innerText = pchealth.UserSettings.CurrentSKU.DisplayName;
}

////////////////////////////////////////////////////////////////////////////////

function debug_BuildTree( doc )
{
    var strStruct = "<HTML><TITLE>Document Tree</TITLE><BODY>" + debug_BuildNode( doc ) + "</BODY></HTML>";

    try
    {
        var fso     = new ActiveXObject( "Scripting.FileSystemObject" );
        var tfolder = fso.GetSpecialFolder( 2 );
        var name    = fso.GetTempName();
        var file    = fso.CreateTextFile( tfolder + "\\" + name, true );

        file.Write( strStruct );
        file.Close(           );

        window.showModalDialog( tfolder + "\\" + name, "", "dialogWidth:500px; dialogHeight:500px; help:no; resizable:yes; status:no" );

        fso.DeleteFile( tfolder + "\\" + name );
    }
    catch(e)
    {
    }
}

function debug_BuildNode( node )
{
    var strStruct = "<DIV>" + node.tagName + "<BR>";
    var iSeen     = false;
    var tags      = node.childNodes;

    // Walk through every element in the document.
    for(var i = 0; i < tags.length; i++)
    {
        var obj = tags[i];

        if(iSeen == false)
        {
            strStruct += "<TABLE BORDER CELLPADDING=5><TR>";
            iSeen      = true;
        }

        if(obj.tagName)
        {
            strStruct += "<TD>" + debug_BuildNode( obj ) + "</TD>";
        }
        else
        {
            strStruct += "<TD>" + obj.nodeValue + "</TD>";
        }
    }

    if(iSeen)
    {
        strStruct += "</TR></TABLE>";
    }

    return strStruct + "</DIV>";
}

function navbar_ContextSwitch()
{
	var ctx = pchealth.HelpSession.CurrentContext;

	if(ctx.ContextName == "SUBSITE") UpdateEdition();

	navbar_UpdateButtons();
}

function navbar_TravelDone()
{
	navbar_UpdateButtons();

	if(g_FirstRun)
	{
		g_FirstRun = false;

		if(pchealth.UI_NavBar.visible)
		{
			window.setTimeout( "idSrcInput.focus();", 100 );
		}
	}
}

function navbar_Shutdown()
{
    if(pchealth.UI_NavBar.visible == false)
    {
        switch(external.places.currentPlace.name)
        {
        case "KioskMode":
            break;

        default:
            onClick_ChangeView();
            break;
        }
    }

	if(g_semgr)
	{
		try { g_semgr.AbortQuery(); } catch(e) {}
	}
}

function navbar_SwitchedHelpFiles()
{
	// throw away previous g_semgr
	g_aSearchVar = new Array();
	g_semgr      = null;

	UpdateEdition();
}

function navbar_OptionsChanged()
{
	idTB.SetVisibility( "FAVORITES", g_options.ShowFavorites );
	idTB.SetVisibility( "HISTORY"  , g_options.ShowHistory   );

	if(idTB.Mode != g_options.TextLabels)
	{
		idTB.Mode = g_options.TextLabels;
	}
}

////////////////////////////////////////////////////////////////////////////////
//
// Code for validating an outside link 
//

function SanitizeLink( strLink )
{
	var reScript = new RegExp( "(javascript:|vbscript:|<|>)", "i");
	if(reScript.test( strLink))
	{
		return null;
	}
	
	var reAppHTTP = new RegExp( "^(app:http:)", "i" ); 
	if(reAppHTTP.test( strLink ))
	{
		var strURL = strLink.slice( 9 );
		var strParsedURL = pchealth.TextHelpers.ParseURL( strURL );
		var strBase = strParsedURL.BasePart;
		strBase = pchealth.TextHelpers.URLUnescape( strBase, true );
		strBase = pchealth.TextHelpers.URLEscape( strBase, true );
		strParsedURL.BasePart = strBase;
		var strFinalURL = strParsedURL.BuildFullURL();
		return( "app:http:" + strFinalURL );
	}

	var reHCPNews = new RegExp( "^(hcp://)", "i" ); 
	if(reHCPNews.test( strLink ))
	{
		var strURL = strLink.slice( 6 );
		var strParsedURL = pchealth.TextHelpers.ParseURL( strURL );
		var strBase = strParsedURL.BasePart;
		strBase = pchealth.TextHelpers.URLUnescape( strBase, true );
		strBase = pchealth.TextHelpers.URLEscape( strBase, true );
		strParsedURL.BasePart = strBase;
		var strFinalURL = strParsedURL.BuildFullURL();
		return( "hcp://" + strFinalURL );
	}
		
	var reHTTP = new RegExp( "^(http:)", "i" ); 
	if(reHTTP.test( strLink ))
	{
		var strURL = strLink.slice( 5 );
		var strParsedURL = pchealth.TextHelpers.ParseURL( strURL );
		var strBase = strParsedURL.BasePart;
		strBase = pchealth.TextHelpers.URLUnescape( strBase, true );
		strBase = pchealth.TextHelpers.URLEscape( strBase, true );
		strParsedURL.BasePart = strBase;
		var strFinalURL = strParsedURL.BuildFullURL();
		return( "http:" + strFinalURL );
	}

	var reAppHTTPs = new RegExp( "^(app:https:)", "i" ); 
	if(reAppHTTPs.test( strLink ))
	{
		var strURL = strLink.slice( 10 );
		var strParsedURL = pchealth.TextHelpers.ParseURL( strURL );
		var strBase = strParsedURL.BasePart;
		strBase = pchealth.TextHelpers.URLUnescape( strBase, true );
		strBase = pchealth.TextHelpers.URLEscape( strBase, true );
		strParsedURL.BasePart = strBase;
		var strFinalURL = strParsedURL.BuildFullURL();
		return( "app:https:" + strFinalURL );
	}

	var reHTTPs = new RegExp( "^(https:)", "i" ); 	
	if(reHTTPs.test( strLink ))
	{
		var strURL = strLink.slice( 6 );
		var strParsedURL = pchealth.TextHelpers.ParseURL( strURL );
		var strBase = strParsedURL.BasePart;
		strBase = pchealth.TextHelpers.URLUnescape( strBase, true );
		strBase = pchealth.TextHelpers.URLEscape( strBase, true );
		strParsedURL.BasePart = strBase;
		var strFinalURL = strParsedURL.BuildFullURL();
		return( "https:" + strFinalURL );
	}
	
	return null;
}



BuildPage();

</SCRIPT>

<SCRIPT LANGUAGE="JScript" EVENT="onCommand( tb, id )" FOR="idTB">
ProcessToolbarCommands( tb, id );
</SCRIPT>

<helpcenter:events id=idEvents onBeforeNavigate="navbar_BeforeNavigate();" onContextSwitch="navbar_ContextSwitch();" onTravelDone="navbar_TravelDone();" onShutdown="navbar_Shutdown();" onSwitchedHelpFiles="navbar_SwitchedHelpFiles()" onOptionsChanged="navbar_OptionsChanged()" />

<helpcenter:state id=idState identity="NavBar" />

</HTML>
