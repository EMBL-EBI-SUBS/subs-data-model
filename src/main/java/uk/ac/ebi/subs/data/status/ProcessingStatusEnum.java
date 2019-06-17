package uk.ac.ebi.subs.data.status;

public enum ProcessingStatusEnum {
    Draft, /* exists in the usi system */
    Submitted, /* user has Submitted document */
    Dispatched, /* usi has dispatched object to archive */
    Received, /* archive has received object */
    Curation, /* archive is curating object */
    ActionRequired, /* curator has requested changes from user*/
    Accepted, /* archive has accepted object */
    Processing, /* archive is processing object */
    Completed, /* archive has processed object */
    Rejected, /* archive has rejected the data because is unsuitable*/
    Error, /* archive has rejected the submitted document because it should not have been acceptted by the validation system*/
    ArchiveDisabled /* archive has benn turned off to dispatch submittables to them */
    ;
}
