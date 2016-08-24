package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

public class EgaDacPolicy extends AbstractSubsEntity{
    SubsLink dacRef = new SubsLink();

    public SubsLink getDacRef() {
        return dacRef;
    }

    public void setDacRef(SubsLink dacRef) {
        this.dacRef = dacRef;
    }
}
