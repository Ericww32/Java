
public class Manager extends Employee{
	private String title;//management title 
	private String department;// department name
	
	public Manager(String name, String address, int phone, String email, int dateHired, double hourlyRate,
			String position, String title, String department) {
		super(name, address, phone, email, dateHired, hourlyRate, position);
		this.title = title;
		this.department = department;
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
