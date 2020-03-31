CT>

<LINK ID=Stylesheet_Ref0 href="hcp://system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref2 href="hcp://system/css/Layout.css"    rel=STYLESHEET type=text/css>

<STYLE>

BODY
{
    margin     : 16px;
    margin-top : 11px;
}

.AdvSearch-GenParam
{
    padding-top    : 1em;
    padding-bottom : 1em;
    padding-left   : 6px;
}

.AdvSearch-WrapperDesc
{
    padding-left : 23px;
}

.AdvSearch-ResultTable
{
    padding-left : 15px;
}

.AdvSearch-Result
{
    padding-left : 19px;
    padding-top  : 0.5em;
}

.AdvSearch-NumResultsInput
{
    width : 30px;
}

.AdvSearch-Required
{
    padding-left   : 4px;
    padding-bottom : 1em;
}

.AdvSearch-RequiredText
{
    padding-left : 7px;
}

.sys-font-body-gray
{
    color : graytext;
}

</STYLE>

</HEAD>

<BODY SCROLL=AUTO class="sys-rhp-bgcolor sys-color-body">

<DIV id=locTitle NOWRAP class='sys-font-heading3 sys-rhp-color-title'>Set search options</DIV><BR>
<DIV id=locDesc class='sys-font-body sys-color-body'>Find help and information from different sources.
 To change the scope of your search, select one or more providers from the following list.</DIV>

<DIV class='sys-font-body sys-color-body AdvSearch-GenParam' id=locNumResult>Return up to &nbsp;<INPUT title="Return up to number of results per provider" TABINDEX='1' id=allMaxResults class='sys-toppane-bgcolor sys-color-body AdvSearch-NumResultsInput' TYPE=text MAXLENGTH=3 onblur='NumResultsChange()' VALUE="100"> results per provider.</DIV>

<DIV class='sys-font-body sys-color-body' id=locSearchHighlight title='Specifies whether to highlight occurrences of the search term in the topic.'>
  <INPUT title='Specifies whether to highlight occurrences of the search term in the topic.' TABINDEX='0' id=allSearchHighlight class='sys-font-body sys-color-body' TYPE=checkbox onclick='SearchHighlightChange();'>&nbsp;Turn on search highlight.
</DIV>

<!-- Server DCR : Add option to select default wrapper -->
<DIV class='sys-font-body sys-color-body AdvSearch-GenParam' id=locSearchDisplay>
	<DIV id=locDefaultProvider class='sys-toppane-bgcolor sys-color-body'>Display results from this provider by default:</DIV>
	<SELECT title='Specifies the default search engine to display.' style='margin-top: 1em' class='sys-font-body sys-color-body sys-toppane-bgcolor' ID='allSearchDisplay' SIZE=1 onchange='DisplayListChange();'></SELECT>
</DIV>
<!-- Server DCR : Add option to select default wrapper -->

<DIV id=idSearchWrappers></DIV>

</BODY>

<SCRIPT id=Script_Ref0 SRC="hcp://system/scripts/wrapperparam.js"></SCRIPT>

<SCRIPT LANGUAGE="JavaScript" DEFER>

var L_Required_Text         = "Required";
var L_NumUnsignedError_Text = "Value must be a valid integer greater than 0.";
var L_NumIntError_Text      = "Value must be a valid integer.";
var L_NumFloatError_Text    = "Value must be a valid floating number.";
var L_DateError_Text		= "Value must be a valid date.";
var L_NoEngine_Text			= "You have unselected all available search providers. You must have at least one search provider selected in order to search Help and Support Center.";
var L_NoDefaultSelected_Text = "No default selected";

var g_NAVBAR = pchealth.UI_NavBar.content.parentWindow;

// Init SEMgr
var g_aParamValue = [];

if(g_NAVBAR.GetWrapperVar( "SEMgrInit" ) != "true")
{
    LoadWrapperParams( g_NAVBAR.GetSearchEngineManager() );

    g_NAVBAR.SetWrapperVar( "SEMgrInit", "true" );
}

allSearchHighlight.checked = g_NAVBAR.g_SearchHighlight;

function SetParam(itemid, value)
{
    // Extract the id and parameter name
    var re = new RegExp("___");
    var arr = re.exec(itemid);
    var wrapperid = RegExp.leftContext;
    var paramname = RegExp.rightContext;

    // Locate the wrapper
    var oWrapper = g_NAVBAR.FindWrapper(wrapperid);

    // Set the value
    oWrapper.AddParam(paramname, value);

    // Save the parameter into the registry
    SaveWrapperParams(wrapperid, paramname, value);
}

