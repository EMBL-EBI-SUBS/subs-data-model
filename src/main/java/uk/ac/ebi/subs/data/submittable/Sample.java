package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.SampleRelationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
public class Sample extends AbstractSubsEntity {

    List<SampleRelationship> sampleRelationships = new ArrayList<SampleRelationship>();
    Long taxonId;
    String taxon;

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
        Sample sample = (Sample) o;
        return Objects.equals(sampleRelationships, sample.sampleRelationships) &&
                Objects.equals(taxonId, sample.taxonId) &&
                Objects.equals(taxon, sample.taxon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleRelationships, taxonId, taxon);
    }

    @Override
    public String toString() {
        return "Sample{" +
                "sampleRelationships=" + sampleRelationships +
                ", taxonId=" + taxonId +
                ", taxon='" + taxon + '\'' +
                "} " + super.toString();
    }
}
