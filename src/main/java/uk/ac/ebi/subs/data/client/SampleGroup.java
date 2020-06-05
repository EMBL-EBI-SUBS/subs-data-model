package uk.ac.ebi.subs.data.client;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SampleGroup extends uk.ac.ebi.subs.data.submittable.SampleGroup implements PartOfSubmission {

    private String submissionUrl;

    @Override
    public String getSubmissionUrl() {
        return submissionUrl;
    }

    @Override
    public void setSubmissionUrl(String submissionUrl) {
        this.submissionUrl = submissionUrl;
    }
}
