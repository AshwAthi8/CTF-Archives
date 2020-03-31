52">
<title>HTTP 404 Non trouvé</title>
</head>
<script> 

function Homepage(){

// in real bits, urls get returned to our script like this:
// res://shdocvw.dll/http_404.htm#http://www.DocURL.com/bar.htm 

    //For testing use 
    //DocURL = "res://shdocvw.dll/http_404.htm#https://www.microsoft.com/bar.htm"
    DocURL=document.location.href;
	
    //this is where the http or https will be, as found by searching for :// but skipping the res://
    protocolIndex=DocURL.indexOf("://", 4);

    //this finds the ending slash for the domain server 
    serverIndex=DocURL.indexOf("/", protocolIndex + 3);

    //for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
    //of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.
    //urlresult=DocURL.substring(protocolIndex - 4,serverIndex);
    BeginURL=DocURL.indexOf("#",1) + 1;
    urlresult=DocURL.substring(BeginURL, serverIndex);
    if (protocolIndex - BeginURL > 7)
        urlresult=""

    //for display, we need to skip after http://, and go to the next slash
    displayresult=DocURL.substring(protocolIndex + 3, serverIndex);

    var aElement = document.createElement("A");
    aElement.innerText = displayresult;
    aElement.href = urlresult;

    homepageContainer.appendChild(aElement);
}

function doSearch()
{
    saOC.NavigateToDefaultSearch();
}

function initPage() 
{
    document.body.insertAdjacentHTML("afterBegin","<object id=saOC CLASSID='clsid:B45FF030-4447-11D2-85DE-00C04FA35C89' HEIGHT=0 width=0></object>");
    Homepage();
}

</script>


<body bgcolor="white" onload="initPage()">

<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tableProps2" align="left" valign="middle" width="360"><h1 id="errortype"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">La page est introuvable</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">Il est possible que la page recherchée ait été supprimée, que son nom ait
      changé ou qu'elle ne soit pas disponible pour le moment.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth2" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Essayez de la manière suivante :</p><ul>
      <li id="list1">Si vous avez entré l'adresse de cette page dans la barre d'adresses, vérifiez qu'elle
    est correcte.<br>
      </li>
      <li id="list2">Ouvrez la page de démarrage <span id="homepageContainer"></span> et recherchez les liens vers les informations que vous désirez. </li>
      <li id="list3">Cliquez sur le bouton <a href="javascript:history.back(1)"><img valign=bottom border=0 src="back.gif"> Précédente</a> pour essayer un autre lien. </li>    
      <li ID="list4">Cliquez sur <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 octets)" align="center"> Rechercher</a> pour trouver des informations sur Internet. </li>
</ul>
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt verdana; color:black">HTTP 404 - Fichier introuvable<br>
    Internet Explorer <BR>
    </h2>
    </font></td>

  </tr>
</table>
</body>
</html>
PA<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

<head>
<style>
a:link			{font:8pt/11pt verdana; color:red}
a:visited		{font:8pt/11pt verdana; color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 410 Supprimé</title>
</head>
<script> 
function Homepage(){

// in real bits, urls get returned to our script like this:
// res://shdocvw.dll/http_404.htm#http://www.DocURL.com/bar.htm 

    //For testing use 
    //DocURL = "res://shdocvw.dll/http_404.htm#https://www.microsoft.com/bar.htm"
    DocURL=document.location.href;
	
    //this is where the http or https will be, as found by searching for :// but skipping the res://
    protocolIndex=DocURL.indexOf("://", 4);

    //this finds the ending slash for the domain server 
    serverIndex=DocURL.indexOf("/", protocolIndex + 3);

    //for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
    //of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.
    //urlresult=DocURL.substring(protocolIndex - 4,serverIndex);
    BeginURL=DocURL.indexOf("#",1) + 1;
    urlresult=DocURL.substring(BeginURL, serverIndex);
    if (protocolIndex - BeginURL > 7)
        urlresult=""

    //for display, we need to skip after http://, and go to the next slash
    displayresult=DocURL.substring(protocolIndex + 3, serverIndex);

    var aElement = document.createElement("A");
    aElement.innerText = displayresult;
    aElement.href = urlresult;

    homepageContainer.appendChild(aElement);
}

function doSearch()
{
    saOC.NavigateToDefaultSearch();
}

function initPage() 
{
    document.body.insertAdjacentHTML("afterBegin","<object id=saOC CLASSID='clsid:B45FF030-4447-11D2-85DE-00C04FA35C89' HEIGHT=0 width=0></object>");
    Homepage();
}

</script>


<body bgcolor="white" onload="initPage()">
<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tableProps2" align="left" valign="middle" width="360"><h1 id="errortype"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText"> La page n'existe pas</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">La page que vous recherchez a été supprimée.</font></td>
  </tr>
  <tr>
    <td id="LID1" width="400" colspan="2"><font id="LID2"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID3">Vous pourrez trouver les informations dont vous avez besoin en ouvrant la page de démarrage <span id="homepageContainer"></span> et en créant un lien vers une page similaire. </p>
    <p id="LID4">Cliquez sur <a  href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 octets)" align="center">Rechercher</a> pour trouver des informations sur Internet.</p>
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt verdana; color:black">Erreur HTTP 410 - Page
    indisponible définitivement<br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>
