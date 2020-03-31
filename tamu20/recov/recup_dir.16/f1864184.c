
COLOR: #003399;
CURSOR: hand;
FONT-FAMILY: verdana, tahoma;
FONT-SIZE: 9pt;
MARGIN-LEFT: 10px;
height:28px;
}
DIV.controls
{
padding-left: 40px;
width:560px;
}
.radpadding
{
padding-right:15px;
}
.selfocus
{
border:1 solid #D6DBEF;
}
#divHR
{
position:relative;
height:1px;
width:560px;
background-color:#96AADD;
overflow:hidden;
}
#divBrand
{
width:560px;
text-align:right;
padding-bottom:6px;
}

TD#noteContainer{
BACKGROUND-COLOR: #ffffe7;
FONT-FAMILY: ms sans serif;
FONT-SIZE: 10px
}
SPAN#noteSubject 
{
COLOR: black;
FONT-WEIGHT: bold;
}
TD#noteContainer
{
/* locstart displaynote.stylesheet.values / This will set the text style of the displaynote - Font-size should be the only one that is really valuable. */
BACKGROUND-COLOR: #ffffe7; 
FONT-FAMILY: ms sans serif; 
FONT-SIZE: 10px;
/* locend */
}

/* LOCAPPLY - this file has been localized for LocApply */
//#include "defines.inc"


//* Global Variables */
var db;// = document.body;
var dbg = false;
var giSrcStyle;
var DATAID_SIGNUP_PATH            = 157;
var DATAID_SIGNUP_POPOVERRIDE     = 507;
var DATAKEY_SIGNUP_NEW_IA         = 0;
var DATAKEY_SIGNUP_EXIST_IA       = 1;
var DATAKEY_SIGNUP_NEW_PPORT      = 2;
var DATAKEY_SIGNUP_EXIST_PPORT    = 3;
var DATAKEY_SIGNUP_OTHER_ISP      = 4;

var DATAID_SIGNUP_STATUS = 446;
var DATAKEY_SIGNUP_OK = 0;              // (SIGNUP_STATUS) Successful
var DATAKEY_SIGNUP_CANCELED = 1;       // (SIGNUP_STATUS) User Canceled
var DATAKEY_SIGNUP_FAIL_DAIL = 2;       // (SIGNUP_STATUS) Fatal Couldnt Dail
var DATAKEY_SIGNUP_FAIL_NOSERVER = 3;  // (SIGNUP_STATUS) Fatal Couldnt Find Server

//Dialing flags for Connectors
var DIALFLAG_POPTIMIZENUMBER = 0x00000001;
var DIALFLAG_FOREVER         = 0x00000002;
var DIALFLAG_TENDIGITDIALING = 0x00000004;
var DIALFLAG_LONGDISTANCE    = 0x00000008;
var DIALFLAG_OUTSIDELINE     = 0x00000010;
var DIALFLAG_CALLWAITING     = 0x00000020;
var DIALFLAG_PULSE           = 0x00000040;
var DIALFLAG_1800BILLABLE    = 0x00000080;
var DIALFLAG_HIDDEN          = 0x00000100;
var DIALFLAG_DONTUSENUMBER   = 0x00000200;
var DIALFLAG_1800SIGNUP      = 0x00000400;
var DIALFLAG_NOTUSERVERIFIED = 0x00000800;

//Dialing Status
var STATUS_CONNECTED = 2;

//Available Mars Msgbox flags:
var MB_OK                       = 0x00000000;  //(Default)
var MB_OKCANCEL         = 0x00000001;
var MB_YESNO            = 0x00000004;
var MB_RETRYCANCEL      = 0x00000005;

//msgbox Return values:
var IDOK       = 1;
var IDCANCEL   = 2;
var IDRETRY        = 4;
var IDYES          = 6;
var IDNO           = 7;

var irgISPNAME = 0;
var irgISPSHORTNAME = 1;
var irgISPAAN = 2;
var irgISPSUPPORT = 3;

var rgIdToName = new Array();
rgIdToName[0] = "isp_name";
rgIdToName[1] = "isp_shortname";
rgIdToName[2] = "isp_a_an";
rgIdToName[3] = "supportnum";

var g_fOOBE = false;

var g_sContinueButtonHTML = "";
var g_sBackButtonHTML = "";

var g_sContinueButtonKey = /* locstart signup.continuebutton.key/ */"c"/* locend */;
var g_sBackButtonKey = /* locstart signup.backbutton.key/ */"b"/* locend */;

g_sContinueButtonHTML += /* locstart signup.continuebutton.label/underline access key */"<u>C</u>ontinue"/* locend */;
g_sContinueButtonHTML += '<img id="imgNext" class="arownext" src="msn://@signup.mar@/cn_aright.gif" WIDTH="10" HEIGHT="12">';

g_sBackButtonHTML += '<img id="imgBack" class="arowback" src="msn://@signup.mar@/cn_aleft.gif" WIDTH="10" HEIGHT="12">';
g_sBackButtonHTML += /* locstart signup.backbutton.label/underline access key */"<u>B</u>ack"/* locend */;

var fPageLoaded;
var oLM;
var oConnectors;

var gBusy = false;
var gnTimer;
var gfClientOnly = false;
var gfNewIA = false;

var giWait = 0;
var gnTimer;
var gsWait="";

//* set Global Event handlers */
document.onreadystatechange = OnReadyStateChanged;
document.onclick = docOnClick;
document.onkeydown = docKeyDown;
document.onhelp = docOnHelp;

//* setup the busy signal
gsWait += 'if(giWait != 0){gnTimer=window.setTimeout(gsWait,80);}else{divBusy.style.display="none";}';

var g_strWait = "";
g_strWait += '<div id="divBusy" style="display:none;z-index:99;">';
g_strWait += '<label for=imgWait><div id=spanMsg style="padding-top:2px;">' + /* locstart signup.pleasewait.text */  'Please Wait...' /* locend */ + '</div></label>';
g_strWait += '<img id="imgWait" src="msn://@signup.mar@/busy.gif" style="padding-top:2px;">';
g_strWait += '</div>';

//drop in global components used on all pages.
putComponents();

function putComponents()
{
    //function writes global components used on all pages
    var strWait="";
    var strDialog="";
    var strMars="";
    var strMeta=""

    strMeta += '<META HTTP-EQUIV="Pragma" CONTENT="no-cache">';
    strDialog += '<table id="oNote" cellpadding="0" cellspacing="0" style="BACKGROUND-COLOR: transparent; DISPLAY: none; HEIGHT: 50px; LEFT: 100px; POSITION: absolute; TOP: 100px; WIDTH: 300px; Z-INDEX: 20; cursor:hand" onclick="style.visibility=\'hidden\';" language="javascript">'
    strDialog += '<tr><td colspan="3"><img height="17" id="noteImgUp" src="msn://@signup.mar@/pointup.gif" style="DISPLAY: none; LEFT: 30px; POSITION: relative; TOP: 1px" width="18"></td></tr>'
    strDialog += '<tr height="6"><td width="6" height="6"><img height="6" src="msn://@signup.mar@/info_tl.gif" width="6"></td><td style="BACKGROUND-IMAGE: url(msn://@signup.mar@/info_top.gif); HEIGHT: 6px"></td><td align="right" valign="top" width="6" height="6"><img height="6" src="msn://@signup.mar@/info_tr.gif" width="6"></td></tr>'
    strDialog += '<tr><td style="BACKGROUND-IMAGE: url(msn://@signup.mar@/info_lft.gif)"></td><td id="noteContainer"><img align="middle" height="16" id="noteIcon" src="msn://@signup.mar@/infoicon.gif" width="17">&nbsp;<span id="noteSubject"></span><br><span id="noteText" style="COLOR: black"></span></td><td style="BACKGROUND-IMAGE: url(msn://@signup.mar@/info_rt.gif)"></td></tr>'
    strDialog += '<tr height="6"><td width="6" height="6"><img height="6" src="msn://@signup.mar@/info_bl.gif" width="6"></td><td style="BACKGROUND-IMAGE: url(msn://@signup.mar@/info_btm.gif); HEIGHT: 6px"></td><td width="6" height="6"><img height="6" src="msn://@signup.mar@/info_br.gif" width="6"></td></tr>'
    strDialog += '<tr><td colspan="3"><img height="17" id="notePntDwn" src="msn://@signup.mar@/pointdwn.gif" style="LEFT: 30px; POSITION: relative; TOP: -1px" width="18"></td></tr>'
    strDialog += '</table>'

    strMars += '<div id="oMarsSignup" style="behavior:url(#msncf#signup);" onIframeDone="OnNewIFrameReady" ></div>'
    strMars += '<div id="oDatastore" style="behavior:url(#msncf#datastore);"></div>'
    strMars += '<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>'
    strMars += '<div id="oUser" style="behavior:url(#msncf#usermanager);display:none"></div>'

    document.writeln(strMeta + strMars + strDialog);
    //busyOn();
}

function USMarket()
{
    // check the registry flag for a global flag
    var MSNRegKey = oMarsSignup.RegKey;
    MSNRegKey.Init("HKLM", "SOFTWARE\\Microsoft\\MSN6\\Setup\\MSN\\Codes", false);

    var sglobal = MSNRegKey.ReadValue("global");
    if (sglobal == "1")
        return false; // not a us market

    return (window.external.MarketID == "en-us");
}

function showHelpEx(sPage, fUseBrandLookup)
{
        var sHelpPage = fUseBrandLookup ? sPage : "msn://@signup.mar@/" + sPage;

        if(g_fOOBE)
        {
                var sHelpFrame = "helpframe.htm?" + "src=" + escape(sHelpPage) + "&getback=" + escape(window.location.href);
                window.location.href = "helpframe.htm?" + "src=" + escape(sHelpPage) + "&getback=" + escape(window.location.href);
                return;
        }
        else
        {
                window.external.showHelpPane(sHelpPage,0);
        }
}

function showHelp(sPage)
{
    showHelpEx(sPage, false);
}


function refreshLMObjects()
{
   oLM = oMarsSignup.logonmgr;
   oConnectors = oLM.Connectors;
}

