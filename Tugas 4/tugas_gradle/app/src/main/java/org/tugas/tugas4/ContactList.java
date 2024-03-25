package org.tugas.tugas4;

import java.util.ArrayList;

import org.tugas.tugas4.Contacts.*;

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

        if (contactToEdit instanceof BusinessContact) {
          BusinessContact editedBusinessContact = (BusinessContact) editedContact;
          BusinessContact businessContact = (BusinessContact) contact;

          businessContact.setOrganization(editedBusinessContact.getOrganization());
        } else if (contactToEdit instanceof PersonalContact) {
          PersonalContact editedPersonalContact = (PersonalContact) editedContact;
          PersonalContact personalContact = (PersonalContact) contact;

          personalContact.setNickname(editedPersonalContact.getNickname());
        }
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
