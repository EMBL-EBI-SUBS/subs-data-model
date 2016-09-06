package uk.ac.ebi.subs.data.component;


import uk.ac.ebi.subs.data.submittable.Sample;

public class SampleLink extends SubsLink<Sample> {
    String relationshipNature; // e.g. Child of

    public String getRelationshipNature() {
        return relationshipNature;
    }

    public void setRelationshipNature(String relationshipNature) {
        this.relationshipNature = relationshipNature;
    }
}
