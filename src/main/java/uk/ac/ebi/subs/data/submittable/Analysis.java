package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class Analysis extends AbstractSubsEntity<Analysis> implements Files {

    List<Analysis> embeddedEntities  =  new ArrayList<>();
    List<SubsLink<Submittable>> references = new ArrayList<SubsLink<Submittable>>();
    List<File> files = new ArrayList<File>();

    public List<Analysis> getEmbeddedEntities() {
        return embeddedEntities;
    }

    public void setEmbeddedEntities(List<Analysis> embeddedEntities) {
        this.embeddedEntities = embeddedEntities;
    }

    public List<SubsLink<Submittable>> getReferences() {
        return references;
    }

    public void setReferences(List<SubsLink<Submittable>> references) {
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
