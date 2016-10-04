package uk.ac.ebi.subs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.ac.ebi.subs.data.component.Archive;

import java.util.ArrayList;
import java.util.List;

public class SubmissionEnvelope {

    Submission submission;

    List<Archive> handlers = new ArrayList<>();

    public SubmissionEnvelope() {};

    public  SubmissionEnvelope(Submission submission){
        this.submission = submission;
    }

    public Archive mostRecentHandler(){
        if (handlers == null || handlers.isEmpty()){
            return null;
        }
        else {
            return handlers.get(handlers.size() - 1);
        }
    }

    public void addHandler(Archive archive){
        handlers.add(archive);
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public List<Archive> getHandlers() {
        return handlers;
    }

    public void setHandlers(List<Archive> handlers) {
        this.handlers = handlers;
    }
}
