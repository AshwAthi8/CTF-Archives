 z-index:99; display:none">
</SPAN>

<SPAN ID=ScreenFrame style="height:100%; width:100%; position:absolute; display:none">

    <IMG ID=NewWatermarkBackground style="LEFT:  0px; TOP:  0px; POSITION: absolute; z-index:-99;" alt="">
    <IMG ID=NewWatermarkTop        style="display: inline; LEFT:  0px; TOP:  0px; POSITION: absolute; z-index:-98;" alt="">
    <IMG ID=NewWatermarkBottom     style="display: inline; LEFT:  0px; TOP:  0px; POSITION: absolute; z-index:-97;" alt="">
    <IMG ID=NewMicrosoftLogo       style="display: inline; LEFT: 20px; TOP:  5px; POSITION: absolute; z-index:-96;" alt="">

    <SPAN id=spnOEMLogo style="visibility:hidden; position:absolute; TOP:7px; LEFT:525px; width:255px; HEIGHT:40px; z-index:10; background-repeat:no-repeat;">
    </SPAN>



    <TABLE border=0 ID=MainFrameTable cellpadding=0 cellspacing=0 style="z-index:6; position:absolute; left:0px; top:25px; width:100%; height:97%">
    <TR>
        <TD style="height:100%">
        <SPAN id=spnPage style="VISIBILITY: hidden; z-index:4;" tabIndex=-1>
            <SPAN id=spnMainFrame style="width: 100%; height:100%" tabIndex=-1>
            <IFRAME ALLOWTRANSPARENCY="true" id=ifrmMainFrame frameBorder=no scrolling=no width="100%" height="97%" name=msoobeMain tabIndex=0></IFRAME>
            <IFRAME ALLOWTRANSPARENCY="true" id=ifrmConnDelay frameBorder=no style="display:none; position:absolute; z-index:-1; left: 0px; top: 0px;" scrolling=no width="100%" height="100%" name=connDelay tabIndex=-1 src="setup/ISPWait.htm"></IFRAME>
            </SPAN>
        </SPAN>
        </TD>
        <TD WIDTH=20></TD>
    </TR>
    </TABLE>

    <comment>Make sure the spnAssist area (coverage) does not cover the Next button</comment>
    <SPAN id=spnAssist class="emphasis-lesser" style="visibility:hidden; POSITION: absolute; LEFT: 593px; TOP: 440px; WIDTH: 180px; z-index:9">
        <TABLE width="95%" cellspacing=0 cellpadding=0 align=center class="emphasis-lesser" style="text-align:center;color:white;">
        <TR>
            <TD align=center>
            <IMG align=middle id=AssistImg border=0 src="images/qmark.gif"
            style="visibility:hidden;z-index:9" language=javascript
            onclick="Agent_OnUserRequestAssistant()"><BR>
            </TD>
        </TR>
        <TR>
            <TD ID=MerlinStr1 class="text-primary"><span id="agentStr1" onclick="Agent_OnUserRequestAssistant()"><id id="L_AgentHelp1_Text">