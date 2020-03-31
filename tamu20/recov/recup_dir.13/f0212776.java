***************************************************************************
</comment>
   <method name="checkScript"/>
   <method name="vbPrintf"/>
   <method name="getHostName"/>
   <method name="getUserName"/>
   <method name="getDomainName"/>
   <method name="LengthinBytes"/>
   <method name="LeftBytes"/>
   <method name="getPassword"/>
   <method name="trapError"/>
   <method name="getArguments"/>
   <method name="wmiConnect"/>
   <method name="packString"/>
   <method name="getMaxStringLen"/>
   <method name="showResults"/>
   <method name="validateDateTime"/>
   <method name="changeToWMIDateTime"/>
   <method name="matchPattern"/>
   <property name="ScriptingHost" internalName="WScript"/>
</public>

<resource id="PATTERN_VBPRINTF">%\d</resource>
<resource id="L_INVALID_ERRORMESSAGE_TYPE_AS_INPUT">ERROR: Invalid type passed as input to the function.</resource>
<resource id="L_INVALID_ERRORMESSAGE_ARG_NUMBER_AS_INPUT_ERRORMESSAGE">ERROR: Invalid number of arguments passed to the Print function.</resource>
<resource id="TEXT_NA">N/A</resource>
<resource id="OBJ_SYSTEMINFO_CLASS">Win32_ComputerSystem</resource>
<resource id="L_INVALID_ERRORMESSAGE">ERROR: Invalid '%1'.</resource>
<resource id="L_INVALID_SYNTAX_ERRORMESSAGE">ERROR: Invalid Syntax. Value expected for '%1'.</resource>
<resource id="L_HELP_SYNTAX_MESSAGE">Type "%1 /?" for usage.</resource>
<resource id="HINT_CHECK_INPUT">Please check the input and try again.</resource>
<resource id="L_ERROR_CHECK_VBSCRIPT_VERSION_ERRORMESSAGE">Unexpected Error: Please check the current version of VBScript.</resource>
<resource id="PATTERN_NEGATIVE_NUMBER">^\-\d|\d+$</resource>
<resource id="CONST_NO_MATCHES_FOUND">0</resource>
<resource id="OBJ_SCRIPTING_LOCATOR">WbemScripting.SWbemLocator</resource>
<resource id="DISPLAY_FMT_TABLE_TEXT">TABLE</resource>
<resource id="DISPLAY_FMT_CSV_TEXT">CSV</resource>
<resource id="DISPLAY_FMT_LIST_TEXT">LIST</resource>
<resource id="EXIT_SUCCESS">0</resource>
<resource id="EXIT_INVALID_PARAM">999</resource>
<resource id="EXIT_UNEXPECTED">255</resource>
<resource id="EXIT_INVALID_INPUT">254</resource>
<resource id="EXIT_METHOD_FAIL">250</resource>
<resource id="L_INVALID_ERRORMESSAGE_TIME_ERRORMESSAGE">ERROR: Invalid time '%1' specified for the filter '%2'.</resource>
<resource id="L_INVALID_ERRORMESSAGE_DATE_ERRORMESSAGE">ERROR: Invalid date '%1' specified for the filter '%2'.</resource>
<resource id="L_ENTER_PASSWORD_TEXT">Enter the Password:</resource>
<resource id="L_PROCESSING_TEXT">Processing...</resource>
<resource id="OBJ_SCRIPT_PASSWORD">ScriptPW.Password.1</resource>
<resource id="L_HINT_CHECK_PASSWORD_DLL_MESSAGE">HINT: Please check if ScriptPW.dll is registered in the system.</resource>
<resource id="CONST_ERROR">0</resource>
<resource id="CONST_CSCRIPT">2</resource>
<resource id="L_WARRING_LOCAL_CREDENTIALS_SUPPLIED_MESSAGE">WARNING: Ignoring the user credentials for the local connection.</resource>
<resource id="CONST_LOCAL_CREDENTIALS_SUPPLIED">-2147217308</resource>

