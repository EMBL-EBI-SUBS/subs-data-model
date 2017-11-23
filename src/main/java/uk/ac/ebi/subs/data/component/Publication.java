package uk.ac.ebi.subs.data.component;


import lombok.Data;

@Data
public class Publication {
    private String pubmedId;
    private String doi;
    private String articleTitle;
    private String journalTitle;
    private String authors;
    private String journalIssn;
    private String issue;
    private String year;
    private String volume;
    private String pageInfo;
    private PublicationStatus status;
}
