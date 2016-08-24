package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.Contact;
import uk.ac.ebi.subs.data.component.Contacts;

import java.util.ArrayList;
import java.util.List;

public class EgaDac extends AbstractSubsEntity implements Contacts {
    List<Contact> contacts = new ArrayList<Contact>();

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
