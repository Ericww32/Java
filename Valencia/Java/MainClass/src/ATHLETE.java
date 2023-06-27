
public class ATHLETE extends PERSON {
	private String team;
	private String position;

	public ATHLETE(String name, int age, double salory, String team, String position) {
		super(name, age, salory);
		this.team = team;
		this.position = position;
	}// end of constructor

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;

		return result;
	}
	
	public String toString() {

		String result;

		result = super.toString() + "Team: " + team + "\n" + "Position: " + position + "\n";

		return result;

	}// End toString

}// end of class
