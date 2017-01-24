package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.submittable.Sample;

@ToString
@EqualsAndHashCode
public class SampleRelationship extends SampleRef {
    String relationshipNature; // e.g. Child of

    public String getRelationshipNature() {
        return relationshipNature;
    }

    public void setRelationshipNature(String relationshipNature) {
        this.relationshipNature = relationshipNature;
    }
}
