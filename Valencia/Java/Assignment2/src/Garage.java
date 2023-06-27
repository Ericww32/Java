import java.util.Arrays;

public class Garage extends Building {
	public void countFloor() {

	}

	public Garage(int floorLevel, int window) {
		super(floorLevel, window);
	}

	@Override
	public String toString() {
		return "Garage [getFloorLevel()=" + getFloorLevel() + ", getWindow()="
				+ getWindow() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
	
}
