abstract public class Building {
	private int floorLevel;
	private int window;

	abstract public void countFloor();

	public Building(int floorLevel, int window) {
		this.floorLevel = floorLevel;
		this.window = window;
	}

	public int getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(int floorLevel) {
		this.floorLevel = floorLevel;
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public float calculateFloorSpace(int length, int width) {
		float area = length * width;

		return area;
	}

	

}