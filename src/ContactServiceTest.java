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

        assertDoesNotThrow(()->testContractService.updateFirstName("0","Foster"));
        assertDoesNotThrow(()->testContractService.updateLastName("0", "Michael"));
        assertDoesNotThrow(()->testContractService.updateNumber("0","0000000000"));
        assertDoesNotThrow(()->testContractService.updateAddress("0","0123456789 road 01234567890123"));

        Contact testContact = testContractService.contacts.get("0");

        assertEquals("Foster",testContact.getFirstName());
        assertEquals("Michael",testContact.getLastName());
        assertEquals("0000000000",testContact.getPhoneNumber());
        assertEquals("0123456789 road 01234567890123",testContact.getAddress());
   }
}
