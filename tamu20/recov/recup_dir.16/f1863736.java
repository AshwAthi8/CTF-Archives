e="ContainingText" />
    </Edit>
	<Label TopMargin="8" BottomMargin="2">
		<Text><![CDATA[&Look in:]]></Text>
	</Label>
	<Control Class="ComboBoxEx32" Id="5606" Style="65602" Height="300" AutoComplete="1">
        <Text>C:\</Text>
        <SearchProp Name="LookIn" />
    </Control>
	<Expando Id="5607" TopMargin="8">
		<Text><![CDATA[When was it modified?]]></Text>
	</Expando>
    <ExpandoGroup Id="5607">
	    <Radio Id="5620" Checked="1" Height="13" TopMargin="3" Group="1">
		    <Text>Don't remember</Text>
	    </Radio>
	    <Radio Id="5622" Height="13" TopMargin="3">
		    <Text>Within the last week</Text>
            <SearchProp Name="DateNDays">7</SearchProp>
            <SearchProp Name="WhichDate">1</SearchProp>
	    </Radio>
	    <Radio Id="5623" Height="13" TopMargin="3">
		    <Text>Past month</Text>
            <SearchProp Name="DateNMonths">1</SearchProp>
            <SearchProp Name="WhichDate">1</SearchProp>
	    </Radio>
	    <Radio Id="5624" Height="13" TopMargin="3">
		    <Text>Within the past year</Text>
            <SearchProp Name="DateNDays">365</SearchProp>
            <SearchProp Name="WhichDate">1</SearchProp>
	    </Radio>
		<Radio Id="5636" Height="13" TopMargin="3">
			<Text>Specify dates</Text>
		</Radio>
		<CtrlRow>
		    <Label TopMargin="3" LeftMargin="0" Width="0" Group="1">
			    <Text><![CDATA[Search for]]></Text>
		    </Label>
		    <Control Class="ComboBox" Id="5644" Style="10551299" LeftMargin="16" RightMargin="0" TopMargin="3" Width="113" Height="100">
			    <SearchProp Name="WhichDate" />
			    <Item>
				    <Name>Modified Date</Name>
				    <Value>1</Value>
			    </Item>
			    <Item>
				    <Name>Created Date</Name>
				    <Value>2</Value>
			    </Item>
			    <Item>
				    <Name>Accessed Date</Name>
				    <Value>3</Value>
			    </Item>
		    </Control>
		</CtrlRow>
		<CtrlRow>
			<Label TopMargin="5" LeftMargin="16" Width="30">
				<Text><![CDATA[from]]></Text>
			</Label>
			<Control Class="SysDateTimePick32" Id="5637" Height="20" Width="120" Style="65536" LeftMargin="3" TopMargin="3">
				<SearchProp Name="DateGE" />
			</Control>
		</CtrlRow>
		<CtrlRow>
			<Label TopMargin="5" LeftMargin="16" Width="30">
				<Text><![CDATA[to]]></Text>
			</Label>
			<Control Class="SysDateTimePick32" Id="5638" Height="20" Width="120" Style="65536" LeftMargin="3" TopMargin="3">
				<SearchProp Name="DateLE" />
			</Control>
		</CtrlRow>
    </ExpandoGroup>
	<Expando Id="5613" TopMargin="3">
		<Text><![CDATA[What size is it?]]></Text>
	</Expando>
    <ExpandoGroup Id="5613">
        <Radio Id="5612" Checked="1" Height="13" TopMargin="3"  Group="1">
		    <Text>Don't remember</Text>
	    </Radio>
	    <Radio Id="5614" Height="13" TopMargin="3">
		    <Text>Small (less than 100 KB)</Text>
            <SearchProp Name="SizeLE">102400</SearchProp>
	    </Radio>
	    <Radio Id="5615" Height="13" TopMargin="3">
		    <Text>Medium (less than 1 MB)</Text>
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
		    <Label TopMargin="3" LeftMargin="0" Width="0" Group="1">
			    <Text><![CDATA[Size is]]></Text>
		    </Label>
			<Control Class="ComboBox" Id="5640" Style="10551299" LeftMargin="16" RightMargin="0" TopMargin="3" Width="65" Height="100">
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
</SimpleDialog>
