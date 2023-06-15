public class ContactBook {

    private int maxContacts = 100;
    private String[][] contactbook;
    private int contactCount;

    public ContactBook(){
        this.contactbook = new String[maxContacts][2];
        this.contactCount = 0;
    }

    public void addContact(String name, String phoneNumber){
        if(contactCount <= maxContacts){
            contactbook[contactCount][0] = name;
            contactbook[contactCount][1] = phoneNumber;
            contactCount++;
            System.out.println("Contact successfully added.");
        }
        else{
            System.out.println("Contact Book is full.");
        }
    }

    public void searchContact(){

    }

    public void deleteContact(){

    }

    public void displayContact(){

    }

    public static void main(String[] args) {
        ContactBook contact = new ContactBook();
    }
}
