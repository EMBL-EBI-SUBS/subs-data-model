package uk.ac.ebi.subs.data.component;


import uk.ac.ebi.subs.data.submittable.Analysis;

public class AnalysisRef extends AbstractSubsRef<Analysis> {
    Analysis referencedObject;

    @Override
    public Analysis getReferencedObject() {
        return referencedObject;
    }

    @Override
    public void setReferencedObject(Analysis referencedObject) {
        this.referencedObject = referencedObject;
    }
}
