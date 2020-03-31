tylesheet" TYPE="text/css" HREF="../../Css/rc.css">
<LINK ID=Stylesheet_Ref4 href="hcp://system/css/shared.css" rel=STYLESHEET type=text/css>
<STYLE>
.margins
{
margin-top : 33px;
margin-left : 33px;
margin-right : 33px;
margin-bottom : 0px;
}
</STYLE>
<!-- The SAF class factory object -->
<OBJECT classid=CLSID:FC7D9E02-3F9E-11d3-93C0-00C04F72DAF7 height=0 id=oSAFClassFactory
width=0></OBJECT>
<script LANGUAGE="Javascript">
var L_ERRNOUSERS_Text = "No Users are currently logged on.";
var L_ERRMSG1_Text = "Please specify a valid IP address or computer name.";
var L_ERRMSG2_Text = "A program has stopped responding.Please restart the program and try again.";
var L_ERRMSG3_Text = "The remote computer does not exist or is unavailable. Please make sure the computer name or IP address is correct.";
var L_ERRMSG4_Text = "A program has stopped responding.Please restart the program and try again.";
var L_ERRMSG5_Text = "A program has stopped responding.Please restart the program and try again.";
var L_ERRMSG6_Text = "A program could not start.Please try again.";
var L_ERRACCESSDENIED_Text = "Directly launching this page is not allowed. ";
var g_szRCTicket = null;
var g_szUserName = null;
var g_szDomainName = null;
var g_szSessionId = null;
var g_iExpiry = 5;
var g_oSAFRemoteDesktopConnection = null;
var g_oSAFRemoteConnectionData = null;
var g_oUsersCollection = null;
var g_nUsersLen = null;
var g_oSessionsCollection = null;
var g_nSessionsLen = null;
g_bDebug = false;
function onLoad()
{
;
;
try
{
setTimeout("idComputerName.focus()",250);
g_oSAFRemoteDesktopConnection = oSAFClassFactory.CreateObject_RemoteDesktopConnection();
}
catch(error)
{
FatalError( L_RCCTL_Text, error );
}
;
return;
}
function onEnter()
{
try
{
;
if (window.event.keyCode == 13)
{
onConnect();
window.event.returnValue = false;
}
}
catch(error)
{
FatalError( L_RCCTL_Text, error );
}
}
function onConnect()
{
var oUserObj = null;
var oOption = null;
;
try
{
if (idComputerName.value=="")
{
FatalError( L_ERRMSG1_Text, error );
}
else
{
if (g_oSAFRemoteDesktopConnection != null)
{
try
{
g_oSAFRemoteConnectionData = g_oSAFRemoteDesktopConnection.ConnectRemoteDesktop(idComputerName.value);
}
catch (error)
{
FatalError( error.description , error );
return;
}
try
{
g_oUsersCollection = g_oSAFRemoteConnectionData.Users();
g_nUsersLen = g_oUsersCollection.Count;
if( 0 == g_nUsersLen )
{
FatalError( L_ERRNOUSERS_Text );
return;
}
Layer2.className="Display";
Layer1.className="DisplayNone";
txtAddDisplay.value=idComputerName.value;
spAddress1.innerText=idComputerName.value;
btnStart.disabled=false;
btnChange.focus();
for(i=1; i<= g_nUsersLen; i++)
{
oUserObj = g_oUsersCollection.item(i);
oOption = document.createElement("OPTION");
oOption.text = oUserObj.DomainName + "\\" + oUserObj.UserName;
oOption.value = oOption.text;
document.all.optUser.add(oOption);
}
}
catch (error)
{
FatalError( L_ERRMSG4_Text, error );
return;
}
try
{
g_oSessionsCollection = g_oSAFRemoteConnectionData.Sessions();
g_nSessionsLen = g_oSessionsCollection.Count;
}
catch (error)
{
FatalError( L_ERRMSG5_Text, error);
return;
}
}
else
{
FatalError( L_ERRMSG2_Text );
return;
}
}
}
catch(error)
{
FatalError( L_RCCTL_Text, error );
}
;
return;
}
function onChange()
{
;
try
{
window.navigate("Unsolicitedrcui.htm");
}
catch(error)
{
FatalError( L_RCCTL_Text, error );
}
;
return;
}
function onStart()
{
;
var i = 0;
var oSessionObj = null;
var szAcct = null;
var oOption = null;
var iTimesLoggedOn = 0;
var iSessionId = 0;
try
{
for(i=1; i<= g_nSessionsLen; i++)
{
oSessionObj = g_oSessionsCollection.item(i);
szAcct = oSessionObj.DomainName + "\\" + oSessionObj.UserName;
if( szAcct == optUser.value )
{
oOption = document.createElement("OPTION");
oOption.text = "login session " + oSessionObj.SessionID;
oOption.value = oSessionObj.SessionID;
document.all.optLoginSession.add(oOption);
iSessionId = oSessionObj.SessionID;
iTimesLoggedOn++;
}
}
optLoginSession.value = iSessionId;
onContinue();
}
catch(error)
{
FatalError( L_ERRMSG6_Text );
}
;
return;
}
function onCancel()
{
try
{
window.navigate("UnsolicitedRCUI.htm");
}
catch(error)
{
FatalError( L_RCCTL_Text, error );
}
}
function onContinue()
{
;
var szIncidentFile = null;
var fso = null;
var tempDir = null;
var oInc = null;
try
{
var i = optUser.value.indexOf("\\");
g_szDomainName = optUser.value.slice(0, i);
g_szUserName = optUser.value.slice(i+1);
g_szSessionId = -1;
;
oInc = oSAFClassFactory.CreateObject_Incident();
oInc.UserName = g_szUserName;
oInc.RCTicketEncrypted = false;
;
oInc.RcTicket = g_oSAFRemoteConnectionData.ConnectionParms( idComputerName.value, g_szUserName, g_szDomainName, g_szSessionId, "");
var oDict = oInc.Misc;
try
{
var d = new Date();
var iNow = Math.round(Date.parse(d)/1000);
oDict.add("DtStart", iNow);
oDict.add("DtLength", g_iExpiry);
oDict.add("IP", idComputerName.value);
oDict.add("Status", "Active");
oDict.add("URA", 1);
try
{
var fModemConnected;
fModemConnected = g_oSAFRemoteConnectionData.ModemConnected(idComputerName.value);
if(fModemConnected)
{
oDict.add("L",1);
}
}
catch(e)
{
}
}
catch (e)
{
FatalError(e.description);
}
fso = new ActiveXObject("Scripting.FileSystemObject");
tempDir = fso.GetSpecialFolder( 2 );
szIncidentFile = tempDir + "\\UnsolicitedRA" + fso.GetTempName();
oInc.GetXML(szIncidentFile);
idCtx.minimized = true;
var oShell = new ActiveXObject("WScript.Shell");
var szRAURL = GetWinDir() + '\\pchealth\\helpctr\\binaries\\helpctr.exe -Mode "hcp://system/Remote Assistance/raura.xml" -url "hcp://system/Remote Assistance/Interaction/Client/RcToolscreen1.htm"' + ' -ExtraArgument "IncidentFile=' + szIncidentFile + '"';
oShell.Run( szRAURL, 1, true );
fso.DeleteFile( szIncidentFile );
window.navigate("Unsolicitedrcui.htm");
}
catch(error)
{
FatalError( L_ERRMSG6_Text, error );
}
;
return;
}
</script>
</HEAD>
<BODY onload="onLoad();" id="idBody" name="idBody" tabindex=-1>
<Table id="T0" name="T0" border=0 class="MaxLayout" cellspacing=16 cellpadding=0>
<TR id="TR0T0" name="TR0T0" >
<TD id="TD0TR0T0" name="TD0TR0T0" valign=top>
<!-- Layer 1 -->
<DIV id="Layer1" name="Layer1" class="MaxLayout">
<Table id="T0TD0TR0T0" name="T0TD0TR0T0" border=0 cellspacing=8 cellpadding=0 class="MaxWidth">
<TR id="TR0T0TD0TR0T0" name="TR0T0TD0TR0T0">
<TD id="TD0TR0T0TD0TR0T0" name="TD0TR0T0TD0TR0T0" class="sys-font-heading3 sys-rhp-color-title" colspan=2>
Offer Remote Assistance
</TD>
</TR>
<TR id="TR1T0TD0TR0T0" name="TR1T0TD0TR0T0">
<TD id="TD0TR1T0TD0TR0T0" name="TD0TR1T0TD0TR0T0" class="sys-font-body sys-color-body" colspan=2>
With Remote Assistance, you can offer help to a local area network user if you have
administrative privileges and know the computer name or IP address. When you start
Remote Assistance, you can view the user's screen, chat in real time, and work from a
remote location on the user's computer.
<P id="p0" name="p0">
Type or paste the computer name or IP address:
</TD>
</TR>
<TR id="TR2T0TD0TR0T0" name="TR2T0TD0TR0T0">
<TD id="TD0TR2T0TD0TR0T0" name="TD0TR2T0TD0TR0T0">
<INPUT type=text class="sys-font-body sys-color-body MaxWidth" name="idComputerName" id="idComputerName" onkeypress="onEnter()" title="Type or paste the computer name or IP address" size=47 tabindex=1>
</TD>
<TD id="TD1TR2T0TD0TR0T0" name="TD1TR2T0TD0TR0T0" align="left" style="width:20%">
<BUTTON class="styBtnWidth sys-font-body sys-color-body" name="btnConnect" id="btnConnect" onClick="onConnect();" title="Connect" tabindex=2 accesskey="C"><u>C</u>onnect </BUTTON>
</TD>
</TR>
</Table>
</Div>
<!-- End of Layer 1 -->
<!-- Layer 2 -->
<DIV id="Layer2" name="Layer2" class="DisplayNone">
<Table id="T1TD0TR0T0" name="T1TD0TR0T0" border=0 cellspacing=8 cellpadding=0 class="Maxwidth">
<TR id="TR0T1TD0TR0T0" name="TR0T1TD0TR0T0">
<TD id="TD0TR0T1TD0TR0T0" name="TD0TR0T1TD0TR0T0" class="sys-font-heading3 sys-rhp-color-title" colspan=2>
Offer Remote Assistance
</TD>
</TR>
<TR id="TR1T1TD0TR0T0" name="TR1T1TD0TR0T0">
<TD id="TD0TR1T1TD0TR0T0" name="TD0TR1T1TD0TR0T0" class="sys-font-body sys-color-body" colspan=2>
With Remote Assistance, you can offer help to a local area network user if you have
administrative privileges and know the computer name or IP address. When you start
Remote Assistance, you can view the user's screen, chat in real time, and work from a
remote location on the user's computer.
<P id="p1" name="p1">
You are connected to:
</TD>
</TR>
<TR id="TR2T1TD0TR0T0" name="TR2T1TD0TR0T0">
<TD id="TD0TR2T1TD0TR0T0" name="TD0TR2T1TD0TR0T0">
<INPUT type="text" class="sys-font-body sys-color-body MaxWidth" name="txtAddDisplay" readonly id="txtAddDisplay" tabindex=-1>
</TD>
<TD id="TD1TR2T1TD0TR0T0" name="TD1TR2T1TD0TR0T0" align="left" style="width:20%">
<BUTTON class="styBtnWidth sys-font-body sys-color-body" name="btnChange" id="btnChange" onClick="onChange();" tabindex=3 accesskey="h">C<u>h</u>ange </BUTTON>
</TD>
</TR>
<TR id="TR3T1TD0TR0T0" name="TR3T1TD0TR0T0">
<TD id="TD0TR3T1TD0TR0T0" name="TD0TR3T1TD0TR0T0" colspan=2>
&nbsp;
</TD>
</TR>
<TR id="TR4T1TD0TR0T0" name="TR4T1TD0TR0T0">
<TD id="TD0TR4T1TD0TR0T0" name="TD0TR4T1TD0TR0T0" colspan=2 class="sys-font-body sys-color-body" >
Several users are logged onto "<SPAN id="spAddress1" name="spAddress1"> </SPAN>". Select the user you want to assist:
</TD>
</TR>
<TR id="TR5T1TD0TR0T0" name="TR5T1TD0TR0T0">
<TD id="TD0TR5T1TD0TR0T0" name="TD0TR5T1TD0TR0T0" colspan=2>
<SELECT name="optUser" id="optUser" class="sys-font-body sys-color-body" style="width:80%" tabindex=4>
<!-- Options dynamically created -->
</SELECT>
</TD>
</TR>
</Table>
</DIV>
<!-- End of Layer 2 -->
<!-- Layer 3 -->
<DIV id="Layer3" name="Layer3" class="DisplayNone" >
<table id="T2TD0TR0T0" name="T2TD0TR0T0" border=0 class="MaxWidth" cellspacing=6 cellpadding=0>
<tr id="TR0T2TD0TR0T0" name="TR0TR0T2TD0TR0T0">
<td id="TD0TR0T2TD0TR0T0" name="TD0TR0T2TD0TR0T0" style="width:5%">
<IMG id="I0TD0TR0T2TD0TR0T0" name="I0TD0TR0T2TD0TR0T0" src="../../Common/icon_warning_32x.gif"></IMG>
</td>
<td id="TD1TR0T2TD0TR0T0" name="TD1TR0T2TD0TR0T0" class="sys-font-body sys-color-body" >
<SPAN id="S1TD1TR0T2TD0TR0T0" name="S1TD1TR0T2TD0TR0T0" class="sys-font-body sys-color-body">
"<SPAN id="spUser" name="spUser"> </SPAN>" is logged onto more than once </SPAN>
</td>
</tr>
<tr id="TR1T2TD0TR0T0" name="TR1T2TD0TR0T0">
<TD id="TD0TR1T2TD0TR0T0" name="TD0TR1T2TD0TR0T0" class="sys-font-body sys-color-body" >
<Span id="s3" name="s3" style="width:5px"> </Span>
<INPUT type="radio" name="rdOption" id="rdOpt1" value="rdOpt1" checked tabindex=5>
</TD>
<TD id="TD1TR1T2TD0TR0T0" name="TD1TR1TR0T2TD0TR0T0" class="sys-font-body sys-color-body" >
<Label id="l0" name="l0" class="sys-font-body sys-color-body" For="rdOpt1" >Start Remote Assistance for each instance that <Span id="username" name="username"> &nbsp; </Span>
&nbsp; is logged on to <Span id="computername" name="computername"> &nbsp; </Span></Label>
</td>
</tr>
<tr id="TR2T2TD0TR0T0" name="TR2T2TD0TR0T0">
<td id="TD0TR2T2TD0TR0T0" name="TD0TR2T2TD0TR0T0" class="sys-font-body sys-color-body" >
<Span id="s2" name="s0" style="width:5px"> </Span>
<INPUT type="radio" name="rdOption" id="rdOpt2" value="rdOpt2" tabindex=6>
</TD>
<TD id="TD1TR2T2TD0TR0T0" name="TD1TR2T2TD0TR0T0" class="sys-font-body sys-color-body" >
<Label id="l1" name="l1" class="sys-font-body sys-color-body" For="rdOpt2">Select a logon number</Label>
</td>
</tr>
<tr id="TR3T2TD0TR0T0" name="TR3T2TD0TR0T0">
<td id="TD0TR3T2TD0TR0T0" name="TD0TR3T2TD0TR0T0">
&nbsp;
</td>
<td id="TD1TR3T2TD0TR0T0" name="TD1TR3T2TD0TR0T0">
<SELECT name="optLoginSession" id="optLoginSession" class="sys-font-body sys-color-body" style="WIDTH: 90%;" tabindex=7>
<!-- Options dynamically created -->
</SELECT>
</td>
</tr>
</table>
</DIV>
<!-- End of Layer 3 -->
</TD>
</TR>
<TR id="TR1T0" name="TR1T0">
<TD id="TD0TR1T0" name="TD0TR1T0" colspan=3 style="padding-left:7px;padding-right:7px;">
<HR id="TD0TR1T0" name="TD0TR1T0" style="visibility:visible">
</TD>
</TR>
<TR>
<TD id="t0" name="t0" align="right" valign="top">
<!-- Ctrl Layer -->
<BUTTON name="btnStart" id="btnStart" class="sys-font-body sys-color-body" onClick="onStart();" Disabled tabindex=8 accesskey="S">&nbsp;&nbsp;&nbsp;<u>S</u>tart Remote Assistance &nbsp;&nbsp;&nbsp;</BUTTON> <Span id="s0" name="s0" style="width:5px;display:none"> </Span>
<BUTTON style="display:none" name="btnContinue" id="btnContinue" class="sys-font-body sys-color-body" onClick="onContinue();" tabindex=9 accesskey="N"> &nbsp;&nbsp;&nbsp;Co<u>n</u>tinue&nbsp;&nbsp;&nbsp;</BUTTON><Span id="s1" name="s1" style="width:5px"> </Span>
<BUTTON name="btnCancel" id="btnCancel" onClick="onCancel();" tabindex=10 class="sys-font-body sys-color-body" accesskey="L" style="display:none" > &nbsp;&nbsp;&nbsp;Cance<u>l</u>&nbsp;&nbsp;&nbsp;</BUTTON>
<!-- End of Ctrl Layer -->
</TD>
</TR>
</Table>
</BODY>
</HTML>
