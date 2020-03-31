;;; Windows Scripting Host Setup Information File
;;; Copyright (c) Microsoft Corporation.  All rights reserved.
;;; 98/06/25 20:50:23 (X86 0531 EN WEB)
;;;

[Version]
Signature       = "$Windows NT$"
ClassGUID       = {00000000-0000-0000-0000-000000000000}
SetupClass      = Base
LayoutFile      = layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[DefaultInstall]
AddReg          = AddReg.WSH
DelReg		= DelReg.WSH
RegisterDlls	= RegDlls.WSH

;;;
;;; Add WSH registry entries
;;;
[AddReg.WSH]
HKLM, "Software\Microsoft\Windows Script Host\Settings","DisplayLogo",,"1"
HKLM, "Software\Microsoft\Windows Script Host\Settings","ActiveDebugging",,"1"
HKLM, "Software\Microsoft\Windows Script Host\Settings","SilentTerminate",,"0"
HKLM, "Software\Microsoft\Windows Script Host\Settings","UseWINSAFER",,"1"

; Shell Extension
HKLM, "Software\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved","{60254CA5-953B-11CF-8C96-00AA00B8708C}",,"%DESC_WSHEXT%"

; .WSH
HKCR, ".WSH","",,"WSHFile"
HKCR, "WSHFile","",,"%DESC_DOTWSH%"
HKCR, "WSHFile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_WSHEXT%,-4800"
HKCR, "WSHFile","IsShortcut",,"Yes"
HKCR, "WSHFile\DefaultIcon","",0x00020002,"%SystemRoot%\System32\WScript.exe,1"
HKCR, "WSHFile\Shell\Open","",,"%MENU_OPEN%"
HKCR, "WSHFile\Shell\Open\Command",,0x00020002,"%SystemRoot%\System32\WScript.exe ""%1"" %*"
HKCR, "WSHFile\Shell\Open2","",,"%MENU_CONOPEN%"
HKCR, "WSHFile\Shell\Open2\Command","",0x00020002,"%SystemRoot%\System32\CScript.exe ""%1"" %*"
HKCR, "WSHFile\ShellEx\PropertySheetHandlers\WSHProps","",,"%CLSID_WSHEXT%"
HKCR, "WSHFile\ShellEx\DropHandler","",,"%CLSID_WSHEXT%"

; .VBS
HKCR, ".VBS","",,"VBSFile"
HKCR, "VBSFile","",,"%DESC_DOTVBS%"
HKCR, "VBSFile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_WSHEXT%,-4802"
HKCR, "VBSFile\DefaultIcon","",0x00020002,"%SystemRoot%\System32\WScript.exe,2"
HKCR, "VBSFile\ScriptEngine","",,"VBScript"
HKCR, "VBSFile\Shell\Open","",,"%MENU_OPEN%"
HKCR, "VBSFile\Shell\Open\Command","",0x00020002,"%SystemRoot%\System32\WScript.exe ""%1"" %*"
HKCR, "VBSFile\Shell\Open2","",,"%MENU_CONOPEN%"
HKCR, "VBSFile\Shell\Open2\Command","",0x00020002,"%SystemRoot%\System32\CScript.exe ""%1"" %*"
HKCR, "VBSFile\Shell\Edit","",,"%MENU_EDIT%"
HKCR, "VBSFile\Shell\Edit\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe %1"
HKCR, "VBSFile\Shell\Print","",,"%MENU_PRINT%"
HKCR, "VBSFile\Shell\Print\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe /p %1"
HKCR, "VBSFile\ShellEx\PropertySheetHandlers\WSHProps","",,"%CLSID_WSHEXT%"
HKCR, "VBSFile\ShellEx\DropHandler","",,"%CLSID_WSHEXT%"

