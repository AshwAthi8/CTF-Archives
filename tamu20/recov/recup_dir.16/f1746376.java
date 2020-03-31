nsicEvent
{
};

/////////////////////////////////////////////////////////////////////////////
//
// ESS Classes

class MSFT_WmiEssEvent : MSFT_WmiSelfEvent
{
};

/////////////////////////////////////////////////////////////////////////////
// New notification sink registered because of new query

class MSFT_WmiRegisterNotificationSink : MSFT_WmiEssEvent
{
    string Namespace;
    string QueryLanguage;
    string Query;
    uint64 Sink;
};

/////////////////////////////////////////////////////////////////////////////
// Notification sink removed

class MSFT_WmiCancelNotificationSink : MSFT_WmiEssEvent
{
    string Namespace;
    string QueryLanguage;
    string Query;
    uint64 Sink;
};


/////////////////////////////////////////////////////////////////////////////
// Provider base event

class MSFT_WmiProviderEvent : MSFT_WmiEssEvent
{
    string Namespace;
    string ProviderName;
};

/////////////////////////////////////////////////////////////////////////////
// Consumer provider events

class MSFT_WmiConsumerProviderEvent : MSFT_WmiProviderEvent
{
    string Machine;
};

class MSFT_WmiConsumerProviderLoaded : MSFT_WmiConsumerProviderEvent
{
};

class MSFT_WmiConsumerProviderUnloaded : MSFT_WmiConsumerProviderEvent
{
};

class MSFT_WmiConsumerProviderSinkLoaded : MSFT_WmiConsumerProviderEvent
{
    __EventConsumer ref Consumer;
};

class MSFT_WmiConsumerProviderSinkUnloaded : MSFT_WmiConsumerProviderEvent
{
    __EventConsumer ref Consumer;
};


/////////////////////////////////////////////////////////////////////////////
// Thread pool events

class MSFT_WmiThreadPoolEvent : MSFT_WmiEssEvent
{
    uint32 ThreadId;
};

class MSFT_WmiThreadPoolThreadCreated : MSFT_WmiThreadPoolEvent
{
};

class MSFT_WmiThreadPoolThreadDeleted : MSFT_WmiThreadPoolEvent
{
};


/////////////////////////////////////////////////////////////////////////////
// Filter events

class MSFT_WmiFilterEvent : MSFT_WmiEssEvent
{
    string Namespace;
    string Name;
    string QueryLanguage;
    string Query;
};

class MSFT_WmiFilterActivated : MSFT_WmiFilterEvent
{
};

class MSFT_WmiFilterDeactivated : MSFT_WmiFilterEvent
{
};


/////////////////////////////////////////////////////////////////////////////
//
// WMI Event Provider registration.

#pragma DeleteInstance("MSFT_WMI_NonCOMEventProvider.Name=\"WMI Self-Instrumentation Event Provider\"", NOFAIL)

instance of __Win32Provider as $P1
{
    Name = "WMI Self-Instrumentation Event Provider";
    HostingModel = "Decoupled:NonCOM";
};

instance of __EventProviderRegistration
{
    Provider = $P1;

    EventQueryList =
    {
        "select * from MSFT_WmiEssEvent"
    };
};


/////////////////////////////////////////////////////////////////////////////
//
//  Core classes & events

class MSFT_WmiCoreEvent : MSFT_WmiSelfEvent
{
};

class MSFT_WmiCoreLogonEvent : MSFT_WmiCoreEvent
{
    [subtype("SID")]
    uint32 UserSid[];
    string Namespace;
};

class MSFT_WmiCoreLogoffEvent : MSFT_WmiCoreEvent
{
    [subtype("SID")]
    uint32 UserSid[];
    string Namespace;
};

class MSFT_WmiCoreTaskFailure : MSFT_WmiCoreEvent
{
    uint64 TaskID;
    [subtype("SID")]
    uint32 UserSid[];
    string Namespace;
    string Request;
    uint32 HRESULT;
    string Comment;
};

class MSFT_WmiCoreObject
{
};

class MSFT_WmiCoreUser : MSFT_WmiCoreObject
{
    [subtype("SID")]
    uint32 UserSid[];
    datetime TimeOfLastRequest;
};

[singleton]
class MSFT_WmiCoreStatus : MSFT_WmiCoreObject
{
    uint32 Users;                               // absolute
    uint32 Connections;                         // absolute
    uint32 Tasks;                               // absolute
    uint32 TasksExecuted;                       // increment-only
    uint32 DeliveryBacklogBytes;                // absolute
    uint32 TotalApiCallsMade;                   // increment-only
    uint32 InternalObjectCount;                 // absolute
    uint32 InternalSinkCount;                   // absolute
};


/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

