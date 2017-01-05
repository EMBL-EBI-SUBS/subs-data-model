package uk.ac.ebi.subs.data.status;


import java.util.*;

public class Status {

    public static Status build(Enum status,String description){
        return build(status.name(),description);
    }

    public static Status build(String statusName,String description){
        return new Status(statusName,description);
    }

    private String statusName;
    private String description;
    private Set<String> systemTransitions = new TreeSet<>();
    private Set<String> userTransitions = new TreeSet<>();

    public Status() {
    }

    public Status(String statusName, String description) {
        this.statusName = statusName;
        this.description = description;
    }

    public Status addUserTransition(Enum status){
        return addUserTransition(status.name());
    }

    public Status addUserTransition(String statusName){
        userTransitions.add(statusName);
        return this;
    }

    public Status addSystemTransition(Enum status){
        return addSystemTransition(status.name());
    }

    public Status addSystemTransition(String statusName){
        systemTransitions.add(statusName);
        return this;
    }

    public Set<String> getSystemTransitions() {
        return systemTransitions;
    }

    public void setSystemTransitions(Set<String> systemTransitions) {
        this.systemTransitions = systemTransitions;
    }

    public Set<String> getUserTransitions() {
        return userTransitions;
    }

    public void setUserTransitions(Set<String> userTransitions) {
        this.userTransitions = userTransitions;
    }

    public boolean isUserTransitionPermitted(String newStatusName){
        return userTransitions.contains(newStatusName);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(statusName, status.statusName) &&
                Objects.equals(description, status.description) &&
                Objects.equals(systemTransitions, status.systemTransitions) &&
                Objects.equals(userTransitions, status.userTransitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusName, description, systemTransitions, userTransitions);
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusName='" + statusName + '\'' +
                ", description='" + description + '\'' +
                ", systemTransitions=" + systemTransitions +
                ", userTransitions=" + userTransitions +
                '}';
    }
}