; .VBE
HKCR, ".VBE","",,"VBEFile"
HKCR, "VBEFile","",,"%DESC_DOTVBE%"
HKCR, "VBEFile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_WSHEXT%,-4803"
HKCR, "VBEFile\DefaultIcon","",0x00020002,"%SystemRoot%\System32\WScript.exe,2"
HKCR, "VBEFile\ScriptEngine","",,"VBScript.Encode"
HKCR, "VBEFile\Shell\Open","",,"%MENU_OPEN%"
HKCR, "VBEFile\Shell\Open\Command","",0x00020002,"%SystemRoot%\System32\WScript.exe ""%1"" %*"
HKCR, "VBEFile\Shell\Open2","",,"%MENU_CONOPEN%"
HKCR, "VBEFile\Shell\Open2\Command","",0x00020002,"%SystemRoot%\System32\CScript.exe ""%1"" %*"
HKCR, "VBEFile\Shell\Edit","",,"%MENU_EDIT%"
HKCR, "VBEFile\Shell\Edit\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe %1"
HKCR, "VBEFile\Shell\Print","",,"%MENU_PRINT%"
HKCR, "VBEFile\Shell\Print\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe /p %1"
HKCR, "VBEFile\ShellEx\PropertySheetHandlers\WSHProps","",,"%CLSID_WSHEXT%"
HKCR, "VBEFile\ShellEx\DropHandler","",,"%CLSID_WSHEXT%"

; .JS
HKCR, ".JS","",,"JSFile"
HKCR, "JSFile","",,"%DESC_DOTJS%"
HKCR, "JSFile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_WSHEXT%,-4804"
HKCR, "JSFile\DefaultIcon","",0x00020002,"%SystemRoot%\System32\WScript.exe,3"
HKCR, "JSFile\ScriptEngine","",,"JScript"
HKCR, "JSFile\Shell\Open","",,"%MENU_OPEN%"
HKCR, "JSFile\Shell\Open\Command","",0x00020002,"%SystemRoot%\System32\WScript.exe ""%1"" %*"
HKCR, "JSFile\Shell\Open2","",,"%MENU_CONOPEN%"
HKCR, "JSFile\Shell\Open2\Command","",0x00020002,"%SystemRoot%\System32\CScript.exe ""%1"" %*"
HKCR, "JSFile\Shell\Edit","",,"%MENU_EDIT%"
HKCR, "JSFile\Shell\Edit\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe %1"
HKCR, "JSFile\Shell\Print","",,"%MENU_PRINT%"
HKCR, "JSFile\Shell\Print\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe /p %1"
HKCR, "JSFile\ShellEx\PropertySheetHandlers\WSHProps","",,"%CLSID_WSHEXT%"
HKCR, "JSFile\ShellEx\DropHandler","",,"%CLSID_WSHEXT%"

; .JSE
HKCR, ".JSE","",,"JSEFile"
HKCR, "JSEFile","",,"%DESC_DOTJSE%"
HKCR, "JSEFile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_WSHEXT%,-4805"
HKCR, "JSEFile\DefaultIcon","",0x00020002,"%SystemRoot%\System32\WScript.exe,3"
HKCR, "JSEFile\ScriptEngine","",,"JScript.Encode"
HKCR, "JSEFile\Shell\Open","",,"%MENU_OPEN%"
HKCR, "JSEFile\Shell\Open\Command","",0x00020002,"%SystemRoot%\System32\WScript.exe ""%1"" %*"
HKCR, "JSEFile\Shell\Open2","",,"%MENU_CONOPEN%"
HKCR, "JSEFile\Shell\Open2\Command","",0x00020002,"%SystemRoot%\System32\CScript.exe ""%1"" %*"
HKCR, "JSEFile\Shell\Edit","",,"%MENU_EDIT%"
HKCR, "JSEFile\Shell\Edit\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe %1"
HKCR, "JSEFile\Shell\Print","",,"%MENU_PRINT%"
HKCR, "JSEFile\Shell\Print\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe /p %1"
HKCR, "JSEFile\ShellEx\PropertySheetHandlers\WSHProps","",,"%CLSID_WSHEXT%"
HKCR, "JSEFile\ShellEx\DropHandler","",,"%CLSID_WSHEXT%"

