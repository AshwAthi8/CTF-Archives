//system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>

<TITLE>Help and Support Center options</TITLE>

<STYLE>
BODY
{
    margin      : 16px;
    margin-top  : 11px;
}
</STYLE>

</HEAD>

<BODY id=noloc1 scroll=auto class="sys-rhp-color">

<DIV id=locTitle class="sys-font-heading3 sys-rhp-color-title">
 Help and Support Center options
</DIV>
<BR>

<DIV id=locDesc class="sys-font-body sys-color-body">
  Select from the options below to customize your Help and Support Center experience.
</DIV>
<BR>

<DIV style="margin-bottom: 0em">
  <INPUT tabIndex=1 type=checkbox id=idOPT_fav onclick="updateOptions();">
  <LABEL id=locOPT_fav class="sys-font-body sys-color-body" FOR=idOPT_fav>Show Favorites on the navigation bar</LABEL>
</DIV>
								                                       
<DIV style="margin-bottom: 0.5em">
  <INPUT tabIndex=1 type=checkbox id=idOPT_hist onclick="updateOptions();">
  <LABEL id=locOPT_hist class="sys-font-body sys-color-body" FOR=idOPT_hist>Show History on the navigation bar</LABEL>
</DIV>

<DIV id=locFont style="margin-bottom: 1em; margin-top: 1.5em" class="sys-font-body">
  Font size used for Help content:
</DIV>

<DIV style="margin-bottom: 0.5em">
  <INPUT type=radio tabIndex=1 name='FontSize' id=idOPT_font_SMALL onclick="updateOptions();">
  <LABEL id=locOPT_font_SMALL class="sys-font-body sys-color-body" FOR=idOPT_font_SMALL>Small</LABEL><BR>

  <INPUT type=radio tabIndex=1 name='FontSize' id=idOPT_font_MEDIUM onclick="updateOptions();">
  <LABEL id=locOPT_font_MEDIUM class="sys-font-body sys-color-body" FOR=idOPT_font_MEDIUM>Medium</LABEL><BR>

  <INPUT type=radio tabIndex=1 name='FontSize' id=idOPT_font_LARGE onclick="updateOptions();">
  <LABEL id=locOPT_font_LARGE class="sys-font-body sys-color-body" FOR=idOPT_font_LARGE>Large</LABEL>
</DIV>

<DIV id=locIcon style="margin-bottom: 1.5em; margin-top: 1.5em" class="sys-font-body">
  Options for icons in the navigation bar:
</DIV>

<DIV style="margin-bottom: 0.5em">
  <INPUT type=radio tabIndex=1 name='TextLabels' id=idOPT_text_ALL onclick="updateOptions();">
  <LABEL id=locOPT_text_ALL class="sys-font-body sys-color-body" FOR=idOPT_text_ALL>Show all text labels</LABEL><BR>

  <INPUT type=radio tabIndex=1 name='TextLabels' id=idOPT_text_SEL onclick="updateOptions();">
  <LABEL id=locOPT_text_SEL class="sys-font-body sys-color-body" FOR=idOPT_text_SEL>Show only default text labels</LABEL><BR>

  <INPUT type=radio tabIndex=1 name='TextLabels' id=idOPT_text_NONE onclick="updateOptions();">
  <LABEL id=locOPT_text_NONE class="sys-font-body sys-color-body" FOR=idOPT_text_NONE>Do not show text labels</LABEL>
</DIV>

</BODY>

<SCRIPT>

var g_options = pchealth.UserSettings.Options;

function readOptions()
{
	idOPT_fav .checked = g_options.ShowFavorites;
	idOPT_hist.checked = g_options.ShowHistory;

	switch(g_options.TextLabels)
	{	
	case 0: idOPT_text_ALL .checked = true; break;
	case 1: idOPT_text_SEL .checked = true; break;
	case 2: idOPT_text_NONE.checked = true; break;
	}

	switch(g_options.FontSize)
	{	
	case 0: idOPT_font_SMALL .checked = true; break;
	case 1: idOPT_font_MEDIUM.checked = true; break;
	case 2: idOPT_font_LARGE .checked = true; break;
	}
}

function updateOptions()
{
	g_options.ShowFavorites = idOPT_fav .checked;
	g_options.ShowHistory   = idOPT_hist.checked;

	if(idOPT_text_ALL .checked) g_options.TextLabels = 0;
	if(idOPT_text_SEL .checked) g_options.TextLabels = 1;
	if(idOPT_text_NONE.checked) g_options.TextLabels = 2;

	if(idOPT_font_SMALL .checked) g_options.FontSize = 0;
	if(idOPT_font_MEDIUM.checked) g_options.FontSize = 1;
	if(idOPT_font_LARGE .checked) g_options.FontSize = 2;

	g_options.Apply();
}

readOptions();

</SCRIPT>

</HTML>
