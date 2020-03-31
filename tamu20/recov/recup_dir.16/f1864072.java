)
{
    if(strStatusOverride.length > 0)
    {
        spanStatusText.innerText = strStatusOverride;
    }
}

//Use onLogon to detect when we've successfully logged on.
function onLogon()
{
    //Disable button, once we begin navigating all bets are off.
    //oFS.btnConnectAction.disabled = true;

    //Navigate to first online page.
    location.href = "signupServer.htm";
}

//Use onAbort to update page as needed.
function onAbort()
{
    setConnecting(false);
}

//Catch errors and route them back through the signup behavior for display.
//Update page as needed.
function onError(nError, strError, strHelpUrl, nFlags)
{
    setConnecting(false);

    //Show pop-up error dialog.
    var nRes = ShowErrorMessage("Connect Error", strError, true, nError, strHelpUrl, nFlags | MB_RETRYCANCEL);
    if(nRes == IDRETRY)
    {
        connect();
    }
    else
    {
        oDatastore.Set(DATAID_SIGNUP_STATUS, DATAKEY_SIGNUP_FAIL_DAIL);
        
        location.href = "dialOptions.htm";
    }
}

//-->
</script>


</head>
<body>

<SPAN STYLE="behavior: url(#msncf#dstimeonpage); display: none;" DataID="503" Scale="seconds">
</SPAN>

<form id="oFS" onsubmit="return(stub())">

<table id="tbl0" cellpadding="0" cellspacing="0"><tr><td id="td0" valign="top" height="5%">

<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>
<div id=divHR></div>
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0"><span class="head">Dialing....</span>

<div id="divControls" class="controls">

<p>
Please wait while we connect.
</p>


<table border="0">
  <tr>
    <td width="60" height="60"><span id="spanTempButterfly"><img id="imgBFly" idx=1 src="signup_butterfly_ani.gif" title="Butterfly animation"></span></td>
    <td width="280"><span id="spanStatusText" title="Dialing status"></span></td>

  </tr>
</table>


</div>


</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%" align="left">
<div id="divNav">

<div class="infotext">
<table cellpadding="0" cellspacing="0">
<tr><td>
</td></tr>
</table>
</div>

<br>
<div id=divHR></div>

<table id="tblNav" cellpadding="0" cellspacing="0" >
<tr><td height="5" id="tdnav1" align="left"></td>
<td align="right">

<button class="nav" id="btnBack" tabindex="42" dataFld="true" accesskey="b"><img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12"><u>B</u>ack</button>&nbsp;
<button class="nav" id="btnNext" tabindex="41" dataFld="true" type="submit" accesskey="c"><u>C</u>ontinue<img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12"></button>&nbsp;

</td></tr>
</table>

</div>

</td></tr></table>
</form>
</body>
</html>
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML//EN">
<html>
<head>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8">
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<link id="lnk0" rel="stylesheet" type="text/css" href="global.css">
<script language="jscript" src="global.js"></script>
<title>Dialing....</title>
<script LANGUAGE="javascript">
<!--

var NPX_NO_LOCAL_POP = 509;
var NPX_W_NO_POP_NUMBERS = 510;
var NUM_POP_FAILURES = 519;
var NUM_POP_ATTEMPTS = 520;
var g_fConnecting = false;
var oPopc;

function Init()
{
    //Hookup events for binary behavior (is there a better way?)
    oMarsSignup.OnProgress = onProgress;
    oMarsSignup.OnAbort = onAbort;
    oMarsSignup.OnError = onError;
    oMarsSignup.OnLogon = onLogon;
    oMarsSignup.OnSyncLogonCompleted = onSyncLogonCompleted;

    refreshLMObjects();

    //There should be no next button...
    oFS.btnNext.disabled = true;

    oPopc = oMarsSignup.Poptimize;
    spanNewNumber.innerText = oConnectors.Default.GetCustomProperty("phone").substr(0,3) +" "+ oConnectors.Default.GetCustomProperty("phone").substr(3)

    setConnecting(false);

    loadData();
    busyOn();
    busyOn();
    spanMsg.innerHTML = "Connecting...";
    onConnectAction();
}

function valiData()
{
    return true;
}
function saveData()
{
    saveIt();
}
function loadData()
{
}
function nav()
{
    saveData();
    if(event.srcElement.id != "btnBack")
    {
        if( !valiData() )
            return;

        location.href = "signupServer.htm";
    }
    else
    {
        abort();
        if(oMarsSignup.GetProperty("Travel"))
            location.href = "whereNow.htm";
        else
            location.href = "dialOptions.htm";

    }
    return false; //return false for form
}
function onConnectAction()
{
    connect();
}
function connect()
{
    //ConnectForSignup() is blocking.
    setConnecting(true);
    setTimeout("oMarsSignup.ConnectForSignup();", 100);
}
function abort()
{
    oMarsSignup.AbortConnectForSignup();
}
function setConnecting(fconn)
{
    g_fConnecting = fconn;
    if(g_fConnecting)
    {
        //Status stuff
        spanStatusText.innerText = "Preparing to connect...";
    }
    else
    {
        //Status stuff
        spanStatusText.innerText = "Dialing!!";
    }
}
function isConnecting()
{
    return g_fConnecting;
}

//-------------------------------------------------------------------------
// Handle events from the signup behavior
//

//Use onProgress to drive GUI display of dialing status.
function onProgress(nProgress, strStatusOverride)
{
    if(strStatusOverride.length > 0)
    {
        spanStatusText.innerText = strStatusOverride;
    }
}

function onLogon()
{
}


