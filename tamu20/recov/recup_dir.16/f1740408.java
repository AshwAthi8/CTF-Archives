0%" height="100%">
<tr>

    <td ID=leftmargincell width=5% height=99%></td>
    <td ID=maincell valign=top class="text-primary">


    <span ID=Title_Text class="title" style="display:none;"><ID id="drdyoem_1">Preparing to activate online</ID></span>

    <br>
    <span id=RegDialReadyIntro class="text-primary">
        <ID id="drdyoem_2a">Windows will now dial a telephone number to activate Windows with Microsoft.</id>
    </span>

    <br><br>
    <span id="DialRdy_ctrl1" style="visibility:hidden;">

        
        <span class="text-primary"><ID id="drdyoem_4">To proceed, provide the information below and click <b>Next</b>. To continue without dialing on your telephone line, click <b>Remind me later</b>.</id></span>
        <br><br>        
        <span class="text-primary"><ID id="drdyoem_8">Select the <U>c</U>ountry/region where you are now.  Click the down arrow, or press the ALT + &quot;DOWN ARROW&quot; keys to view the list of regions.</id></span>
        <br><br>
        <select id=selCountry TABINDEX=1 ACCESSKEY="C">
            <script language="javascript">
            document.write(window.parent.external.Tapi.get_AllCountryName);
            </script>
        </select>
        

        <br><br>
        <span class="text-primary"><ID id="drdyoem_11">Enter your telephone <u>a</u>rea code. (e.g., 425 in 425-555-1212).<id></span>
        <input style="ime-mode:disabled" id=edtAreaCode ACCESSKEY="A" TABINDEX=2 type="text" name="textfield" size="7" maxlength="7" onkeypress="window.parent.KeyPressIsNumeric();">
        
        <br>
        <span id="PulseToneDialing" style="visibility:hidden">
        <LABEL TABINDEX=-1 ACCESSKEY="T" id=Tapi_TOUCHTONE for="radioTouchToneYes">Do you have <U>t</U>ouch tone service?</label>
        <input TABINDEX=3 type="radio" name=TouchTone checked id=radioTouchToneYes>
        <LABEL TABINDEX=-1 id="Tapi_TOUCHTONE_YES" for="radioTouchToneYes">Yes</LABEL>
        <input TABINDEX=4 type="radio" name=TouchTone  id=radioTouchToneNo>
        <LABEL TABINDEX=-1 id="Tapi_TOUCHTONE_NO" for="radioTouchToneNo">No</LABEL>
        </span>

    </span>


    <!-- OUTSIDE LINE -->
    <br>
    <span id="spnOutsideLine" style="visibility:hidden;">
        <LABEL TABINDEX=-1 ACCESSKEY="O" id="drdyref_OUTSIDELINE1" for="radioOutSideLineYes">Do you dial a number to access an <U>o</U>utside line?</label>
        <input TABINDEX=5 type="radio" checked name=OutsideLine id=radioOutsideLineYes>
        <LABEL TABINDEX=-1 id="drdyref_OUTSIDELINE_YES" for="radioOutsideLineYes">Yes</LABEL>
        <input TABINDEX=6 type="radio" name=OutsideLine id=radioOutsideLineNo>
        <LABEL TABINDEX=-1 id="drdyref_OUTSIDELINE_NO" for="radioOutSideLineNo">No</LABEL>
    </span>
    <br>
    <SPAN TABINDEX=-1 id="spnOutsideLineNumber" style="visibility:hidden; position:relative;">                  
        <LABEL TABINDEX=-1 ACCESSKEY="W" ID="drdyref_OUTSIDELINE2" for=edtOutsideLineNumber><U>W</U>hat is that number?</LABEL>
        <input TABINDEX=7 style="ime-mode:disabled;" type="text" id=edtOutsideLineNumber maxlength=10 size="4" onkeypress="window.parent.KeyPressIsNumeric();">
    </SPAN>

    </td>

    <td ID=rightmargincell width=7%>
    </td>
</tr>
<tr>
    <td colspan=3>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="text-primary"><ID id="drdyoem_2b">To begin dialing, click <b>Next</b>.</id></span>
    <br>
    <table border=0 class="buttonpositionnew">
    <tr>
        <td width=99%>&nbsp;</td>
        <td>
        <BUTTON ID="btnBack" class="buttons" TABINDEX=8 ACCESSKEY="B"><label for=btnBack><id id="LocalBtnBack_Text"><u>B</u>ack</id></label></BUTTON>
        </td>
        <td>
        <BUTTON ID="btnSkip" class="buttons" TABINDEX=9 ACCESSKEY="S"><label for=btnSkip><id id="LocalBtnSkip_Text"><u>S</u>kip</id></label></BUTTON>
        </td>
        <td>
        <BUTTON ID="btnNext" class="buttons" TABINDEX=10 ACCESSKEY="N"><label for=btnNext><id id="LocalBtnNext_Text"><u>N</u>ext</id></label></BUTTON>
        </td>
    </tr>
    </table>
    </td>
</tr>
</table>

</body>
</html>
