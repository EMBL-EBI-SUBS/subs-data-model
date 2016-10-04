package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class AssayData extends AbstractSubsEntity<AssayData> implements Files {

    AssayRef assayRef = new AssayRef();
    SampleRef sampleRef = new SampleRef();
    List<File> files = new ArrayList<File>();

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
    protected AbstractSubsRef<AssayData> newRef() {
        return new AssayDataRef();
    }
}
