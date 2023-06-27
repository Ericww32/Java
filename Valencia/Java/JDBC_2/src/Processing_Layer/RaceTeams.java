package Processing_Layer;

public class RaceTeams {
	
	private String teamname;
    private String bikename; 
    private String registered_nation;
    private int num_riders;
    private String manager;
    
	public RaceTeams(String teamname, String bikename, String registered_nation, int num_riders, String manager) {
		super();
		this.teamname = teamname;
		this.bikename = bikename;
		this.registered_nation = registered_nation;
		this.num_riders = num_riders;
		this.manager = manager;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getRegistered_nation() {
		return registered_nation;
	}

	public void setRegistered_nation(String registered_nation) {
		this.registered_nation = registered_nation;
	}

	public int getNum_riders() {
		return num_riders;
	}

	public void setNum_riders(int num_riders) {
		this.num_riders = num_riders;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "\nRaceRiders [teamname=" + teamname + ", bikename=" + bikename + ", registered_nation="
				+ registered_nation + ", num_riders=" + num_riders + ", manager=" + manager + "]";
	}

}
