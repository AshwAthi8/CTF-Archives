
<LINK ID=Stylesheet_Ref0 href="hcp://system/css/shared.css"    rel=STYLESHEET type=text/css>
<LINK ID=Stylesheet_Ref1 href="hcp://system/css/Behaviors.css" rel=STYLESHEET type=text/css>

<STYLE>

BODY
{
    margin      : 16px;
    margin-top  : 11px;
}

.layout-arrow
{
    position  	 : relative; 
    top       	 : 7px; 
    margin-right : 4px;
			  
    width     	 : 24px;
    height    	 : 24px;
}

.layout-description
{
    margin-top     : 3px;
}

</STYLE>

</HEAD>

<BODY id=noloc0 scroll=auto class="sys-rhp-color">

<DIV id=locTitle class="sys-font-heading3 sys-rhp-color-title">
 Install and share Windows Help
</DIV>
<BR>

<DIV id=locDesc class="sys-font-body sys-color-body">
Install, share, and quickly switch to other Help content. Begin by installing Help content from a CD or a shared directory for Windows XP Professional or Windows Server 2003. After you have installed the new Help content, you can switch to that Help at anytime, or share it with other computers on your network.
</DIV>
<BR>

<DIV class="layout-description" id=loc1t>
<A id=loc1 class="sys-link-normal sys-font-body sys-color-body" href="hcp://system/panels/remotehelp.htm?mode=Change" title="Start using Help content you've installed from another computer running Windows XP or Windows Server 2003.">
<helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
<ID id=loc1b>Switch from one operating system's Help content to another</ID>
</A>
</DIV>

<DIV id="HelpAdminOnly" style="display:none">

<DIV class="layout-description" id=loc2t>
<A id=loc2 class="sys-link-normal sys-font-body sys-color-body" href="hcp://system/panels/remotehelp.htm?mode=AddServer" TITLE="Install Help content that is shared from another computer on your network.">
<helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
<ID id=loc2b>Install Help content from another Windows computer</ID>
</A>
</DIV>

<DIV class="layout-description" id=loc3t>
<A id=loc3 class="sys-link-normal sys-font-body sys-color-body" href="hcp://system/panels/remotehelp.htm?mode=AddDisk" TITLE="Install Help content from a Windows XP or Windows Server 2003 CD or disk image.">
<helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
<ID id=loc3b>Install Help content from a CD or disk image</ID>
</A>
</DIV>

<DIV class="layout-description" id=loc4t>
<A id=loc4 class="sys-link-normal sys-font-body sys-color-body" href="hcp://system/panels/remotehelp.htm?mode=SetSharing" TITLE="Enable other people on your network to install your Help content on their computers.">
<helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
<ID id=loc4b>Share your Help content with others on your network</ID>
</A>
</DIV>

<DIV class="layout-description" id=loc5t>
<A id=loc5 class="sys-link-normal sys-font-body sys-color-body" href="hcp://system/panels/remotehelp.htm?mode=Remove" TITLE="Remove Help content that you no longer need.">
<helpcenter:bitmap class="layout-arrow" SRCNORMAL="hcp://system/images/16x16/arrow_green_normal_shadow.bmp"></helpcenter:bitmap>
<ID id=loc5b>Uninstall Help that you have installed from another Windows operating system</ID>
</A>
</DIV>

</DIV>

<BR><BR>
<DIV class="sys-font-body sys-color-body" id=loc6>
<b>Note</b> Installing and sharing Help content are available only for Windows XP and Windows Server 2003. You cannot, for example, install Windows XP Help content on a computer running Windows 2000, or vice versa.
</DIV>

</BODY>

<SCRIPT>

function TurnOnHelpAdminOnly()
{
    if(pchealth.Database.HasWritePermissions == true)
    {
    	HelpAdminOnly.style.display="";
    }
}

TurnOnHelpAdminOnly();

</SCRIPT>

</HTML>