function onSyncLogonCompleted()
{
    var iRet,iNPA,iNXX;
    var sClientVersion = "MSN Explorer 2.x";
    var aRet; //Not Used..
    var iAccountID;
    var iPopCount = 0;

    //GetPops Using new Phone Number.
    iNPA = oConnectors.Default.GetCustomProperty("phone").substr(0,3);
    iNXX = oConnectors.Default.GetCustomProperty("phone").substr(3,3);

    iAccountID = oMarsSignup.AccountID ;

    if( isNaN(iAccountID) )
    {
        iAccountID = 0;
    }


    try{
        oDatastore.Increment(NUM_POP_ATTEMPTS, 1);

        oPopEntries = oPopc.DownloadPopEntries(iAccountID, iNPA, iNXX);
        iPopCount = oPopEntries.Count;

        if(iPopCount > 0)
        {
            if (!hasLocalPops())
            {
                oDatastore.Set(NPX_NO_LOCAL_POP, "" + iNPA + iNXX);
            }

            oPopc.SetPopEntries(oConnectors.Default, oPopEntries, true);
        }
        else
        {
            oDatastore.Set(NPX_W_NO_POP_NUMBERS, "" + iNPA + iNXX);
        }

	  }catch(e){
        oDatastore.Increment(NUM_POP_FAILURES, 1);
    }

    oMarsSignup.DisconnectSignup(true);

    if(iPopCount > 0)
    {
        oMarsSignup.PutProperty("ChangePop",true);
        window.location.href = "editPops.htm";
    }
    else
    {
       noPops();
    }
}

function hasLocalPops()
{
    var fLocalPop = false;
    try
    {
        var iCount = oPopEntries.Count;
        for (var i=0; i < iCount; ++i)
        {
            var oPopEntry = oPopEntries.Item(i);
            if (oPopEntry != null)
            {
                if (!oPopEntry.LongDistance)
                {
                    fLocalPop = true;
                    break;
                }
            }
        }
    }
    catch(e)
    {}

    return fLocalPop;
}

//Use onAbort to update page as needed.
function onAbort()
{
    setConnecting(false);

}

//Catch errors and route them back through the signup behavior for display.
//Update page as needed.
function onError(nError, strError, strHelpUrl, nFlags)
{
    setConnecting(false);

    var nRes = ShowErrorMessage("Connect Error", strError, true, nError, strHelpUrl, nFlags | MB_RETRYCANCEL);
    if(nRes == IDRETRY)
    {
        connect();
    }
    else
    {
        location.href = "dialOptions.htm";
    }
}

//-->
</script>


</head>
<body>
<form id="oFS" onsubmit="return(stub())">

<table id="tbl0" cellpadding="0" cellspacing="0"><tr><td id="td0" valign="top" height="5%">

<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>
<div id=divHR></div>
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0"><span class="head">Dialing....</span>



<div id="divControls" class="controls">

Retrieving numbers for <span id=spanNewNumber></span>

<p>
Please wait while we connect and gather new numbers for your area.
</p>

<table border="0">
  <tr>
    <td width="60" height="60"><span id="spanTempButterfly"><img id="imgBFly" idx=1 src="signup_butterfly_ani.gif"  title="Butterfly animation"></span></td>
    <td width="280"><span id="spanStatusText"></span></td>
  </tr>
</table>


</div>


</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%" align="left">
<div id="divNav">

<div class="infotext">
<table cellpadding="0" cellspacing="0">
<tr><td>
</td></tr>
</table>
</div>

<br>
<div id=divHR></div>

<table id="tblNav" cellpadding="0" cellspacing="0" >
<tr><td height="5" id="tdnav1" align="left"></td>
<td align="right">

<button class="nav" id="btnBack" tabindex="42" dataFld="true" accesskey="b"><img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12"><u>B</u>ack</button>&nbsp;
<button class="nav" id="btnNext" tabindex="41" dataFld="true" type="submit" accesskey="c"><u>C</u>ontinue<img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12"></button>&nbsp;

</td></tr>
</table>

</div>

</td></tr></table>
</form>
</body>
</html>
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML//EN">
<html>
<head>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8">
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<link id="lnk0" rel="stylesheet" type="text/css" href="global.css">
<script language="jscript" src="global.js"></script>
<title>Check your dialing options</title>
<script LANGUAGE="javascript">
<!--

