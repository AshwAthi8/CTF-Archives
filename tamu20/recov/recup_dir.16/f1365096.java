cRole=41 accName=rcstr(27) content=rcstr(27) />
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
bordercolo