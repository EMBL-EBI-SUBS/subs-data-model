package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public class EgaDataset extends AbstractSubsEntity {
    List<SubsLink<AssayData>> dataRefs = new ArrayList<SubsLink<AssayData>>();
    List<SubsLink<Analysis>> analysisRefs = new ArrayList<SubsLink<Analysis>>();

    public List<SubsLink<AssayData>> getDataRefs() {
        return dataRefs;
    }

    public void setDataRefs(List<SubsLink<AssayData>> dataRefs) {
        this.dataRefs = dataRefs;
    }

    public List<SubsLink<Analysis>> getAnalysisRefs() {
        return analysisRefs;
    }

    public void setAnalysisRefs(List<SubsLink<Analysis>> analysisRefs) {
        this.analysisRefs = analysisRefs;
    }
}
