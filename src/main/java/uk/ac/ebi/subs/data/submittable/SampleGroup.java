package uk.ac.ebi.subs.data.submittable;


import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.SampleGroupRef;
import uk.ac.ebi.subs.data.component.SampleRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleGroup extends AbstractSubsEntity<SampleGroup> {

    @Id
    String id;

    List<SampleRef> sampleRefs = new ArrayList<>();
    Date releaseDate = new Date();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public List<SampleRef> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SampleRef> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    protected SampleGroupRef newRef() {
        return new SampleGroupRef();
    }
}
