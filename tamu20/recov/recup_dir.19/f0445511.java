lresult=DocURL.substring(protocolIndex - 4,serverIndex);
	BeginURL=DocURL.indexOf("#",1) + 1;
	urlresult=DocURL.substring(BeginURL,serverIndex);
	if (protocolIndex - BeginURL > 7)
		urlresult=""

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


<body bgColor="white" onload="initPage()">

<table width="400" cellpadding="3" cellspacing="5">
  <tr>
    <td id="tableProps" valign="top" align="left"><img id="pagerrorImg" SRC="pagerror.gif"
    width="25" height="33"></td>
    <td id="tableProps2" align="left" valign="middle" width="360"><h1 id="term1"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="pageNotFound">The page cannot be found</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana">The page you are looking for might have been
    removed, had its name changed, or is temporarily unavailable.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID2"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID3">Please try the following:</p><ul>
      <li ID="list1">If you typed the page address in the Address bar, make sure that it is
        spelled correctly.<br>
      </li>
      <li ID="list2">Open the <script> Homepage();</script> home page, and then look for links to the
        information you want. </li>
		 <li id="list3">Click the 
		 <a href="javascript:history.back(1)">
		 <img valign=bottom border=0 src="back.gif"> Back</a> button to try another link. </li>

      <li ID="list4">Click <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 bytes)" align="center"> Search</a> to look for information on the Internet. </li>
    </ul>
    <p><br>
    </p>
    <h2 ID="errortext" style="COLOR: black; FONT: 8pt/11pt verdana">HTTP 400 - Bad Request<br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</TBODY>
</table>
</body>
</html>
