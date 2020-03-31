r }
TR { align: center }
IMG.THUMB { padding: 20px; cursor: hand;}
BODY { margin: 0; }

</style>
<body onLoad="loadedDoc()" link="#03a0fc" vlink="#03a0fc">

<div style="font-size: 12pt; font-family: Trebuchet MS, Arial, sans-serif"><a href="#" onclick="Film()">Film Strip</a></div>
<div style="font-size: 12pt; font-family: Trebuchet MS, Arial, sans-serif"><a href="#" onclick="Slideshow()">Slideshow</a></div>
<div style="font-size: 12pt; font-family: Trebuchet MS, Arial, sans-serif"><a href="#" onclick="Contact()">Contact Sheet</a></div>

<layer name="netFilmLayer" id=netscapeLayerFilm visibility=hide>
%s
<table>
<tr>
%s</tr></table>
</layer>

<layer name="netSlideLayer" id=netscapeLayerSlide>
%s
<form>
<input class=SLIDECONTROLS type=button value="Back" onclick="prevImage()">
<input class=SLIDECONTROLS id=runButton type=button value="Play" onclick="runSlides()">
<input class=SLIDECONTROLS type=button value="Forward" onclick="nextImage()">
</form>
</layer>
<layer name="netContactLayer" id=netscapeLayerContact visibility=hide>
<table>
<tr>
%s</tr></table>
</layer>

</body>
</html>HKCR
{
	Preview.Preview.1 = s 'Preview Class'
	{
		CLSID = s '{50F16B26-467E-11D1-8271-00C04FC3183B}'
	}
	Preview.Preview = s 'Preview Class'
	{
		CurVer = s 'Preview.Preview.1'
	}
	NoRemove CLSID
	{
		ForceRemove {50F16B26-467E-11D1-8271-00C04FC3183B} = s 'Preview Class'
		{
			ProgID = s 'Preview.Preview.1'
			VersionIndependentProgID = s 'Preview.Preview'
			ForceRemove 'Programmable'
			InprocServer32 = s '%MODULE%'
			{
				val ThreadingModel = s 'Apartment'
			}
			ForceRemove 'Control'
			ForceRemove 'Programmable'
			ForceRemove 'Insertable'
			ForceRemove 'ToolboxBitmap32' = s '%MODULE%, 1'
			'MiscStatus' = s '0'
			{
			    '1' = s '131473'
			}
			'TypeLib' = s '{50F16B18-467E-11D1-8271-00C04FC3183B}'
			'Version' = s '1.0'
		}
	}
}
