package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.File;
import uk.ac.ebi.subs.data.component.Files;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public class AssayData extends AbstractSubsEntity implements Files {

    SubsLink assayRef = new SubsLink();
    SubsLink sampleRef = new SubsLink();
    List<File> files = new ArrayList<File>();

    public SubsLink getAssayRef() {
        return assayRef;
    }

    public void setAssayRef(SubsLink assayRef) {
        this.assayRef = assayRef;
    }

    public SubsLink getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink sampleRef) {
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
