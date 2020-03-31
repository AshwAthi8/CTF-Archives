//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref2 href="hcp://system/css/Layout.css"    rel=STYLESHEET type=text/css>

<TITLE>Share Windows Help</TITLE>

<SCRIPT ID=Script1_noloc SRC="hcp://system/scripts/Common.js"></SCRIPT>

<helpcenter:events id=idEvents />

<STYLE>

.cell-border
{
    border: 1pt solid;
}

.cell-border-left
{
    border-bottom: 1pt solid;
}

.cell-border-right
{
    border-left   : 1pt solid;
    border-bottom : 1pt solid;
}

</STYLE>

</HEAD>

<BODY id=noloc0 style="margin: 16px; margin-top: 11px" SCROLL=auto class="sys-rhp-bgcolor sys-color-body">

<!-- ######################################## -->
<DIV id=idMODE_change class="sys-font-body" style="display: none; margin-right:0px">
  <DIV id=locCHANGE1 class="sys-font-heading3 sys-rhp-color-title">
    <SPAN>Switch Help version</SPAN>
  </DIV>
  <BR>

  <DIV id=locCHANGE2 CLASS="sys-font-body">
    Select a version of Help from the list, and click <B>Switch</B>.
  </DIV>
  <BR>

  <TABLE cellspacing=0 cellpadding=0 width=100% class=sys-table-color-border style="border: 1pt solid; padding: 0.5em">
    <THEAD CLASS=sys-inlineform-bgcolor3>
    <TR>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title" id=locCHANGE3>
        Available Help:
      </TD>
    </TR>
    </THEAD>
    <TBODY id=idCHANGE_resultTable CLASS="sys-font-body">
    </TBODY>
    <TFOOT CLASS=sys-table-header-bgcolor1>
      <TR>
        <TD id=noloc1_1 ALIGN=right>
          <BUTTON tabIndex=20 id=idCHANGE_exec class="Context-Button sys-font-body" accesskey="w" onClick="CHANGE_onClick();" DISABLED>S<U>w</U>itch</BUTTON>
        </TD>
      </TR>
   </TFOOT>
  </TABLE>

</DIV>

<!-- ######################################## -->
<DIV id=idMODE_server class="sys-font-body" style="display: none; margin-right:0px">
  <DIV id=locSERVER1 class="sys-font-heading3 sys-rhp-color-title">
    <SPAN>Install shared Help</SPAN>
  </DIV>
  <BR>

  <DIV id=locSERVER2 CLASS="sys-font-body">
    To find Help content on another Windows computer, enter the computer name, and then click <B>Find</B>.
  </DIV>
  <BR>

  <TABLE cellspacing=0 cellpadding=0 width=100%>
  <TR>
    <TD WIDTH=100%>
      <INPUT ALIGN=baseline tabIndex=1 id=idSERVER_share style="width:100%" onPropertyChange="SERVER_onChange_share();" onKeyUp="SERVER_onKey_share();" class="Context-Input sys-font-body">
    </TD>
  </TR>
  </TABLE>
  <DIV id=noloc2_1 style="text-align: right; margin-top: .5em">
    <BUTTON tabIndex=3 id=idSERVER_query class="Context-Button sys-font-body" accesskey="F" onClick="SERVER_onClick_query();" DISABLED><U>F</U>ind</BUTTON>
  </DIV>
  <BR>

  <DIV id=locSERVER3 style="height: 2em">Pick a version of Help from the list, and click <B>Install</B>. To start using the newly installed Help content, you can
    <ID id=locSERVER3a><A id=locSERVER3b class="sys-link-normal sys-font-body" href="hcp://system/panels/remotehelp.htm?mode=Change" title="Start using Help content you've installed from another computer running Windows XP or Windows Server 2003.">switch from one operating system's Help content to another</A>.</ID>
  </DIV><BR>
  <DIV id=locSERVER4 style="height: 2em">The following versions of Help are available on <SPAN id=idSERVER_serverSelected></SPAN>:</DIV> <!-- computername -->

  <TABLE cellspacing=0 cellpadding=0 width=100% class="sys-table-color-border cell-border" style="padding: 0.5em">
    <THEAD CLASS=sys-inlineform-bgcolor3>
    <TR>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title cell-border-left"  id=locSERVER5 width="100%">Name</TD>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title cell-border-right" id=locSERVER6 nowrap>Status</TD>
    </TR>
    </THEAD>

    <TBODY id=idSERVER_resultTable CLASS="sys-font-body">
    </TBODY>

    <TFOOT CLASS="sys-table-header-bgcolor1 sys-font-body">
    <TR>
    <TD COLSPAN=2>
      <TABLE cellspacing=0 cellpadding=0 width=100%>
      <TR>
      <TD id=noloc2_2 WIDTH=100% style="font-size: 8pt">
          <SPAN CLASS='sys-toppane-header-color' id=idSERVER_status></SPAN>
      </TD>
      <TD id=noloc2_3 ALIGN=right>
        <DIV NOWRAP>
          <BUTTON tabIndex=20 id=idSERVER_abort class="Context-Button sys-font-body" accesskey="C" onClick="SERVER_onClick_abort();" style="display: none"><U>C</U>ancel</BUTTON>
          <SPAN id=noloc2_4 style="width: 15px"></SPAN>
          <BUTTON tabIndex=21 id=idSERVER_install class="Context-Button sys-font-body" accesskey="I" onClick="SERVER_onClick_install();" DISABLED><U>I</U>nstall</BUTTON>
        </DIV>
      </TD>
      </TR>
      </TABLE>
    </TR>
    </TFOOT>
  </TABLE>

</DIV>

