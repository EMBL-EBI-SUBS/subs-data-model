package uk.ac.ebi.subs.data.status;


import java.util.Objects;

/**
 * Describes which status transitions are permitted
 */
public class StatusTransition {

    public StatusTransition() {
    }

    public StatusTransition(String nextStatusName, boolean transitionedBySubmitter) {
        this.nextStatusName = nextStatusName;
        this.transitionedBySubmitter = transitionedBySubmitter;
    }

    private String nextStatusName;
    private boolean transitionedBySubmitter;

    public String getNextStatusName() {
        return nextStatusName;
    }

    public void setNextStatusName(String nextStatusName) {
        this.nextStatusName = nextStatusName;
    }

    public boolean isTransitionedBySubmitter() {
        return transitionedBySubmitter;
    }

    public void setTransitionedBySubmitter(boolean transitionedBySubmitter) {
        this.transitionedBySubmitter = transitionedBySubmitter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusTransition that = (StatusTransition) o;
        return transitionedBySubmitter == that.transitionedBySubmitter &&
                Objects.equals(nextStatusName, that.nextStatusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextStatusName, transitionedBySubmitter);
    }

    @Override
    public String toString() {
        return "StatusTransition{" +
                "nextStatusName='" + nextStatusName + '\'' +
                ", transitionedBySubmitter=" + transitionedBySubmitter +
                '}';
    }
}