instance of __Win32Provider as $PInstance
{
	Name = "Msft_ProviderSubSystem";
	Clsid = "{7F598975-37E0-4a67-A992-116680F0CEDA}";

	HostingModel = "WmiCore" ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

instance of __MethodProviderRegistration
{
    Provider = $PInstance;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

instance of __InstanceProviderRegistration
{
    Provider = $PInstance;
    SupportsGet = TRUE;
    SupportsPut = TRUE;
    SupportsDelete = TRUE;
    SupportsEnumeration = TRUE;

    QuerySupportLevels = { "WQL:UnarySelect" } ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

#pragma DeleteInstance("MSFT_WMI_NonCOMEventProvider.Name=\"ProviderSubSystem\"", NOFAIL)

instance of __Win32Provider as $P
{
    Name = "ProviderSubSystem";
    HostingModel = "Decoupled:NonCOM";
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description (
		"The Msft_WmiProvider_OperationEvent event class is the root definition of all WMI provider events."
		"A provider operation is defined as some execution on behalf of a client via WMI that results"
		"in one or more calls to a provider executable, "
		"The properties of this class define the identity of the provider associated with the operation being executed "
		"and is uniquely associated with instances of the class Msft_Providers. Each instance of __Win32Provider can have "
		"an associated operation and be identified using the properties below. Internally WMI can contain "
		"any number of objects that refer to a particular instance of __Win32Provider since it differentiates each object "
		"based on whether the provider supports per user or per locale instantiation and also "
		"depending on where the provider is being hosted. Currently TransactionIdentifier is always an empty string. "
	)
]
class Msft_WmiProvider_OperationEvent :  MSFT_WmiSelfEvent 
{
	[Description ( "The Namespace property indicates the namespace where instance of __Win32Provider is instantiated." )] 
	String Namespace ;

	[Description ( "The Provider property indicates the Unique Name associated with the instance of __Win32Provider." )] 
	String Provider ;

	[Description ( "If the provider registration specifies per user initialization, "
					"then the User property defines the client principle identity associated with "
					"specific instantiation of a provider." )] 
	String User ;

	[Description ( "If the provider registration specifies per locale initialization, "
					"then the Locale property defines the client locale associated with "
					"specific instantiation of a provider." )] 
	String Locale ;

	[Description ( "The TransactionIdentifer property is for internal use, currently always empty." )] 
	String TransactionIdentifer ;

	[Description ( "The HostingSpecification property currently is not used." )] 
	Uint32 HostingSpecification ;

	[Description ( "The HostingGroup property currently is not used." )] 
	String HostingGroup ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_OperationEvent_Pre event class contains the "
		"operation event generated prior to calling provider implementation.")
]
class Msft_WmiProvider_OperationEvent_Pre :  Msft_WmiProvider_OperationEvent
{ 
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_OperationEvent_Post event class contains the "
		"operation event generated following completion of provider implementation.")
]
class Msft_WmiProvider_OperationEvent_Post :  Msft_WmiProvider_OperationEvent
{
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ComServerLoadOperationEvent event class "
	"defines the successful activation of a com server instance"
	"associated with the provider registration.")
]
class Msft_WmiProvider_ComServerLoadOperationEvent :  Msft_WmiProvider_OperationEvent
{
	[Description ( "The Clsid property, if applicable, defines the COM CLSID associated with server implementation. "
					"Note: decoupled providers do not have an associated COM CLSID." )] 
	String Clsid ;

	[Description ( "The ServerName property, if applicable, defines the COM server name present within "
					"the unnamed value of the CLSID key." )] 
	String ServerName ;

	[Description ( "The InProcServer property, if applicable, defines whether the server supports inproc32 activation." )] 
	boolean InProcServer ;

	[Description ( "The LocalServer property, if applicable, defines whether the server supports localserver32 activation." )] 
	boolean LocalServer ;

	[Description ( "The InProcServerPath property, if applicable, defines the server inproc32 executable  name." )] 
	String InProcServerPath ;

	[Description ( "The LocalServerPath property, if applicable, defines the server localserver32 executable application name." )] 
	String LocalServerPath ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ComServerLoadOperationFailureEvent event class "
		"defines the unsuccessful activation of a com server instance"
		"associated with the provider registration.")
]
class Msft_WmiProvider_ComServerLoadOperationFailureEvent :  Msft_WmiProvider_OperationEvent
{
	[Description ( "The Clsid property, if applicable, defines the COM CLSID associated with server implementation. "
					"Note:  decoupled providers do not have an associated COM CLSID." )] 
	String Clsid ;

	[Description ( "The ServerName property, if applicable, defines the COM server name present within "
					"the unnamed value of the CLSID key." )] 
	String ServerName ;

	[Description ( "The InProcServer property, if applicable, defines whether the server supports inproc32 activation." )] 
	boolean InProcServer ;

	[Description ( "The LocalServer property, if applicable, defines whether the server supports localserver32 activation." )] 
	boolean LocalServer ;

	[Description ( "The InProcServerPath property, if applicable, defines the server inproc32 executable  name." )] 
	String InProcServerPath ;

	[Description ( "The LocalServerPath property, if applicable, defines the server localserver32 executable application name." )] 
	String LocalServerPath ;

	[Description ( "The ResultCode property, if applicable, defines the result code returned from the COM activation procedure." )] 
	uint32 ResultCode ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_LoadOperationEvent event class defines the successful "
					"activation and initialization of the provider cache entry. "
					"WMI caches provider registration objects to decrease overall"
					"execution time. The substem will drop cache entries either through the cache "
					"ageing process, through loss of RPC connectivity, through user control or due "
					"to some change in the provider's registration.")
]
class Msft_WmiProvider_LoadOperationEvent :  Msft_WmiProvider_OperationEvent
{
	[Description ( "The Clsid property, if applicable, defines the COM CLSID associated with server implementation. "
					"Note: decoupled providers do not have an associated COM CLSID." )] 
	String Clsid ;

	[Description ( "The ServerName property, if applicable, defines the COM server name present within "
					"the unnamed value of the CLSID key." )] 
	String ServerName ;

	[Description ( "The InProcServer property, if applicable, defines whether the server supports inproc32 activation." )] 
	boolean InProcServer ;

	[Description ( "The LocalServer property, if applicable, defines whether the server supports localserver32 activation." )] 
	boolean LocalServer ;

	[Description ( "The InProcServerPath property, if applicable, defines the server inproc32 executable  name." )] 
	String InProcServerPath ;

