package uk.ac.ebi.subs.data.submittable.sample.msi;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@EqualsAndHashCode
public class Submission {

    private String title;
    private String identifier;
    private String description;
    private String version;
    private Boolean referenceLayer;
    private LocalDate updateDate;
    private LocalDate releaseDate;
}
