import java.io.Serializable;

public class Person implements Serializable{


	public static String birthday;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static String firstName;
	static String lastName;
	static String city;
	static String email;
	static String group;
	static String address;
	static String areaCode;
	static String exchangeNumber;
	static String localNumber;
	static int month;
	static int day;
	static int year;
	static int index;

	

	public Person(String firstName, String lastName, String city, String email, String group, String address,
			String areaCode, String exchangeNumber, String localNumber, int month, int day, int year) {
		super();
		Person.firstName = firstName;
		Person.lastName = lastName;
		Person.city = city;
		Person.email = email;
		Person.group = group;
		Person.address = address;
		Person.areaCode = areaCode;
		Person.exchangeNumber = exchangeNumber;
		Person.localNumber = localNumber;
		Person.month = month;
		Person.day = day;
		Person.year = year;
	}

	public static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		Person.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		Person.lastName = lastName;
	}

	public static String getCity() {
		return city;
	}

	public void setCity(String city) {
		Person.city = city;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Person.email = email;
	}

	public static String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		Person.group = group;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		Person.address = address;
	}

	public static String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		Person.areaCode = areaCode;
	}

	public static String getExchangeNumber() {
		return exchangeNumber;
	}

	public void setExchangeNumber(String exchangeNumber) {
		Person.exchangeNumber = exchangeNumber;
	}

	public static String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		Person.localNumber = localNumber;
	}

	public static int getIndex() {
		return index;
	}

	@SuppressWarnings("static-access")
	public void setIndex(int index) {
		this.index = index;
	}
	
	static String phoneNumber = "(" + areaCode + ")" + exchangeNumber + "-" + localNumber;
	
	public static String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		Person.phoneNumber = phoneNumber;
	}


}
