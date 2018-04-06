package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Map;
import java.util.TreeMap;

@ToString
@EqualsAndHashCode
public class Team {

    public Team () {}

    private String name;
    private String description;
    private Map<String,String> profile = new TreeMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getProfile() {
        return profile;
    }

    public void setProfile(Map<String, String> profile) {
        this.profile = profile;
    }

    public static Team build(String name){
        Team team = new Team();
        team.setName(name);
        return team;
    }
}