function NumUnsignedIntChange()
{
    // Check the value of the input
    var value  = parseInt( event.srcElement.value );
	var value2 = parseFloat(event.srcElement.value);

    // Check to see if it is positive and if it is an integer
    if(isNaN( event.srcElement.value )	||
		(value < 0)						||
		(value != value2)) // check if integer
    {
        pchealth.MessageBox( L_NumUnsignedError_Text, "OK" );
        event.srcElement.value = pchealth.TextHelpers.QuoteEscape( g_aParamValue[event.srcElement.id], "'" );
        return;
    }

    SetParam(event.srcElement.id, value);
}

function NumSignedIntChange()
{
    // Check the value of the input
    var value  = parseInt( event.srcElement.value );
	var value2 = parseFloat(event.srcElement.value);

    // Check to see if it is an integer
    if(isNaN( event.srcElement.value ) || (value != value2))
    {
        pchealth.MessageBox( L_NumIntError_Text, "OK" );
        event.srcElement.value = pchealth.TextHelpers.QuoteEscape( g_aParamValue[event.srcElement.id], "'" );
        return;
    }

    SetParam(event.srcElement.id, value);
}

function NumFloatChange()
{
    // Check to see if it is a number
    if(isNaN( event.srcElement.value ))
    {
        pchealth.MessageBox( L_NumFloatError_Text, "OK" );
        event.srcElement.value = pchealth.TextHelpers.QuoteEscape( g_aParamValue[event.srcElement.id], "'" );
        return;
    }

    SetParam(event.srcElement.id, value);
}

function DateChange()
{
    var temp = Date.parse(event.srcElement.value);
    if(isNaN( temp ))
	{
        pchealth.MessageBox( L_DateError_Text, "OK" );
        event.srcElement.value = pchealth.TextHelpers.QuoteEscape( g_aParamValue[event.srcElement.id], "'" );
		return;
	}

    SetParam(event.srcElement.id, event.srcElement.value);
}

function TextChange()
{
    SetParam(event.srcElement.id, event.srcElement.value);
}

function ListChange()
{
    var oOptions    = event.srcElement.options(event.srcElement.selectedIndex);
    SetParam(event.srcElement.id, oOptions.value);
}

function ClickChange()
{
    try
    {
        if(event.srcElement.checked)
        {
            SetParam(event.srcElement.id, true);
        }
        else
        {
            SetParam(event.srcElement.id, false);
        }
    }
    catch(e)
    {;}
}

function GenerateList(oWrapper, strXML, strParamName, strDisplay, strDisplay2, strPrevValue)
{
    try
    {
        // Load the xml file
        var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
        xmldoc.async = false;
        xmldoc.loadXML(strXML);

        var strHTML = "<SELECT title='" + strDisplay2 + "' style='margin-bottom: 1em' class='sys-font-body sys-color-body sys-toppane-bgcolor' ID='" + strParamName + "' SIZE=1 onchange='ListChange();'>";

        // Generate each item
        var ElemList = xmldoc.getElementsByTagName("PARAM_VALUE");
        for (var i=0; i < ElemList.length; i++)
        {
            var strItemValue = ElemList.item(i).getAttribute("VALUE");
            var strDisplay   = pchealth.TextHelpers.HTMLEscape(ElemList.item(i).getElementsByTagName("DISPLAYSTRING").item(0).text);
            var strDefault   = ElemList.item(i).getAttribute("DEFAULT");

            if(strDefault == null) strDefault = "";

            strItemValue = pchealth.TextHelpers.HTMLEscape( strItemValue );

            // Restore the previous value
            if ((!strPrevValue) || (strPrevValue == ""))
            {
                // Check if default value
                if(strDefault.toLowerCase() == "true")
                {
                    strHTML += "<OPTION VALUE='" + strItemValue + "' SELECTED>" + strDisplay;

                    // set the default value so that the search wrapper gets this value
                    oWrapper.AddParam( strParamName, strItemValue );
                }
                else
                {
                    strHTML += "<OPTION VALUE='" + strItemValue + "'>" + strDisplay;
                }
            }
            else
            {
                if (pchealth.TextHelpers.HTMLEscape( strPrevValue ) == strItemValue)
                {
                    strHTML += "<OPTION VALUE='" + strItemValue + "' SELECTED>" + strDisplay;
                }
                else
                {
                    strHTML += "<OPTION VALUE='" + strItemValue + "'>" + strDisplay;
                }
            }
        }

        strHTML += "</SELECT>";

        return strHTML;
    }
    catch(e)
    {
    }

    return "";
}

