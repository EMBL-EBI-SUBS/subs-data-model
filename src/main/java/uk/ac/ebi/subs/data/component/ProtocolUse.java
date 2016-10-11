package uk.ac.ebi.subs.data.component;


import java.util.ArrayList;
import java.util.List;

/**
 * Records the use of a specific protocol, with the option to record attributes about the use of that protocol
 */
public class ProtocolUse implements Attributes {
    ProtocolRef protocolRef = new ProtocolRef();
    List<Attribute> attributes = new ArrayList<>();

    public ProtocolRef getProtocolRef() {
        return protocolRef;
    }

    public void setProtocolRef(ProtocolRef protocolRef) {
        this.protocolRef = protocolRef;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
