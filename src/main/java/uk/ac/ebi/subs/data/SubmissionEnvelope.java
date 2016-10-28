package uk.ac.ebi.subs.data;


import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.submittable.Sample;

import java.util.*;

public class SubmissionEnvelope {

    Submission submission;

    Set<SampleRef> supportingSamplesRequired = new HashSet<>();
    List<Sample> supportingSamples = new ArrayList<>();



    public SubmissionEnvelope() {};

    public  SubmissionEnvelope(Submission submission){
        this.submission = submission;
    }


    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public Set<SampleRef> getSupportingSamplesRequired() {
        return supportingSamplesRequired;
    }

    public void setSupportingSamplesRequired(Set<SampleRef> supportingSamplesRequired) {
        this.supportingSamplesRequired = supportingSamplesRequired;
    }

    public List<Sample> getSupportingSamples() {
        return supportingSamples;
    }

    public void setSupportingSamples(List<Sample> supportingSamples) {
        this.supportingSamples = supportingSamples;
    }
}
