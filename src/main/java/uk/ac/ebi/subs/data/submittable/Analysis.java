package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Analysis extends BaseSubmittable<Analysis> implements Files {

    private List<AnalysisRef> analysisRefs = new ArrayList<>();
    private List<AssayDataRef> assayDataRefs = new ArrayList<>();
    private List<StudyRef> studyRefs = new ArrayList<>();
    private List<SampleRef> sampleRefs = new ArrayList<>();
    private List<AssayRef> assayRefs = new ArrayList<>();

    private List<ProtocolUse> protocolUses = new ArrayList<>();
    private List<File> files = new ArrayList<File>();

    @Override
    protected AnalysisRef newRef() {
        return new AnalysisRef();
    }

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

    @Override
    public List<File> getFiles() {
        return files;
    }

    @Override
    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<ProtocolUse> getProtocolUses() {
        return protocolUses;
    }

    public void setProtocolUses(List<ProtocolUse> protocolUses) {
        this.protocolUses = protocolUses;
    }

}
