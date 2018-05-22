package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class AssayData extends BaseSubmittable<AssayData> implements Files  {

    private List<AssayRef> assayRefs;
    private List<File> files = new ArrayList<File>();

    @Override
    protected AssayDataRef newRef() {
        return new AssayDataRef();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    @Override
    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<AssayRef> getAssayRefs() {
        return assayRefs;
    }

    public void setAssayRefs(List<AssayRef> assayRefs) {
        this.assayRefs = assayRefs;
    }
}


