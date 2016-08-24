package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

public class Assay extends AbstractSubsEntity {

    SubsLink studyRef = new SubsLink();
    SubsLink sampleRef = new SubsLink();

    public SubsLink getStudyRef() {
        return studyRef;
    }

    public void setStudyRef(SubsLink studyRef) {
        this.studyRef = studyRef;
    }

    public SubsLink getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink sampleRef) {
        this.sampleRef = sampleRef;
    }
}
