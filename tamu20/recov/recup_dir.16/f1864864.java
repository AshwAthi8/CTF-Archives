rchProp>
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
	</ExpandoGroup>
	<Label TopMargin="8" BottomMargin="2" Group="1">
		<Text><![CDATA[All or part of the d&ocument name:]]></Text>
        <SearchProp Name="MediaType">3</SearchProp>
        <SearchProp Name="FileType">.123;.3ds;.aca;.ai;.apr;.apx;.asc;.asd;.asp;.aw;.awm;.bal;.bpc;.cad;.cad;.ch3;.ch4;.chi;.cht;.cmk;.cpp;.csg;.cvs;.db2;.db3;.dbf;.dfd;.dfm;.dif;.dif;.doc;.dot;.dox;.dtp;.dtp;.dw2;.dwg;.epd;.epi;.erd;.erm;.eth;.evy;.ewd;.fh3;.fh4;.fm;.fm1;.fm3;.fw;.fw2;.fw3;.giw;.gs1;.htm;.html;.hwd;.imp;.ioc;.iwa;.iwp;.jnt;.jw;.jzz;.lcw;.lss;.lwd;.lwp;.mcd;.mdb;.mdl;.met;.ml3;.mm;.mpp;.msg;.mss;.msw;.myp;.nb;.np;.obd;.obt;.oli;.opw;.p65;.pb1;.pcw;.pdd;.pdw;.pfc;.pfs;.pj;.pjx;.pl1;.pln;.pm3;.pm4;.pm5;.pot;.pow;.ppp;.pps;.ppt;.pr2;.pr3;.pre;.prs;.psd;.pub;.pw;.pwp;.qbw;.qxd;.rpl;.rtf;.sam;.sbd;.scf;.sch;.scx;.sh3;.shw;.shw;.spw;.stx;.tbk;.tdb;.tif;.tiff;.tlp;.txt;.vc;.vcx;.vdr;.vdx;.vsd;.vsx;.vtx;.vue;.vw;.wb2;.wdb;.wg1;.wg2;.wk1;.wk3;.wk4;.wk5;.wkb;.wke;.wkq;.wks;.wmc;.wp;.wp5;.wp6;.wpd;.wps;.wq1;.wr1;.wri;.wrk;.ws;.ws2;.wsd;.wst;.wxp;.xl*;.xls;.xlt;.xwp;.xy;.xy3;.xyw;</SearchProp>
	</Label>
	<Edit Id="5603" Height="20" AutoComplete="3">
        <SearchProp Name="Named" />
    </Edit>
	<Label TopMargin="8" BottomMargin="2">
		<Text><![CDATA[A &word or phrase in the document:]]></Text>
	</Label>
	<Edit Id="5604" Height="20" AutoComplete="2">
        <SearchProp Name="ContainingText" />
    </Edit>
	<Label TopMargin="8" BottomMargin="2">
		<Text><![CDATA[&Look in:]]></Text>
	</Label>
	<Control Class="ComboBoxEx32" Id="5606" Style="65602" Height="300"  AutoComplete="1">
        <Text>C:\</Text>
        <SearchProp Name="LookIn" />
    </Control>
	<Expando Id="5613" TopMargin="8">
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
	<Expando Id="5628" TopMargin="3" Group="1">
		<Text><![CDATA[More advanced options]]></Text>
	</Expando>
    <ExpandoGroup Id="5628">
	    <Checkbox Id="5629" Height="13" TopMargin="3">
		    <Text><![CDATA[Search s&ystem folders]]></Text>
            <SearchProp Name="SearchSystemDirs" DataType="11">True</SearchProp>
	    </Checkbox>
	    <Checkbox Id="5630" Height="13" TopMargin="3">
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
