
		else
		{
			eval("document.all." + sub_nav + "_img.src = '" + main_nav + "_" + sub_nav + "_ghost.jpg'");
			eval("document.all.big_img.src= '" + main_nav + "_" + sub_nav + "_big.jpg'");
			eval("document.all." + sub_nav + ".className = 'ghost'");
		}
		
		eval("document.all." + sub_nav + ".removeAttribute('href')");	}
	
	//document.all.best_div.style.visibility="hidden"
	
	parent.footer.footer_setup(main_nav);
}function footer_setup(main_nav)
{
	eval("document.all.bot_nav_" + main_nav + ".className = 'nav_bottom_selected'");		
	eval("document.all.bot_nav_" + main_nav + ".removeAttribute('href')");}