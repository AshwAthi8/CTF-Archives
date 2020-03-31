 computer automatically restarts.";
var L_TxtMainUndo_Message =
        "Undoing your last restoration may take a few moments. After the process is complete, your computer automatically restarts.";

var L_RPTitleNormal_Message =
        "Selected restore point:";
var L_RPTitleUndo_Message =
        "Undoing the following restoration:";
</script>

<SCRIPT FOR=ObjProgress EVENT=oncreate>

    //
    // Start the creation of a restore
    //
    ObjSystemRestore.Restore( ObjProgress.hWnd );

    ObjProgress.Min = 0 ;
    ObjProgress.Max = 100 ;

</SCRIPT>

<SCRIPT FOR=window EVENT=onresize>

    ObjSystemRestore.CanNavigatePage = true ;
    self.location = "SRUI-Progress.htm";

</SCRIPT>

<script for=window event=onload>

    fnSetLowColorImage();

    ObjSystemRestore.CanNavigatePage     = false ;
    window.HomePageBody.style.visibility = "visible";

    if ( ObjSystemRestore.IsUndo )
    {
        TxtHeader.innerText  = L_HeaderUndo_Message;
        TxtMain.innerText    = L_TxtMainUndo_Message;
        TxtRPTitle.innerText = L_RPTitleUndo_Message;
    }
    else
    {
        TxtHeader.innerText  = L_HeaderNormal_Message;
        TxtMain.innerText    = L_TxtMainNormal_Message;
        TxtRPTitle.innerText = L_RPTitleNormal_Message;
    }

    TxtRPDate.innerText = ObjSystemRestore.FormatDate( ObjSystemRestore.SelectedDate, true );
    TxtRPName.innerText = ObjSystemRestore.SelectedName;
    TxtRPName.title     = ObjSystemRestore.SelectedName;

</script>

</HEAD>

<!--

  Body of doc

-->
<BODY ID="HomePageBody">

<!-- 
 Background image located on the bottom right of the page
 -->
<DIV style="position: absolute; bottom: 0px; right: 0px; z-index: -1">
  <img src="watermark.jpg" border=0 width="270" height="297"></DIV>

<table width=100% height=100% cellspacing=0 cellpadding=0 border=0><tbody>

<!--

  Page header

-->
<tr height="60px"><td id="TdBranding" colspan=3 class="styHeaderBlock">
  <table class="styImage" width=100% height=100% cellspacing=0 cellpadding=0 background="SR_Grad.jpg" style="border-collapse: collapse" bordercolor="#111111"><tbody><tr>
    <td width="65px" nowrap>&nbsp;</td>
    <td valign=top nowrap>
      <div id="TxtHeader" class="styHeaderText" style="color:#FFFFFF">&nbsp;</div>
    </td>
    <td width=90%>&nbsp;</td>
  </tr></tbody></table>
</td></tr>

<tr height="3px"><td class="styHorzLine" colspan=3></td></tr>

<!--

  Top anchor

-->
<tr height="25px"><td colspan=3>
  <table width=100% height=100% cellspacing=0 cellpadding=0><tbody><tr>
    <td width=90%></td>
    <td class="styImage">
    </td>
  </tr></tbody></table>
</td></tr>

<tr>
<!-- Left anchor -->
  <td id="NoLoc1" class="styImage" width=8% align=left valign=bottom>
  </td>

  <td>
    <table width=100% height=100% cellspacing=0 cellpadding=0 border=0><tbody>
    <tr>

<!--

  PAGE CONTENT

-->
<td class="styContentBlock">
  <p id="TxtMain" class="styText">
    &nbsp;
  </p>
  <div id="TxtRPTitle" class="styTextRPTitleBold">
    &nbsp;
  </div>
  <div id="TxtRPDate" class="styTextRPInfo">
    &nbsp;
  </div>
  <div id="TxtRPName" class="styTextRPInfo">
    &nbsp;
  </div>

  <br><br>

  <object classid=clsid:bf404da2-7d3b-11d3-b9e5-00c04f79e399 width=90% height=20 dir=ltr
    id=ObjProgress VIEWASTEXT>
  </OBJECT>

  <br><br><br><br>

  <div id="TxtMain2" class="styTextBold" style="color:red">
    Do not alter, open, or delete any files or programs until the restoration is complete.
  </div>
</td>

<!-- Right padding -->
      <td class="styText" width=17%>&nbsp;</td>
    </tr>

<!--

  Navigation row

-->
    <tr height="24px">
      <td class="styText" height="12px" colspan=2 nowrap>
        &nbsp;
      </td>
    </tr></tbody></table>

  </td>

<!-- Right anchor -->
  <td id="NoLoc2" class="styImage" width=8% align=right valign=bottom>
  </td>
</tr>

<!--

  Bottom anchor

-->
<tr height="24px"><td colspan=3>
  <table width=100% height=100% cellspacing=0 cellpadding=0><tbody><tr>
    <td width=90%></td><td class="styImage">
    </td>
  </tr></tbody></table>
</td></tr>

</tbody></table>
</BODY>
</HTML>