package uk.ac.ebi.subs.data.component;

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
