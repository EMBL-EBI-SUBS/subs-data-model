package uk.ac.ebi.subs.data.component;

/**
 * Created by davidr on 08/08/2016.
 */
public class Contact {
    String firstName;
    String middleInitials;
    String lastName;
    String email;
    String role;
    String address;
    String affiliation;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitials() {
        return middleInitials;
    }

    public void setMiddleInitials(String middleInitials) {
        this.middleInitials = middleInitials;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (middleInitials != null ? !middleInitials.equals(contact.middleInitials) : contact.middleInitials != null)
            return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (email != null ? !email.equals(contact.email) : contact.email != null) return false;
        if (role != null ? !role.equals(contact.role) : contact.role != null) return false;
        if (address != null ? !address.equals(contact.address) : contact.address != null) return false;
        return affiliation != null ? affiliation.equals(contact.affiliation) : contact.affiliation == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (middleInitials != null ? middleInitials.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (affiliation != null ? affiliation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", middleInitials='" + middleInitials + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", address='" + address + '\'' +
                ", affiliation='" + affiliation + '\'' +
                '}';
    }
}
