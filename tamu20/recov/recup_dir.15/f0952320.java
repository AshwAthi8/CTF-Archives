rlresult=userURL.substring(0,serverIndex);
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
    style="COLOR: black; FONT: 14pt/15pt �s