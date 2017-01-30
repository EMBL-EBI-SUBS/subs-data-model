package uk.ac.ebi.subs.data.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.SampleRelationship;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode @ToString
public class Sample extends BaseSubmittable<Sample> {

    private List<SampleRelationship> sampleRelationships = new ArrayList<SampleRelationship>();
    private Long taxonId;
    private String taxon;

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
}
