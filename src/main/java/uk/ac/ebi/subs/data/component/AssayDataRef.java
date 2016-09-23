package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.AssayData;

public class AssayDataRef extends AbstractSubsRef<AssayData> {
    AssayData referencedObject;

    @Override
    public AssayData getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(AssayData referencedObject) {
        this.referencedObject = referencedObject;
    }

}
