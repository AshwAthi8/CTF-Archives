var L_STOPTALKING_Text = "Stop <U>T</U>alking";
var L_STARTTALKING_Text = "Start <u>T</u>alking";
var L_LASTCHAT_Text = "Last message received at ";
var L_ERRRCSESSION_Text = "Failed to destroy RCSession";
var L_ERRNULLRCSESSION_Text = "A program has stopped responding.Please try again.";
var L_RCCTL_Text = "Remote Assistance failed. Please try again. ";
var L_ERRVOIP2_Text = "The necessary hardware and/or configuration to use a voice connection is not available;'Start Talking' will be disabled for the remainder of this Remote Assistance session.";
var g_oICFAllowList = null;
var g_Helpee_oSAFRemoteDesktopSession = null;
var g_Helpee_oSAFRemoteDesktopChannelMgr = null;
var g_Helpee_oChatChannel = null;
var g_Helpee_oControlChannel = null;
var g_Helpee_oSAFIntercomServer = null;
var g_bVoIPEnabled = true;
var g_objPanic = null;
function InitVoIP()
{
if( true == g_bVoIPEnabled )
{
g_Helpee_oSAFIntercomServer = oSAFClassFactory.CreateObject_IntercomServer();
g_Helpee_oSAFIntercomServer.onVoiceDisconnected = Helpee_onVoiceDisconnected;
g_Helpee_oSAFIntercomServer.onVoiceConnected = Helpee_onVoiceConnected;
g_Helpee_oSAFIntercomServer.onVoiceDisabled = Helpee_onVoiceDisabled;
}
}
function Init_Helpee_SALEM()
{
;
if(null == g_Helpee_oSAFRemoteDesktopSession)
{
FatalError( L_ERRNULLRCSESSION_Text );
}
else
{
try
{
g_Helpee_oSAFRemoteDesktopChannelMgr = g_Helpee_oSAFRemoteDesktopSession.ChannelManager;
g_Helpee_oChatChannel = g_Helpee_oSAFRemoteDesktopChannelMgr.OpenDataChannel( "70" );
g_Helpee_oControlChannel = g_Helpee_oSAFRemoteDesktopChannelMgr.OpenDataChannel( "71" );
g_Helpee_oChatChannel.OnChannelDataReady = function()
{ Helpee_ChatChannelDataReadyEventHandler(); }
g_Helpee_oControlChannel.OnChannelDataReady = function()
{ Helpee_ControlChannelDataReadyEventHandler(); }
g_Helpee_oSAFRemoteDesktopSession.OnDisconnected = function()
{ Helpee_OnClientDisconnectedEventHandler(); }
}
catch(error)
{
FatalError( L_ERRFATAL_Text, error );
}
}
;
return;
}
function Helpee_onVoiceDisconnected()
{
;
try
{
if (true == g_bConnected)
{
g_bVoipConnected = false;
g_StartTalking = 1;
g_bStartEnabled = true;
if (g_bVoIPEnabled == true)
{
frames.idFrameTools.btnVoice.disabled = false;
frames.idFrameTools.txtVoice.disabled = false;
frames.idFrameTools.txtVoice.innerHTML = L_STARTTALKING_Text;
}
}
}
catch (error)
{
}
;
}
function Helpee_onVoiceConnected()
{
;
try
{
g_bVoipConnected = true;
g_bStartEnabled = true;
frames.idFrameTools.txtVoice.innerHTML = L_STOPTALKING_Text;
frames.idFrameTools.btnVoice.disabled = false;
frames.idFrameTools.txtVoice.disabled = false;
}
catch (error)
{
}
;
}
function Helpee_onVoiceDisabled()
{
;
try
{
if (g_bVoIPEnabled == true)
{
g_bVoIPEnabled = false;
g_bVoipConnected = false;
DisplayMessage(L_ERRVOIP2_Text);
frames.idFrameTools.btnVoice.disabled = true;
frames.idFrameTools.txtVoice.disabled = true;
g_stateVoipMe = 2;
Helpee_SendControlCommand( "DISABLEVOICE" );
}
}
catch (error)
{
FatalError( L_RCCTL_Text, error );
}
;
}
function Helpee_ChatChannelDataReadyEventHandler()
{
;
var data = null;
try
{
data = g_Helpee_oChatChannel.ReceiveChannelData();
idCtx.minimized = false;
idCtx.bringToForeground();
SoundBeep();
if(true == g_bChatBoxHidden)
{
frames.idFrameTools.Helpee_HideChat();
}
frames.idFrameChatTop.UpdateChatHistory( data );
frames.idFrameTools.UpdateChatStatus( L_LASTCHAT_Text );
frames.idFrameChatTop.SetFocus();
}
catch(error)
{
FatalError( L_ERRFATAL_Text, error );
}
;
return;
}
function DisplayDisconnectStatus()
{
;
try
{
frames.idFrameTools.UpdateStatus( L_HELPEEDISCONNECTED_Text );
parent.gDisconnected = true;
}
catch(error)
{
FatalError( L_RCCTL_Text, error );
}
;
return;
}
function Helpee_OnClientDisconnectedEventHandler()
{
;
try
{
SoundBeep();
g_bConnected = false;
try
{
if (g_bVoipConnected == true)
{
g_Helpee_oSAFIntercomServer.Disconnect();
}
if(null != parent.oRCSession)
{
parent.oRCSession.Disconnect();
parent.oRCSession.onDisconnected = function()
{ }
parent.oRCSession.onConnected = function( salemID, userSID, sessionID )
{ }
}
}
catch(error)
{
}
DisplayDisconnectStatus();
;
;
idBody.disabled = true;
frames.idFrameChatTop.idchatText.disabled = true;
frames.idFrameChatTop.btnSendChat.disabled = true;
frames.idFrameChatTop.idIncomingChatText.disabled = false;
frames.idFrameTools.idBody.disabled = true;
CloseOpenSubWin();
if( false == g_bUserDisconnect )
{
if (null != g_objPanic)
{
g_objPanic.ClearPanicHook();
}
if ( (null == parent.gHelperName ) || ( parent.gHelperName.length == 0 ))
{
parent.gHelperName = L_DEFAULTUSER_Text;
}
var vArgs = new Array(1);
vArgs[0] = L_ERRDISCONNECT1_Text + parent.gHelperName + L_ERRDISCONNECT2_Text + parent.gHelperName + ".";
var vRetVal = window.showModelessDialog( "hcp://system/Remote Assistance/Interaction/Common/ErrorMsgs.htm", vArgs, "dialogwidth:405px;dialogHeight:165px;status:no;resizable:no;help:no" );
}
}
catch(error)
{
}
}
