rections xmlns="msmq-queue-redirections.xml">

  <!--
     Each <Redirections> element contains 0 or more <redirection> elements, each 
     of which contains exactly one <from> subelement and exactly one <to> 
     subelement. Each <redirection> element describes a redirection (or mapping)
     of the logical address given in the <from> subelement to the physical address 
     given in the <to> element.

  <redirection>
      <from>http://external_host/msmq/external_queue</from>
      <to>http://internal_host/msmq/internal_queue</to> 
  </redirection>

  --> 

  <!--
     Limited use of regular expressions in a <from> element is supported. 
     Asterisk-terminated URLs can define a redirection from multiple logical 
     addresses to a single physical address.

     In the following example, any message with a logical address that starts 
     with the string https://external_host/* will be redirected to the physical 
     address in the <to> element.

  <redirection>
      <from>https://external_host/*</from>
      <to>http://internal_host/msmq/internal_queue</to> 
  </redirection>
	--> 


</redirections>
