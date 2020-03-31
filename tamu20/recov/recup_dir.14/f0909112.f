5"                                    />
    <ElementType name="UpdateFrom"      content="textOnly" dt:type="string" dt:minLength="9" dt:maxLength="2055" xpv:specialtype="anyHttps"        />
    <ElementType name="URL"             content="textOnly" dt:type="string" dt:minLength="9" dt:maxLength="2055" xpv:specialtype="anyHttps"        />
    <ElementType name="Version"         content="textOnly" dt:type="ui4"                                         xpv:specialtype="positiveInteger" />

    <AttributeType name="Name"                             dt:type="string" dt:minLength="1"/>

    <ElementType name="Subfile"         content="eltOnly" order="seq" model="closed">
        <element type="URL"             minOccurs="1" maxOccurs="1" />
        <element type="Version"         minOccurs="1" maxOccurs="1" />
        <attribute type="Name"          required="yes" />
    </ElementType>

    <ElementType name="LangSet"         content="eltOnly" order="seq" model="closed">
        <element type="Subfile"         minOccurs="1" maxOccurs="*" />
        <attribute type="xml:lang"      required="yes" />
    </ElementType>

    <ElementType name="MasterURL"       content="textOnly" dt:type="string" dt:minLength="9" dt:maxLength="2055" xpv:specialtype="anyHttps"        />

    <ElementType name="OtherMasters"    content="eltOnly" model="closed">
        <element type="MasterURL"       minOccurs="1" maxOccurs="*" />
    </ElementType>

    <ElementType name="Master"          content="eltOnly" order="seq" model="closed">
        <element type="TTL"             minOccurs="1" maxOccurs="1" />
        <element type="DomainName"      minOccurs="1" maxOccurs="1" />
        <element type="UpdateFrom"      minOccurs="1" maxOccurs="1" />
        <element type="LangSet"         minOccurs="0" maxOccurs="*" />
        <element type="OtherMasters"    minOccurs="0" maxOccurs="1" />
    </ElementType>
</Schema>
