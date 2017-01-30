package uk.ac.ebi.subs.data.client;

/**
 * Created by davidr on 30/01/2017.
 */
public class Analysis extends uk.ac.ebi.subs.data.core.Analysis implements PartOfSubmission {

    private String submission; //URL for submission

    @Override
    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }
}
