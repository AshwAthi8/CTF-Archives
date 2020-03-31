//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>

<STYLE>

.Context-Button
{
    padding      : 2pt;

	cursor       : hand;
}

</STYLE>

</HEAD>

<BODY id=noloc0 tabindex=-1 class="sys-lhp-bgcolor" style="margin: 11px" scroll=no onselectstart="return false;">

<TABLE border=0 cellPadding=0 cellSpacing=0 WIDTH=100% HEIGHT=100% style="table-layout: fixed">
<TR WIDTH=100%>
<TD>
  <DIV id=noloc1 style='width: 100%; text-overflow: ellipsis; overflow: hidden; border : 1pt solid'
       class='sys-font-body sys-toppane-color-border sys-toppane-header-color sys-toppane-header-bgcolor'>
  	<DIV ID=tree_Title style='padding: 0.5em 11px'>
  	  <A class='sys-link-header sys-font-body-bold' tabIndex=1 href="hcp://system/blurbs/history.htm" target="HelpCtrContents">History</A>
  	</DIV>
  </DIV>
</TD>
</TR>
<TR>
  <TD HEIGHT=100%>
    <DIV ID=tree_Children
         class='sys-font-body sys-toppane-color-border sys-toppane-bgcolor'
         style='width: 100%; height: 100%; overflow: auto; border-left : 1pt solid; border-bottom : 1pt solid; border-right : 1pt solid; padding: 11px'>
    </DIV>
  </TD>
</TABLE>

</BODY>

<SCRIPT>

var g_RecentLinks = null;

function history_ContextSwitch()
{
	var ctx = pchealth.HelpSession.CurrentContext;

	if(ctx.ContextName == "HISTORY")
	{
	    DisplayList();
	}
}

function history_TravelDone()
{
	var ctx = pchealth.HelpSession.CurrentContext;

	if(ctx.ContextName == "HISTORY")
	{
	    DisplayList();
	}
}

function onClick_Display()
{
	var obj 	   = this.payload;
	if(obj)
	{
		pchealth.HelpSession.Navigate( obj );
	}
}

function onClick_KeyPress()
{
	if(event.keyCode == 13 || event.keyCode == 32)
	{
	    var obj = event.srcElement.payload;

		if(obj) pchealth.HelpSession.Navigate( obj );
	}
}

////////////////////

function DisplayList()
{
    var html = "";
    var e;
    var i;

    g_RecentLinks = pchealth.HelpSession.VisitedHelpPages( pchealth.HS_ALL );
	

    var seen = [];
    var pos  = [];

	i = 0;
    for(e = new Enumerator( g_RecentLinks ); !e.atEnd(); e.moveNext())
    {
        // get the item and save it into array
        var obj = e.item();
		var pri;
		var holder;

		if(!pchealth.UI_NavBar.content.parentWindow.fnFavorites_IsValid( obj.URL )) continue;
		if(obj.Title == "") continue;

		switch(obj.ContextName)
		{
		case "STARTUP"    : pri =  0; break;
		case "HOMEPAGE"	  : pri =  0; break;
		case "CONTENT"	  : pri =  0; break;
		case "SUBSITE"	  : pri =  0; break;
		case "SEARCH"	  : pri = -1; break;
		case "INDEX"	  : pri = -1; break;
		case "CHANNELS"	  : pri = -1; break;
		case "FAVORITES"  : pri = -1; break;
		case "HISTORY"	  : pri = -2; break;
		case "OPTIONS"	  : pri =  0; break;

		case "CONTENTONLY": pri =  0; break;
		case "FULLWINDOW" : pri =  0; break;
		case "KIOSKMODE"  : pri =  0; break;
 
		default           : pri =  0; break;
		}

		if(seen[obj.Title])
		{
			holder = seen[obj.Title];

			if(holder.pri >= pri) continue;
		}
		else
		{
			holder = new Object();
			seen[obj.Title] = holder;

		        html += "<A tabIndex=2 class='sys-link-normal' href=#>" + pchealth.TextHelpers.HTMLEscape( obj.Title ) + "<BR><BR></A>";
			pos[i++] = holder;
		}

		holder.pri = pri;
		holder.obj = obj;
    }

	tree_Children.innerHTML = html;

	for(e=0; e<i; e++)
	{
		var holder = pos[e];
		var obj    = holder.obj;
		var obj2   = tree_Children.children(e);
 	
	obj2.payload       = obj;
        obj2.payload_text  = obj2;
        obj2.onclick       = onClick_Display;
	obj2.onkeypress    = onClick_KeyPress;
	}
}

</SCRIPT>

<helpcenter:events id=idEvents onContextSwitch="history_ContextSwitch();" onTravelDone="history_TravelDone();" />

<helpcenter:state id=idState identity="History" />

</HTML>
