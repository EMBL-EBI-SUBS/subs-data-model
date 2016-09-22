package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class Analysis extends AbstractSubsEntity<Analysis> implements Files {

    List<SubsLink<Analysis>> analysisRefs = new ArrayList<>();
    List<SubsLink<AssayData>> assayDataRefs = new ArrayList<>();

    List<Analysis> embeddedEntities  =  new ArrayList<>();
    List<File> files = new ArrayList<File>();

    public List<SubsLink<Analysis>> getAnalysisRefs() {
        return analysisRefs;
    }

    public void setAnalysisRefs(List<SubsLink<Analysis>> analysisRefs) {
        this.analysisRefs = analysisRefs;
    }

    public List<SubsLink<AssayData>> getAssayDataRefs() {
        return assayDataRefs;
    }

    public void setAssayDataRefs(List<SubsLink<AssayData>> assayDataRefs) {
        this.assayDataRefs = assayDataRefs;
    }

    public List<Analysis> getEmbeddedEntities() {
        return embeddedEntities;
    }

    public void setEmbeddedEntities(List<Analysis> embeddedEntities) {
        this.embeddedEntities = embeddedEntities;
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
