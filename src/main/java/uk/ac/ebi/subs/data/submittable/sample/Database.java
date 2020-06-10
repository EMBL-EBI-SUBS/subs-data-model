package uk.ac.ebi.subs.data.submittable.sample;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Database {

    private String name;
    private String id;
    private String uri;
}