PAD<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

<head>
<style>
a:link			{font:8pt/11pt verdana; color:red}
a:visited		{font:8pt/11pt verdana; color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 500 Erreur interne au serveur</title>
</head>
<script> 

function Related(){
	userURL=document.location.href;

	//for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
	//of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.

	BeginURL=userURL.indexOf("#",1) + 1;
	CurrentURL=userURL.substring(BeginURL,DocURL.length);
	
	//Build the query
	RelatedServiceURL="http://related.msn.com/related.asp?url=";
	
	//Perform simple check for Intranet URLs 
	//this is where the http or https will be, as found by searching for :// but skip res:
	protocolIndex=userURL.indexOf("://",4);
	serverIndex=userURL.indexOf("/",protocolIndex + 3);
	urlresult=userURL.substring(0,serverIndex);
	if (protocolIndex - BeginURL > 7)
		urlresult=""
	
	//Check if Intranet URL - then open search bar
	
	if (urlresult.indexOf(".",0) < 1) userURL="Intranet URL";
	finalURL = RelatedServiceURL + encodeURIComponent(userURL);
	window.open(finalURL, "_search");
	
}

function Homepage(){

// in real bits, urls get returned to our script like this:
// res://shdocvw.dll/http_404.htm#http://www.DocURL.com/bar.htm 

    //For testing use 
    //DocURL = "res://shdocvw.dll/http_404.htm#https://www.microsoft.com/bar.htm"
    DocURL=document.location.href;
	
    //this is where the http or https will be, as found by searching for :// but skipping the res://
    protocolIndex=DocURL.indexOf("://", 4);

    //this finds the ending slash for the domain server 
    serverIndex=DocURL.indexOf("/", protocolIndex + 3);

    //for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
    //of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.
    //urlresult=DocURL.substring(protocolIndex - 4,serverIndex);
    BeginURL=DocURL.indexOf("#",1) + 1;
    urlresult=DocURL.substring(BeginURL, serverIndex);
    if (protocolIndex - BeginURL > 7)
        urlresult=""

    //for display, we need to skip after http://, and go to the next slash
    displayresult=DocURL.substring(protocolIndex + 3, serverIndex);

    var aElement = document.createElement("A");
    aElement.innerText = displayresult;
    aElement.href = urlresult;

    homepageContainer.appendChild(aElement);
}

function doSearch()
{
    saOC.NavigateToDefaultSearch();
}

function initPage() 
{
    document.body.insertAdjacentHTML("afterBegin","<object id=saOC CLASSID='clsid:B45FF030-4447-11D2-85DE-00C04FA35C89' HEIGHT=0 width=0></object>");
    Homepage();
}

</script>


<body bgcolor="white" onload="initPage()">

<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tableProps2" align="left" valign="middle" width="360"><h1 id="errortype"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">Impossible d'afficher la page</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">Il y a un problème avec la page que vous
    essayez d'atteindre ; elle ne peut pas être affichée.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Essayez de la manière suivante :</p><ul>
      <li id="instructionsText1">Ouvrez la page de démarrage <span id="homepageContainer"></span> et recherchez les liens vers les informations que vous désirez. </li>
      <li id="instructionsText2">Cliquez sur le bouton 
      <a xhref="javascript:location.reload()" target="_self">
      <img border=0 src="refresh.gif" width="13" height="16"
        alt="refresh.gif (82 octets)" align="middle"></a> <a xhref="javascript:location.reload()" target="_self">Actualiser</a> ou réessayez ultérieurement.<br>
      </li>
      <li ID="instructionsText3">Cliquez sur <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 octets)" align="center"> Rechercher</a> pour trouver des informations sur Internet. </li>
      <li id="instructionsText4">Vous pouvez également consulter <a onclick="Related();event.returnValue=false" href="">une liste de sites apparentés.</a>     
</ul>
</p>
	
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt verdana; color:black">HTTP 500 - Erreur interne
 du serveur <br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>
PAD<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

