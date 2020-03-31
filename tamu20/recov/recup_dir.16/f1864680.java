nt.srcElement.tagName == "BODY")
    {
        return;
    }
}

function dothis()
{
    return false;
}

//Use onLogon to detect when we've successfully logged on.
function onLogon()
{

    if( oMarsSignup.GetProperty("NewSignupUrl") != "")
    {
        NavToServerPage( oMarsSignup.GetProperty("NewSignupUrl") );
        span1.innerHTML = "Custom Signup URL!! " + oMarsSignup.GetProperty("NewSignupUrl")
    }
     else
        NavToServerPage( fullSignupUrl() );
}

//Use onAbort to update page as needed.
function onAbort()
{
    oMarsSignup.OnSignupCancelled();
    busyOff();
}

//Catch errors and route them back through the signup behavior for display.
//Update page as needed.
function onError(nError, strError, strHelpUrl, nFlags)
{
    //Show pop-up error dialog.
    ShowErrorMessage("Connect Error", strError, true, nError, strHelpUrl, nFlags);
}

//-->
</script>
</head>
<body tabindex="1" onfocus="dothis()">

<table id="tbl0" cellpadding="0" cellspacing="0" ><tr><td id="td0" valign="top" height="5%">

<div id=divBrand><img id="imgBrand" title="MSN Explorer" src="msn://rsrc/signup.gif" align="right"></div>

<div id=divHR></div>

</td></tr><tr><td id="td1" height="90%" valign="top" align="left"><div id="div0">
<span class="head" style="font-size:32pt">
<!-- locstart connecting.title.text/ -->
Connecting...
<!-- locend -->
</span>

<BR><span id=span1></span>

<div id=divConnectHelp style="display:none;">
<!-- locstart connecting.lanconnect.text/ -->
We're going to connect you using your operating system's default connection. If
you experience trouble connecting or if nothing appears to be happening for more
than a minute, please check that your Internet connection is working properly
and is set as Default.
<!-- locend -->

<BR><BR>
  
<button nowrap="true" onclick="showHelp('help_connset.htm')" tabindex="4" class="infobutton" id="btnInfo" ACCESSKEY.loc="[! connecting.lanconnecthelp.key/access key for the default settings connection help info label]" accesskey="v" TITLE.loc="[! connecting.lanconnecthelp.title//title for helpinfo ]" TITLE="How do I view my default connection settings?">
<img id="imgInfo" src="msn://@signup.mar@/signup_info.gif" align="left" style="vertical-align:middle;">
<!-- locstart connecting.lanconnecthelp.label/Text for help link-Need hard breaks where appropriate -->
How do I <u>v</u>iew my default connection settings?
<!-- locend -->
</button>
</div>

</td></tr><tr><td id="td2" valign="bottom" height="5%">
<div id="tdnav1" align="left"></div>
</td></tr></table>

<iframe src frameborder="0" height=100% width=100% id="Inframe1" name="MSN Sign Up" style="DISPLAY: none; LEFT: 0px; POSITION: absolute; TOP: 0px; Z-INDEX: 80;widht:100%;height:100%"></iframe>

</body>
</html>
GIF89a+