
public class PERSON {
	private String name;
	private int age;
	private double salory;
	public PERSON(String name, int age, double salory) {
		this.name = name;
		this.age = age;
		this.salory = salory;
	}//end of constructor
	
	public String getName() {
		return name;
	}
	public void setGuy(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalory() {
		return salory;
	}
	public void setSalory(double salory) {
		this.salory = salory;
	}
}//end of class
