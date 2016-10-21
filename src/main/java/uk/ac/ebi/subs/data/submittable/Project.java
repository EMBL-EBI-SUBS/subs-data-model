package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project extends AbstractSubsEntity<Project> implements Contacts, Publications {

    @Id
    String id;

    List<Contact> contacts = new ArrayList<Contact>();
    List<Publication> publications = new ArrayList<Publication>();
    Date releaseDate = new Date();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public List<Publication> getPublications() {
        return publications;
    }

    @Override
    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    protected ProjectRef newRef() {
        return new ProjectRef();
    }
}
