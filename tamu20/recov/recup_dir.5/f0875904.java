AutoUpdate');"
      onunload="window.parent.Agent_Deactivate();">

<table border=0 cellpadding=0 cellspacing=0 width=100% height=100%>
<tr>
    <td ID=leftmargincell width=7%></td>
    <td ID=maincell valign=middle class="text-primary">

    <br><br>
    <span class="title">
        <ID id=AutoUpdateTitle>Schützen Sie den Computer</ID>
    </span>

    <br><br><br>
    <table border=0 width="95%">
    <tr>
        <td ID="AU_par1" class="text-primary">
            <span ID=AutoUpdateIntro class="text-primary"><ID id="txtAUPar1"></ID></span>
        </td>
    </tr>
    </table>

    <br>
    <table border=0 width="95%">

    <!-- AU Radio Buttons -->
    <tr TABINDEX=-1 CLASS="contents">
        <td rowspan="4">
            <img src="../images/greenshd.gif">
        </td>
    </tr>
    
    <tr>
        <br>
    </tr>
    
    <tr>
        <td valign="center">
            <input TABINDEX=3 ID="radioAgree" name="Agreement" type="radio" onClick="window.parent.AURadioClicked(); window.parent.OnClick();" onfocus="window.parent.OnFocus();">
        </td>
        <td>
            <LABEL TABINDEX=-1 ACCESSKEY="S" id="AU_Agree" for="radioAgree">
                <span ID="AU_accept" class="emphasis-greater">
                    <ID id="txtAU13a"><u>S</u>chützen Sie den Computer, indem Sie automatische Updates jetzt aktivieren</ID>
                </span>
            </LABEL>
        </td>
    </tr>
    
    <tr>
        <td>
            <!-- Leave space under the radio button -->
        </td>
        <td>
            <span ID="AU_accept_explanation" class="text-primary">
                <ID id="txtAU13b">(empfohlen)</ID>
            </span>
        </td>
    </tr>

    <tr>
        <td>
            <!-- This empty cell adds space between the two radio sections -->
            <br>
        </td>
    </tr>

    <tr>
        <td>
            <!-- This empty cell adds space between the two radio sections -->
            <br>
        </td>
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
            <LABEL TABINDEX=-1 ACCESSKEY="N" id="AU_DisAgree" for="radioDisAgree">
                <span ID="AU_decline" class="emphasis-greater">
                    <ID id="txtAU15a"><u>N</u>ein, jetzt nicht</ID>
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
                <ID id="txtAU15b">Wenn Sie automatische Updates nicht aktivieren, erhöht sich das Sicherheitsrisiko in Bezug auf Viren und andere Angriffe.</ID>
            </span>
        </td>
    </tr>

    </table>


    <table ID=tabl2 tabindex=-1 border=0 width=80% style="position:absolute; left:7.5%; top:74%">
    <tr>
        <td class="text-primary" ID=PrivacyPolicyText>
        <ID id="au_privacy_policy"><B>Es werden keine Informationen gesammelt, die dazu verwendet werden können, Sie persönlich zu identifizieren bzw. Kontakt mit Ihnen aufzunehmen.</B><BR>Lesen Sie die <a id=au_privacy_policy_link TABINDEX=4 style="text-decoration:underline;" href="javascript:window.parent.navigatetoPrivacy('AutoUpdate_Policy');">Windows Update-Datenschutzrichtlinie</a>.</id>
        </td>
    </tr>
    </table>

    <!-- Navigation buttons -->

    <table id=tabl3 border=0 class="newbuttonposition">
    <tr>
        <td width=10>&nbsp;&nbsp;</td>
        <td><BUTTON ID="btnBack" class="newbuttonsBack" TABINDEX=6  ACCESSKEY="Z" style="visibility:visible;"></BUTTON></td>
        <td nowrap valign=middle class="text-primary"><span id="BackBtnLocalText" style="visibility:visible;"><label for=btnBack><id id="LocalBtnBack_Text"><u>Z</u>urück</id></label></span></td>

        <td width=99%>&nbsp;</td>
        <td nowrap valign=middle class="text-primary"><span id="SkipBtnLocalText" style="visibility:hidden;"><label for=btnSkip><id id="LocalBtnSkip_Text">