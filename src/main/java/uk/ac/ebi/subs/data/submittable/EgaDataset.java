package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@Document
@ToString
@EqualsAndHashCode
public class EgaDataset extends AbstractSubsEntity<EgaDataset> {



    List<AssayDataRef> dataRefs = new ArrayList<>();
    List<AnalysisRef> analysisRefs = new ArrayList<>();
    EgaDacPolicyRef egaDacPolicyRef = new EgaDacPolicyRef();

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
