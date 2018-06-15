package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.ac.ebi.subs.data.submittable.Submittable;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Submitter build(String email){
        Submitter submitter = new Submitter();
        submitter.setEmail(email);
        return submitter;
    }

    public static Submitter build(String email, String name){
        Submitter submitter = build(email);
        submitter.setName(name);
        return submitter;
    }


}
