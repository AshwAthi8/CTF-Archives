href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>

<TITLE>Help and Support Center</TITLE>

<SCRIPT>

function ESC_KeyDown()
{
	//if the user presses the ESC key, close the window.
	
	if( 27 == event.keyCode )
	{
		self.close();
	}
}

function window::onbeforeunload()
{
	window.dialogArguments.g_oLearnMoreDlg = null;
}

</SCRIPT>

</HEAD>

<BODY onkeydown="ESC_KeyDown();" scroll="no" style="padding : 10px" class="sys-font-body sys-rhp-bgcolor">

<TABLE width="100%" style="margin-bottom : 25px;">
<TR>
  <TD id=eHeader>
   <SPAN class="sys-font-heading3 sys-rhp-color-title sys-rhp-font-title">Help and Support Text Search</span>
  </TD>
  <TD id=loc1 align="right">
   <IMG id=noloc2 src="hcp://system/images/centers/Uabrand.gif">
  </TD>
</TR>
</TABLE>

<DIV id="eContainer" style="overflow-y:auto; height:300px;">
  The terms you search for exist somewhere in each document that appears in your results. These matches are often not as relevant as keyword matches.
</DIV>

<BUTTON id="ePrintBtn" style="font:messagebox;position:absolute;padding-left:10px;padding-right:10px;bottom:10px;right:20px;" onclick="window.print();">Print</BUTTON>

</BODY>

</HTML>
