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
public class AssayData extends AbstractSubsEntity<AssayData> implements Files {


    AssayRef assayRef = new AssayRef();
    SampleRef sampleRef = new SampleRef();
    List<File> files = new ArrayList<File>();

    public SampleRef getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    public AssayRef getAssayRef() {
        return assayRef;
    }

    public void setAssayRef(AssayRef assayRef) {
        this.assayRef = assayRef;
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
    protected AssayDataRef newRef() {
        return new AssayDataRef();
    }
}
