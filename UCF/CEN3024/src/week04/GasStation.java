package week04;

/**
 * @author Eric Willoughby
 * @date 2 February 2017 
 * @version 1.1
 * */

public class GasStation {

	private String m_name = "";
	private Location m_location;

	public GasStation() {
		this("Default Gas Station", new Location(1, 1));
	}

	/**
	 * @param name
	 *            Gas Stations name
	 * @param loc
	 *            location instance
	 */
	public GasStation(String name, Location loc) {
		this.m_name = name;
		this.m_location = loc;
	}

	/**
	 * @return return name of gas station
	 */
	public String getName() {
		return m_name;
	}

	/**
	 * @return location reference of gas stations
	 */
	public Location getLocation() {
		return this.m_location;
	}

	public void setLocation(Location location) {
		this.m_location = location;
	}

	public void setName(String name) {
		this.m_name = name;
	}

	@Override
	public String toString() {
		return String.format("GasStation %s - %s", m_name, m_location);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof GasStation) {
			GasStation rhs = (GasStation) obj;
			if (this.getLocation().equals(rhs.getLocation()) && this.getName().equals(rhs.getName())) {
				result = true;
			}
		}

		return result;
	}
}
