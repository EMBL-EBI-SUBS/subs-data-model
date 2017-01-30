package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Archive;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.status.ProcessingStatus;

import java.util.List;

public interface Submittable {

    String getId();
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

    String getStatus();

    void setStatus(String status);

    void setStatus(ProcessingStatus status);

    Archive getArchive();

    void setArchive(Archive archive);

    default boolean isAccessioned(){
        return (this.getAccession() != null && !this.getAccession().isEmpty());
    }

}