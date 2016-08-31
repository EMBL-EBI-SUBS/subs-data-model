package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

public class EgaDacPolicy extends AbstractSubsEntity{
    SubsLink<EgaDac> dacRef = new SubsLink();

    public SubsLink<EgaDac> getDacRef() {
        return dacRef;
    }

    public void setDacRef(SubsLink<EgaDac> dacRef) {
        this.dacRef = dacRef;
    }
}
