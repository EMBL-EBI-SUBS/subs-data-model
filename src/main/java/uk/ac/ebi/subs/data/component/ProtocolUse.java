package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Records the use of a specific protocol, with the option to record attributes about the use of that protocol
 */
@ToString
@EqualsAndHashCode
public class ProtocolUse implements Attributes {
    ProtocolRef protocolRef = new ProtocolRef();
    Map<String,List<Attribute>> attributes = new LinkedHashMap<>();

    public ProtocolRef getProtocolRef() {
        return protocolRef;
    }

    public void setProtocolRef(ProtocolRef protocolRef) {
        this.protocolRef = protocolRef;
    }


    @Override
    public Map<String, List<Attribute>> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Map<String, List<Attribute>> attributes) {
        this.attributes = attributes;
    }
}
