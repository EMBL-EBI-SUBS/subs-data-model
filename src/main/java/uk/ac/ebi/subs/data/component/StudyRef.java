package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Study;

public class StudyRef  extends AbstractSubsRef<Study>{
    Study referencedObject;

    @Override
    public Study getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(Study referencedObject) {
        this.referencedObject = referencedObject;
    }
}
