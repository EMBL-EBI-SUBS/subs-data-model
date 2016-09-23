package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.AnalysisRef;
import uk.ac.ebi.subs.data.component.AssayDataRef;
import uk.ac.ebi.subs.data.component.EgaDatasetRef;

import java.util.ArrayList;
import java.util.List;

public class EgaDataset extends AbstractSubsEntity<EgaDataset> {
    List<AssayDataRef> dataRefs = new ArrayList<>();
    List<AnalysisRef> analysisRefs = new ArrayList<>();

    public List<AssayDataRef> getDataRefs() {
        return dataRefs;
    }

    public void setDataRefs(List<AssayDataRef> dataRefs) {
        this.dataRefs = dataRefs;
    }

    public List<AnalysisRef> getAnalysisRefs() {
        return analysisRefs;
    }

    public void setAnalysisRefs(List<AnalysisRef> analysisRefs) {
        this.analysisRefs = analysisRefs;
    }

    @Override
    protected AbstractSubsRef<EgaDataset> newRef() {
        return new EgaDatasetRef();
    }
}
