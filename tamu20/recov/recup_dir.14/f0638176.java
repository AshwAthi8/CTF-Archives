color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 404 - Pagina non trovata</title>
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
    style="COLOR: black; FONT: 13pt/15pt Verdana"><span id="errorText">Impossibile trovare la pagina</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">La pagina cercata è stata rimossa,
 il nome della pagina è stato modificato o non è disponibile al momento.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth2" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt Verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Provare a eseguire le operazioni seguenti:</p><ul>
      <li id="list1">Verificare che l'indirizzo immesso nella barra degli indirizzi sia stato digitato
        nel modo corretto.<br>
      </li>
      <li id="list2">Aprire la pagina iniziale <span id="homepageContainer"></span>, quindi cercare i collegamenti alle informazioni
        desiderate. </li>
      <li id="list3">Per cercare un altro collegamento, fare clic sul pulsante <a href="javascript:history.back(1)"><img valign=bottom border=0 src="back.gif"> Indietro</a>. </li>    
      <li ID="list4">Fare clic sul pulsante <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 byte)" align="center"> Cerca</a> per ricercare informazioni su Internet. </li>
</ul>
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt Verdana; color:black">HTTP 404 - File non trovato<br>
    Internet Explorer <BR>
    </h2>
    </font></td>

  </tr>
</table>
</body>
</html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>

<head>
<style>
a:link			{font:8pt/11pt Verdana; color:red}
a:visited		{font:8pt/11pt Verdana; color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 410 - Non più disponibile</title>
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
    style="COLOR: black; FONT: 13pt/15pt Verdana"><span id="errorText">La pagina non esiste</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">La pagina cercata è stata rimossa.</font></td>
  </tr>
  <tr>
    <td id="LID1" width="400" colspan="2"><font id="LID2"
    style="COLOR: black; FONT: 8pt/11pt Verdana"><hr color="#C0C0C0" noshade>
    <p id="LID3">Per trovare le informazioni richieste, aprire la pagina iniziale <span id="homepageContainer"></span>&nbsp;e
 seguire i collegamenti a pagine simili. </p>
    <p id="LID4">Fare clic sul pulsante <a  href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 byte)" align="center"> Cerca</a> per ricercare informazioni su Internet.</p>
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt Verdana; color:black">Errore HTTP 410 - Pagina
   non più disponibile<br>
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
a:link			{font:8pt/11pt Verdana; color:red}
a:visited		{font:8pt/11pt Verdana; color:#4e4e4e}
</style>
<meta HTTP-EQUIV="Content-Type" Content="text-html; charset=Windows-1252">
<title>HTTP 500 - Errore interno del server</title>
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
    style="COLOR: black; FONT: 13pt/15pt Verdana"><span id="errorText">Impossibile visualizzare la pagina</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">Impossibile visualizzare la pagina
desiderata. Si è verificato un problema.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt Verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Provare a eseguire le operazioni seguenti:</p><ul>
      <li id="instructionsText1">Aprire la pagina iniziale <span id="homepageContainer"></span>, quindi cercare i collegamenti
        alle informazioni desiderate. </li>
      <li id="instructionsText2">Scegliere il pulsante 
      <a xhref="javascript:location.reload()" target="_self">
      <img border=0 src="refresh.gif" width="13" height="16"
        alt="refresh.gif (82 bytes)" align="middle"></a> <a xhref="javascript:location.reload()" target="_self">Aggiorna</a> o riprovare in un secondo momento.<br>
      </li>
      <li ID="instructionsText3">Fare clic sul pulsante <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 byte)" align="center"> Cerca</a> per ricercare informazioni su Internet. </li>
      <li id="instructionsText4">