var g_szNoModem = /* locstart signup.dialnomodem.err */ "We were unable to detect a modem.<br>Please check your Connection Settings and make sure the appropriate modem is selected." /*locend*/
function Init()
{
    positionNavBar();
    refreshLMObjects();
    loadData();
    toggleCallWaiting();
    toggleOutSideLine();

    oFS.chkOutsideLine.focus();
}
function valiData()
{
    if(oFS.chkOutsideLine.checked)
    {
        if (trim( oFS.txtOutsideLine.value) == "")
        {
            displayNote(oFS.txtOutsideLine,"Outside line","Please enter the number to dial for an outside line or unselect the option.")
            oFS.txtOutsideLine.focus();
            oFS.txtOutsideLine.select();
            return false;
        }
        else if(!validChars(oFS.txtOutsideLine.value, '0123456789,#*'))
        {
            displayNote(oFS.txtOutsideLine,"Outside line","You have entered an invalid character:  valid characters are 0 through 9, *, #, and comma.")
            oFS.txtOutsideLine.focus();
            oFS.txtOutsideLine.select();
            return false;
        }
    }

    if(oFS.chkCallWaiting.checked && trim( oFS.txtCallWaiting.value) == ""  )
    {
        displayNote(oFS.txtCallWaiting,"Call waiting","Please enter the code that will turn off call waiting or unselect the option.")
        oFS.txtCallWaiting.focus();
        return false;
    }

    return true;
}
function saveData()
{
    saveIt();

    //Set the current connector's dialing properties to reflect
    //the page.

    var oModem = oConnectors.Default;
    if(oModem != null && oModem.DeviceType.toLowerCase() == "modem")
    {
        //Update the dialing flags without overwriting others that might already be set.
        var nDialingFlags = oModem.DialingFlags;

        var strOutsideLine = trim(oFS.txtOutsideLine.value);
        if(oFS.chkOutsideLine.checked && strOutsideLine.length > 0)
        {
            nDialingFlags |= DIALFLAG_OUTSIDELINE;
            oModem.DialingPrefix = strOutsideLine;
        }
        else
        {
            nDialingFlags &= ~DIALFLAG_OUTSIDELINE;
        }

        var strCallWaiting = trim(oFS.txtCallWaiting.value);
        if(oFS.chkCallWaiting.checked && strCallWaiting.length > 0)
        {
            nDialingFlags |= DIALFLAG_CALLWAITING;
            oModem.CallWaitingPrefix = strCallWaiting;
        }
        else
        {
            nDialingFlags &= ~DIALFLAG_CALLWAITING;
        }

        if(oFS.chkNoTone.checked)
        {
            nDialingFlags |= DIALFLAG_PULSE;
        }
        else
        {
            nDialingFlags &= ~DIALFLAG_PULSE;
        }

        oModem.DialingFlags = nDialingFlags;
    }
    else
    {
       ShowErrorMessage ("MSN Explorer", g_szNoModem);
    }
}
function loadData()
{
    //Set the page to reflect dialing properties from the current connector.
    var oModem = oConnectors.Default;
    if(oModem != null && oModem.DeviceType.toLowerCase() == "modem")
    {
        //Grab the machine's TAPI settings to initially configure the modem.
        oMarsSignup.MigrateTapiSettings(oModem);

        var nDialingFlags = oModem.DialingFlags;
        if(nDialingFlags & DIALFLAG_OUTSIDELINE)
        {
            oFS.chkOutsideLine.checked = true;
            oFS.txtOutsideLine.value = oModem.DialingPrefix;
        }
        else
        {
            oFS.chkOutsideLine.checked = false;
        }

        if(nDialingFlags & DIALFLAG_CALLWAITING)
        {
            oFS.chkCallWaiting.checked = true;
            oFS.txtCallWaiting.value = oModem.CallWaitingPrefix;
        }
        else
        {
            oFS.chkCallWaiting.checked = false;
        }

        if(nDialingFlags & DIALFLAG_PULSE)
        {
            oFS.chkNoTone.checked = true;
        }
        else
        {
            oFS.chkNoTone.checked = false;
        }
    }
    else
    {
       ShowErrorMessage ("MSN Explorer", g_szNoModem);
    }
}
function nav()
{
    saveData();
    if(event.srcElement.id != "btnBack")
    {
        if( !valiData() )
            return;

        if( oMarsSignup.GetProperty("welcome") == "1" )
            location.href = "dial.htm";
        else
        {
            if( oMarsSignup.GetProperty("Travel") )
            {
                location.href = "whereNow.htm";
            }
            else
            {
                if( isIAUserPresent() )
                    location.href = "editPops.htm";
                else
                {
                    //if we don't have an account configured, need to add an account
                    oMarsSignup.PutProperty("SignupType","existMSNIA");
                    location.href = "dial.htm";
                }
            }
        }
    }
    else
    {
        if(ModemCount() > 1)
            location.href = "setDevice.htm";
        else
        {
            if( oMarsSignup.GetProperty("welcome") == "1" )
            {
                if(oMarsSignup.GetProperty("IAOnly") == "1" || oMarsSignup.GetProperty("RAC") == "1")
                {
                    location.href = "welcome.htm";
                    return;
                }
                if(oMarsSignup.GetProperty("SignupType") == "NewMSNIA" || oMarsSignup.GetProperty("SignupType") == "Upgrade")
                {
                    location.href = "newAccount.htm";
                    return;
                }

                location.href = "dialupornot.htm";
                return;
            }
            if(oMarsSignup.GetProperty("SignupType") == "NewMSNIA")
            {
                location.href = "newAccount.htm";
                return;
            }
            
            if(oMarsSignup.GetProperty("HowConnect")=="1")
                location.href = "howYouConnect.htm";
            else
                location.href = "changeConnSettings.htm";
        }

    }
    return false; //return false for form
}

function toggleOutSideLine()
{
    if(oFS.chkOutsideLine.checked)
    {
        oFS.txtOutsideLine.disabled = false;
        oFS.txtOutsideLine.style.backgroundColor = "window";        
        oFS.txtOutsideLine.style.color = "windowtext";
    }
    else
    {
        oFS.txtOutsideLine.value = "";
        oFS.txtOutsideLine.disabled = true;
        oFS.txtOutsideLine.style.backgroundColor = "inactivecaptiontext";
    }
}
function toggleCallWaiting()
{
    if(oFS.chkCallWaiting.checked)
    {
        oFS.txtCallWaiting.disabled = false;
        oFS.txtCallWaiting.style.backgroundColor = "window";
        oFS.txtCallWaiting.style.color = "windowtext";
    }
    else
    {
        oFS.txtCallWaiting.value = "";
        oFS.txtCallWaiting.disabled = true;
        oFS.txtCallWaiting.style.backgroundColor = "inactivecaptiontext";
    }
}

//-->
</script>

</head>
<body>

<SPAN STYLE="behavior: url(#msncf#dstimeonpage); display: none;" DataID="502" Scale="seconds">
</SPAN>

<form id="oFS" onsubmit="return(stub())">

<table id="tbl0" cellpadding="0" cellspacing="0"><tr><td id="td0" valign="top">
<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>
<div id=divHR></div>
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0">
<div class="head">Check your dialing options</div>
<span class="bluesubhead">
Do any of these special circumstances apply to the location that you are dialing from?
</span>

<BR><BR>

<div id="divControls" class="controls">

<table cellpadding="0" cellspacing="0"><tr><td >
<input type="checkbox" id="chkOutsideLine" value="on"  onclick="toggleOutSideLine()" tabindex="3" accesskey="o">
</td><td style="padding-left:15px;">
<label for="chkOutsideLine" accesskey="o">
I need to dial a number to reach an <u>o</u>utside line
</label>
</td><td style="padding-left:10px" >
<input type="text" id="txtOutsideLine" value="" maxlength=6  style="width:60;background-color:silver;"  tabindex="3" disabled>
</td></tr>
<tr><td></td><td></td><td nowrap >
<label for=txtOutsideLine style=display:none><span style="font-size:8pt;" class="smallblue">example 9</span></label>
</td></tr>

<tr><td style="padding-top:10px">&nbsp;</td></tr>

