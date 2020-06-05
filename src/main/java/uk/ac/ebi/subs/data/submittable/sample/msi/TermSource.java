package uk.ac.ebi.subs.data.submittable.sample.msi;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class TermSource {

    private String name;
    private String uri;
    private String version;
}
