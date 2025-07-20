import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactTest {

    @Test
    public void testContactClass() {
        Contact testContact = new Contact("0123456789", "Michael", "Foster", "1234567890", "1234 Test Address");
        assertEquals("0123456789", testContact.getContactId());
        assertEquals("Michael", testContact.getFirstName());
        assertEquals("Foster", testContact.getLastName());
        assertEquals("1234567890", testContact.getPhoneNumber());
        assertEquals("1234 Test Address", testContact.getAddress());
    }

    @Test
    public void testFieldLengths() {

        Object[][] Constructors = {
                {"01234567891", "Michael", "Foster", "1234567890", "1234 Test Address"}, //Id too long
                {"0123456789", "MichaelFoster", "Foster", "1234567890", "1234 Test Address"}, // First name too long
                {"0123456789", "Michael", "MichaelFoster", "1234567890", "1234 Test Address"}, // Last name too long
                {"0123456789", "Michael", "Foster", "12345678901", "1234 Test Address"}, // Phone number too long
                {"0123456789", "Michael", "Foster", "1234567890",
                        "1234 Test Address 1234 Test Address"} // Address too long
        };

        for (Object[] inputField : Constructors) {
            assertThrows(IllegalArgumentException.class, () -> {
                new Contact(
                        (String)inputField[0],
                        (String)inputField[1],
                        (String)inputField[2],
                        (String)inputField[3],
                        (String)inputField[4]);
            });
        }
    }

    @Test
    public void testNullInputs() {
        Object[][] Constructors = {
                {null, "Michael", "Foster", "1234567890", "1234 Test Address"}, //Id null
                {"0123456789", null, "Foster", "1234567890", "1234 Test Address"}, // First name null
                {"0123456789", "Michael", null, "1234567890", "1234 Test Address"}, // Last name null
                {"0123456789", "Michael", "Foster", null, "1234 Test Address"}, // Phone number null
                {"0123456789", "Michael", "Foster", "1234567890",null} // Address null
        };

        for (Object[] inputField : Constructors) {
            assertThrows(IllegalArgumentException.class, () -> {
                new Contact(
                        (String)inputField[0],
                        (String)inputField[1],
                        (String)inputField[2],
                        (String)inputField[3],
                        (String)inputField[4]);
            });
        }
    }

}
