" class="MaxWidth">
<TR>
<TD id="idTd1" name="idTd1">
<Span id="idMainTitle" name="idMainTitle" class="sys-font-heading3 sys-rhp-color-title">Remote Assistance</span>
</TD>
</TR>
<TR>
<TD class="height9">
</TD>
</TR>
<TR>
<TD id="idTd2" name="idTd2">
<span id="idSubTitle" name="idSubTitle" class="sys-font-body-bold sys-color-body">Pick how you want to contact your assistant</span>
</TD>
</TR>
<TR>
<TD class="height4">
</TD>
</TR>
<TR>
<TD id="idTd3" name="idTd3">
<span id="idMethod1" name="idMethod1" class="sys-font-body-bold sys-color-body"><span id="idMethod1Status">Use Windows Messenger ...</span></span>
</TD>
</TR>
<TR>
<TD class="Height5">
</TD>
</TR>
<TR>
<TD>
<table border="0" cellspacing="0" cellpadding="0" class="Maxwidth sys-toppane-color-border sys-table-cell-bgcolor5 bordertype1">
<TR>
<TD id="MSNCell1" name="MSNCell1" align="center" class="valigntop sys-table-cell-bgcolor3 width1">
<BR>
<Img id="idimg1" name="idimg1" src="../common/messenger_big.gif"></Img>
<BR>
<span id="idMSN" name="idMSN" class="sys-font-body sys-color-body">Windows Messenger<BR></span>
<BR>
</TD>
<TD>
<!--Already signed into MSN -->
<Div id="idDivMSNConnected" name="idDivMSNConnected" class="MaxWidth height14 DisplayNone" >
<Table cellpadding="6px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD>
<table cellspacing="6px" cellpadding="0" border="0" class="MaxWidth">
<TR>
<TD id="idTd4" name="idTd4" class="cellpadding3">
<Div id="idMSNList" name="idMSNList" class=" sys-toppane-color-border bordertype1 sys-table-cell-bgcolor1 OverflowyScroll sys-font-body height1">
&nbsp;&nbsp;<Span id="idOnline" name="idOnline" class="sys-font-body-bold sys-color-body">Online</Span>
<Span id="mContactsOnline" class="sys-font-body sys-color-body"></span><BR>
&nbsp;&nbsp;<span id="idOffline" name="idOffline" class="sys-font-body-bold sys-color-body">Not online</Span>
<span id="mContactsOffline" class="sys-font-body sys-color-body"></Span></BR>
</Div>
</TD>
</TR>
<TR>
<TD id="idTd15" name="idTd15" nowrap>
<Span id="idLink1Container" name="idLink1Container">
<img id="idimg2" name="idimg2" class="valignbottom borderNone" src="../common/dis_arrow.bmp"></img>
<Span id="idLink1" name="idLink1" class="sys-font-body" disabled>&nbsp;Invite this person</span>
</Span>
</TD>
</TR>
</table>
</TD>
</TR>
</Table>
</Div>
<!--Setup for MSN -->
<Div id="idDivMSNSetup" name="idDivMSNSetup" class="MaxWidth valignmiddle height14 DisplayNone">
<Table cellpadding="16px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD id="idTd5" name="idTd5" class="valigntop">
<span id="idText1" name="idText" class="sys-font-body-bold sys-color-body">Windows Messenger is not installed</Span>
<P id="idP1" name="idP1">
<A href="http://www.microsoft.com/downloads/" name="idLink3" id="idLink3" class="sys-font-body sys-link-normal" target="_blank" tabindex="1">Download Windows Messenger</A>
</TD>
</TR>
</Table>
</Div>
<! --Setup for Messenger on x64 pro SKU -->
<Div id="idDivMSNSetupPro" name="idDivMSNSetupPro" class="MaxWidth valignmiddle height14 DisplayNone">
<Table cellpadding="16px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD id="idTd7" name="idTd7" class="valigntop">
<span id="idText2" name="idText2" class="sys-font-body-bold sys-color-body">Windows Messenger is not installed</Span>
<P id="idP5" name="idP5">
<A href="http://messenger.microsoft.com/" name="idLink6" id="idLink6" class="sys-font-body sys-link-normal" target="_blank" tabindex="1">Download Windows Messenger</A>
</TD>
</TR>
</Table>
</Div>
<!--Sign-in for MSN -->
<Div id="idDivMSNSignIn" name="idDivMSNSignIn" class="MaxWidth valigntop height14 DisplayNone">
<table cellpadding="16px" cellspacing="0" border="0" class="MaxLayout PositionR Zindex1">
<TR>
<TD id="idTd6" name="idTd6" class="valignTop">
<Span id="Text1" name="Text1" class="sys-font-body sys-color-body">To send an invitation to a Windows Messenger contact, you must sign in.</span>
<P id="idP2" name="idP2">
<Button id="idbtnMSNSignIn" name="idbtnMSNSignIn" class="sys-font-body sys-color-body" onclick="SignIn();" tabindex="1">&nbsp;&nbsp;&nbsp;&nbsp;Sign In&nbsp;&nbsp;&nbsp;&nbsp;</Button>
</TD>
</TR>
</Table>
</Div>
<!--Signing intoMSN -->
<Div id="idDivMSNSigning" name="idDivMSNSigning" class="MaxWidth height14 DisplayNone valigntop" >
<Table cellpadding="16px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD class="width16">
</TD>
<TD class="valignTop">
<img id="idimg6" name="idimg6" src="../common/logon_anim.gif"></img>
<P id="idP3" name="idP3">
<Span id="idMSNSigning" name="idMSNSigning" class="MaxWidth sys-font-body-bold sys-color-body " >
Signing in ....
</span>
</TD>
</TR>
</Table>
</Div>
<!--No Messenger allowed -->
<Div id="idDivNoMSN" name="idDivNoMSN" class="MaxWidth height14 DisplayNone valigntop" >
<Table cellpadding="16px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD class="width16">
</TD>
<TD class="valignTop">
<P id="idP4" name="idP4">
<Span id="idNoMSN" name="idNoMSN" class="MaxWidth sys-font-body-bold sys-color-body " >
An administrator has denied permission to use Windows Messenger. For information, contact your administrator.
</span>
</TD>
</TR>
</Table>
</Div>
<!--No Messenger on these SKUs -->
<Div id="idDivNoMSNSKU" name="idDivNoMSNSKU" class="MaxWidth height14 DisplayNone valigntop" >
<Table cellpadding="16px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD class="valignTop">
<P id="idP44" name="idP44">
<Span id="idNoMSNSKU" name="idNoMSNSKU" class="MaxWidth sys-font-body-bold sys-color-body " >
Remote Assistance can't work with Windows Messenger on this computer because it is running a 64-bit version of Windows Server 2003.
</span>
</TD>
</TR>
</Table>
</Div>
</TD>
</TR>
</table>
</TD>
</TR>
<TR>
<TD class="height7">
</TD>
</TR>
<TR>
<TD id="idTd8" name="idTd8">
<span id="idMethod2" name="idMethod2" class="sys-font-body-bold sys-color-body">or prepare an e-mail invitation</span>
</TD>
</TR>
<TR>
<TD class="Height5">
</TD>
</TR>
<TR>
<TD>
<table border="0" cellspacing="0" cellpadding="0" class="Maxwidth sys-toppane-color-border sys-table-cell-bgcolor5 bordertype1">
<TR>
<TD id="EmailCell1" name="EmailCell1" align="center" class="sys-table-cell-bgcolor3 valigntop width1" nowrap>
<BR>
<Span id="idEmailGif" name="idEmailGif"><Img src='../common/generic_mail.gif'></span>
<BR>
<span id="idEmail" name="idEmail" class="sys-font-body sys-color-body">E-mail</span>
<BR><BR>
</TD>
<TD class="height6">
<!-- Email client already setup -->
<Div id="idDivEmailConnected" name="idDivEmailConnected" class="MaxLayout height1 valignmiddle">
<Table cellpadding="6px" cellspacing="0" border="0" class="MaxLayout PositionR ZIndex1">
<TR>
<TD>
<table cellspacing="6px" cellpadding="0" border="0" class="MaxLayout">
<TR>
<TD id="idSpanTd" name="idSpanTd" colspan=3>
<Span id="idSpanTitle" name="idSpanTitle" class="sys-font-body sys-color-body">Type your assistant's first name:</Span>
</TD>
</TR>
<TR>
<TD id="idInputCell" name="idInputCell" class="Height2 width9">
<Input id="idEmailInput" name="idEmailInput" type="text" class="valignTop MaxWidth" onpaste="EnableEmailInvite();" onkeyup="EnableEmailInvite();" tabindex="2">
</TD>
</TR>
<TR>
<TD id="idTd10" name="idTd10" class="valigntop" nowrap colspan=3>
<Span id="idLink2Container" name="idLink2Container">
<img id="idimg4" name="idimg4" class="valignbottom borderNone" src="../common/dis_arrow.bmp"></img>
<Span id="idLink2" name="idLink2" class="sys-font-body" disabled>&nbsp;Continue</span>
</span>
</TD>
</TR>
</table>
</TD>
</TR>
</Table>
</Div>
</TD>
</TR>
</table>
</TD>
</TR>
<TR>
<TD class="Height10">
</TD>
</TR>
<TR>
<TD class="Height10">
</TD>
</TR>
<TR>
<TD id="idTd13" name="idTd13">
<Img id="idimg5"
name="idimg5"
onclick="parent.window.navigate('rcScreen8.htm');return false;"
class="valignbottom borderNone"
ondragstart="return false;"
src="../common/green_rest_16x.bmp"
onmouseover="this.style.cursor='hand';document.getElementById('idLinkMethod3').style.textDecorationUnderline=true"
onmouseout="document.getElementById('idLinkMethod3').style.textDecorationUnderline=false">
</Img>
&nbsp;
<A href="" id="idLinkMethod3"
name="idLinkMethod3"
ondragstart="return false;"
tabindex="5"
class="valignmiddle sys-font-body sys-link-normal"
onclick="parent.window.navigate('rcScreen8.htm');return false;">
Save invitation as a file (Advanced)
</A>
</TD>
</TR>
</Table>
</TD>
</TR>
</Table>
</Body>
</HTML>