	[Description ( "The LocalServerPath property, if applicable, defines the server localserver32 executable application name." )] 
	String LocalServerPath ;

	[Description ( "The ThreadingModel property, if applicable, defines the server "
	"threading model, can take one of the following values: \n"
		"0 - Apartment \n "
		"1 - Both \n "
		"2 - Free \n "
		"3 - Neutral \n "
		"4 - Unknown"),
		Values {"Apartment","Both", "Neutral","Unknown"},
		ValueMap{"0", "1", "2", "3", "4"}] 
	uint32 ThreadingModel ;

	[Description ( "The Synchronisation property, if applicable, defines the server "
	"synchronisation model, can take on one of the following values: \n"
		"0 - Ignored \n "
		"1 - None \n "
		"2 - Supported \n "
		"3 - Required \n "
		"4 - RequiresNew \n "
		"5 - Unknown"),
		Values {"Ignored","None", "Supported","Required","RequiresNew", "Unknown"},
		ValueMap{"0", "1", "2", "3", "4", "5"}] 
	uint32 Synchronisation ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("WMI caches provider registration objects to decrease overall"
					"execution time. The substem will drop cache entries either through the cache "
					"ageing process, through loss of RPC connectivity, through user control or due "
					"to some change in the provider's registration. This event defines the unsuccessful "
					"activation and initialization of the provider cache entry.")
]
class Msft_WmiProvider_LoadOperationFailureEvent :  Msft_WmiProvider_OperationEvent
{
	[Description ( "If applicable, defines the COM CLSID associated with server implementation. "
					"Note: decoupled providers do not have an associated COM CLSID." )] 
	String Clsid ;

	[Description ( "If applicable, defines the COM server name present within "
					"the unnamed value of the CLSID key." )] 
	String ServerName ;

	[Description ( "If applicable, defines whether the server supports inproc32 activation." )] 
	boolean InProcServer ;

	[Description ( "If applicable, defines whether the server supports localserver32 activation." )] 
	boolean LocalServer ;

	[Description ( "If applicable, defines the server inproc32 executable  name." )] 
	String InProcServerPath ;

	[Description ( "If applicable, defines the server localserver32 executable application name." )] 
	String LocalServerPath ;

	[Description ( "The ThreadingModel property, if applicable, defines the server "
	"threading model, can take one of the following values: \n"
		"0 - Apartment \n "
		"1 - Both \n "
		"2 - Free \n "
		"3 - Neutral \n "
		"4 - Unknown"),
		Values {"Apartment","Both", "Neutral","Unknown"},
		ValueMap {"0", "1", "2", "3", "4"}]
	uint32 ThreadingModel ;

	[Description ( "The Synchronisation property, if applicable, defines the server "
	"synchronisation model, can take on one of the following values: \n"
		"0 - Ignored \n "
		"1 - None \n "
		"2 - Supported \n "
		"3 - Required \n "
		"4 - RequiresNew \n "
		"5 - Unknown"),
		Values {"Ignored","None", "Supported","Required","RequiresNew", "Unknown"},
		ValueMap{"0", "1", "2", "3", "4", "5"}] 
	uint32 Synchronisation ;

	[Description ( "The ResultCode property reveals the HRESULT code returned from the loading process." )] 
	uint32 ResultCode ;

} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_InitializationOperationEvent event class "
					"defines the successful initialization "
					"of the provider server instance. Following activation of the provider server, the WMI will "
					"attempt to initialize the instance provider through a number of COM interface "
					"method calls. ")
]
class Msft_WmiProvider_InitializationOperationEvent :  Msft_WmiProvider_OperationEvent
{
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_InitializationOperationFailureEvent event "
	"				class defines the unsuccessful initialization "
					"of the provider server instance.  Following activation of the provider server, the WMI will"
					"attempt to initialize the instance provider through a number of COM interface "
					"method calls. This event defines the unsuccessful initialization "
					"of the provider server instance.")
]
class Msft_WmiProvider_InitializationOperationFailureEvent :  Msft_WmiProvider_OperationEvent
{
	[Description ( "The ResultCode property reveals the HRESULT code returned from the initialization process." )] 
	uint32 ResultCode ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_UnLoadOperationEvent event class defines "
					"the removal of the provider cache entry. At this point there will be no reference held by WMI on"
					"the COM server instance.  WMI caches provider registration objects to decrease overall"
					"execution time. The substem will drop cache entries either through the cache "
					"ageing process, through loss of RPC connectivity, through user control or due "
					"to some change in the provider's registration.")
]
class Msft_WmiProvider_UnLoadOperationEvent :  Msft_WmiProvider_OperationEvent
{
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_GetObjectAsyncEvent_Pre event class represents "
			"an event generated immediately prior to calling the provider's implementation of IWbemServices :: GetObjectAsync. ")
]
class Msft_WmiProvider_GetObjectAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The ObjecPath property holds the path of the object to retrieve." )] 
	String ObjectPath ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
    Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/
    
