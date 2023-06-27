package Processing_Layer;

public class RaceWinners {
	
	private String racename;
    private int raceyear;
    private String ridername;
    private int distance;
    private double winning_time;
    
	public RaceWinners(String racename, int raceyear, String ridername, int distance, double winning_time) {
		super();
		this.racename = racename;
		this.raceyear = raceyear;
		this.ridername = ridername;
		this.distance = distance;
		this.winning_time = winning_time;
	}

	public String getRacename() {
		return racename;
	}

	public void setRacename(String racename) {
		this.racename = racename;
	}

	public int getRaceyear() {
		return raceyear;
	}

	public void setRaceyear(int raceyear) {
		this.raceyear = raceyear;
	}

	public String getRidername() {
		return ridername;
	}

	public void setRidername(String ridername) {
		this.ridername = ridername;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getWinning_time() {
		return winning_time;
	}

	public void setWinning_time(double winning_time) {
		this.winning_time = winning_time;
	}

	@Override
	public String toString() {
		return "\nRaceWinners [racename=" + racename + ", raceyear=" + raceyear + ", ridername=" + ridername
				+ ", distance=" + distance + ", winning_time=" + winning_time + "]";
	} 

}
