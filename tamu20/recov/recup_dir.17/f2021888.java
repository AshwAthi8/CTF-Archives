r:#CCCC99}
A:visited.tipsNavAll {color:#CCCC99}
A:hover.tipsNavText {color:#FFFFFF}
A:hover.tipsNavAll {color:#FFFFFF}
A:active.tipsNavAll {color:#FFFFFF}
A:active.tipsNavText {color:#FFFFFF}
.headerLinks{font-family:"Verdana";font-size:8pt;color:#000000}
.username{font-family:"Verdana";font-size:8pt;color:#FFFFFF;font-weight:bold;}
.menuName{font-family:"Verdana";font-size:8pt;font-weight:bold;color:#CCCCCC}
.toggleStyle{color:#CCCC99;text-decoration:none}
.tipsStyle{font-family:"Verdana";font-size:8pt;font-weight:bold;color:#CCCC99;text-decoration:none}
A:visited.tipsStyle {color:#CCCC99}
A:visited.tipsStyle {color:#CCCC99}
A:hover.tipsStyle {color:#FFFFFF}
A:hover.tipsStyle {color:#FFFFFF}
A:active.tipsStyle {color:#FFFFFF}
A:active.tipsStyle {color:#FFFFFF}
A:hover.toggleStyle{color:#FFFFFF}
A:visited.toggleStyle{color:#CCCCCC}
A:hover.headerLinks{color:#CCCC99}
A:visited.headerLinks{color:#000000}
A:hover.menuName{color:#FFFFFF}
</STYLE>
</HEAD>
<script language="Javascript">
var statTipsToggle = true;
var statTipsPageNumber = 0;
var tipsTranStatus = 0;
var cMail = 0;
var L_SetupNewsAccount_Text = "<a class=defaultA ondragstart=\"nodrag()\" href=oecmd:newNewsAccount>Set up a Newsgroups account...</a>";
var L_NewNewsMessage_Text = "<img src=Nnews.gif> Create a <a href=\"oecmd:newNewsMessage\" ondragstart=\"nodrag()\" class=defaultA>new News message</a>";
var L_ReadNews_Text = "<a class=defaultA ondragstart=\"nodrag()\" href=\"oecmd:readNews\">Read News</a>";
var L_SubscribeNews_Text = "<img src=Ngroups.gif> Subscribe to <a class=defaultA ondragstart=\"nodrag()\" href=\"oecmd:subscribeNews\" >Newsgroups...</a>";
var L_OpenTipsPane_Text = "Open tips pane";
var L_CloseTipsPane_Text = "Closes tips pane";
var L_NextTip_Text = "Show next tip";
var L_PrevTip_Text = "Show previous tip";
var L_LogoPre_Text = "Go to";
var L_LogoPost_Text = " "; <!--must have at least a space!!-->
var L_tips_text = "Tips";
var tmpStatus = "";
var L_PrevArrow_Text = "NPrev.gif";
var L_NextArrow_Text = "Nnext.gif";
var L_Prev_W_Arrow_Text = "Nprev_w.gif";
var L_Next_w_Arrow_Text = "Nnext_w.gif";
var statusObj = new Array(new statusObjConst("tipGRCText", L_OpenTipsPane_Text),
new statusObjConst("tipsBox", L_CloseTipsPane_Text),
new statusObjConst("tipArrow", L_OpenTipsPane_Text),
new statusObjConst("tipsCloseBoxAnchor",L_CloseTipsPane_Text),
new statusObjConst("ridPrevTip", L_PrevTip_Text),
new statusObjConst("ridNextTip", L_NextTip_Text),
new statusObjConst("prevAnchor", L_PrevTip_Text),
new statusObjConst("nextAnchor", L_NextTip_Text));
function statusObjConst(p_ID,p_statusStr){
this.statusID=p_ID
this.statusStr=p_statusStr
return this
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
return false;
}
function updateAccountInfo()
{
if (OutlookExpress.newsAccounts != null)
{
cNews = OutlookExpress.newsAccounts;
if (cNews == 0)
{
newsRow1.innerHTML = L_SetupNewsAccount_Text;
newsRow2.innerHTML = "";
newsRow3.innerHTML = "";
newsRow4.innerHTML = "";
}
else
{
newsRow1.innerHTML = L_NewNewsMessage_Text;
newsRow2.innerHTML = L_ReadNews_Text;
newsRow3.innerHTML = L_SubscribeNews_Text;
newsRow4.innerHTML = L_SetupNewsAccount_Text;
}
}
}
function window.onload()
{
updateAccountInfo();
if (OutlookExpress.optShowTips != null)
{
statTipsPageNumber = Math.floor(Math.random()*(OutlookExpress.tipCount-1));
statTipsToggle = !OutlookExpress.optShowTips;
stattiptext.innerHTML = OutlookExpress.tips(statTipsPageNumber);
tipsToggle();
toggleLogo(OutlookExpress.hotmailEnabled);
}
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
tmpStr += 'onmouseOver="objHilite(document.all(\'tipArrow\'),\'NTips_w.gif\');return false" '
tmpStr += 'onfocus="objHilite(document.all(\'tipArrow\'),\'NTips_w.gif\');setStatus(this,\'ID\');return false" '
tmpStr += 'onmouseOut="objHilite(document.all(\'tipArrow\'),\'NTips_y.gif\');return false">'
tmpStr += L_tips_text + '<img src="NTips_y.gif" border=0 id=tipArrow align="bottom" hspace=4 WIDTH="9" HEIGHT="5"></a>'
p_obj.innerHTML=tmpStr
}
function nodrag()
{
window.event.returnValue=false;
}
function objHilite(p_obj,p_color){
//error check for disappearing objects here
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
<body bgcolor=#FFFFFF leftmargin=0 topmargin=0 rightmargin=0 bottommargin=0">
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
<td width=141 align=left><img src="outlook.gif"></td>
<td valign=middle align=right style="height:25px;"><div id=logoDiv style="vertical-align:middle;font-family:"Verdana";font-size:8pt;color:#000000"><a class=defaultA style="text-decoration:none">
<table cellpadding=0 cellspacing=0 border=0 style="height:25px"><tr><td valign=middle id="logoPreTextLoc"><font class=sectionHead><a class=defaultA style="text-decoration:none" id=logoPreText>Go to</a></font></td><td><a id=logoImage class=defaultA style="text-decoration:none"><img src="MSNLink.gif" align=middle border=0></a></td><td><font class=sectionHead><a class=defaultA style="text-decoration:none" id=logoPostText></a></font></td></tr></table></a></div></td>
</tr>
<tr><td width=141 align=left><img src="newreader.gif"></td>
<td style="height:22px;background-color:#000000;padding-bottom:2px;" valign=bottom class=userName>
<nobr></nobr></td>
</tr>
</table>
</td>
</tr>
<!-- new tips band area-->
<tr><td colspan="2" style="height:18" ID="ridTipsTable" align="right">
<span id="tipsMenuON" style="height:18;visibility:visible;overflow:clip">
<table border="0" cellpadding="0" cellspacing="0" width="100%" bgcolor="#777777">
<tr> <td ID="ridFindMessage" style="padding-bottom:4;padding-left:5;padding-right:9;height:18" align="right" valign="bottom"><nobr id="findMssLoc">
<a ondragstart="nodrag()" id="findMss" href="oecmd:findMessage" class="menuName" style="text-decoration:underline">Find a Message...</a>
&nbsp;&nbsp;
<span id="tipsMenuMess" class="tipsStyle"></span></nobr></td>
</tr></table></span>
</td></tr>
<!-- end new tips band area-->
<tr>
<td width=75% valign=top>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td style="height:4%;width=100%"></td></tr>
<tr>
<td align=left valign=top>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr><td style="height:15%;width:100%"></td></tr>
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
<tr><td rowspan=4 width=15%></td>
<td valign=middle>
<font>
<span id=newsRow1 style="height:16">
</span></font></td>
</tr>
<tr>
<td valign=middle>
<font>
<span id=newsRow2 style="height:16">
</span></font></td>
</tr>
<tr>
<td valign=middle>
<font>
<span id=newsRow3 style="height:16">
</span></font></td>
</tr>
<tr>
<td valign=middle>
<font>
<span id=newsRow4 style="height:16">
</span></font></td>
</tr>
</table></td></tr>
<tr><td></td><td></td><td></td></tr>
<tr><td style="height:25%;width:100%"></td></tr>
</table>
</td>
</tr>
</table>
</td>
<td width=25% style="height:100%">
<div id=tipsFrame class=tipsFrameStyle style="visibility:visible">
<table style="height:100%" border=0 cellpadding=0 cellspacing=0 width=100% bgcolor=#CCCCCC >
<tr>
<td valign=top width=100%>
<table border=0 cellpadding=0 cellspacing=0 width=100%>
<tr><td style="height:4px"></td></tr>
<tr>
<td style="width:6px"></td>
<td valign=middle style="height:18px"><font class=sectionHead><nobr id=ridTOD>Tip of the day</nobr></font></td>
<td align=right align=right>
<a id=tipsCloseBoxAnchor ondragstart="nodrag()" href="oecmd:noop" onmouseover="document.all('tipsBox').src='NCloseUp.gif'" onmouseout="document.all('tipsBox').src='NClose.gif'" onfocus="setStatus(this,'ID');return false;" onblur="clearStatus();return false;" onclick="this.blur;tipsToggle();return false;">
<img name="tipsBox" src="NClose.gif" height=17 width=20 border=0></td>
</tr>
<tr><td style="height:12px"></td><tr>
<tr><td style="width:6px" rowspan=2></td>
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
<nobr id=ridPrevTip><img src="NPrev.gif" border=0 id=prevarrow align="middle" hspace=4>Previous</a></nobr></td>
<td style="height:25px;background-color:#000000" valign=middle align=middle>&nbsp;&nbsp;</td>
<td style="height:25px;background-color:#000000" valign=middle align=right class=tipsNavText>
<a ondragstart="nodrag()" href="oecmd:noop" class=tipsNavAll id=nextAnchor
onclick="nextTip('next');return false;"
onmouseOver="objHilite(document.all('nextarrow'),L_Next_w_Arrow_Text);return false"
onmouseOut="objHilite(document.all('nextarrow'),L_NextArrow_Text);return false"
onfocus="setStatus(this,'ID');return false;" onblur="clearStatus();return false;"
><nobr id=ridNextTip>Next<img src="Nnext.gif" border=0 id=nextarrow align="middle" hspace=4></a></nobr></td>
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
<div id="backImage" style="position:absolute;top:0;left:0;z-index:-1;height:100%;width:100%;overflow:clip;align:right">
<table border="0" cellpadding="0" cellspacing="0" height="100%" width="100%">
<tr><td height="40" colspan="3">&nbsp;</td></tr>
<tr><td height="18" bgcolor="#777777" colspan="3">&nbsp;</td></tr>
<tr><td style="height:100%"></td><td background="bodyOtlk.jpg" valign="top" align="right" width="224" height="100%">&nbsp;</td><td style="width:0%" id="backImgCell"></td></tr></table></div>
<A id=msnlink STYLE="display:none"></a>
</html>
