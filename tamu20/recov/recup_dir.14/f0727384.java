r

    CheckSession

    Response.expires = 0
    Response.Buffer = TRUE
    Dim bRefresh
    bRefresh = Request ("refresh") = 1
%>

<%

const L_NotEmpty_Text    = "Not Empty"   'The input tray is not empty
const L_Empty_Text       = "Empty"       'The input tray is empty
const L_Name_Text        = "Name"        'The name of the input tray
const L_PaperSize_Text   = "Paper Size"
const L_Media_Text       = "Media"
const L_Current_Text     = "Current"     'The Current number of the paper in the input tray
const L_Maximum_Text     = "Maximum"     'The Maximum number of the paper in the input tray
const L_Tray_Text        = "Tray "

const L_Seperator_Text   = " - "
const L_Printer_Text     = "Printer"
const L_Output_Text      = "Output"

Function ErrorHandler (strErr)

    Dim strHref

    strHref = "ipp_0013.asp?notes=" & strErr

    Response.Redirect (strHref)
    Response.End

End Function

Function ErrorHandler2 (strErr)

    Dim strScript

    strScript = "<script language=javascript>function noerror(){" &_
                "var strHref;" &_
                "strHref = ""ipp_0013.asp?notes" & strErr &_
                "window.location.href = strHref;}</script>"

    Response.Write (strScript)
    Response.End

End Function

Function GenConsoleTable(iRow, iColumn, strArray, strLang)
Dim strHTML
Dim strBgnCol, strEndCol
Dim strBgnRow, strEndRow
Dim i, j, srcIndex, c
Dim tmpArray
ReDim tmpArray (iColumn)

strHTML = ""

strBgnCol = "<tr>"
strEndCol = "</tr>"

If strLang = "JP" then
    strBgnRow = "<td width=10 class=jpnfont><center><font face = ""