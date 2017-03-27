package uk.ac.ebi.subs.data.validation;

/**
 * Controlled vocabulary for validation outcomes
 */
public enum ValidationOutcomeEnum {
    Pass, //we will accept this
    Error, // we will not accept this
    Warning; // we will accept this, but you may wish to reconsider
}
