package uk.ac.ebi.subs.data.client;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Study extends uk.ac.ebi.subs.data.submittable.Study implements PartOfSubmission {

    private String submissionUrl;

    public String getSubmissionUrl() {
        return submissionUrl;
    }

    public void setSubmissionUrl(String submissionUrl) {
        this.submissionUrl = submissionUrl;
    }
}
