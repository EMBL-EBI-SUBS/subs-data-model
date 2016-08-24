package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.Submitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Submission {

    @Id
    String id;
    List<Submittable> submissionItems = new ArrayList<Submittable>();
    Submitter submitter = new Submitter();
    Domain domain = new Domain();
    Date submissionDate = new Date();
    String status;

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Submission that = (Submission) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (submissionItems != null ? !submissionItems.equals(that.submissionItems) : that.submissionItems != null)
            return false;
        if (submitter != null ? !submitter.equals(that.submitter) : that.submitter != null) return false;
        if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
        if (submissionDate != null ? !submissionDate.equals(that.submissionDate) : that.submissionDate != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (submissionItems != null ? submissionItems.hashCode() : 0);
        result = 31 * result + (submitter != null ? submitter.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (submissionDate != null ? submissionDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Submission{" +
                "id='" + id + '\'' +
                ", submissionItems=" + submissionItems +
                ", submitter=" + submitter +
                ", domain=" + domain +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                '}';
    }
}
