
public class FOOTBALL extends ATHLETE {

	public FOOTBALL(String name, int age, double salory, String team, String position) {
		super(name, age, salory, team, position);

	}

	public void doThis() {
		System.out.println("I tackle people for fun!");

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof FOOTBALL)) {
			return false;
		}

		boolean result = false;

		if (this.getPosition() == ((FOOTBALL) obj).getPosition()) {
			result = true;
		}

		return result;
	}

	@Override
	public String toString() {
		return "FOOTBALL [Team: " + getTeam() + ", Position: " + getPosition() + ", Name:" + getName() + ", Age: "
				+ getAge() + ", Salory: " + getSalory() + "]";
	}

}