
import javax.swing.JOptionPane;

public class Employee extends Person {
	private String dateHired;// day hired
	private String hourlyRate;// hourly rate
	private String position;// position of work

	public Employee(String address, String name, String phone, String email, int id, String dateHired,
			String hourlyRate, String position) {

		super(address, name, phone, email, id);

		this.dateHired = dateHired;
		this.hourlyRate = hourlyRate;
		this.position = position;
		
		position = JOptionPane.showInputDialog("\nPosition: ");
		setPosition(position);
		
		
		dateHired = JOptionPane.showInputDialog("\nDate hired: ");
		setDateHired(dateHired);

		
		hourlyRate = JOptionPane.showInputDialog("\nHourly rate: ");
		setHourlyRate(hourlyRate);
	}

	
	public void editor(String address, String name, String phone, String email, int id, String dateHired,
			String hourlyRate, String position) {

		editor(address, name, phone, email, id);
		
		position = JOptionPane.showInputDialog("\nPosition: ");
		setPosition(position);
		
		
		dateHired = JOptionPane.showInputDialog("\nDate hired: ");
		setDateHired(dateHired);

		
		hourlyRate = JOptionPane.showInputDialog("\nHourly rate: ");
		setHourlyRate(hourlyRate);

		

	}

	@Override
	public String toString() {
		super.toString();
		return "\nEmployee\n*************\n\nName = " + Person.getName() + "\nPhone = " + Person.getPhone() + "\nEmail = "
				+ Person.getEmail() + "\nAddress = " + Person.getAddress() + "\nDate Hired = " + dateHired + "\nHourly Rate = "
				+ hourlyRate + "\nPosition = " + position;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public String getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(String hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
