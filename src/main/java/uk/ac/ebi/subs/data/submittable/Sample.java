package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.SampleExternalReference;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.SampleRelationship;

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
    private List<SampleExternalReference> externalReference;

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

    public List<SampleExternalReference> getSampleExternalReference() {
        return externalReference;
    }

    public void setSampleExternalReference(SampleExternalReference externalRefrence) {
        this.externalReference = externalReference;
    }
}
