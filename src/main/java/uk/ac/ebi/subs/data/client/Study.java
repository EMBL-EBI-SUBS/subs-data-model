package uk.ac.ebi.subs.data.client;

/**
 * Created by davidr on 30/01/2017.
 */
public class Study extends uk.ac.ebi.subs.data.core.Study implements PartOfSubmission {

    private String submission; //URL for submission

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }
}
