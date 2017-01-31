package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.Contact;
import uk.ac.ebi.subs.data.component.Contacts;
import uk.ac.ebi.subs.data.component.EgaDacRef;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EgaDac extends BaseSubmittable<EgaDac> implements Contacts{

    private List<Contact> contacts = new ArrayList<Contact>();

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
