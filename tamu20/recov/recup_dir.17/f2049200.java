ext/css" href="hcp://system/css/shared.css" />
		<script type="text/jscript">

			function LoadNCW()
			{
				eLoading.style.display = "inline";
				window.dialogArguments.ASSERT( "OpenConnWizard()" );
				setTimeout( "Finish();", 500 );
				setTimeout( "eLoading.style.display =\'none\'", 500 );
			}

			function Finish()
			{
				self.close();
			}

			function window::onbeforeunload()
			{
				window.dialogArguments.g_oLearnDlg = null;
			}

		</script>
	</head>
	<body style="padding:10px;" class="sys-inlineform-bgcolor1">
		<h4 id="eHeader" class="sys-font-heading4">Creating an Internet connection</h4>
		<div id="eLearnMore" class="sys-font-body">
			The New Connection Wizard makes it easy to connect to the Internet.
			If you already have an account with an Internet service provider (ISP),
			the New Connection Wizard collects all the necessary information from you
			and then creates the connection. If you do not have an account with an ISP,
			the wizard provides a list of ISPs available in your area. To sign up for a new account,
			click an ISP in the list.
			<br />
			<br />
			<a id="eLnkNCW" onclick="LoadNCW();" style="text-decoration:underline;cursor:hand;" class="sys-link-normal">Start the New Connection Wizard</a><span id="eLoading" style="display:none;">&nbsp;&nbsp;Loading wizard...</span>
			<br />
		</div>
		<br />
		<center><button id="eClose" style="font:messagebox;padding-left:10px;padding-right:10px;" onclick="Finish();">Close</button></center>
	</body>
</html>