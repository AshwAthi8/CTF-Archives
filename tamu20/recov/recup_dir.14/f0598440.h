 subelement. Each <redirection> element describes a redirection (or mapping)
     of the physical address of the destination queue given in the <destination> subelement 
     to the virtual directory on the intermediate host given in the <through> subelement.

  <redirection>
      <destination>http://target_host/msmq/private$/destination_queue</destination>
      <through>http://intermediate_host/msmq</through> 
  </redirection>

  --> 

  <!--
     Limited use of regular expressions in a <destination> element is supported. 
     Asterisk-terminated URLs can define a redirection of multiple physical addresses 
     of destination queues to a single address of a virtual directory on a intermediate host.

     In the following example, all messages sent using the HTTP protocol 
     will be redirected through the intermediate host. 

  <redirection>
      <destination>http://*</destination>
      <through>http://intermediate_host/msmq</through> 
  </redirection>
	--> 

  <!--
     Each <outbound_redirections> element may contain 0 or more <exception> subelements.
     You can use <exception> elements to exclude messages sent to specific queues from
     being redirected by <redirection> rules.  
     Limited use of regular expressions in an <exception> element is supported with the same 
     restrictions as for the <destination> element above. 

     In the following example, all messages sent to private queues on special_host 
     will not be redirected through the intermediate host. 

  <exception>http://special_host/msmq/private$/*</exception>

     You can use the keyword 'local_names' to exclude messages sent to any internal (intranet) host 
     from being redirected by <redirection> rules. 

     In the following example, no messages sent to internal hosts 
     will be redirected through the intermediate host. 

  <exception>local_names</exception>
	--> 


</outbound_redirections>
