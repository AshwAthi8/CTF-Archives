t.ActLan_LoadMe();">

<table border=0 cellpadding=0 cellspacing=0 width="100%" height="100%">
<tr>
    <td ID=leftmargincell width=5% height=99%></td>
    <td ID=maincell valign=top class="text-primary">

    <span ID=Title_Text class="title" style="display:none;">
    <ID id=Activation_Title_Text1>Configure your network settings</ID>
    </span>

    <br>
    <span id="actlan_spn01" class="text-primary">
        <ID id=actcon_paragraph1>If your connection to the Internet requires a proxy server to be configured, please provide these settings below. Contact your network administrator if you have questions about which settings to use.</id>

        <br><br>
        <table class="text-primary">
        <tr>
            <td colspan="5"><ID id="actconn_set1"><b>Automatic configuration</b></ID></td>
        </tr>
        <tr>
            <td colspan="5"><ID id="actconn_desc1">Automatic configuration might override your manual configuration. If you enter any proxy settings, clear the check box labeled "Automatically detect settings," to ensure that your changes are applied.</ID></td>
        </tr>
        <tr>
            <td width="0"><input type="checkbox" name="cb_auto_detect" id="cb_auto_detect" TABINDEX=1 ACCESSKEY="A"></td>
            <td width="100%" colspan="4"><label id="lbl_auto_detect" for="cb_auto_detect"><u>A</u>utomatically detect settings</label></td>
        </tr>
        <tr>
            <td colspan="5">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="5"><ID id="actconn_set2"><b>Proxy server</b></ID></td>
        </tr>
        <tr>
            <td width="0"><input type="checkbox" name="cb_use_proxy" id="cb_use_proxy" TABINDEX=2 ACCESSKEY="X" onClick="window.parent.ActLan_upClickHandler();"></td>
            <td width="100%" colspan="4"><label id="lbl_use_proxy" for="cb_use_proxy">Use a pro<u>x</u>y server</label></td>
        </tr>
        <tr>
            <td width="0">&nbsp;</td>
            <td width="0" id="lblProxyUrl" nowrap><label id="lbl_proxy_url" for="txt_proxy_url">Add<u>r</u>ess:</label></td>
            <td width="40%"><input type="text" id="txt_proxy_url" size="25"  TABINDEX=3 ACCESSKEY="R" style="ime-mode:disabled; background-Color:'#dddddd'"></td>
            <td width="0" id="lblProxyPort" nowrap><label id="lbl_proxy_port" for="txt_proxy_port">Por<u>t</u>:</label></td>
            <td width="60%"><input type="text" id="txt_proxy_port" size="6" TABINDEX=4 ACCESSKEY="T" style="ime-mode:disabled; background-Color:'#dddddd'"></td>
        </tr>
        </table>


        <br><br>
        <ID id=activation_paragraph2>To continue, click Next.</id>
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
            <BUTTON ID="btnSkip" class="buttons" TABINDEX=5 ACCESSKEY="S"><label for=btnSkip><id id="LocalBtnSkip_Text"><u>S</u>kip</id></label></BUTTON>
            </td>
            <td>
            <BUTTON ID="btnBack" class="buttons" TABINDEX=6 ACCESSKEY="B"><label for=btnBack><id id="LocalBtnBack_Text"><u>B</u>ack</id></label></BUTTON>
            </td>
            <td>
            <BUTTON ID="btnNext" class="buttons" TABINDEX=7 ACCESSKEY="N"><label for=btnNext><id id="LocalBtnNext_Text"><u>N</u>ext</id></label></BUTTON>
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

