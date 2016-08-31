package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

public class Assay extends AbstractSubsEntity<Assay> {

    SubsLink<Study> studyRef = new SubsLink<Study>();
    SubsLink<Sample> sampleRef = new SubsLink<Sample>();

    public SubsLink<Study> getStudyRef() {
        return studyRef;
    }

    public void setStudyRef(SubsLink<Study> studyRef) {
        this.studyRef = studyRef;
    }

    public SubsLink<Sample> getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink<Sample> sampleRef) {
        this.sampleRef = sampleRef;
    }
}
