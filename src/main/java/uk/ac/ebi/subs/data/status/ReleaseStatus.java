package uk.ac.ebi.subs.data.status;


/**
 * Release status describes how visible
 */
public enum ReleaseStatus {
    Draft, /* exists in the USI system*/
    Private, /* exists in an archive system, but is not released yet */
    Cancelled, /* exists in an archive system, but should not be released */
    Public, /* available through an archive system */
    Suppressed, /* available through an archive system, but not indexed for searching */
    Killed /* metadata available through an archive system, but not indexed for searching. Data files are not available*/
    ;
}
