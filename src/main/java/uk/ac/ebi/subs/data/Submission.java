package uk.ac.ebi.subs.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.hateoas.Identifiable;
import uk.ac.ebi.subs.data.annotation.CascadeSave;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.submittable.Protocol;
import uk.ac.ebi.subs.data.component.Submitter;
import uk.ac.ebi.subs.data.submittable.*;

import java.util.*;
import java.util.stream.Stream;

@CompoundIndexes({
        @CompoundIndex(name = "domain_rev_submission_date", def = "{ 'domain.name': 1, 'submissionDate': -1 }")
})
public class Submission implements Identifiable<String>{
    @Id
    String id;
    Submitter submitter = new Submitter();

    Domain domain = new Domain();
    Date submissionDate = new Date();
    String status;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public String toString() {
        return "Submission{" +
                "id='" + id + '\'' +
                ", submitter=" + submitter +
                ", domain=" + domain +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Submission that = (Submission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(submitter, that.submitter) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(submissionDate, that.submissionDate) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, submitter, domain, submissionDate, status);
    }
}