[
	Description ("The Msft_WmiProvider_PutClassAsyncEvent_Pre event class represents "
			"an event generated immediately prior to calling the provider's implementation of IWbemServices :: PutClassAsync.")
]
class Msft_WmiProvider_PutClassAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre 
{
	[Description ( "The ClassObject property holds the object containing the class definition." )] 
    Object ClassObject ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
    Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_DeleteClassAsyncEvent_Pre event class represents "
			"an event generated immediately prior to calling the provider's implementation of IWbemServices :: DeleteClassAsync.")
]
class Msft_WmiProvider_DeleteClassAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The ClassName property hold the name of the class targeted for deletion." )] 
    String ClassName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
    Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_CreateClassEnumAsyncEvent_Pre event class represents "
			"an event generated immediately prior to calling the provider's implementation of "
			"IWbemServices :: CreateClassEnumAsync.")
]
class Msft_WmiProvider_CreateClassEnumAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The SuperclassName property, if not NULL or blank, "
					"specifies a superclass name. Only classes that "
					"are subclasses of this class are returned"
					"If NULL or blank, and Flags contains WBEM_FLAG_SHALLOW,"
					"only top-level classes, that is, those which have no"
					"parent class or superclass, are returned. If it is"
					"NULL or blank and Flags is WBEM_FLAG_DEEP, all classes "
					"within the namespace are returned." )] 
	String SuperclassName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_PutInstanceAsyncEvent_Pre event class represents "
			"an event generated immediately prior to calling the provider's "
			"implementation of IWbemServices :: PutInstanceAsync.")
]
class Msft_WmiProvider_PutInstanceAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The InstanceObject property contains the object instance to be written." )] 
	Object InstanceObject ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_DeleteInstanceAsyncEvent_Pre event class "
			"represents an event generated immediately prior to calling the "
			"provider's implementation of IWbemServices :: DeleteInstanceAsync.")
]
class Msft_WmiProvider_DeleteInstanceAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre 
{
	[Description ( "The ObjectPath property is a string containing the path of instance to be deleted." )] 
	String ObjectPath ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_CreateInstanceEnumAsyncEvent_Pre event class "
			"represents an event generated immediately prior to calling the "
			"provider's implementation of IWbemServices :: CreateInstanceEnumAsync.")
]
class Msft_WmiProvider_CreateInstanceEnumAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The ClassName property is a string containing the name of "
			"the class for which instances are desired." )] 
	String ClassName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ExecQueryAsyncEvent_Pre class represents "
			"an event generated immediately prior to calling the provider's "
			"implementation of IWbemServices :: ExecQueryAsync.")
]
class Msft_WmiProvider_ExecQueryAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The QueryLanguage property is a string containing one of the query "
			"languages supported by Windows Management." )] 
	String QueryLanguage ;

	[Description ( "The Query property is a string containing the text of the query." )] 
	String Query ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ExecMethodAsyncEvent_Pre event class represents "
			"an event generated immediately prior to calling the provider's implementation "
			"of IWbemServices :: ExecMethodAsync.")
]
class Msft_WmiProvider_ExecMethodAsyncEvent_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The ObjectPath property is a string containing the object path of "
			"the object for which the method is to be executed." )] 
	String ObjectPath ;

	[Description ( "The MethodName is a string container the name of the method for "
			"the object." )] 
	String MethodName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The InputParameters property is Null, if no inbound parameters "
			"are required to execute the method. Otherwise, an object that contains "
			"the properties acting as inbound parameters for the method execution. "
			"The contents of the object are method-specific, and are part of the "
			"specification for the provider in question." )] 
	Object InputParameters ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_NewQuery_Pre event class represents an event "
			"generated immediately prior to calling the provider's implementation of "
			"IWbemEventProviderQuerySink :: NewQuery.")
]
class Msft_WmiProvider_NewQuery_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The QueryId property holds the Windows Management-generated identifier for the query. "
						"The provider can track this so that during a later "
						"cancellation it will know which query was canceled." )] 
    uint32 QueryId ;

	[Description ( "The QueryLanguage property contains the language of the "
						"following query filter. For this version "
						"of WMI, it will always be 'WQL'." )] 
    string QueryLanguage ;

	[Description ( "The Query property is a string containing the event query "
						"filter, which was registered by a logical consumer." )] 
    string Query ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_CancelQuery_Pre event class represents an event "
			"generated immediately prior to calling the provider's implementation of "
			"IWbemEventProviderQuerySink :: CancelQuery.")
]
class Msft_WmiProvider_CancelQuery_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The QueryId property holds the Identifier of the query which was canceled. This identifier "
						"was originally delivered to the provider by the NewQuery "
						"method of this interface." )] 
    uint32 QueryId ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_AccessCheck_Pre event class represents an event "
			"generated immediately prior to calling the provider's implementation of "
			"IWbemEventSecurity :: AccessCheck.")
]
class Msft_WmiProvider_AccessCheck_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The QueryLanguage property contains the language of the "
			"following query filter. For this version of WMI, it will always be 'WQL'." )] 
    string QueryLanguage ;

	[Description ( "The Query property is a string containing the event query filter, "
			"which was registered by a logical consumer." )] 
    string Query ;

	[Description ( "The Sid property holds a Byte Array representing the SID of the "
			"client creating the subscription, NULL if subscription is temporary." )] 
    uint8 Sid [] ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ProvideEvents_Pre event class represents an event "
			"generated immediately prior to calling the provider's implementation of "
			"IWbemEventProvider :: ProvideEvents.")
]
class Msft_WmiProvider_ProvideEvents_Pre : Msft_WmiProvider_OperationEvent_Pre
{
	[Description ( "The Flags property contains the flags associated with the call." )] 
    uint32 Flags ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_GetObjectAsyncEvent_Post event class "
			"representes an event generated immediately following completion of "
			"the provider's implementation of IWbemServices :: GetObjectAsync. ")
]
class Msft_WmiProvider_GetObjectAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The ObjectPath property hold the path of the object to retrieve." )] 
	String ObjectPath ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
    Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the object defining the extended "
			"status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/
    
