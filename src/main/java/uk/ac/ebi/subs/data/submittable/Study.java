package uk.ac.ebi.subs.data.submittable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class Study extends BaseSubmittable<Study> implements Submittable {


    private List<ProtocolRef> protocolRefs = new ArrayList<>();
    private ProjectRef projectRef = new ProjectRef();
    private LocalDate releaseDate;

    @Override
    protected StudyRef newRef() {
        return new StudyRef();
    }
}
