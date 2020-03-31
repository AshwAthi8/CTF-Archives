Reading Channel
		</TD>
	</TR>
</table>
</div>

<div id=Out0 style="position:absolute; left:10px; width:90%; top:65px" >
<ID id=xmlerr1>The channel you requested contains an error, and cannot be displayed.</ID><BR><BR>
  <u><div id=Out1 class=Outline style="cursor: hand">+ More information</div></u>
  <div id=Out1details style="display:None;">
   <BR>
	<ID id=a3>The following CDF file parsing error occured on line </ID><SPAN id=LineNum STYLE="color:red"></SPAN>:

        <DIV id=xmlerr3>
        <font color=red><B><SPAN id=FoundStr></SPAN></B></font>
        </DIV>

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
