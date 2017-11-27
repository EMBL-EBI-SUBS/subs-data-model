package uk.ac.ebi.subs.data.component;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Records the use of a specific protocol, with the option to record attributes about the use of that protocol
 */
@Data
public class ProtocolUse implements Attributes {
    private ProtocolRef protocolRef = new ProtocolRef();
    private Map<String, Collection<Attribute>> attributes = new LinkedHashMap<>();

    public ProtocolRef getProtocolRef() {
        return protocolRef;
    }

    public void setProtocolRef(ProtocolRef protocolRef) {
        this.protocolRef = protocolRef;
    }


    @Override
    public Map<String, Collection<Attribute>> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Map<String, Collection<Attribute>> attributes) {
        this.attributes = attributes;
    }
}
