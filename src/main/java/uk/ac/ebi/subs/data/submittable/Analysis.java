package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class Analysis extends AbstractSubsEntity<Analysis> implements Files {

    List<AnalysisRef> analysisRefs = new ArrayList<>();
    List<AssayDataRef> assayDataRefs = new ArrayList<>();
    List<StudyRef> studyRefs = new ArrayList<>();
    List<SampleRef> sampleRefs = new ArrayList<>();
    List<AssayRef> assayRefs = new ArrayList<>();

    public List<StudyRef> getStudyRefs() {
        return studyRefs;
    }

    public void setStudyRefs(List<StudyRef> studyRefs) {
        this.studyRefs = studyRefs;
    }

    public List<SampleRef> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SampleRef> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }

    public List<AssayRef> getAssayRefs() {
        return assayRefs;
    }

    public void setAssayRefs(List<AssayRef> assayRefs) {
        this.assayRefs = assayRefs;
    }

    List<Analysis> embeddedEntities  =  new ArrayList<>();
    List<File> files = new ArrayList<File>();

    public List<AnalysisRef> getAnalysisRefs() {
        return analysisRefs;
    }

    public void setAnalysisRefs(List<AnalysisRef> analysisRefs) {
        this.analysisRefs = analysisRefs;
    }

    public List<AssayDataRef> getAssayDataRefs() {
        return assayDataRefs;
    }

    public void setAssayDataRefs(List<AssayDataRef> assayDataRefs) {
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

    @Override
    protected AbstractSubsRef<Analysis> newRef() {
        return new AnalysisRef();
    }


}
