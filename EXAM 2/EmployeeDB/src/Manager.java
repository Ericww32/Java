import javax.swing.JOptionPane;


public class Manager extends Employee {
	private String title;// management title
	private String department;// department name

	public Manager(String address, String name, String phone, String email, int id, String dateHired, String hourlyRate,
			String position, String title, String department) {

		super(address, name, phone, email, id, dateHired, hourlyRate, position);

		this.title = title;
		this.department = department;

		title = JOptionPane.showInputDialog("Title: ");
		setTitle(title);
		
		department = JOptionPane.showInputDialog("department: ");
		setDepartment(department);
	}

	public void editor(String address, String name, String phone, String email, int id, String dateHired, String hourlyRate,
			String position, String title, String department) {

		editor( address,  name,  phone,  email,  id,  dateHired,
				 hourlyRate,  position);
		
		title = JOptionPane.showInputDialog("Title: ");
		setTitle(title);
		
		department = JOptionPane.showInputDialog("department: ");
		setDepartment(department);;
	}

	@Override
	public String toString() {
		return "\nManager\n*************\n\nName = " + getName() + "\nPhone = " + getPhone() + "\nEmail = " + getEmail()
				+ "\nAddress = " + getAddress() + "\nDate Hired = " + getDateHired() + "\nHourly Rate = "
				+ getHourlyRate() + "\nPosition = " + getPosition() + "\nTitle = " + title + "\nDepartment = "
				+ department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
