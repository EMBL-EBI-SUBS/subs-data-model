package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.Realm;

import java.util.List;

public interface Submittable {
    String getAccession();

    String getAlias();

    Domain getDomain();

    String getUuid();
    void setUuid(String uuid);

    String getTitle();

    String getDescription();

    List<Attribute> getAttributes();

    String getStatus();

    Realm getRealm();
}