<!-- ######################################## -->
<DIV id=idMODE_disk class="sys-font-body" style="display: none; margin-right:0px">
  <DIV id=locDISK1 class="sys-font-heading3 sys-rhp-color-title">
    <SPAN>Install Help from disk</SPAN>
  </DIV>
  <BR>

  <DIV id=locDISK2 CLASS="sys-font-body">
    To find Help content on a CD or disk image, enter the location, and then click <B>Find</B>.
  </DIV>
  <BR>

  <TABLE cellspacing=0 cellpadding=0 width=100%>
  <TR>
    <TD WIDTH=100%>
      <INPUT tabIndex=1 id=idDISK_dir style="width:100%" onPropertyChange="DISK_onChange_dir();" onKeyUp="DISK_onKey_dir();" class="Context-Input sys-font-body">
    </TD>
    <TD id=noloc3_1 style="padding-left: .2em">
      <BUTTON tabIndex=2 id=idDISK_browse class="Context-Button sys-font-body" accesskey="B" onClick="DISK_onClick_browse();"><U>B</U>rowse...</BUTTON>
    </TD>
  </TR>
  </TABLE>
  <DIV id=noloc3_2 style="text-align: right; margin-top: .5em">
    <BUTTON tabIndex=3 id=idDISK_query class="Context-Button sys-font-body" accesskey="F" onClick="DISK_onClick_query();" DISABLED><U>F</U>ind</BUTTON>
  </DIV>
  <BR>

  <DIV id=locDISK3 style="height: 2em">Pick a version of Help from the list, and click <B>Install</B>. To start using the newly installed Help content, you can
    <ID id=locDISK3a><A id=locDISK3b class="sys-link-normal sys-font-body" href="hcp://system/panels/remotehelp.htm?mode=Change" title="Start using Help content you've installed from another computer running Windows XP or Windows Server 2003.">switch from one operating system's Help content to another</A>.</ID>
  </DIV><BR>
  <DIV id=locDISK4 style="height: 2em">The following versions of Help are available on <SPAN id=idDISK_dirSelected></SPAN>:</DIV>

  <TABLE cellspacing=0 cellpadding=0 width=100% class="sys-table-color-border cell-border" style="padding: 0.5em">
    <THEAD CLASS=sys-inlineform-bgcolor3>
    <TR>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title cell-border-left"  id=locDISK5 width="100%">Name</TD>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title cell-border-right" id=locDISK6>Status</TD>
    </TR>
    </THEAD>

    <TBODY id=idDISK_resultTable CLASS="sys-font-body">
    </TBODY>

    <TFOOT CLASS="sys-table-header-bgcolor1 sys-font-body">
    <TR>
    <TD COLSPAN=2>
      <TABLE cellspacing=0 cellpadding=0 width=100%>
      <TR>
      <TD id=noloc3_3 WIDTH=100% style="font-size: 8pt">
        <SPAN CLASS='sys-toppane-header-color' id=idDISK_status></SPAN>
      </TD>
      <TD id=noloc3_4 ALIGN=right>
        <DIV NOWRAP>
          <BUTTON tabIndex=20 id=idDISK_abort class="Context-Button sys-font-body" accesskey="C" onClick="DISK_onClick_abort();" style="display: none"><U>C</U>ancel</BUTTON>
          <SPAN id=noloc3_5 style="width: 15px"></SPAN>
          <BUTTON tabIndex=21 id=idDISK_install class="Context-Button sys-font-body" accesskey="I" onClick="DISK_onClick_install();" DISABLED><U>I</U>nstall</BUTTON>
        </DIV>
      </TD>
      </TR>
      </TABLE>
    </TR>
    </TFOOT>
  </TABLE>

</DIV>

<!-- ######################################## -->
<DIV id=idMODE_share class="sys-font-body" style="display: none; margin-right:0px">
  <DIV id=locSHARE1 class="sys-font-heading3 sys-rhp-color-title">
    <SPAN>Share Help</SPAN>
  </DIV>
  <BR>

  <DIV id=locSHARE2 CLASS="sys-font-body">
    You can share the Help content on your computer with other users on your network. To share Help, click <B>Shared</B> or <B>Not Shared</B> next to the appropriate Help content, and then click <B>Apply</B>.
  </DIV>
  <BR>

  <TABLE cellspacing=0 cellpadding=0 width=100% class="sys-table-color-border cell-border" style="padding: 0.5em">
    <THEAD CLASS=sys-inlineform-bgcolor3>
    <TR>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title cell-border-left"  id=locSHARE3 COLSPAN=3>Currently installed Help</TD>
    </TR>
    </THEAD>
    <TBODY id=idSHARE_resultTable CLASS="sys-font-body">
    </TBODY>
    <TFOOT CLASS="sys-table-header-bgcolor1 sys-font-body">
      <TR>
        <TD id=noloc4_1 ALIGN=right COLSPAN=3>
          <DIV NOWRAP>
            <BUTTON tabIndex=31 id=idSHARE_submit class="Context-Button sys-font-body" accesskey="A" onClick="SHARE_onClick_submit();" DISABLED><U>A</U>pply</BUTTON>
            <SPAN id=noloc4_2 style="width: 15px"></SPAN>
            <BUTTON tabIndex=32 id=idSHARE_reset  class="Context-Button sys-font-body" accesskey="C" onClick="SHARE_onClick_reset();" DISABLED><U>C</U>ancel</BUTTON>
          </DIV>
        </TD>
      </TR>
    </TFOOT>
  </TABLE>
  <BR>

  <DIV id=idSHARE_tsblock>
    <SELECT id=idSHARE_ts NAME="ts" TITLE="Select a Help" SIZE="1" onchange='SHARE_onChange_ts()' CLASS="sys-font-body"></SELECT>
    <LABEL id=locSHARE4 class="sys-font-body" FOR=idSHARE_ts> : default Help for users who connect to this computer remotely</LABEL>
  </DIV>

</DIV>

