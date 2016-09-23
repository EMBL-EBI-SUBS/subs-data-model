package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Assay;

public class AssayRef extends AbstractSubsRef<Assay> {
    Assay referencedObject;

    @Override
    public Assay getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(Assay referencedObject) {
        this.referencedObject = referencedObject;
    }
}
