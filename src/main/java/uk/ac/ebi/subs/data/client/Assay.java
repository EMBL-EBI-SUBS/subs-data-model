package uk.ac.ebi.subs.data.client;

/**
 * Created by davidr on 30/01/2017.
 */
public class Assay extends uk.ac.ebi.subs.data.submittable.Assay implements PartOfSubmission {

    private  String submission;

    @Override
    public String getSubmission() {
        return submission;
    }

    @Override
    public void setSubmission(String submission) {
        this.submission = submission;
    }
}
