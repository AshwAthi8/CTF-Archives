DOYOUWANTTODO;
    Page_Desc.innerHTML = TAG_MAINPGDESC;
    
    Properties.all.link.innerHTML = TAG_VIEWGENINFO;   
    Health.all.link.innerHTML = TAG_VIEWSTATUS;   
    Hardware.all.link.innerHTML = TAG_FINDHRDWRINFO;   
    Software.all.link.innerHTML = TAG_VIEWMSSFTWR;   
    Advanced.all.link.innerHTML = TAG_VIEWADVSYSINFO;   
  }
  
  function LoadChores() {
    try {
      DisplayLocStrings();
      var remoteServer = ShowServerName();
      if(!pchealth.UserSettings)
        throw MSG_ONLYINHELPCTR;
        
      _header.style.display = "none";
      _data.style.display = "";
    }
  
    catch (e) {
      HandleErr(e);
    }
	
    finally {
      _body.style.cursor= "default";
    }
  }  


function Gotosyspage(pagenum)
{
	
  	var strpage = "";
	switch(pagenum) 
	{
   	case 0: strpage = "sysinfosum.htm"; break;
   	case 1: strpage = "sysHealthInfo.htm"; break;
   	case 2: strpage = "sysComponentInfo.htm" ; break;
   	case 3: strpage = "sysSoftwareInfo.htm"; break;
   	case 4: strpage = "sysInfoLaunch.htm"; break;
   	default: strpage = "sysinfomain.htm";
	}
	var svrName = GetServerName();
	var URL = strpage + "?" + COOKIE_NAME + "=" +svrName;
	window.navigate(URL);
}
  


  </script>
</HEAD>

<BODY ID="_body" onLoad="LoadChores()" SCROLL="AUTO" STYLE="cursor: wait" class="sys-font-body sys-color-body sys-rhp-bgcolor">

<DIV ID="_header">
  <TABLE WIDTH=100% HEIGHT=100%>
    <TR HEIGHT=60%>
      <TD ID="WaitImage" ALIGN=center VALIGN=middle>&nbsp;</TD>
    </TR>
    <TR HEIGHT=40%>
      <TD ID="WaitMessage" ALIGN=center VALIGN=top class="sys-font-heading2">&nbsp;</TD>
    </TR>
  </TABLE>
</DIV>

<DIV ID="_data" STYLE="display: none;">

  <DIV class="sys-font-heading3 sys-rhp-color-title" ID="Title">
    &nbsp;
  </DIV>

  <BR>

  <DIV ID="What_do_you_want_todo" class="sys-font-body-bold">
    &nbsp;
  </DIV>

  <BR>
  <BR>

  <DIV ID="Page_Desc">
    &nbsp;
  </DIV>

  <BR>
  <BR>
  
  <DIV ID="Properties" style="margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_PROPERTIES)">
    <A class="sys-link-normal" href="#" onclick='Gotosyspage(0);'>
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>
  
  <DIV ID="Health" style="margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_HEALTH)">
    <A class="sys-link-normal" href="#" onclick='Gotosyspage(1);'>
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>
  
  <DIV ID="Hardware" style="margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_HARDWARE)">
    <A class="sys-link-normal" href="#" onclick='Gotosyspage(2);'>
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>

  <DIV ID="Software" style="margin-bottom: 3em" onmouseover="ShowInfoTip(this, DESC_SOFTWARE)">
    <A class="sys-link-normal" href="#" onclick='Gotosyspage(3);'>
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>
    
  <DIV ID="Advanced" onmouseover="ShowInfoTip(this, DESC_ADVANCED)">
    <A class="sys-link-normal" href="#" onclick='Gotosyspage(4);'>
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_blue_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>

</DIV>

<OBJECT ID="wbemlocator" WIDTH=0 HEIGHT=0
  CLASSID="CLSID:76A64158-CB41-11D1-8B02-00600806D9B6">
</OBJECT>

<OBJECT ID="pchealth" WIDTH=0 HEIGHT=0 
  CLASSID="CLSID:FC7D9E02-3F9E-11d3-93C0-00C04F72DAF7">
</OBJECT>

</BODY>
</HTML>
