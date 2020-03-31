TENT="text/html; charset=iso-8859-1">
		<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
		<title>Aggiornamenti protezione per Windows Server</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<meta HTTP-EQUIV="MSThemeCompatible" CONTENT="Yes">
		<link rel="stylesheet" type="text/css" href="SecOOBE.css"></link>
		<style type="text/css">
			a
			{
				font-family: Tahoma;
				color: blue;
				font-size: 11px;
				text-decoration: none;
			}
			a:active
			{
				font-family: Tahoma;
				color: blue;
				font-size: 11px;
				text-decoration: none;
			}
			a:hover
			{
				font-family: Tahoma;
				color: blue;
				font-size: 11px;
				text-decoration: underline;
			}
		</style>
		<script language="jscript" type="text/Jscript">
			var errText;
			
			function onLoad()
			{
				var options = window.dialogArguments;
				document.title = options.title;
				errorText.innerText = options.message;
				buttonOK.innerText = options.OKText;
				buttonCancel.innerText = options.CancelText;
				cplText.innerText = options.CPLLinkText;
				cplTextPrefix.innerText = options.CPLPrefixText;
				cplTextSuffix.innerText = options.CPLSuffixText;
				errText = options.errorText;
				
				buttonOK.focus();
			}
			
			function onOK()
			{
			    window.returnValue = true;
				window.close();
			}
			
			function onCancel()
			{
			    window.returnValue = false;
			    window.close();
			}
			
			function onCPL()
			{
				try
				{
					var shellObj = new ActiveXObject("WScript.Shell");
    				shellObj.Run("%SystemRoot%\\system32\\control.exe firewall.cpl");
				}
				catch(ex)
				{
					alert(errText);
				}

				return false;
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
					<span id="errorText" class="SecOOBEConfirmText">
					</span>
				</td>
			</tr>
			<tr>
				<td width="37px">
					&nbsp;
				</td>
				<td>
				    <span id="cplTextPrefix" class="SecOOBEConfirmText">
				    Click here to open the 
				    </span>
					<a id="cplText" href="" onclick="return onCPL();">
						<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
						Windows Firewall
					</a>
				    <span id="cplTextSuffix" class="SecOOBEConfirmText">
				     control panel.
				    </span>					
				</td>			
			</tr>
		</table>
		<br>
		<table border="0" cellpadding="5" cellspacing="0" width="100%">
			<tr>
				<td align="right">
					<button id="buttonOK" type="button" onclick="onOK();" class="SecOOBEConfirmButton">
						<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
						OK
					</button>
				</td>
				<td align="left">
					<button id="buttonCancel" type="button" onclick="onCancel()" class="SecOOBEConfirmButton">
						<!-- It is not necessary to localize this text - it will be dynamically loaded from the XML file at runtime -->
						Cancel
					</button>
				</td>				
			</tr>
		</table>
	</body>
</html>
PGIF89a