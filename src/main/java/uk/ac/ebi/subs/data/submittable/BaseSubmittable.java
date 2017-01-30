package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.hateoas.Identifiable;
import org.springframework.util.Assert;
import uk.ac.ebi.subs.data.component.*;
import uk.ac.ebi.subs.data.status.ProcessingStatus;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
public abstract class BaseSubmittable<T extends BaseSubmittable> implements Submittable, Attributes, Identifiable<String>{

    private String id;
    private String accession;
    private String alias;
    private String status;
    private Archive archive;
    private Domain domain;

    private String title;
    private String description;
    private List<Attribute> attributes = new ArrayList<>();

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

    protected abstract AbstractSubsRef<T> newRef();


    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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
    public void setStatus(ProcessingStatus status) {
        Assert.notNull(status);
        this.status = status.name();
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
}
