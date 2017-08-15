package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Study extends BaseSubmittable<Study> implements Submittable, Publications, Contacts {

    private List<Publication> publications = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    private List<ProtocolRef> protocolRefs = new ArrayList<>();
    private ProjectRef projectRef = new ProjectRef();
    private StudyDataTypeEnum studyType;

    private Date releaseDate;

    @Override
    protected StudyRef newRef() {
        return new StudyRef();
    }

    @Override
    public List<Publication> getPublications() {
        return publications;
    }

    @Override
    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public StudyDataTypeEnum getStudyType() {
        return studyType;
    }

    public void setStudyType(StudyDataTypeEnum studyType) {
        this.studyType = studyType;
    }
}
