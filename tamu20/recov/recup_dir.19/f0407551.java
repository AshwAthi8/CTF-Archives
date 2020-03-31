 vImage.length + 1) % vImage.length)
}

function contactSelect(i)
{
    if (isIE)
    {
        iImage = i
        Film()
        filmmain.src = vImage[i]
        doResize()
    }
    else
    {
    }
}

function doResize()
{
    if (isIE)
    {
        filmmain.height = document.body.clientHeight - document.all.controls.offsetHeight - document.all.filmthumbs.offsetHeight - 10
        slidemain.height = document.body.clientHeight - document.all.controls.offsetHeight - document.all.slideshowbuttons.offsetHeight - 10

        if (document.body.clientWidth < filmmain.width)
        {
            filmmain.height = document.body.clientWidth * filmmain.height / filmmain.width;
        }      
        if (document.body.clientWidth < slidemain.width)
        {
            slidemain.height = document.body.clientWidth * slidemain.height / slidemain.width;
        }        
    }
}

</script>
<style>
TD { valign: center }
TR { align: center }
IMG.THUMB { padding: 20px; cursor: hand;}
BODY { margin: 0; }

</style>
<body onLoad="loadedDoc()" onResize="doResize()" link="#03a0fc" vlink="#03a0fc">
<table id=controls style="width: 100%; display:none" cellspacing=0 cellpadding=0>
<tr align=right>
<td><div class=CONTROLS style="cursor: hand; font-size: 12pt; color:#03a0fc; font-family: Trebuchet MS, Arial, sans-serif" onclick="Film()">Film Strip</div>
<tr align=right>
<td><div class=CONTROLS style="cursor: hand; font-size: 12pt; color:#03a0fc; font-family: Trebuchet MS, Arial, sans-serif" onclick="Slideshow()">Slideshow</div>
<tr align=right>
<td><div class=CONTROLS style="cursor: hand; font-size: 12pt; color:#03a0fc; font-family: Trebuchet MS, Arial, sans-serif" onclick="Contact()">Contact Sheet</div>
</tr>
</table>

<div id=contact style="width: 100%; display: none"></div>

<table id=slideshow style="width: 100%; display: none">
<tr align=center>
<td valign=center><img id=slidemain onclick=nextImage() src="">
</table>

<div id=slideshowbuttons>
<input class=SLIDECONTROLS type=button value="Back" onclick="prevImage()">
<input class=SLIDECONTROLS id=runButton type=button value="Play" onclick="runSlides()">
<input class=SLIDECONTROLS type=button value="Forward" onclick="nextImage()">
</div>

<table id=film style="width: 100%; display: none">
<tr align=center><td valign=center><img alt="" onclick=nextFilmImage() id=filmmain src="">
</table>

<div id=filmthumbs style="width: 100%; height: 120; display:none; overflow-y: none; overflow-x:scroll"></div>

</body>
</html>