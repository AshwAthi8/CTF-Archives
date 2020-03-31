 to skip it - this is the BeginURL value. We use serverIndex as the end marker.
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
    style="COLOR: black; FONT: 13pt/15pt verdana"><span id="errorText">Sidan kan inte visas</span></h1>
    </td>
  </tr>
  <tr>
    <td id="tablePropsWidth2" width="400" colspan="2"><font
    style="COLOR: black; FONT: 8pt/11pt verdana">Sidan som du söker efter kan inte visas
 eftersom adressen inte är korrekt.</font> </td>
  </tr>
  <tr>
    <td id="tablePropsWidth3" width="400" colspan="2"><font id="LID1"
    style="COLOR: black; FONT: 8pt/11pt verdana"><hr color="#C0C0C0" noshade>
    <p id="LID2">Försök med n