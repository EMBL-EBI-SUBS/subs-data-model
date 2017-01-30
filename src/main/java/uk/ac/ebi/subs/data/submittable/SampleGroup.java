package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.SampleGroupRef;
import uk.ac.ebi.subs.data.component.SampleRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode
@ToString
public class SampleGroup extends BaseSubmittable<SampleGroup> {

    private List<SampleRef> sampleRefs = new ArrayList<>();
    private Date releaseDate;

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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
