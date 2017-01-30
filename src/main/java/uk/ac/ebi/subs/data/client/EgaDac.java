package uk.ac.ebi.subs.data.client;

/**
 * Created by davidr on 30/01/2017.
 */
public class EgaDac extends uk.ac.ebi.subs.data.core.EgaDac implements PartOfSubmission {

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
