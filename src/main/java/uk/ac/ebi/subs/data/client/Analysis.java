package uk.ac.ebi.subs.data.client;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Analysis extends uk.ac.ebi.subs.data.submittable.Analysis implements PartOfSubmission {

    private String submission; //URL for submission

    @Override
    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }
}
