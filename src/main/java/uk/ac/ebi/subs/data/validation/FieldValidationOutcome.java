package uk.ac.ebi.subs.data.validation;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * A field is valid, invalid or a bit wonky
 *
 * e.g. this is supposed to be a date in format dd-mm-yyyy, but the value supplied does not match the format expected
 *
 */
@ToString
@EqualsAndHashCode
public class FieldValidationOutcome {

    private String property; //path to the field in question
    private String invalidValue;
    private String message;
    private ValidationOutcomeEnum outcome;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getInvalidValue() {
        return invalidValue;
    }

    public void setInvalidValue(String invalidValue) {
        this.invalidValue = invalidValue;
    }

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
