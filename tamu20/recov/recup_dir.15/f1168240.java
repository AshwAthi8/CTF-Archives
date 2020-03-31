
			function Finish()
			{
				self.close();
			}

			function ESC_KeyDown()
			{
				if( 27 == event.keyCode )
				{
					Finish();
				}
			}

			function window::onbeforeunload()
			{
				window.dialogArguments.g_oPrivDlg = null;
			}

		</script>
	</head>
	<body onkeydown="ESC_KeyDown();" bgcolor="#FFFFFF" style="padding:10px;" onload="try{window.scrollTo(0,0);}catch(e){}">
		<div id="ePopBodyText" class="sys-font-body">
			<span id="ePrivHead" class="sys-font-heading4" style="font-weight:bold;">Driver ID Upload Privacy Policy Statement</span>
			<br />
			<br />
			Information uploaded from your computer for the purposes of finding driver information will include
			the Plug and Play identification number of the device, the time at which the Windows Hardware Wizard was finished,
			and an ID for the Windows operating system you are running.
			<br />
			<br />
			We do not collect your files, name, address, e-mail address, or any other information that could be used to identify you.
			<br />
			<br />
			The collected data will be used to track which devices do not have easily obtainable drivers.
			If additional device driver information exists, it will be available after the device identification number is uploaded.
			If additional driver information is not available, Microsoft will record the device's identification number so that hardware vendors can be notified.
			Microsoft would like all hardware vendors to increase the availability of drivers necessary to run devices on Windows,
			or provide information about driver availability and device support.  The system information uploaded--the device and operating system
			identification number--cannot be tracked to a user, computer, corporation, IP address, or any other source information.
			<br />
			<br />
			Only Microsoft device teams will access the uploaded data, which will not be used for marketing purposes.
			<br />
			<br />
			<span id="ePrivLinksHdr" class="sys-font-heading4" style="font-weight:bold;">Links To Third Party Sites</span>
			<br />
			<br />
			Microsoft is not responsible for the content on any third-party sites. Microsoft provides links to
			third party sites as a convenience. The inclusion of any link in no way implies that Microsoft
			endorses the corresponding site.
			<br />
		</div>
		<br />
		<center><button id="eClose" style="font:messagebox;padding-left:10px;padding-right:10px;" onclick="Finish();">Close</button></center>
	</body>
</html>