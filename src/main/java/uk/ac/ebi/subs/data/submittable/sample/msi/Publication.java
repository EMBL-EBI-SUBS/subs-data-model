package uk.ac.ebi.subs.data.submittable.sample.msi;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Publication {

    private Integer pubMedId;

    /**
     * Digital Object Identifier
     */
    private String doi;
}
