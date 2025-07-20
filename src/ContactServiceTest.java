import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    @Test
    public void testAddContact() {
        ContactService testContactService = new ContactService();
        Object[][] Constructors = {
                {"Michael", "Foster", "1234567890", "1234 Test Address"},
                {"Ted", "Foster", "1234567890", "1234 Test Address"},
                {"Jake", "Foster", "1234567890", "1234 Test Address"}
        };

        for (Object[] inputField: Constructors) {
            assertDoesNotThrow(() -> {
                testContactService.addContact(
                        (String)inputField[0],
                        (String)inputField[1],
                        (String)inputField[2],
                        (String)inputField[3]);
            });
        }

   }

   @Test
    public void testDeleteContact() {
        ContactService testContractService = new ContactService();
        testContractService.addContact("Michael", "Foster", "1234567890", "1234 Test Address");
        assertTrue(testContractService.contacts.containsKey("0"));
        testContractService.deleteContact("0");
        assertTrue(testContractService.contacts.isEmpty());
   }

   @Test
    public void testUpdateFields() {
        ContactService testContractService = new ContactService();
        testContractService.addContact("Michael", "Foster", "1234567890", "1234 Test Address");

   }
}
