
public class BASEBALL extends ATHLETE {

	public BASEBALL(String name, int age, double salory, String team, String position) {
		super(name, age, salory, team, position);

	}

	public void doThis() {
		System.out.println("I hit balls with a big bat!... no homo");

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof BASEBALL)) {
			return false;
		}

		boolean result = false;
		
		if( this.getPosition() == ((BASEBALL)obj).getPosition()){
			result = true;
		}

		return result;
	}

	@Override
	public String toString() {
		return "BASEBALL [Team: " + getTeam() + ", Position: " + getPosition() + ", Name:" + getName() + ", Age: "
				+ getAge() + ", Salory: " + getSalory() + "]";
	}
}