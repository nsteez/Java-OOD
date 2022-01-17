public class Person {

    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getFullName(){
        return this.firstname + " " + this.lastname;
    }
}
