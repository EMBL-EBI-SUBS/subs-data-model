package uk.ac.ebi.subs.data.status;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.*;

@EqualsAndHashCode
@ToString
public class StatusDescription {

    public static StatusDescription build(Enum status, String description){
        return build(status.name(),description);
    }

    public static StatusDescription build(String statusName, String description){
        return new StatusDescription(statusName,description);
    }

    private String statusName;
    private String description;
    private Set<String> systemTransitions = new TreeSet<>();
    private Set<String> userTransitions = new TreeSet<>();

    public StatusDescription() {
    }

    public StatusDescription(String statusName, String description) {
        this.statusName = statusName;
        this.description = description;
    }

    public StatusDescription addUserTransition(Enum status){
        return addUserTransition(status.name());
    }

    public StatusDescription addUserTransition(String statusName){
        userTransitions.add(statusName);
        return this;
    }

    public StatusDescription addSystemTransition(Enum status){
        return addSystemTransition(status.name());
    }

    public StatusDescription addSystemTransition(String statusName){
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
}
