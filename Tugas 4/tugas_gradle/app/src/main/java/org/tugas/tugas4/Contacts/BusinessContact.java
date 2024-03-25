package org.tugas.tugas4.Contacts;

public class BusinessContact extends Contact {
    private String organization;

    public BusinessContact(String name, String number, String email, String organization) {
        super(name, number, email);
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrganization: " + this.organization;
    }

}
