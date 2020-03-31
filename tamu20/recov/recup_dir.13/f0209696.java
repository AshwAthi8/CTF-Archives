 dfc(3, 0x0001 | 0x0200);
}
repeatbutton [class="Page"]
{
background: scrollbar;
}
repeatbutton [class="Page"][pressed]
{
background: buttonshadow;
}
</style>
<style resid=BannerSS>
element [id=atom(banner)]
{
background: argb(0,0,0,0);
}
element [id=atom(iconsite)]
{
padding: rect(10rp, 7rp, 0, 0);
}
element [id=atom(icon)]
{
background: argb(0,0,0,0);
}
element [id=atom(header)]
{
background: window;
padding: rect(50rp, 1rp, 3rp, 1rp);
}
element [id=atom(title)]
{
foreground:     windowtext;
fontface:       rcstr(1);
fontsize:       rcint(15)pt;
fontweight:     rcint(10);
contentalign:   middleleft;
margin:         rect(0, 4rp, 0, 4rp);
}
</style>
<style resid=DirectiveSS>
element
{
background: argb(0,0,0,0);
}
element
{
foreground: windowtext;
fontface:   rcstr(2);
fontsize:   rcint(18)pt;
fontweight: rcint(11);
contentalign: wrapleft;
margin: rect(0, 30rp, 0, 0);
}
</style>
<style resid=CategoryListSS>
element
{
background: argb(0,0,0,0);
}
element [id=atom(view)]
{
background: window;
borderthickness: rect(0,0,0,1);
bordercolor: white;
}
element [id=atom(separator)]
{
background: window;
}
element [id=atom(container)]
{
padding: rect(20rp,20rp,20rp,20rp);
}
element [id=atom(categorylist)]
{
margin: rect(0,12rp,0,0);
}
</style>
<style resid=CategoryListItemSS>
linkelement
{
fontsize:    sysmetric(-16);
fontface:    sysmetricstr(6);
foreground:  windowtext;
fontweight:  rcint(10);
background: argb(0,0,0,0);
margin: rect(12rp,12rp,12rp,12rp);
padding: rect(1,1,1,1);  
}
linkelement [keyfocused]
{
contentalign: focusrect;
foreground: hotlight;
}
linkelement [mousefocused]
{
cursor: hand;
foreground: hotlight;
fontstyle: underline;
}
element
{
background: argb(0,0,0,0);
}
element [id=atom(icon)]
{
contentalign: middleleft;
}
element [id=atom(title)]
{
contentalign: wrapleft;
padding:      rect(5rp,0,0,0);
}
</style>
<style resid=CategoryViewSS>
element
{
background: argb(0,0,0,0);
}
element [id=atom(view)]
{
borderthickness: rect(0,0,0,1);
bordercolor: white;
background: window;
}
element [id=atom(separator)]
{
background: window;
}
element [id=atom(container)]
{
padding: rect(20rp,20rp,20rp,20rp);
}
element [id=atom(categorytasklist)]
{
margin: rect(0,12rp,0,0);
}
element [id=atom(appletlist)]
{
margin: rect(0,12rp,0,0);
}
</style>
<style resid=CategoryTaskListItemSS>
linkelement
{
fontsize:     sysmetric(-16);
fontface:     sysmetricstr(6);
foreground:   windowtext;
fontweight:   rcint(10);
background: argb(0,0,0,0);
margin: rect(12rp,12rp,12rp,12rp);
padding: rect(1,1,1,1);  
cursor: hand; 
}
linkelement [keyfocused]
{
contentalign: focusrect;
foreground: hotlight;
}
linkelement [mousefocused]
{
cursor: hand; 
foreground: hotlight;
fontstyle:  underline;
}
element
{
background: argb(0,0,0,0);
}
element [id=atom(icon)]
{
contentalign: middleleft;
}
element [id=atom(title)]
{
contentalign: wrapleft;
padding:       rect(5rp,0,0,0);
}
</style>
<style resid=BarricadeSS>
element [id=atom(barricadetitle)]
{
fontface: rcstr(2);
fontsize: rcint(18)pt;
fontweight: rcint(11);
foreground: windowtext;
background: argb(0,0,0,0);
padding: rect (10rp,20rp,10rp,0rp);
contentalign: wrapleft;
}
element [id=atom(barricademsg)]
{
fontface: rcstr(2);
fontsize: rcint(17)pt;
fontweight: rcint(12);
foreground: windowtext;
background: argb(0,0,0,0);
padding: rect (10rp,15rp,10rp,0rp);
contentalign: wrapleft;
}
</style>
