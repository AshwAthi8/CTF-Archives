>
			body
			{
				font:messagebox;
				padding:10px 10px 5px 10px;
			}

			h3
			{
				font-family:tahoma;
				font-size:130%;
				color:black;
			}

			.clsContent, .clsSubmit
			{
				padding-bottom: 5px;
			}

			.clsContent a
			{
				color:#114488;
				text-decoration:underline;
			}

			ul
			{
				margin-top:10px;
				list-style:circle outside;
			}

			a
			{
				color:blue;
				text-decoration:underline;
			}

			div#eConfirm
			{
				font-size:100%;
			}

			button
			{
				font-size:8pt;
				padding-left:10px;
				padding-right:10px;
			}

			.clsHidden
			{
				display:none;
			}

			div#eShowPriv
			{
				width:450px;
				border:2px outset;
				background:window;
			}

			.clsNavTable
			{
				position:absolute;
				bottom:5px;
				right:30px;
			}

			div#eResContainer
			{
				overflow-y:auto;
				display:none;
			}

		</style>
		<script type="text/jscript" defer>

			/*** Global vars ***/

			var g_bDebugMode = false;
			if( false == g_bDebugMode )
			{
				window.onerror = new Function( "return true" );
			}
			var g_sThisHREF = location.href;
			var g_bSend = false;
			var g_bConnect = false;
			var g_bFromConnectUI = false;
			var g_bDelayUpload = false;
			var g_bFromSavedFav = false;
			var g_sDrvIDs = "";
			var g_bUploadSuccess = false;
			var g_bFav_UploadSuccess = false;
			var g_bSaveFavorite = false;
			var g_bValidXMLFile = ValidateXMLFile();
			var g_oWShell = new ActiveXObject( "WScript.Shell" );
			var g_oXMLDlg, g_oPrivDlg, g_oDrag = null;
			var g_sTestURL = "http://feedback.windows.com/TestDFS.asp";
			var g_bNonRASConnectoid = false;
			var g_bRanRasPhone = false;
			var g_bUploadOnce = false;

			//For localization
			var L_DataFileError_Message = "The upload data file does not exist or is malformed.";
			var L_FavoriteAdded_Message = "This page will be added to your Help and Support Favorites list.";
			var L_FavoriteDupe_Message  = "You already have a Favorite link to this topic.";
			var L_DialogHeading_Text = "Missing Device Driver XML Profile";
			var L_DialogClose_Text = "Close";
			var L_Connecting_Text = "Connecting...";
			var L_LaunchNCW_Message = "Windows cannot find an existing Internet connection on your computer. To create an Internet connection now, click Yes.\n\nIf you have an existing connection that Windows might not be detecting, click No, and then manually start the connection. Important: Do not close Help and Support Center. After establishing the Internet connection, come back to the connection page, and then click Next again.\n\nIf you know you have an existing connection that is already open, click No, and then click Next again.";

			/*** End Global vars ***/

			/*** Error Handling Code ***/

			function ASSERT( sObj )
			{
				try
				{
					eval( sObj );
				}
				catch( e )
				{
					if( true == g_bDebugMode )
					{
						alert( "Error running: " + sObj + " -> " + e.description + "\nNumber -> " + e.number );
					}
				}
			}

			/*** End Error Handling Code ***/

			/*** Connection Code ***/

			function oConnCheck_onCheckDone( cn, lStatus, hr, url, vCtx )
			{
				if( 4 == lStatus )
				{
					eConnectingH3.innerText = L_Connecting_Text;
					ASSERT( "GetDriverName( false )" );
				}
				else
				{
					if( true == g_bFromConnectUI )
					{
						ASSERT( "Cancel( true )" );
					}
					else
					{
						eConnectingH3.style.display = "none";
						h3Default.style.display = "block";
						ASSERT( "ShowConnectionUI()" );
					}
				}
			}

			function RASInternetConnect()
			{
				var bHasConnectoid = pchealth.Connectivity.HasConnectoid;
				var bAutoDialEnabled = pchealth.Connectivity.AutoDialEnabled;

				if( true == bHasConnectoid )
				{
					if( true == bAutoDialEnabled || true == g_bRanRasPhone )
					{
						try
						{
							pchealth.Connectivity.AutoDial( false );
							setTimeout( "TestConn( g_sTestURL )", 50 );
						}
						catch( e )
						{
							eNoConnect.style.display = "block";
							eConnecting.style.display = "none";
							h3Default.style.display = "block";
							eConnectionUI.style.display = "block";
							eBtnNav2.style.display = "block";
						}
					}
					else
					{
						h3Default.style.display = "block";
						eConnectionUI.style.display = "block";
						eBtnNav2.style.display = "block";
						eConnecting.style.display = "none";
						OpenConnManager();
					}
				}
				else
				{
					eConnecting.style.display = "none";
					h3Default.style.display = "block";
					eConnectionUI.style.display = "block";
					eBtnNav2.style.display = "block";
					ShowMessage( L_LaunchNCW_Message );
				}
			}

			function InitConn( bContinue )
			{
				var bLAN = pchealth.Connectivity.IsALan;
				var sIPs = GetIPAdresses();

				if( true == bContinue )
				{
					h3Default.style.display = "none";
					eMain.style.display = "none";
					eConnectionUI.style.display = "none";
					eBtnNav1.style.display = "none";
					eBtnNav2.style.display = "none";
					tblResources.style.display = "none";
					eNoConnect.style.display = "none";
					eConnecting.style.display = "block";

					if( ( true == bLAN || true == g_bNonRASConnectoid ) && ( "" != sIPs && "0.0.0.0" != sIPs ) )
					{
						setTimeout( "TestConn( g_sTestURL )", 50 );
					}
					else
					{
						if( "" != sIPs && "0.0.0.0" != sIPs )
						{
							setTimeout( "TestConn( g_sTestURL )", 50 );
						}
						else
						{
							if( true == g_bFromConnectUI )
							{
								ASSERT( "RASInternetConnect()" );
							}
							else
							{
								eConnecting.style.display = "none";
								ASSERT( "ShowConnectionUI()" );
							}
						}
					}
				}
				else
				{
					eConnecting.style.display = "none";
					tdThanks.style.display = "block";
					ShowResults();
				}
			}

			function TestConn( sConnTestURL )
			{
				var oPCH_ConnCheck = pchealth.Connectivity.CreateObject_ConnectionCheck();
				oPCH_ConnCheck.onCheckDone = oConnCheck_onCheckDone;
				oPCH_ConnCheck.StartUrlCheck( sConnTestURL, 0 );
			}

			/*** End Connection Code ***/

			/*** Upload Process ***/

			function ValidateXMLFile()
			{
				var sFile = GetFilePathFromURL( g_sThisHREF );
				if( !bCorrectPathAndFileName(sFile) ) return false;

				try
				{
					var oXML = new ActiveXObject( "Msxml2.DOMDocument" );
					oXML.async = false;
					oXML.validateOnParse = false;
					oXML.resolveExternals = false;
					oXML.load( sFile );
					if( "" == oXML.xml )
					{
						return false;
					}
					else
					{
						return true;
					}
				}
				catch( e )
				{
					return false;
				}
			}

			function GetFilePathFromURL( sURL )
			{
				var sFilePath = unescape( g_sThisHREF.substring( g_sThisHREF.indexOf( "?" ) + 1 ) );
				sFilePath = sFilePath.replace( "file://", "" ).replace( /\&.*/, "" );
				sFilePath = sFilePath.substring(0, sFilePath.indexOf(".xml") + 4);
				return sFilePath;
			}

			function bCorrectPathAndFileName( sFilePath )
			{
				try
				{
					var oShell = new ActiveXObject("WScript.Shell");
					var sProgFiles = oShell.ExpandEnvironmentStrings("%ProgramFiles%");
					var sTest = sProgFiles.replace("\\","\\\\") + "(\\\\windowsupdate\\\\v4hardware_.*[0-9].xml|\\\\windowsupdate\\\\v4\\\\hardware_.*[0-9].xml)";
					var re = new RegExp( sTest, "i" );

					if( re.test(sFilePath) )
					{

						return true;
					}
					else
					{
						return false;
					}
				}
				catch( e )
				{
					return false;
				}
			}

			function SetUploadState( bStatus )
			{
				eNext.disabled = false;
				if( true == bStatus )
				{
					g_bSend = true;
					g_bConnect = true;
				}
				else
				{
					g_bSend = false;
					g_bConnect = false;
				}
			}

			function SetConnState( bConnStatus )
			{
				eConnNext.disabled = false;
				g_bFromConnectUI = true;
				if( true == bConnStatus )
				{
					g_bConnect = true;
					g_bDelayUpload = false;
				}
				else
				{
					g_bConnect = false;
					g_bDelayUpload = true;
				}
			}

			function ShowConnectionUI()
			{
				if( true == g_bSend )
				{
					eAccess.scrollTop = 0;
					eMain.style.display = "none";
					h3Default.style.display = "block";
					eConnectionUI.style.display = "block";
					eBtnNav1.style.display = "none";
					eBtnNav2.style.display = "block";
					if( true == g_bFromSavedFav )
					{
						eChkSaveQuery.style.display = "none";
						eLblSaveQuery.style.display = "none";
						eConnBack.style.display = "none";
					}
					ASSERT( "MatchSize()" );
				}
				else
				{
					ASSERT( 'Cancel()' );
				}
			}

			function Send()
			{
				if( true == g_bSend )
				{
					if( false == g_bFromSavedFav && false == g_bUploadOnce )
					{
						if( true == g_bValidXMLFile )
						{
							window.setTimeout( 'ASSERT( "UploadData()" )', 50 );
						}
						else
						{
							ASSERT( "ShowDataFileError()" );
							return;
						}
					}
					InitConn( g_bConnect );
				}
				else
				{
					Cancel();
				}

				if( true == g_bDelayUpload )
				{
					h3Default.style.display = "block";
					tblCancel.style.display = "block";
					tdThanks.style.display = "none";
					tdDelayUpload.style.display = "block";
					eTDContactMan.style.display = "block";
					eNoConnect.style.display = "none";
					tdNoRecord.style.display = "none";
				}
			}

			function Cancel( bConnFailed )
			{
				eMain.style.display = "none";
				eConnectionUI.style.display = "none";
				eBtnNav1.style.display = "none";
				eBtnNav2.style.display = "none";
				eBtnNav3.style.display = "block";
				tblResources.style.display = "block";
				eAccess.scrollTop = 0;
				if( false == g_bValidXMLFile )
				{
					Content_LI3.style.display = "none";
				}

				if( !bConnFailed )
				{
					Content_LI3.style.display = "none";
					tblCancel.style.display = "block";
					tdThanks.style.display = "none"
					tdDelayUpload.style.display = "none";
					eTDContactMan.style.display = "block";
					tdNoRecord.style.display = "block";
				}
				else
				{
					eConnecting.style.display = "none";
					tblCancel.style.display = "block";
					tdThanks.style.display = "none"
					tdDelayUpload.style.display = "none";
					eTDContactMan.style.display = "block";
					eNoConnect.style.display = "block";
				}

				if( true == g_bFromSavedFav )
				{
					eFinish.style.display = "none";
				}

				ResizeButtons( [eBack,eNext_D,eFinish] );
			}

			function Back()
			{
				eAccess.scrollTop = 0;
				eResContainer.style.display = "none";
				h3Searching.style.display = "none";
				h3Default.style.display = "block";
				tblCancel.style.display = "none";
				tblResources.style.display = "none";
				eNoConnect.style.display = "none";

				if( true == g_bFromConnectUI )
				{
					eConnectionUI.style.display = "block";
					eBtnNav1.style.display = "none";
					eBtnNav3.style.display = "none";
					eBtnNav2.style.display = "block";
					eConnecting.style.display = "none";
					ResizeButtons( [eConnBack,eConnNext,eConnCancel] );
				}
				else
				{
					eMain.style.display = "block";
					tdNoRecord.style.display = "none";
					eConnectionUI.style.display = "none";
					eBtnNav3.style.display = "none";
					eBtnNav2.style.display = "none";
					eBtnNav1.style.display = "block";
					ResizeButtons( [eBack,eNext,eCancel] );
				}
			}

			function UploadData()
			{
				var sXMLFile = GetFilePathFromURL( g_sThisHREF );
				var vtExpDate = SetExpirationDate( 20 );
				var oMPC_UL = new ActiveXObject( "UploadManager.MPCUpload" );
				var oJob = oMPC_UL.CreateJob();
				oJob.Sig = "";
				oJob.Server = "http://feedback.windows.com/scripts/uploadserver.dll";
				oJob.ProviderID = "NonEsc";
				oJob.Mode = 1;
				oJob.PersistToDisk = true;
				oJob.History = 0;
				oJob.ExpirationTime = vtExpDate;
				oJob.GetDataFromFile( sXMLFile );
				oJob.ActivateAsync();
				g_bUploadOnce = true;
			}


			function Resize()
			{
				 document.all.eResWindow.style.width = document.body.clientWidth - 50;
			}

			function CheckDriver( sDriver )
			{
				var iLCID = pchealth.UserSettings.CurrentSKU.Language;
				var sURL = "http://go.microsoft.com/fwlink/?linkid=433&eDrvID=" + escape( sDriver ) + "&lcid=" + iLCID;
				document.frames["eResWindow"].location.replace( sURL );
				h3Searching.style.display = "block";
				ASSERT( "ShowResults()" );
			}

			function ShowResults()
			{
				if( true == g_bConnect )
				{
					eResContainer.style.display = "block";
					document.all.eResWindow.style.width = document.body.clientWidth - 55;
				}
				eAccess.scrollTop = 0;
				eConnecting.style.display = "none";
				tblResources.style.display = "block";
				tdThanks.style.display = "none";
				Content_LI3.style.display = "block";
				eConnectionUI.style.display = "none";
				eBtnNav2.style.display = "none";
				if( false == g_bFromSavedFav && false == g_bFromConnectUI )
				{
					eBtnNav3.style.display = "block";
				}
				ResizeButtons( [eBack,eNext_D,eFinish] );
				if( true == g_bFromSavedFav )
				{
					tdNoRecord.style.display = "none";
					Content_LI3.style.display = "none";
					eFinish.style.display = "none";
				}

				setTimeout( "ASSERT( 'Resize_ResultsContainer()' );", 100 );
			}

			function Resize_ResultsContainer()
			{
				if( eResContainer.offsetHeight > 250 )
				{
					eResContainer.style.height = '250px';
				}
			}

			function GetDriverName( bShow, bForSavedFav )
			{
				var docElem, aDriverID, iDriverIDLen;
				var sXMLFile = GetFilePathFromURL( g_sThisHREF );
				if( true == g_bValidXMLFile )
				{
					var streamXML = pchealth.OpenFileAsStream( sXMLFile );
					var oXML = new ActiveXObject( "Msxml2.DOMDocument" );
					oXML.async = false;
					oXML.validateOnParse = false;
					oXML.resolveExternals = false;
					oXML.load( streamXML );
					docElem = oXML.documentElement;
					aDriverID = docElem.selectNodes( "//hwid" );
					iDriverIDLen = aDriverID.length
					if( !bShow )
					{
						g_sDrvIDs = escape( aDriverID.item(0).text ) + "|";
						for( var i=1; i<iDriverIDLen; i++ )
						{
							g_sDrvIDs += escape( aDriverID.item(i).text ) + "|";
						}

						if( !bForSavedFav )
						{
							eMain.style.display = "none";
							h3Default.style.display = "none";
							CheckDriver( g_sDrvIDs );
						}
					}
				}
				else
				{
					if( true == g_bFav_UploadSuccess )
					{
						var sDrvIDs = g_sThisHREF.substring( g_sThisHREF.indexOf( "&eDrvIDs=" ) ).replace( "&eDrvIDs=", "" );
						ASSERT( "CheckDriver('" + sDrvIDs + "')" );
					}
					else
					{
						eConnecting.style.display = "none";
						ASSERT( "ShowDataFileError()" );
					}
				}
			}

			function ShowPopUp( sType )
			{
				if( "xml" == sType )
				{
					ASSERT( "ShowUploadXML()" );
				}
				else
				{
					ASSERT( "OpenPrivWindow()" );
				}
			}

			function OpenPrivWindow()
			{
				if( null == g_oPrivDlg )
				{
					g_oPrivDlg = window.showModelessDialog( "hcp://system/dfs/Privacy.htm", window, "status:no;help:no;resizable:no;dialogWidth:500px;dialogHeight:450px" );
				}
			}

			function DisplayXML()
			{
				var sXmlFile = GetFilePathFromURL( g_sThisHREF );
				var oXML = new ActiveXObject( "Msxml2.DOMDocument" );
				oXML.async = false;
				oXML.validateOnParse = false;
				oXML.resolveExternals = false;
				oXML.load( sXmlFile );
				var oStyle = new ActiveXObject( "Msxml2.DOMDocument" );
				oStyle.async = false;
				oStyle.load( "xmldisplay.xsl" );
				var sHTML = oXML.transformNode( oStyle );
				sHTML = sHTML.replace( "</h5>", L_DialogHeading_Text + "</h5>" );
				sHTML = sHTML.replace( "</button>", L_DialogClose_Text + "</button>" );
				g_oXMLDlg.document.write( sHTML );
			}

			function ShowUploadXML()
			{
				if( null == g_oXMLDlg )
				{
					if( true == g_bValidXMLFile )
					{
						var sURL = "hcp://system/dfs/XMLDialog.htm";
						g_oXMLDlg = window.showModelessDialog( sURL, window, "status:no;help:no;dialogWidth:600px;dialogHeight:450px");
					}
					else
					{
						ASSERT( "ShowDataFileError()" );
					}
				}
			}

			/*** End Upload Process ***/

			/*** Dialog Code ***/

			function ShowMessage( sMessage )
			{
				var sButtonType = "YESNOCANCEL";
				var sRetVal = pchealth.MessageBox( sMessage, sButtonType );
				if( "YES" == sRetVal )
				{
					eNoConnect.style.display = "none";
					OpenConnWizard();
				}
				else if( "NO" == sRetVal )
				{
					g_bNonRASConnectoid = true;
				}
			}

			/*** End Dialog Code ***/

			/*** Add To HSS Favorites ***/

			function AddFavorite( bFromResourceLink )
			{
				var oFav = pchealth.UserSettings.Favorites;
				var sThisURL = g_sThisHREF;
				if( true == g_bSaveFavorite || true == oFav.IsDuplicate( sThisURL ) )
				{
					pchealth.MessageBox( L_FavoriteDupe_Message, "OK" );
					return;
				}
				else
				{
					g_bSaveFavorite = true;
				}
				ASSERT( "GetDriverName( false, true )" );

				if( true == bFromResourceLink )
				{
					pchealth.MessageBox( L_FavoriteAdded_Message, "OK" );
				}
			}

			/*** End Favs ***/

			/*** Misc ***/

			function OpenConnWizard()
			{
				try
				{
					var oShell = new ActiveXObject( "WScript.Shell" );
					var sShellCmd_NCW = "rundll32 netshell.dll,StartNCW 0";
					oShell.Run( sShellCmd_NCW );
				}
				catch( e )
				{

				}
			}

			function OpenConnManager()
			{
				try
				{
					g_bRanRasPhone = true;
					g_oWShell.Run( "rasphone.exe" );
				}
				catch( e )
				{
					g_bRanRasPhone = false;
				}
			}

			function LaunchCPL_HW()
			{
				g_oWShell.Run( "control hdwwiz.cpl" );
				if( false == g_bFromSavedFav )
				{
					setTimeout( "pchealth.close();", 500 );
				}
			}

			function HSS_NavigateToTS()
			{
				var oFSO = new ActiveXObject( "Scripting.FileSystemObject" );
				var sWinDir = oFSO.GetSpecialFolder(0);
				var sHelpTopicURL = "";
				if( true == pchealth.UserSettings.IsDesktopVersion )
				{
					sHelpTopicURL = "hcp://services/subsite?node=TopLevelBucket_4/Fixing_a_problem&select=TopLevelBucket_4/Fixing_a_problem/Home_Networking_and_network_problems";
					if( false == g_bFromSavedFav )
					{
							g_oWShell.Run( sHelpTopicURL );
					}
					else
					{
						location.href = sHelpTopicURL;
					}
				}
				else
				{
					sHelpTopicURL = "hcp://services/subsite?node=Connections/Network_Connections&topic=ms-its:" + sWinDir + "\\Help\\netcfg.chm::/trouble_all.htm&select=Connections/Network_Connections/Troubleshooting/Troubleshooting_network_and_dial-up_connections";
					if( false == g_bFromSavedFav )
					{
							g_oWShell.Run( sHelpTopicURL );
					}
					else
					{
						location.href = sHelpTopicURL;
					}
				}
			}

			function ResizeButtons( arr_oButtons )
			{
				var aBtnsLen = arr_oButtons.length;
				var aWidths = new Array();
				var iMax = 0;
				for( var i=0; i<aBtnsLen; i++ )
				{
					aWidths[i] = arr_oButtons[i].offsetWidth;
				}

				for( var i=0; i<aBtnsLen; i++ )
				{
					if( aWidths[i] > iMax )
					{
						iMax = aWidths[i];
					}
				}
				var iMaxBtnWidth = iMax;

				for( var i=0; i<aBtnsLen; i++ )
				{
					arr_oButtons[i].style.width = iMaxBtnWidth;
				}

			}

			function MatchSize()
			{
				if( "block" == eMain.currentStyle.display )
				{
					if( eNo.checked == false && eYes.checked == false )
					{
						eNext.disabled = true;
					}
					ResizeButtons( [eBack_D,eNext,eCancel] );
				}
				else if( "block" == eConnectionUI.currentStyle.display )
				{
					if( eNoConn.checked == false && eYesConn.checked == false )
					{
						eConnNext.disabled = true;
					}
					ResizeButtons( [eConnBack,eConnNext,eConnCancel] );
				}
			}

			function NavigateTo_FullView( sURL )
			{
				ASSERT( 'g_oWShell.Run( "' + sURL + '" )' );
			}

			function ShowDataFileError()
			{
				eMain.style.display = "none";
				eConnectionUI.style.display = "none";
				eBtnNav1.style.display = "none";
				eBtnNav2.style.display = "none";
				eBtnNav3.style.display = "block";
				eBack.disabled = true;
				h3Default.style.display = "block";
				eDataFileError.style.display = "block";
			}

			function SetExpirationDate( iDaysFromNow )
			{
				var oDate = new Date();
				var vtDate = oDate.getVarDate();
				var iMin_Msec = 1000 * 60;
				var iHr_Msec = iMin_Msec * 60;
				var iDy_Msec = iHr_Msec * 24;
				var iCurrent_Msec = Date.parse( vtDate );
				var iExp_Msec = iCurrent_Msec + ( iDaysFromNow * iDy_Msec );
				var oExpDate = new Date( iExp_Msec );
				var vtExpDate = oExpDate.getVarDate();
				return vtExpDate;
			}

			function GetIPAdresses()
			{
				var sIPs = "";
				try
				{
					sIPs = pchealth.Connectivity.IPAddresses;
				}
				catch( e )
				{
					try
					{
						var oSetting = new ActiveXObject( "rcbdyctl.Setting" );
						sIPs = oSetting.GetIPAddress;
					}
					catch( e )
					{

					}
				}
				finally
				{
					return sIPs;
				}
			}

			function DetectReadyState()
			{
				try
				{
					var eResWinDoc = document.frames["eResWindow"].document;
					if( "complete" == eResWinDoc.readyState )
					{
						h3Searching.style.display = "none";
					}
				}
				catch( e )
				{
					h3Searching.style.display = "none";
				}
			}

			/*** End Misc ***/

			/*** Event Handlers ***/

			function window::onresize()
			{
				if( "block" == eResContainer.currentStyle.display )
				{
					ASSERT( "Resize()" );
				}
			}

			function window::onload()
			{
				if( -1 != g_sThisHREF.indexOf( "saved=true" ) )
				{
					g_bSend = true;
					g_bConnect = true;
					g_bFromSavedFav = true;
					if( -1 != g_sThisHREF.indexOf( "eDrvIDs=" ) )
					{
						g_bFav_UploadSuccess = true;
					}
					ASSERT( "g_bFromConnectUI=false;Send()" );
				}
				else
				{
					eNo.checked = false;
					eYes.checked = false;
					eBtnNav1.style.display = "block";
					ASSERT( "MatchSize()" );
				}

				if( false == g_bValidXMLFile )
				{
					eDataLnk.disabled = true;
					eDataLnk.style.cursor = "default";
					eDataLnk.onclick = new Function( "return false" );
				}
			}

			function window::onunload()
			{
				var oFav = pchealth.UserSettings.Favorites;
				var sThisURL = g_sThisHREF;
				var oDate = new Date();
				var sDate = oDate.toLocaleDateString();
				var sFavTitle = document.title + " -- " + sDate;
				var sThisURL_New = sThisURL + "&saved=true";
				var sThisURL_Exists = sThisURL.replace( /file:\/\/.*/i,"saved=true" );
				sThisURL_Exists = sThisURL_Exists + "&eDrvIDs=" + g_sDrvIDs;
				var sFile = GetFilePathFromURL( g_sThisHREF );
				var oFSO = new ActiveXObject( "Scripting.FileSystemObject" );
				try
				{
					if( true == g_bValidXMLFile )
					{
						oFSO.DeleteFile( sFile );
					}
				}
				catch( e ){ }
				if( true == g_bSend )
				{
					if( true == g_bSaveFavorite )
					{
						for(var oEnumFavs = new Enumerator( oFav ); !oEnumFavs.atEnd(); oEnumFavs.moveNext() )
						{
							var oThisFav = oEnumFavs.item();
							if( sThisURL == oThisFav.URL || sThisURL_New == oThisFav.URL || sThisURL_Exists == oThisFav.URL )
							{
								oFav.Delete( oThisFav );
								break;
							}
						}
						oFav.Add( sThisURL_Exists, sFavTitle );
					}
				}
			}

			/*** End Event Handlers ***/
		</script>
	</head>
	<body scroll="no" bgcolor="#ffffff" text="#000000" topmargin="0" leftmargin="10" oncontextmenu="return false;">
		<div id="eAccess" style="height:90%;overflow:auto;">
			<h3 id="h3Default">Get Help with Your Hardware Device</h3>
			<h3 id="h3Searching" class="clsHidden">Searching for device information...<br /><img id="eConnImg" src="hcp://system/images/progbar.gif" border="no" /></h3>
			<div id="eConnecting" class="clsHidden" style="position:absolute;top:expression((document.body.offsetHeight - eConnectingH3.offsetHeight)/2);left:expression((document.body.offsetWidth - eConnectingH3.offsetWidth)/2);">
				<h3 id="eConnectingH3">Checking your Internet connection...<br /><img id="eConnImg" src="hcp://system/images/progbar.gif" border="no" /></h3>
			</div>
			<div id="eResContainer">
				<iframe id="eResWindow" src="" frameborder="0" width="1" height="1" application="yes" onreadystatechange="ASSERT( 'DetectReadyState()' );"></iframe>
			</div>
			<div id="eNoConnect" class="clsHidden">
				<br />
				<b style="color:red;">Internet connection could not be established</b>
				<br />
				<br />
				There was a problem in connecting to the Internet. Click the <b>Back</b> button, and try to connect again.
				<br />
				<br />
				<a href="javascript:ASSERT( 'HSS_NavigateToTS()' );" id="eNoConnectLnk">Get troubleshooting tips on connecting</a>
				<br />
				<br />
			</div>
			<div id="eDataFileError" class="clsHidden">
				<b style="color:red;">Unable to continue the hardware information upload process</b>
				<br />
				<br />
				A problem has occurred with your hardware information file and we are unable to process it.
				This process cannot continue without this information. If you wish to complete this process,
				you will need to try installing the device again by accessing the Add New Hardware wizard.
				<br />
				<br />
				<a href="javascript:ASSERT( 'LaunchCPL_HW()' );">Start the Add New Hardware wizard.</a>
				</br>
			</div>
			<div id="tblCancel" class="clsHidden">
				<div id="tdNoRecord" class="clsHidden">
					You chose not to allow Microsoft to record your hardware information.
					<br />
					<br />
				</div>
				<div id="tdDelayUpload" class="clsContent">
					Your hardware information will be sent automatically the next time you connect to the Internet.
					<br />
					<br />
				</div>
				<div id="eTDContactMan" class="clsContent">
					You may want to contact the manufacturer and ask them to provide a driver for this hardware device.
					<br />
					<br />
				</div>
			</div>
			<div id="tblResources" class="clsHidden">
				<div id="tdThanks" class="clsContent">
					Thank you for submitting your missing driver information to Microsoft.
				</div>

				<div id="tdResources" class="clsContent">
					You may find the following resources helpful:
				</div>
				<div class="clsContent">
					<ul id="eUL1">
						<li id="Content_LI1" style="padding-bottom:10px;">
							<a href="javascript:NavigateTo_FullView( 'hcp://system/compatctr/CompatOffline.htm' );">Compatibility Center</a> - Find out
							which hardware and software are compatible with the Windows Server 2003 family and related Windows products.
						</li>

						<li id="Content_LI2" style="padding-bottom:10px;">
							<a href="javascript:NavigateTo_FullView( 'hcp://system/sysinfo/sysinfomain.htm' );">My Computer Information</a> - Read
							information about hardware and software that your computer currently has installed.
						</li>
						<li id="Content_LI3">
							<a href="javascript:void(0);" onclick="ASSERT( 'AddFavorite( true )' );" id="lnkAddFav">Save this page to your Help Center Favorites list</a> -
							You can submit your hardware information again and get manufacturer feedback.
						</li>
					</ul>
					<br />
				</div>
			</div>
			<div id="eMain">
				<div id="eMainContent">
					<div id="eTDMainContent" class="clsContent">
						The wizard was unable to find the necessary software for your new hardware.
						<br />
						<br />
						Help and Support Center can now record your hardware profile to assist with future support.
						This is done automatically by reading the identification number that the manufacturer
						has encoded in your hardware. If you want, you can see the contents of <a id="eDataLnk" href="javascript:ASSERT( 'ShowPopUp( \'xml\' )' );">the file that contains this information</a>.
						This information will remain confidential--see Microsoft's <a id="ePrivLnk" href="javascript:ASSERT( 'ShowPopUp()' );">privacy policy</a>. Using this
						information, Microsoft can query for any available details on the hardware manufacturer's Web site.
						<br />
						<br />
						<div id="eConfirm" cellpadding="0" cellspacing="0" style="margin:10px 20px 10px 20px;vertical-align:abstop;">
							<input type="radio" name="eRad" id="eYes" onclick="ASSERT( 'SetUploadState( true )' );"><label id="eLblYes" for="eYes">Yes, record my hardware profile.</label>
							<br />
							<input type="radio" name="eRad" id="eNo" onclick="ASSERT( 'SetUploadState( false )' );"><label id="eLblNo" for="eNo">No, I prefer not to participate.</label>
						</div>
					</div>
					<div id="eMainList" class="clsContent">
						This information will help us provide:
						<ul id="eUL2">
							<li id="Content_LI4">
								Improved manufacturer support for new hardware installations in
								future versions of Windows.
							</li>
							<li id="Content_LI5">
								More supporting software for you to download from Microsoft Web
								sites.
							</li>
							<li id="Content_LI6">
								Links to other Internet sites that carry software or support information
								for your new hardware.
							</li>
						</ul>
					</div>
					<div id="eCancelDesc" class="clsContent">
						Click <b>Cancel</b> to end the wizard. You may want to contact the manufacturer
						and ask them to provide a driver(software) for this hardware device.
					</div>
				</div>
			</div>
			<div id="eConnectionUI" class="clsHidden">
				<div id="eConnConntent" class="clsContent">
					To submit your hardware information now and receive the latest manufacturer information back, please connect to the Internet. Or, if you want,
					your hardware information can be submitted automatically the next time you connect to the Internet, but you won't receive the latest information in return.
					<br />
					<br />
					If you choose to save this page to your Help and Support Center Favorites list, then you can access this page again to submit your hardware information
					and get manufacturer feedback.
					<br />
					<br />
					<div id="eConfirmConn" cellpadding="0" cellspacing="0" style="margin:0px 20px 0px 20px;">
						<input type="radio" name="eRadConn" id="eYesConn" onclick="ASSERT( 'SetConnState( true )' );"><label id="eLblYesConn" for="eYesConn">Attempt to connect to the Internet now</label>
						<br />
						<input type="radio" name="eRadConn" id="eNoConn" onclick="ASSERT( 'SetConnState( false )' );"><label id="eLblNoConn" for="eNoConn">Send my hardware information the next time I connect</label>
					</div>
					<br />
					<input type="checkbox" id="eChkSaveQuery" onclick="if(this.checked) ASSERT( 'AddFavorite( false )' );"><label id="eLblSaveQuery" for="eChkSaveQuery">Save this page to my Help and Support Center Favorites list</label>
				</div>
			</div>
		</div>
		<div id="eBtnNav1" class="clsNavTable clsHidden" cellpadding="0" cellspacing="0" align="right" style="margin:0px">
			<button id="eBack_D" disabled>&lt;&nbsp;Back</button>
			<button id="eNext" onclick="ASSERT( 'g_bFromConnectUI=false;Send()' );">Next&nbsp;&gt;</button>
			<button id="eCancel" onclick="ASSERT( 'g_bFromConnectUI=false;Cancel()' );">Cancel</button>
		</div>
		<div id="eBtnNav2" class="clsNavTable clsHidden" cellpadding="0" cellspacing="0" align="right" style="margin:0px">
			<button id="eConnBack" onclick="g_bFromConnectUI=false;ASSERT( 'Back()' );">&lt;&nbsp;Back</button>
			<button id="eConnNext" onclick="ASSERT( 'g_bFromConnectUI=true;Send()' );">Next&nbsp;&gt;</button>
			<button id="eConnCancel" onclick="ASSERT( 'Cancel()' );">Cancel</button>
		</div>
		<div id="eBtnNav3" class="clsNavTable clsHidden" align="right" style="margin:5px 0px 0px 0px;">
			<button id="eBack" onclick="ASSERT( 'Back()' );">&lt;&nbsp;Back</button>
			<button id="eNext_D" disabled>Next&nbsp;&gt;</button>
			<button id="eFinish" onclick="ASSERT( 'pchealth.close()' );">Finish</button>
		</div>
	</body>
</html>