[
	Description ("The Msft_WmiProvider_PutClassAsyncEvent_Post event class "
			"represents an event generated immediately following completion of "
			"the provider's implementation of IWbemServices :: PutClassAsync.")
]
class Msft_WmiProvider_PutClassAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The ClassObject property holds the object containing the class definition." )] 
    Object ClassObject ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
    Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the object defining the extended "
			"status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("Msft_WmiProvider_DeleteClassAsyncEvent_Post event class represents an event "
			"generated immediately following completion of the provider's implementation of "
			"IWbemServices :: DeleteClassAsync.")
]
class Msft_WmiProvider_DeleteClassAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The ClassName property holds the name of the class targeted for deletion." )] 
    String ClassName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
    Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_CreateClassEnumAsyncEvent_Post event class "
			"represents an event generated immediately following completion of the "
			"provider's implementation of IWbemServices :: CreateClassEnumAsync.")
]
class Msft_WmiProvider_CreateClassEnumAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The SuperclassName property, if not NULL or blank, this parameter "
					"specifies a superclass name. Only classes that "
					"are subclasses of this class are returned"
					"If NULL or blank, and Flags contains WBEM_FLAG_SHALLOW,"
					"only top-level classes, that is, those which have no"
					"parent class or superclass, are returned. If it is"
					"NULL or blank and Flags is WBEM_FLAG_DEEP, all classes "
					"within the namespace are returned." )] 
	String SuperclassName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_PutInstanceAsyncEvent_Post event class "
			"represents an event generated immediately following completion of "
			"the provider's implementation of IWbemServices :: PutInstanceAsync.")
]
class Msft_WmiProvider_PutInstanceAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The InstanceObject property holds the object instance to be written." )] 
	Object InstanceObject ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property, for create operations, string containing "
					"the path of the instance created during the call."
					"The provider can pass the StringParameter to IWbemObjectSink :: SetStatus "
					"indicating the key of the instance just created." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_DeleteInstanceAsyncEvent_Post event class "
			"represents an event generated immediately following completion of the "
			"provider's implementation of IWbemServices :: DeleteInstanceAsync.")
]
class Msft_WmiProvider_DeleteInstanceAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The ObjectPath property holds a string containing path of instance to be deleted." )] 
	String ObjectPath ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_CreateInstanceEnumAsyncEvent_Post event "
	"class represents an event generated immediately following completion of the "
	"provider's implementation of IWbemServices :: CreateInstanceEnumAsync.")
]
class Msft_WmiProvider_CreateInstanceEnumAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "String containing the name of the class for which instances are desired." )] 
	String ClassName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ExecQueryAsyncEvent_Post event class "
			"represents an event generated immediately following completion of "
			"the provider's implementation of IWbemServices :: ExecQueryAsync.")
]
class Msft_WmiProvider_ExecQueryAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The QueryLanguage property holds a string containing one of "
			"the query languages supported by Windows Management." )] 
	String QueryLanguage ;

	[Description ( "The Query property holds a string containing the text of the query." )] 
	String Query ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ExecMethodAsyncEvent_Post event class "
			"represents an event generated immediately following completion of "
			"the provider's implementation of IWbemServices :: ExecMethodAsync.")
]
class Msft_WmiProvider_ExecMethodAsyncEvent_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The ObjectPath property holds a string containing the object path "
			"of the object for which the method is to be executed." )] 
	String ObjectPath ;

	[Description ( "The MethodName property holds a string container the name of the method for the object." )] 
	String MethodName ;

	[Description ( "The Flags property contains the flags associated with the call." )] 
	Uint32 Flags ;

	[Description ( "The InputParameters property is Null, if no inbound parameters are required to execute the method. Otherwise, an "
						"object that contains the properties acting as inbound parameters for "
						"the method execution. The contents of the object are method-specific, and "
						"are part of the specification for the provider in question." )] 
	Object InputParameters ;

	[Description ( "The ResultCode property holds the HRESULT Status code of operation." )] 
	Uint32 ResultCode ;

	[Description ( "The ObjectParameter property holds the o defining the extended status passed though provider's IWbemObjectSink :: SetStatus call, possibly NULL." )] 
	Object ObjectParameter ;

	[Description ( "The StringParameter property is currently always NULL." )] 
	String StringParameter ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_NewQuery_Post event class represents an "
			"event generated immediately following completion of the provider's "
			"implementation of IWbemEventProviderQuerySink :: NewQuery.")
]
class Msft_WmiProvider_NewQuery_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The QueryId property holds a Windows Management-generated identifier for the query. "
						"The provider can track this so that during a later "
						"cancellation it will know which query was canceled." )] 
    uint32 QueryId ;

	[Description ( "The QueryLanguage property hold the language of the following query filter. For this version "
						"of WMI, it will always be 'WQL'." )] 
    string QueryLanguage ;

	[Description ( "The Query property holds a string containing the event query filter, which was registered by a logical consumer." )] 
    string Query ;

	[Description ( "The Result property holds the HRESULT Status code of operation." )] 
    uint32 Result ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_CancelQuery_Post event class represents an "
			"event generated immediately following completion of the provider's "
			"implementation of IWbemEventProviderQuerySink :: CancelQuery.")
]
class Msft_WmiProvider_CancelQuery_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The QueryId property holds an identifier of the query which was canceled. This identifier "
						"was originally delivered to the provider by the NewQuery "
						"method of this interface." )] 
    uint32 QueryId ;

	[Description ( "The Result property holds the HRESULT Status code of operation." )] 
    uint32 Result ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_AccessCheck_Post event class represents "
			"an event generated immediately following completion of the provider's "
			"implementation of IWbemEventSecurity :: AccessCheck.")
]
class Msft_WmiProvider_AccessCheck_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The QueryLanguage property holds the language of the following "
			"query filter. For this version of WMI, it will always be 'WQL'." )] 
    string QueryLanguage ;

	[Description ( "The Query property is a string containing the event query filter, "
			"which was registered by a logical consumer." )] 
    string Query ;

	[Description ( "The Sid property is a Byte Array representing the SID of the "
			"client creating the subscription, NULL if subscription is temporary." )] 
    uint8  Sid [] ;

	[Description ( "The Result property holds the HRESULT Status code of operation." )] 
    uint32 Result ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Description ("The Msft_WmiProvider_ProvideEvents_Post event class represents "
			"an event generated immediately following completion of the provider's "
			"implementation of IWbemEventProvider :: ProvideEvents.")
]
class Msft_WmiProvider_ProvideEvents_Post : Msft_WmiProvider_OperationEvent_Post
{
	[Description ( "The Flags property contains the flags associated with the call." )] 
    uint32 Flags ;

