t.Activation_LoadMe();">

<table border=0 cellpadding=0 cellspacing=0 width="100%" height="100%">
<tr>
    <td ID=leftmargincell width=5% height=99%></td>
    <td ID=maincell valign=top class="text-primary">

    <!-- Title is "display:none" by design, GetPageTitle() in actshell.htm extracts this title -->
    <span ID=Title_Text class="title" style="display:none;">
    <ID id=Activation_Title_Text1>Let's activate Windows</ID>
    </span>

    <br>
    <div>
    <span id="act_spn01" class="text-primary">


        <span id="act_par01_HaveDays" style="display:none;"><ID id=activation_paragraph1a>To help reduce software piracy, please activate your copy of Windows now. Activation over the Internet is quick and easy.</id></span>
        <span id="act_par01_ZeroDays" style="display:none;"><ID id=activation_paragraph1b>This copy of Windows must be activated with Microsoft before you can continue using it. Activation over the Internet is quick and easy.</id></span>

        <br><br>
        <ID id=activation_paragraph3><B>You don't need to give your name or other personal information when you activate Windows.</B></id>

        <br><br>
        <ID id=activation_paragraph5>Do you want to activate Windows now?</id>

        <!-- WPA radio buttons -->
        <br><br>
        <SPAN TABINDEX=-1>
            <table cellspacing=0 cellpadding=0>
            <tr>
                <td>&nbsp;&nbsp;
                <input TABINDEX=1 ACCESSKEY="Y" type="radio" ID="rb_act_1" value="" name="activate_check" onClick="window.parent.WPA_ActivationRadioClicked(); window.parent.OnClick();" onfocus="window.parent.OnFocus();">
                </td>
                <td>
                <LABEL id="rb_txt1" for="rb_act_1">
                <span id="act_spn1" class="text-primary"><ID id=activation_choice1><u>Y</u>es, let's activate Windows over the Internet now</id></span>
                </LABEL>
                </td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;
                <input TABINDEX=2 ACCESSKEY="T" type="radio" ID="rb_act_2" value="" name="activate_check" onClick="window.parent.WPA_ActivationRadioClicked(); window.parent.OnClick();" onfocus="window.parent.OnFocus();">
                </td>
                <td>
                <LABEL id="rb_txt2" for="rb_act_2">
                <span id="act_spn2" class="text-primary"><ID id=activation_choice2>Yes, I want to <u>t</u>elephone a customer service representative to activate Windows</id></span>
                </LABEL>
                </td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;
                <input TABINDEX=3 ACCESSKEY="O" type="radio" ID="rb_act_3" value="" name="activate_check" onClick="window.parent.WPA_ActivationRadioClicked(); window.parent.OnClick();" onfocus="window.parent.OnFocus();">
                </td>
                <td>
                <LABEL id="rb_txt3" for="rb_act_3">
                <span id="act_spn3" class="text-primary"><ID id=activation_choice3>N<u>o</u>, remind me to activate Windows every few days</id></span>
                </LABEL>
                </td>
            </tr>
            </table>
        </SPAN>
        
        <br>       
        <span id="act_par02_HaveDays" style="display:none;">
            <ID id=activation_paragraph4>If you wait to activate, you can still use Windows, but you will receive periodic reminders.<br>After&nbsp;<span id=NumberDaysLeft1 class="text-primary" ></span>&nbsp;day(s), you must activate Windows before you can continue to use it.</id>
        </span>

        <br><br>
        <ID id=activation_paragraph6>Microsoft is committed to your privacy. For more information, &nbsp;</id><a TABINDEX=3 id=ahref1 href="javascript:window.parent.navigatetoActPolicy();"><ID id=activation_paragraph_readprivacy><u>read the Windows Product Activation Privacy Statement</u></ID></a>
        <br><br>
        <ID id=activation_paragraph7>To continue, click Next.</id>

        <span id="act_par03_Tablet" style="display:none;">
            <ID id=activation_paragraph_tablet>(You may need to use a keyboard to enter text in the following pages.)</ID>
        </span>
    </span>

    </td>

    <td ID=rightmargincell width=7%>
    </td>
</tr>
<tr>
    <td colspan=3>
    <br>
    <table border=0 class="buttonpositionnew">
    <tr>
        <td width="99%">&nbsp;</td>
        <td>
        <table border=0 width="100">
        <tr>
            <td>
            <BUTTON ID="btnPlaceholder" class="buttons" TABINDEX=6 ACCESSKEY="T" style="visibility:hidden;"><label for=btnPlaceholder><id id="LocalPlaceholder_Text">Placeholder</id></label></BUTTON>
            </td>
            <td>
            <BUTTON ID="btnNext" class="buttons" TABINDEX=6 ACCESSKEY="N"><label for=btnNext><id id="LocalBtnNext_Text"><u>N</u>ext</id></label></BUTTON>
            </td>
        </tr>
        </table>
        </td>
    </tr>
    </table>
    </td>
</tr>
</table>

</body>
</html>

