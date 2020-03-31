ium (less than 1 MB)</Text>
        <SearchProp Name="SizeLE">1048576</SearchProp>
	</Radio>
	<Radio Id="5616" Height="13" TopMargin="3">
		<Text>Large (more than 1 MB)</Text>
        <SearchProp Name="SizeGE">1048576</SearchProp>
	</Radio>
	<Radio Id="5639" Height="13" TopMargin="3">
		<Text>Specify size (in KB)</Text>
	</Radio>
	<CtrlRow>
		<Label TopMargin="3" LeftMargin="0" Width="0">
			<Text><![CDATA[Size is]]></Text>
		</Label>
		<Control Class="ComboBox" Id="5640" Style="10551299" LeftMargin="16" RightMargin="0" TopMargin="3" Width="65" Height="100" Group="1">
			<Item>
				<Name>at least</Name>
				<Value>SAPropLSSizeGE</Value>
			</Item>
			<Item>
				<Name>at most</Name>
				<Value>SAPropLSSizeLE</Value>
			</Item>
		</Control>
		<Label TopMargin="3" LeftMargin="0" Width="0">
			<Text><![CDATA[Size in KB]]></Text>
		</Label>
		<Control Class="Edit" Style="276897920" Id="5641" Height="20" LeftMargin="5" RightMargin="0" TopMargin="3" Width="60" />
		<Control Class="msctls_updown32" Id="5642" Style="54" Width="17" Height="20" />
	</CtrlRow>
</SimpleDialog>