)/>
<element layoutpos=bottom Shortcut=rcchar(86) content=rcstr(7)/>
</button>
<button id=atom(pickapps) accessible=true accRole=43 accName=rcstr(93,handlemap(1)) layoutpos=top layout=borderlayout()>
<element layoutpos=top />
<element id=atom(pickappsshortcut) layoutpos=bottom content=rcstr(93,handlemap(1))/>
</button>
</ARPSelector>
</scrollviewer>
<element id=atom(contentpane) sheet=styleref(contentpane) layoutpos=client layout=borderlayout()>
<element id=atom(changepane) layoutpos=client layout=borderlayout()>
<element id=atom(changecontentheader) layout=borderlayout() layoutpos=top>
<element id=atom(label) layoutpos=left accessible=true accRole=41 accName=rcstr(8) content=rcstr(8) />
<element layout=borderlayout() layoutpos=right>
<element layout=borderlayout() layoutpos=left>
<autobutton id=atom(updates) class="padded" accessible=true
accRole=44
accName=rcstr(4100,handlemap(2)) layoutpos=top
layout=borderlayout() selected=false
>
<element id=atom(checkbutton) />
<element id=atom(checktext) content=rcstr(4100,handlemap(2)) />
</autobutton>
</element>
<element width=20rp layoutpos=left/>
<element id=atom(sort) layout=borderlayout() layoutpos=left>
<element Shortcut=rcchar(77) layoutpos=left accessible=true accRole=41 accName=rcstr(40) content=rcstr(40) />
<combobox id=atom(sortcombo) accessible=true accRole=46 accName=rcstr(40) layoutpos=right width=rcint(90) />
</element>
</element>
</element>
<element id=atom(installedlistcontainer) layoutpos=client layout=borderlayout()>
<scrollviewer id=atom(listscroller) sheet=styleref(listscroller) layoutpos=client xscrollable=false>
<selector id=atom(installeditemlist) sheet=styleref(itemlist) layout=borderlayout()/>
</scrollviewer>
</element>
</element>
<element id=atom(addnewpane) layoutpos=none layout=borderlayout()>
<element id=atom(addfromCDPane) layout=borderlayout() layoutpos=top>
<element layoutpos=top accessible=true accRole=41 accName=rcstr(9) content=rcstr(9)/>
<element layoutpos=top layout=borderlayout()>
<element layoutpos=left content=rcbmp(101)/> 
<element layoutpos=client accessible=true accRole=41 accName=rcstr(10) content=rcstr(10) contentalign=wrapleft />
<element layoutpos=right layout=borderlayout()>
<button layoutpos=top id=atom(addfromdisk) accessible=true accRole=43 accName=rcstr(11) Shortcut=rcchar(78) content=rcstr(11) />
</element>
</element>
</element>
<element id=atom(addfromMSpane) layout=borderlayout() layoutpos=top>
<element layoutpos=top accessible=true accRole=41 accName=rcstr(12) content=rcstr(12)/>
<element layoutpos=top layout=borderlayout()>
<element layoutpos=left content=rcbmp(104)/> 
<element layoutpos=client accessible=true accRole=41 accName=rcstr(13) content=rcstr(13) contentalign=wrapleft />
<element layoutpos=right layout=borderlayout()>
<button layoutpos=top id=atom(addfrommsft) accessible=true accRole=43 accName=rcstr(14) Shortcut=rcchar(79) content=rcstr(14) />
</element>
</element>
</element>
<element id=atom(addfromNetworkpane) layout=borderlayout() layoutpos=client>
<element id=atom(addcontentheader) layout=borderlayout() layoutpos=top>
<element id=atom(label) accessible=true accRole=41 accName=rcstr(42) content=rcstr(42) layoutpos=left />
<element layout=borderlayout() layoutpos=right>
<element id=atom(categorylabel) layoutpos=left Shortcut=rcchar(80) accessible=true accRole=41 accName=rcstr(41) content=rcstr(41) />
<combobox id=atom(categorycombo) accessible=true accRole=46 accName=rcstr(41) layoutpos=right width=127 />
</element>
</element>
<element id=atom(publishedlistcontainer) layoutpos=client layout=borderlayout()>
<scrollviewer id=atom(listscroller) sheet=styleref(listscroller) layoutpos=client xscrollable=false>
<selector id=atom(publisheditemlist) sheet=styleref(itemlist) accessible=true accRole=41 accName=rcstr(57) content=rcstr(57) contentalign=wrapleft layout=borderlayout()/>
</scrollviewer>
</element>
</element>
</element>
<element id=atom(addrmwinpane) layoutpos=none layout=filllayout()>
<element id=atom(addrmwinoc) layout=borderlayout()>
<element id=atom(addwincomponent) layout=borderlayout() layoutpos=top>
<element layoutpos=top accessible=true accRole=41 accName=rcstr(69) content=rcstr(69)/>
<element layoutpos=top layout=borderlayout()>
<element layoutpos=left content=rcbmp(101)/> 
<element layoutpos=client accessible=true accRole=41 accName=rcstr(70) content=rcstr(70) contentalign=wrapleft />
<element layoutpos=right layout=borderlayout()>
<button layoutpos=top accessible=true accRole=41 accName=rcstr(71) content=rcstr(71) id=atom(components) />
</element>
</element>
</element>
<element id=atom(sevicespane) layout=borderlayout() layoutpos=client>
<element id=atom(servicecontentheader) layout=borderlayout() layoutpos=top>
<element id=atom(label) layoutpos=left accessible=true accRole=41 accName=rcstr(72) content=rcstr(72) />
</element> 
<element id=atom(ocsetuplistcontainer) layoutpos=client layout=borderlayout()>
<scrollviewer id=atom(listscroller) sheet=styleref(listscroller) layoutpos=client xscrollable=false>
<selector id=atom(ocsetupitemlist) sheet=styleref(itemlist) layout=borderlayout()/>
</scrollviewer>
</element>
</element>
</element>
</element>
<element id=atom(pickapppane) sheet=styleref(pickapppane) layoutpos=none layout=filllayout()>
<element id=atom(pickappadmin) layout=borderlayout()>
<bigelement layoutpos=top contentalign=wrapleft accessible=true accRole=41 stringresid=95 />
<scrollviewer id=atom(clientscroller) sheet=styleref(listscroller) layoutpos=client xscrollable=false>
<ARPSelector id=atom(clienttypelist) sheet=styleref(pickapppane) layoutpos=client layout=borderlayout()>
<expando id=atom(oemclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(102,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(102,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(102,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout()>
<gradientline class="innerheader" layoutpos=top />
<element class="blurbtext" layoutpos=top layout=borderlayout()>
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<bigelement contentalign=wrapleft accessible=true accRole=41 stringresid=103 layoutpos=client />
</element>
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
<expando id=atom(msclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(104,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(104,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(104,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout()>
<gradientline class="innerheader" layoutpos=top />
<element class="blurbtext" layoutpos=top layout=borderlayout()>
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<bigelement contentalign=wrapleft accessible=true accRole=41 stringresid=105 layoutpos=top />
</element>
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
<expando id=atom(nonmsclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(106,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(106,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(106,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout()>
<gradientline class="innerheader" layoutpos=top />
<element class="blurbtext" layoutpos=top layout=borderlayout()>
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<bigelement contentalign=wrapleft accessible=true accRole=41 stringresid=107 layoutpos=top />
</element>
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
<expando id=atom(customclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(108,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(108,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(108,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout() >
<gradientline class="innerheader" layoutpos=top />
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<element class="blurbtext" layoutpos=bottom layout=filllayout()>
<bigelement contentalign=wrapleft layoutpos=top accessible=true accRole=41 stringresid=109/>
</element>
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(132,handlemap(1)) content=rcstr(132,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="StartMenuInternet"
windowsclient="IEXPLORE.EXE"
othermsclients="MSN Explorer"
keeptext=rcstr(111,handlemap(1))
picktext=rcstr(112,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(133,handlemap(1)) content=rcstr(133,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="Mail"
windowsclient="Outlook Express"
othermsclients="Hotmail;MSN Explorer;Microsoft Outlook"
keeptext=rcstr(114,handlemap(1))
keepmstext=rcstr(137,handlemap(1))
picktext=rcstr(115,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(134,handlemap(1)) content=rcstr(134,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="Media"
windowsclient="Windows Media Player"
othermsclients="Media Center Music;Media Center TV;Media Center Videos"
keeptext=rcstr(117,handlemap(1))
picktext=rcstr(118,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(135,handlemap(1)) content=rcstr(135,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="IM"
windowsclient="Windows Messenger"
keeptext=rcstr(120,handlemap(1))
picktext=rcstr(121,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(136,handlemap(1)) content=rcstr(136,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="JavaVM"
windowsclient="MSJavaVM"
keeptext=rcstr(123,handlemap(1))
picktext=rcstr(124,handlemap(1)) />
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
</ARPSelector>
</scrollviewer>
<element sheet=styleref(closepane) layoutpos=bottom layout=borderlayout()
margin=rect(0,8,0,0) >
<element layoutpos=right layout=gridlayout(-1,2) >
<button id=atom(ok) layoutpos=right accessible=true accRole=43 accName=rcstr(96,handlemap(1)) content=rcstr(96,handlemap(1)) margin=rect(8,0,8,0) />
<button id=atom(cancel) layoutpos=right accessible=true accRole=43 accName=rcstr(97,handlemap(1)) content=rcstr(97,handlemap(1)) margin=rect(8,0,8,0) />
</element>
</element>
</element>
<element id=atom(pickappnonadmin) visible=false layout=borderlayout()>
<bigelement layoutpos=top contentalign=wrapleft accessible=true accRole=41 stringresid=129 />
</element>
</element>
</element>
</arpframe>
<arpitem resid=installeditem layoutpos=top layout=borderlayout()>
<element id=atom(icon) layoutpos=left content=rcbmp(106)/>
<element layoutpos=top layout=borderlayout()>
<element id=atom(row1) layout=filllayout() layoutpos=right enabled=false contentalign=topright>
<element Layout=RowLayout(22,1,3)>
<element id=atom(sizelabel) accessible=true accRole=41 accName=rcstr(60) content=rcstr(60) />
<button id=atom(size) />
</element>
</element>
<element id=atom(title) layoutpos=left contentalign=wrapleft/>
</element>
<element id=atom(exinfo) layoutpos=none layout=borderlayout()>
<element layoutpos=top layout=borderlayout()>
<element layout=flowlayout(0) layoutpos=client>
<button id=atom(supinfo) accessible=true accRole=41 accName=rcstr(16) content=rcstr(16) />
</element>
<element id=atom(row2) layout=filllayout() layoutpos=right contentalign=wrapright>
<element Layout=RowLayout(22,1,3)>
<element id=atom(freqlabel) accessible=true accRole=41 accName=rcstr(61) content=rcstr(61) />
<button id=atom(freq) />
</element>
</element>
</element>
<element Layout=BorderLayout() layoutpos=top>
<element id=atom(row3) layout=filllayout() layoutpos=right contentalign=wrapright>
<element Layout=RowLayout(22,1,3)>
<element id=atom(lastlabel) accessible=true accRole=41 accName=rcstr(62) content=rcstr(62) />
<element id=atom(lastused) />
</element>
</element>
</element>
<element Layout=BorderLayout() layoutpos=top>
<element id=atom(row4) Layout=filllayout() layoutpos=right contentalign=wrapright>
<element Layout=RowLayout(22,1,3)>
<element accessible=true accRole=41 accName=rcstr(4101,handlemap(2)) content=rcstr(4101,handlemap(2)) />
<element id=atom(installed) />
</element>
</element>
</element>
<element id=atom(instruct) layoutpos=client contentalign=wrapleft/>
<element id=atom(itemaction) sheet=styleref(itemaction) layoutpos=right layout=borderlayout()/>
</element>
</arpitem>
<arpitem resid=publisheditem layoutpos=top layout=borderlayout()>
<element id=atom(icon) layoutpos=left content=rcbmp(106)/>
<element layoutpos=top layout=borderlayout()>
<element id=atom(title) layoutpos=left contentalign=wrapleft/>
<element id=atom(installed) layoutpos=right contentalign=topright/>
</element>
<element id=atom(exinfo) layoutpos=none layout=borderlayout()>
<element id=atom(instruct) layoutpos=client accessible=true accRole=41 accName=rcstr(54) content=rcstr(54) contentalign=wrapleft/>
<element id=atom(itemaction) sheet=styleref(itemaction) layoutpos=right layout=borderlayout()/>
</element>
</arpitem>
<arpitem resid=ocsetupitem layoutpos=top layout=borderlayout()>
<element id=atom(icon) layoutpos=left content=rcbmp(107)/>
<element layoutpos=top layout=borderlayout()>
<element id=atom(title) layoutpos=left contentalign=wrapleft/>
</element>
<element id=atom(exinfo) layoutpos=none layout=borderlayout()>
<element id=atom(instruct) layoutpos=top accessible=true accRole=41 accName=rcstr(67) content=rcstr(67) contentalign=wrapleft/>
<element id=atom(warning) layoutpos=top accessible=true accRole=41 accName=rcstr(68) content=rcstr(68) contentalign=wrapleft/>
<element id=atom(itemaction) sheet=styleref(itemaction) layoutpos=right layout=borderlayout()/>
</element>
</arpitem>
<element resid=installeditemdoubleaction layoutpos=top layout=flowlayout(0, 0, 1, 2)>
<button id=atom(chg) accessible=true accRole=43 accName=rcstr(17) content=rcstr(17) />
<button id=atom(rm) accessible=true accRole=43 accName=rcstr(18) content=rcstr(18) />
</element>
<element resid=installeditemchangeonlyaction layoutpos=top layout=flowlayout(0, 0, 1, 2)>
<button id=atom(chg) accessible=true accRole=43 accName=rcstr(17) content=rcstr(17) />
</element>
<element resid=installeditemremoveonlyaction layoutpos=top layout=flowlayout(0, 0, 1, 2)>
<button id=atom(rm) accessible=true accRole=43 accName=rcstr(18) content=rcstr(18) />
</element>
<element resid=installeditemsingleaction layoutpos=top layout=flowlayout(0, 0, 1, 2)>
<button id=atom(chgrm) accessible=true accRole=43 accName=rcstr(19) content=rcstr(19) />
</element>
<element resid=publisheditemsingleaction layoutpos=top layout=flowlayout(0, 0, 1, 2)>
<button id=atom(add) accessible=true accRole=43 accName=rcstr(20) content=rcstr(20) />
</element>
<element resid=ocsetupitemsingleaction layoutpos=top layout=flowlayout(0, 0, 1, 2)>
<button id=atom(configure) accessible=true accRole=43 accName=rcstr(66) content=rcstr(66) />
</element>
<element resid=oemclientshowhide layoutpos=top layout=borderlayout() >
<element class="clientrow" id=atom(show) class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" contentalign=wrapright accessible=true accRole=41 accName=rcstr(126,handlemap(1)) content=rcstr(126,handlemap(1)) />
<element class="clientstatic" id=atom(list) accessible=true accRole=41 />
</element>
<element class="clientrow" id=atom(hide) class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" contentalign=wrapright accessible=true accRole=41 accName=rcstr(127,handlemap(1)) content=rcstr(127,handlemap(1)) />
<element class="clientstatic" id=atom(list) accessible=true accRole=41 />
</element>
</element>
<element resid=clientcategoryblock id=atom(clipped) layoutpos=top layout=borderlayout() >
<element layout=verticalflowlayout(0) layoutpos=top padding=rect(8rp,0,0,0) >
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(110,handlemap(1)) content=rcstr(110,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="StartMenuInternet" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(113,handlemap(1)) content=rcstr(113,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="Mail" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(116,handlemap(1)) content=rcstr(116,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="Media" />
</element>
<element class="interrowspacer" layoutpos=top />
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
