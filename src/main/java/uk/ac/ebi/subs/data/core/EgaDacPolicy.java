package uk.ac.ebi.subs.data.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.EgaDacPolicyRef;
import uk.ac.ebi.subs.data.component.EgaDacRef;

@ToString
@EqualsAndHashCode
public class EgaDacPolicy extends BaseSubmittable<EgaDacPolicy> {

    EgaDacRef dacRef = new EgaDacRef();

    public EgaDacRef getDacRef() {
        return dacRef;
    }

    public void setDacRef(EgaDacRef dacRef) {
        this.dacRef = dacRef;
    }

    @Override
    protected EgaDacPolicyRef newRef() {
        return new EgaDacPolicyRef();
    }
}
