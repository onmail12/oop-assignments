package org.tugas.tugas4;

import java.util.Scanner;
import org.tugas.tugas4.Contacts.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main() {
        ContactList contactList = new ContactList();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice != 0) {
                switch (choice) {
                    case 1:
                        contactList.displayAllContact();
                        System.out.print("Press enter to continue"); 
                        scanner.nextLine();
                        break;
                    case 2:
                        System.out.println("1. Default Contact");
                        System.out.println("2. Personal Contact");
                        System.out.println("3. Business Contact");
                        System.out.print("Choose a contact type:");

                        int contactType = scanner.nextInt();
                        scanner.nextLine();

                        contactList.addContact(readContact(contactType));
                        break;
                    case 3:
                        System.out.print("Enter contact name: ");
                        String oldName = scanner.nextLine();
                        Contact contact = contactList.getContactByName(oldName);

                        if (contact instanceof PersonalContact) {
                            contactList.editContact(contact, readContact(2));
                        } else if (contact instanceof BusinessContact) {
                            contactList.editContact(contact, readContact(3));
                        } else if (contact instanceof Contact) {
                            contactList.editContact(contact, readContact(1));
                        }
                        break;
                    case 4:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        contactList.removeContactByName(name);
                        break;
                    case 5:
                        System.out.print("Enter name: ");
                        name = scanner.nextLine();

                        System.out.println(contactList.getContactByName(name).toString());
                        System.out.print("Press enter to continue");
                        scanner.nextLine();
                        break;
                    default:
                        break;
                }
            } else {
                break;
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("::: Contact Menu :::");
        System.out.println("1. Show all contacts");
        System.out.println("2. Add a contact");
        System.out.println("3. Edit a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Show contact detail");
        System.out.println("0. Exit");
        System.out.print("Choose one: ");
    }

    private static Contact readContact(int contactType) {
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new phone number: ");
        String phoneNum = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        if (contactType == 1) {
            return new Contact(name, phoneNum, email);
        } else if (contactType == 2) {
            System.out.print("Enter a nickname: ");
            String nickname = scanner.nextLine();
            return new PersonalContact(name, phoneNum, email, nickname);
        } else if (contactType == 3) {
            System.out.print("Enter an organization: ");
            String organization = scanner.nextLine();
            return new BusinessContact(name, phoneNum, email, organization);
        }

        return null;
    }
}