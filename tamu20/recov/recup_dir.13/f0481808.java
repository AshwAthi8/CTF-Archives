sion\Internet Settings"
        POLICY !!CacheMode
                PART !!SyncMode DROPDOWNLIST
                VALUENAME SyncMode5
                ITEMLIST
                        NAME !!SyncMode0 VALUE NUMERIC 0
                        NAME !!SyncMode2 VALUE NUMERIC 2
                        NAME !!SyncMode3 VALUE NUMERIC 3
                        NAME !!SyncMode4 VALUE NUMERIC 4 DEFAULT
                END ITEMLIST
                END PART
        END POLICY
 
    POLICY !!CacheUser
    KEYNAME "Software\Microsoft\Windows\CurrentVersion\Internet Settings\5.0\Cache\Content"
                PART !!CacheSizeUser NUMERIC
                VALUENAME CacheLimit
                DEFAULT 20480
                MIN 1024
                END PART
        END POLICY
END CATEGORY


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
CLASS MACHINE ;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
CATEGORY !!Cache
KEYNAME "Software\Microsoft\Windows\CurrentVersion\Internet Settings\5.0\Cache\Content"
        POLICY !!CacheMachine
                PART !!CacheSize NUMERIC
                VALUENAME CacheLimit
                DEFAULT 20480
                MIN 1024
                END PART
        END POLICY

	POLICY !!UserProfiles
	KEYNAME "Software\Microsoft\Windows\CurrentVersion\Internet Settings\Cache"
		PART !!DisableCache CHECKBOX
		VALUENAME UserProfiles 
		VALUEON NUMERIC 0 
		VALUEOFF NUMERIC 1
	 	ACTIONLISTON
			KEYNAME "Software\Microsoft\Windows\CurrentVersion\Internet Settings\5.0\Cache\Content"
	                VALUENAME PerUserItem VALUE NUMERIC 0
		END ACTIONLISTON
	 	ACTIONLISTOFF
			KEYNAME "Software\Microsoft\Windows\CurrentVersion\Internet Settings\5.0\Cache\Content"
	                VALUENAME PerUserItem VALUE NUMERIC 1
		END ACTIONLISTOFF
		END PART
	END POLICY

END CATEGORY


CATEGORY !!CodeDownload
KEYNAME "Software\Microsoft\Windows\CurrentVersion\Internet Settings"
        POLICY !!CodeDownload
                PART !!Path EDITTEXT
                DEFAULT !!DefaultSearchPath
                VALUENAME "CodeBaseSearchPath"
                END PART
        END POLICY
END CATEGORY


CATEGORY !!ErrorPages
KEYNAME "Software\Microsoft\Internet Explorer\Main\ErrorThresholds"
	POLICY !!RelatedSites
		PART !!RelatedSitesText DROPDOWNLIST
		KEYNAME "SOFTWARE\Microsoft\Internet Explorer\Extensions\{c95fe080-8f5d-11d2-a20b-00aa003c157a}"
		VALUENAME clsid
		ITEMLIST
			NAME !!RelatedSitesOnBoth VALUE "{1FBA04EE-3024-11D2-8F1F-0000F87ABD16}"
			ACTIONLIST
				KEYNAME "SOFTWARE\Microsoft\Internet Explorer\Extensions\{c95fe080-8f5d-11d2-a20b-00aa003c157a}"
				VALUENAME "Default Visible" VALUE "yes"
			END ACTIONLIST

			NAME !!RelatedSitesOnMenu VALUE "{1FBA04EE-3024-11D2-8F1F-0000F87ABD16}" DEFAULT
			ACTIONLIST
				KEYNAME "SOFTWARE\Microsoft\Internet Explorer\Extensions\{c95fe080-8f5d-11d2-a20b-00aa003c157a}"
				VALUENAME "Default Visible" VALUE "no"
			END ACTIONLIST

			NAME !!RelatedSitesOff VALUE " "
		END ITEMLIST
		END PART
	END POLICY
END CATEGORY



#endif

[strings]

CacheMode="Temporary Internet Files (User)"
SyncMode="Check for newer versions of stored pages:"
SyncMode0="Never"
SyncMode2="Every time you start Internet Explorer"
SyncMode3="Every visit to the page"
SyncMode4="Automatically"

CacheUser="Temporary Internet Files (User)"
CacheSizeUser="Set amount of disk space to use (in kilobytes):"

Cache="Temporary Internet Files (Machine)"
CacheMachine="Temporary Internet Files (Machine)"
CacheSize="Set amount of disk space to use (in kilobytes):"

UserProfiles="User Profiles"
DisableCache="Disable Roaming Cache"

CodeDownload="Code Download"
SearchPath="Internet Search Path"
Path="Path"
DefaultSearchPath="CODEBASE;<http://activex.microsoft.com/objects/ocget.dll>"

PUC="Periodic Update Check"
NoUpdateCheck="Disable Periodic Check for Internet Explorer updates"

ErrorPages="Related Sites and Errors"
RelatedSites="Related Sites"
RelatedSitesText="Choose mode of menu item and toolbar button:"
RelatedSitesOnBoth="Show the menu item, and turn on the toolbar button"
RelatedSitesOnMenu="Show the menu item, but do not turn on the toolbar button"
RelatedSitesOff="Disable the menu item and browser toolbar button"

IEAKOnly_Tip1="The inetcorp.adm file is not for Windows 2000"
IEAKOnly_Tip2="These settings will not be displayed"
IEAKOnly="IE Maintenance Only"
IEAKOnlyPolicy="INETCORP.ADM"

IEAK_Title=Corporate Settings
IEAK_DescriptionTitle=Corporate Settings
IEAK_Description1=These settings can be useful in reducing the cost of supporting applications in your corporation. Using the settings in this file, you can make the browser work best for your corporation. Advanced features, as well as details of other features, can all be configured through these options.
IEAK_Description2=Code Download Notes:
IEAK_Description3=When Internet Explorer navigates to a page which requires an ActiveX control or Java code that is not already on the machine, a sequence of URLs are searched for the required item. The URLs it searches are determined by the code download path. By changing or adding to the code download path, you can maintain your own directory of ActiveX controls and Java code common to your corporation.
IEAK_Description4=An example code download path: CODEBASE;<http://activex.microsoft.com/objects/ocget.dll> 
IEAK_Description5=When searching for a control, Internet Explorer will first try the location specified in the CODEBASE attribute of the HTML <OBJECT> tag of the referring page, and if absent, try http://activex.microsoft.com/objects/ocget.dll. For additional details, see the Internet Component Download documentation in the Internet Client SDK.
IEAK_Description6=To change the default language of the menus and dialogs, use the Language Settings category. By chosing a language here, you will be picking the default language to be used. This is only effective if you have installed the appropriate satellite pack for the chosen language. If the appropriate pack is not installed, the browser will use the default. Note: All of the language satellite packs will not be available at the same time. Use AVS to check for updates.

[IEAK]
Lock=1
Roles=001
NumOfDescLines=6
Platform=010
