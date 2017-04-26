package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SampleRelationship extends SampleRef {
    private String relationshipNature; // e.g. Child of

    public String getRelationshipNature() {
        return relationshipNature;
    }

    public void setRelationshipNature(String relationshipNature) {
        this.relationshipNature = relationshipNature;
    }

}
