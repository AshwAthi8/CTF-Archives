function ESC_KeyDown()
			{
				if( 27 == event.keyCode )
				{
					self.close();
				}
			}

			function window::onbeforeunload()
			{
				window.dialogArguments.g_oLearnDlg = null;
			}
		</script>
	</head>
	<body onkeydown="ESC_KeyDown();" scroll="no" style="padding:10px;background-color:window;">
		<table id="eHeaderTbl" width="100%" style="margin-bottom:25px;">
			<tr>
				<td width="100%" id="eHeaderTD"><span id="eHeader" class="sys-font-heading3 sys-rhp-color-title sys-rhp-font-title">About Compatible Hardware and Software</span></td>
				<td id="eImgTD"><img id="eImgUA" src="hcp://system/images/centers/Uabrand.gif" /></td>
			</tr>
		</table>
		<div id="eContainer" style="overflow-y:auto;height:365px;">
			<div id="eContent" class="sys-font-body">
				Compatible Hardware and Software provides a link to resources on Microsoft's Web site to help you research which software will work best with the Windows Server 2003 family and related Windows products.
				Use this resource to preview software before you buy it. New software and hardware compatibility status information is
				added to the site regularly so that you can get current information to protect your server and network.
				<br />
				<br />
				You can search or browse by manufacturer or product to see which software is compatible or incompatible with the Windows Server 2003 family.
				The compatibility of a product is determined through practical use or through testing by Microsoft, independent software vendors (ISVs), or independent hardware vendors (IHVs). 
				Microsoft encourages ISV and IHV representatives to submit information about how well their products work with this version of Windows.
			</div>
		</div>
		<button id="ePrintBtn" style="font:messagebox;position:absolute;padding-left:10px;padding-right:10px;bottom:10px;right:20px;" onclick="window.print();">Print</button>
	</body>
</html>
