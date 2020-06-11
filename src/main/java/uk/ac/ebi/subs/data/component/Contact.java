package uk.ac.ebi.subs.data.component;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Contact {
    private String firstName;
    private String middleInitials;
    private String lastName;
    private String email;
    private List<String> roles = new ArrayList<>();
    private String orcid;
    private String phone;
    private String fax;
    private String affiliation;
    private String address;
    private String affiliationURI;
    private String affiliationRole;
}
