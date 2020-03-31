led by policy, please contact your administrator"
    Const L_UnknownErr_Message = "An unknown error happened, please contact your administrator"
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html lang=<%=L_Language%>>
<head>
<Meta Http-equiv="Content-Type" Content="text/html; CHARSET=UTF-8">
<title><% =Write(L_TitlePrintError_Text) %></title>
</head>

<body>

<%=Write(CLIENT_FONT)%><p>
<%Const L_PrtFail_Text = "<H2>Printer Installation Failed</H2>"%>
<%=Write(L_PrtFail_Text)%>
</p>
<font size=2>
<%
    Dim iCode
    Dim strError
    iCode = Request("code")
    If iCode <> "" Or iCode <>"0" Then
        
        If iCode = 1260 Then ' 1260 is for the ERROR_ACCESS_DISABLED_BY_POLICY constant.

            strError = L_Error_WebPnPDl_Disabled_Text

        Else
            Dim objPrinter

            Set objPrinter = Server.CreateObject (PROGID_HELPER)
            On Error Resume Next
            Err.Clear
            strError = objPrinter.ErrorDscp (iCode)
            If Err.Number <> 0 Then
                Const L_ErrMsg_Text = "Error Code = %1"
                strError = RepString1(L_ErrMsg_Text,Hex (iCode))
            End If

        End If
        
    Else
        strError = L_UnknownErr_Message
    End If

    Response.Write (Write (strError))

%>
</font>
<%=END_FONT%>

</body>
</html>
