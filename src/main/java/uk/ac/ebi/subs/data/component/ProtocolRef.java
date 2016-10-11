package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Protocol;

public class ProtocolRef extends AbstractSubsRef<Protocol> {
    Protocol referencedObject;

    @Override
    public Protocol getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(Protocol referencedObject) {
        this.referencedObject = referencedObject;
    }
}
