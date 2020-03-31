=MainPageCell border=0 cellpadding=0 cellspacing=0 width="100%" height="100%">
<tr>
    <td ID=leftmargincell width=5% height=99%></td>
    <td ID=maincell valign=top class="text-primary">

    <span ID=Title_Text class="title" style="display:none;">
    <ID id=t34>Collecting registration data</ID>

    </span>

    <br>
    <table border=0>
    <tr>
        <td width=95>&nbsp;</td>
        <td class="Text-small"><ID id=ausrinfo_tabkey>To move to the next text box, press the TAB key.</ID></td>
    </tr>
    </table>
    <table ID=FieldTable border=0>
    <tr>
      <td id=LabelColumn><LABEL class="text-primary" for=UserFirstName ACCESSKEY="F" ID=LabelFirstName>*<u>F</u>irst name:</LABEL></td>
      <td colspan=3><input name="firstname" size="30" maxlength="75" class="editbox-text-primary"
            id=UserFirstName onfocus="window.parent.OnFocus();"></td>
    </tr>
    <tr ID=LastNameRow>
      <td><LABEL class="text-primary" for=UserLastName ACCESSKEY="L" ID=LabelLastName>*<u>L</u>ast name:</LABEL></td>
      <td><input name="lastname" size="30" maxlength="75" class="editbox-text-primary"
           id=UserLastName onfocus="window.parent.OnFocus();"
           ></td>
    </tr>
    <tr>
      <td><LABEL class="text-primary" for=UserAddress ACCESSKEY="A" ID=LabelAddress>*<u>A</u>ddress:</LABEL></td>
      <td><input name="Address" size="30" maxlength="120" class="editbox-text-primary"
           id=UserAddress onfocus="window.parent.OnFocus();"
           ></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><input name="Address2" size="30" maxlength="120" class="editbox-text-primary"
           id=UserAddress2 onfocus="window.parent.OnFocus();"
           ></td>
    </tr>
    <tr>
      <td><LABEL class="text-primary" for=UserCity ACCESSKEY="C" ID=LabelCity>*<u>C</u>ity:</LABEL></td>
      <td><input name="City" size="30" maxlength="50" class="editbox-text-primary"
           id=UserCity onfocus="window.parent.OnFocus();"></td>
    </tr>
    <tr>
      <td><!-- LABEL "for" attrib set dynamically-->
          <SPAN ID=LabelLeft>
            <LABEL ID=StateLabel class="text-primary" ACCESSKEY="P">*State/<u>P</u>rovince:</LABEL>
          </span>
      </td>
      <td>
       <SPAN ID=MenuLeft>
        <span ID=StateContainer name="StateSelect">
        <!-- only 1 of the following three will be displayed at once -->
        <input name="State" style="display:none" size="17" maxlength="50" class="editbox-text-primary"
           id=UserStateTextBox onfocus="window.parent.OnFocus();">

            <!-- WW is placeholder for bug workaround, will be deleted onload -->
            <select id=selUSState size=1 class="editbox-text-primary" onfocus="window.parent.OnFocus();" onclick="window.parent.OnSelectClick();" onchange="window.parent.Reg3UserStateChanged();">
             <OPTION VALUE="0">WW
            </select>

            <select style="display:none" class="editbox-text-primary" id=selCAProvince size=1 onfocus="window.parent.OnFocus();" onclick="window.parent.OnSelectClick();" onchange="window.parent.Reg3UserStateChanged();">  </select>
            </span>
            </span>
            &nbsp;

       <SPAN ID=LabelRight>
       <LABEL class="text-primary" for=UserZipCode ACCESSKEY="Z"  ID=LabelZIP>Postal or <u>Z</u>IP code:</LABEL>
       </span>
       <SPAN ID=MenuRight>

       <input style="ime-mode:disabled" name="Zipcode" size="10" maxlength="15" class="editbox-text-primary"
           id=UserZipCode onfocus="window.parent.OnFocus();">
       </span>
        </td>
    </tr>
    <tr>
        <td>
        <LABEL class="text-primary" for=selCountry ACCESSKEY="T" ID=LabelCountry>*Coun<u>t</u>ry/Region:</LABEL>
        </td>
        <td>
        <select id=selCountry size=1 class="editbox-text-primary" onfocus="window.parent.OnFocus();" onclick="window.parent.OnSelectClick();" onchange="window.parent.Reg3UserCountryChanged();">
        <script language="javascript">  document.write(window.parent.external.Tapi.get_AllCountryName); </script>
        </select>
        </td>
    </tr>
    <tr ID=FE_ZIPRow style="display:none">  <!-- filled in FarEast cases -->
        <td ID=FE_ZIPLabel></td><td ID=FE_ZIPInput></td>
    </tr>
    <tr>
      <td id=LabelColumn><LABEL class="text-primary" for=UserEmailAddress ACCESSKEY="E" ID=LabelEmail><u>E</u>-mail address:</LABEL></td>
      <td><input style="ime-mode:disabled" name="Email" size="30" maxlength="75" class="editbox-text-primary" id=UserEmailAddress onfocus="window.parent.OnFocus();">
      </td>
    </tr>
    </table>

    <SPAN ID="RegChkBxMSGrp">
    <table border=0 cellspacing=0 cellpadding=0 class="text-primary"  style="width:100%;">
    <tr class="font9pt">
        <td>
            <input ACCESSKEY="M" type="checkbox" id="sharems" name="sharems" class="text-primary" value="share ms" onfocus="window.parent.OnFocus();">
            <LABEL id="cb_txt1" for="sharems" class="text-primary">Send me promotions and offers from <u>M</u>icrosoft</LABEL>&nbsp;
        </td>
    </tr>
        <tr class="font9pt">
        <td>
            <input ACCESSKEY="D" type="checkbox" id="sharemsPartners" name="sharemsPartners" class="text-primary" value="share msPartners" onfocus="window.parent.OnFocus();">
            <LABEL id="cb_txt2" for="sharemsPartners" class="text-primary">Sen<u>d</u> me promotions and offers from Microsoft's partners</LABEL>&nbsp;
        </td>
    </tr>
    </table>
    </span>

    <br>
    <!-- error messages (replaced by agent?) -->
    <DIV class="text-error" ID=error_mesg style="display:none; padding-top:20px">
    </div>

    <!-- legal message for France, Belgium, or other localization -->
    <DIV class="text-primary" ID=cnil_mesg style="display:none; padding-top:20px">
    </DIV>

    <td ID=rightmargincell width=7%>
    </td>
</tr>
<tr>
    <td colspan=3>
    <br>
    <table border=0 class="buttonpositionnew">
    <tr>
        <td width=99%>&nbsp;</td>
        <td>
        <BUTTON ID="btnSkip" class="buttons" TABINDEX=4 ACCESSKEY="S"><label for=btnSkip><id id="LocalBtnSkip_Text"><u>S</u>kip</id></label></BUTTON>
        </td>
        <td>
        <BUTTON ID="btnBack" class="buttons" TABINDEX=5 ACCESSKEY="B"><label for=btnBack><id id="LocalBtnBack_Text"><u>B</u>ack</id></label></BUTTON>
        </td>
        <td>
        <BUTTON ID="btnNext" class="buttons" TABINDEX=6 ACCESSKEY="N"><label for=btnNext><id id="LocalBtnNext_Text"><u>N</u>ext</id></label></BUTTON>
        </td>
    </tr>
    </table>
    </td>
</tr>
</table>

</html>
