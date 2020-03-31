
    </tr>

    <tr TABINDEX=-1 CLASS="contents">
        <td rowspan="3">
            <img src="../images/redshd.gif">
        </td>
    </tr>

    <tr>
        <td valign="center">
            <input TABINDEX=4 ID="radioDisAgree" name="Agreement" type="radio" value=false onClick="window.parent.AURadioClicked(); window.parent.OnClick();" onfocus="window.parent.OnFocus();">
        </td>
        <td>
            <LABEL TABINDEX=-1 ACCESSKEY="O" id="AU_DisAgree" for="radioDisAgree">
                <span ID="AU_decline" class="emphasis-greater">
                    <ID id="txtAU15a">N<u>o</u>t right now</ID>
                </span>
            </LABEL>
        </td>
    </tr>
    
    <tr>
        <td>
            <!-- Leave space under the radio button -->
        </td>
        <td>
            <span ID="AU_decline_explanation" class="text-primary">
                <ID id="txtAU15b">If you haven't turned on Automatic Updates, your computer is more vulnerable to viruses and other security threats.</ID>
            </span>
        </td>
    </tr>

    </table>


    <table ID=tabl2 tabindex=-1 border=0 width=80% style="position:absolute; left:7.5%; top:84%">
    <tr>
        <td class="text-primary" ID=PrivacyPolicyText>
        <ID id="au_privacy_policy"><B>No information is collected that can be used to identify you or contact you.</B><BR>Please read the <a id=au_privacy_policy_link TABINDEX=4 style="text-decoration:underline;" href="javascript:window.parent.navigatetoPrivacy('AutoUpdate_Policy');">Windows Update privacy statement</a>.</id>
        </td>
    </tr>
    </table>

    <!-- Navigation buttons -->

    <table id=tabl3 border=0 class="newbuttonposition">
    <tr>
        <td width=10>&nbsp;&nbsp;</td>
        <td><BUTTON ID="btnBack" class="newbuttonsBack" TABINDEX=6  ACCESSKEY="B" style="visibility:visible;"></BUTTON></td>
        <td nowrap valign=middle class="text-primary"><span id="BackBtnLocalText" style="visibility:visible;"><label for=btnBack><id id="LocalBtnBack_Text"><u>B</u>ack</id></label></span></td>

        <td width=99%>&nbsp;</td>
        <td nowrap valign=middle class="text-primary"><span id="SkipBtnLocalText" style="visibility:hidden;"><label for=btnSkip><id id="LocalBtnSkip_Text"><u>S</u>kip</id></label></span></td>
        <td><BUTTON ID="btnSkip" class="newbuttonsSkip" TABINDEX=-1 ACCESSKEY="S" style="visibility:hidden;"></BUTTON></td>

        <td width=10>&nbsp;&nbsp;</td>
        <td nowrap valign=middle class="text-primary">
            <span id="NextBtnLocalText" style="display:none;"><label for=btnNext><id id="LocalBtnNext_Text"><u>N</u>ext</id></label></span>
            <span id="FiniBtnLocalText" style="display:none;"><label for=btnFinish><id id="LocalBtnFini_Text"><u>F</u>inish</id></label></span>
        </td>
        <td>
            <BUTTON ID="btnNext"   class="newbuttonsNext" TABINDEX=7  ACCESSKEY="N" style="display:none;"></BUTTON>
            <BUTTON ID="btnFinish" class="newbuttonsNext" TABINDEX=7  ACCESSKEY="F" style="display:none;"></BUTTON>
        </td>
    </tr>
    </table>

    </td>
</tr>
</table>
</body>
</html>