<head>
<style>
a:link			{font:8pt/11pt verdana; color:red}
a:visited		{font:8pt/11pt verdana; color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 501 Non opérationnel</title>
</head>
<script> 


function Related(){
	userURL=document.location.href;

	//for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
	//of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.

	BeginURL=userURL.indexOf("#",1) + 1;
	CurrentURL=userURL.substring(BeginURL,DocURL.length);
	
	//Build the query
	RelatedServiceURL="http://related.msn.com/related.asp?url=";
	
	//Perform simple check for Intranet URLs 
	//this is where the http or https will be, as found by searching for :// but skip res:
	protocolIndex=userURL.indexOf("://",4);
	serverIndex=userURL.indexOf("/",protocolIndex + 3);
	urlresult=userURL.substring(0,serverIndex);
	if (protocolIndex - BeginURL > 7)
		urlresult=""
	
	//Check if Intranet URL - then open search bar
	
	if (urlresult.indexOf(".",0) < 1) userURL="Intranet URL";
	finalURL = RelatedServiceURL + encodeURIComponent(userURL);
	window.open(finalURL, "_search");
	
}

function Homepage(){

// in real bits, urls get returned to our script like this:
// res://shdocvw.dll/http_404.htm#http://www.DocURL.com/bar.htm 

    //For testing use 
    //DocURL = "res://shdocvw.dll/http_404.htm#https://www.microsoft.com/bar.htm"
    DocURL=document.location.href;
	
    //this is where the http or https will be, as found by searching for :// but skipping the res://
    protocolIndex=DocURL.indexOf("://", 4);

    //this finds the ending slash for the domain server 
    serverIndex=DocURL.indexOf("/", protocolIndex + 3);

    //for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
    //of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.
    //urlresult=DocURL.substring(protocolIndex - 4,serverIndex);
    BeginURL=DocURL.indexOf("#",1) + 1;
    urlresult=DocURL.substring(BeginURL, serverIndex);
    if (protocolIndex - BeginURL > 7)
        urlresult=""

    //for display, we need to skip after http://, and go to the next slash
    displayresult=DocURL.substring(protocolIndex + 3, serverIndex);

    var aElement = document.createElement("A");
    aElement.innerText = displayresult;
    aElement.href = urlresult;

    homepageContainer.appendChild(aElement);
}

function doSearch()
{
    saOC.NavigateToDefaultSearch();
}

function initPage() 
{
    document.body.insertAdjacentHTML("afterBegin","<object id=saOC CLASSID='clsid:B45FF030-4447-11D2-85DE-00C04FA35C89' HEIGHT=0 width=0></object>");
    Homepage();
}

</script>


<body bgcolor="white" onload="initPage()">
<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tablePropsWidth" align="left" valign="middle" width="360"><h1 id="errortype"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">Impossible d'afficher la page</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">La page que vous essayez d'atteindre ne peut pas être lue.</font> </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Essayez de la manière suivante :</p><ul>
      <li id="instructionsText1">Ouvrez la page de démarrage <span id="homepageContainer"></span> et recherchez les liens vers les informations que vous désirez. </li>
      <li id="instructionsText2">Cliquez sur le bouton 
      <a xhref="javascript:location.reload()" target="_self">
      <img border=0 src="refresh.gif" width="13" height="16"
        alt="refresh.gif (82 octets)" align="middle"></a> <a xhref="javascript:location.reload()" target="_self">Actualiser</a> ou réessayez ultérieurement.<br>
      </li>
      <li ID="instructionsText3">Cliquez sur <a  href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 octets)" align="center">Rechercher</a> pour trouver des informations sur Internet. </li>
      <li id="instructionsText4">Vous pouvez également consulter <a onclick="Related();event.returnValue=false" href="">une liste de sites apparentés.</a>     
</ul>
   
	
	 
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt verdana; color:black">Erreur 501/505 - Non implémenté ou non pris en charge <br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>
PA<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

<head>
<style>
a:link			{font:8pt/11pt verdana; color:red}
a:visited		{font:8pt/11pt verdana; color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 405 - Ressource non permise</title>
</head>
<script> 

function Homepage(){

// in real bits, urls get returned to our script like this:
// res://shdocvw.dll/http_404.htm#http://www.DocURL.com/bar.htm 

    //For testing use 
    //DocURL = "res://shdocvw.dll/http_404.htm#https://www.microsoft.com/bar.htm"
    DocURL=document.location.href;
	
    //this is where the http or https will be, as found by searching for :// but skipping the res://
    protocolIndex=DocURL.indexOf("://", 4);

    //this finds the ending slash for the domain server 
    serverIndex=DocURL.indexOf("/", protocolIndex + 3);

    //for the href, we need a valid URL to the domain. We search for the # symbol to find the begining 
    //of the true URL, and add 1 to skip it - this is the BeginURL value. We use serverIndex as the end marker.
    //urlresult=DocURL.substring(protocolIndex - 4,serverIndex);
    BeginURL=DocURL.indexOf("#",1) + 1;
    urlresult=DocURL.substring(BeginURL, serverIndex);
    if (protocolIndex - BeginURL > 7)
        urlresult=""

    //for display, we need to skip after http://, and go to the next slash
    displayresult=DocURL.substring(protocolIndex + 3, serverIndex);

    var aElement = document.createElement("A");
    aElement.innerText = displayresult;
    aElement.href = urlresult;

    homepageContainer.appendChild(aElement);
}

function doSearch()
{
    saOC.NavigateToDefaultSearch();
}

function initPage() 
{
    document.body.insertAdjacentHTML("afterBegin","<object id=saOC CLASSID='clsid:B45FF030-4447-11D2-85DE-00C04FA35C89' HEIGHT=0 width=0></object>");
    Homepage();
}

</script>


<body bgcolor="white" onload="initPage()">
<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tablePropsWidth" align="left" valign="middle" width="360"><h1 id="errortype"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">Impossible d'afficher la page</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth2" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">La page que vous recherchez ne peut pas être
    affichée car l'adresse est incorrecte.</font> </td>
  </tr>
  <tr>
    <td id="tablePropsWidth3" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Essayez de la manière suivante :</p><ul>
      <li id="instructionsText1">Si vous avez entré l'adresse de cette page dans la barre d'adresses, vérifiez
        qu'elle est correcte.<br>
      </li>
       <li id="instructionsText2">Ouvrez la page de démarrage <span id="homepageContainer"></span> et recherchez les liens vers les informations que vous désirez. </li>
        <li ID="instructionsText3">Cliquez sur <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 octets)" align="center"> Rechercher</a> pour trouver des informations sur Internet. </li>
    </ul>
       
	
    <p><br>
    </p>
    <h2 ID="errortext2" style="COLOR: black; FONT: 8pt/11pt verdana">HTTP 405 - Ressource non
    autorisée<br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>