function DisplayParam(oWrapper, Type, strDisplay, strParamName, bReq, bstrData)
{
    var strHTML     = "<TR>";
    var strReq      = "";
    var value       = null;
    var value2;
    var strUIType   = "";
    var strValue    = "";
    var strResName  = pchealth.TextHelpers.HTMLEscape( oWrapper.ID + "___" + strParamName );
    var strParamHTML= "";
    var strChecked  = "";
	var strDisplay2	= pchealth.TextHelpers.HTMLEscape( strDisplay );

    strDisplay = pchealth.TextHelpers.HTMLEscape( strDisplay );


    // If it is not required, then perform colspan
    if (bReq == false)
        strHTML += "<TD width=50% id='text" + strResName + "' COLSPAN=2>";
    else
        strHTML += "<TD width=50% id='text" + strResName + "' >";

    // Get the value stored before
    try
    {
        value = oWrapper.GetParam(strParamName);
    }
    catch(e)
    {
        // ignore
    }

    // Decide on the UI
    if(Type == pchealth.PARAM_R4 || // float
       Type == pchealth.PARAM_R8  ) // double
    {
        if(value == null) value = 0;

        value2 = pchealth.TextHelpers.HTMLEscape( value );

        strParamHTML = '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=text MAXLENGTH=10 onblur="NumFloatChange();" VALUE="' + value2 + '"></TD>';

        g_aParamValue[strResName] = value;
    }

    if(Type == pchealth.PARAM_UI1 || // Byte
       Type == pchealth.PARAM_I2  || // Short
       Type == pchealth.PARAM_I4  || // long
       Type == pchealth.PARAM_INT  ) // int
    {
        if(value == null) value = 0;

        value2 = pchealth.TextHelpers.HTMLEscape( value );

        strParamHTML = '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=text MAXLENGTH=10 onblur="NumSignedIntChange();" VALUE="' + value2 + '"></TD>';

        g_aParamValue[strResName] = value;
    }

    if(Type == pchealth.PARAM_UI2  || // unsigned short
       Type == pchealth.PARAM_UI4  || // unsigned long
       Type == pchealth.PARAM_UINT  ) // unsigned int
    {
        if(value == null) value = 0;

        value2 = pchealth.TextHelpers.HTMLEscape( value );

        strParamHTML = '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=text MAXLENGTH=10 onblur="NumUnsignedIntChange();" VALUE="' + value2 + '"></TD>';

        g_aParamValue[strResName] = value;
    }

    if(Type == pchealth.PARAM_DATE)
    {
        if(value == null) value = "";

        value2 = pchealth.TextHelpers.HTMLEscape( value );

        strParamHTML = '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=text onblur="DateChange();" VALUE="' + value2 + '"></TD>';

        g_aParamValue[strResName] = value;
    }

	if(Type == pchealth.PARAM_BSTR) // BSTR
    {
        if(value == null) value = "";

        value2 = pchealth.TextHelpers.HTMLEscape( value );

        strParamHTML = '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=text onblur="TextChange();" VALUE="' + value2 + '"></TD>';

        g_aParamValue[strResName] = value;
    }

    if(Type == pchealth.PARAM_I1) // char
    {
        if(value == null) value = "";

        value2 = pchealth.TextHelpers.HTMLEscape( value );

        strParamHTML = '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=text MAXLENGTH=1 onblur="TextChange();" VALUE="' + value2 + '"></TD>';

        g_aParamValue[strResName] = value;
    }

    if(Type == pchealth.PARAM_BOOL) // VARIANT_BOOL
    {
        if(value == null) value = false;
        if(value == true) strChecked = "CHECKED";

        strHTML += '<INPUT title="' + strDisplay2 + '" TABINDEX="0" id="' + strResName + '" class="sys-font-body sys-color-body" TYPE=checkbox onclick="ClickChange();" ' + strChecked + ">&nbsp;" + strDisplay + "</TD>";

        if(bReq) strHTML += "<TD width=10% align=right><b>" + L_Required_Text + "</b></TD>";

        g_aParamValue[strResName] = value;
    }

    if(Type == pchealth.PARAM_LIST) // List type
    {
        strParamHTML = GenerateList( oWrapper, bstrData, strResName, strDisplay, strDisplay2, value );

        g_aParamValue[strResName] = value;
    }

    // Add required message
    if(Type != pchealth.PARAM_BOOL)
    {
        if(bReq == false)
        {
            strHTML += "<DIV class='AdvSearch-Required'>" + strDisplay + "</DIV></TD></TR><TR><TD colspan=2><DIV class='AdvSearch-RequiredText sys-font-body sys-color-body'>";
            strHTML += strParamHTML;
            strHTML += "</DIV></TD></TR>";
        }
        else
        {
            strHTML += strDisplay + "</TD><TD style='height:1em;'></TD></TR><TR><TD>";
            strHTML += strParamHTML + "</TD>";

            strHTML += "<TD width=10% align=right><b>" + L_Required_Text + "</b></TD>";
        }
    }

    // End Row
    strHTML += "</TR>";

    return strHTML;
}

