package uk.ac.ebi.subs.data.submittable;


import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.Contact;
import uk.ac.ebi.subs.data.component.Contacts;
import uk.ac.ebi.subs.data.component.EgaDacRef;

import java.util.ArrayList;
import java.util.List;

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