<!-- ######################################## -->
<DIV id=idMODE_remove class="sys-font-body" style="display: none; margin-right:0px">
  <DIV id=locREMOVE1 class="sys-font-heading3 sys-rhp-color-title">
    <SPAN>Remove Help</SPAN>
  </DIV>
  <BR>

  <DIV id=locREMOVE2 CLASS="sys-font-body">
    To uninstall Help from your computer, pick a version of Help from the list, and click <B>Remove</B>. You cannot uninstall Help that is currently in use.
  </DIV>
  <BR>

  <TABLE cellspacing=0 cellpadding=0 width=100% class=sys-table-color-border style="border: 1pt solid; padding: 0.5em">
    <THEAD CLASS=sys-inlineform-bgcolor3>
    <TR>
      <TD CLASS="sys-font-body-bold sys-rhp-splash-color-title" id=locREMOVE3>
        The following Help can be uninstalled
      </TD>
    </TR>
    </THEAD>
    <TBODY id=idREMOVE_resultTable CLASS="sys-font-body">
    </TBODY>
    <TFOOT CLASS=sys-table-header-bgcolor1>
      <TR>
        <TD id=noloc5_1 ALIGN=right>
          <BUTTON tabIndex=20 id=idREMOVE_exec class="Context-Button sys-font-body" accesskey="R" onClick="REMOVE_onClick();" DISABLED><U>R</U>emove</BUTTON>
        </TD>
      </TR>
   </TFOOT>
  </TABLE>

</DIV>

<DIV id=idWARNING style="display: none">
    <DIV id=locWARNING1 CLASS="sys-font-body">
        <BR>
        <B>Note</B> Help for other operating systems contains references to some features that are not on your
        computer. Links to these features will not respond when clicked.
    </DIV>
</DIV>

</BODY>

<SCRIPT DEFER>

//
// localizable variables/filenames
//
var L_NOTACTIVE_Message        = ""                            ;
var L_QUERYING_Message         = "Collecting information..."   ;
var L_QUERIED_Message          = "Ready to execute."           ;
var L_COPYINGDB_Message        = "Copying the database..."     ;
var L_COPYINGFILES_Message     = "Copying file: "              ;
var L_INSTALLING_Message       = "Finalizing installation..."  ;
var L_INSTALLED_Message        = "Installation complete."      ;
var L_UNINSTALLING_Message     = "Finalizing uninstallation...";
var L_UNINSTALLED_Message      = "Uninstallation complete."    ;
var L_ABORTING_Message         = "Cancelling..."               ;
var L_ABORTED_Message          = "Cancelled."                  ;
var L_FAILED_Message           = "Operation failed: "          ;

var L_AlreadyInstalled_Text    = "Already Installed";
var L_Available_Text           = "Available";
var L_NotAvailable_Text        = "Not Available";

var L_Shared_Text              = "Shared";
var L_NotShared_Text           = "Not Shared";

var L_HelpContentDir_Text      = "Look for Help content in:";

var L_AbortInstall_Message     = "Do you want to cancel the installation?";
var L_DenyUninstall1_Message   = "You are currently using ";
var L_DenyUninstall2_Message   = ". Please select another view before uninstalling.";
var L_DenyUninstall3_Message   = "This Help Version is in use, it cannot be uninstalled.";

var L_NoExport_Message         = "The specified server doesn't export any Help version.";
var L_Error80004004_Message    = "The operation has been cancelled.";
var L_Error80004005_Message    = "The operation has failed.";
var L_Error800706BA_Message    = "Windows cannot connect to the specified Help server. Either the server name was typed incorrectly, or the Help server is not connected to the network.";
var L_Error80040154_Message    = "Windows Help content has not been shared from this server.";

var L_Error8007007B_Message    = "You entered an incorrect path.";
var L_Error80070043_Message    = "You don't have enough permissions to access the network.";
var L_Error80070005_Message    = "You don't have enough permissions to access the resource.";
var L_Error80070002_Message    = "Windows could not find Help content in this location. Either the location name was typed incorrectly, or there is no Help content available.";

var g_StatusLookup = [];

g_StatusLookup[pchealth.SHT_NOTACTIVE   ] = L_NOTACTIVE_Message;
g_StatusLookup[pchealth.SHT_QUERYING    ] = L_QUERYING_Message;
g_StatusLookup[pchealth.SHT_QUERIED     ] = L_QUERIED_Message;
g_StatusLookup[pchealth.SHT_COPYING_DB  ] = L_COPYINGDB_Message;
g_StatusLookup[pchealth.SHT_INSTALLING  ] = L_INSTALLING_Message;
g_StatusLookup[pchealth.SHT_INSTALLED   ] = L_INSTALLED_Message;
g_StatusLookup[pchealth.SHT_UNINSTALLING] = L_UNINSTALLING_Message;
g_StatusLookup[pchealth.SHT_UNINSTALLED ] = L_UNINSTALLED_Message;
g_StatusLookup[pchealth.SHT_ABORTING    ] = L_ABORTING_Message;
g_StatusLookup[pchealth.SHT_ABORTED     ] = L_ABORTED_Message;

////////////////////

var REG_DEFAULTTERMINALSERVERSKU      = "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpCtr\\DefaultTerminalServerSKU";
var REG_DEFAULTTERMINALSERVERLANGUAGE = "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpCtr\\DefaultTerminalServerLanguage";
var REG_PERSIST_DISK                  = "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpCtr\\UserSettings\\RemoteHelp_Disk";
var REG_PERSIST_SERVER                = "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpCtr\\UserSettings\\RemoteHelp_Server";

////////////////////////////////////////////////////////////////////////////////

var g_db         = pchealth.Database;
var g_skuMachine = pchealth.UserSettings.MachineSKU;
var g_skuUser    = pchealth.UserSettings.CurrentSKU;
var g_fTS        = pchealth.UserSettings.IsTerminalServer;

