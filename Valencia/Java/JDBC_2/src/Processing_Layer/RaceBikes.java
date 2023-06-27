package Processing_Layer;

public class RaceBikes {

	private String bikename;
	private String country_of_origin;
	private int cost;

	public RaceBikes(String bikename, String country_of_origin, int cost) {
		super();
		this.bikename = bikename;
		this.country_of_origin = country_of_origin;
		this.cost = cost;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getCountry_of_origin() {
		return country_of_origin;
	}

	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "\nRaceBikes [bikename=" + bikename + ", country_of_origin=" + country_of_origin + ", cost=" + cost + "]";
	}

}