function AddConnectors()
{
    AddModemConnectors();
    AddLanConnectors();
}

function AddModemConnectors()
{
    var oDevices = oLM.ConnectorDeviceEnum;
    oDevices.GatherDeviceInfo();

    //Merges Connectors with modems found on system.  Prunes out Connectors for
    //lost devices, replacing them with the new one(s).
    oMarsSignup.FixupModemConnectors();

    //Add new modem devices.
    for(var iDevice = 0; iDevice < oDevices.GetNumDevices(); iDevice++)
    {
        var sDType = oDevices.GetDeviceType(iDevice).toLowerCase();
        var sDName = oDevices.GetDeviceName(iDevice);

        if(sDType.toLowerCase() == "modem")
        {
            //Make sure we aren't adding a duplicate.
            var fConnExists = false;
            for(var iConn = 0; iConn < oConnectors.Count; iConn++)
            {
                if(oConnectors.Item(iConn).DeviceType.toLowerCase() == sDType &&
                   oConnectors.Item(iConn).DeviceName == sDName)
                {
                    fConnExists = true;
                    break;
                }
            }

            //No dupes found, add a Connector for this modem.
            if(!fConnExists)
            {
                MarsLog("Adding new Modem Connector: " + sDName, true);
                var oNewConnector = oConnectors.Add(sDType);
                oNewConnector.DeviceName = sDName;
                oNewConnector.Name = "MSN Explorer";

                PopulateNewModemSettings(oNewConnector);
            }
        }
    }
}

function AddLanConnectors()
{
    //Always add a single LAN connector if one isn't already there.

    var fLanExists = false;
    for(var iConn=0; iConn < oConnectors.Count; iConn++)
    {
        if(oConnectors.item(iConn).DeviceType.toLowerCase() == "lan")
        {
            fLanExists = true;
            break;
        }
    }

    if(!fLanExists)
    {
        MarsLog("Adding LAN Connector.", true);
        var oNewConnector = oConnectors.Add("lan");
        oNewConnector.DeviceName = /* locstart signup.devicename.lan.text/Sets the LAN connector device name */ "LAN/DSL"/* locend */;
        oNewConnector.Name = /* locstart signup.name.lan.text/Sets the LAN connector device name */ "Broadband"/* locend */;
    }
}

function PopulateNewModemSettings(oNewModem)
{
    //If user is adding a modem but did not remove the old one then try to copy
    //the setting from the old one.
    try
    {
        //First try the default connector, then loop through all of them.  We
        //key off of AreaCode because that should always be set if the Connector
        //has been configured.
        if(oConnectors.Default.DeviceType.toLowerCase() == "modem" &&
           oConnectors.Default.DeviceName != oNewModem.DeviceName &&
           oConnectors.Default.AreaCode != null &&
           oConnectors.Default.AreaCode.length > 0)
        {
            CopyModemSettings(oConnectors.Default, oNewModem);
        }
        else
        {
            for(var iConn=0; iConn < oConnectors.Count; iConn++)
            {
                if(oConnectors.item(iConn).DeviceType.toLowerCase() == "modem" &&
                   oConnectors.item(iConn).DeviceName != oNewModem.DeviceName &&
                   oConnectors.item(iConn).AreaCode != null &&
                   oConnectors.item(iConn).AreaCode.length > 0)
                {
                    CopyModemSettings(oConnectors.item(iConn), oNewModem);
                    break;
                }
            }
        }
    }
    catch(e)
    {
        MarsLog("PopulateNewModemSettings() -- Exception thrown: " + e, true);
    }
}

function CopyModemSettings(oSrcModem, oDestModem)
{
    //Copy basic dialing properties.
    oDestModem.DialingPrefix = oSrcModem.DialingPrefix;
    oDestModem.CallWaitingPrefix = oSrcModem.CallWaitingPrefix;
    oDestModem.AreaCode = oSrcModem.AreaCode;
    oDestModem.Exchange = oSrcModem.Exchange;
    oDestModem.DialingFlags = oSrcModem.DialingFlags;
    
    //Copy poptimization info (including phone book).  PopC may not be initialized yet, that's OK.
    try
    {
        var oPopc = oMarsSignup.Poptimize;
        if(oPopc != null)
        {
            var oPopEntries = oPopc.GetPopEntries(oSrcModem);
            oPopc.SetPopEntries(oDestModem, oPopEntries, false);
        }
    }
    catch(e)
    {
    }
}

function StoreCurrentConnector()
{
    try
    {
        // only set it once
        if (oMarsSignup.Connector != null)
            return;

        oMarsSignup.Connector = oConnectors.Default;
    }
    catch(e){}
}

function setOnlyConnectorAsDefault(sDeviceType)
{
    //Assumes that connectors have been setup.  Returns false if we
    //can't find any connectors corresponding to the device.

    for(var iConn = 0; iConn < oConnectors.Count; iConn++)
    {
        if(oConnectors.Item(iConn).DeviceType.toLowerCase() == sDeviceType)
        {
            //Set this connector to be the default for future sessions.
            oConnectors.Default = oConnectors.Item(iConn);

            if(sDeviceType == "modem")
            {
                //Use this connector as default in IE.  We don't want
                //to do this for LAN because it would turn off IE
                //dialing the default connector for 3rd party ISPs.
                MarsLog("Setting Connector to Default: " + oConnectors.Default.DeviceName, true);
                oConnectors.Default.SetAsDefault(true);
            }

            return true;
        }
    }

    return false;
}

function isIAUserPresent()
{
        return( oMarsSignup.IsAccountInfoConfigured() );
}

function setupForModem()
{
    refreshLMObjects();

    //Add connectors for all devices on the system.
    AddConnectors();

    var nModems = ModemCount();

    //Go to choose modem page if the user has more than one modem
    //(driver) installed.
    if(nModems == 0)
    {
        ShowErrorMessage("MSN Explorer","No modems detected, please install a modem before continuing.");
        //!!Continue to LAN?
        return;
    }
    else if(nModems == 1)
    {
        setOnlyConnectorAsDefault("modem");
        window.location.href = "dialOptions.htm";
    }
    else
    {
        window.location.href = "setDevice.htm";
    }
}


function ModemCount()
{
    var i;
    var iModemCount = 0;

    var oDevices = oLM.ConnectorDeviceEnum;
    oDevices.GatherDeviceInfo();

    for(i=0;i<oDevices.GetNumDevices();i++)
    {
        if( oDevices.GetDeviceType(i).toLowerCase() == "modem" )
        {
            iModemCount++;
        }
    }

    return iModemCount;
}

function VisuallyFormatConnector(oConnector)
{
    if(oConnector.DeviceType.toLowerCase() == "modem")
    {
        //For modem we would use the FormattedPhoneNumber property but
        //we want to add spaces and stuff.
        return VisuallyFormatNumber(oConnector.PhoneNumber, oConnector.DialingFlags);
    }
    else if(oConnector.DeviceType.toLowerCase() == "lan")
    {
        return "Broadband or Manual Connection";
    }
}

function VisuallyFormatNumber(sTenDigitNumber, nDialingFlags)
{
    //Use this whenever we want to show a number EXACTLY how it will
    //be dialed.  (Uses the same logic as the Modem Connector setting
    //up the number for dialing.)
    //
    //Splits the 10-digit number into a visually readable phone number, ie:
    //    #70 9, (206)889-3301

    var sPhoneNumber = "";

    if(nDialingFlags & DIALFLAG_CALLWAITING)
        sPhoneNumber += oConnectors.Default.CallWaitingPrefix + "&nbsp;";
    if(nDialingFlags & DIALFLAG_OUTSIDELINE)
        sPhoneNumber += oConnectors.Default.DialingPrefix + "&nbsp;";
    if(nDialingFlags & DIALFLAG_LONGDISTANCE)
        sPhoneNumber += "1&nbsp;";
    if(nDialingFlags & DIALFLAG_TENDIGITDIALING)
        sPhoneNumber += sTenDigitNumber.substr(0,3) + "&nbsp;";

    sPhoneNumber += sTenDigitNumber.substr(3,3) +"-"+ sTenDigitNumber.substr(6);

    return sPhoneNumber;
}

function noPops(fCheck)
{
//this will increment a reg key if no pops are found on the editpop page.

    if(typeof(fCheck) == "undefined")
        fCheck = false;

    if( !bool_AddPopTrigger() )
    {
        ShowErrorMessage ("MSN Explorer","There are no number provided for MSN Internet Access in your area at this time. Please verify that your phone number is correct.");

        if(!fCheck) //fCheck = settingsd
        {
            location.href = "wherenow.htm";
        }
        return;
    }
    else
    {
        if(fCheck) //fCheck = settingsd
            location.href = "editPops.htm?addPopcheck";
        else
            location.href = "editPops.htm?addPop";
    }
}

function bool_AddPopTrigger()
{
//function will return true if Zero pop reg value == 2
//will increments zeropopregkey if exists or set ir not exists
    var MSNRegKey = oMarsSignup.RegKey;
    var iZeroPopCount;

    MSNRegKey.Init("HKCU","Software\\Microsoft\\MSN6\\Signup",true);
    iZeroPopCount = parseInt( MSNRegKey.ReadValue("ZeroPopCount") );

    if( isNaN(iZeroPopCount) )
    {
        MSNRegKey.WriteValue("ZeroPopCount",1);
    }
    else
    {
        if(iZeroPopCount == 2)
        {
            //reset value
            MSNRegKey.WriteValue("ZeroPopCount",1);
            return true;
        }
        else
        {
           //increment value
           iZeroPopCount++;
           MSNRegKey.WriteValue("ZeroPopCount",iZeroPopCount);
        }
    }
    return false;
}

function TurnOffICW()
{
    var MSNRegKey = oMarsSignup.RegKey;
    MSNRegKey.Init("HKCU","Software\\Microsoft\\Internet Connection Wizard",true);
    MSNRegKey.WriteBinaryValue("Completed","01000000");
}

function AnyAccessibleSetting()
{
    //returns true if accessability
    return oUtils.isScreenReaderActive || oUtils.isHighContrastMode || oUtils.isLargeFontMode;
}