var g_collLocal  = null;
var g_collServer = null;
var g_collDisk   = null;

var g_executing      = false;
var g_SelectedRow    = null;
var g_SelectedSKU    = null;
var g_SelectedSKU_TS = null;

try
{
    g_TS_DefaultSKU      = pchealth.RegRead( REG_DEFAULTTERMINALSERVERSKU      );
    g_TS_DefaultLanguage = pchealth.RegRead( REG_DEFAULTTERMINALSERVERLANGUAGE );
}
catch(e)
{
}
if(!g_TS_DefaultSKU     ) g_TS_DefaultSKU      = "";
if(!g_TS_DefaultLanguage) g_TS_DefaultLanguage = "";


if(g_fTS == false)
{
    idSHARE_tsblock.style.display = "none";
}

////////////////////////////////////////////////////////////////////////////////

function CancelEvent( event )
{
    event.cancelBubble = true;
    event.returnValue  = false;
}

function HideAll()
{
    idMODE_change.style.display = "none";
    idMODE_server.style.display = "none";
    idMODE_disk  .style.display = "none";
    idMODE_share .style.display = "none";
    idWARNING    .style.display = "none";
}

function GetSKUDisplayName( sku )
{
    var text = sku.DisplayName;

    if(g_skuMachine.Language != sku.Language) text += " / " + pchealth.TextHelpers.GetLCIDDisplayString( sku.Language );

    return text;
}

function SameSKU( a, b )
{
    try
    {
        return (a.SKU == b.SKU && a.Language == b.Language);
    }
    catch(e)
    {
    }

    return false;
}

function GetErrorMessage( hr )
{
    switch(hr)
    {
    case -2147467260/*0x80004004*/: return L_Error80004004_Message;
    case -2147467259/*0x80004005*/: return L_Error80004005_Message;
    case -2147023174/*0x800706BA*/: return L_Error800706BA_Message;
    case -2147024773/*0x8007007B*/: return L_Error8007007B_Message;
    case -2147024829/*0x80070043*/: return L_Error80070043_Message;
    case -2147024891/*0x80070005*/: return L_Error80070005_Message;
    case -2147024894/*0x80070002*/: return L_Error80070002_Message;
    case -2147221164/*0x80040154*/: return L_Error80040154_Message;
    }

    return pchealth.FormatError( hr );
}

function GetStatus( obj, status, hr, file )
{
    if(status == pchealth.SHT_COPYING_FILES)
    {
        status = L_COPYINGFILES_Message + file;
    }
    else
    {
        status = g_StatusLookup[status];
    }

    if(!status) status = L_FAILED_Message + GetErrorMessage( hr );

    return status;
}

////////////////////

function onKeyPress_Click()
{
    if(event.keyCode == 13 || event.keyCode == 32)
    {
        var obj = this;

        while(obj)
        {
            if(obj.onclick) { obj.onclick(); return; }

            obj = obj.parentElement;
        }
    }
}

function onClick_Select()
{
    CancelEvent( event ); if(g_executing) return;

    if(this.state_Selectable == false) return;

    // Unselect the previous selection.
    if(g_SelectedRow) g_SelectedRow.className = "";


    // Save the newly selected element.
    g_SelectedRow = this;
    g_SelectedSKU = this.state_SKU;

    g_SelectedRow.className = "sys-inlineform-bgcolor2";

    switch(mode)
    {
    case "Change"    : CHANGE_select(); break;
    case "AddServer" : SERVER_select(); break;
    case "AddDisk"   :   DISK_select(); break;
    case "SetSharing":  SHARE_select(); break;
    case "Remove"    : REMOVE_select(); break;
    }
}

function onDblClick_Select()
{
    CancelEvent( event ); if(g_executing) return;

    if(this.state_Selectable == false) return;

    switch(mode)
    {
    case "Change"    : CHANGE_onClick(); break;
    case "AddServer" :                   break;
    case "AddDisk"   :                   break;
    case "SetSharing":                   break;
    case "Remove"    :                   break;
    }
}

function CancelEventDirect()
{
    CancelEvent( event );
}

function SetupRowEvents( oRow )
{
    oRow.onclick       = onClick_Select;
    oRow.ondblclick    = onDblClick_Select;
    oRow.onselect      = CancelEventDirect;
    oRow.onselectstart = CancelEventDirect;
}

function CreateRowForSKU( sku, table, fSelectable )
{
    var oRow = table.insertRow();
    var oCell;
    var text;
    var status;
    var className;

    oRow.state_SKU        = sku;
    oRow.state_Selectable = false;

    if(sku)
    {
        if(fSelectable) SetupRowEvents( oRow );

        if(sku.IsInstalled)
        {
            status    = L_AlreadyInstalled_Text;
            className = "sys-color-body-alert";
        }
        else if(sku.CanInstall)
        {
            status    = L_Available_Text;
            className = "";

            oRow.state_Selectable = true;
        }
        else
        {
            status    = L_NotAvailable_Text;
            className = "sys-color-body-sec sys-inlineform-bgcolor1";
        }

        text   = GetSKUDisplayName( sku );
        status = pchealth.TextHelpers.HTMLEscape( status );
    }
    else
    {
        text      = " ";
        status    = "&nbsp;";
        className = "sys-inlineform-bgcolor1";
    }

    oCell             = oRow.insertCell();
    oCell.innerText   = text;
    oCell.className   = "cell-border-left";
    oCell.style.width = "100%";
    if(oRow.state_Selectable) oCell.tabIndex = 10;

    if(sku) oCell.onkeypress = onKeyPress_Click;

    oCell           = oRow.insertCell();
    oCell.innerHTML = "<DIV NOWRAP>" + status + "</DIV>";
    oCell.className = "sys-table-color-border cell-border-right";

    oRow.className = className;
}

