package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.SampleExternalReference;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.SampleRelationship;
import uk.ac.ebi.subs.data.submittable.sample.Database;
import uk.ac.ebi.subs.data.submittable.sample.Organization;
import uk.ac.ebi.subs.data.submittable.sample.Person;
import uk.ac.ebi.subs.data.submittable.sample.Publication;
import uk.ac.ebi.subs.data.submittable.sample.SubmissionInfo;
import uk.ac.ebi.subs.data.submittable.sample.TermSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Sample extends BaseSubmittable<Sample> {

    private List<SampleRelationship> sampleRelationships = new ArrayList<SampleRelationship>();
    private Long taxonId;
    private String taxon;
    private LocalDate releaseDate;
    private List<SampleExternalReference> externalReferences;

    private SubmissionInfo submissionInfo;
    private List<Person> persons;
    private List<Organization> organizations;
    private List<Publication> publications;
    private List<Database> databases;
    private List<TermSource> termSources;

    @Override
    protected SampleRef newRef() {
        return new SampleRef();
    }

    public List<SampleRelationship> getSampleRelationships() {
        return sampleRelationships;
    }

    public void setSampleRelationships(List<SampleRelationship> sampleRelationships) {
        this.sampleRelationships = sampleRelationships;
    }

    public Long getTaxonId() {
        return taxonId;
    }

    public void setTaxonId(Long taxonId) {
        this.taxonId = taxonId;
    }

    public String getTaxon() {
        return taxon;
    }

    public void setTaxon(String taxon) {
        this.taxon = taxon;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<SampleExternalReference> getSampleExternalReferences() {
        return externalReferences;
    }

    public void setSampleExternalReferences(List<SampleExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public void addSampleExternalReference(SampleExternalReference externalReference) {
        externalReferences.add(externalReference);
    }

    public SubmissionInfo getSubmissionInfo() {
        return submissionInfo;
    }

    public void setSubmissionInfo(SubmissionInfo submissionInfo) {
        this.submissionInfo = submissionInfo;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public List<Database> getDatabases() {
        return databases;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    public List<TermSource> getTermSources() {
        return termSources;
    }

    public void setTermSources(List<TermSource> termSources) {
        this.termSources = termSources;
    }
}
