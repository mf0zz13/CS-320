import java.util.HashMap;

public class Contact_Service {

    String uniqueId;
    long idNumber = 0;
    HashMap<String, Contact> contacts = new HashMap<String,Contact>();

    public void addContact (String firstName, String lastName, String number, String address){
        try {
            uniqueId = String.valueOf(idNumber);
            idNumber++;

            Contact tempContact = new Contact(uniqueId, firstName, lastName, number, address);
            contacts.put(uniqueId, tempContact);
        }catch (Exception e){
            idNumber--;
            System.err.println(e.getMessage());
        }
    }

    public void deleteContact(String uniqueId) {
        try {
            if (contacts.containsKey(uniqueId)) {
                contacts.remove(uniqueId);
            }
            else {throw new IllegalArgumentException("Contact ID does not exist in contacts");}
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateFirstName(String uniqueId, String firstName) {
        try {
            if (contacts.containsKey(uniqueId)) {
                Contact tempContact = contacts.get(uniqueId);
                tempContact.setFirstName(firstName);
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateLastName(String uniqueId, String lastName) {
        try {
            if (contacts.containsKey(uniqueId)) {
                Contact tempContact = contacts.get(uniqueId);
                tempContact.setLastName(lastName);
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void updateNumber(String uniqueId, String number) {
        try {
            if (contacts.containsKey(uniqueId)) {
                Contact tempContact = contacts.get(uniqueId);
                tempContact.setPhoneNumber(number);
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void updateAddress(String uniqueId, String address) {
        try {
            if (contacts.containsKey(uniqueId)) {
                Contact tempContact = contacts.get(uniqueId);
                tempContact.setAddress(address);
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
