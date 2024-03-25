package org.tugas.tugas3;

import java.util.ArrayList;

public class ContactList {
  private ArrayList<Contact> contacts = new ArrayList<>();

  public void addContact(Contact contact) {
    this.contacts.add(contact);
  }

  public void editContact(Contact contactToEdit, Contact editedContact) {
    for (Contact contact : this.contacts) {
      if (contactToEdit.equals(contact)) {
        contact.setName(editedContact.getName());
        contact.setNumber(editedContact.getNumber());
        contact.setEmail(editedContact.getEmail());
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
    if (this.contacts.size() > 0) {
      int counter = 1;

      for (Contact contact : this.contacts) {
        System.out.println(counter + ". " + contact.getName());
        counter++;
      }
    } else {
      System.out.println("You have no contact.");
    }

  }
}