	[Description ( "The Result property holds the HRESULT Status code of operation." )] 
    uint32 Result ;
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

instance of __EventProviderRegistration
{
	Provider = $P;
	EventQueryList  = {"select * from Msft_WmiProvider_OperationEvent"};
};

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[
	Dynamic,Provider ("Msft_ProviderSubSystem"),
	Singleton ,
	Description ("ThMsft_WmiProvider_Counters class exposes approximate internal "
		"operation call count information accross all providers.")
]
class Msft_WmiProvider_Counters
{
	[Description ( "The ProviderOperation_GetObjectAsync property indicates the number of calls to IWbemServices :: GetObjectAsync." )] 
	Uint64 ProviderOperation_GetObjectAsync ;

	[Description ( "The ProviderOperation_PutClassAsync property indicates the number of calls to IWbemServices :: PutClassAsync." )] 
	Uint64 ProviderOperation_PutClassAsync ;

	[Description ( "The ProviderOperation_DeleteClassAsync property indicates the number of calls to IWbemServices :: DeleteClassAsync." )] 
	Uint64 ProviderOperation_DeleteClassAsync ;

	[Description ( "The ProviderOperation_CreateClassEnumAsync property indicates the number of calls to IWbemServices :: CreateClassEnumAsync." )] 
	Uint64 ProviderOperation_CreateClassEnumAsync ;

	[Description ( "The ProviderOperation_PutInstanceAsync property indicates the number of calls to IWbemServices :: PutInstanceAsync." )] 
	Uint64 ProviderOperation_PutInstanceAsync ;

	[Description ( "The ProviderOperation_DeleteInstanceAsync property indicates the number of calls to IWbemServices :: DeleteInstanceAsync." )] 
	Uint64 ProviderOperation_DeleteInstanceAsync ;

	[Description ( "The ProviderOperation_CreateInstanceEnumAsync property indicates the number of calls to IWbemServices :: CreateInstanceEnumAsync." )] 
	Uint64 ProviderOperation_CreateInstanceEnumAsync ;

	[Description ( "The ProviderOperation_ExecQueryAsync property indicates the number of calls to IWbemServices :: ExecQueryAsync." )] 
	Uint64 ProviderOperation_ExecQueryAsync ;

	[Description ( "The ProviderOperation_ExecMethodAsync property indicates the number of calls to IWbemServices :: ExecMethodAsync." )] 
	Uint64 ProviderOperation_ExecMethodAsync ;

	[Description ( "The ProviderOperation_QueryInstances property indicates the number of calls to IWbemHiPerfProvider :: QueryInstances." )] 
	Uint64 ProviderOperation_QueryInstances ;

	[Description ( "The ProviderOperation_CreateRefresher property indicates the number of calls to IWbemHiPerfProvider :: CreateRefresher." )] 
	Uint64 ProviderOperation_CreateRefresher ;

	[Description ( "The ProviderOperation_CreateRefreshableObject property indicates the number of calls to IWbemHiPerfProvider :: CreateRefreshableObject." )] 
	Uint64 ProviderOperation_CreateRefreshableObject ;

	[Description ( "The ProviderOperation_StopRefreshing property indicates the number of calls to IWbemHiPerfProvider :: StopRefreshing." )] 
	Uint64 ProviderOperation_StopRefreshing ;

	[Description ( "The ProviderOperation_CreateRefreshableEnum property indicates the number of calls to IWbemHiPerfProvider :: CreateRefreshableEnum." )] 
	Uint64 ProviderOperation_CreateRefreshableEnum ;

	[Description ( "The ProviderOperation_GetObjects property indicates the number of calls to IWbemHiPerfProvider :: GetObjects." )] 
	Uint64 ProviderOperation_GetObjects ;

	[Description ( "The ProviderOperation_GetProperty property indicates the number of calls to IWbemPropertyProvider :: GetProperty." )] 
	Uint64 ProviderOperation_GetProperty ;

	[Description ( "The ProviderOperation_PutProperty property indicates the number of calls to IWbemPropertyProvider :: PutProperty." )] 
	Uint64 ProviderOperation_PutProperty ;

	[Description ( "The ProviderOperation_ProvideEvents property indicates the number of calls to IWbemEventProvider :: ProvideEvents." )] 
	Uint64 ProviderOperation_ProvideEvents ;

	[Description ( "The ProviderOperation_NewQuery property indicates the number of calls to IWbemEventProviderQuerySink :: NewQuery." )] 
	Uint64 ProviderOperation_NewQuery ;

