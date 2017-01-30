package uk.ac.ebi.subs.data.client;


public class SampleGroup extends uk.ac.ebi.subs.data.core.SampleGroup implements PartOfSubmission {

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
