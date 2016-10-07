package uk.ac.ebi.subs.data;


import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.submittable.Sample;

import java.util.*;

public class SubmissionEnvelope {

    Submission submission;

    List<Class> handlerHistory = new ArrayList<>();

    Set<SampleRef> supportingSamplesRequired = new HashSet<>();
    List<Sample> supportingSamples = new ArrayList<>();



    public SubmissionEnvelope() {};

    public  SubmissionEnvelope(Submission submission){
        this.submission = submission;
    }

    public Class mostRecentHandler(){
        if (handlerHistory == null || handlerHistory.isEmpty()){
            return null;
        }
        else {
            return handlerHistory.get(handlerHistory.size() - 1);
        }
    }

    public void addHandler(Class handlerClass){
        handlerHistory.add(handlerClass);
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public List<Class> getHandlerHistory() {
        return handlerHistory;
    }

    public void setHandlerHistory(List<Class> handlerHistory) {
        this.handlerHistory = handlerHistory;
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
