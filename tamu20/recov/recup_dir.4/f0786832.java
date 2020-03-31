 layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(119,handlemap(1)) content=rcstr(119,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="IM" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(122,handlemap(1)) content=rcstr(122,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="JavaVM" />
</element>
</element>
</element>
<ARPSelector resid=clientblockselector layoutpos=client layout=borderlayout() padding=rect(0,6rp,0,6rp) selected=false />
<element resid=clientitem class="customclientitem" layout=rowlayout(23) layoutpos=top contentalign=topleft selected=false>
<autobutton id=atom(setdefault) class="padded" accessible=true accRole=45 layout=borderlayout()>
<element id=atom(radiobutton) />
<element id=atom(radiotext) contentalign=wrapleft />
</autobutton>
<element width=20rp />
<autobutton id=atom(show) class="padded" accessible=true accRole=44 accName=rcstr(125,handlemap(1)) layout=borderlayout() selected=false>
<element id=atom(checkbutton) />
<element id=atom(checktext) content=rcstr(125,handlemap(1)) />
</autobutton>
</element>
<arphelp resid=sizehelp layoutpos=absolute layout=borderlayout() sheet=styleref(helppopup)>
<element layoutpos=top layout=borderlayout()>
<element id=atom(title) layoutpos=left accessible=true accRole=41 accName=rcstr(21) content=rcstr(21) />
</element>
<element layoutpos=top contentalign=wrapleft accessible=true accRole=41 accName=rcstr(22) content=rcstr(22) />
<element layoutpos=bottom layout=borderlayout()>
<element id=atom(divider) layoutpos=top height=2 width=100 />
<button id=atom(close) class="winstyle" layoutpos=right accessible=true accRole=43 accName=rcstr(4) content=rcstr(4) />
</element>
</arphelp>
<arphelp resid=freqhelp layoutpos=absolute layout=borderlayout() sheet=styleref(helppopup)>
<element layoutpos=top layout=borderlayout()>
<element id=atom(title) layoutpos=left accessible=true accRole=41 accName=rcstr(23) content=rcstr(23) />
</element>
<element layoutpos=top accessible=true accRole=41 accName=rcstr(24) content=rcstr(24) />
<element layoutpos=top accessible=true accRole=41 accName=rcstr(25) content=rcstr(25) />
<element layoutpos=top contentalign=wrapleft accessible=true accRole=41 accName=rcstr(26) content=rcstr(26) />
<element layoutpos=bottom layout=borderlayout()>
<element id=atom(divider) layoutpos=top height=2 width=100 />
<button id=atom(close) class="winstyle" layoutpos=right accessible=true accRole=43 accName=rcstr(4) content=rcstr(4) />
</element> 
</arphelp>
<arphelp resid=suphelp layoutpos=absolute layout=borderlayout() sheet=styleref(helppopup)>
<element layoutpos=top layout=borderlayout()>
<element id=atom(prodname) layoutpos=bottom contentalign=wrapleft />
<element layoutpos=bottom contentalign=wrapleft accessible=true accRole=41 accName=rcstr(27) content=rcstr(27) />
<element id=atom(updateintro) layoutpos=bottom contentalign=wrapleft accessible=true accRole=41 accName=rcstr(4113,handlemap(2)) content=rcstr(4113,handlemap(2)) />
<element content=" " />
<element id=atom(title) layoutpos=left contentalign=wrapleft />
</element>
<element layoutpos=client layout=VerticalFlowLayout(0,0,3) padding=rect(0,10,0,10)>
<ARPSupportItem id=atom(publisher) accessible=true accRole=41 AccName=rcstr(28) />
<ARPSupportItem id=atom(version) accessible=true accRole=41 AccName=rcstr(29) />
<ARPSupportItem id=atom(contact) accessible=true accRole=41 AccName=rcstr(30) />
<ARPSupportItem id=atom(support) accessible=true accRole=41 AccName=rcstr(31) />
<ARPSupportItem id=atom(telephone) accessible=true accRole=41 AccName=rcstr(4115,handlemap(2)) />
<ARPSupportItem id=atom(readme) accessible=true accRole=41 AccName=rcstr(32) />
<ARPSupportItem id=atom(update) accessible=true accRole=41 AccName=rcstr(33) />
<Element id=atom(ldivider) height=1 margin=rect(0,5,5,0) />
<ARPSupportItem id=atom(productID) accessible=true accRole=41 AccName=rcstr(34) />
<ARPSupportItem id=atom(regCompany) accessible=true accRole=41 AccName=rcstr(35) />
<ARPSupportItem id=atom(regOwner) accessible=true accRole=41 AccName=rcstr(36) />
<ARPSupportItem id=atom(updateid) accessible=true accRole=41 AccName=rcstr(4114,handlemap(2)) />
<Element id=atom(ldivider) height=1 margin=rect(0,5,5,0) />
<ARPSupportItem id=atom(comments) accessible=true accRole=41 AccName=rcstr(37) />
</element>
<Element layoutpos=bottom layout=borderlayout()>
<Button id=atom(close) class="winstyle" layoutpos=right accessible=true accRole=43 accName=rcstr(4) content=rcstr(4) />
</Element>
<Element layoutpos=bottom id=atom(rdivider) height=1 margin=rect(0,5,5,0) />
<Element layoutpos=bottom id=atom(repairblock) layout=borderlayout()>
<Element layoutpos=top id=atom(rdivider) height=1 margin=rect(0,5,5,0) />
<Button id=atom(repair) class="winstyle" layoutpos=right accessible=true accRole=43 accName=rcstr(39) content=rcstr(39) />
<element id=atom(repairDesc) layoutpos=left contentalign=wrapleft accessible=true accessible=true accRole=41 accName=rcstr(38) content=rcstr(38) />
</Element>
</arphelp>
Pl