
public class HOCKEY extends ATHLETE{

	public HOCKEY(String name, int age, double salory, String team, String position) {
		super(name, age, salory, team, position);
		
	
	}
	public void doThis(){
		System.out.println("I start fights on ice!");
		
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof HOCKEY)) {
			return false;
		}

		boolean result = false;

		if (this.getPosition() == ((HOCKEY) obj).getPosition()) {
			result = true;
		}

		return result;
	}
	
	@Override
	public String toString() {
		return "HOCKEY [Team: " + getTeam() + ", Position: " + getPosition() + ", Name:" + getName()
				+ ", Age: " + getAge() + ", Salory: " + getSalory() + "]";
	}
}