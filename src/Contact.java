public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public String getContactId() {return contactId;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {
        if (firstName.length() > 10) {
            throw new IllegalArgumentException("Input string exceeds the maximum character amount");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {return lastName;}
    
    public void setLastName(String lastName) {
        if (lastName.length() > 10) {
            throw new IllegalArgumentException("Input string exceeds the maximum character amount");
        } else {
            this.lastName = firstName;
        }
    }
    
    public String getPhoneNumber() {return phoneNumber;}
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            throw new IllegalArgumentException("Input string exceeds the maximum character amount");
        } else if (phoneNumber.chars().anyMatch(Character::isAlphabetic)) {
            throw new IllegalArgumentException("Input string must only contain numbers");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getAddress() {return address;}

    public void setAddress(String address) {
        if (address.length() > 30) {
            throw new IllegalArgumentException("Input string exceeds the maximum character amount");
        } else {
            this.address = address;
        }
    }

}