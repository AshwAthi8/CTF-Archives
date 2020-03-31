css/Behaviors.css" rel=STYLESHEET type=text/css>
<Script id="idScript1" name="idScript1" language="javascript">
var L_ERRACCESSDENIED_Text = "Directly launching this page is not allowed. ";
function onLoad()
{
;
try
{
if( null == parent.OnLoad || parent.g_bRAStart == null )
{
idBody.style.visibility = "hidden";
window.navigate( "hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/Remote%20Assistance/Escalation/Common/rcscreen1.htm" );
return;
}
if(null != parent.oRCSession)
parent.oRCSession = null;
try
{
var count=0;
var chan = parent.pchealth.CreateObject_Channel(parent.sVendorID,parent.sProductID );
var e = new Enumerator(chan.Incidents(2));
for (;!e.atEnd();e.moveNext())
{
count++;
}
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
var i = document.URL.indexOf("?", 1);
var ret = document.URL.slice(i+1);
switch(ret)
{
case "screen5":
RA_Table.deleteRow(0);
RA_Table.deleteRow(0);
RA_Table.deleteRow(4);
idEmailSucc.className="Display";
idFileSucc.className="DisplayNone";
idSpanViewEmail.className="Display";
idSpanViewFile.className="DisplayNone";
document.all("idSpanViewEmail").all("idstatus1").all("idCount").innerText=" ("+count+")";
break;
case "screen9":
idEmailSucc.className="DisplayNone";
idFileSucc.className="Display";
idFileLoc.innerText=parent.sFileLoc;
idSpanViewEmail.className="DisplayNone";
idSpanViewFile.className="Display";
idConnIssue.insertAdjacentHTML("beforeBegin","&nbsp;&nbsp;&nbsp;");
document.all("idSpanViewFile").all("idstatus2").all("idCount").innerText=" ("+count+")";
break;
default:
break;
}
idInvite.focus();
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
;
}
function isAMD64Pro()
{
if(parent.parent.pchealth.UserSettings.MachineSKU.SKU.match( /_64/ ) &&
parent.parent.pchealth.UserSettings.MachineSKU.SKU.match( "Professional" ))
{
return true;
}
else
{
return false;
}
}
function DoInvite()
{
;
try
{
parent.ResendFlag = false;
navigate("../common/rcscreen3.htm");
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
;
}
function ViewStatus()
{
;
try
{
navigate("../../rcstatus.htm");
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
;
}
function ConnIssue()
{
;
try
{
var szURL = "";
if (isAMD64Pro())
{
szURL="hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/Remote%20Assistance/Common/ConnIssue-pro.htm";
}
else
{
szURL = "hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/Remote%20Assistance/Common/ConnIssue.htm";
}
window.showModalDialog( szURL,parent.GetWinDir(), "dialogHeight:440px;dialogWidth:385px;status:no;resizable:no;help:no" );
}
catch(error)
{
alert(parent.L_RCCTL_Text);
return;
}
;
}
</Script>
<Style>
.width6
{
width:4%;
}
.imgpadding
{
padding-top:3px;
}
.bordertype
{
border:1px solid black;
}
.logo
{
width:30px;
height:30px;
}
</Style>
</head>
<BODY id="idBody" name="idBody" scroll="auto" onload="onLoad();" class="margin sys-rhp-bgcolor">
<table class="MaxLayout" id="idtableframe" name="idtableframe" cellpadding="16px" border="0">
<tr>
<td class="valignTop">
<TABLE id="RA_Table" name="RA_Table" class="MaxWidth" border="0" cellspacing="0" cellpadding="0">
<TR>
<TD id="idTd1" name="idTd1">
<Span id="idMainTitle" name="idMainTitle" class="sys-font-heading3 sys-rhp-color-title">Remote Assistance</Span>
</TD>
</TR>
<TR>
<TD class="Height7">
</TD>
</TR>
<TR>
<TD>
<Div id="idEmailSucc" name="idEmailSucc" class="DisplayNone">
<Table id="idContainer" name="idContainer" cellspacing="0" cellpadding="15px" border=1 class="Maxwidth sys-inlineform-bgcolor2 bordertype">
<TR>
<TD>
<Table id="idDiv1Table" name="idDiv1Table" cellspacing="0" cellpadding="0" border="0" class="MaxWidth">
<TR>
<TD id="idTd2" name="idTd2" class="width6">
<helpcenter:bitmap id=idLogo class="logo" AutoRTL="true" SRCNORMAL="../common/alert.bmp"></helpcenter:bitmap>
</TD>
<TD class="width6"></TD>
<TD id="idTd3" name="idTd3">
<Span id="idSubTitle" name="idSubTitle" class="sys-rhp-color-title sys-font-heading3 valignmiddle">
Was the e-mail invitation successfully sent?
</Span>
</TD>
</TR>
<TR>
<TD class="Height9" colspan="3">
</TD>
</TR>
<TR>
<TD></TD>
<TD class="width6"></TD>
<TD id="idTd4" name="idTd4">
<Table id="idTableList" name="idTableList" class="Maxwidth" cellspacing="0" cellpadding="0" border="0">
<TR>
<TD id="idList111" name="idList111" class="valignTop">
<Span id="idSpan1" name="idSpan1" class="sys-font-body-bold sys-color-body valignTop">Yes</span>
</TD>
</TR>
<TR>
<TD id="idList11" name="idList11" class="valignTop" nowrap>
<Span id="idSpan1" name="idSpan1" class="sys-font-body sys-color-body valignTop">A message appeared including the invitation and instructions for my assistant, and I sent it.</span>
</TD>
</TR>
<TR>
<TD class="Height8" colspan="2">
</TD>
</TR>
<TR>
<TD id="idList112" name="idList112" class="valignTop">
<Span id="idSpan1" name="idSpan1" class="sys-font-body-bold sys-color-body valignTop">No</span>
</TD>
</TR>
<TR>
<TD id="idList44" name="idList44" class="valignTop" nowrap>
<Span id="idSpan4" name="idSpan4" class="sys-font-body sys-color-body valignTop">No message appeared, one appeared but was blank, or I accidentally closed it.</span>
</TD>
</TR>
<TR>
<TD id="idList5" name="idList5" class="valigntop" colspan="3" nowrap>
<Img id="idimage55"
name="idimage55"
onclick="navigate('rcScreen10.htm');return false;"
class="valignbottom borderNone"
ondragstart="return false;"
src="../common/blue_rest_16x.bmp"
onmouseover="this.style.cursor='hand';document.getElementById('idLinkMethod55').style.textDecorationUnderline=true"
onmouseout="document.getElementById('idLinkMethod55').style.textDecorationUnderline=false">
</Img>
&nbsp;
<A href="" id="idLinkMethod55"
name="idLinkMethod55"
ondragstart="return false;"
class="valignmiddle sys-font-body sys-link-normal"
onclick="navigate('rcScreen10.htm');return false;">
I want to manually create an e-mail message.
</A>
</TD>
</TR>
<TR>
<TD class="Height8" colspan="2">
</TD>
</TR>
</Table>
</TD>
</TR>
</Table>
</TD>
</TR>
<TR>
<TD>
<Table id="idDiv3Table" name="idDiv3Table" cellspacing="0" cellpadding="0" border="0" class="MaxWidth">
<TR>
<TD id="idListNotes" name="idListNotes" class="valignTop">
<Span id="idSpan1" name="idSpan1" class="sys-font-body-bold sys-color-body valignTop">Notes</span>
</TD>
</TR>
<TR>
<TD>
<Table id="idTableNotes" name="idTableNotes" class="Maxwidth" cellspacing="0" cellpadding="0" border="0">
<TR>
<TD id="idList2" name="idList2" class="width7 valignTop imgpadding">
<img id="idimgBullet2" name="idimgBullet2" src="../common/square_bullet.gif" class="valignmiddle">&nbsp;&nbsp;</img>
</TD>
<TD id="idList22" name="idList22" class="valignTop">
<span id="idSpan2" name="idSpan2" class="sys-font-body sys-color-body">If you are connected to the Internet and your invitation is accepted, you will be notified that the recipient is ready to connect to your computer.</Span>
</TD>
</TR>
<TR>
<TD class="Height8" colspan="2">
</TD>
</TR>
<TR>
<TD id="idList3" name="idList3" class="width7 valignTop imgpadding">
<img id="idimgBullet3" name="idimgBullet3" src="../common/square_bullet.gif" class="valignmiddle">&nbsp;&nbsp;</img>
</TD>
<TD id="idList33" name="idList33" class="valignTop">
<Span id="idSpan3" name="idSpan3" class="sys-font-body sys-color-body">E-mail invitations you create are saved in the invitation status list.</span>
</TD>
</TR>
</Table>
</TD>
</TR>
</Table>
</TD>
</TR>
</Table>
</Div>
<Div id="idFileSucc" name="idFileSucc" class="DisplayNone">
<Table id="idDiv2Table" name="idDiv2Table" cellspacing="0" cellpadding="0" border="0" class="MaxWidth">
<TR>
<TD id="idTd5" name="idTd5" class="Width6">
<img id="idimg1" name="idimg1" src="../common/info.gif">&nbsp;&nbsp;&nbsp;&nbsp;</img>
</TD>
<TD id="idTd6" name="idTd6">
<span id="idSubTitle" name="idSubTitle" class="sys-font-body-bold sys-color-body valignTop">
Your invitation has been saved successfully to:<BR>
<Span id="idFileLoc" name="idFileLoc" class="sys-font-body-bold sys-color-body">
</Span>
</Span>
</TD>
</TR>
<TR>
<TD class="Height7" colspan="2">
</TD>
</TR>
<TR>
<TD colspan="2">
<table id="idTable" name="idTable" class="Maxwidth" cellspacing="0" cellpadding="0" border="0">
<TR>
<TD id="idTd7" name="idTd7" class="width7 valignTop imgpadding">
<img id="idimg2" name="idimg2" src="../common/square_bullet.gif" class="valignTop">&nbsp;&nbsp;</img>
</TD>
<TD id="idTd8" name="idTd8" class="valignTop">
<span id="idText1" name="idText1" class="sys-font-body sys-color-body valignTop">Use your preferred method to send it to your assistant (for example, attach it to an e-mail message or place it in a shared folder). You should also tell your assistant to open the invitation in order to start the Remote Assistance session.</span>
</TD>
</TR>
<TR>
<TD class="Height8" colspan="2">
</TD>
</TR>
<TR>
<TD id="idTd9" name="idTd9" class="width7 valignTop imgpadding">
<img id="idimg6" name="idimg6" src="../common/square_bullet.gif" class="valignTop">&nbsp;&nbsp;</img>
</TD>
<TD id="idTd10" name="idTd10" class="valignTop">
<span id="idText1" name="idText1" class="sys-font-body sys-color-body valignTop">If you are connected to the Internet and your invitation is accepted, you will be notified that the recipient is ready to connect to your computer.</span>
</TD>
</TR>
</Table>
</TD>
</TR>
</Table>
</Div>
</TD>
</TR>
<TR>
<TD class="Height9">
</TD>
</TR>
<TR>
<TD id="idTd11" name="idTd11">
<A id="idConnIssue" name="idConnIssue" href="" ondragstart='return false;' onclick="ConnIssue();return false;" class="sys-font-body sys-link-normal" tabindex="3">Tell me about connection issues</A>
</TD>
</TR>
<TR>
<TD class="Height9">
</TD>
</TR>
<TR>
<TD>
<HR id="idHr" name="idHr" class="bordertype1 sys-toppane-color-border">
</TD>
</TR>
<TR>
<TD class="Height9">
</TD>
</TR>
<TR>
<TD id="idTd12" name="idTd12">
<Img id="idimg3"
name="idimg3"
onclick="parent.window.navigate('rcScreen8.htm');return false;"
class="valignbottom borderNone"
ondragstart="return false;"
src="../common/green_rest_16x.bmp"
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
Send a new invitation
</A>
</TD>
</TR>
<TR>
<TD class="Height7">
</TD>
</TR>
<TR>
<TD id="idTd13" name="idTd13">
<span id="idSpanViewEmail" name="idSpanViewEmail" class="DisplayNone">
<Img id="idimg4"
name="idimg4"
onclick="ViewStatus();return false;"
class="valignbottom borderNone"
ondragstart="return false;"
src="../common/blue_rest_16x.bmp"
onmouseover="this.style.cursor='hand';document.getElementById('idstatus1').style.textDecorationUnderline=true"
onmouseout="document.getElementById('idstatus1').style.textDecorationUnderline=false">
</Img>
&nbsp;
<A href="" id="idstatus1"
name="idstatus1"
ondragstart="return false;"
tabindex="2"
class="sys-font-body sys-link-normal valignmiddle"
onclick="ViewStatus();return false;">
View invitation status<span id="idCount" name="idCount"></span>
</A>
</span>
<Span id="idSpanViewFile" name="idSpanViewFile" class="DisplayNone">
<Img id="idimg5"
name="idimg5"
onclick="ViewStatus();return false;"
class="valignbottom borderNone"
ondragstart="return false;"
src="../common/blue_rest_16x.bmp"
onmouseover="this.style.cursor='hand';document.getElementById('idstatus2').style.textDecorationUnderline=true"
onmouseout="document.getElementById('idstatus2').style.textDecorationUnderline=false">
</Img>
&nbsp;
<A href="" id="idstatus2"
name="idstatus2"
ondragstart="return false;"
tabindex="2"
class="sys-font-body sys-link-normal valignmiddle"
onclick="ViewStatus();return false;">
View the status of all my invitations<span id="idCount" name="idCount"></span></span>
</A>
</Span>
</TD>
</TR>
</Table>
</td>
</tr>
</Table>
</Body>
</html>
