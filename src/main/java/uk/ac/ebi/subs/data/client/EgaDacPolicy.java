package uk.ac.ebi.subs.data.client;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EgaDacPolicy extends uk.ac.ebi.subs.data.submittable.EgaDacPolicy implements PartOfSubmission {

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
