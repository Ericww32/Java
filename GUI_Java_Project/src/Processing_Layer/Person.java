package Processing_Layer;

/**
 * 
 * @author Eric Willoughby
 *
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long creditCard;
    private long ssn;


    public Person(String firstName, String lastName, int age, long creditCard, long ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.creditCard = creditCard;
        this.ssn = ssn;

    }

	public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

	@Override
	public String toString() {
		return "\nName: " + firstName + " " + lastName + "\nAGE: " + age + "\nCredit Card #"
				+ creditCard + "\nSSN #" + ssn + "\n_______________________________________";
	}

}
