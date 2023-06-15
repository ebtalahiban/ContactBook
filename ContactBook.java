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
            }
            else{
                System.out.println("Contact does not exist.");
            }
        }
    }
    /**Delete an item in the contact book.*/
    public void deleteContact(){

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
    }
}