function CreateRowForSelect( sku, table )
{
    var oRow  = table.insertRow();
    var oCell = oRow.insertCell();
    var text;
    var className;

    SetupRowEvents( oRow );

    oRow.state_SKU         = sku;
    oRow.state_Selectable  = false;

    if(sku)
    {
        text = GetSKUDisplayName( sku );

        if(SameSKU( sku, g_skuUser ))
        {
            className = "sys-inlineform-bgcolor2";

            g_SelectedRow = oRow;
            g_SelectedSKU = sku;
        }
        else
        {
            className = "";
        }

        oRow.state_Selectable = true;
    }
    else
    {
        text      = " ";
        className = "sys-inlineform-bgcolor1";
    }

    oCell.innerText  = text;
    oCell.className  = "cell-border-left";
    oCell.tabIndex   = 10;
    oCell.onkeypress = onKeyPress_Click;

    oRow.className = className;
}

function CreateRowForShare( sku, table, options )
{
    var oRow = table.insertRow();
    var oCell;
    var oOption;
    var text;
    var status1;
    var status2;
    var className;

    oRow.state_SKU        = sku;
    oRow.state_Selectable = false;

    if(sku)
    {
        var id = sku.SKU + sku.Language;

        oRow.state_SKU        = sku;
        oRow.state_Exported   = sku.Exported;
        oRow.state_Selectable = true;

        status1 = "<INPUT type=radio tabIndex=10 name='" + id + "'" + ( sku.Exported ? " CHECKED" : "") + ">" + L_Shared_Text;
        status2 = "<INPUT type=radio tabIndex=10 name='" + id + "'" + (!sku.Exported ? " CHECKED" : "") + ">" + L_NotShared_Text;

        className = "";

        text = GetSKUDisplayName( sku );

        oOption = document.createElement("OPTION");
        options.add( oOption );

        oOption.innerText = text;
        oOption.value     = id;

        if(sku.SKU == g_TS_DefaultSKU && sku.Language == g_TS_DefaultLanguage)
        {
            g_SelectedSKU_TS = sku;
            oOption.selected = true;
        }
    }
    else
    {
        text      = " ";
        status1   = null;
        status2   = null;
        className = "sys-inlineform-bgcolor1";
    }

    oCell             = oRow.insertCell();
    oCell.innerText   = text;
    oCell.className   = "cell-border-left";
    if(oRow.state_Selectable) oCell.tabIndex = 10;


    oCell           = oRow.insertCell();
    oCell.className = "sys-table-color-border cell-border-right";
    oCell.style.width = "7em";
    if(status1)
    {
        oCell.innerHTML                = status1;
        oCell.firstChild.payload       = oRow;
        oCell.firstChild.payload_state = true;
    }
    else
    {
        oCell.innerText = " ";
    }

    oCell           = oRow.insertCell();
    oCell.className = "sys-table-color-border cell-border-left";
    oCell.style.width = "8em";
    if(status2)
    {
        oCell.innerHTML                = status2;
        oCell.firstChild.payload       = oRow;
        oCell.firstChild.payload_state = false;
    }
    else
    {
        oCell.innerText = " ";
    }

    oRow.className = className;

    if(sku) oRow.onclick = SHARE_onClick_radio;
}

////////////////////////////////////////////////////////////////////////////////

function CHANGE_init()
{
    HideAll(); idMODE_change.style.display = ""; idWARNING.style.display = "";

    CHANGE_display();
}

function CHANGE_display()
{
    var count = 0;

    Common_ClearTable( idCHANGE_resultTable );
    idCHANGE_exec.disabled = true;

    g_collLocal = g_db.InstalledSKUs;
    for(var e = new Enumerator( g_collLocal ); !e.atEnd(); e.moveNext())
    {
        var sku = e.item();

        CreateRowForSelect( sku, idCHANGE_resultTable ); count++;
    }

    while(count < 4)
    {
        CreateRowForSelect( null, idCHANGE_resultTable ); count++;
    }
}

function CHANGE_select()
{
    idCHANGE_exec.disabled = SameSKU( g_SelectedSKU, g_skuUser );
}

////////////////////

function CHANGE_onClick()
{
    CancelEvent( event ); if(g_executing) return;

    if(idCHANGE_exec.disabled == false && g_SelectedSKU)
    {
        pchealth.UserSettings.Select( g_SelectedSKU.SKU, g_SelectedSKU.Language );
        pchealth.HelpSession.ChangeContext( "HomePage", "refresh" );
    }
}

////////////////////////////////////////////////////////////////////////////////

var g_SERVER_state;

function SERVER_init()
{
    HideAll(); idMODE_server.style.display = ""; idWARNING.style.display = "";

    SERVER_reset();
}

function SERVER_reset()
{
    var value;

    try
    {
        value = pchealth.RegRead( REG_PERSIST_SERVER );
    }
    catch(e)
    {
    }
    if(!value) value = "";

    idSERVER_share.value          = value;
    idSERVER_serverSelected.value = "";

    SERVER_display( true );

    SERVER_setstate( "idle" );
}

function SERVER_setstate( state )
{
    var fINPUT  = false;
    var fQUERY  = false;
    var fABORT  = false;
    var fACTION = false;

	g_executing = false;

    switch( g_SERVER_state = state )
    {
    case "idle":
        fINPUT = true;
        fQUERY = (idSERVER_share.value.length != 0);
        break;

    case "query":
        fABORT       = true;
        g_collServer = null;
        SERVER_display( false );
        break;

    case "ready":
        fINPUT = true;
        fQUERY = true;
        SERVER_display( true );
        break;

    case "installing":
        fABORT      = true;
		g_executing = true;
        break;
    }

    idSERVER_share.disabled      = fINPUT  ? false : true;
    idSERVER_query.disabled      = fQUERY  ? false : true;
    idSERVER_abort.style.display = fABORT  ? ""    : "none";
    idSERVER_install.disabled    = fACTION ? false : true;
}

