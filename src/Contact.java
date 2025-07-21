public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
        if (contactId == null || contactId.length() > 10) {throw new IllegalArgumentException("Contact Id input is invalid");}
        else {this.contactId = contactId;}
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public String getContactId() {return contactId;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {// Check if value is null or greater than 10 digits
            throw new IllegalArgumentException("Input string is invalid");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {return lastName;}
    
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {// Check if value is null or greater than 10 digits
            throw new IllegalArgumentException("Input string is invalid");
        } else {
            this.lastName = lastName;
        }
    }
    
    public String getPhoneNumber() {return phoneNumber;}
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() > 10) { // Check if value is null or greater than 10 digits
            throw new IllegalArgumentException("Input string is invalid");
        } else if (phoneNumber.chars().anyMatch(Character::isAlphabetic)) {
            throw new IllegalArgumentException("Input string is invalid");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getAddress() {return address;}

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {// Check if value is null or greater than 30 digits
            throw new IllegalArgumentException("Input string is invalid");
        } else {
            this.address = address;
        }
    }

}