function GenWrapperParams( oSearchEng )
{
    var strResultHTML = "";
    var bFTSPer = false;

    // Bug 174314 : Do not allow Search in Titles only option for personal SKUs
    if(oSearchEng.ID == g_NAVBAR.ID_FTS)
    {
        if(pchealth.UserSettings.CurrentSKU.SKU.match( /^Personal_/ )) bFTSPer = true;
    }

    // Loop through all the variables
    for(var v = new Enumerator(oSearchEng.Param()); !v.atEnd(); v.moveNext())
    {
        ParamItem = v.item();

        // If parameter is not visible, skip
        if(ParamItem.Visible == true)
        {
            // Check to see if the value has changed
            strResultHTML += DisplayParam( oSearchEng, ParamItem.Type, ParamItem.Display, ParamItem.Name, ParamItem.Required, ParamItem.Data );
        }
    }

    return strResultHTML;
}

function NumResultsChange()
{
    // Check the value of the input
    var value  = parseInt( event.srcElement.value );
	var value2 = parseFloat(event.srcElement.value);

    // Check to see if it is an integer
    if(isNaN( event.srcElement.value ) || (value != value2) || value <= 0)
    {
        pchealth.MessageBox( L_NumUnsignedError_Text, "OK" );
		try
		{
	        event.srcElement.value = g_NAVBAR.GetSearchEngineManager().NumResult;
		}
		catch(e)
		{ ; }
        return;
    }

	try
	{
	    g_NAVBAR.GetSearchEngineManager().NumResult = value;
	}
	catch(e)
	{
		return;
	}

    // Save the parameter into the registry
    SaveWrapperParams("", "NumResults", value);
}

function SearchHighlightChange()
{
    try
    {
		g_NAVBAR.g_SearchHighlight = event.srcElement.checked;
		SaveWrapperParams( "", "SearchHighlight", g_NAVBAR.g_SearchHighlight );
    }
    catch(e)
    {;}
}

function ClickEnable()
{
    // Extract the id and parameter name
    var re			= new RegExp("___");
    var arr			= re.exec(event.srcElement.id);
    var wrapperid	= RegExp.rightContext;
    var semgr		= g_NAVBAR.GetSearchEngineManager();
	var bEnabled	= false;

    // Locate the wrapper
    var oWrapper = g_NAVBAR.FindWrapper(wrapperid);

    // Set the value
    oWrapper.Enabled = event.srcElement.checked;

	// Check if all wrappers have been disabled
    for(var e = new Enumerator( semgr.EnumEngine()); !e.atEnd(); e.moveNext())
    {
        var oSearchEng = e.item();
		if (oSearchEng.Enabled)
		{
			bEnabled = true;
			break;
		}
	}
	
	// Issue warning if all wrappers are disabled
	if (bEnabled == false)
	{
		pchealth.MessageBox( L_NoEngine_Text, "OK" );
	}

    // Save the parameter into the registry
    SaveWrapperParams(oWrapper.ID, "Enabled", event.srcElement.checked);

    // Change the param state
    ParamState(oWrapper, event.srcElement.checked);

	if (oWrapper.ID == g_NAVBAR.ID_KEYWORD)
		pchealth.WEB_Context.document.parentWindow.EnableSubsite(event.srcElement.checked);
}

