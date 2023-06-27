import java.util.*;

public class House extends Building implements MLSListable {
	private int bathrooms;
	private int numRooms;
	private int closets;
	private int pricePerSquare = 120;
	private int id = 0;
	ArrayList<String> floorCovering = new ArrayList<String>();

	public House(Room[] room, int floors, int windows, int bathrooms, int id) {
		super(floors, windows);
		int numRooms = 0;
		int closets = 0;
		this.id = id;
		for (Room i : room) {
			++numRooms;
			closets += i.getCloset();
			floorCovering.add(i.getFloorCovering());
		}
		setClosets(closets);
		setBathrooms(bathrooms);
		setNumRooms(numRooms);
		setFloorSpace(calculateFloorSpace(room));
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof House)) {
			return false;
		}
		if (this.getFloorSpace() == ((House) obj).getFloorSpace()) {
			return true;
		}
		return false;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public int getClosets() {
		return closets;
	}

	public void setClosets(int closets) {
		this.closets = closets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<String> getFloorCovering() {
		return floorCovering;
	}

	public void setFloorCovering(ArrayList<String> floorCovering) {
		this.floorCovering = floorCovering;
	}

	public int getPricePerSquare() {
		return pricePerSquare;
	}

	@Override
	public String getMLSListing() {
		String info = "\nCost: $" + getFloorSpace() * pricePerSquare + "\nRooms: " + getNumRooms() + "\nBathrooms: "
				+ getBathrooms() + "\nFloor Space: " + getFloorSpace() + " Unit(s)";
		return info;
	}

	@Override
	public String toString() {
		String string;
		string = "\nType: House" + "\nID number:" + getId() + "\nRoom(s): " + getNumRooms() + "\nCloset(s): "
				+ getClosets() + "\nBathroom(s): " + getBathrooms() + "\nFloor Covering: " + getFloorCovering() + "\n"
				+ super.toString();
		return string;
	}
}