package uk.ac.ebi.subs.data.submittable.sample;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@EqualsAndHashCode
public class Submission {

    private String title;
    private String description;
    private LocalDate updateDate;
    private LocalDate releaseDate;
}
