package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
public class EgaDataset extends BaseSubmittable<EgaDataset> {

    private List<AssayDataRef> dataRefs = new ArrayList<>();
    private List<AnalysisRef> analysisRefs = new ArrayList<>();
    private EgaDacPolicyRef egaDacPolicyRef = new EgaDacPolicyRef();

    @Override
    protected EgaDatasetRef newRef() {
        return new EgaDatasetRef();
    }

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

    public EgaDacPolicyRef getEgaDacPolicyRef() {
        return egaDacPolicyRef;
    }

    public void setEgaDacPolicyRef(EgaDacPolicyRef egaDacPolicyRef) {
        this.egaDacPolicyRef = egaDacPolicyRef;
    }
}
