</td>"

    If objJob.Name = strJobid Then
        index = i
    End If

    strHTML = strHTML & "<tr bgcolor=" & UnselectedColor & " id=" & (i-1) & ">" &_
              TdStart & "&nbsp;<input type=radio name=jobid value=""" & objJob.name & """"

    If objJob.name = strJobid Then
        strHTML = strHTML & CHECKED_TAG
    End If

    strHTML = strHTML & ONCLICK_EQUALS & """return setJobId(" & objJob.name & ");"">" &_
              strCleanString (objjob.Description) & TdEnd &_
              TdStart & strJobStatus(objJob.status) & TdEnd &_
              TdStart & objJob.user & TdEnd

    If objJob.totalpages > 0 Then
        strHTML = strHTML & TdStart & objJob.totalpages & TdEnd
    Else
        strHTML = strHTML & TdStart & "&nbsp;" & TdEnd
    End If

    If objJob.size > 0 Then
        strHTML = strHTML & TdStart & strFormatJobSize (objJob.size) & TdEnd
    Else
        strHTML = strHTML & TdStart & "&nbsp;" & TdEnd
    End If

    strHTML = strHTML & TdStart & formatdatetime(objJob.timesubmitted, 3) & " " &_
              formatdatetime(objJob.timesubmitted, 2) & TdEnd & "</tr>"
    GenQueueViewBody = strHTML

End Function

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html lang=<%=L_Language%>>
<head>
<meta http-equiv="refresh" content="30">
<Meta Http-equiv="Content-Type" Content="text/html; CHARSET=UTF-8">
<title><%=Write (L_DocumentList_Text)%></title>
</head>

<body bgcolor="#FFFFFF" text="#000000" topmargin="0" leftmargin="0" link="#000000"
vlink="#000000" alink="#000000">

<script language="javascript">
function setJobId (id)
{
    document.forms[1].elements[0].value = id;
    return true;
}
</script>


<form>
<%if bDHTML then %>
  <div
  ONCLICK="colorSelector()"><script LANGUAGE="JavaScript">
	var oldTr = 0;
	function colorSelector() {
		var jlist = document.all.JOBLIST.rows;
		
		if (!jlist[0].contains (event.srcElement)) {

			if (oldTr != null) {
				oldTr.bgColor = "<%=UnselectedColor%>";
			}

			for (i = 1; i < jlist.length; i++) {
				if (jlist[i].contains (event.srcElement)) {
					oldTr = jlist[i];
					oldTr.bgColor = "<%=SelectedColor%>";
					document.forms[0].elements[oldTr.id - <%=iStart%> + 1].checked = true;
					setJobId (document.forms[0].elements[oldTr.id - <%=iStart%> + 1].value);
				}
			}
		}
	}

</script>
<% end if%>

<table id="JOBLIST" border="0" cellpadding="2" cellspacing="0" width="100%">
    <%= Write (GenQueueViewHead) %>
<%
	Dim i
    Dim bShowNext
    bShowNext = FALSE
	i = 1

	For Each objJob In objJobs
        If (i >= iEnd) Then
            bShowNext = TRUE
            Exit For
        End If

        If (i >= istart) Then
            Response.Write (Write (GenQueueViewBody (objJob, i)))
            'Response.Write (GenQueueViewBody (objJob, i))
        End If
        i = i + 1
    Next

%>
</table>
</form>

<form >
  <input type="hidden" name="selectedid" value="<%=strJobid%>">
  <input type="hidden" name="startid" value="<%=iStart%>">
  <input type="hidden" name="endid" value="<%=iEnd%>">
</form>


<%
    If i = 1 Then 'No job in the printer queue
        Const L_NoJob_Text = "<br><br><center><b>There is no document in the printer queue.</b></center>"
        Response.Write (Write(DEF_FONT_TAG & L_NoJob_Text & END_FONT))
    End If

    Dim strUrl
    const L_Prev_Text = "Prev %1 documents"
    Const L_Next_Text = "Next %1 documents"

    strUrl = "<a target=""_top"" href=ipp_0004.asp?eprinter=" & Request("eprinter") & VIEW_EQUALS & Request("view") & "&startid=" & CStr(iStart - iJobLength) & "&endid=" & CStr(iEnd - iJobLength) & ATPAGE & CStr(Int(Rnd*10000)) & ">" &_
             RepString1(L_Prev_Text, CStr (iJobLength)) & "</a>&nbsp;&nbsp;&nbsp;&nbsp;"

    If iStart > 1 Then
        Response.Write ( Write(DEF_FONT_TAG & strUrl & END_FONT))
    End If

    strUrl = "<a target=""_top"" href=ipp_0004.asp?eprinter=" & Request("eprinter") & VIEW_EQUALS & Request("view") & "&startid=" & CStr(iStart + iJobLength) & "&endid=" & CStr(iEnd+iJobLength) & ATPAGE & CStr(Int(Rnd*10000)) & ">" &_
             RepString1(L_Next_Text, CStr (iJobLength)) & "</a>"

    If bShowNext Then
        Response.Write ( Write(DEF_FONT_TAG & strUrl & END_FONT))
    End If

%>


<%if bDHTML then%>
  </div>
<% end if %>
<%if index > 0 then%>
<script LANGUAGE="JavaScript">

	window.onerror=windowError;
	function windowError ()
	{	return true; }

	if (document.all) {
        oldTr = document.all.JOBLIST.rows[<%=index - iStart + 1%>];
        oldTr.bgColor = "<%=SelectedColor%>";
    }
</script>
<%end if%>

</body>
</html>