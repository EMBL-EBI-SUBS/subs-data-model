package uk.ac.ebi.subs.data.submittable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Attributes;
import uk.ac.ebi.subs.data.component.Team;

import java.util.Collection;
import java.util.List;

public interface Submittable extends Attributes{

    String getId();

    void setId(String id);

    String getAccession();

    void setAccession(String accession);

    String getAlias();

    void setAlias(String alias);

    Team getTeam();

    void setTeam(Team team);

    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String description);

    @JsonIgnore
    default boolean isAccessioned(){
        return (this.getAccession() != null && !this.getAccession().isEmpty());
    }

}