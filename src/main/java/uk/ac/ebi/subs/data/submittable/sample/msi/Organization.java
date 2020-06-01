package uk.ac.ebi.subs.data.submittable.sample.msi;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Organization {

    private String name;
    private String address;
    private String uri;
    private String role;
}
