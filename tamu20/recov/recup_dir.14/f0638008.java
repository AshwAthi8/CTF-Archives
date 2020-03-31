</x:template>
<x:template match="pi()">
<DIV class="e">
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN>
<SPAN class="m">&lt;?</SPAN><SPAN class="pi"><x:node-name/> <x:value-of/></SPAN><SPAN class="m">?&gt;</SPAN>
</DIV>
</x:template>
<x:template match="pi('xml')">
<DIV class="e">
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN>
<SPAN class="m">&lt;?</SPAN><SPAN class="pi">xml <x:for-each select="@*"><x:node-name/>="<x:value-of/>" </x:for-each></SPAN><SPAN class="m">?&gt;</SPAN>
</DIV>
</x:template>
<x:template match="@*" xml:space="preserve"><SPAN><x:attribute name="class"><x:if match="x:*/@*">x</x:if>t</x:attribute> <x:node-name/></SPAN><SPAN class="m">="</SPAN><B><x:value-of/></B><SPAN class="m">"</SPAN></x:template>
<x:template match="@xmlns:*|@xmlns|@xml:*"><SPAN class="ns"> <x:node-name/></SPAN><SPAN class="m">="</SPAN><B class="ns"><x:value-of/></B><SPAN class="m">"</SPAN></x:template>
<x:template match="@dt:*|@d2:*"><SPAN class="dt"> <x:node-name/></SPAN><SPAN class="m">="</SPAN><B class="dt"><x:value-of/></B><SPAN class="m">"</SPAN></x:template>
<x:template match="textnode()">
<DIV class="e">
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN>
<SPAN class="tx"><x:value-of/></SPAN>
</DIV>
</x:template>
<x:template match="comment()">
<DIV class="k">
<SPAN><A class="b" onclick="return false" onfocus="h()" STYLE="visibility:hidden">-</A> <SPAN class="m">&lt;!--</SPAN></SPAN>
<SPAN id="clean" class="ci"><PRE><x:value-of/></PRE></SPAN>
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN> <SPAN class="m">--&gt;</SPAN>
<SCRIPT>f(clean);</SCRIPT></DIV>
</x:template>
<x:template match="cdata()">
<DIV class="k">
<SPAN><A class="b" onclick="return false" onfocus="h()" STYLE="visibility:hidden">-</A> <SPAN class="m">&lt;![CDATA[</SPAN></SPAN>
<SPAN id="clean" class="di"><PRE><x:value-of/></PRE></SPAN>
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN> <SPAN class="m">]]&gt;</SPAN>
<SCRIPT>f(clean);</SCRIPT></DIV>
</x:template>
<x:template match="*">
<DIV class="e"><DIV STYLE="margin-left:1em;text-indent:-2em">
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN>
<SPAN class="m">&lt;</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN> <x:apply-templates select="@*"/><SPAN class="m"> /&gt;</SPAN>
</DIV></DIV>
</x:template>
<x:template match="*[node()]">
<DIV class="e">
<DIV class="c"><A href="#" onclick="return false" onfocus="h()" class="b">-</A> <SPAN class="m">&lt;</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN><x:apply-templates select="@*"/> <SPAN class="m">&gt;</SPAN></DIV>
<DIV><x:apply-templates/>
<DIV><SPAN class="b"><x:entity-ref name="nbsp"/></SPAN> <SPAN class="m">&lt;/</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN><SPAN class="m">&gt;</SPAN></DIV>
</DIV></DIV>
</x:template>
<x:template match="*[textnode()$and$$not$(comment()$or$pi()$or$cdata())]">
<DIV class="e"><DIV STYLE="margin-left:1em;text-indent:-2em">
<SPAN class="b"><x:entity-ref name="nbsp"/></SPAN> <SPAN class="m">&lt;</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN><x:apply-templates select="@*"/>
<SPAN class="m">&gt;</SPAN><SPAN class="tx"><x:value-of/></SPAN><SPAN class="m">&lt;/</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN><SPAN class="m">&gt;</SPAN>
</DIV></DIV>
</x:template>
<x:template match="*[*]">
<DIV class="e">
<DIV class="c" STYLE="margin-left:1em;text-indent:-2em"><A href="#" onclick="return false" onfocus="h()" class="b">-</A> <SPAN class="m">&lt;</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN><x:apply-templates select="@*"/> <SPAN class="m">&gt;</SPAN></DIV>
<DIV><x:apply-templates/>
<DIV><SPAN class="b"><x:entity-ref name="nbsp"/></SPAN> <SPAN class="m">&lt;/</SPAN><SPAN><x:attribute name="class"><x:if match="x:*">x</x:if>t</x:attribute><x:node-name/></SPAN><SPAN class="m">&gt;</SPAN></DIV>
</DIV></DIV>
</x:template>
</x:stylesheet>
