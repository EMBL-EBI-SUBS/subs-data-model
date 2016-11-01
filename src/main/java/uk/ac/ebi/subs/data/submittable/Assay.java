package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Assay extends AbstractSubsEntity<Assay> {

    @Id
    String id;

    StudyRef studyRef = new StudyRef();
    List<SampleUse> sampleUses = new ArrayList<>();
    List<ProtocolUse> protocolUses = new ArrayList<>();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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

    @Override
    protected AssayRef newRef() {
        return new AssayRef();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Assay assay = (Assay) o;
        return Objects.equals(studyRef, assay.studyRef) &&
                Objects.equals(sampleUses, assay.sampleUses) &&
                Objects.equals(protocolUses, assay.protocolUses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studyRef, sampleUses, protocolUses);
    }


    @Override
    public String toString() {
        return "Assay{" +
                "id='" + id + '\'' +
                ", studyRef=" + studyRef +
                ", sampleUses=" + sampleUses +
                ", protocolUses=" + protocolUses +
                '}';
    }
}
