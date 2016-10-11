package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.ProtocolRef;

public class Protocol extends AbstractSubsEntity<Protocol> {
    @Override
    protected AbstractSubsRef<Protocol> newRef() {
        return new ProtocolRef();
    }

    @Override
    public String toString() {
        return "Protocol{} " + super.toString();
    }
}
