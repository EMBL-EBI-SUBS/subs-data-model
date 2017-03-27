package uk.ac.ebi.subs.data.status;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.Submission;

@EqualsAndHashCode
@ToString
public class SubmissionStatus {

    private String status;

    public SubmissionStatus(){}

    public SubmissionStatus(SubmissionStatusEnum statusEnum){
        this.setStatus(statusEnum.name());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus(SubmissionStatusEnum submissionStatusEnum){
        this.status = submissionStatusEnum.name();
    }
}
