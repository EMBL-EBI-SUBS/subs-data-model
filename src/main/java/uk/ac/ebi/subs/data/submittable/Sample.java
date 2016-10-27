package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.SampleRelationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sample extends AbstractSubsEntity {

    @Id
    String id;

    List<SampleRelationship> sampleRelationships = new ArrayList<SampleRelationship>();
    Long taxonId;
    String taxon;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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

    @Override
    protected SampleRef newRef() {
        return new SampleRef();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sample sample = (Sample) o;
        return Objects.equals(id, sample.id) &&
                Objects.equals(sampleRelationships, sample.sampleRelationships) &&
                Objects.equals(taxonId, sample.taxonId) &&
                Objects.equals(taxon, sample.taxon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, sampleRelationships, taxonId, taxon);
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id='" + id + '\'' +
                ", sampleRelationships=" + sampleRelationships +
                ", taxonId=" + taxonId +
                ", taxon='" + taxon + '\'' +
                "} " + super.toString();
    }
}
