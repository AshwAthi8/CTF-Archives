Content="text/html; CHARSET=UTF-8">
<%
    Dim strTitle
    Dim strLeftPaneUrl
    Dim strConnect

    const L_Title_Text = "<title>%1 on %2</title>"
    const L_FramesWarning_Text = "This web page uses frames, but your browser doesn't support them."

    strTitle = RepString2(L_Title_Text, strCleanString( GetFriendlyName (objQueue.PrinterName, session(COMPUTER))), session(LOCAL_SERVER) )

    If bEnableConnect Then
        strConnect = "1"
    Else
        strConnect = "0"
    End If

    strLeftPaneUrl = "ipp_0005.asp?eprinter=" & strEncodedPrinter & VIEW_EQUALS & strView & ATCONNECT & strConnect & ATURLPRINTER & strURLPrinter
    strLeftPaneUrl = strLeftPaneUrl & ATASP1 & strASP1 & ATPAGE & CStr(Int(Rnd*10000))
%>
<% =Write (strTitle) %>
</head>

<frameset frameborder="0" framespacing="10" cols="180,*">

     <frame src="<%=strLeftPaneUrl%>" name="contents" scrolling="auto" noresize>
     <frameset frameborder="0" framespacing="0" rows="100,*">
        <frame scrolling="auto" src="ipp_0002.asp?eprinter=<%=strEncodedPrinter%>&page=<%=CStr(Int(Rnd*10000))%>" frameborder="0" name="banner" scrolling="no" noresize>
        <frame src="<% =strinitial%>" frameborder="0" name="main" scrolling="auto">
     </frameset>

<noframes>
    <body>
    <p><%=Write(L_FramesWarning_Text)%></p>
    </body>
    </noframes>
</frameset>

</html>