var ERR_ACT_UNINITIALIZED         = -1;
var ERR_ACT_SUCCESS               = 0;
var ERR_ACT_INACCESSIBLE          = 1;
var ERR_ACT_INVALID_PID           = 2;
var ERR_ACT_USED_PID              = 3;
var ERR_ACT_INTERNAL_WINDOWS_ERR  = 4;
var ERR_ACT_BLOCKED_PID           = 5;
var ERR_ACT_CORRUPTED_PID         = 6;
var ERR_ACT_NETWORK_FAILURE       = 7;
var ERR_ACT_DEDICATED_PID_ENTRY   = 8;


var COMPAREMODE_BINARY  = 0;
var COMPAREMODE_TEXT    = 1;


var g_ProductName = "Windows XP";
var g_ActivationRequired = window.external.NeedActivation();
var g_DoActivation = false;
var g_ActivationStatus = ERR_ACT_UNINITIALIZED;
var g_act_specific_error = 0;
var g_OOBEMUIDir = window.external.GetOOBEMUIPath();


var L_MissingOEMName_Text = "Erreur : nom OEM manquant dans la section [Branding] du fichier oobeinfo.ini.";


var DebugObj = null;

var APP_UPDATE_MODE = 6;


var KeyEsc = 0x1B;
var KeyEnter = 0xD;
var KeyBackSpc = 0x8;
var KeyDelete = 0x2E;
var KeyTab = 0x9;
var KeyDwnArrow = 0x28;
var KeyUpArrow = 0x26;
var KeyLeftArrow = 0x25;
var KeyRightArrow = 0x27;


if (null == DebugObj){
    DebugObj = new Object;
    DebugObj = window.external.Debug;
}









function trace(sMsg)
{
    DebugObj.Trace(sMsg);
}


function Navigate(strURL)
{
    
    try
    {
       g.document.body.style.cursor = "default";
    }
    catch(e){}

    strURL = g_OOBEMUIDir + "\\" + strURL;

    trace("Navigate: " + strURL);
    g.navigate(strURL);
}   


var g_CheckFinishAgain = true;
function CheckFinishStatus()
{
    if (g_CheckFinishAgain)
    {
        if (g_DoActivation)
            g_IsActivationSuccessful = true;
        else
            g_IsActivationSuccessful = false;
        if (g_PostToMS)
            g_IsMSRegistrationSuccessful = true;
        else
            g_IsMSRegistrationSuccessful = false;

        if (g_PostToOEM)
            g_IsOEMRegistrationSuccessful = true;
        else
            g_IsOEMRegistrationSuccessful = false;
    }
}

<!--REQUIRED FUNCTION NAME-->
function ActivationComplete(status, status_errcode)
{
g_CheckFinishAgain = true;
    if ( status != null) {

        g_ActivationStatus = status;

        if ( g_ActivationStatus != ERR_ACT_SUCCESS ) {

            trace("Activation failed.  Error = " + g_ActivationStatus);

            
            g_IsActivationSuccessful      = false;
            g_IsMSRegistrationSuccessful  = false;
            g_IsOEMRegistrationSuccessful = false;

            g_act_specific_error = status_errcode;
            GoNavigate(CKPT_ACT_MSG);
            return;
        }
        else
        {
            CheckFinishStatus();
            
            g_CheckFinishAgain = false;
        }

        g_ActivationRequired = false;
        g_DoActivation = false;
        StatusObj.set_Status(MS_REGISTRATION, true);
    }

    if (g_PostToOEM)
    {
        if (0 == RegisterObj.get_OEMAddRegPage)
        {
            window.external.PostRegData(POST_TO_OEM);
            StatusObj.set_Status(OEM_REGISTRATION, true);
            g_IgnoreDialErr = true;
            PopCKPT(CKPT_REGDIAL);
            PopCKPT(CKPT_REGISTER3);
            PopCKPT();    
            CheckFinishStatus();
            if (InReminderMode())
                GoNavigate(CKPT_ACT_MSG);      
            else
                GoNavigate(CKPT_ICONN);        
        }
        else
        {
            
            
            
            
            g_IgnoreDialErr = true;

            if ( APP_REG_MODE == window.external.Directions.get_AppMode() )
            {
                Navigate("html\\oemreg\\roemadd.htm");
            }
            else
            {
                Navigate("html\\oemreg\\oemadd.htm");
            }
        }
    }
    else
    {
        g_IgnoreDialErr = true;

        PopCKPT(CKPT_REGDIAL);
        PopCKPT(CKPT_REGISTER3);
        PopCKPT();    
        CheckFinishStatus();
        if (InReminderMode())
            GoNavigate(CKPT_ACT_MSG);    
        else
            GoNavigate(CKPT_ICONN);      
    }

    if ((g_PostToMS && g_PostToOEM && (1 == RegisterObj.get_PostToOEM)) ||
        ((0 == RegisterObj.get_PostToOEM) && g_PostToMS))
    {
        if ( APP_REG_MODE == window.external.Directions.get_AppMode() )
        {
            
            
            
            window.external.StopRemind(REMIND_REG);
        }
        else
        {
            
            
            
            window.external.DeleteRemind(REMIND_REG);
        }
    }
}






