43 accName=rcstr(10040,handlemap(1)) layoutpos=top layout=borderlayout()>
<element layoutpos=top content=rcbmp(100,3,-1,0,0,0,0,handlemap(1))/>
<element id=atom(pickappsshortcut) layoutpos=bottom content=rcstr(10040,handlemap(1))/>
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
<bigelement layoutpos=top contentalign=wrapleft accessible=true accRole=41 stringresid=10042 />
<scrollviewer id=atom(clientscroller) sheet=styleref(listscroller) layoutpos=client xscrollable=false>
<ARPSelector id=atom(clienttypelist) sheet=styleref(pickapppane) layoutpos=client layout=borderlayout()>
<expando id=atom(oemclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(10049,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(10049,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(10049,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout()>
<gradientline class="innerheader" layoutpos=top />
<element class="blurbtext" layoutpos=top layout=borderlayout()>
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<bigelement contentalign=wrapleft accessible=true accRole=41 stringresid=10050 layoutpos=client />
</element>
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
<expando id=atom(msclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(10051,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(10051,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(10051,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout()>
<gradientline class="innerheader" layoutpos=top />
<element class="blurbtext" layoutpos=top layout=borderlayout()>
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<bigelement contentalign=wrapleft accessible=true accRole=41 stringresid=10052 layoutpos=top />
</element>
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
<expando id=atom(nonmsclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(10053,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(10053,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(10053,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout()>
<gradientline class="innerheader" layoutpos=top />
<element class="blurbtext" layoutpos=top layout=borderlayout()>
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<bigelement contentalign=wrapleft accessible=true accRole=41 stringresid=10054 layoutpos=top />
</element>
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
<expando id=atom(customclients) layoutpos=top layout=borderlayout()>
<autobutton id=atom(header) class="padded" accessible=true accRole=45 accName=rcstr(10055,handlemap(1)) layoutpos=top layout=borderlayout()>
<autobutton id=atom(arrow) accessible=true accRole=64 accName=rcstr(10055,handlemap(1)) />
<element id=atom(radiobutton) />
<element id=atom(radiotext) content=rcstr(10055,handlemap(1)) />
</autobutton>
<clipper layoutpos=top>
<element id=atom(clipped) layout=borderlayout() >
<gradientline class="innerheader" layoutpos=top />
<element id=atom(radiobutton) visible=false />
<element class="radioindent" />
<element class="blurbtext" layoutpos=bottom layout=filllayout()>
<bigelement contentalign=wrapleft layoutpos=top accessible=true accRole=41 stringresid=10056/>
</element>
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(10079,handlemap(1)) content=rcstr(10079,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="StartMenuInternet"
windowsclient="IEXPLORE.EXE"
othermsclients="MSN Explorer"
keeptext=rcstr(10058,handlemap(1))
picktext=rcstr(10059,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(10080,handlemap(1)) content=rcstr(10080,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="Mail"
windowsclient="Outlook Express"
othermsclients="Hotmail;MSN Explorer;Microsoft Outlook"
keeptext=rcstr(10061,handlemap(1))
keepmstext=rcstr(10084,handlemap(1))
picktext=rcstr(10062,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(10081,handlemap(1)) content=rcstr(10081,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="Media"
windowsclient="Windows Media Player"
othermsclients="Media Center Music;Media Center TV;Media Center Videos"
keeptext=rcstr(10064,handlemap(1))
picktext=rcstr(10065,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(10082,handlemap(1)) content=rcstr(10082,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="IM"
windowsclient="Windows Messenger"
keeptext=rcstr(10067,handlemap(1))
picktext=rcstr(10068,handlemap(1)) />
<gradientline class="intercategory" layoutpos=top />
<element class="clientcaption" id=atom(rowheader) layoutpos=top accessible=true accRole=41 accName=rcstr(10083,handlemap(1)) content=rcstr(10083,handlemap(1)) />
<clientblock layoutpos=top layout=borderlayout()
clienttype="JavaVM"
windowsclient="MSJavaVM"
keeptext=rcstr(10070,handlemap(1))
picktext=rcstr(10071,handlemap(1)) />
</element>
</clipper>
</expando>
<gradientline class="interheader" layoutpos=top />
</ARPSelector>
</scrollviewer>
<element sheet=styleref(closepane) layoutpos=bottom layout=borderlayout()
margin=rect(0,8,0,0) >
<element layoutpos=right layout=gridlayout(-1,2) >
<button id=atom(ok) layoutpos=right accessible=true accRole=43 accName=rcstr(10043,handlemap(1)) content=rcstr(10043,handlemap(1)) margin=rect(8,0,8,0) />
<button id=atom(cancel) layoutpos=right accessible=true accRole=43 accName=rcstr(10044,handlemap(1)) content=rcstr(10044,handlemap(1)) margin=rect(8,0,8,0) />
</element>
</element>
</element>
<element id=atom(pickappnonadmin) visible=false layout=borderlayout()>
<bigelement layoutpos=top contentalign=wrapleft accessible=true accRole=41 stringresid=10076 />
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
<element class="clientcaption" contentalign=wrapright accessible=true accRole=41 accName=rcstr(10073,handlemap(1)) content=rcstr(10073,handlemap(1)) />
<element class="clientstatic" id=atom(list) accessible=true accRole=41 />
</element>
<element class="clientrow" id=atom(hide) class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" contentalign=wrapright accessible=true accRole=41 accName=rcstr(10074,handlemap(1)) content=rcstr(10074,handlemap(1)) />
<element class="clientstatic" id=atom(list) accessible=true accRole=41 />
</element>
</element>
<element resid=clientcategoryblock id=atom(clipped) layoutpos=top layout=borderlayout() >
<element layout=verticalflowlayout(0) layoutpos=top padding=rect(8rp,0,0,0) >
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(10057,handlemap(1)) content=rcstr(10057,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="StartMenuInternet" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(10060,handlemap(1)) content=rcstr(10060,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="Mail" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(10063,handlemap(1)) content=rcstr(10063,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="Media" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(10066,handlemap(1)) content=rcstr(10066,handlemap(1)) />
<clientpicker layout=filllayout() clienttype="IM" />
</element>
<element class="interrowspacer" layoutpos=top />
<element class="clientrow" Layout=rowlayout(24,3,3) contentalign=topleft layoutpos=top>
<element class="clientcaption" id=atom(rowheader) contentalign=wrapright accessible=true accRole=41 accName=rcstr(10069,handlemap(1)) content=rcstr(10069,handlemap(1)) />
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
<autobutton id=atom(show) class="padded" accessible=true accRole=44 accName=rcstr(10072,handlemap(1)) layout=borderlayout() selected=false>
<element id=atom(checkbutton) />
<element id=atom(checktext) content=rcstr(10072,handlemap(1)) />
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
<style resid=frame>
arpframe
{
accessible: true;
accRole: 9;
accName: rcstr(56);
fontsize: sysmetric(-16);
fontweight: sysmetric(-17);
fontstyle: sysmetric(-18);
fontface: sysmetricstr(6);
background: window;
foreground: windowtext;
}
</style>
<style resid=closepane>
element [id=atom(closepane)]
{
background: buttonface;
padding: rect(10,10,10,10);
}
button
{
background: dfc(4, 0x0010);
foreground: buttontext;
padding: rect(20,6,20,6);
contentalign: middlecenter;
}
button [pressed]
{
background: dfc(4, 0x0010 | 0x0200);
padding: rect(21,7,19,5);
}
button [keyfocused]
{
contentalign: middlecenter | focusrect;
}
button [enabled=false]
{
background: dfc(4, 0x0010 | 0x0100);
foreground: graytext;
fontstyle: shadow;
}
progress
{
borderthickness: rect(2,2,2,2);
bordercolor: buttonface;
borderstyle: sunken;
padding: rect(1,1,1,1);
margin: rect(0, 4, 0, 2);
foreground: rcbmp(100);
}
</style>
<style resid=optionpane>
ARPSelector
{
background: appworkspace;
foreground: buttontext;
padding: rect(3,3,3,3);
}
element
{
background: argb(0,0,0,0);
}
button
{
bordercolor: appworkspace;
borderthickness: rect(2,2,2,2);
foreground: captiontext;
margin: rect(5,5,5,5);
padding: rect(2,2,2,4);
}
button [keyfocused]
{
borderstyle: raised;
bordercolor: threedlightshadow;
}
button [mousefocused]
{
borderstyle: raised;
bordercolor: threedlightshadow;
}
button [pressed]
{
borderstyle: sunken;
padding: rect(3,3,1,3);
bordercolor: threedlightshadow;
}
button [selected]
{
borderstyle: sunken;
padding: rect(3,3,1,3);
bordercolor: threedlightshadow;
}
</style>
<style resid=contentpane>
element [id=atom(contentpane)]
{
padding: rect(10,10,10,10);
}
element [id=atom(installedlistcontainer)]
{
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
padding: rect(0,0,0,0);
}
element [id=atom(publishedlistcontainer)]
{
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
padding: rect(0,0,0,0);
}
element [id=atom(ocsetuplistcontainer)]
{
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
padding: rect(0,0,0,0);
}
element [id=atom(label)]
{
padding: rect(0,5,5,5);
}
element
{
padding: rect(2,2,2,2);
}
element [id=atom(sort)]
{
padding: rect(2,2,0,2);
}
button
{
background: dfc(4, 0x0010);
foreground: buttontext;
padding: rect(8,6,8,6);
margin: rect(5,5,5,5);
}
button [pressed]
{
background: dfc(4, 0x0010 | 0x0200);
padding: rect(9,7,7,5);
}
button [keyfocused]
{
contentalign: focusrect;
}
autobutton [keyfocused]
{
contentalign: focusrect;
}
autobutton [class="padded"]
{
padding: rect(8rp,2rp,8rp,2rp);
}
element [id=atom(checkbutton)]
{
width: sysmetric(71);
height: sysmetric(72);
margin: rect(0,6rp,8rp,6rp);
layoutpos: left;
background: dfc(4, 0x0000);
}
element [id=atom(checkbutton)][selected]
{
background: dfc(4, 0x0000 | 0x0400);
}
element [id=atom(checkbutton)][enabled=false]
{
background: dfc(4, 0x0000 | 0x0100);
}
element [id=atom(checkbutton)][selected][enabled=false]
{
background: dfc(4, 0x0000 | 0x0400 | 0x0100);
}
element [id=atom(checktext)]
{
layoutpos: client;
contentalign: wrapleft;
}
element [id=atom(checktext)][enabled=false]
{
foreground: graytext;
}
</style>
<style resid=listscroller>
scrollbar
{
layoutpos: ninebottom;
}
scrollbar [vertical]
{
layoutpos: nineright;
}
viewer
{
layoutpos: nineclient;
}
thumb
{
background: dfc(4, 0x0010); 
}
repeatbutton [id=atom(lineup)]
{
background: dfc(3, 0x0000);
width: sysmetric(2);
height: sysmetric(20);
}
repeatbutton [id=atom(lineup)][pressed]
{
background: dfc(3, 0x0000 | 0x0200);
}
repeatbutton [id=atom(linedown)]
{
background: dfc(3, 0x0001);
width: sysmetric(2);
height: sysmetric(20);
}
repeatbutton [id=atom(linedown)][pressed]
{
background: dfc(3, 0x0001 | 0x0200);
}
repeatbutton [class="Page"]
{ 
background: scrollbar;
}
repeatbutton [class="Page"][pressed]
{ 
background: buttonshadow;
}
scrollviewer[id=atom(clientscroller)]
{
borderstyle: solid;
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
margin: rect(0,10rp,0,0);
}
</style>
<style resid=itemlist>
arpitem
{
padding: rect(1,1,1,3);
}
arpitem [selected]
{
background: buttonface;
foreground: buttontext;
bordercolor: buttontext;
}
arpitem [keyfocused][selected]
{
background: highlight;
foreground: highlighttext;
bordercolor: highlighttext;
}
arpitem [parentedupdate]
{
padding: rect(30,1,1,1);
}
element
{
padding: rect(1,1,1,1);
}
element [id=atom(title)][selected]
{
fontweight: extrabold;
}
button
{
padding: rect(1,1,1,1);
contentalign: wrapright;
}
button [id=atom(supinfo)]
{
contentalign: wrapleft;
}
button [selected]
{
fontstyle: underline;
cursor: hand;
}
button [id=atom(supinfo)][keyfocused]
{
contentalign: wrapleft|focusrect;
}
button [keyfocused]
{
fontstyle: none;
contentalign: wrapright|focusrect;
}
</style>
<style resid=itemaction>
button
{
background: dfc(4, 0x0010);
foreground: buttontext;
padding: rect(8,6,8,6);
margin: rect(5,5,5,5);
}
button [pressed]
{
background: dfc(4, 0x0010 | 0x0200);
padding: rect(9,7,7,5);
}
button [keyfocused]
{
contentalign: focusrect;
}
</style>
<style resid=helppopup>
arphelp
{
accessible: true;
accRole: 9;
background: infobackground;
foreground: infotext;
padding: rect(6,6,6,6);
fontsize: sysmetric(-16);
fontweight: sysmetric(-17);
fontstyle: sysmetric(-18);
fontface: sysmetricstr(6);
}
element [id=atom(divider)]
{
background: infotext;
}
element [id=atom(rdivider)]
{
background: infotext;
}
element
{
background: argb(0,0,0,0);
}
element [id=atom(title)]
{
fontsize: sysmetric(-1);
fontweight: sysmetric(-2);
fontstyle: sysmetric(-3);
fontface: sysmetricstr(1);
}
button [Enabled]
{
foreground: hotlight;
fontstyle: underline;
}
button [MouseFocused]
{
cursor: hand;
}
button [class="winstyle"]
{
background: dfc(4, 0x0010);
foreground: buttontext;
padding: rect(8,6,8,6);
margin: rect(5,5,5,5);
cursor: arrow;
fontstyle: none;
}
button [class="winstyle"][pressed]
{
background: dfc(4, 0x0010 | 0x0200);
padding: rect(9,7,7,5);
}
button [keyfocused]
{
contentalign: focusrect;
}
ARPSupportItem
{
ContentAlign: WrapLeft;
}
</style>
<style resid=pickapppane>
element [class="clientcaption"]
{
padding: rect(0,4rp,8rp,0);
}
element [class="clientcaption"][id=atom(rowheader)]
{
fontweight: bold;
}
element [class="clientstatic"]
{
padding: rect(3rp,4rp,0,0);
}
element [class="interrowspacer"]
{
height: 6rp;
}
element [class="blurbtext"]
{
padding:rect(0,8rp,8rp,8rp);
}
element [id=atom(clipped)]
{
padding:rect(0,0,0,4rp);
}
element [id=atom(radiobutton)]
{
width: sysmetric(71);
height: sysmetric(72);
margin: rect(0,6rp,8rp,6rp);
layoutpos: left;
background: dfc(4, 0x0004);
}
element [id=atom(radiobutton)][selected]
{
background: dfc(4, 0x0004 | 0x0400);
}
element [id=atom(radiotext)]
{
layoutpos: left;
contentalign: middleleft;
}
element [class="radioindent"]
{
layoutpos: left;
padding: rect(8rp,0,0,0);
}
element [id=atom(checkbutton)]
{
width: sysmetric(71);
height: sysmetric(72);
margin: rect(0,6rp,8rp,6rp);
layoutpos: left;
background: dfc(4, 0x0000);
}
element [id=atom(checkbutton)][selected]
{
background: dfc(4, 0x0000 | 0x0400);
}
element [id=atom(checkbutton)][enabled=false]
{
background: dfc(4, 0x0000 | 0x0100);
}
element [id=atom(checkbutton)][selected][enabled=false]
{
background: dfc(4, 0x0000 | 0x0400 | 0x0100);
}
element [id=atom(checktext)]
{
layoutpos: client;
contentalign: wrapleft;
}
element [id=atom(checktext)][enabled=false]
{
foreground: graytext;
}
autobutton [id=atom(arrow)]
{
layoutpos: right;
content: rcbmp(102,3,-1,0,0,0,0,handlemap(3));
}
autobutton [id=atom(arrow)][selected]
{
content: rcbmp(100,3,-1,0,0,0,0,handlemap(3));
}
autobutton [class="padded"]
{
padding: rect(8rp,2rp,8rp,2rp);
}
button [keyfocused]
{
contentalign: focusrect;
}
autobutton [keyfocused]
{
contentalign: focusrect;
}
expando
{
animation: rectanglev | s | fast;
}
expando [selected]
{
background: buttonface;
foreground: buttontext;
}
clipper
{
alpha: 0;
animation: alpha | s | fast;
}
clipper [expanded]
{
alpha: 255;
}
element [class="customclientitem"]
{
padding: rect(20rp,6rp,8rp,6rp);
}
gradientline
{
animation: rectanglev | s | fast;
height: 1rp;
}
gradientline [class="intercategory"]
{
foreground: highlight;
}
gradientline [class="interheader"]
{
foreground: buttonface;
margin: rect(0,1rp,0,1rp);
}
gradientline [class="innerheader"]
{
foreground: buttonface;
}
gradientline [class="innerheader"][selected]
{
foreground: window;
}
</style>
<style resid=frame>
arpframe
{
accessible: true;
accRole: 9;
accName: rcstr(56);
fontsize: sysmetric(-16);
fontweight: sysmetric(-17);
fontstyle: sysmetric(-18);
fontface: sysmetricstr(6);
background: window;
foreground: windowtext;
}
</style>
<style resid=closepane>
element [id=atom(closepane)]
{
background: buttonface;
padding: rect(10,10,10,10);
}
button
{
background: dtb(handlemap(4), 1, 1);
foreground: buttontext;
padding: rect(20,6,20,6);
contentalign: middlecenter;
}
button [mousefocused]
{
background: dtb(handlemap(4), 1, 2);
}
button [pressed]
{
background: dtb(handlemap(4), 1, 3);
padding: rect(21,7,19,5);
}
button [enabled=false]
{
background: dtb(handlemap(4), 1, 4);
foreground: graytext;
fontstyle: shadow;
}
button [keyfocused]
{
contentalign: middlecenter | focusrect;
}
progress
{
borderthickness: rect(2,2,2,2);
bordercolor: buttonface;
borderstyle: sunken;
padding: rect(1,1,1,1);
margin: rect(0, 4, 0, 2);
foreground: rcbmp(100);
}
</style>
<style resid=optionpane>
ARPSelector
{
background: dtb(handlemap(6), 0, 0);
foreground: buttontext;
padding: rect(3,3,3,3);
}
element
{
background: argb(0,0,0,0);
}
button
{
background: dtb(handlemap(6), 1, 1);
margin: rect(5,6,5,6);
padding: rect(6,6,6,8);
}
button [keyfocused]
{
background: dtb(handlemap(6), 1, 2);
}
button [mousefocused]
{
background: dtb(handlemap(6), 1, 2);
}
button [pressed]
{
background: dtb(handlemap(6), 1, 3);
padding: rect(7,7,5,7);
}
button [selected]
{
background: dtb(handlemap(6), 1, 5);
padding: rect(7,7,5,7);
}
</style>
<style resid=contentpane>
element [id=atom(contentpane)]
{
padding: rect(10,10,10,10);
}
element [id=atom(installedlistcontainer)]
{
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
padding: rect(0,0,0,0);
}
element [id=atom(publishedlistcontainer)]
{
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
padding: rect(0,0,0,0);
}
element [id=atom(ocsetuplistcontainer)]
{
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
padding: rect(0,0,0,0);
}
element [id=atom(label)]
{
padding: rect(0,5,5,5);
}
element
{
padding: rect(2,2,2,2);
}
element [id=atom(sort)]
{
padding: rect(2,2,0,2);
}
button
{
background: dtb(handlemap(4), 1, 1);
foreground: buttontext;
padding: rect(8,6,8,6);
margin: rect(5,5,5,5);
}
button [mousefocused]
{
background: dtb(handlemap(4), 1, 2);
}
button [pressed]
{
background: dtb(handlemap(4), 1, 3);
padding: rect(9,7,7,5);
}
button [keyfocused]
{
contentalign: focusrect;
}
autobutton [keyfocused]
{
contentalign: focusrect;
}
autobutton [class="padded"]
{
padding: rect(8rp,2rp,8rp,2rp);
}
element [id=atom(checkbutton)]
{
width: sysmetric(71);
height: sysmetric(72);
margin: rect(0,6rp,8rp,6rp);
layoutpos: left;
background: dtb(handlemap(4), 3, 1);
}
element [id=atom(checkbutton)][selected]
{
background: dtb(handlemap(4), 3, 5);
}
element [id=atom(checkbutton)][mousefocused]
{
background: dtb(handlemap(4), 3, 2);
}
element [id=atom(checkbutton)][selected][mousefocused]
{
background: dtb(handlemap(4), 3, 6);
}
element [id=atom(checkbutton)][enabled=false]
{
background: dtb(handlemap(4), 3, 4);
}
element [id=atom(checkbutton)][selected][enabled=false]
{
background: dtb(handlemap(4), 3, 8);
}
element [id=atom(checktext)]
{
layoutpos: client;
contentalign: wrapleft;
}
element [id=atom(checktext)][enabled=false]
{
foreground: graytext;
}
</style>
<style resid=listscroller>
scrollbar
{
layoutpos: ninebottom;
}
scrollbar [vertical]
{
layoutpos: nineright;
}
viewer
{
layoutpos: nineclient;
}
thumb
{
background: dtb(handlemap(5), 3, 1);
content: dtb(handlemap(5), 9, 1);
contentalign: middlecenter;
}
thumb [mousefocused]
{
background: dtb(handlemap(5), 3, 2);
content: dtb(handlemap(5), 9, 2);
}
thumb [captured]
{
background: dtb(handlemap(5), 3, 3);
content: dtb(handlemap(5), 9, 3);
}
repeatbutton [id=atom(lineup)]
{
background: dtb(handlemap(5), 1, 1);
width: sysmetric(2);
height: sysmetric(20);
}
repeatbutton [id=atom(lineup)][mousefocused]
{
background: dtb(handlemap(5), 1, 2);
}
repeatbutton [id=atom(lineup)][pressed]
{
background: dtb(handlemap(5), 1, 3);
}
repeatbutton [id=atom(linedown)]
{
background: dtb(handlemap(5), 1, 5);
width: sysmetric(2);
height: sysmetric(20);
}
repeatbutton [id=atom(linedown)][mousefocused]
{
background: dtb(handlemap(5), 1, 6);
}
repeatbutton [id=atom(linedown)][pressed]
{
background: dtb(handlemap(5), 1, 7);
}
repeatbutton [id=atom(pageup)]
{ 
background: dtb(handlemap(5), 7, 1);
}
repeatbutton [id=atom(pageup)][mousefocused]
{ 
background: dtb(handlemap(5), 7, 2);
}
repeatbutton [id=atom(pageup)][pressed]
{ 
background: dtb(handlemap(5), 7, 3);
}
repeatbutton [id=atom(pagedown)]
{ 
background: dtb(handlemap(5), 6, 1);
}
repeatbutton [id=atom(pagedown)][mousefocused]
{ 
background: dtb(handlemap(5), 6, 2);
}
repeatbutton [id=atom(pagedown)][pressed]
{ 
background: dtb(handlemap(5), 6, 3);
}
scrollviewer[id=atom(clientscroller)]
{
borderstyle: solid;
borderthickness: rect(1,1,1,1);
bordercolor: buttonshadow;
margin: rect(0,10rp,0,0);
}
</style>
<style resid=itemlist>
arpitem
{
padding: rect(1,1,1,3);
}
arpitem [selected]
{
background: buttonface;
foreground: buttontext;
bordercolor: buttontext;
}
arpitem [keyfocused][selected]
{
background: highlight;
foreground: highlighttext;
bordercolor: highlighttext;
}
arpitem [parentedupdate]
{
padding: rect(20,1,1,1);
}
element
{
padding: rect(1,1,1,1);
}
element [id=atom(title)][selected]
{
fontweight: extrabold;
}
button
{
padding: rect(1,1,1,1);
contentalign: wrapright;
}
button [id=atom(supinfo)]
{
contentalign: wrapleft;
}
button [selected]
{
fontstyle: underline;
cursor: hand;
}
button [id=atom(supinfo)][keyfocused]
{
contentalign: wrapleft|focusrect;
}
button [keyfocused]
{
fontstyle: none;
contentalign: wrapright|focusrect;
}
</style>
<style resid=itemaction>
button
{
background: dtb(handlemap(4), 1, 1);
foreground: buttontext;
padding: rect(8,6,8,6);
margin: rect(5,5,5,5);
}
button [mousefocused]
{
background: dtb(handlemap(4), 1, 2);
}
button [pressed]
{
background: dtb(handlemap(4), 1, 3);
padding: rect(9,7,7,5);
}
button [keyfocused]
{
contentalign: focusrect;
}
</style>
<style resid=helppopup>
arphelp
{
accessible: true;
accRole: 9;
background: infobackground;
foreground: infotext;
padding: rect(6,6,6,6);
fontsize: sysmetric(-16);
fontweight: sysmetric(-17);
fontstyle: sysmetric(-18);
fontface: sysmetricstr(6);
}
element [id=atom(divider)]
{
background: infotext;
}
element [id=atom(rdivider)]
{
background: infotext;
}
element
{
background: argb(0,0,0,0);
}
element [id=atom(title)]
{
fontsize: sysmetric(-1);
fontweight: sysmetric(-2);
fontstyle: sysmetric(-3);
fontface: sysmetricstr(1);
}
button [Enabled]
{
foreground: hotlight;
fontstyle: underline;
}
button [MouseFocused]
{
cursor: hand;
}
button [class="winstyle"]
{
background: dtb(handlemap(4), 1, 1);
foreground: buttontext;
padding: rect(8,6,8,6);
margin: rect(5,5,5,5);
cursor: arrow;
fontstyle: none;
}
button [class="winstyle"][mousefocused]
{
background: dtb(handlemap(4), 1, 2);
}
button [class="winstyle"][pressed]
{
background: dtb(handlemap(4), 1, 3);
padding: rect(9,7,7,5);
}
button [keyfocused]
{
contentalign: focusrect;
}
ARPSupportItem
{
ContentAlign: WrapLeft;
}
</style>
<style resid=pickapppane>
element [class="clientcaption"]
{
padding: rect(0,4rp,8rp,0);
}
element [class="clientcaption"][id=atom(rowheader)]
{
fontweight: bold;
}
element [class="clientstatic"]
{
padding: rect(3rp,4rp,0,0);
}
element [class="interrowspacer"]
{
height: 6rp;
}
element [class="blurbtext"]
{
padding:rect(0,8rp,8rp,8rp);
}
element [id=atom(clipped)]
{
padding:rect(0,0,0,4rp);
}
element [id=atom(radiobutton)]
{
width: sysmetric(71);
height: sysmetric(72);
margin: rect(0,6rp,8rp,6rp);
layoutpos: left;
background: dtb(handlemap(4), 2, 1);
}
element [id=atom(radiobutton)][mousefocused]
{
background: dtb(handlemap(4), 2, 2);
}
element [id=atom(radiobutton)][selected]
{
background: dtb(handlemap(4), 2, 5);
}
element [id=atom(radiobutton)][selected][mousefocused]
{
background: dtb(handlemap(4), 2, 6);
}
element [id=atom(radiotext)]
{
layoutpos: left;
contentalign: middleleft;
}
element [class="radioindent"]
{
layoutpos: left;
padding: rect(8rp,0,0,0);
}
element [id=atom(checkbutton)]
{
width: sysmetric(71);
height: sysmetric(72);
margin: rect(0,6rp,8rp,6rp);
layoutpos: left;
background: dtb(handlemap(4), 3, 1);
}
element [id=atom(checkbutton)][selected]
{
background: dtb(handlemap(4), 3, 5);
}
element [id=atom(checkbutton)][mousefocused]
{
background: dtb(handlemap(4), 3, 2);
}
element [id=atom(checkbutton)][selected][mousefocused]
{
background: dtb(handlemap(4), 3, 6);
}
element [id=atom(checkbutton)][enabled=false]
{
background: dtb(handlemap(4), 3, 4);
}
element [id=atom(checkbutton)][selected][enabled=false]
{
background: dtb(handlemap(4), 3, 8);
}
element [id=atom(checktext)]
{
layoutpos: client;
contentalign: wrapleft;
}
element [id=atom(checktext)][enabled=false]
{
foreground: graytext;
}
autobutton [id=atom(arrow)]
{
layoutpos: right;
content: rcbmp(102,2,255,0,0,0,0,handlemap(3));
}
autobutton [id=atom(arrow)][selected]
{
content: rcbmp(100,2,255,0,0,0,0,handlemap(3));
}
autobutton [id=atom(arrow)][mousefocused]
{
content: rcbmp(103,2,255,0,0,0,0,handlemap(3));
}
autobutton [id=atom(arrow)][selected][mousefocused]
{
content: rcbmp(101,2,255,0,0,0,0,handlemap(3));
}
autobutton [class="padded"]
{
padding: rect(8rp,2rp,8rp,2rp);
}
button [keyfocused]
{
contentalign: focusrect;
}
autobutton [keyfocused]
{
contentalign: focusrect;
}
expando
{
animation: rectanglev | s | fast;
}
expando [selected]
{
background: buttonface;
foreground: buttontext;
}
clipper
{
alpha: 0;
animation: alpha | s | fast;
}
clipper [expanded]
{
alpha: 255;
}
element [class="customclientitem"]
{
padding: rect(20rp,6rp,8rp,6rp);
}
gradientline
{
animation: rectanglev | s | fast;
height: 1rp;
}
gradientline [class="intercategory"]
{
foreground: highlight;
}
gradientline [class="interheader"]
{
foreground: buttonface;
margin: rect(0,1rp,0,1rp);
}
gradientline [class="innerheader"]
{
foreground: buttonface;
}
gradientline [class="innerheader"][selected]
{
foreground: window;
}
</style>
P/