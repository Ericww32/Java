import java.util.Scanner;

public class Person{
	private String name;//persons name
	private String address;// address
	private String phone;//phone number
	private String email;//email
	private int id[];//id
	private int i; //int variable
	

	public Person(String name, String address, String phone, String email, int id[], int i) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.id = id;
		this.i = i;
	
	Scanner scanf = new Scanner(System.in);
	System.out.println("Enter a name for the person: ");
	name = scanf.nextLine();
	setName(name);
	System.out.println("Hello " + getName() + "\n");

	System.out.println("Please enter the address: ");
	address = scanf.nextLine();
	setAddress(address);
	
	System.out.println("Please enter the phone number: ");
	phone = scanf.nextLine();
	setPhone(phone);
	
	System.out.println("Please enter the email: ");
	email = scanf.nextLine();
	setEmail(email);
	
	int num = id.length;
	if (num <= 500){
		num++;
	}
	else if (num > 500 || num < 0){
		System.out.println("ERROR\n");
		System.out.println("System exit code " + num);
		System.exit(-1);
	}
	
	System.out.println("ID number is: ");
	num = id[i];
	
	scanf.close();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
