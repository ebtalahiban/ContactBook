import java.util.Scanner;

public class ContactBook {

    private final static int maxContacts = 100;
    private String[][] contactbook;
    private int contactCount;

    public ContactBook(){
        this.contactbook = new String[maxContacts][2];
        this.contactCount = 0;
    }
    /** Add new contact to the contact book.*/
    public String addContact(String name, String phoneNumber){
        // Do not all to add contact with duplicate name.
        String response = "";
        for(int i=0; i<contactCount; i++){
            if(contactbook[i][0].equals(name)){
                return "Contact name already exist.";
            }
        }
        if(contactCount <= maxContacts){
            contactbook[contactCount][0] = name;
            contactbook[contactCount][1] = phoneNumber;
            contactCount++;
            return "Contact successfully added.";
        }
        else{
            return "Contact Book is full.";
        }
    }
    /**Search information in the contact book using name as key.*/
    public String searchContact(String name){
        for(int i=0; i<contactCount; i++){
            if(contactbook[i][0].equals(name)){
                System.out.println("Name: " + contactbook[i][0]);
                System.out.println("Phone number : " + contactbook[i][1]);
                return "Contact found.";
            }
        }
        return "Contact does not exist.";
    }
    /**Delete an item in the contact book.*/
    public String deleteContact(String name){
        // find contact
        for(int i=0; i<contactCount; i++){
            if(contactbook[i][0].equals(name)){
                // delete contact and adjust array
                for(int j=i; j<contactCount-1; j++){
                    contactbook[j][0] = contactbook[j+1][0];
                    contactbook[j][1] = contactbook[j+1][1];
                }
                contactCount--;
                return "Contact successfully deleted.";
            }
        }
        return "Contact does not exist.";
    }
    /**Display all the contact in the contact book.*/
    public void displayContact(){
        for(int i=0; i<contactCount; i++){
            System.out.println("Name: " + contactbook[i][0]);
            System.out.println("Phone number : " + contactbook[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contact = new ContactBook();

        while (true){
            String name;
            String phoneNumber;
            System.out.println("Contact Book");
            System.out.println("1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Display contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    name = scanner.next();
                    System.out.print("Enter phone number: ");
                    phoneNumber = scanner.next();
                    System.out.println(contact.addContact(name, phoneNumber));
                }
                case 2 -> {
                    System.out.print("Enter name to search: ");
                    name = scanner.next();
                    contact.searchContact(name);
                }
                case 3 -> {
                    System.out.print("Enter name to delete: ");
                    name = scanner.next();
                    System.out.println(contact.deleteContact(name));
                }
                case 4 -> {
                    System.out.println("List of all your contacts");
                    contact.displayContact();
                }
                case 5 -> {
                    System.out.print("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.print("Invalid input.");
            }
        }
    }
}
