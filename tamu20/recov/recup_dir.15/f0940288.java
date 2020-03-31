 <td>
                                            <div STYLE="margin-left=18;">
                                            <span class="SecOOBEAlertText">
                                                <xsl:value-of select="alertInfo/@text"/>
                                            </span>
                                            </div>
                                        </td>                                       
                                    </tr>
                                </table>
                            </td>
                            <td style="BACKGROUND-IMAGE: url(alRight.gif);BACKGROUND-REPEAT: repeat-y" width="8">                               
                            </td>
                        </tr>
                        <tr>
                            <td style="BACKGROUND-IMAGE: url(alBottomLeft.gif);BACKGROUND-REPEAT: no-repeat" width="8"
                                height="8">
                                
                            </td>
                            <td style="BACKGROUND-IMAGE: url(alBottom.gif);BACKGROUND-REPEAT: repeat-x" height="8">
                                
                            </td>
                            <td style="BACKGROUND-IMAGE: url(alBottomRight.gif);BACKGROUND-REPEAT: no-repeat" width="8"
                                height="8">
                                
                            </td>
                        </tr>
                    </table>
                </div>
                </td>
                </tr>
                <!-- END ALERT -->
                <tr>
                <td>
                <!-- BEGIN DYNAMIC STEPS -->
                <xsl:apply-templates select="stepList" />
                <!-- END DYNAMIC STEPS -->
                </td>
                </tr>
                <tr height="100%">
                <td valign="bottom">
                <!-- BEGIN FINISH -->
                <xsl:apply-templates select="finishInfo" />
                <!-- END FINISH -->
                </td>
                </tr>
                </table>
        </div>
    </xsl:template>
    
    <!-- TEMPLATE FOR EACH STEP -->
    <xsl:template match="/SecOOBE/stepList">
        <xsl:for-each select="step[@visible=1]">
            <xsl:sort select="@priority" order="ascending" />
            <div id="divStep" STYLE="margin-top=20;">
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td>
                            <span id="spanStepTitle" class="SecOOBEStepTitle">
                                <xsl:value-of select="@title" />
                            </span>
                        </td>
                        <td align="right">
                            <table border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td align="center" width="30px">
                                        <a class="SecOOBEMoreInfo" tabIndex="-1" hideFocus="true">
                                            <xsl:attribute name="href" >
                                                javascript:executeChm('<xsl:value-of select="@moreInfo" />');
                                            </xsl:attribute>
                                            <xsl:attribute name="title">
                                                <xsl:value-of select="@moreInfoToolTip" />
                                            </xsl:attribute>
                                            <img src="help.gif" border="0" align="absbottom"></img>
                                        </a>                                    
                                    </td>
                                    <td align="right" valign="middle">
                                        <span>
                                            <a class="SecOOBEMoreInfo">
                                                <xsl:attribute name="href">
                                                    javascript:executeChm('<xsl:value-of select="@moreInfo" />');
                                                </xsl:attribute>
                                                <xsl:attribute name="accessKey">
                                                    <xsl:value-of select="@moreInfoAccessKey" />
                                                </xsl:attribute>
                                                <xsl:attribute name="title">
                                                    <xsl:value-of select="@moreInfoToolTip" />
                                                </xsl:attribute>
                                                <xsl:value-of select="@moreInfoText" disable-output-escaping="yes" />
                                            </a>
                                        </span>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
                <hr style="BORDER-RIGHT: #bfcdcf 1px solid; BORDER-TOP: #bfcdcf 1px solid; BORDER-LEFT: #bfcdcf 1px solid; BORDER-BOTTOM: #bfcdcf 1px solid"></hr>
                <span id="spanStepText" class="SecOOBEStepText">
                    <xsl:value-of select="@description" disable-output-escaping="yes"/>
                </span>
                <p></p>
                <!-- BEGIN ACTION -->
                <xsl:if test="count(action[@visible=1]) > 0"> <!-- Only show the rounded box if there are visible actions -->
                    <div id="divAction">
                        <table cellpadding="0" cellspacing="0" width="60%" border="0">
                            <tr>
                                <td style="BACKGROUND-IMAGE: url(acTopLeft.gif); BACKGROUND-REPEAT: no-repeat; BACKGROUND-POSITION-Y: bottom" width="12"
                                    height="12">
                                    
                                </td>
                                <td style="BACKGROUND-IMAGE: url(acTop.gif);BACKGROUND-REPEAT: repeat-x; BACKGROUND-POSITION-Y: bottom" height="12">
                                    
                                </td>
                                <td style="BACKGROUND-IMAGE: url(acTopRight.gif);BACKGROUND-REPEAT: no-repeat; BACKGROUND-POSITION-Y: bottom" width="12"
                                    height="12">
                                    
                                </td>
                            </tr>
                            <tr>
                                <td style="BACKGROUND-IMAGE: url(acLeft.gif);BACKGROUND-REPEAT: repeat-y" width="12">
                                    
                                </td>
                                <td style="BACKGROUND-COLOR: Window">
                                    <!-- BEGIN ACTION ITEM -->
                                    <xsl:for-each select="action[@visible=1]">
                                        <xsl:apply-templates select="."/>
                                    </xsl:for-each>
                                    <!-- END ACTION ITEM -->
                                </td>
                                <td style="BACKGROUND-IMAGE: url(acRight.gif);BACKGROUND-REPEAT: repeat-y" width="12">
                                    
                                </td>
                            </tr>
                            <tr>
                                <td style="BACKGROUND-IMAGE: url(acBottomLeft.gif);BACKGROUND-REPEAT: no-repeat" width="12"
                                    height="12">
                                    
                                </td>
                                <td style="BACKGROUND-IMAGE: url(acBottom.gif);BACKGROUND-REPEAT: repeat-x" height="12">
                                    
                                </td>
                                <td style="BACKGROUND-IMAGE: url(acBottomRight.gif);BACKGROUND-REPEAT: no-repeat" width="12"
                                    height="12">
                                    
                                </td>
                            </tr>
                        </table>
                    </div>
                </xsl:if>
                <!-- END ACTION -->
            </div>
        </xsl:for-each>
    </xsl:template>

    <!-- TEMPLATE FOR EACH ACTION - EACH STEP CAN HAVE MULTIPLE ACTIONS -->
    <xsl:template match="/SecOOBE/stepList/step/action">
        <table border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td width="32" align="center">
                    <a class="SecOOBEActionText" tabIndex="-1" hideFocus="true">
                        <xsl:attribute name="href">
                            javascript:executeAction('<xsl:value-of select="@actionID" />');
                        </xsl:attribute>
                        <xsl:attribute name="title">
                            <xsl:value-of select="@actionToolTip" />
                        </xsl:attribute>                            
                        <img src="greenarrow_small.gif" border="0" align="absbottom"></img>
                    </a>
                </td>
                <td valign="middle">
                    <span>
                        <a class="SecOOBEActionText">
                            <xsl:attribute name="href">
                                javascript:executeAction('<xsl:value-of select="@actionID" />');
                            </xsl:attribute>
                            <xsl:attribute name="accessKey">
                                <xsl:value-of select="@accessKey" />
                            </xsl:attribute>
                            <xsl:attribute name="title">
                                <xsl:value-of select="@actionToolTip" />
                            </xsl:attribute>                            
                            <xsl:value-of select="@title" disable-output-escaping="yes"/>
                        </a>
                    </span>
                </td>
            </tr>
        </table>
    </xsl:template>
    
    <!-- TEMPLATE FOR THE FINISH TEXT AND BUTTON -->
    <xsl:template match="/SecOOBE/finishInfo">
        <div id="divFinish">
            <table id="tableFinish" border="0" cellpadding="10" cellspacing="0" width="100%" height="100%">
                <tr>
                    <td valign="bottom">
                        <span id="spanFinishText" class="SecOOBEFinishText">
                            <xsl:value-of select="@text" />
                        </span>
                        <a class="SCWLink" href="javascript:executeChm('Scwhelp.chm::/scw_topnode.htm')">                       
                            <xsl:value-of select="@SCWLink" />
                            
                        </a>
                    </td>
                    <td align="right" valign="bottom">
                        <button id="buttonFinish" type="button" class="SecOOBEButton">
                            <xsl:attribute name="accessKey">
                                <xsl:value-of select="@accessKey" />
                            </xsl:attribute>
                            <xsl:value-of select="@button" disable-output-escaping="yes"/>
                        </button>
                    </td>
                </tr>
                <tr height="10px">
                    <td></td>
                </tr>
            </table>
        </div>
    </xsl:template> 

    <!-- SUPPORT TEMPLATES -->

    <xsl:template name="StrReplace">
        <xsl:param name="in"/>
        <xsl:param name="token"/>
        <xsl:param name="replacetoken"/>    
        
        <xsl:choose>
            <xsl:when test="contains($in, $token)">
                <xsl:value-of select="substring-before($in, $token)"/>
                <xsl:value-of select="$replacetoken"/>
                <xsl:call-template name="StrReplace">
                    <xsl:with-param name="in" select="substring-after($in, $token)"/>
                    <xsl:with-param name="token" select="$token"/>
                    <xsl:with-param name="replacetoken" select="$replacetoken"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="$in"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="EscapeJPath">
        <xsl:param name="in"/>
        <xsl:variable name="resultString">
            <xsl:call-template name="StrReplace">
                <xsl:with-param name="in" select="$in"/>
                <xsl:with-param name="token" select="'\'"/>
                <xsl:with-param name="replacetoken" select="'\\'"/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="StrReplace">
            <xsl:with-param name="in" select="$resultString"/>
            <xsl:with-param name="token" select="'&quot;'"/>
            <xsl:with-param name="replacetoken" select="'\&quot;'"/>
        </xsl:call-template>        
    </xsl:template>
    
</xsl:stylesheet>
PADGIF89a