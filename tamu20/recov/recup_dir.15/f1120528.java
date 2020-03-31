
    window.setTimeout("LoadChores()", TIMEOUT);
  }
	
  function DisplayLocStrings() {
    What_do_you_want_todo.innerHTML = TAG_WHATDOYOUWANTTODO;
    Advanced_Desc.innerHTML = TAG_ADVANEDSYSTEMINFODESC;

    Advanced.all.link.innerHTML = TAG_VIEWDETAILEDSYSTEMINFO;
    Services.all.link.innerHTML = TAG_VIEWSERVICES;
    Policy.all.link.innerHTML = TAG_VIEWPOLICY;
    EvtLog.all.link.innerHTML = TAG_VIEWERRLOG;
    Remote_View.all.link.innerHTML = TAG_REMOTE_VIEW;   
  }

  function LoadChores() {
    try {
      var remoteServer = GetServerName();
      Title.innerHTML = remoteServer ? (TAG_REMOTEADVINFO + " \\\\" + remoteServer) : TAG_LOCALADVINFO;

      if(!pchealth.UserSettings)
        throw MSG_ONLYINHELPCTR;

      if(pchealth.UserSettings.CurrentSKU.SKU.toUpperCase() != "PERSONAL_32")
        Policy.style.display = "";//show for all SKUs other than personal
      
      if(remoteServer)
      {
        Remote_View.style.display = "none";
        MSInfo += " /computer " + remoteServer;
      }
    }
		
    catch (e) {
      HandleErr(e);
    }
		
    finally {
      _body.style.cursor= "default";
    }
  }

  function GotosysServicesInfo()
  {
	var svrName = GetServerName();
	var URL = "sysServicesInfo.htm" + "?" + COOKIE_NAME + "=" +svrName;
	window.navigate(URL);
  }

   function GotosysEvtLogInfo()
  {
	var svrName = GetServerName();
	var URL = "sysEvtLogInfo.htm" + "?" + COOKIE_NAME + "=" +svrName;
	window.navigate(URL);
  }

function GotoMSInfo()
  {
	var svrName = GetServerName();
	var cmdline;
	if (svrName) 
	{
		cmdline = "msinfo32 /Computer " + svrName;
     	}
	else
	{
	cmdline = "msinfo32";
	}
	Run(cmdline);
  }

  </Script>
</head>

<body ID="_body" onLoad="OnLoadHandler()" STYLE="cursor: wait" SCROLL="AUTO" class="sys-font-body sys-color-body sys-rhp-bgcolor">

  <DIV class="sys-font-heading3 sys-rhp-color-title" ID="Title">
    &nbsp;
  </DIV>

  <BR>
  
  <DIV ID="What_do_you_want_todo" class="sys-font-body-bold">
    &nbsp;
  </DIV>

  <BR>
  <BR>

  <DIV ID="Advanced_Desc">
    &nbsp;
  </DIV>

  <BR>
  <BR>

  <DIV ID="Advanced" style="margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_DETAILEDSYSINFO)">
    <A class="sys-link-normal" href="#" onClick="GotoMSInfo()">
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>
  
  <DIV ID="Services" style="margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_RUNNINGSERVICES)">
    <A class="sys-link-normal" href="#" onClick="GotosysServicesInfo()">
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>

  <DIV ID="Policy" Style="display : none; margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_POLICY)">
    <A class="sys-link-normal" href="RSoP.htm">
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>
  
  <DIV ID="EvtLog" style="margin-bottom: 1em" onmouseover="ShowInfoTip(this, DESC_ERRLOG)">
    <A class="sys-link-normal" href="#" onClick="GotosysEvtLogInfo()">
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>

  <DIV ID="Remote_View" onmouseover="ShowInfoTip(this, DESC_REMOTE_VIEW)">
    <A class="sys-link-normal" href="#" onClick="OpenRemoteDialog()">
      <helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
      <Span ID="link">&nbsp;</Span>
    </A>
  </DIV>

<OBJECT ID="wbemlocator" WIDTH=0 HEIGHT=0
  CLASSID="CLSID:76A64158-CB41-11D1-8B02-00600806D9B6">
</OBJECT>

<OBJECT ID="pchealth" WIDTH=0 HEIGHT=0 
  CLASSID="CLSID:FC7D9E02-3F9E-11d3-93C0-00C04F72DAF7">
</OBJECT>

</body>
</html>

