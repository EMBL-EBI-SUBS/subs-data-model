package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Project;

public class ProjectRef  extends AbstractSubsRef<Project> {
    Project referencedObject;

    @Override
    public Project getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(Project referencedObject) {
        this.referencedObject = referencedObject;
    }
}
