package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.submittable.Sample;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SampleRelationship extends SampleRef {
    private String relationshipNature; // e.g. Child of
    private String targetAccession;

    public String getRelationshipNature() {
        return relationshipNature;
    }

    public void setRelationshipNature(String relationshipNature) {
        this.relationshipNature = relationshipNature;
    }

    public String getTargetAccession() {
        return targetAccession;
    }

    public void setTargetAccession(String targetAccession) {
        this.targetAccession = targetAccession;
    }
}
