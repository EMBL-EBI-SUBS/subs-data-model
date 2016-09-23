package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.SampleGroup;

public class SampleGroupRef extends AbstractSubsRef<SampleGroup> {
    SampleGroup referencedObject;

    @Override
    public SampleGroup getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(SampleGroup referencedObject) {
        this.referencedObject = referencedObject;
    }
}
