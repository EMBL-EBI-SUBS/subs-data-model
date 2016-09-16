package uk.ac.ebi.subs.data.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidr on 08/08/2016.
 */
public class Contact {
    String firstName;
    String middleInitials;
    String lastName;
    String email;
    List<String> roles = new ArrayList<>();
    String address;
    String affiliation;
    String phone;
    String fax;

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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
        if (roles != null ? !roles.equals(contact.roles) : contact.roles != null) return false;
        if (address != null ? !address.equals(contact.address) : contact.address != null) return false;
        if (affiliation != null ? !affiliation.equals(contact.affiliation) : contact.affiliation != null) return false;
        if (phone != null ? !phone.equals(contact.phone) : contact.phone != null) return false;
        return fax != null ? fax.equals(contact.fax) : contact.fax == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (middleInitials != null ? middleInitials.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (affiliation != null ? affiliation.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", middleInitials='" + middleInitials + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                ", address='" + address + '\'' +
                ", affiliation='" + affiliation + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }
}
