ileList.length) {
        g_rgJobList = new Array(rgFileList.length);
    }
}

function onClose() {
    window.close();
}

//-->
</SCRIPT>


  <STYLE ID="CompatibilityDataDialogStyle" TYPE="text/css">
     HTML {width:480px;
           height:240px;
           top-margin:0;
           bottom-margin:0;
           left-margin:0;
           right-margin:0}
  </STYLE>


</HEAD>

<BODY onload="javascript:OnDialogInit()" onunload="javascript:OnDialogEnd()"
      style="margin-top:0.5em; margin-left:0.5em; margin-right:0.5em; margin-bottom:0.5em"
      class="sys-color-body sys-font-body">

<!-- header -->

<table border=0 cellpadding=0 cellspacing=0 height=100% width=100% style="margin-top:0; margin-bottom:0">
    <tr style="margin-bottom:0em; margin-top:0em">
        <td>
            <div id=loc1 class="sys-font-heading3 sys-rhp-color-title" style="margin-bottom:1em; margin-top:0em">
                Program Compatibility Wizard
            </div>
        </td>
    </tr>

    <tr valign=top height=100%>
        <td>

            <Div style="height:100%; margin-top:0em; margin-bottom:0em">
                <table border=0 cellspacing=0 cellpadding=0 height=100% width=100% style="margin-top:0; margin-bottom:0">
                    <tr valign=top>
                        <td>
                            <Div class="sys-font-body sys-color-body" style="margin-bottom:0.5em; margin-top:0em">
                                <label id="lblTemporaryFiles" title="Temporary Files" class="sys-font-body sys-color-body">Temporary Files</label>
                            </Div>

                            <Div style="height:80%; overflow-y:auto; border-style:inset; border-width:1; padding:2">
                                <div id=TempFileList class="sys-font-body sys-color-body" style="margin-top:0em; margin-left:1em">
                                </div>
                            </Div>

                        </td>
                    </tr>
                </table>
            </Div>
        </td>
    </tr>

    <tr>
        <td>
            <Div style="margin-top:1em; width:100%" class="sys-font-body sys-color-body">
                <BUTTON id="btnClose" value="Close" name="btnClose" ACCESSKEY="C" onclick="javascript:onClose()" style="float:right"><u>C</u>lose</BUTTON>
            </Div>
        </td>
    </tr>
</table>
</BODY>
</HTML>





