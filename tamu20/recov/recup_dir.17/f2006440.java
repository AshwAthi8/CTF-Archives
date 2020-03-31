A:visited.menuItemStyle {color:#FFCC00}
A:hover.menuItemStyle {color:#FFFFFF}
A:active.menuItemStyle {color:#FFFFFF}
A:visited.menuItemStyleDisabled {color:#999999}
A:hover.menuItemStyleDisabled {color:#999999}
A:active.menuItemStyleDisabled {color:#999999}
</STYLE>
</HEAD>
<script language="Javascript">
var statTipsToggle = true;
var statTipsPageNumber = 0;
var tipsTranStatus = 0;
var cMail = 0;
var L_SetupMailAccount_Text = "<a class=defaultA ondragstart=\"nodrag()\" href=oecmd:newMailAccount>Set up a Mail account...</a>";
var L_SetupNewsAccount_Text = "<a class=defaultA ondragstart=\"nodrag()\" href=oecmd:newNewsAccount>Set up a Newsgroups account...</a>";
var L_OneMailMessage_Text = "<img src=unread.gif> There is <b><A class=defaultA ondragstart=\"nodrag()\" HREF=\"oecmd:readMail\"> 1 unread Mail message</A></b> in your Inbox";
var L_NoMail_Text = "There are no unread Mail messages in your <A class=defaultA ondragstart=\"nodrag()\" HREF=\"oecmd:readMail\">Inbox</a>";
var L_ManyMail_Text = "<img src=unread.gif> There are <b><A class=defaultA ondragstart=\"nodrag()\" HREF=\"oecmd:readMail\"> %s unread Mail</A></b> messages in your Inbox";
var L_ForUser_Text = "for %s";
var L_NewMailMessage_Text = "<img src=newmail.gif> Create a <a href=\"oecmd:newMessage\" ondragstart=\"nodrag()\" class=defaultA> new Mail message</a>";
var L_ReadMail_Text = "<a href=\"oecmd:readMail\" ondragstart=\"nodrag()\" class=defaultA>Read Mail</a>";
var L_NewNewsMessage_Text = "<img src=newnews.gif> Create a <a href=\"oecmd:newNewsMessage\" ondragstart=\"nodrag()\" class=defaultA>new News message</a>";
var L_ReadNews_Text = "<a class=defaultA ondragstart=\"nodrag()\" href=\"oecmd:readNews\">Read News</a>";
var L_SubscribeNews_Text = "<img src=groups.gif> Subscribe to <a class=defaultA ondragstart=\"nodrag()\" href=\"oecmd:subscribeNews\" >Newsgroups...</a>";
var L_LogoPre_Text = "Go to"; //must have at least a space!!
var L_LogoPost_Text = " "; //must have at least a space!!
var L_Ident_text = "Identities";
var L_tips_text = "Tips";
var tmpStatus = "";
var L_PrevArrow_Text = "prev.gif";
var L_NextArrow_Text = "next.gif";
var L_Prev_W_Arrow_Text = "prev_w.gif";
var L_Next_w_Arrow_Text = "next_w.gif";
var L_OpenTipsPane_Text = "Open tips pane";
var L_CloseTipsPane_Text = "Closes tips pane";
var L_NextTip_Text = "Show next tip";
var L_PrevTip_Text = "Show previous tip";
var L_ShowIdent_Text = "Opens Identities Menu";
var statusObj = new Array(new statusObjConst("tipGRCText", L_OpenTipsPane_Text),
new statusObjConst("tipsBox", L_CloseTipsPane_Text),
new statusObjConst("tipArrow", L_OpenTipsPane_Text),
new statusObjConst("tipsCloseBoxAnchor",L_CloseTipsPane_Text),
new statusObjConst("SwitchID", L_ShowIdent_Text),
new statusObjConst("idGRC", L_ShowIdent_Text),
new statusObjConst("ridPrevTip", L_PrevTip_Text),
new statusObjConst("ridNextTip", L_NextTip_Text),
new statusObjConst("prevAnchor", L_PrevTip_Text),
new statusObjConst("nextAnchor", L_NextTip_Text));
function statusObjConst(p_ID,p_statusStr){
this.statusID=p_ID
this.statusStr=p_statusStr
return this
}
function window.document.onkeypress(){
keyhideIDMenu()
}
function document.onmouseover(){
setStatus(window.event.srcElement,'event')
}
function setStatus(p_obj,p_mode){
switch(p_mode){
case 'event':
eID = window.event.srcElement
break;
case 'ID':
eID = p_obj
break;
default:
}
for(nn=0;nn <= statusObj.length - 1;nn++){
//alert(eID_ID + ":" + statusObj[nn].statusID)
if (eID == document.all(statusObj[nn].statusID)){
window.status = statusObj[nn].statusStr
tmpStatus = statusObj[nn].statusStr
//alert('got it:' + nn)
window.event.cancelBubble=true
setTimeout('pushStatus()',0); //forces into status window ASAP
break;
}
}
//window.status = e.srcElement.name
window.event.cancelBubble=true
}
function pushStatus(){ //used by mouseover to force status display
window.status = tmpStatus
tmpStatus = ""
}
function document.onmouseout(){
clearStatus();
}
function clearStatus(){
window.status = ""
window.event.cancelBubble = true
}
function toggleLogo(p_mode){
logoHref = msnlink.href;
document.all("logoPreText").innerText = L_LogoPre_Text
document.all("logoPostText").innerText = L_LogoPost_Text
document.all("logoPreText").href = logoHref
document.all("logoPostText").href = logoHref
document.all("logoImage").href = logoHref
if(p_mode){
document.all("logoDiv").style.visibility="visible"
}else{
document.all("logoDiv").style.visibility="hidden"
}
if(document.dir == "rtl")
document.all("tblLogo").dir = "rtl";
return false;
}
function updateUnreadMail()
{
if (OutlookExpress.unreadMail != null)
cUnread = OutlookExpress.unreadMail;
else
cUnread = 0;
// update only if we have mail accounts
if (cUnread == 0)
psz = L_NoMail_Text;
else if (cUnread == 1)
psz = L_OneMailMessage_Text;
else
{
psz = L_ManyMail_Text.split('%s')[0] + cUnread + L_ManyMail_Text.split('%s')[1];
}
if (document.all.statmail != null)
statmail.innerHTML = psz;
}
function updateAccountInfo()
{
if (OutlookExpress.mailAccounts != null)
{
szUser = OutlookExpress.userName;
cMail = OutlookExpress.mailAccounts;
cNews = OutlookExpress.newsAccounts;
}
else
{
// we may be running on IE4, if so, assume mail and news setup.
szUser = "";
cMail = 1;
cNews = 1;
}
if (szUser != "")
userRef.innerText = L_ForUser_Text.split('%s')[0] + szUser + L_ForUser_Text.split('%s')[1];
if (cMail == 0)
{
mailRow2.innerHTML = L_SetupMailAccount_Text;
mailRow3.innerHTML = "";
}
else
{
mailRow2.innerHTML = L_NewMailMessage_Text;
mailRow3.innerHTML = L_ReadMail_Text;
}
if (cNews == 0)
{
newsRow1.innerHTML = L_SetupNewsAccount_Text;
newsRow2.innerHTML = "";
newsRow3.innerHTML = "";
}
else
{
newsRow1.innerHTML = L_NewNewsMessage_Text;
newsRow2.innerHTML = L_ReadNews_Text;
newsRow3.innerHTML = L_SubscribeNews_Text;
}
}
function window.onload()
{
updateAccountInfo();
updateUnreadMail();
if (OutlookExpress.optShowTips != null)
{
statTipsPageNumber = Math.floor(Math.random()*(OutlookExpress.tipCount-1));
statTipsToggle = !OutlookExpress.optShowTips;
stattiptext.innerHTML = OutlookExpress.tips(statTipsPageNumber);
tipsToggle();
goDirectlyToInbox.checked = OutlookExpress.optGotoInbox;
}
toggleIDmenu();
toggleLogo(OutlookExpress.hotmailEnabled); //new code to toggle ISP logo option
// fire notification to show page
OutlookExpress.loadComplete();
}
function nextTip(p_dir){
if(p_dir == 'next'){
statTipsPageNumber ++
if (statTipsPageNumber == OutlookExpress.tipCount)
statTipsPageNumber = 0;
displayTips(6,7)
return
}
if(p_dir == 'prev'){
statTipsPageNumber--;
if (statTipsPageNumber < 0)
statTipsPageNumber = OutlookExpress.tipCount-1;
displayTips(7,6)
return
}
}
function displayTips(p_transOff,p_transOn){
if (tipsTranStatus == 0){
tipsTranStatus = p_transOn
stattiptext.filters.revealTrans.Apply()
stattiptext.filters.revealTrans.Transition = p_transOff
stattiptext.style.visibility ="hidden"
stattiptext.filters.revealTrans.Play(.5)
}
}
function showText(p_trans){
if (tipsTranStatus == p_trans){
tipsTranStatus = 1
stattiptext.filters.revealTrans.Apply()
stattiptext.filters.revealTrans.Transition = p_trans
stattiptext.innerHTML = OutlookExpress.tips(statTipsPageNumber)
stattiptext.style.visibility ="visible"
stattiptext.filters.revealTrans.Play(.5)
}
}
function tipsToggle(){
if(statTipsToggle){
statTipsToggle = false
hideMe(document.all("tipsFrame"));
hideMe(document.all("stattiptext"));
menushowMe(document.all("tipsMenuMess"));
document.all("backImgCell").style.width="0%"
}else{
statTipsToggle = true
showMe(document.all("tipsFrame"));
showMe(document.all("stattiptext"));
menuhideMe(document.all("tipsMenuMess"));
document.all("backImgCell").style.width="25%"
}
OutlookExpress.optShowTips = statTipsToggle;
}
function hideMe(p_obj){
p_obj.style.visibility="hidden";
}
function showMe(p_obj){
p_obj.style.visibility="visible";
}
function menuhideMe(p_obj){
var tmpStr = '<font class=tipsStyle>&nbsp;</font>'
p_obj.innerHTML=tmpStr
}
function menushowMe(p_obj){
var tmpStr = '<a ondragstart="nodrag()" href="oecmd:noop" class=tipsStyle onclick="this.blur;tipsToggle();return false;" id=tipGRCText '
tmpStr += 'onmouseOver="objHilite(document.all(\'tipArrow\'),\'tips_w.gif\');return false" '
tmpStr += 'onfocus="objHilite(document.all(\'tipArrow\'),\'tips_w.gif\');setStatus(this,\'ID\');return false" '
tmpStr += 'onmouseOut="objHilite(document.all(\'tipArrow\'),\'tips_y.gif\');return false">'
tmpStr += L_tips_text + '<img src="tips_y.gif" border=0 id=tipArrow align="bottom" hspace=4 WIDTH="9" HEIGHT="5"></a>'
p_obj.innerHTML=tmpStr
}
function nodrag()
{
window.event.returnValue=false;
}
function window.onscroll(){
hideIDMenu();
}
function window.onresize(){
hideIDMenu();
}
function keyhideIDMenu(){
if(window.event.keyCode == 27){
hideIDMenu()
}
}
function hideIDMenu(){
if(document.all("idDrop").style.visibility == "visible"){
document.all("SwitchID").focus()
document.all("idDrop").style.visibility = "hidden"
document.all("idDrop").style.left = 0
}
}
function toggleIDmenu(){
if(OutlookExpress.multiuserEnabled != null){
if(OutlookExpress.multiuserEnabled == false){
menuhideMe(document.all("SwitchIDMenu"))
}else{
tmpStr= '<a ondragstart="nodrag()" id=SwitchID onclick="showIDMenu(this);return false" href="oecmd:noop" class="tipsStyle"'
tmpStr += 'onmouseOver="objHilite(document.all(\'idGRC\'),\'tips_w.gif\');return false" '
tmpStr += 'onfocus="objHilite(document.all(\'idGRC\'),\'tips_w.gif\');setStatus(this,\'ID\');return false" onblur="clearStatus()" '
tmpStr += 'onmouseOut="objHilite(document.all(\'idGRC\'),\'tips_y.gif\');return false"> '
tmpStr += L_Ident_text + '<img id="idGRC" src="tips_Y.gif" border="0" align="bottom" hspace="4" WIDTH="9" HEIGHT="5"></a></span>'
document.all("SwitchIDMenu").innerHTML=tmpStr
}
}
}
function showIDMenu(p_obj){
if(document.all("idDrop").style.visibility=="visible"){
hideIDMenu()
return false
}
var e = window.event
e.cancelBubble=true
var menuW = document.all("idDrop").style.posWidth
document.all("userName").innerText = OutlookExpress.userName
if(OutlookExpress.multiuserEnabled == false || OutlookExpress.userCount <= 1){
document.all("menulogOffID").className = 'menuItemStyleDisabled'
}else{
document.all("menulogOffID").className = 'menuItemStyle'
}
document.all("idDrop").style.top=72
if(document.dir != "rtl"){
document.all("idDrop").style.left=((document.body.clientWidth - menuW) + document.body.scrollLeft)
}
document.all("idDrop").style.visibility="visible"
}
function goMenu(p_obj){
p_obj.blur
hideIDMenu()
return true
}
function objHilite(p_obj,p_color){
if(p_obj == null){
return false
}
if(p_obj.tagName.toUpperCase() != "IMG"){
p_obj.style.color=p_color;
}else{
p_obj.src=p_color
}
}
</script>
<script for="stattiptext" event="onfilterchange">
if(tipsTranStatus > 1){
showText(tipsTranStatus)
}else{
tipsTranStatus = 0
}
</script>
<body bgcolor=#FFFFFF leftmargin=0 topmargin=0 rightmargin=0 bottommargin=0 onclick="hideIDMenu()">
<OE:Application id=OutlookExpress>
<SCRIPT for=OutlookExpress event=onNewMail>
updateUnreadMail()
</SCRIPT>
<SCRIPT for=OutlookExpress event=onAccountChange>
updateAccountInfo()
</SCRIPT>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr>
<td valign=top width=100% colspan=2>
<table dir=ltr border=0 cellpadding=0 cellspacing=0 width=100% height=50 bgcolor=#FFFFFF>
<tr>
<td width=141 align=left><img src="oelogo1.gif"></td>
<td valign=middle align=right style="height:25px;"><div id=logoDiv style="vertical-align:middle;font-family:"Verdana";font-size:8pt;color:#000000"><a class=defaultA style="text-decoration:none">
<table id=tblLogo cellpadding=0 cellspacing=0 border=0 style="height:25px"><tr><td valign=middle><font class=sectionHead><a class=defaultA style="text-decoration:none" id=logoPreText>Go to</a></font></td><td><a id=logoImage class=defaultA style="text-decoration:none"><img src="gomsn.gif" align=middle border=0></a></td><td><font class=sectionHead><a class=defaultA style="text-decoration:none" id=logoPostText></a></font></td></tr></table></a></div></td>
</tr>
<tr><td width=141 align=left><img src="oelogo2.gif"></td>
<td style="height:22px;background-color:#000000;padding-bottom:2px;" valign=bottom class=userName>
<nobr><span id=userRef>&nbsp;</span></nobr></td>
</tr>
</table>
</td>
</tr>
<!-- new tips band area-->
<tr>
<td colspan="2" style="height:18" ID="ridTipsTable" align="right">
<span id="tipsMenuON" style="height:18;visibility:visible;overflow:clip">
<table border="0" cellpadding="0" cellspacing="0" width="100%" bgcolor="#777777">
<tr>
<td ID="ridFindMessage" style="padding-bottom:4;padding-left:5;padding-right:9;height:18" align="right" valign="bottom"><nobr id="findMssLoc">
<a ondragstart="nodrag()" id="findMss" href="oecmd:findMessage" class="menuName" style="text-decoration:underline">Find a Message...</a>
&nbsp;&nbsp;
<span id=SwitchIDMenu class="tipsStyle">
<a ondragstart="nodrag()" id=SwitchID onclick="showIDMenu(this);return false" href="oecmd:noop" class="tipsStyle"
onmouseOver="objHilite(document.all('idGRC'),'tips_w.gif');return false"
onmouseOut="objHilite(document.all('idGRC'),'tips_y.gif');return false">
Identities<img id="idGRC" src="tips_Y.gif" border="0" align="bottom" hspace="4" WIDTH="9" HEIGHT="5"></a></span>
<span id="tipsMenuMess" class="tipsStyle"></span></nobr></td>
</tr>
</table>
</span>
</td>
</tr>
<!-- end new tips band area-->
<tr>
<td width=75%>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr>
<td ID=ridCell1 align=left valign=top>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td>
<table border=0 cellpadding=0 cellspacing=0 width=246>
<tr>
<td ID=ridCell2 class=headerCell><font class=sectionHead>&nbsp;E-mail</font></td>
<td width=106>&nbsp;</td>
</tr>
<tr>
<td colspan=2 class=headerCellLine></td>
</tr>
</table></td>
</tr>
<tr>
<td valign=top class=messagesCell colspan=3>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td rowspan=3 width=15%></td>
<td valign=middle>
<font class=bodyTopLine>
<span id=mailRow1>
<span id="statmail">&nbsp;</span>
<span></font></td>
</tr>
<tr>
<td valign=middle>
<font>
<span id=mailRow2>
</span></font></td>
</tr>
<tr>
<td id=ridCell10 valign=middle>
<font><span id=mailRow3>
<a href="oecmd:readMail" id=new2ondragstart="nodrag()" class=defaultA>Read Mail</a>
</span></font></td>
</tr>
</table></td>
</tr>
<tr>
<td></td><td></td><td></td>
</tr>
</table></td>
</tr>
<tr><td style="height:4%;width=100%"></td></tr>
<tr>
<td align=left valign=top>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td>
<table border=0 cellpadding=0 cellspacing=0 width=246>
<tr>
<td ID=ridCell3 class=headerCell><font class=sectionHead>&nbsp;Newsgroups</font></td>
<td width=106>&nbsp;</td>
</tr>
<tr>
<td colspan=2 class=headerCellLine></td>
</tr>
</table></td>
</tr>
<tr>
<td valign=top class=messagesCell colspan=3>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td rowspan=3 width=15%></td>
<td valign=middle>
<font>
<span id=newsRow1>
</span></font></td>
</tr>
<tr>
<td valign=middle>
<font>
<span id=newsRow2>
</span></font></td>
</tr>
<tr>
<td valign=middle>
<font>
<span id=newsRow3>
</span></font></td>
</tr>
</table></td>
</tr>
<tr><td></td><td></td><td></td></tr>
</table></td>
</tr>
<tr><td style="height:4%;width=100%"></td></tr>
<tr>
<td align=left valign=top>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td>
<table border=0 cellpadding=0 cellspacing=0 width=246>
<tr>
<td ID=ridCell4 class=headerCell><font class=sectionHead>&nbsp;Contacts</font></td>
<td width=106>&nbsp;</td>
</tr>
<tr>
<td colspan=2 class=headerCellLine></td>
</tr>
</table></td>
</tr>
<tr>
<td valign=top class=messagesCell colspan=3>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td rowspan=4 width=15%></td>
<td id=ridcell11 valign=middle>
<img src=wab.gif> <font><a ondragstart="nodrag()" href="oecmd:addrBook" class=defaultA>Open the Address Book...</a></font></td>
</tr>
<tr>
<td ID=ridCell5 valign=middle>
<img src=wabfind.gif>
<font><a ondragstart="nodrag()" href="oecmd:findAddr" class=defaultA>Find People...</a></font></td>
</tr>
</table></td>
</tr>
<tr><td></td><td></td><td></td></tr>
</table></td>
</tr>
<tr><td ID=ridCell6 valign="center" style="height:24px;width:100%">
<input accesskey='i' type="checkbox" id=goDirectlyToInbox onpropertychange="OutlookExpress.optGotoInbox = goDirectlyToInbox.checked;"><font>When Outlook Express starts, go directly to my <u>I</u>nbox.</font></td></tr>
</table>
</td>
<td width=25% style="height:100%">
<div id=tipsFrame class=tipsFrameStyle style="visibility:visible">
<table style="height:100%" border=0 cellpadding=0 cellspacing=0 width=100% bgcolor=#CCCCCC>
<tr>
<td valign=top width=100%>
<table border=0 cellpadding=0 cellspacing=0 width=100%>
<tr><td style="height:4px"></span></td></tr>
<tr>
<td><span style="width:6px"></span></td>
<td valign=middle style="height:6px"><font class=sectionHead><nobr id=ridTOD>Tip of the day</nobr></font></td>
<td valign=middle align=right>
<a id=tipsCloseBoxAnchor ondragstart="nodrag()" href="oecmd:noop" onmouseover="document.all('tipsBox').src='closeup.gif'" onmouseout="document.all('tipsBox').src='close.gif'" onfocus="setStatus(this,'ID');return false;" onblur="clearStatus();return false;" onclick="this.blur;tipsToggle();return false;">
<img name="tipsBox" src="close.gif" height=17 width=20 border=0></td>
</tr>
<tr><td style="height:12px"></td><tr>
<tr><td></td>
<td ID="ridTipOfTheDay" valign=top align=left class=messagesCell colspan=2 style="padding-right:6px">
<div id=stattiptext class=tipsBodyText>
&nbsp;
</div></td>
</tr>
</table>
</td>
<tr>
<td valign=bottom width=100%>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=25>
<tr>
<td style="height:25px;background-color:#000000" valign=middle align=left class=tipsNavText>
<a ondragstart="nodrag()" href="oecmd:noop" class=tipsNavAll id=prevAnchor
onclick="nextTip('prev');return false;"
onmouseOver="objHilite(document.all('prevarrow'),L_Prev_W_Arrow_Text);return false"
onmouseOut="objHilite(document.all('prevarrow'),L_PrevArrow_Text);return false"
onfocus="setStatus(this,'ID');return false;" onblur="clearStatus();return false;">
<nobr id=ridPrevTip><img src="prev.gif" border=0 id=prevarrow align="middle" hspace=4>Previous</a></nobr></td>
<td style="height:25px;background-color:#000000" valign=middle align=middle>&nbsp;&nbsp;</td>
<td style="height:25px;background-color:#000000" valign=middle align=right class=tipsNavText>
<a ondragstart="nodrag()" href="oecmd:noop" class=tipsNavAll id=nextAnchor
onclick="nextTip('next');return false;"
onmouseOver="objHilite(document.all('nextarrow'),L_Next_w_Arrow_Text);return false"
onmouseOut="objHilite(document.all('nextarrow'),L_NextArrow_Text);return false"
onfocus="setStatus(this,'ID');return false;" onblur="clearStatus();return false;"
><nobr id=ridNextTip>Next<img src="next.gif" border=0 id=nextarrow align="middle" hspace=4></a></nobr></td>
</tr>
</table>
</td>
</tr>
</table>
</div>
</td>
</tr>
</table>
</body>
<div id="idDrop" style="position:absolute;z-order:5;top:0;left:0;width:300;height:25;visibility:hidden;" ALIGN="RIGHT"><table cellpadding="0" cellspacing="0" class="dropMenuStyle"><tr><td class="menuCell" colspan="2" style="border-bottom:1 solid #000000"><a href="oecmd:switchUser" onclick="goMenu(this)" class="menuItemStyle" id=menuSwitchID><nobr id="menuItemStyleLoc">Switch Identities...</nobr></a></td></tr><tr><td class="menuCell"><a href="oecmd:newUser" onclick="goMenu(this)" class="menuItemStyle" id="menuaddnewID"><nobr id="menuaddnewIDLoc">Add New Identity...</nobr></a></td><td width="40"></td></tr><tr><td class="menuCell"><a href="oecmd:manageUser" onclick="goMenu(this)" class="menuItemStyle" id="menumanageID"><nobr id="menumanageIDLoc">Manage Identities...</nobr></a></td></tr><tr><td class="menuCell"><a href="oecmd:logoff" onclick="goMenu(this)" class="menuItemStyleDisabled" id="menulogOffID"><nobr id="menulogOffIDLoc">Log Off <span id=userName></span></nobr></a></td></tr></table></div>
<div id="backImage" style="position:absolute;top:0;left:0;z-index:-1;height:100%;width:100%;overflow:clip;align:right">
<table border="0" cellpadding="0" cellspacing="0" height="100%" width="100%">
<tr><td height="40" colspan="3">&nbsp;</td></tr>
<tr><td height="18" bgcolor="#777777" colspan="3">&nbsp;</td></tr>
<tr><td style="height:100%"></td><td background="bodybg.jpg" valign="top" align="right" width="224" height="100%">&nbsp;</td><td style="width:0%" id="backImgCell"></td></tr></table></div>
<A id=msnlink STYLE="display:none"></a>
<IMG src="next_w.gif" width=1 height=0 STYLE="display:none" >
<IMG src="prev_w.gif" width=1 height=0 STYLE="display:none">
<IMG src="closeup.gif" width=1 height=0 STYLE="display:none">
<IMG src="tips_w.gif" width=1 height=0 STYLE="display:none">
<IMG src="unread.gif" width=1 height=0 STYLE="display:none">
</html>
<HTML>
<HEAD>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html;charset=iso-8859-1">
<STYLE TYPE="text/css">
TD { font-weight: bold; }
TD.HEADER { font-weight: normal; }
.GOOD { color: #999; }
.BAD { color: #f00; }
.UNK { color: #dd0; }
H1 {
text-align: center;
letter-spacing: 0.1em;
font: "small-caps" bold larger;
}
</STYLE>
</HEAD>
<BODY ID="ridFonts" STYLE="font-family: helvetica, sans-serif; background: black; color: white">
<H1 ID="ridHeader1" CLASS=BAD>
Security Warning
<BR><IMG ID="ridImage1" SRC="res://msoeres.dll/redrule.gif">
</H1>
<TABLE ID="ridTable1" ALIGN="CENTER">
<TR>
<TD ID="ridTable1Row1" CLASS=HEADER>
There are <B><SPAN CLASS=BAD>security problems</SPAN></B> with this message.<BR>
Please review the <B><SPAN ID=hightext>highlighted</SPAN></B> items listed below:
</TD>
</TR>
</TABLE>
<BR>
<TABLE ID="ridTable2" ALIGN="CENTER" WIDTH=65%>