<tr><td>
<input type="checkbox" id="chkCallWaiting" value="on" onclick="toggleCallWaiting()" tabindex="4" accesskey="w">
</td><td style="padding-left:15px;">
<label for="chkCallWaiting" accesskey="w">
I need to dial a code to disable call <u>w</u>aiting
</label>
</td><td style="padding-left:10px;" align="left">
<input type="text" id="txtCallWaiting" value="" maxlength=6 style="width:60;background-color:silver;" tabindex="4" disabled>
</td></tr>
<tr><td></td><td></td><td nowrap >
<label for=txtCallWaiting style=display:none><span style="font-size:8pt;" class="smallblue">example *70</span></label>
</td></tr>

<tr><td style="padding-top:10px">&nbsp;</td></tr>

<tr><td >
<input type="checkbox" id="chkNoTone" value="on" tabindex="5">
</td><td style="padding-left:15px;">
<label for="chkNoTone" accesskey="t">
I do not have <u>t</u>ouch tone service
</label>
</div>
</td></tr>
<tr><td></td><td >
<span style="font-size:8pt;">&nbsp;</span>
</td></tr>
</table>

</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%">
<div id="divNav">
<div id=divHR></div>
<table id="tblNav" cellpadding="0" cellspacing="0" >
<tr><td height="5" id="tdnav1" align="left"></td>
<td align="right">

<button class="nav" id="btnBack" tabindex="42" dataFld="true" accesskey="b"><img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12"><u>B</u>ack</button>&nbsp;
<button class="nav" id="btnNext" tabindex="41" dataFld="true" type="submit" accesskey="c"><u>C</u>ontinue<img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12"></button>&nbsp;

</td></tr>
</table>

</div>

</td></tr></table>
</form>
</body>
</html>
<!-- LOCAPPLY - this file has been localized for LocApply -->
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML//EN">
<html>
<head>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8">
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<link id="lnk0" rel="stylesheet" type="text/css" href="global.css">
<script language="jscript" src="global.js"></script>
<title>Do you have an MSN Internet Access dial-up account?</title>
<script LANGUAGE="javascript">
<!--
function Init()
{
    var szBrand = BrandString(irgISPNAME);
    var szAAN = BrandString(irgISPAAN);

    var sNewTitle = "Do you have " + szAAN + " " + szBrand + " dial-up account?";

    setNewTitle(sNewTitle, spnHead, div0);

    lblIA.innerHTML = "<span class='bluesubhead'><u>Y</u>es.</span><br>I have " + szAAN + " " + szBrand +
                      " dial-up account.  Click this option if you have an existing " + szBrand + " account, if " +
                      "you have just signed up for " + szBrand + " with a participating retailer or computer manufacturer, or " + 
                      "if you have just upgraded from a free msn.com/hotmail.com account to " + szBrand + ".";
    bodyWrap.style.visibility = "";
    refreshLMObjects();
    loadData();
}
function valiData()
{
    return true;
}
function saveData()
{
    if( oFS.radOtherInteret.checked )
    {
        oMarsSignup.PutProperty("LANDSL","1")
        oMarsSignup.PutProperty("SignupType","Other");
        setOnlyConnectorAsDefault("lan");
    }
    else
        oMarsSignup.PutProperty("SignupType","existMSNIA");
}
function loadData()
{
    if( oMarsSignup.GetProperty("LANDSL") == "1" )
    {
        oFS.radOtherInteret.checked = true;
        deferredFocus(oFS.radOtherInteret);
    }
    else
    {
        oFS.radExistingMSNIA.checked = true;
        deferredFocus(oFS.radExistingMSNIA);
    }
}
function nav()
{
    saveData();
    if(event.srcElement.id != "btnBack")
    {
        if( !valiData() )
            return;

        if( oFS.radOtherInteret.checked )
        {
            AddLanConnectors();
            setOnlyConnectorAsDefault("lan");

            location.href = "signupServer.htm";
        }
        else
            setupForModem();
    }
    else
    {
        //if( oMarsSignup.GetProperty("welcome") == "1" )
        location.href = "newAccount.htm";

    }
    return false; //return false for form
}
//-->
</script>

</head>
<body>
<span id=bodyWrap style="visibility:hidden">
<form id="oFS" onsubmit="return(stub())">

<table id="tbl0" cellpadding="0" cellspacing="0"><tr><td id="td0" valign="top" height="5%">

<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>
<div id=divHR></div>
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0"><span id=spnHead class="head">
</span>

<div class="controls">
<table>
<tr><td valign="top" class="radpadding">

<input type="radio" id="radExistingMSNIA" name="grpNewIA" tabindex="1" accesskey="y">

</td><td>

<label id=lblIA for="radExistingMSNIA">
</label>

</td></tr>

<tr><td colspan=2 class="spacer">

<tr><td valign="top" class="radpadding">

<input type="radio" id="radOtherInteret" name="grpNewIA" tabindex="1" accesskey="n">

</td><td>

<label for="radOtherInteret">
<span class="bluesubhead">
<u>N</u>o.
</span>
<br>
I connect to the Internet using another Internet service provider, or one of the following: MSN HighSpeed Internet Access, LAN, DSL, cable modem, or satellite connection. You will connect through your default Internet connection.
</label>

</td></tr>


</table>

</div>

</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%" align="left">
<div id="divNav">

<div class="infotext">
<button tabindex="2" class="infobutton" id="btnInfo" accesskey="k" TITLE="Click here, if you are unsure about what to pick.." onclick="showHelp('help_options.htm')">
<img id="imgInfo" src="msn://@signup.mar@/signup_info.gif" align="left" style="vertical-align: middle;">
Clic<u>k</u> here, if you are unsure about what to pick.
</button>
</div>

<br>

<div id=divHR></div>

<table id="tblNav" cellpadding="0" cellspacing="0" >
<tr><td height="5" id="tdnav1" align="left"></td>
<td align="right">

<button class="nav" id="btnBack" tabindex="42" dataFld="true" accesskey="b"><img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12"><u>B</u>ack</button>&nbsp;
<button class="nav" id="btnNext" tabindex="41" dataFld="true" type="submit" accesskey="c"><u>C</u>ontinue<img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12"></button>&nbsp;

</td></tr>
</table>

</div>

