package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Study extends AbstractSubsEntity<Study> implements Publications, Contacts {
    List<Publication> publications = new ArrayList<>();
    List<Contact> contacts = new ArrayList<>();

    List<ProtocolRef> protocolRefs = new ArrayList<>();
    ProjectRef projectRef = new ProjectRef();

    Date releaseDate = new Date();

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

    public List<ProtocolRef> getProtocolRefs() {
        return protocolRefs;
    }

    public void setProtocolRefs(List<ProtocolRef> protocolRefs) {
        this.protocolRefs = protocolRefs;
    }

    @Override
    protected AbstractSubsRef<Study> newRef() {
        return new StudyRef();
    }
}
