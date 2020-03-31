guage%>>
<head>
<Meta Http-equiv="Content-Type" Content="text/html; CHARSET=UTF-8">
<title><% =Write(L_TitleDevStatus_Text) %></title>
</head>

<body>

<%=Write(CLIENT_FONT)%>
<%Const L_DevStatusErr_Text = "<p><H2>Device Status Page Error</H2></p>We are unable to generate the device status page for the selected printer. Please contact your system administrator for more information.<br><p>"%>
<%=Write (L_DevStatusErr_Text)%>
<%=END_FONT%>

</body>
</html>
