package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.component.SampleRelationship;

import java.util.ArrayList;
import java.util.List;

public class Sample extends AbstractSubsEntity {

    @Id
    String id;

    List<SampleRelationship> sampleRelationships = new ArrayList<SampleRelationship>();
    Long taxonId;
    String taxon;

    public String getId() {
        return id;
    }

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
    public String toString() {
        return "Sample{" +
                "id='" + id + '\'' +
                ", accession=" + this.getAccession() +
                ", alias='" + this.getAlias() + '\'' +
                ", status='" + this.getStatus() + '\'' +
                ", domain=" + this.getDomain() +
                ", archive=" + this.getArchive() +
                ", title='" + this.getTitle() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", attributes=" + this.getAttributes() +
                ", sampleRelationships=" + sampleRelationships +
                ", taxonId=" + taxonId +
                ", taxon='" + taxon + '\'' +
                '}';
    }

    @Override
    protected AbstractSubsRef newRef() {
        return new SampleRef();
    }
}
