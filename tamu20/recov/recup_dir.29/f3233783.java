LL" /></Property>            

            <xsl:if test="/Question/SaveUserAnswer[. = 1]">
                <Property Name="SaveUserAnswer"><xsl:value-of select="/Question/@ID" /></Property>
            </xsl:if>

		</Control>
    </xsl:template>

    <!-- 4 = Checkboxes -->
    <xsl:template match="InputTypeID[.=4]">
        <xsl:for-each select="../Answers/Answer" order-by="Order">
			<Control Class="SA_Button" Id="5004" Style="65538" Left="0" Top="0" Width="100" Height="13" LeftMargin="10" TopMargin="3">
		        <xsl:apply-templates />
				<UserData><xsl:value-of select="Value" /></UserData>

    			<Property Name="QuestionType">Checkbox</Property>
                <Property Name="CanonicalProp" DataType="23"><xsl:value-of select="/Question/SearchProperty" /></Property>
                <Property Name="AllowNULL" DataType="11"><xsl:value-of select="/Question/AllowNULL" /></Property>            

                <xsl:if test="/Question/SaveUserAnswer[. = 1]">
                    <Property Name="SaveUserAnswer"><xsl:value-of select="/Question/@ID" /></Property>
                </xsl:if>

			</Control>
        </xsl:for-each>
    </xsl:template>

    <!-- 5 = Radio Buttons -->
    <xsl:template match="InputTypeID[.=5]">
        <xsl:for-each select="../Answers/Answer" order-by="Order">
			<Control Class="SA_Button" Id="5004" Style="9" Left="0" Top="0" Width="100" Height="13" LeftMargin="10" TopMargin="3">
				<xsl:apply-templates />
				<UserData><xsl:value-of select="Value" /></UserData>

    			<Property Name="QuestionType">Radio</Property>
                <Property Name="CanonicalProp" DataType="23"><xsl:value-of select="/Question/SearchProperty" /></Property>
                <Property Name="AllowNULL" DataType="11"><xsl:value-of select="/Question/AllowNULL" /></Property>            

                <xsl:if test="/Question/SaveUserAnswer[. = 1]">
                    <Property Name="SaveUserAnswer"><xsl:value-of select="/Question/@ID" /></Property>
                </xsl:if>

			</Control>
        </xsl:for-each>
    </xsl:template>

    <!-- 6 = CharChooser -->
    <xsl:template match="InputTypeID[.=6]">
		<Control Class="SA_SpellEdit" Id="5004" Style="10551364" Left="0" Top="0" Width="100" Height="50" TopMargin="3"/>
    </xsl:template>

    <!-- Templates for Smart Task Names -->

    <xsl:template match="InsertAttribute">
        <xsl:choose>
        <xsl:when test=".[$any$ Attribute[$any$ /*/Attribute/Name $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-3)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/LFBit $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-3)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Subject $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-3)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/BaseSubject $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-3)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Factoid/Term/Type $ieq$ Name]]">
            <xsl:apply-templates select="Balloon/Specific" />
        </xsl:when>
        <xsl:otherwise>
            <xsl:apply-templates select="Balloon/Generic" />
        </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template match="InsertHere">
        <xsl:apply-templates select="../../../Attribute[$any$ /*/Attribute/Name $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-5)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/LFBit $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-5)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Subject $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-5)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/BaseSubject $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-5)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Factoid/Term/Type $ieq$ Name][0]">
            <xsl:template match="Attribute">
                <xsl:apply-templates select="/*/Attribute[Name $ieq$ context()/Name][0] | /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-6)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord'] $and$ ($any$ LFBit $ieq$ context()/Name $or$ $any$ Subject $ieq$ context()/Name $or$ $any$ BaseSubject $ieq$ context()/Name)][0] | /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-6)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Factoid/Term[Type $ieq$ context()/Name][0]">
                    <xsl:template match="Attribute">
                        <xsl:choose>
                        <xsl:when test="TopicTerm[. = '']">
                            <xsl:value-of select="QueryWord" /><!---->
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:value-of select="TopicTerm" /><!---->
                        </xsl:otherwise>
                        </xsl:choose>
                    </xsl:template>
                    <xsl:template match="QueryTerm | Term">
                        <xsl:value-of select="Word" /><!---->
                    </xsl:template>
                </xsl:apply-templates>
            </xsl:template>
        </xsl:apply-templates>
    </xsl:template>

    <xsl:template match="QueryWord|TopicTerm|Generic|Specific">
        <xsl:apply-templates />
    </xsl:template>

    <!-- Template for creating Intention controls -->

    <xsl:template match="QueryClassify">
		<InsertedCtrls>
			<Intents>
				<IntentCtrls>
                    <!-- Make sure this isn't a porn query -->
                    <xsl:if test=".[$not$ /QueryClassify/Attribute[Name $ieq$ 'SUP_XXX' $or$ Name $ieq$ 'SUP_Offensive']]">
					    <xsl:apply-templates select="Intention">
						    <xsl:template match="Intention[$not$ NonIntent $and$ Probability $gt$ 25]">

                                <xsl:if expr="CanAddAnotherIntent()">
							        <Control Class="SA_Button" IconId="290" Style="65536" Left="0" Top="0" Width="100" TopMargin="5">
								        <xsl:attribute name="Id"><xsl:value-of select="Id" /></xsl:attribute>
								        <xsl:apply-templates />
								        <Property Name="CtrlType" DataType="23">1</Property>
							        </Control>
                                </xsl:if>

                                <!-- We also may want to spit out the "Generic" case control -->
                                <xsl:if test=".[$not$ $any$ Flag[. $eq$ 'DontRepeatWithGenericName'] $and$ Name/InsertAttribute[$any$ Attribute[$any$ /*/Attribute/Name $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-1)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/LFBit $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-1)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Subject $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-1)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/BaseSubject $ieq$ Name $or$ $any$ /*/QueryTermSet/Query/QueryTerm[$not$ $any$ TaskStopWord[@Task = context(-1)/Id] $and$ $not$ $any$ Flag[. $eq$ 'StopWord']]/Factoid/Term/Type $ieq$ Name]]]">
                                    <xsl:if expr="CanAddAnotherIntent()">
							            <Control Class="SA_Button" IconId="290" Style="65536" Left="0" Top="0" Width="100" TopMargin="5">
								            <xsl:attribute name="Id"><xsl:value-of select="Id" /></xsl:attribute>

								            <xsl:apply-templates>

                                                <xsl:template match="Name">
                                                    <Text><xsl:apply-templates /></Text>
                                                </xsl:template>

                                                <xsl:template match="InsertAttribute">
                                                    <xsl:apply-templates select="Balloon/Generic" />
                                                </xsl:template>

                                            </xsl:apply-templates>

								            <Property Name="CtrlType" DataType="23">8</Property>
							            </Control>
                                    </xsl:if>
                                </xsl:if>
						    </xsl:template>
					    </xsl:apply-templates>
                    </xsl:if>
				</IntentCtrls>
				<NonIntentCtrls>
                    <!-- Make sure this isn't a porn query -->
                    <xsl:if test=".[$not$ /QueryClassify/Attribute[Name $ieq$ 'SUP_XXX']]">

                        <!-- Include any GOTO queries -->
                        <xsl:apply-templates select="searchresults" />

					    <xsl:apply-templates select="TaskCount">
						    <xsl:template match="Intention[NonIntent]">
							    <Control Class="SA_Button" IconId="290" Style="65536" Left="0" Top="0" Width="100" TopMargin="5">
								    <xsl:attribute name="Id"><xsl:value-of select="Id" /></xsl:attribute>
								    <xsl:apply-templates />
								    <Property Name="CtrlType" DataType="23">2</Property>
							    </Control>
						    </xsl:template>

						    <xsl:template match="TaskCount">
							    <!-- For convenience, if they didn't specify MoreThan OR AtMost, then just go ahead and pass -->
							    <xsl:apply-templates />
						    </xsl:template>

						    <xsl:template match="TaskCount[@MoreThan]">
							    <xsl:if test="/QueryClassify[Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@MoreThan]]">
								    <xsl:apply-templates />
							    </xsl:if>
						    </xsl:template>

						    <xsl:template match="TaskCount[@AtMost]">
							    <xsl:if test="/QueryClassify[$not$ Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@AtMost]]">
								    <xsl:apply-templates />
							    </xsl:if>
						    </xsl:template>

						    <xsl:template match="TaskCount[@MoreThan $and$ @AtMost]">
							    <xsl:if test="/QueryClassify[Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@MoreThan] $and$ $not$ Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@AtMost]]">
								    <xsl:apply-templates />
							    </xsl:if>
						    </xsl:template>
					    </xsl:apply-templates>
                    </xsl:if>
				</NonIntentCtrls>
			</Intents>

			<!-- Create a control for each non-stopword -->

			<NonStopWords>
				<xsl:for-each select="/QueryClassify/QueryTermSet/Query/QueryTerm[$not$ $any$ Flag[. $eq$ 'StopWord']]">
                    <xsl:if expr="uniqueID(this) == uniqueID(this.selectSingleNode('../QueryTerm[Word $ieq$ context()/Word][0]'))">
					    <Control Class="SA_Button" IconId="290" Style="9" Left="0" Top="0" Width="100" TopMargin="5">
						    <xsl:attribute name="Id"><xsl:value-of select="Index" /></xsl:attribute>
						    <xsl:apply-templates select="Word" />
						    <Property Name="CtrlType" DataType="23">4</Property>
					    </Control>
                    </xsl:if>
				</xsl:for-each>
			</NonStopWords>

			<TermsWithNegBit>
				<xsl:for-each select="/QueryClassify/QueryTermSet/Query/QueryTerm[$any$ LFBit $ieq$ 'NLP_Neg']">
					<Control Class="SA_Button" Style="65538" Id="5004" IconId="290" Left="0" Top="0" Width="100" Height="13" LeftMargin="10" TopMargin="5">
						<xsl:apply-templates select="Word" />
        				<UserData><xsl:apply-templates select="Index" /></UserData>
					</Control>
				</xsl:for-each>
			</TermsWithNegBit>

			<!-- Debug code inserts a control on the intents dialog for dumping the query xml -->

			<DebugCtrls>
				<Control Class="SA_Button" Id="5201" IconId="290" Style="65536" Left="0" Top="0" Width="100" TopMargin="10">
					<Text>
						<![CDATA[(DEBUG) Dump XML]]>
					</Text>
				</Control>
			</DebugCtrls>
		</InsertedCtrls>
    </xsl:template>

    <!-- Templates for creating Task Engine controls -->

    <xsl:template match="Task">
		<EngineCtrls>
			<xsl:apply-templates select="Strategy" order-by="+number(Number)"/>
		</EngineCtrls>
    </xsl:template>

    <xsl:template match="Strategy">
		<Strategy>
			<xsl:attribute name="Number"><xsl:value-of select="Number" /></xsl:attribute>
			<xsl:apply-templates select="Engine" order-by="+number(Order)" />
		</Strategy>
    </xsl:template>

    <xsl:template match="Engine">
		<Control Class="SA_Button" IconId="290" Style="65536" Left="0" Top="0" Width="100" TopMargin="5">
			<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
			<xsl:apply-templates>
                <xsl:template match="Name">
		            <Property Name="EngineName" DataType="8"><xsl:apply-templates /></Property>
                </xsl:template>
            </xsl:apply-templates>
			<Property Name="CtrlType" DataType="23">3</Property>
            <Property Name="HasGenericAction" DataType="11"><xsl:value-of select="HasGenericAction" /></Property>
		</Control>
    </xsl:template>

    <xsl:template match="Engine[InsertXML]">
        <InsertXML>
            <xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
        </InsertXML>
    </xsl:template>

    <!-- Templates which displays children only based on conditions -->

    <xsl:template match="TaskCount">
        <!-- For convenience, if they didn't specify MoreThan OR AtMost, then just go ahead and pass -->
        <xsl:apply-templates />
    </xsl:template>

    <xsl:template match="TaskCount[@MoreThan]">
        <xsl:if test="/QueryClassify[Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@MoreThan]]">
            <xsl:apply-templates />
        </xsl:if>
    </xsl:template>

    <xsl:template match="TaskCount[@AtMost]">
        <xsl:if test="/QueryClassify[$not$ Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@AtMost]]">
            <xsl:apply-templates />
        </xsl:if>
    </xsl:template>

    <xsl:template match="TaskCount[@MoreThan $and$ @AtMost]">
        <xsl:if test="/QueryClassify[Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@MoreThan] $and$ $not$ Intention[Probability $gt$ 25 $and$ $not$ NonIntent $and$ index() = context()/@AtMost]]">
            <xsl:apply-templates />
        </xsl:if>
    </xsl:template>

	<!-- Template for creating static dialogs -->

    <xsl:template match="SimpleDialog|Question">
		<Dialog>
			<xsl:if test="InputTypeID"><xsl:attribute name="QuestionType"><xsl:value-of select="InputTypeID" /></xsl:attribute></xsl:if>
			<xsl:if test="@Animation"><xsl:attribute name="Animation"><xsl:value-of select="@Animation" /></xsl:attribute></xsl:if>
			<xsl:if test="CharacterAction[. $ne$ 'NONE']"><xsl:attribute name="Animation"><xsl:value-of select="CharacterAction" /></xsl:attribute></xsl:if>
			<Font Name="Heading" Face="Tahoma" Size="8" Weight="Bold" />
			
			<xsl:apply-templates/>
		</Dialog>
	</xsl:template>

	<!-- Template for creating tooltips -->

    <xsl:template match="ToolTip">
		<ToolTip>
			<xsl:apply-templates/>
		</ToolTip>
    </xsl:template>

	<!--
	This template handles all control types.  Based on the node name, the template creates
	the Control node with all applicable styles, ids, sizes, and margins.
	-->

    <xsl:template match="Animation|Title|Divider|Heading|Label|SpellEdit|Link|WebLink|Button|Expando|Checkbox|Radio|Edit|Combo|ListBox|Control">
		<Control>

			<!-- Switch on control types to produce Class and Style attributes -->

			<xsl:choose>

				<!-- Animation control -->

				<xsl:when test=".[nodeName() = 'Animation']">
					<xsl:attribute name="Class">SysAnimate32</xsl:attribute>
					<xsl:attribute name="Style">1073741826</xsl:attribute>
					<xsl:attribute name="Id">5009</xsl:attribute>
				</xsl:when>

				<!-- Title control -->

				<xsl:when test=".[nodeName() = 'Title' $or$ nodeName() = 'Heading']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">13</xsl:attribute>
					<xsl:attribute name="Id">5003</xsl:attribute>
					<xsl:attribute name="Font">Heading</xsl:attribute>
				</xsl:when>

                <!-- Divider control -->

				<xsl:when test=".[nodeName() = 'Divider']">
					<xsl:attribute name="Class">Static</xsl:attribute>
					<xsl:attribute name="Style">1073741832</xsl:attribute>
					<xsl:choose>
						<xsl:when test="@Id">
							<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="Id">5010</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:when>

				<!-- Label control -->

				<xsl:when test=".[nodeName() = 'Label']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">13</xsl:attribute>
					<xsl:if test="@Font"><xsl:attribute name="Font"><xsl:value-of select="@Font" /></xsl:attribute></xsl:if>
					<xsl:choose>
						<xsl:when test="@Id">
							<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="Id">-1</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:when>

				<!-- SpellEdit control -->

				<xsl:when test=".[nodeName() = 'SpellEdit']">
					<xsl:attribute name="Class">SA_SpellEdit</xsl:attribute>
					<xsl:attribute name="Style">10551364</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:if test="@AutoComplete">
						<xsl:attribute name="AutoComplete"><xsl:value-of select="@AutoComplete" /></xsl:attribute>
					</xsl:if>
				</xsl:when>

				<!-- Link control -->

				<xsl:when test=".[nodeName() = 'Link']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">65536</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:attribute name="IconId"><xsl:value-of select="@IconId" /></xsl:attribute>
				</xsl:when>

				<!-- WebLink control -->

				<xsl:when test=".[nodeName() = 'WebLink']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">65536</xsl:attribute>
					<xsl:choose>
						<xsl:when test="@Id">
							<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="Id">-1</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:attribute name="IconId"><xsl:value-of select="@IconId" /></xsl:attribute>
                    <Property Name="CtrlType" DataType="23">9</Property>
				</xsl:when>

				<!-- Button control -->

				<xsl:when test=".[nodeName() = 'Button']">
					<xsl:attribute name="Class">Button</xsl:attribute>
					<xsl:attribute name="Style">65536</xsl:attribute>
					<xsl:attribute name="Height">24</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
				</xsl:when>

				<!-- Expando control -->

				<xsl:when test=".[nodeName() = 'Expando']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">65548</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:if test="@Checked[. $ieq$ 'True' $or$ . $ieq$ '1']">
						<xsl:attribute name="Checked">1</xsl:attribute>
					</xsl:if>
				</xsl:when>

				<!-- Checkbox control -->

				<xsl:when test=".[nodeName() = 'Checkbox']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">65538</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:if test="@Checked[. $ieq$ 'True' $or$ . $ieq$ '1']">
						<xsl:attribute name="Checked">1</xsl:attribute>
					</xsl:if>
				</xsl:when>

				<!-- Radio control -->

				<xsl:when test=".[nodeName() = 'Radio']">
					<xsl:attribute name="Class">SA_Button</xsl:attribute>
					<xsl:attribute name="Style">9</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:if test="@Checked[. $ieq$ 'True' $or$ . $ieq$ '1']">
						<xsl:attribute name="Checked">1</xsl:attribute>
					</xsl:if>
				</xsl:when>

				<!-- Edit control -->

				<xsl:when test=".[nodeName() = 'Edit']">
					<xsl:attribute name="Class">Edit</xsl:attribute>
					<xsl:attribute name="Style">8454272</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:if test="@AutoComplete">
						<xsl:attribute name="AutoComplete"><xsl:value-of select="@AutoComplete" /></xsl:attribute>
					</xsl:if>
				</xsl:when>

				<!-- Combo control -->

				<xsl:when test=".[nodeName() = 'Combo']">
					<xsl:attribute name="Class">ComboBox</xsl:attribute>
					<xsl:attribute name="Style">10551299</xsl:attribute>
                    <xsl:attribute name="Height">200</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
					<xsl:if test="@AutoComplete">
						<xsl:attribute name="AutoComplete"><xsl:value-of select="@AutoComplete" /></xsl:attribute>
					</xsl:if>
				</xsl:when>

				<!-- ListBox control -->

				<xsl:when test=".[nodeName() = 'ListBox']">
					<xsl:attribute name="Class">ListBox</xsl:attribute>
					<xsl:attribute name="Style">10551297</xsl:attribute>
                    <xsl:attribute name="Height">50</xsl:attribute>
					<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
				</xsl:when>

				<!-- Generic Control case.  This case gets specified attributes, or provides defaults -->

				<xsl:when test=".[nodeName() = 'Control']">
					<xsl:choose>
						<xsl:when test="@Class">
							<xsl:attribute name="Class"><xsl:value-of select="@Class" /></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="Class">SA_Button</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:choose>
						<xsl:when test="@Style">
							<xsl:attribute name="Style"><xsl:value-of select="@Style" /></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="Style">13</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:choose>
						<xsl:when test="@Id">
							<xsl:attribute name="Id"><xsl:value-of select="@Id" /></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="Id">-1</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:if test="@AutoComplete">
						<xsl:attribute name="AutoComplete"><xsl:value-of select="@AutoComplete" /></xsl:attribute>
					</xsl:if>
				</xsl:when>

			</xsl:choose>

			<!-- Get the rest of the attributes -->

			<xsl:if test="@Layout">
				<xsl:attribute name="Layout"><xsl:value-of select="@Layout" /></xsl:attribute>
			</xsl:if>

			<!-- Left, top, right, bottom attributes, with defaults -->

            <xsl:if test="@Left">
                <xsl:attribute name="Left"><xsl:value-of select="@Left" /></xsl:attribute>
            </xsl:if>

            <xsl:if test="@Top">
                <xsl:attribute name="Top"><xsl:value-of select="@Top" /></xsl:attribute>
            </xsl:if>

            <xsl:if test="@Width">
                <xsl:attribute name="Width"><xsl:value-of select="@Width" /></xsl:attribute>
            </xsl:if>

            <xsl:if test="@Height">
                <xsl:attribute name="Height"><xsl:value-of select="@Height" /></xsl:attribute>
            </xsl:if>

			<!-- Margin attributes, with defaults -->

            <xsl:if test="@LeftMargin">
                <xsl:attribute name="LeftMargin"><xsl:value-of select="@LeftMargin" /></xsl:attribute>
            </xsl:if>

            <xsl:if test="@RightMargin">
                <xsl:attribute name="RightMargin"><xsl:value-of select="@RightMargin" /></xsl:attribute>
            </xsl:if>

            <xsl:if test="@TopMargin">
                <xsl:attribute name="TopMargin"><xsl:value-of select="@TopMargin" /></xsl:attribute>
            </xsl:if>

            <xsl:if test="@BottomMargin">
                <xsl:attribute name="BottomMargin"><xsl:value-of select="@BottomMargin" /></xsl:attribute>
            </xsl:if>

			<xsl:if test="@Group">
				<xsl:attribute name="Group"><xsl:value-of select="@Group" /></xsl:attribute>
			</xsl:if>

			<xsl:if test="@Hidden">
				<xsl:attribute name="Hidden"><xsl:value-of select="@Hidden" /></xsl:attribute>
			</xsl:if>

            <xsl:if test="..[nodeName() $eq$ 'CtrlRow']">
				<xsl:choose>
					<xsl:when expr="absoluteChildNumber(this) == 1">
						<xsl:attribute name="RowBegin">1</xsl:attribute>
					</xsl:when>
					<xsl:otherwise>
						<xsl:attribute name="Row">1</xsl:attribute>
					</xsl:otherwise>
				</xsl:choose>
            </xsl:if>

            <xsl:if test=".[ancestor(ExpandoGroup)]">
		        <Property DataType="8">
			        <xsl:attribute name="Name">Expando<xsl:value-of select="ancestor(ExpandoGroup)/@Id" /></xsl:attribute>
		        </Property>
            </xsl:if>

			<xsl:apply-templates />
		</Control>
    </xsl:template>

	<!-- Get the search properties, if any -->

	<xsl:template match="SearchProp">
		<Property>
            <xsl:choose>
			<xsl:when test="@DataType">
				<xsl:attribute name="DataType"><xsl:value-of select="@DataType" /></xsl:attribute>
			</xsl:when>
			<xsl:otherwise>
				<xsl:attribute name="DataType">8</xsl:attribute>
			</xsl:otherwise>
            </xsl:choose>
			<xsl:attribute name="Name">LS<xsl:value-of select="@Name" /></xsl:attribute>
			<xsl:apply-templates />
		</Property>
	</xsl:template>

    <!-- Pass through Properties (all must have Names) -->

    <xsl:template match="Property[@Name]">
		<Property>
            <xsl:choose>
			<xsl:when test="@DataType">
				<xsl:attribute name="DataType"><xsl:value-of select="@DataType" /></xsl:attribute>
			</xsl:when>
			<xsl:otherwise>
				<xsl:attribute name="DataType">8</xsl:attribute>
			</xsl:otherwise>
            </xsl:choose>
			<xsl:attribute name="Name"><xsl:value-of select="@Name" /></xsl:attribute>
			<xsl:apply-templates />
		</Property>
    </xsl:template>

	<xsl:template match="QuestionText">
		<Control>
			<xsl:attribute name="Class">SA_Button</xsl:attribute>
			<xsl:attribute name="Style">13</xsl:attribute>
			<xsl:attribute name="Id">5003</xsl:attribute>
			<xsl:attribute name="Font">Heading</xsl:attribute>
			<xsl:attribute name="BottomMargin">2</xsl:attribute>

			<Text><xsl:apply-templates/></Text>
		</Control>
	</xsl:template>

    <xsl:template match="Answers">
		<Control>
			<xsl:attribute name="Class">SA_Button</xsl:attribute>
			<xsl:attribute name="Style">65536</xsl:attribute>
			<xsl:attribute name="Id">5012</xsl:attribute>
			<xsl:attribute name="TopMargin">5</xsl:attribute>
			<xsl:attribute name="IconId">290</xsl:attribute>

			<Text> </Text>
		</Control>
    </xsl:template>

    <!-- Template for Combo box items -->

    <xsl:template match="Item">
        <Item>
            <xsl:if test="@Checked">
                <xsl:attribute name="Checked"><xsl:value-of select="@Checked" /></xsl:attribute>
            </xsl:if>
            <xsl:attribute name="Text"><xsl:value-of select="Name" /></xsl:attribute>
            <xsl:attribute name="Data"><xsl:value-of select="Value" /></xsl:attribute>
        </Item>
    </xsl:template>

    <!-- Expandos -->

    <xsl:template match="ExpandoGroup">
        <xsl:apply-templates />
    </xsl:template>

    <xsl:template match="CtrlRow">
        <xsl:apply-templates />
    </xsl:template>

    <!-- Web Links -->

    <xsl:template match="URL">
        <Property DataType="8" Name="LinkURL"><xsl:apply-templates /></Property>
    </xsl:template>

    <xsl:template match="PostData">
        <Property DataType="8" Name="LinkPostData"><xsl:apply-templates /></Property>
    </xsl:template>


    <!-- Goto Links -->
    <xsl:template match="searchresults[result]">
        <xsl:if expr="TestCanAddAnotherIntent()">
            <Control Class="SA_Button" Style="13" Id="-1" TopMargin="8" BottomMargin="5">
            <Text><![CDATA[Sponsored Links:]]></Text>
            </Control>
            <xsl:apply-templates select="result" order-by="+number(score)" />
        </xsl:if>
    </xsl:template>

    <xsl:template match="/searchresults[result]">
        <xsl:if expr="TestCanAddAnotherIntent()">
    		<InsertedCtrls>
                <Control Class="SA_Button" Style="13" Id="-1" TopMargin="8" BottomMargin="5">
                <Text><![CDATA[Sponsored Links:]]></Text>
                </Control>
                <xsl:apply-templates select="result" order-by="+number(score)" />
            </InsertedCtrls>
        </xsl:if>
    </xsl:template>

    <xsl:template match="result">
        <xsl:if expr="CanAddAnotherIntent()">
            <Control Class="SA_Button" Style="65536" Id="-1" IconId="1005"  Left="0" Top="0" Width="100" BottomMargin="5">
                <Property Name="CtrlType" DataType="23">9</Property>
                <Property DataType="8" Name="LinkURL"><xsl:value-of select="urlencode" /></Property>
                <Text><xsl:value-of select="title" /></Text>
                <ToolTip><xsl:value-of select="desc" /></ToolTip>
            </Control>
        </xsl:if>
    </xsl:template>

    <!-- Script -->

    <xsl:script><![CDATA[

        // Change the kcMaxIntents constant if you want to change how many
        // total Intents controls + Goto links are allowed on a page.
        //
        kcMaxIntents = 8;


        cIntents = 0;

        function TestCanAddAnotherIntent()
        {
            return (cIntents + 1 <= kcMaxIntents);
        }

        function CanAddAnotherIntent()
        {
            cIntents++;

            return (cIntents <= kcMaxIntents);
        }
                
    ]]></xsl:script>

</xsl:stylesheet>
