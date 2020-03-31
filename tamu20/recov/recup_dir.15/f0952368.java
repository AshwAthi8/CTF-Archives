== "http") )
{
strOffline = "<input type=checkbox align=";
if(document.dir == "rtl")
{
strOffline +="right";
}
else
{
strOffline +="left";
}
strOffline +=" TABINDEX=5 ACCESSKEY=" + L_MakeAvailableOfflineAccesskey_Text + " id=chkOffline "
if (fAvailableOffline != 0)
strOffline += "CHECKED"
strOffline += " onclick='ToggleOffline(this)' helpid=50486 helpfile='iexplore.hlp'><LABEL FOR=chkOffline TABINDEX=-1>" + L_MakeAvailableOffline_Text + "</LABEL>";
strOffline += "<BR><BR><BUTTON id=btnProperties TABINDEX=6 style='visibility: "
if (fAvailableOffline != 0)
strOffline += "visible"
else
strOffline += "hidden"
strOffline += "' class=button ACCESSKEY=" + L_PropertiesAccesskey_Text + " onclick='Properties()' helpid=50489 helpfile='iexplore.hlp'>" + L_Properties_Text + "</BUTTON><BR>";
}
var L_TimesVisited_Text = "