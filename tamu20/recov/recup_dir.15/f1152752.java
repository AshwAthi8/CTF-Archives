Stylesheet_Ref0 href="hcp://system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>

<STYLE>

.logo
{
    z-index  : -1;
	position : absolute;
	right    : -30px;
	bottom   : -30px;
	width    : 300px;
	height   : 300px;
}

.margins
{
    margin-top    : 44px;
    margin-left   : 33px;
    margin-right  : 33px;
    margin-bottom : 0px;
}

</STYLE>

<SCRIPT>

function window::onload()
{
	var g_OEM = false;
	
	try
	{
		var v;
	
		v = pchealth.RegRead( "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpSvc\\OEMInfo\\Manufacturer" );
		if(v) { idOEMManufacturer.innerText = v; g_OEM = true; }
	
		v = pchealth.RegRead( "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpSvc\\OEMInfo\\Model" );
		if(v) { idOEMModel.innerText = v; g_OEM = true; }
	
		v = pchealth.RegRead( "HKLM\\SOFTWARE\\Microsoft\\PCHealth\\HelpSvc\\OEMInfo\\Text" );
		if(v)
		{
			v = pchealth.TextHelpers.HTMLEscape( v ); v = v.replace( /#BR#/g, "<BR>" );

			idOEMText.innerHTML = v; g_OEM = true;
        }
	}
	catch(e)
	{
		g_OEM = false;
	}
	
	if(g_OEM)
	{
		var	oFS = new ActiveXObject( "Scripting.FileSystemObject" );

		idOEMLogo.src = oFS.GetSpecialFolder( 0 ) + "\\system32\\oemlogo.bmp";

	    idOEM.style.display = "";
    }
	else
    {
		locDesc.style.display = "";
	}
}

</SCRIPT>

</HEAD>

<BODY id=loc0 scroll=no CLASS="sys-rhp-splash-bgcolor sys-rhp-splash-color margins">

<helpcenter:bitmap id=idLogo class="logo" AutoRTL="true" SRCNORMAL="watermark_300x.bmp"></helpcenter:bitmap>

<DIV id=locTitle CLASS="sys-font-heading2 sys-rhp-splash-color-title">
	Welcome to Support
</DIV>

<P><BR>

<DIV id=locDesc CLASS="sys-font-heading4" style="line-height: 150%; display: none">
	If you are connected to the Internet, there are a variety of ways to get help.
	<P LOC>
	Remote Assistance enables you to authorize persons to view and work on your computer from anywhere. You can also offer Remote Assistance to clients on your network.
	<P LOC>
	Microsoft Online Assisted Support enables an online support professional to answer your questions.
	<P LOC>
	The Windows Server Community is your launch pad for communicating online with others about deploying, managing, and troubleshooting Windows-based servers.
	<P LOC>
	To get started, click a link under <B>Support</B>.
</DIV>

<DIV id=idOEM style='display: none'>

  <IMG id=idOEMLogo BORDER=0 ALIGN=right VALIGN=top HSPACE=5 VSPACE=5>

  <DIV id=locOEM1 CLASS="sys-font-heading4">
	You can get help in a variety of ways.
	If you are connected to the Internet, for example, a support professional can
	answer your questions in e-mail or an online chat session, or view your screen.
	You can even allow a technician to take control of your computer to solve a problem.
	Or by using Remote Assistance, friends or family can work on your computer over the
	Internet in a similar way.
  </DIV>

  <BR>

  <TABLE BORDER=0 CELLPADDING=0 CELLSPACING=0 WIDTH=100%>
  <TR>
    <TD VALIGN=top>
      <DIV id=idOEMManufacturer CLASS="sys-font-heading3" STYLE="border-top: 5px"></DIV>
    </TD>
    <TD VALIGN=top>
      <DIV id=idOEMModel CLASS="sys-font-heading3" STYLE="border-top: 5px"></DIV>
    </TD>
  </TR>
  <TR>
    <TD VALIGN=top COLSPAN=2><HR size=0>
    <DIV id=idOEMText CLASS="sys-font-heading4" STYLE="border-top: 5px"></DIV>
    </TD>
  </TR>
  </TABLE>

</DIV>

</BODY>

</HTML>
