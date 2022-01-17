package Problem2;

import java.util.Objects;

public class Recipient {
    protected String firstName;
    protected String lastName;
    protected String email;

  /**
   * Constructor for the Recipient class
   * @param firstName - firstName of recipient
   * @param lastName lastName of recipient
   * @param email - email of recipient
   */
    public Recipient(String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
    }

  /**
   * Getter for the Recipient firstname.
   * @return First Name
   */
  public String getFirstName() {
      return this.firstName;
    }

  /**
   * Sets first name.
   * @param firstName - firstname of recipient
   */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

  /**
   * Getter for the Recipient lastname.
   * @return last Name
   */
    public String getLastName() {
      return this.lastName;
    }

  /**
   * Sets last name of Recipient.
   * @param lastName - lastname of recipient
   */
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

  /**
   * Getter for the Recipient email.
   * @return email
   */
  public String getEmail() {
      return this.email;
    }

  /**
   * Sets email for Recipient.
   * @param email of Recipient
   */
    public void setEmail(String email) {
      this.email = email;
    }

  /**
   * Compares objects of two Recipients
   * @param o - Recipient to be compared.
   * @return - true or false
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return Objects.equals(firstName, recipient.firstName) && Objects
        .equals(lastName, recipient.lastName) && Objects.equals(email, recipient.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email);
  }
}


