package week04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Willoughby
 * @date 2 February 2017
 * @version 1.1
 */

public class BusinessRuleEngine {

	private List<GasStation> gSList;
	private int gridWidth = 8;
	private int gridHeight = 12;

	public BusinessRuleEngine() {
		gSList = new ArrayList<GasStation>();
	}

	public void addGasStation(GasStation gS) throws InvalidLocationException, IllegalArgumentException {
		//gs is Gas Station
		if (gS == null)
			throw new IllegalArgumentException();

		if (!isLocationValid(gS.getLocation()))
			throw new InvalidLocationException();

		gSList.add(gS);
	}

	public int calculateDistanceBetweenLocations(Location one, Location two) {
		return (Math.abs(one.getAvenue() - two.getAvenue()) + Math.abs(one.getStreet() - two.getStreet()));
	}

	public GasStation findNearestGasStation(Location location)
			throws IllegalArgumentException, InvalidLocationException {

		if (!isLocationValid(location))
			throw new InvalidLocationException();

		GasStation nearestGS = null; // nearest Gas Station
		int disCloseGS = Integer.MAX_VALUE;

		for (GasStation curGS : gSList) { //Current Gas Station

			int distanceGS = calculateDistanceBetweenLocations(location,
					curGS.getLocation());

			if (distanceGS < disCloseGS) {
				nearestGS = curGS;
				disCloseGS = distanceGS;
			}
		}

		return nearestGS;
	}

	private boolean isLocationValid(Location location) {
		if ((location.getStreet() < -6 || location.getStreet() > 6)  || (location.getAvenue() < -4 || location.getAvenue() > 4)) {
			return false;
		}
		return true;
	}

	public int getGridWidth() {
		return gridWidth;
	}

	public int getGridHeight() {
		return gridHeight;
	}

}
