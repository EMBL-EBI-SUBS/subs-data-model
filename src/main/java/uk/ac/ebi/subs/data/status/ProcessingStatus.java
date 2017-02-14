package uk.ac.ebi.subs.data.status;

public enum ProcessingStatus {
    Draft, /* exists in the usi system */
    Submitted, /* user has Submitted document */
    Dispatched, /* usi has dispatched object to archive */
    Received, /* archive has received object */
    Curation, /* archive is curating object */
    ActionRequired, /* curator has requested changes from user*/
    Accepted, /* archive has accepted object */
    Processing, /* archive is processing object */
    Done, /* archive has processed object */
    Error /* internal error */
}