; .WSF
HKCR, ".WSF","",,"WSFFile"
HKCR, "WSFFile","",,"%DESC_DOTWS%"
HKCR, "WSFFile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_WSHEXT%,-4801"
HKCR, "WSFFile\DefaultIcon","",0x00020002,"%SystemRoot%\System32\WScript.exe,2"
HKCR, "WSFFile\Shell\Open","",,"%MENU_OPEN%"
HKCR, "WSFFile\Shell\Open\Command","",0x00020002,"%SystemRoot%\System32\WScript.exe ""%1"" %*"
HKCR, "WSFFile\Shell\Open2","",,"%MENU_CONOPEN%"
HKCR, "WSFFile\Shell\Open2\Command","",0x00020002,"%SystemRoot%\System32\CScript.exe ""%1"" %*"
HKCR, "WSFFile\Shell\Edit","",,"%MENU_EDIT%"
HKCR, "WSFFile\Shell\Edit\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe %1"
HKCR, "WSFFile\Shell\Print","",,"%MENU_PRINT%"
HKCR, "WSFFile\Shell\Print\Command","",0x00020002,"%SystemRoot%\System32\Notepad.exe /p %1"
HKCR, "WSFFile\ShellEx\PropertySheetHandlers\WSHProps","",,"%CLSID_WSHEXT%"
HKCR, "WSFFile\ShellEx\DropHandler","",,"%CLSID_WSHEXT%"

; .WSC (Patch)
HKCR, "scriptletfile","FriendlyTypeName",0x00020002,"@%SystemRoot%\System32\%FILE_SCROBJ%,-8192"

[DelReg.WSH]
HKLM, "Software\Microsoft\Windows\CurrentVersion\Setup\OC Manager\Subcomponents","wsh_core"

[RegDlls.WSH]
11,, wscript.exe,,,"/regserver" 































[Strings]
; Unlocalizable strings
REG_WSH             = "Software\Microsoft\Windows Script Host"
REG_APPROVE         = "Software\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved"
REG_UNINSTALL       = "Software\Microsoft\Windows\CurrentVersion\Uninstall\WindowsScriptHost"
CLSID_WSHEXT        = "{60254CA5-953B-11CF-8C96-00AA00B8708C}"

; Localizable strings
DISP_WSH            = "Microsoft Windows Script Host"
DESC_WSH            = "Windows Script Host"
DESC_DISKS          = "Windows Script Host Files"
TIPS_WSH            = "Write scripts to help automate tasks in Windows"

DESC_DOTWSH         = "Windows Script Host Settings File"
DESC_DOTVBS         = "VBScript Script File"
DESC_DOTVBE         = "VBScript Encoded Script File"
DESC_DOTJS          = "JScript Script File"
DESC_DOTJSE         = "JScript Encoded Script File"
DESC_DOTWS          = "Windows Script File"
DESC_WSHEXT         = "Shell extensions for Windows Script Host"

DESC_WSHOMLIB       = "Microsoft Windows Script Host Object Model"
DESC_WSHSHELL       = "Windows Script Host Shell Object"
DESC_WSHNETWORK     = "Windows Script Host Network Object"

MENU_OPEN           = "&Open"
MENU_CONOPEN        = "Open &with Command Prompt"
MENU_DOSOPEN        = "Open &with MS-DOS Prompt"
MENU_EDIT           = "&Edit"
MENU_PRINT          = "&Print"











































FILE_WSHEXT         = "wshext.dll"
FILE_SCROBJ         = "scrobj.dll"










































































































[defaultinstall]
RegisterDlls=wRegDlls.WSH
AddReg=wAddReg.WSH
DelReg=wDelReg.WSH

[wRegDlls.WSH]
16425,,wscript.exe,,,/regserver

