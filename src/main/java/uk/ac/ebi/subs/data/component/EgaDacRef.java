package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.EgaDac;

public class EgaDacRef  extends AbstractSubsRef<EgaDac> {
    EgaDac referencedObject;

    @Override
    public EgaDac getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(EgaDac referencedObject) {
        this.referencedObject = referencedObject;
    }
}