<script language="VBScript">
    <![CDATA[

        ' All the functions which are used in common across all the vbs scripts are defined below

        ' Function used to find whether CScript is used or not
        '********************************************************************
        '* Function: checkScript
        '*
        '* Purpose:  Determines which program is used to run this script.
        '*
        '* Input:    None
        '*
        '* Output:   intChkProgram is set to one of CONST_ERROR or CONST_CSCRIPT.
        '*
        '********************************************************************
        Function checkScript()
            ON ERROR RESUME NEXT
            Err.Clear

            Dim strFullName	'program with its full path - used to execute the script 
            Dim strCommand	'name of program without extension (like exe, Eg:CScript)
            Dim intExe_Index	'to calculate the position of .exe in strFullName 
            Dim intSlash_Index	'to calculate the position of \ (slash) in strFullName

            'strFullName should be something like C:\WINDOWS\COMMAND\CSCRIPT.EXE
            strFullName = WScript.FullName

            If Err.Number then
                Wscript.Echo "Error 0x" & CStr(Hex(Err.Number)) 
                If Err.Description <> "" Then
                    Wscript.Echo "Error description: " & Err.Description & "."
                End If
                Err.Clear
                checkScript =   getResource("CONST_ERROR")
                Exit Function
            End If

            intExe_Index = InStr(1, strFullName, ".exe", 1)

            If intExe_Index = 0 Then
                checkScript = getResource("CONST_ERROR")
                Exit Function
            Else
                intSlash_Index = InStrRev(strFullName, "\", intExe_Index, 1)

                If intSlash_Index = 0 Then
                    checkScript =  getResource("CONST_ERROR")
                    Exit Function
                Else
                    strCommand = Mid(strFullName, intSlash_Index+1, _
                                    intExe_Index-intSlash_Index-1)

                    If LCase(strCommand) = LCase("cscript") Then 
                        checkScript =  getResource("CONST_CSCRIPT")
                    Else
                        checkScript = getResource("CONST_ERROR")
                    End If

                End If  'If intSlash_Index = 0 Then

            End If      'If intExe_Index = 0 Then

        End Function

        ' Subroutine which implements normal printf functionality
        '********************************************************************
        '* Sub:     vbPrintf
        '*
        '* Purpose: Simulates the Printf function.
        '*
        '* Input:  [in]  strPhrase      the string with '%1 %2 &3 ' in it
        '*         [in]  args           the values to replace '%1 %2 ..etc' with
        '*
        '* Output:  Displays the string on the screen
        '*          (All the '%x' variables in strPhrase is replaced by the 
        '*           corresponding elements in the array)
        '*
        '********************************************************************
        Sub vbPrintf(ByVal strPhrase, ByVal args )

            ON ERROR RESUME NEXT
            Err.Clear

            'Changed for localization  

            Dim strMatchPattern         ' the pattern to match - '%[number]'
            Dim intValuesCount          ' to get the count of matching results
            Dim i                       ' used in the loop
            Dim strTemp                 ' to store temporally  the given input string  for formatting

            strTemp   = strPhrase

            ' look out for '%[number]' in the given string
            strMatchPattern = getResource("PATTERN_VBPRINTF") '"\%[number]"

            intValuesCount = matchPattern (strMatchPattern, strTemp)

            If intValuesCount <> 0 Then
                ' if present then replace '%1 %2 %3' in the string by
                ' corresponding element in the given array

                If Not IsArray(args) Then
                    WScript.Echo getResource("L_INVALID_ERRORMESSAGE_TYPE_AS_INPUT")
                    WScript.Quit getResource("EXIT_INVALID_PARAM")
                End If
               
                If intValuesCount <> UBound(args)+1 Then
                    WScript.Echo getResource("L_INVALID_ERRORMESSAGE_ARG_NUMBER_AS_INPUT_ERRORMESSAGE")
                    WScript.Quit getResource("EXIT_INVALID_PARAM")
                End If

               For i = 1 to intValuesCount
                    strPhrase = Replace(strPhrase, "%" & Cstr(i), (args(i-1) ), 1, 1, VBBinaryCompare)
                Next

            End If

           WScript.Echo(strPhrase)

        End Sub

        ' Function which checks whether a given value matches a particular pattern
        '********************************************************************
        '* Function: matchPattern
        '*
        '* Purpose:  To check if the given pattern is existing in the string
        '*
        '* Input:
        '*  [in]     strMatchPattern   the pattern to look out for
        '*  [in]     strPhrase         string in which the pattern needs to be checked
        '*
        '* Output:   Returns number of occurrences if pattern present, 
        '*           Else returns CONST_NO_MATCHES_FOUND
        '*
        '********************************************************************
        Function matchPattern(ByVal strMatchPattern, ByVal strPhrase)

            ON ERROR RESUME NEXT
            Err.Clear

            Dim objRegEx        ' the regular expression object
            Dim Matches         ' the results that match the given pattern
            Dim intResultsCount ' the count of Matches
            
            intResultsCount = 0  ' initialize the count to 0

            'create instance of RegExp object
            Set objRegEx = New RegExp 
            If (NOT IsObject(objRegEx)) Then
                WScript.Echo (getResource("L_ERROR_CHECK_VBSCRIPT_VERSION_ERRORMESSAGE"))
            End If
            'find all matches
            objRegEx.Global = True
            'set case insensitive
            objRegEx.IgnoreCase = True
            'set the pattern
            objRegEx.Pattern = strMatchPattern

            Set Matches = objRegEx.Execute(strPhrase)
            intResultsCount = Matches.Count

            'test for match
            If intResultsCount > 0 Then
                matchPattern = intResultsCount
            Else
                matchPattern = getResource("CONST_NO_MATCHES_FOUND")
            End If

        End Function

        ' Function used to get the current Host name
        '********************************************************************
        '* Function: getHostName
        '*
        '* Purpose:  To get the Host Name
        '*
        '* Input:   objService                        ' the service object
        '*
        '* Output:   Returns the Host Name
        '*
        '********************************************************************
        Function getHostName ( ByVal ObjService)
            ON ERROR RESUME NEXT
            Err.Clear

            Dim objSystemSet          ' to store the InstancesOf Class
            Dim  System               ' to refer to the instances objSystemSet

           Set objSystemSet = objService.InstancesOf(getResource("OBJ_SYSTEMINFO_CLASS"))

            If Err.Number Then
                getHostName = getResource("TEXT_NA")
                Err.clear
            Else
                For each System in objSystemSet
                        If IsEmpty(System.Name) Then
                             getHostName = getResource("TEXT_NA")
                        Else
                            getHostName = System.Name
                        End If
                        Exit for
                Next
             End If
          End Function

        ' Function used to get the current User Name
        '********************************************************************
        '* Function: getUserName
        '*
        '* Purpose:  To get the User Name
        '*
        '* Input:   objService                        ' the service object
        '*
        '* Output:   Returns the User Name
        '*
        '********************************************************************
        Function getUserName ( ByVal ObjService)
            ON ERROR RESUME NEXT
            Err.Clear

            Dim objSystemSet          ' to store the InstancesOf Class
            Dim  System               ' to refer to the instances objSystemSet

            Set objSystemSet = objService.InstancesOf(getResource("OBJ_SYSTEMINFO_CLASS"))

            If Err.Number Then
                getUserName = getResource("TEXT_NA")
                Err.clear
            Else
                For each System in objSystemSet
                        If IsEmpty(System.UserName) Then
                             getUserName = getResource("TEXT_NA")
                        Else
                             getUserName = System.UserName
                        End If
                        Exit for
                Next
            End If
        End Function

        ' Function used to get the current Domain name
        '********************************************************************
        '* Function: getDomainName
        '*
        '* Purpose:  To get the Domain Name
        '*
        '* Input:  objService                        ' the service object
        '*
        '* Output:   Returns the Domain Name
        '*
        '********************************************************************
        Function getDomainName( ByVal ObjService)
            ON ERROR RESUME NEXT
            Err.Clear

            Dim objSystemSet          ' to store the InstancesOf Class
            Dim  System               ' to refer to the instances objSystemSet

            Set objSystemSet = objService.InstancesOf(getResource("OBJ_SYSTEMINFO_CLASS"))

            If Err.Number Then
                getDomainName = getResource("TEXT_NA")
                Err.clear
            Else
               For each System in objSystemSet
                        If IsEmpty(System.Domain) Then
                             getDomainName = getResource("TEXT_NA")
                        Else
                             getDomainName = System.Domain
                        End If
                        Exit for
                Next
            End If
        End Function

        ' Function used to get the password from the user
        '**********************************************************************
        '* Function: getPassword
        '*
        '* Purpose:  To get password from the user
        '*
        '* Input:    None
        '*
        '* Output:   Returns the Password specified by the user
        '*
        '**********************************************************************
        Function getPassword()
            ON ERROR RESUME NEXT
            Err.Clear

            Dim objPassword     ' the object to store  password.dll 

            WScript.Echo getResource("L_ENTER_PASSWORD_TEXT")
            Set objPassword = CreateObject(getResource("OBJ_SCRIPT_PASSWORD"))
            If NOT IsObject(objPassword) Then
                 ' error in getting the password
                WScript.Echo("")         'blank line
                WScript.Echo(getResource("L_HINT_CHECK_PASSWORD_DLL_MESSAGE"))
                WScript.Quit(getResource("EXIT_UNEXPECTED"))
            End If

            getPassword = objPassword.GetPassword
            ' WScript.Echo getResource("L_PROCESSING_TEXT")

        End Function

         ' Function used to trap error
        '**********************************************************************
        '* Function: trapError
        '*
        '* Purpose:  Reports error with a string saying what the error occurred in.
        '*
        '* Input:
        '*   [in]    strIn        string saying what the error occurred in.
        '*
        '* Output:   displayed on screen
        '*
        '**********************************************************************
        Function trapError (ByVal strIn)
         ON ERROR RESUME NEXT    

            If Err.Number Then
                Wscript.Echo( "Error (0x" & CStr(Hex(Err.Number)) & "): " & strIn)
                If Err.Description <> "" Then
                    Wscript.Echo( "Error description: " & Err.Description)
                End If
                Err.Clear
                trapError = TRUE
            Else
                trapError = FALSE
            End If
        End Function

	' Function used to get the arguments into appropriate variables
        '**********************************************************************
        '* Function: getArguments
        '*
        '* Purpose:  Gets the arguments specified into appropriate variables
        '*
        '* Input:
        '*   [in]    StrVarName                stores the parameter
        '*   [in]    strVar                    stores the parameter value
        '*   [in]    intArgIter                counts the no.of arguments
        '*   [in]    blnAllowNegativeValues    checks if negative parameter values are valid
        '*
        '* Output:   Returns TRUE or FALSE
        '*
        '**********************************************************************

        ' Function used to get the arguments into appropriate variables
        Function getArguments ( ByVal StrVarName,   _
                             ByRef strVar,       _
                             ByRef intArgIter,   _
                             ByVal blnAllowNegativeValues ) 
            ON ERROR RESUME NEXT
            Err.Clear

            'initialized to failure, changed to True upon successful completion
            getArguments = False 

            intArgIter = intArgIter + 1

            If intArgIter > (Wscript.Arguments.Count - 1) Then
                vbPrintf getResource("L_INVALID_SYNTAX_ERRORMESSAGE"), Array(Wscript.Arguments.Item(intArgIter-1))
                Exit Function
            End If

            strVar = Wscript.Arguments.Item(intArgIter)

            If Err.Number Then
                vbPrintf getResource("L_INVALID_ERRORMESSAGE"), Array(StrVarName)
                Call Wscript.Echo ( getResource("HINT_CHECK_INPUT") )
                Err.Clear
                Exit Function
            End If

                ' check for the input of   those  accept  negitive numeric values also.
                If blnAllowNegativeValues =True Then
                        ' the input can be a negative number
                        If matchPattern(getResource("PATTERN_NEGATIVE_NUMBER"), strVar) = getResource("CONST_NO_MATCHES_FOUND") Then
                                vbPrintf getResource("L_INVALID_ERRORMESSAGE"), Array(StrVarName)
                                Wscript.Echo ( getResource("HINT_CHECK_INPUT") )
                                Exit Function
                        End If
                End If

             getArguments = True 'success

    End Function

    ' Function used to connect to wmi provider with the given credentials
    '**************************************************************************
    '* Function: wmiConnect
    '*
    '* Purpose:  Connects to machine strServer.
    '*
    '* Input:
    '*   [in]    strServer       a machine name
    '*   [in]    strNameSpace    a namespace
    '*   [in]    strUserName     name of the current user
    '*   [in]    strPassword     password of the current user
    '*   [in/out] blnLocalConnection  a flag  for localConnection    
    '*   [out]   objService      a service object
    '*
    '* Output:   objService is returned  as a service object.
    '*
    '**************************************************************************
    Function wmiConnect( ByVal strNameSpace, _
                         ByVal strUserName,  _
                         ByVal strPassword,  _
                         ByVal strServer,    _
                         ByRef blnLocalConnection,   _
                         ByRef objService    )

        ON ERROR RESUME NEXT
        Err.Clear
        Dim objLocator ' the locator object

        wmiConnect = True     ' There is no error.

        'Create Locator object to connect to remote CIM object manager
        Set objLocator = CreateObject(getResource("OBJ_SCRIPTING_LOCATOR"))

        If Err.Number Then
            wmiConnect = False     ' An error occurred
            Exit Function
        End If

        'Connect to the namespace which is either local or remote
        Set objService = objLocator.ConnectServer (strServer, strNameSpace, _
            strUserName, strPassword)

         If Err.Number <> 0 Then
                If Err.Number = Clng(getResource("CONST_LOCAL_CREDENTIALS_SUPPLIED")) Then

                        If  Not  blnLocalConnection =True  then
                                ' -2147217308 number to catch local credentails supplied by WMI
                                Wscript.echo getResource("L_WARRING_LOCAL_CREDENTIALS_SUPPLIED_MESSAGE")

                                'setting the flag that target is local system to eleminate error message next time
                                blnLocalConnection = True
                        End If 
                        Err.Clear  ' clear the error number for local connection

                        ' Calling the Locator object to connect to local system
                        Set objService = objLocator.ConnectServer(strServer, strNameSpace, "" , "" )
                        If Err.Number <> 0 Then wmiConnect = False     ' An error occurred
                  Else
                        wmiConnect = False     ' An error occurred
                  End If
        End If

        ObjService.Security_.impersonationlevel = 3

    End Function

    ' Function used to pack the string to the given width
    '**************************************************************************
    '* Function: PackString
    '*
    '* Purpose:  Attaches spaces to a string to increase the length to intWidth.
    '*
    '* Input:
    '*  [in]     strString    a string
    '*  [in]     intWidth     the intended length of the string
    '*
    '* Output:   strPackString is returned as the packed (padded/truncated) string.
    '*
    '**************************************************************************
    Function packString( ByVal strString, ByVal intWidth)
        ON ERROR RESUME NEXT
        Err.Clear

        strString = CStr(strString)
        If Err.Number Then
            Call Wscript.Echo (getResource("L_INVALID_ERRORMESSAGE_TYPE_AS_INPUT"))
            Err.Clear
            Wscript.Quit(getResource("EXIT_INVALID_PARAM"))
        End If

        intWidth      = CInt(intWidth)

        If Err.Number Then
            Call Wscript.Echo (getResource("L_INVALID_ERRORMESSAGE_TYPE_AS_INPUT"))
            Err.Clear
            Wscript.Quit(getResource("EXIT_INVALID_PARAM"))
        End If

        If IsNull(strString) OR IsEmpty(strString) OR Len(strString) = 0 Then

            If intwidth = 0 then 

            packString = getResource("TEXT_NA") 
            Exit Function

            Else

            packString = getResource("TEXT_NA") & Space(intWidth-3)
            Exit Function

            End If   
        End If
        
        If intWidth >= LengthinBytes(strString) Then
        
            packString = strString  & Space(intWidth-LengthinBytes(strString))

        Else

            ' Handling Output format independent to column width  (width=0)   
        ' i.e print as it is . 
            If intWidth = 0 then
            ' print as it is.
                packString = LeftBytes(strString, LengthinBytes(strString))
            Else
                ' truncate the string
                packString = LeftBytes(strString, intWidth)
            End If

        End If

    End Function

    ' Function used to get length of the maximum length string in an array of strings
    '**************************************************************************
    '* Function: getMaxStringLength
    '*
    '* Purpose:  To get the length of longest string in the given array
    '*
    '* Input:    [in] arrStrings    an array of strings
    '*
    '* Output:   Returns length of longest string in the array
    '*           If error in input, displays message and quits
    '*
    '**************************************************************************

    Function getMaxStringLen(ByVal arrStrings)
        ON ERROR RESUME NEXT
        Err.Clear

        Dim intMaxLength   ' to store the maximum length of the string
        Dim intArrCount    ' used in the loop

        intMaxLength = 0
        ' quit if input is not an array
        If NOT IsArray(arrStrings) Then
            WScript.Echo getResource("L_INVALID_ERRORMESSAGE_TYPE_AS_INPUT")
            WScript.Quit(getResource("EXIT_INVALID_PARAM"))
        End If

        ' check for length of each element in the array
        For intArrCount = 0 To UBound(arrStrings)
            If LengthinBytes(arrStrings(intArrCount)) > intMaxLength Then
                intMaxLength = LengthinBytes(arrStrings(intArrCount))
            End If
        Next
        getMaxStringLen = intMaxLength
    End Function

    ' Function used to get length of actual bytes required by the string.
    '**************************************************************************
    '* Function: LengthinBytes
    '*
    '* Purpose:  To get the length of a string in Bytes.
    '*
    '* Input:    [in] strString    a String
    '*
    '* Output:   Returns length of a string in Bytes.
    '*
    '**************************************************************************

    Function LengthinBytes(ByVal strString)
	Dim i, strChar
	LengthinBytes = 0
	For i =1 To Len(strString)
	    strChar = Mid(strString, i, 1)
	    If Asc(strChar) > 255 OR Asc(strChar) < 0 Then
		LengthinBytes = LengthinBytes + 2
		Else
		    LengthinBytes = LengthinBytes + 1
		End If
	Next
    End Function

    ' Function used to get left n number of bytes from a string.
    '**************************************************************************
    '* Function: LeftBytes
    '*
    '* Purpose:  To get left n number of bytes from a string.
    '*
    '* Input:    [in] strString    a String
    '*
    '* Output:   Returns a string containing n number of bytes.
    '*
    '**************************************************************************

    Function LeftBytes(ByVal strString, ByVal intBytesLength)
	Dim i, strChar, LengthinBytes

	LengthinBytes = 0
	LeftBytes = ""

	For i =1 To Len(strString)
	    strChar = Mid(strString, i, 1)
	    If AscW(strChar) > 255 OR AscW(strChar) < 0 Then
		LengthinBytes = LengthinBytes + 2
    	    Else
		    LengthinBytes = LengthinBytes + 1
	    End If

	    'There will be a problem if intBytesLength is odd and LengthinBytes is even OR
	    'if intBytesLength is even and LengthinBytes is odd and the last character takes 2 bytes.

    	    If LengthinBytes = intBytesLength Then
		LeftBytes = LeftBytes & strChar
		Exit Function
	    ElseIf LengthinBytes > intBytesLength Then
		LeftBytes = LeftBytes & Space(1)
		Exit Function
	    Else
		LeftBytes = LeftBytes & strChar
	    End If
	Next

    End Function


  ' Function used to show results in the desired format
    '**************************************************************************
    '* Function: showResults
    '*
    '* Purpose:  To show results in the desired format
    '*
    '* Input:   
    '*        [in] arrHeader        an array of strings containing all the headers
    '*        [in] arrResultsArray  array containing all the records
    '*        [in] strFormat        CSV or LIST or TABLE
    '*        [in] blnPrintHeader   Boolean value indicating whether header
    '*                              should be printed or not
    '*        [in] arrBlnHide       an array containing boolean values. Each value
    '*                              indicates whether a particular value in a record
    '*                              is to be displayed or not
    '*
    '* Output:   Displays all the records in the required format
    '*
    '**************************************************************************
    Sub showResults( ByVal arrHeader,       _
                     ByVal arrResultsArray, _
                     ByVal arrMaxLength,    _
                     ByVal strFormat,       _
                     ByVal blnPrintHeader,  _
                     ByVal arrBlnHide       )

        Dim i, j                   ' used as loop variables
        Dim intTestResult          ' to store temporary results
        Dim intMaxHeaderLength     ' to store length of longest column header
        Dim strPackedString        ' to store the padded/truncated string
        Dim arrResults             ' to store the row to display(which is an array)
        Dim intColumnCount         ' to store the count for no.of columns

        ' get the maximum length of all the header names given
        intMaxHeaderLength = getMaxStringLen(arrHeader)

        ' initialize the values
        intColumnCount = UBound(arrHeader)
        intTestResult  = 0

        Select Case LCase(strFormat)

            Case LCase(getResource("DISPLAY_FMT_LIST_TEXT"))
               ' If LIST format is specified
               For i = 0 to UBound(arrResultsArray)
                    arrResults = arrResultsArray(i)
                    For j =  0 to UBound(arrResults)
                        If arrBlnHide(j) = 0 Then
                            intTestResult = arrHeader(j) & ":"
                            strPackedString = packString(intTestResult, intMaxHeaderLength+1)
                            WScript.Echo strPackedString & " " & arrResults(j)
                        End If
                    Next
                    ' print an empty line
                    WScript.Echo ""
             Next

            Case LCase(getResource("DISPLAY_FMT_CSV_TEXT"))
                ' If CSV format is specified
                If blnPrintHeader Then
                        strPackedString = ""
                        ' first print the header , if not already printed
                        For i = 0 to UBound(arrHeader)
                            If arrBlnHide(i) = 0 Then
                                intTestResult = InStr(1,arrHeader(i), ",", VBBinaryCompare)
                                If intTestResult > 0 Then
                                    arrHeader(i) = chr(34) & arrHeader(i) & chr(34)
                                Else 
                                  arrHeader(i) = chr(34) & arrHeader(i) & chr(34)
                                End If

                                strPackedString = strPackedString & arrHeader(i)

                                If (i+1) <= intColumnCount Then
                                    strPackedString = strPackedString & ","
                                End If
                            End If
                        Next
                        WScript.Echo strPackedString
                End If

                ' print all the comma separated values
                For i = 0 to UBound(arrResultsArray)
                    arrResults = arrResultsArray(i)
                    strPackedString = ""
                    For j =  0 to UBound(arrResults)
                       If arrBlnHide(j) = 0 Then
                        intTestResult = InStr(1,arrResults(j), ",", VBBinaryCompare)

                        If intTestResult > 0 Then
                            strPackedString = strPackedString & chr(34) & arrResults(j) & chr(34)
                        Else
                            strPackedString = strPackedString & chr(34) & arrResults(j) & chr(34) 
                        End If
                        
                        If (j+1) <= intColumnCount Then
                            strPackedString = strPackedString & ","
                          '  strPackedString = strPackedString & chr(34) & "," & chr(34)
                        End If
                    End If
                    Next
                    WScript.Echo strPackedString
                    strPackedString = ""
                Next

            Case LCase(getResource("DISPLAY_FMT_TABLE_TEXT"))
                ' If table format is asked for
                If blnPrintHeader Then
                    strPackedString = ""
                    ' print the header, if not already printed
                    For i = 0 to UBound(arrHeader)
                    If arrBlnHide(i) = 0 Then
                        strPackedString = strPackedString & " " & _
                                            packString(arrHeader(i), _
                                            arrMaxLength(i))
                    End If
                    Next

                    WScript.Echo strPackedString
                    strPackedString = ""
                    ' print the Underline to the column header
                    For i =  0 to UBound(arrHeader)
                       If arrBlnHide(i) = 0 Then

                       ' Handling Output format independent to column width  (width=0)   
                       Dim FinalString  
                       If arrMaxLength(i) = 0 then 
                            FinalString  =    packString(String(LengthinBytes(arrheader(i)),"-"), arrMaxLength(i))
                        Else
                            FinalString  =     packString(String(arrMaxLength(i),"-"), arrMaxLength(i))
                        End If
                            strPackedString = strPackedString & " " & FinalString  
                        End If
                    Next    

                    WScript.Echo strPackedString
                End If

                For i = 0 to UBound(arrResultsArray)
                    arrResults = arrResultsArray(i)
                    strPackedString = ""
                    For j = 0 to UBound(arrResults)
                    If arrBlnHide(j) = 0 Then
                        strPackedString = strPackedString & " " & _
                                       packString(arrResults(j), _
                                       arrMaxLength(j))
                     End If
                    Next
                    WScript.Echo strPackedString
                Next
        End Select

    End Sub

    
    '********************************************************************
    '* Function: strDateTime
    '*
    '* Purpose:  To validate the date-time format specified
    '*
    '* Input:
    '*           [in] strDateTime     the date-time string
    '*
    '* Output:   Returns true if valid format
    '*           Else displays error message and quits
    '*
    '********************************************************************
     Function validateDateTime(ByVal strDateTime)
        ON ERROR RESUME NEXT
        Err.Clear

        validateDateTime = False

        Dim arrDateTimeCheck    ' to store the date and time values
        Dim intMonth            ' to store the month(instead of array(subscript))
        Dim intDay              ' to store the day(instead of array(subscript))
        Dim intYear             ' to store the year(instead of array(subscript))
        Dim strTemp             ' to store temporary values
        Dim arrTemp             ' to store temporary values when split is used
        Dim intHour             ' to store the Hour(instead of array(subscript))
        Dim intMinute           ' to store the Minutes(instead of array(subscript))
        Dim intSecond           ' to store the Seconds(instead of array(subscript))

        ' strDateTime is of the format "mm/dd/yy|yyyy,hh:mm:ssPM"
        ' first split at the comma and separate date and time
        arrDateTimeCheck = split(strDateTime, ",",2,VBBinaryCompare)

        ' split the date and check if the month and day are in bounds
        arrTemp = split(arrDateTimeCheck(0), "/",3,VBBinaryCompare)

        intMonth = arrTemp(0)
        intDay   = arrTemp(1)
        intYear  = arrTemp(2)

        If ((CInt(intMonth) < 1) OR (CInt(intMonth) > 12) OR (CInt(intDay) < 1) OR (CInt(intDay) > 31)) Then
            vbPrintf getResource("L_INVALID_ERRORMESSAGE_DATE_ERRORMESSAGE"), Array(arrDateTimeCheck(0), strDateTime)
            WScript.quit(getResource("EXIT_INVALID_INPUT"))
            Exit Function
        End If

        If CInt(year(arrDateTimeCheck(0))) => 9999 OR CInt(year(arrDateTimeCheck(0))) < 1601 then
                vbPrintf getResource("L_INVALID_ERRORMESSAGE_DATE_ERRORMESSAGE"), Array(arrDateTimeCheck(0), strDateTime)
                WScript.quit(getResource("EXIT_INVALID_INPUT"))
                Exit Function
        End If

        ' split the time to hour, minute and second. Check for bounds
        arrTemp = split(arrDateTimeCheck(1), ":",3,VBBinaryCompare)

        intHour   = arrTemp(0)
        intMinute = arrTemp(1)
        intSecond = Left(arrTemp(2), (Len(arrTemp(2))-2)) ' remove the am or pm

        If ((CInt(intHour) < 1) OR (CInt(intHour) > 12)     OR _
            (CInt(intMinute) < 0) OR (CInt(intMinute) > 59) OR _
            (CInt(intSecond) < 0) OR (CInt(intSecond) > 59)) Then
                vbPrintf getResource("L_INVALID_ERRORMESSAGE_TIME_ERRORMESSAGE"), Array(arrDateTimeCheck(1),strDateTime)
                WScript.Quit(getResource("EXIT_INVALID_INPUT"))
                Exit Function
       End If

       ' check if the given date an time are valid
        If IsDate(arrDateTimeCheck(0)) Then
            strTemp = TimeValue(arrDateTimeCheck(1))
            If Err.Number Then
                Err.Clear
                vbPrintf getResource("L_INVALID_ERRORMESSAGE_TIME_ERRORMESSAGE"), Array(arrDateTimeCheck(1),strDateTime)
                WScript.Quit(getResource("EXIT_INVALID_INPUT"))
                Exit Function
            Else
                validateDateTime = TRUE
            End If
        Else
            vbPrintf getResource("L_INVALID_ERRORMESSAGE_DATE_ERRORMESSAGE"), Array(arrDateTimeCheck(0), strDateTime)
            WScript.Quit(getResource("EXIT_INVALID_INPUT"))
            Exit Function
        End If
    End Function

    '********************************************************************
    '* Function: changeToWMIDateTime
    '*
    '* Purpose:  To format the given date-time
    '*
    '* Input:    
    '*        [in] strDateTime     the date-time string
    '*        [in] strTimeZone    the TimeZone  of the Queried system
    '*
    '* Output:   Returns the formatted date-time string
    '*
    '********************************************************************
     Function changeToWMIDateTime(ByVal strDateTime,strTimeZone)
        ON ERROR RESUME NEXT
        Err.Clear

        Dim arrDateTimeCheck  ' to store the date-time values
        Dim strDate           ' to store temporary date value
        Dim arrDate           ' array to store date values(MMDDYYYY)
        Dim strMonth          ' to store Month value
        Dim strYear           ' to store Year value
        Dim strDay            ' to store Day  value
        Dim strTime           ' to store temporary date value
        Dim arrTime           ' array to store date values(MMDDYYYY)
        Dim i                 ' for looping
	Dim iYearPosition     ' Used to hold the position of year in Date.

        ' input strDateTime is like "mm/dd/yy|yyyy,hh:mm:ssAM|PM"
        ' input Timezone is like "'+|-' UUU"

        arrDateTimeCheck = split(strDateTime,",")
        ' Finally format the  input like "YYYYMMDDHHMMSS.000000+TIMEZONE"

        ' first format the month and day. Append the four digit year
	' Conver the 2 digit year to 4 digit year.
	' If there are already 4 digits, then don't worry.

	iYearPosition = InstrRev(arrDateTimeCheck(0),"/")
	If Len(arrDateTimeCheck(0)) - iYearPosition = 2 Then
		arrDateTimeCheck(0) = Left(arrDateTimeCheck(0),iYearPosition) & Left(Year(Date),2) & Right(arrDateTimeCheck(0),2)
	End If

        'now date is mm/dd/yyyy
        'Spliting the array for month,day,year
        arrDate = split(arrDateTimeCheck(0) , "/" )

        ' The date, month  must be of 2 digits
        ' If they are of single digit length < 2, append a "0"
        For i=0 to ubound(arrDate) - 1
            If Len(arrDate(i)) < 2 then
                arrDate(i) = "0" & arrdate(i)
            End If
        Next

        strMonth = arrDate(0)
        strDay   = arrDate(1)
        strYear  = arrDate(2)

        'for 'YYYYMMDD' Pattern
        strDate = strYear & strMonth & strDay        

        ' Take the Time for formating 
        strTime  =  arrDateTimeCheck(1) 

        'NOW arrDateTimeCheck(1)="HH:MM:SSAM|PM".
        'here formating Time 24Hours independent of Locale separator  

        'Spliting the array for HH MM SS
        arrTime = split(strTime , ":" )           

        'Looking for [A|P]M string 
       If  Instr(1,Lcase(arrTime(2)),Lcase("AM"),VBBinaryCompare) > 0 Then 
                   'AM Conversion  for 24H
               If  arrTime(0) >=  12 Then
                    arrTime(0) = arrTime(0) - 12 
               End If        

        Else
                    'PM Conversion for 24H
               If  arrTime(0)  < 12 Then
                       arrTime(0) =arrTime(0) + 12 
               End If

       End If 

        'Adding leading zero  if third element  is  S[A|P]M
        If Len( arrTime(2)) = 3 then   arrTime(2)  = "0" & arrTime(2)  

        'Removing  AM|PM from  third  element in the  array 
        arrTime(2) =Mid(arrTime(2),1,2) 

        ' The hours, mins and secs must be of 2 digits
        ' If they are of single digit i.e Len < 2 , append a "0"
        For i=0 to ubound(arrTime) 
                If Len(arrTime(i)) < 2 then
                       arrTime(i) = "0" & arrTime(i)
                End If
        Next

        strTime = Join( arrTime ,"") ' formatting as HHMMSS

        ' Return the total format as "YYYYMMDDHHMMSS.000000+TIMEZONE"
         ChangeToWMIDateTime = strDate & strTime & ".000000" & strTimeZone

End Function

    ]]>
</script>
</component>
</package>