[wAddReg.WSH]
HKLM,"Software\Microsoft\Windows Script Host\Settings",DisplayLogo,0x00004000,1
HKLM,"Software\Microsoft\Windows Script Host\Settings",ActiveDebugging,0x00004000,1
HKLM,"Software\Microsoft\Windows Script Host\Settings",SilentTerminate,0x00004000,0
HKLM,"Software\Microsoft\Windows Script Host\Settings",UseWINSAFER,0x00004000,1
HKLM,"Software\Microsoft\Windows\CurrentVersion\Shell Extensions\Approved",{60254CA5-953B-11CF-8C96-00AA00B8708C},0x00004000,"Shell extensions for Windows Script Host"
HKCR,.WSH,,0x00004000,WSHFile
HKCR,WSHFile,,0x00004000,"Windows Script Host Settings File"
HKCR,WSHFile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\wshext.dll,-4800"
HKCR,WSHFile,IsShortcut,0x00004000,Yes
HKCR,"WSHFile\DefaultIcon",,0x00024002,"%%SystemRoot%%\System32\WScript.exe,1"
HKCR,"WSHFile\Shell\Open",,0x00004000,&Open
HKCR,"WSHFile\Shell\Open\Command",,0x00024002,"%%SystemRoot%%\System32\WScript.exe ""%%1"" %%*"
HKCR,"WSHFile\Shell\Open2",,0x00004000,"Open &with Command Prompt"
HKCR,"WSHFile\Shell\Open2\Command",,0x00024002,"%%SystemRoot%%\System32\CScript.exe ""%%1"" %%*"
HKCR,"WSHFile\ShellEx\PropertySheetHandlers\WSHProps",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,"WSHFile\ShellEx\DropHandler",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,.VBS,,0x00004000,VBSFile
HKCR,VBSFile,,0x00004000,"VBScript Script File"
HKCR,VBSFile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\wshext.dll,-4802"
HKCR,"VBSFile\DefaultIcon",,0x00024002,"%%SystemRoot%%\System32\WScript.exe,2"
HKCR,"VBSFile\ScriptEngine",,0x00004000,VBScript
HKCR,"VBSFile\Shell\Open",,0x00004000,&Open
HKCR,"VBSFile\Shell\Open\Command",,0x00024002,"%%SystemRoot%%\System32\WScript.exe ""%%1"" %%*"
HKCR,"VBSFile\Shell\Open2",,0x00004000,"Open &with Command Prompt"
HKCR,"VBSFile\Shell\Open2\Command",,0x00024002,"%%SystemRoot%%\System32\CScript.exe ""%%1"" %%*"
HKCR,"VBSFile\Shell\Edit",,0x00004000,&Edit
HKCR,"VBSFile\Shell\Edit\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe %%1"
HKCR,"VBSFile\Shell\Print",,0x00004000,&Print
HKCR,"VBSFile\Shell\Print\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe /p %%1"
HKCR,"VBSFile\ShellEx\PropertySheetHandlers\WSHProps",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,"VBSFile\ShellEx\DropHandler",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,.VBE,,0x00004000,VBEFile
HKCR,VBEFile,,0x00004000,"VBScript Encoded Script File"
HKCR,VBEFile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\wshext.dll,-4803"
HKCR,"VBEFile\DefaultIcon",,0x00024002,"%%SystemRoot%%\System32\WScript.exe,2"
HKCR,"VBEFile\ScriptEngine",,0x00004000,VBScript.Encode
HKCR,"VBEFile\Shell\Open",,0x00004000,&Open
HKCR,"VBEFile\Shell\Open\Command",,0x00024002,"%%SystemRoot%%\System32\WScript.exe ""%%1"" %%*"
HKCR,"VBEFile\Shell\Open2",,0x00004000,"Open &with Command Prompt"
HKCR,"VBEFile\Shell\Open2\Command",,0x00024002,"%%SystemRoot%%\System32\CScript.exe ""%%1"" %%*"
HKCR,"VBEFile\Shell\Edit",,0x00004000,&Edit
HKCR,"VBEFile\Shell\Edit\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe %%1"
HKCR,"VBEFile\Shell\Print",,0x00004000,&Print
HKCR,"VBEFile\Shell\Print\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe /p %%1"
HKCR,"VBEFile\ShellEx\PropertySheetHandlers\WSHProps",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,"VBEFile\ShellEx\DropHandler",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,.JS,,0x00004000,JSFile
HKCR,JSFile,,0x00004000,"JScript Script File"
HKCR,JSFile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\wshext.dll,-4804"
HKCR,"JSFile\DefaultIcon",,0x00024002,"%%SystemRoot%%\System32\WScript.exe,3"
HKCR,"JSFile\ScriptEngine",,0x00004000,JScript
HKCR,"JSFile\Shell\Open",,0x00004000,&Open
HKCR,"JSFile\Shell\Open\Command",,0x00024002,"%%SystemRoot%%\System32\WScript.exe ""%%1"" %%*"
HKCR,"JSFile\Shell\Open2",,0x00004000,"Open &with Command Prompt"
HKCR,"JSFile\Shell\Open2\Command",,0x00024002,"%%SystemRoot%%\System32\CScript.exe ""%%1"" %%*"
HKCR,"JSFile\Shell\Edit",,0x00004000,&Edit
HKCR,"JSFile\Shell\Edit\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe %%1"
HKCR,"JSFile\Shell\Print",,0x00004000,&Print
HKCR,"JSFile\Shell\Print\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe /p %%1"
HKCR,"JSFile\ShellEx\PropertySheetHandlers\WSHProps",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,"JSFile\ShellEx\DropHandler",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,.JSE,,0x00004000,JSEFile
HKCR,JSEFile,,0x00004000,"JScript Encoded Script File"
HKCR,JSEFile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\wshext.dll,-4805"
HKCR,"JSEFile\DefaultIcon",,0x00024002,"%%SystemRoot%%\System32\WScript.exe,3"
HKCR,"JSEFile\ScriptEngine",,0x00004000,JScript.Encode
HKCR,"JSEFile\Shell\Open",,0x00004000,&Open
HKCR,"JSEFile\Shell\Open\Command",,0x00024002,"%%SystemRoot%%\System32\WScript.exe ""%%1"" %%*"
HKCR,"JSEFile\Shell\Open2",,0x00004000,"Open &with Command Prompt"
HKCR,"JSEFile\Shell\Open2\Command",,0x00024002,"%%SystemRoot%%\System32\CScript.exe ""%%1"" %%*"
HKCR,"JSEFile\Shell\Edit",,0x00004000,&Edit
HKCR,"JSEFile\Shell\Edit\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe %%1"
HKCR,"JSEFile\Shell\Print",,0x00004000,&Print
HKCR,"JSEFile\Shell\Print\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe /p %%1"
HKCR,"JSEFile\ShellEx\PropertySheetHandlers\WSHProps",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,"JSEFile\ShellEx\DropHandler",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,.WSF,,0x00004000,WSFFile
HKCR,WSFFile,,0x00004000,"Windows Script File"
HKCR,WSFFile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\wshext.dll,-4801"
HKCR,"WSFFile\DefaultIcon",,0x00024002,"%%SystemRoot%%\System32\WScript.exe,2"
HKCR,"WSFFile\Shell\Open",,0x00004000,&Open
HKCR,"WSFFile\Shell\Open\Command",,0x00024002,"%%SystemRoot%%\System32\WScript.exe ""%%1"" %%*"
HKCR,"WSFFile\Shell\Open2",,0x00004000,"Open &with Command Prompt"
HKCR,"WSFFile\Shell\Open2\Command",,0x00024002,"%%SystemRoot%%\System32\CScript.exe ""%%1"" %%*"
HKCR,"WSFFile\Shell\Edit",,0x00004000,&Edit
HKCR,"WSFFile\Shell\Edit\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe %%1"
HKCR,"WSFFile\Shell\Print",,0x00004000,&Print
HKCR,"WSFFile\Shell\Print\Command",,0x00024002,"%%SystemRoot%%\System32\Notepad.exe /p %%1"
HKCR,"WSFFile\ShellEx\PropertySheetHandlers\WSHProps",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,"WSFFile\ShellEx\DropHandler",,0x00004000,{60254CA5-953B-11CF-8C96-00AA00B8708C}
HKCR,scriptletfile,FriendlyTypeName,0x00024002,"@%%SystemRoot%%\System32\scrobj.dll,-8192"

[wDelReg.WSH]
HKLM,"Software\Microsoft\Windows\CurrentVersion\Setup\OC Manager\Subcomponents",wsh_core

