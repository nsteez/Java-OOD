package Problem1;

public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    /**
     * Constructor that creates a new Owner object with the specified firstname and
     * lastname.
     *
     * @param firstName   - first name of the Owner object.
     * @param lastName    - last name of the Owner object.
     * @param phoneNumber - phone number of the Owner object.
     */
    public Owner(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    /**
     * Returns the first name of the Owner.
     * @return the first name of the Owner.
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Returns the lastName of the Owner.
     * @return the lastName of the Owner.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the phoneNumber of the Owner.
     * @return the phoneNumber of the Owner.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Sets the firstName of the Owner.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Sets the lastName of the Owner.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the phoneNumber of the Owner
     */
    public void setPhoneNumber(String phoneNumber) {
        if (testPhoneLength(phoneNumber) == true){
            this.phoneNumber = phoneNumber;
        }

    }
    /**
     * Checks if length of phoneNumber equals 10
     * returns true or false
     */
    public boolean testPhoneLength(String phoneNumber){
        int phoneNumberLength = phoneNumber.length();
        return phoneNumberLength == 10;
    }
}