var SORT_DEFAULT                = 0x0;     

var LANG_JAPANESE               = 0x11;
var LANG_KOREAN                 = 0x12;
var LANG_CHINESE                = 0x04;

var SUBLANG_KOREAN              = 0x01;    
var SUBLANG_CHINESE_TRADITIONAL = 0x01;    
var SUBLANG_CHINESE_SIMPLIFIED  = 0x02;    
var SUBLANG_DEFAULT             = 0x01;    









function MAKELANGID(p, s)
{
    return (( s << 10) | p);
}

function MAKELCID(lgid, srtid)
{
    return ((srtid << 16) | lgid);
}

function IsKoreanLocale() {
   var language = ApiObj.get_UserDefaultUILanguage();
   if (language == MAKELCID(MAKELANGID(LANG_KOREAN, SUBLANG_KOREAN), SORT_DEFAULT)) {
      return true;
   }

   return false;
}

function IsFarEastLocale()
{
    
    
    var language = ApiObj.get_UserDefaultUILanguage();

    if (language == MAKELCID(MAKELANGID(LANG_KOREAN, SUBLANG_KOREAN), SORT_DEFAULT) ||
        language == MAKELCID(MAKELANGID(LANG_CHINESE, SUBLANG_CHINESE_TRADITIONAL), SORT_DEFAULT) ||
        language == MAKELCID(MAKELANGID(LANG_CHINESE, SUBLANG_CHINESE_SIMPLIFIED), SORT_DEFAULT) ||
        language == MAKELCID(MAKELANGID(LANG_JAPANESE, SUBLANG_DEFAULT), SORT_DEFAULT))
        return true
    else
        return false;
}

function StorePid()
{
    var strPid = "";

    for (var i = 0; i < 4; i++)
    {
        strPid += g.edtProductKey[i].value;
        strPid += '-';
    }

    strPid += g.edtProductKey[i].value;

    PidObj.set_PID(strPid);
}





var g_AU_radiosticky = null;  
var L_IntroSlipstream_Text = "Les mises à jour automatiques permettent à Windows de vérifier régulièrement la présence des dernières mises à jour importantes pour votre ordinateur, et de les installer automatiquement. Ces mises à jour peuvent inclure des mises à jour de sécurité, des mises à jour critiques et des Service Packs.";
var L_IntroUpdate_Text = "Merci d'avoir installé Windows XP Service Pack 2. Avant de finaliser le processus d'installation, inscrivez-vous au service de mises à jour automatiques. Les mises à jour automatiques permettent à Windows de vérifier régulièrement la présence des dernières mises à jour importantes pour votre ordinateur, et de les installer automatiquement. Ces mises à jour peuvent inclure des mises à jour de sécurité, des mises à jour critiques et des Service Packs.";

