ue = false;
			}
			
			function onYes()
			{
				window.returnValue = true;
				window.close();
			}
			
			function onNo()
			{
				window.returnValue = false;
				window.close();
			}
			
		</script>
	</head>
	<body onload="onLoad()" class="SecOOBEConfirmWindow">
		<table border="0" cellpadding="5" cellspacing="0" width="100%">
			<tr>
				<td width="37px" valign="top">
					<img src="exclamation_point.gif" border="0">
				</td>
				<td>
					<span id="confirmText" class="SecOOBEConfirmText">
						<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
						When you close this page, inbound connections to this server will be allowed. Before continuing, ensure that you have downloaded and installed all available security updates.<br><br>Do you want to close this page?
					</span>
				</td>
			</tr>
		</table>
		<br>
		<table border="0" cellpadding="5" cellspacing="0" width="100%">
			<tr>
				<td align="right">
					<button id="buttonYes" type="button" onclick="onYes()" class="SecOOBEConfirmButton">
						<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
						Yes
					</button>
				</td>
				<td align="left">
					<button id="buttonNo" type="button" onclick="onNo()" class="SecOOBEConfirmButton">
						<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
						No
					</button>

				</td>
			</tr>
		</table>
	</body>
</html>