function SERVER_display( fSelectable )
{
    var count = 0;

    g_SelectedRow = null;
    g_SelectedSKU = null;

    Common_ClearTable( idSERVER_resultTable );

    if(g_collServer)
    {
        for(var e = new Enumerator( g_collServer ); !e.atEnd(); e.moveNext())
        {
            CreateRowForSKU( e.item(), idSERVER_resultTable, fSelectable ); count++;
        }
    }

    while(count < 4)
    {
        CreateRowForSKU( null, idSERVER_resultTable, false ); count++;
    }
}

function SERVER_select()
{
    if(g_SelectedRow)
    {
        idSERVER_install.disabled = false;
    }
    else
    {
        idSERVER_install.disabled = true;
    }
}


function SERVER_onChange_share()
{
    if(event.propertyName == 'value')
    {
        var fDIS = (idSERVER_share.value.length == 0);

        idSERVER_query.disabled = fDIS;
    }
}

function SERVER_onKey_share()
{
    var fDIS = (idSERVER_share.value.length == 0);

    idSERVER_query.disabled = fDIS;

    if(fDIS == false && event.keyCode == 13) SERVER_onClick_query();
}

function SERVER_onClick_query()
{
    idSERVER_serverSelected.innerText = idSERVER_share.value;

    SERVER_selected_query();
}


function SERVER_selected_query()
{
    SERVER_setstate( "query" )

    g_collServer = g_db.ConnectToServer( idSERVER_serverSelected.innerText, SERVER_notifyForServer );
}


function SERVER_onClick_install()
{
    if(g_SelectedSKU)
    {
        SERVER_setstate( "installing" );

        idEvents.onBeforeContextSwitch = SERVER_askToAbort;
        idEvents.onBeforeNavigate      = SERVER_askToAbort;
        idEvents.onShutdown            = SERVER_askToAbort;

        g_SelectedSKU.onStatusChange = SERVER_notify;
        g_SelectedSKU.Install();
    }
}

function SERVER_onClick_abort()
{
    if(g_db)
    {
        g_db.Abort();
    }

    if(g_SelectedSKU)
    {
        g_SelectedSKU.Abort();
    }
}


function SERVER_notifyForServer( obj, status, hr, file )
{
    if(g_SERVER_state == "query")
    {
        if(status == pchealth.SHT_ABORTING) return;

        if(status == pchealth.SHT_ABORTED)
        {
            status = pchealth.SHT_QUERIED;
        }
    }

    idSERVER_status.innerText = GetStatus( obj, status, hr, file );


    if(status == pchealth.SHT_QUERYING)
    {
        SERVER_display( false );
    }

    if(status == pchealth.SHT_QUERIED)
    {
        if(g_collServer && g_collServer.Count == 0)
        {
		    idSERVER_status.innerText = L_Error80040154_Message;

            SERVER_setstate( "idle" );
        }
        else
        {
            try
            {
                pchealth.RegWrite( REG_PERSIST_SERVER, idSERVER_share.value );
            }
            catch(e)
            {
            }

            SERVER_setstate( "ready" );
        }
        return;
    }

    if(status == pchealth.SHT_ABORTED ||
       status == pchealth.SHT_FAILED   )
    {
        SERVER_setstate( "idle" );
    }
}

function SERVER_askToAbort()
{
    var res = pchealth.MessageBox( L_AbortInstall_Message, "YESNO" );

    if(res == "NO")
    {
        CancelEvent( event );

        event.srcElement.data.Cancel = true;
    }
    else
    {
        idEvents.onBeforeContextSwitch = null;
        idEvents.onBeforeNavigate      = null;
        idEvents.onShutdown            = null;

        SERVER_onClick_abort();
    }
}

function SERVER_notify( obj, status, hr, file )
{
    idSERVER_status.innerText = GetStatus( obj, status, hr, file );

    if(status == pchealth.SHT_INSTALLED ||
       status == pchealth.SHT_ABORTED   ||
       status == pchealth.SHT_FAILED     )
    {
        idEvents.onBeforeContextSwitch = null;
        idEvents.onBeforeNavigate      = null;
        idEvents.onShutdown            = null;

        if (status != pchealth.SHT_FAILED)
        	SERVER_setstate( "ready" );
        else
        	SERVER_selected_query();
    }
}

////////////////////////////////////////////////////////////////////////////////

var g_DISK_state;

function DISK_init()
{
    HideAll(); idMODE_disk.style.display = ""; idWARNING.style.display = "";

    DISK_reset();
}

function DISK_reset()
{
    var value;

    try
    {
        value = pchealth.RegRead( REG_PERSIST_DISK );
    }
    catch(e)
    {
    }
    if(!value) value = "";

    idDISK_dir.value         = value;
    idDISK_dirSelected.value = "";

    DISK_display( true );

    DISK_setstate( "idle" );
}

function DISK_setstate( state )
{
    var fINPUT  = false;
    var fQUERY  = false;
    var fABORT  = false;
    var fACTION = false;

	g_executing = false;

    switch( g_DISK_state = state )
    {
    case "idle":
        fINPUT = true;
        fQUERY = (idDISK_dir.value.length != 0);
        break;

    case "query":
        fABORT     = true;
        g_collDisk = null;
        DISK_display( false );
        break;

    case "ready":
        fINPUT = true;
        fQUERY = true;
        DISK_display( true );
        break;

    case "installing":
        fABORT      = true;
		g_executing = true;
        break;
    }

    idDISK_dir.disabled        = fINPUT  ? false : true;
	idDISK_browse.disabled     = fINPUT  ? false : true;
    idDISK_query.disabled      = fQUERY  ? false : true;
    idDISK_abort.style.display = fABORT  ? ""    : "none";
    idDISK_install.disabled    = fACTION ? false : true;
}

