
public class Employee extends Person{
	private int dateHired;// day hired
	private double hourlyRate;// hourly rate
	private String position;//position of work
	
	public Employee(String name, String address, int phone, 
			String email, int dateHired, double hourlyRate,
			String position) {
		super(name, address, phone, email);
		this.dateHired = dateHired;
		this.hourlyRate = hourlyRate;
		this.position = position;
	}
	
	public int getDateHired() {
		return dateHired;
	}
	public void setDateHired(int dateHired) {
		this.dateHired = dateHired;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public String getPostion() {
		return position;
	}
	public void setPostion(String position) {
		this.position = position;
	}

}
