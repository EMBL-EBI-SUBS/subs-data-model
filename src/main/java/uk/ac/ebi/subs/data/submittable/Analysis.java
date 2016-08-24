package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class Analysis extends AbstractSubsEntity implements Files {

    List<AbstractSubsEntity> embeddedEntities  =  new ArrayList<AbstractSubsEntity>();
    List<SubsLink> references = new ArrayList<SubsLink>();
    List<File> files = new ArrayList<File>();

    public List<AbstractSubsEntity> getEmbeddedEntities() {
        return embeddedEntities;
    }

    public void setEmbeddedEntities(List<AbstractSubsEntity> embeddedEntities) {
        this.embeddedEntities = embeddedEntities;
    }

    public List<SubsLink> getReferences() {
        return references;
    }

    public void setReferences(List<SubsLink> references) {
        this.references = references;
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    @Override
    public void setFiles(List<File> files) {
        this.files = files;
    }
}
