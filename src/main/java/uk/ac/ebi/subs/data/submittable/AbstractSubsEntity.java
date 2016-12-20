package uk.ac.ebi.subs.data.submittable;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.hateoas.Identifiable;
import uk.ac.ebi.subs.data.Submission;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@CompoundIndexes({
        @CompoundIndex(name = "domain_alias", def = "{ 'domain.name': 1, 'alias': 1 }"),
        @CompoundIndex(name = "accession", def = "{ 'accession': 1}")
})
public abstract class AbstractSubsEntity<T extends AbstractSubsEntity> implements Attributes, Submittable, Identifiable<String> {

    @Id
    String id;

    String submissionId;

    String type;
    String accession;
    String alias;
    String status;
    Archive archive;
    Domain domain;

    String title;
    String description;
    List<Attribute> attributes = new ArrayList<>();


    public AbstractSubsRef<T> asRef(){
        AbstractSubsRef<T> subsLink = newRef();

        subsLink.setAccession(this.accession);
        subsLink.setDomain(this.getDomain().getName());
        subsLink.setAlias(this.alias);

        if (this.archive != null){
            subsLink.setArchive(this.archive.name());
        }
        if (this.domain != null){
            subsLink.setDomain(this.getDomain().getName());
        }

        return subsLink;
    }

    @Override
    @JsonIgnore
    public boolean isAccessioned() {
        return (accession != null && !accession.isEmpty());
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getSubmissionId() {
        return submissionId;
    }

    @Override
    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getAccession() {
        return accession;
    }

    @Override
    public void setAccession(String accession) {
        this.accession = accession;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Archive getArchive() {
        return archive;
    }

    @Override
    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    @Override
    public Domain getDomain() {
        return domain;
    }

    @Override
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    protected abstract AbstractSubsRef<T> newRef();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSubsEntity<?> that = (AbstractSubsEntity<?>) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(submissionId, that.submissionId) &&
                Objects.equals(type, that.type) &&
                Objects.equals(accession, that.accession) &&
                Objects.equals(alias, that.alias) &&
                Objects.equals(status, that.status) &&
                archive == that.archive &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, submissionId, type, accession, alias, status, archive, domain, title, description, attributes);
    }

    @Override
    public String toString() {
        return "AbstractSubsEntity{" +
                "id='" + id + '\'' +
                ", submissionId='" + submissionId + '\'' +
                ", type='" + type + '\'' +
                ", accession='" + accession + '\'' +
                ", alias='" + alias + '\'' +
                ", status='" + status + '\'' +
                ", archive=" + archive +
                ", domain=" + domain +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
