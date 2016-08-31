package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleGroup extends AbstractSubsEntity {
    List<SubsLink<Sample>> sampleRefs = new ArrayList<SubsLink<Sample>>();
    Date releaseDate = new Date();

    public List<SubsLink<Sample>> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SubsLink<Sample>> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
