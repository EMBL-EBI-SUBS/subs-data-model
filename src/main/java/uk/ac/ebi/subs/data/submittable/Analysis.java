package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

/*
    Caution - Spring data does not apply indexes from parent classes
     the index definition has to be in the child classes

    The compound indexes block below should in sync with the reference copy in AbstractSubsEntity
 */
@CompoundIndexes({
        @CompoundIndex(name = "domain_alias", def = "{ 'domain.name': 1, 'alias': 1 }"),
        @CompoundIndex(name = "accession", def = "{ 'accession': 1}"),
        @CompoundIndex(name = "submissionId_status", def= "{ 'submissionId': 1, 'status': 1}")
})
//@Document TODO - there is a potential cyclic reference that is flagged up when you have @Document - reconsider design
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
    protected AnalysisRef newRef() {
        return new AnalysisRef();
    }


}
