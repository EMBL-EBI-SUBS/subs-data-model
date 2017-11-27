package uk.ac.ebi.subs.data.component;

import lombok.Data;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Records the use of a sample
 */
@Data
public class SampleUse implements Attributes {

    public SampleUse() {
    }


    public SampleUse(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    private SampleRef sampleRef = new SampleRef();
    private Map<String, Collection<Attribute>> attributes = new LinkedHashMap<>();

    public SampleRef getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    @Override
    public Map<String, Collection<Attribute>> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Map<String, Collection<Attribute>> attributes) {
        this.attributes = attributes;
    }
}
