td.firstChild.innerText + ". " + strTip;
SetRelativeCells(tr, td);
}
}
function CreateUserSelectionTable(oParent, cCols)
{
var oTable = document.createElement('<TABLE cellspacing=10 cellpadding=1 style="table-layout:fixed"></TABLE>');
if (!oTable)
{
oParent.style.display = 'none';
return;
}
var oUserList = top.window.g_oUserList;
var strGuest = top.window.GetGuestName();
var strLoggedOnUser = top.window.g_strLoggedOnUserName;
var fIncludeSelf = (null != strLoggedOnUser);
var cUsers = oUserList.length;
var oGuest = null;
if (!cCols || cCols < 1)
cCols = 1;
oTable.cols = cCols;
var tr = oTable.insertRow();
for (var i = 0; i < cUsers; i++)
{
var oUser = oUserList(i);
var strLoginName = oUser.setting("LoginName").toLowerCase();
if (strGuest.toLowerCase() == strLoginName)
{
oGuest = oUser;
continue;
}
var bIsLoggedOnUser = strLoggedOnUser ? (strLoginName == strLoggedOnUser) : false;
if (fIncludeSelf || !bIsLoggedOnUser)
{
if (fIncludeSelf)
{
if (!bIsLoggedOnUser)
{
oUser = oUserList.currentUser;
i--;
}
fIncludeSelf = false;
}
AddCell(tr, oUser);
if (tr.cells.length == cCols)
tr = oTable.insertRow();
}
}
try
{
if (top.window.GetLocalMachine().isGuestEnabled(1))
{
AddCell(tr, oGuest, top.window.L_Guest_ToolTip, top.window.L_GuestEnabled_Property);
}
else
{
var td = tr.insertCell();
td.className = "Selectable";
td.onclick = new Function("top.window.g_Navigator.navigate('enableguest.htm');");
td.tabIndex = -1;
td.innerHTML = top.window.CreateUserDisplayHTML2(strGuest, top.window.L_GuestDisabled_Property, "guest_disabled.bmp");
td.firstChild.title = top.window.L_GuestEnable_ToolTip;
td.title = td.firstChild.innerText + ". " + td.firstChild.title;
SetRelativeCells(tr, td);
}
}
catch (e)
{
}
oTable.cells.item(0).tabIndex = 0;
oParent.appendChild(oTable);
}
