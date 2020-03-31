temULong
}
#type Expand 37
{
  HeapHandle, ItemPtr
  CommittedSize, ItemSizeT
  Address, ItemPtr
  FreeSpace, ItemSizeT
  CommittedSpace, ItemSizeT
  ReservedSpace, ItemSizeT
  NoOfUCRs, ItemULong
}
#type SnapShot 38
{
  HeapHandle, ItemPtr
  Flags, ItemULong
  FreeSpace, ItemSizeT
  CommittedSpace, ItemSizeT
  ReservedSpace, ItemSizeT
}
#type Contract 42
{
  HeapHandle, ItemPtr
  DeCommitSize, ItemSizeT
  DeCommitAddress, ItemPtr
  FreeSpace, ItemSizeT
  CommittedSpace, ItemSizeT
  ReservedSpace, ItemSizeT
  NoOfUCRs, ItemULong
}
#type Lock 43
{ 
  HeapHandle,ItemPtr
}
#type Unlock 44
{
  HeapHandle,ItemPtr
}
#type Validate 45
{ 
  HeapHandle,ItemPtr
}
#type Walk 46
{ 
  HeapHandle,ItemPtr
}

//******************************************
// Critical Section Events
// Control guid is 3AC66736-CC59-4cff-8115-8DF50E39816B
//******************************************


3AC66736-CC59-4cff-8115-8DF50E39816B CriticalSection
#type Collision 34
{
  LockCount,ItemULong	
  SpinCount,ItemPtr	
  OwningThread,ItemPtr
  Address,ItemPtr	
}

#type Initialize 35
{
  SpinCount,ItemPtr	
  Address,ItemPtr	
}

//******************************************
// IIS Universal Listener Events
// Control guid is dd5ef90a-6398-47a4-ad34-4dcecdef795f
//******************************************

3c419e3d-1d18-415b-a91a-9b558938de4b  HttpRequest
#type Start 1
{
  RequestObj,    ItemPtr
  AddressType,   ItemTDIAddr
  RemoteAddress, ItemUnknown  
}

#type Parse 10
{
  RequestObj, ItemPtr
  HttpVerb,   ItemULong
  Url,        ItemWString
}

#type Deliver 11
{
  RequestObj,  ItemPtr
  RequestId,   ItemULongLong
  SiteId,      ItemULong
  AppPoolName, ItemWString
  Url,         ItemWString
}
#type End           2
#type RecvResp     12
#type RecvBody     13
#type CacheAndSend 15
#type FastResp     16
#type FastSend     17
#type ZeroSend     18
#type SendError    19
{
  RequestId, ItemULongLong
  HttpStatus, ItemUShort
}
#type CachedEnd    14
{
  RequestObj, ItemPtr
  SiteId, ItemULong
  BytesSent, ItemULong
}

//******************************************
// IIS6 W3Core.dll Events
// Control guid is 3a2a4e84-4c21-4981-ae10-3fda0d9b0f83
//******************************************

d42cf7ef-de92-473e-8b6c-621ea663113a   W3Server
#type Start  1
{
  RequestId, ItemULongLong
  BytesRecd, ItemULong
}

#type End          2
#type SendBody    16
#type SendResp    17
#type SendEntity  18
#type SendFilter  19
#type ErrSend     20
#type ErrSendEnt  21
#type ErrSendCtx  22
#type ErrVecSend  23
#type VectorSend  24
{
  RequestId, ItemULongLong
  BytesSent, ItemULong
}

#type FileReq 10
{
  RequestId, ItemULongLong
  FileName, ItemWString
}

#type CGIReq    11
#type ISAPIReq  12
{
  RequestId, ItemULongLong
}

#type OOPReq    13
{
  RequestId, ItemULongLong
  ProcessId, ItemULong
  TotalReq,  ItemULong
  CurrentReq, ItemULong
}

00237f0d-73eb-4bcf-a232-126693595847  W3Filter
#type Start  1
{
  RequestId, ItemULongLong
  FilterName, ItemWString
}

#type End    2
{
  RequestId, ItemULongLong
}

e2e55403-0d2e-4609-a470-be0da04013c0  W3Cgi
#type Start 1
#type End 2
{
  RequestId, ItemULongLong
}

//******************************************
// IIS6 W3Isapi.dll Events
// Control guid is a1c2040e-8840-4c31-ba11-9871031a19ea
//******************************************

2e94e6c7-eda0-4b73-9010-2529edce1c27  W3Isapi
#type Start 1
{
  RequestId, ItemULongLong
  connID,    ItemPtr
  fOop,      ItemULong
}

#type End       2
#type SendHdr   10
#type SendHdrEx 11
#type VectorSend 12
#type ErrorSend  13
#type SsfSend    14
#type SsdError   15
{
  RequestId, ItemULongLong
  connID,    ItemPtr
}

//******************************************
// IIS6 strmfil.dll Events
// Control guid is 1fbecc45-c060-4e7c-8a0e-0dbd6116181b
//******************************************
0ecf983b-7115-4b77-a543-95d138ee4400  StrmFilt
#type Start 1
#type End   2
{
}

d353dc2d-3e55-4b88-a4ac-183c368362a3  SslHandShake
#type Start 1
#type End   2
{
}

//******************************************
// Active Server Pages (ASP) Events
// Control guid is 06b94d9a-b15e-456e-a4ef-37c984a2cb4b
//******************************************

1fc299fa-3fc4-4c37-910d-de5b911d0270  AspReq
#type Start 1
#type End   2
{
  ConnID, ItemPtr
}

//******************************************
// ASP.NET Events
// Control guid is aff081fe-0247-4275-9c4e-021f3dc1da35
//******************************************

06a01367-79d3-4594-8eb3-c721603c4679  AspNetReq
#type Start 1
#type End   2
{
  ConnID, ItemPtr
}

//******************************************
// Custom ISAPI extension Events
//******************************************

71bda656-663c-4eae-977a-a749f1fa0fcd  CustomIsapiExt
#type Start 1
#type End   2
{
  ConnID, ItemPtr
}
