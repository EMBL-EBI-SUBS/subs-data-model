package uk.ac.ebi.subs.data.component;


public class Submitter {
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Submitter submitter = (Submitter) o;

        return email != null ? email.equals(submitter.email) : submitter.email == null;

    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
