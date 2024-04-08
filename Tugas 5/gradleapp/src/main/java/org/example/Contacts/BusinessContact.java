package org.example.Contacts;

public class BusinessContact extends Contact {
    private Organization organization;

    public BusinessContact(String name, String number, String email, Organization organization) {
        super(name, number, email);
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrganization: " + this.organization;
    }

}
