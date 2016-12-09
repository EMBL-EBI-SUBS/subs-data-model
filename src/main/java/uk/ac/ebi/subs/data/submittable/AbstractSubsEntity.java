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

@CompoundIndexes({
        @CompoundIndex(name = "domain_alias", def = "{ 'domain.name': 1, 'alias': 1 }"),
        @CompoundIndex(name = "accession", def = "{ 'accession': 1}")
})
public abstract class AbstractSubsEntity<T extends AbstractSubsEntity> implements Attributes, Submittable, Identifiable<String> {

   @DBRef(lazy = true)
   Submission submission;

   String type;
   String accession;
   String alias;
   String status;
   Archive archive;
   Domain domain;

   String title;
   String description;
   List<Attribute> attributes = new ArrayList<>();

    @Id
    String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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

    public void setAccession(String accession) {
        this.accession = accession;
    }

    @Override
    public String getAlias() {
        return alias;
    }

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
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

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

    @Override
    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    protected abstract AbstractSubsRef<T> newRef();

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
    public boolean isAccessioned(){
        return (accession != null && !accession.isEmpty());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSubsEntity<?> that = (AbstractSubsEntity<?>) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (accession != null ? !accession.equals(that.accession) : that.accession != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
        if (archive != that.archive) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return attributes != null ? attributes.equals(that.attributes) : that.attributes == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (accession != null ? accession.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (archive != null ? archive.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AbstractSubsEntity{" +
                "type='" + type + '\'' +
                ", accession='" + accession + '\'' +
                ", alias='" + alias + '\'' +
                ", status='" + status + '\'' +
                ", domain=" + domain +
                ", archive=" + archive +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
