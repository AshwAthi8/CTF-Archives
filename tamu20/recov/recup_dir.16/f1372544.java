ymbol to find the begining 
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
    Web site by using any e-mail address or phone number that may be listed on the <span id="homepageContainer"></span>&nbsp;home
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
