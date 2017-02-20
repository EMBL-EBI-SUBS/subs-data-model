package uk.ac.ebi.subs.data.submittable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.hateoas.Identifiable;
import uk.ac.ebi.subs.data.component.Archive;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.status.ProcessingStatusEnum;

import java.util.List;

public interface Submittable extends Identifiable<String>{

    void setId(String id);

    String getAccession();

    void setAccession(String accession);

    String getAlias();

    void setAlias(String alias);

    Domain getDomain();

    void setDomain(Domain domain);

    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String description);

    List<Attribute> getAttributes();

    void setAttributes(List<Attribute> attributes);

    Archive getArchive();

    void setArchive(Archive archive);

    @JsonIgnore
    default boolean isAccessioned(){
        return (this.getAccession() != null && !this.getAccession().isEmpty());
    }

}