function DISK_display( fSelectable )
{
    var count = 0;

    g_SelectedRow = null;
    g_SelectedSKU = null;

    Common_ClearTable( idDISK_resultTable );
    if(g_collDisk)
    {
        var seen = [];

        for(var e = new Enumerator( g_collDisk ); !e.atEnd(); e.moveNext())
        {
            var sku = e.item();
            var id  = sku.SKU + "_#_" + sku.Language;

            if(seen[id]) continue;
            seen[id] = true;

            CreateRowForSKU( sku, idDISK_resultTable, fSelectable ); count++;
        }
    }

    while(count < 4)
    {
        CreateRowForSKU( null, idDISK_resultTable, false ); count++;
    }
}


function DISK_select()
{
    if(g_SelectedRow)
    {
        idDISK_install.disabled = false;
    }
    else
    {
        idDISK_install.disabled = true;
    }
}


function DISK_onChange_dir()
{
    if(event.propertyName == 'value')
    {
        var fDIS = (idDISK_dir.value.length == 0);

        idDISK_query.disabled = fDIS;
    }
}

function DISK_onKey_dir()
{
    var fDIS = (idDISK_dir.value.length == 0);

    idDISK_query.disabled = fDIS;

    if(fDIS == false && event.keyCode == 13) DISK_onClick_query();
}

function DISK_onClick_browse()
{
    var res = pchealth.SelectFolder( L_HelpContentDir_Text, idDISK_dir.value );

    if(res && res.length > 0)
    {
        idDISK_dir.value = res;
        idDISK_dir.focus();

        idDISK_query.disabled = false;
    }
}

function DISK_onClick_query()
{
    DISK_setstate( "query" )

    idDISK_dirSelected.innerText = idDISK_dir.value;

    g_collDisk = g_db.ConnectToDisk( idDISK_dir.value, DISK_notifyForDisk );
}


function DISK_onClick_install()
{
    if(g_SelectedSKU)
    {
        DISK_setstate( "installing" );

        idEvents.onBeforeContextSwitch = DISK_askToAbort;
        idEvents.onBeforeNavigate      = DISK_askToAbort;
        idEvents.onShutdown            = DISK_askToAbort;

        g_SelectedSKU.onStatusChange = DISK_notify;
        g_SelectedSKU.Install();
    }
}

function DISK_onClick_abort()
{
    if(g_db)
    {
        g_db.Abort();
    }

    if(g_SelectedSKU)
    {
        g_SelectedSKU.Abort();
    }
}


function DISK_notifyForDisk( obj, status, hr, file )
{
    if(g_DISK_state == "query")
    {
        if(status == pchealth.SHT_ABORTING) return;

        if(status == pchealth.SHT_ABORTED)
        {
            status = pchealth.SHT_QUERIED;
        }
    }

    idDISK_status.innerText = GetStatus( obj, status, hr, file );


    if(status == pchealth.SHT_QUERYING)
    {
        DISK_display( false );
    }

    if(status == pchealth.SHT_QUERIED)
    {
        if(g_collDisk && g_collDisk.Count == 0)
        {
		    idDISK_status.innerText = L_Error80070002_Message;

            DISK_setstate( "idle" );
        }
        else
        {
            try
            {
                pchealth.RegWrite( REG_PERSIST_DISK, idDISK_dir.value );
            }
            catch(e)
            {
            }

            DISK_setstate( "ready" );
        }
    }

    if(status == pchealth.SHT_ABORTED ||
       status == pchealth.SHT_FAILED   )
    {
        DISK_setstate( "idle" );
    }
}

function DISK_askToAbort()
{
    var res = pchealth.MessageBox( L_AbortInstall_Message, "YESNO" );

    if(res == "NO")
    {
        CancelEvent( event );

        event.srcElement.data.Cancel = true;
    }
    else
    {
        idEvents.onBeforeContextSwitch = null;
        idEvents.onBeforeNavigate      = null;
        idEvents.onShutdown            = null;

        DISK_onClick_abort();
    }
}

function DISK_notify( obj, status, hr, file )
{
    idDISK_status.innerText = GetStatus( obj, status, hr, file );

    if(status == pchealth.SHT_INSTALLED ||
       status == pchealth.SHT_ABORTED   ||
       status == pchealth.SHT_FAILED     )
    {
        idEvents.onBeforeContextSwitch = null;
        idEvents.onBeforeNavigate      = null;
        idEvents.onShutdown            = null;

        DISK_setstate( "ready" );
    }
}

////////////////////////////////////////////////////////////////////////////////

function SHARE_init()
{
    HideAll(); idMODE_share.style.display = "";

    SHARE_onClick_reset();
}


function SHARE_onClick_submit()
{
    for(var e = new Enumerator( idSHARE_resultTable.rows ); !e.atEnd(); e.moveNext())
    {
        var oRow = e.item();
        var oSKU = oRow.state_SKU; if(!oSKU) continue;

        if(oRow.state_Exported != oSKU.Exported)
        {
            oSKU.Exported = oRow.state_Exported;
        }
    }

    if(g_SelectedSKU_TS)
    {
        try
        {
            pchealth.RegWrite( REG_DEFAULTTERMINALSERVERSKU     , g_SelectedSKU_TS.SKU      );
            pchealth.RegWrite( REG_DEFAULTTERMINALSERVERLANGUAGE, g_SelectedSKU_TS.Language );

            g_TS_DefaultSKU      = g_SelectedSKU_TS.SKU;
            g_TS_DefaultLanguage = g_SelectedSKU_TS.Language;
        }
        catch(e)
        {
        }
    }
    else
    {
        try
        {
            pchealth.RegDelete( REG_DEFAULTTERMINALSERVERSKU      );
            pchealth.RegDelete( REG_DEFAULTTERMINALSERVERLANGUAGE );

            g_TS_DefaultSKU      = "";
            g_TS_DefaultLanguage = "";
        }
        catch(e)
        {
        }
    }

    SHARE_onClick_reset();
}

