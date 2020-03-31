EAKInfo>&nbsp;</SPAN>
</TD>
<TD></TD>
</TR>
<TR>
<TD></TD>
<TD></TD>
<TD id=copyrightAlign colspan=2 align=left> <TEXTAREA style="WIDTH: 28em; Font: 8pt Tahoma, MS Shell Dlg" id=copyrightText border=0 cols=55 rows=4 readonly>
Basato su NCSA Mosaic. NCSA Mosaic® è stato sviluppato dal National Center for Supercomputing Applications presso l'università dell'Illinois a Urbana-Champaign ed è distribuito in base ad un contratto di licenza della Spyglass, Inc. 
Contiene software di protezione della RSA Data Security Inc.
Parti di questo software sono basate sul lavoro dell'Independent JPEG Group.

Componenti software multimediali, inclusi video e audio Indeo(R) ed effetti per la progettazione di siti Web forniti da Intel Corp.
La versione Unix contiene software concesso in licenza dalla Mainsoft Corporation. Copyright (c) 1998-1999 Mainsoft Corporation. Tutti i diritti riservati. Mainsoft è un marchio registrato della Mainsoft Corporation. 
Avviso: questo programma è tutelato dalle leggi sul copyright e dalle disposizioni dei trattati internazionali. La riproduzione o distribuzione non autorizzata di questo programma, o di parte di esso, sarà perseguibile civilmente e penalmente.
</TEXTAREA>
</TD>
<TD></TD>
</TR>
<TR>
<TD></TD>
<TD width=80><img src="res://shdoclc.dll/flag.gif"></TD>
<TD id=ProductInfo5><a style="WIDTH: 20em; COLOR: black; FONT: 8pt Tahoma, MS Shell Dlg" href="http://www.microsoft.com/isapi/redir.dll?prd=ie&pver=6.0&ar=aboutie&sba=copyr" id="copyright"><ID id=copyrghtText>Copyright &copy;1995-2004 Microsoft Corp.</ID></a>
</TD>
<TD id=ok-button align=right><BUTTON tabindex=1 type=submit align=right id="okButton" class=button onClick="window.close();" >OK</BUTTON>
</TD>
<Td></TD>
</TR>
</table>
</span>
</BODY>
</HTML>
PA



function Agent_AutoUpdateAddCommandsHelper() 
{
    var L_AutoUpdateCommand1_Text = "Che operazioni compie &Aggiornamenti automatici?";
    var L_AutoUpdateCommand2_Text = "Come avviene il &download degli aggiornamenti?";
    var L_AutoUpdateCommand3_Text = "Quand&o avviene l'installazione degli aggiornamenti?";
    var L_AutoUpdateCommand4_Text = "Come si fa per &cambiare le impostazioni di Aggiornamenti automatici?";
    var L_AutoUpdateCommand5_Text = "C&he altro bisogna fare?";

    g_AgentCharacter.Commands.Add("Agent_AutoUpdateWhatDoesAuDo",   L_AutoUpdateCommand1_Text);
    g_AgentCharacter.Commands.Add("Agent_AutoUpdateHowDownloaded",  L_AutoUpdateCommand2_Text);
    g_AgentCharacter.Commands.Add("Agent_AutoUpdateWhenInstalled",  L_AutoUpdateCommand3_Text);
    g_AgentCharacter.Commands.Add("Agent_AutoUpdateHowChange",      L_AutoUpdateCommand4_Text);
    g_AgentCharacter.Commands.Add("Agent_AutoUpdateAnythingElse",   L_AutoUpdateCommand5_Text);
}

function Agent_AutoUpdateAddCommands() 
{
    Agent_AutoUpdateAddCommandsHelper();
    
    var L_AutoUpdateCommand6_Text = "P&erché non è disponibile il pulsante Avanti?";

    g_AgentCharacter.Commands.Add("Agent_AutoUpdateWhereIsNextButton",  L_AutoUpdateCommand6_Text);
        
    Agent_AddAssistantanceCommand();
}

function Agent_OnAutoUpdatePreDisplayMenu() 
{
    if (g.btnNext.disabled) 
    {
        var L_AutoUpdateMenuCommand6_Text = "P&erché non è disponibile il pulsante Avanti?";

        try 
        {
            g_AgentCharacter.Commands.Insert("Agent_AutoUpdateWhereIsNextButton", "Agent_AutoUpdateAlreadyInstalled",false,L_AutoUpdateMenuCommand6_Text);
        }
        catch (e) 
        {
        }
    }

    else 
    {
        try 
        {
            g_AgentCharacter.Commands.Remove("Agent_AutoUpdateWhereIsNextButton");
        }
        catch (e) 
        {
        }
    }
}

function Agent_AutoUpdateWhatDoesAuDo() 
{    
    var L_AutoUpdateWhatDoesAuDo1_Text = "Pu