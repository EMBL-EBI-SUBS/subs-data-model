package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.EgaDacPolicy;

public class EgaDacPolicyRef extends AbstractSubsRef<EgaDacPolicy> {
    EgaDacPolicy referencedObject;

    @Override
    public EgaDacPolicy getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(EgaDacPolicy referencedObject) {
        this.referencedObject = referencedObject;
    }
}
