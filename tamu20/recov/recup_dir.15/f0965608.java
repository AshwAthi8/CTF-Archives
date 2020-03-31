
if (pszInitialDir && (pszInitialDir.length > 0))
{
nsc.SetRoot(pszInitialDir);
}
tdNsc.blur();
tdNewFolder.focus();
}
function ToggleOffline(chkOffline)
{
if (chkOffline.checked)
{
if (!nsc.CreateSubscriptionForSelection())
chkOffline.checked = false;
else
{
g_rgUrlsToSynch[g_strUrl] = true;
}
}
else
{
if (!nsc.DeleteSubscriptionForSelection())
chkOffline.checked = true;
else
delete g_rgUrlsToSynch[g_strUrl];
}
btnProperties.style.visibility = (chkOffline.checked ? "visible" : "hidden");
}
function BuildSynchList()
{
window.returnValue = "";
for (strUrl in g_rgUrlsToSynch)
{
window.returnValue += strUrl + "\0";
}
}
function Properties()
{
nsc.InvokeContextMenuCommand("properties");
}
function OnResize()
{
document.recalc(true);
}
function TdNscWidth()
{
return Math.max(0, document.body.offsetWidth - tableButtons.offsetWidth - (tableMain.border * 3) - (2 * parseInt(tdNsc.style.borderWidth)) - 6);
}
function TdPropertiesHeight()
{
return Math.max(0, document.body.offsetHeight - (tableMain.border * 2) - tdProperties.offsetTop - tdDone.offsetHeight - 8);
}
</script>
</HEAD>
<body style="margin-left: 0; margin-right: 0; margin-top: 0; margin-bottom: 0; background: threedface; align: center"
scroll="no" onkeydown="BodyOnKeyPress(event.keyCode)" onkeypress="BodyOnKeyPress(event.keyCode)" onload="EnableButtons()" onunload="BuildSynchList()" onresize="OnResize()">
<table id=tableMain cols=3 border=10 bordercolor=THREEDFACE>
<TR id=mainrow>
<TD valign=top id=infotext class=info>
