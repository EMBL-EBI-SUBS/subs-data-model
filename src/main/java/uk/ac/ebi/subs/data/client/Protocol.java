package uk.ac.ebi.subs.data.client;

/**
 * Created by davidr on 30/01/2017.
 */
public class Protocol extends uk.ac.ebi.subs.data.core.Protocol implements PartOfSubmission {

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
