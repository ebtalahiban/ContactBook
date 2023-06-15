public class ContactBook {

    private final static int maxContacts = 100;
    private String[][] contactbook;
    private int contactCount;

    public ContactBook(){
        this.contactbook = new String[maxContacts][2];
        this.contactCount = 0;
    }
    /** Add new contact to the contact book.*/
    public void addContact(String name, String phoneNumber){
        // Do not all to add contact with duplicate name.
        for(int i=0; i<contactCount; i++){
            if(contactbook[i][0].equals(name)){
                System.out.println("Contact name already exist.");
                return;
            }
        }
        if(contactCount <= maxContacts){
            contactbook[contactCount][0] = name;
            contactbook[contactCount][1] = phoneNumber;
            System.out.println("Contact successfully added.");
            contactCount++;
        }
        else{
            System.out.println("Contact Book is full.");
        }
    }
    /**Search information in the contact book using name as key.*/
    public void searchContact(String name){
        for(int i=0; i<contactCount; i++){
            if(contactbook[i][0].equals(name)){
                System.out.println("Contact found.");
                System.out.println("Name: " + contactbook[i][0]);
                System.out.println("Phone number : " + contactbook[i][1]);
                return;
            }
            else{
                System.out.println("Contact does not exist.");
            }
        }
    }
    /**Delete an item in the contact book.*/
    public void deleteContact(String name){
        // find contact
        for(int i=0; i<contactCount; i++){
            if(contactbook[i][0].equals(name)){
                // delete contact and adjust array
                for(int j=i; j<contactCount-1; j++){
                    contactbook[j][0] = contactbook[j+1][0];
                    contactbook[j][1] = contactbook[j+1][1];
                }
                contactCount--;
                System.out.println("Contact successfully deleted.");
                return;
            }
        }
    }
    /**Display all the contact in the contact book.*/
    public void displayContact(){
        for(int i=0; i<contactCount; i++){
            System.out.println("Name: " + contactbook[i][0]);
            System.out.println("Phone number : " + contactbook[i][1]);
        }
    }

    public static void main(String[] args) {
        ContactBook contact = new ContactBook();
        contact.addContact("Erica", "12345");
        contact.addContact("Angel", "67891");
        contact.addContact("Appa", "25896");
        contact.addContact("Appa", "25896");
        contact.displayContact();
        contact.searchContact("Erica");
        contact.deleteContact("Erica");
        contact.displayContact();
    }
}
