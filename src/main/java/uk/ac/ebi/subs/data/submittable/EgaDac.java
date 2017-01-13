package uk.ac.ebi.subs.data.submittable;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.subs.data.component.Contact;
import uk.ac.ebi.subs.data.component.Contacts;
import uk.ac.ebi.subs.data.component.EgaDacRef;

import java.util.ArrayList;
import java.util.List;

/*
    Caution - Spring data does not apply indexes from parent classes
     the index definition has to be in the child classes

    The compound indexes block below should in sync with the reference copy in AbstractSubsEntity
 */
@CompoundIndexes({
        @CompoundIndex(name = "domain_alias", def = "{ 'domain.name': 1, 'alias': 1 }"),
        @CompoundIndex(name = "accession", def = "{ 'accession': 1}"),
        @CompoundIndex(name = "submissionId_status", def= "{ 'submissionId': 1, 'status': 1}")
})
@Document
public class EgaDac extends AbstractSubsEntity<EgaDac> implements Contacts {

    List<Contact> contacts = new ArrayList<Contact>();

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    protected EgaDacRef newRef() {
        return new EgaDacRef();
    }
}
