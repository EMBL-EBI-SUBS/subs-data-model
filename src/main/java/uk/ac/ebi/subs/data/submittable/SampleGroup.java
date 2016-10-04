package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.SampleGroupRef;
import uk.ac.ebi.subs.data.component.SampleRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleGroup extends AbstractSubsEntity<SampleGroup> {
    List<SampleRef> sampleRefs = new ArrayList<>();
    Date releaseDate = new Date();

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
    protected AbstractSubsRef<SampleGroup> newRef() {
        return new SampleGroupRef();
    }
}
