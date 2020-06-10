package uk.ac.ebi.subs.data.submittable.sample;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Person {

    private String firstName;
    private String lastName;
    private String initials;
    private String email;
    private String role;
}