</td></tr></table>
</form>
</span>
</body>
</html>
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML//EN">
<html>
<head>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8">
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<link id="lnk0" rel="stylesheet" type="text/css" href="global.css">
<script language="jscript" src="global.js"></script>
<title>Edit your access numbers</title>

<script LANGUAGE="javascript">
<!--
var oPopc;
var oPopEntries;

var chkUseArr;
var chkDialLongArr;
var chkAreaCodeArr;
var tdAreaCodeArr;
var tdLocationArr;
var spanLongDistanceArr;
var spanAreaCodeArr;
var g_Check = false;
var g_fSR = false;

function Init()
{
    var iZeroPopCount;

    if(location.search.indexOf("check") >= 0)
        setCheckScreen();

	
    refreshLMObjects();

    g_fSR = oUtils.isScreenReaderActive;

    oPopc = oMarsSignup.Poptimize;
    oPopEntries = oPopc.PopEntries(oConnectors.Default);

    if(location.search.indexOf("addPop") >= 0)
    {
       dispAddPop();
       return;
    }

    if(oPopEntries.count == 0)
    {
        noPops();
        return;
    }

    spnChooseWell.innerText = "Please choose your access numbers carefully, as you will not be reimbursed for telephone charges incurred while connected to " + BrandString(irgISPNAME) + ".";

    loadData();
    dispPops();
}

function validAddNumber()
{
    if (oFS.txtNewPopAreaCode.value.length < 3){
        displayNote(oFS.txtNewPopAreaCode,'Area Code','Area code requires 3 numbers.',5);
        oFS.txtNewPopAreaCode.focus();
        return false;
    }
    if (oFS.txtNewPopAreaCode.value == ''){
            displayNote(oFS.txtNewPopAreaCode,'Area Code','Please enter your area code.',5);
            oFS.txtNewPopAreaCode.focus();
            return false;
    }
    if (oFS.txtNewPopPhone.value.length < 7){
      displayNote (oFS.txtNewPopPhone, "Phone number","A phone number requires 7 numbers.");
            oFS.txtNewPopPhone.focus();
            return false;
    }
    if (oFS.txtNewPopPhone.value == ''){
            displayNote(oFS.txtNewPopPhone,'Phone Number','Please enter your phone number.');
            oFS.txtNewPopPhone.focus();
            return false;
    }

    if( !validChars(oFS.txtNewPopAreaCode.value, '0123456789') ){
        displayNote(oFS.txtNewPopAreaCode,'Area Code','Area codes can only contain numbers.');
        oFS.txtNewPopAreaCode.focus();
        return false;
    }
    if( !validChars(oFS.txtNewPopPhone.value, '0123456789- ') ){
        displayNote (oFS.txtNewPopPhone, "Phone number","A phone number can only contain numbers.");
        oFS.txtNewPopPhone.focus();
        return false;
    }

    if (! oFS.txtNewPopPhone.value.match(/^\d{3}[-\ ]?(\d{4})?$/) )
    {
        displayNote (oFS.txtNewPopPhone, "Phone number", "Phone number must be of the form XXX-XXXX.");
        oFS.txtNewPopPhone.focus();
        return false;
    }
    
    if (!oFS.chkUnderstand.checked){
            displayNote(oFS.chkUnderstand,'Long Distance','Please read the text and check the box.');
            return false;
    }
    return true;
}

function addNumber()
{
    if(!validAddNumber())
        { return; }

    oPopEntries.Clear();

    var oNewPop = oPopEntries.Add();

    oNewPop.Location = "Custom Number";
    oNewPop.Number = oFS.txtNewPopAreaCode.value.toString() + oFS.txtNewPopPhone.value.toString();

    if(oFS.chkDial1.checked)
        oNewPop.LongDistance = true;

    if(oFS.chkDialArea.checked)
        oNewPop.TenDigit = true;

    oDatastore.SetBool(DATAID_SIGNUP_POPOVERRIDE, 1);

    oPopc.SetPopEntries(oConnectors.Default, oPopEntries, true);

    if(g_Check)
        location.href = "editPops.htm?check";
    else
        location.href = "editPops.htm";

}

function dispAddPop()
{
    divPopEdit.style.display = "none";
    divText.style.display = "none";
    divAddPop.style.display = "inline";

    setNewTitle("No Access Numbers Found", spanHead, div0);
	spanISP_SUPPORT_NUMBER.innerText = BrandString(irgISPSUPPORT)+" ";
	spanISPNAME[0].innerText = BrandString(irgISPSHORTNAME)+" ";
	spanISPNAME[1].innerText = BrandString(irgISPSHORTNAME)+" ";
    oFS.txtNewPopAreaCode.focus();
}

function setCheckScreen()
{
//just used for debugging.

    spanHead.innerHTML = "";
    divText.innerHTML = "";
    divNav.innerHTML = "";
    td0.innerHTML = "";
    spanHead.style.display= "none";
    divText.style.display= "none";
    divNav.style.display= "none";
    td0.style.display= "none";
    document.body.style.marginLeft = "1px";
    document.body.style.marginRight = "1px";
    document.body.style.marginTop = "1px";
    document.body.style.marginBottom = "1px";
    divPopEdit.style.width="100%";
    divPopEdit.style.height="100%";
    g_Check = true;
}

function valiData()
{
    if(divPopEdit.innerHTML != "")
    {
        setArrays();

        var iChecked = 0;
        for(var iUsed = 0; iUsed < chkUseArr.length; iUsed++)
        {
            if(chkUseArr[iUsed].checked)
                iChecked++;
        }

        if(iChecked == 0)
        {
            ShowErrorMessage('Phone Numbers','You need to select at least one access number.  If there are no local access numbers listed that you wish to dial, you may wish to cancel this account.');
            return false;
        }

    }
    return true;
}
function saveData()
{
    if (oPopc != null)
    {
        oPopc.PopEntries(oConnectors.Default) = oPopEntries;
    }

    saveIt();
}

