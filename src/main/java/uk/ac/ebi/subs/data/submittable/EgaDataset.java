package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class EgaDataset extends AbstractSubsEntity<EgaDataset> {

    @Id
    String id;

    List<AssayDataRef> dataRefs = new ArrayList<>();
    List<AnalysisRef> analysisRefs = new ArrayList<>();
    EgaDacPolicyRef egaDacPolicyRef = new EgaDacPolicyRef();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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

    @Override
    protected EgaDatasetRef newRef() {
        return new EgaDatasetRef();
    }
}
