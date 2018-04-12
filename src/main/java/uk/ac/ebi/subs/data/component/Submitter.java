package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Submitter {
    private String email;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Submitter build(String email){
        Submitter submitter = new Submitter();
        submitter.setEmail(email);
        return submitter;
    }

}
