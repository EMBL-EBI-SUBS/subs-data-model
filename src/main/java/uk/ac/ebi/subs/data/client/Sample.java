package uk.ac.ebi.subs.data.client;


public class Sample extends uk.ac.ebi.subs.data.core.Sample implements PartOfSubmission {

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
