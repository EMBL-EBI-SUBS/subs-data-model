package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Sample;

public class SampleRef  extends AbstractSubsRef<Sample> {
    Sample referencedObject;

    @Override
    public Sample getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(Sample referencedObject) {
        this.referencedObject = referencedObject;
    }
}
