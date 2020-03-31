//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref2 href="hcp://system/css/Layout.css"    rel=STYLESHEET type=text/css>

</HEAD>

<BODY id=noloc0 tabindex=-1 SCROLL=NO class="sys-lhp-bgcolor-scope" style='padding: 11px'>

<TABLE border=0 cellPadding=0 cellSpacing=0 WIDTH=100% HEIGHT=100% style="table-layout: fixed">
<TR WIDTH=100%>
<TD>
  <DIV id=noloc1 style='width: 100%; text-overflow: ellipsis; overflow: hidden; border : 1pt solid'
       class='sys-font-body sys-toppane-color-border sys-toppane-header-color sys-toppane-header-bgcolor'>
  	<DIV ID=tree_Title style='padding: 0.5em 11px'>
  	  <A class='sys-link-header sys-font-body-bold' tabIndex=1 href="hcp://system/blurbs/Index.htm" target="HelpCtrContents">Index</A>
  	</DIV>
  </DIV>
</TD>
</TR>
<TR>
  <TD HEIGHT=100%>
    <DIV id="idDisplay"
         class='sys-font-body sys-toppane-color-border sys-toppane-bgcolor'
         style='width: 100%; height: 100%; border-left : 1pt solid; border-bottom : 1pt solid; border-right : 1pt solid; padding: 11px'>
    </DIV>
  </TD>
</TR>
</TABLE>

</BODY>

<SCRIPT>

//
// localizable variables/filenames
//

// Here are the possible values for CharSet (KB article Q165478):
// http://support.microsoft.com/support/kb/articles/Q165/4/78.ASP
// 
// DEFAULT_CHARSET           1 (x01)
// SYMBOL_CHARSET            2 (x02)
// OEM_CHARSET             255 (xFF)
// ANSI_CHARSET              0 (x00)            1252
// RUSSIAN_CHARSET         204 (xCC)            1251
// EE_CHARSET              238 (xEE)            1250
// GREEK_CHARSET           161 (xA1)            1253
// TURKISH_CHARSET         162 (xA2)            1254
// BALTIC_CHARSET          186 (xBA)            1257
// HEBREW_CHARSET          177 (xB1)            1255
// ARABIC _CHARSET         178 (xB2)            1256
// SHIFTJIS_CHARSET        128 (x80)             932
// HANGEUL_CHARSET         129 (x81)             949
// GB2313_CHARSET          134 (x86)             936
// CHINESEBIG5_CHARSET     136 (x88)             950 
// 
// Its 129 for Korean, 128 for Japanese, etc.

var L_CharSet_Number = "0";

var	g_File = null;

function index_Show( file )
{
	if(file && file != "<SYSTEM>")
	{
		file = pchealth.UserSettings.IndexFile( file );
	}
	else
	{
		file = pchealth.UserSettings.IndexFile;
	}

	var elem = document.all.idDisplay;
	while(elem && elem.currentStyle.backgroundColor == "transparent") elem = elem.parentElement;

    if(g_File != file)
	{
		var obj   = pchealth.TextHelpers;
		var sText = "<OBJECT id=HHIndex type='application/x-oleobject' classid='clsid:adb880a6-d8ff-11cf-9377-00aa003b7a11' WIDTH=100% HEIGHT=100%><PARAM name='Command' value='index'>";

		if(elem)
		{
			var szColor = obj.QuoteEscape( elem.currentStyle.backgroundColor                              , "'" );
			var szFont  = obj.QuoteEscape( elem.currentStyle.fontFamily + "," + elem.currentStyle.fontSize, "'" );

			sText += "<PARAM name='BgColor' value='" + szColor + "'>";
			sText += "<PARAM name='Font' value='" + szFont + "," + L_CharSet_Number + "'>";
		}

		sText += "<PARAM name='Item1' value='" + obj.QuoteEscape( file, "'" ) + "'></OBJECT>";
		
		idDisplay.innerHTML = sText;
		g_File = file;
	}
}

</SCRIPT>

<helpcenter:state id=idState identity="Index" />

</HTML>