	[Description ( "The ProviderOperation_CancelQuery property indicates the number of calls to IWbemEventProviderQuerySink :: CancelQuery." )] 
	Uint64 ProviderOperation_CancelQuery ;

	[Description ( "The ProviderOperation_AccessCheck property indicates the number of calls to IWbemEventProviderSecurity :: AccessCheck." )] 
	Uint64 ProviderOperation_AccessCheck ;

	[Description ( "The ProviderOperation_SetRegistrationObject ProviderOperation_SetRegistrationObject property is currently not set." )] 
	Uint64 ProviderOperation_SetRegistrationObject ;

	[Description ( "The ProviderOperation_FindConsumer property indicates the number of calls to IWbemEventConsumerProvider :: FindConsumer." )] 
	Uint64 ProviderOperation_FindConsumer ;

	[Description ( "The ProviderOperation_ValidateSubscription property indicates the number of calls to IWbemEventConsumerProviderEx :: ValidateSubscription." )] 
	Uint64 ProviderOperation_ValidateSubscription ;
} ;

/******************************************************************************
 *
 *	Name:
 *
 *	
 *  Description:
 *
 *	
 *****************************************************************************/

[	
Dynamic,Provider ("Msft_ProviderSubSystem"),
Description ( "The Msft_Providers class exposes configuration relating to provider instances" )
]
class Msft_Providers
{
		[Key,Description ( "The Namespace property indicates the Namespace associated with a particular instantiation of a provider instance." )] 
	String Namespace ;

		[Key,Description ( "If provider is configured for Per User Initialization, then the User property "
						"refers to User's particular instantiation of a provider instance." )] 
	String User ;

		[Key,Description ( "If provider is configured for Per Local Initialization, then the Locale property "
						"refers to Locale's particular instantiation of a provider instance." )] 
	String Locale ;

		[Key,Description ( "The Provider property holds the Provider Name associated with a particular instantiation of a provider instance."
						"The Provider Name is identical to the __Win32provider :: Name property." )] 
	String Provider ;

		[Key,Description (	"The TransactionIdentifier property is for internal use, "
						"currently always {00000000-0000-0000-0000-000000000000}." )] 
	String TransactionIdentifier ;

		[Key,Description ( "The HostingSpecification property defines the first component of the __Win32provider :: HostingModel" 
						"property. The hosting property is defined to be one of the following value types :-"
						"WmiCore - Activate provider in host to the winmgmt service, note this is only supported for OS components."
								"Note, attempts to register providers with WmiCore as HostingModel will fail with WBEM_E_ACCESS_DENIED"
						"WmiCoreOrSelfHost - Activate provider in host to the winmgmt service or as local server,"
								"Note this is only supported for OS components."
						"SelfHost - Activate provider as a local server implementation."
						"Decoupled:Com - Activate provider as a decoupled com provider." 
						"Decoupled:NonCom - Activate provider as a non com event provider."
						"LocalSystemHost[:((.)+)] - Activate provider in host to a wmi provider host running as LocalSystem." 
							"Note, this is the default if __Win32provider :: HostingModel is not set. "
							"Further note, that on creation of an instance of __Win32provider with HostingModel equal to NULL, "
							"LocalSystemHost or LocalSystemHostOrSelfHost, an event log record is generated so that admins are aware of" 
							"providers running under the trusted status."
						"LocalSystemHostOrSelfHost[:((.)+)] - Activate provider in host to a wmi provider host running as LocalSystem "
							"or as local server. Note, this is the default if __Win32provider :: HostingModel is not set. "
							"Further note, that on creation of an instance of __Win32provider with HostingModel equal to NULL, "
							"LocalSystemHost or LocalSystemHostOrSelfHost, an event log record is generated so that admins are aware of" 
							"providers running under the trusted status."
						"NetworkServiceHost[:((.)+)] - Activate provider in host to a wmi provider host running as NetworkService." 
						"LocalServiceHost[:((.)+)] - Activate provider in host to a wmi provider host running as LocalService." 
						"Note, [:((.)+)] refers to a regular expression that defines the hosting group for the provider." )] 
	Uint32 HostingSpecification ;

		[Key,Description ( "The HostingGroup specification defines the second component of the __Win32provider :: HostingModel when"
							"the hosting model is one of LocalSystemHost, LocalSystemHostOrSelfHost, NetworkServiceHost or LocalServiceHost."
							"The hosting group defines a particular instantiation of a wmi provider host, providers that share the same hosting model"
							"and hosting group share the same surrogate process." )] 
	String HostingGroup ;

		[Description ( "The  HostProcessIdentifier property defines the process identifier hosting the particular instance of the provider." )]
	Uint32 HostProcessIdentifier ;

			[Description ( "The ProviderOperation_GetObjectAsync property indicates the number of calls to IWbemServices :: GetObjectAsync." )] 
	Uint64 ProviderOperation_GetObjectAsync ;

		[Description ( "The  property indicates the number of calls to IWbemServices :: PutClassAsync." )] 
	Uint64 ProviderOperation_PutClassAsync ;

		[Description ( "The ProviderOperation_DeleteClassAsync property indicates the number of calls to IWbemServices :: DeleteClassAsync." )] 
	Uint64 ProviderOperation_DeleteClassAsync ;

		[Description ( "The ProviderOperation_CreateClassEnumAsync property indicates the number of calls to IWbemServices :: CreateClassEnumAsync." )] 
	Uint64 ProviderOperation_CreateClassEnumAsync ;

		[Description ( "The ProviderOperation_PutInstanceAsync property indicates the number of calls to IWbemServices :: PutInstanceAsync." )] 
	Uint64 ProviderOperation_PutInstanceAsync ;

