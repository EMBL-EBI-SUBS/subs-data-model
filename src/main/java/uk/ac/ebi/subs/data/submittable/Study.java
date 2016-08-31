package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Study extends AbstractSubsEntity<Study> implements Publications, Protocols, Contacts {
    List<Publication> publications = new ArrayList<Publication>();
    List<Protocol> protocols = new ArrayList<Protocol>();
    List<Contact> contacts = new ArrayList<Contact>();

    SubsLink<Project> projectRef = new SubsLink<Project>();
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
    public List<Protocol> getProtocols() {
        return protocols;
    }

    @Override
    public void setProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public SubsLink<Project> getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(SubsLink<Project> projectRef) {
        this.projectRef = projectRef;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
