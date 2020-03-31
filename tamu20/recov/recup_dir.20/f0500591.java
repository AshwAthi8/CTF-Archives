; Copyright (c) Microsoft Corporation.  All rights reserved.
;
; Internet Print Protocol OCM INF
;

[version]
signature="$Windows NT$"
ClassGUID={00000000-0000-0000-0000-000000000000}
LayoutFile=layout.inf
DriverVer=10/01/2002,5.2.3790.1830

[Optional Components]
InetPrint

[InetPrint]
OptionDesc              = %InetPrint_Desc%
Tip                     = %InetPrint_Tip%
IconIndex               = 14            ;Windows mini-icon for printers
Parent                  = iis
Needs                   = iis_www,iis_asp
Modes                   = 0,1,2,3


































[Strings]
InetPrint_Desc  = "Internet Printing"
InetPrint_Tip   = "Enable web-based printer management and allow printing to shared printers over HTTP."

