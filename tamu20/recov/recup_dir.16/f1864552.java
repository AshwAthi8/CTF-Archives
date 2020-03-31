        oMarsSignup.PutProperty("SignupType","Upgrade");
        oMarsSignup.PutProperty("Upgrade","New");
    }
    else
    {
        oMarsSignup.PutProperty("SignupType", "Other");
        oMarsSignup.PutProperty("Upgrade","");
    }

    oMarsSignup.SaveInfo();
}
function loadData()
{
    if(oMarsSignup.GetProperty("MigratedUser") != "")
    {
        oMarsSignup.PutProperty("SignupType", "Other");
    }

    switch(oMarsSignup.GetProperty("SignupType"))
    {
    default :
    case "NewMSNIA" :
        oFS.radNewIA.checked = true;
        deferredFocus(lblNewIA);
        break;

    case "Other" :
        oFS.radNonIA.checked = true;
        deferredFocus(lblNonIA);
        break;
    case "Upgrade" :
        oFS.radUpgrade.checked = true;
        deferredFocus(lblUpgrade);
        break;
    }
}

function nav()
{
    saveData();
    if(event.srcElement.id != "btnBack")
    {
        if( !valiData() )
            return;

        if(oFS.radNewIA.checked || oFS.radUpgrade.checked )
            //detect modem etc.
            setupForModem();

        else
            location.href = "dialupornot.htm";
    }
    else
    {
        if( oMarsSignup.GetProperty("welcome") == "1" )
            location.href = "welcome.htm";
        else
        {
            location.href = "howYouConnect.htm";
        }
    }
    return false; //return false for form
}
//-->
</script>

</head>
<body>
<span id=bodyWrap style="visibility:hidden">
<SPAN STYLE="behavior: url(#msncf#dstimeonpage); display: none;" DataID="504" Scale="seconds">
</SPAN>

<form id="oFS" onsubmit="return(stub())">

<table id="tbl0" cellpadding="0" cellspacing="0"><tr><td id="td0" valign="top" height="5%">

<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>
<div id=divHR></div>
</td></tr><tr><td id="td1" height="90%" valign="top"><div id="div0">

<div id=spnHead class="head" style="padding-bottom:15px"></div>

    <div style="font-size:8pt">
        Experience fast, reliable Internet connections using dial-up or broadband, toll-free friendly support, and our popular e-mail and instant messaging services with <span id=oISPName></span>. You can sign up for <span id=oISPName></span>&nbsp;and keep your existing e-mail address!  Sign up today for your special <span id=oISPName></span>&nbsp;offer.
    </div>
    <br>
    <table cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top">
        <input type="radio" id="radNewIA" name="grpNewIA">
      </td><td class="hspace"></td>
      <td>
        <label for="radNewIA" id="lblNewIA" accesskey.loc="[! signup.newaccount.yes.accesskey/ ]" accesskey="y">
            <span class=bluesubhead><u>Y</u>es, I would like to sign up for <span id=oISPName></span>&nbsp;<i>and get a new MSN e-mail address</i>.</span>
        </label>
      </td>
    </tr>
    
    <tr><td colspan=3 class="spacer"></td></tr>

    <tr>
      <td valign="top">
        <input type="radio" id="radUpgrade" name="grpNewIA">
      </td><td class="hspace"></td><td>
        <label for="radUpgrade" id="lblUpgrade" accesskey.loc="[! signup.upgradeaccount.yes.accesskey/ ]" accesskey="s">
            <span class=bluesubhead>Ye<u>s</u>, I would like to sign up for <span id=oISPName></span>&nbsp;<i>but keep my existing e-mail address</i>.</span>
            <div style="font-size:8pt">
            Choose this option if you have an <b>existing free Hotmail&reg; or free MSN e-mail address</b> (for example, someone@hotmail.com or someone@msn.com).
            </div>
        </label>
      </td>
    </tr>
    
    <tr><td colspan=3 class="spacer"></td></tr>

    <tr><td valign="top">

        <input type="radio" id="radNonIA" name="grpNewIA">

    </td><td class="hspace"></td><td>
        <label for="radNonIA" id="lblNonIA" accesskey.loc="[! signup.newaccount.no.accesskey/ ]" accesskey="n">
            <span class=bluesubhead><u>N</u>o, I already have Internet Access.</span>
            <div style="font-size:8pt">
                You can use MSN Explorer with your existing Internet connection.  You should also choose this option if you have an existing <span id=oISPName></span>&nbsp;account or if you have already signed up at a store or online.
            </div>
        </label>
    </td></tr>
</table>

<br>

<div class="infotext">
<button tabindex="2" class="infobutton" id="btnInfo" ACCESSKEY.loc="[! connect.information.key ]" accesskey="i" TITLE="If you are unsure about what to pick, click here" onclick="showHelp('help_options.htm')">
<img id="imgInfo" src="msn://@signup.mar@/signup_info.gif" align="left" >
<!-- locstart connect.info.label/ More information link -->
<u>I</u>f you are unsure about what to pick, click here.
<!-- locend -->
</button>
</div>

</div>
</td></tr><tr><td id="td2" valign="bottom" height="5%">
<div id="divNav">
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
