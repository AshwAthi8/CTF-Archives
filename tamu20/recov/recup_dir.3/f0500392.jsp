 leftmargin="0">

<%=Write(DEF_BASEFONT_TAG)%>

<table border="0" width="100%" cellspacing="0" cellpadding="2">
  <tr>
    <td width="30" colspan="2" >
    <img src="images/ipp_0002.gif">
    </td>
  </tr>
  <tr>
    <th colspan="2" align="left" bgcolor="#000000">
        <%=Write(MENU_FONT_TAG & "<b>" & L_View_Text & "</b>" & END_FONT)%>
     </th>
  </tr>
  <tr>
    <td width="30">&nbsp;&nbsp;</td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS_Q & ATPAGE & CStr(Int(Rnd*10000))%>"
    target="_top"
    title = "<% =Write(L_GoDocList_Text)%>" >
    <% =GetHighlightLink ("q", L_DocList_Text)%> </a> </td>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS_P & ATPAGE & CStr(Int(Rnd*10000))%>"
    target="_top"
    title = "<% =Write(L_GoPropPage_Text) %>" >
        <% =GetHighlightLink ("p", L_Property_Text)%></a></td>
  </tr>
<% If strASP1 <> "" then %>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS_D & ATPAGE & CStr(Int(Rnd*10000))%>"
    target="_top"
    title = "<%=Write(L_GoDevStatus_Text) %>" >
        <% =GetHighlightLink ("d", L_Detail_Text)%></a></td>
  </tr>
<% end if%>
  <tr>
    <td width="30"></td>
    <td width="100%" ><a href="ipp_0001.asp" target="_top"
    title = "<% =Write(RepString1(L_ListPrinters_Text,session(LOCAL_SERVER)))%>" >
        <%= Write(SUBMENU_FONT_TAG & L_AllPrinters_Text & END_FONT)%></a></td>
  </tr>
  <tr>
    <td colspan="2" height="15"></td>
  </tr>
  <tr>
    <th colspan="2" align="left" bgcolor="#000000"> <%=Write(MENU_FONT_TAG & "<b>" & L_PrinterActions_Text & "</b>" & END_FONT)%> </th>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter")%>&action=pause&page=<%=CStr(Int(Rnd*10000))%>"
    target="_top"
    title = "<% =Write(L_PausePrinter_Text) %>"><%=Write(SUBMENU_FONT_TAG & L_Pause_Text & END_FONT)%></a></td>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter")%>&action=resume&page=<%=CStr(Int(Rnd*10000))%>"
    target="_top"
    title = "<% = Write(L_ResumePrinter_Text) %>"><%=Write(SUBMENU_FONT_TAG & L_Resume_Text & END_FONT)%></a></td>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter")%>&action=purge&page=<%=CStr(Int(Rnd*10000))%>"
    target="_top"
    title = "<% =Write(L_CancelDocs_Text) %>"> <%=Write(SUBMENU_FONT_TAG & L_CancelAllDocs_Text & END_FONT)%> </a></td>
  </tr>

<% if Request(CONNECT) = "1" And request.servervariables ("LOCAL_ADDR") <> request.servervariables ("REMOTE_ADDR") then %>

<script language="vbscript">

Dim objHelper
On Error Resume Next
Err.Clear
Set objHelper = CreateObject("<% =PROGID_CLIENT_HELPER %>")

If Err.Number = 0 Then
    Dim   strInstall 

    strInstall = "<tr><td width=""30""></td><td width=""100%""><a href=ipp_0015.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS & strView%>" & " target=""_top""" & " title=" & """<%=Write(strInstall)%>""" & ">" &_
                 "<%= Write("<font " & DEF_DOUBLEFONT & " size = 2><b>" & L_Connect_Text & "</b>" & END_FONT)%>" & "</a></td></tr>"

    Set objHelper = nothing
    Document.Write (strInstall)
End If

</script>

<% end if %>
  <tr>
    <td width="30" colspan="2" height="15">
    </td>
  </tr>

<% If strView = "q" Then %>
  <tr>
    <th colspan="2" align="left" bgcolor="#000000"> <%=Write(MENU_FONT_TAG & "<b>" & L_DocumentActions_Text & "</b>" & END_FONT)%> </th>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS_Q & ATPAGE & CStr(Int(Rnd*10000)) & QUOTE & ONCLICK_EQUALS%>"return getHref('pausejob',null);"
    target="_top" title = "<% =Write(L_PauseDoc_Text) %>"><%=Write(SUBMENU_FONT_TAG & L_Pause_Text & END_FONT)%></a></td>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS_Q & ATPAGE & CStr(Int(Rnd*10000)) & QUOTE & ONCLICK_EQUALS%>"return getHref('resumejob',null);"
    target="_top" title= "<% =Write(L_ResumeDoc_Text) %>"><%=Write(SUBMENU_FONT_TAG & L_Resume_Text & END_FONT)%></a></td>
  </tr>
  <tr>
    <td width="30"></td>
    <td width="100%"><a href="ipp_0004.asp?eprinter=<%=Request("eprinter") & VIEW_EQUALS_Q & ATPAGE & CStr(Int(Rnd*10000)) & QUOTE & ONCLICK_EQUALS%>"return getHref('canceljob',null);"
    target="_top" title= "<% =Write(L_CancelDelDoc_Text) %>"><%=Write(SUBMENU_FONT_TAG & L_Cancel_Text & END_FONT)%></a></td>
  </tr>
<% End If %>

</table>

</body>
</html>
