REM Windows MS-DOS Startup File
REM
REM CONFIG.SYS vs CONFIG.NT
REM CONFIG.SYS is not used to initialize the MS-DOS environment.
REM CONFIG.NT is used to initialize the MS-DOS environment unless a
REM different startup file is specified in an application's PIF.
REM
REM ECHOCONFIG
REM By default, no information is displayed when the MS-DOS environment
REM is initialized. To display CONFIG.NT/AUTOEXEC.NT information, add
REM the command echoconfig to CONFIG.NT or other startup file.
REM
REM NTCMDPROMPT
REM When you return to the command prompt from a TSR or while running an
REM MS-DOS-based application, Windows runs COMMAND.COM. This allows the
REM TSR to remain active. To run CMD.EXE, the Windows command prompt,
REM rather than COMMAND.COM, add the command ntcmdprompt to CONFIG.NT or
REM other startup file.
REM
REM DOSONLY
REM By default, you can start any type of application when running
REM COMMAND.COM. If you start an application other than an MS-DOS-based
REM application, any running TSR may be disrupted. To ensure that only
REM MS-DOS-based applications can be started, add the command dosonly to
REM CONFIG.NT or other startup file.
REM
REM EMM
REM You can use EMM command line to configure EMM(Expanded Memory Manager).
REM The syntax is:
REM
REM EMM = [A=AltRegSets] [B=BaseSegment] [RAM]
REM
REM     AltRegSets
REM         specifies the total Alternative Mapping Register Sets you
REM         want the system to support. 1 <= AltRegSets <= 255. The
REM         default value is 8.
REM     BaseSegment
REM         specifies the starting segment address in the Dos conventional
REM         memory you want the system to allocate for EMM page frames.
REM         The value must be given in Hexdecimal.
REM         0x1000 <= BaseSegment <= 0x4000. The value is rounded down to
REM         16KB boundary. The default value is 0x4000
REM     RAM
REM         specifies that the system should only allocate 64Kb address
REM         space from the Upper Memory Block(UMB) area for EMM page frames
REM         and leave the rests(if available) to be used by DOS to support
REM         loadhigh and devicehigh commands. The system, by default, would
REM         allocate all possible and available UMB for page frames.
REM
REM     The EMM size is determined by pif file(either the one associated
REM     with your application or _default.pif). If the size from PIF file
REM     is zero, EMM will be disabled and the EMM line will be ignored.
REM
dos=high, umb
device=%SystemRoot%\system32\himem.sys
files=40
