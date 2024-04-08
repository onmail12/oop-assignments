package org.example.Contacts;

public class Organization {
    private String name;
    private String phoneNumber;
    private String email;

    public Organization(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Organization name: " + this.name + "\n" + "Organization Phone Number: " + this.phoneNumber + "\n" + "Organization email: " + this.email;
    }
}
