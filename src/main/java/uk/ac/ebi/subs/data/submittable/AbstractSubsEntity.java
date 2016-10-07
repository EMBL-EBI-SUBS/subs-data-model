package uk.ac.ebi.subs.data.submittable;


import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubsEntity<T extends AbstractSubsEntity> implements Attributes, Submittable {

    String type;
    String accession;
    String alias;
    String status;
    Domain domain;
    Archive archive;

    String title;
    String description;
    List<Attribute> attributes = new ArrayList<>();

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
}
