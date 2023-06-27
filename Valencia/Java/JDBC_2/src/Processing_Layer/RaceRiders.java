package Processing_Layer;

public class RaceRiders {

	private String ridername;
	private String teamname;
	private String nationality;
	private int num_pro_wins;

	public RaceRiders(String ridername, String teamname, String nationality, int num_pro_wins) {
		super();
		this.ridername = ridername;
		this.teamname = teamname;
		this.nationality = nationality;
		this.num_pro_wins = num_pro_wins;
	}

	public String getRidername() {
		return ridername;
	}

	public void setRidername(String ridername) {
		this.ridername = ridername;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getNum_pro_wins() {
		return num_pro_wins;
	}

	public void setNum_pro_wins(int num_pro_wins) {
		this.num_pro_wins = num_pro_wins;
	}

	@Override
	public String toString() {
		return "\nRaceRiders [ridername=" + ridername + ", teamname=" + teamname + ", nationality=" + nationality
				+ ", num_pro_wins=" + num_pro_wins + "]";
	}

}
