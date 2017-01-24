package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
    Caution - Spring data does not apply indexes from parent classes
     the index definition has to be in the child classes

    The compound indexes block below should in sync with the reference copy in AbstractSubsEntity
 */
@CompoundIndexes({
        @CompoundIndex(name = "domain_alias", def = "{ 'domain.name': 1, 'alias': 1 }"),
        @CompoundIndex(name = "accession", def = "{ 'accession': 1}"),
        @CompoundIndex(name = "submissionId_status", def= "{ 'submissionId': 1, 'status': 1}")
})
@Document
@ToString
@EqualsAndHashCode
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
    protected StudyRef newRef() {
        return new StudyRef();
    }
}