function HideNote()
{
    if( typeof(oNote) == "object" )
    {
        oNote.style.visibility = "hidden";
    }
}

function docKeyDown()
{
    var nKey = event.keyCode;
    HideNote();
    //handleTabFrom(); //custom tab handler : stubbed out offline
    switch(nKey)
    {
        case 13 : //ENTER : handle enter key as next
            switch (event.srcElement.tagName)
            {
                //  these guys will do the right thing with the enter key
                case "BUTTON":
                case "A":
                    break;

                default:                  
                    if(typeof(oFS) == "object")
                    {
                        event.cancelBubble = true;
                        event.returnValue = false;
                        oFS.btnNext.click();
                    }
                    break;
            }
            break;
        case 71 :
            if(event.ctrlKey && event.altKey && isDebug())
            {
                goThere();
            }
            break;
        case 78 :
            if(event.ctrlKey && event.shiftKey)
            {
                location.href = "editPops.htm?addPop";
                break;
            }
            break;
        case 27 : //
        case 121 :
            if(event.ctrlKey && event.altKey && isDebug())
            {
                window.location.href = "settingsd.htm";
            }
            break;
            
        case 120 :
            if(event.ctrlKey && isDebug())
            {
                setSignupUrl();
            }
            break;

        case 8 : //BACKSPACE
            switch (event.srcElement.tagName)
            {
                case "TEXTAREA":
                    return true;
                
                case "INPUT":
                    switch (event.srcElement.type)
                    {
                        case "text":
                        case "password":
                            return true;
                    }
            }
            event.cancelBubble = true;
            event.returnValue = false;
            return false;
            
        case 78 : //CTRL-N
            if(event.ctrlKey && event.shiftKey)
            {
                location.href = "editPops.htm?addPop";
                break;
            }
            if (event.ctrlKey) {
                event.cancelBubble = true;
                event.returnValue = false;
            }
            break;
        case 83: //s
            if(event.ctrlKey && event.altKey && isDebug())
                {
                    location.href = "signupServer.htm";
                }
            break;
    }
    //Check for debug script and call it
    if(typeof(dbgKey) == "function")
        dbgKey();
}
function docOnClick()
{
    //document.onclick handle.
}

function docOnHelp()
{
    showHelpEx("signuphelp", true);
}


function goThere()
{
    try{
    var i;
    var sDefault="";

    sDefault += "file://C:/src/mars/mars/setup/sgen" + window.location.href.substr( window.location.href.lastIndexOf("/") )

    var sNavto = prompt("Gowhere?",sDefault);

    sNavto = trim(sNavto);

    window.location.href = sNavto;

    }catch(e){ }

}
function selFocus(oDivElement,fFocus)
{
//*******************************************
//* Focus on a slecect box is non existent if blank.
//* send selFocus div element and function will
//* show focus on a select box.
//* byref oDivElement
//              [in] The name of the div element around select box
//* byref fFocus
//              [in] focus flag, set to true if showing focus.
//  dependant on style class selFocus
//* SAMPLE:
//*******************************************

    if(typeof(oDivElement) != "object")
        return;

    if(fFocus)
        oDivElement.style.border="1 solid gray";
    else
        oDivElement.style.border="1 solid #D6DBEF";

}

function formReset()
{
    return false;
}

function formKeyPress()
{
    //prevent the form from recieving the submit without a submit element (causes the error !DING!);
    if(event.keyCode == 13) //Enter
    {
        switch (event.srcElement.tagName)
        {
            //  these guys will do the right thing with the enter key
            case "BUTTON":
            case "A":
                break;

            default:
                oFS.btnNext.click();
                return false;
        }
    }
}

function OnReadyStateChanged()
{
//*******************************************
//* Capture document state and Initilize page when
//* document is complete.
//* Sets event handlers for certail objects
//*******************************************
    var loc;
    var fOobe;
    db = document.body;
    db.tabIndex = -1;
    scrnWd = db.clientWidth;
    if(scrnWd >= 700)
    {
        giSrcStyle = 800;
    }
    else
    {
        giSrcStyle = 640;
        lnk0.href = "global640.css";
    }


    if (document.readyState == "complete")
    {
        //* Activate Global events on complete *//

        //Setup busy graphic
        if(typeof( tdnav1 ) == "object")
            tdnav1.innerHTML = g_strWait;

        //** Detect the screen mode so we can align page.
        if(typeof(scrnWd) == "undefined")
            scrnWd = db.clientWidth;

        setTimeout("setDiv0TabOrder()", 10);

        if(typeof(oFS) == "object")
        {
            oFS.onreset = formReset;       //disable form resets
            oFS.onkeypress = formKeyPress; //handle form keypress
            if(typeof(oFS.btnNext) == "object")
            {
                oFS.btnNext.onclick = nav;
                oFS.btnNext.hideFocus = true;
                oFS.btnNext.onpropertychange = checkBtnState;
                oFS.btnNext.innerHTML = g_sContinueButtonHTML;//set button text
                oFS.btnNext.accessKey = g_sContinueButtonKey; //set button shortcut
            }

            if(typeof(oFS.btnBack) == "object")
            {
                oFS.btnBack.onclick = nav;
                oFS.btnBack.hideFocus = true;
                oFS.btnBack.onpropertychange = checkBtnState;
                oFS.btnBack.innerHTML = g_sBackButtonHTML;
                oFS.btnBack.accessKey = g_sBackButtonKey;
            }

        }

        //show the tbl0 object that wraps all the content for resizing purposes.
        //(remove this and set to 640 by 480 and you get a nice shif.)
        if(typeof( tbl0 ) == "object")
            tbl0.style.visibility = "visible";

        safeFocus(document.body, false);

        if( typeof( Init ) == "function" ) //lets make sure Init function exists.
        {
            Init();
        }

        if (typeof(imgBrand) == "object")
        {
            imgBrand.title = BrandString(irgISPNAME);
        }

        setDiv0Title();

        busyOff();
    }
        try {
                if (!(oUtils.isHighContrastMode || oUtils.isScreenReaderActive))
                {
                        //do acccessability customization stuff here if needed..
                }
        }catch(e){}

}

function setDiv0TabOrder()
{
    //trick to set div tabIndex only if scroll bar showing.
    if( typeof( div0 ) == "object")
    {
        div0.doScroll("scrollbarDown");
        if(div0.scrollTop > 0 )
            div0.tabIndex = 43;
        div0.doScroll("scrollbarPageUp");
    }
}

function setDiv0Title()
{
    //  This gives our overflow div areas a sensible title for screen readers.
    //  If it has a title already, we assume that Init() took care of it.
    if ((typeof(div0) == "object") && ((div0.title == "") || (div0.title == null)))
    {
        var i;
        var oNode = div0.firstChild;

        for (i = 0; ((i < 10) && (typeof(oNode) == "object")); i++)
        {
            if ((oNode.tagName == "SPAN") && (oNode.className == "head"))
            {
                div0.title = oNode.innerText;
                break;
            }
        }
    }
}


function validChars(szValue, cszValidChars){
//'------------------------------------------------------------------------------
//' validates a char string.
//'
//'     byref szValue
//'             [in] String of value that is to be challenged.
//'     byref cszValChars
//'             [in] String of only valid characters that can be used.
//'     return
//'             true  : if there are no invalid chars in string
//'     false : if string contains invalid chars.
//'------------------------------------------------------------------------------
    var x,szKeyValue;
    try
    {
        for( x=0;x < szValue.length;x++ )
        {
                szKeyValue = szValue.substring(x,x+1);
                if ( ( String(cszValidChars).toLowerCase() ).indexOf( String(szKeyValue).toLowerCase() ) == -1)
                        return false;
        }
        return true;
    }
    catch(e)
    {
        return false;
    }
}

function positionNavBar()
{
    //Depricated function
}

function stub()
{
    oFS.btnNext.click();
    return false;
}

function putIt(sAttribute,sValue)
{
    /* offline.. stubbed out.
    */
}

function getIt(sAttribute)
{
    /* offline.. stubbed out.
    */
}

function saveIt()
{
    //oUD.save("sUsrData") //offline stubbedout
}

function enableBack(fVal)
{
    if(typeof(oFS) != "object")
        return;
    else if(typeof(oFS.btnBack) != "object")
        return;

    if(fVal)
    {
        //doing this because when button disabled, properychanges don't register
        oFS.btnBack.disabled = false;
        oFS.btnBack.enabled = true;
    }
    else
    {
        oFS.btnBack.enabled = false;
    }
}
function enableNext(fVal)
{
    if(typeof(oFS) != "object")
        return;
    else if(typeof(oFS.btnNext) != "object")
        return;

    if(fVal)
    {
        //doing this because when button disabled, properychanges don't register
        oFS.btnNext.disabled = false;
        oFS.btnNext.enabled = true;
    }
    else
    {
        oFS.btnNext.enabled = false;
    }
}
function checkBtnState()
{
//** if enabled = true then button is active

    var oE = event.srcElement;
    if(event.propertyName == "enabled")
    {
        if(!oE.enabled)
        {
            oE.className = "disabled";
            if(oE.id=="btnNext")
            {
                oFS.imgNext.src = "msn://@signup.mar@/cn_adright.gif";
            }
            if(oE.id=="btnBack")
            {
                oFS.imgBack.src = "msn://@signup.mar@/cn_adleft.gif";
            }
            oE.disabled = true;

        }
        else
        {
            oE.className = "nav";
            if(oE.id=="btnNext")
            {
                oFS.imgNext.src = "msn://@signup.mar@/cn_aright.gif";
            }
            if(oE.id=="btnBack")
            {
                oFS.imgBack.src = "msn://@signup.mar@/cn_aleft.gif";
            }
            oE.disabled = false;
        }
    }
}

function CancelSignup()
{
   var DATAID_SIGNUP_CANCEL_PAGEID = 224;
   oMarsSignup.OnSignupCancelled();
}

