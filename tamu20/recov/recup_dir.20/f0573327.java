se
    {
        g.NextBtnLocalText.style.display = "inline";
        g.btnNext.style.display = "inline";
    }

    
    
    g.tabl3.style.width="105%"    

    
    
    
    if (g_AU_radiosticky == null)
        g.btnNext.disabled = true;
    else if (g_AU_radiosticky == 1)
        g.radioAgree.checked = true;
    else
        g.radioDisAgree.checked = true;

    InitNewButtons();
    g.btnNext.onclick = AUNextBtnHandler;

    if (APP_UPDATE_MODE == window.external.Directions.get_AppMode())
    {
        g.BackBtnLocalText.style.display = "none";
        g.btnBack.style.display = "none";
        g_FirstFocusElement = g.au_privacy_policy_link;
        g_FirstFocusElement.focus();
        g.AutoUpdateIntro.innerText = L_IntroUpdate_Text;
    }
    else
    {
        g_FirstFocusElement = g.btnBack;
        g_FirstFocusElement.focus();
        g.AutoUpdateIntro.innerText = L_IntroSlipstream_Text;
    }

    try
    {
        g.document.body.onkeydown = AUOnKeyDown;
    }
    catch(e)
    {
    }
}

function AUNextBtnHandler()
{
    StoreAU();
    GoNext();
}

function AUOnKeyDown()
{

    if (KeyEsc == g.event.keyCode)
    {
        g.event.returnValue = false;
        g.event.keyCode = 0;
    }

    OnKeyDown();
}

function AURadioClicked()
{
    
    if(g.btnNext.disabled && (g.radioAgree.checked || g.radioDisAgree.checked))
    {
        g.btnNext.onmouseover = HandleNextButtonMouseOver;
        g.btnNext.onmouseout  = HandleNextButtonMouseOut;
        g.btnNext.onmousedown = HandleNextButtonMouseDown;
        g.btnNext.className="newbuttonsNext";
        g.btnNext.disabled = false;
        g.btnNext.onclick = AUNextBtnHandler;
        g.btnNext.focus();
    }

    if (g.radioAgree.checked)
    {
        g_AU_radiosticky=1;
    }
    else
    {
        g_AU_radiosticky=2;
    }
}

function StoreAU()
{
    AutoUpdateObj.set_Acceptance = g.radioAgree.checked;
}



function navigatetoPrivacy(PrivPage)
{
    if(g_CurrentCKPT == CKPT_REGISTER1) {
        Reg1SaveRadioState();
    }

    if(g_CurrentCKPT == CKPT_REGISTER3) {
        Reg3SaveSettings();
    }

    if (PrivPage == "MS")
        Navigate("setup\\prvcyMS.htm");
    else if (PrivPage == "Activation_Policy")
        Navigate("setup\\act_plcy.htm");
    else if (PrivPage == "AutoUpdate_Policy")
        Navigate("setup\\au_plcy.htm");
    else
        Navigate("setup\\OEMpriv.htm");
}
P<HTML id=dlgOrganizeFavorites STYLE="font-family: 