on fnOnLoad() {
    DisplayLocStrings();
    if(window.dialogArguments) 
      txtRemoteComputer.value = window.dialogArguments;
  }
  
  function fnOpen() {
    if(txtRemoteComputer.value) {
      window.returnValue = txtRemoteComputer.value.replace(/\\/g,"");//remote
      event.returnValue = false;
      window.close();
    } 
    else 
      txtRemoteComputer.focus();
  }  
  </Script>
</head>

<body onload="fnOnLoad()" class="sys-inlineform-bgcolor1" style="margin : 0px;">

<table width="100%" height="100%" class="sys-font-body sys-color-body">
<tr>
  <td ID="Caption" colspan=2 style="padding : 20px 0px 10px 20px;">
    &nbsp;
  </td>
</tr>

<tr>
  <td colspan=2 style="padding : 10px 0px 10px 20px;">
    <input id=txtRemoteComputer type="text" style="width : 100%;">
  </td>
</tr>

<tr>
  <td align="right" style="padding : 10px 0px 10px 20px;" style="width : 70%;">
    <input ID="BtnOpen" type="submit" name="btnOpen" onClick="fnOpen()" class="sys-font-body sys-color-body-disabled" style="width : 80px; height : 23px">
  </td>
  <td align="right" style="padding : 10px 0px 10px 10px;">
    <input ID="BtnCancel" type="reset" name="btnCancel" onClick="window.close()" class="sys-font-body sys-color-body-disabled" style="width : 80px; height : 23px">
  </td>
</tr>
</table> 

</body>
</html>