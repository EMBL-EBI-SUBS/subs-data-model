package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.File;
import uk.ac.ebi.subs.data.component.Files;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public class AssayData extends AbstractSubsEntity<AssayData> implements Files {

    SubsLink<Assay> assayRef = new SubsLink<Assay>();
    SubsLink<Sample> sampleRef = new SubsLink();
    List<File> files = new ArrayList<File>();

    public SubsLink<Assay> getAssayRef() {
        return assayRef;
    }

    public void setAssayRef(SubsLink<Assay> assayRef) {
        this.assayRef = assayRef;
    }

    public SubsLink<Sample> getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink<Sample> sampleRef) {
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
