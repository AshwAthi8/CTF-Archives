Index);
		
	//for display, we need to skip after http://, and go to the next slash
	displayresult=DocURL.substring(protocolIndex + 3 ,serverIndex);

	// Security precaution: must filter out "urlResult" and "displayresult"
	forbiddenChars = new RegExp("[<>\'\"]", "g");	// Global search/replace
	urlresult = urlresult.replace(forbiddenChars, "");
	displayresult = displayresult.replace(forbiddenChars, "");

	document.write('<A target=_top HREF="' + urlresult + '">' + displayresult + "</a>");
}
function doSearch()
{
    saOC.NavigateToDefaultSearch();
}

function initPage() 
{
    document.body.insertAdjacentHTML("afterBegin","<object id=saOC CLASSID='clsid:B45FF030-4447-11D2-85DE-00C04FA35C89' HEIGHT=0 width=0></object>");
}

</script>


<body bgcolor="white" onload="initPage()">

<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tableProps2" align="left" valign="middle" width="360"><h1 id="errortype"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">The page cannot be displayed</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">There is a problem with the page you are
    trying to reach and it cannot be displayed.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Please try the following:</p><ul>
      <li id="instructionsText1">Open the <script> Homepage();</script> home page, and then look for links to
        the information you want. </li>
      <li id="instructionsText2">Click the 
      <a xhref="javascript:location.reload()" target="_self">
      <img border=0 src="refresh.gif" width="13" height="16"
        alt="refresh.gif (82 bytes)" align="middle"></a> <a xhref="javascript:location.reload()" target="_self">Refresh</a> button, or try again later.<br>
      </li>
      <li ID="instructionsText3">Click <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 bytes)" align="center"> Search</a> to look for information on the Internet. </li>
      <li id="instructionsText4">You can also see <a onclick="Related();event.returnValue=false" href="">a list of related sites.</a>     
</ul>
</p>
	
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt verdana; color:black">HTTP 500 - Internal server
    error <br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>
