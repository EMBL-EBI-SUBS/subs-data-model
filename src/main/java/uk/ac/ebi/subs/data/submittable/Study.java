package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Study extends BaseSubmittable<Study> implements Submittable {


    private List<ProtocolRef> protocolRefs = new ArrayList<>();
    private ProjectRef projectRef = new ProjectRef();
    private StudyDataType studyType;

    @Override
    protected StudyRef newRef() {
        return new StudyRef();
    }

    public List<ProtocolRef> getProtocolRefs() {
        return protocolRefs;
    }

    public void setProtocolRefs(List<ProtocolRef> protocolRefs) {
        this.protocolRefs = protocolRefs;
    }

    public ProjectRef getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(ProjectRef projectRef) {
        this.projectRef = projectRef;
    }

    public StudyDataType getStudyType() {
        return studyType;
    }

    public void setStudyType(StudyDataType studyType) {
        this.studyType = studyType;
    }
}
