package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.Submitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Submission {
    List<Submittable> submissionItems = new ArrayList<Submittable>();
    Submitter submitter = new Submitter();
    Domain domain = new Domain();
    Date submissionDate = new Date();
    String status;

    public List<Submittable> getSubmissionItems() {
        return submissionItems;
    }

    public void setSubmissionItems(List<Submittable> submissionItems) {
        this.submissionItems = submissionItems;
    }

    public Submitter getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