function MarsLog(szMsg, fMonitor)
{
    if (!fMonitor || szMsg == null || szMsg.length == 0)
        return;
    try
    {
                // TraceLog uses a static buffer of size 255.  We will call it in chunks
                var MAX_BUFF_SIZE = 255;
                var i = 0;
                var strTemp = "";
                while(szMsg.length > MAX_BUFF_SIZE)
                {
                    strTemp = szMsg.substr(0, MAX_BUFF_SIZE);
                    oUtils.TraceLog(0, strTemp);
                    i += MAX_BUFF_SIZE;
                    szMsg = szMsg.substr(i);
                    i = 0;
                }
                oUtils.TraceLog(0, szMsg);
    }
    catch(e){}
}

function displayNote(oElement, sNoteSubject, sNoteText, iPointLeftValue, iMaxWidth, fShowSelects, fBelow){
                var itop;
                var ileft;
                var size;
                var sName;
                var oItem;
                var iMaxHeight;
                var iWidthIncrement;
                var iMinWidth;
                var i;


                if (AnyAccessibleSetting())
                {
                    ShowErrorMessage (sNoteSubject, sNoteText, false)
                    return;
                }


                if(typeof(oNote)!='object')
                        return;

                oItem = oElement;

                if(typeof(oItem)!="object")
                        return;

                if(typeof(fShowSelects)=="undefined")
                        fShowSelects=false;

                if(typeof(fBelow)=="undefined")
                        fBelow=false;


                if(isNaN(iMaxWidth))
                        iMaxWidth = 200;

                iWidthIncrement = 10;
                iMaxHeight = 80;
                iMinWidth = 50;
                itop = 0;
                ileft = 0;
                iheight = 0;

                oNote.style.display = "none";
                oNote.style.visibility = "hidden";
                noteSubject.innerHTML = "";
                noteText.innerHTML = "";

                noteSubject.innerHTML = sNoteSubject;
                noteText.innerHTML = sNoteText;

                oNote.style.display = "inline";

                i=0;
                while(oNote.offsetHeight > iMaxHeight){
                        oNote.style.posWidth += iWidthIncrement;
                        i++;
                        if(i > iMaxHeight)
                                break;
                }

                if(oNote.offsetHeight <= iMaxHeight){
                        oNote.style.posWidth = noteText.offsetWidth + 35;
                }

                i=0;
                while(oNote.offsetWidth > iMaxWidth && oNote.offsetWidth > iMinWidth){
                        oNote.style.posWidth -= iWidthIncrement;
                        i++;
                        if(i > iMaxWidth)
                                break;
                }

                itop = oItem.offsetHeight;
                iheight = itop;

                i=0;
                while (oItem.tagName != "BODY" ){
                        itop  += oItem.offsetTop;
                        ileft += oItem.offsetLeft;
                        oItem = oItem.offsetParent;
                        i++;
                        if(i > 2000)
                                break;
                }


        oNote.style.left = ileft +"px";
                if(!fBelow)
                {
                    oNote.style.top  = (itop - oNote.offsetHeight - (iheight-5)) + "px";
                    notePntDwn.style.display = "inline";
                    noteImgUp.style.display = "none";
                }
                else
                {
                oNote.style.top  = (itop - 5) + "px";
                    notePntDwn.style.display = "none";
                    noteImgUp.style.display = "inline";
        }

                if(!isNaN(iPointLeftValue))
                        notePntDwn.style.left = iPointLeftValue;
                else
                        notePntDwn.style.left = 30;


                oNote.style.visibility='visible';
      return;
}

function ltrim(strValue) {
    var i = 0;
        while (strValue.charAt(i) == ' ') {i++;}
        return strValue.slice(i);
}
function rtrim(strValue) {
    var i = strValue.length - 1;
        while (strValue.charAt(i) == ' ') {i--;}
        return strValue.slice(0, i + 1);
}
function trim(strValue) {
    if(typeof(strValue) == "undefined" || strValue=="")
        return("");
        return ltrim(rtrim(strValue));
}

function OnNewIFrameReady()
{
    fPageloaded = true;
    OpenPage();
    busyOff();

}

function addDbgScript()
{
    var oDS = document.createElement("SCRIPT")
    oDS.language="jscript";
    oDS.src="debug.js";
    db.appendChild(oDS);
}

function setNewTitle(sNewTitle, oSpanHead, oDiv0)
{
    document.title = sNewTitle;

    if (typeof(oSpanHead) == "object")
    {
        oSpanHead.innerText = sNewTitle;
    }

    if (typeof(oDiv0) == "object")
    {
        oDiv0.title = sNewTitle;
    }
}

//  Attempt to set the focus to an element.  If for some reason that pukes (visibility problems, whatever),
//  we allow for a retry if bTrySlippingTheClutch is true.
function safeFocus(oElem, bTrySlippingTheClutch)
{
    if (typeof(oElem) == "object")
    {
        try
        {
            oElem.focus();
        }
        catch (e) 
        {
            if (bTrySlippingTheClutch)
            {
                setTimeout("safeFocus(document.all." + oElem.uniqueID + ", false)", 200);
            }
            else if (oElem != document.body)
            {
                //  don't go without focus at all
                safeFocus(document.body, false);
            }
        }
    }        
}

function deferredFocus(oElem)
{
    setTimeout("safeFocus(document.all." + oElem.uniqueID + ", false)", 200);
}

function toggleEnable()
{
    var db = document.body;
    var oE;
    for(x=0;x < db.children.length;x++)
    {
        oE = db.children(x);
        if(oE.tagName == "BUTTON" && (oE.className=="nav" || oE.className=="disabled"))
        {
            if(db.children(x).dataFld == "true")
            {
                db.children(x).disabled = false;
                db.children(x).dataFld = "false";
            }
            else
            {
                db.children(x).dataFld = "true";
                db.children(x).disabled = true;
            }
        }
    }
}

function wait()
{
    window.setTimeout(gsWait,80);
}

function busyOn()
{
    if(typeof ( divBusy ) != "object")
        return;

    if(giWait == 0)
    {
        giWait++;
        divBusy.style.display = "inline";
        if (oUtils.isScreenReaderActive)
        {
            safeFocus(divBusy, true);
        }

        wait();
    }
    else
    {
        giWait++;
    }
}

function busyOff()
{
    if(typeof ( divBusy ) != "object")
        return;

    if(giWait > 0)
        giWait--;

    if(giWait <= 0)
    {
        divBusy.style.display="none";
        giWait=0;
    }
}


function stripCharsNotInBag (s, bag)
{
    var i;
    var returnString = "";
    for (i = 0; i < s.length; i++)
    {
        var c = s.charAt(i);
        if (bag.indexOf(c) != -1) returnString += c;
    }
    return returnString;
}

function SZ(item)
{
    return (item);
}

function setSignupUrl()
{
    var sRealURL = fullSignupUrl();
    var sNewURL = oMarsSignup.GetProperty("NewSignupUrl");
    var sCurrentUrl="";
    var sUrl = "";

    if(sNewURL != "")
    {
        sUrl = prompt("Mr Utility: Custom URL: Blank entry to revert to normal url.", sNewURL )
    }
    else
    {
        sUrl = prompt("Mr Utility: Real SignupURL : Change entry and press ok to set new URL.", sRealURL )
    }

    if( sUrl != sRealURL && sUrl != "")
        oMarsSignup.PutProperty("NewSignupUrl",sUrl);
    else
        oMarsSignup.PutProperty("NewSignupUrl","");

}

function fullSignupUrl()
{
//returns fullsignupurl including campaign codes.

    var sUrl = oMarsSignup.signupUrl;
    var sVal = new Array();
    var sTemp="";
    var x = 0;
    var MSNRegKey = oMarsSignup.RegKey;
    var sQString;
    var sKey = "MSN";

    try{

        MSNRegKey.Init("HKLM","Software\\Microsoft\\MSN6\\Setup\\"+ sKey +"\\Codes",false);
        sVal[x] = MSNRegKey.FirstValueName();
        if (sVal[x] == "")
            //if no codes exist, return value from msnsu.ini file.
            return sUrl;
        else
        {
            while(sVal[x] != "")
            {
                x++;
                sVal[x] = MSNRegKey.NextValueName();
            }
            sQString = "";

            //construct querystring with key-value pairs.
            for(y=0;y<x;y++)
            {
                sQString += sVal[y] +"="+ escape( MSNRegKey.ReadValue(sVal[y]) ) +"&"
            }

            //attach all parts together.
            sUrl += "default.asp?" + sQString;
        }

    }catch(e){ } //catch any errors and default to idMarsSignup.signupUrl
    return sUrl;
}
function NavToServerPage (szPage)
{
    //used to nav from client to server...:-)
    Inframe1.location.href = szPage;
    cWait = 0;
    fPageLoaded = false;    
    WaitForPage();
}
function OpenPage()
{
    //used once the server page is available.
    document.all.Inframe1.style.display = "inline";
    document.all.Inframe1.style.width = db.clientWidth;
    document.all.Inframe1.style.height = db.clientHeight;
    document.all.Inframe1.focus();
    document.body.tabIndex = -1;
    fPageLoaded = true;

    div0.innerHTML = "";
}

function WaitForPage()
{
    if (fPageLoaded)
    {
        return;
    }

    cWait++;
    if (cWait > 180)
    {
         oDatastore.Set(DATAID_SIGNUP_STATUS, DATAKEY_SIGNUP_FAIL_NOSERVER);
        
         var iRet = ShowErrorMessage(/* locstart signup.server.notconnecting.subject/leave space at end, branded name (MSN) is appended */"Unable to contact "/* argstart signup.brand */ + BrandString(irgISPSHORTNAME) + /* argend */ "" /* locend */  ,
                                      /* locstart signup.server.notconnecting.text/eplain to the user that we cannot contact our servers */"Our servers may be too busy or you are not connected to the Internet. Please make sure that your Internet connection is working. Do you want to try again?"/* locend */
                                      ,true
                                      ,688
                                      ,""
                                      ,MB_YESNO
                                      );
         if ( iRet == IDYES )
         {
             cWait = 0;
             window.setTimeout("WaitForPage()", 500, "jscript");
         }
         else
         {
            CancelSignup();
         }
    }
    else
    {
        window.setTimeout("WaitForPage()", 500, "jscript");
    }
}


