import java.util.Arrays;

public class House extends Building {

	private Room[] room = new Room(0, 0, null, 0);

	public void countFloor() {

	}

	public House(int floorLevel, int window, Room[] room) {
		super(floorLevel, window);
		this.room = room;
	}

	@Override
	public String toString() {
		return "House [room=" + room + ", getFloorLevel()=" + getFloorLevel() + ", getWindow()="
				+ getWindow() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	public Room[] getRoom() {
		return room;
	}

	public void setRoom(Room[] room) {
		this.room = room;
	}

	public int calculateFloorSpace(Room[] room) {
		int total = 0;

		for (Room i : room) {
			total += i.getLength() * i.getWidth();
		}
		return total;
	}

}
