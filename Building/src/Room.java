public class Room implements Comparable<Room> {

	private int length;
	private int width;
	private String floorCovering;
	private int closet;

	public Room(int length, int width, String floorCovering, int closet) {
		this.length = length;
		this.width = width;
		this.floorCovering = floorCovering;
		this.closet = closet;
	}

	public int compareTo(Room obj) {
		int result;
		result = (getLength() * getWidth()) - (obj.getLength() * obj.getWidth());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Room)) {
			return false;
		}
		if (getLength() * getWidth() == ((Room) obj).getWidth() * ((Room) obj).getLength()) {
			return true;
		}
		return false;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getFloorCovering() {
		return floorCovering;
	}

	public void setFloorCovering(String floorCovering) {
		this.floorCovering = floorCovering;
	}

	public int getCloset() {
		return closet;
	}

	public void setCloset(int closet) {
		this.closet = closet;
	}

	public String toString() {
		return "Room has a length of: " + length + " its width is: " + width + " the floor is: " + floorCovering
				+ " it contains " + closet + " closet";
	}
}