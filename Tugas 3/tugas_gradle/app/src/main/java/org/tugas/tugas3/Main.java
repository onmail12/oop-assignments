package org.tugas.tugas3;

import java.util.Scanner;

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
                        contactList.addContact(readContact());
                        break;
                    case 3:
                        System.out.print("Enter contact name: ");
                        String oldName = scanner.nextLine();
                        Contact contact = contactList.getContactByName(oldName);

                        if (contact != null) {
                            Contact editedContact = readContact();
                            contactList.editContact(contact, editedContact);
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

    private static Contact readContact() {
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new phone number: ");
        String phoneNum = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        return new Contact(name, phoneNum, email);
    }

}