idth="65" Height="100" Group="1">
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
    </ExpandoGroup>
	<Expando Id="5628" TopMargin="3">
		<Text><![CDATA[More advanced options]]></Text>
	</Expando>
    <ExpandoGroup Id="5628">
	    <Label TopMargin="3" BottomMargin="2">
		    <Text><![CDATA[&Type of file:]]></Text>
	    </Label>
        <Control Class="ComboBoxEx32" Id="5617" Style="65603" Height="250">
            <Text>*.*</Text>
            <SearchProp Name="FileType" />
        </Control>
	    <Checkbox Id="5629" Checked="1" Height="13" TopMargin="3">
		    <Text><![CDATA[Search s&ystem folders]]></Text>
            <SearchProp Name="SearchSystemDirs" DataType="11">True</SearchProp>
	    </Checkbox>
	    <Checkbox Id="5630" Checked="1" Height="13" TopMargin="3">
		    <Text><![CDATA[Search hidden files and folders]]></Text>
            <SearchProp Name="SearchHidden" DataType="11">True</SearchProp>
	    </Checkbox>
	    <Checkbox Id="5631" Checked="1" Height="13" TopMargin="3">
		    <Text><![CDATA[Search s&ubfolders]]></Text>
            <SearchProp Name="IncludeSubFolders" DataType="11">True</SearchProp>
	    </Checkbox>
        <Checkbox Id="5632" Height="13" TopMargin="3">
            <Text><![CDATA[&Case sensitive]]></Text>
            <SearchProp Name="CaseSensitive" DataType="11">True</SearchProp>
        </Checkbox>
        <Checkbox Id="5633" Height="13" TopMargin="3">
            <Text><![CDATA[Search ta&pe backup]]></Text>
            <SearchProp Name="SearchSlowFiles" DataType="11">True</SearchProp>
        </Checkbox>
    </ExpandoGroup>
	<Link Id="5643" IconId="290" TopMargin="10">
		<Text>
			<![CDATA[Other &search options]]>
		</Text>
        <ToolTip>
            <![CDATA[Search the Internet, computers on the network, printers, etc.]]>
        </ToolTip>
	</Link>
	<Link Id="5000" IconId="24001" TopMargin="5" BottomMargin="8">
		<Text><![CDATA[Chan&ge preferences]]></Text>
	</Link>
</SimpleDialog>
