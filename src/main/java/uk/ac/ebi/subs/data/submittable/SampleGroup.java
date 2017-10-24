package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.SampleGroupRef;
import uk.ac.ebi.subs.data.component.SampleRef;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SampleGroup extends BaseSubmittable<SampleGroup> {

    private List<SampleRef> sampleRefs = new ArrayList<>();
    private LocalDate releaseDate;

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
}
