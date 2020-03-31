 
     to which a stream receipt is sent (<StreamReceiptURL>) when an SRMP 
     message is sent to the logical URL specified in <LogicalAddress>. 

	  Each <setup> element also defines an implicit mapping that redirects every 
     SRMP message arriving at the queue specified in <StreamReceiptURL> to the 
     physical address of the local order queue.

  <setup>
    <LogicalAddress>https://external_host/msmq/external_queue</LogicalAddress> 
    <StreamReceiptURL>https://internal_host/msmq/virtual_order_queue</StreamReceiptURL>
  </setup>
  -->

<!-- Limited use of regular expressions in <LogicalAddress> elements is supported. 
     Asterisk-terminated URLs can define the use of a single stream receipt URL 
     for multiple logical addresses.

      In following example any message with a logical address that starts with 
      the string http://external_host/* will use the stream receipt URL that 
      is defined in the <StreamReceiptURL> element. 

  <setup>
    <LogicalAddress>http://external_host/*</LogicalAddress> 
    <StreamReceiptURL>http://internal_host/msmq/virtual_order_queue</StreamReceiptURL>
  </setup>
  -->

<!--
     Each <StreamReceiptSetup> element may contain one <default> element, which 
     defines the default stream receipt URL that is used by the local 
     MSMQ service in every outgoing streamed (transactional) SRMP message, 
     unless the logical address of the message matches the <LogicalAdress> 
     element in one of the <setup> elements. 

  <default>http://internal_host/msmq/virtual_order_queue</default>
  -->
</StreamReceiptSetup>
