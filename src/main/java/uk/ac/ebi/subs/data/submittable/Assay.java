package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.AssayRef;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.StudyRef;

public class Assay extends AbstractSubsEntity<Assay> {

    StudyRef studyRef = new StudyRef();
    SampleRef sampleRef = new SampleRef();

    public StudyRef getStudyRef() {
        return studyRef;
    }

    public void setStudyRef(StudyRef studyRef) {
        this.studyRef = studyRef;
    }

    public SampleRef getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    @Override
    protected AbstractSubsRef<Assay> newRef() {
        return new AssayRef();
    }
}
