package uk.ac.ebi.subs.data;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.Identifiable;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.Submitter;

import java.util.Date;

@CompoundIndexes({
        @CompoundIndex(name = "domain_rev_submission_date", def = "{ 'domain.name': 1, 'submissionDate': -1 }")
})
@ToString
@EqualsAndHashCode
@Document
public class Submission implements Identifiable<String> {

    public Submission() {
    }

    public Submission(Submission s) {
        this.id = s.id;
        this.submitter = s.submitter;
        this.domain = s.domain;
        this.submissionDate = s.submissionDate;
        this.createdDate = s.createdDate;
    }

    @Id
    private String id;
    private Submitter submitter = new Submitter();
    private Domain domain = new Domain();
    private Date submissionDate;

    @Version
    private Long version;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;

    @Override
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
