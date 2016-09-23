package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.EgaDataset;

public class EgaDatasetRef extends AbstractSubsRef<EgaDataset>{
    EgaDataset referencedObject;

    @Override
    public EgaDataset getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(EgaDataset referencedObject) {
        this.referencedObject = referencedObject;
    }
}
