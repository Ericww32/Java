package week04;

/**
 * @author Eric Willoughby
 * @date 2 February 2017 
 * @version 1.1
 * */

public class Location {
	private int st;
	private int ave;

	public Location() {
	}

	public Location(int st, int ave) {
		this.st = st;
		this.ave = ave;
	}

	public int getStreet() {
		return st;
	}

	public int getAvenue() {
		return ave;
	}

	private String getIntOrdinal(int iNT) {
		switch (Math.abs(iNT)) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";
		default:
			return "th";
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("intersection of ");

		if (st == 0) {
			sb.append("Main St");
		} else {
			sb.append((st < 0) ? "East " : "");
			sb.append((st > 0) ? "West " : "");
			sb.append(Math.abs(st));
			sb.append(getIntOrdinal(st));
			sb.append(" St");
		}

		sb.append(" and ");

		if (ave == 0) {
			sb.append("North Avenue");
		} else {
			sb.append((ave < 0) ? "South " : "");
			sb.append((ave > 0) ? "North " : "");
			sb.append(Math.abs(ave));
			sb.append(getIntOrdinal(ave));
			sb.append(" Ave");
		}

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Location) {
			return (((Location) obj).getAvenue() == this.ave && ((Location) obj).getStreet() == st);
		} else {
			return false;
		}
	}

}
