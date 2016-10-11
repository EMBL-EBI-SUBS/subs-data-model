package uk.ac.ebi.subs.data.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Records the use of a sample
 */
public class SampleUse implements Attributes {
    SampleRef sampleRef = new SampleRef();
    List<Attribute> attributes = new ArrayList<>();

    public SampleRef getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