function AutoUpdateLoadMe()
{
    InitFrameRef();

    
    if (window.external.GetNoWelcomeFinish())
    {
        g.btnNext = g.btnFinish;
        g.FiniBtnLocalText.style.display = "inline";
        g.btnFinish.style.display = "inline";
    }
    else
    {
        g.NextBtnLocalText.style.display = "inline";
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
P<HTML id=dlgOrganizeFavorites STYLE="font-family: MS Shell Dlg; font-size: 8pt; width: 41.2em; height: 31.0em">
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
Organiser vos favoris
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
var L_Dialog_ErrorMessage = "Une erreur est survenue dans cette boîte de dialogue.";
var L_ErrorNumber_Text = "Erreur : ";
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
var L_FavoritesFolder_Text = "Dossier Favoris";
var L_ModifiedColon_Text = "Modifié le :";
if (cVisits != -1)
{
var strOffline = "";
var L_MakeAvailableOffline_Text = "Rendre disponible <U>h</U>ors connexion";
var L_MakeAvailableOfflineAccesskey_Text = "h";
var L_Properties_Text = "<U>P</U>ropriétés";
var L_PropertiesAccesskey_Text = "P";
if (g_fSubscriptionsEnabled && (strUrl.substring(0,4) == "http") )
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
var L_TimesVisited_Text = "Nombre de visites : ";
var L_LastVisited_Text = "Dernière visite le : ";
var L_LastVisitedNeedsLineBreak_Text = "";
var strTemp = strName + "\n" + strUrl;
var re = /'/g;
strTemp = strTemp.replace(re, "´");
var oA = document.createElement("A");
var oName = document.createElement("B");
var oBR1 = document.createElement("BR");
var oUrl = document.createElement("SPAN");
var oBR2 = document.createElement("BR");
var oTV = document.createElement("SPAN");
var oLV = document.createElement("SPAN");
var oBR3 = document.createElement("BR");
var oBR4 = document.createElement("BR");
if (oA && oName && oUrl && oBR1 && oBR2 && oBR3 && oBR4 && oTV && oLV)
{
textProperties.innerHTML = "";
oA.Title = strTemp;
oName.innerText = strNameShort;
oA.appendChild(oName);
oA.appendChild(oBR1);
oUrl.innerText = strUrlShort;
oA.appendChild(oUrl);
textProperties.appendChild(oA);
textProperties.appendChild(oBR2);
oTV.innerText = L_TimesVisited_Text + cVisits;
textProperties.appendChild(oTV);
textProperties.appendChild(oBR3);
if (L_LastVisitedNeedsLineBreak_Text == "")
{
oLV.innerText = L_LastVisited_Text + strDate;
textProperties.appendChild(oLV);
textProperties.appendChild(oBR4);
}
else
{
var oBR5 = document.createElement("BR");
var oLV2 = document.createElement("SPAN");
if (oBR5 && oLV2)
{
oLV.innerText = L_LastVisited_Text;
oLV2.innerText = strDate;
textProperties.appendChild(oLV);
textProperties.appendChild(oBR5);
textProperties.appendChild(oLV2);
textProperties.appendChild(oBR4);
}
}
textProperties.innerHTML += strOffline;
}
}
else
{
var oName = document.createElement("B");
var oBR1 = document.createElement("BR");
var oFldr = document.createElement("SPAN");
var oBR2 = document.createElement("BR");
var oBR3 = document.createElement("BR");
var oMod = document.createElement("B");
var oBR4 = document.createElement("BR");
var oDate = document.createElement("SPAN");
if (oName && oBR1 && oFldr && oBR2 && oBR3 && oMod && oBR4 && oDate)
{
textProperties.innerHTML = "";
oName.innerText = strNameShort;
textProperties.appendChild(oName);
textProperties.appendChild(oBR1);
oFldr.innerText = L_FavoritesFolder_Text;
textProperties.appendChild(oFldr);
textProperties.appendChild(oBR2);
textProperties.appendChild(oBR3);
oMod.innerText = L_ModifiedColon_Text;
textProperties.appendChild(oMod);
textProperties.appendChild(oBR4);
oDate.innerText = strDate;
textProperties.appendChild(oDate);
}
}
tdProperties.noWrap=true;
textProperties.noWrap=true;
}
function EnableButtons()
{
g_fSubscriptionsEnabled = nsc.SubscriptionsEnabled;
var pszInitialDir = window.dialogArguments;
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
Pour créer un nouveau dossier, cliquez sur le bouton Créer un dossier. Pour renommer ou supprimer un élément, sélectionnez-le puis cliquez sur Renommer ou Supprimer.
</TD>
<TD id=tdColSpacing width=0>
</TD>
<TD id=tdNscHolder rowspan=3 height=100%>
<TABLE cols=1 width=100% height=100%>
<TD id=tdNsc style="height:100%; border:2px inset WINDOW;">
<object id=nsc TABINDEX=10 title="Liste des Favoris" accesskey="t"
style="background:window; HEIGHT=100%; WIDTH=100%"
CLASSID='clsid:55136805-B2DE-11D1-B9F2-00A0C98BC547'
onkeypress="BodyOnKeyPress(event.keyCode)"
helpid=50490
helpfile="iexplore.hlp">
</OBJECT>
</TD>
</TABLE>
</TD>
</TR>
<TR id=rowButtons>
<TD>
<table id=tableButtons cols=2 width=200>
<tr height=20>
<TD align=center width=50%>
<BUTTON id=tdNewFolder TABINDEX=1 style="width: 9em;" ACCESSKEY=C class=button onclick="nsc.NewFolder(); event.returnValue = false" helpid=50484 helpfile="iexplore.hlp">
<U>C</U>réer un dossier
</BUTTON>
</TD>
<TD align=center width=50%>
<BUTTON id=tdRename TABINDEX=2 style="width: 9em;" ACCESSKEY=R class=button onclick="nsc.InvokeContextMenuCommand('rename'); event.returnValue = false" helpid=50007 helpfile="iexplore.hlp">
<U>R</U>enommer
</BUTTON>
</TD>
</tr>
<tr height=20>
<td width=50% align=center>
<BUTTON id=tdMoveTo TABINDEX=3 style="width: 9em;" ACCESSKEY=D class=button onclick="nsc.MoveSelectionTo(); event.returnValue = false" helpid=50006 helpfile="iexplore.hlp">
<U>D</U>éplacer vers...
</BUTTON>
</td>
<td width=50% align=center>
<BUTTON id=tdDelete TABINDEX=4 style="width: 9em;" ACCESSKEY=S class=button onclick="nsc.InvokeContextMenuCommand('delete'); event.returnValue = false" helpid=50008 helpfile="iexplore.hlp">
<U>S</U>upprimer
</BUTTON>
</td>
</tr>
</table>
</TD>
</TR>
<TR id=rowProperties vAlign=top style="padding-left:1px; padding-right:0px">
<TD id=tdProperties style="border-width:2px; margin-left:5px; margin-top:5px; margin-right:5px;" vAlign=top>
<DIV id=textProperties class=info style="border-width:2px; border-style:groove; border-color:window; width:100%; height:expression(Math.max(0, tdProperties.offsetHeight - (2 * parseInt(tdProperties.style.borderWidth)))); overflow:hidden; nowrap:true; position:absolute;">
Sélectionnez un Favori pour afficher ses propriétés ou le rendre disponible hors connexion.
</DIV>
</TD>
</TR>
<TR id=rowCloseButton>
<TD id= cellCloseButton colspan=3 align=right>
<BUTTON id=tdDone TABINDEX=11 style="width: 9em;" ACCESSKEY=F class=button onclick="window.close();" helpid=50010 helpfile="iexplore.hlp">
<U>F</U>ermer
</BUTTON>
</TD>
</TR>
</table>
<SPAN id=spanMeasure style="visibility:hidden;" class=info></SPAN>
<SPAN id=spanMeasureBold style="visibility:hidden;font-weight:bold;" class=info></SPAN>
<script defer for=nsc event="FavoritesSelectionChange(cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline)">
OnSelectionChange(cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline);
</script>
<script defer>
tdNscHolder.style.setExpression("width", "TdNscWidth()");
rowProperties.style.setExpression("height", "TdPropertiesHeight()");
</script>
</BODY>
</HTML>
PAD<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

 <head>
  <meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
  <title>Une erreur s'est produite lors du traitement de la stratégie.</title>

  <script language="JavaScript">
   var site = window.parent.dialogArguments.url;

   function printSite()
   {
       siteContainer.innerText = site;
   }

   function BodyOnKeyPress(nCode)
   { 
       if (nCode == 27)    //ESC
       {
           //this return value means that the Cancel button was clicked
           window.returnValue = 0;

           //close the dialog
           window.close();
       }
   }
  </script>
 </head>

 <body id="body" 
       style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;" 
       onkeypress="BodyOnKeyPress(event.keyCode)"
       onload="printSite();">
  <p id="viewPolicyError" style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;">
   Impossible d'afficher la stratégie privée de <span id="siteContainer"></span>. Pour afficher la stratégie privée, contactez le site Web directement.
  </p>
 </body>

</html>
PA<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

 <head>
  <meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
  <title>Recherche d'une stratégie de confidentialité.</title>

  <script language="JavaScript">
   var site = window.parent.dialogArguments.url;

   function printSite()
   {
       siteContainer.innerText = site;
   }

   function BodyOnKeyPress(nCode)
   { 
       if (nCode == 27)    //ESC
       {
           //this return value means that the Cancel button was clicked
           window.returnValue = 0;

           //close the dialog
           window.close();
       }
   }
  </script>
 </head>

 <body id="body" 
       style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;" 
       onkeypress="BodyOnKeyPress(event.keyCode)"
       onload="printSite();">
  <p id="policyLooking" style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;">
   Recherche de la stratégie privée de <span id="siteContainer"></span>.
  </p>
 </body>

</html>
PAD<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

 <head>
  <meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
  <title>Aucune stratégie de confidentialité n'a été trouvée.</title>

  <script language="JavaScript">
   var site = window.parent.dialogArguments.url;

   function printSite()
   {
       siteContainer.innerText = site;
   }

   function BodyOnKeyPress(nCode)
   { 
       if (nCode == 27)    //ESC
       {
           //this return value means that the Cancel button was clicked
           window.returnValue = 0;

           //close the dialog
           window.close();
       }
   }
  </script>
 </head>

 <body id="body" 
       style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;" 
       onkeypress="BodyOnKeyPress(event.keyCode)"
       onload="printSite()">
  <p id="noPolicyFound" style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;">
   Impossible de trouver la stratégie privée de <span id="siteContainer"></span>. Pour afficher la stratégie privée de ce site, contactez le site Web directement.
  </p>
 </body>

</html>
PAD<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

 <head>
  <meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
  <title>Une erreur de syntaxe a été détectée dans la stratégie.</title>

  <script language="JavaScript">
   var site = window.parent.dialogArguments.url;

   function printSite()
   {
       siteContainer.innerText = site;
   }

   function BodyOnKeyPress(nCode)
   { 
       if (nCode == 27)    //ESC
       {
           //this return value means that the Cancel button was clicked
           window.returnValue = 0;

           //close the dialog
           window.close();
       }
   }
  </script>
 </head>

 <body id="body" 
       style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;" 
       onkeypress="BodyOnKeyPress(event.keyCode)"
       onload="printSite();">
  <p id="viewPolicySyntaxError" style="font-family: MS Shell Dlg;font-size:8pt;color:windowtext;background-color:threedface;">
   Impossible d'afficher la stratégie privée de <span id="siteContainer"></span>&nbsp;en raison d'une erreur de syntaxe dans sa stratégie. Pour afficher la stratégie privée, contactez le site Web directement. 
  </p>
 </body>

</html>
<HTML DIR=LTR id=dlgPrivacyPolicy>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<META HTTP-EQUIV="MSThemeCompatible" CONTENT="Yes">
<HEAD>
<TITLE id=dialogTitle>
Stratégie de confidentialité
</TITLE>
<STYLE>
HTML { font-family: MS Shell Dlg; font-size: 8pt; width: 52.65em; height: 42.3em; }
BODY { font-family: MS Shell Dlg; font-size: 8pt; }
FIELDSET { font-family: MS Shell Dlg; font-size: 8pt; }
TABLE { font-family: MS Shell Dlg; font-size: 8pt; }
INPUT { font-family: MS Shell Dlg; font-size: 8pt; }
LABEL { font-family: MS Shell Dlg; font-size: 8pt; }
BUTTON { font-family: MS Shell Dlg; font-size: 8pt; width: 7 em; height: 2.2em; }
</STYLE>
<SCRIPT language="JavaScript">
var siteData = window.dialogArguments;
window.returnValue = 0;
function okButtonClick()
{
if( radDefault.checked == true)
{
window.returnValue = 1;
}
else if (radAccept.checked == true)
{
window.returnValue = 2;
}
else if (radReject.checked == true)
{
window.returnValue = 3;
}
window.close();
}
function cancelButtonClick()
{
window.returnValue = 0;
window.close();
}
function getMinCookieDomainQuoted()
{
minCookieDomain.innerText = '"'+siteData.cookieUrl+'"';
}
function checkCurrentPreference()
{
if( siteData.acceptRejectOrDefault == "a")
radAccept.checked = true;
else if( siteData.acceptRejectOrDefault == "r")
radReject.checked = true;
else if( siteData.acceptRejectOrDefault == "d")
radDefault.checked = true;
if( siteData.fixedAcceptRejectOrDefault)
{
radAccept.disabled = true;
radReject.disabled = true;
radDefault.disabled = true;
}
}
function CheckIfPolicyFound()
{
var policyDone = siteData.flagPolicyHuntDone;
document.body.all("fldPolicy").children("policyframe").src = siteData.urlPolicyHuntView;
if( policyDone == false)
setTimeout( CheckIfPolicyFound, 200);
}
function BodyOnKeyPress(nCode)
{
if (nCode == 27)
{
cancelButtonClick();
}
else if (nCode == 13)
{
okButtonClick();
}
}
</SCRIPT>
</HEAD>
<BODY ID=bdy style="color: windowtext; background: threedface; " scroll=no
onkeypress="BodyOnKeyPress(event.keyCode)" onload="getMinCookieDomainQuoted();">
<TABLE style="width:100%;height:100%">
<TR>
<TD>
<FIELDSET align=absMiddle id=fldPolicy style="border: 0;height:100%">
<IFRAME NAME="policyframe" id=policyframe application="no"
style="width:100%; height:100%; background: threedface; ">
</IFRAME>
</FIELDSET>
</TD>
</TR>
<TR>
<TD style="height:1%">
<TABLE style="width:100%">
<TR>
<TD>
<FIELDSET align=absMiddle id=fldPreference style="padding:1mm">
<DIV id=lblQuery style="height: 1.5 em;">
<p ID="query">
Comment gérer les cookies de <span id="minCookieDomain"></span>&nbsp;?
</p>
</DIV>
<TABLE CELLPADDING=0 CELLSPACING=0>
<TR>
<TD>
&nbsp;&nbsp;&nbsp;<INPUT id=radDefault type=radio name=radPreference ACCESSKEY=p
tabIndex=3 style="width: 1.2em; ">
</TD>
<TD>
<LABEL ID=lblDefault FOR=radDefault>
&nbsp;&nbsp;Com<u>p</u>arer la stratégie de confidentialité des cookies à mes paramètres.
</LABEL>
</TD>
</TR>
<TR>
<TD>
&nbsp;&nbsp;&nbsp;<INPUT id=radAccept type=radio name=radPreference ACCESSKEY=T
tabIndex=4 style="width: 1.2em;">
</TD>
<TD>
<LABEL ID=lblAccept FOR=radAccept>
&nbsp;&nbsp;<u>T</u>oujours autoriser ce site à utiliser les cookies.
</LABEL>
</TD>
</TR>
<TR>
<TD>
&nbsp;&nbsp;&nbsp;<INPUT id=radReject type=radio name=radPreference ACCESSKEY=N
tabIndex=5 style="width: 1.2em;">
</TD>
<TD>
<LABEL ID=lblReject FOR=radReject>
&nbsp;&nbsp;<u>N</u>e jamais autoriser ce site à utiliser les cookies.
</LABEL>
<TD>
</TR>
</TABLE>
</FIELDSET>
</TD>
<TD valign=top width="1%">
<TABLE>
<TR>
<TD>
<BUTTON id=btnOk onClick="okButtonClick()" tabIndex=1 ACCESSKEY=O type=submit>
OK
</BUTTON>
</TD>
</TR>
<TR>
<TD>
<BUTTON id=btnCancel onClick="cancelButtonClick()" tabIndex=2 ACCESSKEY=A type=submit>
Annuler
</BUTTON>
</TD>
</TR>
</TABLE>
</TD>
</TR>
</TABLE>
</TD>
</TR>
</TABLE>
<SCRIPT language="JavaScript">
checkCurrentPreference();
CheckIfPolicyFound();
</SCRIPT>
</BODY>
</HTML>
PAD