function setInterface(i)
{
//disabled used and non used numbers.
    var fEnabled;

    setArrays();

    var nPops = 0;
    if(trPop != null)
    {
        if(typeof(trPop.length) == "number")
            nPops = trPop.length;
        else
            nPops = 1;
    }
    
        fEnabled = chkUseArr[i].checked;

        chkDialLongArr[i].disabled = !fEnabled;
        
        chkAreaCodeArr[i].disabled = !fEnabled;

        if(fEnabled)
        {
            tdAreaCodeArr[i].style.color = "black";
            tdLocationArr[i].style.color = "black";

            if(chkDialLongArr[i].checked)
                spanLongDistanceArr[i].style.color = "black";
            else
                spanLongDistanceArr[i].style.color = "silver";

            if(chkAreaCodeArr[i].checked)
                spanAreaCodeArr[i].style.color = "black";
            else
                spanAreaCodeArr[i].style.color = "silver";

        }
        else
        {
            tdAreaCodeArr[i].style.color = "silver";
            tdLocationArr[i].style.color = "silver";
        }
}

function setArrays()
{
    if(typeof(oFS.chkUse.length) == "number")
    {
        //Set references to existing arrays.
        chkUseArr           = oFS.chkUse;
        chkDialLongArr      = oFS.chkDialLong;
        chkAreaCodeArr      = oFS.chkAreaCode;
        tdAreaCodeArr       = tdAreaCode;
        tdLocationArr       = tdLocation;
        spanLongDistanceArr = spanLongDistance;
        spanAreaCodeArr     = spanAreaCode;
    }
    else
    {
        //Create arrays of one element.
        chkUseArr           = new Array(oFS.chkUse);
        chkDialLongArr      = new Array(oFS.chkDialLong);
        chkAreaCodeArr      = new Array(oFS.chkAreaCode);
        tdAreaCodeArr       = new Array(tdAreaCode);
        tdLocationArr       = new Array(tdLocation);
        spanLongDistanceArr = new Array(spanLongDistance);
        spanAreaCodeArr     = new Array(spanAreaCode);
    }
}

    var i;
    var sBuffer;
    var iTabIndex;
    var cEntries;
    var cChecked;
    var oPop;
    var sDetails;
    var sNXX;
    var sAreaCode;
    var sPhNum;

// screenreader friendly version of dispPops, called by dispPops for each row.
function dispSRPopRow()
{

   var sTitle;

   if(g_Check)
       sBuffer += "<tr id=trPop title='" + sDetails + "' popIndex='" + i + "' >";
   else
       sBuffer += "<tr id=trPop popIndex='" + i + "' >";

   /* begin number col & city */
   sBuffer += "<td tabindex=-1 id=tdAreaCode popIndex='" + i + "'  align='left' >";

   //  Add a tab index around the phone number so that screen readers and magnifiers will get a chance to stop by...
   sBuffer += "<span tabIndex=" + iTabIndex + ">";

   sBuffer += "Access Number " + (i+1) + ":<br> (" + sAreaCode + ") " + sNXX + "-" + sPhNum + ", in " + oPop.Location;

   sBuffer += "</span></td>";
   /* end number col */


   /* begin use col */
   sBuffer += "<td>";

   sTitle = "Use "+ sNXX +"-"+ sPhNum;

   sBuffer += "<input tabindex="+iTabIndex+" type=checkbox id='chkUse"+i+"' name='chkUse' popIndex='" + i + "'";
   ++iTabIndex;

   sBuffer += " title='" + sTitle + "' ";

   fNotUsed = oPop.DontUseNumber;
   if(!fNotUsed && !oPop.LongDistance && cChecked < 4)
   {
       sBuffer += " checked ";
       ++cChecked;
   } else {
      oPop.DontUseNumber = true;
   }

   sBuffer += " onclick='return usePop()'>";
   sBuffer += "<label for='chkUse"+i+"'>" + sTitle + "</label>";

   ++iTabIndex;

   sBuffer += "</td>";
   /* end use col */

   /* begin dial area code col */
   sBuffer += "<td>";

   sTitle = "Include the area code " + sAreaCode + " when dialing " + sNXX + "-" + sPhNum;

   sBuffer += "<input tabindex="+iTabIndex+" type=checkbox id='chkAreaCode"+i+"' name='chkAreaCode' popIndex='" + i + "'";

   ++iTabIndex;

   sBuffer += " title='Include the area code " + sAreaCode + " when dialing " + sNXX + "-" + sPhNum + "' ";

   if(oPop.TenDigit)
       sBuffer += " checked ";
   sBuffer += " onclick='setAreaCode()'>";
   sBuffer += "<label for='chkAreaCode"+i+"'>" + sTitle + "</label>";

   //sBuffer += "<label for='chkAreaCode" + i + "' style='display:none'>" + sTitle + "</label></td>";
   sBuffer += "</td>";

   ++iTabIndex;
   /* end dial area code col */


   /* begin dial 1 col */
   sBuffer += "<td>";

   sTitle = "Add a 1 when dialing "+ sAreaCode +" "+ sNXX +"-"+ sPhNum;

   sBuffer += "<input tabindex="+iTabIndex+" type=checkbox id='chkDialLong"+i+"' name='chkDialLong' popIndex='" + i + "'";
   ++iTabIndex;

   sBuffer += " title='Add a 1 when dialing "+ sAreaCode +" "+ sNXX +"-"+ sPhNum + "' ";

   if(oPop.LongDistance)
       sBuffer += " checked ";

   sBuffer += " onclick='setDialLong()'>";
   sBuffer += "<label for='chkDialLong"+i+"'>" + sTitle + "</label>";

   // These need to be here for script purposes but not display.
   sBuffer += "<span style='display:none' tabindex=-1 id='spanLongDistance' popIndex='" + i + "'></span>";
   sBuffer += "<span style='display:none' tabindex=-1 id='spanAreaCode' popIndex='" + i + "'></span>";

   // sBuffer += "<label for='chkDialLong" + i + "' style='display:none'>" + sTitle + "</label></td>";
   sBuffer += "</td>";

   ++iTabIndex;
   /* end dial 1 col */

   /* begin city col */
   sBuffer += "<td>&nbsp;&nbsp;</td><td tabindex=-1 id=tdLocation popIndex='" + i + "' ></td>";
   /* end city col */

   sBuffer += "</tr>";
}

