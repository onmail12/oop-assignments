package com.tugas3;

import java.util.ArrayList;

public class ContactList {
  private ArrayList<Contact> contacts = new ArrayList<>();

  public void addContact(String name, String number, String email) {
    this.contacts.add(new Contact(name, number, email));
  }

  public void addContact(Contact contact) {
    this.contacts.add(contact);
  }

  public void editContactByName(String oldName, String name, String number, String email) {
    for (Contact contact : this.contacts) {
      if (oldName.equals(contact.getName())) {
        contact.setName(name);
        contact.setNumber(number);
        contact.setEmail(email);
      }
    }
  }

  public void removeContactByName(String name) {
    for (Contact contact : this.contacts) {
      if (name.equals(contact.getName())) {
        this.contacts.remove(contact);
        break;
      }
    }
  }

  public Contact getContactByName(String name) {
    for (Contact contact : this.contacts) {
      if (contact.getName().equals(name)) {
        return contact;
      }
    }
    return null;
  }

  public void displayAllContact() {
    int counter = 1;
    for (Contact contact : this.contacts) {
      System.out.println(counter + ". " + contact.getName());
    }

  }
}
