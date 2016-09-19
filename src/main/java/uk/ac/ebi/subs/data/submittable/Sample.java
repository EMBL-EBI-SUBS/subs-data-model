package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SampleLink;

import java.util.ArrayList;
import java.util.List;

public class Sample extends AbstractSubsEntity {

    @Id
    String id;

    List<SampleLink> sampleLinks = new ArrayList<>();
    Long taxonId;
    String taxon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SampleLink> getSampleLinks() {
        return sampleLinks;
    }

    public void setSampleLinks(List<SampleLink> sampleLinks) {
        this.sampleLinks = sampleLinks;
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
