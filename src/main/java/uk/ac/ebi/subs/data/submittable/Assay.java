package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.AssayRef;
import uk.ac.ebi.subs.data.component.ProtocolUse;
import uk.ac.ebi.subs.data.component.SampleUse;
import uk.ac.ebi.subs.data.component.StudyRef;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Assay extends BaseSubmittable<Assay> {

    private StudyRef studyRef = new StudyRef();
    private List<SampleUse> sampleUses = new ArrayList<>();
    private List<ProtocolUse> protocolUses = new ArrayList<>();

    @Override
    protected AssayRef newRef() {
        return new AssayRef();
    }

    public StudyRef getStudyRef() {
        return studyRef;
    }

    public void setStudyRef(StudyRef studyRef) {
        this.studyRef = studyRef;
    }

    public List<SampleUse> getSampleUses() {
        return sampleUses;
    }

    public void setSampleUses(List<SampleUse> sampleUses) {
        this.sampleUses = sampleUses;
    }

    public List<ProtocolUse> getProtocolUses() {
        return protocolUses;
    }

    public void setProtocolUses(List<ProtocolUse> protocolUses) {
        this.protocolUses = protocolUses;
    }
}
