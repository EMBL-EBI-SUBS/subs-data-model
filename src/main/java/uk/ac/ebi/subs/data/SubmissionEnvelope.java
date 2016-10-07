package uk.ac.ebi.subs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.ac.ebi.subs.data.component.Archive;

import java.util.ArrayList;
import java.util.List;

public class SubmissionEnvelope {

    Submission submission;

    List<Class> handlerHistory = new ArrayList<>();



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
}
