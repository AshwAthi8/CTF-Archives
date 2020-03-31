DocURL.indexOf("/", protocolIndex + 3);

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
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">The page cannot be displayed</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">The page you are trying to reach cannot be retrieved.</font> </td>
  </tr>
  <tr>
    <td id="tablePropsWidth" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Please try the following:</p><ul>
      <li id="instructionsText1">Open the <span id="homepageContainer"></span>&nbsp;home page, and then look for links to
        the information you want. </li>
      <li id="instructionsText2">Click the 
      <a xhref="javascript:location.reload()" target="_self">
      <img border=0 src="refresh.gif" width="13" height="16"
        alt="refresh.gif (82 bytes)" align="middle"></a> <a xhref="javascript:location.reload()" target="_self">Refresh</a> button, or try again later.<br>
      </li>
      <li ID="instructionsText3">Click <a  href="javascript:doSearch()"><img border=0 src="search.gif" width="16" height="16" alt="search.gif (114 bytes)" align="center"> Search</a> to look for information on the Internet. </li>
      <li id="instructionsText4">You can also see <a onclick="Related();event.returnValue=false" href="">a list of related sites.</a>     
</ul>
   
	
	 
    <p><br>
    </p>
    <h2 id="ietext" style="font:8pt/11pt verdana; color:black">Error 501/505 - Not implemented or not supported <br>
    Internet Explorer </h2>
    </font></td>
  </tr>
</table>
</body>
</html>
