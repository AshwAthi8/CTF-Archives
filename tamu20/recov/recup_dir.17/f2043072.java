
    fnSetLowColorImage();

    ObjSystemRestore.CanNavigatePage     = false ;
    window.HomePageBody.style.visibility = "visible";

    if ( ObjSystemRestore.IsUndo )
    {
        TxtHeader.innerText = L_HeaderUndo_Message;
        TxtMain1.innerText  = L_TxtMainUndo_Message;
    }
    else
    {
        TxtHeader.innerText = L_HeaderNormal_Message;
        TxtMain1.innerText  = L_TxtMainNormal_Message;
    }

    TxtRPDate.innerText = ObjSystemRestore.FormatDate( ObjSystemRestore.UsedDate, true );
    var strName = ObjSystemRestore.UsedName;
    if (strName.length > 64)
	{    
    	strName = strName.slice(0,63);
    	strName = strName.concat("...");
	}
    TxtRPName.innerText = strName;
    TxtRPName.title     = strName;    

    BtnOK.focus();

    g_bPageLoaded = true;

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
<tr height="60px"><td id="TdBranding" colspan=3  class="styHeaderBlock">
  <table class="styImage" width=100% height=100% cellspacing=0 cellpadding=0 background="SR_Grad.jpg" style="border-collapse: collapse" bordercolor="#111111"><tbody><tr>
    <td width="20px" nowrap>&nbsp;</td>
    <td id="NoLoc1" width="32px" align=center>
      <img src="failed_icon.gif" width="32" height="32">
    </td>
    <td width="13px" nowrap>&nbsp;</td>
	  <td width=80% valign=top nowrap>
      <div id="TxtHeader" class="styHeaderText" style="color:#FFFFFF">&nbsp;</div>
    </td>
    <td>
		  <table><tr>
		  <td>
			  <a id="NoLoc1" class="styLink" href="javascript:OnLink_Interrupt();">
			    <img src="help.gif" border=0 width="32" height="32">
			  </a>
		  </td>
		  <td>
			  <a id="NoLoc1" class="styLink" href="javascript:OnLink_Interrupt();">
			    <font color="#FFFFFF"> <id id=HelpId>Help</id></font>
			  </a>
		  </td>
		  </tr></table>
      <id id="NoLoc2">&nbsp;</id>
    </td>
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
  <td id="NoLoc4" class="styImage" width=8% align=left valign=bottom>
  </td>

  <td>
    <table width=100% height=100% cellspacing=0 cellpadding=0 border=0><tbody>
    <tr>

<!--

  PAGE CONTENT

-->
<td class="styContentBlock">
  <div id="TxtMain1" class="styTextRPTitle">
    &nbsp;
  </div>
  <div id="TxtRPDate" class="styTextRPInfo">
    &nbsp;
  </div>
  <div id="TxtRPName" class="styTextRPInfo">
    &nbsp;
  </div>

  <p id="TxtMain2" class="styTextBold">
    This restoration is incomplete.  It was interrupted by an improper shutdown.  You should undo this restore or choose another restore point.
  </p>

  <br>
  <div id="TxtMain3" class="styText">
    To choose another restore point, restart System Restore.
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
        <table cellspacing=0 cellpadding=0 border=0><tbody><tr>
          <td id="TxtInstruction" class="styInstruction">
            To restart System Restore, click Home.
          </td>
          <td width="10%">&nbsp;</td>
          <td class="styText" width="10%" nowrap>
            <button id="BtnHome" class="styButton" onclick="OnHome()" accesskey="H" tabindex=0>
              <U>H</U>ome
            </button>
            &nbsp;&nbsp;
            <button id="BtnOK" class="styButton" onclick="OnOK()" tabindex=0>
              OK
            </button>
          </td>
        </tr></tbody></table>
      </td>
    </tr></tbody></table>

  </td>

<!-- Right anchor -->
  <td id="NoLoc5" class="styImage" width=8% align=right valign=bottom>
  </td>
</tr>

<!--

  Bottom anchor

-->
<tr height="24px"><td colspan=3>
  <table cellspacing=0 cellpadding=0 width=100% height=100%><tbody><tr>
    <td width=90%></td><td class="styImage">
   </td>
  </tr></tbody></table>
</td></tr>

</tbody></table>
</BODY>
</HTML>