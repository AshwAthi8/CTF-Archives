kgroundColor = "#808080";
    }
    else if (window.external.IsServerSku())
    {
        apolicy_text.style.backgroundColor = "#7A838A";
    }
    window.parent.New_Default_LoadMe(SimpleBack, SimpleNext);
}
</script>

<body style="background-Color: transparent; background-repeat: no-repeat;" topmargin=0 rightmargin=0 leftmargin=0 TABINDEX=-1
      onload="ActPolicy_LoadMe('SimpleBack');">

<table border=0 cellpadding=0 cellspacing=0 width="100%" height="100%">
<tr>
    <td ID=leftmargincell width=5% height=99%></td>
    <td ID=maincell valign=top class="text-primary">

    <span ID=Title_Text class="title" style="display:none;">
    <ID id=msprvcy_str1>Windows Product Activation Privacy Statement</ID>
    </span>

    <br>
    <TEXTAREA ID=apolicy_text READONLY TABINDEX=2 style="background-color:#4E6FD6" class="text-primary" cols=70 name=MSActPolicy rows=12 onfocus="window.parent.HandleTextAreaFocus();window.parent.OnFocus();" onblur="window.parent.HandleTextAreaBlur();">
    Microsoft asks that you activate Windows so that we may verify that your installation is done with a genuine Microsoft product. When you activate Windows, you are not required to send any personal information to Microsoft. Activation is completely anonymous.

    During activation, Windows creates a unique hardware identification that represents the configuration of the PC at the time of activation.The hardware identification does not include any personal information, any information about software or data that may reside on your PC, or any information about the specific make or model of your PC. The hardware identification identifies only the PC and only for the sole purpose of activation. Windows can detect and tolerate changes to your PC configuration. Minor upgrades will not require re-activation. If you completely overhaul your PC you may be required to activate Windows again.

    During activation you may also provide your name and other contact information if you want to register your product with Microsoft. If you choose to register your product, the information that you provide will be securely stored by Microsoft and will be protected from disclosure to third parties without your consent.

    If you believe that Microsoft has not adhered to these privacy principles, please notify us by postal mail at the following address:

    Microsoft
    Attn: Microsoft Product Activation
    One Microsoft Way
    Redmond, Washington 98052-6399
    USA

    We will use commercially reasonable efforts to promptly determine and correct the problem.
    </TEXTAREA>

    <br><br>

    <span class="text-primary" style="line-height:14pt"><ID id=msplcy_s5>To continue, click </ID><span class="emphasis-lesser"><ID id=msplcy_s4>Back</ID></span><span><ID id=xx1>.</ID></span>
    </span>

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
            <BUTTON ID=placeholder1 class="buttons" style="visibility:hidden" TABINDEX=-1><label for=placeholder1><id id="Localplaceholder1_Text"><u>B</u>ack</id></label></BUTTON>
            </td>
            <td>
            <BUTTON ID=placeholder2 class="buttons" style="visibility:hidden" TABINDEX=-1><label for=placeholder2><id id="Localplaceholder2_Text"><u>B</u>ack</id></label></BUTTON>
            </td>
            <td>
            <BUTTON ID="btnBack" class="buttons" TABINDEX=4 ACCESSKEY="B"><label for=btnBack><id id="LocalBtnBack_Text"><u>B</u>ack</id></label></BUTTON>
            </td>
        </tr>
        </table>
    </td>
</tr>
</table>
</body>
</html>