function ParamState(oWrapper, bEnabled)
{
    // Loop through all the variables
    for(var v = new Enumerator(oWrapper.Param()); !v.atEnd(); v.moveNext())
    {
        var ParamItem = v.item();
        var oParamDiv = idSearchWrappers.all.item(oWrapper.ID + "___" + ParamItem.Name);
        var oTextDIV  = idSearchWrappers.all.item("text" + oWrapper.ID + "___" + ParamItem.Name);
        var oDescDIV  = idSearchWrappers.all.item("desc" + oWrapper.ID);

        if(oParamDiv) oParamDiv.disabled = bEnabled ? false                                                : true;
        if(oTextDIV ) oTextDIV.className = bEnabled ? "AdvSearch-Result sys-font-body sys-color-body"      : "AdvSearch-Result sys-font-body sys-font-body-gray";
        if(oDescDIV ) oDescDIV.className = bEnabled ? "AdvSearch-WrapperDesc sys-font-body sys-color-body" : "AdvSearch-WrapperDesc sys-font-body sys-font-body-gray";
    }
}

//
// Server DCR : Add option to select default wrapper
//
function DisplayListChange()
{
    var oOptions    = event.srcElement.options(event.srcElement.selectedIndex);
	g_NAVBAR.SetDefaultWrapper(oOptions.value);
}

function PopulateVariables()
{
    var strResultHTML = "";
    var semgr         = g_NAVBAR.GetSearchEngineManager();

	//
	// Server DCR : Add option to select default wrapper
	//
	var idWrapperDisplay = g_NAVBAR.GetDefaultWrapper();
	var oOptionNoDef   = document.createElement("OPTION");
	oOptionNoDef.text  = L_NoDefaultSelected_Text;
	oOptionNoDef.value = "none";
	if (idWrapperDisplay == "" || idWrapperDisplay == "none")
		oOptionNoDef.selected = true;
	allSearchDisplay.add(oOptionNoDef);

    // Display general parameters
    allMaxResults.value = semgr.NumResult; // Max results from search engine

    // Loop thru all engines
    for(var e = new Enumerator( semgr.EnumEngine()); !e.atEnd(); e.moveNext())
    {
        var oSearchEng = e.item();
        // Add enable input
        var strEnable = (oSearchEng.Enabled ? "CHECKED" : "");

        strResultHTML += "<HR color='black' size=1>";

        strResultHTML += '<DIV class="sys-font-body-bold sys-color-body"><INPUT title="' + pchealth.TextHelpers.HTMLEscape( oSearchEng.Name ) + '" TABINDEX="0" id="enable___' + pchealth.TextHelpers.HTMLEscape( oSearchEng.ID ) + '" class="sys-font-body sys-color-body" TYPE=checkbox onclick="ClickEnable()"';
        if(oSearchEng.Enabled) strResultHTML += " CHECKED";
        strResultHTML += ">&nbsp;" + pchealth.TextHelpers.HTMLEscape( oSearchEng.Name ) + "</DIV>";
        strResultHTML += '<DIV id="desc' + pchealth.TextHelpers.HTMLEscape( oSearchEng.ID ) + '">' + pchealth.TextHelpers.HTMLEscape( oSearchEng.Description ) + '</DIV>';
        strResultHTML += "<TABLE border=0 cellpadding=0 cellspacing=0 class='AdvSearch-ResultTable sys-font-body sys-color-body' width=90%>";
        strResultHTML += GenWrapperParams( oSearchEng );
        strResultHTML += "</TABLE>";

		//
		// Server DCR : Add option to select default wrapper
		//
		var oOption   = document.createElement("OPTION");
		oOption.text  = pchealth.TextHelpers.HTMLEscape(oSearchEng.Name);
		oOption.value = oSearchEng.ID;
		allSearchDisplay.add(oOption);
		if (oSearchEng.ID == idWrapperDisplay)
			oOption.selected = true;

    }

    idSearchWrappers.innerHTML = strResultHTML;

    // After inserting the HTML, modify the state of the params
    for(e.moveFirst(); !e.atEnd(); e.moveNext())
    {
        var oSearchEng = e.item();
        ParamState(oSearchEng, oSearchEng.Enabled);
    }
}

PopulateVariables();

</SCRIPT>

</HTML>

