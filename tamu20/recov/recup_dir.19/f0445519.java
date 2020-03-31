 need to skip after http://, and go to the next slash
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
    <td id="tableProps2" align="left" valign="middle" width="360"><h1 id="term1"
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">You are not authorized to view this page</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana">You might not have permission to view this
    directory or page using the credentials you supplied.</font></td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID2"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p ID="term3"> If you believe you should be able to view this directory or page, please try to contact the
    Web site by using any e-mail address or phone number that may be listed on the <script> Homepage();</script> home
    page.</p>
    <p id="term4">You can click <a href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 bytes)" align="center"> Search</a> to look for information on the Internet.</p>
    <p><br>
    </p>
    <h2 id="errortextcode" style="font:8pt/11pt verdana; color:black">HTTP Error 403 -
    Forbidden <br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>
