or : black; margin: 0 }
    body    { font-family: Verdana, Arial, sans-serif; font-size: 9pt }
    table   { font-family: Verdana, Arial, sans-serif; font-size: 9pt }
    
    div.Offscreen     { display:none }
    span.Offscreen    { display:none }
    span.BulletNumber { font-size: x-large; font-weight: bold; color: #66ccff }
    span.BulletText   { font-size: x-small; font-weight: bold; letter-spacing: -1pt; text-align:center}
</style>

</HEAD>

<BODY id=hrerror1 bgcolor=white onLoad="setMessage();">

<div style="position:absolute; left:0; top:0; width:100%; height:45px" id=DivRule>
<table width=100% height=45 color=#FFFFFF bgcolor=#000000 border=0 cellpadding=0>
	<TR>
		<TD style="color:#FFFFFF; font-size:18" id=hrerror2>
		&nbsp;Error Reading Channel
		</TD>
	</TR>
</table>
</div>


<div id=Out0 style="position:absolute; left:10px; width:90%; top:65px" >
The channel you requested contains an error, and cannot be displayed.<BR><BR>
  <u><div id=Out1 class=Outline style="cursor: hand">+ More information</div></u>
  <div id=Out1details style="display:None;">
   <BR>
   The following HRESULT error occured: <SPAN id=Hresult STYLE="color:red">0</SPAN>.
  </div>
</div>

<script language=JavaScript>
function clickHandler() {
  var targetId, srcElement, targetElement;
  srcElement = window.event.srcElement;
  if (srcElement.className == "Outline") {
     targetId = srcElement.id + "details";
     targetElement = document.all(targetId);
     if (targetElement.style.display == "none") {
        targetElement.style.display = "";
     } else {
        targetElement.style.display = "none";
     }
  }
}

document.onclick = clickHandler;

</script>

</BODY>

</HTML>
