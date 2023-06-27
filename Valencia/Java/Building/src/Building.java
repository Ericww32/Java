abstract public class Building {
	private int floors;
	private int windows;
	private int floorSpace;

	public Building(int floors, int windows) {
		setFloors(floors);
		setWindows(windows);
	}

	public Building(int windows) {
		setFloors(1);
		setWindows(windows);
	}

	abstract public boolean equals(Object obj);

	public int calculateFloorSpace(int length, int width) {
		return length * width;
	}

	public int calculateFloorSpace(Room[] room) {
		int total = 0;
		for (Room i : room) {
			total += i.getLength() * i.getWidth();
		}
		return total;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getFloorSpace() {
		return floorSpace;
	}

	public void setFloorSpace(int floorSpace) {
		this.floorSpace = floorSpace;
	}

	@Override
	public String toString() {
		String result;
		result = "Floor(s): " + getFloors() + "\nWindow(s): " + getWindows() + "\nFloor Space: " + getFloorSpace()
				+ " sqft";
		return result;
	}

}
