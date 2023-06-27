
public class GOLF extends ATHLETE{

	public GOLF(String name, int age, double salory, String team, String position) {
		super(name, age, salory, team, position);
		
		
	}
	public void doThis(){
		System.out.println("I am the most interesting person you will ever meet!...EVER!");
		
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof GOLF)) {
			return false;
		}

		boolean result = false;

		if (this.getPosition() == ((GOLF) obj).getPosition()) {
			result = true;
		}

		return result;
	}
	
	@Override
	public String toString() {
		return "GOLF [Team: " + getTeam() + ", Position: " + getPosition() + ", Name:" + getName()
				+ ", Age: " + getAge() + ", Salory: " + getSalory() + "]";
	}
}