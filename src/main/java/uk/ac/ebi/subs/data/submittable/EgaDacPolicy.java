package uk.ac.ebi.subs.data.submittable;


import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.EgaDacPolicyRef;
import uk.ac.ebi.subs.data.component.EgaDacRef;

public class EgaDacPolicy extends AbstractSubsEntity<EgaDacPolicy> {
    EgaDacRef dacRef = new EgaDacRef();

    public AbstractSubsRef<EgaDac> getDacRef() {
        return dacRef;
    }

    public void setDacRef(EgaDacRef dacRef) {
        this.dacRef = dacRef;
    }

    @Override
    protected AbstractSubsRef<EgaDacPolicy> newRef() {
        return new EgaDacPolicyRef();
    }
}
