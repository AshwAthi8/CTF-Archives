= szID;
span.innerHTML = '<IMG onerror="OnLoadError(this);"/>';
if (true != bNoDimensions)
span.firstChild.className = "PictureSize";
idPictures.appendChild(span);
var szPath = oItem.path;
span.firstChild.src = "file:///" + szPath;
span.firstChild.alt = oItem.name;
if (_szPictureSource && _szPictureSource == szPath.toLowerCase() && span.style.display != 'none')
SelectItem(span);
}
}
function EnumPics(szFolder)
{
var oShell = top.window.GetShell();
if (oShell)
{
var oFolder = oShell.Namespace(szFolder);
if (oFolder)
{
var oFolderItems = oFolder.Items();
if (oFolderItems)
{
var cItems = oFolderItems.count;
for (var i = 0; i < cItems; i++)
AddPictureToList(oFolderItems.Item(i));
}
}
if (_szPictureSource && !_oSelectedItem)
{
AddPictureToList(oShell.Namespace(0).ParseName(top.window.idPicture.src), null, true);
SelectItem(idPictures.lastChild);
}
if (!_oSelectedItem && idPictures.firstChild)
idPictures.firstChild.tabIndex = 0;
}
}
function SetTempPicture(szPath)
{
var szPrevious = null;
if (!_bHaveTemp)
{
AddPictureToList(top.window.GetShell().Namespace(0).ParseName(szPath), "idTempPicture");
_bHaveTemp = true;
}
else
{
idTempPicture.style.display = 'block';
var img = idTempPicture.firstChild;
szPrevious = img.src;
img.src = "file:///" + szPath;
}
if (idTempPicture.style.display == 'none')
{
if (szPrevious)
{
idTempPicture.style.display = 'block';
idTempPicture.firstChild.src = szPrevious;
}
alert(top.window.L_UnknownImageType_ErrorMessage);
}
else
idTempPicture.click();
}
function FindOtherPictures()
{
try
{
var commDialog = new ActiveXObject("UserAccounts.CommonDialog");
commDialog.Flags = 0x02001804;
commDialog.Filter = L_OpenFilesFilter_Text;
commDialog.FilterIndex = 1;
commDialog.Owner = top.window.document.title;
var szPath = top.window.g_szCustomPicturePath;
if (szPath)
commDialog.FileName = szPath;
try
{
commDialog.InitialDir = top.window.GetShell().NameSpace(39).Self.Path;
}
catch (e)
{
commDialog.InitialDir = "";
}
if (commDialog.ShowOpen())
{
szPath = commDialog.FileName;
if (ApplyPictureChange2(szPath))
top.window.g_szCustomPicturePath = szPath;
}
}
catch (error)
{
idBrowse.disabled = 'true';
}
}
function InitCameraLink()
{
var bCamera = false;
try
{
_oWIA = new ActiveXObject("Wia.Script");
bCamera = (_oWIA.Devices.length > 0);
}
catch (e)
{
}
if (bCamera)
{
_szTempFile = top.window.GetWShell().ExpandEnvironmentStrings("%TEMP%\\") + top.window.GetUserDisplayName(top.window.g_oSelectedUser) + ".bmp";
idTakeAPicture.style.display = 'block';
}
else
idTakeAPicture.removeNode(true);
}
function TakeAPicture()
{
try
{
var oItem = _oWIA.Create(null);
if (oItem)
{
var oNewPictures = oItem.GetItemsFromUI(2,1);
if (oNewPictures && oNewPictures.length > 0)
{
oNewPictures.Item(0).Transfer(_szTempFile, false);
SetTempPicture(_szTempFile);
}
}
}
catch (error)
{
var nErr = (error.number & 0xffffff);
if (nErr == 0x210015 || nErr == 0x210005) 
alert(top.window.L_NoCamera_ErrorMessage);
else
throw error;
}
}
function onUnLoad()
{
if (_szTempFile)
{
}
}