function SHARE_onClick_reset()
{
    var count   = 0;
    var options = idSHARE_ts.options;

    Common_ClearTable( idSHARE_resultTable );
    idSHARE_submit.disabled = true;
    idSHARE_reset .disabled = true;

    g_SelectedRow    = null;
    g_SelectedSKU    = null;
    g_SelectedSKU_TS = null;

    while(options.length) options.remove( 0 );

    g_collLocal = g_db.InstalledSKUs;
    for(var e = new Enumerator( g_collLocal ); !e.atEnd(); e.moveNext())
    {
        var sku = e.item();

        CreateRowForShare( sku, idSHARE_resultTable, options ); count++;
    }

    while(count < 4)
    {
        CreateRowForShare( null, idSHARE_resultTable, options ); count++;
    }
}

////////////////////

function SHARE_CheckIfModified()
{
    var fRes = true;

    for(var e = new Enumerator( idSHARE_resultTable.rows ); !e.atEnd(); e.moveNext())
    {
        var oRow = e.item();
        var oSKU = oRow.state_SKU; if(!oSKU) continue;

        if(oRow.state_Exported != oSKU.Exported)
        {
            fRes = false;
            break;
        }
    }

    if(g_SelectedSKU_TS)
    {
        if(g_SelectedSKU_TS.SKU != g_TS_DefaultSKU || g_SelectedSKU_TS.Language != g_TS_DefaultLanguage)
        {
            fRes = false;
        }
    }
    else
    {
        if(g_TS_DefaultSKU || g_TS_DefaultLanguage)
        {
            fRes = false;
        }
    }


    idSHARE_submit.disabled = fRes;
    idSHARE_reset .disabled = fRes;
}


function SHARE_onClick_radio()
{
    var obj = event.srcElement;

    if(obj.tagName == "INPUT" && obj.type == "radio")
    {
        this.state_Exported = obj.payload_state;
    }

    SHARE_CheckIfModified();
}

function SHARE_onChange_ts()
{
    var value = idSHARE_ts.options(idSHARE_ts.selectedIndex).value;

    g_SelectedSKU_TS = null;

    for(var e = new Enumerator( idSHARE_resultTable.rows ); !e.atEnd(); e.moveNext())
    {
        var oRow = e.item();
        var oSKU = oRow.state_SKU; if(!oSKU) continue;
        var id   = oSKU.SKU + oSKU.Language;

        if(id == value)
        {
            g_SelectedSKU_TS = oSKU;
            break;
        }
    }

    SHARE_CheckIfModified();
}

////////////////////////////////////////////////////////////////////////////////

function REMOVE_init()
{
    HideAll(); idMODE_remove.style.display = "";

    REMOVE_display();
}

function REMOVE_display()
{
    var count = 0;

    g_SelectedRow = null;
    g_SelectedSKU = null;

    Common_ClearTable( idREMOVE_resultTable );

    g_collLocal = g_db.InstalledSKUs;
    for(var e = new Enumerator( g_collLocal ); !e.atEnd(); e.moveNext())
    {
        var sku = e.item(); if(sku.CanUninstall == false) continue;

        CreateRowForSelect( sku, idREMOVE_resultTable ); count++;
    }

    while(count < 4)
    {
        CreateRowForSelect( null, idREMOVE_resultTable ); count++;
    }

    REMOVE_select();
}

function REMOVE_select()
{
    if(g_SelectedRow)
    {
        idREMOVE_exec.disabled = g_SelectedSKU.IsMachineHelp;
    }
    else
    {
        idREMOVE_exec.disabled = true;
    }
}


function REMOVE_onClick()
{
    if(g_SelectedSKU)
    {
        if(SameSKU( g_SelectedSKU, g_skuUser ))
        {
            pchealth.MessageBox( L_DenyUninstall1_Message + GetSKUDisplayName( g_skuUser ) + L_DenyUninstall2_Message, "OK" );
            return;
        }

        if(g_SelectedSKU.CanUninstall == false)
        {
            pchealth.MessageBox( L_DenyUninstall3_Message, "OK" );
            return;
        }

        idREMOVE_exec.disabled = true;

		g_executing = true;

        g_SelectedSKU.onStatusChange = REMOVE_notify;
        g_SelectedSKU.Uninstall();

        g_SelectedRow = null;
        g_SelectedSKU = null;
    }
}

function REMOVE_notify( obj, status, hr, file )
{
    if(status == pchealth.SHT_UNINSTALLED)
    {
        try
        {
            if(obj.SKU == g_TS_DefaultSKU && obj.Language == g_TS_DefaultLanguage)
            {
                pchealth.RegDelete( REG_DEFAULTTERMINALSERVERSKU      );
                pchealth.RegDelete( REG_DEFAULTTERMINALSERVERLANGUAGE );

                g_TS_DefaultSKU      = "";
                g_TS_DefaultLanguage = "";
            }

        }
        catch(e)
        {
        }
    }

    if(status == pchealth.SHT_UNINSTALLED ||
       status == pchealth.SHT_ABORTED     ||
       status == pchealth.SHT_FAILED       )
    {
        REMOVE_display();

		g_executing = false;
    }
}

////////////////////////////////////////////////////////////////////////////////

var obj  = pchealth.TextHelpers.ParseURL( window.location.href );
var mode = obj.GetQueryParameter( "mode" );

if(g_db.HasWritePermissions == false) mode = "Change"

switch(mode)
{
default          : mode = "Change";
case "Change"    : CHANGE_init(); break;
case "AddServer" : SERVER_init(); break;
case "AddDisk"   :   DISK_init(); break;
case "SetSharing":  SHARE_init(); break;
case "Remove"    : REMOVE_init(); break;
}

</SCRIPT>

</HTML>
