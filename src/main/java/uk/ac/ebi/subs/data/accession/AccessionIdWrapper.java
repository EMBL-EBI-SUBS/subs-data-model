package uk.ac.ebi.subs.data.accession;

import lombok.Data;

import java.util.List;

@Data
public class AccessionIdWrapper {

    private String submissionId;
    private String bioStudiesAccessionId;
    private List<String> bioSamplesAccessionIds;

}
