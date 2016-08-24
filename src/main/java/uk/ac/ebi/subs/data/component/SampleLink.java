package uk.ac.ebi.subs.data.component;


public class SampleLink extends SubsLink {
    String relationshipNature; // e.g. Child of

    public String getRelationshipNature() {
        return relationshipNature;
    }

    public void setRelationshipNature(String relationshipNature) {
        this.relationshipNature = relationshipNature;
    }
}