function dispPops()
{
    var iRealCount = 0;
    var fNotUsed = false;
    iTabIndex = 200;
    var sTitle = "";
    var sToDial = " to dial " + BrandString(irgISPSHORTNAME) + ".";
    cChecked = 0;

    sBuffer = "<table id=tblPopNums width='100%' cols=5 cellpadding=0 cellspacing=0>";

    if (g_fSR) {
       sBuffer += "<colgroup style='padding-bottom:10px'><col valign=top></col><col valign=top></col><col valign=top></col><col valign=top></col><col valign=top></col></colgroup>";
    }

    cEntries = oPopEntries.Count;
    for(i=0;i < cEntries ;i++)
    {
        oPop = oPopEntries.Item(i);
        sAreaCode = oPop.Number.substr(0,3);
        sNXX = oPop.Number.substr(3,3);

        if(sAreaCode == "")
            sAreaCode = oConnectors.Default.AreaCode;

        sDetails = "Location = "+ oPop.Location;
        sDetails += "\nNumber = "+ oPop.Number;
        sDetails += "\nCostPerMinute = "+  oPop.CostPerMinute;
        sDetails += "\nFlags = "+  oPop.Flags;
        sDetails += "\nTenDigit = "+  oPop.TenDigit;
        sDetails += "\nLongDistance = "+  oPop.LongDistance;
        sDetails += "\nBillable = "+  oPop.Billable;
        sDetails += "\nHidden = "+  oPop.Hidden;
        sDetails += "\nDontUseNumber = "+  oPop.DontUseNumber;
        sDetails += "\nNotUserVerified = "+  oPop.NotUserVerified;

        sPhNum = oPop.Number.substr(6);

        //unfortunately, getting a blank Nxx, filtering this until popc is debugged, possibly sent from MSNIA too.
        if(sNXX != "")
        {

            iRealCount++;

            if (g_fSR) {
               dispSRPopRow();
               continue;
            }

            /* begin use col */
            if(g_Check)
                sBuffer += "<tr id=trPop title='" + sDetails + "' popIndex='" + i + "' >";
            else
                sBuffer += "<tr id=trPop popIndex='" + i + "' >";

            sBuffer += "<td align=center width=40>";

            sBuffer += "<input tabindex="+iTabIndex+" type=checkbox id='chkUse' name='chkUse" + i + "' popIndex='" + i + "'";
            ++iTabIndex;

            sTitle = "Select to use "+ sNXX +"-"+ sPhNum + sToDial;
            sBuffer += " title='" + sTitle + "'"

            fNotUsed = oPop.DontUseNumber;
            if(!fNotUsed && !oPop.LongDistance && cChecked < 4)
            {
                sBuffer += " checked ";
                ++cChecked;
            } else {
               oPop.DontUseNumber = true;
            }

            sBuffer += " onclick='return usePop()'>";

            ++iTabIndex;

            sBuffer += "</td>";
            /* end use col */
               
            /* begin number col */
            sBuffer += "<td tabindex=-1 id=tdAreaCode popIndex='" + i + "'  align='left' >";

            //  Add a tab index around the phone number so that screen readers and magnifiers will get a chance to stop by...
            sBuffer += "<span tabIndex=" + (oUtils.isScreenReaderActive ? iTabIndex : -1) + "><b>";
            
            sBuffer += "<b><span tabindex=-1 id='spanLongDistance' popIndex='" + i + "'> 1 </span></b>";

            sBuffer += "<b><span tabindex=-1 id='spanAreaCode' popIndex='" + i + "'> (" + sAreaCode +") </span></b>";

            sBuffer += sNXX +"-"+ sPhNum

            sBuffer += "</span></b></td>";
            /* end number col */

            /* begin city col */
            sBuffer += "<td align='left'>&nbsp;&nbsp;</td><td tabindex=-1 id=tdLocation popIndex='" + i + "' ><b>";

            //  Add a tab index around the location so that screen readers and magnifiers will get a chance to stop by...
            sBuffer += "<span tabIndex=" + (oUtils.isScreenReaderActive ? iTabIndex : -1) + "><b>";

            sBuffer += oPop.Location;

            sBuffer += "</span></b></td>";
            /* end city col */

            /* begin dial 1 col */
            sBuffer += "<td align=center width=40>";

            sBuffer += "<input tabindex="+iTabIndex+" type=checkbox id='chkDialLong' name='chkDialLong" + i + "' popIndex='" + i + "'";
            ++iTabIndex;

            sTitle = "Select to dial 1 when dialing "+ sAreaCode +" "+ sNXX +"-"+ sPhNum + sToDial;
            sBuffer += " title='" + sTitle + "' ";

            if(oPop.LongDistance)
                sBuffer += " checked ";
            sBuffer += " onclick='setDialLong()'>";

            //sBuffer += "<label for='chkDialLong" + i + "' style='display:none'>" + sTitle + "</label></td>";
            sBuffer += "</td>";

            ++iTabIndex;
            /* end dial 1 col */
            
            /* begin dial area code col */
            sBuffer += "<td align='center' width=100>";

            sBuffer += "<input tabindex="+iTabIndex+" type=checkbox id='chkAreaCode' name='chkAreaCode" + i + "' popIndex='" + i + "'";

            ++iTabIndex;

            sTitle = "Select to dial " + sAreaCode + " when dialing " + sNXX + "-" + sPhNum + sToDial;

            sBuffer += " title='" + sTitle + "' ";
            if(oPop.TenDigit)
                sBuffer += " checked ";
            sBuffer += " onclick='setAreaCode()'>"

            //sBuffer += "<label for='chkAreaCode" + i + "' style='display:none'>" + sTitle + "</label></td>";
            sBuffer += "</td>";

            ++iTabIndex;
            /* end dial area code col */

            sBuffer += "</tr>";
        }

    }

    sBuffer += "</table>";

    if(iRealCount == 0)
    {
        noPops();
        return;
    }
    else
    {
        var MSNRegKey = oMarsSignup.RegKey;
        MSNRegKey.Init("HKCU","Software\\Microsoft\\MSN6\\Signup",true);
        MSNRegKey.WriteValue("ZeroPopCount",1);

    }

    if (!g_fSR) {
       divPopHdr.style.visibility="";
    }
    divPopEdit.innerHTML = sBuffer;

    for(i=0;i < cEntries;i++)
    {
      setInterface(i);
    }
}
function setAreaCode()
{
    var iIndex = parseInt(event.srcElement.popIndex,10);
    var i=0;
    var oPop = oPopEntries.Item(iIndex);

    oPop.TenDigit = event.srcElement.checked;
    oPopc.PopEntries(oConnectors.Default) = oPopEntries;

    setInterface(iIndex);

}
function setDialLong()
{
    var iIndex = parseInt(event.srcElement.popIndex,10);
    var i=0;
    var oPop = oPopEntries.Item(iIndex);

    if(event.srcElement.checked){
        oPop.TenDigit = true;
    }

    oPop.LongDistance = event.srcElement.checked;
    oPopc.PopEntries(oConnectors.Default) = oPopEntries;

    setInterface(iIndex);

}
function usePop()
{
    var iIndex = parseInt(event.srcElement.popIndex,10);
    var i=0;
    var oPop = oPopEntries.Item(iIndex);

    if(!valiData())
       return false;

    oPop.DontUseNumber = !event.srcElement.checked;
    oPopc.PopEntries(oConnectors.Default) = oPopEntries;

    setInterface(iIndex);
}

