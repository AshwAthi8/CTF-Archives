-right : 33px;
margin-bottom : 0px;
}
</STYLE>
<OBJECT ID="pchealth" name="pchealth" classid="CLSID:FC7D9E02-3F9E-11d3-93C0-00C04F72DAF7"></OBJECT>
<script id="idScript1" name="idScript1" LANGUAGE="Javascript" SRC="../../Common/Constants.js"> </script>
<script id="idScript2" name="idScript2" LANGUAGE="Javascript" SRC="../../Common/Common.js"> </script>
<script id="idScript3" name="idScript3" Language=JavaScript>
var oChannel = null;
var oRCSession = null;
var sSalemID = "";
var oSmapi = null;
var tempStore=null;
var tempPassStatus=null;
var tempTime=null;
var ResendFlag=false;
var sIP = "";
var sMethodFile = "File";
var sTo = null;
var sFrom = null;
var sMsg = null;
var iExpirySaveFile=null;
var sFileLoc=null;
var sVendorID = "CN=Microsoft Corporation,L=Redmond,S=Washington,C=US";
var sProductID = "Microsoft Remote Assistance";
var g_bRAStart = null;
var g_sTicket =null;
var DESKTOPSHARING_DEFAULT = 0x0000;
var NO_DESKTOP_SHARING = 0x0001;
var VIEWDESKTOP_PERMISSION_REQUIRE = 0x0002;
var VIEWDESKTOP_PERMISSION_NOT_REQUIRE = 0x0004;
var CONTROLDESKTOP_PERMISSION_REQUIRE = 0x0008;
var CONTROLDESKTOP_PERMISSION_NOT_REQUIRE = 0x00010;
var INCIDENTSTATUS_EXPIRED = 0;
var INCIDENTSTATUS_OPEN = 1;
var INCIDENTSTATUS_IPCHANGED = 2;
function OnLoad()
{
;
;
}
function DoUnload()
{
;
try
{
if (oSmapi != null)
{
oSmapi.Logoff();
}
}
catch(error)
{
alert(L_RCCTL_Text);
return;
}
;
}
function GetIPAddress()
{
try
{
;
if (sIP == "")
{
var ip;
var oSetting = new ActiveXObject("rcbdyctl.setting");
ip = oSetting.GetIPAddress;
if (ip != null && ip.length > 0 && ip != "0.0.0.0")
{
sIP = ip;
}
}
return sIP;
}
catch(error)
{
throw error;
}
finally
{
;
}
}
function SwitchToOfflinePage()
{
try
{
;
var sURL = "hcp://CN=Microsoft%20Corporation,L=Redmond,S=Washington,C=US/Remote%20Assistance/Escalation/Common/rcscreen3.htm";
idSrc.location.href = "hcp://system/errors/Connection.htm?online_url=" + sURL + "&topic_title=&topic_intro=&offline_url=";
}
catch(error)
{
throw error;
}
finally
{
;
}
}
function SaveLocalReference(oInc, XMLFile, bSaveAsFile)
{
try
{
;
oInc.Misc("IP") = sIP;
oInc.Misc("Status")= INCIDENTSTATUS_OPEN;
if (bSaveAsFile)
{
oInc.Misc("Method") = sMethodFile;
}
oInc.GetXML(XMLFile);
}
catch(error)
{
throw error;
}
finally
{
;
}
}
function InitRAIncident(iDuration, sUserName, sMsg, sPass)
{
;
var strError = null;
var oRAIncident = null;
try
{
if (iDuration == null)
iDuration = 0;
if (sUserName == null)
sUserName = "";
if (sMsg == null)
sMsg = "";
if (sPass == null)
sPass = "";
if (oChannel == null)
{
strError = L_NOCHANNEL_Text;
oChannel = pchealth.CreateObject_Channel(sVendorID, sProductID);
strError = null;
}
strError = L_NORCSESSION_Text;
oRAIncident = pchealth.CreateObject_RemoteAssistanceIncident("", iDuration, sUserName, sMsg, sPass);
strError = null;
if (sPass.length > 0)
{
var sTicket = oRAIncident.RcTicket;
var sAry = sTicket.split(",");
oRAIncident.Misc("PassStub") = sAry[4];
}
oRAIncident.Misc.add("L", 0);
try
{
if( true == pchealth.Connectivity.IsAModem )
oRAIncident.Misc("L") = 1;
}
catch (e)
{
}
}
catch (error)
{
if (strError == null)
strError = L_RCCTL_Text;
throw strError;
}
;
return oRAIncident;
}
function GetMapi()
{
;
if (oSmapi == null)
{
try
{
oSmapi = new ActiveXObject("RcBdyCtl.SMapi");
}
catch (error)
{
alert(L_RCCTL_Text);
return false;
}
}
return oSmapi;
;
}
</script>
</HEAD>
<frameset id="idframeset" name="idframeset" COLS="100%" onload="OnLoad()" onunload="DoUnload()">
<frame id="idSrc" name="idSrc" src="rcScreen2.htm">
</frameset>
</HTML>
