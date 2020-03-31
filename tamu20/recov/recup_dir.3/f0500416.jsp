nches Per Minute)"

            Select Case iUnit
            Case 1
                strUnit = L_PPM_Text
            Case 2
                strUnit = L_CPS_Text
            Case 3
                strUnit = L_LPM_Text
            Case 4
                strUnit = L_IPM_Text
            End Select

            strHTML = strHTML & strBgnCol1 & L_Speed_Text & L_BgnSpeed_Text & strBgnCol2 & strTmp & strUnit & strEndCol
        End If
    End If
    Err.Clear

    strTmp = objPrinter.Color
    If Err.Number = 0 Then
        strHTML = strHTML & strBgnCol1 & L_Color_Text & strBgnCol2 & isSupported (strTmp) & strEndCol
    End If
    Err.Clear


    strTmp = objPrinter.Duplex
    If Err.Number = 0 Then
        strHTML = strHTML & strBgnCol1 & L_Duplex_Text & strBgnCol2 & isSupported (strTmp) & strEndCol 
    End If
    Err.Clear

    strTmp = objPrinter.MaximumResolution
    If Err.Number = 0 Then
        Const L_DPI_Text = " DPI (Dots Per Inch)"
        strHTML = strHTML & strBgnCol1 & L_Resolution_Text & strBgnCol2 & strTmp & L_DPI_Text & strEndCol 
    End If

    GenPropertyTable = strHTML

End Function
%>

<body bgcolor="#FFFFFF" text="#000000" link="#000000" vlink="#000000" alink="#000000"
topmargin="0" leftmargin="0">

<table border="0" cellpadding="2" cellspacing="0" width="100%">
<%=Write (GenPropertyTable (objQueue, objPrinter))%>
</table>

<%
    objPrinter.close
%>

</body>
</html>