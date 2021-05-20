
public class Person extends Name {

	private char gender;
	private int age;
	private float salary;

	public Person(String first_name, String middle_name, 
			String last_name, char gender, int age, float salary) {
		super(first_name, middle_name, last_name);
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", "
				+ "salary=" + salary + ", getFirst_name()="
				+ getFirst_name() + ", getMiddle_name()=" 
				+ getMiddle_name() + ", getLast_name()=" 
				+ getLast_name() + ", toString()=" 
				+ super.toString() + "]";
	}

	

}
