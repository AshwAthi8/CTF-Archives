sid="clsid:B0395DA5-6A15-4E44-9F36-9A9DC7A2F341" tabIndex='-1'>  <!-- do not display the notch for horizontal taskpads-->
                    <PARAM NAME="Notch" VALUE="0"></PARAM>
                </object>
            </TD>
        </TR>
        <tr ID="DescriptionRow">
            <td id='TaskpadDescription' >
                @@CONSOLETASKPADDESCRIPTION@@<BR />
            </td>
        </tr>
        <tr id="TopPanelRow" style="height:100%;">
            <td id='TopPanel' style="padding:0; border:solid windowtext 1;" >
                <DIV id ="MMCViewElement" style="position:relative; height:100%; width:100%; left:0%;" ></DIV>
            </td>
        </tr>
        <TR valign="top">
            <TD ID="BottomPanel" VALIGN="TOP">
                <DIV  STYLE="overflow-y:auto; overflow-x:none; height:@@BOTTOMPANEHEIGHT@@;">
                    @@TASKS@@
                </DIV>
            </TD>                    
        </TR>
    </TABLE>
    <object id='MMCEvents' classid="clsid:ADE6444B-C91F-4e37-92A4-5BB430A33340" tabIndex='-1'></object>
</body>  

<!--NOTE: this file is expected to be ANSI - do not add any localizable strings to it !!! -->
    <SPAN CLASS='cInline'>
        <TABLE  BORDER='0' WIDTH='100%%'>
        <TR>
            <TD>
%s
            </TD>
        </TR>
        <TR>
            <TD VALIGN='TOP' width=
'%d'
             height=
'%d'
            >
                <object  id=
'Icon%d'
                CLASSID='clsid:44F9A03B-A3EC-4F3B-9364-08E0007F21DF' tabIndex='-1'
                style='width:
%d;
                height:
%d;'
                >
                    <param NAME="ConsoleTaskID" value=
'%d'
                    ></param>
                    <param NAME="Small" value=
'%s'
                    ></param>
                </object>
            </TD>
            <TD>
                <SPAN CLASS="Task" onmouseover="javascript:window.event.srcElement.className='TaskHover';" onmouseout="javascript:window.event.srcElement.className='Task';" onclick=
"javascript:window.event.srcElement.className='Task';Icon%d_Clicked();"  onkeypress="if ((window.event.keyCode==13) || (window.event.keyCode==32)) Icon%d_Clicked();"  id=
'%s'               parameter=
'%s'
%s               tabIndex="0">
%s
                </SPAN>
%s
            </TD>
        </TR>
        </TABLE>
    </SPAN>

    <SCRIPT LANGUAGE="JAVASCRIPT" for=
'Icon%d'
            EVENT="Click">
Icon%d_Clicked();
    </SCRIPT>

    <SCRIPT LANGUAGE="JAVASCRIPT">
      function Icon%d_Clicked()
      {
         try
         {
            %s
         } catch(e)
         {
            window.alert(e.description)
         }
      }

   </SCRIPT>

