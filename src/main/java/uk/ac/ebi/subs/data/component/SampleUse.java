package uk.ac.ebi.subs.data.component;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Records the use of a sample
 */
@ToString
@EqualsAndHashCode
public class SampleUse implements Attributes {

    public SampleUse() {
    }


    public SampleUse(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    SampleRef sampleRef = new SampleRef();
    Map<String,List<Attribute>> attributes = new LinkedHashMap<>();

    public SampleRef getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SampleRef sampleRef) {
        this.sampleRef = sampleRef;
    }

    @Override
    public Map<String, List<Attribute>> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Map<String, List<Attribute>> attributes) {
        this.attributes = attributes;
    }
}
