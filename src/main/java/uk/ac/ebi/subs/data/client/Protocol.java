package uk.ac.ebi.subs.data.client;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Protocol extends uk.ac.ebi.subs.data.submittable.Protocol implements PartOfSubmission {

    private String submission;

    @Override
    public String getSubmission() {
        return submission;
    }

    @Override
    public void setSubmission(String submission) {
        this.submission = submission;
    }
}
