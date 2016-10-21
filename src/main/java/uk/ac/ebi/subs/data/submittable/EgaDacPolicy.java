package uk.ac.ebi.subs.data.submittable;


import org.springframework.data.annotation.Id;
import uk.ac.ebi.subs.data.component.AbstractSubsRef;
import uk.ac.ebi.subs.data.component.EgaDacPolicyRef;
import uk.ac.ebi.subs.data.component.EgaDacRef;

public class EgaDacPolicy extends AbstractSubsEntity<EgaDacPolicy> {

    @Id
    String id;

    EgaDacRef dacRef = new EgaDacRef();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public AbstractSubsRef<EgaDac> getDacRef() {
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
