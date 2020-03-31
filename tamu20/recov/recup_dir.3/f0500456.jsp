  <td align="center"></td>
        <td align="center"></td>
        <td align="center"></td>
        <td align="center"></td>
      </tr>
    </table>
    </center></div></td>
  </tr>
</table>
</span>

<br>
<br>

<%=Write(strGenSteps)%>

</center></div>

</div>

<script language=javascript>
function paintCell (destPercent)
{
	var row = document.all.tab1.rows(0);
	var i = 0;
	var curPercent = 0;

	for (i = 0; i < 11 && curPercent <= destPercent; i++ ) {
		row.cells(i).bgColor = "blue";
		curPercent += 10;
	}
}

var lines = document.all.item(<%=LINE_STR%>);
var linesPercent;
var timeoutID;

if (lines.length > 0) linesPercent = 100 / lines.length;

function finalDisplay ()
{
    window.clearTimeout (timeoutID);
    progressbar.style.display = <% =NONE_STR%>;
}

function enableLines (destPercent)
{
	var i = 0;
	var curPercent = 0;

	for (i = 0; i < lines.length && curPercent < destPercent; i++ ) {
		lines(i).style.display = <% =NONE_STR%>;
		curPercent += linesPercent;
	}
	
	if (destPercent == 100) {
        finalline.style.display = <%=BLOCK_STR%>;
        timeoutID = window.setTimeout ( "finalDisplay()", 250);
	}
	else {
		if (i < lines.length)	
			lines(i).style.display = "block";
	}

	
}

function OpenPfld()
{
    OleInstall.OpenPrintersFolder ();
    return true;
}

</script>


<OBJECT ID="OleInstall" CLASSID="CLSID:C3701884-B39B-11D1-9D68-00C04FC30DF6"
    style="visibility: hidden">
>
</OBJECT>


<script language=vbscript>

<%  Const L_GetHttpFile_Text = "Printer Install"
    Const L_ServerDown_Text = "<p><H2>Printer Installation Failed</H2></p><font size=2>Can not connect to the server, please try it later.</font>"
    If bStartInstall Then %>

Sub WriteErrorMsg
   Document.Write("<%= Write("<font" & DEF_DOUBLEFONT & ">" & L_ServerDown_Text & END_FONT)%>")
End Sub

Sub RedirectErrorHandler (lErrCode, strNotes)
    Dim strHref
    strHref = "ipp_0014.asp?code=" & lErrCode & "&notes=" & strNotes
    Call Window.SetTimeout ("WriteErrorMsg()", 5000)
    Window.Location.Href = strHref
End Sub

Sub OleInstall_OnProgress (lProgress)
    Call paintCell (lProgress)
    Call enableLines (lProgress)
End Sub

Sub OleInstall_InstallError (lError)
    Call RedirectErrorHandler (lError,"<%=Write(L_GetHttpFile_Text)%>")
End Sub

Function GetPlatform
    Dim objHelper
    On Error Resume Next
    Err.Clear
    Set objHelper = CreateObject("<% =PROGID_CLIENT_HELPER %>")
    If Err Then
        GetPlatform = 0
    Else
        GetPlatform = objHelper.ClientInfo
        Set objHelper = nothing
    End If
End Function

On Error Resume Next
Dim strShare
Dim strServer
Dim strInstallURL
Dim bRet
Set ObjCvt = CreateObject ("<%=PROGID_CONVERTER%>")

strShare = ObjCvt.DecodeUnicodeName ("<%=strEncodedName%>")
strServer = "<%=Request.ServerVariables("SERVER_NAME") %>"

<%
Dim strUrl

If Request.ServerVariables("HTTPS") = "off" Then
    strUrl = "http://"
Else
    strUrl = "https://"
End If
%>

Function StartDownload
    On Error Resume Next

    strInstallURL = "<%=strUrl%>" & strServer & "/printers/" & "<%=strEncodedName%>" & "/.printer?createexe&" & GetPlatform

    Err.Clear
    OleInstall.InstallPrinter "\\" & strServer & "\" & strShare, strInstallURL
    If Not Err.Number = 0 Then
        Call RedirectErrorHandler (Err.Number,"<%=Write(L_GetHttpFile_Text)%>")
    End If
End Function

<% Else %>
Call enableLines (100)
<% End If %>


</script>

</body>
</html>