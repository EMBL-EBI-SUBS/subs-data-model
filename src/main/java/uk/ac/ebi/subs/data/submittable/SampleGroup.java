package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.component.SampleGroupRef;
import uk.ac.ebi.subs.data.component.SampleRef;
import uk.ac.ebi.subs.data.submittable.sample.msi.Database;
import uk.ac.ebi.subs.data.submittable.sample.msi.Organization;
import uk.ac.ebi.subs.data.submittable.sample.msi.Person;
import uk.ac.ebi.subs.data.submittable.sample.msi.Publication;
import uk.ac.ebi.subs.data.submittable.sample.msi.Submission;
import uk.ac.ebi.subs.data.submittable.sample.msi.TermSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SampleGroup extends Sample {
}
