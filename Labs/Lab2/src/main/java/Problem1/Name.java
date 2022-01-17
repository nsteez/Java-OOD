package Problem1;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;



    public Name(String firstName) {
      this.firstName = firstName;
    }

    public Name(String firstName, String middleName) {
      this.firstName = firstName;
      this.middleName = middleName;
    }

    public Name(String firstName, String middleName, String lastName) {
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
    }

    public String getFirstName() {
      return firstName;
    }

    public String getMiddleName() {
      return middleName;
    }

    public String getLastName() {
      return lastName;
    }
  }


