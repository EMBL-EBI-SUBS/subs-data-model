package uk.ac.ebi.subs.data.validation;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Validation outcome for an entity
 *
 * e.g. Assay needs to have an attribute called "library strategy", but this is not present
 *
 */
@ToString
@EqualsAndHashCode
public class EntityValidationOutcome {

    private String message;
    private ValidationOutcomeEnum outcome;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidationOutcomeEnum getOutcome() {
        return outcome;
    }

    public void setOutcome(ValidationOutcomeEnum outcome) {
        this.outcome = outcome;
    }
}
