package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleGroup extends AbstractSubsEntity {
    List<SubsLink> sampleRefs = new ArrayList<SubsLink>();
    Date releaseDate = new Date();

    public List<SubsLink> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SubsLink> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
