


public class Person {
    private final String firstName;
    private final String lastName;
    private final String age;
    private final String middleName;

    private final String fear;
 

     

    public Person(String firstName, String lastName, String age, String middleName, String fear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.middleName = middleName;

        this.fear = fear;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String middleName() {
        return middleName;
    }
    public String getAge() {
        return age;
           
    }

    public String getFear() {
        return fear;
    }
  @Override
    public String toString() {
        return String.format(" %s, %s, %s, %s", this.firstName, this.lastName, this.middleName, this.age );

    }
}