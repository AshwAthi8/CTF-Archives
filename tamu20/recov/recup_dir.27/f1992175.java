-of/></PRE></span>
			<span class="b"><xsl:entity-ref name="nbsp"/></span> 
			<span class="m">--&gt;</span>
			<script type="text/jscript">
				f( clean );
			</script>
		</div>
	</xsl:template>

	<!-- Template for cdata nodes -->
	<xsl:template match="cdata()">
		<div class="k">
			<span>
				<A class="b" onclick="return false" onfocus="h()" STYLE="visibility:hidden">-</A> 
				<span class="m">&lt;![CDATA[</span>
			</span>
			<span id="clean" class="di">
				<PRE><xsl:value-of/></PRE>
			</span>
			<span class="b"><xsl:entity-ref name="nbsp"/></span> 
			<span class="m">]]&gt;</span>
			<script type="text/jscript">
				f( clean );
			</script>
		</div>
	</xsl:template>

	<!-- Template for elements not handled elsewhere (leaf nodes) -->
	<xsl:template match="*">
		<div class="e">
			<div STYLE="margin-left:1em;text-indent:-2em">
				<span class="b"><xsl:entity-ref name="nbsp"/></span>
				<span class="m">&lt;</span>
				<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span> 
				<xsl:apply-templates select="@*"/>
				<span class="m"> /&gt;</span>
			</div>
		</div>
	</xsl:template>

	<!-- Template for elements with comment, pi and/or cdata children -->
	<xsl:template match="*[node()]">
		<div class="e">
			<div class="c">
				<A href="#" onclick="return false" onfocus="h()" class="b">-</A> 
				<span class="m">&lt;</span>
				<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span>
				<xsl:apply-templates select="@*"/> 
				<span class="m">&gt;</span>
			</div>
			<div>
				<xsl:apply-templates/>
				<div>
					<span class="b"><xsl:entity-ref name="nbsp"/></span> 
					<span class="m">&lt;/</span>
					<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span>
					<span class="m">&gt;</span>
				</div>
			</div>
		</div>
	</xsl:template>

	<!-- Template for elements with only text children -->
	<xsl:template match="*[textNode()$and$$not$(comment()$or$pi()$or$cdata())]">
		<div class="e">
			<div STYLE="margin-left:1em;text-indent:-2em">
				<span class="b"><xsl:entity-ref name="nbsp"/></span> 
				<span class="m">&lt;</span>
				<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span>
				<xsl:apply-templates select="@*"/>
				<span class="m">&gt;</span>
				<span class="tx"><xsl:value-of/></span>
				<span class="m">&lt;/</span>
				<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span>
				<span class="m">&gt;</span>
			</div>
		</div>
	</xsl:template>

	<!-- Template for elements with element children -->
	<xsl:template match="*[*]">
		<div class="e">
			<div class="c" STYLE="margin-left:1em;text-indent:-2em">
				<A href="#" onclick="return false" onfocus="h()" class="b">-</A> 
				<span class="m">&lt;</span>
				<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span>
				<xsl:apply-templates select="@*"/> 
				<span class="m">&gt;</span>
			</div>
			<div>
				<xsl:apply-templates/>
				<div>
					<span class="b"><xsl:entity-ref name="nbsp"/></span> 
					<span class="m">&lt;/</span>
					<span><xsl:attribute name="class"><xsl:if match="xsl:*">x</xsl:if>t</xsl:attribute><xsl:node-name/></span>
					<span class="m">&gt;</span>
				</div>
			</div>
		</div>
	</xsl:template>
</xsl:stylesheet>