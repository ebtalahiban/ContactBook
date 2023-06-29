import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ContactBookTest {

    @Test
    public void testAddContact(){
        var contactBook = new ContactBook();
        assertEquals("Contact successfully added.", contactBook.addContact("Appa", "09261952535"));
    }
}
