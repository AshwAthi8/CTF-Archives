tent-Type" CONTENT="text/html; charset=utf-8">
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<link id="lnk0" rel="stylesheet" type="text/css" href="global.css">
<script language="jscript" src="global.js"></script>
<title>
<!-- locstart connect.title.label/Title for Connection Page -->
Select how you want to connect to the Internet
<!-- locend -->
</title>
<script LANGUAGE="javascript">
<!--
function Init()
{
    var szBrand = BrandString(irgISPNAME);
    oMarsSignup.PutProperty("HowConnect","1");
    StoreCurrentConnector();

    lblExistingMSNIA.innerHTML = "<span class='bluesubhead' id='spanExistingMSNIA'>" + BrandString(irgISPSHORTNAME) +
                                 /* locstart connect.dialup.label/MSN Dislup Label */ "  <u>I</u>nternet Access" /*locend*/ +
                                 "</span><br>" + 
                                 /* locstart connect.dialup.desc/Description for Connection Page */

                                 "Choose this if you are already a Dial-up  " + szBrand + " subscriber "
                                 /*locend*/ +
                                 "<span id='spanUpgrade' style='display:hidden'> or if you would like to upgrade an <b>existing</b> account on this machine to use " +
                                 szBrand + "</span>.";

    bodyWrap.style.visibility="";
    refreshLMObjects();
    loadData();
    deferredFocus(document.body);
}
function valiData()
{
    return true;
}
function saveData()
{
    if( oFS.radOtherInteret.checked )
    {
        oMarsSignup.PutProperty("SignupType","Other");
        AddLanConnectors();
        setOnlyConnectorAsDefault("lan");
    }
    else
        oMarsSignup.PutProperty("SignupType","existMSNIA");
}
function loadData()
{
    if( ( !oMarsSignup.IsAccountInfoConfigured() ) && USMarket() )
        spanUpgrade.style.display = "inline";

    if( !USMarket() ) //disabled MSNIA on non usmarket.
    {
        spanExistingMSNIA.style.color = "silver";
        lblExistingMSNIA.style.color = "silver";
        oFS.radExistingMSNIA.disabled = true;
        oFS.radOtherInteret.checked = true;
        return;
    }

    if( oMarsSignup.GetProperty("SignupType") == "Other" )
        oFS.radOtherInteret.checked = true;
    else
        oFS.radExistingMSNIA.checked = true;
}
function nav()
{
    saveData();
    if(event.srcElement.id != "btnBack")
    {
        if( !valiData() )
            return;


        if( oMarsSignup.GetProperty("welcome") == "1" )
            if( oFS.radOtherInteret.checked )
                location.href = "signupServer.htm";
            else
                setupForModem();
        else
        {
            if( oFS.radOtherInteret.checked )
                oMarsSignup.OnSignupCancelled();
            else
            {
                if( isIAUserPresent() )
                {
                    setupForModem();
                }
                else
                {
                    oMarsSignup.PutProperty("Upgrade","Current");
                    setupForModem();
                }
            }
        }

    }
    else
    {
        if( oMarsSignup.GetProperty("welcome") == "1" )
            location.href = "newAccount.htm";
        else
            location.href = "changeConnSettings.htm";
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
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0"><span class="head">
<!-- locstart connect.title.label/Title for Connection Page -->
Select how you want to connect to the Internet
<!-- locend -->
</span>



<BR><BR>

<table>
<tr><td valign="top">

<input type="radio" id="radExistingMSNIA" name="grpNewIA" tabindex="1" ACCESSKEY.loc="[! connect.dialup.key ]"  accesskey="i">

</td><td>

<label for="radExistingMSNIA" id="lblExistingMSNIA"></label>

</td></tr>

<tr><td colspan=2 class="spacer">

<tr><td valign="top">

<input type="radio" id="radOtherInteret" name="grpNewIA" tabindex="1" ACCESSKEY.loc="[! connect.existingisp.key ]" accesskey="e">

</td><td>

<label for="radOtherInteret">
<span class="bluesubhead">
<!-- locstart connect.existing.label/Existing Dialup Label -->
<u>E</u>xisting Internet service provider (ISP) or MSN Broadband
<!-- locend -->
</span>
<br>
<!-- locstart connect.existing.desc/Descriptionf or existing dialup user -->
Choose this if you already connect to the Internet using another Internet service provider, or one of the following:
MSN Broadband, LAN, DSL, cable modem, or satellite connection.
You will connect through your default Internet connection.
<!-- locend -->
</label>

</td></tr>


</table>


</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%" align="left">

<div id=divHR></div>

<table id="tblNav" cellpadding="0" cellspacing="0" >
<tr><td height="5" id="tdnav1" align="left"></td>
<td align="right">

<button class="nav" id="btnBack" tabindex="42" dataFld="true" ACCESSKEY.loc="[! navigation.back.key ]" accesskey="b"><img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12">
<!-- locstart navigation.back.label/Label for back button -->
<u>B</u>ack
<!-- locend -->
</button>&nbsp;
<button class="nav" id="btnNext" tabindex="41" dataFld="true" type="submit" ACCESSKEY.loc="[! navigation.continue.key ]" accesskey="c">
<!-- locstart navigation.continue.label/Label for continue button -->
<u>C</u>ontinue<!-- locend --><img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12"></button>&nbsp;

</td></tr>
</table>

</div>

</td></tr></table>
</form>
</span>
</body>
</html>
