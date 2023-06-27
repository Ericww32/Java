
public class SOCCER extends ATHLETE{

	public SOCCER(String name, int age, double salory, String team, String position) {
		super(name, age, salory, team, position);
		
		
	}
	public void doThis(){
		System.out.println("I'm not really a person, more like a ghost cause I do not exist....boo!");
		
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof SOCCER)) {
			return false;
		}

		boolean result = false;

		if (this.getPosition() == ((SOCCER) obj).getPosition()) {
			result = true;
		}

		return result;
	}
	@Override
	public String toString() {
		return "SOCCER [Team: " + getTeam() + ", Position: " + getPosition() + ", Name:" + getName()
				+ ", Age: " + getAge() + ", Salory: " + getSalory() + "]";
	}
}