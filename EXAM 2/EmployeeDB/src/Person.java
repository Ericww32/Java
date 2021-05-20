import javax.swing.JOptionPane;

public class Person {
	private static int nextId;
	private static String name;// persons name
	private static String phone;// phone number
	private static String email;// email
	private static String address;
	private static int id;

	public Person(String address, String name, String phone, String email, int id) {

		super();

		Person.name = name;
		Person.phone = phone;
		Person.email = email;
		Person.address = address;
		Person.id = id;


		name = JOptionPane.showInputDialog("\nEnter the name for the person: ");
		setName(name);

		address = JOptionPane.showInputDialog("\nEnter the  address: ");
		setAddress(address);

		phone = JOptionPane.showInputDialog("\nEnter the phone number: ");
		setPhone(phone);

		email = JOptionPane.showInputDialog("\nEnter the email address: ");
		setEmail(email);

		nextId++;
		JOptionPane.showMessageDialog(null, "\nYour Person ID is " + nextId);
		id = nextId;
		setId(id);


	}

	public static int getThatID(int search) {
		String idSearch;
		
		idSearch = JOptionPane.showInputDialog(null, "Enter I.D. number: ");
		Person.id = Integer.parseInt(idSearch);
		
		return getId();
	}
	
public void editor(String address, String name, String phone, String email, int id) {

		name = JOptionPane.showInputDialog("\nEnter the name for the person: ");
		setName(name);

		address = JOptionPane.showInputDialog("\nEnter the  address: ");
		setAddress(address);

		phone = JOptionPane.showInputDialog("\nEnter the phone number: ");
		setPhone(phone);

		email = JOptionPane.showInputDialog("\nEnter the email address: ");
		setEmail(email);


	}

	
@Override
	public String toString() {
		super.toString();
		return "\nPerson\n************\n\nName = " + name + "\nID number = " + id + "\nPhone = " + phone + "\nEmail = " + email + "\nAddress = "
				+ address;
	}


	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Person.name = name;
	}

	public static String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		Person.phone = phone;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Person.email = email;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		Person.address = address;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Person.id = id;
	}

}
