       {text-decoration:underline;}
A:active                {}
/* In classic mode, there is no distinction between Page1 and Page2. Colors are set above. */
.Page1                  {}
.Page2                  {}
.CategoryTitle          {height:3em; padding:'0 1em'; font-family:Tahoma; font-size:8pt; font-weight:bold; font-style:normal; color:highlighttext; background-color:activecaption; filter:progid:DXImageTransform.Microsoft.Gradient(GradientType=1,StartColorStr='#80808080',EndColorStr='window');}
/* Left pane */
.SecondaryPane          {width:200px; font-family:Tahoma; font-size:8pt; font-weight:normal; font-style:normal; color:windowtext; background-color:window; display:expression( (document.body.clientWidth > 400) ? 'block' : 'none' );}
.SecondaryPane TABLE    {color:windowtext;}
/* Used for Related Tasks and Learn About in the left pane */
.LearnAboutBox          {border:'1px solid buttonface'; background-color:window; margin-bottom:1em;}
.LearnAboutCaption      {height:2em; padding:'0.3em 1em'; font-family:Tahoma; font-size:8pt; font-weight:bold; font-style:normal; color:buttontext; background-color:buttonface; border-bottom:'1px solid buttonface';}
.LearnAboutBody         {padding:'1mm 2mm'; font-family:Tahoma; font-size:8pt; font-weight:normal; font-style:normal; background-color:window;}
/* Bullets for lists of links on the "Pick a task" and "What do you want to do?" pages */
UL.TaskList             {list-style-type:disc; color:activecaption;}
