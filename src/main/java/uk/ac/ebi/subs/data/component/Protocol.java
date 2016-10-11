package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.AbstractSubsEntity;

import java.util.ArrayList;
import java.util.List;

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
