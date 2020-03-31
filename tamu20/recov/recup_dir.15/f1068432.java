e.display = "inline";
        g.btnNext.style.display = "inline";
    }

    
    
    g.tabl3.style.width="105%"    

    
    
    
    if (g_AU_radiosticky == null)
        g.btnNext.disabled = true;
    else if (g_AU_radiosticky == 1)
        g.radioAgree.checked = true;
    else
        g.radioDisAgree.checked = true;

    InitNewButtons();
    g.btnNext.onclick = AUNextBtnHandler;

    if (APP_UPDATE_MODE == window.external.Directions.get_AppMode())
    {
        g.BackBtnLocalText.style.display = "none";
        g.btnBack.style.display = "none";
        g_FirstFocusElement = g.au_privacy_policy_link;
        g_FirstFocusElement.focus();
        g.AutoUpdateIntro.innerText = L_IntroUpdate_Text;
    }
    else
    {
        g_FirstFocusElement = g.btnBack;
        g_FirstFocusElement.focus();
        g.AutoUpdateIntro.innerText = L_IntroSlipstream_Text;
    }

    try
    {
        g.document.body.onkeydown = AUOnKeyDown;
    }
    catch(e)
    {
    }
}

function AUNextBtnHandler()
{
    StoreAU();
    GoNext();
}

function AUOnKeyDown()
{

    if (KeyEsc == g.event.keyCode)
    {
        g.event.returnValue = false;
        g.event.keyCode = 0;
    }

    OnKeyDown();
}

function AURadioClicked()
{
    
    if(g.btnNext.disabled && (g.radioAgree.checked || g.radioDisAgree.checked))
    {
        g.btnNext.onmouseover = HandleNextButtonMouseOver;
        g.btnNext.onmouseout  = HandleNextButtonMouseOut;
        g.btnNext.onmousedown = HandleNextButtonMouseDown;
        g.btnNext.className="newbuttonsNext";
        g.btnNext.disabled = false;
        g.btnNext.onclick = AUNextBtnHandler;
        g.btnNext.focus();
    }

    if (g.radioAgree.checked)
    {
        g_AU_radiosticky=1;
    }
    else
    {
        g_AU_radiosticky=2;
    }
}

function StoreAU()
{
    AutoUpdateObj.set_Acceptance = g.radioAgree.checked;
}



function navigatetoPrivacy(PrivPage)
{
    if(g_CurrentCKPT == CKPT_REGISTER1) {
        Reg1SaveRadioState();
    }

    if(g_CurrentCKPT == CKPT_REGISTER3) {
        Reg3SaveSettings();
    }

    if (PrivPage == "MS")
        Navigate("setup\\prvcyMS.htm");
    else if (PrivPage == "Activation_Policy")
        Navigate("setup\\act_plcy.htm");
    else if (PrivPage == "AutoUpdate_Policy")
        Navigate("setup\\au_plcy.htm");
    else
        Navigate("setup\\OEMpriv.htm");
}
PAD<HTML id=dlgOrganizeFavorites STYLE="font-family: MS Shell Dlg; font-size: 8pt; width: 41.2em; height: 31.0em">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<META HTTP-EQUIV="MSThemeCompatible" CONTENT="Yes">
<head>
<style>
.button {color: BUTTONTEXT; font-size: 8pt}
.info {font-size: 8pt; color: WINDOWTEXT}
.btext {color: BUTTONTEXT}
LI {line-height:10pt}
A {text-decoration: none; color: WINDOWTEXT}
</style>
<TITLE id=txtTitleOrgFavsDialog>
Organizar Favoritos
</TITLE>
<script>
window.onerror = HandleError;
var g_strUrl;
var g_rgUrlsToSynch = new Array(0);
var g_fSubscriptionsEnabled;
var g_dxEllipses = 0;
var g_dxEllipsesBold = 0;
var L_Ellipses_Text = "...";
function callHelp(elm)
{
if (null != elm.helpid)
{
window.showHelp(elm.helpfile, "" + parseInt(elm.helpid), "popup");
}
else
{
if ("BODY" != elm.tagName)
{
callHelp(elm.parentElement);
}
}
}
document.onhelp = new Function("callHelp(window.event.srcElement)");
function documentMouseUp()
{
if (window.event.button == 2)
{
callHelp(window.event.srcElement);
}
}
document.onmouseup = new Function("documentMouseUp()");
function HandleError(message, url, line)
{
var L_Dialog_ErrorMessage = "Error en este diálogo.";
var L_ErrorNumber_Text = "Error: ";
var str = L_Dialog_ErrorMessage + "\n\n"
+ L_ErrorNumber_Text + line + "\n"
+ message;
alert (str);
window.close();
return true;
}
function BodyOnKeyPress(nCode)
{
if (nCode == 27)
{
window.close();
return;
}
}
function MeasureText(strText, fBold, widthMaximum)
{
var oSpanToUse = (fBold ? spanMeasureBold : spanMeasure);
if (oSpanToUse.offsetWidth < widthMaximum)
return strText;
var dxEllipses = (fBold ? g_dxEllipsesBold : g_dxEllipses);
var iCutoff = strText.length * (widthMaximum / (oSpanToUse.offsetWidth + dxEllipses));
oSpanToUse.innerText = strText.substring(0, iCutoff - 1) + L_Ellipses_Text;
if (fBold)
{
iCutoff += 3;
}
for (cExtraCutoff = 1; (oSpanToUse.offsetWidth > widthMaximum) && (cExtraCutoff < 30); cExtraCutoff++)
{
oSpanToUse.innerText = spanMeasure.innerText.substring(0, iCutoff-cExtraCutoff) + L_Ellipses_Text;
}
return oSpanToUse.innerText;
}
function OnSelectionChange(cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline)
{
if (cItems == -1)
{
BodyOnKeyPress(27);
return;
}
if (cItems == 0)
{
textProperties.innerHTML = "";
return;
}
g_strUrl = strUrl;
if (g_dxEllipses == 0)
{
spanMeasure.innerText = L_Ellipses_Text;
g_dxEllipses = spanMeasure.offsetWidth;
spanMeasureBold.innerText = L_Ellipses_Text;
g_dxEllipsesBold = spanMeasureBold.offsetWidth;
}
spanMeasureBold.innerText = strName;
strNameShort = MeasureText(spanMeasureBold.innerText, true, textProperties.offsetWidth - 4);
spanMeasure.innerText = strUrl;
strUrlShort = MeasureText(spanMeasure.innerText, false, textProperties.offsetWidth - 4);
spanMeasure.innerText = "";
var L_FavoritesFolder_Text = "Carpeta Favoritos";
var L_ModifiedColon_Text = "Modificado:";
if (cVisits != -1)
{
var strOffline = "";
var L_MakeAvailableOffline_Text = "<U>D</U>isponible sin conexi