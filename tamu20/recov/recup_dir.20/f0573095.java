ng: rect(9,7,7,5);
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