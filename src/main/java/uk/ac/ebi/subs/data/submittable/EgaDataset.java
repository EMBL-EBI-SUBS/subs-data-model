package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public class EgaDataset extends AbstractSubsEntity {
    List<SubsLink> dataRefs = new ArrayList<SubsLink>();
    List<SubsLink> analysisRefs = new ArrayList<SubsLink>();

    public List<SubsLink> getDataRefs() {
        return dataRefs;
    }

    public void setDataRefs(List<SubsLink> dataRefs) {
        this.dataRefs = dataRefs;
    }

    public List<SubsLink> getAnalysisRefs() {
        return analysisRefs;
    }

    public void setAnalysisRefs(List<SubsLink> analysisRefs) {
        this.analysisRefs = analysisRefs;
    }
}