		[Description ( "The ProviderOperation_DeleteInstanceAsync property indicates the number of calls to IWbemServices :: DeleteInstanceAsync." )] 
	Uint64 ProviderOperation_DeleteInstanceAsync ;

		[Description ( "The ProviderOperation_CreateInstanceEnumAsync property indicates the number of calls to IWbemServices :: CreateInstanceEnumAsync." )] 
	Uint64 ProviderOperation_CreateInstanceEnumAsync ;

		[Description ( "The ProviderOperation_ExecQueryAsync property indicates the number of calls to IWbemServices :: ExecQueryAsync." )] 
	Uint64 ProviderOperation_ExecQueryAsync ;

		[Description ( "The ProviderOperation_ExecMethodAsync property indicates the number of calls to IWbemServices :: ExecMethodAsync." )] 
	Uint64 ProviderOperation_ExecMethodAsync ;

		[Description ( "The ProviderOperation_QueryInstances property indicates the number of calls to IWbemHiPerfProvider :: QueryInstances." )] 
	Uint64 ProviderOperation_QueryInstances ;

		[Description ( "The ProviderOperation_CreateRefresher property indicates the number of calls to IWbemHiPerfProvider :: CreateRefresher." )] 
	Uint64 ProviderOperation_CreateRefresher ;

		[Description ( "The ProviderOperation_CreateRefreshableObject property indicates the number of calls to IWbemHiPerfProvider :: CreateRefreshableObject." )] 
	Uint64 ProviderOperation_CreateRefreshableObject ;

		[Description ( "The ProviderOperation_StopRefreshing property indicates the number of calls to IWbemHiPerfProvider :: StopRefreshing." )] 
	Uint64 ProviderOperation_StopRefreshing ;

		[Description ( "The ProviderOperation_CreateRefreshableEnum property indicates the number of calls to IWbemHiPerfProvider :: CreateRefreshableEnum." )] 
	Uint64 ProviderOperation_CreateRefreshableEnum ;

		[Description ( "The ProviderOperation_GetObjects property indicates the number of calls to IWbemHiPerfProvider :: GetObjects." )] 
	Uint64 ProviderOperation_GetObjects ;

		[Description ( "The ProviderOperation_GetProperty property indicates the number of calls to IWbemPropertyProvider :: GetProperty." )] 
	Uint64 ProviderOperation_GetProperty ;

		[Description ( "The ProviderOperation_PutProperty property indicates the number of calls to IWbemPropertyProvider :: PutProperty." )] 
	Uint64 ProviderOperation_PutProperty ;

		[Description ( "The ProviderOperation_ProvideEvents property indicates the number of calls to IWbemEventProvider :: ProvideEvents." )] 
	Uint64 ProviderOperation_ProvideEvents ;

		[Description ( "The ProviderOperation_NewQuery property indicates the number of calls to IWbemEventProviderQuerySink :: NewQuery." )] 
	Uint64 ProviderOperation_NewQuery ;

		[Description ( "The ProviderOperation_CancelQuery property indicates the number of calls to IWbemEventProviderQuerySink :: CancelQuery." )] 
	Uint64 ProviderOperation_CancelQuery ;

		[Description ( "The ProviderOperation_AccessCheck property indicates the number of calls to IWbemEventProviderSecurity :: AccessCheck." )] 
	Uint64 ProviderOperation_AccessCheck ;

		[Description ( "The ProviderOperation_SetRegistrationObject property is currently not set." )] 
	Uint64 ProviderOperation_SetRegistrationObject ;

		[Description ( "The ProviderOperation_FindConsumer property indicates the number of calls to IWbemEventConsumerProvider :: FindConsumer." )] 
	Uint64 ProviderOperation_FindConsumer ;

		[Description ( "The ProviderOperation_ValidateSubscription property indicates the number of calls to IWbemEventConsumerProviderEx :: ValidateSubscription." )] 
	Uint64 ProviderOperation_ValidateSubscription ;

	[
		Implemented,
		Description ( "The Suspend method suspends execution of providers. All calls passing "
						"through a particular instance of the provider will be pass through an"
						"interception layer, this layer will fail the call. Depending on the particular "
						"operation, the client may receive the status code WBEM_E_PROVIDER_SUSPENDED " ) 
	]
	Uint32 Suspend () ;

	[
		Implemented,
		Description ( "The Resume method resumes execution of providers suspended through the use of the Suspend method." ) 
	]
	Uint32 Resume () ;

	[
		Implemented,
		Description ( "The dynamic UnLoad method unloads the COM server associated with the particular instance of the provider. Further calls into"
						"the provider with the same CLSID will return WBEM_E_PROVIDER_DISABLED. If the COM server "
						"implementation is an inproc server hosted in the provider host process it will receive calls to the "
						"exported function DllCanUnloadNow, if the provider responds by returning TRUE then COM will unload the "
						"executable image. Currently COM is configured to unload the executable approximately 30 seconds after the "
						"first successful call to DllCanUnloadNow. If hosted in some other process surrogate the surrogate will unload "
						"using some other strategy. The provider can be re-enabled either through the use of the Msft_Provider :: Load "
						"method, changes to the associated instance of __Win32Provider or via service restart." ) 
	]
	Uint32 UnLoad () ;

	[
		Static,
		Implemented,
		Description ( "The Load method loads a specific instance of a provider." ) 
	]
	Uint32 Load (

		[In] String Namespace ,
		[In] String User ,
		[In] String Locale ,
		[In] String Provider ,
		[In] String TransactionIdentifier 
	) ;
} ;
