public class Garage extends Building {

	private int cars;
	private String floorType;

	public Garage(int length, int width, int windows, int cars, String floor) {
		super(windows);

		this.cars = cars;
		super.setFloorSpace(calculateFloorSpace(length, width));
		this.floorType = floor;
		this.setWindows(windows);

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Garage)) {
			return false;
		}
		if (this.getFloorSpace() == ((Garage) obj).getFloorSpace()) {
			return true;
		}
		return false;
	}

	public int getCars() {
		return cars;
	}

	public void setCars(int cars) {
		this.cars = cars;
	}

	public String getFloor() {
		return floorType;
	}

	public void setFloor(String floor) {
		this.floorType = floor;
	}

	@Override
	public String toString() {
		String result;
		result = "\nType: Garage" + "\nCapacity: " + getCars() + " car(s)" + "\nFloor Type: " + getFloor() + "\n"
				+ super.toString();
		return result;
	}
}