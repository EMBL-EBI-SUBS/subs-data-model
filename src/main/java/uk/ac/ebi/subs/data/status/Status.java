package uk.ac.ebi.subs.data.status;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Status {

    public static Status build(Enum status,String description){
        return build(status.name(),description);
    }

    public static Status build(String statusName,String description){
        return new Status(statusName,description);
    }

    private String statusName;
    private String description;
    private List<StatusTransition> statusTransitions = new ArrayList<>();

    public Status() {
    }

    public Status(String statusName, String description) {
        this.statusName = statusName;
        this.description = description;
    }

    public Status addTransition(Enum nextStatus){
        return this.addTransition(nextStatus.name(),false);
    }

    public Status addTransition(Enum nextStatus, boolean transitionedBySubmitter){
        return this.addTransition(nextStatus.name(),transitionedBySubmitter);
    }

    public Status addTransition(String nextStatusName, boolean transitionedBySubmitter){
        StatusTransition st = new StatusTransition(nextStatusName,transitionedBySubmitter);
        statusTransitions.add(st);

        return this;
    }



    public boolean isSubmitterTransitionPermitted(String newStatusName){
        Optional<StatusTransition> optionalStatusTransition = statusTransitions.stream().filter(
                statusTransition -> statusTransition.getNextStatusName().equals(newStatusName)
        ).findFirst();

        return (optionalStatusTransition.isPresent() && optionalStatusTransition.get().isTransitionedBySubmitter());
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<StatusTransition> getStatusTransitions() {
        return statusTransitions;
    }

    public void setStatusTransitions(List<StatusTransition> statusTransitions) {
        this.statusTransitions = statusTransitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(statusName, status.statusName) &&
                Objects.equals(description, status.description) &&
                Objects.equals(statusTransitions, status.statusTransitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusName, description, statusTransitions);
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusName='" + statusName + '\'' +
                ", description='" + description + '\'' +
                ", statusTransitions=" + statusTransitions +
                '}';
    }
}