function ShowErrorMessage (szMsgTitle, szErrMsg, fMonitor, nError, szHelpURL, lFlags )
{
   var szMsg = szMsgTitle + " " + szErrMsg;
   var lRet = 0;
   MarsLog(szMsg, fMonitor);

   if(isNaN(lFlags))
      lFlags = 0;

   if(isNaN(nError))
      nError = 0;

   if(typeof(szHelpURL) == "undefined")
        szHelpURL = "";

   lRet = oMarsSignup.ShowError(nError, szMsgTitle, szErrMsg, szHelpURL, lFlags);

   return lRet;

}

function isDebug()
{

try{
    if( fullSignupUrl().toLowerCase().indexOf("msn") > -1 )
        {
            return false;
        }
    else
        {
            return true;
        }
}catch(e){} //silent fail

}

function setCollectionText(szElemName, szText)
{
    var oElements = document.getElementsByName(szElemName);

    if (null != oElements)
    {
        var i;
        var n = oElements.length;

        for (i = 0; i < n; i++)
        {
            oElements[i].innerText = szText;
        }
    }
}

function setBrandedObjects()
{
    setCollectionText("oISPName", BrandString(irgISPNAME));

//  Uncomment these as needed...
//    setCollectionText("oISPShortName", BrandString(irgISPSHORTNAME));
//    setCollectionText("oISPAAn", BrandString(irgISPAAN));
//    setCollectionText("oISPSupport", BrandString(irgISPSUPPORT));
}

function BrandString(isz)
{
   try{
      return oUtils.GetUrlFromKey(rgIdToName[isz]);
   } catch(e) {
      return "";
   }
}

// Returns template with %1-%9 replaced by arguments

function FormatMessage(template /*, ...*/)
{
    var nValues = arguments.length - 1;
    var result = "";
    var iTmpl = 0;
    var maxTmpl = template.length - 1;
    
    while (iTmpl <= maxTmpl)
    {
        var iPct = template.indexOf("%", iTmpl);
        if (iPct == -1 || iPct == maxTmpl)
        {
            result += template.substr(iTmpl);
            break;
        }

        result += template.substring(iTmpl, iPct);
        
        var param = template.substr(iPct + 1, 1);
        if (param >= "1" && param <= "9" && param <= nValues)
            result += arguments[param];
        else
            result += param;
            
        iTmpl = iPct + 2;
    }
    
    return result;
}

//</SCRIPT>
BODY
{ /*640*/
BACKGROUND-COLOR: #d6dbef;
COLOR: black;
FONT-FAMILY: verdana, tahoma;
FONT-SIZE: 10pt;
MARGIN-LEFT: 24px;
MARGIN-RIGHT: 10px;
MARGIN-TOP: 5px;
MARGIN-BOTTOM : 10px;
overflow:hidden;
}
.head 
{/*640*/
COLOR: #596BB2;
FONT-FAMILY: trebuchet ms;
FONT-SIZE: 20pt;
width : 560px;
padding-bottom:10px;
}
TD
{
COLOR: black;
FONT-FAMILY: verdana, tahoma;
FONT-SIZE: 9pt
}
div#div0
{
height:100%;
position:relative;
overflow-y:auto;
}
TABLE#tbl0
{
width:100%;
height:100%;
visibility:hidden;
}
TD#tdnav1
{
COLOR: #5a6ca2;
FONT-FAMILY: ms sans serif, tahoma;
FONT-SIZE: 9pt;
}
LABEL
{
COLOR: black;
FONT-FAMILY: verdana, tahoma;
FONT-SIZE: 9pt
}
TABLE#tblNav
{
width:560px;
}
.smallblue
{
color:#006699;
}
.fakehlink
{
color: blue;
text-decoration  : underline;
}
.spacer
{
height:20px;
}
.bluesubhead
{
COLOR: #010066;
FONT-FAMILY: trebuchet ms;
FONT-SIZE: 12pt;
FONT-WEIGHT: bold;
}

