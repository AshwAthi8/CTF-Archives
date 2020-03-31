JavaScript">
var L_NOPERMISSION_Text = "Remote Assistance is disabled on this computer. To use Remote Assistance, you must enable it on the Remote tab in System Properties in Control Panel. Note that if an administrator has disabled Remote Assistance in Group Policy Object Editor, you cannot enable it in System Properties.";
var L_ERRACCESSDENIED_Text = "Directly launching this page is not allowed. ";
function WinLoad()
{
;
if( null == parent.OnLoad )
{
idBody.style.visibility = "hidden";
window.navigate( "hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/Remote%20Assistance/Escalation/Common/rcscreen1.htm" );
return;
}
else
{
parent.g_bRAStart = true;
idInvite.focus();
try
{
var i=0;
var chan = parent.pchealth.CreateObject_Channel(parent.sVendorID,parent.sProductID );
var e = new Enumerator(chan.Incidents(2));
for (;!e.atEnd();e.moveNext())
{
i++;
}
}
catch(error)
{
alert(parent.L_NOCHANNEL_Text);
return;
}
idCount.innerText=" ("+i+")";
}
;
}
function DoInvite()
{
;
try
{
var oRARegSetting = new ActiveXObject("RACplDlg.RARegSetting");
var Allow = oRARegSetting.AllowGetHelp;
if (Allow == 0)
{
alert (L_NOPERMISSION_Text);
return;
}
if (parent.GetIPAddress() == "")
{
parent.SwitchToOfflinePage();
}
else
{
navigate("rcScreen3.htm");
}
}
catch (error)
{
alert(parent.L_RCCTL_Text);
}
;
}
function ViewStatus()
{
;
try
{
navigate("../../rcStatus.htm");
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
;
}
function MoreInfo()
{
;
try
{
var szURL = "hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/Remote%20Assistance/Common/RCMoreInfo.htm";
window.showModalDialog( szURL,"", "dialogHeight:440px;dialogWidth:385px;status:no;resizable:no;help:no" );
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
;
}
</script>
</head>
<BODY id="idBody" scroll="auto" onload="WinLoad();" class="margin sys-rhp-bgcolor">
<table class="MaxWidth" id="idtableframe" name="idtableframe" cellpadding="16px" border=0>
<tr>
<td>
<TABLE id="RA_Table" name="RA_Table" class="MaxWidth" border="0" cellspacing="0" cellpadding="0">
<TR>
<TD id="idTd1" name="idTD1"><Span id="idMainTitle" name="idMainTitle" class="sys-font-heading3 sys-rhp-color-title">Remote Assistance</Span></TD>
</TR>
<TR>
<TD class="height9">
</TD>
</TR>
<TR>
<TD id="idTd2" name="idTD2">
<span id="idSubTitle" name="idSubTitle" class="sys-font-body-bold sys-color-body">Invite someone you trust to help you</span>
</TD>
</TR>
<TR>
<TD class="height8">
</TD>
</TR>
<TR>
<TD id="idTd3" name="idTD3">
<span id="idText" name="idText" class="sys-font-body sys-color-body">Invite someone you trust to help you. Using an Internet connection, anyone running Windows XP or Windows Server 2003 can chat with you, view your screen, and with your permission, work on your computer.</span>
</TD>
</TR>
<TR>
<TD class="Height11">
</TD>
</TR>
<TR>
<TD id="idTd6" name="idTD6">
<A href="" onclick="MoreInfo();return false;" ondragstart="return false;" id="idMoreInfo" name="idMoreInfo" tabindex="3" class="sys-font-body sys-link-normal">Tell me more about Remote Assistance</A>
</TD>
</TR>
<TR>
<TD class="height7">
</TD>
</TR>
<TR>
<TD id="idTd4" name="idTD4">
<Img id="idimg1"
name="idimg1"
onclick="DoInvite();return false;"
class="valignbottom borderNone"
ondragstart="return false;"
src="green_rest_16x.bmp"
onmouseover="this.style.cursor='hand';document.getElementById('idInvite').style.textDecorationUnderline=true"
onmouseout="document.getElementById('idInvite').style.textDecorationUnderline=false">
</Img>
&nbsp;
<A href="" id="idInvite"
name="idInvite"
ondragstart="return false;"
tabindex="1"
class="sys-font-body sys-link-normal valignmiddle"
onclick="DoInvite();return false;">
Invite someone to help you
</A>
</TD>
</TR>
<TR>
<TD class="height7">
</TD>
</TR>
<TR>
<TD id="idTd5" name="idTD5">
<Img id="idimg2"
name="idimg2"
class="valignbottom borderNone"
onclick="ViewStatus();return false;"
ondragstart="return false;"
src="blue_rest_16x.bmp"
onmouseover="this.style.cursor='hand';document.getElementById('idstatus').style.textDecorationUnderline=true"
onmouseout="document.getElementById('idstatus').style.textDecorationUnderline=false">
</Img>
&nbsp;
<A href="" id="idstatus"
name="idstatus"
ondragstart="return false;"
tabindex="2"
class="sys-font-body sys-link-normal valignmiddle"
onclick="ViewStatus();return false;">
View invitation status<span id="idCount" name="idCount"></span>
</A>
</TD>
</TR>
</TABLE>
</td>
</tr>
</table>
</BODY>
</html>
