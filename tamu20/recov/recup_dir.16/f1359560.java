erList.currentUser;
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
