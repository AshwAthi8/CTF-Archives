irmWindow">
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
