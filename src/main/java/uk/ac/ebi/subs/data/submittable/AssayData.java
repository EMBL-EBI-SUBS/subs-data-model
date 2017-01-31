package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class AssayData extends BaseSubmittable<AssayData> implements Files  {

    private AssayRef assayRef = new AssayRef();
    private SampleRef sampleRef = new SampleRef();
    private List<File> files = new ArrayList<File>();

    @Override
    protected AssayDataRef newRef() {
        return new AssayDataRef();
    }

    public AssayRef getAssayRef() {
        return assayRef;
    }

    public void setAssayRef(AssayRef assayRef) {
        this.assayRef = assayRef;
    }

    public SampleRef getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    @Override
    public void setFiles(List<File> files) {
        this.files = files;
    }
}


