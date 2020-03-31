var L_EXPIRED_Text = "Invitation has expired.";
var L_UNABLETOLOCATEXML_Text = "The invitation was not found. It may have been deleted or corrupted. You can try and open the invitation again, or ask the sender for a new invitation.";
var L_ERRLOADINGINCIDENT_Text = "There is a problem with the invitation and it cannot be opened. To use Remote Assistance, the sender of this invitation will have to send you a new invitation.";
var L_ERRLOADINGRCTICKET_Text = "There is a problem with the invitation and it cannot be opened. To use Remote Assistance, the sender of this invitation will have to send you a new invitation.";
var L_ERRQUIT_Text = "Failed to Disconnect from Server";
var L_ERRLOADFROMXMLFILE_Text = "There is a problem with the invitation and it cannot be opened. To use Remote Assistance, the sender of this invitation will have to send you a new invitation.";
var L_DOT_Text = ".";
var L_AM_Text ="AM";
var L_PM_Text ="PM";
var L_JAN_Text = "Jan";
var L_FEB_Text = "Feb";
var L_MAR_Text = "Mar";
var L_APR_Text = "Apr";
var L_MAY_Text = "May";
var L_JUN_Text = "Jun";
var L_JUL_Text = "Jul";
var L_AUG_Text = "Aug";
var L_SEP_Text = "Sep";
var L_OCT_Text = "Oct";
var L_NOV_Text = "Nov";
var L_DEC_Text = "Dec";
var L_UNKNOWN_Text = "Unknown";
function SAFRemoteAssistanceHelper()
{
try
{
this.m_oSAFRemoteDesktopClient = null;
this.m_oSAFRemoteDesktopChannelMgr = null;
this.m_oChatChannel = null;
this.m_oControlChannel = null;
this.m_oSAFClassFactory = null;
this.m_idCtx = null;
this.m_oCurrentIncident = null;
this.m_oEncryption = null;
this.m_oDict = null;
this.m_oSAFIntercomClient = null;
this.m_oICFAllowList = null;
this.m_oFso = null;
this.m_oRCFileDlg = null;
this.m_bChatBoxHidden = false;
this.m_bPasswordSet = false;
this.m_bRCEnabled = false;
this.m_bConnected = false;
this.m_bUserDisconnect = false;
this.m_bLoadFromFile = true;
this.m_bEnableSmartScaling = true;
this.m_bPerfOptimize = false;
this.m_bMSRA = true;
this.m_bListen = false;
this.m_bIsIM = false;
this.m_bURA = false;
this.m_bExpired = false;
this.m_bDeleteTicket = false;
this.m_bNoPrompt = false;
this.m_bNoChat = false;
this.m_iChannelId = 1000;
this.m_UserWidth = window.screen.availWidth;
this.m_UserHeight = window.screen.availHeight;
this.m_UserColorDepth = window.screen.colorDepth;
this.m_szURL = null;
this.m_szCurrentIP = null;
this.m_szLocalUser = null;
this.m_szIncidentFile = null;
this.m_szUserName = null;
this.m_szExpiryTime = "1 HOUR";
this.m_szPassword = null;
this.m_szRCTicketEncrypted = null;
this.m_szRCTicket = null;
this.m_szHelpeeIP = null;
this.m_szRCTicket = null;
this.m_szUserName = null;
this.m_szIncidentXML = null;
this.m_szPassStub = "";
this.m_szExpertTicket = null;
this.m_szExpertBlob = null;
this.m_bDebug = true;
this.m_szFuncName = null;
this.m_TraceFso = null;
this.m_TraceFileHandle = null;
this.m_TraceFile = null;
this.m_TracetFileName = null;
}
catch(error)
{
FatalError( L_ERRFATAL_Text, error );
}
}
function ParseURL()
{
var szIncidentFileURL = null;
var szTempstr = null;
var szTempstr1 = null;
var i = null;
var j = null;
var k = null;
;
try
{
i = 1;
if (i > 0)
{
szIncidentFileURL = oSAFClassFactory.ExtraArgument;
;
j = szIncidentFileURL.indexOf("IM=");
if (j == 0)
{
g_oSAFRemoteAssistanceHelper.m_bIsIM = true;
g_oSAFRemoteAssistanceHelper.m_SessionID = szIncidentFileURL.slice(3);
;
g_oSAFRemoteAssistanceHelper.m_bLoadFromFile = false;
;
return g_oSAFRemoteAssistanceHelper.m_SessionID;
}
j = szIncidentFileURL.indexOf("=", 1);
szTempstr = szIncidentFileURL.slice(j+1);
if( 0 == szTempstr.indexOf( "LISTEN" ))
{
g_oSAFRemoteAssistanceHelper.m_bListen = true;
g_oSAFRemoteAssistanceHelper.m_szIncidentFile = szTempstr;
}
else
{
g_oSAFRemoteAssistanceHelper.m_szIncidentFile = szTempstr;
}
;
}
else
{
FatalError( L_UNABLETOLOCATEXML_Text );
;
return null;
}
}
catch(error)
{
FatalError( error.description, error );
return null;
}
;
return g_oSAFRemoteAssistanceHelper.m_szIncidentFile;
}
function LoadIncidentFromFile()
{
;
try
{
g_oSAFRemoteAssistanceHelper.m_oCurrentIncident = oSAFClassFactory.CreateObject_Incident();
g_oSAFRemoteAssistanceHelper.m_oEncryption = oSAFClassFactory.CreateObject_Encryption();
try
{
if(true == g_oSAFRemoteAssistanceHelper.m_bLoadFromFile )
{
g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.LoadFromXMLFile( g_oSAFRemoteAssistanceHelper.m_szIncidentFile );
}
else
{
g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.LoadFromXMLString( g_oSAFRemoteAssistanceHelper.m_szIncidentXML );
}
}
catch(error)
{
try
{
var oLogger = new ActiveXObject("RACplDlg.RAEventLog");
var args = new Array(1);
args[0] = parent.EscapedName(parent.GetLocalUser());
oLogger.LogRemoteAssistanceEvent(0,2,args);
}
catch(e)
{
}
FatalError( L_ERRLOADFROMXMLFILE_Text, error );
;
return null;
}
if( false == ValidateIncident())
{
try
{
var oLogger = new ActiveXObject("RACplDlg.RAEventLog");
var args = new Array(1);
args[0] = parent.EscapedName(parent.GetLocalUser());
oLogger.LogRemoteAssistanceEvent(0,2,args);
}
catch(e)
{
}
FatalError(L_ERRLOADINGINCIDENT_Text);
;
return null;
}
else
{
g_oSAFRemoteAssistanceHelper.m_szUserName = EscapedName( g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.UserName );
g_oSAFRemoteAssistanceHelper.m_szRCTicketEncrypted = g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.RCTicket;
g_oSAFRemoteAssistanceHelper.m_oDict = g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.Misc;
var DtStart = g_oSAFRemoteAssistanceHelper.m_oDict.Item("DtStart");
var DtLength = g_oSAFRemoteAssistanceHelper.m_oDict.Item("DtLength");
;
;
var ms = DtStart*1000 + DtLength*60*1000;
;
var ExpiryDate = new Date ( ms );
var iNow = Date.parse(new Date());
g_oSAFRemoteAssistanceHelper.m_iRemainingMins = parseInt(((ms - iNow)/1000)/60);
if( 0 >= g_oSAFRemoteAssistanceHelper.m_iRemainingMins)
{
g_oSAFRemoteAssistanceHelper.m_bExpired = true;
}
g_oSAFRemoteAssistanceHelper.m_szExpiryTime = GetTime(ExpiryDate);
;
g_oSAFRemoteAssistanceHelper.m_szHelpeeIP = g_oSAFRemoteAssistanceHelper.m_oDict.Item("IP");
if(1 == g_oSAFRemoteAssistanceHelper.m_oDict.Item("DeleteTicket"))
{
g_oSAFRemoteAssistanceHelper.m_bDeleteTicket = true;
}
if((1 == g_oSAFRemoteAssistanceHelper.m_oDict.Item("NoPrompt"))&&( false == g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.RCTicketEncrypted))
{
g_oSAFRemoteAssistanceHelper.m_bNoPrompt = true;
}
if(1 == g_oSAFRemoteAssistanceHelper.m_oDict.Item("NoChat"))
{
g_oSAFRemoteAssistanceHelper.m_bNoChat = true;
}
if(1 == g_oSAFRemoteAssistanceHelper.m_oDict.Item("URA"))
{
g_oSAFRemoteAssistanceHelper.m_bURA = true;
}
try
{
if( (1 == g_oSAFRemoteAssistanceHelper.m_oDict.Item("L")) || (true == oSAFClassFactory.Connectivity.IsAModem ))
{
g_oSAFRemoteAssistanceHelper.m_bPerfOptimize = true;
}
}
catch(error)
{
g_oSAFRemoteAssistanceHelper.m_bPerfOptimize = false;
}
;
if(true == g_oSAFRemoteAssistanceHelper.m_bDeleteTicket)
{
try
{
g_oSAFRemoteAssistanceHelper.m_oFso.DeleteFile( g_oSAFRemoteAssistanceHelper.m_szIncidentFile );
}
catch(error)
{
FatalError( error.description + " (" + g_oSAFRemoteAssistanceHelper.m_szIncidentFile + ")" );
;
return null;
}
}
}
}
catch(error)
{
FatalError(L_ERRLOADINGINCIDENT_Text, error);
;
return null;
}
;
return g_oSAFRemoteAssistanceHelper.m_oCurrentIncident;
}
function ValidateIncident()
{
;
var bRetVal = true;
if("" == g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.UserName)
{
g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.UserName = L_DEFAULTUSER_Text;
}
if("" == g_oSAFRemoteAssistanceHelper.m_oCurrentIncident.RCTicket)
{
bRetVal = false;
}
;
return bRetVal;
}
var g_bAlreadyDisconnected = false;
function UserDisconnect()
{
try
{
if ( true == parent.g_ExpertDisconnected )
{
return;
}
;
if( false == g_bAlreadyDisconnected )
{
g_bAlreadyDisconnected = true;
var vArgs = new Array(1);
vArgs[0] = L_ERRDISCONNECT1_Text + g_oSAFRemoteAssistanceHelper.m_szUserName + L_ERRDISCONNECT2_Text + g_oSAFRemoteAssistanceHelper.m_szUserName + L_DOT_Text;
var vRetVal = window.showModelessDialog( "hcp://system/Remote Assistance/Interaction/Common/ErrorMsgs.htm", vArgs, "dialogwidth:405px;dialogHeight:165px;status:no;resizable:no;help:no" );
}
}
catch(error)
{
}
}
function RCDisconnect()
{
;
try
{
if( null != parent.frames.idFrameTools.g_oSAFRemoteAssistanceHelper)
{
g_oSAFRemoteAssistanceHelper = parent.frames.idFrameTools.g_oSAFRemoteAssistanceHelper;
}
else if( null != parent.g_oSAFRemoteAssistanceHelper )
{
g_oSAFRemoteAssistanceHelper = parent.g_oSAFRemoteAssistanceHelper;
}
if ((g_oSAFRemoteAssistanceHelper.m_szUserName != null) && ( g_oSAFRemoteAssistanceHelper.m_szUserName.length == 0 ))
{
g_oSAFRemoteAssistanceHelper.m_szUserName = L_DEFAULTUSER_Text
}
if (true == parent.g_bVoipOn)
{
try
{
if( null != g_oSAFRemoteAssistanceHelper.m_oSAFIntercomClient )
{
;
g_oSAFRemoteAssistanceHelper.m_oSAFIntercomClient.Disconnect();
;
}
parent.g_bVoipOn = false;
parent.frames.idFrameTools.idTB.SetState( "btnVoice", false );
}
catch (e)
{
return;
}
}
if((false == g_oSAFRemoteAssistanceHelper.m_bUserDisconnect) && (true == g_oSAFRemoteAssistanceHelper.m_bConnected))
{
g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopClient.DisconnectFromServer();
;
;
}
else if (true == g_oSAFRemoteAssistanceHelper.m_bConnected)
{
if(null != g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopClient )
{
g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopClient.DisconnectFromServer();
}
g_oSAFRemoteAssistanceHelper.m_bConnected = false;
UserDisconnect();
;
;
}
}
catch(e)
{
FatalError( L_ERRQUIT_Text );
}
}
function Helper_SetupChatChannel()
{
;
try
{
if(null == g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopChannelMgr)
{
g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopChannelMgr = g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopClient.ChannelManager;
}
g_oSAFRemoteAssistanceHelper.m_oChatChannel = g_oSAFRemoteAssistanceHelper.m_oSAFRemoteDesktopChannelMgr.OpenDataChannel( "70" );
g_oSAFRemoteAssistanceHelper.m_oChatChannel.OnChannelDataReady = function()
{ parent.Helper_ChatChannelDataReadyHandler(); }
}
catch(error)
{
parent.FatalError( parent.L_ERRFATAL_Text, error );
}
;
return;
}
function Helper_SetupDataChannels()
{
;
try
{
Helper_SetupControlChannel();
Helper_SetupChatChannel();
}
catch(error)
{
FatalError( L_ERRFATAL_Text, error );
}
;
return;
}
function Helper_ChatChannelDataReadyHandler()
{
;
var Data = null;
try
{
if(true == parent.frames.idFrameTools.g_oSAFRemoteAssistanceHelper.m_bChatBoxHidden)
{
parent.frames.idFrameStatus.Helper_HideChat();
}
parent.idCtx.minimized = false;
parent.idCtx.bringToForeground();
SoundBeep();
Data = g_oSAFRemoteAssistanceHelper.m_oChatChannel.ReceiveChannelData();
parent.frames.idFrameChat.Helper_UpdateChatHistory( Data );
}
catch(error)
{
FatalError( parent.L_ERRFATAL_Text, error );
}
;
return;
}
function GetTime(oDate)
{
;
var DateTime;
try
{
DateTime = oDate.toLocaleString();
}
catch(error)
{
DateTime = L_UNKNOWN_Text;
}
;
return(DateTime);
}
