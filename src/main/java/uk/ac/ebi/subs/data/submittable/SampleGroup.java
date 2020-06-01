package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.SampleGroupRef;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.submittable.sample.msi.Database;
import uk.ac.ebi.subs.data.submittable.sample.msi.Organization;
import uk.ac.ebi.subs.data.submittable.sample.msi.Person;
import uk.ac.ebi.subs.data.submittable.sample.msi.Publication;
import uk.ac.ebi.subs.data.submittable.sample.msi.Submission;
import uk.ac.ebi.subs.data.submittable.sample.msi.TermSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SampleGroup extends BaseSubmittable<SampleGroup> {

    private List<SampleRef> sampleRefs = new ArrayList<>();
    private LocalDate releaseDate;

    private Submission msiSubmission;
    private Person msiPerson;
    private Organization msiOrganization;
    private Publication msiPublication;
    private Database msiDatabase;
    private TermSource msiTermSource;

    @Override
    protected SampleGroupRef newRef() {
        return new SampleGroupRef();
    }

    public List<SampleRef> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SampleRef> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Submission getMsiSubmission() {
        return msiSubmission;
    }

    public void setMsiSubmission(Submission msiSubmission) {
        this.msiSubmission = msiSubmission;
    }

    public Person getMsiPerson() {
        return msiPerson;
    }

    public void setMsiPerson(Person msiPerson) {
        this.msiPerson = msiPerson;
    }

    public Organization getMsiOrganization() {
        return msiOrganization;
    }

    public void setMsiOrganization(Organization msiOrganization) {
        this.msiOrganization = msiOrganization;
    }

    public Publication getMsiPublication() {
        return msiPublication;
    }

    public void setMsiPublication(Publication msiPublication) {
        this.msiPublication = msiPublication;
    }

    public Database getMsiDatabase() {
        return msiDatabase;
    }

    public void setMsiDatabase(Database msiDatabase) {
        this.msiDatabase = msiDatabase;
    }

    public TermSource getMsiTermSource() {
        return msiTermSource;
    }

    public void setMsiTermSource(TermSource msiTermSource) {
        this.msiTermSource = msiTermSource;
    }
}
