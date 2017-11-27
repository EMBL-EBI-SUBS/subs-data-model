package uk.ac.ebi.subs.data.submittable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Attributes;
import uk.ac.ebi.subs.data.component.Team;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ToString
@EqualsAndHashCode
public abstract class BaseSubmittable<T extends BaseSubmittable> implements Submittable, Attributes {

    private String id;
    private String accession;
    private String alias;

    private Team team;

    private String title;
    private String description;
    private Map<String, Collection<Attribute>> attributes = new LinkedHashMap<>();

    public AbstractSubsRef<T> asRef() {
        AbstractSubsRef<T> subsLink = newRef();

        subsLink.setAccession(this.accession);
        subsLink.setTeam(this.getTeam().getName());
        subsLink.setAlias(this.alias);

        if (this.team != null) {
            subsLink.setTeam(this.getTeam().getName());
        }

        return subsLink;
    }

    protected abstract AbstractSubsRef<T> newRef();


    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getAccession() {
        return accession;
    }

    @Override
    public void setAccession(String accession) {
        this.accession = accession;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setAttributes(Map<String, Collection<Attribute>> attributes) {
        this.attributes = attributes;
    }

    @Override
    public Map<String, Collection<Attribute>> getAttributes() {
        return attributes;
    }


}