TABLE.Brand
{
WIDTH: 560px
}
DIV.navbar
{
HEIGHT: 75px;
POSITION: relative;
VISIBILITY: visible;
z-index:-1;
}
IMG#imgInfo
{
PADDING-BOTTOM: 40px;
PADDING-LEFT: 40px;
PADDING-RIGHT: 40px;
PADDING-TOP: 40px
}
IMG#imgCache
{
VISIBILITY: hidden;
z-index : -99;
width:1px;
height:1px;
}
TABLE.HR
{
BACKGROUND-COLOR: #96aadd;
HEIGHT: 1px;
WIDTH: 560px
}
.hand
{
CURSOR: hand
}
.tblPage
{
HEIGHT: 500px
}
BUTTON.nav
{
BACKGROUND-COLOR: #f4f5fb;
BACKGROUND-IMAGE: url(msn://@signup.mar@/cn_btnback.gif);
BORDER-BOTTOM: #5a6ca2 1px solid;
BORDER-LEFT: #8596ca 1px solid;
BORDER-RIGHT: #5a6ca2 1px solid;
BORDER-TOP: #8596ca 1px solid;
COLOR: #5a6ca2;
CURSOR: hand;
FONT-FAMILY: ms sans serif, tahoma;
FONT-SIZE: 9pt;
HEIGHT: 24px;
PADDING-BOTTOM: 3px;
PADDING-LEFT: 5px;
PADDING-RIGHT: 5px;
PADDING-TOP: 2px;
WIDTH: 100px;
}
BUTTON.disabled
{
BACKGROUND-COLOR: #f4f5fb;
BACKGROUND-IMAGE: url(msn://@signup.mar@/cn_btnback.gif);
BORDER-BOTTOM: #5a6ca2 1px solid;
BORDER-LEFT: #5a6ca2 1px solid;
BORDER-RIGHT: #5a6ca2 1px solid;
BORDER-TOP: #5a6ca2 1px solid;
COLOR: #a0b0c9;
CURSOR: default;
FONT-FAMILY: ms sans serif, tahoma;
FONT-SIZE: 9pt;
HEIGHT: 24px;
PADDING-BOTTOM: 3px;
PADDING-LEFT: 5px;
PADDING-RIGHT: 5px;
PADDING-TOP: 2px;
WIDTH: 100px;
}
BUTTON.nonbutton2
{
border:0;
background:transparent;
}
BUTTON.nonbutton
{
border:0;
background:transparent;
width:100%;
}
BUTTON.infobutton
{
border:0;
word-wrap:normal;
background:transparent;
text-align:left;
COLOR: #003399;
CURSOR: hand;
FONT-FAMILY: verdana, tahoma;
FONT-SIZE: 9pt;
height:40px;
}
IMG.arownext
{
LEFT: 10px;
POSITION: relative;
TOP: 2px;
}
IMG.arowback
{
LEFT: -10px;
POSITION: relative;
TOP: 2px;
}
.infotext
{
COLOR: #003399;
CURSOR: hand;
FONT-FAMILY: verdana, tahoma;
FONT-SIZE: 9pt;
MARGIN-LEFT: 10px;
height:28px;
}
DIV.controls
{
padding-left: 40px;
width:560px;
}
.radpadding
{
padding-right:15px;
}
.selfocus
{
border:1 solid #D6DBEF;
}
#divHR
{
position:relative;
height:1px;
width:560px;
background-color:#96AADD;
overflow:hidden;
}
#divBrand
{
width:560px;
text-align:right;
padding-bottom:6px;
}
SPAN#noteSubject 
{
COLOR: black;
FONT-WEIGHT: bold;
}
TD#noteContainer
{
/* locstart displaynote.stylesheet.640x480.values / This will set the text style of the displaynote - Font-size should be the only one that is really valuable. */
BACKGROUND-COLOR: #ffffe7; 
FONT-FAMILY: ms sans serif; 
FONT-SIZE: 10px;
/* locend */
}


HR
{
    margin-top  : 10px;
    height      : 1px;
    color       : rgb(195, 201, 237);
}

BODY {
       background-image: url(signuphelp_bg.gif);
       background-position: bottom right;
       background-repeat: no-repeat;
}

.title {
	COLOR: #004FD3;
	FONT-FAMILY: trebuchet ms;
	FONT-SIZE: 19pt
}

.header {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 11pt
}

.header2 {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
	FONT-WEIGHT: bold
}

TD{
	COLOR: #000000;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt
}


A {
	COLOR: #004FD3;
	CURSOR: hand;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
}

/////////////////////////////////////////////////////////////////////////////
//
// This script replaces tags within the html for branding.
// 
// oISPName      - Long name of ISP
// oISPNameAnOrA - "a" or "an" depending on locale
// oISPShortName - Short name of ISP 
// oISPSupport   - ISP support phone number
// 
// Eg. The following HTML...
//
//    <p>You're now using <span id=oISPNameAnOrA> account.</p>
//
// Will output the following if you're using MSN Internet...
//
//    You're now using an MSN Internet account.
// 
/////////////////////////////////////////////////////////////////////////////

document.onreadystatechange = OnReadyStateChanged;

var irgISPNAME      = 0;
var irgISPSHORTNAME = 1;
var irgISPAAN       = 2;
var irgISPSUPPORT   = 3;

var rgIdToName = new Array();

rgIdToName[irgISPNAME]      = "isp_name";
rgIdToName[irgISPSHORTNAME] = "isp_shortname";
rgIdToName[irgISPAAN]       = "isp_a_an";
rgIdToName[irgISPSUPPORT]   = "supportnum";

function BrandString(isz)
{
   try
   {
      return oUtils.GetUrlFromKey(rgIdToName[isz]);
   } 
   catch(e) 
   {
      return "";
   }
}

function setCollectionText(szElemName, szText)
{
    var oElements = document.getElementsByName(szElemName);

    if (null != oElements)
    {
        var n = oElements.length;

        for (var i = 0; i < n; i++)
        {
            oElements[i].innerText = szText;
        }
    }
}

function OnReadyStateChanged()
{
    if (document.readyState == "complete") 
    {
        setCollectionText("oISPName",      BrandString(irgISPNAME));
        setCollectionText("oISPNameAnOrA", BrandString(irgISPAAN) + " " + BrandString(irgISPNAME));
        setCollectionText("oISPShortName", BrandString(irgISPSHORTNAME));
        setCollectionText("oISPSupport",   BrandString(irgISPSUPPORT));
    }
}
<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">
<title>Using assistive technology to sign up</title>

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">


<p class="title">Using assistive technology to sign up</p>
<A NAME="top"></a>
<p class="header">When you sign up for MSN Explorer or <span id=oISPName>MSN Internet Access</span>, 
you will have a series of forms that give you information or ask you questions based on the 
products you're signing up for.</p>

<p>To orient yourself, you may want to review each form with the Virtual PC (JAWS) or 
MSAA mode (Window-Eyes). Then, turn off the Virtual PC or MSAA mode and tab through
the items while you complete the form.</p>

<p>Below is a table of keys you can use to get around in each form.</p>

<TABLE align="left">
<TR>
<TD Valign="top"></TD>
<TD WIDTH="500">

<table border="1" cellpadding="5" cellspacing="0" width="100%">
<TR VALIGN=TOP>
   <td width="40%"><b>Press</b></td>
    <td width="60%"><b>To</b><br></td>
  </tr>

<TR VALIGN=TOP>
    <td width="40%">TAB</td>
    <td width="60%">move to an item</td>
  </tr>
<TR VALIGN=TOP>
    <td width="40%">ARROW KEYS</td>
    <td width="60%">move between radio buttons</td>
  </tr>
 <TR VALIGN=TOP>
    <td width="40%">SPACEBAR</td>
    <td width="60%">select or clear a check box</td>
  </tr>
<TR VALIGN=TOP>
    <td width="40%">UP and DOWN ARROW KEYS</td>
    <td width="60%">move among items on a combo box list</td>
  </tr> 
  <TR VALIGN=TOP>
    <td width="40%">ALT+C</td>
    <td width="60%">continue</td>
  </tr>
<TR VALIGN=TOP>
    <td width="40%">ALT+B</td>
    <td width="60%">return to the previous page</td>
  </tr>
</table>
</p>


</BODY>

</HTML>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Requirements for MSN Broadband</TITLE>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4" tabindex=1>

<TABLE align="left">
<TR>
<TD Valign="top">
<img src="signuphelp_icon.gif" width="46" height="36"></TD>
<TD WIDTH="500">

<p class="title">MSN Broadband minimum requirements</P>
<p>
<ul>
<li>Microsoft Windows 98, Windows 98 Second Edition (SE), Windows ME, Windows 2000 or Windows XP (Microsoft Windows 95 is not supported)</li>
<li>166 MHz Pentium or equivalent processor</li>
<li>16 MB of RAM (32 MB or higher recommended)</li>
<li>Microsoft Mouse or compatible pointing device recommended</li>
<li>VGA or higher resolution graphics card</li>
<li>Minimum 800x600 resolution recommended
<li>Sound card and speakers recommended</li>
<li>Available USB or Ethernet port on the main computer (not on a hub or serial connected through other devices)</li>
<li>CD-ROM drive</li>
</p>
<p>
If you have an externally-monitored home security system, additional charges may apply for MSN Broadband installation.  If you currently have DSL service from another provider, you will need to cancel your service in order to use MSN Broadband.
</p>
<p>
Not available in all areas. Special equipment may be required. Actual speeds over DSL lines will vary depending on several factors including location of your home, computer performance and configuration, network or Internet congestion, Web sites accessed and current phone line conditions. Speed of service, uninterrupted and error free service is not guaranteed.   Some customers may require professional installation which may be obtained for an extra charge. You must additionally subscribe to MSN Internet Access in accordance with its Subscription Agreement to access the service.  A valid major credit card may be required.  If for any reason your subscription is terminated during the initial 24 month period then you will be required to return the DSL modem provided to you. 
If you do not return the modem you will be charged $150 plus applicable taxes. The current price for the unlimited MSN Broadband Internet Access Plan will be automatically charged to you beginning on the activation date and until you cancel your account or select an alternative plan.  You must be 18 years old or older.  MSN Broadband Internet Access is available only to users of Windows® 98  or later.  MSN Internet Access is available only for personal non-commercial use.  Additional terms may apply if you are a current MSN Internet Access member.  Offer expires on December 31, 2001.
Your subscription includes 10 hours per month of dialup internet access.  Local phone and/or long distance toll charges may apply for dial-up access.  It is the customer's responsibility to check with a local phone company to determine if dial-up access numbers are local.  Dial-up access in excess of 10 hours per month will be billed at the rate of $1.50/hour plus applicable taxes.  Local market network activity and capacity may affect dial-up access availability.
</p>
<p></p>

 
</TD></TR>
</TABLE>

</BODY></HTML>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Why we need to know your birthday</TITLE>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4" tabindex=1>

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif" width="46" height="36"></TD>
<TD WIDTH="500">

<p class="title">Why we need to know your birthday</P>
<p>We need to know your age if you are subscribing to <span id=oISPName>MSN Internet Access</span>&nbsp;because members of
 this service must be at least 18 years old.</p> 
<p>Also, U.S. federal law requires parental consent for the collection or posting on the 
Internet of personal information from children under the age of 13. We can 
only assign the correct type of account (adult account or child account) when we know the dates of birth for you and 
 other users in your household.</p>

 
</TD></TR>
</TABLE>

</BODY></HTML>
<html>
<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>Finding your billing account code</title>
</head>
<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>


<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">
<title>Finding your billing account code</title>
</head>
<body bgcolor="#FCFAF4" tabindex="1">
<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">

<p class=title>Finding your billing account code</p>

<p>Locate a copy of the monthly billing statement that you receive in the mail from your phone company.
Your account number is your billing telephone number followed by a 
multi-character code (often, but not always, three numbers). Your account code consists of 
the first three characters following your telephone number.</p> 

<p></p>
</body>
</html>

<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>I hear a busy signal-MSN Explorer Connection Troubleshooter</title>
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">I hear a busy signal</p>
<b>Redial the current number</b>
<BR><BR>
MSN Explorer will display a message that the line is busy. Wait a minute, and then click <b>Redial</b>.
<BR><BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Check your Connection Settings</b><BR><BR>
<OL><LI>On the sign-in screen, click <b>Connection Settings</b>.</LI><BR><BR>
<LI>Click <b>Check your dialing options</b>.</LI><BR><BR>
<li>In the <b>Check your dialing options</b> screen, select the appropriate options
 for your phone system:</LI><BR><BR>
<UL><LI>If you need to dial a number to access an outside line, click to 
select the check box next to <b>I need to dial a number to reach an outside line</b>, then type the number.</LI></UL><BR>
<UL><LI>If you have call waiting and you wish to disable it to avoid 
interrupting your Internet connection, 
click to select the check box next to <b>I need to dial a code to diable call waiting</b>, then type the code.</LI></UL><BR>
<UL><LI>If you do not have touch tone service, select <b>I do not have touch tone service</b> for <b>Type of dialing service</b>.</LI></UL><BR>
<LI>Click <b>Continue</b>.</LI><BR><BR>
<LI>Click <b>Continue</b> again on the <b>Edit your access numbers</b> screen if you are finished.</LI><BR><BR>
<LI>Try signing in again.</LI></OL>
<BR>
Did this fix the problem? If not
<BR><HR><BR>
You are experiencing a problem this Troubleshooter cannot help you solve. The network or the server you are trying to connect to might be unavailable temporarily for updates or repairs. Try waiting a while and then signing in again.
<BR><BR>
If you still encounter problems, please contact <a href="help_contact.htm"> Customer Support</a> 



<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>


</body>

</html>
<html>

<head><meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>MSN Customer Support-MSN Explorer Connection Troubleshooter</title>

<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">Contact Customer Support</p>
<b>Customer Support Telephone Number</b><BR><BR>
MSN For Compaq (800) 952-3513<BR><BR>

<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>


</body>

</html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>View your default connection settings</TITLE>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<body bgcolor="#FCFAF4" tabindex=4>

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif" width="46" height="36"></TD>
<TD WIDTH="500">

<p class="title"> To view or change your default connection settings:</p>

<ol><li><p>Click<b> Start</b>, point to <b>Settings</b>, and then <b>Control Panel</b>.</li></p>
<li><p>Double-click <b>Internet Options</b>. </li></p>
<li><p>Click<b> Connections</b>.</li></p>
<li><p>If you're using a dial-up connection, in the
<b>Dial-up settings</b> list, select the connection you want to make your default, and then click <b>Set Default</b>. </p>
<p>&ndash;or&ndash;</p>
<p>If you're using a broadband connection, click <b>LAN Settings</b> and verify that the settings are correct. 
</li></p>

<li><p>Click <b> OK</b>.</li></p>

</BODY></HTML>
<html>
<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">
<title></title>
</head>

<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script>
document.onreadystatechange = OnReadyStateChanged;

var irgISPNAME = 0;
var irgISPSHORTNAME = 1;
var irgISPAAN = 2;
var irgISPSUPPORT = 3;
var rgIdToName = new Array();
rgIdToName[0] = "isp_name";
rgIdToName[1] = "isp_shortname";
rgIdToName[2] = "isp_a_an";
rgIdToName[3] = "supportnum";

function BrandString(isz)
{
   try{
      return oUtils.GetUrlFromKey(rgIdToName[isz]);
   } catch(e) {
      return "";
   }
}

function OnReadyStateChanged()
{
    if (document.readyState == "complete") {
      document.title = BrandString(irgISPSHORTNAME) + " Customer Support-MSN Explorer Connection Troubleshooter";
      spnTxt.innerText = BrandString(irgISPNAME) + " Customers: " + BrandString(irgISPSUPPORT);
    }
}
</script>
<body bgcolor="#FCFAF4" tabindex=1>
<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">Contact Customer Support</p>
<b>Customer Support Telephone Numbers</b><BR><BR>
<span id=spnTxt>MSN Internet Access Customers: (877) 635-7019</span>
<BR><BR>
<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>


</body>

</html>
<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1"><meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<title>About child protection legislation</title>

<STYLE>

BODY {
       background-image: url(signuphelp_bg.gif);
       background-position: bottom right;
       background-repeat: no-repeat;
}

.title {
	COLOR: #004FD3;
	FONT-FAMILY: trebuchet ms;
	FONT-SIZE: 19pt
}

.header {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 11pt
}

.header2 {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
	FONT-WEIGHT: bold
}

TD{
	COLOR: #000000;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt
}


A {
	COLOR: #004FD3;
	CURSOR: hand;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
}

</STYLE>

</head>

<body bgcolor="#FCFAF4" tabindex=1>

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">About Federal child protection legislation</p>

On April 21, 2000, the Federal Trade Commission established new
rules for Web site operators and online service providers who knowingly collect
information from children under 13.

<p class="Text">These rules are part of the Children's Online Privacy Protection
Act (COPPA), which was passed by U.S. Congress in November 1998. COPPA requires
that operators of online services or Web sites obtain parental consent prior to
the collection, use, disclosure, or display of the personal information of
children.</p>
<p class="Text">The Act provides parents with specific rights regarding their
children's privacy. For additional information and resources on COPPA visit the
following links.</p>
<p class="MsoHeading8">General Info:
http://www.ftc.gov/opa/1999/9910/childfinal.htm
</p>

<p class="MsoHeading8">For Adults:
http://www.ftc.gov/kidsprivacy/adults.htm
</p>

<p class="MsoHeading8">For Kids:
http://www.ftc.gov/kidsprivacy/kidz.htm
</p>

</TD></TR>
</TABLE>

</body>

</html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>View your default connection settings</TITLE>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4" tabindex=1>

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif" width="46" height="36"></TD>
<TD WIDTH="500">

<p class="title"> To view your default connection settings:</P>

<table border="1" cellpadding="5" cellspacing="0" width="100%">
<TR VALIGN=TOP>
   <td width="40%"><b>If you're using:</b></td>
    <td width="60%"><b>Do this:</b><br><br></td>
  </tr>
<TR VALIGN=TOP>
    <td width="40%">Windows 95 or 98</td>
    <td width="60%">On the desktop, double-click <b>My Computer</b>. 
	Double-click <b>Dial-Up Networking</b>.<br><br></td>
  </tr>
<TR VALIGN=TOP>
    <td width="40%">Windows Millennium</td>
    <td width="60%">Click <b>Start</b>, point to <b>Settings</b>, then
	 <b>Control Panel</b>. Double-click <b>Dial-Up Networking</b>.<br><br></td>
  </tr>
<TR VALIGN=TOP>
    <td width="40%">Windows 2000 and above</td>
    <td width="60%">Click <b>Start</b>, point to <b>Settings</b>, 
	then <b>Control Panel.</b> Double-click <b>Network and Dial-up Connections</b>.<br><br></td>
  </tr>

</TABLE>

</BODY></HTML>
<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>MSN Customer Support-MSN Explorer Connection Troubleshooter</title>

<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">Contact Customer Support</p>
<b>Customer Support Telephone Number</b><BR><BR>
DellNet by MSN <BR><BR><BR>

<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>


</body>

</html>
<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>My modem does not detect a dial tone-MSN Explorer Connection Troubleshooter</title>

<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500"><p class="title">My modem does not detect a dial tone</p>
<b>Check your cables</b><BR><BR>
<OL><LI>If you are using an internal or external modem, make sure the "wall" or "line" end of your modem cable is connected to a telephone service jack in the wall (often called a wall jack).</LI><BR><BR>
<LI>If you are using an external modem, make sure the "phone" end of your modem cable is plugged into your telephone.</LI><BR><BR>
<LI>Make sure all cable connections are secure.</LI><BR><BR>
<LI>If you don't hear a dial tone after completing steps 1-3, please disconnect your modem cable from the computer and connect the modem cable to your telephone.  You should hear a dial tone.  If not, please contact your telephone company.</LI><BR><BR>
<LI>Try to sign in to MSN Explorer.</LI></OL>
<BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Check your modem's speaker volume</b>
<OL><LI>Click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.</LI><BR><BR>
<UL><li>In Windows 95/98/ME, double-click the <b>Modems</b> icon.</li></ul><BR>
<UL><li>In Windows 2000 and above, double-click the <b>Phone and Modem Options</b> icon, and then click the <b>Modems</b> tab.</li></ul><BR>
<LI>Click the modem you are using, and then click <b>Properties</b>.<BR><BR>
<LI>If the Speaker volume option is available, make sure it is <b><i>not</i></b> set to <b>Off</b>.<BR><BR>
<UL><li>In Windows 95/98/ME, click <b>OK</b>, and then click <b>Close</b> in the <b>Modem Properties</b> dialog box.</li></ul><BR>
<UL><li>In Windows 2000 and above, click <b>OK</b>, and then click <b>OK</b> again.</li></ul><BR>
<LI>Try to sign in to MSN Explorer.</LI></OL>


Did you hear a dial tone?<BR>
<a href="help_dialtn2.htm">Yes. What should I do next.</a>

<BR><BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Contact your telephone company or phone-system administrator</b><BR><BR>
If you do not hear a dial tone, your organization or telephone might not support this type of outside call, or might require an additional access code.
<BR><BR>
Contact your local telephone company or phone-system administrator to proceed.

<BR><BR>


<HR>
<p class="header">For more help</p>
<a href="help_contact.htm">Contact Customer Support</a>
<BR><BR>

<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>



</body>

</html>
<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>My modem does not detect a dial tone</title>
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">What type of modem do you have?</p>
There are two basic types of modems: internal and external. Please select the type you are using to connect to MSN Explorer. (If you are not sure what kind of modem you have, select Internal.)
<BR><BR>
<a href="help_interna.htm">Internal</a><BR><BR>
<a href="help_extern.htm">External</a><BR><BR>
<HR>
<p class="header">For more help</p>
<a href="help_contact.htm">Contact Customer Support</a>
<BR><BR>

<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>


</TD></TR>
</TABLE>


</body>

</html>
<html>

<head><meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>What is an e-mail name</title>
<STYLE>

BODY {
       background-image: url(signuphelp_bg.gif);
       background-position: bottom right;
       background-repeat: no-repeat;
}

.title {
	COLOR: #004FD3;
	FONT-FAMILY: trebuchet ms;
	FONT-SIZE: 19pt
}

.header {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 11pt
}

.header2 {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
	FONT-WEIGHT: bold
}

TD{
	COLOR: #000000;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt
}


A {
	COLOR: #004FD3;
	CURSOR: hand;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
}

</STYLE>

</head>

<body bgcolor="#FCFAF4" tabindex=1>

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">What is an e-mail name and why do I need one?</p>

Your e-mail name is the name you’ll use to sign in to MSN. This name provides a
secure way for you to access your Web content and account information. It is
also the address you give out to people who want to send you e-mail. <P>Your MSN
e-mail name will be in the following format: someone@msn.com.</p>
</TD></TR>
</TABLE>

</body>

</html>
<html>

<head>
<meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>My modem disconnects when I am signing in to or using MSN Explorer-MSN Explorer Connection Troubleshooter</title>
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">My modem disconnects when I am signing in to or using MSN Explorer</p>

<b>Make sure sign up is not taking too long</b><BR><BR>

Your sign up attempt will quit after a 20-minute waiting period if you are unable to make a connection. 
If the server you are trying to connect to is busy or temporarily not working, you will be unable to connect. Wait a few minutes, and then try again.
<BR><BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Make sure no one else is trying to use the same phone line</b><BR><BR>
If someone else has picked up a telephone that uses the same phone line as your modem, your connection will be interrupted. After the other person has hung up, try to reconnect to MSN Explorer. 
<BR><BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Your call waiting setting may be enabled</b><BR><BR>
If your telephone system has call waiting, you need to disable it while you are dialing MSN Explorer if you do not want to be disconnected by incoming telephone calls.<BR><BR><OL>
<LI>On the sign-in screen, click <b>Connection Settings</b>.</LI><BR><BR>
<li>Click <b>Change dialing options</b>. </LI> <BR><BR>
<LI>On the <b>Change your dialing options</b> screen, 
click to select the check box next 
to <b>I need to dial a code to diable call waiting</b> and 
then type in the code.</LI> <BR><BR>
<LI>Click <b>Continue</b>.</LI><BR><BR>
<LI>Click <b>Continue</b> again on the <b>Edit your 
access numbers</b> screen if you are finished.</LI><BR><BR>
<LI>Try signing in again.</LI></OL>
<BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Modem speed may be incorrectly set</b><BR><BR>
<p>Speed may vary depending on your phone provider connection.
Please contact your telephone company for connection speed availability.</p>

<p>To adjust the maximum speed of your modem: </p>

<OL>
<LI>Close all programs that are using the current communications port.<BR><BR>
<LI>Click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.<BR><BR>
<ul><li>In Windows 95/98/ME, double-click the <b>Modems</b> icon.</li></ul><BR>
<ul><li>In Windows 2000 and above, double-click the <b>Phone and Modem Options</b> icon, and then click the <b>Modems</b> tab.</li></ul><BR>
<LI>Click your modem to highlight it.<BR><BR>
<LI>Click the <b>Properties</b> button.<BR><BR>
<LI>	On the <b>General tab</b>, adjust the maximum speed of your modem.<BR><BR>
<ul><li>If you have a 28.8 KB modem, set the maximum speed to 19200.</li></ul><BR>
<ul><li>If you have a 33.6 KB modem, set the maximum speed to 38400.</li></ul><BR>
<ul><li>If you have a 56 KB modem, set the maximum speed to 115200.</li></ul><BR>
<ul><li>If you do not know the speed of your modem, set the maximum speed to 19200.</li></ul><BR>
<LI>	When you are finished:<BR><BR>
<ul><li>In Windows 95/98/ME, click <b>OK</b>, and click <b>Close</b>.</li></ul><BR>
<ul><li>In Windows 2000 and above, click <b>OK</b>, and click <b>OK</b> again.</li></ul><BR>
<LI>	Try to connect to MSN Explorer. </LI></OL>
<b>Note</b><BR> For more information, please contact your computer or modem manufacturer.
<BR><BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Error and flow control settings may be incorrect</b><BR><BR>
To check error and flow control settings:</font><BR><BR>
<b>In Windows 95/98/ME</b>
<OL><LI>Click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.<BR><BR>
<LI>Double-click the <b>Modems</b> icon.<BR><BR>
<LI>Select the modem you are using, and then click <b>Properties</b>.<BR><BR>
<LI>If the <b>Speaker volume</b> option is available, make sure the volume is <i><b>not</b></i> set to <b>Off</b>.<BR><BR>
Listening to the modem speaker can help you troubleshoot problems with your modem.<BR><BR>
<LI>Make sure the <b>Only connect at this speed</b> check box is not selected. <BR><BR>
<LI>Click the <b>Connection</b> tab, and then click <b>Advanced</b>. <BR><BR>
<LI>If the <b>Use error control</b> and <b>Compress data</b> settings are available, make sure they are selected, and that <b>Required to connect</b> is <i><b>not</b></i> selected.<BR><BR>
<LI>If the Use flow control and Hardware (RTS/CTS) settings are available, make sure they are selected.<BR><BR>
<LI>Select the <b>Append to log</b> check box to create a Modemlog.txt log file in your Windows folder. This is useful if you have to call Technical Support.<BR><BR>
<LI>Click <b>OK</b> twice, and then click <b>Close</b>.<BR><BR>
<LI>Try to sign in to MSN Explorer.</LI></OL><BR>

<b>In Windows 2000 and above</b><BR><BR>
<OL>
<LI>Click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.<BR><BR>
<LI>Double-click the <b>Phone and Modem Options</b> icon, and then click the <b>Modems</b> tab.<BR><BR>
<LI>Select the modem you are using, and then click <b>Properties</b>.<BR><BR>
<LI>If the <b>Speaker volume</b> option is available, make sure the volume is <i><b>not</b></i> set to <b>Off</b>.<BR><BR>
Listening to the modem speaker can help you troubleshoot problems with your modem.<BR><BR>
<LI>Click the <b>Advanced</b> tab.<BR><BR>
<LI>Click <b>Change Default Preferences</b>. <BR><BR>
<LI>Under <b>Data Connection Preferences</b>, make sure <b>Compression</b> is set to <b>Enabled</b>, and <b>Flow control</b> is set to <b>Hardware</b>.<BR><BR>
<LI>Click <b>OK</b> three times. <BR><BR>
<LI>Try to sign in to MSN Explorer. </LI></OL>
<BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Modem port settings may be incorrect</b><BR><BR>
To check your modem's port settings:</font><BR><BR>
<OL><LI>Click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.<BR><BR>
<LI>Double-click the <b>System</b> icon. <BR><BR>
<ul><li>In Windows 95/98/ME, click the <b>Device Manager</b> tab in the <b>System Properties</b> dialog box.</li></ul><BR>
<ul><li>In Windows 2000 and above, click the <b>Hardware</b> tab in the <b>System Properties</b> dialog box, and then click Device Manager.</li></ul><BR>
<LI>Double-click <b>Ports</b>.<BR><BR>
<LI>Double-click the <b>Communications Port</b> where your modem is located. <BR><BR>
If you do not know which port your modem is on, double-click <b>Modem</b> on the <b>Device Manager</b> tab or window. Select your modem and then click <b>Properties</b>. Click the <b>Modem</b> tab. This screen will tell you which communication port your modem is on. If your port is not listed, please refer to the computer manufacturer's manual or call the manufacturer's support number.<BR><BR>
<LI>Click the <b>Port Settings</b> tab.<BR><BR>
<LI>Adjust the maximum bits per second to the same speed as your modem settings. <BR><BR>
<ul><li>If you have a 28.8 KB modem, set the maximum speed to 19200.</li></ul><BR>
<ul><li>If you have a 33.6 KB modem, set the maximum speed to 38400.</li></ul><BR>
<ul><li>If you have a 56 KB modem, set the maximum speed to 115200.</li></ul><BR>
<ul><li>If you do not know the speed of your modem, set the maximum speed to 19200.</li></ul><BR>
<LI>Make sure the <b>Data Bits</b> box is set to <b>8</b>, the <b>Parity</b> box is set to <b>None</b>, and the <b>Stop Bits</b> box is set to <b>1</b>.<BR><BR>
<LI>Change the Flow Control to Hardware.<BR><BR>
<ul><li>In Windows 95/98/ME, click <b>OK</b>, and then click <b>OK</b> again. </li></ul><BR>
<ul><li>In Windows 2000 and above, click <b>OK</b>, and then close the <b>Device Manager</b> window. </li></ul><BR>
<li>Click <b>OK</b> to close the System Properties dialog box. </li> <BR><BR>
<LI>Try to sign in to MSN Explorer.</LI></OL>
<b>Note</b> <BR>For more information, please contact your computer or modem manufacturer.
<BR><BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Modem may be incompatible</b><BR><BR>
Your modem might be incompatible or might require more advanced adjustments to connect. <BR><BR>
For further assistance, please contact your computer or modem manufacturer.
<BR><BR>
<HR>
<p class="header">For more help</p>
<a href="help_contact.htm">Contact Customer Support</a>
<BR><BR>

<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>


</TD></TR>
</TABLE>


</body>

</html>
<html>

<head><meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>What is an e-mail name</title>
<STYLE>

BODY {
       background-image: url(signuphelp_bg.gif);
       background-position: bottom right;
       background-repeat: no-repeat;
}

.title {
	COLOR: #004FD3;
	FONT-FAMILY: trebuchet ms;
	FONT-SIZE: 19pt
}

.header {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 11pt
}

.header2 {
	COLOR: #004FD3;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
	FONT-WEIGHT: bold
}

TD{
	COLOR: #000000;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt
}


A {
	COLOR: #004FD3;
	CURSOR: hand;
	FONT-FAMILY: verdana, tahoma;
	FONT-SIZE: 9pt;
}

</STYLE>

</head>

<body bgcolor="#FCFAF4" tabindex=1>

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500">
<p class="title">What is an e-mail name and why do I need one?</p>

Your e-mail name is the name you’ll use to sign in to MSN. This name provides a
secure way for you to access your Web content and account information. It is
also the address you give out to people who want to send you e-mail. <P>Your MSN
e-mail name will be in the following format: someone@msn.com.</p>
</TD></TR>
</TABLE>

</body>

</html>
<html>

<head><meta HTTP-EQUIV="Content-Type" Content="text/html; charset=iso-8859-1">
<title>Check the power to your modem</title>
<link rel="stylesheet" type="text/css" href="msn://@signup.mar@/help.css">

</head>

<!-- Bring in the branding substitution jscript --!>
<object classid="clsid:1745EDC4-CDCE-4e20-B91E-312F0C2AD16B" id="msncf" height="0" width="0" style="display:none"></object>
<div id="oUtils" style="behavior:url(#msncf#utilities);display:none"></div>
<script src=helputils.js></script>
<!------------------------------------------------!>

<body bgcolor="#FCFAF4">

<TABLE align="left">
<TR>
<TD Valign="top"><img src="signuphelp_icon.gif"></TD>
<TD WIDTH="500"><p class="title">Check the power to your modem</p>
<ol><li>While your computer is running, turn off your modem, and then turn it on again.</LI><BR><BR>
<li>Try to connect to MSN Explorer.</LI></OL>

<BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Modem may need to be reinstalled</b><BR><BR>
<b>Important Note</b><br> You must have your modem installation disk available, or you need to contact your modem's manufacturer to complete this step.<BR><BR>

<b>Uninstall and reinstall your modem</b><BR><BR>

<OL><LI>	Click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.</LI><BR><BR>
<ul><li>In Windows 95/98/ME, click the <b>Modems</b> icon.</li></ul><BR>
<ul><li>In Windows 2000 and above, click the <b>Phone and Modem Options</b> icon, and then click the <b>Modems</b> tab.</li></ul><BR>
<LI>	Click the modem you are trying to use to sign in to MSN Explorer, and then click <b>Remove</b>.<BR><BR>
<ul><li>In Windows 95/98/ME, click <b>Close</b>. </li></ul><BR>
<ul><li>In Windows 2000 and above, click <b>OK</b>.</li></ul><BR>
<LI>	Close all open programs. <BR><BR>
<LI>	Click the <b>Start</b> button, and then click <b>Shut Down</b>.<BR><BR>
<LI>	In the <b>Shut Down Windows</b> box, click <b>Shut down</b>, and then click <b>OK</b>.<BR><BR>
<LI>	When the screen says it is safe to turn off your computer, do so for a few seconds, and then turn the computer back on. <BR><BR>
<LI>	Once your computer has restarted, click the <b>Start</b> button, point to <b>Settings</b>, and then click <b>Control Panel</b>.<BR><BR>
<ul><li>In Windows 95/98/ME, click the <b>Modems</b> icon.</li></ul><BR>
<ul><li>In Windows 2000 and above, click the <b>Phone and Modem Options</b> icon, and then click the <b>Modems</b> tab.</li></ul><BR>
Windows will automatically detect some modems. If your modem is already displayed in the list, skip to step 9. If not, continue with step 8.<BR><BR>
<LI>	Click <b>Add</b>, and then follow the steps for installing a modem.<BR><BR>
<LI>	Try to sign in to MSN Explorer.<BR><BR></LI></OL>
<b>Note</b> <br>For more information, please contact your computer or modem manufacturer. <BR><BR>


<BR><BR>
Did this fix the problem? If not
<BR><HR><BR>
<b>Modem may be incompatible</b><BR><BR>
Your modem might be incompatible or might require more advanced adjustments to connect. <BR><BR>
For further assistance, please contact your computer or modem manufacturer.
<BR><BR>

<HR>
<p class="header">For more help</p>
<a href="help_contact.htm">Contact Customer Support</a>
<BR><BR>

<HR>
<p><a href="help_trouble.htm">Return to the <b>MSN Explorer Connection Troubleshooter</b></a></p>
</TD></TR>
</TABLE>




</body>

</html>
GIF89a