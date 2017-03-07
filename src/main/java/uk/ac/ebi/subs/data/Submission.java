package uk.ac.ebi.subs.data;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.*;
import org.springframework.hateoas.Identifiable;
import uk.ac.ebi.subs.data.component.Team;
import uk.ac.ebi.subs.data.component.Submitter;

import java.util.Date;

@ToString
@EqualsAndHashCode
public class Submission implements Identifiable<String> {

    public Submission() {
    }

    public Submission(Submission s) {
        this.id = s.id;
        this.submitter = s.submitter;
        this.team = s.team;
    }

    @Id
    private String id;
    private Submitter submitter = new Submitter();
    private Team team = new Team();
    private Date submissionDate;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Submitter getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}