function loadData()
{
}

function nav()
{
    saveData();
    if(event.srcElement.id != "btnBack")
    {
        if(divAddPop.style.display != "none")
        {
            addNumber();
            return;
        }

        if( !valiData() )
            return;

        oMarsSignup.CloseSignupWindow();
    }
    else
    {
        if( !valiData() )
            return;

        if(oMarsSignup.GetProperty("ChangeConnection"))
            location.href = "dialOptions.htm";
        else
            location.href = "dialOptions.htm";

    }
    return false; //return false for form
}
//-->
</script>

</head>
<body>
<form id="oFS" onsubmit="return(stub())">

<table id="tbl0" cellpadding="0" cellspacing="0"><tr><td id="td0" valign="top" height="5%">

<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>
<div id=divHR></div>
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0"><span id="spanHead" class="head">Edit your access numbers</span>
<div id="divText">
To add or remove a number, click the box under 'use'.
If you need to dial a 1 or an area code with the selected number, click to select the appropriate checkboxes.

<br><br>
<span id=spnChooseWell style="color:red"></span>
<br><br>
Click <b>Continue</b> when you are done.
<br><br>
</div>

<div id="divAddPop" style="display:none;">
Sorry, we were unable to find local dial-up Internet access phone numbers in your area.
<br>

If you would like to change the Dialing From phone number, click Back.

<br><br>

If the problem persists, please call support at <span id="spanISP_SUPPORT_NUMBER"></span> to determine if there are local dial-up Internet access phone numbers in your area.

<br><br>
If customer support has given you a local access number, or you already know of a local dial-up Internet access number you can dial, please type the phone number and area code below.   

<br><br>


<span style="color:red">You are responsible for all charges related to using this number.  <span id="spanISPNAME"></span> will <b>NOT</b> reimburse you for any telephone charges incurred while using this phone number to connect to <span id="spanISPNAME"></span>.</span>
<input type="checkbox" id="chkUnderstand" tabindex="1"><label accesskey="u" for="chkUnderstand" ><b>I <u>u</u>nderstand</b>.</label>

<br><br>

    <table >
    <tr><td valign="bottom">
    </td><td>
        <label for="txtNewPopAreaCode" accesskey="a"><b><u>A</u>rea Code</b></label>
    </td><td>
        <label for="txtNewPopPhone" accesskey="p"><b><u>P</u>hone Number</b></label>
    </td></tr>
    <tr><td>
        Number to dial:
    </td><td>
        <input type="text" id="txtNewPopAreaCode" maxlength=3 style="width:65px;" tabindex="2" title="Enter new area code here">
    </td><td>
        <input type="text" id="txtNewPopPhone" maxlength=8 style="width:220px;" tabindex="3" title="Enter new phone number here.">
    </td></tr>

    <tr><td></td><td colspan="2">
        <input type="checkbox" id="chkDial1" accesskey="d" tabindex="4">&nbsp;<label for="chkDial1"><b><u>D</u>ial 1</b></label>
    </td></tr>
    <tr><td></td><td colspan="2">
        <input type="checkbox" id="chkDialArea" accesskey="r" tabindex="5">&nbsp;<label for="chkDialArea"><b>Dial A<u>r</u>ea code</b></label>
    </td></tr>
    </table>


</div>

<div id="divPopHdr" style="background-color:#F6F7FB;width:550px;border:0 inset silver;visibility:hidden">
<table cols=6 width='100%' cellpadding=0 cellspacing=0>
  <tr style='background-color:#B4C5F0;' >
    <td align=center width=40><b>Use</b></td>
    <td align=center><b>Number Dialed</b></td>
    <td align=center width=215><b>City</b></td>
    <td align=center width=40><b>Dial 1</b></td>
    <td align=center width=110><b>Area Code</b></td>
    <td>&nbsp;</td>
  </tr>
</table>
</div>
<div id="divPopEdit" style="background-color:#F6F7FB;width:550px;height:160px;border:2 inset silver;overflow-y:scroll;"></div>

</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%" align="left">
<div id="divNav">

<div id=divHR></div>

<table id="tblNav" cellpadding="0" cellspacing="0" >
<tr><td height="5" id="tdnav1" align="left"></td>
<td align="right">

<button class="nav" id="btnBack" onclick="nav()" tabindex="42" dataFld="true" accesskey="b"><img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12"><u>B</u>ack</button>&nbsp;
<button class="nav" id="btnNext" onclick="nav()" tabindex="41" dataFld="true" type="submit" accesskey="c"><u>C</u>ontinue<img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12"></button>&nbsp;

</td></tr>
</table>

</div>




</form>

</body>
</html>
