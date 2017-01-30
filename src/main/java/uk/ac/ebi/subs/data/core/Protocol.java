package uk.ac.ebi.subs.data.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.ProtocolRef;

@EqualsAndHashCode
@ToString
public class Protocol extends BaseSubmittable<Protocol> {

    @Override
    protected ProtocolRef newRef() {
        return new ProtocolRef();
    }
}
