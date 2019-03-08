package uk.ac.ebi.subs.data.submittable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Project extends BaseSubmittable<Project> implements Contacts, Publications, Fundings {

    private List<Contact> contacts = new ArrayList<>();
    private List<Publication> publications = new ArrayList<>();
    private List<Funding> fundings = new ArrayList<>();
    private LocalDate releaseDate;

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

    @Override
    public List<Funding> getFundings() {
        return fundings;
    }

    @Override
    public void setFundings(List<Funding> fundings) {
        this.fundings = fundings;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    protected ProjectRef newRef() {
        return new ProjectRef();
    }
}
